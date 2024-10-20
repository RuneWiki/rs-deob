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
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.t")
    public static boolean field265 = true;

    @ObfuscatedName("client.p")
    public static int field266 = 1;

    @ObfuscatedName("client.g")
    public static int field267 = 0;

    @ObfuscatedName("client.f")
    public static int field268 = 0;

    @ObfuscatedName("client.r")
    public static boolean field487 = false;

    @ObfuscatedName("client.w")
    public static class112[] field282 = new class112[4];

    @ObfuscatedName("client.u")
    public static boolean field272 = false;

    @ObfuscatedName("client.n")
    public static int field347 = 0;

    @ObfuscatedName("client.o")
    public static int field275 = 0;

    @ObfuscatedName("client.c")
    public static boolean field276 = true;

    @ObfuscatedName("client.i")
    public static int field326 = 0;

    @ObfuscatedName("client.v")
    public static long field278 = -1L;

    @ObfuscatedName("client.e")
    public static int field279 = -1;

    @ObfuscatedName("client.j")
    public static int field280 = -1;

    @ObfuscatedName("client.ae")
    public static int field472 = -1;

    @ObfuscatedName("client.ah")
    public static boolean field476 = true;

    @ObfuscatedName("client.am")
    public static boolean field283 = false;

    @ObfuscatedName("client.aa")
    public static int field291 = 0;

    @ObfuscatedName("client.ax")
    public static int field311 = 0;

    @ObfuscatedName("client.ac")
    public static int field286 = 0;

    @ObfuscatedName("client.ar")
    public static int field418 = 0;

    @ObfuscatedName("client.an")
    public static int field288 = 0;

    @ObfuscatedName("client.ag")
    public static int field434 = 0;

    @ObfuscatedName("client.ab")
    public static int field551 = 0;

    @ObfuscatedName("client.ao")
    public static int field287 = 0;

    @ObfuscatedName("client.av")
    public static int field351 = 0;

    @ObfuscatedName("client.ad")
    public static class22 field293 = class22.field565;

    @ObfuscatedName("client.aj")
    public static class22 field294 = class22.field565;

    @ObfuscatedName("client.az")
    public static int field296 = 0;

    @ObfuscatedName("client.al")
    public static int field297 = 0;

    @ObfuscatedName("client.aw")
    public static int field510 = 0;

    @ObfuscatedName("client.bs")
    public static int field264 = 0;

    @ObfuscatedName("client.bn")
    public static int field421 = 0;

    @ObfuscatedName("client.bc")
    public static int field353 = 0;

    @ObfuscatedName("client.bt")
    public static int field269 = 0;

    @ObfuscatedName("client.bi")
    public static int field305 = 0;

    @ObfuscatedName("client.cg")
    public static class37[] field306 = new class37[32768];

    @ObfuscatedName("client.cp")
    public static int field310 = 0;

    @ObfuscatedName("client.ca")
    public static int[] field308 = new int[32768];

    @ObfuscatedName("client.ct")
    public static int field309 = 0;

    @ObfuscatedName("client.cb")
    public static int[] field419 = new int[250];

    @ObfuscatedName("client.cw")
    public static class126 field301 = new class126(5000);

    @ObfuscatedName("client.cl")
    public static class126 field312 = new class126(5000);

    @ObfuscatedName("client.ce")
    public static class126 field313 = new class126(15000);

    @ObfuscatedName("client.cy")
    public static int field314 = 0;

    @ObfuscatedName("client.cc")
    public static int field315 = 0;

    @ObfuscatedName("client.cr")
    public static int field273 = 0;

    @ObfuscatedName("client.cq")
    public static int field317 = 0;

    @ObfuscatedName("client.cf")
    public static int field346 = 0;

    @ObfuscatedName("client.cv")
    public static int field319 = 0;

    @ObfuscatedName("client.ck")
    public static int field320 = 0;

    @ObfuscatedName("client.cd")
    public static int field549 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field534 = false;

    @ObfuscatedName("client.de")
    public static int field323 = 0;

    @ObfuscatedName("client.ds")
    public static int field324 = 1;

    @ObfuscatedName("client.dw")
    public static int field325 = 0;

    @ObfuscatedName("client.dk")
    public static int field341 = 1;

    @ObfuscatedName("client.dx")
    public static int field330 = 0;

    @ObfuscatedName("client.dq")
    public static boolean field429 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field331 = new int[4][13][13];

    @ObfuscatedName("client.dy")
    public static final int[] field332 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field486 = 0;

    @ObfuscatedName("client.di")
    public static int field432 = 2;

    @ObfuscatedName("client.dg")
    public static int field448 = 0;

    @ObfuscatedName("client.dj")
    public static int field410 = 2;

    @ObfuscatedName("client.df")
    public static int field338 = 0;

    @ObfuscatedName("client.ev")
    public static int field339 = 1;

    @ObfuscatedName("client.ej")
    public static int field340 = 0;

    @ObfuscatedName("client.er")
    public static int field393 = 0;

    @ObfuscatedName("client.eb")
    public static int field342 = 2;

    @ObfuscatedName("client.ei")
    public static int field343 = 0;

    @ObfuscatedName("client.el")
    public static int field344 = 1;

    @ObfuscatedName("client.ew")
    public static int field345 = 0;

    @ObfuscatedName("client.es")
    public static int field298 = 0;

    @ObfuscatedName("client.ep")
    public static int field348 = 2301979;

    @ObfuscatedName("client.em")
    public static int field398 = 5063219;

    @ObfuscatedName("client.ee")
    public static int field350 = 3353893;

    @ObfuscatedName("client.ef")
    public static int field370 = 7759444;

    @ObfuscatedName("client.ez")
    public static boolean field383 = false;

    @ObfuscatedName("client.et")
    public static int field424 = 0;

    @ObfuscatedName("client.fn")
    public static int field354 = 128;

    @ObfuscatedName("client.fe")
    public static int field355 = 0;

    @ObfuscatedName("client.fl")
    public static int field423 = 0;

    @ObfuscatedName("client.fm")
    public static int field290 = 0;

    @ObfuscatedName("client.fi")
    public static int field358 = 0;

    @ObfuscatedName("client.fz")
    public static int field359 = 0;

    @ObfuscatedName("client.fk")
    public static int field360 = 50;

    @ObfuscatedName("client.fu")
    public static int field361 = 0;

    @ObfuscatedName("client.ff")
    public static boolean field362 = false;

    @ObfuscatedName("client.fv")
    public static int field491 = 0;

    @ObfuscatedName("client.fq")
    public static int field364 = 0;

    @ObfuscatedName("client.fb")
    public static int field365 = 50;

    @ObfuscatedName("client.fo")
    public static int[] field366 = new int[field365];

    @ObfuscatedName("client.fw")
    public static int[] field367 = new int[field365];

    @ObfuscatedName("client.fx")
    public static int[] field368 = new int[field365];

    @ObfuscatedName("client.fp")
    public static int[] field369 = new int[field365];

    @ObfuscatedName("client.fd")
    public static int[] field414 = new int[field365];

    @ObfuscatedName("client.fa")
    public static int[] field371 = new int[field365];

    @ObfuscatedName("client.fh")
    public static int[] field372 = new int[field365];

    @ObfuscatedName("client.gv")
    public static String[] field352 = new String[field365];

    @ObfuscatedName("client.gr")
    public static int[][] field374 = new int[104][104];

    @ObfuscatedName("client.gg")
    public static int field375 = 0;

    @ObfuscatedName("client.gt")
    public static int field376 = -1;

    @ObfuscatedName("client.ga")
    public static int field377 = -1;

    @ObfuscatedName("client.gu")
    public static int field455 = 0;

    @ObfuscatedName("client.gh")
    public static int field379 = 0;

    @ObfuscatedName("client.gf")
    public static int field540 = 0;

    @ObfuscatedName("client.gd")
    public static int field469 = 0;

    @ObfuscatedName("client.gn")
    public static int field335 = 0;

    @ObfuscatedName("client.gq")
    public static int field318 = 0;

    @ObfuscatedName("client.gm")
    public static int field384 = 0;

    @ObfuscatedName("client.gi")
    public static int field385 = 0;

    @ObfuscatedName("client.gp")
    public static int field386 = 0;

    @ObfuscatedName("client.gx")
    public static int field387 = 0;

    @ObfuscatedName("client.gs")
    public static boolean field357 = false;

    @ObfuscatedName("client.gj")
    public static int field389 = 0;

    @ObfuscatedName("client.gb")
    public static int field427 = 0;

    @ObfuscatedName("client.gy")
    public static class3[] field391 = new class3[2048];

    @ObfuscatedName("client.go")
    public static int field382 = -1;

    @ObfuscatedName("client.gc")
    public static int field388 = 0;

    @ObfuscatedName("client.hp")
    public static int field394 = 0;

    @ObfuscatedName("client.he")
    public static int[] field395 = new int[1000];

    @ObfuscatedName("client.hl")
    public static final int[] field396 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hi")
    public static String[] field397 = new String[8];

    @ObfuscatedName("client.ha")
    public static boolean[] field514 = new boolean[8];

    @ObfuscatedName("client.hj")
    public static int[] field399 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hy")
    public static int field400 = -1;

    @ObfuscatedName("client.hk")
    public static class203[][][] field401 = new class203[4][104][104];

    @ObfuscatedName("client.hf")
    public static class203 field402 = new class203();

    @ObfuscatedName("client.hb")
    public static class203 field403 = new class203();

    @ObfuscatedName("client.hu")
    public static class203 field404 = new class203();

    @ObfuscatedName("client.hw")
    public static int[] field373 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field292 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field407 = new int[25];

    @ObfuscatedName("client.hr")
    public static int field408 = 0;

    @ObfuscatedName("client.hv")
    public static boolean field409 = false;

    @ObfuscatedName("client.ho")
    public static int field411 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field329 = new int[500];

    @ObfuscatedName("client.hx")
    public static int[] field413 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field307 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field415 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field416 = new String[500];

    @ObfuscatedName("client.io")
    public static String[] field503 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field428 = -1;

    @ObfuscatedName("client.il")
    public static int field406 = -1;

    @ObfuscatedName("client.ir")
    public static int field420 = 0;

    @ObfuscatedName("client.ik")
    public static int field449 = 50;

    @ObfuscatedName("client.ip")
    public static int field422 = 0;

    @ObfuscatedName("client.iv")
    public static String field417 = null;

    @ObfuscatedName("client.im")
    public static boolean field271 = false;

    @ObfuscatedName("client.if")
    public static int field270 = -1;

    @ObfuscatedName("client.iw")
    public static int field426 = -1;

    @ObfuscatedName("client.ii")
    public static String field334 = null;

    @ObfuscatedName("client.ic")
    public static String field498 = null;

    @ObfuscatedName("client.is")
    public static int field513 = -1;

    @ObfuscatedName("client.it")
    public static class200 field430 = new class200(8);

    @ObfuscatedName("client.ig")
    public static int field431 = 0;

    @ObfuscatedName("client.jn")
    public static int field459 = 0;

    @ObfuscatedName("client.jl")
    public static class177 field433 = null;

    @ObfuscatedName("client.jm")
    public static int field289 = 0;

    @ObfuscatedName("client.jf")
    public static int field435 = 0;

    @ObfuscatedName("client.jg")
    public static int field436 = 0;

    @ObfuscatedName("client.jx")
    public static int field437 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field438 = false;

    @ObfuscatedName("client.jb")
    public static boolean field439 = false;

    @ObfuscatedName("client.ji")
    public static boolean field440 = false;

    @ObfuscatedName("client.je")
    public static class177 field441 = null;

    @ObfuscatedName("client.jt")
    public static class177 field442 = null;

    @ObfuscatedName("client.jr")
    public static class177 field392 = null;

    @ObfuscatedName("client.jy")
    public static int field281 = 0;

    @ObfuscatedName("client.jk")
    public static int field445 = 0;

    @ObfuscatedName("client.jd")
    public static class177 field284 = null;

    @ObfuscatedName("client.ja")
    public static boolean field447 = false;

    @ObfuscatedName("client.jp")
    public static int field405 = -1;

    @ObfuscatedName("client.jo")
    public static int field337 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field450 = false;

    @ObfuscatedName("client.ju")
    public static int field451 = -1;

    @ObfuscatedName("client.jj")
    public static int field475 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field474 = false;

    @ObfuscatedName("client.kb")
    public static int field454 = 1;

    @ObfuscatedName("client.km")
    public static int[] field473 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field456 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field457 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field458 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field322 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field460 = 0;

    @ObfuscatedName("client.kn")
    public static int field461 = 0;

    @ObfuscatedName("client.kz")
    public static int field462 = 0;

    @ObfuscatedName("client.ku")
    public static int field463 = 0;

    @ObfuscatedName("client.kv")
    public static int field285 = 0;

    @ObfuscatedName("client.ky")
    public static int field465 = 0;

    @ObfuscatedName("client.kc")
    public static int field333 = 0;

    @ObfuscatedName("client.kx")
    public static int field336 = 0;

    @ObfuscatedName("client.kk")
    public static class203 field468 = new class203();

    @ObfuscatedName("client.kl")
    public static class203 field302 = new class203();

    @ObfuscatedName("client.ka")
    public static class203 field470 = new class203();

    @ObfuscatedName("client.kw")
    public static class200 field471 = new class200(512);

    @ObfuscatedName("client.kf")
    public static int field299 = 0;

    @ObfuscatedName("client.kp")
    public static int field506 = -2;

    @ObfuscatedName("client.ki")
    public static boolean[] field380 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field453 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field321 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field477 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field478 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field479 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field480 = new int[100];

    @ObfuscatedName("client.lk")
    public static int field481 = 0;

    @ObfuscatedName("client.le")
    public static long field482 = 0L;

    @ObfuscatedName("client.lj")
    public static boolean field381 = true;

    @ObfuscatedName("client.lx")
    public static int field484 = 765;

    @ObfuscatedName("client.ls")
    public static int field485 = 503;

    @ObfuscatedName("client.lg")
    public static int[] field443 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lt")
    public static int field538 = 0;

    @ObfuscatedName("client.lu")
    public static int field488 = 0;

    @ObfuscatedName("client.la")
    public static String field489 = "";

    @ObfuscatedName("client.lh")
    public static long[] field490 = new long[100];

    @ObfuscatedName("client.lm")
    public static int field277 = 0;

    @ObfuscatedName("client.ln")
    public static int field492 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field493 = new int[128];

    @ObfuscatedName("client.mo")
    public static int[] field494 = new int[128];

    @ObfuscatedName("client.mj")
    public static long field495 = -1L;

    @ObfuscatedName("client.mm")
    public static String field496 = null;

    @ObfuscatedName("client.mr")
    public static String field497 = null;

    @ObfuscatedName("client.mp")
    public static int field452 = -1;

    @ObfuscatedName("client.mi")
    public static int field499 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field500 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field501 = new int[1000];

    @ObfuscatedName("client.mk")
    public static class82[] field502 = new class82[1000];

    @ObfuscatedName("client.mg")
    public static int field535 = 0;

    @ObfuscatedName("client.mn")
    public static int field504 = 0;

    @ObfuscatedName("client.mb")
    public static int field327 = 0;

    @ObfuscatedName("client.md")
    public static int field425 = 255;

    @ObfuscatedName("client.mq")
    public static int field507 = -1;

    @ObfuscatedName("client.ms")
    public static boolean field508 = false;

    @ObfuscatedName("client.nu")
    public static int field509 = 127;

    @ObfuscatedName("client.nb")
    public static int field304 = 127;

    @ObfuscatedName("client.nt")
    public static int field511 = 0;

    @ObfuscatedName("client.np")
    public static int[] field512 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field316 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field483 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field515 = new int[50];

    @ObfuscatedName("client.nc")
    public static class62[] field516 = new class62[50];

    @ObfuscatedName("client.nm")
    public static boolean field517 = false;

    @ObfuscatedName("client.nn")
    public static boolean[] field518 = new boolean[5];

    @ObfuscatedName("client.ob")
    public static int[] field527 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field520 = new int[5];

    @ObfuscatedName("client.or")
    public static int[] field356 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field522 = new int[5];

    @ObfuscatedName("client.oc")
    public static short field523 = 256;

    @ObfuscatedName("client.ox")
    public static short field524 = 205;

    @ObfuscatedName("client.oa")
    public static short field525 = 256;

    @ObfuscatedName("client.os")
    public static short field526 = 320;

    @ObfuscatedName("client.om")
    public static short field303 = 1;

    @ObfuscatedName("client.on")
    public static short field521 = 32767;

    @ObfuscatedName("client.of")
    public static short field529 = 1;

    @ObfuscatedName("client.oy")
    public static short field530 = 32767;

    @ObfuscatedName("client.ot")
    public static int field531 = 0;

    @ObfuscatedName("client.od")
    public static int field532 = 0;

    @ObfuscatedName("client.ol")
    public static int field533 = 0;

    @ObfuscatedName("client.ou")
    public static int field466 = 0;

    @ObfuscatedName("client.oz")
    public static int field505 = 0;

    @ObfuscatedName("client.oo")
    public static int field536 = 0;

    @ObfuscatedName("client.op")
    public static int field537 = 0;

    @ObfuscatedName("client.oq")
    public static class18[] field464 = new class18[400];

    @ObfuscatedName("client.ov")
    public static class199 field539 = new class199();

    @ObfuscatedName("client.oj")
    public static int field378 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field541 = new class8[400];

    @ObfuscatedName("client.ow")
    public static class183 field542 = new class183();

    @ObfuscatedName("client.pw")
    public static int field543 = -1;

    @ObfuscatedName("client.pv")
    public static int field544 = -1;

    @ObfuscatedName("client.pj")
    public static class224[] field545 = new class224[8];

    @ObfuscatedName("client.pe")
    public static long field546 = -1L;

    @ObfuscatedName("client.pz")
    public static long field547 = -1L;

    @ObfuscatedName("client.ps")
    public static final class11 field548 = new class11();

    @ObfuscatedName("client.pm")
    public static int[] field446 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field550 = new int[50];

    @ObfuscatedName("client.t(I)V")
    public final void method260() {
    }

    public final void init() {
        if (!this.method2943()) {
            return;
        }
        class194[] var1 = new class194[] { class194.field3106, class194.field3115, class194.field3109, class194.field3114, class194.field3107, class194.field3116, class194.field3118, class194.field3113, class194.field3111, class194.field3112, class194.field3108, class194.field3117, class194.field3105, class194.field3110, class194.field3119 };
        class194[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class194 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3120);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3120)) {
                    case 2:
                        field347 = Integer.parseInt(var5);
                        break;
                    case 3:
                        field266 = Integer.parseInt(var5);
                        break;
                    case 4:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                        }
                        break;
                    case 5:
                        field267 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field643 = Integer.parseInt(var5);
                        break;
                    case 7:
                        int var7 = Integer.parseInt(var5);
                        class157[] var8 = new class157[] { class157.field2324, class157.field2320, class157.field2318, class157.field2321 };
                        class157[] var9 = var8;
                        int var10 = 0;
                        class157 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class157 var11 = var9[var10];
                            if (var11.field2322 == var7) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field2248 = var12;
                        break;
                    case 8:
                        field268 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field274 = var5;
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                            field487 = true;
                        } else {
                            field487 = false;
                        }
                        break;
                    case 11:
                        Statics.field1396 = Integer.parseInt(var5);
                        break;
                    case 12:
                        class158[] var6 = new class158[] { class158.field2333, class158.field2330, class158.field2328, class158.field2337, class158.field2329, class158.field2332 };
                        Statics.field467 = (class158) class113.method1576(var6, Integer.parseInt(var5));
                        if (Statics.field467 == class158.field2330) {
                            Statics.field519 = class216.field3191;
                        } else {
                            Statics.field519 = class216.field3186;
                        }
                    case 13:
                    case 14:
                    default:
                        break;
                    case 15:
                        Statics.field2948 = var5;
                }
            }
        }
        class90.field1522 = false;
        field272 = false;
        Statics.field797 = this.getCodeBase().getHost();
        String var13 = Statics.field2248.field2317;
        byte var14 = 0;
        try {
            class153.method527("oldschool", var13, var14, 16);
        } catch (Exception var16) {
            class152.method2846((String) null, var16);
        }
        Statics.field390 = this;
        this.method2879(765, 503, 123);
    }

    @ObfuscatedName("client.p(B)V")
    public final void method307() {
        Statics.field559 = field268 == 0 ? 43594 : field266 + 40000;
        Statics.field2319 = field268 == 0 ? 443 : field266 + 50000;
        Statics.field1727 = Statics.field559;
        Statics.field2122 = class178.field2939;
        Statics.field2965 = class178.field2941;
        Statics.field2969 = class178.field2936;
        Statics.field1943 = class178.field2937;
        if (Statics.field2138.toLowerCase().indexOf("microsoft") == -1) {
            class141.field2157[44] = 71;
            class141.field2157[45] = 26;
            class141.field2157[46] = 72;
            class141.field2157[47] = 73;
            class141.field2157[59] = 57;
            class141.field2157[61] = 27;
            class141.field2157[91] = 42;
            class141.field2157[92] = 74;
            class141.field2157[93] = 43;
            class141.field2157[192] = 28;
            class141.field2157[222] = 58;
            class141.field2157[520] = 59;
        } else {
            class141.field2157[186] = 57;
            class141.field2157[187] = 27;
            class141.field2157[188] = 71;
            class141.field2157[189] = 26;
            class141.field2157[190] = 72;
            class141.field2157[191] = 73;
            class141.field2157[192] = 58;
            class141.field2157[219] = 42;
            class141.field2157[220] = 74;
            class141.field2157[221] = 43;
            class141.field2157[222] = 59;
            class141.field2157[223] = 28;
        }
        class141.method767(Statics.field1812);
        class144.method2849(Statics.field1812);
        class149 var1;
        try {
            var1 = new class149();
        } catch (Throwable var5) {
            var1 = null;
        }
        Statics.field2713 = var1;
        if (Statics.field2713 != null) {
            Statics.field2713.method2707(Statics.field1812);
        }
        Statics.field160 = new class138(255, class153.field2280, class153.field2279, 500000);
        Statics.field985 = Statics.method2159();
        Statics.field230 = this.getToolkit().getSystemClipboard();
        String var4 = Statics.field2014;
        class142.field2173 = this;
        class142.field2177 = var4;
        if (field268 != 0) {
            field283 = true;
        }
        method573(Statics.field985.field126);
    }

    @ObfuscatedName("client.g(B)V")
    public final void method226() {
        field326++;
        this.method229();
        class174.method2983();
        class187.method2071();
        method159();
        class141.method1052();
        class144 var1 = class144.field2196;
        synchronized (class144.field2196) {
            class144.field2185 = class144.field2183;
            class144.field2193 = class144.field2188;
            class144.field2190 = class144.field2187;
            class144.field2199 = class144.field2191;
            class144.field2189 = class144.field2192;
            class144.field2197 = class144.field2184;
            class144.field2198 = class144.field2194;
            class144.field2191 = 0;
        }
        if (Statics.field2713 != null) {
            int var3 = Statics.field2713.method2712();
            field336 = var3;
        }
        if (field275 == 0) {
            method2283();
            class148.method2075();
        } else if (field275 == 5) {
            class34.method535(this);
            method2283();
            class148.method2075();
        } else if (field275 == 10 || field275 == 11) {
            class34.method535(this);
        } else if (field275 == 20) {
            class34.method535(this);
            method562();
        } else if (field275 == 25) {
            method760();
        }
        if (field275 == 30) {
            if (field291 > 1) {
                field291--;
            }
            if (field549 > 0) {
                field549--;
            }
            if (field534) {
                field534 = false;
                if (field549 > 0) {
                    method2969();
                } else {
                    method2278(40);
                    Statics.field1395 = Statics.field696;
                    Statics.field696 = null;
                }
            } else {
                if (!field409) {
                    field416[0] = class161.field2593;
                    field503[0] = "";
                    field307[0] = 1006;
                    field411 = 1;
                }
                for (int var4 = 0; var4 < 100 && method43(); var4++) {
                }
                if (field275 == 30) {
                    while (true) {
                        class214 var5 = (class214) class215.field3182.method3630();
                        boolean var6;
                        if (var5 == null) {
                            var6 = false;
                        } else {
                            var6 = true;
                        }
                        if (!var6) {
                            Object var8 = Statics.field245.field186;
                            synchronized (Statics.field245.field186) {
                                if (!field265) {
                                    Statics.field245.field188 = 0;
                                } else if (class144.field2199 != 0 || Statics.field245.field188 >= 40) {
                                    field301.method2630(155);
                                    field301.method2349(0);
                                    int var9 = field301.field2028;
                                    int var10 = 0;
                                    for (int var11 = 0; var11 < Statics.field245.field188 && field301.field2028 - var9 < 240; var11++) {
                                        var10++;
                                        int var12 = Statics.field245.field189[var11];
                                        if (var12 < 0) {
                                            var12 = 0;
                                        } else if (var12 > 502) {
                                            var12 = 502;
                                        }
                                        int var13 = Statics.field245.field187[var11];
                                        if (var13 < 0) {
                                            var13 = 0;
                                        } else if (var13 > 764) {
                                            var13 = 764;
                                        }
                                        int var14 = var12 * 765 + var13;
                                        if (Statics.field245.field189[var11] == -1 && Statics.field245.field187[var11] == -1) {
                                            var13 = -1;
                                            var12 = -1;
                                            var14 = 524287;
                                        }
                                        if (field279 != var13 || field280 != var12) {
                                            int var15 = var13 - field279;
                                            field279 = var13;
                                            int var16 = var12 - field280;
                                            field280 = var12;
                                            if (field472 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                                                var15 += 32;
                                                var16 += 32;
                                                field301.method2350((field472 << 12) + (var15 << 6) + var16);
                                                field472 = 0;
                                            } else if (field472 < 8) {
                                                field301.method2405((field472 << 19) + 8388608 + var14);
                                                field472 = 0;
                                            } else {
                                                field301.method2524((field472 << 19) + -1073741824 + var14);
                                                field472 = 0;
                                            }
                                        } else if (field472 < 2047) {
                                            field472++;
                                        }
                                    }
                                    field301.method2360(field301.field2028 - var9);
                                    if (var10 >= Statics.field245.field188) {
                                        Statics.field245.field188 = 0;
                                    } else {
                                        Statics.field245.field188 -= var10;
                                        for (int var17 = 0; var17 < Statics.field245.field188; var17++) {
                                            Statics.field245.field187[var17] = Statics.field245.field187[var10 + var17];
                                            Statics.field245.field189[var17] = Statics.field245.field189[var10 + var17];
                                        }
                                    }
                                }
                            }
                            if (class144.field2199 == 1 || !Statics.field246 && class144.field2199 == 4 || class144.field2199 == 2) {
                                long var19 = (class144.field2198 - field278) / 50L;
                                if (var19 > 4095L) {
                                    var19 = 4095L;
                                }
                                field278 = class144.field2198;
                                int var21 = class144.field2197;
                                if (var21 < 0) {
                                    var21 = 0;
                                } else if (var21 > Statics.field2144) {
                                    var21 = Statics.field2144;
                                }
                                int var22 = class144.field2189;
                                if (var22 < 0) {
                                    var22 = 0;
                                } else if (var22 > Statics.field1070) {
                                    var22 = Statics.field1070;
                                }
                                int var23 = (int) var19;
                                field301.method2630(77);
                                field301.method2350((var23 << 1) + (class144.field2199 == 2 ? 1 : 0));
                                field301.method2350(var22);
                                field301.method2350(var21);
                            }
                            if (class141.field2165 > 0) {
                                field301.method2630(227);
                                field301.method2350(0);
                                int var24 = field301.field2028;
                                long var25 = class119.method2280();
                                for (int var27 = 0; var27 < class141.field2165; var27++) {
                                    long var28 = var25 - field495;
                                    if (var28 > 16777215L) {
                                        var28 = 16777215L;
                                    }
                                    field495 = var25;
                                    field301.method2403((int) var28);
                                    field301.method2348(class141.field2169[var27]);
                                }
                                field301.method2514(field301.field2028 - var24);
                            }
                            if (field361 > 0) {
                                field361--;
                            }
                            if (class141.field2158[96] || class141.field2158[97] || class141.field2158[98] || class141.field2158[99]) {
                                field362 = true;
                            }
                            if (field362 && field361 <= 0) {
                                field361 = 20;
                                field362 = false;
                                field301.method2630(159);
                                field301.method2395(field354);
                                field301.method2396(field355);
                            }
                            if (Statics.field1476 && !field476) {
                                field476 = true;
                                field301.method2630(52);
                                field301.method2349(1);
                            }
                            if (!Statics.field1476 && field476) {
                                field476 = false;
                                field301.method2630(52);
                                field301.method2349(0);
                            }
                            if (Statics.field1239 != field452) {
                                field452 = Statics.field1239;
                                int var30 = Statics.field1239;
                                int[] var31 = Statics.field167.field1449;
                                int var32 = var31.length;
                                for (int var33 = 0; var33 < var32; var33++) {
                                    var31[var33] = 0;
                                }
                                int var34 = 1;
                                while (true) {
                                    if (var34 >= 103) {
                                        int var37 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var38 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field167.method1622();
                                        for (int var39 = 1; var39 < 103; var39++) {
                                            for (int var40 = 1; var40 < 103; var40++) {
                                                if ((class6.field80[var30][var40][var39] & 0x18) == 0) {
                                                    method2068(var30, var40, var39, var37, var38);
                                                }
                                                if (var30 < 3 && (class6.field80[var30 + 1][var40][var39] & 0x8) != 0) {
                                                    method2068(var30 + 1, var40, var39, var37, var38);
                                                }
                                            }
                                        }
                                        field499 = 0;
                                        for (int var41 = 0; var41 < 104; var41++) {
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                int var43 = Statics.field1991.method1848(Statics.field1239, var41, var42);
                                                if (var43 != 0) {
                                                    int var44 = var43 >> 14 & 0x7FFF;
                                                    int var45 = class43.method768(var44).field937;
                                                    if (var45 >= 0) {
                                                        int var46 = var41;
                                                        int var47 = var42;
                                                        if (var45 != 22 && var45 != 29 && var45 != 34 && var45 != 36 && var45 != 46 && var45 != 47 && var45 != 48) {
                                                            int[][] var48 = field282[Statics.field1239].field1932;
                                                            for (int var49 = 0; var49 < 10; var49++) {
                                                                int var50 = (int) (Math.random() * 4.0D);
                                                                if (var50 == 0 && var46 > 0 && var46 > var41 - 3 && (var48[var46 - 1][var47] & 0x1240108) == 0) {
                                                                    var46--;
                                                                }
                                                                if (var50 == 1 && var46 < 103 && var46 < var41 + 3 && (var48[var46 + 1][var47] & 0x1240180) == 0) {
                                                                    var46++;
                                                                }
                                                                if (var50 == 2 && var47 > 0 && var47 > var42 - 3 && (var48[var46][var47 - 1] & 0x1240102) == 0) {
                                                                    var47--;
                                                                }
                                                                if (var50 == 3 && var47 < 103 && var47 < var42 + 3 && (var48[var46][var47 + 1] & 0x1240120) == 0) {
                                                                    var47++;
                                                                }
                                                            }
                                                        }
                                                        field502[field499] = Statics.field2754[var45];
                                                        field500[field499] = var46;
                                                        field501[field499] = var47;
                                                        field499++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field50.method1612();
                                        break;
                                    }
                                    int var35 = (103 - var34) * 2048 + 24628;
                                    for (int var36 = 1; var36 < 103; var36++) {
                                        if ((class6.field80[var30][var36][var34] & 0x18) == 0) {
                                            Statics.field1991.method1862(var31, var35, 512, var30, var36, var34);
                                        }
                                        if (var30 < 3 && (class6.field80[var30 + 1][var36][var34] & 0x8) != 0) {
                                            Statics.field1991.method1862(var31, var35, 512, var30 + 1, var36, var34);
                                        }
                                        var35 += 4;
                                    }
                                    var34++;
                                }
                            }
                            if (field275 == 30) {
                                for (class17 var51 = (class17) field402.method3588(); var51 != null; var51 = (class17) field402.method3590()) {
                                    if (var51.field212 > 0) {
                                        var51.field212--;
                                    }
                                    if (var51.field212 != 0) {
                                        if (var51.field211 > 0) {
                                            var51.field211--;
                                        }
                                        if (var51.field211 == 0 && var51.field210 >= 1 && var51.field222 >= 1 && var51.field210 <= 102 && var51.field222 <= 102) {
                                            if (var51.field215 >= 0) {
                                                int var52 = var51.field215;
                                                int var53 = var51.field219;
                                                class43 var54 = class43.method768(var52);
                                                if (var53 == 11) {
                                                    var53 = 10;
                                                }
                                                if (var53 >= 5 && var53 <= 8) {
                                                    var53 = 4;
                                                }
                                                boolean var55 = var54.method811(var53);
                                                if (!var55) {
                                                    continue;
                                                }
                                            }
                                            method566(var51.field216, var51.field209, var51.field210, var51.field222, var51.field215, var51.field218, var51.field219);
                                            var51.field211 = -1;
                                            if (var51.field215 == var51.field208 && var51.field208 == -1) {
                                                var51.method3699();
                                            } else if (var51.field215 == var51.field208 && var51.field218 == var51.field213 && var51.field219 == var51.field214) {
                                                var51.method3699();
                                            }
                                        }
                                    } else if (var51.field208 < 0 || class6.method2982(var51.field208, var51.field214)) {
                                        method566(var51.field216, var51.field209, var51.field210, var51.field222, var51.field208, var51.field213, var51.field214);
                                        var51.method3699();
                                    }
                                }
                                method186();
                                field273++;
                                if (field273 <= 750) {
                                    int var56 = class35.field744;
                                    int[] var57 = class35.field740;
                                    for (int var58 = 0; var58 < var56; var58++) {
                                        class3 var59 = field391[var57[var58]];
                                        if (var59 != null) {
                                            method185(var59, 1);
                                        }
                                    }
                                    method3033();
                                    method121();
                                    field298++;
                                    if (field469 != 0) {
                                        field540 += 20;
                                        if (field540 >= 400) {
                                            field469 = 0;
                                        }
                                    }
                                    if (Statics.field874 != null) {
                                        field335++;
                                        if (field335 >= 15) {
                                            method678(Statics.field874);
                                            Statics.field874 = null;
                                        }
                                    }
                                    class177 var60 = Statics.field1197;
                                    class177 var61 = Statics.field794;
                                    Statics.field1197 = null;
                                    Statics.field794 = null;
                                    field284 = null;
                                    field450 = false;
                                    field447 = false;
                                    field492 = 0;
                                    while (true) {
                                        while (class141.method45() && field492 < 128) {
                                            if (field436 >= 2 && class141.field2158[82] && Statics.field2651 == 66) {
                                                String var62 = "";
                                                Iterator var63 = class12.field169.iterator();
                                                while (var63.hasNext()) {
                                                    class38 var64 = (class38) var63.next();
                                                    var62 = var62 + var64.field774 + ':' + var64.field776 + '\n';
                                                }
                                                Statics.field230.setContents(new StringSelection(var62), (ClipboardOwner) null);
                                            } else {
                                                field494[field492] = Statics.field2651;
                                                field493[field492] = Statics.field2085;
                                                field492++;
                                            }
                                        }
                                        if (field513 != -1) {
                                            int var67 = field513;
                                            int var68 = Statics.field1070;
                                            int var69 = Statics.field2144;
                                            if (class177.method3203(var67)) {
                                                method564(Statics.field2909[var67], -1, 0, 0, var68, var69, 0, 0);
                                            }
                                        }
                                        field454++;
                                        while (true) {
                                            class1 var70;
                                            class177 var71;
                                            class177 var72;
                                            do {
                                                var70 = (class1) field302.method3586();
                                                if (var70 == null) {
                                                    while (true) {
                                                        class1 var73;
                                                        class177 var74;
                                                        class177 var75;
                                                        do {
                                                            var73 = (class1) field470.method3586();
                                                            if (var73 == null) {
                                                                while (true) {
                                                                    class1 var76;
                                                                    class177 var77;
                                                                    class177 var78;
                                                                    do {
                                                                        var76 = (class1) field468.method3586();
                                                                        if (var76 == null) {
                                                                            method1046();
                                                                            if (field442 != null) {
                                                                                method678(field442);
                                                                                Statics.field2312++;
                                                                                if (field450 && field447) {
                                                                                    int var79 = class144.field2193;
                                                                                    int var80 = class144.field2190;
                                                                                    int var81 = var79 - field281;
                                                                                    int var82 = var80 - field445;
                                                                                    if (var81 < field405) {
                                                                                        var81 = field405;
                                                                                    }
                                                                                    if (field442.field2814 + var81 > field405 + field392.field2814) {
                                                                                        var81 = field405 + field392.field2814 - field442.field2814;
                                                                                    }
                                                                                    if (var82 < field337) {
                                                                                        var82 = field337;
                                                                                    }
                                                                                    if (field442.field2921 + var82 > field337 + field392.field2921) {
                                                                                        var82 = field337 + field392.field2921 - field442.field2921;
                                                                                    }
                                                                                    int var83 = var81 - field451;
                                                                                    int var84 = var82 - field475;
                                                                                    int var85 = field442.field2875;
                                                                                    if (Statics.field2312 > field442.field2910 && (var83 > var85 || var83 < -var85 || var84 > var85 || var84 < -var85)) {
                                                                                        field474 = true;
                                                                                    }
                                                                                    int var86 = field392.field2820 + (var81 - field405);
                                                                                    int var87 = field392.field2821 + (var82 - field337);
                                                                                    if (field442.field2849 != null && field474) {
                                                                                        class1 var88 = new class1();
                                                                                        var88.field3 = field442;
                                                                                        var88.field11 = var86;
                                                                                        var88.field2 = var87;
                                                                                        var88.field6 = field442.field2849;
                                                                                        class39.method742(var88);
                                                                                    }
                                                                                    if (class144.field2185 == 0) {
                                                                                        if (field474) {
                                                                                            if (field442.field2889 != null) {
                                                                                                class1 var89 = new class1();
                                                                                                var89.field3 = field442;
                                                                                                var89.field11 = var86;
                                                                                                var89.field2 = var87;
                                                                                                var89.field4 = field284;
                                                                                                var89.field6 = field442.field2889;
                                                                                                class39.method742(var89);
                                                                                            }
                                                                                            if (field284 != null && method723(field442) != null) {
                                                                                                field301.method2630(22);
                                                                                                field301.method2350(field284.field2892);
                                                                                                field301.method2447(field284.field2799);
                                                                                                field301.method2406(field442.field2799);
                                                                                                field301.method2395(field442.field2800);
                                                                                                field301.method2396(field442.field2892);
                                                                                                field301.method2537(field284.field2800);
                                                                                            }
                                                                                        } else if ((field408 == 1 || method1514(field411 - 1)) && field411 > 2) {
                                                                                            method651(field451 + field281, field475 + field445);
                                                                                        } else if (field411 > 0) {
                                                                                            int var90 = field451 + field281;
                                                                                            int var91 = field475 + field445;
                                                                                            class33 var92 = Statics.field1023;
                                                                                            method861(var92.field700, var92.field692, var92.field693, var92.field694, var92.field695, var92.field695, var90, var91);
                                                                                            Statics.field1023 = null;
                                                                                        }
                                                                                        field442 = null;
                                                                                    }
                                                                                } else if (Statics.field2312 > 1) {
                                                                                    field442 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field1415 != null) {
                                                                                method678(Statics.field1415);
                                                                                field389++;
                                                                                if (class144.field2185 == 0) {
                                                                                    if (field357) {
                                                                                        if (Statics.field763 == Statics.field1415 && field387 != field384) {
                                                                                            class177 var93 = Statics.field1415;
                                                                                            byte var94 = 0;
                                                                                            if (field459 == 1 && var93.field2924 == 206) {
                                                                                                var94 = 1;
                                                                                            }
                                                                                            if (var93.field2920[field387] <= 0) {
                                                                                                var94 = 0;
                                                                                            }
                                                                                            if (class182.method529(method137(var93))) {
                                                                                                int var95 = field384;
                                                                                                int var96 = field387;
                                                                                                var93.field2920[var96] = var93.field2920[var95];
                                                                                                var93.field2918[var96] = var93.field2918[var95];
                                                                                                var93.field2920[var95] = -1;
                                                                                                var93.field2918[var95] = 0;
                                                                                            } else if (var94 == 1) {
                                                                                                int var97 = field384;
                                                                                                int var98 = field387;
                                                                                                while (var97 != var98) {
                                                                                                    if (var97 > var98) {
                                                                                                        var93.method3212(var97 - 1, var97);
                                                                                                        var97--;
                                                                                                    } else if (var97 < var98) {
                                                                                                        var93.method3212(var97 + 1, var97);
                                                                                                        var97++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var93.method3212(field387, field384);
                                                                                            }
                                                                                            field301.method2630(222);
                                                                                            field301.method2396(field384);
                                                                                            field301.method2439(Statics.field1415.field2799);
                                                                                            field301.method2350(field387);
                                                                                            field301.method2493(var94);
                                                                                        }
                                                                                    } else if ((field408 == 1 || method1514(field411 - 1)) && field411 > 2) {
                                                                                        method651(field385, field386);
                                                                                    } else if (field411 > 0) {
                                                                                        int var99 = field385;
                                                                                        int var100 = field386;
                                                                                        class33 var101 = Statics.field1023;
                                                                                        method861(var101.field700, var101.field692, var101.field693, var101.field694, var101.field695, var101.field695, var99, var100);
                                                                                        Statics.field1023 = null;
                                                                                    }
                                                                                    field335 = 10;
                                                                                    class144.field2199 = 0;
                                                                                    Statics.field1415 = null;
                                                                                } else if (field389 >= 5 && (class144.field2193 > field385 + 5 || class144.field2193 < field385 - 5 || class144.field2190 > field386 + 5 || class144.field2190 < field386 - 5)) {
                                                                                    field357 = true;
                                                                                }
                                                                            }
                                                                            if (class90.field1508 != -1) {
                                                                                int var102 = class90.field1508;
                                                                                int var103 = class90.field1542;
                                                                                field301.method2630(144);
                                                                                field301.method2349(5);
                                                                                field301.method2395(Statics.field133 + var103);
                                                                                field301.method2396(Statics.field590 + var102);
                                                                                field301.method2387(class141.field2158[82] ? (class141.field2158[81] ? 2 : 1) : 0);
                                                                                class90.field1508 = -1;
                                                                                field455 = class144.field2189;
                                                                                field379 = class144.field2197;
                                                                                field469 = 1;
                                                                                field540 = 0;
                                                                                field535 = var102;
                                                                                field504 = var103;
                                                                            }
                                                                            if (Statics.field1197 != var60) {
                                                                                if (var60 != null) {
                                                                                    method678(var60);
                                                                                }
                                                                                if (Statics.field1197 != null) {
                                                                                    method678(Statics.field1197);
                                                                                }
                                                                            }
                                                                            if (Statics.field794 != var61 && field449 == field420) {
                                                                                if (var61 != null) {
                                                                                    method678(var61);
                                                                                }
                                                                                if (Statics.field794 != null) {
                                                                                    method678(Statics.field794);
                                                                                }
                                                                            }
                                                                            if (Statics.field794 == null) {
                                                                                if (field420 > 0) {
                                                                                    field420--;
                                                                                }
                                                                            } else if (field420 < field449) {
                                                                                field420++;
                                                                                if (field449 == field420) {
                                                                                    method678(Statics.field794);
                                                                                }
                                                                            }
                                                                            int var104 = field486 + Statics.field1663.field810;
                                                                            int var105 = field448 + Statics.field1663.field843;
                                                                            if (Statics.field615 - var104 < -500 || Statics.field615 - var104 > 500 || Statics.field1997 - var105 < -500 || Statics.field1997 - var105 > 500) {
                                                                                Statics.field615 = var104;
                                                                                Statics.field1997 = var105;
                                                                            }
                                                                            if (Statics.field615 != var104) {
                                                                                Statics.field615 += (var104 - Statics.field615) / 16;
                                                                            }
                                                                            if (Statics.field1997 != var105) {
                                                                                Statics.field1997 += (var105 - Statics.field1997) / 16;
                                                                            }
                                                                            if (class144.field2185 == 4 && Statics.field246) {
                                                                                int var106 = class144.field2190 - field359;
                                                                                field290 = var106 * 2;
                                                                                field359 = var106 == -1 || var106 == 1 ? class144.field2190 : (field359 + class144.field2190) / 2;
                                                                                int var107 = field358 - class144.field2193;
                                                                                field423 = var107 * 2;
                                                                                field358 = var107 == -1 || var107 == 1 ? class144.field2193 : (field358 + class144.field2193) / 2;
                                                                            } else {
                                                                                if (class141.field2158[96]) {
                                                                                    field423 += (-24 - field423) / 2;
                                                                                } else if (class141.field2158[97]) {
                                                                                    field423 += (24 - field423) / 2;
                                                                                } else {
                                                                                    field423 /= 2;
                                                                                }
                                                                                if (class141.field2158[98]) {
                                                                                    field290 += (12 - field290) / 2;
                                                                                } else if (class141.field2158[99]) {
                                                                                    field290 += (-12 - field290) / 2;
                                                                                } else {
                                                                                    field290 /= 2;
                                                                                }
                                                                                field359 = class144.field2190;
                                                                                field358 = class144.field2193;
                                                                            }
                                                                            field355 = field423 / 2 + field355 & 0x7FF;
                                                                            field354 += field290 / 2;
                                                                            if (field354 < 128) {
                                                                                field354 = 128;
                                                                            }
                                                                            if (field354 > 383) {
                                                                                field354 = 383;
                                                                            }
                                                                            int var108 = Statics.field615 >> 7;
                                                                            int var109 = Statics.field1997 >> 7;
                                                                            int var110 = method1586(Statics.field615, Statics.field1997, Statics.field1239);
                                                                            int var111 = 0;
                                                                            if (var108 > 3 && var109 > 3 && var108 < 100 && var109 < 100) {
                                                                                for (int var112 = var108 - 4; var112 <= var108 + 4; var112++) {
                                                                                    for (int var113 = var109 - 4; var113 <= var109 + 4; var113++) {
                                                                                        int var114 = Statics.field1239;
                                                                                        if (var114 < 3 && (class6.field80[1][var112][var113] & 0x2) == 2) {
                                                                                            var114++;
                                                                                        }
                                                                                        int var115 = var110 - class6.field83[var114][var112][var113];
                                                                                        if (var115 > var111) {
                                                                                            var111 = var115;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var116 = var111 * 192;
                                                                            if (var116 > 98048) {
                                                                                var116 = 98048;
                                                                            }
                                                                            if (var116 < 32768) {
                                                                                var116 = 32768;
                                                                            }
                                                                            if (var116 > field491) {
                                                                                field491 += (var116 - field491) / 24;
                                                                            } else if (var116 < field491) {
                                                                                field491 += (var116 - field491) / 80;
                                                                            }
                                                                            if (field517) {
                                                                                method102();
                                                                            }
                                                                            for (int var117 = 0; var117 < 5; var117++) {
                                                                                int var10002 = field522[var117]++;
                                                                            }
                                                                            Statics.field2178.method201();
                                                                            int var118 = class144.method2151();
                                                                            int var119 = class141.method2701();
                                                                            if (var118 > 15000 && var119 > 15000) {
                                                                                field549 = 250;
                                                                                class144.field2195 = 14500;
                                                                                field301.method2630(110);
                                                                            }
                                                                            field340++;
                                                                            if (field340 > 500) {
                                                                                field340 = 0;
                                                                                int var120 = (int) (Math.random() * 8.0D);
                                                                                if ((var120 & 0x1) == 1) {
                                                                                    field486 += field432;
                                                                                }
                                                                                if ((var120 & 0x2) == 2) {
                                                                                    field448 += field410;
                                                                                }
                                                                                if ((var120 & 0x4) == 4) {
                                                                                    field338 += field339;
                                                                                }
                                                                            }
                                                                            if (field486 < -50) {
                                                                                field432 = 2;
                                                                            }
                                                                            if (field486 > 50) {
                                                                                field432 = -2;
                                                                            }
                                                                            if (field448 < -55) {
                                                                                field410 = 2;
                                                                            }
                                                                            if (field448 > 55) {
                                                                                field410 = -2;
                                                                            }
                                                                            if (field338 < -40) {
                                                                                field339 = 1;
                                                                            }
                                                                            if (field338 > 40) {
                                                                                field339 = -1;
                                                                            }
                                                                            field345++;
                                                                            if (field345 > 500) {
                                                                                field345 = 0;
                                                                                int var121 = (int) (Math.random() * 8.0D);
                                                                                if ((var121 & 0x1) == 1) {
                                                                                    field393 += field342;
                                                                                }
                                                                                if ((var121 & 0x2) == 2) {
                                                                                    field343 += field344;
                                                                                }
                                                                            }
                                                                            if (field393 < -60) {
                                                                                field342 = 2;
                                                                            }
                                                                            if (field393 > 60) {
                                                                                field342 = -2;
                                                                            }
                                                                            if (field343 < -20) {
                                                                                field344 = 1;
                                                                            }
                                                                            if (field343 > 10) {
                                                                                field344 = -1;
                                                                            }
                                                                            for (class41 var122 = (class41) field539.method3548(); var122 != null; var122 = (class41) field539.method3550()) {
                                                                                if ((long) var122.field867 < class119.method2280() / 1000L - 5L) {
                                                                                    if (var122.field866 > 0) {
                                                                                        class12.method37(5, "", var122.field864 + class161.field2501);
                                                                                    }
                                                                                    if (var122.field866 == 0) {
                                                                                        class12.method37(5, "", var122.field864 + class161.field2398);
                                                                                    }
                                                                                    var122.method3696();
                                                                                }
                                                                            }
                                                                            field317++;
                                                                            if (field317 > 50) {
                                                                                field301.method2630(91);
                                                                            }
                                                                            try {
                                                                                if (Statics.field696 != null && field301.field2028 > 0) {
                                                                                    Statics.field696.method2856(field301.field2033, 0, field301.field2028);
                                                                                    field301.field2028 = 0;
                                                                                    field317 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var125) {
                                                                                if (field549 > 0) {
                                                                                    method2969();
                                                                                } else {
                                                                                    method2278(40);
                                                                                    Statics.field1395 = Statics.field696;
                                                                                    Statics.field696 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var77 = var76.field3;
                                                                        if (var77.field2800 < 0) {
                                                                            break;
                                                                        }
                                                                        var78 = class177.method1982(var77.field2829);
                                                                    } while (var78 == null || var78.field2923 == null || var77.field2800 >= var78.field2923.length || var78.field2923[var77.field2800] != var77);
                                                                    class39.method742(var76);
                                                                }
                                                            }
                                                            var74 = var73.field3;
                                                            if (var74.field2800 < 0) {
                                                                break;
                                                            }
                                                            var75 = class177.method1982(var74.field2829);
                                                        } while (var75 == null || var75.field2923 == null || var74.field2800 >= var75.field2923.length || var75.field2923[var74.field2800] != var74);
                                                        class39.method742(var73);
                                                    }
                                                }
                                                var71 = var70.field3;
                                                if (var71.field2800 < 0) {
                                                    break;
                                                }
                                                var72 = class177.method1982(var71.field2829);
                                            } while (var72 == null || var72.field2923 == null || var71.field2800 >= var72.field2923.length || var72.field2923[var71.field2800] != var71);
                                            class39.method742(var70);
                                        }
                                    }
                                } else if (field549 > 0) {
                                    method2969();
                                } else {
                                    method2278(40);
                                    Statics.field1395 = Statics.field696;
                                    Statics.field696 = null;
                                }
                            }
                            break;
                        }
                        field301.method2630(212);
                        field301.method2349(0);
                        int var7 = field301.field2028;
                        class215.method3178(field301);
                        field301.method2360(field301.field2028 - var7);
                    }
                }
            }
        } else if (field275 == 40 || field275 == 45) {
            method562();
        }
    }

    @ObfuscatedName("client.m(B)V")
    public final void method227() {
        boolean var1 = class187.method2154();
        if (var1 && field508 && Statics.field577 != null) {
            Statics.field577.method1164();
        }
        if (field275 == 10 || field275 == 20 || field275 == 30) {
            if (field482 != 0L && class119.method2280() > field482) {
                method573(method2981());
            } else if (field2245) {
                class141.method2067(Statics.field1812);
                class144.method898(Statics.field1812);
                if (Statics.field2713 != null) {
                    Statics.field2713.method2708(Statics.field1812);
                }
                Statics.field390.method2877();
                Statics.field1812.setBackground(Color.black);
                class141.method767(Statics.field1812);
                class144.method2849(Statics.field1812);
                if (Statics.field2713 != null) {
                    Statics.field2713.method2707(Statics.field1812);
                }
                if (field513 != -1) {
                    method134(field513, Statics.field1070, Statics.field2144, false);
                }
                field2231 = true;
            }
        }
        Dimension var2 = this.method2892();
        if (Statics.field2943 != var2.width || Statics.field2112 != var2.height || field2231) {
            method2304();
            field482 = class119.method2280() + 500L;
            field2231 = false;
        }
        boolean var3 = false;
        if (field2230) {
            field2230 = false;
            var3 = true;
            for (int var4 = 0; var4 < 100; var4++) {
                field380[var4] = true;
            }
        }
        if (var3) {
            method120();
        }
        if (field275 == 0) {
            int var5 = class34.field719;
            String var6 = class34.field720;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field1812.getGraphics();
                if (Statics.field132 == null) {
                    Statics.field132 = new Font("Helvetica", 1, 13);
                    Statics.field1029 = Statics.field1812.getFontMetrics(Statics.field132);
                }
                if (var3) {
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field1070, Statics.field2144);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1237 == null) {
                        Statics.field1237 = Statics.field1812.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field1237.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field132);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field1029.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field1237, Statics.field1070 / 2 - 152, Statics.field2144 / 2 - 18, (ImageObserver) null);
                } catch (Exception var51) {
                    int var11 = Statics.field1070 / 2 - 152;
                    int var12 = Statics.field2144 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field132);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field1029.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var52) {
                Statics.field1812.repaint();
            }
        } else if (field275 == 5) {
            class34.method977(Statics.field2002, Statics.field1591, Statics.field3205, var3);
        } else if (field275 == 10 || field275 == 11) {
            class34.method977(Statics.field2002, Statics.field1591, Statics.field3205, var3);
        } else if (field275 == 20) {
            class34.method977(Statics.field2002, Statics.field1591, Statics.field3205, var3);
        } else if (field275 == 25) {
            if (field330 == 1) {
                if (field323 > field324) {
                    field324 = field323;
                }
                int var14 = (field324 * 50 - field323 * 50) / field324;
                method552(class161.field2366 + class2.field19 + class2.field18 + var14 + "%" + class2.field16, false);
            } else if (field330 == 2) {
                if (field325 > field341) {
                    field341 = field325;
                }
                int var15 = (field341 * 50 - field325 * 50) / field341 + 50;
                method552(class161.field2366 + class2.field19 + class2.field18 + var15 + "%" + class2.field16, false);
            } else {
                method552(class161.field2366, false);
            }
        } else if (field275 == 30) {
            if (field513 != -1) {
                int var16 = field513;
                if (class177.method3203(var16)) {
                    method736(Statics.field2909[var16], -1);
                }
            }
            for (int var17 = 0; var17 < field299; var17++) {
                if (field380[var17]) {
                    field453[var17] = true;
                }
                field321[var17] = field380[var17];
                field380[var17] = false;
            }
            field506 = field326;
            field428 = -1;
            field406 = -1;
            Statics.field763 = null;
            if (field513 != -1) {
                field299 = 0;
                method2953(field513, 0, 0, Statics.field1070, Statics.field2144, 0, 0, -1);
            }
            class83.method1714();
            if (field409) {
                int var18 = Statics.field412;
                int var19 = Statics.field1136;
                int var20 = Statics.field2083;
                int var21 = Statics.field3104;
                int var22 = 6116423;
                class83.method1721(var18, var19, var20, var21, var22);
                class83.method1721(var18 + 1, var19 + 1, var20 - 2, 16, 0);
                class83.method1735(var18 + 1, var19 + 18, var20 - 2, var21 - 19, 0);
                Statics.field2002.method3812(class161.field2426, var18 + 3, var19 + 14, var22, -1);
                int var23 = class144.field2193;
                int var24 = class144.field2190;
                for (int var25 = 0; var25 < field411; var25++) {
                    int var26 = (field411 - 1 - var25) * 15 + var19 + 31;
                    int var27 = 16777215;
                    if (var23 > var18 && var23 < var18 + var20 && var24 > var26 - 13 && var24 < var26 + 3) {
                        var27 = 16776960;
                    }
                    class228 var28 = Statics.field2002;
                    String var29;
                    if (field503[var25].length() > 0) {
                        var29 = field416[var25] + class161.field2527 + field503[var25];
                    } else {
                        var29 = field416[var25];
                    }
                    var28.method3812(var29, var18 + 3, var26, var27, 0);
                }
                method946(Statics.field412, Statics.field1136, Statics.field2083, Statics.field3104);
            } else if (field428 != -1) {
                method1044(field428, field406);
            }
            if (field481 == 3) {
                for (int var30 = 0; var30 < field299; var30++) {
                    if (field321[var30]) {
                        class83.method1720(field477[var30], field478[var30], field479[var30], field480[var30], 16711935, 128);
                    } else if (field453[var30]) {
                        class83.method1720(field477[var30], field478[var30], field479[var30], field480[var30], 16711680, 128);
                    }
                }
            }
            int var31 = Statics.field1239;
            int var32 = Statics.field1663.field810;
            int var33 = Statics.field1663.field843;
            int var34 = field298;
            for (class25 var35 = (class25) class25.field591.method3588(); var35 != null; var35 = (class25) class25.field591.method3590()) {
                if (var35.field598 != -1 || var35.field606 != null) {
                    int var36 = 0;
                    if (var32 > var35.field602) {
                        var36 += var32 - var35.field602;
                    } else if (var32 < var35.field595) {
                        var36 += var35.field595 - var32;
                    }
                    if (var33 > var35.field596) {
                        var36 += var33 - var35.field596;
                    } else if (var33 < var35.field594) {
                        var36 += var35.field594 - var33;
                    }
                    if (var36 - 64 > var35.field597 || field304 == 0 || var35.field592 != var31) {
                        if (var35.field599 != null) {
                            Statics.field1390.method1129(var35.field599);
                            var35.field599 = null;
                        }
                        if (var35.field600 != null) {
                            Statics.field1390.method1129(var35.field600);
                            var35.field600 = null;
                        }
                    } else {
                        var36 -= 64;
                        if (var36 < 0) {
                            var36 = 0;
                        }
                        int var37 = field304 * (var35.field597 - var36) / var35.field597;
                        class62 var10000;
                        if (var35.field599 != null) {
                            var35.field599.method1297(var37);
                        } else if (var35.field598 >= 0) {
                            var10000 = (class62) null;
                            class62 var38 = class62.method1239(Statics.field444, var35.field598, 0);
                            if (var38 != null) {
                                class66 var39 = var38.method1230().method1273(Statics.field1005);
                                class68 var40 = class68.method1293(var39, 100, var37);
                                var40.method1296(-1);
                                Statics.field1390.method1128(var40);
                                var35.field599 = var40;
                            }
                        }
                        if (var35.field600 != null) {
                            var35.field600.method1297(var37);
                            if (!var35.field600.method3704()) {
                                var35.field600 = null;
                            }
                        } else if (var35.field606 != null && (var35.field603 -= var34) <= 0) {
                            int var41 = (int) (Math.random() * (double) var35.field606.length);
                            var10000 = (class62) null;
                            class62 var42 = class62.method1239(Statics.field444, var35.field606[var41], 0);
                            if (var42 != null) {
                                class66 var43 = var42.method1230().method1273(Statics.field1005);
                                class68 var44 = class68.method1293(var43, 100, var37);
                                var44.method1296(0);
                                Statics.field1390.method1128(var44);
                                var35.field600 = var44;
                                var35.field603 = var35.field593 + (int) (Math.random() * (double) (var35.field601 - var35.field593));
                            }
                        }
                    }
                }
            }
            field298 = 0;
        } else if (field275 == 40) {
            method552(class161.field2512 + class2.field19 + class161.field2368, false);
        } else if (field275 == 45) {
            method552(class161.field2429, false);
        }
        if (field275 == 30 && field481 == 0 && !var3) {
            try {
                Graphics var45 = Statics.field1812.getGraphics();
                for (int var46 = 0; var46 < field299; var46++) {
                    if (field453[var46]) {
                        Statics.field50.method1548(var45, field477[var46], field478[var46], field479[var46], field480[var46]);
                        field453[var46] = false;
                    }
                }
            } catch (Exception var54) {
                Statics.field1812.repaint();
            }
        } else if (field275 > 0) {
            try {
                Graphics var48 = Statics.field1812.getGraphics();
                Statics.field50.method1547(var48, 0, 0);
                for (int var49 = 0; var49 < field299; var49++) {
                    field453[var49] = false;
                }
            } catch (Exception var53) {
                Statics.field1812.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(B)V")
    public final void method228() {
        if (Statics.field2178.method198()) {
            Statics.field2178.method199();
        }
        if (Statics.field245 != null) {
            Statics.field245.field190 = false;
        }
        Statics.field245 = null;
        if (Statics.field696 != null) {
            Statics.field696.method2855();
            Statics.field696 = null;
        }
        Statics.method676();
        class144.method2810();
        Statics.field2713 = null;
        if (Statics.field577 != null) {
            Statics.field577.method1165();
        }
        if (Statics.field528 != null) {
            Statics.field528.method1165();
        }
        class175.method2076();
        class174.method2153();
        class153.method2623();
    }

    @ObfuscatedName("dx.k(II)V")
    public static void method2278(int arg0) {
        if (field275 == arg0) {
            return;
        }
        if (field275 == 0) {
            class148.method908();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field421 = 0;
            field353 = 0;
            field269 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1395 != null) {
            Statics.field1395.method2855();
            Statics.field1395 = null;
        }
        if (field275 == 25) {
            field330 = 0;
            field323 = 0;
            field324 = 1;
            field325 = 0;
            field341 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method563(Statics.field1812, Statics.field2075, Statics.field2282, true, 0);
        } else if (arg0 == 20) {
            class34.method563(Statics.field1812, Statics.field2075, Statics.field2282, true, field275 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method563(Statics.field1812, Statics.field2075, Statics.field2282, false, 4);
        } else {
            class34.method3376();
        }
        field275 = arg0;
    }

    @ObfuscatedName("client.h(I)V")
    public void method229() {
        if (field275 == 1000) {
            return;
        }
        long var1 = class119.method2280();
        int var3 = (int) (var1 - Statics.field3209);
        Statics.field3209 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2765 += var3;
        boolean var4;
        if (class175.field2777 == 0 && class175.field2769 == 0 && class175.field2775 == 0 && class175.field2767 == 0) {
            var4 = true;
        } else if (Statics.field2773 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2765 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2769 < 20 && class175.field2767 > 0) {
                        class176 var5 = (class176) class175.field2774.method3560();
                        class123 var6 = new class123(4);
                        var6.method2349(1);
                        var6.method2405((int) var5.field3167);
                        Statics.field2773.method2856(var6.field2033, 0, 4);
                        class175.field2766.method3556(var5, var5.field3167);
                        class175.field2767--;
                        class175.field2769++;
                    }
                    while (class175.field2777 < 20 && class175.field2775 > 0) {
                        class176 var7 = (class176) class175.field2770.method3651();
                        class123 var8 = new class123(4);
                        var8.method2349(0);
                        var8.method2405((int) var7.field3167);
                        Statics.field2773.method2856(var8.field2033, 0, 4);
                        var7.method3674();
                        class175.field2772.method3556(var7, var7.field3167);
                        class175.field2775--;
                        class175.field2777++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2773.method2857();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2765 = 0;
                        byte var11 = 0;
                        if (Statics.field1417 == null) {
                            var11 = 8;
                        } else if (class175.field2768 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2776.field2028;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2773.method2865(class175.field2776.field2033, class175.field2776.field2028, var12);
                            if (class175.field2780 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2776.field2033[class175.field2776.field2028 + var13] ^= class175.field2780;
                                }
                            }
                            class175.field2776.field2028 += var12;
                            if (class175.field2776.field2028 < var11) {
                                break;
                            }
                            if (Statics.field1417 == null) {
                                class175.field2776.field2028 = 0;
                                int var14 = class175.field2776.method2363();
                                int var15 = class175.field2776.method2550();
                                int var16 = class175.field2776.method2363();
                                int var17 = class175.field2776.method2408();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2766.method3555(var18);
                                Statics.field2764 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2772.method3555(var18);
                                    Statics.field2764 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1417 = var20;
                                Statics.field963 = new class123(var17 + var21 + Statics.field1417.field2784);
                                Statics.field963.method2349(var16);
                                Statics.field963.method2524(var17);
                                class175.field2768 = 8;
                                class175.field2776.field2028 = 0;
                            } else if (class175.field2768 == 0) {
                                if (class175.field2776.field2033[0] == -1) {
                                    class175.field2768 = 1;
                                    class175.field2776.field2028 = 0;
                                } else {
                                    Statics.field1417 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field963.field2033.length - Statics.field1417.field2784;
                            int var23 = 512 - class175.field2768;
                            if (var23 > var22 - Statics.field963.field2028) {
                                var23 = var22 - Statics.field963.field2028;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2773.method2865(Statics.field963.field2033, Statics.field963.field2028, var23);
                            if (class175.field2780 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field963.field2033[Statics.field963.field2028 + var24] ^= class175.field2780;
                                }
                            }
                            Statics.field963.field2028 += var23;
                            class175.field2768 += var23;
                            if (Statics.field963.field2028 == var22) {
                                if (Statics.field1417.field3167 == 16711935L) {
                                    Statics.field782 = Statics.field963;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2779[var25];
                                        if (var26 != null) {
                                            Statics.field782.field2028 = var25 * 8 + 5;
                                            int var27 = Statics.field782.method2408();
                                            int var28 = Statics.field782.method2408();
                                            var26.method3159(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2778.reset();
                                    class175.field2778.update(Statics.field963.field2033, 0, var22);
                                    int var29 = (int) class175.field2778.getValue();
                                    if (Statics.field1417.field2783 != var29) {
                                        try {
                                            Statics.field2773.method2855();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2781++;
                                        Statics.field2773 = null;
                                        class175.field2780 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2781 = 0;
                                    class175.field2782 = 0;
                                    Statics.field1417.field2786.method3154((int) (Statics.field1417.field3167 & 0xFFFFL), Statics.field963.field2033, (Statics.field1417.field3167 & 0xFF0000L) == 16711680L, Statics.field2764);
                                }
                                Statics.field1417.method3699();
                                if (Statics.field2764) {
                                    class175.field2769--;
                                } else {
                                    class175.field2777--;
                                }
                                class175.field2768 = 0;
                                Statics.field1417 = null;
                                Statics.field963 = null;
                            } else {
                                if (class175.field2768 != 512) {
                                    break;
                                }
                                class175.field2768 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2773.method2855();
                } catch (Exception var34) {
                }
                class175.field2782++;
                Statics.field2773 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method230();
        }
    }

    @ObfuscatedName("client.r(I)V")
    public void method230() {
        if (class175.field2781 >= 4) {
            this.method2886("js5crc");
            field275 = 1000;
            return;
        }
        if (class175.field2782 >= 4) {
            if (field275 <= 5) {
                this.method2886("js5io");
                field275 = 1000;
                return;
            }
            field510 = 3000;
            class175.field2782 = 3;
        }
        if (--field510 + 1 > 0) {
            return;
        }
        try {
            if (field297 == 0) {
                Statics.field2250 = Statics.field122.method2768(Statics.field797, Statics.field1727);
                field297++;
            }
            if (field297 == 1) {
                if (Statics.field2250.field2258 == 2) {
                    this.method231(-1);
                    return;
                }
                if (Statics.field2250.field2258 == 1) {
                    field297++;
                }
            }
            if (field297 == 2) {
                Statics.field1947 = new class147((Socket) Statics.field2250.field2262, Statics.field122);
                class123 var1 = new class123(5);
                var1.method2349(15);
                var1.method2524(123);
                Statics.field1947.method2856(var1.field2033, 0, 5);
                field297++;
                Statics.field2086 = class119.method2280();
            }
            if (field297 == 3) {
                if (field275 <= 5 || Statics.field1947.method2857() > 0) {
                    int var2 = Statics.field1947.method2860();
                    if (var2 != 0) {
                        this.method231(var2);
                        return;
                    }
                    field297++;
                } else if (class119.method2280() - Statics.field2086 > 30000L) {
                    this.method231(-2);
                    return;
                }
            }
            if (field297 == 4) {
                class147 var3 = Statics.field1947;
                boolean var4 = field275 > 20;
                if (Statics.field2773 != null) {
                    try {
                        Statics.field2773.method2855();
                    } catch (Exception var14) {
                    }
                    Statics.field2773 = null;
                }
                Statics.field2773 = var3;
                class175.method2978(var4);
                class175.field2776.field2028 = 0;
                Statics.field1417 = null;
                Statics.field963 = null;
                class175.field2768 = 0;
                while (true) {
                    class176 var6 = (class176) class175.field2766.method3560();
                    if (var6 == null) {
                        while (true) {
                            class176 var7 = (class176) class175.field2772.method3560();
                            if (var7 == null) {
                                if (class175.field2780 != 0) {
                                    try {
                                        class123 var8 = new class123(4);
                                        var8.method2349(4);
                                        var8.method2349(class175.field2780);
                                        var8.method2350(0);
                                        Statics.field2773.method2856(var8.field2033, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2773.method2855();
                                        } catch (Exception var12) {
                                        }
                                        class175.field2782++;
                                        Statics.field2773 = null;
                                    }
                                }
                                class175.field2765 = 0;
                                Statics.field3209 = class119.method2280();
                                Statics.field2250 = null;
                                Statics.field1947 = null;
                                field297 = 0;
                                field264 = 0;
                                return;
                            }
                            class175.field2770.method3653(var7);
                            class175.field2771.method3556(var7, var7.field3167);
                            class175.field2775++;
                            class175.field2777--;
                        }
                    }
                    class175.field2774.method3556(var6, var6.field3167);
                    class175.field2767++;
                    class175.field2769--;
                }
            }
        } catch (IOException var15) {
            this.method231(-3);
        }
    }

    @ObfuscatedName("client.w(IB)V")
    public void method231(int arg0) {
        Statics.field2250 = null;
        Statics.field1947 = null;
        field297 = 0;
        if (Statics.field559 == Statics.field1727) {
            Statics.field1727 = Statics.field2319;
        } else {
            Statics.field1727 = Statics.field559;
        }
        field264++;
        if (field264 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field275 <= 5) {
                this.method2886("js5connect_full");
                field275 = 1000;
            } else {
                field510 = 3000;
            }
        } else if (field264 >= 2 && arg0 == 6) {
            this.method2886("js5connect_outofdate");
            field275 = 1000;
        } else if (field264 >= 4) {
            if (field275 <= 5) {
                this.method2886("js5connect");
                field275 = 1000;
            } else {
                field510 = 3000;
            }
        }
    }

    @ObfuscatedName("dv.u(I)V")
    public static void method2283() {
        if (field296 == 0) {
            Statics.field1991 = new class90(4, 104, 104, class6.field83);
            for (int var0 = 0; var0 < 4; var0++) {
                field282[var0] = new class112(104, 104);
            }
            Statics.field167 = new class82(512, 512);
            class34.field720 = class161.field2369;
            class34.field719 = 5;
            field296 = 20;
        } else if (field296 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1632[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1854(var1, 500, 800, 512, 334);
            class34.field720 = class161.field2514;
            class34.field719 = 10;
            field296 = 30;
        } else if (field296 == 30) {
            Statics.field584 = method64(0, false, true, true);
            Statics.field984 = method64(1, false, true, true);
            Statics.field155 = method64(2, true, false, true);
            Statics.field2044 = method64(3, false, true, true);
            Statics.field444 = method64(4, false, true, true);
            Statics.field604 = method64(5, true, true, true);
            Statics.field1025 = method64(6, true, true, false);
            Statics.field3102 = method64(7, false, true, true);
            Statics.field2282 = method64(8, false, true, true);
            Statics.field2300 = method64(9, false, true, true);
            Statics.field2075 = method64(10, false, true, true);
            Statics.field2034 = method64(11, false, true, true);
            Statics.field3047 = method64(12, false, true, true);
            Statics.field300 = method64(13, true, false, true);
            Statics.field237 = method64(14, false, true, false);
            Statics.field2201 = method64(15, false, true, true);
            class34.field720 = class161.field2557;
            class34.field719 = 20;
            field296 = 40;
        } else if (field296 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field584.method3153() * 4 / 100;
            int var8 = var7 + Statics.field984.method3153() * 4 / 100;
            int var9 = var8 + Statics.field155.method3153() * 2 / 100;
            int var10 = var9 + Statics.field2044.method3153() * 2 / 100;
            int var11 = var10 + Statics.field444.method3153() * 6 / 100;
            int var12 = var11 + Statics.field604.method3153() * 4 / 100;
            int var13 = var12 + Statics.field1025.method3153() * 2 / 100;
            int var14 = var13 + Statics.field3102.method3153() * 60 / 100;
            int var15 = var14 + Statics.field2282.method3153() * 2 / 100;
            int var16 = var15 + Statics.field2300.method3153() * 2 / 100;
            int var17 = var16 + Statics.field2075.method3153() * 2 / 100;
            int var18 = var17 + Statics.field2034.method3153() * 2 / 100;
            int var19 = var18 + Statics.field3047.method3153() * 2 / 100;
            int var20 = var19 + Statics.field300.method3153() * 2 / 100;
            int var21 = var20 + Statics.field237.method3153() * 2 / 100;
            int var22 = var21 + Statics.field2201.method3153() * 2 / 100;
            if (var22 == 100) {
                class34.field720 = class161.field2373;
                class34.field719 = 30;
                field296 = 45;
            } else {
                if (var22 != 0) {
                    class34.field720 = class161.field2372 + var22 + "%";
                }
                class34.field719 = 30;
            }
        } else if (field296 == 45) {
            boolean var23 = !field272;
            Statics.field1220 = 22050;
            Statics.field1223 = var23;
            Statics.field1216 = 2;
            class188 var24 = new class188();
            var24.method3399(9, 128);
            Statics.field577 = class60.method724(Statics.field122, Statics.field1812, 0, 22050);
            Statics.field577.method1161(var24);
            class172 var25 = Statics.field2201;
            class172 var26 = Statics.field237;
            class172 var27 = Statics.field444;
            Statics.field3001 = var25;
            Statics.field3009 = var26;
            Statics.field3002 = var27;
            Statics.field3008 = var24;
            Statics.field528 = class60.method724(Statics.field122, Statics.field1812, 1, 2048);
            Statics.field1390 = new class59();
            Statics.field528.method1161(Statics.field1390);
            Statics.field1005 = new class78(22050, Statics.field1220);
            class34.field720 = class161.field2374;
            class34.field719 = 35;
            field296 = 50;
        } else if (field296 == 50) {
            int var28 = 0;
            if (Statics.field1591 == null) {
                Statics.field1591 = class80.method145(Statics.field2282, Statics.field300, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field3205 == null) {
                Statics.field3205 = class80.method145(Statics.field2282, Statics.field300, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2002 == null) {
                Statics.field2002 = class80.method145(Statics.field2282, Statics.field300, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class34.field720 = class161.field2623 + var28 * 100 / 3 + "%";
                class34.field719 = 40;
            } else {
                Statics.field1501 = new class164(true);
                class34.field720 = class161.field2376;
                class34.field719 = 40;
                field296 = 60;
            }
        } else if (field296 == 60) {
            int var29 = class34.method23(Statics.field2075, Statics.field2282);
            byte var30 = 9;
            if (var29 < var30) {
                class34.field720 = class161.field2377 + var29 * 100 / var30 + "%";
                class34.field719 = 50;
            } else {
                class34.field720 = class161.field2378;
                class34.field719 = 50;
                method2278(5);
                field296 = 70;
            }
        } else if (field296 == 70) {
            if (Statics.field155.method3073()) {
                class172 var32 = Statics.field155;
                Statics.field1037 = var32;
                class44.method181(Statics.field155);
                class172 var33 = Statics.field155;
                class172 var34 = Statics.field3102;
                Statics.field1010 = var33;
                Statics.field1942 = var34;
                Statics.field1006 = Statics.field1010.method3079(3);
                class43.method567(Statics.field155, Statics.field3102, field272);
                class172 var35 = Statics.field155;
                class172 var36 = Statics.field3102;
                Statics.field870 = var35;
                Statics.field888 = var36;
                class56.method544(Statics.field155, Statics.field3102, field487, Statics.field1591);
                class45.method3508(Statics.field155, Statics.field584, Statics.field984);
                Statics.method703(Statics.field155, Statics.field3102);
                class51.method1016(Statics.field155);
                class172 var37 = Statics.field155;
                Statics.field1199 = var37;
                Statics.field3278 = Statics.field1199.method3079(16);
                class172 var38 = Statics.field2044;
                class172 var39 = Statics.field3102;
                class172 var40 = Statics.field2282;
                class172 var41 = Statics.field300;
                Statics.field2789 = var38;
                Statics.field2790 = var39;
                Statics.field2791 = var40;
                Statics.field2885 = var41;
                Statics.field2909 = new class177[Statics.field2789.method3146()][];
                Statics.field2925 = new boolean[Statics.field2789.method3146()];
                class55.method540(Statics.field155);
                class172 var42 = Statics.field155;
                Statics.field3216 = var42;
                class48.method2291(Statics.field155);
                class172 var43 = Statics.field155;
                Statics.field1126 = var43;
                Statics.field2178 = new class20();
                class172 var44 = Statics.field155;
                class172 var45 = Statics.field2282;
                class172 var46 = Statics.field300;
                Statics.field1102 = var44;
                Statics.field1074 = var45;
                Statics.field1092 = var46;
                Statics.method184(Statics.field155, Statics.field2282);
                class34.field720 = class161.field2632;
                class34.field719 = 60;
                field296 = 80;
            } else {
                class34.field720 = class161.field2379 + Statics.field155.method3157() + "%";
                class34.field719 = 60;
            }
        } else if (field296 == 80) {
            int var47 = 0;
            if (Statics.field3098 == null) {
                Statics.field3098 = class80.method2577(Statics.field2282, "compass", "");
            } else {
                var47++;
            }
            if (Statics.field2717 == null) {
                Statics.field2717 = class80.method2577(Statics.field2282, "mapedge", "");
            } else {
                var47++;
            }
            if (Statics.field223 == null) {
                Statics.field223 = Statics.method667(Statics.field2282, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field2754 == null) {
                Statics.field2754 = Statics.method490(Statics.field2282, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field2077 == null) {
                Statics.field2077 = Statics.method490(Statics.field2282, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field958 == null) {
                Statics.field958 = Statics.method490(Statics.field2282, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field261 == null) {
                Statics.field261 = Statics.method490(Statics.field2282, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field677 == null) {
                Statics.field677 = Statics.method490(Statics.field2282, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field908 == null) {
                Statics.field908 = Statics.method490(Statics.field2282, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field349 == null) {
                Statics.field349 = Statics.method490(Statics.field2282, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field2700 == null) {
                Statics.field2700 = Statics.method667(Statics.field2282, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field762 == null) {
                Statics.field762 = Statics.method667(Statics.field2282, "mod_icons", "");
            } else {
                var47++;
            }
            if (var47 < 12) {
                class34.field720 = class161.field2381 + var47 * 100 / 12 + "%";
                class34.field719 = 70;
            } else {
                Statics.field3242 = Statics.field762;
                Statics.field2717.method1624();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                for (int var52 = 0; var52 < Statics.field2754.length; var52++) {
                    Statics.field2754[var52].method1666(var48 + var51, var49 + var51, var50 + var51);
                }
                Statics.field223[0].method1790(var48 + var51, var49 + var51, var50 + var51);
                class34.field720 = class161.field2382;
                class34.field719 = 70;
                field296 = 90;
            }
        } else if (field296 == 90) {
            if (Statics.field2300.method3073()) {
                class99 var53 = new class99(Statics.field2300, Statics.field2282, 20, 0.8D, field272 ? 64 : 128);
                class95.method1989(var53);
                class95.method1990(0.8D);
                class34.field720 = class161.field2384;
                class34.field719 = 90;
                field296 = 110;
            } else {
                class34.field720 = class161.field2383 + Statics.field2300.method3157() + "%";
                class34.field719 = 90;
            }
        } else if (field296 == 110) {
            Statics.field245 = new class14();
            Statics.field122.method2755(Statics.field245, 10);
            class34.field720 = class161.field2576;
            class34.field719 = 94;
            field296 = 120;
        } else if (field296 == 120) {
            if (Statics.field2075.method3087("huffman", "")) {
                class117 var54 = new class117(Statics.field2075.method3092("huffman", ""));
                Statics.field3231 = var54;
                class34.field720 = class161.field2387;
                class34.field719 = 96;
                field296 = 130;
            } else {
                class34.field720 = class161.field2386 + "%";
                class34.field719 = 96;
            }
        } else if (field296 == 130) {
            if (!Statics.field2044.method3073()) {
                class34.field720 = class161.field2584 + Statics.field2044.method3157() * 4 / 5 + "%";
                class34.field719 = 100;
            } else if (!Statics.field3047.method3073()) {
                class34.field720 = class161.field2584 + (80 + Statics.field3047.method3157() / 6) + "%";
                class34.field719 = 100;
            } else if (Statics.field300.method3073()) {
                class34.field720 = class161.field2537;
                class34.field719 = 100;
                field296 = 140;
            } else {
                class34.field720 = class161.field2584 + (96 + Statics.field300.method3157() / 20) + "%";
                class34.field719 = 100;
            }
        } else if (field296 == 140) {
            method2278(10);
        }
    }

    @ObfuscatedName("g.n(IZZZI)Lff;")
    public static class172 method64(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2280 != null) {
            var4 = new class138(arg0, class153.field2280, Statics.field2272[arg0], 1000000);
        }
        return new class172(var4, Statics.field160, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("v.d(I)V")
    public static final void method562() {
        try {
            if (field421 == 0) {
                if (Statics.field696 != null) {
                    Statics.field696.method2855();
                    Statics.field696 = null;
                }
                Statics.field182 = null;
                field534 = false;
                field353 = 0;
                field421 = 1;
            }
            if (field421 == 1) {
                if (Statics.field182 == null) {
                    Statics.field182 = Statics.field122.method2768(Statics.field797, Statics.field1727);
                }
                if (Statics.field182.field2258 == 2) {
                    throw new IOException();
                }
                if (Statics.field182.field2258 == 1) {
                    Statics.field696 = new class147((Socket) Statics.field182.field2262, Statics.field122);
                    Statics.field182 = null;
                    field421 = 2;
                }
            }
            if (field421 == 2) {
                field301.field2028 = 0;
                field301.method2349(14);
                Statics.field696.method2856(field301.field2033, 0, 1);
                field313.field2028 = 0;
                field421 = 3;
            }
            if (field421 == 3) {
                if (Statics.field577 != null) {
                    Statics.field577.method1214();
                }
                if (Statics.field528 != null) {
                    Statics.field528.method1214();
                }
                int var0 = Statics.field696.method2860();
                if (Statics.field577 != null) {
                    Statics.field577.method1214();
                }
                if (Statics.field528 != null) {
                    Statics.field528.method1214();
                }
                if (var0 != 0) {
                    method107(var0);
                    return;
                }
                field313.field2028 = 0;
                field421 = 5;
            }
            if (field421 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field301.field2028 = 0;
                field301.method2349(1);
                field301.method2349(class34.field737.method537());
                field301.method2524(var1[0]);
                field301.method2524(var1[1]);
                field301.method2524(var1[2]);
                field301.method2524(var1[3]);
                switch(class34.field737.field2648) {
                    case 0:
                        field301.field2028 += 8;
                        break;
                    case 1:
                    case 2:
                        field301.method2405(Statics.field1788);
                        field301.field2028 += 5;
                        break;
                    case 3:
                        field301.method2524((Integer) Statics.field985.field127.get(class167.method1811(class34.field707)));
                        field301.field2028 += 4;
                }
                field301.method2354(class34.field727);
                field301.method2407(class5.field62, class5.field65);
                field312.field2028 = 0;
                if (field275 == 40) {
                    field312.method2349(18);
                } else {
                    field312.method2349(16);
                }
                field312.method2350(0);
                int var2 = field312.field2028;
                field312.method2524(123);
                field312.method2357(field301.field2033, 0, field301.field2028);
                int var3 = field312.field2028;
                field312.method2354(class34.field707);
                field312.method2349((field381 ? 1 : 0) << 1 | (field272 ? 1 : 0));
                field312.method2350(Statics.field1070);
                field312.method2350(Statics.field2144);
                class126 var4 = field312;
                byte[] var5 = new byte[24];
                try {
                    class153.field2277.method3912(0L);
                    class153.field2277.method3914(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var45) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2357(var5, 0, 24);
                field312.method2354(Statics.field274);
                field312.method2524(Statics.field1396);
                class123 var9 = new class123(Statics.field1501.method2986());
                Statics.field1501.method2988(var9);
                field312.method2357(var9.field2033, 0, var9.field2033.length);
                field312.method2349(Statics.field643);
                field312.method2524(Statics.field584.field2732);
                field312.method2524(Statics.field984.field2732);
                field312.method2524(Statics.field155.field2732);
                field312.method2524(Statics.field2044.field2732);
                field312.method2524(Statics.field444.field2732);
                field312.method2524(Statics.field604.field2732);
                field312.method2524(Statics.field1025.field2732);
                field312.method2524(Statics.field3102.field2732);
                field312.method2524(Statics.field2282.field2732);
                field312.method2524(Statics.field2300.field2732);
                field312.method2524(Statics.field2075.field2732);
                field312.method2524(Statics.field2034.field2732);
                field312.method2524(Statics.field3047.field2732);
                field312.method2524(Statics.field300.field2732);
                field312.method2524(Statics.field237.field2732);
                field312.method2524(Statics.field2201.field2732);
                field312.method2382(var1, var3, field312.field2028);
                field312.method2514(field312.field2028 - var2);
                Statics.field696.method2856(field312.field2033, 0, field312.field2028);
                field301.method2629(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field313.method2629(var1);
                field421 = 6;
            }
            if (field421 == 6 && Statics.field696.method2857() > 0) {
                int var11 = Statics.field696.method2860();
                if (var11 == 21 && field275 == 20) {
                    field421 = 7;
                } else if (var11 == 2) {
                    field421 = 9;
                } else if (var11 == 15 && field275 == 40) {
                    field314 = -1;
                    field421 = 13;
                } else if (var11 == 23 && field269 < 1) {
                    field269++;
                    field421 = 0;
                } else if (var11 == 29) {
                    field421 = 11;
                } else {
                    method107(var11);
                    return;
                }
            }
            if (field421 == 7 && Statics.field696.method2857() > 0) {
                field305 = (Statics.field696.method2860() + 3) * 60;
                field421 = 8;
            }
            if (field421 == 8) {
                field353 = 0;
                class34.method1611(class161.field2579, class161.field2394, field305 / 60 + class161.field2395);
                if (--field305 <= 0) {
                    field421 = 0;
                }
            } else {
                if (field421 == 9 && Statics.field696.method2857() >= 13) {
                    boolean var12 = Statics.field696.method2860() == 1;
                    Statics.field696.method2865(field313.field2033, 0, 4);
                    field313.field2028 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field313.method2631() << 24;
                        int var15 = var14 | field313.method2631() << 16;
                        int var16 = var15 | field313.method2631() << 8;
                        int var17 = var16 | field313.method2631();
                        int var18 = class167.method1811(class34.field707);
                        if (Statics.field985.field127.size() >= 10 && !Statics.field985.field127.containsKey(var18)) {
                            Iterator var19 = Statics.field985.field127.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field985.field127.put(var18, var17);
                        class9.method2692();
                    }
                    field436 = Statics.field696.method2860();
                    field438 = Statics.field696.method2860() == 1;
                    field382 = Statics.field696.method2860();
                    field382 <<= 0x8;
                    field382 += Statics.field696.method2860();
                    field388 = Statics.field696.method2860();
                    Statics.field696.method2865(field313.field2033, 0, 1);
                    field313.field2028 = 0;
                    field315 = field313.method2631();
                    Statics.field696.method2865(field313.field2033, 0, 2);
                    field313.field2028 = 0;
                    field314 = field313.method2550();
                    try {
                        class136.method2721(Statics.field390, "zap");
                    } catch (Throwable var44) {
                    }
                    field421 = 10;
                }
                if (field421 != 10) {
                    if (field421 == 11 && Statics.field696.method2857() >= 2) {
                        field313.field2028 = 0;
                        Statics.field696.method2865(field313.field2033, 0, 2);
                        field313.field2028 = 0;
                        Statics.field1911 = field313.method2550();
                        field421 = 12;
                    }
                    if (field421 == 12 && Statics.field696.method2857() >= Statics.field1911) {
                        field313.field2028 = 0;
                        Statics.field696.method2865(field313.field2033, 0, Statics.field1911);
                        field313.field2028 = 0;
                        String var35 = field313.method2385();
                        String var36 = field313.method2385();
                        String var37 = field313.method2385();
                        class34.method1611(var35, var36, var37);
                        method2278(10);
                    }
                    if (field421 == 13) {
                        if (field314 == -1) {
                            if (Statics.field696.method2857() < 2) {
                                return;
                            }
                            Statics.field696.method2865(field313.field2033, 0, 2);
                            field313.field2028 = 0;
                            field314 = field313.method2550();
                        }
                        if (Statics.field696.method2857() >= field314) {
                            Statics.field696.method2865(field313.field2033, 0, field314);
                            field313.field2028 = 0;
                            int var38 = field314;
                            field301.field2028 = 0;
                            field313.field2028 = 0;
                            field315 = -1;
                            field346 = -1;
                            field319 = -1;
                            field320 = -1;
                            field314 = 0;
                            field273 = 0;
                            field291 = 0;
                            field411 = 0;
                            field409 = false;
                            field327 = 0;
                            field535 = 0;
                            for (int var39 = 0; var39 < 2048; var39++) {
                                field391[var39] = null;
                            }
                            Statics.field1663 = null;
                            for (int var40 = 0; var40 < field306.length; var40++) {
                                class37 var41 = field306[var40];
                                if (var41 != null) {
                                    var41.field823 = -1;
                                    var41.field829 = false;
                                }
                            }
                            class16.field207 = new class200(32);
                            method2278(30);
                            for (int var42 = 0; var42 < 100; var42++) {
                                field380[var42] = true;
                            }
                            method40();
                            class35.method104(field313);
                            if (field313.field2028 != var38) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field353++;
                        if (field353 > 2000) {
                            if (field269 < 1) {
                                if (Statics.field559 == Statics.field1727) {
                                    Statics.field1727 = Statics.field2319;
                                } else {
                                    Statics.field1727 = Statics.field559;
                                }
                                field269++;
                                field421 = 0;
                            } else {
                                method107(-3);
                            }
                        }
                    }
                } else if (Statics.field696.method2857() >= field314) {
                    field313.field2028 = 0;
                    Statics.field696.method2865(field313.field2033, 0, field314);
                    field278 = -1L;
                    field472 = -1;
                    Statics.field245.field188 = 0;
                    Statics.field1476 = true;
                    field476 = true;
                    field495 = -1L;
                    class215.field3182 = new class206();
                    field301.field2028 = 0;
                    field313.field2028 = 0;
                    field315 = -1;
                    field346 = -1;
                    field319 = -1;
                    field320 = -1;
                    field273 = 0;
                    field291 = 0;
                    field549 = 0;
                    field311 = 0;
                    field411 = 0;
                    field409 = false;
                    class144.field2195 = 0;
                    class12.method2799();
                    field422 = 0;
                    field271 = false;
                    field511 = 0;
                    field486 = (int) (Math.random() * 100.0D) - 50;
                    field448 = (int) (Math.random() * 110.0D) - 55;
                    field338 = (int) (Math.random() * 80.0D) - 40;
                    field393 = (int) (Math.random() * 120.0D) - 60;
                    field343 = (int) (Math.random() * 30.0D) - 20;
                    field355 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field327 = 0;
                    field452 = -1;
                    field535 = 0;
                    field504 = 0;
                    field293 = class22.field565;
                    field294 = class22.field565;
                    field310 = 0;
                    class35.method601();
                    for (int var21 = 0; var21 < 2048; var21++) {
                        field391[var21] = null;
                    }
                    for (int var22 = 0; var22 < 32768; var22++) {
                        field306[var22] = null;
                    }
                    field400 = -1;
                    field403.method3582();
                    field404.method3582();
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                field401[var23][var24][var25] = null;
                            }
                        }
                    }
                    field402 = new class203();
                    field537 = 0;
                    field536 = 0;
                    field378 = 0;
                    for (int var26 = 0; var26 < Statics.field3278; var26++) {
                        class57 var27 = Statics.method2656(var26);
                        if (var27 != null) {
                            class180.field2953[var26] = 0;
                            class180.field2952[var26] = 0;
                        }
                    }
                    Statics.field2178.method202();
                    field437 = -1;
                    if (field513 != -1) {
                        int var28 = field513;
                        if (var28 != -1 && Statics.field2925[var28]) {
                            Statics.field2789.method3081(var28);
                            if (Statics.field2909[var28] != null) {
                                boolean var29 = true;
                                for (int var30 = 0; var30 < Statics.field2909[var28].length; var30++) {
                                    if (Statics.field2909[var28][var30] != null) {
                                        if (Statics.field2909[var28][var30].field2801 == 2) {
                                            var29 = false;
                                        } else {
                                            Statics.field2909[var28][var30] = null;
                                        }
                                    }
                                }
                                if (var29) {
                                    Statics.field2909[var28] = null;
                                }
                                Statics.field2925[var28] = false;
                            }
                        }
                    }
                    for (class4 var31 = (class4) field430.method3560(); var31 != null; var31 = (class4) field430.method3565()) {
                        Statics.method166(var31, true);
                    }
                    field513 = -1;
                    field430 = new class200(8);
                    field433 = null;
                    field409 = false;
                    field411 = 0;
                    field542.method3284((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var32 = 0; var32 < 8; var32++) {
                        field397[var32] = null;
                        field514[var32] = false;
                    }
                    class16.field207 = new class200(32);
                    field276 = true;
                    for (int var33 = 0; var33 < 100; var33++) {
                        field380[var33] = true;
                    }
                    method40();
                    field496 = null;
                    Statics.field765 = 0;
                    Statics.field1817 = null;
                    for (int var34 = 0; var34 < 8; var34++) {
                        field545[var34] = new class224();
                    }
                    Statics.field2005 = null;
                    class35.method104(field313);
                    Statics.field1133 = -1;
                    Statics.method2972(false);
                    field315 = -1;
                }
            }
        } catch (IOException var46) {
            if (field269 < 1) {
                if (Statics.field559 == Statics.field1727) {
                    Statics.field1727 = Statics.field2319;
                } else {
                    Statics.field1727 = Statics.field559;
                }
                field269++;
                field421 = 0;
            } else {
                method107(-2);
            }
        }
    }

    @ObfuscatedName("k.a(IB)V")
    public static void method107(int arg0) {
        if (arg0 == -3) {
            class34.method1611(class161.field2364, class161.field2397, class161.field2458);
        } else if (arg0 == -2) {
            class34.method1611(class161.field2486, class161.field2414, class161.field2401);
        } else if (arg0 == -1) {
            class34.method1611(class161.field2402, class161.field2403, class161.field2404);
        } else if (arg0 == 3) {
            class34.field714 = 3;
        } else if (arg0 == 4) {
            class34.method1611(class161.field2405, class161.field2406, class161.field2407);
        } else if (arg0 == 5) {
            class34.method1611(class161.field2408, class161.field2409, class161.field2410);
        } else if (arg0 == 6) {
            class34.method1611(class161.field2411, class161.field2412, class161.field2413);
        } else if (arg0 == 7) {
            class34.method1611(class161.field2634, class161.field2544, class161.field2606);
        } else if (arg0 == 8) {
            class34.method1611(class161.field2417, class161.field2400, class161.field2419);
        } else if (arg0 == 9) {
            class34.method1611(class161.field2420, class161.field2421, class161.field2422);
        } else if (arg0 == 10) {
            class34.method1611(class161.field2513, class161.field2424, class161.field2425);
        } else if (arg0 == 11) {
            class34.method1611(class161.field2464, class161.field2505, class161.field2428);
        } else if (arg0 == 12) {
            class34.method1611(class161.field2543, class161.field2613, class161.field2431);
        } else if (arg0 == 13) {
            class34.method1611(class161.field2432, class161.field2433, class161.field2636);
        } else if (arg0 == 14) {
            class34.method1611(class161.field2435, class161.field2436, class161.field2625);
        } else if (arg0 == 16) {
            class34.method1611(class161.field2540, class161.field2439, class161.field2440);
        } else if (arg0 == 17) {
            class34.method1611(class161.field2616, class161.field2631, class161.field2443);
        } else if (arg0 == 18) {
            class34.method1611(class161.field2521, class161.field2445, class161.field2460);
        } else if (arg0 == 19) {
            class34.method1611(class161.field2447, class161.field2552, class161.field2385);
        } else if (arg0 == 20) {
            class34.method1611(class161.field2450, class161.field2451, class161.field2452);
        } else if (arg0 == 22) {
            class34.method1611(class161.field2453, class161.field2535, class161.field2455);
        } else if (arg0 == 23) {
            class34.method1611(class161.field2456, class161.field2457, class161.field2504);
        } else if (arg0 == 24) {
            class34.method1611(class161.field2459, class161.field2454, class161.field2423);
        } else if (arg0 == 25) {
            class34.method1611(class161.field2487, class161.field2463, class161.field2604);
        } else if (arg0 == 26) {
            class34.method1611(class161.field2465, class161.field2583, class161.field2416);
        } else if (arg0 == 27) {
            class34.method1611(class161.field2441, class161.field2469, class161.field2509);
        } else if (arg0 == 31) {
            class34.method1611(class161.field2477, class161.field2478, class161.field2479);
        } else if (arg0 == 32) {
            class34.method1611(class161.field2480, class161.field2548, class161.field2482);
        } else if (arg0 == 37) {
            class34.method1611(class161.field2483, class161.field2484, class161.field2485);
        } else if (arg0 == 38) {
            class34.method1611(class161.field2396, class161.field2393, class161.field2488);
        } else if (arg0 == 55) {
            class34.method1611(class161.field2489, class161.field2490, class161.field2468);
        } else if (arg0 == 56) {
            class34.method1611(class161.field2492, class161.field2493, class161.field2494);
            method2278(11);
            return;
        } else if (arg0 == 57) {
            class34.method1611(class161.field2495, class161.field2365, class161.field2575);
            method2278(11);
            return;
        } else {
            class34.method1611(class161.field2498, class161.field2499, class161.field2500);
        }
        method2278(10);
    }

    @ObfuscatedName("ee.b(I)V")
    public static final void method2969() {
        if (Statics.field696 != null) {
            Statics.field696.method2855();
            Statics.field696 = null;
        }
        method2300();
        Statics.field1991.method1819();
        for (int var0 = 0; var0 < 4; var0++) {
            field282[var0].method2246();
        }
        System.gc();
        class187.method1029(2);
        field507 = -1;
        field508 = false;
        class25.method565();
        method2278(10);
    }

    @ObfuscatedName("dd.q(I)V")
    public static final void method2300() {
        class49.field1036.method3522();
        class44.field965.method3522();
        class47.field1016.method3522();
        class43.method3039();
        class42.field871.method3522();
        class42.field904.method3522();
        Statics.method3043();
        class45.method895();
        class46.field989.method3522();
        class46.field1004.method3522();
        class51.field1064.method3522();
        class57.field1204.method3522();
        class52.field1077.method3522();
        class52.field1084.method3522();
        class52.field1079.method3522();
        class50.method2804();
        class183.field2959.method3522();
        class177.field2793.method3522();
        class177.field2794.method3522();
        class177.field2795.method3522();
        class177.field2816.method3522();
        ((class99) Statics.field1626).method2056();
        class24.field586.method3522();
        Statics.field584.method3082();
        Statics.field984.method3082();
        Statics.field2044.method3082();
        Statics.field444.method3082();
        Statics.field604.method3082();
        Statics.field1025.method3082();
        Statics.field3102.method3082();
        Statics.field2282.method3082();
        Statics.field2300.method3082();
        Statics.field2075.method3082();
        Statics.field2034.method3082();
        Statics.field3047.method3082();
    }

    @ObfuscatedName("u.o(B)V")
    public static final void method159() {
        if (Statics.field528 != null) {
            Statics.field528.method1169();
        }
        if (Statics.field577 != null) {
            Statics.field577.method1169();
        }
    }

    @ObfuscatedName("b.c(I)V")
    public static final void method186() {
        for (int var0 = 0; var0 < field511; var0++) {
            int var10002 = field483[var0]--;
            if (field483[var0] >= -10) {
                class62 var2 = field516[var0];
                if (var2 == null) {
                    class62 var10000 = (class62) null;
                    var2 = class62.method1239(Statics.field444, field512[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field483[var0] += var2.method1231();
                    field516[var0] = var2;
                }
                if (field483[var0] < 0) {
                    int var9;
                    if (field515[var0] == 0) {
                        var9 = field509;
                    } else {
                        int var3 = (field515[var0] & 0xFF) * 128;
                        int var4 = field515[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1663.field810;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field515[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1663.field843;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field483[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field304 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class66 var10 = var2.method1230().method1273(Statics.field1005);
                        class68 var11 = class68.method1293(var10, 100, var9);
                        var11.method1296(field316[var0] - 1);
                        Statics.field1390.method1128(var11);
                    }
                    field483[var0] = -100;
                }
            } else {
                field511--;
                for (int var1 = var0; var1 < field511; var1++) {
                    field512[var1] = field512[var1 + 1];
                    field516[var1] = field516[var1 + 1];
                    field316[var1] = field316[var1 + 1];
                    field483[var1] = field483[var1 + 1];
                    field515[var1] = field515[var1 + 1];
                }
                var0--;
            }
        }
        if (!field508) {
            return;
        }
        boolean var12;
        if (class187.field3003 == 0) {
            var12 = Statics.field3008.method3398();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field425 != 0 && field507 != -1) {
                class187.method986(Statics.field1025, field507, 0, field425, false);
            }
            field508 = false;
        }
    }

    @ObfuscatedName("bg.i(Lay;IIIB)V")
    public static void method1109(class45 arg0, int arg1, int arg2, int arg3) {
        if (field511 >= 50 || field304 == 0 || arg0.field977 == null || arg1 >= arg0.field977.length) {
            return;
        }
        int var4 = arg0.field977[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field512[field511] = var5;
        field316[field511] = var6;
        field483[field511] = 0;
        field516[field511] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field515[field511] = (var8 << 16) + (var9 << 8) + var7;
        field511++;
    }

    @ObfuscatedName("ei.x(II)V")
    public static void method2719(int arg0) {
        if (arg0 == -1 && !field508) {
            Statics.field3008.method3397();
            class187.field3003 = 1;
            Statics.field201 = null;
        } else if (arg0 != -1 && field507 != arg0 && field425 != 0 && !field508) {
            class187.method1544(2, Statics.field1025, arg0, 0, field425, false);
        }
        field507 = arg0;
    }

    @ObfuscatedName("u.v(Lfw;III)V")
    public static final void method157(class177 arg0, int arg1, int arg2) {
        if (field327 != 0 && field327 != 3 || class144.field2199 != 1 && Statics.field246 || class144.field2199 != 4) {
            return;
        }
        class179 var3 = arg0.method3217(true);
        if (var3 == null) {
            return;
        }
        int var4 = class144.field2189 - arg1;
        int var5 = class144.field2197 - arg2;
        if (!var3.method3257(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2944 / 2;
        int var7 = var5 - var3.field2945 / 2;
        int var8 = field393 + field355 & 0x7FF;
        int var9 = class95.field1632[var8];
        int var10 = class95.field1622[var8];
        int var11 = (field343 + 256) * var9 >> 8;
        int var12 = (field343 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1663.field810 + var13 >> 7;
        int var16 = Statics.field1663.field843 - var14 >> 7;
        field301.method2630(242);
        field301.method2349(18);
        field301.method2395(Statics.field133 + var16);
        field301.method2396(Statics.field590 + var15);
        field301.method2387(class141.field2158[82] ? (class141.field2158[81] ? 2 : 1) : 0);
        field301.method2349(var6);
        field301.method2349(var7);
        field301.method2350(field355);
        field301.method2349(57);
        field301.method2349(field393);
        field301.method2349(field343);
        field301.method2349(89);
        field301.method2350(Statics.field1663.field810);
        field301.method2350(Statics.field1663.field843);
        field301.method2349(63);
        field535 = var15;
        field504 = var16;
    }

    @ObfuscatedName("h.l(I)V")
    public static final void method121() {
        int[] var0 = class35.field740;
        for (int var1 = 0; var1 < class35.field744; var1++) {
            class3 var2 = field391[var0[var1]];
            if (var2 != null && var2.field818 > 0) {
                var2.field818--;
                if (var2.field818 == 0) {
                    var2.field815 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field310; var3++) {
            int var4 = field308[var3];
            class37 var5 = field306[var4];
            if (var5 != null && var5.field818 > 0) {
                var5.field818--;
                if (var5.field818 == 0) {
                    var5.field815 = null;
                }
            }
        }
    }

    @ObfuscatedName("f.e(B)V")
    public static final void method102() {
        int var0 = Statics.field576 * 128 + 64;
        int var1 = Statics.field1139 * 128 + 64;
        int var2 = method1586(var0, var1, Statics.field1239) - Statics.field149;
        if (Statics.field185 < var0) {
            Statics.field185 += Statics.field24 * (var0 - Statics.field185) / 1000 + Statics.field13;
            if (Statics.field185 > var0) {
                Statics.field185 = var0;
            }
        }
        if (Statics.field185 > var0) {
            Statics.field185 -= Statics.field24 * (Statics.field185 - var0) / 1000 + Statics.field13;
            if (Statics.field185 < var0) {
                Statics.field185 = var0;
            }
        }
        if (Statics.field118 < var2) {
            Statics.field118 += Statics.field24 * (var2 - Statics.field118) / 1000 + Statics.field13;
            if (Statics.field118 > var2) {
                Statics.field118 = var2;
            }
        }
        if (Statics.field118 > var2) {
            Statics.field118 -= Statics.field24 * (Statics.field118 - var2) / 1000 + Statics.field13;
            if (Statics.field118 < var2) {
                Statics.field118 = var2;
            }
        }
        if (Statics.field2304 < var1) {
            Statics.field2304 += Statics.field24 * (var1 - Statics.field2304) / 1000 + Statics.field13;
            if (Statics.field2304 > var1) {
                Statics.field2304 = var1;
            }
        }
        if (Statics.field2304 > var1) {
            Statics.field2304 -= Statics.field24 * (Statics.field2304 - var1) / 1000 + Statics.field13;
            if (Statics.field2304 < var1) {
                Statics.field2304 = var1;
            }
        }
        int var3 = Statics.field1100 * 128 + 64;
        int var4 = Statics.field128 * 128 + 64;
        int var5 = method1586(var3, var4, Statics.field1239) - Statics.field64;
        int var6 = var3 - Statics.field185;
        int var7 = var5 - Statics.field118;
        int var8 = var4 - Statics.field2304;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2058 < var10) {
            Statics.field2058 += Statics.field1940 * (var10 - Statics.field2058) / 1000 + Statics.field3083;
            if (Statics.field2058 > var10) {
                Statics.field2058 = var10;
            }
        }
        if (Statics.field2058 > var10) {
            Statics.field2058 -= Statics.field1940 * (Statics.field2058 - var10) / 1000 + Statics.field3083;
            if (Statics.field2058 < var10) {
                Statics.field2058 = var10;
            }
        }
        int var12 = var11 - Statics.field2698;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2698 += Statics.field1940 * var12 / 1000 + Statics.field3083;
            Statics.field2698 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2698 -= Statics.field1940 * -var12 / 1000 + Statics.field3083;
            Statics.field2698 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2698;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2698 = var11;
        }
    }

    @ObfuscatedName("fz.j(I)V")
    public static final void method3033() {
        for (int var0 = 0; var0 < field310; var0++) {
            int var1 = field308[var0];
            class37 var2 = field306[var1];
            if (var2 != null) {
                method185(var2, var2.field770.field903);
            }
        }
    }

    @ObfuscatedName("b.ae(Lau;IB)V")
    public static final void method185(class40 arg0, int arg1) {
        if (arg0.field848 > field326) {
            method725(arg0);
        } else if (arg0.field849 >= field326) {
            Statics.method947(arg0);
        } else {
            method18(arg0);
        }
        if (arg0.field810 < 128 || arg0.field843 < 128 || arg0.field810 >= 13184 || arg0.field843 >= 13184) {
            arg0.field858 = -1;
            arg0.field805 = -1;
            arg0.field848 = 0;
            arg0.field849 = 0;
            arg0.field810 = arg0.field857[0] * 128 + arg0.field806 * 64;
            arg0.field843 = arg0.field831[0] * 128 + arg0.field806 * 64;
            arg0.method755();
        }
        if (Statics.field1663 == arg0 && (arg0.field810 < 1536 || arg0.field843 < 1536 || arg0.field810 >= 11776 || arg0.field843 >= 11776)) {
            arg0.field858 = -1;
            arg0.field805 = -1;
            arg0.field848 = 0;
            arg0.field849 = 0;
            arg0.field810 = arg0.field857[0] * 128 + arg0.field806 * 64;
            arg0.field843 = arg0.field831[0] * 128 + arg0.field806 * 64;
            arg0.method755();
        }
        if (arg0.field855 != 0) {
            if (arg0.field823 != -1) {
                class40 var2 = null;
                if (arg0.field823 < 32768) {
                    var2 = field306[arg0.field823];
                } else if (arg0.field823 >= 32768) {
                    var2 = field391[arg0.field823 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field810 - var2.field810;
                    int var4 = arg0.field843 - var2.field843;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field853 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field829) {
                    arg0.field823 = -1;
                    arg0.field829 = false;
                }
            }
            if (arg0.field851 != -1 && (arg0.field856 == 0 || arg0.field860 > 0)) {
                arg0.field853 = arg0.field851;
                arg0.field851 = -1;
            }
            int var5 = arg0.field853 - arg0.field804 & 0x7FF;
            if (var5 == 0 && arg0.field829) {
                arg0.field823 = -1;
                arg0.field829 = false;
            }
            if (var5 == 0) {
                arg0.field811 = 0;
            } else {
                arg0.field811++;
                if (var5 > 1024) {
                    arg0.field804 -= arg0.field855;
                    boolean var6 = true;
                    if (var5 < arg0.field855 || var5 > 2048 - arg0.field855) {
                        arg0.field804 = arg0.field853;
                        var6 = false;
                    }
                    if (arg0.field830 == arg0.field827 && (arg0.field811 > 25 || var6)) {
                        if (arg0.field808 == -1) {
                            arg0.field827 = arg0.field814;
                        } else {
                            arg0.field827 = arg0.field808;
                        }
                    }
                } else {
                    arg0.field804 += arg0.field855;
                    boolean var7 = true;
                    if (var5 < arg0.field855 || var5 > 2048 - arg0.field855) {
                        arg0.field804 = arg0.field853;
                        var7 = false;
                    }
                    if (arg0.field830 == arg0.field827 && (arg0.field811 > 25 || var7)) {
                        if (arg0.field807 == -1) {
                            arg0.field827 = arg0.field814;
                        } else {
                            arg0.field827 = arg0.field807;
                        }
                    }
                }
                arg0.field804 &= 0x7FF;
            }
        }
        arg0.field861 = false;
        if (arg0.field827 != -1) {
            class45 var9 = class45.method44(arg0.field827);
            if (var9 == null || var9.field970 == null) {
                arg0.field827 = -1;
            } else {
                arg0.field833++;
                if (arg0.field842 < var9.field970.length && arg0.field833 > var9.field982[arg0.field842]) {
                    arg0.field833 = 1;
                    arg0.field842++;
                    method1109(var9, arg0.field842, arg0.field810, arg0.field843);
                }
                if (arg0.field842 >= var9.field970.length) {
                    arg0.field833 = 0;
                    arg0.field842 = 0;
                    method1109(var9, arg0.field842, arg0.field810, arg0.field843);
                }
            }
        }
        if (arg0.field805 != -1 && field326 >= arg0.field854) {
            if (arg0.field812 < 0) {
                arg0.field812 = 0;
            }
            int var10 = class46.method2163(arg0.field805).field992;
            if (var10 == -1) {
                arg0.field805 = -1;
            } else {
                class45 var11 = class45.method44(var10);
                if (var11 == null || var11.field970 == null) {
                    arg0.field805 = -1;
                } else {
                    arg0.field841++;
                    if (arg0.field812 < var11.field970.length && arg0.field841 > var11.field982[arg0.field812]) {
                        arg0.field841 = 1;
                        arg0.field812++;
                        method1109(var11, arg0.field812, arg0.field810, arg0.field843);
                    }
                    if (arg0.field812 >= var11.field970.length && (arg0.field812 < 0 || arg0.field812 >= var11.field970.length)) {
                        arg0.field805 = -1;
                    }
                }
            }
        }
        if (arg0.field858 != -1 && arg0.field837 <= 1) {
            class45 var12 = class45.method44(arg0.field858);
            if (var12.field968 == 1 && arg0.field822 > 0 && arg0.field848 <= field326 && arg0.field849 < field326) {
                arg0.field837 = 1;
                return;
            }
        }
        if (arg0.field858 != -1 && arg0.field837 == 0) {
            class45 var13 = class45.method44(arg0.field858);
            if (var13 == null || var13.field970 == null) {
                arg0.field858 = -1;
            } else {
                arg0.field836++;
                if (arg0.field835 < var13.field970.length && arg0.field836 > var13.field982[arg0.field835]) {
                    arg0.field836 = 1;
                    arg0.field835++;
                    method1109(var13, arg0.field835, arg0.field810, arg0.field843);
                }
                if (arg0.field835 >= var13.field970.length) {
                    arg0.field835 -= var13.field974;
                    arg0.field838++;
                    if (arg0.field838 >= var13.field980) {
                        arg0.field858 = -1;
                    } else if (arg0.field835 >= 0 && arg0.field835 < var13.field970.length) {
                        method1109(var13, arg0.field835, arg0.field810, arg0.field843);
                    } else {
                        arg0.field858 = -1;
                    }
                }
                arg0.field861 = var13.field976;
            }
        }
        if (arg0.field837 > 0) {
            arg0.field837--;
        }
    }

    @ObfuscatedName("ab.ah(Lau;I)V")
    public static final void method725(class40 arg0) {
        int var1 = arg0.field848 - field326;
        int var2 = arg0.field844 * 128 + arg0.field806 * 64;
        int var3 = arg0.field846 * 128 + arg0.field806 * 64;
        arg0.field810 += (var2 - arg0.field810) / var1;
        arg0.field843 += (var3 - arg0.field843) / var1;
        arg0.field860 = 0;
        arg0.field853 = arg0.field850;
    }

    @ObfuscatedName("t.aa(Lau;I)V")
    public static final void method18(class40 arg0) {
        arg0.field827 = arg0.field830;
        if (arg0.field856 == 0) {
            arg0.field860 = 0;
            return;
        }
        if (arg0.field858 != -1 && arg0.field837 == 0) {
            class45 var1 = class45.method44(arg0.field858);
            if (arg0.field822 > 0 && var1.field968 == 0) {
                arg0.field860++;
                return;
            }
            if (arg0.field822 <= 0 && var1.field981 == 0) {
                arg0.field860++;
                return;
            }
        }
        int var2 = arg0.field810;
        int var3 = arg0.field843;
        int var4 = arg0.field857[arg0.field856 - 1] * 128 + arg0.field806 * 64;
        int var5 = arg0.field831[arg0.field856 - 1] * 128 + arg0.field806 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field853 = 1280;
            } else if (var3 > var5) {
                arg0.field853 = 1792;
            } else {
                arg0.field853 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field853 = 768;
            } else if (var3 > var5) {
                arg0.field853 = 256;
            } else {
                arg0.field853 = 512;
            }
        } else if (var3 < var5) {
            arg0.field853 = 1024;
        } else if (var3 > var5) {
            arg0.field853 = 0;
        }
        byte var6 = arg0.field859[arg0.field856 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field810 = var4;
            arg0.field843 = var5;
            arg0.field856--;
            if (arg0.field822 > 0) {
                arg0.field822--;
            }
            return;
        }
        int var7 = arg0.field853 - arg0.field804 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field803;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field814;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field862;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field809;
        }
        if (var8 == -1) {
            var8 = arg0.field814;
        }
        arg0.field827 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field770.field902;
        }
        if (var10) {
            if (arg0.field853 != arg0.field804 && arg0.field823 == -1 && arg0.field855 != 0) {
                var9 = 2;
            }
            if (arg0.field856 > 2) {
                var9 = 6;
            }
            if (arg0.field856 > 3) {
                var9 = 8;
            }
            if (arg0.field860 > 0 && arg0.field856 > 1) {
                var9 = 8;
                arg0.field860--;
            }
        } else {
            if (arg0.field856 > 1) {
                var9 = 6;
            }
            if (arg0.field856 > 2) {
                var9 = 8;
            }
            if (arg0.field860 > 0 && arg0.field856 > 1) {
                var9 = 8;
                arg0.field860--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field827 == arg0.field814 && arg0.field813 != -1) {
            arg0.field827 = arg0.field813;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field810 += var9;
                if (arg0.field810 > var4) {
                    arg0.field810 = var4;
                }
            } else if (var2 > var4) {
                arg0.field810 -= var9;
                if (arg0.field810 < var4) {
                    arg0.field810 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field843 += var9;
                if (arg0.field843 > var5) {
                    arg0.field843 = var5;
                }
            } else if (var3 > var5) {
                arg0.field843 -= var9;
                if (arg0.field843 < var5) {
                    arg0.field843 = var5;
                }
            }
        }
        if (arg0.field810 == var4 && arg0.field843 == var5) {
            arg0.field856--;
            if (arg0.field822 > 0) {
                arg0.field822--;
            }
        }
    }

    @ObfuscatedName("ac.ax(Lt;III)V")
    public static void method672(class3 arg0, int arg1, int arg2) {
        if (arg0.field858 == arg1 && arg1 != -1) {
            int var3 = class45.method44(arg1).field983;
            if (var3 == 1) {
                arg0.field835 = 0;
                arg0.field836 = 0;
                arg0.field837 = arg2;
                arg0.field838 = 0;
            }
            if (var3 == 2) {
                arg0.field838 = 0;
            }
        } else if (arg1 == -1 || arg0.field858 == -1 || class45.method44(arg1).field971 >= class45.method44(arg0.field858).field971) {
            arg0.field858 = arg1;
            arg0.field835 = 0;
            arg0.field836 = 0;
            arg0.field837 = arg2;
            arg0.field838 = 0;
            arg0.field822 = arg0.field856;
        }
    }

    @ObfuscatedName("fy.ac(B)I")
    public static int method2981() {
        return field381 ? 2 : 1;
    }

    @ObfuscatedName("l.ar(IB)V")
    public static void method573(int arg0) {
        field482 = 0L;
        if (arg0 >= 2) {
            field381 = true;
        } else {
            field381 = false;
        }
        method2304();
        if (field275 >= 25) {
            method40();
        }
        field2230 = true;
    }

    @ObfuscatedName("t.an(I)V")
    public static void method40() {
        field301.method2630(207);
        field301.method2349(method2981());
        field301.method2350(Statics.field1070);
        field301.method2350(Statics.field2144);
    }

    @ObfuscatedName("dz.ag(I)V")
    public static void method2304() {
        client var0 = Statics.field390;
        synchronized (Statics.field390) {
            Container var1 = Statics.field390.method2915();
            if (var1 != null) {
                Statics.field2943 = Math.max(var1.getSize().width, Statics.field2335);
                Statics.field2112 = Math.max(var1.getSize().height, Statics.field614);
                if (Statics.field2009 == var1) {
                    Insets var2 = Statics.field2009.getInsets();
                    Statics.field2943 -= var2.right + var2.left;
                    Statics.field2112 -= var2.top + var2.bottom;
                }
                if (Statics.field2943 <= 0) {
                    Statics.field2943 = 1;
                }
                if (Statics.field2112 <= 0) {
                    Statics.field2112 = 1;
                }
                if (method2981() == 1) {
                    Statics.field1070 = field484;
                    Statics.field2144 = field485;
                } else {
                    Statics.field1070 = Math.min(Statics.field2943, 7680);
                    Statics.field2144 = Math.min(Statics.field2112, 2160);
                }
                field2240 = (Statics.field2943 - Statics.field1070) / 2;
                field2241 = 0;
                Statics.field1812.setSize(Statics.field1070, Statics.field2144);
                int var3 = Statics.field1070;
                int var4 = Statics.field2144;
                Canvas var5 = Statics.field1812;
                class81 var7;
                try {
                    class85 var6 = new class85();
                    var6.method1571(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var18) {
                    class79 var9 = new class79();
                    var9.method1571(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field50 = var7;
                if (Statics.field2009 == var1) {
                    Insets var10 = Statics.field2009.getInsets();
                    Statics.field1812.setLocation(field2240 + var10.left, field2241 + var10.top);
                } else {
                    Statics.field1812.setLocation(field2240, field2241);
                }
                int var11 = Statics.field1070;
                int var12 = Statics.field2144;
                if (Statics.field2943 < var11) {
                    int var13 = Statics.field2943;
                }
                if (Statics.field2112 < var12) {
                    int var14 = Statics.field2112;
                }
                if (Statics.field985 != null) {
                    try {
                        class136.method2726(Statics.field390, "resize", new Object[] { method2981() });
                    } catch (Throwable var17) {
                    }
                }
                if (field513 != -1) {
                    method134(field513, Statics.field1070, Statics.field2144, true);
                }
                method120();
            }
        }
    }

    @ObfuscatedName("h.ab(I)V")
    public static void method120() {
        int var0 = field2240;
        int var1 = field2241;
        int var2 = Statics.field2943 - Statics.field1070 - var0;
        int var3 = Statics.field2112 - Statics.field2144 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field390.method2915();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2009 == var4) {
                Insets var7 = Statics.field2009.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2112);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2943, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2943 + var5 - var2, var6, var2, Statics.field2112);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2112 + var6 - var3, Statics.field2943, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("v.ao(Ljava/lang/String;ZI)V")
    public static final void method552(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3205.method3809(arg0, 250);
        int var6 = Statics.field3205.method3851(arg0, 250) * 13;
        class83.method1721(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1735(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3205.method3815(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method2627(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method946(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1812.getGraphics();
            Statics.field50.method1547(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1812.repaint();
        }
    }

    @ObfuscatedName("dc.av(IIIIB)V")
    public static final void method2621(int arg0, int arg1, int arg2, int arg3) {
        field375++;
        method11(class36.field760);
        boolean var4 = false;
        if (field400 >= 0) {
            int var5 = class35.field744;
            int[] var6 = class35.field740;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field400 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method11(class36.field757);
        }
        method103(true);
        method11(var4 ? class36.field761 : class36.field758);
        method103(false);
        method2870();
        for (class32 var8 = (class32) field404.method3588(); var8 != null; var8 = (class32) field404.method3590()) {
            if (Statics.field1239 != var8.field680 || var8.field682) {
                var8.method3699();
            } else if (field326 >= var8.field684) {
                var8.method671(field298);
                if (var8.field682) {
                    var8.method3699();
                } else {
                    Statics.field1991.method1830(var8.field680, var8.field681, var8.field678, var8.field683, 60, var8, 0, -1, false);
                }
            }
        }
        method1515(arg0, arg1, arg2, arg3, true);
        int var9 = field531;
        int var10 = field532;
        int var11 = field533;
        int var12 = field466;
        class83.method1715(var9, var10, var9 + var11, var10 + var12);
        class95.method1985();
        if (!field517) {
            int var13 = field354;
            if (field491 / 256 > var13) {
                var13 = field491 / 256;
            }
            if (field518[4] && field520[4] + 128 > var13) {
                var13 = field520[4] + 128;
            }
            int var14 = field355 + field338 & 0x7FF;
            method420(Statics.field615, method1586(Statics.field1663.field810, Statics.field1663.field843, Statics.field1239) - field360, Statics.field1997, var13, var14, var13 * 3 + 600);
        }
        int var27;
        if (field517) {
            int var28;
            if (Statics.field985.field124) {
                var28 = Statics.field1239;
            } else {
                int var29 = method1586(Statics.field185, Statics.field2304, Statics.field1239);
                if (var29 - Statics.field118 >= 800 || (class6.field80[Statics.field1239][Statics.field185 >> 7][Statics.field2304 >> 7] & 0x4) == 0) {
                    var28 = 3;
                } else {
                    var28 = Statics.field1239;
                }
            }
            var27 = var28;
        } else {
            int var15;
            if (Statics.field985.field124) {
                var15 = Statics.field1239;
            } else {
                label331: {
                    int var16 = 3;
                    if (Statics.field2058 < 310) {
                        int var17 = Statics.field185 >> 7;
                        int var18 = Statics.field2304 >> 7;
                        int var19 = Statics.field1663.field810 >> 7;
                        int var20 = Statics.field1663.field843 >> 7;
                        if (var17 < 0 || var18 < 0 || var17 >= 104 || var18 >= 104) {
                            var15 = Statics.field1239;
                            break label331;
                        }
                        if ((class6.field80[Statics.field1239][var17][var18] & 0x4) != 0) {
                            var16 = Statics.field1239;
                        }
                        int var21;
                        if (var19 > var17) {
                            var21 = var19 - var17;
                        } else {
                            var21 = var17 - var19;
                        }
                        int var22;
                        if (var20 > var18) {
                            var22 = var20 - var18;
                        } else {
                            var22 = var18 - var20;
                        }
                        if (var21 > var22) {
                            int var23 = var22 * 65536 / var21;
                            int var24 = 32768;
                            while (var17 != var19) {
                                if (var17 < var19) {
                                    var17++;
                                } else if (var17 > var19) {
                                    var17--;
                                }
                                if ((class6.field80[Statics.field1239][var17][var18] & 0x4) != 0) {
                                    var16 = Statics.field1239;
                                }
                                var24 += var23;
                                if (var24 >= 65536) {
                                    var24 -= 65536;
                                    if (var18 < var20) {
                                        var18++;
                                    } else if (var18 > var20) {
                                        var18--;
                                    }
                                    if ((class6.field80[Statics.field1239][var17][var18] & 0x4) != 0) {
                                        var16 = Statics.field1239;
                                    }
                                }
                            }
                        } else {
                            int var25 = var21 * 65536 / var22;
                            int var26 = 32768;
                            while (var18 != var20) {
                                if (var18 < var20) {
                                    var18++;
                                } else if (var18 > var20) {
                                    var18--;
                                }
                                if ((class6.field80[Statics.field1239][var17][var18] & 0x4) != 0) {
                                    var16 = Statics.field1239;
                                }
                                var26 += var25;
                                if (var26 >= 65536) {
                                    var26 -= 65536;
                                    if (var17 < var19) {
                                        var17++;
                                    } else if (var17 > var19) {
                                        var17--;
                                    }
                                    if ((class6.field80[Statics.field1239][var17][var18] & 0x4) != 0) {
                                        var16 = Statics.field1239;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1663.field810 >= 0 && Statics.field1663.field843 >= 0 && Statics.field1663.field810 < 13312 && Statics.field1663.field843 < 13312) {
                        if ((class6.field80[Statics.field1239][Statics.field1663.field810 >> 7][Statics.field1663.field843 >> 7] & 0x4) != 0) {
                            var16 = Statics.field1239;
                        }
                        var15 = var16;
                    } else {
                        var15 = Statics.field1239;
                    }
                }
            }
            var27 = var15;
        }
        int var30 = Statics.field185;
        int var31 = Statics.field118;
        int var32 = Statics.field2304;
        int var33 = Statics.field2058;
        int var34 = Statics.field2698;
        for (int var35 = 0; var35 < 5; var35++) {
            if (field518[var35]) {
                int var36 = (int) (Math.random() * (double) (field527[var35] * 2 + 1) - (double) field527[var35] + Math.sin((double) field356[var35] / 100.0D * (double) field522[var35]) * (double) field520[var35]);
                if (var35 == 0) {
                    Statics.field185 += var36;
                }
                if (var35 == 1) {
                    Statics.field118 += var36;
                }
                if (var35 == 2) {
                    Statics.field2304 += var36;
                }
                if (var35 == 3) {
                    Statics.field2698 = Statics.field2698 + var36 & 0x7FF;
                }
                if (var35 == 4) {
                    Statics.field2058 += var36;
                    if (Statics.field2058 < 128) {
                        Statics.field2058 = 128;
                    }
                    if (Statics.field2058 > 383) {
                        Statics.field2058 = 383;
                    }
                }
            }
        }
        int var37 = class144.field2193;
        int var38 = class144.field2190;
        if (class144.field2199 != 0) {
            var37 = class144.field2189;
            var38 = class144.field2197;
        }
        if (var37 >= var9 && var37 < var9 + var11 && var38 >= var10 && var38 < var10 + var12) {
            class109.field1894 = true;
            class109.field1897 = 0;
            class109.field1895 = var37 - var9;
            class109.field1881 = var38 - var10;
        } else {
            class109.field1894 = false;
            class109.field1897 = 0;
        }
        method159();
        class83.method1721(var9, var10, var11, var12, 0);
        method159();
        int var39 = class95.field1609;
        class95.field1609 = field505;
        Statics.field1991.method1857(Statics.field185, Statics.field118, Statics.field2304, Statics.field2058, Statics.field2698, var27);
        class95.field1609 = var39;
        method159();
        Statics.field1991.method1833();
        method167(var9, var10, var11, var12);
        if (field311 == 2) {
            method2979((field288 - Statics.field590 << 7) + field287, (field434 - Statics.field133 << 7) + field351, field551 * 2);
            if (field376 > -1 && field326 % 20 < 10) {
                Statics.field261[0].method1632(field376 + var9 - 12, field377 + var10 - 28);
            }
        }
        ((class99) Statics.field1626).method2055(field298);
        if (field469 == 1) {
            Statics.field908[field540 / 100].method1632(field455 - 8, field379 - 8);
        }
        if (field469 == 2) {
            Statics.field908[field540 / 100 + 4].method1632(field455 - 8, field379 - 8);
        }
        field427 = 0;
        int var40 = (Statics.field1663.field810 >> 7) + Statics.field590;
        int var41 = (Statics.field1663.field843 >> 7) + Statics.field133;
        if (var40 >= 3053 && var40 <= 3156 && var41 >= 3056 && var41 <= 3136) {
            field427 = 1;
        }
        if (var40 >= 3072 && var40 <= 3118 && var41 >= 9492 && var41 <= 9535) {
            field427 = 1;
        }
        if (field427 == 1 && var40 >= 3139 && var40 <= 3199 && var41 >= 3008 && var41 <= 3062) {
            field427 = 0;
        }
        Statics.field185 = var30;
        Statics.field118 = var31;
        Statics.field2304 = var32;
        Statics.field2058 = var33;
        Statics.field2698 = var34;
        if (field276) {
            byte var42 = 0;
            int var43 = class175.field2769 + class175.field2767 + var42;
            if (var43 == 0) {
                field276 = false;
            }
        }
        if (field276) {
            class83.method1721(var9, var10, var11, var12, 0);
            method552(class161.field2366, false);
        }
    }

    @ObfuscatedName("ba.ap(IIIIZS)V")
    public static final void method1515(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field524 - field523) * var5 / 100 + field523;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field529) {
            short var8 = field529;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field521) {
                var6 = field521;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1714();
                    class83.method1721(arg0, arg1, var10, arg3, -16777216);
                    class83.method1721(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field530) {
            short var11 = field530;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field303) {
                var6 = field303;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1714();
                    class83.method1721(arg0, arg1, arg2, var13, -16777216);
                    class83.method1721(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field526 - field525) * var5 / 100 + field525;
        field505 = arg3 * var6 * var14 / 85504 << 1;
        if (field533 != arg2 || field466 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1632[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1854(var15, 500, 800, arg2, arg3);
        }
        field531 = arg0;
        field532 = arg1;
        field533 = arg2;
        field466 = arg3;
    }

    @ObfuscatedName("t.au(Lab;B)V")
    public static final void method11(class36 arg0) {
        if (Statics.field1663.field810 >> 7 == field535 && Statics.field1663.field843 >> 7 == field504) {
            field535 = 0;
        }
        int var1 = class35.field744;
        int[] var2 = class35.field740;
        int var3 = var1;
        if (class36.field760 == arg0 || class36.field757 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field760 == arg0) {
                var5 = Statics.field1663;
                var6 = Statics.field1663.field49 << 14;
            } else if (class36.field757 == arg0) {
                var5 = field391[field400];
                var6 = field400 << 14;
            } else {
                var5 = field391[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field761 == arg0 && field400 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method35() && !var5.field51) {
                var5.field37 = false;
                if ((field272 && var1 > 50 || var1 > 200) && class36.field760 != arg0 && var5.field830 == var5.field827) {
                    var5.field37 = true;
                }
                int var7 = var5.field810 >> 7;
                int var8 = var5.field843 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field46 == null || field326 < var5.field40 || field326 >= var5.field36) {
                        if ((var5.field810 & 0x7F) == 64 && (var5.field843 & 0x7F) == 64) {
                            if (field375 == field374[var7][var8]) {
                                continue;
                            }
                            field374[var7][var8] = field375;
                        }
                        var5.field34 = method1586(var5.field810, var5.field843, Statics.field1239);
                        Statics.field1991.method1830(Statics.field1239, var5.field810, var5.field843, var5.field34, 60, var5, var5.field804, var6, var5.field861);
                    } else {
                        var5.field37 = false;
                        var5.field34 = method1586(var5.field810, var5.field843, Statics.field1239);
                        Statics.field1991.method1979(Statics.field1239, var5.field810, var5.field843, var5.field34, 60, var5, var5.field804, var6, var5.field41, var5.field42, var5.field43, var5.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.ad(ZI)V")
    public static final void method103(boolean arg0) {
        for (int var1 = 0; var1 < field310; var1++) {
            class37 var2 = field306[field308[var1]];
            int var3 = (field308[var1] << 14) + 536870912;
            if (var2 != null && var2.method35() && var2.field770.field868 == arg0 && var2.field770.method786()) {
                int var4 = var2.field810 >> 7;
                int var5 = var2.field843 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field806 == 1 && (var2.field810 & 0x7F) == 64 && (var2.field843 & 0x7F) == 64) {
                        if (field375 == field374[var4][var5]) {
                            continue;
                        }
                        field374[var4][var5] = field375;
                    }
                    if (!var2.field770.field901) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1991.method1830(Statics.field1239, var2.field810, var2.field843, method1586(var2.field810 + (var2.field806 * 64 - 64), var2.field843 + (var2.field806 * 64 - 64), Statics.field1239), var2.field806 * 64 - 64 + 60, var2, var2.field804, var3, var2.field861);
                }
            }
        }
    }

    @ObfuscatedName("ec.aj(I)V")
    public static final void method2870() {
        for (class7 var0 = (class7) field403.method3588(); var0 != null; var0 = (class7) field403.method3590()) {
            if (Statics.field1239 != var0.field89 || field326 > var0.field95) {
                var0.method3699();
            } else if (field326 >= var0.field94) {
                if (var0.field98 > 0) {
                    class37 var1 = field306[var0.field98 - 1];
                    if (var1 != null && var1.field810 >= 0 && var1.field810 < 13312 && var1.field843 >= 0 && var1.field843 < 13312) {
                        var0.method91(var1.field810, var1.field843, method1586(var1.field810, var1.field843, var0.field89) - var0.field93, field326);
                    }
                }
                if (var0.field98 < 0) {
                    int var2 = -var0.field98 - 1;
                    class3 var3;
                    if (field382 == var2) {
                        var3 = Statics.field1663;
                    } else {
                        var3 = field391[var2];
                    }
                    if (var3 != null && var3.field810 >= 0 && var3.field810 < 13312 && var3.field843 >= 0 && var3.field843 < 13312) {
                        var0.method91(var3.field810, var3.field843, method1586(var3.field810, var3.field843, var0.field89) - var0.field93, field326);
                    }
                }
                var0.method90(field298);
                Statics.field1991.method1830(Statics.field1239, (int) var0.field101, (int) var0.field90, (int) var0.field91, 60, var0, var0.field108, -1, false);
            }
        }
    }

    @ObfuscatedName("z.ai(Lau;IIIIII)V")
    public static final void method6(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method35()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field770;
            if (var6.field898 != null) {
                var6 = var6.method775();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field744;
        int[] var8 = class35.field740;
        int var9 = 3;
        if (!arg0.field832.method3646()) {
            method2152(arg0, arg0.field852 + 15);
            for (class27 var10 = (class27) arg0.field832.method3630(); var10 != null; var10 = (class27) arg0.field832.method3632()) {
                class21 var11 = var10.method591(field326);
                if (var11 != null) {
                    class50 var12 = var10.field623;
                    class82 var13 = var12.method956();
                    class82 var14 = var12.method966();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field1060;
                    } else {
                        if (var12.field1051 * 2 < var14.field1441) {
                            var15 = var12.field1051;
                        }
                        var16 = var14.field1441 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field326 - var11.field557;
                    int var20 = var11.field556 * var16 / var12.field1060;
                    int var23;
                    if (var11.field554 > var19) {
                        int var21 = var12.field1056 == 0 ? 0 : var19 / var12.field1056 * var12.field1056;
                        int var22 = var11.field555 * var16 / var12.field1060;
                        var23 = (var20 - var22) * var21 / var11.field554 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field554 + var12.field1057 - var19;
                        if (var12.field1059 >= 0) {
                            var17 = (var24 << 8) / (var12.field1057 - var12.field1059);
                        }
                    }
                    if (var11.field556 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field376 + arg2 - (var16 >> 1);
                    int var26 = field377 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field376 > -1) {
                            class83.method1721(var25, var26, var23, 5, 65280);
                            class83.method1721(var23 + var25, var26, var16 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var25 - var15;
                        int var28;
                        if (var16 == var23) {
                            var28 = var15 * 2 + var23;
                        } else {
                            var28 = var15 + var23;
                        }
                        int var29 = var13.field1444;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method1625(var27, var26, var17);
                            class83.method1716(var27, var26, var27 + var28, var26 + var29);
                            var14.method1625(var27, var26, var17);
                        } else {
                            var13.method1632(var27, var26);
                            class83.method1716(var27, var26, var27 + var28, var26 + var29);
                            var14.method1632(var27, var26);
                        }
                        class83.method1715(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method592()) {
                    var10.method3699();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var30 = (class3) arg0;
            if (var30.field51) {
                return;
            }
            if (var30.field28 != -1 || var30.field29 != -1) {
                method2152(arg0, arg0.field852 + 15);
                if (field376 > -1) {
                    if (var30.field28 != -1) {
                        Statics.field2077[var30.field28].method1632(field376 + arg2 - 12, field377 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field29 != -1) {
                        Statics.field958[var30.field29].method1632(field376 + arg2 - 12, field377 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field311 == 10 && field418 == var8[arg1]) {
                method2152(arg0, arg0.field852 + 15);
                if (field376 > -1) {
                    Statics.field261[1].method1632(field376 + arg2 - 12, field377 + arg3 - var9);
                }
            }
        } else {
            class42 var31 = ((class37) arg0).field770;
            if (var31.field898 != null) {
                var31 = var31.method775();
            }
            if (var31.field896 >= 0 && var31.field896 < Statics.field958.length) {
                method2152(arg0, arg0.field852 + 15);
                if (field376 > -1) {
                    Statics.field958[var31.field896].method1632(field376 + arg2 - 12, field377 + arg3 - 30);
                }
            }
            if (field311 == 1 && field286 == field308[arg1 - var7] && field326 % 20 < 10) {
                method2152(arg0, arg0.field852 + 15);
                if (field376 > -1) {
                    Statics.field261[0].method1632(field376 + arg2 - 12, field377 + arg3 - 28);
                }
            }
        }
        if (arg0.field815 != null && (arg1 >= var7 || !arg0.field817 && (field538 == 4 || !arg0.field816 && (field538 == 0 || field538 == 3 || field538 == 1 && method219(((class3) arg0).field30, false))))) {
            method2152(arg0, arg0.field852);
            if (field376 > -1 && field364 < field365) {
                field369[field364] = Statics.field2002.method3807(arg0.field815) / 2;
                field368[field364] = Statics.field2002.field3239;
                field366[field364] = field376;
                field367[field364] = field377;
                field414[field364] = arg0.field819;
                field371[field364] = arg0.field820;
                field372[field364] = arg0.field818;
                field352[field364] = arg0.field815;
                field364++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field824[var32];
            int var34 = arg0.field839[var32];
            class52 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field326) {
                    continue;
                }
                var35 = class52.method118(arg0.field839[var32]);
                var36 = var35.field1085;
                if (var35 != null && var35.field1096 != null) {
                    var35 = var35.method990();
                    if (var35 == null) {
                        arg0.field824[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field825[var32];
            class52 var38 = null;
            if (var37 >= 0) {
                var38 = class52.method118(var37);
                if (var38 != null && var38.field1096 != null) {
                    var38 = var38.method990();
                }
            }
            if (var33 - var36 <= field326) {
                if (var35 == null) {
                    arg0.field824[var32] = -1;
                } else {
                    method2152(arg0, arg0.field852 / 2);
                    if (field376 > -1) {
                        if (var32 == 1) {
                            field377 -= 20;
                        }
                        if (var32 == 2) {
                            field376 -= 15;
                            field377 -= 10;
                        }
                        if (var32 == 3) {
                            field376 += 15;
                            field377 -= 10;
                        }
                        Object var39 = null;
                        Object var40 = null;
                        Object var41 = null;
                        Object var42 = null;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        class82 var51 = null;
                        class82 var52 = null;
                        class82 var53 = null;
                        class82 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class82 var64 = var35.method992();
                        if (var64 != null) {
                            var43 = var64.field1441;
                            int var65 = var64.field1444;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field1443;
                        }
                        class82 var66 = var35.method987();
                        if (var66 != null) {
                            var44 = var66.field1441;
                            int var67 = var66.field1444;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field1443;
                        }
                        class82 var68 = var35.method994();
                        if (var68 != null) {
                            var45 = var68.field1441;
                            int var69 = var68.field1444;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field1443;
                        }
                        class82 var70 = var35.method995();
                        if (var70 != null) {
                            var46 = var70.field1441;
                            int var71 = var70.field1444;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field1443;
                        }
                        if (var38 != null) {
                            var51 = var38.method992();
                            if (var51 != null) {
                                var55 = var51.field1441;
                                int var72 = var51.field1444;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field1443;
                            }
                            var52 = var38.method987();
                            if (var52 != null) {
                                var56 = var52.field1441;
                                int var73 = var52.field1444;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field1443;
                            }
                            var53 = var38.method994();
                            if (var53 != null) {
                                var57 = var53.field1441;
                                int var74 = var53.field1444;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field1443;
                            }
                            var54 = var38.method995();
                            if (var54 != null) {
                                var58 = var54.field1441;
                                int var75 = var54.field1444;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field1443;
                            }
                        }
                        class228 var76 = var35.method1015();
                        if (var76 == null) {
                            var76 = Statics.field1591;
                        }
                        class228 var77;
                        if (var38 == null) {
                            var77 = Statics.field1591;
                        } else {
                            var77 = var38.method1015();
                            if (var77 == null) {
                                var77 = Statics.field1591;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method991(arg0.field834[var32]);
                        int var83 = var76.method3807(var82);
                        if (var38 != null) {
                            var79 = var38.method991(arg0.field826[var32]);
                            var81 = var77.method3807(var79);
                        }
                        int var84 = 0;
                        int var85 = 0;
                        if (var44 > 0) {
                            if (var68 == null && var70 == null) {
                                var84 = 1;
                            } else {
                                var84 = var83 / var44 + 1;
                            }
                        }
                        if (var38 != null && var56 > 0) {
                            if (var53 == null && var54 == null) {
                                var85 = 1;
                            } else {
                                var85 = var81 / var56 + 1;
                            }
                        }
                        int var86 = 0;
                        int var87 = var86;
                        if (var43 > 0) {
                            var86 += var43;
                        }
                        var86 += 2;
                        int var88 = var86;
                        if (var45 > 0) {
                            var86 += var45;
                        }
                        int var89 = var86;
                        int var90 = var86;
                        int var92;
                        if (var44 > 0) {
                            int var91 = var44 * var84;
                            var92 = var86 + var91;
                            var90 = (var91 - var83) / 2 + var86;
                        } else {
                            var92 = var83 + var86;
                        }
                        int var93 = var92;
                        if (var46 > 0) {
                            var92 += var46;
                        }
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        if (var38 != null) {
                            var92 += 2;
                            var94 = var92;
                            if (var55 > 0) {
                                var92 += var55;
                            }
                            var92 += 2;
                            var95 = var92;
                            if (var57 > 0) {
                                var92 += var57;
                            }
                            var96 = var92;
                            var98 = var92;
                            if (var56 > 0) {
                                int var99 = var56 * var85;
                                var92 += var99;
                                var98 += (var99 - var81) / 2;
                            } else {
                                var92 += var81;
                            }
                            var97 = var92;
                            if (var58 > 0) {
                                var92 += var58;
                            }
                        }
                        int var100 = arg0.field824[var32] - field326;
                        int var101 = var35.field1090 - var35.field1090 * var100 / var35.field1085;
                        int var102 = var35.field1091 * var100 / var35.field1085 + -var35.field1091;
                        int var103 = field376 + arg2 - (var92 >> 1) + var101;
                        int var104 = field377 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field1095 + var104 + 15;
                        int var108 = var107 - var76.field3249;
                        int var109 = var76.field3241 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field1095 + var104 + 15;
                            int var111 = var110 - var77.field3249;
                            int var112 = var77.field3241 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field1083 >= 0) {
                            var115 = (var100 << 8) / (var35.field1085 - var35.field1083);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method1625(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method1625(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method1625(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method1625(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3865(var82, var90 + var103, var107, var35.field1078, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1625(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method1625(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method1625(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1625(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3865(var79, var98 + var103, var110, var38.field1078, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method1632(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method1632(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method1632(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method1632(var93 + var103 - var50, var104);
                            }
                            var76.method3812(var82, var90 + var103, var107, var35.field1078 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1632(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method1632(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method1632(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1632(var97 + var103 - var62, var104);
                                }
                                var77.method3812(var79, var98 + var103, var110, var38.field1078 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.az(IIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3) {
        field364 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class35.field744;
        int[] var7 = class35.field740;
        for (int var8 = 0; var8 < field310 + var6; var8++) {
            class40 var9;
            if (var8 < var6) {
                var9 = field391[var7[var8]];
                if (field400 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field306[field308[var8 - var6]];
            }
            method6(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method6(field391[field400], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field364; var10++) {
            int var11 = field366[var10];
            int var12 = field367[var10];
            int var13 = field369[var10];
            int var14 = field368[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field367[var16] - field368[var16] && var12 - var14 < field367[var16] + 2 && var11 - var13 < field369[var16] + field366[var16] && var11 + var13 > field366[var16] - field369[var16] && field367[var16] - field368[var16] < var12) {
                        var12 = field367[var16] - field368[var16];
                        var15 = true;
                    }
                }
            }
            field376 = field366[var10];
            field377 = field367[var10] = var12;
            String var17 = field352[var10];
            if (field431 == 0) {
                int var18 = 16776960;
                if (field414[var10] < 6) {
                    var18 = field443[field414[var10]];
                }
                if (field414[var10] == 6) {
                    var18 = field375 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field414[var10] == 7) {
                    var18 = field375 % 20 < 10 ? 255 : 65535;
                }
                if (field414[var10] == 8) {
                    var18 = field375 % 20 < 10 ? 45056 : 8454016;
                }
                if (field414[var10] == 9) {
                    int var19 = 150 - field372[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field414[var10] == 10) {
                    int var20 = 150 - field372[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field414[var10] == 11) {
                    int var21 = 150 - field372[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field371[var10] == 0) {
                    Statics.field2002.method3852(var17, field376 + arg0, field377 + arg1, var18, 0);
                }
                if (field371[var10] == 1) {
                    Statics.field2002.method3816(var17, field376 + arg0, field377 + arg1, var18, 0, field375);
                }
                if (field371[var10] == 2) {
                    Statics.field2002.method3817(var17, field376 + arg0, field377 + arg1, var18, 0, field375);
                }
                if (field371[var10] == 3) {
                    Statics.field2002.method3819(var17, field376 + arg0, field377 + arg1, var18, 0, field375, 150 - field372[var10]);
                }
                if (field371[var10] == 4) {
                    int var22 = (150 - field372[var10]) * (Statics.field2002.method3807(var17) + 100) / 150;
                    class83.method1716(field376 + arg0 - 50, arg1, field376 + arg0 + 50, arg1 + arg3);
                    Statics.field2002.method3812(var17, field376 + arg0 + 50 - var22, field377 + arg1, var18, 0);
                    class83.method1715(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field371[var10] == 5) {
                    int var23 = 150 - field372[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class83.method1716(arg0, field377 + arg1 - Statics.field2002.field3239 - 1, arg0 + arg2, field377 + arg1 + 5);
                    Statics.field2002.method3852(var17, field376 + arg0, field377 + arg1 + var24, var18, 0);
                    class83.method1715(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2002.method3852(var17, field376 + arg0, field377 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("db.ay(Lau;II)V")
    public static final void method2152(class40 arg0, int arg1) {
        method2979(arg0.field810, arg0.field843, arg1);
    }

    @ObfuscatedName("fy.at(IIII)V")
    public static final void method2979(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field376 = -1;
            field377 = -1;
            return;
        }
        int var3 = method1586(arg0, arg1, Statics.field1239) - arg2;
        int var4 = arg0 - Statics.field185;
        int var5 = var3 - Statics.field118;
        int var6 = arg1 - Statics.field2304;
        int var7 = class95.field1632[Statics.field2058];
        int var8 = class95.field1622[Statics.field2058];
        int var9 = class95.field1632[Statics.field2698];
        int var10 = class95.field1622[Statics.field2698];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field376 = field505 * var11 / var15 + field533 / 2;
            field377 = field505 * var14 / var15 + field466 / 2;
        } else {
            field376 = -1;
            field377 = -1;
        }
    }

    @ObfuscatedName("cg.al(IIIB)I")
    public static final int method1586(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field80[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field83[var5][var3][var4] + class6.field83[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field83[var5][var3][var4 + 1] + class6.field83[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("client.aw(IIIIIII)V")
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class95.field1632[var6];
            int var12 = class95.field1622[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class95.field1632[var7];
            int var15 = class95.field1622[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field185 = arg0 - var8;
        Statics.field118 = arg1 - var9;
        Statics.field2304 = arg2 - var10;
        Statics.field2058 = arg3;
        Statics.field2698 = arg4;
    }

    @ObfuscatedName("ax.as(IIB)V")
    public static final void method668(int arg0, int arg1) {
        if (Statics.field1133 == arg0 && Statics.field1123 == arg1) {
            return;
        }
        Statics.field1133 = arg0;
        Statics.field1123 = arg1;
        method2278(25);
        method552(class161.field2366, true);
        int var2 = Statics.field590;
        int var3 = Statics.field133;
        Statics.field590 = (arg0 - 6) * 8;
        Statics.field133 = (arg1 - 6) * 8;
        int var4 = Statics.field590 - var2;
        int var5 = Statics.field133 - var3;
        int var6 = Statics.field590;
        int var7 = Statics.field133;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field306[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field857[var10] -= var4;
                    var9.field831[var10] -= var5;
                }
                var9.field810 -= var4 * 128;
                var9.field843 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field391[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field857[var13] -= var4;
                    var12.field831[var13] -= var5;
                }
                var12.field810 -= var4 * 128;
                var12.field843 -= var5 * 128;
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
                        field401[var24][var20][var21] = field401[var24][var22][var23];
                    } else {
                        field401[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field402.method3588(); var25 != null; var25 = (class17) field402.method3590()) {
            var25.field210 -= var4;
            var25.field222 -= var5;
            if (var25.field210 < 0 || var25.field222 < 0 || var25.field210 >= 104 || var25.field222 >= 104) {
                var25.method3699();
            }
        }
        if (field535 != 0) {
            field535 -= var4;
            field504 -= var5;
        }
        field511 = 0;
        field517 = false;
        field452 = -1;
        field404.method3582();
        field403.method3582();
        for (int var26 = 0; var26 < 4; var26++) {
            field282[var26].method2246();
        }
    }

    @ObfuscatedName("d.aq(ZI)V")
    public static final void method171(boolean arg0) {
        method159();
        field317++;
        if (field317 < 50 && !arg0) {
            return;
        }
        field317 = 0;
        if (field534 || Statics.field696 == null) {
            return;
        }
        field301.method2630(91);
        try {
            Statics.field696.method2856(field301.field2033, 0, field301.field2028);
            field301.field2028 = 0;
        } catch (IOException var2) {
            field534 = true;
        }
    }

    @ObfuscatedName("au.af(I)V")
    public static final void method760() {
        method171(false);
        field323 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field552.length; var1++) {
            if (Statics.field328[var1] != -1 && Statics.field552[var1] == null) {
                Statics.field552[var1] = Statics.field604.method3091(Statics.field328[var1], 0);
                if (Statics.field552[var1] == null) {
                    var0 = false;
                    field323++;
                }
            }
            if (Statics.field2999[var1] != -1 && Statics.field2092[var1] == null) {
                Statics.field2092[var1] = Statics.field604.method3128(Statics.field2999[var1], 0, Statics.field620[var1]);
                if (Statics.field2092[var1] == null) {
                    var0 = false;
                    field323++;
                }
            }
        }
        if (!var0) {
            field330 = 1;
            return;
        }
        field325 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field552.length; var3++) {
            byte[] var4 = Statics.field2092[var3];
            if (var4 != null) {
                int var5 = (Statics.field150[var3] >> 8) * 64 - Statics.field590;
                int var6 = (Statics.field150[var3] & 0xFF) * 64 - Statics.field133;
                if (field429) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method3066(var4, var5, var6);
            }
        }
        if (!var2) {
            field330 = 2;
            return;
        }
        if (field330 != 0) {
            method552(class161.field2366 + class2.field19 + class2.field18 + 100 + "%" + class2.field16, true);
        }
        method159();
        method2300();
        method159();
        Statics.field1991.method1819();
        method159();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field282[var7].method2246();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field80[var8][var9][var10] = 0;
                }
            }
        }
        method159();
        class6.method3254();
        int var11 = Statics.field552.length;
        for (class25 var12 = (class25) class25.field591.method3588(); var12 != null; var12 = (class25) class25.field591.method3590()) {
            if (var12.field599 != null) {
                Statics.field1390.method1129(var12.field599);
                var12.field599 = null;
            }
            if (var12.field600 != null) {
                Statics.field1390.method1129(var12.field600);
                var12.field600 = null;
            }
        }
        class25.field591.method3582();
        method171(true);
        if (!field429) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field150[var13] >> 8) * 64 - Statics.field590;
                int var15 = (Statics.field150[var13] & 0xFF) * 64 - Statics.field133;
                byte[] var16 = Statics.field552[var13];
                if (var16 != null) {
                    method159();
                    class6.method41(var16, var14, var15, Statics.field1133 * 8 - 48, Statics.field1123 * 8 - 48, field282);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field150[var17] >> 8) * 64 - Statics.field590;
                int var19 = (Statics.field150[var17] & 0xFF) * 64 - Statics.field133;
                byte[] var20 = Statics.field552[var17];
                if (var20 == null && Statics.field1123 < 800) {
                    method159();
                    class6.method1542(var18, var19, 64, 64);
                }
            }
            method171(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field2092[var21];
                if (var22 != null) {
                    int var23 = (Statics.field150[var21] >> 8) * 64 - Statics.field590;
                    int var24 = (Statics.field150[var21] & 0xFF) * 64 - Statics.field133;
                    method159();
                    class6.method2971(var22, var23, var24, Statics.field1991, field282);
                }
            }
        }
        if (field429) {
            for (int var25 = 0; var25 < 4; var25++) {
                method159();
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        boolean var28 = false;
                        int var29 = field331[var25][var26][var27];
                        if (var29 != -1) {
                            int var30 = var29 >> 24 & 0x3;
                            int var31 = var29 >> 1 & 0x3;
                            int var32 = var29 >> 14 & 0x3FF;
                            int var33 = var29 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < Statics.field150.length; var35++) {
                                if (Statics.field150[var35] == var34 && Statics.field552[var35] != null) {
                                    class6.method2275(Statics.field552[var35], var25, var26 * 8, var27 * 8, var30, (var32 & 0x7) * 8, (var33 & 0x7) * 8, var31, field282);
                                    var28 = true;
                                    break;
                                }
                            }
                        }
                        if (!var28) {
                            int var36 = var25;
                            int var37 = var26 * 8;
                            int var38 = var27 * 8;
                            for (int var39 = 0; var39 < 8; var39++) {
                                for (int var40 = 0; var40 < 8; var40++) {
                                    class6.field83[var36][var37 + var39][var38 + var40] = 0;
                                }
                            }
                            if (var37 > 0) {
                                for (int var41 = 1; var41 < 8; var41++) {
                                    class6.field83[var36][var37][var38 + var41] = class6.field83[var36][var37 - 1][var38 + var41];
                                }
                            }
                            if (var38 > 0) {
                                for (int var42 = 1; var42 < 8; var42++) {
                                    class6.field83[var36][var37 + var42][var38] = class6.field83[var36][var37 + var42][var38 - 1];
                                }
                            }
                            if (var37 > 0 && class6.field83[var36][var37 - 1][var38] != 0) {
                                class6.field83[var36][var37][var38] = class6.field83[var36][var37 - 1][var38];
                            } else if (var38 > 0 && class6.field83[var36][var37][var38 - 1] != 0) {
                                class6.field83[var36][var37][var38] = class6.field83[var36][var37][var38 - 1];
                            } else if (var37 > 0 && var38 > 0 && class6.field83[var36][var37 - 1][var38 - 1] != 0) {
                                class6.field83[var36][var37][var38] = class6.field83[var36][var37 - 1][var38 - 1];
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < 13; var43++) {
                for (int var44 = 0; var44 < 13; var44++) {
                    int var45 = field331[0][var43][var44];
                    if (var45 == -1) {
                        class6.method1542(var43 * 8, var44 * 8, 8, 8);
                    }
                }
            }
            method171(true);
            for (int var46 = 0; var46 < 4; var46++) {
                method159();
                for (int var47 = 0; var47 < 13; var47++) {
                    label897: for (int var48 = 0; var48 < 13; var48++) {
                        int var49 = field331[var46][var47][var48];
                        if (var49 != -1) {
                            int var50 = var49 >> 24 & 0x3;
                            int var51 = var49 >> 1 & 0x3;
                            int var52 = var49 >> 14 & 0x3FF;
                            int var53 = var49 >> 3 & 0x7FF;
                            int var54 = (var52 / 8 << 8) + var53 / 8;
                            for (int var55 = 0; var55 < Statics.field150.length; var55++) {
                                if (Statics.field150[var55] == var54 && Statics.field2092[var55] != null) {
                                    byte[] var56 = Statics.field2092[var55];
                                    int var57 = var47 * 8;
                                    int var58 = var48 * 8;
                                    int var59 = (var52 & 0x7) * 8;
                                    int var60 = (var53 & 0x7) * 8;
                                    class90 var61 = Statics.field1991;
                                    class112[] var62 = field282;
                                    class123 var63 = new class123(var56);
                                    int var64 = -1;
                                    while (true) {
                                        int var65 = var63.method2536();
                                        if (var65 == 0) {
                                            continue label897;
                                        }
                                        var64 += var65;
                                        int var66 = 0;
                                        while (true) {
                                            int var67 = var63.method2536();
                                            if (var67 == 0) {
                                                break;
                                            }
                                            var66 += var67 - 1;
                                            int var68 = var66 & 0x3F;
                                            int var69 = var66 >> 6 & 0x3F;
                                            int var70 = var66 >> 12;
                                            int var71 = var63.method2363();
                                            int var72 = var71 >> 2;
                                            int var73 = var71 & 0x3;
                                            if (var50 == var70 && var69 >= var59 && var69 < var59 + 8 && var68 >= var60 && var68 < var60 + 8) {
                                                class43 var74 = class43.method768(var64);
                                                int var75 = var57 + class181.method1173(var69 & 0x7, var68 & 0x7, var51, var74.field924, var74.field925, var73);
                                                int var76 = var58 + class181.method158(var69 & 0x7, var68 & 0x7, var51, var74.field924, var74.field925, var73);
                                                if (var75 > 0 && var76 > 0 && var75 < 103 && var76 < 103) {
                                                    int var77 = var46;
                                                    if ((class6.field80[1][var75][var76] & 0x2) == 2) {
                                                        var77 = var46 - 1;
                                                    }
                                                    class112 var78 = null;
                                                    if (var77 >= 0) {
                                                        var78 = var62[var77];
                                                    }
                                                    class6.method1017(var46, var75, var76, var64, var51 + var73 & 0x3, var72, var61, var78);
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
        method171(true);
        method2300();
        method159();
        class90 var79 = Statics.field1991;
        class112[] var80 = field282;
        for (int var81 = 0; var81 < 4; var81++) {
            for (int var82 = 0; var82 < 104; var82++) {
                for (int var83 = 0; var83 < 104; var83++) {
                    if ((class6.field80[var81][var82][var83] & 0x1) == 1) {
                        int var84 = var81;
                        if ((class6.field80[1][var82][var83] & 0x2) == 2) {
                            var84 = var81 - 1;
                        }
                        if (var84 >= 0) {
                            var80[var84].method2249(var82, var83);
                        }
                    }
                }
            }
        }
        class6.field81 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field81 < -8) {
            class6.field81 = -8;
        }
        if (class6.field81 > 8) {
            class6.field81 = 8;
        }
        class6.field82 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field82 < -16) {
            class6.field82 = -16;
        }
        if (class6.field82 > 16) {
            class6.field82 = 16;
        }
        for (int var85 = 0; var85 < 4; var85++) {
            byte[][] var86 = Statics.field3198[var85];
            int var87 = (int) Math.sqrt(5100.0D);
            int var88 = var87 * 768 >> 8;
            for (int var89 = 1; var89 < 103; var89++) {
                for (int var90 = 1; var90 < 103; var90++) {
                    int var91 = class6.field83[var85][var90 + 1][var89] - class6.field83[var85][var90 - 1][var89];
                    int var92 = class6.field83[var85][var90][var89 + 1] - class6.field83[var85][var90][var89 - 1];
                    int var93 = (int) Math.sqrt((double) (var92 * var92 + var91 * var91 + 65536));
                    int var94 = (var91 << 8) / var93;
                    int var95 = 65536 / var93;
                    int var96 = (var92 << 8) / var93;
                    int var97 = (var96 * -50 + var94 * -50 + var95 * -10) / var88 + 96;
                    int var98 = (var86[var90][var89] >> 1) + (var86[var90][var89 + 1] >> 3) + (var86[var90][var89 - 1] >> 2) + (var86[var90 - 1][var89] >> 2) + (var86[var90 + 1][var89] >> 3);
                    Statics.field165[var90][var89] = var97 - var98;
                }
            }
            for (int var99 = 0; var99 < 104; var99++) {
                Statics.field71[var99] = 0;
                Statics.field777[var99] = 0;
                Statics.field66[var99] = 0;
                Statics.field2053[var99] = 0;
                Statics.field73[var99] = 0;
            }
            for (int var100 = -5; var100 < 109; var100++) {
                for (int var101 = 0; var101 < 104; var101++) {
                    int var102 = var100 + 5;
                    int var10002;
                    if (var102 >= 0 && var102 < 104) {
                        int var103 = Statics.field3214[var85][var102][var101] & 0xFF;
                        if (var103 > 0) {
                            class44 var104 = class44.method1540(var103 - 1);
                            Statics.field71[var101] += var104.field961;
                            Statics.field777[var101] += var104.field962;
                            Statics.field66[var101] += var104.field964;
                            Statics.field2053[var101] += var104.field959;
                            var10002 = Statics.field73[var101]++;
                        }
                    }
                    int var105 = var100 - 5;
                    if (var105 >= 0 && var105 < 104) {
                        int var106 = Statics.field3214[var85][var105][var101] & 0xFF;
                        if (var106 > 0) {
                            class44 var107 = class44.method1540(var106 - 1);
                            Statics.field71[var101] -= var107.field961;
                            Statics.field777[var101] -= var107.field962;
                            Statics.field66[var101] -= var107.field964;
                            Statics.field2053[var101] -= var107.field959;
                            var10002 = Statics.field73[var101]--;
                        }
                    }
                }
                if (var100 >= 1 && var100 < 103) {
                    int var108 = 0;
                    int var109 = 0;
                    int var110 = 0;
                    int var111 = 0;
                    int var112 = 0;
                    for (int var113 = -5; var113 < 109; var113++) {
                        int var114 = var113 + 5;
                        if (var114 >= 0 && var114 < 104) {
                            var108 += Statics.field71[var114];
                            var109 += Statics.field777[var114];
                            var110 += Statics.field66[var114];
                            var111 += Statics.field2053[var114];
                            var112 += Statics.field73[var114];
                        }
                        int var115 = var113 - 5;
                        if (var115 >= 0 && var115 < 104) {
                            var108 -= Statics.field71[var115];
                            var109 -= Statics.field777[var115];
                            var110 -= Statics.field66[var115];
                            var111 -= Statics.field2053[var115];
                            var112 -= Statics.field73[var115];
                        }
                        if (var113 >= 1 && var113 < 103 && (!field272 || (class6.field80[0][var100][var113] & 0x2) != 0 || (class6.field80[var85][var100][var113] & 0x10) == 0)) {
                            if (var85 < class6.field67) {
                                class6.field67 = var85;
                            }
                            int var116 = Statics.field3214[var85][var100][var113] & 0xFF;
                            int var117 = Statics.field68[var85][var100][var113] & 0xFF;
                            if (var116 > 0 || var117 > 0) {
                                int var118 = class6.field83[var85][var100][var113];
                                int var119 = class6.field83[var85][var100 + 1][var113];
                                int var120 = class6.field83[var85][var100 + 1][var113 + 1];
                                int var121 = class6.field83[var85][var100][var113 + 1];
                                int var122 = Statics.field165[var100][var113];
                                int var123 = Statics.field165[var100 + 1][var113];
                                int var124 = Statics.field165[var100 + 1][var113 + 1];
                                int var125 = Statics.field165[var100][var113 + 1];
                                int var126 = -1;
                                int var127 = -1;
                                if (var116 > 0) {
                                    int var128 = var108 * 256 / var111;
                                    int var129 = var109 / var112;
                                    int var130 = var110 / var112;
                                    var126 = class6.method652(var128, var129, var130);
                                    int var131 = class6.field81 + var128 & 0xFF;
                                    int var132 = class6.field82 + var130;
                                    if (var132 < 0) {
                                        var132 = 0;
                                    } else if (var132 > 255) {
                                        var132 = 255;
                                    }
                                    var127 = class6.method652(var131, var129, var132);
                                }
                                if (var85 > 0) {
                                    boolean var133 = true;
                                    if (var116 == 0 && Statics.field70[var85][var100][var113] != 0) {
                                        var133 = false;
                                    }
                                    if (var117 > 0) {
                                        int var134 = var117 - 1;
                                        class49 var135 = (class49) class49.field1036.method3523((long) var134);
                                        class49 var136;
                                        if (var135 == null) {
                                            byte[] var137 = Statics.field1037.method3091(4, var134);
                                            class49 var138 = new class49();
                                            if (var137 != null) {
                                                var138.method939(new class123(var137), var134);
                                            }
                                            var138.method938();
                                            class49.field1036.method3521(var138, (long) var134);
                                            var136 = var138;
                                        } else {
                                            var136 = var135;
                                        }
                                        if (!var136.field1032) {
                                            var133 = false;
                                        }
                                    }
                                    if (var133 && var118 == var119 && var118 == var120 && var118 == var121) {
                                        Statics.field217[var85][var100][var113] |= 0x924;
                                    }
                                }
                                int var139 = 0;
                                if (var127 != -1) {
                                    var139 = class95.field1618[class6.method105(var127, 96)];
                                }
                                if (var117 == 0) {
                                    var79.method1877(var85, var100, var113, 0, 0, -1, var118, var119, var120, var121, class6.method105(var126, var122), class6.method105(var126, var123), class6.method105(var126, var124), class6.method105(var126, var125), 0, 0, 0, 0, var139, 0);
                                } else {
                                    int var140 = Statics.field70[var85][var100][var113] + 1;
                                    byte var141 = Statics.field1262[var85][var100][var113];
                                    int var142 = var117 - 1;
                                    class49 var143 = (class49) class49.field1036.method3523((long) var142);
                                    class49 var144;
                                    if (var143 == null) {
                                        byte[] var145 = Statics.field1037.method3091(4, var142);
                                        class49 var146 = new class49();
                                        if (var145 != null) {
                                            var146.method939(new class123(var145), var142);
                                        }
                                        var146.method938();
                                        class49.field1036.method3521(var146, (long) var142);
                                        var144 = var146;
                                    } else {
                                        var144 = var143;
                                    }
                                    int var148 = var144.field1033;
                                    int var149;
                                    int var150;
                                    if (var148 >= 0) {
                                        var149 = Statics.field1626.method2043(var148);
                                        var150 = -1;
                                    } else if (var144.field1035 == 16711935) {
                                        var150 = -2;
                                        var148 = -1;
                                        var149 = -2;
                                    } else {
                                        var150 = class6.method652(var144.field1045, var144.field1039, var144.field1040);
                                        int var151 = class6.field81 + var144.field1045 & 0xFF;
                                        int var152 = class6.field82 + var144.field1040;
                                        if (var152 < 0) {
                                            var152 = 0;
                                        } else if (var152 > 255) {
                                            var152 = 255;
                                        }
                                        var149 = class6.method652(var151, var144.field1039, var152);
                                    }
                                    int var153 = 0;
                                    if (var149 != -2) {
                                        var153 = class95.field1618[class6.method2848(var149, 96)];
                                    }
                                    if (var144.field1038 != -1) {
                                        int var154 = class6.field81 + var144.field1041 & 0xFF;
                                        int var155 = class6.field82 + var144.field1043;
                                        if (var155 < 0) {
                                            var155 = 0;
                                        } else if (var155 > 255) {
                                            var155 = 255;
                                        }
                                        int var156 = class6.method652(var154, var144.field1042, var155);
                                        var153 = class95.field1618[class6.method2848(var156, 96)];
                                    }
                                    var79.method1877(var85, var100, var113, var140, var141, var148, var118, var119, var120, var121, class6.method105(var126, var122), class6.method105(var126, var123), class6.method105(var126, var124), class6.method105(var126, var125), class6.method2848(var150, var122), class6.method2848(var150, var123), class6.method2848(var150, var124), class6.method2848(var150, var125), var139, var153);
                                }
                            }
                        }
                    }
                }
            }
            for (int var157 = 1; var157 < 103; var157++) {
                for (int var158 = 1; var158 < 103; var158++) {
                    var79.method1823(var85, var158, var157, Statics.method1799(var85, var158, var157));
                }
            }
            Statics.field3214[var85] = (byte[][]) null;
            Statics.field68[var85] = (byte[][]) null;
            Statics.field70[var85] = (byte[][]) null;
            Statics.field1262[var85] = (byte[][]) null;
            Statics.field3198[var85] = (byte[][]) null;
        }
        var79.method1951(-50, -10, -50);
        for (int var159 = 0; var159 < 104; var159++) {
            for (int var160 = 0; var160 < 104; var160++) {
                if ((class6.field80[1][var159][var160] & 0x2) == 2) {
                    var79.method1821(var159, var160);
                }
            }
        }
        int var161 = 1;
        int var162 = 2;
        int var163 = 4;
        for (int var164 = 0; var164 < 4; var164++) {
            if (var164 > 0) {
                var161 <<= 0x3;
                var162 <<= 0x3;
                var163 <<= 0x3;
            }
            for (int var165 = 0; var165 <= var164; var165++) {
                for (int var166 = 0; var166 <= 104; var166++) {
                    for (int var167 = 0; var167 <= 104; var167++) {
                        if ((Statics.field217[var165][var167][var166] & var161) != 0) {
                            int var168 = var166;
                            int var169 = var166;
                            int var170 = var165;
                            int var171 = var165;
                            while (var168 > 0 && (Statics.field217[var165][var167][var168 - 1] & var161) != 0) {
                                var168--;
                            }
                            while (var169 < 104 && (Statics.field217[var165][var167][var169 + 1] & var161) != 0) {
                                var169++;
                            }
                            label632: while (var170 > 0) {
                                for (int var172 = var168; var172 <= var169; var172++) {
                                    if ((Statics.field217[var170 - 1][var167][var172] & var161) == 0) {
                                        break label632;
                                    }
                                }
                                var170--;
                            }
                            label621: while (var171 < var164) {
                                for (int var173 = var168; var173 <= var169; var173++) {
                                    if ((Statics.field217[var171 + 1][var167][var173] & var161) == 0) {
                                        break label621;
                                    }
                                }
                                var171++;
                            }
                            int var174 = (var171 + 1 - var170) * (var169 - var168 + 1);
                            if (var174 >= 8) {
                                short var175 = 240;
                                int var176 = class6.field83[var171][var167][var168] - var175;
                                int var177 = class6.field83[var170][var167][var168];
                                class90.method1822(var164, 1, var167 * 128, var167 * 128, var168 * 128, var169 * 128 + 128, var176, var177);
                                for (int var178 = var170; var178 <= var171; var178++) {
                                    for (int var179 = var168; var179 <= var169; var179++) {
                                        Statics.field217[var178][var167][var179] &= ~var161;
                                    }
                                }
                            }
                        }
                        if ((Statics.field217[var165][var167][var166] & var162) != 0) {
                            int var180 = var167;
                            int var181 = var167;
                            int var182 = var165;
                            int var183 = var165;
                            while (var180 > 0 && (Statics.field217[var165][var180 - 1][var166] & var162) != 0) {
                                var180--;
                            }
                            while (var181 < 104 && (Statics.field217[var165][var181 + 1][var166] & var162) != 0) {
                                var181++;
                            }
                            label685: while (var182 > 0) {
                                for (int var184 = var180; var184 <= var181; var184++) {
                                    if ((Statics.field217[var182 - 1][var184][var166] & var162) == 0) {
                                        break label685;
                                    }
                                }
                                var182--;
                            }
                            label674: while (var183 < var164) {
                                for (int var185 = var180; var185 <= var181; var185++) {
                                    if ((Statics.field217[var183 + 1][var185][var166] & var162) == 0) {
                                        break label674;
                                    }
                                }
                                var183++;
                            }
                            int var186 = (var183 + 1 - var182) * (var181 - var180 + 1);
                            if (var186 >= 8) {
                                short var187 = 240;
                                int var188 = class6.field83[var183][var180][var166] - var187;
                                int var189 = class6.field83[var182][var180][var166];
                                class90.method1822(var164, 2, var180 * 128, var181 * 128 + 128, var166 * 128, var166 * 128, var188, var189);
                                for (int var190 = var182; var190 <= var183; var190++) {
                                    for (int var191 = var180; var191 <= var181; var191++) {
                                        Statics.field217[var190][var191][var166] &= ~var162;
                                    }
                                }
                            }
                        }
                        if ((Statics.field217[var165][var167][var166] & var163) != 0) {
                            int var192 = var167;
                            int var193 = var167;
                            int var194 = var166;
                            int var195 = var166;
                            while (var194 > 0 && (Statics.field217[var165][var167][var194 - 1] & var163) != 0) {
                                var194--;
                            }
                            while (var195 < 104 && (Statics.field217[var165][var167][var195 + 1] & var163) != 0) {
                                var195++;
                            }
                            label738: while (var192 > 0) {
                                for (int var196 = var194; var196 <= var195; var196++) {
                                    if ((Statics.field217[var165][var192 - 1][var196] & var163) == 0) {
                                        break label738;
                                    }
                                }
                                var192--;
                            }
                            label727: while (var193 < 104) {
                                for (int var197 = var194; var197 <= var195; var197++) {
                                    if ((Statics.field217[var165][var193 + 1][var197] & var163) == 0) {
                                        break label727;
                                    }
                                }
                                var193++;
                            }
                            if ((var193 - var192 + 1) * (var195 - var194 + 1) >= 4) {
                                int var198 = class6.field83[var165][var192][var194];
                                class90.method1822(var164, 4, var192 * 128, var193 * 128 + 128, var194 * 128, var195 * 128 + 128, var198, var198);
                                for (int var199 = var192; var199 <= var193; var199++) {
                                    for (int var200 = var194; var200 <= var195; var200++) {
                                        Statics.field217[var165][var199][var200] &= ~var163;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method171(true);
        int var201 = class6.field67;
        if (var201 > Statics.field1239) {
            var201 = Statics.field1239;
        }
        if (var201 < Statics.field1239 - 1) {
            int var202 = Statics.field1239 - 1;
        }
        if (field272) {
            Statics.field1991.method1820(class6.field67);
        } else {
            Statics.field1991.method1820(0);
        }
        for (int var203 = 0; var203 < 104; var203++) {
            for (int var204 = 0; var204 < 104; var204++) {
                method2298(var203, var204);
            }
        }
        method159();
        method89();
        class43.field927.method3522();
        if (Statics.field2009 != null) {
            field301.method2630(96);
            field301.method2524(1057001181);
        }
        if (!field429) {
            int var205 = (Statics.field1133 - 6) / 8;
            int var206 = (Statics.field1133 + 6) / 8;
            int var207 = (Statics.field1123 - 6) / 8;
            int var208 = (Statics.field1123 + 6) / 8;
            for (int var209 = var205 - 1; var209 <= var206 + 1; var209++) {
                for (int var210 = var207 - 1; var210 <= var208 + 1; var210++) {
                    if (var209 < var205 || var209 > var206 || var210 < var207 || var210 > var208) {
                        Statics.field604.method3089("m" + var209 + "_" + var210);
                        Statics.field604.method3089("l" + var209 + "_" + var210);
                    }
                }
            }
        }
        method2278(30);
        method159();
        class6.method2955();
        field301.method2630(33);
        Statics.field200.method2732();
        for (int var211 = 0; var211 < 32; var211++) {
            field2252[var211] = 0L;
        }
        for (int var212 = 0; var212 < 32; var212++) {
            field2239[var212] = 0L;
        }
        Statics.field753 = 0;
    }

    @ObfuscatedName("cn.bp(IIIIII)V")
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1991.method1908(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1991.method1849(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field167.field1449;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method768(var12);
            if (var13.field938 == -1) {
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
                class84 var14 = Statics.field223[var13.field938];
                if (var14 != null) {
                    int var15 = (var13.field924 * 4 - var14.field1462) / 2;
                    int var16 = (var13.field925 * 4 - var14.field1459) / 2;
                    var14.method1791(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field925) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1991.method1847(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1991.method1849(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method768(var21);
            if (var22.field938 != -1) {
                class84 var23 = Statics.field223[var22.field938];
                if (var23 != null) {
                    int var24 = (var22.field924 * 4 - var23.field1462) / 2;
                    int var25 = (var22.field925 * 4 - var23.field1459) / 2;
                    var23.method1791(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field925) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field167.field1449;
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
        int var29 = Statics.field1991.method1848(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method768(var30);
        if (var31.field938 == -1) {
            return;
        }
        class84 var32 = Statics.field223[var31.field938];
        if (var32 != null) {
            int var33 = (var31.field924 * 4 - var32.field1462) / 2;
            int var34 = (var31.field925 * 4 - var32.field1459) / 2;
            var32.method1791(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field925) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("y.bh(I)Z")
    public static final boolean method43() {
        if (Statics.field696 == null) {
            return false;
        }
        try {
            int var0 = Statics.field696.method2857();
            if (var0 == 0) {
                return false;
            }
            if (field315 == -1) {
                Statics.field696.method2865(field313.field2033, 0, 1);
                field313.field2028 = 0;
                field315 = field313.method2631();
                field314 = class192.field3096[field315];
                var0--;
            }
            if (field314 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field696.method2865(field313.field2033, 0, 1);
                field314 = field313.field2033[0] & 0xFF;
                var0--;
            }
            if (field314 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field696.method2865(field313.field2033, 0, 2);
                field313.field2028 = 0;
                field314 = field313.method2550();
                var0 -= 2;
            }
            if (var0 < field314) {
                return false;
            }
            field313.field2028 = 0;
            Statics.field696.method2865(field313.field2033, 0, field314);
            field273 = 0;
            field320 = field319;
            field319 = field346;
            field346 = field315;
            if (field315 == 18) {
                int var1 = field313.method2550();
                class16.method122(var1);
                field457[++field458 - 1 & 0x1F] = var1 & 0x7FFF;
                field315 = -1;
                return true;
            }
            if (field315 == 142) {
                for (int var2 = 0; var2 < class180.field2952.length; var2++) {
                    if (class180.field2953[var2] != class180.field2952[var2]) {
                        class180.field2952[var2] = class180.field2953[var2];
                        method536(var2);
                        field473[++field456 - 1 & 0x1F] = var2;
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 251) {
                String var3 = field313.method2385();
                long var4 = field313.method2369();
                long var6 = (long) field313.method2550();
                long var8 = (long) field313.method2367();
                class156[] var10 = new class156[] { class156.field2310, class156.field2306, class156.field2308, class156.field2307, class156.field2309 };
                class156 var11 = (class156) class113.method1576(var10, field313.method2363());
                long var12 = (var6 << 32) + var8;
                boolean var14 = false;
                for (int var15 = 0; var15 < 100; var15++) {
                    if (field490[var15] == var12) {
                        var14 = true;
                        break;
                    }
                }
                if (var11.field2313 && method752(var3)) {
                    var14 = true;
                }
                if (!var14 && field427 == 0) {
                    field490[field277] = var12;
                    field277 = (field277 + 1) % 100;
                    String var16 = class227.method3833(class167.method3283(class226.method2985(field313)));
                    if (var11.field2305 == -1) {
                        class12.method976(9, var3, var16, class166.method2669(var4));
                    } else {
                        int var17 = var11.field2305;
                        String var18 = "<img=" + var17 + ">";
                        class12.method976(9, var18 + var3, var16, class166.method2669(var4));
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 245) {
                class28 var19 = new class28();
                var19.field635 = field313.method2385();
                var19.field627 = field313.method2550();
                int var20 = field313.method2408();
                var19.field638 = var20;
                method2278(45);
                Statics.field696.method2855();
                Statics.field696 = null;
                class34.method560(var19);
                field315 = -1;
                return false;
            }
            if (field315 == 19) {
                int var21 = field313.method2559();
                int var22 = field313.method2559();
                class4 var23 = (class4) field430.method3555((long) var21);
                class4 var24 = (class4) field430.method3555((long) var22);
                if (var24 != null) {
                    Statics.method166(var24, var23 == null || var23.field59 != var24.field59);
                }
                if (var23 != null) {
                    var23.method3699();
                    field430.method3556(var23, (long) var22);
                }
                class177 var25 = class177.method1982(var21);
                if (var25 != null) {
                    method678(var25);
                }
                class177 var26 = class177.method1982(var22);
                if (var26 != null) {
                    method678(var26);
                    method98(Statics.field2909[var26.field2799 >>> 16], var26, true);
                }
                if (field513 != -1) {
                    method677(field513, 1);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 88) {
                int var27 = field313.method2526();
                int var28 = field313.method2550();
                int var29 = var28 >> 10 & 0x1F;
                int var30 = var28 >> 5 & 0x1F;
                int var31 = var28 & 0x1F;
                int var32 = (var31 << 3) + (var29 << 19) + (var30 << 11);
                class177 var33 = class177.method1982(var27);
                if (var33.field2824 != var32) {
                    var33.field2824 = var32;
                    method678(var33);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 27) {
                String var34 = field313.method2385();
                Statics.field274 = var34;
                try {
                    String var35 = Statics.field390.getParameter(class194.field3117.field3120);
                    String var36 = Statics.field390.getParameter(class194.field3114.field3120);
                    String var37 = var35 + "settings=" + var34 + "; version=1; path=/; domain=" + var36;
                    String var38;
                    if (var34.length() == 0) {
                        var38 = var37 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var38 = var37 + "; Expires=" + class115.method3753(class119.method2280() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var39 = Statics.field390;
                    String var40 = "document.cookie=\"" + var38 + "\"";
                    JSObject.getWindow(var39).eval(var40);
                } catch (Throwable var369) {
                }
                field315 = -1;
                return true;
            }
            if (field315 == 169) {
                int var42 = field313.method2390();
                int var43 = field313.method2410();
                int var44 = field313.method2540();
                class4 var45 = (class4) field430.method3555((long) var43);
                if (var45 != null) {
                    Statics.method166(var45, var45.field59 != var44);
                }
                method3158(var43, var44, var42);
                field315 = -1;
                return true;
            }
            if (field315 == 135) {
                for (int var46 = 0; var46 < field391.length; var46++) {
                    if (field391[var46] != null) {
                        field391[var46].field858 = -1;
                    }
                }
                for (int var47 = 0; var47 < field306.length; var47++) {
                    if (field306[var47] != null) {
                        field306[var47].field858 = -1;
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 190) {
                int var48 = field313.method2550();
                int var49 = field313.method2363();
                int var50 = field313.method2550();
                if (field509 != 0 && var49 != 0 && field511 < 50) {
                    field512[field511] = var48;
                    field316[field511] = var49;
                    field483[field511] = var50;
                    field516[field511] = null;
                    field515[field511] = 0;
                    field511++;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 123) {
                boolean var54 = field313.method2363() == 1;
                if (var54) {
                    Statics.field736 = class119.method2280() - field313.method2369();
                    Statics.field2005 = new class225(field313, true);
                } else {
                    Statics.field2005 = null;
                }
                field465 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 230) {
                int var55 = field313.method2536();
                boolean var56 = field313.method2363() == 1;
                String var57 = "";
                boolean var58 = false;
                if (var56) {
                    var57 = field313.method2385();
                    if (method752(var57)) {
                        var58 = true;
                    }
                }
                String var59 = field313.method2385();
                if (!var58) {
                    class12.method37(var55, var57, var59);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 11) {
                int var60 = field313.method2559();
                boolean var61 = field313.method2392() == 1;
                class177 var62 = class177.method1982(var60);
                if (var62.field2819 != var61) {
                    var62.field2819 = var61;
                    method678(var62);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 132) {
                field538 = field313.method2363();
                field488 = field313.method2363();
                field315 = -1;
                return true;
            }
            if (field315 == 43) {
                method3513(true);
                field315 = -1;
                return true;
            }
            if (field315 == 44) {
                int var63 = field313.method2540();
                int var64 = field313.method2526();
                int var65 = field313.method2540();
                int var66 = field313.method2398();
                class177 var67 = class177.method1982(var64);
                if (var67.field2850 != var66 || var67.field2851 != var63 || var67.field2853 != var65) {
                    var67.field2850 = var66;
                    var67.field2851 = var63;
                    var67.field2853 = var65;
                    method678(var67);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 143) {
                int var68 = field313.method2559();
                class177 var69 = class177.method1982(var68);
                var69.field2842 = 3;
                var69.field2858 = Statics.field1663.field27.method3305();
                method678(var69);
                field315 = -1;
                return true;
            }
            if (field315 == 185) {
                field517 = false;
                for (int var70 = 0; var70 < 5; var70++) {
                    field518[var70] = false;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 98) {
                Statics.field363 = field313.method2390();
                Statics.field1238 = field313.method2392();
                for (int var71 = Statics.field1238; var71 < Statics.field1238 + 8; var71++) {
                    for (int var72 = Statics.field363; var72 < Statics.field363 + 8; var72++) {
                        if (field401[Statics.field1239][var71][var72] != null) {
                            field401[Statics.field1239][var71][var72] = null;
                            method2298(var71, var72);
                        }
                    }
                }
                for (class17 var73 = (class17) field402.method3588(); var73 != null; var73 = (class17) field402.method3590()) {
                    if (var73.field210 >= Statics.field1238 && var73.field210 < Statics.field1238 + 8 && var73.field222 >= Statics.field363 && var73.field222 < Statics.field363 + 8 && Statics.field1239 == var73.field216) {
                        var73.field212 = 0;
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 107) {
                int var74 = field313.method2436();
                int var75 = field313.method2390();
                String var76 = field313.method2385();
                if (var74 >= 1 && var74 <= 8) {
                    if (var76.equalsIgnoreCase("null")) {
                        var76 = null;
                    }
                    field397[var74 - 1] = var76;
                    field514[var74 - 1] = var75 == 0;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 127) {
                int var77 = field313.method2398();
                int var78 = field313.method2559();
                class180.field2953[var77] = var78;
                if (class180.field2952[var77] != var78) {
                    class180.field2952[var77] = var78;
                }
                method536(var77);
                field473[++field456 - 1 & 0x1F] = var77;
                field315 = -1;
                return true;
            }
            if (field315 == 66) {
                field535 = field313.method2363();
                if (field535 == 255) {
                    field535 = 0;
                }
                field504 = field313.method2363();
                if (field504 == 255) {
                    field504 = 0;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 166) {
                Statics.method2698();
                field435 = field313.method2356();
                field333 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 99) {
                while (field313.field2028 < field314) {
                    boolean var79 = field313.method2363() == 1;
                    String var80 = field313.method2385();
                    String var81 = field313.method2385();
                    int var82 = field313.method2550();
                    int var83 = field313.method2363();
                    int var84 = field313.method2363();
                    boolean var85 = (var84 & 0x2) != 0;
                    boolean var86 = (var84 & 0x1) != 0;
                    if (var82 > 0) {
                        field313.method2385();
                        field313.method2363();
                        field313.method2408();
                    }
                    field313.method2385();
                    for (int var87 = 0; var87 < field536; var87++) {
                        class18 var88 = field464[var87];
                        if (var79) {
                            if (var81.equals(var88.field228)) {
                                var88.field228 = var80;
                                var88.field225 = var81;
                                var80 = null;
                                break;
                            }
                        } else if (var80.equals(var88.field228)) {
                            if (var88.field226 != var82) {
                                boolean var89 = true;
                                for (class41 var90 = (class41) field539.method3548(); var90 != null; var90 = (class41) field539.method3550()) {
                                    if (var90.field864.equals(var80)) {
                                        if (var82 != 0 && var90.field866 == 0) {
                                            var90.method3696();
                                            var89 = false;
                                        } else if (var82 == 0 && var90.field866 != 0) {
                                            var90.method3696();
                                            var89 = false;
                                        }
                                    }
                                }
                                if (var89) {
                                    field539.method3547(new class41(var80, var82));
                                }
                                var88.field226 = var82;
                            }
                            var88.field225 = var81;
                            var88.field229 = var83;
                            var88.field224 = var85;
                            var88.field234 = var86;
                            var80 = null;
                            break;
                        }
                    }
                    if (var80 != null && field536 < 400) {
                        class18 var91 = new class18();
                        field464[field536] = var91;
                        var91.field228 = var80;
                        var91.field225 = var81;
                        var91.field226 = var82;
                        var91.field229 = var83;
                        var91.field224 = var85;
                        var91.field234 = var86;
                        field536++;
                    }
                }
                field537 = 2;
                field462 = field454;
                boolean var92 = false;
                int var93 = field536;
                while (var93 > 0) {
                    boolean var94 = true;
                    var93--;
                    for (int var95 = 0; var95 < var93; var95++) {
                        boolean var96 = false;
                        class18 var97 = field464[var95];
                        class18 var98 = field464[var95 + 1];
                        if (field266 != var97.field226 && field266 == var98.field226) {
                            var96 = true;
                        }
                        if (!var96 && var97.field226 == 0 && var98.field226 != 0) {
                            var96 = true;
                        }
                        if (!var96 && !var97.field224 && var98.field224) {
                            var96 = true;
                        }
                        if (!var96 && !var97.field234 && var98.field234) {
                            var96 = true;
                        }
                        if (var96) {
                            class18 var99 = field464[var95];
                            field464[var95] = field464[var95 + 1];
                            field464[var95 + 1] = var99;
                            var94 = false;
                        }
                    }
                    if (var94) {
                        break;
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 56) {
                int var100 = field313.method2550();
                int var101 = field313.method2559();
                class177 var102 = class177.method1982(var101);
                if (var102.field2842 != 2 || var102.field2858 != var100) {
                    var102.field2842 = 2;
                    var102.field2858 = var100;
                    method678(var102);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 113) {
                Statics.method2698();
                int var103 = field313.method2408();
                int var104 = field313.method2390();
                int var105 = field313.method2392();
                field407[var105] = var103;
                field373[var105] = var104;
                field292[var105] = 1;
                for (int var106 = 0; var106 < 98; var106++) {
                    if (var103 >= class159.field2340[var106]) {
                        field292[var105] = var106 + 2;
                    }
                }
                field322[++field460 - 1 & 0x1F] = var105;
                field315 = -1;
                return true;
            }
            if (field315 == 69) {
                field517 = true;
                Statics.field1100 = field313.method2363();
                Statics.field128 = field313.method2363();
                Statics.field64 = field313.method2550();
                Statics.field3083 = field313.method2363();
                Statics.field1940 = field313.method2363();
                if (Statics.field1940 >= 100) {
                    int var107 = Statics.field1100 * 128 + 64;
                    int var108 = Statics.field128 * 128 + 64;
                    int var109 = method1586(var107, var108, Statics.field1239) - Statics.field64;
                    int var110 = var107 - Statics.field185;
                    int var111 = var109 - Statics.field118;
                    int var112 = var108 - Statics.field2304;
                    int var113 = (int) Math.sqrt((double) (var110 * var110 + var112 * var112));
                    Statics.field2058 = (int) (Math.atan2((double) var111, (double) var113) * 325.949D) & 0x7FF;
                    Statics.field2698 = (int) (Math.atan2((double) var110, (double) var112) * -325.949D) & 0x7FF;
                    if (Statics.field2058 < 128) {
                        Statics.field2058 = 128;
                    }
                    if (Statics.field2058 > 383) {
                        Statics.field2058 = 383;
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 183) {
                int var114 = field314 + field313.field2028;
                int var115 = field313.method2550();
                int var116 = field313.method2550();
                if (field513 != var115) {
                    field513 = var115;
                    method134(field513, Statics.field1070, Statics.field2144, false);
                    method841(field513);
                    class39.method2682(field513);
                    for (int var117 = 0; var117 < 100; var117++) {
                        field380[var117] = true;
                    }
                }
                while (var116-- > 0) {
                    int var118 = field313.method2408();
                    int var119 = field313.method2550();
                    int var120 = field313.method2363();
                    class4 var121 = (class4) field430.method3555((long) var118);
                    if (var121 != null && var121.field59 != var119) {
                        Statics.method166(var121, true);
                        var121 = null;
                    }
                    if (var121 == null) {
                        var121 = method3158(var118, var119, var120);
                    }
                    var121.field57 = true;
                }
                for (class4 var122 = (class4) field430.method3560(); var122 != null; var122 = (class4) field430.method3565()) {
                    if (var122.field57) {
                        var122.field57 = false;
                    } else {
                        Statics.method166(var122, true);
                    }
                }
                field471 = new class200(512);
                while (field313.field2028 < var114) {
                    int var123 = field313.method2408();
                    int var124 = field313.method2550();
                    int var125 = field313.method2550();
                    int var126 = field313.method2408();
                    for (int var127 = var124; var127 <= var125; var127++) {
                        long var128 = ((long) var123 << 32) + (long) var127;
                        field471.method3556(new class205(var126), var128);
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 119) {
                Statics.method2698();
                field289 = field313.method2363();
                field333 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 49) {
                for (int var130 = 0; var130 < Statics.field3278; var130++) {
                    class57 var131 = Statics.method2656(var130);
                    if (var131 != null) {
                        class180.field2953[var130] = 0;
                        class180.field2952[var130] = 0;
                    }
                }
                Statics.method2698();
                field456 += 32;
                field315 = -1;
                return true;
            }
            if (field315 == 20) {
                Statics.method2972(true);
                field313.method2631();
                int var132 = field313.method2550();
                class126 var133 = field313;
                int var134 = var133.field2028;
                class35.field751 = 0;
                int var135 = 0;
                var133.method2632();
                for (int var136 = 0; var136 < class35.field744; var136++) {
                    int var137 = class35.field740[var136];
                    if ((class35.field741[var137] & 0x1) == 0) {
                        if (var135 > 0) {
                            var135--;
                            class35.field741[var137] = (byte) (class35.field741[var137] | 0x2);
                        } else {
                            int var138 = var133.method2644(1);
                            if (var138 == 0) {
                                var135 = class35.method859(var133);
                                class35.field741[var137] = (byte) (class35.field741[var137] | 0x2);
                            } else {
                                class35.method682(var133, var137);
                            }
                        }
                    }
                }
                var133.method2633();
                if (var135 != 0) {
                    throw new RuntimeException();
                }
                var133.method2632();
                for (int var139 = 0; var139 < class35.field744; var139++) {
                    int var140 = class35.field740[var139];
                    if ((class35.field741[var140] & 0x1) != 0) {
                        if (var135 > 0) {
                            var135--;
                            class35.field741[var140] = (byte) (class35.field741[var140] | 0x2);
                        } else {
                            int var141 = var133.method2644(1);
                            if (var141 == 0) {
                                var135 = class35.method859(var133);
                                class35.field741[var140] = (byte) (class35.field741[var140] | 0x2);
                            } else {
                                class35.method682(var133, var140);
                            }
                        }
                    }
                }
                var133.method2633();
                if (var135 != 0) {
                    throw new RuntimeException();
                }
                var133.method2632();
                for (int var142 = 0; var142 < class35.field746; var142++) {
                    int var143 = class35.field755[var142];
                    if ((class35.field741[var143] & 0x1) != 0) {
                        if (var135 > 0) {
                            var135--;
                            class35.field741[var143] = (byte) (class35.field741[var143] | 0x2);
                        } else {
                            int var144 = var133.method2644(1);
                            if (var144 == 0) {
                                var135 = class35.method859(var133);
                                class35.field741[var143] = (byte) (class35.field741[var143] | 0x2);
                            } else if (class35.method183(var133, var143)) {
                                class35.field741[var143] = (byte) (class35.field741[var143] | 0x2);
                            }
                        }
                    }
                }
                var133.method2633();
                if (var135 != 0) {
                    throw new RuntimeException();
                }
                var133.method2632();
                for (int var145 = 0; var145 < class35.field746; var145++) {
                    int var146 = class35.field755[var145];
                    if ((class35.field741[var146] & 0x1) == 0) {
                        if (var135 > 0) {
                            var135--;
                            class35.field741[var146] = (byte) (class35.field741[var146] | 0x2);
                        } else {
                            int var147 = var133.method2644(1);
                            if (var147 == 0) {
                                var135 = class35.method859(var133);
                                class35.field741[var146] = (byte) (class35.field741[var146] | 0x2);
                            } else if (class35.method183(var133, var146)) {
                                class35.field741[var146] = (byte) (class35.field741[var146] | 0x2);
                            }
                        }
                    }
                }
                var133.method2633();
                if (var135 != 0) {
                    throw new RuntimeException();
                }
                class35.field744 = 0;
                class35.field746 = 0;
                for (int var148 = 1; var148 < 2048; var148++) {
                    class35.field741[var148] = (byte) (class35.field741[var148] >> 1);
                    class3 var149 = field391[var148];
                    if (var149 == null) {
                        class35.field755[++class35.field746 - 1] = var148;
                    } else {
                        class35.field740[++class35.field744 - 1] = var148;
                    }
                }
                class35.method39(var133);
                if (var133.field2028 - var134 != var132) {
                    throw new RuntimeException(var133.field2028 - var134 + " " + var132);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 209) {
                Statics.field1238 = field313.method2392();
                Statics.field363 = field313.method2436();
                while (field313.field2028 < field314) {
                    field315 = field313.method2363();
                    method2883();
                }
                field315 = -1;
                return true;
            }
            if (field315 == 60) {
                int var150 = field313.method2559();
                Statics.field1130 = Statics.field122.method2756(var150);
                field315 = -1;
                return true;
            }
            if (field315 == 253) {
                int var151 = field313.method2559();
                class177 var152 = class177.method1982(var151);
                for (int var153 = 0; var153 < var152.field2920.length; var153++) {
                    var152.field2920[var153] = -1;
                    var152.field2920[var153] = 0;
                }
                method678(var152);
                field315 = -1;
                return true;
            }
            if (field315 == 213) {
                String var154 = field313.method2385();
                Object[] var155 = new Object[var154.length() + 1];
                for (int var156 = var154.length() - 1; var156 >= 0; var156--) {
                    if (var154.charAt(var156) == 's') {
                        var155[var156 + 1] = field313.method2385();
                    } else {
                        var155[var156 + 1] = Integer.valueOf(field313.method2408());
                    }
                }
                var155[0] = Integer.valueOf(field313.method2408());
                class1 var157 = new class1();
                var157.field6 = var155;
                class39.method742(var157);
                field315 = -1;
                return true;
            }
            if (field315 == 51) {
                field313.field2028 += 28;
                if (field313.method2384()) {
                    class153.method2749(field313, field313.field2028 - 28);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 241) {
                String var158 = field313.method2385();
                int var159 = field313.method2550();
                byte var160 = field313.method2483();
                boolean var161 = false;
                if (var160 == -128) {
                    var161 = true;
                }
                if (var161) {
                    if (Statics.field765 == 0) {
                        field315 = -1;
                        return true;
                    }
                    boolean var162 = false;
                    int var163;
                    for (var163 = 0; var163 < Statics.field765 && (!Statics.field1817[var163].field609.equals(var158) || Statics.field1817[var163].field612 != var159); var163++) {
                    }
                    if (var163 < Statics.field765) {
                        while (var163 < Statics.field765 - 1) {
                            Statics.field1817[var163] = Statics.field1817[var163 + 1];
                            var163++;
                        }
                        Statics.field765--;
                        Statics.field1817[Statics.field765] = null;
                    }
                } else {
                    field313.method2385();
                    class26 var164 = new class26();
                    var164.field609 = var158;
                    var164.field610 = class168.method175(var164.field609, Statics.field519);
                    var164.field612 = var159;
                    var164.field611 = var160;
                    int var165;
                    for (var165 = Statics.field765 - 1; var165 >= 0; var165--) {
                        int var166 = Statics.field1817[var165].field610.compareTo(var164.field610);
                        if (var166 == 0) {
                            Statics.field1817[var165].field612 = var159;
                            Statics.field1817[var165].field611 = var160;
                            if (var158.equals(Statics.field1663.field30)) {
                                Statics.field12 = var160;
                            }
                            field463 = field454;
                            field315 = -1;
                            return true;
                        }
                        if (var166 < 0) {
                            break;
                        }
                    }
                    if (Statics.field765 >= Statics.field1817.length) {
                        field315 = -1;
                        return true;
                    }
                    for (int var167 = Statics.field765 - 1; var167 > var165; var167--) {
                        Statics.field1817[var167 + 1] = Statics.field1817[var167];
                    }
                    if (Statics.field765 == 0) {
                        Statics.field1817 = new class26[100];
                    }
                    Statics.field1817[var165 + 1] = var164;
                    Statics.field765++;
                    if (var158.equals(Statics.field1663.field30)) {
                        Statics.field12 = var160;
                    }
                }
                field463 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 33) {
                int var168 = field313.method2363();
                int var169 = field313.method2363();
                int var170 = field313.method2363();
                int var171 = field313.method2363();
                field518[var168] = true;
                field527[var168] = var169;
                field520[var168] = var170;
                field356[var168] = var171;
                field522[var168] = 0;
                field315 = -1;
                return true;
            }
            if (field315 == 63) {
                Statics.field363 = field313.method2390();
                Statics.field1238 = field313.method2363();
                field315 = -1;
                return true;
            }
            if (field315 == 237) {
                field291 = field313.method2398() * 30;
                field333 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 85) {
                Statics.method2972(false);
                field313.method2631();
                int var172 = field313.method2550();
                class126 var173 = field313;
                int var174 = var173.field2028;
                class35.field751 = 0;
                int var175 = 0;
                var173.method2632();
                for (int var176 = 0; var176 < class35.field744; var176++) {
                    int var177 = class35.field740[var176];
                    if ((class35.field741[var177] & 0x1) == 0) {
                        if (var175 > 0) {
                            var175--;
                            class35.field741[var177] = (byte) (class35.field741[var177] | 0x2);
                        } else {
                            int var178 = var173.method2644(1);
                            if (var178 == 0) {
                                var175 = class35.method859(var173);
                                class35.field741[var177] = (byte) (class35.field741[var177] | 0x2);
                            } else {
                                class35.method682(var173, var177);
                            }
                        }
                    }
                }
                var173.method2633();
                if (var175 != 0) {
                    throw new RuntimeException();
                }
                var173.method2632();
                for (int var179 = 0; var179 < class35.field744; var179++) {
                    int var180 = class35.field740[var179];
                    if ((class35.field741[var180] & 0x1) != 0) {
                        if (var175 > 0) {
                            var175--;
                            class35.field741[var180] = (byte) (class35.field741[var180] | 0x2);
                        } else {
                            int var181 = var173.method2644(1);
                            if (var181 == 0) {
                                var175 = class35.method859(var173);
                                class35.field741[var180] = (byte) (class35.field741[var180] | 0x2);
                            } else {
                                class35.method682(var173, var180);
                            }
                        }
                    }
                }
                var173.method2633();
                if (var175 != 0) {
                    throw new RuntimeException();
                }
                var173.method2632();
                for (int var182 = 0; var182 < class35.field746; var182++) {
                    int var183 = class35.field755[var182];
                    if ((class35.field741[var183] & 0x1) != 0) {
                        if (var175 > 0) {
                            var175--;
                            class35.field741[var183] = (byte) (class35.field741[var183] | 0x2);
                        } else {
                            int var184 = var173.method2644(1);
                            if (var184 == 0) {
                                var175 = class35.method859(var173);
                                class35.field741[var183] = (byte) (class35.field741[var183] | 0x2);
                            } else if (class35.method183(var173, var183)) {
                                class35.field741[var183] = (byte) (class35.field741[var183] | 0x2);
                            }
                        }
                    }
                }
                var173.method2633();
                if (var175 != 0) {
                    throw new RuntimeException();
                }
                var173.method2632();
                for (int var185 = 0; var185 < class35.field746; var185++) {
                    int var186 = class35.field755[var185];
                    if ((class35.field741[var186] & 0x1) == 0) {
                        if (var175 > 0) {
                            var175--;
                            class35.field741[var186] = (byte) (class35.field741[var186] | 0x2);
                        } else {
                            int var187 = var173.method2644(1);
                            if (var187 == 0) {
                                var175 = class35.method859(var173);
                                class35.field741[var186] = (byte) (class35.field741[var186] | 0x2);
                            } else if (class35.method183(var173, var186)) {
                                class35.field741[var186] = (byte) (class35.field741[var186] | 0x2);
                            }
                        }
                    }
                }
                var173.method2633();
                if (var175 != 0) {
                    throw new RuntimeException();
                }
                class35.field744 = 0;
                class35.field746 = 0;
                for (int var188 = 1; var188 < 2048; var188++) {
                    class35.field741[var188] = (byte) (class35.field741[var188] >> 1);
                    class3 var189 = field391[var188];
                    if (var189 == null) {
                        class35.field755[++class35.field746 - 1] = var188;
                    } else {
                        class35.field740[++class35.field744 - 1] = var188;
                    }
                }
                class35.method39(var173);
                if (var173.field2028 - var174 != var172) {
                    throw new RuntimeException(var173.field2028 - var174 + " " + var172);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 145) {
                class35.method601();
                for (int var190 = 0; var190 < 2048; var190++) {
                    field391[var190] = null;
                }
                class35.method104(field313);
                field315 = -1;
                return true;
            }
            if (field315 == 201) {
                int var191 = field313.method2356();
                int var192 = field313.method2408();
                class177 var193 = class177.method1982(var192);
                if (var193.field2846 != var191 || var191 == -1) {
                    var193.field2846 = var191;
                    var193.field2812 = 0;
                    var193.field2922 = 0;
                    method678(var193);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 206) {
                while (field313.field2028 < field314) {
                    int var194 = field313.method2363();
                    boolean var195 = (var194 & 0x1) == 1;
                    String var196 = field313.method2385();
                    String var197 = field313.method2385();
                    field313.method2385();
                    for (int var198 = 0; var198 < field378; var198++) {
                        class8 var199 = field541[var198];
                        if (var195) {
                            if (var197.equals(var199.field121)) {
                                var199.field121 = var196;
                                var199.field117 = var197;
                                var196 = null;
                                break;
                            }
                        } else if (var196.equals(var199.field121)) {
                            var199.field121 = var196;
                            var199.field117 = var197;
                            var196 = null;
                            break;
                        }
                    }
                    if (var196 != null && field378 < 400) {
                        class8 var200 = new class8();
                        field541[field378] = var200;
                        var200.field121 = var196;
                        var200.field117 = var197;
                        field378++;
                    }
                }
                field462 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 22) {
                if (field513 != -1) {
                    int var201 = field513;
                    if (class177.method3203(var201)) {
                        method2279(Statics.field2909[var201], 0);
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 219) {
                method3513(false);
                field315 = -1;
                return true;
            }
            if (field315 == 92) {
                field311 = field313.method2363();
                if (field311 == 1) {
                    field286 = field313.method2550();
                }
                if (field311 >= 2 && field311 <= 6) {
                    if (field311 == 2) {
                        field287 = 64;
                        field351 = 64;
                    }
                    if (field311 == 3) {
                        field287 = 0;
                        field351 = 64;
                    }
                    if (field311 == 4) {
                        field287 = 128;
                        field351 = 64;
                    }
                    if (field311 == 5) {
                        field287 = 64;
                        field351 = 0;
                    }
                    if (field311 == 6) {
                        field287 = 64;
                        field351 = 128;
                    }
                    field311 = 2;
                    field288 = field313.method2550();
                    field434 = field313.method2550();
                    field551 = field313.method2363();
                }
                if (field311 == 10) {
                    field418 = field313.method2550();
                }
                field315 = -1;
                return true;
            }
            if (field315 == 5) {
                int var202 = field313.method2398();
                int var203 = field313.method2526();
                class177 var204 = class177.method1982(var203);
                if (var204.field2842 != 1 || var204.field2858 != var202) {
                    var204.field2842 = 1;
                    var204.field2858 = var202;
                    method678(var204);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 71) {
                int var205 = field313.method2398();
                field513 = var205;
                method134(field513, Statics.field1070, Statics.field2144, false);
                method841(var205);
                class39.method2682(field513);
                for (int var206 = 0; var206 < 100; var206++) {
                    field380[var206] = true;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 9) {
                int var207 = field313.method2526();
                int var208 = field313.method2399();
                int var209 = field313.method2399();
                class177 var210 = class177.method1982(var207);
                var210.field2860 = (var208 << 16) + var209;
                field315 = -1;
                return true;
            }
            if (field315 == 232) {
                int var211 = field313.method2363();
                class134[] var212 = class134.method1798();
                int var213 = 0;
                class134 var215;
                while (true) {
                    if (var213 >= var212.length) {
                        var215 = null;
                        break;
                    }
                    class134 var214 = var212[var213];
                    if (var214.field2099 == var211) {
                        var215 = var214;
                        break;
                    }
                    var213++;
                }
                Statics.field3170 = var215;
                field315 = -1;
                return true;
            }
            if (field315 == 214) {
                int var216 = field313.method2540();
                int var217 = field313.method2410();
                class177 var218 = class177.method1982(var217);
                if (var218 != null && var218.field2801 == 0) {
                    if (var216 > var218.field2818 - var218.field2921) {
                        var216 = var218.field2818 - var218.field2921;
                    }
                    if (var216 < 0) {
                        var216 = 0;
                    }
                    if (var218.field2821 != var216) {
                        var218.field2821 = var216;
                        method678(var218);
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 87) {
                field327 = field313.method2363();
                field315 = -1;
                return true;
            }
            if (field315 == 62) {
                field517 = true;
                Statics.field576 = field313.method2363();
                Statics.field1139 = field313.method2363();
                Statics.field149 = field313.method2550();
                Statics.field13 = field313.method2363();
                Statics.field24 = field313.method2363();
                if (Statics.field24 >= 100) {
                    Statics.field185 = Statics.field576 * 128 + 64;
                    Statics.field2304 = Statics.field1139 * 128 + 64;
                    Statics.field118 = method1586(Statics.field185, Statics.field2304, Statics.field1239) - Statics.field149;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 121) {
                method2969();
                field315 = -1;
                return false;
            }
            if (field315 == 110 || field315 == 249 || field315 == 186 || field315 == 109 || field315 == 68 || field315 == 41 || field315 == 17 || field315 == 53 || field315 == 250 || field315 == 35) {
                method2883();
                field315 = -1;
                return true;
            }
            if (field315 == 247) {
                field463 = field454;
                if (field314 == 0) {
                    field496 = null;
                    field497 = null;
                    Statics.field765 = 0;
                    Statics.field1817 = null;
                    field315 = -1;
                    return true;
                }
                field497 = field313.method2385();
                long var219 = field313.method2369();
                long var221 = var219;
                String var223;
                if (var219 <= 0L || var219 >= 6582952005840035281L) {
                    var223 = null;
                } else if (var219 % 37L == 0L) {
                    var223 = null;
                } else {
                    int var224 = 0;
                    for (long var225 = var219; var225 != 0L; var225 /= 37L) {
                        var224++;
                    }
                    StringBuilder var227 = new StringBuilder(var224);
                    while (var221 != 0L) {
                        long var228 = var221;
                        var221 /= 37L;
                        var227.append(class166.field2696[(int) (var228 - var221 * 37L)]);
                    }
                    var223 = var227.reverse().toString();
                }
                field496 = var223;
                Statics.field994 = field313.method2483();
                int var230 = field313.method2363();
                if (var230 == 255) {
                    field315 = -1;
                    return true;
                }
                Statics.field765 = var230;
                class26[] var231 = new class26[100];
                for (int var232 = 0; var232 < Statics.field765; var232++) {
                    var231[var232] = new class26();
                    var231[var232].field609 = field313.method2385();
                    var231[var232].field610 = class168.method175(var231[var232].field609, Statics.field519);
                    var231[var232].field612 = field313.method2550();
                    var231[var232].field611 = field313.method2483();
                    field313.method2385();
                    if (var231[var232].field609.equals(Statics.field1663.field30)) {
                        Statics.field12 = var231[var232].field611;
                    }
                }
                boolean var233 = false;
                int var234 = Statics.field765;
                while (var234 > 0) {
                    boolean var235 = true;
                    var234--;
                    for (int var236 = 0; var236 < var234; var236++) {
                        if (var231[var236].field610.compareTo(var231[var236 + 1].field610) > 0) {
                            class26 var237 = var231[var236];
                            var231[var236] = var231[var236 + 1];
                            var231[var236 + 1] = var237;
                            var235 = false;
                        }
                    }
                    if (var235) {
                        break;
                    }
                }
                Statics.field1817 = var231;
                field315 = -1;
                return true;
            }
            if (field315 == 117) {
                int var238 = field313.method2410();
                String var239 = field313.method2385();
                class177 var240 = class177.method1982(var238);
                if (!var239.equals(var240.field2859)) {
                    var240.field2859 = var239;
                    method678(var240);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 161) {
                int var241 = field313.method2550();
                if (var241 == 65535) {
                    var241 = -1;
                }
                int var242 = field313.method2526();
                int var243 = field313.method2526();
                class177 var244 = class177.method1982(var242);
                if (var244.field2798) {
                    var244.field2892 = var241;
                    var244.field2916 = var243;
                    class56 var246 = class56.method3201(var241);
                    var244.field2850 = var246.field1184;
                    var244.field2851 = var246.field1158;
                    var244.field2852 = var246.field1160;
                    var244.field2788 = var246.field1156;
                    var244.field2848 = var246.field1187;
                    var244.field2853 = var246.field1152;
                    if (var246.field1162 == 1) {
                        var244.field2857 = 1;
                    } else {
                        var244.field2857 = 2;
                    }
                    if (var244.field2854 > 0) {
                        var244.field2853 = var244.field2853 * 32 / var244.field2854;
                    } else if (var244.field2806 > 0) {
                        var244.field2853 = var244.field2853 * 32 / var244.field2806;
                    }
                    method678(var244);
                } else if (var241 == -1) {
                    var244.field2842 = 0;
                    field315 = -1;
                    return true;
                } else {
                    class56 var245 = class56.method3201(var241);
                    var244.field2842 = 4;
                    var244.field2858 = var241;
                    var244.field2850 = var245.field1184;
                    var244.field2851 = var245.field1158;
                    var244.field2853 = var245.field1152 * 100 / var243;
                    method678(var244);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 171) {
                String var247 = field313.method2385();
                long var248 = (long) field313.method2550();
                long var250 = (long) field313.method2367();
                class156[] var252 = new class156[] { class156.field2310, class156.field2306, class156.field2308, class156.field2307, class156.field2309 };
                class156 var253 = (class156) class113.method1576(var252, field313.method2363());
                long var254 = (var248 << 32) + var250;
                boolean var256 = false;
                for (int var257 = 0; var257 < 100; var257++) {
                    if (field490[var257] == var254) {
                        var256 = true;
                        break;
                    }
                }
                if (method752(var247)) {
                    var256 = true;
                }
                if (!var256 && field427 == 0) {
                    field490[field277] = var254;
                    field277 = (field277 + 1) % 100;
                    String var258 = class227.method3833(class167.method3283(class226.method2985(field313)));
                    byte var259;
                    if (var253.field2315) {
                        var259 = 7;
                    } else {
                        var259 = 3;
                    }
                    if (var253.field2305 == -1) {
                        class12.method37(var259, var247, var258);
                    } else {
                        int var261 = var253.field2305;
                        String var262 = "<img=" + var261 + ">";
                        class12.method37(var259, var262 + var247, var258);
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 153) {
                int var263 = field313.method2559();
                int var264 = field313.method2398();
                if (var264 == 65535) {
                    var264 = -1;
                }
                int var265 = field313.method2540();
                if (var265 == 65535) {
                    var265 = -1;
                }
                int var266 = field313.method2408();
                for (int var267 = var264; var267 <= var265; var267++) {
                    long var268 = ((long) var263 << 32) + (long) var267;
                    class212 var270 = field471.method3555(var268);
                    if (var270 != null) {
                        var270.method3699();
                    }
                    field471.method3556(new class205(var266), var268);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 231) {
                int var271 = field313.method2402();
                int var272 = field313.method2559();
                int var273 = field313.method2401();
                class177 var274 = class177.method1982(var272);
                if (var274.field2808 != var273 || var274.field2809 != var271 || var274.field2804 != 0 || var274.field2805 != 0) {
                    var274.field2808 = var273;
                    var274.field2809 = var271;
                    var274.field2804 = 0;
                    var274.field2805 = 0;
                    method678(var274);
                    method1045(var274);
                    if (var274.field2801 == 0) {
                        method98(Statics.field2909[var272 >> 16], var274, false);
                    }
                }
                field315 = -1;
                return true;
            }
            if (field315 == 199) {
                String var275 = field313.method2385();
                String var276 = class227.method3833(class167.method3283(class226.method2985(field313)));
                class12.method37(6, var275, var276);
                field315 = -1;
                return true;
            }
            if (field315 == 136) {
                int var277 = field313.method2550();
                if (var277 == 65535) {
                    var277 = -1;
                }
                method2719(var277);
                field315 = -1;
                return true;
            }
            if (field315 == 216) {
                int var278 = field313.method2455();
                int var279 = field313.method2540();
                if (var279 == 65535) {
                    var279 = -1;
                }
                if (field425 != 0 && var279 != -1) {
                    class187.method986(Statics.field2034, var279, 0, field425, false);
                    field508 = true;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 114) {
                int var280 = field313.method2408();
                class4 var281 = (class4) field430.method3555((long) var280);
                if (var281 != null) {
                    Statics.method166(var281, true);
                }
                if (field433 != null) {
                    method678(field433);
                    field433 = null;
                }
                field315 = -1;
                return true;
            }
            if (field315 == 197) {
                int var282 = field313.method2408();
                int var283 = field313.method2550();
                if (var282 < -70000) {
                    var283 += 32768;
                }
                class177 var284;
                if (var282 >= 0) {
                    var284 = class177.method1982(var282);
                } else {
                    var284 = null;
                }
                while (field313.field2028 < field314) {
                    int var285 = field313.method2536();
                    int var286 = field313.method2550();
                    int var287 = 0;
                    if (var286 != 0) {
                        var287 = field313.method2363();
                        if (var287 == 255) {
                            var287 = field313.method2408();
                        }
                    }
                    if (var284 != null && var285 >= 0 && var285 < var284.field2920.length) {
                        var284.field2920[var285] = var286;
                        var284.field2918[var285] = var287;
                    }
                    class16.method650(var283, var285, var286 - 1, var287);
                }
                if (var284 != null) {
                    method678(var284);
                }
                Statics.method2698();
                field457[++field458 - 1 & 0x1F] = var283 & 0x7FFF;
                field315 = -1;
                return true;
            }
            if (field315 == 125) {
                field537 = 1;
                field462 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 93) {
                byte var288 = field313.method2393();
                int var289 = field313.method2550();
                class180.field2953[var289] = var288;
                if (class180.field2952[var289] != var288) {
                    class180.field2952[var289] = var288;
                }
                method536(var289);
                field473[++field456 - 1 & 0x1F] = var289;
                field315 = -1;
                return true;
            }
            if (field315 == 67) {
                int var290 = field313.method2408();
                int var291 = field313.method2550();
                if (var290 < -70000) {
                    var291 += 32768;
                }
                class177 var292;
                if (var290 >= 0) {
                    var292 = class177.method1982(var290);
                } else {
                    var292 = null;
                }
                if (var292 != null) {
                    for (int var293 = 0; var293 < var292.field2920.length; var293++) {
                        var292.field2920[var293] = 0;
                        var292.field2918[var293] = 0;
                    }
                }
                class16 var294 = (class16) class16.field207.method3555((long) var291);
                if (var294 != null) {
                    for (int var295 = 0; var295 < var294.field202.length; var295++) {
                        var294.field202[var295] = -1;
                        var294.field203[var295] = 0;
                    }
                }
                int var296 = field313.method2550();
                for (int var297 = 0; var297 < var296; var297++) {
                    int var298 = field313.method2392();
                    if (var298 == 255) {
                        var298 = field313.method2526();
                    }
                    int var299 = field313.method2550();
                    if (var292 != null && var297 < var292.field2920.length) {
                        var292.field2920[var297] = var299;
                        var292.field2918[var297] = var298;
                    }
                    class16.method650(var291, var297, var299 - 1, var298);
                }
                if (var292 != null) {
                    method678(var292);
                }
                Statics.method2698();
                field457[++field458 - 1 & 0x1F] = var291 & 0x7FFF;
                field315 = -1;
                return true;
            }
            if (field315 == 100) {
                class126 var300 = field313;
                int var301 = field314;
                int var302 = var300.field2028;
                class35.field751 = 0;
                int var303 = 0;
                var300.method2632();
                for (int var304 = 0; var304 < class35.field744; var304++) {
                    int var305 = class35.field740[var304];
                    if ((class35.field741[var305] & 0x1) == 0) {
                        if (var303 > 0) {
                            var303--;
                            class35.field741[var305] = (byte) (class35.field741[var305] | 0x2);
                        } else {
                            int var306 = var300.method2644(1);
                            if (var306 == 0) {
                                var303 = class35.method859(var300);
                                class35.field741[var305] = (byte) (class35.field741[var305] | 0x2);
                            } else {
                                class35.method682(var300, var305);
                            }
                        }
                    }
                }
                var300.method2633();
                if (var303 != 0) {
                    throw new RuntimeException();
                }
                var300.method2632();
                for (int var307 = 0; var307 < class35.field744; var307++) {
                    int var308 = class35.field740[var307];
                    if ((class35.field741[var308] & 0x1) != 0) {
                        if (var303 > 0) {
                            var303--;
                            class35.field741[var308] = (byte) (class35.field741[var308] | 0x2);
                        } else {
                            int var309 = var300.method2644(1);
                            if (var309 == 0) {
                                var303 = class35.method859(var300);
                                class35.field741[var308] = (byte) (class35.field741[var308] | 0x2);
                            } else {
                                class35.method682(var300, var308);
                            }
                        }
                    }
                }
                var300.method2633();
                if (var303 != 0) {
                    throw new RuntimeException();
                }
                var300.method2632();
                for (int var310 = 0; var310 < class35.field746; var310++) {
                    int var311 = class35.field755[var310];
                    if ((class35.field741[var311] & 0x1) != 0) {
                        if (var303 > 0) {
                            var303--;
                            class35.field741[var311] = (byte) (class35.field741[var311] | 0x2);
                        } else {
                            int var312 = var300.method2644(1);
                            if (var312 == 0) {
                                var303 = class35.method859(var300);
                                class35.field741[var311] = (byte) (class35.field741[var311] | 0x2);
                            } else if (class35.method183(var300, var311)) {
                                class35.field741[var311] = (byte) (class35.field741[var311] | 0x2);
                            }
                        }
                    }
                }
                var300.method2633();
                if (var303 != 0) {
                    throw new RuntimeException();
                }
                var300.method2632();
                for (int var313 = 0; var313 < class35.field746; var313++) {
                    int var314 = class35.field755[var313];
                    if ((class35.field741[var314] & 0x1) == 0) {
                        if (var303 > 0) {
                            var303--;
                            class35.field741[var314] = (byte) (class35.field741[var314] | 0x2);
                        } else {
                            int var315 = var300.method2644(1);
                            if (var315 == 0) {
                                var303 = class35.method859(var300);
                                class35.field741[var314] = (byte) (class35.field741[var314] | 0x2);
                            } else if (class35.method183(var300, var314)) {
                                class35.field741[var314] = (byte) (class35.field741[var314] | 0x2);
                            }
                        }
                    }
                }
                var300.method2633();
                if (var303 != 0) {
                    throw new RuntimeException();
                }
                class35.field744 = 0;
                class35.field746 = 0;
                for (int var316 = 1; var316 < 2048; var316++) {
                    class35.field741[var316] = (byte) (class35.field741[var316] >> 1);
                    class3 var317 = field391[var316];
                    if (var317 == null) {
                        class35.field755[++class35.field746 - 1] = var316;
                    } else {
                        class35.field740[++class35.field744 - 1] = var316;
                    }
                }
                class35.method39(var300);
                if (var300.field2028 - var302 != var301) {
                    throw new RuntimeException(var300.field2028 - var302 + " " + var301);
                }
                field315 = -1;
                return true;
            }
            if (field315 == 32) {
                int var318 = field313.method2363();
                if (field313.method2363() == 0) {
                    field545[var318] = new class224();
                    field313.field2028 += 18;
                } else {
                    field313.field2028--;
                    field545[var318] = new class224(field313, false);
                }
                field285 = field454;
                field315 = -1;
                return true;
            }
            if (field315 == 72) {
                int var319 = field313.method2408();
                int var320 = field313.method2408();
                if (Statics.field2756 == null || !Statics.field2756.isValid()) {
                    try {
                        Iterator var321 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var321.hasNext()) {
                            GarbageCollectorMXBean var322 = (GarbageCollectorMXBean) var321.next();
                            if (var322.isValid()) {
                                Statics.field2756 = var322;
                                field547 = -1L;
                                field546 = -1L;
                            }
                        }
                    } catch (Throwable var375) {
                    }
                }
                long var324 = class119.method2280();
                int var326 = -1;
                if (Statics.field2756 != null) {
                    long var327 = Statics.field2756.getCollectionTime();
                    if (field546 != -1L) {
                        long var329 = var327 - field546;
                        long var331 = var324 - field547;
                        if (var331 != 0L) {
                            var326 = (int) (var329 * 100L / var331);
                        }
                    }
                    field546 = var327;
                    field547 = var324;
                }
                field301.method2630(106);
                field301.method2524(var319);
                field301.method2406(var320);
                field301.method2387(field2237);
                field301.method2493(var326);
                field315 = -1;
                return true;
            }
            if (field315 == 54) {
                class126 var333 = field313;
                int var334 = field314;
                class214 var335 = new class214();
                var335.field3172 = var333.method2363();
                var335.field3174 = var333.method2408();
                var335.field3173 = new int[var335.field3172];
                var335.field3177 = new int[var335.field3172];
                var335.field3175 = new Field[var335.field3172];
                var335.field3176 = new int[var335.field3172];
                var335.field3179 = new Method[var335.field3172];
                var335.field3178 = new byte[var335.field3172][][];
                for (int var336 = 0; var336 < var335.field3172; var336++) {
                    try {
                        int var337 = var333.method2363();
                        if (var337 == 0 || var337 == 1 || var337 == 2) {
                            String var338 = var333.method2385();
                            String var339 = var333.method2385();
                            int var340 = 0;
                            if (var337 == 1) {
                                var340 = var333.method2408();
                            }
                            var335.field3173[var336] = var337;
                            var335.field3176[var336] = var340;
                            if (class215.method588(var338).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var335.field3175[var336] = class215.method588(var338).getDeclaredField(var339);
                        } else if (var337 == 3 || var337 == 4) {
                            String var341 = var333.method2385();
                            String var342 = var333.method2385();
                            int var343 = var333.method2363();
                            String[] var344 = new String[var343];
                            for (int var345 = 0; var345 < var343; var345++) {
                                var344[var345] = var333.method2385();
                            }
                            String var346 = var333.method2385();
                            byte[][] var347 = new byte[var343][];
                            if (var337 == 3) {
                                for (int var348 = 0; var348 < var343; var348++) {
                                    int var349 = var333.method2408();
                                    var347[var348] = new byte[var349];
                                    var333.method2374(var347[var348], 0, var349);
                                }
                            }
                            var335.field3173[var336] = var337;
                            Class[] var350 = new Class[var343];
                            for (int var351 = 0; var351 < var343; var351++) {
                                var350[var351] = class215.method588(var344[var351]);
                            }
                            Class var352 = class215.method588(var346);
                            if (class215.method588(var341).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var353 = class215.method588(var341).getDeclaredMethods();
                            Method[] var354 = var353;
                            for (int var355 = 0; var355 < var354.length; var355++) {
                                Method var356 = var354[var355];
                                if (var356.getName().equals(var342)) {
                                    Class[] var357 = var356.getParameterTypes();
                                    if (var350.length == var357.length) {
                                        boolean var358 = true;
                                        for (int var359 = 0; var359 < var350.length; var359++) {
                                            if (var350[var359] != var357[var359]) {
                                                var358 = false;
                                                break;
                                            }
                                        }
                                        if (var358 && var352 == var356.getReturnType()) {
                                            var335.field3179[var336] = var356;
                                        }
                                    }
                                }
                            }
                            var335.field3178[var336] = var347;
                        }
                    } catch (ClassNotFoundException var370) {
                        var335.field3177[var336] = -1;
                    } catch (SecurityException var371) {
                        var335.field3177[var336] = -2;
                    } catch (NullPointerException var372) {
                        var335.field3177[var336] = -3;
                    } catch (Exception var373) {
                        var335.field3177[var336] = -4;
                    } catch (Throwable var374) {
                        var335.field3177[var336] = -5;
                    }
                }
                class215.field3182.method3627(var335);
                field315 = -1;
                return true;
            }
            class152.method2846("" + field315 + class2.field15 + field319 + class2.field15 + field320 + class2.field15 + field314, (Throwable) null);
            method2969();
        } catch (IOException var376) {
            if (field549 > 0) {
                method2969();
            } else {
                method2278(40);
                Statics.field1395 = Statics.field696;
                Statics.field696 = null;
            }
        } catch (Exception var377) {
            String var367 = "" + field315 + class2.field15 + field319 + class2.field15 + field320 + class2.field15 + field314 + class2.field15 + (Statics.field590 + Statics.field1663.field857[0]) + class2.field15 + (Statics.field133 + Statics.field1663.field831[0]) + class2.field15;
            for (int var368 = 0; var368 < field314 && var368 < 50; var368++) {
                var367 = var367 + field313.field2033[var368] + class2.field15;
            }
            class152.method2846(var367, var377);
            method2969();
        }
        return true;
    }

    @ObfuscatedName("ek.bo(I)V")
    public static final void method2883() {
        if (field315 == 41) {
            int var0 = field313.method2550();
            int var1 = field313.method2392();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1238;
            int var3 = (var1 & 0x7) + Statics.field363;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class203 var4 = field401[Statics.field1239][var2][var3];
                if (var4 != null) {
                    for (class31 var5 = (class31) var4.method3588(); var5 != null; var5 = (class31) var4.method3590()) {
                        if ((var0 & 0x7FFF) == var5.field675) {
                            var5.method3699();
                            break;
                        }
                    }
                    if (var4.method3588() == null) {
                        field401[Statics.field1239][var2][var3] = null;
                    }
                    method2298(var2, var3);
                }
            }
        } else if (field315 == 250) {
            int var6 = field313.method2363();
            int var7 = (var6 >> 4 & 0x7) + Statics.field1238;
            int var8 = (var6 & 0x7) + Statics.field363;
            int var9 = field313.method2363();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field332[var10];
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method165(Statics.field1239, var7, var8, var12, -1, var10, var11, 0, -1);
            }
        } else if (field315 == 249) {
            int var13 = field313.method2363();
            int var14 = (var13 >> 4 & 0x7) + Statics.field1238;
            int var15 = (var13 & 0x7) + Statics.field363;
            int var16 = field313.method2550();
            int var17 = field313.method2550();
            int var18 = field313.method2550();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class203 var19 = field401[Statics.field1239][var14][var15];
                if (var19 != null) {
                    for (class31 var20 = (class31) var19.method3588(); var20 != null; var20 = (class31) var19.method3590()) {
                        if ((var16 & 0x7FFF) == var20.field675 && var20.field672 == var17) {
                            var20.field672 = var18;
                            break;
                        }
                    }
                    method2298(var14, var15);
                }
            }
        } else if (field315 == 35) {
            int var21 = field313.method2363();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field332[var22];
            int var25 = field313.method2392();
            int var26 = (var25 >> 4 & 0x7) + Statics.field1238;
            int var27 = (var25 & 0x7) + Statics.field363;
            int var28 = field313.method2399();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                method165(Statics.field1239, var26, var27, var24, var28, var22, var23, 0, -1);
            }
        } else if (field315 == 68) {
            int var29 = field313.method2363();
            int var30 = (var29 >> 4 & 0x7) + Statics.field1238;
            int var31 = (var29 & 0x7) + Statics.field363;
            int var32 = var30 + field313.method2483();
            int var33 = var31 + field313.method2483();
            int var34 = field313.method2356();
            int var35 = field313.method2550();
            int var36 = field313.method2363() * 4;
            int var37 = field313.method2363() * 4;
            int var38 = field313.method2550();
            int var39 = field313.method2550();
            int var40 = field313.method2363();
            int var41 = field313.method2363();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                int var42 = var30 * 128 + 64;
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                class7 var46 = new class7(var35, Statics.field1239, var42, var43, method1586(var42, var43, Statics.field1239) - var36, field326 + var38, field326 + var39, var40, var41, var34, var37);
                var46.method91(var44, var45, method1586(var44, var45, Statics.field1239) - var37, field326 + var38);
                field403.method3581(var46);
            }
        } else {
            if (field315 == 186) {
                byte var47 = field313.method2483();
                int var48 = field313.method2399();
                int var49 = field313.method2398();
                int var50 = field313.method2398();
                int var51 = field313.method2392();
                int var52 = (var51 >> 4 & 0x7) + Statics.field1238;
                int var53 = (var51 & 0x7) + Statics.field363;
                int var54 = field313.method2399();
                byte var55 = field313.method2557();
                byte var56 = field313.method2393();
                byte var57 = field313.method2557();
                int var58 = field313.method2390();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field332[var59];
                class3 var62;
                if (field382 == var48) {
                    var62 = Statics.field1663;
                } else {
                    var62 = field391[var48];
                }
                if (var62 != null) {
                    class43 var63 = class43.method768(var49);
                    int var64;
                    int var65;
                    if (var60 == 1 || var60 == 3) {
                        var64 = var63.field925;
                        var65 = var63.field924;
                    } else {
                        var64 = var63.field924;
                        var65 = var63.field925;
                    }
                    int var66 = (var64 >> 1) + var52;
                    int var67 = (var64 + 1 >> 1) + var52;
                    int var68 = (var65 >> 1) + var53;
                    int var69 = (var65 + 1 >> 1) + var53;
                    int[][] var70 = class6.field83[Statics.field1239];
                    int var71 = var70[var66][var68] + var70[var67][var68] + var70[var66][var69] + var70[var67][var69] >> 2;
                    int var72 = (var52 << 7) + (var64 << 6);
                    int var73 = (var53 << 7) + (var65 << 6);
                    class109 var74 = var63.method804(var59, var60, var70, var72, var71, var73);
                    if (var74 != null) {
                        method165(Statics.field1239, var52, var53, var61, -1, 0, 0, var54 + 1, var50 + 1);
                        var62.field40 = field326 + var54;
                        var62.field36 = field326 + var50;
                        var62.field46 = var74;
                        var62.field45 = var52 * 128 + var64 * 64;
                        var62.field39 = var53 * 128 + var65 * 64;
                        var62.field38 = var71;
                        if (var47 > var56) {
                            byte var75 = var47;
                            var47 = var56;
                            var56 = var75;
                        }
                        if (var57 > var55) {
                            byte var76 = var57;
                            var57 = var55;
                            var55 = var76;
                        }
                        var62.field41 = var47 + var52;
                        var62.field43 = var52 + var56;
                        var62.field42 = var53 + var57;
                        var62.field44 = var53 + var55;
                    }
                }
            }
            if (field315 == 109) {
                int var77 = field313.method2363();
                int var78 = (var77 >> 4 & 0x7) + Statics.field1238;
                int var79 = (var77 & 0x7) + Statics.field363;
                int var80 = field313.method2550();
                int var81 = field313.method2363();
                int var82 = field313.method2550();
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    int var83 = var78 * 128 + 64;
                    int var84 = var79 * 128 + 64;
                    class32 var85 = new class32(var80, Statics.field1239, var83, var84, method1586(var83, var84, Statics.field1239) - var81, var82, field326);
                    field404.method3581(var85);
                }
            } else if (field315 == 17) {
                int var86 = field313.method2550();
                int var87 = field313.method2436();
                int var88 = (var87 >> 4 & 0x7) + Statics.field1238;
                int var89 = (var87 & 0x7) + Statics.field363;
                int var90 = field313.method2398();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    class31 var91 = new class31();
                    var91.field675 = var90;
                    var91.field672 = var86;
                    if (field401[Statics.field1239][var88][var89] == null) {
                        field401[Statics.field1239][var88][var89] = new class203();
                    }
                    field401[Statics.field1239][var88][var89].method3581(var91);
                    method2298(var88, var89);
                }
            } else {
                if (field315 == 110) {
                    int var92 = field313.method2363();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field1238;
                    int var94 = (var92 & 0x7) + Statics.field363;
                    int var95 = field313.method2550();
                    int var96 = field313.method2363();
                    int var97 = var96 >> 4 & 0xF;
                    int var98 = var96 & 0x7;
                    int var99 = field313.method2363();
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        int var100 = var97 + 1;
                        if (Statics.field1663.field857[0] >= var93 - var100 && Statics.field1663.field857[0] <= var93 + var100 && Statics.field1663.field831[0] >= var94 - var100 && Statics.field1663.field831[0] <= var94 + var100 && field304 != 0 && var98 > 0 && field511 < 50) {
                            field512[field511] = var95;
                            field316[field511] = var98;
                            field483[field511] = var99;
                            field516[field511] = null;
                            field515[field511] = (var93 << 16) + (var94 << 8) + var97;
                            field511++;
                        }
                    }
                }
                if (field315 == 53) {
                    int var101 = field313.method2392();
                    int var102 = (var101 >> 4 & 0x7) + Statics.field1238;
                    int var103 = (var101 & 0x7) + Statics.field363;
                    int var104 = field313.method2550();
                    int var105 = field313.method2392();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field332[var106];
                    if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                        if (var108 == 0) {
                            class91 var109 = Statics.field1991.method1844(Statics.field1239, var102, var103);
                            if (var109 != null) {
                                int var110 = var109.field1572 >> 14 & 0x7FFF;
                                if (var106 == 2) {
                                    var109.field1573 = new class13(var110, 2, var107 + 4, Statics.field1239, var102, var103, var104, false, var109.field1573);
                                    var109.field1574 = new class13(var110, 2, var107 + 1 & 0x3, Statics.field1239, var102, var103, var104, false, var109.field1574);
                                } else {
                                    var109.field1573 = new class13(var110, var106, var107, Statics.field1239, var102, var103, var104, false, var109.field1573);
                                }
                            }
                        }
                        if (var108 == 1) {
                            class98 var111 = Statics.field1991.method1842(Statics.field1239, var102, var103);
                            if (var111 != null) {
                                int var112 = var111.field1652 >> 14 & 0x7FFF;
                                if (var106 == 4 || var106 == 5) {
                                    var111.field1644 = new class13(var112, 4, var107, Statics.field1239, var102, var103, var104, false, var111.field1644);
                                } else if (var106 == 6) {
                                    var111.field1644 = new class13(var112, 4, var107 + 4, Statics.field1239, var102, var103, var104, false, var111.field1644);
                                } else if (var106 == 7) {
                                    var111.field1644 = new class13(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field1239, var102, var103, var104, false, var111.field1644);
                                } else if (var106 == 8) {
                                    var111.field1644 = new class13(var112, 4, var107 + 4, Statics.field1239, var102, var103, var104, false, var111.field1644);
                                    var111.field1651 = new class13(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field1239, var102, var103, var104, false, var111.field1651);
                                }
                            }
                        }
                        if (var108 == 2) {
                            class102 var113 = Statics.field1991.method1843(Statics.field1239, var102, var103);
                            if (var106 == 11) {
                                var106 = 10;
                            }
                            if (var113 != null) {
                                var113.field1711 = new class13(var113.field1713 >> 14 & 0x7FFF, var106, var107, Statics.field1239, var102, var103, var104, false, var113.field1711);
                            }
                        }
                        if (var108 == 3) {
                            class97 var114 = Statics.field1991.method1836(Statics.field1239, var102, var103);
                            if (var114 != null) {
                                var114.field1637 = new class13(var114.field1638 >> 14 & 0x7FFF, 22, var107, Statics.field1239, var102, var103, var104, false, var114.field1637);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.bg(IIIIIIIIIB)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field402.method3588(); var10 != null; var10 = (class17) field402.method3590()) {
            if (var10.field216 == arg0 && var10.field210 == arg1 && var10.field222 == arg2 && var10.field209 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field216 = arg0;
            var9.field209 = arg3;
            var9.field210 = arg1;
            var9.field222 = arg2;
            method741(var9);
            field402.method3581(var9);
        }
        var9.field215 = arg4;
        var9.field219 = arg5;
        var9.field218 = arg6;
        var9.field211 = arg7;
        var9.field212 = arg8;
    }

    @ObfuscatedName("m.bk(I)V")
    public static final void method89() {
        for (class17 var0 = (class17) field402.method3588(); var0 != null; var0 = (class17) field402.method3590()) {
            if (var0.field212 == -1) {
                var0.field211 = 0;
                method741(var0);
            } else {
                var0.method3699();
            }
        }
    }

    @ObfuscatedName("av.bw(Lb;B)V")
    public static final void method741(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field209 == 0) {
            var1 = Statics.field1991.method1908(arg0.field216, arg0.field210, arg0.field222);
        }
        if (arg0.field209 == 1) {
            var1 = Statics.field1991.method1846(arg0.field216, arg0.field210, arg0.field222);
        }
        if (arg0.field209 == 2) {
            var1 = Statics.field1991.method1847(arg0.field216, arg0.field210, arg0.field222);
        }
        if (arg0.field209 == 3) {
            var1 = Statics.field1991.method1848(arg0.field216, arg0.field210, arg0.field222);
        }
        if (var1 != 0) {
            int var5 = Statics.field1991.method1849(arg0.field216, arg0.field210, arg0.field222, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field208 = var2;
        arg0.field214 = var3;
        arg0.field213 = var4;
    }

    @ObfuscatedName("v.bj(IIIIIIII)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field272 && Statics.field1239 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1991.method1908(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1991.method1846(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1991.method1847(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1991.method1848(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1991.method1849(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1991.method1961(arg0, arg2, arg3);
                class43 var15 = class43.method768(var12);
                if (var15.field915 != 0) {
                    field282[arg0].method2252(arg2, arg3, var13, var14, var15.field952);
                }
            }
            if (arg1 == 1) {
                Statics.field1991.method1837(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1991.method1838(arg0, arg2, arg3);
                class43 var16 = class43.method768(var12);
                if (var16.field924 + arg2 > 103 || var16.field924 + arg3 > 103 || var16.field925 + arg2 > 103 || var16.field925 + arg3 > 103) {
                    return;
                }
                if (var16.field915 != 0) {
                    field282[arg0].method2253(arg2, arg3, var16.field924, var16.field925, var14, var16.field952);
                }
            }
            if (arg1 == 3) {
                Statics.field1991.method1876(arg0, arg2, arg3);
                class43 var17 = class43.method768(var12);
                if (var17.field915 == 1) {
                    field282[arg0].method2255(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field80[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class90 var19 = Statics.field1991;
        class112 var20 = field282[arg0];
        class43 var21 = class43.method768(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field925;
            var23 = var21.field924;
        } else {
            var22 = var21.field924;
            var23 = var21.field925;
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
        int[][] var28 = class6.field83[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field928 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field949 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class89 var34;
            if (var21.field933 == -1 && var21.field950 == null) {
                var34 = var21.method804(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field915 == 1) {
                var20.method2263(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var57;
            if (var21.field933 == -1 && var21.field950 == null) {
                var57 = var21.method804(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            if (var57 != null) {
                var19.method1911(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field915 != 0) {
                var20.method2248(arg2, arg3, var22, var23, var21.field952);
            }
        } else if (arg6 >= 12) {
            class89 var35;
            if (var21.field933 == -1 && var21.field950 == null) {
                var35 = var21.method804(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1911(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field915 != 0) {
                var20.method2248(arg2, arg3, var22, var23, var21.field952);
            }
        } else if (arg6 == 0) {
            class89 var36;
            if (var21.field933 == -1 && var21.field950 == null) {
                var36 = var21.method804(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var36, (class89) null, class6.field75[arg5], 0, var32, var33);
            if (var21.field915 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field952);
            }
        } else if (arg6 == 1) {
            class89 var37;
            if (var21.field933 == -1 && var21.field950 == null) {
                var37 = var21.method804(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var37, (class89) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field915 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field952);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class89 var39;
            class89 var40;
            if (var21.field933 == -1 && var21.field950 == null) {
                var39 = var21.method804(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method804(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field933, true, (class89) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var39, var40, class6.field75[arg5], class6.field75[var38], var32, var33);
            if (var21.field915 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field952);
            }
        } else if (arg6 == 3) {
            class89 var41;
            if (var21.field933 == -1 && var21.field950 == null) {
                var41 = var21.method804(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var41, (class89) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field915 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field952);
            }
        } else if (arg6 == 9) {
            class89 var42;
            if (var21.field933 == -1 && var21.field950 == null) {
                var42 = var21.method804(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1911(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field915 != 0) {
                var20.method2248(arg2, arg3, var22, var23, var21.field952);
            }
        } else if (arg6 == 4) {
            class89 var43;
            if (var21.field933 == -1 && var21.field950 == null) {
                var43 = var21.method804(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1828(arg0, arg2, arg3, var29, var43, (class89) null, class6.field75[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1908(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class43.method768(var45 >> 14 & 0x7FFF).field916;
            }
            class89 var46;
            if (var21.field933 == -1 && var21.field950 == null) {
                var46 = var21.method804(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1828(arg0, arg2, arg3, var29, var46, (class89) null, class6.field75[arg5], 0, class6.field77[arg5] * var44, class6.field78[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1908(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class43.method768(var48 >> 14 & 0x7FFF).field916 / 2;
            }
            class89 var49;
            if (var21.field933 == -1 && var21.field950 == null) {
                var49 = var21.method804(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1828(arg0, arg2, arg3, var29, var49, (class89) null, 256, arg5, class6.field79[arg5] * var47, class6.field72[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class89 var51;
            if (var21.field933 == -1 && var21.field950 == null) {
                var51 = var21.method804(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1828(arg0, arg2, arg3, var29, var51, (class89) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1908(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class43.method768(var53 >> 14 & 0x7FFF).field916 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class89 var55;
            class89 var56;
            if (var21.field933 == -1 && var21.field950 == null) {
                var55 = var21.method804(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method804(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field933, true, (class89) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field933, true, (class89) null);
            }
            var19.method1828(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field79[arg5] * var52, class6.field72[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("du.be(III)V")
    public static final void method2298(int arg0, int arg1) {
        class203 var2 = field401[Statics.field1239][arg0][arg1];
        if (var2 == null) {
            Statics.field1991.method1840(Statics.field1239, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3588(); var6 != null; var6 = (class31) var2.method3590()) {
            class56 var7 = class56.method3201(var6.field675);
            long var8 = (long) var7.field1163;
            if (var7.field1162 == 1) {
                var8 = (long) (var6.field672 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1991.method1840(Statics.field1239, arg0, arg1);
            return;
        }
        var2.method3591(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3588(); var12 != null; var12 = (class31) var2.method3590()) {
            if (var5.field675 != var12.field675) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field675 != var12.field675 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1991.method1860(Statics.field1239, arg0, arg1, method1586(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1239), var5, var13, var10, var11);
    }

    @ObfuscatedName("gd.br(ZI)V")
    public static final void method3513(boolean arg0) {
        field394 = 0;
        field309 = 0;
        field313.method2632();
        int var1 = field313.method2644(8);
        if (var1 < field310) {
            for (int var2 = var1; var2 < field310; var2++) {
                field395[++field394 - 1] = field308[var2];
            }
        }
        if (var1 > field310) {
            throw new RuntimeException("");
        }
        field310 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field308[var3];
            class37 var5 = field306[var4];
            int var6 = field313.method2644(1);
            if (var6 == 0) {
                field308[++field310 - 1] = var4;
                var5.field802 = field326;
            } else {
                int var7 = field313.method2644(2);
                if (var7 == 0) {
                    field308[++field310 - 1] = var4;
                    var5.field802 = field326;
                    field419[++field309 - 1] = var4;
                } else if (var7 == 1) {
                    field308[++field310 - 1] = var4;
                    var5.field802 = field326;
                    int var8 = field313.method2644(3);
                    var5.method727(var8, (byte) 1);
                    int var9 = field313.method2644(1);
                    if (var9 == 1) {
                        field419[++field309 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field308[++field310 - 1] = var4;
                    var5.field802 = field326;
                    int var10 = field313.method2644(3);
                    var5.method727(var10, (byte) 2);
                    int var11 = field313.method2644(3);
                    var5.method727(var11, (byte) 2);
                    int var12 = field313.method2644(1);
                    if (var12 == 1) {
                        field419[++field309 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field395[++field394 - 1] = var4;
                }
            }
        }
        while (field313.method2635(field314) >= 27) {
            int var13 = field313.method2644(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field306[var13] == null) {
                field306[var13] = new class37();
                var17 = true;
            }
            class37 var18 = field306[var13];
            field308[++field310 - 1] = var13;
            var18.field802 = field326;
            int var19 = field313.method2644(1);
            if (var19 == 1) {
                field419[++field309 - 1] = var13;
            }
            int var20;
            if (arg0) {
                var20 = field313.method2644(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field313.method2644(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            int var21 = field313.method2644(1);
            int var22;
            if (arg0) {
                var22 = field313.method2644(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = field313.method2644(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            int var23 = field399[field313.method2644(3)];
            if (var17) {
                var18.field853 = var18.field804 = var23;
            }
            var18.field770 = class42.method2674(field313.method2644(14));
            var18.field806 = var18.field770.field903;
            var18.field855 = var18.field770.field897;
            if (var18.field855 == 0) {
                var18.field804 = 0;
            }
            var18.field814 = var18.field770.field900;
            var18.field803 = var18.field770.field880;
            var18.field809 = var18.field770.field889;
            var18.field862 = var18.field770.field883;
            var18.field830 = var18.field770.field877;
            var18.field808 = var18.field770.field878;
            var18.field807 = var18.field770.field879;
            var18.method732(Statics.field1663.field857[0] + var22, Statics.field1663.field831[0] + var20, var21 == 1);
        }
        field313.method2633();
        method168();
        for (int var14 = 0; var14 < field394; var14++) {
            int var15 = field395[var14];
            if (field326 != field306[var15].field802) {
                field306[var15].field770 = null;
                field306[var15] = null;
            }
        }
        if (field314 != field313.field2028) {
            throw new RuntimeException(field313.field2028 + class2.field15 + field314);
        }
        for (int var16 = 0; var16 < field310; var16++) {
            if (field306[field308[var16]] == null) {
                throw new RuntimeException(var16 + class2.field15 + field310);
            }
        }
    }

    @ObfuscatedName("d.bx(I)V")
    public static final void method168() {
        for (int var0 = 0; var0 < field309; var0++) {
            int var1 = field419[var0];
            class37 var2 = field306[var1];
            int var3 = field313.method2363();
            if ((var3 & 0x4) != 0) {
                var2.field823 = field313.method2550();
                if (var2.field823 == 65535) {
                    var2.field823 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field815 = field313.method2385();
                var2.field818 = 100;
            }
            if ((var3 & 0x20) != 0) {
                int var4 = field313.method2550();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field313.method2363();
                if (var2.field858 == var4 && var4 != -1) {
                    int var6 = class45.method44(var4).field983;
                    if (var6 == 1) {
                        var2.field835 = 0;
                        var2.field836 = 0;
                        var2.field837 = var5;
                        var2.field838 = 0;
                    }
                    if (var6 == 2) {
                        var2.field838 = 0;
                    }
                } else if (var4 == -1 || var2.field858 == -1 || class45.method44(var4).field971 >= class45.method44(var2.field858).field971) {
                    var2.field858 = var4;
                    var2.field835 = 0;
                    var2.field836 = 0;
                    var2.field837 = var5;
                    var2.field838 = 0;
                    var2.field822 = var2.field856;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field770 = class42.method2674(field313.method2399());
                var2.field806 = var2.field770.field903;
                var2.field855 = var2.field770.field897;
                var2.field814 = var2.field770.field900;
                var2.field803 = var2.field770.field880;
                var2.field809 = var2.field770.field889;
                var2.field862 = var2.field770.field883;
                var2.field830 = var2.field770.field877;
                var2.field808 = var2.field770.field878;
                var2.field807 = var2.field770.field879;
            }
            if ((var3 & 0x1) != 0) {
                int var7 = field313.method2436();
                if (var7 > 0) {
                    for (int var8 = 0; var8 < var7; var8++) {
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = field313.method2536();
                        if (var12 == 32767) {
                            var12 = field313.method2536();
                            var10 = field313.method2536();
                            var9 = field313.method2536();
                            var11 = field313.method2536();
                        } else if (var12 == 32766) {
                            var12 = -1;
                        } else {
                            var10 = field313.method2536();
                        }
                        int var13 = field313.method2536();
                        var2.method757(var12, var10, var9, var11, field326, var13);
                    }
                }
                int var14 = field313.method2436();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = field313.method2536();
                        int var17 = field313.method2536();
                        if (var17 == 32767) {
                            var2.method759(var16);
                        } else {
                            int var18 = field313.method2536();
                            int var19 = field313.method2363();
                            int var20 = var17 > 0 ? field313.method2436() : var19;
                            var2.method764(var16, field326, var17, var18, var19, var20);
                        }
                    }
                }
            }
            if ((var3 & 0x10) != 0) {
                int var21 = field313.method2399();
                int var22 = field313.method2398();
                int var23 = var2.field810 - (var21 - Statics.field590 - Statics.field590) * 64;
                int var24 = var2.field843 - (var22 - Statics.field133 - Statics.field133) * 64;
                if (var23 != 0 || var24 != 0) {
                    var2.field851 = (int) (Math.atan2((double) var23, (double) var24) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field805 = field313.method2398();
                int var25 = field313.method2526();
                var2.field840 = var25 >> 16;
                var2.field854 = (var25 & 0xFFFF) + field326;
                var2.field812 = 0;
                var2.field841 = 0;
                if (var2.field854 > field326) {
                    var2.field812 = -1;
                }
                if (var2.field805 == 65535) {
                    var2.field805 = -1;
                }
            }
        }
    }

    @ObfuscatedName("q.bm(Lt;IIBS)V")
    public static final void method187(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field857[0];
        int var5 = arg0.field831[0];
        int var6 = arg0.method10();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method10();
        class111 var8 = method2845(arg1, arg2);
        class112 var9 = field282[arg0.field48];
        int[] var10 = field446;
        int[] var11 = field550;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class110.field1906[var12][var13] = 0;
                class110.field1907[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = Statics.method169(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class110.field1906[var17][var18] = 99;
            class110.field1907[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class110.field1913[var21] = var4;
            int var55 = var21 + 1;
            class110.field1916[var21] = var5;
            int[][] var23 = var9.field1932;
            boolean var28;
            while (true) {
                if (var55 == var22) {
                    Statics.field1908 = var15;
                    Statics.field1909 = var16;
                    var28 = false;
                    break;
                }
                var15 = class110.field1913[var22];
                var16 = class110.field1916[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field1928;
                int var27 = var16 - var9.field1929;
                if (var8.method124(2, var15, var16, var9)) {
                    Statics.field1908 = var15;
                    Statics.field1909 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class110.field1907[var24][var25] + 1;
                if (var24 > 0 && class110.field1906[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class110.field1913[var55] = var15 - 1;
                    class110.field1916[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24 - 1][var25] = 2;
                    class110.field1907[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class110.field1906[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class110.field1913[var55] = var15 + 1;
                    class110.field1916[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24 + 1][var25] = 8;
                    class110.field1907[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class110.field1906[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class110.field1913[var55] = var15;
                    class110.field1916[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24][var25 - 1] = 1;
                    class110.field1907[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class110.field1906[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class110.field1913[var55] = var15;
                    class110.field1916[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24][var25 + 1] = 4;
                    class110.field1907[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class110.field1906[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class110.field1913[var55] = var15 - 1;
                    class110.field1916[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24 - 1][var25 - 1] = 3;
                    class110.field1907[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class110.field1906[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class110.field1913[var55] = var15 + 1;
                    class110.field1916[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24 + 1][var25 - 1] = 9;
                    class110.field1907[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class110.field1906[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class110.field1913[var55] = var15 - 1;
                    class110.field1916[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24 - 1][var25 + 1] = 6;
                    class110.field1907[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class110.field1906[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class110.field1913[var55] = var15 + 1;
                    class110.field1916[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1906[var24 + 1][var25 + 1] = 12;
                    class110.field1907[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            var14 = class110.method1816(var4, var5, var7, var8, var9);
        }
        int var48;
        label321: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field1908;
            int var33 = Statics.field1909;
            if (!var14) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field1921;
                int var38 = var8.field1918;
                int var39 = var8.field1919;
                int var40 = var8.field1920;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class110.field1907[var43][var44] < 100) {
                            int var45 = 0;
                            if (var41 < var37) {
                                var45 = var37 - var41;
                            } else if (var41 > var37 + var39 - 1) {
                                var45 = var41 - (var37 + var39 - 1);
                            }
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = var45 * var45 + var46 * var46;
                            if (var47 < var34 || var34 == var47 && class110.field1907[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class110.field1907[var43][var44];
                                var32 = var41;
                                var33 = var42;
                            }
                        }
                    }
                }
                if (var34 == Integer.MAX_VALUE) {
                    var48 = -1;
                    break label321;
                }
            }
            if (var4 == var32 && var5 == var33) {
                var48 = 0;
            } else {
                byte var49 = 0;
                class110.field1913[var49] = var32;
                int var56 = var49 + 1;
                class110.field1916[var49] = var33;
                int var50;
                int var51 = var50 = class110.field1906[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class110.field1913[var56] = var32;
                        class110.field1916[var56++] = var33;
                    }
                    if ((var51 & 0x2) != 0) {
                        var32++;
                    } else if ((var51 & 0x8) != 0) {
                        var32--;
                    }
                    if ((var51 & 0x1) != 0) {
                        var33++;
                    } else if ((var51 & 0x4) != 0) {
                        var33--;
                    }
                    var51 = class110.field1906[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class110.field1913[var56];
                    var11[var52++] = class110.field1916[var56];
                    if (var52 >= var10.length) {
                        break;
                    }
                }
                var48 = var52;
            }
        }
        int var53 = var48;
        if (var48 >= 1) {
            for (int var54 = 0; var54 < var53 - 1; var54++) {
                arg0.method14(field446[var54], field550[var54], arg3);
            }
        }
    }

    @ObfuscatedName("eg.bb(IIB)Ldw;")
    public static class111 method2845(int arg0, int arg1) {
        field548.field1921 = arg0;
        field548.field1918 = arg1;
        field548.field1919 = 1;
        field548.field1920 = 1;
        return field548;
    }

    @ObfuscatedName("bh.bv(IIB)V")
    public static final void method1044(int arg0, int arg1) {
        if (field411 < 2 && field422 == 0 && !field271) {
            return;
        }
        String var2;
        if (field422 == 1 && field411 < 2) {
            var2 = class161.field2554 + class161.field2527 + field417 + " " + class2.field23;
        } else if (field271 && field411 < 2) {
            var2 = field334 + class161.field2527 + field498 + " " + class2.field23;
        } else {
            int var3 = field411 - 1;
            String var4;
            if (field503[var3].length() > 0) {
                var4 = field416[var3] + class161.field2527 + field503[var3];
            } else {
                var4 = field416[var3];
            }
            var2 = var4;
        }
        if (field411 > 2) {
            var2 = var2 + class2.method3501(16777215) + " " + '/' + " " + (field411 - 2) + class161.field2508;
        }
        Statics.field2002.method3839(var2, arg0 + 4, arg1 + 15, 16777215, 0, field326 / 1000);
    }

    @ObfuscatedName("ak.bn(IIIIB)V")
    public static final void method946(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field299; var4++) {
            if (field479[var4] + field477[var4] > arg0 && field477[var4] < arg0 + arg2 && field480[var4] + field478[var4] > arg1 && field478[var4] < arg1 + arg3) {
                field453[var4] = true;
            }
        }
    }

    @ObfuscatedName("bh.bc(I)V")
    public static final void method1046() {
        method597();
        if (Statics.field1415 != null || field442 != null) {
            return;
        }
        int var0 = class144.field2199;
        if (field409) {
            if (var0 != 1 && (Statics.field246 || var0 != 4)) {
                int var1 = class144.field2193;
                int var2 = class144.field2190;
                if (var1 < Statics.field412 - 10 || var1 > Statics.field412 + Statics.field2083 + 10 || var2 < Statics.field1136 - 10 || var2 > Statics.field3104 + Statics.field1136 + 10) {
                    field409 = false;
                    Statics.method2627(Statics.field412, Statics.field1136, Statics.field2083, Statics.field3104);
                }
            }
            if (var0 == 1 || !Statics.field246 && var0 == 4) {
                int var3 = Statics.field412;
                int var4 = Statics.field1136;
                int var5 = Statics.field2083;
                int var6 = class144.field2189;
                int var7 = class144.field2197;
                int var8 = -1;
                for (int var9 = 0; var9 < field411; var9++) {
                    int var10 = (field411 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = field329[var8];
                    int var12 = field413[var8];
                    int var13 = field307[var8];
                    int var14 = field415[var8];
                    String var15 = field416[var8];
                    String var16 = field503[var8];
                    method861(var11, var12, var13, var14, var15, var16, class144.field2189, class144.field2197);
                }
                field409 = false;
                Statics.method2627(Statics.field412, Statics.field1136, Statics.field2083, Statics.field3104);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field246 && var0 == 4) && field411 > 0) {
            int var17 = field307[field411 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                int var18 = field329[field411 - 1];
                int var19 = field413[field411 - 1];
                class177 var20 = class177.method1982(var19);
                if (class182.method3206(method137(var20)) || class182.method529(method137(var20))) {
                    if (Statics.field1415 != null && !field357 && field408 != 1 && !method1514(field411 - 1) && field411 > 0) {
                        int var21 = field385;
                        int var22 = field386;
                        class33 var23 = Statics.field1023;
                        method861(var23.field700, var23.field692, var23.field693, var23.field694, var23.field695, var23.field695, var21, var22);
                        Statics.field1023 = null;
                    }
                    field357 = false;
                    field389 = 0;
                    if (Statics.field1415 != null) {
                        method678(Statics.field1415);
                    }
                    Statics.field1415 = class177.method1982(var19);
                    field384 = var18;
                    field385 = class144.field2189;
                    field386 = class144.field2197;
                    if (field411 > 0) {
                        method3265(field411 - 1);
                    }
                    method678(Statics.field1415);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field246 && var0 == 4) && (field408 == 1 && field411 > 2 || method1514(field411 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field246 && var0 == 4) && field411 > 0) {
            int var24 = field411 - 1;
            if (var24 >= 0) {
                int var25 = field329[var24];
                int var26 = field413[var24];
                int var27 = field307[var24];
                int var28 = field415[var24];
                String var29 = field416[var24];
                String var30 = field503[var24];
                method861(var25, var26, var27, var28, var29, var30, class144.field2189, class144.field2197);
            }
        }
        if (var0 == 2 && field411 > 0) {
            method651(class144.field2189, class144.field2197);
        }
    }

    @ObfuscatedName("ah.bt(IIB)V")
    public static final void method651(int arg0, int arg1) {
        int var2 = Statics.field2002.method3807(class161.field2426);
        for (int var3 = 0; var3 < field411; var3++) {
            class228 var4 = Statics.field2002;
            String var5;
            if (field503[var3].length() > 0) {
                var5 = field416[var3] + class161.field2527 + field503[var3];
            } else {
                var5 = field416[var3];
            }
            int var6 = var4.method3807(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field411 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1070) {
            var8 = Statics.field1070 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2144) {
            var9 = Statics.field2144 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field409 = true;
        Statics.field412 = var8;
        Statics.field1136 = var9;
        Statics.field2083 = var2;
        Statics.field3104 = field411 * 15 + 22;
    }

    @ObfuscatedName("ba.bi(II)Z")
    public static final boolean method1514(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field307[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("az.bd(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method861(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 24) {
            class177 var8 = class177.method1982(arg1);
            boolean var9 = true;
            if (var8.field2924 > 0) {
                var9 = method548(var8);
            }
            if (var9) {
                field301.method2630(229);
                field301.method2524(arg1);
            }
        }
        if (arg2 == 44) {
            class3 var10 = field391[arg3];
            if (var10 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(139);
                field301.method2395(arg3);
                field301.method2349(class141.field2158[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(80);
            field301.method2395(Statics.field133 + arg1);
            field301.method2395(arg3);
            field301.method2493(class141.field2158[82] ? 1 : 0);
            field301.method2537(Statics.field590 + arg0);
        }
        if (arg2 == 51) {
            class3 var11 = field391[arg3];
            if (var11 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(11);
                field301.method2349(class141.field2158[82] ? 1 : 0);
                field301.method2396(arg3);
            }
        }
        if (arg2 == 35) {
            field301.method2630(254);
            field301.method2537(arg0);
            field301.method2350(arg3);
            field301.method2439(arg1);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 32) {
            field301.method2630(31);
            field301.method2537(field270);
            field301.method2396(arg0);
            field301.method2439(Statics.field2209);
            field301.method2524(arg1);
            field301.method2350(arg3);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 50) {
            class3 var12 = field391[arg3];
            if (var12 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(240);
                field301.method2537(arg3);
                field301.method2349(class141.field2158[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field301.method2630(141);
            field301.method2524(arg1);
            field301.method2537(arg0);
            field301.method2350(arg3);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 22) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(252);
            field301.method2537(arg3);
            field301.method2350(Statics.field133 + arg1);
            field301.method2387(class141.field2158[82] ? 1 : 0);
            field301.method2396(Statics.field590 + arg0);
        }
        if (arg2 == 5) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(179);
            field301.method2395(Statics.field133 + arg1);
            field301.method2395(Statics.field590 + arg0);
            field301.method2396(arg3 >> 14 & 0x7FFF);
            field301.method2493(class141.field2158[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(241);
            field301.method2396(Statics.field590 + arg0);
            field301.method2387(class141.field2158[82] ? 1 : 0);
            field301.method2350(arg3 >> 14 & 0x7FFF);
            field301.method2396(Statics.field133 + arg1);
        }
        if (arg2 == 26) {
            method2282();
        }
        if (arg2 == 58) {
            class177 var13 = class177.method2993(arg1, arg0);
            if (var13 != null) {
                field301.method2630(57);
                field301.method2350(arg0);
                field301.method2396(field426);
                field301.method2406(arg1);
                field301.method2537(field270);
                field301.method2537(var13.field2892);
                field301.method2439(Statics.field2209);
            }
        }
        if (arg2 == 41) {
            field301.method2630(164);
            field301.method2395(arg3);
            field301.method2537(arg0);
            field301.method2406(arg1);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 23) {
            Statics.field1991.method1940(Statics.field1239, arg0, arg1);
        }
        if (arg2 == 10) {
            class37 var14 = field306[arg3];
            if (var14 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(147);
                field301.method2537(arg3);
                field301.method2493(class141.field2158[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var15 = field391[arg3];
            if (var15 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(249);
                field301.method2395(arg3);
                field301.method2348(class141.field2158[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field301.method2630(233);
            field301.method2396(arg0);
            field301.method2396(arg3);
            field301.method2439(arg1);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 11) {
            class37 var16 = field306[arg3];
            if (var16 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(186);
                field301.method2493(class141.field2158[82] ? 1 : 0);
                field301.method2396(arg3);
            }
        }
        if (arg2 == 29) {
            field301.method2630(229);
            field301.method2524(arg1);
            class177 var17 = class177.method1982(arg1);
            if (var17.field2911 != null && var17.field2911[0][0] == 5) {
                int var18 = var17.field2911[0][1];
                if (class180.field2952[var18] != var17.field2913[0]) {
                    class180.field2952[var18] = var17.field2913[0];
                    method536(var18);
                }
            }
        }
        if (arg2 == 30 && field433 == null) {
            method721(arg1, arg0);
            field433 = class177.method2993(arg1, arg0);
            method678(field433);
        }
        if (arg2 == 25) {
            class177 var19 = class177.method2993(arg1, arg0);
            if (var19 != null) {
                method3514();
                int var20 = method137(var19);
                int var21 = var20 >> 11 & 0x3F;
                int var23 = var19.field2892;
                class177 var24 = class177.method2993(arg1, arg0);
                if (var24 != null && var24.field2890 != null) {
                    class1 var25 = new class1();
                    var25.field3 = var24;
                    var25.field6 = var24.field2890;
                    class39.method742(var25);
                }
                field426 = var23;
                field271 = true;
                Statics.field2209 = arg1;
                field270 = arg0;
                Statics.field2043 = var21;
                method678(var24);
                field422 = 0;
                field334 = method100(var19);
                if (field334 == null) {
                    field334 = "Null";
                }
                if (var19.field2798) {
                    field498 = var19.field2872 + class2.method3501(16777215);
                } else {
                    field498 = class2.method3501(65280) + var19.field2915 + class2.method3501(16777215);
                }
            }
            return;
        }
        if (arg2 == 46) {
            class3 var26 = field391[arg3];
            if (var26 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(100);
                field301.method2348(class141.field2158[82] ? 1 : 0);
                field301.method2350(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var27 = field391[arg3];
            if (var27 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(172);
                field301.method2395(arg3);
                field301.method2493(class141.field2158[82] ? 1 : 0);
                field301.method2350(field270);
                field301.method2447(Statics.field2209);
            }
        }
        if (arg2 == 48) {
            class3 var28 = field391[arg3];
            if (var28 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(54);
                field301.method2387(class141.field2158[82] ? 1 : 0);
                field301.method2396(arg3);
            }
        }
        if (arg2 == 2) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(47);
            field301.method2537(arg3 >> 14 & 0x7FFF);
            field301.method2395(field270);
            field301.method2350(Statics.field133 + arg1);
            field301.method2493(class141.field2158[82] ? 1 : 0);
            field301.method2406(Statics.field2209);
            field301.method2350(Statics.field590 + arg0);
        }
        if (arg2 == 39) {
            field301.method2630(245);
            field301.method2350(arg0);
            field301.method2537(arg3);
            field301.method2406(arg1);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 20) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(9);
            field301.method2396(arg3);
            field301.method2349(class141.field2158[82] ? 1 : 0);
            field301.method2350(Statics.field590 + arg0);
            field301.method2396(Statics.field133 + arg1);
        }
        if (arg2 == 12) {
            class37 var29 = field306[arg3];
            if (var29 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(59);
                field301.method2349(class141.field2158[82] ? 1 : 0);
                field301.method2537(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var30 = class177.method2993(arg1, arg0);
            if (var30 != null) {
                int var31 = var30.field2892;
                class177 var32 = class177.method2993(arg1, arg0);
                if (var32 != null) {
                    if (var32.field2874 != null) {
                        class1 var33 = new class1();
                        var33.field3 = var32;
                        var33.field7 = arg3;
                        var33.field10 = arg5;
                        var33.field6 = var32.field2874;
                        class39.method742(var33);
                    }
                    boolean var34 = true;
                    if (var32.field2924 > 0) {
                        var34 = method548(var32);
                    }
                    if (var34 && class182.method745(method137(var32), arg3 - 1)) {
                        if (arg3 == 1) {
                            field301.method2630(174);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 2) {
                            field301.method2630(149);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 3) {
                            field301.method2630(103);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 4) {
                            field301.method2630(101);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 5) {
                            field301.method2630(193);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 6) {
                            field301.method2630(188);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 7) {
                            field301.method2630(55);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 8) {
                            field301.method2630(39);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 9) {
                            field301.method2630(255);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                        if (arg3 == 10) {
                            field301.method2630(68);
                            field301.method2524(arg1);
                            field301.method2350(arg0);
                            field301.method2350(var31);
                        }
                    }
                }
            }
        }
        if (arg2 == 8) {
            class37 var35 = field306[arg3];
            if (var35 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(97);
                field301.method2387(class141.field2158[82] ? 1 : 0);
                field301.method2395(field270);
                field301.method2406(Statics.field2209);
                field301.method2395(arg3);
            }
        }
        if (arg2 == 3) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(156);
            field301.method2395(arg3 >> 14 & 0x7FFF);
            field301.method2350(Statics.field590 + arg0);
            field301.method2387(class141.field2158[82] ? 1 : 0);
            field301.method2350(Statics.field133 + arg1);
        }
        if (arg2 == 1) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(56);
            field301.method2537(Statics.field133 + arg1);
            field301.method2447(Statics.field671);
            field301.method2396(Statics.field2712);
            field301.method2395(Statics.field2216);
            field301.method2493(class141.field2158[82] ? 1 : 0);
            field301.method2537(Statics.field590 + arg0);
            field301.method2350(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class37 var36 = field306[arg3];
            if (var36 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(157);
                field301.method2350(arg3);
                field301.method2493(class141.field2158[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var37 = field391[arg3];
            if (var37 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(247);
                field301.method2348(class141.field2158[82] ? 1 : 0);
                field301.method2537(arg3);
            }
        }
        if (arg2 == 36) {
            field301.method2630(67);
            field301.method2537(arg0);
            field301.method2395(arg3);
            field301.method2447(arg1);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 17) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(2);
            field301.method2349(class141.field2158[82] ? 1 : 0);
            field301.method2350(arg3);
            field301.method2524(Statics.field2209);
            field301.method2395(field270);
            field301.method2396(Statics.field133 + arg1);
            field301.method2396(Statics.field590 + arg0);
        }
        if (arg2 == 37) {
            field301.method2630(224);
            field301.method2439(arg1);
            field301.method2395(arg0);
            field301.method2395(arg3);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 28) {
            field301.method2630(229);
            field301.method2524(arg1);
            class177 var38 = class177.method1982(arg1);
            if (var38.field2911 != null && var38.field2911[0][0] == 5) {
                int var39 = var38.field2911[0][1];
                class180.field2952[var39] = 1 - class180.field2952[var39];
                method536(var39);
            }
        }
        if (arg2 == 45) {
            class3 var40 = field391[arg3];
            if (var40 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(49);
                field301.method2395(arg3);
                field301.method2493(class141.field2158[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field301.method2630(25);
            field301.method2395(arg3);
        }
        if (arg2 == 1002) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field301.method2630(163);
            field301.method2395(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1003) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            class37 var41 = field306[arg3];
            if (var41 != null) {
                class42 var42 = var41.field770;
                if (var42.field898 != null) {
                    var42 = var42.method775();
                }
                if (var42 != null) {
                    field301.method2630(160);
                    field301.method2537(var42.field881);
                }
            }
        }
        if (arg2 == 13) {
            class37 var43 = field306[arg3];
            if (var43 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(117);
                field301.method2493(class141.field2158[82] ? 1 : 0);
                field301.method2537(arg3);
            }
        }
        if (arg2 == 7) {
            class37 var44 = field306[arg3];
            if (var44 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(61);
                field301.method2348(class141.field2158[82] ? 1 : 0);
                field301.method2350(Statics.field2216);
                field301.method2396(arg3);
                field301.method2447(Statics.field671);
                field301.method2396(Statics.field2712);
            }
        }
        if (arg2 == 40) {
            field301.method2630(105);
            field301.method2524(arg1);
            field301.method2396(arg3);
            field301.method2537(arg0);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 1005) {
            class177 var45 = class177.method1982(arg1);
            if (var45 == null || var45.field2918[arg0] < 100000) {
                field301.method2630(25);
                field301.method2395(arg3);
            } else {
                class12.method37(27, "", var45.field2918[arg0] + " x " + class56.method3201(arg3).field1151);
            }
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 16) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(243);
            field301.method2537(Statics.field133 + arg1);
            field301.method2395(Statics.field2712);
            field301.method2387(class141.field2158[82] ? 1 : 0);
            field301.method2396(arg3);
            field301.method2395(Statics.field2216);
            field301.method2439(Statics.field671);
            field301.method2395(Statics.field590 + arg0);
        }
        if (arg2 == 21) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(66);
            field301.method2537(Statics.field133 + arg1);
            field301.method2395(arg3);
            field301.method2537(Statics.field590 + arg0);
            field301.method2493(class141.field2158[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field301.method2630(78);
            field301.method2524(arg1);
            field301.method2537(arg3);
            field301.method2350(arg0);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 38) {
            method3514();
            class177 var46 = class177.method1982(arg1);
            field422 = 1;
            Statics.field2216 = arg0;
            Statics.field671 = arg1;
            Statics.field2712 = arg3;
            method678(var46);
            field417 = class2.method3501(16748608) + class56.method3201(arg3).field1151 + class2.method3501(16777215);
            if (field417 == null) {
                field417 = "null";
            }
            return;
        }
        if (arg2 == 1001) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(230);
            field301.method2396(arg3 >> 14 & 0x7FFF);
            field301.method2387(class141.field2158[82] ? 1 : 0);
            field301.method2395(Statics.field590 + arg0);
            field301.method2395(Statics.field133 + arg1);
        }
        if (arg2 == 6) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(124);
            field301.method2395(Statics.field133 + arg1);
            field301.method2349(class141.field2158[82] ? 1 : 0);
            field301.method2395(Statics.field590 + arg0);
            field301.method2537(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 18) {
            field455 = arg6;
            field379 = arg7;
            field469 = 2;
            field540 = 0;
            field535 = arg0;
            field504 = arg1;
            field301.method2630(19);
            field301.method2396(Statics.field590 + arg0);
            field301.method2537(Statics.field133 + arg1);
            field301.method2349(class141.field2158[82] ? 1 : 0);
            field301.method2350(arg3);
        }
        if (arg2 == 34) {
            field301.method2630(35);
            field301.method2396(arg3);
            field301.method2524(arg1);
            field301.method2396(arg0);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 31) {
            field301.method2630(36);
            field301.method2350(Statics.field2216);
            field301.method2439(Statics.field671);
            field301.method2537(arg3);
            field301.method2396(arg0);
            field301.method2350(Statics.field2712);
            field301.method2447(arg1);
            field335 = 0;
            Statics.field874 = class177.method1982(arg1);
            field318 = arg0;
        }
        if (arg2 == 14) {
            class3 var47 = field391[arg3];
            if (var47 != null) {
                field455 = arg6;
                field379 = arg7;
                field469 = 2;
                field540 = 0;
                field535 = arg0;
                field504 = arg1;
                field301.method2630(205);
                field301.method2396(Statics.field2216);
                field301.method2396(Statics.field2712);
                field301.method2439(Statics.field671);
                field301.method2387(class141.field2158[82] ? 1 : 0);
                field301.method2350(arg3);
            }
        }
        if (field422 != 0) {
            field422 = 0;
            method678(class177.method1982(Statics.field671));
        }
        if (field271) {
            method3514();
        }
        if (Statics.field874 != null && field335 == 0) {
            method678(Statics.field874);
        }
    }

    @ObfuscatedName("u.bl(ILjava/lang/String;S)V")
    public static void method156(int arg0, String arg1) {
        int var2 = class35.field744;
        int[] var3 = class35.field740;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field391[var3[var5]];
            if (var6 != null && Statics.field1663 != var6 && var6.field30 != null && var6.field30.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field301.method2630(139);
                    field301.method2395(var3[var5]);
                    field301.method2349(0);
                } else if (arg0 == 4) {
                    field301.method2630(247);
                    field301.method2348(0);
                    field301.method2537(var3[var5]);
                } else if (arg0 == 6) {
                    field301.method2630(249);
                    field301.method2395(var3[var5]);
                    field301.method2348(0);
                } else if (arg0 == 7) {
                    field301.method2630(240);
                    field301.method2537(var3[var5]);
                    field301.method2349(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method37(4, "", class161.field2503 + arg1);
        }
    }

    @ObfuscatedName("gd.bu(I)V")
    public static void method3514() {
        if (!field271) {
            return;
        }
        class177 var0 = class177.method2993(Statics.field2209, field270);
        if (var0 != null && var0.field2884 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field6 = var0.field2884;
            class39.method742(var1);
        }
        field271 = false;
        method678(var0);
    }

    @ObfuscatedName("ag.bf(III)V")
    public static void method721(int arg0, int arg1) {
        field301.method2630(209);
        field301.method2447(arg0);
        field301.method2395(arg1);
    }

    @ObfuscatedName("ae.bz(S)V")
    public static final void method597() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field411 - 1; var1++) {
                if (field307[var1] < 1000 && field307[var1 + 1] > 1000) {
                    String var2 = field503[var1];
                    field503[var1] = field503[var1 + 1];
                    field503[var1 + 1] = var2;
                    String var3 = field416[var1];
                    field416[var1] = field416[var1 + 1];
                    field416[var1 + 1] = var3;
                    int var4 = field307[var1];
                    field307[var1] = field307[var1 + 1];
                    field307[var1 + 1] = var4;
                    int var5 = field329[var1];
                    field329[var1] = field329[var1 + 1];
                    field329[var1 + 1] = var5;
                    int var6 = field413[var1];
                    field413[var1] = field413[var1 + 1];
                    field413[var1 + 1] = var6;
                    int var7 = field415[var1];
                    field415[var1] = field415[var1 + 1];
                    field415[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("r.ba(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method125(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field409 || field411 >= 500) {
            return;
        }
        field416[field411] = arg0;
        field503[field411] = arg1;
        field307[field411] = arg2;
        field415[field411] = arg3;
        field329[field411] = arg4;
        field413[field411] = arg5;
        field411++;
    }

    @ObfuscatedName("s.by(I)V")
    public static void method3() {
        for (int var0 = 0; var0 < field411; var0++) {
            int var1 = field307[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field411 - 1) {
                    for (int var3 = var0; var3 < field411 - 1; var3++) {
                        field416[var3] = field416[var3 + 1];
                        field503[var3] = field503[var3 + 1];
                        field307[var3] = field307[var3 + 1];
                        field415[var3] = field415[var3 + 1];
                        field329[var3] = field329[var3 + 1];
                        field413[var3] = field413[var3 + 1];
                    }
                }
                field411--;
            }
        }
    }

    @ObfuscatedName("v.bq(IIIII)V")
    public static final void method549(int arg0, int arg1, int arg2, int arg3) {
        if (field422 == 0 && !field271) {
            method125(class161.field2635, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class109.field1897; var6++) {
            int var7 = class109.field1898[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1991.method1849(Statics.field1239, var8, var9, var7) >= 0) {
                    class43 var12 = class43.method768(var11);
                    if (var12.field950 != null) {
                        var12 = var12.method807();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field422 == 1) {
                        method125(class161.field2554, field417 + " " + class2.field23 + " " + class2.method3501(65535) + var12.field919, 1, var7, var8, var9);
                    } else if (!field271) {
                        String[] var13 = var12.field936;
                        if (field440) {
                            var13 = method743(var13);
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
                                    method125(var13[var14], class2.method3501(65535) + var12.field919, var15, var7, var8, var9);
                                }
                            }
                        }
                        method125(class161.field2542, class2.method3501(65535) + var12.field919, 1002, var12.field941 << 14, var8, var9);
                    } else if ((Statics.field2043 & 0x4) == 4) {
                        method125(field334, field498 + " " + class2.field23 + " " + class2.method3501(65535) + var12.field919, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class37 var16 = field306[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field770.field903 == 1 && (var16.field810 & 0x7F) == 64 && (var16.field843 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field310; var17++) {
                            class37 var18 = field306[field308[var17]];
                            if (var18 != null && var16 != var18 && var18.field770.field903 == 1 && var16.field810 == var18.field810 && var16.field843 == var18.field843) {
                                method117(var18.field770, field308[var17], var8, var9);
                            }
                        }
                        int var19 = class35.field744;
                        int[] var20 = class35.field740;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field391[var20[var21]];
                            if (var22 != null && var16.field810 == var22.field810 && var16.field843 == var22.field843) {
                                method3706(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method117(var16.field770, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field391[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field810 & 0x7F) == 64 && (var23.field843 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field310; var24++) {
                            class37 var25 = field306[field308[var24]];
                            if (var25 != null && var25.field770.field903 == 1 && var23.field810 == var25.field810 && var23.field843 == var25.field843) {
                                method117(var25.field770, field308[var24], var8, var9);
                            }
                        }
                        int var26 = class35.field744;
                        int[] var27 = class35.field740;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field391[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field810 == var29.field810 && var23.field843 == var29.field843) {
                                method3706(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field400 == var11) {
                        var4 = var7;
                    } else {
                        method3706(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class203 var30 = field401[Statics.field1239][var8][var9];
                    if (var30 != null) {
                        for (class31 var31 = (class31) var30.method3603(); var31 != null; var31 = (class31) var30.method3608()) {
                            class56 var32 = class56.method3201(var31.field675);
                            if (field422 == 1) {
                                method125(class161.field2554, field417 + " " + class2.field23 + " " + class2.method3501(16748608) + var32.field1151, 16, var31.field675, var8, var9);
                            } else if (!field271) {
                                String[] var33 = var32.field1165;
                                if (field440) {
                                    var33 = method743(var33);
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
                                        method125(var33[var34], class2.method3501(16748608) + var32.field1151, var35, var31.field675, var8, var9);
                                    } else if (var34 == 2) {
                                        method125(class161.field2357, class2.method3501(16748608) + var32.field1151, 20, var31.field675, var8, var9);
                                    }
                                }
                                method125(class161.field2542, class2.method3501(16748608) + var32.field1151, 1004, var31.field675, var8, var9);
                            } else if ((Statics.field2043 & 0x1) == 1) {
                                method125(field334, field498 + " " + class2.field23 + " " + class2.method3501(16748608) + var32.field1151, 17, var31.field675, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field391[field400];
            method3706(var38, field400, var36, var37);
        }
    }

    @ObfuscatedName("k.cj(Laj;IIII)V")
    public static final void method117(class42 arg0, int arg1, int arg2, int arg3) {
        if (field411 >= 400) {
            return;
        }
        if (arg0.field898 != null) {
            arg0 = arg0.method775();
        }
        if (arg0 == null || !arg0.field901 || arg0.field875 && field437 != arg1) {
            return;
        }
        String var4 = arg0.field873;
        if (arg0.field890 != 0) {
            var4 = var4 + method119(arg0.field890, Statics.field1663.field32) + " " + class2.field18 + class161.field2510 + arg0.field890 + class2.field16;
        }
        if (field422 == 1) {
            method125(class161.field2554, field417 + " " + class2.field23 + " " + class2.method3501(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field271) {
            String[] var5 = arg0.field906;
            if (field440) {
                var5 = method743(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class161.field2506)) {
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
                        method125(var5[var6], class2.method3501(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class161.field2506)) {
                        short var9 = 0;
                        if (field294 != class22.field565) {
                            if (field294 == class22.field562 || field294 == class22.field563 && arg0.field890 > Statics.field1663.field32) {
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
                            method125(var5[var8], class2.method3501(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method125(class161.field2542, class2.method3501(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2043 & 0x2) == 2) {
            method125(field334, field498 + " " + class2.field23 + " " + class2.method3501(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hi.cg(Lt;IIIB)V")
    public static final void method3706(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1663 == arg0 || field411 >= 400) {
            return;
        }
        String var4;
        if (arg0.field33 == 0) {
            var4 = arg0.field31[0] + arg0.field30 + arg0.field31[1] + method119(arg0.field32, Statics.field1663.field32) + " " + class2.field18 + class161.field2510 + arg0.field32 + class2.field16 + arg0.field31[2];
        } else {
            var4 = arg0.field31[0] + arg0.field30 + arg0.field31[1] + " " + class2.field18 + class161.field2511 + arg0.field33 + class2.field16 + arg0.field31[2];
        }
        if (field422 == 1) {
            method125(class161.field2554, field417 + " " + class2.field23 + " " + class2.method3501(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field271) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field397[var5] != null) {
                    short var6 = 0;
                    if (field397[var5].equalsIgnoreCase(class161.field2506)) {
                        if (field293 == class22.field565) {
                            continue;
                        }
                        if (field293 == class22.field562 || field293 == class22.field563 && arg0.field32 > Statics.field1663.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field1663.field26 != 0 && arg0.field26 != 0) {
                            if (Statics.field1663.field26 == arg0.field26) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field514[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field396[var5] + var6;
                    method125(field397[var5], class2.method3501(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2043 & 0x8) == 8) {
            method125(field334, field498 + " " + class2.field23 + " " + class2.method3501(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field411; var9++) {
            if (field307[var9] == 23) {
                field503[var9] = class2.method3501(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("h.cp(IIS)Ljava/lang/String;")
    public static final String method119(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method3501(16711680);
        } else if (var2 < -6) {
            return class2.method3501(16723968);
        } else if (var2 < -3) {
            return class2.method3501(16740352);
        } else if (var2 < 0) {
            return class2.method3501(16756736);
        } else if (var2 > 9) {
            return class2.method3501(65280);
        } else if (var2 > 6) {
            return class2.method3501(4259584);
        } else if (var2 > 3) {
            return class2.method3501(8453888);
        } else if (var2 > 0) {
            return class2.method3501(12648192);
        } else {
            return class2.method3501(16776960);
        }
    }

    @ObfuscatedName("em.ca(IIIIIIIII)V")
    public static final void method2953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method3203(arg0)) {
            Statics.field120 = null;
            method188(Statics.field2909[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field120 != null) {
                method188(Statics.field120, -1412584499, arg1, arg2, arg3, arg4, Statics.field2697, Statics.field143, arg7);
                Statics.field120 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field380[var8] = true;
            }
        } else {
            field380[arg7] = true;
        }
    }

    @ObfuscatedName("q.ct([Lfw;IIIIIIIII)V")
    public static final void method188(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1715(arg2, arg3, arg4, arg5);
        class95.method1985();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2829 == arg1 || arg1 == -1412584499 && field442 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field477[field299] = var10.field2830 + arg6;
                    field478[field299] = var10.field2813 + arg7;
                    field479[field299] = var10.field2814;
                    field480[field299] = var10.field2921;
                    var11 = ++field299 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2899 = var11;
                var10.field2931 = field326;
                if (!var10.field2798 || !method161(var10)) {
                    if (var10.field2924 > 0) {
                        int var12 = var10.field2924;
                        if (var12 == 324) {
                            if (field543 == -1) {
                                field543 = var10.field2834;
                                field544 = var10.field2835;
                            }
                            if (field542.field2961) {
                                var10.field2834 = field543;
                            } else {
                                var10.field2834 = field544;
                            }
                        } else if (var12 == 325) {
                            if (field543 == -1) {
                                field543 = var10.field2834;
                                field544 = var10.field2835;
                            }
                            if (field542.field2961) {
                                var10.field2834 = field544;
                            } else {
                                var10.field2834 = field543;
                            }
                        } else if (var12 == 327) {
                            var10.field2850 = 150;
                            var10.field2851 = (int) (Math.sin((double) field326 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2842 = 5;
                            var10.field2858 = 0;
                        } else if (var12 == 328) {
                            var10.field2850 = 150;
                            var10.field2851 = (int) (Math.sin((double) field326 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2842 = 5;
                            var10.field2858 = 1;
                        }
                    }
                    int var13 = var10.field2830 + arg6;
                    int var14 = var10.field2813 + arg7;
                    int var15 = var10.field2896;
                    if (field442 == var10) {
                        if (arg1 != -1412584499 && !var10.field2877) {
                            Statics.field120 = arg0;
                            Statics.field2697 = arg6;
                            Statics.field143 = arg7;
                            continue;
                        }
                        if (field474 && field447) {
                            int var16 = class144.field2193;
                            int var17 = class144.field2190;
                            int var18 = var16 - field281;
                            int var19 = var17 - field445;
                            if (var18 < field405) {
                                var18 = field405;
                            }
                            if (var10.field2814 + var18 > field405 + field392.field2814) {
                                var18 = field405 + field392.field2814 - var10.field2814;
                            }
                            if (var19 < field337) {
                                var19 = field337;
                            }
                            if (var10.field2921 + var19 > field337 + field392.field2921) {
                                var19 = field337 + field392.field2921 - var10.field2921;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2877) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2801 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2801 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2814 + var13;
                        int var27 = var10.field2921 + var14;
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
                        int var30 = var10.field2814 + var13;
                        int var31 = var10.field2921 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2798 || var20 < var22 && var21 < var23) {
                        if (var10.field2924 != 0) {
                            if (var10.field2924 == 1336) {
                                if (field283) {
                                    var14 += 15;
                                    Statics.field3205.method3873("Fps:" + field2237, var10.field2814 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field272) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field272) {
                                        var34 = 16711680;
                                    }
                                    Statics.field3205.method3873("Mem:" + var33 + "k", var10.field2814 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2924 == 1337) {
                                field428 = var13;
                                field406 = var14;
                                method2621(var13, var14, var10.field2814, var10.field2921);
                                field380[var10.field2899] = true;
                                class83.method1715(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2924 == 1338) {
                                method159();
                                class179 var35 = var10.method3217(false);
                                if (var35 != null) {
                                    class83.method1715(var13, var14, var35.field2944 + var13, var35.field2945 + var14);
                                    if (field327 == 2 || field327 == 5) {
                                        class83.method1734(var13, var14, 0, var35.field2949, var35.field2946);
                                    } else {
                                        int var36 = field393 + field355 & 0x7FF;
                                        int var37 = Statics.field1663.field810 / 32 + 48;
                                        int var38 = 464 - Statics.field1663.field843 / 32;
                                        Statics.field167.method1643(var13, var14, var35.field2944, var35.field2945, var37, var38, var36, field343 + 256, var35.field2949, var35.field2946);
                                        for (int var39 = 0; var39 < field499; var39++) {
                                            int var40 = field500[var39] * 4 + 2 - Statics.field1663.field810 / 32;
                                            int var41 = field501[var39] * 4 + 2 - Statics.field1663.field843 / 32;
                                            method2066(var13, var14, var40, var41, field502[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field310; var47++) {
                                                    class37 var48 = field306[field308[var47]];
                                                    if (var48 != null && var48.method35()) {
                                                        class42 var49 = var48.field770;
                                                        if (var49 != null && var49.field898 != null) {
                                                            var49 = var49.method775();
                                                        }
                                                        if (var49 != null && var49.field869 && var49.field901) {
                                                            int var50 = var48.field810 / 32 - Statics.field1663.field810 / 32;
                                                            int var51 = var48.field843 / 32 - Statics.field1663.field843 / 32;
                                                            method2066(var13, var14, var50, var51, Statics.field349[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class35.field744;
                                                int[] var53 = class35.field740;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class3 var55 = field391[var53[var54]];
                                                    if (var55 != null && var55.method35() && !var55.field51 && Statics.field1663 != var55) {
                                                        int var56 = var55.field810 / 32 - Statics.field1663.field810 / 32;
                                                        int var57 = var55.field843 / 32 - Statics.field1663.field843 / 32;
                                                        boolean var58 = false;
                                                        if (method219(var55.field30, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field765; var60++) {
                                                            if (var55.field30.equals(Statics.field1817[var60].field609)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field1663.field26 != 0 && var55.field26 != 0 && Statics.field1663.field26 == var55.field26) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method2066(var13, var14, var56, var57, Statics.field349[3], var35);
                                                        } else if (var61) {
                                                            method2066(var13, var14, var56, var57, Statics.field349[4], var35);
                                                        } else if (var59) {
                                                            method2066(var13, var14, var56, var57, Statics.field349[5], var35);
                                                        } else {
                                                            method2066(var13, var14, var56, var57, Statics.field349[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field311 != 0 && field326 % 20 < 10) {
                                                    if (field311 == 1 && field286 >= 0 && field286 < field306.length) {
                                                        class37 var62 = field306[field286];
                                                        if (var62 != null) {
                                                            int var63 = var62.field810 / 32 - Statics.field1663.field810 / 32;
                                                            int var64 = var62.field843 / 32 - Statics.field1663.field843 / 32;
                                                            method2796(var13, var14, var63, var64, Statics.field677[1], var35);
                                                        }
                                                    }
                                                    if (field311 == 2) {
                                                        int var65 = field288 * 4 - Statics.field590 * 4 + 2 - Statics.field1663.field810 / 32;
                                                        int var66 = field434 * 4 - Statics.field133 * 4 + 2 - Statics.field1663.field843 / 32;
                                                        method2796(var13, var14, var65, var66, Statics.field677[1], var35);
                                                    }
                                                    if (field311 == 10 && field418 >= 0 && field418 < field391.length) {
                                                        class3 var67 = field391[field418];
                                                        if (var67 != null) {
                                                            int var68 = var67.field810 / 32 - Statics.field1663.field810 / 32;
                                                            int var69 = var67.field843 / 32 - Statics.field1663.field843 / 32;
                                                            method2796(var13, var14, var68, var69, Statics.field677[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field535 != 0) {
                                                    int var70 = field535 * 4 + 2 - Statics.field1663.field810 / 32;
                                                    int var71 = field504 * 4 + 2 - Statics.field1663.field843 / 32;
                                                    method2066(var13, var14, var70, var71, Statics.field677[0], var35);
                                                }
                                                if (!Statics.field1663.field51) {
                                                    class83.method1721(var35.field2944 / 2 + var13 - 1, var35.field2945 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class203 var44 = field401[Statics.field1239][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field1663.field810 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field1663.field843 / 32;
                                                    method2066(var13, var14, var45, var46, Statics.field349[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field453[var11] = true;
                                }
                                class83.method1715(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2924 == 1339) {
                                class179 var72 = var10.method3217(false);
                                if (var72 != null) {
                                    if (field327 < 3) {
                                        Statics.field3098.method1643(var13, var14, var72.field2944, var72.field2945, 25, 25, field355, 256, var72.field2949, var72.field2946);
                                    } else {
                                        class83.method1734(var13, var14, 0, var72.field2949, var72.field2946);
                                    }
                                }
                                class83.method1715(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2801 == 0) {
                            if (!var10.field2798 && method161(var10) && Statics.field1197 != var10) {
                                continue;
                            }
                            if (!var10.field2798) {
                                if (var10.field2821 > var10.field2818 - var10.field2921) {
                                    var10.field2821 = var10.field2818 - var10.field2921;
                                }
                                if (var10.field2821 < 0) {
                                    var10.field2821 = 0;
                                }
                            }
                            method188(arg0, var10.field2799, var20, var21, var22, var23, var13 - var10.field2820, var14 - var10.field2821, var11);
                            if (var10.field2923 != null) {
                                method188(var10.field2923, var10.field2799, var20, var21, var22, var23, var13 - var10.field2820, var14 - var10.field2821, var11);
                            }
                            class4 var73 = (class4) field430.method3555((long) var10.field2799);
                            if (var73 != null) {
                                method2953(var73.field59, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class83.method1715(arg2, arg3, arg4, arg5);
                            class95.method1985();
                        }
                        if (field381 || field321[var11] || field481 > 1) {
                            if (var10.field2801 == 0 && !var10.field2798 && var10.field2818 > var10.field2921) {
                                method42(var10.field2814 + var13, var14, var10.field2821, var10.field2921, var10.field2818);
                            }
                            if (var10.field2801 != 1) {
                                if (var10.field2801 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var10.field2792; var75++) {
                                        for (int var76 = 0; var76 < var10.field2806; var76++) {
                                            int var77 = (var10.field2796 + 32) * var76 + var13;
                                            int var78 = (var10.field2866 + 32) * var75 + var14;
                                            if (var74 < 20) {
                                                var77 += var10.field2867[var74];
                                                var78 += var10.field2868[var74];
                                            }
                                            if (var10.field2920[var74] > 0) {
                                                boolean var79 = false;
                                                boolean var80 = false;
                                                int var81 = var10.field2920[var74] - 1;
                                                if (var77 + 32 > arg2 && var77 < arg4 && var78 + 32 > arg3 && var78 < arg5 || Statics.field1415 == var10 && field384 == var74) {
                                                    class82 var82;
                                                    if (field422 == 1 && Statics.field2216 == var74 && Statics.field671 == var10.field2799) {
                                                        var82 = class56.method538(var81, var10.field2918[var74], 2, 0, 2, false);
                                                    } else {
                                                        var82 = class56.method538(var81, var10.field2918[var74], 1, 3153952, 2, false);
                                                    }
                                                    if (var82 == null) {
                                                        method678(var10);
                                                    } else if (Statics.field1415 == var10 && field384 == var74) {
                                                        int var83 = class144.field2193 - field385;
                                                        int var84 = class144.field2190 - field386;
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (field389 < 5) {
                                                            var83 = 0;
                                                            var84 = 0;
                                                        }
                                                        var82.method1625(var77 + var83, var78 + var84, 128);
                                                        if (arg1 != -1) {
                                                            class177 var85 = arg0[arg1 & 0xFFFF];
                                                            if (var78 + var84 < class83.field1453 && var85.field2821 > 0) {
                                                                int var86 = field298 * (class83.field1453 - var78 - var84) / 3;
                                                                if (var86 > field298 * 10) {
                                                                    var86 = field298 * 10;
                                                                }
                                                                if (var86 > var85.field2821) {
                                                                    var86 = var85.field2821;
                                                                }
                                                                var85.field2821 -= var86;
                                                                field386 += var86;
                                                                method678(var85);
                                                            }
                                                            if (var78 + var84 + 32 > class83.field1455 && var85.field2821 < var85.field2818 - var85.field2921) {
                                                                int var87 = field298 * (var78 + var84 + 32 - class83.field1455) / 3;
                                                                if (var87 > field298 * 10) {
                                                                    var87 = field298 * 10;
                                                                }
                                                                if (var87 > var85.field2818 - var85.field2921 - var85.field2821) {
                                                                    var87 = var85.field2818 - var85.field2921 - var85.field2821;
                                                                }
                                                                var85.field2821 += var87;
                                                                field386 -= var87;
                                                                method678(var85);
                                                            }
                                                        }
                                                    } else if (Statics.field874 == var10 && field318 == var74) {
                                                        var82.method1625(var77, var78, 128);
                                                    } else {
                                                        var82.method1632(var77, var78);
                                                    }
                                                }
                                            } else if (var10.field2869 != null && var74 < 20) {
                                                class82 var88 = var10.method3215(var74);
                                                if (var88 != null) {
                                                    var88.method1632(var77, var78);
                                                } else if (class177.field2797) {
                                                    method678(var10);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                } else if (var10.field2801 == 3) {
                                    int var89;
                                    if (method38(var10)) {
                                        var89 = var10.field2825;
                                        if (Statics.field1197 == var10 && var10.field2827 != 0) {
                                            var89 = var10.field2827;
                                        }
                                    } else {
                                        var89 = var10.field2824;
                                        if (Statics.field1197 == var10 && var10.field2826 != 0) {
                                            var89 = var10.field2826;
                                        }
                                    }
                                    if (var10.field2828) {
                                        switch(var10.field2807.field1473) {
                                            case 1:
                                                class83.method1722(var13, var14, var10.field2814, var10.field2921, var10.field2824, var10.field2825, 256 - (var10.field2896 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1771(var13, var14, var10.field2814, var10.field2921, var10.field2824, var10.field2825, 256 - (var10.field2896 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1724(var13, var14, var10.field2814, var10.field2921, var10.field2824, var10.field2825, 256 - (var10.field2896 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1725(var13, var14, var10.field2814, var10.field2921, var10.field2824, var10.field2825, 256 - (var10.field2896 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class83.method1721(var13, var14, var10.field2814, var10.field2921, var89);
                                                } else {
                                                    class83.method1720(var13, var14, var10.field2814, var10.field2921, var89, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class83.method1735(var13, var14, var10.field2814, var10.field2921, var89);
                                    } else {
                                        class83.method1728(var13, var14, var10.field2814, var10.field2921, var89, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2801 == 4) {
                                    class228 var90 = var10.method3229();
                                    if (var90 != null) {
                                        String var91 = var10.field2859;
                                        int var92;
                                        if (method38(var10)) {
                                            var92 = var10.field2825;
                                            if (Statics.field1197 == var10 && var10.field2827 != 0) {
                                                var92 = var10.field2827;
                                            }
                                            if (var10.field2811.length() > 0) {
                                                var91 = var10.field2811;
                                            }
                                        } else {
                                            var92 = var10.field2824;
                                            if (Statics.field1197 == var10 && var10.field2826 != 0) {
                                                var92 = var10.field2826;
                                            }
                                        }
                                        if (var10.field2798 && var10.field2892 != -1) {
                                            class56 var93 = class56.method3201(var10.field2892);
                                            var91 = var93.field1151;
                                            if (var91 == null) {
                                                var91 = "null";
                                            }
                                            if ((var93.field1162 == 1 || var10.field2916 != 1) && var10.field2916 != -1) {
                                                var91 = class2.method3501(16748608) + var91 + class2.field22 + " " + 'x' + method589(var10.field2916);
                                            }
                                        }
                                        if (field433 == var10) {
                                            class161 var10000 = (class161) null;
                                            var91 = class161.field2429;
                                            var92 = var10.field2824;
                                        }
                                        if (!var10.field2798) {
                                            var91 = method115(var91, var10);
                                        }
                                        var90.method3815(var91, var13, var14, var10.field2814, var10.field2921, var92, var10.field2880 ? 0 : -1, var10.field2787, var10.field2863, var10.field2887);
                                    } else if (class177.field2797) {
                                        method678(var10);
                                    }
                                } else if (var10.field2801 == 5) {
                                    if (var10.field2798) {
                                        class82 var95;
                                        if (var10.field2892 == -1) {
                                            var95 = var10.method3213(false);
                                        } else {
                                            var95 = class56.method538(var10.field2892, var10.field2916, var10.field2838, var10.field2839, var10.field2857, false);
                                        }
                                        if (var95 != null) {
                                            int var96 = var95.field1440;
                                            int var97 = var95.field1446;
                                            if (var10.field2837) {
                                                class83.method1716(var13, var14, var10.field2814 + var13, var10.field2921 + var14);
                                                int var98 = (var10.field2814 + (var96 - 1)) / var96;
                                                int var99 = (var10.field2921 + (var97 - 1)) / var97;
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    for (int var101 = 0; var101 < var99; var101++) {
                                                        if (var10.field2836 != 0) {
                                                            var95.method1683(var96 / 2 + var96 * var100 + var13, var97 / 2 + var97 * var101 + var14, var10.field2836, 4096);
                                                        } else if (var15 == 0) {
                                                            var95.method1632(var96 * var100 + var13, var97 * var101 + var14);
                                                        } else {
                                                            var95.method1625(var96 * var100 + var13, var97 * var101 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1715(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var102 = var10.field2814 * 4096 / var96;
                                                if (var10.field2836 != 0) {
                                                    var95.method1683(var10.field2814 / 2 + var13, var10.field2921 / 2 + var14, var10.field2836, var102);
                                                } else if (var15 != 0) {
                                                    var95.method1640(var13, var14, var10.field2814, var10.field2921, 256 - (var15 & 0xFF));
                                                } else if (var10.field2814 == var96 && var10.field2921 == var97) {
                                                    var95.method1632(var13, var14);
                                                } else {
                                                    var95.method1634(var13, var14, var10.field2814, var10.field2921);
                                                }
                                            }
                                        } else if (class177.field2797) {
                                            method678(var10);
                                        }
                                    } else {
                                        class82 var94 = var10.method3213(method38(var10));
                                        if (var94 != null) {
                                            var94.method1632(var13, var14);
                                        } else if (class177.field2797) {
                                            method678(var10);
                                        }
                                    }
                                } else if (var10.field2801 == 6) {
                                    boolean var103 = method38(var10);
                                    int var104;
                                    if (var103) {
                                        var104 = var10.field2871;
                                    } else {
                                        var104 = var10.field2846;
                                    }
                                    class109 var105 = null;
                                    int var106 = 0;
                                    if (var10.field2892 != -1) {
                                        class56 var107 = class56.method3201(var10.field2892);
                                        if (var107 != null) {
                                            class56 var108 = var107.method1071(var10.field2916);
                                            var105 = var108.method1114(1);
                                            if (var105 == null) {
                                                method678(var10);
                                            } else {
                                                var105.method2169();
                                                var106 = var105.field1503 / 2;
                                            }
                                        }
                                    } else if (var10.field2842 == 5) {
                                        if (var10.field2858 == 0) {
                                            var105 = field542.method3307((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var105 = Statics.field1663.method27();
                                        }
                                    } else if (var104 == -1) {
                                        var105 = var10.method3216((class45) null, -1, var103, Statics.field1663.field27);
                                        if (var105 == null && class177.field2797) {
                                            method678(var10);
                                        }
                                    } else {
                                        class45 var109 = class45.method44(var104);
                                        var105 = var10.method3216(var109, var10.field2812, var103, Statics.field1663.field27);
                                        if (var105 == null && class177.field2797) {
                                            method678(var10);
                                        }
                                    }
                                    class95.method1993(var10.field2814 / 2 + var13, var10.field2921 / 2 + var14);
                                    int var110 = var10.field2853 * class95.field1632[var10.field2850] >> 16;
                                    int var111 = var10.field2853 * class95.field1622[var10.field2850] >> 16;
                                    if (var105 != null) {
                                        if (var10.field2798) {
                                            var105.method2169();
                                            if (var10.field2856) {
                                                var105.method2175(0, var10.field2851, var10.field2852, var10.field2850, var10.field2788, var10.field2848 + var106 + var110, var10.field2848 + var111, var10.field2853);
                                            } else {
                                                var105.method2181(0, var10.field2851, var10.field2852, var10.field2850, var10.field2788, var10.field2848 + var106 + var110, var10.field2848 + var111);
                                            }
                                        } else {
                                            var105.method2181(0, var10.field2851, 0, var10.field2850, 0, var110, var111);
                                        }
                                    }
                                    class95.method1991();
                                } else {
                                    if (var10.field2801 == 7) {
                                        class228 var112 = var10.method3229();
                                        if (var112 == null) {
                                            if (class177.field2797) {
                                                method678(var10);
                                            }
                                            continue;
                                        }
                                        int var113 = 0;
                                        for (int var114 = 0; var114 < var10.field2792; var114++) {
                                            for (int var115 = 0; var115 < var10.field2806; var115++) {
                                                if (var10.field2920[var113] > 0) {
                                                    class56 var116 = class56.method3201(var10.field2920[var113] - 1);
                                                    String var117;
                                                    if (var116.field1162 != 1 && var10.field2918[var113] == 1) {
                                                        var117 = class2.method3501(16748608) + var116.field1151 + class2.field22;
                                                    } else {
                                                        var117 = class2.method3501(16748608) + var116.field1151 + class2.field22 + " " + 'x' + method589(var10.field2918[var113]);
                                                    }
                                                    int var118 = (var10.field2796 + 115) * var115 + var13;
                                                    int var119 = (var10.field2866 + 12) * var114 + var14;
                                                    if (var10.field2787 == 0) {
                                                        var112.method3812(var117, var118, var119, var10.field2824, var10.field2880 ? 0 : -1);
                                                    } else if (var10.field2787 == 1) {
                                                        var112.method3852(var117, var10.field2814 / 2 + var118, var119, var10.field2824, var10.field2880 ? 0 : -1);
                                                    } else {
                                                        var112.method3873(var117, var10.field2814 + var118 - 1, var119, var10.field2824, var10.field2880 ? 0 : -1);
                                                    }
                                                }
                                                var113++;
                                            }
                                        }
                                    }
                                    if (var10.field2801 == 8 && Statics.field794 == var10 && field449 == field420) {
                                        int var120 = 0;
                                        int var121 = 0;
                                        class228 var122 = Statics.field3205;
                                        String var123 = var10.field2859;
                                        String var124 = method115(var123, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field19);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            int var127 = var122.method3807(var126);
                                            if (var127 > var120) {
                                                var120 = var127;
                                            }
                                            var121 += var122.field3239 + 1;
                                        }
                                        var120 += 6;
                                        var121 += 7;
                                        int var128 = var10.field2814 + var13 - 5 - var120;
                                        int var129 = var10.field2921 + var14 + 5;
                                        if (var128 < var13 + 5) {
                                            var128 = var13 + 5;
                                        }
                                        if (var120 + var128 > arg4) {
                                            var128 = arg4 - var120;
                                        }
                                        if (var121 + var129 > arg5) {
                                            var129 = arg5 - var121;
                                        }
                                        class83.method1721(var128, var129, var120, var121, 16777120);
                                        class83.method1735(var128, var129, var120, var121, 0);
                                        String var130 = var10.field2859;
                                        int var131 = var122.field3239 + var129 + 2;
                                        String var132 = method115(var130, var10);
                                        while (var132.length() > 0) {
                                            int var133 = var132.indexOf(class2.field19);
                                            String var134;
                                            if (var133 == -1) {
                                                var134 = var132;
                                                var132 = "";
                                            } else {
                                                var134 = var132.substring(0, var133);
                                                var132 = var132.substring(var133 + 4);
                                            }
                                            var122.method3812(var134, var128 + 3, var131, 0, -1);
                                            var131 += var122.field3239 + 1;
                                        }
                                    }
                                    if (var10.field2801 == 9) {
                                        if (var10.field2832 == 1) {
                                            int var135;
                                            int var136;
                                            int var137;
                                            int var138;
                                            if (var10.field2879) {
                                                var135 = var13;
                                                var136 = var10.field2921 + var14;
                                                var137 = var10.field2814 + var13;
                                                var138 = var14;
                                            } else {
                                                var135 = var13;
                                                var136 = var14;
                                                var137 = var10.field2814 + var13;
                                                var138 = var10.field2921 + var14;
                                            }
                                            class83.method1733(var135, var136, var137, var138, var10.field2824);
                                        } else {
                                            int var139 = var10.field2814 >= 0 ? var10.field2814 : -var10.field2814;
                                            int var140 = var10.field2921 >= 0 ? var10.field2921 : -var10.field2921;
                                            int var141 = var139;
                                            if (var139 < var140) {
                                                var141 = var140;
                                            }
                                            if (var141 != 0) {
                                                int var142 = (var10.field2814 << 16) / var141;
                                                int var143 = (var10.field2921 << 16) / var141;
                                                if (var143 <= var142) {
                                                    var142 = -var142;
                                                } else {
                                                    var143 = -var143;
                                                }
                                                int var144 = var10.field2832 * var143 >> 17;
                                                int var145 = var10.field2832 * var143 + 1 >> 17;
                                                int var146 = var10.field2832 * var142 >> 17;
                                                int var147 = var10.field2832 * var142 + 1 >> 17;
                                                int var148 = var13 + var144;
                                                int var149 = var13 - var145;
                                                int var150 = var10.field2814 + var13 - var145;
                                                int var151 = var10.field2814 + var13 + var144;
                                                int var152 = var14 + var146;
                                                int var153 = var14 - var147;
                                                int var154 = var10.field2921 + var14 - var147;
                                                int var155 = var10.field2921 + var14 + var146;
                                                class95.method1992(var148, var149, var150);
                                                class95.method1995(var152, var153, var154, var148, var149, var150, var10.field2824);
                                                class95.method1992(var148, var150, var151);
                                                class95.method1995(var152, var154, var155, var148, var150, var151, var10.field2824);
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

    @ObfuscatedName("k.cb(Ljava/lang/String;Lfw;I)Ljava/lang/String;")
    public static String method115(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method88(arg1, var2 - 1);
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
                if (Statics.field1130 != null) {
                    var8 = class167.method2980(Statics.field1130.field2255);
                    if (Statics.field1130.field2262 != null) {
                        var8 = (String) Statics.field1130.field2262;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cx(II)Ljava/lang/String;")
    public static final String method589(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3501(65408) + var1.substring(0, var1.length() - 8) + class161.field2515 + " " + class2.field18 + var1 + class2.field16 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method3501(16777215) + var1.substring(0, var1.length() - 4) + class161.field2517 + " " + class2.field18 + var1 + class2.field16 + class2.field22;
        } else {
            return " " + class2.method3501(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("bh.ci(Lfw;B)V")
    public static void method1045(class177 arg0) {
        class177 var1 = arg0.field2829 == -1 ? null : class177.method1982(arg0.field2829);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1070;
            var3 = Statics.field2144;
        } else {
            var2 = var1.field2814;
            var3 = var1.field2921;
        }
        method7(arg0, var2, var3, false);
        method1035(arg0, var2, var3);
    }

    @ObfuscatedName("m.co([Lfw;Lfw;ZI)V")
    public static void method98(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2822 == 0 ? arg1.field2814 : arg1.field2822;
        int var4 = arg1.field2818 == 0 ? arg1.field2921 : arg1.field2818;
        method218(arg0, arg1.field2799, var3, var4, arg2);
        if (arg1.field2923 != null) {
            method218(arg1.field2923, arg1.field2799, var3, var4, arg2);
        }
        class4 var5 = (class4) field430.method3555((long) arg1.field2799);
        if (var5 != null) {
            method134(var5.field59, var3, var4, arg2);
        }
        if (arg1.field2924 == 1337) {
        }
    }

    @ObfuscatedName("w.cw(IIIZI)V")
    public static final void method134(int arg0, int arg1, int arg2, boolean arg3) {
        if (class177.method3203(arg0)) {
            method218(Statics.field2909[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("c.cl([Lfw;IIIZI)V")
    public static void method218(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2829 == arg1) {
                method7(var6, arg2, arg3, arg4);
                method1035(var6, arg2, arg3);
                if (var6.field2820 > var6.field2822 - var6.field2814) {
                    var6.field2820 = var6.field2822 - var6.field2814;
                }
                if (var6.field2820 < 0) {
                    var6.field2820 = 0;
                }
                if (var6.field2821 > var6.field2818 - var6.field2921) {
                    var6.field2821 = var6.field2818 - var6.field2921;
                }
                if (var6.field2821 < 0) {
                    var6.field2821 = 0;
                }
                if (var6.field2801 == 0) {
                    method98(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("z.ce(Lfw;IIZI)V")
    public static void method7(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2814;
        int var5 = arg0.field2921;
        if (arg0.field2908 == 0) {
            arg0.field2814 = arg0.field2806;
        } else if (arg0.field2908 == 1) {
            arg0.field2814 = arg1 - arg0.field2806;
        } else if (arg0.field2908 == 2) {
            arg0.field2814 = arg0.field2806 * arg1 >> 14;
        }
        if (arg0.field2810 == 0) {
            arg0.field2921 = arg0.field2792;
        } else if (arg0.field2810 == 1) {
            arg0.field2921 = arg2 - arg0.field2792;
        } else if (arg0.field2810 == 2) {
            arg0.field2921 = arg0.field2792 * arg2 >> 14;
        }
        if (arg0.field2908 == 4) {
            arg0.field2814 = arg0.field2921 * arg0.field2803 / arg0.field2817;
        }
        if (arg0.field2810 == 4) {
            arg0.field2921 = arg0.field2817 * arg0.field2814 / arg0.field2803;
        }
        if (field439 && arg0.field2801 == 0) {
            if (arg0.field2921 < 5 && arg0.field2814 < 5) {
                arg0.field2921 = 5;
                arg0.field2814 = 5;
            } else {
                if (arg0.field2921 <= 0) {
                    arg0.field2921 = 5;
                }
                if (arg0.field2814 <= 0) {
                    arg0.field2814 = 5;
                }
            }
        }
        if (arg0.field2924 == 1337) {
            field441 = arg0;
        }
        if (arg3 && arg0.field2919 != null && (arg0.field2814 != var4 || arg0.field2921 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field6 = arg0.field2919;
            field468.method3581(var6);
        }
    }

    @ObfuscatedName("bh.cy(Lfw;IIB)V")
    public static void method1035(class177 arg0, int arg1, int arg2) {
        if (arg0.field2804 == 0) {
            arg0.field2830 = arg0.field2808;
        } else if (arg0.field2804 == 1) {
            arg0.field2830 = (arg1 - arg0.field2814) / 2 + arg0.field2808;
        } else if (arg0.field2804 == 2) {
            arg0.field2830 = arg1 - arg0.field2814 - arg0.field2808;
        } else if (arg0.field2804 == 3) {
            arg0.field2830 = arg0.field2808 * arg1 >> 14;
        } else if (arg0.field2804 == 4) {
            arg0.field2830 = (arg0.field2808 * arg1 >> 14) + (arg1 - arg0.field2814) / 2;
        } else {
            arg0.field2830 = arg1 - arg0.field2814 - (arg0.field2808 * arg1 >> 14);
        }
        if (arg0.field2805 == 0) {
            arg0.field2813 = arg0.field2809;
        } else if (arg0.field2805 == 1) {
            arg0.field2813 = (arg2 - arg0.field2921) / 2 + arg0.field2809;
        } else if (arg0.field2805 == 2) {
            arg0.field2813 = arg2 - arg0.field2921 - arg0.field2809;
        } else if (arg0.field2805 == 3) {
            arg0.field2813 = arg0.field2809 * arg2 >> 14;
        } else if (arg0.field2805 == 4) {
            arg0.field2813 = (arg0.field2809 * arg2 >> 14) + (arg2 - arg0.field2921) / 2;
        } else {
            arg0.field2813 = arg2 - arg0.field2921 - (arg0.field2809 * arg2 >> 14);
        }
        if (!field439 || arg0.field2801 != 0) {
            return;
        }
        if (arg0.field2830 < 0) {
            arg0.field2830 = 0;
        } else if (arg0.field2830 + arg0.field2814 > arg1) {
            arg0.field2830 = arg1 - arg0.field2814;
        }
        if (arg0.field2813 < 0) {
            arg0.field2813 = 0;
        } else if (arg0.field2921 + arg0.field2813 > arg2) {
            arg0.field2813 = arg2 - arg0.field2921;
        }
    }

    @ObfuscatedName("y.cc(IIIIIB)V")
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2700[0].method1791(arg0, arg1);
        Statics.field2700[1].method1791(arg0, arg1 + arg3 - 16);
        class83.method1721(arg0, arg1 + 16, 16, arg3 - 32, field348);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class83.method1721(arg0, arg1 + 16 + var6, 16, var5, field398);
        class83.method1753(arg0, arg1 + 16 + var6, var5, field370);
        class83.method1753(arg0 + 1, arg1 + 16 + var6, var5, field370);
        class83.method1729(arg0, arg1 + 16 + var6, 16, field370);
        class83.method1729(arg0, arg1 + 17 + var6, 16, field370);
        class83.method1753(arg0 + 15, arg1 + 16 + var6, var5, field350);
        class83.method1753(arg0 + 14, arg1 + 17 + var6, var5 - 1, field350);
        class83.method1729(arg0, arg1 + 15 + var6 + var5, 16, field350);
        class83.method1729(arg0 + 1, arg1 + 14 + var6 + var5, 15, field350);
    }

    @ObfuscatedName("t.cr(Lfw;I)Z")
    public static final boolean method38(class177 arg0) {
        if (arg0.field2912 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2912.length; var1++) {
            int var2 = method88(arg0, var1);
            int var3 = arg0.field2913[var1];
            if (arg0.field2912[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2912[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2912[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("m.cq(Lfw;II)I")
    public static final int method88(class177 arg0, int arg1) {
        if (arg0.field2911 == null || arg1 >= arg0.field2911.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2911[arg1];
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
                    var7 = field373[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field292[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field407[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class177 var11 = class177.method1982(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method3201(var12).field1140 || field487)) {
                        for (int var13 = 0; var13 < var11.field2920.length; var13++) {
                            if (var12 + 1 == var11.field2920[var13]) {
                                var7 += var11.field2918[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2952[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2340[field292[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2952[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1663.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2339[var14]) {
                            var7 += field292[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method1982(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method3201(var18).field1140 || field487)) {
                        for (int var19 = 0; var19 < var17.field2920.length; var19++) {
                            if (var18 + 1 == var17.field2920[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field289;
                }
                if (var6 == 12) {
                    var7 = field435;
                }
                if (var6 == 13) {
                    int var20 = class180.field2952[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method3191(var22);
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
                    var7 = (Statics.field1663.field810 >> 7) + Statics.field590;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1663.field843 >> 7) + Statics.field133;
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

    @ObfuscatedName("ek.cf(Lfw;III)V")
    public static final void method2946(class177 arg0, int arg1, int arg2) {
        if (arg0.field2802 == 1) {
            method125(arg0.field2930, "", 24, 0, 0, arg0.field2799);
        }
        if (arg0.field2802 == 2 && !field271) {
            String var3 = method100(arg0);
            if (var3 != null) {
                method125(var3, class2.method3501(65280) + arg0.field2915, 25, 0, -1, arg0.field2799);
            }
        }
        if (arg0.field2802 == 3) {
            method125(class161.field2497, "", 26, 0, 0, arg0.field2799);
        }
        if (arg0.field2802 == 4) {
            method125(arg0.field2930, "", 28, 0, 0, arg0.field2799);
        }
        if (arg0.field2802 == 5) {
            method125(arg0.field2930, "", 29, 0, 0, arg0.field2799);
        }
        if (arg0.field2802 == 6 && field433 == null) {
            method125(arg0.field2930, "", 30, 0, -1, arg0.field2799);
        }
        if (arg0.field2801 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2921; var5++) {
                for (int var6 = 0; var6 < arg0.field2814; var6++) {
                    int var7 = (arg0.field2796 + 32) * var6;
                    int var8 = (arg0.field2866 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2867[var4];
                        var8 += arg0.field2868[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field387 = var4;
                        Statics.field763 = arg0;
                        if (arg0.field2920[var4] > 0) {
                            label330: {
                                class56 var9 = class56.method3201(arg0.field2920[var4] - 1);
                                if (field422 == 1) {
                                    int var10 = method137(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field671 != arg0.field2799 || Statics.field2216 != var4) {
                                            method125(class161.field2554, field417 + " " + class2.field23 + " " + class2.method3501(16748608) + var9.field1151, 31, var9.field1149, var4, arg0.field2799);
                                        }
                                        break label330;
                                    }
                                }
                                if (field271) {
                                    int var12 = method137(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2043 & 0x10) == 16) {
                                            method125(field334, field498 + " " + class2.field23 + " " + class2.method3501(16748608) + var9.field1151, 32, var9.field1149, var4, arg0.field2799);
                                        }
                                        break label330;
                                    }
                                }
                                String[] var14 = var9.field1166;
                                if (field440) {
                                    var14 = method743(var14);
                                }
                                int var15 = method137(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != null && var14[var17] != null) {
                                            byte var18;
                                            if (var17 == 3) {
                                                var18 = 36;
                                            } else {
                                                var18 = 37;
                                            }
                                            method125(var14[var17], class2.method3501(16748608) + var9.field1151, var18, var9.field1149, var4, arg0.field2799);
                                        } else if (var17 == 4) {
                                            method125(class161.field2358, class2.method3501(16748608) + var9.field1151, 37, var9.field1149, var4, arg0.field2799);
                                        }
                                    }
                                }
                                class182 var10000 = (class182) null;
                                if (class182.method3014(method137(arg0))) {
                                    method125(class161.field2554, class2.method3501(16748608) + var9.field1151, 38, var9.field1149, var4, arg0.field2799);
                                }
                                int var19 = method137(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20 && var14 != null) {
                                    for (int var21 = 2; var21 >= 0; var21--) {
                                        if (var14[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 33;
                                            }
                                            if (var21 == 1) {
                                                var22 = 34;
                                            }
                                            if (var21 == 2) {
                                                var22 = 35;
                                            }
                                            method125(var14[var21], class2.method3501(16748608) + var9.field1151, var22, var9.field1149, var4, arg0.field2799);
                                        }
                                    }
                                }
                                String[] var23 = arg0.field2870;
                                if (field440) {
                                    var23 = method743(var23);
                                }
                                if (var23 != null) {
                                    for (int var24 = 4; var24 >= 0; var24--) {
                                        if (var23[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 39;
                                            }
                                            if (var24 == 1) {
                                                var25 = 40;
                                            }
                                            if (var24 == 2) {
                                                var25 = 41;
                                            }
                                            if (var24 == 3) {
                                                var25 = 42;
                                            }
                                            if (var24 == 4) {
                                                var25 = 43;
                                            }
                                            method125(var23[var24], class2.method3501(16748608) + var9.field1151, var25, var9.field1149, var4, arg0.field2799);
                                        }
                                    }
                                }
                                method125(class161.field2542, class2.method3501(16748608) + var9.field1151, 1005, var9.field1149, var4, arg0.field2799);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2798) {
            return;
        }
        if (field271) {
            int var26 = method137(arg0);
            boolean var27 = (var26 >> 21 & 0x1) != 0;
            if (var27 && (Statics.field2043 & 0x20) == 32) {
                method125(field334, field498 + " " + class2.field23 + " " + arg0.field2872, 58, 0, arg0.field2800, arg0.field2799);
            }
            return;
        }
        for (int var28 = 9; var28 >= 5; var28--) {
            String var29;
            if (!class182.method745(method137(arg0), var28) && arg0.field2874 == null) {
                var29 = null;
            } else if (arg0.field2873 == null || arg0.field2873.length <= var28 || arg0.field2873[var28] == null || arg0.field2873[var28].trim().length() == 0) {
                var29 = null;
            } else {
                var29 = arg0.field2873[var28];
            }
            if (var29 != null) {
                method125(var29, arg0.field2872, 1007, var28 + 1, arg0.field2800, arg0.field2799);
            }
        }
        String var31 = method100(arg0);
        if (var31 != null) {
            method125(var31, arg0.field2872, 25, 0, arg0.field2800, arg0.field2799);
        }
        for (int var32 = 4; var32 >= 0; var32--) {
            String var33;
            if (!class182.method745(method137(arg0), var32) && arg0.field2874 == null) {
                var33 = null;
            } else if (arg0.field2873 == null || arg0.field2873.length <= var32 || arg0.field2873[var32] == null || arg0.field2873[var32].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field2873[var32];
            }
            if (var33 != null) {
                method125(var33, arg0.field2872, 57, var32 + 1, arg0.field2800, arg0.field2799);
            }
        }
        int var35 = method137(arg0);
        boolean var36 = (var35 & 0x1) != 0;
        if (var36) {
            method125(class161.field2362, "", 30, 0, arg0.field2800, arg0.field2799);
        }
    }

    @ObfuscatedName("v.cv([Lfw;IIIIIIIB)V")
    public static final void method564(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2798 || var9.field2801 == 0 || var9.field2917 || method137(var9) != 0 || field392 == var9 || var9.field2924 == 1338) && var9.field2829 == arg1 && (!var9.field2798 || !method161(var9))) {
                int var10 = var9.field2830 + arg6;
                int var11 = var9.field2813 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2801 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2801 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2814 + var10;
                    int var19 = var9.field2921 + var11;
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
                    int var22 = var9.field2814 + var10;
                    int var23 = var9.field2921 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field442 == var9) {
                    field450 = true;
                    field451 = var10;
                    field475 = var11;
                }
                if (!var9.field2798 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2193;
                    int var25 = class144.field2190;
                    if (class144.field2199 != 0) {
                        var24 = class144.field2189;
                        var25 = class144.field2197;
                    }
                    if (var9.field2924 == 1337) {
                        if (!field276 && !field409 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method549(var24, var25, var12, var13);
                        }
                    } else if (var9.field2924 == 1338) {
                        method157(var9, var10, var11);
                    } else {
                        if (!field409 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2946(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2801 == 0) {
                            if (!var9.field2798 && method161(var9) && Statics.field1197 != var9) {
                                continue;
                            }
                            method564(arg0, var9.field2799, var12, var13, var14, var15, var10 - var9.field2820, var11 - var9.field2821);
                            if (var9.field2923 != null) {
                                method564(var9.field2923, var9.field2799, var12, var13, var14, var15, var10 - var9.field2820, var11 - var9.field2821);
                            }
                            class4 var26 = (class4) field430.method3555((long) var9.field2799);
                            if (var26 != null) {
                                if (var26.field55 == 0 && class144.field2193 >= var12 && class144.field2190 >= var13 && class144.field2193 < var14 && class144.field2190 < var15 && !field409 && !field439) {
                                    for (class1 var27 = (class1) field468.method3588(); var27 != null; var27 = (class1) field468.method3590()) {
                                        if (var27.field1) {
                                            var27.method3699();
                                            var27.field3.field2864 = false;
                                        }
                                    }
                                    if (Statics.field2312 == 0) {
                                        field442 = null;
                                        field392 = null;
                                    }
                                    if (!field409) {
                                        field416[0] = class161.field2593;
                                        field503[0] = "";
                                        field307[0] = 1006;
                                        field411 = 1;
                                    }
                                }
                                int var28 = var26.field59;
                                if (class177.method3203(var28)) {
                                    method564(Statics.field2909[var28], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2798) {
                            if (var9.field2932) {
                                if (class144.field2193 >= var12 && class144.field2190 >= var13 && class144.field2193 < var14 && class144.field2190 < var15) {
                                    for (class1 var29 = (class1) field468.method3588(); var29 != null; var29 = (class1) field468.method3590()) {
                                        if (var29.field1) {
                                            var29.method3699();
                                            var29.field3.field2864 = false;
                                        }
                                    }
                                    if (Statics.field2312 == 0) {
                                        field442 = null;
                                        field392 = null;
                                    }
                                    if (!field409) {
                                        field416[0] = class161.field2593;
                                        field503[0] = "";
                                        field307[0] = 1006;
                                        field411 = 1;
                                    }
                                }
                            } else if (var9.field2933 && class144.field2193 >= var12 && class144.field2190 >= var13 && class144.field2193 < var14 && class144.field2190 < var15) {
                                for (class1 var30 = (class1) field468.method3588(); var30 != null; var30 = (class1) field468.method3590()) {
                                    if (var30.field1 && var30.field3.field2900 == var30.field6) {
                                        var30.method3699();
                                    }
                                }
                            }
                            boolean var31;
                            if (class144.field2193 >= var12 && class144.field2190 >= var13 && class144.field2193 < var14 && class144.field2190 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class144.field2185 == 1 || !Statics.field246 && class144.field2185 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class144.field2199 == 1 || !Statics.field246 && class144.field2199 == 4) && class144.field2189 >= var12 && class144.field2197 >= var13 && class144.field2189 < var14 && class144.field2197 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method53(var9, class144.field2189 - var10, class144.field2197 - var11);
                            }
                            if (field442 != null && field442 != var9 && var31) {
                                int var34 = method137(var9);
                                boolean var35 = (var34 >> 20 & 0x1) != 0;
                                if (var35) {
                                    field284 = var9;
                                }
                            }
                            if (field392 == var9) {
                                field447 = true;
                                field405 = var10;
                                field337 = var11;
                            }
                            if (var9.field2917) {
                                if (var31 && field336 != 0 && var9.field2900 != null) {
                                    class1 var36 = new class1();
                                    var36.field1 = true;
                                    var36.field3 = var9;
                                    var36.field2 = field336;
                                    var36.field6 = var9.field2900;
                                    field468.method3581(var36);
                                }
                                if (field442 != null || Statics.field1415 != null || field409) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2876 && var33) {
                                    var9.field2876 = true;
                                    if (var9.field2881 != null) {
                                        class1 var37 = new class1();
                                        var37.field1 = true;
                                        var37.field3 = var9;
                                        var37.field11 = class144.field2189 - var10;
                                        var37.field2 = class144.field2197 - var11;
                                        var37.field6 = var9.field2881;
                                        field468.method3581(var37);
                                    }
                                }
                                if (var9.field2876 && var32 && var9.field2882 != null) {
                                    class1 var38 = new class1();
                                    var38.field1 = true;
                                    var38.field3 = var9;
                                    var38.field11 = class144.field2193 - var10;
                                    var38.field2 = class144.field2190 - var11;
                                    var38.field6 = var9.field2882;
                                    field468.method3581(var38);
                                }
                                if (var9.field2876 && !var32) {
                                    var9.field2876 = false;
                                    if (var9.field2861 != null) {
                                        class1 var39 = new class1();
                                        var39.field1 = true;
                                        var39.field3 = var9;
                                        var39.field11 = class144.field2193 - var10;
                                        var39.field2 = class144.field2190 - var11;
                                        var39.field6 = var9.field2861;
                                        field470.method3581(var39);
                                    }
                                }
                                if (var32 && var9.field2883 != null) {
                                    class1 var40 = new class1();
                                    var40.field1 = true;
                                    var40.field3 = var9;
                                    var40.field11 = class144.field2193 - var10;
                                    var40.field2 = class144.field2190 - var11;
                                    var40.field6 = var9.field2883;
                                    field468.method3581(var40);
                                }
                                if (!var9.field2864 && var31) {
                                    var9.field2864 = true;
                                    if (var9.field2928 != null) {
                                        class1 var41 = new class1();
                                        var41.field1 = true;
                                        var41.field3 = var9;
                                        var41.field11 = class144.field2193 - var10;
                                        var41.field2 = class144.field2190 - var11;
                                        var41.field6 = var9.field2928;
                                        field468.method3581(var41);
                                    }
                                }
                                if (var9.field2864 && var31 && var9.field2886 != null) {
                                    class1 var42 = new class1();
                                    var42.field1 = true;
                                    var42.field3 = var9;
                                    var42.field11 = class144.field2193 - var10;
                                    var42.field2 = class144.field2190 - var11;
                                    var42.field6 = var9.field2886;
                                    field468.method3581(var42);
                                }
                                if (var9.field2864 && !var31) {
                                    var9.field2864 = false;
                                    if (var9.field2815 != null) {
                                        class1 var43 = new class1();
                                        var43.field1 = true;
                                        var43.field3 = var9;
                                        var43.field11 = class144.field2193 - var10;
                                        var43.field2 = class144.field2190 - var11;
                                        var43.field6 = var9.field2815;
                                        field470.method3581(var43);
                                    }
                                }
                                if (var9.field2898 != null) {
                                    class1 var44 = new class1();
                                    var44.field3 = var9;
                                    var44.field6 = var9.field2898;
                                    field302.method3581(var44);
                                }
                                if (var9.field2823 != null && field456 > var9.field2927) {
                                    if (var9.field2893 == null || field456 - var9.field2927 > 32) {
                                        class1 var49 = new class1();
                                        var49.field3 = var9;
                                        var49.field6 = var9.field2823;
                                        field468.method3581(var49);
                                    } else {
                                        label564: for (int var45 = var9.field2927; var45 < field456; var45++) {
                                            int var46 = field473[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2893.length; var47++) {
                                                if (var9.field2893[var47] == var46) {
                                                    class1 var48 = new class1();
                                                    var48.field3 = var9;
                                                    var48.field6 = var9.field2823;
                                                    field468.method3581(var48);
                                                    break label564;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2927 = field456;
                                }
                                if (var9.field2894 != null && field458 > var9.field2865) {
                                    if (var9.field2847 == null || field458 - var9.field2865 > 32) {
                                        class1 var54 = new class1();
                                        var54.field3 = var9;
                                        var54.field6 = var9.field2894;
                                        field468.method3581(var54);
                                    } else {
                                        label540: for (int var50 = var9.field2865; var50 < field458; var50++) {
                                            int var51 = field457[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2847.length; var52++) {
                                                if (var9.field2847[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field3 = var9;
                                                    var53.field6 = var9.field2894;
                                                    field468.method3581(var53);
                                                    break label540;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2865 = field458;
                                }
                                if (var9.field2888 != null && field460 > var9.field2929) {
                                    if (var9.field2897 == null || field460 - var9.field2929 > 32) {
                                        class1 var59 = new class1();
                                        var59.field3 = var9;
                                        var59.field6 = var9.field2888;
                                        field468.method3581(var59);
                                    } else {
                                        label516: for (int var55 = var9.field2929; var55 < field460; var55++) {
                                            int var56 = field322[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2897.length; var57++) {
                                                if (var9.field2897[var57] == var56) {
                                                    class1 var58 = new class1();
                                                    var58.field3 = var9;
                                                    var58.field6 = var9.field2888;
                                                    field468.method3581(var58);
                                                    break label516;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2929 = field460;
                                }
                                if (field461 > var9.field2926 && var9.field2901 != null) {
                                    class1 var60 = new class1();
                                    var60.field3 = var9;
                                    var60.field6 = var9.field2901;
                                    field468.method3581(var60);
                                }
                                if (field462 > var9.field2926 && var9.field2903 != null) {
                                    class1 var61 = new class1();
                                    var61.field3 = var9;
                                    var61.field6 = var9.field2903;
                                    field468.method3581(var61);
                                }
                                if (field463 > var9.field2926 && var9.field2904 != null) {
                                    class1 var62 = new class1();
                                    var62.field3 = var9;
                                    var62.field6 = var9.field2904;
                                    field468.method3581(var62);
                                }
                                if (field285 > var9.field2926 && var9.field2891 != null) {
                                    class1 var63 = new class1();
                                    var63.field3 = var9;
                                    var63.field6 = var9.field2891;
                                    field468.method3581(var63);
                                }
                                if (field465 > var9.field2926 && var9.field2895 != null) {
                                    class1 var64 = new class1();
                                    var64.field3 = var9;
                                    var64.field6 = var9.field2895;
                                    field468.method3581(var64);
                                }
                                if (field333 > var9.field2926 && var9.field2905 != null) {
                                    class1 var65 = new class1();
                                    var65.field3 = var9;
                                    var65.field6 = var9.field2905;
                                    field468.method3581(var65);
                                }
                                var9.field2926 = field454;
                                if (var9.field2902 != null) {
                                    for (int var66 = 0; var66 < field492; var66++) {
                                        class1 var67 = new class1();
                                        var67.field3 = var9;
                                        var67.field5 = field494[var66];
                                        var67.field9 = field493[var66];
                                        var67.field6 = var9.field2902;
                                        field468.method3581(var67);
                                    }
                                }
                            }
                        }
                        if (!var9.field2798 && field442 == null && Statics.field1415 == null && !field409) {
                            if ((var9.field2914 >= 0 || var9.field2826 != 0) && class144.field2193 >= var12 && class144.field2190 >= var13 && class144.field2193 < var14 && class144.field2190 < var15) {
                                if (var9.field2914 >= 0) {
                                    Statics.field1197 = arg0[var9.field2914];
                                } else {
                                    Statics.field1197 = var9;
                                }
                            }
                            if (var9.field2801 == 8 && class144.field2193 >= var12 && class144.field2190 >= var13 && class144.field2193 < var14 && class144.field2190 < var15) {
                                Statics.field794 = var9;
                            }
                            if (var9.field2818 > var9.field2921) {
                                int var68 = var9.field2814 + var10;
                                int var69 = var9.field2921;
                                int var70 = var9.field2818;
                                int var71 = class144.field2193;
                                int var72 = class144.field2190;
                                if (field383) {
                                    field424 = 32;
                                } else {
                                    field424 = 0;
                                }
                                field383 = false;
                                if (class144.field2185 == 1 || !Statics.field246 && class144.field2185 == 4) {
                                    if (var71 >= var68 && var71 < var68 + 16 && var72 >= var11 && var72 < var11 + 16) {
                                        var9.field2821 -= 4;
                                        method678(var9);
                                    } else if (var71 >= var68 && var71 < var68 + 16 && var72 >= var11 + var69 - 16 && var72 < var11 + var69) {
                                        var9.field2821 += 4;
                                        method678(var9);
                                    } else if (var71 >= var68 - field424 && var71 < field424 + var68 + 16 && var72 >= var11 + 16 && var72 < var11 + var69 - 16) {
                                        int var73 = (var69 - 32) * var69 / var70;
                                        if (var73 < 8) {
                                            var73 = 8;
                                        }
                                        int var74 = var72 - var11 - 16 - var73 / 2;
                                        int var75 = var69 - 32 - var73;
                                        var9.field2821 = (var70 - var69) * var74 / var75;
                                        method678(var9);
                                        field383 = true;
                                    }
                                }
                                if (field336 != 0) {
                                    int var76 = var9.field2814;
                                    if (var71 >= var68 - var76 && var72 >= var11 && var71 < var68 + 16 && var72 <= var11 + var69) {
                                        var9.field2821 += field336 * 45;
                                        method678(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ck(III)V")
    public static final void method677(int arg0, int arg1) {
        if (class177.method3203(arg0)) {
            method2279(Statics.field2909[arg0], arg1);
        }
    }

    @ObfuscatedName("dx.cd([Lfw;II)V")
    public static final void method2279(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2801 == 0) {
                    if (var3.field2923 != null) {
                        method2279(var3.field2923, arg1);
                    }
                    class4 var4 = (class4) field430.method3555((long) var3.field2799);
                    if (var4 != null) {
                        int var5 = var4.field59;
                        if (class177.method3203(var5)) {
                            method2279(Statics.field2909[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2906 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field6 = var3.field2906;
                    class39.method742(var6);
                }
                if (arg1 == 1 && var3.field2907 != null) {
                    if (var3.field2800 >= 0) {
                        class177 var7 = class177.method1982(var3.field2799);
                        if (var7 == null || var7.field2923 == null || var3.field2800 >= var7.field2923.length || var7.field2923[var3.field2800] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field6 = var3.field2907;
                    class39.method742(var8);
                }
            }
        }
    }

    @ObfuscatedName("g.cn(Lfw;III)V")
    public static final void method53(class177 arg0, int arg1, int arg2) {
        if (field442 != null || field409 || arg0 == null) {
            return;
        }
        class177 var3 = method723(arg0);
        if (var3 == null) {
            var3 = arg0.field2843;
        }
        if (var3 == null) {
            return;
        }
        field442 = arg0;
        class177 var5 = method723(arg0);
        if (var5 == null) {
            var5 = arg0.field2843;
        }
        field392 = var5;
        field281 = arg1;
        field445 = arg2;
        Statics.field2312 = 0;
        field474 = false;
        if (field411 > 0) {
            method3265(field411 - 1);
        }
        return;
    }

    @ObfuscatedName("fd.cm(II)V")
    public static void method3265(int arg0) {
        Statics.field1023 = new class33();
        Statics.field1023.field700 = field329[arg0];
        Statics.field1023.field692 = field413[arg0];
        Statics.field1023.field693 = field307[arg0];
        Statics.field1023.field694 = field415[arg0];
        Statics.field1023.field695 = field416[arg0];
    }

    @ObfuscatedName("ar.cu(Lfw;I)V")
    public static void method678(class177 arg0) {
        if (field506 == arg0.field2931) {
            field380[arg0.field2899] = true;
        }
    }

    @ObfuscatedName("av.cs([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method743(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.ch(II)V")
    public static final void method841(int arg0) {
        if (!class177.method3203(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2909[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2812 = 0;
                var3.field2922 = 0;
            }
        }
    }

    @ObfuscatedName("av.dr([Lfw;IB)V")
    public static final void method736(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2829 == arg1 && (!var3.field2798 || !method161(var3))) {
                if (var3.field2801 == 0) {
                    if (!var3.field2798 && method161(var3) && Statics.field1197 != var3) {
                        continue;
                    }
                    method736(arg0, var3.field2799);
                    if (var3.field2923 != null) {
                        method736(var3.field2923, var3.field2799);
                    }
                    class4 var4 = (class4) field430.method3555((long) var3.field2799);
                    if (var4 != null) {
                        int var5 = var4.field59;
                        if (class177.method3203(var5)) {
                            method736(Statics.field2909[var5], -1);
                        }
                    }
                }
                if (var3.field2801 == 6) {
                    if (var3.field2846 != -1 || var3.field2871 != -1) {
                        boolean var6 = method38(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2871;
                        } else {
                            var7 = var3.field2846;
                        }
                        if (var7 != -1) {
                            class45 var8 = class45.method44(var7);
                            var3.field2922 += field298;
                            while (var3.field2922 > var8.field982[var3.field2812]) {
                                var3.field2922 -= var8.field982[var3.field2812];
                                var3.field2812++;
                                if (var3.field2812 >= var8.field970.length) {
                                    var3.field2812 -= var8.field974;
                                    if (var3.field2812 < 0 || var3.field2812 >= var8.field970.length) {
                                        var3.field2812 = 0;
                                    }
                                }
                                method678(var3);
                            }
                        }
                    }
                    if (var3.field2860 != 0 && !var3.field2798) {
                        int var9 = var3.field2860 >> 16;
                        int var10 = var3.field2860 << 16 >> 16;
                        int var11 = field298 * var9;
                        int var12 = field298 * var10;
                        var3.field2850 = var3.field2850 + var11 & 0x7FF;
                        var3.field2851 = var3.field2851 + var12 & 0x7FF;
                        method678(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.db(II)V")
    public static final void method536(int arg0) {
        Statics.method2698();
        Statics.method1257();
        int var1 = Statics.method2656(arg0).field1200;
        if (var1 == 0) {
            return;
        }
        int var2 = class180.field2952[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class95.method1990(0.9D);
                ((class99) Statics.field1626).method2069(0.9D);
            }
            if (var2 == 2) {
                class95.method1990(0.8D);
                ((class99) Statics.field1626).method2069(0.8D);
            }
            if (var2 == 3) {
                class95.method1990(0.7D);
                ((class99) Statics.field1626).method2069(0.7D);
            }
            if (var2 == 4) {
                class95.method1990(0.6D);
                ((class99) Statics.field1626).method2069(0.6D);
            }
            class56.method2703();
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
            if (field425 != var3) {
                if (field425 == 0 && field507 != -1) {
                    class187.method986(Statics.field1025, field507, 0, var3, false);
                    field508 = false;
                } else if (var3 == 0) {
                    Statics.field3008.method3397();
                    class187.field3003 = 1;
                    Statics.field201 = null;
                    field508 = false;
                } else {
                    class187.method3258(var3);
                }
                field425 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field509 = 127;
            }
            if (var2 == 1) {
                field509 = 96;
            }
            if (var2 == 2) {
                field509 = 64;
            }
            if (var2 == 3) {
                field509 = 32;
            }
            if (var2 == 4) {
                field509 = 0;
            }
        }
        if (var1 == 5) {
            field408 = var2;
        }
        if (var1 == 6) {
            field431 = var2;
        }
        if (var1 == 9) {
            field459 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field304 = 127;
            }
            if (var2 == 1) {
                field304 = 96;
            }
            if (var2 == 2) {
                field304 = 64;
            }
            if (var2 == 3) {
                field304 = 32;
            }
            if (var2 == 4) {
                field304 = 0;
            }
        }
        if (var1 == 17) {
            field437 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field293 = (class22) class113.method1576(class22.method2974(), var2);
            if (field293 == null) {
                field293 = class22.field563;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field400 = -1;
            } else {
                field400 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field294 = (class22) class113.method1576(class22.method2974(), var2);
            if (field294 == null) {
                field294 = class22.field563;
            }
        }
    }

    @ObfuscatedName("da.do(I)V")
    public static final void method2282() {
        field301.method2630(248);
        for (class4 var0 = (class4) field430.method3560(); var0 != null; var0 = (class4) field430.method3565()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                Statics.method166(var0, true);
            }
        }
        if (field433 != null) {
            method678(field433);
            field433 = null;
        }
    }

    @ObfuscatedName("ff.dt(IIII)Ly;")
    public static final class4 method3158(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field59 = arg1;
        var3.field55 = arg2;
        field430.method3556(var3, (long) arg0);
        method841(arg1);
        class177 var4 = class177.method1982(arg0);
        method678(var4);
        if (field433 != null) {
            method678(field433);
            field433 = null;
        }
        method3();
        method98(Statics.field2909[arg0 >> 16], var4, false);
        class39.method2682(arg1);
        if (field513 != -1) {
            method677(field513, 1);
        }
        return var3;
    }

    @ObfuscatedName("x.ds(Lfw;B)Z")
    public static final boolean method548(class177 arg0) {
        int var1 = arg0.field2924;
        if (var1 == 205) {
            field549 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field542.method3301(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field542.method3287(var4, var5 == 1);
        }
        if (var1 == 324) {
            field542.method3288(false);
        }
        if (var1 == 325) {
            field542.method3288(true);
        }
        if (var1 == 326) {
            field301.method2630(111);
            field542.method3289(field301);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eh.dw(IIIILca;Lfp;I)V")
    public static final void method2796(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2066(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field393 + field355 & 0x7FF;
        int var8 = class95.field1632[var7];
        int var9 = class95.field1622[var7];
        int var10 = var8 * 256 / (field343 + 256);
        int var11 = var9 * 256 / (field343 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2717.method1644(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("cn.dk(IIIILca;Lfp;I)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field393 + field355 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1632[var6];
        int var9 = class95.field1622[var6];
        int var10 = var8 * 256 / (field343 + 256);
        int var11 = var9 * 256 / (field343 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1642(arg5.field2944 / 2 + var12 - arg4.field1440 / 2, arg5.field2945 / 2 - var13 - arg4.field1446 / 2, arg0, arg1, arg5.field2944, arg5.field2945, arg5.field2949, arg5.field2946);
        } else {
            arg4.method1632(arg5.field2944 / 2 + arg0 + var12 - arg4.field1440 / 2, arg5.field2945 / 2 + arg1 - var13 - arg4.field1446 / 2);
        }
    }

    @ObfuscatedName("c.dx(Ljava/lang/String;ZI)Z")
    public static boolean method219(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method175(arg0, Statics.field519);
        for (int var3 = 0; var3 < field536; var3++) {
            if (var2.equalsIgnoreCase(class168.method175(field464[var3].field228, Statics.field519)) && (!arg1 || field464[var3].field226 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method175(Statics.field1663.field30, Statics.field519))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.da(Ljava/lang/String;I)Z")
    public static boolean method752(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method175(arg0, Statics.field519);
        for (int var2 = 0; var2 < field378; var2++) {
            class8 var3 = field541[var2];
            if (var1.equalsIgnoreCase(class168.method175(var3.field121, Statics.field519))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method175(var3.field117, Statics.field519))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ex.dv(Ljava/lang/String;I)V")
    public static final void method2805(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field536 < 200 || field388 == 1) || field536 >= 400) {
            class12.method37(30, "", class161.field2520);
            return;
        }
        String var1 = class168.method175(arg0, Statics.field519);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field536; var2++) {
            class18 var3 = field464[var2];
            String var4 = class168.method175(var3.field228, Statics.field519);
            if (var4 != null && var4.equals(var1)) {
                class12.method37(30, "", arg0 + class161.field2430);
                return;
            }
            if (var3.field225 != null) {
                String var5 = class168.method175(var3.field225, Statics.field519);
                if (var5 != null && var5.equals(var1)) {
                    class12.method37(30, "", arg0 + class161.field2430);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field378; var6++) {
            class8 var7 = field541[var6];
            String var8 = class168.method175(var7.field121, Statics.field519);
            if (var8 != null && var8.equals(var1)) {
                class12.method37(30, "", class161.field2526 + arg0 + class161.field2371);
                return;
            }
            if (var7.field117 != null) {
                String var9 = class168.method175(var7.field117, Statics.field519);
                if (var9 != null && var9.equals(var1)) {
                    class12.method37(30, "", class161.field2526 + arg0 + class161.field2371);
                    return;
                }
            }
        }
        if (class168.method175(Statics.field1663.field30, Statics.field519).equals(var1)) {
            class12.method37(30, "", class161.field2524);
        } else {
            field301.method2630(48);
            field301.method2349(class123.method2281(arg0));
            field301.method2354(arg0);
        }
    }

    @ObfuscatedName("bm.dn(Ljava/lang/String;I)V")
    public static final void method1249(String arg0) {
        if (Statics.field1817 != null) {
            field301.method2630(24);
            field301.method2349(class123.method2281(arg0));
            field301.method2354(arg0);
        }
    }

    @ObfuscatedName("fz.du(Ljava/lang/String;B)V")
    public static final void method3037(String arg0) {
        if (!arg0.equals("")) {
            field301.method2630(150);
            field301.method2349(class123.method2281(arg0));
            field301.method2354(arg0);
        }
    }

    @ObfuscatedName("du.dd(IB)V")
    public static void method2299(int arg0) {
        for (class205 var1 = (class205) field471.method3560(); var1 != null; var1 = (class205) field471.method3565()) {
            if ((long) arg0 == (var1.field3167 >> 48 & 0xFFFFL)) {
                var1.method3699();
            }
        }
    }

    @ObfuscatedName("w.dz(Lfw;I)I")
    public static int method137(class177 arg0) {
        class205 var1 = (class205) field471.method3555(((long) arg0.field2799 << 32) + (long) arg0.field2800);
        return var1 == null ? arg0.field2855 : var1.field3152;
    }

    @ObfuscatedName("ab.dl(Lfw;I)Lfw;")
    public static class177 method723(class177 arg0) {
        int var1 = method137(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class177.method1982(arg0.field2829);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("n.dq(Lfw;I)Z")
    public static boolean method161(class177 arg0) {
        if (field439) {
            if (method137(arg0) != 0) {
                return false;
            }
            if (arg0.field2801 == 0) {
                return false;
            }
        }
        return arg0.field2819;
    }

    @ObfuscatedName("m.dm(Lfw;I)Ljava/lang/String;")
    public static String method100(class177 arg0) {
        int var1 = method137(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2878 == null || arg0.field2878.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2878;
        }
    }

    @ObfuscatedName("ay.dy(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method896(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field268 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field268 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field268 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field268 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field268 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field274 != null) {
            var3 = "/p=" + Statics.field274;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field347 + "/a=" + Statics.field1396 + var3 + "/";
    }

    @ObfuscatedName("cg.dh(Ljava/lang/String;ZI)V")
    public static void method1610(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2127; var5++) {
            class56 var6 = class56.method3201(var5);
            if ((!arg1 || var6.field1189) && var6.field1182 == -1 && var6.field1151.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field20 = -1;
                    Statics.field198 = null;
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
        Statics.field198 = var3;
        Statics.field204 = 0;
        Statics.field20 = var4;
        String[] var9 = new String[Statics.field20];
        for (int var10 = 0; var10 < Statics.field20; var10++) {
            var9[var10] = class56.method3201(var3[var10]).field1151;
        }
        short[] var11 = Statics.field198;
        class128.method160(var9, var11, 0, var9.length - 1);
    }
}

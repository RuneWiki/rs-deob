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
import java.net.Socket;
import java.util.Iterator;

public final class client extends class148 {

    @ObfuscatedName("client.n")
    public static boolean field281 = true;

    @ObfuscatedName("client.t")
    public static int field492 = 1;

    @ObfuscatedName("client.v")
    public static int field356 = 0;

    @ObfuscatedName("client.m")
    public static int field344 = 0;

    @ObfuscatedName("client.w")
    public static class112[] field343 = new class112[4];

    @ObfuscatedName("client.l")
    public static boolean field286 = false;

    @ObfuscatedName("client.h")
    public static boolean field287 = false;

    @ObfuscatedName("client.i")
    public static int field288 = 0;

    @ObfuscatedName("client.q")
    public static int field289 = 0;

    @ObfuscatedName("client.r")
    public static boolean field528 = true;

    @ObfuscatedName("client.a")
    public static int field291 = 0;

    @ObfuscatedName("client.z")
    public static long field292 = -1L;

    @ObfuscatedName("client.s")
    public static int field293 = -1;

    @ObfuscatedName("client.g")
    public static int field294 = -1;

    @ObfuscatedName("client.aj")
    public static int field284 = -1;

    @ObfuscatedName("client.ay")
    public static boolean field410 = true;

    @ObfuscatedName("client.ah")
    public static boolean field297 = false;

    @ObfuscatedName("client.ax")
    public static int field458 = 0;

    @ObfuscatedName("client.ar")
    public static int field299 = 0;

    @ObfuscatedName("client.ae")
    public static int field279 = 0;

    @ObfuscatedName("client.ac")
    public static int field534 = 0;

    @ObfuscatedName("client.aw")
    public static int field354 = 0;

    @ObfuscatedName("client.am")
    public static int field358 = 0;

    @ObfuscatedName("client.aq")
    public static int field304 = 0;

    @ObfuscatedName("client.at")
    public static int field305 = 0;

    @ObfuscatedName("client.aa")
    public static int field280 = 0;

    @ObfuscatedName("client.ai")
    public static class22 field511 = class22.field579;

    @ObfuscatedName("client.ap")
    public static class22 field321 = class22.field579;

    @ObfuscatedName("client.ag")
    public static int field303 = 0;

    @ObfuscatedName("client.af")
    public static int field310 = 0;

    @ObfuscatedName("client.al")
    public static int field311 = 0;

    @ObfuscatedName("client.bu")
    public static int field316 = 0;

    @ObfuscatedName("client.bp")
    public static int field557 = 0;

    @ObfuscatedName("client.bd")
    public static int field318 = 0;

    @ObfuscatedName("client.bx")
    public static int field319 = 0;

    @ObfuscatedName("client.by")
    public static int field430 = 0;

    @ObfuscatedName("client.cz")
    public static class37[] field283 = new class37[32768];

    @ObfuscatedName("client.cd")
    public static int field322 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field406 = new int[32768];

    @ObfuscatedName("client.ci")
    public static int field324 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field457 = new int[250];

    @ObfuscatedName("client.cj")
    public static class126 field398 = new class126(5000);

    @ObfuscatedName("client.cx")
    public static class126 field426 = new class126(5000);

    @ObfuscatedName("client.ct")
    public static class126 field328 = new class126(15000);

    @ObfuscatedName("client.ch")
    public static int field329 = 0;

    @ObfuscatedName("client.ck")
    public static int field530 = 0;

    @ObfuscatedName("client.cq")
    public static int field331 = 0;

    @ObfuscatedName("client.ce")
    public static int field553 = 0;

    @ObfuscatedName("client.cs")
    public static int field327 = 0;

    @ObfuscatedName("client.cy")
    public static int field334 = 0;

    @ObfuscatedName("client.cm")
    public static int field290 = 0;

    @ObfuscatedName("client.cu")
    public static int field336 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field337 = false;

    @ObfuscatedName("client.dg")
    public static int field338 = 0;

    @ObfuscatedName("client.dc")
    public static int field339 = 1;

    @ObfuscatedName("client.dd")
    public static int field340 = 0;

    @ObfuscatedName("client.do")
    public static int field341 = 1;

    @ObfuscatedName("client.dn")
    public static int field562 = 0;

    @ObfuscatedName("client.dz")
    public static boolean field474 = false;

    @ObfuscatedName("client.dj")
    public static int[][][] field300 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field346 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dl")
    public static int field347 = 0;

    @ObfuscatedName("client.dm")
    public static int field348 = 2;

    @ObfuscatedName("client.dk")
    public static int field349 = 0;

    @ObfuscatedName("client.ds")
    public static int field350 = 2;

    @ObfuscatedName("client.df")
    public static int field351 = 0;

    @ObfuscatedName("client.eb")
    public static int field352 = 1;

    @ObfuscatedName("client.ew")
    public static int field490 = 0;

    @ObfuscatedName("client.eu")
    public static int field309 = 0;

    @ObfuscatedName("client.ef")
    public static int field355 = 2;

    @ObfuscatedName("client.eq")
    public static int field499 = 0;

    @ObfuscatedName("client.ec")
    public static int field357 = 1;

    @ObfuscatedName("client.ee")
    public static int field482 = 0;

    @ObfuscatedName("client.es")
    public static int field359 = 0;

    @ObfuscatedName("client.ed")
    public static int field360 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field361 = 5063219;

    @ObfuscatedName("client.em")
    public static int field362 = 3353893;

    @ObfuscatedName("client.ek")
    public static int field363 = 7759444;

    @ObfuscatedName("client.ej")
    public static boolean field330 = false;

    @ObfuscatedName("client.er")
    public static int field365 = 0;

    @ObfuscatedName("client.ff")
    public static int field366 = 128;

    @ObfuscatedName("client.fk")
    public static int field367 = 0;

    @ObfuscatedName("client.fz")
    public static int field368 = 0;

    @ObfuscatedName("client.fp")
    public static int field477 = 0;

    @ObfuscatedName("client.fq")
    public static int field323 = 0;

    @ObfuscatedName("client.fw")
    public static int field307 = 0;

    @ObfuscatedName("client.ft")
    public static int field372 = 50;

    @ObfuscatedName("client.fj")
    public static int field373 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field374 = false;

    @ObfuscatedName("client.fs")
    public static int field375 = 0;

    @ObfuscatedName("client.fg")
    public static int field383 = 0;

    @ObfuscatedName("client.fv")
    public static int field377 = 50;

    @ObfuscatedName("client.fy")
    public static int[] field378 = new int[field377];

    @ObfuscatedName("client.fe")
    public static int[] field379 = new int[field377];

    @ObfuscatedName("client.fn")
    public static int[] field554 = new int[field377];

    @ObfuscatedName("client.fr")
    public static int[] field381 = new int[field377];

    @ObfuscatedName("client.fa")
    public static int[] field519 = new int[field377];

    @ObfuscatedName("client.fh")
    public static int[] field285 = new int[field377];

    @ObfuscatedName("client.fd")
    public static int[] field384 = new int[field377];

    @ObfuscatedName("client.gy")
    public static String[] field385 = new String[field377];

    @ObfuscatedName("client.gx")
    public static int[][] field386 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field387 = 0;

    @ObfuscatedName("client.gu")
    public static int field388 = -1;

    @ObfuscatedName("client.gn")
    public static int field389 = -1;

    @ObfuscatedName("client.gp")
    public static int field390 = 0;

    @ObfuscatedName("client.gg")
    public static int field391 = 0;

    @ObfuscatedName("client.go")
    public static int field392 = 0;

    @ObfuscatedName("client.gs")
    public static int field393 = 0;

    @ObfuscatedName("client.gq")
    public static int field552 = 0;

    @ObfuscatedName("client.gl")
    public static int field395 = 0;

    @ObfuscatedName("client.gv")
    public static int field396 = 0;

    @ObfuscatedName("client.gk")
    public static int field394 = 0;

    @ObfuscatedName("client.gc")
    public static int field418 = 0;

    @ObfuscatedName("client.ga")
    public static int field399 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field400 = false;

    @ObfuscatedName("client.gr")
    public static int field403 = 0;

    @ObfuscatedName("client.gd")
    public static int field402 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field332 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field376 = -1;

    @ObfuscatedName("client.gi")
    public static int field405 = 0;

    @ObfuscatedName("client.hu")
    public static int field497 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field407 = new int[1000];

    @ObfuscatedName("client.hx")
    public static final int[] field408 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hg")
    public static String[] field409 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field369 = new boolean[8];

    @ObfuscatedName("client.hb")
    public static int[] field353 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static int field472 = -1;

    @ObfuscatedName("client.hn")
    public static class203[][][] field413 = new class203[4][104][104];

    @ObfuscatedName("client.hd")
    public static class203 field414 = new class203();

    @ObfuscatedName("client.ht")
    public static class203 field415 = new class203();

    @ObfuscatedName("client.hf")
    public static class203 field416 = new class203();

    @ObfuscatedName("client.hw")
    public static int[] field417 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field547 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field419 = new int[25];

    @ObfuscatedName("client.hv")
    public static int field420 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field421 = false;

    @ObfuscatedName("client.hp")
    public static int field422 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field564 = new int[500];

    @ObfuscatedName("client.hy")
    public static int[] field424 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field425 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field479 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field427 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field428 = new String[500];

    @ObfuscatedName("client.iy")
    public static int field429 = -1;

    @ObfuscatedName("client.il")
    public static int field501 = -1;

    @ObfuscatedName("client.ih")
    public static int field459 = 0;

    @ObfuscatedName("client.io")
    public static int field404 = 50;

    @ObfuscatedName("client.ip")
    public static int field433 = 0;

    @ObfuscatedName("client.ir")
    public static String field434 = null;

    @ObfuscatedName("client.ig")
    public static boolean field435 = false;

    @ObfuscatedName("client.if")
    public static int field345 = -1;

    @ObfuscatedName("client.in")
    public static int field485 = -1;

    @ObfuscatedName("client.im")
    public static String field493 = null;

    @ObfuscatedName("client.ib")
    public static String field439 = null;

    @ObfuscatedName("client.iv")
    public static int field302 = -1;

    @ObfuscatedName("client.ij")
    public static class200 field441 = new class200(8);

    @ObfuscatedName("client.it")
    public static int field442 = 0;

    @ObfuscatedName("client.jt")
    public static int field550 = 0;

    @ObfuscatedName("client.jj")
    public static class177 field444 = null;

    @ObfuscatedName("client.jk")
    public static int field382 = 0;

    @ObfuscatedName("client.jx")
    public static int field446 = 0;

    @ObfuscatedName("client.jh")
    public static int field447 = 0;

    @ObfuscatedName("client.jw")
    public static int field448 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field449 = false;

    @ObfuscatedName("client.je")
    public static boolean field450 = false;

    @ObfuscatedName("client.jm")
    public static boolean field451 = false;

    @ObfuscatedName("client.jp")
    public static class177 field452 = null;

    @ObfuscatedName("client.jl")
    public static class177 field453 = null;

    @ObfuscatedName("client.jn")
    public static class177 field454 = null;

    @ObfuscatedName("client.jq")
    public static int field522 = 0;

    @ObfuscatedName("client.jf")
    public static int field456 = 0;

    @ObfuscatedName("client.ju")
    public static class177 field371 = null;

    @ObfuscatedName("client.jr")
    public static boolean field397 = false;

    @ObfuscatedName("client.jz")
    public static int field401 = -1;

    @ObfuscatedName("client.jg")
    public static int field460 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field509 = false;

    @ObfuscatedName("client.jc")
    public static int field462 = -1;

    @ObfuscatedName("client.jv")
    public static int field463 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field464 = false;

    @ObfuscatedName("client.ku")
    public static int field296 = 1;

    @ObfuscatedName("client.kx")
    public static int[] field466 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field436 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field551 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field469 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field470 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field445 = 0;

    @ObfuscatedName("client.kl")
    public static int field326 = 0;

    @ObfuscatedName("client.kp")
    public static int field473 = 0;

    @ObfuscatedName("client.kk")
    public static int field282 = 0;

    @ObfuscatedName("client.kn")
    public static int field475 = 0;

    @ObfuscatedName("client.ky")
    public static int field476 = 0;

    @ObfuscatedName("client.kt")
    public static int field481 = 0;

    @ObfuscatedName("client.ka")
    public static int field478 = 0;

    @ObfuscatedName("client.kg")
    public static class203 field380 = new class203();

    @ObfuscatedName("client.km")
    public static class203 field480 = new class203();

    @ObfuscatedName("client.ki")
    public static class203 field335 = new class203();

    @ObfuscatedName("client.kf")
    public static class200 field438 = new class200(512);

    @ObfuscatedName("client.kq")
    public static int field483 = 0;

    @ObfuscatedName("client.kr")
    public static int field484 = -2;

    @ObfuscatedName("client.ko")
    public static boolean[] field527 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field486 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field487 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static int[] field488 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field342 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field491 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field308 = 0;

    @ObfuscatedName("client.lv")
    public static long field455 = 0L;

    @ObfuscatedName("client.lo")
    public static boolean field494 = true;

    @ObfuscatedName("client.lc")
    public static int field437 = 765;

    @ObfuscatedName("client.lx")
    public static int field496 = 1;

    @ObfuscatedName("client.lf")
    public static int[] field301 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.la")
    public static int field498 = 0;

    @ObfuscatedName("client.ll")
    public static int field325 = 0;

    @ObfuscatedName("client.lz")
    public static String field500 = "";

    @ObfuscatedName("client.lj")
    public static long[] field545 = new long[100];

    @ObfuscatedName("client.lg")
    public static int field502 = 0;

    @ObfuscatedName("client.le")
    public static int field503 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field504 = new int[128];

    @ObfuscatedName("client.mn")
    public static int[] field505 = new int[128];

    @ObfuscatedName("client.mp")
    public static long field506 = -1L;

    @ObfuscatedName("client.md")
    public static String field507 = null;

    @ObfuscatedName("client.mc")
    public static String field508 = null;

    @ObfuscatedName("client.mh")
    public static int field431 = -1;

    @ObfuscatedName("client.mm")
    public static int field510 = 0;

    @ObfuscatedName("client.me")
    public static int[] field535 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field512 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class82[] field513 = new class82[1000];

    @ObfuscatedName("client.my")
    public static int field432 = 0;

    @ObfuscatedName("client.ma")
    public static int field515 = 0;

    @ObfuscatedName("client.mt")
    public static int field370 = 0;

    @ObfuscatedName("client.mi")
    public static int field517 = 255;

    @ObfuscatedName("client.mk")
    public static int field518 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field471 = false;

    @ObfuscatedName("client.nr")
    public static int field520 = 127;

    @ObfuscatedName("client.nl")
    public static int field521 = 127;

    @ObfuscatedName("client.nn")
    public static int field364 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field523 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field525 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field526 = new int[50];

    @ObfuscatedName("client.na")
    public static class62[] field314 = new class62[50];

    @ObfuscatedName("client.nz")
    public static boolean field563 = false;

    @ObfuscatedName("client.nh")
    public static boolean[] field440 = new boolean[5];

    @ObfuscatedName("client.oo")
    public static int[] field468 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field531 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field423 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field533 = new int[5];

    @ObfuscatedName("client.og")
    public static short field411 = 256;

    @ObfuscatedName("client.oc")
    public static short field543 = 205;

    @ObfuscatedName("client.or")
    public static short field514 = 256;

    @ObfuscatedName("client.of")
    public static short field537 = 320;

    @ObfuscatedName("client.ok")
    public static short field538 = 1;

    @ObfuscatedName("client.od")
    public static short field539 = 32767;

    @ObfuscatedName("client.on")
    public static short field540 = 1;

    @ObfuscatedName("client.oh")
    public static short field541 = 32767;

    @ObfuscatedName("client.ol")
    public static int field542 = 0;

    @ObfuscatedName("client.oq")
    public static int field548 = 0;

    @ObfuscatedName("client.oz")
    public static int field544 = 0;

    @ObfuscatedName("client.ov")
    public static int field412 = 0;

    @ObfuscatedName("client.ow")
    public static int field546 = 0;

    @ObfuscatedName("client.oj")
    public static int field298 = 0;

    @ObfuscatedName("client.om")
    public static int field495 = 0;

    @ObfuscatedName("client.op")
    public static class18[] field549 = new class18[400];

    @ObfuscatedName("client.ou")
    public static class199 field317 = new class199();

    @ObfuscatedName("client.ox")
    public static int field295 = 0;

    @ObfuscatedName("client.ot")
    public static class8[] field333 = new class8[400];

    @ObfuscatedName("client.ob")
    public static class183 field306 = new class183();

    @ObfuscatedName("client.ph")
    public static int field465 = -1;

    @ObfuscatedName("client.pc")
    public static int field555 = -1;

    @ObfuscatedName("client.pz")
    public static class224[] field556 = new class224[8];

    @ObfuscatedName("client.pn")
    public static long field558 = -1L;

    @ObfuscatedName("client.pb")
    public static long field536 = -1L;

    @ObfuscatedName("client.pg")
    public static final class11 field560 = new class11();

    @ObfuscatedName("client.pj")
    public static int[] field561 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field516 = new int[50];

    @ObfuscatedName("client.t(I)V")
    public final void method479() {
    }

    public final void init() {
        if (!this.method2883()) {
            return;
        }
        class194[] var1 = new class194[] { class194.field3116, class194.field3113, class194.field3108, class194.field3117, class194.field3107, class194.field3115, class194.field3111, class194.field3118, class194.field3114, class194.field3104, class194.field3110, class194.field3109, class194.field3105, class194.field3112, class194.field3106 };
        class194[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class194 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3119);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3119)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field26)) {
                            field286 = true;
                        } else {
                            field286 = false;
                        }
                        break;
                    case 2:
                        int var6 = Integer.parseInt(var5);
                        class157[] var7 = class157.method2756();
                        int var8 = 0;
                        class157 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class157 var9 = var7[var8];
                            if (var9.field2324 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field529 = var10;
                        break;
                    case 3:
                        Statics.field220 = var5;
                        break;
                    case 4:
                        field356 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field26)) {
                        }
                    case 6:
                    case 8:
                    default:
                        break;
                    case 7:
                        class158[] var11 = new class158[] { class158.field2330, class158.field2332, class158.field2328, class158.field2327, class158.field2331, class158.field2329 };
                        Statics.field2677 = (class158) class113.method3065(var11, Integer.parseInt(var5));
                        if (Statics.field2677 == class158.field2332) {
                            Statics.field2189 = class216.field3181;
                        } else {
                            Statics.field2189 = class216.field3182;
                        }
                        break;
                    case 9:
                        Statics.field789 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field288 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field344 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field492 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field197 = var5;
                        break;
                    case 14:
                        Statics.field1402 = Integer.parseInt(var5);
                }
            }
        }
        method1072();
        Statics.field648 = this.getCodeBase().getHost();
        String var12 = Statics.field529.field2325;
        byte var13 = 0;
        try {
            class153.method2112("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class152.method2194((String) null, var15);
        }
        Statics.field443 = this;
        this.method2881(765, 503, 124);
    }

    @ObfuscatedName("bs.b(I)V")
    public static final void method1072() {
        class90.field1538 = false;
        field287 = false;
    }

    @ObfuscatedName("client.m(B)V")
    public final void method230() {
        Statics.field674 = field344 == 0 ? 43594 : field492 + 40000;
        Statics.field782 = field344 == 0 ? 443 : field492 + 50000;
        Statics.field2014 = Statics.field674;
        Statics.field2702 = class178.field2926;
        Statics.field2121 = class178.field2929;
        Statics.field1825 = class178.field2927;
        Statics.field2961 = class178.field2928;
        if (Statics.field2147.toLowerCase().indexOf("microsoft") == -1) {
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
        Canvas var1 = Statics.field1722;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class141.field2178);
        var1.addFocusListener(class141.field2178);
        Canvas var2 = Statics.field1722;
        var2.addMouseListener(class144.field2205);
        var2.addMouseMotionListener(class144.field2205);
        var2.addFocusListener(class144.field2205);
        Statics.field1966 = class135.method769();
        if (Statics.field1966 != null) {
            Statics.field1966.method2706(Statics.field1722);
        }
        Statics.field1229 = new class138(255, class153.field2282, class153.field2284, 500000);
        class231 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class153.method767("", Statics.field2677.field2333, false);
            byte[] var5 = new byte[(int) var3.method3957()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3944(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class123(var5));
        } catch (Exception var15) {
        }
        try {
            if (var3 != null) {
                var3.method3942();
            }
        } catch (Exception var14) {
        }
        Statics.field233 = var4;
        Statics.field145 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field5;
        class142.field2183 = this;
        class142.field2181 = var12;
        if (field344 != 0) {
            field297 = true;
        }
        int var13 = Statics.field233.field137;
        field455 = 0L;
        if (var13 >= 2) {
            field494 = true;
        } else {
            field494 = false;
        }
        method989();
        if (field289 >= 25) {
            method153();
        }
        field2251 = true;
    }

    @ObfuscatedName("client.k(B)V")
    public final void method303() {
        field291++;
        this.method521();
        while (true) {
            class203 var1 = class174.field2745;
            class173 var2;
            synchronized (class174.field2745) {
                var2 = (class173) class174.field2743.method3660();
            }
            if (var2 == null) {
                try {
                    if (class187.field3006 == 1) {
                        int var4 = Statics.field671.method3542();
                        if (var4 > 0 && Statics.field671.method3458()) {
                            int var5 = var4 - Statics.field3003;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field671.method3481(var5);
                        } else {
                            Statics.field671.method3457();
                            Statics.field671.method3498();
                            if (Statics.field2997 == null) {
                                class187.field3006 = 0;
                            } else {
                                class187.field3006 = 2;
                            }
                            Statics.field3002 = null;
                            Statics.field3001 = null;
                        }
                    }
                } catch (Exception var264) {
                    var264.printStackTrace();
                    Statics.field671.method3457();
                    class187.field3006 = 0;
                    Statics.field3002 = null;
                    Statics.field3001 = null;
                    Statics.field2997 = null;
                }
                method992();
                class141 var7 = class141.field2178;
                synchronized (class141.field2178) {
                    class141.field2177++;
                    class141.field2174 = class141.field2176;
                    class141.field2173 = 0;
                    if (class141.field2169 >= 0) {
                        while (class141.field2169 != class141.field2168) {
                            int var9 = class141.field2159[class141.field2168];
                            class141.field2168 = class141.field2168 + 1 & 0x7F;
                            if (var9 < 0) {
                                class141.field2154[~var9] = false;
                            } else {
                                if (!class141.field2154[var9] && class141.field2173 < class141.field2172.length - 1) {
                                    class141.field2172[++class141.field2173 - 1] = var9;
                                }
                                class141.field2154[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class141.field2154[var8] = false;
                        }
                        class141.field2169 = class141.field2168;
                    }
                    class141.field2176 = class141.field2175;
                }
                class144 var11 = class144.field2205;
                synchronized (class144.field2205) {
                    class144.field2206 = class144.field2195;
                    class144.field2193 = class144.field2209;
                    class144.field2200 = class144.field2197;
                    class144.field2199 = class144.field2201;
                    class144.field2198 = class144.field2202;
                    class144.field2208 = class144.field2203;
                    class144.field2196 = class144.field2204;
                    class144.field2201 = 0;
                }
                if (Statics.field1966 != null) {
                    int var13 = Statics.field1966.method2708();
                    field478 = var13;
                }
                if (field289 == 0) {
                    Statics.method554();
                    Statics.field1149.method2738();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2247[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field2248[var15] = 0L;
                    }
                    Statics.field1808 = 0;
                } else if (field289 == 5) {
                    class34.method2333(this);
                    Statics.method554();
                    Statics.field1149.method2738();
                    for (int var16 = 0; var16 < 32; var16++) {
                        field2247[var16] = 0L;
                    }
                    for (int var17 = 0; var17 < 32; var17++) {
                        field2248[var17] = 0L;
                    }
                    Statics.field1808 = 0;
                } else if (field289 == 10 || field289 == 11) {
                    class34.method2333(this);
                } else if (field289 == 20) {
                    class34.method2333(this);
                    method2999();
                } else if (field289 == 25) {
                    method108(false);
                    field338 = 0;
                    boolean var18 = true;
                    for (int var19 = 0; var19 < Statics.field149.length; var19++) {
                        if (Statics.field3223[var19] != -1 && Statics.field149[var19] == null) {
                            Statics.field149[var19] = Statics.field1268.method3107(Statics.field3223[var19], 0);
                            if (Statics.field149[var19] == null) {
                                var18 = false;
                                field338++;
                            }
                        }
                        if (Statics.field1827[var19] != -1 && Statics.field799[var19] == null) {
                            Statics.field799[var19] = Statics.field1268.method3121(Statics.field1827[var19], 0, Statics.field2207[var19]);
                            if (Statics.field799[var19] == null) {
                                var18 = false;
                                field338++;
                            }
                        }
                    }
                    if (var18) {
                        field340 = 0;
                        boolean var20 = true;
                        for (int var21 = 0; var21 < Statics.field149.length; var21++) {
                            byte[] var22 = Statics.field799[var21];
                            if (var22 != null) {
                                int var23 = (Statics.field1687[var21] >> 8) * 64 - Statics.field713;
                                int var24 = (Statics.field1687[var21] & 0xFF) * 64 - Statics.field138;
                                if (field474) {
                                    var23 = 10;
                                    var24 = 10;
                                }
                                boolean var26 = true;
                                class123 var27 = new class123(var22);
                                int var28 = -1;
                                label1254: while (true) {
                                    int var29 = var27.method2412();
                                    if (var29 == 0) {
                                        var20 &= var26;
                                        break;
                                    }
                                    var28 += var29;
                                    int var30 = 0;
                                    boolean var31 = false;
                                    while (true) {
                                        while (!var31) {
                                            int var33 = var27.method2412();
                                            if (var33 == 0) {
                                                continue label1254;
                                            }
                                            var30 += var33 - 1;
                                            int var34 = var30 & 0x3F;
                                            int var35 = var30 >> 6 & 0x3F;
                                            int var36 = var27.method2522() >> 2;
                                            int var37 = var23 + var35;
                                            int var38 = var24 + var34;
                                            if (var37 > 0 && var38 > 0 && var37 < 103 && var38 < 103) {
                                                class43 var39 = class43.method106(var28);
                                                if (var36 != 22 || !field287 || var39.field959 != 0 || var39.field939 == 1 || var39.field932) {
                                                    if (!var39.method812()) {
                                                        field340++;
                                                        var26 = false;
                                                    }
                                                    var31 = true;
                                                }
                                            }
                                        }
                                        int var32 = var27.method2412();
                                        if (var32 == 0) {
                                            break;
                                        }
                                        var27.method2522();
                                    }
                                }
                            }
                        }
                        if (var20) {
                            if (field562 != 0) {
                                method140(class161.field2369 + class2.field19 + class2.field22 + 100 + "%" + class2.field25, true);
                            }
                            method992();
                            method1655();
                            method992();
                            Statics.field152.method1856();
                            method992();
                            System.gc();
                            for (int var41 = 0; var41 < 4; var41++) {
                                field343[var41].method2300();
                            }
                            for (int var42 = 0; var42 < 4; var42++) {
                                for (int var43 = 0; var43 < 104; var43++) {
                                    for (int var44 = 0; var44 < 104; var44++) {
                                        class6.field83[var42][var43][var44] = 0;
                                    }
                                }
                            }
                            method992();
                            class6.method2337();
                            int var45 = Statics.field149.length;
                            class25.method569();
                            method108(true);
                            if (!field474) {
                                int var46 = 0;
                                label1192: while (true) {
                                    if (var46 >= var45) {
                                        for (int var60 = 0; var60 < var45; var60++) {
                                            int var61 = (Statics.field1687[var60] >> 8) * 64 - Statics.field713;
                                            int var62 = (Statics.field1687[var60] & 0xFF) * 64 - Statics.field138;
                                            byte[] var63 = Statics.field149[var60];
                                            if (var63 == null && Statics.field73 < 800) {
                                                method992();
                                                class6.method583(var61, var62, 64, 64);
                                            }
                                        }
                                        method108(true);
                                        int var64 = 0;
                                        while (true) {
                                            if (var64 >= var45) {
                                                break label1192;
                                            }
                                            byte[] var65 = Statics.field799[var64];
                                            if (var65 != null) {
                                                int var66 = (Statics.field1687[var64] >> 8) * 64 - Statics.field713;
                                                int var67 = (Statics.field1687[var64] & 0xFF) * 64 - Statics.field138;
                                                method992();
                                                Statics.method1645(var65, var66, var67, Statics.field152, field343);
                                            }
                                            var64++;
                                        }
                                    }
                                    int var47 = (Statics.field1687[var46] >> 8) * 64 - Statics.field713;
                                    int var48 = (Statics.field1687[var46] & 0xFF) * 64 - Statics.field138;
                                    byte[] var49 = Statics.field149[var46];
                                    if (var49 != null) {
                                        method992();
                                        int var50 = Statics.field1738 * 8 - 48;
                                        int var51 = Statics.field73 * 8 - 48;
                                        class112[] var52 = field343;
                                        int var53 = 0;
                                        label1189: while (true) {
                                            if (var53 >= 4) {
                                                class123 var56 = new class123(var49);
                                                int var57 = 0;
                                                while (true) {
                                                    if (var57 >= 4) {
                                                        break label1189;
                                                    }
                                                    for (int var58 = 0; var58 < 64; var58++) {
                                                        for (int var59 = 0; var59 < 64; var59++) {
                                                            class6.method2856(var56, var57, var47 + var58, var48 + var59, var50, var51, 0);
                                                        }
                                                    }
                                                    var57++;
                                                }
                                            }
                                            for (int var54 = 0; var54 < 64; var54++) {
                                                for (int var55 = 0; var55 < 64; var55++) {
                                                    if (var47 + var54 > 0 && var47 + var54 < 103 && var48 + var55 > 0 && var48 + var55 < 103) {
                                                        var52[var53].field1955[var47 + var54][var48 + var55] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var53++;
                                        }
                                    }
                                    var46++;
                                }
                            }
                            if (field474) {
                                int var68 = 0;
                                label1138: while (true) {
                                    if (var68 >= 4) {
                                        for (int var86 = 0; var86 < 13; var86++) {
                                            for (int var87 = 0; var87 < 13; var87++) {
                                                int var88 = field300[0][var86][var87];
                                                if (var88 == -1) {
                                                    class6.method583(var86 * 8, var87 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method108(true);
                                        int var89 = 0;
                                        while (true) {
                                            if (var89 >= 4) {
                                                break label1138;
                                            }
                                            method992();
                                            for (int var90 = 0; var90 < 13; var90++) {
                                                label1061: for (int var91 = 0; var91 < 13; var91++) {
                                                    int var92 = field300[var89][var90][var91];
                                                    if (var92 != -1) {
                                                        int var93 = var92 >> 24 & 0x3;
                                                        int var94 = var92 >> 1 & 0x3;
                                                        int var95 = var92 >> 14 & 0x3FF;
                                                        int var96 = var92 >> 3 & 0x7FF;
                                                        int var97 = (var95 / 8 << 8) + var96 / 8;
                                                        for (int var98 = 0; var98 < Statics.field1687.length; var98++) {
                                                            if (Statics.field1687[var98] == var97 && Statics.field799[var98] != null) {
                                                                byte[] var99 = Statics.field799[var98];
                                                                int var100 = var90 * 8;
                                                                int var101 = var91 * 8;
                                                                int var102 = (var95 & 0x7) * 8;
                                                                int var103 = (var96 & 0x7) * 8;
                                                                class90 var104 = Statics.field152;
                                                                class112[] var105 = field343;
                                                                class123 var106 = new class123(var99);
                                                                int var107 = -1;
                                                                while (true) {
                                                                    int var108 = var106.method2412();
                                                                    if (var108 == 0) {
                                                                        continue label1061;
                                                                    }
                                                                    var107 += var108;
                                                                    int var109 = 0;
                                                                    while (true) {
                                                                        int var110 = var106.method2412();
                                                                        if (var110 == 0) {
                                                                            break;
                                                                        }
                                                                        var109 += var110 - 1;
                                                                        int var111 = var109 & 0x3F;
                                                                        int var112 = var109 >> 6 & 0x3F;
                                                                        int var113 = var109 >> 12;
                                                                        int var114 = var106.method2522();
                                                                        int var115 = var114 >> 2;
                                                                        int var116 = var114 & 0x3;
                                                                        if (var93 == var113 && var112 >= var102 && var112 < var102 + 8 && var111 >= var103 && var111 < var103 + 8) {
                                                                            class43 var117 = class43.method106(var107);
                                                                            int var118 = var100 + class181.method1007(var112 & 0x7, var111 & 0x7, var94, var117.field937, var117.field938, var116);
                                                                            int var119 = var101 + class181.method178(var112 & 0x7, var111 & 0x7, var94, var117.field937, var117.field938, var116);
                                                                            if (var118 > 0 && var119 > 0 && var118 < 103 && var119 < 103) {
                                                                                int var120 = var89;
                                                                                if ((class6.field83[1][var118][var119] & 0x2) == 2) {
                                                                                    var120 = var89 - 1;
                                                                                }
                                                                                class112 var121 = null;
                                                                                if (var120 >= 0) {
                                                                                    var121 = var105[var120];
                                                                                }
                                                                                class6.method1092(var89, var118, var119, var107, var94 + var116 & 0x3, var115, var104, var121);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var89++;
                                        }
                                    }
                                    method992();
                                    for (int var69 = 0; var69 < 13; var69++) {
                                        for (int var70 = 0; var70 < 13; var70++) {
                                            boolean var71 = false;
                                            int var72 = field300[var68][var69][var70];
                                            if (var72 != -1) {
                                                int var73 = var72 >> 24 & 0x3;
                                                int var74 = var72 >> 1 & 0x3;
                                                int var75 = var72 >> 14 & 0x3FF;
                                                int var76 = var72 >> 3 & 0x7FF;
                                                int var77 = (var75 / 8 << 8) + var76 / 8;
                                                for (int var78 = 0; var78 < Statics.field1687.length; var78++) {
                                                    if (Statics.field1687[var78] == var77 && Statics.field149[var78] != null) {
                                                        class6.method1254(Statics.field149[var78], var68, var69 * 8, var70 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, field343);
                                                        var71 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var71) {
                                                int var79 = var68;
                                                int var80 = var69 * 8;
                                                int var81 = var70 * 8;
                                                for (int var82 = 0; var82 < 8; var82++) {
                                                    for (int var83 = 0; var83 < 8; var83++) {
                                                        class6.field79[var79][var80 + var82][var81 + var83] = 0;
                                                    }
                                                }
                                                if (var80 > 0) {
                                                    for (int var84 = 1; var84 < 8; var84++) {
                                                        class6.field79[var79][var80][var81 + var84] = class6.field79[var79][var80 - 1][var81 + var84];
                                                    }
                                                }
                                                if (var81 > 0) {
                                                    for (int var85 = 1; var85 < 8; var85++) {
                                                        class6.field79[var79][var80 + var85][var81] = class6.field79[var79][var80 + var85][var81 - 1];
                                                    }
                                                }
                                                if (var80 > 0 && class6.field79[var79][var80 - 1][var81] != 0) {
                                                    class6.field79[var79][var80][var81] = class6.field79[var79][var80 - 1][var81];
                                                } else if (var81 > 0 && class6.field79[var79][var80][var81 - 1] != 0) {
                                                    class6.field79[var79][var80][var81] = class6.field79[var79][var80][var81 - 1];
                                                } else if (var80 > 0 && var81 > 0 && class6.field79[var79][var80 - 1][var81 - 1] != 0) {
                                                    class6.field79[var79][var80][var81] = class6.field79[var79][var80 - 1][var81 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var68++;
                                }
                            }
                            method108(true);
                            method1655();
                            method992();
                            class90 var122 = Statics.field152;
                            class112[] var123 = field343;
                            for (int var124 = 0; var124 < 4; var124++) {
                                for (int var125 = 0; var125 < 104; var125++) {
                                    for (int var126 = 0; var126 < 104; var126++) {
                                        if ((class6.field83[var124][var125][var126] & 0x1) == 1) {
                                            int var127 = var124;
                                            if ((class6.field83[1][var125][var126] & 0x2) == 2) {
                                                var127 = var124 - 1;
                                            }
                                            if (var127 >= 0) {
                                                var123[var127].method2282(var125, var126);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field95 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field95 < -8) {
                                class6.field95 = -8;
                            }
                            if (class6.field95 > 8) {
                                class6.field95 = 8;
                            }
                            class6.field94 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field94 < -16) {
                                class6.field94 = -16;
                            }
                            if (class6.field94 > 16) {
                                class6.field94 = 16;
                            }
                            for (int var128 = 0; var128 < 4; var128++) {
                                byte[][] var129 = Statics.field82[var128];
                                int var130 = (int) Math.sqrt(5100.0D);
                                int var131 = var130 * 768 >> 8;
                                for (int var132 = 1; var132 < 103; var132++) {
                                    for (int var133 = 1; var133 < 103; var133++) {
                                        int var134 = class6.field79[var128][var133 + 1][var132] - class6.field79[var128][var133 - 1][var132];
                                        int var135 = class6.field79[var128][var133][var132 + 1] - class6.field79[var128][var133][var132 - 1];
                                        int var136 = (int) Math.sqrt((double) (var135 * var135 + var134 * var134 + 65536));
                                        int var137 = (var134 << 8) / var136;
                                        int var138 = 65536 / var136;
                                        int var139 = (var135 << 8) / var136;
                                        int var140 = (var139 * -50 + var137 * -50 + var138 * -10) / var131 + 96;
                                        int var141 = (var129[var133][var132] >> 1) + (var129[var133][var132 + 1] >> 3) + (var129[var133][var132 - 1] >> 2) + (var129[var133 - 1][var132] >> 2) + (var129[var133 + 1][var132] >> 3);
                                        Statics.field781[var133][var132] = var140 - var141;
                                    }
                                }
                                for (int var142 = 0; var142 < 104; var142++) {
                                    Statics.field89[var142] = 0;
                                    Statics.field84[var142] = 0;
                                    Statics.field91[var142] = 0;
                                    Statics.field1833[var142] = 0;
                                    Statics.field2037[var142] = 0;
                                }
                                for (int var143 = -5; var143 < 109; var143++) {
                                    for (int var144 = 0; var144 < 104; var144++) {
                                        int var145 = var143 + 5;
                                        int var10002;
                                        if (var145 >= 0 && var145 < 104) {
                                            int var146 = Statics.field1145[var128][var145][var144] & 0xFF;
                                            if (var146 > 0) {
                                                class44 var147 = class44.method656(var146 - 1);
                                                Statics.field89[var144] += var147.field978;
                                                Statics.field84[var144] += var147.field979;
                                                Statics.field91[var144] += var147.field984;
                                                Statics.field1833[var144] += var147.field981;
                                                var10002 = Statics.field2037[var144]++;
                                            }
                                        }
                                        int var148 = var143 - 5;
                                        if (var148 >= 0 && var148 < 104) {
                                            int var149 = Statics.field1145[var128][var148][var144] & 0xFF;
                                            if (var149 > 0) {
                                                class44 var150 = class44.method656(var149 - 1);
                                                Statics.field89[var144] -= var150.field978;
                                                Statics.field84[var144] -= var150.field979;
                                                Statics.field91[var144] -= var150.field984;
                                                Statics.field1833[var144] -= var150.field981;
                                                var10002 = Statics.field2037[var144]--;
                                            }
                                        }
                                    }
                                    if (var143 >= 1 && var143 < 103) {
                                        int var151 = 0;
                                        int var152 = 0;
                                        int var153 = 0;
                                        int var154 = 0;
                                        int var155 = 0;
                                        for (int var156 = -5; var156 < 109; var156++) {
                                            int var157 = var156 + 5;
                                            if (var157 >= 0 && var157 < 104) {
                                                var151 += Statics.field89[var157];
                                                var152 += Statics.field84[var157];
                                                var153 += Statics.field91[var157];
                                                var154 += Statics.field1833[var157];
                                                var155 += Statics.field2037[var157];
                                            }
                                            int var158 = var156 - 5;
                                            if (var158 >= 0 && var158 < 104) {
                                                var151 -= Statics.field89[var158];
                                                var152 -= Statics.field84[var158];
                                                var153 -= Statics.field91[var158];
                                                var154 -= Statics.field1833[var158];
                                                var155 -= Statics.field2037[var158];
                                            }
                                            if (var156 >= 1 && var156 < 103 && (!field287 || (class6.field83[0][var143][var156] & 0x2) != 0 || (class6.field83[var128][var143][var156] & 0x10) == 0)) {
                                                if (var128 < class6.field80) {
                                                    class6.field80 = var128;
                                                }
                                                int var159 = Statics.field1145[var128][var143][var156] & 0xFF;
                                                int var160 = Statics.field2925[var128][var143][var156] & 0xFF;
                                                if (var159 > 0 || var160 > 0) {
                                                    int var161 = class6.field79[var128][var143][var156];
                                                    int var162 = class6.field79[var128][var143 + 1][var156];
                                                    int var163 = class6.field79[var128][var143 + 1][var156 + 1];
                                                    int var164 = class6.field79[var128][var143][var156 + 1];
                                                    int var165 = Statics.field781[var143][var156];
                                                    int var166 = Statics.field781[var143 + 1][var156];
                                                    int var167 = Statics.field781[var143 + 1][var156 + 1];
                                                    int var168 = Statics.field781[var143][var156 + 1];
                                                    int var169 = -1;
                                                    int var170 = -1;
                                                    if (var159 > 0) {
                                                        int var171 = var151 * 256 / var154;
                                                        int var172 = var152 / var155;
                                                        int var173 = var153 / var155;
                                                        var169 = Statics.method179(var171, var172, var173);
                                                        int var174 = class6.field95 + var171 & 0xFF;
                                                        int var175 = class6.field94 + var173;
                                                        if (var175 < 0) {
                                                            var175 = 0;
                                                        } else if (var175 > 255) {
                                                            var175 = 255;
                                                        }
                                                        var170 = Statics.method179(var174, var172, var175);
                                                    }
                                                    if (var128 > 0) {
                                                        boolean var176 = true;
                                                        if (var159 == 0 && Statics.field77[var128][var143][var156] != 0) {
                                                            var176 = false;
                                                        }
                                                        if (var160 > 0) {
                                                            int var177 = var160 - 1;
                                                            class49 var178 = (class49) class49.field1063.method3569((long) var177);
                                                            class49 var179;
                                                            if (var178 == null) {
                                                                byte[] var180 = Statics.field1058.method3107(4, var177);
                                                                class49 var181 = new class49();
                                                                if (var180 != null) {
                                                                    var181.method950(new class123(var180), var177);
                                                                }
                                                                var181.method962();
                                                                class49.field1063.method3571(var181, (long) var177);
                                                                var179 = var181;
                                                            } else {
                                                                var179 = var178;
                                                            }
                                                            if (!var179.field1060) {
                                                                var176 = false;
                                                            }
                                                        }
                                                        if (var176 && var161 == var162 && var161 == var163 && var161 == var164) {
                                                            Statics.field716[var128][var143][var156] |= 0x924;
                                                        }
                                                    }
                                                    int var182 = 0;
                                                    if (var170 != -1) {
                                                        var182 = class95.field1625[class6.method2273(var170, 96)];
                                                    }
                                                    if (var160 == 0) {
                                                        var122.method1871(var128, var143, var156, 0, 0, -1, var161, var162, var163, var164, class6.method2273(var169, var165), class6.method2273(var169, var166), class6.method2273(var169, var167), class6.method2273(var169, var168), 0, 0, 0, 0, var182, 0);
                                                    } else {
                                                        int var183 = Statics.field77[var128][var143][var156] + 1;
                                                        byte var184 = Statics.field81[var128][var143][var156];
                                                        int var185 = var160 - 1;
                                                        class49 var186 = (class49) class49.field1063.method3569((long) var185);
                                                        class49 var187;
                                                        if (var186 == null) {
                                                            byte[] var188 = Statics.field1058.method3107(4, var185);
                                                            class49 var189 = new class49();
                                                            if (var188 != null) {
                                                                var189.method950(new class123(var188), var185);
                                                            }
                                                            var189.method962();
                                                            class49.field1063.method3571(var189, (long) var185);
                                                            var187 = var189;
                                                        } else {
                                                            var187 = var186;
                                                        }
                                                        int var191 = var187.field1059;
                                                        int var192;
                                                        int var193;
                                                        if (var191 >= 0) {
                                                            var192 = Statics.field1643.method2079(var191);
                                                            var193 = -1;
                                                        } else if (var187.field1070 == 16711935) {
                                                            var193 = -2;
                                                            var191 = -1;
                                                            var192 = -2;
                                                        } else {
                                                            var193 = Statics.method179(var187.field1066, var187.field1056, var187.field1064);
                                                            int var194 = class6.field95 + var187.field1066 & 0xFF;
                                                            int var195 = class6.field94 + var187.field1064;
                                                            if (var195 < 0) {
                                                                var195 = 0;
                                                            } else if (var195 > 255) {
                                                                var195 = 255;
                                                            }
                                                            var192 = Statics.method179(var194, var187.field1056, var195);
                                                        }
                                                        int var196 = 0;
                                                        if (var192 != -2) {
                                                            var196 = class95.field1625[class6.method3181(var192, 96)];
                                                        }
                                                        if (var187.field1061 != -1) {
                                                            int var197 = class6.field95 + var187.field1065 & 0xFF;
                                                            int var198 = class6.field94 + var187.field1067;
                                                            if (var198 < 0) {
                                                                var198 = 0;
                                                            } else if (var198 > 255) {
                                                                var198 = 255;
                                                            }
                                                            int var199 = Statics.method179(var197, var187.field1071, var198);
                                                            var196 = class95.field1625[class6.method3181(var199, 96)];
                                                        }
                                                        var122.method1871(var128, var143, var156, var183, var184, var191, var161, var162, var163, var164, class6.method2273(var169, var165), class6.method2273(var169, var166), class6.method2273(var169, var167), class6.method2273(var169, var168), class6.method3181(var193, var165), class6.method3181(var193, var166), class6.method3181(var193, var167), class6.method3181(var193, var168), var182, var196);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var200 = 1; var200 < 103; var200++) {
                                    for (int var201 = 1; var201 < 103; var201++) {
                                        int var206;
                                        if ((class6.field83[var128][var201][var200] & 0x8) != 0) {
                                            var206 = 0;
                                        } else if (var128 <= 0 || (class6.field83[1][var201][var200] & 0x2) == 0) {
                                            var206 = var128;
                                        } else {
                                            var206 = var128 - 1;
                                        }
                                        var122.method1859(var128, var201, var200, var206);
                                    }
                                }
                                Statics.field1145[var128] = (byte[][]) null;
                                Statics.field2925[var128] = (byte[][]) null;
                                Statics.field77[var128] = (byte[][]) null;
                                Statics.field81[var128] = (byte[][]) null;
                                Statics.field82[var128] = (byte[][]) null;
                            }
                            var122.method1894(-50, -10, -50);
                            for (int var207 = 0; var207 < 104; var207++) {
                                for (int var208 = 0; var208 < 104; var208++) {
                                    if ((class6.field83[1][var207][var208] & 0x2) == 2) {
                                        var122.method1858(var207, var208);
                                    }
                                }
                            }
                            int var209 = 1;
                            int var210 = 2;
                            int var211 = 4;
                            for (int var212 = 0; var212 < 4; var212++) {
                                if (var212 > 0) {
                                    var209 <<= 0x3;
                                    var210 <<= 0x3;
                                    var211 <<= 0x3;
                                }
                                for (int var213 = 0; var213 <= var212; var213++) {
                                    for (int var214 = 0; var214 <= 104; var214++) {
                                        for (int var215 = 0; var215 <= 104; var215++) {
                                            if ((Statics.field716[var213][var215][var214] & var209) != 0) {
                                                int var216 = var214;
                                                int var217 = var214;
                                                int var218 = var213;
                                                int var219 = var213;
                                                while (var216 > 0 && (Statics.field716[var213][var215][var216 - 1] & var209) != 0) {
                                                    var216--;
                                                }
                                                while (var217 < 104 && (Statics.field716[var213][var215][var217 + 1] & var209) != 0) {
                                                    var217++;
                                                }
                                                label780: while (var218 > 0) {
                                                    for (int var220 = var216; var220 <= var217; var220++) {
                                                        if ((Statics.field716[var218 - 1][var215][var220] & var209) == 0) {
                                                            break label780;
                                                        }
                                                    }
                                                    var218--;
                                                }
                                                label769: while (var219 < var212) {
                                                    for (int var221 = var216; var221 <= var217; var221++) {
                                                        if ((Statics.field716[var219 + 1][var215][var221] & var209) == 0) {
                                                            break label769;
                                                        }
                                                    }
                                                    var219++;
                                                }
                                                int var222 = (var219 + 1 - var218) * (var217 - var216 + 1);
                                                if (var222 >= 8) {
                                                    short var223 = 240;
                                                    int var224 = class6.field79[var219][var215][var216] - var223;
                                                    int var225 = class6.field79[var218][var215][var216];
                                                    class90.method1897(var212, 1, var215 * 128, var215 * 128, var216 * 128, var217 * 128 + 128, var224, var225);
                                                    for (int var226 = var218; var226 <= var219; var226++) {
                                                        for (int var227 = var216; var227 <= var217; var227++) {
                                                            Statics.field716[var226][var215][var227] &= ~var209;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field716[var213][var215][var214] & var210) != 0) {
                                                int var228 = var215;
                                                int var229 = var215;
                                                int var230 = var213;
                                                int var231 = var213;
                                                while (var228 > 0 && (Statics.field716[var213][var228 - 1][var214] & var210) != 0) {
                                                    var228--;
                                                }
                                                while (var229 < 104 && (Statics.field716[var213][var229 + 1][var214] & var210) != 0) {
                                                    var229++;
                                                }
                                                label833: while (var230 > 0) {
                                                    for (int var232 = var228; var232 <= var229; var232++) {
                                                        if ((Statics.field716[var230 - 1][var232][var214] & var210) == 0) {
                                                            break label833;
                                                        }
                                                    }
                                                    var230--;
                                                }
                                                label822: while (var231 < var212) {
                                                    for (int var233 = var228; var233 <= var229; var233++) {
                                                        if ((Statics.field716[var231 + 1][var233][var214] & var210) == 0) {
                                                            break label822;
                                                        }
                                                    }
                                                    var231++;
                                                }
                                                int var234 = (var231 + 1 - var230) * (var229 - var228 + 1);
                                                if (var234 >= 8) {
                                                    short var235 = 240;
                                                    int var236 = class6.field79[var231][var228][var214] - var235;
                                                    int var237 = class6.field79[var230][var228][var214];
                                                    class90.method1897(var212, 2, var228 * 128, var229 * 128 + 128, var214 * 128, var214 * 128, var236, var237);
                                                    for (int var238 = var230; var238 <= var231; var238++) {
                                                        for (int var239 = var228; var239 <= var229; var239++) {
                                                            Statics.field716[var238][var239][var214] &= ~var210;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field716[var213][var215][var214] & var211) != 0) {
                                                int var240 = var215;
                                                int var241 = var215;
                                                int var242 = var214;
                                                int var243 = var214;
                                                while (var242 > 0 && (Statics.field716[var213][var215][var242 - 1] & var211) != 0) {
                                                    var242--;
                                                }
                                                while (var243 < 104 && (Statics.field716[var213][var215][var243 + 1] & var211) != 0) {
                                                    var243++;
                                                }
                                                label886: while (var240 > 0) {
                                                    for (int var244 = var242; var244 <= var243; var244++) {
                                                        if ((Statics.field716[var213][var240 - 1][var244] & var211) == 0) {
                                                            break label886;
                                                        }
                                                    }
                                                    var240--;
                                                }
                                                label875: while (var241 < 104) {
                                                    for (int var245 = var242; var245 <= var243; var245++) {
                                                        if ((Statics.field716[var213][var241 + 1][var245] & var211) == 0) {
                                                            break label875;
                                                        }
                                                    }
                                                    var241++;
                                                }
                                                if ((var241 - var240 + 1) * (var243 - var242 + 1) >= 4) {
                                                    int var246 = class6.field79[var213][var240][var242];
                                                    class90.method1897(var212, 4, var240 * 128, var241 * 128 + 128, var242 * 128, var243 * 128 + 128, var246, var246);
                                                    for (int var247 = var240; var247 <= var241; var247++) {
                                                        for (int var248 = var242; var248 <= var243; var248++) {
                                                            Statics.field716[var213][var247][var248] &= ~var211;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method108(true);
                            int var249 = class6.field80;
                            if (var249 > Statics.field223) {
                                var249 = Statics.field223;
                            }
                            if (var249 < Statics.field223 - 1) {
                                int var250 = Statics.field223 - 1;
                            }
                            if (field287) {
                                Statics.field152.method1860(class6.field80);
                            } else {
                                Statics.field152.method1860(0);
                            }
                            for (int var251 = 0; var251 < 104; var251++) {
                                for (int var252 = 0; var252 < 104; var252++) {
                                    method587(var251, var252);
                                }
                            }
                            method992();
                            method799();
                            class43.field925.method3572();
                            if (Statics.field1957 != null) {
                                field398.method2634(2);
                                field398.method2387(1057001181);
                            }
                            if (!field474) {
                                int var253 = (Statics.field1738 - 6) / 8;
                                int var254 = (Statics.field1738 + 6) / 8;
                                int var255 = (Statics.field73 - 6) / 8;
                                int var256 = (Statics.field73 + 6) / 8;
                                for (int var257 = var253 - 1; var257 <= var254 + 1; var257++) {
                                    for (int var258 = var255 - 1; var258 <= var256 + 1; var258++) {
                                        if (var257 < var253 || var257 > var254 || var258 < var255 || var258 > var256) {
                                            Statics.field1268.method3090("m" + var257 + "_" + var258);
                                            Statics.field1268.method3090("l" + var257 + "_" + var258);
                                        }
                                    }
                                }
                            }
                            method919(30);
                            method992();
                            Statics.field1145 = (byte[][][]) null;
                            Statics.field2925 = (byte[][][]) null;
                            Statics.field77 = (byte[][][]) null;
                            Statics.field81 = (byte[][][]) null;
                            Statics.field716 = (int[][][]) null;
                            Statics.field82 = (byte[][][]) null;
                            Statics.field781 = (int[][]) null;
                            Statics.field89 = null;
                            Statics.field84 = null;
                            Statics.field91 = null;
                            Statics.field1833 = null;
                            Statics.field2037 = null;
                            field398.method2634(199);
                            Statics.field1149.method2738();
                            for (int var259 = 0; var259 < 32; var259++) {
                                field2247[var259] = 0L;
                            }
                            for (int var260 = 0; var260 < 32; var260++) {
                                field2248[var260] = 0L;
                            }
                            Statics.field1808 = 0;
                        } else {
                            field562 = 2;
                        }
                    } else {
                        field562 = 1;
                    }
                }
                if (field289 == 30) {
                    method1545();
                } else if (field289 == 40 || field289 == 45) {
                    method2999();
                }
                return;
            }
            var2.field2735.method3209(var2.field2737, (int) var2.field3167, var2.field2736, false);
        }
    }

    @ObfuscatedName("client.c(I)V")
    public final void method418() {
        boolean var1 = class187.method3217();
        if (var1 && field471 && Statics.field15 != null) {
            Statics.field15.method1204();
        }
        if (field289 == 10 || field289 == 20 || field289 == 30) {
            if (field455 != 0L && class119.method137() > field455) {
                int var2 = method2992();
                field455 = 0L;
                if (var2 >= 2) {
                    field494 = true;
                } else {
                    field494 = false;
                }
                method989();
                if (field289 >= 25) {
                    method153();
                }
                field2251 = true;
            } else if (field2254) {
                class141.method665(Statics.field1722);
                Canvas var3 = Statics.field1722;
                var3.removeMouseListener(class144.field2205);
                var3.removeMouseMotionListener(class144.field2205);
                var3.removeFocusListener(class144.field2205);
                class144.field2195 = 0;
                if (Statics.field1966 != null) {
                    Statics.field1966.method2715(Statics.field1722);
                }
                Statics.field443.method2882();
                Statics.field1722.setBackground(Color.black);
                Canvas var4 = Statics.field1722;
                var4.setFocusTraversalKeysEnabled(false);
                var4.addKeyListener(class141.field2178);
                var4.addFocusListener(class141.field2178);
                Canvas var5 = Statics.field1722;
                var5.addMouseListener(class144.field2205);
                var5.addMouseMotionListener(class144.field2205);
                var5.addFocusListener(class144.field2205);
                if (Statics.field1966 != null) {
                    Statics.field1966.method2706(Statics.field1722);
                }
                if (field302 != -1) {
                    method107(field302, Statics.field2297, Statics.field1617, false);
                }
                field2244 = true;
            }
        }
        Dimension var6 = this.method2894();
        if (Statics.field1011 != var6.width || Statics.field2100 != var6.height || field2244) {
            method989();
            field455 = class119.method137() + 500L;
            field2244 = false;
        }
        boolean var7 = false;
        if (field2251) {
            field2251 = false;
            var7 = true;
            for (int var8 = 0; var8 < 100; var8++) {
                field527[var8] = true;
            }
        }
        if (var7) {
            method1010();
        }
        if (field289 == 0) {
            int var9 = class34.field742;
            String var10 = class34.field743;
            Color var11 = null;
            try {
                Graphics var12 = Statics.field1722.getGraphics();
                if (Statics.field1820 == null) {
                    Statics.field1820 = new Font("Helvetica", 1, 13);
                    Statics.field1062 = Statics.field1722.getFontMetrics(Statics.field1820);
                }
                if (var7) {
                    var12.setColor(Color.black);
                    var12.fillRect(0, 0, Statics.field2297, Statics.field1617);
                }
                if (var11 == null) {
                    var11 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field574 == null) {
                        Statics.field574 = Statics.field1722.createImage(304, 34);
                    }
                    Graphics var13 = Statics.field574.getGraphics();
                    var13.setColor(var11);
                    var13.drawRect(0, 0, 303, 33);
                    var13.fillRect(2, 2, var9 * 3, 30);
                    var13.setColor(Color.black);
                    var13.drawRect(1, 1, 301, 31);
                    var13.fillRect(var9 * 3 + 2, 2, 300 - var9 * 3, 30);
                    var13.setFont(Statics.field1820);
                    var13.setColor(Color.white);
                    var13.drawString(var10, (304 - Statics.field1062.stringWidth(var10)) / 2, 22);
                    var12.drawImage(Statics.field574, Statics.field2297 / 2 - 152, Statics.field1617 / 2 - 18, (ImageObserver) null);
                } catch (Exception var52) {
                    int var15 = Statics.field2297 / 2 - 152;
                    int var16 = Statics.field1617 / 2 - 18;
                    var12.setColor(var11);
                    var12.drawRect(var15, var16, 303, 33);
                    var12.fillRect(var15 + 2, var16 + 2, var9 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(var15 + 1, var16 + 1, 301, 31);
                    var12.fillRect(var9 * 3 + var15 + 2, var16 + 2, 300 - var9 * 3, 30);
                    var12.setFont(Statics.field1820);
                    var12.setColor(Color.white);
                    var12.drawString(var10, var15 + (304 - Statics.field1062.stringWidth(var10)) / 2, var16 + 22);
                }
            } catch (Exception var53) {
                Statics.field1722.repaint();
            }
        } else if (field289 == 5) {
            class34.method2858(Statics.field1435, Statics.field226, Statics.field1963, var7);
        } else if (field289 == 10 || field289 == 11) {
            class34.method2858(Statics.field1435, Statics.field226, Statics.field1963, var7);
        } else if (field289 == 20) {
            class34.method2858(Statics.field1435, Statics.field226, Statics.field1963, var7);
        } else if (field289 == 25) {
            if (field562 == 1) {
                if (field338 > field339) {
                    field339 = field338;
                }
                int var18 = (field339 * 50 - field338 * 50) / field339;
                method140(class161.field2369 + class2.field19 + class2.field22 + var18 + "%" + class2.field25, false);
            } else if (field562 == 2) {
                if (field340 > field341) {
                    field341 = field340;
                }
                int var19 = (field341 * 50 - field340 * 50) / field341 + 50;
                method140(class161.field2369 + class2.field19 + class2.field22 + var19 + "%" + class2.field25, false);
            } else {
                method140(class161.field2369, false);
            }
        } else if (field289 == 30) {
            if (field302 != -1) {
                int var20 = field302;
                if (class177.method3200(var20)) {
                    method21(Statics.field2910[var20], -1);
                }
            }
            for (int var21 = 0; var21 < field483; var21++) {
                if (field527[var21]) {
                    field486[var21] = true;
                }
                field487[var21] = field527[var21];
                field527[var21] = false;
            }
            field484 = field291;
            field429 = -1;
            field501 = -1;
            Statics.field788 = null;
            if (field302 != -1) {
                field483 = 0;
                int var22 = field302;
                int var23 = Statics.field2297;
                int var24 = Statics.field1617;
                if (class177.method3200(var22)) {
                    Statics.field159 = null;
                    method668(Statics.field2910[var22], -1, 0, 0, var23, var24, 0, 0, -1);
                    if (Statics.field159 != null) {
                        method668(Statics.field159, -1412584499, 0, 0, var23, var24, Statics.field273, Statics.field2078, -1);
                        Statics.field159 = null;
                    }
                } else {
                    for (int var25 = 0; var25 < 100; var25++) {
                        field527[var25] = true;
                    }
                }
            }
            class83.method1746();
            if (field421) {
                method1853();
            } else if (field429 != -1) {
                int var26 = field429;
                int var27 = field501;
                if (field422 >= 2 || field433 != 0 || field435) {
                    String var28;
                    if (field433 == 1 && field422 < 2) {
                        var28 = class161.field2496 + class161.field2506 + field434 + " " + class2.field24;
                    } else if (field435 && field422 < 2) {
                        var28 = field493 + class161.field2506 + field439 + " " + class2.field24;
                    } else {
                        int var29 = field422 - 1;
                        String var30;
                        if (field428[var29].length() > 0) {
                            var30 = field427[var29] + class161.field2506 + field428[var29];
                        } else {
                            var30 = field427[var29];
                        }
                        var28 = var30;
                    }
                    if (field422 > 2) {
                        var28 = var28 + class2.method2017(16777215) + " " + '/' + " " + (field422 - 2) + class161.field2500;
                    }
                    Statics.field1435.method3883(var28, var26 + 4, var27 + 15, 16777215, 0, field291 / 1000);
                }
            }
            if (field308 == 3) {
                for (int var31 = 0; var31 < field483; var31++) {
                    if (field487[var31]) {
                        class83.method1752(field488[var31], field489[var31], field342[var31], field491[var31], 16711935, 128);
                    } else if (field486[var31]) {
                        class83.method1752(field488[var31], field489[var31], field342[var31], field491[var31], 16711680, 128);
                    }
                }
            }
            int var32 = Statics.field223;
            int var33 = Statics.field767.field864;
            int var34 = Statics.field767.field818;
            int var35 = field359;
            for (class25 var36 = (class25) class25.field627.method3646(); var36 != null; var36 = (class25) class25.field627.method3648()) {
                if (var36.field619 != -1 || var36.field623 != null) {
                    int var37 = 0;
                    if (var33 > var36.field616) {
                        var37 += var33 - var36.field616;
                    } else if (var33 < var36.field614) {
                        var37 += var36.field614 - var33;
                    }
                    if (var34 > var36.field617) {
                        var37 += var34 - var36.field617;
                    } else if (var34 < var36.field615) {
                        var37 += var36.field615 - var34;
                    }
                    if (var37 - 64 > var36.field618 || field521 == 0 || var36.field628 != var32) {
                        if (var36.field620 != null) {
                            Statics.field60.method1153(var36.field620);
                            var36.field620 = null;
                        }
                        if (var36.field625 != null) {
                            Statics.field60.method1153(var36.field625);
                            var36.field625 = null;
                        }
                    } else {
                        var37 -= 64;
                        if (var37 < 0) {
                            var37 = 0;
                        }
                        int var38 = field521 * (var36.field618 - var37) / var36.field618;
                        class62 var10000;
                        if (var36.field620 != null) {
                            var36.field620.method1388(var38);
                        } else if (var36.field619 >= 0) {
                            var10000 = (class62) null;
                            class62 var39 = class62.method1279(Statics.field78, var36.field619, 0);
                            if (var39 != null) {
                                class66 var40 = var39.method1268().method1311(Statics.field1235);
                                class68 var41 = class68.method1335(var40, 100, var38);
                                var41.method1361(-1);
                                Statics.field60.method1164(var41);
                                var36.field620 = var41;
                            }
                        }
                        if (var36.field625 != null) {
                            var36.field625.method1388(var38);
                            if (!var36.field625.method3743()) {
                                var36.field625 = null;
                            }
                        } else if (var36.field623 != null && (var36.field612 -= var35) <= 0) {
                            int var42 = (int) (Math.random() * (double) var36.field623.length);
                            var10000 = (class62) null;
                            class62 var43 = class62.method1279(Statics.field78, var36.field623[var42], 0);
                            if (var43 != null) {
                                class66 var44 = var43.method1268().method1311(Statics.field1235);
                                class68 var45 = class68.method1335(var44, 100, var38);
                                var45.method1361(0);
                                Statics.field60.method1164(var45);
                                var36.field625 = var45;
                                var36.field612 = var36.field629 + (int) (Math.random() * (double) (var36.field621 - var36.field629));
                            }
                        }
                    }
                }
            }
            field359 = 0;
        } else if (field289 == 40) {
            method140(class161.field2359 + class2.field19 + class161.field2360, false);
        } else if (field289 == 45) {
            method140(class161.field2504, false);
        }
        if (field289 == 30 && field308 == 0 && !var7) {
            try {
                Graphics var46 = Statics.field1722.getGraphics();
                for (int var47 = 0; var47 < field483; var47++) {
                    if (field486[var47]) {
                        Statics.field636.method1579(var46, field488[var47], field489[var47], field342[var47], field491[var47]);
                        field486[var47] = false;
                    }
                }
            } catch (Exception var55) {
                Statics.field1722.repaint();
            }
        } else if (field289 > 0) {
            try {
                Graphics var49 = Statics.field1722.getGraphics();
                Statics.field636.method1610(var49, 0, 0);
                for (int var50 = 0; var50 < field483; var50++) {
                    field486[var50] = false;
                }
            } catch (Exception var54) {
                Statics.field1722.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method233() {
        if (Statics.field2087.method199()) {
            Statics.field2087.method196();
        }
        if (Statics.field3214 != null) {
            Statics.field3214.field193 = false;
        }
        Statics.field3214 = null;
        if (Statics.field605 != null) {
            Statics.field605.method2860();
            Statics.field605 = null;
        }
        class141.method16();
        if (class144.field2205 != null) {
            class144 var1 = class144.field2205;
            synchronized (class144.field2205) {
                class144.field2205 = null;
            }
        }
        Statics.field1966 = null;
        if (Statics.field15 != null) {
            Statics.field15.method1205();
        }
        if (Statics.field2120 != null) {
            Statics.field2120.method1205();
        }
        if (Statics.field2756 != null) {
            Statics.field2756.method2860();
        }
        Object var3 = class174.field2747;
        synchronized (class174.field2747) {
            if (class174.field2744 != 0) {
                class174.field2744 = 1;
                try {
                    class174.field2747.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class153.field2282.method3962();
            for (int var6 = 0; var6 < Statics.field2281; var6++) {
                Statics.field607[var6].method3962();
            }
            class153.field2284.method3962();
            class153.field2276.method3962();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("af.l(IB)V")
    public static void method919(int arg0) {
        if (field289 == arg0) {
            return;
        }
        if (field289 == 0) {
            Statics.field574 = null;
            Statics.field1820 = null;
            Statics.field1062 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field557 = 0;
            field318 = 0;
            field319 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2020 != null) {
            Statics.field2020.method2860();
            Statics.field2020 = null;
        }
        if (field289 == 25) {
            field562 = 0;
            field338 = 0;
            field339 = 1;
            field340 = 0;
            field341 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method51(Statics.field1722, Statics.field227, Statics.field691, true, 0);
        } else if (arg0 == 20) {
            class34.method51(Statics.field1722, Statics.field227, Statics.field691, true, field289 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method51(Statics.field1722, Statics.field227, Statics.field691, false, 4);
        } else if (Statics.field722) {
            Statics.field749 = null;
            Statics.field723 = null;
            Statics.field724 = null;
            Statics.field732 = null;
            Statics.field726 = null;
            Statics.field750 = null;
            Statics.field2700 = null;
            Statics.field728 = null;
            Statics.field729 = null;
            Statics.field260 = null;
            Statics.field1046 = null;
            Statics.field757 = null;
            Statics.field214 = null;
            Statics.field143 = null;
            Statics.field1436 = null;
            Statics.field212 = null;
            Statics.field71 = null;
            Statics.field734 = null;
            Statics.field686 = null;
            Statics.field3047 = null;
            Statics.field737 = null;
            Statics.field3210 = null;
            class187.method141(2);
            class175.method169(true);
            Statics.field722 = false;
        }
        field289 = arg0;
    }

    @ObfuscatedName("client.h(B)V")
    public void method521() {
        if (field289 == 1000) {
            return;
        }
        long var1 = class119.method137();
        int var3 = (int) (var1 - Statics.field2751);
        Statics.field2751 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2750 += var3;
        boolean var4;
        if (class175.field2758 == 0 && class175.field2755 == 0 && class175.field2770 == 0 && class175.field2749 == 0) {
            var4 = true;
        } else if (Statics.field2756 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2750 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2755 < 20 && class175.field2749 > 0) {
                        class176 var5 = (class176) class175.field2752.method3608();
                        class123 var6 = new class123(4);
                        var6.method2384(1);
                        var6.method2386((int) var5.field3167);
                        Statics.field2756.method2859(var6.field2053, 0, 4);
                        class175.field2754.method3606(var5, var5.field3167);
                        class175.field2749--;
                        class175.field2755++;
                    }
                    while (class175.field2758 < 20 && class175.field2770 > 0) {
                        class176 var7 = (class176) class175.field2759.method3713();
                        class123 var8 = new class123(4);
                        var8.method2384(0);
                        var8.method2386((int) var7.field3167);
                        Statics.field2756.method2859(var8.field2053, 0, 4);
                        var7.method3724();
                        class175.field2761.method3606(var7, var7.field3167);
                        class175.field2770--;
                        class175.field2758++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2756.method2863();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2750 = 0;
                        byte var11 = 0;
                        if (Statics.field96 == null) {
                            var11 = 8;
                        } else if (class175.field2763 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2771.field2052;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2756.method2864(class175.field2771.field2053, class175.field2771.field2052, var12);
                            if (class175.field2765 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2771.field2053[class175.field2771.field2052 + var13] ^= class175.field2765;
                                }
                            }
                            class175.field2771.field2052 += var12;
                            if (class175.field2771.field2052 < var11) {
                                break;
                            }
                            if (Statics.field96 == null) {
                                class175.field2771.field2052 = 0;
                                int var14 = class175.field2771.method2522();
                                int var15 = class175.field2771.method2401();
                                int var16 = class175.field2771.method2522();
                                int var17 = class175.field2771.method2404();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2754.method3605(var18);
                                Statics.field783 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2761.method3605(var18);
                                    Statics.field783 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field96 = var20;
                                Statics.field708 = new class123(var17 + var21 + Statics.field96.field2776);
                                Statics.field708.method2384(var16);
                                Statics.field708.method2387(var17);
                                class175.field2763 = 8;
                                class175.field2771.field2052 = 0;
                            } else if (class175.field2763 == 0) {
                                if (class175.field2771.field2053[0] == -1) {
                                    class175.field2763 = 1;
                                    class175.field2771.field2052 = 0;
                                } else {
                                    Statics.field96 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field708.field2053.length - Statics.field96.field2776;
                            int var23 = 512 - class175.field2763;
                            if (var23 > var22 - Statics.field708.field2052) {
                                var23 = var22 - Statics.field708.field2052;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2756.method2864(Statics.field708.field2053, Statics.field708.field2052, var23);
                            if (class175.field2765 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field708.field2053[Statics.field708.field2052 + var24] ^= class175.field2765;
                                }
                            }
                            Statics.field708.field2052 += var23;
                            class175.field2763 += var23;
                            if (Statics.field708.field2052 == var22) {
                                if (Statics.field96.field3167 == 16711935L) {
                                    Statics.field2687 = Statics.field708;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2753[var25];
                                        if (var26 != null) {
                                            Statics.field2687.field2052 = var25 * 8 + 5;
                                            int var27 = Statics.field2687.method2404();
                                            int var28 = Statics.field2687.method2404();
                                            var26.method3185(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2760.reset();
                                    class175.field2760.update(Statics.field708.field2053, 0, var22);
                                    int var29 = (int) class175.field2760.getValue();
                                    if (Statics.field96.field2775 != var29) {
                                        try {
                                            Statics.field2756.method2860();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2766++;
                                        Statics.field2756 = null;
                                        class175.field2765 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2766 = 0;
                                    class175.field2767 = 0;
                                    Statics.field96.field2777.method3186((int) (Statics.field96.field3167 & 0xFFFFL), Statics.field708.field2053, (Statics.field96.field3167 & 0xFF0000L) == 16711680L, Statics.field783);
                                }
                                Statics.field96.method3744();
                                if (Statics.field783) {
                                    class175.field2755--;
                                } else {
                                    class175.field2758--;
                                }
                                class175.field2763 = 0;
                                Statics.field96 = null;
                                Statics.field708 = null;
                            } else {
                                if (class175.field2763 != 512) {
                                    break;
                                }
                                class175.field2763 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2756.method2860();
                } catch (Exception var34) {
                }
                class175.field2767++;
                Statics.field2756 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method235();
        }
    }

    @ObfuscatedName("client.i(I)V")
    public void method235() {
        if (class175.field2766 >= 4) {
            this.method2892("js5crc");
            field289 = 1000;
            return;
        }
        if (class175.field2767 >= 4) {
            if (field289 <= 5) {
                this.method2892("js5io");
                field289 = 1000;
                return;
            }
            field311 = 3000;
            class175.field2767 = 3;
        }
        if (--field311 + 1 > 0) {
            return;
        }
        try {
            if (field310 == 0) {
                Statics.field2167 = Statics.field1147.method2767(Statics.field648, Statics.field2014);
                field310++;
            }
            if (field310 == 1) {
                if (Statics.field2167.field2263 == 2) {
                    this.method456(-1);
                    return;
                }
                if (Statics.field2167.field2263 == 1) {
                    field310++;
                }
            }
            if (field310 == 2) {
                Statics.field3046 = new class147((Socket) Statics.field2167.field2267, Statics.field1147);
                class123 var1 = new class123(5);
                var1.method2384(15);
                var1.method2387(124);
                Statics.field3046.method2859(var1.field2053, 0, 5);
                field310++;
                Statics.field312 = class119.method137();
            }
            if (field310 == 3) {
                if (field289 <= 5 || Statics.field3046.method2863() > 0) {
                    int var2 = Statics.field3046.method2879();
                    if (var2 != 0) {
                        this.method456(var2);
                        return;
                    }
                    field310++;
                } else if (class119.method137() - Statics.field312 > 30000L) {
                    this.method456(-2);
                    return;
                }
            }
            if (field310 == 4) {
                class147 var3 = Statics.field3046;
                boolean var4 = field289 > 20;
                if (Statics.field2756 != null) {
                    try {
                        Statics.field2756.method2860();
                    } catch (Exception var14) {
                    }
                    Statics.field2756 = null;
                }
                Statics.field2756 = var3;
                class175.method169(var4);
                class175.field2771.field2052 = 0;
                Statics.field96 = null;
                Statics.field708 = null;
                class175.field2763 = 0;
                while (true) {
                    class176 var6 = (class176) class175.field2754.method3608();
                    if (var6 == null) {
                        while (true) {
                            class176 var7 = (class176) class175.field2761.method3608();
                            if (var7 == null) {
                                if (class175.field2765 != 0) {
                                    try {
                                        class123 var8 = new class123(4);
                                        var8.method2384(4);
                                        var8.method2384(class175.field2765);
                                        var8.method2385(0);
                                        Statics.field2756.method2859(var8.field2053, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2756.method2860();
                                        } catch (Exception var12) {
                                        }
                                        class175.field2767++;
                                        Statics.field2756 = null;
                                    }
                                }
                                class175.field2750 = 0;
                                Statics.field2751 = class119.method137();
                                Statics.field2167 = null;
                                Statics.field3046 = null;
                                field310 = 0;
                                field316 = 0;
                                return;
                            }
                            class175.field2759.method3711(var7);
                            class175.field2757.method3606(var7, var7.field3167);
                            class175.field2770++;
                            class175.field2758--;
                        }
                    }
                    class175.field2752.method3606(var6, var6.field3167);
                    class175.field2749++;
                    class175.field2755--;
                }
            }
        } catch (IOException var15) {
            this.method456(-3);
        }
    }

    @ObfuscatedName("client.u(IB)V")
    public void method456(int arg0) {
        Statics.field2167 = null;
        Statics.field3046 = null;
        field310 = 0;
        if (Statics.field674 == Statics.field2014) {
            Statics.field2014 = Statics.field782;
        } else {
            Statics.field2014 = Statics.field674;
        }
        field316++;
        if (field316 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field289 <= 5) {
                this.method2892("js5connect_full");
                field289 = 1000;
            } else {
                field311 = 3000;
            }
        } else if (field316 >= 2 && arg0 == 6) {
            this.method2892("js5connect_outofdate");
            field289 = 1000;
        } else if (field316 >= 4) {
            if (field289 <= 5) {
                this.method2892("js5connect");
                field289 = 1000;
            } else {
                field311 = 3000;
            }
        }
    }

    @ObfuscatedName("az.d(IZZZS)Lfu;")
    public static class172 method871(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2282 != null) {
            var4 = new class138(arg0, class153.field2282, Statics.field607[arg0], 1000000);
        }
        return new class172(var4, Statics.field1229, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fo.o(I)V")
    public static final void method2999() {
        try {
            if (field557 == 0) {
                if (Statics.field605 != null) {
                    Statics.field605.method2860();
                    Statics.field605 = null;
                }
                Statics.field680 = null;
                field337 = false;
                field318 = 0;
                field557 = 1;
            }
            if (field557 == 1) {
                if (Statics.field680 == null) {
                    Statics.field680 = Statics.field1147.method2767(Statics.field648, Statics.field2014);
                }
                if (Statics.field680.field2263 == 2) {
                    throw new IOException();
                }
                if (Statics.field680.field2263 == 1) {
                    Statics.field605 = new class147((Socket) Statics.field680.field2267, Statics.field1147);
                    Statics.field680 = null;
                    field557 = 2;
                }
            }
            if (field557 == 2) {
                field398.field2052 = 0;
                field398.method2384(14);
                Statics.field605.method2859(field398.field2053, 0, 1);
                field328.field2052 = 0;
                field557 = 3;
            }
            if (field557 == 3) {
                if (Statics.field15 != null) {
                    Statics.field15.method1203();
                }
                if (Statics.field2120 != null) {
                    Statics.field2120.method1203();
                }
                int var0 = Statics.field605.method2879();
                if (Statics.field15 != null) {
                    Statics.field15.method1203();
                }
                if (Statics.field2120 != null) {
                    Statics.field2120.method1203();
                }
                if (var0 != 0) {
                    method136(var0);
                    return;
                }
                field328.field2052 = 0;
                field557 = 5;
            }
            if (field557 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field398.field2052 = 0;
                field398.method2384(1);
                field398.method2384(class34.field727.method570());
                field398.method2387(var1[0]);
                field398.method2387(var1[1]);
                field398.method2387(var1[2]);
                field398.method2387(var1[3]);
                switch(class34.field727.field2635) {
                    case 0:
                        field398.field2052 += 8;
                        break;
                    case 1:
                    case 3:
                        field398.method2386(Statics.field1050);
                        field398.field2052 += 5;
                        break;
                    case 2:
                        field398.method2387((Integer) Statics.field233.field141.get(class167.method1582(class34.field758)));
                        field398.field2052 += 4;
                }
                field398.method2390(class34.field725);
                field398.method2420(class5.field70, class5.field68);
                field426.field2052 = 0;
                if (field289 == 40) {
                    field426.method2384(18);
                } else {
                    field426.method2384(16);
                }
                field426.method2385(0);
                int var2 = field426.field2052;
                field426.method2387(124);
                field426.method2393(field398.field2053, 0, field398.field2052);
                int var3 = field426.field2052;
                field426.method2390(class34.field758);
                field426.method2384((field494 ? 1 : 0) << 1 | (field287 ? 1 : 0));
                field426.method2385(Statics.field2297);
                field426.method2385(Statics.field1617);
                class126 var4 = field426;
                byte[] var5 = new byte[24];
                try {
                    class153.field2276.method3963(0L);
                    class153.field2276.method3980(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var31) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2393(var5, 0, 24);
                field426.method2390(Statics.field220);
                field426.method2387(Statics.field1402);
                class123 var9 = new class123(Statics.field13.method3004());
                Statics.field13.method3003(var9);
                field426.method2393(var9.field2053, 0, var9.field2053.length);
                field426.method2384(Statics.field789);
                field426.method2387(Statics.field17.field2717);
                field426.method2387(Statics.field590.field2717);
                field426.method2387(Statics.field313.field2717);
                field426.method2387(Statics.field1208.field2717);
                field426.method2387(Statics.field78.field2717);
                field426.method2387(Statics.field1268.field2717);
                field426.method2387(Statics.field1051.field2717);
                field426.method2387(Statics.field224.field2717);
                field426.method2387(Statics.field691.field2717);
                field426.method2387(Statics.field2114.field2717);
                field426.method2387(Statics.field227.field2717);
                field426.method2387(Statics.field586.field2717);
                field426.method2387(Statics.field532.field2717);
                field426.method2387(Statics.field2302.field2717);
                field426.method2387(Statics.field2695.field2717);
                field426.method2387(Statics.field315.field2717);
                field426.method2411(var1, var3, field426.field2052);
                field426.method2395(field426.field2052 - var2);
                Statics.field605.method2859(field426.field2053, 0, field426.field2052);
                field398.method2633(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field328.method2633(var1);
                field557 = 6;
            }
            if (field557 == 6 && Statics.field605.method2863() > 0) {
                int var11 = Statics.field605.method2879();
                if (var11 == 21 && field289 == 20) {
                    field557 = 7;
                } else if (var11 == 2) {
                    field557 = 9;
                } else if (var11 == 15 && field289 == 40) {
                    field329 = -1;
                    field557 = 13;
                } else if (var11 == 23 && field319 < 1) {
                    field319++;
                    field557 = 0;
                } else if (var11 == 29) {
                    field557 = 11;
                } else {
                    method136(var11);
                    return;
                }
            }
            if (field557 == 7 && Statics.field605.method2863() > 0) {
                field430 = (Statics.field605.method2879() + 3) * 60;
                field557 = 8;
            }
            if (field557 == 8) {
                field318 = 0;
                class34.method1253(class161.field2385, class161.field2528, field430 / 60 + class161.field2492);
                if (--field430 <= 0) {
                    field557 = 0;
                }
            } else {
                if (field557 == 9 && Statics.field605.method2863() >= 13) {
                    boolean var12 = Statics.field605.method2879() == 1;
                    Statics.field605.method2864(field328.field2053, 0, 4);
                    field328.field2052 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field328.method2648() << 24;
                        int var15 = var14 | field328.method2648() << 16;
                        int var16 = var15 | field328.method2648() << 8;
                        int var17 = var16 | field328.method2648();
                        int var18 = class167.method1582(class34.field758);
                        if (Statics.field233.field141.size() >= 10 && !Statics.field233.field141.containsKey(var18)) {
                            Iterator var19 = Statics.field233.field141.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field233.field141.put(var18, var17);
                        class9.method188();
                    }
                    field447 = Statics.field605.method2879();
                    field449 = Statics.field605.method2879() == 1;
                    field376 = Statics.field605.method2879();
                    field376 <<= 0x8;
                    field376 += Statics.field605.method2879();
                    field405 = Statics.field605.method2879();
                    Statics.field605.method2864(field328.field2053, 0, 1);
                    field328.field2052 = 0;
                    field530 = field328.method2648();
                    Statics.field605.method2864(field328.field2053, 0, 2);
                    field328.field2052 = 0;
                    field329 = field328.method2401();
                    try {
                        class136.method2719(Statics.field443, "zap");
                    } catch (Throwable var30) {
                    }
                    field557 = 10;
                }
                if (field557 != 10) {
                    if (field557 == 11 && Statics.field605.method2863() >= 2) {
                        field328.field2052 = 0;
                        Statics.field605.method2864(field328.field2053, 0, 2);
                        field328.field2052 = 0;
                        Statics.field3101 = field328.method2401();
                        field557 = 12;
                    }
                    if (field557 == 12 && Statics.field605.method2863() >= Statics.field3101) {
                        field328.field2052 = 0;
                        Statics.field605.method2864(field328.field2053, 0, Statics.field3101);
                        field328.field2052 = 0;
                        String var21 = field328.method2407();
                        String var22 = field328.method2407();
                        String var23 = field328.method2407();
                        class34.method1253(var21, var22, var23);
                        method919(10);
                    }
                    if (field557 == 13) {
                        if (field329 == -1) {
                            if (Statics.field605.method2863() < 2) {
                                return;
                            }
                            Statics.field605.method2864(field328.field2053, 0, 2);
                            field328.field2052 = 0;
                            field329 = field328.method2401();
                        }
                        if (Statics.field605.method2863() >= field329) {
                            Statics.field605.method2864(field328.field2053, 0, field329);
                            field328.field2052 = 0;
                            int var24 = field329;
                            field398.field2052 = 0;
                            field328.field2052 = 0;
                            field530 = -1;
                            field327 = -1;
                            field334 = -1;
                            field290 = -1;
                            field329 = 0;
                            field331 = 0;
                            field458 = 0;
                            field422 = 0;
                            field421 = false;
                            field370 = 0;
                            field432 = 0;
                            for (int var25 = 0; var25 < 2048; var25++) {
                                field332[var25] = null;
                            }
                            Statics.field767 = null;
                            for (int var26 = 0; var26 < field283.length; var26++) {
                                class37 var27 = field283[var26];
                                if (var27 != null) {
                                    var27.field846 = -1;
                                    var27.field878 = false;
                                }
                            }
                            class16.method2958();
                            method919(30);
                            for (int var28 = 0; var28 < 100; var28++) {
                                field527[var28] = true;
                            }
                            method153();
                            class35.method599(field328);
                            if (field328.field2052 != var24) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field318++;
                        if (field318 > 2000) {
                            if (field319 < 1) {
                                if (Statics.field674 == Statics.field2014) {
                                    Statics.field2014 = Statics.field782;
                                } else {
                                    Statics.field2014 = Statics.field674;
                                }
                                field319++;
                                field557 = 0;
                            } else {
                                method136(-3);
                            }
                        }
                    }
                } else if (Statics.field605.method2863() >= field329) {
                    field328.field2052 = 0;
                    Statics.field605.method2864(field328.field2053, 0, field329);
                    method609();
                    class35.method599(field328);
                    Statics.field1738 = -1;
                    method2695(false);
                    field530 = -1;
                }
            }
        } catch (IOException var32) {
            if (field319 < 1) {
                if (Statics.field674 == Statics.field2014) {
                    Statics.field2014 = Statics.field782;
                } else {
                    Statics.field2014 = Statics.field674;
                }
                field319++;
                field557 = 0;
            } else {
                method136(-2);
            }
        }
    }

    @ObfuscatedName("aj.j(B)V")
    public static void method609() {
        field292 = -1L;
        field284 = -1;
        Statics.field3214.field192 = 0;
        Statics.field666 = true;
        field410 = true;
        field506 = -1L;
        class215.method49();
        field398.field2052 = 0;
        field328.field2052 = 0;
        field530 = -1;
        field327 = -1;
        field334 = -1;
        field290 = -1;
        field331 = 0;
        field458 = 0;
        field336 = 0;
        field299 = 0;
        field422 = 0;
        field421 = false;
        class144.method2743(0);
        class12.field172.clear();
        class12.field168.method3627();
        class12.field175.method3677();
        class12.field170 = 0;
        field433 = 0;
        field435 = false;
        field364 = 0;
        field347 = (int) (Math.random() * 100.0D) - 50;
        field349 = (int) (Math.random() * 110.0D) - 55;
        field351 = (int) (Math.random() * 80.0D) - 40;
        field309 = (int) (Math.random() * 120.0D) - 60;
        field499 = (int) (Math.random() * 30.0D) - 20;
        field367 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field370 = 0;
        field431 = -1;
        field432 = 0;
        field515 = 0;
        field511 = class22.field579;
        field321 = class22.field579;
        field322 = 0;
        class35.method142();
        for (int var0 = 0; var0 < 2048; var0++) {
            field332[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field283[var1] = null;
        }
        field472 = -1;
        field415.method3641();
        field416.method3641();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field413[var2][var3][var4] = null;
                }
            }
        }
        field414 = new class203();
        field495 = 0;
        field298 = 0;
        field295 = 0;
        for (int var5 = 0; var5 < Statics.field1212; var5++) {
            class57 var6 = class57.method1845(var5);
            if (var6 != null) {
                class180.field2940[var5] = 0;
                class180.field2941[var5] = 0;
            }
        }
        Statics.field2087.method194();
        field448 = -1;
        if (field302 != -1) {
            int var7 = field302;
            if (var7 != -1 && Statics.field2892[var7]) {
                Statics.field2781.method3099(var7);
                if (Statics.field2910[var7] != null) {
                    boolean var8 = true;
                    for (int var9 = 0; var9 < Statics.field2910[var7].length; var9++) {
                        if (Statics.field2910[var7][var9] != null) {
                            if (Statics.field2910[var7][var9].field2840 == 2) {
                                var8 = false;
                            } else {
                                Statics.field2910[var7][var9] = null;
                            }
                        }
                    }
                    if (var8) {
                        Statics.field2910[var7] = null;
                    }
                    Statics.field2892[var7] = false;
                }
            }
        }
        for (class4 var10 = (class4) field441.method3608(); var10 != null; var10 = (class4) field441.method3613()) {
            method34(var10, true);
        }
        field302 = -1;
        field441 = new class200(8);
        field444 = null;
        field421 = false;
        field422 = 0;
        field306.method3365((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var11 = 0; var11 < 8; var11++) {
            field409[var11] = null;
            field369[var11] = false;
        }
        class16.method2958();
        field528 = true;
        for (int var12 = 0; var12 < 100; var12++) {
            field527[var12] = true;
        }
        method153();
        field507 = null;
        Statics.field225 = 0;
        Statics.field1683 = null;
        for (int var13 = 0; var13 < 8; var13++) {
            field556[var13] = new class224();
        }
        Statics.field194 = null;
    }

    @ObfuscatedName("h.q(IB)V")
    public static void method136(int arg0) {
        if (arg0 == -3) {
            class34.method1253(class161.field2388, class161.field2389, class161.field2390);
        } else if (arg0 == -2) {
            class34.method1253(class161.field2609, class161.field2392, class161.field2378);
        } else if (arg0 == -1) {
            class34.method1253(class161.field2394, class161.field2395, class161.field2519);
        } else if (arg0 == 3) {
            class34.field744 = 3;
        } else if (arg0 == 4) {
            class34.method1253(class161.field2574, class161.field2399, class161.field2365);
        } else if (arg0 == 5) {
            class34.method1253(class161.field2397, class161.field2401, class161.field2402);
        } else if (arg0 == 6) {
            class34.method1253(class161.field2403, class161.field2516, class161.field2546);
        } else if (arg0 == 7) {
            class34.method1253(class161.field2406, class161.field2407, class161.field2408);
        } else if (arg0 == 8) {
            class34.method1253(class161.field2511, class161.field2410, class161.field2411);
        } else if (arg0 == 9) {
            class34.method1253(class161.field2619, class161.field2413, class161.field2467);
        } else if (arg0 == 10) {
            class34.method1253(class161.field2415, class161.field2416, class161.field2417);
        } else if (arg0 == 11) {
            class34.method1253(class161.field2418, class161.field2430, class161.field2532);
        } else if (arg0 == 12) {
            class34.method1253(class161.field2614, class161.field2611, class161.field2566);
        } else if (arg0 == 13) {
            class34.method1253(class161.field2354, class161.field2425, class161.field2426);
        } else if (arg0 == 14) {
            class34.method1253(class161.field2443, class161.field2428, class161.field2487);
        } else if (arg0 == 16) {
            class34.method1253(class161.field2589, class161.field2431, class161.field2432);
        } else if (arg0 == 17) {
            class34.method1253(class161.field2433, class161.field2622, class161.field2435);
        } else if (arg0 == 18) {
            class34.method1253(class161.field2436, class161.field2465, class161.field2438);
        } else if (arg0 == 19) {
            class34.method1253(class161.field2439, class161.field2499, class161.field2441);
        } else if (arg0 == 20) {
            class34.method1253(class161.field2442, class161.field2585, class161.field2362);
        } else if (arg0 == 22) {
            class34.method1253(class161.field2445, class161.field2386, class161.field2447);
        } else if (arg0 == 23) {
            class34.method1253(class161.field2448, class161.field2449, class161.field2450);
        } else if (arg0 == 24) {
            class34.method1253(class161.field2627, class161.field2452, class161.field2570);
        } else if (arg0 == 25) {
            class34.method1253(class161.field2453, class161.field2455, class161.field2456);
        } else if (arg0 == 26) {
            class34.method1253(class161.field2457, class161.field2458, class161.field2459);
        } else if (arg0 == 27) {
            class34.method1253(class161.field2460, class161.field2461, class161.field2444);
        } else if (arg0 == 31) {
            class34.method1253(class161.field2382, class161.field2470, class161.field2387);
        } else if (arg0 == 32) {
            class34.method1253(class161.field2472, class161.field2437, class161.field2474);
        } else if (arg0 == 37) {
            class34.method1253(class161.field2475, class161.field2476, class161.field2477);
        } else if (arg0 == 38) {
            class34.method1253(class161.field2478, class161.field2479, class161.field2480);
        } else if (arg0 == 55) {
            class34.method1253(class161.field2481, class161.field2357, class161.field2483);
        } else if (arg0 == 56) {
            class34.method1253(class161.field2484, class161.field2485, class161.field2486);
            method919(11);
            return;
        } else if (arg0 == 57) {
            class34.method1253(class161.field2446, class161.field2488, class161.field2593);
            method919(11);
            return;
        } else {
            class34.method1253(class161.field2490, class161.field2491, class161.field2531);
        }
        method919(10);
    }

    @ObfuscatedName("b.r(B)V")
    public static final void method77() {
        if (Statics.field605 != null) {
            Statics.field605.method2860();
            Statics.field605 = null;
        }
        method1655();
        Statics.field152.method1856();
        for (int var0 = 0; var0 < 4; var0++) {
            field343[var0].method2300();
        }
        System.gc();
        class187.method141(2);
        field518 = -1;
        field471 = false;
        class25.method569();
        method919(10);
    }

    @ObfuscatedName("cd.a(I)V")
    public static final void method1655() {
        class49.method737();
        class44.method745();
        Statics.method2673();
        class43.field924.method3572();
        class43.field925.method3572();
        class43.field961.method3572();
        class43.field927.method3572();
        class42.method138();
        class56.method2345();
        class45.method175();
        class46.method3289();
        class51.method2323();
        class57.method2317();
        class52.field1101.method3572();
        class52.field1120.method3572();
        class52.field1116.method3572();
        class50.field1087.method3572();
        class50.field1074.method3572();
        class183.field2963.method3572();
        class177.field2803.method3572();
        class177.field2784.method3572();
        class177.field2886.method3572();
        class177.field2786.method3572();
        ((class99) Statics.field1643).method2099();
        class24.field610.method3572();
        Statics.field17.method3100();
        Statics.field590.method3100();
        Statics.field1208.method3100();
        Statics.field78.method3100();
        Statics.field1268.method3100();
        Statics.field1051.method3100();
        Statics.field224.method3100();
        Statics.field691.method3100();
        Statics.field2114.method3100();
        Statics.field227.method3100();
        Statics.field586.method3100();
        Statics.field532.method3100();
    }

    @ObfuscatedName("ba.z(S)V")
    public static final void method1139() {
        if (field336 > 0) {
            method77();
        } else {
            method919(40);
            Statics.field2020 = Statics.field605;
            Statics.field605 = null;
        }
    }

    @ObfuscatedName("be.p(I)V")
    public static final void method1545() {
        if (field458 > 1) {
            field458--;
        }
        if (field336 > 0) {
            field336--;
        }
        if (field337) {
            field337 = false;
            method1139();
            return;
        }
        if (!field421) {
            field427[0] = class161.field2375;
            field428[0] = "";
            field425[0] = 1006;
            field422 = 1;
        }
        for (int var0 = 0; var0 < 100 && method12(); var0++) {
        }
        if (field289 != 30) {
            return;
        }
        while (true) {
            class214 var1 = (class214) class215.field3178.method3688();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field3214.field200;
                synchronized (Statics.field3214.field200) {
                    if (!field281) {
                        Statics.field3214.field192 = 0;
                    } else if (class144.field2199 != 0 || Statics.field3214.field192 >= 40) {
                        field398.method2634(149);
                        field398.method2384(0);
                        int var5 = field398.field2052;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field3214.field192 && field398.field2052 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field3214.field190[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field3214.field195[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field3214.field190[var7] == -1 && Statics.field3214.field195[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field293 != var9 || field294 != var8) {
                                int var11 = var9 - field293;
                                field293 = var9;
                                int var12 = var8 - field294;
                                field294 = var8;
                                if (field284 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field398.method2385((field284 << 12) + (var11 << 6) + var12);
                                    field284 = 0;
                                } else if (field284 < 8) {
                                    field398.method2386((field284 << 19) + 8388608 + var10);
                                    field284 = 0;
                                } else {
                                    field398.method2387((field284 << 19) + -1073741824 + var10);
                                    field284 = 0;
                                }
                            } else if (field284 < 2047) {
                                field284++;
                            }
                        }
                        field398.method2396(field398.field2052 - var5);
                        if (var6 >= Statics.field3214.field192) {
                            Statics.field3214.field192 = 0;
                        } else {
                            Statics.field3214.field192 -= var6;
                            for (int var13 = 0; var13 < Statics.field3214.field192; var13++) {
                                Statics.field3214.field195[var13] = Statics.field3214.field195[var6 + var13];
                                Statics.field3214.field190[var13] = Statics.field3214.field190[var6 + var13];
                            }
                        }
                    }
                }
                if (class144.field2199 == 1 || !Statics.field277 && class144.field2199 == 4 || class144.field2199 == 2) {
                    long var15 = (class144.field2196 - field292) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field292 = class144.field2196;
                    int var17 = class144.field2208;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field1617) {
                        var17 = Statics.field1617;
                    }
                    int var18 = class144.field2198;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field2297) {
                        var18 = Statics.field2297;
                    }
                    int var19 = (int) var15;
                    field398.method2634(123);
                    field398.method2385((var19 << 1) + (class144.field2199 == 2 ? 1 : 0));
                    field398.method2385(var18);
                    field398.method2385(var17);
                }
                if (class141.field2173 > 0) {
                    field398.method2634(90);
                    field398.method2385(0);
                    int var20 = field398.field2052;
                    long var21 = class119.method137();
                    for (int var23 = 0; var23 < class141.field2173; var23++) {
                        long var24 = var21 - field506;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field506 = var21;
                        field398.method2424(class141.field2172[var23]);
                        field398.method2438((int) var24);
                    }
                    field398.method2395(field398.field2052 - var20);
                }
                if (field373 > 0) {
                    field373--;
                }
                if (class141.field2154[96] || class141.field2154[97] || class141.field2154[98] || class141.field2154[99]) {
                    field374 = true;
                }
                if (field374 && field373 <= 0) {
                    field373 = 20;
                    field374 = false;
                    field398.method2634(113);
                    field398.method2385(field367);
                    field398.method2385(field366);
                }
                if (Statics.field666 && !field410) {
                    field410 = true;
                    field398.method2634(69);
                    field398.method2384(1);
                }
                if (!Statics.field666 && field410) {
                    field410 = false;
                    field398.method2634(69);
                    field398.method2384(0);
                }
                method52();
                if (field289 != 30) {
                    return;
                }
                for (class17 var26 = (class17) field414.method3646(); var26 != null; var26 = (class17) field414.method3648()) {
                    if (var26.field239 > 0) {
                        var26.field239--;
                    }
                    if (var26.field239 != 0) {
                        if (var26.field238 > 0) {
                            var26.field238--;
                        }
                        if (var26.field238 == 0 && var26.field230 >= 1 && var26.field231 >= 1 && var26.field230 <= 102 && var26.field231 <= 102 && (var26.field229 < 0 || class6.method1598(var26.field229, var26.field237))) {
                            method2092(var26.field235, var26.field232, var26.field230, var26.field231, var26.field229, var26.field240, var26.field237);
                            var26.field238 = -1;
                            if (var26.field236 == var26.field229 && var26.field236 == -1) {
                                var26.method3744();
                            } else if (var26.field236 == var26.field229 && var26.field240 == var26.field228 && var26.field237 == var26.field234) {
                                var26.method3744();
                            }
                        }
                    } else if (var26.field236 < 0 || class6.method1598(var26.field236, var26.field234)) {
                        method2092(var26.field235, var26.field232, var26.field230, var26.field231, var26.field236, var26.field228, var26.field234);
                        var26.method3744();
                    }
                }
                method1831();
                field331++;
                if (field331 > 750) {
                    method1139();
                    return;
                }
                method47();
                for (int var27 = 0; var27 < field322; var27++) {
                    int var28 = field406[var27];
                    class37 var29 = field283[var28];
                    if (var29 != null) {
                        method2693(var29, var29.field787.field895);
                    }
                }
                method1653();
                field359++;
                if (field393 != 0) {
                    field392 += 20;
                    if (field392 >= 400) {
                        field393 = 0;
                    }
                }
                if (Statics.field1440 != null) {
                    field552++;
                    if (field552 >= 15) {
                        method733(Statics.field1440);
                        Statics.field1440 = null;
                    }
                }
                class177 var30 = Statics.field1974;
                class177 var31 = Statics.field1673;
                Statics.field1974 = null;
                Statics.field1673 = null;
                field371 = null;
                field509 = false;
                field397 = false;
                field503 = 0;
                while (class141.method3786() && field503 < 128) {
                    if (field447 >= 2 && class141.field2154[82] && Statics.field2162 == 66) {
                        String var32 = "";
                        Iterator var33 = class12.field168.iterator();
                        while (var33.hasNext()) {
                            class38 var34 = (class38) var33.next();
                            var32 = var32 + var34.field791 + ':' + var34.field796 + '\n';
                        }
                        Statics.field145.setContents(new StringSelection(var32), (ClipboardOwner) null);
                    } else {
                        field505[field503] = Statics.field2162;
                        field504[field503] = Statics.field2164;
                        field503++;
                    }
                }
                if (field302 != -1) {
                    int var37 = field302;
                    int var38 = Statics.field2297;
                    int var39 = Statics.field1617;
                    if (class177.method3200(var37)) {
                        method646(Statics.field2910[var37], -1, 0, 0, var38, var39, 0, 0);
                    }
                }
                field296++;
                while (true) {
                    class1 var40;
                    class177 var41;
                    class177 var42;
                    do {
                        var40 = (class1) field480.method3660();
                        if (var40 == null) {
                            while (true) {
                                class1 var43;
                                class177 var44;
                                class177 var45;
                                do {
                                    var43 = (class1) field335.method3660();
                                    if (var43 == null) {
                                        while (true) {
                                            class1 var46;
                                            class177 var47;
                                            class177 var48;
                                            do {
                                                var46 = (class1) field380.method3660();
                                                if (var46 == null) {
                                                    method914();
                                                    if (field453 != null) {
                                                        method733(field453);
                                                        Statics.field2257++;
                                                        if (field509 && field397) {
                                                            int var49 = class144.field2193;
                                                            int var50 = class144.field2200;
                                                            int var51 = var49 - field522;
                                                            int var52 = var50 - field456;
                                                            if (var51 < field401) {
                                                                var51 = field401;
                                                            }
                                                            if (field453.field2804 + var51 > field401 + field454.field2804) {
                                                                var51 = field401 + field454.field2804 - field453.field2804;
                                                            }
                                                            if (var52 < field460) {
                                                                var52 = field460;
                                                            }
                                                            if (field453.field2906 + var52 > field460 + field454.field2906) {
                                                                var52 = field460 + field454.field2906 - field453.field2906;
                                                            }
                                                            int var53 = var51 - field462;
                                                            int var54 = var52 - field463;
                                                            int var55 = field453.field2865;
                                                            if (Statics.field2257 > field453.field2917 && (var53 > var55 || var53 < -var55 || var54 > var55 || var54 < -var55)) {
                                                                field464 = true;
                                                            }
                                                            int var56 = field454.field2810 + (var51 - field401);
                                                            int var57 = field454.field2909 + (var52 - field460);
                                                            if (field453.field2782 != null && field464) {
                                                                class1 var58 = new class1();
                                                                var58.field3 = field453;
                                                                var58.field4 = var56;
                                                                var58.field6 = var57;
                                                                var58.field2 = field453.field2782;
                                                                class39.method2320(var58);
                                                            }
                                                            if (class144.field2206 == 0) {
                                                                if (field464) {
                                                                    if (field453.field2879 != null) {
                                                                        class1 var59 = new class1();
                                                                        var59.field3 = field453;
                                                                        var59.field4 = var56;
                                                                        var59.field6 = var57;
                                                                        var59.field7 = field371;
                                                                        var59.field2 = field453.field2879;
                                                                        class39.method2320(var59);
                                                                    }
                                                                    if (field371 != null) {
                                                                        class177 var60 = field453;
                                                                        int var61 = class182.method972(method2021(var60));
                                                                        class177 var62;
                                                                        if (var61 == 0) {
                                                                            var62 = null;
                                                                        } else {
                                                                            int var63 = 0;
                                                                            while (true) {
                                                                                if (var63 >= var61) {
                                                                                    var62 = var60;
                                                                                    break;
                                                                                }
                                                                                var60 = class177.method2979(var60.field2808);
                                                                                if (var60 == null) {
                                                                                    var62 = null;
                                                                                    break;
                                                                                }
                                                                                var63++;
                                                                            }
                                                                        }
                                                                        if (var62 != null) {
                                                                            field398.method2634(161);
                                                                            field398.method2441(field371.field2789);
                                                                            field398.method2385(field453.field2790);
                                                                            field398.method2442(field453.field2789);
                                                                            field398.method2382(field371.field2790);
                                                                            field398.method2385(field453.field2839);
                                                                            field398.method2433(field371.field2839);
                                                                        }
                                                                    }
                                                                } else if ((field420 == 1 || method13(field422 - 1)) && field422 > 2) {
                                                                    method87(field522 + field462, field463 + field456);
                                                                } else if (field422 > 0) {
                                                                    int var64 = field522 + field462;
                                                                    int var65 = field463 + field456;
                                                                    method2669(Statics.field604, var64, var65);
                                                                    Statics.field604 = null;
                                                                }
                                                                field453 = null;
                                                            }
                                                        } else if (Statics.field2257 > 1) {
                                                            field453 = null;
                                                        }
                                                    }
                                                    if (Statics.field125 != null) {
                                                        method733(Statics.field125);
                                                        field403++;
                                                        if (class144.field2206 == 0) {
                                                            if (field400) {
                                                                if (Statics.field788 == Statics.field125 && field399 != field396) {
                                                                    class177 var66 = Statics.field125;
                                                                    byte var67 = 0;
                                                                    if (field550 == 1 && var66.field2793 == 206) {
                                                                        var67 = 1;
                                                                    }
                                                                    if (var66.field2868[field399] <= 0) {
                                                                        var67 = 0;
                                                                    }
                                                                    if (class182.method226(method2021(var66))) {
                                                                        int var68 = field396;
                                                                        int var69 = field399;
                                                                        var66.field2868[var69] = var66.field2868[var68];
                                                                        var66.field2908[var69] = var66.field2908[var68];
                                                                        var66.field2868[var68] = -1;
                                                                        var66.field2908[var68] = 0;
                                                                    } else if (var67 == 1) {
                                                                        int var70 = field396;
                                                                        int var71 = field399;
                                                                        while (var70 != var71) {
                                                                            if (var70 > var71) {
                                                                                var66.method3238(var70 - 1, var70);
                                                                                var70--;
                                                                            } else if (var70 < var71) {
                                                                                var66.method3238(var70 + 1, var70);
                                                                                var70++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var66.method3238(field399, field396);
                                                                    }
                                                                    field398.method2634(143);
                                                                    field398.method2387(Statics.field125.field2789);
                                                                    field398.method2382(field396);
                                                                    field398.method2385(field399);
                                                                    field398.method2384(var67);
                                                                }
                                                            } else if ((field420 == 1 || method13(field422 - 1)) && field422 > 2) {
                                                                method87(field394, field418);
                                                            } else if (field422 > 0) {
                                                                int var72 = field394;
                                                                int var73 = field418;
                                                                method2669(Statics.field604, var72, var73);
                                                                Statics.field604 = null;
                                                            }
                                                            field552 = 10;
                                                            class144.field2199 = 0;
                                                            Statics.field125 = null;
                                                        } else if (field403 >= 5 && (class144.field2193 > field394 + 5 || class144.field2193 < field394 - 5 || class144.field2200 > field418 + 5 || class144.field2200 < field418 - 5)) {
                                                            field400 = true;
                                                        }
                                                    }
                                                    if (class90.field1555 != -1) {
                                                        int var74 = class90.field1555;
                                                        int var75 = class90.field1556;
                                                        field398.method2634(102);
                                                        field398.method2384(5);
                                                        field398.method2425(class141.field2154[82] ? (class141.field2154[81] ? 2 : 1) : 0);
                                                        field398.method2433(Statics.field713 + var74);
                                                        field398.method2382(Statics.field138 + var75);
                                                        class90.field1555 = -1;
                                                        field390 = class144.field2198;
                                                        field391 = class144.field2208;
                                                        field393 = 1;
                                                        field392 = 0;
                                                        field432 = var74;
                                                        field515 = var75;
                                                    }
                                                    if (Statics.field1974 != var30) {
                                                        if (var30 != null) {
                                                            method733(var30);
                                                        }
                                                        if (Statics.field1974 != null) {
                                                            method733(Statics.field1974);
                                                        }
                                                    }
                                                    if (Statics.field1673 != var31 && field459 == field404) {
                                                        if (var31 != null) {
                                                            method733(var31);
                                                        }
                                                        if (Statics.field1673 != null) {
                                                            method733(Statics.field1673);
                                                        }
                                                    }
                                                    if (Statics.field1673 == null) {
                                                        if (field459 > 0) {
                                                            field459--;
                                                        }
                                                    } else if (field459 < field404) {
                                                        field459++;
                                                        if (field459 == field404) {
                                                            method733(Statics.field1673);
                                                        }
                                                    }
                                                    int var76 = field347 + Statics.field767.field864;
                                                    int var77 = field349 + Statics.field767.field818;
                                                    if (Statics.field1684 - var76 < -500 || Statics.field1684 - var76 > 500 || Statics.field265 - var77 < -500 || Statics.field265 - var77 > 500) {
                                                        Statics.field1684 = var76;
                                                        Statics.field265 = var77;
                                                    }
                                                    if (Statics.field1684 != var76) {
                                                        Statics.field1684 += (var76 - Statics.field1684) / 16;
                                                    }
                                                    if (Statics.field265 != var77) {
                                                        Statics.field265 += (var77 - Statics.field265) / 16;
                                                    }
                                                    if (class144.field2206 == 4 && Statics.field277) {
                                                        int var78 = class144.field2200 - field307;
                                                        field477 = var78 * 2;
                                                        field307 = var78 == -1 || var78 == 1 ? class144.field2200 : (field307 + class144.field2200) / 2;
                                                        int var79 = field323 - class144.field2193;
                                                        field368 = var79 * 2;
                                                        field323 = var79 == -1 || var79 == 1 ? class144.field2193 : (field323 + class144.field2193) / 2;
                                                    } else {
                                                        if (class141.field2154[96]) {
                                                            field368 += (-24 - field368) / 2;
                                                        } else if (class141.field2154[97]) {
                                                            field368 += (24 - field368) / 2;
                                                        } else {
                                                            field368 /= 2;
                                                        }
                                                        if (class141.field2154[98]) {
                                                            field477 += (12 - field477) / 2;
                                                        } else if (class141.field2154[99]) {
                                                            field477 += (-12 - field477) / 2;
                                                        } else {
                                                            field477 /= 2;
                                                        }
                                                        field307 = class144.field2200;
                                                        field323 = class144.field2193;
                                                    }
                                                    field367 = field368 / 2 + field367 & 0x7FF;
                                                    field366 += field477 / 2;
                                                    if (field366 < 128) {
                                                        field366 = 128;
                                                    }
                                                    if (field366 > 383) {
                                                        field366 = 383;
                                                    }
                                                    int var80 = Statics.field1684 >> 7;
                                                    int var81 = Statics.field265 >> 7;
                                                    int var82 = method1852(Statics.field1684, Statics.field265, Statics.field223);
                                                    int var83 = 0;
                                                    if (var80 > 3 && var81 > 3 && var80 < 100 && var81 < 100) {
                                                        for (int var84 = var80 - 4; var84 <= var80 + 4; var84++) {
                                                            for (int var85 = var81 - 4; var85 <= var81 + 4; var85++) {
                                                                int var86 = Statics.field223;
                                                                if (var86 < 3 && (class6.field83[1][var84][var85] & 0x2) == 2) {
                                                                    var86++;
                                                                }
                                                                int var87 = var82 - class6.field79[var86][var84][var85];
                                                                if (var87 > var83) {
                                                                    var83 = var87;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var88 = var83 * 192;
                                                    if (var88 > 98048) {
                                                        var88 = 98048;
                                                    }
                                                    if (var88 < 32768) {
                                                        var88 = 32768;
                                                    }
                                                    if (var88 > field375) {
                                                        field375 += (var88 - field375) / 24;
                                                    } else if (var88 < field375) {
                                                        field375 += (var88 - field375) / 80;
                                                    }
                                                    if (field563) {
                                                        method755();
                                                    }
                                                    for (int var89 = 0; var89 < 5; var89++) {
                                                        int var10002 = field533[var89]++;
                                                    }
                                                    Statics.field2087.method198();
                                                    int var90 = ++class144.field2194 - 1;
                                                    int var92 = class141.field2177;
                                                    if (var90 > 15000 && var92 > 15000) {
                                                        field336 = 250;
                                                        class144.field2194 = 14500;
                                                        field398.method2634(212);
                                                    }
                                                    field490++;
                                                    if (field490 > 500) {
                                                        field490 = 0;
                                                        int var94 = (int) (Math.random() * 8.0D);
                                                        if ((var94 & 0x1) == 1) {
                                                            field347 += field348;
                                                        }
                                                        if ((var94 & 0x2) == 2) {
                                                            field349 += field350;
                                                        }
                                                        if ((var94 & 0x4) == 4) {
                                                            field351 += field352;
                                                        }
                                                    }
                                                    if (field347 < -50) {
                                                        field348 = 2;
                                                    }
                                                    if (field347 > 50) {
                                                        field348 = -2;
                                                    }
                                                    if (field349 < -55) {
                                                        field350 = 2;
                                                    }
                                                    if (field349 > 55) {
                                                        field350 = -2;
                                                    }
                                                    if (field351 < -40) {
                                                        field352 = 1;
                                                    }
                                                    if (field351 > 40) {
                                                        field352 = -1;
                                                    }
                                                    field482++;
                                                    if (field482 > 500) {
                                                        field482 = 0;
                                                        int var95 = (int) (Math.random() * 8.0D);
                                                        if ((var95 & 0x1) == 1) {
                                                            field309 += field355;
                                                        }
                                                        if ((var95 & 0x2) == 2) {
                                                            field499 += field357;
                                                        }
                                                    }
                                                    if (field309 < -60) {
                                                        field355 = 2;
                                                    }
                                                    if (field309 > 60) {
                                                        field355 = -2;
                                                    }
                                                    if (field499 < -20) {
                                                        field357 = 1;
                                                    }
                                                    if (field499 > 10) {
                                                        field357 = -1;
                                                    }
                                                    for (class41 var96 = (class41) field317.method3602(); var96 != null; var96 = (class41) field317.method3595()) {
                                                        if ((long) var96.field882 < class119.method137() / 1000L - 5L) {
                                                            if (var96.field879 > 0) {
                                                                class12.method3563(5, "", var96.field881 + class161.field2493);
                                                            }
                                                            if (var96.field879 == 0) {
                                                                class12.method3563(5, "", var96.field881 + class161.field2494);
                                                            }
                                                            var96.method3740();
                                                        }
                                                    }
                                                    field553++;
                                                    if (field553 > 50) {
                                                        field398.method2634(204);
                                                    }
                                                    try {
                                                        if (Statics.field605 != null && field398.field2052 > 0) {
                                                            Statics.field605.method2859(field398.field2053, 0, field398.field2052);
                                                            field398.field2052 = 0;
                                                            field553 = 0;
                                                        }
                                                    } catch (IOException var98) {
                                                        method1139();
                                                    }
                                                    return;
                                                }
                                                var47 = var46.field3;
                                                if (var47.field2790 < 0) {
                                                    break;
                                                }
                                                var48 = class177.method2979(var47.field2808);
                                            } while (var48 == null || var48.field2913 == null || var47.field2790 >= var48.field2913.length || var48.field2913[var47.field2790] != var47);
                                            class39.method2320(var46);
                                        }
                                    }
                                    var44 = var43.field3;
                                    if (var44.field2790 < 0) {
                                        break;
                                    }
                                    var45 = class177.method2979(var44.field2808);
                                } while (var45 == null || var45.field2913 == null || var44.field2790 >= var45.field2913.length || var45.field2913[var44.field2790] != var44);
                                class39.method2320(var43);
                            }
                        }
                        var41 = var40.field3;
                        if (var41.field2790 < 0) {
                            break;
                        }
                        var42 = class177.method2979(var41.field2808);
                    } while (var42 == null || var42.field2913 == null || var41.field2790 >= var42.field2913.length || var42.field2913[var41.field2790] != var41);
                    class39.method2320(var40);
                }
            }
            field398.method2634(4);
            field398.method2384(0);
            int var3 = field398.field2052;
            class215.method143(field398);
            field398.method2396(field398.field2052 - var3);
        }
    }

    @ObfuscatedName("ad.y(S)V")
    public static final void method992() {
        if (Statics.field2120 != null) {
            Statics.field2120.method1202();
        }
        if (Statics.field15 != null) {
            Statics.field15.method1202();
        }
    }

    @ObfuscatedName("cb.s(B)V")
    public static final void method1831() {
        for (int var0 = 0; var0 < field364; var0++) {
            int var10002 = field525[var0]--;
            if (field525[var0] >= -10) {
                class62 var2 = field314[var0];
                if (var2 == null) {
                    class62 var10000 = (class62) null;
                    var2 = class62.method1279(Statics.field78, field523[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field525[var0] += var2.method1267();
                    field314[var0] = var2;
                }
                if (field525[var0] < 0) {
                    int var9;
                    if (field526[var0] == 0) {
                        var9 = field520;
                    } else {
                        int var3 = (field526[var0] & 0xFF) * 128;
                        int var4 = field526[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field767.field864;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field526[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field767.field818;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field525[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field521 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class66 var10 = var2.method1268().method1311(Statics.field1235);
                        class68 var11 = class68.method1335(var10, 100, var9);
                        var11.method1361(field524[var0] - 1);
                        Statics.field60.method1164(var11);
                    }
                    field525[var0] = -100;
                }
            } else {
                field364--;
                for (int var1 = var0; var1 < field364; var1++) {
                    field523[var1] = field523[var1 + 1];
                    field314[var1] = field314[var1 + 1];
                    field524[var1] = field524[var1 + 1];
                    field525[var1] = field525[var1 + 1];
                    field526[var1] = field526[var1 + 1];
                }
                var0--;
            }
        }
        if (!field471) {
            return;
        }
        boolean var12;
        if (class187.field3006 == 0) {
            var12 = Statics.field671.method3458();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field517 != 0 && field518 != -1) {
                class187.method17(Statics.field1051, field518, 0, field517, false);
            }
            field471 = false;
        }
    }

    @ObfuscatedName("ft.g(Laz;IIII)V")
    public static void method3061(class45 arg0, int arg1, int arg2, int arg3) {
        if (field364 >= 50 || field521 == 0 || arg0.field996 == null || arg1 >= arg0.field996.length) {
            return;
        }
        int var4 = arg0.field996[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field523[field364] = var5;
        field524[field364] = var6;
        field525[field364] = 0;
        field314[field364] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field526[field364] = (var8 << 16) + (var9 << 8) + var7;
        field364++;
    }

    @ObfuscatedName("n.aj(IIIB)V")
    public static void method40(int arg0, int arg1, int arg2) {
        if (field520 == 0 || arg1 == 0 || field364 >= 50) {
            return;
        }
        field523[field364] = arg0;
        field524[field364] = arg1;
        field525[field364] = arg2;
        field314[field364] = null;
        field526[field364] = 0;
        field364++;
    }

    @ObfuscatedName("x.ay(II)V")
    public static void method155(int arg0) {
        if (arg0 == -1 && !field471) {
            class187.method2981();
        } else if (arg0 != -1 && field518 != arg0 && field517 != 0 && !field471) {
            class187.method3021(2, Statics.field1051, arg0, 0, field517, false);
        }
        field518 = arg0;
    }

    @ObfuscatedName("v.ah(I)V")
    public static final void method52() {
        if (Statics.field223 != field431) {
            field431 = Statics.field223;
            method3011(Statics.field223);
        }
    }

    @ObfuscatedName("d.ax(Lfe;III)V")
    public static final void method176(class177 arg0, int arg1, int arg2) {
        if (field370 != 0 && field370 != 3 || class144.field2199 != 1 && Statics.field277 || class144.field2199 != 4) {
            return;
        }
        class179 var3 = arg0.method3268(true);
        if (var3 == null) {
            return;
        }
        int var4 = class144.field2198 - arg1;
        int var5 = class144.field2208 - arg2;
        if (!var3.method3292(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2931 / 2;
        int var7 = var5 - var3.field2932 / 2;
        int var8 = field367 + field309 & 0x7FF;
        int var9 = class95.field1636[var8];
        int var10 = class95.field1647[var8];
        int var11 = (field499 + 256) * var9 >> 8;
        int var12 = (field499 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field767.field864 + var13 >> 7;
        int var16 = Statics.field767.field818 - var14 >> 7;
        field398.method2634(50);
        field398.method2384(18);
        field398.method2425(class141.field2154[82] ? (class141.field2154[81] ? 2 : 1) : 0);
        field398.method2433(Statics.field713 + var15);
        field398.method2382(Statics.field138 + var16);
        field398.method2384(var6);
        field398.method2384(var7);
        field398.method2385(field367);
        field398.method2384(57);
        field398.method2384(field309);
        field398.method2384(field499);
        field398.method2384(89);
        field398.method2385(Statics.field767.field864);
        field398.method2385(Statics.field767.field818);
        field398.method2384(63);
        field432 = var15;
        field515 = var16;
    }

    @ObfuscatedName("cd.ar(I)V")
    public static final void method1653() {
        int[] var0 = class35.field759;
        for (int var1 = 0; var1 < class35.field764; var1++) {
            class3 var2 = field332[var0[var1]];
            if (var2 != null && var2.field833 > 0) {
                var2.field833--;
                if (var2.field833 == 0) {
                    var2.field830 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field322; var3++) {
            int var4 = field406[var3];
            class37 var5 = field283[var4];
            if (var5 != null && var5.field833 > 0) {
                var5.field833--;
                if (var5.field833 == 0) {
                    var5.field830 = null;
                }
            }
        }
    }

    @ObfuscatedName("ao.ae(I)V")
    public static final void method755() {
        int var0 = Statics.field2951 * 128 + 64;
        int var1 = Statics.field2947 * 128 + 64;
        int var2 = method1852(var0, var1, Statics.field223) - Statics.field2094;
        if (Statics.field2151 < var0) {
            Statics.field2151 += Statics.field2954 * (var0 - Statics.field2151) / 1000 + Statics.field1448;
            if (Statics.field2151 > var0) {
                Statics.field2151 = var0;
            }
        }
        if (Statics.field2151 > var0) {
            Statics.field2151 -= Statics.field2954 * (Statics.field2151 - var0) / 1000 + Statics.field1448;
            if (Statics.field2151 < var0) {
                Statics.field2151 = var0;
            }
        }
        if (Statics.field2741 < var2) {
            Statics.field2741 += Statics.field2954 * (var2 - Statics.field2741) / 1000 + Statics.field1448;
            if (Statics.field2741 > var2) {
                Statics.field2741 = var2;
            }
        }
        if (Statics.field2741 > var2) {
            Statics.field2741 -= Statics.field2954 * (Statics.field2741 - var2) / 1000 + Statics.field1448;
            if (Statics.field2741 < var2) {
                Statics.field2741 = var2;
            }
        }
        if (Statics.field1417 < var1) {
            Statics.field1417 += Statics.field2954 * (var1 - Statics.field1417) / 1000 + Statics.field1448;
            if (Statics.field1417 > var1) {
                Statics.field1417 = var1;
            }
        }
        if (Statics.field1417 > var1) {
            Statics.field1417 -= Statics.field2954 * (Statics.field1417 - var1) / 1000 + Statics.field1448;
            if (Statics.field1417 < var1) {
                Statics.field1417 = var1;
            }
        }
        int var3 = Statics.field986 * 128 + 64;
        int var4 = Statics.field2012 * 128 + 64;
        int var5 = method1852(var3, var4, Statics.field223) - Statics.field2150;
        int var6 = var3 - Statics.field2151;
        int var7 = var5 - Statics.field2741;
        int var8 = var4 - Statics.field1417;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2218 < var10) {
            Statics.field2218 += Statics.field2122 * (var10 - Statics.field2218) / 1000 + Statics.field694;
            if (Statics.field2218 > var10) {
                Statics.field2218 = var10;
            }
        }
        if (Statics.field2218 > var10) {
            Statics.field2218 -= Statics.field2122 * (Statics.field2218 - var10) / 1000 + Statics.field694;
            if (Statics.field2218 < var10) {
                Statics.field2218 = var10;
            }
        }
        int var12 = var11 - Statics.field1834;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1834 += Statics.field2122 * var12 / 1000 + Statics.field694;
            Statics.field1834 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1834 -= Statics.field2122 * -var12 / 1000 + Statics.field694;
            Statics.field1834 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1834;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1834 = var11;
        }
    }

    @ObfuscatedName("t.ac(B)V")
    public static final void method47() {
        int var0 = class35.field764;
        int[] var1 = class35.field759;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field332[var1[var2]];
            if (var3 != null) {
                method2693(var3, 1);
            }
        }
    }

    @ObfuscatedName("df.aw(Lao;II)V")
    public static final void method2693(class40 arg0, int arg1) {
        if (arg0.field867 > field291) {
            int var2 = arg0.field867 - field291;
            int var3 = arg0.field859 * 128 + arg0.field843 * 64;
            int var4 = arg0.field843 * 64 + arg0.field841 * 128;
            arg0.field864 += (var3 - arg0.field864) / var2;
            arg0.field818 += (var4 - arg0.field818) / var2;
            arg0.field873 = 0;
            arg0.field874 = arg0.field865;
        } else if (arg0.field842 >= field291) {
            if (field291 == arg0.field842 || arg0.field849 == -1 || arg0.field852 != 0 || arg0.field851 + 1 > class45.method1289(arg0.field849).field995[arg0.field850]) {
                int var5 = arg0.field842 - arg0.field867;
                int var6 = field291 - arg0.field867;
                int var7 = arg0.field859 * 128 + arg0.field843 * 64;
                int var8 = arg0.field843 * 64 + arg0.field841 * 128;
                int var9 = arg0.field860 * 128 + arg0.field843 * 64;
                int var10 = arg0.field862 * 128 + arg0.field843 * 64;
                arg0.field864 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field818 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field873 = 0;
            arg0.field874 = arg0.field865;
            arg0.field819 = arg0.field874;
        } else {
            arg0.field857 = arg0.field822;
            if (arg0.field868 == 0) {
                arg0.field873 = 0;
            } else {
                label225: {
                    if (arg0.field849 != -1 && arg0.field852 == 0) {
                        class45 var11 = class45.method1289(arg0.field849);
                        if (arg0.field876 > 0 && var11.field1013 == 0) {
                            arg0.field873++;
                            break label225;
                        }
                        if (arg0.field876 <= 0 && var11.field998 == 0) {
                            arg0.field873++;
                            break label225;
                        }
                    }
                    int var12 = arg0.field864;
                    int var13 = arg0.field818;
                    int var14 = arg0.field872[arg0.field868 - 1] * 128 + arg0.field843 * 64;
                    int var15 = arg0.field837[arg0.field868 - 1] * 128 + arg0.field843 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field874 = 1280;
                        } else if (var13 > var15) {
                            arg0.field874 = 1792;
                        } else {
                            arg0.field874 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field874 = 768;
                        } else if (var13 > var15) {
                            arg0.field874 = 256;
                        } else {
                            arg0.field874 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field874 = 1024;
                    } else if (var13 > var15) {
                        arg0.field874 = 0;
                    }
                    byte var16 = arg0.field858[arg0.field868 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field874 - arg0.field819 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field826;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field825;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field828;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field827;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field825;
                        }
                        arg0.field857 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class37) {
                            var20 = ((class37) arg0).field787.field918;
                        }
                        if (var20) {
                            if (arg0.field874 != arg0.field819 && arg0.field846 == -1 && arg0.field870 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field868 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field868 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field873 > 0 && arg0.field868 > 1) {
                                var19 = 8;
                                arg0.field873--;
                            }
                        } else {
                            if (arg0.field868 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field868 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field873 > 0 && arg0.field868 > 1) {
                                var19 = 8;
                                arg0.field873--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field857 == arg0.field825 && arg0.field829 != -1) {
                            arg0.field857 = arg0.field829;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field864 += var19;
                                if (arg0.field864 > var14) {
                                    arg0.field864 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field864 -= var19;
                                if (arg0.field864 < var14) {
                                    arg0.field864 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field818 += var19;
                                if (arg0.field818 > var15) {
                                    arg0.field818 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field818 -= var19;
                                if (arg0.field818 < var15) {
                                    arg0.field818 = var15;
                                }
                            }
                        }
                        if (arg0.field864 == var14 && arg0.field818 == var15) {
                            arg0.field868--;
                            if (arg0.field876 > 0) {
                                arg0.field876--;
                            }
                        }
                    } else {
                        arg0.field864 = var14;
                        arg0.field818 = var15;
                        arg0.field868--;
                        if (arg0.field876 > 0) {
                            arg0.field876--;
                        }
                    }
                }
            }
        }
        if (arg0.field864 < 128 || arg0.field818 < 128 || arg0.field864 >= 13184 || arg0.field818 >= 13184) {
            arg0.field849 = -1;
            arg0.field854 = -1;
            arg0.field867 = 0;
            arg0.field842 = 0;
            arg0.field864 = arg0.field872[0] * 128 + arg0.field843 * 64;
            arg0.field818 = arg0.field837[0] * 128 + arg0.field843 * 64;
            arg0.method749();
        }
        if (Statics.field767 == arg0 && (arg0.field864 < 1536 || arg0.field818 < 1536 || arg0.field864 >= 11776 || arg0.field818 >= 11776)) {
            arg0.field849 = -1;
            arg0.field854 = -1;
            arg0.field867 = 0;
            arg0.field842 = 0;
            arg0.field864 = arg0.field872[0] * 128 + arg0.field843 * 64;
            arg0.field818 = arg0.field837[0] * 128 + arg0.field843 * 64;
            arg0.method749();
        }
        method123(arg0);
        method724(arg0);
    }

    @ObfuscatedName("l.am(Lao;I)V")
    public static final void method123(class40 arg0) {
        if (arg0.field870 == 0) {
            return;
        }
        if (arg0.field846 != -1) {
            class40 var1 = null;
            if (arg0.field846 < 32768) {
                var1 = field283[arg0.field846];
            } else if (arg0.field846 >= 32768) {
                var1 = field332[arg0.field846 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field864 - var1.field864;
                int var3 = arg0.field818 - var1.field818;
                if (var2 != 0 || var3 != 0) {
                    arg0.field874 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field878) {
                arg0.field846 = -1;
                arg0.field878 = false;
            }
        }
        if (arg0.field845 != -1 && (arg0.field868 == 0 || arg0.field873 > 0)) {
            arg0.field874 = arg0.field845;
            arg0.field845 = -1;
        }
        int var4 = arg0.field874 - arg0.field819 & 0x7FF;
        if (var4 == 0 && arg0.field878) {
            arg0.field846 = -1;
            arg0.field878 = false;
        }
        if (var4 == 0) {
            arg0.field869 = 0;
            return;
        }
        arg0.field869++;
        if (var4 > 1024) {
            arg0.field819 -= arg0.field870;
            boolean var5 = true;
            if (var4 < arg0.field870 || var4 > 2048 - arg0.field870) {
                arg0.field819 = arg0.field874;
                var5 = false;
            }
            if (arg0.field857 == arg0.field822 && (arg0.field869 > 25 || var5)) {
                if (arg0.field848 == -1) {
                    arg0.field857 = arg0.field825;
                } else {
                    arg0.field857 = arg0.field848;
                }
            }
        } else {
            arg0.field819 += arg0.field870;
            boolean var6 = true;
            if (var4 < arg0.field870 || var4 > 2048 - arg0.field870) {
                arg0.field819 = arg0.field874;
                var6 = false;
            }
            if (arg0.field857 == arg0.field822 && (arg0.field869 > 25 || var6)) {
                if (arg0.field824 == -1) {
                    arg0.field857 = arg0.field825;
                } else {
                    arg0.field857 = arg0.field824;
                }
            }
        }
        arg0.field819 &= 0x7FF;
    }

    @ObfuscatedName("am.aq(Lao;B)V")
    public static final void method724(class40 arg0) {
        arg0.field820 = false;
        if (arg0.field857 != -1) {
            class45 var1 = class45.method1289(arg0.field857);
            if (var1 == null || var1.field993 == null) {
                arg0.field857 = -1;
            } else {
                arg0.field834++;
                if (arg0.field855 < var1.field993.length && arg0.field834 > var1.field995[arg0.field855]) {
                    arg0.field834 = 1;
                    arg0.field855++;
                    method3061(var1, arg0.field855, arg0.field864, arg0.field818);
                }
                if (arg0.field855 >= var1.field993.length) {
                    arg0.field834 = 0;
                    arg0.field855 = 0;
                    method3061(var1, arg0.field855, arg0.field864, arg0.field818);
                }
            }
        }
        if (arg0.field854 != -1 && field291 >= arg0.field847) {
            if (arg0.field836 < 0) {
                arg0.field836 = 0;
            }
            int var2 = class46.method2917(arg0.field854).field1024;
            if (var2 == -1) {
                arg0.field854 = -1;
            } else {
                class45 var3 = class45.method1289(var2);
                if (var3 == null || var3.field993 == null) {
                    arg0.field854 = -1;
                } else {
                    arg0.field856++;
                    if (arg0.field836 < var3.field993.length && arg0.field856 > var3.field995[arg0.field836]) {
                        arg0.field856 = 1;
                        arg0.field836++;
                        method3061(var3, arg0.field836, arg0.field864, arg0.field818);
                    }
                    if (arg0.field836 >= var3.field993.length && (arg0.field836 < 0 || arg0.field836 >= var3.field993.length)) {
                        arg0.field854 = -1;
                    }
                }
            }
        }
        if (arg0.field849 != -1 && arg0.field852 <= 1) {
            class45 var4 = class45.method1289(arg0.field849);
            if (var4.field1013 == 1 && arg0.field876 > 0 && arg0.field867 <= field291 && arg0.field842 < field291) {
                arg0.field852 = 1;
                return;
            }
        }
        if (arg0.field849 != -1 && arg0.field852 == 0) {
            class45 var5 = class45.method1289(arg0.field849);
            if (var5 == null || var5.field993 == null) {
                arg0.field849 = -1;
            } else {
                arg0.field851++;
                if (arg0.field850 < var5.field993.length && arg0.field851 > var5.field995[arg0.field850]) {
                    arg0.field851 = 1;
                    arg0.field850++;
                    method3061(var5, arg0.field850, arg0.field864, arg0.field818);
                }
                if (arg0.field850 >= var5.field993.length) {
                    arg0.field850 -= var5.field997;
                    arg0.field853++;
                    if (arg0.field853 >= var5.field1003) {
                        arg0.field849 = -1;
                    } else if (arg0.field850 >= 0 && arg0.field850 < var5.field993.length) {
                        method3061(var5, arg0.field850, arg0.field864, arg0.field818);
                    } else {
                        arg0.field849 = -1;
                    }
                }
                arg0.field820 = var5.field999;
            }
        }
        if (arg0.field852 > 0) {
            arg0.field852--;
        }
    }

    @ObfuscatedName("gz.at(Ln;III)V")
    public static void method3382(class3 arg0, int arg1, int arg2) {
        if (arg0.field849 == arg1 && arg1 != -1) {
            int var3 = class45.method1289(arg1).field1007;
            if (var3 == 1) {
                arg0.field850 = 0;
                arg0.field851 = 0;
                arg0.field852 = arg2;
                arg0.field853 = 0;
            }
            if (var3 == 2) {
                arg0.field853 = 0;
            }
        } else if (arg1 == -1 || arg0.field849 == -1 || class45.method1289(arg1).field1006 >= class45.method1289(arg0.field849).field1006) {
            arg0.field849 = arg1;
            arg0.field850 = 0;
            arg0.field851 = 0;
            arg0.field852 = arg2;
            arg0.field853 = 0;
            arg0.field876 = arg0.field868;
        }
    }

    @ObfuscatedName("fm.aa(I)I")
    public static int method2992() {
        return field494 ? 2 : 1;
    }

    @ObfuscatedName("x.as(B)V")
    public static void method153() {
        field398.method2634(206);
        field398.method2384(method2992());
        field398.method2385(Statics.field2297);
        field398.method2385(Statics.field1617);
    }

    @ObfuscatedName("ad.ao(I)V")
    public static void method989() {
        client var0 = Statics.field443;
        synchronized (Statics.field443) {
            Container var1 = Statics.field443.method2893();
            if (var1 != null) {
                Statics.field1011 = Math.max(var1.getSize().width, Statics.field126);
                Statics.field2100 = Math.max(var1.getSize().height, Statics.field2023);
                if (Statics.field1957 == var1) {
                    Insets var2 = Statics.field1957.getInsets();
                    Statics.field1011 -= var2.right + var2.left;
                    Statics.field2100 -= var2.top + var2.bottom;
                }
                if (Statics.field1011 <= 0) {
                    Statics.field1011 = 1;
                }
                if (Statics.field2100 <= 0) {
                    Statics.field2100 = 1;
                }
                if (method2992() == 1) {
                    Statics.field2297 = field437;
                    Statics.field1617 = field496 * 503;
                } else {
                    Statics.field2297 = Math.min(Statics.field1011, 7680);
                    Statics.field1617 = Math.min(Statics.field2100, 2160);
                }
                field2249 = (Statics.field1011 - Statics.field2297) / 2;
                field2246 = 0;
                Statics.field1722.setSize(Statics.field2297, Statics.field1617);
                Statics.field636 = class81.method50(Statics.field2297, Statics.field1617, Statics.field1722);
                if (Statics.field1957 == var1) {
                    Insets var3 = Statics.field1957.getInsets();
                    Statics.field1722.setLocation(field2249 + var3.left, field2246 + var3.top);
                } else {
                    Statics.field1722.setLocation(field2249, field2246);
                }
                int var4 = Statics.field2297;
                int var5 = Statics.field1617;
                if (Statics.field1011 < var4) {
                    int var6 = Statics.field1011;
                }
                if (Statics.field2100 < var5) {
                    int var7 = Statics.field2100;
                }
                if (Statics.field233 != null) {
                    try {
                        class136.method2722(Statics.field443, "resize", new Object[] { method2992() });
                    } catch (Throwable var10) {
                    }
                }
                if (field302 != -1) {
                    method107(field302, Statics.field2297, Statics.field1617, true);
                }
                method1010();
            }
        }
    }

    @ObfuscatedName("an.ai(I)V")
    public static void method1010() {
        int var0 = field2249;
        int var1 = field2246;
        int var2 = Statics.field1011 - Statics.field2297 - var0;
        int var3 = Statics.field2100 - Statics.field1617 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field443.method2893();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1957 == var4) {
                Insets var7 = Statics.field1957.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2100);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1011, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1011 + var5 - var2, var6, var2, Statics.field2100);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2100 + var6 - var3, Statics.field1011, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("i.ap(Ljava/lang/String;ZI)V")
    public static final void method140(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1963.method3849(arg0, 250);
        int var6 = Statics.field1963.method3850(arg0, 250) * 13;
        class83.method1768(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1759(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1963.method3881(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method994(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method948(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1722.getGraphics();
            Statics.field636.method1610(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1722.repaint();
        }
    }

    @ObfuscatedName("ac.ak(IIIIZI)V")
    public static final void method674(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field543 - field411) * var5 / 100 + field411;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field540) {
            short var8 = field540;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field539) {
                var6 = field539;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1746();
                    class83.method1768(arg0, arg1, var10, arg3, -16777216);
                    class83.method1768(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field541) {
            short var11 = field541;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field538) {
                var6 = field538;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1746();
                    class83.method1768(arg0, arg1, arg2, var13, -16777216);
                    class83.method1768(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field537 - field514) * var5 / 100 + field514;
        field546 = arg3 * var6 * var14 / 85504 << 1;
        if (field544 != arg2 || field412 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1636[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1890(var15, 500, 800, arg2, arg3);
        }
        field542 = arg0;
        field548 = arg1;
        field544 = arg2;
        field412 = arg3;
    }

    @ObfuscatedName("p.ag(Laq;I)V")
    public static final void method579(class36 arg0) {
        if (Statics.field767.field864 >> 7 == field432 && Statics.field767.field818 >> 7 == field515) {
            field432 = 0;
        }
        int var1 = class35.field764;
        int[] var2 = class35.field759;
        int var3 = var1;
        if (class36.field780 == arg0 || class36.field786 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field780 == arg0) {
                var5 = Statics.field767;
                var6 = Statics.field767.field58 << 14;
            } else if (class36.field786 == arg0) {
                var5 = field332[field472];
                var6 = field472 << 14;
            } else {
                var5 = field332[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field778 == arg0 && field472 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method25() && !var5.field53) {
                var5.field50 = false;
                if ((field287 && var1 > 50 || var1 > 200) && class36.field780 != arg0 && var5.field857 == var5.field822) {
                    var5.field50 = true;
                }
                int var7 = var5.field864 >> 7;
                int var8 = var5.field818 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field45 == null || field291 < var5.field40 || field291 >= var5.field41) {
                        if ((var5.field864 & 0x7F) == 64 && (var5.field818 & 0x7F) == 64) {
                            if (field387 == field386[var7][var8]) {
                                continue;
                            }
                            field386[var7][var8] = field387;
                        }
                        var5.field39 = method1852(var5.field864, var5.field818, Statics.field223);
                        Statics.field152.method1911(Statics.field223, var5.field864, var5.field818, var5.field39, 60, var5, var5.field819, var6, var5.field820);
                    } else {
                        var5.field50 = false;
                        var5.field39 = method1852(var5.field864, var5.field818, Statics.field223);
                        Statics.field152.method1867(Statics.field223, var5.field864, var5.field818, var5.field39, 60, var5, var5.field819, var6, var5.field46, var5.field47, var5.field48, var5.field31);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.az(ZB)V")
    public static final void method727(boolean arg0) {
        for (int var1 = 0; var1 < field322; var1++) {
            class37 var2 = field283[field406[var1]];
            int var3 = (field406[var1] << 14) + 536870912;
            if (var2 != null && var2.method25() && var2.field787.field909 == arg0 && var2.field787.method779()) {
                int var4 = var2.field864 >> 7;
                int var5 = var2.field818 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field843 == 1 && (var2.field864 & 0x7F) == 64 && (var2.field818 & 0x7F) == 64) {
                        if (field387 == field386[var4][var5]) {
                            continue;
                        }
                        field386[var4][var5] = field387;
                    }
                    if (!var2.field787.field917) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field152.method1911(Statics.field223, var2.field864, var2.field818, method1852(var2.field864 + (var2.field843 * 64 - 64), var2.field818 + (var2.field843 * 64 - 64), Statics.field223), var2.field843 * 64 - 64 + 60, var2, var2.field819, var3, var2.field820);
                }
            }
        }
    }

    @ObfuscatedName("ac.au(I)I")
    public static final int method675() {
        if (Statics.field233.field150) {
            return Statics.field223;
        }
        int var0 = 3;
        if (Statics.field2218 < 310) {
            int var1 = Statics.field2151 >> 7;
            int var2 = Statics.field1417 >> 7;
            int var3 = Statics.field767.field864 >> 7;
            int var4 = Statics.field767.field818 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field223;
            }
            if ((class6.field83[Statics.field223][var1][var2] & 0x4) != 0) {
                var0 = Statics.field223;
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
                    if ((class6.field83[Statics.field223][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field223;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field83[Statics.field223][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field223;
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
                    if ((class6.field83[Statics.field223][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field223;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field83[Statics.field223][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field223;
                        }
                    }
                }
            }
        }
        if (Statics.field767.field864 >= 0 && Statics.field767.field818 >= 0 && Statics.field767.field864 < 13312 && Statics.field767.field818 < 13312) {
            if ((class6.field83[Statics.field223][Statics.field767.field864 >> 7][Statics.field767.field818 >> 7] & 0x4) != 0) {
                var0 = Statics.field223;
            }
            return var0;
        } else {
            return Statics.field223;
        }
    }

    @ObfuscatedName("w.af(I)I")
    public static final int method110() {
        if (Statics.field233.field150) {
            return Statics.field223;
        } else {
            int var0 = method1852(Statics.field2151, Statics.field1417, Statics.field223);
            return var0 - Statics.field2741 >= 800 || (class6.field83[Statics.field223][Statics.field2151 >> 7][Statics.field1417 >> 7] & 0x4) == 0 ? 3 : Statics.field223;
        }
    }

    @ObfuscatedName("am.al(IIS)V")
    public static final void method718(int arg0, int arg1) {
        if (field299 == 2) {
            method3291((field354 - Statics.field713 << 7) + field305, (field358 - Statics.field138 << 7) + field280, field304 * 2);
            if (field388 > -1 && field291 % 20 < 10) {
                Statics.field883[0].method1670(field388 + arg0 - 12, field389 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ab.av(Lao;IIIIII)V")
    public static final void method1048(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method25()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field787;
            if (var6.field914 != null) {
                var6 = var6.method778();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field764;
        int[] var8 = class35.field759;
        int var9 = 3;
        if (!arg0.field823.method3691()) {
            int var10 = arg0.field840 + 15;
            method3291(arg0.field864, arg0.field818, var10);
            for (class27 var11 = (class27) arg0.field823.method3688(); var11 != null; var11 = (class27) arg0.field823.method3684()) {
                class21 var12 = var11.method601(field291);
                if (var12 != null) {
                    class50 var13 = var11.field643;
                    class82 var14 = var13.method976();
                    class82 var15 = var13.method966();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1084;
                    } else {
                        if (var13.field1073 * 2 < var15.field1457) {
                            var16 = var13.field1073;
                        }
                        var17 = var15.field1457 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field291 - var12.field571;
                    int var21 = var12.field567 * var17 / var13.field1084;
                    int var24;
                    if (var12.field569 > var20) {
                        int var22 = var13.field1090 == 0 ? 0 : var20 / var13.field1090 * var13.field1090;
                        int var23 = var12.field570 * var17 / var13.field1084;
                        var24 = (var21 - var23) * var22 / var12.field569 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field569 + var13.field1085 - var20;
                        if (var13.field1079 >= 0) {
                            var18 = (var25 << 8) / (var13.field1085 - var13.field1079);
                        }
                    }
                    if (var12.field567 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    int var26 = field388 + arg2 - (var17 >> 1);
                    int var27 = field389 + arg3 - var9;
                    if (var14 == null || var15 == null) {
                        if (field388 > -1) {
                            class83.method1768(var26, var27, var24, 5, 65280);
                            class83.method1768(var24 + var26, var27, var17 - var24, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var28 = var26 - var16;
                        int var29;
                        if (var17 == var24) {
                            var29 = var16 * 2 + var24;
                        } else {
                            var29 = var16 + var24;
                        }
                        int var30 = var14.field1462;
                        var9 += var30;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method1675(var28, var27, var18);
                            class83.method1794(var28, var27, var28 + var29, var27 + var30);
                            var15.method1675(var28, var27, var18);
                        } else {
                            var14.method1670(var28, var27);
                            class83.method1794(var28, var27, var28 + var29, var27 + var30);
                            var15.method1670(var28, var27);
                        }
                        class83.method1802(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var11.method602()) {
                    var11.method3744();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var31 = (class3) arg0;
            if (var31.field53) {
                return;
            }
            if (var31.field57 != -1 || var31.field34 != -1) {
                int var32 = arg0.field840 + 15;
                method3291(arg0.field864, arg0.field818, var32);
                if (field388 > -1) {
                    if (var31.field57 != -1) {
                        Statics.field1429[var31.field57].method1670(field388 + arg2 - 12, field389 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var31.field34 != -1) {
                        Statics.field2068[var31.field34].method1670(field388 + arg2 - 12, field389 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field299 == 10 && field534 == var8[arg1]) {
                int var33 = arg0.field840 + 15;
                method3291(arg0.field864, arg0.field818, var33);
                if (field388 > -1) {
                    Statics.field883[1].method1670(field388 + arg2 - 12, field389 + arg3 - var9);
                }
            }
        } else {
            class42 var34 = ((class37) arg0).field787;
            if (var34.field914 != null) {
                var34 = var34.method778();
            }
            if (var34.field912 >= 0 && var34.field912 < Statics.field2068.length) {
                int var35 = arg0.field840 + 15;
                method3291(arg0.field864, arg0.field818, var35);
                if (field388 > -1) {
                    Statics.field2068[var34.field912].method1670(field388 + arg2 - 12, field389 + arg3 - 30);
                }
            }
            if (field299 == 1 && field279 == field406[arg1 - var7] && field291 % 20 < 10) {
                int var36 = arg0.field840 + 15;
                method3291(arg0.field864, arg0.field818, var36);
                if (field388 > -1) {
                    Statics.field883[0].method1670(field388 + arg2 - 12, field389 + arg3 - 28);
                }
            }
        }
        if (arg0.field830 != null && (arg1 >= var7 || !arg0.field832 && (field498 == 4 || !arg0.field831 && (field498 == 0 || field498 == 3 || field498 == 1 && method80(((class3) arg0).field56, false))))) {
            int var37 = arg0.field840;
            method3291(arg0.field864, arg0.field818, var37);
            if (field388 > -1 && field383 < field377) {
                field381[field383] = Statics.field1435.method3847(arg0.field830) / 2;
                field554[field383] = Statics.field1435.field3246;
                field378[field383] = field388;
                field379[field383] = field389;
                field519[field383] = arg0.field817;
                field285[field383] = arg0.field835;
                field384[field383] = arg0.field833;
                field385[field383] = arg0.field830;
                field383++;
            }
        }
        for (int var38 = 0; var38 < 4; var38++) {
            int var39 = arg0.field839[var38];
            int var40 = arg0.field871[var38];
            class52 var41 = null;
            int var42 = 0;
            if (var40 >= 0) {
                if (var39 <= field291) {
                    continue;
                }
                var41 = class52.method93(arg0.field871[var38]);
                var42 = var41.field1106;
                if (var41 != null && var41.field1117 != null) {
                    var41 = var41.method1014();
                    if (var41 == null) {
                        arg0.field839[var38] = -1;
                        continue;
                    }
                }
            } else if (var39 < 0) {
                continue;
            }
            int var43 = arg0.field875[var38];
            class52 var44 = null;
            if (var43 >= 0) {
                var44 = class52.method93(var43);
                if (var44 != null && var44.field1117 != null) {
                    var44 = var44.method1014();
                }
            }
            if (var39 - var42 <= field291) {
                if (var41 == null) {
                    arg0.field839[var38] = -1;
                } else {
                    int var45 = arg0.field840 / 2;
                    method3291(arg0.field864, arg0.field818, var45);
                    if (field388 > -1) {
                        if (var38 == 1) {
                            field389 -= 20;
                        }
                        if (var38 == 2) {
                            field388 -= 15;
                            field389 -= 10;
                        }
                        if (var38 == 3) {
                            field388 += 15;
                            field389 -= 10;
                        }
                        Object var46 = null;
                        Object var47 = null;
                        Object var48 = null;
                        Object var49 = null;
                        int var50 = 0;
                        int var51 = 0;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        class82 var58 = null;
                        class82 var59 = null;
                        class82 var60 = null;
                        class82 var61 = null;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        class82 var71 = var41.method1040();
                        if (var71 != null) {
                            var50 = var71.field1457;
                            int var72 = var71.field1462;
                            if (var72 > var70) {
                                var70 = var72;
                            }
                            var54 = var71.field1461;
                        }
                        class82 var73 = var41.method1017();
                        if (var73 != null) {
                            var51 = var73.field1457;
                            int var74 = var73.field1462;
                            if (var74 > var70) {
                                var70 = var74;
                            }
                            var55 = var73.field1461;
                        }
                        class82 var75 = var41.method1038();
                        if (var75 != null) {
                            var52 = var75.field1457;
                            int var76 = var75.field1462;
                            if (var76 > var70) {
                                var70 = var76;
                            }
                            var56 = var75.field1461;
                        }
                        class82 var77 = var41.method1019();
                        if (var77 != null) {
                            var53 = var77.field1457;
                            int var78 = var77.field1462;
                            if (var78 > var70) {
                                var70 = var78;
                            }
                            var57 = var77.field1461;
                        }
                        if (var44 != null) {
                            var58 = var44.method1040();
                            if (var58 != null) {
                                var62 = var58.field1457;
                                int var79 = var58.field1462;
                                if (var79 > var70) {
                                    var70 = var79;
                                }
                                var66 = var58.field1461;
                            }
                            var59 = var44.method1017();
                            if (var59 != null) {
                                var63 = var59.field1457;
                                int var80 = var59.field1462;
                                if (var80 > var70) {
                                    var70 = var80;
                                }
                                var67 = var59.field1461;
                            }
                            var60 = var44.method1038();
                            if (var60 != null) {
                                var64 = var60.field1457;
                                int var81 = var60.field1462;
                                if (var81 > var70) {
                                    var70 = var81;
                                }
                                var68 = var60.field1461;
                            }
                            var61 = var44.method1019();
                            if (var61 != null) {
                                var65 = var61.field1457;
                                int var82 = var61.field1462;
                                if (var82 > var70) {
                                    var70 = var82;
                                }
                                var69 = var61.field1461;
                            }
                        }
                        class228 var83 = var41.method1020();
                        if (var83 == null) {
                            var83 = Statics.field226;
                        }
                        class228 var84;
                        if (var44 == null) {
                            var84 = Statics.field226;
                        } else {
                            var84 = var44.method1020();
                            if (var84 == null) {
                                var84 = Statics.field226;
                            }
                        }
                        Object var85 = null;
                        String var86 = null;
                        boolean var87 = false;
                        int var88 = 0;
                        String var89 = var41.method1015(arg0.field838[var38]);
                        int var90 = var83.method3847(var89);
                        if (var44 != null) {
                            var86 = var44.method1015(arg0.field821[var38]);
                            var88 = var84.method3847(var86);
                        }
                        int var91 = 0;
                        int var92 = 0;
                        if (var51 > 0) {
                            if (var75 == null && var77 == null) {
                                var91 = 1;
                            } else {
                                var91 = var90 / var51 + 1;
                            }
                        }
                        if (var44 != null && var63 > 0) {
                            if (var60 == null && var61 == null) {
                                var92 = 1;
                            } else {
                                var92 = var88 / var63 + 1;
                            }
                        }
                        int var93 = 0;
                        int var94 = var93;
                        if (var50 > 0) {
                            var93 += var50;
                        }
                        var93 += 2;
                        int var95 = var93;
                        if (var52 > 0) {
                            var93 += var52;
                        }
                        int var96 = var93;
                        int var97 = var93;
                        int var99;
                        if (var51 > 0) {
                            int var98 = var51 * var91;
                            var99 = var93 + var98;
                            var97 = (var98 - var90) / 2 + var93;
                        } else {
                            var99 = var90 + var93;
                        }
                        int var100 = var99;
                        if (var53 > 0) {
                            var99 += var53;
                        }
                        int var101 = 0;
                        int var102 = 0;
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        if (var44 != null) {
                            var99 += 2;
                            var101 = var99;
                            if (var62 > 0) {
                                var99 += var62;
                            }
                            var99 += 2;
                            var102 = var99;
                            if (var64 > 0) {
                                var99 += var64;
                            }
                            var103 = var99;
                            var105 = var99;
                            if (var63 > 0) {
                                int var106 = var63 * var92;
                                var99 += var106;
                                var105 += (var106 - var88) / 2;
                            } else {
                                var99 += var88;
                            }
                            var104 = var99;
                            if (var65 > 0) {
                                var99 += var65;
                            }
                        }
                        int var107 = arg0.field839[var38] - field291;
                        int var108 = var41.field1122 - var41.field1122 * var107 / var41.field1106;
                        int var109 = var41.field1112 * var107 / var41.field1106 + -var41.field1112;
                        int var110 = field388 + arg2 - (var99 >> 1) + var108;
                        int var111 = field389 + arg3 - 12 + var109;
                        int var112 = var111;
                        int var113 = var70 + var111;
                        int var114 = var41.field1099 + var111 + 15;
                        int var115 = var114 - var83.field3235;
                        int var116 = var83.field3241 + var114;
                        if (var115 < var111) {
                            var112 = var115;
                        }
                        if (var116 > var113) {
                            var113 = var116;
                        }
                        int var117 = 0;
                        if (var44 != null) {
                            var117 = var44.field1099 + var111 + 15;
                            int var118 = var117 - var84.field3235;
                            int var119 = var84.field3241 + var117;
                            if (var118 < var112) {
                                ;
                            }
                            if (var119 > var113) {
                                ;
                            }
                        }
                        int var122 = 255;
                        if (var41.field1113 >= 0) {
                            var122 = (var107 << 8) / (var41.field1106 - var41.field1113);
                        }
                        if (var122 >= 0 && var122 < 255) {
                            if (var71 != null) {
                                var71.method1675(var94 + var110 - var54, var111, var122);
                            }
                            if (var75 != null) {
                                var75.method1675(var95 + var110 - var56, var111, var122);
                            }
                            if (var73 != null) {
                                for (int var123 = 0; var123 < var91; var123++) {
                                    var73.method1675(var51 * var123 + (var96 + var110 - var55), var111, var122);
                                }
                            }
                            if (var77 != null) {
                                var77.method1675(var100 + var110 - var57, var111, var122);
                            }
                            var83.method3853(var89, var97 + var110, var114, var41.field1105, 0, var122);
                            if (var44 != null) {
                                if (var58 != null) {
                                    var58.method1675(var101 + var110 - var66, var111, var122);
                                }
                                if (var60 != null) {
                                    var60.method1675(var102 + var110 - var68, var111, var122);
                                }
                                if (var59 != null) {
                                    for (int var124 = 0; var124 < var92; var124++) {
                                        var59.method1675(var63 * var124 + (var103 + var110 - var67), var111, var122);
                                    }
                                }
                                if (var61 != null) {
                                    var61.method1675(var104 + var110 - var69, var111, var122);
                                }
                                var84.method3853(var86, var105 + var110, var117, var44.field1105, 0, var122);
                            }
                        } else {
                            if (var71 != null) {
                                var71.method1670(var94 + var110 - var54, var111);
                            }
                            if (var75 != null) {
                                var75.method1670(var95 + var110 - var56, var111);
                            }
                            if (var73 != null) {
                                for (int var125 = 0; var125 < var91; var125++) {
                                    var73.method1670(var51 * var125 + (var96 + var110 - var55), var111);
                                }
                            }
                            if (var77 != null) {
                                var77.method1670(var100 + var110 - var57, var111);
                            }
                            var83.method3852(var89, var97 + var110, var114, var41.field1105 | 0xFF000000, 0);
                            if (var44 != null) {
                                if (var58 != null) {
                                    var58.method1670(var101 + var110 - var66, var111);
                                }
                                if (var60 != null) {
                                    var60.method1670(var102 + var110 - var68, var111);
                                }
                                if (var59 != null) {
                                    for (int var126 = 0; var126 < var92; var126++) {
                                        var59.method1670(var63 * var126 + (var103 + var110 - var67), var111);
                                    }
                                }
                                if (var61 != null) {
                                    var61.method1670(var104 + var110 - var69, var111);
                                }
                                var84.method3852(var86, var105 + var110, var117, var44.field1105 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fa.ad(IIIII)V")
    public static final void method3303(int arg0, int arg1, int arg2, int arg3) {
        field383 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class35.field764;
        int[] var7 = class35.field759;
        for (int var8 = 0; var8 < field322 + var6; var8++) {
            class40 var9;
            if (var8 < var6) {
                var9 = field332[var7[var8]];
                if (field472 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field283[field406[var8 - var6]];
            }
            method1048(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1048(field332[field472], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field383; var10++) {
            int var11 = field378[var10];
            int var12 = field379[var10];
            int var13 = field381[var10];
            int var14 = field554[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field379[var16] - field554[var16] && var12 - var14 < field379[var16] + 2 && var11 - var13 < field381[var16] + field378[var16] && var11 + var13 > field378[var16] - field381[var16] && field379[var16] - field554[var16] < var12) {
                        var12 = field379[var16] - field554[var16];
                        var15 = true;
                    }
                }
            }
            field388 = field378[var10];
            field389 = field379[var10] = var12;
            String var17 = field385[var10];
            if (field442 == 0) {
                int var18 = 16776960;
                if (field519[var10] < 6) {
                    var18 = field301[field519[var10]];
                }
                if (field519[var10] == 6) {
                    var18 = field387 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field519[var10] == 7) {
                    var18 = field387 % 20 < 10 ? 255 : 65535;
                }
                if (field519[var10] == 8) {
                    var18 = field387 % 20 < 10 ? 45056 : 8454016;
                }
                if (field519[var10] == 9) {
                    int var19 = 150 - field384[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field519[var10] == 10) {
                    int var20 = 150 - field384[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field519[var10] == 11) {
                    int var21 = 150 - field384[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field285[var10] == 0) {
                    Statics.field1435.method3855(var17, field388 + arg0, field389 + arg1, var18, 0);
                }
                if (field285[var10] == 1) {
                    Statics.field1435.method3857(var17, field388 + arg0, field389 + arg1, var18, 0, field387);
                }
                if (field285[var10] == 2) {
                    Statics.field1435.method3858(var17, field388 + arg0, field389 + arg1, var18, 0, field387);
                }
                if (field285[var10] == 3) {
                    Statics.field1435.method3859(var17, field388 + arg0, field389 + arg1, var18, 0, field387, 150 - field384[var10]);
                }
                if (field285[var10] == 4) {
                    int var22 = (150 - field384[var10]) * (Statics.field1435.method3847(var17) + 100) / 150;
                    class83.method1794(field388 + arg0 - 50, arg1, field388 + arg0 + 50, arg1 + arg3);
                    Statics.field1435.method3852(var17, field388 + arg0 + 50 - var22, field389 + arg1, var18, 0);
                    class83.method1802(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field285[var10] == 5) {
                    int var23 = 150 - field384[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class83.method1794(arg0, field389 + arg1 - Statics.field1435.field3246 - 1, arg0 + arg2, field389 + arg1 + 5);
                    Statics.field1435.method3855(var17, field388 + arg0, field389 + arg1 + var24, var18, 0);
                    class83.method1802(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1435.method3855(var17, field388 + arg0, field389 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ak.an(B)V")
    public static final void method833() {
        field402 = 0;
        int var0 = (Statics.field767.field864 >> 7) + Statics.field713;
        int var1 = (Statics.field767.field818 >> 7) + Statics.field138;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field402 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field402 = 1;
        }
        if (field402 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field402 = 0;
        }
    }

    @ObfuscatedName("x.ab(IIIII)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3) {
        if (field393 == 1) {
            Statics.field679[field392 / 100].method1670(field390 - 8, field391 - 8);
        }
        if (field393 == 2) {
            Statics.field679[field392 / 100 + 4].method1670(field390 - 8, field391 - 8);
        }
        method833();
    }

    @ObfuscatedName("fr.bc(IIII)V")
    public static final void method3291(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field388 = -1;
            field389 = -1;
            return;
        }
        int var3 = method1852(arg0, arg1, Statics.field223) - arg2;
        int var4 = arg0 - Statics.field2151;
        int var5 = var3 - Statics.field2741;
        int var6 = arg1 - Statics.field1417;
        int var7 = class95.field1636[Statics.field2218];
        int var8 = class95.field1647[Statics.field2218];
        int var9 = class95.field1636[Statics.field1834];
        int var10 = class95.field1647[Statics.field1834];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field388 = field546 * var11 / var15 + field544 / 2;
            field389 = field546 * var14 / var15 + field412 / 2;
        } else {
            field388 = -1;
            field389 = -1;
        }
    }

    @ObfuscatedName("cx.bk(IIIB)I")
    public static final int method1852(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field83[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field79[var5][var3][var4] + class6.field79[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field79[var5][var3][var4 + 1] + class6.field79[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dt.bs(IIIIIII)V")
    public static final void method2631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class95.field1636[var6];
            int var12 = class95.field1647[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class95.field1636[var7];
            int var15 = class95.field1647[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2151 = arg0 - var8;
        Statics.field2741 = arg1 - var9;
        Statics.field1417 = arg2 - var10;
        Statics.field2218 = arg3;
        Statics.field1834 = arg4;
    }

    @ObfuscatedName("eb.bv(ZI)V")
    public static final void method2695(boolean arg0) {
        field474 = arg0;
        if (!field474) {
            int var1 = field328.method2401();
            int var2 = field328.method2435();
            int var3 = field328.method2401();
            Statics.field2207 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2207[var4][var5] = field328.method2404();
                }
            }
            Statics.field1687 = new int[var3];
            Statics.field3223 = new int[var3];
            Statics.field1827 = new int[var3];
            Statics.field149 = new byte[var3][];
            Statics.field799 = new byte[var3][];
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
                        Statics.field1687[var7] = var10;
                        Statics.field3223[var7] = Statics.field1268.method3102("m" + var8 + "_" + var9);
                        Statics.field1827[var7] = Statics.field1268.method3102("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            Statics.method150(var1, var2);
            return;
        }
        int var11 = field328.method2401();
        int var12 = field328.method2401();
        int var13 = field328.method2401();
        field328.method2636();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field328.method2637(1);
                    if (var17 == 1) {
                        field300[var14][var15][var16] = field328.method2637(26);
                    } else {
                        field300[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field328.method2644();
        Statics.field2207 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2207[var18][var19] = field328.method2404();
            }
        }
        Statics.field1687 = new int[var13];
        Statics.field3223 = new int[var13];
        Statics.field1827 = new int[var13];
        Statics.field149 = new byte[var13][];
        Statics.field799 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field300[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1687[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1687[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field3223[var20] = Statics.field1268.method3102("m" + var29 + "_" + var30);
                            Statics.field1827[var20] = Statics.field1268.method3102("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        Statics.method150(var12, var11);
    }

    @ObfuscatedName("c.bb(ZB)V")
    public static final void method108(boolean arg0) {
        method992();
        field553++;
        if (field553 < 50 && !arg0) {
            return;
        }
        field553 = 0;
        if (field337 || Statics.field605 == null) {
            return;
        }
        field398.method2634(204);
        try {
            Statics.field605.method2859(field398.field2053, 0, field398.field2052);
            field398.field2052 = 0;
        } catch (IOException var2) {
            field337 = true;
        }
    }

    @ObfuscatedName("fz.bn(II)V")
    public static final void method3011(int arg0) {
        int[] var1 = Statics.field1661.field1453;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field83[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field152.method1904(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field152.method1904(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1661.method1721();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field83[arg0][var10][var9] & 0x18) == 0) {
                    method2094(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2094(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field510 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field152.method1917(Statics.field223, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method106(var14).field943;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field343[Statics.field223].field1955;
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
                        field513[field510] = Statics.field206[var15];
                        field535[field510] = var16;
                        field512[field510] = var17;
                        field510++;
                    }
                }
            }
        }
        Statics.field636.method1647();
    }

    @ObfuscatedName("cu.bo(IIIIII)V")
    public static final void method2094(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field152.method1935(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field152.method1885(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1661.field1453;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method106(var12);
            if (var13.field950 == -1) {
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
                class84 var14 = Statics.field624[var13.field950];
                if (var14 != null) {
                    int var15 = (var13.field937 * 4 - var14.field1476) / 2;
                    int var16 = (var13.field938 * 4 - var14.field1474) / 2;
                    var14.method1820(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field938) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field152.method2014(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field152.method1885(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method106(var21);
            if (var22.field950 != -1) {
                class84 var23 = Statics.field624[var22.field950];
                if (var23 != null) {
                    int var24 = (var22.field937 * 4 - var23.field1476) / 2;
                    int var25 = (var22.field938 * 4 - var23.field1474) / 2;
                    var23.method1820(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field938) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1661.field1453;
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
        int var29 = Statics.field152.method1917(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method106(var30);
        if (var31.field950 == -1) {
            return;
        }
        class84 var32 = Statics.field624[var31.field950];
        if (var32 != null) {
            int var33 = (var31.field937 * 4 - var32.field1476) / 2;
            int var34 = (var31.field938 * 4 - var32.field1474) / 2;
            var32.method1820(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field938) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("e.bt(B)Z")
    public static final boolean method12() {
        if (Statics.field605 == null) {
            return false;
        }
        try {
            int var0 = Statics.field605.method2863();
            if (var0 == 0) {
                return false;
            }
            if (field530 == -1) {
                Statics.field605.method2864(field328.field2053, 0, 1);
                field328.field2052 = 0;
                field530 = field328.method2648();
                field329 = class192.field3099[field530];
                var0--;
            }
            if (field329 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field605.method2864(field328.field2053, 0, 1);
                field329 = field328.field2053[0] & 0xFF;
                var0--;
            }
            if (field329 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field605.method2864(field328.field2053, 0, 2);
                field328.field2052 = 0;
                field329 = field328.method2401();
                var0 -= 2;
            }
            if (var0 < field329) {
                return false;
            }
            field328.field2052 = 0;
            Statics.field605.method2864(field328.field2053, 0, field329);
            field331 = 0;
            field290 = field334;
            field334 = field327;
            field327 = field530;
            if (field530 == 160) {
                int var1 = field328.method2404();
                class4 var2 = (class4) field441.method3605((long) var1);
                if (var2 != null) {
                    method34(var2, true);
                }
                if (field444 != null) {
                    method733(field444);
                    field444 = null;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 142 || field530 == 149 || field530 == 153 || field530 == 241 || field530 == 107 || field530 == 254 || field530 == 50 || field530 == 229 || field530 == 81 || field530 == 172) {
                method598();
                field530 = -1;
                return true;
            }
            if (field530 == 92) {
                field432 = field328.method2522();
                if (field432 == 255) {
                    field432 = 0;
                }
                field515 = field328.method2522();
                if (field515 == 255) {
                    field515 = 0;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 32) {
                int var3 = field328.method2404();
                int var4 = field328.method2401();
                if (var3 < -70000) {
                    var4 += 32768;
                }
                class177 var5;
                if (var3 >= 0) {
                    var5 = class177.method2979(var3);
                } else {
                    var5 = null;
                }
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field2868.length; var6++) {
                        var5.field2868[var6] = 0;
                        var5.field2908[var6] = 0;
                    }
                }
                class16.method91(var4);
                int var7 = field328.method2401();
                for (int var8 = 0; var8 < var7; var8++) {
                    int var9 = field328.method2427();
                    if (var9 == 255) {
                        var9 = field328.method2443();
                    }
                    int var10 = field328.method2436();
                    if (var5 != null && var8 < var5.field2868.length) {
                        var5.field2868[var8] = var10;
                        var5.field2908[var8] = var9;
                    }
                    class16.method94(var4, var8, var10 - 1, var9);
                }
                if (var5 != null) {
                    method733(var5);
                }
                method92();
                field551[++field469 - 1 & 0x1F] = var4 & 0x7FFF;
                field530 = -1;
                return true;
            }
            if (field530 == 245) {
                int var11 = field328.method2522();
                int var12 = field328.method2522();
                int var13 = field328.method2522();
                int var14 = field328.method2522();
                field440[var11] = true;
                field468[var11] = var12;
                field531[var11] = var13;
                field423[var11] = var14;
                field533[var11] = 0;
                field530 = -1;
                return true;
            }
            if (field530 == 226) {
                int var15 = field328.method2401();
                int var16 = field328.method2444();
                int var17 = field328.method2543();
                class4 var18 = (class4) field441.method3605((long) var16);
                if (var18 != null) {
                    method34(var18, var18.field65 != var15);
                }
                method2993(var16, var15, var17);
                field530 = -1;
                return true;
            }
            if (field530 == 75) {
                Statics.field2101 = class134.method588(field328.method2522());
                field530 = -1;
                return true;
            }
            if (field530 == 61) {
                int var19 = field328.method2404();
                int var20 = field328.method2434();
                class180.field2940[var20] = var19;
                if (class180.field2941[var20] != var19) {
                    class180.field2941[var20] = var19;
                }
                method1654(var20);
                field466[++field436 - 1 & 0x1F] = var20;
                field530 = -1;
                return true;
            }
            if (field530 == 201) {
                int var21 = field328.method2434();
                field302 = var21;
                method107(field302, Statics.field2297, Statics.field1617, false);
                method2326(var21);
                class39.method748(field302);
                for (int var22 = 0; var22 < 100; var22++) {
                    field527[var22] = true;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 193) {
                for (int var23 = 0; var23 < field332.length; var23++) {
                    if (field332[var23] != null) {
                        field332[var23].field849 = -1;
                    }
                }
                for (int var24 = 0; var24 < field283.length; var24++) {
                    if (field283[var24] != null) {
                        field283[var24].field849 = -1;
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 63) {
                method92();
                field446 = field328.method2499();
                field481 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 221) {
                String var25 = field328.method2407();
                long var26 = field328.method2405();
                long var28 = (long) field328.method2401();
                long var30 = (long) field328.method2403();
                class156 var32 = (class156) class113.method3065(class156.method2995(), field328.method2522());
                long var33 = (var28 << 32) + var30;
                boolean var35 = false;
                for (int var36 = 0; var36 < 100; var36++) {
                    if (field545[var36] == var33) {
                        var35 = true;
                        break;
                    }
                }
                if (var32.field2314 && method102(var25)) {
                    var35 = true;
                }
                if (!var35 && field402 == 0) {
                    field545[field502] = var33;
                    field502 = (field502 + 1) % 100;
                    String var37 = class227.method3926(class167.method670(class226.method3553(field328)));
                    if (var32.field2312 == -1) {
                        class12.method2095(9, var25, var37, class166.method2019(var26));
                    } else {
                        class12.method2095(9, class2.method2342(var32.field2312) + var25, var37, class166.method2019(var26));
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 210) {
                String var38 = field328.method2407();
                int var39 = field328.method2522();
                int var40 = field328.method2428();
                if (var39 >= 1 && var39 <= 8) {
                    if (var38.equalsIgnoreCase("null")) {
                        var38 = null;
                    }
                    field409[var39 - 1] = var38;
                    field369[var39 - 1] = var40 == 0;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 65) {
                int var41 = field328.method2404();
                String var42 = field328.method2407();
                class177 var43 = class177.method2979(var41);
                if (!var42.equals(var43.field2869)) {
                    var43.field2869 = var42;
                    method733(var43);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 5) {
                int var44 = field328.method2435();
                int var45 = field328.method2401();
                int var46 = field328.method2436();
                int var47 = field328.method2444();
                class177 var48 = class177.method2979(var47);
                if (var48.field2821 != var46 || var48.field2827 != var45 || var48.field2843 != var44) {
                    var48.field2821 = var46;
                    var48.field2827 = var45;
                    var48.field2843 = var44;
                    method733(var48);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 162) {
                boolean var49 = field328.method2522() == 1;
                if (var49) {
                    Statics.field559 = class119.method137() - field328.method2405();
                    Statics.field194 = new class225(field328, true);
                } else {
                    Statics.field194 = null;
                }
                field476 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 220) {
                int var50 = field328.method2435();
                if (var50 == 65535) {
                    var50 = -1;
                }
                method155(var50);
                field530 = -1;
                return true;
            }
            if (field530 == 115) {
                int var51 = field328.method2445();
                int var52 = field328.method2434();
                if (var52 == 65535) {
                    var52 = -1;
                }
                if (field517 != 0 && var52 != -1) {
                    class187.method17(Statics.field586, var52, 0, field517, false);
                    field471 = true;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 130) {
                int var53 = field328.method2444();
                int var54 = field328.method2435();
                class177 var55 = class177.method2979(var53);
                if (var55.field2891 != 2 || var55.field2833 != var54) {
                    var55.field2891 = 2;
                    var55.field2833 = var54;
                    method733(var55);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 117) {
                int var56 = field328.method2522();
                if (field328.method2522() == 0) {
                    field556[var56] = new class224();
                    field328.field2052 += 18;
                } else {
                    field328.field2052--;
                    field556[var56] = new class224(field328, false);
                }
                field475 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 251) {
                method2823(true);
                field530 = -1;
                return true;
            }
            if (field530 == 186) {
                field563 = true;
                Statics.field986 = field328.method2522();
                Statics.field2012 = field328.method2522();
                Statics.field2150 = field328.method2401();
                Statics.field694 = field328.method2522();
                Statics.field2122 = field328.method2522();
                if (Statics.field2122 >= 100) {
                    int var57 = Statics.field986 * 128 + 64;
                    int var58 = Statics.field2012 * 128 + 64;
                    int var59 = method1852(var57, var58, Statics.field223) - Statics.field2150;
                    int var60 = var57 - Statics.field2151;
                    int var61 = var59 - Statics.field2741;
                    int var62 = var58 - Statics.field1417;
                    int var63 = (int) Math.sqrt((double) (var60 * var60 + var62 * var62));
                    Statics.field2218 = (int) (Math.atan2((double) var61, (double) var63) * 325.949D) & 0x7FF;
                    Statics.field1834 = (int) (Math.atan2((double) var60, (double) var62) * -325.949D) & 0x7FF;
                    if (Statics.field2218 < 128) {
                        Statics.field2218 = 128;
                    }
                    if (Statics.field2218 > 383) {
                        Statics.field2218 = 383;
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 184) {
                int var64 = field328.method2434();
                int var65 = field328.method2431();
                int var66 = var64 >> 10 & 0x1F;
                int var67 = var64 >> 5 & 0x1F;
                int var68 = var64 & 0x1F;
                int var69 = (var68 << 3) + (var66 << 19) + (var67 << 11);
                class177 var70 = class177.method2979(var65);
                if (var70.field2814 != var69) {
                    var70.field2814 = var69;
                    method733(var70);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 222) {
                method2695(false);
                field328.method2648();
                int var71 = field328.method2401();
                class35.method771(field328, var71);
                field530 = -1;
                return true;
            }
            if (field530 == 231) {
                class28 var72 = new class28();
                var72.field659 = field328.method2407();
                var72.field651 = field328.method2401();
                int var73 = field328.method2404();
                var72.field657 = var73;
                method919(45);
                Statics.field605.method2860();
                Statics.field605 = null;
                class34.method209(var72);
                field530 = -1;
                return false;
            }
            if (field530 == 30) {
                int var74 = field329 + field328.field2052;
                int var75 = field328.method2401();
                int var76 = field328.method2401();
                if (field302 != var75) {
                    field302 = var75;
                    method107(field302, Statics.field2297, Statics.field1617, false);
                    method2326(field302);
                    class39.method748(field302);
                    for (int var77 = 0; var77 < 100; var77++) {
                        field527[var77] = true;
                    }
                }
                while (var76-- > 0) {
                    int var78 = field328.method2404();
                    int var79 = field328.method2401();
                    int var80 = field328.method2522();
                    class4 var81 = (class4) field441.method3605((long) var78);
                    if (var81 != null && var81.field65 != var79) {
                        method34(var81, true);
                        var81 = null;
                    }
                    if (var81 == null) {
                        var81 = method2993(var78, var79, var80);
                    }
                    var81.field62 = true;
                }
                for (class4 var82 = (class4) field441.method3608(); var82 != null; var82 = (class4) field441.method3613()) {
                    if (var82.field62) {
                        var82.field62 = false;
                    } else {
                        method34(var82, true);
                    }
                }
                field438 = new class200(512);
                while (field328.field2052 < var74) {
                    int var83 = field328.method2404();
                    int var84 = field328.method2401();
                    int var85 = field328.method2401();
                    int var86 = field328.method2404();
                    for (int var87 = var84; var87 <= var85; var87++) {
                        long var88 = ((long) var83 << 32) + (long) var87;
                        field438.method3606(new class205(var86), var88);
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 250) {
                int var90 = field328.method2435();
                int var91 = field328.method2444();
                int var92 = field328.method2401();
                class177 var93 = class177.method2979(var91);
                var93.field2888 = (var90 << 16) + var92;
                field530 = -1;
                return true;
            }
            if (field530 == 240) {
                String var94 = field328.method2407();
                String var95 = class227.method3926(class167.method670(class226.method3553(field328)));
                class12.method3563(6, var94, var95);
                field530 = -1;
                return true;
            }
            if (field530 == 108) {
                for (int var96 = 0; var96 < Statics.field1212; var96++) {
                    class57 var97 = class57.method1845(var96);
                    if (var97 != null) {
                        class180.field2940[var96] = 0;
                        class180.field2941[var96] = 0;
                    }
                }
                method92();
                field436 += 32;
                field530 = -1;
                return true;
            }
            if (field530 == 102) {
                while (field328.field2052 < field329) {
                    boolean var98 = field328.method2522() == 1;
                    String var99 = field328.method2407();
                    String var100 = field328.method2407();
                    int var101 = field328.method2401();
                    int var102 = field328.method2522();
                    int var103 = field328.method2522();
                    boolean var104 = (var103 & 0x2) != 0;
                    boolean var105 = (var103 & 0x1) != 0;
                    if (var101 > 0) {
                        field328.method2407();
                        field328.method2522();
                        field328.method2404();
                    }
                    field328.method2407();
                    for (int var106 = 0; var106 < field298; var106++) {
                        class18 var107 = field549[var106];
                        if (var98) {
                            if (var100.equals(var107.field245)) {
                                var107.field245 = var99;
                                var107.field244 = var100;
                                var99 = null;
                                break;
                            }
                        } else if (var99.equals(var107.field245)) {
                            if (var107.field251 != var101) {
                                boolean var108 = true;
                                for (class41 var109 = (class41) field317.method3602(); var109 != null; var109 = (class41) field317.method3595()) {
                                    if (var109.field881.equals(var99)) {
                                        if (var101 != 0 && var109.field879 == 0) {
                                            var109.method3740();
                                            var108 = false;
                                        } else if (var101 == 0 && var109.field879 != 0) {
                                            var109.method3740();
                                            var108 = false;
                                        }
                                    }
                                }
                                if (var108) {
                                    field317.method3593(new class41(var99, var101));
                                }
                                var107.field251 = var101;
                            }
                            var107.field244 = var100;
                            var107.field246 = var102;
                            var107.field247 = var104;
                            var107.field243 = var105;
                            var99 = null;
                            break;
                        }
                    }
                    if (var99 != null && field298 < 400) {
                        class18 var110 = new class18();
                        field549[field298] = var110;
                        var110.field245 = var99;
                        var110.field244 = var100;
                        var110.field251 = var101;
                        var110.field246 = var102;
                        var110.field247 = var104;
                        var110.field243 = var105;
                        field298++;
                    }
                }
                field495 = 2;
                field473 = field296;
                boolean var111 = false;
                int var112 = field298;
                while (var112 > 0) {
                    boolean var113 = true;
                    var112--;
                    for (int var114 = 0; var114 < var112; var114++) {
                        boolean var115 = false;
                        class18 var116 = field549[var114];
                        class18 var117 = field549[var114 + 1];
                        if (field492 != var116.field251 && field492 == var117.field251) {
                            var115 = true;
                        }
                        if (!var115 && var116.field251 == 0 && var117.field251 != 0) {
                            var115 = true;
                        }
                        if (!var115 && !var116.field247 && var117.field247) {
                            var115 = true;
                        }
                        if (!var115 && !var116.field243 && var117.field243) {
                            var115 = true;
                        }
                        if (var115) {
                            class18 var118 = field549[var114];
                            field549[var114] = field549[var114 + 1];
                            field549[var114 + 1] = var118;
                            var113 = false;
                        }
                    }
                    if (var113) {
                        break;
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 237) {
                int var119 = field328.method2404();
                class177 var120 = class177.method2979(var119);
                for (int var121 = 0; var121 < var120.field2868.length; var121++) {
                    var120.field2868[var121] = -1;
                    var120.field2868[var121] = 0;
                }
                method733(var120);
                field530 = -1;
                return true;
            }
            if (field530 == 192) {
                int var122 = field328.method2444();
                int var123 = field328.method2401();
                if (var123 == 65535) {
                    var123 = -1;
                }
                int var124 = field328.method2443();
                class177 var125 = class177.method2979(var124);
                if (var125.field2788) {
                    var125.field2839 = var123;
                    var125.field2862 = var122;
                    class56 var127 = class56.method905(var123);
                    var125.field2821 = var127.field1185;
                    var125.field2827 = var127.field1175;
                    var125.field2842 = var127.field1199;
                    var125.field2838 = var127.field1171;
                    var125.field2861 = var127.field1172;
                    var125.field2843 = var127.field1167;
                    if (var127.field1173 == 1) {
                        var125.field2847 = 1;
                    } else {
                        var125.field2847 = 2;
                    }
                    if (var125.field2845 > 0) {
                        var125.field2843 = var125.field2843 * 32 / var125.field2845;
                    } else if (var125.field2800 > 0) {
                        var125.field2843 = var125.field2843 * 32 / var125.field2800;
                    }
                    method733(var125);
                } else if (var123 == -1) {
                    var125.field2891 = 0;
                    field530 = -1;
                    return true;
                } else {
                    class56 var126 = class56.method905(var123);
                    var125.field2891 = 4;
                    var125.field2833 = var123;
                    var125.field2821 = var126.field1185;
                    var125.field2827 = var126.field1175;
                    var125.field2843 = var126.field1167 * 100 / var122;
                    method733(var125);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 141) {
                field458 = field328.method2434() * 30;
                field481 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 90) {
                String var128 = field328.method2407();
                int var129 = field328.method2401();
                byte var130 = field328.method2400();
                boolean var131 = false;
                if (var130 == -128) {
                    var131 = true;
                }
                if (var131) {
                    if (Statics.field225 == 0) {
                        field530 = -1;
                        return true;
                    }
                    boolean var132 = false;
                    int var133;
                    for (var133 = 0; var133 < Statics.field225 && (!Statics.field1683[var133].field638.equals(var128) || Statics.field1683[var133].field633 != var129); var133++) {
                    }
                    if (var133 < Statics.field225) {
                        while (var133 < Statics.field225 - 1) {
                            Statics.field1683[var133] = Statics.field1683[var133 + 1];
                            var133++;
                        }
                        Statics.field225--;
                        Statics.field1683[Statics.field225] = null;
                    }
                } else {
                    field328.method2407();
                    class26 var134 = new class26();
                    var134.field638 = var128;
                    var134.field632 = class168.method947(var134.field638, Statics.field2189);
                    var134.field633 = var129;
                    var134.field634 = var130;
                    int var135;
                    for (var135 = Statics.field225 - 1; var135 >= 0; var135--) {
                        int var136 = Statics.field1683[var135].field632.compareTo(var134.field632);
                        if (var136 == 0) {
                            Statics.field1683[var135].field633 = var129;
                            Statics.field1683[var135].field634 = var130;
                            if (var128.equals(Statics.field767.field56)) {
                                Statics.field1593 = var130;
                            }
                            field282 = field296;
                            field530 = -1;
                            return true;
                        }
                        if (var136 < 0) {
                            break;
                        }
                    }
                    if (Statics.field225 >= Statics.field1683.length) {
                        field530 = -1;
                        return true;
                    }
                    for (int var137 = Statics.field225 - 1; var137 > var135; var137--) {
                        Statics.field1683[var137 + 1] = Statics.field1683[var137];
                    }
                    if (Statics.field225 == 0) {
                        Statics.field1683 = new class26[100];
                    }
                    Statics.field1683[var135 + 1] = var134;
                    Statics.field225++;
                    if (var128.equals(Statics.field767.field56)) {
                        Statics.field1593 = var130;
                    }
                }
                field282 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 2) {
                field370 = field328.method2522();
                field530 = -1;
                return true;
            }
            if (field530 == 76) {
                int var138 = field328.method2431();
                int var139 = field328.method2435();
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = field328.method2434();
                if (var140 == 65535) {
                    var140 = -1;
                }
                int var141 = field328.method2444();
                for (int var142 = var140; var142 <= var139; var142++) {
                    long var143 = ((long) var141 << 32) + (long) var142;
                    class212 var145 = field438.method3605(var143);
                    if (var145 != null) {
                        var145.method3744();
                    }
                    field438.method3606(new class205(var138), var143);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 249) {
                class35.method771(field328, field329);
                field530 = -1;
                return true;
            }
            if (field530 == 216) {
                String var146 = field328.method2407();
                Object[] var147 = new Object[var146.length() + 1];
                for (int var148 = var146.length() - 1; var148 >= 0; var148--) {
                    if (var146.charAt(var148) == 's') {
                        var147[var148 + 1] = field328.method2407();
                    } else {
                        var147[var148 + 1] = Integer.valueOf(field328.method2404());
                    }
                }
                var147[0] = Integer.valueOf(field328.method2404());
                class1 var149 = new class1();
                var149.field2 = var147;
                class39.method2320(var149);
                field530 = -1;
                return true;
            }
            if (field530 == 181) {
                boolean var150 = field328.method2427() == 1;
                int var151 = field328.method2431();
                class177 var152 = class177.method2979(var151);
                if (var152.field2809 != var150) {
                    var152.field2809 = var150;
                    method733(var152);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 200) {
                Statics.field1488 = field328.method2427();
                Statics.field275 = field328.method2428();
                while (field328.field2052 < field329) {
                    field530 = field328.method2522();
                    method598();
                }
                field530 = -1;
                return true;
            }
            if (field530 == 214) {
                int var153 = field328.method2516();
                int var154 = field328.method2443();
                class177 var155 = class177.method2979(var154);
                if (var155.field2836 != var153 || var153 == -1) {
                    var155.field2836 = var153;
                    var155.field2911 = 0;
                    var155.field2912 = 0;
                    method733(var155);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 161) {
                class215.method2980(field328, field329);
                field530 = -1;
                return true;
            }
            if (field530 == 112) {
                field563 = true;
                Statics.field2951 = field328.method2522();
                Statics.field2947 = field328.method2522();
                Statics.field2094 = field328.method2401();
                Statics.field1448 = field328.method2522();
                Statics.field2954 = field328.method2522();
                if (Statics.field2954 >= 100) {
                    Statics.field2151 = Statics.field2951 * 128 + 64;
                    Statics.field1417 = Statics.field2947 * 128 + 64;
                    Statics.field2741 = method1852(Statics.field2151, Statics.field1417, Statics.field223) - Statics.field2094;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 62) {
                while (field328.field2052 < field329) {
                    int var156 = field328.method2522();
                    boolean var157 = (var156 & 0x1) == 1;
                    String var158 = field328.method2407();
                    String var159 = field328.method2407();
                    field328.method2407();
                    for (int var160 = 0; var160 < field295; var160++) {
                        class8 var161 = field333[var160];
                        if (var157) {
                            if (var159.equals(var161.field129)) {
                                var161.field129 = var158;
                                var161.field130 = var159;
                                var158 = null;
                                break;
                            }
                        } else if (var158.equals(var161.field129)) {
                            var161.field129 = var158;
                            var161.field130 = var159;
                            var158 = null;
                            break;
                        }
                    }
                    if (var158 != null && field295 < 400) {
                        class8 var162 = new class8();
                        field333[field295] = var162;
                        var162.field129 = var158;
                        var162.field130 = var159;
                        field295++;
                    }
                }
                field473 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 46) {
                Statics.field1488 = field328.method2543();
                Statics.field275 = field328.method2427();
                for (int var163 = Statics.field1488; var163 < Statics.field1488 + 8; var163++) {
                    for (int var164 = Statics.field275; var164 < Statics.field275 + 8; var164++) {
                        if (field413[Statics.field223][var163][var164] != null) {
                            field413[Statics.field223][var163][var164] = null;
                            method587(var163, var164);
                        }
                    }
                }
                for (class17 var165 = (class17) field414.method3646(); var165 != null; var165 = (class17) field414.method3648()) {
                    if (var165.field230 >= Statics.field1488 && var165.field230 < Statics.field1488 + 8 && var165.field231 >= Statics.field275 && var165.field231 < Statics.field275 + 8 && Statics.field223 == var165.field235) {
                        var165.field239 = 0;
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 34) {
                int var166 = field328.method2401();
                int var167 = field328.method2522();
                int var168 = field328.method2401();
                method40(var166, var167, var168);
                field530 = -1;
                return true;
            }
            if (field530 == 152) {
                String var169 = field328.method2407();
                long var170 = (long) field328.method2401();
                long var172 = (long) field328.method2403();
                class156 var174 = (class156) class113.method3065(class156.method2995(), field328.method2522());
                long var175 = (var170 << 32) + var172;
                boolean var177 = false;
                for (int var178 = 0; var178 < 100; var178++) {
                    if (field545[var178] == var175) {
                        var177 = true;
                        break;
                    }
                }
                if (method102(var169)) {
                    var177 = true;
                }
                if (!var177 && field402 == 0) {
                    field545[field502] = var175;
                    field502 = (field502 + 1) % 100;
                    String var179 = class227.method3926(class167.method670(class226.method3553(field328)));
                    byte var180;
                    if (var174.field2313) {
                        var180 = 7;
                    } else {
                        var180 = 3;
                    }
                    if (var174.field2312 == -1) {
                        class12.method3563(var180, var169, var179);
                    } else {
                        class12.method3563(var180, class2.method2342(var174.field2312) + var169, var179);
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 154) {
                Statics.field1488 = field328.method2522();
                Statics.field275 = field328.method2428();
                field530 = -1;
                return true;
            }
            if (field530 == 4) {
                int var181 = field328.method2431();
                int var182 = field328.method2444();
                class4 var183 = (class4) field441.method3605((long) var182);
                class4 var184 = (class4) field441.method3605((long) var181);
                if (var184 != null) {
                    method34(var184, var183 == null || var183.field65 != var184.field65);
                }
                if (var183 != null) {
                    var183.method3744();
                    field441.method3606(var183, (long) var181);
                }
                class177 var185 = class177.method2979(var182);
                if (var185 != null) {
                    method733(var185);
                }
                class177 var186 = class177.method2979(var181);
                if (var186 != null) {
                    method733(var186);
                    method3222(Statics.field2910[var186.field2789 >>> 16], var186, true);
                }
                if (field302 != -1) {
                    method147(field302, 1);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 138) {
                int var187 = field328.method2401();
                int var188 = field328.method2443();
                class177 var189 = class177.method2979(var188);
                if (var189 != null && var189.field2840 == 0) {
                    if (var187 > var189.field2791 - var189.field2906) {
                        var187 = var189.field2791 - var189.field2906;
                    }
                    if (var187 < 0) {
                        var187 = 0;
                    }
                    if (var189.field2909 != var187) {
                        var189.field2909 = var187;
                        method733(var189);
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 33) {
                field563 = false;
                for (int var190 = 0; var190 < 5; var190++) {
                    field440[var190] = false;
                }
                field530 = -1;
                return true;
            }
            if (field530 == 196) {
                if (field302 != -1) {
                    method147(field302, 0);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 175) {
                int var191 = field328.method2444();
                int var192 = field328.method2436();
                class177 var193 = class177.method2979(var191);
                if (var193.field2891 != 1 || var193.field2833 != var192) {
                    var193.field2891 = 1;
                    var193.field2833 = var192;
                    method733(var193);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 72) {
                method2823(false);
                field530 = -1;
                return true;
            }
            if (field530 == 137) {
                method77();
                field530 = -1;
                return false;
            }
            if (field530 == 89) {
                int var194 = field328.method2404();
                int var195 = field328.method2404();
                if (Statics.field1206 == null || !Statics.field1206.isValid()) {
                    try {
                        Iterator var196 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var196.hasNext()) {
                            GarbageCollectorMXBean var197 = (GarbageCollectorMXBean) var196.next();
                            if (var197.isValid()) {
                                Statics.field1206 = var197;
                                field536 = -1L;
                                field558 = -1L;
                            }
                        }
                    } catch (Throwable var254) {
                    }
                }
                long var199 = class119.method137();
                int var201 = -1;
                if (Statics.field1206 != null) {
                    long var202 = Statics.field1206.getCollectionTime();
                    if (field558 != -1L) {
                        long var204 = var202 - field558;
                        long var206 = var199 - field536;
                        if (var206 != 0L) {
                            var201 = (int) (var204 * 100L / var206);
                        }
                    }
                    field558 = var202;
                    field536 = var199;
                }
                field398.method2634(255);
                field398.method2424(field2253);
                field398.method2440(var194);
                field398.method2387(var195);
                field398.method2384(var201);
                field530 = -1;
                return true;
            }
            if (field530 == 128) {
                class35.method142();
                for (int var208 = 0; var208 < 2048; var208++) {
                    field332[var208] = null;
                }
                class35.method599(field328);
                field530 = -1;
                return true;
            }
            if (field530 == 195) {
                int var209 = field328.method2412();
                boolean var210 = field328.method2522() == 1;
                String var211 = "";
                boolean var212 = false;
                if (var210) {
                    var211 = field328.method2407();
                    if (method102(var211)) {
                        var212 = true;
                    }
                }
                String var213 = field328.method2407();
                if (!var212) {
                    class12.method3563(var209, var211, var213);
                }
                field530 = -1;
                return true;
            }
            if (field530 == 58) {
                field498 = field328.method2522();
                field325 = field328.method2522();
                field530 = -1;
                return true;
            }
            if (field530 == 169) {
                int var214 = field328.method2443();
                int var215 = field328.method2499();
                int var216 = field328.method2516();
                class177 var217 = class177.method2979(var214);
                if (var217.field2798 != var215 || var217.field2799 != var216 || var217.field2794 != 0 || var217.field2795 != 0) {
                    var217.field2798 = var215;
                    var217.field2799 = var216;
                    var217.field2794 = 0;
                    var217.field2795 = 0;
                    method733(var217);
                    method152(var217);
                    if (var217.field2840 == 0) {
                        method3222(Statics.field2910[var214 >> 16], var217, false);
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 93) {
                method2695(true);
                field328.method2648();
                int var218 = field328.method2401();
                class35.method771(field328, var218);
                field530 = -1;
                return true;
            }
            if (field530 == 25) {
                method92();
                field382 = field328.method2522();
                field481 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 147) {
                method92();
                int var219 = field328.method2431();
                int var220 = field328.method2428();
                int var221 = field328.method2543();
                field419[var220] = var219;
                field417[var220] = var221;
                field547[var220] = 1;
                for (int var222 = 0; var222 < 98; var222++) {
                    if (var219 >= class159.field2341[var222]) {
                        field547[var220] = var222 + 2;
                    }
                }
                field470[++field445 - 1 & 0x1F] = var220;
                field530 = -1;
                return true;
            }
            if (field530 == 208) {
                field328.field2052 += 28;
                if (field328.method2422()) {
                    class126 var223 = field328;
                    int var224 = field328.field2052 - 28;
                    if (class153.field2276 != null) {
                        try {
                            class153.field2276.method3963(0L);
                            class153.field2276.method3973(var223.field2053, var224, 24);
                        } catch (Exception var253) {
                        }
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 67) {
                field495 = 1;
                field473 = field296;
                field530 = -1;
                return true;
            }
            if (field530 == 35) {
                field299 = field328.method2522();
                if (field299 == 1) {
                    field279 = field328.method2401();
                }
                if (field299 >= 2 && field299 <= 6) {
                    if (field299 == 2) {
                        field305 = 64;
                        field280 = 64;
                    }
                    if (field299 == 3) {
                        field305 = 0;
                        field280 = 64;
                    }
                    if (field299 == 4) {
                        field305 = 128;
                        field280 = 64;
                    }
                    if (field299 == 5) {
                        field305 = 64;
                        field280 = 0;
                    }
                    if (field299 == 6) {
                        field305 = 64;
                        field280 = 128;
                    }
                    field299 = 2;
                    field354 = field328.method2401();
                    field358 = field328.method2401();
                    field304 = field328.method2522();
                }
                if (field299 == 10) {
                    field534 = field328.method2401();
                }
                field530 = -1;
                return true;
            }
            if (field530 == 123) {
                method768(field328.method2407());
                field530 = -1;
                return true;
            }
            if (field530 == 189) {
                int var226 = field328.method2404();
                class177 var227 = class177.method2979(var226);
                var227.field2891 = 3;
                var227.field2833 = Statics.field767.field32.method3341();
                method733(var227);
                field530 = -1;
                return true;
            }
            if (field530 == 180) {
                field282 = field296;
                if (field329 == 0) {
                    field507 = null;
                    field508 = null;
                    Statics.field225 = 0;
                    Statics.field1683 = null;
                    field530 = -1;
                    return true;
                }
                field508 = field328.method2407();
                long var228 = field328.method2405();
                field507 = class166.method139(var228);
                Statics.field971 = field328.method2400();
                int var230 = field328.method2522();
                if (var230 == 255) {
                    field530 = -1;
                    return true;
                }
                Statics.field225 = var230;
                class26[] var231 = new class26[100];
                for (int var232 = 0; var232 < Statics.field225; var232++) {
                    var231[var232] = new class26();
                    var231[var232].field638 = field328.method2407();
                    var231[var232].field632 = class168.method947(var231[var232].field638, Statics.field2189);
                    var231[var232].field633 = field328.method2401();
                    var231[var232].field634 = field328.method2400();
                    field328.method2407();
                    if (var231[var232].field638.equals(Statics.field767.field56)) {
                        Statics.field1593 = var231[var232].field634;
                    }
                }
                boolean var233 = false;
                int var234 = Statics.field225;
                while (var234 > 0) {
                    boolean var235 = true;
                    var234--;
                    for (int var236 = 0; var236 < var234; var236++) {
                        if (var231[var236].field632.compareTo(var231[var236 + 1].field632) > 0) {
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
                Statics.field1683 = var231;
                field530 = -1;
                return true;
            }
            if (field530 == 12) {
                int var238 = field328.method2431();
                Statics.field568 = Statics.field1147.method2769(var238);
                field530 = -1;
                return true;
            }
            if (field530 == 60) {
                int var239 = field328.method2435();
                byte var240 = field328.method2592();
                class180.field2940[var239] = var240;
                if (class180.field2941[var239] != var240) {
                    class180.field2941[var239] = var240;
                }
                method1654(var239);
                field466[++field436 - 1 & 0x1F] = var239;
                field530 = -1;
                return true;
            }
            if (field530 == 178) {
                for (int var241 = 0; var241 < class180.field2941.length; var241++) {
                    if (class180.field2941[var241] != class180.field2940[var241]) {
                        class180.field2941[var241] = class180.field2940[var241];
                        method1654(var241);
                        field466[++field436 - 1 & 0x1F] = var241;
                    }
                }
                field530 = -1;
                return true;
            }
            if (field530 == 73) {
                int var242 = field328.method2404();
                int var243 = field328.method2401();
                if (var242 < -70000) {
                    var243 += 32768;
                }
                class177 var244;
                if (var242 >= 0) {
                    var244 = class177.method2979(var242);
                } else {
                    var244 = null;
                }
                while (field328.field2052 < field329) {
                    int var245 = field328.method2412();
                    int var246 = field328.method2401();
                    int var247 = 0;
                    if (var246 != 0) {
                        var247 = field328.method2522();
                        if (var247 == 255) {
                            var247 = field328.method2404();
                        }
                    }
                    if (var244 != null && var245 >= 0 && var245 < var244.field2868.length) {
                        var244.field2868[var245] = var246;
                        var244.field2908[var245] = var247;
                    }
                    class16.method94(var243, var245, var246 - 1, var247);
                }
                if (var244 != null) {
                    method733(var244);
                }
                method92();
                field551[++field469 - 1 & 0x1F] = var243 & 0x7FFF;
                field530 = -1;
                return true;
            }
            if (field530 == 209) {
                int var248 = field328.method2434();
                class16.method835(var248);
                field551[++field469 - 1 & 0x1F] = var248 & 0x7FFF;
                field530 = -1;
                return true;
            }
            class152.method2194("" + field530 + class2.field20 + field334 + class2.field20 + field290 + class2.field20 + field329, (Throwable) null);
            method77();
        } catch (IOException var255) {
            method1139();
        } catch (Exception var256) {
            String var251 = "" + field530 + class2.field20 + field334 + class2.field20 + field290 + class2.field20 + field329 + class2.field20 + (Statics.field713 + Statics.field767.field872[0]) + class2.field20 + (Statics.field138 + Statics.field767.field837[0]) + class2.field20;
            for (int var252 = 0; var252 < field329 && var252 < 50; var252++) {
                var251 = var251 + field328.field2053[var252] + class2.field20;
            }
            class152.method2194(var251, var256);
            method77();
        }
        return true;
    }

    @ObfuscatedName("g.bw(I)V")
    public static final void method598() {
        if (field530 == 229) {
            int var0 = field328.method2428();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1488;
            int var2 = (var0 & 0x7) + Statics.field275;
            int var3 = field328.method2401();
            int var4 = field328.method2543();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field346[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 103 && var2 < 103) {
                if (var7 == 0) {
                    class91 var8 = Statics.field152.method1905(Statics.field223, var1, var2);
                    if (var8 != null) {
                        int var9 = var8.field1589 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var8.field1584 = new class13(var9, 2, var6 + 4, Statics.field223, var1, var2, var3, false, var8.field1584);
                            var8.field1588 = new class13(var9, 2, var6 + 1 & 0x3, Statics.field223, var1, var2, var3, false, var8.field1588);
                        } else {
                            var8.field1584 = new class13(var9, var5, var6, Statics.field223, var1, var2, var3, false, var8.field1584);
                        }
                    }
                }
                if (var7 == 1) {
                    class98 var10 = Statics.field152.method1878(Statics.field223, var1, var2);
                    if (var10 != null) {
                        int var11 = var10.field1667 >> 14 & 0x7FFF;
                        if (var5 == 4 || var5 == 5) {
                            var10.field1670 = new class13(var11, 4, var6, Statics.field223, var1, var2, var3, false, var10.field1670);
                        } else if (var5 == 6) {
                            var10.field1670 = new class13(var11, 4, var6 + 4, Statics.field223, var1, var2, var3, false, var10.field1670);
                        } else if (var5 == 7) {
                            var10.field1670 = new class13(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field223, var1, var2, var3, false, var10.field1670);
                        } else if (var5 == 8) {
                            var10.field1670 = new class13(var11, 4, var6 + 4, Statics.field223, var1, var2, var3, false, var10.field1670);
                            var10.field1666 = new class13(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field223, var1, var2, var3, false, var10.field1666);
                        }
                    }
                }
                if (var7 == 2) {
                    class102 var12 = Statics.field152.method1879(Statics.field223, var1, var2);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var12 != null) {
                        var12.field1734 = new class13(var12.field1728 >> 14 & 0x7FFF, var5, var6, Statics.field223, var1, var2, var3, false, var12.field1734);
                    }
                }
                if (var7 == 3) {
                    class97 var13 = Statics.field152.method1880(Statics.field223, var1, var2);
                    if (var13 != null) {
                        var13.field1654 = new class13(var13.field1652 >> 14 & 0x7FFF, 22, var6, Statics.field223, var1, var2, var3, false, var13.field1654);
                    }
                }
            }
        } else if (field530 == 50) {
            int var14 = field328.method2401();
            int var15 = field328.method2522();
            int var16 = (var15 >> 4 & 0x7) + Statics.field1488;
            int var17 = (var15 & 0x7) + Statics.field275;
            int var18 = field328.method2436();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class31 var19 = new class31();
                var19.field693 = var14;
                var19.field687 = var18;
                if (field413[Statics.field223][var16][var17] == null) {
                    field413[Statics.field223][var16][var17] = new class203();
                }
                field413[Statics.field223][var16][var17].method3642(var19);
                method587(var16, var17);
            }
        } else if (field530 == 254) {
            int var20 = field328.method2401();
            int var21 = field328.method2428();
            int var22 = (var21 >> 4 & 0x7) + Statics.field1488;
            int var23 = (var21 & 0x7) + Statics.field275;
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class203 var24 = field413[Statics.field223][var22][var23];
                if (var24 != null) {
                    for (class31 var25 = (class31) var24.method3646(); var25 != null; var25 = (class31) var24.method3648()) {
                        if ((var20 & 0x7FFF) == var25.field693) {
                            var25.method3744();
                            break;
                        }
                    }
                    if (var24.method3646() == null) {
                        field413[Statics.field223][var22][var23] = null;
                    }
                    method587(var22, var23);
                }
            }
        } else if (field530 == 81) {
            int var26 = field328.method2543();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = field346[var27];
            int var30 = field328.method2427();
            int var31 = (var30 >> 4 & 0x7) + Statics.field1488;
            int var32 = (var30 & 0x7) + Statics.field275;
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                method800(Statics.field223, var31, var32, var29, -1, var27, var28, 0, -1);
            }
        } else if (field530 == 149) {
            int var33 = field328.method2522();
            int var34 = (var33 >> 4 & 0x7) + Statics.field1488;
            int var35 = (var33 & 0x7) + Statics.field275;
            int var36 = field328.method2401();
            int var37 = field328.method2401();
            int var38 = field328.method2401();
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                class203 var39 = field413[Statics.field223][var34][var35];
                if (var39 != null) {
                    for (class31 var40 = (class31) var39.method3646(); var40 != null; var40 = (class31) var39.method3648()) {
                        if ((var36 & 0x7FFF) == var40.field693 && var40.field687 == var37) {
                            var40.field687 = var38;
                            break;
                        }
                    }
                    method587(var34, var35);
                }
            }
        } else if (field530 == 107) {
            int var41 = field328.method2522();
            int var42 = (var41 >> 4 & 0x7) + Statics.field1488;
            int var43 = (var41 & 0x7) + Statics.field275;
            int var44 = var42 + field328.method2400();
            int var45 = var43 + field328.method2400();
            int var46 = field328.method2499();
            int var47 = field328.method2401();
            int var48 = field328.method2522() * 4;
            int var49 = field328.method2522() * 4;
            int var50 = field328.method2401();
            int var51 = field328.method2401();
            int var52 = field328.method2522();
            int var53 = field328.method2522();
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104 && var47 != 65535) {
                int var54 = var42 * 128 + 64;
                int var55 = var43 * 128 + 64;
                int var56 = var44 * 128 + 64;
                int var57 = var45 * 128 + 64;
                class7 var58 = new class7(var47, Statics.field223, var54, var55, method1852(var54, var55, Statics.field223) - var48, field291 + var50, field291 + var51, var52, var53, var46, var49);
                var58.method83(var56, var57, method1852(var56, var57, Statics.field223) - var49, field291 + var50);
                field415.method3642(var58);
            }
        } else {
            if (field530 == 142) {
                int var59 = field328.method2522();
                int var60 = (var59 >> 4 & 0x7) + Statics.field1488;
                int var61 = (var59 & 0x7) + Statics.field275;
                int var62 = field328.method2401();
                int var63 = field328.method2522();
                int var64 = var63 >> 4 & 0xF;
                int var65 = var63 & 0x7;
                int var66 = field328.method2522();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    int var67 = var64 + 1;
                    if (Statics.field767.field872[0] >= var60 - var67 && Statics.field767.field872[0] <= var60 + var67 && Statics.field767.field837[0] >= var61 - var67 && Statics.field767.field837[0] <= var61 + var67 && field521 != 0 && var65 > 0 && field364 < 50) {
                        field523[field364] = var62;
                        field524[field364] = var65;
                        field525[field364] = var66;
                        field314[field364] = null;
                        field526[field364] = (var60 << 16) + (var61 << 8) + var64;
                        field364++;
                    }
                }
            }
            if (field530 == 153) {
                int var68 = field328.method2436();
                byte var69 = field328.method2592();
                byte var70 = field328.method2430();
                int var71 = field328.method2435();
                int var72 = field328.method2435();
                byte var73 = field328.method2592();
                int var74 = field328.method2427();
                int var75 = var74 >> 2;
                int var76 = var74 & 0x3;
                int var77 = field346[var75];
                byte var78 = field328.method2592();
                int var79 = field328.method2436();
                int var80 = field328.method2522();
                int var81 = (var80 >> 4 & 0x7) + Statics.field1488;
                int var82 = (var80 & 0x7) + Statics.field275;
                class3 var83;
                if (field376 == var72) {
                    var83 = Statics.field767;
                } else {
                    var83 = field332[var72];
                }
                if (var83 != null) {
                    class43 var84 = class43.method106(var71);
                    int var85;
                    int var86;
                    if (var76 == 1 || var76 == 3) {
                        var85 = var84.field938;
                        var86 = var84.field937;
                    } else {
                        var85 = var84.field937;
                        var86 = var84.field938;
                    }
                    int var87 = (var85 >> 1) + var81;
                    int var88 = (var85 + 1 >> 1) + var81;
                    int var89 = (var86 >> 1) + var82;
                    int var90 = (var86 + 1 >> 1) + var82;
                    int[][] var91 = class6.field79[Statics.field223];
                    int var92 = var91[var87][var89] + var91[var88][var89] + var91[var87][var90] + var91[var88][var90] >> 2;
                    int var93 = (var81 << 7) + (var85 << 6);
                    int var94 = (var82 << 7) + (var86 << 6);
                    class109 var95 = var84.method808(var75, var76, var91, var93, var92, var94);
                    if (var95 != null) {
                        method800(Statics.field223, var81, var82, var77, -1, 0, 0, var79 + 1, var68 + 1);
                        var83.field40 = field291 + var79;
                        var83.field41 = field291 + var68;
                        var83.field45 = var95;
                        var83.field43 = var81 * 128 + var85 * 64;
                        var83.field44 = var82 * 128 + var86 * 64;
                        var83.field33 = var92;
                        if (var70 > var78) {
                            byte var96 = var70;
                            var70 = var78;
                            var78 = var96;
                        }
                        if (var73 > var69) {
                            byte var97 = var73;
                            var73 = var69;
                            var69 = var97;
                        }
                        var83.field46 = var70 + var81;
                        var83.field48 = var78 + var81;
                        var83.field47 = var73 + var82;
                        var83.field31 = var69 + var82;
                    }
                }
            }
            if (field530 == 172) {
                int var98 = field328.method2427();
                int var99 = (var98 >> 4 & 0x7) + Statics.field1488;
                int var100 = (var98 & 0x7) + Statics.field275;
                int var101 = field328.method2543();
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = field346[var102];
                int var105 = field328.method2434();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    method800(Statics.field223, var99, var100, var104, var105, var102, var103, 0, -1);
                }
            } else if (field530 == 241) {
                int var106 = field328.method2522();
                int var107 = (var106 >> 4 & 0x7) + Statics.field1488;
                int var108 = (var106 & 0x7) + Statics.field275;
                int var109 = field328.method2401();
                int var110 = field328.method2522();
                int var111 = field328.method2401();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class32 var114 = new class32(var109, Statics.field223, var112, var113, method1852(var112, var113, Statics.field223) - var110, var111, field291);
                    field416.method3642(var114);
                }
            }
        }
    }

    @ObfuscatedName("ap.bi(IIIIIIIIII)V")
    public static final void method800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field414.method3646(); var10 != null; var10 = (class17) field414.method3648()) {
            if (var10.field235 == arg0 && var10.field230 == arg1 && var10.field231 == arg2 && var10.field232 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field235 = arg0;
            var9.field232 = arg3;
            var9.field230 = arg1;
            var9.field231 = arg2;
            method837(var9);
            field414.method3642(var9);
        }
        var9.field229 = arg4;
        var9.field237 = arg5;
        var9.field240 = arg6;
        var9.field238 = arg7;
        var9.field239 = arg8;
    }

    @ObfuscatedName("ap.bh(S)V")
    public static final void method799() {
        for (class17 var0 = (class17) field414.method3646(); var0 != null; var0 = (class17) field414.method3648()) {
            if (var0.field239 == -1) {
                var0.field238 = 0;
                method837(var0);
            } else {
                var0.method3744();
            }
        }
    }

    @ObfuscatedName("ak.bg(Lo;B)V")
    public static final void method837(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field232 == 0) {
            var1 = Statics.field152.method1935(arg0.field235, arg0.field230, arg0.field231);
        }
        if (arg0.field232 == 1) {
            var1 = Statics.field152.method1882(arg0.field235, arg0.field230, arg0.field231);
        }
        if (arg0.field232 == 2) {
            var1 = Statics.field152.method2014(arg0.field235, arg0.field230, arg0.field231);
        }
        if (arg0.field232 == 3) {
            var1 = Statics.field152.method1917(arg0.field235, arg0.field230, arg0.field231);
        }
        if (var1 != 0) {
            int var5 = Statics.field152.method1885(arg0.field235, arg0.field230, arg0.field231, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field236 = var2;
        arg0.field234 = var3;
        arg0.field228 = var4;
    }

    @ObfuscatedName("cm.bu(IIIIIIIB)V")
    public static final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field287 && Statics.field223 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field152.method1935(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field152.method1882(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field152.method2014(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field152.method1917(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field152.method1885(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field152.method1872(arg0, arg2, arg3);
                class43 var15 = class43.method106(var12);
                if (var15.field939 != 0) {
                    field343[arg0].method2285(arg2, arg3, var13, var14, var15.field968);
                }
            }
            if (arg1 == 1) {
                Statics.field152.method2004(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field152.method1874(arg0, arg2, arg3);
                class43 var16 = class43.method106(var12);
                if (var16.field937 + arg2 > 103 || var16.field937 + arg3 > 103 || var16.field938 + arg2 > 103 || var16.field938 + arg3 > 103) {
                    return;
                }
                if (var16.field939 != 0) {
                    field343[arg0].method2278(arg2, arg3, var16.field937, var16.field938, var14, var16.field968);
                }
            }
            if (arg1 == 3) {
                Statics.field152.method1875(arg0, arg2, arg3);
                class43 var17 = class43.method106(var12);
                if (var17.field939 == 1) {
                    field343[arg0].method2288(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field83[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class90 var19 = Statics.field152;
        class112 var20 = field343[arg0];
        class43 var21 = class43.method106(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field938;
            var23 = var21.field937;
        } else {
            var22 = var21.field937;
            var23 = var21.field938;
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
        int[][] var28 = class6.field79[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field959 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field962 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class89 var34;
            if (var21.field945 == -1 && var21.field963 == null) {
                var34 = var21.method808(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1861(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field939 == 1) {
                var20.method2293(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var57;
            if (var21.field945 == -1 && var21.field963 == null) {
                var57 = var21.method808(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            if (var57 != null) {
                var19.method1937(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field939 != 0) {
                var20.method2281(arg2, arg3, var22, var23, var21.field968);
            }
        } else if (arg6 >= 12) {
            class89 var35;
            if (var21.field945 == -1 && var21.field963 == null) {
                var35 = var21.method808(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1937(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field939 != 0) {
                var20.method2281(arg2, arg3, var22, var23, var21.field968);
            }
        } else if (arg6 == 0) {
            class89 var36;
            if (var21.field945 == -1 && var21.field963 == null) {
                var36 = var21.method808(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1863(arg0, arg2, arg3, var29, var36, (class89) null, class6.field87[arg5], 0, var32, var33);
            if (var21.field939 != 0) {
                var20.method2280(arg2, arg3, arg6, arg5, var21.field968);
            }
        } else if (arg6 == 1) {
            class89 var37;
            if (var21.field945 == -1 && var21.field963 == null) {
                var37 = var21.method808(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1863(arg0, arg2, arg3, var29, var37, (class89) null, class6.field88[arg5], 0, var32, var33);
            if (var21.field939 != 0) {
                var20.method2280(arg2, arg3, arg6, arg5, var21.field968);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class89 var39;
            class89 var40;
            if (var21.field945 == -1 && var21.field963 == null) {
                var39 = var21.method808(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method808(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field945, true, (class89) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1863(arg0, arg2, arg3, var29, var39, var40, class6.field87[arg5], class6.field87[var38], var32, var33);
            if (var21.field939 != 0) {
                var20.method2280(arg2, arg3, arg6, arg5, var21.field968);
            }
        } else if (arg6 == 3) {
            class89 var41;
            if (var21.field945 == -1 && var21.field963 == null) {
                var41 = var21.method808(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1863(arg0, arg2, arg3, var29, var41, (class89) null, class6.field88[arg5], 0, var32, var33);
            if (var21.field939 != 0) {
                var20.method2280(arg2, arg3, arg6, arg5, var21.field968);
            }
        } else if (arg6 == 9) {
            class89 var42;
            if (var21.field945 == -1 && var21.field963 == null) {
                var42 = var21.method808(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1937(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field939 != 0) {
                var20.method2281(arg2, arg3, var22, var23, var21.field968);
            }
        } else if (arg6 == 4) {
            class89 var43;
            if (var21.field945 == -1 && var21.field963 == null) {
                var43 = var21.method808(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1912(arg0, arg2, arg3, var29, var43, (class89) null, class6.field87[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1935(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class43.method106(var45 >> 14 & 0x7FFF).field946;
            }
            class89 var46;
            if (var21.field945 == -1 && var21.field963 == null) {
                var46 = var21.method808(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1912(arg0, arg2, arg3, var29, var46, (class89) null, class6.field87[arg5], 0, class6.field86[arg5] * var44, class6.field90[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1935(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class43.method106(var48 >> 14 & 0x7FFF).field946 / 2;
            }
            class89 var49;
            if (var21.field945 == -1 && var21.field963 == null) {
                var49 = var21.method808(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1912(arg0, arg2, arg3, var29, var49, (class89) null, 256, arg5, class6.field99[arg5] * var47, class6.field92[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class89 var51;
            if (var21.field945 == -1 && var21.field963 == null) {
                var51 = var21.method808(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1912(arg0, arg2, arg3, var29, var51, (class89) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1935(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class43.method106(var53 >> 14 & 0x7FFF).field946 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class89 var55;
            class89 var56;
            if (var21.field945 == -1 && var21.field963 == null) {
                var55 = var21.method808(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method808(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field945, true, (class89) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field945, true, (class89) null);
            }
            var19.method1912(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field99[arg5] * var52, class6.field92[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("y.bp(III)V")
    public static final void method587(int arg0, int arg1) {
        class203 var2 = field413[Statics.field223][arg0][arg1];
        if (var2 == null) {
            Statics.field152.method1876(Statics.field223, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3646(); var6 != null; var6 = (class31) var2.method3648()) {
            class56 var7 = class56.method905(var6.field693);
            long var8 = (long) var7.field1181;
            if (var7.field1173 == 1) {
                var8 = (long) (var6.field687 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field152.method1876(Statics.field223, arg0, arg1);
            return;
        }
        var2.method3666(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3646(); var12 != null; var12 = (class31) var2.method3648()) {
            if (var5.field693 != var12.field693) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field693 != var12.field693 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field152.method1931(Statics.field223, arg0, arg1, method1852(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field223), var5, var13, var10, var11);
    }

    @ObfuscatedName("ep.bd(ZI)V")
    public static final void method2823(boolean arg0) {
        field497 = 0;
        field324 = 0;
        method1575();
        method846(arg0);
        method949();
        for (int var1 = 0; var1 < field497; var1++) {
            int var2 = field407[var1];
            if (field291 != field283[var2].field866) {
                field283[var2].field787 = null;
                field283[var2] = null;
            }
        }
        if (field329 != field328.field2052) {
            throw new RuntimeException(field328.field2052 + class2.field20 + field329);
        }
        for (int var3 = 0; var3 < field322; var3++) {
            if (field283[field406[var3]] == null) {
                throw new RuntimeException(var3 + class2.field20 + field322);
            }
        }
    }

    @ObfuscatedName("bj.bf(I)V")
    public static final void method1575() {
        field328.method2636();
        int var0 = field328.method2637(8);
        if (var0 < field322) {
            for (int var1 = var0; var1 < field322; var1++) {
                field407[++field497 - 1] = field406[var1];
            }
        }
        if (var0 > field322) {
            throw new RuntimeException("");
        }
        field322 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field406[var2];
            class37 var4 = field283[var3];
            int var5 = field328.method2637(1);
            if (var5 == 0) {
                field406[++field322 - 1] = var3;
                var4.field866 = field291;
            } else {
                int var6 = field328.method2637(2);
                if (var6 == 0) {
                    field406[++field322 - 1] = var3;
                    var4.field866 = field291;
                    field457[++field324 - 1] = var3;
                } else if (var6 == 1) {
                    field406[++field322 - 1] = var3;
                    var4.field866 = field291;
                    int var7 = field328.method2637(3);
                    var4.method728(var7, (byte) 1);
                    int var8 = field328.method2637(1);
                    if (var8 == 1) {
                        field457[++field324 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field406[++field322 - 1] = var3;
                    var4.field866 = field291;
                    int var9 = field328.method2637(3);
                    var4.method728(var9, (byte) 2);
                    int var10 = field328.method2637(3);
                    var4.method728(var10, (byte) 2);
                    int var11 = field328.method2637(1);
                    if (var11 == 1) {
                        field457[++field324 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field407[++field497 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ag.bx(ZI)V")
    public static final void method846(boolean arg0) {
        while (true) {
            if (field328.method2653(field329) >= 27) {
                int var1 = field328.method2637(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field283[var1] == null) {
                        field283[var1] = new class37();
                        var2 = true;
                    }
                    class37 var3 = field283[var1];
                    field406[++field322 - 1] = var1;
                    var3.field866 = field291;
                    int var4;
                    if (arg0) {
                        var4 = field328.method2637(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field328.method2637(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5;
                    if (arg0) {
                        var5 = field328.method2637(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field328.method2637(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field353[field328.method2637(3)];
                    if (var2) {
                        var3.field874 = var3.field819 = var6;
                    }
                    var3.field787 = class42.method644(field328.method2637(14));
                    int var7 = field328.method2637(1);
                    int var8 = field328.method2637(1);
                    if (var8 == 1) {
                        field457[++field324 - 1] = var1;
                    }
                    var3.field843 = var3.field787.field895;
                    var3.field870 = var3.field787.field889;
                    if (var3.field870 == 0) {
                        var3.field819 = 0;
                    }
                    var3.field825 = var3.field787.field896;
                    var3.field826 = var3.field787.field894;
                    var3.field827 = var3.field787.field898;
                    var3.field828 = var3.field787.field893;
                    var3.field822 = var3.field787.field890;
                    var3.field848 = var3.field787.field913;
                    var3.field824 = var3.field787.field920;
                    var3.method729(Statics.field767.field872[0] + var5, Statics.field767.field837[0] + var4, var7 == 1);
                    continue;
                }
            }
            field328.method2644();
            return;
        }
    }

    @ObfuscatedName("av.by(B)V")
    public static final void method949() {
        for (int var0 = 0; var0 < field324; var0++) {
            int var1 = field457[var0];
            class37 var2 = field283[var1];
            int var3 = field328.method2522();
            if ((var3 & 0x10) != 0) {
                var2.field846 = field328.method2436();
                if (var2.field846 == 65535) {
                    var2.field846 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field328.method2428();
                if (var4 > 0) {
                    for (int var5 = 0; var5 < var4; var5++) {
                        int var6 = -1;
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = field328.method2412();
                        if (var9 == 32767) {
                            var9 = field328.method2412();
                            var7 = field328.method2412();
                            var6 = field328.method2412();
                            var8 = field328.method2412();
                        } else if (var9 == 32766) {
                            var9 = -1;
                        } else {
                            var7 = field328.method2412();
                        }
                        int var10 = field328.method2412();
                        var2.method752(var9, var7, var6, var8, field291, var10);
                    }
                }
                int var11 = field328.method2428();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = field328.method2412();
                        int var14 = field328.method2412();
                        if (var14 == 32767) {
                            var2.method750(var13);
                        } else {
                            int var15 = field328.method2412();
                            int var16 = field328.method2427();
                            int var17 = var14 > 0 ? field328.method2543() : var16;
                            var2.method753(var13, field291, var14, var15, var16, var17);
                        }
                    }
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field830 = field328.method2407();
                var2.field833 = 100;
            }
            if ((var3 & 0x2) != 0) {
                var2.field787 = class42.method644(field328.method2435());
                var2.field843 = var2.field787.field895;
                var2.field870 = var2.field787.field889;
                var2.field825 = var2.field787.field896;
                var2.field826 = var2.field787.field894;
                var2.field827 = var2.field787.field898;
                var2.field828 = var2.field787.field893;
                var2.field822 = var2.field787.field890;
                var2.field848 = var2.field787.field913;
                var2.field824 = var2.field787.field920;
            }
            if ((var3 & 0x4) != 0) {
                int var18 = field328.method2434();
                int var19 = field328.method2434();
                int var20 = var2.field864 - (var18 - Statics.field713 - Statics.field713) * 64;
                int var21 = var2.field818 - (var19 - Statics.field138 - Statics.field138) * 64;
                if (var20 != 0 || var21 != 0) {
                    var2.field845 = (int) (Math.atan2((double) var20, (double) var21) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field854 = field328.method2401();
                int var22 = field328.method2431();
                var2.field861 = var22 >> 16;
                var2.field847 = (var22 & 0xFFFF) + field291;
                var2.field836 = 0;
                var2.field856 = 0;
                if (var2.field847 > field291) {
                    var2.field836 = -1;
                }
                if (var2.field854 == 65535) {
                    var2.field854 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var23 = field328.method2435();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = field328.method2522();
                if (var2.field849 == var23 && var23 != -1) {
                    int var25 = class45.method1289(var23).field1007;
                    if (var25 == 1) {
                        var2.field850 = 0;
                        var2.field851 = 0;
                        var2.field852 = var24;
                        var2.field853 = 0;
                    }
                    if (var25 == 2) {
                        var2.field853 = 0;
                    }
                } else if (var23 == -1 || var2.field849 == -1 || class45.method1289(var23).field1006 >= class45.method1289(var2.field849).field1006) {
                    var2.field849 = var23;
                    var2.field850 = 0;
                    var2.field851 = 0;
                    var2.field852 = var24;
                    var2.field853 = 0;
                    var2.field876 = var2.field868;
                }
            }
        }
    }

    @ObfuscatedName("c.bm(Ln;IIBI)V")
    public static final void method104(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field872[0];
        int var5 = arg0.field837[0];
        int var6 = arg0.method41();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method41();
        class111 var8 = method801(arg1, arg2);
        class112 var9 = field343[arg0.field42];
        int[] var10 = field561;
        int[] var11 = field516;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class110.field1928[var12][var13] = 0;
                class110.field1926[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class110.method2668(var4, var5, var8, var9);
        } else if (var7 == 2) {
            var14 = class110.method3815(var4, var5, var8, var9);
        } else {
            var14 = class110.method2321(var4, var5, var7, var8, var9);
        }
        int var33;
        label182: {
            int var15 = var4 - 64;
            int var16 = var5 - 64;
            int var17 = Statics.field3265;
            int var18 = Statics.field1930;
            if (!var14) {
                int var19 = Integer.MAX_VALUE;
                int var20 = Integer.MAX_VALUE;
                byte var21 = 10;
                int var22 = var8.field1939;
                int var23 = var8.field1936;
                int var24 = var8.field1935;
                int var25 = var8.field1937;
                for (int var26 = var22 - var21; var26 <= var21 + var22; var26++) {
                    for (int var27 = var23 - var21; var27 <= var21 + var23; var27++) {
                        int var28 = var26 - var15;
                        int var29 = var27 - var16;
                        if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class110.field1926[var28][var29] < 100) {
                            int var30 = 0;
                            if (var26 < var22) {
                                var30 = var22 - var26;
                            } else if (var26 > var22 + var24 - 1) {
                                var30 = var26 - (var22 + var24 - 1);
                            }
                            int var31 = 0;
                            if (var27 < var23) {
                                var31 = var23 - var27;
                            } else if (var27 > var23 + var25 - 1) {
                                var31 = var27 - (var23 + var25 - 1);
                            }
                            int var32 = var30 * var30 + var31 * var31;
                            if (var32 < var19 || var19 == var32 && class110.field1926[var28][var29] < var20) {
                                var19 = var32;
                                var20 = class110.field1926[var28][var29];
                                var17 = var26;
                                var18 = var27;
                            }
                        }
                    }
                }
                if (var19 == Integer.MAX_VALUE) {
                    var33 = -1;
                    break label182;
                }
            }
            if (var4 == var17 && var5 == var18) {
                var33 = 0;
            } else {
                byte var34 = 0;
                class110.field1933[var34] = var17;
                int var41 = var34 + 1;
                class110.field1934[var34] = var18;
                int var35;
                int var36 = var35 = class110.field1928[var17 - var15][var18 - var16];
                while (var4 != var17 || var5 != var18) {
                    if (var35 != var36) {
                        var35 = var36;
                        class110.field1933[var41] = var17;
                        class110.field1934[var41++] = var18;
                    }
                    if ((var36 & 0x2) != 0) {
                        var17++;
                    } else if ((var36 & 0x8) != 0) {
                        var17--;
                    }
                    if ((var36 & 0x1) != 0) {
                        var18++;
                    } else if ((var36 & 0x4) != 0) {
                        var18--;
                    }
                    var36 = class110.field1928[var17 - var15][var18 - var16];
                }
                int var37 = 0;
                while (var41-- > 0) {
                    var10[var37] = class110.field1933[var41];
                    var11[var37++] = class110.field1934[var41];
                    if (var37 >= var10.length) {
                        break;
                    }
                }
                var33 = var37;
            }
        }
        int var38 = var33;
        if (var33 >= 1) {
            for (int var39 = 0; var39 < var38 - 1; var39++) {
                arg0.method24(field561[var39], field516[var39], arg3);
            }
        }
    }

    @ObfuscatedName("ak.br(III)Ldd;")
    public static class111 method801(int arg0, int arg1) {
        field560.field1939 = arg0;
        field560.field1936 = arg1;
        field560.field1935 = 1;
        field560.field1937 = 1;
        return field560;
    }

    @ObfuscatedName("cx.bz(I)V")
    public static final void method1853() {
        int var0 = Statics.field2115;
        int var1 = Statics.field16;
        int var2 = Statics.field1844;
        int var3 = Statics.field1489;
        int var4 = 6116423;
        class83.method1768(var0, var1, var2, var3, var4);
        class83.method1768(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1759(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1435.method3852(class161.field2555, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2193;
        int var6 = class144.field2200;
        for (int var7 = 0; var7 < field422; var7++) {
            int var8 = (field422 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class228 var10 = Statics.field1435;
            String var11;
            if (field428[var7].length() > 0) {
                var11 = field427[var7] + class161.field2506 + field428[var7];
            } else {
                var11 = field427[var7];
            }
            var10.method3852(var11, var0 + 3, var8, var9, 0);
        }
        method948(Statics.field2115, Statics.field16, Statics.field1844, Statics.field1489);
    }

    @ObfuscatedName("an.bl(IIIII)V")
    public static final void method994(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field483; var4++) {
            if (field488[var4] + field342[var4] > arg0 && field488[var4] < arg0 + arg2 && field491[var4] + field489[var4] > arg1 && field489[var4] < arg1 + arg3) {
                field527[var4] = true;
            }
        }
    }

    @ObfuscatedName("av.be(IIIII)V")
    public static final void method948(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field483; var4++) {
            if (field488[var4] + field342[var4] > arg0 && field488[var4] < arg0 + arg2 && field491[var4] + field489[var4] > arg1 && field489[var4] < arg1 + arg3) {
                field486[var4] = true;
            }
        }
    }

    @ObfuscatedName("au.bq(I)V")
    public static final void method914() {
        method187();
        if (Statics.field125 != null || field453 != null) {
            return;
        }
        int var0 = class144.field2199;
        if (field421) {
            if (var0 != 1 && (Statics.field277 || var0 != 4)) {
                int var1 = class144.field2193;
                int var2 = class144.field2200;
                if (var1 < Statics.field2115 - 10 || var1 > Statics.field2115 + Statics.field1844 + 10 || var2 < Statics.field16 - 10 || var2 > Statics.field16 + Statics.field1489 + 10) {
                    field421 = false;
                    method994(Statics.field2115, Statics.field16, Statics.field1844, Statics.field1489);
                }
            }
            if (var0 == 1 || !Statics.field277 && var0 == 4) {
                int var3 = Statics.field2115;
                int var4 = Statics.field16;
                int var5 = Statics.field1844;
                int var6 = class144.field2198;
                int var7 = class144.field2208;
                int var8 = -1;
                for (int var9 = 0; var9 < field422; var9++) {
                    int var10 = (field422 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = field564[var8];
                    int var12 = field424[var8];
                    int var13 = field425[var8];
                    int var14 = field479[var8];
                    String var15 = field427[var8];
                    String var16 = field428[var8];
                    Statics.method746(var11, var12, var13, var14, var15, var16, class144.field2198, class144.field2208);
                }
                field421 = false;
                method994(Statics.field2115, Statics.field16, Statics.field1844, Statics.field1489);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field277 && var0 == 4) && field422 > 0) {
            int var17 = field425[field422 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                int var18 = field564[field422 - 1];
                int var19 = field424[field422 - 1];
                class177 var20 = class177.method2979(var19);
                if (class182.method122(method2021(var20)) || class182.method226(method2021(var20))) {
                    if (Statics.field125 != null && !field400 && field420 != 1 && !method13(field422 - 1) && field422 > 0) {
                        int var21 = field394;
                        int var22 = field418;
                        method2669(Statics.field604, var21, var22);
                        Statics.field604 = null;
                    }
                    field400 = false;
                    field403 = 0;
                    if (Statics.field125 != null) {
                        method733(Statics.field125);
                    }
                    Statics.field125 = class177.method2979(var19);
                    field396 = var18;
                    field394 = class144.field2198;
                    field418 = class144.field2208;
                    if (field422 > 0) {
                        int var23 = field422 - 1;
                        Statics.field604 = new class33();
                        Statics.field604.field719 = field564[var23];
                        Statics.field604.field715 = field424[var23];
                        Statics.field604.field709 = field425[var23];
                        Statics.field604.field711 = field479[var23];
                        Statics.field604.field710 = field427[var23];
                    }
                    method733(Statics.field125);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field277 && var0 == 4) && (field420 == 1 && field422 > 2 || method13(field422 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field277 && var0 == 4) && field422 > 0) {
            int var24 = field422 - 1;
            if (var24 >= 0) {
                int var25 = field564[var24];
                int var26 = field424[var24];
                int var27 = field425[var24];
                int var28 = field479[var24];
                String var29 = field427[var24];
                String var30 = field428[var24];
                Statics.method746(var25, var26, var27, var28, var29, var30, class144.field2198, class144.field2208);
            }
        }
        if (var0 == 2 && field422 > 0) {
            method87(class144.field2198, class144.field2208);
        }
    }

    @ObfuscatedName("m.bj(III)V")
    public static final void method87(int arg0, int arg1) {
        int var2 = Statics.field1435.method3847(class161.field2555);
        for (int var3 = 0; var3 < field422; var3++) {
            int var4 = Statics.field1435.method3847(method5(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field422 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2297) {
            var6 = Statics.field2297 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1617) {
            var7 = Statics.field1617 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field421 = true;
        Statics.field2115 = var6;
        Statics.field16 = var7;
        Statics.field1844 = var2;
        Statics.field1489 = field422 * 15 + 22;
    }

    @ObfuscatedName("e.cn(II)Z")
    public static final boolean method13(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field425[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dk.cz(Lac;IIB)V")
    public static final void method2669(class33 arg0, int arg1, int arg2) {
        Statics.method746(arg0.field719, arg0.field715, arg0.field709, arg0.field711, arg0.field710, arg0.field710, arg1, arg2);
    }

    @ObfuscatedName("cx.ci(IIIII)V")
    public static void method1851(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method45(arg0, arg1);
        if (var4 != null && var4.field2880 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field2 = var4.field2880;
            class39.method2320(var5);
        }
        field485 = arg3;
        field435 = true;
        Statics.field712 = arg0;
        field345 = arg1;
        Statics.field3211 = arg2;
        method733(var4);
    }

    @ObfuscatedName("o.cl(I)V")
    public static void method181() {
        if (!field435) {
            return;
        }
        class177 var0 = class177.method45(Statics.field712, field345);
        if (var0 != null && var0.field2881 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field2 = var0.field2881;
            class39.method2320(var1);
        }
        field435 = false;
        method733(var0);
    }

    @ObfuscatedName("be.cp(III)V")
    public static void method1541(int arg0, int arg1) {
        field398.method2634(105);
        field398.method2440(arg0);
        field398.method2433(arg1);
    }

    @ObfuscatedName("dd.cb(IIIILjava/lang/String;I)V")
    public static void method2274(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class177 var5 = class177.method45(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2889 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field1 = arg0;
            var6.field10 = arg4;
            var6.field2 = var5.field2889;
            class39.method2320(var6);
        }
        boolean var7 = true;
        if (var5.field2793 > 0) {
            var7 = method81(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2021(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field398.method2634(176);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 2) {
            field398.method2634(209);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 3) {
            field398.method2634(84);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 4) {
            field398.method2634(103);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 5) {
            field398.method2634(242);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 6) {
            field398.method2634(216);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 7) {
            field398.method2634(120);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 8) {
            field398.method2634(246);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 9) {
            field398.method2634(34);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
        if (arg0 == 10) {
            field398.method2634(108);
            field398.method2387(arg1);
            field398.method2385(arg2);
            field398.method2385(arg3);
        }
    }

    @ObfuscatedName("q.co(I)V")
    public static final void method187() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field422 - 1; var1++) {
                if (field425[var1] < 1000 && field425[var1 + 1] > 1000) {
                    String var2 = field428[var1];
                    field428[var1] = field428[var1 + 1];
                    field428[var1 + 1] = var2;
                    String var3 = field427[var1];
                    field427[var1] = field427[var1 + 1];
                    field427[var1 + 1] = var3;
                    int var4 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var4;
                    int var5 = field564[var1];
                    field564[var1] = field564[var1 + 1];
                    field564[var1 + 1] = var5;
                    int var6 = field424[var1];
                    field424[var1] = field424[var1 + 1];
                    field424[var1 + 1] = var6;
                    int var7 = field479[var1];
                    field479[var1] = field479[var1 + 1];
                    field479[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("n.cj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method35(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field421 || field422 >= 500) {
            return;
        }
        field427[field422] = arg0;
        field428[field422] = arg1;
        field425[field422] = arg2;
        field479[field422] = arg3;
        field564[field422] = arg4;
        field424[field422] = arg5;
        field422++;
    }

    @ObfuscatedName("j.cx(B)V")
    public static void method183() {
        for (int var0 = 0; var0 < field422; var0++) {
            if (method1643(field425[var0])) {
                if (var0 < field422 - 1) {
                    for (int var1 = var0; var1 < field422 - 1; var1++) {
                        field427[var1] = field427[var1 + 1];
                        field428[var1] = field428[var1 + 1];
                        field425[var1] = field425[var1 + 1];
                        field479[var1] = field479[var1 + 1];
                        field564[var1] = field564[var1 + 1];
                        field424[var1] = field424[var1 + 1];
                    }
                }
                field422--;
            }
        }
    }

    @ObfuscatedName("cz.ct(II)Z")
    public static boolean method1643(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("e.ch(IB)Ljava/lang/String;")
    public static String method5(int arg0) {
        return field428[arg0].length() > 0 ? field427[arg0] + class161.field2506 + field428[arg0] : field427[arg0];
    }

    @ObfuscatedName("cu.ck(Lap;IIII)V")
    public static final void method2096(class42 arg0, int arg1, int arg2, int arg3) {
        if (field422 >= 400) {
            return;
        }
        if (arg0.field914 != null) {
            arg0 = arg0.method778();
        }
        if (arg0 == null || !arg0.field917 || arg0.field899 && field448 != arg1) {
            return;
        }
        String var4 = arg0.field916;
        if (arg0.field906 != 0) {
            int var6 = arg0.field906;
            int var7 = Statics.field767.field54;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2017(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2017(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2017(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2017(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2017(65280);
            } else if (var8 > 6) {
                var9 = class2.method2017(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2017(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2017(12648192);
            } else {
                var9 = class2.method2017(16776960);
            }
            var4 = var4 + var9 + " " + class2.field22 + class161.field2419 + arg0.field906 + class2.field25;
        }
        if (field433 == 1) {
            method35(class161.field2496, field434 + " " + class2.field24 + " " + class2.method2017(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field435) {
            String[] var10 = arg0.field904;
            if (field451) {
                var10 = method109(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class161.field2498)) {
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
                        method35(var10[var11], class2.method2017(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class161.field2498)) {
                        short var14 = 0;
                        if (field321 != class22.field579) {
                            if (field321 == class22.field580 || field321 == class22.field582 && arg0.field906 > Statics.field767.field54) {
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
                            method35(var10[var13], class2.method2017(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method35(class161.field2536, class2.method2017(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field3211 & 0x2) == 2) {
            method35(field493, field439 + " " + class2.field24 + " " + class2.method2017(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dm.cq(Ln;IIII)V")
    public static final void method2663(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field767 == arg0 || field422 >= 400) {
            return;
        }
        String var9;
        if (arg0.field38 == 0) {
            String var4 = arg0.field36[0] + arg0.field56 + arg0.field36[1];
            int var5 = arg0.field54;
            int var6 = Statics.field767.field54;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2017(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2017(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2017(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2017(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2017(65280);
            } else if (var7 > 6) {
                var8 = class2.method2017(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2017(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2017(12648192);
            } else {
                var8 = class2.method2017(16776960);
            }
            var9 = var4 + var8 + " " + class2.field22 + class161.field2419 + arg0.field54 + class2.field25 + arg0.field36[2];
        } else {
            var9 = arg0.field36[0] + arg0.field56 + arg0.field36[1] + " " + class2.field22 + class161.field2503 + arg0.field38 + class2.field25 + arg0.field36[2];
        }
        if (field433 == 1) {
            method35(class161.field2496, field434 + " " + class2.field24 + " " + class2.method2017(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field435) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field409[var10] != null) {
                    short var11 = 0;
                    if (field409[var10].equalsIgnoreCase(class161.field2498)) {
                        if (field511 == class22.field579) {
                            continue;
                        }
                        if (field511 == class22.field580 || field511 == class22.field582 && arg0.field54 > Statics.field767.field54) {
                            var11 = 2000;
                        }
                        if (Statics.field767.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field767.field51 == arg0.field51) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field369[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field408[var10] + var11;
                    method35(field409[var10], class2.method2017(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field3211 & 0x8) == 8) {
            method35(field493, field439 + " " + class2.field24 + " " + class2.method2017(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field422; var14++) {
            if (field425[var14] == 23) {
                field428[var14] = class2.method2017(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ae.ce([Lfe;IIIIIIIIS)V")
    public static final void method668(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1802(arg2, arg3, arg4, arg5);
        class95.method2023();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2808 == arg1 || arg1 == -1412584499 && field453 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field488[field483] = var10.field2802 + arg6;
                    field489[field483] = var10.field2863 + arg7;
                    field342[field483] = var10.field2804;
                    field491[field483] = var10.field2906;
                    var11 = ++field483 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2920 = var11;
                var10.field2921 = field291;
                if (!var10.field2788 || !method3298(var10)) {
                    if (var10.field2793 > 0) {
                        int var12 = var10.field2793;
                        if (var12 == 324) {
                            if (field465 == -1) {
                                field465 = var10.field2824;
                                field555 = var10.field2825;
                            }
                            if (field306.field2957) {
                                var10.field2824 = field465;
                            } else {
                                var10.field2824 = field555;
                            }
                        } else if (var12 == 325) {
                            if (field465 == -1) {
                                field465 = var10.field2824;
                                field555 = var10.field2825;
                            }
                            if (field306.field2957) {
                                var10.field2824 = field555;
                            } else {
                                var10.field2824 = field465;
                            }
                        } else if (var12 == 327) {
                            var10.field2821 = 150;
                            var10.field2827 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2891 = 5;
                            var10.field2833 = 0;
                        } else if (var12 == 328) {
                            var10.field2821 = 150;
                            var10.field2827 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2891 = 5;
                            var10.field2833 = 1;
                        }
                    }
                    int var13 = var10.field2802 + arg6;
                    int var14 = var10.field2863 + arg7;
                    int var15 = var10.field2820;
                    if (field453 == var10) {
                        if (arg1 != -1412584499 && !var10.field2867) {
                            Statics.field159 = arg0;
                            Statics.field273 = arg6;
                            Statics.field2078 = arg7;
                            continue;
                        }
                        if (field464 && field397) {
                            int var16 = class144.field2193;
                            int var17 = class144.field2200;
                            int var18 = var16 - field522;
                            int var19 = var17 - field456;
                            if (var18 < field401) {
                                var18 = field401;
                            }
                            if (var10.field2804 + var18 > field401 + field454.field2804) {
                                var18 = field401 + field454.field2804 - var10.field2804;
                            }
                            if (var19 < field460) {
                                var19 = field460;
                            }
                            if (var10.field2906 + var19 > field460 + field454.field2906) {
                                var19 = field460 + field454.field2906 - var10.field2906;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2867) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2840 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2840 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2804 + var13;
                        int var27 = var10.field2906 + var14;
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
                        int var30 = var10.field2804 + var13;
                        int var31 = var10.field2906 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2788 || var20 < var22 && var21 < var23) {
                        if (var10.field2793 != 0) {
                            if (var10.field2793 == 1336) {
                                if (field297) {
                                    var14 += 15;
                                    Statics.field1963.method3854("Fps:" + field2253, var10.field2804 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field287) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field287) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1963.method3854("Mem:" + var33 + "k", var10.field2804 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2793 == 1337) {
                                field429 = var13;
                                field501 = var14;
                                int var37 = var10.field2804;
                                int var38 = var10.field2906;
                                field387++;
                                method579(class36.field780);
                                boolean var39 = false;
                                if (field472 >= 0) {
                                    int var40 = class35.field764;
                                    int[] var41 = class35.field759;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field472 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method579(class36.field786);
                                }
                                method727(true);
                                method579(var39 ? class36.field778 : class36.field779);
                                method727(false);
                                for (class7 var43 = (class7) field415.method3646(); var43 != null; var43 = (class7) field415.method3648()) {
                                    if (Statics.field223 != var43.field101 || field291 > var43.field107) {
                                        var43.method3744();
                                    } else if (field291 >= var43.field106) {
                                        if (var43.field121 > 0) {
                                            class37 var44 = field283[var43.field121 - 1];
                                            if (var44 != null && var44.field864 >= 0 && var44.field864 < 13312 && var44.field818 >= 0 && var44.field818 < 13312) {
                                                var43.method83(var44.field864, var44.field818, method1852(var44.field864, var44.field818, var43.field101) - var43.field105, field291);
                                            }
                                        }
                                        if (var43.field121 < 0) {
                                            int var45 = -var43.field121 - 1;
                                            class3 var46;
                                            if (field376 == var45) {
                                                var46 = Statics.field767;
                                            } else {
                                                var46 = field332[var45];
                                            }
                                            if (var46 != null && var46.field864 >= 0 && var46.field864 < 13312 && var46.field818 >= 0 && var46.field818 < 13312) {
                                                var43.method83(var46.field864, var46.field818, method1852(var46.field864, var46.field818, var43.field101) - var43.field105, field291);
                                            }
                                        }
                                        var43.method86(field359);
                                        Statics.field152.method1911(Statics.field223, (int) var43.field112, (int) var43.field113, (int) var43.field114, 60, var43, var43.field120, -1, false);
                                    }
                                }
                                for (class32 var47 = (class32) field416.method3646(); var47 != null; var47 = (class32) field416.method3648()) {
                                    if (Statics.field223 != var47.field707 || var47.field704) {
                                        var47.method3744();
                                    } else if (field291 >= var47.field703) {
                                        var47.method671(field359);
                                        if (var47.field704) {
                                            var47.method3744();
                                        } else {
                                            Statics.field152.method1911(var47.field707, var47.field696, var47.field699, var47.field700, 60, var47, 0, -1, false);
                                        }
                                    }
                                }
                                method674(var13, var14, var37, var38, true);
                                int var48 = field542;
                                int var49 = field548;
                                int var50 = field544;
                                int var51 = field412;
                                class83.method1802(var48, var49, var48 + var50, var49 + var51);
                                class95.method2023();
                                if (!field563) {
                                    int var52 = field366;
                                    if (field375 / 256 > var52) {
                                        var52 = field375 / 256;
                                    }
                                    if (field440[4] && field531[4] + 128 > var52) {
                                        var52 = field531[4] + 128;
                                    }
                                    int var53 = field367 + field351 & 0x7FF;
                                    method2631(Statics.field1684, method1852(Statics.field767.field864, Statics.field767.field818, Statics.field223) - field372, Statics.field265, var52, var53, var52 * 3 + 600);
                                }
                                int var54;
                                if (field563) {
                                    var54 = method110();
                                } else {
                                    var54 = method675();
                                }
                                int var55 = Statics.field2151;
                                int var56 = Statics.field2741;
                                int var57 = Statics.field1417;
                                int var58 = Statics.field2218;
                                int var59 = Statics.field1834;
                                for (int var60 = 0; var60 < 5; var60++) {
                                    if (field440[var60]) {
                                        int var61 = (int) (Math.random() * (double) (field468[var60] * 2 + 1) - (double) field468[var60] + Math.sin((double) field423[var60] / 100.0D * (double) field533[var60]) * (double) field531[var60]);
                                        if (var60 == 0) {
                                            Statics.field2151 += var61;
                                        }
                                        if (var60 == 1) {
                                            Statics.field2741 += var61;
                                        }
                                        if (var60 == 2) {
                                            Statics.field1417 += var61;
                                        }
                                        if (var60 == 3) {
                                            Statics.field1834 = Statics.field1834 + var61 & 0x7FF;
                                        }
                                        if (var60 == 4) {
                                            Statics.field2218 += var61;
                                            if (Statics.field2218 < 128) {
                                                Statics.field2218 = 128;
                                            }
                                            if (Statics.field2218 > 383) {
                                                Statics.field2218 = 383;
                                            }
                                        }
                                    }
                                }
                                int var62 = class144.field2193;
                                int var63 = class144.field2200;
                                if (class144.field2199 != 0) {
                                    var62 = class144.field2198;
                                    var63 = class144.field2208;
                                }
                                if (var62 >= var48 && var62 < var48 + var50 && var63 >= var49 && var63 < var49 + var51) {
                                    class109.field1860 = true;
                                    class109.field1918 = 0;
                                    class109.field1909 = var62 - var48;
                                    class109.field1921 = var63 - var49;
                                } else {
                                    class109.field1860 = false;
                                    class109.field1918 = 0;
                                }
                                method992();
                                class83.method1768(var48, var49, var50, var51, 0);
                                method992();
                                int var64 = class95.field1632;
                                class95.field1632 = field546;
                                Statics.field152.method1893(Statics.field2151, Statics.field2741, Statics.field1417, Statics.field2218, Statics.field1834, var54);
                                class95.field1632 = var64;
                                method992();
                                Statics.field152.method1869();
                                method3303(var48, var49, var50, var51);
                                method718(var48, var49);
                                ((class99) Statics.field1643).method2100(field359);
                                method157(var48, var49, var50, var51);
                                Statics.field2151 = var55;
                                Statics.field2741 = var56;
                                Statics.field1417 = var57;
                                Statics.field2218 = var58;
                                Statics.field1834 = var59;
                                if (field528 && class175.method97(true, false) == 0) {
                                    field528 = false;
                                }
                                if (field528) {
                                    class83.method1768(var48, var49, var50, var51, 0);
                                    method140(class161.field2369, false);
                                }
                                field527[var10.field2920] = true;
                                class83.method1802(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2793 == 1338) {
                                method2343(var10, var13, var14, var11);
                                class83.method1802(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2793 == 1339) {
                                class179 var65 = var10.method3268(false);
                                if (var65 != null) {
                                    if (field370 < 3) {
                                        Statics.field955.method1690(var13, var14, var65.field2931, var65.field2932, 25, 25, field367, 256, var65.field2934, var65.field2933);
                                    } else {
                                        class83.method1766(var13, var14, 0, var65.field2934, var65.field2933);
                                    }
                                }
                                class83.method1802(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2840 == 0) {
                            if (!var10.field2788 && method3298(var10) && Statics.field1974 != var10) {
                                continue;
                            }
                            if (!var10.field2788) {
                                if (var10.field2909 > var10.field2791 - var10.field2906) {
                                    var10.field2909 = var10.field2791 - var10.field2906;
                                }
                                if (var10.field2909 < 0) {
                                    var10.field2909 = 0;
                                }
                            }
                            method668(arg0, var10.field2789, var20, var21, var22, var23, var13 - var10.field2810, var14 - var10.field2909, var11);
                            if (var10.field2913 != null) {
                                method668(var10.field2913, var10.field2789, var20, var21, var22, var23, var13 - var10.field2810, var14 - var10.field2909, var11);
                            }
                            class4 var66 = (class4) field441.method3605((long) var10.field2789);
                            if (var66 != null) {
                                int var67 = var66.field65;
                                if (class177.method3200(var67)) {
                                    Statics.field159 = null;
                                    method668(Statics.field2910[var67], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field159 != null) {
                                        method668(Statics.field159, -1412584499, var20, var21, var22, var23, Statics.field273, Statics.field2078, var11);
                                        Statics.field159 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var68 = 0; var68 < 100; var68++) {
                                        field527[var68] = true;
                                    }
                                } else {
                                    field527[var11] = true;
                                }
                            }
                            class83.method1802(arg2, arg3, arg4, arg5);
                            class95.method2023();
                        }
                        if (field494 || field487[var11] || field308 > 1) {
                            if (var10.field2840 == 0 && !var10.field2788 && var10.field2791 > var10.field2906) {
                                int var69 = var10.field2804 + var13;
                                int var70 = var10.field2909;
                                int var71 = var10.field2906;
                                int var72 = var10.field2791;
                                Statics.field151[0].method1820(var69, var14);
                                Statics.field151[1].method1820(var69, var14 + var71 - 16);
                                class83.method1768(var69, var14 + 16, 16, var71 - 32, field360);
                                int var73 = (var71 - 32) * var71 / var72;
                                if (var73 < 8) {
                                    var73 = 8;
                                }
                                int var74 = (var71 - 32 - var73) * var70 / (var72 - var71);
                                class83.method1768(var69, var14 + 16 + var74, 16, var73, field361);
                                class83.method1763(var69, var14 + 16 + var74, var73, field363);
                                class83.method1763(var69 + 1, var14 + 16 + var74, var73, field363);
                                class83.method1761(var69, var14 + 16 + var74, 16, field363);
                                class83.method1761(var69, var14 + 17 + var74, 16, field363);
                                class83.method1763(var69 + 15, var14 + 16 + var74, var73, field362);
                                class83.method1763(var69 + 14, var14 + 17 + var74, var73 - 1, field362);
                                class83.method1761(var69, var14 + 15 + var74 + var73, 16, field362);
                                class83.method1761(var69 + 1, var14 + 14 + var74 + var73, 15, field362);
                            }
                            if (var10.field2840 != 1) {
                                if (var10.field2840 == 2) {
                                    int var75 = 0;
                                    for (int var76 = 0; var76 < var10.field2801; var76++) {
                                        for (int var77 = 0; var77 < var10.field2800; var77++) {
                                            int var78 = (var10.field2826 + 32) * var77 + var13;
                                            int var79 = (var10.field2923 + 32) * var76 + var14;
                                            if (var75 < 20) {
                                                var78 += var10.field2857[var75];
                                                var79 += var10.field2858[var75];
                                            }
                                            if (var10.field2868[var75] > 0) {
                                                boolean var80 = false;
                                                boolean var81 = false;
                                                int var82 = var10.field2868[var75] - 1;
                                                if (var78 + 32 > arg2 && var78 < arg4 && var79 + 32 > arg3 && var79 < arg5 || Statics.field125 == var10 && field396 == var75) {
                                                    class82 var83;
                                                    if (field433 == 1 && Statics.field1129 == var75 && Statics.field1264 == var10.field2789) {
                                                        var83 = class56.method1065(var82, var10.field2908[var75], 2, 0, 2, false);
                                                    } else {
                                                        var83 = class56.method1065(var82, var10.field2908[var75], 1, 3153952, 2, false);
                                                    }
                                                    if (var83 == null) {
                                                        method733(var10);
                                                    } else if (Statics.field125 == var10 && field396 == var75) {
                                                        int var84 = class144.field2193 - field394;
                                                        int var85 = class144.field2200 - field418;
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (var85 < 5 && var85 > -5) {
                                                            var85 = 0;
                                                        }
                                                        if (field403 < 5) {
                                                            var84 = 0;
                                                            var85 = 0;
                                                        }
                                                        var83.method1675(var78 + var84, var79 + var85, 128);
                                                        if (arg1 != -1) {
                                                            class177 var86 = arg0[arg1 & 0xFFFF];
                                                            if (var79 + var85 < class83.field1467 && var86.field2909 > 0) {
                                                                int var87 = field359 * (class83.field1467 - var79 - var85) / 3;
                                                                if (var87 > field359 * 10) {
                                                                    var87 = field359 * 10;
                                                                }
                                                                if (var87 > var86.field2909) {
                                                                    var87 = var86.field2909;
                                                                }
                                                                var86.field2909 -= var87;
                                                                field418 += var87;
                                                                method733(var86);
                                                            }
                                                            if (var79 + var85 + 32 > class83.field1464 && var86.field2909 < var86.field2791 - var86.field2906) {
                                                                int var88 = field359 * (var79 + var85 + 32 - class83.field1464) / 3;
                                                                if (var88 > field359 * 10) {
                                                                    var88 = field359 * 10;
                                                                }
                                                                if (var88 > var86.field2791 - var86.field2906 - var86.field2909) {
                                                                    var88 = var86.field2791 - var86.field2906 - var86.field2909;
                                                                }
                                                                var86.field2909 += var88;
                                                                field418 -= var88;
                                                                method733(var86);
                                                            }
                                                        }
                                                    } else if (Statics.field1440 == var10 && field395 == var75) {
                                                        var83.method1675(var78, var79, 128);
                                                    } else {
                                                        var83.method1670(var78, var79);
                                                    }
                                                }
                                            } else if (var10.field2859 != null && var75 < 20) {
                                                class82 var89 = var10.method3241(var75);
                                                if (var89 != null) {
                                                    var89.method1670(var78, var79);
                                                } else if (class177.field2787) {
                                                    method733(var10);
                                                }
                                            }
                                            var75++;
                                        }
                                    }
                                } else if (var10.field2840 == 3) {
                                    int var90;
                                    if (Statics.method706(var10)) {
                                        var90 = var10.field2815;
                                        if (Statics.field1974 == var10 && var10.field2817 != 0) {
                                            var90 = var10.field2817;
                                        }
                                    } else {
                                        var90 = var10.field2814;
                                        if (Statics.field1974 == var10 && var10.field2854 != 0) {
                                            var90 = var10.field2854;
                                        }
                                    }
                                    if (var10.field2832) {
                                        switch(var10.field2819.field1485) {
                                            case 1:
                                                class83.method1754(var13, var14, var10.field2804, var10.field2906, var10.field2814, var10.field2815, 256 - (var10.field2820 & 0xFF), 256 - (var10.field2783 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1755(var13, var14, var10.field2804, var10.field2906, var10.field2814, var10.field2815, 256 - (var10.field2820 & 0xFF), 256 - (var10.field2783 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1797(var13, var14, var10.field2804, var10.field2906, var10.field2814, var10.field2815, 256 - (var10.field2820 & 0xFF), 256 - (var10.field2783 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1815(var13, var14, var10.field2804, var10.field2906, var10.field2814, var10.field2815, 256 - (var10.field2820 & 0xFF), 256 - (var10.field2783 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class83.method1768(var13, var14, var10.field2804, var10.field2906, var90);
                                                } else {
                                                    class83.method1752(var13, var14, var10.field2804, var10.field2906, var90, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class83.method1759(var13, var14, var10.field2804, var10.field2906, var90);
                                    } else {
                                        class83.method1760(var13, var14, var10.field2804, var10.field2906, var90, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2840 == 4) {
                                    class228 var91 = var10.method3264();
                                    if (var91 != null) {
                                        String var92 = var10.field2869;
                                        int var93;
                                        if (Statics.method706(var10)) {
                                            var93 = var10.field2815;
                                            if (Statics.field1974 == var10 && var10.field2817 != 0) {
                                                var93 = var10.field2817;
                                            }
                                            if (var10.field2850.length() > 0) {
                                                var92 = var10.field2850;
                                            }
                                        } else {
                                            var93 = var10.field2814;
                                            if (Statics.field1974 == var10 && var10.field2854 != 0) {
                                                var93 = var10.field2854;
                                            }
                                        }
                                        if (var10.field2788 && var10.field2839 != -1) {
                                            class56 var94 = class56.method905(var10.field2839);
                                            var92 = var94.field1201;
                                            if (var92 == null) {
                                                var92 = "null";
                                            }
                                            if ((var94.field1173 == 1 || var10.field2862 != 1) && var10.field2862 != -1) {
                                                var92 = class2.method2017(16748608) + var92 + class2.field23 + " " + 'x' + method64(var10.field2862);
                                            }
                                        }
                                        if (field444 == var10) {
                                            class161 var10000 = (class161) null;
                                            var92 = class161.field2504;
                                            var93 = var10.field2814;
                                        }
                                        if (!var10.field2788) {
                                            var92 = method2327(var92, var10);
                                        }
                                        var91.method3881(var92, var13, var14, var10.field2804, var10.field2906, var93, var10.field2864 ? 0 : -1, var10.field2852, var10.field2830, var10.field2899);
                                    } else if (class177.field2787) {
                                        method733(var10);
                                    }
                                } else if (var10.field2840 == 5) {
                                    if (var10.field2788) {
                                        class82 var96;
                                        if (var10.field2839 == -1) {
                                            var96 = var10.method3286(false);
                                        } else {
                                            var96 = class56.method1065(var10.field2839, var10.field2862, var10.field2828, var10.field2829, var10.field2847, false);
                                        }
                                        if (var96 != null) {
                                            int var97 = var96.field1463;
                                            int var98 = var96.field1458;
                                            if (var10.field2901) {
                                                class83.method1794(var13, var14, var10.field2804 + var13, var10.field2906 + var14);
                                                int var99 = (var10.field2804 + (var97 - 1)) / var97;
                                                int var100 = (var10.field2906 + (var98 - 1)) / var98;
                                                for (int var101 = 0; var101 < var99; var101++) {
                                                    for (int var102 = 0; var102 < var100; var102++) {
                                                        if (var10.field2779 != 0) {
                                                            var96.method1682(var97 / 2 + var97 * var101 + var13, var98 / 2 + var98 * var102 + var14, var10.field2779, 4096);
                                                        } else if (var15 == 0) {
                                                            var96.method1670(var97 * var101 + var13, var98 * var102 + var14);
                                                        } else {
                                                            var96.method1675(var97 * var101 + var13, var98 * var102 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1802(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var103 = var10.field2804 * 4096 / var97;
                                                if (var10.field2779 != 0) {
                                                    var96.method1682(var10.field2804 / 2 + var13, var10.field2906 / 2 + var14, var10.field2779, var103);
                                                } else if (var15 != 0) {
                                                    var96.method1732(var13, var14, var10.field2804, var10.field2906, 256 - (var15 & 0xFF));
                                                } else if (var10.field2804 == var97 && var10.field2906 == var98) {
                                                    var96.method1670(var13, var14);
                                                } else {
                                                    var96.method1672(var13, var14, var10.field2804, var10.field2906);
                                                }
                                            }
                                        } else if (class177.field2787) {
                                            method733(var10);
                                        }
                                    } else {
                                        class82 var95 = var10.method3286(Statics.method706(var10));
                                        if (var95 != null) {
                                            var95.method1670(var13, var14);
                                        } else if (class177.field2787) {
                                            method733(var10);
                                        }
                                    }
                                } else if (var10.field2840 == 6) {
                                    boolean var104 = Statics.method706(var10);
                                    int var105;
                                    if (var104) {
                                        var105 = var10.field2837;
                                    } else {
                                        var105 = var10.field2836;
                                    }
                                    class109 var106 = null;
                                    int var107 = 0;
                                    if (var10.field2839 != -1) {
                                        class56 var108 = class56.method905(var10.field2839);
                                        if (var108 != null) {
                                            class56 var109 = var108.method1091(var10.field2862);
                                            var106 = var109.method1090(1);
                                            if (var106 == null) {
                                                method733(var10);
                                            } else {
                                                var106.method2251();
                                                var107 = var106.field1518 / 2;
                                            }
                                        }
                                    } else if (var10.field2891 == 5) {
                                        if (var10.field2833 == 0) {
                                            var106 = field306.method3339((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var106 = Statics.field767.method36();
                                        }
                                    } else if (var105 == -1) {
                                        var106 = var10.method3242((class45) null, -1, var104, Statics.field767.field32);
                                        if (var106 == null && class177.field2787) {
                                            method733(var10);
                                        }
                                    } else {
                                        class45 var110 = class45.method1289(var105);
                                        var106 = var10.method3242(var110, var10.field2911, var104, Statics.field767.field32);
                                        if (var106 == null && class177.field2787) {
                                            method733(var10);
                                        }
                                    }
                                    class95.method2026(var10.field2804 / 2 + var13, var10.field2906 / 2 + var14);
                                    int var111 = var10.field2843 * class95.field1636[var10.field2821] >> 16;
                                    int var112 = var10.field2843 * class95.field1647[var10.field2821] >> 16;
                                    if (var106 != null) {
                                        if (var10.field2788) {
                                            var106.method2251();
                                            if (var10.field2846) {
                                                var106.method2198(0, var10.field2827, var10.field2842, var10.field2821, var10.field2838, var10.field2861 + var107 + var111, var10.field2861 + var112, var10.field2843);
                                            } else {
                                                var106.method2212(0, var10.field2827, var10.field2842, var10.field2821, var10.field2838, var10.field2861 + var107 + var111, var10.field2861 + var112);
                                            }
                                        } else {
                                            var106.method2212(0, var10.field2827, 0, var10.field2821, 0, var111, var112);
                                        }
                                    }
                                    class95.method2053();
                                } else {
                                    if (var10.field2840 == 7) {
                                        class228 var113 = var10.method3264();
                                        if (var113 == null) {
                                            if (class177.field2787) {
                                                method733(var10);
                                            }
                                            continue;
                                        }
                                        int var114 = 0;
                                        for (int var115 = 0; var115 < var10.field2801; var115++) {
                                            for (int var116 = 0; var116 < var10.field2800; var116++) {
                                                if (var10.field2868[var114] > 0) {
                                                    class56 var117 = class56.method905(var10.field2868[var114] - 1);
                                                    String var118;
                                                    if (var117.field1173 != 1 && var10.field2908[var114] == 1) {
                                                        var118 = class2.method2017(16748608) + var117.field1201 + class2.field23;
                                                    } else {
                                                        var118 = class2.method2017(16748608) + var117.field1201 + class2.field23 + " " + 'x' + method64(var10.field2908[var114]);
                                                    }
                                                    int var119 = (var10.field2826 + 115) * var116 + var13;
                                                    int var120 = (var10.field2923 + 12) * var115 + var14;
                                                    if (var10.field2852 == 0) {
                                                        var113.method3852(var118, var119, var120, var10.field2814, var10.field2864 ? 0 : -1);
                                                    } else if (var10.field2852 == 1) {
                                                        var113.method3855(var118, var10.field2804 / 2 + var119, var120, var10.field2814, var10.field2864 ? 0 : -1);
                                                    } else {
                                                        var113.method3854(var118, var10.field2804 + var119 - 1, var120, var10.field2814, var10.field2864 ? 0 : -1);
                                                    }
                                                }
                                                var114++;
                                            }
                                        }
                                    }
                                    if (var10.field2840 == 8 && Statics.field1673 == var10 && field459 == field404) {
                                        int var121 = 0;
                                        int var122 = 0;
                                        class228 var123 = Statics.field1963;
                                        String var124 = var10.field2869;
                                        String var125 = method2327(var124, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field19);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            int var128 = var123.method3847(var127);
                                            if (var128 > var121) {
                                                var121 = var128;
                                            }
                                            var122 += var123.field3246 + 1;
                                        }
                                        var121 += 6;
                                        var122 += 7;
                                        int var129 = var10.field2804 + var13 - 5 - var121;
                                        int var130 = var10.field2906 + var14 + 5;
                                        if (var129 < var13 + 5) {
                                            var129 = var13 + 5;
                                        }
                                        if (var121 + var129 > arg4) {
                                            var129 = arg4 - var121;
                                        }
                                        if (var122 + var130 > arg5) {
                                            var130 = arg5 - var122;
                                        }
                                        class83.method1768(var129, var130, var121, var122, 16777120);
                                        class83.method1759(var129, var130, var121, var122, 0);
                                        String var131 = var10.field2869;
                                        int var132 = var123.field3246 + var130 + 2;
                                        String var133 = method2327(var131, var10);
                                        while (var133.length() > 0) {
                                            int var134 = var133.indexOf(class2.field19);
                                            String var135;
                                            if (var134 == -1) {
                                                var135 = var133;
                                                var133 = "";
                                            } else {
                                                var135 = var133.substring(0, var134);
                                                var133 = var133.substring(var134 + 4);
                                            }
                                            var123.method3852(var135, var129 + 3, var132, 0, -1);
                                            var132 += var123.field3246 + 1;
                                        }
                                    }
                                    if (var10.field2840 == 9) {
                                        if (var10.field2822 == 1) {
                                            int var136;
                                            int var137;
                                            int var138;
                                            int var139;
                                            if (var10.field2823) {
                                                var136 = var13;
                                                var137 = var10.field2906 + var14;
                                                var138 = var10.field2804 + var13;
                                                var139 = var14;
                                            } else {
                                                var136 = var13;
                                                var137 = var14;
                                                var138 = var10.field2804 + var13;
                                                var139 = var10.field2906 + var14;
                                            }
                                            class83.method1765(var136, var137, var138, var139, var10.field2814);
                                        } else {
                                            int var140 = var10.field2804 >= 0 ? var10.field2804 : -var10.field2804;
                                            int var141 = var10.field2906 >= 0 ? var10.field2906 : -var10.field2906;
                                            int var142 = var140;
                                            if (var140 < var141) {
                                                var142 = var141;
                                            }
                                            if (var142 != 0) {
                                                int var143 = (var10.field2804 << 16) / var142;
                                                int var144 = (var10.field2906 << 16) / var142;
                                                if (var144 <= var143) {
                                                    var143 = -var143;
                                                } else {
                                                    var144 = -var144;
                                                }
                                                int var145 = var10.field2822 * var144 >> 17;
                                                int var146 = var10.field2822 * var144 + 1 >> 17;
                                                int var147 = var10.field2822 * var143 >> 17;
                                                int var148 = var10.field2822 * var143 + 1 >> 17;
                                                int var149 = var13 + var145;
                                                int var150 = var13 - var146;
                                                int var151 = var10.field2804 + var13 - var146;
                                                int var152 = var10.field2804 + var13 + var145;
                                                int var153 = var14 + var147;
                                                int var154 = var14 - var148;
                                                int var155 = var10.field2906 + var14 - var148;
                                                int var156 = var10.field2906 + var14 + var147;
                                                class95.method2058(var149, var150, var151);
                                                class95.method2022(var153, var154, var155, var149, var150, var151, var10.field2814);
                                                class95.method2058(var149, var151, var152);
                                                class95.method2022(var153, var155, var156, var149, var151, var152, var10.field2814);
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

    @ObfuscatedName("dp.cs(Ljava/lang/String;Lfe;B)Ljava/lang/String;")
    public static String method2327(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1049(arg1, var2 - 1);
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
                if (Statics.field568 != null) {
                    var8 = class167.method2111(Statics.field568.field2259);
                    if (Statics.field568.field2267 != null) {
                        var8 = (String) Statics.field568.field2267;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("b.cy(IB)Ljava/lang/String;")
    public static final String method64(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2017(65408) + var1.substring(0, var1.length() - 8) + class161.field2594 + " " + class2.field22 + var1 + class2.field25 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method2017(16777215) + var1.substring(0, var1.length() - 4) + class161.field2509 + " " + class2.field22 + var1 + class2.field25 + class2.field23;
        } else {
            return " " + class2.method2017(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("x.cm(Lfe;B)V")
    public static void method152(class177 arg0) {
        class177 var1 = arg0.field2808 == -1 ? null : class177.method2979(arg0.field2808);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2297;
            var3 = Statics.field1617;
        } else {
            var2 = var1.field2804;
            var3 = var1.field2906;
        }
        method643(arg0, var2, var3, false);
        Statics.method90(arg0, var2, var3);
    }

    @ObfuscatedName("fv.cu([Lfe;Lfe;ZI)V")
    public static void method3222(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2856 == 0 ? arg1.field2804 : arg1.field2856;
        int var4 = arg1.field2791 == 0 ? arg1.field2906 : arg1.field2791;
        method649(arg0, arg1.field2789, var3, var4, arg2);
        if (arg1.field2913 != null) {
            method649(arg1.field2913, arg1.field2789, var3, var4, arg2);
        }
        class4 var5 = (class4) field441.method3605((long) arg1.field2789);
        if (var5 != null) {
            method107(var5.field65, var3, var4, arg2);
        }
        if (arg1.field2793 == 1337) {
        }
    }

    @ObfuscatedName("c.cf(IIIZI)V")
    public static final void method107(int arg0, int arg1, int arg2, boolean arg3) {
        if (class177.method3200(arg0)) {
            method649(Statics.field2910[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ah.cc([Lfe;IIIZI)V")
    public static void method649(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2808 == arg1) {
                method643(var6, arg2, arg3, arg4);
                Statics.method90(var6, arg2, arg3);
                if (var6.field2810 > var6.field2856 - var6.field2804) {
                    var6.field2810 = var6.field2856 - var6.field2804;
                }
                if (var6.field2810 < 0) {
                    var6.field2810 = 0;
                }
                if (var6.field2909 > var6.field2791 - var6.field2906) {
                    var6.field2909 = var6.field2791 - var6.field2906;
                }
                if (var6.field2909 < 0) {
                    var6.field2909 = 0;
                }
                if (var6.field2840 == 0) {
                    method3222(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ay.cr(Lfe;IIZI)V")
    public static void method643(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2804;
        int var5 = arg0.field2906;
        if (arg0.field2796 == 0) {
            arg0.field2804 = arg0.field2800;
        } else if (arg0.field2796 == 1) {
            arg0.field2804 = arg1 - arg0.field2800;
        } else if (arg0.field2796 == 2) {
            arg0.field2804 = arg0.field2800 * arg1 >> 14;
        }
        if (arg0.field2797 == 0) {
            arg0.field2906 = arg0.field2801;
        } else if (arg0.field2797 == 1) {
            arg0.field2906 = arg2 - arg0.field2801;
        } else if (arg0.field2797 == 2) {
            arg0.field2906 = arg0.field2801 * arg2 >> 14;
        }
        if (arg0.field2796 == 4) {
            arg0.field2804 = arg0.field2906 * arg0.field2806 / arg0.field2807;
        }
        if (arg0.field2797 == 4) {
            arg0.field2906 = arg0.field2807 * arg0.field2804 / arg0.field2806;
        }
        if (field450 && arg0.field2840 == 0) {
            if (arg0.field2906 < 5 && arg0.field2804 < 5) {
                arg0.field2906 = 5;
                arg0.field2804 = 5;
            } else {
                if (arg0.field2906 <= 0) {
                    arg0.field2906 = 5;
                }
                if (arg0.field2804 <= 0) {
                    arg0.field2804 = 5;
                }
            }
        }
        if (arg0.field2793 == 1337) {
            field452 = arg0;
        }
        if (arg3 && arg0.field2792 != null && (arg0.field2804 != var4 || arg0.field2906 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field2 = arg0.field2792;
            field380.method3642(var6);
        }
    }

    @ObfuscatedName("x.cg(Lfe;IIIIIII)V")
    public static final void method154(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field330) {
            field365 = 32;
        } else {
            field365 = 0;
        }
        field330 = false;
        if (class144.field2206 == 1 || !Statics.field277 && class144.field2206 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2909 -= 4;
                method733(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2909 += 4;
                method733(arg0);
            } else if (arg5 >= arg1 - field365 && arg5 < field365 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2909 = (arg4 - arg3) * var8 / var9;
                method733(arg0);
                field330 = true;
            }
        }
        if (field478 == 0) {
            return;
        }
        int var10 = arg0.field2804;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2909 += field478 * 45;
            method733(arg0);
        }
    }

    @ObfuscatedName("ab.du(Lfe;II)I")
    public static final int method1049(class177 arg0, int arg1) {
        if (arg0.field2851 == null || arg1 >= arg0.field2851.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2851[arg1];
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
                    var7 = field417[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field547[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field419[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class177 var11 = class177.method2979(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method905(var12).field1168 || field286)) {
                        for (int var13 = 0; var13 < var11.field2868.length; var13++) {
                            if (var12 + 1 == var11.field2868[var13]) {
                                var7 += var11.field2908[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2941[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2341[field547[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2941[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field767.field54;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2337[var14]) {
                            var7 += field547[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method2979(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method905(var18).field1168 || field286)) {
                        for (int var19 = 0; var19 < var17.field2868.length; var19++) {
                            if (var18 + 1 == var17.field2868[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field382;
                }
                if (var6 == 12) {
                    var7 = field446;
                }
                if (var6 == 13) {
                    int var20 = class180.field2941[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method2322(var22);
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
                    var7 = (Statics.field767.field864 >> 7) + Statics.field713;
                }
                if (var6 == 19) {
                    var7 = (Statics.field767.field818 >> 7) + Statics.field138;
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

    @ObfuscatedName("eu.dv(Lfe;III)V")
    public static final void method2698(class177 arg0, int arg1, int arg2) {
        if (arg0.field2841 == 1) {
            method35(arg0.field2813, "", 24, 0, 0, arg0.field2789);
        }
        if (arg0.field2841 == 2 && !field435) {
            String var3;
            if (class182.method3232(method2021(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2898 == null || arg0.field2898.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2898;
            }
            if (var3 != null) {
                method35(var3, class2.method2017(65280) + arg0.field2905, 25, 0, -1, arg0.field2789);
            }
        }
        if (arg0.field2841 == 3) {
            method35(class161.field2505, "", 26, 0, 0, arg0.field2789);
        }
        if (arg0.field2841 == 4) {
            method35(arg0.field2813, "", 28, 0, 0, arg0.field2789);
        }
        if (arg0.field2841 == 5) {
            method35(arg0.field2813, "", 29, 0, 0, arg0.field2789);
        }
        if (arg0.field2841 == 6 && field444 == null) {
            method35(arg0.field2813, "", 30, 0, -1, arg0.field2789);
        }
        if (arg0.field2840 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2906; var6++) {
                for (int var7 = 0; var7 < arg0.field2804; var7++) {
                    int var8 = (arg0.field2826 + 32) * var7;
                    int var9 = (arg0.field2923 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2857[var5];
                        var9 += arg0.field2858[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field399 = var5;
                        Statics.field788 = arg0;
                        if (arg0.field2868[var5] > 0) {
                            class56 var10 = class56.method905(arg0.field2868[var5] - 1);
                            if (field433 == 1 && class182.method552(method2021(arg0))) {
                                if (Statics.field1264 != arg0.field2789 || Statics.field1129 != var5) {
                                    method35(class161.field2496, field434 + " " + class2.field24 + " " + class2.method2017(16748608) + var10.field1201, 31, var10.field1157, var5, arg0.field2789);
                                }
                            } else if (!field435 || !class182.method552(method2021(arg0))) {
                                String[] var11 = var10.field1177;
                                if (field451) {
                                    var11 = method109(var11);
                                }
                                if (class182.method552(method2021(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method35(var11[var12], class2.method2017(16748608) + var10.field1201, var13, var10.field1157, var5, arg0.field2789);
                                        } else if (var12 == 4) {
                                            method35(class161.field2350, class2.method2017(16748608) + var10.field1201, 37, var10.field1157, var5, arg0.field2789);
                                        }
                                    }
                                }
                                if (class182.method158(method2021(arg0))) {
                                    method35(class161.field2496, class2.method2017(16748608) + var10.field1201, 38, var10.field1157, var5, arg0.field2789);
                                }
                                if (class182.method552(method2021(arg0)) && var11 != null) {
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
                                            method35(var11[var14], class2.method2017(16748608) + var10.field1201, var15, var10.field1157, var5, arg0.field2789);
                                        }
                                    }
                                }
                                String[] var16 = arg0.field2860;
                                if (field451) {
                                    var16 = method109(var16);
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
                                            method35(var16[var17], class2.method2017(16748608) + var10.field1201, var18, var10.field1157, var5, arg0.field2789);
                                        }
                                    }
                                }
                                method35(class161.field2536, class2.method2017(16748608) + var10.field1201, 1005, var10.field1157, var5, arg0.field2789);
                            } else if ((Statics.field3211 & 0x10) == 16) {
                                method35(field493, field439 + " " + class2.field24 + " " + class2.method2017(16748608) + var10.field1201, 32, var10.field1157, var5, arg0.field2789);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2788) {
            return;
        }
        if (field435) {
            int var19 = method2021(arg0);
            boolean var20 = (var19 >> 21 & 0x1) != 0;
            if (var20 && (Statics.field3211 & 0x20) == 32) {
                method35(field493, field439 + " " + class2.field24 + " " + arg0.field2849, 58, 0, arg0.field2790, arg0.field2789);
            }
            return;
        }
        for (int var21 = 9; var21 >= 5; var21--) {
            int var22 = method2021(arg0);
            boolean var23 = (var22 >> var21 + 1 & 0x1) != 0;
            String var24;
            if (!var23 && arg0.field2889 == null) {
                var24 = null;
            } else if (arg0.field2811 == null || arg0.field2811.length <= var21 || arg0.field2811[var21] == null || arg0.field2811[var21].trim().length() == 0) {
                var24 = null;
            } else {
                var24 = arg0.field2811[var21];
            }
            if (var24 != null) {
                method35(var24, arg0.field2849, 1007, var21 + 1, arg0.field2790, arg0.field2789);
            }
        }
        String var26;
        if (class182.method3232(method2021(arg0)) == 0) {
            var26 = null;
        } else if (arg0.field2898 == null || arg0.field2898.trim().length() == 0) {
            var26 = null;
        } else {
            var26 = arg0.field2898;
        }
        if (var26 != null) {
            method35(var26, arg0.field2849, 25, 0, arg0.field2790, arg0.field2789);
        }
        for (int var28 = 4; var28 >= 0; var28--) {
            int var29 = method2021(arg0);
            boolean var30 = (var29 >> var28 + 1 & 0x1) != 0;
            String var31;
            if (!var30 && arg0.field2889 == null) {
                var31 = null;
            } else if (arg0.field2811 == null || arg0.field2811.length <= var28 || arg0.field2811[var28] == null || arg0.field2811[var28].trim().length() == 0) {
                var31 = null;
            } else {
                var31 = arg0.field2811[var28];
            }
            if (var31 != null) {
                method35(var31, arg0.field2849, 57, var28 + 1, arg0.field2790, arg0.field2789);
            }
        }
        if (class182.method134(method2021(arg0))) {
            method35(class161.field2597, "", 30, 0, arg0.field2790, arg0.field2789);
        }
    }

    @ObfuscatedName("ay.dr([Lfe;IIIIIIII)V")
    public static final void method646(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2788 || var9.field2840 == 0 || var9.field2818 || method2021(var9) != 0 || field454 == var9 || var9.field2793 == 1338) && var9.field2808 == arg1 && (!var9.field2788 || !method3298(var9))) {
                int var10 = var9.field2802 + arg6;
                int var11 = var9.field2863 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2840 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2840 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2804 + var10;
                    int var19 = var9.field2906 + var11;
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
                    int var22 = var9.field2804 + var10;
                    int var23 = var9.field2906 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field453 == var9) {
                    field509 = true;
                    field462 = var10;
                    field463 = var11;
                }
                if (!var9.field2788 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2193;
                    int var25 = class144.field2200;
                    if (class144.field2199 != 0) {
                        var24 = class144.field2198;
                        var25 = class144.field2208;
                    }
                    if (var9.field2793 == 1337) {
                        if (!field528 && !field421 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field433 == 0 && !field435) {
                                method35(class161.field2404, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1918; var28++) {
                                int var29 = class109.field1893[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field152.method1885(Statics.field223, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method106(var33);
                                        if (var34.field963 != null) {
                                            var34 = var34.method811();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field433 == 1) {
                                            method35(class161.field2496, field434 + " " + class2.field24 + " " + class2.method2017(65535) + var34.field936, 1, var29, var30, var31);
                                        } else if (!field435) {
                                            String[] var35 = var34.field940;
                                            if (field451) {
                                                var35 = method109(var35);
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
                                                        method35(var35[var36], class2.method2017(65535) + var34.field936, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method35(class161.field2536, class2.method2017(65535) + var34.field936, 1002, var34.field929 << 14, var30, var31);
                                        } else if ((Statics.field3211 & 0x4) == 4) {
                                            method35(field493, field439 + " " + class2.field24 + " " + class2.method2017(65535) + var34.field936, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field283[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field787.field895 == 1 && (var38.field864 & 0x7F) == 64 && (var38.field818 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field322; var39++) {
                                                class37 var40 = field283[field406[var39]];
                                                if (var40 != null && var38 != var40 && var40.field787.field895 == 1 && var38.field864 == var40.field864 && var38.field818 == var40.field818) {
                                                    method2096(var40.field787, field406[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field764;
                                            int[] var42 = class35.field759;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field332[var42[var43]];
                                                if (var44 != null && var38.field864 == var44.field864 && var38.field818 == var44.field818) {
                                                    method2663(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2096(var38.field787, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field332[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field864 & 0x7F) == 64 && (var45.field818 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field322; var46++) {
                                                class37 var47 = field283[field406[var46]];
                                                if (var47 != null && var47.field787.field895 == 1 && var45.field864 == var47.field864 && var45.field818 == var47.field818) {
                                                    method2096(var47.field787, field406[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field764;
                                            int[] var49 = class35.field759;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field332[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field864 == var51.field864 && var45.field818 == var51.field818) {
                                                    method2663(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field472 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2663(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field413[Statics.field223][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3647(); var53 != null; var53 = (class31) var52.method3649()) {
                                                class56 var54 = class56.method905(var53.field693);
                                                if (field433 == 1) {
                                                    method35(class161.field2496, field434 + " " + class2.field24 + " " + class2.method2017(16748608) + var54.field1201, 16, var53.field693, var30, var31);
                                                } else if (!field435) {
                                                    String[] var55 = var54.field1176;
                                                    if (field451) {
                                                        var55 = method109(var55);
                                                    }
                                                    for (int var56 = 4; var56 >= 0; var56--) {
                                                        if (var55 != null && var55[var56] != null) {
                                                            byte var57 = 0;
                                                            if (var56 == 0) {
                                                                var57 = 18;
                                                            }
                                                            if (var56 == 1) {
                                                                var57 = 19;
                                                            }
                                                            if (var56 == 2) {
                                                                var57 = 20;
                                                            }
                                                            if (var56 == 3) {
                                                                var57 = 21;
                                                            }
                                                            if (var56 == 4) {
                                                                var57 = 22;
                                                            }
                                                            method35(var55[var56], class2.method2017(16748608) + var54.field1201, var57, var53.field693, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method35(class161.field2349, class2.method2017(16748608) + var54.field1201, 20, var53.field693, var30, var31);
                                                        }
                                                    }
                                                    method35(class161.field2536, class2.method2017(16748608) + var54.field1201, 1004, var53.field693, var30, var31);
                                                } else if ((Statics.field3211 & 0x1) == 1) {
                                                    method35(field493, field439 + " " + class2.field24 + " " + class2.method2017(16748608) + var54.field1201, 17, var53.field693, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field332[field472];
                                method2663(var60, field472, var58, var59);
                            }
                        }
                    } else if (var9.field2793 == 1338) {
                        method176(var9, var10, var11);
                    } else {
                        if (!field421 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2698(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2840 == 0) {
                            if (!var9.field2788 && method3298(var9) && Statics.field1974 != var9) {
                                continue;
                            }
                            method646(arg0, var9.field2789, var12, var13, var14, var15, var10 - var9.field2810, var11 - var9.field2909);
                            if (var9.field2913 != null) {
                                method646(var9.field2913, var9.field2789, var12, var13, var14, var15, var10 - var9.field2810, var11 - var9.field2909);
                            }
                            class4 var61 = (class4) field441.method3605((long) var9.field2789);
                            if (var61 != null) {
                                if (var61.field59 == 0 && class144.field2193 >= var12 && class144.field2200 >= var13 && class144.field2193 < var14 && class144.field2200 < var15 && !field421 && !field450) {
                                    for (class1 var62 = (class1) field380.method3646(); var62 != null; var62 = (class1) field380.method3648()) {
                                        if (var62.field8) {
                                            var62.method3744();
                                            var62.field3.field2914 = false;
                                        }
                                    }
                                    if (Statics.field2257 == 0) {
                                        field453 = null;
                                        field454 = null;
                                    }
                                    if (!field421) {
                                        field427[0] = class161.field2375;
                                        field428[0] = "";
                                        field425[0] = 1006;
                                        field422 = 1;
                                    }
                                }
                                int var63 = var61.field65;
                                if (class177.method3200(var63)) {
                                    method646(Statics.field2910[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2788) {
                            if (var9.field2922) {
                                if (class144.field2193 >= var12 && class144.field2200 >= var13 && class144.field2193 < var14 && class144.field2200 < var15) {
                                    for (class1 var64 = (class1) field380.method3646(); var64 != null; var64 = (class1) field380.method3648()) {
                                        if (var64.field8) {
                                            var64.method3744();
                                            var64.field3.field2914 = false;
                                        }
                                    }
                                    if (Statics.field2257 == 0) {
                                        field453 = null;
                                        field454 = null;
                                    }
                                    if (!field421) {
                                        field427[0] = class161.field2375;
                                        field428[0] = "";
                                        field425[0] = 1006;
                                        field422 = 1;
                                    }
                                }
                            } else if (var9.field2878 && class144.field2193 >= var12 && class144.field2200 >= var13 && class144.field2193 < var14 && class144.field2200 < var15) {
                                for (class1 var65 = (class1) field380.method3646(); var65 != null; var65 = (class1) field380.method3648()) {
                                    if (var65.field8 && var65.field3.field2866 == var65.field2) {
                                        var65.method3744();
                                    }
                                }
                            }
                            boolean var66;
                            if (class144.field2193 >= var12 && class144.field2200 >= var13 && class144.field2193 < var14 && class144.field2200 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class144.field2206 == 1 || !Statics.field277 && class144.field2206 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class144.field2199 == 1 || !Statics.field277 && class144.field2199 == 4) && class144.field2198 >= var12 && class144.field2208 >= var13 && class144.field2198 < var14 && class144.field2208 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method1613(var9, class144.field2198 - var10, class144.field2208 - var11);
                            }
                            if (field453 != null && field453 != var9 && var66) {
                                int var69 = method2021(var9);
                                boolean var70 = (var69 >> 20 & 0x1) != 0;
                                if (var70) {
                                    field371 = var9;
                                }
                            }
                            if (field454 == var9) {
                                field397 = true;
                                field401 = var10;
                                field460 = var11;
                            }
                            if (var9.field2818) {
                                if (var66 && field478 != 0 && var9.field2866 != null) {
                                    class1 var71 = new class1();
                                    var71.field8 = true;
                                    var71.field3 = var9;
                                    var71.field6 = field478;
                                    var71.field2 = var9.field2866;
                                    field380.method3642(var71);
                                }
                                if (field453 != null || Statics.field125 != null || field421) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2915 && var68) {
                                    var9.field2915 = true;
                                    if (var9.field2871 != null) {
                                        class1 var72 = new class1();
                                        var72.field8 = true;
                                        var72.field3 = var9;
                                        var72.field4 = class144.field2198 - var10;
                                        var72.field6 = class144.field2208 - var11;
                                        var72.field2 = var9.field2871;
                                        field380.method3642(var72);
                                    }
                                }
                                if (var9.field2915 && var67 && var9.field2872 != null) {
                                    class1 var73 = new class1();
                                    var73.field8 = true;
                                    var73.field3 = var9;
                                    var73.field4 = class144.field2193 - var10;
                                    var73.field6 = class144.field2200 - var11;
                                    var73.field2 = var9.field2872;
                                    field380.method3642(var73);
                                }
                                if (var9.field2915 && !var67) {
                                    var9.field2915 = false;
                                    if (var9.field2873 != null) {
                                        class1 var74 = new class1();
                                        var74.field8 = true;
                                        var74.field3 = var9;
                                        var74.field4 = class144.field2193 - var10;
                                        var74.field6 = class144.field2200 - var11;
                                        var74.field2 = var9.field2873;
                                        field335.method3642(var74);
                                    }
                                }
                                if (var67 && var9.field2887 != null) {
                                    class1 var75 = new class1();
                                    var75.field8 = true;
                                    var75.field3 = var9;
                                    var75.field4 = class144.field2193 - var10;
                                    var75.field6 = class144.field2200 - var11;
                                    var75.field2 = var9.field2887;
                                    field380.method3642(var75);
                                }
                                if (!var9.field2914 && var66) {
                                    var9.field2914 = true;
                                    if (var9.field2875 != null) {
                                        class1 var76 = new class1();
                                        var76.field8 = true;
                                        var76.field3 = var9;
                                        var76.field4 = class144.field2193 - var10;
                                        var76.field6 = class144.field2200 - var11;
                                        var76.field2 = var9.field2875;
                                        field380.method3642(var76);
                                    }
                                }
                                if (var9.field2914 && var66 && var9.field2876 != null) {
                                    class1 var77 = new class1();
                                    var77.field8 = true;
                                    var77.field3 = var9;
                                    var77.field4 = class144.field2193 - var10;
                                    var77.field6 = class144.field2200 - var11;
                                    var77.field2 = var9.field2876;
                                    field380.method3642(var77);
                                }
                                if (var9.field2914 && !var66) {
                                    var9.field2914 = false;
                                    if (var9.field2877 != null) {
                                        class1 var78 = new class1();
                                        var78.field8 = true;
                                        var78.field3 = var9;
                                        var78.field4 = class144.field2193 - var10;
                                        var78.field6 = class144.field2200 - var11;
                                        var78.field2 = var9.field2877;
                                        field335.method3642(var78);
                                    }
                                }
                                if (var9.field2780 != null) {
                                    class1 var79 = new class1();
                                    var79.field3 = var9;
                                    var79.field2 = var9.field2780;
                                    field480.method3642(var79);
                                }
                                if (var9.field2882 != null && field436 > var9.field2844) {
                                    if (var9.field2883 == null || field436 - var9.field2844 > 32) {
                                        class1 var84 = new class1();
                                        var84.field3 = var9;
                                        var84.field2 = var9.field2882;
                                        field380.method3642(var84);
                                    } else {
                                        label771: for (int var80 = var9.field2844; var80 < field436; var80++) {
                                            int var81 = field466[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2883.length; var82++) {
                                                if (var9.field2883[var82] == var81) {
                                                    class1 var83 = new class1();
                                                    var83.field3 = var9;
                                                    var83.field2 = var9.field2882;
                                                    field380.method3642(var83);
                                                    break label771;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2844 = field436;
                                }
                                if (var9.field2884 != null && field469 > var9.field2918) {
                                    if (var9.field2885 == null || field469 - var9.field2918 > 32) {
                                        class1 var89 = new class1();
                                        var89.field3 = var9;
                                        var89.field2 = var9.field2884;
                                        field380.method3642(var89);
                                    } else {
                                        label747: for (int var85 = var9.field2918; var85 < field469; var85++) {
                                            int var86 = field551[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2885.length; var87++) {
                                                if (var9.field2885[var87] == var86) {
                                                    class1 var88 = new class1();
                                                    var88.field3 = var9;
                                                    var88.field2 = var9.field2884;
                                                    field380.method3642(var88);
                                                    break label747;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2918 = field469;
                                }
                                if (var9.field2812 != null && field445 > var9.field2919) {
                                    if (var9.field2785 == null || field445 - var9.field2919 > 32) {
                                        class1 var94 = new class1();
                                        var94.field3 = var9;
                                        var94.field2 = var9.field2812;
                                        field380.method3642(var94);
                                    } else {
                                        label723: for (int var90 = var9.field2919; var90 < field445; var90++) {
                                            int var91 = field470[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2785.length; var92++) {
                                                if (var9.field2785[var92] == var91) {
                                                    class1 var93 = new class1();
                                                    var93.field3 = var9;
                                                    var93.field2 = var9.field2812;
                                                    field380.method3642(var93);
                                                    break label723;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2919 = field445;
                                }
                                if (field326 > var9.field2805 && var9.field2848 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field2 = var9.field2848;
                                    field380.method3642(var95);
                                }
                                if (field473 > var9.field2805 && var9.field2893 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field2 = var9.field2893;
                                    field380.method3642(var96);
                                }
                                if (field282 > var9.field2805 && var9.field2894 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field2 = var9.field2894;
                                    field380.method3642(var97);
                                }
                                if (field475 > var9.field2805 && var9.field2874 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field2 = var9.field2874;
                                    field380.method3642(var98);
                                }
                                if (field476 > var9.field2805 && var9.field2900 != null) {
                                    class1 var99 = new class1();
                                    var99.field3 = var9;
                                    var99.field2 = var9.field2900;
                                    field380.method3642(var99);
                                }
                                if (field481 > var9.field2805 && var9.field2895 != null) {
                                    class1 var100 = new class1();
                                    var100.field3 = var9;
                                    var100.field2 = var9.field2895;
                                    field380.method3642(var100);
                                }
                                var9.field2805 = field296;
                                if (var9.field2853 != null) {
                                    for (int var101 = 0; var101 < field503; var101++) {
                                        class1 var102 = new class1();
                                        var102.field3 = var9;
                                        var102.field12 = field505[var101];
                                        var102.field9 = field504[var101];
                                        var102.field2 = var9.field2853;
                                        field380.method3642(var102);
                                    }
                                }
                            }
                        }
                        if (!var9.field2788 && field453 == null && Statics.field125 == null && !field421) {
                            if ((var9.field2904 >= 0 || var9.field2854 != 0) && class144.field2193 >= var12 && class144.field2200 >= var13 && class144.field2193 < var14 && class144.field2200 < var15) {
                                if (var9.field2904 >= 0) {
                                    Statics.field1974 = arg0[var9.field2904];
                                } else {
                                    Statics.field1974 = var9;
                                }
                            }
                            if (var9.field2840 == 8 && class144.field2193 >= var12 && class144.field2200 >= var13 && class144.field2193 < var14 && class144.field2200 < var15) {
                                Statics.field1673 = var9;
                            }
                            if (var9.field2791 > var9.field2906) {
                                method154(var9, var9.field2804 + var10, var11, var9.field2906, var9.field2791, class144.field2193, class144.field2200);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.di(III)V")
    public static final void method147(int arg0, int arg1) {
        if (class177.method3200(arg0)) {
            method2818(Statics.field2910[arg0], arg1);
        }
    }

    @ObfuscatedName("ev.dg([Lfe;II)V")
    public static final void method2818(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2840 == 0) {
                    if (var3.field2913 != null) {
                        method2818(var3.field2913, arg1);
                    }
                    class4 var4 = (class4) field441.method3605((long) var3.field2789);
                    if (var4 != null) {
                        method147(var4.field65, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2896 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field2 = var3.field2896;
                    class39.method2320(var5);
                }
                if (arg1 == 1 && var3.field2897 != null) {
                    if (var3.field2790 >= 0) {
                        class177 var6 = class177.method2979(var3.field2789);
                        if (var6 == null || var6.field2913 == null || var3.field2790 >= var6.field2913.length || var6.field2913[var3.field2790] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field2 = var3.field2897;
                    class39.method2320(var7);
                }
            }
        }
    }

    @ObfuscatedName("cz.dc(Lfe;III)V")
    public static final void method1613(class177 arg0, int arg1, int arg2) {
        if (field453 != null || field421 || arg0 == null) {
            return;
        }
        class177 var3 = arg0;
        int var4 = class182.method972(method2021(arg0));
        class177 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class177.method2979(var3.field2808);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class177 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2916;
        }
        if (var7 == null) {
            return;
        }
        field453 = arg0;
        class177 var9 = arg0;
        int var10 = class182.method972(method2021(arg0));
        class177 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class177.method2979(var9.field2808);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class177 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2916;
        }
        field454 = var13;
        field522 = arg1;
        field456 = arg2;
        Statics.field2257 = 0;
        field464 = false;
        if (field422 > 0) {
            int var15 = field422 - 1;
            Statics.field604 = new class33();
            Statics.field604.field719 = field564[var15];
            Statics.field604.field715 = field424[var15];
            Statics.field604.field709 = field425[var15];
            Statics.field604.field711 = field479[var15];
            Statics.field604.field710 = field427[var15];
        }
        return;
    }

    @ObfuscatedName("aa.dd(Lfe;B)V")
    public static void method733(class177 arg0) {
        if (field484 == arg0.field2921) {
            field527[arg0.field2920] = true;
        }
    }

    @ObfuscatedName("k.do(B)V")
    public static void method92() {
        for (class4 var0 = (class4) field441.method3608(); var0 != null; var0 = (class4) field441.method3613()) {
            int var1 = var0.field65;
            if (class177.method3200(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2910[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2788;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3167;
                    class177 var6 = class177.method2979(var5);
                    if (var6 != null) {
                        method733(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.dn([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method109(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("dh.dw(II)V")
    public static final void method2326(int arg0) {
        if (!class177.method3200(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2910[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2911 = 0;
                var3.field2912 = 0;
            }
        }
    }

    @ObfuscatedName("n.dh([Lfe;IB)V")
    public static final void method21(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2808 == arg1 && (!var3.field2788 || !method3298(var3))) {
                if (var3.field2840 == 0) {
                    if (!var3.field2788 && method3298(var3) && Statics.field1974 != var3) {
                        continue;
                    }
                    method21(arg0, var3.field2789);
                    if (var3.field2913 != null) {
                        method21(var3.field2913, var3.field2789);
                    }
                    class4 var4 = (class4) field441.method3605((long) var3.field2789);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (class177.method3200(var5)) {
                            method21(Statics.field2910[var5], -1);
                        }
                    }
                }
                if (var3.field2840 == 6) {
                    if (var3.field2836 != -1 || var3.field2837 != -1) {
                        boolean var6 = Statics.method706(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2837;
                        } else {
                            var7 = var3.field2836;
                        }
                        if (var7 != -1) {
                            class45 var8 = class45.method1289(var7);
                            var3.field2912 += field359;
                            while (var3.field2912 > var8.field995[var3.field2911]) {
                                var3.field2912 -= var8.field995[var3.field2911];
                                var3.field2911++;
                                if (var3.field2911 >= var8.field993.length) {
                                    var3.field2911 -= var8.field997;
                                    if (var3.field2911 < 0 || var3.field2911 >= var8.field993.length) {
                                        var3.field2911 = 0;
                                    }
                                }
                                method733(var3);
                            }
                        }
                    }
                    if (var3.field2888 != 0 && !var3.field2788) {
                        int var9 = var3.field2888 >> 16;
                        int var10 = var3.field2888 << 16 >> 16;
                        int var11 = field359 * var9;
                        int var12 = field359 * var10;
                        var3.field2821 = var3.field2821 + var11 & 0x7FF;
                        var3.field2827 = var3.field2827 + var12 & 0x7FF;
                        method733(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.de(II)V")
    public static final void method1654(int arg0) {
        method92();
        class25.method568();
        int var1 = class57.method1845(arg0).field1211;
        if (var1 == 0) {
            return;
        }
        int var2 = class180.field2941[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class95.method2028(0.9D);
                ((class99) Statics.field1643).method2097(0.9D);
            }
            if (var2 == 2) {
                class95.method2028(0.8D);
                ((class99) Statics.field1643).method2097(0.8D);
            }
            if (var2 == 3) {
                class95.method2028(0.7D);
                ((class99) Statics.field1643).method2097(0.7D);
            }
            if (var2 == 4) {
                class95.method2028(0.6D);
                ((class99) Statics.field1643).method2097(0.6D);
            }
            class56.field1158.method3572();
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
            if (field517 != var3) {
                if (field517 == 0 && field518 != -1) {
                    class187.method17(Statics.field1051, field518, 0, var3, false);
                    field471 = false;
                } else if (var3 == 0) {
                    class187.method2981();
                    field471 = false;
                } else {
                    class187.method2277(var3);
                }
                field517 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field520 = 127;
            }
            if (var2 == 1) {
                field520 = 96;
            }
            if (var2 == 2) {
                field520 = 64;
            }
            if (var2 == 3) {
                field520 = 32;
            }
            if (var2 == 4) {
                field520 = 0;
            }
        }
        if (var1 == 5) {
            field420 = var2;
        }
        if (var1 == 6) {
            field442 = var2;
        }
        if (var1 == 9) {
            field550 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field521 = 127;
            }
            if (var2 == 1) {
                field521 = 96;
            }
            if (var2 == 2) {
                field521 = 64;
            }
            if (var2 == 3) {
                field521 = 32;
            }
            if (var2 == 4) {
                field521 = 0;
            }
        }
        if (var1 == 17) {
            field448 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field511 = (class22) class113.method3065(class22.method3000(), var2);
            if (field511 == null) {
                field511 = class22.field582;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field472 = -1;
            } else {
                field472 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field321 = (class22) class113.method3065(class22.method3000(), var2);
            if (field321 == null) {
                field321 = class22.field582;
            }
        }
    }

    @ObfuscatedName("fm.dp(IIIB)Lt;")
    public static final class4 method2993(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field65 = arg1;
        var3.field59 = arg2;
        field441.method3606(var3, (long) arg0);
        method2326(arg1);
        class177 var4 = class177.method2979(arg0);
        method733(var4);
        if (field444 != null) {
            method733(field444);
            field444 = null;
        }
        method183();
        method3222(Statics.field2910[arg0 >> 16], var4, false);
        class39.method748(arg1);
        if (field302 != -1) {
            method147(field302, 1);
        }
        return var3;
    }

    @ObfuscatedName("n.db(Lt;ZS)V")
    public static final void method34(class4 arg0, boolean arg1) {
        int var2 = arg0.field65;
        int var3 = (int) arg0.field3167;
        arg0.method3744();
        if (arg1 && var2 != -1 && Statics.field2892[var2]) {
            Statics.field2781.method3099(var2);
            if (Statics.field2910[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2910[var2].length; var5++) {
                    if (Statics.field2910[var2][var5] != null) {
                        if (Statics.field2910[var2][var5].field2840 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2910[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2910[var2] = null;
                }
                Statics.field2892[var2] = false;
            }
        }
        for (class205 var6 = (class205) field438.method3608(); var6 != null; var6 = (class205) field438.method3613()) {
            if ((long) var2 == (var6.field3167 >> 48 & 0xFFFFL)) {
                var6.method3744();
            }
        }
        class177 var7 = class177.method2979(var3);
        if (var7 != null) {
            method733(var7);
        }
        method183();
        if (field302 != -1) {
            method147(field302, 1);
        }
    }

    @ObfuscatedName("b.da(Lfe;I)Z")
    public static final boolean method81(class177 arg0) {
        int var1 = arg0.field2793;
        if (var1 == 205) {
            field336 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field306.method3335(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field306.method3336(var4, var5 == 1);
        }
        if (var1 == 324) {
            field306.method3337(false);
        }
        if (var1 == 325) {
            field306.method3337(true);
        }
        if (var1 == 326) {
            field398.method2634(135);
            field306.method3338(field398);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dq.dq(Lfe;IIII)V")
    public static final void method2343(class177 arg0, int arg1, int arg2, int arg3) {
        method992();
        class179 var4 = arg0.method3268(false);
        if (var4 == null) {
            return;
        }
        class83.method1802(arg1, arg2, var4.field2931 + arg1, var4.field2932 + arg2);
        if (field370 == 2 || field370 == 5) {
            class83.method1766(arg1, arg2, 0, var4.field2934, var4.field2933);
        } else {
            int var5 = field367 + field309 & 0x7FF;
            int var6 = Statics.field767.field864 / 32 + 48;
            int var7 = 464 - Statics.field767.field818 / 32;
            Statics.field1661.method1690(arg1, arg2, var4.field2931, var4.field2932, var6, var7, var5, field499 + 256, var4.field2934, var4.field2933);
            for (int var8 = 0; var8 < field510; var8++) {
                int var9 = field535[var8] * 4 + 2 - Statics.field767.field864 / 32;
                int var10 = field512[var8] * 4 + 2 - Statics.field767.field818 / 32;
                method189(arg1, arg2, var9, var10, field513[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class203 var13 = field413[Statics.field223][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field767.field864 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field767.field818 / 32;
                        method189(arg1, arg2, var14, var15, Statics.field75[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field322; var16++) {
                class37 var17 = field283[field406[var16]];
                if (var17 != null && var17.method25()) {
                    class42 var18 = var17.field787;
                    if (var18 != null && var18.field914 != null) {
                        var18 = var18.method778();
                    }
                    if (var18 != null && var18.field905 && var18.field917) {
                        int var19 = var17.field864 / 32 - Statics.field767.field864 / 32;
                        int var20 = var17.field818 / 32 - Statics.field767.field818 / 32;
                        method189(arg1, arg2, var19, var20, Statics.field75[1], var4);
                    }
                }
            }
            int var21 = class35.field764;
            int[] var22 = class35.field759;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field332[var22[var23]];
                if (var24 != null && var24.method25() && !var24.field53 && Statics.field767 != var24) {
                    int var25 = var24.field864 / 32 - Statics.field767.field864 / 32;
                    int var26 = var24.field818 / 32 - Statics.field767.field818 / 32;
                    boolean var27 = false;
                    if (method80(var24.field56, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field225; var29++) {
                        if (var24.field56.equals(Statics.field1683[var29].field638)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field767.field51 != 0 && var24.field51 != 0 && Statics.field767.field51 == var24.field51) {
                        var30 = true;
                    }
                    if (var27) {
                        method189(arg1, arg2, var25, var26, Statics.field75[3], var4);
                    } else if (var30) {
                        method189(arg1, arg2, var25, var26, Statics.field75[4], var4);
                    } else if (var28) {
                        method189(arg1, arg2, var25, var26, Statics.field75[5], var4);
                    } else {
                        method189(arg1, arg2, var25, var26, Statics.field75[2], var4);
                    }
                }
            }
            if (field299 != 0 && field291 % 20 < 10) {
                if (field299 == 1 && field279 >= 0 && field279 < field283.length) {
                    class37 var31 = field283[field279];
                    if (var31 != null) {
                        int var32 = var31.field864 / 32 - Statics.field767.field864 / 32;
                        int var33 = var31.field818 / 32 - Statics.field767.field818 / 32;
                        method121(arg1, arg2, var32, var33, Statics.field585[1], var4);
                    }
                }
                if (field299 == 2) {
                    int var34 = field354 * 4 - Statics.field713 * 4 + 2 - Statics.field767.field864 / 32;
                    int var35 = field358 * 4 - Statics.field138 * 4 + 2 - Statics.field767.field818 / 32;
                    method121(arg1, arg2, var34, var35, Statics.field585[1], var4);
                }
                if (field299 == 10 && field534 >= 0 && field534 < field332.length) {
                    class3 var36 = field332[field534];
                    if (var36 != null) {
                        int var37 = var36.field864 / 32 - Statics.field767.field864 / 32;
                        int var38 = var36.field818 / 32 - Statics.field767.field818 / 32;
                        method121(arg1, arg2, var37, var38, Statics.field585[1], var4);
                    }
                }
            }
            if (field432 != 0) {
                int var39 = field432 * 4 + 2 - Statics.field767.field864 / 32;
                int var40 = field515 * 4 + 2 - Statics.field767.field818 / 32;
                method189(arg1, arg2, var39, var40, Statics.field585[0], var4);
            }
            if (!Statics.field767.field53) {
                class83.method1768(var4.field2931 / 2 + arg1 - 1, var4.field2932 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field486[arg3] = true;
    }

    @ObfuscatedName("l.dz(IIIILcw;Lfr;I)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method189(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field367 + field309 & 0x7FF;
        int var8 = class95.field1636[var7];
        int var9 = class95.field1647[var7];
        int var10 = var8 * 256 / (field499 + 256);
        int var11 = var9 * 256 / (field499 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field973.method1681(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("q.dj(IIIILcw;Lfr;I)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field367 + field309 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1636[var6];
        int var9 = class95.field1647[var6];
        int var10 = var8 * 256 / (field499 + 256);
        int var11 = var9 * 256 / (field499 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1679(arg5.field2931 / 2 + var12 - arg4.field1463 / 2, arg5.field2932 / 2 - var13 - arg4.field1458 / 2, arg0, arg1, arg5.field2931, arg5.field2932, arg5.field2934, arg5.field2933);
        } else {
            arg4.method1670(arg5.field2931 / 2 + arg0 + var12 - arg4.field1463 / 2, arg5.field2932 / 2 + arg1 - var13 - arg4.field1458 / 2);
        }
    }

    @ObfuscatedName("b.dx(Ljava/lang/String;ZI)Z")
    public static boolean method80(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method947(arg0, Statics.field2189);
        for (int var3 = 0; var3 < field298; var3++) {
            if (var2.equalsIgnoreCase(class168.method947(field549[var3].field245, Statics.field2189)) && (!arg1 || field549[var3].field251 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method947(Statics.field767.field56, Statics.field2189))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("c.dy(Ljava/lang/String;I)Z")
    public static boolean method102(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method947(arg0, Statics.field2189);
        for (int var2 = 0; var2 < field295; var2++) {
            class8 var3 = field333[var2];
            if (var1.equalsIgnoreCase(class168.method947(var3.field129, Statics.field2189))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method947(var3.field130, Statics.field2189))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("af.dt(Ljava/lang/String;I)V")
    public static final void method937(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method947(arg0, Statics.field2189);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field298; var2++) {
            class18 var3 = field549[var2];
            String var4 = var3.field245;
            String var5 = class168.method947(var4, Statics.field2189);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field298--;
                for (int var7 = var2; var7 < field298; var7++) {
                    field549[var7] = field549[var7 + 1];
                }
                field473 = field296;
                field398.method2634(173);
                field398.method2384(class123.method1542(arg0));
                field398.method2390(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("as.dl(Ljava/lang/String;II)V")
    public static final void method747(String arg0, int arg1) {
        field398.method2634(205);
        field398.method2384(class123.method1542(arg0) + 1);
        field398.method2390(arg0);
        field398.method2425(arg1);
    }

    @ObfuscatedName("fn.dm(B)V")
    public static final void method3290() {
        field398.method2634(221);
        field398.method2384(0);
    }

    @ObfuscatedName("ce.dk(Lfe;I)I")
    public static int method2021(class177 arg0) {
        class205 var1 = (class205) field438.method3605(((long) arg0.field2789 << 32) + (long) arg0.field2790);
        return var1 == null ? arg0.field2816 : var1.field3152;
    }

    @ObfuscatedName("fr.ds(Lfe;I)Z")
    public static boolean method3298(class177 arg0) {
        if (field450) {
            if (method2021(arg0) != 0) {
                return false;
            }
            if (arg0.field2840 == 0) {
                return false;
            }
        }
        return arg0.field2809;
    }

    @ObfuscatedName("df.df(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2684(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field344 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field344 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field344 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field344 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field344 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field220 != null) {
            var3 = "/p=" + Statics.field220;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field288 + "/a=" + Statics.field1402 + var3 + "/";
    }

    @ObfuscatedName("ai.eb(Ljava/lang/String;I)V")
    public static void method768(String arg0) {
        Statics.field220 = arg0;
        try {
            String var1 = Statics.field443.getParameter(class194.field3116.field3119);
            String var2 = Statics.field443.getParameter(class194.field3117.field3119);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class115.method898(class119.method137() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class136.method2730(Statics.field443, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }
}

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
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.z")
    public static boolean field411 = true;

    @ObfuscatedName("client.i")
    public static int field283 = 1;

    @ObfuscatedName("client.b")
    public static int field284 = 0;

    @ObfuscatedName("client.m")
    public static int field561 = 0;

    @ObfuscatedName("client.d")
    public static boolean field286 = false;

    @ObfuscatedName("client.v")
    public static boolean field315 = false;

    @ObfuscatedName("client.q")
    public static int field282 = 0;

    @ObfuscatedName("client.u")
    public static int field289 = 0;

    @ObfuscatedName("client.a")
    public static boolean field290 = true;

    @ObfuscatedName("client.e")
    public static int field291 = 0;

    @ObfuscatedName("client.c")
    public static long field292 = 1L;

    @ObfuscatedName("client.k")
    public static int field316 = -1;

    @ObfuscatedName("client.w")
    public static class112[] field341 = new class112[4];

    @ObfuscatedName("client.o")
    public static int field440 = -1;

    @ObfuscatedName("client.ah")
    public static int field295 = -1;

    @ObfuscatedName("client.an")
    public static boolean field296 = true;

    @ObfuscatedName("client.ag")
    public static boolean field297 = false;

    @ObfuscatedName("client.as")
    public static int field298 = 0;

    @ObfuscatedName("client.aq")
    public static int field526 = 0;

    @ObfuscatedName("client.ax")
    public static int field300 = 0;

    @ObfuscatedName("client.az")
    public static int field301 = 0;

    @ObfuscatedName("client.ap")
    public static int field420 = 0;

    @ObfuscatedName("client.ao")
    public static int field303 = 0;

    @ObfuscatedName("client.af")
    public static int field304 = 0;

    @ObfuscatedName("client.au")
    public static int field356 = 0;

    @ObfuscatedName("client.ab")
    public static int field306 = 0;

    @ObfuscatedName("client.ad")
    public static class22 field416 = class22.field578;

    @ObfuscatedName("client.am")
    public static class22 field308 = class22.field578;

    @ObfuscatedName("client.aw")
    public static int field309 = 0;

    @ObfuscatedName("client.aa")
    public static int field310 = 0;

    @ObfuscatedName("client.av")
    public static int field403 = 0;

    @ObfuscatedName("client.bc")
    public static int field453 = 0;

    @ObfuscatedName("client.bo")
    public static int field523 = 0;

    @ObfuscatedName("client.ba")
    public static int field469 = 0;

    @ObfuscatedName("client.bd")
    public static int field402 = 0;

    @ObfuscatedName("client.bs")
    public static int field317 = 0;

    @ObfuscatedName("client.ca")
    public static class37[] field319 = new class37[32768];

    @ObfuscatedName("client.cg")
    public static int field320 = 0;

    @ObfuscatedName("client.cd")
    public static int[] field321 = new int[32768];

    @ObfuscatedName("client.ck")
    public static int field322 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field467 = new int[250];

    @ObfuscatedName("client.cx")
    public static class126 field324 = new class126(5000);

    @ObfuscatedName("client.cl")
    public static class126 field325 = new class126(5000);

    @ObfuscatedName("client.ci")
    public static class126 field447 = new class126(15000);

    @ObfuscatedName("client.ct")
    public static int field327 = 0;

    @ObfuscatedName("client.cf")
    public static int field328 = 0;

    @ObfuscatedName("client.cn")
    public static int field329 = 0;

    @ObfuscatedName("client.ch")
    public static int field314 = 0;

    @ObfuscatedName("client.cp")
    public static int field331 = 0;

    @ObfuscatedName("client.cc")
    public static int field397 = 0;

    @ObfuscatedName("client.cu")
    public static int field333 = 0;

    @ObfuscatedName("client.cz")
    public static int field441 = 0;

    @ObfuscatedName("client.cs")
    public static boolean field349 = false;

    @ObfuscatedName("client.dj")
    public static int field336 = 0;

    @ObfuscatedName("client.do")
    public static int field337 = 1;

    @ObfuscatedName("client.dw")
    public static int field338 = 0;

    @ObfuscatedName("client.dh")
    public static int field536 = 1;

    @ObfuscatedName("client.dn")
    public static int field406 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field342 = false;

    @ObfuscatedName("client.de")
    public static int[][][] field390 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field344 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dg")
    public static int field345 = 0;

    @ObfuscatedName("client.ds")
    public static int field346 = 2;

    @ObfuscatedName("client.dx")
    public static int field347 = 0;

    @ObfuscatedName("client.df")
    public static int field364 = 2;

    @ObfuscatedName("client.dm")
    public static int field491 = 0;

    @ObfuscatedName("client.ed")
    public static int field350 = 1;

    @ObfuscatedName("client.eq")
    public static int field351 = 0;

    @ObfuscatedName("client.ef")
    public static int field352 = 0;

    @ObfuscatedName("client.ez")
    public static int field425 = 2;

    @ObfuscatedName("client.er")
    public static int field354 = 0;

    @ObfuscatedName("client.eo")
    public static int field355 = 1;

    @ObfuscatedName("client.ea")
    public static int field353 = 0;

    @ObfuscatedName("client.ek")
    public static int field330 = 0;

    @ObfuscatedName("client.en")
    public static int field360 = 2301979;

    @ObfuscatedName("client.ej")
    public static int field361 = 5063219;

    @ObfuscatedName("client.ec")
    public static int field362 = 3353893;

    @ObfuscatedName("client.ew")
    public static int field556 = 7759444;

    @ObfuscatedName("client.ev")
    public static boolean field430 = false;

    @ObfuscatedName("client.el")
    public static int field365 = 0;

    @ObfuscatedName("client.fl")
    public static int field366 = 128;

    @ObfuscatedName("client.fh")
    public static int field367 = 0;

    @ObfuscatedName("client.fo")
    public static int field368 = 0;

    @ObfuscatedName("client.fs")
    public static int field369 = 0;

    @ObfuscatedName("client.fv")
    public static int field370 = 0;

    @ObfuscatedName("client.fc")
    public static int field307 = 0;

    @ObfuscatedName("client.fz")
    public static int field372 = 50;

    @ObfuscatedName("client.fp")
    public static int field373 = 0;

    @ObfuscatedName("client.fw")
    public static boolean field374 = false;

    @ObfuscatedName("client.fb")
    public static int field375 = 0;

    @ObfuscatedName("client.fy")
    public static int field376 = 0;

    @ObfuscatedName("client.fi")
    public static int field363 = 50;

    @ObfuscatedName("client.fx")
    public static int[] field476 = new int[field363];

    @ObfuscatedName("client.fj")
    public static int[] field379 = new int[field363];

    @ObfuscatedName("client.fr")
    public static int[] field380 = new int[field363];

    @ObfuscatedName("client.fd")
    public static int[] field357 = new int[field363];

    @ObfuscatedName("client.fa")
    public static int[] field560 = new int[field363];

    @ObfuscatedName("client.fk")
    public static int[] field383 = new int[field363];

    @ObfuscatedName("client.fg")
    public static int[] field384 = new int[field363];

    @ObfuscatedName("client.gl")
    public static String[] field385 = new String[field363];

    @ObfuscatedName("client.gq")
    public static int[][] field386 = new int[104][104];

    @ObfuscatedName("client.gh")
    public static int field387 = 0;

    @ObfuscatedName("client.go")
    public static int field388 = -1;

    @ObfuscatedName("client.gz")
    public static int field389 = -1;

    @ObfuscatedName("client.gb")
    public static int field335 = 0;

    @ObfuscatedName("client.gf")
    public static int field391 = 0;

    @ObfuscatedName("client.gk")
    public static int field392 = 0;

    @ObfuscatedName("client.gd")
    public static int field466 = 0;

    @ObfuscatedName("client.gx")
    public static int field394 = 0;

    @ObfuscatedName("client.gn")
    public static int field395 = 0;

    @ObfuscatedName("client.gw")
    public static int field396 = 0;

    @ObfuscatedName("client.gp")
    public static int field471 = 0;

    @ObfuscatedName("client.gy")
    public static int field398 = 0;

    @ObfuscatedName("client.gr")
    public static int field399 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field400 = false;

    @ObfuscatedName("client.gc")
    public static int field401 = 0;

    @ObfuscatedName("client.ge")
    public static int field305 = 0;

    @ObfuscatedName("client.gg")
    public static class3[] field510 = new class3[2048];

    @ObfuscatedName("client.gs")
    public static int field404 = -1;

    @ObfuscatedName("client.gi")
    public static int field564 = 0;

    @ObfuscatedName("client.hg")
    public static int field525 = 0;

    @ObfuscatedName("client.hx")
    public static int[] field381 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field408 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field409 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field410 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field382 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static int field412 = -1;

    @ObfuscatedName("client.hu")
    public static class203[][][] field413 = new class203[4][104][104];

    @ObfuscatedName("client.hw")
    public static class203 field414 = new class203();

    @ObfuscatedName("client.hv")
    public static class203 field415 = new class203();

    @ObfuscatedName("client.ha")
    public static class203 field358 = new class203();

    @ObfuscatedName("client.hs")
    public static int[] field417 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field418 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field465 = new int[25];

    @ObfuscatedName("client.hj")
    public static int field509 = 0;

    @ObfuscatedName("client.hk")
    public static boolean field421 = false;

    @ObfuscatedName("client.hi")
    public static int field422 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.hc")
    public static int[] field424 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field371 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field426 = new int[500];

    @ObfuscatedName("client.iw")
    public static String[] field427 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field428 = new String[500];

    @ObfuscatedName("client.ia")
    public static int field429 = -1;

    @ObfuscatedName("client.il")
    public static int field511 = -1;

    @ObfuscatedName("client.iq")
    public static int field431 = 0;

    @ObfuscatedName("client.ir")
    public static int field432 = 50;

    @ObfuscatedName("client.ii")
    public static int field433 = 0;

    @ObfuscatedName("client.it")
    public static String field434 = null;

    @ObfuscatedName("client.ig")
    public static boolean field405 = false;

    @ObfuscatedName("client.ip")
    public static int field483 = -1;

    @ObfuscatedName("client.im")
    public static int field437 = -1;

    @ObfuscatedName("client.io")
    public static String field438 = null;

    @ObfuscatedName("client.iy")
    public static String field439 = null;

    @ObfuscatedName("client.ib")
    public static int field559 = -1;

    @ObfuscatedName("client.if")
    public static class200 field407 = new class200(8);

    @ObfuscatedName("client.is")
    public static int field442 = 0;

    @ObfuscatedName("client.jl")
    public static int field293 = 0;

    @ObfuscatedName("client.jv")
    public static class177 field444 = null;

    @ObfuscatedName("client.ja")
    public static int field445 = 0;

    @ObfuscatedName("client.jh")
    public static int field528 = 0;

    @ObfuscatedName("client.jn")
    public static int field313 = 0;

    @ObfuscatedName("client.jm")
    public static int field448 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field449 = false;

    @ObfuscatedName("client.jp")
    public static boolean field450 = false;

    @ObfuscatedName("client.jq")
    public static boolean field294 = false;

    @ObfuscatedName("client.jr")
    public static class177 field464 = null;

    @ObfuscatedName("client.jb")
    public static class177 field495 = null;

    @ObfuscatedName("client.ju")
    public static class177 field454 = null;

    @ObfuscatedName("client.jx")
    public static int field455 = 0;

    @ObfuscatedName("client.jd")
    public static int field456 = 0;

    @ObfuscatedName("client.jo")
    public static class177 field457 = null;

    @ObfuscatedName("client.jc")
    public static boolean field458 = false;

    @ObfuscatedName("client.jw")
    public static int field311 = -1;

    @ObfuscatedName("client.jy")
    public static int field460 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field461 = false;

    @ObfuscatedName("client.js")
    public static int field299 = -1;

    @ObfuscatedName("client.jk")
    public static int field463 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field549 = false;

    @ObfuscatedName("client.kl")
    public static int field533 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field340 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field544 = 0;

    @ObfuscatedName("client.km")
    public static int[] field468 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field558 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field343 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field459 = 0;

    @ObfuscatedName("client.kn")
    public static int field472 = 0;

    @ObfuscatedName("client.kt")
    public static int field473 = 0;

    @ObfuscatedName("client.kr")
    public static int field535 = 0;

    @ObfuscatedName("client.ks")
    public static int field475 = 0;

    @ObfuscatedName("client.kd")
    public static int field497 = 0;

    @ObfuscatedName("client.ki")
    public static int field477 = 0;

    @ObfuscatedName("client.kb")
    public static int field478 = 0;

    @ObfuscatedName("client.ka")
    public static class203 field479 = new class203();

    @ObfuscatedName("client.kh")
    public static class203 field480 = new class203();

    @ObfuscatedName("client.kv")
    public static class203 field481 = new class203();

    @ObfuscatedName("client.ko")
    public static class200 field482 = new class200(512);

    @ObfuscatedName("client.kg")
    public static int field548 = 0;

    @ObfuscatedName("client.kx")
    public static int field484 = -2;

    @ObfuscatedName("client.kz")
    public static boolean[] field485 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field486 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field487 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field488 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field490 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field474 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field492 = 0;

    @ObfuscatedName("client.lk")
    public static long field493 = 0L;

    @ObfuscatedName("client.lc")
    public static boolean field494 = true;

    @ObfuscatedName("client.ln")
    public static int field334 = 765;

    @ObfuscatedName("client.la")
    public static int field496 = 1;

    @ObfuscatedName("client.lp")
    public static int[] field555 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lv")
    public static int field443 = 0;

    @ObfuscatedName("client.le")
    public static int field323 = 0;

    @ObfuscatedName("client.lz")
    public static String field500 = "";

    @ObfuscatedName("client.li")
    public static long[] field501 = new long[100];

    @ObfuscatedName("client.lx")
    public static int field502 = 0;

    @ObfuscatedName("client.ly")
    public static int field529 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field446 = new int[128];

    @ObfuscatedName("client.me")
    public static int[] field505 = new int[128];

    @ObfuscatedName("client.mj")
    public static long field506 = -1L;

    @ObfuscatedName("client.ms")
    public static String field542 = null;

    @ObfuscatedName("client.mk")
    public static String field508 = null;

    @ObfuscatedName("client.mz")
    public static int field436 = -1;

    @ObfuscatedName("client.mg")
    public static int field288 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field452 = new int[1000];

    @ObfuscatedName("client.mh")
    public static int[] field512 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class82[] field513 = new class82[1000];

    @ObfuscatedName("client.ml")
    public static int field302 = 0;

    @ObfuscatedName("client.mu")
    public static int field515 = 0;

    @ObfuscatedName("client.mw")
    public static int field516 = 0;

    @ObfuscatedName("client.mb")
    public static int field517 = 255;

    @ObfuscatedName("client.mp")
    public static int field518 = -1;

    @ObfuscatedName("client.mq")
    public static boolean field519 = false;

    @ObfuscatedName("client.ni")
    public static int field520 = 127;

    @ObfuscatedName("client.nf")
    public static int field521 = 127;

    @ObfuscatedName("client.nk")
    public static int field522 = 0;

    @ObfuscatedName("client.ny")
    public static int[] field326 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field287 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field435 = new int[50];

    @ObfuscatedName("client.nv")
    public static class62[] field527 = new class62[50];

    @ObfuscatedName("client.na")
    public static boolean field419 = false;

    @ObfuscatedName("client.nu")
    public static boolean[] field530 = new boolean[5];

    @ObfuscatedName("client.os")
    public static int[] field531 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field563 = new int[5];

    @ObfuscatedName("client.ou")
    public static int[] field504 = new int[5];

    @ObfuscatedName("client.ow")
    public static int[] field534 = new int[5];

    @ObfuscatedName("client.oo")
    public static short field499 = 256;

    @ObfuscatedName("client.oh")
    public static short field332 = 205;

    @ObfuscatedName("client.oi")
    public static short field393 = 256;

    @ObfuscatedName("client.oa")
    public static short field538 = 320;

    @ObfuscatedName("client.ov")
    public static short field539 = 1;

    @ObfuscatedName("client.om")
    public static short field540 = 32767;

    @ObfuscatedName("client.ot")
    public static short field541 = 1;

    @ObfuscatedName("client.op")
    public static short field285 = 32767;

    @ObfuscatedName("client.og")
    public static int field543 = 0;

    @ObfuscatedName("client.od")
    public static int field348 = 0;

    @ObfuscatedName("client.oj")
    public static int field545 = 0;

    @ObfuscatedName("client.oq")
    public static int field339 = 0;

    @ObfuscatedName("client.ox")
    public static int field547 = 0;

    @ObfuscatedName("client.oe")
    public static int field532 = 0;

    @ObfuscatedName("client.ok")
    public static int field503 = 0;

    @ObfuscatedName("client.oz")
    public static class18[] field550 = new class18[400];

    @ObfuscatedName("client.ob")
    public static class199 field551 = new class199();

    @ObfuscatedName("client.or")
    public static int field552 = 0;

    @ObfuscatedName("client.oc")
    public static class8[] field553 = new class8[400];

    @ObfuscatedName("client.ol")
    public static class183 field554 = new class183();

    @ObfuscatedName("client.pr")
    public static int field546 = -1;

    @ObfuscatedName("client.pu")
    public static int field498 = -1;

    @ObfuscatedName("client.pb")
    public static class224[] field557 = new class224[8];

    @ObfuscatedName("client.pv")
    public static long field470 = -1L;

    @ObfuscatedName("client.pk")
    public static long field377 = -1L;

    @ObfuscatedName("client.pt")
    public static final class11 field281 = new class11();

    @ObfuscatedName("client.pj")
    public static int[] field507 = new int[50];

    @ObfuscatedName("client.pl")
    public static int[] field562 = new int[50];

    @ObfuscatedName("client.j(I)V")
    public final void method238() {
    }

    public final void init() {
        if (!this.method2901()) {
            return;
        }
        class194[] var1 = class194.method3703();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class194 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3111);
            if (var4 != null) {
                int var5;
                class157[] var6;
                int var7;
                switch(Integer.parseInt(var3.field3111)) {
                    case 1:
                        Statics.field279 = var4;
                        continue;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field16)) {
                            field286 = true;
                        } else {
                            field286 = false;
                        }
                        continue;
                    case 3:
                        field282 = Integer.parseInt(var4);
                    case 4:
                    case 5:
                    case 13:
                    default:
                        continue;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field16)) {
                        }
                        continue;
                    case 7:
                        Statics.field1068 = Integer.parseInt(var4);
                        continue;
                    case 8:
                        field561 = Integer.parseInt(var4);
                        continue;
                    case 9:
                        Statics.field1939 = Integer.parseInt(var4);
                        continue;
                    case 10:
                        Statics.field879 = var4;
                        continue;
                    case 11:
                        field284 = Integer.parseInt(var4);
                        continue;
                    case 12:
                        class158[] var10 = new class158[] { class158.field2339, class158.field2337, class158.field2342, class158.field2343, class158.field2338, class158.field2336 };
                        Statics.field776 = (class158) class113.method99(var10, Integer.parseInt(var4));
                        if (Statics.field776 == class158.field2339) {
                            Statics.field2088 = class216.field3196;
                        } else {
                            Statics.field2088 = class216.field3199;
                        }
                        continue;
                    case 14:
                        field283 = Integer.parseInt(var4);
                        continue;
                    case 15:
                        var5 = Integer.parseInt(var4);
                        var6 = class157.method3202();
                        var7 = 0;
                }
                class157 var9;
                while (true) {
                    if (var7 >= var6.length) {
                        var9 = null;
                        break;
                    }
                    class157 var8 = var6[var7];
                    if (var8.field2327 == var5) {
                        var9 = var8;
                        break;
                    }
                    var7++;
                }
                Statics.field773 = var9;
            }
        }
        method118();
        Statics.field1244 = this.getCodeBase().getHost();
        String var11 = Statics.field773.field2324;
        byte var12 = 0;
        try {
            Statics.field2282 = 16;
            Statics.field1827 = var12;
            try {
                Statics.field24 = System.getProperty("os.name");
            } catch (Exception var64) {
                Statics.field24 = "Unknown";
            }
            Statics.field1834 = Statics.field24.toLowerCase();
            try {
                Statics.field621 = System.getProperty("user.home");
                if (Statics.field621 != null) {
                    Statics.field621 = Statics.field621 + "/";
                }
            } catch (Exception var63) {
            }
            try {
                if (Statics.field1834.startsWith("win")) {
                    if (Statics.field621 == null) {
                        Statics.field621 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field621 == null) {
                    Statics.field621 = System.getenv("HOME");
                }
                if (Statics.field621 != null) {
                    Statics.field621 = Statics.field621 + "/";
                }
            } catch (Exception var62) {
            }
            if (Statics.field621 == null) {
                Statics.field621 = "~/";
            }
            Statics.field2290 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field621, "/tmp/", "" };
            Statics.field2284 = new String[] { ".jagex_cache_" + Statics.field1827, ".file_store_" + Statics.field1827 };
            int var16 = 0;
            label301: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field156 = new File(Statics.field621, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field156.exists()) {
                    try {
                        class231 var21 = new class231(Statics.field156, "rw", 10000L);
                        class123 var22 = new class123((int) var21.method3881());
                        while (var22.field2057 < var22.field2056.length) {
                            int var23 = var21.method3898(var22.field2056, var22.field2057, var22.field2056.length - var22.field2057);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2057 += var23;
                        }
                        var22.field2057 = 0;
                        int var24 = var22.method2408();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2408();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2487();
                            if (var25 == 1) {
                                var19 = var22.method2487();
                            }
                        } else {
                            var18 = var22.method2407();
                            if (var25 == 1) {
                                var19 = var22.method2407();
                            }
                        }
                        var21.method3880();
                    } catch (IOException var67) {
                        var67.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class153.method2339(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label275: for (int var29 = 0; var29 < Statics.field2284.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field2290.length; var30++) {
                            File var31 = new File(Statics.field2290[var30] + Statics.field2284[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class153.method2339(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label275;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field621 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var66) {
                        var66.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    File var41 = new File(var18);
                    Object var42 = null;
                    try {
                        class231 var43 = new class231(Statics.field156, "rw", 10000L);
                        class123 var44 = new class123(500);
                        var44.method2567(3);
                        var44.method2567(var42 == null ? 0 : 1);
                        var44.method2590(var41.getPath());
                        if (var42 != null) {
                            var44.method2590(((File) var42).getPath());
                        }
                        var43.method3879(var44.field2056, 0, var44.field2057);
                        var43.method3880();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                }
                File var46 = new File(var18);
                Statics.field3108 = var46;
                if (!Statics.field3108.exists()) {
                    Statics.field3108.mkdirs();
                }
                File[] var47 = Statics.field3108.listFiles();
                if (var47 != null) {
                    File[] var48 = var47;
                    for (int var49 = 0; var49 < var48.length; var49++) {
                        File var50 = var48[var49];
                        if (!class153.method2339(var50, false)) {
                            var16++;
                            continue label301;
                        }
                    }
                }
                break;
            }
            File var51 = Statics.field3108;
            Statics.field2130 = var51;
            if (!Statics.field2130.exists()) {
                throw new RuntimeException("");
            }
            class139.field2132 = true;
            try {
                File var52 = new File(Statics.field621, "random.dat");
                if (var52.exists()) {
                    class153.field2287 = new class232(new class231(var52, "rw", 25L), 24, 0);
                } else {
                    label224: for (int var53 = 0; var53 < Statics.field2284.length; var53++) {
                        for (int var54 = 0; var54 < Statics.field2290.length; var54++) {
                            File var55 = new File(Statics.field2290[var54] + Statics.field2284[var53] + File.separatorChar + "random.dat");
                            if (var55.exists()) {
                                class153.field2287 = new class232(new class231(var55, "rw", 25L), 24, 0);
                                break label224;
                            }
                        }
                    }
                }
                if (class153.field2287 == null) {
                    RandomAccessFile var56 = new RandomAccessFile(var52, "rw");
                    int var57 = var56.read();
                    var56.seek(0L);
                    var56.write(var57);
                    var56.seek(0L);
                    var56.close();
                    class153.field2287 = new class232(new class231(var52, "rw", 25L), 24, 0);
                }
            } catch (IOException var65) {
            }
            class153.field2289 = new class232(new class231(class139.method2112("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class153.field2288 = new class232(new class231(class139.method2112("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field791 = new class232[Statics.field2282];
            for (int var59 = 0; var59 < Statics.field2282; var59++) {
                Statics.field791[var59] = new class232(new class231(class139.method2112("main_file_cache.idx" + var59), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var68) {
            class152.method2217((String) null, var68);
        }
        Statics.field378 = this;
        this.method2899(765, 503, 121);
    }

    @ObfuscatedName("f.i(I)V")
    public static final void method118() {
        class90.field1563 = false;
        field315 = false;
    }

    @ObfuscatedName("client.b(I)V")
    public final void method364() {
        Statics.field921 = field561 == 0 ? 43594 : field283 + 40000;
        Statics.field208 = field561 == 0 ? 443 : field283 + 50000;
        Statics.field318 = Statics.field921;
        Statics.field2976 = class178.field2947;
        Statics.field625 = class178.field2948;
        Statics.field2713 = class178.field2949;
        Statics.field186 = class178.field2951;
        class141.method3254();
        Canvas var1 = Statics.field2094;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class141.field2170);
        var1.addFocusListener(class141.field2170);
        class144.method181(Statics.field2094);
        class149 var2;
        try {
            var2 = new class149();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field92 = var2;
        if (Statics.field92 != null) {
            Statics.field92.method2733(Statics.field2094);
        }
        Statics.field1502 = new class138(255, class153.field2289, class153.field2288, 500000);
        class231 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class153.method2099("", Statics.field776.field2340, false);
            byte[] var6 = new byte[(int) var4.method3881()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3898(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class123(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method3880();
            }
        } catch (Exception var12) {
        }
        Statics.field2660 = var5;
        Statics.field1217 = this.getToolkit().getSystemClipboard();
        class142.method868(this, Statics.field2231);
        if (field561 != 0) {
            field297 = true;
        }
        method160(Statics.field2660.field134);
    }

    @ObfuscatedName("client.l(I)V")
    public final void method242() {
        field291++;
        this.method245();
        class174.method647();
        try {
            if (class187.field3010 == 1) {
                int var1 = Statics.field3009.method3400();
                if (var1 > 0 && Statics.field3009.method3406()) {
                    int var2 = var1 - Statics.field786;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field3009.method3399(var2);
                } else {
                    Statics.field3009.method3444();
                    Statics.field3009.method3403();
                    if (Statics.field3011 == null) {
                        class187.field3010 = 0;
                    } else {
                        class187.field3010 = 2;
                    }
                    Statics.field3018 = null;
                    Statics.field3007 = null;
                }
            }
        } catch (Exception var544) {
            var544.printStackTrace();
            Statics.field3009.method3444();
            class187.field3010 = 0;
            Statics.field3018 = null;
            Statics.field3007 = null;
            Statics.field3011 = null;
        }
        method2004();
        class141.method652();
        class144.method3723();
        if (Statics.field92 != null) {
            int var4 = Statics.field92.method2735();
            field478 = var4;
        }
        if (field289 == 0) {
            method1024();
            class148.method939();
        } else if (field289 == 5) {
            class34.method1145(this);
            method1024();
            class148.method939();
        } else if (field289 == 10 || field289 == 11) {
            class34.method1145(this);
        } else if (field289 == 20) {
            class34.method1145(this);
            method2696();
        } else if (field289 == 25) {
            method161(false);
            field336 = 0;
            boolean var5 = true;
            for (int var6 = 0; var6 < Statics.field588.length; var6++) {
                if (Statics.field2735[var6] != -1 && Statics.field588[var6] == null) {
                    Statics.field588[var6] = Statics.field2166.method3079(Statics.field2735[var6], 0);
                    if (Statics.field588[var6] == null) {
                        var5 = false;
                        field336++;
                    }
                }
                if (Statics.field1506[var6] != -1 && Statics.field127[var6] == null) {
                    Statics.field127[var6] = Statics.field2166.method3080(Statics.field1506[var6], 0, Statics.field3106[var6]);
                    if (Statics.field127[var6] == null) {
                        var5 = false;
                        field336++;
                    }
                }
            }
            if (var5) {
                field338 = 0;
                boolean var7 = true;
                for (int var8 = 0; var8 < Statics.field588.length; var8++) {
                    byte[] var9 = Statics.field127[var8];
                    if (var9 != null) {
                        int var10 = (Statics.field2800[var8] >> 8) * 64 - Statics.field676;
                        int var11 = (Statics.field2800[var8] & 0xFF) * 64 - Statics.field2366;
                        if (field342) {
                            var10 = 10;
                            var11 = 10;
                        }
                        var7 &= class6.method705(var9, var10, var11);
                    }
                }
                if (var7) {
                    if (field406 != 0) {
                        method910(class161.field2382 + class2.field25 + class2.field19 + 100 + "%" + class2.field20, true);
                    }
                    method2004();
                    method221();
                    method2004();
                    Statics.field123.method1825();
                    method2004();
                    System.gc();
                    for (int var12 = 0; var12 < 4; var12++) {
                        field341[var12].method2298();
                    }
                    for (int var13 = 0; var13 < 4; var13++) {
                        for (int var14 = 0; var14 < 104; var14++) {
                            for (int var15 = 0; var15 < 104; var15++) {
                                class6.field72[var13][var14][var15] = 0;
                            }
                        }
                    }
                    method2004();
                    class6.method566();
                    int var16 = Statics.field588.length;
                    for (class25 var17 = (class25) class25.field605.method3600(); var17 != null; var17 = (class25) class25.field605.method3602()) {
                        if (var17.field611 != null) {
                            Statics.field206.method1149(var17.field611);
                            var17.field611 = null;
                        }
                        if (var17.field616 != null) {
                            Statics.field206.method1149(var17.field616);
                            var17.field616 = null;
                        }
                    }
                    class25.field605.method3605();
                    method161(true);
                    if (!field342) {
                        int var18 = 0;
                        label3229: while (true) {
                            if (var18 >= var16) {
                                for (int var32 = 0; var32 < var16; var32++) {
                                    int var33 = (Statics.field2800[var32] >> 8) * 64 - Statics.field676;
                                    int var34 = (Statics.field2800[var32] & 0xFF) * 64 - Statics.field2366;
                                    byte[] var35 = Statics.field588[var32];
                                    if (var35 == null && Statics.field3085 < 800) {
                                        method2004();
                                        class6.method2203(var33, var34, 64, 64);
                                    }
                                }
                                method161(true);
                                int var36 = 0;
                                while (true) {
                                    if (var36 >= var16) {
                                        break label3229;
                                    }
                                    byte[] var37 = Statics.field127[var36];
                                    if (var37 != null) {
                                        int var38 = (Statics.field2800[var36] >> 8) * 64 - Statics.field676;
                                        int var39 = (Statics.field2800[var36] & 0xFF) * 64 - Statics.field2366;
                                        method2004();
                                        class90 var40 = Statics.field123;
                                        class112[] var41 = field341;
                                        class123 var42 = new class123(var37);
                                        int var43 = -1;
                                        while (true) {
                                            int var44 = var42.method2421();
                                            if (var44 == 0) {
                                                break;
                                            }
                                            var43 += var44;
                                            int var45 = 0;
                                            while (true) {
                                                int var46 = var42.method2421();
                                                if (var46 == 0) {
                                                    break;
                                                }
                                                var45 += var46 - 1;
                                                int var47 = var45 & 0x3F;
                                                int var48 = var45 >> 6 & 0x3F;
                                                int var49 = var45 >> 12;
                                                int var50 = var42.method2408();
                                                int var51 = var50 >> 2;
                                                int var52 = var50 & 0x3;
                                                int var53 = var38 + var48;
                                                int var54 = var39 + var47;
                                                if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                                    int var55 = var49;
                                                    if ((class6.field72[1][var53][var54] & 0x2) == 2) {
                                                        var55 = var49 - 1;
                                                    }
                                                    class112 var56 = null;
                                                    if (var55 >= 0) {
                                                        var56 = var41[var55];
                                                    }
                                                    class6.method2975(var49, var53, var54, var43, var52, var51, var40, var56);
                                                }
                                            }
                                        }
                                    }
                                    var36++;
                                }
                            }
                            int var19 = (Statics.field2800[var18] >> 8) * 64 - Statics.field676;
                            int var20 = (Statics.field2800[var18] & 0xFF) * 64 - Statics.field2366;
                            byte[] var21 = Statics.field588[var18];
                            if (var21 != null) {
                                method2004();
                                int var22 = Statics.field1790 * 8 - 48;
                                int var23 = Statics.field3085 * 8 - 48;
                                class112[] var24 = field341;
                                int var25 = 0;
                                label3226: while (true) {
                                    if (var25 >= 4) {
                                        class123 var28 = new class123(var21);
                                        int var29 = 0;
                                        while (true) {
                                            if (var29 >= 4) {
                                                break label3226;
                                            }
                                            for (int var30 = 0; var30 < 64; var30++) {
                                                for (int var31 = 0; var31 < 64; var31++) {
                                                    class6.method184(var28, var29, var19 + var30, var20 + var31, var22, var23, 0);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                    for (int var26 = 0; var26 < 64; var26++) {
                                        for (int var27 = 0; var27 < 64; var27++) {
                                            if (var19 + var26 > 0 && var19 + var26 < 103 && var20 + var27 > 0 && var20 + var27 < 103) {
                                                var24[var25].field1964[var19 + var26][var20 + var27] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var25++;
                                }
                            }
                            var18++;
                        }
                    }
                    if (field342) {
                        int var57 = 0;
                        label3162: while (true) {
                            if (var57 >= 4) {
                                for (int var68 = 0; var68 < 13; var68++) {
                                    for (int var69 = 0; var69 < 13; var69++) {
                                        int var70 = field390[0][var68][var69];
                                        if (var70 == -1) {
                                            class6.method2203(var68 * 8, var69 * 8, 8, 8);
                                        }
                                    }
                                }
                                method161(true);
                                int var71 = 0;
                                while (true) {
                                    if (var71 >= 4) {
                                        break label3162;
                                    }
                                    method2004();
                                    for (int var72 = 0; var72 < 13; var72++) {
                                        for (int var73 = 0; var73 < 13; var73++) {
                                            int var74 = field390[var71][var72][var73];
                                            if (var74 != -1) {
                                                int var75 = var74 >> 24 & 0x3;
                                                int var76 = var74 >> 1 & 0x3;
                                                int var77 = var74 >> 14 & 0x3FF;
                                                int var78 = var74 >> 3 & 0x7FF;
                                                int var79 = (var77 / 8 << 8) + var78 / 8;
                                                for (int var80 = 0; var80 < Statics.field2800.length; var80++) {
                                                    if (Statics.field2800[var80] == var79 && Statics.field127[var80] != null) {
                                                        class6.method2764(Statics.field127[var80], var71, var72 * 8, var73 * 8, var75, (var77 & 0x7) * 8, (var78 & 0x7) * 8, var76, Statics.field123, field341);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var71++;
                                }
                            }
                            method2004();
                            for (int var58 = 0; var58 < 13; var58++) {
                                for (int var59 = 0; var59 < 13; var59++) {
                                    boolean var60 = false;
                                    int var61 = field390[var57][var58][var59];
                                    if (var61 != -1) {
                                        int var62 = var61 >> 24 & 0x3;
                                        int var63 = var61 >> 1 & 0x3;
                                        int var64 = var61 >> 14 & 0x3FF;
                                        int var65 = var61 >> 3 & 0x7FF;
                                        int var66 = (var64 / 8 << 8) + var65 / 8;
                                        for (int var67 = 0; var67 < Statics.field2800.length; var67++) {
                                            if (Statics.field2800[var67] == var66 && Statics.field588[var67] != null) {
                                                class6.method2991(Statics.field588[var67], var57, var58 * 8, var59 * 8, var62, (var64 & 0x7) * 8, (var65 & 0x7) * 8, var63, field341);
                                                var60 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var60) {
                                        Statics.method2003(var57, var58 * 8, var59 * 8);
                                    }
                                }
                            }
                            var57++;
                        }
                    }
                    method161(true);
                    method221();
                    method2004();
                    class6.method2336(Statics.field123, field341);
                    method161(true);
                    int var81 = class6.field74;
                    if (var81 > Statics.field1819) {
                        var81 = Statics.field1819;
                    }
                    if (var81 < Statics.field1819 - 1) {
                        int var82 = Statics.field1819 - 1;
                    }
                    if (field315) {
                        Statics.field123.method1826(class6.field74);
                    } else {
                        Statics.field123.method1826(0);
                    }
                    for (int var83 = 0; var83 < 104; var83++) {
                        for (int var84 = 0; var84 < 104; var84++) {
                            method2343(var83, var84);
                        }
                    }
                    method2004();
                    for (class17 var85 = (class17) field414.method3600(); var85 != null; var85 = (class17) field414.method3602()) {
                        if (var85.field242 == -1) {
                            var85.field241 = 0;
                            method728(var85);
                        } else {
                            var85.method3695();
                        }
                    }
                    class43.field927.method3534();
                    if (Statics.field1497 != null) {
                        field324.method2670(74);
                        field324.method2396(1057001181);
                    }
                    if (!field342) {
                        int var86 = (Statics.field1790 - 6) / 8;
                        int var87 = (Statics.field1790 + 6) / 8;
                        int var88 = (Statics.field3085 - 6) / 8;
                        int var89 = (Statics.field3085 + 6) / 8;
                        for (int var90 = var86 - 1; var90 <= var87 + 1; var90++) {
                            for (int var91 = var88 - 1; var91 <= var89 + 1; var91++) {
                                if (var90 < var86 || var90 > var87 || var91 < var88 || var91 > var89) {
                                    Statics.field2166.method3098("m" + var90 + "_" + var91);
                                    Statics.field2166.method3098("l" + var90 + "_" + var91);
                                }
                            }
                        }
                    }
                    method2720(30);
                    method2004();
                    Statics.field86 = (byte[][][]) null;
                    Statics.field1922 = (byte[][][]) null;
                    Statics.field76 = (byte[][][]) null;
                    Statics.field77 = (byte[][][]) null;
                    Statics.field3215 = (int[][][]) null;
                    Statics.field2105 = (byte[][][]) null;
                    Statics.field75 = (int[][]) null;
                    Statics.field258 = null;
                    Statics.field79 = null;
                    Statics.field80 = null;
                    Statics.field2767 = null;
                    Statics.field185 = null;
                    field324.method2670(131);
                    class148.method939();
                } else {
                    field406 = 2;
                }
            } else {
                field406 = 1;
            }
        }
        if (field289 == 30) {
            if (field298 > 1) {
                field298--;
            }
            if (field441 > 0) {
                field441--;
            }
            if (field349) {
                field349 = false;
                if (field441 > 0) {
                    method2872();
                } else {
                    method2720(40);
                    Statics.field1260 = Statics.field695;
                    Statics.field695 = null;
                }
            } else {
                if (!field421) {
                    field427[0] = class161.field2609;
                    field428[0] = "";
                    field371[0] = 1006;
                    field422 = 1;
                }
                for (int var92 = 0; var92 < 100; var92++) {
                    boolean var93;
                    if (Statics.field695 == null) {
                        var93 = false;
                    } else {
                        label3465: {
                            try {
                                int var94 = Statics.field695.method2878();
                                if (var94 == 0) {
                                    var93 = false;
                                    break label3465;
                                }
                                if (field328 == -1) {
                                    Statics.field695.method2879(field447.field2056, 0, 1);
                                    field447.field2057 = 0;
                                    field328 = field447.method2671();
                                    field327 = class192.field3099[field328];
                                    var94--;
                                }
                                if (field327 == -1) {
                                    if (var94 <= 0) {
                                        var93 = false;
                                        break label3465;
                                    }
                                    Statics.field695.method2879(field447.field2056, 0, 1);
                                    field327 = field447.field2056[0] & 0xFF;
                                    var94--;
                                }
                                if (field327 == -2) {
                                    if (var94 <= 1) {
                                        var93 = false;
                                        break label3465;
                                    }
                                    Statics.field695.method2879(field447.field2056, 0, 2);
                                    field447.field2057 = 0;
                                    field327 = field447.method2403();
                                    var94 -= 2;
                                }
                                if (var94 < field327) {
                                    var93 = false;
                                    break label3465;
                                }
                                field447.field2057 = 0;
                                Statics.field695.method2879(field447.field2056, 0, field327);
                                field329 = 0;
                                field333 = field397;
                                field397 = field331;
                                field331 = field328;
                                if (field328 == 40) {
                                    field419 = false;
                                    for (int var95 = 0; var95 < 5; var95++) {
                                        field530[var95] = false;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 206) {
                                    int var96 = field447.method2444();
                                    int var97 = field447.method2453();
                                    class177 var98 = class177.method621(var97);
                                    if (var98.field2911 != 2 || var98.field2855 != var96) {
                                        var98.field2911 = 2;
                                        var98.field2855 = var96;
                                        method1515(var98);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 172) {
                                    int var99 = field447.method2445();
                                    byte var100 = field447.method2409();
                                    class180.field2959[var99] = var100;
                                    if (class180.field2960[var99] != var100) {
                                        class180.field2960[var99] = var100;
                                    }
                                    method3250(var99);
                                    field340[++field544 - 1 & 0x1F] = var99;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 72) {
                                    int var101 = field447.method2403();
                                    int var102 = field447.method2408();
                                    int var103 = field447.method2403();
                                    method123(var101, var102, var103);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 151) {
                                    method152(true);
                                    field447.method2671();
                                    int var104 = field447.method2403();
                                    class35.method163(field447, var104);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 134) {
                                    method2872();
                                    field328 = -1;
                                    var93 = false;
                                    break label3465;
                                }
                                if (field328 == 118) {
                                    field298 = field447.method2443() * 30;
                                    field477 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 63) {
                                    String var105 = field447.method2626();
                                    int var106 = field447.method2403();
                                    byte var107 = field447.method2409();
                                    boolean var108 = false;
                                    if (var107 == -128) {
                                        var108 = true;
                                    }
                                    if (var108) {
                                        if (Statics.field26 == 0) {
                                            field328 = -1;
                                            var93 = true;
                                            break label3465;
                                        }
                                        boolean var109 = false;
                                        int var110;
                                        for (var110 = 0; var110 < Statics.field26 && (!Statics.field200[var110].field626.equals(var105) || Statics.field200[var110].field623 != var106); var110++) {
                                        }
                                        if (var110 < Statics.field26) {
                                            while (var110 < Statics.field26 - 1) {
                                                Statics.field200[var110] = Statics.field200[var110 + 1];
                                                var110++;
                                            }
                                            Statics.field26--;
                                            Statics.field200[Statics.field26] = null;
                                        }
                                    } else {
                                        field447.method2626();
                                        class26 var111 = new class26();
                                        var111.field626 = var105;
                                        var111.field629 = class168.method120(var111.field626, Statics.field2088);
                                        var111.field623 = var106;
                                        var111.field624 = var107;
                                        int var112;
                                        for (var112 = Statics.field26 - 1; var112 >= 0; var112--) {
                                            int var113 = Statics.field200[var112].field629.compareTo(var111.field629);
                                            if (var113 == 0) {
                                                Statics.field200[var112].field623 = var106;
                                                Statics.field200[var112].field624 = var107;
                                                if (var105.equals(Statics.field1067.field28)) {
                                                    Statics.field637 = var107;
                                                }
                                                field535 = field533;
                                                field328 = -1;
                                                var93 = true;
                                                break label3465;
                                            }
                                            if (var113 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field26 >= Statics.field200.length) {
                                            field328 = -1;
                                            var93 = true;
                                            break label3465;
                                        }
                                        for (int var114 = Statics.field26 - 1; var114 > var112; var114--) {
                                            Statics.field200[var114 + 1] = Statics.field200[var114];
                                        }
                                        if (Statics.field26 == 0) {
                                            Statics.field200 = new class26[100];
                                        }
                                        Statics.field200[var112 + 1] = var111;
                                        Statics.field26++;
                                        if (var105.equals(Statics.field1067.field28)) {
                                            Statics.field637 = var107;
                                        }
                                    }
                                    field535 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 36) {
                                    while (field447.field2057 < field327) {
                                        int var115 = field447.method2408();
                                        boolean var116 = (var115 & 0x1) == 1;
                                        String var117 = field447.method2626();
                                        String var118 = field447.method2626();
                                        field447.method2626();
                                        for (int var119 = 0; var119 < field552; var119++) {
                                            class8 var120 = field553[var119];
                                            if (var116) {
                                                if (var118.equals(var120.field129)) {
                                                    var120.field129 = var117;
                                                    var120.field128 = var118;
                                                    var117 = null;
                                                    break;
                                                }
                                            } else if (var117.equals(var120.field129)) {
                                                var120.field129 = var117;
                                                var120.field128 = var118;
                                                var117 = null;
                                                break;
                                            }
                                        }
                                        if (var117 != null && field552 < 400) {
                                            class8 var121 = new class8();
                                            field553[field552] = var121;
                                            var121.field129 = var117;
                                            var121.field128 = var118;
                                            field552++;
                                        }
                                    }
                                    field473 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 6) {
                                    if (field559 != -1) {
                                        int var122 = field559;
                                        if (class177.method3201(var122)) {
                                            method1028(Statics.field2905[var122], 0);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 113 || field328 == 225 || field328 == 95 || field328 == 152 || field328 == 250 || field328 == 109 || field328 == 82 || field328 == 168 || field328 == 42 || field328 == 142) {
                                    method2715();
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 170) {
                                    class35.field761 = 0;
                                    for (int var123 = 0; var123 < 2048; var123++) {
                                        class35.field760[var123] = null;
                                        class35.field759[var123] = 1;
                                    }
                                    for (int var124 = 0; var124 < 2048; var124++) {
                                        field510[var124] = null;
                                    }
                                    class35.method2111(field447);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 86) {
                                    int var125 = field327 + field447.field2057;
                                    int var126 = field447.method2403();
                                    int var127 = field447.method2403();
                                    if (field559 != var126) {
                                        field559 = var126;
                                        int var128 = field559;
                                        int var129 = Statics.field1500;
                                        int var130 = Statics.field3176;
                                        if (class177.method3201(var128)) {
                                            method346(Statics.field2905[var128], -1, var129, var130, false);
                                        }
                                        Statics.method2756(field559);
                                        class39.method710(field559);
                                        for (int var131 = 0; var131 < 100; var131++) {
                                            field485[var131] = true;
                                        }
                                    }
                                    while (var127-- > 0) {
                                        int var132 = field447.method2413();
                                        int var133 = field447.method2403();
                                        int var134 = field447.method2408();
                                        class4 var135 = (class4) field407.method3580((long) var132);
                                        if (var135 != null && var135.field55 != var133) {
                                            method1282(var135, true);
                                            var135 = null;
                                        }
                                        if (var135 == null) {
                                            class4 var136 = new class4();
                                            var136.field55 = var133;
                                            var136.field54 = var134;
                                            field407.method3569(var136, (long) var132);
                                            Statics.method2756(var133);
                                            class177 var137 = class177.method621(var132);
                                            method1515(var137);
                                            if (field444 != null) {
                                                method1515(field444);
                                                field444 = null;
                                            }
                                            method940();
                                            method547(Statics.field2905[var132 >> 16], var137, false);
                                            class39.method710(var133);
                                            if (field559 != -1) {
                                                int var138 = field559;
                                                if (class177.method3201(var138)) {
                                                    method1028(Statics.field2905[var138], 1);
                                                }
                                            }
                                            var135 = var136;
                                        }
                                        var135.field58 = true;
                                    }
                                    for (class4 var140 = (class4) field407.method3571(); var140 != null; var140 = (class4) field407.method3572()) {
                                        if (var140.field58) {
                                            var140.field58 = false;
                                        } else {
                                            method1282(var140, true);
                                        }
                                    }
                                    field482 = new class200(512);
                                    while (field447.field2057 < var125) {
                                        int var141 = field447.method2413();
                                        int var142 = field447.method2403();
                                        int var143 = field447.method2403();
                                        int var144 = field447.method2413();
                                        for (int var145 = var142; var145 <= var143; var145++) {
                                            long var146 = ((long) var141 << 32) + (long) var145;
                                            field482.method3569(new class205(var144), var146);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 77) {
                                    int var148 = field447.method2453();
                                    int var149 = field447.method2403();
                                    class177 var150 = class177.method621(var148);
                                    if (var150.field2911 != 1 || var150.field2855 != var149) {
                                        var150.field2911 = 1;
                                        var150.field2855 = var149;
                                        method1515(var150);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 195) {
                                    int var151 = field447.method2408();
                                    int var152 = field447.method2408();
                                    int var153 = field447.method2408();
                                    int var154 = field447.method2408();
                                    field530[var151] = true;
                                    field531[var151] = var152;
                                    field563[var151] = var153;
                                    field504[var151] = var154;
                                    field534[var151] = 0;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 117) {
                                    int var155 = field447.method2453();
                                    class177 var156 = class177.method621(var155);
                                    for (int var157 = 0; var157 < var156.field2803.length; var157++) {
                                        var156.field2803[var157] = -1;
                                        var156.field2803[var157] = 0;
                                    }
                                    method1515(var156);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 185) {
                                    int var158 = field447.method2444();
                                    if (var158 == 65535) {
                                        var158 = -1;
                                    }
                                    int var159 = field447.method2413();
                                    int var160 = field447.method2443();
                                    if (var160 == 65535) {
                                        var160 = -1;
                                    }
                                    int var161 = field447.method2413();
                                    for (int var162 = var158; var162 <= var160; var162++) {
                                        long var163 = ((long) var161 << 32) + (long) var162;
                                        class212 var165 = field482.method3580(var163);
                                        if (var165 != null) {
                                            var165.method3695();
                                        }
                                        field482.method3569(new class205(var159), var163);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 164) {
                                    field503 = 1;
                                    field473 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 209) {
                                    Statics.field1970 = field447.method2435();
                                    Statics.field197 = field447.method2435();
                                    while (field447.field2057 < field327) {
                                        field328 = field447.method2408();
                                        method2715();
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 194) {
                                    boolean var166 = field447.method2408() == 1;
                                    if (var166) {
                                        Statics.field1138 = class119.method698() - field447.method2414();
                                        Statics.field56 = new class225(field447, true);
                                    } else {
                                        Statics.field56 = null;
                                    }
                                    field497 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 149) {
                                    field302 = field447.method2408();
                                    if (field302 == 255) {
                                        field302 = 0;
                                    }
                                    field515 = field447.method2408();
                                    if (field515 == 255) {
                                        field515 = 0;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 240) {
                                    int var167 = field447.method2444();
                                    Statics.method46(var167);
                                    field468[++field558 - 1 & 0x1F] = var167 & 0x7FFF;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 43) {
                                    method152(false);
                                    field447.method2671();
                                    int var168 = field447.method2403();
                                    class35.method163(field447, var168);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 144) {
                                    field447.field2057 += 28;
                                    if (field447.method2431()) {
                                        class126 var169 = field447;
                                        int var170 = field447.field2057 - 28;
                                        if (class153.field2287 != null) {
                                            try {
                                                class153.field2287.method3903(0L);
                                                class153.field2287.method3901(var169.field2056, var170, 24);
                                            } catch (Exception var533) {
                                            }
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 7) {
                                    int var172 = field447.method2408();
                                    String var173 = field447.method2626();
                                    int var174 = field447.method2604();
                                    if (var174 >= 1 && var174 <= 8) {
                                        if (var173.equalsIgnoreCase("null")) {
                                            var173 = null;
                                        }
                                        field409[var174 - 1] = var173;
                                        field410[var174 - 1] = var172 == 0;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 100) {
                                    field526 = field447.method2408();
                                    if (field526 == 1) {
                                        field300 = field447.method2403();
                                    }
                                    if (field526 >= 2 && field526 <= 6) {
                                        if (field526 == 2) {
                                            field356 = 64;
                                            field306 = 64;
                                        }
                                        if (field526 == 3) {
                                            field356 = 0;
                                            field306 = 64;
                                        }
                                        if (field526 == 4) {
                                            field356 = 128;
                                            field306 = 64;
                                        }
                                        if (field526 == 5) {
                                            field356 = 64;
                                            field306 = 0;
                                        }
                                        if (field526 == 6) {
                                            field356 = 64;
                                            field306 = 128;
                                        }
                                        field526 = 2;
                                        field420 = field447.method2403();
                                        field303 = field447.method2403();
                                        field304 = field447.method2408();
                                    }
                                    if (field526 == 10) {
                                        field301 = field447.method2403();
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 65) {
                                    for (int var175 = 0; var175 < field510.length; var175++) {
                                        if (field510[var175] != null) {
                                            field510[var175].field850 = -1;
                                        }
                                    }
                                    for (int var176 = 0; var176 < field319.length; var176++) {
                                        if (field319[var176] != null) {
                                            field319[var176].field850 = -1;
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 20) {
                                    int var177 = field447.method2413();
                                    class4 var178 = (class4) field407.method3580((long) var177);
                                    if (var178 != null) {
                                        method1282(var178, true);
                                    }
                                    if (field444 != null) {
                                        method1515(field444);
                                        field444 = null;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 221) {
                                    String var179 = field447.method2626();
                                    class126 var180 = field447;
                                    String var184;
                                    try {
                                        int var181 = var180.method2421();
                                        if (var181 > 32767) {
                                            var181 = 32767;
                                        }
                                        byte[] var182 = new byte[var181];
                                        var180.field2057 += Statics.field3233.method2347(var180.field2056, var180.field2057, var182, 0, var181);
                                        String var183 = class169.method162(var182, 0, var181);
                                        var184 = var183;
                                    } catch (Exception var532) {
                                        var184 = "Cabbage";
                                    }
                                    String var187 = class227.method3832(class167.method578(var184));
                                    class12.method558(6, var179, var187);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 175) {
                                    int var188 = field447.method2455();
                                    int var189 = field447.method2443();
                                    int var190 = var189 >> 10 & 0x1F;
                                    int var191 = var189 >> 5 & 0x1F;
                                    int var192 = var189 & 0x1F;
                                    int var193 = (var192 << 3) + (var190 << 19) + (var191 << 11);
                                    class177 var194 = class177.method621(var188);
                                    if (var194.field2917 != var193) {
                                        var194.field2917 = var193;
                                        method1515(var194);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 178) {
                                    method536(true);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 116) {
                                    int var195 = field447.method2451();
                                    int var196 = field447.method2443();
                                    int var197 = field447.method2579();
                                    class4 var198 = (class4) field407.method3580((long) var197);
                                    if (var198 != null) {
                                        method1282(var198, var198.field55 != var196);
                                    }
                                    class4 var199 = new class4();
                                    var199.field55 = var196;
                                    var199.field54 = var195;
                                    field407.method3569(var199, (long) var197);
                                    Statics.method2756(var196);
                                    class177 var200 = class177.method621(var197);
                                    method1515(var200);
                                    if (field444 != null) {
                                        method1515(field444);
                                        field444 = null;
                                    }
                                    method940();
                                    method547(Statics.field2905[var197 >> 16], var200, false);
                                    class39.method710(var196);
                                    if (field559 != -1) {
                                        int var201 = field559;
                                        if (class177.method3201(var201)) {
                                            method1028(Statics.field2905[var201], 1);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 208) {
                                    field535 = field533;
                                    if (field327 == 0) {
                                        field542 = null;
                                        field508 = null;
                                        Statics.field26 = 0;
                                        Statics.field200 = null;
                                        field328 = -1;
                                        var93 = true;
                                        break label3465;
                                    }
                                    field508 = field447.method2626();
                                    long var202 = field447.method2414();
                                    field542 = class166.method2205(var202);
                                    Statics.field1664 = field447.method2409();
                                    int var204 = field447.method2408();
                                    if (var204 == 255) {
                                        field328 = -1;
                                        var93 = true;
                                        break label3465;
                                    }
                                    Statics.field26 = var204;
                                    class26[] var205 = new class26[100];
                                    for (int var206 = 0; var206 < Statics.field26; var206++) {
                                        var205[var206] = new class26();
                                        var205[var206].field626 = field447.method2626();
                                        var205[var206].field629 = class168.method120(var205[var206].field626, Statics.field2088);
                                        var205[var206].field623 = field447.method2403();
                                        var205[var206].field624 = field447.method2409();
                                        field447.method2626();
                                        if (var205[var206].field626.equals(Statics.field1067.field28)) {
                                            Statics.field637 = var205[var206].field624;
                                        }
                                    }
                                    boolean var207 = false;
                                    int var208 = Statics.field26;
                                    while (var208 > 0) {
                                        boolean var209 = true;
                                        var208--;
                                        for (int var210 = 0; var210 < var208; var210++) {
                                            if (var205[var210].field629.compareTo(var205[var210 + 1].field629) > 0) {
                                                class26 var211 = var205[var210];
                                                var205[var210] = var205[var210 + 1];
                                                var205[var210 + 1] = var211;
                                                var209 = false;
                                            }
                                        }
                                        if (var209) {
                                            break;
                                        }
                                    }
                                    Statics.field200 = var205;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 201) {
                                    int var212 = field447.method2413();
                                    int var213 = field447.method2413();
                                    if (Statics.field1988 == null || !Statics.field1988.isValid()) {
                                        try {
                                            Iterator var214 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                            while (var214.hasNext()) {
                                                GarbageCollectorMXBean var215 = (GarbageCollectorMXBean) var214.next();
                                                if (var215.isValid()) {
                                                    Statics.field1988 = var215;
                                                    field377 = -1L;
                                                    field470 = -1L;
                                                }
                                            }
                                        } catch (Throwable var541) {
                                        }
                                    }
                                    long var217 = class119.method698();
                                    int var219 = -1;
                                    if (Statics.field1988 != null) {
                                        long var220 = Statics.field1988.getCollectionTime();
                                        if (field470 != -1L) {
                                            long var222 = var220 - field470;
                                            long var224 = var217 - field377;
                                            if (var224 != 0L) {
                                                var219 = (int) (var222 * 100L / var224);
                                            }
                                        }
                                        field470 = var220;
                                        field377 = var217;
                                    }
                                    field324.method2670(3);
                                    field324.method2434(field2253);
                                    field324.method2396(var212);
                                    field324.method2396(var213);
                                    field324.method2434(var219);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 238) {
                                    int var226 = field447.method2455();
                                    int var227 = field447.method2453();
                                    int var228 = field447.method2403();
                                    if (var228 == 65535) {
                                        var228 = -1;
                                    }
                                    class177 var229 = class177.method621(var227);
                                    if (var229.field2810) {
                                        var229.field2834 = var228;
                                        var229.field2932 = var226;
                                        class56 var231 = class56.method709(var228);
                                        var229.field2862 = var231.field1168;
                                        var229.field2863 = var231.field1172;
                                        var229.field2901 = var231.field1204;
                                        var229.field2874 = var231.field1159;
                                        var229.field2861 = var231.field1169;
                                        var229.field2865 = var231.field1170;
                                        if (var231.field1209 == 1) {
                                            var229.field2943 = 1;
                                        } else {
                                            var229.field2943 = 2;
                                        }
                                        if (var229.field2930 > 0) {
                                            var229.field2865 = var229.field2865 * 32 / var229.field2930;
                                        } else if (var229.field2885 > 0) {
                                            var229.field2865 = var229.field2865 * 32 / var229.field2885;
                                        }
                                        method1515(var229);
                                    } else {
                                        if (var228 == -1) {
                                            var229.field2911 = 0;
                                            field328 = -1;
                                            var93 = true;
                                            break label3465;
                                        }
                                        class56 var230 = class56.method709(var228);
                                        var229.field2911 = 4;
                                        var229.field2855 = var228;
                                        var229.field2862 = var230.field1168;
                                        var229.field2863 = var230.field1172;
                                        var229.field2865 = var230.field1170 * 100 / var226;
                                        method1515(var229);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 182) {
                                    String var232 = field447.method2626();
                                    long var233 = (long) field447.method2403();
                                    long var235 = (long) field447.method2412();
                                    class156 var237 = (class156) class113.method99(class156.method604(), field447.method2408());
                                    long var238 = (var233 << 32) + var235;
                                    boolean var240 = false;
                                    for (int var241 = 0; var241 < 100; var241++) {
                                        if (field501[var241] == var238) {
                                            var240 = true;
                                            break;
                                        }
                                    }
                                    if (method2813(var232)) {
                                        var240 = true;
                                    }
                                    if (!var240 && field305 == 0) {
                                        field501[field502] = var238;
                                        field502 = (field502 + 1) % 100;
                                        class126 var242 = field447;
                                        String var246;
                                        try {
                                            int var243 = var242.method2421();
                                            if (var243 > 32767) {
                                                var243 = 32767;
                                            }
                                            byte[] var244 = new byte[var243];
                                            var242.field2057 += Statics.field3233.method2347(var242.field2056, var242.field2057, var244, 0, var243);
                                            String var245 = class169.method162(var244, 0, var243);
                                            var246 = var245;
                                        } catch (Exception var531) {
                                            var246 = "Cabbage";
                                        }
                                        String var249 = class227.method3832(class167.method578(var246));
                                        byte var250;
                                        if (var237.field2318) {
                                            var250 = 7;
                                        } else {
                                            var250 = 3;
                                        }
                                        if (var237.field2311 == -1) {
                                            class12.method558(var250, var232, var249);
                                        } else {
                                            class12.method558(var250, class2.method2335(var237.field2311) + var232, var249);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 165) {
                                    String var251 = field447.method2626();
                                    long var252 = field447.method2414();
                                    long var254 = (long) field447.method2403();
                                    long var256 = (long) field447.method2412();
                                    class156 var258 = (class156) class113.method99(class156.method604(), field447.method2408());
                                    long var259 = (var254 << 32) + var256;
                                    boolean var261 = false;
                                    for (int var262 = 0; var262 < 100; var262++) {
                                        if (field501[var262] == var259) {
                                            var261 = true;
                                            break;
                                        }
                                    }
                                    if (var258.field2317 && method2813(var251)) {
                                        var261 = true;
                                    }
                                    if (!var261 && field305 == 0) {
                                        field501[field502] = var259;
                                        field502 = (field502 + 1) % 100;
                                        class126 var263 = field447;
                                        String var267;
                                        try {
                                            int var264 = var263.method2421();
                                            if (var264 > 32767) {
                                                var264 = 32767;
                                            }
                                            byte[] var265 = new byte[var264];
                                            var263.field2057 += Statics.field3233.method2347(var263.field2056, var263.field2057, var265, 0, var264);
                                            String var266 = class169.method162(var265, 0, var264);
                                            var267 = var266;
                                        } catch (Exception var530) {
                                            var267 = "Cabbage";
                                        }
                                        String var270 = class227.method3832(class167.method578(var267));
                                        if (var258.field2311 == -1) {
                                            class12.method156(9, var251, var270, class166.method2995(var252));
                                        } else {
                                            class12.method156(9, class2.method2335(var258.field2311) + var251, var270, class166.method2995(var252));
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 114) {
                                    Statics.field1970 = field447.method2451();
                                    Statics.field197 = field447.method2435();
                                    for (int var271 = Statics.field197; var271 < Statics.field197 + 8; var271++) {
                                        for (int var272 = Statics.field1970; var272 < Statics.field1970 + 8; var272++) {
                                            if (field413[Statics.field1819][var271][var272] != null) {
                                                field413[Statics.field1819][var271][var272] = null;
                                                method2343(var271, var272);
                                            }
                                        }
                                    }
                                    for (class17 var273 = (class17) field414.method3600(); var273 != null; var273 = (class17) field414.method3602()) {
                                        if (var273.field245 >= Statics.field197 && var273.field245 < Statics.field197 + 8 && var273.field236 >= Statics.field1970 && var273.field236 < Statics.field1970 + 8 && Statics.field1819 == var273.field244) {
                                            var273.field242 = 0;
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 159) {
                                    for (int var274 = 0; var274 < Statics.field584; var274++) {
                                        class57 var275 = class57.method699(var274);
                                        if (var275 != null) {
                                            class180.field2959[var274] = 0;
                                            class180.field2960[var274] = 0;
                                        }
                                    }
                                    method619();
                                    field544 += 32;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 35) {
                                    String var276 = field447.method2626();
                                    Object[] var277 = new Object[var276.length() + 1];
                                    for (int var278 = var276.length() - 1; var278 >= 0; var278--) {
                                        if (var276.charAt(var278) == 's') {
                                            var277[var278 + 1] = field447.method2626();
                                        } else {
                                            var277[var278 + 1] = Integer.valueOf(field447.method2413());
                                        }
                                    }
                                    var277[0] = Integer.valueOf(field447.method2413());
                                    class1 var279 = new class1();
                                    var279.field9 = var277;
                                    class39.method2994(var279, 200000);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 181) {
                                    method619();
                                    field445 = field447.method2408();
                                    field477 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 90) {
                                    int var280 = field447.method2421();
                                    boolean var281 = field447.method2408() == 1;
                                    String var282 = "";
                                    boolean var283 = false;
                                    if (var281) {
                                        var282 = field447.method2626();
                                        if (method2813(var282)) {
                                            var283 = true;
                                        }
                                    }
                                    String var284 = field447.method2626();
                                    if (!var283) {
                                        class12.method558(var280, var282, var284);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 60) {
                                    method536(false);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 5) {
                                    field443 = field447.method2408();
                                    field323 = field447.method2408();
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 147) {
                                    field419 = true;
                                    Statics.field1668 = field447.method2408();
                                    Statics.field572 = field447.method2408();
                                    Statics.field223 = field447.method2403();
                                    Statics.field1686 = field447.method2408();
                                    Statics.field2215 = field447.method2408();
                                    if (Statics.field2215 >= 100) {
                                        Statics.field130 = Statics.field1668 * 128 + 64;
                                        Statics.field1579 = Statics.field572 * 128 + 64;
                                        Statics.field2039 = method905(Statics.field130, Statics.field1579, Statics.field1819) - Statics.field223;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 30) {
                                    int var285 = field447.method2413();
                                    int var286 = field447.method2403();
                                    if (var285 < -70000) {
                                        var286 += 32768;
                                    }
                                    class177 var287;
                                    if (var285 >= 0) {
                                        var287 = class177.method621(var285);
                                    } else {
                                        var287 = null;
                                    }
                                    while (field447.field2057 < field327) {
                                        int var288 = field447.method2421();
                                        int var289 = field447.method2403();
                                        int var290 = 0;
                                        if (var289 != 0) {
                                            var290 = field447.method2408();
                                            if (var290 == 255) {
                                                var290 = field447.method2413();
                                            }
                                        }
                                        if (var287 != null && var288 >= 0 && var288 < var287.field2803.length) {
                                            var287.field2803[var288] = var289;
                                            var287.field2860[var288] = var290;
                                        }
                                        class16.method2873(var286, var288, var289 - 1, var290);
                                    }
                                    if (var287 != null) {
                                        method1515(var287);
                                    }
                                    method619();
                                    field468[++field558 - 1 & 0x1F] = var286 & 0x7FFF;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 202) {
                                    int var291 = field447.method2446();
                                    int var292 = field447.method2413();
                                    class177 var293 = class177.method621(var292);
                                    if (var293.field2858 != var291 || var291 == -1) {
                                        var293.field2858 = var291;
                                        var293.field2933 = 0;
                                        var293.field2946 = 0;
                                        method1515(var293);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 1) {
                                    method619();
                                    field528 = field447.method2611();
                                    field477 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 58) {
                                    while (field447.field2057 < field327) {
                                        boolean var294 = field447.method2408() == 1;
                                        String var295 = field447.method2626();
                                        String var296 = field447.method2626();
                                        int var297 = field447.method2403();
                                        int var298 = field447.method2408();
                                        int var299 = field447.method2408();
                                        boolean var300 = (var299 & 0x2) != 0;
                                        boolean var301 = (var299 & 0x1) != 0;
                                        if (var297 > 0) {
                                            field447.method2626();
                                            field447.method2408();
                                            field447.method2413();
                                        }
                                        field447.method2626();
                                        for (int var302 = 0; var302 < field532; var302++) {
                                            class18 var303 = field550[var302];
                                            if (var294) {
                                                if (var296.equals(var303.field252)) {
                                                    var303.field252 = var295;
                                                    var303.field249 = var296;
                                                    var295 = null;
                                                    break;
                                                }
                                            } else if (var295.equals(var303.field252)) {
                                                if (var303.field250 != var297) {
                                                    boolean var304 = true;
                                                    for (class41 var305 = (class41) field551.method3559(); var305 != null; var305 = (class41) field551.method3560()) {
                                                        if (var305.field878.equals(var295)) {
                                                            if (var297 != 0 && var305.field882 == 0) {
                                                                var305.method3691();
                                                                var304 = false;
                                                            } else if (var297 == 0 && var305.field882 != 0) {
                                                                var305.method3691();
                                                                var304 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var304) {
                                                        field551.method3562(new class41(var295, var297));
                                                    }
                                                    var303.field250 = var297;
                                                }
                                                var303.field249 = var296;
                                                var303.field251 = var298;
                                                var303.field257 = var300;
                                                var303.field253 = var301;
                                                var295 = null;
                                                break;
                                            }
                                        }
                                        if (var295 != null && field532 < 400) {
                                            class18 var306 = new class18();
                                            field550[field532] = var306;
                                            var306.field252 = var295;
                                            var306.field249 = var296;
                                            var306.field250 = var297;
                                            var306.field251 = var298;
                                            var306.field257 = var300;
                                            var306.field253 = var301;
                                            field532++;
                                        }
                                    }
                                    field503 = 2;
                                    field473 = field533;
                                    boolean var307 = false;
                                    int var308 = field532;
                                    while (var308 > 0) {
                                        boolean var309 = true;
                                        var308--;
                                        for (int var310 = 0; var310 < var308; var310++) {
                                            boolean var311 = false;
                                            class18 var312 = field550[var310];
                                            class18 var313 = field550[var310 + 1];
                                            if (field283 != var312.field250 && field283 == var313.field250) {
                                                var311 = true;
                                            }
                                            if (!var311 && var312.field250 == 0 && var313.field250 != 0) {
                                                var311 = true;
                                            }
                                            if (!var311 && !var312.field257 && var313.field257) {
                                                var311 = true;
                                            }
                                            if (!var311 && !var312.field253 && var313.field253) {
                                                var311 = true;
                                            }
                                            if (var311) {
                                                class18 var314 = field550[var310];
                                                field550[var310] = field550[var310 + 1];
                                                field550[var310 + 1] = var314;
                                                var309 = false;
                                            }
                                        }
                                        if (var309) {
                                            break;
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 216) {
                                    int var315 = field447.method2413();
                                    boolean var316 = field447.method2408() == 1;
                                    class177 var317 = class177.method621(var315);
                                    if (var317.field2831 != var316) {
                                        var317.field2831 = var316;
                                        method1515(var317);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 214) {
                                    int var318 = field447.method2403();
                                    field559 = var318;
                                    int var319 = field559;
                                    int var320 = Statics.field1500;
                                    int var321 = Statics.field3176;
                                    if (class177.method3201(var319)) {
                                        method346(Statics.field2905[var319], -1, var320, var321, false);
                                    }
                                    Statics.method2756(var318);
                                    class39.method710(field559);
                                    for (int var322 = 0; var322 < 100; var322++) {
                                        field485[var322] = true;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 96) {
                                    class35.method163(field447, field327);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 67) {
                                    int var323 = field447.method2453();
                                    class177 var324 = class177.method621(var323);
                                    var324.field2911 = 3;
                                    var324.field2855 = Statics.field1067.field34.method3287();
                                    method1515(var324);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 25) {
                                    int var325 = field447.method2413();
                                    int var326 = field447.method2403();
                                    if (var325 < -70000) {
                                        var326 += 32768;
                                    }
                                    class177 var327;
                                    if (var325 >= 0) {
                                        var327 = class177.method621(var325);
                                    } else {
                                        var327 = null;
                                    }
                                    if (var327 != null) {
                                        for (int var328 = 0; var328 < var327.field2803.length; var328++) {
                                            var327.field2803[var328] = 0;
                                            var327.field2860[var328] = 0;
                                        }
                                    }
                                    class16.method2206(var326);
                                    int var329 = field447.method2403();
                                    for (int var330 = 0; var330 < var329; var330++) {
                                        int var331 = field447.method2408();
                                        if (var331 == 255) {
                                            var331 = field447.method2413();
                                        }
                                        int var332 = field447.method2403();
                                        if (var327 != null && var330 < var327.field2803.length) {
                                            var327.field2803[var330] = var332;
                                            var327.field2860[var330] = var331;
                                        }
                                        class16.method2873(var326, var330, var332 - 1, var331);
                                    }
                                    if (var327 != null) {
                                        method1515(var327);
                                    }
                                    method619();
                                    field468[++field558 - 1 & 0x1F] = var326 & 0x7FFF;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 145) {
                                    int var333 = field447.method2403();
                                    if (var333 == 65535) {
                                        var333 = -1;
                                    }
                                    if (var333 == -1 && !field519) {
                                        Statics.field3009.method3444();
                                        class187.field3010 = 1;
                                        Statics.field3011 = null;
                                    } else if (var333 != -1 && field518 != var333 && field517 != 0 && !field519) {
                                        class187.method571(2, Statics.field3109, var333, 0, field517, false);
                                    }
                                    field518 = var333;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 207) {
                                    int var334 = field447.method2437();
                                    int var335 = field447.method2444();
                                    if (var335 == 65535) {
                                        var335 = -1;
                                    }
                                    if (field517 != 0 && var335 != -1) {
                                        class187.method2627(Statics.field2095, var335, 0, field517, false);
                                        field519 = true;
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 212) {
                                    int var336 = field447.method2403();
                                    int var337 = field447.method2444();
                                    int var338 = field447.method2413();
                                    int var339 = field447.method2445();
                                    class177 var340 = class177.method621(var338);
                                    if (var340.field2862 != var337 || var340.field2863 != var339 || var340.field2865 != var336) {
                                        var340.field2862 = var337;
                                        var340.field2863 = var339;
                                        var340.field2865 = var336;
                                        method1515(var340);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 107) {
                                    for (int var341 = 0; var341 < class180.field2960.length; var341++) {
                                        if (class180.field2960[var341] != class180.field2959[var341]) {
                                            class180.field2960[var341] = class180.field2959[var341];
                                            method3250(var341);
                                            field340[++field544 - 1 & 0x1F] = var341;
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 156) {
                                    field516 = field447.method2408();
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 45) {
                                    int var342 = field447.method2413();
                                    int var343 = field447.method2455();
                                    class4 var344 = (class4) field407.method3580((long) var342);
                                    class4 var345 = (class4) field407.method3580((long) var343);
                                    if (var345 != null) {
                                        method1282(var345, var344 == null || var344.field55 != var345.field55);
                                    }
                                    if (var344 != null) {
                                        var344.method3695();
                                        field407.method3569(var344, (long) var343);
                                    }
                                    class177 var346 = class177.method621(var342);
                                    if (var346 != null) {
                                        method1515(var346);
                                    }
                                    class177 var347 = class177.method621(var343);
                                    if (var347 != null) {
                                        method1515(var347);
                                        method547(Statics.field2905[var347.field2857 >>> 16], var347, true);
                                    }
                                    if (field559 != -1) {
                                        int var348 = field559;
                                        if (class177.method3201(var348)) {
                                            method1028(Statics.field2905[var348], 1);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 239) {
                                    String var349 = field447.method2626();
                                    int var350 = field447.method2579();
                                    class177 var351 = class177.method621(var350);
                                    if (!var349.equals(var351.field2871)) {
                                        var351.field2871 = var349;
                                        method1515(var351);
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 125) {
                                    int var352 = field447.method2455();
                                    int var353 = field447.method2403();
                                    class180.field2959[var353] = var352;
                                    if (class180.field2960[var353] != var352) {
                                        class180.field2960[var353] = var352;
                                    }
                                    method3250(var353);
                                    field340[++field544 - 1 & 0x1F] = var353;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 111) {
                                    int var354 = field447.method2408();
                                    if (field447.method2408() == 0) {
                                        field557[var354] = new class224();
                                        field447.field2057 += 18;
                                    } else {
                                        field447.field2057--;
                                        field557[var354] = new class224(field447, false);
                                    }
                                    field475 = field533;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 219) {
                                    Statics.field143 = class134.method2000(field447.method2408());
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 16) {
                                    method1046(field447.method2626());
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 105) {
                                    method619();
                                    int var355 = field447.method2413();
                                    int var356 = field447.method2408();
                                    int var357 = field447.method2408();
                                    field465[var357] = var355;
                                    field417[var357] = var356;
                                    field418[var357] = 1;
                                    for (int var358 = 0; var358 < 98; var358++) {
                                        if (var355 >= class159.field2352[var358]) {
                                            field418[var357] = var358 + 2;
                                        }
                                    }
                                    field343[++field459 - 1 & 0x1F] = var357;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 192) {
                                    int var359 = field447.method2413();
                                    int var360 = field447.method2444();
                                    int var361 = field447.method2444();
                                    class177 var362 = class177.method621(var359);
                                    var362.field2867 = (var360 << 16) + var361;
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 231) {
                                    int var363 = field447.method2413();
                                    Statics.field2190 = Statics.field2087.method2773(var363);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 12) {
                                    Statics.field197 = field447.method2408();
                                    Statics.field1970 = field447.method2408();
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 68) {
                                    class126 var364 = field447;
                                    int var365 = field327;
                                    class214 var366 = new class214();
                                    var366.field3183 = var364.method2408();
                                    var366.field3185 = var364.method2413();
                                    var366.field3178 = new int[var366.field3183];
                                    var366.field3180 = new int[var366.field3183];
                                    var366.field3181 = new Field[var366.field3183];
                                    var366.field3182 = new int[var366.field3183];
                                    var366.field3177 = new Method[var366.field3183];
                                    var366.field3184 = new byte[var366.field3183][][];
                                    for (int var367 = 0; var367 < var366.field3183; var367++) {
                                        try {
                                            int var368 = var364.method2408();
                                            if (var368 == 0 || var368 == 1 || var368 == 2) {
                                                String var369 = var364.method2626();
                                                String var370 = var364.method2626();
                                                int var371 = 0;
                                                if (var368 == 1) {
                                                    var371 = var364.method2413();
                                                }
                                                var366.field3178[var367] = var368;
                                                var366.field3182[var367] = var371;
                                                if (class215.method3175(var369).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                var366.field3181[var367] = class215.method3175(var369).getDeclaredField(var370);
                                            } else if (var368 == 3 || var368 == 4) {
                                                String var372 = var364.method2626();
                                                String var373 = var364.method2626();
                                                int var374 = var364.method2408();
                                                String[] var375 = new String[var374];
                                                for (int var376 = 0; var376 < var374; var376++) {
                                                    var375[var376] = var364.method2626();
                                                }
                                                String var377 = var364.method2626();
                                                byte[][] var378 = new byte[var374][];
                                                if (var368 == 3) {
                                                    for (int var379 = 0; var379 < var374; var379++) {
                                                        int var380 = var364.method2413();
                                                        var378[var379] = new byte[var380];
                                                        var364.method2419(var378[var379], 0, var380);
                                                    }
                                                }
                                                var366.field3178[var367] = var368;
                                                Class[] var381 = new Class[var374];
                                                for (int var382 = 0; var382 < var374; var382++) {
                                                    var381[var382] = class215.method3175(var375[var382]);
                                                }
                                                Class var383 = class215.method3175(var377);
                                                if (class215.method3175(var372).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                Method[] var384 = class215.method3175(var372).getDeclaredMethods();
                                                Method[] var385 = var384;
                                                for (int var386 = 0; var386 < var385.length; var386++) {
                                                    Method var387 = var385[var386];
                                                    if (var387.getName().equals(var373)) {
                                                        Class[] var388 = var387.getParameterTypes();
                                                        if (var381.length == var388.length) {
                                                            boolean var389 = true;
                                                            for (int var390 = 0; var390 < var381.length; var390++) {
                                                                if (var381[var390] != var388[var390]) {
                                                                    var389 = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (var389 && var383 == var387.getReturnType()) {
                                                                var366.field3177[var367] = var387;
                                                            }
                                                        }
                                                    }
                                                }
                                                var366.field3184[var367] = var378;
                                            }
                                        } catch (ClassNotFoundException var536) {
                                            var366.field3180[var367] = -1;
                                        } catch (SecurityException var537) {
                                            var366.field3180[var367] = -2;
                                        } catch (NullPointerException var538) {
                                            var366.field3180[var367] = -3;
                                        } catch (Exception var539) {
                                            var366.field3180[var367] = -4;
                                        } catch (Throwable var540) {
                                            var366.field3180[var367] = -5;
                                        }
                                    }
                                    class215.field3188.method3633(var366);
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 54) {
                                    class28 var396 = new class28();
                                    var396.field654 = field447.method2626();
                                    var396.field655 = field447.method2403();
                                    int var397 = field447.method2413();
                                    var396.field652 = var397;
                                    method2720(45);
                                    Statics.field695.method2881();
                                    Statics.field695 = null;
                                    class34.method1801(var396);
                                    field328 = -1;
                                    var93 = false;
                                    break label3465;
                                }
                                if (field328 == 56) {
                                    field419 = true;
                                    Statics.field1832 = field447.method2408();
                                    Statics.field462 = field447.method2408();
                                    Statics.field87 = field447.method2403();
                                    Statics.field778 = field447.method2408();
                                    Statics.field142 = field447.method2408();
                                    if (Statics.field142 >= 100) {
                                        int var398 = Statics.field1832 * 128 + 64;
                                        int var399 = Statics.field462 * 128 + 64;
                                        int var400 = method905(var398, var399, Statics.field1819) - Statics.field87;
                                        int var401 = var398 - Statics.field130;
                                        int var402 = var400 - Statics.field2039;
                                        int var403 = var399 - Statics.field1579;
                                        int var404 = (int) Math.sqrt((double) (var401 * var401 + var403 * var403));
                                        Statics.field1142 = (int) (Math.atan2((double) var402, (double) var404) * 325.949D) & 0x7FF;
                                        Statics.field565 = (int) (Math.atan2((double) var401, (double) var403) * -325.949D) & 0x7FF;
                                        if (Statics.field1142 < 128) {
                                            Statics.field1142 = 128;
                                        }
                                        if (Statics.field1142 > 383) {
                                            Statics.field1142 = 383;
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 203) {
                                    int var405 = field447.method2455();
                                    int var406 = field447.method2403();
                                    class177 var407 = class177.method621(var405);
                                    if (var407 != null && var407.field2838 == 0) {
                                        if (var406 > var407.field2835 - var407.field2827) {
                                            var406 = var407.field2835 - var407.field2827;
                                        }
                                        if (var406 < 0) {
                                            var406 = 0;
                                        }
                                        if (var407.field2833 != var406) {
                                            var407.field2833 = var406;
                                            method1515(var407);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                if (field328 == 131) {
                                    int var408 = field447.method2454();
                                    int var409 = field447.method2579();
                                    int var410 = field447.method2611();
                                    class177 var411 = class177.method621(var409);
                                    if (var411.field2820 != var410 || var411.field2821 != var408 || var411.field2910 != 0 || var411.field2921 != 0) {
                                        var411.field2820 = var410;
                                        var411.field2821 = var408;
                                        var411.field2910 = 0;
                                        var411.field2921 = 0;
                                        method1515(var411);
                                        method182(var411);
                                        if (var411.field2838 == 0) {
                                            method547(Statics.field2905[var409 >> 16], var411, false);
                                        }
                                    }
                                    field328 = -1;
                                    var93 = true;
                                    break label3465;
                                }
                                class152.method2217("" + field328 + class2.field18 + field397 + class2.field18 + field333 + class2.field18 + field327, (Throwable) null);
                                method2872();
                            } catch (IOException var542) {
                                if (field441 > 0) {
                                    method2872();
                                } else {
                                    method2720(40);
                                    Statics.field1260 = Statics.field695;
                                    Statics.field695 = null;
                                }
                            } catch (Exception var543) {
                                String var414 = "" + field328 + class2.field18 + field397 + class2.field18 + field333 + class2.field18 + field327 + class2.field18 + (Statics.field676 + Statics.field1067.field873[0]) + class2.field18 + (Statics.field2366 + Statics.field1067.field874[0]) + class2.field18;
                                for (int var415 = 0; var415 < field327 && var415 < 50; var415++) {
                                    var414 = var414 + field447.field2056[var415] + class2.field18;
                                }
                                class152.method2217(var414, var543);
                                method2872();
                            }
                            var93 = true;
                        }
                    }
                    if (!var93) {
                        break;
                    }
                }
                if (field289 == 30) {
                    while (class215.method3015()) {
                        field324.method2670(49);
                        field324.method2567(0);
                        int var416 = field324.field2057;
                        Statics.method980(field324);
                        field324.method2405(field324.field2057 - var416);
                    }
                    Object var417 = Statics.field1476.field191;
                    synchronized (Statics.field1476.field191) {
                        if (!field411) {
                            Statics.field1476.field201 = 0;
                        } else if (class144.field2199 != 0 || Statics.field1476.field201 >= 40) {
                            field324.method2670(207);
                            field324.method2567(0);
                            int var418 = field324.field2057;
                            int var419 = 0;
                            for (int var420 = 0; var420 < Statics.field1476.field201 && field324.field2057 - var418 < 240; var420++) {
                                var419++;
                                int var421 = Statics.field1476.field195[var420];
                                if (var421 < 0) {
                                    var421 = 0;
                                } else if (var421 > 502) {
                                    var421 = 502;
                                }
                                int var422 = Statics.field1476.field194[var420];
                                if (var422 < 0) {
                                    var422 = 0;
                                } else if (var422 > 764) {
                                    var422 = 764;
                                }
                                int var423 = var421 * 765 + var422;
                                if (Statics.field1476.field195[var420] == -1 && Statics.field1476.field194[var420] == -1) {
                                    var422 = -1;
                                    var421 = -1;
                                    var423 = 524287;
                                }
                                if (field316 != var422 || field440 != var421) {
                                    int var424 = var422 - field316;
                                    field316 = var422;
                                    int var425 = var421 - field440;
                                    field440 = var421;
                                    if (field295 < 8 && var424 >= -32 && var424 <= 31 && var425 >= -32 && var425 <= 31) {
                                        var424 += 32;
                                        var425 += 32;
                                        field324.method2394((field295 << 12) + (var424 << 6) + var425);
                                        field295 = 0;
                                    } else if (field295 < 8) {
                                        field324.method2594((field295 << 19) + 8388608 + var423);
                                        field295 = 0;
                                    } else {
                                        field324.method2396((field295 << 19) + -1073741824 + var423);
                                        field295 = 0;
                                    }
                                } else if (field295 < 2047) {
                                    field295++;
                                }
                            }
                            field324.method2405(field324.field2057 - var418);
                            if (var419 >= Statics.field1476.field201) {
                                Statics.field1476.field201 = 0;
                            } else {
                                Statics.field1476.field201 -= var419;
                                for (int var426 = 0; var426 < Statics.field1476.field201; var426++) {
                                    Statics.field1476.field194[var426] = Statics.field1476.field194[var419 + var426];
                                    Statics.field1476.field195[var426] = Statics.field1476.field195[var419 + var426];
                                }
                            }
                        }
                    }
                    if (class144.field2199 == 1 || !Statics.field2118 && class144.field2199 == 4 || class144.field2199 == 2) {
                        long var428 = (class144.field2209 - field292 * -1L) / 50L;
                        if (var428 > 4095L) {
                            var428 = 4095L;
                        }
                        field292 = class144.field2209 * -1L;
                        int var430 = class144.field2214;
                        if (var430 < 0) {
                            var430 = 0;
                        } else if (var430 > Statics.field3176) {
                            var430 = Statics.field3176;
                        }
                        int var431 = class144.field2212;
                        if (var431 < 0) {
                            var431 = 0;
                        } else if (var431 > Statics.field1500) {
                            var431 = Statics.field1500;
                        }
                        int var432 = (int) var428;
                        field324.method2670(101);
                        field324.method2394((class144.field2199 == 2 ? 1 : 0) + (var432 << 1));
                        field324.method2394(var431);
                        field324.method2394(var430);
                    }
                    if (class141.field2175 > 0) {
                        field324.method2670(45);
                        field324.method2394(0);
                        int var433 = field324.field2057;
                        long var434 = class119.method698();
                        for (int var436 = 0; var436 < class141.field2175; var436++) {
                            long var437 = var434 - field506;
                            if (var437 > 16777215L) {
                                var437 = 16777215L;
                            }
                            field506 = var434;
                            field324.method2567(class141.field2174[var436]);
                            field324.method2448((int) var437);
                        }
                        field324.method2404(field324.field2057 - var433);
                    }
                    if (field373 > 0) {
                        field373--;
                    }
                    if (class141.field2168[96] || class141.field2168[97] || class141.field2168[98] || class141.field2168[99]) {
                        field374 = true;
                    }
                    if (field374 && field373 <= 0) {
                        field373 = 20;
                        field374 = false;
                        field324.method2670(62);
                        field324.method2513(field367);
                        field324.method2513(field366);
                    }
                    if (Statics.field2992 && !field296) {
                        field296 = true;
                        field324.method2670(184);
                        field324.method2567(1);
                    }
                    if (!Statics.field2992 && field296) {
                        field296 = false;
                        field324.method2670(184);
                        field324.method2567(0);
                    }
                    if (Statics.field1819 != field436) {
                        field436 = Statics.field1819;
                        int var439 = Statics.field1819;
                        int[] var440 = Statics.field2206.field1436;
                        int var441 = var440.length;
                        for (int var442 = 0; var442 < var441; var442++) {
                            var440[var442] = 0;
                        }
                        int var443 = 1;
                        while (true) {
                            if (var443 >= 103) {
                                int var446 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                int var447 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                Statics.field2206.method1648();
                                for (int var448 = 1; var448 < 103; var448++) {
                                    for (int var449 = 1; var449 < 103; var449++) {
                                        if ((class6.field72[var439][var449][var448] & 0x18) == 0) {
                                            method45(var439, var449, var448, var446, var447);
                                        }
                                        if (var439 < 3 && (class6.field72[var439 + 1][var449][var448] & 0x8) != 0) {
                                            method45(var439 + 1, var449, var448, var446, var447);
                                        }
                                    }
                                }
                                field288 = 0;
                                for (int var450 = 0; var450 < 104; var450++) {
                                    for (int var451 = 0; var451 < 104; var451++) {
                                        int var452 = Statics.field123.method1988(Statics.field1819, var450, var451);
                                        if (var452 != 0) {
                                            int var453 = var452 >> 14 & 0x7FFF;
                                            int var454 = class43.method12(var453).field952;
                                            if (var454 >= 0) {
                                                int var455 = var450;
                                                int var456 = var451;
                                                if (var454 != 22 && var454 != 29 && var454 != 34 && var454 != 36 && var454 != 46 && var454 != 47 && var454 != 48) {
                                                    int[][] var457 = field341[Statics.field1819].field1964;
                                                    for (int var458 = 0; var458 < 10; var458++) {
                                                        int var459 = (int) (Math.random() * 4.0D);
                                                        if (var459 == 0 && var455 > 0 && var455 > var450 - 3 && (var457[var455 - 1][var456] & 0x1240108) == 0) {
                                                            var455--;
                                                        }
                                                        if (var459 == 1 && var455 < 103 && var455 < var450 + 3 && (var457[var455 + 1][var456] & 0x1240180) == 0) {
                                                            var455++;
                                                        }
                                                        if (var459 == 2 && var456 > 0 && var456 > var451 - 3 && (var457[var455][var456 - 1] & 0x1240102) == 0) {
                                                            var456--;
                                                        }
                                                        if (var459 == 3 && var456 < 103 && var456 < var451 + 3 && (var457[var455][var456 + 1] & 0x1240120) == 0) {
                                                            var456++;
                                                        }
                                                    }
                                                }
                                                field513[field288] = Statics.field141[var454];
                                                field452[field288] = var455;
                                                field512[field288] = var456;
                                                field288++;
                                            }
                                        }
                                    }
                                }
                                Statics.field883.method1618();
                                break;
                            }
                            int var444 = (103 - var443) * 2048 + 24628;
                            for (int var445 = 1; var445 < 103; var445++) {
                                if ((class6.field72[var439][var445][var443] & 0x18) == 0) {
                                    Statics.field123.method1859(var440, var444, 512, var439, var445, var443);
                                }
                                if (var439 < 3 && (class6.field72[var439 + 1][var445][var443] & 0x8) != 0) {
                                    Statics.field123.method1859(var440, var444, 512, var439 + 1, var445, var443);
                                }
                                var444 += 4;
                            }
                            var443++;
                        }
                    }
                    if (field289 == 30) {
                        method1513();
                        int var10002;
                        for (int var460 = 0; var460 < field522; var460++) {
                            var10002 = field287[var460]--;
                            if (field287[var460] >= -10) {
                                class62 var462 = field527[var460];
                                if (var462 == null) {
                                    class62 var545 = (class62) null;
                                    var462 = class62.method1263(Statics.field1112, field326[var460], 0);
                                    if (var462 == null) {
                                        continue;
                                    }
                                    field287[var460] += var462.method1265();
                                    field527[var460] = var462;
                                }
                                if (field287[var460] < 0) {
                                    int var469;
                                    if (field435[var460] == 0) {
                                        var469 = field520;
                                    } else {
                                        int var463 = (field435[var460] & 0xFF) * 128;
                                        int var464 = field435[var460] >> 16 & 0xFF;
                                        int var465 = var464 * 128 + 64 - Statics.field1067.field852;
                                        if (var465 < 0) {
                                            var465 = -var465;
                                        }
                                        int var466 = field435[var460] >> 8 & 0xFF;
                                        int var467 = var466 * 128 + 64 - Statics.field1067.field869;
                                        if (var467 < 0) {
                                            var467 = -var467;
                                        }
                                        int var468 = var465 + var467 - 128;
                                        if (var468 > var463) {
                                            field287[var460] = -100;
                                            continue;
                                        }
                                        if (var468 < 0) {
                                            var468 = 0;
                                        }
                                        var469 = field521 * (var463 - var468) / var463;
                                    }
                                    if (var469 > 0) {
                                        class66 var470 = var462.method1262().method1291(Statics.field2216);
                                        class68 var471 = class68.method1311(var470, 100, var469);
                                        var471.method1314(field524[var460] - 1);
                                        Statics.field206.method1148(var471);
                                    }
                                    field287[var460] = -100;
                                }
                            } else {
                                field522--;
                                for (int var461 = var460; var461 < field522; var461++) {
                                    field326[var461] = field326[var461 + 1];
                                    field527[var461] = field527[var461 + 1];
                                    field524[var461] = field524[var461 + 1];
                                    field287[var461] = field287[var461 + 1];
                                    field435[var461] = field435[var461 + 1];
                                }
                                var460--;
                            }
                        }
                        if (field519 && !class187.method548()) {
                            if (field517 != 0 && field518 != -1) {
                                class187.method2627(Statics.field3109, field518, 0, field517, false);
                            }
                            field519 = false;
                        }
                        field329++;
                        if (field329 <= 750) {
                            int var472 = class35.field761;
                            int[] var473 = class35.field756;
                            for (int var474 = 0; var474 < var472; var474++) {
                                class3 var475 = field510[var473[var474]];
                                if (var475 != null) {
                                    method5(var475, 1);
                                }
                            }
                            method741();
                            method2694();
                            field330++;
                            if (field466 != 0) {
                                field392 += 20;
                                if (field392 >= 400) {
                                    field466 = 0;
                                }
                            }
                            if (Statics.field2726 != null) {
                                field394++;
                                if (field394 >= 15) {
                                    method1515(Statics.field2726);
                                    Statics.field2726 = null;
                                }
                            }
                            class177 var476 = Statics.field1181;
                            class177 var477 = Statics.field1435;
                            Statics.field1181 = null;
                            Statics.field1435 = null;
                            field457 = null;
                            field461 = false;
                            field458 = false;
                            field529 = 0;
                            while (true) {
                                while (class141.method126() && field529 < 128) {
                                    if (field313 >= 2 && class141.field2168[82] && Statics.field2103 == 66) {
                                        String var478 = "";
                                        Iterator var479 = class12.field165.iterator();
                                        while (var479.hasNext()) {
                                            class38 var480 = (class38) var479.next();
                                            var478 = var478 + var480.field798 + ':' + var480.field799 + '\n';
                                        }
                                        Statics.field1217.setContents(new StringSelection(var478), (ClipboardOwner) null);
                                    } else {
                                        field505[field529] = Statics.field2103;
                                        field446[field529] = Statics.field2010;
                                        field529++;
                                    }
                                }
                                if (field559 != -1) {
                                    int var483 = field559;
                                    int var484 = Statics.field1500;
                                    int var485 = Statics.field3176;
                                    if (class177.method3201(var483)) {
                                        method2348(Statics.field2905[var483], -1, 0, 0, var484, var485, 0, 0);
                                    }
                                }
                                field533++;
                                while (true) {
                                    class1 var486;
                                    class177 var487;
                                    class177 var488;
                                    do {
                                        var486 = (class1) field480.method3598();
                                        if (var486 == null) {
                                            while (true) {
                                                class1 var489;
                                                class177 var490;
                                                class177 var491;
                                                do {
                                                    var489 = (class1) field481.method3598();
                                                    if (var489 == null) {
                                                        while (true) {
                                                            class1 var492;
                                                            class177 var493;
                                                            class177 var494;
                                                            do {
                                                                var492 = (class1) field479.method3598();
                                                                if (var492 == null) {
                                                                    method49();
                                                                    if (field495 != null) {
                                                                        method1617();
                                                                    }
                                                                    if (Statics.field2966 != null) {
                                                                        method1515(Statics.field2966);
                                                                        field401++;
                                                                        if (class144.field2204 == 0) {
                                                                            if (field400) {
                                                                                if (Statics.field2966 == Statics.field209 && field399 != field396) {
                                                                                    class177 var495 = Statics.field2966;
                                                                                    byte var496 = 0;
                                                                                    if (field293 == 1 && var495.field2887 == 206) {
                                                                                        var496 = 1;
                                                                                    }
                                                                                    if (var495.field2803[field399] <= 0) {
                                                                                        var496 = 0;
                                                                                    }
                                                                                    int var497 = method2725(var495);
                                                                                    boolean var498 = (var497 >> 29 & 0x1) != 0;
                                                                                    if (var498) {
                                                                                        int var499 = field396;
                                                                                        int var500 = field399;
                                                                                        var495.field2803[var500] = var495.field2803[var499];
                                                                                        var495.field2860[var500] = var495.field2860[var499];
                                                                                        var495.field2803[var499] = -1;
                                                                                        var495.field2860[var499] = 0;
                                                                                    } else if (var496 == 1) {
                                                                                        int var501 = field396;
                                                                                        int var502 = field399;
                                                                                        while (var501 != var502) {
                                                                                            if (var501 > var502) {
                                                                                                var495.method3203(var501 - 1, var501);
                                                                                                var501--;
                                                                                            } else if (var501 < var502) {
                                                                                                var495.method3203(var501 + 1, var501);
                                                                                                var501++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var495.method3203(field399, field396);
                                                                                    }
                                                                                    field324.method2670(68);
                                                                                    field324.method2513(field396);
                                                                                    field324.method2441(field399);
                                                                                    field324.method2427(Statics.field2966.field2857);
                                                                                    field324.method2434(var496);
                                                                                }
                                                                            } else if ((field509 == 1 || method713(field422 - 1)) && field422 > 2) {
                                                                                method1622(field471, field398);
                                                                            } else if (field422 > 0) {
                                                                                int var503 = field471;
                                                                                int var504 = field398;
                                                                                class33 var505 = Statics.field1243;
                                                                                method2870(var505.field716, var505.field714, var505.field715, var505.field718, var505.field717, var505.field717, var503, var504);
                                                                                Statics.field1243 = null;
                                                                            }
                                                                            field394 = 10;
                                                                            class144.field2199 = 0;
                                                                            Statics.field2966 = null;
                                                                        } else if (field401 >= 5 && (class144.field2205 > field471 + 5 || class144.field2205 < field471 - 5 || class144.field2211 * -117362325 > field398 + 5 || class144.field2211 * -117362325 < field398 - 5)) {
                                                                            field400 = true;
                                                                        }
                                                                    }
                                                                    if (class90.field1542 != -1) {
                                                                        int var506 = class90.field1542;
                                                                        int var507 = class90.field1543;
                                                                        field324.method2670(44);
                                                                        field324.method2567(5);
                                                                        field324.method2513(Statics.field2366 + var507);
                                                                        field324.method2513(Statics.field676 + var506);
                                                                        field324.method2567(class141.field2168[82] ? (class141.field2168[81] ? 2 : 1) : 0);
                                                                        class90.field1542 = -1;
                                                                        field335 = class144.field2212;
                                                                        field391 = class144.field2214;
                                                                        field466 = 1;
                                                                        field392 = 0;
                                                                        field302 = var506;
                                                                        field515 = var507;
                                                                    }
                                                                    if (Statics.field1181 != var476) {
                                                                        if (var476 != null) {
                                                                            method1515(var476);
                                                                        }
                                                                        if (Statics.field1181 != null) {
                                                                            method1515(Statics.field1181);
                                                                        }
                                                                    }
                                                                    if (Statics.field1435 != var477 && field432 == field431) {
                                                                        if (var477 != null) {
                                                                            method1515(var477);
                                                                        }
                                                                        if (Statics.field1435 != null) {
                                                                            method1515(Statics.field1435);
                                                                        }
                                                                    }
                                                                    if (Statics.field1435 == null) {
                                                                        if (field431 > 0) {
                                                                            field431--;
                                                                        }
                                                                    } else if (field431 < field432) {
                                                                        field431++;
                                                                        if (field432 == field431) {
                                                                            method1515(Statics.field1435);
                                                                        }
                                                                    }
                                                                    method183();
                                                                    if (field419) {
                                                                        int var508 = Statics.field1668 * 128 + 64;
                                                                        int var509 = Statics.field572 * 128 + 64;
                                                                        int var510 = method905(var508, var509, Statics.field1819) - Statics.field223;
                                                                        if (Statics.field130 < var508) {
                                                                            Statics.field130 += Statics.field2215 * (var508 - Statics.field130) / 1000 + Statics.field1686;
                                                                            if (Statics.field130 > var508) {
                                                                                Statics.field130 = var508;
                                                                            }
                                                                        }
                                                                        if (Statics.field130 > var508) {
                                                                            Statics.field130 -= Statics.field2215 * (Statics.field130 - var508) / 1000 + Statics.field1686;
                                                                            if (Statics.field130 < var508) {
                                                                                Statics.field130 = var508;
                                                                            }
                                                                        }
                                                                        if (Statics.field2039 < var510) {
                                                                            Statics.field2039 += Statics.field2215 * (var510 - Statics.field2039) / 1000 + Statics.field1686;
                                                                            if (Statics.field2039 > var510) {
                                                                                Statics.field2039 = var510;
                                                                            }
                                                                        }
                                                                        if (Statics.field2039 > var510) {
                                                                            Statics.field2039 -= Statics.field2215 * (Statics.field2039 - var510) / 1000 + Statics.field1686;
                                                                            if (Statics.field2039 < var510) {
                                                                                Statics.field2039 = var510;
                                                                            }
                                                                        }
                                                                        if (Statics.field1579 < var509) {
                                                                            Statics.field1579 += Statics.field2215 * (var509 - Statics.field1579) / 1000 + Statics.field1686;
                                                                            if (Statics.field1579 > var509) {
                                                                                Statics.field1579 = var509;
                                                                            }
                                                                        }
                                                                        if (Statics.field1579 > var509) {
                                                                            Statics.field1579 -= Statics.field2215 * (Statics.field1579 - var509) / 1000 + Statics.field1686;
                                                                            if (Statics.field1579 < var509) {
                                                                                Statics.field1579 = var509;
                                                                            }
                                                                        }
                                                                        int var511 = Statics.field1832 * 128 + 64;
                                                                        int var512 = Statics.field462 * 128 + 64;
                                                                        int var513 = method905(var511, var512, Statics.field1819) - Statics.field87;
                                                                        int var514 = var511 - Statics.field130;
                                                                        int var515 = var513 - Statics.field2039;
                                                                        int var516 = var512 - Statics.field1579;
                                                                        int var517 = (int) Math.sqrt((double) (var514 * var514 + var516 * var516));
                                                                        int var518 = (int) (Math.atan2((double) var515, (double) var517) * 325.949D) & 0x7FF;
                                                                        int var519 = (int) (Math.atan2((double) var514, (double) var516) * -325.949D) & 0x7FF;
                                                                        if (var518 < 128) {
                                                                            var518 = 128;
                                                                        }
                                                                        if (var518 > 383) {
                                                                            var518 = 383;
                                                                        }
                                                                        if (Statics.field1142 < var518) {
                                                                            Statics.field1142 += Statics.field142 * (var518 - Statics.field1142) / 1000 + Statics.field778;
                                                                            if (Statics.field1142 > var518) {
                                                                                Statics.field1142 = var518;
                                                                            }
                                                                        }
                                                                        if (Statics.field1142 > var518) {
                                                                            Statics.field1142 -= Statics.field142 * (Statics.field1142 - var518) / 1000 + Statics.field778;
                                                                            if (Statics.field1142 < var518) {
                                                                                Statics.field1142 = var518;
                                                                            }
                                                                        }
                                                                        int var520 = var519 - Statics.field565;
                                                                        if (var520 > 1024) {
                                                                            var520 -= 2048;
                                                                        }
                                                                        if (var520 < -1024) {
                                                                            var520 += 2048;
                                                                        }
                                                                        if (var520 > 0) {
                                                                            Statics.field565 += Statics.field142 * var520 / 1000 + Statics.field778;
                                                                            Statics.field565 &= 0x7FF;
                                                                        }
                                                                        if (var520 < 0) {
                                                                            Statics.field565 -= Statics.field142 * -var520 / 1000 + Statics.field778;
                                                                            Statics.field565 &= 0x7FF;
                                                                        }
                                                                        int var521 = var519 - Statics.field565;
                                                                        if (var521 > 1024) {
                                                                            var521 -= 2048;
                                                                        }
                                                                        if (var521 < -1024) {
                                                                            var521 += 2048;
                                                                        }
                                                                        if (var521 < 0 && var520 > 0 || var521 > 0 && var520 < 0) {
                                                                            Statics.field565 = var519;
                                                                        }
                                                                    }
                                                                    for (int var522 = 0; var522 < 5; var522++) {
                                                                        var10002 = field534[var522]++;
                                                                    }
                                                                    Statics.field139.method202();
                                                                    int var523 = ++class144.field2210 - 1;
                                                                    int var525 = class141.method2118();
                                                                    if (var523 > 15000 && var525 > 15000) {
                                                                        field441 = 250;
                                                                        class144.method2721(14500);
                                                                        field324.method2670(247);
                                                                    }
                                                                    field351++;
                                                                    if (field351 > 500) {
                                                                        field351 = 0;
                                                                        int var526 = (int) (Math.random() * 8.0D);
                                                                        if ((var526 & 0x1) == 1) {
                                                                            field345 += field346;
                                                                        }
                                                                        if ((var526 & 0x2) == 2) {
                                                                            field347 += field364;
                                                                        }
                                                                        if ((var526 & 0x4) == 4) {
                                                                            field491 += field350;
                                                                        }
                                                                    }
                                                                    if (field345 < -50) {
                                                                        field346 = 2;
                                                                    }
                                                                    if (field345 > 50) {
                                                                        field346 = -2;
                                                                    }
                                                                    if (field347 < -55) {
                                                                        field364 = 2;
                                                                    }
                                                                    if (field347 > 55) {
                                                                        field364 = -2;
                                                                    }
                                                                    if (field491 < -40) {
                                                                        field350 = 1;
                                                                    }
                                                                    if (field491 > 40) {
                                                                        field350 = -1;
                                                                    }
                                                                    field353++;
                                                                    if (field353 > 500) {
                                                                        field353 = 0;
                                                                        int var527 = (int) (Math.random() * 8.0D);
                                                                        if ((var527 & 0x1) == 1) {
                                                                            field352 += field425;
                                                                        }
                                                                        if ((var527 & 0x2) == 2) {
                                                                            field354 += field355;
                                                                        }
                                                                    }
                                                                    if (field352 < -60) {
                                                                        field425 = 2;
                                                                    }
                                                                    if (field352 > 60) {
                                                                        field425 = -2;
                                                                    }
                                                                    if (field354 < -20) {
                                                                        field355 = 1;
                                                                    }
                                                                    if (field354 > 10) {
                                                                        field355 = -1;
                                                                    }
                                                                    for (class41 var528 = (class41) field551.method3559(); var528 != null; var528 = (class41) field551.method3560()) {
                                                                        if ((long) var528.field880 < class119.method698() / 1000L - 5L) {
                                                                            if (var528.field882 > 0) {
                                                                                class12.method558(5, "", var528.field878 + class161.field2459);
                                                                            }
                                                                            if (var528.field882 == 0) {
                                                                                class12.method558(5, "", var528.field878 + class161.field2436);
                                                                            }
                                                                            var528.method3691();
                                                                        }
                                                                    }
                                                                    field314++;
                                                                    if (field314 > 50) {
                                                                        field324.method2670(185);
                                                                    }
                                                                    try {
                                                                        if (Statics.field695 != null && field324.field2057 > 0) {
                                                                            Statics.field695.method2880(field324.field2056, 0, field324.field2057);
                                                                            field324.field2057 = 0;
                                                                            field314 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var534) {
                                                                        if (field441 > 0) {
                                                                            method2872();
                                                                        } else {
                                                                            method2720(40);
                                                                            Statics.field1260 = Statics.field695;
                                                                            Statics.field695 = null;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                var493 = var492.field8;
                                                                if (var493.field2812 < 0) {
                                                                    break;
                                                                }
                                                                var494 = class177.method621(var493.field2854);
                                                            } while (var494 == null || var494.field2935 == null || var493.field2812 >= var494.field2935.length || var494.field2935[var493.field2812] != var493);
                                                            class39.method2994(var492, 200000);
                                                        }
                                                    }
                                                    var490 = var489.field8;
                                                    if (var490.field2812 < 0) {
                                                        break;
                                                    }
                                                    var491 = class177.method621(var490.field2854);
                                                } while (var491 == null || var491.field2935 == null || var490.field2812 >= var491.field2935.length || var491.field2935[var490.field2812] != var490);
                                                class39.method2994(var489, 200000);
                                            }
                                        }
                                        var487 = var486.field8;
                                        if (var487.field2812 < 0) {
                                            break;
                                        }
                                        var488 = class177.method621(var487.field2854);
                                    } while (var488 == null || var488.field2935 == null || var487.field2812 >= var488.field2935.length || var488.field2935[var487.field2812] != var487);
                                    class39.method2994(var486, 200000);
                                }
                            }
                        } else if (field441 > 0) {
                            method2872();
                        } else {
                            method2720(40);
                            Statics.field1260 = Statics.field695;
                            Statics.field695 = null;
                        }
                    }
                }
            }
        } else if (field289 == 40 || field289 == 45) {
            method2696();
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method243() {
        boolean var1;
        label191: {
            try {
                if (class187.field3010 == 2) {
                    if (Statics.field3018 == null) {
                        Statics.field3018 = class184.method3312(Statics.field3011, Statics.field2331, Statics.field2092);
                        if (Statics.field3018 == null) {
                            var1 = false;
                            break label191;
                        }
                    }
                    if (Statics.field3007 == null) {
                        Statics.field3007 = new class63(Statics.field3015, Statics.field3217);
                    }
                    if (Statics.field3009.method3401(Statics.field3018, Statics.field3014, Statics.field3007, 22050)) {
                        Statics.field3009.method3429();
                        Statics.field3009.method3399(Statics.field3012);
                        Statics.field3009.method3404(Statics.field3018, Statics.field3017);
                        class187.field3010 = 0;
                        Statics.field3018 = null;
                        Statics.field3007 = null;
                        Statics.field3011 = null;
                        var1 = true;
                        break label191;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field3009.method3444();
                class187.field3010 = 0;
                Statics.field3018 = null;
                Statics.field3007 = null;
                Statics.field3011 = null;
            }
            var1 = false;
        }
        if (var1 && field519 && Statics.field1493 != null) {
            Statics.field1493.method1232();
        }
        if (field289 == 10 || field289 == 20 || field289 == 30) {
            if (field493 != 0L && class119.method698() > field493) {
                method160(method2001());
            } else if (field2261) {
                Statics.method2831();
            }
        }
        Dimension var4 = this.method2913();
        if (Statics.field1051 != var4.width || Statics.field1971 != var4.height || field2260) {
            method1533();
            field493 = class119.method698() + 500L;
            field2260 = false;
        }
        boolean var5 = false;
        if (field2258) {
            field2258 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field485[var6] = true;
            }
        }
        if (var5) {
            method1999();
        }
        if (field289 == 0) {
            int var7 = class34.field738;
            String var8 = class34.field739;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field2094.getGraphics();
                if (Statics.field816 == null) {
                    Statics.field816 = new Font("Helvetica", 1, 13);
                    Statics.field2126 = Statics.field2094.getFontMetrics(Statics.field816);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1500, Statics.field3176);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1139 == null) {
                        Statics.field1139 = Statics.field2094.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1139.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field816);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field2126.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1139, Statics.field1500 / 2 - 152, Statics.field3176 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field1500 / 2 - 152;
                    int var14 = Statics.field3176 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field816);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field2126.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field2094.repaint();
            }
        } else if (field289 == 5) {
            class34.method2116(Statics.field1681, Statics.field226, Statics.field2348, var5);
        } else if (field289 == 10 || field289 == 11) {
            class34.method2116(Statics.field1681, Statics.field226, Statics.field2348, var5);
        } else if (field289 == 20) {
            class34.method2116(Statics.field1681, Statics.field226, Statics.field2348, var5);
        } else if (field289 == 25) {
            if (field406 == 1) {
                if (field336 > field337) {
                    field337 = field336;
                }
                int var16 = (field337 * 50 - field336 * 50) / field337;
                method910(class161.field2382 + class2.field25 + class2.field19 + var16 + "%" + class2.field20, false);
            } else if (field406 == 2) {
                if (field338 > field536) {
                    field536 = field338;
                }
                int var17 = (field536 * 50 - field338 * 50) / field536 + 50;
                method910(class161.field2382 + class2.field25 + class2.field19 + var17 + "%" + class2.field20, false);
            } else {
                method910(class161.field2382, false);
            }
        } else if (field289 == 30) {
            method110();
        } else if (field289 == 40) {
            method910(class161.field2434 + class2.field25 + class161.field2410, false);
        } else if (field289 == 45) {
            method910(class161.field2527, false);
        }
        if (field289 == 30 && field492 == 0 && !var5) {
            try {
                Graphics var18 = Statics.field2094.getGraphics();
                for (int var19 = 0; var19 < field548; var19++) {
                    if (field486[var19]) {
                        Statics.field883.method1551(var18, field488[var19], field489[var19], field490[var19], field474[var19]);
                        field486[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field2094.repaint();
            }
        } else if (field289 > 0) {
            try {
                Graphics var21 = Statics.field2094.getGraphics();
                Statics.field883.method1550(var21, 0, 0);
                for (int var22 = 0; var22 < field548; var22++) {
                    field486[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field2094.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method244() {
        if (Statics.field139.method203()) {
            Statics.field139.method200();
        }
        if (Statics.field1476 != null) {
            Statics.field1476.field193 = false;
        }
        Statics.field1476 = null;
        if (Statics.field695 != null) {
            Statics.field695.method2881();
            Statics.field695 = null;
        }
        if (class141.field2170 != null) {
            class141 var1 = class141.field2170;
            synchronized (class141.field2170) {
                class141.field2170 = null;
            }
        }
        class144.method179();
        Statics.field92 = null;
        if (Statics.field1493 != null) {
            Statics.field1493.method1187();
        }
        if (Statics.field2136 != null) {
            Statics.field2136.method1187();
        }
        if (Statics.field2775 != null) {
            Statics.field2775.method2881();
        }
        Object var3 = class174.field2771;
        synchronized (class174.field2771) {
            if (class174.field2772 != 0) {
                class174.field2772 = 1;
                try {
                    class174.field2771.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class153.field2289.method3902();
            for (int var6 = 0; var6 < Statics.field2282; var6++) {
                Statics.field791[var6].method3902();
            }
            class153.field2288.method3902();
            class153.field2287.method3902();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ed.f(IB)V")
    public static void method2720(int arg0) {
        if (field289 == arg0) {
            return;
        }
        if (field289 == 0) {
            Statics.field1139 = null;
            Statics.field816 = null;
            Statics.field2126 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field523 = 0;
            field469 = 0;
            field402 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1260 != null) {
            Statics.field1260.method2881();
            Statics.field1260 = null;
        }
        if (field289 == 25) {
            field406 = 0;
            field336 = 0;
            field337 = 1;
            field338 = 0;
            field536 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method2120(Statics.field2094, Statics.field754, Statics.field1923, true, 0);
        } else if (arg0 == 20) {
            class34.method2120(Statics.field2094, Statics.field754, Statics.field1923, true, field289 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method2120(Statics.field2094, Statics.field754, Statics.field1923, false, 4);
        } else if (Statics.field1616) {
            Statics.field3277 = null;
            Statics.field722 = null;
            Statics.field723 = null;
            Statics.field884 = null;
            Statics.field196 = null;
            Statics.field2661 = null;
            Statics.field277 = null;
            Statics.field577 = null;
            Statics.field724 = null;
            Statics.field2323 = null;
            Statics.field1740 = null;
            Statics.field93 = null;
            Statics.field638 = null;
            Statics.field278 = null;
            Statics.field13 = null;
            Statics.field1735 = null;
            Statics.field1817 = null;
            Statics.field731 = null;
            Statics.field2099 = null;
            Statics.field660 = null;
            Statics.field271 = null;
            Statics.field1836 = null;
            class187.method740(2);
            class175.method551(true);
            Statics.field1616 = false;
        }
        field289 = arg0;
    }

    @ObfuscatedName("client.d(I)V")
    public void method245() {
        if (field289 == 1000) {
            return;
        }
        long var1 = class119.method698();
        int var3 = (int) (var1 - Statics.field2777);
        Statics.field2777 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2776 += var3;
        boolean var4;
        if (class175.field2794 == 0 && class175.field2786 == 0 && class175.field2787 == 0 && class175.field2795 == 0) {
            var4 = true;
        } else if (Statics.field2775 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2776 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2786 < 20 && class175.field2795 > 0) {
                        class176 var5 = (class176) class175.field2778.method3571();
                        class123 var6 = new class123(4);
                        var6.method2567(1);
                        var6.method2594((int) var5.field3174);
                        Statics.field2775.method2880(var6.field2056, 0, 4);
                        class175.field2780.method3569(var5, var5.field3174);
                        class175.field2795--;
                        class175.field2786++;
                    }
                    while (class175.field2794 < 20 && class175.field2787 > 0) {
                        class176 var7 = (class176) class175.field2784.method3658();
                        class123 var8 = new class123(4);
                        var8.method2567(0);
                        var8.method2594((int) var7.field3174);
                        Statics.field2775.method2880(var8.field2056, 0, 4);
                        var7.method3675();
                        class175.field2785.method3569(var7, var7.field3174);
                        class175.field2787--;
                        class175.field2794++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2775.method2878();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2776 = 0;
                        byte var11 = 0;
                        if (Statics.field1466 == null) {
                            var11 = 8;
                        } else if (class175.field2788 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2790.field2057;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2775.method2879(class175.field2790.field2056, class175.field2790.field2057, var12);
                            if (class175.field2791 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2790.field2056[class175.field2790.field2057 + var13] ^= class175.field2791;
                                }
                            }
                            class175.field2790.field2057 += var12;
                            if (class175.field2790.field2057 < var11) {
                                break;
                            }
                            if (Statics.field1466 == null) {
                                class175.field2790.field2057 = 0;
                                int var14 = class175.field2790.method2408();
                                int var15 = class175.field2790.method2403();
                                int var16 = class175.field2790.method2408();
                                int var17 = class175.field2790.method2413();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2780.method3580(var18);
                                Statics.field2012 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2785.method3580(var18);
                                    Statics.field2012 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1466 = var20;
                                Statics.field631 = new class123(var17 + var21 + Statics.field1466.field2802);
                                Statics.field631.method2567(var16);
                                Statics.field631.method2396(var17);
                                class175.field2788 = 8;
                                class175.field2790.field2057 = 0;
                            } else if (class175.field2788 == 0) {
                                if (class175.field2790.field2056[0] == -1) {
                                    class175.field2788 = 1;
                                    class175.field2790.field2057 = 0;
                                } else {
                                    Statics.field1466 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field631.field2056.length - Statics.field1466.field2802;
                            int var23 = 512 - class175.field2788;
                            if (var23 > var22 - Statics.field631.field2057) {
                                var23 = var22 - Statics.field631.field2057;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2775.method2879(Statics.field631.field2056, Statics.field631.field2057, var23);
                            if (class175.field2791 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field631.field2056[Statics.field631.field2057 + var24] ^= class175.field2791;
                                }
                            }
                            Statics.field631.field2057 += var23;
                            class175.field2788 += var23;
                            if (Statics.field631.field2057 == var22) {
                                if (Statics.field1466.field3174 == 16711935L) {
                                    Statics.field678 = Statics.field631;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2782[var25];
                                        if (var26 != null) {
                                            Statics.field678.field2057 = var25 * 8 + 5;
                                            int var27 = Statics.field678.method2413();
                                            int var28 = Statics.field678.method2413();
                                            var26.method3153(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2789.reset();
                                    class175.field2789.update(Statics.field631.field2056, 0, var22);
                                    int var29 = (int) class175.field2789.getValue();
                                    if (Statics.field1466.field2799 != var29) {
                                        try {
                                            Statics.field2775.method2881();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2792++;
                                        Statics.field2775 = null;
                                        class175.field2791 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2792 = 0;
                                    class175.field2793 = 0;
                                    Statics.field1466.field2798.method3154((int) (Statics.field1466.field3174 & 0xFFFFL), Statics.field631.field2056, (Statics.field1466.field3174 & 0xFF0000L) == 16711680L, Statics.field2012);
                                }
                                Statics.field1466.method3695();
                                if (Statics.field2012) {
                                    class175.field2786--;
                                } else {
                                    class175.field2794--;
                                }
                                class175.field2788 = 0;
                                Statics.field1466 = null;
                                Statics.field631 = null;
                            } else {
                                if (class175.field2788 != 512) {
                                    break;
                                }
                                class175.field2788 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2775.method2881();
                } catch (Exception var34) {
                }
                class175.field2793++;
                Statics.field2775 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method246();
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method246() {
        if (class175.field2792 >= 4) {
            this.method2911("js5crc");
            field289 = 1000;
            return;
        }
        if (class175.field2793 >= 4) {
            if (field289 <= 5) {
                this.method2911("js5io");
                field289 = 1000;
                return;
            }
            field403 = 3000;
            class175.field2793 = 3;
        }
        if (--field403 + 1 > 0) {
            return;
        }
        try {
            if (field310 == 0) {
                Statics.field255 = Statics.field2087.method2771(Statics.field1244, Statics.field318);
                field310++;
            }
            if (field310 == 1) {
                if (Statics.field255.field2267 == 2) {
                    this.method523(-1);
                    return;
                }
                if (Statics.field255.field2267 == 1) {
                    field310++;
                }
            }
            if (field310 == 2) {
                Statics.field1 = new class147((Socket) Statics.field255.field2271, Statics.field2087);
                class123 var1 = new class123(5);
                var1.method2567(15);
                var1.method2396(121);
                Statics.field1.method2880(var1.field2056, 0, 5);
                field310++;
                Statics.field781 = class119.method698();
            }
            if (field310 == 3) {
                if (field289 <= 5 || Statics.field1.method2878() > 0) {
                    int var2 = Statics.field1.method2877();
                    if (var2 != 0) {
                        this.method523(var2);
                        return;
                    }
                    field310++;
                } else if (class119.method698() - Statics.field781 > 30000L) {
                    this.method523(-2);
                    return;
                }
            }
            if (field310 == 4) {
                class175.method2996(Statics.field1, field289 > 20);
                Statics.field255 = null;
                Statics.field1 = null;
                field310 = 0;
                field453 = 0;
            }
        } catch (IOException var4) {
            this.method523(-3);
        }
    }

    @ObfuscatedName("client.q(IB)V")
    public void method523(int arg0) {
        Statics.field255 = null;
        Statics.field1 = null;
        field310 = 0;
        if (Statics.field921 == Statics.field318) {
            Statics.field318 = Statics.field208;
        } else {
            Statics.field318 = Statics.field921;
        }
        field453++;
        if (field453 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field289 <= 5) {
                this.method2911("js5connect_full");
                field289 = 1000;
            } else {
                field403 = 3000;
            }
        } else if (field453 >= 2 && arg0 == 6) {
            this.method2911("js5connect_outofdate");
            field289 = 1000;
        } else if (field453 >= 4) {
            if (field289 <= 5) {
                this.method2911("js5connect");
                field289 = 1000;
            } else {
                field403 = 3000;
            }
        }
    }

    @ObfuscatedName("ae.t(B)V")
    public static void method1024() {
        if (field309 == 0) {
            Statics.field123 = new class90(4, 104, 104, class6.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field341[var0] = new class112(104, 104);
            }
            Statics.field2206 = new class82(512, 512);
            class34.field739 = class161.field2385;
            class34.field738 = 5;
            field309 = 20;
        } else if (field309 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1640[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1860(var1, 500, 800, 512, 334);
            class34.field739 = class161.field2386;
            class34.field738 = 10;
            field309 = 30;
        } else if (field309 == 30) {
            Statics.field2301 = method938(0, false, true, true);
            Statics.field1586 = method938(1, false, true, true);
            Statics.field645 = method938(2, true, false, true);
            Statics.field780 = method938(3, false, true, true);
            Statics.field1112 = method938(4, false, true, true);
            Statics.field2166 = method938(5, true, true, true);
            Statics.field3109 = method938(6, true, true, false);
            Statics.field2018 = method938(7, false, true, true);
            Statics.field1923 = method938(8, false, true, true);
            Statics.field1146 = method938(9, false, true, true);
            Statics.field754 = method938(10, false, true, true);
            Statics.field2095 = method938(11, false, true, true);
            Statics.field3050 = method938(12, false, true, true);
            Statics.field312 = method938(13, true, false, true);
            Statics.field256 = method938(14, false, true, false);
            Statics.field585 = method938(15, false, true, true);
            class34.field739 = class161.field2445;
            class34.field738 = 20;
            field309 = 40;
        } else if (field309 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2301.method3152() * 4 / 100;
            int var8 = var7 + Statics.field1586.method3152() * 4 / 100;
            int var9 = var8 + Statics.field645.method3152() * 2 / 100;
            int var10 = var9 + Statics.field780.method3152() * 2 / 100;
            int var11 = var10 + Statics.field1112.method3152() * 6 / 100;
            int var12 = var11 + Statics.field2166.method3152() * 4 / 100;
            int var13 = var12 + Statics.field3109.method3152() * 2 / 100;
            int var14 = var13 + Statics.field2018.method3152() * 60 / 100;
            int var15 = var14 + Statics.field1923.method3152() * 2 / 100;
            int var16 = var15 + Statics.field1146.method3152() * 2 / 100;
            int var17 = var16 + Statics.field754.method3152() * 2 / 100;
            int var18 = var17 + Statics.field2095.method3152() * 2 / 100;
            int var19 = var18 + Statics.field3050.method3152() * 2 / 100;
            int var20 = var19 + Statics.field312.method3152() * 2 / 100;
            int var21 = var20 + Statics.field256.method3152() * 2 / 100;
            int var22 = var21 + Statics.field585.method3152() * 2 / 100;
            if (var22 == 100) {
                class34.field739 = class161.field2389;
                class34.field738 = 30;
                field309 = 45;
            } else {
                if (var22 != 0) {
                    class34.field739 = class161.field2388 + var22 + "%";
                }
                class34.field738 = 30;
            }
        } else if (field309 == 45) {
            class60.method572(22050, !field315, 2);
            class188 var23 = new class188();
            var23.method3407(9, 128);
            Statics.field1493 = class60.method653(Statics.field2087, Statics.field2094, 0, 22050);
            Statics.field1493.method1183(var23);
            class187.method3249(Statics.field585, Statics.field256, Statics.field1112, var23);
            Statics.field2136 = class60.method653(Statics.field2087, Statics.field2094, 1, 2048);
            Statics.field206 = new class59();
            Statics.field2136.method1183(Statics.field206);
            Statics.field2216 = new class78(22050, Statics.field1229);
            class34.field739 = class161.field2390;
            class34.field738 = 35;
            field309 = 50;
        } else if (field309 == 50) {
            int var24 = 0;
            if (Statics.field226 == null) {
                class172 var25 = Statics.field1923;
                class172 var26 = Statics.field312;
                int var27 = var25.method3148("p11_full");
                int var28 = var25.method3094(var27, "");
                class228 var29;
                if (class80.method744(var25, var27, var28)) {
                    var29 = class80.method2207(var26.method3079(var27, var28));
                } else {
                    var29 = null;
                }
                Statics.field226 = var29;
            } else {
                var24++;
            }
            if (Statics.field2348 == null) {
                class172 var31 = Statics.field1923;
                class172 var32 = Statics.field312;
                int var33 = var31.method3148("p12_full");
                int var34 = var31.method3094(var33, "");
                class228 var35;
                if (class80.method744(var31, var33, var34)) {
                    var35 = class80.method2207(var32.method3079(var33, var34));
                } else {
                    var35 = null;
                }
                Statics.field2348 = var35;
            } else {
                var24++;
            }
            if (Statics.field1681 == null) {
                class172 var37 = Statics.field1923;
                class172 var38 = Statics.field312;
                int var39 = var37.method3148("b12_full");
                int var40 = var37.method3094(var39, "");
                class228 var41;
                if (class80.method744(var37, var39, var40)) {
                    var41 = class80.method2207(var38.method3079(var39, var40));
                } else {
                    var41 = null;
                }
                Statics.field1681 = var41;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class34.field739 = class161.field2391 + var24 * 100 / 3 + "%";
                class34.field738 = 40;
            } else {
                Statics.field152 = new class164(true);
                class34.field739 = class161.field2392;
                class34.field738 = 40;
                field309 = 60;
            }
        } else if (field309 == 60) {
            int var43 = class34.method157(Statics.field754, Statics.field1923);
            byte var44 = 9;
            if (var43 < var44) {
                class34.field739 = class161.field2393 + var43 * 100 / var44 + "%";
                class34.field738 = 50;
            } else {
                class34.field739 = class161.field2394;
                class34.field738 = 50;
                method2720(5);
                field309 = 70;
            }
        } else if (field309 == 70) {
            if (Statics.field645.method3097()) {
                class49.method828(Statics.field645);
                class172 var46 = Statics.field645;
                Statics.field983 = var46;
                class47.method192(Statics.field645, Statics.field2018);
                class43.method1042(Statics.field645, Statics.field2018, field315);
                class172 var47 = Statics.field645;
                class172 var48 = Statics.field2018;
                Statics.field895 = var47;
                Statics.field886 = var48;
                class172 var49 = Statics.field645;
                class172 var50 = Statics.field2018;
                boolean var51 = field286;
                class228 var52 = Statics.field226;
                Statics.field1199 = var49;
                Statics.field170 = var50;
                Statics.field1190 = var51;
                Statics.field1143 = Statics.field1199.method3088(10);
                Statics.field677 = var52;
                class172 var53 = Statics.field645;
                class172 var54 = Statics.field2301;
                class172 var55 = Statics.field1586;
                Statics.field2968 = var53;
                Statics.field1004 = var54;
                Statics.field1009 = var55;
                class46.method1514(Statics.field645, Statics.field2018);
                class51.method2683(Statics.field645);
                class57.method984(Statics.field645);
                class177.method2755(Statics.field780, Statics.field2018, Statics.field1923, Statics.field312);
                class172 var56 = Statics.field645;
                Statics.field1151 = var56;
                class53.method550(Statics.field645);
                class48.method2360(Statics.field645);
                class54.method2204(Statics.field645);
                Statics.field139 = new class20();
                class172 var57 = Statics.field645;
                class172 var58 = Statics.field1923;
                class172 var59 = Statics.field312;
                Statics.field1111 = var57;
                Statics.field1097 = var58;
                Statics.field1105 = var59;
                class50.method712(Statics.field645, Statics.field1923);
                class34.field739 = class161.field2396;
                class34.field738 = 60;
                field309 = 80;
            } else {
                class34.field739 = class161.field2395 + Statics.field645.method3158() + "%";
                class34.field738 = 60;
            }
        } else if (field309 == 80) {
            int var60 = 0;
            if (Statics.field144 == null) {
                Statics.field144 = class80.method567(Statics.field1923, "compass", "");
            } else {
                var60++;
            }
            if (Statics.field1413 == null) {
                Statics.field1413 = class80.method567(Statics.field1923, "mapedge", "");
            } else {
                var60++;
            }
            if (Statics.field690 == null) {
                Statics.field690 = class80.method867(Statics.field1923, "mapscene", "");
            } else {
                var60++;
            }
            if (Statics.field141 == null) {
                Statics.field141 = class80.method125(Statics.field1923, "mapfunction", "");
            } else {
                var60++;
            }
            if (Statics.field136 == null) {
                Statics.field136 = class80.method125(Statics.field1923, "headicons_pk", "");
            } else {
                var60++;
            }
            if (Statics.field687 == null) {
                Statics.field687 = class80.method125(Statics.field1923, "headicons_prayer", "");
            } else {
                var60++;
            }
            if (Statics.field2233 == null) {
                Statics.field2233 = class80.method125(Statics.field1923, "headicons_hint", "");
            } else {
                var60++;
            }
            if (Statics.field943 == null) {
                Statics.field943 = class80.method125(Statics.field1923, "mapmarker", "");
            } else {
                var60++;
            }
            if (Statics.field632 == null) {
                Statics.field632 = class80.method125(Statics.field1923, "cross", "");
            } else {
                var60++;
            }
            if (Statics.field451 == null) {
                Statics.field451 = class80.method125(Statics.field1923, "mapdots", "");
            } else {
                var60++;
            }
            if (Statics.field2293 == null) {
                Statics.field2293 = class80.method867(Statics.field1923, "scrollbar", "");
            } else {
                var60++;
            }
            if (Statics.field359 == null) {
                Statics.field359 = class80.method867(Statics.field1923, "mod_icons", "");
            } else {
                var60++;
            }
            if (var60 < 12) {
                class34.field739 = class161.field2397 + var60 * 100 / 12 + "%";
                class34.field738 = 70;
            } else {
                Statics.field3244 = Statics.field359;
                Statics.field1413.method1693();
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 41.0D) - 20;
                for (int var65 = 0; var65 < Statics.field141.length; var65++) {
                    Statics.field141[var65].method1628(var61 + var64, var62 + var64, var63 + var64);
                }
                Statics.field690[0].method1797(var61 + var64, var62 + var64, var63 + var64);
                class34.field739 = class161.field2398;
                class34.field738 = 70;
                field309 = 90;
            }
        } else if (field309 == 90) {
            if (Statics.field1146.method3097()) {
                class99 var66 = new class99(Statics.field1146, Statics.field1923, 20, 0.8D, field315 ? 64 : 128);
                class95.method2012(var66);
                class95.method2013(0.8D);
                class34.field739 = class161.field2496;
                class34.field738 = 90;
                field309 = 110;
            } else {
                class34.field739 = class161.field2387 + Statics.field1146.method3158() + "%";
                class34.field738 = 90;
            }
        } else if (field309 == 110) {
            Statics.field1476 = new class14();
            Statics.field2087.method2772(Statics.field1476, 10);
            class34.field739 = class161.field2489;
            class34.field738 = 94;
            field309 = 120;
        } else if (field309 == 120) {
            if (Statics.field754.method3083("huffman", "")) {
                class117 var67 = new class117(Statics.field754.method3085("huffman", ""));
                Statics.field3233 = var67;
                class34.field739 = class161.field2372;
                class34.field738 = 96;
                field309 = 130;
            } else {
                class34.field739 = class161.field2402 + "%";
                class34.field738 = 96;
            }
        } else if (field309 == 130) {
            if (!Statics.field780.method3097()) {
                class34.field739 = class161.field2401 + Statics.field780.method3158() * 4 / 5 + "%";
                class34.field738 = 100;
            } else if (!Statics.field3050.method3097()) {
                class34.field739 = class161.field2401 + (80 + Statics.field3050.method3158() / 6) + "%";
                class34.field738 = 100;
            } else if (Statics.field312.method3097()) {
                class34.field739 = class161.field2405;
                class34.field738 = 100;
                field309 = 140;
            } else {
                class34.field739 = class161.field2401 + (96 + Statics.field312.method3158() / 20) + "%";
                class34.field738 = 100;
            }
        } else if (field309 == 140) {
            method2720(10);
        }
    }

    @ObfuscatedName("av.g(IZZZB)Lfw;")
    public static class172 method938(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2289 != null) {
            var4 = new class138(arg0, class153.field2289, Statics.field791[arg0], 1000000);
        }
        return new class172(var4, Statics.field1502, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ds.s(I)V")
    public static final void method2696() {
        try {
            if (field523 == 0) {
                if (Statics.field695 != null) {
                    Statics.field695.method2881();
                    Statics.field695 = null;
                }
                Statics.field1837 = null;
                field349 = false;
                field469 = 0;
                field523 = 1;
            }
            if (field523 == 1) {
                if (Statics.field1837 == null) {
                    Statics.field1837 = Statics.field2087.method2771(Statics.field1244, Statics.field318);
                }
                if (Statics.field1837.field2267 == 2) {
                    throw new IOException();
                }
                if (Statics.field1837.field2267 == 1) {
                    Statics.field695 = new class147((Socket) Statics.field1837.field2271, Statics.field2087);
                    Statics.field1837 = null;
                    field523 = 2;
                }
            }
            if (field523 == 2) {
                field324.field2057 = 0;
                field324.method2567(14);
                Statics.field695.method2880(field324.field2056, 0, 1);
                field447.field2057 = 0;
                field523 = 3;
            }
            if (field523 == 3) {
                if (Statics.field1493 != null) {
                    Statics.field1493.method1243();
                }
                if (Statics.field2136 != null) {
                    Statics.field2136.method1243();
                }
                int var0 = Statics.field695.method2877();
                if (Statics.field1493 != null) {
                    Statics.field1493.method1243();
                }
                if (Statics.field2136 != null) {
                    Statics.field2136.method1243();
                }
                if (var0 != 0) {
                    method2296(var0);
                    return;
                }
                field447.field2057 = 0;
                field523 = 5;
            }
            if (field523 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field324.field2057 = 0;
                field324.method2567(1);
                field324.method2567(class34.field747.method543());
                field324.method2396(var1[0]);
                field324.method2396(var1[1]);
                field324.method2396(var1[2]);
                field324.method2396(var1[3]);
                switch(class34.field747.field2665) {
                    case 0:
                    case 3:
                        field324.method2594(Statics.field2363);
                        field324.field2057 += 5;
                        break;
                    case 1:
                        field324.field2057 += 8;
                        break;
                    case 2:
                        field324.method2396((Integer) Statics.field2660.field138.get(class167.method573(class34.field745)));
                        field324.field2057 += 4;
                }
                field324.method2468(class34.field734);
                field324.method2429(class5.field61, class5.field62);
                field325.field2057 = 0;
                if (field289 == 40) {
                    field325.method2567(18);
                } else {
                    field325.method2567(16);
                }
                field325.method2394(0);
                int var2 = field325.field2057;
                field325.method2396(121);
                field325.method2402(field324.field2056, 0, field324.field2057);
                int var3 = field325.field2057;
                field325.method2468(class34.field745);
                field325.method2567((field494 ? 1 : 0) << 1 | (field315 ? 1 : 0));
                field325.method2394(Statics.field1500);
                field325.method2394(Statics.field3176);
                class126 var4 = field325;
                byte[] var5 = new byte[24];
                try {
                    class153.field2287.method3903(0L);
                    class153.field2287.method3905(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var44) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2402(var5, 0, 24);
                field325.method2468(Statics.field879);
                field325.method2396(Statics.field1939);
                class123 var9 = new class123(Statics.field152.method3003());
                Statics.field152.method3009(var9);
                field325.method2402(var9.field2056, 0, var9.field2056.length);
                field325.method2567(Statics.field1068);
                field325.method2396(Statics.field2301.field2743);
                field325.method2396(Statics.field1586.field2743);
                field325.method2396(Statics.field645.field2743);
                field325.method2396(Statics.field780.field2743);
                field325.method2396(Statics.field1112.field2743);
                field325.method2396(Statics.field2166.field2743);
                field325.method2396(Statics.field3109.field2743);
                field325.method2396(Statics.field2018.field2743);
                field325.method2396(Statics.field1923.field2743);
                field325.method2396(Statics.field1146.field2743);
                field325.method2396(Statics.field754.field2743);
                field325.method2396(Statics.field2095.field2743);
                field325.method2396(Statics.field3050.field2743);
                field325.method2396(Statics.field312.field2743);
                field325.method2396(Statics.field256.field2743);
                field325.method2396(Statics.field585.field2743);
                field325.method2411(var1, var3, field325.field2057);
                field325.method2404(field325.field2057 - var2);
                Statics.field695.method2880(field325.field2056, 0, field325.field2057);
                field324.method2669(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field447.method2669(var1);
                field523 = 6;
            }
            if (field523 == 6 && Statics.field695.method2878() > 0) {
                int var11 = Statics.field695.method2877();
                if (var11 == 21 && field289 == 20) {
                    field523 = 7;
                } else if (var11 == 2) {
                    field523 = 9;
                } else if (var11 == 15 && field289 == 40) {
                    field327 = -1;
                    field523 = 13;
                } else if (var11 == 23 && field402 < 1) {
                    field402++;
                    field523 = 0;
                } else if (var11 == 29) {
                    field523 = 11;
                } else {
                    method2296(var11);
                    return;
                }
            }
            if (field523 == 7 && Statics.field695.method2878() > 0) {
                field317 = (Statics.field695.method2877() + 3) * 60;
                field523 = 8;
            }
            if (field523 == 8) {
                field469 = 0;
                class34.method539(class161.field2409, class161.field2608, field317 / 60 + class161.field2411);
                if (--field317 <= 0) {
                    field523 = 0;
                }
            } else {
                if (field523 == 9 && Statics.field695.method2878() >= 13) {
                    boolean var12 = Statics.field695.method2877() == 1;
                    Statics.field695.method2879(field447.field2056, 0, 4);
                    field447.field2057 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field447.method2671() << 24;
                        int var15 = var14 | field447.method2671() << 16;
                        int var16 = var15 | field447.method2671() << 8;
                        int var17 = var16 | field447.method2671();
                        int var18 = class167.method573(class34.field745);
                        if (Statics.field2660.field138.size() >= 10 && !Statics.field2660.field138.containsKey(var18)) {
                            Iterator var19 = Statics.field2660.field138.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2660.field138.put(var18, var17);
                        class9.method81();
                    }
                    field313 = Statics.field695.method2877();
                    field449 = Statics.field695.method2877() == 1;
                    field404 = Statics.field695.method2877();
                    field404 <<= 0x8;
                    field404 += Statics.field695.method2877();
                    field564 = Statics.field695.method2877();
                    Statics.field695.method2879(field447.field2056, 0, 1);
                    field447.field2057 = 0;
                    field328 = field447.method2671();
                    Statics.field695.method2879(field447.field2056, 0, 2);
                    field447.field2057 = 0;
                    field327 = field447.method2403();
                    try {
                        client var20 = Statics.field378;
                        JSObject.getWindow(var20).call("zap", (Object[]) null);
                    } catch (Throwable var43) {
                    }
                    field523 = 10;
                }
                if (field523 != 10) {
                    if (field523 == 11 && Statics.field695.method2878() >= 2) {
                        field447.field2057 = 0;
                        Statics.field695.method2879(field447.field2056, 0, 2);
                        field447.field2057 = 0;
                        Statics.field1816 = field447.method2403();
                        field523 = 12;
                    }
                    if (field523 == 12 && Statics.field695.method2878() >= Statics.field1816) {
                        field447.field2057 = 0;
                        Statics.field695.method2879(field447.field2056, 0, Statics.field1816);
                        field447.field2057 = 0;
                        String var34 = field447.method2626();
                        String var35 = field447.method2626();
                        String var36 = field447.method2626();
                        class34.method539(var34, var35, var36);
                        method2720(10);
                    }
                    if (field523 == 13) {
                        if (field327 == -1) {
                            if (Statics.field695.method2878() < 2) {
                                return;
                            }
                            Statics.field695.method2879(field447.field2056, 0, 2);
                            field447.field2057 = 0;
                            field327 = field447.method2403();
                        }
                        if (Statics.field695.method2878() >= field327) {
                            Statics.field695.method2879(field447.field2056, 0, field327);
                            field447.field2057 = 0;
                            int var37 = field327;
                            field324.field2057 = 0;
                            field447.field2057 = 0;
                            field328 = -1;
                            field331 = -1;
                            field397 = -1;
                            field333 = -1;
                            field327 = 0;
                            field329 = 0;
                            field298 = 0;
                            field422 = 0;
                            field421 = false;
                            field516 = 0;
                            field302 = 0;
                            for (int var38 = 0; var38 < 2048; var38++) {
                                field510[var38] = null;
                            }
                            Statics.field1067 = null;
                            for (int var39 = 0; var39 < field319.length; var39++) {
                                class37 var40 = field319[var39];
                                if (var40 != null) {
                                    var40.field844 = -1;
                                    var40.field845 = false;
                                }
                            }
                            class16.field229 = new class200(32);
                            method2720(30);
                            for (int var41 = 0; var41 < 100; var41++) {
                                field485[var41] = true;
                            }
                            method3751();
                            class35.method2111(field447);
                            if (field447.field2057 != var37) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field469++;
                        if (field469 > 2000) {
                            if (field402 < 1) {
                                if (Statics.field921 == Statics.field318) {
                                    Statics.field318 = Statics.field208;
                                } else {
                                    Statics.field318 = Statics.field921;
                                }
                                field402++;
                                field523 = 0;
                            } else {
                                method2296(-3);
                            }
                        }
                    }
                } else if (Statics.field695.method2878() >= field327) {
                    field447.field2057 = 0;
                    Statics.field695.method2879(field447.field2056, 0, field327);
                    field292 = 1L;
                    field295 = -1;
                    Statics.field1476.field201 = 0;
                    Statics.field2992 = true;
                    field296 = true;
                    field506 = -1L;
                    class215.field3188 = new class206();
                    field324.field2057 = 0;
                    field447.field2057 = 0;
                    field328 = -1;
                    field331 = -1;
                    field397 = -1;
                    field333 = -1;
                    field329 = 0;
                    field298 = 0;
                    field441 = 0;
                    field526 = 0;
                    field422 = 0;
                    field421 = false;
                    class144.method2721(0);
                    class12.method13();
                    field433 = 0;
                    field405 = false;
                    field522 = 0;
                    field345 = (int) (Math.random() * 100.0D) - 50;
                    field347 = (int) (Math.random() * 110.0D) - 55;
                    field491 = (int) (Math.random() * 80.0D) - 40;
                    field352 = (int) (Math.random() * 120.0D) - 60;
                    field354 = (int) (Math.random() * 30.0D) - 20;
                    field367 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field516 = 0;
                    field436 = -1;
                    field302 = 0;
                    field515 = 0;
                    field416 = class22.field578;
                    field308 = class22.field578;
                    field320 = 0;
                    class35.field761 = 0;
                    for (int var22 = 0; var22 < 2048; var22++) {
                        class35.field760[var22] = null;
                        class35.field759[var22] = 1;
                    }
                    for (int var23 = 0; var23 < 2048; var23++) {
                        field510[var23] = null;
                    }
                    for (int var24 = 0; var24 < 32768; var24++) {
                        field319[var24] = null;
                    }
                    field412 = -1;
                    field415.method3605();
                    field358.method3605();
                    for (int var25 = 0; var25 < 4; var25++) {
                        for (int var26 = 0; var26 < 104; var26++) {
                            for (int var27 = 0; var27 < 104; var27++) {
                                field413[var25][var26][var27] = null;
                            }
                        }
                    }
                    field414 = new class203();
                    field503 = 0;
                    field532 = 0;
                    field552 = 0;
                    for (int var28 = 0; var28 < Statics.field584; var28++) {
                        class57 var29 = class57.method699(var28);
                        if (var29 != null) {
                            class180.field2959[var28] = 0;
                            class180.field2960[var28] = 0;
                        }
                    }
                    Statics.field139.method198();
                    field448 = -1;
                    if (field559 != -1) {
                        class177.method2997(field559);
                    }
                    for (class4 var30 = (class4) field407.method3571(); var30 != null; var30 = (class4) field407.method3572()) {
                        method1282(var30, true);
                    }
                    field559 = -1;
                    field407 = new class200(8);
                    field444 = null;
                    field421 = false;
                    field422 = 0;
                    field554.method3296((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var31 = 0; var31 < 8; var31++) {
                        field409[var31] = null;
                        field410[var31] = false;
                    }
                    class16.field229 = new class200(32);
                    field290 = true;
                    for (int var32 = 0; var32 < 100; var32++) {
                        field485[var32] = true;
                    }
                    method3751();
                    field542 = null;
                    Statics.field26 = 0;
                    Statics.field200 = null;
                    for (int var33 = 0; var33 < 8; var33++) {
                        field557[var33] = new class224();
                    }
                    Statics.field56 = null;
                    class35.method2111(field447);
                    Statics.field1790 = -1;
                    method152(false);
                    field328 = -1;
                }
            }
        } catch (IOException var45) {
            if (field402 < 1) {
                if (Statics.field921 == Statics.field318) {
                    Statics.field318 = Statics.field208;
                } else {
                    Statics.field318 = Statics.field921;
                }
                field402++;
                field523 = 0;
            } else {
                method2296(-2);
            }
        }
    }

    @ObfuscatedName("dw.h(IB)V")
    public static void method2296(int arg0) {
        if (arg0 == -3) {
            class34.method539(class161.field2412, class161.field2569, class161.field2414);
        } else if (arg0 == -2) {
            class34.method539(class161.field2415, class161.field2416, class161.field2524);
        } else if (arg0 == -1) {
            class34.method539(class161.field2418, class161.field2419, class161.field2512);
        } else if (arg0 == 3) {
            class34.field721 = 3;
        } else if (arg0 == 4) {
            class34.method539(class161.field2421, class161.field2422, class161.field2423);
        } else if (arg0 == 5) {
            class34.method539(class161.field2384, class161.field2449, class161.field2426);
        } else if (arg0 == 6) {
            class34.method539(class161.field2427, class161.field2583, class161.field2604);
        } else if (arg0 == 7) {
            class34.method539(class161.field2430, class161.field2431, class161.field2432);
        } else if (arg0 == 8) {
            class34.method539(class161.field2400, class161.field2425, class161.field2435);
        } else if (arg0 == 9) {
            class34.method539(class161.field2375, class161.field2437, class161.field2438);
        } else if (arg0 == 10) {
            class34.method539(class161.field2420, class161.field2549, class161.field2441);
        } else if (arg0 == 11) {
            class34.method539(class161.field2490, class161.field2443, class161.field2444);
        } else if (arg0 == 12) {
            class34.method539(class161.field2613, class161.field2640, class161.field2447);
        } else if (arg0 == 13) {
            class34.method539(class161.field2448, class161.field2516, class161.field2450);
        } else if (arg0 == 14) {
            class34.method539(class161.field2451, class161.field2452, class161.field2453);
        } else if (arg0 == 16) {
            class34.method539(class161.field2454, class161.field2455, class161.field2631);
        } else if (arg0 == 17) {
            class34.method539(class161.field2457, class161.field2458, class161.field2603);
        } else if (arg0 == 18) {
            class34.method539(class161.field2467, class161.field2491, class161.field2462);
        } else if (arg0 == 19) {
            class34.method539(class161.field2499, class161.field2373, class161.field2465);
        } else if (arg0 == 20) {
            class34.method539(class161.field2466, class161.field2635, class161.field2468);
        } else if (arg0 == 22) {
            class34.method539(class161.field2469, class161.field2589, class161.field2471);
        } else if (arg0 == 23) {
            class34.method539(class161.field2472, class161.field2473, class161.field2474);
        } else if (arg0 == 24) {
            class34.method539(class161.field2515, class161.field2476, class161.field2536);
        } else if (arg0 == 25) {
            class34.method539(class161.field2478, class161.field2479, class161.field2480);
        } else if (arg0 == 26) {
            class34.method539(class161.field2380, class161.field2482, class161.field2483);
        } else if (arg0 == 27) {
            class34.method539(class161.field2540, class161.field2485, class161.field2486);
        } else if (arg0 == 31) {
            class34.method539(class161.field2493, class161.field2597, class161.field2495);
        } else if (arg0 == 32) {
            class34.method539(class161.field2456, class161.field2497, class161.field2498);
        } else if (arg0 == 37) {
            class34.method539(class161.field2556, class161.field2500, class161.field2439);
        } else if (arg0 == 38) {
            class34.method539(class161.field2505, class161.field2503, class161.field2504);
        } else if (arg0 == 55) {
            class34.method539(class161.field2481, class161.field2506, class161.field2558);
        } else if (arg0 == 56) {
            class34.method539(class161.field2508, class161.field2376, class161.field2510);
            method2720(11);
            return;
        } else if (arg0 == 57) {
            class34.method539(class161.field2511, class161.field2616, class161.field2513);
            method2720(11);
            return;
        } else {
            class34.method539(class161.field2514, class161.field2428, class161.field2545);
        }
        method2720(10);
    }

    @ObfuscatedName("eh.u(I)V")
    public static final void method2872() {
        if (Statics.field695 != null) {
            Statics.field695.method2881();
            Statics.field695 = null;
        }
        method221();
        Statics.field123.method1825();
        for (int var0 = 0; var0 < 4; var0++) {
            field341[var0].method2298();
        }
        System.gc();
        class187.method740(2);
        field518 = -1;
        field519 = false;
        for (class25 var1 = (class25) class25.field605.method3600(); var1 != null; var1 = (class25) class25.field605.method3602()) {
            if (var1.field611 != null) {
                Statics.field206.method1149(var1.field611);
                var1.field611 = null;
            }
            if (var1.field616 != null) {
                Statics.field206.method1149(var1.field616);
                var1.field616 = null;
            }
        }
        class25.field605.method3605();
        method2720(10);
    }

    @ObfuscatedName("e.a(B)V")
    public static final void method221() {
        class49.field1054.method3534();
        class44.field979.method3534();
        class47.field1036.method3534();
        class43.method546();
        class42.field887.method3534();
        class42.field922.method3534();
        class56.method2359();
        class45.method2313();
        class46.field1016.method3534();
        class46.field1030.method3534();
        class51.field1090.method3534();
        class57.method917();
        class52.field1098.method3534();
        class52.field1100.method3534();
        class52.field1101.method3534();
        class50.method1133();
        class183.method2814();
        class177.method622();
        ((class99) Statics.field1637).method2101();
        class24.field593.method3534();
        Statics.field2301.method3091();
        Statics.field1586.method3091();
        Statics.field780.method3091();
        Statics.field1112.method3091();
        Statics.field2166.method3091();
        Statics.field3109.method3091();
        Statics.field2018.method3091();
        Statics.field1923.method3091();
        Statics.field1146.method3091();
        Statics.field754.method3091();
        Statics.field2095.method3091();
        Statics.field3050.method3091();
    }

    @ObfuscatedName("cn.e(I)V")
    public static final void method2004() {
        if (Statics.field2136 != null) {
            Statics.field2136.method1184();
        }
        if (Statics.field1493 != null) {
            Statics.field1493.method1184();
        }
    }

    @ObfuscatedName("aq.c(Lak;IIIB)V")
    public static void method646(class45 arg0, int arg1, int arg2, int arg3) {
        if (field522 >= 50 || field521 == 0 || arg0.field1001 == null || arg1 >= arg0.field1001.length) {
            return;
        }
        int var4 = arg0.field1001[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field326[field522] = var5;
        field524[field522] = var6;
        field287[field522] = 0;
        field527[field522] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field435[field522] = (var8 << 16) + (var9 << 8) + var7;
        field522++;
    }

    @ObfuscatedName("d.n(IIII)V")
    public static void method123(int arg0, int arg1, int arg2) {
        if (field520 == 0 || arg1 == 0 || field522 >= 50) {
            return;
        }
        field326[field522] = arg0;
        field524[field522] = arg1;
        field287[field522] = arg2;
        field527[field522] = null;
        field435[field522] = 0;
        field522++;
    }

    @ObfuscatedName("as.y(Lfj;III)V")
    public static final void method633(class177 arg0, int arg1, int arg2) {
        if (field516 != 0 && field516 != 3 || class144.field2199 != 1 && Statics.field2118 || class144.field2199 != 4) {
            return;
        }
        class179 var3 = arg0.method3231(true);
        if (var3 == null) {
            return;
        }
        int var4 = class144.field2212 - arg1;
        int var5 = class144.field2214 - arg2;
        if (!var3.method3255(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2954 / 2;
        int var7 = var5 - var3.field2953 / 2;
        int var8 = field367 + field352 & 0x7FF;
        int var9 = class95.field1640[var8];
        int var10 = class95.field1641[var8];
        int var11 = (field354 + 256) * var9 >> 8;
        int var12 = (field354 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1067.field852 + var13 >> 7;
        int var16 = Statics.field1067.field869 - var14 >> 7;
        field324.method2670(23);
        field324.method2567(18);
        field324.method2513(Statics.field2366 + var16);
        field324.method2513(Statics.field676 + var15);
        field324.method2567(class141.field2168[82] ? (class141.field2168[81] ? 2 : 1) : 0);
        field324.method2567(var6);
        field324.method2567(var7);
        field324.method2394(field367);
        field324.method2567(57);
        field324.method2567(field352);
        field324.method2567(field354);
        field324.method2567(89);
        field324.method2394(Statics.field1067.field852);
        field324.method2394(Statics.field1067.field869);
        field324.method2567(63);
        field302 = var15;
        field515 = var16;
    }

    @ObfuscatedName("ds.k(B)V")
    public static final void method2694() {
        int[] var0 = class35.field756;
        for (int var1 = 0; var1 < class35.field761; var1++) {
            class3 var2 = field510[var0[var1]];
            if (var2 != null && var2.field839 > 0) {
                var2.field839--;
                if (var2.field839 == 0) {
                    var2.field867 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field320; var3++) {
            int var4 = field321[var3];
            class37 var5 = field319[var4];
            if (var5 != null && var5.field839 > 0) {
                var5.field839--;
                if (var5.field839 == 0) {
                    var5.field867 = null;
                }
            }
        }
    }

    @ObfuscatedName("h.w(B)V")
    public static final void method183() {
        int var0 = field345 + Statics.field1067.field852;
        int var1 = field347 + Statics.field1067.field869;
        if (Statics.field1965 - var0 < -500 || Statics.field1965 - var0 > 500 || Statics.field2702 - var1 < -500 || Statics.field2702 - var1 > 500) {
            Statics.field1965 = var0;
            Statics.field2702 = var1;
        }
        if (Statics.field1965 != var0) {
            Statics.field1965 += (var0 - Statics.field1965) / 16;
        }
        if (Statics.field2702 != var1) {
            Statics.field2702 += (var1 - Statics.field2702) / 16;
        }
        if (class144.field2204 == 4 && Statics.field2118) {
            int var2 = class144.field2211 * -117362325 - field307;
            field369 = var2 * 2;
            field307 = var2 == -1 || var2 == 1 ? class144.field2211 * -117362325 : (field307 + class144.field2211 * -117362325) / 2;
            int var3 = field370 - class144.field2205;
            field368 = var3 * 2;
            field370 = var3 == -1 || var3 == 1 ? class144.field2205 : (field370 + class144.field2205) / 2;
        } else {
            if (class141.field2168[96]) {
                field368 += (-24 - field368) / 2;
            } else if (class141.field2168[97]) {
                field368 += (24 - field368) / 2;
            } else {
                field368 /= 2;
            }
            if (class141.field2168[98]) {
                field369 += (12 - field369) / 2;
            } else if (class141.field2168[99]) {
                field369 += (-12 - field369) / 2;
            } else {
                field369 /= 2;
            }
            field307 = class144.field2211 * -117362325;
            field370 = class144.field2205;
        }
        field367 = field368 / 2 + field367 & 0x7FF;
        field366 += field369 / 2;
        if (field366 < 128) {
            field366 = 128;
        }
        if (field366 > 383) {
            field366 = 383;
        }
        int var4 = Statics.field1965 >> 7;
        int var5 = Statics.field2702 >> 7;
        int var6 = method905(Statics.field1965, Statics.field2702, Statics.field1819);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1819;
                    if (var10 < 3 && (class6.field72[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field94[var10][var8][var9];
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
        if (var12 > field375) {
            field375 += (var12 - field375) / 24;
        } else if (var12 < field375) {
            field375 += (var12 - field375) / 80;
        }
    }

    @ObfuscatedName("ad.o(I)V")
    public static final void method741() {
        for (int var0 = 0; var0 < field320; var0++) {
            int var1 = field321[var0];
            class37 var2 = field319[var1];
            if (var2 != null) {
                method5(var2, var2.field793.field903);
            }
        }
    }

    @ObfuscatedName("x.ah(Lay;II)V")
    public static final void method5(class40 arg0, int arg1) {
        if (arg0.field864 > field291) {
            int var2 = arg0.field864 - field291;
            int var3 = arg0.field824 * 128 + arg0.field822 * 64;
            int var4 = arg0.field862 * 128 + arg0.field822 * 64;
            arg0.field852 += (var3 - arg0.field852) / var2;
            arg0.field869 += (var4 - arg0.field869) / var2;
            arg0.field876 = 0;
            arg0.field836 = arg0.field866;
        } else if (arg0.field865 >= field291) {
            if (field291 == arg0.field865 || arg0.field850 == -1 || arg0.field832 != 0 || arg0.field843 + 1 > class45.method2337(arg0.field850).field1000[arg0.field851]) {
                int var5 = arg0.field865 - arg0.field864;
                int var6 = field291 - arg0.field864;
                int var7 = arg0.field824 * 128 + arg0.field822 * 64;
                int var8 = arg0.field862 * 128 + arg0.field822 * 64;
                int var9 = arg0.field861 * 128 + arg0.field822 * 64;
                int var10 = arg0.field875 * 128 + arg0.field822 * 64;
                arg0.field852 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field869 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field876 = 0;
            arg0.field836 = arg0.field866;
            arg0.field820 = arg0.field836;
        } else {
            method142(arg0);
        }
        if (arg0.field852 < 128 || arg0.field869 < 128 || arg0.field852 >= 13184 || arg0.field869 >= 13184) {
            arg0.field850 = -1;
            arg0.field855 = -1;
            arg0.field864 = 0;
            arg0.field865 = 0;
            arg0.field852 = arg0.field873[0] * 128 + arg0.field822 * 64;
            arg0.field869 = arg0.field874[0] * 128 + arg0.field822 * 64;
            arg0.method724();
        }
        if (Statics.field1067 == arg0 && (arg0.field852 < 1536 || arg0.field869 < 1536 || arg0.field852 >= 11776 || arg0.field869 >= 11776)) {
            arg0.field850 = -1;
            arg0.field855 = -1;
            arg0.field864 = 0;
            arg0.field865 = 0;
            arg0.field852 = arg0.field873[0] * 128 + arg0.field822 * 64;
            arg0.field869 = arg0.field874[0] * 128 + arg0.field822 * 64;
            arg0.method724();
        }
        method639(arg0);
        arg0.field821 = false;
        if (arg0.field847 != -1) {
            class45 var11 = class45.method2337(arg0.field847);
            if (var11 == null || var11.field1002 == null) {
                arg0.field847 = -1;
            } else {
                arg0.field849++;
                if (arg0.field848 < var11.field1002.length && arg0.field849 > var11.field1000[arg0.field848]) {
                    arg0.field849 = 1;
                    arg0.field848++;
                    method646(var11, arg0.field848, arg0.field852, arg0.field869);
                }
                if (arg0.field848 >= var11.field1002.length) {
                    arg0.field849 = 0;
                    arg0.field848 = 0;
                    method646(var11, arg0.field848, arg0.field852, arg0.field869);
                }
            }
        }
        if (arg0.field855 != -1 && field291 >= arg0.field858) {
            if (arg0.field856 < 0) {
                arg0.field856 = 0;
            }
            int var12 = class46.method1823(arg0.field855).field1018;
            if (var12 == -1) {
                arg0.field855 = -1;
            } else {
                class45 var13 = class45.method2337(var12);
                if (var13 == null || var13.field1002 == null) {
                    arg0.field855 = -1;
                } else {
                    arg0.field857++;
                    if (arg0.field856 < var13.field1002.length && arg0.field857 > var13.field1000[arg0.field856]) {
                        arg0.field857 = 1;
                        arg0.field856++;
                        method646(var13, arg0.field856, arg0.field852, arg0.field869);
                    }
                    if (arg0.field856 >= var13.field1002.length && (arg0.field856 < 0 || arg0.field856 >= var13.field1002.length)) {
                        arg0.field855 = -1;
                    }
                }
            }
        }
        if (arg0.field850 != -1 && arg0.field832 <= 1) {
            class45 var14 = class45.method2337(arg0.field850);
            if (var14.field998 == 1 && arg0.field823 > 0 && arg0.field864 <= field291 && arg0.field865 < field291) {
                arg0.field832 = 1;
                return;
            }
        }
        if (arg0.field850 != -1 && arg0.field832 == 0) {
            class45 var15 = class45.method2337(arg0.field850);
            if (var15 == null || var15.field1002 == null) {
                arg0.field850 = -1;
            } else {
                arg0.field843++;
                if (arg0.field851 < var15.field1002.length && arg0.field843 > var15.field1000[arg0.field851]) {
                    arg0.field843 = 1;
                    arg0.field851++;
                    method646(var15, arg0.field851, arg0.field852, arg0.field869);
                }
                if (arg0.field851 >= var15.field1002.length) {
                    arg0.field851 -= var15.field1003;
                    arg0.field854++;
                    if (arg0.field854 >= var15.field1008) {
                        arg0.field850 = -1;
                    } else if (arg0.field851 >= 0 && arg0.field851 < var15.field1002.length) {
                        method646(var15, arg0.field851, arg0.field852, arg0.field869);
                    } else {
                        arg0.field850 = -1;
                    }
                }
                arg0.field821 = var15.field1007;
            }
        }
        if (arg0.field832 > 0) {
            arg0.field832--;
        }
    }

    @ObfuscatedName("v.an(Lay;I)V")
    public static final void method142(class40 arg0) {
        arg0.field847 = arg0.field818;
        if (arg0.field872 == 0) {
            arg0.field876 = 0;
            return;
        }
        if (arg0.field850 != -1 && arg0.field832 == 0) {
            class45 var1 = class45.method2337(arg0.field850);
            if (arg0.field823 > 0 && var1.field998 == 0) {
                arg0.field876++;
                return;
            }
            if (arg0.field823 <= 0 && var1.field1010 == 0) {
                arg0.field876++;
                return;
            }
        }
        int var2 = arg0.field852;
        int var3 = arg0.field869;
        int var4 = arg0.field873[arg0.field872 - 1] * 128 + arg0.field822 * 64;
        int var5 = arg0.field874[arg0.field872 - 1] * 128 + arg0.field822 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field836 = 1280;
            } else if (var3 > var5) {
                arg0.field836 = 1792;
            } else {
                arg0.field836 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field836 = 768;
            } else if (var3 > var5) {
                arg0.field836 = 256;
            } else {
                arg0.field836 = 512;
            }
        } else if (var3 < var5) {
            arg0.field836 = 1024;
        } else if (var3 > var5) {
            arg0.field836 = 0;
        }
        byte var6 = arg0.field831[arg0.field872 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field852 = var4;
            arg0.field869 = var5;
            arg0.field872--;
            if (arg0.field823 > 0) {
                arg0.field823--;
            }
            return;
        }
        int var7 = arg0.field836 - arg0.field820 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field827;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field826;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field870;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field828;
        }
        if (var8 == -1) {
            var8 = arg0.field826;
        }
        arg0.field847 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field793.field919;
        }
        if (var10) {
            if (arg0.field836 != arg0.field820 && arg0.field844 == -1 && arg0.field871 != 0) {
                var9 = 2;
            }
            if (arg0.field872 > 2) {
                var9 = 6;
            }
            if (arg0.field872 > 3) {
                var9 = 8;
            }
            if (arg0.field876 > 0 && arg0.field872 > 1) {
                var9 = 8;
                arg0.field876--;
            }
        } else {
            if (arg0.field872 > 1) {
                var9 = 6;
            }
            if (arg0.field872 > 2) {
                var9 = 8;
            }
            if (arg0.field876 > 0 && arg0.field872 > 1) {
                var9 = 8;
                arg0.field876--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field847 == arg0.field826 && arg0.field830 != -1) {
            arg0.field847 = arg0.field830;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field852 += var9;
                if (arg0.field852 > var4) {
                    arg0.field852 = var4;
                }
            } else if (var2 > var4) {
                arg0.field852 -= var9;
                if (arg0.field852 < var4) {
                    arg0.field852 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field869 += var9;
                if (arg0.field869 > var5) {
                    arg0.field869 = var5;
                }
            } else if (var3 > var5) {
                arg0.field869 -= var9;
                if (arg0.field869 < var5) {
                    arg0.field869 = var5;
                }
            }
        }
        if (arg0.field852 == var4 && arg0.field869 == var5) {
            arg0.field872--;
            if (arg0.field823 > 0) {
                arg0.field823--;
            }
        }
    }

    @ObfuscatedName("as.ag(Lay;B)V")
    public static final void method639(class40 arg0) {
        if (arg0.field871 == 0) {
            return;
        }
        if (arg0.field844 != -1) {
            class40 var1 = null;
            if (arg0.field844 < 32768) {
                var1 = field319[arg0.field844];
            } else if (arg0.field844 >= 32768) {
                var1 = field510[arg0.field844 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field852 - var1.field852;
                int var3 = arg0.field869 - var1.field869;
                if (var2 != 0 || var3 != 0) {
                    arg0.field836 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field845) {
                arg0.field844 = -1;
                arg0.field845 = false;
            }
        }
        if (arg0.field846 != -1 && (arg0.field872 == 0 || arg0.field876 > 0)) {
            arg0.field836 = arg0.field846;
            arg0.field846 = -1;
        }
        int var4 = arg0.field836 - arg0.field820 & 0x7FF;
        if (var4 == 0 && arg0.field845) {
            arg0.field844 = -1;
            arg0.field845 = false;
        }
        if (var4 == 0) {
            arg0.field825 = 0;
            return;
        }
        arg0.field825++;
        if (var4 > 1024) {
            arg0.field820 -= arg0.field871;
            boolean var5 = true;
            if (var4 < arg0.field871 || var4 > 2048 - arg0.field871) {
                arg0.field820 = arg0.field836;
                var5 = false;
            }
            if (arg0.field847 == arg0.field818 && (arg0.field825 > 25 || var5)) {
                if (arg0.field840 == -1) {
                    arg0.field847 = arg0.field826;
                } else {
                    arg0.field847 = arg0.field840;
                }
            }
        } else {
            arg0.field820 += arg0.field871;
            boolean var6 = true;
            if (var4 < arg0.field871 || var4 > 2048 - arg0.field871) {
                arg0.field820 = arg0.field836;
                var6 = false;
            }
            if (arg0.field847 == arg0.field818 && (arg0.field825 > 25 || var6)) {
                if (arg0.field853 == -1) {
                    arg0.field847 = arg0.field826;
                } else {
                    arg0.field847 = arg0.field853;
                }
            }
        }
        arg0.field820 &= 0x7FF;
    }

    @ObfuscatedName("cl.as(Lj;IIB)V")
    public static void method1822(class3 arg0, int arg1, int arg2) {
        if (arg0.field850 == arg1 && arg1 != -1) {
            int var3 = class45.method2337(arg1).field996;
            if (var3 == 1) {
                arg0.field851 = 0;
                arg0.field843 = 0;
                arg0.field832 = arg2;
                arg0.field854 = 0;
            }
            if (var3 == 2) {
                arg0.field854 = 0;
            }
        } else if (arg1 == -1 || arg0.field850 == -1 || class45.method2337(arg1).field1005 >= class45.method2337(arg0.field850).field1005) {
            arg0.field850 = arg1;
            arg0.field851 = 0;
            arg0.field843 = 0;
            arg0.field832 = arg2;
            arg0.field854 = 0;
            arg0.field823 = arg0.field872;
        }
    }

    @ObfuscatedName("cn.aq(I)I")
    public static int method2001() {
        return field494 ? 2 : 1;
    }

    @ObfuscatedName("g.ax(II)V")
    public static void method160(int arg0) {
        field493 = 0L;
        if (arg0 >= 2) {
            field494 = true;
        } else {
            field494 = false;
        }
        method1533();
        if (field289 >= 25) {
            method3751();
        }
        field2258 = true;
    }

    @ObfuscatedName("hs.ap(I)V")
    public static void method3751() {
        field324.method2670(136);
        field324.method2567(method2001());
        field324.method2394(Statics.field1500);
        field324.method2394(Statics.field3176);
    }

    @ObfuscatedName("br.ao(I)V")
    public static void method1533() {
        client var0 = Statics.field378;
        synchronized (Statics.field378) {
            Container var1 = Statics.field378.method2912();
            if (var1 != null) {
                Statics.field1051 = Math.max(var1.getSize().width, Statics.field936);
                Statics.field1971 = Math.max(var1.getSize().height, Statics.field1739);
                if (Statics.field1497 == var1) {
                    Insets var2 = Statics.field1497.getInsets();
                    Statics.field1051 -= var2.right + var2.left;
                    Statics.field1971 -= var2.top + var2.bottom;
                }
                if (Statics.field1051 <= 0) {
                    Statics.field1051 = 1;
                }
                if (Statics.field1971 <= 0) {
                    Statics.field1971 = 1;
                }
                if (method2001() == 1) {
                    Statics.field1500 = field334;
                    Statics.field3176 = field496 * 503;
                } else {
                    Statics.field1500 = Math.min(Statics.field1051, 7680);
                    Statics.field3176 = Math.min(Statics.field1971, 2160);
                }
                field2256 = (Statics.field1051 - Statics.field1500) / 2;
                field2257 = 0;
                Statics.field2094.setSize(Statics.field1500, Statics.field3176);
                int var3 = Statics.field1500;
                int var4 = Statics.field3176;
                Canvas var5 = Statics.field2094;
                class81 var7;
                try {
                    class85 var6 = new class85();
                    var6.method1549(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var21) {
                    class79 var9 = new class79();
                    var9.method1549(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field883 = var7;
                if (Statics.field1497 == var1) {
                    Insets var10 = Statics.field1497.getInsets();
                    Statics.field2094.setLocation(field2256 + var10.left, field2257 + var10.top);
                } else {
                    Statics.field2094.setLocation(field2256, field2257);
                }
                int var11 = Statics.field1500;
                int var12 = Statics.field3176;
                if (Statics.field1051 < var11) {
                    int var13 = Statics.field1051;
                }
                if (Statics.field1971 < var12) {
                    int var14 = Statics.field1971;
                }
                if (Statics.field2660 != null) {
                    try {
                        Statics.method2743(Statics.field378, "resize", new Object[] { method2001() });
                    } catch (Throwable var20) {
                    }
                }
                if (field559 != -1) {
                    int var16 = field559;
                    int var17 = Statics.field1500;
                    int var18 = Statics.field3176;
                    if (class177.method3201(var16)) {
                        method346(Statics.field2905[var16], -1, var17, var18, true);
                    }
                }
                method1999();
            }
        }
    }

    @ObfuscatedName("ct.af(B)V")
    public static void method1999() {
        int var0 = field2256;
        int var1 = field2257;
        int var2 = Statics.field1051 - Statics.field1500 - var0;
        int var3 = Statics.field1971 - Statics.field3176 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field378.method2912();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1497 == var4) {
                Insets var7 = Statics.field1497.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1971);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1051, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1051 + var5 - var2, var6, var2, Statics.field1971);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1971 + var6 - var3, Statics.field1051, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("p.au(B)V")
    public static final void method110() {
        if (field559 != -1) {
            int var0 = field559;
            if (class177.method3201(var0)) {
                method1805(Statics.field2905[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field548; var1++) {
            if (field485[var1]) {
                field486[var1] = true;
            }
            field487[var1] = field485[var1];
            field485[var1] = false;
        }
        field484 = field291;
        field429 = -1;
        field511 = -1;
        Statics.field209 = null;
        if (field559 != -1) {
            field548 = 0;
            method187(field559, 0, 0, Statics.field1500, Statics.field3176, 0, 0, -1);
        }
        class83.method1721();
        if (field421) {
            method148();
        } else if (field429 != -1) {
            int var2 = field429;
            int var3 = field511;
            if (field422 >= 2 || field433 != 0 || field405) {
                String var4;
                if (field433 == 1 && field422 < 2) {
                    var4 = class161.field2502 + class161.field2530 + field434 + " " + class2.field21;
                } else if (field405 && field422 < 2) {
                    var4 = field438 + class161.field2530 + field439 + " " + class2.field21;
                } else {
                    int var5 = field422 - 1;
                    String var6;
                    if (field428[var5].length() > 0) {
                        var6 = field427[var5] + class161.field2530 + field428[var5];
                    } else {
                        var6 = field427[var5];
                    }
                    var4 = var6;
                }
                if (field422 > 2) {
                    var4 = var4 + class2.method2986(16777215) + " " + '/' + " " + (field422 - 2) + class161.field2642;
                }
                Statics.field1681.method3801(var4, var2 + 4, var3 + 15, 16777215, 0, field291 / 1000);
            }
        }
        if (field492 == 3) {
            for (int var7 = 0; var7 < field548; var7++) {
                if (field487[var7]) {
                    class83.method1753(field488[var7], field489[var7], field490[var7], field474[var7], 16711935, 128);
                } else if (field486[var7]) {
                    class83.method1753(field488[var7], field489[var7], field490[var7], field474[var7], 16711680, 128);
                }
            }
        }
        int var8 = Statics.field1819;
        int var9 = Statics.field1067.field852;
        int var10 = Statics.field1067.field869;
        int var11 = field330;
        for (class25 var12 = (class25) class25.field605.method3600(); var12 != null; var12 = (class25) class25.field605.method3602()) {
            if (var12.field612 != -1 || var12.field620 != null) {
                int var13 = 0;
                if (var9 > var12.field607) {
                    var13 += var9 - var12.field607;
                } else if (var9 < var12.field615) {
                    var13 += var12.field615 - var9;
                }
                if (var10 > var12.field608) {
                    var13 += var10 - var12.field608;
                } else if (var10 < var12.field606) {
                    var13 += var12.field606 - var10;
                }
                if (var13 - 64 > var12.field609 || field521 == 0 || var12.field603 != var8) {
                    if (var12.field611 != null) {
                        Statics.field206.method1149(var12.field611);
                        var12.field611 = null;
                    }
                    if (var12.field616 != null) {
                        Statics.field206.method1149(var12.field616);
                        var12.field616 = null;
                    }
                } else {
                    var13 -= 64;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = field521 * (var12.field609 - var13) / var12.field609;
                    class62 var10000;
                    if (var12.field611 != null) {
                        var12.field611.method1315(var14);
                    } else if (var12.field612 >= 0) {
                        var10000 = (class62) null;
                        class62 var15 = class62.method1263(Statics.field1112, var12.field612, 0);
                        if (var15 != null) {
                            class66 var16 = var15.method1262().method1291(Statics.field2216);
                            class68 var17 = class68.method1311(var16, 100, var14);
                            var17.method1314(-1);
                            Statics.field206.method1148(var17);
                            var12.field611 = var17;
                        }
                    }
                    if (var12.field616 != null) {
                        var12.field616.method1315(var14);
                        if (!var12.field616.method3697()) {
                            var12.field616 = null;
                        }
                    } else if (var12.field620 != null && (var12.field614 -= var11) <= 0) {
                        int var18 = (int) (Math.random() * (double) var12.field620.length);
                        var10000 = (class62) null;
                        class62 var19 = class62.method1263(Statics.field1112, var12.field620[var18], 0);
                        if (var19 != null) {
                            class66 var20 = var19.method1262().method1291(Statics.field2216);
                            class68 var21 = class68.method1311(var20, 100, var14);
                            var21.method1314(0);
                            Statics.field206.method1148(var21);
                            var12.field616 = var21;
                            var12.field614 = var12.field604 + (int) (Math.random() * (double) (var12.field613 - var12.field604));
                        }
                    }
                }
            }
        }
        field330 = 0;
    }

    @ObfuscatedName("aa.ab(Ljava/lang/String;ZB)V")
    public static final void method910(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2348.method3790(arg0, 250);
        int var6 = Statics.field2348.method3791(arg0, 250) * 13;
        class83.method1728(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1734(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2348.method3850(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2667(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2094.getGraphics();
                Statics.field883.method1550(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2094.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field548; var13++) {
            if (field490[var13] + field488[var13] > var9 && field488[var13] < var9 + var11 && field489[var13] + field474[var13] > var10 && field489[var13] < var10 + var12) {
                field486[var13] = true;
            }
        }
    }

    @ObfuscatedName("x.ad(Laf;S)V")
    public static final void method1(class36 arg0) {
        if (Statics.field1067.field852 >> 7 == field302 && Statics.field1067.field869 >> 7 == field515) {
            field302 = 0;
        }
        int var1 = class35.field761;
        int[] var2 = class35.field756;
        int var3 = var1;
        if (class36.field783 == arg0 || class36.field774 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field783 == arg0) {
                var5 = Statics.field1067;
                var6 = Statics.field1067.field49 << 14;
            } else if (class36.field774 == arg0) {
                var5 = field510[field412];
                var6 = field412 << 14;
            } else {
                var5 = field510[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field779 == arg0 && field412 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method23() && !var5.field30) {
                var5.field45 = false;
                if ((field315 && var1 > 50 || var1 > 200) && class36.field783 != arg0 && var5.field847 == var5.field818) {
                    var5.field45 = true;
                }
                int var7 = var5.field852 >> 7;
                int var8 = var5.field869 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field40 == null || field291 < var5.field35 || field291 >= var5.field36) {
                        if ((var5.field852 & 0x7F) == 64 && (var5.field869 & 0x7F) == 64) {
                            if (field387 == field386[var7][var8]) {
                                continue;
                            }
                            field386[var7][var8] = field387;
                        }
                        var5.field38 = method905(var5.field852, var5.field869, Statics.field1819);
                        Statics.field123.method1987(Statics.field1819, var5.field852, var5.field869, var5.field38, 60, var5, var5.field820, var6, var5.field821);
                    } else {
                        var5.field45 = false;
                        var5.field38 = method905(var5.field852, var5.field869, Statics.field1819);
                        Statics.field123.method1837(Statics.field1819, var5.field852, var5.field869, var5.field38, 60, var5, var5.field820, var6, var5.field41, var5.field39, var5.field43, var5.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ff.ac(B)V")
    public static final void method2992() {
        for (class32 var0 = (class32) field358.method3600(); var0 != null; var0 = (class32) field358.method3602()) {
            if (Statics.field1819 != var0.field703 || var0.field699) {
                var0.method3695();
            } else if (field291 >= var0.field698) {
                var0.method648(field330);
                if (var0.field699) {
                    var0.method3695();
                } else {
                    Statics.field123.method1987(var0.field703, var0.field700, var0.field702, var0.field708, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("c.ak(IIIII)V")
    public static final void method540(int arg0, int arg1, int arg2, int arg3) {
        field376 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class35.field761;
        int[] var7 = class35.field756;
        for (int var8 = 0; var8 < field320 + var6; var8++) {
            class40 var9;
            if (var8 < var6) {
                var9 = field510[var7[var8]];
                if (field412 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field319[field321[var8 - var6]];
            }
            Statics.method2981(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            Statics.method2981(field510[field412], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field376; var10++) {
            int var11 = field476[var10];
            int var12 = field379[var10];
            int var13 = field357[var10];
            int var14 = field380[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field379[var16] - field380[var16] && var12 - var14 < field379[var16] + 2 && var11 - var13 < field476[var16] + field357[var16] && var11 + var13 > field476[var16] - field357[var16] && field379[var16] - field380[var16] < var12) {
                        var12 = field379[var16] - field380[var16];
                        var15 = true;
                    }
                }
            }
            field388 = field476[var10];
            field389 = field379[var10] = var12;
            String var17 = field385[var10];
            if (field442 == 0) {
                int var18 = 16776960;
                if (field560[var10] < 6) {
                    var18 = field555[field560[var10]];
                }
                if (field560[var10] == 6) {
                    var18 = field387 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field560[var10] == 7) {
                    var18 = field387 % 20 < 10 ? 255 : 65535;
                }
                if (field560[var10] == 8) {
                    var18 = field387 % 20 < 10 ? 45056 : 8454016;
                }
                if (field560[var10] == 9) {
                    int var19 = 150 - field384[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field560[var10] == 10) {
                    int var20 = 150 - field384[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field560[var10] == 11) {
                    int var21 = 150 - field384[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field383[var10] == 0) {
                    Statics.field1681.method3796(var17, field388 + arg0, field389 + arg1, var18, 0);
                }
                if (field383[var10] == 1) {
                    Statics.field1681.method3798(var17, field388 + arg0, field389 + arg1, var18, 0, field387);
                }
                if (field383[var10] == 2) {
                    Statics.field1681.method3799(var17, field388 + arg0, field389 + arg1, var18, 0, field387);
                }
                if (field383[var10] == 3) {
                    Statics.field1681.method3800(var17, field388 + arg0, field389 + arg1, var18, 0, field387, 150 - field384[var10]);
                }
                if (field383[var10] == 4) {
                    int var22 = (150 - field384[var10]) * (Statics.field1681.method3849(var17) + 100) / 150;
                    class83.method1723(field388 + arg0 - 50, arg1, field388 + arg0 + 50, arg1 + arg3);
                    Statics.field1681.method3829(var17, field388 + arg0 + 50 - var22, field389 + arg1, var18, 0);
                    class83.method1722(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field383[var10] == 5) {
                    int var23 = 150 - field384[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class83.method1723(arg0, field389 + arg1 - Statics.field1681.field3241 - 1, arg0 + arg2, field389 + arg1 + 5);
                    Statics.field1681.method3796(var17, field388 + arg0, field389 + arg1 + var24, var18, 0);
                    class83.method1722(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1681.method3796(var17, field388 + arg0, field389 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ak.ar(I)V")
    public static final void method871() {
        field305 = 0;
        int var0 = (Statics.field1067.field852 >> 7) + Statics.field676;
        int var1 = (Statics.field1067.field869 >> 7) + Statics.field2366;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field305 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field305 = 1;
        }
        if (field305 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field305 = 0;
        }
    }

    @ObfuscatedName("fr.aa(IIIII)V")
    public static final void method3252(int arg0, int arg1, int arg2, int arg3) {
        if (field466 == 1) {
            Statics.field632[field392 / 100].method1637(field335 - 8, field391 - 8);
        }
        if (field466 == 2) {
            Statics.field632[field392 / 100 + 4].method1637(field335 - 8, field391 - 8);
        }
        method871();
    }

    @ObfuscatedName("bw.av(Lay;IB)V")
    public static final void method1132(class40 arg0, int arg1) {
        Statics.method3262(arg0.field852, arg0.field869, arg1);
    }

    @ObfuscatedName("aa.al(IIIB)I")
    public static final int method905(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field72[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field94[var5][var3][var4] + class6.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field94[var5][var3][var4 + 1] + class6.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("w.ai(IIIIIIB)V")
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class95.field1640[var6];
            int var12 = class95.field1641[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class95.field1640[var7];
            int var15 = class95.field1641[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field130 = arg0 - var8;
        Statics.field2039 = arg1 - var9;
        Statics.field1579 = arg2 - var10;
        Statics.field1142 = arg3;
        Statics.field565 = arg4;
    }

    @ObfuscatedName("t.ae(ZB)V")
    public static final void method152(boolean arg0) {
        field342 = arg0;
        if (!field342) {
            int var1 = field447.method2445();
            int var2 = field447.method2444();
            int var3 = field447.method2403();
            Statics.field3106 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field3106[var4][var5] = field447.method2413();
                }
            }
            Statics.field2800 = new int[var3];
            Statics.field2735 = new int[var3];
            Statics.field1506 = new int[var3];
            Statics.field588 = new byte[var3][];
            Statics.field127 = new byte[var3][];
            boolean var6 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var6 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field2800[var7] = var10;
                        Statics.field2735[var7] = Statics.field2166.method3148("m" + var8 + "_" + var9);
                        Statics.field1506[var7] = Statics.field2166.method3148("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            Statics.method185(var2, var1);
            return;
        }
        int var11 = field447.method2444();
        int var12 = field447.method2443();
        int var13 = field447.method2403();
        field447.method2676();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field447.method2679(1);
                    if (var17 == 1) {
                        field390[var14][var15][var16] = field447.method2679(26);
                    } else {
                        field390[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field447.method2674();
        Statics.field3106 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field3106[var18][var19] = field447.method2413();
            }
        }
        Statics.field2800 = new int[var13];
        Statics.field2735 = new int[var13];
        Statics.field1506 = new int[var13];
        Statics.field588 = new byte[var13][];
        Statics.field127 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field390[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2800[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2800[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2735[var20] = Statics.field2166.method3148("m" + var29 + "_" + var30);
                            Statics.field1506[var20] = Statics.field2166.method3148("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        Statics.method185(var11, var12);
    }

    @ObfuscatedName("g.bx(ZI)V")
    public static final void method161(boolean arg0) {
        method2004();
        field314++;
        if (field314 < 50 && !arg0) {
            return;
        }
        field314 = 0;
        if (field349 || Statics.field695 == null) {
            return;
        }
        field324.method2670(185);
        try {
            Statics.field695.method2880(field324.field2056, 0, field324.field2057);
            field324.field2057 = 0;
        } catch (IOException var2) {
            field349 = true;
        }
    }

    @ObfuscatedName("z.bh(IIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field123.method1851(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field123.method1855(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2206.field1436;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method12(var12);
            if (var13.field953 == -1) {
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
                class84 var14 = Statics.field690[var13.field953];
                if (var14 != null) {
                    int var15 = (var13.field939 * 4 - var14.field1459) / 2;
                    int var16 = (var13.field940 * 4 - var14.field1458) / 2;
                    var14.method1793(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field940) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field123.method1891(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field123.method1855(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method12(var21);
            if (var22.field953 != -1) {
                class84 var23 = Statics.field690[var22.field953];
                if (var23 != null) {
                    int var24 = (var22.field939 * 4 - var23.field1459) / 2;
                    int var25 = (var22.field940 * 4 - var23.field1458) / 2;
                    var23.method1793(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field940) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2206.field1436;
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
        int var29 = Statics.field123.method1988(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method12(var30);
        if (var31.field953 == -1) {
            return;
        }
        class84 var32 = Statics.field690[var31.field953];
        if (var32 != null) {
            int var33 = (var31.field939 * 4 - var32.field1459) / 2;
            int var34 = (var31.field940 * 4 - var32.field1458) / 2;
            var32.method1793(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field940) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dm.bw(B)V")
    public static final void method2715() {
        if (field328 == 109) {
            int var0 = field447.method2604();
            int var1 = (var0 >> 4 & 0x7) + Statics.field197;
            int var2 = (var0 & 0x7) + Statics.field1970;
            int var3 = field447.method2443();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class203 var4 = field413[Statics.field1819][var1][var2];
                if (var4 != null) {
                    for (class31 var5 = (class31) var4.method3600(); var5 != null; var5 = (class31) var4.method3602()) {
                        if ((var3 & 0x7FFF) == var5.field693) {
                            var5.method3695();
                            break;
                        }
                    }
                    if (var4.method3600() == null) {
                        field413[Statics.field1819][var1][var2] = null;
                    }
                    method2343(var1, var2);
                }
            }
            return;
        }
        if (field328 == 113) {
            int var6 = field447.method2408();
            int var7 = (var6 >> 4 & 0x7) + Statics.field197;
            int var8 = (var6 & 0x7) + Statics.field1970;
            int var9 = field447.method2403();
            int var10 = field447.method2408();
            int var11 = var10 >> 4 & 0xF;
            int var12 = var10 & 0x7;
            int var13 = field447.method2408();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var14 = var11 + 1;
                if (Statics.field1067.field873[0] >= var7 - var14 && Statics.field1067.field873[0] <= var7 + var14 && Statics.field1067.field874[0] >= var8 - var14 && Statics.field1067.field874[0] <= var8 + var14 && field521 != 0 && var12 > 0 && field522 < 50) {
                    field326[field522] = var9;
                    field524[field522] = var12;
                    field287[field522] = var13;
                    field527[field522] = null;
                    field435[field522] = (var7 << 16) + (var8 << 8) + var11;
                    field522++;
                }
            }
        }
        if (field328 == 42) {
            int var15 = field447.method2604();
            int var16 = var15 >> 2;
            int var17 = var15 & 0x3;
            int var18 = field344[var16];
            int var19 = field447.method2408();
            int var20 = (var19 >> 4 & 0x7) + Statics.field197;
            int var21 = (var19 & 0x7) + Statics.field1970;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                method970(Statics.field1819, var20, var21, var18, -1, var16, var17, 0, -1);
            }
        } else if (field328 == 225) {
            int var22 = field447.method2408();
            int var23 = (var22 >> 4 & 0x7) + Statics.field197;
            int var24 = (var22 & 0x7) + Statics.field1970;
            int var25 = field447.method2403();
            int var26 = field447.method2403();
            int var27 = field447.method2403();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class203 var28 = field413[Statics.field1819][var23][var24];
                if (var28 != null) {
                    for (class31 var29 = (class31) var28.method3600(); var29 != null; var29 = (class31) var28.method3602()) {
                        if ((var25 & 0x7FFF) == var29.field693 && var29.field694 == var26) {
                            var29.field694 = var27;
                            break;
                        }
                    }
                    method2343(var23, var24);
                }
            }
        } else if (field328 == 250) {
            int var30 = field447.method2408();
            int var31 = (var30 >> 4 & 0x7) + Statics.field197;
            int var32 = (var30 & 0x7) + Statics.field1970;
            int var33 = var31 + field447.method2409();
            int var34 = var32 + field447.method2409();
            int var35 = field447.method2611();
            int var36 = field447.method2403();
            int var37 = field447.method2408() * 4;
            int var38 = field447.method2408() * 4;
            int var39 = field447.method2403();
            int var40 = field447.method2403();
            int var41 = field447.method2408();
            int var42 = field447.method2408();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class7 var47 = new class7(var36, Statics.field1819, var43, var44, method905(var43, var44, Statics.field1819) - var37, field291 + var39, field291 + var40, var41, var42, var35, var38);
                var47.method102(var45, var46, method905(var45, var46, Statics.field1819) - var38, field291 + var39);
                field415.method3594(var47);
            }
        } else if (field328 == 168) {
            int var48 = field447.method2444();
            int var49 = field447.method2435();
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = field344[var50];
            int var53 = field447.method2408();
            int var54 = (var53 >> 4 & 0x7) + Statics.field197;
            int var55 = (var53 & 0x7) + Statics.field1970;
            if (var54 >= 0 && var55 >= 0 && var54 < 103 && var55 < 103) {
                if (var52 == 0) {
                    class91 var56 = Statics.field123.method1847(Statics.field1819, var54, var55);
                    if (var56 != null) {
                        int var57 = var56.field1576 >> 14 & 0x7FFF;
                        if (var50 == 2) {
                            var56.field1569 = new class13(var57, 2, var51 + 4, Statics.field1819, var54, var55, var48, false, var56.field1569);
                            var56.field1585 = new class13(var57, 2, var51 + 1 & 0x3, Statics.field1819, var54, var55, var48, false, var56.field1585);
                        } else {
                            var56.field1569 = new class13(var57, var50, var51, Statics.field1819, var54, var55, var48, false, var56.field1569);
                        }
                    }
                }
                if (var52 == 1) {
                    class98 var58 = Statics.field123.method1848(Statics.field1819, var54, var55);
                    if (var58 != null) {
                        int var59 = var58.field1653 >> 14 & 0x7FFF;
                        if (var50 == 4 || var50 == 5) {
                            var58.field1658 = new class13(var59, 4, var51, Statics.field1819, var54, var55, var48, false, var58.field1658);
                        } else if (var50 == 6) {
                            var58.field1658 = new class13(var59, 4, var51 + 4, Statics.field1819, var54, var55, var48, false, var58.field1658);
                        } else if (var50 == 7) {
                            var58.field1658 = new class13(var59, 4, (var51 + 2 & 0x3) + 4, Statics.field1819, var54, var55, var48, false, var58.field1658);
                        } else if (var50 == 8) {
                            var58.field1658 = new class13(var59, 4, var51 + 4, Statics.field1819, var54, var55, var48, false, var58.field1658);
                            var58.field1661 = new class13(var59, 4, (var51 + 2 & 0x3) + 4, Statics.field1819, var54, var55, var48, false, var58.field1661);
                        }
                    }
                }
                if (var52 == 2) {
                    class102 var60 = Statics.field123.method1961(Statics.field1819, var54, var55);
                    if (var50 == 11) {
                        var50 = 10;
                    }
                    if (var60 != null) {
                        var60.field1714 = new class13(var60.field1722 >> 14 & 0x7FFF, var50, var51, Statics.field1819, var54, var55, var48, false, var60.field1714);
                    }
                }
                if (var52 == 3) {
                    class97 var61 = Statics.field123.method1914(Statics.field1819, var54, var55);
                    if (var61 != null) {
                        var61.field1645 = new class13(var61.field1646 >> 14 & 0x7FFF, 22, var51, Statics.field1819, var54, var55, var48, false, var61.field1645);
                    }
                }
            }
        } else {
            if (field328 == 95) {
                byte var62 = field447.method2538();
                int var63 = field447.method2445();
                int var64 = field447.method2445();
                int var65 = field447.method2443();
                byte var66 = field447.method2439();
                int var67 = field447.method2408();
                int var68 = (var67 >> 4 & 0x7) + Statics.field197;
                int var69 = (var67 & 0x7) + Statics.field1970;
                byte var70 = field447.method2439();
                byte var71 = field447.method2438();
                int var72 = field447.method2435();
                int var73 = var72 >> 2;
                int var74 = var72 & 0x3;
                int var75 = field344[var73];
                int var76 = field447.method2444();
                class3 var77;
                if (field404 == var64) {
                    var77 = Statics.field1067;
                } else {
                    var77 = field510[var64];
                }
                if (var77 != null) {
                    class43 var78 = class43.method12(var65);
                    int var79;
                    int var80;
                    if (var74 == 1 || var74 == 3) {
                        var79 = var78.field940;
                        var80 = var78.field939;
                    } else {
                        var79 = var78.field939;
                        var80 = var78.field940;
                    }
                    int var81 = (var79 >> 1) + var68;
                    int var82 = (var79 + 1 >> 1) + var68;
                    int var83 = (var80 >> 1) + var69;
                    int var84 = (var80 + 1 >> 1) + var69;
                    int[][] var85 = class6.field94[Statics.field1819];
                    int var86 = var85[var81][var83] + var85[var82][var83] + var85[var81][var84] + var85[var82][var84] >> 2;
                    int var87 = (var68 << 7) + (var79 << 6);
                    int var88 = (var69 << 7) + (var80 << 6);
                    class109 var89 = var78.method781(var73, var74, var85, var87, var86, var88);
                    if (var89 != null) {
                        method970(Statics.field1819, var68, var69, var75, -1, 0, 0, var76 + 1, var63 + 1);
                        var77.field35 = field291 + var76;
                        var77.field36 = field291 + var63;
                        var77.field40 = var89;
                        var77.field37 = var68 * 128 + var79 * 64;
                        var77.field31 = var69 * 128 + var80 * 64;
                        var77.field46 = var86;
                        if (var71 > var70) {
                            byte var90 = var71;
                            var71 = var70;
                            var70 = var90;
                        }
                        if (var62 > var66) {
                            byte var91 = var62;
                            var62 = var66;
                            var66 = var91;
                        }
                        var77.field41 = var68 + var71;
                        var77.field43 = var68 + var70;
                        var77.field39 = var62 + var69;
                        var77.field44 = var66 + var69;
                    }
                }
            }
            if (field328 == 152) {
                int var92 = field447.method2408();
                int var93 = (var92 >> 4 & 0x7) + Statics.field197;
                int var94 = (var92 & 0x7) + Statics.field1970;
                int var95 = field447.method2403();
                int var96 = field447.method2408();
                int var97 = field447.method2403();
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    int var98 = var93 * 128 + 64;
                    int var99 = var94 * 128 + 64;
                    class32 var100 = new class32(var95, Statics.field1819, var98, var99, method905(var98, var99, Statics.field1819) - var96, var97, field291);
                    field358.method3594(var100);
                }
            } else if (field328 == 142) {
                int var101 = field447.method2444();
                int var102 = field447.method2408();
                int var103 = (var102 >> 4 & 0x7) + Statics.field197;
                int var104 = (var102 & 0x7) + Statics.field1970;
                int var105 = field447.method2451();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field344[var106];
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    method970(Statics.field1819, var103, var104, var108, var101, var106, var107, 0, -1);
                }
            } else if (field328 == 82) {
                int var109 = field447.method2408();
                int var110 = (var109 >> 4 & 0x7) + Statics.field197;
                int var111 = (var109 & 0x7) + Statics.field1970;
                int var112 = field447.method2443();
                int var113 = field447.method2445();
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class31 var114 = new class31();
                    var114.field693 = var112;
                    var114.field694 = var113;
                    if (field413[Statics.field1819][var110][var111] == null) {
                        field413[Statics.field1819][var110][var111] = new class203();
                    }
                    field413[Statics.field1819][var110][var111].method3594(var114);
                    method2343(var110, var111);
                }
            }
        }
    }

    @ObfuscatedName("al.bg(IIIIIIIIII)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field414.method3600(); var10 != null; var10 = (class17) field414.method3602()) {
            if (var10.field244 == arg0 && var10.field245 == arg1 && var10.field236 == arg2 && var10.field232 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field244 = arg0;
            var9.field232 = arg3;
            var9.field245 = arg1;
            var9.field236 = arg2;
            method728(var9);
            field414.method3594(var9);
        }
        var9.field234 = arg4;
        var9.field240 = arg5;
        var9.field239 = arg6;
        var9.field241 = arg7;
        var9.field242 = arg8;
    }

    @ObfuscatedName("ay.bu(Lh;I)V")
    public static final void method728(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field232 == 0) {
            var1 = Statics.field123.method1851(arg0.field244, arg0.field245, arg0.field236);
        }
        if (arg0.field232 == 1) {
            var1 = Statics.field123.method1973(arg0.field244, arg0.field245, arg0.field236);
        }
        if (arg0.field232 == 2) {
            var1 = Statics.field123.method1891(arg0.field244, arg0.field245, arg0.field236);
        }
        if (arg0.field232 == 3) {
            var1 = Statics.field123.method1988(arg0.field244, arg0.field245, arg0.field236);
        }
        if (var1 != 0) {
            int var5 = Statics.field123.method1855(arg0.field244, arg0.field245, arg0.field236, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field235 = var2;
        arg0.field237 = var3;
        arg0.field233 = var4;
    }

    @ObfuscatedName("bm.bq(B)V")
    public static final void method1513() {
        for (class17 var0 = (class17) field414.method3600(); var0 != null; var0 = (class17) field414.method3602()) {
            if (var0.field242 > 0) {
                var0.field242--;
            }
            if (var0.field242 != 0) {
                if (var0.field241 > 0) {
                    var0.field241--;
                }
                if (var0.field241 == 0 && var0.field245 >= 1 && var0.field236 >= 1 && var0.field245 <= 102 && var0.field236 <= 102 && (var0.field234 < 0 || class6.method2830(var0.field234, var0.field240))) {
                    method176(var0.field244, var0.field232, var0.field245, var0.field236, var0.field234, var0.field239, var0.field240);
                    var0.field241 = -1;
                    if (var0.field235 == var0.field234 && var0.field235 == -1) {
                        var0.method3695();
                    } else if (var0.field235 == var0.field234 && var0.field239 == var0.field233 && var0.field240 == var0.field237) {
                        var0.method3695();
                    }
                }
            } else if (var0.field235 < 0 || class6.method2830(var0.field235, var0.field237)) {
                method176(var0.field244, var0.field232, var0.field245, var0.field236, var0.field235, var0.field233, var0.field237);
                var0.method3695();
            }
        }
    }

    @ObfuscatedName("s.bb(IIIIIIIB)V")
    public static final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field315 && Statics.field1819 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field123.method1851(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field123.method1973(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field123.method1891(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field123.method1988(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field123.method1855(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field123.method1842(arg0, arg2, arg3);
                class43 var15 = class43.method12(var12);
                if (var15.field941 != 0) {
                    field341[arg0].method2327(arg2, arg3, var13, var14, var15.field974);
                }
            }
            if (arg1 == 1) {
                Statics.field123.method1843(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field123.method1844(arg0, arg2, arg3);
                class43 var16 = class43.method12(var12);
                if (var16.field939 + arg2 > 103 || var16.field939 + arg3 > 103 || var16.field940 + arg2 > 103 || var16.field940 + arg3 > 103) {
                    return;
                }
                if (var16.field941 != 0) {
                    field341[arg0].method2305(arg2, arg3, var16.field939, var16.field940, var14, var16.field974);
                }
            }
            if (arg1 == 3) {
                Statics.field123.method1845(arg0, arg2, arg3);
                class43 var17 = class43.method12(var12);
                if (var17.field941 == 1) {
                    field341[arg0].method2329(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field72[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method44(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field123, field341[arg0]);
    }

    @ObfuscatedName("dt.bz(III)V")
    public static final void method2343(int arg0, int arg1) {
        class203 var2 = field413[Statics.field1819][arg0][arg1];
        if (var2 == null) {
            Statics.field123.method1846(Statics.field1819, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3600(); var6 != null; var6 = (class31) var2.method3602()) {
            class56 var7 = class56.method709(var6.field693);
            long var8 = (long) var7.field1184;
            if (var7.field1209 == 1) {
                var8 = (long) (var6.field694 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field123.method1846(Statics.field1819, arg0, arg1);
            return;
        }
        var2.method3596(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3600(); var12 != null; var12 = (class31) var2.method3602()) {
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
        Statics.field123.method1832(Statics.field1819, arg0, arg1, method905(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1819), var5, var13, var10, var11);
    }

    @ObfuscatedName("c.bk(ZS)V")
    public static final void method536(boolean arg0) {
        field525 = 0;
        field322 = 0;
        field447.method2676();
        int var1 = field447.method2679(8);
        if (var1 < field320) {
            for (int var2 = var1; var2 < field320; var2++) {
                field381[++field525 - 1] = field321[var2];
            }
        }
        if (var1 > field320) {
            throw new RuntimeException("");
        }
        field320 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field321[var3];
            class37 var5 = field319[var4];
            int var6 = field447.method2679(1);
            if (var6 == 0) {
                field321[++field320 - 1] = var4;
                var5.field860 = field291;
            } else {
                int var7 = field447.method2679(2);
                if (var7 == 0) {
                    field321[++field320 - 1] = var4;
                    var5.field860 = field291;
                    field467[++field322 - 1] = var4;
                } else if (var7 == 1) {
                    field321[++field320 - 1] = var4;
                    var5.field860 = field291;
                    int var8 = field447.method2679(3);
                    var5.method700(var8, (byte) 1);
                    int var9 = field447.method2679(1);
                    if (var9 == 1) {
                        field467[++field322 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field321[++field320 - 1] = var4;
                    var5.field860 = field291;
                    int var10 = field447.method2679(3);
                    var5.method700(var10, (byte) 2);
                    int var11 = field447.method2679(3);
                    var5.method700(var11, (byte) 2);
                    int var12 = field447.method2679(1);
                    if (var12 == 1) {
                        field467[++field322 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field381[++field525 - 1] = var4;
                }
            }
        }
        while (field447.method2675(field327) >= 27) {
            int var13 = field447.method2679(15);
            if (var13 == 32767) {
                break;
            }
            boolean var43 = false;
            if (field319[var13] == null) {
                field319[var13] = new class37();
                var43 = true;
            }
            class37 var44 = field319[var13];
            field321[++field320 - 1] = var13;
            var44.field860 = field291;
            int var45 = field447.method2679(1);
            int var46 = field382[field447.method2679(3)];
            if (var43) {
                var44.field836 = var44.field820 = var46;
            }
            int var47;
            if (arg0) {
                var47 = field447.method2679(8);
                if (var47 > 127) {
                    var47 -= 256;
                }
            } else {
                var47 = field447.method2679(5);
                if (var47 > 15) {
                    var47 -= 32;
                }
            }
            int var48;
            if (arg0) {
                var48 = field447.method2679(8);
                if (var48 > 127) {
                    var48 -= 256;
                }
            } else {
                var48 = field447.method2679(5);
                if (var48 > 15) {
                    var48 -= 32;
                }
            }
            int var49 = field447.method2679(1);
            if (var49 == 1) {
                field467[++field322 - 1] = var13;
            }
            var44.field793 = class42.method2094(field447.method2679(14));
            var44.field822 = var44.field793.field903;
            var44.field871 = var44.field793.field914;
            if (var44.field871 == 0) {
                var44.field820 = 0;
            }
            var44.field826 = var44.field793.field897;
            var44.field827 = var44.field793.field910;
            var44.field828 = var44.field793.field899;
            var44.field870 = var44.field793.field917;
            var44.field818 = var44.field793.field894;
            var44.field840 = var44.field793.field908;
            var44.field853 = var44.field793.field920;
            var44.method704(Statics.field1067.field873[0] + var47, Statics.field1067.field874[0] + var48, var45 == 1);
        }
        field447.method2674();
        for (int var14 = 0; var14 < field322; var14++) {
            int var15 = field467[var14];
            class37 var16 = field319[var15];
            int var17 = field447.method2408();
            if ((var17 & 0x10) != 0) {
                int var18 = field447.method2445();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field447.method2435();
                if (var16.field850 == var18 && var18 != -1) {
                    int var20 = class45.method2337(var18).field996;
                    if (var20 == 1) {
                        var16.field851 = 0;
                        var16.field843 = 0;
                        var16.field832 = var19;
                        var16.field854 = 0;
                    }
                    if (var20 == 2) {
                        var16.field854 = 0;
                    }
                } else if (var18 == -1 || var16.field850 == -1 || class45.method2337(var18).field1005 >= class45.method2337(var16.field850).field1005) {
                    var16.field850 = var18;
                    var16.field851 = 0;
                    var16.field843 = 0;
                    var16.field832 = var19;
                    var16.field854 = 0;
                    var16.field823 = var16.field872;
                }
            }
            if ((var17 & 0x40) != 0) {
                int var21 = field447.method2444();
                int var22 = field447.method2445();
                int var23 = var16.field852 - (var21 - Statics.field676 - Statics.field676) * 64;
                int var24 = var16.field869 - (var22 - Statics.field2366 - Statics.field2366) * 64;
                if (var23 != 0 || var24 != 0) {
                    var16.field846 = (int) (Math.atan2((double) var23, (double) var24) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x2) != 0) {
                var16.field867 = field447.method2626();
                var16.field839 = 100;
            }
            if ((var17 & 0x4) != 0) {
                var16.field793 = class42.method2094(field447.method2443());
                var16.field822 = var16.field793.field903;
                var16.field871 = var16.field793.field914;
                var16.field826 = var16.field793.field897;
                var16.field827 = var16.field793.field910;
                var16.field828 = var16.field793.field899;
                var16.field870 = var16.field793.field917;
                var16.field818 = var16.field793.field894;
                var16.field840 = var16.field793.field908;
                var16.field853 = var16.field793.field920;
            }
            if ((var17 & 0x20) != 0) {
                var16.field844 = field447.method2444();
                if (var16.field844 == 65535) {
                    var16.field844 = -1;
                }
            }
            if ((var17 & 0x8) != 0) {
                var16.field855 = field447.method2445();
                int var25 = field447.method2413();
                var16.field859 = var25 >> 16;
                var16.field858 = (var25 & 0xFFFF) + field291;
                var16.field856 = 0;
                var16.field857 = 0;
                if (var16.field858 > field291) {
                    var16.field856 = -1;
                }
                if (var16.field855 == 65535) {
                    var16.field855 = -1;
                }
            }
            if ((var17 & 0x1) != 0) {
                int var26 = field447.method2408();
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = field447.method2421();
                        if (var31 == 32767) {
                            var31 = field447.method2421();
                            var29 = field447.method2421();
                            var28 = field447.method2421();
                            var30 = field447.method2421();
                        } else if (var31 == 32766) {
                            var31 = -1;
                        } else {
                            var29 = field447.method2421();
                        }
                        int var32 = field447.method2421();
                        var16.method725(var31, var29, var28, var30, field291, var32);
                    }
                }
                int var33 = field447.method2435();
                if (var33 > 0) {
                    for (int var34 = 0; var34 < var33; var34++) {
                        int var35 = field447.method2421();
                        int var36 = field447.method2421();
                        if (var36 == 32767) {
                            var16.method727(var35);
                        } else {
                            int var37 = field447.method2421();
                            int var38 = field447.method2604();
                            int var39 = var36 > 0 ? field447.method2408() : var38;
                            var16.method726(var35, field291, var36, var37, var38, var39);
                        }
                    }
                }
            }
        }
        for (int var40 = 0; var40 < field525; var40++) {
            int var41 = field381[var40];
            if (field291 != field319[var41].field860) {
                field319[var41].field793 = null;
                field319[var41] = null;
            }
        }
        if (field327 != field447.field2057) {
            throw new RuntimeException(field447.field2057 + class2.field18 + field327);
        }
        for (int var42 = 0; var42 < field320; var42++) {
            if (field319[field321[var42]] == null) {
                throw new RuntimeException(var42 + class2.field18 + field320);
            }
        }
    }

    @ObfuscatedName("l.bl(Lj;IIBI)V")
    public static final void method104(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field873[0];
        int var5 = arg0.field874[0];
        int var6 = arg0.method28();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class110.method236(var4, var5, arg0.method28(), method1023(arg1, arg2), field341[arg0.field48], true, field507, field562);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method24(field507[var8], field562[var8], arg3);
            }
        }
    }

    @ObfuscatedName("ae.be(III)Ldw;")
    public static class111 method1023(int arg0, int arg1) {
        field281.field1944 = arg0;
        field281.field1941 = arg1;
        field281.field1940 = 1;
        field281.field1946 = 1;
        return field281;
    }

    @ObfuscatedName("t.bp(B)V")
    public static final void method148() {
        int var0 = Statics.field1605;
        int var1 = Statics.field1469;
        int var2 = Statics.field1930;
        int var3 = Statics.field2135;
        int var4 = 6116423;
        class83.method1728(var0, var1, var2, var3, var4);
        class83.method1728(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1734(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1681.method3829(class161.field2523, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2205;
        int var6 = class144.field2211 * -117362325;
        for (int var7 = 0; var7 < field422; var7++) {
            int var8 = (field422 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class228 var10 = Statics.field1681;
            String var11;
            if (field428[var7].length() > 0) {
                var11 = field427[var7] + class161.field2530 + field428[var7];
            } else {
                var11 = field427[var7];
            }
            var10.method3829(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1605;
        int var13 = Statics.field1469;
        int var14 = Statics.field1930;
        int var15 = Statics.field2135;
        for (int var16 = 0; var16 < field548; var16++) {
            if (field490[var16] + field488[var16] > var12 && field488[var16] < var12 + var14 && field489[var16] + field474[var16] > var13 && field489[var16] < var13 + var15) {
                field486[var16] = true;
            }
        }
    }

    @ObfuscatedName("dy.bn(IIIII)V")
    public static final void method2667(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field548; var4++) {
            if (field490[var4] + field488[var4] > arg0 && field488[var4] < arg0 + arg2 && field489[var4] + field474[var4] > arg1 && field489[var4] < arg1 + arg3) {
                field485[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.bc(B)V")
    public static final void method49() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field422 - 1; var1++) {
                if (field371[var1] < 1000 && field371[var1 + 1] > 1000) {
                    String var2 = field428[var1];
                    field428[var1] = field428[var1 + 1];
                    field428[var1 + 1] = var2;
                    String var3 = field427[var1];
                    field427[var1] = field427[var1 + 1];
                    field427[var1 + 1] = var3;
                    int var4 = field371[var1];
                    field371[var1] = field371[var1 + 1];
                    field371[var1 + 1] = var4;
                    int var5 = field423[var1];
                    field423[var1] = field423[var1 + 1];
                    field423[var1 + 1] = var5;
                    int var6 = field424[var1];
                    field424[var1] = field424[var1 + 1];
                    field424[var1 + 1] = var6;
                    int var7 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field2966 != null || field495 != null) {
            return;
        }
        int var20;
        int var21;
        label224: {
            int var8 = class144.field2199;
            if (field421) {
                if (var8 != 1 && (Statics.field2118 || var8 != 4)) {
                    int var9 = class144.field2205;
                    int var10 = class144.field2211 * -117362325;
                    if (var9 < Statics.field1605 - 10 || var9 > Statics.field1930 + Statics.field1605 + 10 || var10 < Statics.field1469 - 10 || var10 > Statics.field2135 + Statics.field1469 + 10) {
                        field421 = false;
                        method2667(Statics.field1605, Statics.field1469, Statics.field1930, Statics.field2135);
                    }
                }
                if (var8 == 1 || !Statics.field2118 && var8 == 4) {
                    int var11 = Statics.field1605;
                    int var12 = Statics.field1469;
                    int var13 = Statics.field1930;
                    int var14 = class144.field2212;
                    int var15 = class144.field2214;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field422; var17++) {
                        int var18 = (field422 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method866(var16);
                    }
                    field421 = false;
                    method2667(Statics.field1605, Statics.field1469, Statics.field1930, Statics.field2135);
                }
            } else {
                if ((var8 == 1 || !Statics.field2118 && var8 == 4) && field422 > 0) {
                    int var19 = field371[field422 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field423[field422 - 1];
                        var21 = field424[field422 - 1];
                        class177 var22 = class177.method621(var21);
                        int var23 = method2725(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label224;
                        }
                        int var25 = method2725(var22);
                        boolean var26 = (var25 >> 29 & 0x1) != 0;
                        if (var26) {
                            break label224;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field2118 && var8 == 4) && (field509 == 1 && field422 > 2 || method713(field422 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field2118 && var8 == 4) && field422 > 0) {
                    method866(field422 - 1);
                }
                if (var8 == 2 && field422 > 0) {
                    method1622(class144.field2212, class144.field2214);
                }
            }
            return;
        }
        if (Statics.field2966 != null && !field400 && field509 != 1 && !method713(field422 - 1) && field422 > 0) {
            int var27 = field471;
            int var28 = field398;
            class33 var29 = Statics.field1243;
            method2870(var29.field716, var29.field714, var29.field715, var29.field718, var29.field717, var29.field717, var27, var28);
            Statics.field1243 = null;
        }
        field400 = false;
        field401 = 0;
        if (Statics.field2966 != null) {
            method1515(Statics.field2966);
        }
        Statics.field2966 = class177.method621(var21);
        field396 = var20;
        field471 = class144.field2212;
        field398 = class144.field2214;
        if (field422 > 0) {
            method1576(field422 - 1);
        }
        method1515(Statics.field2966);
    }

    @ObfuscatedName("cg.bo(IIB)V")
    public static final void method1622(int arg0, int arg1) {
        int var2 = Statics.field1681.method3849(class161.field2523);
        for (int var3 = 0; var3 < field422; var3++) {
            class228 var4 = Statics.field1681;
            String var5;
            if (field428[var3].length() > 0) {
                var5 = field427[var3] + class161.field2530 + field428[var3];
            } else {
                var5 = field427[var3];
            }
            int var6 = var4.method3849(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field422 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1500) {
            var8 = Statics.field1500 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field3176) {
            var9 = Statics.field3176 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field421 = true;
        Statics.field1605 = var8;
        Statics.field1469 = var9;
        Statics.field1930 = var2;
        Statics.field2135 = field422 * 15 + 22;
    }

    @ObfuscatedName("at.ba(II)Z")
    public static final boolean method713(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field371[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ak.bd(II)V")
    public static final void method866(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field423[arg0];
        int var2 = field424[arg0];
        int var3 = field371[arg0];
        int var4 = field426[arg0];
        String var5 = field427[arg0];
        String var6 = field428[arg0];
        method2870(var1, var2, var3, var4, var5, var6, class144.field2212, class144.field2214);
    }

    @ObfuscatedName("ee.bs(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2870(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class177 var8 = class177.method3054(arg1, arg0);
            if (var8 != null) {
                method1807();
                method688(arg1, arg0, class182.method1546(method2725(var8)), var8.field2834);
                field433 = 0;
                field438 = method645(var8);
                if (field438 == null) {
                    field438 = "Null";
                }
                if (var8.field2810) {
                    field439 = var8.field2884 + class2.method2986(16777215);
                } else {
                    field439 = class2.method2986(65280) + var8.field2927 + class2.method2986(16777215);
                }
            }
            return;
        }
        if (arg2 == 46) {
            class3 var9 = field510[arg3];
            if (var9 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(213);
                field324.method2441(arg3);
                field324.method2432(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class37 var10 = field319[arg3];
            if (var10 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(199);
                field324.method2513(arg3);
                field324.method2610(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var11 = field510[arg3];
            if (var11 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(219);
                field324.method2567(class141.field2168[82] ? 1 : 0);
                field324.method2513(arg3);
            }
        }
        if (arg2 == 28) {
            field324.method2670(25);
            field324.method2396(arg1);
            class177 var12 = class177.method621(arg1);
            if (var12.field2923 != null && var12.field2923[0][0] == 5) {
                int var13 = var12.field2923[0][1];
                class180.field2960[var13] = 1 - class180.field2960[var13];
                method3250(var13);
            }
        }
        if (arg2 == 8) {
            class37 var14 = field319[arg3];
            if (var14 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(88);
                field324.method2434(class141.field2168[82] ? 1 : 0);
                field324.method2441(field483);
                field324.method2574(Statics.field627);
                field324.method2441(arg3);
            }
        }
        if (arg2 == 37) {
            field324.method2670(39);
            field324.method2440(arg0);
            field324.method2396(arg1);
            field324.method2513(arg3);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 23) {
            Statics.field123.method1862(Statics.field1819, arg0, arg1);
        }
        if (arg2 == 40) {
            field324.method2670(252);
            field324.method2441(arg0);
            field324.method2440(arg3);
            field324.method2585(arg1);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 7) {
            class37 var15 = field319[arg3];
            if (var15 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(209);
                field324.method2513(Statics.field1945);
                field324.method2513(arg3);
                field324.method2396(Statics.field2041);
                field324.method2441(Statics.field1392);
                field324.method2432(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var16 = field510[arg3];
            if (var16 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(208);
                field324.method2441(arg3);
                field324.method2434(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field324.method2670(150);
            field324.method2427(arg1);
            field324.method2394(arg3);
            field324.method2513(arg0);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 35) {
            field324.method2670(203);
            field324.method2427(arg1);
            field324.method2440(arg3);
            field324.method2440(arg0);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 42) {
            field324.method2670(197);
            field324.method2427(arg1);
            field324.method2441(arg3);
            field324.method2513(arg0);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 26) {
            method2208();
        }
        if (arg2 == 47) {
            class3 var17 = field510[arg3];
            if (var17 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(104);
                field324.method2513(arg3);
                field324.method2434(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field324.method2670(189);
            field324.method2585(arg1);
            field324.method2441(arg0);
            field324.method2441(arg3);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 1003) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            class37 var18 = field319[arg3];
            if (var18 != null) {
                class42 var19 = var18.field793;
                if (var19.field915 != null) {
                    var19 = var19.method748();
                }
                if (var19 != null) {
                    field324.method2670(198);
                    field324.method2440(var19.field889);
                }
            }
        }
        if (arg2 == 29) {
            field324.method2670(25);
            field324.method2396(arg1);
            class177 var20 = class177.method621(arg1);
            if (var20.field2923 != null && var20.field2923[0][0] == 5) {
                int var21 = var20.field2923[0][1];
                if (class180.field2960[var21] != var20.field2925[0]) {
                    class180.field2960[var21] = var20.field2925[0];
                    method3250(var21);
                }
            }
        }
        if (arg2 == 21) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(183);
            field324.method2432(class141.field2168[82] ? 1 : 0);
            field324.method2441(arg3);
            field324.method2440(Statics.field2366 + arg1);
            field324.method2440(Statics.field676 + arg0);
        }
        if (arg2 == 15) {
            class3 var22 = field510[arg3];
            if (var22 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(7);
                field324.method2394(arg3);
                field324.method2394(field483);
                field324.method2432(class141.field2168[82] ? 1 : 0);
                field324.method2585(Statics.field627);
            }
        }
        if (arg2 == 51) {
            class3 var23 = field510[arg3];
            if (var23 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(90);
                field324.method2432(class141.field2168[82] ? 1 : 0);
                field324.method2441(arg3);
            }
        }
        if (arg2 == 12) {
            class37 var24 = field319[arg3];
            if (var24 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(4);
                field324.method2567(class141.field2168[82] ? 1 : 0);
                field324.method2441(arg3);
            }
        }
        if (arg2 == 3) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(86);
            field324.method2441(Statics.field2366 + arg1);
            field324.method2513(arg3 >> 14 & 0x7FFF);
            field324.method2610(class141.field2168[82] ? 1 : 0);
            field324.method2440(Statics.field676 + arg0);
        }
        if (arg2 == 30 && field444 == null) {
            method145(arg1, arg0);
            field444 = class177.method3054(arg1, arg0);
            method1515(field444);
        }
        if (arg2 == 9) {
            class37 var25 = field319[arg3];
            if (var25 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(254);
                field324.method2567(class141.field2168[82] ? 1 : 0);
                field324.method2440(arg3);
            }
        }
        if (arg2 == 31) {
            field324.method2670(125);
            field324.method2394(Statics.field1945);
            field324.method2440(arg3);
            field324.method2394(arg0);
            field324.method2396(arg1);
            field324.method2441(Statics.field1392);
            field324.method2585(Statics.field2041);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 44) {
            class3 var26 = field510[arg3];
            if (var26 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(176);
                field324.method2441(arg3);
                field324.method2434(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(103);
            field324.method2567(class141.field2168[82] ? 1 : 0);
            field324.method2513(Statics.field676 + arg0);
            field324.method2440(Statics.field2366 + arg1);
            field324.method2513(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 33) {
            field324.method2670(71);
            field324.method2574(arg1);
            field324.method2394(arg3);
            field324.method2440(arg0);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 1002) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field324.method2670(30);
            field324.method2513(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(239);
            field324.method2440(Statics.field2366 + arg1);
            field324.method2513(Statics.field676 + arg0);
            field324.method2441(Statics.field1392);
            field324.method2394(Statics.field1945);
            field324.method2440(arg3 >> 14 & 0x7FFF);
            field324.method2585(Statics.field2041);
            field324.method2434(class141.field2168[82] ? 1 : 0);
        }
        if (arg2 == 22) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(177);
            field324.method2440(Statics.field676 + arg0);
            field324.method2394(arg3);
            field324.method2441(Statics.field2366 + arg1);
            field324.method2434(class141.field2168[82] ? 1 : 0);
        }
        if (arg2 == 1004) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field324.method2670(225);
            field324.method2441(arg3);
        }
        if (arg2 == 20) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(222);
            field324.method2513(Statics.field676 + arg0);
            field324.method2394(Statics.field2366 + arg1);
            field324.method2432(class141.field2168[82] ? 1 : 0);
            field324.method2394(arg3);
        }
        if (arg2 == 1001) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(82);
            field324.method2394(Statics.field2366 + arg1);
            field324.method2432(class141.field2168[82] ? 1 : 0);
            field324.method2513(arg3 >> 14 & 0x7FFF);
            field324.method2513(Statics.field676 + arg0);
        }
        if (arg2 == 36) {
            field324.method2670(224);
            field324.method2394(arg0);
            field324.method2394(arg3);
            field324.method2574(arg1);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 45) {
            class3 var27 = field510[arg3];
            if (var27 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(147);
                field324.method2440(arg3);
                field324.method2567(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class177 var28 = class177.method621(arg1);
            if (var28 == null || var28.field2860[arg0] < 100000) {
                field324.method2670(225);
                field324.method2441(arg3);
            } else {
                class12.method558(27, "", var28.field2860[arg0] + " x " + class56.method709(arg3).field1158);
            }
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 58) {
            class177 var29 = class177.method3054(arg1, arg0);
            if (var29 != null) {
                field324.method2670(96);
                field324.method2513(field437);
                field324.method2513(arg0);
                field324.method2427(Statics.field627);
                field324.method2396(arg1);
                field324.method2394(field483);
                field324.method2394(var29.field2834);
            }
        }
        if (arg2 == 41) {
            field324.method2670(142);
            field324.method2585(arg1);
            field324.method2394(arg3);
            field324.method2513(arg0);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 18) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(141);
            field324.method2394(Statics.field2366 + arg1);
            field324.method2567(class141.field2168[82] ? 1 : 0);
            field324.method2440(arg3);
            field324.method2440(Statics.field676 + arg0);
        }
        if (arg2 == 5) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(54);
            field324.method2513(Statics.field2366 + arg1);
            field324.method2441(arg3 >> 14 & 0x7FFF);
            field324.method2610(class141.field2168[82] ? 1 : 0);
            field324.method2440(Statics.field676 + arg0);
        }
        if (arg2 == 49) {
            class3 var30 = field510[arg3];
            if (var30 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(241);
                field324.method2610(class141.field2168[82] ? 1 : 0);
                field324.method2440(arg3);
            }
        }
        if (arg2 == 2) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(172);
            field324.method2567(class141.field2168[82] ? 1 : 0);
            field324.method2440(field483);
            field324.method2441(Statics.field2366 + arg1);
            field324.method2396(Statics.field627);
            field324.method2513(arg3 >> 14 & 0x7FFF);
            field324.method2441(Statics.field676 + arg0);
        }
        if (arg2 == 4) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(134);
            field324.method2394(arg3 >> 14 & 0x7FFF);
            field324.method2440(Statics.field676 + arg0);
            field324.method2441(Statics.field2366 + arg1);
            field324.method2432(class141.field2168[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class37 var31 = field319[arg3];
            if (var31 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(218);
                field324.method2441(arg3);
                field324.method2567(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field324.method2670(70);
            field324.method2513(arg3);
            field324.method2440(arg0);
            field324.method2585(arg1);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 14) {
            class3 var32 = field510[arg3];
            if (var32 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(234);
                field324.method2394(Statics.field1392);
                field324.method2440(arg3);
                field324.method2396(Statics.field2041);
                field324.method2394(Statics.field1945);
                field324.method2432(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(135);
            field324.method2441(arg3);
            field324.method2394(Statics.field676 + arg0);
            field324.method2610(class141.field2168[82] ? 1 : 0);
            field324.method2585(Statics.field2041);
            field324.method2441(Statics.field1945);
            field324.method2440(Statics.field1392);
            field324.method2394(Statics.field2366 + arg1);
        }
        if (arg2 == 32) {
            field324.method2670(66);
            field324.method2513(field483);
            field324.method2574(Statics.field627);
            field324.method2427(arg1);
            field324.method2440(arg0);
            field324.method2513(arg3);
            field394 = 0;
            Statics.field2726 = class177.method621(arg1);
            field395 = arg0;
        }
        if (arg2 == 11) {
            class37 var33 = field319[arg3];
            if (var33 != null) {
                field335 = arg6;
                field391 = arg7;
                field466 = 2;
                field392 = 0;
                field302 = arg0;
                field515 = arg1;
                field324.method2670(98);
                field324.method2440(arg3);
                field324.method2567(class141.field2168[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method1807();
            class177 var34 = class177.method621(arg1);
            field433 = 1;
            Statics.field1392 = arg0;
            Statics.field2041 = arg1;
            Statics.field1945 = arg3;
            method1515(var34);
            field434 = class2.method2986(16748608) + class56.method709(arg3).field1158 + class2.method2986(16777215);
            if (field434 == null) {
                field434 = "null";
            }
            return;
        }
        if (arg2 == 24) {
            class177 var35 = class177.method621(arg1);
            boolean var36 = true;
            if (var35.field2887 > 0) {
                var36 = method2351(var35);
            }
            if (var36) {
                field324.method2670(25);
                field324.method2396(arg1);
            }
        }
        if (arg2 == 17) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(12);
            field324.method2440(Statics.field2366 + arg1);
            field324.method2610(class141.field2168[82] ? 1 : 0);
            field324.method2394(field483);
            field324.method2574(Statics.field627);
            field324.method2440(arg3);
            field324.method2441(Statics.field676 + arg0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var37 = class177.method3054(arg1, arg0);
            if (var37 != null) {
                method191(arg3, arg1, arg0, var37.field2834, arg5);
            }
        }
        if (arg2 == 19) {
            field335 = arg6;
            field391 = arg7;
            field466 = 2;
            field392 = 0;
            field302 = arg0;
            field515 = arg1;
            field324.method2670(73);
            field324.method2441(arg3);
            field324.method2440(Statics.field2366 + arg1);
            field324.method2434(class141.field2168[82] ? 1 : 0);
            field324.method2440(Statics.field676 + arg0);
        }
        if (field433 != 0) {
            field433 = 0;
            method1515(class177.method621(Statics.field2041));
        }
        if (field405) {
            method1807();
        }
        if (Statics.field2726 != null && field394 == 0) {
            method1515(Statics.field2726);
        }
    }

    @ObfuscatedName("a.bt(ILjava/lang/String;I)V")
    public static void method193(int arg0, String arg1) {
        int var2 = class35.field761;
        int[] var3 = class35.field756;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field510[var3[var5]];
            if (var6 != null && Statics.field1067 != var6 && var6.field28 != null && var6.field28.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field324.method2670(176);
                    field324.method2441(var3[var5]);
                    field324.method2434(0);
                } else if (arg0 == 4) {
                    field324.method2670(104);
                    field324.method2513(var3[var5]);
                    field324.method2434(0);
                } else if (arg0 == 6) {
                    field324.method2670(241);
                    field324.method2610(0);
                    field324.method2440(var3[var5]);
                } else if (arg0 == 7) {
                    field324.method2670(219);
                    field324.method2567(0);
                    field324.method2513(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method558(4, "", class161.field2519 + arg1);
        }
    }

    @ObfuscatedName("ao.bi(IIIIB)V")
    public static void method688(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method3054(arg0, arg1);
        if (var4 != null && var4.field2902 != null) {
            class1 var5 = new class1();
            var5.field8 = var4;
            var5.field9 = var4.field2902;
            class39.method2994(var5, 200000);
        }
        field437 = arg3;
        field405 = true;
        Statics.field627 = arg0;
        field483 = arg1;
        Statics.field2750 = arg2;
        method1515(var4);
    }

    @ObfuscatedName("cq.bv(S)V")
    public static void method1807() {
        if (!field405) {
            return;
        }
        class177 var0 = class177.method3054(Statics.field627, field483);
        if (var0 != null && var0.field2903 != null) {
            class1 var1 = new class1();
            var1.field8 = var0;
            var1.field9 = var0.field2903;
            class39.method2994(var1, 200000);
        }
        field405 = false;
        method1515(var0);
    }

    @ObfuscatedName("q.by(IIB)V")
    public static void method145(int arg0, int arg1) {
        field324.method2670(48);
        field324.method2513(arg1);
        field324.method2427(arg0);
    }

    @ObfuscatedName("a.bm(IIIILjava/lang/String;B)V")
    public static void method191(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class177 var5 = class177.method3054(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2805 != null) {
            class1 var6 = new class1();
            var6.field8 = var5;
            var6.field12 = arg0;
            var6.field10 = arg4;
            var6.field9 = var5.field2805;
            class39.method2994(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2887 > 0) {
            var7 = method2351(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2725(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field324.method2670(105);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 2) {
            field324.method2670(115);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 3) {
            field324.method2670(232);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 4) {
            field324.method2670(94);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 5) {
            field324.method2670(181);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 6) {
            field324.method2670(215);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 7) {
            field324.method2670(109);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 8) {
            field324.method2670(255);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 9) {
            field324.method2670(51);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
        if (arg0 == 10) {
            field324.method2670(175);
            field324.method2396(arg1);
            field324.method2394(arg2);
            field324.method2394(arg3);
        }
    }

    @ObfuscatedName("s.bj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method168(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field421 || field422 >= 500) {
            return;
        }
        field427[field422] = arg0;
        field428[field422] = arg1;
        field371[field422] = arg2;
        field426[field422] = arg3;
        field423[field422] = arg4;
        field424[field422] = arg5;
        field422++;
    }

    @ObfuscatedName("av.br(B)V")
    public static void method940() {
        for (int var0 = 0; var0 < field422; var0++) {
            if (method2726(field371[var0])) {
                if (var0 < field422 - 1) {
                    for (int var1 = var0; var1 < field422 - 1; var1++) {
                        field427[var1] = field427[var1 + 1];
                        field428[var1] = field428[var1 + 1];
                        field371[var1] = field371[var1 + 1];
                        field426[var1] = field426[var1 + 1];
                        field423[var1] = field423[var1 + 1];
                        field424[var1] = field424[var1 + 1];
                    }
                }
                field422--;
            }
        }
    }

    @ObfuscatedName("ef.cm(II)Z")
    public static boolean method2726(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("an.ca(Lam;IIIB)V")
    public static final void method620(class42 arg0, int arg1, int arg2, int arg3) {
        if (field422 >= 400) {
            return;
        }
        if (arg0.field915 != null) {
            arg0 = arg0.method748();
        }
        if (arg0 == null || !arg0.field918 || arg0.field888 && field448 != arg1) {
            return;
        }
        String var4 = arg0.field890;
        if (arg0.field907 != 0) {
            var4 = var4 + method2527(arg0.field907, Statics.field1067.field32) + " " + class2.field19 + class161.field2526 + arg0.field907 + class2.field20;
        }
        if (field433 == 1) {
            method168(class161.field2502, field434 + " " + class2.field21 + " " + class2.method2986(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field405) {
            String[] var5 = arg0.field905;
            if (field294) {
                var5 = method1516(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class161.field2522)) {
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
                        method168(var5[var6], class2.method2986(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class161.field2522)) {
                        short var9 = 0;
                        if (field308 != class22.field578) {
                            if (field308 == class22.field576 || field308 == class22.field575 && arg0.field907 > Statics.field1067.field32) {
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
                            method168(var5[var8], class2.method2986(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method168(class161.field2521, class2.method2986(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2750 & 0x2) == 2) {
            method168(field438, field439 + " " + class2.field21 + " " + class2.method2986(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dp.cd(IIB)Ljava/lang/String;")
    public static final String method2527(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2986(16711680);
        } else if (var2 < -6) {
            return class2.method2986(16723968);
        } else if (var2 < -3) {
            return class2.method2986(16740352);
        } else if (var2 < 0) {
            return class2.method2986(16756736);
        } else if (var2 > 9) {
            return class2.method2986(65280);
        } else if (var2 > 6) {
            return class2.method2986(4259584);
        } else if (var2 > 3) {
            return class2.method2986(8453888);
        } else if (var2 > 0) {
            return class2.method2986(12648192);
        } else {
            return class2.method2986(16776960);
        }
    }

    @ObfuscatedName("a.ck(IIIIIIIII)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method3201(arg0)) {
            Statics.field171 = null;
            method41(Statics.field2905[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field171 != null) {
                method41(Statics.field171, -1412584499, arg1, arg2, arg3, arg4, Statics.field1828, Statics.field124, arg7);
                Statics.field171 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field485[var8] = true;
            }
        } else {
            field485[arg7] = true;
        }
    }

    @ObfuscatedName("j.cj([Lfj;IIIIIIIII)V")
    public static final void method41(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1722(arg2, arg3, arg4, arg5);
        class95.method2023();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2854 == arg1 || arg1 == -1412584499 && field495 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field488[field548] = var10.field2897 + arg6;
                    field489[field548] = var10.field2825 + arg7;
                    field490[field548] = var10.field2826;
                    field474[field548] = var10.field2827;
                    var11 = ++field548 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2942 = var11;
                var10.field2818 = field291;
                if (!var10.field2810 || !method697(var10)) {
                    if (var10.field2887 > 0) {
                        int var12 = var10.field2887;
                        if (var12 == 324) {
                            if (field546 == -1) {
                                field546 = var10.field2846;
                                field498 = var10.field2841;
                            }
                            if (field554.field2972) {
                                var10.field2846 = field546;
                            } else {
                                var10.field2846 = field498;
                            }
                        } else if (var12 == 325) {
                            if (field546 == -1) {
                                field546 = var10.field2846;
                                field498 = var10.field2841;
                            }
                            if (field554.field2972) {
                                var10.field2846 = field498;
                            } else {
                                var10.field2846 = field546;
                            }
                        } else if (var12 == 327) {
                            var10.field2862 = 150;
                            var10.field2863 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2911 = 5;
                            var10.field2855 = 0;
                        } else if (var12 == 328) {
                            var10.field2862 = 150;
                            var10.field2863 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2911 = 5;
                            var10.field2855 = 1;
                        }
                    }
                    int var13 = var10.field2897 + arg6;
                    int var14 = var10.field2825 + arg7;
                    int var15 = var10.field2842;
                    if (field495 == var10) {
                        if (arg1 != -1412584499 && !var10.field2839) {
                            Statics.field171 = arg0;
                            Statics.field1828 = arg6;
                            Statics.field124 = arg7;
                            continue;
                        }
                        if (field549 && field458) {
                            int var16 = class144.field2205;
                            int var17 = class144.field2211 * -117362325;
                            int var18 = var16 - field455;
                            int var19 = var17 - field456;
                            if (var18 < field311) {
                                var18 = field311;
                            }
                            if (var10.field2826 + var18 > field311 + field454.field2826) {
                                var18 = field311 + field454.field2826 - var10.field2826;
                            }
                            if (var19 < field460) {
                                var19 = field460;
                            }
                            if (var10.field2827 + var19 > field460 + field454.field2827) {
                                var19 = field460 + field454.field2827 - var10.field2827;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2839) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2838 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2838 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2826 + var13;
                        int var27 = var10.field2827 + var14;
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
                        int var30 = var10.field2826 + var13;
                        int var31 = var10.field2827 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2810 || var20 < var22 && var21 < var23) {
                        if (var10.field2887 != 0) {
                            if (var10.field2887 == 1336) {
                                if (field297) {
                                    var14 += 15;
                                    Statics.field2348.method3795("Fps:" + field2253, var10.field2826 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field315) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field315) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2348.method3795("Mem:" + var33 + "k", var10.field2826 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2887 == 1337) {
                                field429 = var13;
                                field511 = var14;
                                Statics.method43(var13, var14, var10.field2826, var10.field2827);
                                field485[var10.field2942] = true;
                                class83.method1722(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2887 == 1338) {
                                method153(var10, var13, var14, var11);
                                class83.method1722(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2887 == 1339) {
                                class179 var35 = var10.method3231(false);
                                if (var35 != null) {
                                    if (field516 < 3) {
                                        Statics.field144.method1636(var13, var14, var35.field2954, var35.field2953, 25, 25, field367, 256, var35.field2955, var35.field2957);
                                    } else {
                                        class83.method1741(var13, var14, 0, var35.field2955, var35.field2957);
                                    }
                                }
                                class83.method1722(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2838 == 0) {
                            if (!var10.field2810 && method697(var10) && Statics.field1181 != var10) {
                                continue;
                            }
                            if (!var10.field2810) {
                                if (var10.field2833 > var10.field2835 - var10.field2827) {
                                    var10.field2833 = var10.field2835 - var10.field2827;
                                }
                                if (var10.field2833 < 0) {
                                    var10.field2833 = 0;
                                }
                            }
                            method41(arg0, var10.field2857, var20, var21, var22, var23, var13 - var10.field2832, var14 - var10.field2833, var11);
                            if (var10.field2935 != null) {
                                method41(var10.field2935, var10.field2857, var20, var21, var22, var23, var13 - var10.field2832, var14 - var10.field2833, var11);
                            }
                            class4 var36 = (class4) field407.method3580((long) var10.field2857);
                            if (var36 != null) {
                                method187(var36.field55, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class83.method1722(arg2, arg3, arg4, arg5);
                            class95.method2023();
                        }
                        if (field494 || field487[var11] || field492 > 1) {
                            if (var10.field2838 == 0 && !var10.field2810 && var10.field2835 > var10.field2827) {
                                method3150(var10.field2826 + var13, var14, var10.field2833, var10.field2827, var10.field2835);
                            }
                            if (var10.field2838 != 1) {
                                if (var10.field2838 == 2) {
                                    int var37 = 0;
                                    for (int var38 = 0; var38 < var10.field2823; var38++) {
                                        for (int var39 = 0; var39 < var10.field2885; var39++) {
                                            int var40 = (var10.field2919 + 32) * var39 + var13;
                                            int var41 = (var10.field2878 + 32) * var38 + var14;
                                            if (var37 < 20) {
                                                var40 += var10.field2879[var37];
                                                var41 += var10.field2880[var37];
                                            }
                                            if (var10.field2803[var37] > 0) {
                                                boolean var42 = false;
                                                boolean var43 = false;
                                                int var44 = var10.field2803[var37] - 1;
                                                if (var40 + 32 > arg2 && var40 < arg4 && var41 + 32 > arg3 && var41 < arg5 || Statics.field2966 == var10 && field396 == var37) {
                                                    class82 var45;
                                                    if (field433 == 1 && Statics.field1392 == var37 && Statics.field2041 == var10.field2857) {
                                                        var45 = class56.method1055(var44, var10.field2860[var37], 2, 0, 2, false);
                                                    } else {
                                                        var45 = class56.method1055(var44, var10.field2860[var37], 1, 3153952, 2, false);
                                                    }
                                                    if (var45 == null) {
                                                        method1515(var10);
                                                    } else if (Statics.field2966 == var10 && field396 == var37) {
                                                        int var46 = class144.field2205 - field471;
                                                        int var47 = class144.field2211 * -117362325 - field398;
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (field401 < 5) {
                                                            var46 = 0;
                                                            var47 = 0;
                                                        }
                                                        var45.method1627(var40 + var46, var41 + var47, 128);
                                                        if (arg1 != -1) {
                                                            class177 var48 = arg0[arg1 & 0xFFFF];
                                                            if (var41 + var47 < class83.field1451 && var48.field2833 > 0) {
                                                                int var49 = field330 * (class83.field1451 - var41 - var47) / 3;
                                                                if (var49 > field330 * 10) {
                                                                    var49 = field330 * 10;
                                                                }
                                                                if (var49 > var48.field2833) {
                                                                    var49 = var48.field2833;
                                                                }
                                                                var48.field2833 -= var49;
                                                                field398 += var49;
                                                                method1515(var48);
                                                            }
                                                            if (var41 + var47 + 32 > class83.field1452 && var48.field2833 < var48.field2835 - var48.field2827) {
                                                                int var50 = field330 * (var41 + var47 + 32 - class83.field1452) / 3;
                                                                if (var50 > field330 * 10) {
                                                                    var50 = field330 * 10;
                                                                }
                                                                if (var50 > var48.field2835 - var48.field2827 - var48.field2833) {
                                                                    var50 = var48.field2835 - var48.field2827 - var48.field2833;
                                                                }
                                                                var48.field2833 += var50;
                                                                field398 -= var50;
                                                                method1515(var48);
                                                            }
                                                        }
                                                    } else if (Statics.field2726 == var10 && field395 == var37) {
                                                        var45.method1627(var40, var41, 128);
                                                    } else {
                                                        var45.method1637(var40, var41);
                                                    }
                                                }
                                            } else if (var10.field2881 != null && var37 < 20) {
                                                class82 var51 = var10.method3211(var37);
                                                if (var51 != null) {
                                                    var51.method1637(var40, var41);
                                                } else if (class177.field2809) {
                                                    method1515(var10);
                                                }
                                            }
                                            var37++;
                                        }
                                    }
                                } else if (var10.field2838 == 3) {
                                    int var52;
                                    if (method890(var10)) {
                                        var52 = var10.field2837;
                                        if (Statics.field1181 == var10 && var10.field2938 != 0) {
                                            var52 = var10.field2938;
                                        }
                                    } else {
                                        var52 = var10.field2917;
                                        if (Statics.field1181 == var10 && var10.field2891 != 0) {
                                            var52 = var10.field2891;
                                        }
                                    }
                                    if (var10.field2840) {
                                        switch(var10.field2813.field1473) {
                                            case 1:
                                                class83.method1790(var13, var14, var10.field2826, var10.field2827, var10.field2917, var10.field2837, 256 - (var10.field2842 & 0xFF), 256 - (var10.field2843 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1724(var13, var14, var10.field2826, var10.field2827, var10.field2917, var10.field2837, 256 - (var10.field2842 & 0xFF), 256 - (var10.field2843 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1787(var13, var14, var10.field2826, var10.field2827, var10.field2917, var10.field2837, 256 - (var10.field2842 & 0xFF), 256 - (var10.field2843 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1732(var13, var14, var10.field2826, var10.field2827, var10.field2917, var10.field2837, 256 - (var10.field2842 & 0xFF), 256 - (var10.field2843 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class83.method1728(var13, var14, var10.field2826, var10.field2827, var52);
                                                } else {
                                                    class83.method1753(var13, var14, var10.field2826, var10.field2827, var52, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class83.method1734(var13, var14, var10.field2826, var10.field2827, var52);
                                    } else {
                                        class83.method1789(var13, var14, var10.field2826, var10.field2827, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2838 == 4) {
                                    class228 var53 = var10.method3210();
                                    if (var53 != null) {
                                        String var54 = var10.field2871;
                                        int var55;
                                        if (method890(var10)) {
                                            var55 = var10.field2837;
                                            if (Statics.field1181 == var10 && var10.field2938 != 0) {
                                                var55 = var10.field2938;
                                            }
                                            if (var10.field2836.length() > 0) {
                                                var54 = var10.field2836;
                                            }
                                        } else {
                                            var55 = var10.field2917;
                                            if (Statics.field1181 == var10 && var10.field2891 != 0) {
                                                var55 = var10.field2891;
                                            }
                                        }
                                        if (var10.field2810 && var10.field2834 != -1) {
                                            class56 var56 = class56.method709(var10.field2834);
                                            var54 = var56.field1158;
                                            if (var54 == null) {
                                                var54 = "null";
                                            }
                                            if ((var56.field1209 == 1 || var10.field2932 != 1) && var10.field2932 != -1) {
                                                var54 = class2.method2986(16748608) + var54 + class2.field23 + " " + 'x' + Statics.method117(var10.field2932);
                                            }
                                        }
                                        if (field444 == var10) {
                                            class161 var10000 = (class161) null;
                                            var54 = class161.field2527;
                                            var55 = var10.field2917;
                                        }
                                        if (!var10.field2810) {
                                            var54 = method3782(var54, var10);
                                        }
                                        var53.method3850(var54, var13, var14, var10.field2826, var10.field2827, var55, var10.field2896 ? 0 : -1, var10.field2934, var10.field2817, var10.field2824);
                                    } else if (class177.field2809) {
                                        method1515(var10);
                                    }
                                } else if (var10.field2838 == 5) {
                                    if (var10.field2810) {
                                        class82 var58;
                                        if (var10.field2834 == -1) {
                                            var58 = var10.method3209(false);
                                        } else {
                                            var58 = class56.method1055(var10.field2834, var10.field2932, var10.field2850, var10.field2851, var10.field2943, false);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field1441;
                                            int var60 = var58.field1442;
                                            if (var10.field2847) {
                                                class83.method1723(var13, var14, var10.field2826 + var13, var10.field2827 + var14);
                                                int var61 = (var10.field2826 + (var59 - 1)) / var59;
                                                int var62 = (var10.field2827 + (var60 - 1)) / var60;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var10.field2920 != 0) {
                                                            var58.method1650(var59 / 2 + var59 * var63 + var13, var60 / 2 + var60 * var64 + var14, var10.field2920, 4096);
                                                        } else if (var15 == 0) {
                                                            var58.method1637(var59 * var63 + var13, var60 * var64 + var14);
                                                        } else {
                                                            var58.method1627(var59 * var63 + var13, var60 * var64 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1722(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var65 = var10.field2826 * 4096 / var59;
                                                if (var10.field2920 != 0) {
                                                    var58.method1650(var10.field2826 / 2 + var13, var10.field2827 / 2 + var14, var10.field2920, var65);
                                                } else if (var15 != 0) {
                                                    var58.method1645(var13, var14, var10.field2826, var10.field2827, 256 - (var15 & 0xFF));
                                                } else if (var10.field2826 == var59 && var10.field2827 == var60) {
                                                    var58.method1637(var13, var14);
                                                } else {
                                                    var58.method1671(var13, var14, var10.field2826, var10.field2827);
                                                }
                                            }
                                        } else if (class177.field2809) {
                                            method1515(var10);
                                        }
                                    } else {
                                        class82 var57 = var10.method3209(method890(var10));
                                        if (var57 != null) {
                                            var57.method1637(var13, var14);
                                        } else if (class177.field2809) {
                                            method1515(var10);
                                        }
                                    }
                                } else if (var10.field2838 == 6) {
                                    boolean var66 = method890(var10);
                                    int var67;
                                    if (var66) {
                                        var67 = var10.field2822;
                                    } else {
                                        var67 = var10.field2858;
                                    }
                                    class109 var68 = null;
                                    int var69 = 0;
                                    if (var10.field2834 != -1) {
                                        class56 var70 = class56.method709(var10.field2834);
                                        if (var70 != null) {
                                            class56 var71 = var70.method1126(var10.field2932);
                                            var68 = var71.method1096(1);
                                            if (var68 == null) {
                                                method1515(var10);
                                            } else {
                                                var68.method2250();
                                                var69 = var68.field1504 / 2;
                                            }
                                        }
                                    } else if (var10.field2911 == 5) {
                                        if (var10.field2855 == 0) {
                                            var68 = field554.method3285((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var68 = Statics.field1067.method17();
                                        }
                                    } else if (var67 == -1) {
                                        var68 = var10.method3212((class45) null, -1, var66, Statics.field1067.field34);
                                        if (var68 == null && class177.field2809) {
                                            method1515(var10);
                                        }
                                    } else {
                                        class45 var72 = class45.method2337(var67);
                                        var68 = var10.method3212(var72, var10.field2933, var66, Statics.field1067.field34);
                                        if (var68 == null && class177.field2809) {
                                            method1515(var10);
                                        }
                                    }
                                    class95.method2011(var10.field2826 / 2 + var13, var10.field2827 / 2 + var14);
                                    int var73 = var10.field2865 * class95.field1640[var10.field2862] >> 16;
                                    int var74 = var10.field2865 * class95.field1641[var10.field2862] >> 16;
                                    if (var68 != null) {
                                        if (var10.field2810) {
                                            var68.method2250();
                                            if (var10.field2868) {
                                                var68.method2236(0, var10.field2863, var10.field2901, var10.field2862, var10.field2874, var10.field2861 + var69 + var73, var10.field2861 + var74, var10.field2865);
                                            } else {
                                                var68.method2226(0, var10.field2863, var10.field2901, var10.field2862, var10.field2874, var10.field2861 + var69 + var73, var10.field2861 + var74);
                                            }
                                        } else {
                                            var68.method2226(0, var10.field2863, 0, var10.field2862, 0, var73, var74);
                                        }
                                    }
                                    class95.method2010();
                                } else {
                                    if (var10.field2838 == 7) {
                                        class228 var75 = var10.method3210();
                                        if (var75 == null) {
                                            if (class177.field2809) {
                                                method1515(var10);
                                            }
                                            continue;
                                        }
                                        int var76 = 0;
                                        for (int var77 = 0; var77 < var10.field2823; var77++) {
                                            for (int var78 = 0; var78 < var10.field2885; var78++) {
                                                if (var10.field2803[var76] > 0) {
                                                    class56 var79 = class56.method709(var10.field2803[var76] - 1);
                                                    String var80;
                                                    if (var79.field1209 != 1 && var10.field2860[var76] == 1) {
                                                        var80 = class2.method2986(16748608) + var79.field1158 + class2.field23;
                                                    } else {
                                                        var80 = class2.method2986(16748608) + var79.field1158 + class2.field23 + " " + 'x' + Statics.method117(var10.field2860[var76]);
                                                    }
                                                    int var81 = (var10.field2919 + 115) * var78 + var13;
                                                    int var82 = (var10.field2878 + 12) * var77 + var14;
                                                    if (var10.field2934 == 0) {
                                                        var75.method3829(var80, var81, var82, var10.field2917, var10.field2896 ? 0 : -1);
                                                    } else if (var10.field2934 == 1) {
                                                        var75.method3796(var80, var10.field2826 / 2 + var81, var82, var10.field2917, var10.field2896 ? 0 : -1);
                                                    } else {
                                                        var75.method3795(var80, var10.field2826 + var81 - 1, var82, var10.field2917, var10.field2896 ? 0 : -1);
                                                    }
                                                }
                                                var76++;
                                            }
                                        }
                                    }
                                    if (var10.field2838 == 8 && Statics.field1435 == var10 && field432 == field431) {
                                        int var83 = 0;
                                        int var84 = 0;
                                        class228 var85 = Statics.field2348;
                                        String var86 = var10.field2871;
                                        String var87 = method3782(var86, var10);
                                        while (var87.length() > 0) {
                                            int var88 = var87.indexOf(class2.field25);
                                            String var89;
                                            if (var88 == -1) {
                                                var89 = var87;
                                                var87 = "";
                                            } else {
                                                var89 = var87.substring(0, var88);
                                                var87 = var87.substring(var88 + 4);
                                            }
                                            int var90 = var85.method3849(var89);
                                            if (var90 > var83) {
                                                var83 = var90;
                                            }
                                            var84 += var85.field3241 + 1;
                                        }
                                        var83 += 6;
                                        var84 += 7;
                                        int var91 = var10.field2826 + var13 - 5 - var83;
                                        int var92 = var10.field2827 + var14 + 5;
                                        if (var91 < var13 + 5) {
                                            var91 = var13 + 5;
                                        }
                                        if (var83 + var91 > arg4) {
                                            var91 = arg4 - var83;
                                        }
                                        if (var84 + var92 > arg5) {
                                            var92 = arg5 - var84;
                                        }
                                        class83.method1728(var91, var92, var83, var84, 16777120);
                                        class83.method1734(var91, var92, var83, var84, 0);
                                        String var93 = var10.field2871;
                                        int var94 = var85.field3241 + var92 + 2;
                                        String var95 = method3782(var93, var10);
                                        while (var95.length() > 0) {
                                            int var96 = var95.indexOf(class2.field25);
                                            String var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = "";
                                            } else {
                                                var97 = var95.substring(0, var96);
                                                var95 = var95.substring(var96 + 4);
                                            }
                                            var85.method3829(var97, var91 + 3, var94, 0, -1);
                                            var94 += var85.field3241 + 1;
                                        }
                                    }
                                    if (var10.field2838 == 9) {
                                        if (var10.field2844 == 1) {
                                            int var98;
                                            int var99;
                                            int var100;
                                            int var101;
                                            if (var10.field2875) {
                                                var98 = var13;
                                                var99 = var10.field2827 + var14;
                                                var100 = var10.field2826 + var13;
                                                var101 = var14;
                                            } else {
                                                var98 = var13;
                                                var99 = var14;
                                                var100 = var10.field2826 + var13;
                                                var101 = var10.field2827 + var14;
                                            }
                                            class83.method1740(var98, var99, var100, var101, var10.field2917);
                                        } else {
                                            int var102 = var10.field2826 >= 0 ? var10.field2826 : -var10.field2826;
                                            int var103 = var10.field2827 >= 0 ? var10.field2827 : -var10.field2827;
                                            int var104 = var102;
                                            if (var102 < var103) {
                                                var104 = var103;
                                            }
                                            if (var104 != 0) {
                                                int var105 = (var10.field2826 << 16) / var104;
                                                int var106 = (var10.field2827 << 16) / var104;
                                                if (var106 <= var105) {
                                                    var105 = -var105;
                                                } else {
                                                    var106 = -var106;
                                                }
                                                int var107 = var10.field2844 * var106 >> 17;
                                                int var108 = var10.field2844 * var106 + 1 >> 17;
                                                int var109 = var10.field2844 * var105 >> 17;
                                                int var110 = var10.field2844 * var105 + 1 >> 17;
                                                int var111 = var13 + var107;
                                                int var112 = var13 - var108;
                                                int var113 = var10.field2826 + var13 - var108;
                                                int var114 = var10.field2826 + var13 + var107;
                                                int var115 = var14 + var109;
                                                int var116 = var14 - var110;
                                                int var117 = var10.field2827 + var14 - var110;
                                                int var118 = var10.field2827 + var14 + var109;
                                                class95.method2016(var111, var112, var113);
                                                class95.method2019(var115, var116, var117, var111, var112, var113, var10.field2917);
                                                class95.method2016(var111, var113, var114);
                                                class95.method2019(var115, var117, var118, var111, var113, var114, var10.field2917);
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

    @ObfuscatedName("hj.cb(Ljava/lang/String;Lfj;I)Ljava/lang/String;")
    public static String method3782(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2761(method109(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2190 != null) {
                    var5 = class167.method2202(Statics.field2190.field2273);
                    if (Statics.field2190.field2271 != null) {
                        var5 = (String) Statics.field2190.field2271;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("h.cw(Lfj;I)V")
    public static void method182(class177 arg0) {
        class177 var1 = arg0.field2854 == -1 ? null : class177.method621(arg0.field2854);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1500;
            var3 = Statics.field3176;
        } else {
            var2 = var1.field2826;
            var3 = var1.field2827;
        }
        method233(arg0, var2, var3, false);
        method2005(arg0, var2, var3);
    }

    @ObfuscatedName("n.cx([Lfj;Lfj;ZI)V")
    public static void method547(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2815 == 0 ? arg1.field2826 : arg1.field2815;
        int var4 = arg1.field2835 == 0 ? arg1.field2827 : arg1.field2835;
        method346(arg0, arg1.field2857, var3, var4, arg2);
        if (arg1.field2935 != null) {
            method346(arg1.field2935, arg1.field2857, var3, var4, arg2);
        }
        class4 var5 = (class4) field407.method3580((long) arg1.field2857);
        if (var5 != null) {
            int var6 = var5.field55;
            if (class177.method3201(var6)) {
                method346(Statics.field2905[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2887 == 1337) {
        }
    }

    @ObfuscatedName("client.cl([Lfj;IIIZS)V")
    public static void method346(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2854 == arg1) {
                method233(var6, arg2, arg3, arg4);
                method2005(var6, arg2, arg3);
                if (var6.field2832 > var6.field2815 - var6.field2826) {
                    var6.field2832 = var6.field2815 - var6.field2826;
                }
                if (var6.field2832 < 0) {
                    var6.field2832 = 0;
                }
                if (var6.field2833 > var6.field2835 - var6.field2827) {
                    var6.field2833 = var6.field2835 - var6.field2827;
                }
                if (var6.field2833 < 0) {
                    var6.field2833 = 0;
                }
                if (var6.field2838 == 0) {
                    method547(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("e.ci(Lfj;IIZB)V")
    public static void method233(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2826;
        int var5 = arg0.field2827;
        if (arg0.field2811 == 0) {
            arg0.field2826 = arg0.field2885;
        } else if (arg0.field2811 == 1) {
            arg0.field2826 = arg1 - arg0.field2885;
        } else if (arg0.field2811 == 2) {
            arg0.field2826 = arg0.field2885 * arg1 >> 14;
        }
        if (arg0.field2819 == 0) {
            arg0.field2827 = arg0.field2823;
        } else if (arg0.field2819 == 1) {
            arg0.field2827 = arg2 - arg0.field2823;
        } else if (arg0.field2819 == 2) {
            arg0.field2827 = arg0.field2823 * arg2 >> 14;
        }
        if (arg0.field2811 == 4) {
            arg0.field2826 = arg0.field2926 * arg0.field2827 / arg0.field2829;
        }
        if (arg0.field2819 == 4) {
            arg0.field2827 = arg0.field2829 * arg0.field2826 / arg0.field2926;
        }
        if (field450 && arg0.field2838 == 0) {
            if (arg0.field2827 < 5 && arg0.field2826 < 5) {
                arg0.field2827 = 5;
                arg0.field2826 = 5;
            } else {
                if (arg0.field2827 <= 0) {
                    arg0.field2827 = 5;
                }
                if (arg0.field2826 <= 0) {
                    arg0.field2826 = 5;
                }
            }
        }
        if (arg0.field2887 == 1337) {
            field464 = arg0;
        }
        if (arg3 && arg0.field2828 != null && (arg0.field2826 != var4 || arg0.field2827 != var5)) {
            class1 var6 = new class1();
            var6.field8 = arg0;
            var6.field9 = arg0.field2828;
            field479.method3594(var6);
        }
    }

    @ObfuscatedName("ch.ct(Lfj;III)V")
    public static void method2005(class177 arg0, int arg1, int arg2) {
        if (arg0.field2910 == 0) {
            arg0.field2897 = arg0.field2820;
        } else if (arg0.field2910 == 1) {
            arg0.field2897 = (arg1 - arg0.field2826) / 2 + arg0.field2820;
        } else if (arg0.field2910 == 2) {
            arg0.field2897 = arg1 - arg0.field2826 - arg0.field2820;
        } else if (arg0.field2910 == 3) {
            arg0.field2897 = arg0.field2820 * arg1 >> 14;
        } else if (arg0.field2910 == 4) {
            arg0.field2897 = (arg0.field2820 * arg1 >> 14) + (arg1 - arg0.field2826) / 2;
        } else {
            arg0.field2897 = arg1 - arg0.field2826 - (arg0.field2820 * arg1 >> 14);
        }
        if (arg0.field2921 == 0) {
            arg0.field2825 = arg0.field2821;
        } else if (arg0.field2921 == 1) {
            arg0.field2825 = (arg2 - arg0.field2827) / 2 + arg0.field2821;
        } else if (arg0.field2921 == 2) {
            arg0.field2825 = arg2 - arg0.field2827 - arg0.field2821;
        } else if (arg0.field2921 == 3) {
            arg0.field2825 = arg0.field2821 * arg2 >> 14;
        } else if (arg0.field2921 == 4) {
            arg0.field2825 = (arg0.field2821 * arg2 >> 14) + (arg2 - arg0.field2827) / 2;
        } else {
            arg0.field2825 = arg2 - arg0.field2827 - (arg0.field2821 * arg2 >> 14);
        }
        if (!field450 || arg0.field2838 != 0) {
            return;
        }
        if (arg0.field2897 < 0) {
            arg0.field2897 = 0;
        } else if (arg0.field2897 + arg0.field2826 > arg1) {
            arg0.field2897 = arg1 - arg0.field2826;
        }
        if (arg0.field2825 < 0) {
            arg0.field2825 = 0;
        } else if (arg0.field2827 + arg0.field2825 > arg2) {
            arg0.field2825 = arg2 - arg0.field2827;
        }
    }

    @ObfuscatedName("fp.cf(IIIIII)V")
    public static final void method3150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2293[0].method1793(arg0, arg1);
        Statics.field2293[1].method1793(arg0, arg1 + arg3 - 16);
        class83.method1728(arg0, arg1 + 16, 16, arg3 - 32, field360);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class83.method1728(arg0, arg1 + 16 + var6, 16, var5, field361);
        class83.method1738(arg0, arg1 + 16 + var6, var5, field556);
        class83.method1738(arg0 + 1, arg1 + 16 + var6, var5, field556);
        class83.method1731(arg0, arg1 + 16 + var6, 16, field556);
        class83.method1731(arg0, arg1 + 17 + var6, 16, field556);
        class83.method1738(arg0 + 15, arg1 + 16 + var6, var5, field362);
        class83.method1738(arg0 + 14, arg1 + 17 + var6, var5 - 1, field362);
        class83.method1731(arg0, arg1 + 15 + var6 + var5, 16, field362);
        class83.method1731(arg0 + 1, arg1 + 14 + var6 + var5, 15, field362);
    }

    @ObfuscatedName("ek.cn(II)Ljava/lang/String;")
    public static final String method2761(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ar.ch(Lfj;B)Z")
    public static final boolean method890(class177 arg0) {
        if (arg0.field2924 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2924.length; var1++) {
            int var2 = method109(arg0, var1);
            int var3 = arg0.field2925[var1];
            if (arg0.field2924[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2924[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2924[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("p.cp(Lfj;II)I")
    public static final int method109(class177 arg0, int arg1) {
        if (arg0.field2923 == null || arg1 >= arg0.field2923.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2923[arg1];
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
                    var7 = field418[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field465[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class177 var11 = class177.method621(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method709(var12).field1178 || field286)) {
                        for (int var13 = 0; var13 < var11.field2803.length; var13++) {
                            if (var12 + 1 == var11.field2803[var13]) {
                                var7 += var11.field2860[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2960[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2352[field418[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2960[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1067.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2353[var14]) {
                            var7 += field418[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method621(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method709(var18).field1178 || field286)) {
                        for (int var19 = 0; var19 < var17.field2803.length; var19++) {
                            if (var18 + 1 == var17.field2803[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field445;
                }
                if (var6 == 12) {
                    var7 = field528;
                }
                if (var6 == 13) {
                    int var20 = class180.field2960[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method870(var22);
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
                    var7 = (Statics.field1067.field852 >> 7) + Statics.field676;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1067.field869 >> 7) + Statics.field2366;
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

    @ObfuscatedName("client.cc(Lfj;III)V")
    public static final void method501(class177 arg0, int arg1, int arg2) {
        if (arg0.field2814 == 1) {
            method168(arg0.field2928, "", 24, 0, 0, arg0.field2857);
        }
        if (arg0.field2814 == 2 && !field405) {
            String var3 = method645(arg0);
            if (var3 != null) {
                method168(var3, class2.method2986(65280) + arg0.field2927, 25, 0, -1, arg0.field2857);
            }
        }
        if (arg0.field2814 == 3) {
            method168(class161.field2575, "", 26, 0, 0, arg0.field2857);
        }
        if (arg0.field2814 == 4) {
            method168(arg0.field2928, "", 28, 0, 0, arg0.field2857);
        }
        if (arg0.field2814 == 5) {
            method168(arg0.field2928, "", 29, 0, 0, arg0.field2857);
        }
        if (arg0.field2814 == 6 && field444 == null) {
            method168(arg0.field2928, "", 30, 0, -1, arg0.field2857);
        }
        if (arg0.field2838 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2827; var5++) {
                for (int var6 = 0; var6 < arg0.field2826; var6++) {
                    int var7 = (arg0.field2919 + 32) * var6;
                    int var8 = (arg0.field2878 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2879[var4];
                        var8 += arg0.field2880[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field399 = var4;
                        Statics.field209 = arg0;
                        if (arg0.field2803[var4] > 0) {
                            label282: {
                                class56 var9 = class56.method709(arg0.field2803[var4] - 1);
                                if (field433 == 1) {
                                    int var10 = method2725(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2041 != arg0.field2857 || Statics.field1392 != var4) {
                                            method168(class161.field2502, field434 + " " + class2.field21 + " " + class2.method2986(16748608) + var9.field1158, 31, var9.field1163, var4, arg0.field2857);
                                        }
                                        break label282;
                                    }
                                }
                                if (field405) {
                                    int var12 = method2725(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2750 & 0x10) == 16) {
                                            method168(field438, field439 + " " + class2.field21 + " " + class2.method2986(16748608) + var9.field1158, 32, var9.field1163, var4, arg0.field2857);
                                        }
                                        break label282;
                                    }
                                }
                                String[] var14 = var9.field1188;
                                if (field294) {
                                    var14 = method1516(var14);
                                }
                                int var15 = method2725(arg0);
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
                                            method168(var14[var17], class2.method2986(16748608) + var9.field1158, var18, var9.field1163, var4, arg0.field2857);
                                        } else if (var17 == 4) {
                                            method168(class161.field2374, class2.method2986(16748608) + var9.field1158, 37, var9.field1163, var4, arg0.field2857);
                                        }
                                    }
                                }
                                class182 var10000 = (class182) null;
                                if (class182.method2999(method2725(arg0))) {
                                    method168(class161.field2502, class2.method2986(16748608) + var9.field1158, 38, var9.field1163, var4, arg0.field2857);
                                }
                                int var19 = method2725(arg0);
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
                                            method168(var14[var21], class2.method2986(16748608) + var9.field1158, var22, var9.field1163, var4, arg0.field2857);
                                        }
                                    }
                                }
                                String[] var23 = arg0.field2882;
                                if (field294) {
                                    var23 = method1516(var23);
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
                                            method168(var23[var24], class2.method2986(16748608) + var9.field1158, var25, var9.field1163, var4, arg0.field2857);
                                        }
                                    }
                                }
                                method168(class161.field2521, class2.method2986(16748608) + var9.field1158, 1005, var9.field1163, var4, arg0.field2857);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2810) {
            return;
        }
        if (!field405) {
            for (int var26 = 9; var26 >= 5; var26--) {
                String var27 = method180(arg0, var26);
                if (var27 != null) {
                    method168(var27, arg0.field2884, 1007, var26 + 1, arg0.field2812, arg0.field2857);
                }
            }
            String var28 = method645(arg0);
            if (var28 != null) {
                method168(var28, arg0.field2884, 25, 0, arg0.field2812, arg0.field2857);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = method180(arg0, var29);
                if (var30 != null) {
                    method168(var30, arg0.field2884, 57, var29 + 1, arg0.field2812, arg0.field2857);
                }
            }
            int var31 = method2725(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method168(class161.field2378, "", 30, 0, arg0.field2812, arg0.field2857);
            }
        } else if (class182.method889(method2725(arg0)) && (Statics.field2750 & 0x20) == 32) {
            method168(field438, field439 + " " + class2.field21 + " " + arg0.field2884, 58, 0, arg0.field2812, arg0.field2857);
        }
    }

    @ObfuscatedName("dt.cu([Lfj;IIIIIIII)V")
    public static final void method2348(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2810 || var9.field2838 == 0 || var9.field2830 || method2725(var9) != 0 || field454 == var9 || var9.field2887 == 1338) && var9.field2854 == arg1 && (!var9.field2810 || !method697(var9))) {
                int var10 = var9.field2897 + arg6;
                int var11 = var9.field2825 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2838 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2838 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2826 + var10;
                    int var19 = var9.field2827 + var11;
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
                    int var22 = var9.field2826 + var10;
                    int var23 = var9.field2827 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field495 == var9) {
                    field461 = true;
                    field299 = var10;
                    field463 = var11;
                }
                if (!var9.field2810 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2205;
                    int var25 = class144.field2211 * -117362325;
                    if (class144.field2199 != 0) {
                        var24 = class144.field2212;
                        var25 = class144.field2214;
                    }
                    if (var9.field2887 == 1337) {
                        if (!field290 && !field421 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field433 == 0 && !field405) {
                                method168(class161.field2552, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1914; var28++) {
                                int var29 = class109.field1915[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field123.method1855(Statics.field1819, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method12(var33);
                                        if (var34.field971 != null) {
                                            var34 = var34.method776();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field433 == 1) {
                                            method168(class161.field2502, field434 + " " + class2.field21 + " " + class2.method2986(65535) + var34.field934, 1, var29, var30, var31);
                                        } else if (!field405) {
                                            String[] var35 = var34.field951;
                                            if (field294) {
                                                var35 = method1516(var35);
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
                                                        method168(var35[var36], class2.method2986(65535) + var34.field934, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method168(class161.field2521, class2.method2986(65535) + var34.field934, 1002, var34.field948 << 14, var30, var31);
                                        } else if ((Statics.field2750 & 0x4) == 4) {
                                            method168(field438, field439 + " " + class2.field21 + " " + class2.method2986(65535) + var34.field934, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field319[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field793.field903 == 1 && (var38.field852 & 0x7F) == 64 && (var38.field869 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field320; var39++) {
                                                class37 var40 = field319[field321[var39]];
                                                if (var40 != null && var38 != var40 && var40.field793.field903 == 1 && var38.field852 == var40.field852 && var38.field869 == var40.field869) {
                                                    method620(var40.field793, field321[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field761;
                                            int[] var42 = class35.field756;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field510[var42[var43]];
                                                if (var44 != null && var38.field852 == var44.field852 && var38.field869 == var44.field869) {
                                                    Statics.method3778(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method620(var38.field793, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field510[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field852 & 0x7F) == 64 && (var45.field869 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field320; var46++) {
                                                class37 var47 = field319[field321[var46]];
                                                if (var47 != null && var47.field793.field903 == 1 && var45.field852 == var47.field852 && var45.field869 == var47.field869) {
                                                    method620(var47.field793, field321[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field761;
                                            int[] var49 = class35.field756;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field510[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field852 == var51.field852 && var45.field869 == var51.field869) {
                                                    Statics.method3778(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field412 == var33) {
                                            var26 = var29;
                                        } else {
                                            Statics.method3778(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field413[Statics.field1819][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3617(); var53 != null; var53 = (class31) var52.method3603()) {
                                                class56 var54 = class56.method709(var53.field693);
                                                if (field433 == 1) {
                                                    method168(class161.field2502, field434 + " " + class2.field21 + " " + class2.method2986(16748608) + var54.field1158, 16, var53.field693, var30, var31);
                                                } else if (!field405) {
                                                    String[] var55 = var54.field1179;
                                                    if (field294) {
                                                        var55 = method1516(var55);
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
                                                            method168(var55[var56], class2.method2986(16748608) + var54.field1158, var57, var53.field693, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method168(class161.field2424, class2.method2986(16748608) + var54.field1158, 20, var53.field693, var30, var31);
                                                        }
                                                    }
                                                    method168(class161.field2521, class2.method2986(16748608) + var54.field1158, 1004, var53.field693, var30, var31);
                                                } else if ((Statics.field2750 & 0x1) == 1) {
                                                    method168(field438, field439 + " " + class2.field21 + " " + class2.method2986(16748608) + var54.field1158, 17, var53.field693, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field510[field412];
                                Statics.method3778(var60, field412, var58, var59);
                            }
                        }
                    } else if (var9.field2887 == 1338) {
                        method633(var9, var10, var11);
                    } else {
                        if (!field421 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method501(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2838 == 0) {
                            if (!var9.field2810 && method697(var9) && Statics.field1181 != var9) {
                                continue;
                            }
                            method2348(arg0, var9.field2857, var12, var13, var14, var15, var10 - var9.field2832, var11 - var9.field2833);
                            if (var9.field2935 != null) {
                                method2348(var9.field2935, var9.field2857, var12, var13, var14, var15, var10 - var9.field2832, var11 - var9.field2833);
                            }
                            class4 var61 = (class4) field407.method3580((long) var9.field2857);
                            if (var61 != null) {
                                if (var61.field54 == 0 && class144.field2205 >= var12 && class144.field2211 * -117362325 >= var13 && class144.field2205 < var14 && class144.field2211 * -117362325 < var15 && !field421 && !field450) {
                                    for (class1 var62 = (class1) field479.method3600(); var62 != null; var62 = (class1) field479.method3602()) {
                                        if (var62.field15) {
                                            var62.method3695();
                                            var62.field8.field2936 = false;
                                        }
                                    }
                                    if (Statics.field212 == 0) {
                                        field495 = null;
                                        field454 = null;
                                    }
                                    if (!field421) {
                                        field427[0] = class161.field2609;
                                        field428[0] = "";
                                        field371[0] = 1006;
                                        field422 = 1;
                                    }
                                }
                                int var63 = var61.field55;
                                if (class177.method3201(var63)) {
                                    method2348(Statics.field2905[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2810) {
                            if (var9.field2944) {
                                if (class144.field2205 >= var12 && class144.field2211 * -117362325 >= var13 && class144.field2205 < var14 && class144.field2211 * -117362325 < var15) {
                                    for (class1 var64 = (class1) field479.method3600(); var64 != null; var64 = (class1) field479.method3602()) {
                                        if (var64.field15) {
                                            var64.method3695();
                                            var64.field8.field2936 = false;
                                        }
                                    }
                                    if (Statics.field212 == 0) {
                                        field495 = null;
                                        field454 = null;
                                    }
                                    if (!field421) {
                                        field427[0] = class161.field2609;
                                        field428[0] = "";
                                        field371[0] = 1006;
                                        field422 = 1;
                                    }
                                }
                            } else if (var9.field2945 && class144.field2205 >= var12 && class144.field2211 * -117362325 >= var13 && class144.field2205 < var14 && class144.field2211 * -117362325 < var15) {
                                for (class1 var65 = (class1) field479.method3600(); var65 != null; var65 = (class1) field479.method3602()) {
                                    if (var65.field15 && var65.field8.field2912 == var65.field9) {
                                        var65.method3695();
                                    }
                                }
                            }
                            boolean var66;
                            if (class144.field2205 >= var12 && class144.field2211 * -117362325 >= var13 && class144.field2205 < var14 && class144.field2211 * -117362325 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class144.field2204 == 1 || !Statics.field2118 && class144.field2204 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class144.field2199 == 1 || !Statics.field2118 && class144.field2199 == 4) && class144.field2212 >= var12 && class144.field2214 >= var13 && class144.field2212 < var14 && class144.field2214 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method2115(var9, class144.field2212 - var10, class144.field2214 - var11);
                            }
                            if (field495 != null && field495 != var9 && var66 && class182.method584(method2725(var9))) {
                                field457 = var9;
                            }
                            if (field454 == var9) {
                                field458 = true;
                                field311 = var10;
                                field460 = var11;
                            }
                            if (var9.field2830) {
                                if (var66 && field478 != 0 && var9.field2912 != null) {
                                    class1 var69 = new class1();
                                    var69.field15 = true;
                                    var69.field8 = var9;
                                    var69.field5 = field478;
                                    var69.field9 = var9.field2912;
                                    field479.method3594(var69);
                                }
                                if (field495 != null || Statics.field2966 != null || field421) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2937 && var68) {
                                    var9.field2937 = true;
                                    if (var9.field2893 != null) {
                                        class1 var70 = new class1();
                                        var70.field15 = true;
                                        var70.field8 = var9;
                                        var70.field4 = class144.field2212 - var10;
                                        var70.field5 = class144.field2214 - var11;
                                        var70.field9 = var9.field2893;
                                        field479.method3594(var70);
                                    }
                                }
                                if (var9.field2937 && var67 && var9.field2849 != null) {
                                    class1 var71 = new class1();
                                    var71.field15 = true;
                                    var71.field8 = var9;
                                    var71.field4 = class144.field2205 - var10;
                                    var71.field5 = class144.field2211 * -117362325 - var11;
                                    var71.field9 = var9.field2849;
                                    field479.method3594(var71);
                                }
                                if (var9.field2937 && !var67) {
                                    var9.field2937 = false;
                                    if (var9.field2895 != null) {
                                        class1 var72 = new class1();
                                        var72.field15 = true;
                                        var72.field8 = var9;
                                        var72.field4 = class144.field2205 - var10;
                                        var72.field5 = class144.field2211 * -117362325 - var11;
                                        var72.field9 = var9.field2895;
                                        field481.method3594(var72);
                                    }
                                }
                                if (var67 && var9.field2914 != null) {
                                    class1 var73 = new class1();
                                    var73.field15 = true;
                                    var73.field8 = var9;
                                    var73.field4 = class144.field2205 - var10;
                                    var73.field5 = class144.field2211 * -117362325 - var11;
                                    var73.field9 = var9.field2914;
                                    field479.method3594(var73);
                                }
                                if (!var9.field2936 && var66) {
                                    var9.field2936 = true;
                                    if (var9.field2859 != null) {
                                        class1 var74 = new class1();
                                        var74.field15 = true;
                                        var74.field8 = var9;
                                        var74.field4 = class144.field2205 - var10;
                                        var74.field5 = class144.field2211 * -117362325 - var11;
                                        var74.field9 = var9.field2859;
                                        field479.method3594(var74);
                                    }
                                }
                                if (var9.field2936 && var66 && var9.field2898 != null) {
                                    class1 var75 = new class1();
                                    var75.field15 = true;
                                    var75.field8 = var9;
                                    var75.field4 = class144.field2205 - var10;
                                    var75.field5 = class144.field2211 * -117362325 - var11;
                                    var75.field9 = var9.field2898;
                                    field479.method3594(var75);
                                }
                                if (var9.field2936 && !var66) {
                                    var9.field2936 = false;
                                    if (var9.field2899 != null) {
                                        class1 var76 = new class1();
                                        var76.field15 = true;
                                        var76.field8 = var9;
                                        var76.field4 = class144.field2205 - var10;
                                        var76.field5 = class144.field2211 * -117362325 - var11;
                                        var76.field9 = var9.field2899;
                                        field481.method3594(var76);
                                    }
                                }
                                if (var9.field2816 != null) {
                                    class1 var77 = new class1();
                                    var77.field8 = var9;
                                    var77.field9 = var9.field2816;
                                    field480.method3594(var77);
                                }
                                if (var9.field2904 != null && field544 > var9.field2939) {
                                    if (var9.field2864 == null || field544 - var9.field2939 > 32) {
                                        class1 var82 = new class1();
                                        var82.field8 = var9;
                                        var82.field9 = var9.field2904;
                                        field479.method3594(var82);
                                    } else {
                                        label827: for (int var78 = var9.field2939; var78 < field544; var78++) {
                                            int var79 = field340[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2864.length; var80++) {
                                                if (var9.field2864[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field8 = var9;
                                                    var81.field9 = var9.field2904;
                                                    field479.method3594(var81);
                                                    break label827;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2939 = field544;
                                }
                                if (var9.field2877 != null && field558 > var9.field2940) {
                                    if (var9.field2907 == null || field558 - var9.field2940 > 32) {
                                        class1 var87 = new class1();
                                        var87.field8 = var9;
                                        var87.field9 = var9.field2877;
                                        field479.method3594(var87);
                                    } else {
                                        label803: for (int var83 = var9.field2940; var83 < field558; var83++) {
                                            int var84 = field468[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2907.length; var85++) {
                                                if (var9.field2907[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field8 = var9;
                                                    var86.field9 = var9.field2877;
                                                    field479.method3594(var86);
                                                    break label803;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2940 = field558;
                                }
                                if (var9.field2908 != null && field459 > var9.field2941) {
                                    if (var9.field2909 == null || field459 - var9.field2941 > 32) {
                                        class1 var92 = new class1();
                                        var92.field8 = var9;
                                        var92.field9 = var9.field2908;
                                        field479.method3594(var92);
                                    } else {
                                        label779: for (int var88 = var9.field2941; var88 < field459; var88++) {
                                            int var89 = field343[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2909.length; var90++) {
                                                if (var9.field2909[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field8 = var9;
                                                    var91.field9 = var9.field2908;
                                                    field479.method3594(var91);
                                                    break label779;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2941 = field459;
                                }
                                if (field472 > var9.field2804 && var9.field2913 != null) {
                                    class1 var93 = new class1();
                                    var93.field8 = var9;
                                    var93.field9 = var9.field2913;
                                    field479.method3594(var93);
                                }
                                if (field473 > var9.field2804 && var9.field2915 != null) {
                                    class1 var94 = new class1();
                                    var94.field8 = var9;
                                    var94.field9 = var9.field2915;
                                    field479.method3594(var94);
                                }
                                if (field535 > var9.field2804 && var9.field2916 != null) {
                                    class1 var95 = new class1();
                                    var95.field8 = var9;
                                    var95.field9 = var9.field2916;
                                    field479.method3594(var95);
                                }
                                if (field475 > var9.field2804 && var9.field2918 != null) {
                                    class1 var96 = new class1();
                                    var96.field8 = var9;
                                    var96.field9 = var9.field2918;
                                    field479.method3594(var96);
                                }
                                if (field497 > var9.field2804 && var9.field2922 != null) {
                                    class1 var97 = new class1();
                                    var97.field8 = var9;
                                    var97.field9 = var9.field2922;
                                    field479.method3594(var97);
                                }
                                if (field477 > var9.field2804 && var9.field2889 != null) {
                                    class1 var98 = new class1();
                                    var98.field8 = var9;
                                    var98.field9 = var9.field2889;
                                    field479.method3594(var98);
                                }
                                var9.field2804 = field533;
                                if (var9.field2848 != null) {
                                    for (int var99 = 0; var99 < field529; var99++) {
                                        class1 var100 = new class1();
                                        var100.field8 = var9;
                                        var100.field3 = field505[var99];
                                        var100.field2 = field446[var99];
                                        var100.field9 = var9.field2848;
                                        field479.method3594(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2810 && field495 == null && Statics.field2966 == null && !field421) {
                            if ((var9.field2866 >= 0 || var9.field2891 != 0) && class144.field2205 >= var12 && class144.field2211 * -117362325 >= var13 && class144.field2205 < var14 && class144.field2211 * -117362325 < var15) {
                                if (var9.field2866 >= 0) {
                                    Statics.field1181 = arg0[var9.field2866];
                                } else {
                                    Statics.field1181 = var9;
                                }
                            }
                            if (var9.field2838 == 8 && class144.field2205 >= var12 && class144.field2211 * -117362325 >= var13 && class144.field2205 < var14 && class144.field2211 * -117362325 < var15) {
                                Statics.field1435 = var9;
                            }
                            if (var9.field2835 > var9.field2827) {
                                int var101 = var9.field2826 + var10;
                                int var102 = var9.field2827;
                                int var103 = var9.field2835;
                                int var104 = class144.field2205;
                                int var105 = class144.field2211 * -117362325;
                                if (field430) {
                                    field365 = 32;
                                } else {
                                    field365 = 0;
                                }
                                field430 = false;
                                if (class144.field2204 == 1 || !Statics.field2118 && class144.field2204 == 4) {
                                    if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 && var105 < var11 + 16) {
                                        var9.field2833 -= 4;
                                        method1515(var9);
                                    } else if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 + var102 - 16 && var105 < var11 + var102) {
                                        var9.field2833 += 4;
                                        method1515(var9);
                                    } else if (var104 >= var101 - field365 && var104 < field365 + var101 + 16 && var105 >= var11 + 16 && var105 < var11 + var102 - 16) {
                                        int var106 = (var102 - 32) * var102 / var103;
                                        if (var106 < 8) {
                                            var106 = 8;
                                        }
                                        int var107 = var105 - var11 - 16 - var106 / 2;
                                        int var108 = var102 - 32 - var106;
                                        var9.field2833 = (var103 - var102) * var107 / var108;
                                        method1515(var9);
                                        field430 = true;
                                    }
                                }
                                if (field478 != 0) {
                                    int var109 = var9.field2826;
                                    if (var104 >= var101 - var109 && var105 >= var11 && var104 < var101 + 16 && var105 <= var11 + var102) {
                                        var9.field2833 += field478 * 45;
                                        method1515(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bf.cz([Lfj;II)V")
    public static final void method1028(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2838 == 0) {
                    if (var3.field2935 != null) {
                        method1028(var3.field2935, arg1);
                    }
                    class4 var4 = (class4) field407.method3580((long) var3.field2857);
                    if (var4 != null) {
                        int var5 = var4.field55;
                        if (class177.method3201(var5)) {
                            method1028(Statics.field2905[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2894 != null) {
                    class1 var6 = new class1();
                    var6.field8 = var3;
                    var6.field9 = var3.field2894;
                    class39.method2994(var6, 200000);
                }
                if (arg1 == 1 && var3.field2931 != null) {
                    if (var3.field2812 >= 0) {
                        class177 var7 = class177.method621(var3.field2857);
                        if (var7 == null || var7.field2935 == null || var3.field2812 >= var7.field2935.length || var7.field2935[var3.field2812] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field8 = var3;
                    var8.field9 = var3.field2931;
                    class39.method2994(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("cv.cs(Lfj;III)V")
    public static final void method2115(class177 arg0, int arg1, int arg2) {
        if (field495 != null || field421 || arg0 == null) {
            return;
        }
        class177 var3 = arg0;
        int var4 = method2725(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class177 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class177.method621(var3.field2854);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class177 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2886;
        }
        if (var9 == null) {
            return;
        }
        field495 = arg0;
        class177 var11 = arg0;
        int var12 = method2725(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class177 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class177.method621(var11.field2854);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class177 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2886;
        }
        field454 = var17;
        field455 = arg1;
        field456 = arg2;
        Statics.field212 = 0;
        field549 = false;
        if (field422 > 0) {
            int var19 = field422 - 1;
            Statics.field1243 = new class33();
            Statics.field1243.field716 = field423[var19];
            Statics.field1243.field714 = field424[var19];
            Statics.field1243.field715 = field371[var19];
            Statics.field1243.field718 = field426[var19];
            Statics.field1243.field717 = field427[var19];
        }
        return;
    }

    @ObfuscatedName("ca.cv(B)V")
    public static final void method1617() {
        method1515(field495);
        Statics.field212++;
        if (field461 && field458) {
            int var0 = class144.field2205;
            int var1 = class144.field2211 * -117362325;
            int var2 = var0 - field455;
            int var3 = var1 - field456;
            if (var2 < field311) {
                var2 = field311;
            }
            if (field495.field2826 + var2 > field311 + field454.field2826) {
                var2 = field311 + field454.field2826 - field495.field2826;
            }
            if (var3 < field460) {
                var3 = field460;
            }
            if (field495.field2827 + var3 > field460 + field454.field2827) {
                var3 = field460 + field454.field2827 - field495.field2827;
            }
            int var4 = var2 - field299;
            int var5 = var3 - field463;
            int var6 = field495.field2929;
            if (Statics.field212 > field495.field2888 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field549 = true;
            }
            int var7 = field454.field2832 + (var2 - field311);
            int var8 = field454.field2833 + (var3 - field460);
            if (field495.field2900 != null && field549) {
                class1 var9 = new class1();
                var9.field8 = field495;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field9 = field495.field2900;
                class39.method2994(var9, 200000);
            }
            if (class144.field2204 == 0) {
                if (field549) {
                    if (field495.field2869 != null) {
                        class1 var10 = new class1();
                        var10.field8 = field495;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field457;
                        var10.field9 = field495.field2869;
                        class39.method2994(var10, 200000);
                    }
                    if (field457 != null) {
                        class177 var11 = field495;
                        int var12 = method2725(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class177 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class177.method621(var11.field2854);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field324.method2670(205);
                            field324.method2396(field495.field2857);
                            field324.method2513(field495.field2834);
                            field324.method2441(field457.field2812);
                            field324.method2441(field457.field2834);
                            field324.method2394(field495.field2812);
                            field324.method2396(field457.field2857);
                        }
                    }
                } else if ((field509 == 1 || method713(field422 - 1)) && field422 > 2) {
                    method1622(field455 + field299, field463 + field456);
                } else if (field422 > 0) {
                    int var17 = field455 + field299;
                    int var18 = field463 + field456;
                    class33 var19 = Statics.field1243;
                    method2870(var19.field716, var19.field714, var19.field715, var19.field718, var19.field717, var19.field717, var17, var18);
                    Statics.field1243 = null;
                }
                field495 = null;
            }
        } else if (Statics.field212 > 1) {
            field495 = null;
        }
    }

    @ObfuscatedName("cm.ce(II)V")
    public static void method1576(int arg0) {
        Statics.field1243 = new class33();
        Statics.field1243.field716 = field423[arg0];
        Statics.field1243.field714 = field424[arg0];
        Statics.field1243.field715 = field371[arg0];
        Statics.field1243.field718 = field426[arg0];
        Statics.field1243.field717 = field427[arg0];
    }

    @ObfuscatedName("bm.co(Lfj;B)V")
    public static void method1515(class177 arg0) {
        if (field484 == arg0.field2818) {
            field485[arg0.field2942] = true;
        }
    }

    @ObfuscatedName("an.cr(B)V")
    public static void method619() {
        for (class4 var0 = (class4) field407.method3571(); var0 != null; var0 = (class4) field407.method3572()) {
            int var1 = var0.field55;
            if (class177.method3201(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2905[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2810;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3174;
                    class177 var6 = class177.method621(var5);
                    if (var6 != null) {
                        method1515(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.cy([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1516(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cq.dr([Lfj;II)V")
    public static final void method1805(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2854 == arg1 && (!var3.field2810 || !method697(var3))) {
                if (var3.field2838 == 0) {
                    if (!var3.field2810 && method697(var3) && Statics.field1181 != var3) {
                        continue;
                    }
                    method1805(arg0, var3.field2857);
                    if (var3.field2935 != null) {
                        method1805(var3.field2935, var3.field2857);
                    }
                    class4 var4 = (class4) field407.method3580((long) var3.field2857);
                    if (var4 != null) {
                        int var5 = var4.field55;
                        if (class177.method3201(var5)) {
                            method1805(Statics.field2905[var5], -1);
                        }
                    }
                }
                if (var3.field2838 == 6) {
                    if (var3.field2858 != -1 || var3.field2822 != -1) {
                        boolean var6 = method890(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2822;
                        } else {
                            var7 = var3.field2858;
                        }
                        if (var7 != -1) {
                            class45 var8 = class45.method2337(var7);
                            var3.field2946 += field330;
                            while (var3.field2946 > var8.field1000[var3.field2933]) {
                                var3.field2946 -= var8.field1000[var3.field2933];
                                var3.field2933++;
                                if (var3.field2933 >= var8.field1002.length) {
                                    var3.field2933 -= var8.field1003;
                                    if (var3.field2933 < 0 || var3.field2933 >= var8.field1002.length) {
                                        var3.field2933 = 0;
                                    }
                                }
                                method1515(var3);
                            }
                        }
                    }
                    if (var3.field2867 != 0 && !var3.field2810) {
                        int var9 = var3.field2867 >> 16;
                        int var10 = var3.field2867 << 16 >> 16;
                        int var11 = field330 * var9;
                        int var12 = field330 * var10;
                        var3.field2862 = var3.field2862 + var11 & 0x7FF;
                        var3.field2863 = var3.field2863 + var12 & 0x7FF;
                        method1515(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.du(II)V")
    public static final void method3250(int arg0) {
        method619();
        class25.method2();
        int var1 = class57.method699(arg0).field1212;
        if (var1 == 0) {
            return;
        }
        int var2 = class180.field2960[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class95.method2013(0.9D);
                ((class99) Statics.field1637).method2100(0.9D);
            }
            if (var2 == 2) {
                class95.method2013(0.8D);
                ((class99) Statics.field1637).method2100(0.8D);
            }
            if (var2 == 3) {
                class95.method2013(0.7D);
                ((class99) Statics.field1637).method2100(0.7D);
            }
            if (var2 == 4) {
                class95.method2013(0.6D);
                ((class99) Statics.field1637).method2100(0.6D);
            }
            class56.method14();
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
                    class187.method2627(Statics.field3109, field518, 0, var3, false);
                    field519 = false;
                } else if (var3 == 0) {
                    Statics.field3009.method3444();
                    class187.field3010 = 1;
                    Statics.field3011 = null;
                    field519 = false;
                } else if (class187.field3010 == 0) {
                    Statics.field3009.method3399(var3);
                } else {
                    Statics.field3012 = var3;
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
            field509 = var2;
        }
        if (var1 == 6) {
            field442 = var2;
        }
        if (var1 == 9) {
            field293 = var2;
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
            class22[] var4 = new class22[] { class22.field578, class22.field576, class22.field581, class22.field575 };
            field416 = (class22) class113.method99(var4, var2);
            if (field416 == null) {
                field416 = class22.field575;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field412 = -1;
            } else {
                field412 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class22[] var5 = new class22[] { class22.field578, class22.field576, class22.field581, class22.field575 };
        field308 = (class22) class113.method99(var5, var2);
        if (field308 == null) {
            field308 = class22.field575;
        }
    }

    @ObfuscatedName("dr.di(I)V")
    public static final void method2208() {
        field324.method2670(127);
        for (class4 var0 = (class4) field407.method3571(); var0 != null; var0 = (class4) field407.method3572()) {
            if (var0.field54 == 0 || var0.field54 == 3) {
                method1282(var0, true);
            }
        }
        if (field444 != null) {
            method1515(field444);
            field444 = null;
        }
    }

    @ObfuscatedName("bl.dj(Lz;ZI)V")
    public static final void method1282(class4 arg0, boolean arg1) {
        int var2 = arg0.field55;
        int var3 = (int) arg0.field3174;
        arg0.method3695();
        if (arg1) {
            class177.method2997(var2);
        }
        for (class205 var4 = (class205) field482.method3571(); var4 != null; var4 = (class205) field482.method3572()) {
            if ((var4.field3174 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3695();
            }
        }
        class177 var5 = class177.method621(var3);
        if (var5 != null) {
            method1515(var5);
        }
        method940();
        if (field559 != -1) {
            int var6 = field559;
            if (class177.method3201(var6)) {
                method1028(Statics.field2905[var6], 1);
            }
        }
    }

    @ObfuscatedName("dk.do(Lfj;I)Z")
    public static final boolean method2351(class177 arg0) {
        int var1 = arg0.field2887;
        if (var1 == 205) {
            field441 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field554.method3281(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field554.method3282(var4, var5 == 1);
        }
        if (var1 == 324) {
            field554.method3283(false);
        }
        if (var1 == 325) {
            field554.method3283(true);
        }
        if (var1 == 326) {
            field324.method2670(87);
            field554.method3284(field324);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.dw(Lfj;IIII)V")
    public static final void method153(class177 arg0, int arg1, int arg2, int arg3) {
        method2004();
        class179 var4 = arg0.method3231(false);
        if (var4 == null) {
            return;
        }
        class83.method1722(arg1, arg2, var4.field2954 + arg1, var4.field2953 + arg2);
        if (field516 == 2 || field516 == 5) {
            class83.method1741(arg1, arg2, 0, var4.field2955, var4.field2957);
        } else {
            int var5 = field367 + field352 & 0x7FF;
            int var6 = Statics.field1067.field852 / 32 + 48;
            int var7 = 464 - Statics.field1067.field869 / 32;
            Statics.field2206.method1636(arg1, arg2, var4.field2954, var4.field2953, var6, var7, var5, field354 + 256, var4.field2955, var4.field2957);
            for (int var8 = 0; var8 < field288; var8++) {
                int var9 = field452[var8] * 4 + 2 - Statics.field1067.field852 / 32;
                int var10 = field512[var8] * 4 + 2 - Statics.field1067.field869 / 32;
                method852(arg1, arg2, var9, var10, field513[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class203 var13 = field413[Statics.field1819][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1067.field852 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1067.field869 / 32;
                        method852(arg1, arg2, var14, var15, Statics.field451[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field320; var16++) {
                class37 var17 = field319[field321[var16]];
                if (var17 != null && var17.method23()) {
                    class42 var18 = var17.field793;
                    if (var18 != null && var18.field915 != null) {
                        var18 = var18.method748();
                    }
                    if (var18 != null && var18.field906 && var18.field918) {
                        int var19 = var17.field852 / 32 - Statics.field1067.field852 / 32;
                        int var20 = var17.field869 / 32 - Statics.field1067.field869 / 32;
                        method852(arg1, arg2, var19, var20, Statics.field451[1], var4);
                    }
                }
            }
            int var21 = class35.field761;
            int[] var22 = class35.field756;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field510[var22[var23]];
                if (var24 != null && var24.method23() && !var24.field30 && Statics.field1067 != var24) {
                    int var25 = var24.field852 / 32 - Statics.field1067.field852 / 32;
                    int var26 = var24.field869 / 32 - Statics.field1067.field869 / 32;
                    boolean var27 = false;
                    if (method2294(var24.field28, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field26; var29++) {
                        if (var24.field28.equals(Statics.field200[var29].field626)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field1067.field52 != 0 && var24.field52 != 0 && Statics.field1067.field52 == var24.field52) {
                        var30 = true;
                    }
                    if (var27) {
                        method852(arg1, arg2, var25, var26, Statics.field451[3], var4);
                    } else if (var30) {
                        method852(arg1, arg2, var25, var26, Statics.field451[4], var4);
                    } else if (var28) {
                        method852(arg1, arg2, var25, var26, Statics.field451[5], var4);
                    } else {
                        method852(arg1, arg2, var25, var26, Statics.field451[2], var4);
                    }
                }
            }
            if (field526 != 0 && field291 % 20 < 10) {
                if (field526 == 1 && field300 >= 0 && field300 < field319.length) {
                    class37 var31 = field319[field300];
                    if (var31 != null) {
                        int var32 = var31.field852 / 32 - Statics.field1067.field852 / 32;
                        int var33 = var31.field869 / 32 - Statics.field1067.field869 / 32;
                        method64(arg1, arg2, var32, var33, Statics.field943[1], var4);
                    }
                }
                if (field526 == 2) {
                    int var34 = field420 * 4 - Statics.field676 * 4 + 2 - Statics.field1067.field852 / 32;
                    int var35 = field303 * 4 - Statics.field2366 * 4 + 2 - Statics.field1067.field869 / 32;
                    method64(arg1, arg2, var34, var35, Statics.field943[1], var4);
                }
                if (field526 == 10 && field301 >= 0 && field301 < field510.length) {
                    class3 var36 = field510[field301];
                    if (var36 != null) {
                        int var37 = var36.field852 / 32 - Statics.field1067.field852 / 32;
                        int var38 = var36.field869 / 32 - Statics.field1067.field869 / 32;
                        method64(arg1, arg2, var37, var38, Statics.field943[1], var4);
                    }
                }
            }
            if (field302 != 0) {
                int var39 = field302 * 4 + 2 - Statics.field1067.field852 / 32;
                int var40 = field515 * 4 + 2 - Statics.field1067.field869 / 32;
                method852(arg1, arg2, var39, var40, Statics.field943[0], var4);
            }
            if (!Statics.field1067.field30) {
                class83.method1728(var4.field2954 / 2 + arg1 - 1, var4.field2953 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field486[arg3] = true;
    }

    @ObfuscatedName("b.dh(IIIILcd;Lfd;I)V")
    public static final void method64(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method852(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field367 + field352 & 0x7FF;
        int var8 = class95.field1640[var7];
        int var9 = class95.field1641[var7];
        int var10 = var8 * 256 / (field354 + 256);
        int var11 = var9 * 256 / (field354 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1413.method1649(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ak.dn(IIIILcd;Lfd;I)V")
    public static final void method852(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field367 + field352 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1640[var6];
        int var9 = class95.field1641[var6];
        int var10 = var8 * 256 / (field354 + 256);
        int var11 = var9 * 256 / (field354 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1703(arg5.field2954 / 2 + var12 - arg4.field1441 / 2, arg5.field2953 / 2 - var13 - arg4.field1442 / 2, arg0, arg1, arg5.field2954, arg5.field2953, arg5.field2955, arg5.field2957);
        } else {
            arg4.method1637(arg5.field2954 / 2 + arg0 + var12 - arg4.field1441 / 2, arg5.field2953 / 2 + arg1 - var13 - arg4.field1442 / 2);
        }
    }

    @ObfuscatedName("do.dq(Ljava/lang/String;ZB)Z")
    public static boolean method2294(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method120(arg0, Statics.field2088);
        for (int var3 = 0; var3 < field532; var3++) {
            if (var2.equalsIgnoreCase(class168.method120(field550[var3].field252, Statics.field2088)) && (!arg1 || field550[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method120(Statics.field1067.field28, Statics.field2088))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("et.db(Ljava/lang/String;S)Z")
    public static boolean method2813(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method120(arg0, Statics.field2088);
        for (int var2 = 0; var2 < field552; var2++) {
            class8 var3 = field553[var2];
            if (var1.equalsIgnoreCase(class168.method120(var3.field129, Statics.field2088))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method120(var3.field128, Statics.field2088))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("t.dd(Ljava/lang/String;I)V")
    public static final void method154(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method120(arg0, Statics.field2088);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field552; var2++) {
            class8 var3 = field553[var2];
            String var4 = var3.field129;
            String var5 = class168.method120(var4, Statics.field2088);
            if (class133.method2216(arg0, var1, var4, var5)) {
                field552--;
                for (int var6 = var2; var6 < field552; var6++) {
                    field553[var6] = field553[var6 + 1];
                }
                field473 = field533;
                field324.method2670(31);
                field324.method2567(class123.method826(arg0));
                field324.method2468(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("as.dt(Ljava/lang/String;II)V")
    public static final void method641(String arg0, int arg1) {
        field324.method2670(155);
        field324.method2567(class123.method826(arg0) + 1);
        field324.method2468(arg0);
        field324.method2567(arg1);
    }

    @ObfuscatedName("ef.dk(Lfj;I)I")
    public static int method2725(class177 arg0) {
        class205 var1 = (class205) field482.method3580(((long) arg0.field2857 << 32) + (long) arg0.field2812);
        return var1 == null ? arg0.field2883 : var1.field3159;
    }

    @ObfuscatedName("ao.dz(Lfj;I)Z")
    public static boolean method697(class177 arg0) {
        if (field450) {
            if (method2725(arg0) != 0) {
                return false;
            }
            if (arg0.field2838 == 0) {
                return false;
            }
        }
        return arg0.field2831;
    }

    @ObfuscatedName("h.dv(Lfj;IB)Ljava/lang/String;")
    public static String method180(class177 arg0, int arg1) {
        int var2 = method2725(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2805 == null) {
            return null;
        } else if (arg0.field2845 == null || arg0.field2845.length <= arg1 || arg0.field2845[arg1] == null || arg0.field2845[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2845[arg1];
        }
    }

    @ObfuscatedName("aq.de(Lfj;I)Ljava/lang/String;")
    public static String method645(class177 arg0) {
        if (class182.method1546(method2725(arg0)) == 0) {
            return null;
        } else if (arg0.field2890 == null || arg0.field2890.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2890;
        }
    }

    @ObfuscatedName("dx.dp(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2699(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field561 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field561 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field561 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field561 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field561 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field879 != null) {
            var3 = "/p=" + Statics.field879;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field282 + "/a=" + Statics.field1939 + var3 + "/";
    }

    @ObfuscatedName("bx.dl(Ljava/lang/String;I)V")
    public static void method1046(String arg0) {
        Statics.field879 = arg0;
        try {
            String var1 = Statics.field378.getParameter(class194.field3122.field3111);
            String var2 = Statics.field378.getParameter(class194.field3117.field3111);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class119.method698() + 94608000000L;
                class115.field2014.setTime(new Date(var6));
                int var8 = class115.field2014.get(7);
                int var9 = class115.field2014.get(5);
                int var10 = class115.field2014.get(2);
                int var11 = class115.field2014.get(1);
                int var12 = class115.field2014.get(11);
                int var13 = class115.field2014.get(12);
                int var14 = class115.field2014.get(13);
                String var15 = class115.field2013[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class115.field2016[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class136.method2742(Statics.field378, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("i.dy(Ljava/lang/String;ZI)V")
    public static void method50(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1143; var5++) {
            class56 var6 = class56.method709(var5);
            if ((!arg1 || var6.field1203) && var6.field1196 == -1 && var6.field1158.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field567 = -1;
                    Statics.field1612 = null;
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
        Statics.field1612 = var3;
        Statics.field1667 = 0;
        Statics.field567 = var4;
        String[] var9 = new String[Statics.field567];
        for (int var10 = 0; var10 < Statics.field567; var10++) {
            var9[var10] = class56.method709(var3[var10]).field1158;
        }
        Statics.method1580(var9, Statics.field1612);
    }
}

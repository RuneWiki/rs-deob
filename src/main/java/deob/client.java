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
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class145 {

    @ObfuscatedName("client.w")
    public static class109[] field339 = new class109[4];

    @ObfuscatedName("client.s")
    public static boolean field303 = true;

    @ObfuscatedName("client.p")
    public static int field280 = 1;

    @ObfuscatedName("client.h")
    public static int field281 = 0;

    @ObfuscatedName("client.a")
    public static int field283 = 0;

    @ObfuscatedName("client.m")
    public static boolean field285 = false;

    @ObfuscatedName("client.n")
    public static boolean field286 = false;

    @ObfuscatedName("client.i")
    public static int field287 = 0;

    @ObfuscatedName("client.b")
    public static int field288 = 0;

    @ObfuscatedName("client.q")
    public static boolean field289 = true;

    @ObfuscatedName("client.u")
    public static int field290 = 0;

    @ObfuscatedName("client.t")
    public static long field291 = 1L;

    @ObfuscatedName("client.z")
    public static int field292 = -1;

    @ObfuscatedName("client.v")
    public static int field486 = -1;

    @ObfuscatedName("client.aq")
    public static int field294 = -1;

    @ObfuscatedName("client.ap")
    public static boolean field313 = true;

    @ObfuscatedName("client.ai")
    public static boolean field296 = false;

    @ObfuscatedName("client.ae")
    public static int field431 = 0;

    @ObfuscatedName("client.az")
    public static int field298 = 0;

    @ObfuscatedName("client.ah")
    public static int field299 = 0;

    @ObfuscatedName("client.ar")
    public static int field300 = 0;

    @ObfuscatedName("client.ab")
    public static int field537 = 0;

    @ObfuscatedName("client.aj")
    public static int field347 = 0;

    @ObfuscatedName("client.ay")
    public static int field293 = 0;

    @ObfuscatedName("client.ag")
    public static int field304 = 0;

    @ObfuscatedName("client.av")
    public static int field305 = 0;

    @ObfuscatedName("client.aw")
    public static class21 field455 = class21.field570;

    @ObfuscatedName("client.ad")
    public static class21 field489 = class21.field570;

    @ObfuscatedName("client.ac")
    public static int field451 = 0;

    @ObfuscatedName("client.au")
    public static int field310 = 0;

    @ObfuscatedName("client.at")
    public static int field386 = 0;

    @ObfuscatedName("client.bm")
    public static int field312 = 0;

    @ObfuscatedName("client.bs")
    public static int field543 = 0;

    @ObfuscatedName("client.bg")
    public static int field425 = 0;

    @ObfuscatedName("client.ba")
    public static int field315 = 0;

    @ObfuscatedName("client.be")
    public static int field316 = 0;

    @ObfuscatedName("client.ca")
    public static class35[] field317 = new class35[32768];

    @ObfuscatedName("client.cz")
    public static int field318 = 0;

    @ObfuscatedName("client.ce")
    public static int[] field319 = new int[32768];

    @ObfuscatedName("client.cq")
    public static int field503 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field446 = new int[250];

    @ObfuscatedName("client.cm")
    public static class123 field322 = new class123(5000);

    @ObfuscatedName("client.ck")
    public static class123 field430 = new class123(5000);

    @ObfuscatedName("client.cw")
    public static class123 field324 = new class123(15000);

    @ObfuscatedName("client.cd")
    public static int field325 = 0;

    @ObfuscatedName("client.cg")
    public static int field326 = 0;

    @ObfuscatedName("client.cc")
    public static int field327 = 0;

    @ObfuscatedName("client.cu")
    public static int field348 = 0;

    @ObfuscatedName("client.cs")
    public static int field329 = 0;

    @ObfuscatedName("client.cn")
    public static int field330 = 0;

    @ObfuscatedName("client.cx")
    public static int field420 = 0;

    @ObfuscatedName("client.cv")
    public static int field473 = 0;

    @ObfuscatedName("client.co")
    public static boolean field333 = false;

    @ObfuscatedName("client.db")
    public static int field334 = 0;

    @ObfuscatedName("client.dn")
    public static int field335 = 1;

    @ObfuscatedName("client.do")
    public static int field336 = 0;

    @ObfuscatedName("client.du")
    public static int field337 = 1;

    @ObfuscatedName("client.dw")
    public static int field338 = 0;

    @ObfuscatedName("client.dl")
    public static boolean field340 = false;

    @ObfuscatedName("client.ds")
    public static int[][][] field499 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field342 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field344 = 0;

    @ObfuscatedName("client.df")
    public static int field458 = 2;

    @ObfuscatedName("client.dp")
    public static int field346 = 0;

    @ObfuscatedName("client.de")
    public static int field497 = 2;

    @ObfuscatedName("client.dd")
    public static int field526 = 0;

    @ObfuscatedName("client.eu")
    public static int field349 = 1;

    @ObfuscatedName("client.eh")
    public static int field350 = 0;

    @ObfuscatedName("client.ek")
    public static int field351 = 0;

    @ObfuscatedName("client.er")
    public static int field352 = 2;

    @ObfuscatedName("client.eq")
    public static int field353 = 0;

    @ObfuscatedName("client.et")
    public static int field400 = 1;

    @ObfuscatedName("client.es")
    public static int field435 = 0;

    @ObfuscatedName("client.ea")
    public static int field356 = 0;

    @ObfuscatedName("client.ei")
    public static int field358 = 2301979;

    @ObfuscatedName("client.ew")
    public static int field331 = 5063219;

    @ObfuscatedName("client.ee")
    public static int field476 = 3353893;

    @ObfuscatedName("client.el")
    public static int field361 = 7759444;

    @ObfuscatedName("client.ef")
    public static boolean field362 = false;

    @ObfuscatedName("client.fx")
    public static int field363 = 0;

    @ObfuscatedName("client.fp")
    public static int field450 = 128;

    @ObfuscatedName("client.fk")
    public static int field369 = 0;

    @ObfuscatedName("client.fm")
    public static int field364 = 0;

    @ObfuscatedName("client.fd")
    public static int field367 = 0;

    @ObfuscatedName("client.fi")
    public static int field368 = 0;

    @ObfuscatedName("client.ft")
    public static int field320 = 0;

    @ObfuscatedName("client.fl")
    public static int field323 = 50;

    @ObfuscatedName("client.fu")
    public static int field297 = 0;

    @ObfuscatedName("client.fr")
    public static boolean field478 = false;

    @ObfuscatedName("client.fg")
    public static int field373 = 0;

    @ObfuscatedName("client.fv")
    public static int field374 = 0;

    @ObfuscatedName("client.fn")
    public static int field538 = 50;

    @ObfuscatedName("client.fe")
    public static int[] field357 = new int[field538];

    @ObfuscatedName("client.fc")
    public static int[] field377 = new int[field538];

    @ObfuscatedName("client.fo")
    public static int[] field406 = new int[field538];

    @ObfuscatedName("client.fq")
    public static int[] field379 = new int[field538];

    @ObfuscatedName("client.fw")
    public static int[] field396 = new int[field538];

    @ObfuscatedName("client.fb")
    public static int[] field381 = new int[field538];

    @ObfuscatedName("client.gp")
    public static int[] field382 = new int[field538];

    @ObfuscatedName("client.gd")
    public static String[] field345 = new String[field538];

    @ObfuscatedName("client.gl")
    public static int[][] field370 = new int[104][104];

    @ObfuscatedName("client.gn")
    public static int field385 = 0;

    @ObfuscatedName("client.gb")
    public static int field301 = -1;

    @ObfuscatedName("client.gs")
    public static int field387 = -1;

    @ObfuscatedName("client.go")
    public static int field422 = 0;

    @ObfuscatedName("client.gr")
    public static int field278 = 0;

    @ObfuscatedName("client.gc")
    public static int field390 = 0;

    @ObfuscatedName("client.gg")
    public static int field391 = 0;

    @ObfuscatedName("client.gz")
    public static int field437 = 0;

    @ObfuscatedName("client.gt")
    public static int field360 = 0;

    @ObfuscatedName("client.gq")
    public static int field394 = 0;

    @ObfuscatedName("client.gw")
    public static int field395 = 0;

    @ObfuscatedName("client.gu")
    public static int field376 = 0;

    @ObfuscatedName("client.gy")
    public static int field401 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field398 = false;

    @ObfuscatedName("client.ge")
    public static int field525 = 0;

    @ObfuscatedName("client.gm")
    public static int field308 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field388 = new class3[2048];

    @ObfuscatedName("client.gx")
    public static int field402 = -1;

    @ObfuscatedName("client.hd")
    public static int field403 = 0;

    @ObfuscatedName("client.hl")
    public static int field404 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field405 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field354 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hx")
    public static String[] field407 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field408 = new boolean[8];

    @ObfuscatedName("client.hs")
    public static int[] field409 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hz")
    public static int field410 = -1;

    @ObfuscatedName("client.hj")
    public static class200[][][] field411 = new class200[4][104][104];

    @ObfuscatedName("client.hi")
    public static class200 field412 = new class200();

    @ObfuscatedName("client.hb")
    public static class200 field413 = new class200();

    @ObfuscatedName("client.hg")
    public static class200 field414 = new class200();

    @ObfuscatedName("client.ha")
    public static int[] field493 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field416 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field553 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field418 = 0;

    @ObfuscatedName("client.hm")
    public static boolean field332 = false;

    @ObfuscatedName("client.hw")
    public static int field421 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field495 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field302 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.ir")
    public static String[] field426 = new String[500];

    @ObfuscatedName("client.ib")
    public static String[] field427 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field512 = -1;

    @ObfuscatedName("client.ik")
    public static int field429 = -1;

    @ObfuscatedName("client.iv")
    public static int field371 = 0;

    @ObfuscatedName("client.iw")
    public static int field502 = 50;

    @ObfuscatedName("client.ia")
    public static int field432 = 0;

    @ObfuscatedName("client.iy")
    public static String field393 = null;

    @ObfuscatedName("client.is")
    public static boolean field434 = false;

    @ObfuscatedName("client.il")
    public static int field417 = -1;

    @ObfuscatedName("client.ip")
    public static int field436 = -1;

    @ObfuscatedName("client.iu")
    public static String field378 = null;

    @ObfuscatedName("client.id")
    public static String field438 = null;

    @ObfuscatedName("client.it")
    public static int field439 = -1;

    @ObfuscatedName("client.iz")
    public static class197 field440 = new class197(8);

    @ObfuscatedName("client.jm")
    public static int field441 = 0;

    @ObfuscatedName("client.jx")
    public static int field442 = 0;

    @ObfuscatedName("client.jz")
    public static class174 field443 = null;

    @ObfuscatedName("client.jf")
    public static int field444 = 0;

    @ObfuscatedName("client.jb")
    public static int field366 = 0;

    @ObfuscatedName("client.jg")
    public static int field483 = 0;

    @ObfuscatedName("client.jw")
    public static int field328 = -1;

    @ObfuscatedName("client.jo")
    public static boolean field448 = false;

    @ObfuscatedName("client.jq")
    public static boolean field449 = false;

    @ObfuscatedName("client.je")
    public static boolean field540 = false;

    @ObfuscatedName("client.ji")
    public static class174 field511 = null;

    @ObfuscatedName("client.ju")
    public static class174 field452 = null;

    @ObfuscatedName("client.jj")
    public static class174 field453 = null;

    @ObfuscatedName("client.jr")
    public static int field454 = 0;

    @ObfuscatedName("client.jd")
    public static int field518 = 0;

    @ObfuscatedName("client.jh")
    public static class174 field456 = null;

    @ObfuscatedName("client.js")
    public static boolean field510 = false;

    @ObfuscatedName("client.jn")
    public static int field528 = -1;

    @ObfuscatedName("client.jp")
    public static int field459 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field460 = false;

    @ObfuscatedName("client.jv")
    public static int field461 = -1;

    @ObfuscatedName("client.jt")
    public static int field295 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field463 = false;

    @ObfuscatedName("client.ku")
    public static int field464 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field465 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field558 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field482 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field468 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field469 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field470 = 0;

    @ObfuscatedName("client.kz")
    public static int field471 = 0;

    @ObfuscatedName("client.kt")
    public static int field472 = 0;

    @ObfuscatedName("client.kv")
    public static int field475 = 0;

    @ObfuscatedName("client.kp")
    public static int field474 = 0;

    @ObfuscatedName("client.kb")
    public static int field365 = 0;

    @ObfuscatedName("client.ko")
    public static int field547 = 0;

    @ObfuscatedName("client.kk")
    public static int field477 = 0;

    @ObfuscatedName("client.kr")
    public static class200 field467 = new class200();

    @ObfuscatedName("client.km")
    public static class200 field479 = new class200();

    @ObfuscatedName("client.kc")
    public static class200 field480 = new class200();

    @ObfuscatedName("client.kf")
    public static class197 field481 = new class197(512);

    @ObfuscatedName("client.ke")
    public static int field466 = 0;

    @ObfuscatedName("client.kg")
    public static int field380 = -2;

    @ObfuscatedName("client.lg")
    public static boolean[] field484 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field485 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field415 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field488 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field355 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field490 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field491 = 0;

    @ObfuscatedName("client.lf")
    public static long field492 = 0L;

    @ObfuscatedName("client.ls")
    public static boolean field399 = true;

    @ObfuscatedName("client.lk")
    public static int field494 = 1;

    @ObfuscatedName("client.lu")
    public static int field309 = 1;

    @ObfuscatedName("client.ln")
    public static int[] field279 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lh")
    public static int field519 = 0;

    @ObfuscatedName("client.lr")
    public static int field498 = 0;

    @ObfuscatedName("client.la")
    public static String field496 = "";

    @ObfuscatedName("client.lb")
    public static long[] field341 = new long[100];

    @ObfuscatedName("client.lq")
    public static int field501 = 0;

    @ObfuscatedName("client.le")
    public static int field521 = 0;

    @ObfuscatedName("client.mo")
    public static int[] field307 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field504 = new int[128];

    @ObfuscatedName("client.mf")
    public static long field505 = -1L;

    @ObfuscatedName("client.mp")
    public static String field506 = null;

    @ObfuscatedName("client.mm")
    public static String field507 = null;

    @ObfuscatedName("client.mc")
    public static int field508 = -1;

    @ObfuscatedName("client.mt")
    public static int field509 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field500 = new int[1000];

    @ObfuscatedName("client.mb")
    public static int[] field419 = new int[1000];

    @ObfuscatedName("client.mw")
    public static class79[] field531 = new class79[1000];

    @ObfuscatedName("client.me")
    public static int field433 = 0;

    @ObfuscatedName("client.mh")
    public static int field514 = 0;

    @ObfuscatedName("client.mj")
    public static int field515 = 0;

    @ObfuscatedName("client.mv")
    public static int field516 = 255;

    @ObfuscatedName("client.mn")
    public static int field517 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field428 = false;

    @ObfuscatedName("client.nb")
    public static int field397 = 127;

    @ObfuscatedName("client.nr")
    public static int field520 = 127;

    @ObfuscatedName("client.nh")
    public static int field384 = 0;

    @ObfuscatedName("client.no")
    public static int[] field522 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field523 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field447 = new int[50];

    @ObfuscatedName("client.nz")
    public static class59[] field445 = new class59[50];

    @ObfuscatedName("client.ns")
    public static boolean field314 = false;

    @ObfuscatedName("client.og")
    public static boolean[] field389 = new boolean[5];

    @ObfuscatedName("client.ow")
    public static int[] field529 = new int[5];

    @ObfuscatedName("client.oc")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field277 = new int[5];

    @ObfuscatedName("client.or")
    public static int[] field532 = new int[5];

    @ObfuscatedName("client.oa")
    public static short field533 = 256;

    @ObfuscatedName("client.oe")
    public static short field534 = 205;

    @ObfuscatedName("client.oi")
    public static short field535 = 256;

    @ObfuscatedName("client.ok")
    public static short field536 = 320;

    @ObfuscatedName("client.od")
    public static short field462 = 1;

    @ObfuscatedName("client.oq")
    public static short field457 = 32767;

    @ObfuscatedName("client.oo")
    public static short field539 = 1;

    @ObfuscatedName("client.ob")
    public static short field527 = 32767;

    @ObfuscatedName("client.on")
    public static int field541 = 0;

    @ObfuscatedName("client.ov")
    public static int field542 = 0;

    @ObfuscatedName("client.om")
    public static int field372 = 0;

    @ObfuscatedName("client.oz")
    public static int field544 = 0;

    @ObfuscatedName("client.oj")
    public static int field545 = 0;

    @ObfuscatedName("client.of")
    public static int field546 = 0;

    @ObfuscatedName("client.ou")
    public static int field383 = 0;

    @ObfuscatedName("client.oh")
    public static class18[] field548 = new class18[400];

    @ObfuscatedName("client.ox")
    public static class196 field549 = new class196();

    @ObfuscatedName("client.oy")
    public static int field550 = 0;

    @ObfuscatedName("client.ot")
    public static class8[] field551 = new class8[400];

    @ObfuscatedName("client.pi")
    public static class180 field552 = new class180();

    @ObfuscatedName("client.pm")
    public static int field424 = -1;

    @ObfuscatedName("client.ps")
    public static int field554 = -1;

    @ObfuscatedName("client.pq")
    public static class221[] field555 = new class221[8];

    @ObfuscatedName("client.ph")
    public static long field556 = -1L;

    @ObfuscatedName("client.px")
    public static long field557 = -1L;

    @ObfuscatedName("client.pw")
    public static final class11 field311 = new class11();

    @ObfuscatedName("client.pv")
    public static int[] field559 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field560 = new int[50];

    @ObfuscatedName("client.w(I)V")
    public final void method233() {
    }

    public final void init() {
        if (!this.method2826()) {
            return;
        }
        class191[] var1 = class191.method2926();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3064);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3064)) {
                    case 1:
                        Statics.field167 = Integer.parseInt(var4);
                        break;
                    case 2:
                        int var5 = Integer.parseInt(var4);
                        class154[] var6 = class154.method1215();
                        int var7 = 0;
                        class154 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class154 var8 = var6[var7];
                            if (var8.field2268 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field282 = var9;
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field33)) {
                            field285 = true;
                        } else {
                            field285 = false;
                        }
                        break;
                    case 4:
                        field287 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field9 = var4;
                        break;
                    case 6:
                        field281 = Integer.parseInt(var4);
                    case 7:
                    case 8:
                    case 13:
                    default:
                        break;
                    case 9:
                        Statics.field1861 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field283 = Integer.parseInt(var4);
                        break;
                    case 11:
                        if (var4.equalsIgnoreCase(class2.field33)) {
                        }
                        break;
                    case 12:
                        Statics.field2166 = var4;
                        break;
                    case 14:
                        class155[] var10 = new class155[] { class155.field2277, class155.field2275, class155.field2278, class155.field2276, class155.field2274, class155.field2273 };
                        Statics.field2658 = (class155) class110.method709(var10, Integer.parseInt(var4));
                        if (Statics.field2658 == class155.field2278) {
                            Statics.field284 = class213.field3139;
                        } else {
                            Statics.field284 = class213.field3140;
                        }
                        break;
                    case 15:
                        field280 = Integer.parseInt(var4);
                }
            }
        }
        method856();
        Statics.field1733 = this.getCodeBase().getHost();
        String var11 = Statics.field282.field2265;
        byte var12 = 0;
        try {
            class150.method2609("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class149.method17((String) null, var14);
        }
        Statics.field375 = this;
        this.method2864(765, 503, 111);
    }

    @ObfuscatedName("aa.s(B)V")
    public static final void method856() {
        class87.field1462 = false;
        field286 = false;
    }

    @ObfuscatedName("client.p(B)V")
    public final void method223() {
        Statics.field2282 = field283 == 0 ? 43594 : field280 + 40000;
        Statics.field1948 = field283 == 0 ? 443 : field280 + 50000;
        Statics.field1104 = Statics.field2282;
        Statics.field2923 = class175.field2896;
        Statics.field2924 = class175.field2892;
        Statics.field2895 = class175.field2891;
        Statics.field1434 = class175.field2893;
        if (Statics.field3213.toLowerCase().indexOf("microsoft") == -1) {
            class138.field2116[44] = 71;
            class138.field2116[45] = 26;
            class138.field2116[46] = 72;
            class138.field2116[47] = 73;
            class138.field2116[59] = 57;
            class138.field2116[61] = 27;
            class138.field2116[91] = 42;
            class138.field2116[92] = 74;
            class138.field2116[93] = 43;
            class138.field2116[192] = 28;
            class138.field2116[222] = 58;
            class138.field2116[520] = 59;
        } else {
            class138.field2116[186] = 57;
            class138.field2116[187] = 27;
            class138.field2116[188] = 71;
            class138.field2116[189] = 26;
            class138.field2116[190] = 72;
            class138.field2116[191] = 73;
            class138.field2116[192] = 58;
            class138.field2116[219] = 42;
            class138.field2116[220] = 74;
            class138.field2116[221] = 43;
            class138.field2116[222] = 59;
            class138.field2116[223] = 28;
        }
        Canvas var1 = Statics.field193;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2105);
        var1.addFocusListener(class138.field2105);
        class141.method1489(Statics.field193);
        Statics.field2167 = class132.method2058();
        if (Statics.field2167 != null) {
            Statics.field2167.method2649(Statics.field193);
        }
        Statics.field2699 = new class135(255, class150.field2228, class150.field2235, 500000);
        class228 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class150.method2822("", Statics.field2658.field2279, false);
            byte[] var4 = new byte[(int) var2.method3828()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3834(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class120(var4));
        } catch (Exception var13) {
        }
        try {
            if (var2 != null) {
                var2.method3827();
            }
        } catch (Exception var12) {
        }
        Statics.field866 = var3;
        Statics.field237 = this.getToolkit().getSystemClipboard();
        String var11 = Statics.field1043;
        class139.field2124 = this;
        class139.field2123 = var11;
        if (field283 != 0) {
            field296 = true;
        }
        method116(Statics.field866.field149);
    }

    @ObfuscatedName("client.h(S)V")
    public final void method348() {
        field290++;
        this.method256();
        class171.method1948();
        class184.method761();
        method152();
        class138 var1 = class138.field2105;
        synchronized (class138.field2105) {
            class138.field2115++;
            class138.field2094 = class138.field2110;
            class138.field2120 = 0;
            if (class138.field2112 >= 0) {
                while (class138.field2117 != class138.field2112) {
                    int var3 = class138.field2100[class138.field2117];
                    class138.field2117 = class138.field2117 + 1 & 0x7F;
                    if (var3 < 0) {
                        class138.field2104[~var3] = false;
                    } else {
                        if (!class138.field2104[var3] && class138.field2120 < class138.field2103.length - 1) {
                            class138.field2103[++class138.field2120 - 1] = var3;
                        }
                        class138.field2104[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class138.field2104[var2] = false;
                }
                class138.field2112 = class138.field2117;
            }
            class138.field2110 = class138.field2113;
        }
        class141.method703();
        if (Statics.field2167 != null) {
            int var5 = Statics.field2167.method2651();
            field477 = var5;
        }
        if (field288 == 0) {
            method172();
            Statics.field76.method2673();
            for (int var6 = 0; var6 < 32; var6++) {
                field2197[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field2198[var7] = 0L;
            }
            Statics.field2186 = 0;
        } else if (field288 == 5) {
            class32.method1178(this);
            method172();
            Statics.field76.method2673();
            for (int var8 = 0; var8 < 32; var8++) {
                field2197[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field2198[var9] = 0L;
            }
            Statics.field2186 = 0;
        } else if (field288 == 10 || field288 == 11) {
            class32.method1178(this);
        } else if (field288 == 20) {
            class32.method1178(this);
            method2056();
        } else if (field288 == 25) {
            method173();
        }
        if (field288 == 30) {
            method1562();
        } else if (field288 == 40 || field288 == 45) {
            method2056();
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method225() {
        boolean var1;
        label206: {
            try {
                if (class184.field2959 == 2) {
                    if (Statics.field2956 == null) {
                        Statics.field2956 = class181.method3258(Statics.field210, Statics.field2220, Statics.field2657);
                        if (Statics.field2956 == null) {
                            var1 = false;
                            break label206;
                        }
                    }
                    if (Statics.field3215 == null) {
                        Statics.field3215 = new class60(Statics.field2957, Statics.field2961);
                    }
                    if (Statics.field2958.method3349(Statics.field2956, Statics.field2962, Statics.field3215, 22050)) {
                        Statics.field2958.method3392();
                        Statics.field2958.method3347(Statics.field1612);
                        Statics.field2958.method3352(Statics.field2956, Statics.field2031);
                        class184.field2959 = 0;
                        Statics.field2956 = null;
                        Statics.field3215 = null;
                        Statics.field210 = null;
                        var1 = true;
                        break label206;
                    }
                }
            } catch (Exception var32) {
                var32.printStackTrace();
                Statics.field2958.method3421();
                class184.field2959 = 0;
                Statics.field2956 = null;
                Statics.field3215 = null;
                Statics.field210 = null;
            }
            var1 = false;
        }
        if (var1 && field428 && Statics.field3180 != null) {
            Statics.field3180.method1151();
        }
        if (field288 == 10 || field288 == 20 || field288 == 30) {
            if (field492 != 0L && class116.method2794() > field492) {
                method116(method1951());
            } else if (field2191) {
                class138.method1759(Statics.field193);
                class141.method3128(Statics.field193);
                if (Statics.field2167 != null) {
                    Statics.field2167.method2650(Statics.field193);
                }
                Statics.field375.method2870();
                Statics.field193.setBackground(Color.black);
                Canvas var4 = Statics.field193;
                var4.setFocusTraversalKeysEnabled(false);
                var4.addKeyListener(class138.field2105);
                var4.addFocusListener(class138.field2105);
                class141.method1489(Statics.field193);
                if (Statics.field2167 != null) {
                    Statics.field2167.method2649(Statics.field193);
                }
                if (field439 != -1) {
                    int var5 = field439;
                    int var6 = Statics.field763;
                    int var7 = Statics.field576;
                    if (class174.method2294(var5)) {
                        method1037(Statics.field2838[var5], -1, var6, var7, false);
                    }
                }
                field2203 = true;
            }
        }
        Dimension var8 = this.method2841();
        if (Statics.field855 != var8.width || Statics.field1133 != var8.height || field2203) {
            method2938();
            field492 = class116.method2794() + 500L;
            field2203 = false;
        }
        boolean var9 = false;
        if (field2205) {
            field2205 = false;
            var9 = true;
            for (int var10 = 0; var10 < 100; var10++) {
                field484[var10] = true;
            }
        }
        if (var9) {
            method2937();
        }
        if (field288 == 0) {
            int var11 = class32.field708;
            String var12 = class32.field723;
            Color var13 = null;
            try {
                Graphics var14 = Statics.field193.getGraphics();
                if (Statics.field755 == null) {
                    Statics.field755 = new Font("Helvetica", 1, 13);
                    Statics.field2077 = Statics.field193.getFontMetrics(Statics.field755);
                }
                if (var9) {
                    var14.setColor(Color.black);
                    var14.fillRect(0, 0, Statics.field763, Statics.field576);
                }
                if (var13 == null) {
                    var13 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field207 == null) {
                        Statics.field207 = Statics.field193.createImage(304, 34);
                    }
                    Graphics var15 = Statics.field207.getGraphics();
                    var15.setColor(var13);
                    var15.drawRect(0, 0, 303, 33);
                    var15.fillRect(2, 2, var11 * 3, 30);
                    var15.setColor(Color.black);
                    var15.drawRect(1, 1, 301, 31);
                    var15.fillRect(var11 * 3 + 2, 2, 300 - var11 * 3, 30);
                    var15.setFont(Statics.field755);
                    var15.setColor(Color.white);
                    var15.drawString(var12, (304 - Statics.field2077.stringWidth(var12)) / 2, 22);
                    var14.drawImage(Statics.field207, Statics.field763 / 2 - 152, Statics.field576 / 2 - 18, (ImageObserver) null);
                } catch (Exception var28) {
                    int var17 = Statics.field763 / 2 - 152;
                    int var18 = Statics.field576 / 2 - 18;
                    var14.setColor(var13);
                    var14.drawRect(var17, var18, 303, 33);
                    var14.fillRect(var17 + 2, var18 + 2, var11 * 3, 30);
                    var14.setColor(Color.black);
                    var14.drawRect(var17 + 1, var18 + 1, 301, 31);
                    var14.fillRect(var11 * 3 + var17 + 2, var18 + 2, 300 - var11 * 3, 30);
                    var14.setFont(Statics.field755);
                    var14.setColor(Color.white);
                    var14.drawString(var12, var17 + (304 - Statics.field2077.stringWidth(var12)) / 2, var18 + 22);
                }
            } catch (Exception var29) {
                Statics.field193.repaint();
            }
        } else if (field288 == 5) {
            class32.method2250(Statics.field2023, Statics.field754, Statics.field629, var9);
        } else if (field288 == 10 || field288 == 11) {
            class32.method2250(Statics.field2023, Statics.field754, Statics.field629, var9);
        } else if (field288 == 20) {
            class32.method2250(Statics.field2023, Statics.field754, Statics.field629, var9);
        } else if (field288 == 25) {
            if (field338 == 1) {
                if (field334 > field335) {
                    field335 = field334;
                }
                int var20 = (field335 * 50 - field334 * 50) / field335;
                method2619(class158.field2327 + class2.field34 + class2.field23 + var20 + "%" + class2.field24, false);
            } else if (field338 == 2) {
                if (field336 > field337) {
                    field337 = field336;
                }
                int var21 = (field337 * 50 - field336 * 50) / field337 + 50;
                method2619(class158.field2327 + class2.field34 + class2.field23 + var21 + "%" + class2.field24, false);
            } else {
                method2619(class158.field2327, false);
            }
        } else if (field288 == 30) {
            method154();
        } else if (field288 == 40) {
            method2619(class158.field2318 + class2.field34 + class158.field2459, false);
        } else if (field288 == 45) {
            method2619(class158.field2372, false);
        }
        if (field288 == 30 && field491 == 0 && !var9) {
            try {
                Graphics var22 = Statics.field193.getGraphics();
                for (int var23 = 0; var23 < field466; var23++) {
                    if (field485[var23]) {
                        Statics.field2071.method1498(var22, field487[var23], field488[var23], field355[var23], field490[var23]);
                        field485[var23] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field193.repaint();
            }
        } else if (field288 > 0) {
            try {
                Graphics var25 = Statics.field193.getGraphics();
                Statics.field2071.method1497(var25, 0, 0);
                for (int var26 = 0; var26 < field466; var26++) {
                    field485[var26] = false;
                }
            } catch (Exception var30) {
                Statics.field193.repaint();
            }
        }
    }

    @ObfuscatedName("client.a(B)V")
    public final void method438() {
        if (Statics.field2028.method196()) {
            Statics.field2028.method189();
        }
        if (Statics.field729 != null) {
            Statics.field729.field195 = false;
        }
        Statics.field729 = null;
        if (Statics.field1041 != null) {
            Statics.field1041.method2801();
            Statics.field1041 = null;
        }
        class138.method2666();
        class141.method714();
        Statics.field2167 = null;
        if (Statics.field3180 != null) {
            Statics.field3180.method1152();
        }
        if (Statics.field95 != null) {
            Statics.field95.method1152();
        }
        if (Statics.field2729 != null) {
            Statics.field2729.method2801();
        }
        Object var1 = class171.field2710;
        synchronized (class171.field2710) {
            if (class171.field2708 != 0) {
                class171.field2708 = 1;
                try {
                    class171.field2710.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        class150.method728();
    }

    @ObfuscatedName("ep.r(II)V")
    public static void method2795(int arg0) {
        if (field288 == arg0) {
            return;
        }
        if (field288 == 0) {
            Statics.field207 = null;
            Statics.field755 = null;
            Statics.field2077 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field543 = 0;
            field425 = 0;
            field315 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1517 != null) {
            Statics.field1517.method2801();
            Statics.field1517 = null;
        }
        if (field288 == 25) {
            field338 = 0;
            field334 = 0;
            field335 = 1;
            field336 = 0;
            field337 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2280(Statics.field193, Statics.field1881, Statics.field247, true, 0);
        } else if (arg0 == 20) {
            class32.method2280(Statics.field193, Statics.field1881, Statics.field247, true, field288 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2280(Statics.field193, Statics.field1881, Statics.field247, false, 4);
        } else if (Statics.field2651) {
            Statics.field695 = null;
            Statics.field3045 = null;
            Statics.field696 = null;
            Statics.field721 = null;
            Statics.field200 = null;
            Statics.field705 = null;
            Statics.field261 = null;
            Statics.field706 = null;
            Statics.field758 = null;
            Statics.field1984 = null;
            Statics.field1537 = null;
            Statics.field183 = null;
            Statics.field1139 = null;
            Statics.field1663 = null;
            Statics.field656 = null;
            Statics.field213 = null;
            Statics.field2188 = null;
            Statics.field1062 = null;
            Statics.field657 = null;
            Statics.field1958 = null;
            Statics.field1370 = null;
            Statics.field1048 = null;
            class184.method45(2);
            class172.method578(true);
            Statics.field2651 = false;
        }
        field288 = arg0;
    }

    @ObfuscatedName("client.k(I)V")
    public void method256() {
        if (field288 == 1000) {
            return;
        }
        long var1 = class116.method2794();
        int var3 = (int) (var1 - Statics.field2715);
        Statics.field2715 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class172.field2714 += var3;
        boolean var4;
        if (class172.field2724 == 0 && class172.field2719 == 0 && class172.field2722 == 0 && class172.field2731 == 0) {
            var4 = true;
        } else if (Statics.field2729 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class172.field2714 > 30000) {
                        throw new IOException();
                    }
                    while (class172.field2719 < 20 && class172.field2731 > 0) {
                        class173 var5 = (class173) class172.field2716.method3513();
                        class120 var6 = new class120(4);
                        var6.method2397(1);
                        var6.method2342((int) var5.field3116);
                        Statics.field2729.method2802(var6.field1981, 0, 4);
                        class172.field2726.method3508(var5, var5.field3116);
                        class172.field2731--;
                        class172.field2719++;
                    }
                    while (class172.field2724 < 20 && class172.field2722 > 0) {
                        class173 var7 = (class173) class172.field2720.method3597();
                        class120 var8 = new class120(4);
                        var8.method2397(0);
                        var8.method2342((int) var7.field3116);
                        Statics.field2729.method2802(var8.field1981, 0, 4);
                        var7.method3610();
                        class172.field2713.method3508(var7, var7.field3116);
                        class172.field2722--;
                        class172.field2724++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2729.method2804();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class172.field2714 = 0;
                        byte var11 = 0;
                        if (Statics.field2725 == null) {
                            var11 = 8;
                        } else if (class172.field2727 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class172.field2728.field1977;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2729.method2810(class172.field2728.field1981, class172.field2728.field1977, var12);
                            if (class172.field2734 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class172.field2728.field1981[class172.field2728.field1977 + var13] ^= class172.field2734;
                                }
                            }
                            class172.field2728.field1977 += var12;
                            if (class172.field2728.field1977 < var11) {
                                break;
                            }
                            if (Statics.field2725 == null) {
                                class172.field2728.field1977 = 0;
                                int var14 = class172.field2728.method2355();
                                int var15 = class172.field2728.method2532();
                                int var16 = class172.field2728.method2355();
                                int var17 = class172.field2728.method2360();
                                long var18 = (long) ((var14 << 16) + var15);
                                class173 var20 = (class173) class172.field2726.method3507(var18);
                                Statics.field2290 = true;
                                if (var20 == null) {
                                    var20 = (class173) class172.field2713.method3507(var18);
                                    Statics.field2290 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2725 = var20;
                                Statics.field668 = new class120(var17 + var21 + Statics.field2725.field2740);
                                Statics.field668.method2397(var16);
                                Statics.field668.method2449(var17);
                                class172.field2727 = 8;
                                class172.field2728.field1977 = 0;
                            } else if (class172.field2727 == 0) {
                                if (class172.field2728.field1981[0] == -1) {
                                    class172.field2727 = 1;
                                    class172.field2728.field1977 = 0;
                                } else {
                                    Statics.field2725 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field668.field1981.length - Statics.field2725.field2740;
                            int var23 = 512 - class172.field2727;
                            if (var23 > var22 - Statics.field668.field1977) {
                                var23 = var22 - Statics.field668.field1977;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2729.method2810(Statics.field668.field1981, Statics.field668.field1977, var23);
                            if (class172.field2734 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field668.field1981[Statics.field668.field1977 + var24] ^= class172.field2734;
                                }
                            }
                            Statics.field668.field1977 += var23;
                            class172.field2727 += var23;
                            if (Statics.field668.field1977 == var22) {
                                if (Statics.field2725.field3116 == 16711935L) {
                                    Statics.field2723 = Statics.field668;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class169 var26 = class172.field2730[var25];
                                        if (var26 != null) {
                                            Statics.field2723.field1977 = var25 * 8 + 5;
                                            int var27 = Statics.field2723.method2360();
                                            int var28 = Statics.field2723.method2360();
                                            var26.method3099(var27, var28);
                                        }
                                    }
                                } else {
                                    class172.field2717.reset();
                                    class172.field2717.update(Statics.field668.field1981, 0, var22);
                                    int var29 = (int) class172.field2717.getValue();
                                    if (Statics.field2725.field2739 != var29) {
                                        try {
                                            Statics.field2729.method2801();
                                        } catch (Exception var35) {
                                        }
                                        class172.field2732++;
                                        Statics.field2729 = null;
                                        class172.field2734 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class172.field2732 = 0;
                                    class172.field2733 = 0;
                                    Statics.field2725.field2738.method3097((int) (Statics.field2725.field3116 & 0xFFFFL), Statics.field668.field1981, (Statics.field2725.field3116 & 0xFF0000L) == 16711680L, Statics.field2290);
                                }
                                Statics.field2725.method3632();
                                if (Statics.field2290) {
                                    class172.field2719--;
                                } else {
                                    class172.field2724--;
                                }
                                class172.field2727 = 0;
                                Statics.field2725 = null;
                                Statics.field668 = null;
                            } else {
                                if (class172.field2727 != 512) {
                                    break;
                                }
                                class172.field2727 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2729.method2801();
                } catch (Exception var34) {
                }
                class172.field2733++;
                Statics.field2729 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method350();
        }
    }

    @ObfuscatedName("client.m(I)V")
    public void method350() {
        if (class172.field2732 >= 4) {
            this.method2895("js5crc");
            field288 = 1000;
            return;
        }
        if (class172.field2733 >= 4) {
            if (field288 <= 5) {
                this.method2895("js5io");
                field288 = 1000;
                return;
            }
            field386 = 3000;
            class172.field2733 = 3;
        }
        if (--field386 + 1 > 0) {
            return;
        }
        try {
            if (field310 == 0) {
                Statics.field784 = Statics.field2029.method2701(Statics.field1733, Statics.field1104);
                field310++;
            }
            if (field310 == 1) {
                if (Statics.field784.field2214 == 2) {
                    this.method229(-1);
                    return;
                }
                if (Statics.field784.field2214 == 1) {
                    field310++;
                }
            }
            if (field310 == 2) {
                Statics.field1406 = new class144((Socket) Statics.field784.field2217, Statics.field2029);
                class120 var1 = new class120(5);
                var1.method2397(15);
                var1.method2449(111);
                Statics.field1406.method2802(var1.field1981, 0, 5);
                field310++;
                Statics.field1366 = class116.method2794();
            }
            if (field310 == 3) {
                if (field288 <= 5 || Statics.field1406.method2804() > 0) {
                    int var2 = Statics.field1406.method2803();
                    if (var2 != 0) {
                        this.method229(var2);
                        return;
                    }
                    field310++;
                } else if (class116.method2794() - Statics.field1366 > 30000L) {
                    this.method229(-2);
                    return;
                }
            }
            if (field310 == 4) {
                class144 var3 = Statics.field1406;
                boolean var4 = field288 > 20;
                if (Statics.field2729 != null) {
                    try {
                        Statics.field2729.method2801();
                    } catch (Exception var14) {
                    }
                    Statics.field2729 = null;
                }
                Statics.field2729 = var3;
                class172.method578(var4);
                class172.field2728.field1977 = 0;
                Statics.field2725 = null;
                Statics.field668 = null;
                class172.field2727 = 0;
                while (true) {
                    class173 var6 = (class173) class172.field2726.method3513();
                    if (var6 == null) {
                        while (true) {
                            class173 var7 = (class173) class172.field2713.method3513();
                            if (var7 == null) {
                                if (class172.field2734 != 0) {
                                    try {
                                        class120 var8 = new class120(4);
                                        var8.method2397(4);
                                        var8.method2397(class172.field2734);
                                        var8.method2545(0);
                                        Statics.field2729.method2802(var8.field1981, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2729.method2801();
                                        } catch (Exception var12) {
                                        }
                                        class172.field2733++;
                                        Statics.field2729 = null;
                                    }
                                }
                                class172.field2714 = 0;
                                Statics.field2715 = class116.method2794();
                                Statics.field784 = null;
                                Statics.field1406 = null;
                                field310 = 0;
                                field312 = 0;
                                return;
                            }
                            class172.field2720.method3595(var7);
                            class172.field2721.method3508(var7, var7.field3116);
                            class172.field2722++;
                            class172.field2724--;
                        }
                    }
                    class172.field2716.method3508(var6, var6.field3116);
                    class172.field2731++;
                    class172.field2719--;
                }
            }
        } catch (IOException var15) {
            this.method229(-3);
        }
    }

    @ObfuscatedName("client.n(II)V")
    public void method229(int arg0) {
        Statics.field784 = null;
        Statics.field1406 = null;
        field310 = 0;
        if (Statics.field2282 == Statics.field1104) {
            Statics.field1104 = Statics.field1948;
        } else {
            Statics.field1104 = Statics.field2282;
        }
        field312++;
        if (field312 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field288 <= 5) {
                this.method2895("js5connect_full");
                field288 = 1000;
            } else {
                field386 = 3000;
            }
        } else if (field312 >= 2 && arg0 == 6) {
            this.method2895("js5connect_outofdate");
            field288 = 1000;
        } else if (field312 >= 4) {
            if (field288 <= 5) {
                this.method2895("js5connect");
                field288 = 1000;
            } else {
                field386 = 3000;
            }
        }
    }

    @ObfuscatedName("o.y(B)V")
    public static void method172() {
        if (field451 == 0) {
            Statics.field2251 = new class87(4, 104, 104, class6.field91);
            for (int var0 = 0; var0 < 4; var0++) {
                field339[var0] = new class109(104, 104);
            }
            Statics.field2161 = new class79(512, 512);
            class32.field723 = class158.field2441;
            class32.field708 = 5;
            field451 = 20;
        } else if (field451 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1569[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1815(var1, 500, 800, 512, 334);
            class32.field723 = class158.field2321;
            class32.field708 = 10;
            field451 = 30;
        } else if (field451 == 30) {
            Statics.field1652 = method2943(0, false, true, true);
            Statics.field3158 = method2943(1, false, true, true);
            Statics.field1773 = method2943(2, true, false, true);
            Statics.field660 = method2943(3, false, true, true);
            Statics.field2176 = method2943(4, false, true, true);
            Statics.field744 = method2943(5, true, true, true);
            Statics.field612 = method2943(6, true, true, false);
            Statics.field273 = method2943(7, false, true, true);
            Statics.field247 = method2943(8, false, true, true);
            Statics.field2024 = method2943(9, false, true, true);
            Statics.field1881 = method2943(10, false, true, true);
            Statics.field1407 = method2943(11, false, true, true);
            Statics.field1190 = method2943(12, false, true, true);
            Statics.field1320 = method2943(13, true, false, true);
            Statics.field2058 = method2943(14, false, true, false);
            Statics.field1957 = method2943(15, false, true, true);
            class32.field723 = class158.field2322;
            class32.field708 = 20;
            field451 = 40;
        } else if (field451 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1652.method3090() * 4 / 100;
            int var8 = var7 + Statics.field3158.method3090() * 4 / 100;
            int var9 = var8 + Statics.field1773.method3090() * 2 / 100;
            int var10 = var9 + Statics.field660.method3090() * 2 / 100;
            int var11 = var10 + Statics.field2176.method3090() * 6 / 100;
            int var12 = var11 + Statics.field744.method3090() * 4 / 100;
            int var13 = var12 + Statics.field612.method3090() * 2 / 100;
            int var14 = var13 + Statics.field273.method3090() * 60 / 100;
            int var15 = var14 + Statics.field247.method3090() * 2 / 100;
            int var16 = var15 + Statics.field2024.method3090() * 2 / 100;
            int var17 = var16 + Statics.field1881.method3090() * 2 / 100;
            int var18 = var17 + Statics.field1407.method3090() * 2 / 100;
            int var19 = var18 + Statics.field1190.method3090() * 2 / 100;
            int var20 = var19 + Statics.field1320.method3090() * 2 / 100;
            int var21 = var20 + Statics.field2058.method3090() * 2 / 100;
            int var22 = var21 + Statics.field1957.method3090() * 2 / 100;
            if (var22 == 100) {
                class32.field723 = class158.field2324;
                class32.field708 = 30;
                field451 = 45;
            } else {
                if (var22 != 0) {
                    class32.field723 = class158.field2323 + var22 + "%";
                }
                class32.field708 = 30;
            }
        } else if (field451 == 45) {
            class57.method924(22050, !field286, 2);
            class185 var23 = new class185();
            var23.method3354(9, 128);
            Statics.field3180 = class57.method2055(Statics.field2029, Statics.field193, 0, 22050);
            Statics.field3180.method1148(var23);
            class169 var24 = Statics.field1957;
            class169 var25 = Statics.field2058;
            class169 var26 = Statics.field2176;
            Statics.field2962 = var24;
            Statics.field2961 = var25;
            Statics.field2957 = var26;
            Statics.field2958 = var23;
            Statics.field95 = class57.method2055(Statics.field2029, Statics.field193, 1, 2048);
            Statics.field2075 = new class56();
            Statics.field95.method1148(Statics.field2075);
            Statics.field1067 = new class75(22050, Statics.field1154);
            class32.field723 = class158.field2325;
            class32.field708 = 35;
            field451 = 50;
        } else if (field451 == 50) {
            int var27 = 0;
            if (Statics.field754 == null) {
                class169 var28 = Statics.field247;
                class169 var29 = Statics.field1320;
                int var30 = var28.method3023("p11_full");
                int var31 = var28.method3039(var30, "");
                class225 var32 = class77.method1570(var28, var29, var30, var31);
                Statics.field754 = var32;
            } else {
                var27++;
            }
            if (Statics.field629 == null) {
                class169 var33 = Statics.field247;
                class169 var34 = Statics.field1320;
                int var35 = var33.method3023("p12_full");
                int var36 = var33.method3039(var35, "");
                class225 var37 = class77.method1570(var33, var34, var35, var36);
                Statics.field629 = var37;
            } else {
                var27++;
            }
            if (Statics.field2023 == null) {
                class169 var38 = Statics.field247;
                class169 var39 = Statics.field1320;
                int var40 = var38.method3023("b12_full");
                int var41 = var38.method3039(var40, "");
                class225 var42 = class77.method1570(var38, var39, var40, var41);
                Statics.field2023 = var42;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field723 = class158.field2335 + var27 * 100 / 3 + "%";
                class32.field708 = 40;
            } else {
                Statics.field785 = new class161(true);
                class32.field723 = class158.field2332;
                class32.field708 = 40;
                field451 = 60;
            }
        } else if (field451 == 60) {
            class169 var43 = Statics.field1881;
            class169 var44 = Statics.field247;
            int var45 = 0;
            if (var43.method3041("title.jpg", "")) {
                var45++;
            }
            if (var44.method3041("logo", "")) {
                var45++;
            }
            if (var44.method3041("logo_deadman_mode", "")) {
                var45++;
            }
            if (var44.method3041("titlebox", "")) {
                var45++;
            }
            if (var44.method3041("titlebutton", "")) {
                var45++;
            }
            if (var44.method3041("runes", "")) {
                var45++;
            }
            if (var44.method3041("title_mute", "")) {
                var45++;
            }
            if (var44.method3067("options_radio_buttons,0")) {
                var45++;
            }
            if (var44.method3067("options_radio_buttons,2")) {
                var45++;
            }
            var44.method3041("sl_back", "");
            var44.method3041("sl_flags", "");
            var44.method3041("sl_arrows", "");
            var44.method3041("sl_stars", "");
            var44.method3041("sl_button", "");
            int var48 = class32.method2162();
            if (var45 < var48) {
                class32.field723 = class158.field2572 + var45 * 100 / var48 + "%";
                class32.field708 = 50;
            } else {
                class32.field723 = class158.field2548;
                class32.field708 = 50;
                method2795(5);
                field451 = 70;
            }
        } else if (field451 == 70) {
            if (Statics.field1773.method3027()) {
                class169 var49 = Statics.field1773;
                Statics.field1029 = var49;
                class169 var50 = Statics.field1773;
                Statics.field960 = var50;
                class169 var51 = Statics.field1773;
                class169 var52 = Statics.field273;
                Statics.field1006 = var51;
                Statics.field1008 = var52;
                Statics.field1003 = Statics.field1006.method3075(3);
                class41.method126(Statics.field1773, Statics.field273, field286);
                class40.method932(Statics.field1773, Statics.field273);
                class52.method183(Statics.field1773, Statics.field273, field285, Statics.field754);
                class43.method684(Statics.field1773, Statics.field1652, Statics.field3158);
                class169 var53 = Statics.field1773;
                class169 var54 = Statics.field273;
                Statics.field3160 = var53;
                Statics.field993 = var54;
                class169 var55 = Statics.field1773;
                Statics.field1046 = var55;
                class53.method121(Statics.field1773);
                class174.method2793(Statics.field660, Statics.field273, Statics.field247, Statics.field1320);
                class169 var56 = Statics.field1773;
                Statics.field3145 = var56;
                class169 var57 = Statics.field1773;
                Statics.field1054 = var57;
                class46.method704(Statics.field1773);
                class169 var58 = Statics.field1773;
                Statics.field3164 = var58;
                Statics.field2028 = new class20();
                class32.field723 = class158.field2331;
                class32.field708 = 60;
                field451 = 80;
            } else {
                class32.field723 = class158.field2330 + Statics.field1773.method3103() + "%";
                class32.field708 = 60;
            }
        } else if (field451 == 80) {
            int var59 = 0;
            if (Statics.field2128 == null) {
                Statics.field2128 = class77.method3184(Statics.field247, "compass", "");
            } else {
                var59++;
            }
            if (Statics.field2597 == null) {
                Statics.field2597 = class77.method3184(Statics.field247, "mapedge", "");
            } else {
                var59++;
            }
            if (Statics.field191 == null) {
                Statics.field191 = class77.method2675(Statics.field247, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field2705 == null) {
                Statics.field2705 = class77.method2606(Statics.field247, "mapfunction", "");
            } else {
                var59++;
            }
            if (Statics.field1998 == null) {
                Statics.field1998 = class77.method2606(Statics.field247, "hitmarks", "");
            } else {
                var59++;
            }
            if (Statics.field1341 == null) {
                Statics.field1341 = class77.method2606(Statics.field247, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field631 == null) {
                Statics.field631 = class77.method2606(Statics.field247, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field2015 == null) {
                Statics.field2015 = class77.method2606(Statics.field247, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field689 == null) {
                Statics.field689 = class77.method2606(Statics.field247, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field1545 == null) {
                Statics.field1545 = class77.method2606(Statics.field247, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field513 == null) {
                Statics.field513 = class77.method2606(Statics.field247, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field3163 == null) {
                Statics.field3163 = class77.method2675(Statics.field247, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field2237 == null) {
                Statics.field2237 = class77.method2675(Statics.field247, "mod_icons", "");
            } else {
                var59++;
            }
            if (var59 < 13) {
                class32.field723 = class158.field2429 + var59 * 100 / 13 + "%";
                class32.field708 = 70;
            } else {
                Statics.field3195 = Statics.field2237;
                Statics.field2597.method1578();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                for (int var64 = 0; var64 < Statics.field2705.length; var64++) {
                    Statics.field2705[var64].method1666(var60 + var63, var61 + var63, var62 + var63);
                }
                Statics.field191[0].method1745(var60 + var63, var61 + var63, var62 + var63);
                class32.field723 = class158.field2333;
                class32.field708 = 70;
                field451 = 90;
            }
        } else if (field451 == 90) {
            if (Statics.field2024.method3027()) {
                class96 var65 = new class96(Statics.field2024, Statics.field247, 20, 0.8D, field286 ? 64 : 128);
                class92.method2012(var65);
                class92.method1962(0.8D);
                class32.field723 = class158.field2317;
                class32.field708 = 90;
                field451 = 110;
            } else {
                class32.field723 = class158.field2512 + Statics.field2024.method3103() + "%";
                class32.field708 = 90;
            }
        } else if (field451 == 110) {
            Statics.field729 = new class14();
            Statics.field2029.method2715(Statics.field729, 10);
            class32.field723 = class158.field2586;
            class32.field708 = 94;
            field451 = 120;
        } else if (field451 == 120) {
            if (Statics.field1881.method3041("huffman", "")) {
                class114 var66 = new class114(Statics.field1881.method3073("huffman", ""));
                class223.method49(var66);
                class32.field723 = class158.field2338;
                class32.field708 = 96;
                field451 = 130;
            } else {
                class32.field723 = class158.field2337 + "%";
                class32.field708 = 96;
            }
        } else if (field451 == 130) {
            if (!Statics.field660.method3027()) {
                class32.field723 = class158.field2505 + Statics.field660.method3103() * 4 / 5 + "%";
                class32.field708 = 100;
            } else if (!Statics.field1190.method3027()) {
                class32.field723 = class158.field2505 + (80 + Statics.field1190.method3103() / 6) + "%";
                class32.field708 = 100;
            } else if (Statics.field1320.method3027()) {
                class32.field723 = class158.field2340;
                class32.field708 = 100;
                field451 = 140;
            } else {
                class32.field723 = class158.field2505 + (96 + Statics.field1320.method3103() / 20) + "%";
                class32.field708 = 100;
            }
        } else if (field451 == 140) {
            method2795(10);
        }
    }

    @ObfuscatedName("fz.i(IZZZB)Lfl;")
    public static class169 method2943(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2228 != null) {
            var4 = new class135(arg0, class150.field2228, Statics.field2231[arg0], 1000000);
        }
        return new class169(var4, Statics.field2699, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cj.j(I)V")
    public static final void method2056() {
        try {
            if (field543 == 0) {
                if (Statics.field1041 != null) {
                    Statics.field1041.method2801();
                    Statics.field1041 = null;
                }
                Statics.field219 = null;
                field333 = false;
                field425 = 0;
                field543 = 1;
            }
            if (field543 == 1) {
                if (Statics.field219 == null) {
                    Statics.field219 = Statics.field2029.method2701(Statics.field1733, Statics.field1104);
                }
                if (Statics.field219.field2214 == 2) {
                    throw new IOException();
                }
                if (Statics.field219.field2214 == 1) {
                    Statics.field1041 = new class144((Socket) Statics.field219.field2217, Statics.field2029);
                    Statics.field219 = null;
                    field543 = 2;
                }
            }
            if (field543 == 2) {
                field322.field1977 = 0;
                field322.method2397(14);
                Statics.field1041.method2802(field322.field1981, 0, 1);
                field324.field1977 = 0;
                field543 = 3;
            }
            if (field543 == 3) {
                if (Statics.field3180 != null) {
                    Statics.field3180.method1150();
                }
                if (Statics.field95 != null) {
                    Statics.field95.method1150();
                }
                int var0 = Statics.field1041.method2803();
                if (Statics.field3180 != null) {
                    Statics.field3180.method1150();
                }
                if (Statics.field95 != null) {
                    Statics.field95.method1150();
                }
                if (var0 != 0) {
                    method124(var0);
                    return;
                }
                field324.field1977 = 0;
                field543 = 5;
            }
            if (field543 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field322.field1977 = 0;
                field322.method2397(1);
                field322.method2397(class32.field717.method558());
                field322.method2449(var1[0]);
                field322.method2449(var1[1]);
                field322.method2449(var1[2]);
                field322.method2449(var1[3]);
                switch(class32.field717.field2602) {
                    case 0:
                        field322.method2449((Integer) Statics.field866.field145.get(class164.method174(class32.field704)));
                        field322.field1977 += 4;
                        break;
                    case 1:
                    case 2:
                        field322.method2342(Statics.field100);
                        field322.field1977 += 5;
                        break;
                    case 3:
                        field322.field1977 += 8;
                }
                field322.method2346(class32.field716);
                field322.method2473(class5.field79, class5.field73);
                field430.field1977 = 0;
                if (field288 == 40) {
                    field430.method2397(18);
                } else {
                    field430.method2397(16);
                }
                field430.method2545(0);
                int var2 = field430.field1977;
                field430.method2449(111);
                field430.method2349(field322.field1981, 0, field322.field1977);
                int var3 = field430.field1977;
                field430.method2346(class32.field704);
                field430.method2397((field399 ? 1 : 0) << 1 | (field286 ? 1 : 0));
                field430.method2545(Statics.field763);
                field430.method2545(Statics.field576);
                class150.method18(field430);
                field430.method2346(Statics.field9);
                field430.method2449(Statics.field1861);
                class120 var4 = new class120(Statics.field785.method2948());
                Statics.field785.method2947(var4);
                field430.method2349(var4.field1981, 0, var4.field1981.length);
                field430.method2397(Statics.field167);
                field430.method2449(Statics.field1652.field2682);
                field430.method2449(Statics.field3158.field2682);
                field430.method2449(Statics.field1773.field2682);
                field430.method2449(Statics.field660.field2682);
                field430.method2449(Statics.field2176.field2682);
                field430.method2449(Statics.field744.field2682);
                field430.method2449(Statics.field612.field2682);
                field430.method2449(Statics.field273.field2682);
                field430.method2449(Statics.field247.field2682);
                field430.method2449(Statics.field2024.field2682);
                field430.method2449(Statics.field1881.field2682);
                field430.method2449(Statics.field1407.field2682);
                field430.method2449(Statics.field1190.field2682);
                field430.method2449(Statics.field1320.field2682);
                field430.method2449(Statics.field2058.field2682);
                field430.method2449(Statics.field1957.field2682);
                field430.method2366(var1, var3, field430.field1977);
                field430.method2351(field430.field1977 - var2);
                Statics.field1041.method2802(field430.field1981, 0, field430.field1977);
                field322.method2604(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field324.method2604(var1);
                field543 = 6;
            }
            if (field543 == 6 && Statics.field1041.method2804() > 0) {
                int var6 = Statics.field1041.method2803();
                if (var6 == 21 && field288 == 20) {
                    field543 = 7;
                } else if (var6 == 2) {
                    field543 = 9;
                } else if (var6 == 15 && field288 == 40) {
                    field325 = -1;
                    field543 = 13;
                } else if (var6 == 23 && field315 < 1) {
                    field315++;
                    field543 = 0;
                } else if (var6 == 29) {
                    field543 = 11;
                } else {
                    method124(var6);
                    return;
                }
            }
            if (field543 == 7 && Statics.field1041.method2804() > 0) {
                field316 = (Statics.field1041.method2803() + 3) * 60;
                field543 = 8;
            }
            if (field543 == 8) {
                field425 = 0;
                class32.method2582(class158.field2497, class158.field2345, field316 / 60 + class158.field2346);
                if (--field316 <= 0) {
                    field543 = 0;
                }
            } else {
                if (field543 == 9 && Statics.field1041.method2804() >= 13) {
                    boolean var7 = Statics.field1041.method2803() == 1;
                    Statics.field1041.method2810(field324.field1981, 0, 4);
                    field324.field1977 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field324.method2598() << 24;
                        int var10 = var9 | field324.method2598() << 16;
                        int var11 = var10 | field324.method2598() << 8;
                        int var12 = var11 | field324.method2598();
                        int var13 = class164.method174(class32.field704);
                        if (Statics.field866.field145.size() >= 10 && !Statics.field866.field145.containsKey(var13)) {
                            Iterator var14 = Statics.field866.field145.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field866.field145.put(var13, var12);
                        class9.method890();
                    }
                    field483 = Statics.field1041.method2803();
                    field448 = Statics.field1041.method2803() == 1;
                    field402 = Statics.field1041.method2803();
                    field402 <<= 0x8;
                    field402 += Statics.field1041.method2803();
                    field403 = Statics.field1041.method2803();
                    Statics.field1041.method2810(field324.field1981, 0, 1);
                    field324.field1977 = 0;
                    field326 = field324.method2598();
                    Statics.field1041.method2810(field324.field1981, 0, 2);
                    field324.field1977 = 0;
                    field325 = field324.method2532();
                    if (field403 == 1) {
                        try {
                            Statics.method2663(Statics.field375, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            Statics.method2663(Statics.field375, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field543 = 10;
                }
                if (field543 != 10) {
                    if (field543 == 11 && Statics.field1041.method2804() >= 2) {
                        field324.field1977 = 0;
                        Statics.field1041.method2810(field324.field1981, 0, 2);
                        field324.field1977 = 0;
                        Statics.field2648 = field324.method2532();
                        field543 = 12;
                    }
                    if (field543 == 12 && Statics.field1041.method2804() >= Statics.field2648) {
                        field324.field1977 = 0;
                        Statics.field1041.method2810(field324.field1981, 0, Statics.field2648);
                        field324.field1977 = 0;
                        String var17 = field324.method2363();
                        String var18 = field324.method2363();
                        String var19 = field324.method2363();
                        class32.method2582(var17, var18, var19);
                        method2795(10);
                    }
                    if (field543 == 13) {
                        if (field325 == -1) {
                            if (Statics.field1041.method2804() < 2) {
                                return;
                            }
                            Statics.field1041.method2810(field324.field1981, 0, 2);
                            field324.field1977 = 0;
                            field325 = field324.method2532();
                        }
                        if (Statics.field1041.method2804() >= field325) {
                            Statics.field1041.method2810(field324.field1981, 0, field325);
                            field324.field1977 = 0;
                            int var20 = field325;
                            field322.field1977 = 0;
                            field324.field1977 = 0;
                            field326 = -1;
                            field329 = -1;
                            field330 = -1;
                            field420 = -1;
                            field325 = 0;
                            field327 = 0;
                            field431 = 0;
                            field421 = 0;
                            field332 = false;
                            field515 = 0;
                            field433 = 0;
                            for (int var21 = 0; var21 < 2048; var21++) {
                                field388[var21] = null;
                            }
                            Statics.field573 = null;
                            for (int var22 = 0; var22 < field317.length; var22++) {
                                class35 var23 = field317[var22];
                                if (var23 != null) {
                                    var23.field846 = -1;
                                    var23.field801 = false;
                                }
                            }
                            class16.field217 = new class197(32);
                            method2795(30);
                            for (int var24 = 0; var24 < 100; var24++) {
                                field484[var24] = true;
                            }
                            method176();
                            class33.method134(field324);
                            if (field324.field1977 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field425++;
                        if (field425 > 2000) {
                            if (field315 < 1) {
                                if (Statics.field2282 == Statics.field1104) {
                                    Statics.field1104 = Statics.field1948;
                                } else {
                                    Statics.field1104 = Statics.field2282;
                                }
                                field315++;
                                field543 = 0;
                            } else {
                                method124(-3);
                            }
                        }
                    }
                } else if (Statics.field1041.method2804() >= field325) {
                    field324.field1977 = 0;
                    Statics.field1041.method2810(field324.field1981, 0, field325);
                    method638();
                    class33.method134(field324);
                    Statics.field101 = -1;
                    method575(false);
                    field326 = -1;
                }
            }
        } catch (IOException var28) {
            if (field315 < 1) {
                if (Statics.field2282 == Statics.field1104) {
                    Statics.field1104 = Statics.field1948;
                } else {
                    Statics.field1104 = Statics.field2282;
                }
                field315++;
                field543 = 0;
            } else {
                method124(-2);
            }
        }
    }

    @ObfuscatedName("ap.l(S)V")
    public static void method638() {
        field291 = 1L;
        field294 = -1;
        Statics.field729.field197 = 0;
        Statics.field1949 = true;
        field313 = true;
        field505 = -1L;
        class212.field3130 = new class203();
        field322.field1977 = 0;
        field324.field1977 = 0;
        field326 = -1;
        field329 = -1;
        field330 = -1;
        field420 = -1;
        field327 = 0;
        field431 = 0;
        field473 = 0;
        field298 = 0;
        field421 = 0;
        field332 = false;
        class141.method40(0);
        class12.field173.clear();
        class12.field172.method3529();
        class12.field174.method3575();
        class12.field171 = 0;
        field432 = 0;
        field434 = false;
        field384 = 0;
        field344 = (int) (Math.random() * 100.0D) - 50;
        field346 = (int) (Math.random() * 110.0D) - 55;
        field526 = (int) (Math.random() * 80.0D) - 40;
        field351 = (int) (Math.random() * 120.0D) - 60;
        field353 = (int) (Math.random() * 30.0D) - 20;
        field369 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field515 = 0;
        field508 = -1;
        field433 = 0;
        field514 = 0;
        field455 = class21.field570;
        field489 = class21.field570;
        field318 = 0;
        class33.field732 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field730[var0] = null;
            class33.field731[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field388[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field317[var2] = null;
        }
        field410 = -1;
        field413.method3538();
        field414.method3538();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field411[var3][var4][var5] = null;
                }
            }
        }
        field412 = new class200();
        field383 = 0;
        field546 = 0;
        field550 = 0;
        for (int var6 = 0; var6 < Statics.field3211; var6++) {
            class53 var7 = class53.method710(var6);
            if (var7 != null) {
                class177.field2906[var6] = 0;
                class177.field2904[var6] = 0;
            }
        }
        Statics.field2028.method191();
        field328 = -1;
        if (field439 != -1) {
            int var8 = field439;
            if (var8 != -1 && Statics.field2746[var8]) {
                Statics.field2747.method3035(var8);
                if (Statics.field2838[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2838[var8].length; var10++) {
                        if (Statics.field2838[var8][var10] != null) {
                            if (Statics.field2838[var8][var10].field2758 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2838[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2838[var8] = null;
                    }
                    Statics.field2746[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field440.method3513(); var11 != null; var11 = (class4) field440.method3510()) {
            method2281(var11, true);
        }
        field439 = -1;
        field440 = new class197(8);
        field443 = null;
        field332 = false;
        field421 = 0;
        field552.method3252((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field407[var12] = null;
            field408[var12] = false;
        }
        class16.field217 = new class197(32);
        field289 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field484[var13] = true;
        }
        method176();
        field506 = null;
        Statics.field645 = 0;
        Statics.field1543 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field555[var14] = new class221();
        }
        Statics.field169 = null;
    }

    @ObfuscatedName("k.o(II)V")
    public static void method124(int arg0) {
        if (arg0 == -3) {
            class32.method2582(class158.field2566, class158.field2491, class158.field2349);
        } else if (arg0 == -2) {
            class32.method2582(class158.field2350, class158.field2495, class158.field2352);
        } else if (arg0 == -1) {
            class32.method2582(class158.field2353, class158.field2354, class158.field2355);
        } else if (arg0 == 3) {
            class32.field703 = 3;
        } else if (arg0 == 4) {
            class32.method2582(class158.field2452, class158.field2357, class158.field2573);
        } else if (arg0 == 5) {
            class32.method2582(class158.field2359, class158.field2360, class158.field2361);
        } else if (arg0 == 6) {
            class32.method2582(class158.field2362, class158.field2348, class158.field2364);
        } else if (arg0 == 7) {
            class32.method2582(class158.field2467, class158.field2366, class158.field2492);
        } else if (arg0 == 8) {
            class32.method2582(class158.field2368, class158.field2369, class158.field2464);
        } else if (arg0 == 9) {
            class32.method2582(class158.field2398, class158.field2487, class158.field2373);
        } else if (arg0 == 10) {
            class32.method2582(class158.field2374, class158.field2375, class158.field2376);
        } else if (arg0 == 11) {
            class32.method2582(class158.field2316, class158.field2378, class158.field2356);
        } else if (arg0 == 12) {
            class32.method2582(class158.field2380, class158.field2381, class158.field2382);
        } else if (arg0 == 13) {
            class32.method2582(class158.field2383, class158.field2384, class158.field2309);
        } else if (arg0 == 14) {
            class32.method2582(class158.field2386, class158.field2387, class158.field2446);
        } else if (arg0 == 16) {
            class32.method2582(class158.field2389, class158.field2390, class158.field2329);
        } else if (arg0 == 17) {
            class32.method2582(class158.field2392, class158.field2570, class158.field2394);
        } else if (arg0 == 18) {
            class32.method2582(class158.field2395, class158.field2396, class158.field2397);
        } else if (arg0 == 19) {
            class32.method2582(class158.field2523, class158.field2399, class158.field2400);
        } else if (arg0 == 20) {
            class32.method2582(class158.field2401, class158.field2402, class158.field2458);
        } else if (arg0 == 22) {
            class32.method2582(class158.field2404, class158.field2405, class158.field2307);
        } else if (arg0 == 23) {
            class32.method2582(class158.field2365, class158.field2408, class158.field2409);
        } else if (arg0 == 24) {
            class32.method2582(class158.field2562, class158.field2411, class158.field2412);
        } else if (arg0 == 25) {
            class32.method2582(class158.field2413, class158.field2414, class158.field2415);
        } else if (arg0 == 26) {
            class32.method2582(class158.field2416, class158.field2417, class158.field2418);
        } else if (arg0 == 27) {
            class32.method2582(class158.field2419, class158.field2501, class158.field2509);
        } else if (arg0 == 31) {
            class32.method2582(class158.field2428, class158.field2465, class158.field2430);
        } else if (arg0 == 32) {
            class32.method2582(class158.field2431, class158.field2432, class158.field2314);
        } else if (arg0 == 37) {
            class32.method2582(class158.field2434, class158.field2391, class158.field2436);
        } else if (arg0 == 38) {
            class32.method2582(class158.field2437, class158.field2315, class158.field2439);
        } else if (arg0 == 55) {
            class32.method2582(class158.field2521, class158.field2453, class158.field2442);
        } else if (arg0 == 56) {
            class32.method2582(class158.field2443, class158.field2444, class158.field2343);
            method2795(11);
            return;
        } else if (arg0 == 57) {
            class32.method2582(class158.field2542, class158.field2447, class158.field2448);
            method2795(11);
            return;
        } else {
            class32.method2582(class158.field2449, class158.field2450, class158.field2576);
        }
        method2795(10);
    }

    @ObfuscatedName("ap.c(B)V")
    public static final void method628() {
        if (Statics.field1041 != null) {
            Statics.field1041.method2801();
            Statics.field1041 = null;
        }
        method91();
        Statics.field2251.method1779();
        for (int var0 = 0; var0 < 4; var0++) {
            field339[var0].method2242();
        }
        System.gc();
        class184.method45(2);
        field517 = -1;
        field428 = false;
        for (class24 var1 = (class24) class24.field602.method3544(); var1 != null; var1 = (class24) class24.field602.method3546()) {
            if (var1.field592 != null) {
                Statics.field2075.method1121(var1.field592);
                var1.field592 = null;
            }
            if (var1.field597 != null) {
                Statics.field2075.method1121(var1.field597);
                var1.field597 = null;
            }
        }
        class24.field602.method3538();
        method2795(10);
    }

    @ObfuscatedName("h.x(I)V")
    public static final void method91() {
        class47.field1027.method3479();
        class42.field951.method3479();
        class45.method3088();
        class41.field929.method3479();
        class41.field903.method3479();
        class41.field904.method3479();
        class41.field905.method3479();
        class40.method571();
        class52.method77();
        class43.field965.method3479();
        class43.field964.method3479();
        class44.field985.method3479();
        class44.field986.method3479();
        class48.field1050.method3479();
        class53.method989();
        class180.field2926.method3479();
        class174.method1943();
        ((class96) Statics.field1570).method2049();
        class23.field583.method3479();
        Statics.field1652.method3036();
        Statics.field3158.method3036();
        Statics.field660.method3036();
        Statics.field2176.method3036();
        Statics.field744.method3036();
        Statics.field612.method3036();
        Statics.field273.method3036();
        Statics.field247.method3036();
        Statics.field2024.method3036();
        Statics.field1881.method3036();
        Statics.field1407.method3036();
        Statics.field1190.method3036();
    }

    @ObfuscatedName("p.b(I)V")
    public static final void method47() {
        if (field473 > 0) {
            method628();
        } else {
            method2795(40);
            Statics.field1517 = Statics.field1041;
            Statics.field1041 = null;
        }
    }

    @ObfuscatedName("bx.q(I)V")
    public static final void method1562() {
        if (field431 > 1) {
            field431--;
        }
        if (field473 > 0) {
            field473--;
        }
        if (field333) {
            field333 = false;
            method47();
            return;
        }
        if (!field332) {
            field426[0] = class158.field2544;
            field427[0] = "";
            field302[0] = 1006;
            field421 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1041 == null) {
                var1 = false;
            } else {
                label3167: {
                    try {
                        int var2 = Statics.field1041.method2804();
                        if (var2 == 0) {
                            var1 = false;
                            break label3167;
                        }
                        if (field326 == -1) {
                            Statics.field1041.method2810(field324.field1981, 0, 1);
                            field324.field1977 = 0;
                            field326 = field324.method2598();
                            field325 = class189.field3030[field326];
                            var2--;
                        }
                        if (field325 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label3167;
                            }
                            Statics.field1041.method2810(field324.field1981, 0, 1);
                            field325 = field324.field1981[0] & 0xFF;
                            var2--;
                        }
                        if (field325 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label3167;
                            }
                            Statics.field1041.method2810(field324.field1981, 0, 2);
                            field324.field1977 = 0;
                            field325 = field324.method2532();
                            var2 -= 2;
                        }
                        if (var2 < field325) {
                            var1 = false;
                            break label3167;
                        }
                        field324.field1977 = 0;
                        Statics.field1041.method2810(field324.field1981, 0, field325);
                        field327 = 0;
                        field420 = field330;
                        field330 = field329;
                        field329 = field326;
                        if (field326 == 147) {
                            int var3 = field324.method2398();
                            int var4 = field324.method2532();
                            int var5 = field324.method2393();
                            class174 var6 = class174.method2906(var3);
                            var6.field2812 = (var4 << 16) + var5;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 231) {
                            field515 = field324.method2355();
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 55) {
                            int var7 = field324.method2532();
                            int var8 = field324.method2355();
                            int var9 = field324.method2532();
                            if (field397 != 0 && var8 != 0 && field384 < 50) {
                                field522[field384] = var7;
                                field523[field384] = var8;
                                field524[field384] = var9;
                                field445[field384] = null;
                                field447[field384] = 0;
                                field384++;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 31) {
                            int var13 = field324.method2389();
                            field439 = var13;
                            int var14 = field439;
                            int var15 = Statics.field763;
                            int var16 = Statics.field576;
                            if (class174.method2294(var14)) {
                                method1037(Statics.field2838[var14], -1, var15, var16, false);
                            }
                            method617(var13);
                            class37.method3639(field439);
                            for (int var17 = 0; var17 < 100; var17++) {
                                field484[var17] = true;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 40) {
                            String var18 = field324.method2363();
                            class123 var19 = field324;
                            String var20 = class223.method1560(var19, 32767);
                            String var21 = class224.method3791(class164.method574(var20));
                            class12.method1945(6, var18, var21);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 57) {
                            Statics.field1078 = field324.method2355();
                            Statics.field343 = field324.method2382();
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 222) {
                            field519 = field324.method2355();
                            field498 = field324.method2355();
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 188) {
                            class123 var22 = field324;
                            int var23 = field325;
                            int var24 = var22.field1977;
                            class33.field742 = 0;
                            int var25 = 0;
                            var22.method2587();
                            for (int var26 = 0; var26 < class33.field732; var26++) {
                                int var27 = class33.field733[var26];
                                if ((class33.field741[var27] & 0x1) == 0) {
                                    if (var25 > 0) {
                                        var25--;
                                        class33.field741[var27] = (byte) (class33.field741[var27] | 0x2);
                                    } else {
                                        int var28 = var22.method2588(1);
                                        if (var28 == 0) {
                                            var25 = class33.method653(var22);
                                            class33.field741[var27] = (byte) (class33.field741[var27] | 0x2);
                                        } else {
                                            class33.method41(var22, var27);
                                        }
                                    }
                                }
                            }
                            var22.method2586();
                            if (var25 != 0) {
                                throw new RuntimeException();
                            }
                            var22.method2587();
                            for (int var29 = 0; var29 < class33.field732; var29++) {
                                int var30 = class33.field733[var29];
                                if ((class33.field741[var30] & 0x1) != 0) {
                                    if (var25 > 0) {
                                        var25--;
                                        class33.field741[var30] = (byte) (class33.field741[var30] | 0x2);
                                    } else {
                                        int var31 = var22.method2588(1);
                                        if (var31 == 0) {
                                            var25 = class33.method653(var22);
                                            class33.field741[var30] = (byte) (class33.field741[var30] | 0x2);
                                        } else {
                                            class33.method41(var22, var30);
                                        }
                                    }
                                }
                            }
                            var22.method2586();
                            if (var25 != 0) {
                                throw new RuntimeException();
                            }
                            var22.method2587();
                            for (int var32 = 0; var32 < class33.field734; var32++) {
                                int var33 = class33.field735[var32];
                                if ((class33.field741[var33] & 0x1) != 0) {
                                    if (var25 > 0) {
                                        var25--;
                                        class33.field741[var33] = (byte) (class33.field741[var33] | 0x2);
                                    } else {
                                        int var34 = var22.method2588(1);
                                        if (var34 == 0) {
                                            var25 = class33.method653(var22);
                                            class33.field741[var33] = (byte) (class33.field741[var33] | 0x2);
                                        } else if (class33.method646(var22, var33)) {
                                            class33.field741[var33] = (byte) (class33.field741[var33] | 0x2);
                                        }
                                    }
                                }
                            }
                            var22.method2586();
                            if (var25 != 0) {
                                throw new RuntimeException();
                            }
                            var22.method2587();
                            for (int var35 = 0; var35 < class33.field734; var35++) {
                                int var36 = class33.field735[var35];
                                if ((class33.field741[var36] & 0x1) == 0) {
                                    if (var25 > 0) {
                                        var25--;
                                        class33.field741[var36] = (byte) (class33.field741[var36] | 0x2);
                                    } else {
                                        int var37 = var22.method2588(1);
                                        if (var37 == 0) {
                                            var25 = class33.method653(var22);
                                            class33.field741[var36] = (byte) (class33.field741[var36] | 0x2);
                                        } else if (class33.method646(var22, var36)) {
                                            class33.field741[var36] = (byte) (class33.field741[var36] | 0x2);
                                        }
                                    }
                                }
                            }
                            var22.method2586();
                            if (var25 != 0) {
                                throw new RuntimeException();
                            }
                            class33.field732 = 0;
                            class33.field734 = 0;
                            for (int var38 = 1; var38 < 2048; var38++) {
                                class33.field741[var38] = (byte) (class33.field741[var38] >> 1);
                                class3 var39 = field388[var38];
                                if (var39 == null) {
                                    class33.field735[++class33.field734 - 1] = var38;
                                } else {
                                    class33.field733[++class33.field732 - 1] = var38;
                                }
                            }
                            class33.method15(var22);
                            if (var22.field1977 - var24 != var23) {
                                throw new RuntimeException(var22.field1977 - var24 + " " + var23);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 215) {
                            while (field324.field1977 < field325) {
                                boolean var40 = field324.method2355() == 1;
                                String var41 = field324.method2363();
                                String var42 = field324.method2363();
                                int var43 = field324.method2532();
                                int var44 = field324.method2355();
                                int var45 = field324.method2355();
                                boolean var46 = (var45 & 0x2) != 0;
                                boolean var47 = (var45 & 0x1) != 0;
                                if (var43 > 0) {
                                    field324.method2363();
                                    field324.method2355();
                                    field324.method2360();
                                }
                                field324.method2363();
                                for (int var48 = 0; var48 < field546; var48++) {
                                    class18 var49 = field548[var48];
                                    if (var40) {
                                        if (var42.equals(var49.field248)) {
                                            var49.field248 = var41;
                                            var49.field246 = var42;
                                            var41 = null;
                                            break;
                                        }
                                    } else if (var41.equals(var49.field248)) {
                                        if (var49.field243 != var43) {
                                            boolean var50 = true;
                                            for (class39 var51 = (class39) field549.method3503(); var51 != null; var51 = (class39) field549.method3498()) {
                                                if (var51.field850.equals(var41)) {
                                                    if (var43 != 0 && var51.field859 == 0) {
                                                        var51.method3630();
                                                        var50 = false;
                                                    } else if (var43 == 0 && var51.field859 != 0) {
                                                        var51.method3630();
                                                        var50 = false;
                                                    }
                                                }
                                            }
                                            if (var50) {
                                                field549.method3497(new class39(var41, var43));
                                            }
                                            var49.field243 = var43;
                                        }
                                        var49.field246 = var42;
                                        var49.field245 = var44;
                                        var49.field242 = var46;
                                        var49.field241 = var47;
                                        var41 = null;
                                        break;
                                    }
                                }
                                if (var41 != null && field546 < 400) {
                                    class18 var52 = new class18();
                                    field548[field546] = var52;
                                    var52.field248 = var41;
                                    var52.field246 = var42;
                                    var52.field243 = var43;
                                    var52.field245 = var44;
                                    var52.field242 = var46;
                                    var52.field241 = var47;
                                    field546++;
                                }
                            }
                            field383 = 2;
                            field472 = field464;
                            boolean var53 = false;
                            int var54 = field546;
                            while (var54 > 0) {
                                boolean var55 = true;
                                var54--;
                                for (int var56 = 0; var56 < var54; var56++) {
                                    boolean var57 = false;
                                    class18 var58 = field548[var56];
                                    class18 var59 = field548[var56 + 1];
                                    if (field280 != var58.field243 && field280 == var59.field243) {
                                        var57 = true;
                                    }
                                    if (!var57 && var58.field243 == 0 && var59.field243 != 0) {
                                        var57 = true;
                                    }
                                    if (!var57 && !var58.field242 && var59.field242) {
                                        var57 = true;
                                    }
                                    if (!var57 && !var58.field241 && var59.field241) {
                                        var57 = true;
                                    }
                                    if (var57) {
                                        class18 var60 = field548[var56];
                                        field548[var56] = field548[var56 + 1];
                                        field548[var56 + 1] = var60;
                                        var55 = false;
                                    }
                                }
                                if (var55) {
                                    break;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 102) {
                            int var61 = field324.method2495();
                            int var62 = field324.method2393();
                            class177.field2906[var62] = var61;
                            if (class177.field2904[var62] != var61) {
                                class177.field2904[var62] = var61;
                            }
                            method987(var62);
                            field465[++field558 - 1 & 0x1F] = var62;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 95) {
                            int var63 = field324.method2360();
                            int var64 = field324.method2532();
                            if (var63 < -70000) {
                                var64 += 32768;
                            }
                            class174 var65;
                            if (var63 >= 0) {
                                var65 = class174.method2906(var63);
                            } else {
                                var65 = null;
                            }
                            if (var65 != null) {
                                for (int var66 = 0; var66 < var65.field2760.length; var66++) {
                                    var65.field2760[var66] = 0;
                                    var65.field2874[var66] = 0;
                                }
                            }
                            class16 var67 = (class16) class16.field217.method3507((long) var64);
                            if (var67 != null) {
                                for (int var68 = 0; var68 < var67.field220.length; var68++) {
                                    var67.field220[var68] = -1;
                                    var67.field218[var68] = 0;
                                }
                            }
                            int var69 = field324.method2532();
                            for (int var70 = 0; var70 < var69; var70++) {
                                int var71 = field324.method2382();
                                if (var71 == 255) {
                                    var71 = field324.method2398();
                                }
                                int var72 = field324.method2532();
                                if (var65 != null && var70 < var65.field2760.length) {
                                    var65.field2760[var70] = var72;
                                    var65.field2874[var70] = var71;
                                }
                                class16.method622(var64, var70, var72 - 1, var71);
                            }
                            if (var65 != null) {
                                method130(var65);
                            }
                            method158();
                            field482[++field468 - 1 & 0x1F] = var64 & 0x7FFF;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 205) {
                            Statics.field1078 = field324.method2381();
                            Statics.field343 = field324.method2382();
                            while (field324.field1977 < field325) {
                                field326 = field324.method2355();
                                method2239();
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 197) {
                            field475 = field464;
                            if (field325 == 0) {
                                field506 = null;
                                field507 = null;
                                Statics.field645 = 0;
                                Statics.field1543 = null;
                                field326 = -1;
                                var1 = true;
                            } else {
                                field507 = field324.method2363();
                                long var73 = field324.method2361();
                                field506 = class163.method2902(var73);
                                Statics.field18 = field324.method2465();
                                int var75 = field324.method2355();
                                if (var75 == 255) {
                                    field326 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field645 = var75;
                                    class25[] var76 = new class25[100];
                                    for (int var77 = 0; var77 < Statics.field645; var77++) {
                                        var76[var77] = new class25();
                                        var76[var77].field610 = field324.method2363();
                                        var76[var77].field608 = class165.method2605(var76[var77].field610, Statics.field284);
                                        var76[var77].field611 = field324.method2532();
                                        var76[var77].field609 = field324.method2465();
                                        field324.method2363();
                                        if (var76[var77].field610.equals(Statics.field573.field46)) {
                                            Statics.field1013 = var76[var77].field609;
                                        }
                                    }
                                    boolean var78 = false;
                                    int var79 = Statics.field645;
                                    while (var79 > 0) {
                                        boolean var80 = true;
                                        var79--;
                                        for (int var81 = 0; var81 < var79; var81++) {
                                            if (var76[var81].field608.compareTo(var76[var81 + 1].field608) > 0) {
                                                class25 var82 = var76[var81];
                                                var76[var81] = var76[var81 + 1];
                                                var76[var81 + 1] = var82;
                                                var80 = false;
                                            }
                                        }
                                        if (var80) {
                                            break;
                                        }
                                    }
                                    Statics.field1543 = var76;
                                    field326 = -1;
                                    var1 = true;
                                }
                            }
                            break label3167;
                        }
                        if (field326 == 83 || field326 == 191 || field326 == 177 || field326 == 33 || field326 == 238 || field326 == 245 || field326 == 200 || field326 == 81 || field326 == 203 || field326 == 228) {
                            method2239();
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 234) {
                            int var83 = field324.method2358();
                            int var84 = field324.method2360();
                            int var85 = field324.method2392();
                            class174 var86 = class174.method2906(var84);
                            if (var86.field2765 != var85 || var86.field2887 != var83 || var86.field2761 != 0 || var86.field2762 != 0) {
                                var86.field2765 = var85;
                                var86.field2887 = var83;
                                var86.field2761 = 0;
                                var86.field2762 = 0;
                                method130(var86);
                                method1955(var86);
                                if (var86.field2758 == 0) {
                                    method3274(Statics.field2838[var84 >> 16], var86, false);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 66) {
                            int var87 = field324.method2355();
                            int var88 = field324.method2355();
                            int var89 = field324.method2355();
                            int var90 = field324.method2355();
                            field389[var87] = true;
                            field529[var87] = var88;
                            field530[var87] = var89;
                            field277[var87] = var90;
                            field532[var87] = 0;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 117) {
                            int var91 = field324.method2399();
                            int var92 = field324.method2419();
                            if (var92 == 65535) {
                                var92 = -1;
                            }
                            int var93 = field324.method2399();
                            class174 var94 = class174.method2906(var93);
                            if (var94.field2810) {
                                var94.field2823 = var92;
                                var94.field2867 = var91;
                                class52 var96 = class52.method696(var92);
                                var94.field2766 = var96.field1098;
                                var94.field2808 = var96.field1099;
                                var94.field2801 = var96.field1085;
                                var94.field2805 = var96.field1107;
                                var94.field2806 = var96.field1134;
                                var94.field2803 = var96.field1097;
                                if (var96.field1103 == 1) {
                                    var94.field2814 = 1;
                                } else {
                                    var94.field2814 = 2;
                                }
                                if (var94.field2811 > 0) {
                                    var94.field2803 = var94.field2803 * 32 / var94.field2811;
                                } else if (var94.field2767 > 0) {
                                    var94.field2803 = var94.field2803 * 32 / var94.field2767;
                                }
                                method130(var94);
                            } else {
                                if (var92 == -1) {
                                    var94.field2799 = 0;
                                    field326 = -1;
                                    var1 = true;
                                    break label3167;
                                }
                                class52 var95 = class52.method696(var92);
                                var94.field2799 = 4;
                                var94.field2877 = var92;
                                var94.field2766 = var95.field1098;
                                var94.field2808 = var95.field1099;
                                var94.field2803 = var95.field1097 * 100 / var91;
                                method130(var94);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 106) {
                            field431 = field324.method2393() * 30;
                            field547 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 129) {
                            method158();
                            field444 = field324.method2355();
                            field547 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 18) {
                            int var97 = field324.method2398();
                            boolean var98 = field324.method2382() == 1;
                            class174 var99 = class174.method2906(var97);
                            if (var99.field2776 != var98) {
                                var99.field2776 = var98;
                                method130(var99);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 75) {
                            int var100 = field324.method2355();
                            if (field324.method2355() == 0) {
                                field555[var100] = new class221();
                                field324.field1977 += 18;
                            } else {
                                field324.field1977--;
                                field555[var100] = new class221(field324, false);
                            }
                            field474 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 232) {
                            int var101 = field324.method2383();
                            String var102 = field324.method2363();
                            int var103 = field324.method2382();
                            if (var103 >= 1 && var103 <= 8) {
                                if (var102.equalsIgnoreCase("null")) {
                                    var102 = null;
                                }
                                field407[var103 - 1] = var102;
                                field408[var103 - 1] = var101 == 0;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 120) {
                            while (field324.field1977 < field325) {
                                int var104 = field324.method2355();
                                boolean var105 = (var104 & 0x1) == 1;
                                String var106 = field324.method2363();
                                String var107 = field324.method2363();
                                field324.method2363();
                                for (int var108 = 0; var108 < field550; var108++) {
                                    class8 var109 = field551[var108];
                                    if (var105) {
                                        if (var107.equals(var109.field142)) {
                                            var109.field142 = var106;
                                            var109.field136 = var107;
                                            var106 = null;
                                            break;
                                        }
                                    } else if (var106.equals(var109.field142)) {
                                        var109.field142 = var106;
                                        var109.field136 = var107;
                                        var106 = null;
                                        break;
                                    }
                                }
                                if (var106 != null && field550 < 400) {
                                    class8 var110 = new class8();
                                    field551[field550] = var110;
                                    var110.field142 = var106;
                                    var110.field136 = var107;
                                    field550++;
                                }
                            }
                            field472 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 151) {
                            field314 = false;
                            for (int var111 = 0; var111 < 5; var111++) {
                                field389[var111] = false;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 94) {
                            int var112 = field324.method2360();
                            int var113 = field324.method2360();
                            if (Statics.field1864 == null || !Statics.field1864.isValid()) {
                                try {
                                    Iterator var114 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var114.hasNext()) {
                                        GarbageCollectorMXBean var115 = (GarbageCollectorMXBean) var114.next();
                                        if (var115.isValid()) {
                                            Statics.field1864 = var115;
                                            field557 = -1L;
                                            field556 = -1L;
                                        }
                                    }
                                } catch (Throwable var500) {
                                }
                            }
                            long var117 = class116.method2794();
                            int var119 = -1;
                            if (Statics.field1864 != null) {
                                long var120 = Statics.field1864.getCollectionTime();
                                if (field556 != -1L) {
                                    long var122 = var120 - field556;
                                    long var124 = var117 - field557;
                                    if (var124 != 0L) {
                                        var119 = (int) (var122 * 100L / var124);
                                    }
                                }
                                field556 = var120;
                                field557 = var117;
                            }
                            field322.method2594(162);
                            field322.method2387(field2196);
                            field322.method2515(var112);
                            field322.method2395(var113);
                            field322.method2540(var119);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 133) {
                            int var126 = field324.method2495();
                            int var127 = field324.method2398();
                            class4 var128 = (class4) field440.method3507((long) var126);
                            class4 var129 = (class4) field440.method3507((long) var127);
                            if (var129 != null) {
                                method2281(var129, var128 == null || var128.field70 != var129.field70);
                            }
                            if (var128 != null) {
                                var128.method3632();
                                field440.method3508(var128, (long) var127);
                            }
                            class174 var130 = class174.method2906(var126);
                            if (var130 != null) {
                                method130(var130);
                            }
                            class174 var131 = class174.method2906(var127);
                            if (var131 != null) {
                                method130(var131);
                                method3274(Statics.field2838[var131.field2795 >>> 16], var131, true);
                            }
                            if (field439 != -1) {
                                method131(field439, 1);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 219) {
                            Statics.field343 = field324.method2381();
                            Statics.field1078 = field324.method2382();
                            for (int var132 = Statics.field1078; var132 < Statics.field1078 + 8; var132++) {
                                for (int var133 = Statics.field343; var133 < Statics.field343 + 8; var133++) {
                                    if (field411[Statics.field1064][var132][var133] != null) {
                                        field411[Statics.field1064][var132][var133] = null;
                                        Statics.method665(var132, var133);
                                    }
                                }
                            }
                            for (class17 var134 = (class17) field412.method3544(); var134 != null; var134 = (class17) field412.method3546()) {
                                if (var134.field227 >= Statics.field1078 && var134.field227 < Statics.field1078 + 8 && var134.field228 >= Statics.field343 && var134.field228 < Statics.field343 + 8 && Statics.field1064 == var134.field240) {
                                    var134.field236 = 0;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 5) {
                            field314 = true;
                            Statics.field222 = field324.method2355();
                            Statics.field1932 = field324.method2355();
                            Statics.field2019 = field324.method2532();
                            Statics.field672 = field324.method2355();
                            Statics.field739 = field324.method2355();
                            if (Statics.field739 >= 100) {
                                int var135 = Statics.field222 * 128 + 64;
                                int var136 = Statics.field1932 * 128 + 64;
                                int var137 = method1216(var135, var136, Statics.field1064) - Statics.field2019;
                                int var138 = var135 - Statics.field274;
                                int var139 = var137 - Statics.field13;
                                int var140 = var136 - Statics.field96;
                                int var141 = (int) Math.sqrt((double) (var138 * var138 + var140 * var140));
                                Statics.field3157 = (int) (Math.atan2((double) var139, (double) var141) * 325.949D) & 0x7FF;
                                Statics.field168 = (int) (Math.atan2((double) var138, (double) var140) * -325.949D) & 0x7FF;
                                if (Statics.field3157 < 128) {
                                    Statics.field3157 = 128;
                                }
                                if (Statics.field3157 > 383) {
                                    Statics.field3157 = 383;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 214) {
                            int var142 = field324.method2419();
                            int var143 = field324.method2398();
                            class174 var144 = class174.method2906(var143);
                            if (var144.field2799 != 1 || var144.field2877 != var142) {
                                var144.field2799 = 1;
                                var144.field2877 = var142;
                                method130(var144);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 49) {
                            int var145 = field324.method2419();
                            if (var145 == 65535) {
                                var145 = -1;
                            }
                            if (var145 == -1 && !field428) {
                                class184.method760();
                            } else if (var145 != -1 && field517 != var145 && field516 != 0 && !field428) {
                                class169 var146 = Statics.field612;
                                int var147 = field516;
                                class184.field2959 = 1;
                                Statics.field210 = var146;
                                Statics.field2220 = var145;
                                Statics.field2657 = 0;
                                Statics.field1612 = var147;
                                Statics.field2031 = false;
                                Statics.field3119 = 2;
                            }
                            field517 = var145;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 93) {
                            int var148 = field324.method2359();
                            int var149 = field324.method2389();
                            if (var149 == 65535) {
                                var149 = -1;
                            }
                            method3465(var149, var148);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 246) {
                            method628();
                            field326 = -1;
                            var1 = false;
                            break label3167;
                        }
                        if (field326 == 204) {
                            for (int var150 = 0; var150 < Statics.field3211; var150++) {
                                class53 var151 = class53.method710(var150);
                                if (var151 != null) {
                                    class177.field2906[var150] = 0;
                                    class177.field2904[var150] = 0;
                                }
                            }
                            method158();
                            field558 += 32;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 225) {
                            String var152 = field324.method2363();
                            long var153 = field324.method2361();
                            long var155 = (long) field324.method2532();
                            long var157 = (long) field324.method2359();
                            class153 var159 = (class153) class110.method709(class153.method2676(), field324.method2355());
                            long var160 = (var155 << 32) + var157;
                            boolean var162 = false;
                            for (int var163 = 0; var163 < 100; var163++) {
                                if (field341[var163] == var160) {
                                    var162 = true;
                                    break;
                                }
                            }
                            if (var159.field2258 && method3002(var152)) {
                                var162 = true;
                            }
                            if (!var162 && field308 == 0) {
                                field341[field501] = var160;
                                field501 = (field501 + 1) % 100;
                                class123 var164 = field324;
                                String var165 = class223.method1560(var164, 32767);
                                String var166 = class224.method3791(class164.method574(var165));
                                if (var159.field2259 == -1) {
                                    class12.method948(9, var152, var166, Statics.method2942(var153));
                                } else {
                                    class12.method948(9, class2.method2037(var159.field2259) + var152, var166, Statics.method2942(var153));
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 167) {
                            int var167 = field324.method2495();
                            class174 var168 = class174.method2906(var167);
                            for (int var169 = 0; var169 < var168.field2760.length; var169++) {
                                var168.field2760[var169] = -1;
                                var168.field2760[var169] = 0;
                            }
                            method130(var168);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 181) {
                            int var170 = field324.method2360();
                            int var171 = field324.method2532();
                            if (var170 < -70000) {
                                var171 += 32768;
                            }
                            class174 var172;
                            if (var170 >= 0) {
                                var172 = class174.method2906(var170);
                            } else {
                                var172 = null;
                            }
                            while (field324.field1977 < field325) {
                                int var173 = field324.method2368();
                                int var174 = field324.method2532();
                                int var175 = 0;
                                if (var174 != 0) {
                                    var175 = field324.method2355();
                                    if (var175 == 255) {
                                        var175 = field324.method2360();
                                    }
                                }
                                if (var172 != null && var173 >= 0 && var173 < var172.field2760.length) {
                                    var172.field2760[var173] = var174;
                                    var172.field2874[var173] = var175;
                                }
                                class16.method622(var171, var173, var174 - 1, var175);
                            }
                            if (var172 != null) {
                                method130(var172);
                            }
                            method158();
                            field482[++field468 - 1 & 0x1F] = var171 & 0x7FFF;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 174) {
                            method2061(false);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 82) {
                            int var176 = field324.method2389();
                            class16.method3182(var176);
                            field482[++field468 - 1 & 0x1F] = var176 & 0x7FFF;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 119) {
                            int var177 = field324.method2399();
                            int var178 = field324.method2392();
                            class174 var179 = class174.method2906(var177);
                            if (var179.field2846 != var178 || var178 == -1) {
                                var179.field2846 = var178;
                                var179.field2750 = 0;
                                var179.field2869 = 0;
                                method130(var179);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 241) {
                            method158();
                            field366 = field324.method2358();
                            field547 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 248) {
                            Statics.field1760 = class131.method159(field324.method2355());
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 127) {
                            String var180 = field324.method2363();
                            long var181 = (long) field324.method2532();
                            long var183 = (long) field324.method2359();
                            class153 var185 = (class153) class110.method709(class153.method2676(), field324.method2355());
                            long var186 = (var181 << 32) + var183;
                            boolean var188 = false;
                            for (int var189 = 0; var189 < 100; var189++) {
                                if (field341[var189] == var186) {
                                    var188 = true;
                                    break;
                                }
                            }
                            if (method3002(var180)) {
                                var188 = true;
                            }
                            if (!var188 && field308 == 0) {
                                field341[field501] = var186;
                                field501 = (field501 + 1) % 100;
                                class123 var190 = field324;
                                String var191 = class223.method1560(var190, 32767);
                                String var192 = class224.method3791(class164.method574(var191));
                                byte var193;
                                if (var185.field2255) {
                                    var193 = 7;
                                } else {
                                    var193 = 3;
                                }
                                if (var185.field2259 == -1) {
                                    class12.method1945(var193, var180, var192);
                                } else {
                                    class12.method1945(var193, class2.method2037(var185.field2259) + var180, var192);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 159) {
                            String var194 = field324.method2363();
                            Object[] var195 = new Object[var194.length() + 1];
                            for (int var196 = var194.length() - 1; var196 >= 0; var196--) {
                                if (var194.charAt(var196) == 's') {
                                    var195[var196 + 1] = field324.method2363();
                                } else {
                                    var195[var196 + 1] = Integer.valueOf(field324.method2360());
                                }
                            }
                            var195[0] = Integer.valueOf(field324.method2360());
                            class1 var197 = new class1();
                            var197.field12 = var195;
                            class37.method2036(var197);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 198) {
                            int var198 = field324.method2389();
                            int var199 = field324.method2398();
                            class174 var200 = class174.method2906(var199);
                            if (var200 != null && var200.field2758 == 0) {
                                if (var198 > var200.field2780 - var200.field2835) {
                                    var198 = var200.field2780 - var200.field2835;
                                }
                                if (var198 < 0) {
                                    var198 = 0;
                                }
                                if (var200.field2816 != var198) {
                                    var200.field2816 = var198;
                                    method130(var200);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 202) {
                            byte var201 = field324.method2465();
                            int var202 = field324.method2389();
                            class177.field2906[var202] = var201;
                            if (class177.field2904[var202] != var201) {
                                class177.field2904[var202] = var201;
                            }
                            method987(var202);
                            field465[++field558 - 1 & 0x1F] = var202;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 15) {
                            class123 var203 = field324;
                            int var204 = field325;
                            class211 var205 = new class211();
                            var205.field3121 = var203.method2355();
                            var205.field3122 = var203.method2360();
                            var205.field3120 = new int[var205.field3121];
                            var205.field3123 = new int[var205.field3121];
                            var205.field3124 = new Field[var205.field3121];
                            var205.field3125 = new int[var205.field3121];
                            var205.field3126 = new Method[var205.field3121];
                            var205.field3127 = new byte[var205.field3121][][];
                            for (int var206 = 0; var206 < var205.field3121; var206++) {
                                try {
                                    int var207 = var203.method2355();
                                    if (var207 == 0 || var207 == 1 || var207 == 2) {
                                        String var208 = var203.method2363();
                                        String var209 = var203.method2363();
                                        int var210 = 0;
                                        if (var207 == 1) {
                                            var210 = var203.method2360();
                                        }
                                        var205.field3120[var206] = var207;
                                        var205.field3125[var206] = var210;
                                        if (class212.method3220(var208).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var205.field3124[var206] = class212.method3220(var208).getDeclaredField(var209);
                                    } else if (var207 == 3 || var207 == 4) {
                                        String var211 = var203.method2363();
                                        String var212 = var203.method2363();
                                        int var213 = var203.method2355();
                                        String[] var214 = new String[var213];
                                        for (int var215 = 0; var215 < var213; var215++) {
                                            var214[var215] = var203.method2363();
                                        }
                                        String var216 = var203.method2363();
                                        byte[][] var217 = new byte[var213][];
                                        if (var207 == 3) {
                                            for (int var218 = 0; var218 < var213; var218++) {
                                                int var219 = var203.method2360();
                                                var217[var218] = new byte[var219];
                                                var203.method2541(var217[var218], 0, var219);
                                            }
                                        }
                                        var205.field3120[var206] = var207;
                                        Class[] var220 = new Class[var213];
                                        for (int var221 = 0; var221 < var213; var221++) {
                                            var220[var221] = class212.method3220(var214[var221]);
                                        }
                                        Class var222 = class212.method3220(var216);
                                        if (class212.method3220(var211).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var223 = class212.method3220(var211).getDeclaredMethods();
                                        Method[] var224 = var223;
                                        for (int var225 = 0; var225 < var224.length; var225++) {
                                            Method var226 = var224[var225];
                                            if (var226.getName().equals(var212)) {
                                                Class[] var227 = var226.getParameterTypes();
                                                if (var220.length == var227.length) {
                                                    boolean var228 = true;
                                                    for (int var229 = 0; var229 < var220.length; var229++) {
                                                        if (var220[var229] != var227[var229]) {
                                                            var228 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var228 && var222 == var226.getReturnType()) {
                                                        var205.field3126[var206] = var226;
                                                    }
                                                }
                                            }
                                        }
                                        var205.field3127[var206] = var217;
                                    }
                                } catch (ClassNotFoundException var501) {
                                    var205.field3123[var206] = -1;
                                } catch (SecurityException var502) {
                                    var205.field3123[var206] = -2;
                                } catch (NullPointerException var503) {
                                    var205.field3123[var206] = -3;
                                } catch (Exception var504) {
                                    var205.field3123[var206] = -4;
                                } catch (Throwable var505) {
                                    var205.field3123[var206] = -5;
                                }
                            }
                            class212.field3130.method3584(var205);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 161) {
                            class33.field732 = 0;
                            for (int var235 = 0; var235 < 2048; var235++) {
                                class33.field730[var235] = null;
                                class33.field731[var235] = 1;
                            }
                            for (int var236 = 0; var236 < 2048; var236++) {
                                field388[var236] = null;
                            }
                            class33.method134(field324);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 123) {
                            int var237 = field325 + field324.field1977;
                            int var238 = field324.method2532();
                            int var239 = field324.method2532();
                            if (field439 != var238) {
                                field439 = var238;
                                int var240 = field439;
                                int var241 = Statics.field763;
                                int var242 = Statics.field576;
                                if (class174.method2294(var240)) {
                                    method1037(Statics.field2838[var240], -1, var241, var242, false);
                                }
                                method617(field439);
                                class37.method3639(field439);
                                for (int var243 = 0; var243 < 100; var243++) {
                                    field484[var243] = true;
                                }
                            }
                            while (var239-- > 0) {
                                int var244 = field324.method2360();
                                int var245 = field324.method2532();
                                int var246 = field324.method2355();
                                class4 var247 = (class4) field440.method3507((long) var244);
                                if (var247 != null && var247.field70 != var245) {
                                    method2281(var247, true);
                                    var247 = null;
                                }
                                if (var247 == null) {
                                    class4 var248 = new class4();
                                    var248.field70 = var245;
                                    var248.field65 = var246;
                                    field440.method3508(var248, (long) var244);
                                    method617(var245);
                                    class174 var249 = class174.method2906(var244);
                                    method130(var249);
                                    if (field443 != null) {
                                        method130(field443);
                                        field443 = null;
                                    }
                                    int var250 = 0;
                                    while (true) {
                                        if (var250 >= field421) {
                                            method3274(Statics.field2838[var244 >> 16], var249, false);
                                            class37.method3639(var245);
                                            if (field439 != -1) {
                                                method131(field439, 1);
                                            }
                                            var247 = var248;
                                            break;
                                        }
                                        if (method42(field302[var250])) {
                                            if (var250 < field421 - 1) {
                                                for (int var251 = var250; var251 < field421 - 1; var251++) {
                                                    field426[var251] = field426[var251 + 1];
                                                    field427[var251] = field427[var251 + 1];
                                                    field302[var251] = field302[var251 + 1];
                                                    field392[var251] = field392[var251 + 1];
                                                    field495[var251] = field495[var251 + 1];
                                                    field423[var251] = field423[var251 + 1];
                                                }
                                            }
                                            field421--;
                                        }
                                        var250++;
                                    }
                                }
                                var247.field64 = true;
                            }
                            for (class4 var253 = (class4) field440.method3513(); var253 != null; var253 = (class4) field440.method3510()) {
                                if (var253.field64) {
                                    var253.field64 = false;
                                } else {
                                    method2281(var253, true);
                                }
                            }
                            field481 = new class197(512);
                            while (field324.field1977 < var237) {
                                int var254 = field324.method2360();
                                int var255 = field324.method2532();
                                int var256 = field324.method2532();
                                int var257 = field324.method2360();
                                for (int var258 = var255; var258 <= var256; var258++) {
                                    long var259 = ((long) var254 << 32) + (long) var258;
                                    field481.method3508(new class202(var257), var259);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 254) {
                            method2061(true);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 150) {
                            String var261 = field324.method2363();
                            int var262 = field324.method2532();
                            byte var263 = field324.method2465();
                            boolean var264 = false;
                            if (var263 == -128) {
                                var264 = true;
                            }
                            if (var264) {
                                if (Statics.field645 == 0) {
                                    field326 = -1;
                                    var1 = true;
                                    break label3167;
                                }
                                boolean var265 = false;
                                int var266;
                                for (var266 = 0; var266 < Statics.field645 && (!Statics.field1543[var266].field610.equals(var261) || Statics.field1543[var266].field611 != var262); var266++) {
                                }
                                if (var266 < Statics.field645) {
                                    while (var266 < Statics.field645 - 1) {
                                        Statics.field1543[var266] = Statics.field1543[var266 + 1];
                                        var266++;
                                    }
                                    Statics.field645--;
                                    Statics.field1543[Statics.field645] = null;
                                }
                            } else {
                                field324.method2363();
                                class25 var267 = new class25();
                                var267.field610 = var261;
                                var267.field608 = class165.method2605(var267.field610, Statics.field284);
                                var267.field611 = var262;
                                var267.field609 = var263;
                                int var268;
                                for (var268 = Statics.field645 - 1; var268 >= 0; var268--) {
                                    int var269 = Statics.field1543[var268].field608.compareTo(var267.field608);
                                    if (var269 == 0) {
                                        Statics.field1543[var268].field611 = var262;
                                        Statics.field1543[var268].field609 = var263;
                                        if (var261.equals(Statics.field573.field46)) {
                                            Statics.field1013 = var263;
                                        }
                                        field475 = field464;
                                        field326 = -1;
                                        var1 = true;
                                        break label3167;
                                    }
                                    if (var269 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field645 >= Statics.field1543.length) {
                                    field326 = -1;
                                    var1 = true;
                                    break label3167;
                                }
                                for (int var270 = Statics.field645 - 1; var270 > var268; var270--) {
                                    Statics.field1543[var270 + 1] = Statics.field1543[var270];
                                }
                                if (Statics.field645 == 0) {
                                    Statics.field1543 = new class25[100];
                                }
                                Statics.field1543[var268 + 1] = var267;
                                Statics.field645++;
                                if (var261.equals(Statics.field573.field46)) {
                                    Statics.field1013 = var263;
                                }
                            }
                            field475 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 105) {
                            for (int var271 = 0; var271 < field388.length; var271++) {
                                if (field388[var271] != null) {
                                    field388[var271].field820 = -1;
                                }
                            }
                            for (int var272 = 0; var272 < field317.length; var272++) {
                                if (field317[var272] != null) {
                                    field317[var272].field820 = -1;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 176) {
                            int var273 = field324.method2419();
                            int var274 = field324.method2389();
                            int var275 = field324.method2419();
                            int var276 = field324.method2495();
                            class174 var277 = class174.method2906(var276);
                            if (var277.field2766 != var275 || var277.field2808 != var274 || var277.field2803 != var273) {
                                var277.field2766 = var275;
                                var277.field2808 = var274;
                                var277.field2803 = var273;
                                method130(var277);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 97) {
                            int var278 = field324.method2495();
                            Statics.field306 = Statics.field2029.method2700(var278);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 179) {
                            String var279 = field324.method2363();
                            int var280 = field324.method2399();
                            class174 var281 = class174.method2906(var280);
                            if (!var279.equals(var281.field2854)) {
                                var281.field2854 = var279;
                                method130(var281);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 148) {
                            int var282 = field324.method2360();
                            class174 var283 = class174.method2906(var282);
                            var283.field2799 = 3;
                            var283.field2877 = Statics.field573.field36.method3230();
                            method130(var283);
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 135) {
                            int var284 = field324.method2419();
                            int var285 = field324.method2495();
                            class174 var286 = class174.method2906(var285);
                            if (var286.field2799 != 2 || var286.field2877 != var284) {
                                var286.field2799 = 2;
                                var286.field2877 = var284;
                                method130(var286);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 4) {
                            String var287 = field324.method2363();
                            Statics.field9 = var287;
                            try {
                                String var288 = Statics.field375.getParameter(class191.field3065.field3064);
                                String var289 = Statics.field375.getParameter(class191.field3062.field3064);
                                String var290 = var288 + "settings=" + var287 + "; version=1; path=/; domain=" + var289;
                                String var291;
                                if (var287.length() == 0) {
                                    var291 = var290 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                } else {
                                    String var292 = var290 + "; Expires=";
                                    long var293 = class116.method2794() + 94608000000L;
                                    class112.field1944.setTime(new Date(var293));
                                    int var295 = class112.field1944.get(7);
                                    int var296 = class112.field1944.get(5);
                                    int var297 = class112.field1944.get(2);
                                    int var298 = class112.field1944.get(1);
                                    int var299 = class112.field1944.get(11);
                                    int var300 = class112.field1944.get(12);
                                    int var301 = class112.field1944.get(13);
                                    String var302 = class112.field1938[var295 - 1] + ", " + var296 / 10 + var296 % 10 + "-" + class112.field1937[0][var297] + "-" + var298 + " " + var299 / 10 + var299 % 10 + ":" + var300 / 10 + var300 % 10 + ":" + var301 / 10 + var301 % 10 + " GMT";
                                    var291 = var292 + var302 + "; Max-Age=" + 94608000L;
                                }
                                client var303 = Statics.field375;
                                String var304 = "document.cookie=\"" + var291 + "\"";
                                JSObject.getWindow(var303).eval(var304);
                            } catch (Throwable var498) {
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 210) {
                            int var306 = field324.method2360();
                            class4 var307 = (class4) field440.method3507((long) var306);
                            if (var307 != null) {
                                method2281(var307, true);
                            }
                            if (field443 != null) {
                                method130(field443);
                                field443 = null;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 201) {
                            method158();
                            int var308 = field324.method2399();
                            int var309 = field324.method2383();
                            int var310 = field324.method2382();
                            field553[var309] = var308;
                            field493[var309] = var310;
                            field416[var309] = 1;
                            for (int var311 = 0; var311 < 98; var311++) {
                                if (var308 >= class156.field2285[var311]) {
                                    field416[var309] = var311 + 2;
                                }
                            }
                            field469[++field470 - 1 & 0x1F] = var309;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 140) {
                            field383 = 1;
                            field472 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 103) {
                            field314 = true;
                            Statics.field1735 = field324.method2355();
                            Statics.field2239 = field324.method2355();
                            Statics.field1960 = field324.method2532();
                            Statics.field1602 = field324.method2355();
                            Statics.field205 = field324.method2355();
                            if (Statics.field205 >= 100) {
                                Statics.field274 = Statics.field1735 * 128 + 64;
                                Statics.field96 = Statics.field2239 * 128 + 64;
                                Statics.field13 = method1216(Statics.field274, Statics.field96, Statics.field1064) - Statics.field1960;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 233) {
                            field433 = field324.method2355();
                            if (field433 == 255) {
                                field433 = 0;
                            }
                            field514 = field324.method2355();
                            if (field514 == 255) {
                                field514 = 0;
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 172) {
                            int var312 = field324.method2495();
                            int var313 = field324.method2419();
                            if (var313 == 65535) {
                                var313 = -1;
                            }
                            int var314 = field324.method2419();
                            if (var314 == 65535) {
                                var314 = -1;
                            }
                            int var315 = field324.method2360();
                            for (int var316 = var314; var316 <= var313; var316++) {
                                long var317 = ((long) var312 << 32) + (long) var316;
                                class209 var319 = field481.method3507(var317);
                                if (var319 != null) {
                                    var319.method3632();
                                }
                                field481.method3508(new class202(var315), var317);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 100) {
                            field324.field1977 += 28;
                            if (field324.method2377()) {
                                class150.method1206(field324, field324.field1977 - 28);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 145) {
                            field298 = field324.method2355();
                            if (field298 == 1) {
                                field299 = field324.method2532();
                            }
                            if (field298 >= 2 && field298 <= 6) {
                                if (field298 == 2) {
                                    field304 = 64;
                                    field305 = 64;
                                }
                                if (field298 == 3) {
                                    field304 = 0;
                                    field305 = 64;
                                }
                                if (field298 == 4) {
                                    field304 = 128;
                                    field305 = 64;
                                }
                                if (field298 == 5) {
                                    field304 = 64;
                                    field305 = 0;
                                }
                                if (field298 == 6) {
                                    field304 = 64;
                                    field305 = 128;
                                }
                                field298 = 2;
                                field537 = field324.method2532();
                                field347 = field324.method2532();
                                field293 = field324.method2355();
                            }
                            if (field298 == 10) {
                                field300 = field324.method2532();
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 186) {
                            method575(false);
                            field324.method2598();
                            int var320 = field324.method2532();
                            class123 var321 = field324;
                            int var322 = var321.field1977;
                            class33.field742 = 0;
                            int var323 = 0;
                            var321.method2587();
                            for (int var324 = 0; var324 < class33.field732; var324++) {
                                int var325 = class33.field733[var324];
                                if ((class33.field741[var325] & 0x1) == 0) {
                                    if (var323 > 0) {
                                        var323--;
                                        class33.field741[var325] = (byte) (class33.field741[var325] | 0x2);
                                    } else {
                                        int var326 = var321.method2588(1);
                                        if (var326 == 0) {
                                            var323 = class33.method653(var321);
                                            class33.field741[var325] = (byte) (class33.field741[var325] | 0x2);
                                        } else {
                                            class33.method41(var321, var325);
                                        }
                                    }
                                }
                            }
                            var321.method2586();
                            if (var323 != 0) {
                                throw new RuntimeException();
                            }
                            var321.method2587();
                            for (int var327 = 0; var327 < class33.field732; var327++) {
                                int var328 = class33.field733[var327];
                                if ((class33.field741[var328] & 0x1) != 0) {
                                    if (var323 > 0) {
                                        var323--;
                                        class33.field741[var328] = (byte) (class33.field741[var328] | 0x2);
                                    } else {
                                        int var329 = var321.method2588(1);
                                        if (var329 == 0) {
                                            var323 = class33.method653(var321);
                                            class33.field741[var328] = (byte) (class33.field741[var328] | 0x2);
                                        } else {
                                            class33.method41(var321, var328);
                                        }
                                    }
                                }
                            }
                            var321.method2586();
                            if (var323 != 0) {
                                throw new RuntimeException();
                            }
                            var321.method2587();
                            for (int var330 = 0; var330 < class33.field734; var330++) {
                                int var331 = class33.field735[var330];
                                if ((class33.field741[var331] & 0x1) != 0) {
                                    if (var323 > 0) {
                                        var323--;
                                        class33.field741[var331] = (byte) (class33.field741[var331] | 0x2);
                                    } else {
                                        int var332 = var321.method2588(1);
                                        if (var332 == 0) {
                                            var323 = class33.method653(var321);
                                            class33.field741[var331] = (byte) (class33.field741[var331] | 0x2);
                                        } else if (class33.method646(var321, var331)) {
                                            class33.field741[var331] = (byte) (class33.field741[var331] | 0x2);
                                        }
                                    }
                                }
                            }
                            var321.method2586();
                            if (var323 != 0) {
                                throw new RuntimeException();
                            }
                            var321.method2587();
                            for (int var333 = 0; var333 < class33.field734; var333++) {
                                int var334 = class33.field735[var333];
                                if ((class33.field741[var334] & 0x1) == 0) {
                                    if (var323 > 0) {
                                        var323--;
                                        class33.field741[var334] = (byte) (class33.field741[var334] | 0x2);
                                    } else {
                                        int var335 = var321.method2588(1);
                                        if (var335 == 0) {
                                            var323 = class33.method653(var321);
                                            class33.field741[var334] = (byte) (class33.field741[var334] | 0x2);
                                        } else if (class33.method646(var321, var334)) {
                                            class33.field741[var334] = (byte) (class33.field741[var334] | 0x2);
                                        }
                                    }
                                }
                            }
                            var321.method2586();
                            if (var323 != 0) {
                                throw new RuntimeException();
                            }
                            class33.field732 = 0;
                            class33.field734 = 0;
                            for (int var336 = 1; var336 < 2048; var336++) {
                                class33.field741[var336] = (byte) (class33.field741[var336] >> 1);
                                class3 var337 = field388[var336];
                                if (var337 == null) {
                                    class33.field735[++class33.field734 - 1] = var336;
                                } else {
                                    class33.field733[++class33.field732 - 1] = var336;
                                }
                            }
                            class33.method15(var321);
                            if (var321.field1977 - var322 != var320) {
                                throw new RuntimeException(var321.field1977 - var322 + " " + var320);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 30) {
                            for (int var338 = 0; var338 < class177.field2904.length; var338++) {
                                if (class177.field2906[var338] != class177.field2904[var338]) {
                                    class177.field2904[var338] = class177.field2906[var338];
                                    method987(var338);
                                    field465[++field558 - 1 & 0x1F] = var338;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 47) {
                            boolean var339 = field324.method2355() == 1;
                            if (var339) {
                                Statics.field32 = class116.method2794() - field324.method2361();
                                Statics.field169 = new class222(field324, true);
                            } else {
                                Statics.field169 = null;
                            }
                            field365 = field464;
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 142) {
                            int var340 = field324.method2368();
                            boolean var341 = field324.method2355() == 1;
                            String var342 = "";
                            boolean var343 = false;
                            if (var341) {
                                var342 = field324.method2363();
                                if (method3002(var342)) {
                                    var343 = true;
                                }
                            }
                            String var344 = field324.method2363();
                            if (!var343) {
                                class12.method1945(var340, var342, var344);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 39) {
                            int var345 = field324.method2495();
                            int var346 = field324.method2393();
                            int var347 = var346 >> 10 & 0x1F;
                            int var348 = var346 >> 5 & 0x1F;
                            int var349 = var346 & 0x1F;
                            int var350 = (var349 << 3) + (var347 << 19) + (var348 << 11);
                            class174 var351 = class174.method2906(var345);
                            if (var351.field2781 != var350) {
                                var351.field2781 = var350;
                                method130(var351);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 221) {
                            class26 var352 = new class26();
                            var352.field624 = field324.method2363();
                            var352.field621 = field324.method2532();
                            int var353 = field324.method2360();
                            var352.field622 = var353;
                            method2795(45);
                            Statics.field1041.method2801();
                            Statics.field1041 = null;
                            class32.method2647(var352);
                            field326 = -1;
                            var1 = false;
                            break label3167;
                        }
                        if (field326 == 226) {
                            if (field439 != -1) {
                                method131(field439, 0);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 250) {
                            method575(true);
                            field324.method2598();
                            int var354 = field324.method2532();
                            class123 var355 = field324;
                            int var356 = var355.field1977;
                            class33.field742 = 0;
                            int var357 = 0;
                            var355.method2587();
                            for (int var358 = 0; var358 < class33.field732; var358++) {
                                int var359 = class33.field733[var358];
                                if ((class33.field741[var359] & 0x1) == 0) {
                                    if (var357 > 0) {
                                        var357--;
                                        class33.field741[var359] = (byte) (class33.field741[var359] | 0x2);
                                    } else {
                                        int var360 = var355.method2588(1);
                                        if (var360 == 0) {
                                            var357 = class33.method653(var355);
                                            class33.field741[var359] = (byte) (class33.field741[var359] | 0x2);
                                        } else {
                                            class33.method41(var355, var359);
                                        }
                                    }
                                }
                            }
                            var355.method2586();
                            if (var357 != 0) {
                                throw new RuntimeException();
                            }
                            var355.method2587();
                            for (int var361 = 0; var361 < class33.field732; var361++) {
                                int var362 = class33.field733[var361];
                                if ((class33.field741[var362] & 0x1) != 0) {
                                    if (var357 > 0) {
                                        var357--;
                                        class33.field741[var362] = (byte) (class33.field741[var362] | 0x2);
                                    } else {
                                        int var363 = var355.method2588(1);
                                        if (var363 == 0) {
                                            var357 = class33.method653(var355);
                                            class33.field741[var362] = (byte) (class33.field741[var362] | 0x2);
                                        } else {
                                            class33.method41(var355, var362);
                                        }
                                    }
                                }
                            }
                            var355.method2586();
                            if (var357 != 0) {
                                throw new RuntimeException();
                            }
                            var355.method2587();
                            for (int var364 = 0; var364 < class33.field734; var364++) {
                                int var365 = class33.field735[var364];
                                if ((class33.field741[var365] & 0x1) != 0) {
                                    if (var357 > 0) {
                                        var357--;
                                        class33.field741[var365] = (byte) (class33.field741[var365] | 0x2);
                                    } else {
                                        int var366 = var355.method2588(1);
                                        if (var366 == 0) {
                                            var357 = class33.method653(var355);
                                            class33.field741[var365] = (byte) (class33.field741[var365] | 0x2);
                                        } else if (class33.method646(var355, var365)) {
                                            class33.field741[var365] = (byte) (class33.field741[var365] | 0x2);
                                        }
                                    }
                                }
                            }
                            var355.method2586();
                            if (var357 != 0) {
                                throw new RuntimeException();
                            }
                            var355.method2587();
                            for (int var367 = 0; var367 < class33.field734; var367++) {
                                int var368 = class33.field735[var367];
                                if ((class33.field741[var368] & 0x1) == 0) {
                                    if (var357 > 0) {
                                        var357--;
                                        class33.field741[var368] = (byte) (class33.field741[var368] | 0x2);
                                    } else {
                                        int var369 = var355.method2588(1);
                                        if (var369 == 0) {
                                            var357 = class33.method653(var355);
                                            class33.field741[var368] = (byte) (class33.field741[var368] | 0x2);
                                        } else if (class33.method646(var355, var368)) {
                                            class33.field741[var368] = (byte) (class33.field741[var368] | 0x2);
                                        }
                                    }
                                }
                            }
                            var355.method2586();
                            if (var357 != 0) {
                                throw new RuntimeException();
                            }
                            class33.field732 = 0;
                            class33.field734 = 0;
                            for (int var370 = 1; var370 < 2048; var370++) {
                                class33.field741[var370] = (byte) (class33.field741[var370] >> 1);
                                class3 var371 = field388[var370];
                                if (var371 == null) {
                                    class33.field735[++class33.field734 - 1] = var370;
                                } else {
                                    class33.field733[++class33.field732 - 1] = var370;
                                }
                            }
                            class33.method15(var355);
                            if (var355.field1977 - var356 != var354) {
                                throw new RuntimeException(var355.field1977 - var356 + " " + var354);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        if (field326 == 196) {
                            int var372 = field324.method2355();
                            int var373 = field324.method2398();
                            int var374 = field324.method2419();
                            class4 var375 = (class4) field440.method3507((long) var373);
                            if (var375 != null) {
                                method2281(var375, var375.field70 != var374);
                            }
                            class4 var376 = new class4();
                            var376.field70 = var374;
                            var376.field65 = var372;
                            field440.method3508(var376, (long) var373);
                            method617(var374);
                            class174 var377 = class174.method2906(var373);
                            method130(var377);
                            if (field443 != null) {
                                method130(field443);
                                field443 = null;
                            }
                            for (int var378 = 0; var378 < field421; var378++) {
                                if (method42(field302[var378])) {
                                    if (var378 < field421 - 1) {
                                        for (int var379 = var378; var379 < field421 - 1; var379++) {
                                            field426[var379] = field426[var379 + 1];
                                            field427[var379] = field427[var379 + 1];
                                            field302[var379] = field302[var379 + 1];
                                            field392[var379] = field392[var379 + 1];
                                            field495[var379] = field495[var379 + 1];
                                            field423[var379] = field423[var379 + 1];
                                        }
                                    }
                                    field421--;
                                }
                            }
                            method3274(Statics.field2838[var373 >> 16], var377, false);
                            class37.method3639(var374);
                            if (field439 != -1) {
                                method131(field439, 1);
                            }
                            field326 = -1;
                            var1 = true;
                            break label3167;
                        }
                        class149.method17("" + field326 + class2.field21 + field330 + class2.field21 + field420 + class2.field21 + field325, (Throwable) null);
                        method628();
                    } catch (IOException var506) {
                        method47();
                    } catch (Exception var507) {
                        String var382 = "" + field326 + class2.field21 + field330 + class2.field21 + field420 + class2.field21 + field325 + class2.field21 + (Statics.field1440 + Statics.field573.field843[0]) + class2.field21 + (Statics.field129 + Statics.field573.field844[0]) + class2.field21;
                        for (int var383 = 0; var383 < field325 && var383 < 50; var383++) {
                            var382 = var382 + field324.field1981[var383] + class2.field21;
                        }
                        class149.method17(var382, var507);
                        method628();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field288 != 30) {
            return;
        }
        while (true) {
            class211 var384 = (class211) class212.field3130.method3585();
            boolean var385;
            if (var384 == null) {
                var385 = false;
            } else {
                var385 = true;
            }
            if (!var385) {
                Object var387 = Statics.field729.field196;
                synchronized (Statics.field729.field196) {
                    if (!field303) {
                        Statics.field729.field197 = 0;
                    } else if (class141.field2147 != 0 || Statics.field729.field197 >= 40) {
                        field322.method2594(249);
                        field322.method2397(0);
                        int var388 = field322.field1977;
                        int var389 = 0;
                        for (int var390 = 0; var390 < Statics.field729.field197 && field322.field1977 - var388 < 240; var390++) {
                            var389++;
                            int var391 = Statics.field729.field203[var390];
                            if (var391 < 0) {
                                var391 = 0;
                            } else if (var391 > 502) {
                                var391 = 502;
                            }
                            int var392 = Statics.field729.field199[var390];
                            if (var392 < 0) {
                                var392 = 0;
                            } else if (var392 > 764) {
                                var392 = 764;
                            }
                            int var393 = var391 * 765 + var392;
                            if (Statics.field729.field203[var390] == -1 && Statics.field729.field199[var390] == -1) {
                                var392 = -1;
                                var391 = -1;
                                var393 = 524287;
                            }
                            if (field292 != var392 || field486 != var391) {
                                int var394 = var392 - field292;
                                field292 = var392;
                                int var395 = var391 - field486;
                                field486 = var391;
                                if (field294 < 8 && var394 >= -32 && var394 <= 31 && var395 >= -32 && var395 <= 31) {
                                    var394 += 32;
                                    var395 += 32;
                                    field322.method2545((field294 << 12) + (var394 << 6) + var395);
                                    field294 = 0;
                                } else if (field294 < 8) {
                                    field322.method2342((field294 << 19) + 8388608 + var393);
                                    field294 = 0;
                                } else {
                                    field322.method2449((field294 << 19) + -1073741824 + var393);
                                    field294 = 0;
                                }
                            } else if (field294 < 2047) {
                                field294++;
                            }
                        }
                        field322.method2356(field322.field1977 - var388);
                        if (var389 >= Statics.field729.field197) {
                            Statics.field729.field197 = 0;
                        } else {
                            Statics.field729.field197 -= var389;
                            for (int var396 = 0; var396 < Statics.field729.field197; var396++) {
                                Statics.field729.field199[var396] = Statics.field729.field199[var389 + var396];
                                Statics.field729.field203[var396] = Statics.field729.field203[var389 + var396];
                            }
                        }
                    }
                }
                if (class141.field2147 == 1 || !Statics.field67 && class141.field2147 == 4 || class141.field2147 == 2) {
                    long var398 = (class141.field2150 - field291 * -1L) / 50L;
                    if (var398 > 4095L) {
                        var398 = 4095L;
                    }
                    field291 = class141.field2150 * -1L;
                    int var400 = class141.field2149;
                    if (var400 < 0) {
                        var400 = 0;
                    } else if (var400 > Statics.field576) {
                        var400 = Statics.field576;
                    }
                    int var401 = class141.field2136;
                    if (var401 < 0) {
                        var401 = 0;
                    } else if (var401 > Statics.field763) {
                        var401 = Statics.field763;
                    }
                    int var402 = (int) var398;
                    field322.method2594(211);
                    field322.method2545((var402 << 1) + (class141.field2147 == 2 ? 1 : 0));
                    field322.method2545(var401);
                    field322.method2545(var400);
                }
                if (class138.field2120 > 0) {
                    field322.method2594(208);
                    field322.method2545(0);
                    int var403 = field322.field1977;
                    long var404 = class116.method2794();
                    for (int var406 = 0; var406 < class138.field2120; var406++) {
                        long var407 = var404 - field505;
                        if (var407 > 16777215L) {
                            var407 = 16777215L;
                        }
                        field505 = var404;
                        field322.method2540(class138.field2103[var406]);
                        field322.method2375((int) var407);
                    }
                    field322.method2351(field322.field1977 - var403);
                }
                if (field297 > 0) {
                    field297--;
                }
                if (class138.field2104[96] || class138.field2104[97] || class138.field2104[98] || class138.field2104[99]) {
                    field478 = true;
                }
                if (field478 && field297 <= 0) {
                    field297 = 20;
                    field478 = false;
                    field322.method2594(186);
                    field322.method2386(field450);
                    field322.method2380(field369);
                }
                if (Statics.field1949 && !field313) {
                    field313 = true;
                    field322.method2594(27);
                    field322.method2397(1);
                }
                if (!Statics.field1949 && field313) {
                    field313 = false;
                    field322.method2594(27);
                    field322.method2397(0);
                }
                method1058();
                if (field288 != 30) {
                    return;
                }
                for (class17 var409 = (class17) field412.method3544(); var409 != null; var409 = (class17) field412.method3546()) {
                    if (var409.field236 > 0) {
                        var409.field236--;
                    }
                    if (var409.field236 == 0) {
                        if (var409.field229 >= 0) {
                            int var410 = var409.field229;
                            int var411 = var409.field234;
                            class41 var412 = class41.method626(var410);
                            if (var411 == 11) {
                                var411 = 10;
                            }
                            if (var411 >= 5 && var411 <= 8) {
                                var411 = 4;
                            }
                            boolean var413 = var412.method766(var411);
                            if (!var413) {
                                continue;
                            }
                        }
                        method2820(var409.field240, var409.field226, var409.field227, var409.field228, var409.field229, var409.field231, var409.field234);
                        var409.method3632();
                    } else {
                        if (var409.field235 > 0) {
                            var409.field235--;
                        }
                        if (var409.field235 == 0 && var409.field227 >= 1 && var409.field228 >= 1 && var409.field227 <= 102 && var409.field228 <= 102) {
                            if (var409.field239 >= 0) {
                                int var414 = var409.field239;
                                int var415 = var409.field225;
                                class41 var416 = class41.method626(var414);
                                if (var415 == 11) {
                                    var415 = 10;
                                }
                                if (var415 >= 5 && var415 <= 8) {
                                    var415 = 4;
                                }
                                boolean var417 = var416.method766(var415);
                                if (!var417) {
                                    continue;
                                }
                            }
                            method2820(var409.field240, var409.field226, var409.field227, var409.field228, var409.field239, var409.field233, var409.field225);
                            var409.field235 = -1;
                            if (var409.field239 == var409.field229 && var409.field229 == -1) {
                                var409.method3632();
                            } else if (var409.field239 == var409.field229 && var409.field233 == var409.field231 && var409.field234 == var409.field225) {
                                var409.method3632();
                            }
                        }
                    }
                }
                int var10002;
                for (int var418 = 0; var418 < field384; var418++) {
                    var10002 = field524[var418]--;
                    if (field524[var418] >= -10) {
                        class59 var420 = field445[var418];
                        if (var420 == null) {
                            class59 var508 = (class59) null;
                            var420 = class59.method1197(Statics.field2176, field522[var418], 0);
                            if (var420 == null) {
                                continue;
                            }
                            field524[var418] += var420.method1194();
                            field445[var418] = var420;
                        }
                        if (field524[var418] < 0) {
                            int var427;
                            if (field447[var418] == 0) {
                                var427 = field397;
                            } else {
                                int var421 = (field447[var418] & 0xFF) * 128;
                                int var422 = field447[var418] >> 16 & 0xFF;
                                int var423 = var422 * 128 + 64 - Statics.field573.field805;
                                if (var423 < 0) {
                                    var423 = -var423;
                                }
                                int var424 = field447[var418] >> 8 & 0xFF;
                                int var425 = var424 * 128 + 64 - Statics.field573.field815;
                                if (var425 < 0) {
                                    var425 = -var425;
                                }
                                int var426 = var423 + var425 - 128;
                                if (var426 > var421) {
                                    field524[var418] = -100;
                                    continue;
                                }
                                if (var426 < 0) {
                                    var426 = 0;
                                }
                                var427 = field520 * (var421 - var426) / var421;
                            }
                            if (var427 > 0) {
                                class63 var428 = var420.method1199().method1232(Statics.field1067);
                                class65 var429 = class65.method1270(var428, 100, var427);
                                var429.method1374(field523[var418] - 1);
                                Statics.field2075.method1103(var429);
                            }
                            field524[var418] = -100;
                        }
                    } else {
                        field384--;
                        for (int var419 = var418; var419 < field384; var419++) {
                            field522[var419] = field522[var419 + 1];
                            field445[var419] = field445[var419 + 1];
                            field523[var419] = field523[var419 + 1];
                            field524[var419] = field524[var419 + 1];
                            field447[var419] = field447[var419 + 1];
                        }
                        var418--;
                    }
                }
                if (field428 && !class184.method2915()) {
                    if (field516 != 0 && field517 != -1) {
                        class184.method2060(Statics.field612, field517, 0, field516, false);
                    }
                    field428 = false;
                }
                field327++;
                if (field327 > 750) {
                    method47();
                    return;
                }
                method877();
                method16();
                method103();
                field356++;
                if (field391 != 0) {
                    field390 += 20;
                    if (field390 >= 400) {
                        field391 = 0;
                    }
                }
                if (Statics.field3159 != null) {
                    field437++;
                    if (field437 >= 15) {
                        method130(Statics.field3159);
                        Statics.field3159 = null;
                    }
                }
                class174 var430 = Statics.field139;
                class174 var431 = Statics.field1650;
                Statics.field139 = null;
                Statics.field1650 = null;
                field456 = null;
                field460 = false;
                field510 = false;
                field521 = 0;
                while (class138.method2622() && field521 < 128) {
                    if (field483 >= 2 && class138.field2104[82] && Statics.field2159 == 66) {
                        String var432 = "";
                        Iterator var433 = class12.field172.iterator();
                        while (var433.hasNext()) {
                            class36 var434 = (class36) var433.next();
                            var432 = var432 + var434.field762 + ':' + var434.field764 + '\n';
                        }
                        Statics.field237.setContents(new StringSelection(var432), (ClipboardOwner) null);
                    } else {
                        field504[field521] = Statics.field2159;
                        field307[field521] = Statics.field1884;
                        field521++;
                    }
                }
                if (field439 != -1) {
                    int var437 = field439;
                    int var438 = Statics.field763;
                    int var439 = Statics.field576;
                    if (class174.method2294(var437)) {
                        method781(Statics.field2838[var437], -1, 0, 0, var438, var439, 0, 0);
                    }
                }
                field464++;
                while (true) {
                    class1 var440;
                    class174 var441;
                    class174 var442;
                    do {
                        var440 = (class1) field479.method3542();
                        if (var440 == null) {
                            while (true) {
                                class1 var443;
                                class174 var444;
                                class174 var445;
                                do {
                                    var443 = (class1) field480.method3542();
                                    if (var443 == null) {
                                        while (true) {
                                            class1 var446;
                                            class174 var447;
                                            class174 var448;
                                            do {
                                                var446 = (class1) field467.method3542();
                                                if (var446 == null) {
                                                    method117();
                                                    if (field452 != null) {
                                                        method1056();
                                                    }
                                                    if (Statics.field2171 != null) {
                                                        method130(Statics.field2171);
                                                        field525++;
                                                        if (class141.field2137 == 0) {
                                                            if (!field398) {
                                                                label3348: {
                                                                    label2255: {
                                                                        if (field418 != 1) {
                                                                            int var455 = field421 - 1;
                                                                            boolean var456;
                                                                            if (var455 < 0) {
                                                                                var456 = false;
                                                                            } else {
                                                                                int var457 = field302[var455];
                                                                                if (var457 >= 2000) {
                                                                                    var457 -= 2000;
                                                                                }
                                                                                if (var457 == 1007) {
                                                                                    var456 = true;
                                                                                } else {
                                                                                    var456 = false;
                                                                                }
                                                                            }
                                                                            if (!var456) {
                                                                                break label2255;
                                                                            }
                                                                        }
                                                                        if (field421 > 2) {
                                                                            method1762(field395, field376);
                                                                            break label3348;
                                                                        }
                                                                    }
                                                                    if (field421 > 0) {
                                                                        int var458 = field395;
                                                                        int var459 = field376;
                                                                        method920(Statics.field2911, var458, var459);
                                                                        Statics.field2911 = null;
                                                                    }
                                                                }
                                                            } else if (Statics.field2183 == Statics.field2171 && field401 != field394) {
                                                                class174 var449 = Statics.field2171;
                                                                byte var450 = 0;
                                                                if (field442 == 1 && var449.field2834 == 206) {
                                                                    var450 = 1;
                                                                }
                                                                if (var449.field2760[field401] <= 0) {
                                                                    var450 = 0;
                                                                }
                                                                if (class179.method112(method1530(var449))) {
                                                                    int var451 = field394;
                                                                    int var452 = field401;
                                                                    var449.field2760[var452] = var449.field2760[var451];
                                                                    var449.field2874[var452] = var449.field2874[var451];
                                                                    var449.field2760[var451] = -1;
                                                                    var449.field2874[var451] = 0;
                                                                } else if (var450 == 1) {
                                                                    int var453 = field394;
                                                                    int var454 = field401;
                                                                    while (var453 != var454) {
                                                                        if (var453 > var454) {
                                                                            var449.method3135(var453 - 1, var453);
                                                                            var453--;
                                                                        } else if (var453 < var454) {
                                                                            var449.method3135(var453 + 1, var453);
                                                                            var453++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var449.method3135(field401, field394);
                                                                }
                                                                field322.method2594(50);
                                                                field322.method2380(field394);
                                                                field322.method2515(Statics.field2171.field2795);
                                                                field322.method2540(var450);
                                                                field322.method2386(field401);
                                                            }
                                                            field437 = 10;
                                                            class141.field2147 = 0;
                                                            Statics.field2171 = null;
                                                        } else if (field525 >= 5 && (class141.field2141 > field395 + 5 || class141.field2141 < field395 - 5 || class141.field2142 * 20354633 > field376 + 5 || class141.field2142 * 20354633 < field376 - 5)) {
                                                            field398 = true;
                                                        }
                                                    }
                                                    if (class87.field1478 != -1) {
                                                        int var460 = class87.field1478;
                                                        int var461 = class87.field1482;
                                                        field322.method2594(155);
                                                        field322.method2397(5);
                                                        field322.method2397(class138.field2104[82] ? (class138.field2104[81] ? 2 : 1) : 0);
                                                        field322.method2388(Statics.field129 + var461);
                                                        field322.method2380(Statics.field1440 + var460);
                                                        class87.field1478 = -1;
                                                        field422 = class141.field2136;
                                                        field278 = class141.field2149;
                                                        field391 = 1;
                                                        field390 = 0;
                                                        field433 = var460;
                                                        field514 = var461;
                                                    }
                                                    if (Statics.field139 != var430) {
                                                        if (var430 != null) {
                                                            method130(var430);
                                                        }
                                                        if (Statics.field139 != null) {
                                                            method130(Statics.field139);
                                                        }
                                                    }
                                                    if (Statics.field1650 != var431 && field502 == field371) {
                                                        if (var431 != null) {
                                                            method130(var431);
                                                        }
                                                        if (Statics.field1650 != null) {
                                                            method130(Statics.field1650);
                                                        }
                                                    }
                                                    if (Statics.field1650 == null) {
                                                        if (field371 > 0) {
                                                            field371--;
                                                        }
                                                    } else if (field371 < field502) {
                                                        field371++;
                                                        if (field502 == field371) {
                                                            method130(Statics.field1650);
                                                        }
                                                    }
                                                    int var462 = field344 + Statics.field573.field805;
                                                    int var463 = field346 + Statics.field573.field815;
                                                    if (Statics.field630 - var462 < -500 || Statics.field630 - var462 > 500 || Statics.field982 - var463 < -500 || Statics.field982 - var463 > 500) {
                                                        Statics.field630 = var462;
                                                        Statics.field982 = var463;
                                                    }
                                                    if (Statics.field630 != var462) {
                                                        Statics.field630 += (var462 - Statics.field630) / 16;
                                                    }
                                                    if (Statics.field982 != var463) {
                                                        Statics.field982 += (var463 - Statics.field982) / 16;
                                                    }
                                                    if (class141.field2137 == 4 && Statics.field67) {
                                                        int var464 = class141.field2142 * 20354633 - field320;
                                                        field367 = var464 * 2;
                                                        field320 = var464 == -1 || var464 == 1 ? class141.field2142 * 20354633 : (field320 + class141.field2142 * 20354633) / 2;
                                                        int var465 = field368 - class141.field2141;
                                                        field364 = var465 * 2;
                                                        field368 = var465 == -1 || var465 == 1 ? class141.field2141 : (field368 + class141.field2141) / 2;
                                                    } else {
                                                        if (class138.field2104[96]) {
                                                            field364 += (-24 - field364) / 2;
                                                        } else if (class138.field2104[97]) {
                                                            field364 += (24 - field364) / 2;
                                                        } else {
                                                            field364 /= 2;
                                                        }
                                                        if (class138.field2104[98]) {
                                                            field367 += (12 - field367) / 2;
                                                        } else if (class138.field2104[99]) {
                                                            field367 += (-12 - field367) / 2;
                                                        } else {
                                                            field367 /= 2;
                                                        }
                                                        field320 = class141.field2142 * 20354633;
                                                        field368 = class141.field2141;
                                                    }
                                                    field369 = field364 / 2 + field369 & 0x7FF;
                                                    field450 += field367 / 2;
                                                    if (field450 < 128) {
                                                        field450 = 128;
                                                    }
                                                    if (field450 > 383) {
                                                        field450 = 383;
                                                    }
                                                    int var466 = Statics.field630 >> 7;
                                                    int var467 = Statics.field982 >> 7;
                                                    int var468 = method1216(Statics.field630, Statics.field982, Statics.field1064);
                                                    int var469 = 0;
                                                    if (var466 > 3 && var467 > 3 && var466 < 100 && var467 < 100) {
                                                        for (int var470 = var466 - 4; var470 <= var466 + 4; var470++) {
                                                            for (int var471 = var467 - 4; var471 <= var467 + 4; var471++) {
                                                                int var472 = Statics.field1064;
                                                                if (var472 < 3 && (class6.field81[1][var470][var471] & 0x2) == 2) {
                                                                    var472++;
                                                                }
                                                                int var473 = var468 - class6.field91[var472][var470][var471];
                                                                if (var473 > var469) {
                                                                    var469 = var473;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var474 = var469 * 192;
                                                    if (var474 > 98048) {
                                                        var474 = 98048;
                                                    }
                                                    if (var474 < 32768) {
                                                        var474 = 32768;
                                                    }
                                                    if (var474 > field373) {
                                                        field373 += (var474 - field373) / 24;
                                                    } else if (var474 < field373) {
                                                        field373 += (var474 - field373) / 80;
                                                    }
                                                    if (field314) {
                                                        int var475 = Statics.field1735 * 128 + 64;
                                                        int var476 = Statics.field2239 * 128 + 64;
                                                        int var477 = method1216(var475, var476, Statics.field1064) - Statics.field1960;
                                                        if (Statics.field274 < var475) {
                                                            Statics.field274 += Statics.field205 * (var475 - Statics.field274) / 1000 + Statics.field1602;
                                                            if (Statics.field274 > var475) {
                                                                Statics.field274 = var475;
                                                            }
                                                        }
                                                        if (Statics.field274 > var475) {
                                                            Statics.field274 -= Statics.field205 * (Statics.field274 - var475) / 1000 + Statics.field1602;
                                                            if (Statics.field274 < var475) {
                                                                Statics.field274 = var475;
                                                            }
                                                        }
                                                        if (Statics.field13 < var477) {
                                                            Statics.field13 += Statics.field205 * (var477 - Statics.field13) / 1000 + Statics.field1602;
                                                            if (Statics.field13 > var477) {
                                                                Statics.field13 = var477;
                                                            }
                                                        }
                                                        if (Statics.field13 > var477) {
                                                            Statics.field13 -= Statics.field205 * (Statics.field13 - var477) / 1000 + Statics.field1602;
                                                            if (Statics.field13 < var477) {
                                                                Statics.field13 = var477;
                                                            }
                                                        }
                                                        if (Statics.field96 < var476) {
                                                            Statics.field96 += Statics.field205 * (var476 - Statics.field96) / 1000 + Statics.field1602;
                                                            if (Statics.field96 > var476) {
                                                                Statics.field96 = var476;
                                                            }
                                                        }
                                                        if (Statics.field96 > var476) {
                                                            Statics.field96 -= Statics.field205 * (Statics.field96 - var476) / 1000 + Statics.field1602;
                                                            if (Statics.field96 < var476) {
                                                                Statics.field96 = var476;
                                                            }
                                                        }
                                                        int var478 = Statics.field222 * 128 + 64;
                                                        int var479 = Statics.field1932 * 128 + 64;
                                                        int var480 = method1216(var478, var479, Statics.field1064) - Statics.field2019;
                                                        int var481 = var478 - Statics.field274;
                                                        int var482 = var480 - Statics.field13;
                                                        int var483 = var479 - Statics.field96;
                                                        int var484 = (int) Math.sqrt((double) (var481 * var481 + var483 * var483));
                                                        int var485 = (int) (Math.atan2((double) var482, (double) var484) * 325.949D) & 0x7FF;
                                                        int var486 = (int) (Math.atan2((double) var481, (double) var483) * -325.949D) & 0x7FF;
                                                        if (var485 < 128) {
                                                            var485 = 128;
                                                        }
                                                        if (var485 > 383) {
                                                            var485 = 383;
                                                        }
                                                        if (Statics.field3157 < var485) {
                                                            Statics.field3157 += Statics.field739 * (var485 - Statics.field3157) / 1000 + Statics.field672;
                                                            if (Statics.field3157 > var485) {
                                                                Statics.field3157 = var485;
                                                            }
                                                        }
                                                        if (Statics.field3157 > var485) {
                                                            Statics.field3157 -= Statics.field739 * (Statics.field3157 - var485) / 1000 + Statics.field672;
                                                            if (Statics.field3157 < var485) {
                                                                Statics.field3157 = var485;
                                                            }
                                                        }
                                                        int var487 = var486 - Statics.field168;
                                                        if (var487 > 1024) {
                                                            var487 -= 2048;
                                                        }
                                                        if (var487 < -1024) {
                                                            var487 += 2048;
                                                        }
                                                        if (var487 > 0) {
                                                            Statics.field168 += Statics.field739 * var487 / 1000 + Statics.field672;
                                                            Statics.field168 &= 0x7FF;
                                                        }
                                                        if (var487 < 0) {
                                                            Statics.field168 -= Statics.field739 * -var487 / 1000 + Statics.field672;
                                                            Statics.field168 &= 0x7FF;
                                                        }
                                                        int var488 = var486 - Statics.field168;
                                                        if (var488 > 1024) {
                                                            var488 -= 2048;
                                                        }
                                                        if (var488 < -1024) {
                                                            var488 += 2048;
                                                        }
                                                        if (var488 < 0 && var487 > 0 || var488 > 0 && var487 < 0) {
                                                            Statics.field168 = var486;
                                                        }
                                                    }
                                                    for (int var489 = 0; var489 < 5; var489++) {
                                                        var10002 = field532[var489]++;
                                                    }
                                                    Statics.field2028.method208();
                                                    int var490 = ++class141.field2140 - 1;
                                                    int var492 = class138.method2236();
                                                    if (var490 > 15000 && var492 > 15000) {
                                                        field473 = 250;
                                                        class141.method40(14500);
                                                        field322.method2594(214);
                                                    }
                                                    field350++;
                                                    if (field350 > 500) {
                                                        field350 = 0;
                                                        int var493 = (int) (Math.random() * 8.0D);
                                                        if ((var493 & 0x1) == 1) {
                                                            field344 += field458;
                                                        }
                                                        if ((var493 & 0x2) == 2) {
                                                            field346 += field497;
                                                        }
                                                        if ((var493 & 0x4) == 4) {
                                                            field526 += field349;
                                                        }
                                                    }
                                                    if (field344 < -50) {
                                                        field458 = 2;
                                                    }
                                                    if (field344 > 50) {
                                                        field458 = -2;
                                                    }
                                                    if (field346 < -55) {
                                                        field497 = 2;
                                                    }
                                                    if (field346 > 55) {
                                                        field497 = -2;
                                                    }
                                                    if (field526 < -40) {
                                                        field349 = 1;
                                                    }
                                                    if (field526 > 40) {
                                                        field349 = -1;
                                                    }
                                                    field435++;
                                                    if (field435 > 500) {
                                                        field435 = 0;
                                                        int var494 = (int) (Math.random() * 8.0D);
                                                        if ((var494 & 0x1) == 1) {
                                                            field351 += field352;
                                                        }
                                                        if ((var494 & 0x2) == 2) {
                                                            field353 += field400;
                                                        }
                                                    }
                                                    if (field351 < -60) {
                                                        field352 = 2;
                                                    }
                                                    if (field351 > 60) {
                                                        field352 = -2;
                                                    }
                                                    if (field353 < -20) {
                                                        field400 = 1;
                                                    }
                                                    if (field353 > 10) {
                                                        field400 = -1;
                                                    }
                                                    for (class39 var495 = (class39) field549.method3503(); var495 != null; var495 = (class39) field549.method3498()) {
                                                        if ((long) var495.field856 < class116.method2794() / 1000L - 5L) {
                                                            if (var495.field859 > 0) {
                                                                class12.method1945(5, "", var495.field850 + class158.field2336);
                                                            }
                                                            if (var495.field859 == 0) {
                                                                class12.method1945(5, "", var495.field850 + class158.field2468);
                                                            }
                                                            var495.method3630();
                                                        }
                                                    }
                                                    field348++;
                                                    if (field348 > 50) {
                                                        field322.method2594(240);
                                                    }
                                                    try {
                                                        if (Statics.field1041 != null && field322.field1977 > 0) {
                                                            Statics.field1041.method2802(field322.field1981, 0, field322.field1977);
                                                            field322.field1977 = 0;
                                                            field348 = 0;
                                                        }
                                                    } catch (IOException var497) {
                                                        method47();
                                                    }
                                                    return;
                                                }
                                                var447 = var446.field3;
                                                if (var447.field2817 < 0) {
                                                    break;
                                                }
                                                var448 = class174.method2906(var447.field2775);
                                            } while (var448 == null || var448.field2880 == null || var447.field2817 >= var448.field2880.length || var448.field2880[var447.field2817] != var447);
                                            class37.method2036(var446);
                                        }
                                    }
                                    var444 = var443.field3;
                                    if (var444.field2817 < 0) {
                                        break;
                                    }
                                    var445 = class174.method2906(var444.field2775);
                                } while (var445 == null || var445.field2880 == null || var444.field2817 >= var445.field2880.length || var445.field2880[var444.field2817] != var444);
                                class37.method2036(var443);
                            }
                        }
                        var441 = var440.field3;
                        if (var441.field2817 < 0) {
                            break;
                        }
                        var442 = class174.method2906(var441.field2775);
                    } while (var442 == null || var442.field2880 == null || var441.field2817 >= var442.field2880.length || var442.field2880[var441.field2817] != var441);
                    class37.method2036(var440);
                }
            }
            field322.method2594(6);
            field322.method2397(0);
            int var386 = field322.field1977;
            class212.method2944(field322);
            field322.method2356(field322.field1977 - var386);
        }
    }

    @ObfuscatedName("n.u(I)V")
    public static final void method152() {
        if (Statics.field95 != null) {
            Statics.field95.method1149();
        }
        if (Statics.field3180 != null) {
            Statics.field3180.method1149();
        }
    }

    @ObfuscatedName("e.t(Laa;IIII)V")
    public static void method5(class43 arg0, int arg1, int arg2, int arg3) {
        if (field384 >= 50 || field520 == 0 || arg0.field970 == null || arg1 >= arg0.field970.length) {
            return;
        }
        int var4 = arg0.field970[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field522[field384] = var5;
        field523[field384] = var6;
        field524[field384] = 0;
        field445[field384] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field447[field384] = (var8 << 16) + (var9 << 8) + var7;
        field384++;
    }

    @ObfuscatedName("x.d(IIII)V")
    public static void method184(int arg0, int arg1, int arg2) {
        if (field397 == 0 || arg1 == 0 || field384 >= 50) {
            return;
        }
        field522[field384] = arg0;
        field523[field384] = arg1;
        field524[field384] = arg2;
        field445[field384] = null;
        field447[field384] = 0;
        field384++;
    }

    @ObfuscatedName("gc.z(III)V")
    public static void method3465(int arg0, int arg1) {
        if (field516 != 0 && arg0 != -1) {
            class184.method2060(Statics.field1407, arg0, 0, field516, false);
            field428 = true;
        }
    }

    @ObfuscatedName("bj.v(B)V")
    public static final void method1058() {
        if (Statics.field1064 != field508) {
            field508 = Statics.field1064;
            method2153(Statics.field1064);
        }
    }

    @ObfuscatedName("a.aq(B)V")
    public static final void method103() {
        int[] var0 = class33.field733;
        for (int var1 = 0; var1 < class33.field732; var1++) {
            class3 var2 = field388[var0[var1]];
            if (var2 != null && var2.field838 > 0) {
                var2.field838--;
                if (var2.field838 == 0) {
                    var2.field802 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field318; var3++) {
            int var4 = field319[var3];
            class35 var5 = field317[var4];
            if (var5 != null && var5.field838 > 0) {
                var5.field838--;
                if (var5.field838 == 0) {
                    var5.field802 = null;
                }
            }
        }
    }

    @ObfuscatedName("ac.ap(I)V")
    public static final void method877() {
        int var0 = class33.field732;
        int[] var1 = class33.field733;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field388[var1[var2]];
            if (var3 != null) {
                method1213(var3, 1);
            }
        }
    }

    @ObfuscatedName("w.ai(B)V")
    public static final void method16() {
        for (int var0 = 0; var0 < field318; var0++) {
            int var1 = field319[var0];
            class35 var2 = field317[var1];
            if (var2 != null) {
                method1213(var2, var2.field756.field872);
            }
        }
    }

    @ObfuscatedName("bw.ae(Lav;II)V")
    public static final void method1213(class38 arg0, int arg1) {
        if (arg0.field834 > field290) {
            method48(arg0);
        } else if (arg0.field821 >= field290) {
            method44(arg0);
        } else {
            method216(arg0);
        }
        if (arg0.field805 < 128 || arg0.field815 < 128 || arg0.field805 >= 13184 || arg0.field815 >= 13184) {
            arg0.field820 = -1;
            arg0.field825 = -1;
            arg0.field834 = 0;
            arg0.field821 = 0;
            arg0.field805 = arg0.field843[0] * 128 + arg0.field793 * 64;
            arg0.field815 = arg0.field844[0] * 128 + arg0.field793 * 64;
            arg0.method722();
        }
        if (Statics.field573 == arg0 && (arg0.field805 < 1536 || arg0.field815 < 1536 || arg0.field805 >= 11776 || arg0.field815 >= 11776)) {
            arg0.field820 = -1;
            arg0.field825 = -1;
            arg0.field834 = 0;
            arg0.field821 = 0;
            arg0.field805 = arg0.field843[0] * 128 + arg0.field793 * 64;
            arg0.field815 = arg0.field844[0] * 128 + arg0.field793 * 64;
            arg0.method722();
        }
        method2932(arg0);
        arg0.field792 = false;
        if (arg0.field839 != -1) {
            class43 var2 = class43.method949(arg0.field839);
            if (var2 == null || var2.field976 == null) {
                arg0.field839 = -1;
            } else {
                arg0.field826++;
                if (arg0.field840 < var2.field976.length && arg0.field826 > var2.field969[arg0.field840]) {
                    arg0.field826 = 1;
                    arg0.field840++;
                    method5(var2, arg0.field840, arg0.field805, arg0.field815);
                }
                if (arg0.field840 >= var2.field976.length) {
                    arg0.field826 = 0;
                    arg0.field840 = 0;
                    method5(var2, arg0.field840, arg0.field805, arg0.field815);
                }
            }
        }
        if (arg0.field825 != -1 && field290 >= arg0.field828) {
            if (arg0.field818 < 0) {
                arg0.field818 = 0;
            }
            int var3 = class44.method1763(arg0.field825).field989;
            if (var3 == -1) {
                arg0.field825 = -1;
            } else {
                class43 var4 = class43.method949(var3);
                if (var4 == null || var4.field976 == null) {
                    arg0.field825 = -1;
                } else {
                    arg0.field827++;
                    if (arg0.field818 < var4.field976.length && arg0.field827 > var4.field969[arg0.field818]) {
                        arg0.field827 = 1;
                        arg0.field818++;
                        method5(var4, arg0.field818, arg0.field805, arg0.field815);
                    }
                    if (arg0.field818 >= var4.field976.length && (arg0.field818 < 0 || arg0.field818 >= var4.field976.length)) {
                        arg0.field825 = -1;
                    }
                }
            }
        }
        if (arg0.field820 != -1 && arg0.field823 <= 1) {
            class43 var5 = class43.method949(arg0.field820);
            if (var5.field978 == 1 && arg0.field812 > 0 && arg0.field834 <= field290 && arg0.field821 < field290) {
                arg0.field823 = 1;
                return;
            }
        }
        if (arg0.field820 != -1 && arg0.field823 == 0) {
            class43 var6 = class43.method949(arg0.field820);
            if (var6 == null || var6.field976 == null) {
                arg0.field820 = -1;
            } else {
                arg0.field822++;
                if (arg0.field790 < var6.field976.length && arg0.field822 > var6.field969[arg0.field790]) {
                    arg0.field822 = 1;
                    arg0.field790++;
                    method5(var6, arg0.field790, arg0.field805, arg0.field815);
                }
                if (arg0.field790 >= var6.field976.length) {
                    arg0.field790 -= var6.field966;
                    arg0.field824++;
                    if (arg0.field824 >= var6.field977) {
                        arg0.field820 = -1;
                    } else if (arg0.field790 >= 0 && arg0.field790 < var6.field976.length) {
                        method5(var6, arg0.field790, arg0.field805, arg0.field815);
                    } else {
                        arg0.field820 = -1;
                    }
                }
                arg0.field792 = var6.field980;
            }
        }
        if (arg0.field823 > 0) {
            arg0.field823--;
        }
    }

    @ObfuscatedName("p.az(Lav;I)V")
    public static final void method48(class38 arg0) {
        int var1 = arg0.field834 - field290;
        int var2 = arg0.field817 * 128 + arg0.field793 * 64;
        int var3 = arg0.field832 * 128 + arg0.field793 * 64;
        arg0.field805 += (var2 - arg0.field805) / var1;
        arg0.field815 += (var3 - arg0.field815) / var1;
        arg0.field833 = 0;
        arg0.field794 = arg0.field841;
    }

    @ObfuscatedName("s.ah(Lav;I)V")
    public static final void method44(class38 arg0) {
        if (field290 == arg0.field821 || arg0.field820 == -1 || arg0.field823 != 0 || arg0.field822 + 1 > class43.method949(arg0.field820).field969[arg0.field790]) {
            int var1 = arg0.field821 - arg0.field834;
            int var2 = field290 - arg0.field834;
            int var3 = arg0.field817 * 128 + arg0.field793 * 64;
            int var4 = arg0.field832 * 128 + arg0.field793 * 64;
            int var5 = arg0.field831 * 128 + arg0.field793 * 64;
            int var6 = arg0.field793 * 64 + arg0.field789 * 128;
            arg0.field805 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field815 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field833 = 0;
        arg0.field794 = arg0.field841;
        arg0.field791 = arg0.field794;
    }

    @ObfuscatedName("b.ar(Lav;I)V")
    public static final void method216(class38 arg0) {
        arg0.field839 = arg0.field848;
        if (arg0.field835 == 0) {
            arg0.field833 = 0;
            return;
        }
        if (arg0.field820 != -1 && arg0.field823 == 0) {
            class43 var1 = class43.method949(arg0.field820);
            if (arg0.field812 > 0 && var1.field978 == 0) {
                arg0.field833++;
                return;
            }
            if (arg0.field812 <= 0 && var1.field979 == 0) {
                arg0.field833++;
                return;
            }
        }
        int var2 = arg0.field805;
        int var3 = arg0.field815;
        int var4 = arg0.field843[arg0.field835 - 1] * 128 + arg0.field793 * 64;
        int var5 = arg0.field844[arg0.field835 - 1] * 128 + arg0.field793 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field794 = 1280;
            } else if (var3 > var5) {
                arg0.field794 = 1792;
            } else {
                arg0.field794 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field794 = 768;
            } else if (var3 > var5) {
                arg0.field794 = 256;
            } else {
                arg0.field794 = 512;
            }
        } else if (var3 < var5) {
            arg0.field794 = 1024;
        } else if (var3 > var5) {
            arg0.field794 = 0;
        }
        byte var6 = arg0.field845[arg0.field835 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field805 = var4;
            arg0.field815 = var5;
            arg0.field835--;
            if (arg0.field812 > 0) {
                arg0.field812--;
            }
            return;
        }
        int var7 = arg0.field794 - arg0.field791 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field830;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field797;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field800;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field799;
        }
        if (var8 == -1) {
            var8 = arg0.field797;
        }
        arg0.field839 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field756.field884;
        }
        if (var10) {
            if (arg0.field794 != arg0.field791 && arg0.field846 == -1 && arg0.field842 != 0) {
                var9 = 2;
            }
            if (arg0.field835 > 2) {
                var9 = 6;
            }
            if (arg0.field835 > 3) {
                var9 = 8;
            }
            if (arg0.field833 > 0 && arg0.field835 > 1) {
                var9 = 8;
                arg0.field833--;
            }
        } else {
            if (arg0.field835 > 1) {
                var9 = 6;
            }
            if (arg0.field835 > 2) {
                var9 = 8;
            }
            if (arg0.field833 > 0 && arg0.field835 > 1) {
                var9 = 8;
                arg0.field833--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field839 == arg0.field797 && arg0.field798 != -1) {
            arg0.field839 = arg0.field798;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field805 += var9;
                if (arg0.field805 > var4) {
                    arg0.field805 = var4;
                }
            } else if (var2 > var4) {
                arg0.field805 -= var9;
                if (arg0.field805 < var4) {
                    arg0.field805 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field815 += var9;
                if (arg0.field815 > var5) {
                    arg0.field815 = var5;
                }
            } else if (var3 > var5) {
                arg0.field815 -= var9;
                if (arg0.field815 < var5) {
                    arg0.field815 = var5;
                }
            }
        }
        if (arg0.field805 == var4 && arg0.field815 == var5) {
            arg0.field835--;
            if (arg0.field812 > 0) {
                arg0.field812--;
            }
        }
    }

    @ObfuscatedName("ee.ab(Lav;B)V")
    public static final void method2932(class38 arg0) {
        if (arg0.field842 == 0) {
            return;
        }
        if (arg0.field846 != -1) {
            class38 var1 = null;
            if (arg0.field846 < 32768) {
                var1 = field317[arg0.field846];
            } else if (arg0.field846 >= 32768) {
                var1 = field388[arg0.field846 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field805 - var1.field805;
                int var3 = arg0.field815 - var1.field815;
                if (var2 != 0 || var3 != 0) {
                    arg0.field794 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field801) {
                arg0.field846 = -1;
                arg0.field801 = false;
            }
        }
        if (arg0.field816 != -1 && (arg0.field835 == 0 || arg0.field833 > 0)) {
            arg0.field794 = arg0.field816;
            arg0.field816 = -1;
        }
        int var4 = arg0.field794 - arg0.field791 & 0x7FF;
        if (var4 == 0 && arg0.field801) {
            arg0.field846 = -1;
            arg0.field801 = false;
        }
        if (var4 == 0) {
            arg0.field836 = 0;
            return;
        }
        arg0.field836++;
        if (var4 > 1024) {
            arg0.field791 -= arg0.field842;
            boolean var5 = true;
            if (var4 < arg0.field842 || var4 > 2048 - arg0.field842) {
                arg0.field791 = arg0.field794;
                var5 = false;
            }
            if (arg0.field848 == arg0.field839 && (arg0.field836 > 25 || var5)) {
                if (arg0.field795 == -1) {
                    arg0.field839 = arg0.field797;
                } else {
                    arg0.field839 = arg0.field795;
                }
            }
        } else {
            arg0.field791 += arg0.field842;
            boolean var6 = true;
            if (var4 < arg0.field842 || var4 > 2048 - arg0.field842) {
                arg0.field791 = arg0.field794;
                var6 = false;
            }
            if (arg0.field848 == arg0.field839 && (arg0.field836 > 25 || var6)) {
                if (arg0.field796 == -1) {
                    arg0.field839 = arg0.field797;
                } else {
                    arg0.field839 = arg0.field796;
                }
            }
        }
        arg0.field791 &= 0x7FF;
    }

    @ObfuscatedName("cd.aj(Lf;III)V")
    public static void method1953(class3 arg0, int arg1, int arg2) {
        if (arg0.field820 == arg1 && arg1 != -1) {
            int var3 = class43.method949(arg1).field972;
            if (var3 == 1) {
                arg0.field790 = 0;
                arg0.field822 = 0;
                arg0.field823 = arg2;
                arg0.field824 = 0;
            }
            if (var3 == 2) {
                arg0.field824 = 0;
            }
        } else if (arg1 == -1 || arg0.field820 == -1 || class43.method949(arg1).field974 >= class43.method949(arg0.field820).field974) {
            arg0.field820 = arg1;
            arg0.field790 = 0;
            arg0.field822 = 0;
            arg0.field823 = arg2;
            arg0.field824 = 0;
            arg0.field812 = arg0.field835;
        }
    }

    @ObfuscatedName("cw.ay(I)I")
    public static int method1951() {
        return field399 ? 2 : 1;
    }

    @ObfuscatedName("r.ag(IB)V")
    public static void method116(int arg0) {
        field492 = 0L;
        if (arg0 >= 2) {
            field399 = true;
        } else {
            field399 = false;
        }
        method2938();
        if (field288 >= 25) {
            method176();
        }
        field2205 = true;
    }

    @ObfuscatedName("c.av(B)V")
    public static void method176() {
        field322.method2594(244);
        field322.method2397(method1951());
        field322.method2545(Statics.field763);
        field322.method2545(Statics.field576);
    }

    @ObfuscatedName("fx.af(I)V")
    public static void method2938() {
        client var0 = Statics.field375;
        synchronized (Statics.field375) {
            Container var1 = Statics.field375.method2840();
            if (var1 != null) {
                Statics.field855 = Math.max(var1.getSize().width, Statics.field849);
                Statics.field1133 = Math.max(var1.getSize().height, Statics.field1962);
                if (Statics.field62 == var1) {
                    Insets var2 = Statics.field62.getInsets();
                    Statics.field855 -= var2.right + var2.left;
                    Statics.field1133 -= var2.top + var2.bottom;
                }
                if (Statics.field855 <= 0) {
                    Statics.field855 = 1;
                }
                if (Statics.field1133 <= 0) {
                    Statics.field1133 = 1;
                }
                if (method1951() == 1) {
                    Statics.field763 = field494 * 765;
                    Statics.field576 = field309 * 503;
                } else {
                    Statics.field763 = Math.min(Statics.field855, 7680);
                    Statics.field576 = Math.min(Statics.field1133, 2160);
                }
                field2199 = (Statics.field855 - Statics.field763) / 2;
                field2201 = 0;
                Statics.field193.setSize(Statics.field763, Statics.field576);
                Statics.field2071 = class78.method162(Statics.field763, Statics.field576, Statics.field193);
                if (Statics.field62 == var1) {
                    Insets var3 = Statics.field62.getInsets();
                    Statics.field193.setLocation(field2199 + var3.left, field2201 + var3.top);
                } else {
                    Statics.field193.setLocation(field2199, field2201);
                }
                method976();
                if (field439 != -1) {
                    int var4 = field439;
                    int var5 = Statics.field763;
                    int var6 = Statics.field576;
                    if (class174.method2294(var4)) {
                        method1037(Statics.field2838[var4], -1, var5, var6, true);
                    }
                }
                method2937();
            }
        }
    }

    @ObfuscatedName("al.am(I)V")
    public static void method976() {
        int var0 = Statics.field763;
        int var1 = Statics.field576;
        if (Statics.field855 < var0) {
            int var2 = Statics.field855;
        }
        if (Statics.field1133 < var1) {
            int var3 = Statics.field1133;
        }
        if (Statics.field866 != null) {
            try {
                class133.method2664(Statics.field375, "resize", new Object[] { method1951() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("fx.aw(I)V")
    public static void method2937() {
        int var0 = field2199;
        int var1 = field2201;
        int var2 = Statics.field855 - Statics.field763 - var0;
        int var3 = Statics.field1133 - Statics.field576 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field375.method2840();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field62 == var4) {
                Insets var7 = Statics.field62.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1133);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field855, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field855 + var5 - var2, var6, var2, Statics.field1133);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1133 + var6 - var3, Statics.field855, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("y.ad(I)V")
    public static final void method154() {
        if (field439 != -1) {
            int var0 = field439;
            if (class174.method2294(var0)) {
                method157(Statics.field2838[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field466; var1++) {
            if (field484[var1]) {
                field485[var1] = true;
            }
            field415[var1] = field484[var1];
            field484[var1] = false;
        }
        field380 = field290;
        field512 = -1;
        field429 = -1;
        Statics.field2183 = null;
        if (field439 != -1) {
            field466 = 0;
            method175(field439, 0, 0, Statics.field763, Statics.field576, 0, 0, -1);
        }
        class80.method1676();
        if (field332) {
            int var2 = Statics.field2035;
            int var3 = Statics.field1858;
            int var4 = Statics.field2643;
            int var5 = Statics.field321;
            int var6 = 6116423;
            class80.method1683(var2, var3, var4, var5, var6);
            class80.method1683(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class80.method1675(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field2023.method3738(class158.field2530, var2 + 3, var3 + 14, var6, -1);
            int var7 = class141.field2141;
            int var8 = class141.field2142 * 20354633;
            for (int var9 = 0; var9 < field421; var9++) {
                int var10 = (field421 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field2023.method3738(method1774(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field2035;
            int var13 = Statics.field1858;
            int var14 = Statics.field2643;
            int var15 = Statics.field321;
            for (int var16 = 0; var16 < field466; var16++) {
                if (field487[var16] + field355[var16] > var12 && field487[var16] < var12 + var14 && field490[var16] + field488[var16] > var13 && field488[var16] < var13 + var15) {
                    field485[var16] = true;
                }
            }
        } else if (field512 != -1) {
            method2639(field512, field429);
        }
        if (field491 == 3) {
            for (int var17 = 0; var17 < field466; var17++) {
                if (field415[var17]) {
                    class80.method1682(field487[var17], field488[var17], field355[var17], field490[var17], 16711935, 128);
                } else if (field485[var17]) {
                    class80.method1682(field487[var17], field488[var17], field355[var17], field490[var17], 16711680, 128);
                }
            }
        }
        class24.method685(Statics.field1064, Statics.field573.field805, Statics.field573.field815, field356);
        field356 = 0;
    }

    @ObfuscatedName("dc.aa(Ljava/lang/String;ZB)V")
    public static final void method2619(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field629.method3735(arg0, 250);
        int var6 = Statics.field629.method3736(arg0, 250) * 13;
        class80.method1683(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1675(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field629.method3741(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method643(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field193.getGraphics();
                Statics.field2071.method1497(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field193.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field466; var13++) {
            if (field487[var13] + field355[var13] > var9 && field487[var13] < var9 + var11 && field490[var13] + field488[var13] > var10 && field488[var13] < var10 + var12) {
                field485[var13] = true;
            }
        }
    }

    @ObfuscatedName("ep.ac(IIIIZI)V")
    public static final void method2796(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field534 - field533) * var5 / 100 + field533;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field539) {
            short var8 = field539;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field457) {
                var6 = field457;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1676();
                    class80.method1683(arg0, arg1, var10, arg3, -16777216);
                    class80.method1683(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field527) {
            short var11 = field527;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field462) {
                var6 = field462;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1676();
                    class80.method1683(arg0, arg1, arg2, var13, -16777216);
                    class80.method1683(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field536 - field535) * var5 / 100 + field535;
        field545 = arg3 * var6 * var14 / 85504 << 1;
        if (field372 != arg2 || field544 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1569[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1815(var15, 500, 800, arg2, arg3);
        }
        field541 = arg0;
        field542 = arg1;
        field372 = arg2;
        field544 = arg3;
    }

    @ObfuscatedName("cx.an(Lab;I)V")
    public static final void method2051(class34 arg0) {
        if (Statics.field573.field805 >> 7 == field433 && Statics.field573.field815 >> 7 == field514) {
            field433 = 0;
        }
        int var1 = class33.field732;
        int[] var2 = class33.field733;
        int var3 = var1;
        if (class34.field746 == arg0 || class34.field750 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field746 == arg0) {
                var5 = Statics.field573;
                var6 = Statics.field573.field57 << 14;
            } else if (class34.field750 == arg0) {
                var5 = field388[field410];
                var6 = field410 << 14;
            } else {
                var5 = field388[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field748 == arg0 && field410 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method30() && !var5.field55) {
                var5.field53 = false;
                if ((field286 && var1 > 50 || var1 > 200) && class34.field746 != arg0 && var5.field848 == var5.field839) {
                    var5.field53 = true;
                }
                int var7 = var5.field805 >> 7;
                int var8 = var5.field815 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field48 == null || field290 < var5.field43 || field290 >= var5.field60) {
                        if ((var5.field805 & 0x7F) == 64 && (var5.field815 & 0x7F) == 64) {
                            if (field385 == field370[var7][var8]) {
                                continue;
                            }
                            field370[var7][var8] = field385;
                        }
                        var5.field42 = method1216(var5.field805, var5.field815, Statics.field1064);
                        Statics.field2251.method1790(Statics.field1064, var5.field805, var5.field815, var5.field42, 60, var5, var5.field791, var6, var5.field792);
                    } else {
                        var5.field53 = false;
                        var5.field42 = method1216(var5.field805, var5.field815, Statics.field1064);
                        Statics.field2251.method1791(Statics.field1064, var5.field805, var5.field815, var5.field42, 60, var5, var5.field791, var6, var5.field49, var5.field50, var5.field51, var5.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.ax(ZB)V")
    public static final void method2935(boolean arg0) {
        for (int var1 = 0; var1 < field318; var1++) {
            class35 var2 = field317[field319[var1]];
            int var3 = (field319[var1] << 14) + 536870912;
            if (var2 != null && var2.method30() && var2.field756.field882 == arg0 && var2.field756.method738()) {
                int var4 = var2.field805 >> 7;
                int var5 = var2.field815 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field793 == 1 && (var2.field805 & 0x7F) == 64 && (var2.field815 & 0x7F) == 64) {
                        if (field385 == field370[var4][var5]) {
                            continue;
                        }
                        field370[var4][var5] = field385;
                    }
                    if (!var2.field756.field892) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2251.method1790(Statics.field1064, var2.field805, var2.field815, method1216(var2.field805 + (var2.field793 * 64 - 64), var2.field815 + (var2.field793 * 64 - 64), Statics.field1064), var2.field793 * 64 - 64 + 60, var2, var2.field791, var3, var2.field792);
                }
            }
        }
    }

    @ObfuscatedName("dk.au(S)V")
    public static final void method2161() {
        for (class7 var0 = (class7) field413.method3544(); var0 != null; var0 = (class7) field413.method3546()) {
            if (Statics.field1064 != var0.field104 || field290 > var0.field110) {
                var0.method3632();
            } else if (field290 >= var0.field109) {
                if (var0.field126 > 0) {
                    class35 var1 = field317[var0.field126 - 1];
                    if (var1 != null && var1.field805 >= 0 && var1.field805 < 13312 && var1.field815 >= 0 && var1.field815 < 13312) {
                        var0.method95(var1.field805, var1.field815, method1216(var1.field805, var1.field815, var0.field104) - var0.field108, field290);
                    }
                }
                if (var0.field126 < 0) {
                    int var2 = -var0.field126 - 1;
                    class3 var3;
                    if (field402 == var2) {
                        var3 = Statics.field573;
                    } else {
                        var3 = field388[var2];
                    }
                    if (var3 != null && var3.field805 >= 0 && var3.field805 < 13312 && var3.field815 >= 0 && var3.field815 < 13312) {
                        var0.method95(var3.field805, var3.field815, method1216(var3.field805, var3.field815, var0.field104) - var0.field108, field290);
                    }
                }
                var0.method94(field356);
                Statics.field2251.method1790(Statics.field1064, (int) var0.field122, (int) var0.field125, (int) var0.field117, 60, var0, var0.field113, -1, false);
            }
        }
    }

    @ObfuscatedName("dr.at(I)I")
    public static final int method2627() {
        if (Statics.field866.field147) {
            return Statics.field1064;
        }
        int var0 = 3;
        if (Statics.field3157 < 310) {
            int var1 = Statics.field274 >> 7;
            int var2 = Statics.field96 >> 7;
            int var3 = Statics.field573.field805 >> 7;
            int var4 = Statics.field573.field815 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1064;
            }
            if ((class6.field81[Statics.field1064][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1064;
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
                    if ((class6.field81[Statics.field1064][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1064;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field81[Statics.field1064][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1064;
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
                    if ((class6.field81[Statics.field1064][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1064;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field81[Statics.field1064][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1064;
                        }
                    }
                }
            }
        }
        if (Statics.field573.field805 >= 0 && Statics.field573.field815 >= 0 && Statics.field573.field805 < 13312 && Statics.field573.field815 < 13312) {
            if ((class6.field81[Statics.field1064][Statics.field573.field805 >> 7][Statics.field573.field815 >> 7] & 0x4) != 0) {
                var0 = Statics.field1064;
            }
            return var0;
        } else {
            return Statics.field1064;
        }
    }

    @ObfuscatedName("cw.ao(III)V")
    public static final void method1949(int arg0, int arg1) {
        if (field298 == 2) {
            method2292((field537 - Statics.field1440 << 7) + field304, (field347 - Statics.field129 << 7) + field305, field293 * 2);
            if (field301 > -1 && field290 % 20 < 10) {
                Statics.field2015[0].method1583(field301 + arg0 - 12, field387 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("k.al(Lav;IIIIII)V")
    public static final void method122(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method30()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field756;
            if (var6.field889 != null) {
                var6 = var6.method737();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field732;
        int[] var8 = class33.field733;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field55) {
                return;
            }
            if (var10.field35 != -1 || var10.field38 != -1) {
                method115(arg0, arg0.field809 + 15);
                if (field301 > -1) {
                    if (var10.field35 != -1) {
                        Statics.field1341[var10.field35].method1583(field301 + arg2 - 12, field387 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field38 != -1) {
                        Statics.field631[var10.field38].method1583(field301 + arg2 - 12, field387 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field298 == 10 && field300 == var8[arg1]) {
                method115(arg0, arg0.field809 + 15);
                if (field301 > -1) {
                    Statics.field2015[1].method1583(field301 + arg2 - 12, field387 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field756;
            if (var11.field889 != null) {
                var11 = var11.method737();
            }
            if (var11.field887 >= 0 && var11.field887 < Statics.field631.length) {
                method115(arg0, arg0.field809 + 15);
                if (field301 > -1) {
                    Statics.field631[var11.field887].method1583(field301 + arg2 - 12, field387 + arg3 - 30);
                }
            }
            if (field298 == 1 && field299 == field319[arg1 - var7] && field290 % 20 < 10) {
                method115(arg0, arg0.field809 + 15);
                if (field301 > -1) {
                    Statics.field2015[0].method1583(field301 + arg2 - 12, field387 + arg3 - 28);
                }
            }
        }
        if (arg0.field802 != null && (arg1 >= var7 || !arg0.field804 && (field519 == 4 || !arg0.field803 && (field519 == 0 || field519 == 3 || field519 == 1 && method125(((class3) arg0).field46, false))))) {
            method115(arg0, arg0.field809);
            if (field301 > -1 && field374 < field538) {
                field379[field374] = Statics.field2023.method3793(arg0.field802) / 2;
                field406[field374] = Statics.field2023.field3189;
                field357[field374] = field301;
                field377[field374] = field387;
                field396[field374] = arg0.field806;
                field381[field374] = arg0.field807;
                field382[field374] = arg0.field838;
                field345[field374] = arg0.field802;
                field374++;
            }
        }
        if (arg0.field811 > field290) {
            method115(arg0, arg0.field809 + 15);
            if (field301 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field756;
                    var12 = var13.field893;
                }
                int var14 = arg0.field837 * var12 / arg0.field813;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field837 > 0) {
                    var14 = 1;
                }
                class80.method1683(field301 + arg2 - var12 / 2, field387 + arg3 - 3, var14, 5, 65280);
                class80.method1683(field301 + arg2 - var12 / 2 + var14, field387 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field810[var15] > field290) {
                method115(arg0, arg0.field809 / 2);
                if (field301 > -1) {
                    if (var15 == 1) {
                        field387 -= 20;
                    }
                    if (var15 == 2) {
                        field301 -= 15;
                        field387 -= 10;
                    }
                    if (var15 == 3) {
                        field301 += 15;
                        field387 -= 10;
                    }
                    Statics.field1998[arg0.field819[var15]].method1583(field301 + arg2 - 12, field387 + arg3 - 12);
                    Statics.field754.method3729(Integer.toString(arg0.field808[var15]), field301 + arg2 - 1, field387 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ct.ak(IIIII)V")
    public static final void method2151(int arg0, int arg1, int arg2, int arg3) {
        field374 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field732;
        int[] var7 = class33.field733;
        for (int var8 = 0; var8 < field318 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field388[var7[var8]];
                if (field410 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field317[field319[var8 - var6]];
            }
            method122(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method122(field388[field410], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field374; var10++) {
            int var11 = field357[var10];
            int var12 = field377[var10];
            int var13 = field379[var10];
            int var14 = field406[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field377[var16] - field406[var16] && var12 - var14 < field377[var16] + 2 && var11 - var13 < field379[var16] + field357[var16] && var11 + var13 > field357[var16] - field379[var16] && field377[var16] - field406[var16] < var12) {
                        var12 = field377[var16] - field406[var16];
                        var15 = true;
                    }
                }
            }
            field301 = field357[var10];
            field387 = field377[var10] = var12;
            String var17 = field345[var10];
            if (field441 == 0) {
                int var18 = 16776960;
                if (field396[var10] < 6) {
                    var18 = field279[field396[var10]];
                }
                if (field396[var10] == 6) {
                    var18 = field385 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field396[var10] == 7) {
                    var18 = field385 % 20 < 10 ? 255 : 65535;
                }
                if (field396[var10] == 8) {
                    var18 = field385 % 20 < 10 ? 45056 : 8454016;
                }
                if (field396[var10] == 9) {
                    int var19 = 150 - field382[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field396[var10] == 10) {
                    int var20 = 150 - field382[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field396[var10] == 11) {
                    int var21 = 150 - field382[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field381[var10] == 0) {
                    Statics.field2023.method3729(var17, field301 + arg0, field387 + arg1, var18, 0);
                }
                if (field381[var10] == 1) {
                    Statics.field2023.method3742(var17, field301 + arg0, field387 + arg1, var18, 0, field385);
                }
                if (field381[var10] == 2) {
                    Statics.field2023.method3760(var17, field301 + arg0, field387 + arg1, var18, 0, field385);
                }
                if (field381[var10] == 3) {
                    Statics.field2023.method3743(var17, field301 + arg0, field387 + arg1, var18, 0, field385, 150 - field382[var10]);
                }
                if (field381[var10] == 4) {
                    int var22 = (150 - field382[var10]) * (Statics.field2023.method3793(var17) + 100) / 150;
                    class80.method1678(field301 + arg0 - 50, arg1, field301 + arg0 + 50, arg1 + arg3);
                    Statics.field2023.method3738(var17, field301 + arg0 + 50 - var22, field387 + arg1, var18, 0);
                    class80.method1677(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field381[var10] == 5) {
                    int var23 = 150 - field382[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1678(arg0, field387 + arg1 - Statics.field2023.field3189 - 1, arg0 + arg2, field387 + arg1 + 5);
                    Statics.field2023.method3729(var17, field301 + arg0, field387 + arg1 + var24, var18, 0);
                    class80.method1677(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2023.method3729(var17, field301 + arg0, field387 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("dt.as(IIIII)V")
    public static final void method2299(int arg0, int arg1, int arg2, int arg3) {
        if (field391 == 1) {
            Statics.field1545[field390 / 100].method1583(field422 - 8, field278 - 8);
        }
        if (field391 == 2) {
            Statics.field1545[field390 / 100 + 4].method1583(field422 - 8, field278 - 8);
        }
        field308 = 0;
        int var4 = (Statics.field573.field805 >> 7) + Statics.field1440;
        int var5 = (Statics.field573.field815 >> 7) + Statics.field129;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field308 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field308 = 1;
        }
        if (field308 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field308 = 0;
        }
    }

    @ObfuscatedName("r.bj(Lav;II)V")
    public static final void method115(class38 arg0, int arg1) {
        method2292(arg0.field805, arg0.field815, arg1);
    }

    @ObfuscatedName("dg.bq(IIII)V")
    public static final void method2292(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field301 = -1;
            field387 = -1;
            return;
        }
        int var3 = method1216(arg0, arg1, Statics.field1064) - arg2;
        int var4 = arg0 - Statics.field274;
        int var5 = var3 - Statics.field13;
        int var6 = arg1 - Statics.field96;
        int var7 = class92.field1569[Statics.field3157];
        int var8 = class92.field1555[Statics.field3157];
        int var9 = class92.field1569[Statics.field168];
        int var10 = class92.field1555[Statics.field168];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field301 = field545 * var11 / var15 + field372 / 2;
            field387 = field545 * var14 / var15 + field544 / 2;
        } else {
            field301 = -1;
            field387 = -1;
        }
    }

    @ObfuscatedName("bw.bo(IIII)I")
    public static final int method1216(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field81[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field91[var5][var3][var4] + class6.field91[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field91[var5][var3][var4 + 1] + class6.field91[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("t.br(ZI)V")
    public static final void method575(boolean arg0) {
        field340 = arg0;
        if (!field340) {
            int var1 = field324.method2419();
            int var2 = field324.method2389();
            int var3 = field324.method2532();
            Statics.field214 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field214[var4][var5] = field324.method2360();
                }
            }
            Statics.field1017 = new int[var3];
            Statics.field164 = new int[var3];
            Statics.field3002 = new int[var3];
            Statics.field981 = new byte[var3][];
            Statics.field814 = new byte[var3][];
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
                        Statics.field1017[var7] = var10;
                        Statics.field164[var7] = Statics.field744.method3023("m" + var8 + "_" + var9);
                        Statics.field3002[var7] = Statics.field744.method3023("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2154(var1, var2);
            return;
        }
        int var11 = field324.method2532();
        int var12 = field324.method2393();
        int var13 = field324.method2532();
        field324.method2587();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field324.method2588(1);
                    if (var17 == 1) {
                        field499[var14][var15][var16] = field324.method2588(26);
                    } else {
                        field499[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field324.method2586();
        Statics.field214 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field214[var18][var19] = field324.method2360();
            }
        }
        Statics.field1017 = new int[var13];
        Statics.field164 = new int[var13];
        Statics.field3002 = new int[var13];
        Statics.field981 = new byte[var13][];
        Statics.field814 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field499[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1017[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1017[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field164[var20] = Statics.field744.method3023("m" + var29 + "_" + var30);
                            Statics.field3002[var20] = Statics.field744.method3023("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2154(var11, var12);
    }

    @ObfuscatedName("cy.bl(III)V")
    public static final void method2154(int arg0, int arg1) {
        if (Statics.field101 == arg0 && Statics.field2034 == arg1) {
            return;
        }
        Statics.field101 = arg0;
        Statics.field2034 = arg1;
        method2795(25);
        method2619(class158.field2327, true);
        int var2 = Statics.field1440;
        int var3 = Statics.field129;
        Statics.field1440 = (arg0 - 6) * 8;
        Statics.field129 = (arg1 - 6) * 8;
        int var4 = Statics.field1440 - var2;
        int var5 = Statics.field129 - var3;
        int var6 = Statics.field1440;
        int var7 = Statics.field129;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field317[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field843[var10] -= var4;
                    var9.field844[var10] -= var5;
                }
                var9.field805 -= var4 * 128;
                var9.field815 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field388[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field843[var13] -= var4;
                    var12.field844[var13] -= var5;
                }
                var12.field805 -= var4 * 128;
                var12.field815 -= var5 * 128;
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
                        field411[var24][var20][var21] = field411[var24][var22][var23];
                    } else {
                        field411[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field412.method3544(); var25 != null; var25 = (class17) field412.method3546()) {
            var25.field227 -= var4;
            var25.field228 -= var5;
            if (var25.field227 < 0 || var25.field228 < 0 || var25.field227 >= 104 || var25.field228 >= 104) {
                var25.method3632();
            }
        }
        if (field433 != 0) {
            field433 -= var4;
            field514 -= var5;
        }
        field384 = 0;
        field314 = false;
        field508 = -1;
        field414.method3538();
        field413.method3538();
        for (int var26 = 0; var26 < 4; var26++) {
            field339[var26].method2242();
        }
    }

    @ObfuscatedName("j.bd(ZI)V")
    public static final void method160(boolean arg0) {
        method152();
        field348++;
        if (field348 < 50 && !arg0) {
            return;
        }
        field348 = 0;
        if (field333 || Statics.field1041 == null) {
            return;
        }
        field322.method2594(240);
        try {
            Statics.field1041.method2802(field322.field1981, 0, field322.field1977);
            field322.field1977 = 0;
        } catch (IOException var2) {
            field333 = true;
        }
    }

    @ObfuscatedName("o.bh(I)V")
    public static final void method173() {
        method160(false);
        field334 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field981.length; var1++) {
            if (Statics.field164[var1] != -1 && Statics.field981[var1] == null) {
                Statics.field981[var1] = Statics.field744.method3048(Statics.field164[var1], 0);
                if (Statics.field981[var1] == null) {
                    var0 = false;
                    field334++;
                }
            }
            if (Statics.field3002[var1] != -1 && Statics.field814[var1] == null) {
                Statics.field814[var1] = Statics.field744.method3038(Statics.field3002[var1], 0, Statics.field214[var1]);
                if (Statics.field814[var1] == null) {
                    var0 = false;
                    field334++;
                }
            }
        }
        if (!var0) {
            field338 = 1;
            return;
        }
        field336 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field981.length; var3++) {
            byte[] var4 = Statics.field814[var3];
            if (var4 != null) {
                int var5 = (Statics.field1017[var3] >> 8) * 64 - Statics.field1440;
                int var6 = (Statics.field1017[var3] & 0xFF) * 64 - Statics.field129;
                if (field340) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method587(var4, var5, var6);
            }
        }
        if (!var2) {
            field338 = 2;
            return;
        }
        if (field338 != 0) {
            method2619(class158.field2327 + class2.field34 + class2.field23 + 100 + "%" + class2.field24, true);
        }
        method152();
        method91();
        method152();
        Statics.field2251.method1779();
        method152();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field339[var7].method2242();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field81[var8][var9][var10] = 0;
                }
            }
        }
        method152();
        class6.method970();
        int var11 = Statics.field981.length;
        for (class24 var12 = (class24) class24.field602.method3544(); var12 != null; var12 = (class24) class24.field602.method3546()) {
            if (var12.field592 != null) {
                Statics.field2075.method1121(var12.field592);
                var12.field592 = null;
            }
            if (var12.field597 != null) {
                Statics.field2075.method1121(var12.field597);
                var12.field597 = null;
            }
        }
        class24.field602.method3538();
        method160(true);
        if (!field340) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field1017[var13] >> 8) * 64 - Statics.field1440;
                int var15 = (Statics.field1017[var13] & 0xFF) * 64 - Statics.field129;
                byte[] var16 = Statics.field981[var13];
                if (var16 != null) {
                    method152();
                    int var17 = Statics.field101 * 8 - 48;
                    int var18 = Statics.field2034 * 8 - 48;
                    class109[] var19 = field339;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field1886[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class120 var23 = new class120(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class6.method3191(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field1017[var27] >> 8) * 64 - Statics.field1440;
                int var29 = (Statics.field1017[var27] & 0xFF) * 64 - Statics.field129;
                byte[] var30 = Statics.field981[var27];
                if (var30 == null && Statics.field2034 < 800) {
                    method152();
                    class6.method1038(var28, var29, 64, 64);
                }
            }
            method160(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field814[var31];
                if (var32 != null) {
                    int var33 = (Statics.field1017[var31] >> 8) * 64 - Statics.field1440;
                    int var34 = (Statics.field1017[var31] & 0xFF) * 64 - Statics.field129;
                    method152();
                    class6.method2301(var32, var33, var34, Statics.field2251, field339);
                }
            }
        }
        if (field340) {
            for (int var35 = 0; var35 < 4; var35++) {
                method152();
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        boolean var38 = false;
                        int var39 = field499[var35][var36][var37];
                        if (var39 != -1) {
                            int var40 = var39 >> 24 & 0x3;
                            int var41 = var39 >> 1 & 0x3;
                            int var42 = var39 >> 14 & 0x3FF;
                            int var43 = var39 >> 3 & 0x7FF;
                            int var44 = (var42 / 8 << 8) + var43 / 8;
                            for (int var45 = 0; var45 < Statics.field1017.length; var45++) {
                                if (Statics.field1017[var45] == var44 && Statics.field981[var45] != null) {
                                    byte[] var46 = Statics.field981[var45];
                                    int var47 = var36 * 8;
                                    int var48 = var37 * 8;
                                    int var49 = (var42 & 0x7) * 8;
                                    int var50 = (var43 & 0x7) * 8;
                                    class109[] var51 = field339;
                                    for (int var52 = 0; var52 < 8; var52++) {
                                        for (int var53 = 0; var53 < 8; var53++) {
                                            if (var47 + var52 > 0 && var47 + var52 < 103 && var48 + var53 > 0 && var48 + var53 < 103) {
                                                var51[var35].field1886[var47 + var52][var48 + var53] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class120 var54 = new class120(var46);
                                    for (int var55 = 0; var55 < 4; var55++) {
                                        for (int var56 = 0; var56 < 64; var56++) {
                                            for (int var57 = 0; var57 < 64; var57++) {
                                                if (var40 == var55 && var56 >= var49 && var56 < var49 + 8 && var57 >= var50 && var57 < var50 + 8) {
                                                    int var61 = var56 & 0x7;
                                                    int var62 = var57 & 0x7;
                                                    int var64 = var41 & 0x3;
                                                    int var65;
                                                    if (var64 == 0) {
                                                        var65 = var61;
                                                    } else if (var64 == 1) {
                                                        var65 = var62;
                                                    } else if (var64 == 2) {
                                                        var65 = 7 - var61;
                                                    } else {
                                                        var65 = 7 - var62;
                                                    }
                                                    class6.method3191(var54, var35, var47 + var65, var48 + class178.method2638(var56 & 0x7, var57 & 0x7, var41), 0, 0, var41);
                                                } else {
                                                    class6.method3191(var54, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var38 = true;
                                    break;
                                }
                            }
                        }
                        if (!var38) {
                            class6.method1(var35, var36 * 8, var37 * 8);
                        }
                    }
                }
            }
            for (int var66 = 0; var66 < 13; var66++) {
                for (int var67 = 0; var67 < 13; var67++) {
                    int var68 = field499[0][var66][var67];
                    if (var68 == -1) {
                        class6.method1038(var66 * 8, var67 * 8, 8, 8);
                    }
                }
            }
            method160(true);
            for (int var69 = 0; var69 < 4; var69++) {
                method152();
                for (int var70 = 0; var70 < 13; var70++) {
                    for (int var71 = 0; var71 < 13; var71++) {
                        int var72 = field499[var69][var70][var71];
                        if (var72 != -1) {
                            int var73 = var72 >> 24 & 0x3;
                            int var74 = var72 >> 1 & 0x3;
                            int var75 = var72 >> 14 & 0x3FF;
                            int var76 = var72 >> 3 & 0x7FF;
                            int var77 = (var75 / 8 << 8) + var76 / 8;
                            for (int var78 = 0; var78 < Statics.field1017.length; var78++) {
                                if (Statics.field1017[var78] == var77 && Statics.field814[var78] != null) {
                                    class6.method695(Statics.field814[var78], var69, var70 * 8, var71 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, Statics.field2251, field339);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method160(true);
        method91();
        method152();
        class6.method11(Statics.field2251, field339);
        method160(true);
        int var79 = class6.field82;
        if (var79 > Statics.field1064) {
            var79 = Statics.field1064;
        }
        if (var79 < Statics.field1064 - 1) {
            int var80 = Statics.field1064 - 1;
        }
        if (field286) {
            Statics.field2251.method1780(class6.field82);
        } else {
            Statics.field2251.method1780(0);
        }
        for (int var81 = 0; var81 < 104; var81++) {
            for (int var82 = 0; var82 < 104; var82++) {
                Statics.method665(var81, var82);
            }
        }
        method152();
        for (class17 var83 = (class17) field412.method3544(); var83 != null; var83 = (class17) field412.method3546()) {
            if (var83.field236 == -1) {
                var83.field235 = 0;
                method1954(var83);
            } else {
                var83.method3632();
            }
        }
        class41.field903.method3479();
        if (Statics.field62 != null) {
            field322.method2594(74);
            field322.method2449(1057001181);
        }
        if (!field340) {
            int var84 = (Statics.field101 - 6) / 8;
            int var85 = (Statics.field101 + 6) / 8;
            int var86 = (Statics.field2034 - 6) / 8;
            int var87 = (Statics.field2034 + 6) / 8;
            for (int var88 = var84 - 1; var88 <= var85 + 1; var88++) {
                for (int var89 = var86 - 1; var89 <= var87 + 1; var89++) {
                    if (var88 < var84 || var88 > var85 || var89 < var86 || var89 > var87) {
                        Statics.field744.method3043("m" + var88 + "_" + var89);
                        Statics.field744.method3043("l" + var88 + "_" + var89);
                    }
                }
            }
        }
        method2795(30);
        method152();
        Statics.field1432 = (byte[][][]) null;
        Statics.field2025 = (byte[][][]) null;
        Statics.field1857 = (byte[][][]) null;
        Statics.field83 = (byte[][][]) null;
        Statics.field75 = (int[][][]) null;
        Statics.field99 = (byte[][][]) null;
        Statics.field1603 = (int[][]) null;
        Statics.field3077 = null;
        Statics.field1505 = null;
        Statics.field1530 = null;
        Statics.field724 = null;
        Statics.field85 = null;
        field322.method2594(146);
        Statics.field76.method2673();
        for (int var90 = 0; var90 < 32; var90++) {
            field2197[var90] = 0L;
        }
        for (int var91 = 0; var91 < 32; var91++) {
            field2198[var91] = 0L;
        }
        Statics.field2186 = 0;
    }

    @ObfuscatedName("cy.bw(II)V")
    public static final void method2153(int arg0) {
        int[] var1 = Statics.field2161.field1380;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field81[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2251.method1813(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2251.method1813(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2161.method1576();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field81[arg0][var10][var9] & 0x18) == 0) {
                    method2806(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2806(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field509 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2251.method1808(Statics.field1064, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method626(var14).field928;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field339[Statics.field1064].field1886;
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
                        field531[field509] = Statics.field2705[var15];
                        field500[field509] = var16;
                        field419[field509] = var17;
                        field509++;
                    }
                }
            }
        }
        Statics.field2071.method1561();
    }

    @ObfuscatedName("eg.bn(IIIIIS)V")
    public static final void method2806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2251.method1805(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2251.method1832(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2161.field1380;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method626(var12);
            if (var13.field917 == -1) {
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
                class81 var14 = Statics.field191[var13.field917];
                if (var14 != null) {
                    int var15 = (var13.field909 * 4 - var14.field1391) / 2;
                    int var16 = (var13.field916 * 4 - var14.field1392) / 2;
                    var14.method1754(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field916) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2251.method1865(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2251.method1832(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method626(var21);
            if (var22.field917 != -1) {
                class81 var23 = Statics.field191[var22.field917];
                if (var23 != null) {
                    int var24 = (var22.field909 * 4 - var23.field1391) / 2;
                    int var25 = (var22.field916 * 4 - var23.field1392) / 2;
                    var23.method1754(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field916) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2161.field1380;
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
        int var29 = Statics.field2251.method1808(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method626(var30);
        if (var31.field917 == -1) {
            return;
        }
        class81 var32 = Statics.field191[var31.field917];
        if (var32 != null) {
            int var33 = (var31.field909 * 4 - var32.field1391) / 2;
            int var34 = (var31.field916 * 4 - var32.field1392) / 2;
            var32.method1754(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field916) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dj.by(I)V")
    public static final void method2239() {
        if (field326 == 245) {
            int var0 = field324.method2355();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1078;
            int var2 = (var0 & 0x7) + Statics.field343;
            int var3 = field324.method2389();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class200 var4 = field411[Statics.field1064][var1][var2];
                if (var4 != null) {
                    for (class29 var5 = (class29) var4.method3544(); var5 != null; var5 = (class29) var4.method3546()) {
                        if ((var3 & 0x7FFF) == var5.field667) {
                            var5.method3632();
                            break;
                        }
                    }
                    if (var4.method3544() == null) {
                        field411[Statics.field1064][var1][var2] = null;
                    }
                    Statics.method665(var1, var2);
                }
            }
        } else if (field326 == 228) {
            int var6 = field324.method2382();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field342[var7];
            int var10 = field324.method2355();
            int var11 = (var10 >> 4 & 0x7) + Statics.field1078;
            int var12 = (var10 & 0x7) + Statics.field343;
            int var13 = field324.method2419();
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                method161(Statics.field1064, var11, var12, var9, var13, var7, var8, 0, -1);
            }
        } else if (field326 == 200) {
            int var14 = field324.method2419();
            int var15 = field324.method2355();
            int var16 = (var15 >> 4 & 0x7) + Statics.field1078;
            int var17 = (var15 & 0x7) + Statics.field343;
            int var18 = field324.method2389();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class29 var19 = new class29();
                var19.field667 = var18;
                var19.field665 = var14;
                if (field411[Statics.field1064][var16][var17] == null) {
                    field411[Statics.field1064][var16][var17] = new class200();
                }
                field411[Statics.field1064][var16][var17].method3553(var19);
                Statics.method665(var16, var17);
            }
        } else if (field326 == 81) {
            int var20 = field324.method2355();
            int var21 = var20 >> 2;
            int var22 = var20 & 0x3;
            int var23 = field342[var21];
            int var24 = field324.method2355();
            int var25 = (var24 >> 4 & 0x7) + Statics.field1078;
            int var26 = (var24 & 0x7) + Statics.field343;
            int var27 = field324.method2389();
            if (var25 >= 0 && var26 >= 0 && var25 < 103 && var26 < 103) {
                if (var23 == 0) {
                    class88 var28 = Statics.field2251.method1801(Statics.field1064, var25, var26);
                    if (var28 != null) {
                        int var29 = var28.field1516 >> 14 & 0x7FFF;
                        if (var21 == 2) {
                            var28.field1510 = new class13(var29, 2, var22 + 4, Statics.field1064, var25, var26, var27, false, var28.field1510);
                            var28.field1511 = new class13(var29, 2, var22 + 1 & 0x3, Statics.field1064, var25, var26, var27, false, var28.field1511);
                        } else {
                            var28.field1510 = new class13(var29, var21, var22, Statics.field1064, var25, var26, var27, false, var28.field1510);
                        }
                    }
                }
                if (var23 == 1) {
                    class95 var30 = Statics.field2251.method1802(Statics.field1064, var25, var26);
                    if (var30 != null) {
                        int var31 = var30.field1588 >> 14 & 0x7FFF;
                        if (var21 == 4 || var21 == 5) {
                            var30.field1590 = new class13(var31, 4, var22, Statics.field1064, var25, var26, var27, false, var30.field1590);
                        } else if (var21 == 6) {
                            var30.field1590 = new class13(var31, 4, var22 + 4, Statics.field1064, var25, var26, var27, false, var30.field1590);
                        } else if (var21 == 7) {
                            var30.field1590 = new class13(var31, 4, (var22 + 2 & 0x3) + 4, Statics.field1064, var25, var26, var27, false, var30.field1590);
                        } else if (var21 == 8) {
                            var30.field1590 = new class13(var31, 4, var22 + 4, Statics.field1064, var25, var26, var27, false, var30.field1590);
                            var30.field1587 = new class13(var31, 4, (var22 + 2 & 0x3) + 4, Statics.field1064, var25, var26, var27, false, var30.field1587);
                        }
                    }
                }
                if (var23 == 2) {
                    class99 var32 = Statics.field2251.method1803(Statics.field1064, var25, var26);
                    if (var21 == 11) {
                        var21 = 10;
                    }
                    if (var32 != null) {
                        var32.field1639 = new class13(var32.field1647 >> 14 & 0x7FFF, var21, var22, Statics.field1064, var25, var26, var27, false, var32.field1639);
                    }
                }
                if (var23 == 3) {
                    class94 var33 = Statics.field2251.method1899(Statics.field1064, var25, var26);
                    if (var33 != null) {
                        var33.field1574 = new class13(var33.field1573 >> 14 & 0x7FFF, 22, var22, Statics.field1064, var25, var26, var27, false, var33.field1574);
                    }
                }
            }
        } else if (field326 == 33) {
            int var34 = field324.method2355();
            int var35 = (var34 >> 4 & 0x7) + Statics.field1078;
            int var36 = (var34 & 0x7) + Statics.field343;
            int var37 = field324.method2532();
            int var38 = field324.method2355();
            int var39 = field324.method2532();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                int var40 = var35 * 128 + 64;
                int var41 = var36 * 128 + 64;
                class30 var42 = new class30(var37, Statics.field1064, var40, var41, method1216(var40, var41, Statics.field1064) - var38, var39, field290);
                field414.method3553(var42);
            }
        } else if (field326 == 203) {
            int var43 = field324.method2355();
            int var44 = var43 >> 2;
            int var45 = var43 & 0x3;
            int var46 = field342[var44];
            int var47 = field324.method2355();
            int var48 = (var47 >> 4 & 0x7) + Statics.field1078;
            int var49 = (var47 & 0x7) + Statics.field343;
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                method161(Statics.field1064, var48, var49, var46, -1, var44, var45, 0, -1);
            }
        } else {
            if (field326 == 83) {
                int var50 = field324.method2355();
                int var51 = (var50 >> 4 & 0x7) + Statics.field1078;
                int var52 = (var50 & 0x7) + Statics.field343;
                int var53 = field324.method2532();
                int var54 = field324.method2355();
                int var55 = var54 >> 4 & 0xF;
                int var56 = var54 & 0x7;
                int var57 = field324.method2355();
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    int var58 = var55 + 1;
                    if (Statics.field573.field843[0] >= var51 - var58 && Statics.field573.field843[0] <= var51 + var58 && Statics.field573.field844[0] >= var52 - var58 && Statics.field573.field844[0] <= var52 + var58 && field520 != 0 && var56 > 0 && field384 < 50) {
                        field522[field384] = var53;
                        field523[field384] = var56;
                        field524[field384] = var57;
                        field445[field384] = null;
                        field447[field384] = (var51 << 16) + (var52 << 8) + var55;
                        field384++;
                    }
                }
            }
            if (field326 == 238) {
                int var59 = field324.method2355();
                int var60 = (var59 >> 4 & 0x7) + Statics.field1078;
                int var61 = (var59 & 0x7) + Statics.field343;
                int var62 = var60 + field324.method2465();
                int var63 = var61 + field324.method2465();
                int var64 = field324.method2358();
                int var65 = field324.method2532();
                int var66 = field324.method2355() * 4;
                int var67 = field324.method2355() * 4;
                int var68 = field324.method2532();
                int var69 = field324.method2532();
                int var70 = field324.method2355();
                int var71 = field324.method2355();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var65 != 65535) {
                    int var72 = var60 * 128 + 64;
                    int var73 = var61 * 128 + 64;
                    int var74 = var62 * 128 + 64;
                    int var75 = var63 * 128 + 64;
                    class7 var76 = new class7(var65, Statics.field1064, var72, var73, method1216(var72, var73, Statics.field1064) - var66, field290 + var68, field290 + var69, var70, var71, var64, var67);
                    var76.method95(var74, var75, method1216(var74, var75, Statics.field1064) - var67, field290 + var68);
                    field413.method3553(var76);
                }
            } else {
                if (field326 == 177) {
                    int var77 = field324.method2532();
                    byte var78 = field324.method2465();
                    int var79 = field324.method2383();
                    int var80 = (var79 >> 4 & 0x7) + Statics.field1078;
                    int var81 = (var79 & 0x7) + Statics.field343;
                    int var82 = field324.method2382();
                    int var83 = var82 >> 2;
                    int var84 = var82 & 0x3;
                    int var85 = field342[var83];
                    int var86 = field324.method2393();
                    byte var87 = field324.method2420();
                    byte var88 = field324.method2420();
                    int var89 = field324.method2389();
                    int var90 = field324.method2393();
                    byte var91 = field324.method2384();
                    class3 var92;
                    if (field402 == var89) {
                        var92 = Statics.field573;
                    } else {
                        var92 = field388[var89];
                    }
                    if (var92 != null) {
                        class41 var93 = class41.method626(var77);
                        int var94;
                        int var95;
                        if (var84 == 1 || var84 == 3) {
                            var94 = var93.field916;
                            var95 = var93.field909;
                        } else {
                            var94 = var93.field909;
                            var95 = var93.field916;
                        }
                        int var96 = (var94 >> 1) + var80;
                        int var97 = (var94 + 1 >> 1) + var80;
                        int var98 = (var95 >> 1) + var81;
                        int var99 = (var95 + 1 >> 1) + var81;
                        int[][] var100 = class6.field91[Statics.field1064];
                        int var101 = var100[var96][var98] + var100[var97][var98] + var100[var96][var99] + var100[var97][var99] >> 2;
                        int var102 = (var80 << 7) + (var94 << 6);
                        int var103 = (var81 << 7) + (var95 << 6);
                        class106 var104 = var93.method774(var83, var84, var100, var102, var101, var103);
                        if (var104 != null) {
                            method161(Statics.field1064, var80, var81, var85, -1, 0, 0, var86 + 1, var90 + 1);
                            var92.field43 = field290 + var86;
                            var92.field60 = field290 + var90;
                            var92.field48 = var104;
                            var92.field39 = var80 * 128 + var94 * 64;
                            var92.field44 = var81 * 128 + var95 * 64;
                            var92.field54 = var101;
                            if (var78 > var88) {
                                byte var105 = var78;
                                var78 = var88;
                                var88 = var105;
                            }
                            if (var91 > var87) {
                                byte var106 = var91;
                                var91 = var87;
                                var87 = var106;
                            }
                            var92.field49 = var78 + var80;
                            var92.field51 = var80 + var88;
                            var92.field50 = var81 + var91;
                            var92.field52 = var81 + var87;
                        }
                    }
                }
                if (field326 == 191) {
                    int var107 = field324.method2355();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1078;
                    int var109 = (var107 & 0x7) + Statics.field343;
                    int var110 = field324.method2532();
                    int var111 = field324.method2532();
                    int var112 = field324.method2532();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class200 var113 = field411[Statics.field1064][var108][var109];
                        if (var113 != null) {
                            for (class29 var114 = (class29) var113.method3544(); var114 != null; var114 = (class29) var113.method3546()) {
                                if ((var110 & 0x7FFF) == var114.field667 && var114.field665 == var111) {
                                    var114.field665 = var112;
                                    break;
                                }
                            }
                            Statics.method665(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.bu(IIIIIIIIII)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field412.method3544(); var10 != null; var10 = (class17) field412.method3546()) {
            if (var10.field240 == arg0 && var10.field227 == arg1 && var10.field228 == arg2 && var10.field226 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field240 = arg0;
            var9.field226 = arg3;
            var9.field227 = arg1;
            var9.field228 = arg2;
            method1954(var9);
            field412.method3553(var9);
        }
        var9.field239 = arg4;
        var9.field225 = arg5;
        var9.field233 = arg6;
        var9.field235 = arg7;
        var9.field236 = arg8;
    }

    @ObfuscatedName("cd.bv(Lo;I)V")
    public static final void method1954(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field226 == 0) {
            var1 = Statics.field2251.method1805(arg0.field240, arg0.field227, arg0.field228);
        }
        if (arg0.field226 == 1) {
            var1 = Statics.field2251.method1795(arg0.field240, arg0.field227, arg0.field228);
        }
        if (arg0.field226 == 2) {
            var1 = Statics.field2251.method1865(arg0.field240, arg0.field227, arg0.field228);
        }
        if (arg0.field226 == 3) {
            var1 = Statics.field2251.method1808(arg0.field240, arg0.field227, arg0.field228);
        }
        if (var1 != 0) {
            int var5 = Statics.field2251.method1832(arg0.field240, arg0.field227, arg0.field228, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field229 = var2;
        arg0.field234 = var3;
        arg0.field231 = var4;
    }

    @ObfuscatedName("eg.bi(IIIIIIII)V")
    public static final void method2820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field286 && Statics.field1064 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2251.method1805(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2251.method1795(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2251.method1865(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2251.method1808(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2251.method1832(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2251.method1796(arg0, arg2, arg3);
                class41 var15 = class41.method626(var12);
                if (var15.field925 != 0) {
                    field339[arg0].method2248(arg2, arg3, var13, var14, var15.field918);
                }
            }
            if (arg1 == 1) {
                Statics.field2251.method1797(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2251.method1798(arg0, arg2, arg3);
                class41 var16 = class41.method626(var12);
                if (var16.field909 + arg2 > 103 || var16.field909 + arg3 > 103 || var16.field916 + arg2 > 103 || var16.field916 + arg3 > 103) {
                    return;
                }
                if (var16.field925 != 0) {
                    field339[arg0].method2249(arg2, arg3, var16.field909, var16.field916, var14, var16.field918);
                }
            }
            if (arg1 == 3) {
                Statics.field2251.method1785(arg0, arg2, arg3);
                class41 var17 = class41.method626(var12);
                if (var17.field925 == 1) {
                    field339[arg0].method2273(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field81[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method637(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2251, field339[arg0]);
    }

    @ObfuscatedName("cj.bf(ZB)V")
    public static final void method2061(boolean arg0) {
        field404 = 0;
        field503 = 0;
        field324.method2587();
        int var1 = field324.method2588(8);
        if (var1 < field318) {
            for (int var2 = var1; var2 < field318; var2++) {
                field405[++field404 - 1] = field319[var2];
            }
        }
        if (var1 > field318) {
            throw new RuntimeException("");
        }
        field318 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field319[var3];
            class35 var5 = field317[var4];
            int var6 = field324.method2588(1);
            if (var6 == 0) {
                field319[++field318 - 1] = var4;
                var5.field847 = field290;
            } else {
                int var7 = field324.method2588(2);
                if (var7 == 0) {
                    field319[++field318 - 1] = var4;
                    var5.field847 = field290;
                    field446[++field503 - 1] = var4;
                } else if (var7 == 1) {
                    field319[++field318 - 1] = var4;
                    var5.field847 = field290;
                    int var8 = field324.method2588(3);
                    var5.method699(var8, (byte) 1);
                    int var9 = field324.method2588(1);
                    if (var9 == 1) {
                        field446[++field503 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field319[++field318 - 1] = var4;
                    var5.field847 = field290;
                    int var10 = field324.method2588(3);
                    var5.method699(var10, (byte) 2);
                    int var11 = field324.method2588(3);
                    var5.method699(var11, (byte) 2);
                    int var12 = field324.method2588(1);
                    if (var12 == 1) {
                        field446[++field503 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field405[++field404 - 1] = var4;
                }
            }
        }
        while (field324.method2590(field325) >= 27) {
            int var13 = field324.method2588(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field317[var13] == null) {
                field317[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field317[var13];
            field319[++field318 - 1] = var13;
            var34.field847 = field290;
            int var35;
            if (arg0) {
                var35 = field324.method2588(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field324.method2588(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            var34.field756 = class40.method3129(field324.method2588(14));
            int var36 = field409[field324.method2588(3)];
            if (var33) {
                var34.field794 = var34.field791 = var36;
            }
            int var37 = field324.method2588(1);
            if (var37 == 1) {
                field446[++field503 - 1] = var13;
            }
            int var38;
            if (arg0) {
                var38 = field324.method2588(8);
                if (var38 > 127) {
                    var38 -= 256;
                }
            } else {
                var38 = field324.method2588(5);
                if (var38 > 15) {
                    var38 -= 32;
                }
            }
            int var39 = field324.method2588(1);
            var34.field793 = var34.field756.field872;
            var34.field842 = var34.field756.field888;
            if (var34.field842 == 0) {
                var34.field791 = 0;
            }
            var34.field797 = var34.field756.field871;
            var34.field830 = var34.field756.field898;
            var34.field799 = var34.field756.field873;
            var34.field800 = var34.field756.field863;
            var34.field848 = var34.field756.field868;
            var34.field795 = var34.field756.field869;
            var34.field796 = var34.field756.field870;
            var34.method697(Statics.field573.field843[0] + var35, Statics.field573.field844[0] + var38, var39 == 1);
        }
        field324.method2586();
        for (int var14 = 0; var14 < field503; var14++) {
            int var15 = field446[var14];
            class35 var16 = field317[var15];
            int var17 = field324.method2355();
            if ((var17 & 0x40) != 0) {
                int var18 = field324.method2532();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field324.method2355();
                if (var16.field820 == var18 && var18 != -1) {
                    int var20 = class43.method949(var18).field972;
                    if (var20 == 1) {
                        var16.field790 = 0;
                        var16.field822 = 0;
                        var16.field823 = var19;
                        var16.field824 = 0;
                    }
                    if (var20 == 2) {
                        var16.field824 = 0;
                    }
                } else if (var18 == -1 || var16.field820 == -1 || class43.method949(var18).field974 >= class43.method949(var16.field820).field974) {
                    var16.field820 = var18;
                    var16.field790 = 0;
                    var16.field822 = 0;
                    var16.field823 = var19;
                    var16.field824 = 0;
                    var16.field812 = var16.field835;
                }
            }
            if ((var17 & 0x4) != 0) {
                int var21 = field324.method2419();
                int var22 = field324.method2532();
                int var23 = var16.field805 - (var21 - Statics.field1440 - Statics.field1440) * 64;
                int var24 = var16.field815 - (var22 - Statics.field129 - Statics.field129) * 64;
                if (var23 != 0 || var24 != 0) {
                    var16.field816 = (int) (Math.atan2((double) var23, (double) var24) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x20) != 0) {
                int var25 = field324.method2383();
                int var26 = field324.method2355();
                var16.method720(var25, var26, field290);
                var16.field811 = field290 + 300;
                var16.field837 = field324.method2389();
                var16.field813 = field324.method2419();
            }
            if ((var17 & 0x80) != 0) {
                var16.field825 = field324.method2532();
                int var27 = field324.method2398();
                var16.field829 = var27 >> 16;
                var16.field828 = (var27 & 0xFFFF) + field290;
                var16.field818 = 0;
                var16.field827 = 0;
                if (var16.field828 > field290) {
                    var16.field818 = -1;
                }
                if (var16.field825 == 65535) {
                    var16.field825 = -1;
                }
            }
            if ((var17 & 0x2) != 0) {
                var16.field802 = field324.method2363();
                var16.field838 = 100;
            }
            if ((var17 & 0x10) != 0) {
                var16.field846 = field324.method2393();
                if (var16.field846 == 65535) {
                    var16.field846 = -1;
                }
            }
            if ((var17 & 0x8) != 0) {
                int var28 = field324.method2381();
                int var29 = field324.method2382();
                var16.method720(var28, var29, field290);
                var16.field811 = field290 + 300;
                var16.field837 = field324.method2393();
                var16.field813 = field324.method2419();
            }
            if ((var17 & 0x1) != 0) {
                var16.field756 = class40.method3129(field324.method2532());
                var16.field793 = var16.field756.field872;
                var16.field842 = var16.field756.field888;
                var16.field797 = var16.field756.field871;
                var16.field830 = var16.field756.field898;
                var16.field799 = var16.field756.field873;
                var16.field800 = var16.field756.field863;
                var16.field848 = var16.field756.field868;
                var16.field795 = var16.field756.field869;
                var16.field796 = var16.field756.field870;
            }
        }
        for (int var30 = 0; var30 < field404; var30++) {
            int var31 = field405[var30];
            if (field290 != field317[var31].field847) {
                field317[var31].field756 = null;
                field317[var31] = null;
            }
        }
        if (field325 != field324.field1977) {
            throw new RuntimeException(field324.field1977 + class2.field21 + field325);
        }
        for (int var32 = 0; var32 < field318; var32++) {
            if (field317[field319[var32]] == null) {
                throw new RuntimeException(var32 + class2.field21 + field318);
            }
        }
    }

    @ObfuscatedName("cn.bs(Lf;IIBI)V")
    public static final void method2039(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field843[0];
        int var5 = arg0.field844[0];
        int var6 = arg0.method23();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class107.method139(var4, var5, arg0.method23(), method708(arg1, arg2), field339[arg0.field56], true, field559, field560);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method27(field559[var8], field560[var8], arg3);
            }
        }
    }

    @ObfuscatedName("ay.bg(III)Ldv;")
    public static class108 method708(int arg0, int arg1) {
        field311.field1865 = arg0;
        field311.field1854 = arg1;
        field311.field1856 = 1;
        field311.field1863 = 1;
        return field311;
    }

    @ObfuscatedName("dp.ba(III)V")
    public static final void method2639(int arg0, int arg1) {
        if (field421 < 2 && field432 == 0 && !field434) {
            return;
        }
        String var2;
        if (field432 == 1 && field421 < 2) {
            var2 = class158.field2455 + class158.field2326 + field393 + " " + class2.field25;
        } else if (field434 && field421 < 2) {
            var2 = field378 + class158.field2326 + field438 + " " + class2.field25;
        } else {
            var2 = method1774(field421 - 1);
        }
        if (field421 > 2) {
            var2 = var2 + class2.method759(16777215) + " " + '/' + " " + (field421 - 2) + class158.field2451;
        }
        Statics.field2023.method3744(var2, arg0 + 4, arg1 + 15, 16777215, 0, field290 / 1000);
    }

    @ObfuscatedName("ap.be(IIIII)V")
    public static final void method643(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field466; var4++) {
            if (field487[var4] + field355[var4] > arg0 && field487[var4] < arg0 + arg2 && field490[var4] + field488[var4] > arg1 && field488[var4] < arg1 + arg3) {
                field484[var4] = true;
            }
        }
    }

    @ObfuscatedName("r.bc(B)V")
    public static final void method117() {
        method61();
        if (Statics.field2171 != null || field452 != null) {
            return;
        }
        int var0 = class141.field2147;
        if (field332) {
            if (var0 != 1 && (Statics.field67 || var0 != 4)) {
                int var1 = class141.field2141;
                int var2 = class141.field2142 * 20354633;
                if (var1 < Statics.field2035 - 10 || var1 > Statics.field2643 + Statics.field2035 + 10 || var2 < Statics.field1858 - 10 || var2 > Statics.field321 + Statics.field1858 + 10) {
                    field332 = false;
                    method643(Statics.field2035, Statics.field1858, Statics.field2643, Statics.field321);
                }
            }
            if (var0 == 1 || !Statics.field67 && var0 == 4) {
                int var3 = Statics.field2035;
                int var4 = Statics.field1858;
                int var5 = Statics.field2643;
                int var6 = class141.field2136;
                int var7 = class141.field2149;
                int var8 = -1;
                for (int var9 = 0; var9 < field421; var9++) {
                    int var10 = (field421 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = field495[var8];
                    int var12 = field423[var8];
                    int var13 = field302[var8];
                    int var14 = field392[var8];
                    String var15 = field426[var8];
                    String var16 = field427[var8];
                    method1153(var11, var12, var13, var14, var15, var16, class141.field2136, class141.field2149);
                }
                field332 = false;
                method643(Statics.field2035, Statics.field1858, Statics.field2643, Statics.field321);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field67 && var0 == 4) && field421 > 0) {
            int var17 = field302[field421 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                int var18 = field495[field421 - 1];
                int var19 = field423[field421 - 1];
                class174 var20 = class174.method2906(var19);
                if (class179.method3(method1530(var20)) || class179.method112(method1530(var20))) {
                    if (Statics.field2171 != null && !field398 && field418 != 1) {
                        int var21 = field421 - 1;
                        boolean var22;
                        if (var21 < 0) {
                            var22 = false;
                        } else {
                            int var23 = field302[var21];
                            if (var23 >= 2000) {
                                var23 -= 2000;
                            }
                            if (var23 == 1007) {
                                var22 = true;
                            } else {
                                var22 = false;
                            }
                        }
                        if (!var22 && field421 > 0) {
                            int var24 = field395;
                            int var25 = field376;
                            method920(Statics.field2911, var24, var25);
                            Statics.field2911 = null;
                        }
                    }
                    field398 = false;
                    field525 = 0;
                    if (Statics.field2171 != null) {
                        method130(Statics.field2171);
                    }
                    Statics.field2171 = class174.method2906(var19);
                    field394 = var18;
                    field395 = class141.field2136;
                    field376 = class141.field2149;
                    if (field421 > 0) {
                        method170(field421 - 1);
                    }
                    method130(Statics.field2171);
                    return;
                }
            }
        }
        if (var0 == 1 || !Statics.field67 && var0 == 4) {
            label227: {
                if (field418 != 1 || field421 <= 2) {
                    int var26 = field421 - 1;
                    boolean var27;
                    if (var26 < 0) {
                        var27 = false;
                    } else {
                        int var28 = field302[var26];
                        if (var28 >= 2000) {
                            var28 -= 2000;
                        }
                        if (var28 == 1007) {
                            var27 = true;
                        } else {
                            var27 = false;
                        }
                    }
                    if (!var27) {
                        break label227;
                    }
                }
                var0 = 2;
            }
        }
        if ((var0 == 1 || !Statics.field67 && var0 == 4) && field421 > 0) {
            int var29 = field421 - 1;
            if (var29 >= 0) {
                int var30 = field495[var29];
                int var31 = field423[var29];
                int var32 = field302[var29];
                int var33 = field392[var29];
                String var34 = field426[var29];
                String var35 = field427[var29];
                method1153(var30, var31, var32, var33, var34, var35, class141.field2136, class141.field2149);
            }
        }
        if (var0 == 2 && field421 > 0) {
            method1762(class141.field2136, class141.field2149);
        }
    }

    @ObfuscatedName("cq.bk(IIS)V")
    public static final void method1762(int arg0, int arg1) {
        int var2 = Statics.field2023.method3793(class158.field2530);
        for (int var3 = 0; var3 < field421; var3++) {
            int var4 = Statics.field2023.method3793(method1774(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field421 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field763) {
            var6 = Statics.field763 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field576) {
            var7 = Statics.field576 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field332 = true;
        Statics.field2035 = var6;
        Statics.field1858 = var7;
        Statics.field2643 = var2;
        Statics.field321 = field421 * 15 + 22;
    }

    @ObfuscatedName("an.bb(Laz;III)V")
    public static final void method920(class31 arg0, int arg1, int arg2) {
        method1153(arg0.field691, arg0.field683, arg0.field684, arg0.field685, arg0.field682, arg0.field682, arg1, arg2);
    }

    @ObfuscatedName("bl.bz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field322.method2594(69);
            field322.method2545(Statics.field1026);
            field322.method2449(Statics.field1186);
            field322.method2545(arg3);
            field322.method2388(arg0);
            field322.method2545(Statics.field2742);
            field322.method2395(arg1);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 4) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(228);
            field322.method2388(arg3 >> 14 & 0x7FFF);
            field322.method2545(Statics.field129 + arg1);
            field322.method2397(class138.field2104[82] ? 1 : 0);
            field322.method2388(Statics.field1440 + arg0);
        }
        if (arg2 == 38) {
            method2697();
            class174 var8 = class174.method2906(arg1);
            field432 = 1;
            Statics.field2742 = arg0;
            Statics.field1186 = arg1;
            Statics.field1026 = arg3;
            method130(var8);
            field393 = class2.method759(16748608) + class52.method696(arg3).field1092 + class2.method759(16777215);
            if (field393 == null) {
                field393 = "null";
            }
            return;
        }
        if (arg2 == 45) {
            class3 var9 = field388[arg3];
            if (var9 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(194);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2386(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var10 = field388[arg3];
            if (var10 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(77);
                field322.method2380(arg3);
                field322.method2397(class138.field2104[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class174 var11 = class174.method812(arg1, arg0);
            if (var11 != null) {
                method2697();
                method557(arg1, arg0, class179.method3122(method1530(var11)), var11.field2823);
                field432 = 0;
                field378 = method1775(var11);
                if (field378 == null) {
                    field378 = "Null";
                }
                if (var11.field2810) {
                    field438 = var11.field2829 + class2.method759(16777215);
                } else {
                    field438 = class2.method759(65280) + var11.field2804 + class2.method759(16777215);
                }
            }
            return;
        }
        if (arg2 == 12) {
            class35 var12 = field317[arg3];
            if (var12 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(68);
                field322.method2388(arg3);
                field322.method2540(class138.field2104[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class174 var13 = class174.method2906(arg1);
            boolean var14 = true;
            if (var13.field2834 > 0) {
                var14 = method3450(var13);
            }
            if (var14) {
                field322.method2594(253);
                field322.method2449(arg1);
            }
        }
        if (arg2 == 42) {
            field322.method2594(107);
            field322.method2380(arg3);
            field322.method2388(arg0);
            field322.method2515(arg1);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 36) {
            field322.method2594(9);
            field322.method2542(arg1);
            field322.method2545(arg0);
            field322.method2386(arg3);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 43) {
            field322.method2594(26);
            field322.method2545(arg0);
            field322.method2515(arg1);
            field322.method2386(arg3);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 35) {
            field322.method2594(120);
            field322.method2395(arg1);
            field322.method2386(arg0);
            field322.method2380(arg3);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 1004) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field322.method2594(254);
            field322.method2388(arg3);
        }
        if (arg2 == 3) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(255);
            field322.method2545(Statics.field129 + arg1);
            field322.method2378(class138.field2104[82] ? 1 : 0);
            field322.method2380(arg3 >> 14 & 0x7FFF);
            field322.method2386(Statics.field1440 + arg0);
        }
        if (arg2 == 2) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(132);
            field322.method2386(arg3 >> 14 & 0x7FFF);
            field322.method2545(Statics.field1440 + arg0);
            field322.method2387(class138.field2104[82] ? 1 : 0);
            field322.method2388(field417);
            field322.method2395(Statics.field860);
            field322.method2386(Statics.field129 + arg1);
        }
        if (arg2 == 18) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(118);
            field322.method2388(Statics.field1440 + arg0);
            field322.method2545(arg3);
            field322.method2380(Statics.field129 + arg1);
            field322.method2378(class138.field2104[82] ? 1 : 0);
        }
        if (arg2 == 39) {
            field322.method2594(159);
            field322.method2388(arg3);
            field322.method2380(arg0);
            field322.method2515(arg1);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 17) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(239);
            field322.method2386(arg3);
            field322.method2397(class138.field2104[82] ? 1 : 0);
            field322.method2388(field417);
            field322.method2388(Statics.field129 + arg1);
            field322.method2395(Statics.field860);
            field322.method2388(Statics.field1440 + arg0);
        }
        if (arg2 == 46) {
            class3 var15 = field388[arg3];
            if (var15 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(187);
                field322.method2388(arg3);
                field322.method2387(class138.field2104[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class35 var16 = field317[arg3];
            if (var16 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(73);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2388(arg3);
            }
        }
        if (arg2 == 9) {
            class35 var17 = field317[arg3];
            if (var17 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(94);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2388(arg3);
            }
        }
        if (arg2 == 10) {
            class35 var18 = field317[arg3];
            if (var18 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(138);
                field322.method2387(class138.field2104[82] ? 1 : 0);
                field322.method2388(arg3);
            }
        }
        if (arg2 == 1003) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            class35 var19 = field317[arg3];
            if (var19 != null) {
                class40 var20 = var19.field756;
                if (var20.field889 != null) {
                    var20 = var20.method737();
                }
                if (var20 != null) {
                    field322.method2594(55);
                    field322.method2545(var20.field883);
                }
            }
        }
        if (arg2 == 40) {
            field322.method2594(45);
            field322.method2515(arg1);
            field322.method2388(arg3);
            field322.method2386(arg0);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 5) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(131);
            field322.method2388(Statics.field1440 + arg0);
            field322.method2545(arg3 >> 14 & 0x7FFF);
            field322.method2388(Statics.field129 + arg1);
            field322.method2378(class138.field2104[82] ? 1 : 0);
        }
        if (arg2 == 16) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(29);
            field322.method2378(class138.field2104[82] ? 1 : 0);
            field322.method2386(Statics.field1440 + arg0);
            field322.method2380(Statics.field1026);
            field322.method2545(arg3);
            field322.method2395(Statics.field1186);
            field322.method2386(Statics.field129 + arg1);
            field322.method2388(Statics.field2742);
        }
        if (arg2 == 49) {
            class3 var21 = field388[arg3];
            if (var21 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(52);
                field322.method2388(arg3);
                field322.method2397(class138.field2104[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var22 = field388[arg3];
            if (var22 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(216);
                field322.method2540(class138.field2104[82] ? 1 : 0);
                field322.method2386(arg3);
            }
        }
        if (arg2 == 29) {
            field322.method2594(253);
            field322.method2449(arg1);
            class174 var23 = class174.method2906(arg1);
            if (var23.field2868 != null && var23.field2868[0][0] == 5) {
                int var24 = var23.field2868[0][1];
                if (class177.field2904[var24] != var23.field2809[0]) {
                    class177.field2904[var24] = var23.field2809[0];
                    method987(var24);
                }
            }
        }
        if (arg2 == 34) {
            field322.method2594(85);
            field322.method2386(arg0);
            field322.method2380(arg3);
            field322.method2449(arg1);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 48) {
            class3 var25 = field388[arg3];
            if (var25 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(82);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2386(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var26 = field317[arg3];
            if (var26 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(48);
                field322.method2515(Statics.field860);
                field322.method2540(class138.field2104[82] ? 1 : 0);
                field322.method2380(arg3);
                field322.method2386(field417);
            }
        }
        if (arg2 == 11) {
            class35 var27 = field317[arg3];
            if (var27 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(197);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2545(arg3);
            }
        }
        if (arg2 == 1005) {
            class174 var28 = class174.method2906(arg1);
            if (var28 == null || var28.field2874[arg0] < 100000) {
                field322.method2594(254);
                field322.method2388(arg3);
            } else {
                class12.method1945(27, "", var28.field2874[arg0] + " x " + class52.method696(arg3).field1092);
            }
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 1) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(84);
            field322.method2388(arg3 >> 14 & 0x7FFF);
            field322.method2545(Statics.field1026);
            field322.method2380(Statics.field1440 + arg0);
            field322.method2388(Statics.field2742);
            field322.method2540(class138.field2104[82] ? 1 : 0);
            field322.method2395(Statics.field1186);
            field322.method2545(Statics.field129 + arg1);
        }
        if (arg2 == 20) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(37);
            field322.method2386(Statics.field1440 + arg0);
            field322.method2386(Statics.field129 + arg1);
            field322.method2387(class138.field2104[82] ? 1 : 0);
            field322.method2386(arg3);
        }
        if (arg2 == 47) {
            class3 var29 = field388[arg3];
            if (var29 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(151);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2388(arg3);
            }
        }
        if (arg2 == 19) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(36);
            field322.method2545(Statics.field129 + arg1);
            field322.method2380(Statics.field1440 + arg0);
            field322.method2545(arg3);
            field322.method2397(class138.field2104[82] ? 1 : 0);
        }
        if (arg2 == 1002) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field322.method2594(28);
            field322.method2380(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 32) {
            field322.method2594(99);
            field322.method2515(Statics.field860);
            field322.method2380(arg0);
            field322.method2388(field417);
            field322.method2545(arg3);
            field322.method2449(arg1);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 51) {
            class3 var30 = field388[arg3];
            if (var30 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(67);
                field322.method2386(arg3);
                field322.method2540(class138.field2104[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class174 var31 = class174.method812(arg1, arg0);
            if (var31 != null) {
                field322.method2594(110);
                field322.method2380(arg0);
                field322.method2545(field417);
                field322.method2449(Statics.field860);
                field322.method2545(var31.field2823);
                field322.method2545(field436);
                field322.method2542(arg1);
            }
        }
        if (arg2 == 37) {
            field322.method2594(241);
            field322.method2388(arg0);
            field322.method2449(arg1);
            field322.method2388(arg3);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 1001) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(1);
            field322.method2380(Statics.field1440 + arg0);
            field322.method2386(Statics.field129 + arg1);
            field322.method2388(arg3 >> 14 & 0x7FFF);
            field322.method2378(class138.field2104[82] ? 1 : 0);
        }
        if (arg2 == 41) {
            field322.method2594(224);
            field322.method2395(arg1);
            field322.method2380(arg0);
            field322.method2545(arg3);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 14) {
            class3 var32 = field388[arg3];
            if (var32 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(150);
                field322.method2380(Statics.field1026);
                field322.method2388(Statics.field2742);
                field322.method2515(Statics.field1186);
                field322.method2388(arg3);
                field322.method2378(class138.field2104[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(222);
            field322.method2386(Statics.field129 + arg1);
            field322.method2545(arg3);
            field322.method2380(Statics.field1440 + arg0);
            field322.method2387(class138.field2104[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var33 = field388[arg3];
            if (var33 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(231);
                field322.method2386(field417);
                field322.method2545(arg3);
                field322.method2397(class138.field2104[82] ? 1 : 0);
                field322.method2542(Statics.field860);
            }
        }
        if (arg2 == 33) {
            field322.method2594(126);
            field322.method2380(arg0);
            field322.method2545(arg3);
            field322.method2542(arg1);
            field437 = 0;
            Statics.field3159 = class174.method2906(arg1);
            field360 = arg0;
        }
        if (arg2 == 7) {
            class35 var34 = field317[arg3];
            if (var34 != null) {
                field422 = arg6;
                field278 = arg7;
                field391 = 2;
                field390 = 0;
                field433 = arg0;
                field514 = arg1;
                field322.method2594(122);
                field322.method2380(Statics.field1026);
                field322.method2515(Statics.field1186);
                field322.method2380(arg3);
                field322.method2378(class138.field2104[82] ? 1 : 0);
                field322.method2388(Statics.field2742);
            }
        }
        if (arg2 == 30 && field443 == null) {
            method2941(arg1, arg0);
            field443 = class174.method812(arg1, arg0);
            method130(field443);
        }
        if (arg2 == 6) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(205);
            field322.method2386(arg3 >> 14 & 0x7FFF);
            field322.method2380(Statics.field1440 + arg0);
            field322.method2388(Statics.field129 + arg1);
            field322.method2387(class138.field2104[82] ? 1 : 0);
        }
        if (arg2 == 21) {
            field422 = arg6;
            field278 = arg7;
            field391 = 2;
            field390 = 0;
            field433 = arg0;
            field514 = arg1;
            field322.method2594(90);
            field322.method2380(arg3);
            field322.method2540(class138.field2104[82] ? 1 : 0);
            field322.method2380(Statics.field1440 + arg0);
            field322.method2386(Statics.field129 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var35 = class174.method812(arg1, arg0);
            if (var35 != null) {
                int var36 = var35.field2823;
                class174 var37 = class174.method812(arg1, arg0);
                if (var37 != null) {
                    if (var37.field2856 != null) {
                        class1 var38 = new class1();
                        var38.field3 = var37;
                        var38.field6 = arg3;
                        var38.field10 = arg5;
                        var38.field12 = var37.field2856;
                        class37.method2036(var38);
                    }
                    boolean var39 = true;
                    if (var37.field2834 > 0) {
                        var39 = method3450(var37);
                    }
                    if (var39 && class179.method164(method1530(var37), arg3 - 1)) {
                        if (arg3 == 1) {
                            field322.method2594(101);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 2) {
                            field322.method2594(220);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 3) {
                            field322.method2594(161);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 4) {
                            field322.method2594(218);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 5) {
                            field322.method2594(10);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 6) {
                            field322.method2594(217);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 7) {
                            field322.method2594(98);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 8) {
                            field322.method2594(130);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 9) {
                            field322.method2594(168);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                        if (arg3 == 10) {
                            field322.method2594(109);
                            field322.method2449(arg1);
                            field322.method2545(arg0);
                            field322.method2545(var36);
                        }
                    }
                }
            }
        }
        if (arg2 == 26) {
            method2240();
        }
        if (arg2 == 28) {
            field322.method2594(253);
            field322.method2449(arg1);
            class174 var40 = class174.method2906(arg1);
            if (var40.field2868 != null && var40.field2868[0][0] == 5) {
                int var41 = var40.field2868[0][1];
                class177.field2904[var41] = 1 - class177.field2904[var41];
                method987(var41);
            }
        }
        if (arg2 == 23) {
            Statics.field2251.method1816(Statics.field1064, arg0, arg1);
        }
        if (field432 != 0) {
            field432 = 0;
            method130(class174.method2906(Statics.field1186));
        }
        if (field434) {
            method2697();
        }
        if (Statics.field3159 != null && field437 == 0) {
            method130(Statics.field3159);
        }
    }

    @ObfuscatedName("gg.bp(ILjava/lang/String;I)V")
    public static void method3466(int arg0, String arg1) {
        int var2 = class33.field732;
        int[] var3 = class33.field733;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field388[var3[var5]];
            if (var6 != null && Statics.field573 != var6 && var6.field46 != null && var6.field46.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field322.method2594(216);
                    field322.method2540(0);
                    field322.method2386(var3[var5]);
                } else if (arg0 == 4) {
                    field322.method2594(151);
                    field322.method2378(0);
                    field322.method2388(var3[var5]);
                } else if (arg0 == 6) {
                    field322.method2594(52);
                    field322.method2388(var3[var5]);
                    field322.method2397(0);
                } else if (arg0 == 7) {
                    field322.method2594(77);
                    field322.method2380(var3[var5]);
                    field322.method2397(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method1945(4, "", class158.field2583 + arg1);
        }
    }

    @ObfuscatedName("q.bt(IIIIB)V")
    public static void method557(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class174.method812(arg0, arg1);
        if (var4 != null && var4.field2847 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field12 = var4.field2847;
            class37.method2036(var5);
        }
        field436 = arg3;
        field434 = true;
        Statics.field860 = arg0;
        field417 = arg1;
        Statics.field3049 = arg2;
        method130(var4);
    }

    @ObfuscatedName("et.bx(B)V")
    public static void method2697() {
        if (!field434) {
            return;
        }
        class174 var0 = class174.method812(Statics.field860, field417);
        if (var0 != null && var0.field2848 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field12 = var0.field2848;
            class37.method2036(var1);
        }
        field434 = false;
        method130(var0);
    }

    @ObfuscatedName("ff.cb(IIB)V")
    public static void method2941(int arg0, int arg1) {
        field322.method2594(198);
        field322.method2380(arg1);
        field322.method2449(arg0);
    }

    @ObfuscatedName("h.ca(B)V")
    public static final void method61() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field421 - 1; var1++) {
                if (field302[var1] < 1000 && field302[var1 + 1] > 1000) {
                    String var2 = field427[var1];
                    field427[var1] = field427[var1 + 1];
                    field427[var1 + 1] = var2;
                    String var3 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var3;
                    int var4 = field302[var1];
                    field302[var1] = field302[var1 + 1];
                    field302[var1 + 1] = var4;
                    int var5 = field495[var1];
                    field495[var1] = field495[var1 + 1];
                    field495[var1 + 1] = var5;
                    int var6 = field423[var1];
                    field423[var1] = field423[var1 + 1];
                    field423[var1 + 1] = var6;
                    int var7 = field392[var1];
                    field392[var1] = field392[var1 + 1];
                    field392[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("n.cz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method153(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field332 || field421 >= 500) {
            return;
        }
        field426[field421] = arg0;
        field427[field421] = arg1;
        field302[field421] = arg2;
        field392[field421] = arg3;
        field495[field421] = arg4;
        field423[field421] = arg5;
        field421++;
    }

    @ObfuscatedName("s.ce(IB)Z")
    public static boolean method42(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ci.cq(II)Ljava/lang/String;")
    public static String method1774(int arg0) {
        return field427[arg0].length() > 0 ? field426[arg0] + class158.field2326 + field427[arg0] : field426[arg0];
    }

    @ObfuscatedName("hq.cf(Lam;IIII)V")
    public static final void method3820(class40 arg0, int arg1, int arg2, int arg3) {
        if (field421 >= 400) {
            return;
        }
        if (arg0.field889 != null) {
            arg0 = arg0.method737();
        }
        if (arg0 == null || !arg0.field892 || arg0.field897 && field328 != arg1) {
            return;
        }
        String var4 = arg0.field864;
        if (arg0.field881 != 0) {
            var4 = var4 + method182(arg0.field881, Statics.field573.field40) + " " + class2.field23 + class158.field2461 + arg0.field881 + class2.field24;
        }
        if (field432 == 1) {
            method153(class158.field2455, field393 + " " + class2.field25 + " " + class2.method759(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field434) {
            String[] var5 = arg0.field879;
            if (field540) {
                var5 = method127(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class158.field2457)) {
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
                        method153(var5[var6], class2.method759(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class158.field2457)) {
                        short var9 = 0;
                        if (field489 != class21.field570) {
                            if (field489 == class21.field563 || field489 == class21.field565 && arg0.field881 > Statics.field573.field40) {
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
                            method153(var5[var8], class2.method759(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method153(class158.field2456, class2.method759(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field3049 & 0x2) == 2) {
            method153(field378, field438 + " " + class2.field25 + " " + class2.method759(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("z.ci(Lf;IIII)V")
    public static final void method586(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field573 == arg0 || field421 >= 400) {
            return;
        }
        String var4;
        if (arg0.field41 == 0) {
            var4 = arg0.field47[0] + arg0.field46 + arg0.field47[1] + method182(arg0.field40, Statics.field573.field40) + " " + class2.field23 + class158.field2461 + arg0.field40 + class2.field24 + arg0.field47[2];
        } else {
            var4 = arg0.field47[0] + arg0.field46 + arg0.field47[1] + " " + class2.field23 + class158.field2319 + arg0.field41 + class2.field24 + arg0.field47[2];
        }
        if (field432 == 1) {
            method153(class158.field2455, field393 + " " + class2.field25 + " " + class2.method759(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field434) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field407[var5] != null) {
                    short var6 = 0;
                    if (field407[var5].equalsIgnoreCase(class158.field2457)) {
                        if (field455 == class21.field570) {
                            continue;
                        }
                        if (field455 == class21.field563 || field455 == class21.field565 && arg0.field40 > Statics.field573.field40) {
                            var6 = 2000;
                        }
                        if (Statics.field573.field63 != 0 && arg0.field63 != 0) {
                            if (Statics.field573.field63 == arg0.field63) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field408[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field354[var5] + var6;
                    method153(field407[var5], class2.method759(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field3049 & 0x8) == 8) {
            method153(field378, field438 + " " + class2.field25 + " " + class2.method759(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field421; var9++) {
            if (field302[var9] == 23) {
                field427[var9] = class2.method759(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("x.ch(III)Ljava/lang/String;")
    public static final String method182(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method759(16711680);
        } else if (var2 < -6) {
            return class2.method759(16723968);
        } else if (var2 < -3) {
            return class2.method759(16740352);
        } else if (var2 < 0) {
            return class2.method759(16756736);
        } else if (var2 > 9) {
            return class2.method759(65280);
        } else if (var2 > 6) {
            return class2.method759(4259584);
        } else if (var2 > 3) {
            return class2.method759(8453888);
        } else if (var2 > 0) {
            return class2.method759(12648192);
        } else {
            return class2.method759(16776960);
        }
    }

    @ObfuscatedName("c.cr(IIIIIIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method2294(arg0)) {
            Statics.field202 = null;
            method2379(Statics.field2838[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field202 != null) {
                method2379(Statics.field202, -1412584499, arg1, arg2, arg3, arg4, Statics.field613, Statics.field1194, arg7);
                Statics.field202 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field484[var8] = true;
            }
        } else {
            field484[arg7] = true;
        }
    }

    @ObfuscatedName("dq.cm([Lfg;IIIIIIIIB)V")
    public static final void method2379(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1677(arg2, arg3, arg4, arg5);
        class92.method1957();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2775 == arg1 || arg1 == -1412584499 && field452 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field487[field466] = var10.field2881 + arg6;
                    field488[field466] = var10.field2770 + arg7;
                    field355[field466] = var10.field2771;
                    field490[field466] = var10.field2835;
                    var11 = ++field466 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2757 = var11;
                var10.field2862 = field290;
                if (!var10.field2810 || !method572(var10)) {
                    if (var10.field2834 > 0) {
                        int var12 = var10.field2834;
                        if (var12 == 324) {
                            if (field424 == -1) {
                                field424 = var10.field2859;
                                field554 = var10.field2792;
                            }
                            if (field552.field2922) {
                                var10.field2859 = field424;
                            } else {
                                var10.field2859 = field554;
                            }
                        } else if (var12 == 325) {
                            if (field424 == -1) {
                                field424 = var10.field2859;
                                field554 = var10.field2792;
                            }
                            if (field552.field2922) {
                                var10.field2859 = field554;
                            } else {
                                var10.field2859 = field424;
                            }
                        } else if (var12 == 327) {
                            var10.field2766 = 150;
                            var10.field2808 = (int) (Math.sin((double) field290 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2799 = 5;
                            var10.field2877 = 0;
                        } else if (var12 == 328) {
                            var10.field2766 = 150;
                            var10.field2808 = (int) (Math.sin((double) field290 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2799 = 5;
                            var10.field2877 = 1;
                        }
                    }
                    int var13 = var10.field2881 + arg6;
                    int var14 = var10.field2770 + arg7;
                    int var15 = var10.field2787;
                    if (field452 == var10) {
                        if (arg1 != -1412584499 && !var10.field2864) {
                            Statics.field202 = arg0;
                            Statics.field613 = arg6;
                            Statics.field1194 = arg7;
                            continue;
                        }
                        if (field463 && field510) {
                            int var16 = class141.field2141;
                            int var17 = class141.field2142 * 20354633;
                            int var18 = var16 - field454;
                            int var19 = var17 - field518;
                            if (var18 < field528) {
                                var18 = field528;
                            }
                            if (var10.field2771 + var18 > field528 + field453.field2771) {
                                var18 = field528 + field453.field2771 - var10.field2771;
                            }
                            if (var19 < field459) {
                                var19 = field459;
                            }
                            if (var10.field2835 + var19 > field459 + field453.field2835) {
                                var19 = field459 + field453.field2835 - var10.field2835;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2864) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2758 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2758 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2771 + var13;
                        int var27 = var10.field2835 + var14;
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
                        int var30 = var10.field2771 + var13;
                        int var31 = var10.field2835 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2810 || var20 < var22 && var21 < var23) {
                        if (var10.field2834 != 0) {
                            if (var10.field2834 == 1336) {
                                if (field296) {
                                    var14 += 15;
                                    Statics.field629.method3739("Fps:" + field2196, var10.field2771 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field286) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field286) {
                                        var34 = 16711680;
                                    }
                                    Statics.field629.method3739("Mem:" + var33 + "k", var10.field2771 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2834 == 1337) {
                                field512 = var13;
                                field429 = var14;
                                int var37 = var10.field2771;
                                int var38 = var10.field2835;
                                field385++;
                                method2051(class34.field746);
                                boolean var39 = false;
                                if (field410 >= 0) {
                                    int var40 = class33.field732;
                                    int[] var41 = class33.field733;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field410 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method2051(class34.field750);
                                }
                                method2935(true);
                                method2051(var39 ? class34.field748 : class34.field745);
                                method2935(false);
                                method2161();
                                for (class30 var43 = (class30) field414.method3544(); var43 != null; var43 = (class30) field414.method3546()) {
                                    if (Statics.field1064 != var43.field679 || var43.field673) {
                                        var43.method3632();
                                    } else if (field290 >= var43.field671) {
                                        var43.method650(field356);
                                        if (var43.field673) {
                                            var43.method3632();
                                        } else {
                                            Statics.field2251.method1790(var43.field679, var43.field681, var43.field674, var43.field675, 60, var43, 0, -1, false);
                                        }
                                    }
                                }
                                method2796(var13, var14, var37, var38, true);
                                int var44 = field541;
                                int var45 = field542;
                                int var46 = field372;
                                int var47 = field544;
                                class80.method1677(var44, var45, var44 + var46, var45 + var47);
                                class92.method1957();
                                if (!field314) {
                                    int var48 = field450;
                                    if (field373 / 256 > var48) {
                                        var48 = field373 / 256;
                                    }
                                    if (field389[4] && field530[4] + 128 > var48) {
                                        var48 = field530[4] + 128;
                                    }
                                    int var49 = field526 + field369 & 0x7FF;
                                    int var50 = Statics.field630;
                                    int var51 = method1216(Statics.field573.field805, Statics.field573.field815, Statics.field1064) - field323;
                                    int var52 = Statics.field982;
                                    int var53 = var48 * 3 + 600;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 2048 - var49 & 0x7FF;
                                    int var56 = 0;
                                    int var57 = 0;
                                    int var58 = var53;
                                    if (var54 != 0) {
                                        int var59 = class92.field1569[var54];
                                        int var60 = class92.field1555[var54];
                                        int var61 = var57 * var60 - var53 * var59 >> 16;
                                        var58 = var57 * var59 + var53 * var60 >> 16;
                                        var57 = var61;
                                    }
                                    if (var55 != 0) {
                                        int var62 = class92.field1569[var55];
                                        int var63 = class92.field1555[var55];
                                        int var64 = var56 * var63 + var58 * var62 >> 16;
                                        var58 = var58 * var63 - var56 * var62 >> 16;
                                        var56 = var64;
                                    }
                                    Statics.field274 = var50 - var56;
                                    Statics.field13 = var51 - var57;
                                    Statics.field96 = var52 - var58;
                                    Statics.field3157 = var48;
                                    Statics.field168 = var49;
                                }
                                int var65;
                                if (field314) {
                                    int var66;
                                    if (Statics.field866.field147) {
                                        var66 = Statics.field1064;
                                    } else {
                                        int var67 = method1216(Statics.field274, Statics.field96, Statics.field1064);
                                        if (var67 - Statics.field13 >= 800 || (class6.field81[Statics.field1064][Statics.field274 >> 7][Statics.field96 >> 7] & 0x4) == 0) {
                                            var66 = 3;
                                        } else {
                                            var66 = Statics.field1064;
                                        }
                                    }
                                    var65 = var66;
                                } else {
                                    var65 = method2627();
                                }
                                int var68 = Statics.field274;
                                int var69 = Statics.field13;
                                int var70 = Statics.field96;
                                int var71 = Statics.field3157;
                                int var72 = Statics.field168;
                                for (int var73 = 0; var73 < 5; var73++) {
                                    if (field389[var73]) {
                                        int var74 = (int) (Math.random() * (double) (field529[var73] * 2 + 1) - (double) field529[var73] + Math.sin((double) field277[var73] / 100.0D * (double) field532[var73]) * (double) field530[var73]);
                                        if (var73 == 0) {
                                            Statics.field274 += var74;
                                        }
                                        if (var73 == 1) {
                                            Statics.field13 += var74;
                                        }
                                        if (var73 == 2) {
                                            Statics.field96 += var74;
                                        }
                                        if (var73 == 3) {
                                            Statics.field168 = Statics.field168 + var74 & 0x7FF;
                                        }
                                        if (var73 == 4) {
                                            Statics.field3157 += var74;
                                            if (Statics.field3157 < 128) {
                                                Statics.field3157 = 128;
                                            }
                                            if (Statics.field3157 > 383) {
                                                Statics.field3157 = 383;
                                            }
                                        }
                                    }
                                }
                                int var75 = class141.field2141;
                                int var76 = class141.field2142 * 20354633;
                                if (class141.field2147 != 0) {
                                    var75 = class141.field2136;
                                    var76 = class141.field2149;
                                }
                                if (var75 >= var44 && var75 < var44 + var46 && var76 >= var45 && var76 < var45 + var47) {
                                    class106.field1831 = true;
                                    class106.field1834 = 0;
                                    class106.field1835 = var75 - var44;
                                    class106.field1833 = var76 - var45;
                                } else {
                                    class106.field1831 = false;
                                    class106.field1834 = 0;
                                }
                                method152();
                                class80.method1683(var44, var45, var46, var47, 0);
                                method152();
                                int var77 = class92.field1556;
                                class92.field1556 = field545;
                                Statics.field2251.method1817(Statics.field274, Statics.field13, Statics.field96, Statics.field3157, Statics.field168, var65);
                                class92.field1556 = var77;
                                method152();
                                Statics.field2251.method1856();
                                method2151(var44, var45, var46, var47);
                                method1949(var44, var45);
                                ((class96) Statics.field1570).method2043(field356);
                                method2299(var44, var45, var46, var47);
                                Statics.field274 = var68;
                                Statics.field13 = var69;
                                Statics.field96 = var70;
                                Statics.field3157 = var71;
                                Statics.field168 = var72;
                                if (field289) {
                                    byte var78 = 0;
                                    int var79 = class172.field2731 + class172.field2719 + var78;
                                    if (var79 == 0) {
                                        field289 = false;
                                    }
                                }
                                if (field289) {
                                    class80.method1683(var44, var45, var46, var47, 0);
                                    method2619(class158.field2327, false);
                                }
                                field484[var10.field2757] = true;
                                class80.method1677(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2834 == 1338) {
                                method152();
                                class176 var81 = var10.method3140(false);
                                if (var81 != null) {
                                    class80.method1677(var13, var14, var81.field2900 + var13, var81.field2898 + var14);
                                    if (field515 == 2 || field515 == 5) {
                                        class80.method1686(var13, var14, 0, var81.field2899, var81.field2897);
                                    } else {
                                        int var82 = field369 + field351 & 0x7FF;
                                        int var83 = Statics.field573.field805 / 32 + 48;
                                        int var84 = 464 - Statics.field573.field815 / 32;
                                        Statics.field2161.method1597(var13, var14, var81.field2900, var81.field2898, var83, var84, var82, field353 + 256, var81.field2899, var81.field2897);
                                        for (int var85 = 0; var85 < field509; var85++) {
                                            int var86 = field500[var85] * 4 + 2 - Statics.field573.field805 / 32;
                                            int var87 = field419[var85] * 4 + 2 - Statics.field573.field815 / 32;
                                            method2925(var13, var14, var86, var87, field531[var85], var81);
                                        }
                                        int var88 = 0;
                                        while (true) {
                                            if (var88 >= 104) {
                                                for (int var93 = 0; var93 < field318; var93++) {
                                                    class35 var94 = field317[field319[var93]];
                                                    if (var94 != null && var94.method30()) {
                                                        class40 var95 = var94.field756;
                                                        if (var95 != null && var95.field889 != null) {
                                                            var95 = var95.method737();
                                                        }
                                                        if (var95 != null && var95.field880 && var95.field892) {
                                                            int var96 = var94.field805 / 32 - Statics.field573.field805 / 32;
                                                            int var97 = var94.field815 / 32 - Statics.field573.field815 / 32;
                                                            method2925(var13, var14, var96, var97, Statics.field513[1], var81);
                                                        }
                                                    }
                                                }
                                                int var98 = class33.field732;
                                                int[] var99 = class33.field733;
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    class3 var101 = field388[var99[var100]];
                                                    if (var101 != null && var101.method30() && !var101.field55 && Statics.field573 != var101) {
                                                        int var102 = var101.field805 / 32 - Statics.field573.field805 / 32;
                                                        int var103 = var101.field815 / 32 - Statics.field573.field815 / 32;
                                                        boolean var104 = false;
                                                        if (method125(var101.field46, true)) {
                                                            var104 = true;
                                                        }
                                                        boolean var105 = false;
                                                        for (int var106 = 0; var106 < Statics.field645; var106++) {
                                                            if (var101.field46.equals(Statics.field1543[var106].field610)) {
                                                                var105 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var107 = false;
                                                        if (Statics.field573.field63 != 0 && var101.field63 != 0 && Statics.field573.field63 == var101.field63) {
                                                            var107 = true;
                                                        }
                                                        if (var104) {
                                                            method2925(var13, var14, var102, var103, Statics.field513[3], var81);
                                                        } else if (var107) {
                                                            method2925(var13, var14, var102, var103, Statics.field513[4], var81);
                                                        } else if (var105) {
                                                            method2925(var13, var14, var102, var103, Statics.field513[5], var81);
                                                        } else {
                                                            method2925(var13, var14, var102, var103, Statics.field513[2], var81);
                                                        }
                                                    }
                                                }
                                                if (field298 != 0 && field290 % 20 < 10) {
                                                    if (field298 == 1 && field299 >= 0 && field299 < field317.length) {
                                                        class35 var108 = field317[field299];
                                                        if (var108 != null) {
                                                            int var109 = var108.field805 / 32 - Statics.field573.field805 / 32;
                                                            int var110 = var108.field815 / 32 - Statics.field573.field815 / 32;
                                                            method2152(var13, var14, var109, var110, Statics.field689[1], var81);
                                                        }
                                                    }
                                                    if (field298 == 2) {
                                                        int var111 = field537 * 4 - Statics.field1440 * 4 + 2 - Statics.field573.field805 / 32;
                                                        int var112 = field347 * 4 - Statics.field129 * 4 + 2 - Statics.field573.field815 / 32;
                                                        method2152(var13, var14, var111, var112, Statics.field689[1], var81);
                                                    }
                                                    if (field298 == 10 && field300 >= 0 && field300 < field388.length) {
                                                        class3 var113 = field388[field300];
                                                        if (var113 != null) {
                                                            int var114 = var113.field805 / 32 - Statics.field573.field805 / 32;
                                                            int var115 = var113.field815 / 32 - Statics.field573.field815 / 32;
                                                            method2152(var13, var14, var114, var115, Statics.field689[1], var81);
                                                        }
                                                    }
                                                }
                                                if (field433 != 0) {
                                                    int var116 = field433 * 4 + 2 - Statics.field573.field805 / 32;
                                                    int var117 = field514 * 4 + 2 - Statics.field573.field815 / 32;
                                                    method2925(var13, var14, var116, var117, Statics.field689[0], var81);
                                                }
                                                if (!Statics.field573.field55) {
                                                    class80.method1683(var81.field2900 / 2 + var13 - 1, var81.field2898 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var89 = 0; var89 < 104; var89++) {
                                                class200 var90 = field411[Statics.field1064][var88][var89];
                                                if (var90 != null) {
                                                    int var91 = var88 * 4 + 2 - Statics.field573.field805 / 32;
                                                    int var92 = var89 * 4 + 2 - Statics.field573.field815 / 32;
                                                    method2925(var13, var14, var91, var92, Statics.field513[0], var81);
                                                }
                                            }
                                            var88++;
                                        }
                                    }
                                    field485[var11] = true;
                                }
                                class80.method1677(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2834 == 1339) {
                                class176 var118 = var10.method3140(false);
                                if (var118 != null) {
                                    if (field515 < 3) {
                                        Statics.field2128.method1597(var13, var14, var118.field2900, var118.field2898, 25, 25, field369, 256, var118.field2899, var118.field2897);
                                    } else {
                                        class80.method1686(var13, var14, 0, var118.field2899, var118.field2897);
                                    }
                                }
                                class80.method1677(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2758 == 0) {
                            if (!var10.field2810 && method572(var10) && Statics.field139 != var10) {
                                continue;
                            }
                            if (!var10.field2810) {
                                if (var10.field2816 > var10.field2780 - var10.field2835) {
                                    var10.field2816 = var10.field2780 - var10.field2835;
                                }
                                if (var10.field2816 < 0) {
                                    var10.field2816 = 0;
                                }
                            }
                            method2379(arg0, var10.field2795, var20, var21, var22, var23, var13 - var10.field2777, var14 - var10.field2816, var11);
                            if (var10.field2880 != null) {
                                method2379(var10.field2880, var10.field2795, var20, var21, var22, var23, var13 - var10.field2777, var14 - var10.field2816, var11);
                            }
                            class4 var119 = (class4) field440.method3507((long) var10.field2795);
                            if (var119 != null) {
                                method175(var119.field70, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1677(arg2, arg3, arg4, arg5);
                            class92.method1957();
                        }
                        if (field399 || field415[var11] || field491 > 1) {
                            if (var10.field2758 == 0 && !var10.field2810 && var10.field2780 > var10.field2835) {
                                method2688(var10.field2771 + var13, var14, var10.field2816, var10.field2835, var10.field2780);
                            }
                            if (var10.field2758 != 1) {
                                if (var10.field2758 == 2) {
                                    int var120 = 0;
                                    for (int var121 = 0; var121 < var10.field2768; var121++) {
                                        for (int var122 = 0; var122 < var10.field2767; var122++) {
                                            int var123 = (var10.field2755 + 32) * var122 + var13;
                                            int var124 = (var10.field2800 + 32) * var121 + var14;
                                            if (var120 < 20) {
                                                var123 += var10.field2824[var120];
                                                var124 += var10.field2842[var120];
                                            }
                                            if (var10.field2760[var120] > 0) {
                                                boolean var125 = false;
                                                boolean var126 = false;
                                                int var127 = var10.field2760[var120] - 1;
                                                if (var123 + 32 > arg2 && var123 < arg4 && var124 + 32 > arg3 && var124 < arg5 || Statics.field2171 == var10 && field394 == var120) {
                                                    class79 var128;
                                                    if (field432 == 1 && Statics.field2742 == var120 && Statics.field1186 == var10.field2795) {
                                                        var128 = class52.method102(var127, var10.field2874[var120], 2, 0, 2, false);
                                                    } else {
                                                        var128 = class52.method102(var127, var10.field2874[var120], 1, 3153952, 2, false);
                                                    }
                                                    if (var128 == null) {
                                                        method130(var10);
                                                    } else if (Statics.field2171 == var10 && field394 == var120) {
                                                        int var129 = class141.field2141 - field395;
                                                        int var130 = class141.field2142 * 20354633 - field376;
                                                        if (var129 < 5 && var129 > -5) {
                                                            var129 = 0;
                                                        }
                                                        if (var130 < 5 && var130 > -5) {
                                                            var130 = 0;
                                                        }
                                                        if (field525 < 5) {
                                                            var129 = 0;
                                                            var130 = 0;
                                                        }
                                                        var128.method1592(var123 + var129, var124 + var130, 128);
                                                        if (arg1 != -1) {
                                                            class174 var131 = arg0[arg1 & 0xFFFF];
                                                            if (var124 + var130 < class80.field1386 && var131.field2816 > 0) {
                                                                int var132 = field356 * (class80.field1386 - var124 - var130) / 3;
                                                                if (var132 > field356 * 10) {
                                                                    var132 = field356 * 10;
                                                                }
                                                                if (var132 > var131.field2816) {
                                                                    var132 = var131.field2816;
                                                                }
                                                                var131.field2816 -= var132;
                                                                field376 += var132;
                                                                method130(var131);
                                                            }
                                                            if (var124 + var130 + 32 > class80.field1387 && var131.field2816 < var131.field2780 - var131.field2835) {
                                                                int var133 = field356 * (var124 + var130 + 32 - class80.field1387) / 3;
                                                                if (var133 > field356 * 10) {
                                                                    var133 = field356 * 10;
                                                                }
                                                                if (var133 > var131.field2780 - var131.field2835 - var131.field2816) {
                                                                    var133 = var131.field2780 - var131.field2835 - var131.field2816;
                                                                }
                                                                var131.field2816 += var133;
                                                                field376 -= var133;
                                                                method130(var131);
                                                            }
                                                        }
                                                    } else if (Statics.field3159 == var10 && field360 == var120) {
                                                        var128.method1592(var123, var124, 128);
                                                    } else {
                                                        var128.method1583(var123, var124);
                                                    }
                                                }
                                            } else if (var10.field2826 != null && var120 < 20) {
                                                class79 var134 = var10.method3138(var120);
                                                if (var134 != null) {
                                                    var134.method1583(var123, var124);
                                                } else if (class174.field2753) {
                                                    method130(var10);
                                                }
                                            }
                                            var120++;
                                        }
                                    }
                                } else if (var10.field2758 == 3) {
                                    int var135;
                                    if (method2155(var10)) {
                                        var135 = var10.field2832;
                                        if (Statics.field139 == var10 && var10.field2784 != 0) {
                                            var135 = var10.field2784;
                                        }
                                    } else {
                                        var135 = var10.field2781;
                                        if (Statics.field139 == var10 && var10.field2783 != 0) {
                                            var135 = var10.field2783;
                                        }
                                    }
                                    if (var10.field2785) {
                                        switch(var10.field2786.field1404) {
                                            case 1:
                                                class80.method1684(var13, var14, var10.field2771, var10.field2835, var10.field2781, var10.field2832, 256 - (var10.field2787 & 0xFF), 256 - (var10.field2788 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1701(var13, var14, var10.field2771, var10.field2835, var10.field2781, var10.field2832, 256 - (var10.field2787 & 0xFF), 256 - (var10.field2788 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1732(var13, var14, var10.field2771, var10.field2835, var10.field2781, var10.field2832, 256 - (var10.field2787 & 0xFF), 256 - (var10.field2788 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1687(var13, var14, var10.field2771, var10.field2835, var10.field2781, var10.field2832, 256 - (var10.field2787 & 0xFF), 256 - (var10.field2788 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1683(var13, var14, var10.field2771, var10.field2835, var135);
                                                } else {
                                                    class80.method1682(var13, var14, var10.field2771, var10.field2835, var135, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1675(var13, var14, var10.field2771, var10.field2835, var135);
                                    } else {
                                        class80.method1690(var13, var14, var10.field2771, var10.field2835, var135, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2758 == 4) {
                                    class225 var136 = var10.method3153();
                                    if (var136 != null) {
                                        String var137 = var10.field2854;
                                        int var138;
                                        if (method2155(var10)) {
                                            var138 = var10.field2832;
                                            if (Statics.field139 == var10 && var10.field2784 != 0) {
                                                var138 = var10.field2784;
                                            }
                                            if (var10.field2879.length() > 0) {
                                                var137 = var10.field2879;
                                            }
                                        } else {
                                            var138 = var10.field2781;
                                            if (Statics.field139 == var10 && var10.field2783 != 0) {
                                                var138 = var10.field2783;
                                            }
                                        }
                                        if (var10.field2810 && var10.field2823 != -1) {
                                            class52 var139 = class52.method696(var10.field2823);
                                            var137 = var139.field1092;
                                            if (var137 == null) {
                                                var137 = "null";
                                            }
                                            if ((var139.field1103 == 1 || var10.field2867 != 1) && var10.field2867 != -1) {
                                                var137 = class2.method759(16748608) + var137 + class2.field20 + " " + 'x' + method14(var10.field2867);
                                            }
                                        }
                                        if (field443 == var10) {
                                            class158 var10000 = (class158) null;
                                            var137 = class158.field2372;
                                            var138 = var10.field2781;
                                        }
                                        if (!var10.field2810) {
                                            var137 = method2799(var137, var10);
                                        }
                                        var136.method3741(var137, var13, var14, var10.field2771, var10.field2835, var138, var10.field2821 ? 0 : -1, var10.field2819, var10.field2820, var10.field2818);
                                    } else if (class174.field2753) {
                                        method130(var10);
                                    }
                                } else if (var10.field2758 == 5) {
                                    if (var10.field2810) {
                                        class79 var141;
                                        if (var10.field2823 == -1) {
                                            var141 = var10.method3136(false);
                                        } else {
                                            var141 = class52.method102(var10.field2823, var10.field2867, var10.field2840, var10.field2796, var10.field2814, false);
                                        }
                                        if (var141 != null) {
                                            int var142 = var141.field1373;
                                            int var143 = var141.field1377;
                                            if (var10.field2794) {
                                                class80.method1678(var13, var14, var10.field2771 + var13, var10.field2835 + var14);
                                                int var144 = (var10.field2771 + (var142 - 1)) / var142;
                                                int var145 = (var10.field2835 + (var143 - 1)) / var143;
                                                for (int var146 = 0; var146 < var144; var146++) {
                                                    for (int var147 = 0; var147 < var145; var147++) {
                                                        if (var10.field2802 != 0) {
                                                            var141.method1600(var142 / 2 + var142 * var146 + var13, var143 / 2 + var143 * var147 + var14, var10.field2802, 4096);
                                                        } else if (var15 == 0) {
                                                            var141.method1583(var142 * var146 + var13, var143 * var147 + var14);
                                                        } else {
                                                            var141.method1592(var142 * var146 + var13, var143 * var147 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1677(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var148 = var10.field2771 * 4096 / var142;
                                                if (var10.field2802 != 0) {
                                                    var141.method1600(var10.field2771 / 2 + var13, var10.field2835 / 2 + var14, var10.field2802, var148);
                                                } else if (var15 != 0) {
                                                    var141.method1594(var13, var14, var10.field2771, var10.field2835, 256 - (var15 & 0xFF));
                                                } else if (var10.field2771 == var142 && var10.field2835 == var143) {
                                                    var141.method1583(var13, var14);
                                                } else {
                                                    var141.method1623(var13, var14, var10.field2771, var10.field2835);
                                                }
                                            }
                                        } else if (class174.field2753) {
                                            method130(var10);
                                        }
                                    } else {
                                        class79 var140 = var10.method3136(method2155(var10));
                                        if (var140 != null) {
                                            var140.method1583(var13, var14);
                                        } else if (class174.field2753) {
                                            method130(var10);
                                        }
                                    }
                                } else if (var10.field2758 == 6) {
                                    boolean var149 = method2155(var10);
                                    int var150;
                                    if (var149) {
                                        var150 = var10.field2878;
                                    } else {
                                        var150 = var10.field2846;
                                    }
                                    class106 var151 = null;
                                    int var152 = 0;
                                    if (var10.field2823 != -1) {
                                        class52 var153 = class52.method696(var10.field2823);
                                        if (var153 != null) {
                                            class52 var154 = var153.method997(var10.field2867);
                                            var151 = var154.method996(1);
                                            if (var151 == null) {
                                                method130(var10);
                                            } else {
                                                var151.method2183();
                                                var152 = var151.field1439 / 2;
                                            }
                                        }
                                    } else if (var10.field2799 == 5) {
                                        if (var10.field2877 == 0) {
                                            var151 = field552.method3228((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var151 = Statics.field573.method25();
                                        }
                                    } else if (var150 == -1) {
                                        var151 = var10.method3139((class43) null, -1, var149, Statics.field573.field36);
                                        if (var151 == null && class174.field2753) {
                                            method130(var10);
                                        }
                                    } else {
                                        class43 var155 = class43.method949(var150);
                                        var151 = var10.method3139(var155, var10.field2750, var149, Statics.field573.field36);
                                        if (var151 == null && class174.field2753) {
                                            method130(var10);
                                        }
                                    }
                                    class92.method1960(var10.field2771 / 2 + var13, var10.field2835 / 2 + var14);
                                    int var156 = var10.field2803 * class92.field1569[var10.field2766] >> 16;
                                    int var157 = var10.field2803 * class92.field1555[var10.field2766] >> 16;
                                    if (var151 != null) {
                                        if (var10.field2810) {
                                            var151.method2183();
                                            if (var10.field2807) {
                                                var151.method2182(0, var10.field2808, var10.field2801, var10.field2766, var10.field2805, var10.field2806 + var152 + var156, var10.field2806 + var157, var10.field2803);
                                            } else {
                                                var151.method2221(0, var10.field2808, var10.field2801, var10.field2766, var10.field2805, var10.field2806 + var152 + var156, var10.field2806 + var157);
                                            }
                                        } else {
                                            var151.method2221(0, var10.field2808, 0, var10.field2766, 0, var156, var157);
                                        }
                                    }
                                    class92.method1959();
                                } else {
                                    if (var10.field2758 == 7) {
                                        class225 var158 = var10.method3153();
                                        if (var158 == null) {
                                            if (class174.field2753) {
                                                method130(var10);
                                            }
                                            continue;
                                        }
                                        int var159 = 0;
                                        for (int var160 = 0; var160 < var10.field2768; var160++) {
                                            for (int var161 = 0; var161 < var10.field2767; var161++) {
                                                if (var10.field2760[var159] > 0) {
                                                    class52 var162 = class52.method696(var10.field2760[var159] - 1);
                                                    String var163;
                                                    if (var162.field1103 != 1 && var10.field2874[var159] == 1) {
                                                        var163 = class2.method759(16748608) + var162.field1092 + class2.field20;
                                                    } else {
                                                        var163 = class2.method759(16748608) + var162.field1092 + class2.field20 + " " + 'x' + method14(var10.field2874[var159]);
                                                    }
                                                    int var164 = (var10.field2755 + 115) * var161 + var13;
                                                    int var165 = (var10.field2800 + 12) * var160 + var14;
                                                    if (var10.field2819 == 0) {
                                                        var158.method3738(var163, var164, var165, var10.field2781, var10.field2821 ? 0 : -1);
                                                    } else if (var10.field2819 == 1) {
                                                        var158.method3729(var163, var10.field2771 / 2 + var164, var165, var10.field2781, var10.field2821 ? 0 : -1);
                                                    } else {
                                                        var158.method3739(var163, var10.field2771 + var164 - 1, var165, var10.field2781, var10.field2821 ? 0 : -1);
                                                    }
                                                }
                                                var159++;
                                            }
                                        }
                                    }
                                    if (var10.field2758 == 8 && Statics.field1650 == var10 && field502 == field371) {
                                        int var166 = 0;
                                        int var167 = 0;
                                        class225 var168 = Statics.field629;
                                        String var169 = var10.field2854;
                                        String var170 = method2799(var169, var10);
                                        while (var170.length() > 0) {
                                            int var171 = var170.indexOf(class2.field34);
                                            String var172;
                                            if (var171 == -1) {
                                                var172 = var170;
                                                var170 = "";
                                            } else {
                                                var172 = var170.substring(0, var171);
                                                var170 = var170.substring(var171 + 4);
                                            }
                                            int var173 = var168.method3793(var172);
                                            if (var173 > var166) {
                                                var166 = var173;
                                            }
                                            var167 += var168.field3189 + 1;
                                        }
                                        var166 += 6;
                                        var167 += 7;
                                        int var174 = var10.field2771 + var13 - 5 - var166;
                                        int var175 = var10.field2835 + var14 + 5;
                                        if (var174 < var13 + 5) {
                                            var174 = var13 + 5;
                                        }
                                        if (var166 + var174 > arg4) {
                                            var174 = arg4 - var166;
                                        }
                                        if (var167 + var175 > arg5) {
                                            var175 = arg5 - var167;
                                        }
                                        class80.method1683(var174, var175, var166, var167, 16777120);
                                        class80.method1675(var174, var175, var166, var167, 0);
                                        String var176 = var10.field2854;
                                        int var177 = var168.field3189 + var175 + 2;
                                        String var178 = method2799(var176, var10);
                                        while (var178.length() > 0) {
                                            int var179 = var178.indexOf(class2.field34);
                                            String var180;
                                            if (var179 == -1) {
                                                var180 = var178;
                                                var178 = "";
                                            } else {
                                                var180 = var178.substring(0, var179);
                                                var178 = var178.substring(var179 + 4);
                                            }
                                            var168.method3738(var180, var174 + 3, var177, 0, -1);
                                            var177 += var168.field3189 + 1;
                                        }
                                    }
                                    if (var10.field2758 == 9) {
                                        if (var10.field2789 == 1) {
                                            int var181;
                                            int var182;
                                            int var183;
                                            int var184;
                                            if (var10.field2790) {
                                                var181 = var13;
                                                var182 = var10.field2835 + var14;
                                                var183 = var10.field2771 + var13;
                                                var184 = var14;
                                            } else {
                                                var181 = var13;
                                                var182 = var14;
                                                var183 = var10.field2771 + var13;
                                                var184 = var10.field2835 + var14;
                                            }
                                            class80.method1739(var181, var182, var183, var184, var10.field2781);
                                        } else {
                                            int var185 = var10.field2771 >= 0 ? var10.field2771 : -var10.field2771;
                                            int var186 = var10.field2835 >= 0 ? var10.field2835 : -var10.field2835;
                                            int var187 = var185;
                                            if (var185 < var186) {
                                                var187 = var186;
                                            }
                                            if (var187 != 0) {
                                                int var188 = (var10.field2771 << 16) / var187;
                                                int var189 = (var10.field2835 << 16) / var187;
                                                if (var189 <= var188) {
                                                    var188 = -var188;
                                                } else {
                                                    var189 = -var189;
                                                }
                                                int var190 = var10.field2789 * var189 >> 17;
                                                int var191 = var10.field2789 * var189 + 1 >> 17;
                                                int var192 = var10.field2789 * var188 >> 17;
                                                int var193 = var10.field2789 * var188 + 1 >> 17;
                                                int var194 = var13 + var190;
                                                int var195 = var13 - var191;
                                                int var196 = var10.field2771 + var13 - var191;
                                                int var197 = var10.field2771 + var13 + var190;
                                                int var198 = var14 + var192;
                                                int var199 = var14 - var193;
                                                int var200 = var10.field2835 + var14 - var193;
                                                int var201 = var10.field2835 + var14 + var192;
                                                class92.method1965(var194, var195, var196);
                                                class92.method1968(var198, var199, var200, var194, var195, var196, var10.field2781);
                                                class92.method1965(var194, var196, var197);
                                                class92.method1968(var198, var200, var201, var194, var196, var197, var10.field2781);
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

    @ObfuscatedName("ev.ck(Ljava/lang/String;Lfg;I)Ljava/lang/String;")
    public static String method2799(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2300(arg1, var2 - 1);
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
                if (Statics.field306 != null) {
                    int var9 = Statics.field306.field2215;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field306.field2217 != null) {
                        var8 = (String) Statics.field306.field2217;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.cw(II)Ljava/lang/String;")
    public static final String method14(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method759(65408) + var1.substring(0, var1.length() - 8) + class158.field2466 + " " + class2.field23 + var1 + class2.field24 + class2.field20;
        } else if (var1.length() > 6) {
            return " " + class2.method759(16777215) + var1.substring(0, var1.length() - 4) + class158.field2438 + " " + class2.field23 + var1 + class2.field24 + class2.field20;
        } else {
            return " " + class2.method759(16776960) + var1 + class2.field20;
        }
    }

    @ObfuscatedName("cd.cd(Lfg;I)V")
    public static void method1955(class174 arg0) {
        class174 var1 = arg0.field2775 == -1 ? null : class174.method2906(arg0.field2775);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field763;
            var3 = Statics.field576;
        } else {
            var2 = var1.field2771;
            var3 = var1.field2835;
        }
        method968(arg0, var2, var3, false);
        method921(arg0, var2, var3);
    }

    @ObfuscatedName("fb.cg([Lfg;Lfg;ZI)V")
    public static void method3274(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2779 == 0 ? arg1.field2771 : arg1.field2779;
        int var4 = arg1.field2780 == 0 ? arg1.field2835 : arg1.field2780;
        method1037(arg0, arg1.field2795, var3, var4, arg2);
        if (arg1.field2880 != null) {
            method1037(arg1.field2880, arg1.field2795, var3, var4, arg2);
        }
        class4 var5 = (class4) field440.method3507((long) arg1.field2795);
        if (var5 != null) {
            int var6 = var5.field70;
            if (class174.method2294(var6)) {
                method1037(Statics.field2838[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2834 == 1337) {
        }
    }

    @ObfuscatedName("as.cc([Lfg;IIIZI)V")
    public static void method1037(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2775 == arg1) {
                method968(var6, arg2, arg3, arg4);
                method921(var6, arg2, arg3);
                if (var6.field2777 > var6.field2779 - var6.field2771) {
                    var6.field2777 = var6.field2779 - var6.field2771;
                }
                if (var6.field2777 < 0) {
                    var6.field2777 = 0;
                }
                if (var6.field2816 > var6.field2780 - var6.field2835) {
                    var6.field2816 = var6.field2780 - var6.field2835;
                }
                if (var6.field2816 < 0) {
                    var6.field2816 = 0;
                }
                if (var6.field2758 == 0) {
                    method3274(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ao.cu(Lfg;IIZI)V")
    public static void method968(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2771;
        int var5 = arg0.field2835;
        if (arg0.field2763 == 0) {
            arg0.field2771 = arg0.field2767;
        } else if (arg0.field2763 == 1) {
            arg0.field2771 = arg1 - arg0.field2767;
        } else if (arg0.field2763 == 2) {
            arg0.field2771 = arg0.field2767 * arg1 >> 14;
        }
        if (arg0.field2764 == 0) {
            arg0.field2835 = arg0.field2768;
        } else if (arg0.field2764 == 1) {
            arg0.field2835 = arg2 - arg0.field2768;
        } else if (arg0.field2764 == 2) {
            arg0.field2835 = arg0.field2768 * arg2 >> 14;
        }
        if (arg0.field2763 == 4) {
            arg0.field2771 = arg0.field2835 * arg0.field2773 / arg0.field2774;
        }
        if (arg0.field2764 == 4) {
            arg0.field2835 = arg0.field2774 * arg0.field2771 / arg0.field2773;
        }
        if (field449 && arg0.field2758 == 0) {
            if (arg0.field2835 < 5 && arg0.field2771 < 5) {
                arg0.field2835 = 5;
                arg0.field2771 = 5;
            } else {
                if (arg0.field2835 <= 0) {
                    arg0.field2835 = 5;
                }
                if (arg0.field2771 <= 0) {
                    arg0.field2771 = 5;
                }
            }
        }
        if (arg0.field2834 == 1337) {
            field511 = arg0;
        }
        if (arg3 && arg0.field2865 != null && (arg0.field2771 != var4 || arg0.field2835 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field12 = arg0.field2865;
            field467.method3553(var6);
        }
    }

    @ObfuscatedName("ax.cs(Lfg;III)V")
    public static void method921(class174 arg0, int arg1, int arg2) {
        if (arg0.field2761 == 0) {
            arg0.field2881 = arg0.field2765;
        } else if (arg0.field2761 == 1) {
            arg0.field2881 = (arg1 - arg0.field2771) / 2 + arg0.field2765;
        } else if (arg0.field2761 == 2) {
            arg0.field2881 = arg1 - arg0.field2771 - arg0.field2765;
        } else if (arg0.field2761 == 3) {
            arg0.field2881 = arg0.field2765 * arg1 >> 14;
        } else if (arg0.field2761 == 4) {
            arg0.field2881 = (arg0.field2765 * arg1 >> 14) + (arg1 - arg0.field2771) / 2;
        } else {
            arg0.field2881 = arg1 - arg0.field2771 - (arg0.field2765 * arg1 >> 14);
        }
        if (arg0.field2762 == 0) {
            arg0.field2770 = arg0.field2887;
        } else if (arg0.field2762 == 1) {
            arg0.field2770 = (arg2 - arg0.field2835) / 2 + arg0.field2887;
        } else if (arg0.field2762 == 2) {
            arg0.field2770 = arg2 - arg0.field2835 - arg0.field2887;
        } else if (arg0.field2762 == 3) {
            arg0.field2770 = arg0.field2887 * arg2 >> 14;
        } else if (arg0.field2762 == 4) {
            arg0.field2770 = (arg0.field2887 * arg2 >> 14) + (arg2 - arg0.field2835) / 2;
        } else {
            arg0.field2770 = arg2 - arg0.field2835 - (arg0.field2887 * arg2 >> 14);
        }
        if (!field449 || arg0.field2758 != 0) {
            return;
        }
        if (arg0.field2881 < 0) {
            arg0.field2881 = 0;
        } else if (arg0.field2881 + arg0.field2771 > arg1) {
            arg0.field2881 = arg1 - arg0.field2771;
        }
        if (arg0.field2770 < 0) {
            arg0.field2770 = 0;
        } else if (arg0.field2835 + arg0.field2770 > arg2) {
            arg0.field2770 = arg2 - arg0.field2835;
        }
    }

    @ObfuscatedName("g.cn(Lfg;IIIIIII)V")
    public static final void method97(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field362) {
            field363 = 32;
        } else {
            field363 = 0;
        }
        field362 = false;
        if (class141.field2137 == 1 || !Statics.field67 && class141.field2137 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2816 -= 4;
                method130(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2816 += 4;
                method130(arg0);
            } else if (arg5 >= arg1 - field363 && arg5 < field363 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2816 = (arg4 - arg3) * var8 / var9;
                method130(arg0);
                field362 = true;
            }
        }
        if (field477 == 0) {
            return;
        }
        int var10 = arg0.field2771;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2816 += field477 * 45;
            method130(arg0);
        }
    }

    @ObfuscatedName("eq.cx(IIIIII)V")
    public static final void method2688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3163[0].method1754(arg0, arg1);
        Statics.field3163[1].method1754(arg0, arg1 + arg3 - 16);
        class80.method1683(arg0, arg1 + 16, 16, arg3 - 32, field358);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1683(arg0, arg1 + 16 + var6, 16, var5, field331);
        class80.method1693(arg0, arg1 + 16 + var6, var5, field361);
        class80.method1693(arg0 + 1, arg1 + 16 + var6, var5, field361);
        class80.method1696(arg0, arg1 + 16 + var6, 16, field361);
        class80.method1696(arg0, arg1 + 17 + var6, 16, field361);
        class80.method1693(arg0 + 15, arg1 + 16 + var6, var5, field476);
        class80.method1693(arg0 + 14, arg1 + 17 + var6, var5 - 1, field476);
        class80.method1696(arg0, arg1 + 15 + var6 + var5, 16, field476);
        class80.method1696(arg0 + 1, arg1 + 14 + var6 + var5, 15, field476);
    }

    @ObfuscatedName("cy.cv(Lfg;I)Z")
    public static final boolean method2155(class174 arg0) {
        if (arg0.field2888 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2888.length; var1++) {
            int var2 = method2300(arg0, var1);
            int var3 = arg0.field2809[var1];
            if (arg0.field2888[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2888[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2888[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dt.co(Lfg;II)I")
    public static final int method2300(class174 arg0, int arg1) {
        if (arg0.field2868 == null || arg1 >= arg0.field2868.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2868[arg1];
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
                    var7 = field493[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field416[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field553[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class174 var11 = class174.method2906(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method696(var12).field1124 || field285)) {
                        for (int var13 = 0; var13 < var11.field2760.length; var13++) {
                            if (var12 + 1 == var11.field2760[var13]) {
                                var7 += var11.field2874[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2904[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2285[field416[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2904[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field573.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2283[var14]) {
                            var7 += field416[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method2906(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method696(var18).field1124 || field285)) {
                        for (int var19 = 0; var19 < var17.field2760.length; var19++) {
                            if (var18 + 1 == var17.field2760[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field444;
                }
                if (var6 == 12) {
                    var7 = field366;
                }
                if (var6 == 13) {
                    int var20 = class177.field2904[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method2798(var22);
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
                    var7 = (Statics.field573.field805 >> 7) + Statics.field1440;
                }
                if (var6 == 19) {
                    var7 = (Statics.field573.field815 >> 7) + Statics.field129;
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

    @ObfuscatedName("aw.cj([Lfg;IIIIIIIB)V")
    public static final void method781(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2810 || var9.field2758 == 0 || var9.field2836 || method1530(var9) != 0 || field453 == var9 || var9.field2834 == 1338) && var9.field2775 == arg1 && (!var9.field2810 || !method572(var9))) {
                int var10 = var9.field2881 + arg6;
                int var11 = var9.field2770 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2758 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2758 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2771 + var10;
                    int var19 = var9.field2835 + var11;
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
                    int var22 = var9.field2771 + var10;
                    int var23 = var9.field2835 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field452 == var9) {
                    field460 = true;
                    field461 = var10;
                    field295 = var11;
                }
                if (!var9.field2810 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2141;
                    int var25 = class141.field2142 * 20354633;
                    if (class141.field2147 != 0) {
                        var24 = class141.field2136;
                        var25 = class141.field2149;
                    }
                    if (var9.field2834 == 1337) {
                        if (!field289 && !field332 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field432 == 0 && !field434) {
                                method153(class158.field2421, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class106.field1834; var28++) {
                                int var29 = class106.field1804[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2251.method1832(Statics.field1064, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method626(var33);
                                        if (var34.field924 != null) {
                                            var34 = var34.method772();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field432 == 1) {
                                            method153(class158.field2455, field393 + " " + class2.field25 + " " + class2.method759(65535) + var34.field910, 1, var29, var30, var31);
                                        } else if (!field434) {
                                            String[] var35 = var34.field899;
                                            if (field540) {
                                                var35 = method127(var35);
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
                                                        method153(var35[var36], class2.method759(65535) + var34.field910, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method153(class158.field2456, class2.method759(65535) + var34.field910, 1002, var34.field907 << 14, var30, var31);
                                        } else if ((Statics.field3049 & 0x4) == 4) {
                                            method153(field378, field438 + " " + class2.field25 + " " + class2.method759(65535) + var34.field910, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field317[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field756.field872 == 1 && (var38.field805 & 0x7F) == 64 && (var38.field815 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field318; var39++) {
                                                class35 var40 = field317[field319[var39]];
                                                if (var40 != null && var38 != var40 && var40.field756.field872 == 1 && var38.field805 == var40.field805 && var38.field815 == var40.field815) {
                                                    method3820(var40.field756, field319[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field732;
                                            int[] var42 = class33.field733;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field388[var42[var43]];
                                                if (var44 != null && var38.field805 == var44.field805 && var38.field815 == var44.field815) {
                                                    method586(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method3820(var38.field756, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field388[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field805 & 0x7F) == 64 && (var45.field815 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field318; var46++) {
                                                class35 var47 = field317[field319[var46]];
                                                if (var47 != null && var47.field756.field872 == 1 && var45.field805 == var47.field805 && var45.field815 == var47.field815) {
                                                    method3820(var47.field756, field319[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field732;
                                            int[] var49 = class33.field733;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field388[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field805 == var51.field805 && var45.field815 == var51.field815) {
                                                    method586(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field410 == var33) {
                                            var26 = var29;
                                        } else {
                                            method586(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class200 var52 = field411[Statics.field1064][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3537(); var53 != null; var53 = (class29) var52.method3563()) {
                                                class52 var54 = class52.method696(var53.field667);
                                                if (field432 == 1) {
                                                    method153(class158.field2455, field393 + " " + class2.field25 + " " + class2.method759(16748608) + var54.field1092, 16, var53.field667, var30, var31);
                                                } else if (!field434) {
                                                    String[] var55 = var54.field1106;
                                                    if (field540) {
                                                        var55 = method127(var55);
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
                                                            method153(var55[var56], class2.method759(16748608) + var54.field1092, var57, var53.field667, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method153(class158.field2308, class2.method759(16748608) + var54.field1092, 20, var53.field667, var30, var31);
                                                        }
                                                    }
                                                    method153(class158.field2456, class2.method759(16748608) + var54.field1092, 1004, var53.field667, var30, var31);
                                                } else if ((Statics.field3049 & 0x1) == 1) {
                                                    method153(field378, field438 + " " + class2.field25 + " " + class2.method759(16748608) + var54.field1092, 17, var53.field667, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field388[field410];
                                method586(var60, field410, var58, var59);
                            }
                        }
                    } else if (var9.field2834 != 1338) {
                        if (!field332 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2759 == 1) {
                                method153(var9.field2873, "", 24, 0, 0, var9.field2795);
                            }
                            if (var9.field2759 == 2 && !field434) {
                                String var77 = method1775(var9);
                                if (var77 != null) {
                                    method153(var77, class2.method759(65280) + var9.field2804, 25, 0, -1, var9.field2795);
                                }
                            }
                            if (var9.field2759 == 3) {
                                method153(class158.field2344, "", 26, 0, 0, var9.field2795);
                            }
                            if (var9.field2759 == 4) {
                                method153(var9.field2873, "", 28, 0, 0, var9.field2795);
                            }
                            if (var9.field2759 == 5) {
                                method153(var9.field2873, "", 29, 0, 0, var9.field2795);
                            }
                            if (var9.field2759 == 6 && field443 == null) {
                                method153(var9.field2873, "", 30, 0, -1, var9.field2795);
                            }
                            if (var9.field2758 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var9.field2835; var79++) {
                                    for (int var80 = 0; var80 < var9.field2771; var80++) {
                                        int var81 = (var9.field2755 + 32) * var80;
                                        int var82 = (var9.field2800 + 32) * var79;
                                        if (var78 < 20) {
                                            var81 += var9.field2824[var78];
                                            var82 += var9.field2842[var78];
                                        }
                                        if (var75 >= var81 && var76 >= var82 && var75 < var81 + 32 && var76 < var82 + 32) {
                                            field401 = var78;
                                            Statics.field2183 = var9;
                                            if (var9.field2760[var78] > 0) {
                                                class52 var83 = class52.method696(var9.field2760[var78] - 1);
                                                if (field432 == 1 && class179.method654(method1530(var9))) {
                                                    if (Statics.field1186 != var9.field2795 || Statics.field2742 != var78) {
                                                        method153(class158.field2455, field393 + " " + class2.field25 + " " + class2.method759(16748608) + var83.field1092, 31, var83.field1090, var78, var9.field2795);
                                                    }
                                                } else if (!field434 || !class179.method654(method1530(var9))) {
                                                    String[] var84 = var83.field1131;
                                                    if (field540) {
                                                        var84 = method127(var84);
                                                    }
                                                    if (class179.method654(method1530(var9))) {
                                                        for (int var85 = 4; var85 >= 3; var85--) {
                                                            if (var84 != null && var84[var85] != null) {
                                                                byte var86;
                                                                if (var85 == 3) {
                                                                    var86 = 36;
                                                                } else {
                                                                    var86 = 37;
                                                                }
                                                                method153(var84[var85], class2.method759(16748608) + var83.field1092, var86, var83.field1090, var78, var9.field2795);
                                                            } else if (var85 == 4) {
                                                                method153(class158.field2403, class2.method759(16748608) + var83.field1092, 37, var83.field1090, var78, var9.field2795);
                                                            }
                                                        }
                                                    }
                                                    if (class179.method4(method1530(var9))) {
                                                        method153(class158.field2455, class2.method759(16748608) + var83.field1092, 38, var83.field1090, var78, var9.field2795);
                                                    }
                                                    if (class179.method654(method1530(var9)) && var84 != null) {
                                                        for (int var87 = 2; var87 >= 0; var87--) {
                                                            if (var84[var87] != null) {
                                                                byte var88 = 0;
                                                                if (var87 == 0) {
                                                                    var88 = 33;
                                                                }
                                                                if (var87 == 1) {
                                                                    var88 = 34;
                                                                }
                                                                if (var87 == 2) {
                                                                    var88 = 35;
                                                                }
                                                                method153(var84[var87], class2.method759(16748608) + var83.field1092, var88, var83.field1090, var78, var9.field2795);
                                                            }
                                                        }
                                                    }
                                                    String[] var89 = var9.field2827;
                                                    if (field540) {
                                                        var89 = method127(var89);
                                                    }
                                                    if (var89 != null) {
                                                        for (int var90 = 4; var90 >= 0; var90--) {
                                                            if (var89[var90] != null) {
                                                                byte var91 = 0;
                                                                if (var90 == 0) {
                                                                    var91 = 39;
                                                                }
                                                                if (var90 == 1) {
                                                                    var91 = 40;
                                                                }
                                                                if (var90 == 2) {
                                                                    var91 = 41;
                                                                }
                                                                if (var90 == 3) {
                                                                    var91 = 42;
                                                                }
                                                                if (var90 == 4) {
                                                                    var91 = 43;
                                                                }
                                                                method153(var89[var90], class2.method759(16748608) + var83.field1092, var91, var83.field1090, var78, var9.field2795);
                                                            }
                                                        }
                                                    }
                                                    method153(class158.field2456, class2.method759(16748608) + var83.field1092, 1005, var83.field1090, var78, var9.field2795);
                                                } else if ((Statics.field3049 & 0x10) == 16) {
                                                    method153(field378, field438 + " " + class2.field25 + " " + class2.method759(16748608) + var83.field1092, 32, var83.field1090, var78, var9.field2795);
                                                }
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            }
                            if (var9.field2810) {
                                if (!field434) {
                                    for (int var92 = 9; var92 >= 5; var92--) {
                                        String var93 = method2035(var9, var92);
                                        if (var93 != null) {
                                            method153(var93, var9.field2829, 1007, var92 + 1, var9.field2817, var9.field2795);
                                        }
                                    }
                                    String var94 = method1775(var9);
                                    if (var94 != null) {
                                        method153(var94, var9.field2829, 25, 0, var9.field2817, var9.field2795);
                                    }
                                    for (int var95 = 4; var95 >= 0; var95--) {
                                        String var96 = method2035(var9, var95);
                                        if (var96 != null) {
                                            method153(var96, var9.field2829, 57, var95 + 1, var9.field2817, var9.field2795);
                                        }
                                    }
                                    int var97 = method1530(var9);
                                    boolean var98 = (var97 & 0x1) != 0;
                                    if (var98) {
                                        method153(class158.field2313, "", 30, 0, var9.field2817, var9.field2795);
                                    }
                                } else if (class179.method1218(method1530(var9)) && (Statics.field3049 & 0x20) == 32) {
                                    method153(field378, field438 + " " + class2.field25 + " " + var9.field2829, 58, 0, var9.field2817, var9.field2795);
                                }
                            }
                        }
                        if (var9.field2758 == 0) {
                            if (!var9.field2810 && method572(var9) && Statics.field139 != var9) {
                                continue;
                            }
                            method781(arg0, var9.field2795, var12, var13, var14, var15, var10 - var9.field2777, var11 - var9.field2816);
                            if (var9.field2880 != null) {
                                method781(var9.field2880, var9.field2795, var12, var13, var14, var15, var10 - var9.field2777, var11 - var9.field2816);
                            }
                            class4 var99 = (class4) field440.method3507((long) var9.field2795);
                            if (var99 != null) {
                                if (var99.field65 == 0 && class141.field2141 >= var12 && class141.field2142 * 20354633 >= var13 && class141.field2141 < var14 && class141.field2142 * 20354633 < var15 && !field332 && !field449) {
                                    for (class1 var100 = (class1) field467.method3544(); var100 != null; var100 = (class1) field467.method3546()) {
                                        if (var100.field1) {
                                            var100.method3632();
                                            var100.field3.field2857 = false;
                                        }
                                    }
                                    if (Statics.field140 == 0) {
                                        field452 = null;
                                        field453 = null;
                                    }
                                    if (!field332) {
                                        field426[0] = class158.field2544;
                                        field427[0] = "";
                                        field302[0] = 1006;
                                        field421 = 1;
                                    }
                                }
                                int var101 = var99.field70;
                                if (class174.method2294(var101)) {
                                    method781(Statics.field2838[var101], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2810) {
                            if (var9.field2889) {
                                if (class141.field2141 >= var12 && class141.field2142 * 20354633 >= var13 && class141.field2141 < var14 && class141.field2142 * 20354633 < var15) {
                                    for (class1 var102 = (class1) field467.method3544(); var102 != null; var102 = (class1) field467.method3546()) {
                                        if (var102.field1) {
                                            var102.method3632();
                                            var102.field3.field2857 = false;
                                        }
                                    }
                                    if (Statics.field140 == 0) {
                                        field452 = null;
                                        field453 = null;
                                    }
                                    if (!field332) {
                                        field426[0] = class158.field2544;
                                        field427[0] = "";
                                        field302[0] = 1006;
                                        field421 = 1;
                                    }
                                }
                            } else if (var9.field2890 && class141.field2141 >= var12 && class141.field2142 * 20354633 >= var13 && class141.field2141 < var14 && class141.field2142 * 20354633 < var15) {
                                for (class1 var103 = (class1) field467.method3544(); var103 != null; var103 = (class1) field467.method3546()) {
                                    if (var103.field1 && var103.field3.field2822 == var103.field12) {
                                        var103.method3632();
                                    }
                                }
                            }
                            boolean var104;
                            if (class141.field2141 >= var12 && class141.field2142 * 20354633 >= var13 && class141.field2141 < var14 && class141.field2142 * 20354633 < var15) {
                                var104 = true;
                            } else {
                                var104 = false;
                            }
                            boolean var105 = false;
                            if ((class141.field2137 == 1 || !Statics.field67 && class141.field2137 == 4) && var104) {
                                var105 = true;
                            }
                            boolean var106 = false;
                            if ((class141.field2147 == 1 || !Statics.field67 && class141.field2147 == 4) && class141.field2136 >= var12 && class141.field2149 >= var13 && class141.field2136 < var14 && class141.field2149 < var15) {
                                var106 = true;
                            }
                            if (var106) {
                                method2939(var9, class141.field2136 - var10, class141.field2149 - var11);
                            }
                            if (field452 != null && field452 != var9 && var104 && class179.method1217(method1530(var9))) {
                                field456 = var9;
                            }
                            if (field453 == var9) {
                                field510 = true;
                                field528 = var10;
                                field459 = var11;
                            }
                            if (var9.field2836) {
                                if (var104 && field477 != 0 && var9.field2822 != null) {
                                    class1 var107 = new class1();
                                    var107.field1 = true;
                                    var107.field3 = var9;
                                    var107.field5 = field477;
                                    var107.field12 = var9.field2822;
                                    field467.method3553(var107);
                                }
                                if (field452 != null || Statics.field2171 != null || field332) {
                                    var106 = false;
                                    var105 = false;
                                    var104 = false;
                                }
                                if (!var9.field2882 && var106) {
                                    var9.field2882 = true;
                                    if (var9.field2751 != null) {
                                        class1 var108 = new class1();
                                        var108.field1 = true;
                                        var108.field3 = var9;
                                        var108.field4 = class141.field2136 - var10;
                                        var108.field5 = class141.field2149 - var11;
                                        var108.field12 = var9.field2751;
                                        field467.method3553(var108);
                                    }
                                }
                                if (var9.field2882 && var105 && var9.field2839 != null) {
                                    class1 var109 = new class1();
                                    var109.field1 = true;
                                    var109.field3 = var9;
                                    var109.field4 = class141.field2141 - var10;
                                    var109.field5 = class141.field2142 * 20354633 - var11;
                                    var109.field12 = var9.field2839;
                                    field467.method3553(var109);
                                }
                                if (var9.field2882 && !var105) {
                                    var9.field2882 = false;
                                    if (var9.field2791 != null) {
                                        class1 var110 = new class1();
                                        var110.field1 = true;
                                        var110.field3 = var9;
                                        var110.field4 = class141.field2141 - var10;
                                        var110.field5 = class141.field2142 * 20354633 - var11;
                                        var110.field12 = var9.field2791;
                                        field480.method3553(var110);
                                    }
                                }
                                if (var105 && var9.field2841 != null) {
                                    class1 var111 = new class1();
                                    var111.field1 = true;
                                    var111.field3 = var9;
                                    var111.field4 = class141.field2141 - var10;
                                    var111.field5 = class141.field2142 * 20354633 - var11;
                                    var111.field12 = var9.field2841;
                                    field467.method3553(var111);
                                }
                                if (!var9.field2857 && var104) {
                                    var9.field2857 = true;
                                    if (var9.field2833 != null) {
                                        class1 var112 = new class1();
                                        var112.field1 = true;
                                        var112.field3 = var9;
                                        var112.field4 = class141.field2141 - var10;
                                        var112.field5 = class141.field2142 * 20354633 - var11;
                                        var112.field12 = var9.field2833;
                                        field467.method3553(var112);
                                    }
                                }
                                if (var9.field2857 && var104 && var9.field2843 != null) {
                                    class1 var113 = new class1();
                                    var113.field1 = true;
                                    var113.field3 = var9;
                                    var113.field4 = class141.field2141 - var10;
                                    var113.field5 = class141.field2142 * 20354633 - var11;
                                    var113.field12 = var9.field2843;
                                    field467.method3553(var113);
                                }
                                if (var9.field2857 && !var104) {
                                    var9.field2857 = false;
                                    if (var9.field2844 != null) {
                                        class1 var114 = new class1();
                                        var114.field1 = true;
                                        var114.field3 = var9;
                                        var114.field4 = class141.field2141 - var10;
                                        var114.field5 = class141.field2142 * 20354633 - var11;
                                        var114.field12 = var9.field2844;
                                        field480.method3553(var114);
                                    }
                                }
                                if (var9.field2876 != null) {
                                    class1 var115 = new class1();
                                    var115.field3 = var9;
                                    var115.field12 = var9.field2876;
                                    field479.method3553(var115);
                                }
                                if (var9.field2849 != null && field558 > var9.field2884) {
                                    if (var9.field2850 == null || field558 - var9.field2884 > 32) {
                                        class1 var120 = new class1();
                                        var120.field3 = var9;
                                        var120.field12 = var9.field2849;
                                        field467.method3553(var120);
                                    } else {
                                        label940: for (int var116 = var9.field2884; var116 < field558; var116++) {
                                            int var117 = field465[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2850.length; var118++) {
                                                if (var9.field2850[var118] == var117) {
                                                    class1 var119 = new class1();
                                                    var119.field3 = var9;
                                                    var119.field12 = var9.field2849;
                                                    field467.method3553(var119);
                                                    break label940;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2884 = field558;
                                }
                                if (var9.field2851 != null && field468 > var9.field2885) {
                                    if (var9.field2852 == null || field468 - var9.field2885 > 32) {
                                        class1 var125 = new class1();
                                        var125.field3 = var9;
                                        var125.field12 = var9.field2851;
                                        field467.method3553(var125);
                                    } else {
                                        label916: for (int var121 = var9.field2885; var121 < field468; var121++) {
                                            int var122 = field482[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2852.length; var123++) {
                                                if (var9.field2852[var123] == var122) {
                                                    class1 var124 = new class1();
                                                    var124.field3 = var9;
                                                    var124.field12 = var9.field2851;
                                                    field467.method3553(var124);
                                                    break label916;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2885 = field468;
                                }
                                if (var9.field2853 != null && field470 > var9.field2886) {
                                    if (var9.field2778 == null || field470 - var9.field2886 > 32) {
                                        class1 var130 = new class1();
                                        var130.field3 = var9;
                                        var130.field12 = var9.field2853;
                                        field467.method3553(var130);
                                    } else {
                                        label892: for (int var126 = var9.field2886; var126 < field470; var126++) {
                                            int var127 = field469[var126 & 0x1F];
                                            for (int var128 = 0; var128 < var9.field2778.length; var128++) {
                                                if (var9.field2778[var128] == var127) {
                                                    class1 var129 = new class1();
                                                    var129.field3 = var9;
                                                    var129.field12 = var9.field2853;
                                                    field467.method3553(var129);
                                                    break label892;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2886 = field470;
                                }
                                if (field471 > var9.field2883 && var9.field2858 != null) {
                                    class1 var131 = new class1();
                                    var131.field3 = var9;
                                    var131.field12 = var9.field2858;
                                    field467.method3553(var131);
                                }
                                if (field472 > var9.field2883 && var9.field2860 != null) {
                                    class1 var132 = new class1();
                                    var132.field3 = var9;
                                    var132.field12 = var9.field2860;
                                    field467.method3553(var132);
                                }
                                if (field475 > var9.field2883 && var9.field2782 != null) {
                                    class1 var133 = new class1();
                                    var133.field3 = var9;
                                    var133.field12 = var9.field2782;
                                    field467.method3553(var133);
                                }
                                if (field474 > var9.field2883 && var9.field2866 != null) {
                                    class1 var134 = new class1();
                                    var134.field3 = var9;
                                    var134.field12 = var9.field2866;
                                    field467.method3553(var134);
                                }
                                if (field365 > var9.field2883 && var9.field2754 != null) {
                                    class1 var135 = new class1();
                                    var135.field3 = var9;
                                    var135.field12 = var9.field2754;
                                    field467.method3553(var135);
                                }
                                if (field547 > var9.field2883 && var9.field2772 != null) {
                                    class1 var136 = new class1();
                                    var136.field3 = var9;
                                    var136.field12 = var9.field2772;
                                    field467.method3553(var136);
                                }
                                var9.field2883 = field464;
                                if (var9.field2870 != null) {
                                    for (int var137 = 0; var137 < field521; var137++) {
                                        class1 var138 = new class1();
                                        var138.field3 = var9;
                                        var138.field8 = field504[var137];
                                        var138.field17 = field307[var137];
                                        var138.field12 = var9.field2870;
                                        field467.method3553(var138);
                                    }
                                }
                            }
                        }
                        if (!var9.field2810 && field452 == null && Statics.field2171 == null && !field332) {
                            if ((var9.field2871 >= 0 || var9.field2783 != 0) && class141.field2141 >= var12 && class141.field2142 * 20354633 >= var13 && class141.field2141 < var14 && class141.field2142 * 20354633 < var15) {
                                if (var9.field2871 >= 0) {
                                    Statics.field139 = arg0[var9.field2871];
                                } else {
                                    Statics.field139 = var9;
                                }
                            }
                            if (var9.field2758 == 8 && class141.field2141 >= var12 && class141.field2142 * 20354633 >= var13 && class141.field2141 < var14 && class141.field2142 * 20354633 < var15) {
                                Statics.field1650 = var9;
                            }
                            if (var9.field2780 > var9.field2835) {
                                method97(var9, var9.field2771 + var10, var11, var9.field2835, var9.field2780, class141.field2141, class141.field2142 * 20354633);
                            }
                        }
                    } else if ((field515 == 0 || field515 == 3) && (class141.field2147 == 1 || !Statics.field67 && class141.field2147 == 4)) {
                        class176 var61 = var9.method3140(true);
                        if (var61 != null) {
                            int var62 = class141.field2136 - var10;
                            int var63 = class141.field2149 - var11;
                            if (var61.method3185(var62, var63)) {
                                int var64 = var62 - var61.field2900 / 2;
                                int var65 = var63 - var61.field2898 / 2;
                                int var66 = field369 + field351 & 0x7FF;
                                int var67 = class92.field1569[var66];
                                int var68 = class92.field1555[var66];
                                int var69 = (field353 + 256) * var67 >> 8;
                                int var70 = (field353 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field573.field805 + var71 >> 7;
                                int var74 = Statics.field573.field815 - var72 >> 7;
                                field322.method2594(42);
                                field322.method2397(18);
                                field322.method2397(class138.field2104[82] ? (class138.field2104[81] ? 2 : 1) : 0);
                                field322.method2388(Statics.field129 + var74);
                                field322.method2380(Statics.field1440 + var73);
                                field322.method2397(var64);
                                field322.method2397(var65);
                                field322.method2545(field369);
                                field322.method2397(57);
                                field322.method2397(field351);
                                field322.method2397(field353);
                                field322.method2397(89);
                                field322.method2545(Statics.field573.field805);
                                field322.method2545(Statics.field573.field815);
                                field322.method2397(63);
                                field433 = var73;
                                field514 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.cp(III)V")
    public static final void method131(int arg0, int arg1) {
        if (class174.method2294(arg0)) {
            method101(Statics.field2838[arg0], arg1);
        }
    }

    @ObfuscatedName("g.ct([Lfg;II)V")
    public static final void method101(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2758 == 0) {
                    if (var3.field2880 != null) {
                        method101(var3.field2880, arg1);
                    }
                    class4 var4 = (class4) field440.method3507((long) var3.field2795);
                    if (var4 != null) {
                        method131(var4.field70, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2863 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field12 = var3.field2863;
                    class37.method2036(var5);
                }
                if (arg1 == 1 && var3.field2745 != null) {
                    if (var3.field2817 >= 0) {
                        class174 var6 = class174.method2906(var3.field2795);
                        if (var6 == null || var6.field2880 == null || var3.field2817 >= var6.field2880.length || var6.field2880[var3.field2817] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field12 = var3.field2745;
                    class37.method2036(var7);
                }
            }
        }
    }

    @ObfuscatedName("ff.cy(Lfg;III)V")
    public static final void method2939(class174 arg0, int arg1, int arg2) {
        if (field452 != null || field332 || arg0 == null || method2933(arg0) == null) {
            return;
        }
        field452 = arg0;
        field453 = method2933(arg0);
        field454 = arg1;
        field518 = arg2;
        Statics.field140 = 0;
        field463 = false;
        if (field421 > 0) {
            method170(field421 - 1);
        }
    }

    @ObfuscatedName("bj.cl(I)V")
    public static final void method1056() {
        method130(field452);
        Statics.field140++;
        if (field460 && field510) {
            int var0 = class141.field2141;
            int var1 = class141.field2142 * 20354633;
            int var2 = var0 - field454;
            int var3 = var1 - field518;
            if (var2 < field528) {
                var2 = field528;
            }
            if (field452.field2771 + var2 > field528 + field453.field2771) {
                var2 = field528 + field453.field2771 - field452.field2771;
            }
            if (var3 < field459) {
                var3 = field459;
            }
            if (field452.field2835 + var3 > field459 + field453.field2835) {
                var3 = field459 + field453.field2835 - field452.field2835;
            }
            int var4 = var2 - field461;
            int var5 = var3 - field295;
            int var6 = field452.field2855;
            if (Statics.field140 > field452.field2756 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field463 = true;
            }
            int var7 = field453.field2777 + (var2 - field528);
            int var8 = field453.field2816 + (var3 - field459);
            if (field452.field2845 != null && field463) {
                class1 var9 = new class1();
                var9.field3 = field452;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field12 = field452.field2845;
                class37.method2036(var9);
            }
            if (class141.field2137 == 0) {
                if (field463) {
                    if (field452.field2872 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field452;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field456;
                        var10.field12 = field452.field2872;
                        class37.method2036(var10);
                    }
                    if (field456 != null && method2696(field452) != null) {
                        field322.method2594(141);
                        field322.method2395(field456.field2795);
                        field322.method2449(field452.field2795);
                        field322.method2388(field452.field2817);
                        field322.method2388(field452.field2823);
                        field322.method2545(field456.field2817);
                        field322.method2380(field456.field2823);
                    }
                } else {
                    label99: {
                        label72: {
                            if (field418 != 1) {
                                int var11 = field421 - 1;
                                boolean var12;
                                if (var11 < 0) {
                                    var12 = false;
                                } else {
                                    int var13 = field302[var11];
                                    if (var13 >= 2000) {
                                        var13 -= 2000;
                                    }
                                    if (var13 == 1007) {
                                        var12 = true;
                                    } else {
                                        var12 = false;
                                    }
                                }
                                if (!var12) {
                                    break label72;
                                }
                            }
                            if (field421 > 2) {
                                method1762(field461 + field454, field518 + field295);
                                break label99;
                            }
                        }
                        if (field421 > 0) {
                            int var14 = field461 + field454;
                            int var15 = field518 + field295;
                            method920(Statics.field2911, var14, var15);
                            Statics.field2911 = null;
                        }
                    }
                }
                field452 = null;
            }
        } else if (Statics.field140 > 1) {
            field452 = null;
        }
    }

    @ObfuscatedName("l.dk(IB)V")
    public static void method170(int arg0) {
        Statics.field2911 = new class31();
        Statics.field2911.field691 = field495[arg0];
        Statics.field2911.field683 = field423[arg0];
        Statics.field2911.field684 = field302[arg0];
        Statics.field2911.field685 = field392[arg0];
        Statics.field2911.field682 = field426[arg0];
    }

    @ObfuscatedName("k.dy(Lfg;I)V")
    public static void method130(class174 arg0) {
        if (field380 == arg0.field2862) {
            field484[arg0.field2757] = true;
        }
    }

    @ObfuscatedName("i.dj(I)V")
    public static void method158() {
        for (class4 var0 = (class4) field440.method3513(); var0 != null; var0 = (class4) field440.method3510()) {
            int var1 = var0.field70;
            if (class174.method2294(var1)) {
                boolean var2 = true;
                class174[] var3 = Statics.field2838[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2810;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3116;
                    class174 var6 = class174.method2906(var5);
                    if (var6 != null) {
                        method130(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.dv(Lfg;I)Lfg;")
    public static class174 method2933(class174 arg0) {
        class174 var1 = method2696(arg0);
        if (var1 == null) {
            var1 = arg0.field2831;
        }
        return var1;
    }

    @ObfuscatedName("k.db([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method127(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("v.dn(IB)V")
    public static final void method617(int arg0) {
        if (!class174.method2294(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2838[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2750 = 0;
                var3.field2869 = 0;
            }
        }
    }

    @ObfuscatedName("i.do([Lfg;II)V")
    public static final void method157(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2775 == arg1 && (!var3.field2810 || !method572(var3))) {
                if (var3.field2758 == 0) {
                    if (!var3.field2810 && method572(var3) && Statics.field139 != var3) {
                        continue;
                    }
                    method157(arg0, var3.field2795);
                    if (var3.field2880 != null) {
                        method157(var3.field2880, var3.field2795);
                    }
                    class4 var4 = (class4) field440.method3507((long) var3.field2795);
                    if (var4 != null) {
                        int var5 = var4.field70;
                        if (class174.method2294(var5)) {
                            method157(Statics.field2838[var5], -1);
                        }
                    }
                }
                if (var3.field2758 == 6) {
                    if (var3.field2846 != -1 || var3.field2878 != -1) {
                        boolean var6 = method2155(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2878;
                        } else {
                            var7 = var3.field2846;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method949(var7);
                            var3.field2869 += field356;
                            while (var3.field2869 > var8.field969[var3.field2750]) {
                                var3.field2869 -= var8.field969[var3.field2750];
                                var3.field2750++;
                                if (var3.field2750 >= var8.field976.length) {
                                    var3.field2750 -= var8.field966;
                                    if (var3.field2750 < 0 || var3.field2750 >= var8.field976.length) {
                                        var3.field2750 = 0;
                                    }
                                }
                                method130(var3);
                            }
                        }
                    }
                    if (var3.field2812 != 0 && !var3.field2810) {
                        int var9 = var3.field2812 >> 16;
                        int var10 = var3.field2812 << 16 >> 16;
                        int var11 = field356 * var9;
                        int var12 = field356 * var10;
                        var3.field2766 = var3.field2766 + var11 & 0x7FF;
                        var3.field2808 = var3.field2808 + var12 & 0x7FF;
                        method130(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.du(II)V")
    public static final void method987(int arg0) {
        method158();
        for (class24 var1 = (class24) class24.field602.method3544(); var1 != null; var1 = (class24) class24.field602.method3546()) {
            if (var1.field603 != null) {
                var1.method580();
            }
        }
        int var2 = class53.method710(arg0).field1141;
        if (var2 == 0) {
            return;
        }
        int var3 = class177.field2904[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class92.method1962(0.9D);
                ((class96) Statics.field1570).method2040(0.9D);
            }
            if (var3 == 2) {
                class92.method1962(0.8D);
                ((class96) Statics.field1570).method2040(0.8D);
            }
            if (var3 == 3) {
                class92.method1962(0.7D);
                ((class96) Statics.field1570).method2040(0.7D);
            }
            if (var3 == 4) {
                class92.method1962(0.6D);
                ((class96) Statics.field1570).method2040(0.6D);
            }
            class52.method879();
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
            if (field516 != var4) {
                if (field516 == 0 && field517 != -1) {
                    class184.method2060(Statics.field612, field517, 0, var4, false);
                    field428 = false;
                } else if (var4 == 0) {
                    class184.method760();
                    field428 = false;
                } else if (class184.field2959 == 0) {
                    Statics.field2958.method3347(var4);
                } else {
                    Statics.field1612 = var4;
                }
                field516 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field397 = 127;
            }
            if (var3 == 1) {
                field397 = 96;
            }
            if (var3 == 2) {
                field397 = 64;
            }
            if (var3 == 3) {
                field397 = 32;
            }
            if (var3 == 4) {
                field397 = 0;
            }
        }
        if (var2 == 5) {
            field418 = var3;
        }
        if (var2 == 6) {
            field441 = var3;
        }
        if (var2 == 9) {
            field442 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field520 = 127;
            }
            if (var3 == 1) {
                field520 = 96;
            }
            if (var3 == 2) {
                field520 = 64;
            }
            if (var3 == 3) {
                field520 = 32;
            }
            if (var3 == 4) {
                field520 = 0;
            }
        }
        if (var2 == 17) {
            field328 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field455 = (class21) class110.method709(class21.method969(), var3);
            if (field455 == null) {
                field455 = class21.field565;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field410 = -1;
            } else {
                field410 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field489 = (class21) class110.method709(class21.method969(), var3);
            if (field489 == null) {
                field489 = class21.field565;
            }
        }
    }

    @ObfuscatedName("dj.dw(I)V")
    public static final void method2240() {
        field322.method2594(114);
        for (class4 var0 = (class4) field440.method3513(); var0 != null; var0 = (class4) field440.method3510()) {
            if (var0.field65 == 0 || var0.field65 == 3) {
                method2281(var0, true);
            }
        }
        if (field443 != null) {
            method130(field443);
            field443 = null;
        }
    }

    @ObfuscatedName("do.dg(Ls;ZB)V")
    public static final void method2281(class4 arg0, boolean arg1) {
        int var2 = arg0.field70;
        int var3 = (int) arg0.field3116;
        arg0.method3632();
        if (arg1 && var2 != -1 && Statics.field2746[var2]) {
            Statics.field2747.method3035(var2);
            if (Statics.field2838[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2838[var2].length; var5++) {
                    if (Statics.field2838[var2][var5] != null) {
                        if (Statics.field2838[var2][var5].field2758 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2838[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2838[var2] = null;
                }
                Statics.field2746[var2] = false;
            }
        }
        method1946(var2);
        class174 var6 = class174.method2906(var3);
        if (var6 != null) {
            method130(var6);
        }
        for (int var7 = 0; var7 < field421; var7++) {
            if (method42(field302[var7])) {
                if (var7 < field421 - 1) {
                    for (int var8 = var7; var8 < field421 - 1; var8++) {
                        field426[var8] = field426[var8 + 1];
                        field427[var8] = field427[var8 + 1];
                        field302[var8] = field302[var8 + 1];
                        field392[var8] = field392[var8 + 1];
                        field495[var8] = field495[var8 + 1];
                        field423[var8] = field423[var8 + 1];
                    }
                }
                field421--;
            }
        }
        if (field439 != -1) {
            method131(field439, 1);
        }
    }

    @ObfuscatedName("gl.di(Lfg;I)Z")
    public static final boolean method3450(class174 arg0) {
        int var1 = arg0.field2834;
        if (var1 == 205) {
            field473 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field552.method3231(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field552.method3224(var4, var5 == 1);
        }
        if (var1 == 324) {
            field552.method3247(false);
        }
        if (var1 == 325) {
            field552.method3247(true);
        }
        if (var1 == 326) {
            field322.method2594(192);
            field552.method3255(field322);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cy.dt(IIIILcb;Lfn;I)V")
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2925(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field369 + field351 & 0x7FF;
        int var8 = class92.field1569[var7];
        int var9 = class92.field1555[var7];
        int var10 = var8 * 256 / (field353 + 256);
        int var11 = var9 * 256 / (field353 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2597.method1598(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("eo.da(IIIILcb;Lfn;I)V")
    public static final void method2925(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field369 + field351 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1569[var6];
        int var9 = class92.field1555[var6];
        int var10 = var8 * 256 / (field353 + 256);
        int var11 = var9 * 256 / (field353 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1596(arg5.field2900 / 2 + var12 - arg4.field1373 / 2, arg5.field2898 / 2 - var13 - arg4.field1377 / 2, arg0, arg1, arg5.field2900, arg5.field2898, arg5.field2899, arg5.field2897);
        } else {
            arg4.method1583(arg5.field2900 / 2 + arg0 + var12 - arg4.field1373 / 2, arg5.field2898 / 2 + arg1 - var13 - arg4.field1377 / 2);
        }
    }

    @ObfuscatedName("k.dz(Ljava/lang/String;ZI)Z")
    public static boolean method125(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class165.method2605(arg0, Statics.field284);
        for (int var3 = 0; var3 < field546; var3++) {
            if (var2.equalsIgnoreCase(class165.method2605(field548[var3].field248, Statics.field284)) && (!arg1 || field548[var3].field243 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class165.method2605(Statics.field573.field46, Statics.field284))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fk.dh(Ljava/lang/String;I)Z")
    public static boolean method3002(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method2605(arg0, Statics.field284);
        for (int var2 = 0; var2 < field550; var2++) {
            class8 var3 = field551[var2];
            if (var1.equalsIgnoreCase(class165.method2605(var3.field142, Statics.field284))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method2605(var3.field136, Statics.field284))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("eg.dq(Ljava/lang/String;S)V")
    public static final void method2800(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method2605(arg0, Statics.field284);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field550; var2++) {
            class8 var3 = field551[var2];
            String var4 = var3.field142;
            String var5 = class165.method2605(var4, Statics.field284);
            if (class130.method2934(arg0, var1, var4, var5)) {
                field550--;
                for (int var6 = var2; var6 < field550; var6++) {
                    field551[var6] = field551[var6 + 1];
                }
                field472 = field464;
                field322.method2594(206);
                field322.method2397(class120.method957(arg0));
                field322.method2346(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("client.dl(Ljava/lang/String;IB)V")
    public static final void method477(String arg0, int arg1) {
        field322.method2594(176);
        field322.method2397(class120.method957(arg0) + 1);
        field322.method2387(arg1);
        field322.method2346(arg0);
    }

    @ObfuscatedName("r.ds(Ljava/lang/String;I)V")
    public static final void method120(String arg0) {
        if (!arg0.equals("")) {
            field322.method2594(19);
            field322.method2397(class120.method957(arg0));
            field322.method2346(arg0);
        }
    }

    @ObfuscatedName("al.dm(I)V")
    public static final void method977() {
        field322.method2594(19);
        field322.method2397(0);
    }

    @ObfuscatedName("cm.dc(IB)V")
    public static void method1946(int arg0) {
        for (class202 var1 = (class202) field481.method3513(); var1 != null; var1 = (class202) field481.method3510()) {
            if ((var1.field3116 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3632();
            }
        }
    }

    @ObfuscatedName("bp.dx(Lfg;I)I")
    public static int method1530(class174 arg0) {
        class202 var1 = (class202) field481.method3507(((long) arg0.field2795 << 32) + (long) arg0.field2817);
        return var1 == null ? arg0.field2828 : var1.field3102;
    }

    @ObfuscatedName("et.dr(Lfg;I)Lfg;")
    public static class174 method2696(class174 arg0) {
        int var1 = method1530(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class174.method2906(arg0.field2775);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("u.df(Lfg;I)Z")
    public static boolean method572(class174 arg0) {
        if (field449) {
            if (method1530(arg0) != 0) {
                return false;
            }
            if (arg0.field2758 == 0) {
                return false;
            }
        }
        return arg0.field2776;
    }

    @ObfuscatedName("cu.dp(Lfg;II)Ljava/lang/String;")
    public static String method2035(class174 arg0, int arg1) {
        if (!class179.method164(method1530(arg0), arg1) && arg0.field2856 == null) {
            return null;
        } else if (arg0.field2830 == null || arg0.field2830.length <= arg1 || arg0.field2830[arg1] == null || arg0.field2830[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2830[arg1];
        }
    }

    @ObfuscatedName("ci.de(Lfg;I)Ljava/lang/String;")
    public static String method1775(class174 arg0) {
        if (class179.method3122(method1530(arg0)) == 0) {
            return null;
        } else if (arg0.field2813 == null || arg0.field2813.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2813;
        }
    }

    @ObfuscatedName("af.eu(Ljava/lang/String;ZI)V")
    public static void method729(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1127; var5++) {
            class52 var6 = class52.method696(var5);
            if ((!arg1 || var6.field1105) && var6.field1123 == -1 && var6.field1092.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field230 = -1;
                    Statics.field1995 = null;
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
        Statics.field1995 = var3;
        Statics.field854 = 0;
        Statics.field230 = var4;
        String[] var9 = new String[Statics.field230];
        for (int var10 = 0; var10 < Statics.field230; var10++) {
            var9[var10] = class52.method696(var3[var10]).field1092;
        }
        short[] var11 = Statics.field1995;
        class125.method163(var9, var11, 0, var9.length - 1);
    }
}

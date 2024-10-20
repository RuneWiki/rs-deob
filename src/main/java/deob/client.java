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

    @ObfuscatedName("client.v")
    public static boolean field312 = true;

    @ObfuscatedName("client.o")
    public static int field262 = 1;

    @ObfuscatedName("client.k")
    public static int field331 = 0;

    @ObfuscatedName("client.i")
    public static int field264 = 0;

    @ObfuscatedName("client.p")
    public static boolean field458 = false;

    @ObfuscatedName("client.r")
    public static boolean field267 = false;

    @ObfuscatedName("client.j")
    public static int field268 = 0;

    @ObfuscatedName("client.q")
    public static int field270 = 0;

    @ObfuscatedName("client.n")
    public static boolean field474 = true;

    @ObfuscatedName("client.h")
    public static int field316 = 0;

    @ObfuscatedName("client.d")
    public static long field395 = -1L;

    @ObfuscatedName("client.w")
    public static class198[] field322 = new class198[4];

    @ObfuscatedName("client.z")
    public static int field275 = -1;

    @ObfuscatedName("client.e")
    public static int field276 = -1;

    @ObfuscatedName("client.a")
    public static int field520 = -1;

    @ObfuscatedName("client.f")
    public static boolean field500 = true;

    @ObfuscatedName("client.u")
    public static boolean field279 = false;

    @ObfuscatedName("client.ab")
    public static int field280 = 0;

    @ObfuscatedName("client.ai")
    public static int field281 = 0;

    @ObfuscatedName("client.aj")
    public static int field282 = 0;

    @ObfuscatedName("client.as")
    public static int field452 = 0;

    @ObfuscatedName("client.ax")
    public static int field430 = 0;

    @ObfuscatedName("client.ac")
    public static int field428 = 0;

    @ObfuscatedName("client.az")
    public static int field286 = 0;

    @ObfuscatedName("client.au")
    public static int field287 = 0;

    @ObfuscatedName("client.av")
    public static int field288 = 0;

    @ObfuscatedName("client.am")
    public static class107 field289 = new class107(new byte[5000]);

    @ObfuscatedName("client.ay")
    public static class18 field362 = class18.field523;

    @ObfuscatedName("client.ak")
    public static int field423 = 0;

    @ObfuscatedName("client.aw")
    public static int field353 = 0;

    @ObfuscatedName("client.ah")
    public static int field293 = 0;

    @ObfuscatedName("client.bt")
    public static int field294 = 0;

    @ObfuscatedName("client.bw")
    public static int field459 = 0;

    @ObfuscatedName("client.bv")
    public static int field296 = 0;

    @ObfuscatedName("client.by")
    public static int field297 = 0;

    @ObfuscatedName("client.bi")
    public static int field298 = 0;

    @ObfuscatedName("client.bo")
    public static class30[] field300 = new class30[32768];

    @ObfuscatedName("client.bh")
    public static int field403 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field302 = new int[32768];

    @ObfuscatedName("client.ce")
    public static class110 field304 = new class110(5000);

    @ObfuscatedName("client.co")
    public static class110 field470 = new class110(5000);

    @ObfuscatedName("client.cf")
    public static class110 field306 = new class110(5000);

    @ObfuscatedName("client.cm")
    public static int field307 = 0;

    @ObfuscatedName("client.cj")
    public static int field308 = 0;

    @ObfuscatedName("client.cu")
    public static int field309 = 0;

    @ObfuscatedName("client.ci")
    public static int field310 = 0;

    @ObfuscatedName("client.cw")
    public static int field311 = 0;

    @ObfuscatedName("client.cr")
    public static int field481 = 0;

    @ObfuscatedName("client.cl")
    public static int field354 = 0;

    @ObfuscatedName("client.cy")
    public static int field314 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field455 = false;

    @ObfuscatedName("client.cv")
    public static int field397 = 0;

    @ObfuscatedName("client.cx")
    public static int field367 = 0;

    @ObfuscatedName("client.dr")
    public static int field291 = 1;

    @ObfuscatedName("client.dc")
    public static int field272 = 0;

    @ObfuscatedName("client.de")
    public static int field320 = 1;

    @ObfuscatedName("client.dv")
    public static int field321 = 0;

    @ObfuscatedName("client.db")
    public static boolean field356 = false;

    @ObfuscatedName("client.du")
    public static int[][][] field324 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field325 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ds")
    public static int field366 = 0;

    @ObfuscatedName("client.df")
    public static int field327 = 2;

    @ObfuscatedName("client.dd")
    public static int field496 = 0;

    @ObfuscatedName("client.dh")
    public static int field329 = 2;

    @ObfuscatedName("client.dz")
    public static int field330 = 0;

    @ObfuscatedName("client.dy")
    public static int field420 = 1;

    @ObfuscatedName("client.dj")
    public static int field439 = 0;

    @ObfuscatedName("client.dn")
    public static int field333 = 0;

    @ObfuscatedName("client.dm")
    public static int field319 = 2;

    @ObfuscatedName("client.dt")
    public static int field335 = 0;

    @ObfuscatedName("client.eq")
    public static int field336 = 1;

    @ObfuscatedName("client.ee")
    public static int field383 = 0;

    @ObfuscatedName("client.eg")
    public static int field338 = 0;

    @ObfuscatedName("client.ev")
    public static int field339 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field443 = 5063219;

    @ObfuscatedName("client.eu")
    public static int field341 = 3353893;

    @ObfuscatedName("client.ea")
    public static int field357 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field343 = false;

    @ObfuscatedName("client.fu")
    public static int field344 = 0;

    @ObfuscatedName("client.fo")
    public static int field346 = 128;

    @ObfuscatedName("client.fs")
    public static int field347 = 0;

    @ObfuscatedName("client.fx")
    public static int field348 = 0;

    @ObfuscatedName("client.fv")
    public static int field466 = 0;

    @ObfuscatedName("client.fd")
    public static int field350 = 0;

    @ObfuscatedName("client.fy")
    public static int field351 = 0;

    @ObfuscatedName("client.fq")
    public static int field352 = 0;

    @ObfuscatedName("client.fr")
    public static boolean field285 = false;

    @ObfuscatedName("client.fz")
    public static int field292 = 0;

    @ObfuscatedName("client.fh")
    public static int field373 = 0;

    @ObfuscatedName("client.ft")
    public static int field266 = 50;

    @ObfuscatedName("client.fm")
    public static int[] field446 = new int[field266];

    @ObfuscatedName("client.fg")
    public static int[] field358 = new int[field266];

    @ObfuscatedName("client.fc")
    public static int[] field480 = new int[field266];

    @ObfuscatedName("client.fe")
    public static int[] field360 = new int[field266];

    @ObfuscatedName("client.fi")
    public static int[] field361 = new int[field266];

    @ObfuscatedName("client.fk")
    public static int[] field370 = new int[field266];

    @ObfuscatedName("client.fp")
    public static int[] field363 = new int[field266];

    @ObfuscatedName("client.gk")
    public static String[] field315 = new String[field266];

    @ObfuscatedName("client.ge")
    public static int[][] field365 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field382 = 0;

    @ObfuscatedName("client.gw")
    public static int field284 = -1;

    @ObfuscatedName("client.gz")
    public static int field368 = -1;

    @ObfuscatedName("client.gm")
    public static int field369 = 0;

    @ObfuscatedName("client.gu")
    public static int field317 = 0;

    @ObfuscatedName("client.gq")
    public static int field371 = 0;

    @ObfuscatedName("client.ga")
    public static int field372 = 0;

    @ObfuscatedName("client.gp")
    public static int field283 = 0;

    @ObfuscatedName("client.gn")
    public static int field374 = 0;

    @ObfuscatedName("client.gc")
    public static int field349 = 0;

    @ObfuscatedName("client.go")
    public static int field376 = 0;

    @ObfuscatedName("client.gt")
    public static int field377 = 0;

    @ObfuscatedName("client.gx")
    public static int field378 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field334 = false;

    @ObfuscatedName("client.gh")
    public static int field380 = 0;

    @ObfuscatedName("client.gi")
    public static int field381 = 0;

    @ObfuscatedName("client.gr")
    public static class3[] field337 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field405 = 0;

    @ObfuscatedName("client.gs")
    public static int[] field384 = new int[2048];

    @ObfuscatedName("client.hb")
    public static int field512 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field386 = new int[2048];

    @ObfuscatedName("client.hi")
    public static class107[] field387 = new class107[2048];

    @ObfuscatedName("client.hq")
    public static int field388 = -1;

    @ObfuscatedName("client.hv")
    public static int field389 = 0;

    @ObfuscatedName("client.ha")
    public static int field390 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field277 = new int[1000];

    @ObfuscatedName("client.hm")
    public static final int[] field392 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hf")
    public static String[] field393 = new String[8];

    @ObfuscatedName("client.hu")
    public static boolean[] field394 = new boolean[8];

    @ObfuscatedName("client.he")
    public static int[] field290 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static int field396 = -1;

    @ObfuscatedName("client.hj")
    public static class178[][][] field332 = new class178[4][104][104];

    @ObfuscatedName("client.ht")
    public static class178 field398 = new class178();

    @ObfuscatedName("client.hx")
    public static class178 field399 = new class178();

    @ObfuscatedName("client.hg")
    public static class178 field400 = new class178();

    @ObfuscatedName("client.hy")
    public static int[] field401 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field402 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field492 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field404 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field305 = false;

    @ObfuscatedName("client.im")
    public static int field406 = 0;

    @ObfuscatedName("client.il")
    public static int[] field301 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field408 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field409 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field410 = new int[500];

    @ObfuscatedName("client.is")
    public static String[] field411 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field412 = new String[500];

    @ObfuscatedName("client.io")
    public static int field413 = -1;

    @ObfuscatedName("client.iw")
    public static int field414 = -1;

    @ObfuscatedName("client.ir")
    public static int field415 = 0;

    @ObfuscatedName("client.ij")
    public static int field416 = 50;

    @ObfuscatedName("client.in")
    public static int field469 = 0;

    @ObfuscatedName("client.it")
    public static String field418 = null;

    @ObfuscatedName("client.ic")
    public static boolean field419 = false;

    @ObfuscatedName("client.ie")
    public static int field417 = -1;

    @ObfuscatedName("client.iq")
    public static int field421 = -1;

    @ObfuscatedName("client.js")
    public static String field422 = null;

    @ObfuscatedName("client.je")
    public static String field515 = null;

    @ObfuscatedName("client.jw")
    public static int field424 = -1;

    @ObfuscatedName("client.jo")
    public static class175 field385 = new class175(8);

    @ObfuscatedName("client.jl")
    public static int field426 = 0;

    @ObfuscatedName("client.ji")
    public static int field427 = 0;

    @ObfuscatedName("client.ja")
    public static class153 field463 = null;

    @ObfuscatedName("client.jk")
    public static int field429 = 0;

    @ObfuscatedName("client.jv")
    public static int field431 = 0;

    @ObfuscatedName("client.jd")
    public static int field435 = 0;

    @ObfuscatedName("client.jt")
    public static int field432 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field433 = false;

    @ObfuscatedName("client.jb")
    public static boolean field425 = false;

    @ObfuscatedName("client.jq")
    public static boolean field323 = false;

    @ObfuscatedName("client.jf")
    public static class153 field436 = null;

    @ObfuscatedName("client.jx")
    public static class153 field437 = null;

    @ObfuscatedName("client.ju")
    public static int field438 = 0;

    @ObfuscatedName("client.jj")
    public static int field498 = 0;

    @ObfuscatedName("client.jz")
    public static class153 field453 = null;

    @ObfuscatedName("client.jc")
    public static boolean field441 = false;

    @ObfuscatedName("client.jy")
    public static int field442 = -1;

    @ObfuscatedName("client.jr")
    public static int field259 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field444 = false;

    @ObfuscatedName("client.jm")
    public static int field445 = -1;

    @ObfuscatedName("client.jg")
    public static int field263 = -1;

    @ObfuscatedName("client.ki")
    public static boolean field447 = false;

    @ObfuscatedName("client.kc")
    public static int field448 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field449 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field450 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field274 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field318 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field490 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field454 = 0;

    @ObfuscatedName("client.kd")
    public static int field503 = 0;

    @ObfuscatedName("client.ks")
    public static int field456 = 0;

    @ObfuscatedName("client.kv")
    public static int field440 = 0;

    @ObfuscatedName("client.kq")
    public static int field326 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field375 = new int[2000];

    @ObfuscatedName("client.ku")
    public static String[] field460 = new String[1000];

    @ObfuscatedName("client.kj")
    public static int field461 = 0;

    @ObfuscatedName("client.kn")
    public static class178 field462 = new class178();

    @ObfuscatedName("client.ko")
    public static class178 field488 = new class178();

    @ObfuscatedName("client.kf")
    public static class178 field464 = new class178();

    @ObfuscatedName("client.kt")
    public static class175 field465 = new class175(512);

    @ObfuscatedName("client.lz")
    public static int field355 = 0;

    @ObfuscatedName("client.ls")
    public static int field467 = -2;

    @ObfuscatedName("client.lg")
    public static boolean[] field468 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field313 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field359 = new boolean[100];

    @ObfuscatedName("client.li")
    public static int[] field471 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field473 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field379 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field475 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field476 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.la")
    public static int field477 = 0;

    @ObfuscatedName("client.lm")
    public static int field478 = 0;

    @ObfuscatedName("client.ly")
    public static long[] field479 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field407 = 0;

    @ObfuscatedName("client.lf")
    public static int field278 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field482 = new int[128];

    @ObfuscatedName("client.lc")
    public static int[] field483 = new int[128];

    @ObfuscatedName("client.lv")
    public static long field484 = -1L;

    @ObfuscatedName("client.lo")
    public static String field485 = null;

    @ObfuscatedName("client.lq")
    public static String field486 = null;

    @ObfuscatedName("client.mx")
    public static int field487 = -1;

    @ObfuscatedName("client.mc")
    public static int field501 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field489 = new int[1000];

    @ObfuscatedName("client.ml")
    public static int[] field261 = new int[1000];

    @ObfuscatedName("client.mu")
    public static class72[] field491 = new class72[1000];

    @ObfuscatedName("client.mn")
    public static int field364 = 0;

    @ObfuscatedName("client.mo")
    public static int field493 = 0;

    @ObfuscatedName("client.mb")
    public static int field494 = 0;

    @ObfuscatedName("client.ms")
    public static int field495 = 255;

    @ObfuscatedName("client.mz")
    public static int field451 = -1;

    @ObfuscatedName("client.md")
    public static boolean field497 = false;

    @ObfuscatedName("client.mq")
    public static int field434 = 127;

    @ObfuscatedName("client.mi")
    public static int field499 = 127;

    @ObfuscatedName("client.ni")
    public static int field295 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field271 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field502 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field391 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field504 = new int[50];

    @ObfuscatedName("client.nm")
    public static class52[] field505 = new class52[50];

    @ObfuscatedName("client.nr")
    public static boolean field506 = false;

    @ObfuscatedName("client.np")
    public static boolean[] field457 = new boolean[5];

    @ObfuscatedName("client.nz")
    public static int[] field508 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field510 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field273 = new int[5];

    @ObfuscatedName("client.nf")
    public static int field511 = 0;

    @ObfuscatedName("client.om")
    public static int field513 = 0;

    @ObfuscatedName("client.ob")
    public static class16[] field514 = new class16[400];

    @ObfuscatedName("client.oh")
    public static class174 field507 = new class174();

    @ObfuscatedName("client.od")
    public static int field516 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field517 = new class8[400];

    @ObfuscatedName("client.oc")
    public static class158 field518 = new class158();

    @ObfuscatedName("client.op")
    public static int field519 = -1;

    @ObfuscatedName("client.oa")
    public static int field269 = -1;

    @ObfuscatedName("client.v(I)V")
    public final void method165() {
    }

    public final void init() {
        if (!this.method2536()) {
            return;
        }
        class169[] var1 = class169.method3093();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class169 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2837);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2837)) {
                    case 1:
                        field264 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field331 = Integer.parseInt(var4);
                        break;
                    case 3:
                        field268 = Integer.parseInt(var4);
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 5:
                        field262 = Integer.parseInt(var4);
                        break;
                    case 6:
                        class140[] var5 = new class140[] { class140.field2139, class140.field2141, class140.field2140, class140.field2136, class140.field2138, class140.field2143 };
                        Statics.field265 = (class140) class99.method1567(var5, Integer.parseInt(var4));
                        if (Statics.field265 == class140.field2141) {
                            Statics.field70 = class191.field2907;
                        } else {
                            Statics.field70 = class191.field2905;
                        }
                    case 7:
                    default:
                        break;
                    case 8:
                        Statics.field342 = var4;
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                            field458 = true;
                        } else {
                            field458 = false;
                        }
                        break;
                    case 10:
                        Statics.field1249 = class139.method733(Integer.parseInt(var4));
                }
            }
        }
        method135();
        Statics.field1896 = this.getCodeBase().getHost();
        String var6 = Statics.field1249.field2131;
        byte var7 = 0;
        try {
            class136.method116("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class135.method1813((String) null, var9);
        }
        Statics.field260 = this;
        this.method2567(765, 503, 63);
    }

    @ObfuscatedName("c.k(I)V")
    public static final void method135() {
        class79.field1411 = false;
        field267 = false;
    }

    @ObfuscatedName("client.m(I)V")
    public final void method242() {
        Statics.field299 = field264 == 0 ? 43594 : field262 + 40000;
        Statics.field1968 = field264 == 0 ? 443 : field262 + 50000;
        Statics.field1914 = Statics.field299;
        Statics.field2691 = class154.field2677;
        Statics.field2695 = class154.field2670;
        Statics.field976 = class154.field2674;
        Statics.field1301 = class154.field2671;
        if (Statics.field1970.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1980[44] = 71;
            class124.field1980[45] = 26;
            class124.field1980[46] = 72;
            class124.field1980[47] = 73;
            class124.field1980[59] = 57;
            class124.field1980[61] = 27;
            class124.field1980[91] = 42;
            class124.field1980[92] = 74;
            class124.field1980[93] = 43;
            class124.field1980[192] = 28;
            class124.field1980[222] = 58;
            class124.field1980[520] = 59;
        } else {
            class124.field1980[186] = 57;
            class124.field1980[187] = 27;
            class124.field1980[188] = 71;
            class124.field1980[189] = 26;
            class124.field1980[190] = 72;
            class124.field1980[191] = 73;
            class124.field1980[192] = 58;
            class124.field1980[219] = 42;
            class124.field1980[220] = 74;
            class124.field1980[221] = 43;
            class124.field1980[222] = 59;
            class124.field1980[223] = 28;
        }
        class124.method496(Statics.field61);
        class127.method122(Statics.field61);
        Statics.field148 = class118.method461();
        if (Statics.field148 != null) {
            Statics.field148.method2368(Statics.field61);
        }
        Statics.field97 = new class121(255, class136.field2104, class136.field2105, 500000);
        class196 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = class136.method1840("", Statics.field265.field2142, false);
            byte[] var3 = new byte[(int) var1.method3403()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3399(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class107(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method3406();
            }
        } catch (Exception var9) {
        }
        Statics.field939 = var2;
        Statics.field2135 = this.getToolkit().getSystemClipboard();
        class125.method455(this, Statics.field698);
        if (field264 != 0) {
            field279 = true;
        }
    }

    @ObfuscatedName("client.i(I)V")
    public final void method168() {
        field316++;
        this.method171();
        class150.method2618();
        class162.method497();
        method491();
        class124 var1 = class124.field1985;
        synchronized (class124.field1985) {
            class124.field2000++;
            class124.field1997 = class124.field1977;
            class124.field1996 = 0;
            if (class124.field1992 >= 0) {
                while (class124.field1992 != class124.field1991) {
                    int var3 = class124.field1990[class124.field1991];
                    class124.field1991 = class124.field1991 + 1 & 0x7F;
                    if (var3 < 0) {
                        class124.field1994[~var3] = false;
                    } else {
                        if (!class124.field1994[var3] && class124.field1996 < class124.field1975.length - 1) {
                            class124.field1975[++class124.field1996 - 1] = var3;
                        }
                        class124.field1994[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class124.field1994[var2] = false;
                }
                class124.field1992 = class124.field1991;
            }
            class124.field1977 = class124.field1998;
        }
        class127 var5 = class127.field2037;
        synchronized (class127.field2037) {
            class127.field2022 = class127.field2024;
            class127.field2035 = class127.field2027;
            class127.field2029 = class127.field2026;
            class127.field2034 = class127.field2030;
            class127.field2028 = class127.field2031;
            class127.field2036 = class127.field2032;
            class127.field2025 = class127.field2033;
            class127.field2030 = 0;
        }
        if (Statics.field148 != null) {
            int var7 = Statics.field148.method2370();
            field461 = var7;
        }
        if (field270 == 0) {
            method2027();
            Statics.field143.method2394();
            for (int var8 = 0; var8 < 32; var8++) {
                field2073[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field2065[var9] = 0L;
            }
            Statics.field1917 = 0;
        } else if (field270 == 5) {
            class28.method1733(this);
            method2027();
            Statics.field143.method2394();
            for (int var10 = 0; var10 < 32; var10++) {
                field2073[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field2065[var11] = 0L;
            }
            Statics.field1917 = 0;
        } else if (field270 == 10 || field270 == 11) {
            class28.method1733(this);
        } else if (field270 == 20) {
            class28.method1733(this);
            method2023();
        } else if (field270 == 25) {
            method579(false);
            field367 = 0;
            boolean var12 = true;
            for (int var13 = 0; var13 < Statics.field2156.length; var13++) {
                if (Statics.field2503[var13] != -1 && Statics.field2156[var13] == null) {
                    Statics.field2156[var13] = Statics.field2038.method2703(Statics.field2503[var13], 0);
                    if (Statics.field2156[var13] == null) {
                        var12 = false;
                        field367++;
                    }
                }
                if (Statics.field1118[var13] != -1 && Statics.field1657[var13] == null) {
                    Statics.field1657[var13] = Statics.field2038.method2659(Statics.field1118[var13], 0, Statics.field2010[var13]);
                    if (Statics.field1657[var13] == null) {
                        var12 = false;
                        field367++;
                    }
                }
            }
            if (var12) {
                field272 = 0;
                boolean var14 = true;
                for (int var15 = 0; var15 < Statics.field2156.length; var15++) {
                    byte[] var16 = Statics.field1657[var15];
                    if (var16 != null) {
                        int var17 = (Statics.field1063[var15] >> 8) * 64 - Statics.field256;
                        int var18 = (Statics.field1063[var15] & 0xFF) * 64 - Statics.field879;
                        if (field356) {
                            var17 = 10;
                            var18 = 10;
                        }
                        var14 &= class6.method65(var16, var17, var18);
                    }
                }
                if (var14) {
                    if (field321 != 0) {
                        method2035(class143.field2395 + class2.field26 + class2.field25 + 100 + "%" + class2.field24, true);
                    }
                    method491();
                    method85();
                    method491();
                    Statics.field16.method1633();
                    method491();
                    System.gc();
                    for (int var19 = 0; var19 < 4; var19++) {
                        field322[var19].method3452();
                    }
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                class6.field80[var20][var21][var22] = 0;
                            }
                        }
                    }
                    method491();
                    class6.field75 = 99;
                    Statics.field76 = new byte[4][104][104];
                    Statics.field77 = new byte[4][104][104];
                    Statics.field78 = new byte[4][104][104];
                    Statics.field74 = new byte[4][104][104];
                    Statics.field676 = new int[4][105][105];
                    Statics.field580 = new byte[4][105][105];
                    Statics.field53 = new int[105][105];
                    Statics.field578 = new int[104];
                    Statics.field2970 = new int[104];
                    Statics.field1945 = new int[104];
                    Statics.field2782 = new int[104];
                    Statics.field1923 = new int[104];
                    int var23 = Statics.field2156.length;
                    class20.method1008();
                    method579(true);
                    if (!field356) {
                        int var24 = 0;
                        label1217: while (true) {
                            if (var24 >= var23) {
                                for (int var38 = 0; var38 < var23; var38++) {
                                    int var39 = (Statics.field1063[var38] >> 8) * 64 - Statics.field256;
                                    int var40 = (Statics.field1063[var38] & 0xFF) * 64 - Statics.field879;
                                    byte[] var41 = Statics.field2156[var38];
                                    if (var41 == null && Statics.field683 < 800) {
                                        method491();
                                        class6.method29(var39, var40, 64, 64);
                                    }
                                }
                                method579(true);
                                int var42 = 0;
                                while (true) {
                                    if (var42 >= var23) {
                                        break label1217;
                                    }
                                    byte[] var43 = Statics.field1657[var42];
                                    if (var43 != null) {
                                        int var44 = (Statics.field1063[var42] >> 8) * 64 - Statics.field256;
                                        int var45 = (Statics.field1063[var42] & 0xFF) * 64 - Statics.field879;
                                        method491();
                                        class6.method460(var43, var44, var45, Statics.field16, field322);
                                    }
                                    var42++;
                                }
                            }
                            int var25 = (Statics.field1063[var24] >> 8) * 64 - Statics.field256;
                            int var26 = (Statics.field1063[var24] & 0xFF) * 64 - Statics.field879;
                            byte[] var27 = Statics.field2156[var24];
                            if (var27 != null) {
                                method491();
                                int var28 = Statics.field195 * 8 - 48;
                                int var29 = Statics.field683 * 8 - 48;
                                class198[] var30 = field322;
                                int var31 = 0;
                                label1214: while (true) {
                                    if (var31 >= 4) {
                                        class107 var34 = new class107(var27);
                                        int var35 = 0;
                                        while (true) {
                                            if (var35 >= 4) {
                                                break label1214;
                                            }
                                            for (int var36 = 0; var36 < 64; var36++) {
                                                for (int var37 = 0; var37 < 64; var37++) {
                                                    class6.method737(var34, var35, var25 + var36, var26 + var37, var28, var29, 0);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                    for (int var32 = 0; var32 < 64; var32++) {
                                        for (int var33 = 0; var33 < 64; var33++) {
                                            if (var25 + var32 > 0 && var25 + var32 < 103 && var26 + var33 > 0 && var26 + var33 < 103) {
                                                var30[var31].field2961[var25 + var32][var26 + var33] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var31++;
                                }
                            }
                            var24++;
                        }
                    }
                    if (field356) {
                        int var46 = 0;
                        label1163: while (true) {
                            if (var46 >= 4) {
                                for (int var84 = 0; var84 < 13; var84++) {
                                    for (int var85 = 0; var85 < 13; var85++) {
                                        int var86 = field324[0][var84][var85];
                                        if (var86 == -1) {
                                            class6.method29(var84 * 8, var85 * 8, 8, 8);
                                        }
                                    }
                                }
                                method579(true);
                                int var87 = 0;
                                while (true) {
                                    if (var87 >= 4) {
                                        break label1163;
                                    }
                                    method491();
                                    for (int var88 = 0; var88 < 13; var88++) {
                                        label1052: for (int var89 = 0; var89 < 13; var89++) {
                                            int var90 = field324[var87][var88][var89];
                                            if (var90 != -1) {
                                                int var91 = var90 >> 24 & 0x3;
                                                int var92 = var90 >> 1 & 0x3;
                                                int var93 = var90 >> 14 & 0x3FF;
                                                int var94 = var90 >> 3 & 0x7FF;
                                                int var95 = (var93 / 8 << 8) + var94 / 8;
                                                for (int var96 = 0; var96 < Statics.field1063.length; var96++) {
                                                    if (Statics.field1063[var96] == var95 && Statics.field1657[var96] != null) {
                                                        byte[] var97 = Statics.field1657[var96];
                                                        int var98 = var88 * 8;
                                                        int var99 = var89 * 8;
                                                        int var100 = (var93 & 0x7) * 8;
                                                        int var101 = (var94 & 0x7) * 8;
                                                        class79 var102 = Statics.field16;
                                                        class198[] var103 = field322;
                                                        class107 var104 = new class107(var97);
                                                        int var105 = -1;
                                                        while (true) {
                                                            int var106 = var104.method2112();
                                                            if (var106 == 0) {
                                                                continue label1052;
                                                            }
                                                            var105 += var106;
                                                            int var107 = 0;
                                                            while (true) {
                                                                int var108 = var104.method2112();
                                                                if (var108 == 0) {
                                                                    break;
                                                                }
                                                                var107 += var108 - 1;
                                                                int var109 = var107 & 0x3F;
                                                                int var110 = var107 >> 6 & 0x3F;
                                                                int var111 = var107 >> 12;
                                                                int var112 = var104.method2116();
                                                                int var113 = var112 >> 2;
                                                                int var114 = var112 & 0x3;
                                                                if (var91 == var111 && var110 >= var100 && var110 < var100 + 8 && var109 >= var101 && var109 < var101 + 8) {
                                                                    class36 var115 = class36.method2624(var105);
                                                                    int var116 = var98 + class156.method2401(var110 & 0x7, var109 & 0x7, var92, var115.field843, var115.field844, var114);
                                                                    int var117 = var99 + class156.method2338(var110 & 0x7, var109 & 0x7, var92, var115.field843, var115.field844, var114);
                                                                    if (var116 > 0 && var117 > 0 && var116 < 103 && var117 < 103) {
                                                                        int var118 = var87;
                                                                        if ((class6.field80[1][var116][var117] & 0x2) == 2) {
                                                                            var118 = var87 - 1;
                                                                        }
                                                                        class198 var119 = null;
                                                                        if (var118 >= 0) {
                                                                            var119 = var103[var118];
                                                                        }
                                                                        class6.method2364(var87, var116, var117, var105, var92 + var114 & 0x3, var113, var102, var119);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var87++;
                                }
                            }
                            method491();
                            for (int var47 = 0; var47 < 13; var47++) {
                                for (int var48 = 0; var48 < 13; var48++) {
                                    boolean var49 = false;
                                    int var50 = field324[var46][var47][var48];
                                    if (var50 != -1) {
                                        int var51 = var50 >> 24 & 0x3;
                                        int var52 = var50 >> 1 & 0x3;
                                        int var53 = var50 >> 14 & 0x3FF;
                                        int var54 = var50 >> 3 & 0x7FF;
                                        int var55 = (var53 / 8 << 8) + var54 / 8;
                                        for (int var56 = 0; var56 < Statics.field1063.length; var56++) {
                                            if (Statics.field1063[var56] == var55 && Statics.field2156[var56] != null) {
                                                byte[] var57 = Statics.field2156[var56];
                                                int var58 = var47 * 8;
                                                int var59 = var48 * 8;
                                                int var60 = (var53 & 0x7) * 8;
                                                int var61 = (var54 & 0x7) * 8;
                                                class198[] var62 = field322;
                                                for (int var63 = 0; var63 < 8; var63++) {
                                                    for (int var64 = 0; var64 < 8; var64++) {
                                                        if (var58 + var63 > 0 && var58 + var63 < 103 && var59 + var64 > 0 && var59 + var64 < 103) {
                                                            var62[var46].field2961[var58 + var63][var59 + var64] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var65 = new class107(var57);
                                                for (int var66 = 0; var66 < 4; var66++) {
                                                    for (int var67 = 0; var67 < 64; var67++) {
                                                        for (int var68 = 0; var68 < 64; var68++) {
                                                            if (var51 == var66 && var67 >= var60 && var67 < var60 + 8 && var68 >= var61 && var68 < var61 + 8) {
                                                                int var72 = var67 & 0x7;
                                                                int var73 = var68 & 0x7;
                                                                int var75 = var52 & 0x3;
                                                                int var76;
                                                                if (var75 == 0) {
                                                                    var76 = var72;
                                                                } else if (var75 == 1) {
                                                                    var76 = var73;
                                                                } else if (var75 == 2) {
                                                                    var76 = 7 - var72;
                                                                } else {
                                                                    var76 = 7 - var73;
                                                                }
                                                                class6.method737(var65, var46, var58 + var76, var59 + class156.method2653(var67 & 0x7, var68 & 0x7, var52), 0, 0, var52);
                                                            } else {
                                                                class6.method737(var65, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var49 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var49) {
                                        int var77 = var46;
                                        int var78 = var47 * 8;
                                        int var79 = var48 * 8;
                                        for (int var80 = 0; var80 < 8; var80++) {
                                            for (int var81 = 0; var81 < 8; var81++) {
                                                class6.field93[var77][var78 + var80][var79 + var81] = 0;
                                            }
                                        }
                                        if (var78 > 0) {
                                            for (int var82 = 1; var82 < 8; var82++) {
                                                class6.field93[var77][var78][var79 + var82] = class6.field93[var77][var78 - 1][var79 + var82];
                                            }
                                        }
                                        if (var79 > 0) {
                                            for (int var83 = 1; var83 < 8; var83++) {
                                                class6.field93[var77][var78 + var83][var79] = class6.field93[var77][var78 + var83][var79 - 1];
                                            }
                                        }
                                        if (var78 > 0 && class6.field93[var77][var78 - 1][var79] != 0) {
                                            class6.field93[var77][var78][var79] = class6.field93[var77][var78 - 1][var79];
                                        } else if (var79 > 0 && class6.field93[var77][var78][var79 - 1] != 0) {
                                            class6.field93[var77][var78][var79] = class6.field93[var77][var78][var79 - 1];
                                        } else if (var78 > 0 && var79 > 0 && class6.field93[var77][var78 - 1][var79 - 1] != 0) {
                                            class6.field93[var77][var78][var79] = class6.field93[var77][var78 - 1][var79 - 1];
                                        }
                                    }
                                }
                            }
                            var46++;
                        }
                    }
                    method579(true);
                    method85();
                    method491();
                    class79 var120 = Statics.field16;
                    class198[] var121 = field322;
                    for (int var122 = 0; var122 < 4; var122++) {
                        for (int var123 = 0; var123 < 104; var123++) {
                            for (int var124 = 0; var124 < 104; var124++) {
                                if ((class6.field80[var122][var123][var124] & 0x1) == 1) {
                                    int var125 = var122;
                                    if ((class6.field80[1][var123][var124] & 0x2) == 2) {
                                        var125 = var122 - 1;
                                    }
                                    if (var125 >= 0) {
                                        var121[var125].method3477(var123, var124);
                                    }
                                }
                            }
                        }
                    }
                    class6.field87 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field87 < -8) {
                        class6.field87 = -8;
                    }
                    if (class6.field87 > 8) {
                        class6.field87 = 8;
                    }
                    class6.field83 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field83 < -16) {
                        class6.field83 = -16;
                    }
                    if (class6.field83 > 16) {
                        class6.field83 = 16;
                    }
                    for (int var126 = 0; var126 < 4; var126++) {
                        byte[][] var127 = Statics.field580[var126];
                        int var128 = (int) Math.sqrt(5100.0D);
                        int var129 = var128 * 768 >> 8;
                        for (int var130 = 1; var130 < 103; var130++) {
                            for (int var131 = 1; var131 < 103; var131++) {
                                int var132 = class6.field93[var126][var131 + 1][var130] - class6.field93[var126][var131 - 1][var130];
                                int var133 = class6.field93[var126][var131][var130 + 1] - class6.field93[var126][var131][var130 - 1];
                                int var134 = (int) Math.sqrt((double) (var133 * var133 + var132 * var132 + 65536));
                                int var135 = (var132 << 8) / var134;
                                int var136 = 65536 / var134;
                                int var137 = (var133 << 8) / var134;
                                int var138 = (var137 * -50 + var135 * -50 + var136 * -10) / var129 + 96;
                                int var139 = (var127[var131][var130] >> 1) + (var127[var131][var130 + 1] >> 3) + (var127[var131][var130 - 1] >> 2) + (var127[var131 - 1][var130] >> 2) + (var127[var131 + 1][var130] >> 3);
                                Statics.field53[var131][var130] = var138 - var139;
                            }
                        }
                        for (int var140 = 0; var140 < 104; var140++) {
                            Statics.field578[var140] = 0;
                            Statics.field2970[var140] = 0;
                            Statics.field1945[var140] = 0;
                            Statics.field2782[var140] = 0;
                            Statics.field1923[var140] = 0;
                        }
                        for (int var141 = -5; var141 < 109; var141++) {
                            for (int var142 = 0; var142 < 104; var142++) {
                                int var143 = var141 + 5;
                                int var10002;
                                if (var143 >= 0 && var143 < 104) {
                                    int var144 = Statics.field76[var126][var143][var142] & 0xFF;
                                    if (var144 > 0) {
                                        int var145 = var144 - 1;
                                        class37 var146 = (class37) class37.field882.method3112((long) var145);
                                        class37 var147;
                                        if (var146 == null) {
                                            byte[] var148 = Statics.field880.method2703(1, var145);
                                            class37 var149 = new class37();
                                            if (var148 != null) {
                                                var149.method684(new class107(var148), var145);
                                            }
                                            var149.method693();
                                            class37.field882.method3115(var149, (long) var145);
                                            var147 = var149;
                                        } else {
                                            var147 = var146;
                                        }
                                        Statics.field578[var142] += var147.field881;
                                        Statics.field2970[var142] += var147.field883;
                                        Statics.field1945[var142] += var147.field884;
                                        Statics.field2782[var142] += var147.field885;
                                        var10002 = Statics.field1923[var142]++;
                                    }
                                }
                                int var151 = var141 - 5;
                                if (var151 >= 0 && var151 < 104) {
                                    int var152 = Statics.field76[var126][var151][var142] & 0xFF;
                                    if (var152 > 0) {
                                        int var153 = var152 - 1;
                                        class37 var154 = (class37) class37.field882.method3112((long) var153);
                                        class37 var155;
                                        if (var154 == null) {
                                            byte[] var156 = Statics.field880.method2703(1, var153);
                                            class37 var157 = new class37();
                                            if (var156 != null) {
                                                var157.method684(new class107(var156), var153);
                                            }
                                            var157.method693();
                                            class37.field882.method3115(var157, (long) var153);
                                            var155 = var157;
                                        } else {
                                            var155 = var154;
                                        }
                                        Statics.field578[var142] -= var155.field881;
                                        Statics.field2970[var142] -= var155.field883;
                                        Statics.field1945[var142] -= var155.field884;
                                        Statics.field2782[var142] -= var155.field885;
                                        var10002 = Statics.field1923[var142]--;
                                    }
                                }
                            }
                            if (var141 >= 1 && var141 < 103) {
                                int var159 = 0;
                                int var160 = 0;
                                int var161 = 0;
                                int var162 = 0;
                                int var163 = 0;
                                for (int var164 = -5; var164 < 109; var164++) {
                                    int var165 = var164 + 5;
                                    if (var165 >= 0 && var165 < 104) {
                                        var159 += Statics.field578[var165];
                                        var160 += Statics.field2970[var165];
                                        var161 += Statics.field1945[var165];
                                        var162 += Statics.field2782[var165];
                                        var163 += Statics.field1923[var165];
                                    }
                                    int var166 = var164 - 5;
                                    if (var166 >= 0 && var166 < 104) {
                                        var159 -= Statics.field578[var166];
                                        var160 -= Statics.field2970[var166];
                                        var161 -= Statics.field1945[var166];
                                        var162 -= Statics.field2782[var166];
                                        var163 -= Statics.field1923[var166];
                                    }
                                    if (var164 >= 1 && var164 < 103 && (!field267 || (class6.field80[0][var141][var164] & 0x2) != 0 || (class6.field80[var126][var141][var164] & 0x10) == 0 && class6.method1(var126, var141, var164) == field397)) {
                                        if (var126 < class6.field75) {
                                            class6.field75 = var126;
                                        }
                                        int var167 = Statics.field76[var126][var141][var164] & 0xFF;
                                        int var168 = Statics.field77[var126][var141][var164] & 0xFF;
                                        if (var167 > 0 || var168 > 0) {
                                            int var169 = class6.field93[var126][var141][var164];
                                            int var170 = class6.field93[var126][var141 + 1][var164];
                                            int var171 = class6.field93[var126][var141 + 1][var164 + 1];
                                            int var172 = class6.field93[var126][var141][var164 + 1];
                                            int var173 = Statics.field53[var141][var164];
                                            int var174 = Statics.field53[var141 + 1][var164];
                                            int var175 = Statics.field53[var141 + 1][var164 + 1];
                                            int var176 = Statics.field53[var141][var164 + 1];
                                            int var177 = -1;
                                            int var178 = -1;
                                            if (var167 > 0) {
                                                int var179 = var159 * 256 / var162;
                                                int var180 = var160 / var163;
                                                int var181 = var161 / var163;
                                                var177 = class6.method159(var179, var180, var181);
                                                int var182 = class6.field87 + var179 & 0xFF;
                                                int var183 = class6.field83 + var181;
                                                if (var183 < 0) {
                                                    var183 = 0;
                                                } else if (var183 > 255) {
                                                    var183 = 255;
                                                }
                                                var178 = class6.method159(var182, var180, var183);
                                            }
                                            if (var126 > 0) {
                                                boolean var184 = true;
                                                if (var167 == 0 && Statics.field78[var126][var141][var164] != 0) {
                                                    var184 = false;
                                                }
                                                if (var168 > 0 && !class41.method1834(var168 - 1).field966) {
                                                    var184 = false;
                                                }
                                                if (var184 && var169 == var170 && var169 == var171 && var169 == var172) {
                                                    Statics.field676[var126][var141][var164] |= 0x924;
                                                }
                                            }
                                            int var185 = 0;
                                            if (var178 != -1) {
                                                var185 = class84.field1486[class6.method156(var178, 96)];
                                            }
                                            if (var168 == 0) {
                                                var120.method1581(var126, var141, var164, 0, 0, -1, var169, var170, var171, var172, class6.method156(var177, var173), class6.method156(var177, var174), class6.method156(var177, var175), class6.method156(var177, var176), 0, 0, 0, 0, var185, 0);
                                            } else {
                                                int var186 = Statics.field78[var126][var141][var164] + 1;
                                                byte var187 = Statics.field74[var126][var141][var164];
                                                class41 var188 = class41.method1834(var168 - 1);
                                                int var189 = var188.field960;
                                                int var190;
                                                int var191;
                                                if (var189 >= 0) {
                                                    var190 = Statics.field1487.method1800(var189);
                                                    var191 = -1;
                                                } else if (var188.field959 == 16711935) {
                                                    var191 = -2;
                                                    var189 = -1;
                                                    var190 = -2;
                                                } else {
                                                    var191 = class6.method159(var188.field963, var188.field969, var188.field965);
                                                    int var192 = class6.field87 + var188.field963 & 0xFF;
                                                    int var193 = class6.field83 + var188.field965;
                                                    if (var193 < 0) {
                                                        var193 = 0;
                                                    } else if (var193 > 255) {
                                                        var193 = 255;
                                                    }
                                                    var190 = class6.method159(var192, var188.field969, var193);
                                                }
                                                int var194 = 0;
                                                if (var190 != -2) {
                                                    var194 = class84.field1486[class6.method2025(var190, 96)];
                                                }
                                                if (var188.field961 != -1) {
                                                    int var195 = class6.field87 + var188.field957 & 0xFF;
                                                    int var196 = class6.field83 + var188.field962;
                                                    if (var196 < 0) {
                                                        var196 = 0;
                                                    } else if (var196 > 255) {
                                                        var196 = 255;
                                                    }
                                                    int var197 = class6.method159(var195, var188.field967, var196);
                                                    var194 = class84.field1486[class6.method2025(var197, 96)];
                                                }
                                                var120.method1581(var126, var141, var164, var186, var187, var189, var169, var170, var171, var172, class6.method156(var177, var173), class6.method156(var177, var174), class6.method156(var177, var175), class6.method156(var177, var176), class6.method2025(var191, var173), class6.method2025(var191, var174), class6.method2025(var191, var175), class6.method2025(var191, var176), var185, var194);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var198 = 1; var198 < 103; var198++) {
                            for (int var199 = 1; var199 < 103; var199++) {
                                int var204;
                                if ((class6.field80[var126][var199][var198] & 0x8) != 0) {
                                    var204 = 0;
                                } else if (var126 <= 0 || (class6.field80[1][var199][var198] & 0x2) == 0) {
                                    var204 = var126;
                                } else {
                                    var204 = var126 - 1;
                                }
                                var120.method1614(var126, var199, var198, var204);
                            }
                        }
                        Statics.field76[var126] = (byte[][]) null;
                        Statics.field77[var126] = (byte[][]) null;
                        Statics.field78[var126] = (byte[][]) null;
                        Statics.field74[var126] = (byte[][]) null;
                        Statics.field580[var126] = (byte[][]) null;
                    }
                    var120.method1607(-50, -10, -50);
                    for (int var205 = 0; var205 < 104; var205++) {
                        for (int var206 = 0; var206 < 104; var206++) {
                            if ((class6.field80[1][var205][var206] & 0x2) == 2) {
                                var120.method1578(var205, var206);
                            }
                        }
                    }
                    int var207 = 1;
                    int var208 = 2;
                    int var209 = 4;
                    for (int var210 = 0; var210 < 4; var210++) {
                        if (var210 > 0) {
                            var207 <<= 0x3;
                            var208 <<= 0x3;
                            var209 <<= 0x3;
                        }
                        for (int var211 = 0; var211 <= var210; var211++) {
                            for (int var212 = 0; var212 <= 104; var212++) {
                                for (int var213 = 0; var213 <= 104; var213++) {
                                    if ((Statics.field676[var211][var213][var212] & var207) != 0) {
                                        int var214 = var212;
                                        int var215 = var212;
                                        int var216 = var211;
                                        int var217 = var211;
                                        while (var214 > 0 && (Statics.field676[var211][var213][var214 - 1] & var207) != 0) {
                                            var214--;
                                        }
                                        while (var215 < 104 && (Statics.field676[var211][var213][var215 + 1] & var207) != 0) {
                                            var215++;
                                        }
                                        label769: while (var216 > 0) {
                                            for (int var218 = var214; var218 <= var215; var218++) {
                                                if ((Statics.field676[var216 - 1][var213][var218] & var207) == 0) {
                                                    break label769;
                                                }
                                            }
                                            var216--;
                                        }
                                        label758: while (var217 < var210) {
                                            for (int var219 = var214; var219 <= var215; var219++) {
                                                if ((Statics.field676[var217 + 1][var213][var219] & var207) == 0) {
                                                    break label758;
                                                }
                                            }
                                            var217++;
                                        }
                                        int var220 = (var217 + 1 - var216) * (var215 - var214 + 1);
                                        if (var220 >= 8) {
                                            short var221 = 240;
                                            int var222 = class6.field93[var217][var213][var214] - var221;
                                            int var223 = class6.field93[var216][var213][var214];
                                            class79.method1579(var210, 1, var213 * 128, var213 * 128, var214 * 128, var215 * 128 + 128, var222, var223);
                                            for (int var224 = var216; var224 <= var217; var224++) {
                                                for (int var225 = var214; var225 <= var215; var225++) {
                                                    Statics.field676[var224][var213][var225] &= ~var207;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field676[var211][var213][var212] & var208) != 0) {
                                        int var226 = var213;
                                        int var227 = var213;
                                        int var228 = var211;
                                        int var229 = var211;
                                        while (var226 > 0 && (Statics.field676[var211][var226 - 1][var212] & var208) != 0) {
                                            var226--;
                                        }
                                        while (var227 < 104 && (Statics.field676[var211][var227 + 1][var212] & var208) != 0) {
                                            var227++;
                                        }
                                        label822: while (var228 > 0) {
                                            for (int var230 = var226; var230 <= var227; var230++) {
                                                if ((Statics.field676[var228 - 1][var230][var212] & var208) == 0) {
                                                    break label822;
                                                }
                                            }
                                            var228--;
                                        }
                                        label811: while (var229 < var210) {
                                            for (int var231 = var226; var231 <= var227; var231++) {
                                                if ((Statics.field676[var229 + 1][var231][var212] & var208) == 0) {
                                                    break label811;
                                                }
                                            }
                                            var229++;
                                        }
                                        int var232 = (var229 + 1 - var228) * (var227 - var226 + 1);
                                        if (var232 >= 8) {
                                            short var233 = 240;
                                            int var234 = class6.field93[var229][var226][var212] - var233;
                                            int var235 = class6.field93[var228][var226][var212];
                                            class79.method1579(var210, 2, var226 * 128, var227 * 128 + 128, var212 * 128, var212 * 128, var234, var235);
                                            for (int var236 = var228; var236 <= var229; var236++) {
                                                for (int var237 = var226; var237 <= var227; var237++) {
                                                    Statics.field676[var236][var237][var212] &= ~var208;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field676[var211][var213][var212] & var209) != 0) {
                                        int var238 = var213;
                                        int var239 = var213;
                                        int var240 = var212;
                                        int var241 = var212;
                                        while (var240 > 0 && (Statics.field676[var211][var213][var240 - 1] & var209) != 0) {
                                            var240--;
                                        }
                                        while (var241 < 104 && (Statics.field676[var211][var213][var241 + 1] & var209) != 0) {
                                            var241++;
                                        }
                                        label875: while (var238 > 0) {
                                            for (int var242 = var240; var242 <= var241; var242++) {
                                                if ((Statics.field676[var211][var238 - 1][var242] & var209) == 0) {
                                                    break label875;
                                                }
                                            }
                                            var238--;
                                        }
                                        label864: while (var239 < 104) {
                                            for (int var243 = var240; var243 <= var241; var243++) {
                                                if ((Statics.field676[var211][var239 + 1][var243] & var209) == 0) {
                                                    break label864;
                                                }
                                            }
                                            var239++;
                                        }
                                        if ((var239 - var238 + 1) * (var241 - var240 + 1) >= 4) {
                                            int var244 = class6.field93[var211][var238][var240];
                                            class79.method1579(var210, 4, var238 * 128, var239 * 128 + 128, var240 * 128, var241 * 128 + 128, var244, var244);
                                            for (int var245 = var238; var245 <= var239; var245++) {
                                                for (int var246 = var240; var246 <= var241; var246++) {
                                                    Statics.field676[var211][var245][var246] &= ~var209;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method579(true);
                    int var247 = class6.field75;
                    if (var247 > Statics.field235) {
                        var247 = Statics.field235;
                    }
                    if (var247 < Statics.field235 - 1) {
                        int var248 = Statics.field235 - 1;
                    }
                    if (field267) {
                        Statics.field16.method1590(class6.field75);
                    } else {
                        Statics.field16.method1590(0);
                    }
                    for (int var249 = 0; var249 < 104; var249++) {
                        for (int var250 = 0; var250 < 104; var250++) {
                            method74(var249, var250);
                        }
                    }
                    method491();
                    method1732();
                    class36.field831.method3116();
                    if (Statics.field2126 != null) {
                        field304.method2306(42);
                        field304.method2082(1057001181);
                    }
                    if (!field356) {
                        int var251 = (Statics.field195 - 6) / 8;
                        int var252 = (Statics.field195 + 6) / 8;
                        int var253 = (Statics.field683 - 6) / 8;
                        int var254 = (Statics.field683 + 6) / 8;
                        for (int var255 = var251 - 1; var255 <= var252 + 1; var255++) {
                            for (int var256 = var253 - 1; var256 <= var254 + 1; var256++) {
                                if (var255 < var251 || var255 > var252 || var256 < var253 || var256 > var254) {
                                    Statics.field2038.method2661("m" + var255 + "_" + var256);
                                    Statics.field2038.method2661("l" + var255 + "_" + var256);
                                }
                            }
                        }
                    }
                    method1376(30);
                    method491();
                    Statics.field76 = (byte[][][]) null;
                    Statics.field77 = (byte[][][]) null;
                    Statics.field78 = (byte[][][]) null;
                    Statics.field74 = (byte[][][]) null;
                    Statics.field676 = (int[][][]) null;
                    Statics.field580 = (byte[][][]) null;
                    Statics.field53 = (int[][]) null;
                    Statics.field578 = null;
                    Statics.field2970 = null;
                    Statics.field1945 = null;
                    Statics.field2782 = null;
                    Statics.field1923 = null;
                    field304.method2306(230);
                    Statics.field143.method2394();
                    for (int var257 = 0; var257 < 32; var257++) {
                        field2073[var257] = 0L;
                    }
                    for (int var258 = 0; var258 < 32; var258++) {
                        field2065[var258] = 0L;
                    }
                    Statics.field1917 = 0;
                } else {
                    field321 = 2;
                }
            } else {
                field321 = 1;
            }
        }
        if (field270 == 30) {
            method3108();
        } else if (field270 == 40 || field270 == 45) {
            method2023();
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method192() {
        boolean var1 = class162.method681();
        if (var1 && field497 && Statics.field2095 != null) {
            Statics.field2095.method984();
        }
        if (field2070) {
            Canvas var2 = Statics.field61;
            var2.removeKeyListener(class124.field1985);
            var2.removeFocusListener(class124.field1985);
            class124.field1992 = -1;
            class127.method1839(Statics.field61);
            if (Statics.field148 != null) {
                Statics.field148.method2371(Statics.field61);
            }
            this.method2535();
            class124.method496(Statics.field61);
            class127.method122(Statics.field61);
            if (Statics.field148 != null) {
                Statics.field148.method2368(Statics.field61);
            }
        }
        if (field270 == 0) {
            class131.method487(class28.field655, class28.field657, (Color) null);
        } else if (field270 == 5) {
            class28.method1734(Statics.field1839, Statics.field158);
        } else if (field270 == 10 || field270 == 11) {
            class28.method1734(Statics.field1839, Statics.field158);
        } else if (field270 == 20) {
            class28.method1734(Statics.field1839, Statics.field158);
        } else if (field270 == 25) {
            if (field321 == 1) {
                if (field367 > field291) {
                    field291 = field367;
                }
                int var3 = (field291 * 50 - field367 * 50) / field291;
                method2035(class143.field2395 + class2.field26 + class2.field25 + var3 + "%" + class2.field24, false);
            } else if (field321 == 2) {
                if (field272 > field320) {
                    field320 = field272;
                }
                int var4 = (field320 * 50 - field272 * 50) / field320 + 50;
                method2035(class143.field2395 + class2.field26 + class2.field25 + var4 + "%" + class2.field24, false);
            } else {
                method2035(class143.field2395, false);
            }
        } else if (field270 == 30) {
            if (field424 != -1) {
                int var5 = field424;
                if (class153.method469(var5)) {
                    method3(Statics.field2625[var5], -1);
                }
            }
            for (int var6 = 0; var6 < field355; var6++) {
                if (field468[var6]) {
                    field313[var6] = true;
                }
                field359[var6] = field468[var6];
                field468[var6] = false;
            }
            field467 = field316;
            field413 = -1;
            field414 = -1;
            Statics.field196 = null;
            if (field424 != -1) {
                field355 = 0;
                int var7 = field424;
                if (class153.method469(var7)) {
                    Statics.field172 = null;
                    Statics.method126(Statics.field2625[var7], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field172 != null) {
                        Statics.method126(Statics.field172, -1412584499, 0, 0, 765, 503, Statics.field978, Statics.field1113, -1);
                        Statics.field172 = null;
                    }
                } else {
                    for (int var8 = 0; var8 < 100; var8++) {
                        field468[var8] = true;
                    }
                }
            }
            class73.method1521();
            if (field305) {
                method2328();
            } else if (field413 != -1) {
                method2022(field413, field414);
            }
            if (field475 == 3) {
                for (int var9 = 0; var9 < field355; var9++) {
                    if (field359[var9]) {
                        class73.method1481(field471[var9], field472[var9], field473[var9], field379[var9], 16711935, 128);
                    } else if (field313[var9]) {
                        class73.method1481(field471[var9], field472[var9], field473[var9], field379[var9], 16711680, 128);
                    }
                }
            }
            int var10 = Statics.field235;
            int var11 = Statics.field1819.field729;
            int var12 = Statics.field1819.field761;
            int var13 = field338;
            for (class20 var14 = (class20) class20.field552.method3189(); var14 != null; var14 = (class20) class20.field552.method3182()) {
                if (var14.field549 != -1 || var14.field556 != null) {
                    int var15 = 0;
                    if (var11 > var14.field546) {
                        var15 += var11 - var14.field546;
                    } else if (var11 < var14.field560) {
                        var15 += var14.field560 - var11;
                    }
                    if (var12 > var14.field547) {
                        var15 += var12 - var14.field547;
                    } else if (var12 < var14.field545) {
                        var15 += var14.field545 - var12;
                    }
                    if (var15 - 64 > var14.field548 || field499 == 0 || var14.field543 != var10) {
                        if (var14.field555 != null) {
                            Statics.field73.method930(var14.field555);
                            var14.field555 = null;
                        }
                        if (var14.field542 != null) {
                            Statics.field73.method930(var14.field542);
                            var14.field542 = null;
                        }
                    } else {
                        var15 -= 64;
                        if (var15 < 0) {
                            var15 = 0;
                        }
                        int var16 = field499 * (var14.field548 - var15) / var14.field548;
                        class52 var10000;
                        if (var14.field555 != null) {
                            var14.field555.method1090(var16);
                        } else if (var14.field549 >= 0) {
                            var10000 = (class52) null;
                            class52 var17 = class52.method1028(Statics.field1275, var14.field549, 0);
                            if (var17 != null) {
                                class56 var18 = var17.method1030().method1064(Statics.field184);
                                class58 var19 = class58.method1086(var18, 100, var16);
                                var19.method1089(-1);
                                Statics.field73.method960(var19);
                                var14.field555 = var19;
                            }
                        }
                        if (var14.field542 != null) {
                            var14.field542.method1090(var16);
                            if (!var14.field542.method3288()) {
                                var14.field542 = null;
                            }
                        } else if (var14.field556 != null && (var14.field553 -= var13) <= 0) {
                            int var20 = (int) (Math.random() * (double) var14.field556.length);
                            var10000 = (class52) null;
                            class52 var21 = class52.method1028(Statics.field1275, var14.field556[var20], 0);
                            if (var21 != null) {
                                class56 var22 = var21.method1030().method1064(Statics.field184);
                                class58 var23 = class58.method1086(var22, 100, var16);
                                var23.method1089(0);
                                Statics.field73.method960(var23);
                                var14.field542 = var23;
                                var14.field553 = var14.field551 + (int) (Math.random() * (double) (var14.field544 - var14.field551));
                            }
                        }
                    }
                }
            }
            field338 = 0;
        } else if (field270 == 40) {
            method2035(class143.field2175 + class2.field26 + class143.field2174, false);
        } else if (field270 == 45) {
            method2035(class143.field2271, false);
        }
        if (field270 == 30 && field475 == 0 && !field2075) {
            try {
                Graphics var24 = Statics.field61.getGraphics();
                for (int var25 = 0; var25 < field355; var25++) {
                    if (field313[var25]) {
                        Statics.field94.method1322(var24, field471[var25], field472[var25], field473[var25], field379[var25]);
                        field313[var25] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field61.repaint();
            }
        } else if (field270 > 0) {
            try {
                Graphics var27 = Statics.field61.getGraphics();
                Statics.field94.method1318(var27, 0, 0);
                field2075 = false;
                for (int var28 = 0; var28 < field355; var28++) {
                    field313[var28] = false;
                }
            } catch (Exception var30) {
                Statics.field61.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method241() {
        if (Statics.field340 != null) {
            Statics.field340.field180 = false;
        }
        Statics.field340 = null;
        if (Statics.field139 != null) {
            Statics.field139.method2524();
            Statics.field139 = null;
        }
        class124.method131();
        class127.method134();
        Statics.field148 = null;
        if (Statics.field2095 != null) {
            Statics.field2095.method975();
        }
        if (Statics.field918 != null) {
            Statics.field918.method975();
        }
        if (Statics.field2533 != null) {
            Statics.field2533.method2524();
        }
        class150.method1941();
        try {
            class136.field2104.method3445();
            for (int var1 = 0; var1 < Statics.field1837; var1++) {
                Statics.field977[var1].method3445();
            }
            class136.field2105.method3445();
            class136.field2103.method3445();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bu.p(II)V")
    public static void method1376(int arg0) {
        if (field270 == arg0) {
            return;
        }
        if (field270 == 0) {
            Statics.field1922 = null;
            Statics.field1540 = null;
            Statics.field784 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field459 = 0;
            field296 = 0;
            field297 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field303 != null) {
            Statics.field303.method2524();
            Statics.field303 = null;
        }
        if (field270 == 25) {
            field321 = 0;
            field367 = 0;
            field291 = 1;
            field272 = 0;
            field320 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method120(Statics.field61, Statics.field1883, Statics.field679, true, 0);
        } else if (arg0 == 20) {
            class28.method120(Statics.field61, Statics.field1883, Statics.field679, true, field270 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method120(Statics.field61, Statics.field1883, Statics.field679, false, 4);
        } else {
            class28.method138();
        }
        field270 = arg0;
    }

    @ObfuscatedName("client.r(B)V")
    public void method171() {
        if (field270 == 1000) {
            return;
        }
        long var1 = class103.method1837();
        int var3 = (int) (var1 - Statics.field2528);
        Statics.field2528 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2531 += var3;
        boolean var4;
        if (class151.field2514 == 0 && class151.field2518 == 0 && class151.field2521 == 0 && class151.field2516 == 0) {
            var4 = true;
        } else if (Statics.field2533 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2531 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2518 < 20 && class151.field2516 > 0) {
                        class152 var5 = (class152) class151.field2515.method3154();
                        class107 var6 = new class107(4);
                        var6.method2079(1);
                        var6.method2261((int) var5.field2884);
                        Statics.field2533.method2509(var6.field1854, 0, 4);
                        class151.field2517.method3152(var5, var5.field2884);
                        class151.field2516--;
                        class151.field2518++;
                    }
                    while (class151.field2514 < 20 && class151.field2521 > 0) {
                        class152 var7 = (class152) class151.field2519.method3243();
                        class107 var8 = new class107(4);
                        var8.method2079(0);
                        var8.method2261((int) var7.field2884);
                        Statics.field2533.method2509(var8.field1854, 0, 4);
                        var7.method3257();
                        class151.field2522.method3152(var7, var7.field2884);
                        class151.field2521--;
                        class151.field2514++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2533.method2530();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2531 = 0;
                        byte var11 = 0;
                        if (Statics.field2062 == null) {
                            var11 = 8;
                        } else if (class151.field2525 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2524.field1851;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2533.method2505(class151.field2524.field1854, class151.field2524.field1851, var12);
                            if (class151.field2527 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2524.field1854[class151.field2524.field1851 + var13] ^= class151.field2527;
                                }
                            }
                            class151.field2524.field1851 += var12;
                            if (class151.field2524.field1851 < var11) {
                                break;
                            }
                            if (Statics.field2062 == null) {
                                class151.field2524.field1851 = 0;
                                int var14 = class151.field2524.method2116();
                                int var15 = class151.field2524.method2094();
                                int var16 = class151.field2524.method2116();
                                int var17 = class151.field2524.method2097();
                                long var18 = (long) ((var14 << 16) + var15);
                                class152 var20 = (class152) class151.field2517.method3155(var18);
                                Statics.field13 = true;
                                if (var20 == null) {
                                    var20 = (class152) class151.field2522.method3155(var18);
                                    Statics.field13 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2062 = var20;
                                Statics.field1899 = new class107(var17 + var21 + Statics.field2062.field2538);
                                Statics.field1899.method2079(var16);
                                Statics.field1899.method2082(var17);
                                class151.field2525 = 8;
                                class151.field2524.field1851 = 0;
                            } else if (class151.field2525 == 0) {
                                if (class151.field2524.field1854[0] == -1) {
                                    class151.field2525 = 1;
                                    class151.field2524.field1851 = 0;
                                } else {
                                    Statics.field2062 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1899.field1854.length - Statics.field2062.field2538;
                            int var23 = 512 - class151.field2525;
                            if (var23 > var22 - Statics.field1899.field1851) {
                                var23 = var22 - Statics.field1899.field1851;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2533.method2505(Statics.field1899.field1854, Statics.field1899.field1851, var23);
                            if (class151.field2527 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1899.field1854[Statics.field1899.field1851 + var24] ^= class151.field2527;
                                }
                            }
                            Statics.field1899.field1851 += var23;
                            class151.field2525 += var23;
                            if (Statics.field1899.field1851 == var22) {
                                if (Statics.field2062.field2884 == 16711935L) {
                                    Statics.field2018 = Statics.field1899;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class148 var26 = class151.field2529[var25];
                                        if (var26 != null) {
                                            Statics.field2018.field1851 = var25 * 8 + 5;
                                            int var27 = Statics.field2018.method2097();
                                            int var28 = Statics.field2018.method2097();
                                            var26.method2745(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2526.reset();
                                    class151.field2526.update(Statics.field1899.field1854, 0, var22);
                                    int var29 = (int) class151.field2526.getValue();
                                    if (Statics.field2062.field2536 != var29) {
                                        try {
                                            Statics.field2533.method2524();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2513++;
                                        Statics.field2533 = null;
                                        class151.field2527 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2513 = 0;
                                    class151.field2523 = 0;
                                    Statics.field2062.field2537.method2752((int) (Statics.field2062.field2884 & 0xFFFFL), Statics.field1899.field1854, (Statics.field2062.field2884 & 0xFF0000L) == 16711680L, Statics.field13);
                                }
                                Statics.field2062.method3285();
                                if (Statics.field13) {
                                    class151.field2518--;
                                } else {
                                    class151.field2514--;
                                }
                                class151.field2525 = 0;
                                Statics.field2062 = null;
                                Statics.field1899 = null;
                            } else {
                                if (class151.field2525 != 512) {
                                    break;
                                }
                                class151.field2525 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2533.method2524();
                } catch (Exception var34) {
                }
                class151.field2523++;
                Statics.field2533 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method390();
        }
    }

    @ObfuscatedName("client.j(I)V")
    public void method390() {
        if (class151.field2513 >= 4) {
            this.method2546("js5crc");
            field270 = 1000;
            return;
        }
        if (class151.field2523 >= 4) {
            if (field270 <= 5) {
                this.method2546("js5io");
                field270 = 1000;
                return;
            }
            field293 = 3000;
            class151.field2523 = 3;
        }
        if (--field293 + 1 > 0) {
            return;
        }
        try {
            if (field353 == 0) {
                Statics.field141 = Statics.field1953.method2414(Statics.field1896, Statics.field1914);
                field353++;
            }
            if (field353 == 1) {
                if (Statics.field141.field2089 == 2) {
                    this.method173(-1);
                    return;
                }
                if (Statics.field141.field2089 == 1) {
                    field353++;
                }
            }
            if (field353 == 2) {
                Statics.field636 = new class130((Socket) Statics.field141.field2086, Statics.field1953);
                class107 var1 = new class107(5);
                var1.method2079(15);
                var1.method2082(63);
                Statics.field636.method2509(var1.field1854, 0, 5);
                field353++;
                Statics.field1948 = class103.method1837();
            }
            if (field353 == 3) {
                if (field270 <= 5 || Statics.field636.method2530() > 0) {
                    int var2 = Statics.field636.method2506();
                    if (var2 != 0) {
                        this.method173(var2);
                        return;
                    }
                    field353++;
                } else if (class103.method1837() - Statics.field1948 > 30000L) {
                    this.method173(-2);
                    return;
                }
            }
            if (field353 == 4) {
                class151.method2629(Statics.field636, field270 > 20);
                Statics.field141 = null;
                Statics.field636 = null;
                field353 = 0;
                field294 = 0;
            }
        } catch (IOException var4) {
            this.method173(-3);
        }
    }

    @ObfuscatedName("client.c(II)V")
    public void method173(int arg0) {
        Statics.field141 = null;
        Statics.field636 = null;
        field353 = 0;
        if (Statics.field299 == Statics.field1914) {
            Statics.field1914 = Statics.field1968;
        } else {
            Statics.field1914 = Statics.field299;
        }
        field294++;
        if (field294 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field270 <= 5) {
                this.method2546("js5connect_full");
                field270 = 1000;
            } else {
                field293 = 3000;
            }
        } else if (field294 >= 2 && arg0 == 6) {
            this.method2546("js5connect_outofdate");
            field270 = 1000;
        } else if (field294 >= 4) {
            if (field270 <= 5) {
                this.method2546("js5connect");
                field270 = 1000;
            } else {
                field293 = 3000;
            }
        }
    }

    @ObfuscatedName("ct.q(S)V")
    public static void method2027() {
        if (field423 == 0) {
            Statics.field16 = new class79(4, 104, 104, class6.field93);
            for (int var0 = 0; var0 < 4; var0++) {
                field322[var0] = new class198(104, 104);
            }
            Statics.field1456 = new class72(512, 512);
            class28.field657 = class143.field2177;
            class28.field655 = 5;
            field423 = 20;
        } else if (field423 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1490[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1611(var1, 500, 800, 512, 334);
            class28.field657 = class143.field2178;
            class28.field655 = 10;
            field423 = 30;
        } else if (field423 == 30) {
            Statics.field1909 = method1381(0, false, true, true);
            Statics.field2013 = method1381(1, false, true, true);
            Statics.field2133 = method1381(2, true, false, true);
            Statics.field246 = method1381(3, false, true, true);
            Statics.field1275 = method1381(4, false, true, true);
            Statics.field2038 = method1381(5, true, true, true);
            Statics.field558 = method1381(6, true, true, false);
            Statics.field1272 = method1381(7, false, true, true);
            Statics.field679 = method1381(8, false, true, true);
            Statics.field873 = method1381(9, false, true, true);
            Statics.field1883 = method1381(10, false, true, true);
            Statics.field522 = method1381(11, false, true, true);
            Statics.field59 = method1381(12, false, true, true);
            Statics.field2672 = method1381(13, true, false, true);
            Statics.field609 = method1381(14, false, true, false);
            Statics.field712 = method1381(15, false, true, true);
            class28.field657 = class143.field2179;
            class28.field655 = 20;
            field423 = 40;
        } else if (field423 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1909.method2743() * 4 / 100;
            int var8 = var7 + Statics.field2013.method2743() * 4 / 100;
            int var9 = var8 + Statics.field2133.method2743() * 2 / 100;
            int var10 = var9 + Statics.field246.method2743() * 2 / 100;
            int var11 = var10 + Statics.field1275.method2743() * 6 / 100;
            int var12 = var11 + Statics.field2038.method2743() * 4 / 100;
            int var13 = var12 + Statics.field558.method2743() * 2 / 100;
            int var14 = var13 + Statics.field1272.method2743() * 60 / 100;
            int var15 = var14 + Statics.field679.method2743() * 2 / 100;
            int var16 = var15 + Statics.field873.method2743() * 2 / 100;
            int var17 = var16 + Statics.field1883.method2743() * 2 / 100;
            int var18 = var17 + Statics.field522.method2743() * 2 / 100;
            int var19 = var18 + Statics.field59.method2743() * 2 / 100;
            int var20 = var19 + Statics.field2672.method2743() * 2 / 100;
            int var21 = var20 + Statics.field609.method2743() * 2 / 100;
            int var22 = var21 + Statics.field712.method2743() * 2 / 100;
            if (var22 == 100) {
                class28.field657 = class143.field2353;
                class28.field655 = 30;
                field423 = 45;
            } else {
                if (var22 != 0) {
                    class28.field657 = class143.field2394 + var22 + "%";
                }
                class28.field655 = 30;
            }
        } else if (field423 == 45) {
            class50.method77(22050, !field267, 2);
            class163 var23 = new class163();
            var23.method2995(9, 128);
            Statics.field2095 = class50.method679(Statics.field1953, Statics.field61, 0, 22050);
            Statics.field2095.method971(var23);
            class162.method2350(Statics.field712, Statics.field609, Statics.field1275, var23);
            Statics.field918 = class50.method679(Statics.field1953, Statics.field61, 1, 2048);
            Statics.field73 = new class49();
            Statics.field918.method971(Statics.field73);
            Statics.field184 = new class68(22050, Statics.field1078);
            class28.field657 = class143.field2182;
            class28.field655 = 35;
            field423 = 50;
        } else if (field423 == 50) {
            int var24 = 0;
            if (Statics.field158 == null) {
                class148 var25 = Statics.field679;
                class148 var26 = Statics.field2672;
                int var27 = var25.method2656("p11_full");
                int var28 = var25.method2679(var27, "");
                class194 var29;
                if (class70.method2635(var25, var27, var28)) {
                    var29 = class70.method1315(var26.method2703(var27, var28));
                } else {
                    var29 = null;
                }
                Statics.field158 = var29;
            } else {
                var24++;
            }
            if (Statics.field611 == null) {
                class148 var31 = Statics.field679;
                class148 var32 = Statics.field2672;
                int var33 = var31.method2656("p12_full");
                int var34 = var31.method2679(var33, "");
                class194 var35;
                if (class70.method2635(var31, var33, var34)) {
                    var35 = class70.method1315(var32.method2703(var33, var34));
                } else {
                    var35 = null;
                }
                Statics.field611 = var35;
            } else {
                var24++;
            }
            if (Statics.field1839 == null) {
                class148 var37 = Statics.field679;
                class148 var38 = Statics.field2672;
                int var39 = var37.method2656("b12_full");
                int var40 = var37.method2679(var39, "");
                class194 var41;
                if (class70.method2635(var37, var39, var40)) {
                    var41 = class70.method1315(var38.method2703(var39, var40));
                } else {
                    var41 = null;
                }
                Statics.field1839 = var41;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field657 = class143.field2256 + var24 * 100 / 3 + "%";
                class28.field655 = 40;
            } else {
                Statics.field1830 = new class146(true);
                class28.field657 = class143.field2184;
                class28.field655 = 40;
                field423 = 60;
            }
        } else if (field423 == 60) {
            class148 var43 = Statics.field1883;
            class148 var44 = Statics.field679;
            int var45 = 0;
            if (var43.method2704("title.jpg", "")) {
                var45++;
            }
            if (var44.method2704("logo", "")) {
                var45++;
            }
            if (var44.method2704("titlebox", "")) {
                var45++;
            }
            if (var44.method2704("titlebutton", "")) {
                var45++;
            }
            if (var44.method2704("runes", "")) {
                var45++;
            }
            if (var44.method2704("title_mute", "")) {
                var45++;
            }
            if (var44.method2678("options_radio_buttons,0")) {
                var45++;
            }
            if (var44.method2678("options_radio_buttons,2")) {
                var45++;
            }
            var44.method2704("sl_back", "");
            var44.method2704("sl_flags", "");
            var44.method2704("sl_arrows", "");
            var44.method2704("sl_stars", "");
            var44.method2704("sl_button", "");
            byte var48 = 8;
            if (var45 < var48) {
                class28.field657 = class143.field2185 + var45 * 100 / var48 + "%";
                class28.field655 = 50;
            } else {
                class28.field657 = class143.field2186;
                class28.field655 = 50;
                method1376(5);
                field423 = 70;
            }
        } else if (field423 == 70) {
            if (Statics.field2133.method2663()) {
                class41.method2458(Statics.field2133);
                class37.method1573(Statics.field2133);
                class148 var50 = Statics.field2133;
                class148 var51 = Statics.field1272;
                Statics.field956 = var50;
                Statics.field942 = var51;
                Statics.field2824 = Statics.field956.method2722(3);
                class148 var52 = Statics.field2133;
                class148 var53 = Statics.field1272;
                boolean var54 = field267;
                Statics.field858 = var52;
                Statics.field829 = var53;
                class36.field832 = var54;
                class148 var55 = Statics.field2133;
                class148 var56 = Statics.field1272;
                Statics.field801 = var55;
                Statics.field788 = var56;
                class148 var57 = Statics.field2133;
                class148 var58 = Statics.field1272;
                boolean var59 = field458;
                class194 var60 = Statics.field158;
                Statics.field1029 = var57;
                Statics.field1007 = var58;
                Statics.field2686 = var59;
                Statics.field1029.method2722(10);
                Statics.field142 = var60;
                class148 var61 = Statics.field2133;
                class148 var62 = Statics.field1909;
                class148 var63 = Statics.field2013;
                Statics.field897 = var61;
                Statics.field901 = var62;
                Statics.field900 = var63;
                class39.method732(Statics.field2133, Statics.field1272);
                class42.method444(Statics.field2133);
                class46.method1037(Statics.field2133);
                class153.method1937(Statics.field246, Statics.field1272, Statics.field679, Statics.field2672);
                class44.method459(Statics.field2133);
                class148 var64 = Statics.field2133;
                Statics.field991 = var64;
                class28.field657 = class143.field2188;
                class28.field655 = 60;
                field423 = 80;
            } else {
                class28.field657 = class143.field2187 + Statics.field2133.method2749() + "%";
                class28.field655 = 60;
            }
        } else if (field423 == 80) {
            int var65 = 0;
            if (Statics.field521 == null) {
                class148 var66 = Statics.field679;
                int var67 = var66.method2656("compass");
                int var68 = var66.method2679(var67, "");
                class72 var69 = class70.method30(var66, var67, var68);
                Statics.field521 = var69;
            } else {
                var65++;
            }
            if (Statics.field2424 == null) {
                class148 var70 = Statics.field679;
                int var71 = var70.method2656("mapedge");
                int var72 = var70.method2679(var71, "");
                class72 var73 = class70.method30(var70, var71, var72);
                Statics.field2424 = var73;
            } else {
                var65++;
            }
            if (Statics.field613 == null) {
                Statics.field613 = class70.method2784(Statics.field679, "mapscene", "");
            } else {
                var65++;
            }
            if (Statics.field557 == null) {
                Statics.field557 = class70.method2638(Statics.field679, "mapfunction", "");
            } else {
                var65++;
            }
            if (Statics.field1115 == null) {
                Statics.field1115 = class70.method2638(Statics.field679, "hitmarks", "");
            } else {
                var65++;
            }
            if (Statics.field947 == null) {
                Statics.field947 = class70.method2638(Statics.field679, "headicons_pk", "");
            } else {
                var65++;
            }
            if (Statics.field1273 == null) {
                Statics.field1273 = class70.method2638(Statics.field679, "headicons_prayer", "");
            } else {
                var65++;
            }
            if (Statics.field1658 == null) {
                Statics.field1658 = class70.method2638(Statics.field679, "headicons_hint", "");
            } else {
                var65++;
            }
            if (Statics.field2061 == null) {
                Statics.field2061 = class70.method2638(Statics.field679, "mapmarker", "");
            } else {
                var65++;
            }
            if (Statics.field146 == null) {
                Statics.field146 = class70.method2638(Statics.field679, "cross", "");
            } else {
                var65++;
            }
            if (Statics.field953 == null) {
                Statics.field953 = class70.method2638(Statics.field679, "mapdots", "");
            } else {
                var65++;
            }
            if (Statics.field2130 == null) {
                Statics.field2130 = class70.method2784(Statics.field679, "scrollbar", "");
            } else {
                var65++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class70.method2784(Statics.field679, "mod_icons", "");
            } else {
                var65++;
            }
            if (Statics.field997 == null) {
                Statics.field997 = class70.method478(Statics.field679, "mapback", "");
            } else {
                var65++;
            }
            if (var65 < 14) {
                class28.field657 = class143.field2295 + var65 * 100 / 14 + "%";
                class28.field655 = 70;
            } else {
                Statics.field2920 = Statics.field51;
                Statics.field2424.method1430();
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 21.0D) - 10;
                int var77 = (int) (Math.random() * 41.0D) - 20;
                for (int var78 = 0; var78 < Statics.field557.length; var78++) {
                    Statics.field557[var78].method1386(var74 + var77, var75 + var77, var76 + var77);
                }
                Statics.field613[0].method1553(var74 + var77, var75 + var77, var76 + var77);
                Statics.field1457 = new int[33];
                Statics.field717 = new int[33];
                Statics.field633 = new int[151];
                Statics.field1565 = new int[151];
                for (int var79 = 0; var79 < 33; var79++) {
                    int var80 = 999;
                    int var81 = 0;
                    for (int var82 = 0; var82 < 34; var82++) {
                        if (Statics.field997.field1329[Statics.field997.field1326 * var79 + var82] == 0) {
                            if (var80 == 999) {
                                var80 = var82;
                            }
                        } else if (var80 != 999) {
                            var81 = var82;
                            break;
                        }
                    }
                    Statics.field1457[var79] = var80;
                    Statics.field717[var79] = var81 - var80;
                }
                for (int var83 = 5; var83 < 156; var83++) {
                    int var84 = 999;
                    int var85 = 0;
                    for (int var86 = 25; var86 < 172; var86++) {
                        if (Statics.field997.field1329[Statics.field997.field1326 * var83 + var86] == 0 && var86 > 34 || var83 > 34) {
                            if (var84 == 999) {
                                var84 = var86;
                            }
                        } else if (var84 != 999) {
                            var85 = var86;
                            break;
                        }
                    }
                    Statics.field633[var83 - 5] = var84 - 25;
                    Statics.field1565[var83 - 5] = var85 - var84;
                }
                class28.field657 = class143.field2190;
                class28.field655 = 70;
                field423 = 90;
            }
        } else if (field423 == 90) {
            if (Statics.field873.method2663()) {
                class88 var87 = new class88(Statics.field873, Statics.field679, 20, 0.8D, field267 ? 64 : 128);
                class84.method1777(var87);
                class84.method1776(0.8D);
                class28.field657 = class143.field2192;
                class28.field655 = 90;
                field423 = 110;
            } else {
                class28.field657 = class143.field2183 + Statics.field873.method2749() + "%";
                class28.field655 = 90;
            }
        } else if (field423 == 110) {
            Statics.field340 = new class12();
            Statics.field1953.method2418(Statics.field340, 10);
            class28.field657 = class143.field2218;
            class28.field655 = 94;
            field423 = 120;
        } else if (field423 == 120) {
            if (Statics.field1883.method2704("huffman", "")) {
                class102 var88 = new class102(Statics.field1883.method2676("huffman", ""));
                Statics.field2910 = var88;
                class28.field657 = class143.field2263;
                class28.field655 = 96;
                field423 = 130;
            } else {
                class28.field657 = class143.field2189 + "%";
                class28.field655 = 96;
            }
        } else if (field423 == 130) {
            if (!Statics.field246.method2663()) {
                class28.field657 = class143.field2282 + Statics.field246.method2749() * 4 / 5 + "%";
                class28.field655 = 100;
            } else if (!Statics.field59.method2663()) {
                class28.field657 = class143.field2282 + (80 + Statics.field59.method2749() / 6) + "%";
                class28.field655 = 100;
            } else if (Statics.field2672.method2663()) {
                class28.field657 = class143.field2197;
                class28.field655 = 100;
                field423 = 140;
            } else {
                class28.field657 = class143.field2282 + (96 + Statics.field2672.method2749() / 20) + "%";
                class28.field655 = 100;
            }
        } else if (field423 == 140) {
            method1376(10);
        }
    }

    @ObfuscatedName("bj.n(IZZZI)Led;")
    public static class148 method1381(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2104 != null) {
            var4 = new class121(arg0, class136.field2104, Statics.field977[arg0], 1000000);
        }
        return new class148(var4, Statics.field97, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ck.h(B)V")
    public static final void method2023() {
        try {
            if (field459 == 0) {
                if (Statics.field139 != null) {
                    Statics.field139.method2524();
                    Statics.field139 = null;
                }
                Statics.field2461 = null;
                field455 = false;
                field296 = 0;
                field459 = 1;
            }
            if (field459 == 1) {
                if (Statics.field2461 == null) {
                    Statics.field2461 = Statics.field1953.method2414(Statics.field1896, Statics.field1914);
                }
                if (Statics.field2461.field2089 == 2) {
                    throw new IOException();
                }
                if (Statics.field2461.field2089 == 1) {
                    Statics.field139 = new class130((Socket) Statics.field2461.field2086, Statics.field1953);
                    Statics.field2461 = null;
                    field459 = 2;
                }
            }
            if (field459 == 2) {
                field304.field1851 = 0;
                field304.method2079(14);
                Statics.field139.method2509(field304.field1854, 0, 1);
                field306.field1851 = 0;
                field459 = 3;
            }
            if (field459 == 3) {
                if (Statics.field2095 != null) {
                    Statics.field2095.method973();
                }
                if (Statics.field918 != null) {
                    Statics.field918.method973();
                }
                int var0 = Statics.field139.method2506();
                if (Statics.field2095 != null) {
                    Statics.field2095.method973();
                }
                if (Statics.field918 != null) {
                    Statics.field918.method973();
                }
                if (var0 != 0) {
                    method158(var0);
                    return;
                }
                field306.field1851 = 0;
                field459 = 5;
            }
            if (field459 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field304.field1851 = 0;
                field304.method2079(1);
                field304.method2079(class28.field663.method451());
                field304.method2082(var1[0]);
                field304.method2082(var1[1]);
                field304.method2082(var1[2]);
                field304.method2082(var1[3]);
                switch(class28.field663.field2425) {
                    case 0:
                    case 2:
                        field304.method2261(Statics.field2427);
                        field304.field1851 += 5;
                        break;
                    case 1:
                        field304.method2082((Integer) Statics.field939.field138.get(class200.method2616(class28.field661)));
                        field304.field1851 += 4;
                        break;
                    case 3:
                        field304.field1851 += 8;
                }
                field304.method2256(class28.field662);
                field304.method2110(class5.field66, class5.field67);
                field470.field1851 = 0;
                if (field270 == 40) {
                    field470.method2079(18);
                } else {
                    field470.method2079(16);
                }
                field470.method2177(0);
                int var2 = field470.field1851;
                field470.method2082(63);
                field470.method2187(field304.field1854, 0, field304.field1851);
                int var3 = field470.field1851;
                field470.method2256(class28.field661);
                field470.method2079(field267 ? 1 : 0);
                class136.method154(field470);
                class107 var4 = new class107(Statics.field1830.method2646());
                Statics.field1830.method2643(var4);
                field470.method2187(var4.field1854, 0, var4.field1854.length);
                field470.method2082(Statics.field1909.field2473);
                field470.method2082(Statics.field2013.field2473);
                field470.method2082(Statics.field2133.field2473);
                field470.method2082(Statics.field246.field2473);
                field470.method2082(Statics.field1275.field2473);
                field470.method2082(Statics.field2038.field2473);
                field470.method2082(Statics.field558.field2473);
                field470.method2082(Statics.field1272.field2473);
                field470.method2082(Statics.field679.field2473);
                field470.method2082(Statics.field873.field2473);
                field470.method2082(Statics.field1883.field2473);
                field470.method2082(Statics.field522.field2473);
                field470.method2082(Statics.field59.field2473);
                field470.method2082(Statics.field2672.field2473);
                field470.method2082(Statics.field609.field2473);
                field470.method2082(Statics.field712.field2473);
                field470.method2108(var1, var3, field470.field1851);
                field470.method2077(field470.field1851 - var2);
                Statics.field139.method2509(field470.field1854, 0, field470.field1851);
                field304.method2305(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field306.method2305(var1);
                field459 = 6;
            }
            if (field459 == 6 && Statics.field139.method2530() > 0) {
                int var6 = Statics.field139.method2506();
                if (var6 == 21 && field270 == 20) {
                    field459 = 7;
                } else if (var6 == 2) {
                    field459 = 9;
                } else if (var6 == 15 && field270 == 40) {
                    method571();
                    return;
                } else if (var6 == 23 && field297 < 1) {
                    field297++;
                    field459 = 0;
                } else {
                    method158(var6);
                    return;
                }
            }
            if (field459 == 7 && Statics.field139.method2530() > 0) {
                field298 = (Statics.field139.method2506() + 3) * 60;
                field459 = 8;
            }
            if (field459 == 8) {
                field296 = 0;
                class28.method2349(class143.field2201, class143.field2202, field298 / 60 + class143.field2203);
                if (--field298 <= 0) {
                    field459 = 0;
                }
            } else {
                if (field459 == 9 && Statics.field139.method2530() >= 13) {
                    boolean var7 = Statics.field139.method2506() == 1;
                    Statics.field139.method2505(field306.field1854, 0, 4);
                    field306.field1851 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field306.method2307() << 24;
                        int var10 = var9 | field306.method2307() << 16;
                        int var11 = var10 | field306.method2307() << 8;
                        int var12 = var11 | field306.method2307();
                        int var13 = class200.method2616(class28.field661);
                        if (Statics.field939.field138.size() >= 10 && !Statics.field939.field138.containsKey(var13)) {
                            Iterator var14 = Statics.field939.field138.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field939.field138.put(var13, var12);
                        class9.method680();
                    }
                    field435 = Statics.field139.method2506();
                    field433 = Statics.field139.method2506() == 1;
                    field388 = Statics.field139.method2506();
                    field388 <<= 0x8;
                    field388 += Statics.field139.method2506();
                    field389 = Statics.field139.method2506();
                    Statics.field139.method2505(field306.field1854, 0, 1);
                    field306.field1851 = 0;
                    field308 = field306.method2307();
                    Statics.field139.method2505(field306.field1854, 0, 2);
                    field306.field1851 = 0;
                    field307 = field306.method2094();
                    if (field389 == 1) {
                        try {
                            class119.method2383(Statics.field260, "zap");
                        } catch (Throwable var37) {
                        }
                    } else {
                        try {
                            class119.method2383(Statics.field260, "unzap");
                        } catch (Throwable var36) {
                        }
                    }
                    field459 = 10;
                }
                if (field459 != 10) {
                    field296++;
                    if (field296 > 2000) {
                        if (field297 < 1) {
                            if (Statics.field299 == Statics.field1914) {
                                Statics.field1914 = Statics.field1968;
                            } else {
                                Statics.field1914 = Statics.field299;
                            }
                            field297++;
                            field459 = 0;
                        } else {
                            method158(-3);
                        }
                    }
                } else if (Statics.field139.method2530() >= field307) {
                    field306.field1851 = 0;
                    Statics.field139.method2505(field306.field1854, 0, field307);
                    field395 = -1L;
                    field520 = -1;
                    Statics.field340.field181 = 0;
                    Statics.field2495 = true;
                    field500 = true;
                    field484 = -1L;
                    class190.method464();
                    field304.field1851 = 0;
                    field306.field1851 = 0;
                    field308 = -1;
                    field481 = -1;
                    field354 = -1;
                    field314 = -1;
                    field309 = 0;
                    field280 = 0;
                    field311 = 0;
                    field281 = 0;
                    field406 = 0;
                    field305 = false;
                    class127.method2836(0);
                    class10.method2();
                    field469 = 0;
                    field419 = false;
                    field295 = 0;
                    field366 = (int) (Math.random() * 100.0D) - 50;
                    field496 = (int) (Math.random() * 110.0D) - 55;
                    field330 = (int) (Math.random() * 80.0D) - 40;
                    field333 = (int) (Math.random() * 120.0D) - 60;
                    field335 = (int) (Math.random() * 30.0D) - 20;
                    field347 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field494 = 0;
                    field487 = -1;
                    field364 = 0;
                    field493 = 0;
                    field362 = class18.field523;
                    field405 = 0;
                    field403 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field337[var17] = null;
                        field387[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field300[var18] = null;
                    }
                    Statics.field1819 = field337[2047] = new class3();
                    field396 = -1;
                    field399.method3183();
                    field400.method3183();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field332[var19][var20][var21] = null;
                            }
                        }
                    }
                    field398 = new class178();
                    field513 = 0;
                    field511 = 0;
                    field516 = 0;
                    for (int var22 = 0; var22 < Statics.field1055; var22++) {
                        class46 var23 = (class46) class46.field1056.method3112((long) var22);
                        class46 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1057.method2703(16, var22);
                            class46 var26 = new class46();
                            if (var25 != null) {
                                var26.method882(new class107(var25));
                            }
                            class46.field1056.method3115(var26, (long) var22);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        if (var24 != null) {
                            class155.field2679[var22] = 0;
                            class155.field2680[var22] = 0;
                        }
                    }
                    for (int var28 = 0; var28 < field375.length; var28++) {
                        field375[var28] = -1;
                    }
                    field432 = -1;
                    if (field424 != -1) {
                        int var29 = field424;
                        if (var29 != -1 && Statics.field2549[var29]) {
                            Statics.field2542.method2671(var29);
                            if (Statics.field2625[var29] != null) {
                                boolean var30 = true;
                                for (int var31 = 0; var31 < Statics.field2625[var29].length; var31++) {
                                    if (Statics.field2625[var29][var31] != null) {
                                        if (Statics.field2625[var29][var31].field2552 == 2) {
                                            var30 = false;
                                        } else {
                                            Statics.field2625[var29][var31] = null;
                                        }
                                    }
                                }
                                if (var30) {
                                    Statics.field2625[var29] = null;
                                }
                                Statics.field2549[var29] = false;
                            }
                        }
                    }
                    for (class4 var32 = (class4) field385.method3154(); var32 != null; var32 = (class4) field385.method3163()) {
                        method2772(var32, true);
                    }
                    field424 = -1;
                    field385 = new class175(8);
                    field463 = null;
                    field305 = false;
                    field406 = 0;
                    field518.method2892((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var33 = 0; var33 < 8; var33++) {
                        field393[var33] = null;
                        field394[var33] = false;
                    }
                    class14.field208 = new class175(32);
                    field474 = true;
                    for (int var34 = 0; var34 < 100; var34++) {
                        field468[var34] = true;
                    }
                    field485 = null;
                    Statics.field32 = 0;
                    Statics.field1778 = null;
                    Statics.field195 = -1;
                    method118(false);
                    field308 = -1;
                }
            }
        } catch (IOException var38) {
            if (field297 < 1) {
                if (Statics.field299 == Statics.field1914) {
                    Statics.field1914 = Statics.field1968;
                } else {
                    Statics.field1914 = Statics.field299;
                }
                field297++;
                field459 = 0;
            } else {
                method158(-2);
            }
        }
    }

    @ObfuscatedName("aj.d(B)V")
    public static void method571() {
        field304.field1851 = 0;
        field306.field1851 = 0;
        field308 = -1;
        field481 = -1;
        field354 = -1;
        field314 = -1;
        field307 = 0;
        field309 = 0;
        field280 = 0;
        field406 = 0;
        field305 = false;
        field494 = 0;
        field364 = 0;
        for (int var0 = 0; var0 < field337.length; var0++) {
            if (field337[var0] != null) {
                field337[var0].field771 = -1;
            }
        }
        for (int var1 = 0; var1 < field300.length; var1++) {
            if (field300[var1] != null) {
                field300[var1].field771 = -1;
            }
        }
        class14.field208 = new class175(32);
        method1376(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field468[var2] = true;
        }
    }

    @ObfuscatedName("h.b(IB)V")
    public static void method158(int arg0) {
        if (arg0 == -3) {
            class28.method2349(class143.field2204, class143.field2205, class143.field2206);
        } else if (arg0 == -2) {
            class28.method2349(class143.field2207, class143.field2232, class143.field2209);
        } else if (arg0 == -1) {
            class28.method2349(class143.field2210, class143.field2191, class143.field2212);
        } else if (arg0 == 3) {
            class28.method2349(class143.field2213, class143.field2214, class143.field2215);
        } else if (arg0 == 4) {
            class28.method2349(class143.field2216, class143.field2217, class143.field2195);
        } else if (arg0 == 5) {
            class28.method2349(class143.field2265, class143.field2286, class143.field2221);
        } else if (arg0 == 6) {
            class28.method2349(class143.field2222, class143.field2246, class143.field2224);
        } else if (arg0 == 7) {
            class28.method2349(class143.field2262, class143.field2358, class143.field2227);
        } else if (arg0 == 8) {
            class28.method2349(class143.field2303, class143.field2229, class143.field2230);
        } else if (arg0 == 9) {
            class28.method2349(class143.field2231, class143.field2359, class143.field2223);
        } else if (arg0 == 10) {
            class28.method2349(class143.field2406, class143.field2235, class143.field2398);
        } else if (arg0 == 11) {
            class28.method2349(class143.field2237, class143.field2238, class143.field2172);
        } else if (arg0 == 12) {
            class28.method2349(class143.field2341, class143.field2241, class143.field2242);
        } else if (arg0 == 13) {
            class28.method2349(class143.field2243, class143.field2244, class143.field2245);
        } else if (arg0 == 14) {
            class28.method2349(class143.field2226, class143.field2247, class143.field2277);
        } else if (arg0 == 16) {
            class28.method2349(class143.field2249, class143.field2193, class143.field2251);
        } else if (arg0 == 17) {
            class28.method2349(class143.field2252, class143.field2253, class143.field2254);
        } else if (arg0 == 18) {
            class28.method2349(class143.field2255, class143.field2367, class143.field2257);
        } else if (arg0 == 19) {
            class28.method2349(class143.field2258, class143.field2259, class143.field2368);
        } else if (arg0 == 20) {
            class28.method2349(class143.field2261, class143.field2321, class143.field2198);
        } else if (arg0 == 22) {
            class28.method2349(class143.field2290, class143.field2320, class143.field2266);
        } else if (arg0 == 23) {
            class28.method2349(class143.field2267, class143.field2268, class143.field2269);
        } else if (arg0 == 24) {
            class28.method2349(class143.field2270, class143.field2180, class143.field2272);
        } else if (arg0 == 25) {
            class28.method2349(class143.field2273, class143.field2274, class143.field2275);
        } else if (arg0 == 26) {
            class28.method2349(class143.field2276, class143.field2323, class143.field2278);
        } else if (arg0 == 27) {
            class28.method2349(class143.field2279, class143.field2280, class143.field2281);
        } else if (arg0 == 31) {
            class28.method2349(class143.field2248, class143.field2344, class143.field2234);
        } else if (arg0 == 32) {
            class28.method2349(class143.field2236, class143.field2292, class143.field2315);
        } else if (arg0 == 37) {
            class28.method2349(class143.field2294, class143.field2239, class143.field2296);
        } else if (arg0 == 38) {
            class28.method2349(class143.field2336, class143.field2326, class143.field2298);
        } else if (arg0 == 55) {
            class28.method2349(class143.field2300, class143.field2301, class143.field2220);
        } else if (arg0 == 56) {
            class28.method2349(class143.field2284, class143.field2250, class143.field2305);
            method1376(11);
            return;
        } else if (arg0 == 57) {
            class28.method2349(class143.field2345, class143.field2307, class143.field2308);
            method1376(11);
            return;
        } else {
            class28.method2349(class143.field2309, class143.field2310, class143.field2342);
        }
        method1376(10);
    }

    @ObfuscatedName("ae.w(I)V")
    public static final void method813() {
        if (Statics.field139 != null) {
            Statics.field139.method2524();
            Statics.field139 = null;
        }
        method85();
        Statics.field16.method1633();
        for (int var0 = 0; var0 < 4; var0++) {
            field322[var0].method3452();
        }
        System.gc();
        class162.method1736(2);
        field451 = -1;
        field497 = false;
        class20.method1008();
        method1376(10);
    }

    @ObfuscatedName("l.z(I)V")
    public static final void method85() {
        class41.method3107();
        class37.field882.method3116();
        class40.field943.method3116();
        class36.field830.method3116();
        class36.field831.method3116();
        class36.field861.method3116();
        class36.field852.method3116();
        class35.method465();
        class45.method2044();
        class38.method1818();
        class39.field922.method3116();
        class39.field919.method3116();
        class42.field971.method3116();
        class46.field1056.method3116();
        class158.field2698.method3116();
        class153.field2545.method3116();
        class153.field2661.method3116();
        class153.field2547.method3116();
        ((class88) Statics.field1487).method1824();
        class19.field533.method3116();
        Statics.field1909.method2672();
        Statics.field2013.method2672();
        Statics.field246.method2672();
        Statics.field1275.method2672();
        Statics.field2038.method2672();
        Statics.field558.method2672();
        Statics.field1272.method2672();
        Statics.field679.method2672();
        Statics.field873.method2672();
        Statics.field1883.method2672();
        Statics.field522.method2672();
        Statics.field59.method2672();
    }

    @ObfuscatedName("fn.x(S)V")
    public static final void method3108() {
        if (field280 > 1) {
            field280--;
        }
        if (field311 > 0) {
            field311--;
        }
        if (field455) {
            field455 = false;
            if (field311 > 0) {
                method813();
            } else {
                method1376(40);
                Statics.field303 = Statics.field139;
                Statics.field139 = null;
            }
            return;
        }
        if (!field305) {
            field411[0] = class143.field2401;
            field412[0] = "";
            field409[0] = 1006;
            field406 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field139 == null) {
                var1 = false;
            } else {
                label2957: {
                    try {
                        int var2 = Statics.field139.method2530();
                        if (var2 == 0) {
                            var1 = false;
                            break label2957;
                        }
                        if (field308 == -1) {
                            Statics.field139.method2505(field306.field1854, 0, 1);
                            field306.field1851 = 0;
                            field308 = field306.method2307();
                            field307 = class167.field2822[field308];
                            var2--;
                        }
                        if (field307 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2957;
                            }
                            Statics.field139.method2505(field306.field1854, 0, 1);
                            field307 = field306.field1854[0] & 0xFF;
                            var2--;
                        }
                        if (field307 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2957;
                            }
                            Statics.field139.method2505(field306.field1854, 0, 2);
                            field306.field1851 = 0;
                            field307 = field306.method2094();
                            var2 -= 2;
                        }
                        if (var2 < field307) {
                            var1 = false;
                            break label2957;
                        }
                        field306.field1851 = 0;
                        Statics.field139.method2505(field306.field1854, 0, field307);
                        field309 = 0;
                        field314 = field354;
                        field354 = field481;
                        field481 = field308;
                        if (field308 == 88) {
                            field306.field1851 += 28;
                            if (field306.method2203()) {
                                Statics.method753(field306, field306.field1851 - 28);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 252) {
                            field506 = true;
                            Statics.field1913 = field306.method2116();
                            Statics.field1354 = field306.method2116();
                            Statics.field1356 = field306.method2094();
                            Statics.field1705 = field306.method2116();
                            Statics.field145 = field306.method2116();
                            if (Statics.field145 >= 100) {
                                Statics.field936 = Statics.field1913 * 128 + 64;
                                Statics.field345 = Statics.field1354 * 128 + 64;
                                Statics.field1300 = method1815(Statics.field936, Statics.field345, Statics.field235) - Statics.field1356;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 168) {
                            method118(true);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 192) {
                            method1836();
                            field429 = field306.method2116();
                            field326 = field448;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 75) {
                            field280 = field306.method2094() * 30;
                            field326 = field448;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 67) {
                            int var3 = field306.method2258();
                            int var4 = field306.method2131();
                            int var5 = field306.method2123();
                            class153 var6 = class153.method117(var4);
                            var6.field2594 = (var5 << 16) + var3;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 133) {
                            int var7 = field306.method2125();
                            class14 var8 = (class14) class14.field208.method3155((long) var7);
                            if (var8 != null) {
                                var8.method3285();
                            }
                            field274[++field318 - 1 & 0x1F] = var7 & 0x7FFF;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 82) {
                            int var9 = field306.method2097();
                            int var10 = field306.method2094();
                            if (var9 < -70000) {
                                var10 += 32768;
                            }
                            class153 var11;
                            if (var9 >= 0) {
                                var11 = class153.method117(var9);
                            } else {
                                var11 = null;
                            }
                            if (var11 != null) {
                                for (int var12 = 0; var12 < var11.field2617.length; var12++) {
                                    var11.field2617[var12] = 0;
                                    var11.field2587[var12] = 0;
                                }
                            }
                            class14.method573(var10);
                            int var13 = field306.method2094();
                            for (int var14 = 0; var14 < var13; var14++) {
                                int var15 = field306.method2116();
                                if (var15 == 255) {
                                    var15 = field306.method2119();
                                }
                                int var16 = field306.method2258();
                                if (var11 != null && var14 < var11.field2617.length) {
                                    var11.field2617[var14] = var16;
                                    var11.field2587[var14] = var15;
                                }
                                class14.method1838(var10, var14, var16 - 1, var15);
                            }
                            if (var11 != null) {
                                method5(var11);
                            }
                            method1836();
                            field274[++field318 - 1 & 0x1F] = var10 & 0x7FFF;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 74) {
                            field477 = field306.method2116();
                            field478 = field306.method2116();
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 49) {
                            method1836();
                            field431 = field306.method2095();
                            field326 = field448;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 201) {
                            int var17 = field306.method2131();
                            class153 var18 = class153.method117(var17);
                            for (int var19 = 0; var19 < var18.field2617.length; var19++) {
                                var18.field2617[var19] = -1;
                                var18.field2617[var19] = 0;
                            }
                            method5(var18);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 155) {
                            int var20 = field306.method2112();
                            boolean var21 = field306.method2116() == 1;
                            String var22 = "";
                            boolean var23 = false;
                            if (var21) {
                                var22 = field306.method2100();
                                if (method1812(var22)) {
                                    var23 = true;
                                }
                            }
                            String var24 = field306.method2100();
                            if (!var23) {
                                class10.method1845(var20, var22, var24);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 45) {
                            while (field306.field1851 < field307) {
                                boolean var25 = field306.method2116() == 1;
                                String var26 = field306.method2100();
                                String var27 = field306.method2100();
                                int var28 = field306.method2094();
                                int var29 = field306.method2116();
                                int var30 = field306.method2116();
                                boolean var31 = (var30 & 0x2) != 0;
                                boolean var32 = (var30 & 0x1) != 0;
                                if (var28 > 0) {
                                    field306.method2100();
                                    field306.method2116();
                                    field306.method2097();
                                }
                                field306.method2100();
                                for (int var33 = 0; var33 < field511; var33++) {
                                    class16 var34 = field514[var33];
                                    if (var25) {
                                        if (var27.equals(var34.field236)) {
                                            var34.field236 = var26;
                                            var34.field238 = var27;
                                            var26 = null;
                                            break;
                                        }
                                    } else if (var26.equals(var34.field236)) {
                                        if (var34.field229 != var28) {
                                            boolean var35 = true;
                                            for (class34 var36 = (class34) field507.method3141(); var36 != null; var36 = (class34) field507.method3149()) {
                                                if (var36.field785.equals(var26)) {
                                                    if (var28 != 0 && var36.field779 == 0) {
                                                        var36.method3280();
                                                        var35 = false;
                                                    } else if (var28 == 0 && var36.field779 != 0) {
                                                        var36.method3280();
                                                        var35 = false;
                                                    }
                                                }
                                            }
                                            if (var35) {
                                                field507.method3140(new class34(var26, var28));
                                            }
                                            var34.field229 = var28;
                                        }
                                        var34.field238 = var27;
                                        var34.field232 = var29;
                                        var34.field233 = var31;
                                        var34.field230 = var32;
                                        var26 = null;
                                        break;
                                    }
                                }
                                if (var26 != null && field511 < 400) {
                                    class16 var37 = new class16();
                                    field514[field511] = var37;
                                    var37.field236 = var26;
                                    var37.field238 = var27;
                                    var37.field229 = var28;
                                    var37.field232 = var29;
                                    var37.field233 = var31;
                                    var37.field230 = var32;
                                    field511++;
                                }
                            }
                            field513 = 2;
                            field456 = field448;
                            boolean var38 = false;
                            int var39 = field511;
                            while (var39 > 0) {
                                boolean var40 = true;
                                var39--;
                                for (int var41 = 0; var41 < var39; var41++) {
                                    boolean var42 = false;
                                    class16 var43 = field514[var41];
                                    class16 var44 = field514[var41 + 1];
                                    if (field262 != var43.field229 && field262 == var44.field229) {
                                        var42 = true;
                                    }
                                    if (!var42 && var43.field229 == 0 && var44.field229 != 0) {
                                        var42 = true;
                                    }
                                    if (!var42 && !var43.field233 && var44.field233) {
                                        var42 = true;
                                    }
                                    if (!var42 && !var43.field230 && var44.field230) {
                                        var42 = true;
                                    }
                                    if (var42) {
                                        class16 var45 = field514[var41];
                                        field514[var41] = field514[var41 + 1];
                                        field514[var41 + 1] = var45;
                                        var40 = false;
                                    }
                                }
                                if (var40) {
                                    break;
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 253) {
                            String var46 = field306.method2100();
                            class110 var47 = field306;
                            String var51;
                            try {
                                int var48 = var47.method2112();
                                if (var48 > 32767) {
                                    var48 = 32767;
                                }
                                byte[] var49 = new byte[var48];
                                var47.field1851 += Statics.field2910.method2029(var47.field1854, var47.field1851, var49, 0, var48);
                                String var50 = class202.method3292(var49, 0, var48);
                                var51 = var50;
                            } catch (Exception var443) {
                                var51 = "Cabbage";
                            }
                            String var54 = class193.method3315(class200.method524(var51));
                            class10.method1845(6, var46, var54);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 37) {
                            for (int var55 = 0; var55 < field337.length; var55++) {
                                if (field337[var55] != null) {
                                    field337[var55].field748 = -1;
                                }
                            }
                            for (int var56 = 0; var56 < field300.length; var56++) {
                                if (field300[var56] != null) {
                                    field300[var56].field748 = -1;
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 160) {
                            field494 = field306.method2116();
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 29) {
                            int var57 = field306.method2131();
                            String var58 = field306.method2100();
                            class153 var59 = class153.method117(var57);
                            if (!var58.equals(var59.field2610)) {
                                var59.field2610 = var58;
                                method5(var59);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 107) {
                            int var60 = field307 + field306.field1851;
                            int var61 = field306.method2094();
                            int var62 = field306.method2094();
                            if (field424 != var61) {
                                field424 = var61;
                                method136(field424);
                                class32.method125(field424);
                                for (int var63 = 0; var63 < 100; var63++) {
                                    field468[var63] = true;
                                }
                            }
                            while (var62-- > 0) {
                                int var64 = field306.method2097();
                                int var65 = field306.method2094();
                                int var66 = field306.method2116();
                                class4 var67 = (class4) field385.method3155((long) var64);
                                if (var67 != null && var67.field60 != var65) {
                                    method2772(var67, true);
                                    var67 = null;
                                }
                                if (var67 == null) {
                                    var67 = method522(var64, var65, var66);
                                }
                                var67.field62 = true;
                            }
                            for (class4 var68 = (class4) field385.method3154(); var68 != null; var68 = (class4) field385.method3163()) {
                                if (var68.field62) {
                                    var68.field62 = false;
                                } else {
                                    method2772(var68, true);
                                }
                            }
                            field465 = new class175(512);
                            while (field306.field1851 < var60) {
                                int var69 = field306.method2097();
                                int var70 = field306.method2094();
                                int var71 = field306.method2094();
                                int var72 = field306.method2097();
                                for (int var73 = var70; var73 <= var71; var73++) {
                                    long var74 = ((long) var69 << 32) + (long) var73;
                                    field465.method3152(new class180(var72), var74);
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 223) {
                            Statics.field690 = class117.method500(field306.method2116());
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 91) {
                            int var76 = field306.method2119();
                            int var77 = field306.method2209();
                            class153 var78 = class153.method117(var76);
                            if (var78.field2608 != var77 || var77 == -1) {
                                var78.field2608 = var77;
                                var78.field2656 = 0;
                                var78.field2657 = 0;
                                method5(var78);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 246) {
                            for (int var79 = 0; var79 < class155.field2680.length; var79++) {
                                if (class155.field2680[var79] != class155.field2679[var79]) {
                                    class155.field2680[var79] = class155.field2679[var79];
                                    method523(var79);
                                    field449[++field450 - 1 & 0x1F] = var79;
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 17) {
                            int var80 = field306.method2258();
                            int var81 = field306.method2131();
                            int var82 = var80 >> 10 & 0x1F;
                            int var83 = var80 >> 5 & 0x1F;
                            int var84 = var80 & 0x1F;
                            int var85 = (var84 << 3) + (var82 << 19) + (var83 << 11);
                            class153 var86 = class153.method117(var81);
                            if (var86.field2567 != var85) {
                                var86.field2567 = var85;
                                method5(var86);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 195) {
                            byte var87 = field306.method2118();
                            int var88 = field306.method2123();
                            class155.field2679[var88] = var87;
                            if (class155.field2680[var88] != var87) {
                                class155.field2680[var88] = var87;
                                method523(var88);
                            }
                            field449[++field450 - 1 & 0x1F] = var88;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 179) {
                            int var89 = field306.method2258();
                            if (var89 == 65535) {
                                var89 = -1;
                            }
                            int var90 = field306.method2119();
                            int var91 = field306.method2125();
                            if (var91 == 65535) {
                                var91 = -1;
                            }
                            int var92 = field306.method2097();
                            for (int var93 = var91; var93 <= var89; var93++) {
                                long var94 = ((long) var90 << 32) + (long) var93;
                                class187 var96 = field465.method3155(var94);
                                if (var96 != null) {
                                    var96.method3285();
                                }
                                field465.method3152(new class180(var92), var94);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 254) {
                            Statics.field2675 = field306.method2194();
                            Statics.field2004 = field306.method2194();
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 123) {
                            int var97 = field306.method2132();
                            int var98 = field306.method2125();
                            class153 var99 = class153.method117(var97);
                            if (var99 != null && var99.field2552 == 0) {
                                if (var98 > var99.field2639 - var99.field2560) {
                                    var98 = var99.field2639 - var99.field2560;
                                }
                                if (var98 < 0) {
                                    var98 = 0;
                                }
                                if (var99.field2546 != var98) {
                                    var99.field2546 = var98;
                                    method5(var99);
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 227) {
                            int var100 = field306.method2132();
                            int var101 = field306.method2094();
                            if (var101 == 65535) {
                                var101 = -1;
                            }
                            int var102 = field306.method2131();
                            class153 var103 = class153.method117(var100);
                            if (var103.field2612) {
                                var103.field2576 = var101;
                                var103.field2655 = var102;
                                class45 var105 = class45.method2351(var101);
                                var103.field2590 = var105.field1017;
                                var103.field2591 = var105.field1018;
                                var103.field2592 = var105.field1019;
                                var103.field2588 = var105.field1020;
                                var103.field2589 = var105.field1026;
                                var103.field2593 = var105.field1016;
                                if (var103.field2563 > 0) {
                                    var103.field2593 = var103.field2593 * 32 / var103.field2563;
                                }
                                method5(var103);
                            } else {
                                if (var101 == -1) {
                                    var103.field2582 = 0;
                                    field308 = -1;
                                    var1 = true;
                                    break label2957;
                                }
                                class45 var104 = class45.method2351(var101);
                                var103.field2582 = 4;
                                var103.field2583 = var101;
                                var103.field2590 = var104.field1017;
                                var103.field2591 = var104.field1018;
                                var103.field2593 = var104.field1016 * 100 / var102;
                                method5(var103);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 10) {
                            method884();
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 215) {
                            field281 = field306.method2116();
                            if (field281 == 1) {
                                field282 = field306.method2094();
                            }
                            if (field281 >= 2 && field281 <= 6) {
                                if (field281 == 2) {
                                    field287 = 64;
                                    field288 = 64;
                                }
                                if (field281 == 3) {
                                    field287 = 0;
                                    field288 = 64;
                                }
                                if (field281 == 4) {
                                    field287 = 128;
                                    field288 = 64;
                                }
                                if (field281 == 5) {
                                    field287 = 64;
                                    field288 = 0;
                                }
                                if (field281 == 6) {
                                    field287 = 64;
                                    field288 = 128;
                                }
                                field281 = 2;
                                field430 = field306.method2094();
                                field428 = field306.method2094();
                                field286 = field306.method2116();
                            }
                            if (field281 == 10) {
                                field452 = field306.method2094();
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 64) {
                            int var106 = field306.method2125();
                            int var107 = field306.method2194();
                            int var108 = field306.method2132();
                            class4 var109 = (class4) field385.method3155((long) var108);
                            if (var109 != null) {
                                method2772(var109, var109.field60 != var106);
                            }
                            method522(var108, var106, var107);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 96) {
                            int var110 = field306.method2097();
                            int var111 = field306.method2094();
                            if (var110 < -70000) {
                                var111 += 32768;
                            }
                            class153 var112;
                            if (var110 >= 0) {
                                var112 = class153.method117(var110);
                            } else {
                                var112 = null;
                            }
                            while (field306.field1851 < field307) {
                                int var113 = field306.method2112();
                                int var114 = field306.method2094();
                                int var115 = 0;
                                if (var114 != 0) {
                                    var115 = field306.method2116();
                                    if (var115 == 255) {
                                        var115 = field306.method2097();
                                    }
                                }
                                if (var112 != null && var113 >= 0 && var113 < var112.field2617.length) {
                                    var112.field2617[var113] = var114;
                                    var112.field2587[var113] = var115;
                                }
                                class14.method1838(var111, var113, var114 - 1, var115);
                            }
                            if (var112 != null) {
                                method5(var112);
                            }
                            method1836();
                            field274[++field318 - 1 & 0x1F] = var111 & 0x7FFF;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 221) {
                            for (int var116 = 0; var116 < Statics.field1055; var116++) {
                                class46 var117 = (class46) class46.field1056.method3112((long) var116);
                                class46 var118;
                                if (var117 == null) {
                                    byte[] var119 = Statics.field1057.method2703(16, var116);
                                    class46 var120 = new class46();
                                    if (var119 != null) {
                                        var120.method882(new class107(var119));
                                    }
                                    class46.field1056.method3115(var120, (long) var116);
                                    var118 = var120;
                                } else {
                                    var118 = var117;
                                }
                                if (var118 != null) {
                                    class155.field2679[var116] = 0;
                                    class155.field2680[var116] = 0;
                                }
                            }
                            method1836();
                            field450 += 32;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 81) {
                            int var122 = field306.method2123();
                            int var123 = field306.method2125();
                            int var124 = field306.method2119();
                            int var125 = field306.method2125();
                            class153 var126 = class153.method117(var124);
                            if (var126.field2590 != var122 || var126.field2591 != var125 || var126.field2593 != var123) {
                                var126.field2590 = var122;
                                var126.field2591 = var125;
                                var126.field2593 = var123;
                                method5(var126);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 224) {
                            int var127 = field306.method2131();
                            Statics.field1776 = Statics.field1953.method2415(var127);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 61) {
                            int var128 = field306.method2116();
                            int var129 = field306.method2116();
                            int var130 = field306.method2116();
                            int var131 = field306.method2116();
                            field457[var128] = true;
                            field508[var128] = var129;
                            field509[var128] = var130;
                            field510[var128] = var131;
                            field273[var128] = 0;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 146) {
                            field506 = true;
                            Statics.field689 = field306.method2116();
                            Statics.field1049 = field306.method2116();
                            Statics.field190 = field306.method2094();
                            Statics.field1504 = field306.method2116();
                            Statics.field1295 = field306.method2116();
                            if (Statics.field1295 >= 100) {
                                int var132 = Statics.field689 * 128 + 64;
                                int var133 = Statics.field1049 * 128 + 64;
                                int var134 = method1815(var132, var133, Statics.field235) - Statics.field190;
                                int var135 = var132 - Statics.field936;
                                int var136 = var134 - Statics.field1300;
                                int var137 = var133 - Statics.field345;
                                int var138 = (int) Math.sqrt((double) (var135 * var135 + var137 * var137));
                                Statics.field89 = (int) (Math.atan2((double) var136, (double) var138) * 325.949D) & 0x7FF;
                                Statics.field19 = (int) (Math.atan2((double) var135, (double) var137) * -325.949D) & 0x7FF;
                                if (Statics.field89 < 128) {
                                    Statics.field89 = 128;
                                }
                                if (Statics.field89 > 383) {
                                    Statics.field89 = 383;
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 139) {
                            int var139 = field306.method2094();
                            if (var139 == 65535) {
                                var139 = -1;
                            }
                            method1377(var139);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 190) {
                            int var140 = field306.method2258();
                            if (var140 == 65535) {
                                var140 = -1;
                            }
                            int var141 = field306.method2096();
                            method2395(var140, var141);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 222) {
                            class190.method2640(field306, field307);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 169) {
                            int var142 = field306.method2116();
                            String var143 = field306.method2100();
                            int var144 = field306.method2116();
                            if (var142 >= 1 && var142 <= 8) {
                                if (var143.equalsIgnoreCase("null")) {
                                    var143 = null;
                                }
                                field393[var142 - 1] = var143;
                                field394[var142 - 1] = var144 == 0;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 19) {
                            method813();
                            field308 = -1;
                            var1 = false;
                            break label2957;
                        }
                        if (field308 == 6) {
                            Statics.field2675 = field306.method2253();
                            Statics.field2004 = field306.method2117();
                            while (field306.field1851 < field307) {
                                field308 = field306.method2116();
                                method570();
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 21) {
                            method118(false);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 177) {
                            int var145 = field306.method2144();
                            int var146 = field306.method2095();
                            int var147 = field306.method2131();
                            class153 var148 = class153.method117(var147);
                            int var149 = var148.field2557 + var145;
                            int var150 = var148.field2632 + var146;
                            if (var148.field2555 != var149 || var148.field2556 != var150) {
                                var148.field2555 = var149;
                                var148.field2556 = var150;
                                method5(var148);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 47) {
                            int var151 = field306.method2132();
                            boolean var152 = field306.method2253() == 1;
                            class153 var153 = class153.method117(var151);
                            if (var153.field2562 != var152) {
                                var153.field2562 = var152;
                                method5(var153);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 52) {
                            method1836();
                            int var154 = field306.method2117();
                            int var155 = field306.method2131();
                            int var156 = field306.method2253();
                            field492[var154] = var155;
                            field401[var154] = var156;
                            field402[var154] = 1;
                            for (int var157 = 0; var157 < 98; var157++) {
                                if (var155 >= class141.field2150[var157]) {
                                    field402[var154] = var157 + 2;
                                }
                            }
                            field490[++field454 - 1 & 0x1F] = var154;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 3) {
                            String var158 = field306.method2100();
                            long var159 = field306.method2086();
                            long var161 = (long) field306.method2094();
                            long var163 = (long) field306.method2096();
                            class138 var165 = (class138) class99.method1567(class138.method520(), field306.method2116());
                            long var166 = (var161 << 32) + var163;
                            boolean var168 = false;
                            for (int var169 = 0; var169 < 100; var169++) {
                                if (field479[var169] == var166) {
                                    var168 = true;
                                    break;
                                }
                            }
                            if (var165.field2124 && method1812(var158)) {
                                var168 = true;
                            }
                            if (!var168 && field381 == 0) {
                                field479[field407] = var166;
                                field407 = (field407 + 1) % 100;
                                class110 var170 = field306;
                                String var174;
                                try {
                                    int var171 = var170.method2112();
                                    if (var171 > 32767) {
                                        var171 = 32767;
                                    }
                                    byte[] var172 = new byte[var171];
                                    var170.field1851 += Statics.field2910.method2029(var170.field1854, var170.field1851, var172, 0, var171);
                                    String var173 = class202.method3292(var172, 0, var171);
                                    var174 = var173;
                                } catch (Exception var442) {
                                    var174 = "Cabbage";
                                }
                                String var177 = class193.method3315(class200.method524(var174));
                                if (var165.field2120 == -1) {
                                    class10.method3306(9, var158, var177, class199.method568(var159));
                                } else {
                                    class10.method3306(9, class2.method2783(var165.field2120) + var158, var177, class199.method568(var159));
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 15) {
                            int var178 = field306.method2253();
                            int var179 = field306.method2253();
                            int var180 = field306.method2116();
                            Statics.field235 = var179 >> 1;
                            Statics.field1819.method590(var180, var178, (var179 & 0x1) == 1);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 72) {
                            while (field306.field1851 < field307) {
                                int var181 = field306.method2116();
                                boolean var182 = (var181 & 0x1) == 1;
                                String var183 = field306.method2100();
                                String var184 = field306.method2100();
                                field306.method2100();
                                for (int var185 = 0; var185 < field516; var185++) {
                                    class8 var186 = field517[var185];
                                    if (var182) {
                                        if (var184.equals(var186.field133)) {
                                            var186.field133 = var183;
                                            var186.field132 = var184;
                                            var183 = null;
                                            break;
                                        }
                                    } else if (var183.equals(var186.field133)) {
                                        var186.field133 = var183;
                                        var186.field132 = var184;
                                        var183 = null;
                                        break;
                                    }
                                }
                                if (var183 != null && field516 < 400) {
                                    class8 var187 = new class8();
                                    field517[field516] = var187;
                                    var187.field133 = var183;
                                    var187.field132 = var184;
                                    field516++;
                                }
                            }
                            field456 = field448;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 122) {
                            field506 = false;
                            for (int var188 = 0; var188 < 5; var188++) {
                                field457[var188] = false;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 198) {
                            field513 = 1;
                            field456 = field448;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 212) {
                            field390 = 0;
                            field512 = 0;
                            method2526();
                            int var189 = field306.method2309(8);
                            if (var189 < field405) {
                                for (int var190 = var189; var190 < field405; var190++) {
                                    field277[++field390 - 1] = field384[var190];
                                }
                            }
                            if (var189 > field405) {
                                throw new RuntimeException("");
                            }
                            field405 = 0;
                            for (int var191 = 0; var191 < var189; var191++) {
                                int var192 = field384[var191];
                                class3 var193 = field337[var192];
                                int var194 = field306.method2309(1);
                                if (var194 == 0) {
                                    field384[++field405 - 1] = var192;
                                    var193.field765 = field316;
                                } else {
                                    int var195 = field306.method2309(2);
                                    if (var195 == 0) {
                                        field384[++field405 - 1] = var192;
                                        var193.field765 = field316;
                                        field386[++field512 - 1] = var192;
                                    } else if (var195 == 1) {
                                        field384[++field405 - 1] = var192;
                                        var193.field765 = field316;
                                        int var196 = field306.method2309(3);
                                        var193.method595(var196, false);
                                        int var197 = field306.method2309(1);
                                        if (var197 == 1) {
                                            field386[++field512 - 1] = var192;
                                        }
                                    } else if (var195 == 2) {
                                        field384[++field405 - 1] = var192;
                                        var193.field765 = field316;
                                        int var198 = field306.method2309(3);
                                        var193.method595(var198, true);
                                        int var199 = field306.method2309(3);
                                        var193.method595(var199, true);
                                        int var200 = field306.method2309(1);
                                        if (var200 == 1) {
                                            field386[++field512 - 1] = var192;
                                        }
                                    } else if (var195 == 3) {
                                        field277[++field390 - 1] = var192;
                                    }
                                }
                            }
                            while (field306.method2311(field307) >= 11) {
                                int var201 = field306.method2309(11);
                                if (var201 == 2047) {
                                    break;
                                }
                                boolean var202 = false;
                                if (field337[var201] == null) {
                                    field337[var201] = new class3();
                                    if (field387[var201] != null) {
                                        field337[var201].method16(field387[var201]);
                                    }
                                    var202 = true;
                                }
                                field384[++field405 - 1] = var201;
                                class3 var203 = field337[var201];
                                var203.field765 = field316;
                                int var204 = field306.method2309(5);
                                if (var204 > 15) {
                                    var204 -= 32;
                                }
                                int var205 = field306.method2309(1);
                                int var206 = field290[field306.method2309(3)];
                                if (var202) {
                                    var203.field767 = var203.field740 = var206;
                                }
                                int var207 = field306.method2309(5);
                                if (var207 > 15) {
                                    var207 -= 32;
                                }
                                int var208 = field306.method2309(1);
                                if (var208 == 1) {
                                    field386[++field512 - 1] = var201;
                                }
                                var203.method590(Statics.field1819.field720[0] + var204, Statics.field1819.field733[0] + var207, var205 == 1);
                            }
                            field306.method2319();
                            Statics.method15();
                            for (int var209 = 0; var209 < field390; var209++) {
                                int var210 = field277[var209];
                                if (field316 != field337[var210].field765) {
                                    field337[var210] = null;
                                }
                            }
                            if (field307 != field306.field1851) {
                                throw new RuntimeException(field306.field1851 + class2.field21 + field307);
                            }
                            for (int var211 = 0; var211 < field405; var211++) {
                                if (field337[field384[var211]] == null) {
                                    throw new RuntimeException(var211 + class2.field21 + field405);
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 121) {
                            String var212 = field306.method2100();
                            Object[] var213 = new Object[var212.length() + 1];
                            for (int var214 = var212.length() - 1; var214 >= 0; var214--) {
                                if (var212.charAt(var214) == 's') {
                                    var213[var214 + 1] = field306.method2100();
                                } else {
                                    var213[var214 + 1] = Integer.valueOf(field306.method2097());
                                }
                            }
                            var213[0] = Integer.valueOf(field306.method2097());
                            class1 var215 = new class1();
                            var215.field8 = var213;
                            class32.method1569(var215, 200000);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 196) {
                            field364 = field306.method2116();
                            if (field364 == 255) {
                                field364 = 0;
                            }
                            field493 = field306.method2116();
                            if (field493 == 255) {
                                field493 = 0;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 176) {
                            int var216 = field306.method2125();
                            field424 = var216;
                            method136(var216);
                            class32.method125(field424);
                            for (int var217 = 0; var217 < 100; var217++) {
                                field468[var217] = true;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 204) {
                            int var218 = field306.method2097();
                            class4 var219 = (class4) field385.method3155((long) var218);
                            if (var219 != null) {
                                method2772(var219, true);
                            }
                            if (field463 != null) {
                                method5(field463);
                                field463 = null;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 87) {
                            String var220 = field306.method2100();
                            int var221 = field306.method2094();
                            byte var222 = field306.method2093();
                            boolean var223 = false;
                            if (var222 == -128) {
                                var223 = true;
                            }
                            if (var223) {
                                if (Statics.field32 == 0) {
                                    field308 = -1;
                                    var1 = true;
                                    break label2957;
                                }
                                boolean var224 = false;
                                int var225;
                                for (var225 = 0; var225 < Statics.field32 && (!Statics.field1778[var225].field566.equals(var220) || Statics.field1778[var225].field563 != var221); var225++) {
                                }
                                if (var225 < Statics.field32) {
                                    while (var225 < Statics.field32 - 1) {
                                        Statics.field1778[var225] = Statics.field1778[var225 + 1];
                                        var225++;
                                    }
                                    Statics.field32--;
                                    Statics.field1778[Statics.field32] = null;
                                }
                            } else {
                                field306.method2100();
                                class21 var226 = new class21();
                                var226.field566 = var220;
                                var226.field570 = class201.method2039(var226.field566, Statics.field70);
                                var226.field563 = var221;
                                var226.field564 = var222;
                                int var227;
                                for (var227 = Statics.field32 - 1; var227 >= 0; var227--) {
                                    int var228 = Statics.field1778[var227].field570.compareTo(var226.field566);
                                    if (var228 == 0) {
                                        Statics.field1778[var227].field563 = var221;
                                        Statics.field1778[var227].field564 = var222;
                                        if (var220.equals(Statics.field1819.field39)) {
                                            Statics.field2498 = var222;
                                        }
                                        field440 = field448;
                                        field308 = -1;
                                        var1 = true;
                                        break label2957;
                                    }
                                    if (var228 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field32 >= Statics.field1778.length) {
                                    field308 = -1;
                                    var1 = true;
                                    break label2957;
                                }
                                for (int var229 = Statics.field32 - 1; var229 > var227; var229--) {
                                    Statics.field1778[var229 + 1] = Statics.field1778[var229];
                                }
                                if (Statics.field32 == 0) {
                                    Statics.field1778 = new class21[100];
                                }
                                Statics.field1778[var227 + 1] = var226;
                                Statics.field32++;
                                if (var220.equals(Statics.field1819.field39)) {
                                    Statics.field2498 = var222;
                                }
                            }
                            field440 = field448;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 144) {
                            int var230 = field306.method2125();
                            int var231 = field306.method2132();
                            class155.field2679[var230] = var231;
                            if (class155.field2680[var230] != var231) {
                                class155.field2680[var230] = var231;
                                method523(var230);
                            }
                            field449[++field450 - 1 & 0x1F] = var230;
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 98) {
                            class22 var232 = new class22();
                            var232.field574 = field306.method2100();
                            var232.field577 = field306.method2094();
                            int var233 = field306.method2097();
                            var232.field572 = var233;
                            method1376(45);
                            Statics.field139.method2524();
                            Statics.field139 = null;
                            class28.method139(var232);
                            field308 = -1;
                            var1 = false;
                            break label2957;
                        }
                        if (field308 == 132) {
                            field440 = field448;
                            if (field307 == 0) {
                                field485 = null;
                                field486 = null;
                                Statics.field32 = 0;
                                Statics.field1778 = null;
                                field308 = -1;
                                var1 = true;
                            } else {
                                field486 = field306.method2100();
                                long var234 = field306.method2086();
                                long var236 = var234;
                                String var238;
                                if (var234 <= 0L || var234 >= 6582952005840035281L) {
                                    var238 = null;
                                } else if (var234 % 37L == 0L) {
                                    var238 = null;
                                } else {
                                    int var239 = 0;
                                    for (long var240 = var234; var240 != 0L; var240 /= 37L) {
                                        var239++;
                                    }
                                    StringBuilder var242 = new StringBuilder(var239);
                                    while (var236 != 0L) {
                                        long var243 = var236;
                                        var236 /= 37L;
                                        var242.append(class199.field2965[(int) (var243 - var236 * 37L)]);
                                    }
                                    var238 = var242.reverse().toString();
                                }
                                field485 = var238;
                                Statics.field210 = field306.method2093();
                                int var245 = field306.method2116();
                                if (var245 == 255) {
                                    field308 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field32 = var245;
                                    class21[] var246 = new class21[100];
                                    for (int var247 = 0; var247 < Statics.field32; var247++) {
                                        var246[var247] = new class21();
                                        var246[var247].field566 = field306.method2100();
                                        var246[var247].field570 = class201.method2039(var246[var247].field566, Statics.field70);
                                        var246[var247].field563 = field306.method2094();
                                        var246[var247].field564 = field306.method2093();
                                        field306.method2100();
                                        if (var246[var247].field566.equals(Statics.field1819.field39)) {
                                            Statics.field2498 = var246[var247].field564;
                                        }
                                    }
                                    boolean var248 = false;
                                    int var249 = Statics.field32;
                                    while (var249 > 0) {
                                        boolean var250 = true;
                                        var249--;
                                        for (int var251 = 0; var251 < var249; var251++) {
                                            if (var246[var251].field570.compareTo(var246[var251 + 1].field570) > 0) {
                                                class21 var252 = var246[var251];
                                                var246[var251] = var246[var251 + 1];
                                                var246[var251 + 1] = var252;
                                                var250 = false;
                                            }
                                        }
                                        if (var250) {
                                            break;
                                        }
                                    }
                                    Statics.field1778 = var246;
                                    field308 = -1;
                                    var1 = true;
                                }
                            }
                            break label2957;
                        }
                        if (field308 == 199) {
                            int var253 = field306.method2097();
                            class153 var254 = class153.method117(var253);
                            var254.field2582 = 3;
                            var254.field2583 = Statics.field1819.field45.method2878();
                            method5(var254);
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 84) {
                            if (field424 != -1) {
                                int var255 = field424;
                                if (class153.method469(var255)) {
                                    method2603(Statics.field2625[var255], 0);
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 205) {
                            int var256 = field306.method2132();
                            int var257 = field306.method2258();
                            class153 var258 = class153.method117(var256);
                            if (var258.field2582 != 1 || var258.field2583 != var257) {
                                var258.field2582 = 1;
                                var258.field2583 = var257;
                                method5(var258);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 23) {
                            Statics.field2675 = field306.method2194();
                            Statics.field2004 = field306.method2194();
                            for (int var259 = Statics.field2675; var259 < Statics.field2675 + 8; var259++) {
                                for (int var260 = Statics.field2004; var260 < Statics.field2004 + 8; var260++) {
                                    if (field332[Statics.field235][var259][var260] != null) {
                                        field332[Statics.field235][var259][var260] = null;
                                        method74(var259, var260);
                                    }
                                }
                            }
                            for (class15 var261 = (class15) field398.method3189(); var261 != null; var261 = (class15) field398.method3182()) {
                                if (var261.field218 >= Statics.field2675 && var261.field218 < Statics.field2675 + 8 && var261.field213 >= Statics.field2004 && var261.field213 < Statics.field2004 + 8 && Statics.field235 == var261.field223) {
                                    var261.field221 = 0;
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 175) {
                            int var262 = field306.method2097();
                            int var263 = field306.method2123();
                            class153 var264 = class153.method117(var262);
                            if (var264.field2582 != 2 || var264.field2583 != var263) {
                                var264.field2582 = 2;
                                var264.field2583 = var263;
                                method5(var264);
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 99 || field308 == 218 || field308 == 40 || field308 == 90 || field308 == 1 || field308 == 251 || field308 == 12 || field308 == 138 || field308 == 250 || field308 == 170) {
                            method570();
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 113) {
                            int var265 = field306.method2094();
                            int var266 = field306.method2116();
                            int var267 = field306.method2094();
                            if (field434 != 0 && var266 != 0 && field295 < 50) {
                                field271[field295] = var265;
                                field502[field295] = var266;
                                field391[field295] = var267;
                                field505[field295] = null;
                                field504[field295] = 0;
                                field295++;
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        if (field308 == 16) {
                            String var271 = field306.method2100();
                            long var272 = (long) field306.method2094();
                            long var274 = (long) field306.method2096();
                            class138 var276 = (class138) class99.method1567(class138.method520(), field306.method2116());
                            long var277 = (var272 << 32) + var274;
                            boolean var279 = false;
                            for (int var280 = 0; var280 < 100; var280++) {
                                if (field479[var280] == var277) {
                                    var279 = true;
                                    break;
                                }
                            }
                            if (method1812(var271)) {
                                var279 = true;
                            }
                            if (!var279 && field381 == 0) {
                                field479[field407] = var277;
                                field407 = (field407 + 1) % 100;
                                class110 var281 = field306;
                                String var285;
                                try {
                                    int var282 = var281.method2112();
                                    if (var282 > 32767) {
                                        var282 = 32767;
                                    }
                                    byte[] var283 = new byte[var282];
                                    var281.field1851 += Statics.field2910.method2029(var281.field1854, var281.field1851, var283, 0, var282);
                                    String var284 = class202.method3292(var283, 0, var282);
                                    var285 = var284;
                                } catch (Exception var441) {
                                    var285 = "Cabbage";
                                }
                                String var288 = class193.method3315(class200.method524(var285));
                                byte var289;
                                if (var276.field2123) {
                                    var289 = 7;
                                } else {
                                    var289 = 3;
                                }
                                if (var276.field2120 == -1) {
                                    class10.method1845(var289, var271, var288);
                                } else {
                                    class10.method1845(var289, class2.method2783(var276.field2120) + var271, var288);
                                }
                            }
                            field308 = -1;
                            var1 = true;
                            break label2957;
                        }
                        class135.method1813("" + field308 + class2.field21 + field354 + class2.field21 + field314 + class2.field21 + field307, (Throwable) null);
                        method813();
                    } catch (IOException var446) {
                        if (field311 > 0) {
                            method813();
                        } else {
                            method1376(40);
                            Statics.field303 = Statics.field139;
                            Statics.field139 = null;
                        }
                    } catch (Exception var447) {
                        String var292 = "" + field308 + class2.field21 + field354 + class2.field21 + field314 + class2.field21 + field307 + class2.field21 + (Statics.field256 + Statics.field1819.field720[0]) + class2.field21 + (Statics.field879 + Statics.field1819.field733[0]) + class2.field21;
                        for (int var293 = 0; var293 < field307 && var293 < 50; var293++) {
                            var292 = var292 + field306.field1854[var293] + class2.field21;
                        }
                        class135.method1813(var292, var447);
                        method813();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field270 != 30) {
            return;
        }
        while (class190.method2986()) {
            field304.method2306(217);
            field304.method2079(0);
            int var294 = field304.field1851;
            class190.method2024(field304);
            field304.method2146(field304.field1851 - var294);
        }
        Object var295 = Statics.field340.field179;
        synchronized (Statics.field340.field179) {
            if (!field312) {
                Statics.field340.field181 = 0;
            } else if (class127.field2034 != 0 || Statics.field340.field181 >= 40) {
                field304.method2306(99);
                field304.method2079(0);
                int var296 = field304.field1851;
                int var297 = 0;
                for (int var298 = 0; var298 < Statics.field340.field181 && field304.field1851 - var296 < 240; var298++) {
                    var297++;
                    int var299 = Statics.field340.field183[var298];
                    if (var299 < 0) {
                        var299 = 0;
                    } else if (var299 > 502) {
                        var299 = 502;
                    }
                    int var300 = Statics.field340.field182[var298];
                    if (var300 < 0) {
                        var300 = 0;
                    } else if (var300 > 764) {
                        var300 = 764;
                    }
                    int var301 = var299 * 765 + var300;
                    if (Statics.field340.field183[var298] == -1 && Statics.field340.field182[var298] == -1) {
                        var300 = -1;
                        var299 = -1;
                        var301 = 524287;
                    }
                    if (field275 != var300 || field276 != var299) {
                        int var302 = var300 - field275;
                        field275 = var300;
                        int var303 = var299 - field276;
                        field276 = var299;
                        if (field520 < 8 && var302 >= -32 && var302 <= 31 && var303 >= -32 && var303 <= 31) {
                            var302 += 32;
                            var303 += 32;
                            field304.method2177((field520 << 12) + (var302 << 6) + var303);
                            field520 = 0;
                        } else if (field520 < 8) {
                            field304.method2261((field520 << 19) + 8388608 + var301);
                            field520 = 0;
                        } else {
                            field304.method2082((field520 << 19) + -1073741824 + var301);
                            field520 = 0;
                        }
                    } else if (field520 < 2047) {
                        field520++;
                    }
                }
                field304.method2146(field304.field1851 - var296);
                if (var297 >= Statics.field340.field181) {
                    Statics.field340.field181 = 0;
                } else {
                    Statics.field340.field181 -= var297;
                    for (int var304 = 0; var304 < Statics.field340.field181; var304++) {
                        Statics.field340.field182[var304] = Statics.field340.field182[var297 + var304];
                        Statics.field340.field183[var304] = Statics.field340.field183[var297 + var304];
                    }
                }
            }
        }
        if (class127.field2034 == 1 || !Statics.field2146 && class127.field2034 == 4 || class127.field2034 == 2) {
            long var306 = (class127.field2025 - field395) / 50L;
            if (var306 > 4095L) {
                var306 = 4095L;
            }
            field395 = class127.field2025;
            int var308 = class127.field2036;
            if (var308 < 0) {
                var308 = 0;
            } else if (var308 > 502) {
                var308 = 502;
            }
            int var309 = class127.field2028;
            if (var309 < 0) {
                var309 = 0;
            } else if (var309 > 764) {
                var309 = 764;
            }
            int var310 = var308 * 765 + var309;
            byte var311 = 0;
            if (class127.field2034 == 2) {
                var311 = 1;
            }
            int var312 = (int) var306;
            field304.method2306(29);
            field304.method2082((var311 << 19) + (var312 << 20) + var310);
        }
        if (class124.field1996 > 0) {
            field304.method2306(13);
            field304.method2177(0);
            int var313 = field304.field1851;
            long var314 = class103.method1837();
            for (int var316 = 0; var316 < class124.field1996; var316++) {
                long var317 = var314 - field484;
                if (var317 > 16777215L) {
                    var317 = 16777215L;
                }
                field484 = var314;
                field304.method2079(class124.field1975[var316]);
                field304.method2261((int) var317);
            }
            field304.method2077(field304.field1851 - var313);
        }
        if (field352 > 0) {
            field352--;
        }
        if (class124.field1994[96] || class124.field1994[97] || class124.field1994[98] || class124.field1994[99]) {
            field285 = true;
        }
        if (field285 && field352 <= 0) {
            field352 = 20;
            field285 = false;
            field304.method2306(212);
            field304.method2122(field347);
            field304.method2177(field346);
        }
        if (Statics.field2495 && !field500) {
            field500 = true;
            field304.method2306(30);
            field304.method2079(1);
        }
        if (!Statics.field2495 && field500) {
            field500 = false;
            field304.method2306(30);
            field304.method2079(0);
        }
        if (field267 && Statics.field235 != field397) {
            method479(Statics.field195, Statics.field683, Statics.field235, Statics.field1819.field720[0], Statics.field1819.field733[0]);
        } else if (Statics.field235 != field487) {
            field487 = Statics.field235;
            int var319 = Statics.field235;
            int[] var320 = Statics.field1456.field1307;
            int var321 = var320.length;
            for (int var322 = 0; var322 < var321; var322++) {
                var320[var322] = 0;
            }
            for (int var323 = 1; var323 < 103; var323++) {
                int var324 = (103 - var323) * 2048 + 24628;
                for (int var325 = 1; var325 < 103; var325++) {
                    if ((class6.field80[var319][var325][var323] & 0x18) == 0) {
                        Statics.field16.method1610(var320, var324, 512, var319, var325, var323);
                    }
                    if (var319 < 3 && (class6.field80[var319 + 1][var325][var323] & 0x8) != 0) {
                        Statics.field16.method1610(var320, var324, 512, var319 + 1, var325, var323);
                    }
                    var324 += 4;
                }
            }
            int var326 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var327 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1456.method1469();
            for (int var328 = 1; var328 < 103; var328++) {
                for (int var329 = 1; var329 < 103; var329++) {
                    if ((class6.field80[var319][var329][var328] & 0x18) == 0) {
                        method2532(var319, var329, var328, var326, var327);
                    }
                    if (var319 < 3 && (class6.field80[var319 + 1][var329][var328] & 0x8) != 0) {
                        method2532(var319 + 1, var329, var328, var326, var327);
                    }
                }
            }
            field501 = 0;
            for (int var330 = 0; var330 < 104; var330++) {
                for (int var331 = 0; var331 < 104; var331++) {
                    int var332 = Statics.field16.method1605(Statics.field235, var330, var331);
                    if (var332 != 0) {
                        int var333 = var332 >> 14 & 0x7FFF;
                        int var334 = class36.method2624(var333).field877;
                        if (var334 >= 0) {
                            int var335 = var330;
                            int var336 = var331;
                            if (var334 != 22 && var334 != 29 && var334 != 34 && var334 != 36 && var334 != 46 && var334 != 47 && var334 != 48) {
                                int[][] var337 = field322[Statics.field235].field2961;
                                for (int var338 = 0; var338 < 10; var338++) {
                                    int var339 = (int) (Math.random() * 4.0D);
                                    if (var339 == 0 && var335 > 0 && var335 > var330 - 3 && (var337[var335 - 1][var336] & 0x1240108) == 0) {
                                        var335--;
                                    }
                                    if (var339 == 1 && var335 < 103 && var335 < var330 + 3 && (var337[var335 + 1][var336] & 0x1240180) == 0) {
                                        var335++;
                                    }
                                    if (var339 == 2 && var336 > 0 && var336 > var331 - 3 && (var337[var335][var336 - 1] & 0x1240102) == 0) {
                                        var336--;
                                    }
                                    if (var339 == 3 && var336 < 103 && var336 < var331 + 3 && (var337[var335][var336 + 1] & 0x1240120) == 0) {
                                        var336++;
                                    }
                                }
                            }
                            field491[field501] = Statics.field557[var334];
                            field489[field501] = var335;
                            field261[field501] = var336;
                            field501++;
                        }
                    }
                }
            }
            Statics.field94.method1379();
        }
        if (field270 != 30) {
            return;
        }
        for (class15 var340 = (class15) field398.method3189(); var340 != null; var340 = (class15) field398.method3182()) {
            if (var340.field221 > 0) {
                var340.field221--;
            }
            if (var340.field221 == 0) {
                if (var340.field214 >= 0) {
                    int var341 = var340.field214;
                    int var342 = var340.field216;
                    class36 var343 = class36.method2624(var341);
                    if (var342 == 11) {
                        var342 = 10;
                    }
                    if (var342 >= 5 && var342 <= 8) {
                        var342 = 4;
                    }
                    boolean var344 = var343.method645(var342);
                    if (!var344) {
                        continue;
                    }
                }
                method3496(var340.field223, var340.field211, var340.field218, var340.field213, var340.field214, var340.field215, var340.field216);
                var340.method3285();
            } else {
                if (var340.field220 > 0) {
                    var340.field220--;
                }
                if (var340.field220 == 0 && var340.field218 >= 1 && var340.field213 >= 1 && var340.field218 <= 102 && var340.field213 <= 102) {
                    if (var340.field217 >= 0) {
                        int var345 = var340.field217;
                        int var346 = var340.field224;
                        class36 var347 = class36.method2624(var345);
                        if (var346 == 11) {
                            var346 = 10;
                        }
                        if (var346 >= 5 && var346 <= 8) {
                            var346 = 4;
                        }
                        boolean var348 = var347.method645(var346);
                        if (!var348) {
                            continue;
                        }
                    }
                    method3496(var340.field223, var340.field211, var340.field218, var340.field213, var340.field217, var340.field212, var340.field224);
                    var340.field220 = -1;
                    if (var340.field217 == var340.field214 && var340.field214 == -1) {
                        var340.method3285();
                    } else if (var340.field217 == var340.field214 && var340.field215 == var340.field212 && var340.field224 == var340.field216) {
                        var340.method3285();
                    }
                }
            }
        }
        int var10002;
        for (int var349 = 0; var349 < field295; var349++) {
            var10002 = field391[var349]--;
            if (field391[var349] >= -10) {
                class52 var351 = field505[var349];
                if (var351 == null) {
                    class52 var448 = (class52) null;
                    var351 = class52.method1028(Statics.field1275, field271[var349], 0);
                    if (var351 == null) {
                        continue;
                    }
                    field391[var349] += var351.method1026();
                    field505[var349] = var351;
                }
                if (field391[var349] < 0) {
                    int var358;
                    if (field504[var349] == 0) {
                        var358 = field434;
                    } else {
                        int var352 = (field504[var349] & 0xFF) * 128;
                        int var353 = field504[var349] >> 16 & 0xFF;
                        int var354 = var353 * 128 + 64 - Statics.field1819.field729;
                        if (var354 < 0) {
                            var354 = -var354;
                        }
                        int var355 = field504[var349] >> 8 & 0xFF;
                        int var356 = var355 * 128 + 64 - Statics.field1819.field761;
                        if (var356 < 0) {
                            var356 = -var356;
                        }
                        int var357 = var354 + var356 - 128;
                        if (var357 > var352) {
                            field391[var349] = -100;
                            continue;
                        }
                        if (var357 < 0) {
                            var357 = 0;
                        }
                        var358 = field499 * (var352 - var357) / var352;
                    }
                    if (var358 > 0) {
                        class56 var359 = var351.method1030().method1064(Statics.field184);
                        class58 var360 = class58.method1086(var359, 100, var358);
                        var360.method1089(field502[var349] - 1);
                        Statics.field73.method960(var360);
                    }
                    field391[var349] = -100;
                }
            } else {
                field295--;
                for (int var350 = var349; var350 < field295; var350++) {
                    field271[var350] = field271[var350 + 1];
                    field505[var350] = field505[var350 + 1];
                    field502[var350] = field502[var350 + 1];
                    field391[var350] = field391[var350 + 1];
                    field504[var350] = field504[var350 + 1];
                }
                var349--;
            }
        }
        if (field497) {
            boolean var361;
            if (class162.field2729 == 0) {
                var361 = Statics.field2732.method3065();
            } else {
                var361 = true;
            }
            if (!var361) {
                if (field495 != 0 && field451 != -1) {
                    class162.method1821(Statics.field558, field451, 0, field495, false);
                }
                field497 = false;
            }
        }
        field309++;
        if (field309 <= 750) {
            for (int var362 = -1; var362 < field405; var362++) {
                int var363;
                if (var362 == -1) {
                    var363 = 2047;
                } else {
                    var363 = field384[var362];
                }
                class3 var364 = field337[var363];
                if (var364 != null) {
                    method2636(var364, 1);
                }
            }
            for (int var365 = 0; var365 < field403; var365++) {
                int var366 = field302[var365];
                class30 var367 = field300[var366];
                if (var367 != null) {
                    method2636(var367, var367.field686.field794);
                }
            }
            for (int var368 = -1; var368 < field405; var368++) {
                int var369;
                if (var368 == -1) {
                    var369 = 2047;
                } else {
                    var369 = field384[var368];
                }
                class3 var370 = field337[var369];
                if (var370 != null && var370.field719 > 0) {
                    var370.field719--;
                    if (var370.field719 == 0) {
                        var370.field757 = null;
                    }
                }
            }
            for (int var371 = 0; var371 < field403; var371++) {
                int var372 = field302[var371];
                class30 var373 = field300[var372];
                if (var373 != null && var373.field719 > 0) {
                    var373.field719--;
                    if (var373.field719 == 0) {
                        var373.field757 = null;
                    }
                }
            }
            field338++;
            if (field372 != 0) {
                field371 += 20;
                if (field371 >= 400) {
                    field372 = 0;
                }
            }
            if (Statics.field1501 != null) {
                field283++;
                if (field283 >= 15) {
                    method5(Statics.field1501);
                    Statics.field1501 = null;
                }
            }
            class153 var374 = Statics.field637;
            class153 var375 = Statics.field554;
            Statics.field637 = null;
            Statics.field554 = null;
            field453 = null;
            field444 = false;
            field441 = false;
            field278 = 0;
            while (class124.method2556() && field278 < 128) {
                if (field435 >= 2 && class124.field1994[82] && Statics.field1884 == 66) {
                    String var376 = class10.method683();
                    Statics.field2135.setContents(new StringSelection(var376), (ClipboardOwner) null);
                } else {
                    field483[field278] = Statics.field1884;
                    field482[field278] = Statics.field1891;
                    field278++;
                }
            }
            method24(field424, 0, 0, 765, 503, 0, 0);
            field448++;
            while (true) {
                class1 var377;
                class153 var378;
                class153 var379;
                do {
                    var377 = (class1) field488.method3187();
                    if (var377 == null) {
                        while (true) {
                            class1 var380;
                            class153 var381;
                            class153 var382;
                            do {
                                var380 = (class1) field464.method3187();
                                if (var380 == null) {
                                    while (true) {
                                        class1 var383;
                                        class153 var384;
                                        class153 var385;
                                        do {
                                            var383 = (class1) field462.method3187();
                                            if (var383 == null) {
                                                method578();
                                                if (field436 != null) {
                                                    method5(field436);
                                                    Statics.field621++;
                                                    if (field444 && field441) {
                                                        int var386 = class127.field2035;
                                                        int var387 = class127.field2029;
                                                        int var388 = var386 - field438;
                                                        int var389 = var387 - field498;
                                                        if (var388 < field442) {
                                                            var388 = field442;
                                                        }
                                                        if (field436.field2563 + var388 > field442 + field437.field2563) {
                                                            var388 = field442 + field437.field2563 - field436.field2563;
                                                        }
                                                        if (var389 < field259) {
                                                            var389 = field259;
                                                        }
                                                        if (field436.field2560 + var389 > field259 + field437.field2560) {
                                                            var389 = field259 + field437.field2560 - field436.field2560;
                                                        }
                                                        int var390 = var388 - field445;
                                                        int var391 = var389 - field263;
                                                        int var392 = field436.field2564;
                                                        if (Statics.field621 > field436.field2614 && (var390 > var392 || var390 < -var392 || var391 > var392 || var391 < -var392)) {
                                                            field447 = true;
                                                        }
                                                        int var393 = field437.field2596 + (var388 - field442);
                                                        int var394 = field437.field2546 + (var389 - field259);
                                                        if (field436.field2597 != null && field447) {
                                                            class1 var395 = new class1();
                                                            var395.field3 = field436;
                                                            var395.field10 = var393;
                                                            var395.field5 = var394;
                                                            var395.field8 = field436.field2597;
                                                            class32.method1569(var395, 200000);
                                                        }
                                                        if (class127.field2022 == 0) {
                                                            if (field447) {
                                                                if (field436.field2601 != null) {
                                                                    class1 var396 = new class1();
                                                                    var396.field3 = field436;
                                                                    var396.field10 = var393;
                                                                    var396.field5 = var394;
                                                                    var396.field7 = field453;
                                                                    var396.field8 = field436.field2601;
                                                                    class32.method1819(var396);
                                                                }
                                                                if (field453 != null && method2654(field436) != null) {
                                                                    field304.method2306(52);
                                                                    field304.method2122(field453.field2576);
                                                                    field304.method2122(field453.field2551);
                                                                    field304.method2177(field436.field2551);
                                                                    field304.method2122(field436.field2576);
                                                                    field304.method2082(field436.field2554);
                                                                    field304.method2157(field453.field2554);
                                                                }
                                                            } else if ((field404 == 1 || method582(field406 - 1)) && field406 > 2) {
                                                                method152(field445 + field438, field498 + field263);
                                                            } else if (field406 > 0) {
                                                                method1934(field445 + field438, field498 + field263);
                                                            }
                                                            field436 = null;
                                                        }
                                                    } else if (Statics.field621 > 1) {
                                                        field436 = null;
                                                    }
                                                }
                                                if (Statics.field1890 != null) {
                                                    method5(Statics.field1890);
                                                    field380++;
                                                    if (class127.field2022 == 0) {
                                                        if (field334) {
                                                            if (Statics.field196 == Statics.field1890 && field378 != field349) {
                                                                class153 var397 = Statics.field1890;
                                                                byte var398 = 0;
                                                                if (field427 == 1 && var397.field2541 == 206) {
                                                                    var398 = 1;
                                                                }
                                                                if (var397.field2617[field378] <= 0) {
                                                                    var398 = 0;
                                                                }
                                                                if (class157.method150(method2036(var397))) {
                                                                    int var399 = field349;
                                                                    int var400 = field378;
                                                                    var397.field2617[var400] = var397.field2617[var399];
                                                                    var397.field2587[var400] = var397.field2587[var399];
                                                                    var397.field2617[var399] = -1;
                                                                    var397.field2587[var399] = 0;
                                                                } else if (var398 == 1) {
                                                                    int var401 = field349;
                                                                    int var402 = field378;
                                                                    while (var401 != var402) {
                                                                        if (var401 > var402) {
                                                                            var397.method2790(var401 - 1, var401);
                                                                            var401--;
                                                                        } else if (var401 < var402) {
                                                                            var397.method2790(var401 + 1, var401);
                                                                            var401++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var397.method2790(field378, field349);
                                                                }
                                                                field304.method2306(1);
                                                                field304.method2121(field349);
                                                                field304.method2177(field378);
                                                                field304.method2081(var398);
                                                                field304.method2082(Statics.field1890.field2554);
                                                            }
                                                        } else if ((field404 == 1 || method582(field406 - 1)) && field406 > 2) {
                                                            method152(field376, field377);
                                                        } else if (field406 > 0) {
                                                            method1934(field376, field377);
                                                        }
                                                        field283 = 10;
                                                        class127.field2034 = 0;
                                                        Statics.field1890 = null;
                                                    } else if (field380 >= 5 && (class127.field2035 > field376 + 5 || class127.field2035 < field376 - 5 || class127.field2029 > field377 + 5 || class127.field2029 < field377 - 5)) {
                                                        field334 = true;
                                                    }
                                                }
                                                if (class79.field1386 != -1) {
                                                    int var403 = class79.field1386;
                                                    int var404 = class79.field1394;
                                                    field304.method2306(142);
                                                    field304.method2079(5);
                                                    field304.method2122(Statics.field256 + var403);
                                                    field304.method2113(class124.field1994[82] ? (class124.field1994[81] ? 2 : 1) : 0);
                                                    field304.method2121(Statics.field879 + var404);
                                                    class79.field1386 = -1;
                                                    field369 = class127.field2028;
                                                    field317 = class127.field2036;
                                                    field372 = 1;
                                                    field371 = 0;
                                                    field364 = var403;
                                                    field493 = var404;
                                                }
                                                if (Statics.field637 != var374) {
                                                    if (var374 != null) {
                                                        method5(var374);
                                                    }
                                                    if (Statics.field637 != null) {
                                                        method5(Statics.field637);
                                                    }
                                                }
                                                if (Statics.field554 != var375 && field416 == field415) {
                                                    if (var375 != null) {
                                                        method5(var375);
                                                    }
                                                    if (Statics.field554 != null) {
                                                        method5(Statics.field554);
                                                    }
                                                }
                                                if (Statics.field554 == null) {
                                                    if (field415 > 0) {
                                                        field415--;
                                                    }
                                                } else if (field415 < field416) {
                                                    field415++;
                                                    if (field416 == field415) {
                                                        method5(Statics.field554);
                                                    }
                                                }
                                                int var405 = field366 + Statics.field1819.field729;
                                                int var406 = field496 + Statics.field1819.field761;
                                                if (Statics.field912 - var405 < -500 || Statics.field912 - var405 > 500 || Statics.field79 - var406 < -500 || Statics.field79 - var406 > 500) {
                                                    Statics.field912 = var405;
                                                    Statics.field79 = var406;
                                                }
                                                if (Statics.field912 != var405) {
                                                    Statics.field912 += (var405 - Statics.field912) / 16;
                                                }
                                                if (Statics.field79 != var406) {
                                                    Statics.field79 += (var406 - Statics.field79) / 16;
                                                }
                                                if (class127.field2022 == 4 && Statics.field2146) {
                                                    int var407 = class127.field2029 - field351;
                                                    field466 = var407 * 2;
                                                    field351 = var407 == -1 || var407 == 1 ? class127.field2029 : (field351 + class127.field2029) / 2;
                                                    int var408 = field350 - class127.field2035;
                                                    field348 = var408 * 2;
                                                    field350 = var408 == -1 || var408 == 1 ? class127.field2035 : (field350 + class127.field2035) / 2;
                                                } else {
                                                    if (class124.field1994[96]) {
                                                        field348 += (-24 - field348) / 2;
                                                    } else if (class124.field1994[97]) {
                                                        field348 += (24 - field348) / 2;
                                                    } else {
                                                        field348 /= 2;
                                                    }
                                                    if (class124.field1994[98]) {
                                                        field466 += (12 - field466) / 2;
                                                    } else if (class124.field1994[99]) {
                                                        field466 += (-12 - field466) / 2;
                                                    } else {
                                                        field466 /= 2;
                                                    }
                                                    field351 = class127.field2029;
                                                    field350 = class127.field2035;
                                                }
                                                field347 = field348 / 2 + field347 & 0x7FF;
                                                field346 += field466 / 2;
                                                if (field346 < 128) {
                                                    field346 = 128;
                                                }
                                                if (field346 > 383) {
                                                    field346 = 383;
                                                }
                                                int var409 = Statics.field912 >> 7;
                                                int var410 = Statics.field79 >> 7;
                                                int var411 = method1815(Statics.field912, Statics.field79, Statics.field235);
                                                int var412 = 0;
                                                if (var409 > 3 && var410 > 3 && var409 < 100 && var410 < 100) {
                                                    for (int var413 = var409 - 4; var413 <= var409 + 4; var413++) {
                                                        for (int var414 = var410 - 4; var414 <= var410 + 4; var414++) {
                                                            int var415 = Statics.field235;
                                                            if (var415 < 3 && (class6.field80[1][var413][var414] & 0x2) == 2) {
                                                                var415++;
                                                            }
                                                            int var416 = var411 - class6.field93[var415][var413][var414];
                                                            if (var416 > var412) {
                                                                var412 = var416;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var417 = var412 * 192;
                                                if (var417 > 98048) {
                                                    var417 = 98048;
                                                }
                                                if (var417 < 32768) {
                                                    var417 = 32768;
                                                }
                                                if (var417 > field292) {
                                                    field292 += (var417 - field292) / 24;
                                                } else if (var417 < field292) {
                                                    field292 += (var417 - field292) / 80;
                                                }
                                                if (field506) {
                                                    int var418 = Statics.field1913 * 128 + 64;
                                                    int var419 = Statics.field1354 * 128 + 64;
                                                    int var420 = method1815(var418, var419, Statics.field235) - Statics.field1356;
                                                    if (Statics.field936 < var418) {
                                                        Statics.field936 += Statics.field145 * (var418 - Statics.field936) / 1000 + Statics.field1705;
                                                        if (Statics.field936 > var418) {
                                                            Statics.field936 = var418;
                                                        }
                                                    }
                                                    if (Statics.field936 > var418) {
                                                        Statics.field936 -= Statics.field145 * (Statics.field936 - var418) / 1000 + Statics.field1705;
                                                        if (Statics.field936 < var418) {
                                                            Statics.field936 = var418;
                                                        }
                                                    }
                                                    if (Statics.field1300 < var420) {
                                                        Statics.field1300 += Statics.field145 * (var420 - Statics.field1300) / 1000 + Statics.field1705;
                                                        if (Statics.field1300 > var420) {
                                                            Statics.field1300 = var420;
                                                        }
                                                    }
                                                    if (Statics.field1300 > var420) {
                                                        Statics.field1300 -= Statics.field145 * (Statics.field1300 - var420) / 1000 + Statics.field1705;
                                                        if (Statics.field1300 < var420) {
                                                            Statics.field1300 = var420;
                                                        }
                                                    }
                                                    if (Statics.field345 < var419) {
                                                        Statics.field345 += Statics.field145 * (var419 - Statics.field345) / 1000 + Statics.field1705;
                                                        if (Statics.field345 > var419) {
                                                            Statics.field345 = var419;
                                                        }
                                                    }
                                                    if (Statics.field345 > var419) {
                                                        Statics.field345 -= Statics.field145 * (Statics.field345 - var419) / 1000 + Statics.field1705;
                                                        if (Statics.field345 < var419) {
                                                            Statics.field345 = var419;
                                                        }
                                                    }
                                                    int var421 = Statics.field689 * 128 + 64;
                                                    int var422 = Statics.field1049 * 128 + 64;
                                                    int var423 = method1815(var421, var422, Statics.field235) - Statics.field190;
                                                    int var424 = var421 - Statics.field936;
                                                    int var425 = var423 - Statics.field1300;
                                                    int var426 = var422 - Statics.field345;
                                                    int var427 = (int) Math.sqrt((double) (var424 * var424 + var426 * var426));
                                                    int var428 = (int) (Math.atan2((double) var425, (double) var427) * 325.949D) & 0x7FF;
                                                    int var429 = (int) (Math.atan2((double) var424, (double) var426) * -325.949D) & 0x7FF;
                                                    if (var428 < 128) {
                                                        var428 = 128;
                                                    }
                                                    if (var428 > 383) {
                                                        var428 = 383;
                                                    }
                                                    if (Statics.field89 < var428) {
                                                        Statics.field89 += Statics.field1295 * (var428 - Statics.field89) / 1000 + Statics.field1504;
                                                        if (Statics.field89 > var428) {
                                                            Statics.field89 = var428;
                                                        }
                                                    }
                                                    if (Statics.field89 > var428) {
                                                        Statics.field89 -= Statics.field1295 * (Statics.field89 - var428) / 1000 + Statics.field1504;
                                                        if (Statics.field89 < var428) {
                                                            Statics.field89 = var428;
                                                        }
                                                    }
                                                    int var430 = var429 - Statics.field19;
                                                    if (var430 > 1024) {
                                                        var430 -= 2048;
                                                    }
                                                    if (var430 < -1024) {
                                                        var430 += 2048;
                                                    }
                                                    if (var430 > 0) {
                                                        Statics.field19 += Statics.field1295 * var430 / 1000 + Statics.field1504;
                                                        Statics.field19 &= 0x7FF;
                                                    }
                                                    if (var430 < 0) {
                                                        Statics.field19 -= Statics.field1295 * -var430 / 1000 + Statics.field1504;
                                                        Statics.field19 &= 0x7FF;
                                                    }
                                                    int var431 = var429 - Statics.field19;
                                                    if (var431 > 1024) {
                                                        var431 -= 2048;
                                                    }
                                                    if (var431 < -1024) {
                                                        var431 += 2048;
                                                    }
                                                    if (var431 < 0 && var430 > 0 || var431 > 0 && var430 < 0) {
                                                        Statics.field19 = var429;
                                                    }
                                                }
                                                for (int var432 = 0; var432 < 5; var432++) {
                                                    var10002 = field273[var432]++;
                                                }
                                                int var433 = ++class127.field2023 - 1;
                                                int var435 = class124.field2000;
                                                if (var433 > 15000 && var435 > 15000) {
                                                    field311 = 250;
                                                    class127.method2836(14500);
                                                    field304.method2306(92);
                                                }
                                                field439++;
                                                if (field439 > 500) {
                                                    field439 = 0;
                                                    int var437 = (int) (Math.random() * 8.0D);
                                                    if ((var437 & 0x1) == 1) {
                                                        field366 += field327;
                                                    }
                                                    if ((var437 & 0x2) == 2) {
                                                        field496 += field329;
                                                    }
                                                    if ((var437 & 0x4) == 4) {
                                                        field330 += field420;
                                                    }
                                                }
                                                if (field366 < -50) {
                                                    field327 = 2;
                                                }
                                                if (field366 > 50) {
                                                    field327 = -2;
                                                }
                                                if (field496 < -55) {
                                                    field329 = 2;
                                                }
                                                if (field496 > 55) {
                                                    field329 = -2;
                                                }
                                                if (field330 < -40) {
                                                    field420 = 1;
                                                }
                                                if (field330 > 40) {
                                                    field420 = -1;
                                                }
                                                field383++;
                                                if (field383 > 500) {
                                                    field383 = 0;
                                                    int var438 = (int) (Math.random() * 8.0D);
                                                    if ((var438 & 0x1) == 1) {
                                                        field333 += field319;
                                                    }
                                                    if ((var438 & 0x2) == 2) {
                                                        field335 += field336;
                                                    }
                                                }
                                                if (field333 < -60) {
                                                    field319 = 2;
                                                }
                                                if (field333 > 60) {
                                                    field319 = -2;
                                                }
                                                if (field335 < -20) {
                                                    field336 = 1;
                                                }
                                                if (field335 > 10) {
                                                    field336 = -1;
                                                }
                                                for (class34 var439 = (class34) field507.method3141(); var439 != null; var439 = (class34) field507.method3149()) {
                                                    if ((long) var439.field781 < class103.method1837() / 1000L - 5L) {
                                                        if (var439.field779 > 0) {
                                                            class10.method1845(5, "", var439.field785 + class143.field2312);
                                                        }
                                                        if (var439.field779 == 0) {
                                                            class10.method1845(5, "", var439.field785 + class143.field2313);
                                                        }
                                                        var439.method3280();
                                                    }
                                                }
                                                field310++;
                                                if (field310 > 50) {
                                                    field304.method2306(137);
                                                }
                                                try {
                                                    if (Statics.field139 != null && field304.field1851 > 0) {
                                                        Statics.field139.method2509(field304.field1854, 0, field304.field1851);
                                                        field304.field1851 = 0;
                                                        field310 = 0;
                                                    }
                                                } catch (IOException var444) {
                                                    if (field311 > 0) {
                                                        method813();
                                                    } else {
                                                        method1376(40);
                                                        Statics.field303 = Statics.field139;
                                                        Statics.field139 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var384 = var383.field3;
                                            if (var384.field2551 < 0) {
                                                break;
                                            }
                                            var385 = class153.method117(var384.field2561);
                                        } while (var385 == null || var385.field2658 == null || var384.field2551 >= var385.field2658.length || var385.field2658[var384.field2551] != var384);
                                        class32.method1819(var383);
                                    }
                                }
                                var381 = var380.field3;
                                if (var381.field2551 < 0) {
                                    break;
                                }
                                var382 = class153.method117(var381.field2561);
                            } while (var382 == null || var382.field2658 == null || var381.field2551 >= var382.field2658.length || var382.field2658[var381.field2551] != var381);
                            class32.method1569(var380, 200000);
                        }
                    }
                    var378 = var377.field3;
                    if (var378.field2551 < 0) {
                        break;
                    }
                    var379 = class153.method117(var378.field2561);
                } while (var379 == null || var379.field2658 == null || var378.field2551 >= var379.field2658.length || var379.field2658[var378.field2551] != var378);
                class32.method1819(var377);
            }
        } else if (field311 > 0) {
            method813();
        } else {
            method1376(40);
            Statics.field303 = Statics.field139;
            Statics.field139 = null;
        }
    }

    @ObfuscatedName("e.e(I)V")
    public static final void method491() {
        if (Statics.field918 != null) {
            Statics.field918.method972();
        }
        if (Statics.field2095 != null) {
            Statics.field2095.method972();
        }
    }

    @ObfuscatedName("am.a(Laq;IIII)V")
    public static void method660(class38 arg0, int arg1, int arg2, int arg3) {
        if (field295 >= 50 || field499 == 0 || arg0.field893 == null || arg1 >= arg0.field893.length) {
            return;
        }
        int var4 = arg0.field893[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field271[field295] = var5;
        field502[field295] = var6;
        field391[field295] = 0;
        field505[field295] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field504[field295] = (var8 << 16) + (var9 << 8) + var7;
        field295++;
    }

    @ObfuscatedName("bu.y(II)V")
    public static void method1377(int arg0) {
        if (arg0 == -1 && !field497) {
            class162.method2843();
        } else if (arg0 != -1 && field451 != arg0 && field495 != 0 && !field497) {
            class148 var1 = Statics.field558;
            int var2 = field495;
            class162.field2729 = 1;
            Statics.field2508 = var1;
            Statics.field1539 = arg0;
            Statics.field2734 = 0;
            Statics.field2738 = var2;
            Statics.field71 = false;
            Statics.field2509 = 2;
        }
        field451 = arg0;
    }

    @ObfuscatedName("dp.f(IIB)V")
    public static void method2395(int arg0, int arg1) {
        if (field495 != 0 && arg0 != -1) {
            class162.method1821(Statics.field522, arg0, 0, field495, false);
            field497 = true;
        }
    }

    @ObfuscatedName("ei.u(Laz;IB)V")
    public static final void method2636(class33 arg0, int arg1) {
        if (arg0.field762 > field316) {
            int var2 = arg0.field762 - field316;
            int var3 = arg0.field760 * 128 + arg0.field722 * 64;
            int var4 = arg0.field749 * 128 + arg0.field722 * 64;
            arg0.field729 += (var3 - arg0.field729) / var2;
            arg0.field761 += (var4 - arg0.field761) / var2;
            arg0.field774 = 0;
            if (arg0.field732 == 0) {
                arg0.field767 = 1024;
            }
            if (arg0.field732 == 1) {
                arg0.field767 = 1536;
            }
            if (arg0.field732 == 2) {
                arg0.field767 = 0;
            }
            if (arg0.field732 == 3) {
                arg0.field767 = 512;
            }
        } else if (arg0.field763 >= field316) {
            if (field316 == arg0.field763 || arg0.field748 == -1 || arg0.field750 != 0 || arg0.field769 + 1 > class38.method1935(arg0.field748).field894[arg0.field730]) {
                int var5 = arg0.field763 - arg0.field762;
                int var6 = field316 - arg0.field762;
                int var7 = arg0.field760 * 128 + arg0.field722 * 64;
                int var8 = arg0.field749 * 128 + arg0.field722 * 64;
                int var9 = arg0.field759 * 128 + arg0.field722 * 64;
                int var10 = arg0.field722 * 64 + arg0.field718 * 128;
                arg0.field729 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field761 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field774 = 0;
            if (arg0.field732 == 0) {
                arg0.field767 = 1024;
            }
            if (arg0.field732 == 1) {
                arg0.field767 = 1536;
            }
            if (arg0.field732 == 2) {
                arg0.field767 = 0;
            }
            if (arg0.field732 == 3) {
                arg0.field767 = 512;
            }
            arg0.field740 = arg0.field767;
        } else {
            method2019(arg0);
        }
        if (arg0.field729 < 128 || arg0.field761 < 128 || arg0.field729 >= 13184 || arg0.field761 >= 13184) {
            arg0.field748 = -1;
            arg0.field753 = -1;
            arg0.field762 = 0;
            arg0.field763 = 0;
            arg0.field729 = arg0.field720[0] * 128 + arg0.field722 * 64;
            arg0.field761 = arg0.field733[0] * 128 + arg0.field722 * 64;
            arg0.method592();
        }
        if (Statics.field1819 == arg0 && (arg0.field729 < 1536 || arg0.field761 < 1536 || arg0.field729 >= 11776 || arg0.field761 >= 11776)) {
            arg0.field748 = -1;
            arg0.field753 = -1;
            arg0.field762 = 0;
            arg0.field763 = 0;
            arg0.field729 = arg0.field720[0] * 128 + arg0.field722 * 64;
            arg0.field761 = arg0.field733[0] * 128 + arg0.field722 * 64;
            arg0.method592();
        }
        if (arg0.field742 != 0) {
            if (arg0.field771 != -1 && arg0.field771 < 32768) {
                class30 var11 = field300[arg0.field771];
                if (var11 != null) {
                    int var12 = arg0.field729 - var11.field729;
                    int var13 = arg0.field761 - var11.field761;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field767 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field771 >= 32768) {
                int var14 = arg0.field771 - 32768;
                if (field388 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field337[var14];
                if (var15 != null) {
                    int var16 = arg0.field729 - var15.field729;
                    int var17 = arg0.field761 - var15.field761;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field767 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field764 != 0 || arg0.field744 != 0) && (arg0.field770 == 0 || arg0.field774 > 0)) {
                int var18 = arg0.field729 - (arg0.field764 * 64 - Statics.field256 * 64 - Statics.field256 * 64);
                int var19 = arg0.field761 - (arg0.field744 * 64 - Statics.field879 * 64 - Statics.field879 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field767 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field764 = 0;
                arg0.field744 = 0;
            }
            int var20 = arg0.field767 - arg0.field740 & 0x7FF;
            if (var20 == 0) {
                arg0.field768 = 0;
            } else {
                arg0.field768++;
                if (var20 > 1024) {
                    arg0.field740 -= arg0.field742;
                    boolean var21 = true;
                    if (var20 < arg0.field742 || var20 > 2048 - arg0.field742) {
                        arg0.field740 = arg0.field767;
                        var21 = false;
                    }
                    if (arg0.field756 == arg0.field745 && (arg0.field768 > 25 || var21)) {
                        if (arg0.field724 == -1) {
                            arg0.field745 = arg0.field726;
                        } else {
                            arg0.field745 = arg0.field724;
                        }
                    }
                } else {
                    arg0.field740 += arg0.field742;
                    boolean var22 = true;
                    if (var20 < arg0.field742 || var20 > 2048 - arg0.field742) {
                        arg0.field740 = arg0.field767;
                        var22 = false;
                    }
                    if (arg0.field756 == arg0.field745 && (arg0.field768 > 25 || var22)) {
                        if (arg0.field766 == -1) {
                            arg0.field745 = arg0.field726;
                        } else {
                            arg0.field745 = arg0.field766;
                        }
                    }
                }
                arg0.field740 &= 0x7FF;
            }
        }
        arg0.field721 = false;
        if (arg0.field745 != -1) {
            class38 var24 = class38.method1935(arg0.field745);
            if (var24 == null || var24.field898 == null) {
                arg0.field745 = -1;
            } else {
                arg0.field743++;
                if (arg0.field746 < var24.field898.length && arg0.field743 > var24.field894[arg0.field746]) {
                    arg0.field743 = 1;
                    arg0.field746++;
                    method660(var24, arg0.field746, arg0.field729, arg0.field761);
                }
                if (arg0.field746 >= var24.field898.length) {
                    arg0.field743 = 0;
                    arg0.field746 = 0;
                    method660(var24, arg0.field746, arg0.field729, arg0.field761);
                }
            }
        }
        if (arg0.field753 != -1 && field316 >= arg0.field739) {
            if (arg0.field754 < 0) {
                arg0.field754 = 0;
            }
            int var25 = class39.method612(arg0.field753).field921;
            if (var25 == -1) {
                arg0.field753 = -1;
            } else {
                class38 var26 = class38.method1935(var25);
                if (var26 == null || var26.field898 == null) {
                    arg0.field753 = -1;
                } else {
                    arg0.field755++;
                    if (arg0.field754 < var26.field898.length && arg0.field755 > var26.field894[arg0.field754]) {
                        arg0.field755 = 1;
                        arg0.field754++;
                        method660(var26, arg0.field754, arg0.field729, arg0.field761);
                    }
                    if (arg0.field754 >= var26.field898.length && (arg0.field754 < 0 || arg0.field754 >= var26.field898.length)) {
                        arg0.field753 = -1;
                    }
                }
            }
        }
        if (arg0.field748 != -1 && arg0.field750 <= 1) {
            class38 var27 = class38.method1935(arg0.field748);
            if (var27.field909 == 1 && arg0.field775 > 0 && arg0.field762 <= field316 && arg0.field763 < field316) {
                arg0.field750 = 1;
                return;
            }
        }
        if (arg0.field748 != -1 && arg0.field750 == 0) {
            class38 var28 = class38.method1935(arg0.field748);
            if (var28 == null || var28.field898 == null) {
                arg0.field748 = -1;
            } else {
                arg0.field769++;
                if (arg0.field730 < var28.field898.length && arg0.field769 > var28.field894[arg0.field730]) {
                    arg0.field769 = 1;
                    arg0.field730++;
                    method660(var28, arg0.field730, arg0.field729, arg0.field761);
                }
                if (arg0.field730 >= var28.field898.length) {
                    arg0.field730 -= var28.field914;
                    arg0.field752++;
                    if (arg0.field752 >= var28.field908) {
                        arg0.field748 = -1;
                    } else if (arg0.field730 >= 0 && arg0.field730 < var28.field898.length) {
                        method660(var28, arg0.field730, arg0.field729, arg0.field761);
                    } else {
                        arg0.field748 = -1;
                    }
                }
                arg0.field721 = var28.field904;
            }
        }
        if (arg0.field750 > 0) {
            arg0.field750--;
        }
    }

    @ObfuscatedName("ck.ab(Laz;B)V")
    public static final void method2019(class33 arg0) {
        arg0.field745 = arg0.field756;
        if (arg0.field770 == 0) {
            arg0.field774 = 0;
            return;
        }
        if (arg0.field748 != -1 && arg0.field750 == 0) {
            class38 var1 = class38.method1935(arg0.field748);
            if (arg0.field775 > 0 && var1.field909 == 0) {
                arg0.field774++;
                return;
            }
            if (arg0.field775 <= 0 && var1.field910 == 0) {
                arg0.field774++;
                return;
            }
        }
        int var2 = arg0.field729;
        int var3 = arg0.field761;
        int var4 = arg0.field720[arg0.field770 - 1] * 128 + arg0.field722 * 64;
        int var5 = arg0.field733[arg0.field770 - 1] * 128 + arg0.field722 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field729 = var4;
            arg0.field761 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field767 = 1280;
            } else if (var3 > var5) {
                arg0.field767 = 1792;
            } else {
                arg0.field767 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field767 = 768;
            } else if (var3 > var5) {
                arg0.field767 = 256;
            } else {
                arg0.field767 = 512;
            }
        } else if (var3 < var5) {
            arg0.field767 = 1024;
        } else if (var3 > var5) {
            arg0.field767 = 0;
        }
        int var6 = arg0.field767 - arg0.field740 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field727;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field726;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field731;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field728;
        }
        if (var7 == -1) {
            var7 = arg0.field726;
        }
        arg0.field745 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field686.field789;
        }
        if (var9) {
            if (arg0.field767 != arg0.field740 && arg0.field771 == -1 && arg0.field742 != 0) {
                var8 = 2;
            }
            if (arg0.field770 > 2) {
                var8 = 6;
            }
            if (arg0.field770 > 3) {
                var8 = 8;
            }
            if (arg0.field774 > 0 && arg0.field770 > 1) {
                var8 = 8;
                arg0.field774--;
            }
        } else {
            if (arg0.field770 > 1) {
                var8 = 6;
            }
            if (arg0.field770 > 2) {
                var8 = 8;
            }
            if (arg0.field774 > 0 && arg0.field770 > 1) {
                var8 = 8;
                arg0.field774--;
            }
        }
        if (arg0.field773[arg0.field770 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field745 == arg0.field726 && arg0.field747 != -1) {
            arg0.field745 = arg0.field747;
        }
        if (var2 < var4) {
            arg0.field729 += var8;
            if (arg0.field729 > var4) {
                arg0.field729 = var4;
            }
        } else if (var2 > var4) {
            arg0.field729 -= var8;
            if (arg0.field729 < var4) {
                arg0.field729 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field761 += var8;
            if (arg0.field761 > var5) {
                arg0.field761 = var5;
            }
        } else if (var3 > var5) {
            arg0.field761 -= var8;
            if (arg0.field761 < var5) {
                arg0.field761 = var5;
            }
        }
        if (arg0.field729 == var4 && arg0.field761 == var5) {
            arg0.field770--;
            if (arg0.field775 > 0) {
                arg0.field775--;
            }
        }
    }

    @ObfuscatedName("ex.ai(Lv;III)V")
    public static void method2633(class3 arg0, int arg1, int arg2) {
        if (arg0.field748 == arg1 && arg1 != -1) {
            int var3 = class38.method1935(arg1).field911;
            if (var3 == 1) {
                arg0.field730 = 0;
                arg0.field769 = 0;
                arg0.field750 = arg2;
                arg0.field752 = 0;
            }
            if (var3 == 2) {
                arg0.field752 = 0;
            }
        } else if (arg1 == -1 || arg0.field748 == -1 || class38.method1935(arg1).field905 >= class38.method1935(arg0.field748).field905) {
            arg0.field748 = arg1;
            arg0.field730 = 0;
            arg0.field769 = 0;
            arg0.field750 = arg2;
            arg0.field752 = 0;
            arg0.field775 = arg0.field770;
        }
    }

    @ObfuscatedName("cp.aj(Ljava/lang/String;ZB)V")
    public static final void method2035(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field611.method3313(arg0, 250);
        int var6 = Statics.field611.method3314(arg0, 250) * 13;
        class73.method1474(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1537(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field611.method3316(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method801(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2595(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field61.getGraphics();
            Statics.field94.method1318(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field61.repaint();
        }
    }

    @ObfuscatedName("aw.as(IIIII)V")
    public static final void method832(int arg0, int arg1, int arg2, int arg3) {
        class73.method1530(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1768();
        field382++;
        method130(class29.field680);
        boolean var4 = false;
        if (field396 >= 0) {
            for (int var5 = 0; var5 < field405; var5++) {
                if (field396 == field384[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method130(class29.field677);
        }
        method833(true);
        method130(var4 ? class29.field684 : class29.field678);
        method833(false);
        method1050();
        method1825();
        if (!field506) {
            int var6 = field346;
            if (field292 / 256 > var6) {
                var6 = field292 / 256;
            }
            if (field457[4] && field509[4] + 128 > var6) {
                var6 = field509[4] + 128;
            }
            int var7 = field347 + field330 & 0x7FF;
            int var8 = Statics.field912;
            int var9 = method1815(Statics.field1819.field729, Statics.field1819.field761, Statics.field235) - 50;
            int var10 = Statics.field79;
            int var11 = var6 * 3 + 600;
            int var12 = 2048 - var6 & 0x7FF;
            int var13 = 2048 - var7 & 0x7FF;
            int var14 = 0;
            int var15 = 0;
            int var16 = var11;
            if (var12 != 0) {
                int var17 = class84.field1490[var12];
                int var18 = class84.field1491[var12];
                int var19 = var15 * var18 - var11 * var17 >> 16;
                var16 = var15 * var17 + var11 * var18 >> 16;
                var15 = var19;
            }
            if (var13 != 0) {
                int var20 = class84.field1490[var13];
                int var21 = class84.field1491[var13];
                int var22 = var14 * var21 + var16 * var20 >> 16;
                var16 = var16 * var21 - var14 * var20 >> 16;
                var14 = var22;
            }
            Statics.field936 = var8 - var14;
            Statics.field1300 = var9 - var15;
            Statics.field345 = var10 - var16;
            Statics.field89 = var6;
            Statics.field19 = var7;
        }
        int var23;
        if (field506) {
            int var24;
            if (Statics.field939.field136) {
                var24 = Statics.field235;
            } else {
                int var25 = method1815(Statics.field936, Statics.field345, Statics.field235);
                if (var25 - Statics.field1300 >= 800 || (class6.field80[Statics.field235][Statics.field936 >> 7][Statics.field345 >> 7] & 0x4) == 0) {
                    var24 = 3;
                } else {
                    var24 = Statics.field235;
                }
            }
            var23 = var24;
        } else {
            var23 = method2304();
        }
        int var26 = Statics.field936;
        int var27 = Statics.field1300;
        int var28 = Statics.field345;
        int var29 = Statics.field89;
        int var30 = Statics.field19;
        for (int var31 = 0; var31 < 5; var31++) {
            if (field457[var31]) {
                int var32 = (int) (Math.random() * (double) (field508[var31] * 2 + 1) - (double) field508[var31] + Math.sin((double) field510[var31] / 100.0D * (double) field273[var31]) * (double) field509[var31]);
                if (var31 == 0) {
                    Statics.field936 += var32;
                }
                if (var31 == 1) {
                    Statics.field1300 += var32;
                }
                if (var31 == 2) {
                    Statics.field345 += var32;
                }
                if (var31 == 3) {
                    Statics.field19 = Statics.field19 + var32 & 0x7FF;
                }
                if (var31 == 4) {
                    Statics.field89 += var32;
                    if (Statics.field89 < 128) {
                        Statics.field89 = 128;
                    }
                    if (Statics.field89 > 383) {
                        Statics.field89 = 383;
                    }
                }
            }
        }
        int var33 = class127.field2035;
        int var34 = class127.field2029;
        if (class127.field2034 != 0) {
            var33 = class127.field2028;
            var34 = class127.field2036;
        }
        if (var33 >= arg0 && var33 < arg0 + arg2 && var34 >= arg1 && var34 < arg1 + arg3) {
            class98.field1741 = true;
            class98.field1730 = 0;
            class98.field1764 = var33 - arg0;
            class98.field1745 = var34 - arg1;
        } else {
            class98.field1741 = false;
            class98.field1730 = 0;
        }
        method491();
        class73.method1474(arg0, arg1, arg2, arg3, 0);
        method491();
        Statics.field16.method1616(Statics.field936, Statics.field1300, Statics.field345, Statics.field89, Statics.field19, var23);
        method491();
        Statics.field16.method1662();
        field373 = 0;
        boolean var35 = false;
        int var36 = -1;
        for (int var37 = -1; var37 < field405 + field403; var37++) {
            class33 var38;
            if (var37 == -1) {
                var38 = Statics.field1819;
            } else if (var37 < field405) {
                var38 = field337[field384[var37]];
                if (field396 == field384[var37]) {
                    var35 = true;
                    var36 = var37;
                    continue;
                }
            } else {
                var38 = field300[field302[var37 - field405]];
            }
            method1304(var38, var37, arg0, arg1, arg2, arg3);
        }
        if (var35) {
            method1304(field337[field396], var36, arg0, arg1, arg2, arg3);
        }
        for (int var39 = 0; var39 < field373; var39++) {
            int var40 = field446[var39];
            int var41 = field358[var39];
            int var42 = field360[var39];
            int var43 = field480[var39];
            boolean var44 = true;
            while (var44) {
                var44 = false;
                for (int var45 = 0; var45 < var39; var45++) {
                    if (var41 + 2 > field358[var45] - field480[var45] && var41 - var43 < field358[var45] + 2 && var40 - var42 < field446[var45] + field360[var45] && var40 + var42 > field446[var45] - field360[var45] && field358[var45] - field480[var45] < var41) {
                        var41 = field358[var45] - field480[var45];
                        var44 = true;
                    }
                }
            }
            field284 = field446[var39];
            field368 = field358[var39] = var41;
            String var46 = field315[var39];
            if (field426 == 0) {
                int var47 = 16776960;
                if (field361[var39] < 6) {
                    var47 = field476[field361[var39]];
                }
                if (field361[var39] == 6) {
                    var47 = field382 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field361[var39] == 7) {
                    var47 = field382 % 20 < 10 ? 255 : 65535;
                }
                if (field361[var39] == 8) {
                    var47 = field382 % 20 < 10 ? 45056 : 8454016;
                }
                if (field361[var39] == 9) {
                    int var48 = 150 - field363[var39];
                    if (var48 < 50) {
                        var47 = var48 * 1280 + 16711680;
                    } else if (var48 < 100) {
                        var47 = 16776960 - (var48 - 50) * 327680;
                    } else if (var48 < 150) {
                        var47 = (var48 - 100) * 5 + 65280;
                    }
                }
                if (field361[var39] == 10) {
                    int var49 = 150 - field363[var39];
                    if (var49 < 50) {
                        var47 = var49 * 5 + 16711680;
                    } else if (var49 < 100) {
                        var47 = 16711935 - (var49 - 50) * 327680;
                    } else if (var49 < 150) {
                        var47 = (var49 - 100) * 327680 + 255 - (var49 - 100) * 5;
                    }
                }
                if (field361[var39] == 11) {
                    int var50 = 150 - field363[var39];
                    if (var50 < 50) {
                        var47 = 16777215 - var50 * 327685;
                    } else if (var50 < 100) {
                        var47 = (var50 - 50) * 327685 + 65280;
                    } else if (var50 < 150) {
                        var47 = 16777215 - (var50 - 100) * 327680;
                    }
                }
                if (field370[var39] == 0) {
                    Statics.field1839.method3373(var46, field284 + arg0, field368 + arg1, var47, 0);
                }
                if (field370[var39] == 1) {
                    Statics.field1839.method3320(var46, field284 + arg0, field368 + arg1, var47, 0, field382);
                }
                if (field370[var39] == 2) {
                    Statics.field1839.method3321(var46, field284 + arg0, field368 + arg1, var47, 0, field382);
                }
                if (field370[var39] == 3) {
                    Statics.field1839.method3322(var46, field284 + arg0, field368 + arg1, var47, 0, field382, 150 - field363[var39]);
                }
                if (field370[var39] == 4) {
                    int var51 = (150 - field363[var39]) * (Statics.field1839.method3318(var46) + 100) / 150;
                    class73.method1529(field284 + arg0 - 50, arg1, field284 + arg0 + 50, arg1 + arg3);
                    Statics.field1839.method3396(var46, field284 + arg0 + 50 - var51, field368 + arg1, var47, 0);
                    class73.method1530(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field370[var39] == 5) {
                    int var52 = 150 - field363[var39];
                    int var53 = 0;
                    if (var52 < 25) {
                        var53 = var52 - 25;
                    } else if (var52 > 125) {
                        var53 = var52 - 125;
                    }
                    class73.method1529(arg0, field368 + arg1 - Statics.field1839.field2926 - 1, arg0 + arg2, field368 + arg1 + 5);
                    Statics.field1839.method3373(var46, field284 + arg0, field368 + arg1 + var53, var47, 0);
                    class73.method1530(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1839.method3373(var46, field284 + arg0, field368 + arg1, 16776960, 0);
            }
        }
        method1814(arg0, arg1);
        ((class88) Statics.field1487).method1827(field338);
        if (field372 == 1) {
            Statics.field146[field371 / 100].method1385(field369 - 8, field317 - 8);
        }
        if (field372 == 2) {
            Statics.field146[field371 / 100 + 4].method1385(field369 - 8, field317 - 8);
        }
        method127();
        if (field279) {
            int var54 = arg0 + 512 - 5;
            int var55 = arg1 + 20;
            Statics.field611.method3317("Fps:" + field2072, var54, var55, 16776960, -1);
            int var62 = var55 + 15;
            Runtime var56 = Runtime.getRuntime();
            int var57 = (int) ((var56.totalMemory() - var56.freeMemory()) / 1024L);
            int var58 = 16776960;
            if (var57 > 32768 && field267) {
                var58 = 16711680;
            }
            if (var57 > 65536 && !field267) {
                var58 = 16711680;
            }
            Statics.field611.method3317("Mem:" + var57 + "k", var54, var62, var58, -1);
            var55 = var62 + 15;
        }
        Statics.field936 = var26;
        Statics.field1300 = var27;
        Statics.field345 = var28;
        Statics.field89 = var29;
        Statics.field19 = var30;
        if (field474) {
            byte var59 = 0;
            int var60 = class151.field2518 + class151.field2516 + var59;
            if (var60 == 0) {
                field474 = false;
            }
        }
        if (field474) {
            class73.method1474(arg0, arg1, arg2, arg3, 0);
            method2035(class143.field2395, false);
        }
    }

    @ObfuscatedName("j.ax(Laj;I)V")
    public static final void method130(class29 arg0) {
        if (Statics.field1819.field729 >> 7 == field364 && Statics.field1819.field761 >> 7 == field493) {
            field364 = 0;
        }
        int var1 = field405;
        if (class29.field680 == arg0 || class29.field677 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field680 == arg0) {
                var3 = Statics.field1819;
                var4 = 33538048;
            } else if (class29.field677 == arg0) {
                var3 = field337[field396];
                var4 = field396 << 14;
            } else {
                var3 = field337[field384[var2]];
                var4 = field384[var2] << 14;
                if (class29.field684 == arg0 && field396 == field384[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method28() && !var3.field50) {
                var3.field48 = false;
                if ((field267 && field405 > 50 || field405 > 200) && class29.field680 != arg0 && var3.field756 == var3.field745) {
                    var3.field48 = true;
                }
                int var5 = var3.field729 >> 7;
                int var6 = var3.field761 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field316 < var3.field37 || field316 >= var3.field35) {
                        if ((var3.field729 & 0x7F) == 64 && (var3.field761 & 0x7F) == 64) {
                            if (field382 == field365[var5][var6]) {
                                continue;
                            }
                            field365[var5][var6] = field382;
                        }
                        var3.field40 = method1815(var3.field729, var3.field761, Statics.field235);
                        Statics.field16.method1587(Statics.field235, var3.field729, var3.field761, var3.field40, 60, var3, var3.field740, var4, var3.field721);
                    } else {
                        var3.field48 = false;
                        var3.field40 = method1815(var3.field729, var3.field761, Statics.field235);
                        Statics.field16.method1620(Statics.field235, var3.field729, var3.field761, var3.field40, 60, var3, var3.field740, var4, var3.field44, var3.field49, var3.field46, var3.field38);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.ac(ZI)V")
    public static final void method833(boolean arg0) {
        for (int var1 = 0; var1 < field403; var1++) {
            class30 var2 = field300[field302[var1]];
            int var3 = (field302[var1] << 14) + 536870912;
            if (var2 != null && var2.method28() && var2.field686.field812 == arg0 && var2.field686.method613()) {
                int var4 = var2.field729 >> 7;
                int var5 = var2.field761 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field722 == 1 && (var2.field729 & 0x7F) == 64 && (var2.field761 & 0x7F) == 64) {
                        if (field382 == field365[var4][var5]) {
                            continue;
                        }
                        field365[var4][var5] = field382;
                    }
                    if (!var2.field686.field820) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field16.method1587(Statics.field235, var2.field729, var2.field761, method1815(var2.field729 + (var2.field722 * 64 - 64), var2.field761 + (var2.field722 * 64 - 64), Statics.field235), var2.field722 * 64 - 64 + 60, var2, var2.field740, var3, var2.field721);
                }
            }
        }
    }

    @ObfuscatedName("bq.az(I)V")
    public static final void method1050() {
        for (class7 var0 = (class7) field399.method3189(); var0 != null; var0 = (class7) field399.method3182()) {
            if (Statics.field235 != var0.field116 || field316 > var0.field121) {
                var0.method3285();
            } else if (field316 >= var0.field103) {
                if (var0.field123 > 0) {
                    class30 var1 = field300[var0.field123 - 1];
                    if (var1 != null && var1.field729 >= 0 && var1.field729 < 13312 && var1.field761 >= 0 && var1.field761 < 13312) {
                        var0.method67(var1.field729, var1.field761, method1815(var1.field729, var1.field761, var0.field116) - var0.field102, field316);
                    }
                }
                if (var0.field123 < 0) {
                    int var2 = -var0.field123 - 1;
                    class3 var3;
                    if (field388 == var2) {
                        var3 = Statics.field1819;
                    } else {
                        var3 = field337[var2];
                    }
                    if (var3 != null && var3.field729 >= 0 && var3.field729 < 13312 && var3.field761 >= 0 && var3.field761 < 13312) {
                        var0.method67(var3.field729, var3.field761, method1815(var3.field729, var3.field761, var0.field116) - var0.field102, field316);
                    }
                }
                var0.method71(field338);
                Statics.field16.method1587(Statics.field235, (int) var0.field104, (int) var0.field110, (int) var0.field115, 60, var0, var0.field111, -1, false);
            }
        }
    }

    @ObfuscatedName("ci.au(I)V")
    public static final void method1825() {
        for (class26 var0 = (class26) field400.method3189(); var0 != null; var0 = (class26) field400.method3182()) {
            if (Statics.field235 != var0.field615 || var0.field622) {
                var0.method3285();
            } else if (field316 >= var0.field626) {
                var0.method515(field338);
                if (var0.field622) {
                    var0.method3285();
                } else {
                    Statics.field16.method1587(var0.field615, var0.field616, var0.field617, var0.field618, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dw.av(I)I")
    public static final int method2304() {
        if (Statics.field939.field136) {
            return Statics.field235;
        }
        int var0 = 3;
        if (Statics.field89 < 310) {
            int var1 = Statics.field936 >> 7;
            int var2 = Statics.field345 >> 7;
            int var3 = Statics.field1819.field729 >> 7;
            int var4 = Statics.field1819.field761 >> 7;
            if ((class6.field80[Statics.field235][var1][var2] & 0x4) != 0) {
                var0 = Statics.field235;
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
                    if ((class6.field80[Statics.field235][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field235;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field80[Statics.field235][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field235;
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
                    if ((class6.field80[Statics.field235][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field235;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field80[Statics.field235][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field235;
                        }
                    }
                }
            }
        }
        if ((class6.field80[Statics.field235][Statics.field1819.field729 >> 7][Statics.field1819.field761 >> 7] & 0x4) != 0) {
            var0 = Statics.field235;
        }
        return var0;
    }

    @ObfuscatedName("cu.am(III)V")
    public static final void method1814(int arg0, int arg1) {
        if (field281 == 2) {
            method576((field430 - Statics.field256 << 7) + field287, (field428 - Statics.field879 << 7) + field288, field286 * 2);
            if (field284 > -1 && field316 % 20 < 10) {
                Statics.field1658[0].method1385(field284 + arg0 - 12, field368 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bi.ao(Laz;IIIIII)V")
    public static final void method1304(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method28()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field686;
            if (var6.field817 != null) {
                var6 = var6.method622();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field405) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field50) {
                return;
            }
            if (var8.field33 != -1 || var8.field34 != -1) {
                method2617(arg0, arg0.field751 + 15);
                if (field284 > -1) {
                    if (var8.field33 != -1) {
                        Statics.field947[var8.field33].method1385(field284 + arg2 - 12, field368 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field34 != -1) {
                        Statics.field1273[var8.field34].method1385(field284 + arg2 - 12, field368 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field281 == 10 && field452 == field384[arg1]) {
                method2617(arg0, arg0.field751 + 15);
                if (field284 > -1) {
                    Statics.field1658[1].method1385(field284 + arg2 - 12, field368 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field686;
            if (var9.field817 != null) {
                var9 = var9.method622();
            }
            if (var9.field795 >= 0 && var9.field795 < Statics.field1273.length) {
                method2617(arg0, arg0.field751 + 15);
                if (field284 > -1) {
                    Statics.field1273[var9.field795].method1385(field284 + arg2 - 12, field368 + arg3 - 30);
                }
            }
            if (field281 == 1 && field282 == field302[arg1 - field405] && field316 % 20 < 10) {
                method2617(arg0, arg0.field751 + 15);
                if (field284 > -1) {
                    Statics.field1658[0].method1385(field284 + arg2 - 12, field368 + arg3 - 28);
                }
            }
        }
        if (arg0.field757 != null && (arg1 >= field405 || field477 == 4 || !arg0.field758 && (field477 == 0 || field477 == 3 || field477 == 1 && method1738(((class3) arg0).field39, false)))) {
            method2617(arg0, arg0.field751);
            if (field284 > -1 && field373 < field266) {
                field360[field373] = Statics.field1839.method3318(arg0.field757) / 2;
                field480[field373] = Statics.field1839.field2926;
                field446[field373] = field284;
                field358[field373] = field368;
                field361[field373] = arg0.field734;
                field370[field373] = arg0.field735;
                field363[field373] = arg0.field719;
                field315[field373] = arg0.field757;
                field373++;
            }
        }
        if (arg0.field772 > field316) {
            method2617(arg0, arg0.field751 + 15);
            if (field284 > -1) {
                int var10;
                if (arg1 < field405) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field686;
                    var10 = var11.field823;
                }
                int var12 = arg0.field723 * var10 / arg0.field741;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field723 > 0) {
                    var12 = 1;
                }
                class73.method1474(field284 + arg2 - var10 / 2, field368 + arg3 - 3, var12, 5, 65280);
                class73.method1474(field284 + arg2 - var10 / 2 + var12, field368 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field738[var13] > field316) {
                method2617(arg0, arg0.field751 / 2);
                if (field284 > -1) {
                    if (var13 == 1) {
                        field368 -= 20;
                    }
                    if (var13 == 2) {
                        field284 -= 15;
                        field368 -= 10;
                    }
                    if (var13 == 3) {
                        field284 += 15;
                        field368 -= 10;
                    }
                    Statics.field1115[arg0.field737[var13]].method1385(field284 + arg2 - 12, field368 + arg3 - 12);
                    Statics.field158.method3373(Integer.toString(arg0.field736[var13]), field284 + arg2 - 1, field368 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("j.aq(I)V")
    public static final void method127() {
        field381 = 0;
        int var0 = (Statics.field1819.field729 >> 7) + Statics.field256;
        int var1 = (Statics.field1819.field761 >> 7) + Statics.field879;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field381 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field381 = 1;
        }
        if (field381 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field381 = 0;
        }
    }

    @ObfuscatedName("eh.ay(Laz;II)V")
    public static final void method2617(class33 arg0, int arg1) {
        method576(arg0.field729, arg0.field761, arg1);
    }

    @ObfuscatedName("ax.an(IIII)V")
    public static final void method576(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field284 = -1;
            field368 = -1;
            return;
        }
        int var3 = method1815(arg0, arg1, Statics.field235) - arg2;
        int var4 = arg0 - Statics.field936;
        int var5 = var3 - Statics.field1300;
        int var6 = arg1 - Statics.field345;
        int var7 = class84.field1490[Statics.field89];
        int var8 = class84.field1491[Statics.field89];
        int var9 = class84.field1490[Statics.field19];
        int var10 = class84.field1491[Statics.field19];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field284 = (var11 << 9) / var15 + 256;
            field368 = (var14 << 9) / var15 + 167;
        } else {
            field284 = -1;
            field368 = -1;
        }
    }

    @ObfuscatedName("cu.ak(IIIB)I")
    public static final int method1815(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field93[var5][var3][var4] + class6.field93[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field93[var5][var3][var4 + 1] + class6.field93[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("r.ae(ZI)V")
    public static final void method118(boolean arg0) {
        field356 = arg0;
        if (!field356) {
            int var1 = (field307 - field306.field1851) / 16;
            Statics.field2010 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field2010[var2][var3] = field306.method2097();
                }
            }
            int var4 = field306.method2123();
            int var5 = field306.method2258();
            int var6 = field306.method2094();
            int var7 = field306.method2258();
            int var8 = field306.method2116();
            Statics.field1063 = new int[var1];
            Statics.field2503 = new int[var1];
            Statics.field1118 = new int[var1];
            Statics.field2156 = new byte[var1][];
            Statics.field1657 = new byte[var1][];
            boolean var9 = false;
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var5 / 8 == 48) {
                var9 = true;
            }
            if (var6 / 8 == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var6 - 6) / 8; var11 <= (var6 + 6) / 8; var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1063[var10] = var13;
                        Statics.field2503[var10] = Statics.field2038.method2656("m" + var11 + "_" + var12);
                        Statics.field1118[var10] = Statics.field2038.method2656("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method479(var6, var5, var8, var7, var4);
            return;
        }
        int var14 = field306.method2094();
        int var15 = field306.method2123();
        field306.method2312();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field306.method2309(1);
                    if (var19 == 1) {
                        field324[var16][var17][var18] = field306.method2309(26);
                    } else {
                        field324[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field306.method2319();
        int var20 = (field307 - field306.field1851) / 16;
        Statics.field2010 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field2010[var21][var22] = field306.method2131();
            }
        }
        int var23 = field306.method2094();
        int var24 = field306.method2194();
        int var25 = field306.method2123();
        Statics.field1063 = new int[var20];
        Statics.field2503 = new int[var20];
        Statics.field1118 = new int[var20];
        Statics.field2156 = new byte[var20][];
        Statics.field1657 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field324[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1063[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1063[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2503[var26] = Statics.field2038.method2656("m" + var35 + "_" + var36);
                            Statics.field1118[var26] = Statics.field2038.method2656("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method479(var15, var14, var24, var25, var23);
    }

    @ObfuscatedName("x.ad(IIIIII)V")
    public static final void method479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field195 == arg0 && Statics.field683 == arg1 && field397 == arg2 || !field267) {
            return;
        }
        Statics.field195 = arg0;
        Statics.field683 = arg1;
        field397 = arg2;
        if (!field267) {
            field397 = 0;
        }
        method1376(25);
        method2035(class143.field2395, true);
        int var5 = Statics.field256;
        int var6 = Statics.field879;
        Statics.field256 = (arg0 - 6) * 8;
        Statics.field879 = (arg1 - 6) * 8;
        int var7 = Statics.field256 - var5;
        int var8 = Statics.field879 - var6;
        int var9 = Statics.field256;
        int var10 = Statics.field879;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field300[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field720[var13] -= var7;
                    var12.field733[var13] -= var8;
                }
                var12.field729 -= var7 * 128;
                var12.field761 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field337[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field720[var16] -= var7;
                    var15.field733[var16] -= var8;
                }
                var15.field729 -= var7 * 128;
                var15.field761 -= var8 * 128;
            }
        }
        Statics.field235 = arg2;
        Statics.field1819.method590(arg3, arg4, false);
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
                        field332[var27][var23][var24] = field332[var27][var25][var26];
                    } else {
                        field332[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field398.method3189(); var28 != null; var28 = (class15) field398.method3182()) {
            var28.field218 -= var7;
            var28.field213 -= var8;
            if (var28.field218 < 0 || var28.field213 < 0 || var28.field218 >= 104 || var28.field213 >= 104) {
                var28.method3285();
            }
        }
        if (field364 != 0) {
            field364 -= var7;
            field493 -= var8;
        }
        field295 = 0;
        field506 = false;
        field487 = -1;
        field400.method3183();
        field399.method3183();
    }

    @ObfuscatedName("ac.aw(ZS)V")
    public static final void method579(boolean arg0) {
        method491();
        field310++;
        if (field310 < 50 && !arg0) {
            return;
        }
        field310 = 0;
        if (field455 || Statics.field139 == null) {
            return;
        }
        field304.method2306(137);
        try {
            Statics.field139.method2509(field304.field1854, 0, field304.field1851);
            field304.field1851 = 0;
        } catch (IOException var2) {
            field455 = true;
        }
    }

    @ObfuscatedName("dt.ah(IIIIII)V")
    public static final void method2532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field16.method1602(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field16.method1604(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1456.field1307;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method2624(var12);
            if (var13.field857 == -1) {
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
                class74 var14 = Statics.field613[var13.field857];
                if (var14 != null) {
                    int var15 = (var13.field843 * 4 - var14.field1326) / 2;
                    int var16 = (var13.field844 * 4 - var14.field1327) / 2;
                    var14.method1543(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field844) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field16.method1728(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field16.method1604(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method2624(var21);
            if (var22.field857 != -1) {
                class74 var23 = Statics.field613[var22.field857];
                if (var23 != null) {
                    int var24 = (var22.field843 * 4 - var23.field1326) / 2;
                    int var25 = (var22.field844 * 4 - var23.field1327) / 2;
                    var23.method1543(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field844) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1456.field1307;
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
        int var29 = Statics.field16.method1605(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method2624(var30);
        if (var31.field857 == -1) {
            return;
        }
        class74 var32 = Statics.field613[var31.field857];
        if (var32 != null) {
            int var33 = (var31.field843 * 4 - var32.field1326) / 2;
            int var34 = (var31.field844 * 4 - var32.field1327) / 2;
            var32.method1543(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field844) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("aj.at(I)V")
    public static final void method570() {
        if (field308 == 250) {
            int var0 = field306.method2117();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2675;
            int var2 = (var0 & 0x7) + Statics.field2004;
            int var3 = field306.method2117();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field325[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method447(Statics.field235, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field308 == 1) {
            int var7 = field306.method2116();
            int var8 = (var7 >> 4 & 0x7) + Statics.field2675;
            int var9 = (var7 & 0x7) + Statics.field2004;
            int var10 = var8 + field306.method2093();
            int var11 = var9 + field306.method2093();
            int var12 = field306.method2095();
            int var13 = field306.method2094();
            int var14 = field306.method2116() * 4;
            int var15 = field306.method2116() * 4;
            int var16 = field306.method2094();
            int var17 = field306.method2094();
            int var18 = field306.method2116();
            int var19 = field306.method2116();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                class7 var24 = new class7(var13, Statics.field235, var20, var21, method1815(var20, var21, Statics.field235) - var14, field316 + var16, field316 + var17, var18, var19, var12, var15);
                var24.method67(var22, var23, method1815(var22, var23, Statics.field235) - var15, field316 + var16);
                field399.method3184(var24);
            }
        } else if (field308 == 218) {
            int var25 = field306.method2116();
            int var26 = (var25 >> 4 & 0x7) + Statics.field2675;
            int var27 = (var25 & 0x7) + Statics.field2004;
            int var28 = field306.method2094();
            int var29 = field306.method2094();
            int var30 = field306.method2094();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class178 var31 = field332[Statics.field235][var26][var27];
                if (var31 != null) {
                    for (class25 var32 = (class25) var31.method3189(); var32 != null; var32 = (class25) var31.method3182()) {
                        if ((var28 & 0x7FFF) == var32.field606 && var32.field607 == var29) {
                            var32.field607 = var30;
                            break;
                        }
                    }
                    method74(var26, var27);
                }
            }
        } else {
            if (field308 == 99) {
                int var33 = field306.method2116();
                int var34 = (var33 >> 4 & 0x7) + Statics.field2675;
                int var35 = (var33 & 0x7) + Statics.field2004;
                int var36 = field306.method2094();
                int var37 = field306.method2116();
                int var38 = var37 >> 4 & 0xF;
                int var39 = var37 & 0x7;
                int var40 = field306.method2116();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    int var41 = var38 + 1;
                    if (Statics.field1819.field720[0] >= var34 - var41 && Statics.field1819.field720[0] <= var34 + var41 && Statics.field1819.field733[0] >= var35 - var41 && Statics.field1819.field733[0] <= var35 + var41 && field499 != 0 && var39 > 0 && field295 < 50) {
                        field271[field295] = var36;
                        field502[field295] = var39;
                        field391[field295] = var40;
                        field505[field295] = null;
                        field504[field295] = (var34 << 16) + (var35 << 8) + var38;
                        field295++;
                    }
                }
            }
            if (field308 == 90) {
                int var42 = field306.method2116();
                int var43 = (var42 >> 4 & 0x7) + Statics.field2675;
                int var44 = (var42 & 0x7) + Statics.field2004;
                int var45 = field306.method2094();
                int var46 = field306.method2116();
                int var47 = field306.method2094();
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    int var48 = var43 * 128 + 64;
                    int var49 = var44 * 128 + 64;
                    class26 var50 = new class26(var45, Statics.field235, var48, var49, method1815(var48, var49, Statics.field235) - var46, var47, field316);
                    field400.method3184(var50);
                }
            } else if (field308 == 138) {
                int var51 = field306.method2116();
                int var52 = var51 >> 2;
                int var53 = var51 & 0x3;
                int var54 = field325[var52];
                int var55 = field306.method2094();
                int var56 = field306.method2194();
                int var57 = (var56 >> 4 & 0x7) + Statics.field2675;
                int var58 = (var56 & 0x7) + Statics.field2004;
                if (var57 >= 0 && var58 >= 0 && var57 < 103 && var58 < 103) {
                    if (var54 == 0) {
                        class80 var59 = Statics.field16.method1598(Statics.field235, var57, var58);
                        if (var59 != null) {
                            int var60 = var59.field1427 >> 14 & 0x7FFF;
                            if (var52 == 2) {
                                var59.field1425 = new class11(var60, 2, var53 + 4, Statics.field235, var57, var58, var55, false, var59.field1425);
                                var59.field1423 = new class11(var60, 2, var53 + 1 & 0x3, Statics.field235, var57, var58, var55, false, var59.field1423);
                            } else {
                                var59.field1425 = new class11(var60, var52, var53, Statics.field235, var57, var58, var55, false, var59.field1425);
                            }
                        }
                    }
                    if (var54 == 1) {
                        class87 var61 = Statics.field16.method1707(Statics.field235, var57, var58);
                        if (var61 != null) {
                            int var62 = var61.field1519 >> 14 & 0x7FFF;
                            if (var52 == 4 || var52 == 5) {
                                var61.field1508 = new class11(var62, 4, var53, Statics.field235, var57, var58, var55, false, var61.field1508);
                            } else if (var52 == 6) {
                                var61.field1508 = new class11(var62, 4, var53 + 4, Statics.field235, var57, var58, var55, false, var61.field1508);
                            } else if (var52 == 7) {
                                var61.field1508 = new class11(var62, 4, (var53 + 2 & 0x3) + 4, Statics.field235, var57, var58, var55, false, var61.field1508);
                            } else if (var52 == 8) {
                                var61.field1508 = new class11(var62, 4, var53 + 4, Statics.field235, var57, var58, var55, false, var61.field1508);
                                var61.field1514 = new class11(var62, 4, (var53 + 2 & 0x3) + 4, Statics.field235, var57, var58, var55, false, var61.field1514);
                            }
                        }
                    }
                    if (var54 == 2) {
                        class91 var63 = Statics.field16.method1600(Statics.field235, var57, var58);
                        if (var52 == 11) {
                            var52 = 10;
                        }
                        if (var63 != null) {
                            var63.field1567 = new class11(var63.field1575 >> 14 & 0x7FFF, var52, var53, Statics.field235, var57, var58, var55, false, var63.field1567);
                        }
                    }
                    if (var54 == 3) {
                        class86 var64 = Statics.field16.method1601(Statics.field235, var57, var58);
                        if (var64 != null) {
                            var64.field1495 = new class11(var64.field1500 >> 14 & 0x7FFF, 22, var53, Statics.field235, var57, var58, var55, false, var64.field1495);
                        }
                    }
                }
            } else if (field308 == 12) {
                int var65 = field306.method2258();
                int var66 = field306.method2123();
                int var67 = field306.method2117();
                int var68 = (var67 >> 4 & 0x7) + Statics.field2675;
                int var69 = (var67 & 0x7) + Statics.field2004;
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    class25 var70 = new class25();
                    var70.field606 = var65;
                    var70.field607 = var66;
                    if (field332[Statics.field235][var68][var69] == null) {
                        field332[Statics.field235][var68][var69] = new class178();
                    }
                    field332[Statics.field235][var68][var69].method3184(var70);
                    method74(var68, var69);
                }
            } else if (field308 == 251) {
                int var71 = field306.method2125();
                int var72 = field306.method2194();
                int var73 = (var72 >> 4 & 0x7) + Statics.field2675;
                int var74 = (var72 & 0x7) + Statics.field2004;
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    class178 var75 = field332[Statics.field235][var73][var74];
                    if (var75 != null) {
                        for (class25 var76 = (class25) var75.method3189(); var76 != null; var76 = (class25) var75.method3182()) {
                            if ((var71 & 0x7FFF) == var76.field606) {
                                var76.method3285();
                                break;
                            }
                        }
                        if (var75.method3189() == null) {
                            field332[Statics.field235][var73][var74] = null;
                        }
                        method74(var73, var74);
                    }
                }
            } else {
                if (field308 == 40) {
                    byte var77 = field306.method2093();
                    int var78 = field306.method2125();
                    int var79 = field306.method2094();
                    int var80 = field306.method2258();
                    byte var81 = field306.method2220();
                    int var82 = field306.method2125();
                    int var83 = field306.method2116();
                    int var84 = var83 >> 2;
                    int var85 = var83 & 0x3;
                    int var86 = field325[var84];
                    byte var87 = field306.method2220();
                    int var88 = field306.method2116();
                    int var89 = (var88 >> 4 & 0x7) + Statics.field2675;
                    int var90 = (var88 & 0x7) + Statics.field2004;
                    byte var91 = field306.method2093();
                    class3 var92;
                    if (field388 == var79) {
                        var92 = Statics.field1819;
                    } else {
                        var92 = field337[var79];
                    }
                    if (var92 != null) {
                        class36 var93 = class36.method2624(var78);
                        int var94;
                        int var95;
                        if (var85 == 1 || var85 == 3) {
                            var94 = var93.field844;
                            var95 = var93.field843;
                        } else {
                            var94 = var93.field843;
                            var95 = var93.field844;
                        }
                        int var96 = (var94 >> 1) + var89;
                        int var97 = (var94 + 1 >> 1) + var89;
                        int var98 = (var95 >> 1) + var90;
                        int var99 = (var95 + 1 >> 1) + var90;
                        int[][] var100 = class6.field93[Statics.field235];
                        int var101 = var100[var96][var98] + var100[var97][var98] + var100[var96][var99] + var100[var97][var99] >> 2;
                        int var102 = (var89 << 7) + (var94 << 6);
                        int var103 = (var90 << 7) + (var95 << 6);
                        class98 var104 = var93.method644(var84, var85, var100, var102, var101, var103);
                        if (var104 != null) {
                            method447(Statics.field235, var89, var90, var86, -1, 0, 0, var80 + 1, var82 + 1);
                            var92.field37 = field316 + var80;
                            var92.field35 = field316 + var82;
                            var92.field43 = var104;
                            var92.field47 = var89 * 128 + var94 * 64;
                            var92.field31 = var90 * 128 + var95 * 64;
                            var92.field41 = var101;
                            if (var87 > var91) {
                                byte var105 = var87;
                                var87 = var91;
                                var91 = var105;
                            }
                            if (var81 > var77) {
                                byte var106 = var81;
                                var81 = var77;
                                var77 = var106;
                            }
                            var92.field44 = var87 + var89;
                            var92.field46 = var89 + var91;
                            var92.field49 = var81 + var90;
                            var92.field38 = var77 + var90;
                        }
                    }
                }
                if (field308 == 170) {
                    int var107 = field306.method2253();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field2675;
                    int var109 = (var107 & 0x7) + Statics.field2004;
                    int var110 = field306.method2094();
                    int var111 = field306.method2253();
                    int var112 = var111 >> 2;
                    int var113 = var111 & 0x3;
                    int var114 = field325[var112];
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        method447(Statics.field235, var108, var109, var114, var110, var112, var113, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.aa(IIIIIIIIII)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field398.method3189(); var10 != null; var10 = (class15) field398.method3182()) {
            if (var10.field223 == arg0 && var10.field218 == arg1 && var10.field213 == arg2 && var10.field211 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field223 = arg0;
            var9.field211 = arg3;
            var9.field218 = arg1;
            var9.field213 = arg2;
            method70(var9);
            field398.method3184(var9);
        }
        var9.field217 = arg4;
        var9.field224 = arg5;
        var9.field212 = arg6;
        var9.field220 = arg7;
        var9.field221 = arg8;
    }

    @ObfuscatedName("cs.ar(B)V")
    public static final void method1732() {
        for (class15 var0 = (class15) field398.method3189(); var0 != null; var0 = (class15) field398.method3182()) {
            if (var0.field221 == -1) {
                var0.field220 = 0;
                method70(var0);
            } else {
                var0.method3285();
            }
        }
    }

    @ObfuscatedName("i.ap(Ln;I)V")
    public static final void method70(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field211 == 0) {
            var1 = Statics.field16.method1602(arg0.field223, arg0.field218, arg0.field213);
        }
        if (arg0.field211 == 1) {
            var1 = Statics.field16.method1603(arg0.field223, arg0.field218, arg0.field213);
        }
        if (arg0.field211 == 2) {
            var1 = Statics.field16.method1728(arg0.field223, arg0.field218, arg0.field213);
        }
        if (arg0.field211 == 3) {
            var1 = Statics.field16.method1605(arg0.field223, arg0.field218, arg0.field213);
        }
        if (var1 != 0) {
            int var5 = Statics.field16.method1604(arg0.field223, arg0.field218, arg0.field213, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field214 = var2;
        arg0.field216 = var3;
        arg0.field215 = var4;
    }

    @ObfuscatedName("gt.ag(IIIIIIII)V")
    public static final void method3496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field267 && Statics.field235 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field16.method1602(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field16.method1603(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field16.method1728(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field16.method1605(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field16.method1604(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field16.method1593(arg0, arg2, arg3);
                class36 var15 = class36.method2624(var12);
                if (var15.field845 != 0) {
                    field322[arg0].method3480(arg2, arg3, var13, var14, var15.field846);
                }
            }
            if (arg1 == 1) {
                Statics.field16.method1594(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field16.method1595(arg0, arg2, arg3);
                class36 var16 = class36.method2624(var12);
                if (var16.field843 + arg2 > 103 || var16.field843 + arg3 > 103 || var16.field844 + arg2 > 103 || var16.field844 + arg3 > 103) {
                    return;
                }
                if (var16.field845 != 0) {
                    field322[arg0].method3459(arg2, arg3, var16.field843, var16.field844, var14, var16.field846);
                }
            }
            if (arg1 == 3) {
                Statics.field16.method1596(arg0, arg2, arg3);
                class36 var17 = class36.method2624(var12);
                if (var17.field845 == 1) {
                    field322[arg0].method3460(arg2, arg3);
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
        class79 var19 = Statics.field16;
        class198 var20 = field322[arg0];
        class36 var21 = class36.method2624(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field844;
            var23 = var21.field843;
        } else {
            var22 = var21.field843;
            var23 = var21.field844;
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
        int[][] var28 = class6.field93[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field847 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field868 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field833 == -1 && var21.field870 == null) {
                var34 = var21.method644(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1582(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field845 == 1) {
                var20.method3453(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field833 == -1 && var21.field870 == null) {
                var57 = var21.method644(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1586(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field845 != 0) {
                var20.method3451(arg2, arg3, var22, var23, var21.field846);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field833 == -1 && var21.field870 == null) {
                var35 = var21.method644(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1586(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field845 != 0) {
                var20.method3451(arg2, arg3, var22, var23, var21.field846);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field833 == -1 && var21.field870 == null) {
                var36 = var21.method644(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1709(arg0, arg2, arg3, var29, var36, (class78) null, class6.field91[arg5], 0, var32, var33);
            if (var21.field845 != 0) {
                var20.method3473(arg2, arg3, arg6, arg5, var21.field846);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field833 == -1 && var21.field870 == null) {
                var37 = var21.method644(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1709(arg0, arg2, arg3, var29, var37, (class78) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field845 != 0) {
                var20.method3473(arg2, arg3, arg6, arg5, var21.field846);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field833 == -1 && var21.field870 == null) {
                var39 = var21.method644(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method644(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1709(arg0, arg2, arg3, var29, var39, var40, class6.field91[arg5], class6.field91[var38], var32, var33);
            if (var21.field845 != 0) {
                var20.method3473(arg2, arg3, arg6, arg5, var21.field846);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field833 == -1 && var21.field870 == null) {
                var41 = var21.method644(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1709(arg0, arg2, arg3, var29, var41, (class78) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field845 != 0) {
                var20.method3473(arg2, arg3, arg6, arg5, var21.field846);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field833 == -1 && var21.field870 == null) {
                var42 = var21.method644(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1586(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field845 != 0) {
                var20.method3451(arg2, arg3, var22, var23, var21.field846);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field833 == -1 && var21.field870 == null) {
                var43 = var21.method644(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1697(arg0, arg2, arg3, var29, var43, (class78) null, class6.field91[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1602(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method2624(var45 >> 14 & 0x7FFF).field827;
            }
            class78 var46;
            if (var21.field833 == -1 && var21.field870 == null) {
                var46 = var21.method644(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1697(arg0, arg2, arg3, var29, var46, (class78) null, class6.field91[arg5], 0, class6.field82[arg5] * var44, class6.field90[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1602(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method2624(var48 >> 14 & 0x7FFF).field827 / 2;
            }
            class78 var49;
            if (var21.field833 == -1 && var21.field870 == null) {
                var49 = var21.method644(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1697(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field84[arg5] * var47, class6.field85[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field833 == -1 && var21.field870 == null) {
                var51 = var21.method644(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1697(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1602(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method2624(var53 >> 14 & 0x7FFF).field827 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field833 == -1 && var21.field870 == null) {
                var55 = var21.method644(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method644(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field833, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field833, true, (class78) null);
            }
            var19.method1697(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field84[arg5] * var52, class6.field85[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("t.af(III)V")
    public static final void method74(int arg0, int arg1) {
        class178 var2 = field332[Statics.field235][arg0][arg1];
        if (var2 == null) {
            Statics.field16.method1597(Statics.field235, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3189(); var6 != null; var6 = (class25) var2.method3182()) {
            class45 var7 = class45.method2351(var6.field606);
            long var8 = (long) var7.field1006;
            if (var7.field1022 == 1) {
                var8 = (long) (var6.field607 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field16.method1597(Statics.field235, arg0, arg1);
            return;
        }
        var2.method3185(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3189(); var12 != null; var12 = (class25) var2.method3182()) {
            if (var5.field606 != var12.field606) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field606 != var12.field606 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field16.method1583(Statics.field235, arg0, arg1, method1815(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field235), var5, var13, var10, var11);
    }

    @ObfuscatedName("dt.al(B)V")
    public static final void method2526() {
        field306.method2312();
        int var0 = field306.method2309(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field306.method2309(2);
        if (var1 == 0) {
            field386[++field512 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field306.method2309(3);
            Statics.field1819.method595(var2, false);
            int var3 = field306.method2309(1);
            if (var3 == 1) {
                field386[++field512 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field306.method2309(3);
            Statics.field1819.method595(var4, true);
            int var5 = field306.method2309(3);
            Statics.field1819.method595(var5, true);
            int var6 = field306.method2309(1);
            if (var6 == 1) {
                field386[++field512 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field306.method2309(7);
            Statics.field235 = field306.method2309(2);
            int var8 = field306.method2309(7);
            int var9 = field306.method2309(1);
            int var10 = field306.method2309(1);
            if (var10 == 1) {
                field386[++field512 - 1] = 2047;
            }
            Statics.field1819.method590(var7, var8, var9 == 1);
        }
    }

    @ObfuscatedName("b.bc(ILv;II)V")
    public static final void method454(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x20) != 0) {
            arg1.field771 = field306.method2258();
            if (arg1.field771 == 65535) {
                arg1.field771 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field764 = field306.method2258();
            arg1.field744 = field306.method2123();
        }
        if ((arg2 & 0x1) != 0) {
            int var3 = field306.method2258();
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = field306.method2116();
            method2633(arg1, var3, var4);
        }
        if ((arg2 & 0x2) != 0) {
            int var5 = field306.method2253();
            byte[] var6 = new byte[var5];
            class107 var7 = new class107(var6);
            field306.method2135(var6, 0, var5);
            field387[arg0] = var7;
            arg1.method16(var7);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field760 = field306.method2253();
            arg1.field749 = field306.method2116();
            arg1.field759 = field306.method2116();
            arg1.field718 = field306.method2117();
            arg1.field762 = field306.method2258() + field316;
            arg1.field763 = field306.method2094() + field316;
            arg1.field732 = field306.method2117();
            arg1.field770 = 1;
            arg1.field775 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var8 = field306.method2094();
            int var9 = field306.method2117();
            arg1.method589(var8, var9, field316);
            arg1.field772 = field316 + 300;
            arg1.field723 = field306.method2194();
            arg1.field741 = field306.method2117();
        }
        if ((arg2 & 0x4) != 0) {
            int var10 = field306.method2123();
            class138 var11 = (class138) class99.method1567(class138.method520(), field306.method2116());
            boolean var12 = field306.method2253() == 1;
            int var13 = field306.method2253();
            int var14 = field306.field1851;
            if (arg1.field39 != null && arg1.field45 != null) {
                boolean var15 = false;
                if (var11.field2124 && method1812(arg1.field39)) {
                    var15 = true;
                }
                if (!var15 && field381 == 0 && !arg1.field50) {
                    field289.field1851 = 0;
                    field306.method2155(field289.field1854, 0, var13);
                    field289.field1851 = 0;
                    class107 var16 = field289;
                    String var20;
                    try {
                        int var17 = var16.method2112();
                        if (var17 > 32767) {
                            var17 = 32767;
                        }
                        byte[] var18 = new byte[var17];
                        var16.field1851 += Statics.field2910.method2029(var16.field1854, var16.field1851, var18, 0, var17);
                        String var19 = class202.method3292(var18, 0, var17);
                        var20 = var19;
                    } catch (Exception var28) {
                        var20 = "Cabbage";
                    }
                    String var23 = class193.method3315(class200.method524(var20));
                    arg1.field757 = var23.trim();
                    arg1.field734 = var10 >> 8;
                    arg1.field735 = var10 & 0xFF;
                    arg1.field719 = 150;
                    arg1.field758 = var12;
                    int var24;
                    if (var11.field2123) {
                        var24 = var12 ? 91 : 1;
                    } else {
                        var24 = var12 ? 90 : 2;
                    }
                    if (var11.field2120 == -1) {
                        class10.method1845(var24, arg1.field39, var23);
                    } else {
                        class10.method1845(var24, class2.method2783(var11.field2120) + arg1.field39, var23);
                    }
                }
            }
            field306.field1851 = var13 + var14;
        }
        if ((arg2 & 0x100) != 0) {
            int var25 = field306.method2125();
            int var26 = field306.method2194();
            arg1.method589(var25, var26, field316);
            arg1.field772 = field316 + 300;
            arg1.field723 = field306.method2194();
            arg1.field741 = field306.method2194();
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field757 = field306.method2100();
            if (arg1.field757.charAt(0) == '~') {
                arg1.field757 = arg1.field757.substring(1);
                class10.method1845(2, arg1.field39, arg1.field757);
            } else if (Statics.field1819 == arg1) {
                class10.method1845(2, arg1.field39, arg1.field757);
            }
            arg1.field758 = false;
            arg1.field734 = 0;
            arg1.field735 = 0;
            arg1.field719 = 150;
        }
        if ((arg2 & 0x200) == 0) {
            return;
        }
        arg1.field753 = field306.method2258();
        int var27 = field306.method2132();
        arg1.field725 = var27 >> 16;
        arg1.field739 = (var27 & 0xFFFF) + field316;
        arg1.field754 = 0;
        arg1.field755 = 0;
        if (arg1.field739 > field316) {
            arg1.field754 = -1;
        }
        if (arg1.field753 == 65535) {
            arg1.field753 = -1;
        }
    }

    @ObfuscatedName("at.bf(I)V")
    public static final void method884() {
        field390 = 0;
        field512 = 0;
        field306.method2312();
        int var0 = field306.method2309(8);
        if (var0 < field403) {
            for (int var1 = var0; var1 < field403; var1++) {
                field277[++field390 - 1] = field302[var1];
            }
        }
        if (var0 > field403) {
            throw new RuntimeException("");
        }
        field403 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field302[var2];
            class30 var4 = field300[var3];
            int var5 = field306.method2309(1);
            if (var5 == 0) {
                field302[++field403 - 1] = var3;
                var4.field765 = field316;
            } else {
                int var6 = field306.method2309(2);
                if (var6 == 0) {
                    field302[++field403 - 1] = var3;
                    var4.field765 = field316;
                    field386[++field512 - 1] = var3;
                } else if (var6 == 1) {
                    field302[++field403 - 1] = var3;
                    var4.field765 = field316;
                    int var7 = field306.method2309(3);
                    var4.method595(var7, false);
                    int var8 = field306.method2309(1);
                    if (var8 == 1) {
                        field386[++field512 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field302[++field403 - 1] = var3;
                    var4.field765 = field316;
                    int var9 = field306.method2309(3);
                    var4.method595(var9, true);
                    int var10 = field306.method2309(3);
                    var4.method595(var10, true);
                    int var11 = field306.method2309(1);
                    if (var11 == 1) {
                        field386[++field512 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field277[++field390 - 1] = var3;
                }
            }
        }
        while (field306.method2311(field307) >= 27) {
            int var12 = field306.method2309(15);
            if (var12 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field300[var12] == null) {
                field300[var12] = new class30();
                var16 = true;
            }
            class30 var17 = field300[var12];
            field302[++field403 - 1] = var12;
            var17.field765 = field316;
            int var18 = field290[field306.method2309(3)];
            if (var16) {
                var17.field767 = var17.field740 = var18;
            }
            int var19 = field306.method2309(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field306.method2309(5);
            if (var20 > 15) {
                var20 -= 32;
            }
            int var21 = field306.method2309(1);
            if (var21 == 1) {
                field386[++field512 - 1] = var12;
            }
            var17.field686 = Statics.method76(field306.method2309(14));
            int var22 = field306.method2309(1);
            var17.field722 = var17.field686.field794;
            var17.field742 = var17.field686.field787;
            if (var17.field742 == 0) {
                var17.field740 = 0;
            }
            var17.field726 = var17.field686.field799;
            var17.field727 = var17.field686.field800;
            var17.field728 = var17.field686.field822;
            var17.field731 = var17.field686.field802;
            var17.field756 = var17.field686.field796;
            var17.field724 = var17.field686.field793;
            var17.field766 = var17.field686.field798;
            var17.method590(Statics.field1819.field720[0] + var20, Statics.field1819.field733[0] + var19, var22 == 1);
        }
        field306.method2319();
        method21();
        for (int var13 = 0; var13 < field390; var13++) {
            int var14 = field277[var13];
            if (field316 != field300[var14].field765) {
                field300[var14].field686 = null;
                field300[var14] = null;
            }
        }
        if (field307 != field306.field1851) {
            throw new RuntimeException(field306.field1851 + class2.field21 + field307);
        }
        for (int var15 = 0; var15 < field403; var15++) {
            if (field300[field302[var15]] == null) {
                throw new RuntimeException(var15 + class2.field21 + field403);
            }
        }
    }

    @ObfuscatedName("v.bk(I)V")
    public static final void method21() {
        for (int var0 = 0; var0 < field512; var0++) {
            int var1 = field386[var0];
            class30 var2 = field300[var1];
            int var3 = field306.method2116();
            if ((var3 & 0x40) != 0) {
                var2.field753 = field306.method2123();
                int var4 = field306.method2119();
                var2.field725 = var4 >> 16;
                var2.field739 = (var4 & 0xFFFF) + field316;
                var2.field754 = 0;
                var2.field755 = 0;
                if (var2.field739 > field316) {
                    var2.field754 = -1;
                }
                if (var2.field753 == 65535) {
                    var2.field753 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field764 = field306.method2094();
                var2.field744 = field306.method2258();
            }
            if ((var3 & 0x2) != 0) {
                int var5 = field306.method2094();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field306.method2117();
                if (var2.field748 == var5 && var5 != -1) {
                    int var7 = class38.method1935(var5).field911;
                    if (var7 == 1) {
                        var2.field730 = 0;
                        var2.field769 = 0;
                        var2.field750 = var6;
                        var2.field752 = 0;
                    }
                    if (var7 == 2) {
                        var2.field752 = 0;
                    }
                } else if (var5 == -1 || var2.field748 == -1 || class38.method1935(var5).field905 >= class38.method1935(var2.field748).field905) {
                    var2.field748 = var5;
                    var2.field730 = 0;
                    var2.field769 = 0;
                    var2.field750 = var6;
                    var2.field752 = 0;
                    var2.field775 = var2.field770;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field757 = field306.method2100();
                var2.field719 = 100;
            }
            if ((var3 & 0x1) != 0) {
                int var8 = field306.method2117();
                int var9 = field306.method2117();
                var2.method589(var8, var9, field316);
                var2.field772 = field316 + 300;
                var2.field723 = field306.method2094();
                var2.field741 = field306.method2094();
            }
            if ((var3 & 0x20) != 0) {
                var2.field771 = field306.method2094();
                if (var2.field771 == 65535) {
                    var2.field771 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field686 = Statics.method76(field306.method2123());
                var2.field722 = var2.field686.field794;
                var2.field742 = var2.field686.field787;
                var2.field726 = var2.field686.field799;
                var2.field727 = var2.field686.field800;
                var2.field728 = var2.field686.field822;
                var2.field731 = var2.field686.field802;
                var2.field756 = var2.field686.field796;
                var2.field724 = var2.field686.field793;
                var2.field766 = var2.field686.field798;
            }
            if ((var3 & 0x10) != 0) {
                int var10 = field306.method2194();
                int var11 = field306.method2253();
                var2.method589(var10, var11, field316);
                var2.field772 = field316 + 300;
                var2.field723 = field306.method2094();
                var2.field741 = field306.method2258();
            }
        }
    }

    @ObfuscatedName("ck.bn(III)V")
    public static final void method2022(int arg0, int arg1) {
        if (field406 < 2 && field469 == 0 && !field419) {
            return;
        }
        String var2;
        if (field469 == 1 && field406 < 2) {
            var2 = class143.field2240 + class143.field2325 + field418 + " " + class2.field20;
        } else if (field419 && field406 < 2) {
            var2 = field422 + class143.field2325 + field515 + " " + class2.field20;
        } else {
            var2 = method1841(field406 - 1);
        }
        if (field406 > 2) {
            var2 = var2 + class2.method1382(16777215) + " " + '/' + " " + (field406 - 2) + class143.field2181;
        }
        Statics.field1839.method3356(var2, arg0 + 4, arg1 + 15, 16777215, 0, field316 / 1000);
    }

    @ObfuscatedName("do.bp(I)V")
    public static final void method2328() {
        int var0 = Statics.field1869;
        int var1 = Statics.field964;
        int var2 = Statics.field69;
        int var3 = Statics.field2896;
        int var4 = 6116423;
        class73.method1474(var0, var1, var2, var3, var4);
        class73.method1474(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1537(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1839.method3396(class143.field2318, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2035;
        int var6 = class127.field2029;
        for (int var7 = 0; var7 < field406; var7++) {
            int var8 = (field406 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1839.method3396(method1841(var7), var0 + 3, var8, var9, 0);
        }
        method2595(Statics.field1869, Statics.field964, Statics.field69, Statics.field2896);
    }

    @ObfuscatedName("eq.bm(IIIII)V")
    public static final void method2595(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field355; var4++) {
            if (field473[var4] + field471[var4] > arg0 && field471[var4] < arg0 + arg2 && field472[var4] + field379[var4] > arg1 && field472[var4] < arg1 + arg3) {
                field313[var4] = true;
            }
        }
    }

    @ObfuscatedName("ax.ba(I)V")
    public static final void method578() {
        method606();
        if (Statics.field1890 != null || field436 != null) {
            return;
        }
        int var12;
        int var13;
        label195: {
            int var0 = class127.field2034;
            if (field305) {
                if (var0 != 1 && (Statics.field2146 || var0 != 4)) {
                    int var1 = class127.field2035;
                    int var2 = class127.field2029;
                    if (var1 < Statics.field1869 - 10 || var1 > Statics.field69 + Statics.field1869 + 10 || var2 < Statics.field964 - 10 || var2 > Statics.field964 + Statics.field2896 + 10) {
                        field305 = false;
                        Statics.method801(Statics.field1869, Statics.field964, Statics.field69, Statics.field2896);
                    }
                }
                if (var0 == 1 || !Statics.field2146 && var0 == 4) {
                    int var3 = Statics.field1869;
                    int var4 = Statics.field964;
                    int var5 = Statics.field69;
                    int var6 = class127.field2028;
                    int var7 = class127.field2036;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field406; var9++) {
                        int var10 = (field406 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method2620(var8);
                    }
                    field305 = false;
                    Statics.method801(Statics.field1869, Statics.field964, Statics.field69, Statics.field2896);
                }
            } else {
                if ((var0 == 1 || !Statics.field2146 && var0 == 4) && field406 > 0) {
                    int var11 = field409[field406 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field301[field406 - 1];
                        var13 = field408[field406 - 1];
                        class153 var14 = class153.method117(var13);
                        int var15 = method2036(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label195;
                        }
                        class157 var10000 = (class157) null;
                        if (class157.method150(method2036(var14))) {
                            break label195;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field2146 && var0 == 4) && (field404 == 1 && field406 > 2 || method582(field406 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field2146 && var0 == 4) && field406 > 0) {
                    method2620(field406 - 1);
                }
                if (var0 == 2 && field406 > 0) {
                    method152(class127.field2028, class127.field2036);
                }
            }
            return;
        }
        if (Statics.field1890 != null && !field334 && field404 != 1 && !method582(field406 - 1) && field406 > 0) {
            method1934(field376, field377);
        }
        field334 = false;
        field380 = 0;
        if (Statics.field1890 != null) {
            method5(Statics.field1890);
        }
        Statics.field1890 = class153.method117(var13);
        field349 = var12;
        field376 = class127.field2028;
        field377 = class127.field2036;
        if (field406 > 0) {
            int var17 = field406 - 1;
            Statics.field188 = new class27();
            Statics.field188.field638 = field301[var17];
            Statics.field188.field627 = field408[var17];
            Statics.field188.field629 = field409[var17];
            Statics.field188.field630 = field410[var17];
            Statics.field188.field634 = field411[var17];
        }
        method5(Statics.field1890);
    }

    @ObfuscatedName("n.be(III)V")
    public static final void method152(int arg0, int arg1) {
        int var2 = Statics.field1839.method3318(class143.field2318);
        for (int var3 = 0; var3 < field406; var3++) {
            int var4 = Statics.field1839.method3318(method1841(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field406 * 15 + 21;
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
        field305 = true;
        Statics.field1869 = var6;
        Statics.field964 = var7;
        Statics.field69 = var2;
        Statics.field2896 = field406 * 15 + 22;
    }

    @ObfuscatedName("ac.bl(II)Z")
    public static final boolean method582(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field409[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ec.bt(II)V")
    public static final void method2620(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field301[arg0];
        int var2 = field408[arg0];
        int var3 = field409[arg0];
        int var4 = field410[arg0];
        String var5 = field411[arg0];
        String var6 = field412[arg0];
        method2775(var1, var2, var3, var4, var5, var6, class127.field2028, class127.field2036);
    }

    @ObfuscatedName("ej.bw(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2775(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 19) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(181);
            field304.method2177(Statics.field256 + arg0);
            field304.method2172(Statics.field879 + arg1);
            field304.method2079(class124.field1994[82] ? 1 : 0);
            field304.method2172(arg3);
        }
        if (arg2 == 25) {
            class153 var8 = class153.method518(arg1, arg0);
            if (var8 != null) {
                method1842();
                int var9 = method2036(var8);
                int var10 = var9 >> 11 & 0x3F;
                int var12 = var8.field2576;
                class153 var13 = class153.method518(arg1, arg0);
                if (var13 != null && var13.field2628 != null) {
                    class1 var14 = new class1();
                    var14.field3 = var13;
                    var14.field8 = var13.field2628;
                    class32.method1819(var14);
                }
                field421 = var12;
                field419 = true;
                Statics.field776 = arg1;
                field417 = arg0;
                Statics.field2823 = var10;
                method5(var13);
                field469 = 0;
                field422 = method1817(var8);
                if (field422 == null) {
                    field422 = "Null";
                }
                if (var8.field2612) {
                    field515 = var8.field2621 + class2.method1382(16777215);
                } else {
                    field515 = class2.method1382(65280) + var8.field2613 + class2.method1382(16777215);
                }
            }
            return;
        }
        if (arg2 == 47) {
            class3 var15 = field337[arg3];
            if (var15 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(50);
                field304.method2177(arg3);
                field304.method2079(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class30 var16 = field300[arg3];
            if (var16 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(243);
                field304.method2177(arg3);
                field304.method2115(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(126);
            field304.method2079(class124.field1994[82] ? 1 : 0);
            field304.method2177(Statics.field256 + arg0);
            field304.method2177(arg3);
            field304.method2177(Statics.field879 + arg1);
        }
        if (arg2 == 46) {
            class3 var17 = field337[arg3];
            if (var17 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(78);
                field304.method2172(arg3);
                field304.method2079(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var18 = field337[arg3];
            if (var18 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(232);
                field304.method2122(arg3);
                field304.method2079(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field304.method2306(83);
            field304.method2177(arg3);
            field304.method2121(arg0);
            field304.method2082(arg1);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 20) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(254);
            field304.method2121(Statics.field879 + arg1);
            field304.method2121(arg3);
            field304.method2172(Statics.field256 + arg0);
            field304.method2081(class124.field1994[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field304.method2306(51);
            field304.method2172(arg0);
            field304.method2216(arg1);
            field304.method2172(arg3);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 4) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(102);
            field304.method2081(class124.field1994[82] ? 1 : 0);
            field304.method2177(Statics.field879 + arg1);
            field304.method2172(arg3 >> 14 & 0x7FFF);
            field304.method2172(Statics.field256 + arg0);
        }
        if (arg2 == 50) {
            class3 var19 = field337[arg3];
            if (var19 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(40);
                field304.method2081(class124.field1994[82] ? 1 : 0);
                field304.method2122(arg3);
            }
        }
        if (arg2 == 21) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(223);
            field304.method2122(arg3);
            field304.method2113(class124.field1994[82] ? 1 : 0);
            field304.method2177(Statics.field256 + arg0);
            field304.method2122(Statics.field879 + arg1);
        }
        if (arg2 == 36) {
            field304.method2306(166);
            field304.method2082(arg1);
            field304.method2122(arg0);
            field304.method2177(arg3);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class153 var20 = class153.method518(arg1, arg0);
            if (var20 != null) {
                int var21 = var20.field2576;
                class153 var22 = class153.method518(arg1, arg0);
                if (var22 != null) {
                    if (var22.field2660 != null) {
                        class1 var23 = new class1();
                        var23.field3 = var22;
                        var23.field6 = arg3;
                        var23.field4 = arg5;
                        var23.field8 = var22.field2660;
                        class32.method1569(var23, 200000);
                    }
                    boolean var24 = true;
                    if (var22.field2541 > 0) {
                        var24 = method445(var22);
                    }
                    if (var24 && class157.method2631(method2036(var22), arg3 - 1)) {
                        if (arg3 == 1) {
                            field304.method2306(19);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 2) {
                            field304.method2306(89);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 3) {
                            field304.method2306(125);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 4) {
                            field304.method2306(202);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 5) {
                            field304.method2306(73);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 6) {
                            field304.method2306(21);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 7) {
                            field304.method2306(63);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 8) {
                            field304.method2306(124);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 9) {
                            field304.method2306(70);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                        if (arg3 == 10) {
                            field304.method2306(100);
                            field304.method2082(arg1);
                            field304.method2177(arg0);
                            field304.method2177(var21);
                        }
                    }
                }
            }
        }
        if (arg2 == 44) {
            class3 var25 = field337[arg3];
            if (var25 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(26);
                field304.method2172(arg3);
                field304.method2115(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class30 var26 = field300[arg3];
            if (var26 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(240);
                field304.method2115(class124.field1994[82] ? 1 : 0);
                field304.method2177(arg3);
            }
        }
        if (arg2 == 40) {
            field304.method2306(163);
            field304.method2122(arg0);
            field304.method2172(arg3);
            field304.method2082(arg1);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 6) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(235);
            field304.method2172(Statics.field256 + arg0);
            field304.method2081(class124.field1994[82] ? 1 : 0);
            field304.method2122(arg3 >> 14 & 0x7FFF);
            field304.method2122(Statics.field879 + arg1);
        }
        if (arg2 == 43) {
            field304.method2306(59);
            field304.method2082(arg1);
            field304.method2122(arg0);
            field304.method2172(arg3);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 26) {
            method457();
        }
        if (arg2 == 38) {
            method1842();
            class153 var27 = class153.method117(arg1);
            field469 = 1;
            Statics.field1820 = arg0;
            Statics.field204 = arg1;
            Statics.field674 = arg3;
            method5(var27);
            field418 = class2.method1382(16748608) + class45.method2351(arg3).field1011 + class2.method1382(16777215);
            if (field418 == null) {
                field418 = "null";
            }
            return;
        }
        if (arg2 == 24) {
            class153 var28 = class153.method117(arg1);
            boolean var29 = true;
            if (var28.field2541 > 0) {
                var29 = method445(var28);
            }
            if (var29) {
                field304.method2306(120);
                field304.method2082(arg1);
            }
        }
        if (arg2 == 5) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(69);
            field304.method2121(Statics.field879 + arg1);
            field304.method2122(Statics.field256 + arg0);
            field304.method2177(arg3 >> 14 & 0x7FFF);
            field304.method2079(class124.field1994[82] ? 1 : 0);
        }
        if (arg2 == 51) {
            class3 var30 = field337[arg3];
            if (var30 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(218);
                field304.method2081(class124.field1994[82] ? 1 : 0);
                field304.method2122(arg3);
            }
        }
        if (arg2 == 32) {
            field304.method2306(154);
            field304.method2172(arg0);
            field304.method2177(field417);
            field304.method2082(Statics.field776);
            field304.method2172(arg3);
            field304.method2082(arg1);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 34) {
            field304.method2306(248);
            field304.method2082(arg1);
            field304.method2122(arg0);
            field304.method2122(arg3);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 31) {
            field304.method2306(112);
            field304.method2177(Statics.field674);
            field304.method2122(arg3);
            field304.method2130(arg1);
            field304.method2130(Statics.field204);
            field304.method2122(Statics.field1820);
            field304.method2121(arg0);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 37) {
            field304.method2306(31);
            field304.method2121(arg3);
            field304.method2121(arg0);
            field304.method2157(arg1);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 29) {
            field304.method2306(120);
            field304.method2082(arg1);
            class153 var31 = class153.method117(arg1);
            if (var31.field2646 != null && var31.field2646[0][0] == 5) {
                int var32 = var31.field2646[0][1];
                if (class155.field2680[var32] != var31.field2648[0]) {
                    class155.field2680[var32] = var31.field2648[0];
                    method523(var32);
                }
            }
        }
        if (arg2 == 1) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(209);
            field304.method2177(Statics.field256 + arg0);
            field304.method2113(class124.field1994[82] ? 1 : 0);
            field304.method2172(Statics.field674);
            field304.method2172(Statics.field879 + arg1);
            field304.method2177(Statics.field1820);
            field304.method2172(arg3 >> 14 & 0x7FFF);
            field304.method2216(Statics.field204);
        }
        if (arg2 == 22) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(106);
            field304.method2172(Statics.field256 + arg0);
            field304.method2172(Statics.field879 + arg1);
            field304.method2113(class124.field1994[82] ? 1 : 0);
            field304.method2121(arg3);
        }
        if (arg2 == 1005) {
            class153 var33 = class153.method117(arg1);
            if (var33 == null || var33.field2587[arg0] < 100000) {
                field304.method2306(118);
                field304.method2121(arg3);
            } else {
                class10.method1845(27, "", var33.field2587[arg0] + " x " + class45.method2351(arg3).field1011);
            }
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 1001) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(93);
            field304.method2121(Statics.field879 + arg1);
            field304.method2081(class124.field1994[82] ? 1 : 0);
            field304.method2122(arg3 >> 14 & 0x7FFF);
            field304.method2121(Statics.field256 + arg0);
        }
        if (arg2 == 17) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(195);
            field304.method2122(Statics.field879 + arg1);
            field304.method2121(field417);
            field304.method2172(Statics.field256 + arg0);
            field304.method2082(Statics.field776);
            field304.method2115(class124.field1994[82] ? 1 : 0);
            field304.method2172(arg3);
        }
        if (arg2 == 14) {
            class3 var34 = field337[arg3];
            if (var34 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(149);
                field304.method2172(Statics.field674);
                field304.method2079(class124.field1994[82] ? 1 : 0);
                field304.method2130(Statics.field204);
                field304.method2122(arg3);
                field304.method2177(Statics.field1820);
            }
        }
        if (arg2 == 9) {
            class30 var35 = field300[arg3];
            if (var35 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(6);
                field304.method2121(arg3);
                field304.method2079(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field304.method2306(120);
            field304.method2082(arg1);
            class153 var36 = class153.method117(arg1);
            if (var36.field2646 != null && var36.field2646[0][0] == 5) {
                int var37 = var36.field2646[0][1];
                class155.field2680[var37] = 1 - class155.field2680[var37];
                method523(var37);
            }
        }
        if (arg2 == 11) {
            class30 var38 = field300[arg3];
            if (var38 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(152);
                field304.method2081(class124.field1994[82] ? 1 : 0);
                field304.method2177(arg3);
            }
        }
        if (arg2 == 2) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(194);
            field304.method2157(Statics.field776);
            field304.method2172(field417);
            field304.method2079(class124.field1994[82] ? 1 : 0);
            field304.method2172(Statics.field256 + arg0);
            field304.method2121(Statics.field879 + arg1);
            field304.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 23) {
            Statics.field16.method1613(Statics.field235, arg0, arg1);
        }
        if (arg2 == 41) {
            field304.method2306(131);
            field304.method2122(arg0);
            field304.method2122(arg3);
            field304.method2157(arg1);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 1004) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field304.method2306(118);
            field304.method2121(arg3);
        }
        if (arg2 == 42) {
            field304.method2306(196);
            field304.method2177(arg0);
            field304.method2082(arg1);
            field304.method2172(arg3);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 58) {
            class153 var39 = class153.method518(arg1, arg0);
            if (var39 != null) {
                field304.method2306(204);
                field304.method2122(field417);
                field304.method2122(arg0);
                field304.method2157(Statics.field776);
                field304.method2172(field421);
                field304.method2122(var39.field2576);
                field304.method2157(arg1);
            }
        }
        if (arg2 == 3) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(206);
            field304.method2177(Statics.field256 + arg0);
            field304.method2172(arg3 >> 14 & 0x7FFF);
            field304.method2121(Statics.field879 + arg1);
            field304.method2079(class124.field1994[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class3 var40 = field337[arg3];
            if (var40 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(110);
                field304.method2172(arg3);
                field304.method2115(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field304.method2306(199);
            field304.method2177(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1003) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            class30 var41 = field300[arg3];
            if (var41 != null) {
                class35 var42 = var41.field686;
                if (var42.field817 != null) {
                    var42 = var42.method622();
                }
                if (var42 != null) {
                    field304.method2306(41);
                    field304.method2177(var42.field791);
                }
            }
        }
        if (arg2 == 48) {
            class3 var43 = field337[arg3];
            if (var43 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(219);
                field304.method2079(class124.field1994[82] ? 1 : 0);
                field304.method2177(arg3);
            }
        }
        if (arg2 == 7) {
            class30 var44 = field300[arg3];
            if (var44 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(66);
                field304.method2177(arg3);
                field304.method2177(Statics.field674);
                field304.method2113(class124.field1994[82] ? 1 : 0);
                field304.method2130(Statics.field204);
                field304.method2172(Statics.field1820);
            }
        }
        if (arg2 == 10) {
            class30 var45 = field300[arg3];
            if (var45 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(146);
                field304.method2121(arg3);
                field304.method2081(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field304.method2306(145);
            field304.method2172(arg3);
            field304.method2121(arg0);
            field304.method2130(arg1);
            field283 = 0;
            Statics.field1501 = class153.method117(arg1);
            field374 = arg0;
        }
        if (arg2 == 16) {
            field369 = arg6;
            field317 = arg7;
            field372 = 2;
            field371 = 0;
            field364 = arg0;
            field493 = arg1;
            field304.method2306(9);
            field304.method2081(class124.field1994[82] ? 1 : 0);
            field304.method2122(arg3);
            field304.method2122(Statics.field674);
            field304.method2122(Statics.field256 + arg0);
            field304.method2172(Statics.field1820);
            field304.method2157(Statics.field204);
            field304.method2121(Statics.field879 + arg1);
        }
        if (arg2 == 8) {
            class30 var46 = field300[arg3];
            if (var46 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(177);
                field304.method2177(field417);
                field304.method2177(arg3);
                field304.method2082(Statics.field776);
                field304.method2113(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field463 == null) {
            field304.method2306(27);
            field304.method2157(arg1);
            field304.method2177(arg0);
            field463 = class153.method518(arg1, arg0);
            method5(field463);
        }
        if (arg2 == 15) {
            class3 var47 = field337[arg3];
            if (var47 != null) {
                field369 = arg6;
                field317 = arg7;
                field372 = 2;
                field371 = 0;
                field364 = arg0;
                field493 = arg1;
                field304.method2306(180);
                field304.method2113(class124.field1994[82] ? 1 : 0);
                field304.method2122(field417);
                field304.method2130(Statics.field776);
                field304.method2177(arg3);
            }
        }
        if (field469 != 0) {
            field469 = 0;
            method5(class153.method117(Statics.field204));
        }
        if (field419) {
            method1842();
        }
        if (Statics.field1501 != null && field283 == 0) {
            method5(Statics.field1501);
        }
    }

    @ObfuscatedName("cl.bv(I)V")
    public static void method1842() {
        if (!field419) {
            return;
        }
        class153 var0 = class153.method518(Statics.field776, field417);
        if (var0 != null && var0.field2629 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2629;
            class32.method1819(var1);
        }
        field419 = false;
        method5(var0);
    }

    @ObfuscatedName("az.by(I)V")
    public static final void method606() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field406 - 1; var1++) {
                if (field409[var1] < 1000 && field409[var1 + 1] > 1000) {
                    String var2 = field412[var1];
                    field412[var1] = field412[var1 + 1];
                    field412[var1 + 1] = var2;
                    String var3 = field411[var1];
                    field411[var1] = field411[var1 + 1];
                    field411[var1 + 1] = var3;
                    int var4 = field409[var1];
                    field409[var1] = field409[var1 + 1];
                    field409[var1 + 1] = var4;
                    int var5 = field301[var1];
                    field301[var1] = field301[var1 + 1];
                    field301[var1 + 1] = var5;
                    int var6 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var6;
                    int var7 = field410[var1];
                    field410[var1] = field410[var1 + 1];
                    field410[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("o.bi(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method31(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field305 || field406 >= 500) {
            return;
        }
        field411[field406] = arg0;
        field412[field406] = arg1;
        field409[field406] = arg2;
        field410[field406] = arg3;
        field301[field406] = arg4;
        field408[field406] = arg5;
        field406++;
    }

    @ObfuscatedName("c.bd(I)V")
    public static void method137() {
        for (int var0 = 0; var0 < field406; var0++) {
            int var1 = field409[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field406 - 1) {
                    for (int var3 = var0; var3 < field406 - 1; var3++) {
                        field411[var3] = field411[var3 + 1];
                        field412[var3] = field412[var3 + 1];
                        field409[var3] = field409[var3 + 1];
                        field410[var3] = field410[var3 + 1];
                        field301[var3] = field301[var3 + 1];
                        field408[var3] = field408[var3 + 1];
                    }
                }
                field406--;
            }
        }
    }

    @ObfuscatedName("cl.bu(IB)Ljava/lang/String;")
    public static String method1841(int arg0) {
        return field412[arg0].length() > 0 ? field411[arg0] + class143.field2325 + field412[arg0] : field411[arg0];
    }

    @ObfuscatedName("bu.bj(Lav;IIII)V")
    public static final void method1367(class35 arg0, int arg1, int arg2, int arg3) {
        if (field406 >= 400) {
            return;
        }
        if (arg0.field817 != null) {
            arg0 = arg0.method622();
        }
        if (arg0 == null || !arg0.field820 || arg0.field815 && field432 != arg1) {
            return;
        }
        String var4 = arg0.field792;
        if (arg0.field809 != 0) {
            var4 = var4 + method155(arg0.field809, Statics.field1819.field52) + " " + class2.field25 + class143.field2319 + arg0.field809 + class2.field24;
        }
        if (field469 == 1) {
            method31(class143.field2240, field418 + " " + class2.field20 + " " + class2.method1382(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field419) {
            String[] var5 = arg0.field807;
            if (field323) {
                var5 = method2835(var5);
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
                        method31(var5[var6], class2.method1382(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class143.field2317)) {
                        short var9 = 0;
                        if (field362 == class18.field524 || field362 == class18.field523 && arg0.field809 > Statics.field1819.field52) {
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
                        method31(var5[var8], class2.method1382(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method31(class143.field2316, class2.method1382(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2823 & 0x2) == 2) {
            method31(field422, field515 + " " + class2.field20 + " " + class2.method1382(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("p.br(Lv;IIII)V")
    public static final void method115(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1819 == arg0 || field406 >= 400) {
            return;
        }
        String var4;
        if (arg0.field36 == 0) {
            var4 = arg0.field39 + method155(arg0.field52, Statics.field1819.field52) + " " + class2.field25 + class143.field2319 + arg0.field52 + class2.field24;
        } else {
            var4 = arg0.field39 + " " + class2.field25 + class143.field2219 + arg0.field36 + class2.field24;
        }
        if (field469 == 1) {
            method31(class143.field2240, field418 + " " + class2.field20 + " " + class2.method1382(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field419) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field393[var5] != null) {
                    short var6 = 0;
                    if (field393[var5].equalsIgnoreCase(class143.field2317)) {
                        if (field362 == class18.field524 || field362 == class18.field523 && arg0.field52 > Statics.field1819.field52) {
                            var6 = 2000;
                        }
                        if (Statics.field1819.field42 != 0 && arg0.field42 != 0) {
                            if (Statics.field1819.field42 == arg0.field42) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field394[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field392[var5] + var6;
                    method31(field393[var5], class2.method1382(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2823 & 0x8) == 8) {
            method31(field422, field515 + " " + class2.field20 + " " + class2.method1382(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field406; var9++) {
            if (field409[var9] == 23) {
                field412[var9] = class2.method1382(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("n.bg(III)Ljava/lang/String;")
    public static final String method155(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1382(16711680);
        } else if (var2 < -6) {
            return class2.method1382(16723968);
        } else if (var2 < -3) {
            return class2.method1382(16740352);
        } else if (var2 < 0) {
            return class2.method1382(16756736);
        } else if (var2 > 9) {
            return class2.method1382(65280);
        } else if (var2 > 6) {
            return class2.method1382(4259584);
        } else if (var2 > 3) {
            return class2.method1382(8453888);
        } else if (var2 > 0) {
            return class2.method1382(12648192);
        } else {
            return class2.method1382(16776960);
        }
    }

    @ObfuscatedName("cx.bz(Ljava/lang/String;Leb;B)Ljava/lang/String;")
    public static String method2043(String arg0, class153 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method128(method493(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1776 != null) {
                    var5 = Statics.method2599(Statics.field1776.field2087);
                    if (Statics.field1776.field2086 != null) {
                        var5 = (String) Statics.field1776.field2086;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bi.bo(II)Ljava/lang/String;")
    public static final String method1314(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1382(65408) + var1.substring(0, var1.length() - 8) + class143.field2348 + " " + class2.field25 + var1 + class2.field24 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + class2.method1382(16777215) + var1.substring(0, var1.length() - 4) + class143.field2328 + " " + class2.field25 + var1 + class2.field24 + class2.field27;
        } else {
            return " " + class2.method1382(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("ep.bh(Leb;IIIIIIB)V")
    public static final void method2639(class153 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field343) {
            field344 = 32;
        } else {
            field344 = 0;
        }
        field343 = false;
        if (class127.field2022 == 1 || !Statics.field2146 && class127.field2022 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2546 -= 4;
                method5(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2546 += 4;
                method5(arg0);
            } else if (arg5 >= arg1 - field344 && arg5 < field344 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2546 = (arg4 - arg3) * var8 / var9;
                method5(arg0);
                field343 = true;
            }
        }
        if (field461 == 0) {
            return;
        }
        int var10 = arg0.field2563;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2546 += field461 * 45;
            method5(arg0);
        }
    }

    @ObfuscatedName("j.bs(II)Ljava/lang/String;")
    public static final String method128(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("r.cb(Leb;I)Z")
    public static final boolean method119(class153 arg0) {
        if (arg0.field2647 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2647.length; var1++) {
            int var2 = method493(arg0, var1);
            int var3 = arg0.field2648[var1];
            if (arg0.field2647[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2647[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2647[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("a.cs(Leb;II)I")
    public static final int method493(class153 arg0, int arg1) {
        if (arg0.field2646 == null || arg1 >= arg0.field2646.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2646[arg1];
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
                    var7 = field401[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field402[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field492[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class153 var11 = class153.method117(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method2351(var12).field1024 || field458)) {
                        for (int var13 = 0; var13 < var11.field2617.length; var13++) {
                            if (var12 + 1 == var11.field2617[var13]) {
                                var7 += var11.field2587[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class155.field2680[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class141.field2150[field402[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class155.field2680[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1819.field52;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class141.field2148[var14]) {
                            var7 += field402[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class153 var17 = class153.method117(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method2351(var18).field1024 || field458)) {
                        for (int var19 = 0; var19 < var17.field2617.length; var19++) {
                            if (var18 + 1 == var17.field2617[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field429;
                }
                if (var6 == 12) {
                    var7 = field431;
                }
                if (var6 == 13) {
                    int var20 = class155.field2680[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class155.method2637(var22);
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
                    var7 = (Statics.field1819.field729 >> 7) + Statics.field256;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1819.field761 >> 7) + Statics.field879;
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

    @ObfuscatedName("v.cd(IIIIIIIB)V")
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class153.method469(arg0)) {
            method160(Statics.field2625[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("h.ce([Leb;IIIIIIIB)V")
    public static final void method160(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class153 var9 = arg0[var8];
            if (var9 != null && (!var9.field2612 || var9.field2552 == 0 || var9.field2654 || method2036(var9) != 0 || field437 == var9) && var9.field2561 == arg1 && (!var9.field2612 || !method2985(var9))) {
                int var10 = var9.field2555 + arg6;
                int var11 = var9.field2556 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2552 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2552 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2563 + var10;
                    int var19 = var9.field2560 + var11;
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
                    int var22 = var9.field2563 + var10;
                    int var23 = var9.field2560 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field436 == var9) {
                    field444 = true;
                    field445 = var10;
                    field263 = var11;
                }
                if (!var9.field2612 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2035;
                    int var25 = class127.field2029;
                    if (class127.field2034 != 0) {
                        var24 = class127.field2028;
                        var25 = class127.field2036;
                    }
                    if (var9.field2541 == 1337) {
                        method5(var9);
                        if (!field474 && !field305 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field469 == 0 && !field419) {
                                method31(class143.field2289, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class98.field1730; var27++) {
                                int var28 = class98.field1756[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field16.method1604(Statics.field235, var29, var30, var28) >= 0) {
                                        class36 var33 = class36.method2624(var32);
                                        if (var33.field870 != null) {
                                            var33 = var33.method651();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field469 == 1) {
                                            method31(class143.field2240, field418 + " " + class2.field20 + " " + class2.method1382(65535) + var33.field838, 1, var28, var29, var30);
                                        } else if (!field419) {
                                            String[] var34 = var33.field855;
                                            if (field323) {
                                                var34 = method2835(var34);
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
                                                        method31(var34[var35], class2.method1382(65535) + var33.field838, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method31(class143.field2316, class2.method1382(65535) + var33.field838, 1002, var33.field835 << 14, var29, var30);
                                        } else if ((Statics.field2823 & 0x4) == 4) {
                                            method31(field422, field515 + " " + class2.field20 + " " + class2.method1382(65535) + var33.field838, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class30 var37 = field300[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field686.field794 == 1 && (var37.field729 & 0x7F) == 64 && (var37.field761 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field403; var38++) {
                                                class30 var39 = field300[field302[var38]];
                                                if (var39 != null && var37 != var39 && var39.field686.field794 == 1 && var37.field729 == var39.field729 && var37.field761 == var39.field761) {
                                                    method1367(var39.field686, field302[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field405; var40++) {
                                                class3 var41 = field337[field384[var40]];
                                                if (var41 != null && var37.field729 == var41.field729 && var37.field761 == var41.field761) {
                                                    method115(var41, field384[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method1367(var37.field686, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field337[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field729 & 0x7F) == 64 && (var42.field761 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field403; var43++) {
                                                class30 var44 = field300[field302[var43]];
                                                if (var44 != null && var44.field686.field794 == 1 && var42.field729 == var44.field729 && var42.field761 == var44.field761) {
                                                    method1367(var44.field686, field302[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field405; var45++) {
                                                class3 var46 = field337[field384[var45]];
                                                if (var46 != null && var42 != var46 && var42.field729 == var46.field729 && var42.field761 == var46.field761) {
                                                    method115(var46, field384[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method115(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class178 var47 = field332[Statics.field235][var29][var30];
                                        if (var47 != null) {
                                            for (class25 var48 = (class25) var47.method3210(); var48 != null; var48 = (class25) var47.method3200()) {
                                                class45 var49 = class45.method2351(var48.field606);
                                                if (field469 == 1) {
                                                    method31(class143.field2240, field418 + " " + class2.field20 + " " + class2.method1382(16748608) + var49.field1011, 16, var48.field606, var29, var30);
                                                } else if (!field419) {
                                                    String[] var50 = var49.field1025;
                                                    if (field323) {
                                                        var50 = method2835(var50);
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
                                                            method31(var50[var51], class2.method1382(16748608) + var49.field1011, var52, var48.field606, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method31(class143.field2166, class2.method1382(16748608) + var49.field1011, 20, var48.field606, var29, var30);
                                                        }
                                                    }
                                                    method31(class143.field2316, class2.method1382(16748608) + var49.field1011, 1004, var48.field606, var29, var30);
                                                } else if ((Statics.field2823 & 0x1) == 1) {
                                                    method31(field422, field515 + " " + class2.field20 + " " + class2.method1382(16748608) + var49.field1011, 17, var48.field606, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2541 != 1338) {
                        if (!field305 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var64 = var24 - var10;
                            int var65 = var25 - var11;
                            if (var9.field2553 == 1) {
                                method31(var9.field2651, "", 24, 0, 0, var9.field2554);
                            }
                            if (var9.field2553 == 2 && !field419) {
                                String var66 = method1817(var9);
                                if (var66 != null) {
                                    method31(var66, class2.method1382(65280) + var9.field2613, 25, 0, -1, var9.field2554);
                                }
                            }
                            if (var9.field2553 == 3) {
                                method31(class143.field2322, "", 26, 0, 0, var9.field2554);
                            }
                            if (var9.field2553 == 4) {
                                method31(var9.field2651, "", 28, 0, 0, var9.field2554);
                            }
                            if (var9.field2553 == 5) {
                                method31(var9.field2651, "", 29, 0, 0, var9.field2554);
                            }
                            if (var9.field2553 == 6 && field463 == null) {
                                method31(var9.field2651, "", 30, 0, -1, var9.field2554);
                            }
                            if (var9.field2552 == 2) {
                                int var67 = 0;
                                for (int var68 = 0; var68 < var9.field2560; var68++) {
                                    for (int var69 = 0; var69 < var9.field2563; var69++) {
                                        int var70 = (var9.field2603 + 32) * var69;
                                        int var71 = (var9.field2604 + 32) * var68;
                                        if (var67 < 20) {
                                            var70 += var9.field2569[var67];
                                            var71 += var9.field2606[var67];
                                        }
                                        if (var64 >= var70 && var65 >= var71 && var64 < var70 + 32 && var65 < var71 + 32) {
                                            field378 = var67;
                                            Statics.field196 = var9;
                                            if (var9.field2617[var67] > 0) {
                                                label1259: {
                                                    class45 var72 = class45.method2351(var9.field2617[var67] - 1);
                                                    if (field469 == 1) {
                                                        int var73 = method2036(var9);
                                                        boolean var74 = (var73 >> 30 & 0x1) != 0;
                                                        if (var74) {
                                                            if (Statics.field204 != var9.field2554 || Statics.field1820 != var67) {
                                                                method31(class143.field2240, field418 + " " + class2.field20 + " " + class2.method1382(16748608) + var72.field1011, 31, var72.field1005, var67, var9.field2554);
                                                            }
                                                            break label1259;
                                                        }
                                                    }
                                                    if (field419) {
                                                        int var75 = method2036(var9);
                                                        boolean var76 = (var75 >> 30 & 0x1) != 0;
                                                        if (var76) {
                                                            if ((Statics.field2823 & 0x10) == 16) {
                                                                method31(field422, field515 + " " + class2.field20 + " " + class2.method1382(16748608) + var72.field1011, 32, var72.field1005, var67, var9.field2554);
                                                            }
                                                            break label1259;
                                                        }
                                                    }
                                                    String[] var77 = var72.field1034;
                                                    if (field323) {
                                                        var77 = method2835(var77);
                                                    }
                                                    int var78 = method2036(var9);
                                                    boolean var79 = (var78 >> 30 & 0x1) != 0;
                                                    if (var79) {
                                                        for (int var80 = 4; var80 >= 3; var80--) {
                                                            if (var77 != null && var77[var80] != null) {
                                                                byte var81;
                                                                if (var80 == 3) {
                                                                    var81 = 36;
                                                                } else {
                                                                    var81 = 37;
                                                                }
                                                                method31(var77[var80], class2.method1382(16748608) + var72.field1011, var81, var72.field1005, var67, var9.field2554);
                                                            } else if (var80 == 4) {
                                                                method31(class143.field2299, class2.method1382(16748608) + var72.field1011, 37, var72.field1005, var67, var9.field2554);
                                                            }
                                                        }
                                                    }
                                                    class157 var10000 = (class157) null;
                                                    if (class157.method4(method2036(var9))) {
                                                        method31(class143.field2240, class2.method1382(16748608) + var72.field1011, 38, var72.field1005, var67, var9.field2554);
                                                    }
                                                    int var82 = method2036(var9);
                                                    boolean var83 = (var82 >> 30 & 0x1) != 0;
                                                    if (var83 && var77 != null) {
                                                        for (int var84 = 2; var84 >= 0; var84--) {
                                                            if (var77[var84] != null) {
                                                                byte var85 = 0;
                                                                if (var84 == 0) {
                                                                    var85 = 33;
                                                                }
                                                                if (var84 == 1) {
                                                                    var85 = 34;
                                                                }
                                                                if (var84 == 2) {
                                                                    var85 = 35;
                                                                }
                                                                method31(var77[var84], class2.method1382(16748608) + var72.field1011, var85, var72.field1005, var67, var9.field2554);
                                                            }
                                                        }
                                                    }
                                                    String[] var86 = var9.field2649;
                                                    if (field323) {
                                                        var86 = method2835(var86);
                                                    }
                                                    if (var86 != null) {
                                                        for (int var87 = 4; var87 >= 0; var87--) {
                                                            if (var86[var87] != null) {
                                                                byte var88 = 0;
                                                                if (var87 == 0) {
                                                                    var88 = 39;
                                                                }
                                                                if (var87 == 1) {
                                                                    var88 = 40;
                                                                }
                                                                if (var87 == 2) {
                                                                    var88 = 41;
                                                                }
                                                                if (var87 == 3) {
                                                                    var88 = 42;
                                                                }
                                                                if (var87 == 4) {
                                                                    var88 = 43;
                                                                }
                                                                method31(var86[var87], class2.method1382(16748608) + var72.field1011, var88, var72.field1005, var67, var9.field2554);
                                                            }
                                                        }
                                                    }
                                                    method31(class143.field2316, class2.method1382(16748608) + var72.field1011, 1005, var72.field1005, var67, var9.field2554);
                                                }
                                            }
                                        }
                                        var67++;
                                    }
                                }
                            }
                            if (var9.field2612) {
                                if (!field419) {
                                    for (int var89 = 9; var89 >= 5; var89--) {
                                        String var90;
                                        if (!class157.method2631(method2036(var9), var89) && var9.field2660 == null) {
                                            var90 = null;
                                        } else if (var9.field2611 == null || var9.field2611.length <= var89 || var9.field2611[var89] == null || var9.field2611[var89].trim().length() == 0) {
                                            var90 = null;
                                        } else {
                                            var90 = var9.field2611[var89];
                                        }
                                        if (var90 != null) {
                                            method31(var90, var9.field2621, 1007, var89 + 1, var9.field2551, var9.field2554);
                                        }
                                    }
                                    String var92 = method1817(var9);
                                    if (var92 != null) {
                                        method31(var92, var9.field2621, 25, 0, var9.field2551, var9.field2554);
                                    }
                                    for (int var93 = 4; var93 >= 0; var93--) {
                                        String var94;
                                        if (!class157.method2631(method2036(var9), var93) && var9.field2660 == null) {
                                            var94 = null;
                                        } else if (var9.field2611 == null || var9.field2611.length <= var93 || var9.field2611[var93] == null || var9.field2611[var93].trim().length() == 0) {
                                            var94 = null;
                                        } else {
                                            var94 = var9.field2611[var93];
                                        }
                                        if (var94 != null) {
                                            method31(var94, var9.field2621, 57, var93 + 1, var9.field2551, var9.field2554);
                                        }
                                    }
                                    if (class157.method751(method2036(var9))) {
                                        method31(class143.field2171, "", 30, 0, var9.field2551, var9.field2554);
                                    }
                                } else if (class157.method1844(method2036(var9)) && (Statics.field2823 & 0x20) == 32) {
                                    method31(field422, field515 + " " + class2.field20 + " " + var9.field2621, 58, 0, var9.field2551, var9.field2554);
                                }
                            }
                        }
                        if (var9.field2552 == 0) {
                            if (!var9.field2612 && method2985(var9) && Statics.field637 != var9) {
                                continue;
                            }
                            method160(arg0, var9.field2554, var12, var13, var14, var15, var10 - var9.field2596, var11 - var9.field2546);
                            if (var9.field2658 != null) {
                                method160(var9.field2658, var9.field2554, var12, var13, var14, var15, var10 - var9.field2596, var11 - var9.field2546);
                            }
                            class4 var96 = (class4) field385.method3155((long) var9.field2554);
                            if (var96 != null) {
                                if (var96.field54 == 0 && class127.field2035 >= var12 && class127.field2029 >= var13 && class127.field2035 < var14 && class127.field2029 < var15 && !field305 && !field425) {
                                    field411[0] = class143.field2401;
                                    field412[0] = "";
                                    field409[0] = 1006;
                                    field406 = 1;
                                }
                                method24(var96.field60, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2612) {
                            if (var9.field2667 && class127.field2035 >= var12 && class127.field2029 >= var13 && class127.field2035 < var14 && class127.field2029 < var15) {
                                for (class1 var97 = (class1) field462.method3189(); var97 != null; var97 = (class1) field462.method3182()) {
                                    if (var97.field2) {
                                        var97.method3285();
                                        var97.field3.field2659 = false;
                                    }
                                }
                                if (Statics.field621 == 0) {
                                    field436 = null;
                                    field437 = null;
                                }
                                if (!field305) {
                                    field411[0] = class143.field2401;
                                    field412[0] = "";
                                    field409[0] = 1006;
                                    field406 = 1;
                                }
                            }
                            boolean var98;
                            if (class127.field2035 >= var12 && class127.field2029 >= var13 && class127.field2035 < var14 && class127.field2029 < var15) {
                                var98 = true;
                            } else {
                                var98 = false;
                            }
                            boolean var99 = false;
                            if ((class127.field2022 == 1 || !Statics.field2146 && class127.field2022 == 4) && var98) {
                                var99 = true;
                            }
                            boolean var100 = false;
                            if ((class127.field2034 == 1 || !Statics.field2146 && class127.field2034 == 4) && class127.field2028 >= var12 && class127.field2036 >= var13 && class127.field2028 < var14 && class127.field2036 < var15) {
                                var100 = true;
                            }
                            if (var100) {
                                method2648(var9, class127.field2028 - var10, class127.field2036 - var11);
                            }
                            if (field436 != null && field436 != var9 && var98 && class157.method2632(method2036(var9))) {
                                field453 = var9;
                            }
                            if (field437 == var9) {
                                field441 = true;
                                field442 = var10;
                                field259 = var11;
                            }
                            if (var9.field2654) {
                                if (var98 && field461 != 0 && var9.field2638 != null) {
                                    class1 var101 = new class1();
                                    var101.field2 = true;
                                    var101.field3 = var9;
                                    var101.field5 = field461;
                                    var101.field8 = var9.field2638;
                                    field462.method3184(var101);
                                }
                                if (field436 != null || Statics.field1890 != null || field305) {
                                    var100 = false;
                                    var99 = false;
                                    var98 = false;
                                }
                                if (!var9.field2578 && var100) {
                                    var9.field2578 = true;
                                    if (var9.field2653 != null) {
                                        class1 var102 = new class1();
                                        var102.field2 = true;
                                        var102.field3 = var9;
                                        var102.field10 = class127.field2028 - var10;
                                        var102.field5 = class127.field2036 - var11;
                                        var102.field8 = var9.field2653;
                                        field462.method3184(var102);
                                    }
                                }
                                if (var9.field2578 && var99 && var9.field2620 != null) {
                                    class1 var103 = new class1();
                                    var103.field2 = true;
                                    var103.field3 = var9;
                                    var103.field10 = class127.field2035 - var10;
                                    var103.field5 = class127.field2029 - var11;
                                    var103.field8 = var9.field2620;
                                    field462.method3184(var103);
                                }
                                if (var9.field2578 && !var99) {
                                    var9.field2578 = false;
                                    if (var9.field2664 != null) {
                                        class1 var104 = new class1();
                                        var104.field2 = true;
                                        var104.field3 = var9;
                                        var104.field10 = class127.field2035 - var10;
                                        var104.field5 = class127.field2029 - var11;
                                        var104.field8 = var9.field2664;
                                        field464.method3184(var104);
                                    }
                                }
                                if (var99 && var9.field2622 != null) {
                                    class1 var105 = new class1();
                                    var105.field2 = true;
                                    var105.field3 = var9;
                                    var105.field10 = class127.field2035 - var10;
                                    var105.field5 = class127.field2029 - var11;
                                    var105.field8 = var9.field2622;
                                    field462.method3184(var105);
                                }
                                if (!var9.field2659 && var98) {
                                    var9.field2659 = true;
                                    if (var9.field2623 != null) {
                                        class1 var106 = new class1();
                                        var106.field2 = true;
                                        var106.field3 = var9;
                                        var106.field10 = class127.field2035 - var10;
                                        var106.field5 = class127.field2029 - var11;
                                        var106.field8 = var9.field2623;
                                        field462.method3184(var106);
                                    }
                                }
                                if (var9.field2659 && var98 && var9.field2624 != null) {
                                    class1 var107 = new class1();
                                    var107.field2 = true;
                                    var107.field3 = var9;
                                    var107.field10 = class127.field2035 - var10;
                                    var107.field5 = class127.field2029 - var11;
                                    var107.field8 = var9.field2624;
                                    field462.method3184(var107);
                                }
                                if (var9.field2659 && !var98) {
                                    var9.field2659 = false;
                                    if (var9.field2637 != null) {
                                        class1 var108 = new class1();
                                        var108.field2 = true;
                                        var108.field3 = var9;
                                        var108.field10 = class127.field2035 - var10;
                                        var108.field5 = class127.field2029 - var11;
                                        var108.field8 = var9.field2637;
                                        field464.method3184(var108);
                                    }
                                }
                                if (var9.field2636 != null) {
                                    class1 var109 = new class1();
                                    var109.field3 = var9;
                                    var109.field8 = var9.field2636;
                                    field488.method3184(var109);
                                }
                                if (var9.field2630 != null && field450 > var9.field2650) {
                                    if (var9.field2631 == null || field450 - var9.field2650 > 32) {
                                        class1 var114 = new class1();
                                        var114.field3 = var9;
                                        var114.field8 = var9.field2630;
                                        field462.method3184(var114);
                                    } else {
                                        label949: for (int var110 = var9.field2650; var110 < field450; var110++) {
                                            int var111 = field449[var110 & 0x1F];
                                            for (int var112 = 0; var112 < var9.field2631.length; var112++) {
                                                if (var9.field2631[var112] == var111) {
                                                    class1 var113 = new class1();
                                                    var113.field3 = var9;
                                                    var113.field8 = var9.field2630;
                                                    field462.method3184(var113);
                                                    break label949;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2650 = field450;
                                }
                                if (var9.field2584 != null && field318 > var9.field2663) {
                                    if (var9.field2633 == null || field318 - var9.field2663 > 32) {
                                        class1 var119 = new class1();
                                        var119.field3 = var9;
                                        var119.field8 = var9.field2584;
                                        field462.method3184(var119);
                                    } else {
                                        label925: for (int var115 = var9.field2663; var115 < field318; var115++) {
                                            int var116 = field274[var115 & 0x1F];
                                            for (int var117 = 0; var117 < var9.field2633.length; var117++) {
                                                if (var9.field2633[var117] == var116) {
                                                    class1 var118 = new class1();
                                                    var118.field3 = var9;
                                                    var118.field8 = var9.field2584;
                                                    field462.method3184(var118);
                                                    break label925;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2663 = field318;
                                }
                                if (var9.field2634 != null && field454 > var9.field2619) {
                                    if (var9.field2635 == null || field454 - var9.field2619 > 32) {
                                        class1 var124 = new class1();
                                        var124.field3 = var9;
                                        var124.field8 = var9.field2634;
                                        field462.method3184(var124);
                                    } else {
                                        label901: for (int var120 = var9.field2619; var120 < field454; var120++) {
                                            int var121 = field490[var120 & 0x1F];
                                            for (int var122 = 0; var122 < var9.field2635.length; var122++) {
                                                if (var9.field2635[var122] == var121) {
                                                    class1 var123 = new class1();
                                                    var123.field3 = var9;
                                                    var123.field8 = var9.field2634;
                                                    field462.method3184(var123);
                                                    break label901;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2619 = field454;
                                }
                                if (field503 > var9.field2616 && var9.field2580 != null) {
                                    class1 var125 = new class1();
                                    var125.field3 = var9;
                                    var125.field8 = var9.field2580;
                                    field462.method3184(var125);
                                }
                                if (field456 > var9.field2616 && var9.field2641 != null) {
                                    class1 var126 = new class1();
                                    var126.field3 = var9;
                                    var126.field8 = var9.field2641;
                                    field462.method3184(var126);
                                }
                                if (field440 > var9.field2616 && var9.field2642 != null) {
                                    class1 var127 = new class1();
                                    var127.field3 = var9;
                                    var127.field8 = var9.field2642;
                                    field462.method3184(var127);
                                }
                                if (field326 > var9.field2616 && var9.field2643 != null) {
                                    class1 var128 = new class1();
                                    var128.field3 = var9;
                                    var128.field8 = var9.field2643;
                                    field462.method3184(var128);
                                }
                                var9.field2616 = field448;
                                if (var9.field2640 != null) {
                                    for (int var129 = 0; var129 < field278; var129++) {
                                        class1 var130 = new class1();
                                        var130.field3 = var9;
                                        var130.field1 = field483[var129];
                                        var130.field9 = field482[var129];
                                        var130.field8 = var9.field2640;
                                        field462.method3184(var130);
                                    }
                                }
                            }
                        }
                        if (!var9.field2612 && field436 == null && Statics.field1890 == null && !field305) {
                            if ((var9.field2558 >= 0 || var9.field2550 != 0) && class127.field2035 >= var12 && class127.field2029 >= var13 && class127.field2035 < var14 && class127.field2029 < var15) {
                                if (var9.field2558 >= 0) {
                                    Statics.field637 = arg0[var9.field2558];
                                } else {
                                    Statics.field637 = var9;
                                }
                            }
                            if (var9.field2552 == 8 && class127.field2035 >= var12 && class127.field2029 >= var13 && class127.field2035 < var14 && class127.field2029 < var15) {
                                Statics.field554 = var9;
                            }
                            if (var9.field2639 > var9.field2560) {
                                method2639(var9, var9.field2563 + var10, var11, var9.field2560, var9.field2639, class127.field2035, class127.field2029);
                            }
                        }
                    } else if ((field494 == 0 || field494 == 3) && (class127.field2034 == 1 || !Statics.field2146 && class127.field2034 == 4)) {
                        int var53 = class127.field2028 - 25 - var10;
                        int var54 = class127.field2036 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field347 + field333 & 0x7FF;
                            int var56 = class84.field1490[var55];
                            int var57 = class84.field1491[var55];
                            int var58 = (field335 + 256) * var56 >> 8;
                            int var59 = (field335 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field1819.field729 + var60 >> 7;
                            int var63 = Statics.field1819.field761 - var61 >> 7;
                            field304.method2306(86);
                            field304.method2079(18);
                            field304.method2122(Statics.field256 + var62);
                            field304.method2113(class124.field1994[82] ? (class124.field1994[81] ? 2 : 1) : 0);
                            field304.method2121(Statics.field879 + var63);
                            field304.method2079(var53);
                            field304.method2079(var54);
                            field304.method2177(field347);
                            field304.method2079(57);
                            field304.method2079(field333);
                            field304.method2079(field335);
                            field304.method2079(89);
                            field304.method2177(Statics.field1819.field729);
                            field304.method2177(Statics.field1819.field761);
                            field304.method2079(63);
                            field364 = var62;
                            field493 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.co([Leb;II)V")
    public static final void method2603(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2552 == 0) {
                    if (var3.field2658 != null) {
                        method2603(var3.field2658, arg1);
                    }
                    class4 var4 = (class4) field385.method3155((long) var3.field2554);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class153.method469(var5)) {
                            method2603(Statics.field2625[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2644 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field8 = var3.field2644;
                    class32.method1819(var6);
                }
                if (arg1 == 1 && var3.field2645 != null) {
                    if (var3.field2551 >= 0) {
                        class153 var7 = class153.method117(var3.field2554);
                        if (var7 == null || var7.field2658 == null || var3.field2551 >= var7.field2658.length || var7.field2658[var3.field2551] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field8 = var3.field2645;
                    class32.method1819(var8);
                }
            }
        }
    }

    @ObfuscatedName("el.cf(Leb;III)V")
    public static final void method2648(class153 arg0, int arg1, int arg2) {
        if (field436 != null || field305 || arg0 == null) {
            return;
        }
        class153 var3 = method2654(arg0);
        if (var3 == null) {
            var3 = arg0.field2577;
        }
        if (var3 == null) {
            return;
        }
        field436 = arg0;
        class153 var5 = method2654(arg0);
        if (var5 == null) {
            var5 = arg0.field2577;
        }
        field437 = var5;
        field438 = arg1;
        field498 = arg2;
        Statics.field621 = 0;
        field447 = false;
        if (field406 > 0) {
            method2503(field406 - 1);
        }
        return;
    }

    @ObfuscatedName("dn.cm(IS)V")
    public static void method2503(int arg0) {
        Statics.field188 = new class27();
        Statics.field188.field638 = field301[arg0];
        Statics.field188.field627 = field408[arg0];
        Statics.field188.field629 = field409[arg0];
        Statics.field188.field630 = field410[arg0];
        Statics.field188.field634 = field411[arg0];
    }

    @ObfuscatedName("cq.cj(III)V")
    public static void method1934(int arg0, int arg1) {
        class27 var2 = Statics.field188;
        method2775(var2.field638, var2.field627, var2.field629, var2.field630, var2.field634, var2.field634, arg0, arg1);
        Statics.field188 = null;
    }

    @ObfuscatedName("s.cu(Leb;B)V")
    public static void method5(class153 arg0) {
        if (field467 == arg0.field2666) {
            field468[arg0.field2665] = true;
        }
    }

    @ObfuscatedName("cw.ci(B)V")
    public static void method1836() {
        for (class4 var0 = (class4) field385.method3154(); var0 != null; var0 = (class4) field385.method3163()) {
            int var1 = var0.field60;
            if (class153.method469(var1)) {
                boolean var2 = true;
                class153[] var3 = Statics.field2625[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2612;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2884;
                    class153 var6 = class153.method117(var5);
                    if (var6 != null) {
                        method5(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.cw([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2835(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("c.cr(II)V")
    public static final void method136(int arg0) {
        if (!class153.method469(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2625[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3 != null) {
                var3.field2656 = 0;
                var3.field2657 = 0;
            }
        }
    }

    @ObfuscatedName("g.cl([Leb;IS)V")
    public static final void method3(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null && var3.field2561 == arg1 && (!var3.field2612 || !method2985(var3))) {
                if (var3.field2552 == 0) {
                    if (!var3.field2612 && method2985(var3) && Statics.field637 != var3) {
                        continue;
                    }
                    method3(arg0, var3.field2554);
                    if (var3.field2658 != null) {
                        method3(var3.field2658, var3.field2554);
                    }
                    class4 var4 = (class4) field385.method3155((long) var3.field2554);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class153.method469(var5)) {
                            method3(Statics.field2625[var5], -1);
                        }
                    }
                }
                if (var3.field2552 == 6) {
                    if (var3.field2608 != -1 || var3.field2586 != -1) {
                        boolean var6 = method119(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2586;
                        } else {
                            var7 = var3.field2608;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method1935(var7);
                            var3.field2657 += field338;
                            while (var3.field2657 > var8.field894[var3.field2656]) {
                                var3.field2657 -= var8.field894[var3.field2656];
                                var3.field2656++;
                                if (var3.field2656 >= var8.field898.length) {
                                    var3.field2656 -= var8.field914;
                                    if (var3.field2656 < 0 || var3.field2656 >= var8.field898.length) {
                                        var3.field2656 = 0;
                                    }
                                }
                                method5(var3);
                            }
                        }
                    }
                    if (var3.field2594 != 0 && !var3.field2612) {
                        int var9 = var3.field2594 >> 16;
                        int var10 = var3.field2594 << 16 >> 16;
                        int var11 = field338 * var9;
                        int var12 = field338 * var10;
                        var3.field2590 = var3.field2590 + var11 & 0x7FF;
                        var3.field2591 = var3.field2591 + var12 & 0x7FF;
                        method5(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.cy(IS)V")
    public static final void method523(int arg0) {
        method1836();
        class20.method611();
        class46 var1 = (class46) class46.field1056.method3112((long) arg0);
        class46 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1057.method2703(16, arg0);
            class46 var4 = new class46();
            if (var3 != null) {
                var4.method882(new class107(var3));
            }
            class46.field1056.method3115(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1060;
        if (var5 == 0) {
            return;
        }
        int var6 = class155.field2680[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class84.method1776(0.9D);
                ((class88) Statics.field1487).method1822(0.9D);
            }
            if (var6 == 2) {
                class84.method1776(0.8D);
                ((class88) Statics.field1487).method1822(0.8D);
            }
            if (var6 == 3) {
                class84.method1776(0.7D);
                ((class88) Statics.field1487).method1822(0.7D);
            }
            if (var6 == 4) {
                class84.method1776(0.6D);
                ((class88) Statics.field1487).method1822(0.6D);
            }
            class45.field1013.method3116();
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
            if (field495 != var7) {
                if (field495 == 0 && field451 != -1) {
                    class162.method1821(Statics.field558, field451, 0, var7, false);
                    field497 = false;
                } else if (var7 == 0) {
                    class162.method2843();
                    field497 = false;
                } else {
                    class162.method2028(var7);
                }
                field495 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field434 = 127;
            }
            if (var6 == 1) {
                field434 = 96;
            }
            if (var6 == 2) {
                field434 = 64;
            }
            if (var6 == 3) {
                field434 = 32;
            }
            if (var6 == 4) {
                field434 = 0;
            }
        }
        if (var5 == 5) {
            field404 = var6;
        }
        if (var5 == 6) {
            field426 = var6;
        }
        if (var5 == 9) {
            field427 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field499 = 127;
            }
            if (var6 == 1) {
                field499 = 96;
            }
            if (var6 == 2) {
                field499 = 64;
            }
            if (var6 == 3) {
                field499 = 32;
            }
            if (var6 == 4) {
                field499 = 0;
            }
        }
        if (var5 == 17) {
            field432 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field362 = (class18) class99.method1567(class18.method572(), var6);
            if (field362 == null) {
                field362 = class18.field523;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field396 = -1;
        } else {
            field396 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("w.cn(I)V")
    public static final void method457() {
        field304.method2306(192);
        for (class4 var0 = (class4) field385.method3154(); var0 != null; var0 = (class4) field385.method3163()) {
            if (var0.field54 == 0 || var0.field54 == 3) {
                method2772(var0, true);
            }
        }
        if (field463 != null) {
            method5(field463);
            field463 = null;
        }
    }

    @ObfuscatedName("ab.cq(IIII)Lo;")
    public static final class4 method522(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field60 = arg1;
        var3.field54 = arg2;
        field385.method3152(var3, (long) arg0);
        method136(arg1);
        class32.method125(arg1);
        class153 var4 = class153.method117(arg0);
        if (var4 != null) {
            method5(var4);
        }
        if (field463 != null) {
            method5(field463);
            field463 = null;
        }
        method137();
        if (field424 != -1) {
            int var5 = field424;
            if (class153.method469(var5)) {
                method2603(Statics.field2625[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ej.cc(Lo;ZI)V")
    public static final void method2772(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2884;
        arg0.method3285();
        if (arg1 && var2 != -1 && Statics.field2549[var2]) {
            Statics.field2542.method2671(var2);
            if (Statics.field2625[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2625[var2].length; var5++) {
                    if (Statics.field2625[var2][var5] != null) {
                        if (Statics.field2625[var2][var5].field2552 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2625[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2625[var2] = null;
                }
                Statics.field2549[var2] = false;
            }
        }
        for (class180 var6 = (class180) field465.method3154(); var6 != null; var6 = (class180) field465.method3163()) {
            if ((var6.field2884 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3285();
            }
        }
        class153 var7 = class153.method117(var3);
        if (var7 != null) {
            method5(var7);
        }
        for (int var8 = 0; var8 < field406; var8++) {
            int var9 = field409[var8];
            boolean var10 = var9 == 57 || var9 == 58 || var9 == 1007 || var9 == 25 || var9 == 30;
            if (var10) {
                if (var8 < field406 - 1) {
                    for (int var11 = var8; var11 < field406 - 1; var11++) {
                        field411[var11] = field411[var11 + 1];
                        field412[var11] = field412[var11 + 1];
                        field409[var11] = field409[var11 + 1];
                        field410[var11] = field410[var11 + 1];
                        field301[var11] = field301[var11 + 1];
                        field408[var11] = field408[var11 + 1];
                    }
                }
                field406--;
            }
        }
        if (field424 != -1) {
            int var12 = field424;
            if (class153.method469(var12)) {
                method2603(Statics.field2625[var12], 1);
            }
        }
    }

    @ObfuscatedName("client.ca(Leb;I)Z")
    public static final boolean method445(class153 arg0) {
        int var1 = arg0.field2541;
        if (var1 == 205) {
            field311 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field518.method2869(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field518.method2873(var4, var5 == 1);
        }
        if (var1 == 324) {
            field518.method2871(false);
        }
        if (var1 == 325) {
            field518.method2871(true);
        }
        if (var1 == 326) {
            field304.method2306(75);
            field518.method2874(field304);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ez.ch(IIIILbr;I)V")
    public static final void method2621(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method132(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field347 + field333 & 0x7FF;
        int var7 = class84.field1490[var6];
        int var8 = class84.field1491[var6];
        int var9 = var7 * 256 / (field335 + 256);
        int var10 = var8 * 256 / (field335 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2424.method1416(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("j.cg(IIIILbr;I)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field347 + field333 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1490[var5];
        int var8 = class84.field1491[var5];
        int var9 = var7 * 256 / (field335 + 256);
        int var10 = var8 * 256 / (field335 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1409(Statics.field997, arg0 + 94 + var11 - arg4.field1310 / 2 + 4, arg1 + 83 - var12 - arg4.field1311 / 2 - 4);
        } else {
            arg4.method1385(arg0 + 94 + var11 - arg4.field1310 / 2 + 4, arg1 + 83 - var12 - arg4.field1311 / 2 - 4);
        }
    }

    @ObfuscatedName("co.ck(Ljava/lang/String;ZB)Z")
    public static boolean method1738(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class201.method2039(arg0, Statics.field70);
        for (int var3 = 0; var3 < field511; var3++) {
            if (var2.equalsIgnoreCase(class201.method2039(field514[var3].field236, Statics.field70)) && (!arg1 || field514[var3].field229 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class201.method2039(Statics.field1819.field39, Statics.field70))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cj.ct(Ljava/lang/String;I)Z")
    public static boolean method1812(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class201.method2039(arg0, Statics.field70);
        for (int var2 = 0; var2 < field516; var2++) {
            class8 var3 = field517[var2];
            if (var1.equalsIgnoreCase(class201.method2039(var3.field133, Statics.field70))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class201.method2039(var3.field132, Statics.field70))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("i.cv(Ljava/lang/String;I)V")
    public static final void method68(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field511 < 200 || field389 == 1) || field511 >= 400) {
            class10.method1845(30, "", class143.field2324);
            return;
        }
        String var1 = class201.method2039(arg0, Statics.field70);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field511; var2++) {
            class16 var3 = field514[var2];
            String var4 = class201.method2039(var3.field236, Statics.field70);
            if (var4 != null && var4.equals(var1)) {
                class10.method1845(30, "", arg0 + class143.field2332);
                return;
            }
            if (var3.field238 != null) {
                String var5 = class201.method2039(var3.field238, Statics.field70);
                if (var5 != null && var5.equals(var1)) {
                    class10.method1845(30, "", arg0 + class143.field2332);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field516; var6++) {
            class8 var7 = field517[var6];
            String var8 = class201.method2039(var7.field133, Statics.field70);
            if (var8 != null && var8.equals(var1)) {
                class10.method1845(30, "", class143.field2228 + arg0 + class143.field2288);
                return;
            }
            if (var7.field132 != null) {
                String var9 = class201.method2039(var7.field132, Statics.field70);
                if (var9 != null && var9.equals(var1)) {
                    class10.method1845(30, "", class143.field2228 + arg0 + class143.field2288);
                    return;
                }
            }
        }
        if (class201.method2039(Statics.field1819.field39, Statics.field70).equals(var1)) {
            class10.method1845(30, "", class143.field2335);
        } else {
            field304.method2306(179);
            field304.method2079(class107.method492(arg0));
            field304.method2256(arg0);
        }
    }

    @ObfuscatedName("gh.cp(Ljava/lang/String;II)V")
    public static final void method3545(String arg0, int arg1) {
        field304.method2306(159);
        field304.method2079(class107.method492(arg0) + 1);
        field304.method2081(arg1);
        field304.method2256(arg0);
    }

    @ObfuscatedName("fd.cz(Ljava/lang/String;S)V")
    public static final void method3104(String arg0) {
        if (!arg0.equals("")) {
            field304.method2306(80);
            field304.method2079(class107.method492(arg0));
            field304.method2256(arg0);
        }
    }

    @ObfuscatedName("q.cx(I)V")
    public static final void method141() {
        field304.method2306(80);
        field304.method2079(0);
    }

    @ObfuscatedName("cp.dr(Leb;B)I")
    public static int method2036(class153 arg0) {
        class180 var1 = (class180) field465.method3155(((long) arg0.field2554 << 32) + (long) arg0.field2551);
        return var1 == null ? arg0.field2609 : var1.field2869;
    }

    @ObfuscatedName("el.dc(Leb;I)Leb;")
    public static class153 method2654(class153 arg0) {
        int var1 = method2036(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class153.method117(arg0.field2561);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fa.de(Leb;I)Z")
    public static boolean method2985(class153 arg0) {
        if (field425) {
            if (method2036(arg0) != 0) {
                return false;
            }
            if (arg0.field2552 == 0) {
                return false;
            }
        }
        return arg0.field2562;
    }

    @ObfuscatedName("cu.dv(Leb;S)Ljava/lang/String;")
    public static String method1817(class153 arg0) {
        int var1 = method2036(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2626 == null || arg0.field2626.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2626;
        }
    }

    @ObfuscatedName("w.dw(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method463(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field264 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field264 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field264 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field264 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field264 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field268 + "/";
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class133 {

    @ObfuscatedName("client.j")
    public static boolean field263 = true;

    @ObfuscatedName("client.w")
    public static class209[] field329 = new class209[4];

    @ObfuscatedName("client.c")
    public static int field480 = 1;

    @ObfuscatedName("client.f")
    public static int field461 = 0;

    @ObfuscatedName("client.n")
    public static int field430 = 0;

    @ObfuscatedName("client.o")
    public static boolean field437 = false;

    @ObfuscatedName("client.b")
    public static boolean field242 = false;

    @ObfuscatedName("client.r")
    public static int field497 = 0;

    @ObfuscatedName("client.u")
    public static int field483 = 0;

    @ObfuscatedName("client.s")
    public static boolean field245 = true;

    @ObfuscatedName("client.i")
    public static int field246 = 0;

    @ObfuscatedName("client.e")
    public static long field247 = 1L;

    @ObfuscatedName("client.k")
    public static int field448 = -1;

    @ObfuscatedName("client.v")
    public static int field249 = -1;

    @ObfuscatedName("client.m")
    public static int field250 = -1;

    @ObfuscatedName("client.d")
    public static boolean field284 = true;

    @ObfuscatedName("client.q")
    public static boolean field252 = false;

    @ObfuscatedName("client.ak")
    public static int field253 = 0;

    @ObfuscatedName("client.ah")
    public static int field254 = 0;

    @ObfuscatedName("client.an")
    public static int field255 = 0;

    @ObfuscatedName("client.aw")
    public static int field432 = 0;

    @ObfuscatedName("client.az")
    public static int field257 = 0;

    @ObfuscatedName("client.ad")
    public static int field258 = 0;

    @ObfuscatedName("client.ag")
    public static int field259 = 0;

    @ObfuscatedName("client.aa")
    public static int field260 = 0;

    @ObfuscatedName("client.au")
    public static int field322 = 0;

    @ObfuscatedName("client.aq")
    public static class108 field262 = new class108(new byte[5000]);

    @ObfuscatedName("client.af")
    public static class18 field291 = class18.field510;

    @ObfuscatedName("client.ao")
    public static int field264 = 0;

    @ObfuscatedName("client.ae")
    public static int field265 = 0;

    @ObfuscatedName("client.ai")
    public static int field381 = 0;

    @ObfuscatedName("client.bt")
    public static int field267 = 0;

    @ObfuscatedName("client.bo")
    public static int field248 = 0;

    @ObfuscatedName("client.bg")
    public static int field402 = 0;

    @ObfuscatedName("client.bi")
    public static int field374 = 0;

    @ObfuscatedName("client.bx")
    public static int field271 = 0;

    @ObfuscatedName("client.br")
    public static class31[] field273 = new class31[32768];

    @ObfuscatedName("client.by")
    public static int field274 = 0;

    @ObfuscatedName("client.bz")
    public static int[] field423 = new int[32768];

    @ObfuscatedName("client.ci")
    public static class111 field261 = new class111(5000);

    @ObfuscatedName("client.cp")
    public static class111 field383 = new class111(5000);

    @ObfuscatedName("client.cs")
    public static class111 field278 = new class111(5000);

    @ObfuscatedName("client.cu")
    public static int field279 = 0;

    @ObfuscatedName("client.cy")
    public static int field410 = 0;

    @ObfuscatedName("client.cv")
    public static int field281 = 0;

    @ObfuscatedName("client.cf")
    public static int field340 = 0;

    @ObfuscatedName("client.cn")
    public static int field283 = 0;

    @ObfuscatedName("client.ch")
    public static int field301 = 0;

    @ObfuscatedName("client.ce")
    public static int field285 = 0;

    @ObfuscatedName("client.ct")
    public static int field286 = 0;

    @ObfuscatedName("client.co")
    public static boolean field287 = false;

    @ObfuscatedName("client.cl")
    public static int field289 = 0;

    @ObfuscatedName("client.cj")
    public static int field470 = 0;

    @ObfuscatedName("client.dv")
    public static int field397 = 1;

    @ObfuscatedName("client.dz")
    public static int field282 = 0;

    @ObfuscatedName("client.dy")
    public static int field293 = 1;

    @ObfuscatedName("client.dk")
    public static int field268 = 0;

    @ObfuscatedName("client.de")
    public static boolean field296 = false;

    @ObfuscatedName("client.dp")
    public static int[][][] field297 = new int[4][13][13];

    @ObfuscatedName("client.dr")
    public static final int[] field298 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dq")
    public static int field299 = 0;

    @ObfuscatedName("client.dt")
    public static int field300 = 2;

    @ObfuscatedName("client.dc")
    public static int field494 = 0;

    @ObfuscatedName("client.dd")
    public static int field302 = 2;

    @ObfuscatedName("client.du")
    public static int field303 = 0;

    @ObfuscatedName("client.da")
    public static int field304 = 1;

    @ObfuscatedName("client.dh")
    public static int field305 = 0;

    @ObfuscatedName("client.di")
    public static int field306 = 0;

    @ObfuscatedName("client.ds")
    public static int field307 = 2;

    @ObfuscatedName("client.do")
    public static int field308 = 0;

    @ObfuscatedName("client.ev")
    public static int field309 = 1;

    @ObfuscatedName("client.en")
    public static int field407 = 0;

    @ObfuscatedName("client.ee")
    public static int field360 = 0;

    @ObfuscatedName("client.eh")
    public static int field313 = 2301979;

    @ObfuscatedName("client.el")
    public static int field310 = 5063219;

    @ObfuscatedName("client.er")
    public static int field451 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field316 = 7759444;

    @ObfuscatedName("client.ep")
    public static boolean field365 = false;

    @ObfuscatedName("client.fg")
    public static int field318 = 0;

    @ObfuscatedName("client.fn")
    public static int field319 = 128;

    @ObfuscatedName("client.ft")
    public static int field320 = 0;

    @ObfuscatedName("client.fp")
    public static int field270 = 0;

    @ObfuscatedName("client.fi")
    public static int field277 = 0;

    @ObfuscatedName("client.fu")
    public static int field323 = 0;

    @ObfuscatedName("client.fz")
    public static int field324 = 0;

    @ObfuscatedName("client.fb")
    public static int field325 = 0;

    @ObfuscatedName("client.fs")
    public static boolean field326 = false;

    @ObfuscatedName("client.fc")
    public static int field327 = 0;

    @ObfuscatedName("client.fe")
    public static int field328 = 0;

    @ObfuscatedName("client.fl")
    public static int field493 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field441 = new int[field493];

    @ObfuscatedName("client.fd")
    public static int[] field331 = new int[field493];

    @ObfuscatedName("client.fx")
    public static int[] field332 = new int[field493];

    @ObfuscatedName("client.fh")
    public static int[] field269 = new int[field493];

    @ObfuscatedName("client.fw")
    public static int[] field334 = new int[field493];

    @ObfuscatedName("client.fr")
    public static int[] field335 = new int[field493];

    @ObfuscatedName("client.fa")
    public static int[] field336 = new int[field493];

    @ObfuscatedName("client.go")
    public static String[] field384 = new String[field493];

    @ObfuscatedName("client.gi")
    public static int[][] field337 = new int[104][104];

    @ObfuscatedName("client.gk")
    public static int field339 = 0;

    @ObfuscatedName("client.gg")
    public static int field425 = -1;

    @ObfuscatedName("client.gl")
    public static int field341 = -1;

    @ObfuscatedName("client.gm")
    public static int field342 = 0;

    @ObfuscatedName("client.gv")
    public static int field435 = 0;

    @ObfuscatedName("client.gf")
    public static int field459 = 0;

    @ObfuscatedName("client.ge")
    public static int field345 = 0;

    @ObfuscatedName("client.gb")
    public static int field346 = 0;

    @ObfuscatedName("client.gq")
    public static int field347 = 0;

    @ObfuscatedName("client.gn")
    public static int field403 = 0;

    @ObfuscatedName("client.gy")
    public static int field349 = 0;

    @ObfuscatedName("client.gd")
    public static int field350 = 0;

    @ObfuscatedName("client.gj")
    public static int field351 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field352 = false;

    @ObfuscatedName("client.gz")
    public static int field353 = 0;

    @ObfuscatedName("client.gw")
    public static int field354 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field355 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field356 = 0;

    @ObfuscatedName("client.gp")
    public static int[] field280 = new int[2048];

    @ObfuscatedName("client.hr")
    public static int field315 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field401 = new int[2048];

    @ObfuscatedName("client.hv")
    public static class108[] field235 = new class108[2048];

    @ObfuscatedName("client.hh")
    public static int field361 = -1;

    @ObfuscatedName("client.hz")
    public static int field362 = 0;

    @ObfuscatedName("client.ht")
    public static int field363 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field364 = new int[1000];

    @ObfuscatedName("client.hs")
    public static final int[] field243 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hx")
    public static String[] field366 = new String[8];

    @ObfuscatedName("client.ho")
    public static boolean[] field367 = new boolean[8];

    @ObfuscatedName("client.he")
    public static int[] field251 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hq")
    public static int field369 = -1;

    @ObfuscatedName("client.hu")
    public static class180[][][] field370 = new class180[4][104][104];

    @ObfuscatedName("client.hm")
    public static class180 field294 = new class180();

    @ObfuscatedName("client.hj")
    public static class180 field372 = new class180();

    @ObfuscatedName("client.hb")
    public static class180 field373 = new class180();

    @ObfuscatedName("client.hl")
    public static int[] field239 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field375 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field376 = new int[25];

    @ObfuscatedName("client.hf")
    public static int field377 = 0;

    @ObfuscatedName("client.hn")
    public static boolean field378 = false;

    @ObfuscatedName("client.in")
    public static int field379 = 0;

    @ObfuscatedName("client.ib")
    public static int[] field380 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field422 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field382 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field321 = new int[500];

    @ObfuscatedName("client.iu")
    public static String[] field240 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field385 = new String[500];

    @ObfuscatedName("client.is")
    public static int field386 = -1;

    @ObfuscatedName("client.im")
    public static int field460 = -1;

    @ObfuscatedName("client.ik")
    public static int field275 = 0;

    @ObfuscatedName("client.iv")
    public static int field389 = 50;

    @ObfuscatedName("client.ig")
    public static int field390 = 0;

    @ObfuscatedName("client.it")
    public static String field391 = null;

    @ObfuscatedName("client.iq")
    public static boolean field392 = false;

    @ObfuscatedName("client.ij")
    public static int field495 = -1;

    @ObfuscatedName("client.ih")
    public static int field394 = -1;

    @ObfuscatedName("client.jv")
    public static String field395 = null;

    @ObfuscatedName("client.jy")
    public static String field396 = null;

    @ObfuscatedName("client.jq")
    public static int field387 = -1;

    @ObfuscatedName("client.jr")
    public static class177 field398 = new class177(8);

    @ObfuscatedName("client.ju")
    public static int field241 = 0;

    @ObfuscatedName("client.jg")
    public static int field400 = 0;

    @ObfuscatedName("client.jf")
    public static class155 field429 = null;

    @ObfuscatedName("client.jd")
    public static int field488 = 0;

    @ObfuscatedName("client.ja")
    public static int field408 = 0;

    @ObfuscatedName("client.jo")
    public static int field404 = 0;

    @ObfuscatedName("client.jz")
    public static int field405 = -1;

    @ObfuscatedName("client.je")
    public static boolean field406 = false;

    @ObfuscatedName("client.jj")
    public static boolean field330 = false;

    @ObfuscatedName("client.jb")
    public static boolean field338 = false;

    @ObfuscatedName("client.jw")
    public static class155 field409 = null;

    @ObfuscatedName("client.jt")
    public static class155 field348 = null;

    @ObfuscatedName("client.jp")
    public static int field411 = 0;

    @ObfuscatedName("client.js")
    public static int field412 = 0;

    @ObfuscatedName("client.ji")
    public static class155 field413 = null;

    @ObfuscatedName("client.jn")
    public static boolean field414 = false;

    @ObfuscatedName("client.jx")
    public static int field415 = -1;

    @ObfuscatedName("client.jm")
    public static int field416 = -1;

    @ObfuscatedName("client.jl")
    public static boolean field417 = false;

    @ObfuscatedName("client.jh")
    public static int field418 = -1;

    @ObfuscatedName("client.jk")
    public static int field311 = -1;

    @ObfuscatedName("client.kv")
    public static boolean field420 = false;

    @ObfuscatedName("client.kh")
    public static int field421 = 1;

    @ObfuscatedName("client.ky")
    public static int[] field462 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field491 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field290 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field399 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field426 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field236 = 0;

    @ObfuscatedName("client.kf")
    public static int field428 = 0;

    @ObfuscatedName("client.kg")
    public static int field473 = 0;

    @ObfuscatedName("client.kw")
    public static int field359 = 0;

    @ObfuscatedName("client.ku")
    public static int field431 = 0;

    @ObfuscatedName("client.kz")
    public static int field238 = 0;

    @ObfuscatedName("client.kj")
    public static int field433 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field434 = new int[2000];

    @ObfuscatedName("client.km")
    public static String[] field244 = new String[1000];

    @ObfuscatedName("client.ks")
    public static int field357 = 0;

    @ObfuscatedName("client.ki")
    public static class180 field438 = new class180();

    @ObfuscatedName("client.kb")
    public static class180 field317 = new class180();

    @ObfuscatedName("client.lg")
    public static class180 field440 = new class180();

    @ObfuscatedName("client.lz")
    public static class177 field295 = new class177(512);

    @ObfuscatedName("client.lb")
    public static int field442 = 0;

    @ObfuscatedName("client.lr")
    public static int field443 = -2;

    @ObfuscatedName("client.lv")
    public static boolean[] field444 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field371 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field446 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field447 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field368 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field449 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field474 = new int[100];

    @ObfuscatedName("client.lc")
    public static int field445 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field452 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lw")
    public static int field453 = 0;

    @ObfuscatedName("client.lo")
    public static int field454 = 0;

    @ObfuscatedName("client.ld")
    public static String field455 = "";

    @ObfuscatedName("client.li")
    public static long[] field456 = new long[100];

    @ObfuscatedName("client.lk")
    public static int field457 = 0;

    @ObfuscatedName("client.lj")
    public static int field458 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field256 = new int[128];

    @ObfuscatedName("client.lf")
    public static int[] field388 = new int[128];

    @ObfuscatedName("client.la")
    public static long field393 = -1L;

    @ObfuscatedName("client.ms")
    public static String field427 = null;

    @ObfuscatedName("client.ml")
    public static String field463 = null;

    @ObfuscatedName("client.mz")
    public static int field464 = -1;

    @ObfuscatedName("client.mh")
    public static int field465 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field466 = new int[1000];

    @ObfuscatedName("client.mo")
    public static int[] field467 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class73[] field468 = new class73[1000];

    @ObfuscatedName("client.ma")
    public static int field469 = 0;

    @ObfuscatedName("client.me")
    public static int field490 = 0;

    @ObfuscatedName("client.mi")
    public static int field471 = 0;

    @ObfuscatedName("client.mx")
    public static int field292 = 255;

    @ObfuscatedName("client.mv")
    public static int field276 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field314 = false;

    @ObfuscatedName("client.mn")
    public static int field475 = 127;

    @ObfuscatedName("client.mc")
    public static int field476 = 127;

    @ObfuscatedName("client.nk")
    public static int field477 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field478 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field479 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field472 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field481 = new int[50];

    @ObfuscatedName("client.nw")
    public static class53[] field482 = new class53[50];

    @ObfuscatedName("client.nd")
    public static boolean field439 = false;

    @ObfuscatedName("client.nf")
    public static boolean[] field484 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field485 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field486 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field487 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field450 = new int[5];

    @ObfuscatedName("client.og")
    public static int field489 = 0;

    @ObfuscatedName("client.ok")
    public static int field419 = 0;

    @ObfuscatedName("client.of")
    public static class16[] field344 = new class16[400];

    @ObfuscatedName("client.oi")
    public static class176 field492 = new class176();

    @ObfuscatedName("client.oe")
    public static int field358 = 0;

    @ObfuscatedName("client.oo")
    public static class8[] field333 = new class8[400];

    @ObfuscatedName("client.or")
    public static class160 field500 = new class160();

    @ObfuscatedName("client.oa")
    public static int field496 = -1;

    @ObfuscatedName("client.ow")
    public static int field424 = -1;

    @ObfuscatedName("client.ov")
    public static class201[] field498 = new class201[6];

    @ObfuscatedName("client.j(I)V")
    public final void method294() {
    }

    public final void init() {
        if (!this.method2620()) {
            return;
        }
        class171[] var1 = new class171[] { class171.field2823, class171.field2837, class171.field2827, class171.field2831, class171.field2829, class171.field2826, class171.field2834, class171.field2828, class171.field2830, class171.field2824 };
        class171[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class171 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2832);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2832)) {
                    case 1:
                        field461 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field497 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field19)) {
                        }
                        break;
                    case 4:
                        int var6 = Integer.parseInt(var5);
                        class141[] var7 = new class141[] { class141.field2105, class141.field2106, class141.field2107, class141.field2108 };
                        class141[] var8 = var7;
                        int var9 = 0;
                        class141 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class141 var10 = var8[var9];
                            if (var10.field2110 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field1054 = var11;
                        break;
                    case 5:
                        field430 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field2015 = (class142) class100.method706(class142.method574(), Integer.parseInt(var5));
                        if (Statics.field2015 == class142.field2119) {
                            Statics.field237 = class193.field2905;
                        } else {
                            Statics.field237 = class193.field2910;
                        }
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field19)) {
                            field437 = true;
                        } else {
                            field437 = false;
                        }
                        break;
                    case 8:
                        Statics.field117 = var5;
                        break;
                    case 9:
                        field480 = Integer.parseInt(var5);
                }
            }
        }
        class80.field1368 = false;
        field242 = false;
        Statics.field218 = this.getCodeBase().getHost();
        String var12 = Statics.field1054.field2109;
        byte var13 = 0;
        try {
            class138.method525("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class137.method2490((String) null, var15);
        }
        Statics.field2913 = this;
        this.method2618(765, 503, 68);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method172() {
        Statics.field1265 = field430 == 0 ? 43594 : field480 + 40000;
        Statics.field272 = field430 == 0 ? 443 : field480 + 50000;
        Statics.field2945 = Statics.field1265;
        Statics.field2670 = class156.field2651;
        Statics.field2950 = class156.field2649;
        Statics.field2111 = class156.field2650;
        Statics.field2671 = class156.field2648;
        class126.method535();
        class126.method2550(Statics.field171);
        class129.method2471(Statics.field171);
        Statics.field436 = class120.method1340();
        if (Statics.field436 != null) {
            Statics.field436.method2449(Statics.field171);
        }
        Statics.field525 = new class123(255, class138.field2075, class138.field2078, 500000);
        Statics.field1773 = class9.method110();
        Statics.field935 = this.getToolkit().getSystemClipboard();
        class127.method2089(this, Statics.field975);
        if (field430 != 0) {
            field252 = true;
        }
    }

    @ObfuscatedName("client.x(B)V")
    public final void method173() {
        field246++;
        this.method176();
        class152.method2474();
        try {
            if (class164.field2701 == 1) {
                int var1 = Statics.field2704.method3114();
                if (var1 > 0 && Statics.field2704.method3188()) {
                    int var2 = var1 - Statics.field2708;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2704.method3087(var2);
                } else {
                    Statics.field2704.method3136();
                    Statics.field2704.method3091();
                    if (Statics.field2706 == null) {
                        class164.field2701 = 0;
                    } else {
                        class164.field2701 = 2;
                    }
                    Statics.field2710 = null;
                    Statics.field582 = null;
                }
            }
        } catch (Exception var265) {
            var265.printStackTrace();
            Statics.field2704.method3136();
            class164.field2701 = 0;
            Statics.field2710 = null;
            Statics.field582 = null;
            Statics.field2706 = null;
        }
        method2730();
        class126 var4 = class126.field1970;
        synchronized (class126.field1970) {
            class126.field1954++;
            class126.field1966 = class126.field1968;
            class126.field1965 = 0;
            if (class126.field1961 >= 0) {
                while (class126.field1961 != class126.field1960) {
                    int var6 = class126.field1959[class126.field1960];
                    class126.field1960 = class126.field1960 + 1 & 0x7F;
                    if (var6 < 0) {
                        class126.field1958[~var6] = false;
                    } else {
                        if (!class126.field1958[var6] && class126.field1965 < class126.field1964.length - 1) {
                            class126.field1964[++class126.field1965 - 1] = var6;
                        }
                        class126.field1958[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class126.field1958[var5] = false;
                }
                class126.field1961 = class126.field1960;
            }
            class126.field1968 = class126.field1963;
        }
        class129 var8 = class129.field1993;
        synchronized (class129.field1993) {
            class129.field1995 = class129.field1992;
            class129.field1990 = class129.field2003;
            class129.field1997 = class129.field1994;
            class129.field2002 = class129.field1998;
            class129.field1996 = class129.field1999;
            class129.field2004 = class129.field2000;
            class129.field2005 = class129.field2001;
            class129.field1998 = 0;
        }
        if (Statics.field436 != null) {
            int var10 = Statics.field436.method2456();
            field357 = var10;
        }
        if (field483 == 0) {
            method563();
            Statics.field697.method2463();
            for (int var11 = 0; var11 < 32; var11++) {
                field2041[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field2042[var12] = 0L;
            }
            Statics.field2932 = 0;
        } else if (field483 == 5) {
            Statics.method169(this);
            method563();
            class133.method1988();
        } else if (field483 == 10 || field483 == 11) {
            Statics.method169(this);
        } else if (field483 == 20) {
            Statics.method169(this);
            method1884();
        } else if (field483 == 25) {
            method2720(false);
            field470 = 0;
            boolean var13 = true;
            for (int var14 = 0; var14 < Statics.field1556.length; var14++) {
                if (Statics.field210[var14] != -1 && Statics.field1556[var14] == null) {
                    Statics.field1556[var14] = Statics.field188.method2752(Statics.field210[var14], 0);
                    if (Statics.field1556[var14] == null) {
                        var13 = false;
                        field470++;
                    }
                }
                if (Statics.field1478[var14] != -1 && Statics.field1883[var14] == null) {
                    Statics.field1883[var14] = Statics.field188.method2758(Statics.field1478[var14], 0, Statics.field1676[var14]);
                    if (Statics.field1883[var14] == null) {
                        var13 = false;
                        field470++;
                    }
                }
            }
            if (var13) {
                field282 = 0;
                boolean var15 = true;
                for (int var16 = 0; var16 < Statics.field1556.length; var16++) {
                    byte[] var17 = Statics.field1883[var16];
                    if (var17 != null) {
                        int var18 = (Statics.field2807[var16] >> 8) * 64 - Statics.field183;
                        int var19 = (Statics.field2807[var16] & 0xFF) * 64 - Statics.field780;
                        if (field296) {
                            var18 = 10;
                            var19 = 10;
                        }
                        var15 &= class6.method141(var17, var18, var19);
                    }
                }
                if (var15) {
                    if (field268 != 0) {
                        method2488(class145.field2146 + class2.field24 + class2.field18 + 100 + "%" + class2.field31, true);
                    }
                    method2730();
                    method900();
                    method2730();
                    Statics.field2514.method1616();
                    method2730();
                    System.gc();
                    for (int var20 = 0; var20 < 4; var20++) {
                        field329[var20].method3634();
                    }
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                class6.field70[var21][var22][var23] = 0;
                            }
                        }
                    }
                    method2730();
                    class6.method36();
                    int var24 = Statics.field1556.length;
                    for (class21 var25 = (class21) class21.field554.method3304(); var25 != null; var25 = (class21) class21.field554.method3297()) {
                        if (var25.field543 != null) {
                            Statics.field1275.method949(var25.field543);
                            var25.field543 = null;
                        }
                        if (var25.field536 != null) {
                            Statics.field1275.method949(var25.field536);
                            var25.field536 = null;
                        }
                    }
                    class21.field554.method3276();
                    method2720(true);
                    if (!field296) {
                        for (int var26 = 0; var26 < var24; var26++) {
                            int var27 = (Statics.field2807[var26] >> 8) * 64 - Statics.field183;
                            int var28 = (Statics.field2807[var26] & 0xFF) * 64 - Statics.field780;
                            byte[] var29 = Statics.field1556[var26];
                            if (var29 != null) {
                                method2730();
                                class6.method465(var29, var27, var28, Statics.field2016 * 8 - 48, Statics.field1092 * 8 - 48, field329);
                            }
                        }
                        for (int var30 = 0; var30 < var24; var30++) {
                            int var31 = (Statics.field2807[var30] >> 8) * 64 - Statics.field183;
                            int var32 = (Statics.field2807[var30] & 0xFF) * 64 - Statics.field780;
                            byte[] var33 = Statics.field1556[var30];
                            if (var33 == null && Statics.field1092 < 800) {
                                method2730();
                                class6.method1781(var31, var32, 64, 64);
                            }
                        }
                        method2720(true);
                        for (int var34 = 0; var34 < var24; var34++) {
                            byte[] var35 = Statics.field1883[var34];
                            if (var35 != null) {
                                int var36 = (Statics.field2807[var34] >> 8) * 64 - Statics.field183;
                                int var37 = (Statics.field2807[var34] & 0xFF) * 64 - Statics.field780;
                                method2730();
                                class80 var38 = Statics.field2514;
                                class209[] var39 = field329;
                                class108 var40 = new class108(var35);
                                int var41 = -1;
                                while (true) {
                                    int var42 = var40.method2173();
                                    if (var42 == 0) {
                                        break;
                                    }
                                    var41 += var42;
                                    int var43 = 0;
                                    while (true) {
                                        int var44 = var40.method2173();
                                        if (var44 == 0) {
                                            break;
                                        }
                                        var43 += var44 - 1;
                                        int var45 = var43 & 0x3F;
                                        int var46 = var43 >> 6 & 0x3F;
                                        int var47 = var43 >> 12;
                                        int var48 = var40.method2291();
                                        int var49 = var48 >> 2;
                                        int var50 = var48 & 0x3;
                                        int var51 = var36 + var46;
                                        int var52 = var37 + var45;
                                        if (var51 > 0 && var52 > 0 && var51 < 103 && var52 < 103) {
                                            int var53 = var47;
                                            if ((class6.field70[1][var51][var52] & 0x2) == 2) {
                                                var53 = var47 - 1;
                                            }
                                            class209 var54 = null;
                                            if (var53 >= 0) {
                                                var54 = var39[var53];
                                            }
                                            class6.method3209(var47, var51, var52, var41, var50, var49, var38, var54);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field296) {
                        int var55 = 0;
                        label1538: while (true) {
                            if (var55 >= 4) {
                                for (int var78 = 0; var78 < 13; var78++) {
                                    for (int var79 = 0; var79 < 13; var79++) {
                                        int var80 = field297[0][var78][var79];
                                        if (var80 == -1) {
                                            class6.method1781(var78 * 8, var79 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2720(true);
                                int var81 = 0;
                                while (true) {
                                    if (var81 >= 4) {
                                        break label1538;
                                    }
                                    method2730();
                                    for (int var82 = 0; var82 < 13; var82++) {
                                        label1461: for (int var83 = 0; var83 < 13; var83++) {
                                            int var84 = field297[var81][var82][var83];
                                            if (var84 != -1) {
                                                int var85 = var84 >> 24 & 0x3;
                                                int var86 = var84 >> 1 & 0x3;
                                                int var87 = var84 >> 14 & 0x3FF;
                                                int var88 = var84 >> 3 & 0x7FF;
                                                int var89 = (var87 / 8 << 8) + var88 / 8;
                                                for (int var90 = 0; var90 < Statics.field2807.length; var90++) {
                                                    if (Statics.field2807[var90] == var89 && Statics.field1883[var90] != null) {
                                                        byte[] var91 = Statics.field1883[var90];
                                                        int var92 = var82 * 8;
                                                        int var93 = var83 * 8;
                                                        int var94 = (var87 & 0x7) * 8;
                                                        int var95 = (var88 & 0x7) * 8;
                                                        class80 var96 = Statics.field2514;
                                                        class209[] var97 = field329;
                                                        class108 var98 = new class108(var91);
                                                        int var99 = -1;
                                                        while (true) {
                                                            int var100 = var98.method2173();
                                                            if (var100 == 0) {
                                                                continue label1461;
                                                            }
                                                            var99 += var100;
                                                            int var101 = 0;
                                                            while (true) {
                                                                int var102 = var98.method2173();
                                                                if (var102 == 0) {
                                                                    break;
                                                                }
                                                                var101 += var102 - 1;
                                                                int var103 = var101 & 0x3F;
                                                                int var104 = var101 >> 6 & 0x3F;
                                                                int var105 = var101 >> 12;
                                                                int var106 = var98.method2291();
                                                                int var107 = var106 >> 2;
                                                                int var108 = var106 & 0x3;
                                                                if (var85 == var105 && var104 >= var94 && var104 < var94 + 8 && var103 >= var95 && var103 < var95 + 8) {
                                                                    class37 var109 = class37.method826(var99);
                                                                    int var111 = var104 & 0x7;
                                                                    int var112 = var103 & 0x7;
                                                                    int var114 = var109.field845;
                                                                    int var115 = var109.field869;
                                                                    if ((var108 & 0x1) == 1) {
                                                                        int var116 = var114;
                                                                        var114 = var115;
                                                                        var115 = var116;
                                                                    }
                                                                    int var117 = var86 & 0x3;
                                                                    int var118;
                                                                    if (var117 == 0) {
                                                                        var118 = var111;
                                                                    } else if (var117 == 1) {
                                                                        var118 = var112;
                                                                    } else if (var117 == 2) {
                                                                        var118 = 7 - var111 - (var114 - 1);
                                                                    } else {
                                                                        var118 = 7 - var112 - (var115 - 1);
                                                                    }
                                                                    int var119 = var92 + var118;
                                                                    int var121 = var104 & 0x7;
                                                                    int var122 = var103 & 0x7;
                                                                    int var124 = var109.field845;
                                                                    int var125 = var109.field869;
                                                                    if ((var108 & 0x1) == 1) {
                                                                        int var126 = var124;
                                                                        var124 = var125;
                                                                        var125 = var126;
                                                                    }
                                                                    int var127 = var86 & 0x3;
                                                                    int var128;
                                                                    if (var127 == 0) {
                                                                        var128 = var122;
                                                                    } else if (var127 == 1) {
                                                                        var128 = 7 - var121 - (var124 - 1);
                                                                    } else if (var127 == 2) {
                                                                        var128 = 7 - var122 - (var125 - 1);
                                                                    } else {
                                                                        var128 = var121;
                                                                    }
                                                                    int var129 = var93 + var128;
                                                                    if (var119 > 0 && var129 > 0 && var119 < 103 && var129 < 103) {
                                                                        int var130 = var81;
                                                                        if ((class6.field70[1][var119][var129] & 0x2) == 2) {
                                                                            var130 = var81 - 1;
                                                                        }
                                                                        class209 var131 = null;
                                                                        if (var130 >= 0) {
                                                                            var131 = var97[var130];
                                                                        }
                                                                        class6.method3209(var81, var119, var129, var99, var86 + var108 & 0x3, var107, var96, var131);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var81++;
                                }
                            }
                            method2730();
                            for (int var56 = 0; var56 < 13; var56++) {
                                for (int var57 = 0; var57 < 13; var57++) {
                                    boolean var58 = false;
                                    int var59 = field297[var55][var56][var57];
                                    if (var59 != -1) {
                                        int var60 = var59 >> 24 & 0x3;
                                        int var61 = var59 >> 1 & 0x3;
                                        int var62 = var59 >> 14 & 0x3FF;
                                        int var63 = var59 >> 3 & 0x7FF;
                                        int var64 = (var62 / 8 << 8) + var63 / 8;
                                        for (int var65 = 0; var65 < Statics.field2807.length; var65++) {
                                            if (Statics.field2807[var65] == var64 && Statics.field1556[var65] != null) {
                                                byte[] var66 = Statics.field1556[var65];
                                                int var67 = var56 * 8;
                                                int var68 = var57 * 8;
                                                int var69 = (var62 & 0x7) * 8;
                                                int var70 = (var63 & 0x7) * 8;
                                                class209[] var71 = field329;
                                                for (int var72 = 0; var72 < 8; var72++) {
                                                    for (int var73 = 0; var73 < 8; var73++) {
                                                        if (var67 + var72 > 0 && var67 + var72 < 103 && var68 + var73 > 0 && var68 + var73 < 103) {
                                                            var71[var55].field2997[var67 + var72][var68 + var73] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class108 var74 = new class108(var66);
                                                for (int var75 = 0; var75 < 4; var75++) {
                                                    for (int var76 = 0; var76 < 64; var76++) {
                                                        for (int var77 = 0; var77 < 64; var77++) {
                                                            if (var60 == var75 && var76 >= var69 && var76 < var69 + 8 && var77 >= var70 && var77 < var70 + 8) {
                                                                class6.method495(var74, var55, var67 + class158.method1048(var76 & 0x7, var77 & 0x7, var61), var68 + class158.method497(var76 & 0x7, var77 & 0x7, var61), 0, 0, var61);
                                                            } else {
                                                                class6.method495(var74, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var58 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var58) {
                                        class6.method991(var55, var56 * 8, var57 * 8);
                                    }
                                }
                            }
                            var55++;
                        }
                    }
                    method2720(true);
                    method900();
                    method2730();
                    class6.method901(Statics.field2514, field329);
                    method2720(true);
                    int var132 = class6.field72;
                    if (var132 > Statics.field2678) {
                        var132 = Statics.field2678;
                    }
                    if (var132 < Statics.field2678 - 1) {
                        int var133 = Statics.field2678 - 1;
                    }
                    if (field242) {
                        Statics.field2514.method1617(class6.field72);
                    } else {
                        Statics.field2514.method1617(0);
                    }
                    for (int var134 = 0; var134 < 104; var134++) {
                        for (int var135 = 0; var135 < 104; var135++) {
                            Statics.method134(var134, var135);
                        }
                    }
                    method2730();
                    for (class15 var136 = (class15) field294.method3304(); var136 != null; var136 = (class15) field294.method3297()) {
                        if (var136.field201 == -1) {
                            var136.field200 = 0;
                            method2377(var136);
                        } else {
                            var136.method3375();
                        }
                    }
                    class37.field833.method3214();
                    if (Statics.field1058 != null) {
                        field261.method2391(177);
                        field261.method2150(1057001181);
                    }
                    if (!field296) {
                        int var137 = (Statics.field2016 - 6) / 8;
                        int var138 = (Statics.field2016 + 6) / 8;
                        int var139 = (Statics.field1092 - 6) / 8;
                        int var140 = (Statics.field1092 + 6) / 8;
                        for (int var141 = var137 - 1; var141 <= var138 + 1; var141++) {
                            for (int var142 = var139 - 1; var142 <= var140 + 1; var142++) {
                                if (var141 < var137 || var141 > var138 || var142 < var139 || var142 > var140) {
                                    Statics.field188.method2769("m" + var141 + "_" + var142);
                                    Statics.field188.method2769("l" + var141 + "_" + var142);
                                }
                            }
                        }
                    }
                    Statics.method2388(30);
                    method2730();
                    class6.method2936();
                    field261.method2391(93);
                    class133.method1988();
                } else {
                    field268 = 2;
                }
            } else {
                field268 = 1;
            }
        }
        if (field483 == 30) {
            if (field253 > 1) {
                field253--;
            }
            if (field283 > 0) {
                field283--;
            }
            if (field287) {
                field287 = false;
                method496();
            } else {
                if (!field378) {
                    field240[0] = class145.field2261;
                    field385[0] = "";
                    field382[0] = 1006;
                    field379 = 1;
                }
                for (int var143 = 0; var143 < 100 && method160(); var143++) {
                }
                if (field483 == 30) {
                    while (class192.method501()) {
                        field261.method2391(103);
                        field261.method2226(0);
                        int var144 = field261.field1823;
                        Statics.method2968(field261);
                        field261.method2158(field261.field1823 - var144);
                    }
                    Object var145 = Statics.field2788.field166;
                    synchronized (Statics.field2788.field166) {
                        if (!field263) {
                            Statics.field2788.field167 = 0;
                        } else if (class129.field2002 != 0 || Statics.field2788.field167 >= 40) {
                            field261.method2391(134);
                            field261.method2226(0);
                            int var146 = field261.field1823;
                            int var147 = 0;
                            for (int var148 = 0; var148 < Statics.field2788.field167 && field261.field1823 - var146 < 240; var148++) {
                                var147++;
                                int var149 = Statics.field2788.field169[var148];
                                if (var149 < 0) {
                                    var149 = 0;
                                } else if (var149 > 502) {
                                    var149 = 502;
                                }
                                int var150 = Statics.field2788.field165[var148];
                                if (var150 < 0) {
                                    var150 = 0;
                                } else if (var150 > 764) {
                                    var150 = 764;
                                }
                                int var151 = var149 * 765 + var150;
                                if (Statics.field2788.field169[var148] == -1 && Statics.field2788.field165[var148] == -1) {
                                    var150 = -1;
                                    var149 = -1;
                                    var151 = 524287;
                                }
                                if (field448 != var150 || field249 != var149) {
                                    int var152 = var150 - field448;
                                    field448 = var150;
                                    int var153 = var149 - field249;
                                    field249 = var149;
                                    if (field250 < 8 && var152 >= -32 && var152 <= 31 && var153 >= -32 && var153 <= 31) {
                                        var152 += 32;
                                        var153 += 32;
                                        field261.method2148((field250 << 12) + (var152 << 6) + var153);
                                        field250 = 0;
                                    } else if (field250 < 8) {
                                        field261.method2149((field250 << 19) + 8388608 + var151);
                                        field250 = 0;
                                    } else {
                                        field261.method2150((field250 << 19) + -1073741824 + var151);
                                        field250 = 0;
                                    }
                                } else if (field250 < 2047) {
                                    field250++;
                                }
                            }
                            field261.method2158(field261.field1823 - var146);
                            if (var147 >= Statics.field2788.field167) {
                                Statics.field2788.field167 = 0;
                            } else {
                                Statics.field2788.field167 -= var147;
                                for (int var154 = 0; var154 < Statics.field2788.field167; var154++) {
                                    Statics.field2788.field165[var154] = Statics.field2788.field165[var147 + var154];
                                    Statics.field2788.field169[var154] = Statics.field2788.field169[var147 + var154];
                                }
                            }
                        }
                    }
                    if (class129.field2002 == 1 || !Statics.field1985 && class129.field2002 == 4 || class129.field2002 == 2) {
                        long var156 = (class129.field2005 - field247 * -1L) / 50L;
                        if (var156 > 4095L) {
                            var156 = 4095L;
                        }
                        field247 = class129.field2005 * -1L;
                        int var158 = class129.field2004;
                        if (var158 < 0) {
                            var158 = 0;
                        } else if (var158 > 502) {
                            var158 = 502;
                        }
                        int var159 = class129.field1996;
                        if (var159 < 0) {
                            var159 = 0;
                        } else if (var159 > 764) {
                            var159 = 764;
                        }
                        int var160 = var158 * 765 + var159;
                        byte var161 = 0;
                        if (class129.field2002 == 2) {
                            var161 = 1;
                        }
                        int var162 = (int) var156;
                        field261.method2391(165);
                        field261.method2150((var161 << 19) + (var162 << 20) + var160);
                    }
                    if (class126.field1965 > 0) {
                        field261.method2391(130);
                        field261.method2148(0);
                        int var163 = field261.field1823;
                        long var164 = class104.method2616();
                        for (int var166 = 0; var166 < class126.field1965; var166++) {
                            long var167 = var164 - field393;
                            if (var167 > 16777215L) {
                                var167 = 16777215L;
                            }
                            field393 = var164;
                            field261.method2197((int) var167);
                            field261.method2226(class126.field1964[var166]);
                        }
                        field261.method2157(field261.field1823 - var163);
                    }
                    if (field325 > 0) {
                        field325--;
                    }
                    if (class126.field1958[96] || class126.field1958[97] || class126.field1958[98] || class126.field1958[99]) {
                        field326 = true;
                    }
                    if (field326 && field325 <= 0) {
                        field325 = 20;
                        field326 = false;
                        field261.method2391(73);
                        field261.method2189(field320);
                        field261.method2190(field319);
                    }
                    if (Statics.field1804 && !field284) {
                        field284 = true;
                        field261.method2391(178);
                        field261.method2226(1);
                    }
                    if (!Statics.field1804 && field284) {
                        field284 = false;
                        field261.method2391(178);
                        field261.method2226(0);
                    }
                    method575();
                    if (field483 == 30) {
                        method1424();
                        method164();
                        field281++;
                        if (field281 > 750) {
                            method496();
                        } else {
                            for (int var169 = -1; var169 < field356; var169++) {
                                int var170;
                                if (var169 == -1) {
                                    var170 = 2047;
                                } else {
                                    var170 = field280[var169];
                                }
                                class3 var171 = field355[var170];
                                if (var171 != null) {
                                    method163(var171, 1);
                                }
                            }
                            method158();
                            method735();
                            field360++;
                            if (field345 != 0) {
                                field459 += 20;
                                if (field459 >= 400) {
                                    field345 = 0;
                                }
                            }
                            if (Statics.field172 != null) {
                                field346++;
                                if (field346 >= 15) {
                                    method744(Statics.field172);
                                    Statics.field172 = null;
                                }
                            }
                            class155 var172 = Statics.field196;
                            class155 var173 = Statics.field54;
                            Statics.field196 = null;
                            Statics.field54 = null;
                            field413 = null;
                            field417 = false;
                            field414 = false;
                            field458 = 0;
                            while (true) {
                                while (class126.method619() && field458 < 128) {
                                    if (field404 >= 2 && class126.field1958[82] && Statics.field2083 == 66) {
                                        String var174 = "";
                                        Iterator var175 = class10.field144.iterator();
                                        while (var175.hasNext()) {
                                            class32 var176 = (class32) var175.next();
                                            var174 = var174 + var176.field691 + ':' + var176.field696 + '\n';
                                        }
                                        Statics.field935.setContents(new StringSelection(var174), (ClipboardOwner) null);
                                    } else {
                                        field388[field458] = Statics.field2083;
                                        field256[field458] = Statics.field999;
                                        field458++;
                                    }
                                }
                                method12(field387, 0, 0, 765, 503, 0, 0);
                                field421++;
                                while (true) {
                                    class1 var179;
                                    class155 var180;
                                    class155 var181;
                                    do {
                                        var179 = (class1) field317.method3280();
                                        if (var179 == null) {
                                            while (true) {
                                                class1 var182;
                                                class155 var183;
                                                class155 var184;
                                                do {
                                                    var182 = (class1) field440.method3280();
                                                    if (var182 == null) {
                                                        while (true) {
                                                            class1 var185;
                                                            class155 var186;
                                                            class155 var187;
                                                            do {
                                                                var185 = (class1) field438.method3280();
                                                                if (var185 == null) {
                                                                    method1864();
                                                                    if (Statics.field926 == null && field409 == null) {
                                                                        int var188 = class129.field2002;
                                                                        if (field378) {
                                                                            if (var188 != 1 && (Statics.field1985 || var188 != 4)) {
                                                                                int var189 = class129.field1990;
                                                                                int var190 = class129.field1997;
                                                                                if (var189 < Statics.field1904 - 10 || var189 > Statics.field2510 + Statics.field1904 + 10 || var190 < Statics.field2484 - 10 || var190 > Statics.field624 + Statics.field2484 + 10) {
                                                                                    field378 = false;
                                                                                    method1882(Statics.field1904, Statics.field2484, Statics.field2510, Statics.field624);
                                                                                }
                                                                            }
                                                                            if (var188 == 1 || !Statics.field1985 && var188 == 4) {
                                                                                int var191 = Statics.field1904;
                                                                                int var192 = Statics.field2484;
                                                                                int var193 = Statics.field2510;
                                                                                int var194 = class129.field1996;
                                                                                int var195 = class129.field2004;
                                                                                int var196 = -1;
                                                                                for (int var197 = 0; var197 < field379; var197++) {
                                                                                    int var198 = (field379 - 1 - var197) * 15 + var192 + 31;
                                                                                    if (var194 > var191 && var194 < var191 + var193 && var195 > var198 - 13 && var195 < var198 + 3) {
                                                                                        var196 = var197;
                                                                                    }
                                                                                }
                                                                                if (var196 != -1 && var196 >= 0) {
                                                                                    int var199 = field380[var196];
                                                                                    int var200 = field422[var196];
                                                                                    int var201 = field382[var196];
                                                                                    int var202 = field321[var196];
                                                                                    String var203 = field240[var196];
                                                                                    String var204 = field385[var196];
                                                                                    method1609(var199, var200, var201, var202, var203, var204, class129.field1996, class129.field2004);
                                                                                }
                                                                                field378 = false;
                                                                                method1882(Statics.field1904, Statics.field2484, Statics.field2510, Statics.field624);
                                                                            }
                                                                        } else {
                                                                            label1815: {
                                                                                if ((var188 == 1 || !Statics.field1985 && var188 == 4) && field379 > 0) {
                                                                                    int var205 = field382[field379 - 1];
                                                                                    if (var205 == 39 || var205 == 40 || var205 == 41 || var205 == 42 || var205 == 43 || var205 == 33 || var205 == 34 || var205 == 35 || var205 == 36 || var205 == 37 || var205 == 38 || var205 == 1005) {
                                                                                        int var206 = field380[field379 - 1];
                                                                                        int var207 = field422[field379 - 1];
                                                                                        class155 var208 = class155.method1889(var207);
                                                                                        if (class159.method748(method534(var208)) || class159.method527(method534(var208))) {
                                                                                            if (Statics.field926 != null && !field352 && field377 != 1 && !method2933(field379 - 1) && field379 > 0) {
                                                                                                method504(field349, field350);
                                                                                            }
                                                                                            field352 = false;
                                                                                            field353 = 0;
                                                                                            if (Statics.field926 != null) {
                                                                                                method744(Statics.field926);
                                                                                            }
                                                                                            Statics.field926 = class155.method1889(var207);
                                                                                            field403 = var206;
                                                                                            field349 = class129.field1996;
                                                                                            field350 = class129.field2004;
                                                                                            if (field379 > 0) {
                                                                                                int var209 = field379 - 1;
                                                                                                Statics.field764 = new class28();
                                                                                                Statics.field764.field635 = field380[var209];
                                                                                                Statics.field764.field628 = field422[var209];
                                                                                                Statics.field764.field631 = field382[var209];
                                                                                                Statics.field764.field629 = field321[var209];
                                                                                                Statics.field764.field630 = field240[var209];
                                                                                            }
                                                                                            method744(Statics.field926);
                                                                                            break label1815;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if ((var188 == 1 || !Statics.field1985 && var188 == 4) && (field377 == 1 && field379 > 2 || method2933(field379 - 1))) {
                                                                                    var188 = 2;
                                                                                }
                                                                                if ((var188 == 1 || !Statics.field1985 && var188 == 4) && field379 > 0) {
                                                                                    int var210 = field379 - 1;
                                                                                    if (var210 >= 0) {
                                                                                        int var211 = field380[var210];
                                                                                        int var212 = field422[var210];
                                                                                        int var213 = field382[var210];
                                                                                        int var214 = field321[var210];
                                                                                        String var215 = field240[var210];
                                                                                        String var216 = field385[var210];
                                                                                        method1609(var211, var212, var213, var214, var215, var216, class129.field1996, class129.field2004);
                                                                                    }
                                                                                }
                                                                                if (var188 == 2 && field379 > 0) {
                                                                                    method2932(class129.field1996, class129.field2004);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (field409 != null) {
                                                                        method2937();
                                                                    }
                                                                    if (Statics.field926 != null) {
                                                                        method744(Statics.field926);
                                                                        field353++;
                                                                        if (class129.field1995 == 0) {
                                                                            if (field352) {
                                                                                if (Statics.field926 == Statics.field2614 && field403 != field351) {
                                                                                    class155 var217 = Statics.field926;
                                                                                    byte var218 = 0;
                                                                                    if (field400 == 1 && var217.field2528 == 206) {
                                                                                        var218 = 1;
                                                                                    }
                                                                                    if (var217.field2629[field351] <= 0) {
                                                                                        var218 = 0;
                                                                                    }
                                                                                    if (class159.method527(method534(var217))) {
                                                                                        int var219 = field403;
                                                                                        int var220 = field351;
                                                                                        var217.field2629[var220] = var217.field2629[var219];
                                                                                        var217.field2630[var220] = var217.field2630[var219];
                                                                                        var217.field2629[var219] = -1;
                                                                                        var217.field2630[var219] = 0;
                                                                                    } else if (var218 == 1) {
                                                                                        int var221 = field403;
                                                                                        int var222 = field351;
                                                                                        while (var221 != var222) {
                                                                                            if (var221 > var222) {
                                                                                                var217.method2887(var221 - 1, var221);
                                                                                                var221--;
                                                                                            } else if (var221 < var222) {
                                                                                                var217.method2887(var221 + 1, var221);
                                                                                                var221++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var217.method2887(field351, field403);
                                                                                    }
                                                                                    field261.method2391(61);
                                                                                    field261.method2190(field403);
                                                                                    field261.method2189(field351);
                                                                                    field261.method2185(var218);
                                                                                    field261.method2200(Statics.field926.field2524);
                                                                                }
                                                                            } else if ((field377 == 1 || method2933(field379 - 1)) && field379 > 2) {
                                                                                method2932(field349, field350);
                                                                            } else if (field379 > 0) {
                                                                                method504(field349, field350);
                                                                            }
                                                                            field346 = 10;
                                                                            class129.field2002 = 0;
                                                                            Statics.field926 = null;
                                                                        } else if (field353 >= 5 && (class129.field1990 > field349 + 5 || class129.field1990 < field349 - 5 || class129.field1997 > field350 + 5 || class129.field1997 < field350 - 5)) {
                                                                            field352 = true;
                                                                        }
                                                                    }
                                                                    if (class80.field1367 != -1) {
                                                                        int var223 = class80.field1367;
                                                                        int var224 = class80.field1379;
                                                                        field261.method2391(36);
                                                                        field261.method2226(5);
                                                                        field261.method2189(Statics.field183 + var223);
                                                                        field261.method2226(class126.field1958[82] ? (class126.field1958[81] ? 2 : 1) : 0);
                                                                        field261.method2191(Statics.field780 + var224);
                                                                        class80.field1367 = -1;
                                                                        field342 = class129.field1996;
                                                                        field435 = class129.field2004;
                                                                        field345 = 1;
                                                                        field459 = 0;
                                                                        field469 = var223;
                                                                        field490 = var224;
                                                                    }
                                                                    if (Statics.field196 != var172) {
                                                                        if (var172 != null) {
                                                                            method744(var172);
                                                                        }
                                                                        if (Statics.field196 != null) {
                                                                            method744(Statics.field196);
                                                                        }
                                                                    }
                                                                    if (Statics.field54 != var173 && field389 == field275) {
                                                                        if (var173 != null) {
                                                                            method744(var173);
                                                                        }
                                                                        if (Statics.field54 != null) {
                                                                            method744(Statics.field54);
                                                                        }
                                                                    }
                                                                    if (Statics.field54 == null) {
                                                                        if (field275 > 0) {
                                                                            field275--;
                                                                        }
                                                                    } else if (field275 < field389) {
                                                                        field275++;
                                                                        if (field389 == field275) {
                                                                            method744(Statics.field54);
                                                                        }
                                                                    }
                                                                    int var225 = field299 + Statics.field216.field732;
                                                                    int var226 = field494 + Statics.field216.field777;
                                                                    if (Statics.field2981 - var225 < -500 || Statics.field2981 - var225 > 500 || Statics.field534 - var226 < -500 || Statics.field534 - var226 > 500) {
                                                                        Statics.field2981 = var225;
                                                                        Statics.field534 = var226;
                                                                    }
                                                                    if (Statics.field2981 != var225) {
                                                                        Statics.field2981 += (var225 - Statics.field2981) / 16;
                                                                    }
                                                                    if (Statics.field534 != var226) {
                                                                        Statics.field534 += (var226 - Statics.field534) / 16;
                                                                    }
                                                                    if (class129.field1995 == 4 && Statics.field1985) {
                                                                        int var227 = class129.field1997 - field324;
                                                                        field277 = var227 * 2;
                                                                        field324 = var227 == -1 || var227 == 1 ? class129.field1997 : (field324 + class129.field1997) / 2;
                                                                        int var228 = field323 - class129.field1990;
                                                                        field270 = var228 * 2;
                                                                        field323 = var228 == -1 || var228 == 1 ? class129.field1990 : (field323 + class129.field1990) / 2;
                                                                    } else {
                                                                        if (class126.field1958[96]) {
                                                                            field270 += (-24 - field270) / 2;
                                                                        } else if (class126.field1958[97]) {
                                                                            field270 += (24 - field270) / 2;
                                                                        } else {
                                                                            field270 /= 2;
                                                                        }
                                                                        if (class126.field1958[98]) {
                                                                            field277 += (12 - field277) / 2;
                                                                        } else if (class126.field1958[99]) {
                                                                            field277 += (-12 - field277) / 2;
                                                                        } else {
                                                                            field277 /= 2;
                                                                        }
                                                                        field324 = class129.field1997;
                                                                        field323 = class129.field1990;
                                                                    }
                                                                    field320 = field270 / 2 + field320 & 0x7FF;
                                                                    field319 += field277 / 2;
                                                                    if (field319 < 128) {
                                                                        field319 = 128;
                                                                    }
                                                                    if (field319 > 383) {
                                                                        field319 = 383;
                                                                    }
                                                                    int var229 = Statics.field2981 >> 7;
                                                                    int var230 = Statics.field534 >> 7;
                                                                    int var231 = method324(Statics.field2981, Statics.field534, Statics.field2678);
                                                                    int var232 = 0;
                                                                    if (var229 > 3 && var230 > 3 && var229 < 100 && var230 < 100) {
                                                                        for (int var233 = var229 - 4; var233 <= var229 + 4; var233++) {
                                                                            for (int var234 = var230 - 4; var234 <= var230 + 4; var234++) {
                                                                                int var235 = Statics.field2678;
                                                                                if (var235 < 3 && (class6.field70[1][var233][var234] & 0x2) == 2) {
                                                                                    var235++;
                                                                                }
                                                                                int var236 = var231 - class6.field76[var235][var233][var234];
                                                                                if (var236 > var232) {
                                                                                    var232 = var236;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int var237 = var232 * 192;
                                                                    if (var237 > 98048) {
                                                                        var237 = 98048;
                                                                    }
                                                                    if (var237 < 32768) {
                                                                        var237 = 32768;
                                                                    }
                                                                    if (var237 > field327) {
                                                                        field327 += (var237 - field327) / 24;
                                                                    } else if (var237 < field327) {
                                                                        field327 += (var237 - field327) / 80;
                                                                    }
                                                                    if (field439) {
                                                                        int var238 = Statics.field135 * 128 + 64;
                                                                        int var239 = Statics.field129 * 128 + 64;
                                                                        int var240 = method324(var238, var239, Statics.field2678) - Statics.field2088;
                                                                        if (Statics.field1335 < var238) {
                                                                            Statics.field1335 += Statics.field980 * (var238 - Statics.field1335) / 1000 + Statics.field576;
                                                                            if (Statics.field1335 > var238) {
                                                                                Statics.field1335 = var238;
                                                                            }
                                                                        }
                                                                        if (Statics.field1335 > var238) {
                                                                            Statics.field1335 -= Statics.field980 * (Statics.field1335 - var238) / 1000 + Statics.field576;
                                                                            if (Statics.field1335 < var238) {
                                                                                Statics.field1335 = var238;
                                                                            }
                                                                        }
                                                                        if (Statics.field119 < var240) {
                                                                            Statics.field119 += Statics.field980 * (var240 - Statics.field119) / 1000 + Statics.field576;
                                                                            if (Statics.field119 > var240) {
                                                                                Statics.field119 = var240;
                                                                            }
                                                                        }
                                                                        if (Statics.field119 > var240) {
                                                                            Statics.field119 -= Statics.field980 * (Statics.field119 - var240) / 1000 + Statics.field576;
                                                                            if (Statics.field119 < var240) {
                                                                                Statics.field119 = var240;
                                                                            }
                                                                        }
                                                                        if (Statics.field2652 < var239) {
                                                                            Statics.field2652 += Statics.field980 * (var239 - Statics.field2652) / 1000 + Statics.field576;
                                                                            if (Statics.field2652 > var239) {
                                                                                Statics.field2652 = var239;
                                                                            }
                                                                        }
                                                                        if (Statics.field2652 > var239) {
                                                                            Statics.field2652 -= Statics.field980 * (Statics.field2652 - var239) / 1000 + Statics.field576;
                                                                            if (Statics.field2652 < var239) {
                                                                                Statics.field2652 = var239;
                                                                            }
                                                                        }
                                                                        int var241 = Statics.field2064 * 128 + 64;
                                                                        int var242 = Statics.field698 * 128 + 64;
                                                                        int var243 = method324(var241, var242, Statics.field2678) - Statics.field1889;
                                                                        int var244 = var241 - Statics.field1335;
                                                                        int var245 = var243 - Statics.field119;
                                                                        int var246 = var242 - Statics.field2652;
                                                                        int var247 = (int) Math.sqrt((double) (var244 * var244 + var246 * var246));
                                                                        int var248 = (int) (Math.atan2((double) var245, (double) var247) * 325.949D) & 0x7FF;
                                                                        int var249 = (int) (Math.atan2((double) var244, (double) var246) * -325.949D) & 0x7FF;
                                                                        if (var248 < 128) {
                                                                            var248 = 128;
                                                                        }
                                                                        if (var248 > 383) {
                                                                            var248 = 383;
                                                                        }
                                                                        if (Statics.field677 < var248) {
                                                                            Statics.field677 += Statics.field1339 * (var248 - Statics.field677) / 1000 + Statics.field2006;
                                                                            if (Statics.field677 > var248) {
                                                                                Statics.field677 = var248;
                                                                            }
                                                                        }
                                                                        if (Statics.field677 > var248) {
                                                                            Statics.field677 -= Statics.field1339 * (Statics.field677 - var248) / 1000 + Statics.field2006;
                                                                            if (Statics.field677 < var248) {
                                                                                Statics.field677 = var248;
                                                                            }
                                                                        }
                                                                        int var250 = var249 - Statics.field17;
                                                                        if (var250 > 1024) {
                                                                            var250 -= 2048;
                                                                        }
                                                                        if (var250 < -1024) {
                                                                            var250 += 2048;
                                                                        }
                                                                        if (var250 > 0) {
                                                                            Statics.field17 += Statics.field1339 * var250 / 1000 + Statics.field2006;
                                                                            Statics.field17 &= 0x7FF;
                                                                        }
                                                                        if (var250 < 0) {
                                                                            Statics.field17 -= Statics.field1339 * -var250 / 1000 + Statics.field2006;
                                                                            Statics.field17 &= 0x7FF;
                                                                        }
                                                                        int var251 = var249 - Statics.field17;
                                                                        if (var251 > 1024) {
                                                                            var251 -= 2048;
                                                                        }
                                                                        if (var251 < -1024) {
                                                                            var251 += 2048;
                                                                        }
                                                                        if (var251 < 0 && var250 > 0 || var251 > 0 && var250 < 0) {
                                                                            Statics.field17 = var249;
                                                                        }
                                                                    }
                                                                    for (int var252 = 0; var252 < 5; var252++) {
                                                                        int var10002 = field450[var252]++;
                                                                    }
                                                                    int var253 = ++class129.field1991 - 1;
                                                                    int var255 = class126.field1954;
                                                                    if (var253 > 15000 && var255 > 15000) {
                                                                        field283 = 250;
                                                                        class129.method457(14500);
                                                                        field261.method2391(69);
                                                                    }
                                                                    field305++;
                                                                    if (field305 > 500) {
                                                                        field305 = 0;
                                                                        int var257 = (int) (Math.random() * 8.0D);
                                                                        if ((var257 & 0x1) == 1) {
                                                                            field299 += field300;
                                                                        }
                                                                        if ((var257 & 0x2) == 2) {
                                                                            field494 += field302;
                                                                        }
                                                                        if ((var257 & 0x4) == 4) {
                                                                            field303 += field304;
                                                                        }
                                                                    }
                                                                    if (field299 < -50) {
                                                                        field300 = 2;
                                                                    }
                                                                    if (field299 > 50) {
                                                                        field300 = -2;
                                                                    }
                                                                    if (field494 < -55) {
                                                                        field302 = 2;
                                                                    }
                                                                    if (field494 > 55) {
                                                                        field302 = -2;
                                                                    }
                                                                    if (field303 < -40) {
                                                                        field304 = 1;
                                                                    }
                                                                    if (field303 > 40) {
                                                                        field304 = -1;
                                                                    }
                                                                    field407++;
                                                                    if (field407 > 500) {
                                                                        field407 = 0;
                                                                        int var258 = (int) (Math.random() * 8.0D);
                                                                        if ((var258 & 0x1) == 1) {
                                                                            field306 += field307;
                                                                        }
                                                                        if ((var258 & 0x2) == 2) {
                                                                            field308 += field309;
                                                                        }
                                                                    }
                                                                    if (field306 < -60) {
                                                                        field307 = 2;
                                                                    }
                                                                    if (field306 > 60) {
                                                                        field307 = -2;
                                                                    }
                                                                    if (field308 < -20) {
                                                                        field309 = 1;
                                                                    }
                                                                    if (field308 > 10) {
                                                                        field309 = -1;
                                                                    }
                                                                    for (class35 var259 = (class35) field492.method3242(); var259 != null; var259 = (class35) field492.method3243()) {
                                                                        if ((long) var259.field785 < class104.method2616() / 1000L - 5L) {
                                                                            if (var259.field783 > 0) {
                                                                                class10.method1881(5, "", var259.field782 + class145.field2284);
                                                                            }
                                                                            if (var259.field783 == 0) {
                                                                                class10.method1881(5, "", var259.field782 + class145.field2285);
                                                                            }
                                                                            var259.method3370();
                                                                        }
                                                                    }
                                                                    field340++;
                                                                    if (field340 > 50) {
                                                                        field261.method2391(160);
                                                                    }
                                                                    try {
                                                                        if (Statics.field1794 != null && field261.field1823 > 0) {
                                                                            Statics.field1794.method2593(field261.field1828, 0, field261.field1823);
                                                                            field261.field1823 = 0;
                                                                            field340 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var261) {
                                                                        method496();
                                                                    }
                                                                    return;
                                                                }
                                                                var186 = var185.field3;
                                                                if (var186.field2525 < 0) {
                                                                    break;
                                                                }
                                                                var187 = class155.method1889(var186.field2608);
                                                            } while (var187 == null || var187.field2517 == null || var186.field2525 >= var187.field2517.length || var187.field2517[var186.field2525] != var186);
                                                            class33.method2560(var185);
                                                        }
                                                    }
                                                    var183 = var182.field3;
                                                    if (var183.field2525 < 0) {
                                                        break;
                                                    }
                                                    var184 = class155.method1889(var183.field2608);
                                                } while (var184 == null || var184.field2517 == null || var183.field2525 >= var184.field2517.length || var184.field2517[var183.field2525] != var183);
                                                class33.method2560(var182);
                                            }
                                        }
                                        var180 = var179.field3;
                                        if (var180.field2525 < 0) {
                                            break;
                                        }
                                        var181 = class155.method1889(var180.field2608);
                                    } while (var181 == null || var181.field2517 == null || var180.field2525 >= var181.field2517.length || var181.field2517[var180.field2525] != var180);
                                    class33.method2560(var179);
                                }
                            }
                        }
                    }
                }
            }
        } else if (field483 == 40 || field483 == 45) {
            method1884();
        }
    }

    @ObfuscatedName("client.f(B)V")
    public final void method174() {
        boolean var1 = class164.method2732();
        if (var1 && field314 && Statics.field69 != null) {
            Statics.field69.method998();
        }
        if (field2045) {
            class126.method829(Statics.field171);
            Canvas var2 = Statics.field171;
            var2.removeMouseListener(class129.field1993);
            var2.removeMouseMotionListener(class129.field1993);
            var2.removeFocusListener(class129.field1993);
            class129.field1992 = 0;
            if (Statics.field436 != null) {
                Statics.field436.method2447(Statics.field171);
            }
            this.method2619();
            class126.method2550(Statics.field171);
            Canvas var3 = Statics.field171;
            var3.addMouseListener(class129.field1993);
            var3.addMouseMotionListener(class129.field1993);
            var3.addFocusListener(class129.field1993);
            if (Statics.field436 != null) {
                Statics.field436.method2449(Statics.field171);
            }
        }
        if (field483 == 0) {
            class133.method529(class29.field650, class29.field651, (Color) null);
        } else if (field483 == 5) {
            Statics.method621(Statics.field1649, Statics.field58);
        } else if (field483 == 10 || field483 == 11) {
            Statics.method621(Statics.field1649, Statics.field58);
        } else if (field483 == 20) {
            Statics.method621(Statics.field1649, Statics.field58);
        } else if (field483 == 25) {
            if (field268 == 1) {
                if (field470 > field397) {
                    field397 = field470;
                }
                int var4 = (field397 * 50 - field470 * 50) / field397;
                method2488(class145.field2146 + class2.field24 + class2.field18 + var4 + "%" + class2.field31, false);
            } else if (field268 == 2) {
                if (field282 > field293) {
                    field293 = field282;
                }
                int var5 = (field293 * 50 - field282 * 50) / field293 + 50;
                method2488(class145.field2146 + class2.field24 + class2.field18 + var5 + "%" + class2.field31, false);
            } else {
                method2488(class145.field2146, false);
            }
        } else if (field483 == 30) {
            if (field387 != -1) {
                int var6 = field387;
                if (class155.method731(var6)) {
                    method479(Statics.field2552[var6], -1);
                }
            }
            for (int var7 = 0; var7 < field442; var7++) {
                if (field444[var7]) {
                    field371[var7] = true;
                }
                field446[var7] = field444[var7];
                field444[var7] = false;
            }
            field443 = field246;
            field386 = -1;
            field460 = -1;
            Statics.field2614 = null;
            if (field387 != -1) {
                field442 = 0;
                method2387(field387, 0, 0, 765, 503, 0, 0, -1);
            }
            class74.method1528();
            if (field378) {
                int var8 = Statics.field1904;
                int var9 = Statics.field2484;
                int var10 = Statics.field2510;
                int var11 = Statics.field624;
                int var12 = 6116423;
                class74.method1546(var8, var9, var10, var11, var12);
                class74.method1546(var8 + 1, var9 + 1, var10 - 2, 16, 0);
                class74.method1537(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
                Statics.field1649.method3505(class145.field2260, var8 + 3, var9 + 14, var12, -1);
                int var13 = class129.field1990;
                int var14 = class129.field1997;
                for (int var15 = 0; var15 < field379; var15++) {
                    int var16 = (field379 - 1 - var15) * 15 + var9 + 31;
                    int var17 = 16777215;
                    if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                        var17 = 16776960;
                    }
                    class205 var18 = Statics.field1649;
                    String var19;
                    if (field385[var15].length() > 0) {
                        var19 = field240[var15] + class145.field2297 + field385[var15];
                    } else {
                        var19 = field240[var15];
                    }
                    var18.method3505(var19, var8 + 3, var16, var17, 0);
                }
                method2(Statics.field1904, Statics.field2484, Statics.field2510, Statics.field624);
            } else if (field386 != -1) {
                method1987(field386, field460);
            }
            if (field445 == 3) {
                for (int var20 = 0; var20 < field442; var20++) {
                    if (field446[var20]) {
                        class74.method1534(field447[var20], field368[var20], field449[var20], field474[var20], 16711935, 128);
                    } else if (field371[var20]) {
                        class74.method1534(field447[var20], field368[var20], field449[var20], field474[var20], 16711680, 128);
                    }
                }
            }
            class21.method107(Statics.field2678, Statics.field216.field732, Statics.field216.field777, field360);
            field360 = 0;
        } else if (field483 == 40) {
            method2488(class145.field2211 + class2.field24 + class145.field2355, false);
        } else if (field483 == 45) {
            method2488(class145.field2316, false);
        }
        if (field483 == 30 && field445 == 0 && !field2034) {
            try {
                Graphics var21 = Statics.field171.getGraphics();
                for (int var22 = 0; var22 < field442; var22++) {
                    if (field371[var22]) {
                        Statics.field1830.method1374(var21, field447[var22], field368[var22], field449[var22], field474[var22]);
                        field371[var22] = false;
                    }
                }
            } catch (Exception var28) {
                Statics.field171.repaint();
            }
        } else if (field483 > 0) {
            try {
                Graphics var24 = Statics.field171.getGraphics();
                Statics.field1830.method1379(var24, 0, 0);
                field2034 = false;
                for (int var25 = 0; var25 < field442; var25++) {
                    field371[var25] = false;
                }
            } catch (Exception var27) {
                Statics.field171.repaint();
            }
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method450() {
        if (Statics.field2788 != null) {
            Statics.field2788.field168 = false;
        }
        Statics.field2788 = null;
        if (Statics.field1794 != null) {
            Statics.field1794.method2599();
            Statics.field1794 = null;
        }
        class126.method34();
        if (class129.field1993 != null) {
            class129 var1 = class129.field1993;
            synchronized (class129.field1993) {
                class129.field1993 = null;
            }
        }
        Statics.field436 = null;
        if (Statics.field69 != null) {
            Statics.field69.method996();
        }
        if (Statics.field2101 != null) {
            Statics.field2101.method996();
        }
        class153.method2442();
        class152.method2614();
        class138.method32();
    }

    @ObfuscatedName("client.p(I)V")
    public void method176() {
        if (field483 == 1000) {
            return;
        }
        long var1 = class104.method2616();
        int var3 = (int) (var1 - Statics.field2486);
        Statics.field2486 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2497 += var3;
        boolean var4;
        if (class153.field2502 == 0 && class153.field2490 == 0 && class153.field2493 == 0 && class153.field2492 == 0) {
            var4 = true;
        } else if (Statics.field1441 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2497 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2490 < 20 && class153.field2492 > 0) {
                        class154 var5 = (class154) class153.field2485.method3257();
                        class108 var6 = new class108(4);
                        var6.method2226(1);
                        var6.method2149((int) var5.field2886);
                        Statics.field1441.method2593(var6.field1828, 0, 4);
                        class153.field2489.method3260(var5, var5.field2886);
                        class153.field2492--;
                        class153.field2490++;
                    }
                    while (class153.field2502 < 20 && class153.field2493 > 0) {
                        class154 var7 = (class154) class153.field2491.method3344();
                        class108 var8 = new class108(4);
                        var8.method2226(0);
                        var8.method2149((int) var7.field2886);
                        Statics.field1441.method2593(var8.field1828, 0, 4);
                        var7.method3349();
                        class153.field2494.method3260(var7, var7.field2886);
                        class153.field2493--;
                        class153.field2502++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field1441.method2608();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2497 = 0;
                        byte var11 = 0;
                        if (Statics.field564 == null) {
                            var11 = 8;
                        } else if (class153.field2495 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2496.field1823;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field1441.method2594(class153.field2496.field1828, class153.field2496.field1823, var12);
                            if (class153.field2487 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2496.field1828[class153.field2496.field1823 + var13] ^= class153.field2487;
                                }
                            }
                            class153.field2496.field1823 += var12;
                            if (class153.field2496.field1823 < var11) {
                                break;
                            }
                            if (Statics.field564 == null) {
                                class153.field2496.field1823 = 0;
                                int var14 = class153.field2496.method2291();
                                int var15 = class153.field2496.method2163();
                                int var16 = class153.field2496.method2291();
                                int var17 = class153.field2496.method2297();
                                long var18 = (long) ((var14 << 16) + var15);
                                class154 var20 = (class154) class153.field2489.method3254(var18);
                                Statics.field1917 = true;
                                if (var20 == null) {
                                    var20 = (class154) class153.field2494.method3254(var18);
                                    Statics.field1917 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field564 = var20;
                                Statics.field1877 = new class108(var17 + var21 + Statics.field564.field2507);
                                Statics.field1877.method2226(var16);
                                Statics.field1877.method2150(var17);
                                class153.field2495 = 8;
                                class153.field2496.field1823 = 0;
                            } else if (class153.field2495 == 0) {
                                if (class153.field2496.field1828[0] == -1) {
                                    class153.field2495 = 1;
                                    class153.field2496.field1823 = 0;
                                } else {
                                    Statics.field564 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1877.field1828.length - Statics.field564.field2507;
                            int var23 = 512 - class153.field2495;
                            if (var23 > var22 - Statics.field1877.field1823) {
                                var23 = var22 - Statics.field1877.field1823;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field1441.method2594(Statics.field1877.field1828, Statics.field1877.field1823, var23);
                            if (class153.field2487 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1877.field1828[Statics.field1877.field1823 + var24] ^= class153.field2487;
                                }
                            }
                            Statics.field1877.field1823 += var23;
                            class153.field2495 += var23;
                            if (Statics.field1877.field1823 == var22) {
                                if (Statics.field564.field2886 == 16711935L) {
                                    Statics.field2899 = Statics.field1877;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class150 var26 = class153.field2499[var25];
                                        if (var26 != null) {
                                            Statics.field2899.field1823 = var25 * 8 + 5;
                                            int var27 = Statics.field2899.method2297();
                                            int var28 = Statics.field2899.method2297();
                                            var26.method2824(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2498.reset();
                                    class153.field2498.update(Statics.field1877.field1828, 0, var22);
                                    int var29 = (int) class153.field2498.getValue();
                                    if (Statics.field564.field2505 != var29) {
                                        try {
                                            Statics.field1441.method2599();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2501++;
                                        Statics.field1441 = null;
                                        class153.field2487 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2501 = 0;
                                    class153.field2500 = 0;
                                    Statics.field564.field2515.method2823((int) (Statics.field564.field2886 & 0xFFFFL), Statics.field1877.field1828, (Statics.field564.field2886 & 0xFF0000L) == 16711680L, Statics.field1917);
                                }
                                Statics.field564.method3375();
                                if (Statics.field1917) {
                                    class153.field2490--;
                                } else {
                                    class153.field2502--;
                                }
                                class153.field2495 = 0;
                                Statics.field564 = null;
                                Statics.field1877 = null;
                            } else {
                                if (class153.field2495 != 512) {
                                    break;
                                }
                                class153.field2495 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field1441.method2599();
                } catch (Exception var34) {
                }
                class153.field2500++;
                Statics.field1441 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method171();
        }
    }

    @ObfuscatedName("client.a(I)V")
    public void method171() {
        if (class153.field2501 >= 4) {
            this.method2627("js5crc");
            field483 = 1000;
            return;
        }
        if (class153.field2500 >= 4) {
            if (field483 <= 5) {
                this.method2627("js5io");
                field483 = 1000;
                return;
            }
            field381 = 3000;
            class153.field2500 = 3;
        }
        if (--field381 + 1 > 0) {
            return;
        }
        try {
            if (field265 == 0) {
                Statics.field1864 = Statics.field938.method2496(Statics.field218, Statics.field2945);
                field265++;
            }
            if (field265 == 1) {
                if (Statics.field1864.field2053 == 2) {
                    this.method178(-1);
                    return;
                }
                if (Statics.field1864.field2053 == 1) {
                    field265++;
                }
            }
            if (field265 == 2) {
                Statics.field2711 = new class132((Socket) Statics.field1864.field2057, Statics.field938);
                class108 var1 = new class108(5);
                var1.method2226(15);
                var1.method2150(68);
                Statics.field2711.method2593(var1.field1828, 0, 5);
                field265++;
                Statics.field1907 = class104.method2616();
            }
            if (field265 == 3) {
                if (field483 <= 5 || Statics.field2711.method2608() > 0) {
                    int var2 = Statics.field2711.method2596();
                    if (var2 != 0) {
                        this.method178(var2);
                        return;
                    }
                    field265++;
                } else if (class104.method2616() - Statics.field1907 > 30000L) {
                    this.method178(-2);
                    return;
                }
            }
            if (field265 == 4) {
                Statics.method2103(Statics.field2711, field483 > 20);
                Statics.field1864 = null;
                Statics.field2711 = null;
                field265 = 0;
                field267 = 0;
            }
        } catch (IOException var4) {
            this.method178(-3);
        }
    }

    @ObfuscatedName("client.o(IB)V")
    public void method178(int arg0) {
        Statics.field1864 = null;
        Statics.field2711 = null;
        field265 = 0;
        if (Statics.field2945 == Statics.field1265) {
            Statics.field2945 = Statics.field272;
        } else {
            Statics.field2945 = Statics.field1265;
        }
        field267++;
        if (field267 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field483 <= 5) {
                this.method2627("js5connect_full");
                field483 = 1000;
            } else {
                field381 = 3000;
            }
        } else if (field267 >= 2 && arg0 == 6) {
            this.method2627("js5connect_outofdate");
            field483 = 1000;
        } else if (field267 >= 4) {
            if (field483 <= 5) {
                this.method2627("js5connect");
                field483 = 1000;
            } else {
                field381 = 3000;
            }
        }
    }

    @ObfuscatedName("an.b(B)V")
    public static void method563() {
        if (field264 == 0) {
            Statics.field2514 = new class80(4, 104, 104, class6.field76);
            for (int var0 = 0; var0 < 4; var0++) {
                field329[var0] = new class209(104, 104);
            }
            Statics.field679 = new class73(512, 512);
            class29.field651 = class145.field2271;
            class29.field650 = 5;
            field264 = 20;
        } else if (field264 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1468[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1650(var1, 500, 800, 512, 334);
            class29.field651 = class145.field2190;
            class29.field650 = 10;
            field264 = 30;
        } else if (field264 == 30) {
            Statics.field2714 = method3632(0, false, true, true);
            Statics.field1986 = method3632(1, false, true, true);
            Statics.field2783 = method3632(2, true, false, true);
            Statics.field2836 = method3632(3, false, true, true);
            Statics.field608 = method3632(4, false, true, true);
            Statics.field188 = method3632(5, true, true, true);
            Statics.field565 = method3632(6, true, true, false);
            Statics.field177 = method3632(7, false, true, true);
            Statics.field717 = method3632(8, false, true, true);
            Statics.field207 = method3632(9, false, true, true);
            Statics.field161 = method3632(10, false, true, true);
            Statics.field1881 = method3632(11, false, true, true);
            Statics.field1553 = method3632(12, false, true, true);
            Statics.field61 = method3632(13, true, false, true);
            Statics.field1983 = method3632(14, false, true, false);
            Statics.field1982 = method3632(15, false, true, true);
            class29.field651 = class145.field2151;
            class29.field650 = 20;
            field264 = 40;
        } else if (field264 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2714.method2820() * 4 / 100;
            int var8 = var7 + Statics.field1986.method2820() * 4 / 100;
            int var9 = var8 + Statics.field2783.method2820() * 2 / 100;
            int var10 = var9 + Statics.field2836.method2820() * 2 / 100;
            int var11 = var10 + Statics.field608.method2820() * 6 / 100;
            int var12 = var11 + Statics.field188.method2820() * 4 / 100;
            int var13 = var12 + Statics.field565.method2820() * 2 / 100;
            int var14 = var13 + Statics.field177.method2820() * 60 / 100;
            int var15 = var14 + Statics.field717.method2820() * 2 / 100;
            int var16 = var15 + Statics.field207.method2820() * 2 / 100;
            int var17 = var16 + Statics.field161.method2820() * 2 / 100;
            int var18 = var17 + Statics.field1881.method2820() * 2 / 100;
            int var19 = var18 + Statics.field1553.method2820() * 2 / 100;
            int var20 = var19 + Statics.field61.method2820() * 2 / 100;
            int var21 = var20 + Statics.field1983.method2820() * 2 / 100;
            int var22 = var21 + Statics.field1982.method2820() * 2 / 100;
            if (var22 == 100) {
                class29.field651 = class145.field2153;
                class29.field650 = 30;
                field264 = 45;
            } else {
                if (var22 != 0) {
                    class29.field651 = class145.field2152 + var22 + "%";
                }
                class29.field650 = 30;
            }
        } else if (field264 == 45) {
            boolean var23 = !field242;
            Statics.field1086 = 22050;
            Statics.field2900 = var23;
            Statics.field1070 = 2;
            class165 var24 = new class165();
            var24.method3110(9, 128);
            Statics.field69 = class51.method571(Statics.field938, Statics.field171, 0, 22050);
            Statics.field69.method997(var24);
            class150 var25 = Statics.field1982;
            class150 var26 = Statics.field1983;
            class150 var27 = Statics.field608;
            Statics.field2709 = var25;
            Statics.field2713 = var26;
            Statics.field2703 = var27;
            Statics.field2704 = var24;
            Statics.field2101 = class51.method571(Statics.field938, Statics.field171, 1, 2048);
            Statics.field1275 = new class50();
            Statics.field2101.method997(Statics.field1275);
            Statics.field1803 = new class69(22050, Statics.field1086);
            class29.field651 = class145.field2154;
            class29.field650 = 35;
            field264 = 50;
        } else if (field264 == 50) {
            int var28 = 0;
            if (Statics.field58 == null) {
                Statics.field58 = Statics.method532(Statics.field717, Statics.field61, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field499 == null) {
                Statics.field499 = Statics.method532(Statics.field717, Statics.field61, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1649 == null) {
                Statics.field1649 = Statics.method532(Statics.field717, Statics.field61, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class29.field651 = class145.field2253 + var28 * 100 / 3 + "%";
                class29.field650 = 40;
            } else {
                Statics.field2099 = new class148(true);
                class29.field651 = class145.field2156;
                class29.field650 = 40;
                field264 = 60;
            }
        } else if (field264 == 60) {
            class150 var29 = Statics.field161;
            class150 var30 = Statics.field717;
            int var31 = 0;
            if (var29.method2767("title.jpg", "")) {
                var31++;
            }
            if (var30.method2767("logo", "")) {
                var31++;
            }
            if (var30.method2767("titlebox", "")) {
                var31++;
            }
            if (var30.method2767("titlebutton", "")) {
                var31++;
            }
            if (var30.method2767("runes", "")) {
                var31++;
            }
            if (var30.method2767("title_mute", "")) {
                var31++;
            }
            if (var30.method2768("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method2768("options_radio_buttons,2")) {
                var31++;
            }
            var30.method2767("sl_back", "");
            var30.method2767("sl_flags", "");
            var30.method2767("sl_arrows", "");
            var30.method2767("sl_stars", "");
            var30.method2767("sl_button", "");
            int var34 = class29.method1991();
            if (var31 < var34) {
                class29.field651 = class145.field2157 + var31 * 100 / var34 + "%";
                class29.field650 = 50;
            } else {
                class29.field651 = class145.field2158;
                class29.field650 = 50;
                Statics.method2388(5);
                field264 = 70;
            }
        } else if (field264 == 70) {
            if (Statics.field2783.method2787()) {
                class42.method620(Statics.field2783);
                class150 var35 = Statics.field2783;
                Statics.field896 = var35;
                class41.method455(Statics.field2783, Statics.field177);
                class150 var36 = Statics.field2783;
                class150 var37 = Statics.field177;
                boolean var38 = field242;
                Statics.field830 = var36;
                Statics.field849 = var37;
                class37.field877 = var38;
                class150 var39 = Statics.field2783;
                class150 var40 = Statics.field177;
                Statics.field796 = var39;
                Statics.field789 = var40;
                class46.method456(Statics.field2783, Statics.field177, field437, Statics.field58);
                class150 var41 = Statics.field2783;
                class150 var42 = Statics.field2714;
                class150 var43 = Statics.field1986;
                Statics.field918 = var41;
                Statics.field910 = var42;
                Statics.field899 = var43;
                class40.method126(Statics.field2783, Statics.field177);
                class150 var44 = Statics.field2783;
                Statics.field977 = var44;
                class150 var45 = Statics.field2783;
                Statics.field1055 = var45;
                Statics.field1060 = Statics.field1055.method2799(16);
                class150 var46 = Statics.field2836;
                class150 var47 = Statics.field177;
                class150 var48 = Statics.field717;
                class150 var49 = Statics.field61;
                Statics.field2018 = var46;
                Statics.field2518 = var47;
                Statics.field1800 = var48;
                Statics.field1511 = var49;
                Statics.field2552 = new class155[Statics.field2018.method2760()][];
                Statics.field1971 = new boolean[Statics.field2018.method2760()];
                class45.method454(Statics.field2783);
                class150 var50 = Statics.field2783;
                Statics.field992 = var50;
                class29.field651 = class145.field2160;
                class29.field650 = 60;
                field264 = 80;
            } else {
                class29.field651 = class145.field2192 + Statics.field2783.method2821() + "%";
                class29.field650 = 60;
            }
        } else if (field264 == 80) {
            int var51 = 0;
            if (Statics.field312 == null) {
                Statics.field312 = class71.method1887(Statics.field717, "compass", "");
            } else {
                var51++;
            }
            if (Statics.field1979 == null) {
                Statics.field1979 = class71.method1887(Statics.field717, "mapedge", "");
            } else {
                var51++;
            }
            if (Statics.field1502 == null) {
                Statics.field1502 = class71.method836(Statics.field717, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field202 == null) {
                Statics.field202 = class71.method817(Statics.field717, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field1931 == null) {
                Statics.field1931 = class71.method817(Statics.field717, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field2087 == null) {
                Statics.field2087 = class71.method817(Statics.field717, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field1903 == null) {
                Statics.field1903 = class71.method817(Statics.field717, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field131 == null) {
                Statics.field131 = class71.method817(Statics.field717, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field1552 == null) {
                Statics.field1552 = class71.method817(Statics.field717, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field1057 == null) {
                Statics.field1057 = class71.method817(Statics.field717, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field890 == null) {
                Statics.field890 = class71.method817(Statics.field717, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field508 == null) {
                Statics.field508 = class71.method836(Statics.field717, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field683 == null) {
                Statics.field683 = class71.method836(Statics.field717, "mod_icons", "");
            } else {
                var51++;
            }
            if (Statics.field87 == null) {
                Statics.field87 = class71.method2082(Statics.field717, "mapback", "");
            } else {
                var51++;
            }
            if (var51 < 14) {
                class29.field651 = class145.field2147 + var51 * 100 / 14 + "%";
                class29.field650 = 70;
            } else {
                Statics.field2972 = Statics.field683;
                Statics.field1979.method1434();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                for (int var56 = 0; var56 < Statics.field202.length; var56++) {
                    Statics.field202[var56].method1468(var52 + var55, var53 + var55, var54 + var55);
                }
                Statics.field1502[0].method1593(var52 + var55, var53 + var55, var54 + var55);
                Statics.field13 = new int[33];
                Statics.field618 = new int[33];
                Statics.field2031 = new int[151];
                Statics.field2842 = new int[151];
                for (int var57 = 0; var57 < 33; var57++) {
                    int var58 = 999;
                    int var59 = 0;
                    for (int var60 = 0; var60 < 34; var60++) {
                        if (Statics.field87.field1309[Statics.field87.field1308 * var57 + var60] == 0) {
                            if (var58 == 999) {
                                var58 = var60;
                            }
                        } else if (var58 != 999) {
                            var59 = var60;
                            break;
                        }
                    }
                    Statics.field13[var57] = var58;
                    Statics.field618[var57] = var59 - var58;
                }
                for (int var61 = 5; var61 < 156; var61++) {
                    int var62 = 999;
                    int var63 = 0;
                    for (int var64 = 25; var64 < 172; var64++) {
                        if (Statics.field87.field1309[Statics.field87.field1308 * var61 + var64] == 0 && var64 > 34 || var61 > 34) {
                            if (var62 == 999) {
                                var62 = var64;
                            }
                        } else if (var62 != 999) {
                            var63 = var64;
                            break;
                        }
                    }
                    Statics.field2031[var61 - 5] = var62 - 25;
                    Statics.field2842[var61 - 5] = var63 - var62;
                }
                class29.field651 = class145.field2162;
                class29.field650 = 70;
                field264 = 90;
            }
        } else if (field264 == 90) {
            if (Statics.field207.method2787()) {
                class89 var65 = new class89(Statics.field207, Statics.field717, 20, 0.8D, field242 ? 64 : 128);
                class85.method1791(var65);
                class85.method1818(0.8D);
                class29.field651 = class145.field2310;
                class29.field650 = 90;
                field264 = 110;
            } else {
                class29.field651 = class145.field2163 + Statics.field207.method2821() + "%";
                class29.field650 = 90;
            }
        } else if (field264 == 110) {
            Statics.field2788 = new class12();
            Statics.field938.method2497(Statics.field2788, 10);
            class29.field651 = class145.field2165;
            class29.field650 = 94;
            field264 = 120;
        } else if (field264 == 120) {
            if (Statics.field161.method2767("huffman", "")) {
                class103 var66 = new class103(Statics.field161.method2798("huffman", ""));
                class203.method2436(var66);
                class29.field651 = class145.field2167;
                class29.field650 = 96;
                field264 = 130;
            } else {
                class29.field651 = class145.field2166 + "%";
                class29.field650 = 96;
            }
        } else if (field264 == 130) {
            if (!Statics.field2836.method2787()) {
                class29.field651 = class145.field2168 + Statics.field2836.method2821() * 4 / 5 + "%";
                class29.field650 = 100;
            } else if (!Statics.field1553.method2787()) {
                class29.field651 = class145.field2168 + (80 + Statics.field1553.method2821() / 6) + "%";
                class29.field650 = 100;
            } else if (Statics.field61.method2787()) {
                class29.field651 = class145.field2169;
                class29.field650 = 100;
                field264 = 140;
            } else {
                class29.field651 = class145.field2168 + (96 + Statics.field61.method2821() / 20) + "%";
                class29.field650 = 100;
            }
        } else if (field264 == 140) {
            Statics.method2388(10);
        }
    }

    @ObfuscatedName("gp.r(IZZZI)Lex;")
    public static class150 method3632(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class123 var4 = null;
        if (class138.field2075 != null) {
            var4 = new class123(arg0, class138.field2075, Statics.field1973[arg0], 1000000);
        }
        return new class150(var4, Statics.field525, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cn.z(I)V")
    public static final void method1884() {
        try {
            if (field248 == 0) {
                if (Statics.field1794 != null) {
                    Statics.field1794.method2599();
                    Statics.field1794 = null;
                }
                Statics.field2124 = null;
                field287 = false;
                field402 = 0;
                field248 = 1;
            }
            if (field248 == 1) {
                if (Statics.field2124 == null) {
                    Statics.field2124 = Statics.field938.method2496(Statics.field218, Statics.field2945);
                }
                if (Statics.field2124.field2053 == 2) {
                    throw new IOException();
                }
                if (Statics.field2124.field2053 == 1) {
                    Statics.field1794 = new class132((Socket) Statics.field2124.field2057, Statics.field938);
                    Statics.field2124 = null;
                    field248 = 2;
                }
            }
            if (field248 == 2) {
                field261.field1823 = 0;
                field261.method2226(14);
                Statics.field1794.method2593(field261.field1828, 0, 1);
                field278.field1823 = 0;
                field248 = 3;
            }
            if (field248 == 3) {
                if (Statics.field69 != null) {
                    Statics.field69.method1003();
                }
                if (Statics.field2101 != null) {
                    Statics.field2101.method1003();
                }
                int var0 = Statics.field1794.method2596();
                if (Statics.field69 != null) {
                    Statics.field69.method1003();
                }
                if (Statics.field2101 != null) {
                    Statics.field2101.method1003();
                }
                if (var0 != 0) {
                    method1057(var0);
                    return;
                }
                field278.field1823 = 0;
                field248 = 5;
            }
            if (field248 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field261.field1823 = 0;
                field261.method2226(1);
                field261.method2226(class29.field638.method452());
                field261.method2150(var1[0]);
                field261.method2150(var1[1]);
                field261.method2150(var1[2]);
                field261.method2150(var1[3]);
                switch(class29.field638.field2398) {
                    case 0:
                    case 1:
                        field261.method2149(Statics.field600);
                        field261.field1823 += 5;
                        break;
                    case 2:
                        field261.field1823 += 8;
                        break;
                    case 3:
                        field261.method2150((Integer) Statics.field1773.field138.get(class211.method709(class29.field656)));
                        field261.field1823 += 4;
                }
                field261.method2152(class29.field671);
                field261.method2195(class5.field68, class5.field63);
                field383.field1823 = 0;
                if (field483 == 40) {
                    field383.method2226(18);
                } else {
                    field383.method2226(16);
                }
                field383.method2148(0);
                int var2 = field383.field1823;
                field383.method2150(68);
                field383.method2155(field261.field1828, 0, field261.field1823);
                int var3 = field383.field1823;
                field383.method2152(class29.field656);
                field383.method2226(field242 ? 1 : 0);
                class138.method2501(field383);
                class108 var4 = new class108(Statics.field2099.method2746());
                Statics.field2099.method2735(var4);
                field383.method2155(var4.field1828, 0, var4.field1828.length);
                field383.method2150(Statics.field2714.field2453);
                field383.method2150(Statics.field1986.field2453);
                field383.method2150(Statics.field2783.field2453);
                field383.method2150(Statics.field2836.field2453);
                field383.method2150(Statics.field608.field2453);
                field383.method2150(Statics.field188.field2453);
                field383.method2150(Statics.field565.field2453);
                field383.method2150(Statics.field177.field2453);
                field383.method2150(Statics.field717.field2453);
                field383.method2150(Statics.field207.field2453);
                field383.method2150(Statics.field161.field2453);
                field383.method2150(Statics.field1881.field2453);
                field383.method2150(Statics.field1553.field2453);
                field383.method2150(Statics.field61.field2453);
                field383.method2150(Statics.field1983.field2453);
                field383.method2150(Statics.field1982.field2453);
                field383.method2176(var1, var3, field383.field1823);
                field383.method2157(field383.field1823 - var2);
                Statics.field1794.method2593(field383.field1828, 0, field383.field1823);
                field261.method2382(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field278.method2382(var1);
                field248 = 6;
            }
            if (field248 == 6 && Statics.field1794.method2608() > 0) {
                int var6 = Statics.field1794.method2596();
                if (var6 == 21 && field483 == 20) {
                    field248 = 7;
                } else if (var6 == 2) {
                    field248 = 9;
                } else if (var6 == 15 && field483 == 40) {
                    Statics.method2696();
                    return;
                } else if (var6 == 23 && field374 < 1) {
                    field374++;
                    field248 = 0;
                } else {
                    method1057(var6);
                    return;
                }
            }
            if (field248 == 7 && Statics.field1794.method2608() > 0) {
                field271 = (Statics.field1794.method2596() + 3) * 60;
                field248 = 8;
            }
            if (field248 == 8) {
                field402 = 0;
                class29.method599(class145.field2173, class145.field2174, field271 / 60 + class145.field2175);
                if (--field271 <= 0) {
                    field248 = 0;
                }
            } else {
                if (field248 == 9 && Statics.field1794.method2608() >= 13) {
                    boolean var7 = Statics.field1794.method2596() == 1;
                    Statics.field1794.method2594(field278.field1828, 0, 4);
                    field278.field1823 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field278.method2402() << 24;
                        int var10 = var9 | field278.method2402() << 16;
                        int var11 = var10 | field278.method2402() << 8;
                        int var12 = var11 | field278.method2402();
                        int var13 = class211.method709(class29.field656);
                        if (Statics.field1773.field138.size() >= 10 && !Statics.field1773.field138.containsKey(var13)) {
                            Iterator var14 = Statics.field1773.field138.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1773.field138.put(var13, var12);
                        class9.method690();
                    }
                    field404 = Statics.field1794.method2596();
                    field406 = Statics.field1794.method2596() == 1;
                    field361 = Statics.field1794.method2596();
                    field361 <<= 0x8;
                    field361 += Statics.field1794.method2596();
                    field362 = Statics.field1794.method2596();
                    Statics.field1794.method2594(field278.field1828, 0, 1);
                    field278.field1823 = 0;
                    field410 = field278.method2402();
                    Statics.field1794.method2594(field278.field1828, 0, 2);
                    field278.field1823 = 0;
                    field279 = field278.method2163();
                    if (field362 == 1) {
                        try {
                            client var15 = Statics.field2913;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var21) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field2913;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var20) {
                        }
                    }
                    field248 = 10;
                }
                if (field248 != 10) {
                    field402++;
                    if (field402 > 2000) {
                        if (field374 < 1) {
                            if (Statics.field2945 == Statics.field1265) {
                                Statics.field2945 = Statics.field272;
                            } else {
                                Statics.field2945 = Statics.field1265;
                            }
                            field374++;
                            field248 = 0;
                        } else {
                            method1057(-3);
                        }
                    }
                } else if (Statics.field1794.method2608() >= field279) {
                    field278.field1823 = 0;
                    Statics.field1794.method2594(field278.field1828, 0, field279);
                    method120();
                    Statics.field2016 = -1;
                    method2738(false);
                    field410 = -1;
                }
            }
        } catch (IOException var22) {
            if (field374 < 1) {
                if (Statics.field2945 == Statics.field1265) {
                    Statics.field2945 = Statics.field272;
                } else {
                    Statics.field2945 = Statics.field1265;
                }
                field374++;
                field248 = 0;
            } else {
                method1057(-2);
            }
        }
    }

    @ObfuscatedName("n.u(B)V")
    public static void method120() {
        field247 = 1L;
        field250 = -1;
        Statics.field2788.field167 = 0;
        Statics.field1804 = true;
        field284 = true;
        field393 = -1L;
        class192.method35();
        field261.field1823 = 0;
        field278.field1823 = 0;
        field410 = -1;
        field301 = -1;
        field285 = -1;
        field286 = -1;
        field281 = 0;
        field253 = 0;
        field283 = 0;
        field254 = 0;
        field379 = 0;
        field378 = false;
        class129.method457(0);
        class10.method2086();
        field390 = 0;
        field392 = false;
        field477 = 0;
        field299 = (int) (Math.random() * 100.0D) - 50;
        field494 = (int) (Math.random() * 110.0D) - 55;
        field303 = (int) (Math.random() * 80.0D) - 40;
        field306 = (int) (Math.random() * 120.0D) - 60;
        field308 = (int) (Math.random() * 30.0D) - 20;
        field320 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field471 = 0;
        field464 = -1;
        field469 = 0;
        field490 = 0;
        field291 = class18.field510;
        field356 = 0;
        field274 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field355[var0] = null;
            field235[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field273[var1] = null;
        }
        Statics.field216 = field355[2047] = new class3();
        field369 = -1;
        field372.method3276();
        field373.method3276();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field370[var2][var3][var4] = null;
                }
            }
        }
        field294 = new class180();
        field419 = 0;
        field489 = 0;
        field358 = 0;
        for (int var5 = 0; var5 < Statics.field1060; var5++) {
            class47 var6 = class47.method2419(var5);
            if (var6 != null) {
                class157.field2654[var5] = 0;
                class157.field2655[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field434.length; var7++) {
            field434[var7] = -1;
        }
        field405 = -1;
        if (field387 != -1) {
            class155.method493(field387);
        }
        for (class4 var8 = (class4) field398.method3257(); var8 != null; var8 = (class4) field398.method3258()) {
            method2415(var8, true);
        }
        field387 = -1;
        field398 = new class177(8);
        field429 = null;
        field378 = false;
        field379 = 0;
        field500.method2971((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field366[var9] = null;
            field367[var9] = false;
        }
        class14.field180 = new class177(32);
        field245 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field444[var10] = true;
        }
        field427 = null;
        Statics.field1050 = 0;
        Statics.field2065 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            field498[var11] = new class201();
        }
        Statics.field2513 = null;
    }

    @ObfuscatedName("bl.i(IB)V")
    public static void method1057(int arg0) {
        if (arg0 == -3) {
            class29.method599(class145.field2313, class145.field2177, class145.field2178);
        } else if (arg0 == -2) {
            class29.method599(class145.field2179, class145.field2180, class145.field2181);
        } else if (arg0 == -1) {
            class29.method599(class145.field2182, class145.field2183, class145.field2184);
        } else if (arg0 == 3) {
            class29.method599(class145.field2185, class145.field2298, class145.field2187);
        } else if (arg0 == 4) {
            class29.method599(class145.field2155, class145.field2352, class145.field2382);
        } else if (arg0 == 5) {
            class29.method599(class145.field2191, class145.field2303, class145.field2193);
        } else if (arg0 == 6) {
            class29.method599(class145.field2354, class145.field2195, class145.field2321);
        } else if (arg0 == 7) {
            class29.method599(class145.field2197, class145.field2198, class145.field2199);
        } else if (arg0 == 8) {
            class29.method599(class145.field2141, class145.field2238, class145.field2202);
        } else if (arg0 == 9) {
            class29.method599(class145.field2203, class145.field2196, class145.field2205);
        } else if (arg0 == 10) {
            class29.method599(class145.field2206, class145.field2207, class145.field2208);
        } else if (arg0 == 11) {
            class29.method599(class145.field2209, class145.field2296, class145.field2308);
        } else if (arg0 == 12) {
            class29.method599(class145.field2212, class145.field2213, class145.field2161);
        } else if (arg0 == 13) {
            class29.method599(class145.field2215, class145.field2216, class145.field2217);
        } else if (arg0 == 14) {
            class29.method599(class145.field2218, class145.field2219, class145.field2220);
        } else if (arg0 == 16) {
            class29.method599(class145.field2221, class145.field2256, class145.field2246);
        } else if (arg0 == 17) {
            class29.method599(class145.field2301, class145.field2225, class145.field2226);
        } else if (arg0 == 18) {
            class29.method599(class145.field2309, class145.field2228, class145.field2159);
        } else if (arg0 == 19) {
            class29.method599(class145.field2369, class145.field2231, class145.field2232);
        } else if (arg0 == 20) {
            class29.method599(class145.field2233, class145.field2380, class145.field2235);
        } else if (arg0 == 22) {
            class29.method599(class145.field2236, class145.field2237, class145.field2264);
        } else if (arg0 == 23) {
            class29.method599(class145.field2239, class145.field2240, class145.field2339);
        } else if (arg0 == 24) {
            class29.method599(class145.field2311, class145.field2323, class145.field2244);
        } else if (arg0 == 25) {
            class29.method599(class145.field2245, class145.field2373, class145.field2254);
        } else if (arg0 == 26) {
            class29.method599(class145.field2248, class145.field2249, class145.field2243);
        } else if (arg0 == 27) {
            class29.method599(class145.field2251, class145.field2252, class145.field2200);
        } else if (arg0 == 31) {
            class29.method599(class145.field2149, class145.field2370, class145.field2262);
        } else if (arg0 == 32) {
            class29.method599(class145.field2329, class145.field2164, class145.field2265);
        } else if (arg0 == 37) {
            class29.method599(class145.field2304, class145.field2267, class145.field2268);
        } else if (arg0 == 38) {
            class29.method599(class145.field2351, class145.field2270, class145.field2324);
        } else if (arg0 == 55) {
            class29.method599(class145.field2148, class145.field2273, class145.field2294);
        } else if (arg0 == 56) {
            class29.method599(class145.field2275, class145.field2276, class145.field2201);
            Statics.method2388(11);
            return;
        } else if (arg0 == 57) {
            class29.method599(class145.field2278, class145.field2279, class145.field2280);
            Statics.method2388(11);
            return;
        } else {
            class29.method599(class145.field2281, class145.field2282, class145.field2283);
        }
        Statics.method2388(10);
    }

    @ObfuscatedName("ab.h(B)V")
    public static final void method900() {
        class42.method467();
        class38.field882.method3214();
        Statics.method475();
        class37.field832.method3214();
        class37.field833.method3214();
        class37.field834.method3214();
        class37.field839.method3214();
        class36.field803.method3214();
        class36.field791.method3214();
        class46.method105();
        class39.field900.method3214();
        class39.field898.method3214();
        class40.field925.method3214();
        class40.field921.method3214();
        class43.method462();
        class47.field1059.method3214();
        class160.method1428();
        class155.field2612.method3214();
        class155.field2520.method3214();
        class155.field2565.method3214();
        ((class89) Statics.field1465).method1869();
        class19.field524.method3214();
        Statics.field2714.method2762();
        Statics.field1986.method2762();
        Statics.field2836.method2762();
        Statics.field608.method2762();
        Statics.field188.method2762();
        Statics.field565.method2762();
        Statics.field177.method2762();
        Statics.field717.method2762();
        Statics.field207.method2762();
        Statics.field161.method2762();
        Statics.field1881.method2762();
        Statics.field1553.method2762();
    }

    @ObfuscatedName("k.k(I)V")
    public static final void method496() {
        if (field283 > 0) {
            Statics.method2100();
        } else {
            Statics.method2388(40);
            Statics.field118 = Statics.field1794;
            Statics.field1794 = null;
        }
    }

    @ObfuscatedName("et.v(B)V")
    public static final void method2730() {
        if (Statics.field2101 != null) {
            Statics.field2101.method981();
        }
        if (Statics.field69 != null) {
            Statics.field69.method981();
        }
    }

    @ObfuscatedName("z.m(B)V")
    public static final void method164() {
        for (int var0 = 0; var0 < field477; var0++) {
            int var10002 = field472[var0]--;
            if (field472[var0] >= -10) {
                class53 var2 = field482[var0];
                if (var2 == null) {
                    class53 var10000 = (class53) null;
                    var2 = class53.method1027(Statics.field608, field478[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field472[var0] += var2.method1033();
                    field482[var0] = var2;
                }
                if (field472[var0] < 0) {
                    int var9;
                    if (field481[var0] == 0) {
                        var9 = field475;
                    } else {
                        int var3 = (field481[var0] & 0xFF) * 128;
                        int var4 = field481[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field216.field732;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field481[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field216.field777;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field472[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field476 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class57 var10 = var2.method1029().method1068(Statics.field1803);
                        class59 var11 = class59.method1108(var10, 100, var9);
                        var11.method1094(field479[var0] - 1);
                        Statics.field1275.method957(var11);
                    }
                    field472[var0] = -100;
                }
            } else {
                field477--;
                for (int var1 = var0; var1 < field477; var1++) {
                    field478[var1] = field478[var1 + 1];
                    field482[var1] = field482[var1 + 1];
                    field479[var1] = field479[var1 + 1];
                    field472[var1] = field472[var1 + 1];
                    field481[var1] = field481[var1 + 1];
                }
                var0--;
            }
        }
        if (field314 && !class164.method1985()) {
            if (field292 != 0 && field276 != -1) {
                class164.method2101(Statics.field565, field276, 0, field292, false);
            }
            field314 = false;
        }
    }

    @ObfuscatedName("ca.d(Laf;IIIB)V")
    public static void method2083(class39 arg0, int arg1, int arg2, int arg3) {
        if (field477 >= 50 || field476 == 0 || arg0.field897 == null || arg1 >= arg0.field897.length) {
            return;
        }
        int var4 = arg0.field897[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field478[field477] = var5;
        field479[field477] = var6;
        field472[field477] = 0;
        field482[field477] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field481[field477] = (var8 << 16) + (var9 << 8) + var7;
        field477++;
    }

    @ObfuscatedName("ad.q(B)V")
    public static final void method575() {
        if (field242 && Statics.field2678 != field289) {
            method2426(Statics.field2016, Statics.field1092, Statics.field2678, Statics.field216.field749[0], Statics.field216.field774[0]);
        } else if (Statics.field2678 != field464) {
            field464 = Statics.field2678;
            method30(Statics.field2678);
        }
    }

    @ObfuscatedName("dd.ak(III)V")
    public static final void method2491(int arg0, int arg1) {
        if (field471 != 0 && field471 != 3 || class129.field2002 != 1 && Statics.field1985 || class129.field2002 != 4) {
            return;
        }
        int var2 = class129.field1996 - 25 - arg0;
        int var3 = class129.field2004 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field320 + field306 & 0x7FF;
        int var5 = class85.field1468[var4];
        int var6 = class85.field1469[var4];
        int var7 = (field308 + 256) * var5 >> 8;
        int var8 = (field308 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field216.field732 + var9 >> 7;
        int var12 = Statics.field216.field777 - var10 >> 7;
        field261.method2391(161);
        field261.method2226(18);
        field261.method2189(Statics.field183 + var11);
        field261.method2226(class126.field1958[82] ? (class126.field1958[81] ? 2 : 1) : 0);
        field261.method2191(Statics.field780 + var12);
        field261.method2226(var2);
        field261.method2226(var3);
        field261.method2148(field320);
        field261.method2226(57);
        field261.method2226(field306);
        field261.method2226(field308);
        field261.method2226(89);
        field261.method2148(Statics.field216.field732);
        field261.method2148(Statics.field216.field777);
        field261.method2226(63);
        field469 = var11;
        field490 = var12;
    }

    @ObfuscatedName("af.ah(I)V")
    public static final void method735() {
        for (int var0 = -1; var0 < field356; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field280[var0];
            }
            class3 var2 = field355[var1];
            if (var2 != null && var2.field735 > 0) {
                var2.field735--;
                if (var2.field735 == 0) {
                    var2.field750 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field274; var3++) {
            int var4 = field423[var3];
            class31 var5 = field273[var4];
            if (var5 != null && var5.field735 > 0) {
                var5.field735--;
                if (var5.field735 == 0) {
                    var5.field750 = null;
                }
            }
        }
    }

    @ObfuscatedName("df.an(Ljava/lang/String;B)V")
    public static final void method2434(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1773.field136 = !Statics.field1773.field136;
            class9.method690();
            if (Statics.field1773.field136) {
                class10.method1881(99, "", "Roofs are now all hidden");
            } else {
                class10.method1881(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field404 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field252 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field252 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method496();
            }
            if (arg0.equalsIgnoreCase("errortest") && field430 == 2) {
                throw new RuntimeException();
            }
        }
        field261.method2391(242);
        field261.method2226(arg0.length() + 1);
        field261.method2152(arg0);
    }

    @ObfuscatedName("b.aw(I)V")
    public static final void method158() {
        for (int var0 = 0; var0 < field274; var0++) {
            int var1 = field423[var0];
            class31 var2 = field273[var1];
            if (var2 != null) {
                method163(var2, var2.field687.field794);
            }
        }
    }

    @ObfuscatedName("z.az(Laa;II)V")
    public static final void method163(class34 arg0, int arg1) {
        if (arg0.field729 > field246) {
            int var2 = arg0.field729 - field246;
            int var3 = arg0.field746 * 128 + arg0.field743 * 64;
            int var4 = arg0.field762 * 128 + arg0.field743 * 64;
            arg0.field732 += (var3 - arg0.field732) / var2;
            arg0.field777 += (var4 - arg0.field777) / var2;
            arg0.field776 = 0;
            if (arg0.field758 == 0) {
                arg0.field737 = 1024;
            }
            if (arg0.field758 == 1) {
                arg0.field737 = 1536;
            }
            if (arg0.field758 == 2) {
                arg0.field737 = 0;
            }
            if (arg0.field758 == 3) {
                arg0.field737 = 512;
            }
        } else if (arg0.field765 >= field246) {
            if (field246 == arg0.field765 || arg0.field760 == -1 || arg0.field753 != 0 || arg0.field752 + 1 > class39.method821(arg0.field760).field904[arg0.field751]) {
                int var5 = arg0.field765 - arg0.field729;
                int var6 = field246 - arg0.field729;
                int var7 = arg0.field746 * 128 + arg0.field743 * 64;
                int var8 = arg0.field762 * 128 + arg0.field743 * 64;
                int var9 = arg0.field761 * 128 + arg0.field743 * 64;
                int var10 = arg0.field757 * 128 + arg0.field743 * 64;
                arg0.field732 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field777 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field776 = 0;
            if (arg0.field758 == 0) {
                arg0.field737 = 1024;
            }
            if (arg0.field758 == 1) {
                arg0.field737 = 1536;
            }
            if (arg0.field758 == 2) {
                arg0.field737 = 0;
            }
            if (arg0.field758 == 3) {
                arg0.field737 = 512;
            }
            arg0.field721 = arg0.field737;
        } else {
            arg0.field728 = arg0.field724;
            if (arg0.field772 == 0) {
                arg0.field776 = 0;
            } else {
                label359: {
                    if (arg0.field760 != -1 && arg0.field753 == 0) {
                        class39 var11 = class39.method821(arg0.field760);
                        if (arg0.field766 > 0 && var11.field913 == 0) {
                            arg0.field776++;
                            break label359;
                        }
                        if (arg0.field766 <= 0 && var11.field914 == 0) {
                            arg0.field776++;
                            break label359;
                        }
                    }
                    int var12 = arg0.field732;
                    int var13 = arg0.field777;
                    int var14 = arg0.field749[arg0.field772 - 1] * 128 + arg0.field743 * 64;
                    int var15 = arg0.field774[arg0.field772 - 1] * 128 + arg0.field743 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field737 = 1280;
                            } else if (var13 > var15) {
                                arg0.field737 = 1792;
                            } else {
                                arg0.field737 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field737 = 768;
                            } else if (var13 > var15) {
                                arg0.field737 = 256;
                            } else {
                                arg0.field737 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field737 = 1024;
                        } else if (var13 > var15) {
                            arg0.field737 = 0;
                        }
                        int var16 = arg0.field737 - arg0.field721 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field763;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field722;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field730;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field773;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field722;
                        }
                        arg0.field728 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class31) {
                            var19 = ((class31) arg0).field687.field822;
                        }
                        if (var19) {
                            if (arg0.field737 != arg0.field721 && arg0.field744 == -1 && arg0.field771 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field772 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field772 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field776 > 0 && arg0.field772 > 1) {
                                var18 = 8;
                                arg0.field776--;
                            }
                        } else {
                            if (arg0.field772 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field772 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field776 > 0 && arg0.field772 > 1) {
                                var18 = 8;
                                arg0.field776--;
                            }
                        }
                        if (arg0.field734[arg0.field772 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field728 == arg0.field722 && arg0.field731 != -1) {
                            arg0.field728 = arg0.field731;
                        }
                        if (var12 < var14) {
                            arg0.field732 += var18;
                            if (arg0.field732 > var14) {
                                arg0.field732 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field732 -= var18;
                            if (arg0.field732 < var14) {
                                arg0.field732 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field777 += var18;
                            if (arg0.field777 > var15) {
                                arg0.field777 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field777 -= var18;
                            if (arg0.field777 < var15) {
                                arg0.field777 = var15;
                            }
                        }
                        if (arg0.field732 == var14 && arg0.field777 == var15) {
                            arg0.field772--;
                            if (arg0.field766 > 0) {
                                arg0.field766--;
                            }
                        }
                    } else {
                        arg0.field732 = var14;
                        arg0.field777 = var15;
                    }
                }
            }
        }
        if (arg0.field732 < 128 || arg0.field777 < 128 || arg0.field732 >= 13184 || arg0.field777 >= 13184) {
            arg0.field760 = -1;
            arg0.field755 = -1;
            arg0.field729 = 0;
            arg0.field765 = 0;
            arg0.field732 = arg0.field749[0] * 128 + arg0.field743 * 64;
            arg0.field777 = arg0.field774[0] * 128 + arg0.field743 * 64;
            arg0.method602();
        }
        if (Statics.field216 == arg0 && (arg0.field732 < 1536 || arg0.field777 < 1536 || arg0.field732 >= 11776 || arg0.field777 >= 11776)) {
            arg0.field760 = -1;
            arg0.field755 = -1;
            arg0.field729 = 0;
            arg0.field765 = 0;
            arg0.field732 = arg0.field749[0] * 128 + arg0.field743 * 64;
            arg0.field777 = arg0.field774[0] * 128 + arg0.field743 * 64;
            arg0.method602();
        }
        method109(arg0);
        arg0.field723 = false;
        if (arg0.field728 != -1) {
            class39 var20 = class39.method821(arg0.field728);
            if (var20 == null || var20.field902 == null) {
                arg0.field728 = -1;
            } else {
                arg0.field747++;
                if (arg0.field748 < var20.field902.length && arg0.field747 > var20.field904[arg0.field748]) {
                    arg0.field747 = 1;
                    arg0.field748++;
                    method2083(var20, arg0.field748, arg0.field732, arg0.field777);
                }
                if (arg0.field748 >= var20.field902.length) {
                    arg0.field747 = 0;
                    arg0.field748 = 0;
                    method2083(var20, arg0.field748, arg0.field732, arg0.field777);
                }
            }
        }
        if (arg0.field755 != -1 && field246 >= arg0.field768) {
            if (arg0.field756 < 0) {
                arg0.field756 = 0;
            }
            int var21 = Statics.method503(arg0.field755).field920;
            if (var21 == -1) {
                arg0.field755 = -1;
            } else {
                class39 var22 = class39.method821(var21);
                if (var22 == null || var22.field902 == null) {
                    arg0.field755 = -1;
                } else {
                    arg0.field741++;
                    if (arg0.field756 < var22.field902.length && arg0.field741 > var22.field904[arg0.field756]) {
                        arg0.field741 = 1;
                        arg0.field756++;
                        method2083(var22, arg0.field756, arg0.field732, arg0.field777);
                    }
                    if (arg0.field756 >= var22.field902.length && (arg0.field756 < 0 || arg0.field756 >= var22.field902.length)) {
                        arg0.field755 = -1;
                    }
                }
            }
        }
        if (arg0.field760 != -1 && arg0.field753 <= 1) {
            class39 var23 = class39.method821(arg0.field760);
            if (var23.field913 == 1 && arg0.field766 > 0 && arg0.field729 <= field246 && arg0.field765 < field246) {
                arg0.field753 = 1;
                return;
            }
        }
        if (arg0.field760 != -1 && arg0.field753 == 0) {
            class39 var24 = class39.method821(arg0.field760);
            if (var24 == null || var24.field902 == null) {
                arg0.field760 = -1;
            } else {
                arg0.field752++;
                if (arg0.field751 < var24.field902.length && arg0.field752 > var24.field904[arg0.field751]) {
                    arg0.field752 = 1;
                    arg0.field751++;
                    method2083(var24, arg0.field751, arg0.field732, arg0.field777);
                }
                if (arg0.field751 >= var24.field902.length) {
                    arg0.field751 -= var24.field906;
                    arg0.field754++;
                    if (arg0.field754 >= var24.field907) {
                        arg0.field760 = -1;
                    } else if (arg0.field751 >= 0 && arg0.field751 < var24.field902.length) {
                        method2083(var24, arg0.field751, arg0.field732, arg0.field777);
                    } else {
                        arg0.field760 = -1;
                    }
                }
                arg0.field723 = var24.field908;
            }
        }
        if (arg0.field753 > 0) {
            arg0.field753--;
        }
    }

    @ObfuscatedName("f.ad(Laa;B)V")
    public static final void method109(class34 arg0) {
        if (arg0.field771 == 0) {
            return;
        }
        if (arg0.field744 != -1 && arg0.field744 < 32768) {
            class31 var1 = field273[arg0.field744];
            if (var1 != null) {
                int var2 = arg0.field732 - var1.field732;
                int var3 = arg0.field777 - var1.field777;
                if (var2 != 0 || var3 != 0) {
                    arg0.field737 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field744 >= 32768) {
            int var4 = arg0.field744 - 32768;
            if (field361 == var4) {
                var4 = 2047;
            }
            class3 var5 = field355[var4];
            if (var5 != null) {
                int var6 = arg0.field732 - var5.field732;
                int var7 = arg0.field777 - var5.field777;
                if (var6 != 0 || var7 != 0) {
                    arg0.field737 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field727 != 0 || arg0.field720 != 0) && (arg0.field772 == 0 || arg0.field776 > 0)) {
            int var8 = arg0.field732 - (arg0.field727 * 64 - Statics.field183 * 64 - Statics.field183 * 64);
            int var9 = arg0.field777 - (arg0.field720 * 64 - Statics.field780 * 64 - Statics.field780 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field737 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field727 = 0;
            arg0.field720 = 0;
        }
        int var10 = arg0.field737 - arg0.field721 & 0x7FF;
        if (var10 == 0) {
            arg0.field770 = 0;
            return;
        }
        arg0.field770++;
        if (var10 > 1024) {
            arg0.field721 -= arg0.field771;
            boolean var11 = true;
            if (var10 < arg0.field771 || var10 > 2048 - arg0.field771) {
                arg0.field721 = arg0.field737;
                var11 = false;
            }
            if (arg0.field728 == arg0.field724 && (arg0.field770 > 25 || var11)) {
                if (arg0.field725 == -1) {
                    arg0.field728 = arg0.field722;
                } else {
                    arg0.field728 = arg0.field725;
                }
            }
        } else {
            arg0.field721 += arg0.field771;
            boolean var12 = true;
            if (var10 < arg0.field771 || var10 > 2048 - arg0.field771) {
                arg0.field721 = arg0.field737;
                var12 = false;
            }
            if (arg0.field728 == arg0.field724 && (arg0.field770 > 25 || var12)) {
                if (arg0.field726 == -1) {
                    arg0.field728 = arg0.field722;
                } else {
                    arg0.field728 = arg0.field726;
                }
            }
        }
        arg0.field721 &= 0x7FF;
    }

    @ObfuscatedName("o.ag(Lg;IIB)V")
    public static void method148(class3 arg0, int arg1, int arg2) {
        if (arg0.field760 == arg1 && arg1 != -1) {
            int var3 = class39.method821(arg1).field915;
            if (var3 == 1) {
                arg0.field751 = 0;
                arg0.field752 = 0;
                arg0.field753 = arg2;
                arg0.field754 = 0;
            }
            if (var3 == 2) {
                arg0.field754 = 0;
            }
        } else if (arg1 == -1 || arg0.field760 == -1 || class39.method821(arg1).field909 >= class39.method821(arg0.field760).field909) {
            arg0.field760 = arg1;
            arg0.field751 = 0;
            arg0.field752 = 0;
            arg0.field753 = arg2;
            arg0.field754 = 0;
            arg0.field766 = arg0.field772;
        }
    }

    @ObfuscatedName("dd.aa(Ljava/lang/String;ZI)V")
    public static final void method2488(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field499.method3524(arg0, 250);
        int var6 = Statics.field499.method3503(arg0, 250) * 13;
        class74.method1546(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1537(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field499.method3510(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1882(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field171.getGraphics();
            Statics.field1830.method1379(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field171.repaint();
        }
    }

    @ObfuscatedName("ad.au(IIIIB)V")
    public static final void method581(int arg0, int arg1, int arg2, int arg3) {
        class74.method1529(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class85.method1787();
        field339++;
        method108(class30.field674);
        boolean var4 = false;
        if (field369 >= 0) {
            for (int var5 = 0; var5 < field356; var5++) {
                if (field369 == field280[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method108(class30.field675);
        }
        method162(true);
        method108(var4 ? class30.field676 : class30.field681);
        method162(false);
        method2944();
        for (class27 var6 = (class27) field373.method3304(); var6 != null; var6 = (class27) field373.method3297()) {
            if (Statics.field2678 != var6.field621 || var6.field619) {
                var6.method3375();
            } else if (field246 >= var6.field611) {
                var6.method528(field360);
                if (var6.field619) {
                    var6.method3375();
                } else {
                    Statics.field2514.method1626(var6.field621, var6.field620, var6.field614, var6.field615, 60, var6, 0, -1, false);
                }
            }
        }
        if (!field439) {
            int var7 = field319;
            if (field327 / 256 > var7) {
                var7 = field327 / 256;
            }
            if (field484[4] && field486[4] + 128 > var7) {
                var7 = field486[4] + 128;
            }
            int var8 = field320 + field303 & 0x7FF;
            method142(Statics.field2981, method324(Statics.field216.field732, Statics.field216.field777, Statics.field2678) - 50, Statics.field534, var7, var8, var7 * 3 + 600);
        }
        int var21;
        if (field439) {
            var21 = method477();
        } else {
            int var9;
            if (Statics.field1773.field136) {
                var9 = Statics.field2678;
            } else {
                int var10 = 3;
                if (Statics.field677 < 310) {
                    int var11 = Statics.field1335 >> 7;
                    int var12 = Statics.field2652 >> 7;
                    int var13 = Statics.field216.field732 >> 7;
                    int var14 = Statics.field216.field777 >> 7;
                    if ((class6.field70[Statics.field2678][var11][var12] & 0x4) != 0) {
                        var10 = Statics.field2678;
                    }
                    int var15;
                    if (var13 > var11) {
                        var15 = var13 - var11;
                    } else {
                        var15 = var11 - var13;
                    }
                    int var16;
                    if (var14 > var12) {
                        var16 = var14 - var12;
                    } else {
                        var16 = var12 - var14;
                    }
                    if (var15 > var16) {
                        int var17 = var16 * 65536 / var15;
                        int var18 = 32768;
                        while (var11 != var13) {
                            if (var11 < var13) {
                                var11++;
                            } else if (var11 > var13) {
                                var11--;
                            }
                            if ((class6.field70[Statics.field2678][var11][var12] & 0x4) != 0) {
                                var10 = Statics.field2678;
                            }
                            var18 += var17;
                            if (var18 >= 65536) {
                                var18 -= 65536;
                                if (var12 < var14) {
                                    var12++;
                                } else if (var12 > var14) {
                                    var12--;
                                }
                                if ((class6.field70[Statics.field2678][var11][var12] & 0x4) != 0) {
                                    var10 = Statics.field2678;
                                }
                            }
                        }
                    } else {
                        int var19 = var15 * 65536 / var16;
                        int var20 = 32768;
                        while (var12 != var14) {
                            if (var12 < var14) {
                                var12++;
                            } else if (var12 > var14) {
                                var12--;
                            }
                            if ((class6.field70[Statics.field2678][var11][var12] & 0x4) != 0) {
                                var10 = Statics.field2678;
                            }
                            var20 += var19;
                            if (var20 >= 65536) {
                                var20 -= 65536;
                                if (var11 < var13) {
                                    var11++;
                                } else if (var11 > var13) {
                                    var11--;
                                }
                                if ((class6.field70[Statics.field2678][var11][var12] & 0x4) != 0) {
                                    var10 = Statics.field2678;
                                }
                            }
                        }
                    }
                }
                if ((class6.field70[Statics.field2678][Statics.field216.field732 >> 7][Statics.field216.field777 >> 7] & 0x4) != 0) {
                    var10 = Statics.field2678;
                }
                var9 = var10;
            }
            var21 = var9;
        }
        int var22 = Statics.field1335;
        int var23 = Statics.field119;
        int var24 = Statics.field2652;
        int var25 = Statics.field677;
        int var26 = Statics.field17;
        for (int var27 = 0; var27 < 5; var27++) {
            if (field484[var27]) {
                int var28 = (int) (Math.random() * (double) (field485[var27] * 2 + 1) - (double) field485[var27] + Math.sin((double) field487[var27] / 100.0D * (double) field450[var27]) * (double) field486[var27]);
                if (var27 == 0) {
                    Statics.field1335 += var28;
                }
                if (var27 == 1) {
                    Statics.field119 += var28;
                }
                if (var27 == 2) {
                    Statics.field2652 += var28;
                }
                if (var27 == 3) {
                    Statics.field17 = Statics.field17 + var28 & 0x7FF;
                }
                if (var27 == 4) {
                    Statics.field677 += var28;
                    if (Statics.field677 < 128) {
                        Statics.field677 = 128;
                    }
                    if (Statics.field677 > 383) {
                        Statics.field677 = 383;
                    }
                }
            }
        }
        int var29 = class129.field1990;
        int var30 = class129.field1997;
        if (class129.field2002 != 0) {
            var29 = class129.field1996;
            var30 = class129.field2004;
        }
        if (var29 >= arg0 && var29 < arg0 + arg2 && var30 >= arg1 && var30 < arg1 + arg3) {
            class99.field1677 = true;
            class99.field1735 = 0;
            class99.field1733 = var29 - arg0;
            class99.field1734 = var30 - arg1;
        } else {
            class99.field1677 = false;
            class99.field1735 = 0;
        }
        method2730();
        class74.method1546(arg0, arg1, arg2, arg3, 0);
        method2730();
        Statics.field2514.method1653(Statics.field1335, Statics.field119, Statics.field2652, Statics.field677, Statics.field17, var21);
        method2730();
        Statics.field2514.method1637();
        field328 = 0;
        boolean var31 = false;
        int var32 = -1;
        for (int var33 = -1; var33 < field356 + field274; var33++) {
            class34 var34;
            if (var33 == -1) {
                var34 = Statics.field216;
            } else if (var33 < field356) {
                var34 = field355[field280[var33]];
                if (field369 == field280[var33]) {
                    var31 = true;
                    var32 = var33;
                    continue;
                }
            } else {
                var34 = field273[field423[var33 - field356]];
            }
            method129(var34, var33, arg0, arg1, arg2, arg3);
        }
        if (var31) {
            method129(field355[field369], var32, arg0, arg1, arg2, arg3);
        }
        for (int var35 = 0; var35 < field328; var35++) {
            int var36 = field441[var35];
            int var37 = field331[var35];
            int var38 = field269[var35];
            int var39 = field332[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > field331[var41] - field332[var41] && var37 - var39 < field331[var41] + 2 && var36 - var38 < field441[var41] + field269[var41] && var36 + var38 > field441[var41] - field269[var41] && field331[var41] - field332[var41] < var37) {
                        var37 = field331[var41] - field332[var41];
                        var40 = true;
                    }
                }
            }
            field425 = field441[var35];
            field341 = field331[var35] = var37;
            String var42 = field384[var35];
            if (field241 == 0) {
                int var43 = 16776960;
                if (field334[var35] < 6) {
                    var43 = field452[field334[var35]];
                }
                if (field334[var35] == 6) {
                    var43 = field339 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field334[var35] == 7) {
                    var43 = field339 % 20 < 10 ? 255 : 65535;
                }
                if (field334[var35] == 8) {
                    var43 = field339 % 20 < 10 ? 45056 : 8454016;
                }
                if (field334[var35] == 9) {
                    int var44 = 150 - field336[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 - 50) * 327680;
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (field334[var35] == 10) {
                    int var45 = 150 - field336[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 - 50) * 327680;
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - (var45 - 100) * 5;
                    }
                }
                if (field334[var35] == 11) {
                    int var46 = 150 - field336[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (field335[var35] == 0) {
                    Statics.field1649.method3507(var42, field425 + arg0, field341 + arg1, var43, 0);
                }
                if (field335[var35] == 1) {
                    Statics.field1649.method3509(var42, field425 + arg0, field341 + arg1, var43, 0, field339);
                }
                if (field335[var35] == 2) {
                    Statics.field1649.method3537(var42, field425 + arg0, field341 + arg1, var43, 0, field339);
                }
                if (field335[var35] == 3) {
                    Statics.field1649.method3511(var42, field425 + arg0, field341 + arg1, var43, 0, field339, 150 - field336[var35]);
                }
                if (field335[var35] == 4) {
                    int var47 = (150 - field336[var35]) * (Statics.field1649.method3500(var42) + 100) / 150;
                    class74.method1530(field425 + arg0 - 50, arg1, field425 + arg0 + 50, arg1 + arg3);
                    Statics.field1649.method3505(var42, field425 + arg0 + 50 - var47, field341 + arg1, var43, 0);
                    class74.method1529(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field335[var35] == 5) {
                    int var48 = 150 - field336[var35];
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class74.method1530(arg0, field341 + arg1 - Statics.field1649.field2952 - 1, arg0 + arg2, field341 + arg1 + 5);
                    Statics.field1649.method3507(var42, field425 + arg0, field341 + arg1 + var49, var43, 0);
                    class74.method1529(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1649.method3507(var42, field425 + arg0, field341 + arg1, 16776960, 0);
            }
        }
        method770(arg0, arg1);
        ((class89) Statics.field1465).method1883(field360);
        method2443(arg0, arg1, arg2, arg3);
        Statics.field1335 = var22;
        Statics.field119 = var23;
        Statics.field2652 = var24;
        Statics.field677 = var25;
        Statics.field17 = var26;
        if (field245 && class153.method2728(true, false) == 0) {
            field245 = false;
        }
        if (field245) {
            class74.method1546(arg0, arg1, arg2, arg3, 0);
            method2488(class145.field2146, false);
        }
    }

    @ObfuscatedName("f.aq(Law;I)V")
    public static final void method108(class30 arg0) {
        if (Statics.field216.field732 >> 7 == field469 && Statics.field216.field777 >> 7 == field490) {
            field469 = 0;
        }
        int var1 = field356;
        if (class30.field674 == arg0 || class30.field675 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field674 == arg0) {
                var3 = Statics.field216;
                var4 = 33538048;
            } else if (class30.field675 == arg0) {
                var3 = field355[field369];
                var4 = field369 << 14;
            } else {
                var3 = field355[field280[var2]];
                var4 = field280[var2] << 14;
                if (class30.field676 == arg0 && field369 == field280[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method16() && !var3.field37) {
                var3.field50 = false;
                if ((field242 && field356 > 50 || field356 > 200) && class30.field674 != arg0 && var3.field728 == var3.field724) {
                    var3.field50 = true;
                }
                int var5 = var3.field732 >> 7;
                int var6 = var3.field777 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field246 < var3.field38 || field246 >= var3.field41) {
                        if ((var3.field732 & 0x7F) == 64 && (var3.field777 & 0x7F) == 64) {
                            if (field339 == field337[var5][var6]) {
                                continue;
                            }
                            field337[var5][var6] = field339;
                        }
                        var3.field34 = method324(var3.field732, var3.field777, Statics.field2678);
                        Statics.field2514.method1626(Statics.field2678, var3.field732, var3.field777, var3.field34, 60, var3, var3.field721, var4, var3.field723);
                    } else {
                        var3.field50 = false;
                        var3.field34 = method324(var3.field732, var3.field777, Statics.field2678);
                        Statics.field2514.method1779(Statics.field2678, var3.field732, var3.field777, var3.field34, 60, var3, var3.field721, var4, var3.field39, var3.field47, var3.field48, var3.field33);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.am(ZI)V")
    public static final void method162(boolean arg0) {
        for (int var1 = 0; var1 < field274; var1++) {
            class31 var2 = field273[field423[var1]];
            int var3 = (field423[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field687.field813 == arg0 && var2.field687.method634()) {
                int var4 = var2.field732 >> 7;
                int var5 = var2.field777 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field743 == 1 && (var2.field732 & 0x7F) == 64 && (var2.field777 & 0x7F) == 64) {
                        if (field339 == field337[var4][var5]) {
                            continue;
                        }
                        field337[var4][var5] = field339;
                    }
                    if (!var2.field687.field804) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2514.method1626(Statics.field2678, var2.field732, var2.field777, method324(var2.field732 + (var2.field743 * 64 - 64), var2.field777 + (var2.field743 * 64 - 64), Statics.field2678), var2.field743 * 64 - 64 + 60, var2, var2.field721, var3, var2.field723);
                }
            }
        }
    }

    @ObfuscatedName("fk.ax(B)V")
    public static final void method2944() {
        for (class7 var0 = (class7) field372.method3304(); var0 != null; var0 = (class7) field372.method3297()) {
            if (Statics.field2678 != var0.field109 || field246 > var0.field104) {
                var0.method3375();
            } else if (field246 >= var0.field95) {
                if (var0.field99 > 0) {
                    class31 var1 = field273[var0.field99 - 1];
                    if (var1 != null && var1.field732 >= 0 && var1.field732 < 13312 && var1.field777 >= 0 && var1.field777 < 13312) {
                        var0.method98(var1.field732, var1.field777, method324(var1.field732, var1.field777, var0.field109) - var0.field94, field246);
                    }
                }
                if (var0.field99 < 0) {
                    int var2 = -var0.field99 - 1;
                    class3 var3;
                    if (field361 == var2) {
                        var3 = Statics.field216;
                    } else {
                        var3 = field355[var2];
                    }
                    if (var3 != null && var3.field732 >= 0 && var3.field732 < 13312 && var3.field777 >= 0 && var3.field777 < 13312) {
                        var0.method98(var3.field732, var3.field777, method324(var3.field732, var3.field777, var0.field109) - var0.field94, field246);
                    }
                }
                var0.method100(field360);
                Statics.field2514.method1626(Statics.field2678, (int) var0.field101, (int) var0.field102, (int) var0.field103, 60, var0, var0.field97, -1, false);
            }
        }
    }

    @ObfuscatedName("e.af(B)I")
    public static final int method477() {
        if (Statics.field1773.field136) {
            return Statics.field2678;
        } else {
            int var0 = method324(Statics.field1335, Statics.field2652, Statics.field2678);
            return var0 - Statics.field119 >= 800 || (class6.field70[Statics.field2678][Statics.field1335 >> 7][Statics.field2652 >> 7] & 0x4) == 0 ? 3 : Statics.field2678;
        }
    }

    @ObfuscatedName("ao.av(III)V")
    public static final void method770(int arg0, int arg1) {
        if (field254 == 2) {
            method2381((field257 - Statics.field183 << 7) + field260, (field258 - Statics.field780 << 7) + field322, field259 * 2);
            if (field425 > -1 && field246 % 20 < 10) {
                Statics.field131[0].method1501(field425 + arg0 - 12, field341 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("n.ao(Laa;IIIIIB)V")
    public static final void method129(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method16()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field687;
            if (var6.field806 != null) {
                var6 = var6.method628();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field356) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field37) {
                return;
            }
            if (var8.field35 != -1 || var8.field36 != -1) {
                method573(arg0, arg0.field778 + 15);
                if (field425 > -1) {
                    if (var8.field35 != -1) {
                        Statics.field2087[var8.field35].method1501(field425 + arg2 - 12, field341 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field36 != -1) {
                        Statics.field1903[var8.field36].method1501(field425 + arg2 - 12, field341 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field254 == 10 && field432 == field280[arg1]) {
                method573(arg0, arg0.field778 + 15);
                if (field425 > -1) {
                    Statics.field131[1].method1501(field425 + arg2 - 12, field341 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field687;
            if (var9.field806 != null) {
                var9 = var9.method628();
            }
            if (var9.field816 >= 0 && var9.field816 < Statics.field1903.length) {
                method573(arg0, arg0.field778 + 15);
                if (field425 > -1) {
                    Statics.field1903[var9.field816].method1501(field425 + arg2 - 12, field341 + arg3 - 30);
                }
            }
            if (field254 == 1 && field255 == field423[arg1 - field356] && field246 % 20 < 10) {
                method573(arg0, arg0.field778 + 15);
                if (field425 > -1) {
                    Statics.field131[0].method1501(field425 + arg2 - 12, field341 + arg3 - 28);
                }
            }
        }
        if (arg0.field750 != null && (arg1 >= field356 || !arg0.field775 && (field453 == 4 || !arg0.field733 && (field453 == 0 || field453 == 3 || field453 == 1 && method2723(((class3) arg0).field49, false))))) {
            method573(arg0, arg0.field778);
            if (field425 > -1 && field328 < field493) {
                field269[field328] = Statics.field1649.method3500(arg0.field750) / 2;
                field332[field328] = Statics.field1649.field2952;
                field441[field328] = field425;
                field331[field328] = field341;
                field334[field328] = arg0.field736;
                field335[field328] = arg0.field745;
                field336[field328] = arg0.field735;
                field384[field328] = arg0.field750;
                field328++;
            }
        }
        if (arg0.field719 > field246) {
            method573(arg0, arg0.field778 + 15);
            if (field425 > -1) {
                int var10;
                if (arg1 < field356) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field687;
                    var10 = var11.field788;
                }
                int var12 = arg0.field742 * var10 / arg0.field769;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field742 > 0) {
                    var12 = 1;
                }
                class74.method1546(field425 + arg2 - var10 / 2, field341 + arg3 - 3, var12, 5, 65280);
                class74.method1546(field425 + arg2 - var10 / 2 + var12, field341 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field740[var13] > field246) {
                method573(arg0, arg0.field778 / 2);
                if (field425 > -1) {
                    if (var13 == 1) {
                        field341 -= 20;
                    }
                    if (var13 == 2) {
                        field425 -= 15;
                        field341 -= 10;
                    }
                    if (var13 == 3) {
                        field425 += 15;
                        field341 -= 10;
                    }
                    Statics.field1931[arg0.field739[var13]].method1501(field425 + arg2 - 12, field341 + arg3 - 12);
                    Statics.field58.method3507(Integer.toString(arg0.field738[var13]), field425 + arg2 - 1, field341 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("de.aj(IIIIS)V")
    public static final void method2443(int arg0, int arg1, int arg2, int arg3) {
        if (field345 == 1) {
            Statics.field1057[field459 / 100].method1501(field342 - 8, field435 - 8);
        }
        if (field345 == 2) {
            Statics.field1057[field459 / 100 + 4].method1501(field342 - 8, field435 - 8);
        }
        Statics.method1311();
        if (!field252) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field499.method3496("Fps:" + field2040, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field242) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field242) {
            var8 = 16711680;
        }
        Statics.field499.method3496("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("az.ae(Laa;IB)V")
    public static final void method573(class34 arg0, int arg1) {
        method2381(arg0.field732, arg0.field777, arg1);
    }

    @ObfuscatedName("db.ai(IIII)V")
    public static final void method2381(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field425 = -1;
            field341 = -1;
            return;
        }
        int var3 = method324(arg0, arg1, Statics.field2678) - arg2;
        int var4 = arg0 - Statics.field1335;
        int var5 = var3 - Statics.field119;
        int var6 = arg1 - Statics.field2652;
        int var7 = class85.field1468[Statics.field677];
        int var8 = class85.field1469[Statics.field677];
        int var9 = class85.field1468[Statics.field17];
        int var10 = class85.field1469[Statics.field17];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field425 = (var11 << 9) / var15 + 256;
            field341 = (var14 << 9) / var15 + 167;
        } else {
            field425 = -1;
            field341 = -1;
        }
    }

    @ObfuscatedName("client.ay(IIIB)I")
    public static final int method324(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field70[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field76[var5][var3][var4] + class6.field76[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field76[var5][var3][var4 + 1] + class6.field76[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("p.ab(IIIIIII)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1468[var6];
            int var12 = class85.field1469[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1468[var7];
            int var15 = class85.field1469[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1335 = arg0 - var8;
        Statics.field119 = arg1 - var9;
        Statics.field2652 = arg2 - var10;
        Statics.field677 = arg3;
        Statics.field17 = arg4;
    }

    @ObfuscatedName("ei.ar(ZB)V")
    public static final void method2738(boolean arg0) {
        field296 = arg0;
        if (!field296) {
            int var1 = field278.method2278();
            int var2 = field278.method2194();
            int var3 = field278.method2163();
            int var4 = field278.method2291();
            int var5 = (field279 - field278.field1823) / 16;
            Statics.field1676 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field1676[var6][var7] = field278.method2329();
                }
            }
            int var8 = field278.method2194();
            Statics.field2807 = new int[var5];
            Statics.field210 = new int[var5];
            Statics.field1478 = new int[var5];
            Statics.field1556 = new byte[var5][];
            Statics.field1883 = new byte[var5][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2807[var10] = var13;
                        Statics.field210[var10] = Statics.field188.method2764("m" + var11 + "_" + var12);
                        Statics.field1478[var10] = Statics.field188.method2764("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2426(var8, var3, var4, var1, var2);
            return;
        }
        int var14 = field278.method2193();
        int var15 = field278.method2147();
        int var16 = field278.method2194();
        int var17 = field278.method2163();
        int var18 = field278.method2278();
        field278.method2384();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field278.method2385(1);
                    if (var22 == 1) {
                        field297[var19][var20][var21] = field278.method2385(26);
                    } else {
                        field297[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field278.method2386();
        int var23 = (field279 - field278.field1823) / 16;
        Statics.field1676 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field1676[var24][var25] = field278.method2202();
            }
        }
        Statics.field2807 = new int[var23];
        Statics.field210 = new int[var23];
        Statics.field1478 = new int[var23];
        Statics.field1556 = new byte[var23][];
        Statics.field1883 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field297[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2807[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2807[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field210[var26] = Statics.field188.method2764("m" + var35 + "_" + var36);
                            Statics.field1478[var26] = Statics.field188.method2764("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2426(var17, var14, var15, var18, var16);
    }

    @ObfuscatedName("dn.as(IIIIII)V")
    public static final void method2426(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2016 == arg0 && Statics.field1092 == arg1 && field289 == arg2 || !field242) {
            return;
        }
        Statics.field2016 = arg0;
        Statics.field1092 = arg1;
        field289 = arg2;
        if (!field242) {
            field289 = 0;
        }
        Statics.method2388(25);
        method2488(class145.field2146, true);
        int var5 = Statics.field183;
        int var6 = Statics.field780;
        Statics.field183 = (arg0 - 6) * 8;
        Statics.field780 = (arg1 - 6) * 8;
        int var7 = Statics.field183 - var5;
        int var8 = Statics.field780 - var6;
        int var9 = Statics.field183;
        int var10 = Statics.field780;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field273[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field749[var13] -= var7;
                    var12.field774[var13] -= var8;
                }
                var12.field732 -= var7 * 128;
                var12.field777 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field355[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field749[var16] -= var7;
                    var15.field774[var16] -= var8;
                }
                var15.field732 -= var7 * 128;
                var15.field777 -= var8 * 128;
            }
        }
        Statics.field2678 = arg2;
        Statics.field216.method609(arg3, arg4, false);
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
                        field370[var27][var23][var24] = field370[var27][var25][var26];
                    } else {
                        field370[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field294.method3304(); var28 != null; var28 = (class15) field294.method3297()) {
            var28.field208 -= var7;
            var28.field193 -= var8;
            if (var28.field208 < 0 || var28.field193 < 0 || var28.field208 >= 104 || var28.field193 >= 104) {
                var28.method3375();
            }
        }
        if (field469 != 0) {
            field469 -= var7;
            field490 -= var8;
        }
        field477 = 0;
        field439 = false;
        field464 = -1;
        field373.method3276();
        field372.method3276();
    }

    @ObfuscatedName("ek.at(ZB)V")
    public static final void method2720(boolean arg0) {
        method2730();
        field340++;
        if (field340 < 50 && !arg0) {
            return;
        }
        field340 = 0;
        if (field287 || Statics.field1794 == null) {
            return;
        }
        field261.method2391(160);
        try {
            Statics.field1794.method2593(field261.field1828, 0, field261.field1823);
            field261.field1823 = 0;
        } catch (IOException var2) {
            field287 = true;
        }
    }

    @ObfuscatedName("g.ac(II)V")
    public static final void method30(int arg0) {
        int[] var1 = Statics.field679.field1286;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field70[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2514.method1741(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field70[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2514.method1741(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field679.method1432();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field70[arg0][var10][var9] & 0x18) == 0) {
                    method707(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field70[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method707(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field465 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2514.method1645(Statics.field2678, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class37.method826(var14).field858;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field329[Statics.field2678].field2997;
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
                        field468[field465] = Statics.field202[var15];
                        field466[field465] = var16;
                        field467[field465] = var17;
                        field465++;
                    }
                }
            }
        }
        Statics.field1830.method1423();
    }

    @ObfuscatedName("ax.ap(IIIIIB)V")
    public static final void method707(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2514.method1641(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2514.method1619(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field679.field1286;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method826(var12);
            if (var13.field859 == -1) {
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
                class75 var14 = Statics.field1502[var13.field859];
                if (var14 != null) {
                    int var15 = (var13.field845 * 4 - var14.field1308) / 2;
                    int var16 = (var13.field869 * 4 - var14.field1307) / 2;
                    var14.method1588(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field869) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2514.method1643(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2514.method1619(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method826(var21);
            if (var22.field859 != -1) {
                class75 var23 = Statics.field1502[var22.field859];
                if (var23 != null) {
                    int var24 = (var22.field845 * 4 - var23.field1308) / 2;
                    int var25 = (var22.field869 * 4 - var23.field1307) / 2;
                    var23.method1588(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field869) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field679.field1286;
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
        int var29 = Statics.field2514.method1645(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method826(var30);
        if (var31.field859 == -1) {
            return;
        }
        class75 var32 = Statics.field1502[var31.field859];
        if (var32 != null) {
            int var33 = (var31.field845 * 4 - var32.field1308) / 2;
            int var34 = (var31.field869 * 4 - var32.field1307) / 2;
            var32.method1588(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field869) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("r.bm(I)Z")
    public static final boolean method160() {
        if (Statics.field1794 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1794.method2608();
            if (var0 == 0) {
                return false;
            }
            if (field410 == -1) {
                Statics.field1794.method2594(field278.field1828, 0, 1);
                field278.field1823 = 0;
                field410 = field278.method2402();
                field279 = class169.field2816[field410];
                var0--;
            }
            if (field279 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1794.method2594(field278.field1828, 0, 1);
                field279 = field278.field1828[0] & 0xFF;
                var0--;
            }
            if (field279 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1794.method2594(field278.field1828, 0, 2);
                field278.field1823 = 0;
                field279 = field278.method2163();
                var0 -= 2;
            }
            if (var0 < field279) {
                return false;
            }
            field278.field1823 = 0;
            Statics.field1794.method2594(field278.field1828, 0, field279);
            field281 = 0;
            field286 = field285;
            field285 = field301;
            field301 = field410;
            if (field410 == 37) {
                method2738(true);
                field410 = -1;
                return true;
            }
            if (field410 == 67) {
                int var1 = field278.method2163();
                int var2 = field278.method2329();
                class155 var3 = class155.method1889(var2);
                if (var3.field2623 != 2 || var3.field2557 != var1) {
                    var3.field2623 = 2;
                    var3.field2557 = var1;
                    method744(var3);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 217) {
                for (int var4 = 0; var4 < field355.length; var4++) {
                    if (field355[var4] != null) {
                        field355[var4].field760 = -1;
                    }
                }
                for (int var5 = 0; var5 < field273.length; var5++) {
                    if (field273[var5] != null) {
                        field273[var5].field760 = -1;
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 197) {
                int var6 = field278.method2193();
                class14.method1990(var6);
                field290[++field399 - 1 & 0x1F] = var6 & 0x7FFF;
                field410 = -1;
                return true;
            }
            if (field410 == 242) {
                String var7 = field278.method2168();
                int var8 = field278.method2163();
                byte var9 = field278.method2292();
                boolean var10 = false;
                if (var9 == -128) {
                    var10 = true;
                }
                if (var10) {
                    if (Statics.field1050 == 0) {
                        field410 = -1;
                        return true;
                    }
                    boolean var11 = false;
                    int var12;
                    for (var12 = 0; var12 < Statics.field1050 && (!Statics.field2065[var12].field559.equals(var7) || Statics.field2065[var12].field563 != var8); var12++) {
                    }
                    if (var12 < Statics.field1050) {
                        while (var12 < Statics.field1050 - 1) {
                            Statics.field2065[var12] = Statics.field2065[var12 + 1];
                            var12++;
                        }
                        Statics.field1050--;
                        Statics.field2065[Statics.field1050] = null;
                    }
                } else {
                    field278.method2168();
                    class22 var13 = new class22();
                    var13.field559 = var7;
                    var13.field558 = class212.method3386(var13.field559, Statics.field237);
                    var13.field563 = var8;
                    var13.field560 = var9;
                    int var14;
                    for (var14 = Statics.field1050 - 1; var14 >= 0; var14--) {
                        int var15 = Statics.field2065[var14].field558.compareTo(var13.field558);
                        if (var15 == 0) {
                            Statics.field2065[var14].field563 = var8;
                            Statics.field2065[var14].field560 = var9;
                            if (var7.equals(Statics.field216.field49)) {
                                Statics.field596 = var9;
                            }
                            field359 = field421;
                            field410 = -1;
                            return true;
                        }
                        if (var15 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1050 >= Statics.field2065.length) {
                        field410 = -1;
                        return true;
                    }
                    for (int var16 = Statics.field1050 - 1; var16 > var14; var16--) {
                        Statics.field2065[var16 + 1] = Statics.field2065[var16];
                    }
                    if (Statics.field1050 == 0) {
                        Statics.field2065 = new class22[100];
                    }
                    Statics.field2065[var14 + 1] = var13;
                    Statics.field1050++;
                    if (var7.equals(Statics.field216.field49)) {
                        Statics.field596 = var9;
                    }
                }
                field359 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 146) {
                int var17 = field278.method2297();
                int var18 = field278.method2163();
                if (var17 < -70000) {
                    var18 += 32768;
                }
                class155 var19;
                if (var17 >= 0) {
                    var19 = class155.method1889(var17);
                } else {
                    var19 = null;
                }
                while (field278.field1823 < field279) {
                    int var20 = field278.method2173();
                    int var21 = field278.method2163();
                    int var22 = 0;
                    if (var21 != 0) {
                        var22 = field278.method2291();
                        if (var22 == 255) {
                            var22 = field278.method2297();
                        }
                    }
                    if (var19 != null && var20 >= 0 && var20 < var19.field2629.length) {
                        var19.field2629[var20] = var21;
                        var19.field2630[var20] = var22;
                    }
                    class14.method94(var18, var20, var21 - 1, var22);
                }
                if (var19 != null) {
                    method744(var19);
                }
                method765();
                field290[++field399 - 1 & 0x1F] = var18 & 0x7FFF;
                field410 = -1;
                return true;
            }
            if (field410 == 27) {
                int var23 = field278.method2204();
                int var24 = field278.method2193();
                int var25 = field278.method2278();
                class155 var26 = class155.method1889(var23);
                var26.field2619 = (var24 << 16) + var25;
                field410 = -1;
                return true;
            }
            if (field410 == 86) {
                String var27 = field278.method2168();
                long var28 = (long) field278.method2163();
                long var30 = (long) field278.method2214();
                class140 var32 = (class140) class100.method706(class140.method810(), field278.method2291());
                long var33 = (var28 << 32) + var30;
                boolean var35 = false;
                for (int var36 = 0; var36 < 100; var36++) {
                    if (field456[var36] == var33) {
                        var35 = true;
                        break;
                    }
                }
                if (method3084(var27)) {
                    var35 = true;
                }
                if (!var35 && field354 == 0) {
                    field456[field457] = var33;
                    field457 = (field457 + 1) % 100;
                    String var37 = class204.method3578(Statics.method2406(class203.method2998(field278)));
                    byte var38;
                    if (var32.field2097) {
                        var38 = 7;
                    } else {
                        var38 = 3;
                    }
                    if (var32.field2096 == -1) {
                        class10.method1881(var38, var27, var37);
                    } else {
                        class10.method1881(var38, class2.method2863(var32.field2096) + var27, var37);
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 211) {
                field278.field1823 += 28;
                if (field278.method2179()) {
                    class111 var39 = field278;
                    int var40 = field278.field1823 - 28;
                    if (class138.field2074 != null) {
                        try {
                            class138.field2074.method3610(0L);
                            class138.field2074.method3614(var39.field1828, var40, 24);
                        } catch (Exception var298) {
                        }
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 20) {
                String var42 = field278.method2168();
                String var43 = class204.method3578(Statics.method2406(class203.method2998(field278)));
                class10.method1881(6, var42, var43);
                field410 = -1;
                return true;
            }
            if (field410 == 9) {
                field439 = false;
                for (int var44 = 0; var44 < 5; var44++) {
                    field484[var44] = false;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 220) {
                method765();
                field488 = field278.method2291();
                field433 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 187) {
                while (field278.field1823 < field279) {
                    int var45 = field278.method2291();
                    boolean var46 = (var45 & 0x1) == 1;
                    String var47 = field278.method2168();
                    String var48 = field278.method2168();
                    field278.method2168();
                    for (int var49 = 0; var49 < field358; var49++) {
                        class8 var50 = field333[var49];
                        if (var46) {
                            if (var48.equals(var50.field125)) {
                                var50.field125 = var47;
                                var50.field120 = var48;
                                var47 = null;
                                break;
                            }
                        } else if (var47.equals(var50.field125)) {
                            var50.field125 = var47;
                            var50.field120 = var48;
                            var47 = null;
                            break;
                        }
                    }
                    if (var47 != null && field358 < 400) {
                        class8 var51 = new class8();
                        field333[field358] = var51;
                        var51.field125 = var47;
                        var51.field120 = var48;
                        field358++;
                    }
                }
                field473 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 241) {
                int var52 = field278.method2297();
                int var53 = field278.method2163();
                if (var52 < -70000) {
                    var53 += 32768;
                }
                class155 var54;
                if (var52 >= 0) {
                    var54 = class155.method1889(var52);
                } else {
                    var54 = null;
                }
                if (var54 != null) {
                    for (int var55 = 0; var55 < var54.field2629.length; var55++) {
                        var54.field2629[var55] = 0;
                        var54.field2630[var55] = 0;
                    }
                }
                class14.method1608(var53);
                int var56 = field278.method2163();
                for (int var57 = 0; var57 < var56; var57++) {
                    int var58 = field278.method2184();
                    if (var58 == 255) {
                        var58 = field278.method2204();
                    }
                    int var59 = field278.method2194();
                    if (var54 != null && var57 < var54.field2629.length) {
                        var54.field2629[var57] = var59;
                        var54.field2630[var57] = var58;
                    }
                    class14.method94(var53, var57, var59 - 1, var58);
                }
                if (var54 != null) {
                    method744(var54);
                }
                method765();
                field290[++field399 - 1 & 0x1F] = var53 & 0x7FFF;
                field410 = -1;
                return true;
            }
            if (field410 == 33) {
                for (int var60 = 0; var60 < class157.field2655.length; var60++) {
                    if (class157.field2655[var60] != class157.field2654[var60]) {
                        class157.field2655[var60] = class157.field2654[var60];
                        method2718(var60);
                        field462[++field491 - 1 & 0x1F] = var60;
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 8) {
                int var61 = field278.method2204();
                Statics.field1942 = Statics.field938.method2498(var61);
                field410 = -1;
                return true;
            }
            if (field410 == 186) {
                method765();
                int var62 = field278.method2147();
                int var63 = field278.method2204();
                int var64 = field278.method2184();
                field376[var62] = var63;
                field239[var62] = var64;
                field375[var62] = 1;
                for (int var65 = 0; var65 < 98; var65++) {
                    if (var63 >= class143.field2125[var65]) {
                        field375[var62] = var65 + 2;
                    }
                }
                field426[++field236 - 1 & 0x1F] = var62;
                field410 = -1;
                return true;
            }
            if (field410 == 47) {
                boolean var66 = field278.method2147() == 1;
                int var67 = field278.method2204();
                class155 var68 = class155.method1889(var67);
                if (var68.field2536 != var66) {
                    var68.field2536 = var66;
                    method744(var68);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 121) {
                boolean var69 = field278.method2291() == 1;
                if (var69) {
                    Statics.field2801 = class104.method2616() - field278.method2166();
                    Statics.field2513 = new class202(field278, true);
                } else {
                    Statics.field2513 = null;
                }
                field238 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 183) {
                int var70 = field278.method2291();
                int var71 = field278.method2291();
                int var72 = field278.method2291();
                int var73 = field278.method2291();
                field484[var70] = true;
                field485[var70] = var71;
                field486[var70] = var72;
                field487[var70] = var73;
                field450[var70] = 0;
                field410 = -1;
                return true;
            }
            if (field410 == 252) {
                int var74 = field278.method2204();
                int var75 = field278.method2194();
                class155 var76 = class155.method1889(var74);
                if (var76 != null && var76.field2604 == 0) {
                    if (var75 > var76.field2540 - var76.field2534) {
                        var75 = var76.field2540 - var76.field2534;
                    }
                    if (var75 < 0) {
                        var75 = 0;
                    }
                    if (var76.field2538 != var75) {
                        var76.field2538 = var75;
                        method744(var76);
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 51) {
                int var77 = field278.method2193();
                int var78 = field278.method2202();
                class155 var79 = class155.method1889(var78);
                if (var79.field2623 != 1 || var79.field2557 != var77) {
                    var79.field2623 = 1;
                    var79.field2557 = var77;
                    method744(var79);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 198) {
                int var80 = field278.method2297();
                class155 var81 = class155.method1889(var80);
                var81.field2623 = 3;
                var81.field2557 = Statics.field216.field40.method2979();
                method744(var81);
                field410 = -1;
                return true;
            }
            if (field410 == 117) {
                int var82 = field278.method2297();
                String var83 = field278.method2168();
                class155 var84 = class155.method1889(var82);
                if (!var83.equals(var84.field2572)) {
                    var84.field2572 = var83;
                    method744(var84);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 112) {
                int var85 = field278.method2297();
                class4 var86 = (class4) field398.method3254((long) var85);
                if (var86 != null) {
                    method2415(var86, true);
                }
                if (field429 != null) {
                    method744(field429);
                    field429 = null;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 179) {
                field254 = field278.method2291();
                if (field254 == 1) {
                    field255 = field278.method2163();
                }
                if (field254 >= 2 && field254 <= 6) {
                    if (field254 == 2) {
                        field260 = 64;
                        field322 = 64;
                    }
                    if (field254 == 3) {
                        field260 = 0;
                        field322 = 64;
                    }
                    if (field254 == 4) {
                        field260 = 128;
                        field322 = 64;
                    }
                    if (field254 == 5) {
                        field260 = 64;
                        field322 = 0;
                    }
                    if (field254 == 6) {
                        field260 = 64;
                        field322 = 128;
                    }
                    field254 = 2;
                    field257 = field278.method2163();
                    field258 = field278.method2163();
                    field259 = field278.method2291();
                }
                if (field254 == 10) {
                    field432 = field278.method2163();
                }
                field410 = -1;
                return true;
            }
            if (field410 == 147) {
                int var87 = field278.method2193();
                int var88 = field278.method2202();
                class157.field2654[var87] = var88;
                if (class157.field2655[var87] != var88) {
                    class157.field2655[var87] = var88;
                    method2718(var87);
                }
                field462[++field491 - 1 & 0x1F] = var87;
                field410 = -1;
                return true;
            }
            if (field410 == 19) {
                int var89 = field278.method2202();
                int var90 = field278.method2164();
                int var91 = field278.method2242();
                class155 var92 = class155.method1889(var89);
                int var93 = var92.field2531 + var91;
                int var94 = var92.field2532 + var90;
                if (var92.field2568 != var93 || var92.field2530 != var94) {
                    var92.field2568 = var93;
                    var92.field2530 = var94;
                    method744(var92);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 95) {
                field471 = field278.method2291();
                field410 = -1;
                return true;
            }
            if (field410 == 42) {
                int var95 = field278.method2193();
                if (var95 == 65535) {
                    var95 = -1;
                }
                if (var95 == -1 && !field314) {
                    class164.method1385();
                } else if (var95 != -1 && field276 != var95 && field292 != 0 && !field314) {
                    class164.method3017(2, Statics.field565, var95, 0, field292, false);
                }
                field276 = var95;
                field410 = -1;
                return true;
            }
            if (field410 == 254) {
                int var96 = field278.method2325();
                int var97 = field278.method2194();
                if (var97 == 65535) {
                    var97 = -1;
                }
                if (field292 != 0 && var97 != -1) {
                    class164.method2101(Statics.field1881, var97, 0, field292, false);
                    field314 = true;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 237) {
                int var98 = field278.method2173();
                boolean var99 = field278.method2291() == 1;
                String var100 = "";
                boolean var101 = false;
                if (var99) {
                    var100 = field278.method2168();
                    if (method3084(var100)) {
                        var101 = true;
                    }
                }
                String var102 = field278.method2168();
                if (!var101) {
                    class10.method1881(var98, var100, var102);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 154) {
                int var103 = field278.method2204();
                int var104 = field278.method2163();
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var105 = field278.method2202();
                class155 var106 = class155.method1889(var103);
                if (var106.field2523) {
                    var106.field2631 = var104;
                    var106.field2632 = var105;
                    class46 var108 = class46.method137(var104);
                    var106.field2564 = var108.field1017;
                    var106.field2521 = var108.field1018;
                    var106.field2580 = var108.field1019;
                    var106.field2562 = var108.field1020;
                    var106.field2563 = var108.field1021;
                    var106.field2567 = var108.field1012;
                    if (var108.field1022 == 1) {
                        var106.field2570 = 1;
                    } else {
                        var106.field2570 = 2;
                    }
                    if (var106.field2533 > 0) {
                        var106.field2567 = var106.field2567 * 32 / var106.field2533;
                    }
                    method744(var106);
                } else if (var104 == -1) {
                    var106.field2623 = 0;
                    field410 = -1;
                    return true;
                } else {
                    class46 var107 = class46.method137(var104);
                    var106.field2623 = 4;
                    var106.field2557 = var104;
                    var106.field2564 = var107.field1017;
                    var106.field2521 = var107.field1018;
                    var106.field2567 = var107.field1012 * 100 / var105;
                    method744(var106);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 166) {
                int var109 = field278.method2204();
                int var110 = field278.method2183();
                class155 var111 = class155.method1889(var109);
                if (var111.field2560 != var110 || var110 == -1) {
                    var111.field2560 = var110;
                    var111.field2633 = 0;
                    var111.field2634 = 0;
                    method744(var111);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 25 || field410 == 249 || field410 == 28 || field410 == 145 || field410 == 185 || field410 == 161 || field410 == 191 || field410 == 38 || field410 == 140 || field410 == 199) {
                method11();
                field410 = -1;
                return true;
            }
            if (field410 == 203) {
                int var112 = field278.method2278();
                int var113 = field278.method2204();
                int var114 = field278.method2194();
                int var115 = field278.method2194();
                class155 var116 = class155.method1889(var113);
                if (var116.field2564 != var115 || var116.field2521 != var112 || var116.field2567 != var114) {
                    var116.field2564 = var115;
                    var116.field2521 = var112;
                    var116.field2567 = var114;
                    method744(var116);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 165) {
                int var117 = field278.method2163();
                int var118 = field278.method2291();
                int var119 = field278.method2163();
                if (field475 != 0 && var118 != 0 && field477 < 50) {
                    field478[field477] = var117;
                    field479[field477] = var118;
                    field472[field477] = var119;
                    field482[field477] = null;
                    field481[field477] = 0;
                    field477++;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 150) {
                int var123 = field278.method2278();
                if (var123 == 65535) {
                    var123 = -1;
                }
                int var124 = field278.method2278();
                if (var124 == 65535) {
                    var124 = -1;
                }
                int var125 = field278.method2297();
                int var126 = field278.method2204();
                for (int var127 = var123; var127 <= var124; var127++) {
                    long var128 = ((long) var126 << 32) + (long) var127;
                    class189 var130 = field295.method3254(var128);
                    if (var130 != null) {
                        var130.method3375();
                    }
                    field295.method3260(new class182(var125), var128);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 234) {
                while (field278.field1823 < field279) {
                    boolean var131 = field278.method2291() == 1;
                    String var132 = field278.method2168();
                    String var133 = field278.method2168();
                    int var134 = field278.method2163();
                    int var135 = field278.method2291();
                    int var136 = field278.method2291();
                    boolean var137 = (var136 & 0x2) != 0;
                    boolean var138 = (var136 & 0x1) != 0;
                    if (var134 > 0) {
                        field278.method2168();
                        field278.method2291();
                        field278.method2297();
                    }
                    field278.method2168();
                    for (int var139 = 0; var139 < field489; var139++) {
                        class16 var140 = field344[var139];
                        if (var131) {
                            if (var133.equals(var140.field224)) {
                                var140.field224 = var132;
                                var140.field213 = var133;
                                var132 = null;
                                break;
                            }
                        } else if (var132.equals(var140.field224)) {
                            if (var140.field212 != var134) {
                                boolean var141 = true;
                                for (class35 var142 = (class35) field492.method3242(); var142 != null; var142 = (class35) field492.method3243()) {
                                    if (var142.field782.equals(var132)) {
                                        if (var134 != 0 && var142.field783 == 0) {
                                            var142.method3370();
                                            var141 = false;
                                        } else if (var134 == 0 && var142.field783 != 0) {
                                            var142.method3370();
                                            var141 = false;
                                        }
                                    }
                                }
                                if (var141) {
                                    field492.method3252(new class35(var132, var134));
                                }
                                var140.field212 = var134;
                            }
                            var140.field213 = var133;
                            var140.field222 = var135;
                            var140.field214 = var137;
                            var140.field215 = var138;
                            var132 = null;
                            break;
                        }
                    }
                    if (var132 != null && field489 < 400) {
                        class16 var143 = new class16();
                        field344[field489] = var143;
                        var143.field224 = var132;
                        var143.field213 = var133;
                        var143.field212 = var134;
                        var143.field222 = var135;
                        var143.field214 = var137;
                        var143.field215 = var138;
                        field489++;
                    }
                }
                field419 = 2;
                field473 = field421;
                boolean var144 = false;
                int var145 = field489;
                while (var145 > 0) {
                    boolean var146 = true;
                    var145--;
                    for (int var147 = 0; var147 < var145; var147++) {
                        boolean var148 = false;
                        class16 var149 = field344[var147];
                        class16 var150 = field344[var147 + 1];
                        if (field480 != var149.field212 && field480 == var150.field212) {
                            var148 = true;
                        }
                        if (!var148 && var149.field212 == 0 && var150.field212 != 0) {
                            var148 = true;
                        }
                        if (!var148 && !var149.field214 && var150.field214) {
                            var148 = true;
                        }
                        if (!var148 && !var149.field215 && var150.field215) {
                            var148 = true;
                        }
                        if (var148) {
                            class16 var151 = field344[var147];
                            field344[var147] = field344[var147 + 1];
                            field344[var147 + 1] = var151;
                            var146 = false;
                        }
                    }
                    if (var146) {
                        break;
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 129) {
                class23 var152 = new class23();
                var152.field570 = field278.method2168();
                var152.field581 = field278.method2163();
                int var153 = field278.method2297();
                var152.field568 = var153;
                Statics.method2388(45);
                Statics.field1794.method2599();
                Statics.field1794 = null;
                class29.method692(var152);
                field410 = -1;
                return false;
            }
            if (field410 == 120) {
                field453 = field278.method2291();
                field454 = field278.method2291();
                field410 = -1;
                return true;
            }
            if (field410 == 94) {
                int var154 = field278.method2147();
                int var155 = field278.method2291();
                String var156 = field278.method2168();
                if (var155 >= 1 && var155 <= 8) {
                    if (var156.equalsIgnoreCase("null")) {
                        var156 = null;
                    }
                    field366[var155 - 1] = var156;
                    field367[var155 - 1] = var154 == 0;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 6) {
                byte var157 = field278.method2292();
                int var158 = field278.method2193();
                class157.field2654[var158] = var157;
                if (class157.field2655[var158] != var157) {
                    class157.field2655[var158] = var157;
                    method2718(var158);
                }
                field462[++field491 - 1 & 0x1F] = var158;
                field410 = -1;
                return true;
            }
            if (field410 == 139) {
                field419 = 1;
                field473 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 127) {
                field439 = true;
                Statics.field135 = field278.method2291();
                Statics.field129 = field278.method2291();
                Statics.field2088 = field278.method2163();
                Statics.field576 = field278.method2291();
                Statics.field980 = field278.method2291();
                if (Statics.field980 >= 100) {
                    Statics.field1335 = Statics.field135 * 128 + 64;
                    Statics.field2652 = Statics.field129 * 128 + 64;
                    Statics.field119 = method324(Statics.field1335, Statics.field2652, Statics.field2678) - Statics.field2088;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 153) {
                Statics.field934 = field278.method2218();
                Statics.field824 = field278.method2218();
                field410 = -1;
                return true;
            }
            if (field410 == 84) {
                int var159 = field278.method2202();
                class155 var160 = class155.method1889(var159);
                for (int var161 = 0; var161 < var160.field2629.length; var161++) {
                    var160.field2629[var161] = -1;
                    var160.field2629[var161] = 0;
                }
                method744(var160);
                field410 = -1;
                return true;
            }
            if (field410 == 75) {
                int var162 = field278.method2291();
                int var163 = field278.method2218();
                int var164 = field278.method2147();
                Statics.field2678 = var163 >> 1;
                Statics.field216.method609(var162, var164, (var163 & 0x1) == 1);
                field410 = -1;
                return true;
            }
            if (field410 == 30) {
                if (field387 != -1) {
                    int var165 = field387;
                    if (class155.method731(var165)) {
                        method814(Statics.field2552[var165], 0);
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 122) {
                method2862();
                field410 = -1;
                return true;
            }
            if (field410 == 64) {
                Statics.method2100();
                field410 = -1;
                return false;
            }
            if (field410 == 13) {
                int var166 = field279 + field278.field1823;
                int var167 = field278.method2163();
                int var168 = field278.method2163();
                if (field387 != var167) {
                    field387 = var167;
                    method593(field387);
                    class33.method494(field387);
                    for (int var169 = 0; var169 < 100; var169++) {
                        field444[var169] = true;
                    }
                }
                while (var168-- > 0) {
                    int var170 = field278.method2297();
                    int var171 = field278.method2163();
                    int var172 = field278.method2291();
                    class4 var173 = (class4) field398.method3254((long) var170);
                    if (var173 != null && var173.field56 != var171) {
                        method2415(var173, true);
                        var173 = null;
                    }
                    if (var173 == null) {
                        var173 = method1(var170, var171, var172);
                    }
                    var173.field62 = true;
                }
                for (class4 var174 = (class4) field398.method3257(); var174 != null; var174 = (class4) field398.method3258()) {
                    if (var174.field62) {
                        var174.field62 = false;
                    } else {
                        method2415(var174, true);
                    }
                }
                field295 = new class177(512);
                while (field278.field1823 < var166) {
                    int var175 = field278.method2297();
                    int var176 = field278.method2163();
                    int var177 = field278.method2163();
                    int var178 = field278.method2297();
                    for (int var179 = var176; var179 <= var177; var179++) {
                        long var180 = ((long) var175 << 32) + (long) var179;
                        field295.method3260(new class182(var178), var180);
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 110) {
                field253 = field278.method2278() * 30;
                field433 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 221) {
                int var182 = field278.method2297();
                int var183 = field278.method2194();
                int var184 = var183 >> 10 & 0x1F;
                int var185 = var183 >> 5 & 0x1F;
                int var186 = var183 & 0x1F;
                int var187 = (var186 << 3) + (var184 << 19) + (var185 << 11);
                class155 var188 = class155.method1889(var182);
                if (var188.field2541 != var187) {
                    var188.field2541 = var187;
                    method744(var188);
                }
                field410 = -1;
                return true;
            }
            if (field410 == 78) {
                int var189 = field278.method2194();
                int var190 = field278.method2329();
                int var191 = field278.method2147();
                class4 var192 = (class4) field398.method3254((long) var190);
                if (var192 != null) {
                    method2415(var192, var192.field56 != var189);
                }
                method1(var190, var189, var191);
                field410 = -1;
                return true;
            }
            if (field410 == 45) {
                Statics.field826 = class119.method1785(field278.method2291());
                field410 = -1;
                return true;
            }
            if (field410 == 141) {
                class192.method1783(field278, field279);
                field410 = -1;
                return true;
            }
            if (field410 == 132) {
                String var193 = field278.method2168();
                Object[] var194 = new Object[var193.length() + 1];
                for (int var195 = var193.length() - 1; var195 >= 0; var195--) {
                    if (var193.charAt(var195) == 's') {
                        var194[var195 + 1] = field278.method2168();
                    } else {
                        var194[var195 + 1] = Integer.valueOf(field278.method2297());
                    }
                }
                var194[0] = Integer.valueOf(field278.method2297());
                class1 var196 = new class1();
                var196.field12 = var194;
                class33.method2560(var196);
                field410 = -1;
                return true;
            }
            if (field410 == 102) {
                field469 = field278.method2291();
                if (field469 == 255) {
                    field469 = 0;
                }
                field490 = field278.method2291();
                if (field490 == 255) {
                    field490 = 0;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 212) {
                method2738(false);
                field410 = -1;
                return true;
            }
            if (field410 == 253) {
                int var197 = field278.method2278();
                field387 = var197;
                method593(var197);
                class33.method494(field387);
                for (int var198 = 0; var198 < 100; var198++) {
                    field444[var198] = true;
                }
                field410 = -1;
                return true;
            }
            if (field410 == 98) {
                Statics.field824 = field278.method2184();
                Statics.field934 = field278.method2218();
                while (field278.field1823 < field279) {
                    field410 = field278.method2291();
                    method11();
                }
                field410 = -1;
                return true;
            }
            if (field410 == 71) {
                Statics.field824 = field278.method2218();
                Statics.field934 = field278.method2147();
                for (int var199 = Statics.field934; var199 < Statics.field934 + 8; var199++) {
                    for (int var200 = Statics.field824; var200 < Statics.field824 + 8; var200++) {
                        if (field370[Statics.field2678][var199][var200] != null) {
                            field370[Statics.field2678][var199][var200] = null;
                            Statics.method134(var199, var200);
                        }
                    }
                }
                for (class15 var201 = (class15) field294.method3304(); var201 != null; var201 = (class15) field294.method3297()) {
                    if (var201.field208 >= Statics.field934 && var201.field208 < Statics.field934 + 8 && var201.field193 >= Statics.field824 && var201.field193 < Statics.field824 + 8 && Statics.field2678 == var201.field192) {
                        var201.field201 = 0;
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 149) {
                method765();
                field408 = field278.method2164();
                field433 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 190) {
                field439 = true;
                Statics.field2064 = field278.method2291();
                Statics.field698 = field278.method2291();
                Statics.field1889 = field278.method2163();
                Statics.field2006 = field278.method2291();
                Statics.field1339 = field278.method2291();
                if (Statics.field1339 >= 100) {
                    int var202 = Statics.field2064 * 128 + 64;
                    int var203 = Statics.field698 * 128 + 64;
                    int var204 = method324(var202, var203, Statics.field2678) - Statics.field1889;
                    int var205 = var202 - Statics.field1335;
                    int var206 = var204 - Statics.field119;
                    int var207 = var203 - Statics.field2652;
                    int var208 = (int) Math.sqrt((double) (var205 * var205 + var207 * var207));
                    Statics.field677 = (int) (Math.atan2((double) var206, (double) var208) * 325.949D) & 0x7FF;
                    Statics.field17 = (int) (Math.atan2((double) var205, (double) var207) * -325.949D) & 0x7FF;
                    if (Statics.field677 < 128) {
                        Statics.field677 = 128;
                    }
                    if (Statics.field677 > 383) {
                        Statics.field677 = 383;
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 225) {
                int var209 = field278.method2291();
                if (field278.method2291() == 0) {
                    field498[var209] = new class201();
                    field278.field1823 += 18;
                } else {
                    field278.field1823--;
                    field498[var209] = new class201(field278, false);
                }
                field431 = field421;
                field410 = -1;
                return true;
            }
            if (field410 == 172) {
                for (int var210 = 0; var210 < Statics.field1060; var210++) {
                    class47 var211 = class47.method2419(var210);
                    if (var211 != null) {
                        class157.field2654[var210] = 0;
                        class157.field2655[var210] = 0;
                    }
                }
                method765();
                field491 += 32;
                field410 = -1;
                return true;
            }
            if (field410 == 97) {
                field363 = 0;
                field315 = 0;
                field278.method2384();
                int var212 = field278.method2385(1);
                if (var212 != 0) {
                    int var213 = field278.method2385(2);
                    if (var213 == 0) {
                        field401[++field315 - 1] = 2047;
                    } else if (var213 == 1) {
                        int var214 = field278.method2385(3);
                        Statics.field216.method601(var214, false);
                        int var215 = field278.method2385(1);
                        if (var215 == 1) {
                            field401[++field315 - 1] = 2047;
                        }
                    } else if (var213 == 2) {
                        int var216 = field278.method2385(3);
                        Statics.field216.method601(var216, true);
                        int var217 = field278.method2385(3);
                        Statics.field216.method601(var217, true);
                        int var218 = field278.method2385(1);
                        if (var218 == 1) {
                            field401[++field315 - 1] = 2047;
                        }
                    } else if (var213 == 3) {
                        int var219 = field278.method2385(7);
                        int var220 = field278.method2385(7);
                        int var221 = field278.method2385(1);
                        if (var221 == 1) {
                            field401[++field315 - 1] = 2047;
                        }
                        int var222 = field278.method2385(1);
                        Statics.field2678 = field278.method2385(2);
                        Statics.field216.method609(var219, var220, var222 == 1);
                    }
                }
                int var223 = field278.method2385(8);
                if (var223 < field356) {
                    for (int var224 = var223; var224 < field356; var224++) {
                        field364[++field363 - 1] = field280[var224];
                    }
                }
                if (var223 > field356) {
                    throw new RuntimeException("");
                }
                field356 = 0;
                for (int var225 = 0; var225 < var223; var225++) {
                    int var226 = field280[var225];
                    class3 var227 = field355[var226];
                    int var228 = field278.method2385(1);
                    if (var228 == 0) {
                        field280[++field356 - 1] = var226;
                        var227.field767 = field246;
                    } else {
                        int var229 = field278.method2385(2);
                        if (var229 == 0) {
                            field280[++field356 - 1] = var226;
                            var227.field767 = field246;
                            field401[++field315 - 1] = var226;
                        } else if (var229 == 1) {
                            field280[++field356 - 1] = var226;
                            var227.field767 = field246;
                            int var230 = field278.method2385(3);
                            var227.method601(var230, false);
                            int var231 = field278.method2385(1);
                            if (var231 == 1) {
                                field401[++field315 - 1] = var226;
                            }
                        } else if (var229 == 2) {
                            field280[++field356 - 1] = var226;
                            var227.field767 = field246;
                            int var232 = field278.method2385(3);
                            var227.method601(var232, true);
                            int var233 = field278.method2385(3);
                            var227.method601(var233, true);
                            int var234 = field278.method2385(1);
                            if (var234 == 1) {
                                field401[++field315 - 1] = var226;
                            }
                        } else if (var229 == 3) {
                            field364[++field363 - 1] = var226;
                        }
                    }
                }
                method764();
                for (int var235 = 0; var235 < field315; var235++) {
                    int var236 = field401[var235];
                    class3 var237 = field355[var236];
                    int var238 = field278.method2291();
                    if ((var238 & 0x10) != 0) {
                        var238 += field278.method2291() << 8;
                    }
                    if ((var238 & 0x8) != 0) {
                        int var239 = field278.method2218();
                        byte[] var240 = new byte[var239];
                        class108 var241 = new class108(var240);
                        field278.method2206(var240, 0, var239);
                        field235[var236] = var241;
                        var237.method14(var241);
                    }
                    if ((var238 & 0x2) != 0) {
                        int var242 = field278.method2163();
                        class140 var243 = (class140) class100.method706(class140.method810(), field278.method2184());
                        boolean var244 = field278.method2147() == 1;
                        int var245 = field278.method2291();
                        int var246 = field278.field1823;
                        if (var237.field49 != null && var237.field40 != null) {
                            boolean var247 = false;
                            if (var243.field2098 && method3084(var237.field49)) {
                                var247 = true;
                            }
                            if (!var247 && field354 == 0 && !var237.field37) {
                                field262.field1823 = 0;
                                field278.method2205(field262.field1828, 0, var245);
                                field262.field1823 = 0;
                                class108 var248 = field262;
                                String var249 = class203.method664(var248, 32767);
                                String var250 = class204.method3578(Statics.method2406(var249));
                                var237.field750 = var250.trim();
                                var237.field736 = var242 >> 8;
                                var237.field745 = var242 & 0xFF;
                                var237.field735 = 150;
                                var237.field733 = var244;
                                var237.field775 = Statics.field216 != var237 && var243.field2098 && field455 != "" && var250.toLowerCase().indexOf(field455) == -1;
                                int var251;
                                if (var243.field2097) {
                                    var251 = var244 ? 91 : 1;
                                } else {
                                    var251 = var244 ? 90 : 2;
                                }
                                if (var243.field2096 == -1) {
                                    class10.method1881(var251, var237.field49, var250);
                                } else {
                                    class10.method1881(var251, class2.method2863(var243.field2096) + var237.field49, var250);
                                }
                            }
                        }
                        field278.field1823 = var245 + var246;
                    }
                    if ((var238 & 0x400) != 0) {
                        int var252 = field278.method2193();
                        int var253 = field278.method2291();
                        var237.method604(var252, var253, field246);
                        var237.field719 = field246 + 300;
                        var237.field742 = field278.method2291();
                        var237.field769 = field278.method2218();
                    }
                    if ((var238 & 0x100) != 0) {
                        var237.field746 = field278.method2184();
                        var237.field762 = field278.method2291();
                        var237.field761 = field278.method2147();
                        var237.field757 = field278.method2218();
                        var237.field729 = field278.method2163() + field246;
                        var237.field765 = field278.method2278() + field246;
                        var237.field758 = field278.method2218();
                        var237.field772 = 1;
                        var237.field766 = 0;
                    }
                    if ((var238 & 0x200) != 0) {
                        var237.field755 = field278.method2278();
                        int var254 = field278.method2204();
                        var237.field759 = var254 >> 16;
                        var237.field768 = (var254 & 0xFFFF) + field246;
                        var237.field756 = 0;
                        var237.field741 = 0;
                        if (var237.field768 > field246) {
                            var237.field756 = -1;
                        }
                        if (var237.field755 == 65535) {
                            var237.field755 = -1;
                        }
                    }
                    if ((var238 & 0x80) != 0) {
                        var237.field727 = field278.method2163();
                        var237.field720 = field278.method2278();
                    }
                    if ((var238 & 0x4) != 0) {
                        int var255 = field278.method2194();
                        if (var255 == 65535) {
                            var255 = -1;
                        }
                        int var256 = field278.method2147();
                        method148(var237, var255, var256);
                    }
                    if ((var238 & 0x40) != 0) {
                        int var257 = field278.method2278();
                        int var258 = field278.method2291();
                        var237.method604(var257, var258, field246);
                        var237.field719 = field246 + 300;
                        var237.field742 = field278.method2291();
                        var237.field769 = field278.method2291();
                    }
                    if ((var238 & 0x1) != 0) {
                        var237.field744 = field278.method2278();
                        if (var237.field744 == 65535) {
                            var237.field744 = -1;
                        }
                    }
                    if ((var238 & 0x20) != 0) {
                        var237.field750 = field278.method2168();
                        if (var237.field750.charAt(0) == '~') {
                            var237.field750 = var237.field750.substring(1);
                            class10.method1881(2, var237.field49, var237.field750);
                        } else if (Statics.field216 == var237) {
                            class10.method1881(2, var237.field49, var237.field750);
                        }
                        var237.field733 = false;
                        var237.field736 = 0;
                        var237.field745 = 0;
                        var237.field735 = 150;
                    }
                }
                for (int var259 = 0; var259 < field363; var259++) {
                    int var260 = field364[var259];
                    if (field246 != field355[var260].field767) {
                        field355[var260] = null;
                    }
                }
                if (field279 != field278.field1823) {
                    throw new RuntimeException(field278.field1823 + class2.field26 + field279);
                }
                for (int var261 = 0; var261 < field356; var261++) {
                    if (field355[field280[var261]] == null) {
                        throw new RuntimeException(var261 + class2.field26 + field356);
                    }
                }
                field410 = -1;
                return true;
            }
            if (field410 == 162) {
                field359 = field421;
                if (field279 == 0) {
                    field427 = null;
                    field463 = null;
                    Statics.field1050 = 0;
                    Statics.field2065 = null;
                    field410 = -1;
                    return true;
                }
                field463 = field278.method2168();
                long var262 = field278.method2166();
                long var264 = var262;
                String var266;
                if (var262 <= 0L || var262 >= 6582952005840035281L) {
                    var266 = null;
                } else if (var262 % 37L == 0L) {
                    var266 = null;
                } else {
                    int var267 = 0;
                    for (long var268 = var262; var268 != 0L; var268 /= 37L) {
                        var267++;
                    }
                    StringBuilder var270 = new StringBuilder(var267);
                    while (var264 != 0L) {
                        long var271 = var264;
                        var264 /= 37L;
                        var270.append(class210.field3012[(int) (var271 - var264 * 37L)]);
                    }
                    var266 = var270.reverse().toString();
                }
                field427 = var266;
                Statics.field1471 = field278.method2292();
                int var273 = field278.method2291();
                if (var273 == 255) {
                    field410 = -1;
                    return true;
                }
                Statics.field1050 = var273;
                class22[] var274 = new class22[100];
                for (int var275 = 0; var275 < Statics.field1050; var275++) {
                    var274[var275] = new class22();
                    var274[var275].field559 = field278.method2168();
                    var274[var275].field558 = class212.method3386(var274[var275].field559, Statics.field237);
                    var274[var275].field563 = field278.method2163();
                    var274[var275].field560 = field278.method2292();
                    field278.method2168();
                    if (var274[var275].field559.equals(Statics.field216.field49)) {
                        Statics.field596 = var274[var275].field560;
                    }
                }
                boolean var276 = false;
                int var277 = Statics.field1050;
                while (var277 > 0) {
                    boolean var278 = true;
                    var277--;
                    for (int var279 = 0; var279 < var277; var279++) {
                        if (var274[var279].field558.compareTo(var274[var279 + 1].field558) > 0) {
                            class22 var280 = var274[var279];
                            var274[var279] = var274[var279 + 1];
                            var274[var279 + 1] = var280;
                            var278 = false;
                        }
                    }
                    if (var278) {
                        break;
                    }
                }
                Statics.field2065 = var274;
                field410 = -1;
                return true;
            }
            if (field410 == 133) {
                String var281 = field278.method2168();
                long var282 = field278.method2166();
                long var284 = (long) field278.method2163();
                long var286 = (long) field278.method2214();
                class140 var288 = (class140) class100.method706(class140.method810(), field278.method2291());
                long var289 = (var284 << 32) + var286;
                boolean var291 = false;
                for (int var292 = 0; var292 < 100; var292++) {
                    if (field456[var292] == var289) {
                        var291 = true;
                        break;
                    }
                }
                if (var288.field2098 && method3084(var281)) {
                    var291 = true;
                }
                if (!var291 && field354 == 0) {
                    field456[field457] = var289;
                    field457 = (field457 + 1) % 100;
                    String var293 = class204.method3578(Statics.method2406(class203.method2998(field278)));
                    if (var288.field2096 == -1) {
                        class10.method2567(9, var281, var293, class210.method2459(var282));
                    } else {
                        class10.method2567(9, class2.method2863(var288.field2096) + var281, var293, class210.method2459(var282));
                    }
                }
                field410 = -1;
                return true;
            }
            class137.method2490("" + field410 + class2.field26 + field285 + class2.field26 + field286 + class2.field26 + field279, (Throwable) null);
            Statics.method2100();
        } catch (IOException var299) {
            method496();
        } catch (Exception var300) {
            String var296 = "" + field410 + class2.field26 + field285 + class2.field26 + field286 + class2.field26 + field279 + class2.field26 + (Statics.field183 + Statics.field216.field749[0]) + class2.field26 + (Statics.field780 + Statics.field216.field774[0]) + class2.field26;
            for (int var297 = 0; var297 < field279 && var297 < 50; var297++) {
                var296 = var296 + field278.field1828[var297] + class2.field26;
            }
            class137.method2490(var296, var300);
            Statics.method2100();
        }
        return true;
    }

    @ObfuscatedName("y.bl(I)V")
    public static final void method11() {
        if (field410 == 140) {
            int var0 = field278.method2218();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field298[var1];
            int var4 = field278.method2147();
            int var5 = (var4 >> 4 & 0x7) + Statics.field934;
            int var6 = (var4 & 0x7) + Statics.field824;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method37(Statics.field2678, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field410 == 249) {
            int var7 = field278.method2291();
            int var8 = (var7 >> 4 & 0x7) + Statics.field934;
            int var9 = (var7 & 0x7) + Statics.field824;
            int var10 = field278.method2163();
            int var11 = field278.method2163();
            int var12 = field278.method2163();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class180 var13 = field370[Statics.field2678][var8][var9];
                if (var13 != null) {
                    for (class26 var14 = (class26) var13.method3304(); var14 != null; var14 = (class26) var13.method3297()) {
                        if ((var10 & 0x7FFF) == var14.field606 && var14.field609 == var11) {
                            var14.field609 = var12;
                            break;
                        }
                    }
                    Statics.method134(var8, var9);
                }
            }
        } else if (field410 == 38) {
            int var15 = field278.method2147();
            int var16 = (var15 >> 4 & 0x7) + Statics.field934;
            int var17 = (var15 & 0x7) + Statics.field824;
            int var18 = field278.method2194();
            int var19 = field278.method2147();
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = field298[var20];
            if (var16 >= 0 && var17 >= 0 && var16 < 103 && var17 < 103) {
                if (var22 == 0) {
                    class81 var23 = Statics.field2514.method1642(Statics.field2678, var16, var17);
                    if (var23 != null) {
                        int var24 = var23.field1412 >> 14 & 0x7FFF;
                        if (var20 == 2) {
                            var23.field1410 = new class11(var24, 2, var21 + 4, Statics.field2678, var16, var17, var18, false, var23.field1410);
                            var23.field1405 = new class11(var24, 2, var21 + 1 & 0x3, Statics.field2678, var16, var17, var18, false, var23.field1405);
                        } else {
                            var23.field1410 = new class11(var24, var20, var21, Statics.field2678, var16, var17, var18, false, var23.field1410);
                        }
                    }
                }
                if (var22 == 1) {
                    class88 var25 = Statics.field2514.method1638(Statics.field2678, var16, var17);
                    if (var25 != null) {
                        int var26 = var25.field1489 >> 14 & 0x7FFF;
                        if (var20 == 4 || var20 == 5) {
                            var25.field1487 = new class11(var26, 4, var21, Statics.field2678, var16, var17, var18, false, var25.field1487);
                        } else if (var20 == 6) {
                            var25.field1487 = new class11(var26, 4, var21 + 4, Statics.field2678, var16, var17, var18, false, var25.field1487);
                        } else if (var20 == 7) {
                            var25.field1487 = new class11(var26, 4, (var21 + 2 & 0x3) + 4, Statics.field2678, var16, var17, var18, false, var25.field1487);
                        } else if (var20 == 8) {
                            var25.field1487 = new class11(var26, 4, var21 + 4, Statics.field2678, var16, var17, var18, false, var25.field1487);
                            var25.field1488 = new class11(var26, 4, (var21 + 2 & 0x3) + 4, Statics.field2678, var16, var17, var18, false, var25.field1488);
                        }
                    }
                }
                if (var22 == 2) {
                    class92 var27 = Statics.field2514.method1770(Statics.field2678, var16, var17);
                    if (var20 == 11) {
                        var20 = 10;
                    }
                    if (var27 != null) {
                        var27.field1540 = new class11(var27.field1548 >> 14 & 0x7FFF, var20, var21, Statics.field2678, var16, var17, var18, false, var27.field1540);
                    }
                }
                if (var22 == 3) {
                    class87 var28 = Statics.field2514.method1615(Statics.field2678, var16, var17);
                    if (var28 != null) {
                        var28.field1473 = new class11(var28.field1474 >> 14 & 0x7FFF, 22, var21, Statics.field2678, var16, var17, var18, false, var28.field1473);
                    }
                }
            }
        } else if (field410 == 185) {
            int var29 = field278.method2291();
            int var30 = (var29 >> 4 & 0x7) + Statics.field934;
            int var31 = (var29 & 0x7) + Statics.field824;
            int var32 = var30 + field278.method2292();
            int var33 = var31 + field278.method2292();
            int var34 = field278.method2164();
            int var35 = field278.method2163();
            int var36 = field278.method2291() * 4;
            int var37 = field278.method2291() * 4;
            int var38 = field278.method2163();
            int var39 = field278.method2163();
            int var40 = field278.method2291();
            int var41 = field278.method2291();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                int var42 = var30 * 128 + 64;
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                class7 var46 = new class7(var35, Statics.field2678, var42, var43, method324(var42, var43, Statics.field2678) - var36, field246 + var38, field246 + var39, var40, var41, var34, var37);
                var46.method98(var44, var45, method324(var44, var45, Statics.field2678) - var37, field246 + var38);
                field372.method3278(var46);
            }
        } else {
            if (field410 == 28) {
                byte var47 = field278.method2292();
                byte var48 = field278.method2186();
                int var49 = field278.method2163();
                int var50 = field278.method2193();
                byte var51 = field278.method2188();
                int var52 = field278.method2278();
                byte var53 = field278.method2337();
                int var54 = field278.method2194();
                int var55 = field278.method2184();
                int var56 = (var55 >> 4 & 0x7) + Statics.field934;
                int var57 = (var55 & 0x7) + Statics.field824;
                int var58 = field278.method2147();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field298[var59];
                class3 var62;
                if (field361 == var49) {
                    var62 = Statics.field216;
                } else {
                    var62 = field355[var49];
                }
                if (var62 != null) {
                    class37 var63 = class37.method826(var50);
                    int var64;
                    int var65;
                    if (var60 == 1 || var60 == 3) {
                        var64 = var63.field869;
                        var65 = var63.field845;
                    } else {
                        var64 = var63.field845;
                        var65 = var63.field869;
                    }
                    int var66 = (var64 >> 1) + var56;
                    int var67 = (var64 + 1 >> 1) + var56;
                    int var68 = (var65 >> 1) + var57;
                    int var69 = (var65 + 1 >> 1) + var57;
                    int[][] var70 = class6.field76[Statics.field2678];
                    int var71 = var70[var66][var68] + var70[var67][var68] + var70[var66][var69] + var70[var67][var69] >> 2;
                    int var72 = (var56 << 7) + (var64 << 6);
                    int var73 = (var57 << 7) + (var65 << 6);
                    class99 var74 = var63.method659(var59, var60, var70, var72, var71, var73);
                    if (var74 != null) {
                        method37(Statics.field2678, var56, var57, var61, -1, 0, 0, var52 + 1, var54 + 1);
                        var62.field38 = field246 + var52;
                        var62.field41 = field246 + var54;
                        var62.field45 = var74;
                        var62.field52 = var56 * 128 + var64 * 64;
                        var62.field46 = var57 * 128 + var65 * 64;
                        var62.field43 = var71;
                        if (var51 > var47) {
                            byte var75 = var51;
                            var51 = var47;
                            var47 = var75;
                        }
                        if (var53 > var48) {
                            byte var76 = var53;
                            var53 = var48;
                            var48 = var76;
                        }
                        var62.field39 = var51 + var56;
                        var62.field48 = var47 + var56;
                        var62.field47 = var53 + var57;
                        var62.field33 = var48 + var57;
                    }
                }
            }
            if (field410 == 191) {
                int var77 = field278.method2163();
                int var78 = field278.method2278();
                int var79 = field278.method2291();
                int var80 = (var79 >> 4 & 0x7) + Statics.field934;
                int var81 = (var79 & 0x7) + Statics.field824;
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    class26 var82 = new class26();
                    var82.field606 = var78;
                    var82.field609 = var77;
                    if (field370[Statics.field2678][var80][var81] == null) {
                        field370[Statics.field2678][var80][var81] = new class180();
                    }
                    field370[Statics.field2678][var80][var81].method3278(var82);
                    Statics.method134(var80, var81);
                }
            } else if (field410 == 199) {
                int var83 = field278.method2147();
                int var84 = var83 >> 2;
                int var85 = var83 & 0x3;
                int var86 = field298[var84];
                int var87 = field278.method2193();
                int var88 = field278.method2218();
                int var89 = (var88 >> 4 & 0x7) + Statics.field934;
                int var90 = (var88 & 0x7) + Statics.field824;
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    method37(Statics.field2678, var89, var90, var86, var87, var84, var85, 0, -1);
                }
            } else if (field410 == 161) {
                int var91 = field278.method2278();
                int var92 = field278.method2147();
                int var93 = (var92 >> 4 & 0x7) + Statics.field934;
                int var94 = (var92 & 0x7) + Statics.field824;
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    class180 var95 = field370[Statics.field2678][var93][var94];
                    if (var95 != null) {
                        for (class26 var96 = (class26) var95.method3304(); var96 != null; var96 = (class26) var95.method3297()) {
                            if ((var91 & 0x7FFF) == var96.field606) {
                                var96.method3375();
                                break;
                            }
                        }
                        if (var95.method3304() == null) {
                            field370[Statics.field2678][var93][var94] = null;
                        }
                        Statics.method134(var93, var94);
                    }
                }
            } else {
                if (field410 == 25) {
                    int var97 = field278.method2291();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field934;
                    int var99 = (var97 & 0x7) + Statics.field824;
                    int var100 = field278.method2163();
                    int var101 = field278.method2291();
                    int var102 = var101 >> 4 & 0xF;
                    int var103 = var101 & 0x7;
                    int var104 = field278.method2291();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                        int var105 = var102 + 1;
                        if (Statics.field216.field749[0] >= var98 - var105 && Statics.field216.field749[0] <= var98 + var105 && Statics.field216.field774[0] >= var99 - var105 && Statics.field216.field774[0] <= var99 + var105 && field476 != 0 && var103 > 0 && field477 < 50) {
                            field478[field477] = var100;
                            field479[field477] = var103;
                            field472[field477] = var104;
                            field482[field477] = null;
                            field481[field477] = (var98 << 16) + (var99 << 8) + var102;
                            field477++;
                        }
                    }
                }
                if (field410 == 145) {
                    int var106 = field278.method2291();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field934;
                    int var108 = (var106 & 0x7) + Statics.field824;
                    int var109 = field278.method2163();
                    int var110 = field278.method2291();
                    int var111 = field278.method2163();
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        int var112 = var107 * 128 + 64;
                        int var113 = var108 * 128 + 64;
                        class27 var114 = new class27(var109, Statics.field2678, var112, var113, method324(var112, var113, Statics.field2678) - var110, var111, field246);
                        field373.method3278(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.bh(IIIIIIIIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field294.method3304(); var10 != null; var10 = (class15) field294.method3297()) {
            if (var10.field192 == arg0 && var10.field208 == arg1 && var10.field193 == arg2 && var10.field191 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field192 = arg0;
            var9.field191 = arg3;
            var9.field208 = arg1;
            var9.field193 = arg2;
            method2377(var9);
            field294.method3278(var9);
        }
        var9.field197 = arg4;
        var9.field203 = arg5;
        var9.field199 = arg6;
        var9.field200 = arg7;
        var9.field201 = arg8;
    }

    @ObfuscatedName("dx.bv(Lr;I)V")
    public static final void method2377(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field191 == 0) {
            var1 = Statics.field2514.method1641(arg0.field192, arg0.field208, arg0.field193);
        }
        if (arg0.field191 == 1) {
            var1 = Statics.field2514.method1672(arg0.field192, arg0.field208, arg0.field193);
        }
        if (arg0.field191 == 2) {
            var1 = Statics.field2514.method1643(arg0.field192, arg0.field208, arg0.field193);
        }
        if (arg0.field191 == 3) {
            var1 = Statics.field2514.method1645(arg0.field192, arg0.field208, arg0.field193);
        }
        if (var1 != 0) {
            int var5 = Statics.field2514.method1619(arg0.field192, arg0.field208, arg0.field193, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field194 = var2;
        arg0.field206 = var3;
        arg0.field190 = var4;
    }

    @ObfuscatedName("bb.be(B)V")
    public static final void method1424() {
        for (class15 var0 = (class15) field294.method3304(); var0 != null; var0 = (class15) field294.method3297()) {
            if (var0.field201 > 0) {
                var0.field201--;
            }
            if (var0.field201 != 0) {
                if (var0.field200 > 0) {
                    var0.field200--;
                }
                if (var0.field200 == 0 && var0.field208 >= 1 && var0.field193 >= 1 && var0.field208 <= 102 && var0.field193 <= 102 && (var0.field197 < 0 || class6.method2403(var0.field197, var0.field203))) {
                    method103(var0.field192, var0.field191, var0.field208, var0.field193, var0.field197, var0.field199, var0.field203);
                    var0.field200 = -1;
                    if (var0.field197 == var0.field194 && var0.field194 == -1) {
                        var0.method3375();
                    } else if (var0.field197 == var0.field194 && var0.field199 == var0.field190 && var0.field206 == var0.field203) {
                        var0.method3375();
                    }
                }
            } else if (var0.field194 < 0 || class6.method2403(var0.field194, var0.field206)) {
                method103(var0.field192, var0.field191, var0.field208, var0.field193, var0.field194, var0.field190, var0.field206);
                var0.method3375();
            }
        }
    }

    @ObfuscatedName("x.bd(IIIIIIIB)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field242 && Statics.field2678 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2514.method1641(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2514.method1672(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2514.method1643(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2514.method1645(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2514.method1619(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2514.method1692(arg0, arg2, arg3);
                class37 var15 = class37.method826(var12);
                if (var15.field847 != 0) {
                    field329[arg0].method3640(arg2, arg3, var13, var14, var15.field848);
                }
            }
            if (arg1 == 1) {
                Statics.field2514.method1627(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2514.method1634(arg0, arg2, arg3);
                class37 var16 = class37.method826(var12);
                if (var16.field845 + arg2 > 103 || var16.field845 + arg3 > 103 || var16.field869 + arg2 > 103 || var16.field869 + arg3 > 103) {
                    return;
                }
                if (var16.field847 != 0) {
                    field329[arg0].method3641(arg2, arg3, var16.field845, var16.field869, var14, var16.field848);
                }
            }
            if (arg1 == 3) {
                Statics.field2514.method1673(arg0, arg2, arg3);
                class37 var17 = class37.method826(var12);
                if (var17.field847 == 1) {
                    field329[arg0].method3650(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field70[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method1989(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2514, field329[arg0]);
    }

    @ObfuscatedName("av.bn(I)V")
    public static final void method764() {
        while (true) {
            if (field278.method2397(field279) >= 11) {
                int var0 = field278.method2385(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field355[var0] == null) {
                        field355[var0] = new class3();
                        if (field235[var0] != null) {
                            field355[var0].method14(field235[var0]);
                        }
                        var1 = true;
                    }
                    field280[++field356 - 1] = var0;
                    class3 var2 = field355[var0];
                    var2.field767 = field246;
                    int var3 = field251[field278.method2385(3)];
                    if (var1) {
                        var2.field737 = var2.field721 = var3;
                    }
                    int var4 = field278.method2385(1);
                    if (var4 == 1) {
                        field401[++field315 - 1] = var0;
                    }
                    int var5 = field278.method2385(1);
                    int var6 = field278.method2385(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field278.method2385(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method609(Statics.field216.field749[0] + var6, Statics.field216.field774[0] + var7, var5 == 1);
                    continue;
                }
            }
            field278.method2386();
            return;
        }
    }

    @ObfuscatedName("eh.bc(I)V")
    public static final void method2862() {
        field363 = 0;
        field315 = 0;
        method1885();
        while (field278.method2397(field279) >= 27) {
            int var0 = field278.method2385(15);
            if (var0 == 32767) {
                break;
            }
            boolean var4 = false;
            if (field273[var0] == null) {
                field273[var0] = new class31();
                var4 = true;
            }
            class31 var5 = field273[var0];
            field423[++field274 - 1] = var0;
            var5.field767 = field246;
            int var6 = field278.method2385(1);
            int var7 = field278.method2385(5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = field278.method2385(5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = field278.method2385(1);
            if (var9 == 1) {
                field401[++field315 - 1] = var0;
            }
            int var10 = field251[field278.method2385(3)];
            if (var4) {
                var5.field737 = var5.field721 = var10;
            }
            var5.field687 = class36.method597(field278.method2385(14));
            var5.field743 = var5.field687.field794;
            var5.field771 = var5.field687.field801;
            if (var5.field771 == 0) {
                var5.field721 = 0;
            }
            var5.field722 = var5.field687.field800;
            var5.field763 = var5.field687.field819;
            var5.field773 = var5.field687.field805;
            var5.field730 = var5.field687.field818;
            var5.field724 = var5.field687.field797;
            var5.field725 = var5.field687.field798;
            var5.field726 = var5.field687.field799;
            var5.method609(Statics.field216.field749[0] + var7, Statics.field216.field774[0] + var8, var6 == 1);
        }
        field278.method2386();
        method468();
        for (int var1 = 0; var1 < field363; var1++) {
            int var2 = field364[var1];
            if (field246 != field273[var2].field767) {
                field273[var2].field687 = null;
                field273[var2] = null;
            }
        }
        if (field279 != field278.field1823) {
            throw new RuntimeException(field278.field1823 + class2.field26 + field279);
        }
        for (int var3 = 0; var3 < field274; var3++) {
            if (field273[field423[var3]] == null) {
                throw new RuntimeException(var3 + class2.field26 + field274);
            }
        }
    }

    @ObfuscatedName("ct.bk(I)V")
    public static final void method1885() {
        field278.method2384();
        int var0 = field278.method2385(8);
        if (var0 < field274) {
            for (int var1 = var0; var1 < field274; var1++) {
                field364[++field363 - 1] = field423[var1];
            }
        }
        if (var0 > field274) {
            throw new RuntimeException("");
        }
        field274 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field423[var2];
            class31 var4 = field273[var3];
            int var5 = field278.method2385(1);
            if (var5 == 0) {
                field423[++field274 - 1] = var3;
                var4.field767 = field246;
            } else {
                int var6 = field278.method2385(2);
                if (var6 == 0) {
                    field423[++field274 - 1] = var3;
                    var4.field767 = field246;
                    field401[++field315 - 1] = var3;
                } else if (var6 == 1) {
                    field423[++field274 - 1] = var3;
                    var4.field767 = field246;
                    int var7 = field278.method2385(3);
                    var4.method601(var7, false);
                    int var8 = field278.method2385(1);
                    if (var8 == 1) {
                        field401[++field315 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field423[++field274 - 1] = var3;
                    var4.field767 = field246;
                    int var9 = field278.method2385(3);
                    var4.method601(var9, true);
                    int var10 = field278.method2385(3);
                    var4.method601(var10, true);
                    int var11 = field278.method2385(1);
                    if (var11 == 1) {
                        field401[++field315 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field364[++field363 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("e.bf(I)V")
    public static final void method468() {
        for (int var0 = 0; var0 < field315; var0++) {
            int var1 = field401[var0];
            class31 var2 = field273[var1];
            int var3 = field278.method2291();
            if ((var3 & 0x8) != 0) {
                var2.field755 = field278.method2163();
                int var4 = field278.method2202();
                var2.field759 = var4 >> 16;
                var2.field768 = (var4 & 0xFFFF) + field246;
                var2.field756 = 0;
                var2.field741 = 0;
                if (var2.field768 > field246) {
                    var2.field756 = -1;
                }
                if (var2.field755 == 65535) {
                    var2.field755 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var5 = field278.method2218();
                int var6 = field278.method2184();
                var2.method604(var5, var6, field246);
                var2.field719 = field246 + 300;
                var2.field742 = field278.method2194();
                var2.field769 = field278.method2194();
            }
            if ((var3 & 0x40) != 0) {
                var2.field750 = field278.method2168();
                var2.field735 = 100;
            }
            if ((var3 & 0x1) != 0) {
                var2.field744 = field278.method2193();
                if (var2.field744 == 65535) {
                    var2.field744 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var7 = field278.method2291();
                int var8 = field278.method2147();
                var2.method604(var7, var8, field246);
                var2.field719 = field246 + 300;
                var2.field742 = field278.method2193();
                var2.field769 = field278.method2193();
            }
            if ((var3 & 0x80) != 0) {
                int var9 = field278.method2163();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field278.method2218();
                if (var2.field760 == var9 && var9 != -1) {
                    int var11 = class39.method821(var9).field915;
                    if (var11 == 1) {
                        var2.field751 = 0;
                        var2.field752 = 0;
                        var2.field753 = var10;
                        var2.field754 = 0;
                    }
                    if (var11 == 2) {
                        var2.field754 = 0;
                    }
                } else if (var9 == -1 || var2.field760 == -1 || class39.method821(var9).field909 >= class39.method821(var2.field760).field909) {
                    var2.field760 = var9;
                    var2.field751 = 0;
                    var2.field752 = 0;
                    var2.field753 = var10;
                    var2.field754 = 0;
                    var2.field766 = var2.field772;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field727 = field278.method2193();
                var2.field720 = field278.method2278();
            }
            if ((var3 & 0x10) != 0) {
                var2.field687 = class36.method597(field278.method2163());
                var2.field743 = var2.field687.field794;
                var2.field771 = var2.field687.field801;
                var2.field722 = var2.field687.field800;
                var2.field763 = var2.field687.field819;
                var2.field773 = var2.field687.field805;
                var2.field730 = var2.field687.field818;
                var2.field724 = var2.field687.field797;
                var2.field725 = var2.field687.field798;
                var2.field726 = var2.field687.field799;
            }
        }
    }

    @ObfuscatedName("cr.bt(IIB)V")
    public static final void method1987(int arg0, int arg1) {
        if (field379 < 2 && field390 == 0 && !field392) {
            return;
        }
        String var2;
        if (field390 == 1 && field379 < 2) {
            var2 = class145.field2287 + class145.field2297 + field391 + " " + class2.field23;
        } else if (field392 && field379 < 2) {
            var2 = field395 + class145.field2297 + field396 + " " + class2.field23;
        } else {
            int var3 = field379 - 1;
            String var4;
            if (field385[var3].length() > 0) {
                var4 = field240[var3] + class145.field2297 + field385[var3];
            } else {
                var4 = field240[var3];
            }
            var2 = var4;
        }
        if (field379 > 2) {
            var2 = var2 + class2.method460(16777215) + " " + '/' + " " + (field379 - 2) + class145.field2291;
        }
        Statics.field1649.method3504(var2, arg0 + 4, arg1 + 15, 16777215, 0, field246 / 1000);
    }

    @ObfuscatedName("cn.bo(IIIIB)V")
    public static final void method1882(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field442; var4++) {
            if (field449[var4] + field447[var4] > arg0 && field447[var4] < arg0 + arg2 && field474[var4] + field368[var4] > arg1 && field368[var4] < arg1 + arg3) {
                field444[var4] = true;
            }
        }
    }

    @ObfuscatedName("l.bg(IIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field442; var4++) {
            if (field449[var4] + field447[var4] > arg0 && field447[var4] < arg0 + arg2 && field474[var4] + field368[var4] > arg1 && field368[var4] < arg1 + arg3) {
                field371[var4] = true;
            }
        }
    }

    @ObfuscatedName("eu.bi(III)V")
    public static final void method2932(int arg0, int arg1) {
        int var2 = Statics.field1649.method3500(class145.field2260);
        for (int var3 = 0; var3 < field379; var3++) {
            class205 var4 = Statics.field1649;
            String var5;
            if (field385[var3].length() > 0) {
                var5 = field240[var3] + class145.field2297 + field385[var3];
            } else {
                var5 = field240[var3];
            }
            int var6 = var4.method3500(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field379 * 15 + 21;
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
        field378 = true;
        Statics.field1904 = var8;
        Statics.field2484 = var9;
        Statics.field2510 = var2;
        Statics.field624 = field379 * 15 + 22;
    }

    @ObfuscatedName("ep.bx(II)Z")
    public static final boolean method2933(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field382[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("x.bs(Lah;III)V")
    public static final void method104(class28 arg0, int arg1, int arg2) {
        method1609(arg0.field635, arg0.field628, arg0.field631, arg0.field629, arg0.field630, arg0.field630, arg1, arg2);
    }

    @ObfuscatedName("bz.bu(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method1609(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 12) {
            class31 var8 = field273[arg3];
            if (var8 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(27);
                field261.method2148(arg3);
                field261.method2180(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(186);
            field261.method2180(class126.field1958[82] ? 1 : 0);
            field261.method2339(Statics.field1839);
            field261.method2191(field495);
            field261.method2148(Statics.field780 + arg1);
            field261.method2190(arg3);
            field261.method2191(Statics.field183 + arg0);
        }
        if (arg2 == 22) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(79);
            field261.method2189(arg3);
            field261.method2189(Statics.field780 + arg1);
            field261.method2190(Statics.field183 + arg0);
            field261.method2185(class126.field1958[82] ? 1 : 0);
        }
        if (arg2 == 5) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(168);
            field261.method2190(Statics.field183 + arg0);
            field261.method2189(arg3 >> 14 & 0x7FFF);
            field261.method2185(class126.field1958[82] ? 1 : 0);
            field261.method2190(Statics.field780 + arg1);
        }
        if (arg2 == 1005) {
            class155 var9 = class155.method1889(arg1);
            if (var9 == null || var9.field2630[arg0] < 100000) {
                field261.method2391(158);
                field261.method2189(arg3);
            } else {
                class10.method1881(27, "", var9.field2630[arg0] + " x " + class46.method137(arg3).field1014);
            }
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 18) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(114);
            field261.method2191(arg3);
            field261.method2226(class126.field1958[82] ? 1 : 0);
            field261.method2189(Statics.field780 + arg1);
            field261.method2189(Statics.field183 + arg0);
        }
        if (arg2 == 11) {
            class31 var10 = field273[arg3];
            if (var10 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(116);
                field261.method2189(arg3);
                field261.method2252(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class155 var11 = class155.method2715(arg1, arg0);
            if (var11 != null) {
                field261.method2391(224);
                field261.method2148(field495);
                field261.method2148(var11.field2631);
                field261.method2201(Statics.field1839);
                field261.method2189(arg0);
                field261.method2201(arg1);
                field261.method2191(field394);
            }
        }
        if (arg2 == 39) {
            field261.method2391(83);
            field261.method2148(arg3);
            field261.method2150(arg1);
            field261.method2190(arg0);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 42) {
            field261.method2391(88);
            field261.method2150(arg1);
            field261.method2189(arg0);
            field261.method2148(arg3);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 47) {
            class3 var12 = field355[arg3];
            if (var12 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(184);
                field261.method2191(arg3);
                field261.method2180(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field261.method2391(105);
            field261.method2200(arg1);
            field261.method2148(arg3);
            field261.method2190(arg0);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 15) {
            class3 var13 = field355[arg3];
            if (var13 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(52);
                field261.method2189(arg3);
                field261.method2185(class126.field1958[82] ? 1 : 0);
                field261.method2339(Statics.field1839);
                field261.method2190(field495);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class155 var14 = class155.method2715(arg1, arg0);
            if (var14 != null) {
                method2834(arg3, arg1, arg0, var14.field2631, arg5);
            }
        }
        if (arg2 == 31) {
            field261.method2391(198);
            field261.method2200(arg1);
            field261.method2148(arg0);
            field261.method2201(Statics.field1945);
            field261.method2190(arg3);
            field261.method2189(Statics.field221);
            field261.method2190(Statics.field2815);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 2) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(229);
            field261.method2148(Statics.field780 + arg1);
            field261.method2148(Statics.field183 + arg0);
            field261.method2150(Statics.field1839);
            field261.method2148(field495);
            field261.method2148(arg3 >> 14 & 0x7FFF);
            field261.method2180(class126.field1958[82] ? 1 : 0);
        }
        if (arg2 == 29) {
            field261.method2391(170);
            field261.method2150(arg1);
            class155 var15 = class155.method1889(arg1);
            if (var15.field2627 != null && var15.field2627[0][0] == 5) {
                int var16 = var15.field2627[0][1];
                if (class157.field2655[var16] != var15.field2625[0]) {
                    class157.field2655[var16] = var15.field2625[0];
                    method2718(var16);
                }
            }
        }
        if (arg2 == 46) {
            class3 var17 = field355[arg3];
            if (var17 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(136);
                field261.method2252(class126.field1958[82] ? 1 : 0);
                field261.method2189(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var18 = field355[arg3];
            if (var18 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(232);
                field261.method2190(arg3);
                field261.method2180(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class155 var19 = class155.method1889(arg1);
            boolean var20 = true;
            if (var19.field2528 > 0) {
                var20 = method980(var19);
            }
            if (var20) {
                field261.method2391(170);
                field261.method2150(arg1);
            }
        }
        if (arg2 == 41) {
            field261.method2391(252);
            field261.method2190(arg0);
            field261.method2189(arg3);
            field261.method2150(arg1);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 25) {
            class155 var21 = class155.method2715(arg1, arg0);
            if (var21 != null) {
                method3203();
                method2555(arg1, arg0, class159.method2864(method534(var21)), var21.field2631);
                field390 = 0;
                String var22;
                if (class159.method2864(method534(var21)) == 0) {
                    var22 = null;
                } else if (var21.field2545 == null || var21.field2545.trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = var21.field2545;
                }
                field395 = var22;
                if (field395 == null) {
                    field395 = "Null";
                }
                if (var21.field2523) {
                    field396 = var21.field2585 + class2.method460(16777215);
                } else {
                    field396 = class2.method460(65280) + var21.field2609 + class2.method460(16777215);
                }
            }
            return;
        }
        if (arg2 == 8) {
            class31 var23 = field273[arg3];
            if (var23 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(49);
                field261.method2190(arg3);
                field261.method2150(Statics.field1839);
                field261.method2189(field495);
                field261.method2180(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field261.method2391(158);
            field261.method2189(arg3);
        }
        if (arg2 == 19) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(12);
            field261.method2148(arg3);
            field261.method2190(Statics.field183 + arg0);
            field261.method2190(Statics.field780 + arg1);
            field261.method2185(class126.field1958[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field261.method2391(170);
            field261.method2150(arg1);
            class155 var24 = class155.method1889(arg1);
            if (var24.field2627 != null && var24.field2627[0][0] == 5) {
                int var25 = var24.field2627[0][1];
                class157.field2655[var25] = 1 - class157.field2655[var25];
                method2718(var25);
            }
        }
        if (arg2 == 34) {
            field261.method2391(148);
            field261.method2191(arg0);
            field261.method2148(arg3);
            field261.method2150(arg1);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 36) {
            field261.method2391(66);
            field261.method2148(arg3);
            field261.method2191(arg0);
            field261.method2200(arg1);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 45) {
            class3 var26 = field355[arg3];
            if (var26 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(228);
                field261.method2252(class126.field1958[82] ? 1 : 0);
                field261.method2191(arg3);
            }
        }
        if (arg2 == 13) {
            class31 var27 = field273[arg3];
            if (var27 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(190);
                field261.method2190(arg3);
                field261.method2180(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var28 = field355[arg3];
            if (var28 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(205);
                field261.method2226(class126.field1958[82] ? 1 : 0);
                field261.method2189(arg3);
            }
        }
        if (arg2 == 1003) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            class31 var29 = field273[arg3];
            if (var29 != null) {
                class36 var30 = var29.field687;
                if (var30.field806 != null) {
                    var30 = var30.method628();
                }
                if (var30 != null) {
                    field261.method2391(63);
                    field261.method2189(var30.field792);
                }
            }
        }
        if (arg2 == 44) {
            class3 var31 = field355[arg3];
            if (var31 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(95);
                field261.method2185(class126.field1958[82] ? 1 : 0);
                field261.method2189(arg3);
            }
        }
        if (arg2 == 26) {
            method813();
        }
        if (arg2 == 4) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(180);
            field261.method2191(Statics.field780 + arg1);
            field261.method2190(Statics.field183 + arg0);
            field261.method2180(class126.field1958[82] ? 1 : 0);
            field261.method2189(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(179);
            field261.method2185(class126.field1958[82] ? 1 : 0);
            field261.method2190(Statics.field183 + arg0);
            field261.method2191(Statics.field780 + arg1);
            field261.method2191(arg3);
        }
        if (arg2 == 48) {
            class3 var32 = field355[arg3];
            if (var32 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(13);
                field261.method2185(class126.field1958[82] ? 1 : 0);
                field261.method2191(arg3);
            }
        }
        if (arg2 == 38) {
            method3203();
            class155 var33 = class155.method1889(arg1);
            field390 = 1;
            Statics.field2815 = arg0;
            Statics.field1945 = arg1;
            Statics.field221 = arg3;
            method744(var33);
            field391 = class2.method460(16748608) + class46.method137(arg3).field1014 + class2.method460(16777215);
            if (field391 == null) {
                field391 = "null";
            }
            return;
        }
        if (arg2 == 43) {
            field261.method2391(62);
            field261.method2191(arg3);
            field261.method2201(arg1);
            field261.method2190(arg0);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 14) {
            class3 var34 = field355[arg3];
            if (var34 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(2);
                field261.method2189(Statics.field221);
                field261.method2148(arg3);
                field261.method2180(class126.field1958[82] ? 1 : 0);
                field261.method2339(Statics.field1945);
                field261.method2189(Statics.field2815);
            }
        }
        if (arg2 == 3) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(46);
            field261.method2148(Statics.field780 + arg1);
            field261.method2191(Statics.field183 + arg0);
            field261.method2190(arg3 >> 14 & 0x7FFF);
            field261.method2252(class126.field1958[82] ? 1 : 0);
        }
        if (arg2 == 23) {
            Statics.field2514.method1652(Statics.field2678, arg0, arg1);
        }
        if (arg2 == 1) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(244);
            field261.method2201(Statics.field1945);
            field261.method2148(arg3 >> 14 & 0x7FFF);
            field261.method2180(class126.field1958[82] ? 1 : 0);
            field261.method2190(Statics.field2815);
            field261.method2189(Statics.field183 + arg0);
            field261.method2191(Statics.field221);
            field261.method2189(Statics.field780 + arg1);
        }
        if (arg2 == 7) {
            class31 var35 = field273[arg3];
            if (var35 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(57);
                field261.method2150(Statics.field1945);
                field261.method2185(class126.field1958[82] ? 1 : 0);
                field261.method2191(Statics.field221);
                field261.method2148(arg3);
                field261.method2148(Statics.field2815);
            }
        }
        if (arg2 == 9) {
            class31 var36 = field273[arg3];
            if (var36 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(187);
                field261.method2148(arg3);
                field261.method2226(class126.field1958[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(108);
            field261.method2148(arg3);
            field261.method2191(Statics.field183 + arg0);
            field261.method2191(Statics.field780 + arg1);
            field261.method2226(class126.field1958[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class31 var37 = field273[arg3];
            if (var37 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(104);
                field261.method2185(class126.field1958[82] ? 1 : 0);
                field261.method2189(arg3);
            }
        }
        if (arg2 == 33) {
            field261.method2391(86);
            field261.method2190(arg3);
            field261.method2201(arg1);
            field261.method2148(arg0);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 1001) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(53);
            field261.method2189(Statics.field780 + arg1);
            field261.method2190(Statics.field183 + arg0);
            field261.method2226(class126.field1958[82] ? 1 : 0);
            field261.method2148(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 51) {
            class3 var38 = field355[arg3];
            if (var38 != null) {
                field342 = arg6;
                field435 = arg7;
                field345 = 2;
                field459 = 0;
                field469 = arg0;
                field490 = arg1;
                field261.method2391(89);
                field261.method2226(class126.field1958[82] ? 1 : 0);
                field261.method2191(arg3);
            }
        }
        if (arg2 == 40) {
            field261.method2391(227);
            field261.method2339(arg1);
            field261.method2191(arg3);
            field261.method2189(arg0);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 6) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(91);
            field261.method2191(arg3 >> 14 & 0x7FFF);
            field261.method2226(class126.field1958[82] ? 1 : 0);
            field261.method2189(Statics.field780 + arg1);
            field261.method2189(Statics.field183 + arg0);
        }
        if (arg2 == 16) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field469 = arg0;
            field490 = arg1;
            field261.method2391(226);
            field261.method2148(arg3);
            field261.method2180(class126.field1958[82] ? 1 : 0);
            field261.method2190(Statics.field780 + arg1);
            field261.method2190(Statics.field2815);
            field261.method2339(Statics.field1945);
            field261.method2190(Statics.field183 + arg0);
            field261.method2191(Statics.field221);
        }
        if (arg2 == 32) {
            field261.method2391(236);
            field261.method2150(arg1);
            field261.method2189(arg0);
            field261.method2148(field495);
            field261.method2150(Statics.field1839);
            field261.method2148(arg3);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (arg2 == 1002) {
            field342 = arg6;
            field435 = arg7;
            field345 = 2;
            field459 = 0;
            field261.method2391(75);
            field261.method2191(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 30 && field429 == null) {
            field261.method2391(169);
            field261.method2201(arg1);
            field261.method2190(arg0);
            field429 = class155.method2715(arg1, arg0);
            method744(field429);
        }
        if (arg2 == 37) {
            field261.method2391(166);
            field261.method2190(arg3);
            field261.method2339(arg1);
            field261.method2191(arg0);
            field346 = 0;
            Statics.field172 = class155.method1889(arg1);
            field347 = arg0;
        }
        if (field390 != 0) {
            field390 = 0;
            method744(class155.method1889(Statics.field1945));
        }
        if (field392) {
            method3203();
        }
        if (Statics.field172 != null && field346 == 0) {
            method744(Statics.field172);
        }
    }

    @ObfuscatedName("di.bj(IIIII)V")
    public static void method2555(int arg0, int arg1, int arg2, int arg3) {
        class155 var4 = class155.method2715(arg0, arg1);
        if (var4 != null && var4.field2603 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field12 = var4.field2603;
            class33.method2560(var5);
        }
        field394 = arg3;
        field392 = true;
        Statics.field1839 = arg0;
        field495 = arg1;
        Statics.field29 = arg2;
        method744(var4);
    }

    @ObfuscatedName("fz.bb(B)V")
    public static void method3203() {
        if (!field392) {
            return;
        }
        class155 var0 = class155.method2715(Statics.field1839, field495);
        if (var0 != null && var0.field2542 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field12 = var0.field2542;
            class33.method2560(var1);
        }
        field392 = false;
        method744(var0);
    }

    @ObfuscatedName("ex.bq(IIIILjava/lang/String;B)V")
    public static void method2834(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class155 var5 = class155.method2715(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2586 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field16 = arg0;
            var6.field10 = arg4;
            var6.field12 = var5.field2586;
            class33.method2560(var6);
        }
        boolean var7 = true;
        if (var5.field2528 > 0) {
            var7 = method980(var5);
        }
        if (!var7 || !class159.method1780(method534(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field261.method2391(135);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 2) {
            field261.method2391(155);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 3) {
            field261.method2391(248);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 4) {
            field261.method2391(146);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 5) {
            field261.method2391(38);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 6) {
            field261.method2391(94);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 7) {
            field261.method2391(48);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 8) {
            field261.method2391(20);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 9) {
            field261.method2391(34);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
        if (arg0 == 10) {
            field261.method2391(204);
            field261.method2150(arg1);
            field261.method2148(arg2);
            field261.method2148(arg3);
        }
    }

    @ObfuscatedName("cv.bp(I)V")
    public static final void method1864() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field379 - 1; var1++) {
                if (field382[var1] < 1000 && field382[var1 + 1] > 1000) {
                    String var2 = field385[var1];
                    field385[var1] = field385[var1 + 1];
                    field385[var1 + 1] = var2;
                    String var3 = field240[var1];
                    field240[var1] = field240[var1 + 1];
                    field240[var1 + 1] = var3;
                    int var4 = field382[var1];
                    field382[var1] = field382[var1 + 1];
                    field382[var1 + 1] = var4;
                    int var5 = field380[var1];
                    field380[var1] = field380[var1 + 1];
                    field380[var1 + 1] = var5;
                    int var6 = field422[var1];
                    field422[var1] = field422[var1 + 1];
                    field422[var1 + 1] = var6;
                    int var7 = field321[var1];
                    field321[var1] = field321[var1 + 1];
                    field321[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("eb.bw(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2721(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field378 || field379 >= 500) {
            return;
        }
        field240[field379] = arg0;
        field385[field379] = arg1;
        field382[field379] = arg2;
        field321[field379] = arg3;
        field380[field379] = arg4;
        field422[field379] = arg5;
        field379++;
    }

    @ObfuscatedName("ab.br(B)V")
    public static void method896() {
        for (int var0 = 0; var0 < field379; var0++) {
            int var1 = field382[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field379 - 1) {
                    for (int var3 = var0; var3 < field379 - 1; var3++) {
                        field240[var3] = field240[var3 + 1];
                        field385[var3] = field385[var3 + 1];
                        field382[var3] = field382[var3 + 1];
                        field321[var3] = field321[var3 + 1];
                        field380[var3] = field380[var3 + 1];
                        field422[var3] = field422[var3 + 1];
                    }
                }
                field379--;
            }
        }
    }

    @ObfuscatedName("cp.by(IIIIB)V")
    public static final void method1782(int arg0, int arg1, int arg2, int arg3) {
        if (field390 == 0 && !field392) {
            method2721(class145.field2338, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class99.field1735; var6++) {
            int var7 = class99.field1736[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2514.method1619(Statics.field2678, var8, var9, var7) >= 0) {
                    class37 var12 = class37.method826(var11);
                    if (var12.field857 != null) {
                        var12 = var12.method662();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field390 == 1) {
                        method2721(class145.field2287, field391 + " " + class2.field23 + " " + class2.method460(65535) + var12.field840, 1, var7, var8, var9);
                    } else if (!field392) {
                        String[] var13 = var12.field868;
                        if (field338) {
                            var13 = method2967(var13);
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
                                    method2721(var13[var14], class2.method460(65535) + var12.field840, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2721(class145.field2288, class2.method460(65535) + var12.field840, 1002, var12.field843 << 14, var8, var9);
                    } else if ((Statics.field29 & 0x4) == 4) {
                        method2721(field395, field396 + " " + class2.field23 + " " + class2.method460(65535) + var12.field840, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class31 var16 = field273[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field687.field794 == 1 && (var16.field732 & 0x7F) == 64 && (var16.field777 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field274; var17++) {
                            class31 var18 = field273[field423[var17]];
                            if (var18 != null && var16 != var18 && var18.field687.field794 == 1 && var16.field732 == var18.field732 && var16.field777 == var18.field777) {
                                method2725(var18.field687, field423[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field356; var19++) {
                            class3 var20 = field355[field280[var19]];
                            if (var20 != null && var16.field732 == var20.field732 && var16.field777 == var20.field777) {
                                method113(var20, field280[var19], var8, var9);
                            }
                        }
                    }
                    method2725(var16.field687, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field355[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field732 & 0x7F) == 64 && (var21.field777 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field274; var22++) {
                            class31 var23 = field273[field423[var22]];
                            if (var23 != null && var23.field687.field794 == 1 && var21.field732 == var23.field732 && var21.field777 == var23.field777) {
                                method2725(var23.field687, field423[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field356; var24++) {
                            class3 var25 = field355[field280[var24]];
                            if (var25 != null && var21 != var25 && var21.field732 == var25.field732 && var21.field777 == var25.field777) {
                                method113(var25, field280[var24], var8, var9);
                            }
                        }
                    }
                    if (field369 == var11) {
                        var4 = var7;
                    } else {
                        method113(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class180 var26 = field370[Statics.field2678][var8][var9];
                    if (var26 != null) {
                        for (class26 var27 = (class26) var26.method3292(); var27 != null; var27 = (class26) var26.method3314()) {
                            class46 var28 = class46.method137(var27.field606);
                            if (field390 == 1) {
                                method2721(class145.field2287, field391 + " " + class2.field23 + " " + class2.method460(16748608) + var28.field1014, 16, var27.field606, var8, var9);
                            } else if (!field392) {
                                String[] var29 = var28.field1025;
                                if (field338) {
                                    var29 = method2967(var29);
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
                                        method2721(var29[var30], class2.method460(16748608) + var28.field1014, var31, var27.field606, var8, var9);
                                    } else if (var30 == 2) {
                                        method2721(class145.field2138, class2.method460(16748608) + var28.field1014, 20, var27.field606, var8, var9);
                                    }
                                }
                                method2721(class145.field2288, class2.method460(16748608) + var28.field1014, 1004, var27.field606, var8, var9);
                            } else if ((Statics.field29 & 0x1) == 1) {
                                method2721(field395, field396 + " " + class2.field23 + " " + class2.method460(16748608) + var28.field1014, 17, var27.field606, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field355[field369];
            method113(var34, field369, var32, var33);
        }
    }

    @ObfuscatedName("ed.bz(Laq;IIIB)V")
    public static final void method2725(class36 arg0, int arg1, int arg2, int arg3) {
        if (field379 >= 400) {
            return;
        }
        if (arg0.field806 != null) {
            arg0 = arg0.method628();
        }
        if (arg0 == null || !arg0.field804 || arg0.field823 && field405 != arg1) {
            return;
        }
        String var4 = arg0.field793;
        if (arg0.field810 != 0) {
            var4 = var4 + method161(arg0.field810, Statics.field216.field44) + " " + class2.field18 + class145.field2266 + arg0.field810 + class2.field31;
        }
        if (field390 == 1) {
            method2721(class145.field2287, field391 + " " + class2.field23 + " " + class2.method460(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field392) {
            String[] var5 = arg0.field808;
            if (field338) {
                var5 = method2967(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class145.field2289)) {
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
                        method2721(var5[var6], class2.method460(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class145.field2289)) {
                        short var9 = 0;
                        if (field291 == class18.field503 || field291 == class18.field510 && arg0.field810 > Statics.field216.field44) {
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
                        method2721(var5[var8], class2.method460(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2721(class145.field2288, class2.method460(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field29 & 0x2) == 2) {
            method2721(field395, field396 + " " + class2.field23 + " " + class2.method460(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("t.cc(Lg;IIII)V")
    public static final void method113(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field216 == arg0 || field379 >= 400) {
            return;
        }
        String var4;
        if (arg0.field42 == 0) {
            var4 = arg0.field49 + method161(arg0.field44, Statics.field216.field44) + " " + class2.field18 + class145.field2266 + arg0.field44 + class2.field31;
        } else {
            var4 = arg0.field49 + " " + class2.field18 + class145.field2189 + arg0.field42 + class2.field31;
        }
        if (field390 == 1) {
            method2721(class145.field2287, field391 + " " + class2.field23 + " " + class2.method460(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field392) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field366[var5] != null) {
                    short var6 = 0;
                    if (field366[var5].equalsIgnoreCase(class145.field2289)) {
                        if (field291 == class18.field503 || field291 == class18.field510 && arg0.field44 > Statics.field216.field44) {
                            var6 = 2000;
                        }
                        if (Statics.field216.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field216.field51 == arg0.field51) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field367[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field243[var5] + var6;
                    method2721(field366[var5], class2.method460(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field29 & 0x8) == 8) {
            method2721(field395, field396 + " " + class2.field23 + " " + class2.method460(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field379; var9++) {
            if (field382[var9] == 23) {
                field385[var9] = class2.method460(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("r.cd(III)Ljava/lang/String;")
    public static final String method161(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method460(16711680);
        } else if (var2 < -6) {
            return class2.method460(16723968);
        } else if (var2 < -3) {
            return class2.method460(16740352);
        } else if (var2 < 0) {
            return class2.method460(16756736);
        } else if (var2 > 9) {
            return class2.method460(65280);
        } else if (var2 > 6) {
            return class2.method460(4259584);
        } else if (var2 > 3) {
            return class2.method460(8453888);
        } else if (var2 > 0) {
            return class2.method460(12648192);
        } else {
            return class2.method460(16776960);
        }
    }

    @ObfuscatedName("db.cg(IIIIIIIII)V")
    public static final void method2387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class155.method731(arg0)) {
            Statics.field149 = null;
            method2818(Statics.field2552[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field149 != null) {
                method2818(Statics.field149, -1412584499, arg1, arg2, arg3, arg4, Statics.field27, Statics.field2923, arg7);
                Statics.field149 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field444[var8] = true;
            }
        } else {
            field444[arg7] = true;
        }
    }

    @ObfuscatedName("eo.ci([Leu;IIIIIIIII)V")
    public static final void method2818(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1529(arg2, arg3, arg4, arg5);
        class85.method1787();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class155 var10 = arg0[var9];
            if (var10 != null && (var10.field2608 == arg1 || arg1 == -1412584499 && field409 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field447[field442] = var10.field2568 + arg6;
                    field368[field442] = var10.field2530 + arg7;
                    field449[field442] = var10.field2533;
                    field474[field442] = var10.field2534;
                    var11 = ++field442 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2642 = var11;
                var10.field2571 = field246;
                if (!var10.field2523 || !method2085(var10)) {
                    if (var10.field2528 > 0) {
                        method2840(var10);
                    }
                    int var12 = var10.field2568 + arg6;
                    int var13 = var10.field2530 + arg7;
                    int var14 = var10.field2546;
                    if (field409 == var10) {
                        if (arg1 != -1412584499 && !var10.field2606) {
                            Statics.field149 = arg0;
                            Statics.field27 = arg6;
                            Statics.field2923 = arg7;
                            continue;
                        }
                        if (field420 && field414) {
                            int var15 = class129.field1990;
                            int var16 = class129.field1997;
                            int var17 = var15 - field411;
                            int var18 = var16 - field412;
                            if (var17 < field415) {
                                var17 = field415;
                            }
                            if (var10.field2533 + var17 > field415 + field348.field2533) {
                                var17 = field415 + field348.field2533 - var10.field2533;
                            }
                            if (var18 < field416) {
                                var18 = field416;
                            }
                            if (var10.field2534 + var18 > field416 + field348.field2534) {
                                var18 = field416 + field348.field2534 - var10.field2534;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2606) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2604 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2604 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2533 + var12;
                        int var26 = var10.field2534 + var13;
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
                        int var29 = var10.field2533 + var12;
                        int var30 = var10.field2534 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2523 || var19 < var21 && var20 < var22) {
                        if (var10.field2528 != 0) {
                            if (var10.field2528 == 1337) {
                                field386 = var12;
                                field460 = var13;
                                method581(var12, var13, var10.field2533, var10.field2534);
                                class74.method1529(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2528 == 1338) {
                                method2730();
                                class74.method1529(var12, var13, Statics.field87.field1308 + var12, Statics.field87.field1307 + var13);
                                if (field471 == 2 || field471 == 5) {
                                    class74.method1544(var12 + 25, var13 + 5, 0, Statics.field2031, Statics.field2842);
                                } else {
                                    int var31 = field320 + field306 & 0x7FF;
                                    int var32 = Statics.field216.field732 / 32 + 48;
                                    int var33 = 464 - Statics.field216.field777 / 32;
                                    Statics.field679.method1452(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field308 + 256, Statics.field2031, Statics.field2842);
                                    for (int var34 = 0; var34 < field465; var34++) {
                                        int var35 = field466[var34] * 4 + 2 - Statics.field216.field732 / 32;
                                        int var36 = field467[var34] * 4 + 2 - Statics.field216.field777 / 32;
                                        method31(var12, var13, var35, var36, field468[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class180 var39 = field370[Statics.field2678][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field216.field732 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field216.field777 / 32;
                                                method31(var12, var13, var40, var41, Statics.field890[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field274; var42++) {
                                        class31 var43 = field273[field423[var42]];
                                        if (var43 != null && var43.method16()) {
                                            class36 var44 = var43.field687;
                                            if (var44 != null && var44.field806 != null) {
                                                var44 = var44.method628();
                                            }
                                            if (var44 != null && var44.field809 && var44.field804) {
                                                int var45 = var43.field732 / 32 - Statics.field216.field732 / 32;
                                                int var46 = var43.field777 / 32 - Statics.field216.field777 / 32;
                                                method31(var12, var13, var45, var46, Statics.field890[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field356; var47++) {
                                        class3 var48 = field355[field280[var47]];
                                        if (var48 != null && var48.method16() && !var48.field37) {
                                            int var49 = var48.field732 / 32 - Statics.field216.field732 / 32;
                                            int var50 = var48.field777 / 32 - Statics.field216.field777 / 32;
                                            boolean var51 = false;
                                            if (method2723(var48.field49, true)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field1050; var53++) {
                                                if (var48.field49.equals(Statics.field2065[var53].field559)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field216.field51 != 0 && var48.field51 != 0 && Statics.field216.field51 == var48.field51) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method31(var12, var13, var49, var50, Statics.field890[3]);
                                            } else if (var54) {
                                                method31(var12, var13, var49, var50, Statics.field890[4]);
                                            } else if (var52) {
                                                method31(var12, var13, var49, var50, Statics.field890[5]);
                                            } else {
                                                method31(var12, var13, var49, var50, Statics.field890[2]);
                                            }
                                        }
                                    }
                                    if (field254 != 0 && field246 % 20 < 10) {
                                        if (field254 == 1 && field255 >= 0 && field255 < field273.length) {
                                            class31 var55 = field273[field255];
                                            if (var55 != null) {
                                                int var56 = var55.field732 / 32 - Statics.field216.field732 / 32;
                                                int var57 = var55.field777 / 32 - Statics.field216.field777 / 32;
                                                method1880(var12, var13, var56, var57, Statics.field1552[1]);
                                            }
                                        }
                                        if (field254 == 2) {
                                            int var58 = field257 * 4 - Statics.field183 * 4 + 2 - Statics.field216.field732 / 32;
                                            int var59 = field258 * 4 - Statics.field780 * 4 + 2 - Statics.field216.field777 / 32;
                                            method1880(var12, var13, var58, var59, Statics.field1552[1]);
                                        }
                                        if (field254 == 10 && field432 >= 0 && field432 < field355.length) {
                                            class3 var60 = field355[field432];
                                            if (var60 != null) {
                                                int var61 = var60.field732 / 32 - Statics.field216.field732 / 32;
                                                int var62 = var60.field777 / 32 - Statics.field216.field777 / 32;
                                                method1880(var12, var13, var61, var62, Statics.field1552[1]);
                                            }
                                        }
                                    }
                                    if (field469 != 0) {
                                        int var63 = field469 * 4 + 2 - Statics.field216.field732 / 32;
                                        int var64 = field490 * 4 + 2 - Statics.field216.field777 / 32;
                                        method31(var12, var13, var63, var64, Statics.field1552[0]);
                                    }
                                    if (!Statics.field216.field37) {
                                        class74.method1546(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field471 < 3) {
                                    Statics.field312.method1452(var12, var13, 33, 33, 25, 25, field320, 256, Statics.field13, Statics.field618);
                                } else {
                                    class74.method1544(var12, var13, 0, Statics.field13, Statics.field618);
                                }
                                if (field446[var11]) {
                                    Statics.field87.method1588(var12, var13);
                                }
                                field371[var11] = true;
                                class74.method1529(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2604 == 0) {
                            if (!var10.field2523 && method2085(var10) && Statics.field196 != var10) {
                                continue;
                            }
                            if (!var10.field2523) {
                                if (var10.field2538 > var10.field2540 - var10.field2534) {
                                    var10.field2538 = var10.field2540 - var10.field2534;
                                }
                                if (var10.field2538 < 0) {
                                    var10.field2538 = 0;
                                }
                            }
                            method2818(arg0, var10.field2524, var19, var20, var21, var22, var12 - var10.field2615, var13 - var10.field2538, var11);
                            if (var10.field2517 != null) {
                                method2818(var10.field2517, var10.field2524, var19, var20, var21, var22, var12 - var10.field2615, var13 - var10.field2538, var11);
                            }
                            class4 var65 = (class4) field398.method3254((long) var10.field2524);
                            if (var65 != null) {
                                method2387(var65.field56, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class74.method1529(arg2, arg3, arg4, arg5);
                            class85.method1787();
                        }
                        if (field446[var11] || field445 > 1) {
                            if (var10.field2604 == 0 && !var10.field2523 && var10.field2540 > var10.field2534) {
                                method570(var10.field2533 + var12, var13, var10.field2538, var10.field2534, var10.field2540);
                            }
                            if (var10.field2604 != 1) {
                                if (var10.field2604 == 2) {
                                    int var66 = 0;
                                    for (int var67 = 0; var67 < var10.field2534; var67++) {
                                        for (int var68 = 0; var68 < var10.field2533; var68++) {
                                            int var69 = (var10.field2578 + 32) * var68 + var12;
                                            int var70 = (var10.field2579 + 32) * var67 + var13;
                                            if (var66 < 20) {
                                                var69 += var10.field2588[var66];
                                                var70 += var10.field2581[var66];
                                            }
                                            if (var10.field2629[var66] > 0) {
                                                boolean var71 = false;
                                                boolean var72 = false;
                                                int var73 = var10.field2629[var66] - 1;
                                                if (var69 + 32 > arg2 && var69 < arg4 && var70 + 32 > arg3 && var70 < arg5 || Statics.field926 == var10 && field403 == var66) {
                                                    class73 var74;
                                                    if (field390 == 1 && Statics.field2815 == var66 && Statics.field1945 == var10.field2524) {
                                                        var74 = class46.method510(var73, var10.field2630[var66], 2, 0, 2, false);
                                                    } else {
                                                        var74 = class46.method510(var73, var10.field2630[var66], 1, 3153952, 2, false);
                                                    }
                                                    if (var74 == null) {
                                                        method744(var10);
                                                    } else if (Statics.field926 == var10 && field403 == var66) {
                                                        int var75 = class129.field1990 - field349;
                                                        int var76 = class129.field1997 - field350;
                                                        if (var75 < 5 && var75 > -5) {
                                                            var75 = 0;
                                                        }
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (field353 < 5) {
                                                            var75 = 0;
                                                            var76 = 0;
                                                        }
                                                        var74.method1448(var69 + var75, var70 + var76, 128);
                                                        if (arg1 != -1) {
                                                            class155 var77 = arg0[arg1 & 0xFFFF];
                                                            if (var70 + var76 < class74.field1304 && var77.field2538 > 0) {
                                                                int var78 = field360 * (class74.field1304 - var70 - var76) / 3;
                                                                if (var78 > field360 * 10) {
                                                                    var78 = field360 * 10;
                                                                }
                                                                if (var78 > var77.field2538) {
                                                                    var78 = var77.field2538;
                                                                }
                                                                var77.field2538 -= var78;
                                                                field350 += var78;
                                                                method744(var77);
                                                            }
                                                            if (var70 + var76 + 32 > class74.field1302 && var77.field2538 < var77.field2540 - var77.field2534) {
                                                                int var79 = field360 * (var70 + var76 + 32 - class74.field1302) / 3;
                                                                if (var79 > field360 * 10) {
                                                                    var79 = field360 * 10;
                                                                }
                                                                if (var79 > var77.field2540 - var77.field2534 - var77.field2538) {
                                                                    var79 = var77.field2540 - var77.field2534 - var77.field2538;
                                                                }
                                                                var77.field2538 += var79;
                                                                field350 -= var79;
                                                                method744(var77);
                                                            }
                                                        }
                                                    } else if (Statics.field172 == var10 && field347 == var66) {
                                                        var74.method1448(var69, var70, 128);
                                                    } else {
                                                        var74.method1501(var69, var70);
                                                    }
                                                }
                                            } else if (var10.field2526 != null && var66 < 20) {
                                                class73 var80 = var10.method2890(var66);
                                                if (var80 != null) {
                                                    var80.method1501(var69, var70);
                                                } else if (class155.field2576) {
                                                    method744(var10);
                                                }
                                            }
                                            var66++;
                                        }
                                    }
                                } else if (var10.field2604 == 3) {
                                    int var81;
                                    if (method131(var10)) {
                                        var81 = var10.field2537;
                                        if (Statics.field196 == var10 && var10.field2544 != 0) {
                                            var81 = var10.field2544;
                                        }
                                    } else {
                                        var81 = var10.field2541;
                                        if (Statics.field196 == var10 && var10.field2566 != 0) {
                                            var81 = var10.field2566;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2573) {
                                            class74.method1546(var12, var13, var10.field2533, var10.field2534, var81);
                                        } else {
                                            class74.method1537(var12, var13, var10.field2533, var10.field2534, var81);
                                        }
                                    } else if (var10.field2573) {
                                        class74.method1534(var12, var13, var10.field2533, var10.field2534, var81, 256 - (var14 & 0xFF));
                                    } else {
                                        class74.method1538(var12, var13, var10.field2533, var10.field2534, var81, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2604 == 4) {
                                    class205 var82 = var10.method2889();
                                    if (var82 != null) {
                                        String var83 = var10.field2572;
                                        int var84;
                                        if (method131(var10)) {
                                            var84 = var10.field2537;
                                            if (Statics.field196 == var10 && var10.field2544 != 0) {
                                                var84 = var10.field2544;
                                            }
                                            if (var10.field2574.length() > 0) {
                                                var83 = var10.field2574;
                                            }
                                        } else {
                                            var84 = var10.field2541;
                                            if (Statics.field196 == var10 && var10.field2566 != 0) {
                                                var84 = var10.field2566;
                                            }
                                        }
                                        if (var10.field2523 && var10.field2631 != -1) {
                                            class46 var85 = class46.method137(var10.field2631);
                                            var83 = var85.field1014;
                                            if (var83 == null) {
                                                var83 = "null";
                                            }
                                            if ((var85.field1022 == 1 || var10.field2632 != 1) && var10.field2632 != -1) {
                                                var83 = class2.method460(16748608) + var83 + class2.field25 + " " + 'x' + Statics.method2414(var10.field2632);
                                            }
                                        }
                                        if (field429 == var10) {
                                            class145 var10000 = (class145) null;
                                            var83 = class145.field2316;
                                            var84 = var10.field2541;
                                        }
                                        if (!var10.field2523) {
                                            var83 = method533(var83, var10);
                                        }
                                        var82.method3510(var83, var12, var13, var10.field2533, var10.field2534, var84, var10.field2577 ? 0 : -1, var10.field2575, var10.field2519, var10.field2628);
                                    } else if (class155.field2576) {
                                        method744(var10);
                                    }
                                } else if (var10.field2604 == 5) {
                                    if (var10.field2523) {
                                        class73 var87;
                                        if (var10.field2631 == -1) {
                                            var87 = var10.method2888(false);
                                        } else {
                                            var87 = class46.method510(var10.field2631, var10.field2632, var10.field2561, var10.field2553, var10.field2570, false);
                                        }
                                        if (var87 != null) {
                                            int var88 = var87.field1291;
                                            int var89 = var87.field1292;
                                            if (var10.field2551) {
                                                class74.method1530(var12, var13, var10.field2533 + var12, var10.field2534 + var13);
                                                int var90 = (var10.field2533 + (var88 - 1)) / var88;
                                                int var91 = (var10.field2534 + (var89 - 1)) / var89;
                                                for (int var92 = 0; var92 < var90; var92++) {
                                                    for (int var93 = 0; var93 < var91; var93++) {
                                                        if (var10.field2550 != 0) {
                                                            var87.method1454(var88 / 2 + var88 * var92 + var12, var89 / 2 + var89 * var93 + var13, var10.field2550, 4096);
                                                        } else if (var14 == 0) {
                                                            var87.method1501(var88 * var92 + var12, var89 * var93 + var13);
                                                        } else {
                                                            var87.method1448(var88 * var92 + var12, var89 * var93 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1529(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var94 = var10.field2533 * 4096 / var88;
                                                if (var10.field2550 != 0) {
                                                    var87.method1454(var10.field2533 / 2 + var12, var10.field2534 / 2 + var13, var10.field2550, var94);
                                                } else if (var14 != 0) {
                                                    var87.method1511(var12, var13, var10.field2533, var10.field2534, 256 - (var14 & 0xFF));
                                                } else if (var10.field2533 == var88 && var10.field2534 == var89) {
                                                    var87.method1501(var12, var13);
                                                } else {
                                                    var87.method1492(var12, var13, var10.field2533, var10.field2534);
                                                }
                                            }
                                        } else if (class155.field2576) {
                                            method744(var10);
                                        }
                                    } else {
                                        class73 var86 = var10.method2888(method131(var10));
                                        if (var86 != null) {
                                            var86.method1501(var12, var13);
                                        } else if (class155.field2576) {
                                            method744(var10);
                                        }
                                    }
                                } else if (var10.field2604 == 6) {
                                    boolean var95 = method131(var10);
                                    int var96;
                                    if (var95) {
                                        var96 = var10.field2549;
                                    } else {
                                        var96 = var10.field2560;
                                    }
                                    class99 var97 = null;
                                    int var98 = 0;
                                    if (var10.field2631 != -1) {
                                        class46 var99 = class46.method137(var10.field2631);
                                        if (var99 != null) {
                                            class46 var100 = var99.method851(var10.field2632);
                                            var97 = var100.method850(1);
                                            if (var97 == null) {
                                                method744(var10);
                                            } else {
                                                var97.method2064();
                                                var98 = var97.field1340 / 2;
                                            }
                                        }
                                    } else if (var10.field2623 == 5) {
                                        if (var10.field2557 == 0) {
                                            var97 = field500.method2990((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var97 = Statics.field216.method23();
                                        }
                                    } else if (var96 == -1) {
                                        var97 = var10.method2891((class39) null, -1, var95, Statics.field216.field40);
                                        if (var97 == null && class155.field2576) {
                                            method744(var10);
                                        }
                                    } else {
                                        class39 var101 = class39.method821(var96);
                                        var97 = var10.method2891(var101, var10.field2633, var95, Statics.field216.field40);
                                        if (var97 == null && class155.field2576) {
                                            method744(var10);
                                        }
                                    }
                                    class85.method1790(var10.field2533 / 2 + var12, var10.field2534 / 2 + var13);
                                    int var102 = var10.field2567 * class85.field1468[var10.field2564] >> 16;
                                    int var103 = var10.field2567 * class85.field1469[var10.field2564] >> 16;
                                    if (var97 != null) {
                                        if (var10.field2523) {
                                            var97.method2064();
                                            if (var10.field2569) {
                                                var97.method1999(0, var10.field2521, var10.field2580, var10.field2564, var10.field2562, var10.field2563 + var98 + var102, var10.field2563 + var103, var10.field2567);
                                            } else {
                                                var97.method2075(0, var10.field2521, var10.field2580, var10.field2564, var10.field2562, var10.field2563 + var98 + var102, var10.field2563 + var103);
                                            }
                                        } else {
                                            var97.method2075(0, var10.field2521, 0, var10.field2564, 0, var102, var103);
                                        }
                                    }
                                    class85.method1838();
                                } else {
                                    if (var10.field2604 == 7) {
                                        class205 var104 = var10.method2889();
                                        if (var104 == null) {
                                            if (class155.field2576) {
                                                method744(var10);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var10.field2534; var106++) {
                                            for (int var107 = 0; var107 < var10.field2533; var107++) {
                                                if (var10.field2629[var105] > 0) {
                                                    class46 var108 = class46.method137(var10.field2629[var105] - 1);
                                                    String var109;
                                                    if (var108.field1022 != 1 && var10.field2630[var105] == 1) {
                                                        var109 = class2.method460(16748608) + var108.field1014 + class2.field25;
                                                    } else {
                                                        var109 = class2.method460(16748608) + var108.field1014 + class2.field25 + " " + 'x' + Statics.method2414(var10.field2630[var105]);
                                                    }
                                                    int var110 = (var10.field2578 + 115) * var107 + var12;
                                                    int var111 = (var10.field2579 + 12) * var106 + var13;
                                                    if (var10.field2575 == 0) {
                                                        var104.method3505(var109, var110, var111, var10.field2541, var10.field2577 ? 0 : -1);
                                                    } else if (var10.field2575 == 1) {
                                                        var104.method3507(var109, var10.field2533 / 2 + var110, var111, var10.field2541, var10.field2577 ? 0 : -1);
                                                    } else {
                                                        var104.method3496(var109, var10.field2533 + var110 - 1, var111, var10.field2541, var10.field2577 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var10.field2604 == 8 && Statics.field54 == var10 && field389 == field275) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class205 var114 = Statics.field499;
                                        String var115 = var10.field2572;
                                        String var116 = method533(var115, var10);
                                        while (var116.length() > 0) {
                                            int var117 = var116.indexOf(class2.field24);
                                            String var118;
                                            if (var117 == -1) {
                                                var118 = var116;
                                                var116 = "";
                                            } else {
                                                var118 = var116.substring(0, var117);
                                                var116 = var116.substring(var117 + 4);
                                            }
                                            int var119 = var114.method3500(var118);
                                            if (var119 > var112) {
                                                var112 = var119;
                                            }
                                            var113 += var114.field2952 + 1;
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var120 = var10.field2533 + var12 - 5 - var112;
                                        int var121 = var10.field2534 + var13 + 5;
                                        if (var120 < var12 + 5) {
                                            var120 = var12 + 5;
                                        }
                                        if (var112 + var120 > arg4) {
                                            var120 = arg4 - var112;
                                        }
                                        if (var113 + var121 > arg5) {
                                            var121 = arg5 - var113;
                                        }
                                        class74.method1546(var120, var121, var112, var113, 16777120);
                                        class74.method1537(var120, var121, var112, var113, 0);
                                        String var122 = var10.field2572;
                                        int var123 = var114.field2952 + var121 + 2;
                                        String var124 = method533(var122, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class2.field24);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            var114.method3505(var126, var120 + 3, var123, 0, -1);
                                            var123 += var114.field2952 + 1;
                                        }
                                    }
                                    if (var10.field2604 == 9) {
                                        if (var10.field2547 == 1) {
                                            class74.method1527(var12, var13, var10.field2533 + var12, var10.field2534 + var13, var10.field2541);
                                        } else {
                                            int var127 = var10.field2533 >= 0 ? var10.field2533 : -var10.field2533;
                                            int var128 = var10.field2534 >= 0 ? var10.field2534 : -var10.field2534;
                                            int var129 = var127;
                                            if (var127 < var128) {
                                                var129 = var128;
                                            }
                                            if (var129 != 0) {
                                                int var130 = (var10.field2533 << 16) / var129;
                                                int var131 = (var10.field2534 << 16) / var129;
                                                if (var131 <= var130) {
                                                    var130 = -var130;
                                                } else {
                                                    var131 = -var131;
                                                }
                                                int var132 = var10.field2547 * var131 >> 17;
                                                int var133 = var10.field2547 * var131 + 1 >> 17;
                                                int var134 = var10.field2547 * var130 >> 17;
                                                int var135 = var10.field2547 * var130 + 1 >> 17;
                                                int var136 = var12 + var132;
                                                int var137 = var12 - var133;
                                                int var138 = var10.field2533 + var12 - var133;
                                                int var139 = var10.field2533 + var12 + var132;
                                                int var140 = var13 + var134;
                                                int var141 = var13 - var135;
                                                int var142 = var10.field2534 + var13 - var135;
                                                int var143 = var10.field2534 + var13 + var134;
                                                class85.method1795(var136, var137, var138);
                                                class85.method1798(var140, var141, var142, var136, var137, var138, var10.field2541);
                                                class85.method1795(var136, var138, var139);
                                                class85.method1798(var140, var142, var143, var136, var138, var139, var10.field2541);
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

    @ObfuscatedName("ah.cp(Ljava/lang/String;Leu;I)Ljava/lang/String;")
    public static String method533(String arg0, class155 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method842(arg1, var2 - 1);
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
                if (Statics.field1942 != null) {
                    int var9 = Statics.field1942.field2056;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1942.field2057 != null) {
                        var8 = (String) Statics.field1942.field2057;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("di.cu(Leu;IIIIIIB)V")
    public static final void method2558(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field365) {
            field318 = 32;
        } else {
            field318 = 0;
        }
        field365 = false;
        if (class129.field1995 == 1 || !Statics.field1985 && class129.field1995 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2538 -= 4;
                method744(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2538 += 4;
                method744(arg0);
            } else if (arg5 >= arg1 - field318 && arg5 < field318 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2538 = (arg4 - arg3) * var8 / var9;
                method744(arg0);
                field365 = true;
            }
        }
        if (field357 == 0) {
            return;
        }
        int var10 = arg0.field2533;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2538 += field357 * 45;
            method744(arg0);
        }
    }

    @ObfuscatedName("an.cy(IIIIII)V")
    public static final void method570(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field508[0].method1588(arg0, arg1);
        Statics.field508[1].method1588(arg0, arg1 + arg3 - 16);
        class74.method1546(arg0, arg1 + 16, 16, arg3 - 32, field313);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1546(arg0, arg1 + 16 + var6, 16, var5, field310);
        class74.method1541(arg0, arg1 + 16 + var6, var5, field316);
        class74.method1541(arg0 + 1, arg1 + 16 + var6, var5, field316);
        class74.method1539(arg0, arg1 + 16 + var6, 16, field316);
        class74.method1539(arg0, arg1 + 17 + var6, 16, field316);
        class74.method1541(arg0 + 15, arg1 + 16 + var6, var5, field451);
        class74.method1541(arg0 + 14, arg1 + 17 + var6, var5 - 1, field451);
        class74.method1539(arg0, arg1 + 15 + var6 + var5, 16, field451);
        class74.method1539(arg0 + 1, arg1 + 14 + var6 + var5, 15, field451);
    }

    @ObfuscatedName("n.cv(Leu;I)Z")
    public static final boolean method131(class155 arg0) {
        if (arg0.field2624 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2624.length; var1++) {
            int var2 = method842(arg0, var1);
            int var3 = arg0.field2625[var1];
            if (arg0.field2624[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2624[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2624[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ai.cf(Leu;II)I")
    public static final int method842(class155 arg0, int arg1) {
        if (arg0.field2627 == null || arg1 >= arg0.field2627.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2627[arg1];
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
                    var7 = field239[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field375[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field376[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class155 var11 = class155.method1889(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method137(var12).field1024 || field437)) {
                        for (int var13 = 0; var13 < var11.field2629.length; var13++) {
                            if (var12 + 1 == var11.field2629[var13]) {
                                var7 += var11.field2630[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2655[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class143.field2125[field375[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2655[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field216.field44;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class143.field2126[var14]) {
                            var7 += field375[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class155 var17 = class155.method1889(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method137(var18).field1024 || field437)) {
                        for (int var19 = 0; var19 < var17.field2629.length; var19++) {
                            if (var18 + 1 == var17.field2629[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field488;
                }
                if (var6 == 12) {
                    var7 = field408;
                }
                if (var6 == 13) {
                    int var20 = class157.field2655[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method3208(var22);
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
                    var7 = (Statics.field216.field732 >> 7) + Statics.field183;
                }
                if (var6 == 19) {
                    var7 = (Statics.field216.field777 >> 7) + Statics.field780;
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

    @ObfuscatedName("y.cn(IIIIIIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class155.method731(arg0)) {
            method526(Statics.field2552[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("q.ch([Leu;IIIIIIII)V")
    public static final void method526(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class155 var9 = arg0[var8];
            if (var9 != null && (!var9.field2523 || var9.field2604 == 0 || var9.field2592 || method534(var9) != 0 || field348 == var9) && var9.field2608 == arg1 && (!var9.field2523 || !method2085(var9))) {
                int var10 = var9.field2568 + arg6;
                int var11 = var9.field2530 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2604 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2604 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2533 + var10;
                    int var19 = var9.field2534 + var11;
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
                    int var22 = var9.field2533 + var10;
                    int var23 = var9.field2534 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field409 == var9) {
                    field417 = true;
                    field418 = var10;
                    field311 = var11;
                }
                if (!var9.field2523 || var12 < var14 && var13 < var15) {
                    int var24 = class129.field1990;
                    int var25 = class129.field1997;
                    if (class129.field2002 != 0) {
                        var24 = class129.field1996;
                        var25 = class129.field2004;
                    }
                    if (var9.field2528 == 1337) {
                        method744(var9);
                        if (!field245 && !field378 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1782(var24, var25, var12, var13);
                        }
                    } else if (var9.field2528 == 1338) {
                        method2491(var10, var11);
                    } else {
                        if (!field378 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2527 == 1) {
                                method2721(var9.field2647, "", 24, 0, 0, var9.field2524);
                            }
                            if (var9.field2527 == 2 && !field392) {
                                String var28;
                                if (class159.method2864(method534(var9)) == 0) {
                                    var28 = null;
                                } else if (var9.field2545 == null || var9.field2545.trim().length() == 0) {
                                    var28 = null;
                                } else {
                                    var28 = var9.field2545;
                                }
                                if (var28 != null) {
                                    method2721(var28, class2.method460(65280) + var9.field2609, 25, 0, -1, var9.field2524);
                                }
                            }
                            if (var9.field2527 == 3) {
                                method2721(class145.field2274, "", 26, 0, 0, var9.field2524);
                            }
                            if (var9.field2527 == 4) {
                                method2721(var9.field2647, "", 28, 0, 0, var9.field2524);
                            }
                            if (var9.field2527 == 5) {
                                method2721(var9.field2647, "", 29, 0, 0, var9.field2524);
                            }
                            if (var9.field2527 == 6 && field429 == null) {
                                method2721(var9.field2647, "", 30, 0, -1, var9.field2524);
                            }
                            if (var9.field2604 == 2) {
                                int var30 = 0;
                                for (int var31 = 0; var31 < var9.field2534; var31++) {
                                    for (int var32 = 0; var32 < var9.field2533; var32++) {
                                        int var33 = (var9.field2578 + 32) * var32;
                                        int var34 = (var9.field2579 + 32) * var31;
                                        if (var30 < 20) {
                                            var33 += var9.field2588[var30];
                                            var34 += var9.field2581[var30];
                                        }
                                        if (var26 >= var33 && var27 >= var34 && var26 < var33 + 32 && var27 < var34 + 32) {
                                            field351 = var30;
                                            Statics.field2614 = var9;
                                            if (var9.field2629[var30] > 0) {
                                                class46 var35 = class46.method137(var9.field2629[var30] - 1);
                                                if (field390 == 1 && class159.method1784(method534(var9))) {
                                                    if (Statics.field1945 != var9.field2524 || Statics.field2815 != var30) {
                                                        method2721(class145.field2287, field391 + " " + class2.field23 + " " + class2.method460(16748608) + var35.field1014, 31, var35.field1004, var30, var9.field2524);
                                                    }
                                                } else if (!field392 || !class159.method1784(method534(var9))) {
                                                    String[] var36 = var35.field1003;
                                                    if (field338) {
                                                        var36 = method2967(var36);
                                                    }
                                                    if (class159.method1784(method534(var9))) {
                                                        for (int var37 = 4; var37 >= 3; var37--) {
                                                            if (var36 != null && var36[var37] != null) {
                                                                byte var38;
                                                                if (var37 == 3) {
                                                                    var38 = 36;
                                                                } else {
                                                                    var38 = 37;
                                                                }
                                                                method2721(var36[var37], class2.method460(16748608) + var35.field1014, var38, var35.field1004, var30, var9.field2524);
                                                            } else if (var37 == 4) {
                                                                method2721(class145.field2234, class2.method460(16748608) + var35.field1014, 37, var35.field1004, var30, var9.field2524);
                                                            }
                                                        }
                                                    }
                                                    if (class159.method2688(method534(var9))) {
                                                        method2721(class145.field2287, class2.method460(16748608) + var35.field1014, 38, var35.field1004, var30, var9.field2524);
                                                    }
                                                    if (class159.method1784(method534(var9)) && var36 != null) {
                                                        for (int var39 = 2; var39 >= 0; var39--) {
                                                            if (var36[var39] != null) {
                                                                byte var40 = 0;
                                                                if (var39 == 0) {
                                                                    var40 = 33;
                                                                }
                                                                if (var39 == 1) {
                                                                    var40 = 34;
                                                                }
                                                                if (var39 == 2) {
                                                                    var40 = 35;
                                                                }
                                                                method2721(var36[var39], class2.method460(16748608) + var35.field1014, var40, var35.field1004, var30, var9.field2524);
                                                            }
                                                        }
                                                    }
                                                    String[] var41 = var9.field2583;
                                                    if (field338) {
                                                        var41 = method2967(var41);
                                                    }
                                                    if (var41 != null) {
                                                        for (int var42 = 4; var42 >= 0; var42--) {
                                                            if (var41[var42] != null) {
                                                                byte var43 = 0;
                                                                if (var42 == 0) {
                                                                    var43 = 39;
                                                                }
                                                                if (var42 == 1) {
                                                                    var43 = 40;
                                                                }
                                                                if (var42 == 2) {
                                                                    var43 = 41;
                                                                }
                                                                if (var42 == 3) {
                                                                    var43 = 42;
                                                                }
                                                                if (var42 == 4) {
                                                                    var43 = 43;
                                                                }
                                                                method2721(var41[var42], class2.method460(16748608) + var35.field1014, var43, var35.field1004, var30, var9.field2524);
                                                            }
                                                        }
                                                    }
                                                    method2721(class145.field2288, class2.method460(16748608) + var35.field1014, 1005, var35.field1004, var30, var9.field2524);
                                                } else if ((Statics.field29 & 0x10) == 16) {
                                                    method2721(field395, field396 + " " + class2.field23 + " " + class2.method460(16748608) + var35.field1014, 32, var35.field1004, var30, var9.field2524);
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            if (var9.field2523) {
                                if (!field392) {
                                    for (int var44 = 9; var44 >= 5; var44--) {
                                        String var45 = method1992(var9, var44);
                                        if (var45 != null) {
                                            method2721(var45, var9.field2585, 1007, var44 + 1, var9.field2525, var9.field2524);
                                        }
                                    }
                                    String var46;
                                    if (class159.method2864(method534(var9)) == 0) {
                                        var46 = null;
                                    } else if (var9.field2545 == null || var9.field2545.trim().length() == 0) {
                                        var46 = null;
                                    } else {
                                        var46 = var9.field2545;
                                    }
                                    if (var46 != null) {
                                        method2721(var46, var9.field2585, 25, 0, var9.field2525, var9.field2524);
                                    }
                                    for (int var48 = 4; var48 >= 0; var48--) {
                                        String var49 = method1992(var9, var48);
                                        if (var49 != null) {
                                            method2721(var49, var9.field2585, 57, var48 + 1, var9.field2525, var9.field2524);
                                        }
                                    }
                                    int var50 = method534(var9);
                                    boolean var51 = (var50 & 0x1) != 0;
                                    if (var51) {
                                        method2721(class145.field2143, "", 30, 0, var9.field2525, var9.field2524);
                                    }
                                } else if (class159.method2729(method534(var9)) && (Statics.field29 & 0x20) == 32) {
                                    method2721(field395, field396 + " " + class2.field23 + " " + var9.field2585, 58, 0, var9.field2525, var9.field2524);
                                }
                            }
                        }
                        if (var9.field2604 == 0) {
                            if (!var9.field2523 && method2085(var9) && Statics.field196 != var9) {
                                continue;
                            }
                            method526(arg0, var9.field2524, var12, var13, var14, var15, var10 - var9.field2615, var11 - var9.field2538);
                            if (var9.field2517 != null) {
                                method526(var9.field2517, var9.field2524, var12, var13, var14, var15, var10 - var9.field2615, var11 - var9.field2538);
                            }
                            class4 var52 = (class4) field398.method3254((long) var9.field2524);
                            if (var52 != null) {
                                if (var52.field59 == 0 && class129.field1990 >= var12 && class129.field1997 >= var13 && class129.field1990 < var14 && class129.field1997 < var15 && !field378 && !field330) {
                                    field240[0] = class145.field2261;
                                    field385[0] = "";
                                    field382[0] = 1006;
                                    field379 = 1;
                                }
                                method12(var52.field56, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2523) {
                            if (var9.field2644 && class129.field1990 >= var12 && class129.field1997 >= var13 && class129.field1990 < var14 && class129.field1997 < var15) {
                                for (class1 var53 = (class1) field438.method3304(); var53 != null; var53 = (class1) field438.method3297()) {
                                    if (var53.field2) {
                                        var53.method3375();
                                        var53.field3.field2646 = false;
                                    }
                                }
                                if (Statics.field1836 == 0) {
                                    field409 = null;
                                    field348 = null;
                                }
                                if (!field378) {
                                    field240[0] = class145.field2261;
                                    field385[0] = "";
                                    field382[0] = 1006;
                                    field379 = 1;
                                }
                            }
                            boolean var54;
                            if (class129.field1990 >= var12 && class129.field1997 >= var13 && class129.field1990 < var14 && class129.field1997 < var15) {
                                var54 = true;
                            } else {
                                var54 = false;
                            }
                            boolean var55 = false;
                            if ((class129.field1995 == 1 || !Statics.field1985 && class129.field1995 == 4) && var54) {
                                var55 = true;
                            }
                            boolean var56 = false;
                            if ((class129.field2002 == 1 || !Statics.field1985 && class129.field2002 == 4) && class129.field1996 >= var12 && class129.field2004 >= var13 && class129.field1996 < var14 && class129.field2004 < var15) {
                                var56 = true;
                            }
                            if (var56) {
                                method2957(var9, class129.field1996 - var10, class129.field2004 - var11);
                            }
                            if (field409 != null && field409 != var9 && var54) {
                                int var57 = method534(var9);
                                boolean var58 = (var57 >> 20 & 0x1) != 0;
                                if (var58) {
                                    field413 = var9;
                                }
                            }
                            if (field348 == var9) {
                                field414 = true;
                                field415 = var10;
                                field416 = var11;
                            }
                            if (var9.field2592) {
                                if (var54 && field357 != 0 && var9.field2613 != null) {
                                    class1 var59 = new class1();
                                    var59.field2 = true;
                                    var59.field3 = var9;
                                    var59.field5 = field357;
                                    var59.field12 = var9.field2613;
                                    field438.method3278(var59);
                                }
                                if (field409 != null || Statics.field926 != null || field378) {
                                    var56 = false;
                                    var55 = false;
                                    var54 = false;
                                }
                                if (!var9.field2637 && var56) {
                                    var9.field2637 = true;
                                    if (var9.field2594 != null) {
                                        class1 var60 = new class1();
                                        var60.field2 = true;
                                        var60.field3 = var9;
                                        var60.field4 = class129.field1996 - var10;
                                        var60.field5 = class129.field2004 - var11;
                                        var60.field12 = var9.field2594;
                                        field438.method3278(var60);
                                    }
                                }
                                if (var9.field2637 && var55 && var9.field2595 != null) {
                                    class1 var61 = new class1();
                                    var61.field2 = true;
                                    var61.field3 = var9;
                                    var61.field4 = class129.field1990 - var10;
                                    var61.field5 = class129.field1997 - var11;
                                    var61.field12 = var9.field2595;
                                    field438.method3278(var61);
                                }
                                if (var9.field2637 && !var55) {
                                    var9.field2637 = false;
                                    if (var9.field2596 != null) {
                                        class1 var62 = new class1();
                                        var62.field2 = true;
                                        var62.field3 = var9;
                                        var62.field4 = class129.field1990 - var10;
                                        var62.field5 = class129.field1997 - var11;
                                        var62.field12 = var9.field2596;
                                        field440.method3278(var62);
                                    }
                                }
                                if (var55 && var9.field2597 != null) {
                                    class1 var63 = new class1();
                                    var63.field2 = true;
                                    var63.field3 = var9;
                                    var63.field4 = class129.field1990 - var10;
                                    var63.field5 = class129.field1997 - var11;
                                    var63.field12 = var9.field2597;
                                    field438.method3278(var63);
                                }
                                if (!var9.field2646 && var54) {
                                    var9.field2646 = true;
                                    if (var9.field2598 != null) {
                                        class1 var64 = new class1();
                                        var64.field2 = true;
                                        var64.field3 = var9;
                                        var64.field4 = class129.field1990 - var10;
                                        var64.field5 = class129.field1997 - var11;
                                        var64.field12 = var9.field2598;
                                        field438.method3278(var64);
                                    }
                                }
                                if (var9.field2646 && var54 && var9.field2599 != null) {
                                    class1 var65 = new class1();
                                    var65.field2 = true;
                                    var65.field3 = var9;
                                    var65.field4 = class129.field1990 - var10;
                                    var65.field5 = class129.field1997 - var11;
                                    var65.field12 = var9.field2599;
                                    field438.method3278(var65);
                                }
                                if (var9.field2646 && !var54) {
                                    var9.field2646 = false;
                                    if (var9.field2600 != null) {
                                        class1 var66 = new class1();
                                        var66.field2 = true;
                                        var66.field3 = var9;
                                        var66.field4 = class129.field1990 - var10;
                                        var66.field5 = class129.field1997 - var11;
                                        var66.field12 = var9.field2600;
                                        field440.method3278(var66);
                                    }
                                }
                                if (var9.field2611 != null) {
                                    class1 var67 = new class1();
                                    var67.field3 = var9;
                                    var67.field12 = var9.field2611;
                                    field317.method3278(var67);
                                }
                                if (var9.field2605 != null && field491 > var9.field2639) {
                                    if (var9.field2535 == null || field491 - var9.field2639 > 32) {
                                        class1 var72 = new class1();
                                        var72.field3 = var9;
                                        var72.field12 = var9.field2605;
                                        field438.method3278(var72);
                                    } else {
                                        label643: for (int var68 = var9.field2639; var68 < field491; var68++) {
                                            int var69 = field462[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var9.field2535.length; var70++) {
                                                if (var9.field2535[var70] == var69) {
                                                    class1 var71 = new class1();
                                                    var71.field3 = var9;
                                                    var71.field12 = var9.field2605;
                                                    field438.method3278(var71);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2639 = field491;
                                }
                                if (var9.field2607 != null && field399 > var9.field2620) {
                                    if (var9.field2590 == null || field399 - var9.field2620 > 32) {
                                        class1 var77 = new class1();
                                        var77.field3 = var9;
                                        var77.field12 = var9.field2607;
                                        field438.method3278(var77);
                                    } else {
                                        label619: for (int var73 = var9.field2620; var73 < field399; var73++) {
                                            int var74 = field290[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var9.field2590.length; var75++) {
                                                if (var9.field2590[var75] == var74) {
                                                    class1 var76 = new class1();
                                                    var76.field3 = var9;
                                                    var76.field12 = var9.field2607;
                                                    field438.method3278(var76);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2620 = field399;
                                }
                                if (var9.field2591 != null && field236 > var9.field2641) {
                                    if (var9.field2610 == null || field236 - var9.field2641 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field12 = var9.field2591;
                                        field438.method3278(var82);
                                    } else {
                                        label595: for (int var78 = var9.field2641; var78 < field236; var78++) {
                                            int var79 = field426[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2610.length; var80++) {
                                                if (var9.field2610[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field12 = var9.field2591;
                                                    field438.method3278(var81);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2641 = field236;
                                }
                                if (field428 > var9.field2638 && var9.field2543 != null) {
                                    class1 var83 = new class1();
                                    var83.field3 = var9;
                                    var83.field12 = var9.field2543;
                                    field438.method3278(var83);
                                }
                                if (field473 > var9.field2638 && var9.field2616 != null) {
                                    class1 var84 = new class1();
                                    var84.field3 = var9;
                                    var84.field12 = var9.field2616;
                                    field438.method3278(var84);
                                }
                                if (field359 > var9.field2638 && var9.field2617 != null) {
                                    class1 var85 = new class1();
                                    var85.field3 = var9;
                                    var85.field12 = var9.field2617;
                                    field438.method3278(var85);
                                }
                                if (field431 > var9.field2638 && var9.field2621 != null) {
                                    class1 var86 = new class1();
                                    var86.field3 = var9;
                                    var86.field12 = var9.field2621;
                                    field438.method3278(var86);
                                }
                                if (field238 > var9.field2638 && var9.field2622 != null) {
                                    class1 var87 = new class1();
                                    var87.field3 = var9;
                                    var87.field12 = var9.field2622;
                                    field438.method3278(var87);
                                }
                                if (field433 > var9.field2638 && var9.field2618 != null) {
                                    class1 var88 = new class1();
                                    var88.field3 = var9;
                                    var88.field12 = var9.field2618;
                                    field438.method3278(var88);
                                }
                                var9.field2638 = field421;
                                if (var9.field2582 != null) {
                                    for (int var89 = 0; var89 < field458; var89++) {
                                        class1 var90 = new class1();
                                        var90.field3 = var9;
                                        var90.field8 = field388[var89];
                                        var90.field6 = field256[var89];
                                        var90.field12 = var9.field2582;
                                        field438.method3278(var90);
                                    }
                                }
                            }
                        }
                        if (!var9.field2523 && field409 == null && Statics.field926 == null && !field378) {
                            if ((var9.field2626 >= 0 || var9.field2566 != 0) && class129.field1990 >= var12 && class129.field1997 >= var13 && class129.field1990 < var14 && class129.field1997 < var15) {
                                if (var9.field2626 >= 0) {
                                    Statics.field196 = arg0[var9.field2626];
                                } else {
                                    Statics.field196 = var9;
                                }
                            }
                            if (var9.field2604 == 8 && class129.field1990 >= var12 && class129.field1997 >= var13 && class129.field1990 < var14 && class129.field1997 < var15) {
                                Statics.field54 = var9;
                            }
                            if (var9.field2540 > var9.field2534) {
                                method2558(var9, var9.field2533 + var10, var11, var9.field2534, var9.field2540, class129.field1990, class129.field1997);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.ce([Leu;II)V")
    public static final void method814(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2604 == 0) {
                    if (var3.field2517 != null) {
                        method814(var3.field2517, arg1);
                    }
                    class4 var4 = (class4) field398.method3254((long) var3.field2524);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class155.method731(var5)) {
                            method814(Statics.field2552[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2554 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field12 = var3.field2554;
                    class33.method2560(var6);
                }
                if (arg1 == 1 && var3.field2643 != null) {
                    if (var3.field2525 >= 0) {
                        class155 var7 = class155.method1889(var3.field2524);
                        if (var7 == null || var7.field2517 == null || var3.field2525 >= var7.field2517.length || var7.field2517[var3.field2525] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field12 = var3.field2643;
                    class33.method2560(var8);
                }
            }
        }
    }

    @ObfuscatedName("fm.ct(Leu;IIB)V")
    public static final void method2957(class155 arg0, int arg1, int arg2) {
        if (field409 != null || field378 || arg0 == null) {
            return;
        }
        class155 var3 = arg0;
        int var4 = method534(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class155 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class155.method1889(var3.field2608);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class155 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2556;
        }
        if (var9 == null) {
            return;
        }
        field409 = arg0;
        class155 var11 = arg0;
        int var12 = method534(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class155 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class155.method1889(var11.field2608);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class155 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2556;
        }
        field348 = var17;
        field411 = arg1;
        field412 = arg2;
        Statics.field1836 = 0;
        field420 = false;
        if (field379 > 0) {
            int var19 = field379 - 1;
            Statics.field764 = new class28();
            Statics.field764.field635 = field380[var19];
            Statics.field764.field628 = field422[var19];
            Statics.field764.field631 = field382[var19];
            Statics.field764.field629 = field321[var19];
            Statics.field764.field630 = field240[var19];
        }
        return;
    }

    @ObfuscatedName("fg.co(I)V")
    public static final void method2937() {
        method744(field409);
        Statics.field1836++;
        if (field417 && field414) {
            int var0 = class129.field1990;
            int var1 = class129.field1997;
            int var2 = var0 - field411;
            int var3 = var1 - field412;
            if (var2 < field415) {
                var2 = field415;
            }
            if (field409.field2533 + var2 > field415 + field348.field2533) {
                var2 = field415 + field348.field2533 - field409.field2533;
            }
            if (var3 < field416) {
                var3 = field416;
            }
            if (field409.field2534 + var3 > field416 + field348.field2534) {
                var3 = field416 + field348.field2534 - field409.field2534;
            }
            int var4 = var2 - field418;
            int var5 = var3 - field311;
            int var6 = field409.field2640;
            if (Statics.field1836 > field409.field2589 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field420 = true;
            }
            int var7 = field348.field2615 + (var2 - field415);
            int var8 = field348.field2538 + (var3 - field416);
            if (field409.field2601 != null && field420) {
                class1 var9 = new class1();
                var9.field3 = field409;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field12 = field409.field2601;
                class33.method2560(var9);
            }
            if (class129.field1995 == 0) {
                if (field420) {
                    if (field409.field2602 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field409;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field413;
                        var10.field12 = field409.field2602;
                        class33.method2560(var10);
                    }
                    if (field413 != null) {
                        class155 var11 = field409;
                        int var12 = method534(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class155 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class155.method1889(var11.field2608);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field261.method2391(92);
                            field261.method2200(field409.field2524);
                            field261.method2189(field409.field2525);
                            field261.method2190(field413.field2631);
                            field261.method2191(field409.field2631);
                            field261.method2190(field413.field2525);
                            field261.method2200(field413.field2524);
                        }
                    }
                } else if ((field377 == 1 || method2933(field379 - 1)) && field379 > 2) {
                    method2932(field418 + field411, field412 + field311);
                } else if (field379 > 0) {
                    method504(field418 + field411, field412 + field311);
                }
                field409 = null;
            }
        } else if (Statics.field1836 > 1) {
            field409 = null;
        }
    }

    @ObfuscatedName("v.cm(IIS)V")
    public static void method504(int arg0, int arg1) {
        method104(Statics.field764, arg0, arg1);
        Statics.field764 = null;
    }

    @ObfuscatedName("af.cq(Leu;I)V")
    public static void method744(class155 arg0) {
        if (field443 == arg0.field2571) {
            field444[arg0.field2642] = true;
        }
    }

    @ObfuscatedName("av.cr(I)V")
    public static void method765() {
        for (class4 var0 = (class4) field398.method3257(); var0 != null; var0 = (class4) field398.method3258()) {
            int var1 = var0.field56;
            if (class155.method731(var1)) {
                boolean var2 = true;
                class155[] var3 = Statics.field2552[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2523;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2886;
                    class155 var6 = class155.method1889(var5);
                    if (var6 != null) {
                        method744(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.cz([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2967(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ag.cx(II)V")
    public static final void method593(int arg0) {
        if (!class155.method731(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2552[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3 != null) {
                var3.field2633 = 0;
                var3.field2634 = 0;
            }
        }
    }

    @ObfuscatedName("e.ck([Leu;II)V")
    public static final void method479(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null && var3.field2608 == arg1 && (!var3.field2523 || !method2085(var3))) {
                if (var3.field2604 == 0) {
                    if (!var3.field2523 && method2085(var3) && Statics.field196 != var3) {
                        continue;
                    }
                    method479(arg0, var3.field2524);
                    if (var3.field2517 != null) {
                        method479(var3.field2517, var3.field2524);
                    }
                    class4 var4 = (class4) field398.method3254((long) var3.field2524);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class155.method731(var5)) {
                            method479(Statics.field2552[var5], -1);
                        }
                    }
                }
                if (var3.field2604 == 6) {
                    if (var3.field2560 != -1 || var3.field2549 != -1) {
                        boolean var6 = method131(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2549;
                        } else {
                            var7 = var3.field2560;
                        }
                        if (var7 != -1) {
                            class39 var8 = class39.method821(var7);
                            var3.field2634 += field360;
                            while (var3.field2634 > var8.field904[var3.field2633]) {
                                var3.field2634 -= var8.field904[var3.field2633];
                                var3.field2633++;
                                if (var3.field2633 >= var8.field902.length) {
                                    var3.field2633 -= var8.field906;
                                    if (var3.field2633 < 0 || var3.field2633 >= var8.field902.length) {
                                        var3.field2633 = 0;
                                    }
                                }
                                method744(var3);
                            }
                        }
                    }
                    if (var3.field2619 != 0 && !var3.field2523) {
                        int var9 = var3.field2619 >> 16;
                        int var10 = var3.field2619 << 16 >> 16;
                        int var11 = field360 * var9;
                        int var12 = field360 * var10;
                        var3.field2564 = var3.field2564 + var11 & 0x7FF;
                        var3.field2521 = var3.field2521 + var12 & 0x7FF;
                        method744(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ea.ca(II)V")
    public static final void method2718(int arg0) {
        method765();
        class21.method2881();
        int var1 = class47.method2419(arg0).field1056;
        if (var1 == 0) {
            return;
        }
        int var2 = class157.field2655[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1818(0.9D);
                ((class89) Statics.field1465).method1874(0.9D);
            }
            if (var2 == 2) {
                class85.method1818(0.8D);
                ((class89) Statics.field1465).method1874(0.8D);
            }
            if (var2 == 3) {
                class85.method1818(0.7D);
                ((class89) Statics.field1465).method1874(0.7D);
            }
            if (var2 == 4) {
                class85.method1818(0.6D);
                ((class89) Statics.field1465).method1874(0.6D);
            }
            class46.method147();
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
            if (field292 != var3) {
                if (field292 == 0 && field276 != -1) {
                    class164.method2101(Statics.field565, field276, 0, var3, false);
                    field314 = false;
                } else if (var3 == 0) {
                    class164.method1385();
                    field314 = false;
                } else {
                    class164.method2615(var3);
                }
                field292 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field475 = 127;
            }
            if (var2 == 1) {
                field475 = 96;
            }
            if (var2 == 2) {
                field475 = 64;
            }
            if (var2 == 3) {
                field475 = 32;
            }
            if (var2 == 4) {
                field475 = 0;
            }
        }
        if (var1 == 5) {
            field377 = var2;
        }
        if (var1 == 6) {
            field241 = var2;
        }
        if (var1 == 9) {
            field400 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field476 = 127;
            }
            if (var2 == 1) {
                field476 = 96;
            }
            if (var2 == 2) {
                field476 = 64;
            }
            if (var2 == 3) {
                field476 = 32;
            }
            if (var2 == 4) {
                field476 = 0;
            }
        }
        if (var1 == 17) {
            field405 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field504, class18.field510, class18.field503 };
            field291 = (class18) class100.method706(var4, var2);
            if (field291 == null) {
                field291 = class18.field510;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field369 = -1;
        } else {
            field369 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("ew.cl(Leu;B)V")
    public static final void method2840(class155 arg0) {
        int var1 = arg0.field2528;
        if (var1 == 324) {
            if (field496 == -1) {
                field496 = arg0.field2548;
                field424 = arg0.field2559;
            }
            if (field500.field2666) {
                arg0.field2548 = field496;
            } else {
                arg0.field2548 = field424;
            }
        } else if (var1 == 325) {
            if (field496 == -1) {
                field496 = arg0.field2548;
                field424 = arg0.field2559;
            }
            if (field500.field2666) {
                arg0.field2548 = field424;
            } else {
                arg0.field2548 = field496;
            }
        } else if (var1 == 327) {
            arg0.field2564 = 150;
            arg0.field2521 = (int) (Math.sin((double) field246 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2623 = 5;
            arg0.field2557 = 0;
        } else if (var1 == 328) {
            arg0.field2564 = 150;
            arg0.field2521 = (int) (Math.sin((double) field246 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2623 = 5;
            arg0.field2557 = 1;
        }
    }

    @ObfuscatedName("al.cb(I)V")
    public static final void method813() {
        field261.method2391(164);
        for (class4 var0 = (class4) field398.method3257(); var0 != null; var0 = (class4) field398.method3258()) {
            if (var0.field59 == 0 || var0.field59 == 3) {
                method2415(var0, true);
            }
        }
        if (field429 != null) {
            method744(field429);
            field429 = null;
        }
    }

    @ObfuscatedName("l.cw(IIII)Lj;")
    public static final class4 method1(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field56 = arg1;
        var3.field59 = arg2;
        field398.method3260(var3, (long) arg0);
        method593(arg1);
        class33.method494(arg1);
        class155 var4 = class155.method1889(arg0);
        if (var4 != null) {
            method744(var4);
        }
        if (field429 != null) {
            method744(field429);
            field429 = null;
        }
        method896();
        if (field387 != -1) {
            int var5 = field387;
            if (class155.method731(var5)) {
                method814(Statics.field2552[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("dw.cj(Lj;ZI)V")
    public static final void method2415(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2886;
        arg0.method3375();
        if (arg1) {
            class155.method493(var2);
        }
        method3(var2);
        class155 var4 = class155.method1889(var3);
        if (var4 != null) {
            method744(var4);
        }
        method896();
        if (field387 != -1) {
            int var5 = field387;
            if (class155.method731(var5)) {
                method814(Statics.field2552[var5], 1);
            }
        }
    }

    @ObfuscatedName("ac.dv(Leu;I)Z")
    public static final boolean method980(class155 arg0) {
        int var1 = arg0.field2528;
        if (var1 == 205) {
            field283 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field500.method2972(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field500.method2980(var4, var5 == 1);
        }
        if (var1 == 324) {
            field500.method2974(false);
        }
        if (var1 == 325) {
            field500.method2974(true);
        }
        if (var1 == 326) {
            field261.method2391(203);
            field500.method2977(field261);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cn.dz(IIIILbq;I)V")
    public static final void method1880(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method31(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field320 + field306 & 0x7FF;
        int var7 = class85.field1468[var6];
        int var8 = class85.field1469[var6];
        int var9 = var7 * 256 / (field308 + 256);
        int var10 = var8 * 256 / (field308 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1979.method1453(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("g.dy(IIIILbq;B)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field320 + field306 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1468[var5];
        int var8 = class85.field1469[var5];
        int var9 = var7 * 256 / (field308 + 256);
        int var10 = var8 * 256 / (field308 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1456(Statics.field87, arg0 + 94 + var11 - arg4.field1291 / 2 + 4, arg1 + 83 - var12 - arg4.field1292 / 2 - 4);
        } else {
            arg4.method1501(arg0 + 94 + var11 - arg4.field1291 / 2 + 4, arg1 + 83 - var12 - arg4.field1292 / 2 - 4);
        }
    }

    @ObfuscatedName("eb.dk(Ljava/lang/String;ZI)Z")
    public static boolean method2723(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method3386(arg0, Statics.field237);
        for (int var3 = 0; var3 < field489; var3++) {
            if (var2.equalsIgnoreCase(class212.method3386(field344[var3].field224, Statics.field237)) && (!arg1 || field344[var3].field212 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method3386(Statics.field216.field49, Statics.field237))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ft.dl(Ljava/lang/String;I)Z")
    public static boolean method3084(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class212.method3386(arg0, Statics.field237);
        for (int var2 = 0; var2 < field358; var2++) {
            class8 var3 = field333[var2];
            if (var1.equalsIgnoreCase(class212.method3386(var3.field125, Statics.field237))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class212.method3386(var3.field120, Statics.field237))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cq.dx(Ljava/lang/String;B)V")
    public static final void method1986(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method3386(arg0, Statics.field237);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field489; var2++) {
            class16 var3 = field344[var2];
            String var4 = var3.field224;
            String var5 = class212.method3386(var4, Statics.field237);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field489--;
                for (int var7 = var2; var7 < field489; var7++) {
                    field344[var7] = field344[var7 + 1];
                }
                field473 = field421;
                field261.method2391(240);
                class111 var8 = field261;
                int var9 = arg0.length() + 1;
                var8.method2226(var9);
                field261.method2152(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fu.dw(Ljava/lang/String;II)V")
    public static final void method3202(String arg0, int arg1) {
        field261.method2391(219);
        class111 var2 = field261;
        int var3 = arg0.length() + 1;
        var2.method2226(var3 + 1);
        field261.method2226(arg1);
        field261.method2152(arg0);
    }

    @ObfuscatedName("di.dj(Ljava/lang/String;I)V")
    public static final void method2559(String arg0) {
        if (Statics.field2065 == null) {
            return;
        }
        field261.method2391(8);
        class111 var1 = field261;
        int var2 = arg0.length() + 1;
        var1.method2226(var2);
        field261.method2152(arg0);
    }

    @ObfuscatedName("s.dn(I)V")
    public static final void method458() {
        field261.method2391(144);
        field261.method2226(0);
    }

    @ObfuscatedName("l.df(IB)V")
    public static void method3(int arg0) {
        for (class182 var1 = (class182) field295.method3257(); var1 != null; var1 = (class182) field295.method3258()) {
            if ((var1.field2886 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3375();
            }
        }
    }

    @ObfuscatedName("ah.de(Leu;I)I")
    public static int method534(class155 arg0) {
        class182 var1 = (class182) field295.method3254(((long) arg0.field2524 << 32) + (long) arg0.field2525);
        return var1 == null ? arg0.field2584 : var1.field2872;
    }

    @ObfuscatedName("cl.dp(Leu;I)Z")
    public static boolean method2085(class155 arg0) {
        if (field330) {
            if (method534(arg0) != 0) {
                return false;
            }
            if (arg0.field2604 == 0) {
                return false;
            }
        }
        return arg0.field2536;
    }

    @ObfuscatedName("cr.dr(Leu;II)Ljava/lang/String;")
    public static String method1992(class155 arg0, int arg1) {
        int var2 = method534(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2586 == null) {
            return null;
        } else if (arg0.field2522 == null || arg0.field2522.length <= arg1 || arg0.field2522[arg1] == null || arg0.field2522[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2522[arg1];
        }
    }

    @ObfuscatedName("y.dg(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field430 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field430 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field430 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field430 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field430 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field497 + "/";
    }
}

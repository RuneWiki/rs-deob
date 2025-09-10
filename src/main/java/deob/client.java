package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public class client extends class35 implements class494, OAuthApi, class346 {

	@ObfuscatedName("client.cq")
	public static final class93 field315 = new class93();

	@ObfuscatedName("client.df")
	public static final class283 field318 = new class283();

	@ObfuscatedName("client.du")
	public static final String field591 = Statics.method3767(Statics.method7552("com_jagex_auth_desktop_osrs:public"));

	@ObfuscatedName("client.do")
	public static final String field320 = Statics.method3767(Statics.method7552("com_jagex_auth_desktop_runelite:public"));

	@ObfuscatedName("client.ew")
	public static final int[] field321 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ek")
	public static final int[] field322 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

	@ObfuscatedName("client.et")
	public static final class366 field323 = new class366();

	@ObfuscatedName("client.fs")
	public static final class41 field324 = new class41();

	@ObfuscatedName("client.ff")
	public static boolean field428 = true;

	@ObfuscatedName("client.fe")
	public static int field326 = 1;

	@ObfuscatedName("client.fk")
	public static boolean field327 = false;

	@ObfuscatedName("client.fo")
	public static int field328 = 0;

	@ObfuscatedName("client.fj")
	public static int field413 = 0;

	@ObfuscatedName("client.fm")
	public static class132 field572 = class132.field1597;

	@ObfuscatedName("client.fb")
	public static class596 field331 = class596.field5971;

	@ObfuscatedName("client.fp")
	public static boolean field332 = false;

	@ObfuscatedName("client.fx")
	public static HashMap field388 = new HashMap();

	@ObfuscatedName("client.fz")
	public static final class74 field334 = new class74();

	@ObfuscatedName("client.gz")
	public static class437 field335 = new class437();

	@ObfuscatedName("client.gn")
	public static class89 field336 = new class89();

	@ObfuscatedName("client.gj")
	public static int field337 = 0;

	@ObfuscatedName("client.gr")
	public static int field559 = 50;

	@ObfuscatedName("client.gs")
	public static int field339 = 12;

	@ObfuscatedName("client.gv")
	public static int field340 = 6;

	@ObfuscatedName("client.ge")
	public static boolean field500 = true;

	@ObfuscatedName("client.gx")
	public static int field342 = 0;

	@ObfuscatedName("client.gy")
	public static boolean field343 = true;

	@ObfuscatedName("client.gh")
	public static int field492 = -1;

	@ObfuscatedName("client.ga")
	public static int field345 = 0;

	@ObfuscatedName("client.gc")
	public static String field346 = "";

	@ObfuscatedName("client.gm")
	public static int field347 = -1;

	@ObfuscatedName("client.gf")
	public static int field348 = -1;

	@ObfuscatedName("client.gu")
	public static int field349 = -1;

	@ObfuscatedName("client.gt")
	public static boolean field392 = true;

	@ObfuscatedName("client.gi")
	public static int field351 = 0;

	@ObfuscatedName("client.gl")
	public static int[] field540 = new int[25];

	@ObfuscatedName("client.gp")
	public static int[] field403 = new int[25];

	@ObfuscatedName("client.gg")
	public static int[] field354 = new int[25];

	@ObfuscatedName("client.hd")
	public static int[] field616 = new int[25];

	@ObfuscatedName("client.hj")
	public static boolean field356 = false;

	@ObfuscatedName("client.ha")
	public static boolean field528 = true;

	@ObfuscatedName("client.hg")
	public static int field358 = 0;

	@ObfuscatedName("client.hs")
	public static class370 field359 = null;

	@ObfuscatedName("client.hc")
	public static long field360 = 0L;

	@ObfuscatedName("client.hm")
	public static boolean field432 = true;

	@ObfuscatedName("client.hp")
	public static int field362 = 600;

	@ObfuscatedName("client.hq")
	public static int field363 = field362 / field191;

	@ObfuscatedName("client.hh")
	public static class275 field552 = new class275();

	@ObfuscatedName("client.hz")
	public static class273 field599 = new class273();

	@ObfuscatedName("client.ht")
	public static class163[] field366 = new class163[4];

	@ObfuscatedName("client.hn")
	public static class172[] field583 = new class172[4];

	@ObfuscatedName("client.ho")
	public static short field368 = 256;

	@ObfuscatedName("client.hu")
	public static short field369 = 205;

	@ObfuscatedName("client.hv")
	public static short field370 = 256;

	@ObfuscatedName("client.hr")
	public static short field371 = 320;

	@ObfuscatedName("client.he")
	public static short field372 = 1;

	@ObfuscatedName("client.hb")
	public static short field365 = 32767;

	@ObfuscatedName("client.im")
	public static short field420 = 1;

	@ObfuscatedName("client.il")
	public static short field383 = 32767;

	@ObfuscatedName("client.ia")
	public static int field376 = 0;

	@ObfuscatedName("client.if")
	public static int field598 = 0;

	@ObfuscatedName("client.ib")
	public static int field314 = 0;

	@ObfuscatedName("client.is")
	public static int field379 = 0;

	@ObfuscatedName("client.iy")
	public static int field380 = 0;

	@ObfuscatedName("client.iq")
	public static class422[] field381 = new class422[8];

	@ObfuscatedName("client.iu")
	public static class43 field382 = new class43();

	@ObfuscatedName("client.ip")
	public static int field317 = -1;

	@ObfuscatedName("client.ig")
	public static int field433 = -1;

	@ObfuscatedName("client.ih")
	public static int field385 = 30;

	@ObfuscatedName("client.in")
	public static int field386 = 0;

	@ObfuscatedName("client.it")
	public static String field529 = null;

	@ObfuscatedName("client.jw")
	public static int field355 = 0;

	@ObfuscatedName("client.jb")
	public static boolean field566 = false;

	@ObfuscatedName("client.jl")
	public static int field389 = -1;

	@ObfuscatedName("client.je")
	public static int field377 = -1;

	@ObfuscatedName("client.jz")
	public static int field391 = -1;

	@ObfuscatedName("client.jt")
	public static boolean field592 = false;

	@ObfuscatedName("client.ja")
	public static boolean field393 = true;

	@ObfuscatedName("client.jd")
	public static int field568 = 0;

	@ObfuscatedName("client.jy")
	public static long field395 = -1L;

	@ObfuscatedName("client.jf")
	public static int field387 = -1;

	@ObfuscatedName("client.js")
	public static int field397 = -1;

	@ObfuscatedName("client.jr")
	public static long field398 = -1L;

	@ObfuscatedName("client.jm")
	public static boolean field399 = true;

	@ObfuscatedName("client.ju")
	public static int field374 = 0;

	@ObfuscatedName("client.jo")
	public static boolean field401 = false;

	@ObfuscatedName("client.jg")
	public static class71 field402 = class71.field970;

	@ObfuscatedName("client.kw")
	public static int field404 = 0;

	@ObfuscatedName("client.kx")
	public static int field527 = 0;

	@ObfuscatedName("client.lf")
	public static int field406 = 0;

	@ObfuscatedName("client.lo")
	public static int field352 = 0;

	@ObfuscatedName("client.la")
	public static int field449 = 0;

	@ObfuscatedName("client.ll")
	public static int field465 = 0;

	@ObfuscatedName("client.lr")
	public static int field580 = 0;

	@ObfuscatedName("client.lu")
	public static int field411 = 0;

	@ObfuscatedName("client.ld")
	public static int field412 = 1;

	@ObfuscatedName("client.le")
	public static int field330 = 0;

	@ObfuscatedName("client.lk")
	public static int field414 = 1;

	@ObfuscatedName("client.lz")
	public static int field477 = 0;

	@ObfuscatedName("client.ml")
	public static int field416 = 128;

	@ObfuscatedName("client.mb")
	public static int field425 = 0;

	@ObfuscatedName("client.mi")
	public static int field418 = 0;

	@ObfuscatedName("client.mo")
	public static int field421 = 0;

	@ObfuscatedName("client.mu")
	public static int field516 = 0;

	@ObfuscatedName("client.mq")
	public static int field367 = 0;

	@ObfuscatedName("client.mm")
	public static int field422 = -1;

	@ObfuscatedName("client.mz")
	public static class429 field423 = new class429(8);

	@ObfuscatedName("client.mw")
	public static int field325 = 0;

	@ObfuscatedName("client.mr")
	public static int field574 = -1;

	@ObfuscatedName("client.ma")
	public static class370 field565 = null;

	@ObfuscatedName("client.mn")
	public static int field593 = 0;

	@ObfuscatedName("client.me")
	public static int field491 = 0;

	@ObfuscatedName("client.my")
	public static int field429 = 0;

	@ObfuscatedName("client.mh")
	public static int field430 = -1;

	@ObfuscatedName("client.mf")
	public static boolean field431 = false;

	@ObfuscatedName("client.mg")
	public static int field405 = 1;

	@ObfuscatedName("client.mj")
	public static int field526 = 0;

	@ObfuscatedName("client.mt")
	public static int field551 = 0;

	@ObfuscatedName("client.md")
	public static class437 field435 = new class437();

	@ObfuscatedName("client.mx")
	public static class437 field436 = new class437();

	@ObfuscatedName("client.nz")
	public static class437 field615 = new class437();

	@ObfuscatedName("client.nk")
	public static class437 field438 = new class437();

	@ObfuscatedName("client.nf")
	public static class429 field439 = new class429(512);

	@ObfuscatedName("client.nr")
	public static int field445 = 0;

	@ObfuscatedName("client.nb")
	public static int field441 = 0;

	@ObfuscatedName("client.ne")
	public static String field442 = "";

	@ObfuscatedName("client.nn")
	public static int field443 = 0;

	@ObfuscatedName("client.nj")
	public static int[] field444 = new int[128];

	@ObfuscatedName("client.nl")
	public static int[] field512 = new int[128];

	@ObfuscatedName("client.nd")
	public static long field467 = -1L;

	@ObfuscatedName("client.no")
	public static boolean field447 = false;

	@ObfuscatedName("client.nx")
	public static class559 field400 = new class559();

	@ObfuscatedName("client.ni")
	public static boolean field475 = false;

	@ObfuscatedName("client.nv")
	public static boolean field450 = false;

	@ObfuscatedName("client.nw")
	public static class321 field464 = new class321(64);

	@ObfuscatedName("client.na")
	public static class321 field452 = new class321(64);

	@ObfuscatedName("client.nc")
	public static boolean field557 = false;

	@ObfuscatedName("client.ns")
	public static boolean field454 = false;

	@ObfuscatedName("client.ny")
	public static boolean field455 = false;

	@ObfuscatedName("client.nh")
	public static int field456 = 0;

	@ObfuscatedName("client.oj")
	public static int field457 = 0;

	@ObfuscatedName("client.oz")
	public static int field458 = 0;

	@ObfuscatedName("client.oq")
	public static int field459 = 0;

	@ObfuscatedName("client.od")
	public static int field460 = 0;

	@ObfuscatedName("client.on")
	public static int field461 = 0;

	@ObfuscatedName("client.oi")
	public static int field462 = 0;

	@ObfuscatedName("client.om")
	public static int field463 = 0;

	@ObfuscatedName("client.ot")
	public static class85 field341 = class85.field1214;

	@ObfuscatedName("client.ov")
	public static class85 field319 = class85.field1214;

	@ObfuscatedName("client.of")
	public static class55 field466 = new class55();

	@ObfuscatedName("client.or")
	public static int[] field434 = new int[4];

	@ObfuscatedName("client.os")
	public static byte[] field473 = null;

	@ObfuscatedName("client.ox")
	public static int field469 = 0;

	@ObfuscatedName("client.oc")
	public static int[] field470 = new int[250];

	@ObfuscatedName("client.oy")
	public static boolean field471 = false;

	@ObfuscatedName("client.ol")
	public static class403 field472 = new class403();

	@ObfuscatedName("client.pp")
	public static int[][][] field424 = new int[4][13][13];

	@ObfuscatedName("client.pm")
	public static boolean field474 = false;

	@ObfuscatedName("client.ph")
	public static int[][][] field448 = new int[4][13][13];

	@ObfuscatedName("client.pl")
	public static int field476 = -1;

	@ObfuscatedName("client.pw")
	public static int field390 = 0;

	@ObfuscatedName("client.qi")
	public static int field396 = 2301979;

	@ObfuscatedName("client.qt")
	public static int field479 = 5063219;

	@ObfuscatedName("client.qr")
	public static int field514 = 3353893;

	@ObfuscatedName("client.qv")
	public static int field329 = 7759444;

	@ObfuscatedName("client.qf")
	public static boolean field344 = false;

	@ObfuscatedName("client.qo")
	public static int field483 = 0;

	@ObfuscatedName("client.qj")
	public static int field600 = 0;

	@ObfuscatedName("client.qc")
	public static int field415 = 0;

	@ObfuscatedName("client.qz")
	public static int field549 = 0;

	@ObfuscatedName("client.qh")
	public static int field487 = 0;

	@ObfuscatedName("client.qy")
	public static boolean field378 = false;

	@ObfuscatedName("client.qd")
	public static int field489 = 0;

	@ObfuscatedName("client.qu")
	public static boolean field490 = false;

	@ObfuscatedName("client.qs")
	public static int field417 = 0;

	@ObfuscatedName("client.qq")
	public static int field410 = 0;

	@ObfuscatedName("client.qn")
	public static int field493 = 50;

	@ObfuscatedName("client.qk")
	public static int[] field494 = new int[field493];

	@ObfuscatedName("client.qx")
	public static int[] field495 = new int[field493];

	@ObfuscatedName("client.qg")
	public static int[] field496 = new int[field493];

	@ObfuscatedName("client.rd")
	public static int[] field497 = new int[field493];

	@ObfuscatedName("client.rz")
	public static int[] field498 = new int[field493];

	@ObfuscatedName("client.rg")
	public static int[] field499 = new int[field493];

	@ObfuscatedName("client.rn")
	public static int[][] field587 = new int[field493][];

	@ObfuscatedName("client.rf")
	public static int[] field501 = new int[field493];

	@ObfuscatedName("client.rt")
	public static String[] field394 = new String[field493];

	@ObfuscatedName("client.rq")
	public static int field503 = 0;

	@ObfuscatedName("client.rw")
	public static int field504 = -1;

	@ObfuscatedName("client.rk")
	public static int field505 = -1;

	@ObfuscatedName("client.rm")
	public static int field506 = 0;

	@ObfuscatedName("client.re")
	public static int field507 = 0;

	@ObfuscatedName("client.rl")
	public static int field486 = 0;

	@ObfuscatedName("client.rj")
	public static int field509 = 0;

	@ObfuscatedName("client.rr")
	public static long field510 = -1L;

	@ObfuscatedName("client.ru")
	public static long field511 = -1L;

	@ObfuscatedName("client.ry")
	public static int field553 = 0;

	@ObfuscatedName("client.rv")
	public static int field513 = 0;

	@ObfuscatedName("client.rb")
	public static int field338 = 0;

	@ObfuscatedName("client.rs")
	public static int field373 = 0;

	@ObfuscatedName("client.rx")
	public static int[] field361 = new int[1000];

	@ObfuscatedName("client.ri")
	public static String[] field517 = new String[8];

	@ObfuscatedName("client.rh")
	public static boolean[] field440 = new boolean[8];

	@ObfuscatedName("client.rp")
	public static int[] field519 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@ObfuscatedName("client.sk")
	public static int field520 = -1;

	@ObfuscatedName("client.sp")
	public static boolean field521 = false;

	@ObfuscatedName("client.sx")
	public static boolean field522 = false;

	@ObfuscatedName("client.sc")
	public static class611 field523 = new class611(true);

	@ObfuscatedName("client.sy")
	public static boolean field524 = false;

	@ObfuscatedName("client.ss")
	public static int field525 = -1;

	@ObfuscatedName("client.sz")
	public static int field597 = -1;

	@ObfuscatedName("client.su")
	public static int field482 = 0;

	@ObfuscatedName("client.sw")
	public static int field427 = 50;

	@ObfuscatedName("client.sf")
	public static boolean field530 = false;

	@ObfuscatedName("client.st")
	public static int field531 = -1;

	@ObfuscatedName("client.sv")
	public static int field408 = -1;

	@ObfuscatedName("client.sn")
	public static String field375 = null;

	@ObfuscatedName("client.sm")
	public static String field534 = null;

	@ObfuscatedName("client.sl")
	public static int field535 = 0;

	@ObfuscatedName("client.sq")
	public static class370 field613 = null;

	@ObfuscatedName("client.sj")
	public static class370 field537 = null;

	@ObfuscatedName("client.sr")
	public static int field538 = 0;

	@ObfuscatedName("client.sg")
	public static int field558 = 0;

	@ObfuscatedName("client.se")
	public static class370 field446 = null;

	@ObfuscatedName("client.tq")
	public static boolean field541 = false;

	@ObfuscatedName("client.tg")
	public static int field542 = -1;

	@ObfuscatedName("client.td")
	public static int field543 = -1;

	@ObfuscatedName("client.tk")
	public static boolean field544 = false;

	@ObfuscatedName("client.tp")
	public static int field545 = -1;

	@ObfuscatedName("client.tl")
	public static int field546 = -1;

	@ObfuscatedName("client.tw")
	public static boolean field547 = false;

	@ObfuscatedName("client.tj")
	public static int[] field548 = new int[32];

	@ObfuscatedName("client.tn")
	public static int field453 = 0;

	@ObfuscatedName("client.tm")
	public static int[] field550 = new int[32];

	@ObfuscatedName("client.tt")
	public static int field536 = 0;

	@ObfuscatedName("client.ta")
	public static int[] field533 = new int[32];

	@ObfuscatedName("client.tu")
	public static int field333 = 0;

	@ObfuscatedName("client.tf")
	public static int[] field539 = new int[32];

	@ObfuscatedName("client.ts")
	public static int field555 = 0;

	@ObfuscatedName("client.te")
	public static int field556 = 0;

	@ObfuscatedName("client.tx")
	public static int field364 = 0;

	@ObfuscatedName("client.to")
	public static int field353 = 0;

	@ObfuscatedName("client.tz")
	public static int field485 = 0;

	@ObfuscatedName("client.tv")
	public static int field560 = 0;

	@ObfuscatedName("client.tb")
	public static int field561 = 0;

	@ObfuscatedName("client.ti")
	public static int field562 = 0;

	@ObfuscatedName("client.uy")
	public static class610 field502 = new class610();

	@ObfuscatedName("client.up")
	public static int field564 = 0;

	@ObfuscatedName("client.uu")
	public static int field451 = -2;

	@ObfuscatedName("client.ud")
	public static boolean[] field437 = new boolean[100];

	@ObfuscatedName("client.uc")
	public static boolean[] field567 = new boolean[100];

	@ObfuscatedName("client.un")
	public static boolean[] field357 = new boolean[100];

	@ObfuscatedName("client.ul")
	public static int[] field569 = new int[100];

	@ObfuscatedName("client.ux")
	public static int[] field468 = new int[100];

	@ObfuscatedName("client.uo")
	public static int[] field571 = new int[100];

	@ObfuscatedName("client.ui")
	public static int[] field614 = new int[100];

	@ObfuscatedName("client.ut")
	public static int field573 = 0;

	@ObfuscatedName("client.uj")
	public static int[] field426 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.uz")
	public static long[] field575 = new long[100];

	@ObfuscatedName("client.uq")
	public static int field576 = 0;

	@ObfuscatedName("client.ub")
	public static int field577 = -1;

	@ObfuscatedName("client.ue")
	public static int field578 = 0;

	@ObfuscatedName("client.ug")
	public static int[] field579 = new int[1000];

	@ObfuscatedName("client.us")
	public static int[] field508 = new int[1000];

	@ObfuscatedName("client.ua")
	public static class606[] field581 = new class606[1000];

	@ObfuscatedName("client.uf")
	public static int field582 = 0;

	@ObfuscatedName("client.um")
	public static int field532 = 0;

	@ObfuscatedName("client.uh")
	public static int field584 = -1;

	@ObfuscatedName("client.uk")
	public static int field585 = 0;

	@ObfuscatedName("client.vj")
	public static int field586 = 0;

	@ObfuscatedName("client.vr")
	public static boolean field554 = false;

	@ObfuscatedName("client.vi")
	public static boolean field588 = false;

	@ObfuscatedName("client.vc")
	public static boolean field589 = false;

	@ObfuscatedName("client.vl")
	public static class552 field590 = null;

	@ObfuscatedName("client.va")
	public static class551 field515 = null;

	@ObfuscatedName("client.vq")
	public static class551 field478 = null;

	@ObfuscatedName("client.ve")
	public static boolean[] field611 = new boolean[5];

	@ObfuscatedName("client.vw")
	public static int[] field594 = new int[5];

	@ObfuscatedName("client.vp")
	public static int[] field595 = new int[5];

	@ObfuscatedName("client.wa")
	public static int[] field596 = new int[5];

	@ObfuscatedName("client.wo")
	public static int[] field407 = new int[5];

	@ObfuscatedName("client.wv")
	public static int field480 = -1;

	@ObfuscatedName("client.wj")
	public static int field570 = -1;

	@ObfuscatedName("client.ws")
	public static class548 field419 = new class546();

	@ObfuscatedName("client.wr")
	public static class491 field604 = new class491(8, class489.field5352);

	@ObfuscatedName("client.wu")
	public static List field602 = new ArrayList();

	@ObfuscatedName("client.wq")
	public static ArrayList field603 = new ArrayList(10);

	@ObfuscatedName("client.wi")
	public static int field488 = 0;

	@ObfuscatedName("client.wl")
	public static int field605 = 0;

	@ObfuscatedName("client.wm")
	public static int[] field606 = new int[50];

	@ObfuscatedName("client.wk")
	public static int[] field607 = new int[50];

	@ObfuscatedName("client.wn")
	public String field608;

	@ObfuscatedName("client.wf")
	public class15 field609;

	@ObfuscatedName("client.wb")
	public class19 field610;

	@ObfuscatedName("client.wt")
	public OtlTokenRequester field481;

	@ObfuscatedName("client.wy")
	public Future field612;

	@ObfuscatedName("client.we")
	public boolean field350 = false;

	@ObfuscatedName("client.wp")
	public int field601 = 0;

	@ObfuscatedName("client.wz")
	public class19 field484;

	@ObfuscatedName("client.wh")
	public RefreshAccessTokenRequester field563;

	@ObfuscatedName("client.ww")
	public Future field617;

	@ObfuscatedName("client.xf")
	public class591 field618;

	@ObfuscatedName("client.xw")
	public class8 field619;

	@ObfuscatedName("client.xv")
	public long field620 = -1L;

	static {
		class586.field5891 = 233;
	}

	@ObfuscatedName("qh.gg(I)Lvj;")
	public static class547 method8007() {
		return Statics.field3493;
	}

	@ObfuscatedName("ic.hd(I)Lvi;")
	public static class555 method5050() {
		return Statics.field817;
	}

	@ObfuscatedName("gw.hj(B)V")
	public static final void method3790() {
		class231.field2698 = false;
		field566 = false;
	}

	@ObfuscatedName("ar.ha(I)V")
	public static void method183() {
		Statics.field3222 = System.getenv("JX_ACCESS_TOKEN");
		Statics.field3125 = System.getenv("JX_REFRESH_TOKEN");
		Statics.field3473 = System.getenv("JX_SESSION_ID");
		Statics.field2026 = System.getenv("JX_CHARACTER_ID");
		class53.method9787(System.getenv("JX_DISPLAY_NAME"));
	}

	@ObfuscatedName("gf.hg(I)V")
	public static void method3816() {
		if (Statics.field5479 != null && Statics.field5479.method2846()) {
			Statics.field5479.method2819();
		}
		method1880();
		method6988();
		if (Statics.field4847 != null) {
			Statics.field4847.field910 = false;
		}
		Statics.field4847 = null;
		field315.method2886();
		if (Statics.field1567 != null) {
			try {
				Statics.field1567.method5507();
			} catch (Exception var3) {
			}
		}
		Statics.field1567 = null;
		method10028();
		method721();
		field334.method2348();
		field335.method8029();
		Statics.field817 = null;
		class340.method5500(0, 0);
		class340.method3684();
		field447 = false;
		class73.method6274();
		if (Statics.field964 != null) {
			Statics.field964.method2982();
		}
		Statics.field3419.method7804();
		class409.method3526();
		if (Statics.field1508 != null) {
			Statics.field1508.method3369();
		}
		class261.method321();
		class261.field3112 = null;
		class261.field3109 = null;
		Statics.field3108 = null;
		class263.method4019();
		Statics.field1074 = null;
		field603.clear();
		field605 = 0;
		Statics.field3419 = new class414();
		Statics.field1508 = new class121(Statics.field5520.field350, 233);
		try {
			class261.method407("oldschool", Statics.field1998, Statics.field5354.field4406, 0, 25);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}
		Statics.field1074 = new class516(255, class261.field3112, class261.field3109, 750000);
		Statics.field1567 = new class259();
		Statics.field5520.method653();
		method2126(class71.field970);
		method3384(0);
	}

	@ObfuscatedName("by.hs(I)V")
	public static void method721() {
		Statics.field1905 = null;
		Statics.field1977 = null;
		Statics.field203 = null;
		Statics.field2439 = null;
		Statics.field1138 = null;
		Statics.field4849 = null;
		Statics.field2277 = null;
		Statics.field2157 = null;
		Statics.field2186 = null;
		Statics.field3066 = null;
		Statics.field5105 = null;
	}

	@ObfuscatedName("ea.hi(II)V")
	public static void method3384(int arg0) {
		if (field328 == arg0) {
			return;
		}
		if (field328 == 30) {
			field599.method5671();
		}
		if (field328 == 0) {
			Statics.field5520.method536();
		}
		if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
			method9655(class44.field297);
			field352 = 0;
			field449 = 0;
			field472.method7607(arg0);
			if (arg0 != 20) {
				method6470(false);
			}
		}
		if (arg0 != 20 && arg0 != 40 && Statics.field51 != null) {
			Statics.field51.method9422();
			Statics.field51 = null;
		}
		if (field328 == 25) {
			field477 = 0;
			field411 = 0;
			field412 = 1;
			field330 = 0;
			field414 = 1;
		}
		if (arg0 == 5 || arg0 == 10) {
			boolean var3 = Statics.field240.method2521() >= field389;
			int var4 = var3 ? 0 : 12;
			class53.method4016(Statics.field131, Statics.field5388, Statics.field3828, true, var4);
		} else if (arg0 == 20) {
			int var1 = field328 == 11 ? 4 : 0;
			class53.method4016(Statics.field131, Statics.field5388, Statics.field3828, false, var1);
		} else if (arg0 == 11) {
			class53.method4016(Statics.field131, Statics.field5388, Statics.field3828, false, 4);
		} else if (arg0 == 50) {
			class53.method2114("", "Updating date of birth...", "");
			class53.method4016(Statics.field131, Statics.field5388, Statics.field3828, false, 7);
		} else if (arg0 != 0 && Statics.field10) {
			Statics.field5308 = null;
			Statics.field2176 = null;
			Statics.field5150 = null;
			Statics.field773 = null;
			Statics.field4895 = null;
			Statics.field1687 = null;
			Statics.field274 = null;
			Statics.field3341 = null;
			Statics.field2174 = null;
			Statics.field3381 = null;
			Statics.field284 = null;
			Statics.field1566 = null;
			Statics.field4809 = null;
			Statics.field3232 = null;
			Statics.field1804.method2468();
			class340.method5500(0, 100);
			class414 var2 = Statics.field3419;
			var2.method7786(true);
			Statics.field10 = false;
		}
		field328 = arg0;
	}

	@ObfuscatedName("cr.hk(Lpw;Ljava/lang/String;B)V")
	public static void method2067(class410 arg0, String arg1) {
		class62 var2 = new class62(arg0, arg1);
		field603.add(var2);
		field605 += var2.field865;
	}

	@ObfuscatedName("dz.hf(I)Z")
	public static boolean method2888() {
		if (field603 == null || field488 >= field603.size()) {
			return true;
		}
		while (field488 < field603.size()) {
			class62 var0 = (class62) field603.get(field488);
			if (!var0.method2055()) {
				return false;
			}
			field488++;
		}
		return true;
	}

	@ObfuscatedName("ue.hy(I)I")
	public static int method9742() {
		if (field603 == null || field488 >= field603.size()) {
			return 10000;
		}
		int var0 = 0;
		for (int var1 = 0; var1 <= field488; var1++) {
			var0 += ((class62) field603.get(var1)).field862;
		}
		return var0 * 10000 / field605;
	}

	@ObfuscatedName("br.hc(B)V")
	public static void method1505() {
		if (field402 == class71.field970) {
			Statics.field1515 = method4350(class411.field4934.field4955, false, true, true, false);
			Statics.field4043 = method4350(class411.field4936.field4955, true, true, true, false);
			Statics.field5388 = method4350(class411.field4938.field4955, false, true, true, false);
			Statics.field131 = method4350(class411.field4929.field4955, false, true, true, false);
			Statics.field1727 = method4350(class411.field4954.field4955, true, false, true, false);
			Statics.field1831 = method4350(class411.field4944.field4955, false, true, true, false);
			Statics.field2092 = method4350(class411.field4945.field4955, false, true, true, false);
			Statics.field5020 = method4350(class411.field4937.field4955, true, true, true, false);
			class53.method7906(20, class394.field4494);
			method2126(class71.field971);
		} else if (field402 == class71.field971) {
			byte var0 = 0;
			int var1 = var0 + Statics.field1515.method7646() * 53 / 100;
			int var2 = var1 + Statics.field4043.method7646() * 5 / 100;
			int var3 = var2 + Statics.field5388.method7646() * 36 / 100;
			int var4 = var3 + Statics.field131.method7646() / 100;
			int var5 = var4 + Statics.field1727.method7646() / 100;
			int var6 = var5 + Statics.field1831.method7646() * 2 / 100;
			int var7 = var6 + Statics.field2092.method7646() / 100;
			int var8 = var7 + (Statics.field5020.method7645() && Statics.field5020.method7697() ? 1 : 0);
			if (var8 == 100) {
				method2067(Statics.field1515, "Sound FX");
				method2067(Statics.field4043, "Music Tracks");
				method2067(Statics.field5388, "Sprites");
				method2067(Statics.field1831, "Music Samples");
				method2067(Statics.field2092, "Music Patches");
				Statics.field3828 = new class524();
				Statics.field3828.method9658(Statics.field5020);
				class53.method7906(40, class394.field4496);
				method2126(class71.field966);
			} else if (var8 != 0) {
				class53.method7906(30, class394.field4739 + var8 + "%");
			}
		} else if (field402 == class71.field966) {
			class98.method3438(22050, !field566, 2);
			ArrayList var9 = new ArrayList(3);
			class259 var10 = Statics.field1567;
			short var11 = 2048;
			if (class98.field1357 == 0) {
				throw new IllegalStateException();
			}
			if (var11 < 512) {
				var11 = 512;
			}
			class98 var13;
			try {
				class98 var12 = Statics.field2177.method320();
				var12.field1341 = new int[(Statics.field1340 ? 2 : 1) * 512];
				var12.field1346 = var11;
				var12.method346();
				var12.field1351 = (var11 & 0xFFFFF800) + 2048;
				if (var12.field1351 > 32768) {
					var12.field1351 = 32768;
				}
				var12.method337(var12.field1351);
				if (Statics.field905 > 0 && Statics.field2576 == null) {
					Statics.field2576 = new class100();
					Statics.field1347 = Executors.newScheduledThreadPool(1);
					Statics.field1347.scheduleAtFixedRate(Statics.field2576, 0L, 10L, TimeUnit.MILLISECONDS);
				}
				if (Statics.field2576 != null) {
					if (Statics.field2576.field1371[0] != null) {
						throw new IllegalArgumentException();
					}
					Statics.field2576.field1371[0] = var12;
				}
				var13 = var12;
			} catch (Throwable var94) {
				var13 = new class98();
			}
			Statics.field964 = var13;
			Statics.field145 = new class94();
			class94 var15 = new class94();
			var15.method2890(Statics.field145);
			for (int var16 = 0; var16 < 3; var16++) {
				class341 var17 = new class341(Statics.field964);
				var17.method6584(9, 128);
				var15.method2890(var17);
				var9.add(var17);
			}
			Statics.field964.method2978(var15);
			class340.method3942(Statics.field2092, Statics.field1831, Statics.field1515, var9);
			class53.method7906(60, class394.field4497);
			method2126(class71.field979);
		} else if (field402 == class71.field979) {
			if (Statics.field5468 == null) {
				Statics.field5468 = new class556(Statics.field5388, Statics.field1727);
			}
			int var18 = class557.method10027().length;
			field388 = Statics.field5468.method10022(class557.method10027());
			if (field388.size() < var18) {
				class53.method7906(80, class394.field4608 + field388.size() * 100 / var18 + "%");
			} else {
				Statics.field3948 = (class462) field388.get(class557.field5752);
				Statics.field5240 = (class462) field388.get(class557.field5743);
				Statics.field3832 = (class462) field388.get(class557.field5744);
				Statics.field3493 = field419.method9765();
				class53.method7906(80, class394.field4769);
				method2126(class71.field961);
			}
		} else if (field402 == class71.field961) {
			class410 var19 = Statics.field131;
			class410 var20 = Statics.field5388;
			int var21 = 0;
			String[] var22 = class53.field760;
			for (int var23 = 0; var23 < var22.length; var23++) {
				String var24 = var22[var23];
				if (var19.method7711(var24, "")) {
					var21++;
				}
			}
			String[] var25 = class53.field761;
			for (int var26 = 0; var26 < var25.length; var26++) {
				String var27 = var25[var26];
				if (var20.method7711(var27, "")) {
					var21++;
				}
			}
			String[] var28 = class53.field762;
			for (int var29 = 0; var29 < var28.length; var29++) {
				String var30 = var28[var29];
				if (var20.method7715(var30) != -1 && var20.method7711(var30, "")) {
					var21++;
				}
			}
			int var33 = class53.method4713(Statics.field5388);
			if (var21 < var33) {
				class53.method7906(90, class394.field4500 + var21 * 100 / var33 + "%");
			} else {
				class53.method7906(100, class394.field4615);
				if (Statics.field5442) {
					method3384(5);
					method2126(class71.field977);
				} else {
					method2126(class71.field963);
				}
			}
		} else if (field402 == class71.field977) {
			method3384(10);
		} else if (field402 == class71.field963) {
			Statics.field5031 = method4350(class411.field4930.field4955, false, true, true, false);
			Statics.field914 = method4350(class411.field4951.field4955, false, true, true, true);
			Statics.field3205 = method4350(class411.field4931.field4955, false, true, true, false);
			Statics.field1987 = method4350(class411.field4932.field4955, true, false, true, false);
			Statics.field689 = method4350(class411.field4953.field4955, false, true, true, false);
			Statics.field1761 = method4350(class411.field4943.field4955, true, true, true, false);
			Statics.field5346 = method4350(class411.field4935.field4955, false, true, true, false);
			Statics.field1957 = method4350(class411.field4939.field4955, false, true, true, false);
			Statics.field3101 = method4350(class411.field4946.field4955, false, true, true, false);
			Statics.field3842 = method4350(class411.field4940.field4955, false, true, true, false);
			Statics.field5662 = method4350(class411.field4947.field4955, false, true, true, false);
			Statics.field3507 = method4350(class411.field4933.field4955, false, true, true, false);
			Statics.field281 = method4350(class411.field4949.field4955, false, true, true, false);
			Statics.field3303 = method4350(class411.field4950.field4955, false, true, true, false);
			Statics.field254 = method3479(class411.field4942.field4955, false, true, true, true, true);
			class53.method7906(20, class394.field4494);
			method2126(class71.field967);
		} else if (field402 == class71.field967) {
			byte var34 = 0;
			int var35 = var34 + Statics.field5031.method7646() * 4 / 100;
			int var36 = var35 + Statics.field914.method7646() / 100;
			int var37 = var36 + Statics.field3205.method7646() * 2 / 100;
			int var38 = var37 + Statics.field1987.method7646() / 100;
			int var39 = var38 + Statics.field689.method7646() / 100;
			int var40 = var39 + Statics.field1761.method7646() * 10 / 100;
			int var41 = var40 + Statics.field5346.method7646() * 65 / 100;
			int var42 = var41 + Statics.field1957.method7646() / 100;
			int var43 = var42 + Statics.field3101.method7646() / 100;
			int var44 = var43 + Statics.field3842.method7646() * 6 / 100;
			int var45 = var44 + Statics.field3507.method7646() / 100;
			int var46 = var45 + Statics.field5662.method7646() * 2 / 100;
			int var47 = var46 + Statics.field281.method7646() * 2 / 100;
			int var48 = var47 + Statics.field3303.method7646() / 100;
			int var49 = var48 + Statics.field254.method7646() * 2 / 100;
			if (var49 == 100) {
				method2067(Statics.field5031, "Animations");
				method2067(Statics.field914, "Animation Keyframes");
				method2067(Statics.field3205, "Skeletons");
				method2067(Statics.field1761, "Maps");
				method2067(Statics.field5346, "Models");
				method2067(Statics.field3101, "Music Jingles");
				method2067(Statics.field3507, "World Map");
				method2067(Statics.field5662, "World Map Geography");
				method2067(Statics.field281, "World Map Ground");
				class53.method7906(30, class394.field4496);
				method2126(class71.field965);
			} else if (var49 != 0) {
				class53.method7906(30, class394.field4739 + var49 + "%");
			}
		} else if (field402 == class71.field965) {
			Statics.field3837 = field334.method2341(104, 104, Statics.field240.method2536());
			Statics.field5344 = Statics.field3837;
			Statics.field2993 = new class606(512, 512);
			class53.method7906(30, class394.field4493);
			method2126(class71.field969);
		} else if (field402 == class71.field969) {
			if (!Statics.field1987.method7697()) {
				class53.method7906(40, class394.field4502 + Statics.field1987.method7657() + "%");
			} else if (Statics.field3303.method7697()) {
				class215.method2122(Statics.field1987);
				class203.method4721(Statics.field1987);
				class187.method9535(Statics.field1987, Statics.field5346);
				class410 var50 = Statics.field1987;
				class410 var51 = Statics.field5346;
				boolean var52 = field566;
				Statics.field2318 = var50;
				Statics.field3500 = var51;
				class213.field2317 = var52;
				class196.method3570(Statics.field1987, Statics.field5346);
				class210.method725(Statics.field1987);
				class214.method3880(Statics.field1987, Statics.field5346, field327, Statics.field3948);
				class410 var53 = Statics.field1987;
				class410 var54 = Statics.field5031;
				class410 var55 = Statics.field914;
				class410 var56 = Statics.field3205;
				Statics.field1612 = var53;
				Statics.field2466 = var54;
				Statics.field5184 = var55;
				Statics.field2511 = var56;
				class202.method3518(Statics.field1987, Statics.field5346);
				class207.method3391(Statics.field1987);
				class183.method5596(Statics.field1987);
				int var57 = Statics.field9;
				Statics.field5048 = new int[var57];
				Statics.field4023 = new int[var57];
				Statics.field1555 = new class359(Statics.field689, Statics.field5346, Statics.field5388, Statics.field1727, Statics.field254);
				class178.method9661(Statics.field1987);
				class191.method448(Statics.field1987);
				class410 var58 = Statics.field1987;
				Statics.field2019 = var58;
				class205.method3632(Statics.field1987);
				class410 var59 = Statics.field1987;
				Statics.field2276 = var59;
				class410 var60 = Statics.field1987;
				Statics.field66 = var60;
				class578.method4331(Statics.field1987);
				class410 var61 = Statics.field1987;
				Statics.field5840 = var61;
				Statics.field1836 = new class569(Statics.field5085, 54, Statics.field2971, Statics.field1987);
				Statics.field818 = new class569(Statics.field5085, 47, Statics.field2971, Statics.field1987);
				Statics.field5479 = new class91();
				class410 var62 = Statics.field1987;
				class410 var63 = Statics.field5388;
				class410 var64 = Statics.field1727;
				Statics.field278 = var62;
				Statics.field2288 = var63;
				Statics.field1281 = var64;
				class188.method3436(Statics.field1987, Statics.field5388);
				class185.method9222(Statics.field1987, Statics.field5388);
				class53.method7906(50, class394.field4503);
				method2126(class71.field962);
			} else {
				class53.method7906(40, class394.field4502 + (Statics.field3842.method7657() / 6 + 80) + "%");
			}
		} else if (field402 == class71.field962) {
			int var65 = 0;
			if (Statics.field1905 == null) {
				Statics.field1905 = class607.method3059(Statics.field5388, Statics.field3828.field5530, 0);
			} else {
				var65++;
			}
			if (Statics.field1977 == null) {
				Statics.field1977 = class607.method3059(Statics.field5388, Statics.field3828.field5540, 0);
			} else {
				var65++;
			}
			if (Statics.field203 == null) {
				class410 var66 = Statics.field5388;
				int var67 = Statics.field3828.field5525;
				class605[] var68;
				if (class607.method10276(var66, var67, 0)) {
					class605[] var69 = new class605[Statics.field6027];
					for (int var70 = 0; var70 < Statics.field6027; var70++) {
						class605 var71 = var69[var70] = new class605();
						var71.field6006 = Statics.field6026;
						var71.field6009 = Statics.field5848;
						var71.field6010 = Statics.field1764[var70];
						var71.field6012 = Statics.field2083[var70];
						var71.field6008 = Statics.field3069[var70];
						var71.field6011 = Statics.field5391[var70];
						var71.field6007 = Statics.field5415;
						var71.field6013 = Statics.field26[var70];
					}
					class607.method7573();
					var68 = var69;
				} else {
					var68 = null;
				}
				Statics.field203 = var68;
			} else {
				var65++;
			}
			if (Statics.field2439 == null) {
				Statics.field2439 = class607.method8744(Statics.field5388, Statics.field3828.field5533, 0);
			} else {
				var65++;
			}
			if (Statics.field1138 == null) {
				Statics.field1138 = class607.method8744(Statics.field5388, Statics.field3828.field5529, 0);
			} else {
				var65++;
			}
			if (Statics.field4849 == null) {
				Statics.field4849 = class607.method8744(Statics.field5388, Statics.field3828.field5535, 0);
			} else {
				var65++;
			}
			if (Statics.field2277 == null) {
				Statics.field2277 = class607.method8744(Statics.field5388, Statics.field3828.field5534, 0);
			} else {
				var65++;
			}
			if (Statics.field2157 == null) {
				Statics.field2157 = class607.method8744(Statics.field5388, Statics.field3828.field5537, 0);
			} else {
				var65++;
			}
			if (Statics.field2186 == null) {
				Statics.field2186 = class607.method8744(Statics.field5388, Statics.field3828.field5538, 0);
			} else {
				var65++;
			}
			if (Statics.field3066 == null) {
				class410 var73 = Statics.field5388;
				int var74 = Statics.field3828.field5539;
				class605[] var75;
				if (class607.method10276(var73, var74, 0)) {
					class605[] var76 = new class605[Statics.field6027];
					for (int var77 = 0; var77 < Statics.field6027; var77++) {
						class605 var78 = var76[var77] = new class605();
						var78.field6006 = Statics.field6026;
						var78.field6009 = Statics.field5848;
						var78.field6010 = Statics.field1764[var77];
						var78.field6012 = Statics.field2083[var77];
						var78.field6008 = Statics.field3069[var77];
						var78.field6011 = Statics.field5391[var77];
						var78.field6007 = Statics.field5415;
						var78.field6013 = Statics.field26[var77];
					}
					class607.method7573();
					var75 = var76;
				} else {
					var75 = null;
				}
				Statics.field3066 = var75;
			} else {
				var65++;
			}
			if (Statics.field5105 == null) {
				class410 var80 = Statics.field5388;
				int var81 = Statics.field3828.field5531;
				class605[] var82;
				if (class607.method10276(var80, var81, 0)) {
					class605[] var83 = new class605[Statics.field6027];
					for (int var84 = 0; var84 < Statics.field6027; var84++) {
						class605 var85 = var83[var84] = new class605();
						var85.field6006 = Statics.field6026;
						var85.field6009 = Statics.field5848;
						var85.field6010 = Statics.field1764[var84];
						var85.field6012 = Statics.field2083[var84];
						var85.field6008 = Statics.field3069[var84];
						var85.field6011 = Statics.field5391[var84];
						var85.field6007 = Statics.field5415;
						var85.field6013 = Statics.field26[var84];
					}
					class607.method7573();
					var82 = var83;
				} else {
					var82 = null;
				}
				Statics.field5105 = var82;
			} else {
				var65++;
			}
			if (var65 < 11) {
				class53.method7906(70, class394.field4720 + var65 * 100 / 12 + "%");
			} else {
				Statics.field5247 = Statics.field5105;
				Statics.field1977.method10811();
				int var87 = (int) (Math.random() * 21.0D) - 10;
				int var88 = (int) (Math.random() * 21.0D) - 10;
				int var89 = (int) (Math.random() * 21.0D) - 10;
				int var90 = (int) (Math.random() * 41.0D) - 20;
				Statics.field203[0].method10783(var87 + var90, var88 + var90, var89 + var90);
				class53.method7906(60, class394.field4505);
				method2126(class71.field968);
			}
		} else if (field402 == class71.field968) {
			if (Statics.field1957.method7697()) {
				Statics.field5499 = new class238(Statics.field1957, Statics.field5388, 20, Statics.field240.method2517(), 128);
				class226.method4627(Statics.field5499);
				class226.method4628(Statics.field240.method2517());
				method2126(class71.field972);
			} else {
				class53.method7906(70, class394.field4506 + "0%");
			}
		} else if (field402 == class71.field972) {
			int var91 = Statics.field5499.method5066();
			if (var91 < 100) {
				class53.method7906(80, class394.field4506 + var91 + "%");
			} else {
				class53.method7906(90, class394.field4618);
				method2126(class71.field973);
			}
		} else if (field402 == class71.field973) {
			Statics.field4847 = new class67();
			Statics.field1567.method5505(Statics.field4847, 10);
			class53.method7906(92, class394.field4776);
			method2126(class71.field974);
		} else if (field402 == class71.field974) {
			if (Statics.field131.method7711("huffman", "")) {
				class376 var92 = new class376(Statics.field131.method7723("huffman", ""));
				Statics.field4329 = var92;
				class53.method7906(94, class394.field4510);
				method2126(class71.field975);
			} else {
				class53.method7906(94, class394.field4526 + "%");
			}
		} else if (field402 == class71.field975) {
			if (!Statics.field689.method7697()) {
				class53.method7906(96, class394.field4665 + Statics.field689.method7657() * 4 / 5 + "%");
			} else if (!Statics.field254.method7697()) {
				class53.method7906(96, class394.field4665 + Statics.field254.method7657() * 4 / 5 + "%");
			} else if (!Statics.field3842.method7697()) {
				class53.method7906(96, class394.field4665 + (Statics.field3842.method7657() / 6 + 80) + "%");
			} else if (Statics.field1727.method7697()) {
				class53.method7906(98, class394.field4792);
				if (Statics.field3842.method7710("version.dat", "")) {
					class591 var93 = new class591(Statics.field3842.method7723("version.dat", ""));
					var93.method10341();
				}
				method2126(class71.field976);
			} else {
				class53.method7906(96, class394.field4665 + (Statics.field1727.method7657() / 50 + 96) + "%");
			}
		} else if (field402 == class71.field976) {
			if (Statics.field3507.method7700() <= 0 || Statics.field3507.method7712(class309.field3499.field3497)) {
				if (Statics.field817 == null) {
					Statics.field817 = new class555();
					Statics.field817.method9821(Statics.field3507, Statics.field5662, Statics.field281, Statics.field3832, field388, Statics.field203);
				}
				class53.method7906(100, class394.field4694);
				if (Statics.field5442) {
					method2126(class71.field978);
				} else {
					method2126(class71.field977);
				}
			} else {
				class53.method7906(100, class394.field4668 + Statics.field3507.method7714(class309.field3499.field3497) / 10 + "%");
			}
		} else if (field402 == class71.field978) {
			Statics.field794 = false;
			method3384(20);
			method9655(class44.field312);
		}
	}

	@ObfuscatedName("cx.hm(Lca;I)V")
	public static void method2126(class71 arg0) {
		if (field402 != arg0) {
			field402 = arg0;
		}
	}

	@ObfuscatedName("ib.hp(IZZZZB)Lpw;")
	public static class410 method4350(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		class516 var5 = null;
		if (class261.field3112 != null) {
			var5 = new class516(arg0, class261.field3112, Statics.field3108[arg0], 1000000);
		}
		return new class410(var5, Statics.field1074, Statics.field3419, arg0, arg1, arg2, arg3, arg4, false);
	}

	@ObfuscatedName("ft.hq(IZZZZZI)Lpw;")
	public static class410 method3479(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
		class516 var6 = null;
		if (class261.field3112 != null) {
			var6 = new class516(arg0, class261.field3112, Statics.field3108[arg0], 1000000);
		}
		return new class410(var6, Statics.field1074, Statics.field3419, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("fu.hh(Lmy;B)V")
	public static void method3603(class330 arg0) {
		arg0.field3665.method10547(Statics.field2092.field4960);
		arg0.field3665.method10393(Statics.field5388.field4960);
		arg0.field3665.method10392(Statics.field1727.field4960);
		arg0.field3665.method10392(Statics.field4043.field4960);
		arg0.field3665.method10392(Statics.field1831.field4960);
		arg0.field3665.method10393(Statics.field1515.field4960);
		arg0.field3665.method10377(Statics.field131.field4960);
	}

	@ObfuscatedName("oz.hz(B)V")
	public static void method6988() {
		field395 = -1L;
		if (Statics.field4847 != null) {
			Statics.field4847.field908 = 0;
		}
		Statics.field179 = true;
		field399 = true;
		field467 = -1L;
		class37.field242 = new class439();
		field315.method2868();
		field315.field1290 = 0;
		field315.field1294.field5920 = 0;
		field315.field1305 = null;
		field315.field1296 = null;
		field315.field1303 = null;
		field315.field1307 = null;
		field315.field1295 = 0;
		field315.field1298 = 0;
		field374 = 0;
		field580 = 0;
		field456 = 0;
		method7489();
		class36.method735(0);
		class92.field1287.clear();
		class92.field1288.method7941();
		class92.field1284.method8190();
		class92.field1285 = 0;
		field358 = 0;
		field530 = false;
		class59.field837 = 0;
		field425 = 0;
		field337 = 0;
		Statics.field1781 = null;
		field586 = 0;
		field577 = -1;
		field582 = 0;
		field532 = 0;
		field341 = class85.field1214;
		field319 = class85.field1214;
		field334.method2348();
		field347 = -1;
		field335.method8029();
		field336.method2779();
		Statics.field280.method1510();
		Arrays.fill(Statics.field5048, 0);
		Arrays.fill(Statics.field4023, 0);
		if (Statics.field5479 != null) {
			Statics.field5479.method2817();
		}
		field430 = -1;
		if (field422 != -1) {
			Statics.field1555.method6866(field422);
		}
		for (class65 var0 = (class65) field423.method7976(); var0 != null; var0 = (class65) field423.method7977()) {
			method5873(var0, true);
		}
		field422 = -1;
		field423 = new class429(8);
		field565 = null;
		method7489();
		field323.method6914(null, null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
		for (int var1 = 0; var1 < 8; var1++) {
			field517[var1] = null;
			field440[var1] = false;
		}
		class63.field868 = new class429(32);
		field393 = true;
		for (int var2 = 0; var2 < 100; var2++) {
			field437[var2] = true;
		}
		if (field315 != null && field315.field1309 != null) {
			class330 var3 = class330.method3456(class328.field3569, field315.field1309);
			var3.field3665.method10320(method724());
			var3.field3665.method10321(Statics.field208);
			var3.field3665.method10321(Statics.field4810);
			field315.method2874(var3);
		}
		Statics.field91 = null;
		Statics.field5334 = null;
		Arrays.fill(field366, null);
		Statics.field1230 = null;
		Arrays.fill(field583, null);
		for (int var4 = 0; var4 < 8; var4++) {
			field381[var4] = new class422();
		}
		Statics.field5306 = null;
		field376 = 0;
		field598 = 0;
		field314 = 0;
		field379 = 0;
	}

	@ObfuscatedName("lv.hw(B)V")
	public static void method6282() {
		field315.method2868();
		field315.field1290 = 0;
		field315.field1294.field5920 = 0;
		field315.field1305 = null;
		field315.field1296 = null;
		field315.field1303 = null;
		field315.field1307 = null;
		field315.field1295 = 0;
		field315.field1298 = 0;
		field374 = 0;
		method7489();
		field586 = 0;
		field582 = 0;
		Statics.field3837.method2631();
		class63.method10039();
		method3384(30);
		for (int var0 = 0; var0 < 100; var0++) {
			field437[var0] = true;
		}
		if (field315 == null || field315.field1309 == null) {
			return;
		}
		class330 var1 = class330.method3456(class328.field3569, field315.field1309);
		var1.field3665.method10320(method724());
		var1.field3665.method10321(Statics.field208);
		var1.field3665.method10321(Statics.field4810);
		field315.method2874(var1);
	}

	@ObfuscatedName("oa.ht(I)V")
	public static final void method7564() {
		field315.method2886();
		method10028();
		field334.method2348();
		field335.method8029();
		field336.method2779();
		field599.method5671();
		System.gc();
		class340.method5500(0, 0);
		class340.method3684();
		field447 = false;
		class73.method6274();
		method3384(10);
		field568 = 0;
		class266.method5521().method5568();
		class266.method5521().method5569();
	}

	@ObfuscatedName("ng.hl(IB)V")
	public static final void method6900(int arg0) {
		method7564();
		switch(arg0) {
			case 1:
				class53.method2628(24);
				class53.method2114(class394.field4715, class394.field4716, class394.field4717);
				break;
			case 2:
				class53.method2628(24);
				class53.method2114(class394.field4712, class394.field4713, class394.field4741);
		}
	}

	@ObfuscatedName("kv.hn(S)J")
	public static long method5916() {
		return field510;
	}

	@ObfuscatedName("kh.ho(I)J")
	public static long method5703() {
		return field511;
	}

	@ObfuscatedName("vf.hu(I)V")
	public static final void method10028() {
		class190.field2065.method6456();
		class192.field2082.method6456();
		Statics.method2823();
		class580.method7550();
		class578.field5832.method6456();
		class191.field2067.method6456();
		class215.field2444.method6456();
		class203.field2212.method6456();
		class188.method8267();
		class211.field2291.method6456();
		class211.field2286.method6456();
		class211.field2287.method6456();
		class180.method1088();
		class187.field2034.method6456();
		class178.field1960.method6456();
		class213.method3062();
		class185.method3682();
		class193.method7630();
		class196.method286();
		class214.method3778();
		class209.method3909();
		class216.field2467.method6456();
		class216.field2468.method6456();
		class216.field2469.method6456();
		class202.method3643();
		class210.method2198();
		class207.field2259.method6456();
		if (Statics.field1836 != null) {
			Statics.field1836.method10140();
		}
		if (Statics.field818 != null) {
			Statics.field818.method10140();
		}
		class197.method3775();
		class200.method2736();
		class186.field2016.method6456();
		class184.field1989.method6456();
		class179.field1964.method6456();
		class182.field1976.method6456();
		class208.method3766();
		Statics.method6469();
		class205.field2251.method6456();
		field464.method6456();
		field452.method6456();
		class366.method3820();
		if (Statics.field1555 != null) {
			Statics.field1555.method6867();
		}
		if (class226.field2633.field3011 != null) {
			((class238) class226.field2633.field3011).method5071();
		}
		class56.method9537();
		field604.method9137();
		if (Statics.field5031 != null) {
			Statics.field5031.method7779();
		}
		if (Statics.field914 != null) {
			Statics.field914.method7779();
		}
		if (Statics.field3205 != null) {
			Statics.field3205.method7779();
		}
		if (Statics.field131 != null) {
			Statics.field131.method7779();
		}
		if (Statics.field3842 != null) {
			Statics.field3842.method7779();
		}
		if (Statics.field1987 != null) {
			Statics.field1987.method7779();
		}
		if (Statics.field3303 != null) {
			Statics.field3303.method7779();
		}
		if (Statics.field5020 != null) {
			Statics.field5020.method7779();
		}
		if (Statics.field1727 != null) {
			Statics.field1727.method7779();
		}
		if (Statics.field689 != null) {
			Statics.field689.method7779();
		}
		if (Statics.field254 != null) {
			Statics.field254.method7779();
		}
		if (Statics.field1515 != null) {
			Statics.field1515.method7779();
		}
		if (Statics.field3101 != null) {
			Statics.field3101.method7779();
		}
		if (Statics.field1761 != null) {
			Statics.field1761.method7779();
		}
		if (Statics.field4043 != null) {
			Statics.field4043.method7779();
		}
		if (Statics.field5346 != null) {
			Statics.field5346.method7779();
		}
		if (Statics.field2092 != null) {
			Statics.field2092.method7779();
		}
		if (Statics.field5388 != null) {
			Statics.field5388.method7779();
		}
		if (Statics.field1957 != null) {
			Statics.field1957.method7779();
		}
		if (Statics.field1831 != null) {
			Statics.field1831.method7779();
		}
		if (Statics.field281 != null) {
			Statics.field281.method7779();
		}
		if (Statics.field5662 != null) {
			Statics.field5662.method7779();
		}
		if (Statics.field3507 != null) {
			Statics.field3507.method7779();
		}
	}

	@ObfuscatedName("cw.hv(I)V")
	public static final void method1880() {
		class187.method5907();
	}

	@ObfuscatedName("ng.hr(I)V")
	public static final void method6899() {
		if (field580 > 0) {
			method7564();
		} else {
			field472.method7606();
			method3384(40);
			Statics.field51 = field315.method2873();
			field315.method2872();
		}
	}

	@ObfuscatedName("mr.he(ZB)V")
	public static final void method6470(boolean arg0) {
		if (arg0) {
			field572 = class53.field744 ? class132.field1599 : class132.field1598;
		} else {
			field572 = Statics.field240.method2523(class53.field737) ? class132.field1603 : class132.field1597;
		}
	}

	@ObfuscatedName("ex.hb(I)V")
	public static final void method3420() {
		if (Statics.field964 != null) {
			Statics.field964.method2979();
		}
	}

	@ObfuscatedName("vo.im(Ljava/util/ArrayList;IIIII)V")
	public static void method10142(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0.isEmpty()) {
			return;
		}
		int var5 = (Integer) arg0.get(0);
		if (var5 == -1 && !field447) {
			class340.method5500(0, 0);
		} else if (var5 != -1) {
			boolean var7;
			if (class340.field3890.isEmpty()) {
				var7 = false;
			} else {
				class352 var6 = (class352) class340.field3890.get(0);
				var7 = var6 != null && var6.field4008 == var5;
			}
			if (!var7 && Statics.field240.method2519() != 0) {
				ArrayList var8 = new ArrayList();
				for (int var9 = 0; var9 < arg0.size(); var9++) {
					var8.add(new class352(Statics.field4043, (Integer) arg0.get(var9), 0, Statics.field240.method2519(), false));
				}
				if (field447) {
					class340.method4196(var8, arg1, arg2, arg3, arg4);
				} else {
					class340.method5668(var8, arg1, arg2, arg3, arg4, false);
				}
			}
		}
	}

	@ObfuscatedName("gd.il(III)V")
	public static void method3821(int arg0, int arg1) {
		if (Statics.field240.method2519() != 0 && arg0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new class352(Statics.field3101, arg0, 0, Statics.field240.method2519(), false));
			class340.method5668(var2, 0, 0, 0, 0, true);
			field447 = true;
		}
	}

	@ObfuscatedName("cb.ia(I)V")
	public static final void method2090() {
		if (Statics.field1615) {
			method5906();
			Statics.field1615 = false;
		}
	}

	@ObfuscatedName("ap.if(Loi;III)V")
	public static final void method14(class370 arg0, int arg1, int arg2) {
		if (field586 != 0 && field586 != 3 || (field522 || class36.field223 != 1 && (Statics.field5059 || class36.field223 != 4))) {
			return;
		}
		class355 var3 = arg0.method7392(Statics.field1555, true);
		if (var3 == null) {
			return;
		}
		int var4 = class36.field222 - arg1;
		int var5 = class36.field225 - arg2;
		if (!var3.method6784(var4, var5)) {
			return;
		}
		int var6 = var4 - var3.field4020 / 2;
		int var7 = var5 - var3.field4021 / 2;
		int var8 = field425 & 0x7FF;
		int var9 = class226.field2638[var8];
		int var10 = class226.field2637[var8];
		int var11 = var6 * var10 + var7 * var9 >> 11;
		int var12 = var7 * var10 - var6 * var9 >> 11;
		int var13 = field553 + var11 >> 7;
		int var14 = field338 - var12 >> 7;
		class519 var15 = field334.method2313(-1);
		if (class519.field5494 == var15) {
			method8531(var13, var14, var6, var7);
		} else if (class519.field5495 == var15) {
			int var16 = var3.field4020 / 2 + arg1;
			int var17 = var3.field4021 / 2 + arg2;
			int var18 = class36.field232 - var16;
			int var19 = class36.field221 - var17;
			int var20 = class537.method3431(var19, var18);
			int var21 = var20 - field425;
			int var22 = var21 & 0x7FF;
			int var23 = var22 + 64;
			int var24 = (var23 & 0x7FF) / 128;
			field584 = var24;
			field585 = 30;
			method4198(field584);
		}
	}

	@ObfuscatedName("ra.ib(IIIII)V")
	public static void method8531(int arg0, int arg1, int arg2, int arg3) {
		class330 var4 = class330.method3456(class328.field3551, field315.field1309);
		var4.field3665.method10320(18);
		var4.field3665.method10320(field552.method5701(82) ? (field552.method5701(81) ? 2 : 1) : 0);
		var4.field3665.method10381(Statics.field3837.field1165 + arg0);
		var4.field3665.method10381(Statics.field3837.field1166 + arg1);
		var4.field3665.method10320(arg2);
		var4.field3665.method10320(arg3);
		var4.field3665.method10321(field425);
		var4.field3665.method10320(57);
		var4.field3665.method10320(0);
		var4.field3665.method10320(0);
		var4.field3665.method10320(89);
		var4.field3665.method10321(Statics.field1109.field1056);
		var4.field3665.method10321(Statics.field1109.field1057);
		var4.field3665.method10320(63);
		field315.method2874(var4);
		field582 = arg0;
		field532 = arg1;
	}

	@ObfuscatedName("hv.is(II)V")
	public static void method4198(int arg0) {
		class330 var1 = class330.method3456(class328.field3620, field315.field1309);
		var1.field3665.method10370(arg0);
		field315.method2874(var1);
	}

	@ObfuscatedName("el.iy(I)V")
	public static final void method3356() {
		int[] var0 = field336.field1244;
		Iterator var1 = field334.iterator();
		while (var1.hasNext()) {
			class80 var2 = (class80) var1.next();
			for (int var3 = 0; var3 < field336.field1255; var3++) {
				class70 var4 = (class70) var2.field1170.method7917((long) var0[var3]);
				if (var4 != null && var4.field1079 > 0) {
					var4.field1079--;
					if (var4.field1079 == 0) {
						var4.field1076 = null;
					}
				}
			}
			Iterator var5 = var2.field1161.iterator();
			while (var5.hasNext()) {
				class82 var6 = (class82) var5.next();
				if (var6 != null && var6.field1079 > 0) {
					var6.field1079--;
					if (var6.field1079 == 0) {
						var6.field1076 = null;
					}
				}
			}
		}
	}

	@ObfuscatedName("fz.ij(Ljava/lang/String;I)V")
	public static final void method3667(String arg0) {
		if (arg0.equalsIgnoreCase("toggleroof")) {
			Statics.field240.method2507(!Statics.field240.method2623());
			if (Statics.field240.method2623()) {
				class92.method2825(99, "", "Roofs are now all hidden");
			} else {
				class92.method2825(99, "", "Roofs will only be removed selectively");
			}
		}
		if (arg0.startsWith("zbuf")) {
			boolean var1 = class446.method4011(arg0.substring(5).trim()) == 1;
			Statics.field5520.method518(var1);
			class226.method4626(var1);
		}
		if (arg0.equalsIgnoreCase("z")) {
			field401 = !field401;
		}
		if (arg0.equalsIgnoreCase("displayfps")) {
			Statics.field240.method2512();
		}
		if (arg0.equalsIgnoreCase("renderself")) {
			field392 = !field392;
		}
		if (arg0.equalsIgnoreCase("mouseovertext")) {
			field528 = !field528;
		}
		if (arg0.startsWith("setdrawdistance")) {
			String[] var2 = arg0.split(" ");
			try {
				int var3 = Integer.parseInt(var2[1]);
				Statics.field240.method2506(var3);
			} catch (NumberFormatException var15) {
				class92.method2825(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
			}
		}
		if (arg0.startsWith("settilerendermode")) {
			String[] var5 = arg0.split(" ");
			try {
				int var6 = Integer.parseInt(var5[1]);
				Statics.field3837.field1160.method4838(class218.method4522()[var6]);
			} catch (NumberFormatException var14) {
				class92.method2825(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var5[1]));
			}
		}
		if (arg0.equalsIgnoreCase("getdrawdistance")) {
			class92.method2825(99, "", String.format("%d", Statics.field240.method2536()));
		}
		if (field429 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equalsIgnoreCase("showcoord")) {
				Statics.field817.field5687 = !Statics.field817.field5687;
			}
			if (arg0.equalsIgnoreCase("fpson")) {
				Statics.field240.method2514(true);
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Statics.field240.method2514(false);
			}
			if (arg0.equalsIgnoreCase("gc")) {
				System.gc();
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				method6899();
			}
			if (arg0.equalsIgnoreCase("clientreload")) {
				method3816();
			} else if (arg0.equalsIgnoreCase("sfx8bit")) {
				Statics.field240.method2619(true);
			} else if (arg0.equalsIgnoreCase("sfx16bit")) {
				Statics.field240.method2619(false);
			} else if (arg0.startsWith("playsong ")) {
				String var8 = arg0.substring("playsong ".length());
				try {
					if (Statics.field240.method2519() == 0) {
						class340.method5500(0, 0);
					} else {
						int var9 = Statics.field240.method2519();
						class340.method5500(0, 0);
						ArrayList var10 = new ArrayList();
						var10.add(new class352(Statics.field4043, var8, "", var9, false));
						class340.method5668(var10, 0, 0, 0, 100, false);
					}
				} catch (Exception var13) {
					class92.method2825(99, "", "Can't play the midi named " + var8);
				}
			} else if (arg0.equalsIgnoreCase("stopsong")) {
				class340.method5500(0, 0);
			}
		}
		class330 var12 = class330.method3456(class328.field3636, field315.field1309);
		var12.field3665.method10320(arg0.length() + 1);
		var12.field3665.method10504(arg0);
		field315.method2874(var12);
	}

	@ObfuscatedName("kh.iq(II)I")
	public static final int method5721(int arg0) {
		return Math.min(Math.max(arg0, 128), 383);
	}

	@ObfuscatedName("iq.io(II)I")
	public static final int method4517(int arg0) {
		return Math.abs(arg0 - Statics.field3461) > 1024 ? (arg0 < Statics.field3461 ? 1 : -1) * 2048 + arg0 : arg0;
	}

	@ObfuscatedName("ls.iw(IIIB)V")
	public static final void method6325(int arg0, int arg1, int arg2) {
		if (Statics.field2053 < arg0) {
			Statics.field2053 += Statics.field3291 * (arg0 - Statics.field2053) / 1000 + Statics.field3151;
			if (Statics.field2053 > arg0) {
				Statics.field2053 = arg0;
			}
		}
		if (Statics.field2053 > arg0) {
			Statics.field2053 -= Statics.field3291 * (Statics.field2053 - arg0) / 1000 + Statics.field3151;
			if (Statics.field2053 < arg0) {
				Statics.field2053 = arg0;
			}
		}
		if (Statics.field1941 < arg1) {
			Statics.field1941 += Statics.field3291 * (arg1 - Statics.field1941) / 1000 + Statics.field3151;
			if (Statics.field1941 > arg1) {
				Statics.field1941 = arg1;
			}
		}
		if (Statics.field1941 > arg1) {
			Statics.field1941 -= Statics.field3291 * (Statics.field1941 - arg1) / 1000 + Statics.field3151;
			if (Statics.field1941 < arg1) {
				Statics.field1941 = arg1;
			}
		}
		if (Statics.field47 < arg2) {
			Statics.field47 += Statics.field3291 * (arg2 - Statics.field47) / 1000 + Statics.field3151;
			if (Statics.field47 > arg2) {
				Statics.field47 = arg2;
			}
		}
		if (Statics.field47 > arg2) {
			Statics.field47 -= Statics.field3291 * (Statics.field47 - arg2) / 1000 + Statics.field3151;
			if (Statics.field47 < arg2) {
				Statics.field47 = arg2;
			}
		}
	}

	@ObfuscatedName("gm.iu(III)V")
	public static final void method3791(int arg0, int arg1) {
		if (arg0 < 128) {
			arg0 = 128;
		} else if (arg0 > 383) {
			arg0 = 383;
		}
		if (Statics.field4856 < arg0) {
			Statics.field4856 += Statics.field1726 * (arg0 - Statics.field4856) / 1000 + Statics.field688;
			if (Statics.field4856 > arg0) {
				Statics.field4856 = arg0;
			}
		} else if (Statics.field4856 > arg0) {
			Statics.field4856 -= Statics.field1726 * (Statics.field4856 - arg0) / 1000 + Statics.field688;
			if (Statics.field4856 < arg0) {
				Statics.field4856 = arg0;
			}
		}
		int var2 = arg1 & 0x7FF;
		int var3 = var2 - Statics.field3461;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}
		if (var3 > 0) {
			Statics.field3461 += Statics.field1726 * var3 / 1000 + Statics.field688;
			Statics.field3461 &= 0x7FF;
		} else if (var3 < 0) {
			Statics.field3461 -= Statics.field1726 * -var3 / 1000 + Statics.field688;
			Statics.field3461 &= 0x7FF;
		}
		int var4 = var2 - Statics.field3461;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}
		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			Statics.field3461 = var2;
		}
	}

	@ObfuscatedName("bs.ir(I)V")
	public static final void method404() {
		if (!field554) {
			int var0 = class357.method6806(Statics.field115);
			int var1 = class357.method6806(Statics.field2488);
			int var2 = method7784(Statics.field3837, var0, var1, Statics.field3837.field1171) - Statics.field5047;
			method6325(var0, var2, var1);
		} else if (field590 != null) {
			Statics.field2053 = field590.method9790();
			Statics.field47 = field590.method9791();
			if (field589) {
				Statics.field1941 = field590.method9789();
			} else {
				Statics.field1941 = method7784(Statics.field3837, Statics.field2053, Statics.field47, Statics.field3837.field1171) - field590.method9789();
			}
			field590.method9803();
		}
		if (field588) {
			if (field478 != null) {
				Statics.field4856 = field478.method9798();
				Statics.field4856 = Math.min(Math.max(Statics.field4856, 128), 383);
				field478.method9803();
			}
			if (field515 != null) {
				Statics.field3461 = field515.method9798() & 0x7FF;
				field515.method9803();
			}
			return;
		}
		int var3 = class357.method6806(Statics.field1910);
		int var4 = class357.method6806(Statics.field2655);
		int var5 = method7784(Statics.field3837, var3, var4, Statics.field3837.field1171) - Statics.field5414;
		int var6 = var3 - Statics.field2053;
		int var7 = var5 - Statics.field1941;
		int var8 = var4 - Statics.field47;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
		method3791(var10, var11);
	}

	@ObfuscatedName("li.ik(I)V")
	public static void method6265() {
		field349 = field492;
		Statics.field8 = class385.field4405;
		field348 = -1;
	}

	@ObfuscatedName("ci.ip(Ldr;III)Lre;")
	public static class453 method1977(class80 arg0, int arg1, int arg2) {
		if (arg0 == null || Statics.field3837 == arg0) {
			return class453.method6269((float) arg1, 0.0F, (float) arg2);
		} else {
			class506 var3 = (class506) Statics.field3837.field1172.method7946((long) arg0.field1173);
			return var3 == null ? class453.method6269((float) arg1, 0.0F, (float) arg2) : var3.method9356(arg1, arg2);
		}
	}

	@ObfuscatedName("rl.ii(I)V")
	public static final void method8428() {
		int var0 = field336.field1255;
		int[] var1 = field336.field1244;
		Iterator var2 = field334.iterator();
		while (var2.hasNext()) {
			class80 var3 = (class80) var2.next();
			for (int var4 = 0; var4 < var0; var4++) {
				class70 var5 = (class70) var3.field1170.method7917((long) var1[var4]);
				if (var5 != null) {
					method6327(var3, var5, 1);
				}
			}
		}
	}

	@ObfuscatedName("lp.id(Ldr;Lct;II)V")
	public static final void method6327(class80 arg0, class76 arg1, int arg2) {
		if (arg1.field1086 >= field413) {
			method10186(arg1);
		} else if (arg1.field1095 >= field413) {
			boolean var3 = field413 == arg1.field1095 || !arg1.method2381();
			if (!var3) {
				class216 var4 = arg1.field1075.method8916();
				if (var4 == null || var4.method4467()) {
					var3 = true;
				} else {
					var3 = arg1.field1075.method8962() + 1 > var4.field2461[arg1.field1075.method8900()];
				}
			}
			if (var3) {
				int var5 = arg1.field1095 - arg1.field1086;
				int var6 = field413 - arg1.field1086;
				int var7 = arg1.field1090 * 128 + arg1.field1060 * 64;
				int var8 = arg1.field1092 * 128 + arg1.field1060 * 64;
				int var9 = arg1.field1073 * 128 + arg1.field1060 * 64;
				int var10 = arg1.field1085 * 128 + arg1.field1060 * 64;
				arg1.field1056 = ((var5 - var6) * var7 + var6 * var9) / var5;
				arg1.field1057 = ((var5 - var6) * var8 + var6 * var10) / var5;
			}
			arg1.field1105 = 0;
			arg1.field1098 = arg1.field1096;
			arg1.field1058 = arg1.field1098;
		} else {
			int var11 = arg1.field1061;
			if (arg1.field1101 == 0) {
				arg1.field1105 = 0;
				arg1.method2398(var11);
			} else {
				label413: {
					if (arg1.method2381()) {
						class216 var12 = arg1.field1075.method8916();
						if (arg1.field1041 > 0 && var12.field2493 == 0) {
							arg1.field1105++;
							arg1.method2398(var11);
							break label413;
						}
						if (arg1.field1041 <= 0 && var12.field2486 == 0) {
							arg1.field1105++;
							arg1.method2398(var11);
							break label413;
						}
					}
					int var13 = arg1.field1056;
					int var14 = arg1.field1057;
					int var15 = arg1.field1040[arg1.field1101 - 1] * 128 + arg1.field1060 * 64;
					int var16 = arg1.field1108[arg1.field1101 - 1] * 128 + arg1.field1060 * 64;
					if (var13 < var15) {
						if (var14 < var16) {
							arg1.field1098 = 1280;
						} else if (var14 > var16) {
							arg1.field1098 = 1792;
						} else {
							arg1.field1098 = 1536;
						}
					} else if (var13 > var15) {
						if (var14 < var16) {
							arg1.field1098 = 768;
						} else if (var14 > var16) {
							arg1.field1098 = 256;
						} else {
							arg1.field1098 = 512;
						}
					} else if (var14 < var16) {
						arg1.field1098 = 1024;
					} else if (var14 > var16) {
						arg1.field1098 = 0;
					}
					class281 var17 = arg1.field1055[arg1.field1101 - 1];
					if (var15 - var13 <= 256 && var15 - var13 >= -256 && var16 - var14 <= 256 && var16 - var14 >= -256) {
						int var18 = arg1.field1098 - arg1.field1058 & 0x7FF;
						if (var18 > 1024) {
							var18 -= 2048;
						}
						int var19 = arg1.field1089;
						if (var18 >= -256 && var18 <= 256) {
							var19 = arg1.field1064;
						} else if (var18 >= 256 && var18 < 768) {
							var19 = arg1.field1067;
						} else if (var18 >= -768 && var18 <= -256) {
							var19 = arg1.field1097;
						}
						if (var19 == -1) {
							var19 = arg1.field1064;
						}
						int var20 = 4;
						boolean var21 = true;
						if (arg1 instanceof class82) {
							var21 = ((class82) arg1).field1185.field2121;
						}
						if (var21) {
							if (arg1.field1098 != arg1.field1058 && arg1.field1083 == -1 && arg1.field1100 != 0) {
								var20 = 2;
							}
							if (arg1.field1101 > 2) {
								var20 = 6;
							}
							if (arg1.field1101 > 3) {
								var20 = 8;
							}
							if (arg1.field1105 > 0 && arg1.field1101 > 1) {
								var20 = 8;
								arg1.field1105--;
							}
						} else {
							if (arg1.field1101 > 1) {
								var20 = 6;
							}
							if (arg1.field1101 > 2) {
								var20 = 8;
							}
							if (arg1.field1105 > 0 && arg1.field1101 > 1) {
								var20 = 8;
								arg1.field1105--;
							}
						}
						if (class281.field3283 == var17) {
							var20 <<= 0x1;
						} else if (class281.field3281 == var17) {
							var20 >>= 0x1;
						}
						if (var20 >= 8) {
							if (arg1.field1064 == var19 && arg1.field1068 != -1) {
								var19 = arg1.field1068;
							} else if (arg1.field1089 == var19 && arg1.field1069 != -1) {
								var19 = arg1.field1069;
							} else if (arg1.field1097 == var19 && arg1.field1066 != -1) {
								var19 = arg1.field1066;
							} else if (arg1.field1067 == var19 && arg1.field1091 != -1) {
								var19 = arg1.field1091;
							}
						} else if (var20 <= 2) {
							if (arg1.field1064 == var19 && arg1.field1072 != -1) {
								var19 = arg1.field1072;
							} else if (arg1.field1089 == var19 && arg1.field1070 != -1) {
								var19 = arg1.field1070;
							} else if (arg1.field1097 == var19 && arg1.field1062 != -1) {
								var19 = arg1.field1062;
							} else if (arg1.field1067 == var19 && arg1.field1106 != -1) {
								var19 = arg1.field1106;
							}
						}
						if (var13 != var15 || var14 != var16) {
							if (var13 < var15) {
								arg1.field1056 += var20;
								if (arg1.field1056 > var15) {
									arg1.field1056 = var15;
								}
							} else if (var13 > var15) {
								arg1.field1056 -= var20;
								if (arg1.field1056 < var15) {
									arg1.field1056 = var15;
								}
							}
							if (var14 < var16) {
								arg1.field1057 += var20;
								if (arg1.field1057 > var16) {
									arg1.field1057 = var16;
								}
							} else if (var14 > var16) {
								arg1.field1057 -= var20;
								if (arg1.field1057 < var16) {
									arg1.field1057 = var16;
								}
							}
						}
						if (arg1.field1056 == var15 && arg1.field1057 == var16) {
							arg1.field1101--;
							if (arg1.field1041 > 0) {
								arg1.field1041--;
							}
						}
						arg1.method2398(var19);
					} else {
						arg1.field1056 = var15;
						arg1.field1057 = var16;
						arg1.field1101--;
						if (arg1.field1041 > 0) {
							arg1.field1041--;
						}
						arg1.method2398(var11);
					}
				}
			}
		}
		if (arg1.field1056 < 128 || arg1.field1056 >= 13184 || arg1.field1057 < 128 || arg1.field1057 >= 13184) {
			arg1.method2426();
			arg1.field1086 = 0;
			arg1.field1095 = 0;
			arg1.method2419();
			arg1.field1056 = arg1.field1040[0] * 128 + arg1.field1060 * 64;
			arg1.field1057 = arg1.field1108[0] * 128 + arg1.field1060 * 64;
			arg1.method2384();
		}
		if (Statics.field1109 == arg1 && (arg1.field1056 < 1536 || arg1.field1056 >= 11776 || arg1.field1057 < 1536 || arg1.field1057 >= 11776)) {
			arg1.method2426();
			arg1.field1086 = 0;
			arg1.field1095 = 0;
			arg1.method2419();
			arg1.field1056 = arg1.field1040[0] * 128 + arg1.field1060 * 64;
			arg1.field1057 = arg1.field1108[0] * 128 + arg1.field1060 * 64;
			arg1.method2384();
		}
		if (arg1.field1083 != -1) {
			Object var22 = null;
			Object var23 = null;
			int var24 = 65536;
			class80 var30;
			class76 var31;
			if (arg1.field1083 >= var24) {
				int var32 = arg1.field1083 - var24;
				var30 = class510.method7843(var32, field334);
				var31 = (class76) var30.field1170.method7917((long) var32);
			} else {
				int var25 = arg1.field1083;
				class74 var26 = field334;
				Iterator var27 = var26.iterator();
				class80 var29;
				while (true) {
					if (var27.hasNext()) {
						class80 var28 = (class80) var27.next();
						if (var28.field1161.method7917((long) var25) == null) {
							continue;
						}
						var29 = var28;
						break;
					}
					var29 = var26.method2304();
					break;
				}
				var30 = var29;
				var31 = (class76) var29.field1161.method7917((long) arg1.field1083);
			}
			if (var31 != null) {
				class453 var33 = class453.method6269((float) arg1.field1056, 0.0F, (float) arg1.field1057);
				class453 var35;
				if (arg0.field1173 == var30.field1173) {
					var35 = class453.method6269((float) var31.field1056, 0.0F, (float) var31.field1057);
				} else if (arg0.field1173 == -1) {
					class506 var34 = (class506) Statics.field3837.field1172.method7946((long) var30.field1173);
					var35 = var34.method9356(var31.field1056, var31.field1057);
				} else if (var30.field1173 == -1) {
					class506 var36 = (class506) Statics.field3837.field1172.method7946((long) arg0.field1173);
					var35 = var36.method9375(var31.field1056, var31.field1057);
				} else {
					class506 var37 = (class506) Statics.field3837.field1172.method7946((long) var30.field1173);
					class506 var38 = (class506) Statics.field3837.field1172.method7946((long) arg0.field1173);
					class453 var39 = var37.method9356(var31.field1056, var31.field1057);
					var35 = var38.method9375((int) var39.field5176, (int) var39.field5170);
					var39.method8336();
				}
				int var40 = (int) (var33.field5176 - var35.field5176);
				int var41 = (int) (var33.field5170 - var35.field5170);
				if (var40 != 0 || var41 != 0) {
					arg1.field1098 = class452.method7505(var40, var41);
				}
				var33.method8336();
				var35.method8336();
			} else if (arg1.field1049) {
				arg1.field1083 = -1;
				arg1.field1049 = false;
			}
		}
		if (arg1.field1101 == 0 || arg1.field1105 > 0) {
			int var42 = -1;
			if (arg1.field1050 != -1) {
				var42 = arg1.field1050;
			}
			if (var42 != -1) {
				arg1.field1098 = var42;
				if (arg1.field1051) {
					arg1.field1058 = arg1.field1098;
				}
			}
			arg1.method2393();
		}
		int var43 = arg1.field1098 - arg1.field1058 & 0x7FF;
		if (var43 == 0) {
			if (arg1.field1049) {
				arg1.field1083 = -1;
				arg1.field1049 = false;
			}
			arg1.field1099 = 0;
		} else {
			boolean var44 = true;
			boolean var45 = true;
			arg1.field1099++;
			int var46 = var43 > 1024 ? -1 : 1;
			arg1.field1058 += arg1.field1100 * var46;
			boolean var47 = true;
			if (var43 < arg1.field1100 || var43 > 2048 - arg1.field1100) {
				arg1.field1058 = arg1.field1098;
				var47 = false;
			}
			if (arg1.field1100 > 0 && arg1.method2377() == arg1.field1061 && (arg1.field1099 > 25 || var47)) {
				if (var46 == -1 && arg1.field1065 != -1) {
					arg1.method2398(arg1.field1065);
				} else if (var46 == 1 && arg1.field1063 != -1) {
					arg1.method2398(arg1.field1063);
				} else {
					arg1.method2398(arg1.field1064);
				}
			}
			arg1.field1058 &= 0x7FF;
		}
		method8975(arg0, arg1);
	}

	@ObfuscatedName("wv.ie(Lct;B)V")
	public static final void method10186(class76 arg0) {
		int var1 = Math.max(1, arg0.field1086 - field413);
		int var2 = arg0.field1090 * 128 + arg0.field1060 * 64;
		int var3 = arg0.field1092 * 128 + arg0.field1060 * 64;
		arg0.field1056 += (var2 - arg0.field1056) / var1;
		arg0.field1057 += (var3 - arg0.field1057) / var1;
		arg0.field1105 = 0;
		arg0.field1098 = arg0.field1096;
	}

	@ObfuscatedName("sx.iv(Ldr;Lct;B)V")
	public static final void method8975(class80 arg0, class76 arg1) {
		field400.method10043(arg0, arg1.field1056, arg1.field1057, Statics.field1109 == arg1);
		int var2 = class468.method3602(arg1.field1084, 1, field400);
		if ((var2 & 0x2) != 0) {
			arg1.field1084.method8907();
		}
		arg1.field1094.method8908(arg1.field1061);
		if (arg1.field1084.method8909() > 0 && arg1.field1094.method8909() < 30) {
			if (arg1.field1084.method8931() == arg1.field1094.method8931()) {
				arg1.field1094.method8899(arg1.field1084);
			} else {
				int var3 = class468.method3602(arg1.field1094, 1, null);
				if ((var3 & 0x2) != 0) {
					arg1.field1094.method8907();
				}
			}
		}
		class426 var4 = new class426(arg1.method2390());
		for (class511 var5 = (class511) var4.method7923(); var5 != null; var5 = (class511) var4.next()) {
			if (var5.field5446 != -1 && field413 >= var5.field5445) {
				class470 var6 = var5.field5444;
				if (var6.method8901()) {
					int var7 = class468.method3602(var6, 1, field400);
					if ((var7 & 0x1) != 0) {
						var5.method2234();
						arg1.field1093--;
					}
				} else {
					var5.method2234();
					arg1.field1093--;
				}
			}
		}
		if (arg1.field1075.method8901() && arg1.field1103 <= 1) {
			class216 var8 = arg1.field1075.method8916();
			if (var8.field2493 == 1 && arg1.field1041 > 0 && arg1.field1086 <= field413 && arg1.field1095 < field413) {
				arg1.field1103 = 1;
				return;
			}
		}
		if (arg1.field1103 > 0) {
			arg1.field1103--;
		} else {
			int var9 = class468.method3602(arg1.field1075, 1, field400);
			if ((var9 & 0x2) != 0) {
				arg1.field1075.method8947();
			}
		}
		arg1.field1059 = arg1.field1075.method8901() && arg1.field1075.method8916().field2483;
		field400.method10041();
	}

	@ObfuscatedName("pr.ig(B)V")
	public static void method7589() {
		if (Statics.field817 != null) {
			Statics.field817.method9832(Statics.field3837.field1171, (field553 >> 7) + Statics.field3837.field1165, (field338 >> 7) + Statics.field3837.field1166, false);
			Statics.field817.method9849();
		}
	}

	@ObfuscatedName("gv.ih(Lcv;III)V")
	public static void method3768(class70 arg0, int arg1, int arg2) {
		class216 var3 = arg0.field1075.method8916();
		if (arg1 == arg0.field1075.method8931() && arg1 != -1) {
			int var4 = var3.field2490;
			if (var4 == 1) {
				arg0.field1075.method8907();
				arg0.field1103 = arg2;
			}
			if (var4 == 2) {
				arg0.field1075.method8924();
			}
		} else if (arg1 == -1 || !arg0.field1075.method8901() || class216.method3858(arg1).field2481 >= var3.field2481) {
			arg0.field1075.method8908(arg1);
			arg0.field1075.method8907();
			arg0.field1103 = arg2;
			arg0.field1041 = arg0.field1101;
		}
	}

	@ObfuscatedName("by.in(I)I")
	public static int method724() {
		return field432 ? 2 : 1;
	}

	@ObfuscatedName("im.it(IB)V")
	public static void method4230(int arg0) {
		field360 = 0L;
		if (arg0 >= 2) {
			field432 = true;
		} else {
			field432 = false;
		}
		if (method724() == 1) {
			Statics.field5520.method586(765, 503);
		} else {
			Statics.field5520.method586(7680, 2160);
		}
		if (field328 < 25 || field315 == null || field315.field1309 == null) {
			return;
		}
		class330 var1 = class330.method3456(class328.field3569, field315.field1309);
		var1.field3665.method10320(method724());
		var1.field3665.method10321(Statics.field208);
		var1.field3665.method10321(Statics.field4810);
		field315.method2874(var1);
	}

	@ObfuscatedName("rx.ix(Ljava/lang/String;ZI)V")
	public static final void method8746(String arg0, boolean arg1) {
		if (!field343) {
			return;
		}
		byte var2 = 4;
		int var3 = var2 + 6;
		int var4 = var2 + 6;
		int var5 = Statics.field5240.method8787(arg0, 250);
		int var6 = Statics.field5240.method8761(arg0, 250) * 13;
		class602.method10682(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
		class602.method10686(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
		Statics.field5240.method8767(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		method5794(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
		if (arg1) {
			Statics.field182.method479(0, 0);
		} else {
			method98(var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("lh.iz(IIIIZS)V")
	public static final void method6281(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		int var5 = arg3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = field368;
		} else if (var5 >= 100) {
			var6 = field369;
		} else {
			var6 = (field369 - field368) * var5 / 100 + field368;
		}
		int var7 = arg3 * var6 * 512 / (arg2 * 334);
		if (var7 < field420) {
			short var8 = field420;
			var6 = arg2 * var8 * 334 / (arg3 * 512);
			if (var6 > field365) {
				var6 = field365;
				int var9 = arg3 * var6 * 512 / (var8 * 334);
				int var10 = (arg2 - var9) / 2;
				if (arg4) {
					class602.method10709();
					class602.method10682(arg0, arg1, var10, arg3, -16777216);
					class602.method10682(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
				}
				arg0 += var10;
				arg2 -= var10 * 2;
			}
		} else if (var7 > field383) {
			short var11 = field383;
			var6 = arg2 * var11 * 334 / (arg3 * 512);
			if (var6 < field372) {
				var6 = field372;
				int var12 = arg2 * var11 * 334 / (var6 * 512);
				int var13 = (arg3 - var12) / 2;
				if (arg4) {
					class602.method10709();
					class602.method10682(arg0, arg1, arg2, var13, -16777216);
					class602.method10682(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
				}
				arg1 += var13;
				arg3 -= var13 * 2;
			}
		}
		field380 = arg3 * var6 / 334;
		if (field314 != arg2 || field379 != arg3) {
			int[] var14 = new int[9];
			for (int var15 = 0; var15 < var14.length; var15++) {
				int var16 = var15 * 32 + 128 + 15;
				int var17 = var16 * 3 + 600;
				int var19 = class226.field2638[var16];
				int var20 = arg3 - 334;
				if (var20 < 0) {
					var20 = 0;
				} else if (var20 > 100) {
					var20 = 100;
				}
				int var21 = (field371 - field370) * var20 / 100 + field370;
				int var22 = var17 * var21 / 256;
				var14[var15] = var19 * var22 >> 16;
			}
			Statics.field3837.field1160.method4851(var14, 500, 800, arg2 * 334 / arg3, 334);
		}
		field376 = arg0;
		field598 = arg1;
		field314 = arg2;
		field379 = arg3;
	}

	@ObfuscatedName("ts.jw(Ldr;I)V")
	public static void method9449(class80 arg0) {
		if (field585 > 0) {
			int var1 = field584 * 128;
			method726(arg0, var1, Statics.field5749);
		}
	}

	@ObfuscatedName("bg.jj(Ldr;ILjn;B)V")
	public static void method726(class80 arg0, int arg1, class242 arg2) {
		boolean var3 = true;
		float var4 = (float) field379 / 334.0F;
		float var5 = (float) field380 * 4.0F / var4;
		int var6 = Math.max(512, (int) (1400.0F - var5));
		int var7 = field553 - (int) (class537.method4516(arg1) * (double) var6);
		int var8 = field338;
		int var9 = class537.field5572[arg1 & 0x7FF];
		double var10 = (double) var9 / 65536.0D;
		int var12 = var8 - (int) ((double) var6 * var10);
		int var13 = arg0.field1171;
		int var14 = var7 >> 7;
		int var16 = var12 >> 7;
		long var17 = class243.method3407(var13, var14, var16, 5, false, -1, arg0.field1173);
		arg0.field1160.method4811(arg0.field1171, var7, var12, field513, 60, arg2, arg1, var17, false);
	}

	@ObfuscatedName("dt.jk(Ldr;B)V")
	public static void method2711(class80 arg0) {
		int var1 = field336.field1255;
		int[] var2 = field336.field1244;
		for (int var3 = 0; var3 < var1; var3++) {
			if (field520 != var2[var3] && field492 != var2[var3]) {
				method7587(arg0, var2[var3], true);
			}
		}
	}

	@ObfuscatedName("pz.jb(Ldr;IZI)V")
	public static void method7587(class80 arg0, int arg1, boolean arg2) {
		class70 var3 = (class70) arg0.field1170.method7917((long) arg1);
		if (var3 == null || !var3.method2132() || var3.field955) {
			return;
		}
		int var4 = var3.field934;
		var3.field953 = false;
		if ((field566 && field336.field1255 > 50 || field336.field1255 > 200) && arg2 && var3.method2377() == var3.field1061) {
			var3.field953 = true;
		}
		int var5 = var3.field1056 >> 7;
		int var6 = var3.field1057 >> 7;
		if (var5 < 0 || var5 >= 104 || var6 < 0 || var6 >= 104) {
			return;
		}
		long var7 = class243.method3407(0, 0, 0, 0, false, var3.field1104, arg0.field1173);
		if (var3.field948 != null && field413 >= var3.field943 && field413 < var3.field944) {
			var3.field953 = false;
			var3.field942 = method5428(arg0, var3.field1056, var3.field1057, var4, var3.method2148());
			var3.field942 -= var3.method2378();
			var3.field1088 = field413;
			arg0.field1160.method4812(var4, var3.field1056, var3.field1057, var3.field942, 60, var3, var3.field1058, var7, var3.field949, var3.field950, var3.field954, var3.field947);
			return;
		}
		if ((var3.field1056 & 0x7F) == 64 && (var3.field1057 & 0x7F) == 64) {
			if (field503 == arg0.field1167[var5][var6]) {
				return;
			}
			arg0.field1167[var5][var6] = field503;
		}
		var3.field942 = method5428(arg0, var3.field1056, var3.field1057, var4, var3.method2148());
		var3.field942 -= var3.method2378();
		var3.field1088 = field413;
		arg0.field1160.method4811(var4, var3.field1056, var3.field1057, var3.field942, 60, var3, var3.field1058, var7, var3.field1059);
	}

	@ObfuscatedName("qy.ji(Ldr;Lhw;I)V")
	public static final void method8010(class80 arg0, class198 arg1) {
		for (int var2 = 0; var2 < arg0.field1162.method9107(); var2++) {
			class82 var3 = (class82) arg0.field1161.method7917((long) arg0.field1162.method9104(var2));
			if (var3 != null && var3.method2132() && var3.field1185.field2155 == arg1 && var3.field1185.method4032()) {
				int var4 = arg0.field1171;
				int var5 = var3.field1056 >> 7;
				int var6 = var3.field1057 >> 7;
				if (var5 >= 0 && var5 < arg0.field1163 && var6 >= 0 && var6 < arg0.field1164) {
					if (var3.field1060 == 1 && (var3.field1056 & 0x7F) == 64 && (var3.field1057 & 0x7F) == 64) {
						if (field503 == arg0.field1167[var5][var6]) {
							continue;
						}
						arg0.field1167[var5][var6] = field503;
					}
					long var7 = class243.method3407(0, 0, 0, 1, !var3.field1185.field2145, var3.field1104, arg0.field1173);
					var3.field1088 = field413;
					int var9 = method5428(arg0, var3.field1056, var3.field1057, var4, var3.method2148());
					int var10 = var9 - var3.method2378();
					int var11 = var3.field1060 * 64 - 64 + 60;
					arg0.field1160.method4811(var4, var3.field1056, var3.field1057, var10, var11, var3, var3.field1058, var7, var3.field1059);
				}
			}
		}
	}

	@ObfuscatedName("hm.jp(Ldr;Ltj;ZI)V")
	public static void method4017(class80 arg0, class506 arg1, boolean arg2) {
		boolean var3 = arg1.field5426.field2246 && !arg2;
		long var4 = 0L;
		boolean var6 = field347 == arg1.field5430.field1173;
		class399 var7 = arg1.method9345(var6);
		if (class399.field4842 == var7) {
			var4 = class243.method3407(0, 0, 0, 5, false, 0, 0);
		} else if (var3 && class399.field4840 != var7) {
			boolean var8 = class399.field4841 == var7;
			int var9 = arg1.method2177();
			int var10 = arg1.method2394();
			int var11 = var10 >> 7;
			int var13 = arg1.method2395();
			int var14 = var13 >> 7;
			var4 = class243.method3407(var9, var11, var14, 4, !var8, arg1.field5422, arg0.field1173);
		}
		arg1.field5423.method5849(method7784(arg0, arg1.method2394(), arg1.method2395(), arg0.field1171));
		arg1.field5430.field1160.field2710 = field413;
		arg1.method9338(arg2);
		boolean var15 = arg0.field1160.method4811(arg0.field1171, arg1.method2394(), arg1.method2395(), arg1.method9341(), 60, arg1.field5430.field1160, arg1.method9377(), var4, false);
		if (!var15 || arg2) {
			return;
		}
		class80 var16 = arg1.field5430;
		if (field392) {
			method7587(var16, field492, false);
		}
		class80 var17 = arg1.field5430;
		if (field520 >= 0 && var17.field1170.method7917((long) field520) != null) {
			method7587(var17, field520, false);
		}
		method8010(arg1.field5430, class198.field2164);
		method2711(arg1.field5430);
		method8010(arg1.field5430, class198.field2163);
		method8010(arg1.field5430, class198.field2165);
		class80 var18 = arg1.field5430;
		for (class49 var19 = (class49) var18.field1175.method8034(); var19 != null; var19 = (class49) var18.field1175.method8036()) {
			if (var18.field1171 != var19.field691 || var19.method1845()) {
				var19.method2234();
			} else if (field413 >= var19.field690) {
				var19.method1846(field390);
				if (var19.method1845()) {
					var19.method2234();
				} else {
					var18.field1160.method4811(var19.field691, var19.field692, var19.field693, var19.field697, 60, var19, 0, -1L, false);
				}
			}
		}
	}

	@ObfuscatedName("il.jc(Ldr;Lpd;I)V")
	public static void method4263(class80 arg0, class395 arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.field1177.method9107(); var3++) {
			class506 var4 = (class506) arg0.field1172.method7946((long) arg0.field1177.method9104(var3));
			if (var4 != null && field347 != var4.field5430.field1173 && var4.method9344() == arg1) {
				boolean var5 = var2 < field385;
				if (var5) {
					var2++;
					boolean var6 = false;
					if (class395.field4802 == arg1) {
						class450 var7 = class589.method10060(var4.field5423, var4.field5426.method4154());
						boolean var10;
						label103: {
							for (int var8 = 0; var8 < field336.field1255; var8++) {
								class70 var9 = (class70) arg0.field1170.method7917((long) field336.field1244[var8]);
								if (var9 != null && var7.method8320(var9.field1056, var9.field1057)) {
									var7.method8285();
									var10 = true;
									break label103;
								}
							}
							int var11 = 0;
							label86: while (true) {
								if (var11 >= arg0.field1162.method9107()) {
									for (int var14 = 0; var14 < arg0.field1177.method9107(); var14++) {
										class506 var15 = (class506) arg0.field1172.method7946((long) arg0.field1177.method9104(var14));
										if (var15 != null && var4 != var15 && field413 == var15.field5430.field1160.field2710) {
											class450 var16 = class589.method10060(var15.field5423, var15.field5426.method4154());
											if (var7.method8288(var16)) {
												var7.method8285();
												var16.method8285();
												var10 = true;
												break label86;
											}
											var16.method8285();
										}
									}
									var7.method8285();
									var10 = false;
									break;
								}
								class82 var12 = (class82) arg0.field1161.method7917((long) arg0.field1162.method9104(var11));
								if (var12 != null && var7.method8320(var12.field1056, var12.field1057)) {
									for (int var13 = 0; var13 < var12.field1185.field2143.length; var13++) {
										if (var12.field1185.field2143[var13] != null) {
											var7.method8285();
											var10 = true;
											break label86;
										}
									}
								}
								var11++;
							}
						}
						var6 = var10;
					}
					method4017(arg0, var4, var6);
				}
			}
		}
	}

	@ObfuscatedName("cr.jn(I)V")
	public static final void method2087() {
		for (class54 var0 = (class54) field335.method8034(); var0 != null; var0 = (class54) field335.method8036()) {
			if (field413 > var0.field778) {
				var0.method2234();
			} else if (field413 >= var0.field790) {
				var0.method1932(field334, field413, field390);
				Statics.field3837.field1160.method4811(var0.field779, (int) var0.field774, (int) var0.field782, (int) var0.field783, 60, var0, var0.field777, -1L, false);
			}
		}
	}

	@ObfuscatedName("ah.jl(I)I")
	public static final int method301() {
		if (Statics.field240.method2623()) {
			return Statics.field3837.field1171;
		}
		int var0 = 3;
		int var1 = field553 >> 7;
		int var2 = field338 >> 7;
		if (Statics.field4856 < 310) {
			int var3;
			int var4;
			if (field337 == 1) {
				var3 = Statics.field1931 >> 7;
				var4 = Statics.field1585 >> 7;
			} else {
				var3 = var1;
				var4 = var2;
			}
			int var5 = Statics.field2053 >> 7;
			int var6 = Statics.field47 >> 7;
			if (var5 < 0 || var5 >= 104 || var6 < 0 || var6 >= 104) {
				return Statics.field3837.field1171;
			}
			if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
				return Statics.field3837.field1171;
			}
			if ((Statics.field3837.field1169[Statics.field3837.field1171][var5][var6] & 0x4) != 0) {
				var0 = Statics.field3837.field1171;
			}
			int var7;
			if (var3 > var5) {
				var7 = var3 - var5;
			} else {
				var7 = var5 - var3;
			}
			int var8;
			if (var4 > var6) {
				var8 = var4 - var6;
			} else {
				var8 = var6 - var4;
			}
			if (var7 > var8) {
				int var9 = var8 * 65536 / var7;
				int var10 = 32768;
				while (var3 != var5) {
					if (var5 < var3) {
						var5++;
					} else if (var5 > var3) {
						var5--;
					}
					if ((Statics.field3837.field1169[Statics.field3837.field1171][var5][var6] & 0x4) != 0) {
						var0 = Statics.field3837.field1171;
					}
					var10 += var9;
					if (var10 >= 65536) {
						var10 -= 65536;
						if (var6 < var4) {
							var6++;
						} else if (var6 > var4) {
							var6--;
						}
						if ((Statics.field3837.field1169[Statics.field3837.field1171][var5][var6] & 0x4) != 0) {
							var0 = Statics.field3837.field1171;
						}
					}
				}
			} else if (var8 > 0) {
				int var11 = var7 * 65536 / var8;
				int var12 = 32768;
				while (var4 != var6) {
					if (var6 < var4) {
						var6++;
					} else if (var6 > var4) {
						var6--;
					}
					if ((Statics.field3837.field1169[Statics.field3837.field1171][var5][var6] & 0x4) != 0) {
						var0 = Statics.field3837.field1171;
					}
					var12 += var11;
					if (var12 >= 65536) {
						var12 -= 65536;
						if (var5 < var3) {
							var5++;
						} else if (var5 > var3) {
							var5--;
						}
						if ((Statics.field3837.field1169[Statics.field3837.field1171][var5][var6] & 0x4) != 0) {
							var0 = Statics.field3837.field1171;
						}
					}
				}
			}
		}
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if ((Statics.field3837.field1169[Statics.field3837.field1171][var1][var2] & 0x4) != 0) {
				var0 = Statics.field3837.field1171;
			}
			return var0;
		} else {
			return Statics.field3837.field1171;
		}
	}

	@ObfuscatedName("gr.je(I)Lqs;")
	public static class437 method3688() {
		return field435;
	}

	@ObfuscatedName("fh.jt(Lkg;S)V")
	public static void method3636(class274 arg0) {
		if (arg0 == null || arg0.field3197 == null) {
			return;
		}
		if (arg0.field3197.field4146 >= 0) {
			class370 var1 = Statics.field1555.method6863(arg0.field3197.field4165);
			if (var1 == null || var1.field4287 == null || var1.field4287.length == 0 || arg0.field3197.field4146 >= var1.field4287.length || var1.field4287[arg0.field3197.field4146] != arg0.field3197) {
				return;
			}
		}
		if (arg0.field3197.field4148 == 11 && arg0.field3201 == 0) {
			if (arg0.field3197.method7346(arg0.field3198, arg0.field3200, 0, 0)) {
				arg0.field3197.method7354().method5432().method5565(1, arg0.field3197.method7354().method5441());
				switch(arg0.field3197.method7350()) {
					case 0:
						class32.method325(arg0.field3197.method7352(), true, false);
						break;
					case 1:
						if (class371.method6479(method7519(arg0.field3197))) {
							int[] var2 = arg0.field3197.method7353();
							if (var2 != null) {
								class330 var3 = class330.method3456(class328.field3621, field315.field1309);
								var3.field3665.method10377(var2[0]);
								var3.field3665.method10392(var2[2]);
								var3.field3665.method10393(var2[1]);
								var3.field3665.method10381(arg0.field3197.field4146);
								var3.field3665.method10547(arg0.field3197.field4145);
								var3.field3665.method10392(arg0.field3197.method7351());
								field315.method2874(var3);
							}
						}
				}
			}
		} else if (arg0.field3197.field4148 == 12) {
			class367 var4 = arg0.field3197.method7358();
			if (var4 != null && var4.method7041()) {
				switch(arg0.field3201) {
					case 0:
						field599.method5678(arg0.field3197);
						var4.method6992(true);
						var4.method7028(arg0.field3198, arg0.field3200, field552.method5701(82), field552.method5701(81));
						break;
					case 1:
						var4.method7029(arg0.field3198, arg0.field3200);
				}
			}
		}
	}

	@ObfuscatedName("qr.ja(I)Z")
	public static boolean method7882() {
		return (field351 & 0x8) != 0;
	}

	@ObfuscatedName("ai.jd(Ldr;Lct;IIIIII)V")
	public static final void method84(class80 arg0, class76 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 == null || !arg1.method2132()) {
			return;
		}
		if (arg1 instanceof class82) {
			class196 var7 = ((class82) arg1).field1185;
			if (var7.field2100 != null) {
				var7 = var7.method4066();
			}
			if (var7 == null) {
				return;
			}
		}
		int var8 = field336.field1255;
		int[] var9 = field336.field1244;
		boolean var10 = arg2 < var8;
		int var11 = -2;
		if (arg1.field1076 != null && (!var10 || !arg1.field1078 && (field445 == 4 || !arg1.field1102 && (field445 == 0 || field445 == 3 || field445 == 1 && ((class70) arg1).method2133())))) {
			method6740(arg0, arg1, arg1.method2397() + arg1.method2378());
			if (field504 > -1 && field410 < field493) {
				field497[field410] = Statics.field3832.method8758(arg1.field1076) / 2;
				field496[field410] = Statics.field3832.field5252;
				field494[field410] = field504;
				field495[field410] = field505 - var11;
				field498[field410] = arg1.field1080;
				field499[field410] = arg1.field1081;
				field501[field410] = arg1.field1079;
				field587[field410] = arg1.field1082;
				field394[field410] = arg1.field1076;
				field410++;
				var11 += 12;
			}
		}
		if (!arg1.field1048.method8087()) {
			method6740(arg0, arg1, arg1.method2397() + 15 + arg1.method2378());
			for (class81 var12 = (class81) arg1.field1048.method8092(); var12 != null; var12 = (class81) arg1.field1048.method8106()) {
				class77 var13 = var12.method2656(field413);
				if (var13 != null) {
					class188 var14 = var12.field1182;
					class606 var15 = var14.method3958();
					class606 var16 = var14.method3957();
					int var17 = 0;
					int var18;
					if (var15 == null || var16 == null) {
						var18 = var14.field2051;
					} else {
						if (var14.field2052 * 2 < var16.field6020) {
							var17 = var14.field2052;
						}
						var18 = var16.field6020 - var17 * 2;
					}
					int var19 = 255;
					boolean var20 = true;
					int var21 = field413 - var13.field1110;
					int var22 = var13.field1116 * var18 / var14.field2051;
					int var25;
					if (var13.field1111 > var21) {
						int var23 = var14.field2047 == 0 ? 0 : var21 / var14.field2047 * var14.field2047;
						int var24 = var13.field1112 * var18 / var14.field2051;
						var25 = (var22 - var24) * var23 / var13.field1111 + var24;
					} else {
						var25 = var22;
						int var26 = var13.field1111 + var14.field2050 - var21;
						if (var14.field2046 >= 0) {
							var19 = (var26 << 8) / (var14.field2050 - var14.field2046);
						}
					}
					if (var13.field1116 > 0 && var25 < 1) {
						var25 = 1;
					}
					if (var15 == null || var16 == null) {
						var11 += 5;
						if (field504 > -1) {
							int var32 = field504 + arg3 - (var18 >> 1);
							int var33 = field505 + arg4 - var11;
							class602.method10682(var32, var33, var25, 5, 65280);
							class602.method10682(var25 + var32, var33, var18 - var25, 5, 16711680);
						}
						var11 += 2;
					} else {
						int var27;
						if (var18 == var25) {
							var27 = var17 * 2 + var25;
						} else {
							var27 = var17 + var25;
						}
						int var28 = var15.field6021;
						var11 += var28;
						int var29 = field504 + arg3 - (var18 >> 1);
						int var30 = field505 + arg4 - var11;
						int var31 = var29 - var17;
						if (var19 >= 0 && var19 < 255) {
							var15.method10821(var31, var30, var19);
							class602.method10675(var31, var30, var27 + var31, var28 + var30);
							var16.method10821(var31, var30, var19);
						} else {
							var15.method10818(var31, var30);
							class602.method10675(var31, var30, var27 + var31, var28 + var30);
							var16.method10818(var31, var30);
						}
						class602.method10674(arg3, arg4, arg3 + arg5, arg4 + arg6);
						var11 += 2;
					}
				} else if (var12.method2657()) {
					var12.method2234();
				}
			}
		}
		if (var11 == -2) {
			var11 += 7;
		}
		if (var10 && field413 == arg1.field1088) {
			class70 var34 = (class70) arg1;
			boolean var35;
			if (field351 == 0) {
				var35 = false;
			} else if (Statics.field1109 == var34) {
				var35 = method7882();
			} else {
				boolean var36 = (field351 & 0x4) != 0;
				boolean var37 = var36;
				if (!var36) {
					boolean var38 = (field351 & 0x1) != 0;
					var37 = var38 && var34.method2133();
				}
				boolean var39 = var37;
				if (!var37) {
					boolean var40 = (field351 & 0x2) != 0;
					var39 = var40 && var34.method2136();
				}
				var35 = var39;
			}
			if (var35) {
				class70 var41 = (class70) arg1;
				if (var10) {
					method6740(arg0, arg1, arg1.method2397() + 15 + arg1.method2378());
					class466 var42 = (class466) field388.get(class557.field5743);
					var11 += 4;
					var42.method8842(var41.field935.method11022(), field504 + arg3, field505 + arg4 - var11, 16777215, 0);
					var11 += 18;
				}
			}
		}
		if (var10) {
			class70 var43 = (class70) arg1;
			if (var43.field955) {
				return;
			}
			if (var43.field952 != -1 || var43.field938 != -1) {
				method6740(arg0, arg1, arg1.field1071 + 15 + arg1.method2378());
				if (field504 > -1) {
					if (var43.field952 != -1) {
						var11 += 25;
						Statics.field2439[var43.field952].method10818(field504 + arg3 - 12, field505 + arg4 - var11);
					}
					if (var43.field938 != -1) {
						var11 += 25;
						Statics.field1138[var43.field938].method10818(field504 + arg3 - 12, field505 + arg4 - var11);
					}
				}
			}
			if (arg2 >= 0 && field456 == 10 && field458 == var9[arg2]) {
				method6740(arg0, arg1, arg1.field1071 + 15 + arg1.method2378());
				if (field504 > -1) {
					int var44 = Statics.field4849[1].field6021 + var11;
					Statics.field4849[1].method10818(field504 + arg3 - 12, field505 + arg4 - var44);
				}
			}
		} else {
			class82 var45 = (class82) arg1;
			int[] var46 = var45.method2675();
			short[] var47 = var45.method2692();
			if (var47 != null && var46 != null) {
				for (int var48 = 0; var48 < var47.length; var48++) {
					if (var47[var48] >= 0 && var46[var48] >= 0) {
						long var49 = (long) var46[var48] << 8 | (long) var47[var48];
						class606 var51 = (class606) field604.method9136(var49);
						if (var51 == null) {
							class606[] var52 = class607.method8744(Statics.field5388, var46[var48], 0);
							if (var52 != null && var47[var48] < var52.length) {
								var51 = var52[var47[var48]];
								field604.method9151(var49, var51);
							}
						}
						if (var51 != null) {
							method6740(arg0, arg1, arg1.method2397() + 15 + arg1.method2378());
							if (field504 > -1) {
								var51.method10818(field504 + arg3 - (var51.field6020 >> 1), field505 + ((arg4 - var51.field6021 - 2) * (var48 + 1) - var51.field6021) - 4);
							}
						}
					}
				}
			}
			if (field456 == 1 && field457 == arg0.field1162.method9104(arg2 - var8) && field413 % 20 < 10) {
				method6740(arg0, arg1, arg1.method2397() + 15 + arg1.method2378());
				if (field504 > -1) {
					Statics.field4849[0].method10818(field504 + arg3 - 12, field505 + arg4 - 28);
				}
			}
		}
		for (int var53 = 0; var53 < 4; var53++) {
			int var54 = arg1.field1045[var53];
			int var55 = arg1.field1043[var53];
			class211 var56 = null;
			int var57 = 0;
			if (var55 >= 0) {
				if (var54 <= field413) {
					continue;
				}
				var56 = class211.method6536(arg1.field1043[var53]);
				var57 = var56.field2290;
				if (var56 != null && var56.field2301 != null) {
					var56 = var56.method4283();
					if (var56 == null) {
						arg1.field1045[var53] = -1;
						continue;
					}
				}
			} else if (var54 < 0) {
				continue;
			}
			int var58 = arg1.field1046[var53];
			class211 var59 = null;
			if (var58 >= 0) {
				var59 = class211.method6536(var58);
				if (var59 != null && var59.field2301 != null) {
					var59 = var59.method4283();
				}
			}
			if (var54 - var57 <= field413) {
				if (var56 == null) {
					arg1.field1045[var53] = -1;
				} else {
					method6740(arg0, arg1, arg1.method2397() / 2 + arg1.method2378());
					if (field504 > -1) {
						boolean var60 = true;
						if (var53 == 1) {
							field505 -= 20;
						}
						if (var53 == 2) {
							field504 -= 15;
							field505 -= 10;
						}
						if (var53 == 3) {
							field504 += 15;
							field505 -= 10;
						}
						Object var61 = null;
						Object var62 = null;
						Object var63 = null;
						Object var64 = null;
						int var65 = 0;
						int var66 = 0;
						int var67 = 0;
						int var68 = 0;
						int var69 = 0;
						int var70 = 0;
						int var71 = 0;
						int var72 = 0;
						class606 var73 = null;
						class606 var74 = null;
						class606 var75 = null;
						class606 var76 = null;
						int var77 = 0;
						int var78 = 0;
						int var79 = 0;
						int var80 = 0;
						int var81 = 0;
						int var82 = 0;
						int var83 = 0;
						int var84 = 0;
						int var85 = 0;
						class606 var86 = var56.method4272();
						if (var86 != null) {
							var65 = var86.field6020;
							int var87 = var86.field6021;
							if (var87 > var85) {
								var85 = var87;
							}
							var69 = var86.field6022;
						}
						class606 var88 = var56.method4273();
						if (var88 != null) {
							var66 = var88.field6020;
							int var89 = var88.field6021;
							if (var89 > var85) {
								var85 = var89;
							}
							var70 = var88.field6022;
						}
						class606 var90 = var56.method4274();
						if (var90 != null) {
							var67 = var90.field6020;
							int var91 = var90.field6021;
							if (var91 > var85) {
								var85 = var91;
							}
							var71 = var90.field6022;
						}
						class606 var92 = var56.method4275();
						if (var92 != null) {
							var68 = var92.field6020;
							int var93 = var92.field6021;
							if (var93 > var85) {
								var85 = var93;
							}
							var72 = var92.field6022;
						}
						if (var59 != null) {
							var73 = var59.method4272();
							if (var73 != null) {
								var77 = var73.field6020;
								int var94 = var73.field6021;
								if (var94 > var85) {
									var85 = var94;
								}
								var81 = var73.field6022;
							}
							var74 = var59.method4273();
							if (var74 != null) {
								var78 = var74.field6020;
								int var95 = var74.field6021;
								if (var95 > var85) {
									var85 = var95;
								}
								var82 = var74.field6022;
							}
							var75 = var59.method4274();
							if (var75 != null) {
								var79 = var75.field6020;
								int var96 = var75.field6021;
								if (var96 > var85) {
									var85 = var96;
								}
								var83 = var75.field6022;
							}
							var76 = var59.method4275();
							if (var76 != null) {
								var80 = var76.field6020;
								int var97 = var76.field6021;
								if (var97 > var85) {
									var85 = var97;
								}
								var84 = var76.field6022;
							}
						}
						class462 var98 = var56.method4276();
						if (var98 == null) {
							var98 = Statics.field3948;
						}
						class462 var99;
						if (var59 == null) {
							var99 = Statics.field3948;
						} else {
							var99 = var59.method4276();
							if (var99 == null) {
								var99 = Statics.field3948;
							}
						}
						Object var100 = null;
						String var101 = null;
						boolean var102 = false;
						int var103 = 0;
						String var104 = var56.method4267(arg1.field1044[var53]);
						int var105 = var98.method8758(var104);
						if (var59 != null) {
							var101 = var59.method4267(arg1.field1047[var53]);
							var103 = var99.method8758(var101);
						}
						int var106 = 0;
						int var107 = 0;
						if (var66 > 0) {
							if (var90 == null && var92 == null) {
								var106 = 1;
							} else {
								var106 = var105 / var66 + 1;
							}
						}
						if (var59 != null && var78 > 0) {
							if (var75 == null && var76 == null) {
								var107 = 1;
							} else {
								var107 = var103 / var78 + 1;
							}
						}
						int var108 = 0;
						int var109 = var108;
						if (var65 > 0) {
							var108 += var65;
						}
						var108 += 2;
						int var110 = var108;
						if (var67 > 0) {
							var108 += var67;
						}
						int var111 = var108;
						int var112 = var108;
						int var114;
						if (var66 > 0) {
							int var113 = var66 * var106;
							var114 = var108 + var113;
							var112 = (var113 - var105) / 2 + var108;
						} else {
							var114 = var105 + var108;
						}
						int var115 = var114;
						if (var68 > 0) {
							var114 += var68;
						}
						int var116 = 0;
						int var117 = 0;
						int var118 = 0;
						int var119 = 0;
						int var120 = 0;
						if (var59 != null) {
							var114 += 2;
							var116 = var114;
							if (var77 > 0) {
								var114 += var77;
							}
							var114 += 2;
							var117 = var114;
							if (var79 > 0) {
								var114 += var79;
							}
							var118 = var114;
							var120 = var114;
							if (var78 > 0) {
								int var121 = var78 * var107;
								var114 += var121;
								var120 += (var121 - var103) / 2;
							} else {
								var114 += var103;
							}
							var119 = var114;
							if (var80 > 0) {
								var114 += var80;
							}
						}
						int var122 = arg1.field1045[var53] - field413;
						int var123 = var56.field2295 - var56.field2295 * var122 / var56.field2290;
						int var124 = var56.field2296 * var122 / var56.field2290 + -var56.field2296;
						int var125 = field504 + arg3 - (var114 >> 1) + var123;
						int var126 = field505 + arg4 - 12 + var124;
						int var127 = var126;
						int var128 = var85 + var126;
						int var129 = var56.field2298 + var126 + 15;
						int var130 = var129 - var98.field5258;
						int var131 = var98.field5261 + var129;
						if (var130 < var126) {
							var127 = var130;
						}
						if (var131 > var128) {
							var128 = var131;
						}
						int var132 = 0;
						if (var59 != null) {
							var132 = var59.field2298 + var126 + 15;
							int var133 = var132 - var99.field5258;
							int var134 = var99.field5261 + var132;
							if (var133 < var127) {
								;
							}
							if (var134 > var128) {
								;
							}
						}
						int var137 = 255;
						if (var56.field2293 >= 0) {
							var137 = (var122 << 8) / (var56.field2290 - var56.field2293);
						}
						if (var137 >= 0 && var137 < 255) {
							if (var86 != null) {
								var86.method10821(var109 + var125 - var69, var126, var137);
							}
							if (var90 != null) {
								var90.method10821(var110 + var125 - var71, var126, var137);
							}
							if (var88 != null) {
								for (int var138 = 0; var138 < var106; var138++) {
									var88.method10821(var66 * var138 + (var111 + var125 - var70), var126, var137);
								}
							}
							if (var92 != null) {
								var92.method10821(var115 + var125 - var72, var126, var137);
							}
							var98.method8764(var104, var112 + var125, var129, var56.field2289, 0, var137);
							if (var59 != null) {
								if (var73 != null) {
									var73.method10821(var116 + var125 - var81, var126, var137);
								}
								if (var75 != null) {
									var75.method10821(var117 + var125 - var83, var126, var137);
								}
								if (var74 != null) {
									for (int var139 = 0; var139 < var107; var139++) {
										var74.method10821(var78 * var139 + (var118 + var125 - var82), var126, var137);
									}
								}
								if (var76 != null) {
									var76.method10821(var119 + var125 - var84, var126, var137);
								}
								var99.method8764(var101, var120 + var125, var132, var59.field2289, 0, var137);
							}
						} else {
							if (var86 != null) {
								var86.method10818(var109 + var125 - var69, var126);
							}
							if (var90 != null) {
								var90.method10818(var110 + var125 - var71, var126);
							}
							if (var88 != null) {
								for (int var140 = 0; var140 < var106; var140++) {
									var88.method10818(var66 * var140 + (var111 + var125 - var70), var126);
								}
							}
							if (var92 != null) {
								var92.method10818(var115 + var125 - var72, var126);
							}
							var98.method8763(var104, var112 + var125, var129, var56.field2289 | 0xFF000000, 0);
							if (var59 != null) {
								if (var73 != null) {
									var73.method10818(var116 + var125 - var81, var126);
								}
								if (var75 != null) {
									var75.method10818(var117 + var125 - var83, var126);
								}
								if (var74 != null) {
									for (int var141 = 0; var141 < var107; var141++) {
										var74.method10818(var78 * var141 + (var118 + var125 - var82), var126);
									}
								}
								if (var76 != null) {
									var76.method10818(var119 + var125 - var84, var126);
								}
								var99.method8763(var101, var120 + var125, var132, var59.field2289 | 0xFF000000, 0);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lj.jy(Ldr;IIIIB)V")
	public static final void method6326(class80 arg0, int arg1, int arg2, int arg3, int arg4) {
		field410 = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = field336.field1255;
		int[] var9 = field336.field1244;
		for (int var10 = 0; var10 < var8 + arg0.field1162.method9107(); var10++) {
			class76 var11;
			if (var10 < var8) {
				var11 = (class76) arg0.field1170.method7917((long) var9[var10]);
				if (field520 == var9[var10]) {
					var5 = true;
					var6 = var10;
					continue;
				}
				if (Statics.field1109 == var11) {
					var7 = var10;
					continue;
				}
			} else {
				var11 = (class76) arg0.field1161.method7917((long) arg0.field1162.method9104(var10 - var8));
			}
			method84(arg0, var11, var10, arg1, arg2, arg3, arg4);
		}
		if (field392 && var7 != -1) {
			method84(arg0, Statics.field1109, var7, arg1, arg2, arg3, arg4);
		}
		if (var5) {
			method84(arg0, (class76) arg0.field1170.method7917((long) field520), var6, arg1, arg2, arg3, arg4);
		}
		for (int var12 = 0; var12 < field410; var12++) {
			int var13 = field494[var12];
			int var14 = field495[var12];
			int var15 = field497[var12];
			int var16 = field496[var12];
			boolean var17 = true;
			while (var17) {
				var17 = false;
				for (int var18 = 0; var18 < var12; var18++) {
					if (var14 + 2 > field495[var18] - field496[var18] && var14 - var16 < field495[var18] + 2 && var13 - var15 < field497[var18] + field494[var18] && var13 + var15 > field494[var18] - field497[var18] && field495[var18] - field496[var18] < var14) {
						var14 = field495[var18] - field496[var18];
						var17 = true;
					}
				}
			}
			field504 = field494[var12];
			field505 = field495[var12] = var14;
			String var19 = field394[var12];
			if (field535 == 0) {
				int var20 = 16776960;
				if (field498[var12] < 6) {
					var20 = field426[field498[var12]];
				}
				if (field498[var12] == 6) {
					var20 = field413 % 20 < 10 ? 16711680 : 16776960;
				}
				if (field498[var12] == 7) {
					var20 = field413 % 20 < 10 ? 255 : 65535;
				}
				if (field498[var12] == 8) {
					var20 = field413 % 20 < 10 ? 45056 : 8454016;
				}
				if (field498[var12] == 9) {
					int var21 = 150 - field501[var12];
					if (var21 < 50) {
						var20 = var21 * 1280 + 16711680;
					} else if (var21 < 100) {
						var20 = 16776960 - (var21 - 50) * 327680;
					} else if (var21 < 150) {
						var20 = (var21 - 100) * 5 + 65280;
					}
				}
				if (field498[var12] == 10) {
					int var22 = 150 - field501[var12];
					if (var22 < 50) {
						var20 = var22 * 5 + 16711680;
					} else if (var22 < 100) {
						var20 = 16711935 - (var22 - 50) * 327680;
					} else if (var22 < 150) {
						var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
					}
				}
				if (field498[var12] == 11) {
					int var23 = 150 - field501[var12];
					if (var23 < 50) {
						var20 = 16777215 - var23 * 327685;
					} else if (var23 < 100) {
						var20 = (var23 - 50) * 327685 + 65280;
					} else if (var23 < 150) {
						var20 = 16777215 - (var23 - 100) * 327680;
					}
				}
				if (field498[var12] == 12 && field587[var12] == null) {
					int var24 = var19.length();
					field587[var12] = new int[var24];
					for (int var25 = 0; var25 < var24; var25++) {
						int var26 = (int) ((float) var25 / (float) var24 * 64.0F);
						int var27 = var26 << 10 | 0x380 | 0x40;
						field587[var12][var25] = class538.field5584[var27];
					}
				}
				if (field499[var12] == 0) {
					Statics.field3832.method8773(var19, field504 + arg1, field505 + arg2, var20, 0, field587[var12]);
				}
				if (field499[var12] == 1) {
					Statics.field3832.method8770(var19, field504 + arg1, field505 + arg2, var20, 0, field413, field587[var12]);
				}
				if (field499[var12] == 2) {
					Statics.field3832.method8771(var19, field504 + arg1, field505 + arg2, var20, 0, field413, field587[var12]);
				}
				if (field499[var12] == 3) {
					Statics.field3832.method8801(var19, field504 + arg1, field505 + arg2, var20, 0, field413, 150 - field501[var12], field587[var12]);
				}
				if (field499[var12] == 4) {
					int var28 = (150 - field501[var12]) * (Statics.field3832.method8758(var19) + 100) / 150;
					class602.method10675(field504 + arg1 - 50, arg2, field504 + arg1 + 50, arg2 + arg4);
					Statics.field3832.method8774(var19, field504 + arg1 + 50 - var28, field505 + arg2, var20, 0, field587[var12]);
					class602.method10674(arg1, arg2, arg1 + arg3, arg2 + arg4);
				}
				if (field499[var12] == 5) {
					int var29 = 150 - field501[var12];
					int var30 = 0;
					if (var29 < 25) {
						var30 = var29 - 25;
					} else if (var29 > 125) {
						var30 = var29 - 125;
					}
					class602.method10675(arg1, field505 + arg2 - Statics.field3832.field5252 - 1, arg1 + arg3, field505 + arg2 + 5);
					Statics.field3832.method8773(var19, field504 + arg1, field505 + arg2 + var30, var20, 0, field587[var12]);
					class602.method10674(arg1, arg2, arg1 + arg3, arg2 + arg4);
				}
			} else {
				Statics.field3832.method8842(var19, field504 + arg1, field505 + arg2, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("ni.jq(B)V")
	public static final void method6780() {
		field342 = 0;
		int var0 = (Statics.field1109.field1056 >> 7) + Statics.field3837.field1165;
		int var1 = (Statics.field1109.field1057 >> 7) + Statics.field3837.field1166;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			field342 = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			field342 = 1;
		}
		if (field342 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			field342 = 0;
		}
	}

	@ObfuscatedName("cj.jf(IIIIB)V")
	public static final void method2053(int arg0, int arg1, int arg2, int arg3) {
		method6780();
	}

	@ObfuscatedName("nb.js(Ldr;Lct;II)V")
	public static void method6740(class80 arg0, class76 arg1, int arg2) {
		class357 var3 = arg1.method2396(arg0);
		int var4 = arg1.field1056;
		int var5 = arg1.field1060 - 1;
		int var6 = (var5 << 6) + var4;
		int var8 = class357.method6808(arg1.field1057, arg1.field1060 - 1);
		Statics.method769(arg0, var3.field4027, var3.field4026, var6, var8, arg2, arg1.method2148());
	}

	@ObfuscatedName("pk.jm(Ldr;IIII)I")
	public static final int method7784(class80 arg0, int arg1, int arg2, int arg3) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 < 0 || var5 < 0 || var4 >= arg0.field1169[0].length || var5 >= arg0.field1169[0][0].length) {
			return 0;
		}
		int var6 = arg3;
		if (arg3 < 3 && (arg0.field1169[1][var4][var5] & 0x2) == 2) {
			var6 = arg3 + 1;
		}
		int var7 = arg1 & 0x7F;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var7) * arg0.field1174[var6][var4][var5] + arg0.field1174[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * arg0.field1174[var6][var4][var5 + 1] + arg0.field1174[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("jx.ju(Ldr;IIIIB)I")
	public static int method5428(class80 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 == 0) {
			return method7784(arg0, arg1, arg2, arg3);
		}
		int var5 = arg4 / 2;
		int var6 = arg1 - var5;
		int var7 = arg2 - var5;
		int var8 = arg1 + var5;
		int var9 = arg2 + var5;
		int var10 = var6 >> 7;
		int var11 = var10 + 1;
		int var12 = var7 >> 7;
		int var13 = var12 + 1;
		int var14 = var8 >> 7;
		int var15 = var14;
		int var16 = var9 >> 7;
		int var17 = var16;
		int var18 = Integer.MAX_VALUE;
		for (int var19 = var11; var19 <= var15; var19++) {
			for (int var20 = var13; var20 <= var17; var20++) {
				var18 = Math.min(var18, method7784(arg0, class357.method6807(var19), class357.method6807(var20), arg3));
			}
		}
		int var21 = Math.min(var18, method7784(arg0, arg1, arg2, arg3));
		int var22 = Math.min(var21, method7784(arg0, arg1 - var5, arg2 - var5, arg3));
		int var23 = Math.min(var22, method7784(arg0, arg1 - var5, arg2 + var5, arg3));
		int var24 = Math.min(var23, method7784(arg0, arg1 + var5, arg2 - var5, arg3));
		return Math.min(var24, method7784(arg0, arg1 + var5, arg2 + var5, arg3));
	}

	@ObfuscatedName("pi.jx(IIIIIIII)V")
	public static final void method7593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg6 - 334;
		if (var7 < 0) {
			var7 = 0;
		} else if (var7 > 100) {
			var7 = 100;
		}
		int var8 = (field371 - field370) * var7 / 100 + field370;
		int var9 = arg5 * var8 / 256;
		int var11 = 2048 - arg3 & 0x7FF;
		int var12 = 2048 - arg4 & 0x7FF;
		int var13 = 0;
		int var14 = 0;
		int var15 = var9;
		if (var11 != 0) {
			int var16 = class226.field2638[var11];
			int var17 = class226.field2637[var11];
			int var18 = var14 * var17 - var9 * var16 >> 16;
			var15 = var14 * var16 + var9 * var17 >> 16;
			var14 = var18;
		}
		if (var12 != 0) {
			int var19 = class226.field2638[var12];
			int var20 = class226.field2637[var12];
			int var21 = var13 * var20 + var15 * var19 >> 16;
			var15 = var15 * var20 - var13 * var19 >> 16;
			var13 = var21;
		}
		if (field475) {
			Statics.field3088 = arg0 - var13;
			Statics.field1511 = arg1 - var14;
			Statics.field4854 = arg2 - var15;
			Statics.field885 = arg3;
			Statics.field1887 = arg4;
		} else {
			Statics.field2053 = arg0 - var13;
			Statics.field1941 = arg1 - var14;
			Statics.field47 = arg2 - var15;
			Statics.field4856 = arg3;
			Statics.field3461 = arg4;
		}
		if (field337 == 1 && field429 >= 2 && field413 % 50 == 0 && (Statics.field1931 >> 7 != Statics.field1109.field1056 >> 7 || Statics.field1585 >> 7 != Statics.field1109.field1057 >> 7)) {
			int var22 = Statics.field1109.field934;
			int var23 = (Statics.field1931 >> 7) + Statics.field3837.field1165;
			int var24 = (Statics.field1585 >> 7) + Statics.field3837.field1166;
			method6280(var23, var24, var22, true);
		}
	}

	@ObfuscatedName("ee.jo(ZLwf;B)V")
	public static final void method3415(boolean arg0, class590 arg1) {
		field474 = arg0;
		if (!field474) {
			arg1.method10593();
			int var2 = arg1.method10324();
			int var3 = arg1.method10341();
			int var4 = arg1.method10341();
			Statics.field3171 = new int[var4][4];
			for (int var5 = 0; var5 < var4; var5++) {
				for (int var6 = 0; var6 < 4; var6++) {
					Statics.field3171[var5][var6] = arg1.method10345();
				}
			}
			Statics.field4881 = new int[var4];
			Statics.field2464 = new int[var4];
			Statics.field4416 = new int[var4];
			Statics.field1554 = new byte[var4][];
			Statics.field2015 = new byte[var4][];
			int var7 = 0;
			for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
				for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
					int var10 = (var8 << 8) + var9;
					Statics.field4881[var7] = var10;
					Statics.field2464[var7] = Statics.field1761.method7715("m" + var8 + "_" + var9);
					Statics.field4416[var7] = Statics.field1761.method7715("l" + var8 + "_" + var9);
					var7++;
				}
			}
			method6909(var2, var3, true);
			return;
		}
		int var11 = arg1.method10563();
		int var12 = arg1.method10324();
		boolean var13 = arg1.method10375() == 1;
		int var14 = arg1.method10341();
		arg1.method10289();
		for (int var15 = 0; var15 < 4; var15++) {
			for (int var16 = 0; var16 < 13; var16++) {
				for (int var17 = 0; var17 < 13; var17++) {
					int var18 = arg1.method10290(1);
					if (var18 == 1) {
						field448[var15][var16][var17] = arg1.method10290(26);
					} else {
						field448[var15][var16][var17] = -1;
					}
				}
			}
		}
		arg1.method10291();
		Statics.field3171 = new int[var14][4];
		for (int var19 = 0; var19 < var14; var19++) {
			for (int var20 = 0; var20 < 4; var20++) {
				Statics.field3171[var19][var20] = arg1.method10345();
			}
		}
		Statics.field4881 = new int[var14];
		Statics.field2464 = new int[var14];
		Statics.field4416 = new int[var14];
		Statics.field1554 = new byte[var14][];
		Statics.field2015 = new byte[var14][];
		int var21 = 0;
		for (int var22 = 0; var22 < 4; var22++) {
			for (int var23 = 0; var23 < 13; var23++) {
				for (int var24 = 0; var24 < 13; var24++) {
					int var25 = field448[var22][var23][var24];
					if (var25 != -1) {
						int var26 = Statics.method5412(var25);
						int var27 = class389.method684(var25);
						int var28 = (var26 / 8 << 8) + var27 / 8;
						for (int var29 = 0; var29 < var21; var29++) {
							if (Statics.field4881[var29] == var28) {
								var28 = -1;
								break;
							}
						}
						if (var28 != -1) {
							Statics.field4881[var21] = var28;
							int var30 = var28 >> 8 & 0xFF;
							int var31 = var28 & 0xFF;
							Statics.field2464[var21] = Statics.field1761.method7715("m" + var30 + "_" + var31);
							Statics.field4416[var21] = Statics.field1761.method7715("l" + var30 + "_" + var31);
							var21++;
						}
					}
				}
			}
		}
		method6909(var11, var12, !var13);
	}

	@ObfuscatedName("oj.jg(IIZB)V")
	public static final void method6909(int arg0, int arg1, boolean arg2) {
		if (arg2 && Statics.field3188 == arg0 && Statics.field2211 == arg1) {
			return;
		}
		Statics.field3188 = arg0;
		Statics.field2211 = arg1;
		method3384(25);
		field557 = true;
		method8746(class394.field4704, true);
		int var3 = Statics.field3837.field1165;
		int var4 = Statics.field3837.field1166;
		Statics.field3837.field1165 = (arg0 - 6) * 8;
		Statics.field3837.field1166 = (arg1 - 6) * 8;
		int var5 = Statics.field3837.field1165 - var3;
		int var6 = Statics.field3837.field1166 - var4;
		int var7 = var5 * 128;
		int var8 = var6 * 128;
		for (int var9 = 0; var9 < 65536; var9++) {
			class82 var10 = (class82) Statics.field3837.field1161.method7917((long) var9);
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.field1040[var11] -= var5;
					var10.field1108[var11] -= var6;
				}
				var10.field1056 -= var7;
				var10.field1057 -= var8;
				var10.field1090 -= var5;
				var10.field1092 -= var6;
				var10.field1073 -= var5;
				var10.field1085 -= var6;
			}
		}
		Iterator var12 = Statics.field3837.field1170.iterator();
		while (true) {
			class70 var13;
			do {
				if (!var12.hasNext()) {
					for (int var15 = 0; var15 < 4095; var15++) {
						class506 var16 = (class506) Statics.field3837.field1172.method7946((long) var15);
						if (var16 != null) {
							var16.method9351(-var7, -var8);
						}
					}
					byte var17 = 0;
					byte var18 = 104;
					byte var19 = 1;
					if (var5 < 0) {
						var17 = 103;
						var18 = -1;
						var19 = -1;
					}
					byte var20 = 0;
					byte var21 = 104;
					byte var22 = 1;
					if (var6 < 0) {
						var20 = 103;
						var21 = -1;
						var22 = -1;
					}
					for (int var23 = var17; var23 != var18; var23 += var19) {
						for (int var24 = var20; var24 != var21; var24 += var22) {
							int var25 = var5 + var23;
							int var26 = var6 + var24;
							for (int var27 = 0; var27 < 4; var27++) {
								if (var25 >= 0 && var25 < 104 && var26 >= 0 && var26 < 104) {
									Statics.field3837.field1168[var27][var23][var24] = Statics.field3837.field1168[var27][var25][var26];
								} else {
									Statics.field3837.field1168[var27][var23][var24] = null;
								}
							}
						}
					}
					for (class75 var28 = (class75) Statics.field3837.field1159.method8034(); var28 != null; var28 = (class75) Statics.field3837.field1159.method8036()) {
						var28.field1023 -= var5;
						var28.field1037 -= var6;
						if (var28.field1023 < 0 || var28.field1023 >= 104 || var28.field1037 < 0 || var28.field1037 >= 104) {
							var28.method2234();
						}
					}
					if (field582 != 0) {
						field582 -= var5;
						field532 -= var6;
					}
					for (class54 var29 = (class54) field335.method8034(); var29 != null; var29 = (class54) field335.method8036()) {
						var29.method1941(-var5, -var6);
					}
					class59.field837 = 0;
					field475 = false;
					Statics.field2053 -= var5 << 7;
					Statics.field47 -= var6 << 7;
					Statics.field1931 -= var5 << 7;
					Statics.field1585 -= var6 << 7;
					field553 -= var5 << 7;
					field338 -= var6 << 7;
					field577 = -1;
					Statics.field3837.field1175.method8029();
					for (int var30 = 0; var30 < 4; var30++) {
						Statics.field3837.field1176[var30].method5725();
					}
					return;
				}
				var13 = (class70) var12.next();
			} while (var13 == null);
			for (int var14 = 0; var14 < 10; var14++) {
				var13.field1040[var14] -= var5;
				var13.field1108[var14] -= var6;
			}
			var13.field1056 -= var7;
			var13.field1057 -= var8;
			var13.field1090 -= var5;
			var13.field1092 -= var6;
			var13.field1073 -= var5;
			var13.field1085 -= var6;
		}
	}

	@ObfuscatedName("lf.jh(ZB)V")
	public static final void method5925(boolean arg0) {
		method3420();
		field315.field1299++;
		if (field315.field1299 < 50 && !arg0) {
			return;
		}
		field315.field1299 = 0;
		if (field471 || field315.method2873() == null) {
			return;
		}
		class330 var1 = class330.method3456(class328.field3640, field315.field1309);
		field315.method2874(var1);
		try {
			field315.method2869();
		} catch (IOException var3) {
			field471 = true;
		}
	}

	@ObfuscatedName("sb.jv(I)V")
	public static final void method8980() {
		method5925(false);
		field411 = 0;
		boolean var0 = true;
		for (int var1 = 0; var1 < Statics.field1554.length; var1++) {
			if (Statics.field2464[var1] != -1 && Statics.field1554[var1] == null) {
				Statics.field1554[var1] = Statics.field1761.method7692(Statics.field2464[var1], 0);
				if (Statics.field1554[var1] == null) {
					var0 = false;
					field411++;
				}
			}
			if (Statics.field4416[var1] != -1 && Statics.field2015[var1] == null) {
				Statics.field2015[var1] = Statics.field1761.method7693(Statics.field4416[var1], 0, Statics.field3171[var1]);
				if (Statics.field2015[var1] == null) {
					var0 = false;
					field411++;
				}
			}
		}
		if (!var0) {
			field477 = 1;
			return;
		}
		field330 = 0;
		boolean var2 = true;
		for (int var3 = 0; var3 < Statics.field1554.length; var3++) {
			byte[] var4 = Statics.field2015[var3];
			if (var4 != null) {
				int var5 = (Statics.field4881[var3] >> 8) * 64 - Statics.field3837.field1165;
				int var6 = (Statics.field4881[var3] & 0xFF) * 64 - Statics.field3837.field1166;
				if (field474) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= class60.method4021(var4, var5, var6);
			}
		}
		if (!var2) {
			field477 = 2;
			return;
		}
		if (field477 != 0) {
			method8746(class394.field4704 + class83.field1203 + class83.field1202 + 100 + "%" + class83.field1199, true);
		}
		method3420();
		Statics.field3837.field1160.method4800();
		for (int var7 = 0; var7 < 4; var7++) {
			Statics.field3837.field1176[var7].method5725();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					Statics.field3837.field1169[var8][var9][var10] = 0;
				}
			}
		}
		method3420();
		class60.method2060();
		int var11 = Statics.field1554.length;
		Statics.field3837.method2637();
		method5925(true);
		if (!field474) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (Statics.field4881[var12] >> 8) * 64 - Statics.field3837.field1165;
				int var14 = (Statics.field4881[var12] & 0xFF) * 64 - Statics.field3837.field1166;
				byte[] var15 = Statics.field1554[var12];
				if (var15 != null) {
					method3420();
					class60.method6744(Statics.field3837, var15, var13, var14, Statics.field3188 * 8 - 48, Statics.field2211 * 8 - 48);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (Statics.field4881[var16] >> 8) * 64 - Statics.field3837.field1165;
				int var18 = (Statics.field4881[var16] & 0xFF) * 64 - Statics.field3837.field1166;
				byte[] var19 = Statics.field1554[var16];
				if (var19 == null && Statics.field2211 < 800) {
					method3420();
					class60.method8212(Statics.field3837, var17, var18, 64, 64);
				}
			}
			method5925(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = Statics.field2015[var20];
				if (var21 != null) {
					int var22 = (Statics.field4881[var20] >> 8) * 64 - Statics.field3837.field1165;
					int var23 = (Statics.field4881[var20] & 0xFF) * 64 - Statics.field3837.field1166;
					method3420();
					class60.method5789(Statics.field3837, var21, var22, var23);
				}
			}
		}
		if (field474) {
			for (int var24 = 0; var24 < 4; var24++) {
				method3420();
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						boolean var27 = false;
						int var28 = field448[var24][var25][var26];
						if (var28 != -1) {
							int var29 = class389.method3656(var28);
							int var30 = class389.method2054(var28);
							int var31 = Statics.method5412(var28);
							int var32 = class389.method684(var28);
							int var33 = (var31 / 8 << 8) + var32 / 8;
							for (int var34 = 0; var34 < Statics.field4881.length; var34++) {
								if (Statics.field4881[var34] == var33 && Statics.field1554[var34] != null) {
									int var35 = (var31 - var25) * 8;
									int var36 = (var32 - var26) * 8;
									class60.method3408(Statics.field3837, Statics.field1554[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36);
									var27 = true;
									break;
								}
							}
						}
						if (!var27) {
							class60.method3813(Statics.field3837.field1174, var24, var25 * 8, var26 * 8);
						}
					}
				}
			}
			for (int var37 = 0; var37 < 13; var37++) {
				for (int var38 = 0; var38 < 13; var38++) {
					int var39 = field448[0][var37][var38];
					if (var39 == -1) {
						class60.method8212(Statics.field3837, var37 * 8, var38 * 8, 8, 8);
					}
				}
			}
			method5925(true);
			for (int var40 = 0; var40 < 4; var40++) {
				method3420();
				for (int var41 = 0; var41 < 13; var41++) {
					for (int var42 = 0; var42 < 13; var42++) {
						int var43 = field448[var40][var41][var42];
						if (var43 != -1) {
							int var44 = class389.method3656(var43);
							int var45 = class389.method2054(var43);
							int var46 = Statics.method5412(var43);
							int var47 = class389.method684(var43);
							int var48 = (var46 / 8 << 8) + var47 / 8;
							for (int var49 = 0; var49 < Statics.field4881.length; var49++) {
								if (Statics.field4881[var49] == var48 && Statics.field2015[var49] != null) {
									class60.method2001(Statics.field3837, Statics.field2015[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45);
									break;
								}
							}
						}
					}
				}
			}
		}
		method5925(true);
		method3420();
		class60.method5793(Statics.field3837);
		method5925(true);
		int var50 = class60.field843;
		if (var50 > Statics.field3837.field1171) {
			var50 = Statics.field3837.field1171;
		}
		if (var50 < Statics.field3837.field1171 - 1) {
			int var51 = Statics.field3837.field1171 - 1;
		}
		if (field566) {
			Statics.field3837.field1160.method4974(class60.field843);
		} else {
			Statics.field3837.field1160.method4974(0);
		}
		for (int var52 = 0; var52 < 104; var52++) {
			for (int var53 = 0; var53 < 104; var53++) {
				method7521(Statics.field3837, var52, var53);
			}
		}
		method3420();
		method2033();
		class213.field2316.method6456();
		if (Statics.field5520.method540()) {
			class330 var54 = class330.method3456(class328.field3607, field315.field1309);
			var54.field3665.method10547(1057001181);
			field315.method2874(var54);
		}
		if (!field474) {
			int var55 = (Statics.field3188 - 6) / 8;
			int var56 = (Statics.field3188 + 6) / 8;
			int var57 = (Statics.field2211 - 6) / 8;
			int var58 = (Statics.field2211 + 6) / 8;
			for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
				for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
					if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
						Statics.field1761.method7741("m" + var59 + "_" + var60);
						Statics.field1761.method7741("l" + var59 + "_" + var60);
					}
				}
			}
		}
		method3420();
		class60.method4084();
		class330 var61 = class330.method3456(class328.field3588, field315.field1309);
		field315.method2874(var61);
		class35.method3593();
		field557 = false;
	}

	@ObfuscatedName("qr.kw(Ldr;B)V")
	public static void method7887(class80 arg0) {
		int var1 = arg0.field1163 / 8;
		int var2 = arg0.field1164 / 8;
		boolean var3 = false;
		method5925(false);
		boolean var4 = true;
		for (int var5 = 0; var5 < Statics.field1891.length; var5++) {
			if (Statics.field1282[var5] != -1 && Statics.field1891[var5] == null) {
				Statics.field1891[var5] = Statics.field1761.method7692(Statics.field1282[var5], 0);
				if (Statics.field1891[var5] == null) {
					var4 = false;
				}
			}
			if (Statics.field1378[var5] != -1 && Statics.field2495[var5] == null) {
				Statics.field2495[var5] = Statics.field1761.method7693(Statics.field1378[var5], 0, Statics.field1236[var5]);
				if (Statics.field2495[var5] == null) {
					var4 = false;
				}
			}
		}
		if (!var4) {
			return;
		}
		method5925(false);
		boolean var6 = true;
		for (int var7 = 0; var7 < Statics.field1891.length; var7++) {
			byte[] var8 = Statics.field2495[var7];
			if (var8 != null) {
				byte var9 = 10;
				byte var10 = 10;
				var6 &= class60.method4021(var8, var9, var10);
			}
		}
		if (!var6) {
			return;
		}
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < arg0.field1169[var11].length; var12++) {
				Arrays.fill(arg0.field1169[var11][var12], (byte) 0);
			}
		}
		method3420();
		class60.method2060();
		arg0.method2637();
		method5925(true);
		for (int var13 = 0; var13 < 4; var13++) {
			method3420();
			for (int var14 = 0; var14 < var1; var14++) {
				for (int var15 = 0; var15 < var2; var15++) {
					boolean var16 = false;
					int var17 = field424[var13][var14][var15];
					if (var17 != -1) {
						int var18 = class389.method3656(var17);
						int var19 = class389.method2054(var17);
						int var20 = Statics.method5412(var17);
						int var21 = class389.method684(var17);
						int var22 = (var20 / 8 << 8) + var21 / 8;
						for (int var23 = 0; var23 < Statics.field2812.length; var23++) {
							if (Statics.field2812[var23] == var22 && Statics.field1891[var23] != null) {
								int var24 = (var20 - var14) * 8;
								int var25 = (var21 - var15) * 8;
								class60.method3408(arg0, Statics.field1891[var23], var13, var14 * 8, var15 * 8, var18, (var20 & 0x7) * 8, (var21 & 0x7) * 8, var19, var24, var25);
								var16 = true;
								break;
							}
						}
					}
					if (!var16) {
						class60.method3813(arg0.field1174, var13, var14 * 8, var15 * 8);
					}
				}
			}
		}
		for (int var26 = 0; var26 < 13; var26++) {
			for (int var27 = 0; var27 < 13; var27++) {
				int var28 = field424[0][var26][var27];
				if (var28 == -1) {
					class60.method8212(arg0, var26 * 8, var27 * 8, 8, 8);
				}
			}
		}
		method5925(true);
		for (int var29 = 0; var29 < 4; var29++) {
			method3420();
			for (int var30 = 0; var30 < var1; var30++) {
				for (int var31 = 0; var31 < var2; var31++) {
					int var32 = field424[var29][var30][var31];
					if (var32 != -1) {
						int var33 = class389.method3656(var32);
						int var34 = class389.method2054(var32);
						int var35 = Statics.method5412(var32);
						int var36 = class389.method684(var32);
						int var37 = (var35 / 8 << 8) + var36 / 8;
						for (int var38 = 0; var38 < Statics.field2812.length; var38++) {
							if (Statics.field2812[var38] == var37 && Statics.field2495[var38] != null) {
								class60.method2001(arg0, Statics.field2495[var38], var29, var30 * 8, var31 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34);
								break;
							}
						}
					}
				}
			}
		}
		method5925(true);
		method3420();
		class60.method5793(arg0);
		method5925(true);
		class213.field2316.method6456();
		method3420();
		class60.method4084();
		field454 = false;
	}

	@ObfuscatedName("bs.kn(IIIIIB)V")
	public static final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
		class231 var5 = Statics.field3837.field1160;
		long var6 = var5.method4826(arg0, arg1, arg2);
		if (var6 != 0L) {
			int var8 = var5.method4868(arg0, arg1, arg2, var6);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg3;
			boolean var12 = var6 != 0L;
			if (var12) {
				boolean var13 = (int) (var6 >>> 19 & 0x1L) == 1;
				var12 = !var13;
			}
			if (var12) {
				var11 = arg4;
			}
			int[] var15 = Statics.field2993.field6019;
			int var16 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
			int var17 = class243.method9745(var6);
			class213 var18 = class213.method8013(var17);
			if (var18.field2344 == -1) {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var15[var16] = var11;
						var15[var16 + 512] = var11;
						var15[var16 + 1024] = var11;
						var15[var16 + 1536] = var11;
					} else if (var9 == 1) {
						var15[var16] = var11;
						var15[var16 + 1] = var11;
						var15[var16 + 2] = var11;
						var15[var16 + 3] = var11;
					} else if (var9 == 2) {
						var15[var16 + 3] = var11;
						var15[var16 + 3 + 512] = var11;
						var15[var16 + 3 + 1024] = var11;
						var15[var16 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var15[var16 + 1536] = var11;
						var15[var16 + 1536 + 1] = var11;
						var15[var16 + 1536 + 2] = var11;
						var15[var16 + 1536 + 3] = var11;
					}
				}
				if (var10 == 3) {
					if (var9 == 0) {
						var15[var16] = var11;
					} else if (var9 == 1) {
						var15[var16 + 3] = var11;
					} else if (var9 == 2) {
						var15[var16 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var15[var16 + 1536] = var11;
					}
				}
				if (var10 == 2) {
					if (var9 == 3) {
						var15[var16] = var11;
						var15[var16 + 512] = var11;
						var15[var16 + 1024] = var11;
						var15[var16 + 1536] = var11;
					} else if (var9 == 0) {
						var15[var16] = var11;
						var15[var16 + 1] = var11;
						var15[var16 + 2] = var11;
						var15[var16 + 3] = var11;
					} else if (var9 == 1) {
						var15[var16 + 3] = var11;
						var15[var16 + 3 + 512] = var11;
						var15[var16 + 3 + 1024] = var11;
						var15[var16 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var15[var16 + 1536] = var11;
						var15[var16 + 1536 + 1] = var11;
						var15[var16 + 1536 + 2] = var11;
						var15[var16 + 1536 + 3] = var11;
					}
				}
			} else {
				class605 var19 = Statics.field203[var18.field2344];
				if (var19 != null) {
					int var20 = (var18.field2330 * 4 - var19.field6008) / 2;
					int var21 = (var18.field2331 * 4 - var19.field6011) / 2;
					var19.method10780(arg1 * 4 + 48 + var20, (104 - arg2 - var18.field2331) * 4 + 48 + var21);
				}
			}
		}
		long var22 = var5.method5040(arg0, arg1, arg2);
		if (var22 != 0L) {
			int var24 = var5.method4868(arg0, arg1, arg2, var22);
			int var25 = var24 >> 6 & 0x3;
			int var26 = var24 & 0x1F;
			int var27 = class243.method9745(var22);
			class213 var28 = class213.method8013(var27);
			if (var28.field2344 != -1) {
				class605 var29 = Statics.field203[var28.field2344];
				if (var29 != null) {
					int var30 = (var28.field2330 * 4 - var29.field6008) / 2;
					int var31 = (var28.field2331 * 4 - var29.field6011) / 2;
					var29.method10780(arg1 * 4 + 48 + var30, (104 - arg2 - var28.field2331) * 4 + 48 + var31);
				}
			} else if (var26 == 9) {
				int var32 = 15658734;
				boolean var33 = var22 != 0L;
				if (var33) {
					boolean var34 = (int) (var22 >>> 19 & 0x1L) == 1;
					var33 = !var34;
				}
				if (var33) {
					var32 = 15597568;
				}
				int[] var36 = Statics.field2993.field6019;
				int var37 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
				if (var25 == 0 || var25 == 2) {
					var36[var37 + 1536] = var32;
					var36[var37 + 1024 + 1] = var32;
					var36[var37 + 512 + 2] = var32;
					var36[var37 + 3] = var32;
				} else {
					var36[var37] = var32;
					var36[var37 + 512 + 1] = var32;
					var36[var37 + 1024 + 2] = var32;
					var36[var37 + 1536 + 3] = var32;
				}
			}
		}
		long var38 = var5.method4914(arg0, arg1, arg2);
		if (var38 == 0L) {
			return;
		}
		int var40 = class243.method9745(var38);
		class213 var41 = class213.method8013(var40);
		if (var41.field2344 == -1) {
			return;
		}
		class605 var42 = Statics.field203[var41.field2344];
		if (var42 != null) {
			int var43 = (var41.field2330 * 4 - var42.field6008) / 2;
			int var44 = (var41.field2331 * 4 - var42.field6011) / 2;
			var42.method10780(arg1 * 4 + 48 + var43, (104 - arg2 - var41.field2331) * 4 + 48 + var44);
		}
	}

	@ObfuscatedName("if.ki(Lme;B)V")
	public static final void method4299(class329 arg0) {
		class590 var1 = field315.field1294;
		if (class329.field3652 == arg0) {
			int var2 = var1.method10384();
			int var3 = var1.method10324();
			int var4 = var1.method10432();
			int var5 = var1.method10324();
			int var6 = var1.method10390();
			int var7 = var1.method10397();
			int var8 = class357.method6803(var7);
			int var9 = Statics.method6814(var7);
			int var10 = class357.method6805(var7);
			int var11 = var1.method10324();
			int var12 = var1.method10563();
			int var13 = var1.method10384();
			int var14 = var1.method10422();
			int var15 = var1.method10422();
			int var16 = Statics.field5344.field1171;
			int var17 = Statics.field5344.field1165 + (var15 >> 4 & 0x7) + Statics.field1757;
			int var18 = Statics.field5344.field1166 + (var15 & 0x7) + Statics.field1874;
			if (var2 != 65535) {
				class54 var19 = new class54(var16, var17, var18, var12, var4, var8, var9, var10, var3, var6, var2, field413 + var11, field413 + var13, var14, var5);
				field335.method8033(var19);
			}
		} else if (class329.field3649 == arg0) {
			int var20 = var1.method10375();
			int var21 = (var20 >> 4 & 0x7) + Statics.field1757;
			int var22 = (var20 & 0x7) + Statics.field1874;
			int var23 = var1.method10422();
			int var24 = var23 >> 2;
			int var25 = var23 & 0x3;
			int var26 = field321[var24];
			if (var21 >= 0 && var22 >= 0 && var21 < Statics.field5344.field1163 && var22 < Statics.field5344.field1164) {
				int var27 = field476 == -1 ? Statics.field5344.field1171 : field476;
				method2653(Statics.field5344, var27, var21, var22, var26, -1, var24, var25, 31, null, 0, -1);
			}
		} else if (class329.field3646 == arg0) {
			boolean var28 = var1.method10339() == 1;
			int var29 = var1.method10422();
			int var30 = var1.method10373();
			int var31 = (var30 >> 4 & 0x7) + Statics.field1757;
			int var32 = (var30 & 0x7) + Statics.field1874;
			int var33 = var1.method10563();
			int var34 = var1.method10422();
			int var35 = var1.method10324();
			int var36 = var1.method10563();
			int var37 = var1.method10395();
			if (var31 >= 0 && var32 >= 0 && var31 < Statics.field5344.field1163 && var32 < Statics.field5344.field1164) {
				int var38 = field476 == -1 ? Statics.field5344.field1171 : field476;
				method2201(var38, var31, var32, var35, var37, var34, var36, var33, var29, var28);
			}
		} else if (class329.field3654 == arg0) {
			int var39 = var1.method10341();
			int var40 = var1.method10422();
			int var41 = (var40 >> 4 & 0x7) + Statics.field1757;
			int var42 = (var40 & 0x7) + Statics.field1874;
			int var43 = var1.method10422();
			int var44 = var43 >> 2;
			int var45 = var43 & 0x3;
			int var46 = field321[var44];
			if (var41 >= 0 && var41 < 103 && var42 >= 0 && var42 < 103) {
				int var47 = field476 == -1 ? Statics.field5344.field1171 : field476;
				class75 var48 = method8552(Statics.field5344, var47, var41, var42, var46);
				if (var48 != null) {
					class213 var49 = class213.method8013(var48.field1028);
					if (var49.field2324) {
						method6473(var47, var41, var42, var44, var45, var46, var39);
						var48.field1024 = var39;
						return;
					}
				}
				boolean var50 = method6473(var47, var41, var42, var44, var45, var46, var39);
				if (var50) {
					return;
				}
				if (var48 != null) {
					var48.field1024 = var39;
				}
			}
		} else if (class329.field3656 == arg0) {
			int var51 = var1.method10339();
			int var52 = (var51 >> 4 & 0x7) + Statics.field1757;
			int var53 = (var51 & 0x7) + Statics.field1874;
			int var54 = var1.method10324();
			int var55 = var1.method10563();
			int var56 = var1.method10375();
			if (var52 >= 0 && var53 >= 0 && var52 < Statics.field5344.field1163 && var53 < Statics.field5344.field1164) {
				int var57 = class357.method6806(var52);
				int var58 = class357.method6806(var53);
				int var59 = field476 == -1 ? Statics.field5344.field1171 : field476;
				class49 var60 = new class49(Statics.field5344, var55, var59, var57, var58, method7784(Statics.field5344, var57, var58, var59) - var56, var54, field413);
				Statics.field5344.field1175.method8033(var60);
			}
		} else if (class329.field3647 == arg0) {
			int var61 = var1.method10563();
			int var62 = var1.method10397();
			int var63 = var1.method10375();
			int var64 = (var63 >> 4 & 0x7) + Statics.field1757;
			int var65 = (var63 & 0x7) + Statics.field1874;
			int var66 = Statics.field5344.field1171;
			if (var64 >= 0 && var64 < 104 && var65 >= 0 && var65 < 104) {
				int var67 = field476 == -1 ? var66 : field476;
				Statics.method3882(var67, var64, var65, var61, var62);
			}
		} else if (class329.field3645 == arg0) {
			int var68 = var1.method10375();
			int var69 = (var68 >> 4 & 0x7) + Statics.field1757;
			int var70 = (var68 & 0x7) + Statics.field1874;
			int var71 = var1.method10324();
			int var72 = var1.method10397();
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
				int var73 = field476 == -1 ? Statics.field5344.field1171 : field476;
				method3319(var73, var69, var70, var71, var72);
			}
		} else if (class329.field3644 == arg0) {
			int var74 = var1.method10436();
			int var75 = var1.method10375();
			int var76 = (var75 >> 4 & 0x7) + Statics.field1757;
			int var77 = (var75 & 0x7) + Statics.field1874;
			int var78 = var1.method10563();
			int var79 = var1.method10397();
			if (var76 >= 0 && var77 >= 0 && var76 < Statics.field5344.field1163 && var77 < Statics.field5344.field1164) {
				int var80 = field476 == -1 ? Statics.field5344.field1171 : field476;
				method1866(var80, var76, var77, var78, var79, var74);
			}
		} else if (class329.field3651 == arg0) {
			int var81 = var1.method10586();
			int var82 = var1.method10375();
			int var83 = (var82 >> 4 & 0x7) + Statics.field1757;
			int var84 = (var82 & 0x7) + Statics.field1874;
			short var85 = (short) var1.method10593();
			int var86 = var1.method10436();
			int var87 = var1.method10563();
			int var88 = var1.method10563();
			int var89 = var1.method10387();
			short var90 = (short) var1.method10593();
			if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
				int var91 = field476 == -1 ? Statics.field5344.field1171 : field476;
				method4124(var91, var83, var84, var87, var86, var85, var81, var90, var89, var88);
			}
		} else if (class329.field3655 == arg0) {
			int var92 = var1.method10422();
			String[] var93 = null;
			if (var92 > 0) {
				var93 = new String[5];
				for (int var94 = 0; var94 < var92; var94++) {
					int var95 = var1.method10375();
					String var96 = var1.method10350();
					if (var95 >= 0 && var95 < 5) {
						var93[var95] = var96;
					}
				}
			}
			int var97 = var1.method10422();
			int var98 = (var97 >> 4 & 0x7) + Statics.field1757;
			int var99 = (var97 & 0x7) + Statics.field1874;
			int var100 = var1.method10422();
			int var101 = var100 >> 2;
			int var102 = var100 & 0x3;
			int var103 = field321[var101];
			int var104 = var1.method10563();
			int var105 = var1.method10339();
			if (var98 >= 0 && var99 >= 0 && var98 < Statics.field5344.field1163 && var99 < Statics.field5344.field1164) {
				int var106 = field476 == -1 ? Statics.field5344.field1171 : field476;
				method2653(Statics.field5344, var106, var98, var99, var103, var104, var101, var102, var105, var93, 0, -1);
			}
		} else if (class329.field3653 == arg0) {
			int var107 = var1.method10375();
			int var108 = var1.method10384();
			int var109 = var1.method10373();
			int var110 = var1.method10373() & 0x1F;
			int var111 = var1.method10339();
			int var112 = var1.method10375();
			int var113 = (var112 >> 4 & 0x7) + Statics.field1757;
			int var114 = (var112 & 0x7) + Statics.field1874;
			if (var113 >= 0 && var114 >= 0 && var113 < Statics.field5344.field1163 && var114 < Statics.field5344.field1164) {
				int var115 = var110 + 1;
				if (Statics.field1109.field1040[0] >= var113 - var115 && Statics.field1109.field1040[0] <= var113 + var115 && Statics.field1109.field1108[0] >= var114 - var115 && Statics.field1109.field1108[0] <= var114 + var115) {
					class59.method679(Statics.field5344.field1173, var108, var113, var114, var110, var107, var109, var111);
				}
			}
		} else {
			if (class329.field3648 == arg0) {
				byte var116 = var1.method10400();
				int var117 = var1.method10341();
				int var118 = var1.method10375();
				int var119 = (var118 >> 4 & 0x7) + Statics.field1757;
				int var120 = (var118 & 0x7) + Statics.field1874;
				byte var121 = var1.method10378();
				byte var122 = var1.method10400();
				int var123 = var1.method10341();
				int var124 = var1.method10373();
				int var125 = var124 >> 2;
				int var126 = var124 & 0x3;
				int var127 = field321[var125];
				byte var128 = var1.method10378();
				int var129 = var1.method10563();
				int var130 = var1.method10384();
				class70 var131;
				if (field492 == var117) {
					var131 = Statics.field1109;
				} else {
					var131 = (class70) Statics.field5344.field1170.method7917((long) var117);
				}
				if (var131 != null) {
					int var132 = field476 == -1 ? Statics.field5344.field1171 : field476;
					method7548(var132, var119, var120, var125, var126, var127, var129, var123, var130, var122, var116, var128, var121, var131);
				}
			}
			if (class329.field3650 == arg0) {
				int var133 = var1.method10341();
				int var134 = var1.method10373();
				int var135 = (var134 >> 4 & 0x7) + Statics.field1757;
				int var136 = (var134 & 0x7) + Statics.field1874;
				int var137 = var1.method10422();
				int var138 = Statics.field5344.field1171;
				if (var135 >= 0 && var136 >= 0 && var135 < Statics.field5344.field1163 && var136 < Statics.field5344.field1164) {
					class437 var139 = Statics.field5344.field1168[var138][var135][var136];
					if (var139 != null) {
						for (class86 var140 = (class86) var139.method8034(); var140 != null; var140 = (class86) var139.method8036()) {
							if ((var133 & 0x7FFF) == var140.field1222) {
								var140.method2738(var137);
								break;
							}
						}
					}
					if (var135 >= 0 && var136 >= 0 && var135 < Statics.field5344.field1163 && var136 < Statics.field5344.field1164) {
						int var141 = field476 == -1 ? Statics.field5344.field1171 : field476;
						method6358(var141, var135, var136, var133, var137);
					}
					return;
				}
			}
		}
	}

	@ObfuscatedName("lk.kf(IIIIII)V")
	public static void method6358(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Statics.method2058(Statics.field5344, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("bc.ku(IIIIIIS)V")
	public static void method1866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method2710(Statics.field5344, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("dt.km(Ldr;IIIIIII)V")
	public static void method2710(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class437 var7 = arg0.field1168[arg1][arg2][arg3];
		if (var7 == null) {
			return;
		}
		for (class86 var8 = (class86) var7.method8034(); var8 != null; var8 = (class86) var7.method8036()) {
			if ((arg4 & 0x7FFF) == var8.field1222 && var8.field1223 == arg5) {
				var8.field1223 = arg6;
				break;
			}
		}
		method4009(arg1, arg2, arg3);
	}

	@ObfuscatedName("hn.ks(IIIIISISIII)V")
	public static void method4124(int arg0, int arg1, int arg2, int arg3, int arg4, short arg5, int arg6, short arg7, int arg8, int arg9) {
		method3324(Statics.field5344, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("es.kk(Ldr;IIIIISISIII)V")
	public static void method3324(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, short arg6, int arg7, short arg8, int arg9, int arg10) {
		class437 var11 = arg0.field1168[arg1][arg2][arg3];
		if (var11 == null) {
			return;
		}
		for (class86 var12 = (class86) var11.method8034(); var12 != null; var12 = (class86) var11.method8036()) {
			if ((arg4 & 0x7FFF) == var12.field1222 && var12.field1223 == arg5) {
				class177 var13 = var12.method2741();
				if (var13 == null) {
					var13 = new class177(arg4);
				}
				if (var13.method3824() && arg7 > -1 && arg7 < var13.field1948.length) {
					var13.field1948[arg7] = arg6;
				}
				if (var13.method3825() && arg9 > -1 && arg9 < var13.field1950.length) {
					var13.field1950[arg9] = arg8;
				}
				if (arg10 > -1) {
					var13.field1954 = arg10;
					var13.field1956 = null;
				}
				var12.method2747(var13);
				break;
			}
		}
		method4009(arg1, arg2, arg3);
	}

	@ObfuscatedName("es.kr(IIIIII)V")
	public static void method3319(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method6475(Statics.field5344, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("mn.ke(Ldr;IIIIII)V")
	public static void method6475(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class437 var6 = arg0.field1168[arg1][arg2][arg3];
		if (var6 == null) {
			return;
		}
		for (class86 var7 = (class86) var6.method8034(); var7 != null; var7 = (class86) var6.method8036()) {
			if ((arg4 & 0x7FFF) == var7.field1222 && var7.field1223 == arg5) {
				var7.method2753();
				break;
			}
		}
		method4009(arg1, arg2, arg3);
	}

	@ObfuscatedName("of.kj(IIIIIIIIIIIIILcv;B)V")
	public static void method7548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class70 arg13) {
		class213 var14 = class213.method8013(arg6);
		int var15;
		int var16;
		if (arg4 == 1 || arg4 == 3) {
			var15 = var14.field2331;
			var16 = var14.field2330;
		} else {
			var15 = var14.field2330;
			var16 = var14.field2331;
		}
		int var17 = (var15 >> 1) + arg1;
		int var18 = (var15 + 1 >> 1) + arg1;
		int var19 = (var16 >> 1) + arg2;
		int var20 = (var16 + 1 >> 1) + arg2;
		int[][] var21 = Statics.field5344.field1174[arg0];
		int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
		int var23 = (arg1 << 7) + (var15 << 6);
		int var24 = (arg2 << 7) + (var16 << 6);
		class242 var25 = var14.method4351(arg3, arg4, var21, var23, var22, var24);
		if (var25 == null) {
			return;
		}
		method2653(Statics.field5344, arg0, arg1, arg2, arg5, -1, 0, 0, 31, null, arg7 + 1, arg8 + 1);
		arg13.field943 = field413 + arg7;
		arg13.field944 = field413 + arg8;
		arg13.field948 = var25;
		arg13.field945 = arg1 * 128 + var15 * 64;
		arg13.field946 = arg2 * 128 + var16 * 64;
		arg13.field937 = var22;
		if (arg9 > arg11) {
			int var26 = arg9;
			arg9 = arg11;
			arg11 = var26;
		}
		if (arg10 > arg12) {
			int var27 = arg10;
			arg10 = arg12;
			arg12 = var27;
		}
		arg13.field949 = arg1 + arg9;
		arg13.field954 = arg1 + arg11;
		arg13.field950 = arg2 + arg10;
		arg13.field947 = arg2 + arg12;
	}

	@ObfuscatedName("jk.kh(Ldr;IIIIII)V")
	public static void method5064(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class437 var6 = arg0.field1168[arg1][arg2][arg3];
		if (var6 == null) {
			return;
		}
		for (class86 var7 = (class86) var6.method8034(); var7 != null; var7 = (class86) var6.method8036()) {
			if ((arg4 & 0x7FFF) == var7.field1222 && var7.field1223 == arg5) {
				var7.method2234();
				break;
			}
		}
		if (var6.method8034() == null) {
			arg0.field1168[arg1][arg2][arg3] = null;
		}
		method2298(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("cy.kb(IIIIIIIIIZB)V")
	public static void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
		method5055(Statics.field5344, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("jw.kq(Ldr;IIIIIIIIIZI)V")
	public static void method5055(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		class86 var11 = new class86();
		var11.field1222 = arg4;
		var11.field1223 = arg5;
		var11.method2738(arg6);
		var11.field1224 = field568 + arg7;
		var11.field1225 = field568 + arg8;
		var11.field1226 = arg9;
		var11.field1227 = arg10;
		if (arg0.field1168[arg1][arg2][arg3] == null) {
			arg0.field1168[arg1][arg2][arg3] = new class437();
		}
		arg0.field1168[arg1][arg2][arg3].method8033(var11);
		method2298(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("go.kc(IIIIIIB)Z")
	public static boolean method3811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return method6473(Statics.field5344.field1171, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("mn.kp(IIIIIIII)Z")
	public static boolean method6473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class231 var7 = Statics.field5344.field1160;
		if (class397.field4814.field4815 == arg5) {
			class251 var8 = var7.method4822(arg0, arg1, arg2);
			if (var8 != null) {
				int var9 = class243.method9745(var8.field3029);
				if (class379.field4346.field4365 == arg3) {
					var8.field3033 = new class57(Statics.field5344, var9, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var8.field3033);
					var8.field3025 = new class57(Statics.field5344, var9, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var8.field3025);
				} else {
					var8.field3033 = new class57(Statics.field5344, var9, arg3, arg4, arg0, arg1, arg2, arg6, false, var8.field3033);
				}
				return true;
			}
		} else if (class397.field4811.field4815 == arg5) {
			class253 var10 = var7.method4960(arg0, arg1, arg2);
			if (var10 != null) {
				int var11 = class243.method9745(var10.field3038);
				if (class379.field4349.field4365 == arg3 || class379.field4364.field4365 == arg3) {
					var10.field3037 = new class57(Statics.field5344, var11, 4, arg4, arg0, arg1, arg2, arg6, false, var10.field3037);
				} else if (class379.field4348.field4365 == arg3) {
					var10.field3037 = new class57(Statics.field5344, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field3037);
				} else if (class379.field4350.field4365 == arg3) {
					var10.field3037 = new class57(Statics.field5344, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field3037);
				} else if (class379.field4351.field4365 == arg3) {
					var10.field3037 = new class57(Statics.field5344, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field3037);
					var10.field3046 = new class57(Statics.field5344, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field3046);
				}
				return true;
			}
		} else if (class397.field4812.field4815 == arg5) {
			class254 var12 = var7.method4925(arg0, arg1, arg2);
			if (class379.field4363.field4365 == arg3) {
				arg3 = class379.field4362.field4365;
			}
			if (var12 != null) {
				var12.field3063 = new class57(Statics.field5344, class243.method9745(var12.field3053), arg3, arg4, arg0, arg1, arg2, arg6, false, var12.field3063);
				return true;
			}
		} else if (class397.field4813.field4815 == arg5) {
			class221 var13 = var7.method4825(arg0, arg1, arg2);
			if (var13 != null) {
				var13.field2574 = new class57(Statics.field5344, class243.method9745(var13.field2572), 22, arg4, arg0, arg1, arg2, arg6, false, var13.field2574);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("dr.ky(Ldr;IIIIIIII[Ljava/lang/String;IIB)V")
	public static void method2653(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, String[] arg9, int arg10, int arg11) {
		class437 var12 = arg0.field1159;
		class75 var13 = null;
		for (class75 var14 = (class75) var12.method8034(); var14 != null; var14 = (class75) var12.method8036()) {
			if (var14.field1027 == arg1 && var14.field1023 == arg2 && var14.field1037 == arg3 && var14.field1022 == arg4) {
				var13 = var14;
				break;
			}
		}
		if (var13 == null) {
			var13 = new class75();
			var13.field1027 = arg1;
			var13.field1022 = arg4;
			var13.field1023 = arg2;
			var13.field1037 = arg3;
			var13.field1024 = -1;
			method3253(arg0, var13);
			var12.method8033(var13);
		}
		var13.field1028 = arg5;
		var13.field1030 = arg6;
		var13.field1029 = arg7;
		var13.field1032 = arg10;
		var13.field1033 = arg11;
		var13.method2359(arg8);
		var13.method2360(arg9);
	}

	@ObfuscatedName("ro.ko(Ldr;IIIII)Lck;")
	public static final class75 method8552(class80 arg0, int arg1, int arg2, int arg3, int arg4) {
		for (class75 var5 = (class75) arg0.field1159.method8034(); var5 != null; var5 = (class75) arg0.field1159.method8036()) {
			if (var5.field1027 == arg1 && var5.field1023 == arg2 && var5.field1037 == arg3 && var5.field1022 == arg4) {
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("cc.kl(I)V")
	public static final void method2033() {
		for (class75 var0 = (class75) Statics.field3837.field1159.method8034(); var0 != null; var0 = (class75) Statics.field3837.field1159.method8036()) {
			if (var0.field1033 == -1) {
				var0.field1032 = 0;
				method3253(Statics.field3837, var0);
			} else {
				var0.method2234();
			}
		}
	}

	@ObfuscatedName("ec.kz(Ldr;Lck;B)V")
	public static final void method3253(class80 arg0, class75 arg1) {
		class231 var2 = arg0.field1160;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (arg1.field1022 == 0) {
			var3 = var2.method4826(arg1.field1027, arg1.field1023, arg1.field1037);
		}
		if (arg1.field1022 == 1) {
			var3 = var2.method4827(arg1.field1027, arg1.field1023, arg1.field1037);
		}
		if (arg1.field1022 == 2) {
			var3 = var2.method5040(arg1.field1027, arg1.field1023, arg1.field1037);
		}
		if (arg1.field1022 == 3) {
			var3 = var2.method4914(arg1.field1027, arg1.field1023, arg1.field1037);
		}
		if (var3 != 0L) {
			int var8 = var2.method4868(arg1.field1027, arg1.field1023, arg1.field1037, var3);
			var5 = class243.method9745(var3);
			var6 = var8 & 0x1F;
			var7 = var8 >> 6 & 0x3;
		}
		arg1.field1025 = var5;
		arg1.field1036 = var6;
		arg1.field1026 = var7;
	}

	@ObfuscatedName("fn.ka(I)V")
	public static final void method3653() {
		Iterator var0 = field334.iterator();
		while (var0.hasNext()) {
			class80 var1 = (class80) var0.next();
			for (class75 var2 = (class75) var1.field1159.method8034(); var2 != null; var2 = (class75) var1.field1159.method8036()) {
				if (var2.field1033 > 0) {
					var2.field1033--;
				}
				if (var2.field1033 == 0) {
					if (var2.field1025 >= 0) {
						int var3 = var2.field1025;
						int var4 = var2.field1036;
						class213 var5 = class213.method8013(var3);
						if (var4 == 11) {
							var4 = 10;
						}
						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}
						boolean var6 = var5.method4329(var4);
						if (!var6) {
							continue;
						}
					}
					Statics.method6491(var1, var2.field1027, var2.field1022, var2.field1023, var2.field1037, var2.field1025, var2.field1026, var2.field1036, var2.field1024);
					var2.method2234();
				} else {
					if (var2.field1032 > 0) {
						var2.field1032--;
					}
					if (var2.field1032 == 0 && var2.field1023 >= 1 && var2.field1037 >= 1 && var2.field1023 <= 102 && var2.field1037 <= 102) {
						if (var2.field1028 >= 0) {
							int var7 = var2.field1028;
							int var8 = var2.field1030;
							class213 var9 = class213.method8013(var7);
							if (var8 == 11) {
								var8 = 10;
							}
							if (var8 >= 5 && var8 <= 8) {
								var8 = 4;
							}
							boolean var10 = var9.method4329(var8);
							if (!var10) {
								continue;
							}
						}
						Statics.method6491(var1, var2.field1027, var2.field1022, var2.field1023, var2.field1037, var2.field1028, var2.field1029, var2.field1030, var2.field1024);
						var2.field1032 = -1;
						if (var2.field1028 == var2.field1025 && var2.field1025 == -1) {
							var2.method2234();
						} else if (var2.field1028 == var2.field1025 && var2.field1029 == var2.field1026 && var2.field1036 == var2.field1030) {
							var2.method2234();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("og.kt(Ldr;IIB)V")
	public static final void method7521(class80 arg0, int arg1, int arg2) {
		method2298(arg0, arg0.field1171, arg1, arg2);
	}

	@ObfuscatedName("hy.lf(IIII)V")
	public static final void method4009(int arg0, int arg1, int arg2) {
		method2298(Statics.field5344, arg0, arg1, arg2);
	}

	@ObfuscatedName("cd.lo(Ldr;IIIB)V")
	public static final void method2298(class80 arg0, int arg1, int arg2, int arg3) {
		class437 var4 = arg0.field1168[arg1][arg2][arg3];
		if (var4 == null) {
			arg0.field1160.method4853(arg1, arg2, arg3);
			return;
		}
		long var5 = -99999999L;
		class86 var7 = null;
		for (class86 var8 = (class86) var4.method8034(); var8 != null; var8 = (class86) var4.method8036()) {
			class214 var9 = class214.method2737(var8.field1222);
			long var10 = (long) var9.field2411;
			if (var9.field2398 == 1) {
				var10 *= var8.field1223 < Integer.MAX_VALUE ? (long) (var8.field1223 + 1) : (long) var8.field1223;
			}
			if (var10 > var5) {
				var5 = var10;
				var7 = var8;
			}
		}
		if (var7 == null) {
			arg0.field1160.method4853(arg1, arg2, arg3);
			return;
		}
		var4.method8031(var7);
		class86 var12 = null;
		class86 var13 = null;
		for (class86 var14 = (class86) var4.method8034(); var14 != null; var14 = (class86) var4.method8036()) {
			if (var7.field1222 != var14.field1222) {
				if (var12 == null) {
					var12 = var14;
				}
				if (var12.field1222 != var14.field1222 && var13 == null) {
					var13 = var14;
				}
			}
		}
		long var15 = class243.method3407(arg1, arg2, arg3, 3, false, 0, arg0.field1173);
		arg0.field1160.method4807(arg1, arg2, arg3, method7784(arg0, class357.method6806(arg2), class357.method6806(arg3), arg1), var7, var15, var12, var13);
	}

	@ObfuscatedName("bv.la(IIII)Ldr;")
	public static class80 method1744(int arg0, int arg1, int arg2) {
		return field334.method2324(arg0, arg1, arg2, Statics.field240.method2536(), class218.field2512);
	}

	@ObfuscatedName("ic.ll(Ldr;Lwf;B)V")
	public static void method5049(class80 arg0, class590 arg1) {
		class80 var2 = Statics.field5344;
		var2.field1165 = arg1.method10341();
		var2.field1166 = arg1.method10341();
		int var3 = var2.field1163 / 8;
		int var4 = var2.field1164 / 8;
		int var5 = arg1.method10341();
		arg1.method10289();
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < var3; var7++) {
				for (int var8 = 0; var8 < var4; var8++) {
					int var9 = arg1.method10290(1);
					if (var9 == 1) {
						field424[var6][var7][var8] = arg1.method10290(26);
					} else {
						field424[var6][var7][var8] = -1;
					}
				}
			}
		}
		arg1.method10291();
		Statics.field1236 = new int[var5][4];
		for (int var10 = 0; var10 < var5; var10++) {
			for (int var11 = 0; var11 < 4; var11++) {
				Statics.field1236[var10][var11] = arg1.method10345();
			}
		}
		Statics.field2812 = new int[var5];
		Statics.field1282 = new int[var5];
		Statics.field1378 = new int[var5];
		Statics.field1891 = new byte[var5][];
		Statics.field2495 = new byte[var5][];
		int var12 = 0;
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < var3; var14++) {
				for (int var15 = 0; var15 < var4; var15++) {
					int var16 = field424[var13][var14][var15];
					if (var16 != -1) {
						int var17 = Statics.method5412(var16);
						int var18 = class389.method684(var16);
						int var19 = (var17 / 8 << 8) + var18 / 8;
						for (int var20 = 0; var20 < var12; var20++) {
							if (Statics.field2812[var20] == var19) {
								var19 = -1;
								break;
							}
						}
						if (var19 != -1) {
							Statics.field2812[var12] = var19;
							int var21 = var19 >> 8 & 0xFF;
							int var22 = var19 & 0xFF;
							Statics.field1282[var12] = Statics.field1761.method7715("m" + var21 + "_" + var22);
							Statics.field1378[var12] = Statics.field1761.method7715("l" + var21 + "_" + var22);
							var12++;
						}
					}
				}
			}
		}
		method3384(25);
		field454 = true;
		Statics.field2979 = var2;
		method7887(var2);
	}

	@ObfuscatedName("lr.lb(Ldr;ZLwf;I)V")
	public static final void method6323(class80 arg0, boolean arg1, class590 arg2) {
		field373 = 0;
		field469 = 0;
		method6782(arg0, arg2);
		method7567(arg0, arg1, arg2);
		method7520(arg0, arg2);
		for (int var3 = 0; var3 < field373; var3++) {
			int var4 = field361[var3];
			class82 var5 = (class82) arg0.field1161.method7917((long) var4);
			if (var5.field1189) {
				var5.field1185 = null;
				var5.method9757();
			}
		}
		if (field315.field1295 != arg2.field5920) {
			throw new RuntimeException(arg2.field5920 + class83.field1197 + field315.field1295);
		}
	}

	@ObfuscatedName("ni.lw(Ldr;Lwf;I)V")
	public static final void method6782(class80 arg0, class590 arg1) {
		arg1.method10289();
		int var2 = arg1.method10290(8);
		if (var2 < arg0.field1162.method9107()) {
			for (int var3 = var2; var3 < arg0.field1162.method9107(); var3++) {
				int var4 = arg0.field1162.method9104(var3);
				field361[++field373 - 1] = var4;
				class82 var5 = (class82) arg0.field1161.method7917((long) var4);
				var5.field1189 = true;
			}
		}
		if (var2 > arg0.field1162.method9107()) {
			throw new RuntimeException("");
		}
		arg0.field1162.method9110();
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg0.field1162.method9104(var6);
			class82 var8 = (class82) arg0.field1161.method7917((long) var7);
			int var9 = arg1.method10290(1);
			if (var9 == 0) {
				arg0.field1162.method9115(var7);
			} else {
				int var10 = arg1.method10290(2);
				if (var10 == 0) {
					arg0.field1162.method9115(var7);
					field470[++field469 - 1] = var7;
				} else if (var10 == 1) {
					arg0.field1162.method9115(var7);
					int var11 = arg1.method10290(3);
					var8.method2686(var11, class281.field3282);
					int var12 = arg1.method10290(1);
					if (var12 == 1) {
						field470[++field469 - 1] = var7;
					}
				} else if (var10 == 2) {
					arg0.field1162.method9115(var7);
					if (arg1.method10290(1) == 1) {
						int var13 = arg1.method10290(3);
						var8.method2686(var13, class281.field3283);
						int var14 = arg1.method10290(3);
						var8.method2686(var14, class281.field3283);
					} else {
						int var15 = arg1.method10290(3);
						var8.method2686(var15, class281.field3281);
					}
					int var16 = arg1.method10290(1);
					if (var16 == 1) {
						field470[++field469 - 1] = var7;
					}
				} else if (var10 == 3) {
					field361[++field373 - 1] = var7;
					var8.field1189 = true;
				}
			}
		}
	}

	@ObfuscatedName("op.lc(Ldr;ZLwf;B)V")
	public static final void method7567(class80 arg0, boolean arg1, class590 arg2) {
		while (true) {
			byte var3 = 16;
			int var4 = 0x1 << var3;
			if (arg2.method10311(field315.field1295) >= var3 + 12) {
				int var5 = arg2.method10290(var3);
				if (var4 - 1 != var5) {
					boolean var6 = false;
					class82 var7 = (class82) arg0.field1161.method7917((long) var5);
					if (var7 == null) {
						var7 = new class82(var5);
						arg0.field1161.method7908(var7, (long) var5);
						var6 = true;
					}
					arg0.field1162.method9115(var5);
					var7.field1189 = false;
					var7.field1054 = arg0.field1173;
					int var8 = arg2.method10290(1);
					int var9 = arg2.method10290(1);
					if (var9 == 1) {
						field470[++field469 - 1] = var5;
					}
					boolean var10 = arg2.method10290(1) == 1;
					if (var10) {
						arg2.method10290(32);
					}
					var7.field1185 = class196.method2096(arg2.method10290(14));
					int var11;
					if (arg1) {
						var11 = arg2.method10290(8);
						if (var11 > 127) {
							var11 -= 256;
						}
					} else {
						var11 = arg2.method10290(6);
						if (var11 > 31) {
							var11 -= 64;
						}
					}
					int var12 = field519[arg2.method10290(3)];
					if (var6) {
						var7.field1098 = var7.field1058 = var12;
					}
					int var13;
					if (arg1) {
						var13 = arg2.method10290(8);
						if (var13 > 127) {
							var13 -= 256;
						}
					} else {
						var13 = arg2.method10290(6);
						if (var13 > 31) {
							var13 -= 64;
						}
					}
					method4020(var7);
					if (var7.field1100 == 0) {
						var7.field1058 = 0;
					}
					var7.method2672(Statics.field95 + var11, Statics.field3225 + var13, var8 == 1);
					continue;
				}
			}
			arg2.method10291();
			return;
		}
	}

	@ObfuscatedName("og.ly(Ldr;Lwf;I)V")
	public static final void method7520(class80 arg0, class590 arg1) {
		for (int var2 = 0; var2 < field469; var2++) {
			int var3 = field470[var2];
			class82 var4 = (class82) arg0.field1161.method7917((long) var3);
			int var5 = arg1.method10339();
			if ((var5 & 0x2) != 0) {
				int var6 = arg1.method10339();
				var5 += var6 << 8;
			}
			if ((var5 & 0x800) != 0) {
				int var7 = arg1.method10339();
				var5 += var7 << 16;
			}
			if ((var5 & 0x20) != 0) {
				var4.field1083 = arg1.method10384();
				var4.field1083 += arg1.method10375() << 16;
				int var8 = 16777215;
				if (var4.field1083 == var8) {
					var4.field1083 = -1;
				}
			}
			if ((var5 & 0x400) != 0) {
				int var9 = arg1.method10339();
				if ((var9 & 0x1) == 1) {
					var4.method2683();
				} else {
					int[] var10 = null;
					if ((var9 & 0x2) == 2) {
						int var11 = arg1.method10375();
						var10 = new int[var11];
						for (int var12 = 0; var12 < var11; var12++) {
							int var13 = arg1.method10341();
							int var14 = var13 == 65535 ? -1 : var13;
							var10[var12] = var14;
						}
					}
					short[] var15 = null;
					if ((var9 & 0x4) == 4) {
						int var16 = 0;
						if (var4.field1185.field2131 != null) {
							var16 = var4.field1185.field2131.length;
						}
						var15 = new short[var16];
						for (int var17 = 0; var17 < var16; var17++) {
							var15[var17] = (short) arg1.method10341();
						}
					}
					short[] var18 = null;
					if ((var9 & 0x8) == 8) {
						int var19 = 0;
						if (var4.field1185.field2110 != null) {
							var19 = var4.field1185.field2110.length;
						}
						var18 = new short[var19];
						for (int var20 = 0; var20 < var19; var20++) {
							var18[var20] = (short) arg1.method10384();
						}
					}
					boolean var21 = false;
					if ((var9 & 0x10) != 0) {
						var21 = arg1.method10422() == 1;
					}
					long var22 = (long) (++class82.field1187 - 1);
					var4.method2681(new class195(var22, var10, var15, var18, var21));
				}
			}
			if ((var5 & 0x8) != 0) {
				arg1.method10324();
				arg1.method10563();
				arg1.method10339();
			}
			if ((var5 & 0x10) != 0) {
				var4.field1185 = class196.method2096(arg1.method10341());
				method4020(var4);
			}
			if ((var5 & 0x2000) != 0) {
				var4.field1090 = arg1.method10400();
				var4.field1092 = arg1.method10340();
				var4.field1073 = arg1.method10400();
				var4.field1085 = arg1.method10378();
				var4.field1086 = arg1.method10384() + field413;
				var4.field1095 = arg1.method10563() + field413;
				var4.field1096 = arg1.method10563();
				var4.field1101 = 0;
				var4.field1041 = 0;
				var4.field1090 += var4.field1040[0];
				var4.field1092 += var4.field1108[0];
				var4.field1073 += var4.field1040[0];
				var4.field1085 += var4.field1108[0];
			}
			if ((var5 & 0x8000) != 0) {
				var4.method2667(arg1.method10350());
			}
			if ((var5 & 0x1) != 0) {
				int var24 = arg1.method10384();
				if (var24 == 65535) {
					var24 = -1;
				}
				int var25 = arg1.method10373();
				class216 var26 = var4.field1075.method8916();
				if (var24 == var4.method2437() && var24 != -1) {
					int var27 = var26.field2490;
					if (var27 == 1) {
						var4.field1075.method8907();
						var4.field1103 = var25;
					}
					if (var27 == 2) {
						var4.field1075.method8924();
					}
				} else if (var24 == -1 || !var4.field1075.method8901() || class216.method3858(var24).field2481 >= var26.field2481) {
					var4.field1075.method8908(var24);
					var4.field1075.method8907();
					var4.field1103 = var25;
					var4.field1041 = var4.field1101;
				}
			}
			if ((var5 & 0x100) != 0) {
				var4.method2668(arg1.method10375());
			}
			if ((var5 & 0x4000) != 0) {
				int var28 = arg1.method10339();
				if ((var28 & 0x1) == 1) {
					var4.method2684();
				} else {
					int[] var29 = null;
					if ((var28 & 0x2) == 2) {
						int var30 = arg1.method10375();
						var29 = new int[var30];
						for (int var31 = 0; var31 < var30; var31++) {
							int var32 = arg1.method10384();
							int var33 = var32 == 65535 ? -1 : var32;
							var29[var31] = var33;
						}
					}
					short[] var34 = null;
					if ((var28 & 0x4) == 4) {
						int var35 = 0;
						if (var4.field1185.field2131 != null) {
							var35 = var4.field1185.field2131.length;
						}
						var34 = new short[var35];
						for (int var36 = 0; var36 < var35; var36++) {
							var34[var36] = (short) arg1.method10324();
						}
					}
					short[] var37 = null;
					if ((var28 & 0x8) == 8) {
						int var38 = 0;
						if (var4.field1185.field2110 != null) {
							var38 = var4.field1185.field2110.length;
						}
						var37 = new short[var38];
						for (int var39 = 0; var39 < var38; var39++) {
							var37[var39] = (short) arg1.method10384();
						}
					}
					boolean var40 = false;
					if ((var28 & 0x10) != 0) {
						var40 = arg1.method10375() == 1;
					}
					long var41 = (long) (++class82.field1186 - 1);
					var4.method2682(new class195(var41, var29, var34, var37, var40));
				}
			}
			if ((var5 & 0x80) != 0) {
				var4.field1076 = arg1.method10350();
				var4.field1079 = 100;
			}
			if ((var5 & 0x1000) != 0) {
				var4.field1052 = field413 + arg1.method10563();
				var4.field1053 = field413 + arg1.method10384();
				byte var43 = arg1.method10378();
				byte var44 = arg1.method10376();
				byte var45 = arg1.method10378();
				byte var46 = (byte) arg1.method10373();
				var4.field1077.method5312(var43, var44, var45, var46);
			}
			if ((var5 & 0x10000) != 0) {
				int var47 = arg1.method10436();
				var4.field1065 = (var47 & 0x1) == 0 ? var4.field1185.field2109 : arg1.method10341();
				var4.field1063 = (var47 & 0x2) == 0 ? var4.field1185.field2117 : arg1.method10563();
				var4.field1064 = (var47 & 0x4) == 0 ? var4.field1185.field2118 : arg1.method10384();
				var4.field1089 = (var47 & 0x8) == 0 ? var4.field1185.field2130 : arg1.method10563();
				var4.field1097 = (var47 & 0x10) == 0 ? var4.field1185.field2133 : arg1.method10563();
				var4.field1067 = (var47 & 0x20) == 0 ? var4.field1185.field2114 : arg1.method10324();
				var4.field1068 = (var47 & 0x40) == 0 ? var4.field1185.field2122 : arg1.method10324();
				var4.field1069 = (var47 & 0x80) == 0 ? var4.field1185.field2134 : arg1.method10324();
				var4.field1066 = (var47 & 0x100) == 0 ? var4.field1185.field2156 : arg1.method10341();
				var4.field1091 = (var47 & 0x200) == 0 ? var4.field1185.field2125 : arg1.method10384();
				var4.field1072 = (var47 & 0x400) == 0 ? var4.field1185.field2126 : arg1.method10563();
				var4.field1070 = (var47 & 0x800) == 0 ? var4.field1185.field2127 : arg1.method10324();
				var4.field1062 = (var47 & 0x1000) == 0 ? var4.field1185.field2116 : arg1.method10341();
				var4.field1106 = (var47 & 0x2000) == 0 ? var4.field1185.field2123 : arg1.method10341();
				var4.field1061 = (var47 & 0x4000) == 0 ? var4.field1185.field2115 : arg1.method10563();
			}
			if ((var5 & 0x4) != 0) {
				int var48 = arg1.method10373();
				if (var48 > 0) {
					for (int var49 = 0; var49 < var48; var49++) {
						int var50 = -1;
						int var51 = -1;
						int var52 = -1;
						int var53 = arg1.method10355();
						if (var53 == 32767) {
							var53 = arg1.method10355();
							var51 = arg1.method10355();
							var50 = arg1.method10355();
							var52 = arg1.method10355();
						} else if (var53 == 32766) {
							var53 = -1;
						} else {
							var51 = arg1.method10355();
						}
						int var54 = arg1.method10355();
						var4.method2386(var53, var51, var50, var52, field413, var54);
					}
				}
				int var55 = arg1.method10339();
				if (var55 > 0) {
					for (int var56 = 0; var56 < var55; var56++) {
						int var57 = arg1.method10355();
						int var58 = arg1.method10355();
						if (var58 == 32767) {
							var4.method2388(var57);
						} else {
							int var59 = arg1.method10355();
							int var60 = arg1.method10375();
							int var61 = var58 > 0 ? arg1.method10375() : var60;
							var4.method2408(var57, field413, var58, var59, var60, var61);
						}
					}
				}
			}
			if ((var5 & 0x200) != 0) {
				var4.field1107 = arg1.method10436();
			}
			if ((var5 & 0x80000) != 0) {
				int var62 = arg1.method10422();
				for (int var63 = 0; var63 < var62; var63++) {
					int var64 = arg1.method10422();
					int var65 = arg1.method10563();
					int var66 = arg1.method10395();
					var4.method2406(var64, var65, var66 >> 16, var66 & 0xFFFF);
				}
			}
			if ((var5 & 0x40) != 0) {
				arg1.method10324();
				arg1.method10397();
			}
			if ((var5 & 0x40000) != 0) {
				int var67 = arg1.method10422();
				if (var67 == 0) {
					var4.method2702();
				} else {
					int[] var68 = new int[8];
					short[] var69 = new short[8];
					for (int var70 = 0; var70 < 8; var70++) {
						if ((var67 & 0x1 << var70) == 0) {
							var68[var70] = -1;
							var69[var70] = -1;
						} else {
							var68[var70] = arg1.method10365();
							var69[var70] = (short) arg1.method10356();
						}
					}
					var4.method2678(var68, var69);
				}
			}
			if ((var5 & 0x20000) != 0) {
				var4.field1050 = arg1.method10341();
				var4.field1051 = arg1.method10339() == 1;
			}
		}
	}

	@ObfuscatedName("hp.lg(Ldt;B)V")
	public static void method4020(class82 arg0) {
		arg0.field1060 = arg0.field1185.field2112;
		arg0.field1100 = arg0.field1185.field2141;
		arg0.field1064 = arg0.field1185.field2118;
		arg0.field1089 = arg0.field1185.field2130;
		arg0.field1097 = arg0.field1185.field2133;
		arg0.field1067 = arg0.field1185.field2114;
		arg0.field1061 = arg0.field1185.field2115;
		arg0.field1065 = arg0.field1185.field2109;
		arg0.field1063 = arg0.field1185.field2117;
		arg0.field1068 = arg0.field1185.field2122;
		arg0.field1069 = arg0.field1185.field2134;
		arg0.field1066 = arg0.field1185.field2156;
		arg0.field1091 = arg0.field1185.field2125;
		arg0.field1072 = arg0.field1185.field2126;
		arg0.field1070 = arg0.field1185.field2127;
		arg0.field1062 = arg0.field1185.field2116;
		arg0.field1106 = arg0.field1185.field2123;
	}

	@ObfuscatedName("pb.li(III)Lkc;")
	public static class278 method7634(int arg0, int arg1) {
		field324.field3261 = arg0;
		field324.field3258 = arg1;
		field324.field3259 = 1;
		field324.field3260 = 1;
		return field324;
	}

	@ObfuscatedName("oi.lx(I)V")
	public static void method7489() {
		field523.field6053 = 0;
		field522 = false;
	}

	@ObfuscatedName("ar.lh(B)V")
	public static void method181() {
		method7489();
		field523.field6061[0] = -1;
		field523.field6057[0] = class394.field4784;
		field523.field6063[0] = "";
		field523.field6056[0] = 1006;
		field523.field6052[0] = false;
		field523.field6062[0] = null;
		field523.field6053 = 1;
	}

	@ObfuscatedName("gj.lv(I)Z")
	public static final boolean method3686() {
		return field522;
	}

	@ObfuscatedName("kc.ln(IIIII)V")
	public static final void method5794(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < field564; var4++) {
			if (field571[var4] + field569[var4] > arg0 && field569[var4] < arg0 + arg2 && field614[var4] + field468[var4] > arg1 && field468[var4] < arg1 + arg3) {
				field437[var4] = true;
			}
		}
	}

	@ObfuscatedName("ai.lm(IIIII)V")
	public static final void method98(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < field564; var4++) {
			if (field571[var4] + field569[var4] > arg0 && field569[var4] < arg0 + arg2 && field614[var4] + field468[var4] > arg1 && field468[var4] < arg1 + arg3) {
				field567[var4] = true;
			}
		}
	}

	@ObfuscatedName("rr.lr(II)Z")
	public static final boolean method8553(int arg0) {
		if (arg0 >= 2000) {
			arg0 -= 2000;
		}
		return arg0 == 1007;
	}

	@ObfuscatedName("sd.ls(IIIIIILjava/lang/String;Ljava/lang/String;III)V")
	public static final void method9046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8, int arg9) {
		class80 var10 = field334.method2311(arg5);
		if (var10 == null) {
			return;
		}
		int var11 = var10.field1165;
		int var12 = var10.field1166;
		class425 var13 = var10.field1161;
		class425 var14 = var10.field1170;
		if (arg2 >= 2000) {
			arg2 -= 2000;
		}
		if (arg2 == 44) {
			class70 var15 = (class70) var14.method7917((long) arg3);
			if (var15 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var16 = class330.method3456(class328.field3591, field315.field1309);
				var16.field3665.method10379(arg3);
				var16.field3665.method10371(field552.method5701(82) ? 1 : 0);
				field315.method2874(var16);
			}
		}
		if (arg2 == 50) {
			class70 var17 = (class70) var14.method7917((long) arg3);
			if (var17 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var18 = class330.method3456(class328.field3557, field315.field1309);
				var18.field3665.method10321(arg3);
				var18.field3665.method10372(field552.method5701(82) ? 1 : 0);
				field315.method2874(var18);
			}
		}
		if (arg2 == 13) {
			class82 var19 = (class82) var13.method7917((long) arg3);
			if (var19 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var20 = class330.method3456(class328.field3590, field315.field1309);
				var20.field3665.method10321(arg3);
				var20.field3665.method10371(field552.method5701(82) ? 1 : 0);
				field315.method2874(var20);
			}
		}
		if (arg2 == 58) {
			class370 var21 = Statics.field1555.method6864(arg1, arg0);
			if (var21 != null) {
				if (var21.field4303 != null) {
					class66 var22 = new class66();
					var22.field894 = var21;
					var22.field892 = arg3;
					var22.field902 = arg7;
					var22.field899 = var21.field4303;
					class47.method6482(var22);
				}
				class330 var23 = class330.method3456(class328.field3558, field315.field1309);
				var23.field3665.method10466(field531);
				var23.field3665.method10392(arg1);
				var23.field3665.method10381(arg4);
				var23.field3665.method10381(arg0);
				var23.field3665.method10547(Statics.field5117);
				var23.field3665.method10321(field408);
				field315.method2874(var23);
			}
		}
		if (arg2 == 48) {
			class70 var24 = (class70) var14.method7917((long) arg3);
			if (var24 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var25 = class330.method3456(class328.field3581, field315.field1309);
				var25.field3665.method10381(arg3);
				var25.field3665.method10371(field552.method5701(82) ? 1 : 0);
				field315.method2874(var25);
			}
		}
		if (arg2 == 61) {
			class506 var26 = (class506) var10.field1172.method7946((long) arg3);
			if (var26 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var27 = class330.method3456(class328.field3601, field315.field1309);
				var27.field3665.method10381(arg3);
				var27.field3665.method10370(field552.method5701(82) ? 1 : 0);
				var27.field3665.method10393(Statics.field3538);
				var27.field3665.method10381(Statics.field2801);
				var27.field3665.method10381(Statics.field241);
				field315.method2874(var27);
			}
		}
		if (arg2 == 63) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var28 = class330.method3456(class328.field3568, field315.field1309);
			var28.field3665.method10372(field552.method5701(82) ? 1 : 0);
			var28.field3665.method10321(arg3);
			field315.method2874(var28);
		}
		if (arg2 == 29) {
			class330 var29 = class330.method3456(class328.field3589, field315.field1309);
			var29.field3665.method10547(arg1);
			field315.method2874(var29);
			class370 var30 = Statics.field1555.method6863(arg1);
			if (var30 != null && var30.field4275 != null && var30.field4275[0][0] == 5) {
				int var31 = var30.field4275[0][1];
				if (Statics.field4023[var31] != var30.field4192[0]) {
					Statics.field4023[var31] = var30.field4192[0];
					method7512(var31);
				}
			}
		}
		if (arg2 == 8) {
			class82 var32 = (class82) var13.method7917((long) arg3);
			if (var32 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var33 = class330.method3456(class328.field3598, field315.field1309);
				var33.field3665.method10381(field408);
				var33.field3665.method10381(field531);
				var33.field3665.method10370(field552.method5701(82) ? 1 : 0);
				var33.field3665.method10321(arg3);
				var33.field3665.method10547(Statics.field5117);
				field315.method2874(var33);
			}
		}
		if (arg2 == 1013) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			class330 var34 = class330.method3456(class328.field3629, field315.field1309);
			var34.field3665.method10379(arg3);
			field315.method2874(var34);
		}
		if (arg2 == 46) {
			class70 var35 = (class70) var14.method7917((long) arg3);
			if (var35 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var36 = class330.method3456(class328.field3602, field315.field1309);
				var36.field3665.method10370(field552.method5701(82) ? 1 : 0);
				var36.field3665.method10381(arg3);
				field315.method2874(var36);
			}
		}
		if (arg2 == 1003) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			class82 var37 = (class82) var13.method7917((long) arg3);
			if (var37 != null) {
				class196 var38 = var37.field1185;
				if (var38.field2100 != null) {
					var38 = var38.method4066();
				}
				if (var38 != null) {
					class330 var39 = class330.method3456(class328.field3624, field315.field1309);
					var39.field3665.method10321(var38.field2108);
					field315.method2874(var39);
				}
			}
		}
		if (arg2 == 62) {
			class506 var40 = (class506) var10.field1172.method7946((long) arg3);
			if (var40 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var41 = class330.method3456(class328.field3582, field315.field1309);
				var41.field3665.method10379(field531);
				var41.field3665.method10377(Statics.field5117);
				var41.field3665.method10381(arg3);
				var41.field3665.method10320(field552.method5701(82) ? 1 : 0);
				var41.field3665.method10381(field408);
				field315.method2874(var41);
			}
		}
		if (arg2 == 23) {
			if (field522) {
				var10.field1160.method4830();
			} else {
				var10.field1160.method4991(true);
			}
		}
		if (arg2 == 6) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var42 = class330.method3456(class328.field3599, field315.field1309);
			var42.field3665.method10320(field552.method5701(82) ? 1 : 0);
			var42.field3665.method10321(arg0 + var11);
			var42.field3665.method10321(arg1 + var12);
			var42.field3665.method10466(arg3);
			field315.method2874(var42);
		}
		if (arg2 == 1001) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var43 = class330.method3456(class328.field3630, field315.field1309);
			var43.field3665.method10321(arg0 + var11);
			var43.field3665.method10466(arg1 + var12);
			var43.field3665.method10321(arg3);
			var43.field3665.method10370(field552.method5701(82) ? 1 : 0);
			field315.method2874(var43);
		}
		if (arg2 == 57 || arg2 == 1007) {
			class370 var44 = Statics.field1555.method6864(arg1, arg0);
			if (var44 != null) {
				method6373(arg3, arg1, arg0, arg4, arg7);
			}
		}
		if (arg2 == 66) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var45 = class330.method3456(class328.field3596, field315.field1309);
			var45.field3665.method10466(arg3);
			var45.field3665.method10320(field552.method5701(82) ? 1 : 0);
			field315.method2874(var45);
		}
		if (arg2 == 18) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var46 = class330.method3456(class328.field3546, field315.field1309);
			var46.field3665.method10320(field552.method5701(82) ? 1 : 0);
			var46.field3665.method10381(arg3);
			var46.field3665.method10321(arg0 + var11);
			var46.field3665.method10321(arg1 + var12);
			field315.method2874(var46);
		}
		if (arg2 == 4) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var47 = class330.method3456(class328.field3597, field315.field1309);
			var47.field3665.method10370(field552.method5701(82) ? 1 : 0);
			var47.field3665.method10321(arg0 + var11);
			var47.field3665.method10466(arg3);
			var47.field3665.method10321(arg1 + var12);
			field315.method2874(var47);
		}
		if (arg2 == 67) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var48 = class330.method3456(class328.field3562, field315.field1309);
			var48.field3665.method10381(arg3);
			var48.field3665.method10371(field552.method5701(82) ? 1 : 0);
			field315.method2874(var48);
		}
		if (arg2 == 19) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var49 = class330.method3456(class328.field3572, field315.field1309);
			var49.field3665.method10371(field552.method5701(82) ? 1 : 0);
			var49.field3665.method10321(arg0 + var11);
			var49.field3665.method10321(arg1 + var12);
			var49.field3665.method10466(arg3);
			field315.method2874(var49);
		}
		if (arg2 == 22) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var50 = class330.method3456(class328.field3547, field315.field1309);
			var50.field3665.method10381(arg1 + var12);
			var50.field3665.method10372(field552.method5701(82) ? 1 : 0);
			var50.field3665.method10321(arg3);
			var50.field3665.method10466(arg0 + var11);
			field315.method2874(var50);
		}
		if (arg2 == 47) {
			class70 var51 = (class70) var14.method7917((long) arg3);
			if (var51 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var52 = class330.method3456(class328.field3615, field315.field1309);
				var52.field3665.method10321(arg3);
				var52.field3665.method10320(field552.method5701(82) ? 1 : 0);
				field315.method2874(var52);
			}
		}
		if (arg2 == 7) {
			class82 var53 = (class82) var13.method7917((long) arg3);
			if (var53 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var54 = class330.method3456(class328.field3623, field315.field1309);
				var54.field3665.method10547(Statics.field3538);
				var54.field3665.method10321(Statics.field2801);
				var54.field3665.method10370(field552.method5701(82) ? 1 : 0);
				var54.field3665.method10466(Statics.field241);
				var54.field3665.method10379(arg3);
				field315.method2874(var54);
			}
		}
		if (arg2 == 1) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var55 = class330.method3456(class328.field3614, field315.field1309);
			var55.field3665.method10371(field552.method5701(82) ? 1 : 0);
			var55.field3665.method10466(arg0 + var11);
			var55.field3665.method10377(Statics.field3538);
			var55.field3665.method10379(Statics.field241);
			var55.field3665.method10321(arg3);
			var55.field3665.method10381(Statics.field2801);
			var55.field3665.method10381(arg1 + var12);
			field315.method2874(var55);
		}
		if (arg2 == 5) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var56 = class330.method3456(class328.field3600, field315.field1309);
			var56.field3665.method10321(arg1 + var12);
			var56.field3665.method10379(arg3);
			var56.field3665.method10321(arg0 + var11);
			var56.field3665.method10370(field552.method5701(82) ? 1 : 0);
			field315.method2874(var56);
		}
		if (arg2 == 49) {
			class70 var57 = (class70) var14.method7917((long) arg3);
			if (var57 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var58 = class330.method3456(class328.field3559, field315.field1309);
				var58.field3665.method10466(arg3);
				var58.field3665.method10320(field552.method5701(82) ? 1 : 0);
				field315.method2874(var58);
			}
		}
		if (arg2 == 16) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var59 = class330.method3456(class328.field3567, field315.field1309);
			var59.field3665.method10381(arg3);
			var59.field3665.method10392(Statics.field3538);
			var59.field3665.method10370(field552.method5701(82) ? 1 : 0);
			var59.field3665.method10379(Statics.field241);
			var59.field3665.method10321(Statics.field2801);
			var59.field3665.method10379(arg1 + var12);
			var59.field3665.method10321(arg0 + var11);
			field315.method2874(var59);
		}
		if (arg2 == 65) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var60 = class330.method3456(class328.field3543, field315.field1309);
			var60.field3665.method10381(arg3);
			var60.field3665.method10320(field552.method5701(82) ? 1 : 0);
			field315.method2874(var60);
		}
		if (arg2 == 60) {
			field506 = arg8;
			field507 = arg9;
			field509 = 1;
			field486 = 0;
			field584 = arg3;
			field585 = 30;
			class330 var61 = class330.method3456(class328.field3620, field315.field1309);
			var61.field3665.method10370(arg3);
			field315.method2874(var61);
		}
		if (arg2 == 1002) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			class330 var62 = class330.method3456(class328.field3570, field315.field1309);
			var62.field3665.method10379(arg3);
			field315.method2874(var62);
		}
		if (arg2 == 3) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var63 = class330.method3456(class328.field3638, field315.field1309);
			var63.field3665.method10466(arg1 + var12);
			var63.field3665.method10321(arg0 + var11);
			var63.field3665.method10372(field552.method5701(82) ? 1 : 0);
			var63.field3665.method10379(arg3);
			field315.method2874(var63);
		}
		if (arg2 == 9) {
			class82 var64 = (class82) var13.method7917((long) arg3);
			if (var64 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var65 = class330.method3456(class328.field3594, field315.field1309);
				var65.field3665.method10466(arg3);
				var65.field3665.method10372(field552.method5701(82) ? 1 : 0);
				field315.method2874(var65);
			}
		}
		if (arg2 == 2) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var66 = class330.method3456(class328.field3542, field315.field1309);
			var66.field3665.method10321(field531);
			var66.field3665.method10320(field552.method5701(82) ? 1 : 0);
			var66.field3665.method10321(field408);
			var66.field3665.method10547(Statics.field5117);
			var66.field3665.method10466(arg0 + var11);
			var66.field3665.method10466(arg1 + var12);
			var66.field3665.method10321(arg3);
			field315.method2874(var66);
		}
		if (arg2 == 15) {
			class70 var67 = (class70) var14.method7917((long) arg3);
			if (var67 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var68 = class330.method3456(class328.field3610, field315.field1309);
				var68.field3665.method10372(field552.method5701(82) ? 1 : 0);
				var68.field3665.method10466(field531);
				var68.field3665.method10381(field408);
				var68.field3665.method10381(arg3);
				var68.field3665.method10392(Statics.field5117);
				field315.method2874(var68);
			}
		}
		if (arg2 == 1004) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			class330 var69 = class330.method3456(class328.field3619, field315.field1309);
			var69.field3665.method10321(arg1 + var12);
			var69.field3665.method10379(arg0 + var11);
			var69.field3665.method10381(arg3);
			field315.method2874(var69);
		}
		if (arg2 == 14) {
			class70 var70 = (class70) var14.method7917((long) arg3);
			if (var70 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var71 = class330.method3456(class328.field3564, field315.field1309);
				var71.field3665.method10381(Statics.field2801);
				var71.field3665.method10377(Statics.field3538);
				var71.field3665.method10381(arg3);
				var71.field3665.method10372(field552.method5701(82) ? 1 : 0);
				var71.field3665.method10466(Statics.field241);
				field315.method2874(var71);
			}
		}
		if (arg2 == 28) {
			class330 var72 = class330.method3456(class328.field3589, field315.field1309);
			var72.field3665.method10547(arg1);
			field315.method2874(var72);
			class370 var73 = Statics.field1555.method6863(arg1);
			if (var73 != null && var73.field4275 != null && var73.field4275[0][0] == 5) {
				int var74 = var73.field4275[0][1];
				Statics.field4023[var74] = 1 - Statics.field4023[var74];
				method7512(var74);
			}
		}
		if (arg2 == 10) {
			class82 var75 = (class82) var13.method7917((long) arg3);
			if (var75 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var76 = class330.method3456(class328.field3616, field315.field1309);
				var76.field3665.method10466(arg3);
				var76.field3665.method10371(field552.method5701(82) ? 1 : 0);
				field315.method2874(var76);
			}
		}
		if (arg2 == 45) {
			class70 var77 = (class70) var14.method7917((long) arg3);
			if (var77 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var78 = class330.method3456(class328.field3566, field315.field1309);
				var78.field3665.method10321(arg3);
				var78.field3665.method10370(field552.method5701(82) ? 1 : 0);
				field315.method2874(var78);
			}
		}
		if (arg2 == 21) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var79 = class330.method3456(class328.field3544, field315.field1309);
			var79.field3665.method10381(arg3);
			var79.field3665.method10321(arg0 + var11);
			var79.field3665.method10321(arg1 + var12);
			var79.field3665.method10320(field552.method5701(82) ? 1 : 0);
			field315.method2874(var79);
		}
		if (arg2 == 20) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var80 = class330.method3456(class328.field3642, field315.field1309);
			var80.field3665.method10379(arg0 + var11);
			var80.field3665.method10370(field552.method5701(82) ? 1 : 0);
			var80.field3665.method10381(arg3);
			var80.field3665.method10466(arg1 + var12);
			field315.method2874(var80);
		}
		if (arg2 == 17) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var81 = class330.method3456(class328.field3563, field315.field1309);
			var81.field3665.method10381(field531);
			var81.field3665.method10547(Statics.field5117);
			var81.field3665.method10381(arg3);
			var81.field3665.method10371(field552.method5701(82) ? 1 : 0);
			var81.field3665.method10381(field408);
			var81.field3665.method10321(arg1 + var12);
			var81.field3665.method10379(arg0 + var11);
			field315.method2874(var81);
		}
		if (arg2 == 12) {
			class82 var82 = (class82) var13.method7917((long) arg3);
			if (var82 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var83 = class330.method3456(class328.field3632, field315.field1309);
				var83.field3665.method10372(field552.method5701(82) ? 1 : 0);
				var83.field3665.method10466(arg3);
				field315.method2874(var83);
			}
		}
		if (arg2 == 24) {
			class370 var84 = Statics.field1555.method6863(arg1);
			if (var84 != null) {
				boolean var85 = true;
				if (var84.field4169 > 0) {
					var85 = method6788(var84);
				}
				if (var85) {
					class330 var86 = class330.method3456(class328.field3589, field315.field1309);
					var86.field3665.method10547(arg1);
					field315.method2874(var86);
				}
			}
		}
		if (arg2 == 11) {
			class82 var87 = (class82) var13.method7917((long) arg3);
			if (var87 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var88 = class330.method3456(class328.field3634, field315.field1309);
				var88.field3665.method10379(arg3);
				var88.field3665.method10372(field552.method5701(82) ? 1 : 0);
				field315.method2874(var88);
			}
		}
		if (arg2 == 51) {
			class70 var89 = (class70) var14.method7917((long) arg3);
			if (var89 != null) {
				field506 = arg8;
				field507 = arg9;
				field509 = 2;
				field486 = 0;
				field582 = arg0;
				field532 = arg1;
				class330 var90 = class330.method3456(class328.field3571, field315.field1309);
				var90.field3665.method10371(field552.method5701(82) ? 1 : 0);
				var90.field3665.method10381(arg3);
				field315.method2874(var90);
			}
		}
		if (arg2 == 30 && field565 == null) {
			method3333(arg1, arg0);
			field565 = Statics.field1555.method6864(arg1, arg0);
			method2809(field565);
		}
		if (arg2 == 26) {
			method99();
		}
		if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
			Statics.field817.method9903(arg2, arg3, new class357(arg0), new class357(arg1));
		}
		if (arg2 == 25) {
			class370 var91 = Statics.field1555.method6864(arg1, arg0);
			if (var91 != null) {
				method7628();
				method762(arg1, arg0, Statics.method9749(method7519(var91)), arg4);
				field358 = 0;
				field375 = method5927(var91);
				if (field375 == null) {
					field375 = class394.field4507;
				}
				if (var91.field4144) {
					field534 = var91.field4228 + class83.method3480(16777215);
				} else {
					field534 = class83.method3480(65280) + var91.field4299 + class83.method3480(16777215);
				}
			}
			return;
		}
		if (arg2 == 64) {
			field506 = arg8;
			field507 = arg9;
			field509 = 2;
			field486 = 0;
			field582 = arg0;
			field532 = arg1;
			class330 var92 = class330.method3456(class328.field3575, field315.field1309);
			var92.field3665.method10371(field552.method5701(82) ? 1 : 0);
			var92.field3665.method10381(arg3);
			field315.method2874(var92);
		}
		if (field358 != 0) {
			field358 = 0;
			method2809(Statics.field1555.method6863(Statics.field3538));
		}
		if (field530) {
			method7628();
		}
	}

	@ObfuscatedName("ld.lj(ILjava/lang/String;I)V")
	public static void method6340(int arg0, String arg1) {
		int var2 = field336.field1255;
		int[] var3 = field336.field1244;
		boolean var4 = false;
		class614 var5 = new class614(arg1, Statics.field1293);
		class80 var6 = Statics.field1109.method2422();
		if (var6 == null) {
			class92.method2825(4, "", class394.field4738 + arg1 + ", current world null.");
			return;
		}
		for (int var7 = 0; var7 < var2; var7++) {
			class70 var8 = (class70) var6.field1170.method7917((long) var3[var7]);
			if (var8 != null && Statics.field1109 != var8 && var8.field935 != null && var8.field935.equals(var5)) {
				if (arg0 == 1) {
					class330 var9 = class330.method3456(class328.field3591, field315.field1309);
					var9.field3665.method10379(var3[var7]);
					var9.field3665.method10371(0);
					field315.method2874(var9);
				} else if (arg0 == 4) {
					class330 var10 = class330.method3456(class328.field3615, field315.field1309);
					var10.field3665.method10321(var3[var7]);
					var10.field3665.method10320(0);
					field315.method2874(var10);
				} else if (arg0 == 6) {
					class330 var11 = class330.method3456(class328.field3559, field315.field1309);
					var11.field3665.method10466(var3[var7]);
					var11.field3665.method10320(0);
					field315.method2874(var11);
				} else if (arg0 == 7) {
					class330 var12 = class330.method3456(class328.field3557, field315.field1309);
					var12.field3665.method10321(var3[var7]);
					var12.field3665.method10372(0);
					field315.method2874(var12);
				}
				var4 = true;
				break;
			}
		}
		if (!var4) {
			class92.method2825(4, "", class394.field4738 + arg1);
		}
	}

	@ObfuscatedName("bz.lp(IIIIB)V")
	public static void method762(int arg0, int arg1, int arg2, int arg3) {
		class370 var4 = Statics.field1555.method6864(arg0, arg1);
		if (var4 != null && var4.field4248 != null) {
			class66 var5 = new class66();
			var5.field894 = var4;
			var5.field899 = var4.field4248;
			class47.method6482(var5);
		}
		field408 = arg3;
		field530 = true;
		Statics.field5117 = arg0;
		field531 = arg1;
		Statics.field3866 = arg2;
		method2809(var4);
	}

	@ObfuscatedName("pa.lu(I)V")
	public static void method7628() {
		if (!field530) {
			return;
		}
		class370 var0 = Statics.field1555.method6864(Statics.field5117, field531);
		if (var0 != null && var0.field4190 != null) {
			class66 var1 = new class66();
			var1.field894 = var0;
			var1.field899 = var0.field4190;
			class47.method6482(var1);
		}
		field408 = -1;
		field530 = false;
		method2809(var0);
	}

	@ObfuscatedName("ed.ld(IIB)V")
	public static void method3333(int arg0, int arg1) {
		class330 var2 = class330.method3456(class328.field3626, field315.field1309);
		var2.field3665.method10381(arg1);
		var2.field3665.method10392(arg0);
		field315.method2874(var2);
	}

	@ObfuscatedName("lt.le(IIIILjava/lang/String;B)V")
	public static void method6373(int arg0, int arg1, int arg2, int arg3, String arg4) {
		int var5 = arg0 >>> 16;
		int var6 = arg0 & 0xFFFF;
		class370 var7 = Statics.field1555.method6864(arg1, arg2);
		if (var7 == null) {
			return;
		}
		if (var7.field4257 != null) {
			class66 var8 = new class66();
			var8.field894 = var7;
			var8.field892 = var6;
			var8.field898 = var5;
			var8.field902 = arg4;
			var8.field899 = var7.field4257;
			class47.method6482(var8);
		}
		boolean var9 = true;
		if (var7.field4169 > 0) {
			var9 = method6788(var7);
		}
		if (!var9 || !class371.method3915(method7572(var7), var6 - 1)) {
			return;
		}
		if (var5 == 0) {
			class330 var10 = class330.method3456(class328.field3550, field315.field1309);
			var10.field3665.method10547(arg1);
			var10.field3665.method10321(arg2);
			var10.field3665.method10321(arg3);
			var10.field3665.method10320(var6);
			field315.method2874(var10);
			return;
		}
		class330 var11 = class330.method3456(class328.field3641, field315.field1309);
		var11.field3665.method10547(arg1);
		var11.field3665.method10321(arg2);
		var11.field3665.method10321(arg3);
		var11.field3665.method10320(var6);
		var11.field3665.method10320(var5 - 1);
		field315.method2874(var11);
	}

	@ObfuscatedName("ix.lk(IIII[Ljava/lang/Object;I)V")
	public static void method5048(int arg0, int arg1, int arg2, int arg3, Object[] arg4) {
		boolean var5 = false;
		class370 var6 = Statics.field1555.method6864(arg0, arg1);
		if (!var5 && var6 == null) {
			return;
		}
		if (!var5) {
			int var7 = method7519(var6);
			boolean var8 = (var7 >> 23 & 0x1) != 0;
			if (!var8) {
				return;
			}
		}
		class330 var9 = class330.method3456(class328.field3580, field315.field1309);
		var9.field3665.method10321(0);
		int var10 = var9.field3665.field5920;
		var9.field3665.method10392(arg3);
		var9.field3665.method10547(arg0);
		var9.field3665.method10379(arg2);
		var9.field3665.method10466(arg1);
		Object[] var11 = arg4;
		for (int var12 = 0; var12 < var11.length; var12++) {
			Object var13 = var11[var12];
			if (var13 instanceof Integer) {
				var9.field3665.method10584((Integer) var13);
			} else if (var13 instanceof String) {
				var9.field3665.method10504((String) var13);
			} else if (var13 instanceof class520) {
				class520 var14 = (class520) var13;
				int var15 = var14.method9545();
				var9.field3665.method10335(var15);
				if (class575.field5821 == var14.field5505) {
					int[] var16 = var14.method9541();
					for (int var17 = 0; var17 < var15; var17++) {
						var9.field3665.method10584(var16[var17]);
					}
				} else {
					Object[] var18 = var14.method9544();
					for (int var19 = 0; var19 < var15; var19++) {
						var9.field3665.method10504((String) var18[var19]);
					}
				}
			} else if (var13 == null) {
				var9.field3665.method10320(0);
			}
		}
		var9.field3665.method10333(var9.field3665.field5920 - var10);
		field315.method2874(var9);
	}

	@ObfuscatedName("lp.lz(III)V")
	public static final void method6328(int arg0, int arg1) {
		int[] var2 = new int[field334.method2310()];
		float[] var3 = new float[field334.method2310()];
		int var4 = 0;
		Iterator var5 = field334.iterator();
		while (var5.hasNext()) {
			class80 var6 = (class80) var5.next();
			var2[var4] = var6.field1173;
			var3[var4] = var6.field1160.field2720;
			var4++;
		}
		class582.method6190(var3, var2);
		HashMap var7 = new HashMap();
		for (int var8 = var2.length - 1; var8 >= 0; var8--) {
			if (var3[var8] > 0.0F || var2[var8] == -1) {
				class519 var9 = field334.method2313(var2[var8]);
				if (!var7.containsKey(var9)) {
					var7.put(var9, var2[var8]);
				}
			}
		}
		for (int var10 = 0; var10 < var2.length; var10++) {
			int var11 = var2[var10];
			class519 var12 = field334.method2313(var11);
			Integer var13 = (Integer) var7.get(var12);
			if (var13 != null && var13.equals(var11)) {
				if (class519.field5494 == var12) {
					method7896(class394.field4650, "", 23, 0, arg0, arg1, 0, false, var11);
				} else if (class519.field5495 == var12) {
					int var14 = field314 / 2;
					int var15 = field379 / 2;
					int var16 = field380;
					class453 var17 = class243.method4260(Statics.field3837.field1160, field513, Statics.field2053, Statics.field1941, Statics.field47, var14, var15, var16);
					if (var17 != null) {
						class453 var18 = class453.method6269((float) field553, (float) field513, (float) field338);
						class453 var19 = class453.method6495(var17);
						var19.method8396(var18);
						class453 var22 = class453.method7886(class453.field5171, var19);
						float var23 = (float) Math.atan2((double) Statics.method2374(var22, class453.field5175), (double) Statics.method2374(class453.field5171, var19));
						int var24 = (int) ((double) var23 / 6.283185307179586D * 2048.0D) & 0x7FF;
						int var26 = var24 + 64;
						int var27 = (var26 & 0x7FF) / 128;
						method7896(class394.field4701, "", 60, var27, 0, 0, 0, false, var11);
						var18.method8336();
						var19.method8336();
						var22.method8336();
						var17.method8336();
					}
				}
			}
		}
	}

	@ObfuscatedName("fw.lq(Ljava/lang/String;Ljava/lang/String;IIIII)I")
	public static final int method3654(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		return method7896(arg0, arg1, arg2, arg3, arg4, arg5, -1, false, -1);
	}

	@ObfuscatedName("lf.lt(Ljava/lang/String;Ljava/lang/String;IIIIII)I")
	public static final int method5926(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		return method7896(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false, -1);
	}

	@ObfuscatedName("qv.mv(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
	public static final int method7896(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		if (field522) {
			return -1;
		} else if (method1562(arg8, arg2)) {
			return field523.method10992(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			return -1;
		}
	}

	@ObfuscatedName("pa.mp(ILjava/lang/String;Ljava/lang/String;IIIIIII)V")
	public static final void method7605(int arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (!field522 && (method1562(arg8, arg3) && (arg0 >= 0 && arg0 < field523.field6062.length))) {
			if (field523.field6062[arg0] == null) {
				field523.field6062[arg0] = new class611(false);
			}
			field523.field6062[arg0].method10992(arg1, arg2, arg3, arg4, arg5, arg6, arg7, false, arg8);
		}
	}

	@ObfuscatedName("br.mc(III)Z")
	public static boolean method1562(int arg0, int arg1) {
		if (arg1 >= 2000) {
			arg1 -= 2000;
		}
		class517 var2 = field334.method2339(arg0);
		class506 var3 = (class506) field334.method2304().field1172.method7946((long) arg0);
		boolean var4 = arg0 == -1;
		boolean var5 = field347 == arg0;
		boolean var6 = false;
		if (var3 != null) {
			var6 = var3.method9344() != class395.field4797;
			if (!var5) {
				class381 var7 = var3.field5426.method4156();
				if (class64.method3659(arg1) && !var7.field4373) {
					return false;
				}
				boolean var8 = arg1 == 1 || arg1 == 2 || arg1 >= 3 && arg1 <= 6 || arg1 == 1001;
				boolean var9 = var8 || class64.method213(arg1);
				if (!var9) {
					boolean var10 = arg1 == 16 || arg1 == 17 || arg1 >= 18 && arg1 <= 22;
					var9 = var10;
				}
				boolean var11 = var9;
				if (!var9) {
					boolean var12 = arg1 >= 61 && arg1 <= 67;
					var11 = var12;
				}
				if (var11 && !var7.field4378) {
					return false;
				}
			}
		}
		boolean var14 = arg1 == 1 || arg1 == 2 || arg1 >= 3 && arg1 <= 6 || arg1 == 1001;
		if (var14 && !var2.method9504(var6, var4, var5)) {
			return false;
		}
		boolean var15 = arg1 == 16 || arg1 == 17 || arg1 >= 18 && arg1 <= 22;
		if (var15 && !var2.method9505(var6, var4, var5)) {
			return false;
		} else if (class64.method213(arg1) && !var2.method9506(var6, var4, var5)) {
			return false;
		} else {
			boolean var16 = arg1 == 14 || arg1 == 15 || arg1 >= 44 && arg1 <= 51;
			if (var16 && !var2.method9507(var6, var4, var5)) {
				return false;
			} else if (arg1 == 1002 && !var2.method9511(var6, var4, var5)) {
				return false;
			} else if (arg1 == 1004 && !var2.method9508(var6, var4, var5)) {
				return false;
			} else {
				return arg1 != 1003 || var2.method9509(var6, var4, var5);
			}
		}
	}

	@ObfuscatedName("gz.mk(S)I")
	public static final int method3680() {
		return field523.field6053 - 1;
	}

	@ObfuscatedName("cl.ml(IIIII)V")
	public static final void method2125(int arg0, int arg1, int arg2, int arg3) {
		if (field358 == 0 && !field530) {
			method6328(arg0 - arg2, arg1 - arg3);
		}
		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;
		while (true) {
			int var11 = class243.field2968;
			if (var9 >= var11) {
				if (var4 != -1L) {
					int var12 = (int) (var4 >>> 0 & 0x7FL);
					int var14 = class243.method3592(var4);
					class70 var15 = (class70) Statics.field3837.field1170.method7917((long) field520);
					method3381(var15, field520, var12, var14, var6);
				}
				return;
			}
			long var16 = class243.field2969[var9];
			if (var7 != var16) {
				label434: {
					var7 = var16;
					int var20 = class243.method4212(var9);
					int var21 = class243.method3592(class243.field2969[var9]);
					int var22 = var21;
					int var23 = class243.method8523(var9);
					int var24 = class243.method4434(var9);
					int var25 = Statics.method3406(var9);
					Object var26 = null;
					class80 var27 = null;
					class506 var28 = (class506) Statics.field3837.field1172.method7946((long) var25);
					if (var25 >= 0 && var28 != null) {
						if (var28.method9340()) {
							break label434;
						}
						var27 = var28.field5430;
					} else if (var25 == -1) {
						var28 = null;
						var27 = Statics.field3837;
					}
					if (var27 != null) {
						int var29 = method3398(var25, var28, var27);
						if (var29 != -1) {
							label413: {
								if (var23 == 2 && var27.field1160.method4868(var29, var20, var21, var16) >= 0) {
									class213 var30 = class213.method8013(var24);
									if (var30.field2356 != null) {
										var30 = var30.method4310();
									}
									if (var30 == null) {
										break label413;
									}
									class75 var31 = null;
									for (class75 var32 = (class75) var27.field1159.method8034(); var32 != null; var32 = (class75) var27.field1159.method8036()) {
										if (var32.field1027 == var29 && var32.field1023 == var20 && var32.field1037 == var22 && var32.field1028 == var24) {
											var31 = var32;
											break;
										}
									}
									if (!Statics.field3471 && field358 == 1) {
										method7896(class394.field4763, field529 + " " + class83.field1201 + " " + class83.method3480(65535) + var30.field2338, 1, var24, var20, var22, -1, false, var25);
									} else if (!field530) {
										String[] var33 = var30.field2342;
										if (var33 != null) {
											for (int var34 = 4; var34 >= 0; var34--) {
												if (!Statics.field3471 && (var31 == null || var31.method2361(var34))) {
													String var35 = var33[var34];
													if (var31 != null && var31.method2369(var34)) {
														var35 = var31.method2363(var34);
													}
													if (var35 != null) {
														short var36 = 0;
														if (var34 == 0) {
															var36 = 3;
														}
														if (var34 == 1) {
															var36 = 4;
														}
														if (var34 == 2) {
															var36 = 5;
														}
														if (var34 == 3) {
															var36 = 6;
														}
														if (var34 == 4) {
															var36 = 1001;
														}
														method7896(var35, class83.method3480(65535) + var30.field2338, var36, var24, var20, var22, -1, false, var25);
													}
												}
											}
										}
										method7896(class394.field4646, class83.method3480(65535) + var30.field2338, 1002, var30.field2322, var20, var22, -1, false, var25);
									} else if (!Statics.field3471 && (Statics.field3866 & 0x4) == 4) {
										method7896(field375, field534 + " " + class83.field1201 + " " + class83.method3480(65535) + var30.field2338, 2, var24, var20, var22, -1, false, var25);
									}
								}
								if (var23 == 1) {
									class82 var37 = (class82) var27.field1161.method7917((long) var24);
									if (var37 == null) {
										break label413;
									}
									if (var37.field1185.field2112 == 1 && (var37.field1056 & 0x7F) == 64 && (var37.field1057 & 0x7F) == 64) {
										for (int var38 = 0; var38 < var27.field1162.method9107(); var38++) {
											class82 var39 = (class82) var27.field1161.method7917((long) var27.field1162.method9104(var38));
											if (var39 != null && var37 != var39 && var39.field1185.field2112 == 1 && var37.field1056 == var39.field1056 && var37.field1057 == var39.field1057) {
												method660(var39, var39.field1104, var20, var22, var25);
											}
										}
										int var40 = field336.field1255;
										int[] var41 = field336.field1244;
										for (int var42 = 0; var42 < var40; var42++) {
											class70 var43 = (class70) var27.field1170.method7917((long) var41[var42]);
											if (var43 != null && var37.field1056 == var43.field1056 && var37.field1057 == var43.field1057) {
												method3381(var43, var41[var42], var20, var22, var25);
											}
										}
									}
									method660(var37, var24, var20, var22, var25);
								}
								if (var23 == 0) {
									class70 var44 = (class70) var27.field1170.method7917((long) var24);
									if (var44 == null) {
										break label413;
									}
									if ((var44.field1056 & 0x7F) == 64 && (var44.field1057 & 0x7F) == 64) {
										for (int var45 = 0; var45 < var27.field1162.method9107(); var45++) {
											class82 var46 = (class82) var27.field1161.method7917((long) var27.field1162.method9104(var45));
											if (var46 != null && var46.field1185.field2112 == 1 && var44.field1056 == var46.field1056 && var44.field1057 == var46.field1057) {
												method660(var46, var27.field1162.method9104(var45), var20, var22, var25);
											}
										}
										int var47 = field336.field1255;
										int[] var48 = field336.field1244;
										for (int var49 = 0; var49 < var47; var49++) {
											class70 var50 = (class70) var27.field1170.method7917((long) var48[var49]);
											if (var50 != null && var44 != var50 && var44.field1056 == var50.field1056 && var44.field1057 == var50.field1057) {
												method3381(var50, var48[var49], var20, var22, var25);
											}
										}
									}
									if (field520 == var24) {
										var4 = var16;
										var6 = var25;
									} else {
										method3381(var44, var24, var20, var22, var25);
									}
								}
								if (var23 == 3) {
									class437 var51 = var27.field1168[var29][var20][var22];
									if (var51 != null) {
										for (class86 var52 = (class86) var51.method8035(); var52 != null; var52 = (class86) var51.method8037()) {
											class214 var53 = class214.method2737(var52.field1222);
											if (!Statics.field861 && field358 == 1) {
												method7896(class394.field4763, field529 + " " + class83.field1201 + " " + class83.method3480(16748608) + var53.field2429, 16, var52.field1222, var20, var22, -1, false, var25);
											} else if (!field530) {
												String[] var54 = var53.field2404;
												for (int var55 = 4; var55 >= 0; var55--) {
													if (!Statics.field861 && var52.method2755(var55)) {
														if (var54 != null && var54[var55] != null) {
															byte var56 = 0;
															if (var55 == 0) {
																var56 = 18;
															}
															if (var55 == 1) {
																var56 = 19;
															}
															if (var55 == 2) {
																var56 = 20;
															}
															if (var55 == 3) {
																var56 = 21;
															}
															if (var55 == 4) {
																var56 = 22;
															}
															method7896(var54[var55], class83.method3480(16748608) + var53.field2429, var56, var52.field1222, var20, var22, -1, false, var25);
														} else if (var55 == 2) {
															method7896(class394.field4480, class83.method3480(16748608) + var53.field2429, 20, var52.field1222, var20, var22, -1, false, var25);
														}
													}
												}
												method7896(class394.field4646, class83.method3480(16748608) + var53.field2429, 1004, var52.field1222, var20, var22, -1, false, var25);
											} else if (!Statics.field861 && (Statics.field3866 & 0x1) == 1) {
												method7896(field375, field534 + " " + class83.field1201 + " " + class83.method3480(16748608) + var53.field2429, 17, var52.field1222, var20, var22, -1, false, var25);
											}
										}
									}
								}
								if (var23 == 4) {
									class506 var57 = (class506) var27.field1172.method7946((long) var24);
									if (var57 != null) {
										class204 var58 = var57.field5426;
										if (field358 == 1) {
											method7896(class394.field4763, field529 + " " + class83.field1201 + " " + class83.method3480(65280) + var58.field2234, 61, var24, var20, var22, -1, false, var25);
										} else if (!field530) {
											String[] var59 = var58.field2235;
											if (var59 != null) {
												for (int var60 = 4; var60 >= 0; var60--) {
													if (var57.method9348(var60) && var59[var60] != null) {
														byte var61 = 0;
														if (var60 == 0) {
															var61 = 63;
														}
														if (var60 == 1) {
															var61 = 64;
														}
														if (var60 == 2) {
															var61 = 65;
														}
														if (var60 == 3) {
															var61 = 66;
														}
														if (var60 == 4) {
															var61 = 67;
														}
														method7896(var59[var60], class83.method3480(65280) + var58.field2234, var61, var24, var20, var22, -1, false, var25);
													}
												}
											}
											method7896(class394.field4646, class83.method3480(65280) + var58.field2234, 1013, var58.method4146(), var20, var22, -1, false, var25);
										}
									}
								}
							}
						}
					}
				}
			}
			var9++;
		}
	}

	@ObfuscatedName("ej.mb(ILtj;Ldr;I)I")
	public static int method3398(int arg0, class506 arg1, class80 arg2) {
		int var3 = -1;
		if (field347 == arg0) {
			var3 = arg2.field1171;
		} else if (field347 == -1) {
			var3 = arg1.field5426.method4151();
		} else {
			class506 var4 = field334.method2308();
			class80 var5 = var4.field5430;
			if (var5.field1171 == var4.field5426.method4151()) {
				if (arg0 == -1) {
					var3 = var4.method2177();
				} else {
					var3 = arg1.field5426.method4151();
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("bl.mi(Ldt;IIIII)V")
	public static final void method660(class82 arg0, int arg1, int arg2, int arg3, int arg4) {
		class196 var5 = arg0.field1185;
		if (field523.field6053 >= 400) {
			return;
		}
		if (var5.field2100 != null) {
			var5 = var5.method4066();
		}
		if (var5 == null || (!var5.field2145 || var5.field2147 && field430 != arg1)) {
			return;
		}
		String var6 = arg0.method2666();
		if (var5.field2136 != 0 && arg0.field1107 != 0) {
			int var7 = arg0.field1107 == -1 ? var5.field2136 : arg0.field1107;
			var6 = var6 + method8224(var7, Statics.field1109.field940) + " " + class83.field1202 + class394.field4652 + var7 + class83.field1199;
		}
		if (var5.field2148 && field356) {
			method7896(class394.field4646, class83.method3480(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
		}
		if (!Statics.field5395 && field358 == 1) {
			method7896(class394.field4763, field529 + " " + class83.field1201 + " " + class83.method3480(16776960) + var6, 7, arg1, arg2, arg3, -1, false, arg4);
		} else if (!field530) {
			int var8 = var5.field2148 && field356 ? 2000 : 0;
			String[] var9 = var5.field2143;
			if (var9 != null) {
				for (int var10 = 4; var10 >= 0; var10--) {
					if (!Statics.field5395 && arg0.method2669(var10) && var9[var10] != null && !var9[var10].equalsIgnoreCase(class394.field4647)) {
						int var11 = 0;
						if (var10 == 0) {
							var11 = var8 + 9;
						}
						if (var10 == 1) {
							var11 = var8 + 10;
						}
						if (var10 == 2) {
							var11 = var8 + 11;
						}
						if (var10 == 3) {
							var11 = var8 + 12;
						}
						if (var10 == 4) {
							var11 = var8 + 13;
						}
						method7896(var9[var10], class83.method3480(16776960) + var6, var11, arg1, arg2, arg3, -1, false, arg4);
					}
				}
			}
			if (var9 != null) {
				for (int var12 = 4; var12 >= 0; var12--) {
					if (!Statics.field5395 && arg0.method2669(var12) && var9[var12] != null && var9[var12].equalsIgnoreCase(class394.field4647)) {
						short var13 = 0;
						if (field319 != class85.field1214) {
							if (field319 == class85.field1212 || field319 == class85.field1215 && var5.field2136 > Statics.field1109.field940) {
								var13 = 2000;
							}
							int var14 = 0;
							if (var12 == 0) {
								var14 = var13 + 9;
							}
							if (var12 == 1) {
								var14 = var13 + 10;
							}
							if (var12 == 2) {
								var14 = var13 + 11;
							}
							if (var12 == 3) {
								var14 = var13 + 12;
							}
							if (var12 == 4) {
								var14 = var13 + 13;
							}
							method7896(var9[var12], class83.method3480(16776960) + var6, var14, arg1, arg2, arg3, -1, false, arg4);
						}
					}
				}
			}
			if (!var5.field2148 || !field356) {
				method7896(class394.field4646, class83.method3480(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
			}
		} else if (!Statics.field5395 && (Statics.field3866 & 0x2) == 2) {
			method7896(field375, field534 + " " + class83.field1201 + " " + class83.method3480(16776960) + var6, 8, arg1, arg2, arg3, -1, false, arg4);
		}
	}

	@ObfuscatedName("ea.mo(Lcv;IIIIB)V")
	public static final void method3381(class70 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field492 == arg0.field1104 || field523.field6053 >= 400) {
			return;
		}
		String var5;
		if (arg0.field941 == 0) {
			var5 = arg0.field939[0] + arg0.field935 + arg0.field939[1] + method8224(arg0.field940, Statics.field1109.field940) + " " + class83.field1202 + class394.field4652 + arg0.field940 + class83.field1199 + arg0.field939[2];
		} else {
			var5 = arg0.field939[0] + arg0.field935 + arg0.field939[1] + " " + class83.field1202 + class394.field4770 + arg0.field941 + class83.field1199 + arg0.field939[2];
		}
		if (field358 == 1) {
			method7896(class394.field4763, field529 + " " + class83.field1201 + " " + class83.method3480(16777215) + var5, 14, arg1, arg2, arg3, -1, false, arg4);
		} else if (!field530) {
			for (int var6 = 7; var6 >= 0; var6--) {
				if (field517[var6] != null) {
					short var7 = 0;
					if (field517[var6].equalsIgnoreCase(class394.field4647)) {
						if (field341 == class85.field1214) {
							continue;
						}
						if (field341 == class85.field1212 || field341 == class85.field1215 && arg0.field940 > Statics.field1109.field940) {
							var7 = 2000;
						}
						if (Statics.field1109.field956 == 0 || arg0.field956 == 0) {
							if (field341 == class85.field1217 && arg0.method2130()) {
								var7 = 2000;
							}
						} else if (Statics.field1109.field956 == arg0.field956) {
							var7 = 2000;
						} else {
							var7 = 0;
						}
					} else if (field440[var6]) {
						var7 = 2000;
					}
					boolean var8 = false;
					int var9 = field322[var6] + var7;
					method7896(field517[var6], class83.method3480(16777215) + var5, var9, arg1, arg2, arg3, -1, false, arg4);
				}
			}
		} else if ((Statics.field3866 & 0x8) == 8) {
			method7896(field375, field534 + " " + class83.field1201 + " " + class83.method3480(16777215) + var5, 15, arg1, arg2, arg3, -1, false, arg4);
		}
		for (int var10 = 0; var10 < field523.field6053; var10++) {
			if (field523.field6056[var10] == 23) {
				field523.field6063[var10] = class83.method3480(16777215) + var5;
				break;
			}
		}
	}

	@ObfuscatedName("rg.mu(IIB)Ljava/lang/String;")
	public static final String method8224(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return class83.method3480(16711680);
		} else if (var2 < -6) {
			return class83.method3480(16723968);
		} else if (var2 < -3) {
			return class83.method3480(16740352);
		} else if (var2 < 0) {
			return class83.method3480(16756736);
		} else if (var2 > 9) {
			return class83.method3480(65280);
		} else if (var2 > 6) {
			return class83.method3480(4259584);
		} else if (var2 > 3) {
			return class83.method3480(8453888);
		} else if (var2 > 0) {
			return class83.method3480(12648192);
		} else {
			return class83.method3480(16776960);
		}
	}

	@ObfuscatedName("ge.mq(IIIIIIIIB)V")
	public static final void method3771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (Statics.field1555.method6865(arg0)) {
			Statics.field1778 = null;
			Statics.method2370(Statics.field1555.field4038[arg0], 0, Statics.field1555.field4038[arg0].length - 1, -1, -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			if (Statics.field1778 != null) {
				Statics.method2370(Statics.field1778, 0, Statics.field1778.length - 1, -1412584499, -1412584499, arg1, arg2, arg3, arg4, Statics.field1873, Statics.field3376, arg7);
				Statics.field1778 = null;
			}
		} else if (arg7 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				field437[var8] = true;
			}
		} else {
			field437[arg7] = true;
		}
	}

	@ObfuscatedName("ht.mz(IIIIIII)V")
	public static final void method4098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 - arg0;
		int var7 = arg3 - arg1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}
		if (var10 == 0) {
			return;
		}
		int var11 = (var6 << 16) / var10;
		int var12 = (var7 << 16) / var10;
		if (var12 <= var11) {
			var11 = -var11;
		} else {
			var12 = -var12;
		}
		int var13 = arg5 * var12 >> 17;
		int var14 = arg5 * var12 + 1 >> 17;
		int var15 = arg5 * var11 >> 17;
		int var16 = arg5 * var11 + 1 >> 17;
		int var17 = arg0 - class602.field5995;
		int var18 = arg1 - class602.field5993;
		int var19 = var13 + var17;
		int var20 = var17 - var14;
		int var21 = var6 + var17 - var14;
		int var22 = var6 + var17 + var13;
		int var23 = var15 + var18;
		int var24 = var18 - var16;
		int var25 = var7 + var18 - var16;
		int var26 = var7 + var18 + var15;
		class226.method4668(var19, var20, var21);
		class226.method4647((float) var23, (float) var24, (float) var25, (float) var19, (float) var20, (float) var21, 0.0F, 0.0F, 0.0F, arg4);
		class226.method4668(var19, var21, var22);
		class226.method4647((float) var23, (float) var25, (float) var26, (float) var19, (float) var21, (float) var22, 0.0F, 0.0F, 0.0F, arg4);
	}

	@ObfuscatedName("eh.mw(Ljava/lang/String;Loi;I)Ljava/lang/String;")
	public static String method3444(String arg0, class370 arg1) {
		if (arg0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; var2++) {
				while (true) {
					int var3 = arg0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}
					arg0 = arg0.substring(0, var3) + method9419(method632(arg1, var2 - 1)) + arg0.substring(var3 + 2);
				}
			}
		}
		return arg0;
	}

	@ObfuscatedName("rf.mr(II)Ljava/lang/String;")
	public static final String method8269(int arg0) {
		String var1 = Integer.toString(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + class83.field1197 + var1.substring(var2);
		}
		if (var1.length() > 9) {
			return " " + class83.method3480(65408) + var1.substring(0, var1.length() - 8) + class394.field4657 + " " + class83.field1202 + var1 + class83.field1199 + class83.field1200;
		} else if (var1.length() > 6) {
			return " " + class83.method3480(16777215) + var1.substring(0, var1.length() - 4) + class394.field4544 + " " + class83.field1202 + var1 + class83.field1199 + class83.field1200;
		} else {
			return " " + class83.method3480(16776960) + var1 + class83.field1200;
		}
	}

	@ObfuscatedName("ak.ma([Loi;Loi;ZB)V")
	public static void method332(class370[] arg0, class370 arg1, boolean arg2) {
		int var3 = arg1.field4194 == 0 ? arg1.field4161 : arg1.field4194;
		int var4 = arg1.field4173 == 0 ? arg1.field4150 : arg1.field4173;
		method9751(arg0, arg1.field4249, arg1.field4215, arg1.field4145, arg1.field4146, var3, var4, arg2);
		if (arg1.field4287 != null) {
			method9751(arg1.field4287, 0, arg1.field4287.length - 1, arg1.field4145, -1, var3, var4, arg2);
		}
		if (arg1.field4146 == -1) {
			class65 var5 = (class65) field423.method7973((long) arg1.field4145);
			if (var5 != null) {
				method7551(var5.field889, var3, var4, arg2);
			}
		}
		if (arg1.field4169 == 1337) {
		}
	}

	@ObfuscatedName("os.mn(IIIZI)V")
	public static final void method7551(int arg0, int arg1, int arg2, boolean arg3) {
		if (Statics.field1555.method6865(arg0)) {
			method9751(Statics.field1555.field4038[arg0], 0, Statics.field1555.field4038[arg0].length - 1, -1, -1, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("ue.me([Loi;IIIIIIZI)V")
	public static void method9751(class370[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		for (int var8 = arg1; var8 <= arg2; var8++) {
			class370 var9 = arg0[var8];
			if (var9 != null && var9.field4165 == arg3 && var9.field4166 == arg4) {
				method6789(var9, arg5, arg6, arg7);
				method5410(var9, arg5, arg6);
				if (var9.field4261 > var9.field4194 - var9.field4161) {
					var9.field4261 = var9.field4194 - var9.field4161;
				}
				if (var9.field4261 < 0) {
					var9.field4261 = 0;
				}
				if (var9.field4171 > var9.field4173 - var9.field4150) {
					var9.field4171 = var9.field4173 - var9.field4150;
				}
				if (var9.field4171 < 0) {
					var9.field4171 = 0;
				}
				if (var9.field4148 == 0) {
					method332(arg0, var9, arg7);
				}
			}
		}
	}

	@ObfuscatedName("nq.my(Loi;IIZI)V")
	public static void method6789(class370 arg0, int arg1, int arg2, boolean arg3) {
		int var4 = arg0.field4161;
		int var5 = arg0.field4150;
		if (arg0.field4252 == 0) {
			arg0.field4161 = arg0.field4157;
		} else if (arg0.field4252 == 1) {
			arg0.field4161 = arg1 - arg0.field4157;
		} else if (arg0.field4252 == 2) {
			arg0.field4161 = arg0.field4157 * arg1 >> 14;
		}
		if (arg0.field4222 == 0) {
			arg0.field4150 = arg0.field4158;
		} else if (arg0.field4222 == 1) {
			arg0.field4150 = arg2 - arg0.field4158;
		} else if (arg0.field4222 == 2) {
			arg0.field4150 = arg0.field4158 * arg2 >> 14;
		}
		if (arg0.field4252 == 4) {
			arg0.field4161 = arg0.field4163 * arg0.field4150 / arg0.field4164;
		}
		if (arg0.field4222 == 4) {
			arg0.field4150 = arg0.field4164 * arg0.field4161 / arg0.field4163;
		}
		if (arg0.field4169 == 1337) {
			field359 = arg0;
		}
		if (arg0.field4148 == 12) {
			arg0.method7358().method7267(arg0.field4161, arg0.field4150);
		}
		if (arg3 && arg0.field4271 != null && (arg0.field4161 != var4 || arg0.field4150 != var5)) {
			class66 var6 = new class66();
			var6.field894 = arg0;
			var6.field899 = arg0.field4271;
			field435.method8033(var6);
		}
	}

	@ObfuscatedName("jr.mh(Loi;III)V")
	public static void method5410(class370 arg0, int arg1, int arg2) {
		if (arg0.field4151 == 0) {
			arg0.field4159 = arg0.field4210;
		} else if (arg0.field4151 == 1) {
			arg0.field4159 = (arg1 - arg0.field4161) / 2 + arg0.field4210;
		} else if (arg0.field4151 == 2) {
			arg0.field4159 = arg1 - arg0.field4161 - arg0.field4210;
		} else if (arg0.field4151 == 3) {
			arg0.field4159 = arg0.field4210 * arg1 >> 14;
		} else if (arg0.field4151 == 4) {
			arg0.field4159 = (arg0.field4210 * arg1 >> 14) + (arg1 - arg0.field4161) / 2;
		} else {
			arg0.field4159 = arg1 - arg0.field4161 - (arg0.field4210 * arg1 >> 14);
		}
		if (arg0.field4162 == 0) {
			arg0.field4205 = arg0.field4229;
		} else if (arg0.field4162 == 1) {
			arg0.field4205 = (arg2 - arg0.field4150) / 2 + arg0.field4229;
		} else if (arg0.field4162 == 2) {
			arg0.field4205 = arg2 - arg0.field4150 - arg0.field4229;
		} else if (arg0.field4162 == 3) {
			arg0.field4205 = arg0.field4229 * arg2 >> 14;
		} else if (arg0.field4162 == 4) {
			arg0.field4205 = (arg0.field4229 * arg2 >> 14) + (arg2 - arg0.field4150) / 2;
		} else {
			arg0.field4205 = arg2 - arg0.field4150 - (arg0.field4229 * arg2 >> 14);
		}
	}

	@ObfuscatedName("ft.mf(Loi;IIIIIII)V")
	public static final void method3481(class370 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (field344) {
			field483 = 32;
		} else {
			field483 = 0;
		}
		field344 = false;
		if (class36.field219 == 1 || !Statics.field5059 && class36.field219 == 4) {
			if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
				arg0.field4171 -= 4;
				method2809(arg0);
			} else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
				arg0.field4171 += 4;
				method2809(arg0);
			} else if (arg5 >= arg1 - field483 && arg5 < field483 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
				int var7 = (arg3 - 32) * arg3 / arg4;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg6 - arg2 - 16 - var7 / 2;
				int var9 = arg3 - 32 - var7;
				arg0.field4171 = (arg4 - arg3) * var8 / var9;
				method2809(arg0);
				field344 = true;
			}
		}
		if (field551 == 0) {
			return;
		}
		int var10 = arg0.field4161;
		if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
			arg0.field4171 += field551 * 45;
			method2809(arg0);
		}
	}

	@ObfuscatedName("bz.mg(IIIIIB)V")
	public static final void method738(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Statics.field3066[0].method10780(arg0, arg1);
		Statics.field3066[1].method10780(arg0, arg1 + arg3 - 16);
		class602.method10682(arg0, arg1 + 16, 16, arg3 - 32, field396);
		int var5 = (arg3 - 32) * arg3 / arg4;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
		class602.method10682(arg0, arg1 + 16 + var6, 16, var5, field479);
		class602.method10690(arg0, arg1 + 16 + var6, var5, field329);
		class602.method10690(arg0 + 1, arg1 + 16 + var6, var5, field329);
		class602.method10685(arg0, arg1 + 16 + var6, 16, field329);
		class602.method10685(arg0, arg1 + 17 + var6, 16, field329);
		class602.method10690(arg0 + 15, arg1 + 16 + var6, var5, field514);
		class602.method10690(arg0 + 14, arg1 + 17 + var6, var5 - 1, field514);
		class602.method10685(arg0, arg1 + 15 + var6 + var5, 16, field514);
		class602.method10685(arg0 + 1, arg1 + 14 + var6 + var5, 15, field514);
	}

	@ObfuscatedName("tf.mj(IB)Ljava/lang/String;")
	public static final String method9419(int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@ObfuscatedName("kn.ms(Loi;B)Z")
	public static final boolean method5551(class370 arg0) {
		if (arg0.field4276 == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.field4276.length; var1++) {
			int var2 = method632(arg0, var1);
			int var3 = arg0.field4192[var1];
			if (arg0.field4276[var1] == 2) {
				if (var2 >= var3) {
					return false;
				}
			} else if (arg0.field4276[var1] == 3) {
				if (var2 <= var3) {
					return false;
				}
			} else if (arg0.field4276[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var2 != var3) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("bl.mt(Loi;II)I")
	public static final int method632(class370 arg0, int arg1) {
		if (arg0.field4275 == null || arg1 >= arg0.field4275.length) {
			return -2;
		}
		try {
			int[] var2 = arg0.field4275[arg1];
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
					var7 = field540[var2[var4++]];
				}
				if (var6 == 2) {
					var7 = field403[var2[var4++]];
				}
				if (var6 == 3) {
					var7 = field354[var2[var4++]];
				}
				if (var6 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					class370 var11 = Statics.field1555.method6863(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!class214.method2737(var12).field2403 || field327)) {
						for (int var13 = 0; var13 < var11.field4260.length; var13++) {
							if (var12 + 1 == var11.field4260[var13]) {
								var7 += var11.field4282[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var7 = Statics.field4023[var2[var4++]];
				}
				if (var6 == 6) {
					var7 = class380.field4370[field403[var2[var4++]] - 1];
				}
				if (var6 == 7) {
					var7 = Statics.field4023[var2[var4++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var7 = Statics.field1109.field940;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (class380.field4369[var14]) {
							var7 += field403[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					class370 var17 = Statics.field1555.method6863(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!class214.method2737(var18).field2403 || field327)) {
						for (int var19 = 0; var19 < var17.field4260.length; var19++) {
							if (var18 + 1 == var17.field4260[var19]) {
								var7 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var7 = field593;
				}
				if (var6 == 12) {
					var7 = field491;
				}
				if (var6 == 13) {
					int var20 = Statics.field4023[var2[var4++]];
					int var21 = var2[var4++];
					var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
				}
				if (var6 == 14) {
					int var22 = var2[var4++];
					var7 = class356.method5877(var22);
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
					var7 = (Statics.field1109.field1056 >> 7) + Statics.field3837.field1165;
				}
				if (var6 == 19) {
					var7 = (Statics.field1109.field1057 >> 7) + Statics.field3837.field1166;
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

	@ObfuscatedName("fu.md(Loi;I)V")
	public static final void method3604(class370 arg0) {
		if (arg0.field4246 == 1) {
			method5926(arg0.field4280, "", 24, 0, 0, arg0.field4145, arg0.field4283);
		}
		if (arg0.field4246 == 2 && !field530) {
			String var1 = method5927(arg0);
			if (var1 != null) {
				method5926(var1, class83.method3480(65280) + arg0.field4299, 25, 0, -1, arg0.field4145, arg0.field4283);
			}
		}
		if (arg0.field4246 == 3) {
			method3654(class394.field4726, "", 26, 0, 0, arg0.field4145);
		}
		if (arg0.field4246 == 4) {
			method3654(arg0.field4280, "", 28, 0, 0, arg0.field4145);
		}
		if (arg0.field4246 == 5) {
			method3654(arg0.field4280, "", 29, 0, 0, arg0.field4145);
		}
		if (arg0.field4246 == 6 && field565 == null) {
			method3654(arg0.field4280, "", 30, 0, -1, arg0.field4145);
		}
		if (!arg0.field4144) {
			return;
		}
		if (!field530) {
			for (int var2 = 31; var2 >= 0; var2--) {
				if (arg0.field4231 == var2) {
					String var3 = method5927(arg0);
					if (var3 != null) {
						method5926(var3, arg0.field4228, 25, 0, arg0.field4146, arg0.field4145, arg0.field4283);
					}
				}
				String var4 = method3889(arg0, var2);
				if (var4 != null) {
					short var5;
					int var6;
					if (var2 > arg0.field4231) {
						var5 = 1007;
						var6 = method5926(var4, arg0.field4228, var5, var2 + 1, arg0.field4146, arg0.field4145, arg0.field4283);
					} else {
						var5 = 57;
						var6 = method7896(var4, arg0.field4228, var5, var2 + 1, arg0.field4146, arg0.field4145, arg0.field4283, arg0.field4149, -1);
					}
					if (arg0.field4230 != null && var2 < arg0.field4230.length && arg0.field4230[var2] != null) {
						String[] var7 = arg0.field4230[var2];
						for (int var8 = var7.length - 1; var8 >= 0; var8--) {
							int var9 = var8 + 1 << 16 | var2 + 1;
							if (var7[var8] != null && !var7[var8].isEmpty()) {
								method7605(var6, var7[var8], "", var5, var9, arg0.field4146, arg0.field4145, arg0.field4283, -1);
							}
						}
					}
				}
			}
			int var10 = method7519(arg0);
			boolean var11 = (var10 & 0x1) != 0;
			if (var11) {
				method3654(class394.field4485, "", 30, 0, arg0.field4146, arg0.field4145);
			}
		} else if (class371.method333(method7519(arg0)) && (Statics.field3866 & 0x20) == 32) {
			method5926(field375, field534 + " " + class83.field1201 + " " + arg0.field4228, 58, 0, arg0.field4146, arg0.field4145, arg0.field4283);
		}
	}

	@ObfuscatedName("iq.mx(ZI)V")
	public static void method4518(boolean arg0) {
		field524 = arg0;
	}

	@ObfuscatedName("lu.nz(B)Z")
	public static boolean method6331() {
		return field524;
	}

	@ObfuscatedName("lf.nk(IIIIIIII)V")
	public static final void method5921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (Statics.field1555.method6865(arg0)) {
			method6262(Statics.field1555.field4038[arg0], 0, Statics.field1555.field4038[arg0].length - 1, -1, -1, arg1, arg2, arg3, arg4, arg5, arg6);
		}
	}

	@ObfuscatedName("ly.nf([Loi;IIIIIIIIIII)V")
	public static final void method6262(class370[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = arg1; var11 <= arg2; var11++) {
			class370 var12 = arg0[var11];
			if (var12 != null && var12.field4165 == arg3 && var12.field4166 == arg4 && (var12.method7335() || method7519(var12) != 0 || method7572(var12) != 0 || field537 == var12)) {
				if (var12.field4144) {
					if (method6911(var12)) {
						continue;
					}
				} else if (var12.field4148 == 0 && Statics.field3951 != var12 && method6911(var12)) {
					continue;
				}
				if (var12.field4148 == 11) {
					if (var12.method7355(Statics.field1555, Statics.field1508)) {
						if (var12.method7487()) {
							method2809(var12);
							method332(var12.field4287, var12, true);
							var12.method7354().method5432().method5565(3, var12.method7354().method5441());
						}
						if (var12.field4177 != null) {
							class66 var13 = new class66();
							var13.field894 = var12;
							var13.field899 = var12.field4177;
							field435.method8033(var13);
						}
					}
				} else if (var12.field4148 == 12 && var12.method7478(Statics.field1555)) {
					method2809(var12);
				}
				int var14 = var12.field4159 + arg9;
				int var15 = var12.field4205 + arg10;
				int var22;
				int var23;
				int var24;
				int var25;
				if (var12.field4148 == 9) {
					int var16 = var14;
					int var17 = var15;
					int var18 = var12.field4161 + var14;
					int var19 = var12.field4150 + var15;
					if (var18 < var14) {
						var16 = var18;
						var18 = var14;
					}
					if (var19 < var15) {
						var17 = var19;
						var19 = var15;
					}
					var18++;
					var19++;
					var22 = var16 > arg5 ? var16 : arg5;
					var23 = var17 > arg6 ? var17 : arg6;
					var24 = var18 < arg7 ? var18 : arg7;
					var25 = var19 < arg8 ? var19 : arg8;
				} else {
					int var26 = var12.field4161 + var14;
					int var27 = var12.field4150 + var15;
					var22 = var14 > arg5 ? var14 : arg5;
					var23 = var15 > arg6 ? var15 : arg6;
					var24 = var26 < arg7 ? var26 : arg7;
					var25 = var27 < arg8 ? var27 : arg8;
				}
				if (field613 == var12) {
					field544 = true;
					field545 = var14;
					field546 = var15;
				}
				boolean var28 = false;
				if (var12.field4223) {
					switch(field325) {
						case 0:
							var28 = true;
						case 1:
						default:
							break;
						case 2:
							if (var12.field4145 >>> 16 == field574) {
								var28 = true;
							}
							break;
						case 3:
							if (field574 == var12.field4145) {
								var28 = true;
							}
					}
				}
				if (var28 || !var12.field4144 || var22 < var24 && var23 < var25) {
					if (var12.field4144) {
						if (var12.field4268) {
							if (class36.field232 >= var22 && class36.field221 >= var23 && class36.field232 < var24 && class36.field221 < var25) {
								for (class66 var29 = (class66) field435.method8034(); var29 != null; var29 = (class66) field435.method8036()) {
									if (var29.field900) {
										var29.method2234();
										var29.field894.field4266 = false;
									}
								}
								Statics.method7595();
								if (Statics.field1038 == 0) {
									field613 = null;
									field537 = null;
								}
								if (!field522) {
									method181();
								}
							}
						} else if (var12.field4298 && class36.field232 >= var22 && class36.field221 >= var23 && class36.field232 < var24 && class36.field221 < var25) {
							for (class66 var30 = (class66) field435.method8034(); var30 != null; var30 = (class66) field435.method8036()) {
								if (var30.field900 && var30.field894.field4259 == var30.field899) {
									var30.method2234();
								}
							}
						}
					}
					int var31 = class36.field232;
					int var32 = class36.field221;
					if (class36.field223 != 0) {
						var31 = class36.field222;
						var32 = class36.field225;
					}
					boolean var33 = var31 >= var22 && var32 >= var23 && var31 < var24 && var32 < var25;
					if (var12.field4169 == 1337) {
						if (!field393 && !field522 && var33) {
							method2125(var31, var32, var22, var23);
						}
					} else if (var12.field4169 == 1338) {
						method14(var12, var14, var15);
					} else {
						if (var12.field4169 == 1400) {
							Statics.field817.method9823(class36.field232, class36.field221, var33, var14, var15, var12.field4161, var12.field4150);
						}
						if (!field522 && var33) {
							if (var12.field4169 == 1400) {
								Statics.field817.method9875(var14, var15, var12.field4161, var12.field4150, var31, var32);
							} else {
								method3604(var12);
							}
						}
						if (var28) {
							for (int var34 = 0; var34 < var12.field4224.length; var34++) {
								boolean var35 = false;
								boolean var36 = false;
								if (!var35 && var12.field4224[var34] != null) {
									for (int var37 = 0; var37 < var12.field4224[var34].length; var37++) {
										boolean var38 = false;
										if (var12.field4296 != null) {
											var38 = field552.method5701(var12.field4224[var34][var37]);
										}
										if (method722(var12.field4224[var34][var37]) || var38) {
											var35 = true;
											if (var12.field4296 != null && var12.field4296[var34] > field413) {
												break;
											}
											byte var39 = var12.field4225[var34][var37];
											if (var39 == 0 || ((var39 & 0x8) == 0 || !field552.method5701(86) && !field552.method5701(82) && !field552.method5701(81)) && ((var39 & 0x2) == 0 || field552.method5701(86)) && ((var39 & 0x1) == 0 || field552.method5701(82)) && ((var39 & 0x4) == 0 || field552.method5701(81))) {
												var36 = true;
												break;
											}
										}
									}
								}
								if (var36) {
									if (var34 < 10) {
										method6373(var34 + 1, var12.field4145, var12.field4146, var12.field4283, "");
									} else if (var34 == 10) {
										method7628();
										method762(var12.field4145, var12.field4146, Statics.method9749(method7519(var12)), var12.field4283);
										field375 = method5927(var12);
										if (field375 == null) {
											field375 = class394.field4507;
										}
										field534 = var12.field4228 + class83.method3480(16777215);
									}
									int var40 = var12.field4221[var34];
									if (var12.field4296 == null) {
										var12.field4296 = new int[var12.field4224.length];
									}
									if (var12.field4234 == null) {
										var12.field4234 = new int[var12.field4224.length];
									}
									if (var40 == 0) {
										var12.field4296[var34] = Integer.MAX_VALUE;
									} else if (var12.field4296[var34] == 0) {
										var12.field4296[var34] = field413 + var40 + var12.field4234[var34];
									} else {
										var12.field4296[var34] = field413 + var40;
									}
								}
								if (!var35 && var12.field4296 != null) {
									var12.field4296[var34] = 0;
								}
							}
						}
						if (var12.field4144) {
							boolean var41;
							if (class36.field232 >= var22 && class36.field221 >= var23 && class36.field232 < var24 && class36.field221 < var25) {
								var41 = true;
							} else {
								var41 = false;
							}
							boolean var42 = false;
							if ((class36.field219 == 1 || !Statics.field5059 && class36.field219 == 4) && var41) {
								var42 = true;
							}
							boolean var43 = false;
							if ((class36.field223 == 1 || !Statics.field5059 && class36.field223 == 4) && class36.field222 >= var22 && class36.field225 >= var23 && class36.field222 < var24 && class36.field225 < var25) {
								var43 = true;
							}
							if (var43) {
								method10274(var12, class36.field222 - var14, class36.field225 - var15);
							}
							if (var12.method7332()) {
								if (var43) {
									field438.method8033(new class274(0, class36.field232 - var14, class36.field221 - var15, var12));
								}
								if (var42) {
									field438.method8033(new class274(1, class36.field232 - var14, class36.field221 - var15, var12));
								}
							}
							if (var12.field4169 == 1400) {
								Statics.field817.method9824(var31, var32, var41 & var42, var41 & var43);
							}
							if (field613 != null && field613 != var12 && var41 && class371.method4745(method7519(var12))) {
								field446 = var12;
							}
							if (field537 == var12) {
								field541 = true;
								field542 = var14;
								field543 = var15;
							}
							if (var12.field4237) {
								if (var41 && field551 != 0 && var12.field4259 != null) {
									class66 var44 = new class66();
									var44.field900 = true;
									var44.field894 = var12;
									var44.field896 = field551;
									var44.field899 = var12.field4259;
									field435.method8033(var44);
								}
								if (field613 != null || field522) {
									var43 = false;
									var42 = false;
									var41 = false;
								}
								if (!var12.field4172 && var43) {
									var12.field4172 = true;
									if (var12.field4239 != null) {
										class66 var45 = new class66();
										var45.field900 = true;
										var45.field894 = var12;
										var45.field901 = class36.field222 - var14;
										var45.field896 = class36.field225 - var15;
										var45.field899 = var12.field4239;
										field435.method8033(var45);
									}
								}
								if (var12.field4172 && var42 && var12.field4240 != null) {
									class66 var46 = new class66();
									var46.field900 = true;
									var46.field894 = var12;
									var46.field901 = class36.field232 - var14;
									var46.field896 = class36.field221 - var15;
									var46.field899 = var12.field4240;
									field435.method8033(var46);
								}
								if (var12.field4172 && !var42) {
									var12.field4172 = false;
									if (var12.field4241 != null) {
										class66 var47 = new class66();
										var47.field900 = true;
										var47.field894 = var12;
										var47.field901 = class36.field232 - var14;
										var47.field896 = class36.field221 - var15;
										var47.field899 = var12.field4241;
										field615.method8033(var47);
									}
								}
								if (var42 && var12.field4242 != null) {
									class66 var48 = new class66();
									var48.field900 = true;
									var48.field894 = var12;
									var48.field901 = class36.field232 - var14;
									var48.field896 = class36.field221 - var15;
									var48.field899 = var12.field4242;
									field435.method8033(var48);
								}
								if (!var12.field4266 && var41) {
									var12.field4266 = true;
									if (var12.field4243 != null) {
										class66 var49 = new class66();
										var49.field900 = true;
										var49.field894 = var12;
										var49.field901 = class36.field232 - var14;
										var49.field896 = class36.field221 - var15;
										var49.field899 = var12.field4243;
										field435.method8033(var49);
									}
								}
								if (var12.field4266 && var41 && var12.field4244 != null) {
									class66 var50 = new class66();
									var50.field900 = true;
									var50.field894 = var12;
									var50.field901 = class36.field232 - var14;
									var50.field896 = class36.field221 - var15;
									var50.field899 = var12.field4244;
									field435.method8033(var50);
								}
								if (var12.field4266 && !var41) {
									var12.field4266 = false;
									if (var12.field4245 != null) {
										class66 var51 = new class66();
										var51.field900 = true;
										var51.field894 = var12;
										var51.field901 = class36.field232 - var14;
										var51.field896 = class36.field221 - var15;
										var51.field899 = var12.field4245;
										field615.method8033(var51);
									}
								}
								if (var12.field4256 != null) {
									class66 var52 = new class66();
									var52.field894 = var12;
									var52.field899 = var12.field4256;
									field436.method8033(var52);
								}
								if (var12.field4218 != null && field453 > var12.field4291) {
									if (var12.field4251 == null || field453 - var12.field4291 > 32) {
										class66 var57 = new class66();
										var57.field894 = var12;
										var57.field899 = var12.field4218;
										field435.method8033(var57);
									} else {
										label655: for (int var53 = var12.field4291; var53 < field453; var53++) {
											int var54 = field548[var53 & 0x1F];
											for (int var55 = 0; var55 < var12.field4251.length; var55++) {
												if (var12.field4251[var55] == var54) {
													class66 var56 = new class66();
													var56.field894 = var12;
													var56.field899 = var12.field4218;
													field435.method8033(var56);
													break label655;
												}
											}
										}
									}
									var12.field4291 = field453;
								}
								if (var12.field4305 != null && field536 > var12.field4288) {
									if (var12.field4253 == null || field536 - var12.field4288 > 32) {
										class66 var62 = new class66();
										var62.field894 = var12;
										var62.field899 = var12.field4305;
										field435.method8033(var62);
									} else {
										label631: for (int var58 = var12.field4288; var58 < field536; var58++) {
											int var59 = field550[var58 & 0x1F];
											for (int var60 = 0; var60 < var12.field4253.length; var60++) {
												if (var12.field4253[var60] == var59) {
													class66 var61 = new class66();
													var61.field894 = var12;
													var61.field899 = var12.field4305;
													field435.method8033(var61);
													break label631;
												}
											}
										}
									}
									var12.field4288 = field536;
								}
								if (var12.field4254 != null && field333 > var12.field4293) {
									if (var12.field4255 == null || field333 - var12.field4293 > 32) {
										class66 var67 = new class66();
										var67.field894 = var12;
										var67.field899 = var12.field4254;
										field435.method8033(var67);
									} else {
										label607: for (int var63 = var12.field4293; var63 < field333; var63++) {
											int var64 = field533[var63 & 0x1F];
											for (int var65 = 0; var65 < var12.field4255.length; var65++) {
												if (var12.field4255[var65] == var64) {
													class66 var66 = new class66();
													var66.field894 = var12;
													var66.field899 = var12.field4254;
													field435.method8033(var66);
													break label607;
												}
											}
										}
									}
									var12.field4293 = field333;
								}
								if (field526 > var12.field4290 && var12.field4155 != null) {
									class66 var68 = new class66();
									var68.field894 = var12;
									var68.field899 = var12.field4155;
									field435.method8033(var68);
								}
								if (field556 > var12.field4290 && var12.field4264 != null) {
									class66 var69 = new class66();
									var69.field894 = var12;
									var69.field899 = var12.field4264;
									field435.method8033(var69);
								}
								if (field364 > var12.field4290 && var12.field4265 != null) {
									class66 var70 = new class66();
									var70.field894 = var12;
									var70.field899 = var12.field4265;
									field435.method8033(var70);
								}
								if (field353 > var12.field4290 && var12.field4281 != null) {
									class66 var71 = new class66();
									var71.field894 = var12;
									var71.field899 = var12.field4281;
									field435.method8033(var71);
								}
								if (field485 > var12.field4290 && var12.field4267 != null) {
									class66 var72 = new class66();
									var72.field894 = var12;
									var72.field899 = var12.field4267;
									field435.method8033(var72);
								}
								if (field560 > var12.field4290 && var12.field4272 != null) {
									class66 var73 = new class66();
									var73.field894 = var12;
									var73.field899 = var12.field4272;
									field435.method8033(var73);
								}
								if (field561 > var12.field4290 && var12.field4274 != null) {
									class66 var74 = new class66();
									var74.field894 = var12;
									var74.field899 = var12.field4274;
									field435.method8033(var74);
								}
								if (field562 > var12.field4290 && var12.field4297 != null) {
									class66 var75 = new class66();
									var75.field894 = var12;
									var75.field899 = var12.field4297;
									field435.method8033(var75);
								}
								var12.field4290 = field405;
								if (var12.field4152 != null) {
									for (int var76 = 0; var76 < field443; var76++) {
										class66 var77 = new class66();
										var77.field894 = var12;
										var77.field893 = field512[var76];
										var77.field895 = field444[var76];
										var77.field899 = var12.field4152;
										field435.method8033(var77);
									}
								}
								if (var12.field4262 != null) {
									int[] var78 = field552.method5698();
									for (int var79 = 0; var79 < var78.length; var79++) {
										class66 var80 = new class66();
										var80.field894 = var12;
										var80.field893 = var78[var79];
										var80.field899 = var12.field4262;
										field435.method8033(var80);
									}
								}
								if (var12.field4160 != null) {
									int[] var81 = field552.method5695();
									for (int var82 = 0; var82 < var81.length; var82++) {
										class66 var83 = new class66();
										var83.field894 = var12;
										var83.field893 = var81[var82];
										var83.field899 = var12.field4160;
										field435.method8033(var83);
									}
								}
							}
						}
						if (!var12.field4144) {
							if (field613 != null || field522) {
								continue;
							}
							if ((var12.field4279 >= 0 || var12.field4176 != 0) && class36.field232 >= var22 && class36.field221 >= var23 && class36.field232 < var24 && class36.field221 < var25) {
								if (var12.field4279 >= 0) {
									Statics.field3951 = arg0[var12.field4279];
								} else {
									Statics.field3951 = var12;
								}
							}
							if (var12.field4148 == 8 && class36.field232 >= var22 && class36.field221 >= var23 && class36.field232 < var24 && class36.field221 < var25) {
								Statics.field1625 = var12;
							}
							if (var12.field4173 > var12.field4150) {
								method3481(var12, var12.field4161 + var14, var15, var12.field4150, var12.field4173, class36.field232, class36.field221);
							}
						}
						if (var12.field4148 == 0) {
							method6262(arg0, var12.field4249, var12.field4215, var12.field4145, var12.field4146, var22, var23, var24, var25, var14 - var12.field4261, var15 - var12.field4171);
							if (var12.field4287 != null) {
								method6262(var12.field4287, 0, var12.field4287.length - 1, var12.field4145, -1, var22, var23, var24, var25, var14 - var12.field4261, var15 - var12.field4171);
							}
							if (var12.field4146 == -1) {
								class65 var84 = (class65) field423.method7973((long) var12.field4145);
								if (var84 != null) {
									if (var84.field887 == 0 && class36.field232 >= var22 && class36.field221 >= var23 && class36.field232 < var24 && class36.field221 < var25 && !field522) {
										for (class66 var85 = (class66) field435.method8034(); var85 != null; var85 = (class66) field435.method8036()) {
											if (var85.field900) {
												var85.method2234();
												var85.field894.field4266 = false;
											}
										}
										if (Statics.field1038 == 0) {
											field613 = null;
											field537 = null;
										}
										if (!field522) {
											method181();
										}
									}
									method5921(var84.field889, var22, var23, var24, var25, var14, var15);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("by.nr(IB)Z")
	public static boolean method722(int arg0) {
		for (int var1 = 0; var1 < field443; var1++) {
			if (field512[var1] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("fc.nu(III)V")
	public static final void method3585(int arg0, int arg1) {
		if (Statics.field1555.method6865(arg0)) {
			method6538(Statics.field1555.field4038[arg0], arg1);
		}
	}

	@ObfuscatedName("nz.nb([Loi;IB)V")
	public static final void method6538(class370[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			class370 var3 = arg0[var2];
			if (var3 != null) {
				if (var3.field4148 == 0) {
					if (var3.field4287 != null) {
						method6538(var3.field4287, arg1);
					}
					if (var3.field4146 == -1) {
						class65 var4 = (class65) field423.method7973((long) var3.field4145);
						if (var4 != null) {
							method3585(var4.field889, arg1);
						}
					}
				}
				if (arg1 == 0 && var3.field4269 != null) {
					class66 var5 = new class66();
					var5.field894 = var3;
					var5.field899 = var3.field4269;
					class47.method6482(var5);
				}
				if (arg1 == 1 && var3.field4270 != null) {
					if (var3.field4146 >= 0) {
						class370 var6 = Statics.field1555.method6863(var3.field4145);
						if (var6 == null || var6.field4287 == null || var3.field4146 >= var6.field4287.length || var6.field4287[var3.field4146] != var3) {
							continue;
						}
					}
					class66 var7 = new class66();
					var7.field894 = var3;
					var7.field899 = var3.field4270;
					class47.method6482(var7);
				}
			}
		}
	}

	@ObfuscatedName("wi.ne(Loi;III)V")
	public static final void method10274(class370 arg0, int arg1, int arg2) {
		if (field613 != null || field522 || arg0 == null) {
			return;
		}
		class370 var3 = method4217(arg0);
		if (var3 == null) {
			var3 = arg0.field4232;
		}
		if (var3 == null) {
			return;
		}
		field613 = arg0;
		class370 var5 = method4217(arg0);
		if (var5 == null) {
			var5 = arg0.field4232;
		}
		field537 = var5;
		field538 = arg1;
		field558 = arg2;
		Statics.field1038 = 0;
		field547 = false;
		int var7 = method3680();
		if (var7 != -1) {
			method2765(var7);
		}
		return;
	}

	@ObfuscatedName("dq.nn(II)V")
	public static void method2765(int arg0) {
		Statics.field5587 = new class51();
		Statics.field5587.field714 = field523.field6068[arg0];
		Statics.field5587.field713 = field523.field6055[arg0];
		Statics.field5587.field712 = field523.field6056[arg0];
		Statics.field5587.field715 = field523.field6065[arg0];
		Statics.field5587.field716 = field523.field6058[arg0];
		Statics.field5587.field718 = field523.field6057[arg0];
		Statics.field5587.field717 = field523.field6063[arg0];
		Statics.field5587.field720 = field523.field6061[arg0];
		Statics.field5587.field721 = field523.field6052[arg0];
	}

	@ObfuscatedName("de.nj(Loi;I)V")
	public static void method2809(class370 arg0) {
		if (arg0 != null && field451 == arg0.field4295) {
			field437[arg0.field4294] = true;
		}
	}

	@ObfuscatedName("bz.nl(I)V")
	public static void method763() {
		for (class65 var0 = (class65) field423.method7976(); var0 != null; var0 = (class65) field423.method7977()) {
			int var1 = var0.field889;
			if (Statics.field1555.method6865(var1)) {
				boolean var2 = true;
				class370[] var3 = Statics.field1555.field4038[var1];
				for (int var4 = 0; var4 < var3.length; var4++) {
					if (var3[var4] != null) {
						var2 = var3[var4].field4144;
						break;
					}
				}
				if (!var2) {
					int var5 = (int) var0.field5601;
					class370 var6 = Statics.field1555.method6863(var5);
					if (var6 != null) {
						method2809(var6);
					}
				}
			}
		}
	}

	@ObfuscatedName("aw.nd(II)V")
	public static final void method11(int arg0) {
		if (!Statics.field1555.method6865(arg0)) {
			return;
		}
		class370[] var1 = Statics.field1555.field4038[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class370 var3 = var1[var2];
			if (var3 != null) {
				var3.field4285 = 0;
				var3.field4136 = 0;
			}
		}
	}

	@ObfuscatedName("hg.no(II)V")
	public static final void method3918(int arg0) {
		if (Statics.field1555.method6865(arg0)) {
			Statics.method3399(Statics.field1555.field4038[arg0], 0, Statics.field1555.field4038[arg0].length - 1, -1, -1);
		}
	}

	@ObfuscatedName("hy.nx(I)I")
	public static final int method4008() {
		float var0 = ((float) Statics.field240.method2517() - 0.5F) * 200.0F;
		return 100 - Math.round(var0);
	}

	@ObfuscatedName("rf.ni(IB)V")
	public static final void method8260(int arg0) {
		int var1 = Math.max(Math.min(arg0, 100), 0);
		int var2 = 100 - var1;
		float var3 = (float) var2 / 200.0F + 0.5F;
		method5522((double) var3);
	}

	@ObfuscatedName("jv.nv(D)V")
	public static final void method5522(double arg0) {
		class226.method4628(arg0);
		((class238) class226.field2633.field3011).method5067(arg0);
		if (Statics.field817 != null) {
			Statics.field817.method9841();
		}
		class214.field2382.method6456();
		Statics.field240.method2603(arg0);
	}

	@ObfuscatedName("jc.nq(II)V")
	public static final void method5115(int arg0) {
		int var1 = Math.min(Math.max(arg0, 0), 255);
		if (var1 == Statics.field240.method2519()) {
			return;
		}
		if (Statics.field240.method2519() == 0 && class340.method4085()) {
			class340.method3776(Statics.field4043, var1);
			field447 = false;
		} else if (var1 == 0) {
			class340.method5500(0, 0);
			field447 = false;
		} else {
			class340.method6334(var1);
		}
		Statics.field240.method2576(var1);
	}

	@ObfuscatedName("kr.nw(II)V")
	public static final void method5664(int arg0) {
		int var1 = Math.min(Math.max(arg0, 0), 127);
		Statics.field240.method2522(var1);
	}

	@ObfuscatedName("vm.na(II)V")
	public static final void method10040(int arg0) {
		int var1 = Math.min(Math.max(arg0, 0), 127);
		Statics.field240.method2524(var1);
	}

	@ObfuscatedName("ot.nc(IB)V")
	public static final void method7512(int arg0) {
		method763();
		class73.method8894();
		int var1 = Statics.method2459(arg0).field1983;
		if (var1 == 0) {
			return;
		}
		int var2 = Statics.field4023[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				method5522(0.9D);
			}
			if (var2 == 2) {
				method5522(0.8D);
			}
			if (var2 == 3) {
				method5522(0.7D);
			}
			if (var2 == 4) {
				method5522(0.6D);
			}
		}
		if (var1 == 3) {
			if (var2 == 0) {
				method5115(255);
			}
			if (var2 == 1) {
				method5115(192);
			}
			if (var2 == 2) {
				method5115(128);
			}
			if (var2 == 3) {
				method5115(64);
			}
			if (var2 == 4) {
				method5115(0);
			}
		}
		if (var1 == 4) {
			if (var2 == 0) {
				method5664(127);
			}
			if (var2 == 1) {
				method5664(96);
			}
			if (var2 == 2) {
				method5664(64);
			}
			if (var2 == 3) {
				method5664(32);
			}
			if (var2 == 4) {
				method5664(0);
			}
		}
		if (var1 == 5) {
			field521 = var2 == 1;
		}
		if (var1 == 6) {
			field535 = var2;
		}
		if (var1 == 9) {
		}
		if (var1 == 10) {
			if (var2 == 0) {
				method10040(127);
			}
			if (var2 == 1) {
				method10040(96);
			}
			if (var2 == 2) {
				method10040(64);
			}
			if (var2 == 3) {
				method10040(32);
			}
			if (var2 == 4) {
				method10040(0);
			}
		}
		if (var1 == 17) {
			field430 = var2 & 0xFFFF;
		}
		if (var1 == 18) {
			class85[] var3 = new class85[] { class85.field1217, class85.field1213, class85.field1212, class85.field1215, class85.field1214 };
			field341 = (class85) class432.method3817(var3, var2);
			if (field341 == null) {
				field341 = class85.field1215;
			}
		}
		if (var1 == 19) {
			if (var2 == -1) {
				field520 = -1;
			} else {
				field520 = var2 & 0x7FF;
			}
		}
		if (var1 != 22) {
			return;
		}
		class85[] var4 = new class85[] { class85.field1217, class85.field1213, class85.field1212, class85.field1215, class85.field1214 };
		field319 = (class85) class432.method3817(var4, var2);
		if (field319 == null) {
			field319 = class85.field1215;
		}
	}

	@ObfuscatedName("ue.ns(Loi;I)V")
	public static final void method9750(class370 arg0) {
		int var1 = arg0.field4169;
		if (var1 == 324) {
			if (field480 == -1) {
				field480 = arg0.field4184;
				field570 = arg0.field4185;
			}
			if (field323.field4085 == 1) {
				arg0.field4184 = field480;
			} else {
				arg0.field4184 = field570;
			}
		} else if (var1 == 325) {
			if (field480 == -1) {
				field480 = arg0.field4184;
				field570 = arg0.field4185;
			}
			if (field323.field4085 == 1) {
				arg0.field4184 = field570;
			} else {
				arg0.field4184 = field480;
			}
		} else if (var1 == 327) {
			arg0.field4201 = 150;
			arg0.field4236 = (int) (Math.sin((double) field413 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field4193 = 5;
			arg0.field4278 = 0;
		} else if (var1 == 328) {
			arg0.field4201 = 150;
			arg0.field4236 = (int) (Math.sin((double) field413 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field4193 = 5;
			arg0.field4278 = 1;
		}
	}

	@ObfuscatedName("ai.ny(I)V")
	public static final void method99() {
		class330 var0 = class330.method3456(class328.field3553, field315.field1309);
		field315.method2874(var0);
		class47.field653 = true;
		for (class65 var1 = (class65) field423.method7976(); var1 != null; var1 = (class65) field423.method7977()) {
			if (var1.field887 == 0 || var1.field887 == 3) {
				method5873(var1, true);
			}
		}
		if (field565 != null) {
			method2809(field565);
			field565 = null;
		}
		class47.field653 = false;
	}

	@ObfuscatedName("fg.np(IIII)Lcu;")
	public static final class65 method3588(int arg0, int arg1, int arg2) {
		class65 var3 = new class65();
		var3.field889 = arg1;
		var3.field887 = arg2;
		field423.method7975(var3, (long) arg0);
		method11(arg1);
		class370 var4 = Statics.field1555.method6863(arg0);
		method2809(var4);
		if (field565 != null) {
			method2809(field565);
			field565 = null;
		}
		method332(Statics.field1555.field4038[arg0 >> 16], var4, false);
		class47.method7990(arg1);
		if (field422 != -1) {
			method3585(field422, 1);
		}
		return var3;
	}

	@ObfuscatedName("ky.ng(Lcu;ZI)V")
	public static final void method5873(class65 arg0, boolean arg1) {
		int var2 = arg0.field889;
		int var3 = (int) arg0.field5601;
		arg0.method2234();
		if (arg1) {
			Statics.field1555.method6866(var2);
		}
		method5413(var2);
		class370 var4 = Statics.field1555.method6863(var3);
		if (var4 != null) {
			method2809(var4);
		}
		if (field422 != -1) {
			method3585(field422, 1);
		}
	}

	@ObfuscatedName("nq.nt(Loi;I)Z")
	public static final boolean method6788(class370 arg0) {
		int var1 = arg0.field4169;
		if (var1 == 205) {
			field580 = 250;
			return true;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = (var1 - 300) / 2;
			int var3 = var1 & 0x1;
			field323.method6972(var2, var3 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = (var1 - 314) / 2;
			int var5 = var1 & 0x1;
			field323.method6930(var4, var5 == 1);
		}
		if (var1 == 324) {
			field323.method6918(0);
		}
		if (var1 == 325) {
			field323.method6918(1);
		}
		if (var1 == 326) {
			class330 var6 = class330.method3456(class328.field3555, field315.field1309);
			field323.method6965(var6.field3665);
			field315.method2874(var6);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("av.nh(Loi;IIIB)V")
	public static final void method293(class370 arg0, int arg1, int arg2, int arg3) {
		method3420();
		class355 var4 = arg0.method7392(Statics.field1555, false);
		if (var4 == null) {
			return;
		}
		class602.method10674(arg1, arg2, var4.field4020 + arg1, var4.field4021 + arg2);
		if (field586 == 2 || field586 == 5) {
			class602.method10694(arg1, arg2, 0, var4.field4018, var4.field4019);
		} else {
			int var5 = field425 & 0x7FF;
			int var6 = field553 / 32 + 48;
			int var7 = 464 - field338 / 32;
			Statics.field2993.method10826(arg1, arg2, var4.field4020, var4.field4021, var6, var7, var5, 256, var4.field4018, var4.field4019);
			for (int var8 = 0; var8 < field578; var8++) {
				int var9 = field579[var8] * 4 + 2 - field553 / 32;
				int var10 = field508[var8] * 4 + 2 - field338 / 32;
				method2735(arg1, arg2, var9, var10, field581[var8], var4);
			}
			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class437 var13 = Statics.field3837.field1168[Statics.field3837.field1171][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field553 / 32;
						int var15 = var12 * 4 + 2 - field338 / 32;
						method2735(arg1, arg2, var14, var15, Statics.field2186[0], var4);
					}
				}
			}
			for (int var16 = 0; var16 < Statics.field3837.field1162.method9107(); var16++) {
				class82 var17 = (class82) Statics.field3837.field1161.method7917((long) Statics.field3837.field1162.method9104(var16));
				if (var17 != null && var17.method2132()) {
					class196 var18 = var17.field1185;
					if (var18 != null && var18.field2100 != null) {
						var18 = var18.method4066();
					}
					if (var18 != null && var18.field2135 && var18.field2145) {
						int var19 = var17.field1056 / 32 - field553 / 32;
						int var20 = var17.field1057 / 32 - field338 / 32;
						method2735(arg1, arg2, var19, var20, Statics.field2186[1], var4);
					}
				}
			}
			int var21 = field336.field1255;
			int[] var22 = field336.field1244;
			for (int var23 = 0; var23 < var21; var23++) {
				class70 var24 = (class70) Statics.field3837.field1170.method7917((long) var22[var23]);
				if (var24 != null && var24.method2132() && !var24.field955 && Statics.field1109 != var24) {
					int var25 = var24.field1056 / 32 - field553 / 32;
					int var26 = var24.field1057 / 32 - field338 / 32;
					if (var24.method2133()) {
						method2735(arg1, arg2, var25, var26, Statics.field2186[3], var4);
					} else if (Statics.field1109.field956 != 0 && var24.field956 != 0 && Statics.field1109.field956 == var24.field956) {
						method2735(arg1, arg2, var25, var26, Statics.field2186[4], var4);
					} else if (var24.method2136()) {
						method2735(arg1, arg2, var25, var26, Statics.field2186[5], var4);
					} else if (var24.method2130()) {
						method2735(arg1, arg2, var25, var26, Statics.field2186[6], var4);
					} else {
						method2735(arg1, arg2, var25, var26, Statics.field2186[2], var4);
					}
				}
			}
			if (field456 != 0 && field413 % 20 < 10) {
				if (field456 == 1 && field457 >= 0) {
					class82 var27 = (class82) Statics.field3837.field1161.method7917((long) field457);
					if (var27 != null) {
						int var28 = var27.field1056 / 32 - field553 / 32;
						int var29 = var27.field1057 / 32 - field338 / 32;
						method7582(arg1, arg2, var28, var29, Statics.field2277[1], var4);
					}
				}
				if (field456 == 2) {
					int var30 = field459 * 4 - Statics.field3837.field1165 * 4 + 2 - field553 / 32;
					int var31 = field460 * 4 - Statics.field3837.field1166 * 4 + 2 - field338 / 32;
					method7582(arg1, arg2, var30, var31, Statics.field2277[1], var4);
				}
				if (field456 == 10 && field458 >= 0) {
					class70 var32 = (class70) Statics.field3837.field1170.method7917((long) field458);
					if (var32 != null) {
						int var33 = var32.field1056 / 32 - field553 / 32;
						int var34 = var32.field1057 / 32 - field338 / 32;
						method7582(arg1, arg2, var33, var34, Statics.field2277[1], var4);
					}
				}
			}
			if (field582 != 0) {
				int var35 = field582 * 4 + 2 - field553 / 32;
				int var36 = field532 * 4 + 2 - field338 / 32;
				method2735(arg1, arg2, var35, var36, Statics.field2277[0], var4);
			}
			if (field334.method2313(-1) == class519.field5495 && Statics.field2277.length >= 4) {
				int var37 = var4.field4020 / 2 + arg1;
				int var38 = var4.field4021 / 2 + arg2;
				if (var4.method6784(class36.field232 - arg1, class36.field221 - arg2)) {
					int var39 = method2199(arg1, arg2, var4);
					method1863(var37, var38, var39, Statics.field2277[2]);
				}
				if (field585 > 0) {
					method1863(var37, var38, field584, Statics.field2277[3]);
				}
			}
			if (!Statics.field1109.field955) {
				class602.method10682(var4.field4020 / 2 + arg1 - 1, var4.field4021 / 2 + arg2 - 1, 3, 3, 16777215);
			}
		}
		field567[arg3] = true;
	}

	@ObfuscatedName("ca.oj(IILnq;I)I")
	public static int method2199(int arg0, int arg1, class355 arg2) {
		int var3 = arg2.field4020 / 2 + arg0;
		int var4 = arg2.field4021 / 2 + arg1;
		int var5 = class36.field232 - var3;
		int var6 = class36.field221 - var4;
		int var7 = class537.method3431(var6, var5);
		int var8 = var7 - field425;
		int var9 = var8 & 0x7FF;
		int var10 = var9 + 64;
		return (var10 & 0x7FF) / 128;
	}

	@ObfuscatedName("re.oz(Loi;IIII)V")
	public static final void method8395(class370 arg0, int arg1, int arg2, int arg3) {
		class355 var4 = arg0.method7392(Statics.field1555, false);
		if (var4 == null) {
			return;
		}
		if (field586 < 3) {
			Statics.field1905.method10826(arg1, arg2, var4.field4020, var4.field4021, 25, 25, field425, 256, var4.field4018, var4.field4019);
		} else {
			class602.method10694(arg1, arg2, 0, var4.field4018, var4.field4019);
		}
	}

	@ObfuscatedName("oy.oq(IIIILxt;Lnq;I)V")
	public static final void method7582(int arg0, int arg1, int arg2, int arg3, class606 arg4, class355 arg5) {
		int var6 = arg2 * arg2 + arg3 * arg3;
		if (var6 <= 4225 || var6 >= 90000) {
			method2735(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		int var7 = field425 & 0x7FF;
		int var8 = class226.field2638[var7];
		int var9 = class226.field2637[var7];
		int var10 = arg2 * var9 + arg3 * var8 >> 16;
		int var11 = arg3 * var9 - arg2 * var8 >> 16;
		double var12 = Math.atan2((double) var10, (double) var11);
		int var14 = arg5.field4020 / 2 - 25;
		int var15 = (int) (Math.sin(var12) * (double) var14);
		int var16 = (int) (Math.cos(var12) * (double) var14);
		byte var17 = 20;
		Statics.field1977.method10840(arg5.field4020 / 2 + arg0 - var17 / 2 + var15, arg5.field4021 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
	}

	@ObfuscatedName("dp.od(IIIILxt;Lnq;I)V")
	public static final void method2735(int arg0, int arg1, int arg2, int arg3, class606 arg4, class355 arg5) {
		if (arg4 == null) {
			return;
		}
		int var6 = field425 & 0x7FF;
		int var7 = arg2 * arg2 + arg3 * arg3;
		if (var7 > 6400) {
			return;
		}
		int var8 = class226.field2638[var6];
		int var9 = class226.field2637[var6];
		int var10 = arg2 * var9 + arg3 * var8 >> 16;
		int var11 = arg3 * var9 - arg2 * var8 >> 16;
		if (var7 > 2500) {
			arg4.method10855(arg5.field4020 / 2 + var10 - arg4.field6023 / 2, arg5.field4021 / 2 - var11 - arg4.field6025 / 2, arg0, arg1, arg5.field4020, arg5.field4021, arg5.field4018, arg5.field4019);
		} else {
			arg4.method10818(arg5.field4020 / 2 + arg0 + var10 - arg4.field6023 / 2, arg5.field4021 / 2 + arg1 - var11 - arg4.field6025 / 2);
		}
	}

	@ObfuscatedName("bc.on(IIILxt;I)V")
	public static void method1863(int arg0, int arg1, int arg2, class606 arg3) {
		int var4 = arg2 * 128;
		int var5 = field425 + var4;
		int var6 = var5 & 0x7FF;
		byte var7 = 30;
		int var8 = arg0 - (int) (class537.method4516(var6) * (double) var7);
		int var10 = class537.field5572[var6 & 0x7FF];
		double var11 = (double) var10 / 65536.0D;
		int var13 = (int) ((double) var7 * var11) + arg1;
		int var14 = Math.max(arg3.field6020, arg3.field6021);
		int var15 = var14 / 2;
		arg3.method10840(var8 - var15, var13 - var15, arg3.field6020, arg3.field6021, arg3.field6020 / 2, arg3.field6021 / 2, (double) class537.method1865(var6), 256);
	}

	@ObfuscatedName("my.oi(B)V")
	public static final void method6487() {
		Iterator var0 = field334.iterator();
		while (var0.hasNext()) {
			class80 var1 = (class80) var0.next();
			for (int var2 = 0; var2 < field336.field1255; var2++) {
				class70 var3 = (class70) var1.field1170.method7917((long) field336.field1244[var2]);
				if (var3 != null) {
					var3.method2134();
				}
			}
		}
		Iterator var4 = class92.field1288.iterator();
		while (var4.hasNext()) {
			class40 var5 = (class40) var4.next();
			var5.method740();
		}
		if (Statics.field91 != null) {
			Statics.field91.method9193();
		}
	}

	@ObfuscatedName("av.om(I)V")
	public static final void method291() {
		Iterator var0 = class92.field1288.iterator();
		while (var0.hasNext()) {
			class40 var1 = (class40) var0.next();
			var1.method760();
		}
		if (Statics.field91 != null) {
			Statics.field91.method9194();
		}
	}

	@ObfuscatedName("mn.ot(I)V")
	public static final void method6471() {
		Iterator var0 = field334.iterator();
		while (var0.hasNext()) {
			class80 var1 = (class80) var0.next();
			for (int var2 = 0; var2 < field336.field1255; var2++) {
				class70 var3 = (class70) Statics.field3837.field1170.method7917((long) field336.field1244[var2]);
				if (var3 != null) {
					var3.method2137();
				}
			}
		}
	}

	@ObfuscatedName("kv.ov(B)V")
	public static final void method5906() {
		Iterator var0 = field334.iterator();
		while (var0.hasNext()) {
			class80 var1 = (class80) var0.next();
			for (int var2 = 0; var2 < field336.field1255; var2++) {
				class70 var3 = (class70) Statics.field3837.field1170.method7917((long) field336.field1244[var2]);
				if (var3 != null) {
					var3.method2181();
				}
			}
		}
	}

	@ObfuscatedName("cr.og(I)V")
	public static final void method2089() {
		field353 = field405;
		Statics.field1615 = true;
	}

	@ObfuscatedName("fc.ow(Ljava/lang/String;I)V")
	public static final void method3587(String arg0) {
		if (Statics.field91 != null) {
			class330 var1 = class330.method3456(class328.field3609, field315.field1309);
			var1.field3665.method10320(class591.method5971(arg0));
			var1.field3665.method10504(arg0);
			field315.method2874(var1);
		}
	}

	@ObfuscatedName("ax.oo(Ljava/lang/String;I)V")
	public static final void method324(String arg0) {
		if (!arg0.equals("")) {
			class330 var1 = class330.method3456(class328.field3627, field315.field1309);
			var1.field3665.method10320(class591.method5971(arg0));
			var1.field3665.method10504(arg0);
			field315.method2874(var1);
		}
	}

	@ObfuscatedName("gp.ob(I)V")
	public static final void method3865() {
		class330 var0 = class330.method3456(class328.field3627, field315.field1309);
		var0.field3665.method10320(0);
		field315.method2874(var0);
	}

	@ObfuscatedName("dy.ok(III)V")
	public static final void method2847(int arg0, int arg1) {
		class172 var2 = arg0 >= 0 ? field583[arg0] : Statics.field1230;
		if (var2 == null || arg1 < 0 || arg1 >= var2.method3801()) {
			return;
		}
		class154 var3 = (class154) var2.field1919.get(arg1);
		if (var3.field1783 != -1) {
			return;
		}
		String var4 = var3.field1780.method11022();
		class330 var5 = class330.method3456(class328.field3605, field315.field1309);
		var5.field3665.method10320(class591.method5971(var4) + 3);
		var5.field3665.method10320(arg0);
		var5.field3665.method10321(arg1);
		var5.field3665.method10504(var4);
		field315.method2874(var5);
	}

	@ObfuscatedName("oc.ou(III)V")
	public static final void method7558(int arg0, int arg1) {
		if (field583[arg0] == null || (arg1 < 0 || arg1 >= field583[arg0].method3801())) {
			return;
		}
		class154 var2 = (class154) field583[arg0].field1919.get(arg1);
		if (var2.field1783 != -1) {
			return;
		}
		class330 var3 = class330.method3456(class328.field3603, field315.field1309);
		var3.field3665.method10320(class591.method5971(var2.field1780.method11022()) + 3);
		var3.field3665.method10320(arg0);
		var3.field3665.method10321(arg1);
		var3.field3665.method10504(var2.field1780.method11022());
		field315.method2874(var3);
	}

	@ObfuscatedName("tx.of(IIZI)V")
	public static final void method9490(int arg0, int arg1, boolean arg2) {
		if (field583[arg0] == null || (arg1 < 0 || arg1 >= field583[arg0].method3801())) {
			return;
		}
		class154 var3 = (class154) field583[arg0].field1919.get(arg1);
		class330 var4 = class330.method3456(class328.field3560, field315.field1309);
		var4.field3665.method10320(class591.method5971(var3.field1780.method11022()) + 4);
		var4.field3665.method10320(arg0);
		var4.field3665.method10321(arg1);
		var4.field3665.method10405(arg2);
		var4.field3665.method10504(var3.field1780.method11022());
		field315.method2874(var4);
	}

	@ObfuscatedName("jm.oh(II)V")
	public static void method5413(int arg0) {
		for (class360 var1 = (class360) field439.method7976(); var1 != null; var1 = (class360) field439.method7977()) {
			if ((var1.field5601 >> 16 & 0xFFFFL) == (long) arg0) {
				var1.method2234();
			}
		}
	}

	@ObfuscatedName("og.or(Loi;I)I")
	public static int method7519(class370 arg0) {
		class360 var1 = (class360) field439.method7973((long) arg0.field4145);
		class360 var2 = class360.method9540(var1, arg0.field4146);
		return var2 == null ? arg0.field4250 : var2.method6890();
	}

	@ObfuscatedName("oy.os(Loi;S)I")
	public static int method7572(class370 arg0) {
		class360 var1 = (class360) field439.method7973((long) arg0.field4145);
		class360 var2 = class360.method9540(var1, arg0.field4146);
		if (var2 == null) {
			int var3 = arg0.field4250;
			return var3 >> 1 & 0x3FF;
		} else {
			return var2.method6886();
		}
	}

	@ObfuscatedName("hb.ox(Loi;B)Loi;")
	public static class370 method4217(class370 arg0) {
		int var1 = method7519(arg0);
		int var2 = var1 >> 17 & 0x7;
		int var3 = var2;
		if (var2 == 0) {
			return null;
		}
		for (int var4 = 0; var4 < var3; var4++) {
			arg0 = Statics.field1555.method6863(arg0.field4165);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@ObfuscatedName("oj.oc(Loi;I)Z")
	public static boolean method6911(class370 arg0) {
		return arg0.field4167;
	}

	@ObfuscatedName("ha.oe(Loi;IB)Ljava/lang/String;")
	public static String method3889(class370 arg0, int arg1) {
		if (!class371.method3915(method7572(arg0), arg1) && arg0.field4257 == null) {
			return null;
		} else if (arg0.field4226 == null || arg0.field4226.length <= arg1 || arg0.field4226[arg1] == null || arg0.field4226[arg1].trim().isEmpty()) {
			return null;
		} else {
			return arg0.field4226[arg1];
		}
	}

	@ObfuscatedName("lf.oa(Loi;I)Ljava/lang/String;")
	public static String method5927(class370 arg0) {
		if (Statics.method9749(method7519(arg0)) == 0) {
			return null;
		} else if (arg0.field4170 == null || arg0.field4170.trim().isEmpty()) {
			return null;
		} else {
			return arg0.field4170;
		}
	}

	@ObfuscatedName("iy.op(Ljava/lang/String;ZI)Ljava/lang/String;")
	public static String method4455(String arg0, boolean arg1) {
		String var2 = arg1 ? "https://" : "http://";
		if (field355 == 1) {
			arg0 = arg0 + "-wtrc";
		} else if (field355 == 2) {
			arg0 = arg0 + "-wtqa";
		} else if (field355 == 3) {
			arg0 = arg0 + "-wtwip";
		} else if (field355 == 5) {
			arg0 = arg0 + "-wti";
		} else if (field355 == 4) {
			arg0 = "local";
		}
		String var3 = "";
		if (Statics.field1373 != null) {
			var3 = "/p=" + Statics.field1373;
		}
		String var4 = "runescape.com";
		return var2 + arg0 + "." + var4 + "/l=" + Statics.field2971 + "/a=" + Statics.field3393 + var3 + "/";
	}

	@ObfuscatedName("ni.oy(Ljava/lang/String;I)V")
	public static void method6781(String arg0) {
		Statics.field1373 = arg0;
		try {
			String var1 = Statics.field5520.getParameter(Integer.toString(18));
			String var2 = Statics.field5520.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
			String var4;
			if (arg0.isEmpty()) {
				var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var3 + "; Expires=" + class373.method1860(class335.method3987() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			class27.method396(Statics.field5520, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("om.ol(Ljava/lang/String;ZI)V")
	public static void method7498(String arg0, boolean arg1) {
		String var2 = arg0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;
		for (int var5 = 0; var5 < Statics.field2437; var5++) {
			class214 var6 = class214.method2737(var5);
			if ((!arg1 || var6.field2419) && var6.field2410 == -1 && var6.field2429.toLowerCase().indexOf(var2) != -1) {
				if (var4 >= 250) {
					Statics.field3022 = -1;
					Statics.field3276 = null;
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
		Statics.field3276 = var3;
		Statics.field80 = 0;
		Statics.field3022 = var4;
		String[] var9 = new String[Statics.field3022];
		for (int var10 = 0; var10 < Statics.field3022; var10++) {
			var9[var10] = class214.method2737(var3[var10]).field2429;
		}
		class582.method4103(var9, Statics.field3276);
	}

	@ObfuscatedName("gq.pz([BIB)V")
	public static void method3829(byte[] arg0, int arg1) {
		if (field473 == null) {
			field473 = new byte[24];
		}
		class481.method8994(arg0, arg1, field473, 0, 24);
	}

	@ObfuscatedName("kr.pt(Lwb;IB)V")
	public static void method5661(class591 arg0, int arg1) {
		method3829(arg0.field5917, arg1);
		class261.method10024(arg0, arg1);
	}

	@ObfuscatedName("av.po(Lwb;I)V")
	public static void method290(class591 arg0) {
		if (field473 == null) {
			byte[] var1 = class261.method1974();
			arg0.method10330(var1, 0, var1.length);
		} else {
			arg0.method10330(field473, 0, field473.length);
		}
	}

	@ObfuscatedName("lh.pr(IIIZI)V")
	public static void method6280(int arg0, int arg1, int arg2, boolean arg3) {
		class330 var4 = class330.method3456(class328.field3622, field315.field1309);
		var4.field3665.method10381(arg0);
		var4.field3665.method10371(arg2);
		var4.field3665.method10547(arg3 ? field487 : 0);
		var4.field3665.method10466(arg1);
		field315.method2874(var4);
	}

	@ObfuscatedName("ou.pd(IB)V")
	public static void method7544(int arg0) {
		field337 = arg0;
	}

	@ObfuscatedName("bl.pi(B)V")
	public static void method528() {
		if (field337 == 1) {
			field378 = true;
		}
	}

	@ObfuscatedName("cl.pq(I)V")
	public static void method2121() {
		if (!field378 || Statics.field1109 == null) {
			return;
		}
		int var0 = Statics.field1109.field1040[0];
		int var1 = Statics.field1109.field1108[0];
		if (var0 < 0 || var0 >= 104 || var1 < 0 || var1 >= 104) {
			return;
		}
		Statics.field1931 = Statics.field1109.field1056;
		int var2 = method7784(Statics.field3837, Statics.field1109.field1056, Statics.field1109.field1057, Statics.field3837.field1171) - field559;
		if (var2 < Statics.field2079) {
			Statics.field2079 = var2;
		}
		Statics.field1585 = Statics.field1109.field1057;
		field378 = false;
	}

	@ObfuscatedName("ao.pg(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method35(String arg0) {
		class398[] var1 = class398.method8270();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class398 var3 = var1[var2];
			if (var3.field4816 != -1 && arg0.startsWith(class83.method1981(var3.field4816))) {
				arg0 = arg0.substring(Integer.toString(var3.field4816).length() + 6);
				break;
			}
		}
		return arg0;
	}

	@ObfuscatedName("jv.pj(I)V")
	public static void method5523() {
		if (Statics.field1781 == null) {
			return;
		}
		field433 = field413;
		Statics.field1781.method7888();
		Iterator var0 = Statics.field3837.field1170.iterator();
		while (var0.hasNext()) {
			class70 var1 = (class70) var0.next();
			Statics.field1781.method7898((var1.field1056 >> 7) + Statics.field3837.field1165, (var1.field1057 >> 7) + Statics.field3837.field1166);
		}
	}

	@ObfuscatedName("uu.ps(Lbk;B)V")
	public static void method9655(class44 arg0) {
		if (Statics.field3831 != arg0) {
			Statics.field3831 = arg0;
		}
	}

	@ObfuscatedName("wv.pu(ZI)V")
	public static void method10165(boolean arg0) {
		field521 = arg0;
	}

	@ObfuscatedName("ak.pc(II)Lwd;")
	public static class579 method328(int arg0) {
		class579 var1 = (class579) field464.method6463((long) arg0);
		if (var1 == null) {
			var1 = new class579(Statics.field3303, class581.method8551(arg0), class581.method9450(arg0));
			field464.method6454(var1, (long) arg0);
		}
		return var1;
	}

	@ObfuscatedName("ar.pa(II)Lwd;")
	public static class579 method182(int arg0) {
		class579 var1 = (class579) field452.method6463((long) arg0);
		if (var1 == null) {
			var1 = new class579(Statics.field3303, arg0);
		}
		return var1;
	}

	@ObfuscatedName("th.pp(I)Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard method9336() {
		return Statics.field5520.method680();
	}

	@ObfuscatedName("tf.pm(II)V")
	public static void method9417(int arg0) {
		class216 var1 = class216.method3858(arg0);
		if (!var1.method4467()) {
			return;
		}
		int var2 = var1.field2459;
		class147 var3 = class216.method3379(var2);
		int var4;
		if (var3 == null) {
			var4 = 2;
		} else {
			var4 = var3.method3609() ? 0 : 1;
		}
		if (var4 == 2) {
			field602.add(var1.field2459);
		}
	}

	@ObfuscatedName("client.bv(I)V")
	public final void method541() {
	}

	public final void init() {
		if (!this.method526()) {
			return;
		}
		for (int var1 = 0; var1 <= 28; var1++) {
			String var2 = this.getParameter(Integer.toString(var1));
			if (var2 != null) {
				switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class83.field1196)) {
							field327 = true;
						} else {
							field327 = false;
						}
						break;
					case 4:
						if (field377 == -1) {
							field377 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field386 = Integer.parseInt(var2);
						break;
					case 6:
						Statics.field2971 = class433.method7996(Integer.parseInt(var2));
						break;
					case 7:
						Statics.field5354 = class386.method294(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(class83.field1196)) {
						}
						break;
					case 9:
						Statics.field1373 = var2;
						break;
					case 10:
						Statics.field5085 = (class388) class432.method3817(class388.method2129(), Integer.parseInt(var2));
						if (class388.field4425 == Statics.field5085) {
							Statics.field1293 = class563.field5768;
						} else {
							Statics.field1293 = class563.field5770;
						}
						break;
					case 11:
						Statics.field1616 = var2;
						break;
					case 12:
						field326 = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 23:
					case 24:
					default:
						break;
					case 14:
						Statics.field3393 = Integer.parseInt(var2);
						break;
					case 15:
						field355 = Integer.parseInt(var2);
						break;
					case 17:
						Statics.field3180 = var2;
						break;
					case 21:
						field389 = Integer.parseInt(var2);
						break;
					case 22:
						Statics.field3256 = var2;
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							class586.field5891 = Integer.parseInt(var2);
						} else {
							class586.field5891 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
				}
			}
		}
		method3790();
		Statics.field237 = this.getCodeBase().getHost();
		Statics.field3419 = new class414();
		String var4 = Statics.field5354.field4406;
		byte var5 = 0;
		if ((field386 & class583.field5866.method34()) != 0) {
			Statics.field1998 = "beta";
		}
		try {
			class261.method407("oldschool", Statics.field1998, var4, var5, 25);
		} catch (Exception var7) {
			class617.method9413(null, var7);
		}
		Statics.field5520 = this;
		Statics.field6090 = field377;
		method183();
		if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
			this.field350 = true;
		}
		if (field391 == -1) {
			if (this.method793() || this.method794()) {
				field391 = 5;
			} else {
				field391 = 0;
			}
		}
		this.method516(765, 503, 233, 1);
	}

	public void finalize() throws Throwable {
		class340.field3894.remove(this);
		super.finalize();
	}

	@ObfuscatedName("client.pb(I)Z")
	public boolean method790() {
		return this.field601 == 1;
	}

	public void setClient(int arg0) {
		this.field601 = arg0;
	}

	public void setOtlTokenRequester(OtlTokenRequester arg0) {
		if (arg0 != null) {
			this.field481 = arg0;
			class53.method2628(10);
		}
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
		if (arg0 != null) {
			this.field563 = arg0;
		}
	}

	public boolean isOnLoginScreen() {
		return field328 == 10;
	}

	public long getAccountHash() {
		return this.field620;
	}

	@ObfuscatedName("client.pe(I)Z")
	public boolean method793() {
		return Statics.field3222 != null && !Statics.field3222.trim().isEmpty() && Statics.field3125 != null && !Statics.field3125.trim().isEmpty();
	}

	@ObfuscatedName("client.pl(I)Z")
	public boolean method794() {
		return Statics.field3473 != null && !Statics.field3473.trim().isEmpty() && Statics.field2026 != null && !Statics.field2026.trim().isEmpty();
	}

	@ObfuscatedName("client.pw(I)Z")
	public boolean method1384() {
		return this.field481 != null;
	}

	@ObfuscatedName("client.py(Ljava/lang/String;I)V")
	public void method886(String arg0) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", arg0);
		URL var3 = new URL(Statics.field1616 + "shield/oauth/token" + (new class535(var2)).method9718());
		class485 var4 = new class485();
		if (this.method790()) {
			var4.method9067(field320);
		} else {
			var4.method9067(field591);
		}
		var4.method9058("Host", (new URL(Statics.field1616)).getHost());
		var4.method9064(class532.field5556);
		class10 var5 = class10.field35;
		RefreshAccessTokenRequester var6 = this.field563;
		if (var6 == null) {
			class11 var7 = new class11(var3, var5, var4, this.field350);
			this.field484 = this.field609.method177(var7);
		} else {
			this.field617 = var6.request(var5.method66(), var3, var4.method9057(), "");
		}
	}

	@ObfuscatedName("client.pn(Ljava/lang/String;I)V")
	public void method797(String arg0) throws IOException {
		URL var2 = new URL(Statics.field1616 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class485 var3 = new class485();
		var3.method9061(arg0);
		class10 var4 = class10.field31;
		OtlTokenRequester var5 = this.field481;
		if (var5 == null) {
			class11 var6 = new class11(var2, var4, var3, this.field350);
			this.field610 = this.field609.method177(var6);
		} else {
			this.field612 = var5.request(var4.method66(), var2, var3.method9057(), "");
		}
	}

	@ObfuscatedName("client.px(Ljava/lang/String;Ljava/lang/String;B)V")
	public void method798(String arg0, String arg1) throws IOException, JSONException {
		URL var3 = new URL(Statics.field3256 + "game-session/v1/tokens");
		class11 var4 = new class11(var3, class10.field35, this.field350);
		var4.method100().method9061(arg0);
		var4.method100().method9064(class532.field5556);
		JSONObject var5 = new JSONObject();
		var5.put("accountId", (Object) arg1);
		var4.method82(new class534(var5));
		this.field610 = this.field609.method177(var4);
	}

	@ObfuscatedName("client.ba(B)V")
	public final void method682() {
		int[] var1 = new int[] { 20, 260, 10000 };
		int[] var2 = new int[] { 1000, 100, 500 };
		if (var1 == null || var2 == null) {
			Statics.field5331 = null;
			Statics.field5296 = null;
			Statics.field918 = null;
			class483.field5332.clear();
			class483.field5332.add(100);
			class483.field5332.add(5000);
			class483.field5332.add(10000);
			class483.field5332.add(30000);
		} else {
			Statics.field5331 = var1;
			Statics.field5296 = new int[var1.length];
			Statics.field918 = new byte[var1.length][][];
			for (int var3 = 0; var3 < Statics.field5331.length; var3++) {
				Statics.field918[var3] = new byte[var2[var3]][];
				class483.field5332.add(var1[var3]);
			}
			Collections.sort(class483.field5332);
		}
		Statics.field5442 = Statics.method9398(field386, class583.field5866);
		Statics.field5090 = field355 == 0 ? 43594 : field326 + 40000;
		Statics.field5607 = field355 == 0 ? 443 : field326 + 50000;
		Statics.field1771 = Statics.field5090;
		Statics.field150 = class368.field4126;
		Statics.field4075 = class368.field4121;
		Statics.field4076 = class368.field4120;
		Statics.field4077 = class368.field4122;
		Statics.field1508 = new class121(this.field350, 233);
		this.method507();
		this.method512();
		Statics.field1729 = this.method658();
		this.method542(field599, 0);
		this.method542(field552, 1);
		this.method506();
		Statics.field1074 = new class516(255, class261.field3112, class261.field3109, 750000);
		class566 var4 = null;
		class79 var5 = new class79();
		try {
			var4 = class261.method496("", Statics.field5085.field4420, false);
			byte[] var6 = new byte[(int) var4.method10081()];
			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) {
				var8 = var4.method10070(var6, var7, var6.length - var7);
				if (var8 == -1) {
					throw new IOException();
				}
			}
			var5 = new class79(new class591(var6));
		} catch (Exception var16) {
		}
		try {
			if (var4 != null) {
				var4.method10067();
			}
		} catch (Exception var15) {
		}
		Statics.field240 = var5;
		String var13 = Statics.field181;
		class32.field159 = this;
		if (var13 != null) {
			class32.field160 = var13;
		}
		method4230(Statics.field240.method2525());
		Statics.field280 = new class46(Statics.field1293);
		this.field609 = new class15("tokenRequest", 1, 1);
		class340.method3908(this);
		field318.method5896();
		class220 var14 = new class220(3, 1, 0);
		var14.method4539(-64, -8, 64);
		var14.method4539(64, -8, 64);
		var14.method4539(0, -8, -24);
		var14.method4540(0, 2, 1, (byte) 1, (byte) -1, (short) 10173, (short) -1);
		Statics.field3342 = var14.method4553(1, 32, 0, -128, 0);
		Statics.field5749 = var14.method4553(64, 850, -30, -50, -30);
	}

	@ObfuscatedName("client.bb(I)V")
	public final void method618() {
		field413++;
		this.method801();
		while (true) {
			class437 var1 = class409.field4905;
			class408 var2;
			synchronized (class409.field4905) {
				var2 = (class408) class409.field4909.method8060();
			}
			if (var2 == null) {
				boolean var4 = false;
				boolean var5 = false;
				if (!class340.field3893.isEmpty()) {
					class478 var6 = (class478) class340.field3893.get(0);
					if (var6 == null) {
						class340.field3893.remove(0);
					} else if (var6.method8969()) {
						if (var6.method8981()) {
							System.out.println("Error in midimanager.service: " + var6.method8984());
							var4 = true;
						} else {
							if (var6.method8986() != null) {
								class340.field3893.add(1, var6.method8986());
							}
							var5 = var6.method8983();
						}
						class340.field3893.remove(0);
					} else {
						var5 = var6.method8983();
					}
				}
				if (var4) {
					class340.field3893.clear();
					class340.method5043();
				}
				if (var5 && field447 && Statics.field964 != null) {
					Statics.field964.method2981();
				}
				method3420();
				field552.method5690();
				this.method659();
				class36.method3864();
				if (Statics.field1729 != null) {
					int var9 = Statics.field1729.method311();
					field551 = var9;
				}
				if (field328 == 0) {
					method1505();
					class35.method3593();
				} else if (field328 == 5) {
					class53.method5645(this, Statics.field3948, Statics.field5240);
					method1505();
					class35.method3593();
				} else if (field328 == 10 || field328 == 11) {
					class53.method5645(this, Statics.field3948, Statics.field5240);
				} else if (field328 == 20) {
					class53.method5645(this, Statics.field3948, Statics.field5240);
					this.method803();
				} else if (field328 == 50) {
					class53.method5645(this, Statics.field3948, Statics.field5240);
					this.method803();
				} else if (field328 == 25) {
					if (field557) {
						method8980();
					}
					if (field454) {
						method7887(Statics.field2979);
					}
					if (!field454 && !field557) {
						method3384(30);
					}
				}
				if (field328 == 30) {
					this.method804();
				} else if (field328 == 40 || field328 == 45) {
					this.method803();
				}
				return;
			}
			var2.field4900.method7644(var2.field4898, (int) var2.field5601, var2.field4897, false);
		}
	}

	@ObfuscatedName("client.bo(ZI)V")
	public final void method533(boolean arg0) {
		class73.method4082();
		if ((field328 == 10 || field328 == 20 || field328 == 30) && field360 != 0L && class335.method3987() > field360) {
			method4230(method724());
		}
		if (arg0) {
			for (int var2 = 0; var2 < 100; var2++) {
				field437[var2] = true;
			}
		}
		if (field328 == 0) {
			this.method637(class53.field734, class53.field731, arg0, Statics.field794);
		} else if (field328 == 5) {
			class53.method9397(Statics.field3832, Statics.field3948, Statics.field5240);
		} else if (field328 == 10 || field328 == 11) {
			class53.method9397(Statics.field3832, Statics.field3948, Statics.field5240);
		} else if (field328 == 20) {
			class53.method9397(Statics.field3832, Statics.field3948, Statics.field5240);
		} else if (field328 == 50) {
			class53.method9397(Statics.field3832, Statics.field3948, Statics.field5240);
		} else if (field328 == 25) {
			if (field557) {
				if (field477 == 1) {
					if (field411 > field412) {
						field412 = field411;
					}
					int var3 = (field412 * 50 - field411 * 50) / field412;
					method8746(class394.field4704 + class83.field1203 + class83.field1202 + var3 + "%" + class83.field1199, false);
				} else if (field477 == 2) {
					if (field330 > field414) {
						field414 = field330;
					}
					int var4 = (field414 * 50 - field330 * 50) / field414 + 50;
					method8746(class394.field4704 + class83.field1203 + class83.field1202 + var4 + "%" + class83.field1199, false);
				} else {
					method8746(class394.field4704, false);
				}
			}
		} else if (field328 == 30) {
			this.method809();
		} else if (field328 == 40) {
			method8746(class394.field4599 + class83.field1203 + class394.field4594, false);
		} else if (field328 == 45) {
			method8746(class394.field4654, false);
		}
		if (field328 == 30 && field573 == 0 && !arg0 && !field432) {
			for (int var5 = 0; var5 < field564; var5++) {
				if (field567[var5]) {
					Statics.field182.method490(field569[var5], field468[var5], field571[var5], field614[var5]);
					field567[var5] = false;
				}
			}
		} else if (field328 > 0) {
			Statics.field182.method479(0, 0);
			for (int var6 = 0; var6 < field564; var6++) {
				field567[var6] = false;
			}
		}
	}

	@ObfuscatedName("client.bl(I)V")
	public final void method534() {
		if (Statics.field5479 != null && Statics.field5479.method2846()) {
			Statics.field5479.method2819();
		}
		if (Statics.field4847 != null) {
			Statics.field4847.field910 = false;
		}
		Statics.field4847 = null;
		field315.method2886();
		if (class36.field227 != null) {
			class36 var1 = class36.field227;
			synchronized (class36.field227) {
				class36.field227 = null;
			}
		}
		Statics.field1729 = null;
		if (Statics.field964 != null) {
			Statics.field964.method2982();
		}
		Statics.field3419.method7804();
		class409.method3526();
		if (Statics.field1508 != null) {
			Statics.field1508.method3369();
			Statics.field1508 = null;
		}
		class261.method321();
		this.field609.method172();
	}

	@ObfuscatedName("client.pk(I)V")
	public void method801() {
		if (field328 != 1000) {
			boolean var1 = Statics.field3419.method7795();
			if (!var1) {
				this.method926();
			}
		}
	}

	@ObfuscatedName("client.pf(I)V")
	public void method926() {
		if (Statics.field3419.field4991 >= 4) {
			this.method537("js5crc");
			method3384(1000);
			return;
		}
		if (Statics.field3419.field4987 >= 4) {
			if (field328 <= 5) {
				this.method537("js5io");
				method3384(1000);
				return;
			}
			field527 = 3000;
			Statics.field3419.field4987 = 3;
		}
		if (--field527 + 1 > 0) {
			return;
		}
		try {
			if (field404 == 0) {
				Statics.field384 = Statics.field1567.method5504(Statics.field237, Statics.field1771);
				field404++;
			}
			if (field404 == 1) {
				if (Statics.field384.field3155 == 2) {
					this.method1087(-1);
					return;
				}
				if (Statics.field384.field3155 == 1) {
					field404++;
				}
			}
			if (field404 == 2) {
				Socket var1 = (Socket) Statics.field384.field3156;
				class513 var2 = new class513(var1, 40000, 5000);
				Statics.field1504 = var2;
				class591 var3 = new class591(class332.field3812.field3821 + 1);
				var3.method10320(class332.field3812.field3820);
				var3.method10547(233);
				var3.method10547(field434[0]);
				var3.method10547(field434[1]);
				var3.method10547(field434[2]);
				var3.method10547(field434[3]);
				Statics.field1504.method9429(var3.field5917, 0, class332.field3812.field3821 + 1);
				field404++;
				Statics.field1971 = class335.method3987();
			}
			if (field404 == 3) {
				if (Statics.field1504.method9418() > 0) {
					int var4 = Statics.field1504.method9441();
					if (var4 != 0) {
						this.method1087(var4);
						return;
					}
					field404++;
				} else if (class335.method3987() - Statics.field1971 > 30000L) {
					this.method1087(-2);
					return;
				}
			}
			if (field404 == 4) {
				Statics.field3419.method7801(Statics.field1504, field328 > 20);
				Statics.field384 = null;
				Statics.field1504 = null;
				field404 = 0;
				field406 = 0;
			}
		} catch (IOException var6) {
			this.method1087(-3);
		}
	}

	@ObfuscatedName("client.pv(II)V")
	public void method1087(int arg0) {
		Statics.field384 = null;
		Statics.field1504 = null;
		field404 = 0;
		if (Statics.field5090 == Statics.field1771) {
			Statics.field1771 = Statics.field5607;
		} else {
			Statics.field1771 = Statics.field5090;
		}
		field406++;
		if (field406 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (field328 <= 5) {
				this.method537("js5connect_full");
				method3384(1000);
			} else {
				field527 = 3000;
			}
		} else if (field406 >= 2 && arg0 == 6) {
			this.method537("js5connect_outofdate");
			method3384(1000);
		} else if (field406 >= 4) {
			if (field328 <= 5) {
				this.method537("js5connect");
				method3384(1000);
			} else {
				field527 = 3000;
			}
		}
	}

	@ObfuscatedName("client.ql(I)V")
	public final void method803() {
		class512 var1 = field315.method2873();
		class590 var2 = field315.field1294;
		try {
			if (class44.field297 == Statics.field3831) {
				if (Statics.field1562 == null && (field466.method1944() || field352 > 250)) {
					Statics.field1562 = field466.method1945();
					field466.method1942();
					field466 = null;
				}
				if (Statics.field1562 != null) {
					if (var1 != null) {
						var1.method9422();
						var1 = null;
					}
					Statics.field4980 = null;
					field471 = false;
					field352 = 0;
					if (!field331.method10651()) {
						method9655(class44.field289);
					} else if (this.method793()) {
						try {
							this.method886(Statics.field3125);
							method9655(class44.field310);
						} catch (Throwable var73) {
							class617.method9413(null, var73);
							Statics.method4300(65);
							return;
						}
					} else if (this.method794()) {
						try {
							this.method798(Statics.field3473, Statics.field2026);
							method9655(class44.field309);
						} catch (Exception var72) {
							class617.method9413(null, var72);
							Statics.method4300(65);
							return;
						}
					} else {
						Statics.method4300(65);
						return;
					}
				}
			}
			if (class44.field310 == Statics.field3831) {
				if (this.field617 == null) {
					if (this.field484 == null) {
						Statics.method4300(65);
						return;
					}
					if (!this.field484.method272()) {
						return;
					}
					if (this.field484.method271()) {
						class617.method9413(this.field484.method269(), null);
						Statics.method4300(65);
						this.field484 = null;
						return;
					}
					class21 var7 = this.field484.method275();
					if (var7.method296() != 200) {
						Statics.method4300(65);
						this.field484 = null;
						return;
					}
					field352 = 0;
					class534 var8 = new class534(var7.method303());
					try {
						Statics.field3222 = var8.method9709().getString("access_token");
						Statics.field3125 = var8.method9709().getString("refresh_token");
					} catch (Exception var70) {
						class617.method9413("Error parsing tokens", var70);
						Statics.method4300(65);
						this.field484 = null;
						return;
					}
				} else if (this.field617.isDone()) {
					if (this.field617.isCancelled()) {
						Statics.method4300(65);
						this.field617 = null;
						return;
					}
					try {
						RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field617.get();
						if (!var5.isSuccess()) {
							Statics.method4300(65);
							this.field617 = null;
							return;
						}
						Statics.field3222 = var5.getAccessToken();
						Statics.field3125 = var5.getRefreshToken();
						this.field617 = null;
					} catch (Exception var71) {
						class617.method9413(null, var71);
						Statics.method4300(65);
						this.field617 = null;
						return;
					}
				} else {
					return;
				}
				this.method797(Statics.field3222);
				method9655(class44.field309);
			}
			if (class44.field309 == Statics.field3831) {
				if (this.field612 == null) {
					if (this.field610 == null) {
						Statics.method4300(65);
						return;
					}
					if (!this.field610.method272()) {
						return;
					}
					if (this.field610.method271()) {
						class617.method9413(this.field610.method269(), null);
						Statics.method4300(65);
						this.field610 = null;
						return;
					}
					class21 var12 = this.field610.method275();
					if (var12.method296() != 200) {
						class617.method9413("Login authentication error. Response code: " + var12.method296() + " " + var12.method297() + " Response body: " + var12.method303(), null);
						Statics.method4300(65);
						this.field610 = null;
						return;
					}
					List var13 = (List) var12.method295().get("Content-Type");
					if (var13 != null && var13.contains(class532.field5556.method9695())) {
						try {
							JSONObject var14 = new JSONObject(var12.method303());
							this.field608 = var14.getString("token");
						} catch (JSONException var68) {
							class617.method9413(null, var68);
							Statics.method4300(65);
							this.field610 = null;
							return;
						}
					} else {
						this.field608 = var12.method303();
					}
					this.field610 = null;
				} else if (this.field612.isDone()) {
					if (this.field612.isCancelled()) {
						Statics.method4300(65);
						this.field612 = null;
						return;
					}
					try {
						OtlTokenResponse var10 = (OtlTokenResponse) this.field612.get();
						if (!var10.isSuccess()) {
							Statics.method4300(65);
							this.field612 = null;
							return;
						}
						this.field608 = var10.getToken();
						this.field612 = null;
					} catch (Exception var69) {
						class617.method9413(null, var69);
						Statics.method4300(65);
						this.field612 = null;
						return;
					}
				} else {
					return;
				}
				field352 = 0;
				method9655(class44.field289);
			}
			if (class44.field289 == Statics.field3831) {
				if (Statics.field4980 == null) {
					Statics.field4980 = Statics.field1567.method5504(Statics.field237, Statics.field1771);
				}
				if (Statics.field4980.field3155 == 2) {
					throw new IOException();
				}
				if (Statics.field4980.field3155 == 1) {
					Socket var16 = (Socket) Statics.field4980.field3156;
					class513 var17 = new class513(var16, 40000, 5000);
					var1 = var17;
					field315.method2883(var17);
					Statics.field4980 = null;
					method9655(class44.field311);
				}
			}
			if (class44.field311 == Statics.field3831) {
				field315.method2868();
				class330 var18;
				if (class330.field3662 == 0) {
					var18 = new class330();
				} else {
					var18 = class330.field3663[--class330.field3662];
				}
				var18.field3659 = null;
				var18.field3664 = 0;
				var18.field3665 = new class590(5000);
				var18.field3665.method10320(class332.field3822.field3820);
				field315.method2874(var18);
				field315.method2869();
				var2.field5920 = 0;
				method9655(class44.field291);
			}
			if (class44.field291 == Statics.field3831) {
				if (Statics.field964 != null) {
					Statics.field964.method2980();
				}
				if (var1.method9435(1)) {
					int var22 = var1.method9441();
					if (Statics.field964 != null) {
						Statics.field964.method2980();
					}
					if (var22 != 0) {
						Statics.method4300(var22);
						return;
					}
					var2.field5920 = 0;
					method9655(class44.field292);
				}
			}
			if (class44.field292 == Statics.field3831) {
				if (var2.field5920 < 8) {
					int var23 = var1.method9418();
					if (var23 > 8 - var2.field5920) {
						var23 = 8 - var2.field5920;
					}
					if (var23 > 0) {
						var1.method9420(var2.field5917, var2.field5920, var23);
						var2.field5920 += var23;
					}
				}
				if (var2.field5920 == 8) {
					var2.field5920 = 0;
					Statics.field2847 = var2.method10346();
					method9655(class44.field293);
				}
			}
			if (class44.field293 == Statics.field3831) {
				field315.field1294.field5920 = 0;
				field315.method2868();
				class590 var24 = new class590(500);
				int[] var25 = new int[] { Statics.field1562.nextInt(), Statics.field1562.nextInt(), Statics.field1562.nextInt(), Statics.field1562.nextInt() };
				var24.field5920 = 0;
				var24.method10320(1);
				var24.method10547(var25[0]);
				var24.method10547(var25[1]);
				var24.method10547(var25[2]);
				var24.method10547(var25[3]);
				var24.method10325(Statics.field2847);
				if (field328 == 40) {
					var24.method10547(field434[0]);
					var24.method10547(field434[1]);
					var24.method10547(field434[2]);
					var24.method10547(field434[3]);
				} else {
					if (field328 == 50) {
						var24.method10320(class132.field1596.method34());
						var24.method10547(Statics.field5779);
					} else {
						var24.method10320(field572.method34());
						switch(field572.field1600) {
							case 0:
							case 4:
								var24.method10322(Statics.field258);
								var24.field5920++;
								break;
							case 1:
								var24.method10547(Statics.field240.method2532(class53.field737));
								break;
							case 2:
								var24.field5920 += 4;
							case 3:
						}
					}
					if (field331.method10651()) {
						var24.method10320(class596.field5975.method34());
						var24.method10504(this.field608);
					} else {
						var24.method10320(class596.field5971.method34());
						var24.method10504(class53.field727);
					}
				}
				var24.method10367(class52.field726, class52.field724);
				field434 = var25;
				class330 var26;
				if (class330.field3662 == 0) {
					var26 = new class330();
				} else {
					var26 = class330.field3663[--class330.field3662];
				}
				var26.field3659 = null;
				var26.field3664 = 0;
				var26.field3665 = new class590(5000);
				var26.field3665.field5920 = 0;
				if (field328 == 40) {
					var26.field3665.method10320(class332.field3814.field3820);
				} else {
					var26.field3665.method10320(class332.field3813.field3820);
				}
				var26.field3665.method10321(0);
				int var30 = var26.field3665.field5920;
				var26.field3665.method10547(233);
				var26.field3665.method10547(1);
				if (class586.field5891 >= 232) {
					var26.field3665.method10547(class586.field5891);
				}
				var26.field3665.method10320(field377);
				var26.field3665.method10320(field391);
				byte var31 = 0;
				var26.field3665.method10320(var31);
				var26.field3665.method10330(var24.field5917, 0, var24.field5920);
				int var32 = var26.field3665.field5920;
				var26.field3665.method10504(class53.field737);
				var26.field3665.method10320((field432 ? 1 : 0) << 1 | (field566 ? 1 : 0));
				var26.field3665.method10321(Statics.field208);
				var26.field3665.method10321(Statics.field4810);
				method290(var26.field3665);
				var26.field3665.method10504(Statics.field1373);
				var26.field3665.method10547(Statics.field3393);
				var26.field3665.method10320(0);
				class591 var33 = new class591(Statics.field3493.method9781());
				Statics.field3493.method9780(var33);
				var26.field3665.method10330(var33.field5917, 0, var33.field5917.length);
				var26.field3665.method10320(field377);
				var26.field3665.method10547(0);
				if (Statics.field5442) {
					method3603(var26);
				} else {
					var26.field3665.method10393(Statics.field131.field4960);
					var26.field3665.method10392(Statics.field1515.field4960);
					var26.field3665.method10393(Statics.field5662.field4960);
					var26.field3665.method10392(Statics.field3507.field4960);
					var26.field3665.method10547(Statics.field5031.field4960);
					var26.field3665.method10392(0);
					var26.field3665.method10393(Statics.field1761.field4960);
					var26.field3665.method10547(Statics.field1831.field4960);
					var26.field3665.method10547(Statics.field689.field4960);
					var26.field3665.method10377(Statics.field1987.field4960);
					var26.field3665.method10393(Statics.field5020.field4960);
					var26.field3665.method10377(Statics.field3303.field4960);
					var26.field3665.method10393(Statics.field1727.field4960);
					var26.field3665.method10377(Statics.field2092.field4960);
					var26.field3665.method10392(Statics.field3842.field4960);
					var26.field3665.method10392(Statics.field3101.field4960);
					var26.field3665.method10392(Statics.field914.field4960);
					var26.field3665.method10393(Statics.field3205.field4960);
					var26.field3665.method10392(Statics.field1957.field4960);
					var26.field3665.method10392(Statics.field5388.field4960);
					var26.field3665.method10392(Statics.field5346.field4960);
					var26.field3665.method10547(Statics.field281.field4960);
					var26.field3665.method10377(Statics.field4043.field4960);
				}
				var26.field3665.method10338(var25, var32, var26.field3665.field5920);
				var26.field3665.method10333(var26.field3665.field5920 - var30);
				field315.method2874(var26);
				field315.method2869();
				field315.field1309 = new class609(var25);
				int[] var34 = new int[4];
				for (int var35 = 0; var35 < 4; var35++) {
					var34[var35] = var25[var35] + 50;
				}
				var2.method10282(var34);
				method9655(class44.field302);
			}
			if (class44.field302 == Statics.field3831 && var1.method9418() > 0) {
				int var36 = var1.method9441();
				if (var36 == 61) {
					int var37 = var1.method9418();
					Statics.field5782 = var37 == 1 && var1.method9441() == 1;
					method9655(class44.field293);
				}
				if (var36 == 21 && field328 == 20) {
					method9655(class44.field306);
				} else if (var36 == 2) {
					if (Statics.field5442) {
						method9655(class44.field305);
					} else {
						method9655(class44.field299);
					}
				} else if (var36 == 15 && field328 == 40) {
					field315.field1295 = -1;
					method9655(class44.field308);
				} else if (var36 == 64) {
					method9655(class44.field298);
				} else if (var36 == 23 && field449 < 1) {
					field449++;
					method9655(class44.field297);
				} else if (var36 == 29) {
					method9655(class44.field288);
				} else if (var36 == 69) {
					method9655(class44.field295);
				} else {
					Statics.method4300(var36);
					return;
				}
			}
			if (class44.field305 == Statics.field3831) {
				Statics.field794 = true;
				method2126(class71.field963);
				method3384(0);
			}
			if (class44.field295 == Statics.field3831 && var1.method9418() >= 2) {
				var1.method9420(var2.field5917, 0, 2);
				var2.field5920 = 0;
				Statics.field2813 = var2.method10341();
				method9655(class44.field313);
			}
			if (class44.field313 == Statics.field3831 && var1.method9418() >= Statics.field2813) {
				var2.field5920 = 0;
				var1.method9420(var2.field5917, var2.field5920, Statics.field2813);
				class7[] var38 = new class7[] { class7.field15 };
				class7 var39 = var38[var2.method10339()];
				try {
					switch(var39.field16) {
						case 0:
							class1 var40 = new class1();
							this.field619 = new class8(var2, var40);
							method9655(class44.field294);
							break;
						default:
							throw new IllegalArgumentException();
					}
				} catch (Exception var67) {
					Statics.method4300(22);
					return;
				}
			}
			if (class44.field294 == Statics.field3831 && this.field619.method40()) {
				this.field618 = this.field619.method51();
				this.field619.method49();
				this.field619 = null;
				if (this.field618 == null) {
					Statics.method4300(22);
					return;
				}
				field315.method2868();
				class330 var43;
				if (class330.field3662 == 0) {
					var43 = new class330();
				} else {
					var43 = class330.field3663[--class330.field3662];
				}
				var43.field3659 = null;
				var43.field3664 = 0;
				var43.field3665 = new class590(5000);
				var43.field3665.method10320(class332.field3815.field3820);
				var43.field3665.method10321(this.field618.field5920);
				var43.field3665.method10331(this.field618);
				field315.method2874(var43);
				field315.method2869();
				this.field618 = null;
				method9655(class44.field302);
			}
			if (class44.field298 == Statics.field3831 && var1.method9418() > 0) {
				Statics.field1426 = var1.method9441();
				method9655(class44.field300);
			}
			if (class44.field300 == Statics.field3831 && var1.method9418() >= Statics.field1426) {
				var1.method9420(var2.field5917, 0, Statics.field1426);
				var2.field5920 = 0;
				method9655(class44.field302);
			}
			if (class44.field306 == Statics.field3831 && var1.method9418() > 0) {
				field465 = (var1.method9441() + 3) * 60;
				method9655(class44.field301);
			}
			if (class44.field301 == Statics.field3831) {
				field352 = 0;
				class53.method2114(class394.field4521, class394.field4522, field465 / 60 + class394.field4523);
				if (--field465 <= 0) {
					method9655(class44.field297);
				}
			} else if (class44.field312 == Statics.field3831) {
				class330 var47;
				if (class330.field3662 == 0) {
					var47 = new class330();
				} else {
					var47 = class330.field3663[--class330.field3662];
				}
				var47.field3659 = null;
				var47.field3664 = 0;
				var47.field3665 = new class590(5000);
				var47.field3665.method10320(class332.field3818.field3820);
				var47.field3665.method10321(class332.field3818.field3821);
				var47.field3665.method10547(Statics.field1987.field4960);
				var47.field3665.method10547(Statics.field3303.field4960);
				var47.field3665.method10392(Statics.field281.field4960);
				var47.field3665.method10393(Statics.field1957.field4960);
				var47.field3665.method10392(Statics.field5020.field4960);
				var47.field3665.method10393(Statics.field3205.field4960);
				var47.field3665.method10377(Statics.field5031.field4960);
				var47.field3665.method10393(Statics.field1761.field4960);
				var47.field3665.method10547(Statics.field3842.field4960);
				var47.field3665.method10392(Statics.field914.field4960);
				var47.field3665.method10392(Statics.field5346.field4960);
				var47.field3665.method10392(Statics.field3101.field4960);
				var47.field3665.method10377(Statics.field3507.field4960);
				var47.field3665.method10393(Statics.field5662.field4960);
				var47.field3665.method10547(Statics.field689.field4960);
				var47.field3665.method10377(0);
				field315.method2874(var47);
				field315.method2869();
				method9655(class44.field299);
			} else {
				if (class44.field299 == Statics.field3831 && var1.method9418() >= 1) {
					Statics.field919 = var1.method9441();
					if (Statics.field919 != class332.field3817.field3821) {
						Statics.method4300(Statics.field919);
						return;
					}
					method9655(class44.field303);
				}
				if (class44.field303 == Statics.field3831 && var1.method9418() >= Statics.field919) {
					boolean var51 = var1.method9441() == 1;
					var1.method9420(var2.field5917, 0, 4);
					var2.field5920 = 0;
					boolean var52 = false;
					if (var51) {
						int var53 = var2.method10285() << 24;
						int var54 = var53 | var2.method10285() << 16;
						int var55 = var54 | var2.method10285() << 8;
						int var56 = var55 | var2.method10285();
						Statics.field240.method2531(class53.field737, var56);
					}
					if (field332) {
						Statics.field240.method2539(class53.field737);
					} else {
						Statics.field240.method2539(null);
					}
					class79.method2061();
					field429 = var1.method9441();
					field431 = var1.method9441() == 1;
					field492 = var1.method9441();
					field492 <<= 0x8;
					field492 += var1.method9441();
					field345 = var1.method9441();
					var1.method9420(var2.field5917, 0, 8);
					var2.field5920 = 0;
					this.field620 = var2.method10346();
					var1.method9420(var2.field5917, 0, 8);
					var2.field5920 = 0;
					field510 = var2.method10346();
					var1.method9420(var2.field5917, 0, 8);
					var2.field5920 = 0;
					field511 = var2.method10346();
					class266.method5521().method5587(this.field350);
					method9655(class44.field304);
				}
				if (class44.field304 == Statics.field3831 && var1.method9418() >= field315.field1295) {
					var1.method9420(var2.field5917, 0, 1);
					var2.field5920 = 0;
					if (var2.method10286()) {
						var1.method9420(var2.field5917, 1, 1);
						var2.field5920 = 0;
					}
					class331[] var57 = class331.method3819();
					int var58 = var2.method10280();
					if (var58 < 0 || var58 >= var57.length) {
						throw new IOException("Invalid ServerProt: " + var58 + " at " + var2.field5920);
					}
					field315.field1305 = var57[var58];
					field315.field1295 = field315.field1305.field3810;
					var1.method9420(var2.field5917, 0, 2);
					var2.field5920 = 0;
					field315.field1295 = var2.method10341();
					try {
						client var59 = Statics.field5520;
						JSObject.getWindow(var59).call("zap", null);
					} catch (Throwable var66) {
					}
					method9655(class44.field290);
				}
				if (class44.field290 != Statics.field3831) {
					if (class44.field288 == Statics.field3831 && var1.method9418() >= 2) {
						var2.field5920 = 0;
						var1.method9420(var2.field5917, 0, 2);
						var2.field5920 = 0;
						Statics.field1602 = var2.method10341();
						method9655(class44.field307);
					}
					if (class44.field307 == Statics.field3831 && var1.method9418() >= Statics.field1602) {
						var2.field5920 = 0;
						var1.method9420(var2.field5917, 0, Statics.field1602);
						var2.field5920 = 0;
						String var61 = var2.method10350();
						String var62 = var2.method10350();
						String var63 = var2.method10350();
						class53.method2114(var61, var62, var63);
						method3384(10);
						if (field331.method10651()) {
							class53.method2628(9);
						}
					}
					if (class44.field308 == Statics.field3831) {
						if (field315.field1295 == -1) {
							if (var1.method9418() < 2) {
								return;
							}
							var1.method9420(var2.field5917, 0, 2);
							var2.field5920 = 0;
							field315.field1295 = var2.method10341();
						}
						if (var1.method9418() >= field315.field1295) {
							var1.method9420(var2.field5917, 0, field315.field1295);
							var2.field5920 = 0;
							int var64 = field315.field1295;
							field472.method7610();
							method6282();
							field336.method2782(var2);
							if (var2.field5920 != var64) {
								throw new RuntimeException();
							}
						}
					} else {
						field352++;
						if (field352 > 2000) {
							if (field449 < 1) {
								if (Statics.field5090 == Statics.field1771) {
									Statics.field1771 = Statics.field5607;
								} else {
									Statics.field1771 = Statics.field5090;
								}
								field449++;
								method9655(class44.field297);
							} else {
								Statics.method4300(-3);
							}
						}
					}
				} else if (var1.method9418() >= field315.field1295) {
					var2.field5920 = 0;
					var1.method9420(var2.field5917, 0, field315.field1295);
					field472.method7608();
					method6988();
					field336.method2782(var2);
					method6265();
					Statics.field3188 = -1;
					method3415(false, var2);
					field315.field1305 = null;
					field455 = false;
				}
			}
		} catch (IOException var74) {
			if (field449 < 1) {
				if (Statics.field5090 == Statics.field1771) {
					Statics.field1771 = Statics.field5607;
				} else {
					Statics.field1771 = Statics.field5090;
				}
				field449++;
				method9655(class44.field297);
			} else {
				Statics.method4300(-2);
			}
		}
	}

	@ObfuscatedName("client.qb(I)V")
	public final void method804() {
		if (field374 > 1) {
			field374--;
		}
		if (field580 > 0) {
			field580--;
		}
		if (field471) {
			field471 = false;
			method6899();
			return;
		}
		if (!field522) {
			method181();
		}
		this.method1352();
		if (field328 != 30) {
			return;
		}
		while (true) {
			class38 var1 = (class38) class37.field242.method8092();
			boolean var2;
			if (var1 == null) {
				var2 = false;
			} else {
				var2 = true;
			}
			if (!var2) {
				if (field472.field4866) {
					class330 var5 = class330.method3456(class328.field3554, field315.field1309);
					var5.field3665.method10320(0);
					int var6 = var5.field3665.field5920;
					field472.method7622(var5.field3665);
					var5.field3665.method10334(var5.field3665.field5920 - var6);
					field315.method2874(var5);
					field472.method7611();
				}
				Object var7 = Statics.field4847.field907;
				synchronized (Statics.field4847.field907) {
					if (!field428) {
						Statics.field4847.field908 = 0;
					} else if (class36.field223 != 0 || Statics.field4847.field908 >= 40) {
						class330 var8 = null;
						int var9 = 0;
						int var10 = 0;
						int var11 = 0;
						int var12 = 0;
						for (int var13 = 0; var13 < Statics.field4847.field908 && (var8 == null || var8.field3665.field5920 - var9 < 246); var13++) {
							var10 = var13;
							int var14 = Statics.field4847.field911[var13];
							if (var14 < -1) {
								var14 = -1;
							} else if (var14 > 65534) {
								var14 = 65534;
							}
							int var15 = Statics.field4847.field909[var13];
							if (var15 < -1) {
								var15 = -1;
							} else if (var15 > 65534) {
								var15 = 65534;
							}
							if (field387 != var15 || field397 != var14) {
								if (var8 == null) {
									var8 = class330.method3456(class328.field3545, field315.field1309);
									var8.field3665.method10320(0);
									var9 = var8.field3665.field5920;
									var8.field3665.field5920 += 2;
									var11 = 0;
									var12 = 0;
								}
								int var16;
								int var17;
								int var18;
								if (field398 == -1L) {
									var16 = var15;
									var17 = var14;
									var18 = Integer.MAX_VALUE;
								} else {
									var16 = var15 - field387;
									var17 = var14 - field397;
									var18 = (int) ((Statics.field4847.field913[var13] - field398) / 20L);
									var11 = (int) ((Statics.field4847.field913[var13] - field398) % 20L + (long) var11);
								}
								field387 = var15;
								field397 = var14;
								if (var18 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
									var16 += 32;
									var17 += 32;
									var8.field3665.method10321((var16 << 6) + (var18 << 12) + var17);
								} else if (var18 < 32 && var16 >= -128 && var16 <= 127 && var17 >= -128 && var17 <= 127) {
									var16 += 128;
									var17 += 128;
									var8.field3665.method10320(var18 + 128);
									var8.field3665.method10321((var16 << 8) + var17);
								} else if (var18 < 32) {
									var8.field3665.method10320(var18 + 192);
									if (var15 == -1 || var14 == -1) {
										var8.field3665.method10547(Integer.MIN_VALUE);
									} else {
										var8.field3665.method10547(var15 | var14 << 16);
									}
								} else {
									var8.field3665.method10321((var18 & 0x1FFF) + 57344);
									if (var15 == -1 || var14 == -1) {
										var8.field3665.method10547(Integer.MIN_VALUE);
									} else {
										var8.field3665.method10547(var15 | var14 << 16);
									}
								}
								var12++;
								field398 = Statics.field4847.field913[var13];
							}
						}
						if (var8 != null) {
							var8.field3665.method10334(var8.field3665.field5920 - var9);
							int var19 = var8.field3665.field5920;
							var8.field3665.field5920 = var9;
							var8.field3665.method10320(var11 / var12);
							var8.field3665.method10320(var11 % var12);
							var8.field3665.field5920 = var19;
							field315.method2874(var8);
						}
						if (var10 >= Statics.field4847.field908) {
							Statics.field4847.field908 = 0;
						} else {
							Statics.field4847.field908 -= var10;
							System.arraycopy(Statics.field4847.field909, var10, Statics.field4847.field909, 0, Statics.field4847.field908);
							System.arraycopy(Statics.field4847.field911, var10, Statics.field4847.field911, 0, Statics.field4847.field908);
							System.arraycopy(Statics.field4847.field913, var10, Statics.field4847.field913, 0, Statics.field4847.field908);
						}
					}
				}
				this.method824();
				if (field551 != 0) {
					class330 var21 = class330.method3456(class328.field3573, field315.field1309);
					var21.field3665.method10321(field551);
					field315.method2874(var21);
				}
				boolean var22 = field194.method370();
				if (var22) {
					class330 var23 = class330.method3456(class328.field3577, field315.field1309);
					var23.field3665.method10321(0);
					int var24 = var23.field3665.field5920;
					long var25 = class335.method3987();
					for (int var27 = 0; var27 < field552.field3207; var27++) {
						long var28 = var25 - field467;
						if (var28 > 16777215L) {
							var28 = 16777215L;
						}
						field467 = var25;
						var23.field3665.method10388((int) var28);
						var23.field3665.method10372(field552.field3208[var27]);
					}
					var23.field3665.method10333(var23.field3665.field5920 - var24);
					field315.method2874(var23);
				}
				if (field489 > 0) {
					field489--;
				}
				if (field552.method5701(96) || field552.method5701(97) || field552.method5701(98) || field552.method5701(99)) {
					field490 = true;
				}
				if (field490 && field489 <= 0) {
					field489 = 20;
					field490 = false;
					class330 var30 = class330.method3456(class328.field3604, field315.field1309);
					var30.field3665.method10379(field425);
					var30.field3665.method10321(field416);
					field315.method2874(var30);
				}
				if (Statics.field179 && !field399) {
					field399 = true;
					class330 var31 = class330.method3456(class328.field3578, field315.field1309);
					var31.field3665.method10320(1);
					field315.method2874(var31);
				}
				if (!Statics.field179 && field399) {
					field399 = false;
					class330 var32 = class330.method3456(class328.field3578, field315.field1309);
					var32.field3665.method10320(0);
					field315.method2874(var32);
				}
				if (Statics.field817 != null) {
					Statics.field817.method9822();
				}
				if (Statics.field1830) {
					if (Statics.field91 != null) {
						Statics.field91.method9295();
					}
					method6471();
					Statics.field1830 = false;
				}
				method2090();
				if (field577 != Statics.field3837.field1171) {
					field577 = Statics.field3837.field1171;
					Statics.method2758(Statics.field3837.field1171);
				}
				if (field328 != 30) {
					return;
				}
				method3653();
				int var10002;
				for (int var33 = 0; var33 < class59.field837; var33++) {
					var10002 = class59.field832[var33]--;
					if (class59.field832[var33] < -10) {
						class59.method3919(var33);
						var33--;
					} else {
						class95 var34 = class59.field833[var33];
						if (var34 == null) {
							int var35 = Statics.field1515.method7702(class59.field835[var33]) - 1;
							class95 var10000 = null;
							var34 = class95.method2928(Statics.field1515, class59.field835[var33], var35);
							if (var34 == null) {
								continue;
							}
							class59.field832[var33] += var34.method2929();
							class59.field833[var33] = var34;
						}
						if (class59.field832[var33] < 0) {
							int var59;
							if (class59.field834[var33] == 0) {
								var59 = Statics.field240.method2569();
							} else {
								int var36 = class357.method6807(class59.field834[var33] & 0xFF);
								int var37 = class59.field834[var33] >> 16 & 0xFF;
								int var38 = class59.field834[var33] >> 8 & 0xFF;
								int var39 = class59.field829[var33];
								class80 var40 = field334.method2311(var39);
								class453 var41 = method1977(var40, class357.method6807(var37), class357.method6807(var38));
								int var42 = (int) var41.field5176;
								int var43 = var42 >> 7;
								int var45 = (int) var41.field5170;
								int var46 = var45 >> 7;
								var41.method8336();
								class453 var48 = field334.method2322();
								int var49 = Math.abs(class357.method6806(var43) - (int) var48.field5176);
								int var50 = Math.abs(class357.method6806(var46) - (int) var48.field5170);
								var48.method8336();
								int var51 = Math.max(var49 + var50 - 128, 0);
								int var52 = Math.max(class357.method6807((class59.field830[var33] & 0x1F) - 1), 0);
								class506 var53 = field334.method2308();
								class506 var54 = field334.method2307(var39);
								boolean var55 = class59.field836[var33];
								boolean var56;
								if (var53 == var54) {
									var56 = true;
								} else if (var54 == null) {
									var56 = true;
								} else if (var53 == null) {
									var56 = false;
								} else {
									var56 = var55;
								}
								if (var51 >= var36 || !var56) {
									class59.field832[var33] = -100;
									continue;
								}
								float var58 = var52 < var36 ? Math.min(Math.max((float) (var36 - var51) / (float) (var36 - var52), 0.0F), 1.0F) : 1.0F;
								var59 = (int) (var58 * (float) Statics.field240.method2624());
							}
							if (var59 > 0) {
								class96 var60 = var34.method2945(Statics.field240.method2537());
								class104 var61 = class104.method3067(var60, 100, var59);
								if (var61 != null) {
									var61.method3087(class59.field831[var33] - 1);
									Statics.field145.method2890(var61);
								}
							}
							class59.field832[var33] = -100;
						}
					}
				}
				if (field447 && !class340.method4623()) {
					if (Statics.field240.method2519() != 0) {
						boolean var62 = !class340.field3890.isEmpty();
						if (var62) {
							class340.method3776(Statics.field4043, Statics.field240.method2519());
						}
					}
					field447 = false;
				}
				field315.field1298++;
				if (field315.field1298 > 750) {
					method6899();
					return;
				}
				method8428();
				Iterator var63 = field334.iterator();
				while (var63.hasNext()) {
					class80 var64 = (class80) var63.next();
					Iterator var65 = var64.field1161.iterator();
					while (var65.hasNext()) {
						class82 var66 = (class82) var65.next();
						if (var66 != null) {
							method6327(var64, var66, var66.field1185.field2112);
						}
					}
				}
				Iterator var67 = field334.iterator();
				while (var67.hasNext()) {
					class80 var68 = (class80) var67.next();
					for (int var69 = 0; var69 < var68.field1177.method9107(); var69++) {
						int var70 = var68.field1177.method9104(var69);
						class506 var71 = (class506) var68.field1172.method7946((long) var70);
						if (var71 != null) {
							var71.method9355(field413);
						}
					}
				}
				method3356();
				field390++;
				if (field509 != 0) {
					field486 += 20;
					if (field486 >= 400) {
						field509 = 0;
					}
				}
				if (field585 > 0) {
					field585--;
				}
				class370 var72 = Statics.field3951;
				class370 var73 = Statics.field1625;
				Statics.field3951 = null;
				Statics.field1625 = null;
				field446 = null;
				field544 = false;
				field541 = false;
				field443 = 0;
				while (field552.method5691() && field443 < 128) {
					if (field429 >= 2 && field552.method5701(82) && field552.field3213 == 66) {
						StringBuilder var74 = new StringBuilder();
						Iterator var75 = class92.field1288.iterator();
						while (var75.hasNext()) {
							class40 var76 = (class40) var75.next();
							if (var76.field265 != null && !var76.field265.isEmpty()) {
								var74.append(var76.field265).append(':');
							}
							var74.append(var76.field272).append('\n');
						}
						String var77 = var74.toString();
						Statics.field5520.method554(var77);
					} else if (field337 != 1 || field552.field3216 <= 0) {
						field512[field443] = field552.field3213;
						field444[field443] = field552.field3216;
						field443++;
					}
				}
				boolean var79 = field429 >= 2;
				if (var79 && field552.method5701(82) && field552.method5701(81) && field551 != 0) {
					int var80 = Statics.field1109.field934 - field551;
					if (var80 < 0) {
						var80 = 0;
					} else if (var80 > 3) {
						var80 = 3;
					}
					if (Statics.field1109.field934 != var80) {
						method6280(Statics.field3837.field1165 + Statics.field1109.field1040[0], Statics.field3837.field1166 + Statics.field1109.field1108[0], var80, false);
					}
					field551 = 0;
				}
				if (field422 != -1) {
					method5921(field422, 0, 0, Statics.field208, Statics.field4810, 0, 0);
				}
				field405++;
				while (true) {
					class66 var81;
					class370 var82;
					class370 var83;
					do {
						var81 = (class66) field436.method8060();
						if (var81 == null) {
							while (true) {
								class66 var84;
								class370 var85;
								class370 var86;
								do {
									var84 = (class66) field615.method8060();
									if (var84 == null) {
										while (true) {
											class66 var87;
											class370 var88;
											class370 var89;
											do {
												var87 = (class66) field435.method8060();
												if (var87 == null) {
													boolean var90 = false;
													while (true) {
														class274 var91 = (class274) field438.method8060();
														if (var91 == null) {
															if (!var90 && class36.field223 == 1) {
																field599.method5671();
															}
															this.method1178();
															method7589();
															if (field613 != null) {
																this.method884();
															}
															Iterator var92 = field334.iterator();
															while (var92.hasNext()) {
																class80 var93 = (class80) var92.next();
																class231 var94 = var93.field1160;
																if (var94.method4859()) {
																	int var95 = var94.field2721;
																	int var96 = var94.field2684;
																	class330 var97 = class330.method3456(class328.field3631, field315.field1309);
																	var97.field3665.method10320(5);
																	var97.field3665.method10320(field552.method5701(82) ? (field552.method5701(81) ? 2 : 1) : 0);
																	var97.field3665.method10381(var93.field1165 + var95);
																	var97.field3665.method10381(var93.field1166 + var96);
																	field315.method2874(var97);
																	field506 = class36.field222;
																	field507 = class36.field225;
																	field509 = 1;
																	field486 = 0;
																	field582 = var95;
																	field532 = var96;
																	var94.method4861();
																}
															}
															if (Statics.field3951 != var72) {
																if (var72 != null) {
																	method2809(var72);
																}
																if (Statics.field3951 != null) {
																	method2809(Statics.field3951);
																}
															}
															if (Statics.field1625 != var73 && field482 == field427) {
																if (var73 != null) {
																	method2809(var73);
																}
																if (Statics.field1625 != null) {
																	method2809(Statics.field1625);
																}
															}
															if (Statics.field1625 == null) {
																if (field482 > 0) {
																	field482--;
																}
															} else if (field482 < field427) {
																field482++;
																if (field482 == field427) {
																	method2809(Statics.field1625);
																}
															}
															if (field337 == 0) {
																class80 var98 = field334.method2311(field348);
																if (var98 == null) {
																	var98 = Statics.field3837;
																}
																Object var99 = null;
																switch(Statics.field8.field4400) {
																	case 0:
																		var99 = (class599) var98.field1170.method7917((long) field349);
																		break;
																	case 1:
																		var99 = (class599) var98.field1161.method7917((long) field349);
																		break;
																	case 2:
																		var99 = (class599) var98.field1172.method7946((long) field349);
																}
																if (var99 == null) {
																	var99 = Statics.field1109;
																}
																field553 = ((class599) var99).method2394();
																field338 = ((class599) var99).method2395();
																if (Statics.field3837 != var98) {
																	class453 var100 = method1977(var98, ((class599) var99).method2394(), ((class599) var99).method2395());
																	field553 = (int) var100.field5176;
																	field338 = (int) var100.field5170;
																	var100.method8336();
																}
																int var101 = ((class599) var99).method2177();
																if (Statics.field1931 - field553 >= -500 && Statics.field1931 - field553 <= 500 && Statics.field1585 - field338 >= -500 && Statics.field1585 - field338 <= 500) {
																	if (field553 != Statics.field1931) {
																		Statics.field1931 += (field553 - Statics.field1931) / 16;
																	}
																	if (field338 != Statics.field1585) {
																		Statics.field1585 += (field338 - Statics.field1585) / 16;
																	}
																} else {
																	Statics.field1931 = field553;
																	Statics.field1585 = field338;
																}
																int var102 = Statics.field1931 >> 7;
																int var103 = Statics.field1585 >> 7;
																int var104 = method7784(Statics.field3837, Statics.field1931, Statics.field1585, var101);
																int var105 = 0;
																if (var102 > 3 && var103 > 3 && var102 < 100 && var103 < 100) {
																	for (int var106 = var102 - 4; var106 <= var102 + 4; var106++) {
																		for (int var107 = var103 - 4; var107 <= var103 + 4; var107++) {
																			int var108 = var101;
																			if (var101 < 3 && (Statics.field3837.field1169[1][var106][var107] & 0x2) == 2) {
																				var108 = var101 + 1;
																			}
																			int var109 = var104 - Statics.field3837.field1174[var108][var106][var107];
																			if (var109 > var105) {
																				var105 = var109;
																			}
																		}
																	}
																}
																int var110 = var105 * 192;
																if (var110 > 98048) {
																	var110 = 98048;
																}
																if (var110 < 32768) {
																	var110 = 32768;
																}
																if (var110 > field417) {
																	field417 += (var110 - field417) / 24;
																} else if (var110 < field417) {
																	field417 += (var110 - field417) / 80;
																}
																int var111 = ((class599) var99).method2394();
																int var112 = ((class599) var99).method2395();
																int var113 = method7784(var98, var111, var112, var101);
																class506 var114 = (class506) Statics.field3837.field1172.method7946((long) var98.field1173);
																if (var114 != null) {
																	var113 += method7784(Statics.field3837, var114.method2394(), var114.method2395(), var114.method2177());
																}
																field513 = var113;
																Statics.field2079 = field513 - field559;
															} else if (field337 == 1) {
																method2121();
																short var116 = -1;
																if (field552.method5701(33)) {
																	var116 = 0;
																} else if (field552.method5701(49)) {
																	var116 = 1024;
																}
																if (field552.method5701(48)) {
																	if (var116 == 0) {
																		var116 = 1792;
																	} else if (var116 == 1024) {
																		var116 = 1280;
																	} else {
																		var116 = 1536;
																	}
																} else if (field552.method5701(50)) {
																	if (var116 == 0) {
																		var116 = 256;
																	} else if (var116 == 1024) {
																		var116 = 768;
																	} else {
																		var116 = 512;
																	}
																}
																byte var117 = 0;
																if (field552.method5701(35)) {
																	var117 = -1;
																} else if (field552.method5701(51)) {
																	var117 = 1;
																}
																int var118 = 0;
																if (var116 >= 0 || var117 != 0) {
																	int var119 = field552.method5701(81) ? field340 : field339;
																	var118 = var119 * 16;
																	field415 = var116;
																	field549 = var117;
																}
																if (field600 < var118) {
																	field600 += var118 / 8;
																	if (field600 > var118) {
																		field600 = var118;
																	}
																} else if (field600 > var118) {
																	field600 = field600 * 9 / 10;
																}
																if (field600 > 0) {
																	int var120 = field600 / 16;
																	if (field415 >= 0) {
																		int var121 = field415 - Statics.field3461 & 0x7FF;
																		int var122 = class226.field2638[var121];
																		int var123 = class226.field2637[var121];
																		Statics.field1931 += var120 * var122 / 65536;
																		Statics.field1585 += var120 * var123 / 65536;
																	}
																	if (field549 != 0) {
																		Statics.field2079 += field549 * var120;
																		if (Statics.field2079 > 0) {
																			Statics.field2079 = 0;
																		}
																	}
																} else {
																	field415 = -1;
																	field549 = -1;
																}
																int var124 = 32768;
																if (var124 > field417) {
																	field417 += (var124 - field417) / 24;
																} else if (var124 < field417) {
																	field417 += (var124 - field417) / 80;
																}
																if (field552.method5701(13)) {
																	field315.method2874(class330.method3456(class328.field3612, field315.field1309));
																	field337 = 0;
																}
															}
															if (class36.field219 == 4 && Statics.field5059) {
																int var125 = class36.field221 - field367;
																field421 = var125 * 2;
																field367 = var125 == -1 || var125 == 1 ? class36.field221 : (field367 + class36.field221) / 2;
																int var126 = field516 - class36.field232;
																field418 = var126 * 2;
																field516 = var126 == -1 || var126 == 1 ? class36.field232 : (field516 + class36.field232) / 2;
															} else {
																if (field552.method5701(96)) {
																	field418 += (-24 - field418) / 2;
																} else if (field552.method5701(97)) {
																	field418 += (24 - field418) / 2;
																} else {
																	field418 /= 2;
																}
																if (field552.method5701(98)) {
																	field421 += (12 - field421) / 2;
																} else if (field552.method5701(99)) {
																	field421 += (-12 - field421) / 2;
																} else {
																	field421 /= 2;
																}
																field367 = class36.field221;
																field516 = class36.field232;
															}
															field425 = field418 / 2 + field425 & 0x7FF;
															field416 += field421 / 2;
															if (field416 < 128) {
																field416 = 128;
															}
															if (field416 > 383) {
																field416 = 383;
															}
															if (field450) {
																method6325(Statics.field3088, Statics.field1511, Statics.field4854);
																method3791(Statics.field885, Statics.field1887);
																if (Statics.field3088 == Statics.field2053 && Statics.field1941 == Statics.field1511 && Statics.field4854 == Statics.field47 && Statics.field885 == Statics.field4856 && Statics.field3461 == Statics.field1887) {
																	field450 = false;
																	field475 = false;
																	field554 = false;
																	field588 = false;
																	Statics.field1910 = 0;
																	Statics.field2655 = 0;
																	Statics.field5414 = 0;
																	Statics.field688 = 0;
																	Statics.field1726 = 0;
																	Statics.field3291 = 0;
																	Statics.field3151 = 0;
																	Statics.field115 = 0;
																	Statics.field2488 = 0;
																	Statics.field5047 = 0;
																	field590 = null;
																	field478 = null;
																	field515 = null;
																}
															} else if (field475) {
																method404();
															}
															for (int var127 = 0; var127 < 5; var127++) {
																var10002 = field407[var127]++;
															}
															Statics.field5479.method2827();
															int var128 = class36.method8748();
															int var129 = class35.method2652();
															if (var128 > 15000 && var129 > 15000) {
																field580 = 250;
																class36.method735(14500);
																class330 var130 = class330.method3456(class328.field3574, field315.field1309);
																field315.method2874(var130);
															}
															Statics.field280.method1533();
															for (int var131 = 0; var131 < field602.size(); var131++) {
																int var132 = (Integer) field602.get(var131);
																class147 var133 = class216.method3379(var132);
																int var134;
																if (var133 == null) {
																	var134 = 2;
																} else {
																	var134 = var133.method3609() ? 0 : 1;
																}
																if (var134 != 2) {
																	field602.remove(var131);
																	var131--;
																}
															}
															field315.field1299++;
															if (field315.field1299 > 50) {
																class330 var135 = class330.method3456(class328.field3640, field315.field1309);
																field315.method2874(var135);
															}
															try {
																field315.method2869();
															} catch (IOException var137) {
																method6899();
															}
															class266.method5521().method5571();
															return;
														}
														if (var91.field3197.field4148 == 12) {
															var90 = true;
														}
														method3636(var91);
													}
												}
												var88 = var87.field894;
												if (var88.field4146 < 0) {
													break;
												}
												var89 = Statics.field1555.method6863(var88.field4165);
											} while (var89 == null || var89.field4287 == null || var88.field4146 >= var89.field4287.length || var89.field4287[var88.field4146] != var88);
											class47.method6482(var87);
										}
									}
									var85 = var84.field894;
									if (var85.field4146 < 0) {
										break;
									}
									var86 = Statics.field1555.method6863(var85.field4165);
								} while (var86 == null || var86.field4287 == null || var85.field4146 >= var86.field4287.length || var86.field4287[var85.field4146] != var85);
								class47.method6482(var84);
							}
						}
						var82 = var81.field894;
						if (var82.field4146 < 0) {
							break;
						}
						var83 = Statics.field1555.method6863(var82.field4165);
					} while (var83 == null || var83.field4287 == null || var82.field4146 >= var83.field4287.length || var83.field4287[var82.field4146] != var82);
					class47.method6482(var81);
				}
			}
			class330 var3 = class330.method3456(class328.field3556, field315.field1309);
			var3.field3665.method10320(0);
			int var4 = var3.field3665.field5920;
			class37.method5274(var3.field3665);
			var3.field3665.method10334(var3.field3665.field5920 - var4);
			field315.method2874(var3);
		}
	}

	@ObfuscatedName("client.qp(I)V")
	public void method824() {
		if (class36.field223 != 1 && (Statics.field5059 || class36.field223 != 4) && class36.field223 != 2) {
			return;
		}
		long var1 = class36.field220 - field395;
		if (var1 > 32767L) {
			var1 = 32767L;
		}
		field395 = class36.field220;
		int var3 = class36.field225;
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > Statics.field4810) {
			var3 = Statics.field4810;
		}
		int var4 = class36.field222;
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > Statics.field208) {
			var4 = Statics.field208;
		}
		int var5 = (int) var1;
		if (class586.field5891 < 232) {
			class330 var7 = class330.method3456(class328.field3552, field315.field1309);
			var7.field3665.method10321((var5 << 1) + (class36.field223 == 2 ? 1 : 0));
			var7.field3665.method10321(var4);
			var7.field3665.method10321(var3);
			field315.method2874(var7);
			return;
		}
		class330 var6 = class330.method3456(class328.field3633, field315.field1309);
		var6.field3665.method10381(var4);
		var6.field3665.method10321((class36.field223 == 2 ? 1 : 0) + (var5 << 1));
		var6.field3665.method10379(var3);
		var6.field3665.method10371(0);
		field315.method2874(var6);
	}

	@ObfuscatedName("client.qe(IIB)V")
	public void method806(int arg0, int arg1) {
		if (field315 != null && field315.field1309 != null && (arg0 > -1 && Statics.field240.method2519() > 0 && !field447)) {
			class330 var3 = class330.method3456(class328.field3548, field315.field1309);
			var3.field3665.method10547(arg0);
			field315.method2874(var3);
		}
	}

	@ObfuscatedName("client.ag(B)V")
	public final void method511() {
		field360 = class335.method3987() + 500L;
		this.method808();
		if (field422 != -1) {
			this.method1323(true);
		}
	}

	@ObfuscatedName("client.qi(I)V")
	public void method808() {
		int var1 = Statics.field208;
		int var2 = Statics.field4810;
		if (this.field198 < var1) {
			int var3 = this.field198;
		}
		if (this.field199 < var2) {
			int var4 = this.field199;
		}
		if (Statics.field240 != null) {
			try {
				class27.method401(Statics.field5520, "resize", new Object[] { method724() });
			} catch (Throwable var6) {
			}
		}
	}

	@ObfuscatedName("client.qt(B)V")
	public final void method809() {
		if (field422 != -1) {
			method3918(field422);
		}
		for (int var1 = 0; var1 < field564; var1++) {
			if (field437[var1]) {
				field567[var1] = true;
			}
			field357[var1] = field437[var1];
			field437[var1] = false;
		}
		field451 = field413;
		field525 = -1;
		field597 = -1;
		if (field422 != -1) {
			field564 = 0;
			method3771(field422, 0, 0, Statics.field208, Statics.field4810, 0, 0, -1);
		}
		class602.method10709();
		if (field500) {
			if (field509 == 1) {
				Statics.field2157[field486 / 100].method10818(field506 - 8, field507 - 8);
			}
			if (field509 == 2) {
				Statics.field2157[field486 / 100 + 4].method10818(field506 - 8, field507 - 8);
			}
		}
		if (field522) {
			field523.method10990();
		} else if (field525 != -1) {
			int var2 = field525;
			int var3 = field597;
			if ((field523.field6053 >= 2 || field358 != 0 || field530) && field528) {
				int var4 = field523.field6053 - 1;
				String var6;
				if (field358 == 1 && field523.field6053 < 2) {
					var6 = class394.field4763 + class394.field4637 + field529 + " " + class83.field1201;
				} else if (field530 && field523.field6053 < 2) {
					var6 = field375 + class394.field4637 + field534 + " " + class83.field1201;
				} else {
					var6 = field523.method10972(var4);
				}
				if (field523.field6053 > 2) {
					var6 = var6 + class83.method3480(16777215) + " " + '/' + " " + (field523.field6053 - 2) + class394.field4649;
				}
				Statics.field3832.method8806(var6, var2 + 4, var3 + 15, 16777215, 0, field413 / 1000);
			}
		}
		if (field573 == 3) {
			for (int var7 = 0; var7 < field564; var7++) {
				if (field357[var7]) {
					class602.method10681(field569[var7], field468[var7], field571[var7], field614[var7], 16711935, 128);
				} else if (field567[var7]) {
					class602.method10681(field569[var7], field468[var7], field571[var7], field614[var7], 16711680, 128);
				}
			}
		}
		this.method810();
	}

	@ObfuscatedName("client.qr(S)V")
	public void method810() {
		class453 var1 = field334.method2322();
		class506 var2 = field334.method2308();
		int var3 = (int) var1.field5177;
		int var4 = (int) var1.field5176;
		int var5 = (int) var1.field5170;
		int var6 = field390;
		Iterator var7 = field334.iterator();
		while (var7.hasNext()) {
			class80 var8 = (class80) var7.next();
			for (class73 var9 = (class73) var8.method2635().method8034(); var9 != null; var9 = (class73) var8.method2635().method8036()) {
				var9.method2203(var2, var3, var4, var5, var6);
			}
		}
		var1.method8336();
		field390 = 0;
	}

	@ObfuscatedName("client.qv(Ldz;B)Z")
	public boolean method811(class93 arg0) {
		if (arg0.field1295 == 0) {
			Statics.field91 = null;
		} else {
			if (Statics.field91 == null) {
				Statics.field91 = new class496(Statics.field1293, Statics.field5520);
			}
			Statics.field91.method9191(arg0.field1294);
		}
		field364 = field405;
		Statics.field1830 = true;
		arg0.field1305 = null;
		return true;
	}

	@ObfuscatedName("client.qf(Ldz;I)Z")
	public boolean method1022(class93 arg0) {
		if (Statics.field91 != null) {
			Statics.field91.method9192(arg0.field1294);
		}
		field364 = field405;
		Statics.field1830 = true;
		arg0.field1305 = null;
		return true;
	}

	@ObfuscatedName("client.qo(I)V")
	public void method1352() {
		int var1 = 0;
		boolean var2 = field315.field1290 > 0;
		int var3 = field315.field1301;
		while (var1 < 100 || var2) {
			boolean var4 = this.method814(field315);
			if (var2) {
				int var5 = field315.field1301 - var3;
				field315.field1290 -= var5;
			}
			if (!var4) {
				break;
			}
			var1++;
			var3 = field315.field1301;
			var2 = field315.field1290 > 0;
		}
	}

	@ObfuscatedName("client.qm(Ldz;I)Z")
	public final boolean method814(class93 arg0) {
		class512 var2 = arg0.method2873();
		class590 var3 = arg0.field1294;
		if (var2 == null) {
			return false;
		}
		try {
			if (arg0.field1290 > 0 && !var2.method9435(arg0.field1290)) {
				return false;
			}
			if (arg0.field1305 == null) {
				if (arg0.field1297) {
					if (!var2.method9435(1)) {
						return false;
					}
					arg0.field1301 += var2.method9420(arg0.field1294.field5917, 0, 1);
					arg0.field1298 = 0;
					arg0.field1297 = false;
				}
				var3.field5920 = 0;
				if (var3.method10286()) {
					if (!var2.method9435(1)) {
						return false;
					}
					arg0.field1301 += var2.method9420(arg0.field1294.field5917, 1, 1);
					arg0.field1298 = 0;
				}
				arg0.field1297 = true;
				class331[] var4 = class331.method3819();
				int var5 = var3.method10280();
				if (var5 < 0 || var5 >= var4.length) {
					throw new IOException(var5 + " " + var3.field5920);
				}
				arg0.field1305 = var4[var5];
				arg0.field1295 = arg0.field1305.field3810;
			}
			if (arg0.field1295 == -1) {
				if (!var2.method9435(1)) {
					return false;
				}
				arg0.field1301 += var2.method9420(var3.field5917, 0, 1);
				arg0.field1295 = var3.field5917[0] & 0xFF;
			}
			if (arg0.field1295 == -2) {
				if (!var2.method9435(2)) {
					return false;
				}
				arg0.field1301 += var2.method9420(var3.field5917, 0, 2);
				var3.field5920 = 0;
				arg0.field1295 = var3.method10341();
			}
			if (!var2.method9435(arg0.field1295)) {
				return false;
			}
			var3.field5920 = 0;
			arg0.field1301 += var2.method9420(var3.field5917, 0, arg0.field1295);
			arg0.field1298 = 0;
			field472.method7604();
			arg0.field1307 = arg0.field1303;
			arg0.field1303 = arg0.field1296;
			arg0.field1296 = arg0.field1305;
			if (class331.field3772 == arg0.field1305) {
				class45 var6 = new class45();
				var6.field635 = var3.method10350();
				var6.field641 = var3.method10341();
				int var7 = var3.method10345();
				var6.field633 = var7;
				if (var6.method1441()) {
					var6.field639 = "beta";
					Statics.field5442 = true;
				} else {
					Statics.field5442 = false;
				}
				method3384(45);
				var2.method9422();
				Object var8 = null;
				class53.method4091(var6);
				arg0.field1305 = null;
				return false;
			}
			if (class331.field3769 == arg0.field1305) {
				method2089();
				byte var9 = var3.method10340();
				class155 var10 = new class155(var3);
				class163 var11;
				if (var9 >= 0) {
					var11 = field366[var9];
				} else {
					var11 = Statics.field5334;
				}
				if (var11 == null) {
					this.method823(var9);
					arg0.field1305 = null;
					return true;
				}
				if (var10.field1788 > var11.field1871) {
					this.method823(var9);
					arg0.field1305 = null;
					return true;
				}
				if (var10.field1788 < var11.field1871) {
					arg0.field1305 = null;
					return true;
				}
				var10.method3660(var11);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3725 == arg0.field1305) {
				int var12 = var3.method10395();
				class370 var13 = Statics.field1555.method6863(var12);
				var13.field4193 = 3;
				var13.field4278 = Statics.field1109.field936.method6923();
				method2809(var13);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3701 == arg0.field1305) {
				short var14 = (short) var3.method10586();
				int var15 = var3.method10397();
				int var16 = var3.method10563();
				int var17 = var3.method10339();
				class82 var18 = (class82) Statics.field5344.field1161.method7917((long) var16);
				if (var18 != null) {
					var18.method2677(var17, var15, var14);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3808 == arg0.field1305) {
				int var19 = var3.method10593();
				int var20 = var3.method10339();
				if (var19 == -1) {
					Statics.field3837.field1171 = var20;
					Statics.field5344 = Statics.field3837;
				} else {
					class506 var21 = (class506) Statics.field3837.field1172.method7946((long) var19);
					if (var21 == null) {
						throw new RuntimeException("No valid ClientWorldEntity with ID " + var19);
					}
					var21.field5430.field1171 = var20;
					Statics.field5344 = var21.field5430;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3717 == arg0.field1305) {
				int var22 = var3.method10345();
				int var23 = var3.method10345();
				int var24 = class35.method5563();
				class330 var25 = class330.method3456(class328.field3617, field315.field1309);
				var25.field3665.method10372(field180);
				var25.field3665.method10377(var22);
				var25.field3665.method10547(var23);
				var25.field3665.method10371(var24);
				field315.method2874(var25);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3694 == arg0.field1305) {
				String var26 = var3.method10350();
				int var27 = var3.method10395();
				class370 var28 = Statics.field1555.method6863(var27);
				if (!var26.equals(var28.field4212)) {
					var28.field4212 = var26;
					method2809(var28);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3795 == arg0.field1305) {
				method4299(class329.field3646);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3786 == arg0.field1305) {
				int var29 = var3.method10563();
				int var30 = var3.method10395();
				int var31 = var29 >> 10 & 0x1F;
				int var32 = var29 >> 5 & 0x1F;
				int var33 = var29 & 0x1F;
				int var34 = (var33 << 3) + (var31 << 19) + (var32 << 11);
				class370 var35 = Statics.field1555.method6863(var30);
				if (var35.field4174 != var34) {
					var35.field4174 = var34;
					method2809(var35);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3680 == arg0.field1305) {
				int var36 = var3.method10593();
				int var37 = var3.method10397();
				int var38 = var3.method10593();
				class370 var39 = Statics.field1555.method6863(var37);
				if (var39.field4210 != var38 || var39.field4229 != var36 || var39.field4151 != 0 || var39.field4162 != 0) {
					var39.field4210 = var38;
					var39.field4229 = var36;
					var39.field4151 = 0;
					var39.field4162 = 0;
					method2809(var39);
					this.method937(var39);
					if (var39.field4148 == 0) {
						method332(Statics.field1555.field4038[var37 >> 16], var39, false);
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3768 == arg0.field1305) {
				int var40 = var3.method10324();
				int var41 = var3.method10373();
				int var42 = var3.method10384();
				if (var40 == 65535) {
					var40 = -1;
				}
				class82 var43 = (class82) Statics.field5344.field1161.method7917((long) var42);
				if (var43 != null) {
					class216 var44 = var43.field1075.method8916();
					if (var40 == var43.method2437() && var40 != -1) {
						int var45 = var44.field2490;
						if (var45 == 1) {
							var43.field1075.method8907();
							var43.field1103 = var41;
						} else if (var45 == 2) {
							var43.field1075.method8924();
						}
					} else if (var40 == -1 || var44 == null || class216.method3858(var40).field2481 >= var44.field2481) {
						var43.field1075.method8908(var40);
						var43.field1075.method8907();
						var43.field1103 = var41;
						var43.field1041 = var43.field1101;
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3777 == arg0.field1305) {
				int var46 = var3.method10345();
				class370 var47 = Statics.field1555.method6863(var46);
				for (int var48 = 0; var48 < var47.field4260.length; var48++) {
					var47.field4260[var48] = -1;
					var47.field4260[var48] = 0;
				}
				method2809(var47);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3675 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field588 = false;
				Statics.field1910 = var3.method10339();
				Statics.field2655 = var3.method10339();
				Statics.field5414 = var3.method10341();
				Statics.field688 = var3.method10339();
				Statics.field1726 = var3.method10339();
				if (Statics.field1726 >= 100) {
					int var49 = class357.method6806(Statics.field1910);
					int var50 = class357.method6806(Statics.field2655);
					int var51 = method7784(Statics.field3837, var49, var50, Statics.field3837.field1171) - Statics.field5414;
					int var52 = var49 - Statics.field2053;
					int var53 = var51 - Statics.field1941;
					int var54 = var50 - Statics.field47;
					int var55 = (int) Math.sqrt((double) (var52 * var52 + var54 * var54));
					Statics.field4856 = (int) (Math.atan2((double) var53, (double) var55) * 325.9490051269531D) & 0x7FF;
					Statics.field3461 = (int) (Math.atan2((double) var52, (double) var54) * -325.9490051269531D) & 0x7FF;
					if (Statics.field4856 < 128) {
						Statics.field4856 = 128;
					}
					if (Statics.field4856 > 383) {
						Statics.field4856 = 383;
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3759 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field588 = true;
				int var56 = var3.method10593();
				int var57 = var3.method10593();
				int var58 = method5721(Statics.field4856 + var57 & 0x7EB);
				int var59 = Statics.field3461 + var56;
				int var60 = var3.method10341();
				int var61 = var3.method10339();
				field478 = new class551(Statics.field4856, var58, var60, var61);
				field515 = new class551(Statics.field3461, var59, var60, var61);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3800 == arg0.field1305) {
				field485 = field405;
				byte var62 = var3.method10340();
				class169 var63 = new class169(var3);
				class172 var64;
				if (var62 >= 0) {
					var64 = field583[var62];
				} else {
					var64 = Statics.field1230;
				}
				if (var64 == null) {
					this.method822(var62);
					arg0.field1305 = null;
					return true;
				}
				if (var63.field1899 > var64.field1923) {
					this.method822(var62);
					arg0.field1305 = null;
					return true;
				}
				if (var63.field1899 < var64.field1923) {
					arg0.field1305 = null;
					return true;
				}
				var63.method3785(var64);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3693 == arg0.field1305) {
				String var65 = var3.method10350();
				Object[] var66 = new Object[var65.length() + 1];
				for (int var67 = var65.length() - 1; var67 >= 0; var67--) {
					switch(var65.charAt(var67)) {
						case 'W':
							int var72 = var3.method10361();
							class520 var73 = new class520(class575.field5821, 0, var72, var72);
							int[] var74 = var73.method9541();
							for (int var75 = 0; var75 < var72; var75++) {
								var74[var75] = var3.method10374();
							}
							var66[var67 + 1] = var73;
							break;
						case 'X':
							int var68 = var3.method10361();
							class520 var69 = new class520(class575.field5825, null, var68, var68);
							Object[] var70 = var69.method9544();
							for (int var71 = 0; var71 < var68; var71++) {
								var70[var71] = var3.method10350();
							}
							var66[var67 + 1] = var69;
							break;
						case 's':
							var66[var67 + 1] = var3.method10350();
							break;
						default:
							var66[var67 + 1] = Integer.valueOf(var3.method10345());
					}
				}
				var66[0] = Integer.valueOf(var3.method10345());
				class66 var76 = new class66();
				var76.field899 = var66;
				class47.method6482(var76);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3789 == arg0.field1305) {
				field336.method2786(var3, arg0.field1295);
				method5523();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3734 == arg0.field1305) {
				int var77 = var3.method10339();
				int var78 = var3.method10339();
				int var79 = var3.method10339();
				int var80 = var3.method10339();
				field611[var77] = true;
				field594[var77] = var78;
				field595[var77] = var79;
				field596[var77] = var80;
				field407[var77] = 0;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3751 == arg0.field1305) {
				field485 = field405;
				byte var81 = var3.method10340();
				if (arg0.field1295 == 1) {
					if (var81 >= 0) {
						field583[var81] = null;
					} else {
						Statics.field1230 = null;
					}
					arg0.field1305 = null;
					return true;
				}
				if (var81 >= 0) {
					field583[var81] = new class172(var3);
				} else {
					Statics.field1230 = new class172(var3);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3802 == arg0.field1305) {
				int var82 = arg0.field1295 + var3.field5920;
				int var83 = var3.method10341();
				if (var83 == 65535) {
					var83 = -1;
				}
				int var84 = var3.method10341();
				if (field422 != var83) {
					field422 = var83;
					this.method1323(false);
					method11(field422);
					class47.method7990(field422);
					for (int var85 = 0; var85 < 100; var85++) {
						field437[var85] = true;
					}
				}
				while (var84-- > 0) {
					int var86 = var3.method10345();
					int var87 = var3.method10341();
					int var88 = var3.method10339();
					class65 var89 = (class65) field423.method7973((long) var86);
					if (var89 != null && var89.field889 != var87) {
						method5873(var89, true);
						var89 = null;
					}
					if (var89 == null) {
						var89 = method3588(var86, var87, var88);
					}
					var89.field888 = true;
				}
				for (class65 var90 = (class65) field423.method7976(); var90 != null; var90 = (class65) field423.method7977()) {
					if (var90.field888) {
						var90.field888 = false;
					} else {
						method5873(var90, true);
					}
				}
				field439 = new class429(512);
				while (var3.field5920 < var82) {
					int var91 = var3.method10345();
					int var92 = var3.method10341();
					int var93 = var3.method10341();
					int var94 = var3.method10345();
					int var95 = var3.method10345();
					class360 var96 = Statics.method6738(null, var92, var93, var94, var95);
					field439.method7975(var96, (long) var91);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3784 == arg0.field1305) {
				field568++;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3673 == arg0.field1305) {
				method4299(class329.field3644);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3690 == arg0.field1305) {
				int var97 = var3.method10324();
				int var98 = var3.method10395();
				class370 var99 = Statics.field1555.method6863(var98);
				if (var99.field4193 != 2 || var99.field4278 != var97) {
					var99.field4193 = 2;
					var99.field4278 = var97;
					method2809(var99);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3678 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field554 = false;
				Statics.field115 = var3.method10339();
				Statics.field2488 = var3.method10339();
				Statics.field5047 = var3.method10341();
				Statics.field3151 = var3.method10339();
				Statics.field3291 = var3.method10339();
				if (Statics.field3291 >= 100) {
					Statics.field2053 = class357.method6806(Statics.field115);
					Statics.field47 = class357.method6806(Statics.field2488);
					Statics.field1941 = method7784(Statics.field3837, Statics.field2053, Statics.field47, Statics.field3837.field1171) - Statics.field5047;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3670 == arg0.field1305) {
				method4299(class329.field3645);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3726 == arg0.field1305) {
				Statics.field95 = var3.method10339();
				Statics.field3225 = var3.method10339();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3783 == arg0.field1305) {
				method6323(Statics.field5344, false, var3);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3803 == arg0.field1305) {
				int var100 = var3.method10395();
				int var101 = class357.method6803(var100);
				int var102 = Statics.method6814(var100);
				int var103 = class357.method6805(var100);
				int var104 = var3.method10324();
				int var105 = var3.method10341();
				int var106 = var3.method10384();
				int var107 = var3.method10436();
				int var108 = class357.method6803(var107);
				int var109 = Statics.method6814(var107);
				int var110 = class357.method6805(var107);
				int var111 = var3.method10422();
				int var112 = var3.method10324();
				int var113 = var3.method10390();
				int var114 = var3.method10391();
				int var115 = var3.method10341();
				int var116 = var3.method10384();
				if (var106 != 65535) {
					class54 var117 = new class54(var101, var102, var103, var104, var113, var108, var109, var110, var105, var114, var106, field413 + var112, field413 + var116, var111, var115);
					field335.method8033(var117);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3714 == arg0.field1305) {
				boolean var118 = var3.method10339() == 1;
				int var119 = var3.method10436();
				class370 var120 = Statics.field1555.method6863(var119);
				var120.method7364(Statics.field1109.field936, var118);
				method2809(var120);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3788 == arg0.field1305) {
				class37.method2200(var3, arg0.field1295);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3741 == arg0.field1305) {
				method4299(class329.field3655);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3738 == arg0.field1305) {
				var3.field5920 += 28;
				if (var3.method10385()) {
					method5661(var3, var3.field5920 - 28);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3805 == arg0.field1305) {
				int var121 = var3.method10384();
				int var122 = var3.method10395();
				int var123 = var3.method10339();
				class65 var124 = (class65) field423.method7973((long) var122);
				if (var124 != null) {
					method5873(var124, var124.field889 != var121);
				}
				method3588(var122, var121, var123);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3804 == arg0.field1305) {
				boolean var125 = var3.method10339() == 1;
				if (var125) {
					Statics.field4312 = class335.method3987() - var3.method10346();
					Statics.field5306 = new class415(var3, true);
				} else {
					Statics.field5306 = null;
				}
				field561 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3715 == arg0.field1305) {
				method4299(class329.field3647);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3668 == arg0.field1305) {
				int var126 = var3.method10563();
				int var127 = var3.method10341();
				int var128 = var3.method10563();
				int var129 = var3.method10324();
				class340.method3815(var127, var128, var129, var126);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3778 == arg0.field1305) {
				Statics.field280.method1507();
				field556 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3739 == arg0.field1305) {
				int var130 = var3.method10345();
				class65 var131 = (class65) field423.method7973((long) var130);
				if (var131 != null) {
					method5873(var131, true);
				}
				if (field565 != null) {
					method2809(field565);
					field565 = null;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3798 == arg0.field1305) {
				field582 = var3.method10339();
				if (field582 == 255) {
					field582 = 0;
				}
				field532 = var3.method10339();
				if (field532 == 255) {
					field532 = 0;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3748 == arg0.field1305) {
				field441 = var3.method10422();
				field445 = var3.method10422();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3669 == arg0.field1305) {
				int var132 = var3.method10341();
				int var133 = var3.method10563();
				int var134 = var3.method10384();
				int var135 = var3.method10384();
				int var136 = var3.method10341();
				if (var135 == 65535) {
					var135 = -1;
				}
				ArrayList var137 = new ArrayList();
				var137.add(var135);
				method10142(var137, var136, var132, var133, var134);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3684 == arg0.field1305) {
				int var138 = var3.method10419();
				int var139 = var138 >> 16;
				int var140 = var138 >> 8 & 0xFF;
				int var141 = (var138 >> 4 & 0x7) + var139;
				int var142 = (var138 & 0x7) + var140;
				int var143 = var3.method10341();
				int var144 = var3.method10384();
				int var145 = var3.method10339();
				if (var141 >= 0 && var142 >= 0 && var141 < Statics.field5344.field1163 && var142 < Statics.field5344.field1164) {
					int var146 = class357.method6806(var141);
					int var147 = class357.method6806(var142);
					class49 var148 = new class49(Statics.field5344, var143, Statics.field5344.field1171, var146, var147, method7784(Statics.field5344, var146, var147, Statics.field5344.field1171) - var145, var144, field413);
					Statics.field5344.field1175.method8033(var148);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3704 == arg0.field1305) {
				int var149 = var3.method10593();
				field334.method2354(var149);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3729 == arg0.field1305) {
				String var150 = var3.method10350();
				long var151 = var3.method10346();
				long var153 = (long) var3.method10341();
				long var155 = (long) var3.method10419();
				class398 var157 = (class398) class432.method3817(class398.method8270(), var3.method10339());
				long var158 = (var153 << 32) + var155;
				boolean var160 = false;
				for (int var161 = 0; var161 < 100; var161++) {
					if (field575[var161] == var158) {
						var160 = true;
						break;
					}
				}
				if (var157.field4820 && Statics.field280.method1512(new class614(var150, Statics.field1293))) {
					var160 = true;
				}
				if (!var160 && field342 == 0) {
					field575[field576] = var158;
					field576 = (field576 + 1) % 100;
					String var162 = class466.method8836(class446.method7517(class377.method2112(var3)));
					if (var157.field4816 == -1) {
						class92.method3264(9, var150, var162, class448.method3988(var151));
					} else {
						class92.method3264(9, class83.method1981(var157.field4816) + var150, var162, class448.method3988(var151));
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3749 == arg0.field1305) {
				int var163 = var3.method10324();
				int var164 = var3.method10563();
				int var165 = var3.method10324();
				int var166 = var3.method10563();
				if (var166 == 65535) {
					var166 = -1;
				}
				int var167 = var3.method10341();
				int var168 = var3.method10341();
				if (var168 == 65535) {
					var168 = -1;
				}
				ArrayList var169 = new ArrayList();
				var169.add(var166);
				var169.add(var168);
				method10142(var169, var163, var165, var164, var167);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3681 == arg0.field1305) {
				int var170 = var3.method10384();
				int var171 = var3.method10395();
				int var172 = var3.method10324();
				class370 var173 = Statics.field1555.method6863(var171);
				var173.field4206 = (var170 << 16) + var172;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3781 == arg0.field1305) {
				byte var174 = var3.method10340();
				long var175 = (long) var3.method10341();
				long var177 = (long) var3.method10419();
				long var179 = (var175 << 32) + var177;
				boolean var181 = false;
				class172 var182 = var174 >= 0 ? field583[var174] : Statics.field1230;
				if (var182 == null) {
					var181 = true;
				} else {
					for (int var183 = 0; var183 < 100; var183++) {
						if (field575[var183] == var179) {
							var181 = true;
							break;
						}
					}
				}
				if (!var181) {
					field575[field576] = var179;
					field576 = (field576 + 1) % 100;
					String var184 = class377.method2112(var3);
					int var185 = var174 >= 0 ? 43 : 46;
					class92.method3264(var185, "", var184, var182.field1920);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3707 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field588 = true;
				Statics.field1910 = var3.method10339();
				Statics.field2655 = var3.method10339();
				Statics.field5414 = var3.method10341();
				int var186 = var3.method10341();
				int var187 = var3.method10339();
				int var188 = class357.method6806(Statics.field1910);
				int var189 = class357.method6806(Statics.field2655);
				int var190 = method7784(Statics.field3837, var188, var189, Statics.field3837.field1171) - Statics.field5414;
				int var191 = var188 - Statics.field2053;
				int var192 = var190 - Statics.field1941;
				int var193 = var189 - Statics.field47;
				double var194 = Math.sqrt((double) (var191 * var191 + var193 * var193));
				int var196 = method5721((int) (Math.atan2((double) var192, var194) * 325.9490051269531D) & 0x7FF);
				int var197 = method4517((int) (Math.atan2((double) var191, (double) var193) * -325.9490051269531D) & 0x7FF);
				field478 = new class551(Statics.field4856, var196, var186, var187);
				field515 = new class551(Statics.field3461, var197, var186, var187);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3677 == arg0.field1305) {
				int var198 = var3.method10339();
				if (var3.method10339() == 0) {
					field381[var198] = new class422();
					var3.field5920 += 18;
				} else {
					var3.field5920--;
					field381[var198] = new class422(var3, false);
				}
				field560 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3686 == arg0.field1305) {
				method763();
				field593 = var3.method10341();
				field562 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3718 == arg0.field1305) {
				int var199 = var3.method10593();
				int var200 = var3.method10386();
				int var201 = var3.method10384();
				int var202 = var3.method10397();
				int var203 = var3.method10395();
				int var204 = var3.method10563();
				short var205 = (short) var3.method10586();
				short var206 = (short) var3.method10387();
				int var207 = class357.method6803(var203);
				int var208 = Statics.method6814(var203);
				int var209 = class357.method6805(var203);
				class80 var210 = field334.method2306(var208, var209);
				int var211 = var208 - var210.field1165;
				int var212 = var209 - var210.field1166;
				if (var211 >= 0 && var212 >= 0 && var211 < var210.field1163 && var212 < var210.field1164) {
					method3324(var210, var207, var211, var212, var204, var202, var205, var199, var206, var200, var201);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3807 == arg0.field1305) {
				class42.method3669(Statics.field5344, var3, 6);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3743 == arg0.field1305) {
				int var213 = var3.method10436();
				int var214 = var3.method10345();
				class65 var215 = (class65) field423.method7973((long) var213);
				class65 var216 = (class65) field423.method7973((long) var214);
				if (var216 != null) {
					method5873(var216, var215 == null || var215.field889 != var216.field889);
				}
				if (var215 != null) {
					var215.method2234();
					field423.method7975(var215, (long) var214);
				}
				class370 var217 = Statics.field1555.method6863(var213);
				if (var217 != null) {
					method2809(var217);
				}
				class370 var218 = Statics.field1555.method6863(var214);
				if (var218 != null) {
					method2809(var218);
					method332(Statics.field1555.field4038[var218.field4145 >>> 16], var218, true);
				}
				if (field422 != -1) {
					method3585(field422, 1);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3687 == arg0.field1305) {
				Statics.field1874 = var3.method10339();
				Statics.field1757 = var3.method10422();
				field476 = var3.method10422();
				for (int var219 = Statics.field1757; var219 < Statics.field1757 + 8; var219++) {
					for (int var220 = Statics.field1874; var220 < Statics.field1874 + 8; var220++) {
						if (Statics.field5344.field1168[field476][var219][var220] != null) {
							Statics.field5344.field1168[field476][var219][var220] = null;
							method4009(field476, var219, var220);
						}
					}
				}
				for (class75 var221 = (class75) Statics.field5344.field1159.method8034(); var221 != null; var221 = (class75) Statics.field5344.field1159.method8036()) {
					if (var221.field1023 >= Statics.field1757 && var221.field1023 < Statics.field1757 + 8 && var221.field1037 >= Statics.field1874 && var221.field1037 < Statics.field1874 + 8 && field476 == var221.field1027) {
						var221.field1033 = 0;
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3771 == arg0.field1305) {
				method2089();
				byte var222 = var3.method10340();
				if (arg0.field1295 == 1) {
					if (var222 >= 0) {
						field366[var222] = null;
					} else {
						Statics.field5334 = null;
					}
					arg0.field1305 = null;
					return true;
				}
				if (var222 >= 0) {
					field366[var222] = new class163(var3);
				} else {
					Statics.field5334 = new class163(var3);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3794 == arg0.field1305) {
				for (int var223 = 0; var223 < Statics.field9; var223++) {
					class183 var224 = Statics.method2459(var223);
					if (var224 != null) {
						Statics.field5048[var223] = 0;
						Statics.field4023[var223] = 0;
					}
				}
				method763();
				field453 += 32;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3774 == arg0.field1305) {
				method4299(class329.field3654);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3736 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field554 = true;
				Statics.field115 = var3.method10339();
				Statics.field2488 = var3.method10339();
				int var225 = var3.method10341();
				int var226 = class357.method6806(var3.method10339());
				int var227 = class357.method6806(var3.method10339());
				int var228 = var3.method10341();
				field589 = var3.method10553();
				int var229 = var3.method10339();
				int var230 = class357.method6806(Statics.field115);
				int var231 = class357.method6806(Statics.field2488);
				boolean var232 = false;
				boolean var233 = false;
				int var234;
				int var235;
				if (field589) {
					var234 = Statics.field1941;
					var235 = method7784(Statics.field3837, var230, var231, Statics.field3837.field1171) - var225;
				} else {
					var234 = method7784(Statics.field3837, Statics.field2053, Statics.field47, Statics.field3837.field1171) - Statics.field1941;
					var235 = var225;
				}
				field590 = new class549(Statics.field2053, Statics.field47, var234, var230, var231, var235, var226, var227, var228, var229);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3679 == arg0.field1305) {
				int var236 = var3.method10341();
				if (var236 == 65535) {
					var236 = -1;
				}
				int var237 = var3.method10436();
				int var238 = var3.method10397();
				class370 var239 = Statics.field1555.method6863(var237);
				if (var239.field4144) {
					var239.field4283 = var236;
					var239.field4284 = var238;
					class214 var241 = class214.method2737(var236).method4362(var238);
					var239.field4201 = var241.field2425;
					var239.field4236 = var241.field2394;
					var239.field4203 = var241.field2393;
					var239.field4227 = var241.field2379;
					var239.field4200 = var241.field2399;
					var239.field4204 = var241.field2431;
					if (var241.field2398 == 1) {
						var239.field4199 = 1;
					} else {
						var239.field4199 = 2;
					}
					if (var239.field4153 > 0) {
						var239.field4204 = var239.field4204 * 32 / var239.field4153;
					} else if (var239.field4157 > 0) {
						var239.field4204 = var239.field4204 * 32 / var239.field4157;
					}
					method2809(var239);
				} else if (var236 == -1) {
					var239.field4193 = 0;
					arg0.field1305 = null;
					return true;
				} else {
					class214 var240 = class214.method2737(var236).method4362(var238);
					var239.field4193 = 4;
					var239.field4278 = var236;
					var239.field4201 = var240.field2425;
					var239.field4236 = var240.field2394;
					var239.field4204 = var240.field2431 * 100 / var238;
					method2809(var239);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3730 == arg0.field1305) {
				boolean var242 = var3.method10553();
				if (!var242) {
					Statics.field1781 = null;
				} else if (Statics.field1781 == null) {
					Statics.field1781 = new class424();
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3766 == arg0.field1305) {
				method763();
				int var243 = var3.method10422();
				int var244 = var3.method10422();
				int var245 = var3.method10345();
				int var246 = var3.method10375();
				field354[var243] = var245;
				field540[var243] = var246;
				field403[var243] = 1;
				field616[var243] = var244;
				for (int var247 = 0; var247 < 98; var247++) {
					if (var245 >= class380.field4370[var247]) {
						field403[var243] = var247 + 2;
					}
				}
				field533[++field333 - 1 & 0x1F] = var243;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3742 == arg0.field1305) {
				Statics.field2014 = Statics.method6278(var3.method10339());
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3735 == arg0.field1305) {
				method763();
				field491 = var3.method10593();
				field562 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3764 == arg0.field1305) {
				int var248 = var3.method10397();
				int var249 = var3.method10563();
				int var250 = var3.method10395();
				int var251 = class357.method6803(var248);
				int var252 = Statics.method6814(var248);
				int var253 = class357.method6805(var248);
				class80 var254 = field334.method2306(var252, var253);
				int var255 = var252 - var254.field1165;
				int var256 = var253 - var254.field1166;
				if (var255 >= 0 && var256 >= 0 && var255 < var254.field1163 && var256 < var254.field1164) {
					method6475(var254, var251, var255, var256, var249, var250);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3747 == arg0.field1305) {
				int var257 = var3.method10341();
				int var258 = var3.method10339();
				int var259 = var3.method10341();
				class59.method10185(var257, var258, var259);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3746 == arg0.field1305) {
				for (int var260 = 0; var260 < Statics.field4023.length; var260++) {
					if (Statics.field5048[var260] != Statics.field4023[var260]) {
						Statics.field4023[var260] = Statics.field5048[var260];
						method7512(var260);
						field548[++field453 - 1 & 0x1F] = var260;
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3737 == arg0.field1305) {
				int var261 = var3.method10563();
				if (var261 == 65535) {
					var261 = -1;
				}
				field422 = var261;
				this.method1323(false);
				method11(var261);
				class47.method7990(field422);
				for (int var262 = 0; var262 < 100; var262++) {
					field437[var262] = true;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3776 == arg0.field1305) {
				int var263 = var3.method10397();
				int var264 = var3.method10563();
				int var265 = var3.method10384();
				class82 var266 = (class82) Statics.field5344.field1161.method7917((long) var265);
				int var267 = var3.method10339();
				if (var266 != null) {
					var266.method2406(var267, var264, var263 >> 16, var263 & 0xFFFF);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3683 == arg0.field1305) {
				method7564();
				arg0.field1305 = null;
				return false;
			}
			if (class331.field3806 == arg0.field1305) {
				method4299(class329.field3651);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3719 == arg0.field1305) {
				byte var268 = var3.method10400();
				int var269 = var3.method10563();
				Statics.field5048[var269] = var268;
				if (Statics.field4023[var269] != var268) {
					Statics.field4023[var269] = var268;
				}
				method7512(var269);
				field548[++field453 - 1 & 0x1F] = var269;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3797 == arg0.field1305) {
				class42.method3669(Statics.field5344, var3, 5);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3706 == arg0.field1305) {
				boolean var270 = var3.method10422() == 1;
				int var271 = var3.method10397();
				class370 var272 = Statics.field1555.method6863(var271);
				if (var272.field4167 != var270) {
					var272.field4167 = var270;
					method2809(var272);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3732 == arg0.field1305) {
				Statics.field8 = (class385) class432.method3817(class385.method2501(), var3.method10339());
				field348 = var3.method10593();
				field349 = var3.method10341();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3750 == arg0.field1305) {
				method4299(class329.field3648);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3682 == arg0.field1305) {
				return this.method1022(arg0);
			}
			if (class331.field3712 == arg0.field1305) {
				byte[] var273 = new byte[arg0.field1295];
				var3.method10281(var273, 0, var273.length);
				class591 var274 = new class591(var273);
				String var275 = var274.method10350();
				class32.method325(var275, true, false);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3782 == arg0.field1305) {
				int var276 = var3.method10345();
				if (field487 != var276) {
					field487 = var276;
					method528();
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3780 == arg0.field1305) {
				int var277 = var3.method10324();
				int var278 = var3.method10395();
				class370 var279 = Statics.field1555.method6863(var278);
				if (var279.field4193 != 1 || var279.field4278 != var277) {
					var279.field4193 = 1;
					var279.field4278 = var277;
					method2809(var279);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3695 == arg0.field1305) {
				Statics.field280.method1563(var3, arg0.field1295);
				field556 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3790 == arg0.field1305) {
				int var280 = var3.method10345();
				int var281 = var3.method10341();
				if (var280 < -70000) {
					var281 += 32768;
				}
				class370 var282;
				if (var280 >= 0) {
					var282 = Statics.field1555.method6863(var280);
				} else {
					var282 = null;
				}
				while (var3.field5920 < arg0.field1295) {
					int var283 = var3.method10355();
					int var284 = var3.method10341();
					int var285 = 0;
					if (var284 != 0) {
						var285 = var3.method10339();
						if (var285 == 255) {
							var285 = var3.method10345();
						}
					}
					if (var282 != null && var283 >= 0 && var283 < var282.field4260.length) {
						var282.field4260[var283] = var284;
						var282.field4282[var283] = var285;
					}
					class63.method3335(var281, var283, var284 - 1, var285);
				}
				if (var282 != null) {
					method2809(var282);
				}
				method763();
				field550[++field536 - 1 & 0x1F] = var281 & 0x7FFF;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3799 == arg0.field1305) {
				int var286 = var3.method10436();
				int var287 = var3.method10341();
				if (var287 == 65535) {
					var287 = -1;
				}
				int var288 = var3.method10324();
				if (var288 == 65535) {
					var288 = -1;
				}
				int var289 = var3.method10395();
				int var290 = var3.method10397();
				class360 var291 = (class360) field439.method7973((long) var289);
				if (var291 != null) {
					var291.method2234();
				}
				class360 var292 = Statics.method6738(var291, var288, var287, var286, var290);
				field439.method7975(var292, (long) var289);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3711 == arg0.field1305) {
				method4299(class329.field3656);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3754 == arg0.field1305) {
				method3415(true, arg0.field1294);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3728 == arg0.field1305) {
				int var293 = var3.method10355();
				boolean var294 = var3.method10339() == 1;
				String var295 = "";
				boolean var296 = false;
				if (var294) {
					var295 = var3.method10350();
					if (Statics.field280.method1512(new class614(var295, Statics.field1293))) {
						var296 = true;
					}
				}
				String var297 = var3.method10350();
				if (!var296) {
					class92.method2825(var293, var295, var297);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3745 == arg0.field1305) {
				int var298 = var3.method10422();
				int var299 = var3.method10422();
				String var300 = var3.method10350();
				if (var298 >= 1 && var298 <= 8) {
					if (var300.equalsIgnoreCase(class394.field4507)) {
						var300 = null;
					}
					field517[var298 - 1] = var300;
					field440[var298 - 1] = var299 == 0;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3761 == arg0.field1305) {
				method5049(Statics.field3837, var3);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3758 == arg0.field1305) {
				int var301 = var3.method10422();
				int var302 = var3.method10397();
				int var303 = var3.method10339();
				class370 var304 = Statics.field1555.method6863(var302);
				var304.field4207.method6920(var303, var301);
				method2809(var304);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3727 == arg0.field1305 && field475) {
				field450 = true;
				field588 = false;
				field554 = false;
				for (int var305 = 0; var305 < 5; var305++) {
					field611[var305] = false;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3796 == arg0.field1305) {
				arg0.field1290 = var3.method10593();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3740 == arg0.field1305) {
				Statics.field3086 = null;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3765 == arg0.field1305) {
				int var306 = var3.method10324();
				int var307 = var3.method10563();
				class340.method5500(var307, var306);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3723 == arg0.field1305) {
				int var308 = var3.method10339();
				int var309 = var3.method10563();
				int var310 = var3.method10436();
				int var311 = class357.method6803(var310);
				int var312 = Statics.method6814(var310);
				int var313 = class357.method6805(var310);
				class80 var314 = field334.method2306(var312, var313);
				int var315 = var312 - var314.field1165;
				int var316 = var313 - var314.field1166;
				if (var315 >= 0 && var316 >= 0 && var315 < var314.field1163 && var316 < var314.field1164) {
					Statics.method2058(var314, var311, var315, var316, var309, var308);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3708 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field588 = true;
				int var317 = method4517(var3.method10593() & 0x7EB);
				int var318 = method5721(var3.method10593() & 0x7EB);
				int var319 = var3.method10341();
				int var320 = var3.method10339();
				field478 = new class551(Statics.field4856, var318, var319, var320);
				field515 = new class551(Statics.field3461, var317, var319, var320);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3710 == arg0.field1305) {
				Statics.field861 = var3.method10553();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3692 == arg0.field1305) {
				Statics.field1874 = var3.method10339();
				Statics.field1757 = var3.method10422();
				field476 = var3.method10339();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3724 == arg0.field1305) {
				String var321 = var3.method10350();
				String var322 = class466.method8836(class446.method7517(class377.method2112(var3)));
				class92.method2825(6, var321, var322);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3752 == arg0.field1305) {
				field475 = true;
				field450 = false;
				field554 = true;
				Statics.field115 = var3.method10339();
				Statics.field2488 = var3.method10339();
				int var323 = var3.method10341();
				int var324 = var3.method10341();
				field589 = var3.method10553();
				int var325 = var3.method10339();
				int var326 = class357.method6806(Statics.field115);
				int var327 = class357.method6806(Statics.field2488);
				boolean var328 = false;
				boolean var329 = false;
				int var330;
				int var331;
				if (field589) {
					var330 = Statics.field1941;
					var331 = method7784(Statics.field3837, var326, var327, Statics.field3837.field1171) - var323;
				} else {
					var330 = method7784(Statics.field3837, Statics.field2053, Statics.field47, Statics.field3837.field1171) - Statics.field1941;
					var331 = var323;
				}
				field590 = new class550(Statics.field2053, Statics.field47, var330, var326, var327, var331, var324, var325);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3731 == arg0.field1305) {
				method4299(class329.field3649);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3791 == arg0.field1305) {
				int var332 = var3.method10422();
				int var333 = var332 >> 2;
				int var334 = var332 & 0x3;
				int var335 = field321[var333];
				int var336 = var3.method10341();
				int var337 = var3.method10419();
				int var338 = var337 >> 16;
				int var339 = var337 >> 8 & 0xFF;
				int var340 = (var337 >> 4 & 0x7) + var338;
				int var341 = (var337 & 0x7) + var339;
				if (var340 >= 0 && var340 < 103 && var341 >= 0 && var341 < 103) {
					method3811(var340, var341, var333, var334, var335, var336);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3757 == arg0.field1305) {
				return this.method811(arg0);
			}
			if (class331.field3773 == arg0.field1305) {
				Statics.field5395 = var3.method10553();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3762 == arg0.field1305) {
				method6323(Statics.field5344, true, var3);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3696 == arg0.field1305) {
				int var342 = var3.method10436();
				int var343 = var3.method10563();
				class370 var344 = Statics.field1555.method6863(var342);
				if (var344.field4193 != 6 || var344.field4278 != var343) {
					var344.field4193 = 6;
					var344.field4278 = var343;
					method2809(var344);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3713 == arg0.field1305) {
				int var345 = var3.method10593();
				class519 var346 = (class519) class432.method3817(class519.method9260(), var3.method10339());
				class517 var347 = (class517) class432.method3817(class517.method6796(), var3.method10339());
				if (var345 == -2) {
					field334.method2323(var346, var347);
				} else {
					field334.method2312(var345, var346, var347);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3733 == arg0.field1305) {
				int var348 = var3.method10339();
				method7544(var348);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3703 == arg0.field1305) {
				field456 = var3.method10339();
				if (field456 == 1) {
					field457 = var3.method10341();
				}
				if (field456 >= 2 && field456 <= 6) {
					if (field456 == 2) {
						field462 = 64;
						field463 = 64;
					}
					if (field456 == 3) {
						field462 = 0;
						field463 = 64;
					}
					if (field456 == 4) {
						field462 = 128;
						field463 = 64;
					}
					if (field456 == 5) {
						field462 = 64;
						field463 = 0;
					}
					if (field456 == 6) {
						field462 = 64;
						field463 = 128;
					}
					field456 = 2;
					field459 = var3.method10341();
					field460 = var3.method10341();
					field461 = var3.method10339();
				}
				if (field456 == 10) {
					field458 = var3.method10341();
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3787 == arg0.field1305) {
				int var349 = var3.method10345();
				int var350 = var3.method10341();
				if (var349 < -70000) {
					var350 += 32768;
				}
				class370 var351;
				if (var349 >= 0) {
					var351 = Statics.field1555.method6863(var349);
				} else {
					var351 = null;
				}
				if (var351 != null) {
					for (int var352 = 0; var352 < var351.field4260.length; var352++) {
						var351.field4260[var352] = 0;
						var351.field4282[var352] = 0;
					}
				}
				class63.method55(var350);
				int var353 = var3.method10341();
				for (int var354 = 0; var354 < var353; var354++) {
					int var355 = var3.method10324();
					int var356 = var3.method10422();
					if (var356 == 255) {
						var356 = var3.method10345();
					}
					if (var351 != null && var354 < var351.field4260.length) {
						var351.field4260[var354] = var355;
						var351.field4282[var354] = var356;
					}
					class63.method3335(var350, var354, var355 - 1, var356);
				}
				if (var351 != null) {
					method2809(var351);
				}
				method763();
				field550[++field536 - 1 & 0x1F] = var350 & 0x7FFF;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3756 == arg0.field1305) {
				int var357 = var3.method10422();
				int var358 = var3.method10341();
				int var359 = var3.method10395();
				int var360 = var3.method10375();
				int var361 = var3.method10384();
				int var362 = var3.method10397();
				boolean var363 = var3.method10422() == 1;
				int var364 = var3.method10341();
				int var365 = class357.method6803(var362);
				int var366 = Statics.method6814(var362);
				int var367 = class357.method6805(var362);
				class80 var368 = field334.method2306(var366, var367);
				int var369 = var366 - var368.field1165;
				int var370 = var367 - var368.field1166;
				if (var369 >= 0 && var370 >= 0 && var369 < var368.field1163 && var370 < var368.field1164) {
					method5055(var368, var365, var369, var370, var358, var359, var360, var364, var361, var357, var363);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3721 == arg0.field1305) {
				int var371 = var3.method10436();
				int var372 = var3.method10341();
				class70 var373;
				if (field492 == var372) {
					var373 = Statics.field1109;
				} else {
					var373 = (class70) Statics.field5344.field1170.method7917((long) var372);
				}
				int var374 = var3.method10563();
				int var375 = var3.method10339();
				if (var373 != null) {
					var373.method2406(var375, var374, var371 >> 16, var371 & 0xFFFF);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3671 == arg0.field1305) {
				int var376 = var3.method10345();
				int var377 = var3.method10345();
				class370 var378 = Statics.field1555.method6863(var376);
				var378.field4207.method6928(var377);
				method2809(var378);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3672 == arg0.field1305) {
				int var379 = var3.method10324();
				int var380 = var3.method10422();
				if (var379 == 65535) {
					var379 = -1;
				}
				method3768(Statics.field1109, var379, var380);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3767 == arg0.field1305) {
				byte var381 = var3.method10340();
				String var382 = var3.method10350();
				long var383 = (long) var3.method10341();
				long var385 = (long) var3.method10419();
				class398 var387 = (class398) class432.method3817(class398.method8270(), var3.method10339());
				long var388 = (var383 << 32) + var385;
				boolean var390 = false;
				Object var391 = null;
				class172 var392 = var381 >= 0 ? field583[var381] : Statics.field1230;
				if (var392 == null) {
					var390 = true;
				} else {
					int var393 = 0;
					while (true) {
						if (var393 >= 100) {
							if (var387.field4820 && Statics.field280.method1512(new class614(var382, Statics.field1293))) {
								var390 = true;
							}
							break;
						}
						if (field575[var393] == var388) {
							var390 = true;
							break;
						}
						var393++;
					}
				}
				if (!var390) {
					field575[field576] = var388;
					field576 = (field576 + 1) % 100;
					String var394 = class466.method8836(class377.method2112(var3));
					int var395 = var381 >= 0 ? 41 : 44;
					if (var387.field4816 == -1) {
						class92.method3264(var395, var382, var394, var392.field1920);
					} else {
						class92.method3264(var395, class83.method1981(var387.field4816) + var382, var394, var392.field1920);
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3674 == arg0.field1305) {
				int var396 = var3.method10384();
				class63.method3907(var396);
				field550[++field536 - 1 & 0x1F] = var396 & 0x7FFF;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3700 == arg0.field1305) {
				method4299(class329.field3650);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3697 == arg0.field1305) {
				Statics.field3471 = var3.method10553();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3779 == arg0.field1305) {
				int var397 = var3.method10395();
				int var398 = var3.method10586();
				class370 var399 = Statics.field1555.method6863(var397);
				if (var399.field4197 != var398 || var398 == -1) {
					var399.field4197 = var398;
					var399.field4285 = 0;
					var399.field4136 = 0;
					method2809(var399);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3689 == arg0.field1305) {
				Statics.field280.field646.method9176(var3, arg0.field1295);
				method291();
				field556 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3705 == arg0.field1305) {
				method3415(false, arg0.field1294);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3691 == arg0.field1305) {
				int var400 = var3.method10384();
				int var401 = var3.method10345();
				Statics.field5048[var400] = var401;
				if (Statics.field4023[var400] != var401) {
					Statics.field4023[var400] = var401;
				}
				method7512(var400);
				field548[++field453 - 1 & 0x1F] = var400;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3793 == arg0.field1305) {
				int var402 = var3.method10563();
				if (var402 == 65535) {
					var402 = -1;
				}
				int var403 = var3.method10562();
				method3821(var402, var403);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3716 == arg0.field1305) {
				field450 = false;
				field475 = false;
				field554 = false;
				field588 = false;
				Statics.field1910 = 0;
				Statics.field2655 = 0;
				Statics.field5414 = 0;
				field589 = false;
				Statics.field688 = 0;
				Statics.field1726 = 0;
				Statics.field3291 = 0;
				Statics.field3151 = 0;
				Statics.field115 = 0;
				Statics.field2488 = 0;
				Statics.field5047 = 0;
				field590 = null;
				field478 = null;
				field515 = null;
				for (int var404 = 0; var404 < 5; var404++) {
					field611[var404] = false;
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3698 == arg0.field1305) {
				var3.method10346();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3744 == arg0.field1305) {
				Statics.field3086 = new class526(Statics.field818);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3676 == arg0.field1305) {
				field374 = var3.method10341() * 30;
				field562 = field405;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3792 == arg0.field1305) {
				method6781(var3.method10350());
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3702 == arg0.field1305) {
				field586 = var3.method10339();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3760 == arg0.field1305) {
				field346 = var3.method10350();
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3709 == arg0.field1305) {
				int var405 = var3.method10397();
				int var406 = var3.method10384();
				class370 var407 = Statics.field1555.method6863(var405);
				if (var407 != null && var407.field4148 == 0) {
					if (var406 > var407.field4173 - var407.field4150) {
						var406 = var407.field4173 - var407.field4150;
					}
					if (var406 < 0) {
						var406 = 0;
					}
					if (var407.field4171 != var406) {
						var407.field4171 = var406;
						method2809(var407);
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3753 == arg0.field1305) {
				if (Statics.field3086 == null) {
					Statics.field3086 = new class526(Statics.field818);
				}
				class601 var408 = Statics.field818.method9670(var3);
				Statics.field3086.field5549.method10053(var408.field5987, var408.field5986);
				field539[++field555 - 1 & 0x1F] = var408.field5987;
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3770 == arg0.field1305) {
				int var409 = var3.method10339();
				method6900(var409);
				arg0.field1305 = null;
				return false;
			}
			if (class331.field3688 == arg0.field1305) {
				Iterator var410 = Statics.field5344.field1170.iterator();
				while (var410.hasNext()) {
					class70 var411 = (class70) var410.next();
					var411.method2426();
				}
				Iterator var412 = Statics.field5344.field1161.iterator();
				while (var412.hasNext()) {
					class82 var413 = (class82) var412.next();
					var413.method2426();
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3699 == arg0.field1305) {
				int var414 = var3.method10395();
				int var415 = var3.method10373();
				class370 var416 = Statics.field1555.method6863(var414);
				var416.field4207.method6949(Statics.field1109.field936.field4085, var415);
				method2809(var416);
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3775 == arg0.field1305) {
				if (field422 != -1) {
					method3585(field422, 0);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3722 == arg0.field1305) {
				Statics.field1757 = var3.method10375();
				Statics.field1874 = var3.method10375();
				field476 = var3.method10422();
				while (var3.field5920 < arg0.field1295) {
					int var417 = var3.method10339();
					class329 var418 = class329.method5946()[var417];
					method4299(var418);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3763 == arg0.field1305) {
				int var419 = var3.method10395();
				int var420 = var3.method10395();
				int var421 = var3.method10341();
				int var422 = class357.method6803(var420);
				int var423 = Statics.method6814(var420);
				int var424 = class357.method6805(var420);
				class80 var425 = field334.method2306(var423, var424);
				int var426 = var423 - var425.field1165;
				int var427 = var424 - var425.field1166;
				if (var426 >= 0 && var426 < var425.field1163 && var427 >= 0 && var427 < var425.field1164) {
					method5064(var425, var422, var426, var427, var421, var419);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3755 == arg0.field1305) {
				int var428 = var3.method10563();
				int var429 = var3.method10384();
				int var430 = var3.method10324();
				int var431 = var3.method10345();
				class370 var432 = Statics.field1555.method6863(var431);
				if (var432.field4201 != var428 || var432.field4236 != var429 || var432.field4204 != var430) {
					var432.field4201 = var428;
					var432.field4236 = var429;
					var432.field4204 = var430;
					method2809(var432);
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3720 == arg0.field1305) {
				String var433 = var3.method10350();
				long var434 = (long) var3.method10341();
				long var436 = (long) var3.method10419();
				class398 var438 = (class398) class432.method3817(class398.method8270(), var3.method10339());
				long var439 = (var434 << 32) + var436;
				boolean var441 = false;
				for (int var442 = 0; var442 < 100; var442++) {
					if (field575[var442] == var439) {
						var441 = true;
						break;
					}
				}
				if (Statics.field280.method1512(new class614(var433, Statics.field1293))) {
					var441 = true;
				}
				if (!var441 && field342 == 0) {
					field575[field576] = var439;
					field576 = (field576 + 1) % 100;
					String var443 = class466.method8836(class446.method7517(class377.method2112(var3)));
					byte var444;
					if (var438.field4834) {
						var444 = 7;
					} else {
						var444 = 3;
					}
					if (var438.field4816 == -1) {
						class92.method2825(var444, var433, var443);
					} else {
						class92.method2825(var444, class83.method1981(var438.field4816) + var433, var443);
					}
				}
				arg0.field1305 = null;
				return true;
			}
			if (class331.field3801 == arg0.field1305) {
				int var445 = var3.method10563();
				int var446 = var3.method10345();
				int var447 = var3.method10395();
				int var448 = var3.method10436();
				int var449 = class357.method6803(var447);
				int var450 = Statics.method6814(var447);
				int var451 = class357.method6805(var447);
				class80 var452 = field334.method2306(var450, var451);
				int var453 = var450 - var452.field1165;
				int var454 = var451 - var452.field1166;
				if (var453 >= 0 && var454 >= 0 && var453 < var452.field1163 && var454 < var452.field1164) {
					method2710(var452, var449, var453, var454, var445, var446, var448);
				}
				arg0.field1305 = null;
				return true;
			}
			class617.method9413("" + (arg0.field1305 == null ? -1 : arg0.field1305.field3809) + class83.field1197 + (arg0.field1303 == null ? -1 : arg0.field1303.field3809) + class83.field1197 + (arg0.field1307 == null ? -1 : arg0.field1307.field3809) + class83.field1197 + arg0.field1295, null);
			method7564();
		} catch (IOException var459) {
			method6899();
		} catch (Exception var460) {
			String var457 = "" + (arg0.field1305 == null ? -1 : arg0.field1305.field3809) + class83.field1197 + (arg0.field1303 == null ? -1 : arg0.field1303.field3809) + class83.field1197 + (arg0.field1307 == null ? -1 : arg0.field1307.field3809) + class83.field1197 + arg0.field1295 + class83.field1197 + (Statics.field3837.field1165 + Statics.field1109.field1040[0]) + class83.field1197 + (Statics.field3837.field1166 + Statics.field1109.field1108[0]) + class83.field1197;
			for (int var458 = 0; var458 < arg0.field1295 && var458 < 50; var458++) {
				var457 = var457 + var3.field5917[var458] + class83.field1197;
			}
			class617.method9413(var457, var460);
			method7564();
		}
		return true;
	}

	@ObfuscatedName("client.qa(B)V")
	public final void method1178() {
		class611 var1 = field523;
		boolean var2 = false;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < var1.field6053 - 1; var3++) {
				if (var1.field6056[var3] < 1000 && var1.field6056[var3 + 1] > 1000) {
					String var4 = var1.field6063[var3];
					var1.field6063[var3] = var1.field6063[var3 + 1];
					var1.field6063[var3 + 1] = var4;
					String var5 = var1.field6057[var3];
					var1.field6057[var3] = var1.field6057[var3 + 1];
					var1.field6057[var3 + 1] = var5;
					class611 var6 = var1.field6062[var3];
					var1.field6062[var3] = var1.field6062[var3 + 1];
					var1.field6062[var3 + 1] = var6;
					int var7 = var1.field6056[var3];
					var1.field6056[var3] = var1.field6056[var3 + 1];
					var1.field6056[var3 + 1] = var7;
					int var8 = var1.field6068[var3];
					var1.field6068[var3] = var1.field6068[var3 + 1];
					var1.field6068[var3 + 1] = var8;
					int var9 = var1.field6055[var3];
					var1.field6055[var3] = var1.field6055[var3 + 1];
					var1.field6055[var3 + 1] = var9;
					int var10 = var1.field6065[var3];
					var1.field6065[var3] = var1.field6065[var3 + 1];
					var1.field6065[var3 + 1] = var10;
					int var11 = var1.field6058[var3];
					var1.field6058[var3] = var1.field6058[var3 + 1];
					var1.field6058[var3 + 1] = var11;
					int var12 = var1.field6061[var3];
					var1.field6061[var3] = var1.field6061[var3 + 1];
					var1.field6061[var3 + 1] = var12;
					boolean var13 = var1.field6052[var3];
					var1.field6052[var3] = var1.field6052[var3 + 1];
					var1.field6052[var3 + 1] = var13;
					var2 = false;
				}
			}
		}
		if (field613 != null) {
			return;
		}
		int var14 = class36.field223;
		if (field522) {
			if (var14 != 1 && (Statics.field5059 || var14 != 4) && !field523.method11013(class36.field232, class36.field221)) {
				field522 = false;
				field523.method10980();
			}
			if (var14 == 1 || !Statics.field5059 && var14 == 4) {
				field523.method10978(class36.field222, class36.field225);
				field522 = false;
				field523.method10980();
			}
		} else if (field523.field6053 > 0) {
			int var15 = field523.field6053 - 1;
			if ((var14 == 1 || !Statics.field5059 && var14 == 4) && this.method959(field523.field6056[var15], field523.field6052[var15])) {
				var14 = 2;
			}
			if (var14 == 1 || !Statics.field5059 && var14 == 4) {
				field523.method10976(var15);
			}
			if (var14 == 2) {
				this.method817(class36.field222, class36.field225);
			}
		}
	}

	@ObfuscatedName("client.qw(IZI)Z")
	public final boolean method959(int arg0, boolean arg1) {
		return (field521 && field523.field6053 > 2 || method8553(arg0)) && !arg1;
	}

	@ObfuscatedName("client.qj(III)V")
	public final void method817(int arg0, int arg1) {
		field523.method10981(arg0, arg1);
		Iterator var3 = field334.iterator();
		while (var3.hasNext()) {
			class80 var4 = (class80) var3.next();
			var4.field1160.method4991(false);
		}
		field522 = true;
		field523.method11001();
	}

	@ObfuscatedName("client.qc(ZI)V")
	public final void method1323(boolean arg0) {
		method7551(field422, Statics.field208, Statics.field4810, arg0);
	}

	@ObfuscatedName("client.qz(Loi;B)V")
	public void method937(class370 arg0) {
		class370 var2 = arg0.field4165 == -1 ? null : Statics.field1555.method6864(arg0.field4165, arg0.field4166);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Statics.field208;
			var4 = Statics.field4810;
		} else {
			var3 = var2.field4161;
			var4 = var2.field4150;
		}
		method6789(arg0, var3, var4, false);
		method5410(arg0, var3, var4);
	}

	@ObfuscatedName("client.qh(B)V")
	public final void method884() {
		method2809(field613);
		Statics.field1038++;
		if (field544 && field541) {
			int var1 = class36.field232;
			int var2 = class36.field221;
			int var3 = var1 - field538;
			int var4 = var2 - field558;
			if (var3 < field542) {
				var3 = field542;
			}
			if (field613.field4161 + var3 > field542 + field537.field4161) {
				var3 = field542 + field537.field4161 - field613.field4161;
			}
			if (var4 < field543) {
				var4 = field543;
			}
			if (field613.field4150 + var4 > field543 + field537.field4150) {
				var4 = field543 + field537.field4150 - field613.field4150;
			}
			int var5 = var3 - field545;
			int var6 = var4 - field546;
			int var7 = field613.field4233;
			if (Statics.field1038 > field613.field4286 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
				field547 = true;
			}
			int var8 = field537.field4261 + (var3 - field542);
			int var9 = field537.field4171 + (var4 - field543);
			if (field613.field4292 != null && field547) {
				class66 var10 = new class66();
				var10.field894 = field613;
				var10.field901 = var8;
				var10.field896 = var9;
				var10.field899 = field613.field4292;
				class47.method6482(var10);
			}
			if (class36.field219 == 0) {
				if (field547) {
					if (field613.field4289 != null) {
						class66 var11 = new class66();
						var11.field894 = field613;
						var11.field901 = var8;
						var11.field896 = var9;
						var11.field897 = field446;
						var11.field899 = field613.field4289;
						class47.method6482(var11);
					}
					if (field446 != null && method4217(field613) != null) {
						class330 var12 = class330.method3456(class328.field3583, field315.field1309);
						var12.field3665.method10381(field613.field4283);
						var12.field3665.method10392(field613.field4145);
						var12.field3665.method10381(field446.field4146);
						var12.field3665.method10466(field613.field4146);
						var12.field3665.method10379(field446.field4283);
						var12.field3665.method10377(field446.field4145);
						field315.method2874(var12);
					}
				} else if (Statics.field5587 == null || this.method959(Statics.field5587.field712, Statics.field5587.field721)) {
					this.method817(field545 + field538, field558 + field546);
				} else if (field523.field6053 > 0) {
					int var13 = field545 + field538;
					int var14 = field558 + field546;
					class51 var15 = Statics.field5587;
					if (var15 != null) {
						method9046(var15.field714, var15.field713, var15.field712, var15.field715, var15.field716, var15.field720, var15.field718, var15.field717, var13, var14);
					}
					Statics.field5587 = null;
				}
				field613 = null;
			}
		} else if (Statics.field1038 > 1) {
			if (!field547 && field523.field6053 > 0) {
				int var16 = field545 + field538;
				int var17 = field558 + field546;
				class51 var18 = Statics.field5587;
				if (var18 != null) {
					method9046(var18.field714, var18.field713, var18.field712, var18.field715, var18.field716, var18.field720, var18.field718, var18.field717, var16, var17);
				}
				Statics.field5587 = null;
			}
			field613 = null;
		}
	}

	@ObfuscatedName("client.qy(I)Lxa;")
	public class614 method1361() {
		return Statics.field1109 == null ? null : Statics.field1109.field935;
	}

	@ObfuscatedName("client.qd(IB)V")
	public void method822(int arg0) {
		class330 var2 = class330.method3456(class328.field3625, field315.field1309);
		var2.field3665.method10320(arg0);
		field315.method2874(var2);
	}

	@ObfuscatedName("client.qu(II)V")
	public void method823(int arg0) {
		class330 var2 = class330.method3456(class328.field3635, field315.field1309);
		var2.field3665.method10320(arg0);
		field315.method2874(var2);
	}
}

package deob;

import com.jagex.oldscape.pub.OAuthTokens;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class32 implements class344, OAuthTokens {

    @ObfuscatedName("client.w")
    public static class184[] field751 = new class184[4];

    @ObfuscatedName("client.ad")
    public static boolean field714 = true;

    @ObfuscatedName("client.bp")
    public static int field469 = 1;

    @ObfuscatedName("client.bd")
    public static int field470 = 0;

    @ObfuscatedName("client.bq")
    public static int field476 = 0;

    @ObfuscatedName("client.bi")
    public static boolean field601 = false;

    @ObfuscatedName("client.bm")
    public static boolean field473 = false;

    @ObfuscatedName("client.bs")
    public static int field474 = -1;

    @ObfuscatedName("client.bv")
    public static int field475 = -1;

    @ObfuscatedName("client.bb")
    public static int field500 = -1;

    @ObfuscatedName("client.bc")
    public static boolean field534 = false;

    @ObfuscatedName("client.ce")
    public static int field478 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field480 = true;

    @ObfuscatedName("client.cu")
    public static int field481 = 0;

    @ObfuscatedName("client.cx")
    public static long field482 = 1L;

    @ObfuscatedName("client.dm")
    public static int field484 = -1;

    @ObfuscatedName("client.dr")
    public static int field747 = -1;

    @ObfuscatedName("client.ds")
    public static long field486 = -1L;

    @ObfuscatedName("client.dv")
    public static boolean field487 = true;

    @ObfuscatedName("client.do")
    public static boolean field488 = false;

    @ObfuscatedName("client.dt")
    public static int field489 = 0;

    @ObfuscatedName("client.dy")
    public static int field490 = 0;

    @ObfuscatedName("client.dk")
    public static int field491 = 0;

    @ObfuscatedName("client.de")
    public static int field492 = 0;

    @ObfuscatedName("client.df")
    public static int field493 = 0;

    @ObfuscatedName("client.dh")
    public static int field729 = 0;

    @ObfuscatedName("client.dn")
    public static int field495 = 0;

    @ObfuscatedName("client.dx")
    public static int field496 = 0;

    @ObfuscatedName("client.dp")
    public static int field497 = 0;

    @ObfuscatedName("client.dq")
    public static class94 field498 = class94.field1238;

    @ObfuscatedName("client.db")
    public static class94 field574 = class94.field1238;

    @ObfuscatedName("client.du")
    public static int field732 = 0;

    @ObfuscatedName("client.dg")
    public static int field501 = 0;

    @ObfuscatedName("client.di")
    public static int field518 = 0;

    @ObfuscatedName("client.ex")
    public static int field525 = 0;

    @ObfuscatedName("client.es")
    public static int field504 = 0;

    @ObfuscatedName("client.eb")
    public static int field546 = 0;

    @ObfuscatedName("client.ey")
    public static int field542 = 0;

    @ObfuscatedName("client.eq")
    public static int field507 = 0;

    @ObfuscatedName("client.ew")
    public static class123 field508 = class123.field1474;

    @ObfuscatedName("client.ff")
    public static class423 field509 = class423.field4524;

    @ObfuscatedName("client.fd")
    public String field577;

    @ObfuscatedName("client.fq")
    public class15 field511;

    @ObfuscatedName("client.fz")
    public class20 field614;

    @ObfuscatedName("client.fl")
    public static boolean field513 = false;

    @ObfuscatedName("client.fy")
    public static class71 field514 = new class71();

    @ObfuscatedName("client.fp")
    public class419 field711;

    @ObfuscatedName("client.fn")
    public class8 field516;

    @ObfuscatedName("client.fm")
    public static byte[] field517 = null;

    @ObfuscatedName("client.gf")
    public static class91[] field699 = new class91[32768];

    @ObfuscatedName("client.gv")
    public static int field519 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field520 = new int[32768];

    @ObfuscatedName("client.gm")
    public static int field521 = 0;

    @ObfuscatedName("client.gw")
    public static int[] field606 = new int[250];

    @ObfuscatedName("client.gs")
    public static final class99 field690 = new class99();

    @ObfuscatedName("client.gb")
    public static int field506 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field656 = false;

    @ObfuscatedName("client.gq")
    public static boolean field526 = true;

    @ObfuscatedName("client.gi")
    public static boolean field527 = false;

    @ObfuscatedName("client.gy")
    public static class338 field528 = new class338();

    @ObfuscatedName("client.gc")
    public static HashMap field529 = new HashMap();

    @ObfuscatedName("client.hj")
    public static int field530 = 0;

    @ObfuscatedName("client.hp")
    public static int field531 = 1;

    @ObfuscatedName("client.hl")
    public static int field618 = 0;

    @ObfuscatedName("client.hn")
    public static int field533 = 1;

    @ObfuscatedName("client.hd")
    public static int field603 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field536 = false;

    @ObfuscatedName("client.hc")
    public static int[][][] field537 = new int[4][13][13];

    @ObfuscatedName("client.hf")
    public static final int[] field538 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.hz")
    public static int field539 = 0;

    @ObfuscatedName("client.it")
    public static String field743 = null;

    @ObfuscatedName("client.ig")
    public static int field694 = 2301979;

    @ObfuscatedName("client.im")
    public static int field717 = 5063219;

    @ObfuscatedName("client.ib")
    public static int field510 = 3353893;

    @ObfuscatedName("client.ia")
    public static int field545 = 7759444;

    @ObfuscatedName("client.ik")
    public static boolean field544 = false;

    @ObfuscatedName("client.iy")
    public static int field703 = 0;

    @ObfuscatedName("client.if")
    public static int field477 = 128;

    @ObfuscatedName("client.iw")
    public static int field499 = 0;

    @ObfuscatedName("client.ir")
    public static int field548 = 0;

    @ObfuscatedName("client.ih")
    public static int field549 = 0;

    @ObfuscatedName("client.ii")
    public static int field550 = 0;

    @ObfuscatedName("client.il")
    public static int field551 = 0;

    @ObfuscatedName("client.jd")
    public static int field552 = 0;

    @ObfuscatedName("client.jp")
    public static int field553 = 50;

    @ObfuscatedName("client.jk")
    public static int field543 = 0;

    @ObfuscatedName("client.jq")
    public static int field585 = 0;

    @ObfuscatedName("client.jc")
    public static int field556 = 0;

    @ObfuscatedName("client.jh")
    public static int field557 = 12;

    @ObfuscatedName("client.jx")
    public static int field535 = 6;

    @ObfuscatedName("client.jf")
    public static int field608 = 0;

    @ObfuscatedName("client.jz")
    public static boolean field613 = false;

    @ObfuscatedName("client.jj")
    public static int field561 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field562 = false;

    @ObfuscatedName("client.jg")
    public static int field563 = 0;

    @ObfuscatedName("client.ju")
    public static int field564 = 0;

    @ObfuscatedName("client.jn")
    public static int field565 = 50;

    @ObfuscatedName("client.jo")
    public static int[] field566 = new int[field565];

    @ObfuscatedName("client.jb")
    public static int[] field567 = new int[field565];

    @ObfuscatedName("client.jm")
    public static int[] field568 = new int[field565];

    @ObfuscatedName("client.je")
    public static int[] field468 = new int[field565];

    @ObfuscatedName("client.ja")
    public static int[] field570 = new int[field565];

    @ObfuscatedName("client.jy")
    public static int[] field704 = new int[field565];

    @ObfuscatedName("client.ji")
    public static int[] field705 = new int[field565];

    @ObfuscatedName("client.js")
    public static String[] field663 = new String[field565];

    @ObfuscatedName("client.kf")
    public static int[][] field485 = new int[104][104];

    @ObfuscatedName("client.ks")
    public static int field593 = 0;

    @ObfuscatedName("client.kt")
    public static int field576 = -1;

    @ObfuscatedName("client.kd")
    public static int field589 = -1;

    @ObfuscatedName("client.ko")
    public static int field628 = 0;

    @ObfuscatedName("client.ky")
    public static int field579 = 0;

    @ObfuscatedName("client.kp")
    public static int field555 = 0;

    @ObfuscatedName("client.kn")
    public static int field558 = 0;

    @ObfuscatedName("client.kl")
    public static boolean field582 = true;

    @ObfuscatedName("client.kw")
    public static int field583 = 0;

    @ObfuscatedName("client.km")
    public static int field600 = 0;

    @ObfuscatedName("client.kx")
    public static int field624 = 0;

    @ObfuscatedName("client.ku")
    public static int field586 = 0;

    @ObfuscatedName("client.kg")
    public static int field587 = 0;

    @ObfuscatedName("client.ka")
    public static int field588 = 0;

    @ObfuscatedName("client.kh")
    public static boolean field573 = false;

    @ObfuscatedName("client.ki")
    public static int field590 = 0;

    @ObfuscatedName("client.kc")
    public static int field591 = 0;

    @ObfuscatedName("client.kv")
    public static boolean field645 = true;

    @ObfuscatedName("client.kb")
    public static class83[] field653 = new class83[2048];

    @ObfuscatedName("client.lw")
    public static int field594 = -1;

    @ObfuscatedName("client.lp")
    public static int field595 = 0;

    @ObfuscatedName("client.li")
    public static boolean field596 = true;

    @ObfuscatedName("client.lh")
    public static int field597 = 0;

    @ObfuscatedName("client.lk")
    public static int field598 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field599 = new int[1000];

    @ObfuscatedName("client.lo")
    public static final int[] field569 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ls")
    public static String[] field650 = new String[8];

    @ObfuscatedName("client.lx")
    public static boolean[] field602 = new boolean[8];

    @ObfuscatedName("client.lm")
    public static int[] field503 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.lv")
    public static int field604 = -1;

    @ObfuscatedName("client.lt")
    public static class321[][][] field631 = new class321[4][104][104];

    @ObfuscatedName("client.ly")
    public static class321 field657 = new class321();

    @ObfuscatedName("client.lu")
    public static class321 field655 = new class321();

    @ObfuscatedName("client.ld")
    public static class321 field607 = new class321();

    @ObfuscatedName("client.le")
    public static int[] field749 = new int[25];

    @ObfuscatedName("client.lb")
    public static int[] field610 = new int[25];

    @ObfuscatedName("client.lj")
    public static int[] field611 = new int[25];

    @ObfuscatedName("client.ln")
    public static int field612 = 0;

    @ObfuscatedName("client.lg")
    public static boolean field522 = false;

    @ObfuscatedName("client.mz")
    public static int field689 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field615 = new int[500];

    @ObfuscatedName("client.mw")
    public static int[] field616 = new int[500];

    @ObfuscatedName("client.mc")
    public static int[] field617 = new int[500];

    @ObfuscatedName("client.ml")
    public static int[] field541 = new int[500];

    @ObfuscatedName("client.mx")
    public static String[] field700 = new String[500];

    @ObfuscatedName("client.mv")
    public static String[] field709 = new String[500];

    @ObfuscatedName("client.mn")
    public static boolean[] field621 = new boolean[500];

    @ObfuscatedName("client.mo")
    public static boolean field622 = false;

    @ObfuscatedName("client.mp")
    public static boolean field623 = false;

    @ObfuscatedName("client.mu")
    public static boolean field494 = false;

    @ObfuscatedName("client.md")
    public static boolean field575 = true;

    @ObfuscatedName("client.mg")
    public static int field626 = -1;

    @ObfuscatedName("client.mr")
    public static int field627 = -1;

    @ObfuscatedName("client.mh")
    public static int field715 = 0;

    @ObfuscatedName("client.me")
    public static int field629 = 50;

    @ObfuscatedName("client.mt")
    public static int field630 = 0;

    @ObfuscatedName("client.ns")
    public static boolean field675 = false;

    @ObfuscatedName("client.nu")
    public static int field633 = -1;

    @ObfuscatedName("client.nr")
    public static int field634 = -1;

    @ObfuscatedName("client.nq")
    public static String field635 = null;

    @ObfuscatedName("client.nl")
    public static String field636 = null;

    @ObfuscatedName("client.nv")
    public static int field637 = -1;

    @ObfuscatedName("client.np")
    public static class397 field638 = new class397(8);

    @ObfuscatedName("client.nf")
    public static int field639 = 0;

    @ObfuscatedName("client.nk")
    public static int field640 = -1;

    @ObfuscatedName("client.nz")
    public static int field641 = 0;

    @ObfuscatedName("client.nc")
    public static int field642 = 0;

    @ObfuscatedName("client.nx")
    public static class281 field643 = null;

    @ObfuscatedName("client.nm")
    public static int field644 = 0;

    @ObfuscatedName("client.nd")
    public static int field722 = 0;

    @ObfuscatedName("client.nj")
    public static int field547 = 0;

    @ObfuscatedName("client.nw")
    public static int field647 = -1;

    @ObfuscatedName("client.na")
    public static boolean field648 = false;

    @ObfuscatedName("client.nn")
    public static class281 field649 = null;

    @ObfuscatedName("client.nb")
    public static class281 field713 = null;

    @ObfuscatedName("client.ok")
    public static class281 field651 = null;

    @ObfuscatedName("client.ov")
    public static int field652 = 0;

    @ObfuscatedName("client.oh")
    public static int field742 = 0;

    @ObfuscatedName("client.ot")
    public static class281 field654 = null;

    @ObfuscatedName("client.or")
    public static boolean field532 = false;

    @ObfuscatedName("client.oz")
    public static int field682 = -1;

    @ObfuscatedName("client.on")
    public static int field660 = -1;

    @ObfuscatedName("client.oc")
    public static boolean field658 = false;

    @ObfuscatedName("client.om")
    public static int field659 = -1;

    @ObfuscatedName("client.ow")
    public static int field661 = -1;

    @ObfuscatedName("client.ol")
    public static boolean field554 = false;

    @ObfuscatedName("client.oq")
    public static int field662 = 1;

    @ObfuscatedName("client.os")
    public static int[] field746 = new int[32];

    @ObfuscatedName("client.od")
    public static int field664 = 0;

    @ObfuscatedName("client.oi")
    public static int[] field665 = new int[32];

    @ObfuscatedName("client.oj")
    public static int field666 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field667 = new int[32];

    @ObfuscatedName("client.ox")
    public static int field668 = 0;

    @ObfuscatedName("client.oy")
    public static int[] field696 = new int[32];

    @ObfuscatedName("client.op")
    public static int field735 = 0;

    @ObfuscatedName("client.py")
    public static int field671 = 0;

    @ObfuscatedName("client.pj")
    public static int field672 = 0;

    @ObfuscatedName("client.pi")
    public static int field673 = 0;

    @ObfuscatedName("client.pk")
    public static int field674 = 0;

    @ObfuscatedName("client.ps")
    public static int field584 = 0;

    @ObfuscatedName("client.pp")
    public static int field676 = 0;

    @ObfuscatedName("client.pf")
    public static int field670 = 0;

    @ObfuscatedName("client.pd")
    public static int field472 = 0;

    @ObfuscatedName("client.pg")
    public static int field679 = 0;

    @ObfuscatedName("client.pa")
    public static class321 field632 = new class321();

    @ObfuscatedName("client.pl")
    public static class321 field681 = new class321();

    @ObfuscatedName("client.px")
    public static class321 field580 = new class321();

    @ObfuscatedName("client.pe")
    public static class397 field683 = new class397(512);

    @ObfuscatedName("client.pc")
    public static int field684 = 0;

    @ObfuscatedName("client.pt")
    public static int field685 = -2;

    @ObfuscatedName("client.pu")
    public static boolean[] field505 = new boolean[100];

    @ObfuscatedName("client.pv")
    public static boolean[] field687 = new boolean[100];

    @ObfuscatedName("client.po")
    public static boolean[] field688 = new boolean[100];

    @ObfuscatedName("client.pm")
    public static int[] field625 = new int[100];

    @ObfuscatedName("client.pb")
    public static int[] field471 = new int[100];

    @ObfuscatedName("client.qg")
    public static int[] field592 = new int[100];

    @ObfuscatedName("client.qf")
    public static int[] field692 = new int[100];

    @ObfuscatedName("client.qs")
    public static int field693 = 0;

    @ObfuscatedName("client.qk")
    public static long field515 = 0L;

    @ObfuscatedName("client.qd")
    public static boolean field695 = true;

    @ObfuscatedName("client.qm")
    public static int[] field750 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.qp")
    public static int field605 = 0;

    @ObfuscatedName("client.qr")
    public static int field698 = 0;

    @ObfuscatedName("client.qe")
    public static String field646 = "";

    @ObfuscatedName("client.qy")
    public static long[] field559 = new long[100];

    @ObfuscatedName("client.qx")
    public static int field701 = 0;

    @ObfuscatedName("client.qi")
    public static int field702 = 0;

    @ObfuscatedName("client.qz")
    public static int[] field759 = new int[128];

    @ObfuscatedName("client.qb")
    public static int[] field523 = new int[128];

    @ObfuscatedName("client.qu")
    public static long field677 = -1L;

    @ObfuscatedName("client.rv")
    public static class138[] field706 = new class138[2];

    @ObfuscatedName("client.rn")
    public static class147[] field707 = new class147[2];

    @ObfuscatedName("client.rm")
    public static int field571 = -1;

    @ObfuscatedName("client.rh")
    public static int field697 = 0;

    @ObfuscatedName("client.rb")
    public static int[] field710 = new int[1000];

    @ObfuscatedName("client.ry")
    public static int[] field581 = new int[1000];

    @ObfuscatedName("client.re")
    public static class432[] field669 = new class432[1000];

    @ObfuscatedName("client.ri")
    public static int field502 = 0;

    @ObfuscatedName("client.rr")
    public static int field678 = 0;

    @ObfuscatedName("client.rw")
    public static int field512 = 0;

    @ObfuscatedName("client.rt")
    public static int field716 = -1;

    @ObfuscatedName("client.rx")
    public static boolean field744 = false;

    @ObfuscatedName("client.st")
    public static int field718 = 0;

    @ObfuscatedName("client.so")
    public static int[] field719 = new int[50];

    @ObfuscatedName("client.sj")
    public static int[] field720 = new int[50];

    @ObfuscatedName("client.sk")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.sc")
    public static int[] field686 = new int[50];

    @ObfuscatedName("client.sf")
    public static class37[] field723 = new class37[50];

    @ObfuscatedName("client.se")
    public static boolean field724 = false;

    @ObfuscatedName("client.sb")
    public static boolean field725 = false;

    @ObfuscatedName("client.tu")
    public static boolean[] field726 = new boolean[5];

    @ObfuscatedName("client.tn")
    public static int[] field727 = new int[5];

    @ObfuscatedName("client.tv")
    public static int[] field680 = new int[5];

    @ObfuscatedName("client.tf")
    public static int[] field619 = new int[5];

    @ObfuscatedName("client.tl")
    public static int[] field730 = new int[5];

    @ObfuscatedName("client.ti")
    public static short field691 = 256;

    @ObfuscatedName("client.tz")
    public static short field708 = 205;

    @ObfuscatedName("client.td")
    public static short field733 = 256;

    @ObfuscatedName("client.to")
    public static short field734 = 320;

    @ObfuscatedName("client.te")
    public static short field620 = 1;

    @ObfuscatedName("client.tx")
    public static short field736 = 32767;

    @ObfuscatedName("client.tq")
    public static short field737 = 1;

    @ObfuscatedName("client.tk")
    public static short field738 = 32767;

    @ObfuscatedName("client.ty")
    public static int field739 = 0;

    @ObfuscatedName("client.tm")
    public static int field740 = 0;

    @ObfuscatedName("client.tt")
    public static int field609 = 0;

    @ObfuscatedName("client.tj")
    public static int field731 = 0;

    @ObfuscatedName("client.tc")
    public static int field721 = 0;

    @ObfuscatedName("client.tw")
    public static class279 field712 = new class279();

    @ObfuscatedName("client.th")
    public static int field745 = -1;

    @ObfuscatedName("client.tr")
    public static int field572 = -1;

    @ObfuscatedName("client.tp")
    public static class390 field741 = new class388();

    @ObfuscatedName("client.tg")
    public static class311[] field748 = new class311[8];

    @ObfuscatedName("client.uw")
    public static class60 field728 = new class60();

    @ObfuscatedName("client.ul")
    public static int field560 = -1;

    @ObfuscatedName("client.un")
    public static ArrayList field752 = new ArrayList(10);

    @ObfuscatedName("client.ue")
    public static int field753 = 0;

    @ObfuscatedName("client.uc")
    public static int field754 = 0;

    @ObfuscatedName("client.uu")
    public static final class59 field755 = new class59();

    @ObfuscatedName("client.uq")
    public static int[] field756 = new int[50];

    @ObfuscatedName("client.uh")
    public static int[] field757 = new int[50];

    @ObfuscatedName("hs.es(I)Lov;")
    public static class392 method4388() {
        return Statics.field1262;
    }

    @ObfuscatedName("client.av(B)V")
    public final void method483() {
    }

    public final void init() {
        if (!this.method470()) {
            return;
        }
        for (int var1 = 0; var1 <= 27; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field526 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class92.field1218)) {
                            field601 = true;
                        } else {
                            field601 = false;
                        }
                        break;
                    case 4:
                        if (field475 == -1) {
                            field475 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field470 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field446 = class317.method5273(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class290[] var4 = new class290[] { class290.field3443, class290.field3442, class290.field3440, class290.field3441 };
                        class290[] var5 = var4;
                        int var6 = 0;
                        class290 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class290 var7 = var5[var6];
                            if (var7.field3445 == var3) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field3457 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class92.field1218)) {
                        }
                        break;
                    case 9:
                        Statics.field4 = var2;
                        break;
                    case 10:
                        Statics.field4055 = (class291) class316.method2616(Statics.method4433(), Integer.parseInt(var2));
                        if (Statics.field4055 == class291.field3449) {
                            Statics.field2283 = class400.field4399;
                        } else {
                            Statics.field2283 = class400.field4406;
                        }
                        break;
                    case 11:
                        Statics.field3045 = var2;
                        break;
                    case 12:
                        field469 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field4097 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field476 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2762 = var2;
                        break;
                    case 21:
                        field474 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field527 = Integer.parseInt(var2) != 0;
                }
            }
        }
        class197.field2337 = false;
        field473 = false;
        Statics.field2126 = this.getCodeBase().getHost();
        String var9 = Statics.field3457.field3444;
        byte var10 = 0;
        try {
            Statics.field1623 = 21;
            Statics.field1331 = var10;
            try {
                Statics.field3191 = System.getProperty("os.name");
            } catch (Exception var54) {
                Statics.field3191 = "Unknown";
            }
            Statics.field1685 = Statics.field3191.toLowerCase();
            try {
                Statics.field4452 = System.getProperty("user.home");
                if (Statics.field4452 != null) {
                    Statics.field4452 = Statics.field4452 + "/";
                }
            } catch (Exception var53) {
            }
            try {
                if (Statics.field1685.startsWith("win")) {
                    if (Statics.field4452 == null) {
                        Statics.field4452 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field4452 == null) {
                    Statics.field4452 = System.getenv("HOME");
                }
                if (Statics.field4452 != null) {
                    Statics.field4452 = Statics.field4452 + "/";
                }
            } catch (Exception var52) {
            }
            if (Statics.field4452 == null) {
                Statics.field4452 = "~/";
            }
            Statics.field1332 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field4452, "/tmp/", "" };
            Statics.field4142 = new String[] { ".jagex_cache_" + Statics.field1331, ".file_store_" + Statics.field1331 };
            int var14 = 0;
            label273: while (var14 < 4) {
                String var15 = var14 == 0 ? "" : "" + var14;
                Statics.field3155 = new File(Statics.field4452, "jagex_cl_oldschool_" + var9 + var15 + ".dat");
                String var16 = null;
                String var17 = null;
                boolean var18 = false;
                if (Statics.field3155.exists()) {
                    try {
                        class402 var19 = new class402(Statics.field3155, "rw", 10000L);
                        class419 var20 = new class419((int) var19.method6484());
                        while (var20.field4475 < var20.field4477.length) {
                            int var21 = var19.method6490(var20.field4477, var20.field4475, var20.field4477.length - var20.field4475);
                            if (var21 == -1) {
                                throw new IOException();
                            }
                            var20.field4475 += var21;
                        }
                        var20.field4475 = 0;
                        int var22 = var20.method6781();
                        if (var22 < 1 || var22 > 3) {
                            throw new IOException("" + var22);
                        }
                        int var23 = 0;
                        if (var22 > 1) {
                            var23 = var20.method6781();
                        }
                        if (var22 <= 2) {
                            var16 = var20.method6681();
                            if (var23 == 1) {
                                var17 = var20.method6681();
                            }
                        } else {
                            var16 = var20.method6682();
                            if (var23 == 1) {
                                var17 = var20.method6682();
                            }
                        }
                        var19.method6487();
                    } catch (IOException var56) {
                        var56.printStackTrace();
                    }
                    if (var16 != null) {
                        File var25 = new File(var16);
                        if (!var25.exists()) {
                            var16 = null;
                        }
                    }
                    if (var16 != null) {
                        File var26 = new File(var16, "test.dat");
                        if (!class154.method3996(var26, true)) {
                            var16 = null;
                        }
                    }
                }
                if (var16 == null && var14 == 0) {
                    label248: for (int var27 = 0; var27 < Statics.field4142.length; var27++) {
                        for (int var28 = 0; var28 < Statics.field1332.length; var28++) {
                            File var29 = new File(Statics.field1332[var28] + Statics.field4142[var27] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var29.exists()) {
                                File var30 = new File(var29, "test.dat");
                                boolean var33;
                                try {
                                    RandomAccessFile var31 = new RandomAccessFile(var30, "rw");
                                    int var32 = var31.read();
                                    var31.seek(0L);
                                    var31.write(var32);
                                    var31.seek(0L);
                                    var31.close();
                                    var30.delete();
                                    var33 = true;
                                } catch (Exception var51) {
                                    var33 = false;
                                }
                                if (var33) {
                                    var16 = var29.toString();
                                    var18 = true;
                                    break label248;
                                }
                            }
                        }
                    }
                }
                if (var16 == null) {
                    var16 = Statics.field4452 + File.separatorChar + "jagexcache" + var15 + File.separatorChar + "oldschool" + File.separatorChar + var9 + File.separatorChar;
                    var18 = true;
                }
                if (var17 != null) {
                    File var35 = new File(var17);
                    File var36 = new File(var16);
                    try {
                        File[] var37 = var35.listFiles();
                        File[] var38 = var37;
                        for (int var39 = 0; var39 < var38.length; var39++) {
                            File var40 = var38[var39];
                            File var41 = new File(var36, var40.getName());
                            boolean var42 = var40.renameTo(var41);
                            if (!var42) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var55) {
                        var55.printStackTrace();
                    }
                    var18 = true;
                }
                if (var18) {
                    class154.method4767(new File(var16), (File) null);
                }
                File var44 = new File(var16);
                Statics.field75 = var44;
                if (!Statics.field75.exists()) {
                    Statics.field75.mkdirs();
                }
                File[] var45 = Statics.field75.listFiles();
                if (var45 != null) {
                    File[] var46 = var45;
                    for (int var47 = 0; var47 < var46.length; var47++) {
                        File var48 = var46[var47];
                        if (!class154.method3996(var48, false)) {
                            var14++;
                            continue label273;
                        }
                    }
                }
                break;
            }
            class156.method4571(Statics.field75);
            class154.method6101();
            class154.field1687 = new class403(new class402(class156.method604("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class154.field1688 = new class403(new class402(class156.method604("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1689 = new class403[Statics.field1623];
            for (int var49 = 0; var49 < Statics.field1623; var49++) {
                Statics.field1689[var49] = new class403(new class402(class156.method604("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var57) {
            class443.method6513((String) null, var57);
        }
        Statics.field3795 = this;
        Statics.field4394 = field475;
        if (field500 == -1) {
            field500 = 0;
        }
        Statics.field2773 = System.getenv("JX_ACCESS_TOKEN");
        System.getenv("JX_REFRESH_TOKEN");
        this.method582(765, 503, 202);
    }

    public void setOAuthTokens(String arg0, String arg1) {
        if (arg0 != null && !arg0.trim().isEmpty() && arg1 != null && !arg1.trim().isEmpty()) {
            Statics.field2773 = arg0;
            class69.method4983(10);
        }
    }

    @ObfuscatedName("client.ey(I)Z")
    public boolean method1087() {
        return Statics.field2773 != null && !Statics.field2773.trim().isEmpty();
    }

    @ObfuscatedName("client.eq(Ljava/lang/String;B)V")
    public void method1539(String arg0) throws MalformedURLException, IOException {
        class11 var2 = new class11(new URL(Statics.field3045 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class10.field37);
        var2.method113("Authorization", "Bearer " + arg0);
        this.field614 = this.field511.method205(var2);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method485() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field320 = null;
            Statics.field463 = null;
            Statics.field776 = (byte[][][]) null;
            class336.field4036.clear();
            class336.field4036.add(100);
            class336.field4036.add(5000);
            class336.field4036.add(10000);
            class336.field4036.add(30000);
        } else {
            Statics.field320 = var1;
            Statics.field463 = new int[var1.length];
            Statics.field776 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field320.length; var3++) {
                Statics.field776[var3] = new byte[var2[var3]][];
                class336.field4036.add(var1[var3]);
            }
            Collections.sort(class336.field4036);
        }
        Statics.field2566 = field476 == 0 ? 43594 : field469 + 40000;
        Statics.field1546 = field476 == 0 ? 443 : field469 + 50000;
        Statics.field1519 = Statics.field2566;
        Statics.field3198 = class280.field3210;
        Statics.field1383 = class280.field3209;
        Statics.field1541 = class280.field3212;
        Statics.field3204 = class280.field3211;
        Statics.field2655 = new class100();
        this.method463();
        this.method464();
        Statics.field3383 = this.method585();
        Statics.field1917 = new class360(255, class154.field1687, class154.field1688, 500000);
        class402 var4 = null;
        class89 var5 = new class89();
        try {
            var4 = class154.method4394("", Statics.field4055.field3455, false);
            byte[] var6 = new byte[(int) var4.method6484()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method6490(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class89(new class419(var6));
        } catch (Exception var15) {
        }
        try {
            if (var4 != null) {
                var4.method6487();
            }
        } catch (Exception var14) {
        }
        Statics.field929 = var5;
        this.method462();
        String var13 = Statics.field3883;
        class30.field173 = this;
        if (var13 != null) {
            class30.field178 = var13;
        }
        if (field476 != 0) {
            field488 = true;
        }
        method3829(Statics.field929.field1192);
        Statics.field182 = new class62(Statics.field2283);
        this.field511 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.i(S)V")
    public final void method589() {
        field481++;
        this.method1251();
        while (true) {
            class321 var1 = class299.field3815;
            class298 var2;
            synchronized (class299.field3815) {
                var2 = (class298) class299.field3814.method5299();
            }
            if (var2 == null) {
                class261.method2223();
                method2758();
                class24 var4 = class24.field126;
                synchronized (class24.field126) {
                    class24.field151++;
                    class24.field144 = class24.field146;
                    class24.field141 = 0;
                    class24.field143 = 0;
                    Arrays.fill(class24.field133, false);
                    Arrays.fill(class24.field131, false);
                    if (class24.field121 < 0) {
                        Arrays.fill(class24.field156, false);
                        class24.field121 = class24.field136;
                    } else {
                        while (class24.field136 != class24.field121) {
                            int var5 = class24.field135[class24.field136];
                            class24.field136 = class24.field136 + 1 & 0x7F;
                            if (var5 < 0) {
                                int var6 = ~var5;
                                if (class24.field156[var6]) {
                                    class24.field156[var6] = false;
                                    class24.field131[var6] = true;
                                    class24.field142[class24.field143] = var6;
                                    class24.field143++;
                                }
                            } else {
                                if (!class24.field156[var5] && class24.field141 < class24.field140.length - 1) {
                                    class24.field133[var5] = true;
                                    class24.field140[++class24.field141 - 1] = var5;
                                }
                                class24.field156[var5] = true;
                            }
                        }
                    }
                    if (class24.field141 > 0) {
                        class24.field151 = 0;
                    }
                    class24.field146 = class24.field145;
                }
                class33.method1874();
                if (Statics.field3383 != null) {
                    int var8 = Statics.field3383.method339();
                    field679 = var8;
                }
                if (field478 == 0) {
                    method2419();
                    class32.method284();
                } else if (field478 == 5) {
                    class69.method3631(this, Statics.field1386);
                    method2419();
                    Statics.field1219.method2770();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field191[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field203[var10] = 0L;
                    }
                    Statics.field202 = 0;
                } else if (field478 == 10 || field478 == 11) {
                    class69.method3631(this, Statics.field1386);
                } else if (field478 == 20) {
                    class69.method3631(this, Statics.field1386);
                    this.method1500();
                } else if (field478 == 25) {
                    method4524(false);
                    field530 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field1242.length; var12++) {
                        if (Statics.field963[var12] != -1 && Statics.field1242[var12] == null) {
                            Statics.field1242[var12] = Statics.field1603.method5053(Statics.field963[var12], 0);
                            if (Statics.field1242[var12] == null) {
                                var11 = false;
                                field530++;
                            }
                        }
                        if (Statics.field57[var12] != -1 && Statics.field1748[var12] == null) {
                            Statics.field1748[var12] = Statics.field1603.method5061(Statics.field57[var12], 0, Statics.field2743[var12]);
                            if (Statics.field1748[var12] == null) {
                                var11 = false;
                                field530++;
                            }
                        }
                    }
                    if (var11) {
                        field618 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field1242.length; var14++) {
                            byte[] var15 = Statics.field1748[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field3157[var14] >> 8) * 64 - Statics.field1533;
                                int var17 = (Statics.field3157[var14] & 0xFF) * 64 - Statics.field1240;
                                if (field536) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                boolean var19 = true;
                                class419 var20 = new class419(var15);
                                int var21 = -1;
                                label1207: while (true) {
                                    int var22 = var20.method6686();
                                    if (var22 == 0) {
                                        var13 &= var19;
                                        break;
                                    }
                                    var21 += var22;
                                    int var23 = 0;
                                    boolean var24 = false;
                                    while (true) {
                                        while (!var24) {
                                            int var26 = var20.method6685();
                                            if (var26 == 0) {
                                                continue label1207;
                                            }
                                            var23 += var26 - 1;
                                            int var27 = var23 & 0x3F;
                                            int var28 = var23 >> 6 & 0x3F;
                                            int var29 = var20.method6781() >> 2;
                                            int var30 = var16 + var28;
                                            int var31 = var17 + var27;
                                            if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                                class180 var32 = class180.method2760(var21);
                                                if (var29 != 22 || !field473 || var32.field1956 != 0 || var32.field1973 == 1 || var32.field1990) {
                                                    if (!var32.method3181()) {
                                                        field618++;
                                                        var19 = false;
                                                    }
                                                    var24 = true;
                                                }
                                            }
                                        }
                                        int var25 = var20.method6685();
                                        if (var25 == 0) {
                                            break;
                                        }
                                        var20.method6781();
                                    }
                                }
                            }
                        }
                        if (var13) {
                            if (field603 != 0) {
                                method5000(class295.field3480 + class92.field1222 + class92.field1224 + 100 + "%" + class92.field1220, true);
                            }
                            method2758();
                            Statics.field24.method3635();
                            for (int var34 = 0; var34 < 4; var34++) {
                                field751[var34].method3390();
                            }
                            for (int var35 = 0; var35 < 4; var35++) {
                                for (int var36 = 0; var36 < 104; var36++) {
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        class75.field962[var35][var36][var37] = 0;
                                    }
                                }
                            }
                            method2758();
                            class75.method2548();
                            int var38 = Statics.field1242.length;
                            class63.method5212();
                            method4524(true);
                            if (!field536) {
                                for (int var39 = 0; var39 < var38; var39++) {
                                    int var40 = (Statics.field3157[var39] >> 8) * 64 - Statics.field1533;
                                    int var41 = (Statics.field3157[var39] & 0xFF) * 64 - Statics.field1240;
                                    byte[] var42 = Statics.field1242[var39];
                                    if (var42 != null) {
                                        method2758();
                                        class75.method111(var42, var40, var41, Statics.field1278 * 8 - 48, Statics.field10 * 8 - 48, field751);
                                    }
                                }
                                for (int var43 = 0; var43 < var38; var43++) {
                                    int var44 = (Statics.field3157[var43] >> 8) * 64 - Statics.field1533;
                                    int var45 = (Statics.field3157[var43] & 0xFF) * 64 - Statics.field1240;
                                    byte[] var46 = Statics.field1242[var43];
                                    if (var46 == null && Statics.field10 < 800) {
                                        method2758();
                                        class75.method2449(var44, var45, 64, 64);
                                    }
                                }
                                method4524(true);
                                for (int var47 = 0; var47 < var38; var47++) {
                                    byte[] var48 = Statics.field1748[var47];
                                    if (var48 != null) {
                                        int var49 = (Statics.field3157[var47] >> 8) * 64 - Statics.field1533;
                                        int var50 = (Statics.field3157[var47] & 0xFF) * 64 - Statics.field1240;
                                        method2758();
                                        class197 var51 = Statics.field24;
                                        class184[] var52 = field751;
                                        class419 var53 = new class419(var48);
                                        int var54 = -1;
                                        while (true) {
                                            int var55 = var53.method6686();
                                            if (var55 == 0) {
                                                break;
                                            }
                                            var54 += var55;
                                            int var56 = 0;
                                            while (true) {
                                                int var57 = var53.method6685();
                                                if (var57 == 0) {
                                                    break;
                                                }
                                                var56 += var57 - 1;
                                                int var58 = var56 & 0x3F;
                                                int var59 = var56 >> 6 & 0x3F;
                                                int var60 = var56 >> 12;
                                                int var61 = var53.method6781();
                                                int var62 = var61 >> 2;
                                                int var63 = var61 & 0x3;
                                                int var64 = var49 + var59;
                                                int var65 = var50 + var58;
                                                if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                                    int var66 = var60;
                                                    if ((class75.field962[1][var64][var65] & 0x2) == 2) {
                                                        var66 = var60 - 1;
                                                    }
                                                    class184 var67 = null;
                                                    if (var66 >= 0) {
                                                        var67 = var52[var66];
                                                    }
                                                    class75.method2742(var60, var64, var65, var54, var63, var62, var51, var67);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field536) {
                                int var68 = 0;
                                label1112: while (true) {
                                    if (var68 >= 4) {
                                        for (int var108 = 0; var108 < 13; var108++) {
                                            for (int var109 = 0; var109 < 13; var109++) {
                                                int var110 = field537[0][var108][var109];
                                                if (var110 == -1) {
                                                    class75.method2449(var108 * 8, var109 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method4524(true);
                                        int var111 = 0;
                                        while (true) {
                                            if (var111 >= 4) {
                                                break label1112;
                                            }
                                            method2758();
                                            for (int var112 = 0; var112 < 13; var112++) {
                                                label1035: for (int var113 = 0; var113 < 13; var113++) {
                                                    int var114 = field537[var111][var112][var113];
                                                    if (var114 != -1) {
                                                        int var115 = var114 >> 24 & 0x3;
                                                        int var116 = var114 >> 1 & 0x3;
                                                        int var117 = var114 >> 14 & 0x3FF;
                                                        int var118 = var114 >> 3 & 0x7FF;
                                                        int var119 = (var117 / 8 << 8) + var118 / 8;
                                                        for (int var120 = 0; var120 < Statics.field3157.length; var120++) {
                                                            if (Statics.field3157[var120] == var119 && Statics.field1748[var120] != null) {
                                                                byte[] var121 = Statics.field1748[var120];
                                                                int var122 = var112 * 8;
                                                                int var123 = var113 * 8;
                                                                int var124 = (var117 & 0x7) * 8;
                                                                int var125 = (var118 & 0x7) * 8;
                                                                class197 var126 = Statics.field24;
                                                                class184[] var127 = field751;
                                                                class419 var128 = new class419(var121);
                                                                int var129 = -1;
                                                                while (true) {
                                                                    int var130 = var128.method6686();
                                                                    if (var130 == 0) {
                                                                        continue label1035;
                                                                    }
                                                                    var129 += var130;
                                                                    int var131 = 0;
                                                                    while (true) {
                                                                        int var132 = var128.method6685();
                                                                        if (var132 == 0) {
                                                                            break;
                                                                        }
                                                                        var131 += var132 - 1;
                                                                        int var133 = var131 & 0x3F;
                                                                        int var134 = var131 >> 6 & 0x3F;
                                                                        int var135 = var131 >> 12;
                                                                        int var136 = var128.method6781();
                                                                        int var137 = var136 >> 2;
                                                                        int var138 = var136 & 0x3;
                                                                        if (var115 == var135 && var134 >= var124 && var134 < var124 + 8 && var133 >= var125 && var133 < var125 + 8) {
                                                                            class180 var139 = class180.method2760(var129);
                                                                            int var141 = var134 & 0x7;
                                                                            int var142 = var133 & 0x7;
                                                                            int var144 = var139.field1967;
                                                                            int var145 = var139.field1968;
                                                                            if ((var138 & 0x1) == 1) {
                                                                                int var146 = var144;
                                                                                var144 = var145;
                                                                                var145 = var146;
                                                                            }
                                                                            int var147 = var116 & 0x3;
                                                                            int var148;
                                                                            if (var147 == 0) {
                                                                                var148 = var141;
                                                                            } else if (var147 == 1) {
                                                                                var148 = var142;
                                                                            } else if (var147 == 2) {
                                                                                var148 = 7 - var141 - (var144 - 1);
                                                                            } else {
                                                                                var148 = 7 - var142 - (var145 - 1);
                                                                            }
                                                                            int var149 = var122 + var148;
                                                                            class278 var10001 = (class278) null;
                                                                            int var150 = var123 + class278.method4813(var134 & 0x7, var133 & 0x7, var116, var139.field1967, var139.field1968, var138);
                                                                            if (var149 > 0 && var150 > 0 && var149 < 103 && var150 < 103) {
                                                                                int var151 = var111;
                                                                                if ((class75.field962[1][var149][var150] & 0x2) == 2) {
                                                                                    var151 = var111 - 1;
                                                                                }
                                                                                class184 var152 = null;
                                                                                if (var151 >= 0) {
                                                                                    var152 = var127[var151];
                                                                                }
                                                                                class75.method2742(var111, var149, var150, var129, var116 + var138 & 0x3, var137, var126, var152);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var111++;
                                        }
                                    }
                                    method2758();
                                    for (int var69 = 0; var69 < 13; var69++) {
                                        for (int var70 = 0; var70 < 13; var70++) {
                                            boolean var71 = false;
                                            int var72 = field537[var68][var69][var70];
                                            if (var72 != -1) {
                                                int var73 = var72 >> 24 & 0x3;
                                                int var74 = var72 >> 1 & 0x3;
                                                int var75 = var72 >> 14 & 0x3FF;
                                                int var76 = var72 >> 3 & 0x7FF;
                                                int var77 = (var75 / 8 << 8) + var76 / 8;
                                                for (int var78 = 0; var78 < Statics.field3157.length; var78++) {
                                                    if (Statics.field3157[var78] == var77 && Statics.field1242[var78] != null) {
                                                        byte[] var79 = Statics.field1242[var78];
                                                        int var80 = var69 * 8;
                                                        int var81 = var70 * 8;
                                                        int var82 = (var75 & 0x7) * 8;
                                                        int var83 = (var76 & 0x7) * 8;
                                                        class184[] var84 = field751;
                                                        for (int var85 = 0; var85 < 8; var85++) {
                                                            for (int var86 = 0; var86 < 8; var86++) {
                                                                if (var80 + var85 > 0 && var80 + var85 < 103 && var81 + var86 > 0 && var81 + var86 < 103) {
                                                                    var84[var68].field2107[var80 + var85][var81 + var86] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class419 var87 = new class419(var79);
                                                        for (int var88 = 0; var88 < 4; var88++) {
                                                            for (int var89 = 0; var89 < 64; var89++) {
                                                                for (int var90 = 0; var90 < 64; var90++) {
                                                                    if (var73 == var88 && var89 >= var82 && var89 < var82 + 8 && var90 >= var83 && var90 < var83 + 8) {
                                                                        int var94 = var89 & 0x7;
                                                                        int var95 = var90 & 0x7;
                                                                        int var97 = var74 & 0x3;
                                                                        int var98;
                                                                        if (var97 == 0) {
                                                                            var98 = var94;
                                                                        } else if (var97 == 1) {
                                                                            var98 = var95;
                                                                        } else if (var97 == 2) {
                                                                            var98 = 7 - var94;
                                                                        } else {
                                                                            var98 = 7 - var95;
                                                                        }
                                                                        int var101 = var80 + var98;
                                                                        int var103 = var89 & 0x7;
                                                                        int var104 = var90 & 0x7;
                                                                        int var106 = var74 & 0x3;
                                                                        int var107;
                                                                        if (var106 == 0) {
                                                                            var107 = var104;
                                                                        } else if (var106 == 1) {
                                                                            var107 = 7 - var103;
                                                                        } else if (var106 == 2) {
                                                                            var107 = 7 - var104;
                                                                        } else {
                                                                            var107 = var103;
                                                                        }
                                                                        class75.method1046(var87, var68, var101, var81 + var107, 0, 0, var74);
                                                                    } else {
                                                                        class75.method1046(var87, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var71 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var71) {
                                                class75.method1872(var68, var69 * 8, var70 * 8);
                                            }
                                        }
                                    }
                                    var68++;
                                }
                            }
                            method4524(true);
                            method2758();
                            class197 var153 = Statics.field24;
                            class184[] var154 = field751;
                            for (int var155 = 0; var155 < 4; var155++) {
                                for (int var156 = 0; var156 < 104; var156++) {
                                    for (int var157 = 0; var157 < 104; var157++) {
                                        if ((class75.field962[var155][var156][var157] & 0x1) == 1) {
                                            int var158 = var155;
                                            if ((class75.field962[1][var156][var157] & 0x2) == 2) {
                                                var158 = var155 - 1;
                                            }
                                            if (var158 >= 0) {
                                                var154[var158].method3383(var156, var157);
                                            }
                                        }
                                    }
                                }
                            }
                            class75.field976 += (int) (Math.random() * 5.0D) - 2;
                            if (class75.field976 < -8) {
                                class75.field976 = -8;
                            }
                            if (class75.field976 > 8) {
                                class75.field976 = 8;
                            }
                            class75.field961 += (int) (Math.random() * 5.0D) - 2;
                            if (class75.field961 < -16) {
                                class75.field961 = -16;
                            }
                            if (class75.field961 > 16) {
                                class75.field961 = 16;
                            }
                            for (int var159 = 0; var159 < 4; var159++) {
                                byte[][] var160 = Statics.field322[var159];
                                boolean var161 = true;
                                boolean var162 = true;
                                boolean var163 = true;
                                boolean var164 = true;
                                boolean var165 = true;
                                int var166 = (int) Math.sqrt(5100.0D);
                                int var167 = var166 * 768 >> 8;
                                for (int var168 = 1; var168 < 103; var168++) {
                                    for (int var169 = 1; var169 < 103; var169++) {
                                        int var170 = class75.field972[var159][var169 + 1][var168] - class75.field972[var159][var169 - 1][var168];
                                        int var171 = class75.field972[var159][var169][var168 + 1] - class75.field972[var159][var169][var168 - 1];
                                        int var172 = (int) Math.sqrt((double) (var171 * var171 + var170 * var170 + 65536));
                                        int var173 = (var170 << 8) / var172;
                                        int var174 = 65536 / var172;
                                        int var175 = (var171 << 8) / var172;
                                        int var176 = (var175 * -50 + var173 * -50 + var174 * -10) / var167 + 96;
                                        int var177 = (var160[var169][var168] >> 1) + (var160[var169][var168 + 1] >> 3) + (var160[var169][var168 - 1] >> 2) + (var160[var169 - 1][var168] >> 2) + (var160[var169 + 1][var168] >> 3);
                                        Statics.field2281[var169][var168] = var176 - var177;
                                    }
                                }
                                for (int var178 = 0; var178 < 104; var178++) {
                                    Statics.field966[var178] = 0;
                                    Statics.field4105[var178] = 0;
                                    Statics.field978[var178] = 0;
                                    Statics.field1326[var178] = 0;
                                    Statics.field1875[var178] = 0;
                                }
                                for (int var179 = -5; var179 < 109; var179++) {
                                    for (int var180 = 0; var180 < 104; var180++) {
                                        int var181 = var179 + 5;
                                        int var10002;
                                        if (var181 >= 0 && var181 < 104) {
                                            int var182 = Statics.field964[var159][var181][var180] & 0xFF;
                                            if (var182 > 0) {
                                                class174 var183 = class174.method2047(var182 - 1);
                                                Statics.field966[var180] += var183.field1900;
                                                Statics.field4105[var180] += var183.field1896;
                                                Statics.field978[var180] += var183.field1897;
                                                Statics.field1326[var180] += var183.field1902;
                                                var10002 = Statics.field1875[var180]++;
                                            }
                                        }
                                        int var184 = var179 - 5;
                                        if (var184 >= 0 && var184 < 104) {
                                            int var185 = Statics.field964[var159][var184][var180] & 0xFF;
                                            if (var185 > 0) {
                                                class174 var186 = class174.method2047(var185 - 1);
                                                Statics.field966[var180] -= var186.field1900;
                                                Statics.field4105[var180] -= var186.field1896;
                                                Statics.field978[var180] -= var186.field1897;
                                                Statics.field1326[var180] -= var186.field1902;
                                                var10002 = Statics.field1875[var180]--;
                                            }
                                        }
                                    }
                                    if (var179 >= 1 && var179 < 103) {
                                        int var187 = 0;
                                        int var188 = 0;
                                        int var189 = 0;
                                        int var190 = 0;
                                        int var191 = 0;
                                        for (int var192 = -5; var192 < 109; var192++) {
                                            int var193 = var192 + 5;
                                            if (var193 >= 0 && var193 < 104) {
                                                var187 += Statics.field966[var193];
                                                var188 += Statics.field4105[var193];
                                                var189 += Statics.field978[var193];
                                                var190 += Statics.field1326[var193];
                                                var191 += Statics.field1875[var193];
                                            }
                                            int var194 = var192 - 5;
                                            if (var194 >= 0 && var194 < 104) {
                                                var187 -= Statics.field966[var194];
                                                var188 -= Statics.field4105[var194];
                                                var189 -= Statics.field978[var194];
                                                var190 -= Statics.field1326[var194];
                                                var191 -= Statics.field1875[var194];
                                            }
                                            if (var192 >= 1 && var192 < 103 && (!field473 || (class75.field962[0][var179][var192] & 0x2) != 0 || (class75.field962[var159][var179][var192] & 0x10) == 0)) {
                                                if (var159 < class75.field973) {
                                                    class75.field973 = var159;
                                                }
                                                int var195 = Statics.field964[var159][var179][var192] & 0xFF;
                                                int var196 = Statics.field968[var159][var179][var192] & 0xFF;
                                                if (var195 > 0 || var196 > 0) {
                                                    int var197 = class75.field972[var159][var179][var192];
                                                    int var198 = class75.field972[var159][var179 + 1][var192];
                                                    int var199 = class75.field972[var159][var179 + 1][var192 + 1];
                                                    int var200 = class75.field972[var159][var179][var192 + 1];
                                                    int var201 = Statics.field2281[var179][var192];
                                                    int var202 = Statics.field2281[var179 + 1][var192];
                                                    int var203 = Statics.field2281[var179 + 1][var192 + 1];
                                                    int var204 = Statics.field2281[var179][var192 + 1];
                                                    int var205 = -1;
                                                    int var206 = -1;
                                                    if (var195 > 0) {
                                                        int var207 = var187 * 256 / var190;
                                                        int var208 = var188 / var191;
                                                        int var209 = var189 / var191;
                                                        var205 = class75.method4572(var207, var208, var209);
                                                        int var210 = class75.field976 + var207 & 0xFF;
                                                        int var211 = class75.field961 + var209;
                                                        if (var211 < 0) {
                                                            var211 = 0;
                                                        } else if (var211 > 255) {
                                                            var211 = 255;
                                                        }
                                                        var206 = class75.method4572(var210, var208, var211);
                                                    }
                                                    if (var159 > 0) {
                                                        boolean var212 = true;
                                                        if (var195 == 0 && Statics.field965[var159][var179][var192] != 0) {
                                                            var212 = false;
                                                        }
                                                        if (var196 > 0 && !class182.method294(var196 - 1).field2061) {
                                                            var212 = false;
                                                        }
                                                        if (var212 && var197 == var198 && var197 == var199 && var197 == var200) {
                                                            Statics.field1505[var159][var179][var192] |= 0x924;
                                                        }
                                                    }
                                                    int var213 = 0;
                                                    if (var206 != -1) {
                                                        var213 = class194.field2275[class75.method1908(var206, 96)];
                                                    }
                                                    if (var196 == 0) {
                                                        var153.method3656(var159, var179, var192, 0, 0, -1, var197, var198, var199, var200, class75.method1908(var205, var201), class75.method1908(var205, var202), class75.method1908(var205, var203), class75.method1908(var205, var204), 0, 0, 0, 0, var213, 0);
                                                    } else {
                                                        int var214 = Statics.field965[var159][var179][var192] + 1;
                                                        byte var215 = Statics.field2581[var159][var179][var192];
                                                        class182 var216 = class182.method294(var196 - 1);
                                                        int var217 = var216.field2065;
                                                        int var218;
                                                        int var219;
                                                        if (var217 >= 0) {
                                                            var218 = Statics.field2273.method3834(var217);
                                                            var219 = -1;
                                                        } else if (var216.field2062 == 16711935) {
                                                            var219 = -2;
                                                            var217 = -1;
                                                            var218 = -2;
                                                        } else {
                                                            var219 = class75.method4572(var216.field2063, var216.field2068, var216.field2069);
                                                            int var220 = class75.field976 + var216.field2063 & 0xFF;
                                                            int var221 = class75.field961 + var216.field2069;
                                                            if (var221 < 0) {
                                                                var221 = 0;
                                                            } else if (var221 > 255) {
                                                                var221 = 255;
                                                            }
                                                            var218 = class75.method4572(var220, var216.field2068, var221);
                                                        }
                                                        int var222 = 0;
                                                        if (var218 != -2) {
                                                            var222 = class194.field2275[class75.method2121(var218, 96)];
                                                        }
                                                        if (var216.field2066 != -1) {
                                                            int var223 = class75.field976 + var216.field2070 & 0xFF;
                                                            int var224 = class75.field961 + var216.field2072;
                                                            if (var224 < 0) {
                                                                var224 = 0;
                                                            } else if (var224 > 255) {
                                                                var224 = 255;
                                                            }
                                                            int var225 = class75.method4572(var223, var216.field2071, var224);
                                                            var222 = class194.field2275[class75.method2121(var225, 96)];
                                                        }
                                                        var153.method3656(var159, var179, var192, var214, var215, var217, var197, var198, var199, var200, class75.method1908(var205, var201), class75.method1908(var205, var202), class75.method1908(var205, var203), class75.method1908(var205, var204), class75.method2121(var219, var201), class75.method2121(var219, var202), class75.method2121(var219, var203), class75.method2121(var219, var204), var213, var222);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var226 = 1; var226 < 103; var226++) {
                                    for (int var227 = 1; var227 < 103; var227++) {
                                        var153.method3639(var159, var227, var226, class75.method1906(var159, var227, var226));
                                    }
                                }
                                Statics.field964[var159] = (byte[][]) null;
                                Statics.field968[var159] = (byte[][]) null;
                                Statics.field965[var159] = (byte[][]) null;
                                Statics.field2581[var159] = (byte[][]) null;
                                Statics.field322[var159] = (byte[][]) null;
                            }
                            var153.method3665(-50, -10, -50);
                            for (int var228 = 0; var228 < 104; var228++) {
                                for (int var229 = 0; var229 < 104; var229++) {
                                    if ((class75.field962[1][var228][var229] & 0x2) == 2) {
                                        var153.method3637(var228, var229);
                                    }
                                }
                            }
                            int var230 = 1;
                            int var231 = 2;
                            int var232 = 4;
                            for (int var233 = 0; var233 < 4; var233++) {
                                if (var233 > 0) {
                                    var230 <<= 0x3;
                                    var231 <<= 0x3;
                                    var232 <<= 0x3;
                                }
                                for (int var234 = 0; var234 <= var233; var234++) {
                                    for (int var235 = 0; var235 <= 104; var235++) {
                                        for (int var236 = 0; var236 <= 104; var236++) {
                                            if ((Statics.field1505[var234][var236][var235] & var230) != 0) {
                                                int var237 = var235;
                                                int var238 = var235;
                                                int var239 = var234;
                                                int var240 = var234;
                                                while (var237 > 0 && (Statics.field1505[var234][var236][var237 - 1] & var230) != 0) {
                                                    var237--;
                                                }
                                                while (var238 < 104 && (Statics.field1505[var234][var236][var238 + 1] & var230) != 0) {
                                                    var238++;
                                                }
                                                label761: while (var239 > 0) {
                                                    for (int var241 = var237; var241 <= var238; var241++) {
                                                        if ((Statics.field1505[var239 - 1][var236][var241] & var230) == 0) {
                                                            break label761;
                                                        }
                                                    }
                                                    var239--;
                                                }
                                                label750: while (var240 < var233) {
                                                    for (int var242 = var237; var242 <= var238; var242++) {
                                                        if ((Statics.field1505[var240 + 1][var236][var242] & var230) == 0) {
                                                            break label750;
                                                        }
                                                    }
                                                    var240++;
                                                }
                                                int var243 = (var240 + 1 - var239) * (var238 - var237 + 1);
                                                if (var243 >= 8) {
                                                    short var244 = 240;
                                                    int var245 = class75.field972[var240][var236][var237] - var244;
                                                    int var246 = class75.field972[var239][var236][var237];
                                                    class197.method3698(var233, 1, var236 * 128, var236 * 128, var237 * 128, var238 * 128 + 128, var245, var246);
                                                    for (int var247 = var239; var247 <= var240; var247++) {
                                                        for (int var248 = var237; var248 <= var238; var248++) {
                                                            Statics.field1505[var247][var236][var248] &= ~var230;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1505[var234][var236][var235] & var231) != 0) {
                                                int var249 = var236;
                                                int var250 = var236;
                                                int var251 = var234;
                                                int var252 = var234;
                                                while (var249 > 0 && (Statics.field1505[var234][var249 - 1][var235] & var231) != 0) {
                                                    var249--;
                                                }
                                                while (var250 < 104 && (Statics.field1505[var234][var250 + 1][var235] & var231) != 0) {
                                                    var250++;
                                                }
                                                label814: while (var251 > 0) {
                                                    for (int var253 = var249; var253 <= var250; var253++) {
                                                        if ((Statics.field1505[var251 - 1][var253][var235] & var231) == 0) {
                                                            break label814;
                                                        }
                                                    }
                                                    var251--;
                                                }
                                                label803: while (var252 < var233) {
                                                    for (int var254 = var249; var254 <= var250; var254++) {
                                                        if ((Statics.field1505[var252 + 1][var254][var235] & var231) == 0) {
                                                            break label803;
                                                        }
                                                    }
                                                    var252++;
                                                }
                                                int var255 = (var252 + 1 - var251) * (var250 - var249 + 1);
                                                if (var255 >= 8) {
                                                    short var256 = 240;
                                                    int var257 = class75.field972[var252][var249][var235] - var256;
                                                    int var258 = class75.field972[var251][var249][var235];
                                                    class197.method3698(var233, 2, var249 * 128, var250 * 128 + 128, var235 * 128, var235 * 128, var257, var258);
                                                    for (int var259 = var251; var259 <= var252; var259++) {
                                                        for (int var260 = var249; var260 <= var250; var260++) {
                                                            Statics.field1505[var259][var260][var235] &= ~var231;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1505[var234][var236][var235] & var232) != 0) {
                                                int var261 = var236;
                                                int var262 = var236;
                                                int var263 = var235;
                                                int var264 = var235;
                                                while (var263 > 0 && (Statics.field1505[var234][var236][var263 - 1] & var232) != 0) {
                                                    var263--;
                                                }
                                                while (var264 < 104 && (Statics.field1505[var234][var236][var264 + 1] & var232) != 0) {
                                                    var264++;
                                                }
                                                label867: while (var261 > 0) {
                                                    for (int var265 = var263; var265 <= var264; var265++) {
                                                        if ((Statics.field1505[var234][var261 - 1][var265] & var232) == 0) {
                                                            break label867;
                                                        }
                                                    }
                                                    var261--;
                                                }
                                                label856: while (var262 < 104) {
                                                    for (int var266 = var263; var266 <= var264; var266++) {
                                                        if ((Statics.field1505[var234][var262 + 1][var266] & var232) == 0) {
                                                            break label856;
                                                        }
                                                    }
                                                    var262++;
                                                }
                                                if ((var262 - var261 + 1) * (var264 - var263 + 1) >= 4) {
                                                    int var267 = class75.field972[var234][var261][var263];
                                                    class197.method3698(var233, 4, var261 * 128, var262 * 128 + 128, var263 * 128, var264 * 128 + 128, var267, var267);
                                                    for (int var268 = var261; var268 <= var262; var268++) {
                                                        for (int var269 = var263; var269 <= var264; var269++) {
                                                            Statics.field1505[var234][var268][var269] &= ~var232;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method4524(true);
                            int var270 = class75.field973;
                            if (var270 > Statics.field110) {
                                var270 = Statics.field110;
                            }
                            if (var270 < Statics.field110 - 1) {
                                int var271 = Statics.field110 - 1;
                            }
                            if (field473) {
                                Statics.field24.method3706(class75.field973);
                            } else {
                                Statics.field24.method3706(0);
                            }
                            for (int var272 = 0; var272 < 104; var272++) {
                                for (int var273 = 0; var273 < 104; var273++) {
                                    method607(var272, var273);
                                }
                            }
                            method2758();
                            for (class84 var274 = (class84) field657.method5301(); var274 != null; var274 = (class84) field657.method5303()) {
                                if (var274.field1085 == -1) {
                                    var274.field1086 = 0;
                                    method23(var274);
                                } else {
                                    var274.method6163();
                                }
                            }
                            class180.field1955.method4518();
                            if (Statics.field3795.method512()) {
                                class255 var275 = Statics.method3174(class253.field2880, field690.field1286);
                                var275.field2930.method6656(1057001181);
                                field690.method2328(var275);
                            }
                            if (!field536) {
                                int var276 = (Statics.field1278 - 6) / 8;
                                int var277 = (Statics.field1278 + 6) / 8;
                                int var278 = (Statics.field10 - 6) / 8;
                                int var279 = (Statics.field10 + 6) / 8;
                                for (int var280 = var276 - 1; var280 <= var277 + 1; var280++) {
                                    for (int var281 = var278 - 1; var281 <= var279 + 1; var281++) {
                                        if (var280 < var276 || var280 > var277 || var281 < var278 || var281 > var279) {
                                            Statics.field1603.method5075("m" + var280 + "_" + var281);
                                            Statics.field1603.method5075("l" + var280 + "_" + var281);
                                        }
                                    }
                                }
                            }
                            method3993(30);
                            method2758();
                            class75.method2551();
                            class255 var282 = Statics.method3174(class253.field2849, field690.field1286);
                            field690.method2328(var282);
                            class32.method284();
                        } else {
                            field603 = 2;
                        }
                    } else {
                        field603 = 1;
                    }
                }
                if (field478 == 30) {
                    this.method1233();
                } else if (field478 == 40 || field478 == 45) {
                    this.method1500();
                }
                return;
            }
            var2.field3812.method5007(var2.field3811, (int) var2.field4257, var2.field3810, false);
        }
    }

    @ObfuscatedName("client.y(ZI)V")
    public final void method487(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class261.field3065 == 2) {
                    if (Statics.field114 == null) {
                        Statics.field114 = class266.method4772(Statics.field1487, Statics.field1780, Statics.field3066);
                        if (Statics.field114 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field3047 == null) {
                        Statics.field3047 = new class43(Statics.field3062, Statics.field4010);
                    }
                    if (Statics.field3064.method4597(Statics.field114, Statics.field3063, Statics.field3047, 22050)) {
                        Statics.field3064.method4627();
                        Statics.field3064.method4628(Statics.field959);
                        Statics.field3064.method4600(Statics.field114, Statics.field949);
                        class261.field3065 = 0;
                        Statics.field114 = null;
                        Statics.field3047 = null;
                        Statics.field1487 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field3064.method4693();
                class261.field3065 = 0;
                Statics.field114 = null;
                Statics.field3047 = null;
                Statics.field1487 = null;
            }
            var2 = false;
        }
        if (var2 && field744 && Statics.field1691 != null) {
            Statics.field1691.method737();
        }
        if ((field478 == 10 || field478 == 20 || field478 == 30) && field515 != 0L && class416.method5860() > field515) {
            method3829(Statics.method2724());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field505[var5] = true;
            }
        }
        if (field478 == 0) {
            this.method489(class69.field868, class69.field871, arg0);
        } else if (field478 == 5) {
            class69.method4530(Statics.field1559, Statics.field3887, Statics.field1386);
        } else if (field478 == 10 || field478 == 11) {
            class69.method4530(Statics.field1559, Statics.field3887, Statics.field1386);
        } else if (field478 == 20) {
            class69.method4530(Statics.field1559, Statics.field3887, Statics.field1386);
        } else if (field478 == 25) {
            if (field603 == 1) {
                if (field530 > field531) {
                    field531 = field530;
                }
                int var6 = (field531 * 50 - field530 * 50) / field531;
                method5000(class295.field3480 + class92.field1222 + class92.field1224 + var6 + "%" + class92.field1220, false);
            } else if (field603 == 2) {
                if (field618 > field533) {
                    field533 = field618;
                }
                int var7 = (field533 * 50 - field618 * 50) / field533 + 50;
                method5000(class295.field3480 + class92.field1222 + class92.field1224 + var7 + "%" + class92.field1220, false);
            } else {
                method5000(class295.field3480, false);
            }
        } else if (field478 == 30) {
            this.method1096();
        } else if (field478 == 40) {
            method5000(class295.field3644 + class92.field1222 + class295.field3694, false);
        } else if (field478 == 45) {
            method5000(class295.field3640, false);
        }
        if (field478 == 30 && field693 == 0 && !arg0 && !field695) {
            for (int var8 = 0; var8 < field684; var8++) {
                if (field687[var8]) {
                    Statics.field107.method444(field625[var8], field471[var8], field592[var8], field692[var8]);
                    field687[var8] = false;
                }
            }
        } else if (field478 > 0) {
            Statics.field107.method452(0, 0);
            for (int var9 = 0; var9 < field684; var9++) {
                field687[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method488() {
        if (Statics.field4057.method2273()) {
            Statics.field4057.method2270();
        }
        if (Statics.field483 != null) {
            Statics.field483.field1038 = false;
        }
        Statics.field483 = null;
        field690.method2332();
        class24.method5168();
        class33.method5713();
        Statics.field3383 = null;
        if (Statics.field1691 != null) {
            Statics.field1691.method739();
        }
        if (Statics.field1281 != null) {
            Statics.field1281.method739();
        }
        class303.method1869();
        class299.method4014();
        if (Statics.field2655 != null) {
            Statics.field2655.method2353();
            Statics.field2655 = null;
        }
        try {
            class154.field1687.method6515();
            for (int var1 = 0; var1 < Statics.field1623; var1++) {
                Statics.field1689[var1].method6515();
            }
            class154.field1688.method6515();
            class154.field1693.method6515();
        } catch (Exception var3) {
        }
        this.field511.method198();
    }

    @ObfuscatedName("ga.ew(II)V")
    public static void method3993(int arg0) {
        if (field478 == arg0) {
            return;
        }
        if (field478 == 0) {
            Statics.field3795.method490();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            method4539(0);
            field546 = 0;
            field542 = 0;
            field528.method5662(arg0);
            if (arg0 != 20) {
                method1704(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3187 != null) {
            Statics.field3187.method2817();
            Statics.field3187 = null;
        }
        if (field478 == 25) {
            field603 = 0;
            field530 = 0;
            field531 = 1;
            field618 = 0;
            field533 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method2242() ? 0 : 12;
            class69.method5925(Statics.field3044, Statics.field1348, true, var2);
        } else if (arg0 == 20) {
            int var1 = field478 == 11 ? 4 : 0;
            class69.method5925(Statics.field3044, Statics.field1348, true, var1);
        } else if (arg0 == 11) {
            class69.method5925(Statics.field3044, Statics.field1348, false, 4);
        } else {
            class69.method793();
        }
        field478 = arg0;
    }

    @ObfuscatedName("client.ff(I)V")
    public void method1251() {
        if (field478 != 1000) {
            boolean var1 = class303.method4982();
            if (!var1) {
                this.method1091();
            }
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public void method1091() {
        if (class303.field3852 >= 4) {
            this.method577("js5crc");
            method3993(1000);
            return;
        }
        if (class303.field3869 >= 4) {
            if (field478 <= 5) {
                this.method577("js5io");
                method3993(1000);
                return;
            }
            field518 = 3000;
            class303.field3869 = 3;
        }
        if (--field518 + 1 > 0) {
            return;
        }
        try {
            if (field501 == 0) {
                Statics.field1034 = Statics.field190.method2775(Statics.field2126, Statics.field1519);
                field501++;
            }
            if (field501 == 1) {
                if (Statics.field1034.field1726 == 2) {
                    this.method1544(-1);
                    return;
                }
                if (Statics.field1034.field1726 == 1) {
                    field501++;
                }
            }
            if (field501 == 2) {
                if (field526) {
                    Statics.field4378 = Statics.method1878((Socket) Statics.field1034.field1730, 40000, 5000);
                } else {
                    Statics.field4378 = new class157((Socket) Statics.field1034.field1730, Statics.field190, 5000);
                }
                class419 var1 = new class419(5);
                var1.method6841(15);
                var1.method6656(202);
                Statics.field4378.method2834(var1.field4477, 0, 5);
                field501++;
                Statics.field1451 = class416.method5860();
            }
            if (field501 == 3) {
                if (Statics.field4378.method2815() > 0 || !field526 && field478 <= 5) {
                    int var2 = Statics.field4378.method2814();
                    if (var2 != 0) {
                        this.method1544(var2);
                        return;
                    }
                    field501++;
                } else if (class416.method5860() - Statics.field1451 > 30000L) {
                    this.method1544(-2);
                    return;
                }
            }
            if (field501 == 4) {
                class356 var3 = Statics.field4378;
                boolean var4 = field478 > 20;
                if (Statics.field3868 != null) {
                    try {
                        Statics.field3868.method2817();
                    } catch (Exception var14) {
                    }
                    Statics.field3868 = null;
                }
                Statics.field3868 = var3;
                class303.method2192(var4);
                class303.field3863.field4475 = 0;
                Statics.field3208 = null;
                Statics.field1665 = null;
                class303.field3864 = 0;
                while (true) {
                    class301 var6 = (class301) class303.field3854.method6448();
                    if (var6 == null) {
                        while (true) {
                            class301 var7 = (class301) class303.field3855.method6448();
                            if (var7 == null) {
                                if (class303.field3867 != 0) {
                                    try {
                                        class419 var8 = new class419(4);
                                        var8.method6841(4);
                                        var8.method6841(class303.field3867);
                                        var8.method6654(0);
                                        Statics.field3868.method2834(var8.field4477, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3868.method2817();
                                        } catch (Exception var12) {
                                        }
                                        class303.field3869++;
                                        Statics.field3868 = null;
                                    }
                                }
                                class303.field3853 = 0;
                                Statics.field1320 = class416.method5860();
                                Statics.field1034 = null;
                                Statics.field4378 = null;
                                field501 = 0;
                                field525 = 0;
                                return;
                            }
                            class303.field3858.method5290(var7);
                            class303.field3859.method6447(var7, var7.field4257);
                            class303.field3860++;
                            class303.field3866--;
                        }
                    }
                    class303.field3856.method6447(var6, var6.field4257);
                    class303.field3861++;
                    class303.field3857--;
                }
            }
        } catch (IOException var15) {
            this.method1544(-3);
        }
    }

    @ObfuscatedName("client.fk(IB)V")
    public void method1544(int arg0) {
        Statics.field1034 = null;
        Statics.field4378 = null;
        field501 = 0;
        if (Statics.field2566 == Statics.field1519) {
            Statics.field1519 = Statics.field1546;
        } else {
            Statics.field1519 = Statics.field2566;
        }
        field525++;
        if (field525 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field478 <= 5) {
                this.method577("js5connect_full");
                method3993(1000);
            } else {
                field518 = 3000;
            }
        } else if (field525 >= 2 && arg0 == 6) {
            this.method577("js5connect_outofdate");
            method3993(1000);
        } else if (field525 >= 4) {
            if (field478 <= 5) {
                this.method577("js5connect");
                method3993(1000);
            } else {
                field518 = 3000;
            }
        }
    }

    @ObfuscatedName("kx.fv(Lkz;Ljava/lang/String;I)V")
    public static void method5048(class300 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field752.add(var2);
        field754 += var2.field987;
    }

    @ObfuscatedName("pn.fe(I)I")
    public static int method7011() {
        if (field752 == null || field753 >= field752.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field753; var1++) {
            var0 += ((class77) field752.get(var1)).field988;
        }
        return var0 * 10000 / field754;
    }

    @ObfuscatedName("ee.fu(II)I")
    public static int method2716(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("dv.fb(I)V")
    public static void method2419() {
        if (field732 == 0) {
            Statics.field24 = new class197(4, 104, 104, class75.field972);
            for (int var0 = 0; var0 < 4; var0++) {
                field751[var0] = new class184(104, 104);
            }
            Statics.field176 = new class432(512, 512);
            class69.field871 = class295.field3483;
            class69.field868 = 5;
            field732 = 20;
        } else if (field732 == 20) {
            class69.field871 = class295.field3484;
            class69.field868 = 10;
            field732 = 30;
        } else if (field732 == 30) {
            Statics.field1412 = method2908(0, false, true, true);
            Statics.field41 = method2908(1, false, true, true);
            Statics.field1531 = method2908(2, true, false, true);
            Statics.field104 = method2908(3, false, true, true);
            Statics.field152 = method2908(4, false, true, true);
            Statics.field1603 = method2908(5, true, true, true);
            Statics.field2775 = method2908(6, true, true, true);
            Statics.field1413 = method2908(7, false, true, true);
            Statics.field1348 = method2908(8, false, true, true);
            Statics.field1712 = method2908(9, false, true, true);
            Statics.field3044 = method2908(10, false, true, true);
            Statics.field1260 = method2908(11, false, true, true);
            Statics.field1680 = method2908(12, false, true, true);
            Statics.field5 = method2908(13, true, false, true);
            Statics.field956 = method2908(14, false, true, true);
            Statics.field1549 = method2908(15, false, true, true);
            Statics.field1497 = method2908(17, true, true, true);
            Statics.field2510 = method2908(18, false, true, true);
            Statics.field1655 = method2908(19, false, true, true);
            Statics.field1164 = method2908(20, false, true, true);
            class69.field871 = class295.field3485;
            class69.field868 = 20;
            field732 = 40;
        } else if (field732 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1412.method5017() * 4 / 100;
            int var3 = var2 + Statics.field41.method5017() * 4 / 100;
            int var4 = var3 + Statics.field1531.method5017() * 2 / 100;
            int var5 = var4 + Statics.field104.method5017() * 2 / 100;
            int var6 = var5 + Statics.field152.method5017() * 6 / 100;
            int var7 = var6 + Statics.field1603.method5017() * 4 / 100;
            int var8 = var7 + Statics.field2775.method5017() * 2 / 100;
            int var9 = var8 + Statics.field1413.method5017() * 56 / 100;
            int var10 = var9 + Statics.field1348.method5017() * 2 / 100;
            int var11 = var10 + Statics.field1712.method5017() * 2 / 100;
            int var12 = var11 + Statics.field3044.method5017() * 2 / 100;
            int var13 = var12 + Statics.field1260.method5017() * 2 / 100;
            int var14 = var13 + Statics.field1680.method5017() * 2 / 100;
            int var15 = var14 + Statics.field5.method5017() * 2 / 100;
            int var16 = var15 + Statics.field956.method5017() * 2 / 100;
            int var17 = var16 + Statics.field1549.method5017() * 2 / 100;
            int var18 = var17 + Statics.field1655.method5017() / 100;
            int var19 = var18 + Statics.field2510.method5017() / 100;
            int var20 = var19 + Statics.field1164.method5017() / 100;
            int var21 = var20 + (Statics.field1497.method5001() && Statics.field1497.method5054() ? 1 : 0);
            if (var21 == 100) {
                method5048(Statics.field1412, "Animations");
                method5048(Statics.field41, "Skeletons");
                method5048(Statics.field152, "Sound FX");
                method5048(Statics.field1603, "Maps");
                method5048(Statics.field2775, "Music Tracks");
                method5048(Statics.field1413, "Models");
                method5048(Statics.field1348, "Sprites");
                method5048(Statics.field1260, "Music Jingles");
                method5048(Statics.field956, "Music Samples");
                method5048(Statics.field1549, "Music Patches");
                method5048(Statics.field1655, "World Map");
                method5048(Statics.field2510, "World Map Geography");
                method5048(Statics.field1164, "World Map Ground");
                Statics.field20 = new class362();
                Statics.field20.method5926(Statics.field1497);
                class69.field871 = class295.field3764;
                class69.field868 = 30;
                field732 = 45;
            } else {
                if (var21 != 0) {
                    class69.field871 = class295.field3486 + var21 + "%";
                }
                class69.field868 = 30;
            }
        } else if (field732 == 45) {
            boolean var22 = !field473;
            Statics.field4059 = 22050;
            Statics.field3178 = var22;
            Statics.field1340 = 2;
            class262 var23 = new class262();
            var23.method4602(9, 128);
            Statics.field1691 = class40.method26(Statics.field190, 0, 22050);
            Statics.field1691.method735(var23);
            class300 var24 = Statics.field1549;
            class300 var25 = Statics.field956;
            class300 var26 = Statics.field152;
            Statics.field3063 = var24;
            Statics.field4010 = var25;
            Statics.field3062 = var26;
            Statics.field3064 = var23;
            Statics.field1281 = class40.method26(Statics.field190, 1, 2048);
            Statics.field3373 = new class36();
            Statics.field1281.method735(Statics.field3373);
            Statics.field2524 = new class53(22050, Statics.field4059);
            class69.field871 = class295.field3488;
            class69.field868 = 35;
            field732 = 50;
            Statics.field1496 = new class393(Statics.field1348, Statics.field5);
        } else if (field732 == 50) {
            class394[] var27 = new class394[] { class394.field4370, class394.field4371, class394.field4373, class394.field4375, class394.field4374, class394.field4379 };
            int var28 = var27.length;
            class393 var29 = Statics.field1496;
            class394[] var30 = new class394[] { class394.field4370, class394.field4371, class394.field4373, class394.field4375, class394.field4374, class394.field4379 };
            field529 = var29.method6415(var30);
            if (field529.size() < var28) {
                class69.field871 = class295.field3489 + field529.size() * 100 / var28 + "%";
                class69.field868 = 40;
            } else {
                Statics.field3887 = (class327) field529.get(class394.field4371);
                Statics.field1386 = (class327) field529.get(class394.field4375);
                Statics.field1559 = (class327) field529.get(class394.field4379);
                Statics.field823 = field741.method6169();
                class69.field871 = class295.field3624;
                class69.field868 = 40;
                field732 = 60;
            }
        } else if (field732 == 60) {
            int var31 = class69.method4148(Statics.field3044, Statics.field1348);
            int var32 = class69.field894.length + class69.field893.length;
            if (var31 < var32) {
                class69.field871 = class295.field3491 + var31 * 100 / var32 + "%";
                class69.field868 = 50;
            } else {
                class69.field871 = class295.field3492;
                class69.field868 = 50;
                method3993(5);
                field732 = 70;
            }
        } else if (field732 == 70) {
            if (Statics.field1531.method5054()) {
                class300 var34 = Statics.field1531;
                Statics.field2064 = var34;
                class174.method322(Statics.field1531);
                Statics.method5177(Statics.field1531, Statics.field1413);
                class180.method3424(Statics.field1531, Statics.field1413, field473);
                class171.method4570(Statics.field1531, Statics.field1413);
                class178.method4337(Statics.field1531);
                class300 var35 = Statics.field1531;
                class300 var36 = Statics.field1413;
                boolean var37 = field601;
                class327 var38 = Statics.field3887;
                Statics.field2043 = var35;
                Statics.field2006 = var36;
                Statics.field2007 = var37;
                Statics.field2583 = Statics.field2043.method5144(10);
                Statics.field2011 = var38;
                class300 var39 = Statics.field1531;
                class300 var40 = Statics.field1412;
                class300 var41 = Statics.field41;
                Statics.field163 = var39;
                Statics.field2077 = var40;
                Statics.field1447 = var41;
                class173.method2245(Statics.field1531, Statics.field1413);
                class300 var42 = Statics.field1531;
                Statics.field1911 = var42;
                class300 var43 = Statics.field1531;
                Statics.field1747 = var43;
                Statics.field4583 = Statics.field1747.method5144(16);
                class281.method3621(Statics.field104, Statics.field1413, Statics.field1348, Statics.field5);
                class300 var44 = Statics.field1531;
                Statics.field1742 = var44;
                class300 var45 = Statics.field1531;
                Statics.field1822 = var45;
                class300 var46 = Statics.field1531;
                Statics.field1775 = var46;
                class300 var47 = Statics.field1531;
                class177.method2048(Statics.field1531);
                Statics.field4130 = new class405(Statics.field4055, 54, Statics.field446, Statics.field1531);
                Statics.field4117 = new class405(Statics.field4055, 47, Statics.field446, Statics.field1531);
                Statics.field4057 = new class97();
                class179.method5604(Statics.field1531, Statics.field1348, Statics.field5);
                class167.method1716(Statics.field1531, Statics.field1348);
                class300 var48 = Statics.field1531;
                class300 var49 = Statics.field1348;
                Statics.field1766 = var49;
                if (var48.method5054()) {
                    Statics.field4441 = var48.method5144(35);
                    Statics.field1751 = new class164[Statics.field4441];
                    for (int var50 = 0; var50 < Statics.field4441; var50++) {
                        byte[] var51 = var48.method5053(35, var50);
                        Statics.field1751[var50] = new class164(var50);
                        if (var51 != null) {
                            Statics.field1751[var50].method2872(new class419(var51));
                            Statics.field1751[var50].method2874();
                        }
                    }
                }
                class69.field871 = class295.field3494;
                class69.field868 = 60;
                field732 = 80;
            } else {
                class69.field871 = class295.field3493 + Statics.field1531.method5011() + "%";
                class69.field868 = 60;
            }
        } else if (field732 == 80) {
            int var52 = 0;
            if (Statics.field1181 == null) {
                Statics.field1181 = class433.method55(Statics.field1348, Statics.field20.field4166, 0);
            } else {
                var52++;
            }
            if (Statics.field300 == null) {
                Statics.field300 = class433.method55(Statics.field1348, Statics.field20.field4164, 0);
            } else {
                var52++;
            }
            if (Statics.field2699 == null) {
                class300 var53 = Statics.field1348;
                int var54 = Statics.field20.field4163;
                class431[] var55;
                if (Statics.method2755(var53, var54, 0)) {
                    class431[] var56 = new class431[Statics.field4614];
                    for (int var57 = 0; var57 < Statics.field4614; var57++) {
                        class431 var58 = var56[var57] = new class431();
                        var58.field4563 = Statics.field4581;
                        var58.field4564 = Statics.field4578;
                        var58.field4558 = Statics.field1607[var57];
                        var58.field4562 = Statics.field2119[var57];
                        var58.field4559 = Statics.field4579[var57];
                        var58.field4560 = Statics.field4008[var57];
                        var58.field4561 = Statics.field4580;
                        var58.field4557 = Statics.field4218[var57];
                    }
                    class433.method2406();
                    var55 = var56;
                } else {
                    var55 = null;
                }
                Statics.field2699 = var55;
            } else {
                var52++;
            }
            if (Statics.field3430 == null) {
                class300 var60 = Statics.field1348;
                int var61 = Statics.field20.field4168;
                class432[] var62;
                if (Statics.method2755(var60, var61, 0)) {
                    class432[] var63 = new class432[Statics.field4614];
                    int var64 = 0;
                    while (true) {
                        if (var64 >= Statics.field4614) {
                            class433.method2406();
                            var62 = var63;
                            break;
                        }
                        class432 var65 = var63[var64] = new class432();
                        var65.field4570 = Statics.field4581;
                        var65.field4573 = Statics.field4578;
                        var65.field4572 = Statics.field1607[var64];
                        var65.field4569 = Statics.field2119[var64];
                        var65.field4566 = Statics.field4579[var64];
                        var65.field4567 = Statics.field4008[var64];
                        int var66 = var65.field4567 * var65.field4566;
                        byte[] var67 = Statics.field4218[var64];
                        var65.field4571 = new int[var66];
                        for (int var68 = 0; var68 < var66; var68++) {
                            var65.field4571[var68] = Statics.field4580[var67[var68] & 0xFF];
                        }
                        var64++;
                    }
                } else {
                    var62 = null;
                }
                Statics.field3430 = var62;
            } else {
                var52++;
            }
            if (Statics.field3205 == null) {
                class300 var70 = Statics.field1348;
                int var71 = Statics.field20.field4167;
                class432[] var72;
                if (Statics.method2755(var70, var71, 0)) {
                    class432[] var73 = new class432[Statics.field4614];
                    int var74 = 0;
                    while (true) {
                        if (var74 >= Statics.field4614) {
                            class433.method2406();
                            var72 = var73;
                            break;
                        }
                        class432 var75 = var73[var74] = new class432();
                        var75.field4570 = Statics.field4581;
                        var75.field4573 = Statics.field4578;
                        var75.field4572 = Statics.field1607[var74];
                        var75.field4569 = Statics.field2119[var74];
                        var75.field4566 = Statics.field4579[var74];
                        var75.field4567 = Statics.field4008[var74];
                        int var76 = var75.field4567 * var75.field4566;
                        byte[] var77 = Statics.field4218[var74];
                        var75.field4571 = new int[var76];
                        for (int var78 = 0; var78 < var76; var78++) {
                            var75.field4571[var78] = Statics.field4580[var77[var78] & 0xFF];
                        }
                        var74++;
                    }
                } else {
                    var72 = null;
                }
                Statics.field3205 = var72;
            } else {
                var52++;
            }
            if (Statics.field3068 == null) {
                class300 var80 = Statics.field1348;
                int var81 = Statics.field20.field4174;
                class432[] var82;
                if (Statics.method2755(var80, var81, 0)) {
                    class432[] var83 = new class432[Statics.field4614];
                    int var84 = 0;
                    while (true) {
                        if (var84 >= Statics.field4614) {
                            class433.method2406();
                            var82 = var83;
                            break;
                        }
                        class432 var85 = var83[var84] = new class432();
                        var85.field4570 = Statics.field4581;
                        var85.field4573 = Statics.field4578;
                        var85.field4572 = Statics.field1607[var84];
                        var85.field4569 = Statics.field2119[var84];
                        var85.field4566 = Statics.field4579[var84];
                        var85.field4567 = Statics.field4008[var84];
                        int var86 = var85.field4567 * var85.field4566;
                        byte[] var87 = Statics.field4218[var84];
                        var85.field4571 = new int[var86];
                        for (int var88 = 0; var88 < var86; var88++) {
                            var85.field4571[var88] = Statics.field4580[var87[var88] & 0xFF];
                        }
                        var84++;
                    }
                } else {
                    var82 = null;
                }
                Statics.field3068 = var82;
            } else {
                var52++;
            }
            if (Statics.field1322 == null) {
                class300 var90 = Statics.field1348;
                int var91 = Statics.field20.field4170;
                class432[] var92;
                if (Statics.method2755(var90, var91, 0)) {
                    class432[] var93 = new class432[Statics.field4614];
                    int var94 = 0;
                    while (true) {
                        if (var94 >= Statics.field4614) {
                            class433.method2406();
                            var92 = var93;
                            break;
                        }
                        class432 var95 = var93[var94] = new class432();
                        var95.field4570 = Statics.field4581;
                        var95.field4573 = Statics.field4578;
                        var95.field4572 = Statics.field1607[var94];
                        var95.field4569 = Statics.field2119[var94];
                        var95.field4566 = Statics.field4579[var94];
                        var95.field4567 = Statics.field4008[var94];
                        int var96 = var95.field4567 * var95.field4566;
                        byte[] var97 = Statics.field4218[var94];
                        var95.field4571 = new int[var96];
                        for (int var98 = 0; var98 < var96; var98++) {
                            var95.field4571[var98] = Statics.field4580[var97[var98] & 0xFF];
                        }
                        var94++;
                    }
                } else {
                    var92 = null;
                }
                Statics.field1322 = var92;
            } else {
                var52++;
            }
            if (Statics.field1325 == null) {
                class300 var100 = Statics.field1348;
                int var101 = Statics.field20.field4169;
                class432[] var102;
                if (Statics.method2755(var100, var101, 0)) {
                    class432[] var103 = new class432[Statics.field4614];
                    int var104 = 0;
                    while (true) {
                        if (var104 >= Statics.field4614) {
                            class433.method2406();
                            var102 = var103;
                            break;
                        }
                        class432 var105 = var103[var104] = new class432();
                        var105.field4570 = Statics.field4581;
                        var105.field4573 = Statics.field4578;
                        var105.field4572 = Statics.field1607[var104];
                        var105.field4569 = Statics.field2119[var104];
                        var105.field4566 = Statics.field4579[var104];
                        var105.field4567 = Statics.field4008[var104];
                        int var106 = var105.field4567 * var105.field4566;
                        byte[] var107 = Statics.field4218[var104];
                        var105.field4571 = new int[var106];
                        for (int var108 = 0; var108 < var106; var108++) {
                            var105.field4571[var108] = Statics.field4580[var107[var108] & 0xFF];
                        }
                        var104++;
                    }
                } else {
                    var102 = null;
                }
                Statics.field1325 = var102;
            } else {
                var52++;
            }
            if (Statics.field1359 == null) {
                class300 var110 = Statics.field1348;
                int var111 = Statics.field20.field4171;
                class432[] var112;
                if (Statics.method2755(var110, var111, 0)) {
                    class432[] var113 = new class432[Statics.field4614];
                    int var114 = 0;
                    while (true) {
                        if (var114 >= Statics.field4614) {
                            class433.method2406();
                            var112 = var113;
                            break;
                        }
                        class432 var115 = var113[var114] = new class432();
                        var115.field4570 = Statics.field4581;
                        var115.field4573 = Statics.field4578;
                        var115.field4572 = Statics.field1607[var114];
                        var115.field4569 = Statics.field2119[var114];
                        var115.field4566 = Statics.field4579[var114];
                        var115.field4567 = Statics.field4008[var114];
                        int var116 = var115.field4567 * var115.field4566;
                        byte[] var117 = Statics.field4218[var114];
                        var115.field4571 = new int[var116];
                        for (int var118 = 0; var118 < var116; var118++) {
                            var115.field4571[var118] = Statics.field4580[var117[var118] & 0xFF];
                        }
                        var114++;
                    }
                } else {
                    var112 = null;
                }
                Statics.field1359 = var112;
            } else {
                var52++;
            }
            if (Statics.field2713 == null) {
                class300 var120 = Statics.field1348;
                int var121 = Statics.field20.field4172;
                class431[] var122;
                if (Statics.method2755(var120, var121, 0)) {
                    class431[] var123 = new class431[Statics.field4614];
                    for (int var124 = 0; var124 < Statics.field4614; var124++) {
                        class431 var125 = var123[var124] = new class431();
                        var125.field4563 = Statics.field4581;
                        var125.field4564 = Statics.field4578;
                        var125.field4558 = Statics.field1607[var124];
                        var125.field4562 = Statics.field2119[var124];
                        var125.field4559 = Statics.field4579[var124];
                        var125.field4560 = Statics.field4008[var124];
                        var125.field4561 = Statics.field4580;
                        var125.field4557 = Statics.field4218[var124];
                    }
                    class433.method2406();
                    var122 = var123;
                } else {
                    var122 = null;
                }
                Statics.field2713 = var122;
            } else {
                var52++;
            }
            if (Statics.field768 == null) {
                class300 var127 = Statics.field1348;
                int var128 = Statics.field20.field4173;
                class431[] var129;
                if (Statics.method2755(var127, var128, 0)) {
                    class431[] var130 = new class431[Statics.field4614];
                    for (int var131 = 0; var131 < Statics.field4614; var131++) {
                        class431 var132 = var130[var131] = new class431();
                        var132.field4563 = Statics.field4581;
                        var132.field4564 = Statics.field4578;
                        var132.field4558 = Statics.field1607[var131];
                        var132.field4562 = Statics.field2119[var131];
                        var132.field4559 = Statics.field4579[var131];
                        var132.field4560 = Statics.field4008[var131];
                        var132.field4561 = Statics.field4580;
                        var132.field4557 = Statics.field4218[var131];
                    }
                    class433.method2406();
                    var129 = var130;
                } else {
                    var129 = null;
                }
                Statics.field768 = var129;
            } else {
                var52++;
            }
            if (var52 < 11) {
                class69.field871 = class295.field3495 + var52 * 100 / 12 + "%";
                class69.field868 = 70;
            } else {
                Statics.field3985 = Statics.field768;
                Statics.field300.method7041();
                int var134 = (int) (Math.random() * 21.0D) - 10;
                int var135 = (int) (Math.random() * 21.0D) - 10;
                int var136 = (int) (Math.random() * 21.0D) - 10;
                int var137 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2699[0].method7017(var134 + var137, var135 + var137, var136 + var137);
                class69.field871 = class295.field3496;
                class69.field868 = 70;
                field732 = 90;
            }
        } else if (field732 == 90) {
            if (Statics.field1712.method5054()) {
                Statics.field991 = new class202(Statics.field1712, Statics.field1348, 20, Statics.field929.field1199, field473 ? 64 : 128);
                class194.method3570(Statics.field991);
                class194.method3534(Statics.field929.field1199);
                field732 = 100;
            } else {
                class69.field871 = class295.field3773 + "0%";
                class69.field868 = 90;
            }
        } else if (field732 == 100) {
            int var138 = Statics.field991.method3831();
            if (var138 < 100) {
                class69.field871 = class295.field3773 + var138 + "%";
                class69.field868 = 90;
            } else {
                class69.field871 = class295.field3498;
                class69.field868 = 90;
                field732 = 110;
            }
        } else if (field732 == 110) {
            Statics.field483 = new class82();
            Statics.field190.method2776(Statics.field483, 10);
            class69.field871 = class295.field3499;
            class69.field868 = 92;
            field732 = 120;
        } else if (field732 == 120) {
            if (Statics.field3044.method5092("huffman", "")) {
                class269 var139 = new class269(Statics.field3044.method5069("huffman", ""));
                Statics.field4456 = var139;
                class69.field871 = class295.field3501;
                class69.field868 = 94;
                field732 = 130;
            } else {
                class69.field871 = class295.field3500 + "%";
                class69.field868 = 94;
            }
        } else if (field732 == 130) {
            if (!Statics.field104.method5054()) {
                class69.field871 = class295.field3502 + Statics.field104.method5011() * 4 / 5 + "%";
                class69.field868 = 96;
            } else if (!Statics.field1680.method5054()) {
                class69.field871 = class295.field3502 + (80 + Statics.field1680.method5011() / 6) + "%";
                class69.field868 = 96;
            } else if (Statics.field5.method5054()) {
                class69.field871 = class295.field3503;
                class69.field868 = 98;
                field732 = 140;
            } else {
                class69.field871 = class295.field3502 + (96 + Statics.field5.method5011() / 50) + "%";
                class69.field868 = 96;
            }
        } else if (field732 == 140) {
            class69.field868 = 100;
            if (Statics.field1655.method5086(class237.field2769.field2770)) {
                if (Statics.field1262 == null) {
                    Statics.field1262 = new class392();
                    Statics.field1262.method6261(Statics.field1655, Statics.field2510, Statics.field1164, Statics.field1559, field529, Statics.field2699);
                }
                class69.field871 = class295.field3776;
                field732 = 150;
            } else {
                class69.field871 = class295.field3504 + Statics.field1655.method5104(class237.field2769.field2770) / 10 + "%";
            }
        } else if (field732 == 150) {
            method3993(10);
        }
    }

    @ObfuscatedName("fg.fj(IZZZI)Lkz;")
    public static class300 method2908(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class360 var4 = null;
        if (class154.field1687 != null) {
            var4 = new class360(arg0, class154.field1687, Statics.field1689[arg0], 1000000);
        }
        return new class300(var4, Statics.field1917, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fg(B)V")
    public final void method1500() {
        class356 var1 = field690.method2334();
        class418 var2 = field690.field1284;
        try {
            if (field504 == 0) {
                if (Statics.field106 == null && (field514.method1926() || field546 > 250)) {
                    Statics.field106 = field514.method1922();
                    field514.method1924();
                    field514 = null;
                }
                if (Statics.field106 != null) {
                    if (var1 != null) {
                        var1.method2817();
                        var1 = null;
                    }
                    Statics.field4020 = null;
                    field656 = false;
                    field546 = 0;
                    if (field509.method6908()) {
                        try {
                            this.method1539(Statics.field2773);
                            method4539(20);
                        } catch (Throwable var66) {
                            class443.method6513((String) null, var66);
                            method439(65);
                            return;
                        }
                    } else {
                        method4539(1);
                    }
                }
            }
            if (field504 == 20) {
                if (!this.field614.method301()) {
                    return;
                }
                if (this.field614.method323()) {
                    class443.method6513(this.field614.method299(), (Throwable) null);
                    method439(65);
                    return;
                }
                class22 var4 = this.field614.method302();
                if (var4.method330() != 200) {
                    class443.method6513("Response code: " + var4.method330() + "Response body: " + var4.method331(), (Throwable) null);
                    method439(65);
                    return;
                }
                field546 = 0;
                this.field577 = var4.method331();
                method4539(1);
            }
            if (field504 == 1) {
                if (Statics.field4020 == null) {
                    Statics.field4020 = Statics.field190.method2775(Statics.field2126, Statics.field1519);
                }
                if (Statics.field4020.field1726 == 2) {
                    throw new IOException();
                }
                if (Statics.field4020.field1726 == 1) {
                    if (field526) {
                        var1 = Statics.method1878((Socket) Statics.field4020.field1730, 40000, 5000);
                    } else {
                        var1 = new class157((Socket) Statics.field4020.field1730, Statics.field190, 5000);
                    }
                    field690.method2346(var1);
                    Statics.field4020 = null;
                    method4539(2);
                }
            }
            if (field504 == 2) {
                field690.method2335();
                class255 var5 = class255.method4395();
                var5.field2930.method6841(class257.field3033.field3037);
                field690.method2328(var5);
                field690.method2329();
                var2.field4475 = 0;
                method4539(3);
            }
            if (field504 == 3) {
                if (Statics.field1691 != null) {
                    Statics.field1691.method738();
                }
                if (Statics.field1281 != null) {
                    Statics.field1281.method738();
                }
                boolean var6 = true;
                if (field526 && !var1.method2816(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method2814();
                    if (Statics.field1691 != null) {
                        Statics.field1691.method738();
                    }
                    if (Statics.field1281 != null) {
                        Statics.field1281.method738();
                    }
                    if (var7 != 0) {
                        method439(var7);
                        return;
                    }
                    var2.field4475 = 0;
                    method4539(4);
                }
            }
            if (field504 == 4) {
                if (var2.field4475 < 8) {
                    int var8 = var1.method2815();
                    if (var8 > 8 - var2.field4475) {
                        var8 = 8 - var2.field4475;
                    }
                    if (var8 > 0) {
                        var1.method2813(var2.field4477, var2.field4475, var8);
                        var2.field4475 += var8;
                    }
                }
                if (var2.field4475 == 8) {
                    var2.field4475 = 0;
                    Statics.field1273 = var2.method6676();
                    method4539(5);
                }
            }
            if (field504 == 5) {
                field690.field1284.field4475 = 0;
                field690.method2335();
                class418 var9 = new class418(500);
                int[] var10 = new int[] { Statics.field106.nextInt(), Statics.field106.nextInt(), Statics.field106.nextInt(), Statics.field106.nextInt() };
                var9.field4475 = 0;
                var9.method6841(1);
                var9.method6656(var10[0]);
                var9.method6656(var10[1]);
                var9.method6656(var10[2]);
                var9.method6656(var10[3]);
                var9.method6729(Statics.field1273);
                if (field478 == 40) {
                    var9.method6656(Statics.field985[0]);
                    var9.method6656(Statics.field985[1]);
                    var9.method6656(Statics.field985[2]);
                    var9.method6656(Statics.field985[3]);
                } else {
                    var9.method6841(field508.method46());
                    switch(field508.field1476) {
                        case 0:
                        case 3:
                            var9.method6655(Statics.field1652);
                            var9.field4475++;
                            break;
                        case 1:
                            LinkedHashMap var12 = Statics.field929.field1195;
                            String var13 = class69.field869;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method6656((Integer) var12.get(var15));
                            break;
                        case 2:
                            var9.field4475 += 4;
                    }
                    if (field509.method6908()) {
                        var9.method6841(class423.field4525.method46());
                        var9.method6660(this.field577);
                    } else {
                        var9.method6841(class423.field4524.method46());
                        var9.method6660(class69.field880);
                    }
                }
                var9.method6694(class68.field857, class68.field858);
                Statics.field985 = var10;
                class255 var18 = class255.method4395();
                var18.field2930.field4475 = 0;
                if (field478 == 40) {
                    var18.field2930.method6841(class257.field3038.field3037);
                } else {
                    var18.field2930.method6841(class257.field3039.field3037);
                }
                var18.field2930.method6654(0);
                int var19 = var18.field2930.field4475;
                var18.field2930.method6656(202);
                var18.field2930.method6656(1);
                var18.field2930.method6841(field475);
                var18.field2930.method6841(field500);
                var18.field2930.method6678(var9.field4477, 0, var9.field4475);
                int var20 = var18.field2930.field4475;
                var18.field2930.method6660(class69.field869);
                var18.field2930.method6841((field695 ? 1 : 0) << 1 | (field473 ? 1 : 0));
                var18.field2930.method6654(Statics.field2137);
                var18.field2930.method6654(Statics.field2535);
                method1017(var18.field2930);
                var18.field2930.method6660(Statics.field4);
                var18.field2930.method6656(Statics.field4097);
                class419 var21 = new class419(Statics.field823.method6185());
                Statics.field823.method6184(var21);
                var18.field2930.method6678(var21.field4477, 0, var21.field4477.length);
                var18.field2930.method6841(field475);
                var18.field2930.method6656(0);
                var18.field2930.method6656(0);
                var18.field2930.method6715(Statics.field2775.field3845);
                var18.field2930.method6717(Statics.field41.field3845);
                var18.field2930.method6715(Statics.field956.field3845);
                var18.field2930.method6835(Statics.field5.field3845);
                var18.field2930.method6656(Statics.field1680.field3845);
                var18.field2930.method6656(Statics.field1655.field3845);
                var18.field2930.method6715(Statics.field1549.field3845);
                var18.field2930.method6717(Statics.field104.field3845);
                var18.field2930.method6717(Statics.field1348.field3845);
                var18.field2930.method6835(Statics.field1497.field3845);
                var18.field2930.method6717(Statics.field1413.field3845);
                var18.field2930.method6656(Statics.field1260.field3845);
                var18.field2930.method6715(Statics.field2510.field3845);
                var18.field2930.method6656(Statics.field1603.field3845);
                var18.field2930.method6717(Statics.field1531.field3845);
                var18.field2930.method6715(Statics.field152.field3845);
                var18.field2930.method6717(Statics.field1712.field3845);
                var18.field2930.method6656(Statics.field3044.field3845);
                var18.field2930.method6715(Statics.field1164.field3845);
                var18.field2930.method6715(Statics.field1412.field3845);
                var18.field2930.method6692(var10, var20, var18.field2930.field4475);
                var18.field2930.method6666(var18.field2930.field4475 - var19);
                field690.method2328(var18);
                field690.method2329();
                field690.field1286 = new class435(var10);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var10[var23] + 50;
                }
                var2.method6617(var22);
                method4539(6);
            }
            if (field504 == 6 && var1.method2815() > 0) {
                int var24 = var1.method2814();
                if (var24 == 21 && field478 == 20) {
                    method4539(12);
                } else if (var24 == 2) {
                    method4539(14);
                } else if (var24 == 15 && field478 == 40) {
                    field690.field1293 = -1;
                    method4539(19);
                } else if (var24 == 64) {
                    method4539(10);
                } else if (var24 == 23 && field542 < 1) {
                    field542++;
                    method4539(0);
                } else if (var24 == 29) {
                    method4539(17);
                } else if (var24 == 69) {
                    method4539(7);
                } else {
                    method439(var24);
                    return;
                }
            }
            if (field504 == 7 && var1.method2815() >= 2) {
                var1.method2813(var2.field4477, 0, 2);
                var2.field4475 = 0;
                Statics.field2602 = var2.method6672();
                method4539(8);
            }
            if (field504 == 8 && var1.method2815() >= Statics.field2602) {
                var2.field4475 = 0;
                var1.method2813(var2.field4477, var2.field4475, Statics.field2602);
                class7 var25 = class7.method6420()[var2.method6781()];
                try {
                    class4 var26 = class5.method2939(var25);
                    this.field516 = new class8(var2, var26);
                    method4539(9);
                } catch (Exception var65) {
                    method439(22);
                    return;
                }
            }
            if (field504 == 9 && this.field516.method58()) {
                this.field711 = this.field516.method72();
                this.field516.method62();
                this.field516 = null;
                if (this.field711 == null) {
                    method439(22);
                    return;
                }
                field690.method2335();
                class255 var28 = class255.method4395();
                var28.field2930.method6841(class257.field3035.field3037);
                var28.field2930.method6654(this.field711.field4475);
                var28.field2930.method6664(this.field711);
                field690.method2328(var28);
                field690.method2329();
                this.field711 = null;
                method4539(6);
            }
            if (field504 == 10 && var1.method2815() > 0) {
                Statics.field60 = var1.method2814();
                method4539(11);
            }
            if (field504 == 11 && var1.method2815() >= Statics.field60) {
                var1.method2813(var2.field4477, 0, Statics.field60);
                var2.field4475 = 0;
                method4539(6);
            }
            if (field504 == 12 && var1.method2815() > 0) {
                field507 = (var1.method2814() + 3) * 60;
                method4539(13);
            }
            if (field504 == 13) {
                field546 = 0;
                class69.method304(class295.field3511, class295.field3512, field507 / 60 + class295.field3513);
                if (--field507 <= 0) {
                    method4539(0);
                }
            } else {
                if (field504 == 14 && var1.method2815() >= 1) {
                    Statics.field164 = var1.method2814();
                    method4539(15);
                }
                if (field504 == 15 && var1.method2815() >= Statics.field164) {
                    boolean var29 = var1.method2814() == 1;
                    var1.method2813(var2.field4477, 0, 4);
                    var2.field4475 = 0;
                    boolean var30 = false;
                    if (var29) {
                        int var31 = var2.method6629() << 24;
                        int var32 = var31 | var2.method6629() << 16;
                        int var33 = var32 | var2.method6629() << 8;
                        int var34 = var33 | var2.method6629();
                        String var35 = class69.field869;
                        int var36 = var35.length();
                        int var37 = 0;
                        int var38 = 0;
                        while (true) {
                            if (var38 >= var36) {
                                if (Statics.field929.field1195.size() >= 10 && !Statics.field929.field1195.containsKey(var37)) {
                                    Iterator var41 = Statics.field929.field1195.entrySet().iterator();
                                    var41.next();
                                    var41.remove();
                                }
                                Statics.field929.field1195.put(var37, var34);
                                break;
                            }
                            var37 = (var37 << 5) - var37 + var35.charAt(var38);
                            var38++;
                        }
                    }
                    if (field513) {
                        Statics.field929.field1197 = class69.field869;
                    } else {
                        Statics.field929.field1197 = null;
                    }
                    class89.method2604();
                    field547 = var1.method2814();
                    field648 = var1.method2814() == 1;
                    field594 = var1.method2814();
                    field594 <<= 0x8;
                    field594 += var1.method2814();
                    field595 = var1.method2814();
                    var1.method2813(var2.field4477, 0, 1);
                    var2.field4475 = 0;
                    class256[] var42 = class256.method2613();
                    int var43 = var2.method6623();
                    if (var43 < 0 || var43 >= var42.length) {
                        throw new IOException(var43 + " " + var2.field4475);
                    }
                    field690.field1285 = var42[var43];
                    field690.field1293 = field690.field1285.field3029;
                    var1.method2813(var2.field4477, 0, 2);
                    var2.field4475 = 0;
                    field690.field1293 = var2.method6672();
                    try {
                        client var44 = Statics.field3795;
                        JSObject.getWindow(var44).call("zap", (Object[]) null);
                    } catch (Throwable var64) {
                    }
                    method4539(16);
                }
                if (field504 != 16) {
                    if (field504 == 17 && var1.method2815() >= 2) {
                        var2.field4475 = 0;
                        var1.method2813(var2.field4477, 0, 2);
                        var2.field4475 = 0;
                        Statics.field1498 = var2.method6672();
                        method4539(18);
                    }
                    if (field504 == 18 && var1.method2815() >= Statics.field1498) {
                        var2.field4475 = 0;
                        var1.method2813(var2.field4477, 0, Statics.field1498);
                        var2.field4475 = 0;
                        String var59 = var2.method6707();
                        String var60 = var2.method6707();
                        String var61 = var2.method6707();
                        class69.method304(var59, var60, var61);
                        method3993(10);
                    }
                    if (field504 == 19) {
                        if (field690.field1293 == -1) {
                            if (var1.method2815() < 2) {
                                return;
                            }
                            var1.method2813(var2.field4477, 0, 2);
                            var2.field4475 = 0;
                            field690.field1293 = var2.method6672();
                        }
                        if (var1.method2815() >= field690.field1293) {
                            var1.method2813(var2.field4477, 0, field690.field1293);
                            var2.field4475 = 0;
                            int var62 = field690.field1293;
                            field528.method5674();
                            method2532();
                            class96.method2989(var2);
                            if (var2.field4475 != var62) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field546++;
                        if (field546 > 2000) {
                            if (field542 < 1) {
                                if (Statics.field2566 == Statics.field1519) {
                                    Statics.field1519 = Statics.field1546;
                                } else {
                                    Statics.field1519 = Statics.field2566;
                                }
                                field542++;
                                method4539(0);
                            } else {
                                method439(-3);
                            }
                        }
                    }
                } else if (var1.method2815() >= field690.field1293) {
                    var2.field4475 = 0;
                    var1.method2813(var2.field4477, 0, field690.field1293);
                    field528.method5664();
                    field482 = 1L;
                    Statics.field483.field1037 = 0;
                    Statics.field769 = true;
                    field487 = true;
                    field677 = -1L;
                    class34.field243 = new class323();
                    field690.method2335();
                    field690.field1284.field4475 = 0;
                    field690.field1285 = null;
                    field690.field1290 = null;
                    field690.field1291 = null;
                    field690.field1292 = null;
                    field690.field1293 = 0;
                    field690.field1288 = 0;
                    field489 = 0;
                    field506 = 0;
                    field490 = 0;
                    method2366();
                    class33.method2598(0);
                    class98.method2597();
                    field630 = 0;
                    field675 = false;
                    field718 = 0;
                    field499 = 0;
                    field552 = 0;
                    Statics.field1274 = null;
                    field512 = 0;
                    field571 = -1;
                    field502 = 0;
                    field678 = 0;
                    field498 = class94.field1238;
                    field574 = class94.field1238;
                    field519 = 0;
                    class96.field1246 = 0;
                    for (int var46 = 0; var46 < 2048; var46++) {
                        class96.field1249[var46] = null;
                        class96.field1247[var46] = class186.field2124;
                    }
                    for (int var47 = 0; var47 < 2048; var47++) {
                        field653[var47] = null;
                    }
                    for (int var48 = 0; var48 < 32768; var48++) {
                        field699[var48] = null;
                    }
                    field604 = -1;
                    field655.method5309();
                    field607.method5309();
                    for (int var49 = 0; var49 < 4; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            for (int var51 = 0; var51 < 104; var51++) {
                                field631[var49][var50][var51] = null;
                            }
                        }
                    }
                    field657 = new class321();
                    Statics.field182.method1645();
                    for (int var52 = 0; var52 < Statics.field4583; var52++) {
                        class163 var53 = class163.method2017(var52);
                        if (var53 != null) {
                            class276.field3184[var52] = 0;
                            class276.field3185[var52] = 0;
                        }
                    }
                    Statics.field4057.method2294();
                    field647 = -1;
                    if (field637 != -1) {
                        class281.method4819(field637);
                    }
                    for (class80 var54 = (class80) field638.method6448(); var54 != null; var54 = (class80) field638.method6445()) {
                        method100(var54, true);
                    }
                    field637 = -1;
                    field638 = new class397(8);
                    field643 = null;
                    method2366();
                    field712.method4855((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var55 = 0; var55 < 8; var55++) {
                        field650[var55] = null;
                        field602[var55] = false;
                    }
                    class78.field994 = new class397(32);
                    field480 = true;
                    for (int var56 = 0; var56 < 100; var56++) {
                        field505[var56] = true;
                    }
                    class255 var57 = Statics.method3174(class253.field2825, field690.field1286);
                    var57.field2930.method6841(Statics.method2724());
                    var57.field2930.method6654(Statics.field2137);
                    var57.field2930.method6654(Statics.field2535);
                    field690.method2328(var57);
                    Statics.field1252 = null;
                    Statics.field2667 = null;
                    Arrays.fill(field706, (Object) null);
                    Statics.field1324 = null;
                    Arrays.fill(field707, (Object) null);
                    for (int var58 = 0; var58 < 8; var58++) {
                        field748[var58] = new class311();
                    }
                    Statics.field524 = null;
                    class96.method2989(var2);
                    Statics.field1278 = -1;
                    method387(false, var2);
                    field690.field1285 = null;
                }
            }
        } catch (IOException var67) {
            if (field542 < 1) {
                if (Statics.field2566 == Statics.field1519) {
                    Statics.field1519 = Statics.field1546;
                } else {
                    Statics.field1519 = Statics.field2566;
                }
                field542++;
                method4539(0);
            } else {
                method439(-2);
            }
        }
    }

    @ObfuscatedName("dx.fh(B)V")
    public static void method2532() {
        field690.method2335();
        field690.field1284.field4475 = 0;
        field690.field1285 = null;
        field690.field1290 = null;
        field690.field1291 = null;
        field690.field1292 = null;
        field690.field1293 = 0;
        field690.field1288 = 0;
        field489 = 0;
        method2366();
        field512 = 0;
        field502 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field653[var0] = null;
        }
        Statics.field4070 = null;
        for (int var1 = 0; var1 < field699.length; var1++) {
            class91 var2 = field699[var1];
            if (var2 != null) {
                var2.field1156 = -1;
                var2.field1117 = false;
            }
        }
        class78.field994 = new class397(32);
        method3993(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field505[var3] = true;
        }
        class255 var4 = Statics.method3174(class253.field2825, field690.field1286);
        var4.field2930.method6841(Statics.method2724());
        var4.field2930.method6654(Statics.field2137);
        var4.field2930.method6654(Statics.field2535);
        field690.method2328(var4);
    }

    @ObfuscatedName("an.fd(II)V")
    public static void method439(int arg0) {
        if (arg0 == -3) {
            class69.method304(class295.field3514, class295.field3515, class295.field3516);
        } else if (arg0 == -2) {
            class69.method304(class295.field3695, class295.field3518, class295.field3519);
        } else if (arg0 == -1) {
            class69.method304(class295.field3508, class295.field3521, class295.field3522);
        } else if (arg0 == 3) {
            class69.method4983(3);
            class69.field873 = 1;
        } else if (arg0 == 4) {
            class69.method4983(14);
            class69.field872 = 0;
        } else if (arg0 == 5) {
            class69.field873 = 2;
            class69.method304(class295.field3693, class295.field3527, class295.field3528);
        } else if (arg0 == 68 || !(field534 || arg0 != 6)) {
            class69.method304(class295.field3529, class295.field3530, class295.field3531);
        } else if (arg0 == 7) {
            class69.method304(class295.field3532, class295.field3751, class295.field3534);
        } else if (arg0 == 8) {
            class69.method304(class295.field3689, class295.field3642, class295.field3708);
        } else if (arg0 == 9) {
            class69.method304(class295.field3709, class295.field3697, class295.field3509);
        } else if (arg0 == 10) {
            class69.method304(class295.field3541, class295.field3542, class295.field3543);
        } else if (arg0 == 11) {
            class69.method304(class295.field3505, class295.field3545, class295.field3546);
        } else if (arg0 == 12) {
            class69.method304(class295.field3547, class295.field3719, class295.field3549);
        } else if (arg0 == 13) {
            class69.method304(class295.field3550, class295.field3551, class295.field3703);
        } else if (arg0 == 14) {
            class69.method304(class295.field3669, class295.field3595, class295.field3555);
        } else if (arg0 == 16) {
            class69.method304(class295.field3556, class295.field3557, class295.field3558);
        } else if (arg0 == 17) {
            class69.method304(class295.field3559, class295.field3782, class295.field3561);
        } else if (arg0 == 18) {
            class69.method4983(14);
            class69.field872 = 1;
        } else if (arg0 == 19) {
            class69.method304(class295.field3565, class295.field3629, class295.field3538);
        } else if (arg0 == 20) {
            class69.method304(class295.field3568, class295.field3569, class295.field3725);
        } else if (arg0 == 22) {
            class69.method304(class295.field3540, class295.field3582, class295.field3772);
        } else if (arg0 == 23) {
            class69.method304(class295.field3574, class295.field3575, class295.field3576);
        } else if (arg0 == 24) {
            class69.method304(class295.field3691, class295.field3647, class295.field3759);
        } else if (arg0 == 25) {
            class69.method304(class295.field3580, class295.field3581, class295.field3673);
        } else if (arg0 == 26) {
            class69.method304(class295.field3583, class295.field3584, class295.field3481);
        } else if (arg0 == 27) {
            class69.method304(class295.field3520, class295.field3587, class295.field3588);
        } else if (arg0 == 31) {
            class69.method304(class295.field3607, class295.field3596, class295.field3597);
        } else if (arg0 == 32) {
            class69.method304(class295.field3594, class295.field3517, class295.field3600);
        } else if (arg0 == 37) {
            class69.method304(class295.field3507, class295.field3602, class295.field3603);
        } else if (arg0 == 38) {
            class69.method304(class295.field3604, class295.field3765, class295.field3606);
        } else if (arg0 == 55) {
            class69.method4983(8);
        } else if (arg0 == 56) {
            class69.method304(class295.field3611, class295.field3612, class295.field3613);
            method3993(11);
            return;
        } else if (arg0 == 57) {
            class69.method304(class295.field3599, class295.field3615, class295.field3592);
            method3993(11);
            return;
        } else if (arg0 == 61) {
            class69.method4983(7);
        } else if (arg0 == 62) {
            method3993(10);
            class69.method4983(9);
            class69.method304(class295.field3617, class295.field3618, class295.field3628);
            return;
        } else if (arg0 == 63) {
            method3993(10);
            class69.method4983(9);
            class69.method304(class295.field3620, class295.field3469, class295.field3622);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method3993(10);
            class69.method4983(9);
            class69.method304(class295.field3623, class295.field3745, class295.field3625);
            return;
        } else {
            class69.method304(class295.field3626, class295.field3685, class295.field3645);
        }
        method3993(10);
        if (field509.method6908()) {
            class69.method4983(9);
        }
    }

    @ObfuscatedName("cv.fq(I)V")
    public static final void method2158() {
        field690.method2332();
        method2373();
        Statics.field24.method3635();
        for (int var0 = 0; var0 < 4; var0++) {
            field751[var0].method3390();
        }
        System.gc();
        class261.field3065 = 1;
        Statics.field1487 = null;
        Statics.field1780 = -1;
        Statics.field3066 = -1;
        Statics.field959 = 0;
        Statics.field949 = false;
        Statics.field3067 = 2;
        field716 = -1;
        field744 = false;
        class63.method5212();
        method3993(10);
    }

    @ObfuscatedName("bh.fz(II)V")
    public static final void method1931(int arg0) {
        method2158();
        switch(arg0) {
            case 1:
                class69.method4983(24);
                class69.method304(class295.field3631, class295.field3578, class295.field3572);
                break;
            case 2:
                class69.method4983(24);
                class69.method304(class295.field3648, class295.field3715, class295.field3716);
        }
    }

    @ObfuscatedName("cf.fc(I)V")
    public static final void method2373() {
        class182.method5980();
        class174.field1899.method4518();
        class166.method1045();
        class180.method2401();
        class171.field1835.method4518();
        class171.field1836.method4518();
        class181.field2008.method4518();
        class181.field2009.method4518();
        class181.field2010.method4518();
        class183.field2078.method4518();
        class183.field2094.method4518();
        class183.field2087.method4518();
        class173.method2046();
        class176.method9();
        class163.field1745.method4518();
        Statics.field4130.method6548();
        Statics.field4117.method6548();
        Statics.method1709();
        class167.field1795.method4518();
        class167.field1796.method4518();
        class178.method3233();
        class177.field1914.method4518();
        class164.field1752.method4518();
        class279.field3206.method4518();
        class281.method4075();
        ((class202) Statics.field2273).method3837();
        class72.field935.method4518();
        Statics.field1412.method5067();
        Statics.field41.method5067();
        Statics.field104.method5067();
        Statics.field152.method5067();
        Statics.field1603.method5067();
        Statics.field2775.method5067();
        Statics.field1413.method5067();
        Statics.field1348.method5067();
        Statics.field1712.method5067();
        Statics.field3044.method5067();
        Statics.field1260.method5067();
        Statics.field1680.method5067();
    }

    @ObfuscatedName("ct.fi(I)V")
    public static final void method2288() {
        if (field506 > 0) {
            method2158();
        } else {
            field528.method5661();
            method3993(40);
            Statics.field3187 = field690.method2334();
            field690.method2333();
        }
    }

    @ObfuscatedName("bl.fs(ZB)V")
    public static final void method1704(boolean arg0) {
        if (arg0) {
            field508 = class69.field883 ? class123.field1472 : class123.field1475;
            return;
        }
        LinkedHashMap var1 = Statics.field929.field1195;
        String var2 = class69.field869;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field508 = var1.containsKey(var4) ? class123.field1477 : class123.field1474;
    }

    @ObfuscatedName("client.fo(I)V")
    public final void method1233() {
        if (field489 > 1) {
            field489--;
        }
        if (field506 > 0) {
            field506--;
        }
        if (field656) {
            field656 = false;
            method2288();
            return;
        }
        if (!field522) {
            method2897();
        }
        for (int var1 = 0; var1 < 100 && this.method1313(field690); var1++) {
        }
        if (field478 != 30) {
            return;
        }
        while (true) {
            class35 var2 = (class35) class34.field243.method5348();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field528.field4044) {
                    class255 var6 = Statics.method3174(class253.field2908, field690.field1286);
                    var6.field2930.method6841(0);
                    int var7 = var6.field2930.field4475;
                    field528.method5666(var6.field2930);
                    var6.field2930.method6665(var6.field2930.field4475 - var7);
                    field690.method2328(var6);
                    field528.method5668();
                }
                Object var8 = Statics.field483.field1036;
                synchronized (Statics.field483.field1036) {
                    if (!field714) {
                        Statics.field483.field1037 = 0;
                    } else if (class33.field234 != 0 || Statics.field483.field1037 >= 40) {
                        class255 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field483.field1037 && (var9 == null || var9.field2930.field4475 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field483.field1039[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field483.field1041[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field484 != var16 || field747 != var15) {
                                if (var9 == null) {
                                    var9 = Statics.method3174(class253.field2890, field690.field1286);
                                    var9.field2930.method6841(0);
                                    var10 = var9.field2930.field4475;
                                    var9.field2930.field4475 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field486 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field484;
                                    var18 = var15 - field747;
                                    var19 = (int) ((Statics.field483.field1040[var14] - field486) / 20L);
                                    var12 = (int) ((Statics.field483.field1040[var14] - field486) % 20L + (long) var12);
                                }
                                field484 = var16;
                                field747 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2930.method6654((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2930.method6841(var19 + 128);
                                    var9.field2930.method6654((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2930.method6841(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2930.method6656(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2930.method6656(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2930.method6654((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2930.method6656(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2930.method6656(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field486 = Statics.field483.field1040[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2930.method6665(var9.field2930.field4475 - var10);
                            int var20 = var9.field2930.field4475;
                            var9.field2930.field4475 = var10;
                            var9.field2930.method6841(var12 / var13);
                            var9.field2930.method6841(var12 % var13);
                            var9.field2930.field4475 = var20;
                            field690.method2328(var9);
                        }
                        if (var11 >= Statics.field483.field1037) {
                            Statics.field483.field1037 = 0;
                        } else {
                            Statics.field483.field1037 -= var11;
                            System.arraycopy(Statics.field483.field1041, var11, Statics.field483.field1041, 0, Statics.field483.field1037);
                            System.arraycopy(Statics.field483.field1039, var11, Statics.field483.field1039, 0, Statics.field483.field1037);
                            System.arraycopy(Statics.field483.field1040, var11, Statics.field483.field1040, 0, Statics.field483.field1037);
                        }
                    }
                }
                if (class33.field234 == 1 || !Statics.field1666 && class33.field234 == 4 || class33.field234 == 2) {
                    long var22 = class33.field237 - field482 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field482 = class33.field237 * -1L;
                    int var24 = class33.field236;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field2535) {
                        var24 = Statics.field2535;
                    }
                    int var25 = class33.field235;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field2137) {
                        var25 = Statics.field2137;
                    }
                    int var26 = (int) var22;
                    class255 var27 = Statics.method3174(class253.field2895, field690.field1286);
                    var27.field2930.method6654((class33.field234 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2930.method6654(var25);
                    var27.field2930.method6654(var24);
                    field690.method2328(var27);
                }
                if (class24.field141 > 0) {
                    class255 var28 = Statics.method3174(class253.field2900, field690.field1286);
                    var28.field2930.method6654(0);
                    int var29 = var28.field2930.field4475;
                    long var30 = class416.method5860();
                    for (int var32 = 0; var32 < class24.field141; var32++) {
                        long var33 = var30 - field677;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field677 = var30;
                        var28.field2930.method6655((int) var33);
                        var28.field2930.method6670(class24.field140[var32]);
                    }
                    var28.field2930.method6666(var28.field2930.field4475 - var29);
                    field690.method2328(var28);
                }
                if (field561 > 0) {
                    field561--;
                }
                if (class24.field156[96] || class24.field156[97] || class24.field156[98] || class24.field156[99]) {
                    field562 = true;
                }
                if (field562 && field561 <= 0) {
                    field561 = 20;
                    field562 = false;
                    class255 var35 = Statics.method3174(class253.field2870, field690.field1286);
                    var35.field2930.method6801(field477);
                    var35.field2930.method6706(field499);
                    field690.method2328(var35);
                }
                if (Statics.field769 && !field487) {
                    field487 = true;
                    class255 var36 = Statics.method3174(class253.field2862, field690.field1286);
                    var36.field2930.method6841(1);
                    field690.method2328(var36);
                }
                if (!Statics.field769 && field487) {
                    field487 = false;
                    class255 var37 = Statics.method3174(class253.field2862, field690.field1286);
                    var37.field2930.method6841(0);
                    field690.method2328(var37);
                }
                if (Statics.field1262 != null) {
                    Statics.field1262.method6247();
                }
                method1871();
                method2544();
                method2731();
                if (field478 != 30) {
                    return;
                }
                method5145();
                int var10002;
                for (int var38 = 0; var38 < field718; var38++) {
                    var10002 = field540[var38]--;
                    if (field540[var38] >= -10) {
                        class37 var40 = field723[var38];
                        if (var40 == null) {
                            class37 var10000 = (class37) null;
                            var40 = class37.method695(Statics.field152, field719[var38], 0);
                            if (var40 == null) {
                                continue;
                            }
                            field540[var38] += var40.method703();
                            field723[var38] = var40;
                        }
                        if (field540[var38] < 0) {
                            int var47;
                            if (field686[var38] == 0) {
                                var47 = Statics.field929.field1201;
                            } else {
                                int var41 = (field686[var38] & 0xFF) * 128;
                                int var42 = field686[var38] >> 16 & 0xFF;
                                int var43 = var42 * 128 + 64 - Statics.field4070.field1130;
                                if (var43 < 0) {
                                    var43 = -var43;
                                }
                                int var44 = field686[var38] >> 8 & 0xFF;
                                int var45 = var44 * 128 + 64 - Statics.field4070.field1090;
                                if (var45 < 0) {
                                    var45 = -var45;
                                }
                                int var46 = var43 + var45 - 128;
                                if (var46 > var41) {
                                    field540[var38] = -100;
                                    continue;
                                }
                                if (var46 < 0) {
                                    var46 = 0;
                                }
                                var47 = Statics.field929.field1202 * (var41 - var46) / var41;
                            }
                            if (var47 > 0) {
                                class38 var48 = var40.method696().method710(Statics.field2524);
                                class45 var49 = class45.method809(var48, 100, var47);
                                var49.method812(field720[var38] - 1);
                                Statics.field3373.method658(var49);
                            }
                            field540[var38] = -100;
                        }
                    } else {
                        field718--;
                        for (int var39 = var38; var39 < field718; var39++) {
                            field719[var39] = field719[var39 + 1];
                            field723[var39] = field723[var39 + 1];
                            field720[var39] = field720[var39 + 1];
                            field540[var39] = field540[var39 + 1];
                            field686[var39] = field686[var39 + 1];
                        }
                        var38--;
                    }
                }
                if (field744 && !class261.method1916()) {
                    if (Statics.field929.field1200 != 0 && field716 != -1) {
                        class261.method2841(Statics.field2775, field716, 0, Statics.field929.field1200, false);
                    }
                    field744 = false;
                }
                field690.field1288++;
                if (field690.field1288 > 750) {
                    method2288();
                    return;
                }
                method5687();
                method398();
                method2224();
                field539++;
                if (field558 != 0) {
                    field555 += 20;
                    if (field555 >= 400) {
                        field558 = 0;
                    }
                }
                if (Statics.field2723 != null) {
                    field583++;
                    if (field583 >= 15) {
                        method2020(Statics.field2723);
                        Statics.field2723 = null;
                    }
                }
                class281 var50 = Statics.field8;
                class281 var51 = Statics.field3376;
                Statics.field8 = null;
                Statics.field3376 = null;
                field654 = null;
                field658 = false;
                field532 = false;
                field702 = 0;
                while (class24.method3026() && field702 < 128) {
                    if (field547 >= 2 && class24.field156[82] && Statics.field1248 == 66) {
                        String var52 = class98.method1582();
                        Statics.field3795.method484(var52);
                    } else if (field552 != 1 || Statics.field3955 <= 0) {
                        field523[field702] = Statics.field1248;
                        field759[field702] = Statics.field3955;
                        field702++;
                    }
                }
                boolean var53 = field547 >= 2;
                if (var53 && class24.field156[82] && class24.field156[81] && field679 != 0) {
                    int var54 = Statics.field4070.field1068 - field679;
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 3) {
                        var54 = 3;
                    }
                    if (Statics.field4070.field1068 != var54) {
                        method2424(Statics.field1533 + Statics.field4070.field1152[0], Statics.field1240 + Statics.field4070.field1153[0], var54, false);
                    }
                    field679 = 0;
                }
                if (field637 != -1) {
                    Statics.method186(field637, 0, 0, Statics.field2137, Statics.field2535, 0, 0);
                }
                field662++;
                while (true) {
                    class81 var55;
                    class281 var56;
                    class281 var57;
                    do {
                        var55 = (class81) field681.method5299();
                        if (var55 == null) {
                            while (true) {
                                class81 var58;
                                class281 var59;
                                class281 var60;
                                do {
                                    var58 = (class81) field580.method5299();
                                    if (var58 == null) {
                                        while (true) {
                                            class81 var61;
                                            class281 var62;
                                            class281 var63;
                                            do {
                                                var61 = (class81) field632.method5299();
                                                if (var61 == null) {
                                                    this.method1098();
                                                    method4016();
                                                    if (field713 != null) {
                                                        this.method1103();
                                                    }
                                                    if (Statics.field1625 != null) {
                                                        method2020(Statics.field1625);
                                                        field590++;
                                                        if (class33.field226 == 0) {
                                                            if (field573) {
                                                                if (Statics.field2067 == Statics.field1625 && field624 != field588) {
                                                                    class281 var64 = Statics.field1625;
                                                                    byte var65 = 0;
                                                                    if (field642 == 1 && var64.field3230 == 206) {
                                                                        var65 = 1;
                                                                    }
                                                                    if (var64.field3354[field588] <= 0) {
                                                                        var65 = 0;
                                                                    }
                                                                    if (class282.method641(method5970(var64))) {
                                                                        int var66 = field624;
                                                                        int var67 = field588;
                                                                        var64.field3354[var67] = var64.field3354[var66];
                                                                        var64.field3222[var67] = var64.field3222[var66];
                                                                        var64.field3354[var66] = -1;
                                                                        var64.field3222[var66] = 0;
                                                                    } else if (var65 == 1) {
                                                                        int var68 = field624;
                                                                        int var69 = field588;
                                                                        while (var68 != var69) {
                                                                            if (var68 > var69) {
                                                                                var64.method4898(var68 - 1, var68);
                                                                                var68--;
                                                                            } else if (var68 < var69) {
                                                                                var64.method4898(var68 + 1, var68);
                                                                                var68++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var64.method4898(field588, field624);
                                                                    }
                                                                    class255 var70 = Statics.method3174(class253.field2812, field690.field1286);
                                                                    var70.field2930.method6706(field588);
                                                                    var70.field2930.method6670(var65);
                                                                    var70.field2930.method6715(Statics.field1625.field3226);
                                                                    var70.field2930.method6801(field624);
                                                                    field690.method2328(var70);
                                                                }
                                                            } else if (this.method1100()) {
                                                                this.method1574(field586, field587);
                                                            } else if (field689 > 0) {
                                                                int var71 = field586;
                                                                int var72 = field587;
                                                                method4043(Statics.field1188, var71, var72);
                                                                Statics.field1188 = null;
                                                            }
                                                            field583 = 10;
                                                            class33.field234 = 0;
                                                            Statics.field1625 = null;
                                                        } else if (field590 >= 5 && (class33.field227 > field586 + 5 || class33.field227 < field586 - 5 || class33.field228 > field587 + 5 || class33.field228 < field587 - 5)) {
                                                            field573 = true;
                                                        }
                                                    }
                                                    if (class197.method3753()) {
                                                        int var73 = class197.field2327;
                                                        int var74 = class197.field2315;
                                                        class255 var75 = Statics.method3174(class253.field2860, field690.field1286);
                                                        var75.field2930.method6841(5);
                                                        var75.field2930.method6841(class24.field156[82] ? (class24.field156[81] ? 2 : 1) : 0);
                                                        var75.field2930.method6801(Statics.field1240 + var74);
                                                        var75.field2930.method6657(Statics.field1533 + var73);
                                                        field690.method2328(var75);
                                                        class197.method3674();
                                                        field628 = class33.field235;
                                                        field579 = class33.field236;
                                                        field558 = 1;
                                                        field555 = 0;
                                                        field502 = var73;
                                                        field678 = var74;
                                                    }
                                                    if (Statics.field8 != var50) {
                                                        if (var50 != null) {
                                                            method2020(var50);
                                                        }
                                                        if (Statics.field8 != null) {
                                                            method2020(Statics.field8);
                                                        }
                                                    }
                                                    if (Statics.field3376 != var51 && field715 == field629) {
                                                        if (var51 != null) {
                                                            method2020(var51);
                                                        }
                                                        if (Statics.field3376 != null) {
                                                            method2020(Statics.field3376);
                                                        }
                                                    }
                                                    if (Statics.field3376 == null) {
                                                        if (field715 > 0) {
                                                            field715--;
                                                        }
                                                    } else if (field715 < field629) {
                                                        field715++;
                                                        if (field715 == field629) {
                                                            method2020(Statics.field3376);
                                                        }
                                                    }
                                                    if (field552 == 0) {
                                                        int var76 = Statics.field4070.field1130;
                                                        int var77 = Statics.field4070.field1090;
                                                        if (Statics.field28 - var76 < -500 || Statics.field28 - var76 > 500 || Statics.field1105 - var77 < -500 || Statics.field1105 - var77 > 500) {
                                                            Statics.field28 = var76;
                                                            Statics.field1105 = var77;
                                                        }
                                                        if (Statics.field28 != var76) {
                                                            Statics.field28 += (var76 - Statics.field28) / 16;
                                                        }
                                                        if (Statics.field1105 != var77) {
                                                            Statics.field1105 += (var77 - Statics.field1105) / 16;
                                                        }
                                                        int var78 = Statics.field28 >> 7;
                                                        int var79 = Statics.field1105 >> 7;
                                                        int var80 = method3822(Statics.field28, Statics.field1105, Statics.field110);
                                                        int var81 = 0;
                                                        if (var78 > 3 && var79 > 3 && var78 < 100 && var79 < 100) {
                                                            for (int var82 = var78 - 4; var82 <= var78 + 4; var82++) {
                                                                for (int var83 = var79 - 4; var83 <= var79 + 4; var83++) {
                                                                    int var84 = Statics.field110;
                                                                    if (var84 < 3 && (class75.field962[1][var82][var83] & 0x2) == 2) {
                                                                        var84++;
                                                                    }
                                                                    int var85 = var80 - class75.field972[var84][var82][var83];
                                                                    if (var85 > var81) {
                                                                        var81 = var85;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var86 = var81 * 192;
                                                        if (var86 > 98048) {
                                                            var86 = 98048;
                                                        }
                                                        if (var86 < 32768) {
                                                            var86 = 32768;
                                                        }
                                                        if (var86 > field563) {
                                                            field563 += (var86 - field563) / 24;
                                                        } else if (var86 < field563) {
                                                            field563 += (var86 - field563) / 80;
                                                        }
                                                        Statics.field232 = method3822(Statics.field4070.field1130, Statics.field4070.field1090, Statics.field110) - field553;
                                                    } else if (field552 == 1) {
                                                        if (field613 && Statics.field4070 != null) {
                                                            int var87 = Statics.field4070.field1152[0];
                                                            int var88 = Statics.field4070.field1153[0];
                                                            if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                                                                Statics.field28 = Statics.field4070.field1130;
                                                                int var89 = method3822(Statics.field4070.field1130, Statics.field4070.field1090, Statics.field110) - field553;
                                                                if (var89 < Statics.field232) {
                                                                    Statics.field232 = var89;
                                                                }
                                                                Statics.field1105 = Statics.field4070.field1090;
                                                                field613 = false;
                                                            }
                                                        }
                                                        short var90 = -1;
                                                        if (class24.field156[33]) {
                                                            var90 = 0;
                                                        } else if (class24.field156[49]) {
                                                            var90 = 1024;
                                                        }
                                                        if (class24.field156[48]) {
                                                            if (var90 == 0) {
                                                                var90 = 1792;
                                                            } else if (var90 == 1024) {
                                                                var90 = 1280;
                                                            } else {
                                                                var90 = 1536;
                                                            }
                                                        } else if (class24.field156[50]) {
                                                            if (var90 == 0) {
                                                                var90 = 256;
                                                            } else if (var90 == 1024) {
                                                                var90 = 768;
                                                            } else {
                                                                var90 = 512;
                                                            }
                                                        }
                                                        byte var91 = 0;
                                                        if (class24.field156[35]) {
                                                            var91 = -1;
                                                        } else if (class24.field156[51]) {
                                                            var91 = 1;
                                                        }
                                                        int var92 = 0;
                                                        if (var90 >= 0 || var91 != 0) {
                                                            int var93 = class24.field156[81] ? field535 : field557;
                                                            var92 = var93 * 16;
                                                            field585 = var90;
                                                            field556 = var91;
                                                        }
                                                        if (field543 < var92) {
                                                            field543 += var92 / 8;
                                                            if (field543 > var92) {
                                                                field543 = var92;
                                                            }
                                                        } else if (field543 > var92) {
                                                            field543 = field543 * 9 / 10;
                                                        }
                                                        if (field543 > 0) {
                                                            int var94 = field543 / 16;
                                                            if (field585 >= 0) {
                                                                int var95 = field585 - Statics.field4247 & 0x7FF;
                                                                int var96 = class194.field2276[var95];
                                                                int var97 = class194.field2271[var95];
                                                                Statics.field28 += var94 * var96 / 65536;
                                                                Statics.field1105 += var94 * var97 / 65536;
                                                            }
                                                            if (field556 != 0) {
                                                                Statics.field232 += field556 * var94;
                                                                if (Statics.field232 > 0) {
                                                                    Statics.field232 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field585 = -1;
                                                            field556 = -1;
                                                        }
                                                        if (class24.field156[13]) {
                                                            field690.method2328(Statics.method3174(class253.field2868, field690.field1286));
                                                            field552 = 0;
                                                        }
                                                    }
                                                    if (class33.field226 == 4 && Statics.field1666) {
                                                        int var98 = class33.field228 - field551;
                                                        field549 = var98 * 2;
                                                        field551 = var98 == -1 || var98 == 1 ? class33.field228 : (field551 + class33.field228) / 2;
                                                        int var99 = field550 - class33.field227;
                                                        field548 = var99 * 2;
                                                        field550 = var99 == -1 || var99 == 1 ? class33.field227 : (field550 + class33.field227) / 2;
                                                    } else {
                                                        if (class24.field156[96]) {
                                                            field548 += (-24 - field548) / 2;
                                                        } else if (class24.field156[97]) {
                                                            field548 += (24 - field548) / 2;
                                                        } else {
                                                            field548 /= 2;
                                                        }
                                                        if (class24.field156[98]) {
                                                            field549 += (12 - field549) / 2;
                                                        } else if (class24.field156[99]) {
                                                            field549 += (-12 - field549) / 2;
                                                        } else {
                                                            field549 /= 2;
                                                        }
                                                        field551 = class33.field228;
                                                        field550 = class33.field227;
                                                    }
                                                    field499 = field548 / 2 + field499 & 0x7FF;
                                                    field477 += field549 / 2;
                                                    if (field477 < 128) {
                                                        field477 = 128;
                                                    }
                                                    if (field477 > 383) {
                                                        field477 = 383;
                                                    }
                                                    if (field725) {
                                                        method1083();
                                                    } else if (field724) {
                                                        int var100 = Statics.field1812 * 128 + 64;
                                                        int var101 = Statics.field1749 * 128 + 64;
                                                        int var102 = method3822(var100, var101, Statics.field110) - Statics.field1336;
                                                        method13(var100, var102, var101);
                                                        int var103 = Statics.field3194 * 128 + 64;
                                                        int var104 = Statics.field3151 * 128 + 64;
                                                        int var105 = method3822(var103, var104, Statics.field110) - Statics.field3952;
                                                        int var106 = var103 - Statics.field1318;
                                                        int var107 = var105 - Statics.field3166;
                                                        int var108 = var104 - Statics.field1339;
                                                        int var109 = (int) Math.sqrt((double) (var106 * var106 + var108 * var108));
                                                        int var110 = (int) (Math.atan2((double) var107, (double) var109) * 325.9490051269531D) & 0x7FF;
                                                        int var111 = (int) (Math.atan2((double) var106, (double) var108) * -325.9490051269531D) & 0x7FF;
                                                        method1933(var110, var111);
                                                    }
                                                    for (int var112 = 0; var112 < 5; var112++) {
                                                        var10002 = field730[var112]++;
                                                    }
                                                    Statics.field4057.method2262();
                                                    int var113 = ++class33.field217 - 1;
                                                    int var115 = class24.field151;
                                                    if (var113 > 15000 && var115 > 15000) {
                                                        field506 = 250;
                                                        class33.method2598(14500);
                                                        class255 var117 = Statics.method3174(class253.field2838, field690.field1286);
                                                        field690.method2328(var117);
                                                    }
                                                    Statics.field182.method1644();
                                                    field690.field1289++;
                                                    if (field690.field1289 > 50) {
                                                        class255 var118 = Statics.method3174(class253.field2815, field690.field1286);
                                                        field690.method2328(var118);
                                                    }
                                                    try {
                                                        field690.method2329();
                                                    } catch (IOException var120) {
                                                        method2288();
                                                    }
                                                    return;
                                                }
                                                var62 = var61.field1017;
                                                if (var62.field3227 < 0) {
                                                    break;
                                                }
                                                var63 = class281.method1956(var62.field3245);
                                            } while (var63 == null || var63.field3280 == null || var62.field3227 >= var63.field3280.length || var63.field3280[var62.field3227] != var62);
                                            class64.method4965(var61);
                                        }
                                    }
                                    var59 = var58.field1017;
                                    if (var59.field3227 < 0) {
                                        break;
                                    }
                                    var60 = class281.method1956(var59.field3245);
                                } while (var60 == null || var60.field3280 == null || var59.field3227 >= var60.field3280.length || var60.field3280[var59.field3227] != var59);
                                class64.method4965(var58);
                            }
                        }
                        var56 = var55.field1017;
                        if (var56.field3227 < 0) {
                            break;
                        }
                        var57 = class281.method1956(var56.field3245);
                    } while (var57 == null || var57.field3280 == null || var56.field3227 >= var57.field3280.length || var57.field3280[var56.field3227] != var56);
                    class64.method4965(var55);
                }
            }
            class255 var4 = Statics.method3174(class253.field2853, field690.field1286);
            var4.field2930.method6841(0);
            int var5 = var4.field2930.field4475;
            class34.method2411(var4.field2930);
            var4.field2930.method6665(var4.field2930.field4475 - var5);
            field690.method2328(var4);
        }
    }

    @ObfuscatedName("ea.fl(I)V")
    public static final void method2758() {
        if (Statics.field1281 != null) {
            Statics.field1281.method762();
        }
        if (Statics.field1691 != null) {
            Statics.field1691.method762();
        }
    }

    @ObfuscatedName("od.fy(Lgn;IIIB)V")
    public static void method6583(class183 arg0, int arg1, int arg2, int arg3) {
        if (field718 < 50 && Statics.field929.field1202 != 0 && arg0.field2088 != null && arg1 < arg0.field2088.length) {
            method5263(arg0.field2088[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("ct.fa(Lgn;IIIB)V")
    public static void method2304(class183 arg0, int arg1, int arg2, int arg3) {
        if (field718 < 50 && Statics.field929.field1202 != 0 && arg0.field2076 != null && arg0.field2076.containsKey(arg1)) {
            method5263((Integer) arg0.field2076.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("li.fr(IIII)V")
    public static void method5263(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field719[field718] = var3;
        field720[field718] = var4;
        field540[field718] = 0;
        field723[field718] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field686[field718] = (var6 << 16) + (var7 << 8) + var5;
        field718++;
    }

    @ObfuscatedName("cv.fp(IIIS)V")
    public static void method2173(int arg0, int arg1, int arg2) {
        if (Statics.field929.field1201 == 0 || arg1 == 0 || field718 >= 50) {
            return;
        }
        field719[field718] = arg0;
        field720[field718] = arg1;
        field540[field718] = arg2;
        field723[field718] = null;
        field686[field718] = 0;
        field718++;
    }

    @ObfuscatedName("k.fn(IB)V")
    public static void method292(int arg0) {
        if (arg0 == -1 && !field744) {
            class261.method3135();
        } else if (arg0 != -1 && field716 != arg0 && Statics.field929.field1200 != 0 && !field744) {
            class300 var1 = Statics.field2775;
            int var2 = Statics.field929.field1200;
            class261.field3065 = 1;
            Statics.field1487 = var1;
            Statics.field1780 = arg0;
            Statics.field3066 = 0;
            Statics.field959 = var2;
            Statics.field949 = false;
            Statics.field3067 = 2;
        }
        field716 = arg0;
    }

    @ObfuscatedName("li.fm(III)V")
    public static void method5269(int arg0, int arg1) {
        if (Statics.field929.field1200 != 0 && arg0 != -1) {
            class261.method2841(Statics.field1260, arg0, 0, Statics.field929.field1200, false);
            field744 = true;
        }
    }

    @ObfuscatedName("bv.fx(I)V")
    public static final void method1871() {
        if (!Statics.field312) {
            return;
        }
        if (Statics.field1252 != null) {
            Statics.field1252.method5805();
        }
        for (int var0 = 0; var0 < class96.field1246; var0++) {
            class83 var1 = field653[class96.field1250[var0]];
            var1.method2071();
        }
        Statics.field312 = false;
    }

    @ObfuscatedName("dp.fw(B)V")
    public static final void method2544() {
        if (!Statics.field1471) {
            return;
        }
        for (int var0 = 0; var0 < class96.field1246; var0++) {
            class83 var1 = field653[class96.field1250[var0]];
            var1.method2084();
        }
        Statics.field1471 = false;
    }

    @ObfuscatedName("eh.gn(I)V")
    public static final void method2731() {
        if (Statics.field110 == field571) {
            return;
        }
        field571 = Statics.field110;
        int var0 = Statics.field110;
        int[] var1 = Statics.field176.field4571;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class75.field962[var0][var6][var4] & 0x18) == 0) {
                    Statics.field24.method3695(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class75.field962[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field24.method3695(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field176.method7042();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class75.field962[var0][var10][var9] & 0x18) == 0) {
                    method652(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class75.field962[var0 + 1][var10][var9] & 0x8) != 0) {
                    method652(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field697 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field24.method3663(Statics.field110, var11, var12);
                if (var13 != 0L) {
                    int var15 = class205.method2352(var13);
                    int var16 = class180.method2760(var15).field1980;
                    if (var16 >= 0 && class164.method2044(var16).field1760) {
                        field669[field697] = class164.method2044(var16).method2886(false);
                        field710[field697] = var11;
                        field581[field697] = var12;
                        field697++;
                    }
                }
            }
        }
        Statics.field107.method7010();
    }

    @ObfuscatedName("lw.gf(Ljm;IIS)V")
    public static final void method5261(class281 arg0, int arg1, int arg2) {
        if (field512 != 0 && field512 != 3 || field522 || !(class33.field234 == 1 || !Statics.field1666 && class33.field234 == 4)) {
            return;
        }
        class275 var3 = arg0.method4897(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field235 - arg1;
        int var5 = class33.field236 - arg2;
        if (!var3.method4822(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3183 / 2;
        int var7 = var5 - var3.field3179 / 2;
        int var8 = field499 & 0x7FF;
        int var9 = class194.field2276[var8];
        int var10 = class194.field2271[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field4070.field1130 + var11 >> 7;
        int var14 = Statics.field4070.field1090 - var12 >> 7;
        class255 var15 = Statics.method3174(class253.field2861, field690.field1286);
        var15.field2930.method6841(18);
        var15.field2930.method6841(class24.field156[82] ? (class24.field156[81] ? 2 : 1) : 0);
        var15.field2930.method6801(Statics.field1240 + var14);
        var15.field2930.method6657(Statics.field1533 + var13);
        var15.field2930.method6841(var6);
        var15.field2930.method6841(var7);
        var15.field2930.method6654(field499);
        var15.field2930.method6841(57);
        var15.field2930.method6841(0);
        var15.field2930.method6841(0);
        var15.field2930.method6841(89);
        var15.field2930.method6654(Statics.field4070.field1130);
        var15.field2930.method6654(Statics.field4070.field1090);
        var15.field2930.method6841(63);
        field690.method2328(var15);
        field502 = var13;
        field678 = var14;
    }

    @ObfuscatedName("cb.gv(I)V")
    public static final void method2224() {
        int[] var0 = class96.field1250;
        for (int var1 = 0; var1 < class96.field1246; var1++) {
            class83 var2 = field653[var0[var1]];
            if (var2 != null && var2.field1106 > 0) {
                var2.field1106--;
                if (var2.field1106 == 0) {
                    var2.field1126 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field519; var3++) {
            int var4 = field520[var3];
            class91 var5 = field699[var4];
            if (var5 != null && var5.field1106 > 0) {
                var5.field1106--;
                if (var5.field1106 == 0) {
                    var5.field1126 = null;
                }
            }
        }
    }

    @ObfuscatedName("gv.gj(Ljava/lang/String;I)V")
    public static final void method3418(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field929.field1194 = !Statics.field929.field1194;
            class89.method2604();
            if (Statics.field929.field1194) {
                class98.method3622(99, "", "Roofs are now all hidden");
            } else {
                class98.method3622(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field488 = !field488;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field596 = !field596;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field575 = !field575;
        }
        if (field547 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1262.field4361 = !Statics.field1262.field4361;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field488 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field488 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2288();
            }
        }
        class255 var1 = Statics.method3174(class253.field2847, field690.field1286);
        var1.field2930.method6841(arg0.length() + 1);
        var1.field2930.method6660(arg0);
        field690.method2328(var1);
    }

    @ObfuscatedName("bm.gm(I)V")
    public static final void method1083() {
        method13(Statics.field1499, Statics.field1434, Statics.field244);
        method1933(Statics.field1616, Statics.field461);
        if (Statics.field1499 != Statics.field1318 || Statics.field3166 != Statics.field1434 || Statics.field244 != Statics.field1339 || Statics.field1616 != Statics.field1323 || Statics.field461 != Statics.field4247) {
            return;
        }
        field725 = false;
        field724 = false;
        Statics.field3194 = 0;
        Statics.field3151 = 0;
        Statics.field3952 = 0;
        Statics.field2756 = 0;
        Statics.field957 = 0;
        Statics.field2013 = 0;
        Statics.field2359 = 0;
        Statics.field1812 = 0;
        Statics.field1749 = 0;
        Statics.field1336 = 0;
    }

    @ObfuscatedName("b.gw(IIII)V")
    public static final void method13(int arg0, int arg1, int arg2) {
        if (Statics.field1318 < arg0) {
            Statics.field1318 += Statics.field2013 * (arg0 - Statics.field1318) / 1000 + Statics.field2359;
            if (Statics.field1318 > arg0) {
                Statics.field1318 = arg0;
            }
        }
        if (Statics.field1318 > arg0) {
            Statics.field1318 -= Statics.field2013 * (Statics.field1318 - arg0) / 1000 + Statics.field2359;
            if (Statics.field1318 < arg0) {
                Statics.field1318 = arg0;
            }
        }
        if (Statics.field3166 < arg1) {
            Statics.field3166 += Statics.field2013 * (arg1 - Statics.field3166) / 1000 + Statics.field2359;
            if (Statics.field3166 > arg1) {
                Statics.field3166 = arg1;
            }
        }
        if (Statics.field3166 > arg1) {
            Statics.field3166 -= Statics.field2013 * (Statics.field3166 - arg1) / 1000 + Statics.field2359;
            if (Statics.field3166 < arg1) {
                Statics.field3166 = arg1;
            }
        }
        if (Statics.field1339 < arg2) {
            Statics.field1339 += Statics.field2013 * (arg2 - Statics.field1339) / 1000 + Statics.field2359;
            if (Statics.field1339 > arg2) {
                Statics.field1339 = arg2;
            }
        }
        if (Statics.field1339 > arg2) {
            Statics.field1339 -= Statics.field2013 * (Statics.field1339 - arg2) / 1000 + Statics.field2359;
            if (Statics.field1339 < arg2) {
                Statics.field1339 = arg2;
            }
        }
    }

    @ObfuscatedName("bh.ge(III)V")
    public static final void method1933(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1323 < arg0) {
            Statics.field1323 += Statics.field957 * (arg0 - Statics.field1323) / 1000 + Statics.field2756;
            if (Statics.field1323 > arg0) {
                Statics.field1323 = arg0;
            }
        }
        if (Statics.field1323 > arg0) {
            Statics.field1323 -= Statics.field957 * (Statics.field1323 - arg0) / 1000 + Statics.field2756;
            if (Statics.field1323 < arg0) {
                Statics.field1323 = arg0;
            }
        }
        int var2 = arg1 - Statics.field4247;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field4247 += Statics.field957 * var2 / 1000 + Statics.field2756;
            Statics.field4247 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field4247 -= Statics.field957 * -var2 / 1000 + Statics.field2756;
            Statics.field4247 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field4247;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field4247 = arg1;
        }
    }

    @ObfuscatedName("mf.gx(I)V")
    public static final void method5687() {
        int var0 = class96.field1246;
        int[] var1 = class96.field1250;
        for (int var2 = 0; var2 < var0; var2++) {
            class83 var3 = field653[var1[var2]];
            if (var3 != null) {
                method3425(var3, 1);
            }
        }
    }

    @ObfuscatedName("y.gs(I)V")
    public static final void method398() {
        for (int var0 = 0; var0 < field519; var0++) {
            int var1 = field520[var0];
            class91 var2 = field699[var1];
            if (var2 != null) {
                method3425(var2, var2.field1215.field1839);
            }
        }
    }

    @ObfuscatedName("gw.gu(Lcy;II)V")
    public static final void method3425(class85 arg0, int arg1) {
        if (arg0.field1137 >= field481) {
            int var2 = Math.max(1, arg0.field1137 - field481);
            int var3 = arg0.field1133 * 128 + arg0.field1121 * 64;
            int var4 = arg0.field1135 * 128 + arg0.field1121 * 64;
            arg0.field1130 += (var3 - arg0.field1130) / var2;
            arg0.field1090 += (var4 - arg0.field1090) / var2;
            arg0.field1118 = 0;
            arg0.field1140 = arg0.field1139;
        } else if (arg0.field1158 >= field481) {
            method285(arg0);
        } else {
            arg0.field1104 = arg0.field1095;
            if (arg0.field1151 == 0) {
                arg0.field1118 = 0;
            } else {
                label328: {
                    if (arg0.field1103 != -1 && arg0.field1148 == 0) {
                        class183 var5 = class183.method2402(arg0.field1103);
                        if (arg0.field1099 > 0 && var5.field2097 == 0) {
                            arg0.field1118++;
                            break label328;
                        }
                        if (arg0.field1099 <= 0 && var5.field2098 == 0) {
                            arg0.field1118++;
                            break label328;
                        }
                    }
                    int var6 = arg0.field1130;
                    int var7 = arg0.field1090;
                    int var8 = arg0.field1152[arg0.field1151 - 1] * 128 + arg0.field1121 * 64;
                    int var9 = arg0.field1153[arg0.field1151 - 1] * 128 + arg0.field1121 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1140 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1140 = 1792;
                        } else {
                            arg0.field1140 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1140 = 768;
                        } else if (var7 > var9) {
                            arg0.field1140 = 256;
                        } else {
                            arg0.field1140 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1140 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1140 = 0;
                    }
                    class186 var10 = arg0.field1154[arg0.field1151 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1140 - arg0.field1111 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1143;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1098;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1091;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1100;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1098;
                        }
                        arg0.field1104 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class91) {
                            var14 = ((class91) arg0).field1215.field1867;
                        }
                        if (var14) {
                            if (arg0.field1140 != arg0.field1111 && arg0.field1156 == -1 && arg0.field1150 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1151 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1151 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1118 > 0 && arg0.field1151 > 1) {
                                var13 = 8;
                                arg0.field1118--;
                            }
                        } else {
                            if (arg0.field1151 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1151 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1118 > 0 && arg0.field1151 > 1) {
                                var13 = 8;
                                arg0.field1118--;
                            }
                        }
                        if (class186.field2123 == var10) {
                            var13 <<= 0x1;
                        } else if (class186.field2121 == var10) {
                            var13 >>= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1104 == arg0.field1098 && arg0.field1102 != -1) {
                            arg0.field1104 = arg0.field1102;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1130 += var13;
                                if (arg0.field1130 > var8) {
                                    arg0.field1130 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1130 -= var13;
                                if (arg0.field1130 < var8) {
                                    arg0.field1130 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1090 += var13;
                                if (arg0.field1090 > var9) {
                                    arg0.field1090 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1090 -= var13;
                                if (arg0.field1090 < var9) {
                                    arg0.field1090 = var9;
                                }
                            }
                        }
                        if (arg0.field1130 == var8 && arg0.field1090 == var9) {
                            arg0.field1151--;
                            if (arg0.field1099 > 0) {
                                arg0.field1099--;
                            }
                        }
                    } else {
                        arg0.field1130 = var8;
                        arg0.field1090 = var9;
                        arg0.field1151--;
                        if (arg0.field1099 > 0) {
                            arg0.field1099--;
                        }
                    }
                }
            }
        }
        if (arg0.field1130 < 128 || arg0.field1090 < 128 || arg0.field1130 >= 13184 || arg0.field1090 >= 13184) {
            arg0.field1103 = -1;
            arg0.field1128 = -1;
            arg0.field1137 = 0;
            arg0.field1158 = 0;
            arg0.field1130 = arg0.field1152[0] * 128 + arg0.field1121 * 64;
            arg0.field1090 = arg0.field1153[0] * 128 + arg0.field1121 * 64;
            arg0.method2126();
        }
        if (Statics.field4070 == arg0 && (arg0.field1130 < 1536 || arg0.field1090 < 1536 || arg0.field1130 >= 11776 || arg0.field1090 >= 11776)) {
            arg0.field1103 = -1;
            arg0.field1128 = -1;
            arg0.field1137 = 0;
            arg0.field1158 = 0;
            arg0.field1130 = arg0.field1152[0] * 128 + arg0.field1121 * 64;
            arg0.field1090 = arg0.field1153[0] * 128 + arg0.field1121 * 64;
            arg0.method2126();
        }
        if (arg0.field1150 != 0) {
            if (arg0.field1156 != -1) {
                class85 var15 = null;
                if (arg0.field1156 < 32768) {
                    var15 = field699[arg0.field1156];
                } else if (arg0.field1156 >= 32768) {
                    var15 = field653[arg0.field1156 - 32768];
                }
                if (var15 != null) {
                    int var16 = arg0.field1130 - var15.field1130;
                    int var17 = arg0.field1090 - var15.field1090;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field1140 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1117) {
                    arg0.field1156 = -1;
                    arg0.field1117 = false;
                }
            }
            if (arg0.field1123 != -1 && (arg0.field1151 == 0 || arg0.field1118 > 0)) {
                arg0.field1140 = arg0.field1123;
                arg0.field1123 = -1;
            }
            int var18 = arg0.field1140 - arg0.field1111 & 0x7FF;
            if (var18 == 0 && arg0.field1117) {
                arg0.field1156 = -1;
                arg0.field1117 = false;
            }
            if (var18 == 0) {
                arg0.field1149 = 0;
            } else {
                arg0.field1149++;
                if (var18 > 1024) {
                    arg0.field1111 -= arg0.field1119 ? var18 : arg0.field1150;
                    boolean var19 = true;
                    if (var18 < arg0.field1150 || var18 > 2048 - arg0.field1150) {
                        arg0.field1111 = arg0.field1140;
                        var19 = false;
                    }
                    if (!arg0.field1119 && arg0.field1104 == arg0.field1095 && (arg0.field1149 > 25 || var19)) {
                        if (arg0.field1146 == -1) {
                            arg0.field1104 = arg0.field1098;
                        } else {
                            arg0.field1104 = arg0.field1146;
                        }
                    }
                } else {
                    arg0.field1111 += arg0.field1119 ? var18 : arg0.field1150;
                    boolean var20 = true;
                    if (var18 < arg0.field1150 || var18 > 2048 - arg0.field1150) {
                        arg0.field1111 = arg0.field1140;
                        var20 = false;
                    }
                    if (!arg0.field1119 && arg0.field1104 == arg0.field1095 && (arg0.field1149 > 25 || var20)) {
                        if (arg0.field1097 == -1) {
                            arg0.field1104 = arg0.field1098;
                        } else {
                            arg0.field1104 = arg0.field1097;
                        }
                    }
                }
                arg0.field1111 &= 0x7FF;
                arg0.field1119 = false;
            }
        }
        method5969(arg0);
    }

    @ObfuscatedName("k.gb(Lcy;I)V")
    public static final void method285(class85 arg0) {
        if (field481 == arg0.field1158 || arg0.field1103 == -1 || arg0.field1148 != 0 || arg0.field1125 + 1 > class183.method2402(arg0.field1103).field2081[arg0.field1124]) {
            int var1 = arg0.field1158 - arg0.field1137;
            int var2 = field481 - arg0.field1137;
            int var3 = arg0.field1133 * 128 + arg0.field1121 * 64;
            int var4 = arg0.field1135 * 128 + arg0.field1121 * 64;
            int var5 = arg0.field1134 * 128 + arg0.field1121 * 64;
            int var6 = arg0.field1136 * 128 + arg0.field1121 * 64;
            arg0.field1130 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1090 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1118 = 0;
        arg0.field1140 = arg0.field1139;
        arg0.field1111 = arg0.field1140;
    }

    @ObfuscatedName("mt.gp(Lcy;I)V")
    public static final void method5969(class85 arg0) {
        arg0.field1092 = false;
        if (arg0.field1104 != -1) {
            class183 var1 = class183.method2402(arg0.field1104);
            if (var1 == null) {
                arg0.field1104 = -1;
            } else if (!var1.method3381() && var1.field2099 != null) {
                arg0.field1122++;
                if (arg0.field1089 < var1.field2099.length && arg0.field1122 > var1.field2081[arg0.field1089]) {
                    arg0.field1122 = 1;
                    arg0.field1089++;
                    method6583(var1, arg0.field1089, arg0.field1130, arg0.field1090);
                }
                if (arg0.field1089 >= var1.field2099.length) {
                    arg0.field1122 = 0;
                    arg0.field1089 = 0;
                    method6583(var1, arg0.field1089, arg0.field1130, arg0.field1090);
                }
            } else if (var1.method3381()) {
                arg0.field1089++;
                int var2 = var1.method3338();
                if (arg0.field1089 < var2) {
                    method2304(var1, arg0.field1089, arg0.field1130, arg0.field1090);
                } else {
                    arg0.field1122 = 0;
                    arg0.field1089 = 0;
                    method2304(var1, arg0.field1089, arg0.field1130, arg0.field1090);
                }
            } else {
                arg0.field1104 = -1;
            }
        }
        if (arg0.field1128 != -1 && field481 >= arg0.field1131) {
            if (arg0.field1129 < 0) {
                arg0.field1129 = 0;
            }
            int var3 = class173.method6501(arg0.field1128).field1885;
            if (var3 == -1) {
                arg0.field1128 = -1;
            } else {
                class183 var4 = class183.method2402(var3);
                if (var4 != null && var4.field2099 != null) {
                    arg0.field1157++;
                    if (arg0.field1129 < var4.field2099.length && arg0.field1157 > var4.field2081[arg0.field1129]) {
                        arg0.field1157 = 1;
                        arg0.field1129++;
                        method6583(var4, arg0.field1129, arg0.field1130, arg0.field1090);
                    }
                    if (arg0.field1129 >= var4.field2099.length && (arg0.field1129 < 0 || arg0.field1129 >= var4.field2099.length)) {
                        arg0.field1128 = -1;
                    }
                } else if (var4.method3381()) {
                    arg0.field1129++;
                    int var5 = var4.method3338();
                    if (arg0.field1129 < var5) {
                        method2304(var4, arg0.field1129, arg0.field1130, arg0.field1090);
                    } else if (arg0.field1129 < 0 || arg0.field1129 >= var5) {
                        arg0.field1128 = -1;
                    }
                } else {
                    arg0.field1128 = -1;
                }
            }
        }
        if (arg0.field1103 != -1 && arg0.field1148 <= 1) {
            class183 var6 = class183.method2402(arg0.field1103);
            if (var6.field2097 == 1 && arg0.field1099 > 0 && arg0.field1137 <= field481 && arg0.field1158 < field481) {
                arg0.field1148 = 1;
                return;
            }
        }
        if (arg0.field1103 != -1 && arg0.field1148 == 0) {
            class183 var7 = class183.method2402(arg0.field1103);
            if (var7 == null) {
                arg0.field1103 = -1;
            } else if (!var7.method3381() && var7.field2099 != null) {
                arg0.field1125++;
                if (arg0.field1124 < var7.field2099.length && arg0.field1125 > var7.field2081[arg0.field1124]) {
                    arg0.field1125 = 1;
                    arg0.field1124++;
                    method6583(var7, arg0.field1124, arg0.field1130, arg0.field1090);
                }
                if (arg0.field1124 >= var7.field2099.length) {
                    arg0.field1124 -= var7.field2089;
                    arg0.field1127++;
                    if (arg0.field1127 >= var7.field2096) {
                        arg0.field1103 = -1;
                    } else if (arg0.field1124 >= 0 && arg0.field1124 < var7.field2099.length) {
                        method6583(var7, arg0.field1124, arg0.field1130, arg0.field1090);
                    } else {
                        arg0.field1103 = -1;
                    }
                }
                arg0.field1092 = var7.field2092;
            } else if (var7.method3381()) {
                arg0.field1124++;
                int var8 = var7.method3339().method2553();
                if (arg0.field1124 < var8) {
                    method2304(var7, arg0.field1124, arg0.field1130, arg0.field1090);
                } else {
                    arg0.field1124 -= var7.field2089;
                    arg0.field1127++;
                    if (arg0.field1127 >= var7.field2096) {
                        arg0.field1103 = -1;
                    } else if (arg0.field1124 >= 0 && arg0.field1124 < var8) {
                        method2304(var7, arg0.field1124, arg0.field1130, arg0.field1090);
                    } else {
                        arg0.field1103 = -1;
                    }
                }
            } else {
                arg0.field1103 = -1;
            }
        }
        if (arg0.field1148 > 0) {
            arg0.field1148--;
        }
    }

    @ObfuscatedName("hh.gq(I)V")
    public static void method4016() {
        if (Statics.field1262 != null) {
            Statics.field1262.method6215(Statics.field110, (Statics.field4070.field1130 >> 7) + Statics.field1533, (Statics.field4070.field1090 >> 7) + Statics.field1240, false);
            Statics.field1262.method6203();
        }
    }

    @ObfuscatedName("dw.gi(Lck;IIB)V")
    public static void method2601(class83 arg0, int arg1, int arg2) {
        if (arg0.field1103 == arg1 && arg1 != -1) {
            int var3 = class183.method2402(arg1).field2079;
            if (var3 == 1) {
                arg0.field1124 = 0;
                arg0.field1125 = 0;
                arg0.field1148 = arg2;
                arg0.field1127 = 0;
            }
            if (var3 == 2) {
                arg0.field1127 = 0;
            }
        } else if (arg1 == -1 || arg0.field1103 == -1 || class183.method2402(arg1).field2093 >= class183.method2402(arg0.field1103).field2093) {
            arg0.field1103 = arg1;
            arg0.field1124 = 0;
            arg0.field1125 = 0;
            arg0.field1148 = arg2;
            arg0.field1127 = 0;
            arg0.field1099 = arg0.field1151;
        }
    }

    @ObfuscatedName("gl.gt(IB)V")
    public static void method3829(int arg0) {
        field515 = 0L;
        if (arg0 >= 2) {
            field695 = true;
        } else {
            field695 = false;
        }
        if (Statics.method2724() == 1) {
            Statics.field3795.method459(765, 503);
        } else {
            Statics.field3795.method459(7680, 2160);
        }
        if (field478 < 25) {
            return;
        }
        class255 var1 = Statics.method3174(class253.field2825, field690.field1286);
        var1.field2930.method6841(Statics.method2724());
        var1.field2930.method6654(Statics.field2137);
        var1.field2930.method6654(Statics.field2535);
        field690.method2328(var1);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method466() {
        field515 = class416.method5860() + 500L;
        this.method1584();
        if (field637 != -1) {
            this.method1101(true);
        }
    }

    @ObfuscatedName("client.gh(B)V")
    public void method1584() {
        int var1 = Statics.field2137;
        int var2 = Statics.field2535;
        if (this.field184 < var1) {
            int var3 = this.field184;
        }
        if (this.field195 < var2) {
            int var4 = this.field195;
        }
        if (Statics.field929 == null) {
            return;
        }
        try {
            client var5 = Statics.field3795;
            Object[] var6 = new Object[] { Statics.method2724() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gg(I)V")
    public final void method1096() {
        if (field637 != -1) {
            method1868(field637);
        }
        for (int var1 = 0; var1 < field684; var1++) {
            if (field505[var1]) {
                field687[var1] = true;
            }
            field688[var1] = field505[var1];
            field505[var1] = false;
        }
        field685 = field481;
        field626 = -1;
        field627 = -1;
        Statics.field2067 = null;
        if (field637 != -1) {
            field684 = 0;
            method183(field637, 0, 0, Statics.field2137, Statics.field2535, 0, 0, -1);
        }
        class428.method6934();
        if (field582) {
            if (field558 == 1) {
                Statics.field1325[field555 / 100].method7120(field628 - 8, field579 - 8);
            }
            if (field558 == 2) {
                Statics.field1325[field555 / 100 + 4].method7120(field628 - 8, field579 - 8);
            }
        }
        if (field522) {
            method22();
        } else if (field626 != -1) {
            method5707(field626, field627);
        }
        if (field693 == 3) {
            for (int var2 = 0; var2 < field684; var2++) {
                if (field688[var2]) {
                    class428.method6942(field625[var2], field471[var2], field592[var2], field692[var2], 16711935, 128);
                } else if (field687[var2]) {
                    class428.method6942(field625[var2], field471[var2], field592[var2], field692[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field110;
        int var4 = Statics.field4070.field1130;
        int var5 = Statics.field4070.field1090;
        int var6 = field539;
        for (class63 var7 = (class63) class63.field802.method5301(); var7 != null; var7 = (class63) class63.field802.method5303()) {
            if (var7.field800 != -1 || var7.field799 != null) {
                int var8 = 0;
                if (var4 > var7.field803) {
                    var8 += var4 - var7.field803;
                } else if (var4 < var7.field793) {
                    var8 += var7.field793 - var4;
                }
                if (var5 > var7.field795) {
                    var8 += var5 - var7.field795;
                } else if (var5 < var7.field791) {
                    var8 += var7.field791 - var5;
                }
                if (var8 - 64 > var7.field794 || Statics.field929.field1202 == 0 || var7.field789 != var3) {
                    if (var7.field788 != null) {
                        Statics.field3373.method659(var7.field788);
                        var7.field788 = null;
                    }
                    if (var7.field801 != null) {
                        Statics.field3373.method659(var7.field801);
                        var7.field801 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = Statics.field929.field1202 * (var7.field794 - var8) / var7.field794;
                    class37 var10000;
                    if (var7.field788 != null) {
                        var7.field788.method813(var9);
                    } else if (var7.field800 >= 0) {
                        var10000 = (class37) null;
                        class37 var10 = class37.method695(Statics.field152, var7.field800, 0);
                        if (var10 != null) {
                            class38 var11 = var10.method696().method710(Statics.field2524);
                            class45 var12 = class45.method809(var11, 100, var9);
                            var12.method812(-1);
                            Statics.field3373.method658(var12);
                            var7.field788 = var12;
                        }
                    }
                    if (var7.field801 != null) {
                        var7.field801.method813(var9);
                        if (!var7.field801.method6164()) {
                            var7.field801 = null;
                        }
                    } else if (var7.field799 != null && (var7.field790 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field799.length);
                        var10000 = (class37) null;
                        class37 var14 = class37.method695(Statics.field152, var7.field799[var13], 0);
                        if (var14 != null) {
                            class38 var15 = var14.method696().method710(Statics.field2524);
                            class45 var16 = class45.method809(var15, 100, var9);
                            var16.method812(0);
                            Statics.field3373.method658(var16);
                            var7.field801 = var16;
                            var7.field790 = var7.field797 + (int) (Math.random() * (double) (var7.field798 - var7.field797));
                        }
                    }
                }
            }
        }
        field539 = 0;
    }

    @ObfuscatedName("ke.gl(Ljava/lang/String;ZB)V")
    public static final void method5000(String arg0, boolean arg1) {
        if (!field645) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1386.method5458(arg0, 250);
        int var6 = Statics.field1386.method5482(arg0, 250) * 13;
        class428.method6943(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class428.method6994(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1386.method5466(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method116(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field107.method452(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field684; var11++) {
            if (field625[var11] + field592[var11] > var7 && field625[var11] < var7 + var9 && field692[var11] + field471[var11] > var8 && field471[var11] < var8 + var10) {
                field687[var11] = true;
            }
        }
    }

    @ObfuscatedName("ky.gr(IIIIB)V")
    public static final void method4974(int arg0, int arg1, int arg2, int arg3) {
        field593++;
        Statics.method656();
        method83();
        if (field604 >= 0 && field653[field604] != null) {
            method5868(field653[field604], false);
        }
        method640(true);
        int var4 = class96.field1246;
        int[] var5 = class96.field1250;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field604 != var5[var6] && field594 != var5[var6]) {
                method5868(field653[var5[var6]], true);
            }
        }
        method640(false);
        for (class70 var7 = (class70) field655.method5301(); var7 != null; var7 = (class70) field655.method5303()) {
            if (Statics.field110 != var7.field925 || field481 > var7.field904) {
                var7.method6163();
            } else if (field481 >= var7.field903) {
                if (var7.field907 > 0) {
                    class91 var8 = field699[var7.field907 - 1];
                    if (var8 != null && var8.field1130 >= 0 && var8.field1130 < 13312 && var8.field1090 >= 0 && var8.field1090 < 13312) {
                        var7.method1910(var8.field1130, var8.field1090, method3822(var8.field1130, var8.field1090, var7.field925) - var7.field902, field481);
                    }
                }
                if (var7.field907 < 0) {
                    int var9 = -var7.field907 - 1;
                    class83 var10;
                    if (field594 == var9) {
                        var10 = Statics.field4070;
                    } else {
                        var10 = field653[var9];
                    }
                    if (var10 != null && var10.field1130 >= 0 && var10.field1130 < 13312 && var10.field1090 >= 0 && var10.field1090 < 13312) {
                        var7.method1910(var10.field1130, var10.field1090, method3822(var10.field1130, var10.field1090, var7.field925) - var7.field902, field481);
                    }
                }
                var7.method1911(field539);
                Statics.field24.method3703(Statics.field110, (int) var7.field897, (int) var7.field910, (int) var7.field911, 60, var7, var7.field917, -1L, false);
            }
        }
        method648();
        method4389(arg0, arg1, arg2, arg3, true);
        int var11 = field739;
        int var12 = field740;
        int var13 = field609;
        int var14 = field731;
        class428.method6935(var11, var12, var11 + var13, var12 + var14);
        class194.method3544();
        int var15 = field477;
        if (field563 / 256 > var15) {
            var15 = field563 / 256;
        }
        if (field726[4] && field680[4] + 128 > var15) {
            var15 = field680[4] + 128;
        }
        int var16 = field499 & 0x7FF;
        Statics.method47(Statics.field28, Statics.field232, Statics.field1105, var15, var16, method2716(var15), var14);
        int var17;
        if (field724) {
            var17 = method2395();
        } else {
            var17 = method4422();
        }
        int var18 = Statics.field1318;
        int var19 = Statics.field3166;
        int var20 = Statics.field1339;
        int var21 = Statics.field1323;
        int var22 = Statics.field4247;
        for (int var23 = 0; var23 < 5; var23++) {
            if (field726[var23]) {
                int var24 = (int) (Math.random() * (double) (field727[var23] * 2 + 1) - (double) field727[var23] + Math.sin((double) field619[var23] / 100.0D * (double) field730[var23]) * (double) field680[var23]);
                if (var23 == 0) {
                    Statics.field1318 += var24;
                }
                if (var23 == 1) {
                    Statics.field3166 += var24;
                }
                if (var23 == 2) {
                    Statics.field1339 += var24;
                }
                if (var23 == 3) {
                    Statics.field4247 = Statics.field4247 + var24 & 0x7FF;
                }
                if (var23 == 4) {
                    Statics.field1323 += var24;
                    if (Statics.field1323 < 128) {
                        Statics.field1323 = 128;
                    }
                    if (Statics.field1323 > 383) {
                        Statics.field1323 = 383;
                    }
                }
            }
        }
        int var25 = class33.field227;
        int var26 = class33.field228;
        if (class33.field234 != 0) {
            var25 = class33.field235;
            var26 = class33.field236;
        }
        if (var25 >= var11 && var25 < var11 + var13 && var26 >= var12 && var26 < var12 + var14) {
            int var27 = var25 - var11;
            int var28 = var26 - var12;
            class205.field2500 = var27;
            class205.field2501 = var28;
            class205.field2499 = true;
            class205.field2507 = 0;
            class205.field2502 = false;
        } else {
            class205.method2629();
        }
        method2758();
        class428.method6943(var11, var12, var13, var14, 0);
        method2758();
        int var29 = class194.field2268;
        class194.field2268 = field721;
        Statics.field24.method3675(Statics.field1318, Statics.field3166, Statics.field1339, Statics.field1323, Statics.field4247, var17);
        class194.field2268 = var29;
        method2758();
        Statics.field24.method3648();
        field564 = 0;
        boolean var30 = false;
        int var31 = -1;
        int var32 = -1;
        int var33 = class96.field1246;
        int[] var34 = class96.field1250;
        for (int var35 = 0; var35 < field519 + var33; var35++) {
            class85 var36;
            if (var35 < var33) {
                var36 = field653[var34[var35]];
                if (field604 == var34[var35]) {
                    var30 = true;
                    var31 = var35;
                    continue;
                }
                if (Statics.field4070 == var36) {
                    var32 = var35;
                    continue;
                }
            } else {
                var36 = field699[field520[var35 - var33]];
            }
            method2756(var36, var35, var11, var12, var13, var14);
        }
        if (field596 && var32 != -1) {
            method2756(Statics.field4070, var32, var11, var12, var13, var14);
        }
        if (var30) {
            method2756(field653[field604], var31, var11, var12, var13, var14);
        }
        for (int var37 = 0; var37 < field564; var37++) {
            int var38 = field566[var37];
            int var39 = field567[var37];
            int var40 = field468[var37];
            int var41 = field568[var37];
            boolean var42 = true;
            while (var42) {
                var42 = false;
                for (int var43 = 0; var43 < var37; var43++) {
                    if (var39 + 2 > field567[var43] - field568[var43] && var39 - var41 < field567[var43] + 2 && var38 - var40 < field566[var43] + field468[var43] && var38 + var40 > field566[var43] - field468[var43] && field567[var43] - field568[var43] < var39) {
                        var39 = field567[var43] - field568[var43];
                        var42 = true;
                    }
                }
            }
            field576 = field566[var37];
            field589 = field567[var37] = var39;
            String var44 = field663[var37];
            if (field641 == 0) {
                int var45 = 16776960;
                if (field570[var37] < 6) {
                    var45 = field750[field570[var37]];
                }
                if (field570[var37] == 6) {
                    var45 = field593 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field570[var37] == 7) {
                    var45 = field593 % 20 < 10 ? 255 : 65535;
                }
                if (field570[var37] == 8) {
                    var45 = field593 % 20 < 10 ? 45056 : 8454016;
                }
                if (field570[var37] == 9) {
                    int var46 = 150 - field705[var37];
                    if (var46 < 50) {
                        var45 = var46 * 1280 + 16711680;
                    } else if (var46 < 100) {
                        var45 = 16776960 - (var46 - 50) * 327680;
                    } else if (var46 < 150) {
                        var45 = (var46 - 100) * 5 + 65280;
                    }
                }
                if (field570[var37] == 10) {
                    int var47 = 150 - field705[var37];
                    if (var47 < 50) {
                        var45 = var47 * 5 + 16711680;
                    } else if (var47 < 100) {
                        var45 = 16711935 - (var47 - 50) * 327680;
                    } else if (var47 < 150) {
                        var45 = (var47 - 100) * 327680 + 255 - (var47 - 100) * 5;
                    }
                }
                if (field570[var37] == 11) {
                    int var48 = 150 - field705[var37];
                    if (var48 < 50) {
                        var45 = 16777215 - var48 * 327685;
                    } else if (var48 < 100) {
                        var45 = (var48 - 50) * 327685 + 65280;
                    } else if (var48 < 150) {
                        var45 = 16777215 - (var48 - 100) * 327680;
                    }
                }
                if (field704[var37] == 0) {
                    Statics.field1559.method5454(var44, field576 + var11, field589 + var12, var45, 0);
                }
                if (field704[var37] == 1) {
                    Statics.field1559.method5467(var44, field576 + var11, field589 + var12, var45, 0, field593);
                }
                if (field704[var37] == 2) {
                    Statics.field1559.method5480(var44, field576 + var11, field589 + var12, var45, 0, field593);
                }
                if (field704[var37] == 3) {
                    Statics.field1559.method5469(var44, field576 + var11, field589 + var12, var45, 0, field593, 150 - field705[var37]);
                }
                if (field704[var37] == 4) {
                    int var49 = (150 - field705[var37]) * (Statics.field1559.method5487(var44) + 100) / 150;
                    class428.method6973(field576 + var11 - 50, var12, field576 + var11 + 50, var12 + var14);
                    Statics.field1559.method5462(var44, field576 + var11 + 50 - var49, field589 + var12, var45, 0);
                    class428.method6935(var11, var12, var11 + var13, var12 + var14);
                }
                if (field704[var37] == 5) {
                    int var50 = 150 - field705[var37];
                    int var51 = 0;
                    if (var50 < 25) {
                        var51 = var50 - 25;
                    } else if (var50 > 125) {
                        var51 = var50 - 125;
                    }
                    class428.method6973(var11, field589 + var12 - Statics.field1559.field3989 - 1, var11 + var13, field589 + var12 + 5);
                    Statics.field1559.method5454(var44, field576 + var11, field589 + var12 + var51, var45, 0);
                    class428.method6935(var11, var12, var11 + var13, var12 + var14);
                }
            } else {
                Statics.field1559.method5454(var44, field576 + var11, field589 + var12, 16776960, 0);
            }
        }
        method4988(var11, var12);
        ((class202) Statics.field2273).method3838(field539);
        method5658(var11, var12, var13, var14);
        Statics.field1318 = var18;
        Statics.field3166 = var19;
        Statics.field1339 = var20;
        Statics.field1323 = var21;
        Statics.field4247 = var22;
        if (field480 && class303.method206(true, false) == 0) {
            field480 = false;
        }
        if (field480) {
            class428.method6943(var11, var12, var13, var14, 0);
            method5000(class295.field3480, false);
        }
    }

    @ObfuscatedName("hb.gc(IIIIZI)V")
    public static final void method4389(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field691;
        } else if (var5 >= 100) {
            var6 = field708;
        } else {
            var6 = (field708 - field691) * var5 / 100 + field691;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field737) {
            short var8 = field737;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field736) {
                var6 = field736;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class428.method6934();
                    class428.method6943(arg0, arg1, var10, arg3, -16777216);
                    class428.method6943(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field738) {
            short var11 = field738;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field620) {
                var6 = field620;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class428.method6934();
                    class428.method6943(arg0, arg1, arg2, var13, -16777216);
                    class428.method6943(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field721 = arg3 * var6 / 334;
        if (field609 != arg2 || field731 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method2716(var16);
                int var18 = class194.field2276[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field734 - field733) * var19 / 100 + field733;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class197.method3669(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field739 = arg0;
        field740 = arg1;
        field609 = arg2;
        field731 = arg3;
    }

    @ObfuscatedName("r.gz(B)V")
    public static void method83() {
        if (field596) {
            method5868(Statics.field4070, false);
        }
    }

    @ObfuscatedName("mp.ga(Lck;ZB)V")
    public static void method5868(class83 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2080() || arg0.field1067) {
            return;
        }
        arg0.field1065 = false;
        if ((field473 && class96.field1246 > 50 || class96.field1246 > 200) && arg1 && arg0.field1104 == arg0.field1095) {
            arg0.field1065 = true;
        }
        int var2 = arg0.field1130 >> 7;
        int var3 = arg0.field1090 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class205.method1932(0, 0, 0, false, arg0.field1069);
        if (arg0.field1047 != null && field481 >= arg0.field1053 && field481 < arg0.field1051) {
            arg0.field1065 = false;
            arg0.field1054 = method3822(arg0.field1130, arg0.field1090, Statics.field110);
            arg0.field1094 = field481;
            Statics.field24.method3692(Statics.field110, arg0.field1130, arg0.field1090, arg0.field1054, 60, arg0, arg0.field1111, var4, arg0.field1061, arg0.field1062, arg0.field1063, arg0.field1050);
            return;
        }
        if ((arg0.field1130 & 0x7F) == 64 && (arg0.field1090 & 0x7F) == 64) {
            if (field593 == field485[var2][var3]) {
                return;
            }
            field485[var2][var3] = field593;
        }
        arg0.field1054 = method3822(arg0.field1130, arg0.field1090, Statics.field110);
        arg0.field1094 = field481;
        Statics.field24.method3703(Statics.field110, arg0.field1130, arg0.field1090, arg0.field1054, 60, arg0, arg0.field1111, var4, arg0.field1092);
    }

    @ObfuscatedName("az.gk(ZI)V")
    public static final void method640(boolean arg0) {
        for (int var1 = 0; var1 < field519; var1++) {
            class91 var2 = field699[field520[var1]];
            if (var2 != null && var2.method2080() && var2.field1215.field1858 == arg0 && var2.field1215.method3006()) {
                int var3 = var2.field1130 >> 7;
                int var4 = var2.field1090 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1121 == 1 && (var2.field1130 & 0x7F) == 64 && (var2.field1090 & 0x7F) == 64) {
                        if (field593 == field485[var3][var4]) {
                            continue;
                        }
                        field485[var3][var4] = field593;
                    }
                    long var5 = class205.method1932(0, 0, 1, !var2.field1215.field1866, field520[var1]);
                    var2.field1094 = field481;
                    Statics.field24.method3703(Statics.field110, var2.field1130, var2.field1090, method3822(var2.field1130 + (var2.field1121 * 64 - 64), var2.field1090 + (var2.field1121 * 64 - 64), Statics.field110), var2.field1121 * 64 - 64 + 60, var2, var2.field1111, var5, var2.field1092);
                }
            }
        }
    }

    @ObfuscatedName("au.gd(I)V")
    public static final void method648() {
        for (class65 var0 = (class65) field607.method5301(); var0 != null; var0 = (class65) field607.method5303()) {
            if (Statics.field110 != var0.field825 || var0.field834) {
                var0.method6163();
            } else if (field481 >= var0.field838) {
                var0.method1863(field539);
                if (var0.field834) {
                    var0.method6163();
                } else {
                    Statics.field24.method3703(var0.field825, var0.field828, var0.field829, var0.field830, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("ij.hg(I)I")
    public static final int method4422() {
        if (Statics.field929.field1194) {
            return Statics.field110;
        }
        int var0 = 3;
        if (Statics.field1323 < 310) {
            int var1;
            int var2;
            if (field552 == 1) {
                var1 = Statics.field28 >> 7;
                var2 = Statics.field1105 >> 7;
            } else {
                var1 = Statics.field4070.field1130 >> 7;
                var2 = Statics.field4070.field1090 >> 7;
            }
            int var3 = Statics.field1318 >> 7;
            int var4 = Statics.field1339 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field110;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field110;
            }
            if ((class75.field962[Statics.field110][var3][var4] & 0x4) != 0) {
                var0 = Statics.field110;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class75.field962[Statics.field110][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field110;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class75.field962[Statics.field110][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field110;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class75.field962[Statics.field110][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field110;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class75.field962[Statics.field110][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field110;
                        }
                    }
                }
            }
        }
        if (Statics.field4070.field1130 >= 0 && Statics.field4070.field1090 >= 0 && Statics.field4070.field1130 < 13312 && Statics.field4070.field1090 < 13312) {
            if ((class75.field962[Statics.field110][Statics.field4070.field1130 >> 7][Statics.field4070.field1090 >> 7] & 0x4) != 0) {
                var0 = Statics.field110;
            }
            return var0;
        } else {
            return Statics.field110;
        }
    }

    @ObfuscatedName("cm.hj(I)I")
    public static final int method2395() {
        if (Statics.field929.field1194) {
            return Statics.field110;
        } else {
            int var0 = method3822(Statics.field1318, Statics.field1339, Statics.field110);
            return var0 - Statics.field3166 >= 800 || (class75.field962[Statics.field110][Statics.field1318 >> 7][Statics.field1339 >> 7] & 0x4) == 0 ? 3 : Statics.field110;
        }
    }

    @ObfuscatedName("km.hp(IIS)V")
    public static final void method4988(int arg0, int arg1) {
        if (field490 == 2) {
            method5284((field493 - Statics.field1533 << 7) + field496, (field729 - Statics.field1240 << 7) + field497, field495 * 2);
            if (field576 > -1 && field481 % 20 < 10) {
                Statics.field3068[0].method7120(field576 + arg0 - 12, field589 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("lt.hn(B)Z")
    public static boolean method5563() {
        return (field597 & 0x8) != 0;
    }

    @ObfuscatedName("ea.hd(Lcy;IIIIII)V")
    public static final void method2756(class85 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2080()) {
            return;
        }
        if (arg0 instanceof class91) {
            class171 var6 = ((class91) arg0).field1215;
            if (var6.field1838 != null) {
                var6 = var6.method3014();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class96.field1246;
        int[] var8 = class96.field1250;
        byte var9 = 0;
        if (arg1 < var7 && field481 == arg0.field1094) {
            class83 var10 = (class83) arg0;
            boolean var11;
            if (field597 == 0) {
                var11 = false;
            } else if (Statics.field4070 == var10) {
                var11 = method5563();
            } else {
                boolean var12 = Statics.method2843();
                if (!var12) {
                    boolean var13 = (field597 & 0x1) != 0;
                    var12 = var13 && var10.method2067();
                }
                boolean var14 = var12;
                if (!var12) {
                    boolean var15 = (field597 & 0x2) != 0;
                    var14 = var15 && var10.method2120();
                }
                var11 = var14;
            }
            if (var11) {
                class83 var16 = (class83) arg0;
                if (arg1 < var7) {
                    method2868(arg0, arg0.field1113 + 15);
                    class328 var17 = (class328) field529.get(class394.field4375);
                    byte var18 = 9;
                    var17.method5454(var16.field1071.method7187(), field576 + arg2, field589 + arg3 - var18, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var19 = -2;
        if (!arg0.field1109.method5352()) {
            method2868(arg0, arg0.field1113 + 15);
            for (class90 var20 = (class90) arg0.field1109.method5348(); var20 != null; var20 = (class90) arg0.field1109.method5350()) {
                class86 var21 = var20.method2196(field481);
                if (var21 != null) {
                    class167 var22 = var20.field1208;
                    class432 var23 = var22.method2956();
                    class432 var24 = var22.method2940();
                    int var25 = 0;
                    int var26;
                    if (var23 == null || var24 == null) {
                        var26 = var22.field1807;
                    } else {
                        if (var22.field1794 * 2 < var24.field4566) {
                            var25 = var22.field1794;
                        }
                        var26 = var24.field4566 - var25 * 2;
                    }
                    int var27 = 255;
                    boolean var28 = true;
                    int var29 = field481 - var21.field1161;
                    int var30 = var21.field1160 * var26 / var22.field1807;
                    int var33;
                    if (var21.field1162 > var29) {
                        int var31 = var22.field1799 == 0 ? 0 : var29 / var22.field1799 * var22.field1799;
                        int var32 = var21.field1159 * var26 / var22.field1807;
                        var33 = (var30 - var32) * var31 / var21.field1162 + var32;
                    } else {
                        var33 = var30;
                        int var34 = var21.field1162 + var22.field1805 - var29;
                        if (var22.field1804 >= 0) {
                            var27 = (var34 << 8) / (var22.field1805 - var22.field1804);
                        }
                    }
                    if (var21.field1160 > 0 && var33 < 1) {
                        var33 = 1;
                    }
                    if (var23 == null || var24 == null) {
                        var19 += 5;
                        if (field576 > -1) {
                            int var40 = field576 + arg2 - (var26 >> 1);
                            int var41 = field589 + arg3 - var19;
                            class428.method6943(var40, var41, var33, 5, 65280);
                            class428.method6943(var33 + var40, var41, var26 - var33, 5, 16711680);
                        }
                        var19 += 2;
                    } else {
                        int var35;
                        if (var26 == var33) {
                            var35 = var25 * 2 + var33;
                        } else {
                            var35 = var25 + var33;
                        }
                        int var36 = var23.field4567;
                        var19 += var36;
                        int var37 = field576 + arg2 - (var26 >> 1);
                        int var38 = field589 + arg3 - var19;
                        int var39 = var37 - var25;
                        if (var27 >= 0 && var27 < 255) {
                            var23.method7057(var39, var38, var27);
                            class428.method6973(var39, var38, var35 + var39, var36 + var38);
                            var24.method7057(var39, var38, var27);
                        } else {
                            var23.method7120(var39, var38);
                            class428.method6973(var39, var38, var35 + var39, var36 + var38);
                            var24.method7120(var39, var38);
                        }
                        class428.method6935(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var19 += 2;
                    }
                } else if (var20.method2197()) {
                    var20.method6163();
                }
            }
        }
        if (var19 == -2) {
            var19 += 7;
        }
        int var42 = var9 + var19;
        if (arg1 < var7) {
            class83 var43 = (class83) arg0;
            if (var43.field1067) {
                return;
            }
            if (var43.field1048 != -1 || var43.field1049 != -1) {
                method2868(arg0, arg0.field1113 + 15);
                if (field576 > -1) {
                    if (var43.field1048 != -1) {
                        var42 += 25;
                        Statics.field3430[var43.field1048].method7120(field576 + arg2 - 12, field589 + arg3 - var42);
                    }
                    if (var43.field1049 != -1) {
                        var42 += 25;
                        Statics.field3205[var43.field1049].method7120(field576 + arg2 - 12, field589 + arg3 - var42);
                    }
                }
            }
            if (arg1 >= 0 && field490 == 10 && field492 == var8[arg1]) {
                method2868(arg0, arg0.field1113 + 15);
                if (field576 > -1) {
                    int var44 = Statics.field3068[1].field4567 + var42;
                    Statics.field3068[1].method7120(field576 + arg2 - 12, field589 + arg3 - var44);
                }
            }
        } else {
            class171 var45 = ((class91) arg0).field1215;
            if (var45.field1838 != null) {
                var45 = var45.method3014();
            }
            if (var45.field1853 >= 0 && var45.field1853 < Statics.field3205.length) {
                method2868(arg0, arg0.field1113 + 15);
                if (field576 > -1) {
                    Statics.field3205[var45.field1853].method7120(field576 + arg2 - 12, field589 + arg3 - 30);
                }
            }
            if (field490 == 1 && field491 == field520[arg1 - var7] && field481 % 20 < 10) {
                method2868(arg0, arg0.field1113 + 15);
                if (field576 > -1) {
                    Statics.field3068[0].method7120(field576 + arg2 - 12, field589 + arg3 - 28);
                }
            }
        }
        if (arg0.field1126 != null && (arg1 >= var7 || !arg0.field1115 && (field605 == 4 || !arg0.field1116 && (field605 == 0 || field605 == 3 || field605 == 1 && ((class83) arg0).method2067())))) {
            method2868(arg0, arg0.field1113);
            if (field576 > -1 && field564 < field565) {
                field468[field564] = Statics.field1559.method5487(arg0.field1126) / 2;
                field568[field564] = Statics.field1559.field3989;
                field566[field564] = field576;
                field567[field564] = field589;
                field570[field564] = arg0.field1107;
                field704[field564] = arg0.field1108;
                field705[field564] = arg0.field1106;
                field663[field564] = arg0.field1126;
                field564++;
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg0.field1112[var46];
            int var48 = arg0.field1110[var46];
            class179 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field481) {
                    continue;
                }
                var49 = class179.method2431(arg0.field1110[var46]);
                var50 = var49.field1935;
                if (var49 != null && var49.field1929 != null) {
                    var49 = var49.method3140();
                    if (var49 == null) {
                        arg0.field1112[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var51 = arg0.field1155[var46];
            class179 var52 = null;
            if (var51 >= 0) {
                var52 = class179.method2431(var51);
                if (var52 != null && var52.field1929 != null) {
                    var52 = var52.method3140();
                }
            }
            if (var47 - var50 <= field481) {
                if (var49 == null) {
                    arg0.field1112[var46] = -1;
                } else {
                    method2868(arg0, arg0.field1113 / 2);
                    if (field576 > -1) {
                        boolean var53 = true;
                        if (var46 == 1) {
                            field589 -= 20;
                        }
                        if (var46 == 2) {
                            field576 -= 15;
                            field589 -= 10;
                        }
                        if (var46 == 3) {
                            field576 += 15;
                            field589 -= 10;
                        }
                        Object var54 = null;
                        Object var55 = null;
                        Object var56 = null;
                        Object var57 = null;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        class432 var66 = null;
                        class432 var67 = null;
                        class432 var68 = null;
                        class432 var69 = null;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        class432 var79 = var49.method3142();
                        if (var79 != null) {
                            var58 = var79.field4566;
                            int var80 = var79.field4567;
                            if (var80 > var78) {
                                var78 = var80;
                            }
                            var62 = var79.field4572;
                        }
                        class432 var81 = var49.method3143();
                        if (var81 != null) {
                            var59 = var81.field4566;
                            int var82 = var81.field4567;
                            if (var82 > var78) {
                                var78 = var82;
                            }
                            var63 = var81.field4572;
                        }
                        class432 var83 = var49.method3144();
                        if (var83 != null) {
                            var60 = var83.field4566;
                            int var84 = var83.field4567;
                            if (var84 > var78) {
                                var78 = var84;
                            }
                            var64 = var83.field4572;
                        }
                        class432 var85 = var49.method3145();
                        if (var85 != null) {
                            var61 = var85.field4566;
                            int var86 = var85.field4567;
                            if (var86 > var78) {
                                var78 = var86;
                            }
                            var65 = var85.field4572;
                        }
                        if (var52 != null) {
                            var66 = var52.method3142();
                            if (var66 != null) {
                                var70 = var66.field4566;
                                int var87 = var66.field4567;
                                if (var87 > var78) {
                                    var78 = var87;
                                }
                                var74 = var66.field4572;
                            }
                            var67 = var52.method3143();
                            if (var67 != null) {
                                var71 = var67.field4566;
                                int var88 = var67.field4567;
                                if (var88 > var78) {
                                    var78 = var88;
                                }
                                var75 = var67.field4572;
                            }
                            var68 = var52.method3144();
                            if (var68 != null) {
                                var72 = var68.field4566;
                                int var89 = var68.field4567;
                                if (var89 > var78) {
                                    var78 = var89;
                                }
                                var76 = var68.field4572;
                            }
                            var69 = var52.method3145();
                            if (var69 != null) {
                                var73 = var69.field4566;
                                int var90 = var69.field4567;
                                if (var90 > var78) {
                                    var78 = var90;
                                }
                                var77 = var69.field4572;
                            }
                        }
                        class327 var91 = var49.method3170();
                        if (var91 == null) {
                            var91 = Statics.field3887;
                        }
                        class327 var92;
                        if (var52 == null) {
                            var92 = Statics.field3887;
                        } else {
                            var92 = var52.method3170();
                            if (var92 == null) {
                                var92 = Statics.field3887;
                            }
                        }
                        Object var93 = null;
                        String var94 = null;
                        boolean var95 = false;
                        int var96 = 0;
                        String var97 = var49.method3141(arg0.field1101[var46]);
                        int var98 = var91.method5487(var97);
                        if (var52 != null) {
                            var94 = var52.method3141(arg0.field1114[var46]);
                            var96 = var92.method5487(var94);
                        }
                        int var99 = 0;
                        int var100 = 0;
                        if (var59 > 0) {
                            if (var83 == null && var85 == null) {
                                var99 = 1;
                            } else {
                                var99 = var98 / var59 + 1;
                            }
                        }
                        if (var52 != null && var71 > 0) {
                            if (var68 == null && var69 == null) {
                                var100 = 1;
                            } else {
                                var100 = var96 / var71 + 1;
                            }
                        }
                        int var101 = 0;
                        int var102 = var101;
                        if (var58 > 0) {
                            var101 += var58;
                        }
                        var101 += 2;
                        int var103 = var101;
                        if (var60 > 0) {
                            var101 += var60;
                        }
                        int var104 = var101;
                        int var105 = var101;
                        int var107;
                        if (var59 > 0) {
                            int var106 = var59 * var99;
                            var107 = var101 + var106;
                            var105 = (var106 - var98) / 2 + var101;
                        } else {
                            var107 = var98 + var101;
                        }
                        int var108 = var107;
                        if (var61 > 0) {
                            var107 += var61;
                        }
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        int var113 = 0;
                        if (var52 != null) {
                            var107 += 2;
                            var109 = var107;
                            if (var70 > 0) {
                                var107 += var70;
                            }
                            var107 += 2;
                            var110 = var107;
                            if (var72 > 0) {
                                var107 += var72;
                            }
                            var111 = var107;
                            var113 = var107;
                            if (var71 > 0) {
                                int var114 = var71 * var100;
                                var107 += var114;
                                var113 += (var114 - var96) / 2;
                            } else {
                                var107 += var96;
                            }
                            var112 = var107;
                            if (var73 > 0) {
                                var107 += var73;
                            }
                        }
                        int var115 = arg0.field1112[var46] - field481;
                        int var116 = var49.field1930 - var49.field1930 * var115 / var49.field1935;
                        int var117 = var49.field1941 * var115 / var49.field1935 + -var49.field1941;
                        int var118 = field576 + arg2 - (var107 >> 1) + var116;
                        int var119 = field589 + arg3 - 12 + var117;
                        int var120 = var119;
                        int var121 = var78 + var119;
                        int var122 = var49.field1945 + var119 + 15;
                        int var123 = var122 - var91.field3976;
                        int var124 = var91.field3988 + var122;
                        if (var123 < var119) {
                            var120 = var123;
                        }
                        if (var124 > var121) {
                            var121 = var124;
                        }
                        int var125 = 0;
                        if (var52 != null) {
                            var125 = var52.field1945 + var119 + 15;
                            int var126 = var125 - var92.field3976;
                            int var127 = var92.field3988 + var125;
                            if (var126 < var120) {
                                ;
                            }
                            if (var127 > var121) {
                                ;
                            }
                        }
                        int var130 = 255;
                        if (var49.field1944 >= 0) {
                            var130 = (var115 << 8) / (var49.field1935 - var49.field1944);
                        }
                        if (var130 >= 0 && var130 < 255) {
                            if (var79 != null) {
                                var79.method7057(var102 + var118 - var62, var119, var130);
                            }
                            if (var83 != null) {
                                var83.method7057(var103 + var118 - var64, var119, var130);
                            }
                            if (var81 != null) {
                                for (int var131 = 0; var131 < var99; var131++) {
                                    var81.method7057(var59 * var131 + (var104 + var118 - var63), var119, var130);
                                }
                            }
                            if (var85 != null) {
                                var85.method7057(var108 + var118 - var65, var119, var130);
                            }
                            var91.method5463(var97, var105 + var118, var122, var49.field1949, 0, var130);
                            if (var52 != null) {
                                if (var66 != null) {
                                    var66.method7057(var109 + var118 - var74, var119, var130);
                                }
                                if (var68 != null) {
                                    var68.method7057(var110 + var118 - var76, var119, var130);
                                }
                                if (var67 != null) {
                                    for (int var132 = 0; var132 < var100; var132++) {
                                        var67.method7057(var71 * var132 + (var111 + var118 - var75), var119, var130);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method7057(var112 + var118 - var77, var119, var130);
                                }
                                var92.method5463(var94, var113 + var118, var125, var52.field1949, 0, var130);
                            }
                        } else {
                            if (var79 != null) {
                                var79.method7120(var102 + var118 - var62, var119);
                            }
                            if (var83 != null) {
                                var83.method7120(var103 + var118 - var64, var119);
                            }
                            if (var81 != null) {
                                for (int var133 = 0; var133 < var99; var133++) {
                                    var81.method7120(var59 * var133 + (var104 + var118 - var63), var119);
                                }
                            }
                            if (var85 != null) {
                                var85.method7120(var108 + var118 - var65, var119);
                            }
                            var91.method5462(var97, var105 + var118, var122, var49.field1949 | 0xFF000000, 0);
                            if (var52 != null) {
                                if (var66 != null) {
                                    var66.method7120(var109 + var118 - var74, var119);
                                }
                                if (var68 != null) {
                                    var68.method7120(var110 + var118 - var76, var119);
                                }
                                if (var67 != null) {
                                    for (int var134 = 0; var134 < var100; var134++) {
                                        var67.method7120(var71 * var134 + (var111 + var118 - var75), var119);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method7120(var112 + var118 - var77, var119);
                                }
                                var92.method5462(var94, var113 + var118, var125, var52.field1949 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ln.hh(IIIII)V")
    public static final void method5658(int arg0, int arg1, int arg2, int arg3) {
        field591 = 0;
        int var4 = (Statics.field4070.field1130 >> 7) + Statics.field1533;
        int var5 = (Statics.field4070.field1090 >> 7) + Statics.field1240;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field591 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field591 = 1;
        }
        if (field591 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field591 = 0;
        }
    }

    @ObfuscatedName("fb.ho(Lcy;II)V")
    public static final void method2868(class85 arg0, int arg1) {
        method5284(arg0.field1130, arg0.field1090, arg1);
    }

    @ObfuscatedName("lq.ht(IIIB)V")
    public static final void method5284(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field576 = -1;
            field589 = -1;
            return;
        }
        int var3 = method3822(arg0, arg1, Statics.field110) - arg2;
        int var4 = arg0 - Statics.field1318;
        int var5 = var3 - Statics.field3166;
        int var6 = arg1 - Statics.field1339;
        int var7 = class194.field2276[Statics.field1323];
        int var8 = class194.field2271[Statics.field1323];
        int var9 = class194.field2276[Statics.field4247];
        int var10 = class194.field2271[Statics.field4247];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field576 = field721 * var11 / var15 + field609 / 2;
            field589 = field721 * var14 / var15 + field731 / 2;
        } else {
            field576 = -1;
            field589 = -1;
        }
    }

    @ObfuscatedName("gh.hr(IIII)I")
    public static final int method3822(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field962[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field972[var5][var3][var4] + class75.field972[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field972[var5][var3][var4 + 1] + class75.field972[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("i.he(ZLpj;I)V")
    public static final void method387(boolean arg0, class418 arg1) {
        field536 = arg0;
        if (!field536) {
            int var2 = arg1.method6807();
            int var3 = arg1.method6709();
            int var4 = arg1.method6672();
            Statics.field2743 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2743[var5][var6] = arg1.method6675();
                }
            }
            Statics.field3157 = new int[var4];
            Statics.field963 = new int[var4];
            Statics.field57 = new int[var4];
            Statics.field1242 = new byte[var4][];
            Statics.field1748 = new byte[var4][];
            boolean var7 = false;
            if (field527) {
                if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                    var7 = true;
                }
                if (var3 / 8 == 48 && var2 / 8 == 148) {
                    var7 = true;
                }
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field3157[var8] = var11;
                        Statics.field963[var8] = Statics.field1603.method5118("m" + var9 + "_" + var10);
                        Statics.field57[var8] = Statics.field1603.method5118("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method3995(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method6700() == 1;
        int var13 = arg1.method6672();
        int var14 = arg1.method6709();
        int var15 = arg1.method6672();
        arg1.method6621();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6646(1);
                    if (var19 == 1) {
                        field537[var16][var17][var18] = arg1.method6646(26);
                    } else {
                        field537[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6615();
        Statics.field2743 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2743[var20][var21] = arg1.method6675();
            }
        }
        Statics.field3157 = new int[var15];
        Statics.field963 = new int[var15];
        Statics.field57 = new int[var15];
        Statics.field1242 = new byte[var15][];
        Statics.field1748 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field537[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3157[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3157[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field963[var22] = Statics.field1603.method5118("m" + var31 + "_" + var32);
                            Statics.field57[var22] = Statics.field1603.method5118("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method3995(var14, var13, !var12);
    }

    @ObfuscatedName("gd.hu(IIZI)V")
    public static final void method3995(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1278 == arg0 && Statics.field10 == arg1) {
            return;
        }
        Statics.field1278 = arg0;
        Statics.field10 = arg1;
        method3993(25);
        method5000(class295.field3480, true);
        int var3 = Statics.field1533;
        int var4 = Statics.field1240;
        Statics.field1533 = (arg0 - 6) * 8;
        Statics.field1240 = (arg1 - 6) * 8;
        int var5 = Statics.field1533 - var3;
        int var6 = Statics.field1240 - var4;
        int var7 = Statics.field1533;
        int var8 = Statics.field1240;
        for (int var9 = 0; var9 < 32768; var9++) {
            class91 var10 = field699[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1152[var11] -= var5;
                    var10.field1153[var11] -= var6;
                }
                var10.field1130 -= var5 * 128;
                var10.field1090 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class83 var13 = field653[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1152[var14] -= var5;
                    var13.field1153[var14] -= var6;
                }
                var13.field1130 -= var5 * 128;
                var13.field1090 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        field631[var25][var21][var22] = field631[var25][var23][var24];
                    } else {
                        field631[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class84 var26 = (class84) field657.method5301(); var26 != null; var26 = (class84) field657.method5303()) {
            var26.field1078 -= var5;
            var26.field1079 -= var6;
            if (var26.field1078 < 0 || var26.field1079 < 0 || var26.field1078 >= 104 || var26.field1079 >= 104) {
                var26.method6163();
            }
        }
        if (field502 != 0) {
            field502 -= var5;
            field678 -= var6;
        }
        field718 = 0;
        field724 = false;
        Statics.field1318 -= var5 << 7;
        Statics.field1339 -= var6 << 7;
        Statics.field28 -= var5 << 7;
        Statics.field1105 -= var6 << 7;
        field571 = -1;
        field607.method5309();
        field655.method5309();
        for (int var27 = 0; var27 < 4; var27++) {
            field751[var27].method3390();
        }
    }

    @ObfuscatedName("iu.hy(ZI)V")
    public static final void method4524(boolean arg0) {
        method2758();
        field690.field1289++;
        if (field690.field1289 < 50 && !arg0) {
            return;
        }
        field690.field1289 = 0;
        if (field656 || field690.method2334() == null) {
            return;
        }
        class255 var1 = Statics.method3174(class253.field2815, field690.field1286);
        field690.method2328(var1);
        try {
            field690.method2329();
        } catch (IOException var3) {
            field656 = true;
        }
    }

    @ObfuscatedName("au.hc(IIIIIB)V")
    public static final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field24.method3746(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field24.method3794(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class205.method2538(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field176.field4571;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class205.method2352(var5);
            class180 var14 = class180.method2760(var13);
            if (var14.field1992 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class431 var15 = Statics.field2699[var14.field1992];
                if (var15 != null) {
                    int var16 = (var14.field1967 * 4 - var15.field4559) / 2;
                    int var17 = (var14.field1968 * 4 - var15.field4560) / 2;
                    var15.method7018(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field1968) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field24.method3662(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field24.method3794(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class205.method2352(var18);
            class180 var24 = class180.method2760(var23);
            if (var24.field1992 != -1) {
                class431 var25 = Statics.field2699[var24.field1992];
                if (var25 != null) {
                    int var26 = (var24.field1967 * 4 - var25.field4559) / 2;
                    int var27 = (var24.field1968 * 4 - var25.field4560) / 2;
                    var25.method7018(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field1968) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class205.method2538(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field176.field4571;
                int var30 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 512 + 2] = var28;
                    var29[var30 + 3] = var28;
                } else {
                    var29[var30] = var28;
                    var29[var30 + 512 + 1] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1536 + 3] = var28;
                }
            }
        }
        long var31 = Statics.field24.method3663(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class205.method2352(var31);
        class180 var34 = class180.method2760(var33);
        if (var34.field1992 == -1) {
            return;
        }
        class431 var35 = Statics.field2699[var34.field1992];
        if (var35 != null) {
            int var36 = (var34.field1967 * 4 - var35.field4559) / 2;
            int var37 = (var34.field1968 * 4 - var35.field4560) / 2;
            var35.method7018(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field1968) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hf(Lch;I)Z")
    public final boolean method1313(class99 arg0) {
        class356 var2 = arg0.method2334();
        class418 var3 = arg0.field1284;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1285 == null) {
                if (arg0.field1279) {
                    if (!var2.method2816(1)) {
                        return false;
                    }
                    var2.method2813(arg0.field1284.field4477, 0, 1);
                    arg0.field1288 = 0;
                    arg0.field1279 = false;
                }
                var3.field4475 = 0;
                if (var3.method6619()) {
                    if (!var2.method2816(1)) {
                        return false;
                    }
                    var2.method2813(arg0.field1284.field4477, 1, 1);
                    arg0.field1288 = 0;
                }
                arg0.field1279 = true;
                class256[] var4 = class256.method2613();
                int var5 = var3.method6623();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4475);
                }
                arg0.field1285 = var4[var5];
                arg0.field1293 = arg0.field1285.field3029;
            }
            if (arg0.field1293 == -1) {
                if (!var2.method2816(1)) {
                    return false;
                }
                arg0.method2334().method2813(var3.field4477, 0, 1);
                arg0.field1293 = var3.field4477[0] & 0xFF;
            }
            if (arg0.field1293 == -2) {
                if (!var2.method2816(2)) {
                    return false;
                }
                arg0.method2334().method2813(var3.field4477, 0, 2);
                var3.field4475 = 0;
                arg0.field1293 = var3.method6672();
            }
            if (!var2.method2816(arg0.field1293)) {
                return false;
            }
            var3.field4475 = 0;
            var2.method2813(var3.field4477, 0, arg0.field1293);
            arg0.field1288 = 0;
            field528.method5683();
            arg0.field1292 = arg0.field1291;
            arg0.field1291 = arg0.field1290;
            arg0.field1290 = arg0.field1285;
            if (class256.field2979 == arg0.field1285) {
                int var6 = var3.method6711();
                int var7 = var3.method6719();
                int var8 = var3.method6672();
                int var9 = var3.method6711();
                class281 var10 = class281.method1956(var7);
                if (var10.field3277 != var6 || var10.field3278 != var8 || var10.field3362 != var9) {
                    var10.field3277 = var6;
                    var10.field3278 = var8;
                    var10.field3362 = var9;
                    method2020(var10);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3012 == arg0.field1285) {
                int var11 = var3.method6672();
                int var12 = var3.method6781();
                int var13 = var3.method6672();
                method2173(var11, var12, var13);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2953 == arg0.field1285) {
                int var14 = var3.method6719();
                int var15 = var3.method6673();
                class281 var16 = class281.method1956(var14);
                if (var16.field3273 != var15 || var15 == -1) {
                    var16.field3273 = var15;
                    var16.field3358 = 0;
                    var16.field3359 = 0;
                    method2020(var16);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2973 == arg0.field1285) {
                method4817(class254.field2916);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3003 == arg0.field1285) {
                if (Statics.field1343 == null) {
                    Statics.field1343 = new class371(Statics.field4117);
                }
                class427 var17 = Statics.field4117.method6113(var3);
                Statics.field1343.field4222.method6464(var17.field4540, var17.field4538);
                field696[++field735 - 1 & 0x1F] = var17.field4540;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3006 == arg0.field1285) {
                byte var18 = var3.method6846();
                String var19 = var3.method6707();
                long var20 = (long) var3.method6672();
                long var22 = (long) var3.method6674();
                class297 var24 = (class297) class316.method2616(class297.method3054(), var3.method6781());
                long var25 = (var20 << 32) + var22;
                boolean var27 = false;
                Object var28 = null;
                class147 var29 = var18 >= 0 ? field707[var18] : Statics.field1324;
                if (var29 == null) {
                    var27 = true;
                } else {
                    int var30 = 0;
                    while (true) {
                        if (var30 >= 100) {
                            if (var24.field3804 && Statics.field182.method1647(new class440(var19, Statics.field2283))) {
                                var27 = true;
                            }
                            break;
                        }
                        if (field559[var30] == var25) {
                            var27 = true;
                            break;
                        }
                        var30++;
                    }
                }
                if (!var27) {
                    field559[field701] = var25;
                    field701 = (field701 + 1) % 100;
                    String var31 = class328.method5460(class270.method3380(var3));
                    int var32 = var18 >= 0 ? 41 : 44;
                    if (var24.field3798 == -1) {
                        class98.method388(var32, var19, var31, var29.field1642);
                    } else {
                        class98.method388(var32, class92.method4339(var24.field3798) + var19, var31, var29.field1642);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3002 == arg0.field1285) {
                String var33 = var3.method6707();
                Object[] var34 = new Object[var33.length() + 1];
                for (int var35 = var33.length() - 1; var35 >= 0; var35--) {
                    if (var33.charAt(var35) == 's') {
                        var34[var35 + 1] = var3.method6707();
                    } else {
                        var34[var35 + 1] = Integer.valueOf(var3.method6675());
                    }
                }
                var34[0] = Integer.valueOf(var3.method6675());
                class81 var36 = new class81();
                var36.field1031 = var34;
                class64.method4965(var36);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2981 == arg0.field1285) {
                Statics.method2428();
                field722 = var3.method6673();
                field472 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3024 == arg0.field1285) {
                field502 = var3.method6781();
                if (field502 == 255) {
                    field502 = 0;
                }
                field678 = var3.method6781();
                if (field678 == 255) {
                    field678 = 0;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2931 == arg0.field1285) {
                int var37 = var3.method6675();
                int var38 = var3.method6675();
                int var39 = class32.method2726();
                class255 var40 = Statics.method3174(class253.field2891, field690.field1286);
                var40.field2930.method6841(field187);
                var40.field2930.method6651(var39);
                var40.field2930.method6715(var37);
                var40.field2930.method6717(var38);
                field690.method2328(var40);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2956 == arg0.field1285) {
                if (Statics.field1252 != null) {
                    Statics.field1252.method5723(var3);
                }
                method5646();
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2961 == arg0.field1285) {
                int var41 = var3.method6673();
                int var42 = var3.method6675();
                int var43 = var3.method6713();
                class281 var44 = class281.method1956(var42);
                if (var44.field3235 != var41 || var44.field3323 != var43 || var44.field3231 != 0 || var44.field3232 != 0) {
                    var44.field3235 = var41;
                    var44.field3323 = var43;
                    var44.field3231 = 0;
                    var44.field3232 = 0;
                    method2020(var44);
                    this.method1102(var44);
                    if (var44.field3260 == 0) {
                        method2519(Statics.field1043[var42 >> 16], var44, false);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2997 == arg0.field1285) {
                method4817(class254.field2919);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2999 == arg0.field1285) {
                Statics.field1343 = null;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3022 == arg0.field1285) {
                int var45 = arg0.field1293 + var3.field4475;
                int var46 = var3.method6672();
                int var47 = var3.method6672();
                if (field637 != var46) {
                    field637 = var46;
                    this.method1101(false);
                    method2712(field637);
                    class64.method651(field637);
                    for (int var48 = 0; var48 < 100; var48++) {
                        field505[var48] = true;
                    }
                }
                while (var47-- > 0) {
                    int var49 = var3.method6675();
                    int var50 = var3.method6672();
                    int var51 = var3.method6781();
                    class80 var52 = (class80) field638.method6446((long) var49);
                    if (var52 != null && var52.field1014 != var50) {
                        method100(var52, true);
                        var52 = null;
                    }
                    if (var52 == null) {
                        var52 = method1961(var49, var50, var51);
                    }
                    var52.field1015 = true;
                }
                for (class80 var53 = (class80) field638.method6448(); var53 != null; var53 = (class80) field638.method6445()) {
                    if (var53.field1015) {
                        var53.field1015 = false;
                    } else {
                        method100(var53, true);
                    }
                }
                field683 = new class397(512);
                while (var3.field4475 < var45) {
                    int var54 = var3.method6675();
                    int var55 = var3.method6672();
                    int var56 = var3.method6672();
                    int var57 = var3.method6675();
                    for (int var58 = var55; var58 <= var56; var58++) {
                        long var59 = ((long) var54 << 32) + (long) var58;
                        field683.method6447(new class386(var57), var59);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3019 == arg0.field1285) {
                int var61 = var3.method6675();
                int var62 = var3.method6672();
                if (var61 < -70000) {
                    var62 += 32768;
                }
                class281 var63;
                if (var61 >= 0) {
                    var63 = class281.method1956(var61);
                } else {
                    var63 = null;
                }
                if (var63 != null) {
                    for (int var64 = 0; var64 < var63.field3354.length; var64++) {
                        var63.field3354[var64] = 0;
                        var63.field3222[var64] = 0;
                    }
                }
                class78.method2713(var62);
                int var65 = var3.method6672();
                for (int var66 = 0; var66 < var65; var66++) {
                    int var67 = var3.method6700();
                    if (var67 == 255) {
                        var67 = var3.method6675();
                    }
                    int var68 = var3.method6709();
                    if (var63 != null && var66 < var63.field3354.length) {
                        var63.field3354[var66] = var68;
                        var63.field3222[var66] = var67;
                    }
                    class78.method1867(var62, var66, var68 - 1, var67);
                }
                if (var63 != null) {
                    method2020(var63);
                }
                Statics.method2428();
                field665[++field666 - 1 & 0x1F] = var62 & 0x7FFF;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2945 == arg0.field1285) {
                int var69 = var3.method6781();
                method2869(var69);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3028 == arg0.field1285 && field724) {
                field725 = true;
                Statics.field2359 = var3.method6781();
                Statics.field2013 = var3.method6781();
                Statics.field2756 = var3.method6781();
                Statics.field957 = var3.method6781();
                for (int var70 = 0; var70 < 5; var70++) {
                    field726[var70] = false;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2950 == arg0.field1285) {
                class61 var71 = new class61();
                var71.field770 = var3.method6707();
                var71.field767 = var3.method6672();
                int var72 = var3.method6675();
                var71.field775 = var72;
                method3993(45);
                var2.method2817();
                Object var73 = null;
                class69.method3997(var71);
                arg0.field1285 = null;
                return false;
            }
            if (class256.field2985 == arg0.field1285) {
                method387(false, arg0.field1284);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2941 == arg0.field1285) {
                field584 = field662;
                byte var74 = var3.method6846();
                class144 var75 = new class144(var3);
                class147 var76;
                if (var74 >= 0) {
                    var76 = field707[var74];
                } else {
                    var76 = Statics.field1324;
                }
                var75.method2718(var76);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2939 == arg0.field1285) {
                int var77 = var3.method6672();
                field637 = var77;
                this.method1101(false);
                method2712(var77);
                class64.method651(field637);
                for (int var78 = 0; var78 < 100; var78++) {
                    field505[var78] = true;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3030 == arg0.field1285) {
                int var79 = var3.method6675();
                int var80 = var3.method6675();
                class80 var81 = (class80) field638.method6446((long) var79);
                class80 var82 = (class80) field638.method6446((long) var80);
                if (var82 != null) {
                    method100(var82, var81 == null || var81.field1014 != var82.field1014);
                }
                if (var81 != null) {
                    var81.method6163();
                    field638.method6447(var81, (long) var80);
                }
                class281 var83 = class281.method1956(var79);
                if (var83 != null) {
                    method2020(var83);
                }
                class281 var84 = class281.method1956(var80);
                if (var84 != null) {
                    method2020(var84);
                    method2519(Statics.field1043[var84.field3226 >>> 16], var84, true);
                }
                if (field637 != -1) {
                    method1071(field637, 1);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2938 == arg0.field1285) {
                method4817(class254.field2920);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2935 == arg0.field1285) {
                if (arg0.field1293 == 0) {
                    Statics.field1252 = null;
                } else {
                    if (Statics.field1252 == null) {
                        Statics.field1252 = new class347(Statics.field2283, Statics.field3795);
                    }
                    Statics.field1252.method5722(var3);
                }
                method5646();
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2990 == arg0.field1285) {
                Statics.method2428();
                field644 = var3.method6781();
                field472 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2962 == arg0.field1285) {
                for (int var85 = 0; var85 < Statics.field4583; var85++) {
                    class163 var86 = class163.method2017(var85);
                    if (var86 != null) {
                        class276.field3184[var85] = 0;
                        class276.field3185[var85] = 0;
                    }
                }
                Statics.method2428();
                field664 += 32;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2983 == arg0.field1285) {
                method4817(class254.field2914);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3017 == arg0.field1285) {
                Statics.field1814 = var3.method6828();
                Statics.field91 = var3.method6781();
                while (var3.field4475 < arg0.field1293) {
                    int var87 = var3.method6781();
                    class254 var88 = class254.method5660()[var87];
                    method4817(var88);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2992 == arg0.field1285) {
                method4817(class254.field2915);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2932 == arg0.field1285) {
                String var89 = var3.method6707();
                long var90 = var3.method6676();
                long var92 = (long) var3.method6672();
                long var94 = (long) var3.method6674();
                class297 var96 = (class297) class316.method2616(class297.method3054(), var3.method6781());
                long var97 = (var92 << 32) + var94;
                boolean var99 = false;
                for (int var100 = 0; var100 < 100; var100++) {
                    if (field559[var100] == var97) {
                        var99 = true;
                        break;
                    }
                }
                if (var96.field3804 && Statics.field182.method1647(new class440(var89, Statics.field2283))) {
                    var99 = true;
                }
                if (!var99 && field591 == 0) {
                    field559[field701] = var97;
                    field701 = (field701 + 1) % 100;
                    String var101 = class328.method5460(class331.method6595(class270.method3380(var3)));
                    if (var96.field3798 == -1) {
                        class98.method388(9, var89, var101, class333.method5929(var90));
                    } else {
                        class98.method388(9, class92.method4339(var96.field3798) + var89, var101, class333.method5929(var90));
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3018 == arg0.field1285) {
                boolean var102 = var3.method6781() == 1;
                int var103 = var3.method6719();
                class281 var104 = class281.method1956(var103);
                if (var104.field3246 != var102) {
                    var104.field3246 = var102;
                    method2020(var104);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2966 == arg0.field1285) {
                field724 = false;
                for (int var105 = 0; var105 < 5; var105++) {
                    field726[var105] = false;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2987 == arg0.field1285) {
                if (field637 != -1) {
                    method1071(field637, 0);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3001 == arg0.field1285) {
                method4817(class254.field2913);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2949 == arg0.field1285) {
                method4817(class254.field2917);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3005 == arg0.field1285) {
                method1084(false, var3);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2969 == arg0.field1285) {
                Statics.field182.method1643(var3, arg0.field1293);
                field672 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2958 == arg0.field1285) {
                int var106 = var3.method6709();
                int var107 = var3.method6719();
                class281 var108 = class281.method1956(var107);
                if (var108 != null && var108.field3260 == 0) {
                    if (var106 > var108.field3239 - var108.field3242) {
                        var106 = var108.field3239 - var108.field3242;
                    }
                    if (var106 < 0) {
                        var106 = 0;
                    }
                    if (var108.field3248 != var106) {
                        var108.field3248 = var106;
                        method2020(var108);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2995 == arg0.field1285) {
                method4817(class254.field2921);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3027 == arg0.field1285) {
                Statics.field182.field783.method5696(var3, arg0.field1293);
                method3630();
                field672 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2971 == arg0.field1285) {
                int var109 = var3.method6675();
                int var110 = var3.method6672();
                if (var109 < -70000) {
                    var110 += 32768;
                }
                class281 var111;
                if (var109 >= 0) {
                    var111 = class281.method1956(var109);
                } else {
                    var111 = null;
                }
                while (var3.field4475 < arg0.field1293) {
                    int var112 = var3.method6685();
                    int var113 = var3.method6672();
                    int var114 = 0;
                    if (var113 != 0) {
                        var114 = var3.method6781();
                        if (var114 == 255) {
                            var114 = var3.method6675();
                        }
                    }
                    if (var111 != null && var112 >= 0 && var112 < var111.field3354.length) {
                        var111.field3354[var112] = var113;
                        var111.field3222[var112] = var114;
                    }
                    class78.method1867(var110, var112, var113 - 1, var114);
                }
                if (var111 != null) {
                    method2020(var111);
                }
                Statics.method2428();
                field665[++field666 - 1 & 0x1F] = var110 & 0x7FFF;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2943 == arg0.field1285) {
                field724 = true;
                field725 = false;
                Statics.field3194 = var3.method6781();
                Statics.field3151 = var3.method6781();
                Statics.field3952 = var3.method6672();
                Statics.field2756 = var3.method6781();
                Statics.field957 = var3.method6781();
                if (Statics.field957 >= 100) {
                    int var115 = Statics.field3194 * 128 + 64;
                    int var116 = Statics.field3151 * 128 + 64;
                    int var117 = method3822(var115, var116, Statics.field110) - Statics.field3952;
                    int var118 = var115 - Statics.field1318;
                    int var119 = var117 - Statics.field3166;
                    int var120 = var116 - Statics.field1339;
                    int var121 = (int) Math.sqrt((double) (var118 * var118 + var120 * var120));
                    Statics.field1323 = (int) (Math.atan2((double) var119, (double) var121) * 325.9490051269531D) & 0x7FF;
                    Statics.field4247 = (int) (Math.atan2((double) var118, (double) var120) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1323 < 128) {
                        Statics.field1323 = 128;
                    }
                    if (Statics.field1323 > 383) {
                        Statics.field1323 = 383;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3008 == arg0.field1285) {
                field724 = true;
                field725 = false;
                Statics.field1812 = var3.method6781();
                Statics.field1749 = var3.method6781();
                Statics.field1336 = var3.method6672();
                Statics.field2359 = var3.method6781();
                Statics.field2013 = var3.method6781();
                if (Statics.field2013 >= 100) {
                    Statics.field1318 = Statics.field1812 * 128 + 64;
                    Statics.field1339 = Statics.field1749 * 128 + 64;
                    Statics.field3166 = method3822(Statics.field1318, Statics.field1339, Statics.field110) - Statics.field1336;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2984 == arg0.field1285) {
                int var122 = var3.method6709();
                int var123 = var3.method6702();
                int var124 = var3.method6675();
                class80 var125 = (class80) field638.method6446((long) var124);
                if (var125 != null) {
                    method100(var125, var125.field1014 != var122);
                }
                method1961(var124, var122, var123);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3021 == arg0.field1285) {
                Statics.field73 = true;
                method1084(true, var3);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2991 == arg0.field1285) {
                int var126 = var3.method6781();
                if (var3.method6781() == 0) {
                    field748[var126] = new class311();
                    var3.field4475 += 18;
                } else {
                    var3.field4475--;
                    field748[var126] = new class311(var3, false);
                }
                field676 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2952 == arg0.field1285) {
                method4980();
                byte var127 = var3.method6846();
                if (arg0.field1293 == 1) {
                    if (var127 >= 0) {
                        field706[var127] = null;
                    } else {
                        Statics.field2667 = null;
                    }
                    arg0.field1285 = null;
                    return true;
                }
                if (var127 >= 0) {
                    field706[var127] = new class138(var3);
                } else {
                    Statics.field2667 = new class138(var3);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2994 == arg0.field1285) {
                method4980();
                byte var128 = var3.method6846();
                class130 var129 = new class130(var3);
                class138 var130;
                if (var128 >= 0) {
                    var130 = field706[var128];
                } else {
                    var130 = Statics.field2667;
                }
                var129.method2609(var130);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2940 == arg0.field1285) {
                Statics.field1814 = var3.method6781();
                Statics.field91 = var3.method6702();
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2974 == arg0.field1285) {
                method387(true, arg0.field1284);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2933 == arg0.field1285) {
                field490 = var3.method6781();
                if (field490 == 1) {
                    field491 = var3.method6672();
                }
                if (field490 >= 2 && field490 <= 6) {
                    if (field490 == 2) {
                        field496 = 64;
                        field497 = 64;
                    }
                    if (field490 == 3) {
                        field496 = 0;
                        field497 = 64;
                    }
                    if (field490 == 4) {
                        field496 = 128;
                        field497 = 64;
                    }
                    if (field490 == 5) {
                        field496 = 64;
                        field497 = 0;
                    }
                    if (field490 == 6) {
                        field496 = 64;
                        field497 = 128;
                    }
                    field490 = 2;
                    field493 = var3.method6672();
                    field729 = var3.method6672();
                    field495 = var3.method6781();
                }
                if (field490 == 10) {
                    field492 = var3.method6672();
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2936 == arg0.field1285) {
                int var131 = var3.method6720();
                int var132 = var3.method6719();
                int var133 = var3.method6709();
                if (var133 == 65535) {
                    var133 = -1;
                }
                class281 var134 = class281.method1956(var132);
                if (var134.field3250) {
                    var134.field3269 = var133;
                    var134.field3214 = var131;
                    class181 var136 = class181.method2432(var133);
                    var134.field3277 = var136.field2020;
                    var134.field3278 = var136.field2021;
                    var134.field3344 = var136.field2005;
                    var134.field3275 = var136.field2060;
                    var134.field3290 = var136.field2024;
                    var134.field3362 = var136.field2019;
                    if (var136.field2018 == 1) {
                        var134.field3285 = 1;
                    } else {
                        var134.field3285 = 2;
                    }
                    if (var134.field3281 > 0) {
                        var134.field3362 = var134.field3362 * 32 / var134.field3281;
                    } else if (var134.field3321 > 0) {
                        var134.field3362 = var134.field3362 * 32 / var134.field3321;
                    }
                    method2020(var134);
                } else if (var133 == -1) {
                    var134.field3322 = 0;
                    arg0.field1285 = null;
                    return true;
                } else {
                    class181 var135 = class181.method2432(var133);
                    var134.field3322 = 4;
                    var134.field3270 = var133;
                    var134.field3277 = var135.field2020;
                    var134.field3278 = var135.field2021;
                    var134.field3362 = var135.field2019 * 100 / var131;
                    method2020(var134);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2989 == arg0.field1285) {
                int var137 = var3.method6720();
                int var138 = var3.method6709();
                if (var138 == 65535) {
                    var138 = -1;
                }
                int var139 = var3.method6709();
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = var3.method6675();
                for (int var141 = var138; var141 <= var139; var141++) {
                    long var142 = ((long) var140 << 32) + (long) var141;
                    class387 var144 = field683.method6446(var142);
                    if (var144 != null) {
                        var144.method6163();
                    }
                    field683.method6447(new class386(var137), var142);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2968 == arg0.field1285) {
                Statics.field73 = true;
                method1084(false, var3);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2944 == arg0.field1285) {
                Statics.field182.method1677();
                field672 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2982 == arg0.field1285) {
                Statics.field1343 = new class371(Statics.field4117);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2946 == arg0.field1285) {
                field489 = var3.method6672() * 30;
                field472 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2986 == arg0.field1285) {
                int var145 = var3.method6720();
                class281 var146 = class281.method1956(var145);
                for (int var147 = 0; var147 < var146.field3354.length; var147++) {
                    var146.field3354[var147] = -1;
                    var146.field3354[var147] = 0;
                }
                method2020(var146);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3009 == arg0.field1285) {
                String var148 = var3.method6707();
                int var149 = var3.method6876();
                class281 var150 = class281.method1956(var149);
                if (!var148.equals(var150.field3287)) {
                    var150.field3287 = var148;
                    method2020(var150);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2964 == arg0.field1285) {
                int var151 = var3.method6781();
                int var152 = var3.method6781();
                int var153 = var3.method6781();
                int var154 = var3.method6781();
                field726[var151] = true;
                field727[var151] = var152;
                field680[var151] = var153;
                field619[var151] = var154;
                field730[var151] = 0;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2959 == arg0.field1285) {
                for (int var155 = 0; var155 < field653.length; var155++) {
                    if (field653[var155] != null) {
                        field653[var155].field1103 = -1;
                    }
                }
                for (int var156 = 0; var156 < field699.length; var156++) {
                    if (field699[var156] != null) {
                        field699[var156].field1103 = -1;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3016 == arg0.field1285) {
                Statics.field924 = class436.method4011(var3.method6781());
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2977 == arg0.field1285) {
                int var157 = var3.method6675();
                if (field608 != var157) {
                    field608 = var157;
                    method4973();
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2970 == arg0.field1285) {
                Statics.method2376(var3.method6707());
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2963 == arg0.field1285) {
                field605 = var3.method6781();
                field698 = var3.method6828();
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3000 == arg0.field1285) {
                int var158 = var3.method6685();
                boolean var159 = var3.method6781() == 1;
                String var160 = "";
                boolean var161 = false;
                if (var159) {
                    var160 = var3.method6707();
                    if (Statics.field182.method1647(new class440(var160, Statics.field2283))) {
                        var161 = true;
                    }
                }
                String var162 = var3.method6707();
                if (!var161) {
                    class98.method3622(var158, var160, var162);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3010 == arg0.field1285) {
                boolean var163 = var3.method6733();
                if (!var163) {
                    Statics.field1274 = null;
                } else if (Statics.field1274 == null) {
                    Statics.field1274 = new class313();
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2954 == arg0.field1285) {
                int var164 = var3.method6719();
                int var165 = var3.method6711();
                int var166 = var3.method6672();
                class281 var167 = class281.method1956(var164);
                var167.field3261 = (var165 << 16) + var166;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3013 == arg0.field1285) {
                String var168 = var3.method6707();
                long var169 = (long) var3.method6672();
                long var171 = (long) var3.method6674();
                class297 var173 = (class297) class316.method2616(class297.method3054(), var3.method6781());
                long var174 = (var169 << 32) + var171;
                boolean var176 = false;
                for (int var177 = 0; var177 < 100; var177++) {
                    if (field559[var177] == var174) {
                        var176 = true;
                        break;
                    }
                }
                if (Statics.field182.method1647(new class440(var168, Statics.field2283))) {
                    var176 = true;
                }
                if (!var176 && field591 == 0) {
                    field559[field701] = var174;
                    field701 = (field701 + 1) % 100;
                    String var178 = class328.method5460(class331.method6595(class270.method3380(var3)));
                    byte var179;
                    if (var173.field3807) {
                        var179 = 7;
                    } else {
                        var179 = 3;
                    }
                    if (var173.field3798 == -1) {
                        class98.method3622(var179, var168, var178);
                    } else {
                        class98.method3622(var179, class92.method4339(var173.field3798) + var168, var178);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3026 == arg0.field1285) {
                method2158();
                arg0.field1285 = null;
                return false;
            }
            if (class256.field3025 == arg0.field1285) {
                byte var180 = var3.method6773();
                int var181 = var3.method6672();
                class276.field3184[var181] = var180;
                if (class276.field3185[var181] != var180) {
                    class276.field3185[var181] = var180;
                }
                method4944(var181);
                field746[++field664 - 1 & 0x1F] = var181;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2972 == arg0.field1285) {
                int var182 = var3.method6700();
                int var183 = var3.method6700();
                String var184 = var3.method6707();
                if (var183 >= 1 && var183 <= 8) {
                    if (var184.equalsIgnoreCase(class295.field3477)) {
                        var184 = null;
                    }
                    field650[var183 - 1] = var184;
                    field602[var183 - 1] = var182 == 0;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2980 == arg0.field1285) {
                byte var185 = var3.method6846();
                long var186 = (long) var3.method6672();
                long var188 = (long) var3.method6674();
                long var190 = (var186 << 32) + var188;
                boolean var192 = false;
                class147 var193 = var185 >= 0 ? field707[var185] : Statics.field1324;
                if (var193 == null) {
                    var192 = true;
                } else {
                    for (int var194 = 0; var194 < 100; var194++) {
                        if (field559[var194] == var190) {
                            var192 = true;
                            break;
                        }
                    }
                }
                if (!var192) {
                    field559[field701] = var190;
                    field701 = (field701 + 1) % 100;
                    String var195 = class270.method3380(var3);
                    int var196 = var185 >= 0 ? 43 : 46;
                    class98.method388(var196, "", var195, var193.field1642);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3015 == arg0.field1285) {
                field512 = var3.method6781();
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2998 == arg0.field1285) {
                method1084(true, var3);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3023 == arg0.field1285) {
                field584 = field662;
                byte var197 = var3.method6846();
                if (arg0.field1293 == 1) {
                    if (var197 >= 0) {
                        field707[var197] = null;
                    } else {
                        Statics.field1324 = null;
                    }
                    arg0.field1285 = null;
                    return true;
                }
                if (var197 >= 0) {
                    field707[var197] = new class147(var3);
                } else {
                    Statics.field1324 = new class147(var3);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3014 == arg0.field1285) {
                int var198 = var3.method6719();
                int var199 = var3.method6711();
                class276.field3184[var199] = var198;
                if (class276.field3185[var199] != var198) {
                    class276.field3185[var199] = var198;
                }
                method4944(var199);
                field746[++field664 - 1 & 0x1F] = var199;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2934 == arg0.field1285) {
                boolean var200 = var3.method6781() == 1;
                if (var200) {
                    Statics.field2728 = class416.method5860() - var3.method6676();
                    Statics.field524 = new class304(var3, true);
                } else {
                    Statics.field524 = null;
                }
                field670 = field662;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2947 == arg0.field1285) {
                Statics.field91 = var3.method6700();
                Statics.field1814 = var3.method6781();
                for (int var201 = Statics.field91; var201 < Statics.field91 + 8; var201++) {
                    for (int var202 = Statics.field1814; var202 < Statics.field1814 + 8; var202++) {
                        if (field631[Statics.field110][var201][var202] != null) {
                            field631[Statics.field110][var201][var202] = null;
                            method607(var201, var202);
                        }
                    }
                }
                for (class84 var203 = (class84) field657.method5301(); var203 != null; var203 = (class84) field657.method5303()) {
                    if (var203.field1078 >= Statics.field91 && var203.field1078 < Statics.field91 + 8 && var203.field1079 >= Statics.field1814 && var203.field1079 < Statics.field1814 + 8 && Statics.field110 == var203.field1082) {
                        var203.field1085 = 0;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3020 == arg0.field1285) {
                method4817(class254.field2912);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3007 == arg0.field1285) {
                int var204 = var3.method6675();
                class80 var205 = (class80) field638.method6446((long) var204);
                if (var205 != null) {
                    method100(var205, true);
                }
                if (field643 != null) {
                    method2020(field643);
                    field643 = null;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2948 == arg0.field1285) {
                byte[] var206 = new byte[arg0.field1293];
                var3.method6620(var206, 0, var206.length);
                class419 var207 = new class419(var206);
                String var208 = var207.method6707();
                class30.method4390(var208, true, false);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2960 == arg0.field1285) {
                int var209 = var3.method6719();
                int var210 = var3.method6807();
                class281 var211 = class281.method1956(var209);
                if (var211.field3322 != 2 || var211.field3270 != var210) {
                    var211.field3322 = 2;
                    var211.field3270 = var210;
                    method2020(var211);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2937 == arg0.field1285) {
                for (int var212 = 0; var212 < class276.field3185.length; var212++) {
                    if (class276.field3185[var212] != class276.field3184[var212]) {
                        class276.field3185[var212] = class276.field3184[var212];
                        method4944(var212);
                        field746[++field664 - 1 & 0x1F] = var212;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2975 == arg0.field1285) {
                int var213 = var3.method6720();
                class281 var214 = class281.method1956(var213);
                var214.field3322 = 3;
                var214.field3270 = Statics.field4070.field1046.method4862();
                method2020(var214);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3011 == arg0.field1285) {
                class96.method1444(var3, arg0.field1293);
                method4031();
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2967 == arg0.field1285) {
                class34.method1717(var3, arg0.field1293);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2965 == arg0.field1285) {
                Statics.method2428();
                int var215 = var3.method6781();
                int var216 = var3.method6702();
                int var217 = var3.method6719();
                field611[var216] = var217;
                field749[var216] = var215;
                field610[var216] = 1;
                for (int var218 = 0; var218 < 98; var218++) {
                    if (var217 >= class285.field3408[var218]) {
                        field610[var216] = var218 + 2;
                    }
                }
                field667[++field668 - 1 & 0x1F] = var216;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2996 == arg0.field1285) {
                var3.field4475 += 28;
                if (var3.method6696()) {
                    method3232(var3, var3.field4475 - 28);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2976 == arg0.field1285) {
                int var219 = var3.method6672();
                if (var219 == 65535) {
                    var219 = -1;
                }
                method292(var219);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field3004 == arg0.field1285) {
                int var220 = var3.method6816();
                int var221 = var3.method6709();
                if (var221 == 65535) {
                    var221 = -1;
                }
                method5269(var221, var220);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2988 == arg0.field1285) {
                int var222 = var3.method6672();
                int var223 = var3.method6719();
                class281 var224 = class281.method1956(var223);
                if (var224.field3322 != 1 || var224.field3270 != var222) {
                    var224.field3322 = 1;
                    var224.field3270 = var222;
                    method2020(var224);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2942 == arg0.field1285) {
                int var225 = var3.method6709();
                class78.method654(var225);
                field665[++field666 - 1 & 0x1F] = var225 & 0x7FFF;
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2951 == arg0.field1285) {
                int var226 = var3.method6781();
                method1931(var226);
                arg0.field1285 = null;
                return false;
            }
            if (class256.field2993 == arg0.field1285) {
                int var227 = var3.method6720();
                int var228 = var3.method6709();
                int var229 = var228 >> 10 & 0x1F;
                int var230 = var228 >> 5 & 0x1F;
                int var231 = var228 & 0x1F;
                int var232 = (var231 << 3) + (var229 << 19) + (var230 << 11);
                class281 var233 = class281.method1956(var227);
                if (var233.field3251 != var232) {
                    var233.field3251 = var232;
                    method2020(var233);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2955 == arg0.field1285) {
                String var234 = var3.method6707();
                String var235 = class328.method5460(class331.method6595(class270.method3380(var3)));
                class98.method3622(6, var234, var235);
                arg0.field1285 = null;
                return true;
            }
            if (class256.field2957 == arg0.field1285) {
                method4817(class254.field2918);
                arg0.field1285 = null;
                return true;
            }
            class443.method6513("" + (arg0.field1285 == null ? -1 : arg0.field1285.field2978) + class92.field1217 + (arg0.field1291 == null ? -1 : arg0.field1291.field2978) + class92.field1217 + (arg0.field1292 == null ? -1 : arg0.field1292.field2978) + class92.field1217 + arg0.field1293, (Throwable) null);
            method2158();
        } catch (IOException var240) {
            method2288();
        } catch (Exception var241) {
            String var238 = "" + (arg0.field1285 == null ? -1 : arg0.field1285.field2978) + class92.field1217 + (arg0.field1291 == null ? -1 : arg0.field1291.field2978) + class92.field1217 + (arg0.field1292 == null ? -1 : arg0.field1292.field2978) + class92.field1217 + arg0.field1293 + class92.field1217 + (Statics.field1533 + Statics.field4070.field1152[0]) + class92.field1217 + (Statics.field1240 + Statics.field4070.field1153[0]) + class92.field1217;
            for (int var239 = 0; var239 < arg0.field1293 && var239 < 50; var239++) {
                var238 = var238 + var3.field4477[var239] + class92.field1217;
            }
            class443.method6513(var238, var241);
            method2158();
        }
        return true;
    }

    @ObfuscatedName("jz.ha(Lif;B)V")
    public static final void method4817(class254 arg0) {
        class418 var1 = field690.field1284;
        if (class254.field2912 == arg0) {
            int var2 = var1.method6711();
            int var3 = var1.method6828();
            int var4 = (var3 >> 4 & 0x7) + Statics.field91;
            int var5 = (var3 & 0x7) + Statics.field1814;
            int var6 = var1.method6702();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field538[var7];
            if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                if (var9 == 0) {
                    class209 var10 = Statics.field24.method3789(Statics.field110, var4, var5);
                    if (var10 != null) {
                        int var11 = class205.method2352(var10.field2531);
                        if (var7 == 2) {
                            var10.field2530 = new class73(var11, 2, var8 + 4, Statics.field110, var4, var5, var2, false, var10.field2530);
                            var10.field2534 = new class73(var11, 2, var8 + 1 & 0x3, Statics.field110, var4, var5, var2, false, var10.field2534);
                        } else {
                            var10.field2530 = new class73(var11, var7, var8, Statics.field110, var4, var5, var2, false, var10.field2530);
                        }
                    }
                }
                if (var9 == 1) {
                    class211 var12 = Statics.field24.method3657(Statics.field110, var4, var5);
                    if (var12 != null) {
                        int var13 = class205.method2352(var12.field2545);
                        if (var7 == 4 || var7 == 5) {
                            var12.field2547 = new class73(var13, 4, var8, Statics.field110, var4, var5, var2, false, var12.field2547);
                        } else if (var7 == 6) {
                            var12.field2547 = new class73(var13, 4, var8 + 4, Statics.field110, var4, var5, var2, false, var12.field2547);
                        } else if (var7 == 7) {
                            var12.field2547 = new class73(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field110, var4, var5, var2, false, var12.field2547);
                        } else if (var7 == 8) {
                            var12.field2547 = new class73(var13, 4, var8 + 4, Statics.field110, var4, var5, var2, false, var12.field2547);
                            var12.field2544 = new class73(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field110, var4, var5, var2, false, var12.field2544);
                        }
                    }
                }
                if (var9 == 2) {
                    class212 var14 = Statics.field24.method3658(Statics.field110, var4, var5);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var14 != null) {
                        var14.field2553 = new class73(class205.method2352(var14.field2561), var7, var8, Statics.field110, var4, var5, var2, false, var14.field2553);
                    }
                }
                if (var9 == 3) {
                    class190 var15 = Statics.field24.method3659(Statics.field110, var4, var5);
                    if (var15 != null) {
                        var15.field2196 = new class73(class205.method2352(var15.field2197), 22, var8, Statics.field110, var4, var5, var2, false, var15.field2196);
                    }
                }
            }
            return;
        }
        if (class254.field2914 == arg0) {
            byte var16 = var1.method6704();
            byte var17 = var1.method6846();
            byte var18 = var1.method6704();
            byte var19 = var1.method6846();
            int var20 = var1.method6672();
            int var21 = var1.method6807();
            int var22 = var1.method6672();
            int var23 = var1.method6828();
            int var24 = (var23 >> 4 & 0x7) + Statics.field91;
            int var25 = (var23 & 0x7) + Statics.field1814;
            int var26 = var1.method6700();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = field538[var27];
            int var30 = var1.method6709();
            class83 var31;
            if (field594 == var30) {
                var31 = Statics.field4070;
            } else {
                var31 = field653[var30];
            }
            if (var31 != null) {
                class180 var32 = class180.method2760(var20);
                int var33;
                int var34;
                if (var28 == 1 || var28 == 3) {
                    var33 = var32.field1968;
                    var34 = var32.field1967;
                } else {
                    var33 = var32.field1967;
                    var34 = var32.field1968;
                }
                int var35 = (var33 >> 1) + var24;
                int var36 = (var33 + 1 >> 1) + var24;
                int var37 = (var34 >> 1) + var25;
                int var38 = (var34 + 1 >> 1) + var25;
                int[][] var39 = class75.field972[Statics.field110];
                int var40 = var39[var35][var37] + var39[var36][var37] + var39[var35][var38] + var39[var36][var38] >> 2;
                int var41 = (var24 << 7) + (var33 << 6);
                int var42 = (var25 << 7) + (var34 << 6);
                class204 var43 = var32.method3183(var27, var28, var39, var41, var40, var42);
                if (var43 != null) {
                    method2302(Statics.field110, var24, var25, var29, -1, 0, 0, var21 + 1, var22 + 1);
                    var31.field1053 = field481 + var21;
                    var31.field1051 = field481 + var22;
                    var31.field1047 = var43;
                    var31.field1057 = var24 * 128 + var33 * 64;
                    var31.field1059 = var25 * 128 + var34 * 64;
                    var31.field1073 = var40;
                    if (var17 > var16) {
                        byte var44 = var17;
                        var17 = var16;
                        var16 = var44;
                    }
                    if (var19 > var18) {
                        byte var45 = var19;
                        var19 = var18;
                        var18 = var45;
                    }
                    var31.field1061 = var17 + var24;
                    var31.field1063 = var16 + var24;
                    var31.field1062 = var19 + var25;
                    var31.field1050 = var18 + var25;
                }
            }
        }
        if (class254.field2921 == arg0) {
            int var46 = var1.method6700();
            int var47 = (var46 >> 4 & 0x7) + Statics.field91;
            int var48 = (var46 & 0x7) + Statics.field1814;
            int var49 = var1.method6712();
            byte var50 = var1.method6704();
            int var51 = var1.method6672();
            int var52 = var1.method6781();
            int var53 = var1.method6709();
            int var54 = var1.method6781() * 4;
            int var55 = var1.method6828();
            int var56 = var1.method6711();
            int var57 = var1.method6781() * 4;
            byte var58 = var1.method6773();
            int var59 = var47 + var50;
            int var60 = var48 + var58;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var53 != 65535) {
                int var61 = var47 * 128 + 64;
                int var62 = var48 * 128 + 64;
                int var63 = var59 * 128 + 64;
                int var64 = var60 * 128 + 64;
                class70 var65 = new class70(var53, Statics.field110, var61, var62, method3822(var61, var62, Statics.field110) - var54, field481 + var56, field481 + var51, var55, var52, var49, var57);
                var65.method1910(var63, var64, method3822(var63, var64, Statics.field110) - var57, field481 + var56);
                field655.method5296(var65);
            }
        } else if (class254.field2917 == arg0) {
            int var66 = var1.method6702();
            int var67 = var66 >> 2;
            int var68 = var66 & 0x3;
            int var69 = field538[var67];
            int var70 = var1.method6702();
            int var71 = (var70 >> 4 & 0x7) + Statics.field91;
            int var72 = (var70 & 0x7) + Statics.field1814;
            int var73 = var1.method6711();
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                method2302(Statics.field110, var71, var72, var69, var73, var67, var68, 0, -1);
            }
        } else if (class254.field2919 == arg0) {
            int var74 = var1.method6781();
            int var75 = var74 >> 2;
            int var76 = var74 & 0x3;
            int var77 = field538[var75];
            int var78 = var1.method6700();
            int var79 = (var78 >> 4 & 0x7) + Statics.field91;
            int var80 = (var78 & 0x7) + Statics.field1814;
            if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                method2302(Statics.field110, var79, var80, var77, -1, var75, var76, 0, -1);
            }
        } else if (class254.field2918 == arg0) {
            int var81 = var1.method6700();
            int var82 = (var81 >> 4 & 0x7) + Statics.field91;
            int var83 = (var81 & 0x7) + Statics.field1814;
            int var84 = var1.method6709();
            if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                class321 var85 = field631[Statics.field110][var82][var83];
                if (var85 != null) {
                    for (class95 var86 = (class95) var85.method5301(); var86 != null; var86 = (class95) var85.method5303()) {
                        if ((var84 & 0x7FFF) == var86.field1241) {
                            var86.method6163();
                            break;
                        }
                    }
                    if (var85.method5301() == null) {
                        field631[Statics.field110][var82][var83] = null;
                    }
                    method607(var82, var83);
                }
            }
        } else if (class254.field2915 == arg0) {
            int var87 = var1.method6672();
            int var88 = var1.method6702();
            int var89 = (var88 >> 4 & 0x7) + Statics.field91;
            int var90 = (var88 & 0x7) + Statics.field1814;
            int var91 = var1.method6709();
            if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                class95 var92 = new class95();
                var92.field1241 = var87;
                var92.field1243 = var91;
                if (field631[Statics.field110][var89][var90] == null) {
                    field631[Statics.field110][var89][var90] = new class321();
                }
                field631[Statics.field110][var89][var90].method5296(var92);
                method607(var89, var90);
            }
        } else if (class254.field2913 == arg0) {
            int var93 = var1.method6700();
            int var94 = (var93 >> 4 & 0x7) + Statics.field91;
            int var95 = (var93 & 0x7) + Statics.field1814;
            int var96 = var1.method6711();
            int var97 = var1.method6828();
            int var98 = var1.method6672();
            if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                int var99 = var94 * 128 + 64;
                int var100 = var95 * 128 + 64;
                class65 var101 = new class65(var96, Statics.field110, var99, var100, method3822(var99, var100, Statics.field110) - var97, var98, field481);
                field607.method5296(var101);
            }
        } else {
            if (class254.field2916 == arg0) {
                int var102 = var1.method6781();
                int var103 = var102 >> 4 & 0xF;
                int var104 = var102 & 0x7;
                int var105 = var1.method6700();
                int var106 = var1.method6781();
                int var107 = (var106 >> 4 & 0x7) + Statics.field91;
                int var108 = (var106 & 0x7) + Statics.field1814;
                int var109 = var1.method6807();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var110 = var103 + 1;
                    if (Statics.field4070.field1152[0] >= var107 - var110 && Statics.field4070.field1152[0] <= var107 + var110 && Statics.field4070.field1153[0] >= var108 - var110 && Statics.field4070.field1153[0] <= var108 + var110 && Statics.field929.field1202 != 0 && var104 > 0 && field718 < 50) {
                        field719[field718] = var109;
                        field720[field718] = var104;
                        field540[field718] = var105;
                        field723[field718] = null;
                        field686[field718] = (var107 << 16) + (var108 << 8) + var103;
                        field718++;
                    }
                }
            }
            if (class254.field2920 == arg0) {
                int var111 = var1.method6672();
                int var112 = var1.method6807();
                int var113 = var1.method6700();
                int var114 = (var113 >> 4 & 0x7) + Statics.field91;
                int var115 = (var113 & 0x7) + Statics.field1814;
                int var116 = var1.method6709();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    class321 var117 = field631[Statics.field110][var114][var115];
                    if (var117 != null) {
                        for (class95 var118 = (class95) var117.method5301(); var118 != null; var118 = (class95) var117.method5303()) {
                            if ((var116 & 0x7FFF) == var118.field1241 && var118.field1243 == var112) {
                                var118.field1243 = var111;
                                break;
                            }
                        }
                        method607(var114, var115);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.hv(IIIIIIIIIB)V")
    public static final void method2302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class84 var9 = null;
        for (class84 var10 = (class84) field657.method5301(); var10 != null; var10 = (class84) field657.method5303()) {
            if (var10.field1082 == arg0 && var10.field1078 == arg1 && var10.field1079 == arg2 && var10.field1077 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class84();
            var9.field1082 = arg0;
            var9.field1077 = arg3;
            var9.field1078 = arg1;
            var9.field1079 = arg2;
            method23(var9);
            field657.method5296(var9);
        }
        var9.field1083 = arg4;
        var9.field1076 = arg5;
        var9.field1084 = arg6;
        var9.field1086 = arg7;
        var9.field1085 = arg8;
    }

    @ObfuscatedName("t.hz(Lcg;B)V")
    public static final void method23(class84 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1077 == 0) {
            var1 = Statics.field24.method3746(arg0.field1082, arg0.field1078, arg0.field1079);
        }
        if (arg0.field1077 == 1) {
            var1 = Statics.field24.method3668(arg0.field1082, arg0.field1078, arg0.field1079);
        }
        if (arg0.field1077 == 2) {
            var1 = Statics.field24.method3662(arg0.field1082, arg0.field1078, arg0.field1079);
        }
        if (arg0.field1077 == 3) {
            var1 = Statics.field24.method3663(arg0.field1082, arg0.field1078, arg0.field1079);
        }
        if (var1 != 0L) {
            int var6 = Statics.field24.method3794(arg0.field1082, arg0.field1078, arg0.field1079, var1);
            var3 = class205.method2352(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1080 = var3;
        arg0.field1081 = var4;
        arg0.field1088 = var5;
    }

    @ObfuscatedName("ku.hs(I)V")
    public static final void method5145() {
        for (class84 var0 = (class84) field657.method5301(); var0 != null; var0 = (class84) field657.method5303()) {
            if (var0.field1085 > 0) {
                var0.field1085--;
            }
            if (var0.field1085 == 0) {
                if (var0.field1080 >= 0) {
                    int var1 = var0.field1080;
                    int var2 = var0.field1081;
                    class180 var3 = class180.method2760(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3182(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method389(var0.field1082, var0.field1077, var0.field1078, var0.field1079, var0.field1080, var0.field1088, var0.field1081);
                var0.method6163();
            } else {
                if (var0.field1086 > 0) {
                    var0.field1086--;
                }
                if (var0.field1086 == 0 && var0.field1078 >= 1 && var0.field1079 >= 1 && var0.field1078 <= 102 && var0.field1079 <= 102) {
                    if (var0.field1083 >= 0) {
                        int var5 = var0.field1083;
                        int var6 = var0.field1076;
                        class180 var7 = class180.method2760(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3182(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method389(var0.field1082, var0.field1077, var0.field1078, var0.field1079, var0.field1083, var0.field1084, var0.field1076);
                    var0.field1086 = -1;
                    if (var0.field1083 == var0.field1080 && var0.field1080 == -1) {
                        var0.method6163();
                    } else if (var0.field1083 == var0.field1080 && var0.field1088 == var0.field1084 && var0.field1081 == var0.field1076) {
                        var0.method6163();
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.hb(IIIIIIII)V")
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field473 && Statics.field110 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field24.method3746(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field24.method3668(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field24.method3662(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field24.method3663(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field24.method3794(arg0, arg2, arg3, var7);
            int var13 = class205.method2352(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field24.method3772(arg0, arg2, arg3);
                class180 var16 = class180.method2760(var13);
                if (var16.field1973 != 0) {
                    field751[arg0].method3384(arg2, arg3, var14, var15, var16.field1987);
                }
            }
            if (arg1 == 1) {
                Statics.field24.method3652(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field24.method3653(arg0, arg2, arg3);
                class180 var17 = class180.method2760(var13);
                if (var17.field1967 + arg2 > 103 || var17.field1967 + arg3 > 103 || var17.field1968 + arg2 > 103 || var17.field1968 + arg3 > 103) {
                    return;
                }
                if (var17.field1973 != 0) {
                    field751[arg0].method3385(arg2, arg3, var17.field1967, var17.field1968, var15, var17.field1987);
                }
            }
            if (arg1 == 3) {
                Statics.field24.method3654(arg0, arg2, arg3);
                class180 var18 = class180.method2760(var13);
                if (var18.field1973 == 1) {
                    field751[arg0].method3392(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field962[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class197 var20 = Statics.field24;
        class184 var21 = field751[arg0];
        class180 var22 = class180.method2760(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field1968;
            var24 = var22.field1967;
        } else {
            var23 = var22.field1967;
            var24 = var22.field1968;
        }
        int var25;
        int var26;
        if (arg2 + var23 <= 104) {
            var25 = (var23 >> 1) + arg2;
            var26 = (var23 + 1 >> 1) + arg2;
        } else {
            var25 = arg2;
            var26 = arg2 + 1;
        }
        int var27;
        int var28;
        if (arg3 + var24 <= 104) {
            var27 = (var24 >> 1) + arg3;
            var28 = (var24 + 1 >> 1) + arg3;
        } else {
            var27 = arg3;
            var28 = arg3 + 1;
        }
        int[][] var29 = class75.field972[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class205.method1932(arg2, arg3, 2, var22.field1956 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field2002 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class198 var36;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var36 = var22.method3183(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class73(arg4, 22, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3640(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field1973 == 1) {
                var21.method3387(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class198 var62;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var62 = var22.method3183(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class73(arg4, 10, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            if (var62 != null) {
                var20.method3644(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field1973 != 0) {
                var21.method3382(arg2, arg3, var23, var24, var22.field1987);
            }
        } else if (arg6 >= 12) {
            class198 var37;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var37 = var22.method3183(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3644(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field1973 != 0) {
                var21.method3382(arg2, arg3, var23, var24, var22.field1987);
            }
        } else if (arg6 == 0) {
            class198 var38;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var38 = var22.method3183(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class73(arg4, 0, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3687(arg0, arg2, arg3, var30, var38, (class198) null, class75.field970[arg5], 0, var33, var35);
            if (var22.field1973 != 0) {
                var21.method3412(arg2, arg3, arg6, arg5, var22.field1987);
            }
        } else if (arg6 == 1) {
            class198 var39;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var39 = var22.method3183(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class73(arg4, 1, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3687(arg0, arg2, arg3, var30, var39, (class198) null, class75.field971[arg5], 0, var33, var35);
            if (var22.field1973 != 0) {
                var21.method3412(arg2, arg3, arg6, arg5, var22.field1987);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class198 var41;
            class198 var42;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var41 = var22.method3183(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method3183(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class73(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
                var42 = new class73(arg4, 2, var40, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3687(arg0, arg2, arg3, var30, var41, var42, class75.field970[arg5], class75.field970[var40], var33, var35);
            if (var22.field1973 != 0) {
                var21.method3412(arg2, arg3, arg6, arg5, var22.field1987);
            }
        } else if (arg6 == 3) {
            class198 var43;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var43 = var22.method3183(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class73(arg4, 3, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3687(arg0, arg2, arg3, var30, var43, (class198) null, class75.field971[arg5], 0, var33, var35);
            if (var22.field1973 != 0) {
                var21.method3412(arg2, arg3, arg6, arg5, var22.field1987);
            }
        } else if (arg6 == 9) {
            class198 var44;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var44 = var22.method3183(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3644(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field1973 != 0) {
                var21.method3382(arg2, arg3, var23, var24, var22.field1987);
            }
        } else if (arg6 == 4) {
            class198 var45;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var45 = var22.method3183(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3766(arg0, arg2, arg3, var30, var45, (class198) null, class75.field970[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3746(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class180.method2760(class205.method2352(var47)).field1976;
            }
            class198 var49;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var49 = var22.method3183(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3766(arg0, arg2, arg3, var30, var49, (class198) null, class75.field970[arg5], 0, class75.field977[arg5] * var46, class75.field967[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3746(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class180.method2760(class205.method2352(var51)).field1976 / 2;
            }
            class198 var53;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var53 = var22.method3183(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3766(arg0, arg2, arg3, var30, var53, (class198) null, 256, arg5, class75.field974[arg5] * var50, class75.field975[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class198 var55;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var55 = var22.method3183(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class73(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3766(arg0, arg2, arg3, var30, var55, (class198) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3746(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class180.method2760(class205.method2352(var57)).field1976 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class198 var60;
            class198 var61;
            if (var22.field1964 == -1 && var22.field1981 == null) {
                var60 = var22.method3183(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method3183(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
                var61 = new class73(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field1964, var22.field2001, (class198) null);
            }
            var20.method3766(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class75.field974[arg5] * var56, class75.field975[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("az.hq(IIB)V")
    public static final void method607(int arg0, int arg1) {
        class321 var2 = field631[Statics.field110][arg0][arg1];
        if (var2 == null) {
            Statics.field24.method3655(Statics.field110, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method5301(); var6 != null; var6 = (class95) var2.method5303()) {
            class181 var7 = class181.method2432(var6.field1241);
            long var8 = (long) var7.field2026;
            if (var7.field2018 == 1) {
                var8 = (long) (var6.field1243 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field24.method3655(Statics.field110, arg0, arg1);
            return;
        }
        var2.method5297(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method5301(); var12 != null; var12 = (class95) var2.method5303()) {
            if (var5.field1241 != var12.field1241) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1241 != var12.field1241 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class205.method1932(arg0, arg1, 3, false, 0);
        Statics.field24.method3748(Statics.field110, arg0, arg1, method3822(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field110), var5, var13, var10, var11);
    }

    @ObfuscatedName("bm.hm(ZLpj;B)V")
    public static final void method1084(boolean arg0, class418 arg1) {
        field598 = 0;
        field521 = 0;
        class418 var2 = field690.field1284;
        var2.method6621();
        int var3 = var2.method6646(8);
        if (var3 < field519) {
            for (int var4 = var3; var4 < field519; var4++) {
                field599[++field598 - 1] = field520[var4];
            }
        }
        if (var3 > field519) {
            throw new RuntimeException("");
        }
        field519 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field520[var5];
            class91 var7 = field699[var6];
            int var8 = var2.method6646(1);
            if (var8 == 0) {
                field520[++field519 - 1] = var6;
                var7.field1093 = field481;
            } else {
                int var9 = var2.method6646(2);
                if (var9 == 0) {
                    field520[++field519 - 1] = var6;
                    var7.field1093 = field481;
                    field606[++field521 - 1] = var6;
                } else if (var9 == 1) {
                    field520[++field519 - 1] = var6;
                    var7.field1093 = field481;
                    int var10 = var2.method6646(3);
                    var7.method2211(var10, class186.field2124);
                    int var11 = var2.method6646(1);
                    if (var11 == 1) {
                        field606[++field521 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field520[++field519 - 1] = var6;
                    var7.field1093 = field481;
                    if (var2.method6646(1) == 1) {
                        int var12 = var2.method6646(3);
                        var7.method2211(var12, class186.field2123);
                        int var13 = var2.method6646(3);
                        var7.method2211(var13, class186.field2123);
                    } else {
                        int var14 = var2.method6646(3);
                        var7.method2211(var14, class186.field2121);
                    }
                    int var15 = var2.method6646(1);
                    if (var15 == 1) {
                        field606[++field521 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field599[++field598 - 1] = var6;
                }
            }
        }
        while (arg1.method6643(field690.field1293) >= 27) {
            int var16 = arg1.method6646(15);
            if (var16 == 32767) {
                break;
            }
            boolean var47 = false;
            if (field699[var16] == null) {
                field699[var16] = new class91();
                var47 = true;
            }
            class91 var48 = field699[var16];
            field520[++field519 - 1] = var16;
            var48.field1093 = field481;
            int var52;
            int var53;
            int var54;
            if (Statics.field73) {
                boolean var49 = arg1.method6646(1) == 1;
                if (var49) {
                    arg1.method6646(32);
                }
                int var50 = arg1.method6646(1);
                if (var50 == 1) {
                    field606[++field521 - 1] = var16;
                }
                int var51 = field503[arg1.method6646(3)];
                if (var47) {
                    var48.field1140 = var48.field1111 = var51;
                }
                if (arg0) {
                    var52 = arg1.method6646(8);
                    if (var52 > 127) {
                        var52 -= 256;
                    }
                } else {
                    var52 = arg1.method6646(5);
                    if (var52 > 15) {
                        var52 -= 32;
                    }
                }
                var53 = arg1.method6646(1);
                var48.field1215 = class171.method4029(arg1.method6646(14));
                if (arg0) {
                    var54 = arg1.method6646(8);
                    if (var54 > 127) {
                        var54 -= 256;
                    }
                } else {
                    var54 = arg1.method6646(5);
                    if (var54 > 15) {
                        var54 -= 32;
                    }
                }
            } else {
                var53 = arg1.method6646(1);
                var48.field1215 = class171.method4029(arg1.method6646(14));
                int var55 = arg1.method6646(1);
                if (var55 == 1) {
                    field606[++field521 - 1] = var16;
                }
                if (arg0) {
                    var54 = arg1.method6646(8);
                    if (var54 > 127) {
                        var54 -= 256;
                    }
                } else {
                    var54 = arg1.method6646(5);
                    if (var54 > 15) {
                        var54 -= 32;
                    }
                }
                boolean var56 = arg1.method6646(1) == 1;
                if (var56) {
                    arg1.method6646(32);
                }
                if (arg0) {
                    var52 = arg1.method6646(8);
                    if (var52 > 127) {
                        var52 -= 256;
                    }
                } else {
                    var52 = arg1.method6646(5);
                    if (var52 > 15) {
                        var52 -= 32;
                    }
                }
                int var57 = field503[arg1.method6646(3)];
                if (var47) {
                    var48.field1140 = var48.field1111 = var57;
                }
            }
            var48.field1121 = var48.field1215.field1839;
            var48.field1150 = var48.field1215.field1862;
            if (var48.field1150 == 0) {
                var48.field1111 = 0;
            }
            var48.field1098 = var48.field1215.field1841;
            var48.field1143 = var48.field1215.field1846;
            var48.field1100 = var48.field1215.field1847;
            var48.field1091 = var48.field1215.field1833;
            var48.field1095 = var48.field1215.field1842;
            var48.field1146 = var48.field1215.field1843;
            var48.field1097 = var48.field1215.field1844;
            var48.method2210(Statics.field4070.field1152[0] + var54, Statics.field4070.field1153[0] + var52, var53 == 1);
        }
        arg1.method6615();
        for (int var17 = 0; var17 < field521; var17++) {
            int var18 = field606[var17];
            class91 var19 = field699[var18];
            int var20 = arg1.method6781();
            if (Statics.field73 && (var20 & 0x4) != 0) {
                int var21 = arg1.method6781();
                var20 += var21 << 8;
            }
            if ((var20 & 0x8) != 0) {
                int var22 = arg1.method6709();
                int var23 = arg1.method6711();
                if (Statics.field73) {
                    var19.field1119 = arg1.method6702() == 1;
                }
                int var24 = var19.field1130 - (var22 - Statics.field1533 - Statics.field1533) * 64;
                int var25 = var19.field1090 - (var23 - Statics.field1240 - Statics.field1240) * 64;
                if (var24 != 0 || var25 != 0) {
                    var19.field1123 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var20 & 0x1) != 0) {
                int var26 = arg1.method6700();
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = arg1.method6685();
                        if (var31 == 32767) {
                            var31 = arg1.method6685();
                            var29 = arg1.method6685();
                            var28 = arg1.method6685();
                            var30 = arg1.method6685();
                        } else if (var31 == 32766) {
                            var31 = -1;
                        } else {
                            var29 = arg1.method6685();
                        }
                        int var32 = arg1.method6685();
                        var19.method2127(var31, var29, var28, var30, field481, var32);
                    }
                }
                int var33 = arg1.method6828();
                if (var33 > 0) {
                    for (int var34 = 0; var34 < var33; var34++) {
                        int var35 = arg1.method6685();
                        int var36 = arg1.method6685();
                        if (var36 == 32767) {
                            var19.method2129(var35);
                        } else {
                            int var37 = arg1.method6685();
                            int var38 = arg1.method6700();
                            int var39 = var36 > 0 ? arg1.method6702() : var38;
                            var19.method2128(var35, field481, var36, var37, var38, var39);
                        }
                    }
                }
            }
            if ((var20 & 0x10) != 0) {
                var19.field1126 = arg1.method6707();
                var19.field1106 = 100;
            }
            if ((var20 & 0x2) != 0) {
                var19.field1128 = arg1.method6711();
                int var40 = arg1.method6720();
                var19.field1132 = var40 >> 16;
                var19.field1131 = (var40 & 0xFFFF) + field481;
                var19.field1129 = 0;
                var19.field1157 = 0;
                if (var19.field1131 > field481) {
                    var19.field1129 = -1;
                }
                if (var19.field1128 == 65535) {
                    var19.field1128 = -1;
                }
            }
            if ((var20 & 0x200) != 0) {
                var19.field1120 = arg1.method6719();
            }
            if ((var20 & 0x40) != 0) {
                int var41 = arg1.method6711();
                if (var41 == 65535) {
                    var41 = -1;
                }
                int var42 = arg1.method6702();
                if (var19.field1103 == var41 && var41 != -1) {
                    int var43 = class183.method2402(var41).field2079;
                    if (var43 == 1) {
                        var19.field1124 = 0;
                        var19.field1125 = 0;
                        var19.field1148 = var42;
                        var19.field1127 = 0;
                    }
                    if (var43 == 2) {
                        var19.field1127 = 0;
                    }
                } else if (var41 == -1 || var19.field1103 == -1 || class183.method2402(var41).field2093 >= class183.method2402(var19.field1103).field2093) {
                    var19.field1103 = var41;
                    var19.field1124 = 0;
                    var19.field1125 = 0;
                    var19.field1148 = var42;
                    var19.field1127 = 0;
                    var19.field1099 = var19.field1151;
                }
            }
            if (Statics.field73 && (var20 & 0x400) != 0 || !Statics.field73 && (var20 & 0x4) != 0) {
                var19.field1133 = arg1.method6704();
                var19.field1135 = arg1.method6846();
                var19.field1134 = arg1.method6704();
                var19.field1136 = arg1.method6846();
                var19.field1137 = arg1.method6711() + field481;
                var19.field1158 = arg1.method6672() + field481;
                var19.field1139 = arg1.method6711();
                var19.field1151 = 1;
                var19.field1099 = 0;
                var19.field1133 += var19.field1152[0];
                var19.field1135 += var19.field1153[0];
                var19.field1134 += var19.field1152[0];
                var19.field1136 += var19.field1153[0];
            }
            if ((var20 & 0x80) != 0) {
                var19.field1156 = arg1.method6709();
                if (var19.field1156 == 65535) {
                    var19.field1156 = -1;
                }
            }
            if ((var20 & 0x100) != 0) {
                var19.field1142 = field481 + arg1.method6672();
                var19.field1141 = field481 + arg1.method6709();
                var19.field1144 = arg1.method6846();
                var19.field1145 = arg1.method6704();
                var19.field1096 = arg1.method6704();
                var19.field1147 = (byte) arg1.method6781();
            }
            if ((var20 & 0x20) != 0) {
                var19.field1215 = class171.method4029(arg1.method6709());
                var19.field1121 = var19.field1215.field1839;
                var19.field1150 = var19.field1215.field1862;
                var19.field1098 = var19.field1215.field1841;
                var19.field1143 = var19.field1215.field1846;
                var19.field1100 = var19.field1215.field1847;
                var19.field1091 = var19.field1215.field1833;
                var19.field1095 = var19.field1215.field1842;
                var19.field1146 = var19.field1215.field1843;
                var19.field1097 = var19.field1215.field1844;
            }
        }
        for (int var44 = 0; var44 < field598; var44++) {
            int var45 = field599[var44];
            if (field481 != field699[var45].field1093) {
                field699[var45].field1215 = null;
                field699[var45] = null;
            }
        }
        if (field690.field1293 != arg1.field4475) {
            throw new RuntimeException(arg1.field4475 + class92.field1217 + field690.field1293);
        }
        for (int var46 = 0; var46 < field519; var46++) {
            if (field699[field520[var46]] == null) {
                throw new RuntimeException(var46 + class92.field1217 + field519);
            }
        }
    }

    @ObfuscatedName("kz.hi(Lck;IILgj;B)V")
    public static final void method5047(class83 arg0, int arg1, int arg2, class186 arg3) {
        int var4 = arg0.field1152[0];
        int var5 = arg0.field1153[0];
        int var6 = arg0.method2076();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2076();
        field755.field2116 = arg1;
        field755.field2113 = arg2;
        field755.field2118 = 1;
        field755.field2115 = 1;
        class59 var8 = field755;
        class59 var9 = var8;
        class184 var10 = field751[arg0.field1068];
        int[] var11 = field756;
        int[] var12 = field757;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class187.field2133[var13][var14] = 0;
                class187.field2129[var13][var14] = 99999999;
            }
        }
        boolean var30;
        if (var7 == 1) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class187.field2133[var17][var18] = 99;
            class187.field2129[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class187.field2128[var21] = var4;
            int var56 = var21 + 1;
            class187.field2132[var21] = var5;
            int[][] var23 = var10.field2107;
            boolean var28;
            while (true) {
                if (var56 == var22) {
                    Statics.field2130 = var15;
                    Statics.field2131 = var16;
                    var28 = false;
                    break;
                }
                var15 = class187.field2128[var22];
                var16 = class187.field2132[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field2109;
                int var27 = var16 - var10.field2105;
                if (var9.method1072(1, var15, var16, var10)) {
                    Statics.field2130 = var15;
                    Statics.field2131 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class187.field2129[var24][var25] + 1;
                if (var24 > 0 && class187.field2133[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class187.field2128[var56] = var15 - 1;
                    class187.field2132[var56] = var16;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24 - 1][var25] = 2;
                    class187.field2129[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class187.field2133[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class187.field2128[var56] = var15 + 1;
                    class187.field2132[var56] = var16;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24 + 1][var25] = 8;
                    class187.field2129[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class187.field2133[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class187.field2128[var56] = var15;
                    class187.field2132[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24][var25 - 1] = 1;
                    class187.field2129[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class187.field2133[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class187.field2128[var56] = var15;
                    class187.field2132[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24][var25 + 1] = 4;
                    class187.field2129[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class187.field2133[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class187.field2128[var56] = var15 - 1;
                    class187.field2132[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24 - 1][var25 - 1] = 3;
                    class187.field2129[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class187.field2133[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class187.field2128[var56] = var15 + 1;
                    class187.field2132[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24 + 1][var25 - 1] = 9;
                    class187.field2129[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class187.field2133[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class187.field2128[var56] = var15 - 1;
                    class187.field2132[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24 - 1][var25 + 1] = 6;
                    class187.field2129[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class187.field2133[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class187.field2128[var56] = var15 + 1;
                    class187.field2132[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class187.field2133[var24 + 1][var25 + 1] = 12;
                    class187.field2129[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            var30 = class187.method2844(var4, var5, var8, var10);
        } else {
            var30 = class187.method6920(var4, var5, var7, var8, var10);
        }
        int var49;
        label285: {
            int var31 = var4 - 64;
            int var32 = var5 - 64;
            int var33 = Statics.field2130;
            int var34 = Statics.field2131;
            if (!var30) {
                int var35 = Integer.MAX_VALUE;
                int var36 = Integer.MAX_VALUE;
                byte var37 = 10;
                int var38 = var9.field2116;
                int var39 = var9.field2113;
                int var40 = var9.field2118;
                int var41 = var9.field2115;
                for (int var42 = var38 - var37; var42 <= var37 + var38; var42++) {
                    for (int var43 = var39 - var37; var43 <= var37 + var39; var43++) {
                        int var44 = var42 - var31;
                        int var45 = var43 - var32;
                        if (var44 >= 0 && var45 >= 0 && var44 < 128 && var45 < 128 && class187.field2129[var44][var45] < 100) {
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = 0;
                            if (var43 < var39) {
                                var47 = var39 - var43;
                            } else if (var43 > var39 + var41 - 1) {
                                var47 = var43 - (var39 + var41 - 1);
                            }
                            int var48 = var46 * var46 + var47 * var47;
                            if (var48 < var35 || var35 == var48 && class187.field2129[var44][var45] < var36) {
                                var35 = var48;
                                var36 = class187.field2129[var44][var45];
                                var33 = var42;
                                var34 = var43;
                            }
                        }
                    }
                }
                if (var35 == Integer.MAX_VALUE) {
                    var49 = -1;
                    break label285;
                }
            }
            if (var4 == var33 && var5 == var34) {
                var49 = 0;
            } else {
                byte var50 = 0;
                class187.field2128[var50] = var33;
                int var57 = var50 + 1;
                class187.field2132[var50] = var34;
                int var51;
                int var52 = var51 = class187.field2133[var33 - var31][var34 - var32];
                while (var4 != var33 || var5 != var34) {
                    if (var51 != var52) {
                        var51 = var52;
                        class187.field2128[var57] = var33;
                        class187.field2132[var57++] = var34;
                    }
                    if ((var52 & 0x2) != 0) {
                        var33++;
                    } else if ((var52 & 0x8) != 0) {
                        var33--;
                    }
                    if ((var52 & 0x1) != 0) {
                        var34++;
                    } else if ((var52 & 0x4) != 0) {
                        var34--;
                    }
                    var52 = class187.field2133[var33 - var31][var34 - var32];
                }
                int var53 = 0;
                while (var57-- > 0) {
                    var11[var53] = class187.field2128[var57];
                    var12[var53++] = class187.field2132[var57];
                    if (var53 >= var11.length) {
                        break;
                    }
                }
                var49 = var53;
            }
        }
        int var54 = var49;
        if (var49 >= 1) {
            for (int var55 = 0; var55 < var54 - 1; var55++) {
                arg0.method2079(field756[var55], field757[var55], arg3);
            }
        }
    }

    @ObfuscatedName("cf.hk(I)V")
    public static void method2366() {
        field689 = 0;
        field522 = false;
    }

    @ObfuscatedName("fj.hx(S)V")
    public static void method2897() {
        method2366();
        field700[0] = class295.field3746;
        field709[0] = "";
        field617[0] = 1006;
        field621[0] = false;
        field689 = 1;
    }

    @ObfuscatedName("mw.it(III)V")
    public static final void method5707(int arg0, int arg1) {
        if (field689 < 2 && field630 == 0 && !field675 || !field575) {
            return;
        }
        int var2 = method2420();
        String var3;
        if (field630 == 1 && field689 < 2) {
            var3 = class295.field3632 + class295.field3701 + field743 + " " + class92.field1221;
        } else if (field675 && field689 < 2) {
            var3 = field635 + class295.field3701 + field636 + " " + class92.field1221;
        } else {
            String var4;
            if (var2 < 0) {
                var4 = "";
            } else if (field709[var2].length() > 0) {
                var4 = field700[var2] + class295.field3701 + field709[var2];
            } else {
                var4 = field700[var2];
            }
            var3 = var4;
        }
        if (field689 > 2) {
            var3 = var3 + class92.method2397(16777215) + " " + '/' + " " + (field689 - 2) + class295.field3636;
        }
        Statics.field1559.method5537(var3, arg0 + 4, arg1 + 15, 16777215, 0, field481 / 1000);
    }

    @ObfuscatedName("t.ij(I)V")
    public static final void method22() {
        int var0 = Statics.field3960;
        int var1 = Statics.field4152;
        int var2 = Statics.field2555;
        int var3 = Statics.field1333;
        int var4 = 6116423;
        class428.method6943(var0, var1, var2, var3, var4);
        class428.method6943(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class428.method6994(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1559.method5462(class295.field3614, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field227;
        int var6 = class33.field228;
        for (int var7 = 0; var7 < field689; var7++) {
            int var8 = (field689 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class327 var10 = Statics.field1559;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field709[var7].length() > 0) {
                var11 = field700[var7] + class295.field3701 + field709[var7];
            } else {
                var11 = field700[var7];
            }
            var10.method5462(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field3960;
        int var13 = Statics.field4152;
        int var14 = Statics.field2555;
        int var15 = Statics.field1333;
        for (int var16 = 0; var16 < field684; var16++) {
            if (field625[var16] + field592[var16] > var12 && field625[var16] < var12 + var14 && field692[var16] + field471[var16] > var13 && field471[var16] < var13 + var15) {
                field687[var16] = true;
            }
        }
    }

    @ObfuscatedName("g.id(I)Z")
    public static final boolean method196() {
        return field522;
    }

    @ObfuscatedName("o.iv(IIIII)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field684; var4++) {
            if (field625[var4] + field592[var4] > arg0 && field625[var4] < arg0 + arg2 && field692[var4] + field471[var4] > arg1 && field471[var4] < arg1 + arg3) {
                field505[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ip(B)V")
    public final void method1098() {
        method1050();
        if (Statics.field1625 != null || field713 != null) {
            return;
        }
        int var1 = class33.field234;
        if (field522) {
            if (var1 != 1 && (Statics.field1666 || var1 != 4)) {
                int var2 = class33.field227;
                int var3 = class33.field228;
                if (var2 < Statics.field3960 - 10 || var2 > Statics.field3960 + Statics.field2555 + 10 || var3 < Statics.field4152 - 10 || var3 > Statics.field4152 + Statics.field1333 + 10) {
                    field522 = false;
                    method116(Statics.field3960, Statics.field4152, Statics.field2555, Statics.field1333);
                }
            }
            if (var1 == 1 || !Statics.field1666 && var1 == 4) {
                int var4 = Statics.field3960;
                int var5 = Statics.field4152;
                int var6 = Statics.field2555;
                int var7 = class33.field235;
                int var8 = class33.field236;
                int var9 = -1;
                for (int var10 = 0; var10 < field689; var10++) {
                    int var11 = (field689 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    method283(var9);
                }
                field522 = false;
                method116(Statics.field3960, Statics.field4152, Statics.field2555, Statics.field1333);
            }
            return;
        }
        int var12 = method2420();
        if ((var1 == 1 || !Statics.field1666 && var1 == 4) && var12 >= 0) {
            int var13 = field617[var12];
            if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                int var14 = field615[var12];
                int var15 = field616[var12];
                class281 var16 = class281.method1956(var15);
                if (class282.method4543(method5970(var16)) || class282.method641(method5970(var16))) {
                    if (Statics.field1625 != null && !field573 && field689 > 0 && !this.method1100()) {
                        int var17 = field586;
                        int var18 = field587;
                        method4043(Statics.field1188, var17, var18);
                        Statics.field1188 = null;
                    }
                    field573 = false;
                    field590 = 0;
                    if (Statics.field1625 != null) {
                        method2020(Statics.field1625);
                    }
                    Statics.field1625 = class281.method1956(var15);
                    field624 = var14;
                    field586 = class33.field235;
                    field587 = class33.field236;
                    if (var12 >= 0) {
                        method231(var12);
                    }
                    method2020(Statics.field1625);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field1666 && var1 == 4) && this.method1100()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field1666 && var1 == 4) && field689 > 0) {
            method283(var12);
        }
        if (var1 == 2 && field689 > 0) {
            this.method1574(class33.field235, class33.field236);
        }
    }

    @ObfuscatedName("client.ig(I)Z")
    public final boolean method1100() {
        int var1 = method2420();
        boolean var2 = field612 == 1 && field689 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field617[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            var2 = var3;
        }
        return var2 && !field621[var1];
    }

    @ObfuscatedName("client.im(III)V")
    public final void method1574(int arg0, int arg1) {
        method638(arg0, arg1);
        Statics.field24.method3671(Statics.field110, arg0, arg1, false);
        field522 = true;
    }

    @ObfuscatedName("fv.ib(I)V")
    public static void method2845() {
        method638(Statics.field2555 / 2 + Statics.field3960, Statics.field4152);
    }

    @ObfuscatedName("az.ia(IIB)V")
    public static void method638(int arg0, int arg1) {
        int var2 = Statics.field1559.method5487(class295.field3614);
        for (int var3 = 0; var3 < field689; var3++) {
            class327 var4 = Statics.field1559;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field709[var3].length() > 0) {
                var5 = field700[var3] + class295.field3701 + field709[var3];
            } else {
                var5 = field700[var3];
            }
            int var6 = var4.method5487(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field689 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2137) {
            var8 = Statics.field2137 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2535) {
            var9 = Statics.field2535 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field3960 = var8;
        Statics.field4152 = var9;
        Statics.field2555 = var2;
        Statics.field1333 = field689 * 15 + 22;
    }

    @ObfuscatedName("u.ik(IB)V")
    public static final void method283(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field615[arg0];
        int var2 = field616[arg0];
        int var3 = field617[arg0];
        int var4 = field541[arg0];
        String var5 = field700[arg0];
        String var6 = field709[arg0];
        method1020(var1, var2, var3, var4, var5, var6, class33.field235, class33.field236);
    }

    @ObfuscatedName("ho.iy(Lbb;III)V")
    public static final void method4043(class67 arg0, int arg1, int arg2) {
        method1020(arg0.field855, arg0.field849, arg0.field851, arg0.field848, arg0.field852, arg0.field852, arg1, arg2);
    }

    @ObfuscatedName("bp.io(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1020(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 51) {
            class83 var8 = field653[arg3];
            if (var8 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var9 = Statics.method3174(class253.field2886, field690.field1286);
                var9.field2930.method6841(class24.field156[82] ? 1 : 0);
                var9.field2930.method6706(arg3);
                field690.method2328(var9);
            }
        }
        if (arg2 == 16) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var10 = Statics.method3174(class253.field2883, field690.field1286);
            var10.field2930.method6654(Statics.field1598);
            var10.field2930.method6654(Statics.field3171);
            var10.field2930.method6654(Statics.field1240 + arg1);
            var10.field2930.method6801(arg3);
            var10.field2930.method6835(Statics.field3074);
            var10.field2930.method6651(class24.field156[82] ? 1 : 0);
            var10.field2930.method6801(Statics.field1533 + arg0);
            field690.method2328(var10);
        }
        if (arg2 == 49) {
            class83 var11 = field653[arg3];
            if (var11 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var12 = Statics.method3174(class253.field2864, field690.field1286);
                var12.field2930.method6698(class24.field156[82] ? 1 : 0);
                var12.field2930.method6706(arg3);
                field690.method2328(var12);
            }
        }
        if (arg2 == 44) {
            class83 var13 = field653[arg3];
            if (var13 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var14 = Statics.method3174(class253.field2888, field690.field1286);
                var14.field2930.method6651(class24.field156[82] ? 1 : 0);
                var14.field2930.method6706(arg3);
                field690.method2328(var14);
            }
        }
        if (arg2 == 7) {
            class91 var15 = field699[arg3];
            if (var15 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var16 = Statics.method3174(class253.field2841, field690.field1286);
                var16.field2930.method6706(Statics.field1598);
                var16.field2930.method6670(class24.field156[82] ? 1 : 0);
                var16.field2930.method6706(arg3);
                var16.field2930.method6835(Statics.field3074);
                var16.field2930.method6706(Statics.field3171);
                field690.method2328(var16);
            }
        }
        if (arg2 == 43) {
            class255 var17 = Statics.method3174(class253.field2844, field690.field1286);
            var17.field2930.method6656(arg1);
            var17.field2930.method6654(arg0);
            var17.field2930.method6654(arg3);
            field690.method2328(var17);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 20) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var18 = Statics.method3174(class253.field2819, field690.field1286);
            var18.field2930.method6801(Statics.field1533 + arg0);
            var18.field2930.method6654(arg3);
            var18.field2930.method6841(class24.field156[82] ? 1 : 0);
            var18.field2930.method6657(Statics.field1240 + arg1);
            field690.method2328(var18);
        }
        if (arg2 == 26) {
            method25();
        }
        if (arg2 == 42) {
            class255 var19 = Statics.method3174(class253.field2804, field690.field1286);
            var19.field2930.method6801(arg0);
            var19.field2930.method6717(arg1);
            var19.field2930.method6706(arg3);
            field690.method2328(var19);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 48) {
            class83 var20 = field653[arg3];
            if (var20 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var21 = Statics.method3174(class253.field2893, field690.field1286);
                var21.field2930.method6654(arg3);
                var21.field2930.method6670(class24.field156[82] ? 1 : 0);
                field690.method2328(var21);
            }
        }
        if (arg2 == 36) {
            class255 var22 = Statics.method3174(class253.field2848, field690.field1286);
            var22.field2930.method6835(arg1);
            var22.field2930.method6657(arg0);
            var22.field2930.method6706(arg3);
            field690.method2328(var22);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 1001) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var23 = Statics.method3174(class253.field2827, field690.field1286);
            var23.field2930.method6706(Statics.field1240 + arg1);
            var23.field2930.method6698(class24.field156[82] ? 1 : 0);
            var23.field2930.method6801(Statics.field1533 + arg0);
            var23.field2930.method6657(arg3);
            field690.method2328(var23);
        }
        if (arg2 == 17) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var24 = Statics.method3174(class253.field2836, field690.field1286);
            var24.field2930.method6706(Statics.field1240 + arg1);
            var24.field2930.method6654(field633);
            var24.field2930.method6651(class24.field156[82] ? 1 : 0);
            var24.field2930.method6656(Statics.field109);
            var24.field2930.method6654(Statics.field1533 + arg0);
            var24.field2930.method6801(arg3);
            var24.field2930.method6654(field634);
            field690.method2328(var24);
        }
        if (arg2 == 2) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var25 = Statics.method3174(class253.field2851, field690.field1286);
            var25.field2930.method6801(field633);
            var25.field2930.method6698(class24.field156[82] ? 1 : 0);
            var25.field2930.method6835(Statics.field109);
            var25.field2930.method6706(field634);
            var25.field2930.method6801(Statics.field1533 + arg0);
            var25.field2930.method6801(arg3);
            var25.field2930.method6801(Statics.field1240 + arg1);
            field690.method2328(var25);
        }
        if (arg2 == 50) {
            class83 var26 = field653[arg3];
            if (var26 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var27 = Statics.method3174(class253.field2907, field690.field1286);
                var27.field2930.method6670(class24.field156[82] ? 1 : 0);
                var27.field2930.method6801(arg3);
                field690.method2328(var27);
            }
        }
        if (arg2 == 10) {
            class91 var28 = field699[arg3];
            if (var28 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var29 = Statics.method3174(class253.field2866, field690.field1286);
                var29.field2930.method6670(class24.field156[82] ? 1 : 0);
                var29.field2930.method6706(arg3);
                field690.method2328(var29);
            }
        }
        if (arg2 == 1002) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            class255 var30 = Statics.method3174(class253.field2816, field690.field1286);
            var30.field2930.method6657(arg3);
            field690.method2328(var30);
        }
        if (arg2 == 12) {
            class91 var31 = field699[arg3];
            if (var31 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var32 = Statics.method3174(class253.field2873, field690.field1286);
                var32.field2930.method6654(arg3);
                var32.field2930.method6841(class24.field156[82] ? 1 : 0);
                field690.method2328(var32);
            }
        }
        if (arg2 == 28) {
            class255 var33 = Statics.method3174(class253.field2843, field690.field1286);
            var33.field2930.method6656(arg1);
            field690.method2328(var33);
            class281 var34 = class281.method1956(arg1);
            if (var34.field3348 != null && var34.field3348[0][0] == 5) {
                int var35 = var34.field3348[0][1];
                class276.field3185[var35] = 1 - class276.field3185[var35];
                method4944(var35);
            }
        }
        if (arg2 == 31) {
            class255 var36 = Statics.method3174(class253.field2805, field690.field1286);
            var36.field2930.method6657(arg0);
            var36.field2930.method6654(Statics.field1598);
            var36.field2930.method6657(arg3);
            var36.field2930.method6656(Statics.field3074);
            var36.field2930.method6717(arg1);
            var36.field2930.method6706(Statics.field3171);
            field690.method2328(var36);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 33) {
            class255 var37 = Statics.method3174(class253.field2875, field690.field1286);
            var37.field2930.method6656(arg1);
            var37.field2930.method6657(arg0);
            var37.field2930.method6657(arg3);
            field690.method2328(var37);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 24) {
            class281 var38 = class281.method1956(arg1);
            boolean var39 = true;
            if (var38.field3230 > 0) {
                var39 = method321(var38);
            }
            if (var39) {
                class255 var40 = Statics.method3174(class253.field2843, field690.field1286);
                var40.field2930.method6656(arg1);
                field690.method2328(var40);
            }
        }
        if (arg2 == 4) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var41 = Statics.method3174(class253.field2897, field690.field1286);
            var41.field2930.method6706(Statics.field1240 + arg1);
            var41.field2930.method6841(class24.field156[82] ? 1 : 0);
            var41.field2930.method6657(Statics.field1533 + arg0);
            var41.field2930.method6706(arg3);
            field690.method2328(var41);
        }
        if (arg2 == 37) {
            class255 var42 = Statics.method3174(class253.field2803, field690.field1286);
            var42.field2930.method6717(arg1);
            var42.field2930.method6801(arg0);
            var42.field2930.method6654(arg3);
            field690.method2328(var42);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 15) {
            class83 var43 = field653[arg3];
            if (var43 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var44 = Statics.method3174(class253.field2821, field690.field1286);
                var44.field2930.method6715(Statics.field109);
                var44.field2930.method6654(field634);
                var44.field2930.method6651(class24.field156[82] ? 1 : 0);
                var44.field2930.method6657(arg3);
                var44.field2930.method6706(field633);
                field690.method2328(var44);
            }
        }
        if (arg2 == 45) {
            class83 var45 = field653[arg3];
            if (var45 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var46 = Statics.method3174(class253.field2814, field690.field1286);
                var46.field2930.method6651(class24.field156[82] ? 1 : 0);
                var46.field2930.method6801(arg3);
                field690.method2328(var46);
            }
        }
        if (arg2 == 3) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var47 = Statics.method3174(class253.field2884, field690.field1286);
            var47.field2930.method6706(Statics.field1533 + arg0);
            var47.field2930.method6654(arg3);
            var47.field2930.method6801(Statics.field1240 + arg1);
            var47.field2930.method6698(class24.field156[82] ? 1 : 0);
            field690.method2328(var47);
        }
        if (arg2 == 30 && field643 == null) {
            method4969(arg1, arg0);
            field643 = class281.method2602(arg1, arg0);
            method2020(field643);
        }
        if (arg2 == 21) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var48 = Statics.method3174(class253.field2824, field690.field1286);
            var48.field2930.method6657(Statics.field1240 + arg1);
            var48.field2930.method6651(class24.field156[82] ? 1 : 0);
            var48.field2930.method6654(arg3);
            var48.field2930.method6706(Statics.field1533 + arg0);
            field690.method2328(var48);
        }
        if (arg2 == 34) {
            class255 var49 = Statics.method3174(class253.field2834, field690.field1286);
            var49.field2930.method6706(arg3);
            var49.field2930.method6706(arg0);
            var49.field2930.method6715(arg1);
            field690.method2328(var49);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1262.method6258(arg2, arg3, new class277(arg0), new class277(arg1));
        }
        if (arg2 == 1004) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            class255 var50 = Statics.method3174(class253.field2903, field690.field1286);
            var50.field2930.method6706(arg3);
            field690.method2328(var50);
        }
        if (arg2 == 1) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var51 = Statics.method3174(class253.field2832, field690.field1286);
            var51.field2930.method6698(class24.field156[82] ? 1 : 0);
            var51.field2930.method6654(arg3);
            var51.field2930.method6654(Statics.field1598);
            var51.field2930.method6706(Statics.field1240 + arg1);
            var51.field2930.method6715(Statics.field3074);
            var51.field2930.method6657(Statics.field3171);
            var51.field2930.method6657(Statics.field1533 + arg0);
            field690.method2328(var51);
        }
        if (arg2 == 47) {
            class83 var52 = field653[arg3];
            if (var52 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var53 = Statics.method3174(class253.field2808, field690.field1286);
                var53.field2930.method6657(arg3);
                var53.field2930.method6841(class24.field156[82] ? 1 : 0);
                field690.method2328(var53);
            }
        }
        if (arg2 == 35) {
            class255 var54 = Statics.method3174(class253.field2818, field690.field1286);
            var54.field2930.method6657(arg0);
            var54.field2930.method6657(arg3);
            var54.field2930.method6656(arg1);
            field690.method2328(var54);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 29) {
            class255 var55 = Statics.method3174(class253.field2843, field690.field1286);
            var55.field2930.method6656(arg1);
            field690.method2328(var55);
            class281 var56 = class281.method1956(arg1);
            if (var56.field3348 != null && var56.field3348[0][0] == 5) {
                int var57 = var56.field3348[0][1];
                if (class276.field3185[var57] != var56.field3310[0]) {
                    class276.field3185[var57] = var56.field3310[0];
                    method4944(var57);
                }
            }
        }
        if (arg2 == 13) {
            class91 var58 = field699[arg3];
            if (var58 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var59 = Statics.method3174(class253.field2877, field690.field1286);
                var59.field2930.method6706(arg3);
                var59.field2930.method6670(class24.field156[82] ? 1 : 0);
                field690.method2328(var59);
            }
        }
        if (arg2 == 39) {
            class255 var60 = Statics.method3174(class253.field2845, field690.field1286);
            var60.field2930.method6717(arg1);
            var60.field2930.method6801(arg0);
            var60.field2930.method6654(arg3);
            field690.method2328(var60);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 14) {
            class83 var61 = field653[arg3];
            if (var61 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var62 = Statics.method3174(class253.field2865, field690.field1286);
                var62.field2930.method6706(Statics.field1598);
                var62.field2930.method6835(Statics.field3074);
                var62.field2930.method6651(class24.field156[82] ? 1 : 0);
                var62.field2930.method6801(Statics.field3171);
                var62.field2930.method6706(arg3);
                field690.method2328(var62);
            }
        }
        if (arg2 == 18) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var63 = Statics.method3174(class253.field2837, field690.field1286);
            var63.field2930.method6706(Statics.field1533 + arg0);
            var63.field2930.method6657(arg3);
            var63.field2930.method6657(Statics.field1240 + arg1);
            var63.field2930.method6651(class24.field156[82] ? 1 : 0);
            field690.method2328(var63);
        }
        if (arg2 == 32) {
            class255 var64 = Statics.method3174(class253.field2887, field690.field1286);
            var64.field2930.method6654(arg0);
            var64.field2930.method6717(arg1);
            var64.field2930.method6801(field633);
            var64.field2930.method6654(arg3);
            var64.field2930.method6656(Statics.field109);
            field690.method2328(var64);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 46) {
            class83 var65 = field653[arg3];
            if (var65 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var66 = Statics.method3174(class253.field2828, field690.field1286);
                var66.field2930.method6706(arg3);
                var66.field2930.method6651(class24.field156[82] ? 1 : 0);
                field690.method2328(var66);
            }
        }
        if (arg2 == 38) {
            method2201();
            class281 var67 = class281.method1956(arg1);
            field630 = 1;
            Statics.field3171 = arg0;
            Statics.field3074 = arg1;
            Statics.field1598 = arg3;
            method2020(var67);
            field743 = class92.method2397(16748608) + class181.method2432(arg3).field2014 + class92.method2397(16777215);
            if (field743 == null) {
                field743 = class295.field3477;
            }
            return;
        }
        if (arg2 == 9) {
            class91 var68 = field699[arg3];
            if (var68 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var69 = Statics.method3174(class253.field2840, field690.field1286);
                var69.field2930.method6657(arg3);
                var69.field2930.method6651(class24.field156[82] ? 1 : 0);
                field690.method2328(var69);
            }
        }
        if (arg2 == 6) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var70 = Statics.method3174(class253.field2871, field690.field1286);
            var70.field2930.method6801(arg3);
            var70.field2930.method6698(class24.field156[82] ? 1 : 0);
            var70.field2930.method6801(Statics.field1240 + arg1);
            var70.field2930.method6801(Statics.field1533 + arg0);
            field690.method2328(var70);
        }
        if (arg2 == 23) {
            if (field522) {
                Statics.field24.method3672();
            } else {
                Statics.field24.method3671(Statics.field110, arg0, arg1, true);
            }
        }
        if (arg2 == 58) {
            class281 var71 = class281.method2602(arg1, arg0);
            if (var71 != null) {
                class255 var72 = Statics.method3174(class253.field2810, field690.field1286);
                var72.field2930.method6654(var71.field3269);
                var72.field2930.method6835(arg1);
                var72.field2930.method6801(field633);
                var72.field2930.method6706(arg0);
                var72.field2930.method6717(Statics.field109);
                var72.field2930.method6654(field634);
                field690.method2328(var72);
            }
        }
        if (arg2 == 5) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var73 = Statics.method3174(class253.field2857, field690.field1286);
            var73.field2930.method6801(arg3);
            var73.field2930.method6801(Statics.field1240 + arg1);
            var73.field2930.method6654(Statics.field1533 + arg0);
            var73.field2930.method6651(class24.field156[82] ? 1 : 0);
            field690.method2328(var73);
        }
        if (arg2 == 1005) {
            class281 var74 = class281.method1956(arg1);
            if (var74 == null || var74.field3222[arg0] < 100000) {
                class255 var75 = Statics.method3174(class253.field2903, field690.field1286);
                var75.field2930.method6706(arg3);
                field690.method2328(var75);
            } else {
                class98.method3622(27, "", var74.field3222[arg0] + " x " + class181.method2432(arg3).field2014);
            }
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 8) {
            class91 var76 = field699[arg3];
            if (var76 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var77 = Statics.method3174(class253.field2902, field690.field1286);
                var77.field2930.method6715(Statics.field109);
                var77.field2930.method6706(field634);
                var77.field2930.method6654(field633);
                var77.field2930.method6698(class24.field156[82] ? 1 : 0);
                var77.field2930.method6654(arg3);
                field690.method2328(var77);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class281 var78 = class281.method2602(arg1, arg0);
            if (var78 != null) {
                method800(arg3, arg1, arg0, var78.field3269, arg5);
            }
        }
        if (arg2 == 19) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var79 = Statics.method3174(class253.field2839, field690.field1286);
            var79.field2930.method6670(class24.field156[82] ? 1 : 0);
            var79.field2930.method6801(Statics.field1240 + arg1);
            var79.field2930.method6801(arg3);
            var79.field2930.method6657(Statics.field1533 + arg0);
            field690.method2328(var79);
        }
        if (arg2 == 40) {
            class255 var80 = Statics.method3174(class253.field2872, field690.field1286);
            var80.field2930.method6656(arg1);
            var80.field2930.method6801(arg3);
            var80.field2930.method6801(arg0);
            field690.method2328(var80);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 22) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            field502 = arg0;
            field678 = arg1;
            class255 var81 = Statics.method3174(class253.field2869, field690.field1286);
            var81.field2930.method6706(Statics.field1533 + arg0);
            var81.field2930.method6657(Statics.field1240 + arg1);
            var81.field2930.method6706(arg3);
            var81.field2930.method6670(class24.field156[82] ? 1 : 0);
            field690.method2328(var81);
        }
        if (arg2 == 41) {
            class255 var82 = Statics.method3174(class253.field2811, field690.field1286);
            var82.field2930.method6706(arg3);
            var82.field2930.method6656(arg1);
            var82.field2930.method6706(arg0);
            field690.method2328(var82);
            field583 = 0;
            Statics.field2723 = class281.method1956(arg1);
            field600 = arg0;
        }
        if (arg2 == 11) {
            class91 var83 = field699[arg3];
            if (var83 != null) {
                field628 = arg6;
                field579 = arg7;
                field558 = 2;
                field555 = 0;
                field502 = arg0;
                field678 = arg1;
                class255 var84 = Statics.method3174(class253.field2813, field690.field1286);
                var84.field2930.method6801(arg3);
                var84.field2930.method6651(class24.field156[82] ? 1 : 0);
                field690.method2328(var84);
            }
        }
        if (arg2 == 1003) {
            field628 = arg6;
            field579 = arg7;
            field558 = 2;
            field555 = 0;
            class91 var85 = field699[arg3];
            if (var85 != null) {
                class171 var86 = var85.field1215;
                if (var86.field1838 != null) {
                    var86 = var86.method3014();
                }
                if (var86 != null) {
                    class255 var87 = Statics.method3174(class253.field2830, field690.field1286);
                    var87.field2930.method6706(var86.field1850);
                    field690.method2328(var87);
                }
            }
        }
        if (arg2 != 25) {
            if (field630 != 0) {
                field630 = 0;
                method2020(class281.method1956(Statics.field3074));
            }
            if (field675) {
                method2201();
            }
            if (Statics.field2723 != null && field583 == 0) {
                method2020(Statics.field2723);
            }
            return;
        }
        class281 var88 = class281.method2602(arg1, arg0);
        if (var88 == null) {
            return;
        }
        method2201();
        method2368(arg1, arg0, class282.method6545(method5970(var88)), var88.field3269);
        field630 = 0;
        field635 = method1934(var88);
        if (field635 == null) {
            field635 = class295.field3477;
        }
        if (var88.field3250) {
            field636 = var88.field3305 + class92.method2397(16777215);
        } else {
            field636 = class92.method2397(65280) + var88.field3352 + class92.method2397(16777215);
        }
    }

    @ObfuscatedName("ep.ic(ILjava/lang/String;I)V")
    public static void method2631(int arg0, String arg1) {
        int var2 = class96.field1246;
        int[] var3 = class96.field1250;
        boolean var4 = false;
        class440 var5 = new class440(arg1, Statics.field2283);
        for (int var6 = 0; var6 < var2; var6++) {
            class83 var7 = field653[var3[var6]];
            if (var7 != null && Statics.field4070 != var7 && var7.field1071 != null && var7.field1071.equals(var5)) {
                if (arg0 == 1) {
                    class255 var8 = Statics.method3174(class253.field2888, field690.field1286);
                    var8.field2930.method6651(0);
                    var8.field2930.method6706(var3[var6]);
                    field690.method2328(var8);
                } else if (arg0 == 4) {
                    class255 var9 = Statics.method3174(class253.field2808, field690.field1286);
                    var9.field2930.method6657(var3[var6]);
                    var9.field2930.method6841(0);
                    field690.method2328(var9);
                } else if (arg0 == 6) {
                    class255 var10 = Statics.method3174(class253.field2864, field690.field1286);
                    var10.field2930.method6698(0);
                    var10.field2930.method6706(var3[var6]);
                    field690.method2328(var10);
                } else if (arg0 == 7) {
                    class255 var11 = Statics.method3174(class253.field2907, field690.field1286);
                    var11.field2930.method6670(0);
                    var11.field2930.method6801(var3[var6]);
                    field690.method2328(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class98.method3622(4, "", class295.field3651 + arg1);
        }
    }

    @ObfuscatedName("cf.iz(IIIII)V")
    public static void method2368(int arg0, int arg1, int arg2, int arg3) {
        class281 var4 = class281.method2602(arg0, arg1);
        if (var4 != null && var4.field3350 != null) {
            class81 var5 = new class81();
            var5.field1017 = var4;
            var5.field1031 = var4.field3350;
            class64.method4965(var5);
        }
        field634 = arg3;
        field675 = true;
        Statics.field109 = arg0;
        field633 = arg1;
        Statics.field1225 = arg2;
        method2020(var4);
    }

    @ObfuscatedName("cs.iq(I)V")
    public static void method2201() {
        if (!field675) {
            return;
        }
        class281 var0 = class281.method2602(Statics.field109, field633);
        if (var0 != null && var0.field3324 != null) {
            class81 var1 = new class81();
            var1.field1017 = var0;
            var1.field1031 = var0.field3324;
            class64.method4965(var1);
        }
        field634 = -1;
        field675 = false;
        method2020(var0);
    }

    @ObfuscatedName("kt.is(III)V")
    public static void method4969(int arg0, int arg1) {
        class255 var2 = Statics.method3174(class253.field2874, field690.field1286);
        var2.field2930.method6657(arg1);
        var2.field2930.method6715(arg0);
        field690.method2328(var2);
    }

    @ObfuscatedName("aa.ie(IIIILjava/lang/String;I)V")
    public static void method800(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class281 var5 = class281.method2602(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3332 != null) {
            class81 var6 = new class81();
            var6.field1017 = var5;
            var6.field1022 = arg0;
            var6.field1027 = arg4;
            var6.field1031 = var5.field3332;
            class64.method4965(var6);
        }
        boolean var7 = true;
        if (var5.field3230 > 0) {
            var7 = method321(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method5970(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class255 var11 = Statics.method3174(class253.field2892, field690.field1286);
            var11.field2930.method6656(arg1);
            var11.field2930.method6654(arg2);
            var11.field2930.method6654(arg3);
            field690.method2328(var11);
        }
        if (arg0 == 2) {
            class255 var12 = Statics.method3174(class253.field2881, field690.field1286);
            var12.field2930.method6656(arg1);
            var12.field2930.method6654(arg2);
            var12.field2930.method6654(arg3);
            field690.method2328(var12);
        }
        if (arg0 == 3) {
            class255 var13 = Statics.method3174(class253.field2835, field690.field1286);
            var13.field2930.method6656(arg1);
            var13.field2930.method6654(arg2);
            var13.field2930.method6654(arg3);
            field690.method2328(var13);
        }
        if (arg0 == 4) {
            class255 var14 = Statics.method3174(class253.field2822, field690.field1286);
            var14.field2930.method6656(arg1);
            var14.field2930.method6654(arg2);
            var14.field2930.method6654(arg3);
            field690.method2328(var14);
        }
        if (arg0 == 5) {
            class255 var15 = Statics.method3174(class253.field2878, field690.field1286);
            var15.field2930.method6656(arg1);
            var15.field2930.method6654(arg2);
            var15.field2930.method6654(arg3);
            field690.method2328(var15);
        }
        if (arg0 == 6) {
            class255 var16 = Statics.method3174(class253.field2867, field690.field1286);
            var16.field2930.method6656(arg1);
            var16.field2930.method6654(arg2);
            var16.field2930.method6654(arg3);
            field690.method2328(var16);
        }
        if (arg0 == 7) {
            class255 var17 = Statics.method3174(class253.field2823, field690.field1286);
            var17.field2930.method6656(arg1);
            var17.field2930.method6654(arg2);
            var17.field2930.method6654(arg3);
            field690.method2328(var17);
        }
        if (arg0 == 8) {
            class255 var18 = Statics.method3174(class253.field2885, field690.field1286);
            var18.field2930.method6656(arg1);
            var18.field2930.method6654(arg2);
            var18.field2930.method6654(arg3);
            field690.method2328(var18);
        }
        if (arg0 == 9) {
            class255 var19 = Statics.method3174(class253.field2831, field690.field1286);
            var19.field2930.method6656(arg1);
            var19.field2930.method6654(arg2);
            var19.field2930.method6654(arg3);
            field690.method2328(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class255 var20 = Statics.method3174(class253.field2854, field690.field1286);
        var20.field2930.method6656(arg1);
        var20.field2930.method6654(arg2);
        var20.field2930.method6654(arg3);
        field690.method2328(var20);
    }

    @ObfuscatedName("br.in(I)V")
    public static final void method1050() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field689 - 1; var1++) {
                if (field617[var1] < 1000 && field617[var1 + 1] > 1000) {
                    String var2 = field709[var1];
                    field709[var1] = field709[var1 + 1];
                    field709[var1 + 1] = var2;
                    String var3 = field700[var1];
                    field700[var1] = field700[var1 + 1];
                    field700[var1 + 1] = var3;
                    int var4 = field617[var1];
                    field617[var1] = field617[var1 + 1];
                    field617[var1 + 1] = var4;
                    int var5 = field615[var1];
                    field615[var1] = field615[var1 + 1];
                    field615[var1 + 1] = var5;
                    int var6 = field616[var1];
                    field616[var1] = field616[var1 + 1];
                    field616[var1 + 1] = var6;
                    int var7 = field541[var1];
                    field541[var1] = field541[var1 + 1];
                    field541[var1 + 1] = var7;
                    boolean var8 = field621[var1];
                    field621[var1] = field621[var1 + 1];
                    field621[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("v.iu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method118(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method329(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("q.if(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method329(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field522 || field689 >= 500) {
            return;
        }
        field700[field689] = arg0;
        field709[field689] = arg1;
        field617[field689] = arg2;
        field541[field689] = arg3;
        field615[field689] = arg4;
        field616[field689] = arg5;
        field621[field689] = arg6;
        field689++;
    }

    @ObfuscatedName("dv.iw(I)I")
    public static final int method2420() {
        return field689 - 1;
    }

    @ObfuscatedName("ew.ix(I)V")
    public static void method2807() {
        for (int var0 = 0; var0 < field689; var0++) {
            if (method2858(field617[var0])) {
                if (var0 < field689 - 1) {
                    for (int var1 = var0; var1 < field689 - 1; var1++) {
                        field700[var1] = field700[var1 + 1];
                        field709[var1] = field709[var1 + 1];
                        field617[var1] = field617[var1 + 1];
                        field541[var1] = field541[var1 + 1];
                        field615[var1] = field615[var1 + 1];
                        field616[var1] = field616[var1 + 1];
                        field621[var1] = field621[var1 + 1];
                    }
                }
                var0--;
                field689--;
            }
        }
        method2845();
    }

    @ObfuscatedName("fu.ir(IB)Z")
    public static boolean method2858(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("gx.ih(IIIIB)V")
    public static final void method3516(int arg0, int arg1, int arg2, int arg3) {
        if (field630 == 0 && !field675) {
            method118(class295.field3637, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class205.method2493(); var8++) {
            long var9 = class205.method1873(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class205.method3309(var8);
                long var12 = class205.field2505[var8];
                int var14 = (int) (var12 >>> 7 & 0x7FL);
                int var16 = var14;
                int var17 = class205.method2501(var8);
                int var18 = class205.method2352(class205.field2505[var8]);
                int var19 = var18;
                if (var17 == 2 && Statics.field24.method3794(Statics.field110, var11, var14, var9) >= 0) {
                    class180 var20 = class180.method2760(var18);
                    if (var20.field1981 != null) {
                        var20 = var20.method3208();
                    }
                    if (var20 == null) {
                        continue;
                    }
                    if (field630 == 1) {
                        method118(class295.field3632, field743 + " " + class92.field1221 + " " + class92.method2397(65535) + var20.field1962, 1, var18, var11, var14);
                    } else if (!field675) {
                        String[] var21 = var20.field1979;
                        if (var21 != null) {
                            for (int var22 = 4; var22 >= 0; var22--) {
                                if (var21[var22] != null) {
                                    short var23 = 0;
                                    if (var22 == 0) {
                                        var23 = 3;
                                    }
                                    if (var22 == 1) {
                                        var23 = 4;
                                    }
                                    if (var22 == 2) {
                                        var23 = 5;
                                    }
                                    if (var22 == 3) {
                                        var23 = 6;
                                    }
                                    if (var22 == 4) {
                                        var23 = 1001;
                                    }
                                    method118(var21[var22], class92.method2397(65535) + var20.field1962, var23, var19, var11, var16);
                                }
                            }
                        }
                        method118(class295.field3633, class92.method2397(65535) + var20.field1962, 1002, var20.field1951, var11, var16);
                    } else if ((Statics.field1225 & 0x4) == 4) {
                        method118(field635, field636 + " " + class92.field1221 + " " + class92.method2397(65535) + var20.field1962, 2, var18, var11, var14);
                    }
                }
                if (var17 == 1) {
                    class91 var24 = field699[var19];
                    if (var24 == null) {
                        continue;
                    }
                    if (var24.field1215.field1839 == 1 && (var24.field1130 & 0x7F) == 64 && (var24.field1090 & 0x7F) == 64) {
                        for (int var25 = 0; var25 < field519; var25++) {
                            class91 var26 = field699[field520[var25]];
                            if (var26 != null && var24 != var26 && var26.field1215.field1839 == 1 && var24.field1130 == var26.field1130 && var24.field1090 == var26.field1090) {
                                method5196(var26, field520[var25], var11, var16);
                            }
                        }
                        int var27 = class96.field1246;
                        int[] var28 = class96.field1250;
                        for (int var29 = 0; var29 < var27; var29++) {
                            class83 var30 = field653[var28[var29]];
                            if (var30 != null && var24.field1130 == var30.field1130 && var24.field1090 == var30.field1090) {
                                method4403(var30, var28[var29], var11, var16);
                            }
                        }
                    }
                    method5196(var24, var19, var11, var16);
                }
                if (var17 == 0) {
                    class83 var31 = field653[var19];
                    if (var31 == null) {
                        continue;
                    }
                    if ((var31.field1130 & 0x7F) == 64 && (var31.field1090 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < field519; var32++) {
                            class91 var33 = field699[field520[var32]];
                            if (var33 != null && var33.field1215.field1839 == 1 && var31.field1130 == var33.field1130 && var31.field1090 == var33.field1090) {
                                method5196(var33, field520[var32], var11, var16);
                            }
                        }
                        int var34 = class96.field1246;
                        int[] var35 = class96.field1250;
                        for (int var36 = 0; var36 < var34; var36++) {
                            class83 var37 = field653[var35[var36]];
                            if (var37 != null && var31 != var37 && var31.field1130 == var37.field1130 && var31.field1090 == var37.field1090) {
                                method4403(var37, var35[var36], var11, var16);
                            }
                        }
                    }
                    if (field604 == var19) {
                        var4 = var9;
                    } else {
                        method4403(var31, var19, var11, var16);
                    }
                }
                if (var17 == 3) {
                    class321 var38 = field631[Statics.field110][var11][var16];
                    if (var38 != null) {
                        for (class95 var39 = (class95) var38.method5302(); var39 != null; var39 = (class95) var38.method5315()) {
                            class181 var40 = class181.method2432(var39.field1241);
                            if (field630 == 1) {
                                method118(class295.field3632, field743 + " " + class92.field1221 + " " + class92.method2397(16748608) + var40.field2014, 16, var39.field1241, var11, var16);
                            } else if (!field675) {
                                String[] var41 = var40.field2016;
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 18;
                                        }
                                        if (var42 == 1) {
                                            var43 = 19;
                                        }
                                        if (var42 == 2) {
                                            var43 = 20;
                                        }
                                        if (var42 == 3) {
                                            var43 = 21;
                                        }
                                        if (var42 == 4) {
                                            var43 = 22;
                                        }
                                        method118(var41[var42], class92.method2397(16748608) + var40.field2014, var43, var39.field1241, var11, var16);
                                    } else if (var42 == 2) {
                                        method118(class295.field3470, class92.method2397(16748608) + var40.field2014, 20, var39.field1241, var11, var16);
                                    }
                                }
                                method118(class295.field3633, class92.method2397(16748608) + var40.field2014, 1004, var39.field1241, var11, var16);
                            } else if ((Statics.field1225 & 0x1) == 1) {
                                method118(field635, field636 + " " + class92.field1221 + " " + class92.method2397(16748608) + var40.field2014, 17, var39.field1241, var11, var16);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var44 = class205.method2062(var4);
            int var45 = (int) (var4 >>> 7 & 0x7FL);
            class83 var47 = field653[field604];
            method4403(var47, field604, var44, var45);
        }
    }

    @ObfuscatedName("kc.ii(Lcr;IIII)V")
    public static final void method5196(class91 arg0, int arg1, int arg2, int arg3) {
        class171 var4 = arg0.field1215;
        if (field689 >= 400) {
            return;
        }
        if (var4.field1838 != null) {
            var4 = var4.method3014();
        }
        if (var4 == null || !var4.field1866 || var4.field1868 && field647 != arg1) {
            return;
        }
        String var5 = var4.field1845;
        if (var4.field1855 != 0 && arg0.field1120 != 0) {
            int var6 = arg0.field1120 == -1 ? var4.field1855 : arg0.field1120;
            var5 = var5 + method2011(var6, Statics.field4070.field1052) + " " + class92.field1224 + class295.field3497 + var6 + class92.field1220;
        }
        if (var4.field1868 && field622) {
            method118(class295.field3633, class92.method2397(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field630 == 1) {
            method118(class295.field3632, field743 + " " + class92.field1221 + " " + class92.method2397(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field675) {
            int var7 = var4.field1868 && field622 ? 2000 : 0;
            String[] var8 = var4.field1857;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && !var8[var9].equalsIgnoreCase(class295.field3487)) {
                        int var10 = 0;
                        if (var9 == 0) {
                            var10 = var7 + 9;
                        }
                        if (var9 == 1) {
                            var10 = var7 + 10;
                        }
                        if (var9 == 2) {
                            var10 = var7 + 11;
                        }
                        if (var9 == 3) {
                            var10 = var7 + 12;
                        }
                        if (var9 == 4) {
                            var10 = var7 + 13;
                        }
                        method118(var8[var9], class92.method2397(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var8[var11] != null && var8[var11].equalsIgnoreCase(class295.field3487)) {
                        short var12 = 0;
                        if (field574 != class94.field1238) {
                            if (field574 == class94.field1232 || field574 == class94.field1236 && var4.field1855 > Statics.field4070.field1052) {
                                var12 = 2000;
                            }
                            int var13 = 0;
                            if (var11 == 0) {
                                var13 = var12 + 9;
                            }
                            if (var11 == 1) {
                                var13 = var12 + 10;
                            }
                            if (var11 == 2) {
                                var13 = var12 + 11;
                            }
                            if (var11 == 3) {
                                var13 = var12 + 12;
                            }
                            if (var11 == 4) {
                                var13 = var12 + 13;
                            }
                            method118(var8[var11], class92.method2397(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1868 || !field622) {
                method118(class295.field3633, class92.method2397(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1225 & 0x2) == 2) {
            method118(field635, field636 + " " + class92.field1221 + " " + class92.method2397(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hx.il(Lck;IIII)V")
    public static final void method4403(class83 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field4070 == arg0 || field689 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1066 == 0) {
            var4 = arg0.field1064[0] + arg0.field1071 + arg0.field1064[1] + method2011(arg0.field1052, Statics.field4070.field1052) + " " + class92.field1224 + class295.field3497 + arg0.field1052 + class92.field1220 + arg0.field1064[2];
        } else {
            var4 = arg0.field1064[0] + arg0.field1071 + arg0.field1064[1] + " " + class92.field1224 + class295.field3639 + arg0.field1066 + class92.field1220 + arg0.field1064[2];
        }
        if (field630 == 1) {
            method118(class295.field3632, field743 + " " + class92.field1221 + " " + class92.method2397(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field675) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field650[var5] != null) {
                    short var6 = 0;
                    if (field650[var5].equalsIgnoreCase(class295.field3487)) {
                        if (field498 == class94.field1238) {
                            continue;
                        }
                        if (field498 == class94.field1232 || field498 == class94.field1236 && arg0.field1052 > Statics.field4070.field1052) {
                            var6 = 2000;
                        }
                        if (Statics.field4070.field1060 == 0 || arg0.field1060 == 0) {
                            if (field498 == class94.field1235 && arg0.method2075()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field4070.field1060 == arg0.field1060) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field602[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field569[var5] + var6;
                    method118(field650[var5], class92.method2397(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1225 & 0x8) == 8) {
            method118(field635, field636 + " " + class92.field1221 + " " + class92.method2397(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field689; var9++) {
            if (field617[var9] == 23) {
                field709[var9] = class92.method2397(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bk.jd(III)Ljava/lang/String;")
    public static final String method2011(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class92.method2397(16711680);
        } else if (var2 < -6) {
            return class92.method2397(16723968);
        } else if (var2 < -3) {
            return class92.method2397(16740352);
        } else if (var2 < 0) {
            return class92.method2397(16756736);
        } else if (var2 > 9) {
            return class92.method2397(65280);
        } else if (var2 > 6) {
            return class92.method2397(4259584);
        } else if (var2 > 3) {
            return class92.method2397(8453888);
        } else if (var2 > 0) {
            return class92.method2397(12648192);
        } else {
            return class92.method2397(16776960);
        }
    }

    @ObfuscatedName("d.jp(IIIIIIIIB)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class281.method4482(arg0)) {
            Statics.field4431 = null;
            method2547(Statics.field1043[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field4431 != null) {
                method2547(Statics.field4431, -1412584499, arg1, arg2, arg3, arg4, Statics.field1946, Statics.field1001, arg7);
                Statics.field4431 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field505[var8] = true;
            }
        } else {
            field505[arg7] = true;
        }
    }

    @ObfuscatedName("dc.jl([Ljm;IIIIIIIII)V")
    public static final void method2547(class281[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class428.method6935(arg2, arg3, arg4, arg5);
        class194.method3544();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class281 var10 = arg0[var9];
            if (var10 != null && (var10.field3245 == arg1 || arg1 == -1412584499 && field713 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field625[field684] = var10.field3327 + arg6;
                    field471[field684] = var10.field3240 + arg7;
                    field592[field684] = var10.field3241;
                    field692[field684] = var10.field3242;
                    var11 = ++field684 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3367 = var11;
                var10.field3368 = field481;
                if (!var10.field3250 || !method4972(var10)) {
                    if (var10.field3230 > 0) {
                        method4380(var10);
                    }
                    int var12 = var10.field3327 + arg6;
                    int var13 = var10.field3240 + arg7;
                    int var14 = var10.field3257;
                    if (field713 == var10) {
                        if (arg1 != -1412584499 && !var10.field3288) {
                            Statics.field4431 = arg0;
                            Statics.field1946 = arg6;
                            Statics.field1001 = arg7;
                            continue;
                        }
                        if (field554 && field532) {
                            int var15 = class33.field227;
                            int var16 = class33.field228;
                            int var17 = var15 - field652;
                            int var18 = var16 - field742;
                            if (var17 < field682) {
                                var17 = field682;
                            }
                            if (var10.field3241 + var17 > field682 + field651.field3241) {
                                var17 = field682 + field651.field3241 - var10.field3241;
                            }
                            if (var18 < field660) {
                                var18 = field660;
                            }
                            if (var10.field3242 + var18 > field660 + field651.field3242) {
                                var18 = field660 + field651.field3242 - var10.field3242;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3288) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3260 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3260 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3241 + var12;
                        int var26 = var10.field3242 + var13;
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
                        int var29 = var10.field3241 + var12;
                        int var30 = var10.field3242 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3250 || var19 < var21 && var20 < var22) {
                        if (var10.field3230 != 0) {
                            if (var10.field3230 == 1336) {
                                if (field488) {
                                    var13 += 15;
                                    Statics.field1386.method5464("Fps:" + field187, var10.field3241 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field473) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1386.method5464("Mem:" + var32 + "k", var10.field3241 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3230 == 1337) {
                                field626 = var12;
                                field627 = var13;
                                method4974(var12, var13, var10.field3241, var10.field3242);
                                field505[var10.field3367] = true;
                                class428.method6935(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3230 == 1338) {
                                method2757(var10, var12, var13, var11);
                                class428.method6935(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3230 == 1339) {
                                method5771(var10, var12, var13, var11);
                                class428.method6935(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3230 == 1400) {
                                Statics.field1262.method6293(var12, var13, var10.field3241, var10.field3242, field481);
                            }
                            if (var10.field3230 == 1401) {
                                Statics.field1262.method6226(var12, var13, var10.field3241, var10.field3242);
                            }
                            if (var10.field3230 == 1402) {
                                Statics.field578.method2149(var12, field481);
                            }
                        }
                        if (var10.field3260 == 0) {
                            if (!var10.field3250 && method4972(var10) && Statics.field8 != var10) {
                                continue;
                            }
                            if (!var10.field3250) {
                                if (var10.field3248 > var10.field3239 - var10.field3242) {
                                    var10.field3248 = var10.field3239 - var10.field3242;
                                }
                                if (var10.field3248 < 0) {
                                    var10.field3248 = 0;
                                }
                            }
                            method2547(arg0, var10.field3226, var19, var20, var21, var22, var12 - var10.field3247, var13 - var10.field3248, var11);
                            if (var10.field3280 != null) {
                                method2547(var10.field3280, var10.field3226, var19, var20, var21, var22, var12 - var10.field3247, var13 - var10.field3248, var11);
                            }
                            class80 var34 = (class80) field638.method6446((long) var10.field3226);
                            if (var34 != null) {
                                method183(var34.field1014, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class428.method6935(arg2, arg3, arg4, arg5);
                            class194.method3544();
                        }
                        if (field695 || field688[var11] || field693 > 1) {
                            if (var10.field3260 == 0 && !var10.field3250 && var10.field3239 > var10.field3242) {
                                method2615(var10.field3241 + var12, var13, var10.field3248, var10.field3242, var10.field3239);
                            }
                            if (var10.field3260 != 1) {
                                if (var10.field3260 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3265; var36++) {
                                        for (int var37 = 0; var37 < var10.field3321; var37++) {
                                            int var38 = (var10.field3293 + 32) * var37 + var12;
                                            int var39 = (var10.field3294 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3356[var35];
                                                var39 += var10.field3296[var35];
                                            }
                                            if (var10.field3354[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3354[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1625 == var10 && field624 == var35) {
                                                    class432 var43;
                                                    if (field630 == 1 && Statics.field3171 == var35 && Statics.field3074 == var10.field3226) {
                                                        var43 = class181.method2985(var42, var10.field3222[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class181.method2985(var42, var10.field3222[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method2020(var10);
                                                    } else if (Statics.field1625 == var10 && field624 == var35) {
                                                        int var44 = class33.field227 - field586;
                                                        int var45 = class33.field228 - field587;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field590 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method7057(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class281 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class428.field4541 && var46.field3248 > 0) {
                                                                int var47 = field539 * (class428.field4541 - var39 - var45) / 3;
                                                                if (var47 > field539 * 10) {
                                                                    var47 = field539 * 10;
                                                                }
                                                                if (var47 > var46.field3248) {
                                                                    var47 = var46.field3248;
                                                                }
                                                                var46.field3248 -= var47;
                                                                field587 += var47;
                                                                method2020(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class428.field4547 && var46.field3248 < var46.field3239 - var46.field3242) {
                                                                int var48 = field539 * (var39 + var45 + 32 - class428.field4547) / 3;
                                                                if (var48 > field539 * 10) {
                                                                    var48 = field539 * 10;
                                                                }
                                                                if (var48 > var46.field3239 - var46.field3242 - var46.field3248) {
                                                                    var48 = var46.field3239 - var46.field3242 - var46.field3248;
                                                                }
                                                                var46.field3248 += var48;
                                                                field587 -= var48;
                                                                method2020(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2723 == var10 && field600 == var35) {
                                                        var43.method7057(var38, var39, 128);
                                                    } else {
                                                        var43.method7120(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3221 != null && var35 < 20) {
                                                class432 var49 = var10.method4901(var35);
                                                if (var49 != null) {
                                                    var49.method7120(var38, var39);
                                                } else if (class281.field3224) {
                                                    method2020(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3260 == 3) {
                                    int var50;
                                    if (method430(var10)) {
                                        var50 = var10.field3347;
                                        if (Statics.field8 == var10 && var10.field3254 != 0) {
                                            var50 = var10.field3254;
                                        }
                                    } else {
                                        var50 = var10.field3251;
                                        if (Statics.field8 == var10 && var10.field3272 != 0) {
                                            var50 = var10.field3272;
                                        }
                                    }
                                    if (var10.field3325) {
                                        switch(var10.field3256.field4555) {
                                            case 1:
                                                class428.method6944(var12, var13, var10.field3241, var10.field3242, var10.field3251, var10.field3347);
                                                break;
                                            case 2:
                                                class428.method6998(var12, var13, var10.field3241, var10.field3242, var10.field3251, var10.field3347, 255 - (var10.field3257 & 0xFF), 255 - (var10.field3258 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class428.method6943(var12, var13, var10.field3241, var10.field3242, var50);
                                                } else {
                                                    class428.method6942(var12, var13, var10.field3241, var10.field3242, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class428.method6994(var12, var13, var10.field3241, var10.field3242, var50);
                                    } else {
                                        class428.method6977(var12, var13, var10.field3241, var10.field3242, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3260 == 4) {
                                    class327 var51 = var10.method4908();
                                    if (var51 != null) {
                                        String var52 = var10.field3287;
                                        int var53;
                                        if (method430(var10)) {
                                            var53 = var10.field3347;
                                            if (Statics.field8 == var10 && var10.field3254 != 0) {
                                                var53 = var10.field3254;
                                            }
                                            if (var10.field3328.length() > 0) {
                                                var52 = var10.field3328;
                                            }
                                        } else {
                                            var53 = var10.field3251;
                                            if (Statics.field8 == var10 && var10.field3272 != 0) {
                                                var53 = var10.field3272;
                                            }
                                        }
                                        if (var10.field3250 && var10.field3269 != -1) {
                                            class181 var54 = class181.method2432(var10.field3269);
                                            var52 = var54.field2014;
                                            if (var52 == null) {
                                                var52 = class295.field3477;
                                            }
                                            if ((var54.field2018 == 1 || var10.field3214 != 1) && var10.field3214 != -1) {
                                                var52 = class92.method2397(16748608) + var52 + class92.field1223 + " " + 'x' + method1698(var10.field3214);
                                            }
                                        }
                                        if (field643 == var10) {
                                            var52 = class295.field3640;
                                            var53 = var10.field3251;
                                        }
                                        if (!var10.field3250) {
                                            var52 = method57(var52, var10);
                                        }
                                        var51.method5466(var52, var12, var13, var10.field3241, var10.field3242, var53, var10.field3292 ? 0 : -1, var10.field3225, var10.field3291, var10.field3340);
                                    } else if (class281.field3224) {
                                        method2020(var10);
                                    }
                                } else if (var10.field3260 == 5) {
                                    if (var10.field3250) {
                                        class432 var56;
                                        if (var10.field3269 == -1) {
                                            var56 = var10.method4899(false);
                                        } else {
                                            var56 = class181.method2985(var10.field3269, var10.field3214, var10.field3306, var10.field3266, var10.field3285, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4570;
                                            int var58 = var56.field4573;
                                            if (var10.field3264) {
                                                class428.method6973(var12, var13, var10.field3241 + var12, var10.field3242 + var13);
                                                int var59 = (var10.field3241 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3242 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3263 != 0) {
                                                            var56.method7069(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3263, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method7120(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method7057(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class428.method6935(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3241 * 4096 / var57;
                                                if (var10.field3263 != 0) {
                                                    var56.method7069(var10.field3241 / 2 + var12, var10.field3242 / 2 + var13, var10.field3263, var63);
                                                } else if (var14 != 0) {
                                                    var56.method7119(var12, var13, var10.field3241, var10.field3242, 256 - (var14 & 0xFF));
                                                } else if (var10.field3241 == var57 && var10.field3242 == var58) {
                                                    var56.method7120(var12, var13);
                                                } else {
                                                    var56.method7128(var12, var13, var10.field3241, var10.field3242);
                                                }
                                            }
                                        } else if (class281.field3224) {
                                            method2020(var10);
                                        }
                                    } else {
                                        class432 var55 = var10.method4899(method430(var10));
                                        if (var55 != null) {
                                            var55.method7120(var12, var13);
                                        } else if (class281.field3224) {
                                            method2020(var10);
                                        }
                                    }
                                } else if (var10.field3260 == 6) {
                                    boolean var64 = method430(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3274;
                                    } else {
                                        var65 = var10.field3273;
                                    }
                                    class204 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3269 != -1) {
                                        class181 var68 = class181.method2432(var10.field3269);
                                        if (var68 != null) {
                                            class181 var69 = var68.method3243(var10.field3214);
                                            var66 = var69.method3242(1);
                                            if (var66 == null) {
                                                method2020(var10);
                                            } else {
                                                var66.method3872();
                                                var67 = var66.field2360 / 2;
                                            }
                                        }
                                    } else if (var10.field3322 == 5) {
                                        if (var10.field3270 == 0) {
                                            var66 = field712.method4876((class183) null, -1, (class183) null, -1);
                                        } else {
                                            var66 = Statics.field4070.method1860();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4902((class183) null, -1, var64, Statics.field4070.field1046);
                                        if (var66 == null && class281.field3224) {
                                            method2020(var10);
                                        }
                                    } else {
                                        class183 var70 = class183.method2402(var65);
                                        var66 = var10.method4902(var70, var10.field3358, var64, Statics.field4070.field1046);
                                        if (var66 == null && class281.field3224) {
                                            method2020(var10);
                                        }
                                    }
                                    class194.method3597(var10.field3241 / 2 + var12, var10.field3242 / 2 + var13);
                                    int var71 = var10.field3362 * class194.field2276[var10.field3277] >> 16;
                                    int var72 = var10.field3362 * class194.field2271[var10.field3277] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3250) {
                                            var66.method3872();
                                            if (var10.field3283) {
                                                var66.method3890(0, var10.field3278, var10.field3344, var10.field3277, var10.field3275, var10.field3290 + var67 + var71, var10.field3290 + var72, var10.field3362);
                                            } else {
                                                var66.method3919(0, var10.field3278, var10.field3344, var10.field3277, var10.field3275, var10.field3290 + var67 + var71, var10.field3290 + var72);
                                            }
                                        } else {
                                            var66.method3919(0, var10.field3278, 0, var10.field3277, 0, var71, var72);
                                        }
                                    }
                                    class194.method3554();
                                } else {
                                    if (var10.field3260 == 7) {
                                        class327 var73 = var10.method4908();
                                        if (var73 == null) {
                                            if (class281.field3224) {
                                                method2020(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3265; var75++) {
                                            for (int var76 = 0; var76 < var10.field3321; var76++) {
                                                if (var10.field3354[var74] > 0) {
                                                    class181 var77 = class181.method2432(var10.field3354[var74] - 1);
                                                    String var78;
                                                    if (var77.field2018 != 1 && var10.field3222[var74] == 1) {
                                                        var78 = class92.method2397(16748608) + var77.field2014 + class92.field1223;
                                                    } else {
                                                        var78 = class92.method2397(16748608) + var77.field2014 + class92.field1223 + " " + 'x' + method1698(var10.field3222[var74]);
                                                    }
                                                    int var79 = (var10.field3293 + 115) * var76 + var12;
                                                    int var80 = (var10.field3294 + 12) * var75 + var13;
                                                    if (var10.field3225 == 0) {
                                                        var73.method5462(var78, var79, var80, var10.field3251, var10.field3292 ? 0 : -1);
                                                    } else if (var10.field3225 == 1) {
                                                        var73.method5454(var78, var10.field3241 / 2 + var79, var80, var10.field3251, var10.field3292 ? 0 : -1);
                                                    } else {
                                                        var73.method5464(var78, var10.field3241 + var79 - 1, var80, var10.field3251, var10.field3292 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3260 == 8 && Statics.field3376 == var10 && field715 == field629) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class327 var83 = Statics.field1386;
                                        String var84 = var10.field3287;
                                        String var85 = method57(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class92.field1222);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5487(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3989 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3241 + var12 - 5 - var81;
                                        int var90 = var10.field3242 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class428.method6943(var89, var90, var81, var82, 16777120);
                                        class428.method6994(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3287;
                                        int var92 = var83.field3989 + var90 + 2;
                                        String var93 = method57(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class92.field1222);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5462(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3989 + 1;
                                        }
                                    }
                                    if (var10.field3260 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3360) {
                                            var96 = var12;
                                            var97 = var10.field3242 + var13;
                                            var98 = var10.field3241 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3241 + var12;
                                            var99 = var10.field3242 + var13;
                                        }
                                        if (var10.field3259 == 1) {
                                            class428.method6953(var96, var97, var98, var99, var10.field3251);
                                        } else {
                                            method2050(var96, var97, var98, var99, var10.field3251, var10.field3259);
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

    @ObfuscatedName("cp.jt(IIIIIIB)V")
    public static final void method2050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class428.field4545;
        int var18 = arg1 - class428.field4541;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class194.method3537(var19, var20, var21);
        class194.method3540(var23, var24, var25, var19, var20, var21, arg4);
        class194.method3537(var19, var21, var22);
        class194.method3540(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("w.jw(Ljava/lang/String;Ljm;I)Ljava/lang/String;")
    public static String method57(String arg0, class281 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method12(method434(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("bl.jk(II)Ljava/lang/String;")
    public static final String method1698(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class92.field1217 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class92.method2397(65408) + var1.substring(0, var1.length() - 8) + class295.field3643 + " " + class92.field1224 + var1 + class92.field1220 + class92.field1223;
        } else if (var1.length() > 6) {
            return " " + class92.method2397(16777215) + var1.substring(0, var1.length() - 4) + class295.field3686 + " " + class92.field1224 + var1 + class92.field1220 + class92.field1223;
        } else {
            return " " + class92.method2397(16776960) + var1 + class92.field1223;
        }
    }

    @ObfuscatedName("client.jq(ZB)V")
    public final void method1101(boolean arg0) {
        method289(field637, Statics.field2137, Statics.field2535, arg0);
    }

    @ObfuscatedName("client.jc(Ljm;I)V")
    public void method1102(class281 arg0) {
        class281 var2 = arg0.field3245 == -1 ? null : class281.method1956(arg0.field3245);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2137;
            var4 = Statics.field2535;
        } else {
            var3 = var2.field3241;
            var4 = var2.field3242;
        }
        method436(arg0, var3, var4, false);
        method642(arg0, var3, var4);
    }

    @ObfuscatedName("dn.jv([Ljm;Ljm;ZI)V")
    public static void method2519(class281[] arg0, class281 arg1, boolean arg2) {
        int var3 = arg1.field3249 == 0 ? arg1.field3241 : arg1.field3249;
        int var4 = arg1.field3239 == 0 ? arg1.field3242 : arg1.field3239;
        method2241(arg0, arg1.field3226, var3, var4, arg2);
        if (arg1.field3280 != null) {
            method2241(arg1.field3280, arg1.field3226, var3, var4, arg2);
        }
        class80 var5 = (class80) field638.method6446((long) arg1.field3226);
        if (var5 != null) {
            method289(var5.field1014, var3, var4, arg2);
        }
        if (arg1.field3230 == 1337) {
        }
    }

    @ObfuscatedName("k.jh(IIIZI)V")
    public static final void method289(int arg0, int arg1, int arg2, boolean arg3) {
        if (class281.method4482(arg0)) {
            method2241(Statics.field1043[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cj.jx([Ljm;IIIZI)V")
    public static void method2241(class281[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class281 var6 = arg0[var5];
            if (var6 != null && var6.field3245 == arg1) {
                method436(var6, arg2, arg3, arg4);
                method642(var6, arg2, arg3);
                if (var6.field3247 > var6.field3249 - var6.field3241) {
                    var6.field3247 = var6.field3249 - var6.field3241;
                }
                if (var6.field3247 < 0) {
                    var6.field3247 = 0;
                }
                if (var6.field3248 > var6.field3239 - var6.field3242) {
                    var6.field3248 = var6.field3239 - var6.field3242;
                }
                if (var6.field3248 < 0) {
                    var6.field3248 = 0;
                }
                if (var6.field3260 == 0) {
                    method2519(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("an.jf(Ljm;IIZI)V")
    public static void method436(class281 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3241;
        int var5 = arg0.field3242;
        if (arg0.field3233 == 0) {
            arg0.field3241 = arg0.field3321;
        } else if (arg0.field3233 == 1) {
            arg0.field3241 = arg1 - arg0.field3321;
        } else if (arg0.field3233 == 2) {
            arg0.field3241 = arg0.field3321 * arg1 >> 14;
        }
        if (arg0.field3216 == 0) {
            arg0.field3242 = arg0.field3265;
        } else if (arg0.field3216 == 1) {
            arg0.field3242 = arg2 - arg0.field3265;
        } else if (arg0.field3216 == 2) {
            arg0.field3242 = arg0.field3265 * arg2 >> 14;
        }
        if (arg0.field3233 == 4) {
            arg0.field3241 = arg0.field3243 * arg0.field3242 / arg0.field3244;
        }
        if (arg0.field3216 == 4) {
            arg0.field3242 = arg0.field3244 * arg0.field3241 / arg0.field3243;
        }
        if (arg0.field3230 == 1337) {
            field649 = arg0;
        }
        if (arg3 && arg0.field3345 != null && (arg0.field3241 != var4 || arg0.field3242 != var5)) {
            class81 var6 = new class81();
            var6.field1017 = arg0;
            var6.field1031 = arg0.field3345;
            field632.method5296(var6);
        }
    }

    @ObfuscatedName("az.jz(Ljm;IIB)V")
    public static void method642(class281 arg0, int arg1, int arg2) {
        if (arg0.field3231 == 0) {
            arg0.field3327 = arg0.field3235;
        } else if (arg0.field3231 == 1) {
            arg0.field3327 = (arg1 - arg0.field3241) / 2 + arg0.field3235;
        } else if (arg0.field3231 == 2) {
            arg0.field3327 = arg1 - arg0.field3241 - arg0.field3235;
        } else if (arg0.field3231 == 3) {
            arg0.field3327 = arg0.field3235 * arg1 >> 14;
        } else if (arg0.field3231 == 4) {
            arg0.field3327 = (arg0.field3235 * arg1 >> 14) + (arg1 - arg0.field3241) / 2;
        } else {
            arg0.field3327 = arg1 - arg0.field3241 - (arg0.field3235 * arg1 >> 14);
        }
        if (arg0.field3232 == 0) {
            arg0.field3240 = arg0.field3323;
        } else if (arg0.field3232 == 1) {
            arg0.field3240 = (arg2 - arg0.field3242) / 2 + arg0.field3323;
        } else if (arg0.field3232 == 2) {
            arg0.field3240 = arg2 - arg0.field3242 - arg0.field3323;
        } else if (arg0.field3232 == 3) {
            arg0.field3240 = arg0.field3323 * arg2 >> 14;
        } else if (arg0.field3232 == 4) {
            arg0.field3240 = (arg0.field3323 * arg2 >> 14) + (arg2 - arg0.field3242) / 2;
        } else {
            arg0.field3240 = arg2 - arg0.field3242 - (arg0.field3323 * arg2 >> 14);
        }
    }

    @ObfuscatedName("cc.jj(Ljm;IIIIIII)V")
    public static final void method2188(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field544) {
            field703 = 32;
        } else {
            field703 = 0;
        }
        field544 = false;
        if (class33.field226 == 1 || !Statics.field1666 && class33.field226 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3248 -= 4;
                method2020(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3248 += 4;
                method2020(arg0);
            } else if (arg5 >= arg1 - field703 && arg5 < field703 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3248 = (arg4 - arg3) * var8 / var9;
                method2020(arg0);
                field544 = true;
            }
        }
        if (field679 == 0) {
            return;
        }
        int var10 = arg0.field3241;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3248 += field679 * 45;
            method2020(arg0);
        }
    }

    @ObfuscatedName("da.jr(IIIIII)V")
    public static final void method2615(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2713[0].method7018(arg0, arg1);
        Statics.field2713[1].method7018(arg0, arg1 + arg3 - 16);
        class428.method6943(arg0, arg1 + 16, 16, arg3 - 32, field694);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class428.method6943(arg0, arg1 + 16 + var6, 16, var5, field717);
        class428.method7009(arg0, arg1 + 16 + var6, var5, field545);
        class428.method7009(arg0 + 1, arg1 + 16 + var6, var5, field545);
        class428.method6949(arg0, arg1 + 16 + var6, 16, field545);
        class428.method6949(arg0, arg1 + 17 + var6, 16, field545);
        class428.method7009(arg0 + 15, arg1 + 16 + var6, var5, field510);
        class428.method7009(arg0 + 14, arg1 + 17 + var6, var5 - 1, field510);
        class428.method6949(arg0, arg1 + 15 + var6 + var5, 16, field510);
        class428.method6949(arg0 + 1, arg1 + 14 + var6 + var5, 15, field510);
    }

    @ObfuscatedName("b.jg(II)Ljava/lang/String;")
    public static final String method12(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ab.ju(Ljm;I)Z")
    public static final boolean method430(class281 arg0) {
        if (arg0.field3349 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3349.length; var1++) {
            int var2 = method434(arg0, var1);
            int var3 = arg0.field3310[var1];
            if (arg0.field3349[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3349[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3349[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ab.jn(Ljm;II)I")
    public static final int method434(class281 arg0, int arg1) {
        if (arg0.field3348 == null || arg1 >= arg0.field3348.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3348[arg1];
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
                    var7 = field749[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field610[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field611[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class281 var11 = class281.method1956(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class181.method2432(var12).field2027 || field601)) {
                        for (int var13 = 0; var13 < var11.field3354.length; var13++) {
                            if (var12 + 1 == var11.field3354[var13]) {
                                var7 += var11.field3222[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class276.field3185[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class285.field3408[field610[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class276.field3185[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field4070.field1052;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class285.field3409[var14]) {
                            var7 += field610[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class281 var17 = class281.method1956(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class181.method2432(var18).field2027 || field601)) {
                        for (int var19 = 0; var19 < var17.field3354.length; var19++) {
                            if (var18 + 1 == var17.field3354[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field644;
                }
                if (var6 == 12) {
                    var7 = field722;
                }
                if (var6 == 13) {
                    int var20 = class276.field3185[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class276.method4820(var22);
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
                    var7 = (Statics.field4070.field1130 >> 7) + Statics.field1533;
                }
                if (var6 == 19) {
                    var7 = (Statics.field4070.field1090 >> 7) + Statics.field1240;
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

    @ObfuscatedName("fa.jo(Ljm;Lfx;IIZI)V")
    public static final void method3085(class281 arg0, class181 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2050;
        byte var6 = -1;
        String var7 = null;
        if (var5 != null && var5[arg3] != null) {
            if (arg3 == 0) {
                var6 = 33;
            } else if (arg3 == 1) {
                var6 = 34;
            } else if (arg3 == 2) {
                var6 = 35;
            } else if (arg3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[arg3];
        } else if (arg3 == 4) {
            var6 = 37;
            var7 = class295.field3471;
        }
        if (var6 != -1 && var7 != null) {
            method329(var7, class92.method2397(16748608) + arg1.field2014, var6, arg1.field2022, arg2, arg0.field3226, arg4);
        }
    }

    @ObfuscatedName("client.jb(Ljm;III)V")
    public static final void method1119(class281 arg0, int arg1, int arg2) {
        if (arg0.field3255 == 1) {
            method118(arg0.field3353, "", 24, 0, 0, arg0.field3226);
        }
        if (arg0.field3255 == 2 && !field675) {
            String var3 = method1934(arg0);
            if (var3 != null) {
                method118(var3, class92.method2397(65280) + arg0.field3352, 25, 0, -1, arg0.field3226);
            }
        }
        if (arg0.field3255 == 3) {
            method118(class295.field3641, "", 26, 0, 0, arg0.field3226);
        }
        if (arg0.field3255 == 4) {
            method118(arg0.field3353, "", 28, 0, 0, arg0.field3226);
        }
        if (arg0.field3255 == 5) {
            method118(arg0.field3353, "", 29, 0, 0, arg0.field3226);
        }
        if (arg0.field3255 == 6 && field643 == null) {
            method118(arg0.field3353, "", 30, 0, -1, arg0.field3226);
        }
        if (arg0.field3260 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3242; var5++) {
                for (int var6 = 0; var6 < arg0.field3241; var6++) {
                    int var7 = (arg0.field3293 + 32) * var6;
                    int var8 = (arg0.field3294 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3356[var4];
                        var8 += arg0.field3296[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field588 = var4;
                        Statics.field2067 = arg0;
                        if (arg0.field3354[var4] > 0) {
                            label308: {
                                class181 var9 = class181.method2432(arg0.field3354[var4] - 1);
                                if (field630 == 1) {
                                    int var10 = method5970(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field3074 != arg0.field3226 || Statics.field3171 != var4) {
                                            method118(class295.field3632, field743 + " " + class92.field1221 + " " + class92.method2397(16748608) + var9.field2014, 31, var9.field2022, var4, arg0.field3226);
                                        }
                                        break label308;
                                    }
                                }
                                if (field675) {
                                    int var12 = method5970(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1225 & 0x10) == 16) {
                                            method118(field635, field636 + " " + class92.field1221 + " " + class92.method2397(16748608) + var9.field2014, 32, var9.field2022, var4, arg0.field3226);
                                        }
                                        break label308;
                                    }
                                }
                                String[] var14 = var9.field2050;
                                int var15 = -1;
                                if (field623 && method2028()) {
                                    var15 = var9.method3250();
                                }
                                int var16 = method5970(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method3085(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                int var19 = method5970(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method118(class295.field3632, class92.method2397(16748608) + var9.field2014, 38, var9.field2022, var4, arg0.field3226);
                                }
                                int var21 = method5970(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var15 != var23) {
                                            method3085(arg0, var9, var4, var23, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method3085(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var24 = arg0.field3298;
                                if (var24 != null) {
                                    for (int var25 = 4; var25 >= 0; var25--) {
                                        if (var24[var25] != null) {
                                            byte var26 = 0;
                                            if (var25 == 0) {
                                                var26 = 39;
                                            }
                                            if (var25 == 1) {
                                                var26 = 40;
                                            }
                                            if (var25 == 2) {
                                                var26 = 41;
                                            }
                                            if (var25 == 3) {
                                                var26 = 42;
                                            }
                                            if (var25 == 4) {
                                                var26 = 43;
                                            }
                                            method118(var24[var25], class92.method2397(16748608) + var9.field2014, var26, var9.field2022, var4, arg0.field3226);
                                        }
                                    }
                                }
                                method118(class295.field3633, class92.method2397(16748608) + var9.field2014, 1005, var9.field2022, var4, arg0.field3226);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3250) {
            return;
        }
        if (field675) {
            int var27 = method5970(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field1225 & 0x20) == 32) {
                method118(field635, field636 + " " + class92.field1221 + " " + arg0.field3305, 58, 0, arg0.field3227, arg0.field3226);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            String var30;
            if (!class282.method4424(method5970(arg0), var29) && arg0.field3332 == null) {
                var30 = null;
            } else if (arg0.field3282 == null || arg0.field3282.length <= var29 || arg0.field3282[var29] == null || arg0.field3282[var29].trim().length() == 0) {
                var30 = null;
            } else {
                var30 = arg0.field3282[var29];
            }
            if (var30 != null) {
                method118(var30, arg0.field3305, 1007, var29 + 1, arg0.field3227, arg0.field3226);
            }
        }
        String var32 = method1934(arg0);
        if (var32 != null) {
            method118(var32, arg0.field3305, 25, 0, arg0.field3227, arg0.field3226);
        }
        for (int var33 = 4; var33 >= 0; var33--) {
            String var34;
            if (!class282.method4424(method5970(arg0), var33) && arg0.field3332 == null) {
                var34 = null;
            } else if (arg0.field3282 == null || arg0.field3282.length <= var33 || arg0.field3282[var33] == null || arg0.field3282[var33].trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field3282[var33];
            }
            if (var34 != null) {
                method329(var34, arg0.field3305, 57, var33 + 1, arg0.field3227, arg0.field3226, arg0.field3372);
            }
        }
        if (class282.method324(method5970(arg0))) {
            method118(class295.field3539, "", 30, 0, arg0.field3227, arg0.field3226);
        }
    }

    @ObfuscatedName("d.jm(ZI)V")
    public static void method120(boolean arg0) {
        field494 = arg0;
    }

    @ObfuscatedName("bk.je(I)Z")
    public static boolean method2012() {
        return field494;
    }

    @ObfuscatedName("bf.ja(B)Z")
    public static boolean method2028() {
        return field494 || class24.field156[81];
    }

    @ObfuscatedName("bl.ji([Ljm;IIIIIIII)V")
    public static final void method1705(class281[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class281 var9 = arg0[var8];
            if (var9 != null && var9.field3245 == arg1 && (!var9.field3250 || var9.field3260 == 0 || var9.field3229 || method5970(var9) != 0 || field651 == var9 || var9.field3230 == 1338)) {
                if (var9.field3250) {
                    if (method4972(var9)) {
                        continue;
                    }
                } else if (var9.field3260 == 0 && Statics.field8 != var9 && method4972(var9)) {
                    continue;
                }
                int var10 = var9.field3327 + arg6;
                int var11 = var9.field3240 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3260 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field3260 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field3241 + var10;
                    int var19 = var9.field3242 + var11;
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
                    int var22 = var9.field3241 + var10;
                    int var23 = var9.field3242 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field713 == var9) {
                    field658 = true;
                    field659 = var10;
                    field661 = var11;
                }
                boolean var24 = false;
                if (var9.field3300) {
                    switch(field639) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3226 >>> 16 == field640) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field640 == var9.field3226) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field3250 || var12 < var14 && var13 < var15) {
                    if (var9.field3250) {
                        if (var9.field3228) {
                            if (class33.field227 >= var12 && class33.field228 >= var13 && class33.field227 < var14 && class33.field228 < var15) {
                                for (class81 var25 = (class81) field632.method5301(); var25 != null; var25 = (class81) field632.method5303()) {
                                    if (var25.field1018) {
                                        var25.method6163();
                                        var25.field1017.field3361 = false;
                                    }
                                }
                                if (Statics.field1187 == 0) {
                                    field713 = null;
                                    field651 = null;
                                }
                                if (!field522) {
                                    method2897();
                                }
                            }
                        } else if (var9.field3237 && class33.field227 >= var12 && class33.field228 >= var13 && class33.field227 < var14 && class33.field228 < var15) {
                            for (class81 var26 = (class81) field632.method5301(); var26 != null; var26 = (class81) field632.method5303()) {
                                if (var26.field1018 && var26.field1017.field3333 == var26.field1031) {
                                    var26.method6163();
                                }
                            }
                        }
                    }
                    int var27 = class33.field227;
                    int var28 = class33.field228;
                    if (class33.field234 != 0) {
                        var27 = class33.field235;
                        var28 = class33.field236;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field3230 == 1337) {
                        if (!field480 && !field522 && var29) {
                            method3516(var27, var28, var12, var13);
                        }
                    } else if (var9.field3230 == 1338) {
                        method5261(var9, var10, var11);
                    } else {
                        if (var9.field3230 == 1400) {
                            Statics.field1262.method6383(class33.field227, class33.field228, var29, var10, var11, var9.field3241, var9.field3242);
                        }
                        if (!field522 && var29) {
                            if (var9.field3230 == 1400) {
                                Statics.field1262.method6207(var10, var11, var9.field3241, var9.field3242, var27, var28);
                            } else {
                                method1119(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3301.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3301[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3301[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3369 != null) {
                                            var34 = class24.field156[var9.field3301[var30][var33]];
                                        }
                                        if (method6879(var9.field3301[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3369 != null && var9.field3369[var30] > field481) {
                                                break;
                                            }
                                            byte var35 = var9.field3302[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class24.field156[86] && !class24.field156[82] && !class24.field156[81]) && ((var35 & 0x2) == 0 || class24.field156[86]) && ((var35 & 0x1) == 0 || class24.field156[82]) && ((var35 & 0x4) == 0 || class24.field156[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method800(var30 + 1, var9.field3226, var9.field3227, var9.field3269, "");
                                    } else if (var30 == 10) {
                                        method2201();
                                        method2368(var9.field3226, var9.field3227, class282.method6545(method5970(var9)), var9.field3269);
                                        field635 = method1934(var9);
                                        if (field635 == null) {
                                            field635 = class295.field3477;
                                        }
                                        field636 = var9.field3305 + class92.method2397(16777215);
                                    }
                                    int var36 = var9.field3303[var30];
                                    if (var9.field3369 == null) {
                                        var9.field3369 = new int[var9.field3301.length];
                                    }
                                    if (var9.field3304 == null) {
                                        var9.field3304 = new int[var9.field3301.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3369[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3369[var30] == 0) {
                                        var9.field3369[var30] = field481 + var36 + var9.field3304[var30];
                                    } else {
                                        var9.field3369[var30] = field481 + var36;
                                    }
                                }
                                if (!var31 && var9.field3369 != null) {
                                    var9.field3369[var30] = 0;
                                }
                            }
                        }
                        if (var9.field3250) {
                            boolean var37;
                            if (class33.field227 >= var12 && class33.field228 >= var13 && class33.field227 < var14 && class33.field228 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class33.field226 == 1 || !Statics.field1666 && class33.field226 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class33.field234 == 1 || !Statics.field1666 && class33.field234 == 4) && class33.field235 >= var12 && class33.field236 >= var13 && class33.field235 < var14 && class33.field236 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method437(var9, class33.field235 - var10, class33.field236 - var11);
                            }
                            if (var9.field3230 == 1400) {
                                Statics.field1262.method6407(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field713 != null && field713 != var9 && var37 && class282.method2632(method5970(var9))) {
                                field654 = var9;
                            }
                            if (field651 == var9) {
                                field532 = true;
                                field682 = var10;
                                field660 = var11;
                            }
                            if (var9.field3229) {
                                if (var37 && field679 != 0 && var9.field3333 != null) {
                                    class81 var40 = new class81();
                                    var40.field1018 = true;
                                    var40.field1017 = var9;
                                    var40.field1021 = field679;
                                    var40.field1031 = var9.field3333;
                                    field632.method5296(var40);
                                }
                                if (field713 != null || Statics.field1625 != null || field522) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3363 && var39) {
                                    var9.field3363 = true;
                                    if (var9.field3314 != null) {
                                        class81 var41 = new class81();
                                        var41.field1018 = true;
                                        var41.field1017 = var9;
                                        var41.field1029 = class33.field235 - var10;
                                        var41.field1021 = class33.field236 - var11;
                                        var41.field1031 = var9.field3314;
                                        field632.method5296(var41);
                                    }
                                }
                                if (var9.field3363 && var38 && var9.field3315 != null) {
                                    class81 var42 = new class81();
                                    var42.field1018 = true;
                                    var42.field1017 = var9;
                                    var42.field1029 = class33.field227 - var10;
                                    var42.field1021 = class33.field228 - var11;
                                    var42.field1031 = var9.field3315;
                                    field632.method5296(var42);
                                }
                                if (var9.field3363 && !var38) {
                                    var9.field3363 = false;
                                    if (var9.field3316 != null) {
                                        class81 var43 = new class81();
                                        var43.field1018 = true;
                                        var43.field1017 = var9;
                                        var43.field1029 = class33.field227 - var10;
                                        var43.field1021 = class33.field228 - var11;
                                        var43.field1031 = var9.field3316;
                                        field580.method5296(var43);
                                    }
                                }
                                if (var38 && var9.field3317 != null) {
                                    class81 var44 = new class81();
                                    var44.field1018 = true;
                                    var44.field1017 = var9;
                                    var44.field1029 = class33.field227 - var10;
                                    var44.field1021 = class33.field228 - var11;
                                    var44.field1031 = var9.field3317;
                                    field632.method5296(var44);
                                }
                                if (!var9.field3361 && var37) {
                                    var9.field3361 = true;
                                    if (var9.field3318 != null) {
                                        class81 var45 = new class81();
                                        var45.field1018 = true;
                                        var45.field1017 = var9;
                                        var45.field1029 = class33.field227 - var10;
                                        var45.field1021 = class33.field228 - var11;
                                        var45.field1031 = var9.field3318;
                                        field632.method5296(var45);
                                    }
                                }
                                if (var9.field3361 && var37 && var9.field3297 != null) {
                                    class81 var46 = new class81();
                                    var46.field1018 = true;
                                    var46.field1017 = var9;
                                    var46.field1029 = class33.field227 - var10;
                                    var46.field1021 = class33.field228 - var11;
                                    var46.field1031 = var9.field3297;
                                    field632.method5296(var46);
                                }
                                if (var9.field3361 && !var37) {
                                    var9.field3361 = false;
                                    if (var9.field3320 != null) {
                                        class81 var47 = new class81();
                                        var47.field1018 = true;
                                        var47.field1017 = var9;
                                        var47.field1029 = class33.field227 - var10;
                                        var47.field1021 = class33.field228 - var11;
                                        var47.field1031 = var9.field3320;
                                        field580.method5296(var47);
                                    }
                                }
                                if (var9.field3331 != null) {
                                    class81 var48 = new class81();
                                    var48.field1017 = var9;
                                    var48.field1031 = var9.field3331;
                                    field681.method5296(var48);
                                }
                                if (var9.field3276 != null && field664 > var9.field3364) {
                                    if (var9.field3326 == null || field664 - var9.field3364 > 32) {
                                        class81 var53 = new class81();
                                        var53.field1017 = var9;
                                        var53.field1031 = var9.field3276;
                                        field632.method5296(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3364; var49 < field664; var49++) {
                                            int var50 = field746[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3326.length; var51++) {
                                                if (var9.field3326[var51] == var50) {
                                                    class81 var52 = new class81();
                                                    var52.field1017 = var9;
                                                    var52.field1031 = var9.field3276;
                                                    field632.method5296(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3364 = field664;
                                }
                                if (var9.field3355 != null && field666 > var9.field3365) {
                                    if (var9.field3371 == null || field666 - var9.field3365 > 32) {
                                        class81 var58 = new class81();
                                        var58.field1017 = var9;
                                        var58.field1031 = var9.field3355;
                                        field632.method5296(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3365; var54 < field666; var54++) {
                                            int var55 = field665[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3371.length; var56++) {
                                                if (var9.field3371[var56] == var55) {
                                                    class81 var57 = new class81();
                                                    var57.field1017 = var9;
                                                    var57.field1031 = var9.field3355;
                                                    field632.method5296(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3365 = field666;
                                }
                                if (var9.field3329 != null && field668 > var9.field3366) {
                                    if (var9.field3312 == null || field668 - var9.field3366 > 32) {
                                        class81 var63 = new class81();
                                        var63.field1017 = var9;
                                        var63.field1031 = var9.field3329;
                                        field632.method5296(var63);
                                    } else {
                                        label586: for (int var59 = var9.field3366; var59 < field668; var59++) {
                                            int var60 = field667[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3312.length; var61++) {
                                                if (var9.field3312[var61] == var60) {
                                                    class81 var62 = new class81();
                                                    var62.field1017 = var9;
                                                    var62.field1031 = var9.field3329;
                                                    field632.method5296(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3366 = field668;
                                }
                                if (field671 > var9.field3342 && var9.field3238 != null) {
                                    class81 var64 = new class81();
                                    var64.field1017 = var9;
                                    var64.field1031 = var9.field3238;
                                    field632.method5296(var64);
                                }
                                if (field672 > var9.field3342 && var9.field3338 != null) {
                                    class81 var65 = new class81();
                                    var65.field1017 = var9;
                                    var65.field1031 = var9.field3338;
                                    field632.method5296(var65);
                                }
                                if (field673 > var9.field3342 && var9.field3339 != null) {
                                    class81 var66 = new class81();
                                    var66.field1017 = var9;
                                    var66.field1031 = var9.field3339;
                                    field632.method5296(var66);
                                }
                                if (field674 > var9.field3342 && var9.field3218 != null) {
                                    class81 var67 = new class81();
                                    var67.field1017 = var9;
                                    var67.field1031 = var9.field3218;
                                    field632.method5296(var67);
                                }
                                if (field584 > var9.field3342 && var9.field3341 != null) {
                                    class81 var68 = new class81();
                                    var68.field1017 = var9;
                                    var68.field1031 = var9.field3341;
                                    field632.method5296(var68);
                                }
                                if (field676 > var9.field3342 && var9.field3346 != null) {
                                    class81 var69 = new class81();
                                    var69.field1017 = var9;
                                    var69.field1031 = var9.field3346;
                                    field632.method5296(var69);
                                }
                                if (field670 > var9.field3342 && var9.field3295 != null) {
                                    class81 var70 = new class81();
                                    var70.field1017 = var9;
                                    var70.field1031 = var9.field3295;
                                    field632.method5296(var70);
                                }
                                if (field472 > var9.field3342 && var9.field3330 != null) {
                                    class81 var71 = new class81();
                                    var71.field1017 = var9;
                                    var71.field1031 = var9.field3330;
                                    field632.method5296(var71);
                                }
                                var9.field3342 = field662;
                                if (var9.field3335 != null) {
                                    for (int var72 = 0; var72 < field702; var72++) {
                                        class81 var73 = new class81();
                                        var73.field1017 = var9;
                                        var73.field1024 = field523[var72];
                                        var73.field1033 = field759[var72];
                                        var73.field1031 = var9.field3335;
                                        field632.method5296(var73);
                                    }
                                }
                                if (var9.field3336 != null) {
                                    int[] var74 = class24.method2043();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1017 = var9;
                                        var76.field1024 = var74[var75];
                                        var76.field1031 = var9.field3336;
                                        field632.method5296(var76);
                                    }
                                }
                                if (var9.field3337 != null) {
                                    int[] var77 = class24.method5282();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1017 = var9;
                                        var79.field1024 = var77[var78];
                                        var79.field1031 = var9.field3337;
                                        field632.method5296(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field3250) {
                            if (field713 != null || Statics.field1625 != null || field522) {
                                continue;
                            }
                            if ((var9.field3351 >= 0 || var9.field3272 != 0) && class33.field227 >= var12 && class33.field228 >= var13 && class33.field227 < var14 && class33.field228 < var15) {
                                if (var9.field3351 >= 0) {
                                    Statics.field8 = arg0[var9.field3351];
                                } else {
                                    Statics.field8 = var9;
                                }
                            }
                            if (var9.field3260 == 8 && class33.field227 >= var12 && class33.field228 >= var13 && class33.field227 < var14 && class33.field228 < var15) {
                                Statics.field3376 = var9;
                            }
                            if (var9.field3239 > var9.field3242) {
                                method2188(var9, var9.field3241 + var10, var11, var9.field3242, var9.field3239, class33.field227, class33.field228);
                            }
                        }
                        if (var9.field3260 == 0) {
                            method1705(arg0, var9.field3226, var12, var13, var14, var15, var10 - var9.field3247, var11 - var9.field3248);
                            if (var9.field3280 != null) {
                                method1705(var9.field3280, var9.field3226, var12, var13, var14, var15, var10 - var9.field3247, var11 - var9.field3248);
                            }
                            class80 var80 = (class80) field638.method6446((long) var9.field3226);
                            if (var80 != null) {
                                if (var80.field1013 == 0 && class33.field227 >= var12 && class33.field228 >= var13 && class33.field227 < var14 && class33.field228 < var15 && !field522) {
                                    for (class81 var81 = (class81) field632.method5301(); var81 != null; var81 = (class81) field632.method5303()) {
                                        if (var81.field1018) {
                                            var81.method6163();
                                            var81.field1017.field3361 = false;
                                        }
                                    }
                                    if (Statics.field1187 == 0) {
                                        field713 = null;
                                        field651 = null;
                                    }
                                    if (!field522) {
                                        method2897();
                                    }
                                }
                                Statics.method186(var80.field1014, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("pk.js(II)Z")
    public static boolean method6879(int arg0) {
        for (int var1 = 0; var1 < field702; var1++) {
            if (field523[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("br.kf(III)V")
    public static final void method1071(int arg0, int arg1) {
        if (class281.method4482(arg0)) {
            method391(Statics.field1043[arg0], arg1);
        }
    }

    @ObfuscatedName("y.ks([Ljm;IB)V")
    public static final void method391(class281[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class281 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3260 == 0) {
                    if (var3.field3280 != null) {
                        method391(var3.field3280, arg1);
                    }
                    class80 var4 = (class80) field638.method6446((long) var3.field3226);
                    if (var4 != null) {
                        method1071(var4.field1014, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3343 != null) {
                    class81 var5 = new class81();
                    var5.field1017 = var3;
                    var5.field1031 = var3.field3343;
                    class64.method4965(var5);
                }
                if (arg1 == 1 && var3.field3370 != null) {
                    if (var3.field3227 >= 0) {
                        class281 var6 = class281.method1956(var3.field3226);
                        if (var6 == null || var6.field3280 == null || var3.field3227 >= var6.field3280.length || var6.field3280[var3.field3227] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1017 = var3;
                    var7.field1031 = var3.field3370;
                    class64.method4965(var7);
                }
            }
        }
    }

    @ObfuscatedName("an.kt(Ljm;III)V")
    public static final void method437(class281 arg0, int arg1, int arg2) {
        if (field713 != null || field522 || arg0 == null) {
            return;
        }
        class281 var3 = method3031(arg0);
        if (var3 == null) {
            var3 = arg0.field3307;
        }
        if (var3 == null) {
            return;
        }
        field713 = arg0;
        class281 var5 = method3031(arg0);
        if (var5 == null) {
            var5 = arg0.field3307;
        }
        field651 = var5;
        field652 = arg1;
        field742 = arg2;
        Statics.field1187 = 0;
        field554 = false;
        int var7 = field689 - 1;
        if (var7 != -1) {
            method231(var7);
        }
        return;
    }

    @ObfuscatedName("client.kd(I)V")
    public final void method1103() {
        method2020(field713);
        Statics.field1187++;
        if (field658 && field532) {
            int var1 = class33.field227;
            int var2 = class33.field228;
            int var3 = var1 - field652;
            int var4 = var2 - field742;
            if (var3 < field682) {
                var3 = field682;
            }
            if (field713.field3241 + var3 > field682 + field651.field3241) {
                var3 = field682 + field651.field3241 - field713.field3241;
            }
            if (var4 < field660) {
                var4 = field660;
            }
            if (field713.field3242 + var4 > field660 + field651.field3242) {
                var4 = field660 + field651.field3242 - field713.field3242;
            }
            int var5 = var3 - field659;
            int var6 = var4 - field661;
            int var7 = field713.field3308;
            if (Statics.field1187 > field713.field3309 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field554 = true;
            }
            int var8 = field651.field3247 + (var3 - field682);
            int var9 = field651.field3248 + (var4 - field660);
            if (field713.field3253 != null && field554) {
                class81 var10 = new class81();
                var10.field1017 = field713;
                var10.field1029 = var8;
                var10.field1021 = var9;
                var10.field1031 = field713.field3253;
                class64.method4965(var10);
            }
            if (class33.field226 == 0) {
                if (field554) {
                    if (field713.field3284 != null) {
                        class81 var11 = new class81();
                        var11.field1017 = field713;
                        var11.field1029 = var8;
                        var11.field1021 = var9;
                        var11.field1023 = field654;
                        var11.field1031 = field713.field3284;
                        class64.method4965(var11);
                    }
                    if (field654 != null && method3031(field713) != null) {
                        class255 var12 = Statics.method3174(class253.field2817, field690.field1286);
                        var12.field2930.method6715(field654.field3226);
                        var12.field2930.method6706(field713.field3227);
                        var12.field2930.method6801(field654.field3269);
                        var12.field2930.method6801(field654.field3227);
                        var12.field2930.method6654(field713.field3269);
                        var12.field2930.method6656(field713.field3226);
                        field690.method2328(var12);
                    }
                } else if (this.method1100()) {
                    this.method1574(field659 + field652, field742 + field661);
                } else if (field689 > 0) {
                    int var13 = field659 + field652;
                    int var14 = field742 + field661;
                    method4043(Statics.field1188, var13, var14);
                    Statics.field1188 = null;
                }
                field713 = null;
            }
        } else if (Statics.field1187 > 1) {
            field713 = null;
        }
    }

    @ObfuscatedName("a.ko(IB)V")
    public static void method231(int arg0) {
        Statics.field1188 = new class67();
        Statics.field1188.field855 = field615[arg0];
        Statics.field1188.field849 = field616[arg0];
        Statics.field1188.field851 = field617[arg0];
        Statics.field1188.field848 = field541[arg0];
        Statics.field1188.field852 = field700[arg0];
    }

    @ObfuscatedName("bo.ky(Ljm;I)V")
    public static void method2020(class281 arg0) {
        if (field685 == arg0.field3368) {
            field505[arg0.field3367] = true;
        }
    }

    @ObfuscatedName("el.kn(IB)V")
    public static final void method2712(int arg0) {
        if (!class281.method4482(arg0)) {
            return;
        }
        class281[] var1 = Statics.field1043[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class281 var3 = var1[var2];
            if (var3 != null) {
                var3.field3358 = 0;
                var3.field3359 = 0;
            }
        }
    }

    @ObfuscatedName("bs.kl(II)V")
    public static final void method1868(int arg0) {
        if (class281.method4482(arg0)) {
            method5546(Statics.field1043[arg0], -1);
        }
    }

    @ObfuscatedName("lv.kr([Ljm;IB)V")
    public static final void method5546(class281[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class281 var3 = arg0[var2];
            if (var3 != null && var3.field3245 == arg1 && (!var3.field3250 || !method4972(var3))) {
                if (var3.field3260 == 0) {
                    if (!var3.field3250 && method4972(var3) && Statics.field8 != var3) {
                        continue;
                    }
                    method5546(arg0, var3.field3226);
                    if (var3.field3280 != null) {
                        method5546(var3.field3280, var3.field3226);
                    }
                    class80 var4 = (class80) field638.method6446((long) var3.field3226);
                    if (var4 != null) {
                        method1868(var4.field1014);
                    }
                }
                if (var3.field3260 == 6) {
                    if (var3.field3273 != -1 || var3.field3274 != -1) {
                        boolean var5 = method430(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3274;
                        } else {
                            var6 = var3.field3273;
                        }
                        if (var6 != -1) {
                            class183 var7 = class183.method2402(var6);
                            var3.field3359 += field539;
                            while (var3.field3359 > var7.field2081[var3.field3358]) {
                                var3.field3359 -= var7.field2081[var3.field3358];
                                var3.field3358++;
                                if (var3.field3358 >= var7.field2099.length) {
                                    var3.field3358 -= var7.field2089;
                                    if (var3.field3358 < 0 || var3.field3358 >= var7.field2099.length) {
                                        var3.field3358 = 0;
                                    }
                                }
                                method2020(var3);
                            }
                        }
                    }
                    if (var3.field3261 != 0 && !var3.field3250) {
                        int var8 = var3.field3261 >> 16;
                        int var9 = var3.field3261 << 16 >> 16;
                        int var10 = field539 * var8;
                        int var11 = field539 * var9;
                        var3.field3277 = var3.field3277 + var10 & 0x7FF;
                        var3.field3278 = var3.field3278 + var11 & 0x7FF;
                        method2020(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.kw(D)V")
    public static final void method2045(double arg0) {
        class194.method3534(arg0);
        ((class202) Statics.field2273).method3832(arg0);
        class181.method3029();
        Statics.field929.field1199 = arg0;
        class89.method2604();
    }

    @ObfuscatedName("ct.km(II)V")
    public static final void method2303(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field929.field1200 == var1) {
            return;
        }
        if (Statics.field929.field1200 == 0 && field716 != -1) {
            class261.method2841(Statics.field2775, field716, 0, var1, false);
            field744 = false;
        } else if (var1 == 0) {
            class261.method3135();
            field744 = false;
        } else if (class261.field3065 == 0) {
            Statics.field3064.method4628(var1);
        } else {
            Statics.field959 = var1;
        }
        Statics.field929.field1200 = var1;
        class89.method2604();
    }

    @ObfuscatedName("l.ke(II)V")
    public static final void method326(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field929.field1201 = var1;
        class89.method2604();
    }

    @ObfuscatedName("cw.kz(II)V")
    public static final void method2260(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field929.field1202 = var1;
        class89.method2604();
    }

    @ObfuscatedName("je.kx(II)V")
    public static final void method4944(int arg0) {
        Statics.method2428();
        class63.method3231();
        int var1 = class163.method2017(arg0).field1746;
        if (var1 == 0) {
            return;
        }
        int var2 = class276.field3185[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method2045(0.9D);
            }
            if (var2 == 2) {
                method2045(0.8D);
            }
            if (var2 == 3) {
                method2045(0.7D);
            }
            if (var2 == 4) {
                method2045(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method2303(255);
            }
            if (var2 == 1) {
                method2303(192);
            }
            if (var2 == 2) {
                method2303(128);
            }
            if (var2 == 3) {
                method2303(64);
            }
            if (var2 == 4) {
                method2303(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method326(127);
            }
            if (var2 == 1) {
                method326(96);
            }
            if (var2 == 2) {
                method326(64);
            }
            if (var2 == 3) {
                method326(32);
            }
            if (var2 == 4) {
                method326(0);
            }
        }
        if (var1 == 5) {
            field612 = var2;
        }
        if (var1 == 6) {
            field641 = var2;
        }
        if (var1 == 9) {
            field642 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method2260(127);
            }
            if (var2 == 1) {
                method2260(96);
            }
            if (var2 == 2) {
                method2260(64);
            }
            if (var2 == 3) {
                method2260(32);
            }
            if (var2 == 4) {
                method2260(0);
            }
        }
        if (var1 == 17) {
            field647 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field498 = (class94) class316.method2616(class94.method3067(), var2);
            if (field498 == null) {
                field498 = class94.field1236;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field604 = -1;
            } else {
                field604 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field574 = (class94) class316.method2616(class94.method3067(), var2);
            if (field574 == null) {
                field574 = class94.field1236;
            }
        }
    }

    @ObfuscatedName("hz.ku(Ljm;I)V")
    public static final void method4380(class281 arg0) {
        int var1 = arg0.field3230;
        if (var1 == 324) {
            if (field745 == -1) {
                field745 = arg0.field3319;
                field572 = arg0.field3262;
            }
            if (field712.field3196) {
                arg0.field3319 = field745;
            } else {
                arg0.field3319 = field572;
            }
        } else if (var1 == 325) {
            if (field745 == -1) {
                field745 = arg0.field3319;
                field572 = arg0.field3262;
            }
            if (field712.field3196) {
                arg0.field3319 = field572;
            } else {
                arg0.field3319 = field745;
            }
        } else if (var1 == 327) {
            arg0.field3277 = 150;
            arg0.field3278 = (int) (Math.sin((double) field481 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3322 = 5;
            arg0.field3270 = 0;
        } else if (var1 == 328) {
            arg0.field3277 = 150;
            arg0.field3278 = (int) (Math.sin((double) field481 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3322 = 5;
            arg0.field3270 = 1;
        }
    }

    @ObfuscatedName("t.kg(I)V")
    public static final void method25() {
        class255 var0 = Statics.method3174(class253.field2899, field690.field1286);
        field690.method2328(var0);
        class64.field817 = true;
        for (class80 var1 = (class80) field638.method6448(); var1 != null; var1 = (class80) field638.method6445()) {
            if (var1.field1013 == 0 || var1.field1013 == 3) {
                method100(var1, true);
            }
        }
        if (field643 != null) {
            method2020(field643);
            field643 = null;
        }
        class64.field817 = false;
    }

    @ObfuscatedName("by.ka(IIIB)Lcl;")
    public static final class80 method1961(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1014 = arg1;
        var3.field1013 = arg2;
        field638.method6447(var3, (long) arg0);
        method2712(arg1);
        class281 var4 = class281.method1956(arg0);
        method2020(var4);
        if (field643 != null) {
            method2020(field643);
            field643 = null;
        }
        method2807();
        method2519(Statics.field1043[arg0 >> 16], var4, false);
        class64.method651(arg1);
        if (field637 != -1) {
            method1071(field637, 1);
        }
        return var3;
    }

    @ObfuscatedName("o.kh(Lcl;ZI)V")
    public static final void method100(class80 arg0, boolean arg1) {
        int var2 = arg0.field1014;
        int var3 = (int) arg0.field4257;
        arg0.method6163();
        if (arg1) {
            class281.method4819(var2);
        }
        method3864(var2);
        class281 var4 = class281.method1956(var3);
        if (var4 != null) {
            method2020(var4);
        }
        method2807();
        if (field637 != -1) {
            method1071(field637, 1);
        }
    }

    @ObfuscatedName("f.ki(Ljm;I)Z")
    public static final boolean method321(class281 arg0) {
        int var1 = arg0.field3230;
        if (var1 == 205) {
            field506 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field712.method4863(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field712.method4877(var4, var5 == 1);
        }
        if (var1 == 324) {
            field712.method4882(false);
        }
        if (var1 == 325) {
            field712.method4882(true);
        }
        if (var1 == 326) {
            class255 var6 = Statics.method3174(class253.field2905, field690.field1286);
            field712.method4866(var6.field2930);
            field690.method2328(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ea.kc(Ljm;IIIB)V")
    public static final void method2757(class281 arg0, int arg1, int arg2, int arg3) {
        method2758();
        class275 var4 = arg0.method4897(false);
        if (var4 == null) {
            return;
        }
        class428.method6935(arg1, arg2, var4.field3183 + arg1, var4.field3179 + arg2);
        if (field512 == 2 || field512 == 5) {
            class428.method6955(arg1, arg2, 0, var4.field3181, var4.field3180);
        } else {
            int var5 = field499 & 0x7FF;
            int var6 = Statics.field4070.field1130 / 32 + 48;
            int var7 = 464 - Statics.field4070.field1090 / 32;
            Statics.field176.method7092(arg1, arg2, var4.field3183, var4.field3179, var6, var7, var5, 256, var4.field3181, var4.field3180);
            for (int var8 = 0; var8 < field697; var8++) {
                int var9 = field710[var8] * 4 + 2 - Statics.field4070.field1130 / 32;
                int var10 = field581[var8] * 4 + 2 - Statics.field4070.field1090 / 32;
                method5918(arg1, arg2, var9, var10, field669[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class321 var13 = field631[Statics.field110][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field4070.field1130 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field4070.field1090 / 32;
                        method5918(arg1, arg2, var14, var15, Statics.field1359[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field519; var16++) {
                class91 var17 = field699[field520[var16]];
                if (var17 != null && var17.method2080()) {
                    class171 var18 = var17.field1215;
                    if (var18 != null && var18.field1838 != null) {
                        var18 = var18.method3014();
                    }
                    if (var18 != null && var18.field1863 && var18.field1866) {
                        int var19 = var17.field1130 / 32 - Statics.field4070.field1130 / 32;
                        int var20 = var17.field1090 / 32 - Statics.field4070.field1090 / 32;
                        method5918(arg1, arg2, var19, var20, Statics.field1359[1], var4);
                    }
                }
            }
            int var21 = class96.field1246;
            int[] var22 = class96.field1250;
            for (int var23 = 0; var23 < var21; var23++) {
                class83 var24 = field653[var22[var23]];
                if (var24 != null && var24.method2080() && !var24.field1067 && Statics.field4070 != var24) {
                    int var25 = var24.field1130 / 32 - Statics.field4070.field1130 / 32;
                    int var26 = var24.field1090 / 32 - Statics.field4070.field1090 / 32;
                    if (var24.method2067()) {
                        method5918(arg1, arg2, var25, var26, Statics.field1359[3], var4);
                    } else if (Statics.field4070.field1060 != 0 && var24.field1060 != 0 && Statics.field4070.field1060 == var24.field1060) {
                        method5918(arg1, arg2, var25, var26, Statics.field1359[4], var4);
                    } else if (var24.method2120()) {
                        method5918(arg1, arg2, var25, var26, Statics.field1359[5], var4);
                    } else if (var24.method2075()) {
                        method5918(arg1, arg2, var25, var26, Statics.field1359[6], var4);
                    } else {
                        method5918(arg1, arg2, var25, var26, Statics.field1359[2], var4);
                    }
                }
            }
            if (field490 != 0 && field481 % 20 < 10) {
                if (field490 == 1 && field491 >= 0 && field491 < field699.length) {
                    class91 var27 = field699[field491];
                    if (var27 != null) {
                        int var28 = var27.field1130 / 32 - Statics.field4070.field1130 / 32;
                        int var29 = var27.field1090 / 32 - Statics.field4070.field1090 / 32;
                        method6581(arg1, arg2, var28, var29, Statics.field1322[1], var4);
                    }
                }
                if (field490 == 2) {
                    int var30 = field493 * 4 - Statics.field1533 * 4 + 2 - Statics.field4070.field1130 / 32;
                    int var31 = field729 * 4 - Statics.field1240 * 4 + 2 - Statics.field4070.field1090 / 32;
                    method6581(arg1, arg2, var30, var31, Statics.field1322[1], var4);
                }
                if (field490 == 10 && field492 >= 0 && field492 < field653.length) {
                    class83 var32 = field653[field492];
                    if (var32 != null) {
                        int var33 = var32.field1130 / 32 - Statics.field4070.field1130 / 32;
                        int var34 = var32.field1090 / 32 - Statics.field4070.field1090 / 32;
                        method6581(arg1, arg2, var33, var34, Statics.field1322[1], var4);
                    }
                }
            }
            if (field502 != 0) {
                int var35 = field502 * 4 + 2 - Statics.field4070.field1130 / 32;
                int var36 = field678 * 4 + 2 - Statics.field4070.field1090 / 32;
                method5918(arg1, arg2, var35, var36, Statics.field1322[0], var4);
            }
            if (!Statics.field4070.field1067) {
                class428.method6943(var4.field3183 / 2 + arg1 - 1, var4.field3179 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field687[arg3] = true;
    }

    @ObfuscatedName("mv.kq(Ljm;IIIB)V")
    public static final void method5771(class281 arg0, int arg1, int arg2, int arg3) {
        class275 var4 = arg0.method4897(false);
        if (var4 == null) {
            return;
        }
        if (field512 < 3) {
            Statics.field1181.method7092(arg1, arg2, var4.field3183, var4.field3179, 25, 25, field499, 256, var4.field3181, var4.field3180);
        } else {
            class428.method6955(arg1, arg2, 0, var4.field3181, var4.field3180);
        }
    }

    @ObfuscatedName("od.kv(IIIILpl;Ljr;B)V")
    public static final void method6581(int arg0, int arg1, int arg2, int arg3, class432 arg4, class275 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method5918(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field499 & 0x7FF;
        int var8 = class194.field2276[var7];
        int var9 = class194.field2271[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3183 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field300.method7095(arg5.field3183 / 2 + arg0 - var17 / 2 + var15, arg5.field3179 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("my.kj(IIIILpl;Ljr;I)V")
    public static final void method5918(int arg0, int arg1, int arg2, int arg3, class432 arg4, class275 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field499 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class194.field2276[var6];
        int var9 = class194.field2271[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7067(arg5.field3183 / 2 + var10 - arg4.field4570 / 2, arg5.field3179 / 2 - var11 - arg4.field4573 / 2, arg0, arg1, arg5.field3183, arg5.field3179, arg5.field3181, arg5.field3180);
        } else {
            arg4.method7120(arg5.field3183 / 2 + arg0 + var10 - arg4.field4570 / 2, arg5.field3179 / 2 + arg1 - var11 - arg4.field4573 / 2);
        }
    }

    @ObfuscatedName("it.kb(I)V")
    public static final void method4405() {
        for (int var0 = 0; var0 < class96.field1246; var0++) {
            class83 var1 = field653[class96.field1250[var0]];
            var1.method2068();
        }
        Iterator var2 = class98.field1271.iterator();
        while (var2.hasNext()) {
            class58 var3 = (class58) var2.next();
            var3.method1059();
        }
        if (Statics.field1252 != null) {
            Statics.field1252.method5738();
        }
    }

    @ObfuscatedName("gi.kk(B)V")
    public static final void method3630() {
        class98.method5873();
        if (Statics.field1252 != null) {
            Statics.field1252.method5732();
        }
    }

    @ObfuscatedName("od.lw(I)V")
    public static final void method6582() {
        field672 = field662;
    }

    @ObfuscatedName("lb.lp(B)V")
    public static final void method5646() {
        field673 = field662;
        Statics.field312 = true;
    }

    @ObfuscatedName("kl.ll(I)V")
    public static final void method4980() {
        field674 = field662;
        Statics.field1471 = true;
    }

    @ObfuscatedName("od.li(Ljava/lang/String;I)V")
    public static final void method6569(String arg0) {
        if (Statics.field1252 != null) {
            class255 var1 = Statics.method3174(class253.field2829, field690.field1286);
            var1.field2930.method6841(class419.method2537(arg0));
            var1.field2930.method6660(arg0);
            field690.method2328(var1);
        }
    }

    @ObfuscatedName("eo.lf(Ljava/lang/String;I)V")
    public static final void method2714(String arg0) {
        if (!arg0.equals("")) {
            class255 var1 = Statics.method3174(class253.field2858, field690.field1286);
            var1.field2930.method6841(class419.method2537(arg0));
            var1.field2930.method6660(arg0);
            field690.method2328(var1);
        }
    }

    @ObfuscatedName("ho.lq(I)V")
    public static final void method4048() {
        class255 var0 = Statics.method3174(class253.field2858, field690.field1286);
        var0.field2930.method6841(0);
        field690.method2328(var0);
    }

    @ObfuscatedName("ev.lz(III)V")
    public static final void method2628(int arg0, int arg1) {
        class147 var2 = arg0 >= 0 ? field707[arg0] : Statics.field1324;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2736()) {
            return;
        }
        class129 var3 = (class129) var2.field1639.get(arg1);
        if (var3.field1507 != -1) {
            return;
        }
        String var4 = var3.field1506.method7187();
        class99 var5 = field690;
        class255 var6 = Statics.method3174(class253.field2876, var5.field1286);
        var6.field2930.method6841(3 + class419.method2537(var4));
        var6.field2930.method6841(arg0);
        var6.field2930.method6654(arg1);
        var6.field2930.method6660(var4);
        var5.method2328(var6);
    }

    @ObfuscatedName("df.la(IIB)V")
    public static final void method2494(int arg0, int arg1) {
        if (field707[arg0] == null || arg1 < 0 || arg1 >= field707[arg0].method2736()) {
            return;
        }
        class129 var2 = (class129) field707[arg0].field1639.get(arg1);
        if (var2.field1507 != -1) {
            return;
        }
        class99 var3 = field690;
        class255 var4 = Statics.method3174(class253.field2889, var3.field1286);
        var4.field2930.method6841(3 + class419.method2537(var2.field1506.method7187()));
        var4.field2930.method6841(arg0);
        var4.field2930.method6654(arg1);
        var4.field2930.method6660(var2.field1506.method7187());
        var3.method2328(var4);
    }

    @ObfuscatedName("j.lh(IIZI)V")
    public static final void method45(int arg0, int arg1, boolean arg2) {
        if (field707[arg0] == null || arg1 < 0 || arg1 >= field707[arg0].method2736()) {
            return;
        }
        class129 var3 = (class129) field707[arg0].field1639.get(arg1);
        class99 var4 = field690;
        class255 var5 = Statics.method3174(class253.field2904, var4.field1286);
        var5.field2930.method6841(4 + class419.method2537(var3.field1506.method7187()));
        var5.field2930.method6841(arg0);
        var5.field2930.method6654(arg1);
        var5.field2930.method6659(arg2);
        var5.field2930.method6660(var3.field1506.method7187());
        var4.method2328(var5);
    }

    @ObfuscatedName("gr.lk(IB)V")
    public static void method3864(int arg0) {
        for (class386 var1 = (class386) field683.method6448(); var1 != null; var1 = (class386) field683.method6445()) {
            if ((var1.field4257 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method6163();
            }
        }
    }

    @ObfuscatedName("mt.lr(Ljm;I)I")
    public static int method5970(class281 arg0) {
        class386 var1 = (class386) field683.method6446(((long) arg0.field3226 << 32) + (long) arg0.field3227);
        return var1 == null ? arg0.field3311 : var1.field4256;
    }

    @ObfuscatedName("fo.lc(Ljm;I)Ljm;")
    public static class281 method3031(class281 arg0) {
        int var1 = class282.method3828(method5970(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class281.method1956(arg0.field3245);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ko.lo(Ljm;I)Z")
    public static boolean method4972(class281 arg0) {
        return arg0.field3246;
    }

    @ObfuscatedName("bh.ls(Ljm;S)Ljava/lang/String;")
    public static String method1934(class281 arg0) {
        if (class282.method6545(method5970(arg0)) == 0) {
            return null;
        } else if (arg0.field3252 == null || arg0.field3252.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3252;
        }
    }

    @ObfuscatedName("cl.lx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2049(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field476 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field476 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field476 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field476 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field476 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4 != null) {
            var3 = "/p=" + Statics.field4;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field446 + "/a=" + Statics.field4097 + var3 + "/";
    }

    @ObfuscatedName("fp.lv(Ljava/lang/String;ZI)V")
    public static void method3136(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2583; var5++) {
            class181 var6 = class181.method2432(var5);
            if ((!arg1 || var6.field2054) && var6.field2046 == -1 && var6.field2014.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field4165 = -1;
                    Statics.field1381 = null;
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
        Statics.field1381 = var3;
        Statics.field4041 = 0;
        Statics.field4165 = var4;
        String[] var9 = new String[Statics.field4165];
        for (int var10 = 0; var10 < Statics.field4165; var10++) {
            var9[var10] = class181.method2432(var3[var10]).field2014;
        }
        class414.method382(var9, Statics.field1381);
    }

    @ObfuscatedName("fm.lt(Lpi;II)V")
    public static void method3232(class419 arg0, int arg1) {
        byte[] var2 = arg0.field4477;
        if (field517 == null) {
            field517 = new byte[24];
        }
        class334.method5616(var2, arg1, field517, 0, 24);
        if (class154.field1693 == null) {
            return;
        }
        try {
            class154.field1693.method6516(0L);
            class154.field1693.method6525(arg0.field4477, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("bp.ly(Lpi;B)V")
    public static void method1017(class419 arg0) {
        if (field517 == null) {
            byte[] var1 = class154.method2546();
            arg0.method6678(var1, 0, var1.length);
        } else {
            arg0.method6678(field517, 0, field517.length);
        }
    }

    @ObfuscatedName("client.lu(I)Lpo;")
    public class440 method1208() {
        return Statics.field4070 == null ? null : Statics.field4070.field1071;
    }

    @ObfuscatedName("do.ld(IIIZI)V")
    public static void method2424(int arg0, int arg1, int arg2, boolean arg3) {
        class255 var4 = Statics.method3174(class253.field2820, field690.field1286);
        var4.field2930.method6835(arg3 ? field608 : 0);
        var4.field2930.method6657(arg0);
        var4.field2930.method6651(arg2);
        var4.field2930.method6654(arg1);
        field690.method2328(var4);
    }

    @ObfuscatedName("fb.le(IS)V")
    public static void method2869(int arg0) {
        field552 = arg0;
    }

    @ObfuscatedName("ky.lb(B)V")
    public static void method4973() {
        if (field552 == 1) {
            field613 = true;
        }
    }

    @ObfuscatedName("hz.lj(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4384(String arg0) {
        class297[] var1 = class297.method3054();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class297 var3 = var1[var2];
            if (var3.field3798 != -1 && arg0.startsWith(class92.method4339(var3.field3798))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3798).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("hh.ln(B)V")
    public static void method4031() {
        if (Statics.field1274 == null) {
            return;
        }
        field560 = field481;
        Statics.field1274.method5247();
        for (int var0 = 0; var0 < field653.length; var0++) {
            if (field653[var0] != null) {
                Statics.field1274.method5258((field653[var0].field1130 >> 7) + Statics.field1533, (field653[var0].field1090 >> 7) + Statics.field1240);
            }
        }
    }

    @ObfuscatedName("ca.lg(I)Z")
    public static boolean method2242() {
        return Statics.field929.field1198 >= field474;
    }

    @ObfuscatedName("dt.ms(I)V")
    public static void method2426() {
        Statics.field929.field1198 = field474;
        class89.method2604();
    }

    @ObfuscatedName("iw.mk(II)V")
    public static void method4539(int arg0) {
        if (field504 != arg0) {
            field504 = arg0;
        }
    }
}

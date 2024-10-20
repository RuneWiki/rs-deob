package deob;

import com.jagex.oldscape.pub.OAuthTokens;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class32 implements class332, OAuthTokens {

    @ObfuscatedName("client.w")
    public static class173[] field594 = new class173[4];

    @ObfuscatedName("client.ay")
    public static boolean field498 = true;

    @ObfuscatedName("client.bg")
    public static int field463 = 1;

    @ObfuscatedName("client.bl")
    public static int field464 = 0;

    @ObfuscatedName("client.bd")
    public static int field489 = 0;

    @ObfuscatedName("client.bs")
    public static boolean field623 = false;

    @ObfuscatedName("client.bh")
    public static boolean field467 = false;

    @ObfuscatedName("client.bo")
    public static int field468 = -1;

    @ObfuscatedName("client.bv")
    public static int field588 = -1;

    @ObfuscatedName("client.bu")
    public static int field470 = -1;

    @ObfuscatedName("client.bz")
    public static boolean field471 = false;

    @ObfuscatedName("client.ca")
    public static int field642 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field473 = true;

    @ObfuscatedName("client.co")
    public static int field555 = 0;

    @ObfuscatedName("client.cy")
    public static long field724 = 1L;

    @ObfuscatedName("client.dq")
    public static int field476 = -1;

    @ObfuscatedName("client.df")
    public static int field477 = -1;

    @ObfuscatedName("client.da")
    public static long field478 = -1L;

    @ObfuscatedName("client.dw")
    public static boolean field479 = true;

    @ObfuscatedName("client.dn")
    public static boolean field703 = false;

    @ObfuscatedName("client.dc")
    public static int field635 = 0;

    @ObfuscatedName("client.dh")
    public static int field706 = 0;

    @ObfuscatedName("client.du")
    public static int field732 = 0;

    @ObfuscatedName("client.db")
    public static int field485 = 0;

    @ObfuscatedName("client.dp")
    public static int field729 = 0;

    @ObfuscatedName("client.dj")
    public static int field504 = 0;

    @ObfuscatedName("client.dt")
    public static int field487 = 0;

    @ObfuscatedName("client.dy")
    public static int field488 = 0;

    @ObfuscatedName("client.ds")
    public static int field645 = 0;

    @ObfuscatedName("client.dg")
    public static class94 field490 = class94.field1230;

    @ObfuscatedName("client.di")
    public static class94 field666 = class94.field1230;

    @ObfuscatedName("client.dz")
    public static int field472 = 0;

    @ObfuscatedName("client.dl")
    public static int field493 = 0;

    @ObfuscatedName("client.dm")
    public static int field573 = 0;

    @ObfuscatedName("client.ee")
    public static int field747 = 0;

    @ObfuscatedName("client.ei")
    public static int field496 = 0;

    @ObfuscatedName("client.ef")
    public static int field497 = 0;

    @ObfuscatedName("client.en")
    public static int field686 = 0;

    @ObfuscatedName("client.eq")
    public static int field499 = 0;

    @ObfuscatedName("client.es")
    public static class113 field694 = class113.field1347;

    @ObfuscatedName("client.fd")
    public static class405 field501 = class405.field4352;

    @ObfuscatedName("client.ft")
    public String field502;

    @ObfuscatedName("client.fl")
    public class15 field492;

    @ObfuscatedName("client.fe")
    public class20 field538;

    @ObfuscatedName("client.fc")
    public static boolean field505 = false;

    @ObfuscatedName("client.fs")
    public static class71 field506 = new class71();

    @ObfuscatedName("client.fo")
    public class401 field580;

    @ObfuscatedName("client.fr")
    public class8 field508;

    @ObfuscatedName("client.fx")
    public static byte[] field509 = null;

    @ObfuscatedName("client.gi")
    public static class91[] field510 = new class91[32768];

    @ObfuscatedName("client.gd")
    public static int field511 = 0;

    @ObfuscatedName("client.go")
    public static int[] field611 = new int[32768];

    @ObfuscatedName("client.gh")
    public static int field513 = 0;

    @ObfuscatedName("client.gn")
    public static int[] field514 = new int[250];

    @ObfuscatedName("client.gb")
    public static final class99 field562 = new class99();

    @ObfuscatedName("client.gg")
    public static int field519 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field517 = false;

    @ObfuscatedName("client.gs")
    public static boolean field518 = true;

    @ObfuscatedName("client.gz")
    public static boolean field620 = false;

    @ObfuscatedName("client.gr")
    public static class326 field520 = new class326();

    @ObfuscatedName("client.ge")
    public static HashMap field515 = new HashMap();

    @ObfuscatedName("client.hm")
    public static int field522 = 0;

    @ObfuscatedName("client.hx")
    public static int field523 = 1;

    @ObfuscatedName("client.ha")
    public static int field524 = 0;

    @ObfuscatedName("client.hf")
    public static int field525 = 1;

    @ObfuscatedName("client.hj")
    public static int field486 = 0;

    @ObfuscatedName("client.hp")
    public static boolean field481 = false;

    @ObfuscatedName("client.hg")
    public static int[][][] field530 = new int[4][13][13];

    @ObfuscatedName("client.hc")
    public static final int[] field531 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.hn")
    public static int field532 = 0;

    @ObfuscatedName("client.ik")
    public static int field629 = 2301979;

    @ObfuscatedName("client.ii")
    public static int field535 = 5063219;

    @ObfuscatedName("client.ib")
    public static int field536 = 3353893;

    @ObfuscatedName("client.ia")
    public static int field507 = 7759444;

    @ObfuscatedName("client.im")
    public static boolean field466 = false;

    @ObfuscatedName("client.ih")
    public static int field633 = 0;

    @ObfuscatedName("client.iu")
    public static int field483 = 128;

    @ObfuscatedName("client.ic")
    public static int field541 = 0;

    @ObfuscatedName("client.iw")
    public static int field542 = 0;

    @ObfuscatedName("client.iq")
    public static int field543 = 0;

    @ObfuscatedName("client.ie")
    public static int field544 = 0;

    @ObfuscatedName("client.is")
    public static int field545 = 0;

    @ObfuscatedName("client.it")
    public static String field625 = null;

    @ObfuscatedName("client.jx")
    public static int field546 = 0;

    @ObfuscatedName("client.jf")
    public static int field727 = 50;

    @ObfuscatedName("client.jt")
    public static int field548 = 0;

    @ObfuscatedName("client.jj")
    public static int field521 = 0;

    @ObfuscatedName("client.jz")
    public static int field550 = 0;

    @ObfuscatedName("client.je")
    public static int field572 = 12;

    @ObfuscatedName("client.jv")
    public static int field552 = 6;

    @ObfuscatedName("client.ji")
    public static int field553 = 0;

    @ObfuscatedName("client.js")
    public static boolean field512 = false;

    @ObfuscatedName("client.jh")
    public static int field621 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field556 = false;

    @ObfuscatedName("client.jm")
    public static int field557 = 0;

    @ObfuscatedName("client.jp")
    public static int field558 = 0;

    @ObfuscatedName("client.jk")
    public static int field721 = 50;

    @ObfuscatedName("client.jd")
    public static int[] field560 = new int[field721];

    @ObfuscatedName("client.jo")
    public static int[] field561 = new int[field721];

    @ObfuscatedName("client.jq")
    public static int[] field462 = new int[field721];

    @ObfuscatedName("client.ja")
    public static int[] field563 = new int[field721];

    @ObfuscatedName("client.jr")
    public static int[] field564 = new int[field721];

    @ObfuscatedName("client.ju")
    public static int[] field565 = new int[field721];

    @ObfuscatedName("client.jb")
    public static int[] field549 = new int[field721];

    @ObfuscatedName("client.jc")
    public static String[] field567 = new String[field721];

    @ObfuscatedName("client.kg")
    public static int[][] field547 = new int[104][104];

    @ObfuscatedName("client.kd")
    public static int field569 = 0;

    @ObfuscatedName("client.kj")
    public static int field570 = -1;

    @ObfuscatedName("client.ko")
    public static int field571 = -1;

    @ObfuscatedName("client.kk")
    public static int field597 = 0;

    @ObfuscatedName("client.kx")
    public static int field609 = 0;

    @ObfuscatedName("client.ki")
    public static int field574 = 0;

    @ObfuscatedName("client.km")
    public static int field701 = 0;

    @ObfuscatedName("client.kr")
    public static boolean field576 = true;

    @ObfuscatedName("client.ku")
    public static int field577 = 0;

    @ObfuscatedName("client.kt")
    public static int field578 = 0;

    @ObfuscatedName("client.kv")
    public static int field579 = 0;

    @ObfuscatedName("client.kq")
    public static int field484 = 0;

    @ObfuscatedName("client.kl")
    public static int field581 = 0;

    @ObfuscatedName("client.ke")
    public static int field699 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field668 = false;

    @ObfuscatedName("client.ks")
    public static int field584 = 0;

    @ObfuscatedName("client.kc")
    public static int field540 = 0;

    @ObfuscatedName("client.kn")
    public static boolean field586 = true;

    @ObfuscatedName("client.kf")
    public static class83[] field587 = new class83[2048];

    @ObfuscatedName("client.ld")
    public static int field718 = -1;

    @ObfuscatedName("client.lm")
    public static int field589 = 0;

    @ObfuscatedName("client.ls")
    public static boolean field590 = true;

    @ObfuscatedName("client.lk")
    public static int field591 = 0;

    @ObfuscatedName("client.li")
    public static int field592 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field593 = new int[1000];

    @ObfuscatedName("client.ln")
    public static final int[] field654 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.lo")
    public static String[] field685 = new String[8];

    @ObfuscatedName("client.lu")
    public static boolean[] field596 = new boolean[8];

    @ObfuscatedName("client.lh")
    public static int[] field709 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.lt")
    public static int field748 = -1;

    @ObfuscatedName("client.lj")
    public static class309[][][] field636 = new class309[4][104][104];

    @ObfuscatedName("client.lr")
    public static class309 field600 = new class309();

    @ObfuscatedName("client.lc")
    public static class309 field615 = new class309();

    @ObfuscatedName("client.lg")
    public static class309 field602 = new class309();

    @ObfuscatedName("client.lz")
    public static int[] field603 = new int[25];

    @ObfuscatedName("client.lv")
    public static int[] field604 = new int[25];

    @ObfuscatedName("client.lw")
    public static int[] field605 = new int[25];

    @ObfuscatedName("client.lp")
    public static int field606 = 0;

    @ObfuscatedName("client.la")
    public static boolean field607 = false;

    @ObfuscatedName("client.mp")
    public static int field608 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field717 = new int[500];

    @ObfuscatedName("client.me")
    public static int[] field610 = new int[500];

    @ObfuscatedName("client.mb")
    public static int[] field705 = new int[500];

    @ObfuscatedName("client.mr")
    public static int[] field612 = new int[500];

    @ObfuscatedName("client.mq")
    public static String[] field613 = new String[500];

    @ObfuscatedName("client.ms")
    public static String[] field614 = new String[500];

    @ObfuscatedName("client.mo")
    public static boolean[] field733 = new boolean[500];

    @ObfuscatedName("client.mc")
    public static boolean field616 = false;

    @ObfuscatedName("client.md")
    public static boolean field503 = false;

    @ObfuscatedName("client.ml")
    public static boolean field618 = false;

    @ObfuscatedName("client.mf")
    public static boolean field619 = true;

    @ObfuscatedName("client.mn")
    public static int field641 = -1;

    @ObfuscatedName("client.mi")
    public static int field617 = -1;

    @ObfuscatedName("client.mz")
    public static int field622 = 0;

    @ObfuscatedName("client.mj")
    public static int field715 = 50;

    @ObfuscatedName("client.mk")
    public static int field624 = 0;

    @ObfuscatedName("client.nh")
    public static boolean field626 = false;

    @ObfuscatedName("client.na")
    public static int field529 = -1;

    @ObfuscatedName("client.nl")
    public static int field628 = -1;

    @ObfuscatedName("client.nj")
    public static String field575 = null;

    @ObfuscatedName("client.np")
    public static String field630 = null;

    @ObfuscatedName("client.nm")
    public static int field631 = -1;

    @ObfuscatedName("client.nc")
    public static class380 field632 = new class380(8);

    @ObfuscatedName("client.nf")
    public static int field480 = 0;

    @ObfuscatedName("client.nq")
    public static int field634 = -1;

    @ObfuscatedName("client.nz")
    public static int field559 = 0;

    @ObfuscatedName("client.nx")
    public static int field657 = 0;

    @ObfuscatedName("client.ni")
    public static class262 field637 = null;

    @ObfuscatedName("client.nn")
    public static int field638 = 0;

    @ObfuscatedName("client.nv")
    public static int field639 = 0;

    @ObfuscatedName("client.nw")
    public static int field640 = 0;

    @ObfuscatedName("client.nk")
    public static int field583 = -1;

    @ObfuscatedName("client.no")
    public static boolean field734 = false;

    @ObfuscatedName("client.nd")
    public static class262 field643 = null;

    @ObfuscatedName("client.ne")
    public static class262 field739 = null;

    @ObfuscatedName("client.ok")
    public static class262 field568 = null;

    @ObfuscatedName("client.ot")
    public static int field646 = 0;

    @ObfuscatedName("client.og")
    public static int field647 = 0;

    @ObfuscatedName("client.on")
    public static class262 field648 = null;

    @ObfuscatedName("client.oo")
    public static boolean field649 = false;

    @ObfuscatedName("client.oq")
    public static int field650 = -1;

    @ObfuscatedName("client.oh")
    public static int field651 = -1;

    @ObfuscatedName("client.oi")
    public static boolean field681 = false;

    @ObfuscatedName("client.oz")
    public static int field653 = -1;

    @ObfuscatedName("client.oj")
    public static int field469 = -1;

    @ObfuscatedName("client.op")
    public static boolean field655 = false;

    @ObfuscatedName("client.ox")
    public static int field656 = 1;

    @ObfuscatedName("client.ov")
    public static int[] field669 = new int[32];

    @ObfuscatedName("client.ob")
    public static int field658 = 0;

    @ObfuscatedName("client.od")
    public static int[] field659 = new int[32];

    @ObfuscatedName("client.om")
    public static int field660 = 0;

    @ObfuscatedName("client.oe")
    public static int[] field661 = new int[32];

    @ObfuscatedName("client.ow")
    public static int field526 = 0;

    @ObfuscatedName("client.ou")
    public static int[] field663 = new int[32];

    @ObfuscatedName("client.oc")
    public static int field664 = 0;

    @ObfuscatedName("client.pw")
    public static int field665 = 0;

    @ObfuscatedName("client.pz")
    public static int field680 = 0;

    @ObfuscatedName("client.pd")
    public static int field667 = 0;

    @ObfuscatedName("client.pp")
    public static int field682 = 0;

    @ObfuscatedName("client.pl")
    public static int field725 = 0;

    @ObfuscatedName("client.pb")
    public static int field537 = 0;

    @ObfuscatedName("client.py")
    public static int field671 = 0;

    @ObfuscatedName("client.px")
    public static int field495 = 0;

    @ObfuscatedName("client.pe")
    public static int field673 = 0;

    @ObfuscatedName("client.pq")
    public static class309 field674 = new class309();

    @ObfuscatedName("client.pj")
    public static class309 field675 = new class309();

    @ObfuscatedName("client.pk")
    public static class309 field676 = new class309();

    @ObfuscatedName("client.pi")
    public static class380 field677 = new class380(512);

    @ObfuscatedName("client.pu")
    public static int field672 = 0;

    @ObfuscatedName("client.pm")
    public static int field679 = -2;

    @ObfuscatedName("client.pf")
    public static boolean[] field595 = new boolean[100];

    @ObfuscatedName("client.pn")
    public static boolean[] field554 = new boolean[100];

    @ObfuscatedName("client.pc")
    public static boolean[] field652 = new boolean[100];

    @ObfuscatedName("client.pa")
    public static int[] field683 = new int[100];

    @ObfuscatedName("client.pt")
    public static int[] field684 = new int[100];

    @ObfuscatedName("client.qa")
    public static int[] field691 = new int[100];

    @ObfuscatedName("client.qq")
    public static int[] field516 = new int[100];

    @ObfuscatedName("client.qs")
    public static int field687 = 0;

    @ObfuscatedName("client.qb")
    public static long field688 = 0L;

    @ObfuscatedName("client.qe")
    public static boolean field689 = true;

    @ObfuscatedName("client.qg")
    public static int[] field690 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.qm")
    public static int field491 = 0;

    @ObfuscatedName("client.qo")
    public static int field662 = 0;

    @ObfuscatedName("client.qd")
    public static String field693 = "";

    @ObfuscatedName("client.qn")
    public static long[] field475 = new long[100];

    @ObfuscatedName("client.qi")
    public static int field695 = 0;

    @ObfuscatedName("client.qu")
    public static int field696 = 0;

    @ObfuscatedName("client.qp")
    public static int[] field697 = new int[128];

    @ObfuscatedName("client.qy")
    public static int[] field698 = new int[128];

    @ObfuscatedName("client.qh")
    public static long field566 = -1L;

    @ObfuscatedName("client.rv")
    public static class128[] field700 = new class128[2];

    @ObfuscatedName("client.rr")
    public static class137[] field494 = new class137[2];

    @ObfuscatedName("client.rf")
    public static int field702 = -1;

    @ObfuscatedName("client.rw")
    public static int field528 = 0;

    @ObfuscatedName("client.rh")
    public static int[] field704 = new int[1000];

    @ObfuscatedName("client.rk")
    public static int[] field474 = new int[1000];

    @ObfuscatedName("client.ro")
    public static class414[] field644 = new class414[1000];

    @ObfuscatedName("client.rb")
    public static int field707 = 0;

    @ObfuscatedName("client.rc")
    public static int field678 = 0;

    @ObfuscatedName("client.re")
    public static int field482 = 0;

    @ObfuscatedName("client.ra")
    public static int field710 = -1;

    @ObfuscatedName("client.rg")
    public static boolean field711 = false;

    @ObfuscatedName("client.sf")
    public static int field712 = 0;

    @ObfuscatedName("client.se")
    public static int[] field713 = new int[50];

    @ObfuscatedName("client.sv")
    public static int[] field714 = new int[50];

    @ObfuscatedName("client.sa")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.sy")
    public static int[] field716 = new int[50];

    @ObfuscatedName("client.sj")
    public static class35[] field585 = new class35[50];

    @ObfuscatedName("client.su")
    public static boolean field692 = false;

    @ObfuscatedName("client.sc")
    public static boolean[] field719 = new boolean[5];

    @ObfuscatedName("client.sr")
    public static int[] field720 = new int[5];

    @ObfuscatedName("client.sq")
    public static int[] field599 = new int[5];

    @ObfuscatedName("client.so")
    public static int[] field722 = new int[5];

    @ObfuscatedName("client.sh")
    public static int[] field723 = new int[5];

    @ObfuscatedName("client.sw")
    public static short field465 = 256;

    @ObfuscatedName("client.st")
    public static short field551 = 205;

    @ObfuscatedName("client.tn")
    public static short field726 = 256;

    @ObfuscatedName("client.tx")
    public static short field598 = 320;

    @ObfuscatedName("client.tf")
    public static short field728 = 1;

    @ObfuscatedName("client.ti")
    public static short field601 = 32767;

    @ObfuscatedName("client.to")
    public static short field730 = 1;

    @ObfuscatedName("client.th")
    public static short field731 = 32767;

    @ObfuscatedName("client.ts")
    public static int field500 = 0;

    @ObfuscatedName("client.tq")
    public static int field708 = 0;

    @ObfuscatedName("client.tp")
    public static int field627 = 0;

    @ObfuscatedName("client.tg")
    public static int field735 = 0;

    @ObfuscatedName("client.tz")
    public static int field736 = 0;

    @ObfuscatedName("client.ty")
    public static class260 field737 = new class260();

    @ObfuscatedName("client.tj")
    public static int field738 = -1;

    @ObfuscatedName("client.tt")
    public static int field582 = -1;

    @ObfuscatedName("client.tk")
    public static class373 field740 = new class371();

    @ObfuscatedName("client.tl")
    public static class299[] field741 = new class299[8];

    @ObfuscatedName("client.ta")
    public static class60 field742 = new class60();

    @ObfuscatedName("client.us")
    public static int field743 = -1;

    @ObfuscatedName("client.uj")
    public static ArrayList field670 = new ArrayList(10);

    @ObfuscatedName("client.ub")
    public static int field745 = 0;

    @ObfuscatedName("client.uf")
    public static int field746 = 0;

    @ObfuscatedName("client.ut")
    public static final class59 field744 = new class59();

    @ObfuscatedName("client.ug")
    public static int[] field539 = new int[50];

    @ObfuscatedName("client.um")
    public static int[] field749 = new int[50];

    @ObfuscatedName("bx.ef(I)Lng;")
    public static class375 method1037() {
        return Statics.field1494;
    }

    @ObfuscatedName("client.at(B)V")
    public final void method425() {
    }

    public final void init() {
        if (!this.method428()) {
            return;
        }
        for (int var1 = 0; var1 <= 27; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field518 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class92.field1217)) {
                            field623 = true;
                        } else {
                            field623 = false;
                        }
                        break;
                    case 4:
                        if (field588 == -1) {
                            field588 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field464 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field207 = class305.method4945(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field985 = class278.method3529(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class92.field1217)) {
                        }
                        break;
                    case 9:
                        Statics.field1317 = var2;
                        break;
                    case 10:
                        Statics.field1987 = (class279) class304.method2319(class279.method2774(), Integer.parseInt(var2));
                        if (Statics.field1987 == class279.field3297) {
                            Statics.field3757 = class383.field4226;
                        } else {
                            Statics.field3757 = class383.field4232;
                        }
                        break;
                    case 11:
                        Statics.field2204 = var2;
                        break;
                    case 12:
                        field463 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field2484 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field489 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2619 = var2;
                        break;
                    case 21:
                        field468 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field620 = Integer.parseInt(var2) != 0;
                }
            }
        }
        class213.field2419 = false;
        field467 = false;
        Statics.field2114 = this.getCodeBase().getHost();
        String var3 = Statics.field985.field3289;
        byte var4 = 0;
        try {
            class144.method4938("oldschool", var3, var4, 21);
        } catch (Exception var6) {
            class425.method2652((String) null, var6);
        }
        Statics.field983 = this;
        Statics.field4438 = field588;
        if (field470 == -1) {
            field470 = 0;
        }
        Statics.field1561 = System.getenv("JX_ACCESS_TOKEN");
        System.getenv("JX_REFRESH_TOKEN");
        this.method436(765, 503, 201);
    }

    public void setOAuthTokens(String arg0, String arg1) {
        if (arg0 != null && !arg0.trim().isEmpty() && arg1 != null && !arg1.trim().isEmpty()) {
            Statics.field1561 = arg0;
            class69.method4653(10);
        }
    }

    @ObfuscatedName("client.eq(I)Z")
    public boolean method1090() {
        return Statics.field1561 != null && !Statics.field1561.trim().isEmpty();
    }

    @ObfuscatedName("client.es(Ljava/lang/String;I)V")
    public void method1362(String arg0) throws MalformedURLException, IOException {
        class11 var2 = new class11(new URL(Statics.field2204 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class10.field28);
        var2.method78("Authorization", "Bearer " + arg0);
        this.field538 = this.field492.method179(var2);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method454() {
        class324.method3090(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field456 = field489 == 0 ? 43594 : field463 + 40000;
        Statics.field1792 = field489 == 0 ? 443 : field463 + 50000;
        Statics.field1028 = Statics.field456;
        Statics.field4082 = class261.field3036;
        Statics.field1520 = class261.field3040;
        Statics.field3014 = class261.field3037;
        Statics.field1513 = class261.field3038;
        Statics.field3866 = new class100();
        this.method553();
        this.method432();
        Statics.field225 = this.method449();
        Statics.field2053 = new class348(255, class144.field1554, class144.field1555, 500000);
        class385 var1 = null;
        class89 var2 = new class89();
        try {
            var1 = class144.method359("", Statics.field1987.field3298, false);
            byte[] var3 = new byte[(int) var1.method6075()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6065(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class89(new class401(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method6062();
            }
        } catch (Exception var9) {
        }
        Statics.field4363 = var2;
        this.method503();
        class30.method4871(this, Statics.field1646);
        if (field489 != 0) {
            field703 = true;
        }
        Statics.method2798(Statics.field4363.field1194);
        Statics.field1352 = new class62(Statics.field3757);
        this.field492 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.h(I)V")
    public final void method455() {
        field555++;
        this.method1094();
        class287.method4481();
        class248.method2509();
        Statics.method178();
        class24 var1 = class24.field122;
        synchronized (class24.field122) {
            class24.field129++;
            class24.field108 = class24.field132;
            class24.field111 = 0;
            class24.field136 = 0;
            Arrays.fill(class24.field119, false);
            Arrays.fill(class24.field120, false);
            if (class24.field123 < 0) {
                Arrays.fill(class24.field118, false);
                class24.field123 = class24.field134;
            } else {
                while (class24.field134 != class24.field123) {
                    int var2 = class24.field121[class24.field134];
                    class24.field134 = class24.field134 + 1 & 0x7F;
                    if (var2 < 0) {
                        int var3 = ~var2;
                        if (class24.field118[var3]) {
                            class24.field118[var3] = false;
                            class24.field120[var3] = true;
                            class24.field128[class24.field136] = var3;
                            class24.field136++;
                        }
                    } else {
                        if (!class24.field118[var2] && class24.field111 < class24.field126.length - 1) {
                            class24.field119[var2] = true;
                            class24.field126[++class24.field111 - 1] = var2;
                        }
                        class24.field118[var2] = true;
                    }
                }
            }
            if (class24.field111 > 0) {
                class24.field129 = 0;
            }
            class24.field132 = class24.field131;
        }
        class33.method4961();
        if (Statics.field225 != null) {
            int var5 = Statics.field225.method307();
            field673 = var5;
        }
        if (field642 == 0) {
            method2636();
            Statics.field1598.method2560();
            for (int var6 = 0; var6 < 32; var6++) {
                field177[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field178[var7] = 0L;
            }
            Statics.field6 = 0;
        } else if (field642 == 5) {
            class69.method4649(this, Statics.field12);
            method2636();
            Statics.field1598.method2560();
            for (int var8 = 0; var8 < 32; var8++) {
                field177[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field178[var9] = 0L;
            }
            Statics.field6 = 0;
        } else if (field642 == 10 || field642 == 11) {
            class69.method4649(this, Statics.field12);
        } else if (field642 == 20) {
            class69.method4649(this, Statics.field12);
            this.method1097();
        } else if (field642 == 25) {
            method1816(false);
            field522 = 0;
            boolean var10 = true;
            for (int var11 = 0; var11 < Statics.field3806.length; var11++) {
                if (Statics.field1398[var11] != -1 && Statics.field3806[var11] == null) {
                    Statics.field3806[var11] = Statics.field50.method4743(Statics.field1398[var11], 0);
                    if (Statics.field3806[var11] == null) {
                        var10 = false;
                        field522++;
                    }
                }
                if (Statics.field102[var11] != -1 && Statics.field2098[var11] == null) {
                    Statics.field2098[var11] = Statics.field50.method4769(Statics.field102[var11], 0, Statics.field527[var11]);
                    if (Statics.field2098[var11] == null) {
                        var10 = false;
                        field522++;
                    }
                }
            }
            if (var10) {
                field524 = 0;
                boolean var12 = true;
                for (int var13 = 0; var13 < Statics.field3806.length; var13++) {
                    byte[] var14 = Statics.field2098[var13];
                    if (var14 != null) {
                        int var15 = (Statics.field1155[var13] >> 8) * 64 - Statics.field92;
                        int var16 = (Statics.field1155[var13] & 0xFF) * 64 - Statics.field4007;
                        if (field481) {
                            var15 = 10;
                            var16 = 10;
                        }
                        var12 &= class75.method65(var14, var15, var16);
                    }
                }
                if (var12) {
                    if (field486 != 0) {
                        method2149(class283.field3438 + class92.field1218 + class92.field1215 + 100 + "%" + class92.field1219, true);
                    }
                    Statics.method178();
                    Statics.field3291.method4002();
                    for (int var17 = 0; var17 < 4; var17++) {
                        field594[var17].method3146();
                    }
                    for (int var18 = 0; var18 < 4; var18++) {
                        for (int var19 = 0; var19 < 104; var19++) {
                            for (int var20 = 0; var20 < 104; var20++) {
                                class75.field955[var18][var19][var20] = 0;
                            }
                        }
                    }
                    Statics.method178();
                    class75.field957 = 99;
                    Statics.field966 = new byte[4][104][104];
                    Statics.field959 = new byte[4][104][104];
                    Statics.field960 = new byte[4][104][104];
                    Statics.field970 = new byte[4][104][104];
                    Statics.field963 = new int[4][105][105];
                    Statics.field420 = new byte[4][105][105];
                    Statics.field3213 = new int[105][105];
                    Statics.field1236 = new int[104];
                    Statics.field4288 = new int[104];
                    Statics.field962 = new int[104];
                    Statics.field7 = new int[104];
                    Statics.field1040 = new int[104];
                    int var21 = Statics.field3806.length;
                    for (class63 var22 = (class63) class63.field770.method4981(); var22 != null; var22 = (class63) class63.field770.method4987()) {
                        if (var22.field776 != null) {
                            Statics.field1331.method621(var22.field776);
                            var22.field776 = null;
                        }
                        if (var22.field781 != null) {
                            Statics.field1331.method621(var22.field781);
                            var22.field781 = null;
                        }
                    }
                    class63.field770.method4989();
                    method1816(true);
                    if (!field481) {
                        for (int var23 = 0; var23 < var21; var23++) {
                            int var24 = (Statics.field1155[var23] >> 8) * 64 - Statics.field92;
                            int var25 = (Statics.field1155[var23] & 0xFF) * 64 - Statics.field4007;
                            byte[] var26 = Statics.field3806[var23];
                            if (var26 != null) {
                                Statics.method178();
                                class75.method5997(var26, var24, var25, Statics.field2244 * 8 - 48, Statics.field2631 * 8 - 48, field594);
                            }
                        }
                        for (int var27 = 0; var27 < var21; var27++) {
                            int var28 = (Statics.field1155[var27] >> 8) * 64 - Statics.field92;
                            int var29 = (Statics.field1155[var27] & 0xFF) * 64 - Statics.field4007;
                            byte[] var30 = Statics.field3806[var27];
                            if (var30 == null && Statics.field2631 < 800) {
                                Statics.method178();
                                class75.method4261(var28, var29, 64, 64);
                            }
                        }
                        method1816(true);
                        for (int var31 = 0; var31 < var21; var31++) {
                            byte[] var32 = Statics.field2098[var31];
                            if (var32 != null) {
                                int var33 = (Statics.field1155[var31] >> 8) * 64 - Statics.field92;
                                int var34 = (Statics.field1155[var31] & 0xFF) * 64 - Statics.field4007;
                                Statics.method178();
                                class75.method2051(var32, var33, var34, Statics.field3291, field594);
                            }
                        }
                    }
                    if (field481) {
                        int var35 = 0;
                        label1074: while (true) {
                            if (var35 >= 4) {
                                for (int var53 = 0; var53 < 13; var53++) {
                                    for (int var54 = 0; var54 < 13; var54++) {
                                        int var55 = field530[0][var53][var54];
                                        if (var55 == -1) {
                                            class75.method4261(var53 * 8, var54 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1816(true);
                                int var56 = 0;
                                while (true) {
                                    if (var56 >= 4) {
                                        break label1074;
                                    }
                                    Statics.method178();
                                    for (int var57 = 0; var57 < 13; var57++) {
                                        label997: for (int var58 = 0; var58 < 13; var58++) {
                                            int var59 = field530[var56][var57][var58];
                                            if (var59 != -1) {
                                                int var60 = var59 >> 24 & 0x3;
                                                int var61 = var59 >> 1 & 0x3;
                                                int var62 = var59 >> 14 & 0x3FF;
                                                int var63 = var59 >> 3 & 0x7FF;
                                                int var64 = (var62 / 8 << 8) + var63 / 8;
                                                for (int var65 = 0; var65 < Statics.field1155.length; var65++) {
                                                    if (Statics.field1155[var65] == var64 && Statics.field2098[var65] != null) {
                                                        byte[] var66 = Statics.field2098[var65];
                                                        int var67 = var57 * 8;
                                                        int var68 = var58 * 8;
                                                        int var69 = (var62 & 0x7) * 8;
                                                        int var70 = (var63 & 0x7) * 8;
                                                        class213 var71 = Statics.field3291;
                                                        class173[] var72 = field594;
                                                        class401 var73 = new class401(var66);
                                                        int var74 = -1;
                                                        while (true) {
                                                            int var75 = var73.method6255();
                                                            if (var75 == 0) {
                                                                continue label997;
                                                            }
                                                            var74 += var75;
                                                            int var76 = 0;
                                                            while (true) {
                                                                int var77 = var73.method6254();
                                                                if (var77 == 0) {
                                                                    break;
                                                                }
                                                                var76 += var77 - 1;
                                                                int var78 = var76 & 0x3F;
                                                                int var79 = var76 >> 6 & 0x3F;
                                                                int var80 = var76 >> 12;
                                                                int var81 = var73.method6240();
                                                                int var82 = var81 >> 2;
                                                                int var83 = var81 & 0x3;
                                                                if (var60 == var80 && var79 >= var69 && var79 < var69 + 8 && var78 >= var70 && var78 < var70 + 8) {
                                                                    class169 var84 = Statics.method2740(var74);
                                                                    class259 var10001 = (class259) null;
                                                                    int var85 = var67 + class259.method753(var79 & 0x7, var78 & 0x7, var61, var84.field1828, var84.field1840, var83);
                                                                    class259 var232 = (class259) null;
                                                                    int var86 = var68 + class259.method3567(var79 & 0x7, var78 & 0x7, var61, var84.field1828, var84.field1840, var83);
                                                                    if (var85 > 0 && var86 > 0 && var85 < 103 && var86 < 103) {
                                                                        int var87 = var56;
                                                                        if ((class75.field955[1][var85][var86] & 0x2) == 2) {
                                                                            var87 = var56 - 1;
                                                                        }
                                                                        class173 var88 = null;
                                                                        if (var87 >= 0) {
                                                                            var88 = var72[var87];
                                                                        }
                                                                        class75.method2150(var56, var85, var86, var74, var61 + var83 & 0x3, var82, var71, var88);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var56++;
                                }
                            }
                            Statics.method178();
                            for (int var36 = 0; var36 < 13; var36++) {
                                for (int var37 = 0; var37 < 13; var37++) {
                                    boolean var38 = false;
                                    int var39 = field530[var35][var36][var37];
                                    if (var39 != -1) {
                                        int var40 = var39 >> 24 & 0x3;
                                        int var41 = var39 >> 1 & 0x3;
                                        int var42 = var39 >> 14 & 0x3FF;
                                        int var43 = var39 >> 3 & 0x7FF;
                                        int var44 = (var42 / 8 << 8) + var43 / 8;
                                        for (int var45 = 0; var45 < Statics.field1155.length; var45++) {
                                            if (Statics.field1155[var45] == var44 && Statics.field3806[var45] != null) {
                                                class75.method3109(Statics.field3806[var45], var35, var36 * 8, var37 * 8, var40, (var42 & 0x7) * 8, (var43 & 0x7) * 8, var41, field594);
                                                var38 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var38) {
                                        int var46 = var35;
                                        int var47 = var36 * 8;
                                        int var48 = var37 * 8;
                                        for (int var49 = 0; var49 < 8; var49++) {
                                            for (int var50 = 0; var50 < 8; var50++) {
                                                class75.field969[var46][var47 + var49][var48 + var50] = 0;
                                            }
                                        }
                                        if (var47 > 0) {
                                            for (int var51 = 1; var51 < 8; var51++) {
                                                class75.field969[var46][var47][var48 + var51] = class75.field969[var46][var47 - 1][var48 + var51];
                                            }
                                        }
                                        if (var48 > 0) {
                                            for (int var52 = 1; var52 < 8; var52++) {
                                                class75.field969[var46][var47 + var52][var48] = class75.field969[var46][var47 + var52][var48 - 1];
                                            }
                                        }
                                        if (var47 > 0 && class75.field969[var46][var47 - 1][var48] != 0) {
                                            class75.field969[var46][var47][var48] = class75.field969[var46][var47 - 1][var48];
                                        } else if (var48 > 0 && class75.field969[var46][var47][var48 - 1] != 0) {
                                            class75.field969[var46][var47][var48] = class75.field969[var46][var47][var48 - 1];
                                        } else if (var47 > 0 && var48 > 0 && class75.field969[var46][var47 - 1][var48 - 1] != 0) {
                                            class75.field969[var46][var47][var48] = class75.field969[var46][var47 - 1][var48 - 1];
                                        }
                                    }
                                }
                            }
                            var35++;
                        }
                    }
                    method1816(true);
                    Statics.method178();
                    class213 var89 = Statics.field3291;
                    class173[] var90 = field594;
                    for (int var91 = 0; var91 < 4; var91++) {
                        for (int var92 = 0; var92 < 104; var92++) {
                            for (int var93 = 0; var93 < 104; var93++) {
                                if ((class75.field955[var91][var92][var93] & 0x1) == 1) {
                                    int var94 = var91;
                                    if ((class75.field955[1][var92][var93] & 0x2) == 2) {
                                        var94 = var91 - 1;
                                    }
                                    if (var94 >= 0) {
                                        var90[var94].method3149(var92, var93);
                                    }
                                }
                            }
                        }
                    }
                    class75.field956 += (int) (Math.random() * 5.0D) - 2;
                    if (class75.field956 < -8) {
                        class75.field956 = -8;
                    }
                    if (class75.field956 > 8) {
                        class75.field956 = 8;
                    }
                    class75.field972 += (int) (Math.random() * 5.0D) - 2;
                    if (class75.field972 < -16) {
                        class75.field972 = -16;
                    }
                    if (class75.field972 > 16) {
                        class75.field972 = 16;
                    }
                    for (int var95 = 0; var95 < 4; var95++) {
                        byte[][] var96 = Statics.field420[var95];
                        int var97 = (int) Math.sqrt(5100.0D);
                        int var98 = var97 * 768 >> 8;
                        for (int var99 = 1; var99 < 103; var99++) {
                            for (int var100 = 1; var100 < 103; var100++) {
                                int var101 = class75.field969[var95][var100 + 1][var99] - class75.field969[var95][var100 - 1][var99];
                                int var102 = class75.field969[var95][var100][var99 + 1] - class75.field969[var95][var100][var99 - 1];
                                int var103 = (int) Math.sqrt((double) (var102 * var102 + var101 * var101 + 65536));
                                int var104 = (var101 << 8) / var103;
                                int var105 = 65536 / var103;
                                int var106 = (var102 << 8) / var103;
                                int var107 = (var106 * -50 + var104 * -50 + var105 * -10) / var98 + 96;
                                int var108 = (var96[var100][var99] >> 1) + (var96[var100][var99 + 1] >> 3) + (var96[var100][var99 - 1] >> 2) + (var96[var100 - 1][var99] >> 2) + (var96[var100 + 1][var99] >> 3);
                                Statics.field3213[var100][var99] = var107 - var108;
                            }
                        }
                        for (int var109 = 0; var109 < 104; var109++) {
                            Statics.field1236[var109] = 0;
                            Statics.field4288[var109] = 0;
                            Statics.field962[var109] = 0;
                            Statics.field7[var109] = 0;
                            Statics.field1040[var109] = 0;
                        }
                        for (int var110 = -5; var110 < 109; var110++) {
                            for (int var111 = 0; var111 < 104; var111++) {
                                int var112 = var110 + 5;
                                int var10002;
                                if (var112 >= 0 && var112 < 104) {
                                    int var113 = Statics.field966[var95][var112][var111] & 0xFF;
                                    if (var113 > 0) {
                                        int var114 = var113 - 1;
                                        class164 var115 = (class164) class164.field1763.method4205((long) var114);
                                        class164 var116;
                                        if (var115 == null) {
                                            byte[] var117 = Statics.field1771.method4743(1, var114);
                                            class164 var118 = new class164();
                                            if (var117 != null) {
                                                var118.method2863(new class401(var117), var114);
                                            }
                                            var118.method2861();
                                            class164.field1763.method4206(var118, (long) var114);
                                            var116 = var118;
                                        } else {
                                            var116 = var115;
                                        }
                                        Statics.field1236[var111] += var116.field1766;
                                        Statics.field4288[var111] += var116.field1767;
                                        Statics.field962[var111] += var116.field1764;
                                        Statics.field7[var111] += var116.field1769;
                                        var10002 = Statics.field1040[var111]++;
                                    }
                                }
                                int var120 = var110 - 5;
                                if (var120 >= 0 && var120 < 104) {
                                    int var121 = Statics.field966[var95][var120][var111] & 0xFF;
                                    if (var121 > 0) {
                                        int var122 = var121 - 1;
                                        class164 var123 = (class164) class164.field1763.method4205((long) var122);
                                        class164 var124;
                                        if (var123 == null) {
                                            byte[] var125 = Statics.field1771.method4743(1, var122);
                                            class164 var126 = new class164();
                                            if (var125 != null) {
                                                var126.method2863(new class401(var125), var122);
                                            }
                                            var126.method2861();
                                            class164.field1763.method4206(var126, (long) var122);
                                            var124 = var126;
                                        } else {
                                            var124 = var123;
                                        }
                                        Statics.field1236[var111] -= var124.field1766;
                                        Statics.field4288[var111] -= var124.field1767;
                                        Statics.field962[var111] -= var124.field1764;
                                        Statics.field7[var111] -= var124.field1769;
                                        var10002 = Statics.field1040[var111]--;
                                    }
                                }
                            }
                            if (var110 >= 1 && var110 < 103) {
                                int var128 = 0;
                                int var129 = 0;
                                int var130 = 0;
                                int var131 = 0;
                                int var132 = 0;
                                for (int var133 = -5; var133 < 109; var133++) {
                                    int var134 = var133 + 5;
                                    if (var134 >= 0 && var134 < 104) {
                                        var128 += Statics.field1236[var134];
                                        var129 += Statics.field4288[var134];
                                        var130 += Statics.field962[var134];
                                        var131 += Statics.field7[var134];
                                        var132 += Statics.field1040[var134];
                                    }
                                    int var135 = var133 - 5;
                                    if (var135 >= 0 && var135 < 104) {
                                        var128 -= Statics.field1236[var135];
                                        var129 -= Statics.field4288[var135];
                                        var130 -= Statics.field962[var135];
                                        var131 -= Statics.field7[var135];
                                        var132 -= Statics.field1040[var135];
                                    }
                                    if (var133 >= 1 && var133 < 103 && (!field467 || (class75.field955[0][var110][var133] & 0x2) != 0 || (class75.field955[var95][var110][var133] & 0x10) == 0)) {
                                        if (var95 < class75.field957) {
                                            class75.field957 = var95;
                                        }
                                        int var136 = Statics.field966[var95][var110][var133] & 0xFF;
                                        int var137 = Statics.field959[var95][var110][var133] & 0xFF;
                                        if (var136 > 0 || var137 > 0) {
                                            int var138 = class75.field969[var95][var110][var133];
                                            int var139 = class75.field969[var95][var110 + 1][var133];
                                            int var140 = class75.field969[var95][var110 + 1][var133 + 1];
                                            int var141 = class75.field969[var95][var110][var133 + 1];
                                            int var142 = Statics.field3213[var110][var133];
                                            int var143 = Statics.field3213[var110 + 1][var133];
                                            int var144 = Statics.field3213[var110 + 1][var133 + 1];
                                            int var145 = Statics.field3213[var110][var133 + 1];
                                            int var146 = -1;
                                            int var147 = -1;
                                            if (var136 > 0) {
                                                int var148 = var128 * 256 / var131;
                                                int var149 = var129 / var132;
                                                int var150 = var130 / var132;
                                                var146 = Statics.method262(var148, var149, var150);
                                                int var151 = class75.field956 + var148 & 0xFF;
                                                int var152 = class75.field972 + var150;
                                                if (var152 < 0) {
                                                    var152 = 0;
                                                } else if (var152 > 255) {
                                                    var152 = 255;
                                                }
                                                var147 = Statics.method262(var151, var149, var152);
                                            }
                                            if (var95 > 0) {
                                                boolean var153 = true;
                                                if (var136 == 0 && Statics.field960[var95][var110][var133] != 0) {
                                                    var153 = false;
                                                }
                                                if (var137 > 0 && !class171.method2677(var137 - 1).field1938) {
                                                    var153 = false;
                                                }
                                                if (var153 && var138 == var139 && var138 == var140 && var138 == var141) {
                                                    Statics.field963[var95][var110][var133] |= 0x924;
                                                }
                                            }
                                            int var154 = 0;
                                            if (var147 != -1) {
                                                var154 = class211.field2365[class75.method2321(var147, 96)];
                                            }
                                            if (var137 == 0) {
                                                var89.method3832(var95, var110, var133, 0, 0, -1, var138, var139, var140, var141, class75.method2321(var146, var142), class75.method2321(var146, var143), class75.method2321(var146, var144), class75.method2321(var146, var145), 0, 0, 0, 0, var154, 0);
                                            } else {
                                                int var155 = Statics.field960[var95][var110][var133] + 1;
                                                byte var156 = Statics.field970[var95][var110][var133];
                                                class171 var157 = class171.method2677(var137 - 1);
                                                int var158 = var157.field1947;
                                                int var159;
                                                int var160;
                                                if (var158 >= 0) {
                                                    var159 = Statics.field2369.method4033(var158);
                                                    var160 = -1;
                                                } else if (var157.field1936 == 16711935) {
                                                    var160 = -2;
                                                    var158 = -1;
                                                    var159 = -2;
                                                } else {
                                                    var160 = Statics.method262(var157.field1940, var157.field1941, var157.field1937);
                                                    int var161 = class75.field956 + var157.field1940 & 0xFF;
                                                    int var162 = class75.field972 + var157.field1937;
                                                    if (var162 < 0) {
                                                        var162 = 0;
                                                    } else if (var162 > 255) {
                                                        var162 = 255;
                                                    }
                                                    var159 = Statics.method262(var161, var157.field1941, var162);
                                                }
                                                int var163 = 0;
                                                if (var159 != -2) {
                                                    var163 = class211.field2365[class75.method3528(var159, 96)];
                                                }
                                                if (var157.field1939 != -1) {
                                                    int var164 = class75.field956 + var157.field1934 & 0xFF;
                                                    int var165 = class75.field972 + var157.field1943;
                                                    if (var165 < 0) {
                                                        var165 = 0;
                                                    } else if (var165 > 255) {
                                                        var165 = 255;
                                                    }
                                                    int var166 = Statics.method262(var164, var157.field1944, var165);
                                                    var163 = class211.field2365[class75.method3528(var166, 96)];
                                                }
                                                var89.method3832(var95, var110, var133, var155, var156, var158, var138, var139, var140, var141, class75.method2321(var146, var142), class75.method2321(var146, var143), class75.method2321(var146, var144), class75.method2321(var146, var145), class75.method3528(var160, var142), class75.method3528(var160, var143), class75.method3528(var160, var144), class75.method3528(var160, var145), var154, var163);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var167 = 1; var167 < 103; var167++) {
                            for (int var168 = 1; var168 < 103; var168++) {
                                int var173;
                                if ((class75.field955[var95][var168][var167] & 0x8) != 0) {
                                    var173 = 0;
                                } else if (var95 <= 0 || (class75.field955[1][var168][var167] & 0x2) == 0) {
                                    var173 = var95;
                                } else {
                                    var173 = var95 - 1;
                                }
                                var89.method3831(var95, var168, var167, var173);
                            }
                        }
                        Statics.field966[var95] = (byte[][]) null;
                        Statics.field959[var95] = (byte[][]) null;
                        Statics.field960[var95] = (byte[][]) null;
                        Statics.field970[var95] = (byte[][]) null;
                        Statics.field420[var95] = (byte[][]) null;
                    }
                    var89.method3858(-50, -10, -50);
                    for (int var174 = 0; var174 < 104; var174++) {
                        for (int var175 = 0; var175 < 104; var175++) {
                            if ((class75.field955[1][var174][var175] & 0x2) == 2) {
                                var89.method3880(var174, var175);
                            }
                        }
                    }
                    int var176 = 1;
                    int var177 = 2;
                    int var178 = 4;
                    for (int var179 = 0; var179 < 4; var179++) {
                        if (var179 > 0) {
                            var176 <<= 0x3;
                            var177 <<= 0x3;
                            var178 <<= 0x3;
                        }
                        for (int var180 = 0; var180 <= var179; var180++) {
                            for (int var181 = 0; var181 <= 104; var181++) {
                                for (int var182 = 0; var182 <= 104; var182++) {
                                    if ((Statics.field963[var180][var182][var181] & var176) != 0) {
                                        int var183 = var181;
                                        int var184 = var181;
                                        int var185 = var180;
                                        int var186 = var180;
                                        while (var183 > 0 && (Statics.field963[var180][var182][var183 - 1] & var176) != 0) {
                                            var183--;
                                        }
                                        while (var184 < 104 && (Statics.field963[var180][var182][var184 + 1] & var176) != 0) {
                                            var184++;
                                        }
                                        label716: while (var185 > 0) {
                                            for (int var187 = var183; var187 <= var184; var187++) {
                                                if ((Statics.field963[var185 - 1][var182][var187] & var176) == 0) {
                                                    break label716;
                                                }
                                            }
                                            var185--;
                                        }
                                        label705: while (var186 < var179) {
                                            for (int var188 = var183; var188 <= var184; var188++) {
                                                if ((Statics.field963[var186 + 1][var182][var188] & var176) == 0) {
                                                    break label705;
                                                }
                                            }
                                            var186++;
                                        }
                                        int var189 = (var186 + 1 - var185) * (var184 - var183 + 1);
                                        if (var189 >= 8) {
                                            short var190 = 240;
                                            int var191 = class75.field969[var186][var182][var183] - var190;
                                            int var192 = class75.field969[var185][var182][var183];
                                            class213.method3830(var179, 1, var182 * 128, var182 * 128, var183 * 128, var184 * 128 + 128, var191, var192);
                                            for (int var193 = var185; var193 <= var186; var193++) {
                                                for (int var194 = var183; var194 <= var184; var194++) {
                                                    Statics.field963[var193][var182][var194] &= ~var176;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field963[var180][var182][var181] & var177) != 0) {
                                        int var195 = var182;
                                        int var196 = var182;
                                        int var197 = var180;
                                        int var198 = var180;
                                        while (var195 > 0 && (Statics.field963[var180][var195 - 1][var181] & var177) != 0) {
                                            var195--;
                                        }
                                        while (var196 < 104 && (Statics.field963[var180][var196 + 1][var181] & var177) != 0) {
                                            var196++;
                                        }
                                        label769: while (var197 > 0) {
                                            for (int var199 = var195; var199 <= var196; var199++) {
                                                if ((Statics.field963[var197 - 1][var199][var181] & var177) == 0) {
                                                    break label769;
                                                }
                                            }
                                            var197--;
                                        }
                                        label758: while (var198 < var179) {
                                            for (int var200 = var195; var200 <= var196; var200++) {
                                                if ((Statics.field963[var198 + 1][var200][var181] & var177) == 0) {
                                                    break label758;
                                                }
                                            }
                                            var198++;
                                        }
                                        int var201 = (var198 + 1 - var197) * (var196 - var195 + 1);
                                        if (var201 >= 8) {
                                            short var202 = 240;
                                            int var203 = class75.field969[var198][var195][var181] - var202;
                                            int var204 = class75.field969[var197][var195][var181];
                                            class213.method3830(var179, 2, var195 * 128, var196 * 128 + 128, var181 * 128, var181 * 128, var203, var204);
                                            for (int var205 = var197; var205 <= var198; var205++) {
                                                for (int var206 = var195; var206 <= var196; var206++) {
                                                    Statics.field963[var205][var206][var181] &= ~var177;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field963[var180][var182][var181] & var178) != 0) {
                                        int var207 = var182;
                                        int var208 = var182;
                                        int var209 = var181;
                                        int var210 = var181;
                                        while (var209 > 0 && (Statics.field963[var180][var182][var209 - 1] & var178) != 0) {
                                            var209--;
                                        }
                                        while (var210 < 104 && (Statics.field963[var180][var182][var210 + 1] & var178) != 0) {
                                            var210++;
                                        }
                                        label822: while (var207 > 0) {
                                            for (int var211 = var209; var211 <= var210; var211++) {
                                                if ((Statics.field963[var180][var207 - 1][var211] & var178) == 0) {
                                                    break label822;
                                                }
                                            }
                                            var207--;
                                        }
                                        label811: while (var208 < 104) {
                                            for (int var212 = var209; var212 <= var210; var212++) {
                                                if ((Statics.field963[var180][var208 + 1][var212] & var178) == 0) {
                                                    break label811;
                                                }
                                            }
                                            var208++;
                                        }
                                        if ((var208 - var207 + 1) * (var210 - var209 + 1) >= 4) {
                                            int var213 = class75.field969[var180][var207][var209];
                                            class213.method3830(var179, 4, var207 * 128, var208 * 128 + 128, var209 * 128, var210 * 128 + 128, var213, var213);
                                            for (int var214 = var207; var214 <= var208; var214++) {
                                                for (int var215 = var209; var215 <= var210; var215++) {
                                                    Statics.field963[var180][var214][var215] &= ~var178;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method1816(true);
                    int var216 = class75.field957;
                    if (var216 > Statics.field3731) {
                        var216 = Statics.field3731;
                    }
                    if (var216 < Statics.field3731 - 1) {
                        int var217 = Statics.field3731 - 1;
                    }
                    if (field467) {
                        Statics.field3291.method3828(class75.field957);
                    } else {
                        Statics.field3291.method3828(0);
                    }
                    for (int var218 = 0; var218 < 104; var218++) {
                        for (int var219 = 0; var219 < 104; var219++) {
                            method4167(var218, var219);
                        }
                    }
                    Statics.method178();
                    for (class84 var220 = (class84) field600.method4981(); var220 != null; var220 = (class84) field600.method4987()) {
                        if (var220.field1082 == -1) {
                            var220.field1080 = 0;
                            method172(var220);
                        } else {
                            var220.method5752();
                        }
                    }
                    class169.field1827.method4207();
                    if (Statics.field983.method462()) {
                        class242 var221 = class242.method3564(class240.field2680, field562.field1277);
                        var221.field2792.method6292(1057001181);
                        field562.method2269(var221);
                    }
                    if (!field481) {
                        int var222 = (Statics.field2244 - 6) / 8;
                        int var223 = (Statics.field2244 + 6) / 8;
                        int var224 = (Statics.field2631 - 6) / 8;
                        int var225 = (Statics.field2631 + 6) / 8;
                        for (int var226 = var222 - 1; var226 <= var223 + 1; var226++) {
                            for (int var227 = var224 - 1; var227 <= var225 + 1; var227++) {
                                if (var226 < var222 || var226 > var223 || var227 < var224 || var227 > var225) {
                                    Statics.field50.method4765("m" + var226 + "_" + var227);
                                    Statics.field50.method4765("l" + var226 + "_" + var227);
                                }
                            }
                        }
                    }
                    method3496(30);
                    Statics.method178();
                    class75.method2394();
                    class242 var228 = class242.method3564(class240.field2714, field562.field1277);
                    field562.method2269(var228);
                    Statics.field1598.method2560();
                    for (int var229 = 0; var229 < 32; var229++) {
                        field177[var229] = 0L;
                    }
                    for (int var230 = 0; var230 < 32; var230++) {
                        field178[var230] = 0L;
                    }
                    Statics.field6 = 0;
                } else {
                    field486 = 2;
                }
            } else {
                field486 = 1;
            }
        }
        if (field642 == 30) {
            this.method1098();
        } else if (field642 == 40 || field642 == 45) {
            this.method1097();
        }
    }

    @ObfuscatedName("client.v(ZI)V")
    public final void method456(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class248.field2923 == 2) {
                    if (Statics.field68 == null) {
                        Statics.field68 = class253.method4452(Statics.field1471, Statics.field4377, Statics.field3668);
                        if (Statics.field68 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2927 == null) {
                        Statics.field2927 = new class41(Statics.field4365, Statics.field2922);
                    }
                    if (Statics.field2928.method4265(Statics.field68, Statics.field2924, Statics.field2927, 22050)) {
                        Statics.field2928.method4352();
                        Statics.field2928.method4353(Statics.field2925);
                        Statics.field2928.method4320(Statics.field68, Statics.field975);
                        class248.field2923 = 0;
                        Statics.field68 = null;
                        Statics.field2927 = null;
                        Statics.field1471 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2928.method4269();
                class248.field2923 = 0;
                Statics.field68 = null;
                Statics.field2927 = null;
                Statics.field1471 = null;
            }
            var2 = false;
        }
        if (var2 && field711 && Statics.field1204 != null) {
            Statics.field1204.method704();
        }
        if ((field642 == 10 || field642 == 20 || field642 == 30) && field688 != 0L && class398.method2381() > field688) {
            Statics.method2798(method2524());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field595[var5] = true;
            }
        }
        if (field642 == 0) {
            this.method512(class69.field862, class69.field863, arg0);
        } else if (field642 == 5) {
            class69.method107(Statics.field888, Statics.field3947, Statics.field12);
        } else if (field642 == 10 || field642 == 11) {
            class69.method107(Statics.field888, Statics.field3947, Statics.field12);
        } else if (field642 == 20) {
            class69.method107(Statics.field888, Statics.field3947, Statics.field12);
        } else if (field642 == 25) {
            if (field486 == 1) {
                if (field522 > field523) {
                    field523 = field522;
                }
                int var6 = (field523 * 50 - field522 * 50) / field523;
                method2149(class283.field3438 + class92.field1218 + class92.field1215 + var6 + "%" + class92.field1219, false);
            } else if (field486 == 2) {
                if (field524 > field525) {
                    field525 = field524;
                }
                int var7 = (field525 * 50 - field524 * 50) / field525 + 50;
                method2149(class283.field3438 + class92.field1218 + class92.field1215 + var7 + "%" + class92.field1219, false);
            } else {
                method2149(class283.field3438, false);
            }
        } else if (field642 == 30) {
            this.method1100();
        } else if (field642 == 40) {
            method2149(class283.field3367 + class92.field1218 + class283.field3330, false);
        } else if (field642 == 45) {
            method2149(class283.field3488, false);
        }
        if (field642 == 30 && field687 == 0 && !arg0 && !field689) {
            for (int var8 = 0; var8 < field672; var8++) {
                if (field554[var8]) {
                    Statics.field146.method408(field683[var8], field684[var8], field691[var8], field516[var8]);
                    field554[var8] = false;
                }
            }
        } else if (field642 > 0) {
            Statics.field146.method409(0, 0);
            for (int var9 = 0; var9 < field672; var9++) {
                field554[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ag(S)V")
    public final void method457() {
        if (Statics.field451.method2204()) {
            Statics.field451.method2239();
        }
        if (Statics.field801 != null) {
            Statics.field801.field1034 = false;
        }
        Statics.field801 = null;
        field562.method2271();
        if (class24.field122 != null) {
            class24 var1 = class24.field122;
            synchronized (class24.field122) {
                class24.field122 = null;
            }
        }
        class33.method2131();
        Statics.field225 = null;
        if (Statics.field1204 != null) {
            Statics.field1204.method705();
        }
        if (Statics.field1029 != null) {
            Statics.field1029.method705();
        }
        Statics.method1888();
        Object var3 = class287.field3664;
        synchronized (class287.field3664) {
            if (class287.field3663 != 0) {
                class287.field3663 = 1;
                try {
                    class287.field3664.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field3866 != null) {
            Statics.field3866.method2291();
            Statics.field3866 = null;
        }
        try {
            class144.field1554.method6079();
            for (int var6 = 0; var6 < Statics.field997; var6++) {
                Statics.field2184[var6].method6079();
            }
            class144.field1555.method6079();
            class144.field1553.method6079();
        } catch (Exception var10) {
        }
        this.field492.method173();
    }

    @ObfuscatedName("gi.fd(II)V")
    public static void method3496(int arg0) {
        if (field642 == arg0) {
            return;
        }
        if (field642 == 0) {
            Statics.field983.method500();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            method2368(0);
            field497 = 0;
            field686 = 0;
            field520.method5382(arg0);
            if (arg0 != 20) {
                method3264(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field916 != null) {
            Statics.field916.method2613();
            Statics.field916 = null;
        }
        if (field642 == 25) {
            field486 = 0;
            field522 = 0;
            field523 = 1;
            field524 = 0;
            field525 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field4363.field1183 >= field468;
            int var3 = var2 ? 0 : 12;
            class69.method2390(Statics.field953, Statics.field458, true, var3);
        } else if (arg0 == 20) {
            int var1 = field642 == 11 ? 4 : 0;
            class69.method2390(Statics.field953, Statics.field458, true, var1);
        } else if (arg0 == 11) {
            class69.method2390(Statics.field953, Statics.field458, false, 4);
        } else {
            class69.method4698();
        }
        field642 = arg0;
    }

    @ObfuscatedName("client.fa(S)V")
    public void method1094() {
        if (field642 == 1000) {
            return;
        }
        long var1 = class398.method2381();
        int var3 = (int) (var1 - Statics.field4437);
        Statics.field4437 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class291.field3706 += var3;
        boolean var4;
        if (class291.field3715 == 0 && class291.field3710 == 0 && class291.field3713 == 0 && class291.field3717 == 0) {
            var4 = true;
        } else if (Statics.field3716 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class291.field3706 > 30000) {
                        throw new IOException();
                    }
                    while (class291.field3710 < 200 && class291.field3717 > 0) {
                        class289 var5 = (class289) class291.field3707.method6028();
                        class401 var6 = new class401(4);
                        var6.method6223(1);
                        var6.method6225((int) var5.field4075);
                        Statics.field3716.method2642(var6.field4302, 0, 4);
                        class291.field3709.method6027(var5, var5.field4075);
                        class291.field3717--;
                        class291.field3710++;
                    }
                    while (class291.field3715 < 200 && class291.field3713 > 0) {
                        class289 var7 = (class289) class291.field3714.method4965();
                        class401 var8 = new class401(4);
                        var8.method6223(0);
                        var8.method6225((int) var7.field4075);
                        Statics.field3716.method2642(var8.field4302, 0, 4);
                        var7.method5748();
                        class291.field3711.method6027(var7, var7.field4075);
                        class291.field3713--;
                        class291.field3715++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3716.method2615();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class291.field3706 = 0;
                        byte var11 = 0;
                        if (Statics.field1491 == null) {
                            var11 = 8;
                        } else if (class291.field3708 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class291.field3705.field4300;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3716.method2617(class291.field3705.field4302, class291.field3705.field4300, var12);
                            if (class291.field3720 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class291.field3705.field4302[class291.field3705.field4300 + var13] ^= class291.field3720;
                                }
                            }
                            class291.field3705.field4300 += var12;
                            if (class291.field3705.field4300 < var11) {
                                break;
                            }
                            if (Statics.field1491 == null) {
                                class291.field3705.field4300 = 0;
                                int var14 = class291.field3705.method6240();
                                int var15 = class291.field3705.method6242();
                                int var16 = class291.field3705.method6240();
                                int var17 = class291.field3705.method6245();
                                long var18 = (long) ((var14 << 16) + var15);
                                class289 var20 = (class289) class291.field3709.method6034(var18);
                                Statics.field1402 = true;
                                if (var20 == null) {
                                    var20 = (class289) class291.field3711.method6034(var18);
                                    Statics.field1402 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1491 = var20;
                                Statics.field1524 = new class401(var17 + var21 + Statics.field1491.field3684);
                                Statics.field1524.method6223(var16);
                                Statics.field1524.method6292(var17);
                                class291.field3708 = 8;
                                class291.field3705.field4300 = 0;
                            } else if (class291.field3708 == 0) {
                                if (class291.field3705.field4302[0] == -1) {
                                    class291.field3708 = 1;
                                    class291.field3705.field4300 = 0;
                                } else {
                                    Statics.field1491 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1524.field4302.length - Statics.field1491.field3684;
                            int var23 = 512 - class291.field3708;
                            if (var23 > var22 - Statics.field1524.field4300) {
                                var23 = var22 - Statics.field1524.field4300;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3716.method2617(Statics.field1524.field4302, Statics.field1524.field4300, var23);
                            if (class291.field3720 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1524.field4302[Statics.field1524.field4300 + var24] ^= class291.field3720;
                                }
                            }
                            Statics.field1524.field4300 += var23;
                            class291.field3708 += var23;
                            if (Statics.field1524.field4300 == var22) {
                                if (Statics.field1491.field4075 == 16711935L) {
                                    Statics.field1530 = Statics.field1524;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class288 var26 = class291.field3719[var25];
                                        if (var26 != null) {
                                            Statics.field1530.field4300 = var25 * 8 + 5;
                                            int var27 = Statics.field1530.method6245();
                                            int var28 = Statics.field1530.method6245();
                                            var26.method4704(var27, var28);
                                        }
                                    }
                                } else {
                                    class291.field3718.reset();
                                    class291.field3718.update(Statics.field1524.field4302, 0, var22);
                                    int var29 = (int) class291.field3718.getValue();
                                    if (Statics.field1491.field3682 != var29) {
                                        try {
                                            Statics.field3716.method2613();
                                        } catch (Exception var35) {
                                        }
                                        class291.field3721++;
                                        Statics.field3716 = null;
                                        class291.field3720 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class291.field3721 = 0;
                                    class291.field3722 = 0;
                                    Statics.field1491.field3686.method4703((int) (Statics.field1491.field4075 & 0xFFFFL), Statics.field1524.field4302, (Statics.field1491.field4075 & 0xFF0000L) == 16711680L, Statics.field1402);
                                }
                                Statics.field1491.method5752();
                                if (Statics.field1402) {
                                    class291.field3710--;
                                } else {
                                    class291.field3715--;
                                }
                                class291.field3708 = 0;
                                Statics.field1491 = null;
                                Statics.field1524 = null;
                            } else {
                                if (class291.field3708 != 512) {
                                    break;
                                }
                                class291.field3708 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3716.method2613();
                } catch (Exception var34) {
                }
                class291.field3722++;
                Statics.field3716 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1095();
        }
    }

    @ObfuscatedName("client.fi(I)V")
    public void method1095() {
        if (class291.field3721 >= 4) {
            this.method459("js5crc");
            method3496(1000);
            return;
        }
        if (class291.field3722 >= 4) {
            if (field642 <= 5) {
                this.method459("js5io");
                method3496(1000);
                return;
            }
            field573 = 3000;
            class291.field3722 = 3;
        }
        if (--field573 + 1 > 0) {
            return;
        }
        try {
            if (field493 == 0) {
                Statics.field1364 = Statics.field182.method2569(Statics.field2114, Statics.field1028);
                field493++;
            }
            if (field493 == 1) {
                if (Statics.field1364.field1596 == 2) {
                    this.method1096(-1);
                    return;
                }
                if (Statics.field1364.field1596 == 1) {
                    field493++;
                }
            }
            if (field493 == 2) {
                if (field518) {
                    Statics.field2246 = class344.method2513((Socket) Statics.field1364.field1597, 40000, 5000);
                } else {
                    Statics.field2246 = new class147((Socket) Statics.field1364.field1597, Statics.field182, 5000);
                }
                class401 var1 = new class401(5);
                var1.method6223(15);
                var1.method6292(201);
                Statics.field2246.method2642(var1.field4302, 0, 5);
                field493++;
                Statics.field890 = class398.method2381();
            }
            if (field493 == 3) {
                if (Statics.field2246.method2615() > 0 || !field518 && field642 <= 5) {
                    int var2 = Statics.field2246.method2612();
                    if (var2 != 0) {
                        this.method1096(var2);
                        return;
                    }
                    field493++;
                } else if (class398.method2381() - Statics.field890 > 30000L) {
                    this.method1096(-2);
                    return;
                }
            }
            if (field493 == 4) {
                class291.method4169(Statics.field2246, field642 > 20);
                Statics.field1364 = null;
                Statics.field2246 = null;
                field493 = 0;
                field747 = 0;
            }
        } catch (IOException var4) {
            this.method1096(-3);
        }
    }

    @ObfuscatedName("client.fj(IB)V")
    public void method1096(int arg0) {
        Statics.field1364 = null;
        Statics.field2246 = null;
        field493 = 0;
        if (Statics.field456 == Statics.field1028) {
            Statics.field1028 = Statics.field1792;
        } else {
            Statics.field1028 = Statics.field456;
        }
        field747++;
        if (field747 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field642 <= 5) {
                this.method459("js5connect_full");
                method3496(1000);
            } else {
                field573 = 3000;
            }
        } else if (field747 >= 2 && arg0 == 6) {
            this.method459("js5connect_outofdate");
            method3496(1000);
        } else if (field747 >= 4) {
            if (field642 <= 5) {
                this.method459("js5connect");
                method3496(1000);
            } else {
                field573 = 3000;
            }
        }
    }

    @ObfuscatedName("cy.fw(Lkd;Ljava/lang/String;B)V")
    public static void method2325(class288 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field670.add(var2);
        field746 += var2.field982;
    }

    @ObfuscatedName("client.fg(I)Z")
    public static boolean method1547() {
        if (field670 == null || field745 >= field670.size()) {
            return true;
        }
        while (field745 < field670.size()) {
            class77 var0 = (class77) field670.get(field745);
            if (!var0.method1948()) {
                return false;
            }
            field745++;
        }
        return true;
    }

    @ObfuscatedName("cl.fh(I)I")
    public static int method2108() {
        if (field670 == null || field745 >= field670.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field745; var1++) {
            var0 += ((class77) field670.get(var1)).field984;
        }
        return var0 * 10000 / field746;
    }

    @ObfuscatedName("eb.fp(I)V")
    public static void method2636() {
        if (field472 == 0) {
            Statics.field3291 = new class213(4, 104, 104, class75.field969);
            for (int var0 = 0; var0 < 4; var0++) {
                field594[var0] = new class173(104, 104);
            }
            Statics.field40 = new class414(512, 512);
            class69.field863 = class283.field3331;
            class69.field862 = 5;
            field472 = 20;
        } else if (field472 == 20) {
            class69.field863 = class283.field3496;
            class69.field862 = 10;
            field472 = 30;
        } else if (field472 == 30) {
            Statics.field1610 = method2312(0, false, true, true);
            Statics.field454 = method2312(1, false, true, true);
            Statics.field5 = method2312(2, true, false, true);
            Statics.field1786 = method2312(3, false, true, true);
            Statics.field58 = method2312(4, false, true, true);
            Statics.field50 = method2312(5, true, true, true);
            Statics.field1270 = method2312(6, true, true, true);
            Statics.field1694 = method2312(7, false, true, true);
            Statics.field458 = method2312(8, false, true, true);
            Statics.field923 = method2312(9, false, true, true);
            Statics.field953 = method2312(10, false, true, true);
            Statics.field2209 = method2312(11, false, true, true);
            Statics.field70 = method2312(12, false, true, true);
            Statics.field1174 = method2312(13, true, false, true);
            Statics.field978 = method2312(14, false, true, true);
            Statics.field3681 = method2312(15, false, true, true);
            Statics.field449 = method2312(17, true, true, true);
            Statics.field1266 = method2312(18, false, true, true);
            Statics.field1342 = method2312(19, false, true, true);
            Statics.field459 = method2312(20, false, true, true);
            class69.field863 = class283.field3333;
            class69.field862 = 20;
            field472 = 40;
        } else if (field472 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1610.method4731() * 4 / 100;
            int var3 = var2 + Statics.field454.method4731() * 4 / 100;
            int var4 = var3 + Statics.field5.method4731() * 2 / 100;
            int var5 = var4 + Statics.field1786.method4731() * 2 / 100;
            int var6 = var5 + Statics.field58.method4731() * 6 / 100;
            int var7 = var6 + Statics.field50.method4731() * 4 / 100;
            int var8 = var7 + Statics.field1270.method4731() * 2 / 100;
            int var9 = var8 + Statics.field1694.method4731() * 56 / 100;
            int var10 = var9 + Statics.field458.method4731() * 2 / 100;
            int var11 = var10 + Statics.field923.method4731() * 2 / 100;
            int var12 = var11 + Statics.field953.method4731() * 2 / 100;
            int var13 = var12 + Statics.field2209.method4731() * 2 / 100;
            int var14 = var13 + Statics.field70.method4731() * 2 / 100;
            int var15 = var14 + Statics.field1174.method4731() * 2 / 100;
            int var16 = var15 + Statics.field978.method4731() * 2 / 100;
            int var17 = var16 + Statics.field3681.method4731() * 2 / 100;
            int var18 = var17 + Statics.field1342.method4731() / 100;
            int var19 = var18 + Statics.field1266.method4731() / 100;
            int var20 = var19 + Statics.field459.method4731() / 100;
            int var21 = var20 + (Statics.field449.method4700() && Statics.field449.method4741() ? 1 : 0);
            if (var21 == 100) {
                method2325(Statics.field1610, "Animations");
                method2325(Statics.field454, "Skeletons");
                method2325(Statics.field58, "Sound FX");
                method2325(Statics.field50, "Maps");
                method2325(Statics.field1270, "Music Tracks");
                method2325(Statics.field1694, "Models");
                method2325(Statics.field458, "Sprites");
                method2325(Statics.field2209, "Music Jingles");
                method2325(Statics.field978, "Music Samples");
                method2325(Statics.field3681, "Music Patches");
                method2325(Statics.field1342, "World Map");
                method2325(Statics.field1266, "World Map Geography");
                method2325(Statics.field459, "World Map Ground");
                Statics.field1343 = new class350();
                Statics.field1343.method5658(Statics.field449);
                class69.field863 = class283.field3335;
                class69.field862 = 30;
                field472 = 45;
            } else {
                if (var21 != 0) {
                    class69.field863 = class283.field3334 + var21 + "%";
                }
                class69.field862 = 30;
            }
        } else if (field472 == 45) {
            boolean var22 = !field467;
            Statics.field4360 = 22050;
            Statics.field263 = var22;
            Statics.field273 = 2;
            class249 var23 = new class249();
            var23.method4271(9, 128);
            Statics.field1204 = class38.method2383(Statics.field182, 0, 22050);
            Statics.field1204.method717(var23);
            class288 var24 = Statics.field3681;
            class288 var25 = Statics.field978;
            class288 var26 = Statics.field58;
            Statics.field2924 = var24;
            Statics.field2922 = var25;
            Statics.field4365 = var26;
            Statics.field2928 = var23;
            Statics.field1029 = class38.method2383(Statics.field182, 1, 2048);
            Statics.field1331 = new class34();
            Statics.field1029.method717(Statics.field1331);
            Statics.field4201 = new class51(22050, Statics.field4360);
            class69.field863 = class283.field3600;
            class69.field862 = 35;
            field472 = 50;
            Statics.field836 = new class376(Statics.field458, Statics.field1174);
        } else if (field472 == 50) {
            class377[] var27 = new class377[] { class377.field4196, class377.field4199, class377.field4203, class377.field4195, class377.field4193, class377.field4197 };
            int var28 = var27.length;
            class376 var29 = Statics.field836;
            class377[] var30 = new class377[] { class377.field4196, class377.field4199, class377.field4203, class377.field4195, class377.field4193, class377.field4197 };
            field515 = var29.method5995(var30);
            if (field515.size() < var28) {
                class69.field863 = class283.field3378 + field515.size() * 100 / var28 + "%";
                class69.field862 = 40;
            } else {
                Statics.field3947 = (class315) field515.get(class377.field4193);
                Statics.field12 = (class315) field515.get(class377.field4203);
                Statics.field888 = (class315) field515.get(class377.field4195);
                Statics.field417 = field740.method5759();
                class69.field863 = class283.field3575;
                class69.field862 = 40;
                field472 = 60;
            }
        } else if (field472 == 60) {
            class288 var31 = Statics.field953;
            class288 var32 = Statics.field458;
            int var33 = 0;
            String[] var34 = class69.field886;
            for (int var35 = 0; var35 < var34.length; var35++) {
                String var36 = var34[var35];
                if (var31.method4763(var36, "")) {
                    var33++;
                }
            }
            String[] var37 = class69.field872;
            for (int var38 = 0; var38 < var37.length; var38++) {
                String var39 = var37[var38];
                if (var32.method4763(var39, "")) {
                    var33++;
                }
            }
            int var42 = class69.method1040();
            if (var33 < var42) {
                class69.field863 = class283.field3379 + var33 * 100 / var42 + "%";
                class69.field862 = 50;
            } else {
                class69.field863 = class283.field3340;
                class69.field862 = 50;
                method3496(5);
                field472 = 70;
            }
        } else if (field472 == 70) {
            if (Statics.field5.method4741()) {
                class288 var43 = Statics.field5;
                Statics.field1942 = var43;
                class288 var44 = Statics.field5;
                Statics.field1771 = var44;
                class288 var45 = Statics.field5;
                class288 var46 = Statics.field1694;
                Statics.field1655 = var45;
                Statics.field1649 = var46;
                Statics.field845 = Statics.field1655.method4768(3);
                class288 var47 = Statics.field5;
                class288 var48 = Statics.field1694;
                boolean var49 = field467;
                Statics.field1839 = var47;
                Statics.field1853 = var48;
                class169.field1837 = var49;
                class288 var50 = Statics.field5;
                class288 var51 = Statics.field1694;
                Statics.field1701 = var50;
                Statics.field1702 = var51;
                class167.method397(Statics.field5);
                class288 var52 = Statics.field5;
                class288 var53 = Statics.field1694;
                boolean var54 = field623;
                class315 var55 = Statics.field3947;
                Statics.field3214 = var52;
                Statics.field1660 = var53;
                Statics.field1332 = var54;
                Statics.field1479 = Statics.field3214.method4768(10);
                Statics.field290 = var55;
                class288 var56 = Statics.field5;
                class288 var57 = Statics.field1610;
                class288 var58 = Statics.field454;
                Statics.field1967 = var56;
                Statics.field1952 = var57;
                Statics.field1950 = var58;
                class288 var59 = Statics.field5;
                class288 var60 = Statics.field1694;
                Statics.field1752 = var59;
                Statics.field4264 = var60;
                class165.method2067(Statics.field5);
                class153.method2192(Statics.field5);
                class262.method2500(Statics.field1786, Statics.field1694, Statics.field458, Statics.field1174);
                class288 var61 = Statics.field5;
                Statics.field1611 = var61;
                class159.method2328(Statics.field5);
                Statics.method1987(Statics.field5);
                class166.method392(Statics.field5);
                Statics.field1565 = new class388(Statics.field1987, 54, Statics.field207, Statics.field5);
                Statics.field2777 = new class388(Statics.field1987, 47, Statics.field207, Statics.field5);
                Statics.field451 = new class97();
                class168.method287(Statics.field5, Statics.field458, Statics.field1174);
                class288 var62 = Statics.field5;
                class288 var63 = Statics.field458;
                Statics.field1671 = var62;
                Statics.field1659 = var63;
                class288 var64 = Statics.field5;
                class288 var65 = Statics.field458;
                Statics.field1638 = var65;
                if (var64.method4741()) {
                    Statics.field1621 = var64.method4768(35);
                    Statics.field1619 = new class154[Statics.field1621];
                    for (int var66 = 0; var66 < Statics.field1621; var66++) {
                        byte[] var67 = var64.method4743(35, var66);
                        Statics.field1619[var66] = new class154(var66);
                        if (var67 != null) {
                            Statics.field1619[var66].method2695(new class401(var67));
                            Statics.field1619[var66].method2698();
                        }
                    }
                }
                class69.field863 = class283.field3342;
                class69.field862 = 60;
                field472 = 80;
            } else {
                class69.field863 = class283.field3341 + Statics.field5.method4711() + "%";
                class69.field862 = 60;
            }
        } else if (field472 == 80) {
            int var68 = 0;
            if (Statics.field1363 == null) {
                Statics.field1363 = class415.method3531(Statics.field458, Statics.field1343.field4018, 0);
            } else {
                var68++;
            }
            if (Statics.field2616 == null) {
                Statics.field2616 = class415.method3531(Statics.field458, Statics.field1343.field4009, 0);
            } else {
                var68++;
            }
            if (Statics.field3972 == null) {
                Statics.field3972 = class415.method2343(Statics.field458, Statics.field1343.field4010, 0);
            } else {
                var68++;
            }
            if (Statics.field533 == null) {
                Statics.field533 = class415.method304(Statics.field458, Statics.field1343.field4016, 0);
            } else {
                var68++;
            }
            if (Statics.field2892 == null) {
                Statics.field2892 = class415.method304(Statics.field458, Statics.field1343.field4012, 0);
            } else {
                var68++;
            }
            if (Statics.field142 == null) {
                Statics.field142 = class415.method304(Statics.field458, Statics.field1343.field4013, 0);
            } else {
                var68++;
            }
            if (Statics.field2107 == null) {
                Statics.field2107 = class415.method304(Statics.field458, Statics.field1343.field4014, 0);
            } else {
                var68++;
            }
            if (Statics.field1328 == null) {
                Statics.field1328 = class415.method304(Statics.field458, Statics.field1343.field4015, 0);
            } else {
                var68++;
            }
            if (Statics.field1366 == null) {
                Statics.field1366 = class415.method304(Statics.field458, Statics.field1343.field4011, 0);
            } else {
                var68++;
            }
            if (Statics.field170 == null) {
                Statics.field170 = class415.method2343(Statics.field458, Statics.field1343.field4019, 0);
            } else {
                var68++;
            }
            if (Statics.field17 == null) {
                Statics.field17 = class415.method2343(Statics.field458, Statics.field1343.field4017, 0);
            } else {
                var68++;
            }
            if (var68 < 11) {
                class69.field863 = class283.field3343 + var68 * 100 / 12 + "%";
                class69.field862 = 70;
            } else {
                Statics.field3834 = Statics.field17;
                Statics.field2616.method6637();
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3972[0].method6626(var69 + var72, var70 + var72, var71 + var72);
                class69.field863 = class283.field3346;
                class69.field862 = 70;
                field472 = 90;
            }
        } else if (field472 == 90) {
            if (Statics.field923.method4741()) {
                Statics.field1259 = new class218(Statics.field923, Statics.field458, 20, Statics.field4363.field1190, field467 ? 64 : 128);
                class211.method3754(Statics.field1259);
                class211.method3775(Statics.field4363.field1190);
                field472 = 100;
            } else {
                class69.field863 = class283.field3345 + "0%";
                class69.field862 = 90;
            }
        } else if (field472 == 100) {
            int var73 = Statics.field1259.method4031();
            if (var73 < 100) {
                class69.field863 = class283.field3345 + var73 + "%";
                class69.field862 = 90;
            } else {
                class69.field863 = class283.field3547;
                class69.field862 = 90;
                field472 = 110;
            }
        } else if (field472 == 110) {
            Statics.field801 = new class82();
            Statics.field182.method2570(Statics.field801, 10);
            class69.field863 = class283.field3347;
            class69.field862 = 92;
            field472 = 120;
        } else if (field472 == 120) {
            if (Statics.field953.method4763("huffman", "")) {
                class264 var74 = new class264(Statics.field953.method4762("huffman", ""));
                class265.method3656(var74);
                class69.field863 = class283.field3414;
                class69.field862 = 94;
                field472 = 130;
            } else {
                class69.field863 = class283.field3348 + "%";
                class69.field862 = 94;
            }
        } else if (field472 == 130) {
            if (!Statics.field1786.method4741()) {
                class69.field863 = class283.field3350 + Statics.field1786.method4711() * 4 / 5 + "%";
                class69.field862 = 96;
            } else if (!Statics.field70.method4741()) {
                class69.field863 = class283.field3350 + (80 + Statics.field70.method4711() / 6) + "%";
                class69.field862 = 96;
            } else if (Statics.field1174.method4741()) {
                class69.field863 = class283.field3584;
                class69.field862 = 98;
                field472 = 140;
            } else {
                class69.field863 = class283.field3350 + (96 + Statics.field1174.method4711() / 50) + "%";
                class69.field862 = 96;
            }
        } else if (field472 == 140) {
            class69.field862 = 100;
            if (Statics.field1342.method4753(class200.field2211.field2213)) {
                if (Statics.field1494 == null) {
                    Statics.field1494 = new class375();
                    Statics.field1494.method5795(Statics.field1342, Statics.field1266, Statics.field459, Statics.field888, field515, Statics.field3972);
                }
                class69.field863 = class283.field3571;
                field472 = 150;
            } else {
                class69.field863 = class283.field3352 + Statics.field1342.method4827(class200.field2211.field2213) / 10 + "%";
            }
        } else if (field472 == 150) {
            method3496(10);
        }
    }

    @ObfuscatedName("cm.fy(IZZZB)Lkd;")
    public static class288 method2312(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class348 var4 = null;
        if (class144.field1554 != null) {
            var4 = new class348(arg0, class144.field1554, Statics.field2184[arg0], 1000000);
        }
        return new class288(var4, Statics.field2053, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fn(I)V")
    public final void method1097() {
        class344 var1 = field562.method2273();
        class400 var2 = field562.field1280;
        try {
            if (field496 == 0) {
                if (Statics.field1302 == null && (field506.method1871() || field497 > 250)) {
                    Statics.field1302 = field506.method1865();
                    field506.method1866();
                    field506 = null;
                }
                if (Statics.field1302 != null) {
                    if (var1 != null) {
                        var1.method2613();
                        var1 = null;
                    }
                    Statics.field271 = null;
                    field517 = false;
                    field497 = 0;
                    if (field501.method6494()) {
                        try {
                            this.method1362(Statics.field1561);
                            method2368(20);
                        } catch (Throwable var65) {
                            class425.method2652((String) null, var65);
                            method1870(65);
                            return;
                        }
                    } else {
                        method2368(1);
                    }
                }
            }
            if (field496 == 20) {
                if (!this.field538.method272()) {
                    return;
                }
                if (this.field538.method268()) {
                    class425.method2652(this.field538.method285(), (Throwable) null);
                    method1870(65);
                    return;
                }
                class22 var4 = this.field538.method273();
                if (var4.method302() != 200) {
                    class425.method2652("Response code: " + var4.method302() + "Response body: " + var4.method295(), (Throwable) null);
                    method1870(65);
                    return;
                }
                field497 = 0;
                this.field502 = var4.method295();
                method2368(1);
            }
            if (field496 == 1) {
                if (Statics.field271 == null) {
                    Statics.field271 = Statics.field182.method2569(Statics.field2114, Statics.field1028);
                }
                if (Statics.field271.field1596 == 2) {
                    throw new IOException();
                }
                if (Statics.field271.field1596 == 1) {
                    if (field518) {
                        var1 = class344.method2513((Socket) Statics.field271.field1597, 40000, 5000);
                    } else {
                        var1 = new class147((Socket) Statics.field271.field1597, Statics.field182, 5000);
                    }
                    field562.method2270(var1);
                    Statics.field271 = null;
                    method2368(2);
                }
            }
            if (field496 == 2) {
                field562.method2267();
                class242 var5 = class242.method2170();
                var5.field2786 = null;
                var5.field2785 = 0;
                var5.field2792 = new class400(5000);
                var5.field2792.method6223(class244.field2902.field2896);
                field562.method2269(var5);
                field562.method2278();
                var2.field4300 = 0;
                method2368(3);
            }
            if (field496 == 3) {
                if (Statics.field1204 != null) {
                    Statics.field1204.method726();
                }
                if (Statics.field1029 != null) {
                    Statics.field1029.method726();
                }
                boolean var8 = true;
                if (field518 && !var1.method2616(1)) {
                    var8 = false;
                }
                if (var8) {
                    int var9 = var1.method2612();
                    if (Statics.field1204 != null) {
                        Statics.field1204.method726();
                    }
                    if (Statics.field1029 != null) {
                        Statics.field1029.method726();
                    }
                    if (var9 != 0) {
                        method1870(var9);
                        return;
                    }
                    var2.field4300 = 0;
                    method2368(4);
                }
            }
            if (field496 == 4) {
                if (var2.field4300 < 8) {
                    int var10 = var1.method2615();
                    if (var10 > 8 - var2.field4300) {
                        var10 = 8 - var2.field4300;
                    }
                    if (var10 > 0) {
                        var1.method2617(var2.field4302, var2.field4300, var10);
                        var2.field4300 += var10;
                    }
                }
                if (var2.field4300 == 8) {
                    var2.field4300 = 0;
                    Statics.field2245 = var2.method6249();
                    method2368(5);
                }
            }
            if (field496 == 5) {
                field562.field1280.field4300 = 0;
                field562.method2267();
                class400 var11 = new class400(500);
                int[] var12 = new int[] { Statics.field1302.nextInt(), Statics.field1302.nextInt(), Statics.field1302.nextInt(), Statics.field1302.nextInt() };
                var11.field4300 = 0;
                var11.method6223(1);
                var11.method6292(var12[0]);
                var11.method6292(var12[1]);
                var11.method6292(var12[2]);
                var11.method6292(var12[3]);
                var11.method6401(Statics.field2245);
                if (field642 == 40) {
                    var11.method6292(Statics.field2894[0]);
                    var11.method6292(Statics.field2894[1]);
                    var11.method6292(Statics.field2894[2]);
                    var11.method6292(Statics.field2894[3]);
                } else {
                    var11.method6223(field694.method38());
                    switch(field694.field1345) {
                        case 0:
                        case 3:
                            var11.method6225(Statics.field430);
                            var11.field4300++;
                            break;
                        case 1:
                            var11.method6292((Integer) Statics.field4363.field1195.get(class319.method2553(class69.field854)));
                            break;
                        case 2:
                            var11.field4300 += 4;
                    }
                    if (field501.method6494()) {
                        var11.method6223(class405.field4353.method38());
                        var11.method6230(this.field502);
                    } else {
                        var11.method6223(class405.field4352.method38());
                        var11.method6230(class69.field873);
                    }
                }
                var11.method6263(class68.field841, class68.field844);
                Statics.field2894 = var12;
                class242 var13 = class242.method2170();
                var13.field2786 = null;
                var13.field2785 = 0;
                var13.field2792 = new class400(5000);
                var13.field2792.field4300 = 0;
                if (field642 == 40) {
                    var13.field2792.method6223(class244.field2895.field2896);
                } else {
                    var13.field2792.method6223(class244.field2897.field2896);
                }
                var13.field2792.method6224(0);
                int var16 = var13.field2792.field4300;
                var13.field2792.method6292(201);
                var13.field2792.method6292(1);
                var13.field2792.method6223(field588);
                var13.field2792.method6223(field470);
                var13.field2792.method6233(var11.field4302, 0, var11.field4300);
                int var17 = var13.field2792.field4300;
                var13.field2792.method6230(class69.field854);
                var13.field2792.method6223((field689 ? 1 : 0) << 1 | (field467 ? 1 : 0));
                var13.field2792.method6224(Statics.field184);
                var13.field2792.method6224(Statics.field137);
                class400 var18 = var13.field2792;
                if (field509 == null) {
                    byte[] var19 = class144.method1675();
                    var18.method6233(var19, 0, var19.length);
                } else {
                    var18.method6233(field509, 0, field509.length);
                }
                var13.field2792.method6230(Statics.field1317);
                var13.field2792.method6292(Statics.field2484);
                class401 var20 = new class401(Statics.field417.method5774());
                Statics.field417.method5773(var20);
                var13.field2792.method6233(var20.field4302, 0, var20.field4302.length);
                var13.field2792.method6223(field588);
                var13.field2792.method6292(0);
                var13.field2792.method6284(Statics.field1270.field3689);
                var13.field2792.method6292(Statics.field3681.field3689);
                var13.field2792.method6285(Statics.field978.field3689);
                var13.field2792.method6400(Statics.field1694.field3689);
                var13.field2792.method6284(Statics.field459.field3689);
                var13.field2792.method6285(Statics.field449.field3689);
                var13.field2792.method6285(Statics.field458.field3689);
                var13.field2792.method6284(Statics.field1266.field3689);
                var13.field2792.method6400(Statics.field5.field3689);
                var13.field2792.method6284(0);
                var13.field2792.method6284(Statics.field70.field3689);
                var13.field2792.method6284(Statics.field923.field3689);
                var13.field2792.method6292(Statics.field454.field3689);
                var13.field2792.method6292(Statics.field1610.field3689);
                var13.field2792.method6284(Statics.field953.field3689);
                var13.field2792.method6292(Statics.field50.field3689);
                var13.field2792.method6285(Statics.field1342.field3689);
                var13.field2792.method6285(Statics.field58.field3689);
                var13.field2792.method6285(Statics.field1786.field3689);
                var13.field2792.method6292(Statics.field1174.field3689);
                var13.field2792.method6292(Statics.field2209.field3689);
                var13.field2792.method6353(var12, var17, var13.field2792.field4300);
                var13.field2792.method6266(var13.field2792.field4300 - var16);
                field562.method2269(var13);
                field562.method2278();
                field562.field1277 = new class417(var12);
                int[] var21 = new int[4];
                for (int var22 = 0; var22 < 4; var22++) {
                    var21[var22] = var12[var22] + 50;
                }
                var2.method6182(var21);
                method2368(6);
            }
            if (field496 == 6 && var1.method2615() > 0) {
                int var23 = var1.method2612();
                if (var23 == 21 && field642 == 20) {
                    method2368(12);
                } else if (var23 == 2) {
                    method2368(14);
                } else if (var23 == 15 && field642 == 40) {
                    field562.field1282 = -1;
                    method2368(19);
                } else if (var23 == 64) {
                    method2368(10);
                } else if (var23 == 23 && field686 < 1) {
                    field686++;
                    method2368(0);
                } else if (var23 == 29) {
                    method2368(17);
                } else if (var23 == 69) {
                    method2368(7);
                } else {
                    method1870(var23);
                    return;
                }
            }
            if (field496 == 7 && var1.method2615() >= 2) {
                var1.method2617(var2.field4302, 0, 2);
                var2.field4300 = 0;
                Statics.field3869 = var2.method6242();
                method2368(8);
            }
            if (field496 == 8 && var1.method2615() >= Statics.field3869) {
                var2.field4300 = 0;
                var1.method2617(var2.field4302, var2.field4300, Statics.field3869);
                class7 var24 = class7.method2527()[var2.method6240()];
                try {
                    switch(var24.field13) {
                        case 0:
                            class1 var25 = new class1();
                            this.field508 = new class8(var2, var25);
                            method2368(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var64) {
                    method1870(22);
                    return;
                }
            }
            if (field496 == 9 && this.field508.method42()) {
                this.field580 = this.field508.method44();
                this.field508.method43();
                this.field508 = null;
                if (this.field580 == null) {
                    method1870(22);
                    return;
                }
                field562.method2267();
                class242 var28 = class242.method2170();
                var28.field2786 = null;
                var28.field2785 = 0;
                var28.field2792 = new class400(5000);
                var28.field2792.method6223(class244.field2901.field2896);
                var28.field2792.method6224(this.field580.field4300);
                var28.field2792.method6234(this.field580);
                field562.method2269(var28);
                field562.method2278();
                this.field580 = null;
                method2368(6);
            }
            if (field496 == 10 && var1.method2615() > 0) {
                Statics.field1776 = var1.method2612();
                method2368(11);
            }
            if (field496 == 11 && var1.method2615() >= Statics.field1776) {
                var1.method2617(var2.field4302, 0, Statics.field1776);
                var2.field4300 = 0;
                method2368(6);
            }
            if (field496 == 12 && var1.method2615() > 0) {
                field499 = (var1.method2612() + 3) * 60;
                method2368(13);
            }
            if (field496 == 13) {
                field497 = 0;
                class69.method17(class283.field3359, class283.field3360, field499 / 60 + class283.field3588);
                if (--field499 <= 0) {
                    method2368(0);
                }
            } else {
                if (field496 == 14 && var1.method2615() >= 1) {
                    Statics.field2486 = var1.method2612();
                    method2368(15);
                }
                if (field496 == 15 && var1.method2615() >= Statics.field2486) {
                    boolean var31 = var1.method2612() == 1;
                    var1.method2617(var2.field4302, 0, 4);
                    var2.field4300 = 0;
                    boolean var32 = false;
                    if (var31) {
                        int var33 = var2.method6185() << 24;
                        int var34 = var33 | var2.method6185() << 16;
                        int var35 = var34 | var2.method6185() << 8;
                        int var36 = var35 | var2.method6185();
                        int var37 = class319.method2553(class69.field854);
                        if (Statics.field4363.field1195.size() >= 10 && !Statics.field4363.field1195.containsKey(var37)) {
                            Iterator var38 = Statics.field4363.field1195.entrySet().iterator();
                            var38.next();
                            var38.remove();
                        }
                        Statics.field4363.field1195.put(var37, var36);
                    }
                    if (field505) {
                        Statics.field4363.field1188 = class69.field854;
                    } else {
                        Statics.field4363.field1188 = null;
                    }
                    class89.method1836();
                    field640 = var1.method2612();
                    field734 = var1.method2612() == 1;
                    field718 = var1.method2612();
                    field718 <<= 0x8;
                    field718 += var1.method2612();
                    field589 = var1.method2612();
                    var1.method2617(var2.field4302, 0, 1);
                    var2.field4300 = 0;
                    class243[] var39 = class243.method2502();
                    int var40 = var2.method6184();
                    if (var40 < 0 || var40 >= var39.length) {
                        throw new IOException(var40 + " " + var2.field4300);
                    }
                    field562.field1279 = var39[var40];
                    field562.field1282 = field562.field1279.field2849;
                    var1.method2617(var2.field4302, 0, 2);
                    var2.field4300 = 0;
                    field562.field1282 = var2.method6242();
                    try {
                        client var41 = Statics.field983;
                        JSObject.getWindow(var41).call("zap", (Object[]) null);
                    } catch (Throwable var63) {
                    }
                    method2368(16);
                }
                if (field496 != 16) {
                    if (field496 == 17 && var1.method2615() >= 2) {
                        var2.field4300 = 0;
                        var1.method2617(var2.field4302, 0, 2);
                        var2.field4300 = 0;
                        Statics.field1421 = var2.method6242();
                        method2368(18);
                    }
                    if (field496 == 18 && var1.method2615() >= Statics.field1421) {
                        var2.field4300 = 0;
                        var1.method2617(var2.field4302, 0, Statics.field1421);
                        var2.field4300 = 0;
                        String var58 = var2.method6335();
                        String var59 = var2.method6335();
                        String var60 = var2.method6335();
                        class69.method17(var58, var59, var60);
                        method3496(10);
                    }
                    if (field496 == 19) {
                        if (field562.field1282 == -1) {
                            if (var1.method2615() < 2) {
                                return;
                            }
                            var1.method2617(var2.field4302, 0, 2);
                            var2.field4300 = 0;
                            field562.field1282 = var2.method6242();
                        }
                        if (var1.method2615() >= field562.field1282) {
                            var1.method2617(var2.field4302, 0, field562.field1282);
                            var2.field4300 = 0;
                            int var61 = field562.field1282;
                            field520.method5379();
                            method5691();
                            class96.method2092(var2);
                            if (var2.field4300 != var61) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field497++;
                        if (field497 > 2000) {
                            if (field686 < 1) {
                                if (Statics.field456 == Statics.field1028) {
                                    Statics.field1028 = Statics.field1792;
                                } else {
                                    Statics.field1028 = Statics.field456;
                                }
                                field686++;
                                method2368(0);
                            } else {
                                method1870(-3);
                            }
                        }
                    }
                } else if (var1.method2615() >= field562.field1282) {
                    var2.field4300 = 0;
                    var1.method2617(var2.field4302, 0, field562.field1282);
                    field520.method5383();
                    field724 = 1L;
                    Statics.field801.field1032 = 0;
                    Statics.field2139 = true;
                    field479 = true;
                    field566 = -1L;
                    class55.method2428();
                    field562.method2267();
                    field562.field1280.field4300 = 0;
                    field562.field1279 = null;
                    field562.field1278 = null;
                    field562.field1285 = null;
                    field562.field1286 = null;
                    field562.field1282 = 0;
                    field562.field1276 = 0;
                    field635 = 0;
                    field519 = 0;
                    field706 = 0;
                    method335();
                    class33.method2485(0);
                    class98.method4668();
                    field624 = 0;
                    field626 = false;
                    field712 = 0;
                    field541 = 0;
                    field546 = 0;
                    Statics.field1441 = null;
                    field482 = 0;
                    field702 = -1;
                    field707 = 0;
                    field678 = 0;
                    field490 = class94.field1230;
                    field666 = class94.field1230;
                    field511 = 0;
                    class96.field1244 = 0;
                    for (int var43 = 0; var43 < 2048; var43++) {
                        class96.field1243[var43] = null;
                        class96.field1242[var43] = 1;
                    }
                    for (int var44 = 0; var44 < 2048; var44++) {
                        field587[var44] = null;
                    }
                    for (int var45 = 0; var45 < 32768; var45++) {
                        field510[var45] = null;
                    }
                    field748 = -1;
                    field615.method4989();
                    field602.method4989();
                    for (int var46 = 0; var46 < 4; var46++) {
                        for (int var47 = 0; var47 < 104; var47++) {
                            for (int var48 = 0; var48 < 104; var48++) {
                                field636[var46][var47][var48] = null;
                            }
                        }
                    }
                    field600 = new class309();
                    Statics.field1352.method1594();
                    for (int var49 = 0; var49 < Statics.field1617; var49++) {
                        class153 var50 = class153.method1947(var49);
                        if (var50 != null) {
                            class257.field3012[var49] = 0;
                            class257.field3015[var49] = 0;
                        }
                    }
                    Statics.field451.method2200();
                    field583 = -1;
                    if (field631 != -1) {
                        int var51 = field631;
                        if (var51 != -1 && Statics.field1492[var51]) {
                            Statics.field3642.method4813(var51);
                            if (Statics.field2200[var51] != null) {
                                boolean var52 = true;
                                for (int var53 = 0; var53 < Statics.field2200[var51].length; var53++) {
                                    if (Statics.field2200[var51][var53] != null) {
                                        if (Statics.field2200[var51][var53].field3143 == 2) {
                                            var52 = false;
                                        } else {
                                            Statics.field2200[var51][var53] = null;
                                        }
                                    }
                                }
                                if (var52) {
                                    Statics.field2200[var51] = null;
                                }
                                Statics.field1492[var51] = false;
                            }
                        }
                    }
                    for (class80 var54 = (class80) field632.method6028(); var54 != null; var54 = (class80) field632.method6029()) {
                        method2191(var54, true);
                    }
                    field631 = -1;
                    field632 = new class380(8);
                    field637 = null;
                    method335();
                    field737.method4507((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var55 = 0; var55 < 8; var55++) {
                        field685[var55] = null;
                        field596[var55] = false;
                    }
                    class78.method4916();
                    field473 = true;
                    for (int var56 = 0; var56 < 100; var56++) {
                        field595[var56] = true;
                    }
                    method4024();
                    Statics.field3704 = null;
                    Statics.field842 = null;
                    Arrays.fill(field700, (Object) null);
                    Statics.field1368 = null;
                    Arrays.fill(field494, (Object) null);
                    for (int var57 = 0; var57 < 8; var57++) {
                        field741[var57] = new class299();
                    }
                    Statics.field1562 = null;
                    class96.method2092(var2);
                    Statics.field2244 = -1;
                    method360(false, var2);
                    field562.field1279 = null;
                }
            }
        } catch (IOException var66) {
            if (field686 < 1) {
                if (Statics.field456 == Statics.field1028) {
                    Statics.field1028 = Statics.field1792;
                } else {
                    Statics.field1028 = Statics.field456;
                }
                field686++;
                method2368(0);
            } else {
                method1870(-2);
            }
        }
    }

    @ObfuscatedName("mo.ft(B)V")
    public static void method5691() {
        field562.method2267();
        field562.field1280.field4300 = 0;
        field562.field1279 = null;
        field562.field1278 = null;
        field562.field1285 = null;
        field562.field1286 = null;
        field562.field1282 = 0;
        field562.field1276 = 0;
        field635 = 0;
        method335();
        field482 = 0;
        field707 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field587[var0] = null;
        }
        Statics.field1674 = null;
        for (int var1 = 0; var1 < field510.length; var1++) {
            class91 var2 = field510[var1];
            if (var2 != null) {
                var2.field1111 = -1;
                var2.field1102 = false;
            }
        }
        class78.method4916();
        method3496(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field595[var3] = true;
        }
        method4024();
    }

    @ObfuscatedName("bk.fl(II)V")
    public static void method1870(int arg0) {
        if (arg0 == -3) {
            class69.method17(class283.field3362, class283.field3363, class283.field3364);
        } else if (arg0 == -2) {
            class69.method17(class283.field3365, class283.field3366, class283.field3484);
        } else if (arg0 == -1) {
            class69.method17(class283.field3368, class283.field3369, class283.field3585);
        } else if (arg0 == 3) {
            class69.method4653(3);
            class69.field866 = 1;
        } else if (arg0 == 4) {
            class69.method4653(14);
            class69.field867 = 0;
        } else if (arg0 == 5) {
            class69.field866 = 2;
            class69.method17(class283.field3471, class283.field3428, class283.field3376);
        } else if (arg0 == 68 || !(field471 || arg0 != 6)) {
            class69.method17(class283.field3602, class283.field3425, class283.field3388);
        } else if (arg0 == 7) {
            class69.method17(class283.field3380, class283.field3491, class283.field3633);
        } else if (arg0 == 8) {
            class69.method17(class283.field3383, class283.field3357, class283.field3385);
        } else if (arg0 == 9) {
            class69.method17(class283.field3386, class283.field3497, class283.field3519);
        } else if (arg0 == 10) {
            class69.method17(class283.field3389, class283.field3390, class283.field3391);
        } else if (arg0 == 11) {
            class69.method17(class283.field3392, class283.field3393, class283.field3394);
        } else if (arg0 == 12) {
            class69.method17(class283.field3395, class283.field3461, class283.field3397);
        } else if (arg0 == 13) {
            class69.method17(class283.field3398, class283.field3614, class283.field3400);
        } else if (arg0 == 14) {
            class69.method17(class283.field3401, class283.field3402, class283.field3403);
        } else if (arg0 == 16) {
            class69.method17(class283.field3404, class283.field3405, class283.field3406);
        } else if (arg0 == 17) {
            class69.method17(class283.field3451, class283.field3408, class283.field3409);
        } else if (arg0 == 18) {
            class69.method4653(14);
            class69.field867 = 1;
        } else if (arg0 == 19) {
            class69.method17(class283.field3413, class283.field3332, class283.field3415);
        } else if (arg0 == 20) {
            class69.method17(class283.field3416, class283.field3417, class283.field3418);
        } else if (arg0 == 22) {
            class69.method17(class283.field3419, class283.field3420, class283.field3421);
        } else if (arg0 == 23) {
            class69.method17(class283.field3422, class283.field3608, class283.field3424);
        } else if (arg0 == 24) {
            class69.method17(class283.field3338, class283.field3426, class283.field3427);
        } else if (arg0 == 25) {
            class69.method17(class283.field3371, class283.field3429, class283.field3430);
        } else if (arg0 == 26) {
            class69.method17(class283.field3431, class283.field3432, class283.field3433);
        } else if (arg0 == 27) {
            class69.method17(class283.field3434, class283.field3337, class283.field3436);
        } else if (arg0 == 31) {
            class69.method17(class283.field3473, class283.field3450, class283.field3445);
        } else if (arg0 == 32) {
            class69.method17(class283.field3446, class283.field3344, class283.field3448);
        } else if (arg0 == 37) {
            class69.method17(class283.field3449, class283.field3620, class283.field3490);
        } else if (arg0 == 38) {
            class69.method17(class283.field3452, class283.field3453, class283.field3454);
        } else if (arg0 == 55) {
            class69.method4653(8);
        } else if (arg0 == 56) {
            class69.method17(class283.field3459, class283.field3460, class283.field3481);
            method3496(11);
            return;
        } else if (arg0 == 57) {
            class69.method17(class283.field3499, class283.field3463, class283.field3524);
            method3496(11);
            return;
        } else if (arg0 == 61) {
            class69.method4653(7);
        } else if (arg0 == 62) {
            method3496(10);
            class69.method4653(9);
            class69.method17(class283.field3465, class283.field3361, class283.field3475);
            return;
        } else if (arg0 == 63) {
            method3496(10);
            class69.method4653(9);
            class69.method17(class283.field3443, class283.field3469, class283.field3470);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method3496(10);
            class69.method4653(9);
            class69.method17(class283.field3591, class283.field3472, class283.field3507);
            return;
        } else {
            class69.method17(class283.field3351, class283.field3580, class283.field3476);
        }
        method3496(10);
        if (field501.method6494()) {
            class69.method4653(9);
        }
    }

    @ObfuscatedName("fm.fe(I)V")
    public static final void method3144() {
        field562.method2271();
        method281();
        Statics.field3291.method4002();
        for (int var0 = 0; var0 < 4; var0++) {
            field594[var0].method3146();
        }
        System.gc();
        class248.field2923 = 1;
        Statics.field1471 = null;
        Statics.field4377 = -1;
        Statics.field3668 = -1;
        Statics.field2925 = 0;
        Statics.field975 = false;
        Statics.field2926 = 2;
        field710 = -1;
        field711 = false;
        for (class63 var1 = (class63) class63.field770.method4981(); var1 != null; var1 = (class63) class63.field770.method4987()) {
            if (var1.field776 != null) {
                Statics.field1331.method621(var1.field776);
                var1.field776 = null;
            }
            if (var1.field781 != null) {
                Statics.field1331.method621(var1.field781);
                var1.field781 = null;
            }
        }
        class63.field770.method4989();
        method3496(10);
    }

    @ObfuscatedName("fq.ff(IB)V")
    public static final void method3162(int arg0) {
        method3144();
        switch(arg0) {
            case 1:
                class69.method4653(24);
                class69.method17(class283.field3565, class283.field3374, class283.field3573);
                break;
            case 2:
                class69.method4653(24);
                class69.method17(class283.field3562, class283.field3563, class283.field3564);
        }
    }

    @ObfuscatedName("d.fu(I)V")
    public static final void method281() {
        class171.field1935.method4207();
        class164.field1763.method4207();
        class156.method2107();
        class169.method5643();
        class161.field1703.method4207();
        class161.field1705.method4207();
        class170.method3174();
        class172.method1972();
        class163.method1042();
        class165.field1775.method4207();
        class153.field1613.method4207();
        Statics.field1565.method6114();
        Statics.field2777.method6114();
        class168.field1802.method4207();
        class168.field1803.method4207();
        class168.field1811.method4207();
        class157.method2610();
        class167.field1798.method4207();
        class166.field1784.method4207();
        class154.field1620.method4207();
        class260.field3031.method4207();
        class262.method2266();
        ((class218) Statics.field2369).method4035();
        class72.field934.method4207();
        Statics.field1610.method4757();
        Statics.field454.method4757();
        Statics.field1786.method4757();
        Statics.field58.method4757();
        Statics.field50.method4757();
        Statics.field1270.method4757();
        Statics.field1694.method4757();
        Statics.field458.method4757();
        Statics.field923.method4757();
        Statics.field953.method4757();
        Statics.field2209.method4757();
        Statics.field70.method4757();
    }

    @ObfuscatedName("ee.fm(B)V")
    public static final void method2653() {
        if (field519 > 0) {
            method3144();
        } else {
            field520.method5387();
            method3496(40);
            Statics.field916 = field562.method2273();
            field562.method2272();
        }
    }

    @ObfuscatedName("fx.fq(ZB)V")
    public static final void method3264(boolean arg0) {
        if (arg0) {
            field694 = class69.field876 ? class113.field1346 : class113.field1348;
        } else {
            field694 = Statics.field4363.field1195.containsKey(class319.method2553(class69.field854)) ? class113.field1351 : class113.field1347;
        }
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1098() {
        if (field635 > 1) {
            field635--;
        }
        if (field519 > 0) {
            field519--;
        }
        if (field517) {
            field517 = false;
            method2653();
            return;
        }
        if (!field607) {
            method1658();
        }
        for (int var1 = 0; var1 < 100 && this.method1101(field562); var1++) {
        }
        if (field642 != 30) {
            return;
        }
        while (true) {
            class56 var2 = (class56) class55.field419.method5026();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field520.field3901) {
                    class242 var6 = class242.method3564(class240.field2667, field562.field1277);
                    var6.field2792.method6223(0);
                    int var7 = var6.field2792.field4300;
                    field520.method5386(var6.field2792);
                    var6.field2792.method6237(var6.field2792.field4300 - var7);
                    field562.method2269(var6);
                    field520.method5384();
                }
                Object var8 = Statics.field801.field1031;
                synchronized (Statics.field801.field1031) {
                    if (!field498) {
                        Statics.field801.field1032 = 0;
                    } else if (class33.field219 != 0 || Statics.field801.field1032 >= 40) {
                        class242 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field801.field1032 && (var9 == null || var9.field2792.field4300 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field801.field1033[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field801.field1035[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field476 != var16 || field477 != var15) {
                                if (var9 == null) {
                                    var9 = class242.method3564(class240.field2705, field562.field1277);
                                    var9.field2792.method6223(0);
                                    var10 = var9.field2792.field4300;
                                    var9.field2792.field4300 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field478 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field476;
                                    var18 = var15 - field477;
                                    var19 = (int) ((Statics.field801.field1038[var14] - field478) / 20L);
                                    var12 = (int) ((Statics.field801.field1038[var14] - field478) % 20L + (long) var12);
                                }
                                field476 = var16;
                                field477 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2792.method6224((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2792.method6223(var19 + 128);
                                    var9.field2792.method6224((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2792.method6223(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2792.method6292(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2792.method6292(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2792.method6224((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2792.method6292(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2792.method6292(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field478 = Statics.field801.field1038[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2792.method6237(var9.field2792.field4300 - var10);
                            int var20 = var9.field2792.field4300;
                            var9.field2792.field4300 = var10;
                            var9.field2792.method6223(var12 / var13);
                            var9.field2792.method6223(var12 % var13);
                            var9.field2792.field4300 = var20;
                            field562.method2269(var9);
                        }
                        if (var11 >= Statics.field801.field1032) {
                            Statics.field801.field1032 = 0;
                        } else {
                            Statics.field801.field1032 -= var11;
                            System.arraycopy(Statics.field801.field1035, var11, Statics.field801.field1035, 0, Statics.field801.field1032);
                            System.arraycopy(Statics.field801.field1033, var11, Statics.field801.field1033, 0, Statics.field801.field1032);
                            System.arraycopy(Statics.field801.field1038, var11, Statics.field801.field1038, 0, Statics.field801.field1032);
                        }
                    }
                }
                if (class33.field219 == 1 || !Statics.field455 && class33.field219 == 4 || class33.field219 == 2) {
                    long var22 = class33.field203 - field724 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field724 = class33.field203 * -1L;
                    int var24 = class33.field224;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field137) {
                        var24 = Statics.field137;
                    }
                    int var25 = class33.field220;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field184) {
                        var25 = Statics.field184;
                    }
                    int var26 = (int) var22;
                    class242 var27 = class242.method3564(class240.field2726, field562.field1277);
                    var27.field2792.method6224((class33.field219 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2792.method6224(var25);
                    var27.field2792.method6224(var24);
                    field562.method2269(var27);
                }
                if (class24.field111 > 0) {
                    class242 var28 = class242.method3564(class240.field2717, field562.field1277);
                    var28.field2792.method6224(0);
                    int var29 = var28.field2792.field4300;
                    long var30 = class398.method2381();
                    for (int var32 = 0; var32 < class24.field111; var32++) {
                        long var33 = var30 - field566;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field566 = var30;
                        var28.field2792.method6283((int) var33);
                        var28.field2792.method6221(class24.field126[var32]);
                    }
                    var28.field2792.method6266(var28.field2792.field4300 - var29);
                    field562.method2269(var28);
                }
                if (field621 > 0) {
                    field621--;
                }
                if (class24.field118[96] || class24.field118[97] || class24.field118[98] || class24.field118[99]) {
                    field556 = true;
                }
                if (field556 && field621 <= 0) {
                    field621 = 20;
                    field556 = false;
                    class242 var35 = class242.method3564(class240.field2700, field562.field1277);
                    var35.field2792.method6275(field483);
                    var35.field2792.method6277(field541);
                    field562.method2269(var35);
                }
                if (Statics.field2139 && !field479) {
                    field479 = true;
                    class242 var36 = class242.method3564(class240.field2744, field562.field1277);
                    var36.field2792.method6223(1);
                    field562.method2269(var36);
                }
                if (!Statics.field2139 && field479) {
                    field479 = false;
                    class242 var37 = class242.method3564(class240.field2744, field562.field1277);
                    var37.field2792.method6223(0);
                    field562.method2269(var37);
                }
                if (Statics.field1494 != null) {
                    Statics.field1494.method5796();
                }
                if (Statics.field16) {
                    if (Statics.field3704 != null) {
                        Statics.field3704.method5506();
                    }
                    method2180();
                    Statics.field16 = false;
                }
                if (Statics.field163) {
                    method2359();
                    Statics.field163 = false;
                }
                if (Statics.field3731 != field702) {
                    field702 = Statics.field3731;
                    int var38 = Statics.field3731;
                    int[] var39 = Statics.field40.field4396;
                    int var40 = var39.length;
                    for (int var41 = 0; var41 < var40; var41++) {
                        var39[var41] = 0;
                    }
                    for (int var42 = 1; var42 < 103; var42++) {
                        int var43 = (103 - var42) * 2048 + 24628;
                        for (int var44 = 1; var44 < 103; var44++) {
                            if ((class75.field955[var38][var44][var42] & 0x18) == 0) {
                                Statics.field3291.method3861(var39, var43, 512, var38, var44, var42);
                            }
                            if (var38 < 3 && (class75.field955[var38 + 1][var44][var42] & 0x8) != 0) {
                                Statics.field3291.method3861(var39, var43, 512, var38 + 1, var44, var42);
                            }
                            var43 += 4;
                        }
                    }
                    int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field40.method6636();
                    for (int var47 = 1; var47 < 103; var47++) {
                        for (int var48 = 1; var48 < 103; var48++) {
                            if ((class75.field955[var38][var48][var47] & 0x18) == 0) {
                                method2380(var38, var48, var47, var45, var46);
                            }
                            if (var38 < 3 && (class75.field955[var38 + 1][var48][var47] & 0x8) != 0) {
                                method2380(var38 + 1, var48, var47, var45, var46);
                            }
                        }
                    }
                    field528 = 0;
                    for (int var49 = 0; var49 < 104; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            long var51 = Statics.field3291.method3856(Statics.field3731, var49, var50);
                            if (var51 != 0L) {
                                int var53 = class221.method300(var51);
                                int var54 = Statics.method2740(var53).field1829;
                                if (var54 >= 0 && class154.method3068(var54).field1630) {
                                    field644[field528] = class154.method3068(var54).method2700(false);
                                    field704[field528] = var49;
                                    field474[field528] = var50;
                                    field528++;
                                }
                            }
                        }
                    }
                    Statics.field146.method6602();
                }
                if (field642 != 30) {
                    return;
                }
                for (class84 var55 = (class84) field600.method4981(); var55 != null; var55 = (class84) field600.method4987()) {
                    if (var55.field1082 > 0) {
                        var55.field1082--;
                    }
                    if (var55.field1082 != 0) {
                        if (var55.field1080 > 0) {
                            var55.field1080--;
                        }
                        if (var55.field1080 == 0 && var55.field1081 >= 1 && var55.field1074 >= 1 && var55.field1081 <= 102 && var55.field1074 <= 102 && (var55.field1072 < 0 || class75.method2140(var55.field1072, var55.field1083))) {
                            method4253(var55.field1073, var55.field1079, var55.field1081, var55.field1074, var55.field1072, var55.field1071, var55.field1083);
                            var55.field1080 = -1;
                            if (var55.field1075 == var55.field1072 && var55.field1075 == -1) {
                                var55.method5752();
                            } else if (var55.field1075 == var55.field1072 && var55.field1076 == var55.field1071 && var55.field1083 == var55.field1077) {
                                var55.method5752();
                            }
                        }
                    } else if (var55.field1075 < 0 || class75.method2140(var55.field1075, var55.field1077)) {
                        method4253(var55.field1073, var55.field1079, var55.field1081, var55.field1074, var55.field1075, var55.field1076, var55.field1077);
                        var55.method5752();
                    }
                }
                int var10002;
                for (int var56 = 0; var56 < field712; var56++) {
                    var10002 = field534[var56]--;
                    if (field534[var56] >= -10) {
                        class35 var58 = field585[var56];
                        if (var58 == null) {
                            class35 var10000 = (class35) null;
                            var58 = class35.method666(Statics.field58, field713[var56], 0);
                            if (var58 == null) {
                                continue;
                            }
                            field534[var56] += var58.method672();
                            field585[var56] = var58;
                        }
                        if (field534[var56] < 0) {
                            int var65;
                            if (field716[var56] == 0) {
                                var65 = Statics.field4363.field1192;
                            } else {
                                int var59 = (field716[var56] & 0xFF) * 128;
                                int var60 = field716[var56] >> 16 & 0xFF;
                                int var61 = var60 * 128 + 64 - Statics.field1674.field1092;
                                if (var61 < 0) {
                                    var61 = -var61;
                                }
                                int var62 = field716[var56] >> 8 & 0xFF;
                                int var63 = var62 * 128 + 64 - Statics.field1674.field1085;
                                if (var63 < 0) {
                                    var63 = -var63;
                                }
                                int var64 = var61 + var63 - 128;
                                if (var64 > var59) {
                                    field534[var56] = -100;
                                    continue;
                                }
                                if (var64 < 0) {
                                    var64 = 0;
                                }
                                var65 = Statics.field4363.field1187 * (var59 - var64) / var59;
                            }
                            if (var65 > 0) {
                                class36 var66 = var58.method667().method677(Statics.field4201);
                                class43 var67 = class43.method789(var66, 100, var65);
                                var67.method800(field714[var56] - 1);
                                Statics.field1331.method622(var67);
                            }
                            field534[var56] = -100;
                        }
                    } else {
                        field712--;
                        for (int var57 = var56; var57 < field712; var57++) {
                            field713[var57] = field713[var57 + 1];
                            field585[var57] = field585[var57 + 1];
                            field714[var57] = field714[var57 + 1];
                            field534[var57] = field534[var57 + 1];
                            field716[var57] = field716[var57 + 1];
                        }
                        var56--;
                    }
                }
                if (field711) {
                    boolean var68;
                    if (class248.field2923 == 0) {
                        var68 = Statics.field2928.method4270();
                    } else {
                        var68 = true;
                    }
                    if (!var68) {
                        if (Statics.field4363.field1191 != 0 && field710 != -1) {
                            class288 var69 = Statics.field1270;
                            int var70 = field710;
                            int var71 = Statics.field4363.field1191;
                            class248.field2923 = 1;
                            Statics.field1471 = var69;
                            Statics.field4377 = var70;
                            Statics.field3668 = 0;
                            Statics.field2925 = var71;
                            Statics.field975 = false;
                            Statics.field2926 = 10000;
                        }
                        field711 = false;
                    }
                }
                field562.field1276++;
                if (field562.field1276 > 750) {
                    method2653();
                    return;
                }
                Statics.method2842();
                for (int var72 = 0; var72 < field511; var72++) {
                    int var73 = field611[var72];
                    class91 var74 = field510[var73];
                    if (var74 != null) {
                        method2528(var74, var74.field1210.field1707);
                    }
                }
                int[] var75 = class96.field1239;
                for (int var76 = 0; var76 < class96.field1244; var76++) {
                    class83 var77 = field587[var75[var76]];
                    if (var77 != null && var77.field1105 > 0) {
                        var77.field1105--;
                        if (var77.field1105 == 0) {
                            var77.field1098 = null;
                        }
                    }
                }
                for (int var78 = 0; var78 < field511; var78++) {
                    int var79 = field611[var78];
                    class91 var80 = field510[var79];
                    if (var80 != null && var80.field1105 > 0) {
                        var80.field1105--;
                        if (var80.field1105 == 0) {
                            var80.field1098 = null;
                        }
                    }
                }
                field532++;
                if (field701 != 0) {
                    field574 += 20;
                    if (field574 >= 400) {
                        field701 = 0;
                    }
                }
                if (Statics.field2038 != null) {
                    field577++;
                    if (field577 >= 15) {
                        method3522(Statics.field2038);
                        Statics.field2038 = null;
                    }
                }
                class262 var81 = Statics.field2002;
                class262 var82 = Statics.field3248;
                Statics.field2002 = null;
                Statics.field3248 = null;
                field648 = null;
                field681 = false;
                field649 = false;
                field696 = 0;
                while (class24.method2714() && field696 < 128) {
                    if (field640 >= 2 && class24.field118[82] && Statics.field56 == 66) {
                        String var83 = "";
                        Iterator var84 = class98.field1267.iterator();
                        while (var84.hasNext()) {
                            class58 var85 = (class58) var84.next();
                            var83 = var83 + var85.field444 + ':' + var85.field445 + '\n';
                        }
                        Statics.field983.method476(var83);
                    } else if (field546 != 1 || Statics.field3859 <= 0) {
                        field698[field696] = Statics.field56;
                        field697[field696] = Statics.field3859;
                        field696++;
                    }
                }
                boolean var88 = field640 >= 2;
                if (var88 && class24.field118[82] && class24.field118[81] && field673 != 0) {
                    int var89 = Statics.field1674.field1063 - field673;
                    if (var89 < 0) {
                        var89 = 0;
                    } else if (var89 > 3) {
                        var89 = 3;
                    }
                    if (Statics.field1674.field1063 != var89) {
                        method2676(Statics.field92 + Statics.field1674.field1091[0], Statics.field4007 + Statics.field1674.field1144[0], var89, false);
                    }
                    field673 = 0;
                }
                if (field631 != -1) {
                    Statics.method2252(field631, 0, 0, Statics.field184, Statics.field137, 0, 0);
                }
                field656++;
                while (true) {
                    class81 var90;
                    class262 var91;
                    class262 var92;
                    do {
                        var90 = (class81) field675.method4994();
                        if (var90 == null) {
                            while (true) {
                                class81 var93;
                                class262 var94;
                                class262 var95;
                                do {
                                    var93 = (class81) field676.method4994();
                                    if (var93 == null) {
                                        while (true) {
                                            class81 var96;
                                            class262 var97;
                                            class262 var98;
                                            do {
                                                var96 = (class81) field674.method4994();
                                                if (var96 == null) {
                                                    this.method1102();
                                                    if (Statics.field1494 != null) {
                                                        Statics.field1494.method5806(Statics.field3731, (Statics.field1674.field1092 >> 7) + Statics.field92, (Statics.field1674.field1085 >> 7) + Statics.field4007, false);
                                                        Statics.field1494.method5822();
                                                    }
                                                    if (field739 != null) {
                                                        this.method1107();
                                                    }
                                                    if (Statics.field2929 != null) {
                                                        method3522(Statics.field2929);
                                                        field584++;
                                                        if (class33.field211 == 0) {
                                                            if (field668) {
                                                                if (Statics.field3276 == Statics.field2929 && field699 != field579) {
                                                                    class262 var99 = Statics.field2929;
                                                                    byte var100 = 0;
                                                                    if (field657 == 1 && var99.field3056 == 206) {
                                                                        var100 = 1;
                                                                    }
                                                                    if (var99.field3180[field699] <= 0) {
                                                                        var100 = 0;
                                                                    }
                                                                    if (class263.method2181(method2052(var99))) {
                                                                        int var101 = field579;
                                                                        int var102 = field699;
                                                                        var99.field3180[var102] = var99.field3180[var101];
                                                                        var99.field3131[var102] = var99.field3131[var101];
                                                                        var99.field3180[var101] = -1;
                                                                        var99.field3131[var101] = 0;
                                                                    } else if (var100 == 1) {
                                                                        int var103 = field579;
                                                                        int var104 = field699;
                                                                        while (var103 != var104) {
                                                                            if (var103 > var104) {
                                                                                var99.method4543(var103 - 1, var103);
                                                                                var103--;
                                                                            } else if (var103 < var104) {
                                                                                var99.method4543(var103 + 1, var103);
                                                                                var103++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var99.method4543(field699, field579);
                                                                    }
                                                                    class242 var105 = class242.method3564(class240.field2670, field562.field1277);
                                                                    var105.field2792.method6275(field699);
                                                                    var105.field2792.method6277(field579);
                                                                    var105.field2792.method6267(var100);
                                                                    var105.field2792.method6284(Statics.field2929.field3052);
                                                                    field562.method2269(var105);
                                                                }
                                                            } else if (this.method1103()) {
                                                                this.method1104(field484, field581);
                                                            } else if (field608 > 0) {
                                                                int var106 = field484;
                                                                int var107 = field581;
                                                                class67 var108 = Statics.field3269;
                                                                method181(var108.field840, var108.field832, var108.field833, var108.field837, var108.field834, var108.field834, var106, var107);
                                                                Statics.field3269 = null;
                                                            }
                                                            field577 = 10;
                                                            class33.field219 = 0;
                                                            Statics.field2929 = null;
                                                        } else if (field584 >= 5 && (class33.field212 > field484 + 5 || class33.field212 < field484 - 5 || class33.field221 > field581 + 5 || class33.field221 < field581 - 5)) {
                                                            field668 = true;
                                                        }
                                                    }
                                                    if (class213.method3866()) {
                                                        int var109 = class213.field2411;
                                                        int var110 = class213.field2412;
                                                        class242 var111 = class242.method3564(class240.field2704, field562.field1277);
                                                        var111.field2792.method6223(5);
                                                        var111.field2792.method6236(Statics.field92 + var109);
                                                        var111.field2792.method6267(class24.field118[82] ? (class24.field118[81] ? 2 : 1) : 0);
                                                        var111.field2792.method6277(Statics.field4007 + var110);
                                                        field562.method2269(var111);
                                                        class213.method3999();
                                                        field597 = class33.field220;
                                                        field609 = class33.field224;
                                                        field701 = 1;
                                                        field574 = 0;
                                                        field707 = var109;
                                                        field678 = var110;
                                                    }
                                                    if (Statics.field2002 != var81) {
                                                        if (var81 != null) {
                                                            method3522(var81);
                                                        }
                                                        if (Statics.field2002 != null) {
                                                            method3522(Statics.field2002);
                                                        }
                                                    }
                                                    if (Statics.field3248 != var82 && field715 == field622) {
                                                        if (var82 != null) {
                                                            method3522(var82);
                                                        }
                                                        if (Statics.field3248 != null) {
                                                            method3522(Statics.field3248);
                                                        }
                                                    }
                                                    if (Statics.field3248 == null) {
                                                        if (field622 > 0) {
                                                            field622--;
                                                        }
                                                    } else if (field622 < field715) {
                                                        field622++;
                                                        if (field715 == field622) {
                                                            method3522(Statics.field3248);
                                                        }
                                                    }
                                                    if (field546 == 0) {
                                                        int var112 = Statics.field1674.field1092;
                                                        int var113 = Statics.field1674.field1085;
                                                        if (Statics.field3865 - var112 < -500 || Statics.field3865 - var112 > 500 || Statics.field86 - var113 < -500 || Statics.field86 - var113 > 500) {
                                                            Statics.field3865 = var112;
                                                            Statics.field86 = var113;
                                                        }
                                                        if (Statics.field3865 != var112) {
                                                            Statics.field3865 += (var112 - Statics.field3865) / 16;
                                                        }
                                                        if (Statics.field86 != var113) {
                                                            Statics.field86 += (var113 - Statics.field86) / 16;
                                                        }
                                                        int var114 = Statics.field3865 >> 7;
                                                        int var115 = Statics.field86 >> 7;
                                                        int var116 = method6155(Statics.field3865, Statics.field86, Statics.field3731);
                                                        int var117 = 0;
                                                        if (var114 > 3 && var115 > 3 && var114 < 100 && var115 < 100) {
                                                            for (int var118 = var114 - 4; var118 <= var114 + 4; var118++) {
                                                                for (int var119 = var115 - 4; var119 <= var115 + 4; var119++) {
                                                                    int var120 = Statics.field3731;
                                                                    if (var120 < 3 && (class75.field955[1][var118][var119] & 0x2) == 2) {
                                                                        var120++;
                                                                    }
                                                                    int var121 = var116 - class75.field969[var120][var118][var119];
                                                                    if (var121 > var117) {
                                                                        var117 = var121;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var122 = var117 * 192;
                                                        if (var122 > 98048) {
                                                            var122 = 98048;
                                                        }
                                                        if (var122 < 32768) {
                                                            var122 = 32768;
                                                        }
                                                        if (var122 > field557) {
                                                            field557 += (var122 - field557) / 24;
                                                        } else if (var122 < field557) {
                                                            field557 += (var122 - field557) / 80;
                                                        }
                                                        Statics.field943 = method6155(Statics.field1674.field1092, Statics.field1674.field1085, Statics.field3731) - field727;
                                                    } else if (field546 == 1) {
                                                        if (field512 && Statics.field1674 != null) {
                                                            int var123 = Statics.field1674.field1091[0];
                                                            int var124 = Statics.field1674.field1144[0];
                                                            if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                                                                Statics.field3865 = Statics.field1674.field1092;
                                                                int var125 = method6155(Statics.field1674.field1092, Statics.field1674.field1085, Statics.field3731) - field727;
                                                                if (var125 < Statics.field943) {
                                                                    Statics.field943 = var125;
                                                                }
                                                                Statics.field86 = Statics.field1674.field1085;
                                                                field512 = false;
                                                            }
                                                        }
                                                        short var126 = -1;
                                                        if (class24.field118[33]) {
                                                            var126 = 0;
                                                        } else if (class24.field118[49]) {
                                                            var126 = 1024;
                                                        }
                                                        if (class24.field118[48]) {
                                                            if (var126 == 0) {
                                                                var126 = 1792;
                                                            } else if (var126 == 1024) {
                                                                var126 = 1280;
                                                            } else {
                                                                var126 = 1536;
                                                            }
                                                        } else if (class24.field118[50]) {
                                                            if (var126 == 0) {
                                                                var126 = 256;
                                                            } else if (var126 == 1024) {
                                                                var126 = 768;
                                                            } else {
                                                                var126 = 512;
                                                            }
                                                        }
                                                        byte var127 = 0;
                                                        if (class24.field118[35]) {
                                                            var127 = -1;
                                                        } else if (class24.field118[51]) {
                                                            var127 = 1;
                                                        }
                                                        int var128 = 0;
                                                        if (var126 >= 0 || var127 != 0) {
                                                            int var129 = class24.field118[81] ? field552 : field572;
                                                            var128 = var129 * 16;
                                                            field521 = var126;
                                                            field550 = var127;
                                                        }
                                                        if (field548 < var128) {
                                                            field548 += var128 / 8;
                                                            if (field548 > var128) {
                                                                field548 = var128;
                                                            }
                                                        } else if (field548 > var128) {
                                                            field548 = field548 * 9 / 10;
                                                        }
                                                        if (field548 > 0) {
                                                            int var130 = field548 / 16;
                                                            if (field521 >= 0) {
                                                                int var131 = field521 - Statics.field2069 & 0x7FF;
                                                                int var132 = class211.field2362[var131];
                                                                int var133 = class211.field2370[var131];
                                                                Statics.field3865 += var130 * var132 / 65536;
                                                                Statics.field86 += var130 * var133 / 65536;
                                                            }
                                                            if (field550 != 0) {
                                                                Statics.field943 += field550 * var130;
                                                                if (Statics.field943 > 0) {
                                                                    Statics.field943 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field521 = -1;
                                                            field550 = -1;
                                                        }
                                                        if (class24.field118[13]) {
                                                            method405();
                                                        }
                                                    }
                                                    if (class33.field211 == 4 && Statics.field455) {
                                                        int var134 = class33.field221 - field545;
                                                        field543 = var134 * 2;
                                                        field545 = var134 == -1 || var134 == 1 ? class33.field221 : (field545 + class33.field221) / 2;
                                                        int var135 = field544 - class33.field212;
                                                        field542 = var135 * 2;
                                                        field544 = var135 == -1 || var135 == 1 ? class33.field212 : (field544 + class33.field212) / 2;
                                                    } else {
                                                        if (class24.field118[96]) {
                                                            field542 += (-24 - field542) / 2;
                                                        } else if (class24.field118[97]) {
                                                            field542 += (24 - field542) / 2;
                                                        } else {
                                                            field542 /= 2;
                                                        }
                                                        if (class24.field118[98]) {
                                                            field543 += (12 - field543) / 2;
                                                        } else if (class24.field118[99]) {
                                                            field543 += (-12 - field543) / 2;
                                                        } else {
                                                            field543 /= 2;
                                                        }
                                                        field545 = class33.field221;
                                                        field544 = class33.field212;
                                                    }
                                                    field541 = field542 / 2 + field541 & 0x7FF;
                                                    field483 += field543 / 2;
                                                    if (field483 < 128) {
                                                        field483 = 128;
                                                    }
                                                    if (field483 > 383) {
                                                        field483 = 383;
                                                    }
                                                    if (field692) {
                                                        method2426();
                                                    }
                                                    for (int var136 = 0; var136 < 5; var136++) {
                                                        var10002 = field723[var136]++;
                                                    }
                                                    Statics.field451.method2203();
                                                    int var137 = ++class33.field206 - 1;
                                                    int var139 = class24.method576();
                                                    if (var137 > 15000 && var139 > 15000) {
                                                        field519 = 250;
                                                        class33.method2485(14500);
                                                        class242 var140 = class242.method3564(class240.field2720, field562.field1277);
                                                        field562.method2269(var140);
                                                    }
                                                    Statics.field1352.method1624();
                                                    field562.field1273++;
                                                    if (field562.field1273 > 50) {
                                                        class242 var141 = class242.method3564(class240.field2727, field562.field1277);
                                                        field562.method2269(var141);
                                                    }
                                                    try {
                                                        field562.method2278();
                                                    } catch (IOException var143) {
                                                        method2653();
                                                    }
                                                    return;
                                                }
                                                var97 = var96.field1023;
                                                if (var97.field3053 < 0) {
                                                    break;
                                                }
                                                var98 = class262.method2355(var97.field3071);
                                            } while (var98 == null || var98.field3186 == null || var97.field3053 >= var98.field3186.length || var98.field3186[var97.field3053] != var97);
                                            class64.method3748(var96);
                                        }
                                    }
                                    var94 = var93.field1023;
                                    if (var94.field3053 < 0) {
                                        break;
                                    }
                                    var95 = class262.method2355(var94.field3071);
                                } while (var95 == null || var95.field3186 == null || var94.field3053 >= var95.field3186.length || var95.field3186[var94.field3053] != var94);
                                class64.method3748(var93);
                            }
                        }
                        var91 = var90.field1023;
                        if (var91.field3053 < 0) {
                            break;
                        }
                        var92 = class262.method2355(var91.field3071);
                    } while (var92 == null || var92.field3186 == null || var91.field3053 >= var92.field3186.length || var92.field3186[var91.field3053] != var91);
                    class64.method3748(var90);
                }
            }
            class242 var4 = class242.method3564(class240.field2677, field562.field1277);
            var4.field2792.method6223(0);
            int var5 = var4.field2792.field4300;
            class55.method209(var4.field2792);
            var4.field2792.method6237(var4.field2792.field4300 - var5);
            field562.method2269(var4);
        }
    }

    @ObfuscatedName("bj.fv(Lfm;IIII)V")
    public static void method1776(class172 arg0, int arg1, int arg2, int arg3) {
        if (field712 >= 50 || Statics.field4363.field1187 == 0 || arg0.field1956 == null || arg1 >= arg0.field1956.length) {
            return;
        }
        int var4 = arg0.field1956[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field713[field712] = var5;
        field714[field712] = var6;
        field534[field712] = 0;
        field585[field712] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field716[field712] = (var8 << 16) + (var9 << 8) + var7;
        field712++;
    }

    @ObfuscatedName("dk.fz(IIIB)V")
    public static void method2504(int arg0, int arg1, int arg2) {
        if (Statics.field4363.field1192 == 0 || arg1 == 0 || field712 >= 50) {
            return;
        }
        field713[field712] = arg0;
        field714[field712] = arg1;
        field534[field712] = arg2;
        field585[field712] = null;
        field716[field712] = 0;
        field712++;
    }

    @ObfuscatedName("ks.fo(II)V")
    public static void method4960(int arg0) {
        if (arg0 == -1 && !field711) {
            class248.method3598();
        } else if (arg0 != -1 && field710 != arg0 && Statics.field4363.field1191 != 0 && !field711) {
            class288 var1 = Statics.field1270;
            int var2 = Statics.field4363.field1191;
            class248.field2923 = 1;
            Statics.field1471 = var1;
            Statics.field4377 = arg0;
            Statics.field3668 = 0;
            Statics.field2925 = var2;
            Statics.field975 = false;
            Statics.field2926 = 2;
        }
        field710 = arg0;
    }

    @ObfuscatedName("lv.fr(III)V")
    public static void method5448(int arg0, int arg1) {
        if (Statics.field4363.field1191 == 0 || arg0 == -1) {
            return;
        }
        class288 var2 = Statics.field2209;
        int var3 = Statics.field4363.field1191;
        class248.field2923 = 1;
        Statics.field1471 = var2;
        Statics.field4377 = arg0;
        Statics.field3668 = 0;
        Statics.field2925 = var3;
        Statics.field975 = false;
        Statics.field2926 = 10000;
        field711 = true;
    }

    @ObfuscatedName("w.fx(Ljf;III)V")
    public static final void method13(class262 arg0, int arg1, int arg2) {
        if (field482 != 0 && field482 != 3 || field607 || !(class33.field219 == 1 || !Statics.field455 && class33.field219 == 4)) {
            return;
        }
        class256 var3 = arg0.method4580(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field220 - arg1;
        int var5 = class33.field224 - arg2;
        if (!var3.method4464(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3010 / 2;
        int var7 = var5 - var3.field3008 / 2;
        int var8 = field541 & 0x7FF;
        int var9 = class211.field2362[var8];
        int var10 = class211.field2370[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1674.field1092 + var11 >> 7;
        int var14 = Statics.field1674.field1085 - var12 >> 7;
        class242 var15 = class242.method3564(class240.field2750, field562.field1277);
        var15.field2792.method6223(18);
        var15.field2792.method6236(Statics.field92 + var13);
        var15.field2792.method6267(class24.field118[82] ? (class24.field118[81] ? 2 : 1) : 0);
        var15.field2792.method6277(Statics.field4007 + var14);
        var15.field2792.method6223(var6);
        var15.field2792.method6223(var7);
        var15.field2792.method6224(field541);
        var15.field2792.method6223(57);
        var15.field2792.method6223(0);
        var15.field2792.method6223(0);
        var15.field2792.method6223(89);
        var15.field2792.method6224(Statics.field1674.field1092);
        var15.field2792.method6224(Statics.field1674.field1085);
        var15.field2792.method6223(63);
        field562.method2269(var15);
        field707 = var13;
        field678 = var14;
    }

    @ObfuscatedName("p.fb(Ljava/lang/String;B)V")
    public static final void method52(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4363.field1184 = !Statics.field4363.field1184;
            class89.method1836();
            if (Statics.field4363.field1184) {
                class98.method6175(99, "", "Roofs are now all hidden");
            } else {
                class98.method6175(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field703 = !field703;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field590 = !field590;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field619 = !field619;
        }
        if (field640 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1494.field4183 = !Statics.field1494.field4183;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field703 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field703 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2653();
            }
        }
        class242 var1 = class242.method3564(class240.field2722, field562.field1277);
        var1.field2792.method6223(arg0.length() + 1);
        var1.field2792.method6230(arg0);
        field562.method2269(var1);
    }

    @ObfuscatedName("dz.fk(I)V")
    public static final void method2426() {
        int var0 = Statics.field1762 * 128 + 64;
        int var1 = Statics.field1334 * 128 + 64;
        int var2 = method6155(var0, var1, Statics.field3731) - Statics.field2443;
        if (Statics.field2136 < var0) {
            Statics.field2136 += Statics.field889 * (var0 - Statics.field2136) / 1000 + Statics.field1306;
            if (Statics.field2136 > var0) {
                Statics.field2136 = var0;
            }
        }
        if (Statics.field2136 > var0) {
            Statics.field2136 -= Statics.field889 * (Statics.field2136 - var0) / 1000 + Statics.field1306;
            if (Statics.field2136 < var0) {
                Statics.field2136 = var0;
            }
        }
        if (Statics.field1991 < var2) {
            Statics.field1991 += Statics.field889 * (var2 - Statics.field1991) / 1000 + Statics.field1306;
            if (Statics.field1991 > var2) {
                Statics.field1991 = var2;
            }
        }
        if (Statics.field1991 > var2) {
            Statics.field1991 -= Statics.field889 * (Statics.field1991 - var2) / 1000 + Statics.field1306;
            if (Statics.field1991 < var2) {
                Statics.field1991 = var2;
            }
        }
        if (Statics.field829 < var1) {
            Statics.field829 += Statics.field889 * (var1 - Statics.field829) / 1000 + Statics.field1306;
            if (Statics.field829 > var1) {
                Statics.field829 = var1;
            }
        }
        if (Statics.field829 > var1) {
            Statics.field829 -= Statics.field889 * (Statics.field829 - var1) / 1000 + Statics.field1306;
            if (Statics.field829 < var1) {
                Statics.field829 = var1;
            }
        }
        int var3 = Statics.field1299 * 128 + 64;
        int var4 = Statics.field289 * 128 + 64;
        int var5 = method6155(var3, var4, Statics.field3731) - Statics.field986;
        int var6 = var3 - Statics.field2136;
        int var7 = var5 - Statics.field1991;
        int var8 = var4 - Statics.field829;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1411 < var10) {
            Statics.field1411 += Statics.field2485 * (var10 - Statics.field1411) / 1000 + Statics.field3222;
            if (Statics.field1411 > var10) {
                Statics.field1411 = var10;
            }
        }
        if (Statics.field1411 > var10) {
            Statics.field1411 -= Statics.field2485 * (Statics.field1411 - var10) / 1000 + Statics.field3222;
            if (Statics.field1411 < var10) {
                Statics.field1411 = var10;
            }
        }
        int var12 = var11 - Statics.field2069;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2069 += Statics.field2485 * var12 / 1000 + Statics.field3222;
            Statics.field2069 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2069 -= Statics.field2485 * -var12 / 1000 + Statics.field3222;
            Statics.field2069 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2069;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2069 = var11;
        }
    }

    @ObfuscatedName("ek.gi(Lct;II)V")
    public static final void method2528(class85 arg0, int arg1) {
        if (arg0.field1132 >= field555) {
            int var2 = Math.max(1, arg0.field1132 - field555);
            int var3 = arg0.field1088 * 64 + arg0.field1084 * 128;
            int var4 = arg0.field1101 * 128 + arg0.field1088 * 64;
            arg0.field1092 += (var3 - arg0.field1092) / var2;
            arg0.field1085 += (var4 - arg0.field1085) / var2;
            arg0.field1086 = 0;
            arg0.field1137 = arg0.field1134;
        } else if (arg0.field1133 >= field555) {
            if (field555 == arg0.field1133 || arg0.field1118 == -1 || arg0.field1121 != 0 || arg0.field1120 + 1 > class172.method589(arg0.field1118).field1955[arg0.field1119]) {
                int var5 = arg0.field1133 - arg0.field1132;
                int var6 = field555 - arg0.field1132;
                int var7 = arg0.field1088 * 64 + arg0.field1084 * 128;
                int var8 = arg0.field1101 * 128 + arg0.field1088 * 64;
                int var9 = arg0.field1129 * 128 + arg0.field1088 * 64;
                int var10 = arg0.field1131 * 128 + arg0.field1088 * 64;
                arg0.field1092 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1085 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1086 = 0;
            arg0.field1137 = arg0.field1134;
            arg0.field1089 = arg0.field1137;
        } else {
            method2557(arg0);
        }
        if (arg0.field1092 < 128 || arg0.field1085 < 128 || arg0.field1092 >= 13184 || arg0.field1085 >= 13184) {
            arg0.field1118 = -1;
            arg0.field1123 = -1;
            arg0.field1132 = 0;
            arg0.field1133 = 0;
            arg0.field1092 = arg0.field1091[0] * 128 + arg0.field1088 * 64;
            arg0.field1085 = arg0.field1144[0] * 128 + arg0.field1088 * 64;
            arg0.method2054();
        }
        if (Statics.field1674 == arg0 && (arg0.field1092 < 1536 || arg0.field1085 < 1536 || arg0.field1092 >= 11776 || arg0.field1085 >= 11776)) {
            arg0.field1118 = -1;
            arg0.field1123 = -1;
            arg0.field1132 = 0;
            arg0.field1133 = 0;
            arg0.field1092 = arg0.field1091[0] * 128 + arg0.field1088 * 64;
            arg0.field1085 = arg0.field1144[0] * 128 + arg0.field1088 * 64;
            arg0.method2054();
        }
        method3494(arg0);
        method4219(arg0);
    }

    @ObfuscatedName("ep.gd(Lct;I)V")
    public static final void method2557(class85 arg0) {
        arg0.field1115 = arg0.field1090;
        if (arg0.field1122 == 0) {
            arg0.field1086 = 0;
            return;
        }
        if (arg0.field1118 != -1 && arg0.field1121 == 0) {
            class172 var1 = class172.method589(arg0.field1118);
            if (arg0.field1145 > 0 && var1.field1964 == 0) {
                arg0.field1086++;
                return;
            }
            if (arg0.field1145 <= 0 && var1.field1957 == 0) {
                arg0.field1086++;
                return;
            }
        }
        int var2 = arg0.field1092;
        int var3 = arg0.field1085;
        int var4 = arg0.field1091[arg0.field1122 - 1] * 128 + arg0.field1088 * 64;
        int var5 = arg0.field1144[arg0.field1122 - 1] * 128 + arg0.field1088 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1137 = 1280;
            } else if (var3 > var5) {
                arg0.field1137 = 1792;
            } else {
                arg0.field1137 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1137 = 768;
            } else if (var3 > var5) {
                arg0.field1137 = 256;
            } else {
                arg0.field1137 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1137 = 1024;
        } else if (var3 > var5) {
            arg0.field1137 = 0;
        }
        byte var6 = arg0.field1143[arg0.field1122 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1092 = var4;
            arg0.field1085 = var5;
            arg0.field1122--;
            if (arg0.field1145 > 0) {
                arg0.field1145--;
            }
            return;
        }
        int var7 = arg0.field1137 - arg0.field1089 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1114;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1094;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1096;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1095;
        }
        if (var8 == -1) {
            var8 = arg0.field1094;
        }
        arg0.field1115 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class91) {
            var10 = ((class91) arg0).field1210.field1735;
        }
        if (var10) {
            if (arg0.field1137 != arg0.field1089 && arg0.field1111 == -1 && arg0.field1139 != 0) {
                var9 = 2;
            }
            if (arg0.field1122 > 2) {
                var9 = 6;
            }
            if (arg0.field1122 > 3) {
                var9 = 8;
            }
            if (arg0.field1086 > 0 && arg0.field1122 > 1) {
                var9 = 8;
                arg0.field1086--;
            }
        } else {
            if (arg0.field1122 > 1) {
                var9 = 6;
            }
            if (arg0.field1122 > 2) {
                var9 = 8;
            }
            if (arg0.field1086 > 0 && arg0.field1122 > 1) {
                var9 = 8;
                arg0.field1086--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1115 == arg0.field1094 && arg0.field1097 != -1) {
            arg0.field1115 = arg0.field1097;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1092 += var9;
                if (arg0.field1092 > var4) {
                    arg0.field1092 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1092 -= var9;
                if (arg0.field1092 < var4) {
                    arg0.field1092 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1085 += var9;
                if (arg0.field1085 > var5) {
                    arg0.field1085 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1085 -= var9;
                if (arg0.field1085 < var5) {
                    arg0.field1085 = var5;
                }
            }
        }
        if (arg0.field1092 == var4 && arg0.field1085 == var5) {
            arg0.field1122--;
            if (arg0.field1145 > 0) {
                arg0.field1145--;
            }
        }
    }

    @ObfuscatedName("gv.go(Lct;I)V")
    public static final void method3494(class85 arg0) {
        if (arg0.field1139 == 0) {
            return;
        }
        if (arg0.field1111 != -1) {
            class85 var1 = null;
            if (arg0.field1111 < 32768) {
                var1 = field510[arg0.field1111];
            } else if (arg0.field1111 >= 32768) {
                var1 = field587[arg0.field1111 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1092 - var1.field1092;
                int var3 = arg0.field1085 - var1.field1085;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1137 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1102) {
                arg0.field1111 = -1;
                arg0.field1102 = false;
            }
        }
        if (arg0.field1113 != -1 && (arg0.field1122 == 0 || arg0.field1086 > 0)) {
            arg0.field1137 = arg0.field1113;
            arg0.field1113 = -1;
        }
        int var4 = arg0.field1137 - arg0.field1089 & 0x7FF;
        if (var4 == 0 && arg0.field1102) {
            arg0.field1111 = -1;
            arg0.field1102 = false;
        }
        if (var4 == 0) {
            arg0.field1138 = 0;
            return;
        }
        arg0.field1138++;
        if (var4 > 1024) {
            arg0.field1089 -= arg0.field1128 ? var4 : arg0.field1139;
            boolean var5 = true;
            if (var4 < arg0.field1139 || var4 > 2048 - arg0.field1139) {
                arg0.field1089 = arg0.field1137;
                var5 = false;
            }
            if (!arg0.field1128 && arg0.field1115 == arg0.field1090 && (arg0.field1138 > 25 || var5)) {
                if (arg0.field1141 == -1) {
                    arg0.field1115 = arg0.field1094;
                } else {
                    arg0.field1115 = arg0.field1141;
                }
            }
        } else {
            arg0.field1089 += arg0.field1128 ? var4 : arg0.field1139;
            boolean var6 = true;
            if (var4 < arg0.field1139 || var4 > 2048 - arg0.field1139) {
                arg0.field1089 = arg0.field1137;
                var6 = false;
            }
            if (!arg0.field1128 && arg0.field1115 == arg0.field1090 && (arg0.field1138 > 25 || var6)) {
                if (arg0.field1112 == -1) {
                    arg0.field1115 = arg0.field1094;
                } else {
                    arg0.field1115 = arg0.field1112;
                }
            }
        }
        arg0.field1089 &= 0x7FF;
        arg0.field1128 = false;
    }

    @ObfuscatedName("ik.gh(Lct;B)V")
    public static final void method4219(class85 arg0) {
        arg0.field1087 = false;
        if (arg0.field1115 != -1) {
            class172 var1 = class172.method589(arg0.field1115);
            if (var1 == null || var1.field1953 == null) {
                arg0.field1115 = -1;
            } else {
                arg0.field1130++;
                if (arg0.field1116 < var1.field1953.length && arg0.field1130 > var1.field1955[arg0.field1116]) {
                    arg0.field1130 = 1;
                    arg0.field1116++;
                    method1776(var1, arg0.field1116, arg0.field1092, arg0.field1085);
                }
                if (arg0.field1116 >= var1.field1953.length) {
                    arg0.field1130 = 0;
                    arg0.field1116 = 0;
                    method1776(var1, arg0.field1116, arg0.field1092, arg0.field1085);
                }
            }
        }
        if (arg0.field1123 != -1 && field555 >= arg0.field1126) {
            if (arg0.field1142 < 0) {
                arg0.field1142 = 0;
            }
            int var2 = class163.method6452(arg0.field1123).field1751;
            if (var2 == -1) {
                arg0.field1123 = -1;
            } else {
                class172 var3 = class172.method589(var2);
                if (var3 == null || var3.field1953 == null) {
                    arg0.field1123 = -1;
                } else {
                    arg0.field1125++;
                    if (arg0.field1142 < var3.field1953.length && arg0.field1125 > var3.field1955[arg0.field1142]) {
                        arg0.field1125 = 1;
                        arg0.field1142++;
                        method1776(var3, arg0.field1142, arg0.field1092, arg0.field1085);
                    }
                    if (arg0.field1142 >= var3.field1953.length && (arg0.field1142 < 0 || arg0.field1142 >= var3.field1953.length)) {
                        arg0.field1123 = -1;
                    }
                }
            }
        }
        if (arg0.field1118 != -1 && arg0.field1121 <= 1) {
            class172 var4 = class172.method589(arg0.field1118);
            if (var4.field1964 == 1 && arg0.field1145 > 0 && arg0.field1132 <= field555 && arg0.field1133 < field555) {
                arg0.field1121 = 1;
                return;
            }
        }
        if (arg0.field1118 != -1 && arg0.field1121 == 0) {
            class172 var5 = class172.method589(arg0.field1118);
            if (var5 == null || var5.field1953 == null) {
                arg0.field1118 = -1;
            } else {
                arg0.field1120++;
                if (arg0.field1119 < var5.field1953.length && arg0.field1120 > var5.field1955[arg0.field1119]) {
                    arg0.field1120 = 1;
                    arg0.field1119++;
                    method1776(var5, arg0.field1119, arg0.field1092, arg0.field1085);
                }
                if (arg0.field1119 >= var5.field1953.length) {
                    arg0.field1119 -= var5.field1961;
                    arg0.field1117++;
                    if (arg0.field1117 >= var5.field1963) {
                        arg0.field1118 = -1;
                    } else if (arg0.field1119 >= 0 && arg0.field1119 < var5.field1953.length) {
                        method1776(var5, arg0.field1119, arg0.field1092, arg0.field1085);
                    } else {
                        arg0.field1118 = -1;
                    }
                }
                arg0.field1087 = var5.field1959;
            }
        }
        if (arg0.field1121 > 0) {
            arg0.field1121--;
        }
    }

    @ObfuscatedName("hq.gn(Lcx;IIB)V")
    public static void method4019(class83 arg0, int arg1, int arg2) {
        if (arg0.field1118 == arg1 && arg1 != -1) {
            int var3 = class172.method589(arg1).field1966;
            if (var3 == 1) {
                arg0.field1119 = 0;
                arg0.field1120 = 0;
                arg0.field1121 = arg2;
                arg0.field1117 = 0;
            }
            if (var3 == 2) {
                arg0.field1117 = 0;
            }
        } else if (arg1 == -1 || arg0.field1118 == -1 || class172.method589(arg1).field1960 >= class172.method589(arg0.field1118).field1960) {
            arg0.field1118 = arg1;
            arg0.field1119 = 0;
            arg0.field1120 = 0;
            arg0.field1121 = arg2;
            arg0.field1117 = 0;
            arg0.field1145 = arg0.field1122;
        }
    }

    @ObfuscatedName("ec.gc(S)I")
    public static int method2524() {
        return field689 ? 2 : 1;
    }

    @ObfuscatedName("ho.gb(B)V")
    public static void method4024() {
        class242 var0 = class242.method3564(class240.field2746, field562.field1277);
        var0.field2792.method6223(method2524());
        var0.field2792.method6224(Statics.field184);
        var0.field2792.method6224(Statics.field137);
        field562.method2269(var0);
    }

    @ObfuscatedName("client.k(I)V")
    public final void method556() {
        field688 = class398.method2381() + 500L;
        this.method1427();
        if (field631 != -1) {
            this.method1105(true);
        }
    }

    @ObfuscatedName("client.gp(B)V")
    public void method1427() {
        int var1 = Statics.field184;
        int var2 = Statics.field137;
        if (this.field201 < var1) {
            int var3 = this.field201;
        }
        if (this.field181 < var2) {
            int var4 = this.field181;
        }
        if (Statics.field4363 != null) {
            try {
                class28.method386(Statics.field983, "resize", new Object[] { method2524() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gg(I)V")
    public final void method1100() {
        if (field631 != -1) {
            method4643(field631);
        }
        for (int var1 = 0; var1 < field672; var1++) {
            if (field595[var1]) {
                field554[var1] = true;
            }
            field652[var1] = field595[var1];
            field595[var1] = false;
        }
        field679 = field555;
        field641 = -1;
        field617 = -1;
        Statics.field3276 = null;
        if (field631 != -1) {
            field672 = 0;
            method2799(field631, 0, 0, Statics.field184, Statics.field137, 0, 0, -1);
        }
        class410.method6518();
        if (field576) {
            if (field701 == 1) {
                Statics.field1328[field574 / 100].method6645(field597 - 8, field609 - 8);
            }
            if (field701 == 2) {
                Statics.field1328[field574 / 100 + 4].method6645(field597 - 8, field609 - 8);
            }
        }
        if (field607) {
            method1071();
        } else if (field641 != -1) {
            method1878(field641, field617);
        }
        if (field687 == 3) {
            for (int var2 = 0; var2 < field672; var2++) {
                if (field652[var2]) {
                    class410.method6526(field683[var2], field684[var2], field691[var2], field516[var2], 16711935, 128);
                } else if (field554[var2]) {
                    class410.method6526(field683[var2], field684[var2], field691[var2], field516[var2], 16711680, 128);
                }
            }
        }
        class63.method2507(Statics.field3731, Statics.field1674.field1092, Statics.field1674.field1085, field532);
        field532 = 0;
    }

    @ObfuscatedName("cg.ga(Ljava/lang/String;ZI)V")
    public static final void method2149(String arg0, boolean arg1) {
        if (!field586) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field12.method5215(arg0, 250);
        int var6 = Statics.field12.method5216(arg0, 250) * 13;
        class410.method6580(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class410.method6530(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field12.method5169(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field672; var11++) {
            if (field691[var11] + field683[var11] > var7 && field683[var11] < var7 + var9 && field684[var11] + field516[var11] > var8 && field684[var11] < var8 + var10) {
                field595[var11] = true;
            }
        }
        if (arg1) {
            Statics.field146.method409(0, 0);
        } else {
            method4943(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bi.gs(IIIII)V")
    public static final void method1864(int arg0, int arg1, int arg2, int arg3) {
        field569++;
        if (Statics.field1674.field1092 >> 7 == field707 && Statics.field1674.field1085 >> 7 == field678) {
            field707 = 0;
        }
        method2841();
        method4163();
        method2499(true);
        method2365();
        method2499(false);
        for (class70 var4 = (class70) field615.method4981(); var4 != null; var4 = (class70) field615.method4987()) {
            if (Statics.field3731 != var4.field892 || field555 > var4.field898) {
                var4.method5752();
            } else if (field555 >= var4.field897) {
                if (var4.field893 > 0) {
                    class91 var5 = field510[var4.field893 - 1];
                    if (var5 != null && var5.field1092 >= 0 && var5.field1092 < 13312 && var5.field1085 >= 0 && var5.field1085 < 13312) {
                        var4.method1857(var5.field1092, var5.field1085, method6155(var5.field1092, var5.field1085, var4.field892) - var4.field895, field555);
                    }
                }
                if (var4.field893 < 0) {
                    int var6 = -var4.field893 - 1;
                    class83 var7;
                    if (field718 == var6) {
                        var7 = Statics.field1674;
                    } else {
                        var7 = field587[var6];
                    }
                    if (var7 != null && var7.field1092 >= 0 && var7.field1092 < 13312 && var7.field1085 >= 0 && var7.field1085 < 13312) {
                        var4.method1857(var7.field1092, var7.field1085, method6155(var7.field1092, var7.field1085, var4.field892) - var4.field895, field555);
                    }
                }
                var4.method1863(field532);
                Statics.field3291.method3914(Statics.field3731, (int) var4.field903, (int) var4.field896, (int) var4.field905, 60, var4, var4.field911, -1L, false);
            }
        }
        method2694();
        method4467(arg0, arg1, arg2, arg3, true);
        int var8 = field500;
        int var9 = field708;
        int var10 = field627;
        int var11 = field735;
        class410.method6519(var8, var9, var8 + var10, var9 + var11);
        class211.method3808();
        if (!field692) {
            int var12 = field483;
            if (field557 / 256 > var12) {
                var12 = field557 / 256;
            }
            if (field719[4] && field599[4] + 128 > var12) {
                var12 = field599[4] + 128;
            }
            int var13 = field541 & 0x7FF;
            int var14 = Statics.field3865;
            int var15 = Statics.field943;
            int var16 = Statics.field86;
            int var19 = var12 * 3 + 600;
            method1858(var14, var15, var16, var12, var13, var19, var11);
        }
        int var32;
        if (field692) {
            var32 = method396();
        } else {
            int var20;
            if (Statics.field4363.field1184) {
                var20 = Statics.field3731;
            } else {
                label502: {
                    int var21 = 3;
                    if (Statics.field1411 < 310) {
                        int var22;
                        int var23;
                        if (field546 == 1) {
                            var22 = Statics.field3865 >> 7;
                            var23 = Statics.field86 >> 7;
                        } else {
                            var22 = Statics.field1674.field1092 >> 7;
                            var23 = Statics.field1674.field1085 >> 7;
                        }
                        int var24 = Statics.field2136 >> 7;
                        int var25 = Statics.field829 >> 7;
                        if (var24 < 0 || var25 < 0 || var24 >= 104 || var25 >= 104) {
                            var20 = Statics.field3731;
                            break label502;
                        }
                        if (var22 < 0 || var23 < 0 || var22 >= 104 || var23 >= 104) {
                            var20 = Statics.field3731;
                            break label502;
                        }
                        if ((class75.field955[Statics.field3731][var24][var25] & 0x4) != 0) {
                            var21 = Statics.field3731;
                        }
                        int var26;
                        if (var22 > var24) {
                            var26 = var22 - var24;
                        } else {
                            var26 = var24 - var22;
                        }
                        int var27;
                        if (var23 > var25) {
                            var27 = var23 - var25;
                        } else {
                            var27 = var25 - var23;
                        }
                        if (var26 > var27) {
                            int var28 = var27 * 65536 / var26;
                            int var29 = 32768;
                            while (var22 != var24) {
                                if (var24 < var22) {
                                    var24++;
                                } else if (var24 > var22) {
                                    var24--;
                                }
                                if ((class75.field955[Statics.field3731][var24][var25] & 0x4) != 0) {
                                    var21 = Statics.field3731;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var25 < var23) {
                                        var25++;
                                    } else if (var25 > var23) {
                                        var25--;
                                    }
                                    if ((class75.field955[Statics.field3731][var24][var25] & 0x4) != 0) {
                                        var21 = Statics.field3731;
                                    }
                                }
                            }
                        } else if (var27 > 0) {
                            int var30 = var26 * 65536 / var27;
                            int var31 = 32768;
                            while (var23 != var25) {
                                if (var25 < var23) {
                                    var25++;
                                } else if (var25 > var23) {
                                    var25--;
                                }
                                if ((class75.field955[Statics.field3731][var24][var25] & 0x4) != 0) {
                                    var21 = Statics.field3731;
                                }
                                var31 += var30;
                                if (var31 >= 65536) {
                                    var31 -= 65536;
                                    if (var24 < var22) {
                                        var24++;
                                    } else if (var24 > var22) {
                                        var24--;
                                    }
                                    if ((class75.field955[Statics.field3731][var24][var25] & 0x4) != 0) {
                                        var21 = Statics.field3731;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1674.field1092 >= 0 && Statics.field1674.field1085 >= 0 && Statics.field1674.field1092 < 13312 && Statics.field1674.field1085 < 13312) {
                        if ((class75.field955[Statics.field3731][Statics.field1674.field1092 >> 7][Statics.field1674.field1085 >> 7] & 0x4) != 0) {
                            var21 = Statics.field3731;
                        }
                        var20 = var21;
                    } else {
                        var20 = Statics.field3731;
                    }
                }
            }
            var32 = var20;
        }
        int var33 = Statics.field2136;
        int var34 = Statics.field1991;
        int var35 = Statics.field829;
        int var36 = Statics.field1411;
        int var37 = Statics.field2069;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field719[var38]) {
                int var39 = (int) (Math.random() * (double) (field720[var38] * 2 + 1) - (double) field720[var38] + Math.sin((double) field722[var38] / 100.0D * (double) field723[var38]) * (double) field599[var38]);
                if (var38 == 0) {
                    Statics.field2136 += var39;
                }
                if (var38 == 1) {
                    Statics.field1991 += var39;
                }
                if (var38 == 2) {
                    Statics.field829 += var39;
                }
                if (var38 == 3) {
                    Statics.field2069 = Statics.field2069 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field1411 += var39;
                    if (Statics.field1411 < 128) {
                        Statics.field1411 = 128;
                    }
                    if (Statics.field1411 > 383) {
                        Statics.field1411 = 383;
                    }
                }
            }
        }
        int var40 = class33.field212;
        int var41 = class33.field221;
        if (class33.field219 != 0) {
            var40 = class33.field220;
            var41 = class33.field224;
        }
        if (var40 >= var8 && var40 < var8 + var10 && var41 >= var9 && var41 < var9 + var11) {
            Statics.method3524(var40 - var8, var41 - var9);
        } else {
            class221.field2584 = false;
            class221.field2587 = 0;
        }
        Statics.method178();
        class410.method6580(var8, var9, var10, var11, 0);
        Statics.method178();
        int var42 = class211.field2364;
        class211.field2364 = field736;
        Statics.field3291.method3868(Statics.field2136, Statics.field1991, Statics.field829, Statics.field1411, Statics.field2069, var32);
        class211.field2364 = var42;
        Statics.method178();
        Statics.field3291.method3841();
        field558 = 0;
        boolean var43 = false;
        int var44 = -1;
        int var45 = -1;
        int var46 = class96.field1244;
        int[] var47 = class96.field1239;
        for (int var48 = 0; var48 < field511 + var46; var48++) {
            class85 var49;
            if (var48 < var46) {
                var49 = field587[var47[var48]];
                if (field748 == var47[var48]) {
                    var43 = true;
                    var44 = var48;
                    continue;
                }
                if (Statics.field1674 == var49) {
                    var45 = var48;
                    continue;
                }
            } else {
                var49 = field510[field611[var48 - var46]];
            }
            Statics.method6049(var49, var48, var8, var9, var10, var11);
        }
        if (field590 && var45 != -1) {
            Statics.method6049(Statics.field1674, var45, var8, var9, var10, var11);
        }
        if (var43) {
            Statics.method6049(field587[field748], var44, var8, var9, var10, var11);
        }
        for (int var50 = 0; var50 < field558; var50++) {
            int var51 = field560[var50];
            int var52 = field561[var50];
            int var53 = field563[var50];
            int var54 = field462[var50];
            boolean var55 = true;
            while (var55) {
                var55 = false;
                for (int var56 = 0; var56 < var50; var56++) {
                    if (var52 + 2 > field561[var56] - field462[var56] && var52 - var54 < field561[var56] + 2 && var51 - var53 < field563[var56] + field560[var56] && var51 + var53 > field560[var56] - field563[var56] && field561[var56] - field462[var56] < var52) {
                        var52 = field561[var56] - field462[var56];
                        var55 = true;
                    }
                }
            }
            field570 = field560[var50];
            field571 = field561[var50] = var52;
            String var57 = field567[var50];
            if (field559 == 0) {
                int var58 = 16776960;
                if (field564[var50] < 6) {
                    var58 = field690[field564[var50]];
                }
                if (field564[var50] == 6) {
                    var58 = field569 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field564[var50] == 7) {
                    var58 = field569 % 20 < 10 ? 255 : 65535;
                }
                if (field564[var50] == 8) {
                    var58 = field569 % 20 < 10 ? 45056 : 8454016;
                }
                if (field564[var50] == 9) {
                    int var59 = 150 - field549[var50];
                    if (var59 < 50) {
                        var58 = var59 * 1280 + 16711680;
                    } else if (var59 < 100) {
                        var58 = 16776960 - (var59 - 50) * 327680;
                    } else if (var59 < 150) {
                        var58 = (var59 - 100) * 5 + 65280;
                    }
                }
                if (field564[var50] == 10) {
                    int var60 = 150 - field549[var50];
                    if (var60 < 50) {
                        var58 = var60 * 5 + 16711680;
                    } else if (var60 < 100) {
                        var58 = 16711935 - (var60 - 50) * 327680;
                    } else if (var60 < 150) {
                        var58 = (var60 - 100) * 327680 + 255 - (var60 - 100) * 5;
                    }
                }
                if (field564[var50] == 11) {
                    int var61 = 150 - field549[var50];
                    if (var61 < 50) {
                        var58 = 16777215 - var61 * 327685;
                    } else if (var61 < 100) {
                        var58 = (var61 - 50) * 327685 + 65280;
                    } else if (var61 < 150) {
                        var58 = 16777215 - (var61 - 100) * 327680;
                    }
                }
                if (field565[var50] == 0) {
                    Statics.field888.method5168(var57, field570 + var8, field571 + var9, var58, 0);
                }
                if (field565[var50] == 1) {
                    Statics.field888.method5170(var57, field570 + var8, field571 + var9, var58, 0, field569);
                }
                if (field565[var50] == 2) {
                    Statics.field888.method5171(var57, field570 + var8, field571 + var9, var58, 0, field569);
                }
                if (field565[var50] == 3) {
                    Statics.field888.method5172(var57, field570 + var8, field571 + var9, var58, 0, field569, 150 - field549[var50]);
                }
                if (field565[var50] == 4) {
                    int var62 = (150 - field549[var50]) * (Statics.field888.method5159(var57) + 100) / 150;
                    class410.method6590(field570 + var8 - 50, var9, field570 + var8 + 50, var9 + var11);
                    Statics.field888.method5165(var57, field570 + var8 + 50 - var62, field571 + var9, var58, 0);
                    class410.method6519(var8, var9, var8 + var10, var9 + var11);
                }
                if (field565[var50] == 5) {
                    int var63 = 150 - field549[var50];
                    int var64 = 0;
                    if (var63 < 25) {
                        var64 = var63 - 25;
                    } else if (var63 > 125) {
                        var64 = var63 - 125;
                    }
                    class410.method6590(var8, field571 + var9 - Statics.field888.field3826 - 1, var8 + var10, field571 + var9 + 5);
                    Statics.field888.method5168(var57, field570 + var8, field571 + var9 + var64, var58, 0);
                    class410.method6519(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field888.method5168(var57, field570 + var8, field571 + var9, 16776960, 0);
            }
        }
        if (field706 == 2) {
            method5655((field729 - Statics.field92 << 7) + field488, (field504 - Statics.field4007 << 7) + field645, field487 * 2);
            if (field570 > -1 && field555 % 20 < 10) {
                Statics.field142[0].method6645(field570 + var8 - 12, field571 + var9 - 28);
            }
        }
        ((class218) Statics.field2369).method4037(field532);
        method6159(var8, var9, var10, var11);
        Statics.field2136 = var33;
        Statics.field1991 = var34;
        Statics.field829 = var35;
        Statics.field1411 = var36;
        Statics.field2069 = var37;
        if (field473) {
            byte var65 = 0;
            int var66 = class291.field3717 + class291.field3710 + var65;
            if (var66 == 0) {
                field473 = false;
            }
        }
        if (field473) {
            class410.method6580(var8, var9, var10, var11, 0);
            method2149(class283.field3438, false);
        }
    }

    @ObfuscatedName("iw.gz(IIIIZI)V")
    public static final void method4467(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field465;
        } else if (var5 >= 100) {
            var6 = field551;
        } else {
            var6 = (field551 - field465) * var5 / 100 + field465;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field730) {
            short var8 = field730;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field601) {
                var6 = field601;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class410.method6518();
                    class410.method6580(arg0, arg1, var10, arg3, -16777216);
                    class410.method6580(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field731) {
            short var11 = field731;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field728) {
                var6 = field728;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class410.method6518();
                    class410.method6580(arg0, arg1, arg2, var13, -16777216);
                    class410.method6580(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field736 = arg3 * var6 / 334;
        if (field627 != arg2 || field735 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class211.field2362[var16];
                int var20 = method2661(var17, arg3);
                var14[var15] = var19 * var20 >> 16;
            }
            class213.method3862(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field500 = arg0;
        field708 = arg1;
        field627 = arg2;
        field735 = arg3;
    }

    @ObfuscatedName("fg.gr(I)V")
    public static void method2841() {
        if (field590) {
            method2510(Statics.field1674, false);
        }
    }

    @ObfuscatedName("hp.gf(I)V")
    public static void method4163() {
        if (field748 >= 0 && field587[field748] != null) {
            method2510(field587[field748], false);
        }
    }

    @ObfuscatedName("dn.gm(S)V")
    public static void method2365() {
        int var0 = class96.field1244;
        int[] var1 = class96.field1239;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field748 != var1[var2] && field718 != var1[var2]) {
                method2510(field587[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("eu.gu(Lcx;ZI)V")
    public static void method2510(class83 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2005() || arg0.field1062) {
            return;
        }
        arg0.field1060 = false;
        if ((field467 && class96.field1244 > 50 || class96.field1244 > 200) && arg1 && arg0.field1115 == arg0.field1090) {
            arg0.field1060 = true;
        }
        int var2 = arg0.field1092 >> 7;
        int var3 = arg0.field1085 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class221.method6189(0, 0, 0, false, arg0.field1064);
        if (arg0.field1067 != null && field555 >= arg0.field1050 && field555 < arg0.field1051) {
            arg0.field1060 = false;
            arg0.field1049 = method6155(arg0.field1092, arg0.field1085, Statics.field3731);
            arg0.field1140 = field555;
            Statics.field3291.method3839(Statics.field3731, arg0.field1092, arg0.field1085, arg0.field1049, 60, arg0, arg0.field1089, var4, arg0.field1056, arg0.field1057, arg0.field1045, arg0.field1059);
            return;
        }
        if ((arg0.field1092 & 0x7F) == 64 && (arg0.field1085 & 0x7F) == 64) {
            if (field569 == field547[var2][var3]) {
                return;
            }
            field547[var2][var3] = field569;
        }
        arg0.field1049 = method6155(arg0.field1092, arg0.field1085, Statics.field3731);
        arg0.field1140 = field555;
        Statics.field3291.method3914(Statics.field3731, arg0.field1092, arg0.field1085, arg0.field1049, 60, arg0, arg0.field1089, var4, arg0.field1087);
    }

    @ObfuscatedName("dm.gx(ZI)V")
    public static final void method2499(boolean arg0) {
        for (int var1 = 0; var1 < field511; var1++) {
            class91 var2 = field510[field611[var1]];
            if (var2 != null && var2.method2005() && var2.field1210.field1726 == arg0 && var2.field1210.method2809()) {
                int var3 = var2.field1092 >> 7;
                int var4 = var2.field1085 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1088 == 1 && (var2.field1092 & 0x7F) == 64 && (var2.field1085 & 0x7F) == 64) {
                        if (field569 == field547[var3][var4]) {
                            continue;
                        }
                        field547[var3][var4] = field569;
                    }
                    long var5 = class221.method6189(0, 0, 1, !var2.field1210.field1734, field611[var1]);
                    var2.field1140 = field555;
                    Statics.field3291.method3914(Statics.field3731, var2.field1092, var2.field1085, method6155(var2.field1092 + (var2.field1088 * 64 - 64), var2.field1085 + (var2.field1088 * 64 - 64), Statics.field3731), var2.field1088 * 64 - 64 + 60, var2, var2.field1089, var5, var2.field1087);
                }
            }
        }
    }

    @ObfuscatedName("ef.gj(I)V")
    public static final void method2694() {
        for (class65 var0 = (class65) field602.method4981(); var0 != null; var0 = (class65) field602.method4987()) {
            if (Statics.field3731 != var0.field806 || var0.field813) {
                var0.method5752();
            } else if (field555 >= var0.field804) {
                var0.method1806(field532);
                if (var0.field813) {
                    var0.method5752();
                } else {
                    Statics.field3291.method3914(var0.field806, var0.field807, var0.field817, var0.field808, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("aq.ge(I)I")
    public static final int method396() {
        if (Statics.field4363.field1184) {
            return Statics.field3731;
        } else {
            int var0 = method6155(Statics.field2136, Statics.field829, Statics.field3731);
            return var0 - Statics.field1991 >= 800 || (class75.field955[Statics.field3731][Statics.field2136 >> 7][Statics.field829 >> 7] & 0x4) == 0 ? 3 : Statics.field3731;
        }
    }

    @ObfuscatedName("bf.gw(I)Z")
    public static boolean method1072() {
        return (field591 & 0x2) != 0;
    }

    @ObfuscatedName("dj.gk(I)V")
    public static final void method2396() {
        field540 = 0;
        int var0 = (Statics.field1674.field1092 >> 7) + Statics.field92;
        int var1 = (Statics.field1674.field1085 >> 7) + Statics.field4007;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field540 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field540 = 1;
        }
        if (field540 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field540 = 0;
        }
    }

    @ObfuscatedName("on.gq(IIIII)V")
    public static final void method6159(int arg0, int arg1, int arg2, int arg3) {
        method2396();
    }

    @ObfuscatedName("mq.gt(IIII)V")
    public static final void method5655(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field570 = -1;
            field571 = -1;
            return;
        }
        int var3 = method6155(arg0, arg1, Statics.field3731) - arg2;
        int var4 = arg0 - Statics.field2136;
        int var5 = var3 - Statics.field1991;
        int var6 = arg1 - Statics.field829;
        int var7 = class211.field2362[Statics.field1411];
        int var8 = class211.field2370[Statics.field1411];
        int var9 = class211.field2362[Statics.field2069];
        int var10 = class211.field2370[Statics.field2069];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field570 = field736 * var11 / var15 + field627 / 2;
            field571 = field736 * var14 / var15 + field735 / 2;
        } else {
            field570 = -1;
            field571 = -1;
        }
    }

    @ObfuscatedName("og.he(IIIB)I")
    public static final int method6155(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field955[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field969[var5][var3][var4] + class75.field969[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field969[var5][var3][var4 + 1] + class75.field969[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ey.hm(III)I")
    public static int method2661(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field598 - field726) * var2 / 100 + field726;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("bi.hx(IIIIIIII)V")
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method2661(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class211.field2362[var8];
            int var14 = class211.field2370[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class211.field2362[var9];
            int var17 = class211.field2370[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        Statics.field2136 = arg0 - var10;
        Statics.field1991 = arg1 - var11;
        Statics.field829 = arg2 - var12;
        Statics.field1411 = arg3;
        Statics.field2069 = arg4;
        if (field546 == 1 && field640 >= 2 && field555 % 50 == 0 && (Statics.field3865 >> 7 != Statics.field1674.field1092 >> 7 || Statics.field86 >> 7 != Statics.field1674.field1085 >> 7)) {
            int var19 = Statics.field1674.field1063;
            int var20 = (Statics.field3865 >> 7) + Statics.field92;
            int var21 = (Statics.field86 >> 7) + Statics.field4007;
            method2676(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("v.ha(ZLoj;I)V")
    public static final void method360(boolean arg0, class400 arg1) {
        field481 = arg0;
        if (!field481) {
            int var2 = arg1.method6394();
            int var3 = arg1.method6278();
            int var4 = arg1.method6242();
            Statics.field527 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field527[var5][var6] = arg1.method6245();
                }
            }
            Statics.field1155 = new int[var4];
            Statics.field1398 = new int[var4];
            Statics.field102 = new int[var4];
            Statics.field3806 = new byte[var4][];
            Statics.field2098 = new byte[var4][];
            boolean var7 = false;
            if (field620) {
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
                        Statics.field1155[var8] = var11;
                        Statics.field1398[var8] = Statics.field50.method4759("m" + var9 + "_" + var10);
                        Statics.field102[var8] = Statics.field50.method4759("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2797(var3, var2, true);
            return;
        }
        int var12 = arg1.method6394();
        int var13 = arg1.method6242();
        boolean var14 = arg1.method6240() == 1;
        int var15 = arg1.method6242();
        arg1.method6188();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6194(1);
                    if (var19 == 1) {
                        field530[var16][var17][var18] = arg1.method6194(26);
                    } else {
                        field530[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6190();
        Statics.field527 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field527[var20][var21] = arg1.method6245();
            }
        }
        Statics.field1155 = new int[var15];
        Statics.field1398 = new int[var15];
        Statics.field102 = new int[var15];
        Statics.field3806 = new byte[var15][];
        Statics.field2098 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field530[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1155[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1155[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1398[var22] = Statics.field50.method4759("m" + var31 + "_" + var32);
                            Statics.field102[var22] = Statics.field50.method4759("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2797(var12, var13, !var14);
    }

    @ObfuscatedName("fi.hf(IIZB)V")
    public static final void method2797(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2244 == arg0 && Statics.field2631 == arg1) {
            return;
        }
        Statics.field2244 = arg0;
        Statics.field2631 = arg1;
        method3496(25);
        method2149(class283.field3438, true);
        int var3 = Statics.field92;
        int var4 = Statics.field4007;
        Statics.field92 = (arg0 - 6) * 8;
        Statics.field4007 = (arg1 - 6) * 8;
        int var5 = Statics.field92 - var3;
        int var6 = Statics.field4007 - var4;
        int var7 = Statics.field92;
        int var8 = Statics.field4007;
        for (int var9 = 0; var9 < 32768; var9++) {
            class91 var10 = field510[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1091[var11] -= var5;
                    var10.field1144[var11] -= var6;
                }
                var10.field1092 -= var5 * 128;
                var10.field1085 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class83 var13 = field587[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1091[var14] -= var5;
                    var13.field1144[var14] -= var6;
                }
                var13.field1092 -= var5 * 128;
                var13.field1085 -= var6 * 128;
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
                        field636[var25][var21][var22] = field636[var25][var23][var24];
                    } else {
                        field636[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class84 var26 = (class84) field600.method4981(); var26 != null; var26 = (class84) field600.method4987()) {
            var26.field1081 -= var5;
            var26.field1074 -= var6;
            if (var26.field1081 < 0 || var26.field1074 < 0 || var26.field1081 >= 104 || var26.field1074 >= 104) {
                var26.method5752();
            }
        }
        if (field707 != 0) {
            field707 -= var5;
            field678 -= var6;
        }
        field712 = 0;
        field692 = false;
        Statics.field2136 -= var5 << 7;
        Statics.field829 -= var6 << 7;
        Statics.field3865 -= var5 << 7;
        Statics.field86 -= var6 << 7;
        field702 = -1;
        field602.method4989();
        field615.method4989();
        for (int var27 = 0; var27 < 4; var27++) {
            field594[var27].method3146();
        }
    }

    @ObfuscatedName("bu.hj(ZI)V")
    public static final void method1816(boolean arg0) {
        Statics.method178();
        field562.field1273++;
        if (field562.field1273 < 50 && !arg0) {
            return;
        }
        field562.field1273 = 0;
        if (field517 || field562.method2273() == null) {
            return;
        }
        class242 var1 = class242.method3564(class240.field2727, field562.field1277);
        field562.method2269(var1);
        try {
            field562.method2278();
        } catch (IOException var3) {
            field517 = true;
        }
    }

    @ObfuscatedName("du.hq(IIIIII)V")
    public static final void method2380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3291.method3853(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3291.method3857(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class221.method3654(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field40.field4396;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class221.method300(var5);
            class169 var14 = Statics.method2740(var13);
            if (var14.field1871 == -1) {
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
                class413 var15 = Statics.field3972[var14.field1871];
                if (var15 != null) {
                    int var16 = (var14.field1828 * 4 - var15.field4387) / 2;
                    int var17 = (var14.field1840 * 4 - var15.field4388) / 2;
                    var15.method6611(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field1840) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3291.method3855(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3291.method3857(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class221.method300(var18);
            class169 var24 = Statics.method2740(var23);
            if (var24.field1871 != -1) {
                class413 var25 = Statics.field3972[var24.field1871];
                if (var25 != null) {
                    int var26 = (var24.field1828 * 4 - var25.field4387) / 2;
                    int var27 = (var24.field1840 * 4 - var25.field4388) / 2;
                    var25.method6611(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field1840) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class221.method3654(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field40.field4396;
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
        long var31 = Statics.field3291.method3856(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class221.method300(var31);
        class169 var34 = Statics.method2740(var33);
        if (var34.field1871 == -1) {
            return;
        }
        class413 var35 = Statics.field3972[var34.field1871];
        if (var35 != null) {
            int var36 = (var34.field1828 * 4 - var35.field4387) / 2;
            int var37 = (var34.field1840 * 4 - var35.field4388) / 2;
            var35.method6611(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field1840) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.ho(Lcv;I)Z")
    public final boolean method1101(class99 arg0) {
        class344 var2 = arg0.method2273();
        class400 var3 = arg0.field1280;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1279 == null) {
                if (arg0.field1281) {
                    if (!var2.method2616(1)) {
                        return false;
                    }
                    var2.method2617(arg0.field1280.field4302, 0, 1);
                    arg0.field1276 = 0;
                    arg0.field1281 = false;
                }
                var3.field4300 = 0;
                if (var3.method6186()) {
                    if (!var2.method2616(1)) {
                        return false;
                    }
                    var2.method2617(arg0.field1280.field4302, 1, 1);
                    arg0.field1276 = 0;
                }
                arg0.field1281 = true;
                class243[] var4 = class243.method2502();
                int var5 = var3.method6184();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4300);
                }
                arg0.field1279 = var4[var5];
                arg0.field1282 = arg0.field1279.field2849;
            }
            if (arg0.field1282 == -1) {
                if (!var2.method2616(1)) {
                    return false;
                }
                arg0.method2273().method2617(var3.field4302, 0, 1);
                arg0.field1282 = var3.field4302[0] & 0xFF;
            }
            if (arg0.field1282 == -2) {
                if (!var2.method2616(2)) {
                    return false;
                }
                arg0.method2273().method2617(var3.field4302, 0, 2);
                var3.field4300 = 0;
                arg0.field1282 = var3.method6242();
            }
            if (!var2.method2616(arg0.field1282)) {
                return false;
            }
            var3.field4300 = 0;
            var2.method2617(var3.field4302, 0, arg0.field1282);
            arg0.field1276 = 0;
            field520.method5381();
            arg0.field1286 = arg0.field1285;
            arg0.field1285 = arg0.field1278;
            arg0.field1278 = arg0.field1279;
            if (class243.field2866 == arg0.field1279) {
                int var6 = var3.method6271();
                int var7 = var3.method6270();
                String var8 = var3.method6335();
                if (var6 >= 1 && var6 <= 8) {
                    if (var8.equalsIgnoreCase(class283.field3566)) {
                        var8 = null;
                    }
                    field685[var6 - 1] = var8;
                    field596[var6 - 1] = var7 == 0;
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2807 == arg0.field1279) {
                field692 = true;
                Statics.field1299 = var3.method6240();
                Statics.field289 = var3.method6240();
                Statics.field986 = var3.method6242();
                Statics.field3222 = var3.method6240();
                Statics.field2485 = var3.method6240();
                if (Statics.field2485 >= 100) {
                    int var9 = Statics.field1299 * 128 + 64;
                    int var10 = Statics.field289 * 128 + 64;
                    int var11 = method6155(var9, var10, Statics.field3731) - Statics.field986;
                    int var12 = var9 - Statics.field2136;
                    int var13 = var11 - Statics.field1991;
                    int var14 = var10 - Statics.field829;
                    int var15 = (int) Math.sqrt((double) (var12 * var12 + var14 * var14));
                    Statics.field1411 = (int) (Math.atan2((double) var13, (double) var15) * 325.949D) & 0x7FF;
                    Statics.field2069 = (int) (Math.atan2((double) var12, (double) var14) * -325.949D) & 0x7FF;
                    if (Statics.field1411 < 128) {
                        Statics.field1411 = 128;
                    }
                    if (Statics.field1411 > 383) {
                        Statics.field1411 = 383;
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2806 == arg0.field1279) {
                method3088();
                field639 = var3.method6243();
                field495 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2891 == arg0.field1279) {
                int var16 = var3.method6240();
                if (var3.method6240() == 0) {
                    field741[var16] = new class299();
                    var3.field4300 += 18;
                } else {
                    var3.field4300--;
                    field741[var16] = new class299(var3, false);
                }
                field537 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2805 == arg0.field1279) {
                Statics.method301(class241.field2773);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2803 == arg0.field1279) {
                byte var17 = var3.method6241();
                int var18 = var3.method6394();
                class257.field3012[var18] = var17;
                if (class257.field3015[var18] != var17) {
                    class257.field3015[var18] = var17;
                }
                method3212(var18);
                field669[++field658 - 1 & 0x1F] = var18;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2825 == arg0.field1279) {
                Statics.method301(class241.field2781);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2859 == arg0.field1279) {
                int var19 = var3.method6240();
                int var20 = var3.method6240();
                int var21 = var3.method6240();
                int var22 = var3.method6240();
                field719[var19] = true;
                field720[var19] = var20;
                field599[var19] = var21;
                field722[var19] = var22;
                field723[var19] = 0;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2879 == arg0.field1279) {
                byte var23 = var3.method6241();
                String var24 = var3.method6335();
                long var25 = (long) var3.method6242();
                long var27 = (long) var3.method6432();
                class285 var29 = (class285) class304.method2319(class285.method2886(), var3.method6240());
                long var30 = (var25 << 32) + var27;
                boolean var32 = false;
                Object var33 = null;
                class137 var34 = var23 >= 0 ? field494[var23] : Statics.field1368;
                if (var34 == null) {
                    var32 = true;
                } else {
                    int var35 = 0;
                    while (true) {
                        if (var35 >= 100) {
                            if (var29.field3655 && Statics.field1352.method1598(new class422(var24, Statics.field3757))) {
                                var32 = true;
                            }
                            break;
                        }
                        if (field475[var35] == var30) {
                            var32 = true;
                            break;
                        }
                        var35++;
                    }
                }
                if (!var32) {
                    field475[field695] = var30;
                    field695 = (field695 + 1) % 100;
                    String var36 = class316.method5163(class265.method2651(var3));
                    int var37 = var23 >= 0 ? 41 : 44;
                    if (var29.field3652 == -1) {
                        class98.method4644(var37, var24, var36, var34.field1516);
                    } else {
                        class98.method4644(var37, class92.method4468(var29.field3652) + var24, var36, var34.field1516);
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2865 == arg0.field1279) {
                if (field631 != -1) {
                    method3074(field631, 0);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2850 == arg0.field1279) {
                Statics.method301(class241.field2774);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2884 == arg0.field1279) {
                int var38 = var3.method6278();
                class78.method2496(var38);
                field659[++field660 - 1 & 0x1F] = var38 & 0x7FFF;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2839 == arg0.field1279) {
                String var39 = var3.method6335();
                long var40 = (long) var3.method6242();
                long var42 = (long) var3.method6432();
                class285 var44 = (class285) class304.method2319(class285.method2886(), var3.method6240());
                long var45 = (var40 << 32) + var42;
                boolean var47 = false;
                for (int var48 = 0; var48 < 100; var48++) {
                    if (field475[var48] == var45) {
                        var47 = true;
                        break;
                    }
                }
                if (Statics.field1352.method1598(new class422(var39, Statics.field3757))) {
                    var47 = true;
                }
                if (!var47 && field540 == 0) {
                    field475[field695] = var45;
                    field695 = (field695 + 1) % 100;
                    String var49 = class316.method5163(class319.method269(class265.method2651(var3)));
                    byte var50;
                    if (var44.field3654) {
                        var50 = 7;
                    } else {
                        var50 = 3;
                    }
                    if (var44.field3652 == -1) {
                        class98.method6175(var50, var39, var49);
                    } else {
                        class98.method6175(var50, class92.method4468(var44.field3652) + var39, var49);
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2885 == arg0.field1279) {
                field725 = field656;
                byte var51 = var3.method6241();
                class134 var52 = new class134(var3);
                class137 var53;
                if (var51 >= 0) {
                    var53 = field494[var51];
                } else {
                    var53 = Statics.field1368;
                }
                var52.method2522(var53);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2889 == arg0.field1279) {
                Statics.field1255 = true;
                method206(true, var3);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2812 == arg0.field1279) {
                method206(false, var3);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2819 == arg0.field1279) {
                int var54 = var3.method6245();
                int var55 = var3.method6242();
                class262 var56 = class262.method2355(var54);
                if (var56.field3095 != 2 || var56.field3096 != var55) {
                    var56.field3095 = 2;
                    var56.field3096 = var55;
                    method3522(var56);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2804 == arg0.field1279) {
                int var57 = var3.method6245();
                int var58 = var3.method6242();
                if (var57 < -70000) {
                    var58 += 32768;
                }
                class262 var59;
                if (var57 >= 0) {
                    var59 = class262.method2355(var57);
                } else {
                    var59 = null;
                }
                while (var3.field4300 < arg0.field1282) {
                    int var60 = var3.method6254();
                    int var61 = var3.method6242();
                    int var62 = 0;
                    if (var61 != 0) {
                        var62 = var3.method6240();
                        if (var62 == 255) {
                            var62 = var3.method6245();
                        }
                    }
                    if (var59 != null && var60 >= 0 && var60 < var59.field3180.length) {
                        var59.field3180[var60] = var61;
                        var59.field3131[var60] = var62;
                    }
                    class78.method1894(var58, var60, var61 - 1, var62);
                }
                if (var59 != null) {
                    method3522(var59);
                }
                method3088();
                field659[++field660 - 1 & 0x1F] = var58 & 0x7FFF;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2844 == arg0.field1279) {
                int var63 = var3.method6318();
                int var64 = var3.method6280();
                int var65 = var64 >> 10 & 0x1F;
                int var66 = var64 >> 5 & 0x1F;
                int var67 = var64 & 0x1F;
                int var68 = (var67 << 3) + (var65 << 19) + (var66 << 11);
                class262 var69 = class262.method2355(var63);
                if (var69.field3077 != var68) {
                    var69.field3077 = var68;
                    method3522(var69);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2893 == arg0.field1279) {
                Statics.field1255 = true;
                method206(false, var3);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2860 == arg0.field1279) {
                byte[] var70 = new byte[arg0.field1282];
                var3.method6213(var70, 0, var70.length);
                class401 var71 = new class401(var70);
                String var72 = var71.method6335();
                class30.method2146(var72, true, false);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2834 == arg0.field1279) {
                field692 = true;
                Statics.field1762 = var3.method6240();
                Statics.field1334 = var3.method6240();
                Statics.field2443 = var3.method6242();
                Statics.field1306 = var3.method6240();
                Statics.field889 = var3.method6240();
                if (Statics.field889 >= 100) {
                    Statics.field2136 = Statics.field1762 * 128 + 64;
                    Statics.field829 = Statics.field1334 * 128 + 64;
                    Statics.field1991 = method6155(Statics.field2136, Statics.field829, Statics.field3731) - Statics.field2443;
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2827 == arg0.field1279) {
                int var73 = var3.method6289();
                int var74 = var3.method6278();
                class262 var75 = class262.method2355(var73);
                if (var75 != null && var75.field3143 == 0) {
                    if (var74 > var75.field3076 - var75.field3068) {
                        var74 = var75.field3076 - var75.field3068;
                    }
                    if (var74 < 0) {
                        var74 = 0;
                    }
                    if (var75.field3117 != var74) {
                        var75.field3117 = var74;
                        method3522(var75);
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2798 == arg0.field1279) {
                int var76 = var3.method6240();
                method3162(var76);
                arg0.field1279 = null;
                return false;
            }
            if (class243.field2842 == arg0.field1279) {
                method3088();
                field638 = var3.method6240();
                field495 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2876 == arg0.field1279) {
                Statics.field453 = class418.method3737(var3.method6240());
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2846 == arg0.field1279) {
                String var77 = var3.method6335();
                int var78 = var3.method6295();
                class262 var79 = class262.method2355(var78);
                if (!var77.equals(var79.field3113)) {
                    var79.field3113 = var77;
                    method3522(var79);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2875 == arg0.field1279) {
                method360(true, arg0.field1280);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2862 == arg0.field1279) {
                field635 = var3.method6394() * 30;
                field495 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2814 == arg0.field1279) {
                var3.field4300 += 28;
                if (var3.method6265()) {
                    method4650(var3, var3.field4300 - 28);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2854 == arg0.field1279) {
                class55.method3184(var3, arg0.field1282);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2821 == arg0.field1279) {
                String var80 = var3.method6335();
                Object[] var81 = new Object[var80.length() + 1];
                for (int var82 = var80.length() - 1; var82 >= 0; var82--) {
                    if (var80.charAt(var82) == 's') {
                        var81[var82 + 1] = var3.method6335();
                    } else {
                        var81[var82 + 1] = Integer.valueOf(var3.method6245());
                    }
                }
                var81[0] = Integer.valueOf(var3.method6245());
                class81 var83 = new class81();
                var83.field1016 = var81;
                class64.method3748(var83);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2855 == arg0.field1279) {
                int var84 = var3.method6318();
                boolean var85 = var3.method6240() == 1;
                class262 var86 = class262.method2355(var84);
                if (var86.field3072 != var85) {
                    var86.field3072 = var85;
                    method3522(var86);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2853 == arg0.field1279) {
                int var87 = var3.method6245();
                int var88 = var3.method6278();
                class262 var89 = class262.method2355(var87);
                if (var89.field3095 != 1 || var89.field3096 != var88) {
                    var89.field3095 = 1;
                    var89.field3096 = var88;
                    method3522(var89);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2837 == arg0.field1279) {
                Statics.field1147 = var3.method6269();
                Statics.field1932 = var3.method6240();
                for (int var90 = Statics.field1932; var90 < Statics.field1932 + 8; var90++) {
                    for (int var91 = Statics.field1147; var91 < Statics.field1147 + 8; var91++) {
                        if (field636[Statics.field3731][var90][var91] != null) {
                            field636[Statics.field3731][var90][var91] = null;
                            method4167(var90, var91);
                        }
                    }
                }
                for (class84 var92 = (class84) field600.method4981(); var92 != null; var92 = (class84) field600.method4987()) {
                    if (var92.field1081 >= Statics.field1932 && var92.field1081 < Statics.field1932 + 8 && var92.field1074 >= Statics.field1147 && var92.field1074 < Statics.field1147 + 8 && Statics.field3731 == var92.field1073) {
                        var92.field1082 = 0;
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2871 == arg0.field1279) {
                method3144();
                arg0.field1279 = null;
                return false;
            }
            if (class243.field2857 == arg0.field1279) {
                Statics.field1352.method1650();
                field680 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2872 == arg0.field1279) {
                int var93 = var3.method6242();
                int var94 = var3.method6240();
                int var95 = var3.method6242();
                method2504(var93, var94, var95);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2794 == arg0.field1279) {
                field692 = false;
                for (int var96 = 0; var96 < 5; var96++) {
                    field719[var96] = false;
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2845 == arg0.field1279) {
                for (int var97 = 0; var97 < Statics.field1617; var97++) {
                    class153 var98 = class153.method1947(var97);
                    if (var98 != null) {
                        class257.field3012[var97] = 0;
                        class257.field3015[var97] = 0;
                    }
                }
                method3088();
                field658 += 32;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2810 == arg0.field1279) {
                int var99 = var3.method6280();
                int var100 = var3.method6289();
                int var101 = var3.method6269();
                class80 var102 = (class80) field632.method6034((long) var100);
                if (var102 != null) {
                    method2191(var102, var102.field1013 != var99);
                }
                Statics.method1891(var100, var99, var101);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2848 == arg0.field1279) {
                Statics.method301(class241.field2782);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2847 == arg0.field1279) {
                int var103 = var3.method6245();
                int var104 = var3.method6242();
                if (var103 < -70000) {
                    var104 += 32768;
                }
                class262 var105;
                if (var103 >= 0) {
                    var105 = class262.method2355(var103);
                } else {
                    var105 = null;
                }
                if (var105 != null) {
                    for (int var106 = 0; var106 < var105.field3180.length; var106++) {
                        var105.field3180[var106] = 0;
                        var105.field3131[var106] = 0;
                    }
                }
                class78.method292(var104);
                int var107 = var3.method6242();
                for (int var108 = 0; var108 < var107; var108++) {
                    int var109 = var3.method6270();
                    if (var109 == 255) {
                        var109 = var3.method6289();
                    }
                    int var110 = var3.method6278();
                    if (var105 != null && var108 < var105.field3180.length) {
                        var105.field3180[var108] = var110;
                        var105.field3131[var108] = var109;
                    }
                    class78.method1894(var104, var108, var110 - 1, var109);
                }
                if (var105 != null) {
                    method3522(var105);
                }
                method3088();
                field659[++field660 - 1 & 0x1F] = var104 & 0x7FFF;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2861 == arg0.field1279) {
                int var111 = var3.method6254();
                boolean var112 = var3.method6240() == 1;
                String var113 = "";
                boolean var114 = false;
                if (var112) {
                    var113 = var3.method6335();
                    if (Statics.field1352.method1598(new class422(var113, Statics.field3757))) {
                        var114 = true;
                    }
                }
                String var115 = var3.method6335();
                if (!var114) {
                    class98.method6175(var111, var113, var115);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2840 == arg0.field1279) {
                method360(false, arg0.field1280);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2886 == arg0.field1279) {
                Statics.field1932 = var3.method6269();
                Statics.field1147 = var3.method6240();
                while (var3.field4300 < arg0.field1282) {
                    int var116 = var3.method6240();
                    class241 var117 = class241.method2508()[var116];
                    Statics.method301(var117);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2797 == arg0.field1279) {
                method2503(var3.method6335());
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2813 == arg0.field1279) {
                Statics.method301(class241.field2783);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2843 == arg0.field1279) {
                int var118 = var3.method6394();
                int var119 = var3.method6278();
                int var120 = var3.method6295();
                class262 var121 = class262.method2355(var120);
                var121.field3166 = (var118 << 16) + var119;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2835 == arg0.field1279) {
                int var122 = var3.method6245();
                int var123 = var3.method6245();
                int var124 = class32.method4029();
                class242 var125 = class242.method3564(class240.field2681, field562.field1277);
                var125.field2792.method6223(field176);
                var125.field2792.method6400(var122);
                var125.field2792.method6400(var123);
                var125.field2792.method6221(var124);
                field562.method2269(var125);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2822 == arg0.field1279) {
                boolean var126 = var3.method6240() == 1;
                if (var126) {
                    Statics.field3759 = class398.method2381() - var3.method6249();
                    Statics.field1562 = new class292(var3, true);
                } else {
                    Statics.field1562 = null;
                }
                field671 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2851 == arg0.field1279) {
                int var127 = var3.method6282();
                int var128 = var3.method6318();
                class262 var129 = class262.method2355(var128);
                if (var129.field3099 != var127 || var127 == -1) {
                    var129.field3099 = var127;
                    var129.field3184 = 0;
                    var129.field3151 = 0;
                    method3522(var129);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2828 == arg0.field1279) {
                byte var130 = var3.method6241();
                long var131 = (long) var3.method6242();
                long var133 = (long) var3.method6432();
                long var135 = (var131 << 32) + var133;
                boolean var137 = false;
                class137 var138 = var130 >= 0 ? field494[var130] : Statics.field1368;
                if (var138 == null) {
                    var137 = true;
                } else {
                    for (int var139 = 0; var139 < 100; var139++) {
                        if (field475[var139] == var135) {
                            var137 = true;
                            break;
                        }
                    }
                }
                if (!var137) {
                    field475[field695] = var135;
                    field695 = (field695 + 1) % 100;
                    String var140 = class265.method2651(var3);
                    int var141 = var130 >= 0 ? 43 : 46;
                    class98.method4644(var141, "", var140, var138.field1516);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2869 == arg0.field1279) {
                for (int var142 = 0; var142 < field587.length; var142++) {
                    if (field587[var142] != null) {
                        field587[var142].field1118 = -1;
                    }
                }
                for (int var143 = 0; var143 < field510.length; var143++) {
                    if (field510[var143] != null) {
                        field510[var143].field1118 = -1;
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2829 == arg0.field1279) {
                int var144 = var3.method6318();
                int var145 = var3.method6318();
                class80 var146 = (class80) field632.method6034((long) var144);
                class80 var147 = (class80) field632.method6034((long) var145);
                if (var147 != null) {
                    method2191(var147, var146 == null || var146.field1013 != var147.field1013);
                }
                if (var146 != null) {
                    var146.method5752();
                    field632.method6027(var146, (long) var145);
                }
                class262 var148 = class262.method2355(var144);
                if (var148 != null) {
                    method3522(var148);
                }
                class262 var149 = class262.method2355(var145);
                if (var149 != null) {
                    method3522(var149);
                    method1989(Statics.field2200[var149.field3052 >>> 16], var149, true);
                }
                if (field631 != -1) {
                    method3074(field631, 1);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2823 == arg0.field1279) {
                field491 = var3.method6270();
                field662 = var3.method6271();
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2888 == arg0.field1279) {
                field707 = var3.method6240();
                if (field707 == 255) {
                    field707 = 0;
                }
                field678 = var3.method6240();
                if (field678 == 255) {
                    field678 = 0;
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2816 == arg0.field1279) {
                method3088();
                int var150 = var3.method6271();
                int var151 = var3.method6289();
                int var152 = var3.method6269();
                field605[var150] = var151;
                field603[var150] = var152;
                field604[var150] = 1;
                for (int var153 = 0; var153 < 98; var153++) {
                    if (var151 >= class272.field3252[var153]) {
                        field604[var150] = var153 + 2;
                    }
                }
                field661[++field526 - 1 & 0x1F] = var150;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2808 == arg0.field1279) {
                method2374();
                byte var154 = var3.method6241();
                class120 var155 = new class120(var3);
                class128 var156;
                if (var154 >= 0) {
                    var156 = field700[var154];
                } else {
                    var156 = Statics.field842;
                }
                var155.method2406(var156);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2878 == arg0.field1279) {
                int var157 = var3.method6295();
                int var158 = var3.method6245();
                int var159 = var3.method6242();
                if (var159 == 65535) {
                    var159 = -1;
                }
                int var160 = var3.method6394();
                if (var160 == 65535) {
                    var160 = -1;
                }
                for (int var161 = var160; var161 <= var159; var161++) {
                    long var162 = ((long) var158 << 32) + (long) var161;
                    class370 var164 = field677.method6034(var162);
                    if (var164 != null) {
                        var164.method5752();
                    }
                    field677.method6027(new class369(var157), var162);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2801 == arg0.field1279) {
                method2374();
                byte var165 = var3.method6241();
                if (arg0.field1282 == 1) {
                    if (var165 >= 0) {
                        field700[var165] = null;
                    } else {
                        Statics.field842 = null;
                    }
                    arg0.field1279 = null;
                    return true;
                }
                if (var165 >= 0) {
                    field700[var165] = new class128(var3);
                } else {
                    Statics.field842 = new class128(var3);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2799 == arg0.field1279) {
                int var166 = var3.method6280();
                field631 = var166;
                this.method1105(false);
                method2028(var166);
                class64.method1038(field631);
                for (int var167 = 0; var167 < 100; var167++) {
                    field595[var167] = true;
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2795 == arg0.field1279) {
                int var168 = var3.method6295();
                class262 var169 = class262.method2355(var168);
                var169.field3095 = 3;
                var169.field3096 = Statics.field1674.field1042.method4516();
                method3522(var169);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2809 == arg0.field1279) {
                int var170 = var3.method6245();
                class80 var171 = (class80) field632.method6034((long) var170);
                if (var171 != null) {
                    method2191(var171, true);
                }
                if (field637 != null) {
                    method3522(field637);
                    field637 = null;
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2874 == arg0.field1279) {
                Statics.method301(class241.field2779);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2858 == arg0.field1279) {
                Statics.field1352.method1595(var3, arg0.field1282);
                field680 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2833 == arg0.field1279) {
                field482 = var3.method6240();
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2864 == arg0.field1279) {
                String var172 = var3.method6335();
                String var173 = class316.method5163(class319.method269(class265.method2651(var3)));
                class98.method6175(6, var172, var173);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2856 == arg0.field1279) {
                Statics.method301(class241.field2775);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2817 == arg0.field1279) {
                class61 var174 = new class61();
                var174.field759 = var3.method6335();
                var174.field752 = var3.method6242();
                int var175 = var3.method6245();
                var174.field754 = var175;
                method3496(45);
                var2.method2613();
                Object var176 = null;
                class69.method4377(var174);
                arg0.field1279 = null;
                return false;
            }
            if (class243.field2815 == arg0.field1279) {
                boolean var177 = var3.method6429();
                if (!var177) {
                    Statics.field1441 = null;
                } else if (Statics.field1441 == null) {
                    Statics.field1441 = new class301();
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2824 == arg0.field1279) {
                Statics.method301(class241.field2776);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2870 == arg0.field1279) {
                Statics.method301(class241.field2778);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2826 == arg0.field1279) {
                int var178 = var3.method6280();
                if (var178 == 65535) {
                    var178 = -1;
                }
                int var179 = var3.method6245();
                int var180 = var3.method6289();
                class262 var181 = class262.method2355(var179);
                if (var181.field3060) {
                    var181.field3066 = var178;
                    var181.field3193 = var180;
                    class170 var183 = class170.method2586(var178);
                    var181.field3081 = var183.field1893;
                    var181.field3164 = var183.field1894;
                    var181.field3105 = var183.field1895;
                    var181.field3101 = var183.field1877;
                    var181.field3102 = var183.field1897;
                    var181.field3103 = var183.field1892;
                    if (var183.field1898 == 1) {
                        var181.field3111 = 1;
                    } else {
                        var181.field3111 = 2;
                    }
                    if (var181.field3107 > 0) {
                        var181.field3103 = var181.field3103 * 32 / var181.field3107;
                    } else if (var181.field3063 > 0) {
                        var181.field3103 = var181.field3103 * 32 / var181.field3063;
                    }
                    method3522(var181);
                } else if (var178 == -1) {
                    var181.field3095 = 0;
                    arg0.field1279 = null;
                    return true;
                } else {
                    class170 var182 = class170.method2586(var178);
                    var181.field3095 = 4;
                    var181.field3096 = var178;
                    var181.field3081 = var182.field1893;
                    var181.field3164 = var182.field1894;
                    var181.field3103 = var182.field1892 * 100 / var180;
                    method3522(var181);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2881 == arg0.field1279) {
                int var184 = var3.method6318();
                int var185 = var3.method6242();
                class257.field3012[var185] = var184;
                if (class257.field3015[var185] != var184) {
                    class257.field3015[var185] = var184;
                }
                method3212(var185);
                field669[++field658 - 1 & 0x1F] = var185;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2877 == arg0.field1279) {
                Statics.method301(class241.field2780);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2873 == arg0.field1279) {
                int var186 = var3.method6245();
                if (field553 != var186) {
                    field553 = var186;
                    method2429();
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2838 == arg0.field1279) {
                field725 = field656;
                byte var187 = var3.method6241();
                if (arg0.field1282 == 1) {
                    if (var187 >= 0) {
                        field494[var187] = null;
                    } else {
                        Statics.field1368 = null;
                    }
                    arg0.field1279 = null;
                    return true;
                }
                if (var187 >= 0) {
                    field494[var187] = new class137(var3);
                } else {
                    Statics.field1368 = new class137(var3);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2830 == arg0.field1279) {
                String var188 = var3.method6335();
                long var189 = var3.method6249();
                long var191 = (long) var3.method6242();
                long var193 = (long) var3.method6432();
                class285 var195 = (class285) class304.method2319(class285.method2886(), var3.method6240());
                long var196 = (var191 << 32) + var193;
                boolean var198 = false;
                for (int var199 = 0; var199 < 100; var199++) {
                    if (field475[var199] == var196) {
                        var198 = true;
                        break;
                    }
                }
                if (var195.field3655 && Statics.field1352.method1598(new class422(var188, Statics.field3757))) {
                    var198 = true;
                }
                if (!var198 && field540 == 0) {
                    field475[field695] = var196;
                    field695 = (field695 + 1) % 100;
                    String var200 = class316.method5163(class319.method269(class265.method2651(var3)));
                    if (var195.field3652 == -1) {
                        class98.method4644(9, var188, var200, class321.method5998(var189));
                    } else {
                        class98.method4644(9, class92.method4468(var195.field3652) + var188, var200, class321.method5998(var189));
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2802 == arg0.field1279) {
                if (Statics.field1211 == null) {
                    Statics.field1211 = new class354(Statics.field2777);
                }
                class409 var201 = Statics.field2777.method5708(var3);
                Statics.field1211.field4034.method6038(var201.field4364, var201.field4362);
                field663[++field664 - 1 & 0x1F] = var201.field4364;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2887 == arg0.field1279) {
                int var202 = var3.method6289();
                int var203 = var3.method6281();
                int var204 = var3.method6281();
                class262 var205 = class262.method2355(var202);
                if (var205.field3061 != var203 || var205.field3146 != var204 || var205.field3121 != 0 || var205.field3058 != 0) {
                    var205.field3061 = var203;
                    var205.field3146 = var204;
                    var205.field3121 = 0;
                    var205.field3058 = 0;
                    method3522(var205);
                    this.method1091(var205);
                    if (var205.field3143 == 0) {
                        method1989(Statics.field2200[var202 >> 16], var205, false);
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2852 == arg0.field1279) {
                int var206 = arg0.field1282 + var3.field4300;
                int var207 = var3.method6242();
                int var208 = var3.method6242();
                if (field631 != var207) {
                    field631 = var207;
                    this.method1105(false);
                    method2028(field631);
                    class64.method1038(field631);
                    for (int var209 = 0; var209 < 100; var209++) {
                        field595[var209] = true;
                    }
                }
                while (var208-- > 0) {
                    int var210 = var3.method6245();
                    int var211 = var3.method6242();
                    int var212 = var3.method6240();
                    class80 var213 = (class80) field632.method6034((long) var210);
                    if (var213 != null && var213.field1013 != var211) {
                        method2191(var213, true);
                        var213 = null;
                    }
                    if (var213 == null) {
                        var213 = Statics.method1891(var210, var211, var212);
                    }
                    var213.field1012 = true;
                }
                for (class80 var214 = (class80) field632.method6028(); var214 != null; var214 = (class80) field632.method6029()) {
                    if (var214.field1012) {
                        var214.field1012 = false;
                    } else {
                        method2191(var214, true);
                    }
                }
                field677 = new class380(512);
                while (var3.field4300 < var206) {
                    int var215 = var3.method6245();
                    int var216 = var3.method6242();
                    int var217 = var3.method6242();
                    int var218 = var3.method6245();
                    for (int var219 = var216; var219 <= var217; var219++) {
                        long var220 = ((long) var215 << 32) + (long) var219;
                        field677.method6027(new class369(var218), var220);
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2793 == arg0.field1279) {
                method206(true, var3);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2811 == arg0.field1279) {
                int var222 = var3.method6394();
                if (var222 == 65535) {
                    var222 = -1;
                }
                method4960(var222);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2863 == arg0.field1279) {
                int var223 = var3.method6432();
                int var224 = var3.method6242();
                if (var224 == 65535) {
                    var224 = -1;
                }
                method5448(var224, var223);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2882 == arg0.field1279) {
                if (arg0.field1282 == 0) {
                    Statics.field3704 = null;
                } else {
                    if (Statics.field3704 == null) {
                        Statics.field3704 = new class334(Statics.field3757, Statics.field983);
                    }
                    Statics.field3704.method5427(var3);
                }
                method1039();
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2868 == arg0.field1279) {
                int var225 = var3.method6240();
                method1950(var225);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2820 == arg0.field1279) {
                for (int var226 = 0; var226 < class257.field3015.length; var226++) {
                    if (class257.field3015[var226] != class257.field3012[var226]) {
                        class257.field3015[var226] = class257.field3012[var226];
                        method3212(var226);
                        field669[++field658 - 1 & 0x1F] = var226;
                    }
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2818 == arg0.field1279) {
                Statics.field1352.field763.method5407(var3, arg0.field1282);
                method4048();
                field680 = field656;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2883 == arg0.field1279) {
                Statics.field1211 = null;
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2836 == arg0.field1279) {
                int var227 = var3.method6289();
                class262 var228 = class262.method2355(var227);
                for (int var229 = 0; var229 < var228.field3180.length; var229++) {
                    var228.field3180[var229] = -1;
                    var228.field3180[var229] = 0;
                }
                method3522(var228);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2841 == arg0.field1279) {
                Statics.field1932 = var3.method6240();
                Statics.field1147 = var3.method6270();
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2831 == arg0.field1279) {
                class96.method4660(var3, arg0.field1282);
                method4664();
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2880 == arg0.field1279) {
                Statics.field1211 = new class354(Statics.field2777);
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2796 == arg0.field1279) {
                int var230 = var3.method6242();
                int var231 = var3.method6242();
                int var232 = var3.method6242();
                int var233 = var3.method6289();
                class262 var234 = class262.method2355(var233);
                if (var234.field3081 != var230 || var234.field3164 != var231 || var234.field3103 != var232) {
                    var234.field3081 = var230;
                    var234.field3164 = var231;
                    var234.field3103 = var232;
                    method3522(var234);
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2832 == arg0.field1279) {
                field706 = var3.method6240();
                if (field706 == 1) {
                    field732 = var3.method6242();
                }
                if (field706 >= 2 && field706 <= 6) {
                    if (field706 == 2) {
                        field488 = 64;
                        field645 = 64;
                    }
                    if (field706 == 3) {
                        field488 = 0;
                        field645 = 64;
                    }
                    if (field706 == 4) {
                        field488 = 128;
                        field645 = 64;
                    }
                    if (field706 == 5) {
                        field488 = 64;
                        field645 = 0;
                    }
                    if (field706 == 6) {
                        field488 = 64;
                        field645 = 128;
                    }
                    field706 = 2;
                    field729 = var3.method6242();
                    field504 = var3.method6242();
                    field487 = var3.method6240();
                }
                if (field706 == 10) {
                    field485 = var3.method6242();
                }
                arg0.field1279 = null;
                return true;
            }
            if (class243.field2800 == arg0.field1279) {
                if (Statics.field3704 != null) {
                    Statics.field3704.method5432(var3);
                }
                method1039();
                arg0.field1279 = null;
                return true;
            }
            class425.method2652("" + (arg0.field1279 == null ? -1 : arg0.field1279.field2890) + class92.field1213 + (arg0.field1285 == null ? -1 : arg0.field1285.field2890) + class92.field1213 + (arg0.field1286 == null ? -1 : arg0.field1286.field2890) + class92.field1213 + arg0.field1282, (Throwable) null);
            method3144();
        } catch (IOException var239) {
            method2653();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1279 == null ? -1 : arg0.field1279.field2890) + class92.field1213 + (arg0.field1285 == null ? -1 : arg0.field1285.field2890) + class92.field1213 + (arg0.field1286 == null ? -1 : arg0.field1286.field2890) + class92.field1213 + arg0.field1282 + class92.field1213 + (Statics.field92 + Statics.field1674.field1091[0]) + class92.field1213 + (Statics.field4007 + Statics.field1674.field1144[0]) + class92.field1213;
            for (int var238 = 0; var238 < arg0.field1282 && var238 < 50; var238++) {
                var237 = var237 + var3.field4302[var238] + class92.field1213;
            }
            class425.method2652(var237, var240);
            method3144();
        }
        return true;
    }

    @ObfuscatedName("fo.hr(IIIIIIIIII)V")
    public static final void method3222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class84 var9 = null;
        for (class84 var10 = (class84) field600.method4981(); var10 != null; var10 = (class84) field600.method4987()) {
            if (var10.field1073 == arg0 && var10.field1081 == arg1 && var10.field1074 == arg2 && var10.field1079 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class84();
            var9.field1073 = arg0;
            var9.field1079 = arg3;
            var9.field1081 = arg1;
            var9.field1074 = arg2;
            method172(var9);
            field600.method4980(var9);
        }
        var9.field1072 = arg4;
        var9.field1083 = arg5;
        var9.field1071 = arg6;
        var9.field1080 = arg7;
        var9.field1082 = arg8;
    }

    @ObfuscatedName("l.hs(Lcn;I)V")
    public static final void method172(class84 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1079 == 0) {
            var1 = Statics.field3291.method3853(arg0.field1073, arg0.field1081, arg0.field1074);
        }
        if (arg0.field1079 == 1) {
            var1 = Statics.field3291.method3854(arg0.field1073, arg0.field1081, arg0.field1074);
        }
        if (arg0.field1079 == 2) {
            var1 = Statics.field3291.method3855(arg0.field1073, arg0.field1081, arg0.field1074);
        }
        if (arg0.field1079 == 3) {
            var1 = Statics.field3291.method3856(arg0.field1073, arg0.field1081, arg0.field1074);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3291.method3857(arg0.field1073, arg0.field1081, arg0.field1074, var1);
            var3 = class221.method300(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1075 = var3;
        arg0.field1077 = var4;
        arg0.field1076 = var5;
    }

    @ObfuscatedName("if.hl(IIIIIIII)V")
    public static final void method4253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field467 && Statics.field3731 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3291.method3853(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3291.method3854(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3291.method3855(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3291.method3856(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3291.method3857(arg0, arg2, arg3, var7);
            int var13 = class221.method300(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3291.method3844(arg0, arg2, arg3);
                class169 var16 = Statics.method2740(var13);
                if (var16.field1841 != 0) {
                    field594[arg0].method3152(arg2, arg3, var14, var15, var16.field1842);
                }
            }
            if (arg1 == 1) {
                Statics.field3291.method3897(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3291.method4008(arg0, arg2, arg3);
                class169 var17 = Statics.method2740(var13);
                if (var17.field1828 + arg2 > 103 || var17.field1828 + arg3 > 103 || var17.field1840 + arg2 > 103 || var17.field1840 + arg3 > 103) {
                    return;
                }
                if (var17.field1841 != 0) {
                    field594[arg0].method3153(arg2, arg3, var17.field1828, var17.field1840, var15, var17.field1842);
                }
            }
            if (arg1 == 3) {
                Statics.field3291.method3947(arg0, arg2, arg3);
                class169 var18 = Statics.method2740(var13);
                if (var18.field1841 == 1) {
                    field594[arg0].method3161(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field955[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class213 var20 = Statics.field3291;
        class173 var21 = field594[arg0];
        class169 var22 = Statics.method2740(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field1840;
            var24 = var22.field1828;
        } else {
            var23 = var22.field1828;
            var24 = var22.field1840;
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
        int[][] var29 = class75.field969[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class221.method6189(arg2, arg3, 2, var22.field1869 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field1864 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class214 var36;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var36 = var22.method2977(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class73(arg4, 22, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3977(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field1841 == 1) {
                var21.method3150(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class214 var62;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var62 = var22.method2977(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class73(arg4, 10, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            if (var62 != null) {
                var20.method3837(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field1841 != 0) {
                var21.method3148(arg2, arg3, var23, var24, var22.field1842);
            }
        } else if (arg6 >= 12) {
            class214 var37;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var37 = var22.method2977(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3837(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field1841 != 0) {
                var21.method3148(arg2, arg3, var23, var24, var22.field1842);
            }
        } else if (arg6 == 0) {
            class214 var38;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var38 = var22.method2977(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class73(arg4, 0, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3835(arg0, arg2, arg3, var30, var38, (class214) null, class75.field965[arg5], 0, var33, var35);
            if (var22.field1841 != 0) {
                var21.method3147(arg2, arg3, arg6, arg5, var22.field1842);
            }
        } else if (arg6 == 1) {
            class214 var39;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var39 = var22.method2977(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class73(arg4, 1, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3835(arg0, arg2, arg3, var30, var39, (class214) null, class75.field968[arg5], 0, var33, var35);
            if (var22.field1841 != 0) {
                var21.method3147(arg2, arg3, arg6, arg5, var22.field1842);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class214 var41;
            class214 var42;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var41 = var22.method2977(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method2977(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class73(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
                var42 = new class73(arg4, 2, var40, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3835(arg0, arg2, arg3, var30, var41, var42, class75.field965[arg5], class75.field965[var40], var33, var35);
            if (var22.field1841 != 0) {
                var21.method3147(arg2, arg3, arg6, arg5, var22.field1842);
            }
        } else if (arg6 == 3) {
            class214 var43;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var43 = var22.method2977(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class73(arg4, 3, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3835(arg0, arg2, arg3, var30, var43, (class214) null, class75.field968[arg5], 0, var33, var35);
            if (var22.field1841 != 0) {
                var21.method3147(arg2, arg3, arg6, arg5, var22.field1842);
            }
        } else if (arg6 == 9) {
            class214 var44;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var44 = var22.method2977(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3837(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field1841 != 0) {
                var21.method3148(arg2, arg3, var23, var24, var22.field1842);
            }
        } else if (arg6 == 4) {
            class214 var45;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var45 = var22.method2977(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3836(arg0, arg2, arg3, var30, var45, (class214) null, class75.field965[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3853(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = Statics.method2740(class221.method300(var47)).field1848;
            }
            class214 var49;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var49 = var22.method2977(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3836(arg0, arg2, arg3, var30, var49, (class214) null, class75.field965[arg5], 0, class75.field967[arg5] * var46, class75.field961[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3853(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = Statics.method2740(class221.method300(var51)).field1848 / 2;
            }
            class214 var53;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var53 = var22.method2977(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3836(arg0, arg2, arg3, var30, var53, (class214) null, 256, arg5, class75.field958[arg5] * var50, class75.field971[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class214 var55;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var55 = var22.method2977(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class73(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3836(arg0, arg2, arg3, var30, var55, (class214) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3853(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = Statics.method2740(class221.method300(var57)).field1848 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class214 var60;
            class214 var61;
            if (var22.field1847 == -1 && var22.field1824 == null) {
                var60 = var22.method2977(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method2977(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
                var61 = new class73(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field1847, var22.field1873, (class214) null);
            }
            var20.method3836(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class75.field958[arg5] * var56, class75.field971[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("hn.hk(IIB)V")
    public static final void method4167(int arg0, int arg1) {
        class309 var2 = field636[Statics.field3731][arg0][arg1];
        if (var2 == null) {
            Statics.field3291.method3848(Statics.field3731, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method4981(); var6 != null; var6 = (class95) var2.method4987()) {
            class170 var7 = class170.method2586(var6.field1234);
            long var8 = (long) var7.field1883;
            if (var7.field1898 == 1) {
                var8 = (long) (var6.field1237 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3291.method3848(Statics.field3731, arg0, arg1);
            return;
        }
        var2.method4983(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method4981(); var12 != null; var12 = (class95) var2.method4987()) {
            if (var5.field1234 != var12.field1234) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1234 != var12.field1234 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class221.method6189(arg0, arg1, 3, false, 0);
        Statics.field3291.method3834(Statics.field3731, arg0, arg1, method6155(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3731), var5, var13, var10, var11);
    }

    @ObfuscatedName("n.hp(ZLoj;I)V")
    public static final void method206(boolean arg0, class400 arg1) {
        field592 = 0;
        field513 = 0;
        method3577();
        while (arg1.method6191(field562.field1282) >= 27) {
            int var2 = arg1.method6194(15);
            if (var2 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field510[var2] == null) {
                field510[var2] = new class91();
                var33 = true;
            }
            class91 var34 = field510[var2];
            field611[++field511 - 1] = var2;
            var34.field1135 = field555;
            int var35;
            int var39;
            int var40;
            if (Statics.field1255) {
                var34.field1210 = class161.method1044(arg1.method6194(14));
                if (arg0) {
                    var35 = arg1.method6194(8);
                    if (var35 > 127) {
                        var35 -= 256;
                    }
                } else {
                    var35 = arg1.method6194(5);
                    if (var35 > 15) {
                        var35 -= 32;
                    }
                }
                int var36 = arg1.method6194(1);
                if (var36 == 1) {
                    field514[++field513 - 1] = var2;
                }
                int var37 = field709[arg1.method6194(3)];
                if (var33) {
                    var34.field1137 = var34.field1089 = var37;
                }
                boolean var38 = arg1.method6194(1) == 1;
                if (var38) {
                    arg1.method6194(32);
                }
                if (arg0) {
                    var39 = arg1.method6194(8);
                    if (var39 > 127) {
                        var39 -= 256;
                    }
                } else {
                    var39 = arg1.method6194(5);
                    if (var39 > 15) {
                        var39 -= 32;
                    }
                }
                var40 = arg1.method6194(1);
            } else {
                if (arg0) {
                    var35 = arg1.method6194(8);
                    if (var35 > 127) {
                        var35 -= 256;
                    }
                } else {
                    var35 = arg1.method6194(5);
                    if (var35 > 15) {
                        var35 -= 32;
                    }
                }
                var34.field1210 = class161.method1044(arg1.method6194(14));
                if (arg0) {
                    var39 = arg1.method6194(8);
                    if (var39 > 127) {
                        var39 -= 256;
                    }
                } else {
                    var39 = arg1.method6194(5);
                    if (var39 > 15) {
                        var39 -= 32;
                    }
                }
                var40 = arg1.method6194(1);
                int var41 = field709[arg1.method6194(3)];
                if (var33) {
                    var34.field1137 = var34.field1089 = var41;
                }
                int var42 = arg1.method6194(1);
                if (var42 == 1) {
                    field514[++field513 - 1] = var2;
                }
                boolean var43 = arg1.method6194(1) == 1;
                if (var43) {
                    arg1.method6194(32);
                }
            }
            var34.field1088 = var34.field1210.field1707;
            var34.field1139 = var34.field1210.field1704;
            if (var34.field1139 == 0) {
                var34.field1089 = 0;
            }
            var34.field1094 = var34.field1210.field1713;
            var34.field1114 = var34.field1210.field1714;
            var34.field1095 = var34.field1210.field1736;
            var34.field1096 = var34.field1210.field1710;
            var34.field1090 = var34.field1210.field1724;
            var34.field1141 = var34.field1210.field1711;
            var34.field1112 = var34.field1210.field1712;
            var34.method2132(Statics.field1674.field1091[0] + var35, Statics.field1674.field1144[0] + var39, var40 == 1);
        }
        arg1.method6190();
        for (int var3 = 0; var3 < field513; var3++) {
            int var4 = field514[var3];
            class91 var5 = field510[var4];
            int var6 = arg1.method6240();
            if (Statics.field1255 && (var6 & 0x80) != 0) {
                int var7 = arg1.method6240();
                var6 += var7 << 8;
            }
            if ((var6 & 0x4) != 0) {
                int var8 = arg1.method6270();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = arg1.method6254();
                        if (var13 == 32767) {
                            var13 = arg1.method6254();
                            var11 = arg1.method6254();
                            var10 = arg1.method6254();
                            var12 = arg1.method6254();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = arg1.method6254();
                        }
                        int var14 = arg1.method6254();
                        var5.method2056(var13, var11, var10, var12, field555, var14);
                    }
                }
                int var15 = arg1.method6269();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = arg1.method6254();
                        int var18 = arg1.method6254();
                        if (var18 == 32767) {
                            var5.method2063(var17);
                        } else {
                            int var19 = arg1.method6254();
                            int var20 = arg1.method6240();
                            int var21 = var18 > 0 ? arg1.method6269() : var20;
                            var5.method2055(var17, field555, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var6 & 0x200) != 0) {
                var5.field1146 = arg1.method6245();
            }
            if ((var6 & 0x2) != 0) {
                var5.field1210 = class161.method1044(arg1.method6394());
                var5.field1088 = var5.field1210.field1707;
                var5.field1139 = var5.field1210.field1704;
                var5.field1094 = var5.field1210.field1713;
                var5.field1114 = var5.field1210.field1714;
                var5.field1095 = var5.field1210.field1736;
                var5.field1096 = var5.field1210.field1710;
                var5.field1090 = var5.field1210.field1724;
                var5.field1141 = var5.field1210.field1711;
                var5.field1112 = var5.field1210.field1712;
            }
            if ((var6 & 0x10) != 0) {
                var5.field1111 = arg1.method6278();
                if (var5.field1111 == 65535) {
                    var5.field1111 = -1;
                }
            }
            if ((var6 & 0x1) != 0) {
                int var22 = arg1.method6280();
                int var23 = arg1.method6280();
                if (Statics.field1255) {
                    var5.field1128 = arg1.method6269() == 1;
                }
                int var24 = var5.field1092 - (var22 - Statics.field92 - Statics.field92) * 64;
                int var25 = var5.field1085 - (var23 - Statics.field4007 - Statics.field4007) * 64;
                if (var24 != 0 || var25 != 0) {
                    var5.field1113 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if (Statics.field1255 && (var6 & 0x100) != 0 || !Statics.field1255 && (var6 & 0x80) != 0) {
                var5.field1084 = arg1.method6402();
                var5.field1101 = arg1.method6247();
                var5.field1129 = arg1.method6402();
                var5.field1131 = arg1.method6273();
                var5.field1132 = arg1.method6394() + field555;
                var5.field1133 = arg1.method6242() + field555;
                var5.field1134 = arg1.method6278();
                var5.field1122 = 1;
                var5.field1145 = 0;
                var5.field1084 += var5.field1091[0];
                var5.field1101 += var5.field1144[0];
                var5.field1129 += var5.field1091[0];
                var5.field1131 += var5.field1144[0];
            }
            if ((var6 & 0x20) != 0) {
                int var26 = arg1.method6278();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg1.method6240();
                if (var5.field1118 == var26 && var26 != -1) {
                    int var28 = class172.method589(var26).field1966;
                    if (var28 == 1) {
                        var5.field1119 = 0;
                        var5.field1120 = 0;
                        var5.field1121 = var27;
                        var5.field1117 = 0;
                    }
                    if (var28 == 2) {
                        var5.field1117 = 0;
                    }
                } else if (var26 == -1 || var5.field1118 == -1 || class172.method589(var26).field1960 >= class172.method589(var5.field1118).field1960) {
                    var5.field1118 = var26;
                    var5.field1119 = 0;
                    var5.field1120 = 0;
                    var5.field1121 = var27;
                    var5.field1117 = 0;
                    var5.field1145 = var5.field1122;
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field1123 = arg1.method6242();
                int var29 = arg1.method6318();
                var5.field1127 = var29 >> 16;
                var5.field1126 = (var29 & 0xFFFF) + field555;
                var5.field1142 = 0;
                var5.field1125 = 0;
                if (var5.field1126 > field555) {
                    var5.field1142 = -1;
                }
                if (var5.field1123 == 65535) {
                    var5.field1123 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                var5.field1098 = arg1.method6335();
                var5.field1105 = 100;
            }
        }
        for (int var30 = 0; var30 < field592; var30++) {
            int var31 = field593[var30];
            if (field555 != field510[var31].field1135) {
                field510[var31].field1210 = null;
                field510[var31] = null;
            }
        }
        if (field562.field1282 != arg1.field4300) {
            throw new RuntimeException(arg1.field4300 + class92.field1213 + field562.field1282);
        }
        for (int var32 = 0; var32 < field511; var32++) {
            if (field510[field611[var32]] == null) {
                throw new RuntimeException(var32 + class92.field1213 + field511);
            }
        }
    }

    @ObfuscatedName("ga.hg(I)V")
    public static final void method3577() {
        class400 var0 = field562.field1280;
        var0.method6188();
        int var1 = var0.method6194(8);
        if (var1 < field511) {
            for (int var2 = var1; var2 < field511; var2++) {
                field593[++field592 - 1] = field611[var2];
            }
        }
        if (var1 > field511) {
            throw new RuntimeException("");
        }
        field511 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field611[var3];
            class91 var5 = field510[var4];
            int var6 = var0.method6194(1);
            if (var6 == 0) {
                field611[++field511 - 1] = var4;
                var5.field1135 = field555;
            } else {
                int var7 = var0.method6194(2);
                if (var7 == 0) {
                    field611[++field511 - 1] = var4;
                    var5.field1135 = field555;
                    field514[++field513 - 1] = var4;
                } else if (var7 == 1) {
                    field611[++field511 - 1] = var4;
                    var5.field1135 = field555;
                    int var8 = var0.method6194(3);
                    var5.method2135(var8, (byte) 1);
                    int var9 = var0.method6194(1);
                    if (var9 == 1) {
                        field514[++field513 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field611[++field511 - 1] = var4;
                    var5.field1135 = field555;
                    int var10 = var0.method6194(3);
                    var5.method2135(var10, (byte) 2);
                    int var11 = var0.method6194(3);
                    var5.method2135(var11, (byte) 2);
                    int var12 = var0.method6194(1);
                    if (var12 == 1) {
                        field514[++field513 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field593[++field592 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("f.hc(I)V")
    public static void method335() {
        field608 = 0;
        field607 = false;
    }

    @ObfuscatedName("bm.hb(I)V")
    public static void method1658() {
        method335();
        field613[0] = class283.field3567;
        field614[0] = "";
        field705[0] = 1006;
        field733[0] = false;
        field608 = 1;
    }

    @ObfuscatedName("bk.ht(IIB)V")
    public static final void method1878(int arg0, int arg1) {
        if (field608 < 2 && field624 == 0 && !field626 || !field619) {
            return;
        }
        int var2 = field608 - 1;
        String var4;
        if (field624 == 1 && field608 < 2) {
            var4 = class283.field3480 + class283.field3328 + field625 + " " + class92.field1212;
        } else if (field626 && field608 < 2) {
            var4 = field575 + class283.field3328 + field630 + " " + class92.field1212;
        } else {
            var4 = method6154(var2);
        }
        if (field608 > 2) {
            var4 = var4 + class92.method604(16777215) + " " + '/' + " " + (field608 - 2) + class283.field3382;
        }
        Statics.field888.method5173(var4, arg0 + 4, arg1 + 15, 16777215, 0, field555 / 1000);
    }

    @ObfuscatedName("bf.hn(I)V")
    public static final void method1071() {
        int var0 = Statics.field974;
        int var1 = Statics.field2452;
        int var2 = Statics.field1831;
        int var3 = Statics.field3294;
        int var4 = 6116423;
        class410.method6580(var0, var1, var2, var3, var4);
        class410.method6580(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class410.method6530(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field888.method5165(class283.field3483, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field212;
        int var6 = class33.field221;
        for (int var7 = 0; var7 < field608; var7++) {
            int var8 = (field608 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field888.method5165(method6154(var7), var0 + 3, var8, var9, 0);
        }
        method4943(Statics.field974, Statics.field2452, Statics.field1831, Statics.field3294);
    }

    @ObfuscatedName("kz.hv(B)Z")
    public static final boolean method4946() {
        return field607;
    }

    @ObfuscatedName("kz.hi(IIIII)V")
    public static final void method4943(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field672; var4++) {
            if (field691[var4] + field683[var4] > arg0 && field683[var4] < arg0 + arg2 && field684[var4] + field516[var4] > arg1 && field684[var4] < arg1 + arg3) {
                field554[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hh(I)V")
    public final void method1102() {
        method406();
        if (Statics.field2929 != null || field739 != null) {
            return;
        }
        int var1 = class33.field219;
        if (!field607) {
            int var22 = field608 - 1;
            if ((var1 == 1 || !Statics.field455 && var1 == 4) && var22 >= 0) {
                int var24 = field705[var22];
                if (var24 == 39 || var24 == 40 || var24 == 41 || var24 == 42 || var24 == 43 || var24 == 33 || var24 == 34 || var24 == 35 || var24 == 36 || var24 == 37 || var24 == 38 || var24 == 1005) {
                    int var25 = field717[var22];
                    int var26 = field610[var22];
                    class262 var27 = class262.method2355(var26);
                    if (class263.method2801(method2052(var27)) || class263.method2181(method2052(var27))) {
                        if (Statics.field2929 != null && !field668 && field608 > 0 && !this.method1103()) {
                            int var28 = field484;
                            int var29 = field581;
                            class67 var30 = Statics.field3269;
                            method181(var30.field840, var30.field832, var30.field833, var30.field837, var30.field834, var30.field834, var28, var29);
                            Statics.field3269 = null;
                        }
                        field668 = false;
                        field584 = 0;
                        if (Statics.field2929 != null) {
                            method3522(Statics.field2929);
                        }
                        Statics.field2929 = class262.method2355(var26);
                        field579 = var25;
                        field484 = class33.field220;
                        field581 = class33.field224;
                        if (var22 >= 0) {
                            method162(var22);
                        }
                        method3522(Statics.field2929);
                        return;
                    }
                }
            }
            if ((var1 == 1 || !Statics.field455 && var1 == 4) && this.method1103()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field455 && var1 == 4) && field608 > 0) {
                method1817(var22);
            }
            if (var1 == 2 && field608 > 0) {
                this.method1104(class33.field220, class33.field224);
            }
            return;
        }
        if (var1 != 1 && (Statics.field455 || var1 != 4)) {
            int var2 = class33.field212;
            int var3 = class33.field221;
            if (var2 < Statics.field974 - 10 || var2 > Statics.field974 + Statics.field1831 + 10 || var3 < Statics.field2452 - 10 || var3 > Statics.field3294 + Statics.field2452 + 10) {
                field607 = false;
                int var4 = Statics.field974;
                int var5 = Statics.field2452;
                int var6 = Statics.field1831;
                int var7 = Statics.field3294;
                for (int var8 = 0; var8 < field672; var8++) {
                    if (field691[var8] + field683[var8] > var4 && field683[var8] < var4 + var6 && field684[var8] + field516[var8] > var5 && field684[var8] < var5 + var7) {
                        field595[var8] = true;
                    }
                }
            }
        }
        if (var1 != 1 && Statics.field455 || var1 != 4) {
            return;
        }
        int var9 = Statics.field974;
        int var10 = Statics.field2452;
        int var11 = Statics.field1831;
        int var12 = class33.field220;
        int var13 = class33.field224;
        int var14 = -1;
        for (int var15 = 0; var15 < field608; var15++) {
            int var16 = (field608 - 1 - var15) * 15 + var10 + 31;
            if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                var14 = var15;
            }
        }
        if (var14 != -1) {
            method1817(var14);
        }
        field607 = false;
        int var17 = Statics.field974;
        int var18 = Statics.field2452;
        int var19 = Statics.field1831;
        int var20 = Statics.field3294;
        for (int var21 = 0; var21 < field672; var21++) {
            if (field691[var21] + field683[var21] > var17 && field683[var21] < var17 + var19 && field684[var21] + field516[var21] > var18 && field684[var21] < var18 + var20) {
                field595[var21] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(I)Z")
    public final boolean method1103() {
        int var1 = field608 - 1;
        return (field606 == 1 && field608 > 2 || method2311(var1)) && !field733[var1];
    }

    @ObfuscatedName("client.hy(IIB)V")
    public final void method1104(int arg0, int arg1) {
        method6152(arg0, arg1);
        Statics.field3291.method3840(Statics.field3731, arg0, arg1, false);
        field607 = true;
    }

    @ObfuscatedName("jl.hu(I)V")
    public static void method4606() {
        method6152(Statics.field1831 / 2 + Statics.field974, Statics.field2452);
    }

    @ObfuscatedName("og.hd(IIB)V")
    public static void method6152(int arg0, int arg1) {
        int var2 = Statics.field888.method5159(class283.field3483);
        for (int var3 = 0; var3 < field608; var3++) {
            int var4 = Statics.field888.method5159(method6154(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field608 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field184) {
            var6 = Statics.field184 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field137) {
            var7 = Statics.field137 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field974 = var6;
        Statics.field2452 = var7;
        Statics.field1831 = var2;
        Statics.field3294 = field608 * 15 + 22;
    }

    @ObfuscatedName("cm.ix(IB)Z")
    public static final boolean method2311(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field705[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bz.ig(II)V")
    public static final void method1817(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field717[arg0];
        int var2 = field610[arg0];
        int var3 = field705[arg0];
        int var4 = field612[arg0];
        String var5 = field613[arg0];
        String var6 = field614[arg0];
        method181(var1, var2, var3, var4, var5, var6, class33.field220, class33.field224);
    }

    @ObfuscatedName("l.id(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method181(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 34) {
            class242 var8 = class242.method3564(class240.field2741, field562.field1277);
            var8.field2792.method6236(arg3);
            var8.field2792.method6236(arg0);
            var8.field2792.method6285(arg1);
            field562.method2269(var8);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 49) {
            class83 var9 = field587[arg3];
            if (var9 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var10 = class242.method3564(class240.field2715, field562.field1277);
                var10.field2792.method6275(arg3);
                var10.field2792.method6267(class24.field118[82] ? 1 : 0);
                field562.method2269(var10);
            }
        }
        if (arg2 == 22) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var11 = class242.method3564(class240.field2768, field562.field1277);
            var11.field2792.method6221(class24.field118[82] ? 1 : 0);
            var11.field2792.method6236(Statics.field92 + arg0);
            var11.field2792.method6277(arg3);
            var11.field2792.method6224(Statics.field4007 + arg1);
            field562.method2269(var11);
        }
        if (arg2 == 6) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var12 = class242.method3564(class240.field2706, field562.field1277);
            var12.field2792.method6277(arg3);
            var12.field2792.method6224(Statics.field4007 + arg1);
            var12.field2792.method6277(Statics.field92 + arg0);
            var12.field2792.method6221(class24.field118[82] ? 1 : 0);
            field562.method2269(var12);
        }
        if (arg2 == 45) {
            class83 var13 = field587[arg3];
            if (var13 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var14 = class242.method3564(class240.field2688, field562.field1277);
                var14.field2792.method6223(class24.field118[82] ? 1 : 0);
                var14.field2792.method6236(arg3);
                field562.method2269(var14);
            }
        }
        if (arg2 == 43) {
            class242 var15 = class242.method3564(class240.field2695, field562.field1277);
            var15.field2792.method6292(arg1);
            var15.field2792.method6224(arg0);
            var15.field2792.method6277(arg3);
            field562.method2269(var15);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 26) {
            method183();
        }
        if (arg2 == 23) {
            if (field607) {
                Statics.field3291.method3865();
            } else {
                Statics.field3291.method3840(Statics.field3731, arg0, arg1, true);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1494.method5851(arg2, arg3, new class258(arg0), new class258(arg1));
        }
        if (arg2 == 1004) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            class242 var16 = class242.method3564(class240.field2756, field562.field1277);
            var16.field2792.method6277(arg3);
            field562.method2269(var16);
        }
        if (arg2 == 7) {
            class91 var17 = field510[arg3];
            if (var17 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var18 = class242.method3564(class240.field2723, field562.field1277);
                var18.field2792.method6445(class24.field118[82] ? 1 : 0);
                var18.field2792.method6236(Statics.field292);
                var18.field2792.method6275(Statics.field422);
                var18.field2792.method6400(Statics.field226);
                var18.field2792.method6277(arg3);
                field562.method2269(var18);
            }
        }
        if (arg2 == 21) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var19 = class242.method3564(class240.field2764, field562.field1277);
            var19.field2792.method6236(Statics.field4007 + arg1);
            var19.field2792.method6224(arg3);
            var19.field2792.method6277(Statics.field92 + arg0);
            var19.field2792.method6445(class24.field118[82] ? 1 : 0);
            field562.method2269(var19);
        }
        if (arg2 == 29) {
            class242 var20 = class242.method3564(class240.field2740, field562.field1277);
            var20.field2792.method6292(arg1);
            field562.method2269(var20);
            class262 var21 = class262.method2355(arg1);
            if (var21.field3078 != null && var21.field3078[0][0] == 5) {
                int var22 = var21.field3078[0][1];
                if (class257.field3015[var22] != var21.field3176[0]) {
                    class257.field3015[var22] = var21.field3176[0];
                    method3212(var22);
                }
            }
        }
        if (arg2 == 20) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var23 = class242.method3564(class240.field2710, field562.field1277);
            var23.field2792.method6236(Statics.field4007 + arg1);
            var23.field2792.method6445(class24.field118[82] ? 1 : 0);
            var23.field2792.method6236(Statics.field92 + arg0);
            var23.field2792.method6236(arg3);
            field562.method2269(var23);
        }
        if (arg2 == 41) {
            class242 var24 = class242.method3564(class240.field2719, field562.field1277);
            var24.field2792.method6285(arg1);
            var24.field2792.method6277(arg0);
            var24.field2792.method6224(arg3);
            field562.method2269(var24);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 2) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var25 = class242.method3564(class240.field2739, field562.field1277);
            var25.field2792.method6400(Statics.field4200);
            var25.field2792.method6236(field529);
            var25.field2792.method6236(Statics.field92 + arg0);
            var25.field2792.method6275(field628);
            var25.field2792.method6223(class24.field118[82] ? 1 : 0);
            var25.field2792.method6236(arg3);
            var25.field2792.method6277(Statics.field4007 + arg1);
            field562.method2269(var25);
        }
        if (arg2 == 1005) {
            class262 var26 = class262.method2355(arg1);
            if (var26 == null || var26.field3131[arg0] < 100000) {
                class242 var27 = class242.method3564(class240.field2756, field562.field1277);
                var27.field2792.method6277(arg3);
                field562.method2269(var27);
            } else {
                class98.method6175(27, "", var26.field3131[arg0] + " x " + class170.method2586(arg3).field1887);
            }
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 18) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var28 = class242.method3564(class240.field2702, field562.field1277);
            var28.field2792.method6236(Statics.field92 + arg0);
            var28.field2792.method6224(arg3);
            var28.field2792.method6224(Statics.field4007 + arg1);
            var28.field2792.method6445(class24.field118[82] ? 1 : 0);
            field562.method2269(var28);
        }
        if (arg2 == 44) {
            class83 var29 = field587[arg3];
            if (var29 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var30 = class242.method3564(class240.field2734, field562.field1277);
                var30.field2792.method6224(arg3);
                var30.field2792.method6223(class24.field118[82] ? 1 : 0);
                field562.method2269(var30);
            }
        }
        if (arg2 == 12) {
            class91 var31 = field510[arg3];
            if (var31 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var32 = class242.method3564(class240.field2731, field562.field1277);
                var32.field2792.method6275(arg3);
                var32.field2792.method6267(class24.field118[82] ? 1 : 0);
                field562.method2269(var32);
            }
        }
        if (arg2 == 37) {
            class242 var33 = class242.method3564(class240.field2732, field562.field1277);
            var33.field2792.method6236(arg0);
            var33.field2792.method6224(arg3);
            var33.field2792.method6284(arg1);
            field562.method2269(var33);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 33) {
            class242 var34 = class242.method3564(class240.field2707, field562.field1277);
            var34.field2792.method6277(arg3);
            var34.field2792.method6275(arg0);
            var34.field2792.method6285(arg1);
            field562.method2269(var34);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 48) {
            class83 var35 = field587[arg3];
            if (var35 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var36 = class242.method3564(class240.field2693, field562.field1277);
                var36.field2792.method6277(arg3);
                var36.field2792.method6445(class24.field118[82] ? 1 : 0);
                field562.method2269(var36);
            }
        }
        if (arg2 == 58) {
            class262 var37 = Statics.method1957(arg1, arg0);
            if (var37 != null) {
                class242 var38 = class242.method3564(class240.field2754, field562.field1277);
                var38.field2792.method6236(var37.field3066);
                var38.field2792.method6292(Statics.field4200);
                var38.field2792.method6236(arg0);
                var38.field2792.method6292(arg1);
                var38.field2792.method6236(field628);
                var38.field2792.method6236(field529);
                field562.method2269(var38);
            }
        }
        if (arg2 == 1003) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            class91 var39 = field510[arg3];
            if (var39 != null) {
                class161 var40 = var39.field1210;
                if (var40.field1731 != null) {
                    var40 = var40.method2813();
                }
                if (var40 != null) {
                    class242 var41 = class242.method3564(class240.field2758, field562.field1277);
                    var41.field2792.method6224(var40.field1729);
                    field562.method2269(var41);
                }
            }
        }
        if (arg2 == 9) {
            class91 var42 = field510[arg3];
            if (var42 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var43 = class242.method3564(class240.field2718, field562.field1277);
                var43.field2792.method6445(class24.field118[82] ? 1 : 0);
                var43.field2792.method6275(arg3);
                field562.method2269(var43);
            }
        }
        if (arg2 == 5) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var44 = class242.method3564(class240.field2691, field562.field1277);
            var44.field2792.method6224(Statics.field92 + arg0);
            var44.field2792.method6223(class24.field118[82] ? 1 : 0);
            var44.field2792.method6224(Statics.field4007 + arg1);
            var44.field2792.method6236(arg3);
            field562.method2269(var44);
        }
        if (arg2 == 13) {
            class91 var45 = field510[arg3];
            if (var45 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var46 = class242.method3564(class240.field2673, field562.field1277);
                var46.field2792.method6221(class24.field118[82] ? 1 : 0);
                var46.field2792.method6224(arg3);
                field562.method2269(var46);
            }
        }
        if (arg2 == 17) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var47 = class242.method3564(class240.field2736, field562.field1277);
            var47.field2792.method6267(class24.field118[82] ? 1 : 0);
            var47.field2792.method6277(field628);
            var47.field2792.method6236(arg3);
            var47.field2792.method6275(Statics.field4007 + arg1);
            var47.field2792.method6292(Statics.field4200);
            var47.field2792.method6275(field529);
            var47.field2792.method6277(Statics.field92 + arg0);
            field562.method2269(var47);
        }
        if (arg2 == 42) {
            class242 var48 = class242.method3564(class240.field2668, field562.field1277);
            var48.field2792.method6224(arg3);
            var48.field2792.method6285(arg1);
            var48.field2792.method6224(arg0);
            field562.method2269(var48);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 1002) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            class242 var49 = class242.method3564(class240.field2698, field562.field1277);
            var49.field2792.method6275(arg3);
            field562.method2269(var49);
        }
        if (arg2 == 36) {
            class242 var50 = class242.method3564(class240.field2672, field562.field1277);
            var50.field2792.method6277(arg3);
            var50.field2792.method6275(arg0);
            var50.field2792.method6400(arg1);
            field562.method2269(var50);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 16) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var51 = class242.method3564(class240.field2757, field562.field1277);
            var51.field2792.method6277(arg3);
            var51.field2792.method6224(Statics.field4007 + arg1);
            var51.field2792.method6224(Statics.field292);
            var51.field2792.method6224(Statics.field92 + arg0);
            var51.field2792.method6221(class24.field118[82] ? 1 : 0);
            var51.field2792.method6277(Statics.field422);
            var51.field2792.method6284(Statics.field226);
            field562.method2269(var51);
        }
        if (arg2 == 1) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var52 = class242.method3564(class240.field2730, field562.field1277);
            var52.field2792.method6275(Statics.field422);
            var52.field2792.method6275(Statics.field4007 + arg1);
            var52.field2792.method6284(Statics.field226);
            var52.field2792.method6236(Statics.field92 + arg0);
            var52.field2792.method6275(arg3);
            var52.field2792.method6277(Statics.field292);
            var52.field2792.method6267(class24.field118[82] ? 1 : 0);
            field562.method2269(var52);
        }
        if (arg2 == 51) {
            class83 var53 = field587[arg3];
            if (var53 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var54 = class242.method3564(class240.field2729, field562.field1277);
                var54.field2792.method6223(class24.field118[82] ? 1 : 0);
                var54.field2792.method6277(arg3);
                field562.method2269(var54);
            }
        }
        if (arg2 == 15) {
            class83 var55 = field587[arg3];
            if (var55 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var56 = class242.method3564(class240.field2761, field562.field1277);
                var56.field2792.method6236(field628);
                var56.field2792.method6277(arg3);
                var56.field2792.method6277(field529);
                var56.field2792.method6292(Statics.field4200);
                var56.field2792.method6223(class24.field118[82] ? 1 : 0);
                field562.method2269(var56);
            }
        }
        if (arg2 == 39) {
            class242 var57 = class242.method3564(class240.field2692, field562.field1277);
            var57.field2792.method6275(arg3);
            var57.field2792.method6224(arg0);
            var57.field2792.method6292(arg1);
            field562.method2269(var57);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 28) {
            class242 var58 = class242.method3564(class240.field2740, field562.field1277);
            var58.field2792.method6292(arg1);
            field562.method2269(var58);
            class262 var59 = class262.method2355(arg1);
            if (var59.field3078 != null && var59.field3078[0][0] == 5) {
                int var60 = var59.field3078[0][1];
                class257.field3015[var60] = 1 - class257.field3015[var60];
                method3212(var60);
            }
        }
        if (arg2 == 14) {
            class83 var61 = field587[arg3];
            if (var61 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var62 = class242.method3564(class240.field2679, field562.field1277);
                var62.field2792.method6236(arg3);
                var62.field2792.method6236(Statics.field292);
                var62.field2792.method6223(class24.field118[82] ? 1 : 0);
                var62.field2792.method6236(Statics.field422);
                var62.field2792.method6285(Statics.field226);
                field562.method2269(var62);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class262 var63 = Statics.method1957(arg1, arg0);
            if (var63 != null) {
                method4841(arg3, arg1, arg0, var63.field3066, arg5);
            }
        }
        if (arg2 == 50) {
            class83 var64 = field587[arg3];
            if (var64 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var65 = class242.method3564(class240.field2674, field562.field1277);
                var65.field2792.method6224(arg3);
                var65.field2792.method6445(class24.field118[82] ? 1 : 0);
                field562.method2269(var65);
            }
        }
        if (arg2 == 11) {
            class91 var66 = field510[arg3];
            if (var66 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var67 = class242.method3564(class240.field2724, field562.field1277);
                var67.field2792.method6445(class24.field118[82] ? 1 : 0);
                var67.field2792.method6236(arg3);
                field562.method2269(var67);
            }
        }
        if (arg2 == 38) {
            method4596();
            class262 var68 = class262.method2355(arg1);
            field624 = 1;
            Statics.field422 = arg0;
            Statics.field226 = arg1;
            Statics.field292 = arg3;
            method3522(var68);
            field625 = class92.method604(16748608) + class170.method2586(arg3).field1887 + class92.method604(16777215);
            if (field625 == null) {
                field625 = class283.field3566;
            }
            return;
        }
        if (arg2 == 1001) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var69 = class242.method3564(class240.field2694, field562.field1277);
            var69.field2792.method6236(Statics.field92 + arg0);
            var69.field2792.method6277(arg3);
            var69.field2792.method6277(Statics.field4007 + arg1);
            var69.field2792.method6267(class24.field118[82] ? 1 : 0);
            field562.method2269(var69);
        }
        if (arg2 == 8) {
            class91 var70 = field510[arg3];
            if (var70 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var71 = class242.method3564(class240.field2742, field562.field1277);
                var71.field2792.method6285(Statics.field4200);
                var71.field2792.method6236(field529);
                var71.field2792.method6267(class24.field118[82] ? 1 : 0);
                var71.field2792.method6236(arg3);
                var71.field2792.method6224(field628);
                field562.method2269(var71);
            }
        }
        if (arg2 == 3) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var72 = class242.method3564(class240.field2745, field562.field1277);
            var72.field2792.method6275(Statics.field92 + arg0);
            var72.field2792.method6224(Statics.field4007 + arg1);
            var72.field2792.method6236(arg3);
            var72.field2792.method6223(class24.field118[82] ? 1 : 0);
            field562.method2269(var72);
        }
        if (arg2 == 19) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var73 = class242.method3564(class240.field2769, field562.field1277);
            var73.field2792.method6277(Statics.field4007 + arg1);
            var73.field2792.method6445(class24.field118[82] ? 1 : 0);
            var73.field2792.method6275(arg3);
            var73.field2792.method6224(Statics.field92 + arg0);
            field562.method2269(var73);
        }
        if (arg2 == 25) {
            class262 var74 = Statics.method1957(arg1, arg0);
            if (var74 != null) {
                method4596();
                method983(arg1, arg0, class263.method1943(method2052(var74)), var74.field3066);
                field624 = 0;
                field575 = method291(var74);
                if (field575 == null) {
                    field575 = class283.field3566;
                }
                if (var74.field3060) {
                    field630 = var74.field3048 + class92.method604(16777215);
                } else {
                    field630 = class92.method604(65280) + var74.field3178 + class92.method604(16777215);
                }
            }
            return;
        }
        if (arg2 == 24) {
            class262 var75 = class262.method2355(arg1);
            boolean var76 = true;
            if (var75.field3056 > 0) {
                var76 = method4854(var75);
            }
            if (var76) {
                class242 var77 = class242.method3564(class240.field2740, field562.field1277);
                var77.field2792.method6292(arg1);
                field562.method2269(var77);
            }
        }
        if (arg2 == 30 && field637 == null) {
            method2169(arg1, arg0);
            field637 = Statics.method1957(arg1, arg0);
            method3522(field637);
        }
        if (arg2 == 4) {
            field597 = arg6;
            field609 = arg7;
            field701 = 2;
            field574 = 0;
            field707 = arg0;
            field678 = arg1;
            class242 var78 = class242.method3564(class240.field2665, field562.field1277);
            var78.field2792.method6275(Statics.field92 + arg0);
            var78.field2792.method6223(class24.field118[82] ? 1 : 0);
            var78.field2792.method6224(arg3);
            var78.field2792.method6277(Statics.field4007 + arg1);
            field562.method2269(var78);
        }
        if (arg2 == 31) {
            class242 var79 = class242.method3564(class240.field2703, field562.field1277);
            var79.field2792.method6236(arg3);
            var79.field2792.method6284(arg1);
            var79.field2792.method6224(arg0);
            var79.field2792.method6284(Statics.field226);
            var79.field2792.method6277(Statics.field292);
            var79.field2792.method6236(Statics.field422);
            field562.method2269(var79);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 47) {
            class83 var80 = field587[arg3];
            if (var80 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var81 = class242.method3564(class240.field2770, field562.field1277);
                var81.field2792.method6236(arg3);
                var81.field2792.method6445(class24.field118[82] ? 1 : 0);
                field562.method2269(var81);
            }
        }
        if (arg2 == 35) {
            class242 var82 = class242.method3564(class240.field2678, field562.field1277);
            var82.field2792.method6277(arg3);
            var82.field2792.method6236(arg0);
            var82.field2792.method6285(arg1);
            field562.method2269(var82);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 40) {
            class242 var83 = class242.method3564(class240.field2671, field562.field1277);
            var83.field2792.method6292(arg1);
            var83.field2792.method6224(arg3);
            var83.field2792.method6275(arg0);
            field562.method2269(var83);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 10) {
            class91 var84 = field510[arg3];
            if (var84 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var85 = class242.method3564(class240.field2749, field562.field1277);
                var85.field2792.method6275(arg3);
                var85.field2792.method6223(class24.field118[82] ? 1 : 0);
                field562.method2269(var85);
            }
        }
        if (arg2 == 32) {
            class242 var86 = class242.method3564(class240.field2696, field562.field1277);
            var86.field2792.method6277(arg0);
            var86.field2792.method6292(Statics.field4200);
            var86.field2792.method6224(field529);
            var86.field2792.method6284(arg1);
            var86.field2792.method6236(arg3);
            field562.method2269(var86);
            field577 = 0;
            Statics.field2038 = class262.method2355(arg1);
            field578 = arg0;
        }
        if (arg2 == 46) {
            class83 var87 = field587[arg3];
            if (var87 != null) {
                field597 = arg6;
                field609 = arg7;
                field701 = 2;
                field574 = 0;
                field707 = arg0;
                field678 = arg1;
                class242 var88 = class242.method3564(class240.field2711, field562.field1277);
                var88.field2792.method6223(class24.field118[82] ? 1 : 0);
                var88.field2792.method6224(arg3);
                field562.method2269(var88);
            }
        }
        if (field624 != 0) {
            field624 = 0;
            method3522(class262.method2355(Statics.field226));
        }
        if (field626) {
            method4596();
        }
        if (Statics.field2038 != null && field577 == 0) {
            method3522(Statics.field2038);
        }
    }

    @ObfuscatedName("jt.in(ILjava/lang/String;B)V")
    public static void method4639(int arg0, String arg1) {
        int var2 = class96.field1244;
        int[] var3 = class96.field1239;
        boolean var4 = false;
        class422 var5 = new class422(arg1, Statics.field3757);
        for (int var6 = 0; var6 < var2; var6++) {
            class83 var7 = field587[var3[var6]];
            if (var7 != null && Statics.field1674 != var7 && var7.field1048 != null && var7.field1048.equals(var5)) {
                if (arg0 == 1) {
                    class242 var8 = class242.method3564(class240.field2734, field562.field1277);
                    var8.field2792.method6224(var3[var6]);
                    var8.field2792.method6223(0);
                    field562.method2269(var8);
                } else if (arg0 == 4) {
                    class242 var9 = class242.method3564(class240.field2770, field562.field1277);
                    var9.field2792.method6236(var3[var6]);
                    var9.field2792.method6445(0);
                    field562.method2269(var9);
                } else if (arg0 == 6) {
                    class242 var10 = class242.method3564(class240.field2715, field562.field1277);
                    var10.field2792.method6275(var3[var6]);
                    var10.field2792.method6267(0);
                    field562.method2269(var10);
                } else if (arg0 == 7) {
                    class242 var11 = class242.method3564(class240.field2674, field562.field1277);
                    var11.field2792.method6224(var3[var6]);
                    var11.field2792.method6445(0);
                    field562.method2269(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class98.method6175(4, "", class283.field3387 + arg1);
        }
    }

    @ObfuscatedName("aa.ip(IIIII)V")
    public static void method983(int arg0, int arg1, int arg2, int arg3) {
        class262 var4 = Statics.method1957(arg0, arg1);
        if (var4 != null && var4.field3149 != null) {
            class81 var5 = new class81();
            var5.field1023 = var4;
            var5.field1016 = var4.field3149;
            class64.method3748(var5);
        }
        field628 = arg3;
        field626 = true;
        Statics.field4200 = arg0;
        field529 = arg1;
        Statics.field1373 = arg2;
        method3522(var4);
    }

    @ObfuscatedName("jl.ik(I)V")
    public static void method4596() {
        if (!field626) {
            return;
        }
        class262 var0 = Statics.method1957(Statics.field4200, field529);
        if (var0 != null && var0.field3045 != null) {
            class81 var1 = new class81();
            var1.field1023 = var0;
            var1.field1016 = var0.field3045;
            class64.method3748(var1);
        }
        field628 = -1;
        field626 = false;
        method3522(var0);
    }

    @ObfuscatedName("cw.ii(III)V")
    public static void method2169(int arg0, int arg1) {
        class242 var2 = class242.method3564(class240.field2762, field562.field1277);
        var2.field2792.method6284(arg0);
        var2.field2792.method6224(arg1);
        field562.method2269(var2);
    }

    @ObfuscatedName("kx.ib(IIIILjava/lang/String;I)V")
    public static void method4841(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class262 var5 = Statics.method1957(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3158 != null) {
            class81 var6 = new class81();
            var6.field1023 = var5;
            var6.field1020 = arg0;
            var6.field1024 = arg4;
            var6.field1016 = var5.field3158;
            class64.method3748(var6);
        }
        boolean var7 = true;
        if (var5.field3056 > 0) {
            var7 = method4854(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2052(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class242 var11 = class242.method3564(class240.field2687, field562.field1277);
            var11.field2792.method6292(arg1);
            var11.field2792.method6224(arg2);
            var11.field2792.method6224(arg3);
            field562.method2269(var11);
        }
        if (arg0 == 2) {
            class242 var12 = class242.method3564(class240.field2682, field562.field1277);
            var12.field2792.method6292(arg1);
            var12.field2792.method6224(arg2);
            var12.field2792.method6224(arg3);
            field562.method2269(var12);
        }
        if (arg0 == 3) {
            class242 var13 = class242.method3564(class240.field2683, field562.field1277);
            var13.field2792.method6292(arg1);
            var13.field2792.method6224(arg2);
            var13.field2792.method6224(arg3);
            field562.method2269(var13);
        }
        if (arg0 == 4) {
            class242 var14 = class242.method3564(class240.field2684, field562.field1277);
            var14.field2792.method6292(arg1);
            var14.field2792.method6224(arg2);
            var14.field2792.method6224(arg3);
            field562.method2269(var14);
        }
        if (arg0 == 5) {
            class242 var15 = class242.method3564(class240.field2735, field562.field1277);
            var15.field2792.method6292(arg1);
            var15.field2792.method6224(arg2);
            var15.field2792.method6224(arg3);
            field562.method2269(var15);
        }
        if (arg0 == 6) {
            class242 var16 = class242.method3564(class240.field2666, field562.field1277);
            var16.field2792.method6292(arg1);
            var16.field2792.method6224(arg2);
            var16.field2792.method6224(arg3);
            field562.method2269(var16);
        }
        if (arg0 == 7) {
            class242 var17 = class242.method3564(class240.field2716, field562.field1277);
            var17.field2792.method6292(arg1);
            var17.field2792.method6224(arg2);
            var17.field2792.method6224(arg3);
            field562.method2269(var17);
        }
        if (arg0 == 8) {
            class242 var18 = class242.method3564(class240.field2752, field562.field1277);
            var18.field2792.method6292(arg1);
            var18.field2792.method6224(arg2);
            var18.field2792.method6224(arg3);
            field562.method2269(var18);
        }
        if (arg0 == 9) {
            class242 var19 = class242.method3564(class240.field2712, field562.field1277);
            var19.field2792.method6292(arg1);
            var19.field2792.method6224(arg2);
            var19.field2792.method6224(arg3);
            field562.method2269(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class242 var20 = class242.method3564(class240.field2690, field562.field1277);
        var20.field2792.method6292(arg1);
        var20.field2792.method6224(arg2);
        var20.field2792.method6224(arg3);
        field562.method2269(var20);
    }

    @ObfuscatedName("al.ia(I)V")
    public static final void method406() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field608 - 1; var1++) {
                if (field705[var1] < 1000 && field705[var1 + 1] > 1000) {
                    String var2 = field614[var1];
                    field614[var1] = field614[var1 + 1];
                    field614[var1 + 1] = var2;
                    String var3 = field613[var1];
                    field613[var1] = field613[var1 + 1];
                    field613[var1 + 1] = var3;
                    int var4 = field705[var1];
                    field705[var1] = field705[var1 + 1];
                    field705[var1 + 1] = var4;
                    int var5 = field717[var1];
                    field717[var1] = field717[var1 + 1];
                    field717[var1 + 1] = var5;
                    int var6 = field610[var1];
                    field610[var1] = field610[var1 + 1];
                    field610[var1 + 1] = var6;
                    int var7 = field612[var1];
                    field612[var1] = field612[var1 + 1];
                    field612[var1 + 1] = var7;
                    boolean var8 = field733[var1];
                    field733[var1] = field733[var1 + 1];
                    field733[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("fi.im(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2776(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4164(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("hc.ih(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method4164(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field607 || field608 >= 500) {
            return;
        }
        field613[field608] = arg0;
        field614[field608] = arg1;
        field705[field608] = arg2;
        field612[field608] = arg3;
        field717[field608] = arg4;
        field610[field608] = arg5;
        field733[field608] = arg6;
        field608++;
    }

    @ObfuscatedName("dr.il(IB)Z")
    public static boolean method2420(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("og.if(II)Ljava/lang/String;")
    public static String method6154(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field614[arg0].length() > 0) {
            return field613[arg0] + class283.field3328 + field614[arg0];
        } else {
            return field613[arg0];
        }
    }

    @ObfuscatedName("h.ir(IIIIS)V")
    public static final void method358(int arg0, int arg1, int arg2, int arg3) {
        if (field624 == 0 && !field626) {
            method2776(class283.field3485, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class221.field2587;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class221.method2556(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class83 var14 = field587[field748];
                    method1801(var14, field748, var11, var12);
                }
                return;
            }
            long var15 = class221.method2048(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var17 = class221.method1036(var8);
                    int var18 = class221.method4061(var8);
                    long var19 = class221.field2588[var8];
                    int var21 = (int) (var19 >>> 14 & 0x3L);
                    int var24 = class221.method760(var8);
                    if (var21 == 2 && Statics.field3291.method3857(Statics.field3731, var17, var18, var15) >= 0) {
                        class169 var25 = Statics.method2740(var24);
                        if (var25.field1824 != null) {
                            var25 = var25.method2980();
                        }
                        if (var25 == null) {
                            break label277;
                        }
                        if (field624 == 1) {
                            method2776(class283.field3480, field625 + " " + class92.field1212 + " " + class92.method604(65535) + var25.field1834, 1, var24, var17, var18);
                        } else if (!field626) {
                            String[] var26 = var25.field1851;
                            if (var26 != null) {
                                for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var26[var27] != null) {
                                        short var28 = 0;
                                        if (var27 == 0) {
                                            var28 = 3;
                                        }
                                        if (var27 == 1) {
                                            var28 = 4;
                                        }
                                        if (var27 == 2) {
                                            var28 = 5;
                                        }
                                        if (var27 == 3) {
                                            var28 = 6;
                                        }
                                        if (var27 == 4) {
                                            var28 = 1001;
                                        }
                                        method2776(var26[var27], class92.method604(65535) + var25.field1834, var28, var24, var17, var18);
                                    }
                                }
                            }
                            method2776(class283.field3586, class92.method604(65535) + var25.field1834, 1002, var25.field1825, var17, var18);
                        } else if ((Statics.field1373 & 0x4) == 4) {
                            method2776(field575, field630 + " " + class92.field1212 + " " + class92.method604(65535) + var25.field1834, 2, var24, var17, var18);
                        }
                    }
                    if (var21 == 1) {
                        class91 var29 = field510[var24];
                        if (var29 == null) {
                            break label277;
                        }
                        if (var29.field1210.field1707 == 1 && (var29.field1092 & 0x7F) == 64 && (var29.field1085 & 0x7F) == 64) {
                            for (int var30 = 0; var30 < field511; var30++) {
                                class91 var31 = field510[field611[var30]];
                                if (var31 != null && var29 != var31 && var31.field1210.field1707 == 1 && var29.field1092 == var31.field1092 && var29.field1085 == var31.field1085) {
                                    method3650(var31, field611[var30], var17, var18);
                                }
                            }
                            int var32 = class96.field1244;
                            int[] var33 = class96.field1239;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class83 var35 = field587[var33[var34]];
                                if (var35 != null && var29.field1092 == var35.field1092 && var29.field1085 == var35.field1085) {
                                    method1801(var35, var33[var34], var17, var18);
                                }
                            }
                        }
                        method3650(var29, var24, var17, var18);
                    }
                    if (var21 == 0) {
                        class83 var36 = field587[var24];
                        if (var36 == null) {
                            break label277;
                        }
                        if ((var36.field1092 & 0x7F) == 64 && (var36.field1085 & 0x7F) == 64) {
                            for (int var37 = 0; var37 < field511; var37++) {
                                class91 var38 = field510[field611[var37]];
                                if (var38 != null && var38.field1210.field1707 == 1 && var36.field1092 == var38.field1092 && var36.field1085 == var38.field1085) {
                                    method3650(var38, field611[var37], var17, var18);
                                }
                            }
                            int var39 = class96.field1244;
                            int[] var40 = class96.field1239;
                            for (int var41 = 0; var41 < var39; var41++) {
                                class83 var42 = field587[var40[var41]];
                                if (var42 != null && var36 != var42 && var36.field1092 == var42.field1092 && var36.field1085 == var42.field1085) {
                                    method1801(var42, var40[var41], var17, var18);
                                }
                            }
                        }
                        if (field748 == var24) {
                            var4 = var15;
                        } else {
                            method1801(var36, var24, var17, var18);
                        }
                    }
                    if (var21 == 3) {
                        class309 var43 = field636[Statics.field3731][var17][var18];
                        if (var43 != null) {
                            for (class95 var44 = (class95) var43.method5004(); var44 != null; var44 = (class95) var43.method4988()) {
                                class170 var45 = class170.method2586(var44.field1234);
                                if (field624 == 1) {
                                    method2776(class283.field3480, field625 + " " + class92.field1212 + " " + class92.method604(16748608) + var45.field1887, 16, var44.field1234, var17, var18);
                                } else if (!field626) {
                                    String[] var46 = var45.field1904;
                                    for (int var47 = 4; var47 >= 0; var47--) {
                                        if (var46 != null && var46[var47] != null) {
                                            byte var48 = 0;
                                            if (var47 == 0) {
                                                var48 = 18;
                                            }
                                            if (var47 == 1) {
                                                var48 = 19;
                                            }
                                            if (var47 == 2) {
                                                var48 = 20;
                                            }
                                            if (var47 == 3) {
                                                var48 = 21;
                                            }
                                            if (var47 == 4) {
                                                var48 = 22;
                                            }
                                            method2776(var46[var47], class92.method604(16748608) + var45.field1887, var48, var44.field1234, var17, var18);
                                        } else if (var47 == 2) {
                                            method2776(class283.field3318, class92.method604(16748608) + var45.field1887, 20, var44.field1234, var17, var18);
                                        }
                                    }
                                    method2776(class283.field3586, class92.method604(16748608) + var45.field1887, 1004, var44.field1234, var17, var18);
                                } else if ((Statics.field1373 & 0x1) == 1) {
                                    method2776(field575, field630 + " " + class92.field1212 + " " + class92.method604(16748608) + var45.field1887, 17, var44.field1234, var17, var18);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("ge.io(Lcp;IIII)V")
    public static final void method3650(class91 arg0, int arg1, int arg2, int arg3) {
        class161 var4 = arg0.field1210;
        if (field608 >= 400) {
            return;
        }
        if (var4.field1731 != null) {
            var4 = var4.method2813();
        }
        if (var4 == null || !var4.field1734 || var4.field1709 && field583 != arg1) {
            return;
        }
        String var5 = var4.field1716;
        if (var4.field1718 != 0 && arg0.field1146 != 0) {
            int var6 = arg0.field1146 == -1 ? var4.field1718 : arg0.field1146;
            int var8 = Statics.field1674.field1058;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class92.method604(16711680);
            } else if (var9 < -6) {
                var10 = class92.method604(16723968);
            } else if (var9 < -3) {
                var10 = class92.method604(16740352);
            } else if (var9 < 0) {
                var10 = class92.method604(16756736);
            } else if (var9 > 9) {
                var10 = class92.method604(65280);
            } else if (var9 > 6) {
                var10 = class92.method604(4259584);
            } else if (var9 > 3) {
                var10 = class92.method604(8453888);
            } else if (var9 > 0) {
                var10 = class92.method604(12648192);
            } else {
                var10 = class92.method604(16776960);
            }
            var5 = var5 + var10 + " " + class92.field1215 + class283.field3486 + var6 + class92.field1219;
        }
        if (var4.field1709 && field616) {
            method2776(class283.field3586, class92.method604(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field624 == 1) {
            method2776(class283.field3480, field625 + " " + class92.field1212 + " " + class92.method604(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field626) {
            int var11 = var4.field1709 && field616 ? 2000 : 0;
            String[] var12 = var4.field1732;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var12[var13] != null && !var12[var13].equalsIgnoreCase(class283.field3482)) {
                        int var14 = 0;
                        if (var13 == 0) {
                            var14 = var11 + 9;
                        }
                        if (var13 == 1) {
                            var14 = var11 + 10;
                        }
                        if (var13 == 2) {
                            var14 = var11 + 11;
                        }
                        if (var13 == 3) {
                            var14 = var11 + 12;
                        }
                        if (var13 == 4) {
                            var14 = var11 + 13;
                        }
                        method2776(var12[var13], class92.method604(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (var12[var15] != null && var12[var15].equalsIgnoreCase(class283.field3482)) {
                        short var16 = 0;
                        if (field666 != class94.field1230) {
                            if (field666 == class94.field1228 || field666 == class94.field1231 && var4.field1718 > Statics.field1674.field1058) {
                                var16 = 2000;
                            }
                            int var17 = 0;
                            if (var15 == 0) {
                                var17 = var16 + 9;
                            }
                            if (var15 == 1) {
                                var17 = var16 + 10;
                            }
                            if (var15 == 2) {
                                var17 = var16 + 11;
                            }
                            if (var15 == 3) {
                                var17 = var16 + 12;
                            }
                            if (var15 == 4) {
                                var17 = var16 + 13;
                            }
                            method2776(var12[var15], class92.method604(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1709 || !field616) {
                method2776(class283.field3586, class92.method604(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1373 & 0x2) == 2) {
            method2776(field575, field630 + " " + class92.field1212 + " " + class92.method604(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bo.iz(Lcx;IIII)V")
    public static final void method1801(class83 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1674 == arg0 || field608 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1047 == 0) {
            String var4 = arg0.field1046[0] + arg0.field1048 + arg0.field1046[1];
            int var5 = arg0.field1058;
            int var6 = Statics.field1674.field1058;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class92.method604(16711680);
            } else if (var7 < -6) {
                var8 = class92.method604(16723968);
            } else if (var7 < -3) {
                var8 = class92.method604(16740352);
            } else if (var7 < 0) {
                var8 = class92.method604(16756736);
            } else if (var7 > 9) {
                var8 = class92.method604(65280);
            } else if (var7 > 6) {
                var8 = class92.method604(4259584);
            } else if (var7 > 3) {
                var8 = class92.method604(8453888);
            } else if (var7 > 0) {
                var8 = class92.method604(12648192);
            } else {
                var8 = class92.method604(16776960);
            }
            var9 = var4 + var8 + " " + class92.field1215 + class283.field3486 + arg0.field1058 + class92.field1219 + arg0.field1046[2];
        } else {
            var9 = arg0.field1046[0] + arg0.field1048 + arg0.field1046[1] + " " + class92.field1215 + class283.field3321 + arg0.field1047 + class92.field1219 + arg0.field1046[2];
        }
        if (field624 == 1) {
            method2776(class283.field3480, field625 + " " + class92.field1212 + " " + class92.method604(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field626) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field685[var10] != null) {
                    short var11 = 0;
                    if (field685[var10].equalsIgnoreCase(class283.field3482)) {
                        if (field490 == class94.field1230) {
                            continue;
                        }
                        if (field490 == class94.field1228 || field490 == class94.field1231 && arg0.field1058 > Statics.field1674.field1058) {
                            var11 = 2000;
                        }
                        if (Statics.field1674.field1054 == 0 || arg0.field1054 == 0) {
                            if (field490 == class94.field1227 && arg0.method2021()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field1674.field1054 == arg0.field1054) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field596[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field654[var10] + var11;
                    method2776(field685[var10], class92.method604(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1373 & 0x8) == 8) {
            method2776(field575, field630 + " " + class92.field1212 + " " + class92.method604(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field608; var14++) {
            if (field705[var14] == 23) {
                field614[var14] = class92.method604(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("fj.iy(IIIIIIIII)V")
    public static final void method2799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class262.method3185(arg0)) {
            Statics.field1208 = null;
            method395(Statics.field2200[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1208 != null) {
                method395(Statics.field1208, -1412584499, arg1, arg2, arg3, arg4, Statics.field1264, Statics.field1605, arg7);
                Statics.field1208 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field595[var8] = true;
            }
        } else {
            field595[arg7] = true;
        }
    }

    @ObfuscatedName("aq.ij([Ljf;IIIIIIIII)V")
    public static final void method395(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class410.method6519(arg2, arg3, arg4, arg5);
        class211.method3808();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class262 var10 = arg0[var9];
            if (var10 != null && (var10.field3071 == arg1 || arg1 == -1412584499 && field739 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field683[field672] = var10.field3065 + arg6;
                    field684[field672] = var10.field3123 + arg7;
                    field691[field672] = var10.field3067;
                    field516[field672] = var10.field3068;
                    var11 = ++field672 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3127 = var11;
                var10.field3108 = field555;
                if (!var10.field3060 || !method2228(var10)) {
                    if (var10.field3056 > 0) {
                        method2555(var10);
                    }
                    int var12 = var10.field3065 + arg6;
                    int var13 = var10.field3123 + arg7;
                    int var14 = var10.field3083;
                    if (field739 == var10) {
                        if (arg1 != -1412584499 && !var10.field3093) {
                            Statics.field1208 = arg0;
                            Statics.field1264 = arg6;
                            Statics.field1605 = arg7;
                            continue;
                        }
                        if (field655 && field649) {
                            int var15 = class33.field212;
                            int var16 = class33.field221;
                            int var17 = var15 - field646;
                            int var18 = var16 - field647;
                            if (var17 < field650) {
                                var17 = field650;
                            }
                            if (var10.field3067 + var17 > field650 + field568.field3067) {
                                var17 = field650 + field568.field3067 - var10.field3067;
                            }
                            if (var18 < field651) {
                                var18 = field651;
                            }
                            if (var10.field3068 + var18 > field651 + field568.field3068) {
                                var18 = field651 + field568.field3068 - var10.field3068;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3093) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3143 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3143 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3067 + var12;
                        int var26 = var10.field3068 + var13;
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
                        int var29 = var10.field3067 + var12;
                        int var30 = var10.field3068 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3060 || var19 < var21 && var20 < var22) {
                        if (var10.field3056 != 0) {
                            if (var10.field3056 == 1336) {
                                if (field703) {
                                    var13 += 15;
                                    Statics.field12.method5242("Fps:" + field176, var10.field3067 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field467) {
                                        var33 = 16711680;
                                    }
                                    Statics.field12.method5242("Mem:" + var32 + "k", var10.field3067 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3056 == 1337) {
                                field641 = var12;
                                field617 = var13;
                                method1864(var12, var13, var10.field3067, var10.field3068);
                                field595[var10.field3127] = true;
                                class410.method6519(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3056 == 1338) {
                                method4168(var10, var12, var13, var11);
                                class410.method6519(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3056 == 1339) {
                                method4170(var10, var12, var13, var11);
                                class410.method6519(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3056 == 1400) {
                                Statics.field1494.method5976(var12, var13, var10.field3067, var10.field3068, field555);
                            }
                            if (var10.field3056 == 1401) {
                                Statics.field1494.method5821(var12, var13, var10.field3067, var10.field3068);
                            }
                            if (var10.field3056 == 1402) {
                                Statics.field857.method2103(var12, field555);
                            }
                        }
                        if (var10.field3143 == 0) {
                            if (!var10.field3060 && method2228(var10) && Statics.field2002 != var10) {
                                continue;
                            }
                            if (!var10.field3060) {
                                if (var10.field3117 > var10.field3076 - var10.field3068) {
                                    var10.field3117 = var10.field3076 - var10.field3068;
                                }
                                if (var10.field3117 < 0) {
                                    var10.field3117 = 0;
                                }
                            }
                            method395(arg0, var10.field3052, var19, var20, var21, var22, var12 - var10.field3073, var13 - var10.field3117, var11);
                            if (var10.field3186 != null) {
                                method395(var10.field3186, var10.field3052, var19, var20, var21, var22, var12 - var10.field3073, var13 - var10.field3117, var11);
                            }
                            class80 var34 = (class80) field632.method6034((long) var10.field3052);
                            if (var34 != null) {
                                method2799(var34.field1013, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class410.method6519(arg2, arg3, arg4, arg5);
                            class211.method3808();
                        }
                        if (field689 || field652[var11] || field687 > 1) {
                            if (var10.field3143 == 0 && !var10.field3060 && var10.field3076 > var10.field3068) {
                                method2168(var10.field3067 + var12, var13, var10.field3117, var10.field3068, var10.field3076);
                            }
                            if (var10.field3143 != 1) {
                                if (var10.field3143 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3064; var36++) {
                                        for (int var37 = 0; var37 < var10.field3063; var37++) {
                                            int var38 = (var10.field3119 + 32) * var37 + var12;
                                            int var39 = (var10.field3120 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3137[var35];
                                                var39 += var10.field3059[var35];
                                            }
                                            if (var10.field3180[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3180[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2929 == var10 && field579 == var35) {
                                                    class414 var43;
                                                    if (field624 == 1 && Statics.field422 == var35 && Statics.field226 == var10.field3052) {
                                                        var43 = class170.method2402(var42, var10.field3131[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class170.method2402(var42, var10.field3131[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method3522(var10);
                                                    } else if (Statics.field2929 == var10 && field579 == var35) {
                                                        int var44 = class33.field212 - field484;
                                                        int var45 = class33.field221 - field581;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field584 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6718(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class262 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class410.field4370 && var46.field3117 > 0) {
                                                                int var47 = field532 * (class410.field4370 - var39 - var45) / 3;
                                                                if (var47 > field532 * 10) {
                                                                    var47 = field532 * 10;
                                                                }
                                                                if (var47 > var46.field3117) {
                                                                    var47 = var46.field3117;
                                                                }
                                                                var46.field3117 -= var47;
                                                                field581 += var47;
                                                                method3522(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class410.field4368 && var46.field3117 < var46.field3076 - var46.field3068) {
                                                                int var48 = field532 * (var39 + var45 + 32 - class410.field4368) / 3;
                                                                if (var48 > field532 * 10) {
                                                                    var48 = field532 * 10;
                                                                }
                                                                if (var48 > var46.field3076 - var46.field3068 - var46.field3117) {
                                                                    var48 = var46.field3076 - var46.field3068 - var46.field3117;
                                                                }
                                                                var46.field3117 += var48;
                                                                field581 -= var48;
                                                                method3522(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2038 == var10 && field578 == var35) {
                                                        var43.method6718(var38, var39, 128);
                                                    } else {
                                                        var43.method6645(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3172 != null && var35 < 20) {
                                                class414 var49 = var10.method4546(var35);
                                                if (var49 != null) {
                                                    var49.method6645(var38, var39);
                                                } else if (class262.field3050) {
                                                    method3522(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3143 == 3) {
                                    int var50;
                                    if (method2501(var10)) {
                                        var50 = var10.field3104;
                                        if (Statics.field2002 == var10 && var10.field3161 != 0) {
                                            var50 = var10.field3161;
                                        }
                                    } else {
                                        var50 = var10.field3077;
                                        if (Statics.field2002 == var10 && var10.field3079 != 0) {
                                            var50 = var10.field3079;
                                        }
                                    }
                                    if (var10.field3168) {
                                        switch(var10.field3197.field4380) {
                                            case 1:
                                                class410.method6546(var12, var13, var10.field3067, var10.field3068, var10.field3077, var10.field3104);
                                                break;
                                            case 2:
                                                class410.method6528(var12, var13, var10.field3067, var10.field3068, var10.field3077, var10.field3104, 255 - (var10.field3083 & 0xFF), 255 - (var10.field3084 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class410.method6580(var12, var13, var10.field3067, var10.field3068, var50);
                                                } else {
                                                    class410.method6526(var12, var13, var10.field3067, var10.field3068, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class410.method6530(var12, var13, var10.field3067, var10.field3068, var50);
                                    } else {
                                        class410.method6531(var12, var13, var10.field3067, var10.field3068, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3143 == 4) {
                                    class315 var51 = var10.method4545();
                                    if (var51 != null) {
                                        String var52 = var10.field3113;
                                        int var53;
                                        if (method2501(var10)) {
                                            var53 = var10.field3104;
                                            if (Statics.field2002 == var10 && var10.field3161 != 0) {
                                                var53 = var10.field3161;
                                            }
                                            if (var10.field3171.length() > 0) {
                                                var52 = var10.field3171;
                                            }
                                        } else {
                                            var53 = var10.field3077;
                                            if (Statics.field2002 == var10 && var10.field3079 != 0) {
                                                var53 = var10.field3079;
                                            }
                                        }
                                        if (var10.field3060 && var10.field3066 != -1) {
                                            class170 var54 = class170.method2586(var10.field3066);
                                            var52 = var54.field1887;
                                            if (var52 == null) {
                                                var52 = class283.field3566;
                                            }
                                            if ((var54.field1898 == 1 || var10.field3193 != 1) && var10.field3193 != -1) {
                                                var52 = class92.method604(16748608) + var52 + class92.field1216 + " " + 'x' + method1940(var10.field3193);
                                            }
                                        }
                                        if (field637 == var10) {
                                            var52 = class283.field3488;
                                            var53 = var10.field3077;
                                        }
                                        if (!var10.field3060) {
                                            var52 = method4880(var52, var10);
                                        }
                                        var51.method5169(var52, var12, var13, var10.field3067, var10.field3068, var53, var10.field3118 ? 0 : -1, var10.field3116, var10.field3177, var10.field3115);
                                    } else if (class262.field3050) {
                                        method3522(var10);
                                    }
                                } else if (var10.field3143 == 5) {
                                    if (var10.field3060) {
                                        class414 var56;
                                        if (var10.field3066 == -1) {
                                            var56 = var10.method4544(false);
                                        } else {
                                            var56 = class170.method2402(var10.field3066, var10.field3193, var10.field3091, var10.field3092, var10.field3111, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4397;
                                            int var58 = var56.field4399;
                                            if (var10.field3090) {
                                                class410.method6590(var12, var13, var10.field3067 + var12, var10.field3068 + var13);
                                                int var59 = (var10.field3067 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3068 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3089 != 0) {
                                                            var56.method6696(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3089, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6645(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6718(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class410.method6519(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3067 * 4096 / var57;
                                                if (var10.field3089 != 0) {
                                                    var56.method6696(var10.field3067 / 2 + var12, var10.field3068 / 2 + var13, var10.field3089, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6653(var12, var13, var10.field3067, var10.field3068, 256 - (var14 & 0xFF));
                                                } else if (var10.field3067 == var57 && var10.field3068 == var58) {
                                                    var56.method6645(var12, var13);
                                                } else {
                                                    var56.method6647(var12, var13, var10.field3067, var10.field3068);
                                                }
                                            }
                                        } else if (class262.field3050) {
                                            method3522(var10);
                                        }
                                    } else {
                                        class414 var55 = var10.method4544(method2501(var10));
                                        if (var55 != null) {
                                            var55.method6645(var12, var13);
                                        } else if (class262.field3050) {
                                            method3522(var10);
                                        }
                                    }
                                } else if (var10.field3143 == 6) {
                                    boolean var64 = method2501(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3100;
                                    } else {
                                        var65 = var10.field3099;
                                    }
                                    class220 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3066 != -1) {
                                        class170 var68 = class170.method2586(var10.field3066);
                                        if (var68 != null) {
                                            class170 var69 = var68.method3026(var10.field3193);
                                            var66 = var69.method3025(1);
                                            if (var66 == null) {
                                                method3522(var10);
                                            } else {
                                                var66.method4095();
                                                var67 = var66.field2444 / 2;
                                            }
                                        }
                                    } else if (var10.field3095 == 5) {
                                        if (var10.field3096 == 0) {
                                            var66 = field737.method4514((class172) null, -1, (class172) null, -1);
                                        } else {
                                            var66 = Statics.field1674.method1799();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4547((class172) null, -1, var64, Statics.field1674.field1042);
                                        if (var66 == null && class262.field3050) {
                                            method3522(var10);
                                        }
                                    } else {
                                        class172 var70 = class172.method589(var65);
                                        var66 = var10.method4547(var70, var10.field3184, var64, Statics.field1674.field1042);
                                        if (var66 == null && class262.field3050) {
                                            method3522(var10);
                                        }
                                    }
                                    class211.method3753(var10.field3067 / 2 + var12, var10.field3068 / 2 + var13);
                                    int var71 = var10.field3103 * class211.field2362[var10.field3081] >> 16;
                                    int var72 = var10.field3103 * class211.field2370[var10.field3081] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3060) {
                                            var66.method4095();
                                            if (var10.field3109) {
                                                var66.method4068(0, var10.field3164, var10.field3105, var10.field3081, var10.field3101, var10.field3102 + var67 + var71, var10.field3102 + var72, var10.field3103);
                                            } else {
                                                var66.method4082(0, var10.field3164, var10.field3105, var10.field3081, var10.field3101, var10.field3102 + var67 + var71, var10.field3102 + var72);
                                            }
                                        } else {
                                            var66.method4082(0, var10.field3164, 0, var10.field3081, 0, var71, var72);
                                        }
                                    }
                                    class211.method3752();
                                } else {
                                    if (var10.field3143 == 7) {
                                        class315 var73 = var10.method4545();
                                        if (var73 == null) {
                                            if (class262.field3050) {
                                                method3522(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3064; var75++) {
                                            for (int var76 = 0; var76 < var10.field3063; var76++) {
                                                if (var10.field3180[var74] > 0) {
                                                    class170 var77 = class170.method2586(var10.field3180[var74] - 1);
                                                    String var78;
                                                    if (var77.field1898 != 1 && var10.field3131[var74] == 1) {
                                                        var78 = class92.method604(16748608) + var77.field1887 + class92.field1216;
                                                    } else {
                                                        var78 = class92.method604(16748608) + var77.field1887 + class92.field1216 + " " + 'x' + method1940(var10.field3131[var74]);
                                                    }
                                                    int var79 = (var10.field3119 + 115) * var76 + var12;
                                                    int var80 = (var10.field3120 + 12) * var75 + var13;
                                                    if (var10.field3116 == 0) {
                                                        var73.method5165(var78, var79, var80, var10.field3077, var10.field3118 ? 0 : -1);
                                                    } else if (var10.field3116 == 1) {
                                                        var73.method5168(var78, var10.field3067 / 2 + var79, var80, var10.field3077, var10.field3118 ? 0 : -1);
                                                    } else {
                                                        var73.method5242(var78, var10.field3067 + var79 - 1, var80, var10.field3077, var10.field3118 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3143 == 8 && Statics.field3248 == var10 && field715 == field622) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class315 var83 = Statics.field12;
                                        String var84 = var10.field3113;
                                        String var85 = method4880(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class92.field1218);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5159(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3826 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3067 + var12 - 5 - var81;
                                        int var90 = var10.field3068 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class410.method6580(var89, var90, var81, var82, 16777120);
                                        class410.method6530(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3113;
                                        int var92 = var83.field3826 + var90 + 2;
                                        String var93 = method4880(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class92.field1218);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5165(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3826 + 1;
                                        }
                                    }
                                    if (var10.field3143 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3086) {
                                            var96 = var12;
                                            var97 = var10.field3068 + var13;
                                            var98 = var10.field3067 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3067 + var12;
                                            var99 = var10.field3068 + var13;
                                        }
                                        if (var10.field3085 == 1) {
                                            class410.method6536(var96, var97, var98, var99, var10.field3077);
                                        } else {
                                            method6153(var96, var97, var98, var99, var10.field3077, var10.field3085);
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

    @ObfuscatedName("og.iv(IIIIIII)V")
    public static final void method6153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class410.field4371;
        int var18 = arg1 - class410.field4370;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class211.method3758(var19, var20, var21);
        class211.method3761(var23, var24, var25, var19, var20, var21, arg4);
        class211.method3758(var19, var21, var22);
        class211.method3761(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("kt.iu(Ljava/lang/String;Ljf;I)Ljava/lang/String;")
    public static String method4880(String arg0, class262 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3214(method2393(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("bb.ic(IB)Ljava/lang/String;")
    public static final String method1940(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class92.field1213 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class92.method604(65408) + var1.substring(0, var1.length() - 8) + class283.field3317 + " " + class92.field1215 + var1 + class92.field1219 + class92.field1216;
        } else if (var1.length() > 6) {
            return " " + class92.method604(16777215) + var1.substring(0, var1.length() - 4) + class283.field3493 + " " + class92.field1215 + var1 + class92.field1219 + class92.field1216;
        } else {
            return " " + class92.method604(16776960) + var1 + class92.field1216;
        }
    }

    @ObfuscatedName("client.iw(ZI)V")
    public final void method1105(boolean arg0) {
        method1945(field631, Statics.field184, Statics.field137, arg0);
    }

    @ObfuscatedName("client.iq(Ljf;I)V")
    public void method1091(class262 arg0) {
        class262 var2 = arg0.field3071 == -1 ? null : class262.method2355(arg0.field3071);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field184;
            var4 = Statics.field137;
        } else {
            var3 = var2.field3067;
            var4 = var2.field3068;
        }
        method3610(arg0, var3, var4, false);
        method4234(arg0, var3, var4);
    }

    @ObfuscatedName("ci.ie([Ljf;Ljf;ZB)V")
    public static void method1989(class262[] arg0, class262 arg1, boolean arg2) {
        int var3 = arg1.field3075 == 0 ? arg1.field3067 : arg1.field3075;
        int var4 = arg1.field3076 == 0 ? arg1.field3068 : arg1.field3076;
        method3221(arg0, arg1.field3052, var3, var4, arg2);
        if (arg1.field3186 != null) {
            method3221(arg1.field3186, arg1.field3052, var3, var4, arg2);
        }
        class80 var5 = (class80) field632.method6034((long) arg1.field3052);
        if (var5 != null) {
            method1945(var5.field1013, var3, var4, arg2);
        }
        if (arg1.field3056 == 1337) {
        }
    }

    @ObfuscatedName("by.is(IIIZI)V")
    public static final void method1945(int arg0, int arg1, int arg2, boolean arg3) {
        if (class262.method3185(arg0)) {
            method3221(Statics.field2200[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fo.it([Ljf;IIIZB)V")
    public static void method3221(class262[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class262 var6 = arg0[var5];
            if (var6 != null && var6.field3071 == arg1) {
                method3610(var6, arg2, arg3, arg4);
                method4234(var6, arg2, arg3);
                if (var6.field3073 > var6.field3075 - var6.field3067) {
                    var6.field3073 = var6.field3075 - var6.field3067;
                }
                if (var6.field3073 < 0) {
                    var6.field3073 = 0;
                }
                if (var6.field3117 > var6.field3076 - var6.field3068) {
                    var6.field3117 = var6.field3076 - var6.field3068;
                }
                if (var6.field3117 < 0) {
                    var6.field3117 = 0;
                }
                if (var6.field3143 == 0) {
                    method1989(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ge.jx(Ljf;IIZB)V")
    public static void method3610(class262 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3067;
        int var5 = arg0.field3068;
        if (arg0.field3174 == 0) {
            arg0.field3067 = arg0.field3063;
        } else if (arg0.field3174 == 1) {
            arg0.field3067 = arg1 - arg0.field3063;
        } else if (arg0.field3174 == 2) {
            arg0.field3067 = arg0.field3063 * arg1 >> 14;
        }
        if (arg0.field3159 == 0) {
            arg0.field3068 = arg0.field3064;
        } else if (arg0.field3159 == 1) {
            arg0.field3068 = arg2 - arg0.field3064;
        } else if (arg0.field3159 == 2) {
            arg0.field3068 = arg0.field3064 * arg2 >> 14;
        }
        if (arg0.field3174 == 4) {
            arg0.field3067 = arg0.field3069 * arg0.field3068 / arg0.field3070;
        }
        if (arg0.field3159 == 4) {
            arg0.field3068 = arg0.field3070 * arg0.field3067 / arg0.field3069;
        }
        if (arg0.field3056 == 1337) {
            field643 = arg0;
        }
        if (arg3 && arg0.field3185 != null && (arg0.field3067 != var4 || arg0.field3068 != var5)) {
            class81 var6 = new class81();
            var6.field1023 = arg0;
            var6.field1016 = arg0.field3185;
            field674.method4980(var6);
        }
    }

    @ObfuscatedName("im.jf(Ljf;IIB)V")
    public static void method4234(class262 arg0, int arg1, int arg2) {
        if (arg0.field3121 == 0) {
            arg0.field3065 = arg0.field3061;
        } else if (arg0.field3121 == 1) {
            arg0.field3065 = (arg1 - arg0.field3067) / 2 + arg0.field3061;
        } else if (arg0.field3121 == 2) {
            arg0.field3065 = arg1 - arg0.field3067 - arg0.field3061;
        } else if (arg0.field3121 == 3) {
            arg0.field3065 = arg0.field3061 * arg1 >> 14;
        } else if (arg0.field3121 == 4) {
            arg0.field3065 = (arg0.field3061 * arg1 >> 14) + (arg1 - arg0.field3067) / 2;
        } else {
            arg0.field3065 = arg1 - arg0.field3067 - (arg0.field3061 * arg1 >> 14);
        }
        if (arg0.field3058 == 0) {
            arg0.field3123 = arg0.field3146;
        } else if (arg0.field3058 == 1) {
            arg0.field3123 = (arg2 - arg0.field3068) / 2 + arg0.field3146;
        } else if (arg0.field3058 == 2) {
            arg0.field3123 = arg2 - arg0.field3068 - arg0.field3146;
        } else if (arg0.field3058 == 3) {
            arg0.field3123 = arg0.field3146 * arg2 >> 14;
        } else if (arg0.field3058 == 4) {
            arg0.field3123 = (arg0.field3146 * arg2 >> 14) + (arg2 - arg0.field3068) / 2;
        } else {
            arg0.field3123 = arg2 - arg0.field3068 - (arg0.field3146 * arg2 >> 14);
        }
    }

    @ObfuscatedName("t.jl(Ljf;IIIIIII)V")
    public static final void method169(class262 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field466) {
            field633 = 32;
        } else {
            field633 = 0;
        }
        field466 = false;
        if (class33.field211 == 1 || !Statics.field455 && class33.field211 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3117 -= 4;
                method3522(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3117 += 4;
                method3522(arg0);
            } else if (arg5 >= arg1 - field633 && arg5 < field633 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3117 = (arg4 - arg3) * var8 / var9;
                method3522(arg0);
                field466 = true;
            }
        }
        if (field673 == 0) {
            return;
        }
        int var10 = arg0.field3067;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3117 += field673 * 45;
            method3522(arg0);
        }
    }

    @ObfuscatedName("cw.jy(IIIIII)V")
    public static final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field170[0].method6611(arg0, arg1);
        Statics.field170[1].method6611(arg0, arg1 + arg3 - 16);
        class410.method6580(arg0, arg1 + 16, 16, arg3 - 32, field629);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class410.method6580(arg0, arg1 + 16 + var6, 16, var5, field535);
        class410.method6534(arg0, arg1 + 16 + var6, var5, field507);
        class410.method6534(arg0 + 1, arg1 + 16 + var6, var5, field507);
        class410.method6532(arg0, arg1 + 16 + var6, 16, field507);
        class410.method6532(arg0, arg1 + 17 + var6, 16, field507);
        class410.method6534(arg0 + 15, arg1 + 16 + var6, var5, field536);
        class410.method6534(arg0 + 14, arg1 + 17 + var6, var5 - 1, field536);
        class410.method6532(arg0, arg1 + 15 + var6 + var5, 16, field536);
        class410.method6532(arg0 + 1, arg1 + 14 + var6 + var5, 15, field536);
    }

    @ObfuscatedName("fo.jw(IB)Ljava/lang/String;")
    public static final String method3214(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dk.jt(Ljf;I)Z")
    public static final boolean method2501(class262 arg0) {
        if (arg0.field3175 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3175.length; var1++) {
            int var2 = method2393(arg0, var1);
            int var3 = arg0.field3176[var1];
            if (arg0.field3175[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3175[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3175[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dp.jj(Ljf;II)I")
    public static final int method2393(class262 arg0, int arg1) {
        if (arg0.field3078 == null || arg1 >= arg0.field3078.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3078[arg1];
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
                    var7 = field603[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field604[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field605[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class262 var11 = class262.method2355(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class170.method2586(var12).field1900 || field623)) {
                        for (int var13 = 0; var13 < var11.field3180.length; var13++) {
                            if (var12 + 1 == var11.field3180[var13]) {
                                var7 += var11.field3131[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class257.field3015[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class272.field3252[field604[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class257.field3015[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1674.field1058;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class272.field3249[var14]) {
                            var7 += field604[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class262 var17 = class262.method2355(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class170.method2586(var18).field1900 || field623)) {
                        for (int var19 = 0; var19 < var17.field3180.length; var19++) {
                            if (var18 + 1 == var17.field3180[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field638;
                }
                if (var6 == 12) {
                    var7 = field639;
                }
                if (var6 == 13) {
                    int var20 = class257.field3015[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class257.method2410(var22);
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
                    var7 = (Statics.field1674.field1092 >> 7) + Statics.field92;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1674.field1085 >> 7) + Statics.field4007;
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

    @ObfuscatedName("fe.jz(Ljf;Lff;IIZI)V")
    public static final void method3016(class262 arg0, class170 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field1879;
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
            var7 = class283.field3319;
        }
        if (var6 != -1 && var7 != null) {
            method4164(var7, class92.method604(16748608) + arg1.field1887, var6, arg1.field1885, arg2, arg0.field3052, arg4);
        }
    }

    @ObfuscatedName("dj.jn(Ljf;III)V")
    public static final void method2395(class262 arg0, int arg1, int arg2) {
        if (arg0.field3055 == 1) {
            method2776(arg0.field3179, "", 24, 0, 0, arg0.field3052);
        }
        if (arg0.field3055 == 2 && !field626) {
            String var3 = method291(arg0);
            if (var3 != null) {
                method2776(var3, class92.method604(65280) + arg0.field3178, 25, 0, -1, arg0.field3052);
            }
        }
        if (arg0.field3055 == 3) {
            method2776(class283.field3489, "", 26, 0, 0, arg0.field3052);
        }
        if (arg0.field3055 == 4) {
            method2776(arg0.field3179, "", 28, 0, 0, arg0.field3052);
        }
        if (arg0.field3055 == 5) {
            method2776(arg0.field3179, "", 29, 0, 0, arg0.field3052);
        }
        if (arg0.field3055 == 6 && field637 == null) {
            method2776(arg0.field3179, "", 30, 0, -1, arg0.field3052);
        }
        if (arg0.field3143 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3068; var5++) {
                for (int var6 = 0; var6 < arg0.field3067; var6++) {
                    int var7 = (arg0.field3119 + 32) * var6;
                    int var8 = (arg0.field3120 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3137[var4];
                        var8 += arg0.field3059[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field699 = var4;
                        Statics.field3276 = arg0;
                        if (arg0.field3180[var4] > 0) {
                            class170 var9 = class170.method2586(arg0.field3180[var4] - 1);
                            if (field624 == 1 && class263.method1939(method2052(arg0))) {
                                if (Statics.field226 != arg0.field3052 || Statics.field422 != var4) {
                                    method2776(class283.field3480, field625 + " " + class92.field1212 + " " + class92.method604(16748608) + var9.field1887, 31, var9.field1885, var4, arg0.field3052);
                                }
                            } else if (!field626 || !class263.method1939(method2052(arg0))) {
                                String[] var10 = var9.field1879;
                                int var11 = -1;
                                if (field503 && method2331()) {
                                    var11 = var9.method3032();
                                }
                                if (class263.method1939(method2052(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method3016(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                if (class263.method2379(method2052(arg0))) {
                                    method2776(class283.field3480, class92.method604(16748608) + var9.field1887, 38, var9.field1885, var4, arg0.field3052);
                                }
                                if (class263.method1939(method2052(arg0))) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var11 != var13) {
                                            method3016(arg0, var9, var4, var13, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method3016(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var14 = arg0.field3124;
                                if (var14 != null) {
                                    for (int var15 = 4; var15 >= 0; var15--) {
                                        if (var14[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 39;
                                            }
                                            if (var15 == 1) {
                                                var16 = 40;
                                            }
                                            if (var15 == 2) {
                                                var16 = 41;
                                            }
                                            if (var15 == 3) {
                                                var16 = 42;
                                            }
                                            if (var15 == 4) {
                                                var16 = 43;
                                            }
                                            method2776(var14[var15], class92.method604(16748608) + var9.field1887, var16, var9.field1885, var4, arg0.field3052);
                                        }
                                    }
                                }
                                method2776(class283.field3586, class92.method604(16748608) + var9.field1887, 1005, var9.field1885, var4, arg0.field3052);
                            } else if ((Statics.field1373 & 0x10) == 16) {
                                method2776(field575, field630 + " " + class92.field1212 + " " + class92.method604(16748608) + var9.field1887, 32, var9.field1885, var4, arg0.field3052);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3060) {
            return;
        }
        if (!field626) {
            for (int var17 = 9; var17 >= 5; var17--) {
                String var18 = method758(arg0, var17);
                if (var18 != null) {
                    method2776(var18, arg0.field3048, 1007, var17 + 1, arg0.field3053, arg0.field3052);
                }
            }
            String var19 = method291(arg0);
            if (var19 != null) {
                method2776(var19, arg0.field3048, 25, 0, arg0.field3053, arg0.field3052);
            }
            for (int var20 = 4; var20 >= 0; var20--) {
                String var21 = method758(arg0, var20);
                if (var21 != null) {
                    method4164(var21, arg0.field3048, 57, var20 + 1, arg0.field3053, arg0.field3052, arg0.field3191);
                }
            }
            if (class263.method4220(method2052(arg0))) {
                method2776(class283.field3323, "", 30, 0, arg0.field3053, arg0.field3052);
            }
        } else if (class263.method271(method2052(arg0)) && (Statics.field1373 & 0x20) == 32) {
            method2776(field575, field630 + " " + class92.field1212 + " " + arg0.field3048, 58, 0, arg0.field3053, arg0.field3052);
        }
    }

    @ObfuscatedName("cz.je(ZI)V")
    public static void method2262(boolean arg0) {
        field618 = arg0;
    }

    @ObfuscatedName("aa.jv(I)Z")
    public static boolean method991() {
        return field618;
    }

    @ObfuscatedName("cb.ji(I)Z")
    public static boolean method2331() {
        return field618 || class24.field118[81];
    }

    @ObfuscatedName("ea.jh([Ljf;IIIIIIII)V")
    public static final void method2552(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class262 var9 = arg0[var8];
            if (var9 != null && var9.field3071 == arg1 && (!var9.field3060 || var9.field3143 == 0 || var9.field3138 || method2052(var9) != 0 || field568 == var9 || var9.field3056 == 1338)) {
                if (var9.field3060) {
                    if (method2228(var9)) {
                        continue;
                    }
                } else if (var9.field3143 == 0 && Statics.field2002 != var9 && method2228(var9)) {
                    continue;
                }
                int var10 = var9.field3065 + arg6;
                int var11 = var9.field3123 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3143 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field3143 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field3067 + var10;
                    int var19 = var9.field3068 + var11;
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
                    int var22 = var9.field3067 + var10;
                    int var23 = var9.field3068 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field739 == var9) {
                    field681 = true;
                    field653 = var10;
                    field469 = var11;
                }
                boolean var24 = false;
                if (var9.field3126) {
                    switch(field480) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3052 >>> 16 == field634) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field634 == var9.field3052) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field3060 || var12 < var14 && var13 < var15) {
                    if (var9.field3060) {
                        if (var9.field3196) {
                            if (class33.field212 >= var12 && class33.field221 >= var13 && class33.field212 < var14 && class33.field221 < var15) {
                                for (class81 var25 = (class81) field674.method4981(); var25 != null; var25 = (class81) field674.method4987()) {
                                    if (var25.field1017) {
                                        var25.method5752();
                                        var25.field1023.field3150 = false;
                                    }
                                }
                                if (Statics.field1506 == 0) {
                                    field739 = null;
                                    field568 = null;
                                }
                                if (!field607) {
                                    method1658();
                                }
                            }
                        } else if (var9.field3097 && class33.field212 >= var12 && class33.field221 >= var13 && class33.field212 < var14 && class33.field221 < var15) {
                            for (class81 var26 = (class81) field674.method4981(); var26 != null; var26 = (class81) field674.method4987()) {
                                if (var26.field1017 && var26.field1023.field3080 == var26.field1016) {
                                    var26.method5752();
                                }
                            }
                        }
                    }
                    int var27 = class33.field212;
                    int var28 = class33.field221;
                    if (class33.field219 != 0) {
                        var27 = class33.field220;
                        var28 = class33.field224;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field3056 == 1337) {
                        if (!field473 && !field607 && var29) {
                            method358(var27, var28, var12, var13);
                        }
                    } else if (var9.field3056 == 1338) {
                        method13(var9, var10, var11);
                    } else {
                        if (var9.field3056 == 1400) {
                            Statics.field1494.method5942(class33.field212, class33.field221, var29, var10, var11, var9.field3067, var9.field3068);
                        }
                        if (!field607 && var29) {
                            if (var9.field3056 == 1400) {
                                Statics.field1494.method5849(var10, var11, var9.field3067, var9.field3068, var27, var28);
                            } else {
                                method2395(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3181.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3181[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3181[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3195 != null) {
                                            var34 = class24.field118[var9.field3181[var30][var33]];
                                        }
                                        if (method1974(var9.field3181[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3195 != null && var9.field3195[var30] > field555) {
                                                break;
                                            }
                                            byte var35 = var9.field3106[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class24.field118[86] && !class24.field118[82] && !class24.field118[81]) && ((var35 & 0x2) == 0 || class24.field118[86]) && ((var35 & 0x1) == 0 || class24.field118[82]) && ((var35 & 0x4) == 0 || class24.field118[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method4841(var30 + 1, var9.field3052, var9.field3053, var9.field3066, "");
                                    } else if (var30 == 10) {
                                        method4596();
                                        method983(var9.field3052, var9.field3053, class263.method1943(method2052(var9)), var9.field3066);
                                        field575 = method291(var9);
                                        if (field575 == null) {
                                            field575 = class283.field3566;
                                        }
                                        field630 = var9.field3048 + class92.method604(16777215);
                                    }
                                    int var36 = var9.field3129[var30];
                                    if (var9.field3195 == null) {
                                        var9.field3195 = new int[var9.field3181.length];
                                    }
                                    if (var9.field3130 == null) {
                                        var9.field3130 = new int[var9.field3181.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3195[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3195[var30] == 0) {
                                        var9.field3195[var30] = field555 + var36 + var9.field3130[var30];
                                    } else {
                                        var9.field3195[var30] = field555 + var36;
                                    }
                                }
                                if (!var31 && var9.field3195 != null) {
                                    var9.field3195[var30] = 0;
                                }
                            }
                        }
                        if (var9.field3060) {
                            boolean var37;
                            if (class33.field212 >= var12 && class33.field221 >= var13 && class33.field212 < var14 && class33.field221 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class33.field211 == 1 || !Statics.field455 && class33.field211 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class33.field219 == 1 || !Statics.field455 && class33.field219 == 4) && class33.field220 >= var12 && class33.field224 >= var13 && class33.field220 < var14 && class33.field224 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method2376(var9, class33.field220 - var10, class33.field224 - var11);
                            }
                            if (var9.field3056 == 1400) {
                                Statics.field1494.method5934(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field739 != null && field739 != var9 && var37 && class263.method4537(method2052(var9))) {
                                field648 = var9;
                            }
                            if (field568 == var9) {
                                field649 = true;
                                field650 = var10;
                                field651 = var11;
                            }
                            if (var9.field3138) {
                                if (var37 && field673 != 0 && var9.field3080 != null) {
                                    class81 var40 = new class81();
                                    var40.field1017 = true;
                                    var40.field1023 = var9;
                                    var40.field1019 = field673;
                                    var40.field1016 = var9.field3080;
                                    field674.method4980(var40);
                                }
                                if (field739 != null || Statics.field2929 != null || field607) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3144 && var39) {
                                    var9.field3144 = true;
                                    if (var9.field3140 != null) {
                                        class81 var41 = new class81();
                                        var41.field1017 = true;
                                        var41.field1023 = var9;
                                        var41.field1018 = class33.field220 - var10;
                                        var41.field1019 = class33.field224 - var11;
                                        var41.field1016 = var9.field3140;
                                        field674.method4980(var41);
                                    }
                                }
                                if (var9.field3144 && var38 && var9.field3062 != null) {
                                    class81 var42 = new class81();
                                    var42.field1017 = true;
                                    var42.field1023 = var9;
                                    var42.field1018 = class33.field212 - var10;
                                    var42.field1019 = class33.field221 - var11;
                                    var42.field1016 = var9.field3062;
                                    field674.method4980(var42);
                                }
                                if (var9.field3144 && !var38) {
                                    var9.field3144 = false;
                                    if (var9.field3142 != null) {
                                        class81 var43 = new class81();
                                        var43.field1017 = true;
                                        var43.field1023 = var9;
                                        var43.field1018 = class33.field212 - var10;
                                        var43.field1019 = class33.field221 - var11;
                                        var43.field1016 = var9.field3142;
                                        field676.method4980(var43);
                                    }
                                }
                                if (var38 && var9.field3198 != null) {
                                    class81 var44 = new class81();
                                    var44.field1017 = true;
                                    var44.field1023 = var9;
                                    var44.field1018 = class33.field212 - var10;
                                    var44.field1019 = class33.field221 - var11;
                                    var44.field1016 = var9.field3198;
                                    field674.method4980(var44);
                                }
                                if (!var9.field3150 && var37) {
                                    var9.field3150 = true;
                                    if (var9.field3054 != null) {
                                        class81 var45 = new class81();
                                        var45.field1017 = true;
                                        var45.field1023 = var9;
                                        var45.field1018 = class33.field212 - var10;
                                        var45.field1019 = class33.field221 - var11;
                                        var45.field1016 = var9.field3054;
                                        field674.method4980(var45);
                                    }
                                }
                                if (var9.field3150 && var37 && var9.field3145 != null) {
                                    class81 var46 = new class81();
                                    var46.field1017 = true;
                                    var46.field1023 = var9;
                                    var46.field1018 = class33.field212 - var10;
                                    var46.field1019 = class33.field221 - var11;
                                    var46.field1016 = var9.field3145;
                                    field674.method4980(var46);
                                }
                                if (var9.field3150 && !var37) {
                                    var9.field3150 = false;
                                    if (var9.field3128 != null) {
                                        class81 var47 = new class81();
                                        var47.field1017 = true;
                                        var47.field1023 = var9;
                                        var47.field1018 = class33.field212 - var10;
                                        var47.field1019 = class33.field221 - var11;
                                        var47.field1016 = var9.field3128;
                                        field676.method4980(var47);
                                    }
                                }
                                if (var9.field3157 != null) {
                                    class81 var48 = new class81();
                                    var48.field1023 = var9;
                                    var48.field1016 = var9.field3157;
                                    field675.method4980(var48);
                                }
                                if (var9.field3051 != null && field658 > var9.field3190) {
                                    if (var9.field3183 == null || field658 - var9.field3190 > 32) {
                                        class81 var53 = new class81();
                                        var53.field1023 = var9;
                                        var53.field1016 = var9.field3051;
                                        field674.method4980(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3190; var49 < field658; var49++) {
                                            int var50 = field669[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3183.length; var51++) {
                                                if (var9.field3183[var51] == var50) {
                                                    class81 var52 = new class81();
                                                    var52.field1023 = var9;
                                                    var52.field1016 = var9.field3051;
                                                    field674.method4980(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3190 = field658;
                                }
                                if (var9.field3153 != null && field660 > var9.field3074) {
                                    if (var9.field3154 == null || field660 - var9.field3074 > 32) {
                                        class81 var58 = new class81();
                                        var58.field1023 = var9;
                                        var58.field1016 = var9.field3153;
                                        field674.method4980(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3074; var54 < field660; var54++) {
                                            int var55 = field659[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3154.length; var56++) {
                                                if (var9.field3154[var56] == var55) {
                                                    class81 var57 = new class81();
                                                    var57.field1023 = var9;
                                                    var57.field1016 = var9.field3153;
                                                    field674.method4980(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3074 = field660;
                                }
                                if (var9.field3155 != null && field526 > var9.field3192) {
                                    if (var9.field3156 == null || field526 - var9.field3192 > 32) {
                                        class81 var63 = new class81();
                                        var63.field1023 = var9;
                                        var63.field1016 = var9.field3155;
                                        field674.method4980(var63);
                                    } else {
                                        label586: for (int var59 = var9.field3192; var59 < field526; var59++) {
                                            int var60 = field661[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3156.length; var61++) {
                                                if (var9.field3156[var61] == var60) {
                                                    class81 var62 = new class81();
                                                    var62.field1023 = var9;
                                                    var62.field1016 = var9.field3155;
                                                    field674.method4980(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3192 = field526;
                                }
                                if (field665 > var9.field3189 && var9.field3136 != null) {
                                    class81 var64 = new class81();
                                    var64.field1023 = var9;
                                    var64.field1016 = var9.field3136;
                                    field674.method4980(var64);
                                }
                                if (field680 > var9.field3189 && var9.field3114 != null) {
                                    class81 var65 = new class81();
                                    var65.field1023 = var9;
                                    var65.field1016 = var9.field3114;
                                    field674.method4980(var65);
                                }
                                if (field667 > var9.field3189 && var9.field3165 != null) {
                                    class81 var66 = new class81();
                                    var66.field1023 = var9;
                                    var66.field1016 = var9.field3165;
                                    field674.method4980(var66);
                                }
                                if (field682 > var9.field3189 && var9.field3057 != null) {
                                    class81 var67 = new class81();
                                    var67.field1023 = var9;
                                    var67.field1016 = var9.field3057;
                                    field674.method4980(var67);
                                }
                                if (field725 > var9.field3189 && var9.field3167 != null) {
                                    class81 var68 = new class81();
                                    var68.field1023 = var9;
                                    var68.field1016 = var9.field3167;
                                    field674.method4980(var68);
                                }
                                if (field537 > var9.field3189 && var9.field3182 != null) {
                                    class81 var69 = new class81();
                                    var69.field1023 = var9;
                                    var69.field1016 = var9.field3182;
                                    field674.method4980(var69);
                                }
                                if (field671 > var9.field3189 && var9.field3173 != null) {
                                    class81 var70 = new class81();
                                    var70.field1023 = var9;
                                    var70.field1016 = var9.field3173;
                                    field674.method4980(var70);
                                }
                                if (field495 > var9.field3189 && var9.field3160 != null) {
                                    class81 var71 = new class81();
                                    var71.field1023 = var9;
                                    var71.field1016 = var9.field3160;
                                    field674.method4980(var71);
                                }
                                var9.field3189 = field656;
                                if (var9.field3141 != null) {
                                    for (int var72 = 0; var72 < field696; var72++) {
                                        class81 var73 = new class81();
                                        var73.field1023 = var9;
                                        var73.field1022 = field698[var72];
                                        var73.field1015 = field697[var72];
                                        var73.field1016 = var9.field3141;
                                        field674.method4980(var73);
                                    }
                                }
                                if (var9.field3162 != null) {
                                    int[] var74 = class24.method53();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1023 = var9;
                                        var76.field1022 = var74[var75];
                                        var76.field1016 = var9.field3162;
                                        field674.method4980(var76);
                                    }
                                }
                                if (var9.field3163 != null) {
                                    int[] var77 = class24.method2585();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1023 = var9;
                                        var79.field1022 = var77[var78];
                                        var79.field1016 = var9.field3163;
                                        field674.method4980(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field3060) {
                            if (field739 != null || Statics.field2929 != null || field607) {
                                continue;
                            }
                            if ((var9.field3148 >= 0 || var9.field3079 != 0) && class33.field212 >= var12 && class33.field221 >= var13 && class33.field212 < var14 && class33.field221 < var15) {
                                if (var9.field3148 >= 0) {
                                    Statics.field2002 = arg0[var9.field3148];
                                } else {
                                    Statics.field2002 = var9;
                                }
                            }
                            if (var9.field3143 == 8 && class33.field212 >= var12 && class33.field221 >= var13 && class33.field212 < var14 && class33.field221 < var15) {
                                Statics.field3248 = var9;
                            }
                            if (var9.field3076 > var9.field3068) {
                                method169(var9, var9.field3067 + var10, var11, var9.field3068, var9.field3076, class33.field212, class33.field221);
                            }
                        }
                        if (var9.field3143 == 0) {
                            method2552(arg0, var9.field3052, var12, var13, var14, var15, var10 - var9.field3073, var11 - var9.field3117);
                            if (var9.field3186 != null) {
                                method2552(var9.field3186, var9.field3052, var12, var13, var14, var15, var10 - var9.field3073, var11 - var9.field3117);
                            }
                            class80 var80 = (class80) field632.method6034((long) var9.field3052);
                            if (var80 != null) {
                                if (var80.field1011 == 0 && class33.field212 >= var12 && class33.field221 >= var13 && class33.field212 < var14 && class33.field221 < var15 && !field607) {
                                    for (class81 var81 = (class81) field674.method4981(); var81 != null; var81 = (class81) field674.method4987()) {
                                        if (var81.field1017) {
                                            var81.method5752();
                                            var81.field1023.field3150 = false;
                                        }
                                    }
                                    if (Statics.field1506 == 0) {
                                        field739 = null;
                                        field568 = null;
                                    }
                                    if (!field607) {
                                        method1658();
                                    }
                                }
                                Statics.method2252(var80.field1013, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cq.jg(II)Z")
    public static boolean method1974(int arg0) {
        for (int var1 = 0; var1 < field696; var1++) {
            if (field698[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ff.jm(III)V")
    public static final void method3074(int arg0, int arg1) {
        if (class262.method3185(arg0)) {
            Statics.method2660(Statics.field2200[arg0], arg1);
        }
    }

    @ObfuscatedName("dc.jk(Ljf;IIB)V")
    public static final void method2376(class262 arg0, int arg1, int arg2) {
        if (field739 != null || field607 || arg0 == null) {
            return;
        }
        class262 var3 = method2366(arg0);
        if (var3 == null) {
            var3 = arg0.field3133;
        }
        if (var3 == null) {
            return;
        }
        field739 = arg0;
        class262 var5 = method2366(arg0);
        if (var5 == null) {
            var5 = arg0.field3133;
        }
        field568 = var5;
        field646 = arg1;
        field647 = arg2;
        Statics.field1506 = 0;
        field655 = false;
        int var7 = field608 - 1;
        if (var7 != -1) {
            method162(var7);
        }
        return;
    }

    @ObfuscatedName("client.jd(I)V")
    public final void method1107() {
        method3522(field739);
        Statics.field1506++;
        if (field681 && field649) {
            int var1 = class33.field212;
            int var2 = class33.field221;
            int var3 = var1 - field646;
            int var4 = var2 - field647;
            if (var3 < field650) {
                var3 = field650;
            }
            if (field739.field3067 + var3 > field650 + field568.field3067) {
                var3 = field650 + field568.field3067 - field739.field3067;
            }
            if (var4 < field651) {
                var4 = field651;
            }
            if (field739.field3068 + var4 > field651 + field568.field3068) {
                var4 = field651 + field568.field3068 - field739.field3068;
            }
            int var5 = var3 - field653;
            int var6 = var4 - field469;
            int var7 = field739.field3134;
            if (Statics.field1506 > field739.field3135 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field655 = true;
            }
            int var8 = field568.field3073 + (var3 - field650);
            int var9 = field568.field3117 + (var4 - field651);
            if (field739.field3147 != null && field655) {
                class81 var10 = new class81();
                var10.field1023 = field739;
                var10.field1018 = var8;
                var10.field1019 = var9;
                var10.field1016 = field739.field3147;
                class64.method3748(var10);
            }
            if (class33.field211 == 0) {
                if (field655) {
                    if (field739.field3082 != null) {
                        class81 var11 = new class81();
                        var11.field1023 = field739;
                        var11.field1018 = var8;
                        var11.field1019 = var9;
                        var11.field1021 = field648;
                        var11.field1016 = field739.field3082;
                        class64.method3748(var11);
                    }
                    if (field648 != null && method2366(field739) != null) {
                        class242 var12 = class242.method3564(class240.field2728, field562.field1277);
                        var12.field2792.method6275(field648.field3066);
                        var12.field2792.method6224(field648.field3053);
                        var12.field2792.method6275(field739.field3053);
                        var12.field2792.method6400(field648.field3052);
                        var12.field2792.method6275(field739.field3066);
                        var12.field2792.method6285(field739.field3052);
                        field562.method2269(var12);
                    }
                } else if (this.method1103()) {
                    this.method1104(field653 + field646, field647 + field469);
                } else if (field608 > 0) {
                    int var13 = field653 + field646;
                    int var14 = field647 + field469;
                    class67 var15 = Statics.field3269;
                    method181(var15.field840, var15.field832, var15.field833, var15.field837, var15.field834, var15.field834, var13, var14);
                    Statics.field3269 = null;
                }
                field739 = null;
            }
        } else if (Statics.field1506 > 1) {
            field739 = null;
        }
    }

    @ObfuscatedName("k.jo(II)V")
    public static void method162(int arg0) {
        Statics.field3269 = new class67();
        Statics.field3269.field840 = field717[arg0];
        Statics.field3269.field832 = field610[arg0];
        Statics.field3269.field833 = field705[arg0];
        Statics.field3269.field837 = field612[arg0];
        Statics.field3269.field834 = field613[arg0];
    }

    @ObfuscatedName("gd.jq(Ljf;I)V")
    public static void method3522(class262 arg0) {
        if (field679 == arg0.field3108) {
            field595[arg0.field3127] = true;
        }
    }

    @ObfuscatedName("ff.ja(I)V")
    public static void method3088() {
        for (class80 var0 = (class80) field632.method6028(); var0 != null; var0 = (class80) field632.method6029()) {
            int var1 = var0.field1013;
            if (class262.method3185(var1)) {
                boolean var2 = true;
                class262[] var3 = Statics.field2200[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3060;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4075;
                    class262 var6 = class262.method2355(var5);
                    if (var6 != null) {
                        method3522(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.jr(II)V")
    public static final void method2028(int arg0) {
        if (!class262.method3185(arg0)) {
            return;
        }
        class262[] var1 = Statics.field2200[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class262 var3 = var1[var2];
            if (var3 != null) {
                var3.field3184 = 0;
                var3.field3151 = 0;
            }
        }
    }

    @ObfuscatedName("jz.ju(II)V")
    public static final void method4643(int arg0) {
        if (class262.method3185(arg0)) {
            method2529(Statics.field2200[arg0], -1);
        }
    }

    @ObfuscatedName("ek.jb([Ljf;II)V")
    public static final void method2529(class262[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class262 var3 = arg0[var2];
            if (var3 != null && var3.field3071 == arg1 && (!var3.field3060 || !method2228(var3))) {
                if (var3.field3143 == 0) {
                    if (!var3.field3060 && method2228(var3) && Statics.field2002 != var3) {
                        continue;
                    }
                    method2529(arg0, var3.field3052);
                    if (var3.field3186 != null) {
                        method2529(var3.field3186, var3.field3052);
                    }
                    class80 var4 = (class80) field632.method6034((long) var3.field3052);
                    if (var4 != null) {
                        method4643(var4.field1013);
                    }
                }
                if (var3.field3143 == 6) {
                    if (var3.field3099 != -1 || var3.field3100 != -1) {
                        boolean var5 = method2501(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3100;
                        } else {
                            var6 = var3.field3099;
                        }
                        if (var6 != -1) {
                            class172 var7 = class172.method589(var6);
                            var3.field3151 += field532;
                            while (var3.field3151 > var7.field1955[var3.field3184]) {
                                var3.field3151 -= var7.field1955[var3.field3184];
                                var3.field3184++;
                                if (var3.field3184 >= var7.field1953.length) {
                                    var3.field3184 -= var7.field1961;
                                    if (var3.field3184 < 0 || var3.field3184 >= var7.field1953.length) {
                                        var3.field3184 = 0;
                                    }
                                }
                                method3522(var3);
                            }
                        }
                    }
                    if (var3.field3166 != 0 && !var3.field3060) {
                        int var8 = var3.field3166 >> 16;
                        int var9 = var3.field3166 << 16 >> 16;
                        int var10 = field532 * var8;
                        int var11 = field532 * var9;
                        var3.field3081 = var3.field3081 + var10 & 0x7FF;
                        var3.field3164 = var3.field3164 + var11 & 0x7FF;
                        method3522(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ml.jc(D)V")
    public static final void method5713(double arg0) {
        class211.method3775(arg0);
        ((class218) Statics.field2369).method4032(arg0);
        class170.field1884.method4207();
        Statics.field4363.field1190 = arg0;
        class89.method1836();
    }

    @ObfuscatedName("l.kg(II)V")
    public static final void method170(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field4363.field1191 == var1) {
            return;
        }
        if (Statics.field4363.field1191 == 0 && field710 != -1) {
            class288 var2 = Statics.field1270;
            int var3 = field710;
            class248.field2923 = 1;
            Statics.field1471 = var2;
            Statics.field4377 = var3;
            Statics.field3668 = 0;
            Statics.field2925 = var1;
            Statics.field975 = false;
            Statics.field2926 = 10000;
            field711 = false;
        } else if (var1 == 0) {
            class248.method3598();
            field711 = false;
        } else {
            class248.method3534(var1);
        }
        Statics.field4363.field1191 = var1;
        class89.method1836();
    }

    @ObfuscatedName("gf.kd(II)V")
    public static final void method3584(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4363.field1192 = var1;
        class89.method1836();
    }

    @ObfuscatedName("ea.kj(IB)V")
    public static final void method2554(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4363.field1187 = var1;
        class89.method1836();
    }

    @ObfuscatedName("fo.ko(IB)V")
    public static final void method3212(int arg0) {
        method3088();
        class63.method5449();
        int var1 = class153.method1947(arg0).field1616;
        if (var1 == 0) {
            return;
        }
        int var2 = class257.field3015[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method5713(0.9D);
            }
            if (var2 == 2) {
                method5713(0.8D);
            }
            if (var2 == 3) {
                method5713(0.7D);
            }
            if (var2 == 4) {
                method5713(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method170(255);
            }
            if (var2 == 1) {
                method170(192);
            }
            if (var2 == 2) {
                method170(128);
            }
            if (var2 == 3) {
                method170(64);
            }
            if (var2 == 4) {
                method170(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method3584(127);
            }
            if (var2 == 1) {
                method3584(96);
            }
            if (var2 == 2) {
                method3584(64);
            }
            if (var2 == 3) {
                method3584(32);
            }
            if (var2 == 4) {
                method3584(0);
            }
        }
        if (var1 == 5) {
            field606 = var2;
        }
        if (var1 == 6) {
            field559 = var2;
        }
        if (var1 == 9) {
            field657 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method2554(127);
            }
            if (var2 == 1) {
                method2554(96);
            }
            if (var2 == 2) {
                method2554(64);
            }
            if (var2 == 3) {
                method2554(32);
            }
            if (var2 == 4) {
                method2554(0);
            }
        }
        if (var1 == 17) {
            field583 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field490 = (class94) class304.method2319(class94.method1854(), var2);
            if (field490 == null) {
                field490 = class94.field1231;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field748 = -1;
            } else {
                field748 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field666 = (class94) class304.method2319(class94.method1854(), var2);
            if (field666 == null) {
                field666 = class94.field1231;
            }
        }
    }

    @ObfuscatedName("em.kk(Ljf;I)V")
    public static final void method2555(class262 arg0) {
        int var1 = arg0.field3056;
        if (var1 == 324) {
            if (field738 == -1) {
                field738 = arg0.field3087;
                field582 = arg0.field3152;
            }
            if (field737.field3024) {
                arg0.field3087 = field738;
            } else {
                arg0.field3087 = field582;
            }
        } else if (var1 == 325) {
            if (field738 == -1) {
                field738 = arg0.field3087;
                field582 = arg0.field3152;
            }
            if (field737.field3024) {
                arg0.field3087 = field582;
            } else {
                arg0.field3087 = field738;
            }
        } else if (var1 == 327) {
            arg0.field3081 = 150;
            arg0.field3164 = (int) (Math.sin((double) field555 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3095 = 5;
            arg0.field3096 = 0;
        } else if (var1 == 328) {
            arg0.field3081 = 150;
            arg0.field3164 = (int) (Math.sin((double) field555 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3095 = 5;
            arg0.field3096 = 1;
        }
    }

    @ObfuscatedName("l.kx(I)V")
    public static final void method183() {
        class242 var0 = class242.method3564(class240.field2713, field562.field1277);
        field562.method2269(var0);
        for (class80 var1 = (class80) field632.method6028(); var1 != null; var1 = (class80) field632.method6029()) {
            if (var1.field1011 == 0 || var1.field1011 == 3) {
                method2191(var1, true);
            }
        }
        if (field637 != null) {
            method3522(field637);
            field637 = null;
        }
    }

    @ObfuscatedName("cc.km(Lcq;ZI)V")
    public static final void method2191(class80 arg0, boolean arg1) {
        int var2 = arg0.field1013;
        int var3 = (int) arg0.field4075;
        arg0.method5752();
        if (arg1 && var2 != -1 && Statics.field1492[var2]) {
            Statics.field3642.method4813(var2);
            if (Statics.field2200[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2200[var2].length; var5++) {
                    if (Statics.field2200[var2][var5] != null) {
                        if (Statics.field2200[var2][var5].field3143 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2200[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2200[var2] = null;
                }
                Statics.field1492[var2] = false;
            }
        }
        method5248(var2);
        class262 var6 = class262.method2355(var3);
        if (var6 != null) {
            method3522(var6);
        }
        for (int var7 = 0; var7 < field608; var7++) {
            if (method2420(field705[var7])) {
                if (var7 < field608 - 1) {
                    for (int var8 = var7; var8 < field608 - 1; var8++) {
                        field613[var8] = field613[var8 + 1];
                        field614[var8] = field614[var8 + 1];
                        field705[var8] = field705[var8 + 1];
                        field612[var8] = field612[var8 + 1];
                        field717[var8] = field717[var8 + 1];
                        field610[var8] = field610[var8 + 1];
                        field733[var8] = field733[var8 + 1];
                    }
                }
                var7--;
                field608--;
            }
        }
        method4606();
        if (field631 != -1) {
            method3074(field631, 1);
        }
    }

    @ObfuscatedName("kr.kr(Ljf;S)Z")
    public static final boolean method4854(class262 arg0) {
        int var1 = arg0.field3056;
        if (var1 == 205) {
            field519 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field737.method4509(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field737.method4515(var4, var5 == 1);
        }
        if (var1 == 324) {
            field737.method4511(false);
        }
        if (var1 == 325) {
            field737.method4511(true);
        }
        if (var1 == 326) {
            class242 var6 = class242.method3564(class240.field2689, field562.field1277);
            field737.method4512(var6.field2792);
            field562.method2269(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hn.kb(Ljf;IIII)V")
    public static final void method4168(class262 arg0, int arg1, int arg2, int arg3) {
        Statics.method178();
        class256 var4 = arg0.method4580(false);
        if (var4 == null) {
            return;
        }
        class410.method6519(arg1, arg2, var4.field3010 + arg1, var4.field3008 + arg2);
        if (field482 == 2 || field482 == 5) {
            class410.method6538(arg1, arg2, 0, var4.field3009, var4.field3007);
        } else {
            int var5 = field541 & 0x7FF;
            int var6 = Statics.field1674.field1092 / 32 + 48;
            int var7 = 464 - Statics.field1674.field1085 / 32;
            Statics.field40.method6662(arg1, arg2, var4.field3010, var4.field3008, var6, var7, var5, 256, var4.field3009, var4.field3007);
            for (int var8 = 0; var8 < field528; var8++) {
                int var9 = field704[var8] * 4 + 2 - Statics.field1674.field1092 / 32;
                int var10 = field474[var8] * 4 + 2 - Statics.field1674.field1085 / 32;
                method3568(arg1, arg2, var9, var10, field644[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class309 var13 = field636[Statics.field3731][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1674.field1092 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1674.field1085 / 32;
                        method3568(arg1, arg2, var14, var15, Statics.field1366[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field511; var16++) {
                class91 var17 = field510[field611[var16]];
                if (var17 != null && var17.method2005()) {
                    class161 var18 = var17.field1210;
                    if (var18 != null && var18.field1731 != null) {
                        var18 = var18.method2813();
                    }
                    if (var18 != null && var18.field1722 && var18.field1734) {
                        int var19 = var17.field1092 / 32 - Statics.field1674.field1092 / 32;
                        int var20 = var17.field1085 / 32 - Statics.field1674.field1085 / 32;
                        method3568(arg1, arg2, var19, var20, Statics.field1366[1], var4);
                    }
                }
            }
            int var21 = class96.field1244;
            int[] var22 = class96.field1239;
            for (int var23 = 0; var23 < var21; var23++) {
                class83 var24 = field587[var22[var23]];
                if (var24 != null && var24.method2005() && !var24.field1062 && Statics.field1674 != var24) {
                    int var25 = var24.field1092 / 32 - Statics.field1674.field1092 / 32;
                    int var26 = var24.field1085 / 32 - Statics.field1674.field1085 / 32;
                    if (var24.method1991()) {
                        method3568(arg1, arg2, var25, var26, Statics.field1366[3], var4);
                    } else if (Statics.field1674.field1054 != 0 && var24.field1054 != 0 && Statics.field1674.field1054 == var24.field1054) {
                        method3568(arg1, arg2, var25, var26, Statics.field1366[4], var4);
                    } else if (var24.method2023()) {
                        method3568(arg1, arg2, var25, var26, Statics.field1366[5], var4);
                    } else if (var24.method2021()) {
                        method3568(arg1, arg2, var25, var26, Statics.field1366[6], var4);
                    } else {
                        method3568(arg1, arg2, var25, var26, Statics.field1366[2], var4);
                    }
                }
            }
            if (field706 != 0 && field555 % 20 < 10) {
                if (field706 == 1 && field732 >= 0 && field732 < field510.length) {
                    class91 var27 = field510[field732];
                    if (var27 != null) {
                        int var28 = var27.field1092 / 32 - Statics.field1674.field1092 / 32;
                        int var29 = var27.field1085 / 32 - Statics.field1674.field1085 / 32;
                        method6054(arg1, arg2, var28, var29, Statics.field2107[1], var4);
                    }
                }
                if (field706 == 2) {
                    int var30 = field729 * 4 - Statics.field92 * 4 + 2 - Statics.field1674.field1092 / 32;
                    int var31 = field504 * 4 - Statics.field4007 * 4 + 2 - Statics.field1674.field1085 / 32;
                    method6054(arg1, arg2, var30, var31, Statics.field2107[1], var4);
                }
                if (field706 == 10 && field485 >= 0 && field485 < field587.length) {
                    class83 var32 = field587[field485];
                    if (var32 != null) {
                        int var33 = var32.field1092 / 32 - Statics.field1674.field1092 / 32;
                        int var34 = var32.field1085 / 32 - Statics.field1674.field1085 / 32;
                        method6054(arg1, arg2, var33, var34, Statics.field2107[1], var4);
                    }
                }
            }
            if (field707 != 0) {
                int var35 = field707 * 4 + 2 - Statics.field1674.field1092 / 32;
                int var36 = field678 * 4 + 2 - Statics.field1674.field1085 / 32;
                method3568(arg1, arg2, var35, var36, Statics.field2107[0], var4);
            }
            if (!Statics.field1674.field1062) {
                class410.method6580(var4.field3010 / 2 + arg1 - 1, var4.field3008 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field554[arg3] = true;
    }

    @ObfuscatedName("hv.ku(Ljf;IIIB)V")
    public static final void method4170(class262 arg0, int arg1, int arg2, int arg3) {
        class256 var4 = arg0.method4580(false);
        if (var4 == null) {
            return;
        }
        if (field482 < 3) {
            Statics.field1363.method6662(arg1, arg2, var4.field3010, var4.field3008, 25, 25, field541, 256, var4.field3009, var4.field3007);
        } else {
            class410.method6538(arg1, arg2, 0, var4.field3009, var4.field3007);
        }
    }

    @ObfuscatedName("nn.kt(IIIILow;Liw;I)V")
    public static final void method6054(int arg0, int arg1, int arg2, int arg3, class414 arg4, class256 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3568(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field541 & 0x7FF;
        int var8 = class211.field2362[var7];
        int var9 = class211.field2370[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3010 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2616.method6635(arg5.field3010 / 2 + arg0 - var17 / 2 + var15, arg5.field3008 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("gp.kh(IIIILow;Liw;B)V")
    public static final void method3568(int arg0, int arg1, int arg2, int arg3, class414 arg4, class256 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field541 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class211.field2362[var6];
        int var9 = class211.field2370[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6661(arg5.field3010 / 2 + var10 - arg4.field4397 / 2, arg5.field3008 / 2 - var11 - arg4.field4399 / 2, arg0, arg1, arg5.field3010, arg5.field3008, arg5.field3009, arg5.field3007);
        } else {
            arg4.method6645(arg5.field3010 / 2 + arg0 + var10 - arg4.field4397 / 2, arg5.field3008 / 2 + arg1 - var11 - arg4.field4399 / 2);
        }
    }

    @ObfuscatedName("cy.kp(B)V")
    public static final void method2327() {
        for (int var0 = 0; var0 < class96.field1244; var0++) {
            class83 var1 = field587[class96.field1239[var0]];
            var1.method1993();
        }
        Iterator var2 = class98.field1267.iterator();
        while (var2.hasNext()) {
            class58 var3 = (class58) var2.next();
            var3.method1048();
        }
        if (Statics.field3704 != null) {
            Statics.field3704.method5431();
        }
    }

    @ObfuscatedName("hr.kv(B)V")
    public static final void method4048() {
        class98.method2126();
        if (Statics.field3704 != null) {
            Statics.field3704.method5426();
        }
    }

    @ObfuscatedName("cu.kq(B)V")
    public static final void method2180() {
        for (int var0 = 0; var0 < class96.field1244; var0++) {
            class83 var1 = field587[class96.field1239[var0]];
            var1.method1996();
        }
    }

    @ObfuscatedName("dw.kl(S)V")
    public static final void method2359() {
        for (int var0 = 0; var0 < class96.field1244; var0++) {
            class83 var1 = field587[class96.field1239[var0]];
            var1.method1998();
        }
    }

    @ObfuscatedName("eq.ke(I)V")
    public static final void method2723() {
        field680 = field656;
    }

    @ObfuscatedName("bd.kz(I)V")
    public static final void method1039() {
        field667 = field656;
        Statics.field16 = true;
    }

    @ObfuscatedName("dc.ks(I)V")
    public static final void method2374() {
        field682 = field656;
        Statics.field163 = true;
    }

    @ObfuscatedName("bh.ka(Ljava/lang/String;I)V")
    public static final void method1085(String arg0) {
        if (!arg0.equals("")) {
            class242 var1 = class242.method3564(class240.field2759, field562.field1277);
            var1.field2792.method6223(Statics.method1282(arg0));
            var1.field2792.method6230(arg0);
            field562.method2269(var1);
        }
    }

    @ObfuscatedName("m.kn(I)V")
    public static final void method303() {
        class242 var0 = class242.method3564(class240.field2759, field562.field1277);
        var0.field2792.method6223(0);
        field562.method2269(var0);
    }

    @ObfuscatedName("fl.kw(IIB)V")
    public static final void method2949(int arg0, int arg1) {
        class137 var2 = arg0 >= 0 ? field494[arg0] : Statics.field1368;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2538()) {
            return;
        }
        class119 var3 = (class119) var2.field1518.get(arg1);
        if (var3.field1388 != -1) {
            return;
        }
        String var4 = var3.field1384.method6813();
        class99 var5 = field562;
        class242 var6 = class242.method3564(class240.field2751, var5.field1277);
        var6.field2792.method6223(3 + Statics.method1282(var4));
        var6.field2792.method6223(arg0);
        var6.field2792.method6224(arg1);
        var6.field2792.method6230(var4);
        var5.method2269(var6);
    }

    @ObfuscatedName("r.kf(III)V")
    public static final void method290(int arg0, int arg1) {
        if (field494[arg0] == null || arg1 < 0 || arg1 >= field494[arg0].method2538()) {
            return;
        }
        class119 var2 = (class119) field494[arg0].field1518.get(arg1);
        if (var2.field1388 != -1) {
            return;
        }
        class99 var3 = field562;
        class242 var4 = class242.method3564(class240.field2738, var3.field1277);
        var4.field2792.method6223(3 + Statics.method1282(var2.field1384.method6813()));
        var4.field2792.method6223(arg0);
        var4.field2792.method6224(arg1);
        var4.field2792.method6230(var2.field1384.method6813());
        var3.method2269(var4);
    }

    @ObfuscatedName("ef.ky(IIZI)V")
    public static final void method2693(int arg0, int arg1, boolean arg2) {
        if (field494[arg0] == null || arg1 < 0 || arg1 >= field494[arg0].method2538()) {
            return;
        }
        class119 var3 = (class119) field494[arg0].field1518.get(arg1);
        class99 var4 = field562;
        class242 var5 = class242.method3564(class240.field2766, var4.field1277);
        var5.field2792.method6223(4 + Statics.method1282(var3.field1384.method6813()));
        var5.field2792.method6223(arg0);
        var5.field2792.method6224(arg1);
        var5.field2792.method6262(arg2);
        var5.field2792.method6230(var3.field1384.method6813());
        var4.method2269(var5);
    }

    @ObfuscatedName("lf.ld(II)V")
    public static void method5248(int arg0) {
        for (class369 var1 = (class369) field677.method6028(); var1 != null; var1 = (class369) field677.method6029()) {
            if ((var1.field4075 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method5752();
            }
        }
    }

    @ObfuscatedName("cn.lm(Ljf;I)I")
    public static int method2052(class262 arg0) {
        class369 var1 = (class369) field677.method6034(((long) arg0.field3052 << 32) + (long) arg0.field3053);
        return var1 == null ? arg0.field3188 : var1.field4073;
    }

    @ObfuscatedName("dn.le(Ljf;I)Ljf;")
    public static class262 method2366(class262 arg0) {
        int var1 = method2052(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class262.method2355(arg0.field3071);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ch.ls(Ljf;B)Z")
    public static boolean method2228(class262 arg0) {
        return arg0.field3072;
    }

    @ObfuscatedName("ar.lf(Ljf;IB)Ljava/lang/String;")
    public static String method758(class262 arg0, int arg1) {
        int var2 = method2052(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3158 == null) {
            return null;
        } else if (arg0.field3132 == null || arg0.field3132.length <= arg1 || arg0.field3132[arg1] == null || arg0.field3132[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3132[arg1];
        }
    }

    @ObfuscatedName("r.ly(Ljf;I)Ljava/lang/String;")
    public static String method291(class262 arg0) {
        if (class263.method1943(method2052(arg0)) == 0) {
            return null;
        } else if (arg0.field3041 == null || arg0.field3041.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3041;
        }
    }

    @ObfuscatedName("ce.lq(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method2130(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field489 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field489 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field489 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field489 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field489 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1317 != null) {
            var3 = "/p=" + Statics.field1317;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field207 + "/a=" + Statics.field2484 + var3 + "/";
    }

    @ObfuscatedName("dk.ll(Ljava/lang/String;I)V")
    public static void method2503(String arg0) {
        Statics.field1317 = arg0;
        try {
            String var1 = Statics.field983.getParameter(Integer.toString(18));
            String var2 = Statics.field983.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class267.method2800(class398.method2381() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class28.method385(Statics.field983, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("f.lk(Ljava/lang/String;ZI)V")
    public static void method352(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1479; var5++) {
            class170 var6 = class170.method2586(var5);
            if ((!arg1 || var6.field1882) && var6.field1919 == -1 && var6.field1887.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2375 = -1;
                    Statics.field3782 = null;
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
        Statics.field3782 = var3;
        Statics.field1446 = 0;
        Statics.field2375 = var4;
        String[] var9 = new String[Statics.field2375];
        for (int var10 = 0; var10 < Statics.field2375; var10++) {
            var9[var10] = class170.method2586(var3[var10]).field1887;
        }
        class396.method5739(var9, Statics.field3782);
    }

    @ObfuscatedName("eo.li([BII)V")
    public static void method2650(byte[] arg0, int arg1) {
        if (field509 == null) {
            field509 = new byte[24];
        }
        class322.method5321(arg0, arg1, field509, 0, 24);
    }

    @ObfuscatedName("jg.lx(Lop;II)V")
    public static void method4650(class401 arg0, int arg1) {
        method2650(arg0.field4302, arg1);
        if (class144.field1553 == null) {
            return;
        }
        try {
            class144.field1553.method6080(0L);
            class144.field1553.method6089(arg0.field4302, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.lb(I)Lpb;")
    public class422 method1108() {
        return Statics.field1674 == null ? null : Statics.field1674.field1048;
    }

    @ObfuscatedName("ei.ln(IIIZI)V")
    public static void method2676(int arg0, int arg1, int arg2, boolean arg3) {
        class242 var4 = class242.method3564(class240.field2737, field562.field1277);
        var4.field2792.method6236(arg0);
        var4.field2792.method6236(arg1);
        var4.field2792.method6267(arg2);
        var4.field2792.method6285(arg3 ? field553 : 0);
        field562.method2269(var4);
    }

    @ObfuscatedName("ba.lo(IB)V")
    public static void method1950(int arg0) {
        field546 = arg0;
    }

    @ObfuscatedName("al.lu(I)V")
    public static void method405() {
        field562.method2269(class242.method3564(class240.field2743, field562.field1277));
        field546 = 0;
    }

    @ObfuscatedName("dl.lh(B)V")
    public static void method2429() {
        if (field546 == 1) {
            field512 = true;
        }
    }

    @ObfuscatedName("hn.lt(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4165(String arg0) {
        class285[] var1 = class285.method2886();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class285 var3 = var1[var2];
            if (var3.field3652 != -1 && arg0.startsWith(class92.method4468(var3.field3652))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3652).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("jo.lj(I)V")
    public static void method4664() {
        if (Statics.field1441 == null) {
            return;
        }
        field743 = field555;
        Statics.field1441.method4921();
        for (int var0 = 0; var0 < field587.length; var0++) {
            if (field587[var0] != null) {
                Statics.field1441.method4929((field587[var0].field1092 >> 7) + Statics.field92, (field587[var0].field1085 >> 7) + Statics.field4007);
            }
        }
    }

    @ObfuscatedName("dc.lr(II)V")
    public static void method2368(int arg0) {
        if (field496 != arg0) {
            field496 = arg0;
        }
    }
}

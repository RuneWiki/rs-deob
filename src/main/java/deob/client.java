package deob;

import com.jagex.oldscape.pub.OAuthTokens;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class32 implements class332, OAuthTokens {

    @ObfuscatedName("client.w")
    public static class173[] field712 = new class173[4];

    @ObfuscatedName("client.af")
    public static boolean field685 = true;

    @ObfuscatedName("client.bz")
    public static int field483 = 1;

    @ObfuscatedName("client.bt")
    public static int field484 = 0;

    @ObfuscatedName("client.bf")
    public static int field485 = 0;

    @ObfuscatedName("client.bx")
    public static boolean field486 = false;

    @ObfuscatedName("client.bu")
    public static boolean field569 = false;

    @ObfuscatedName("client.bs")
    public static int field525 = -1;

    @ObfuscatedName("client.bd")
    public static int field489 = -1;

    @ObfuscatedName("client.bb")
    public static int field682 = -1;

    @ObfuscatedName("client.bh")
    public static boolean field693 = false;

    @ObfuscatedName("client.ca")
    public static int field567 = 0;

    @ObfuscatedName("client.co")
    public static boolean field493 = true;

    @ObfuscatedName("client.ck")
    public static int field494 = 0;

    @ObfuscatedName("client.cb")
    public static long field495 = 1L;

    @ObfuscatedName("client.db")
    public static int field496 = -1;

    @ObfuscatedName("client.dx")
    public static int field497 = -1;

    @ObfuscatedName("client.dd")
    public static long field651 = -1L;

    @ObfuscatedName("client.dp")
    public static boolean field579 = true;

    @ObfuscatedName("client.dq")
    public static boolean field620 = false;

    @ObfuscatedName("client.du")
    public static int field501 = 0;

    @ObfuscatedName("client.dc")
    public static int field577 = 0;

    @ObfuscatedName("client.dy")
    public static int field733 = 0;

    @ObfuscatedName("client.dl")
    public static int field504 = 0;

    @ObfuscatedName("client.df")
    public static int field505 = 0;

    @ObfuscatedName("client.dj")
    public static int field506 = 0;

    @ObfuscatedName("client.dm")
    public static int field507 = 0;

    @ObfuscatedName("client.dt")
    public static int field508 = 0;

    @ObfuscatedName("client.dr")
    public static int field509 = 0;

    @ObfuscatedName("client.dg")
    public static class94 field605 = class94.field1237;

    @ObfuscatedName("client.dv")
    public static class94 field511 = class94.field1237;

    @ObfuscatedName("client.dw")
    public static int field645 = 0;

    @ObfuscatedName("client.ds")
    public static int field616 = 0;

    @ObfuscatedName("client.da")
    public static int field514 = 0;

    @ObfuscatedName("client.ep")
    public static int field636 = 0;

    @ObfuscatedName("client.ed")
    public static int field516 = 0;

    @ObfuscatedName("client.ey")
    public static int field517 = 0;

    @ObfuscatedName("client.ex")
    public static int field681 = 0;

    @ObfuscatedName("client.eo")
    public static int field540 = 0;

    @ObfuscatedName("client.el")
    public static class113 field520 = class113.field1360;

    @ObfuscatedName("client.em")
    public static class405 field521 = class405.field4345;

    @ObfuscatedName("client.ff")
    public String field548;

    @ObfuscatedName("client.fd")
    public class15 field523;

    @ObfuscatedName("client.fn")
    public class20 field524;

    @ObfuscatedName("client.fy")
    public static boolean field581 = false;

    @ObfuscatedName("client.fw")
    public static class71 field527 = new class71();

    @ObfuscatedName("client.fu")
    public class401 field528;

    @ObfuscatedName("client.fc")
    public class8 field529;

    @ObfuscatedName("client.fv")
    public static byte[] field530 = null;

    @ObfuscatedName("client.gd")
    public static class91[] field532 = new class91[32768];

    @ObfuscatedName("client.gf")
    public static int field513 = 0;

    @ObfuscatedName("client.gu")
    public static int[] field534 = new int[32768];

    @ObfuscatedName("client.gh")
    public static int field714 = 0;

    @ObfuscatedName("client.gb")
    public static int[] field536 = new int[250];

    @ObfuscatedName("client.ge")
    public static final class99 field639 = new class99();

    @ObfuscatedName("client.gk")
    public static int field644 = 0;

    @ObfuscatedName("client.gw")
    public static boolean field539 = false;

    @ObfuscatedName("client.ga")
    public static boolean field543 = true;

    @ObfuscatedName("client.gr")
    public static boolean field541 = false;

    @ObfuscatedName("client.gm")
    public static class326 field549 = new class326();

    @ObfuscatedName("client.gx")
    public static HashMap field654 = new HashMap();

    @ObfuscatedName("client.hj")
    public static int field765 = 0;

    @ObfuscatedName("client.hz")
    public static int field545 = 1;

    @ObfuscatedName("client.hd")
    public static int field546 = 0;

    @ObfuscatedName("client.hg")
    public static int field547 = 1;

    @ObfuscatedName("client.hy")
    public static int field535 = 0;

    @ObfuscatedName("client.hq")
    public static boolean field767 = false;

    @ObfuscatedName("client.ha")
    public static int[][][] field606 = new int[4][13][13];

    @ObfuscatedName("client.hm")
    public static final int[] field691 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.hu")
    public static int field537 = 0;

    @ObfuscatedName("client.it")
    public static String field498 = null;

    @ObfuscatedName("client.iy")
    public static int field554 = 2301979;

    @ObfuscatedName("client.id")
    public static int field515 = 5063219;

    @ObfuscatedName("client.is")
    public static int field556 = 3353893;

    @ObfuscatedName("client.in")
    public static int field698 = 7759444;

    @ObfuscatedName("client.ip")
    public static boolean field552 = false;

    @ObfuscatedName("client.iu")
    public static int field559 = 0;

    @ObfuscatedName("client.im")
    public static int field553 = 128;

    @ObfuscatedName("client.ib")
    public static int field561 = 0;

    @ObfuscatedName("client.iw")
    public static int field562 = 0;

    @ObfuscatedName("client.iv")
    public static int field563 = 0;

    @ObfuscatedName("client.ic")
    public static int field503 = 0;

    @ObfuscatedName("client.ia")
    public static int field565 = 0;

    @ObfuscatedName("client.ie")
    public static int field753 = 0;

    @ObfuscatedName("client.je")
    public static int field697 = 50;

    @ObfuscatedName("client.jo")
    public static int field568 = 0;

    @ObfuscatedName("client.jr")
    public static int field728 = 0;

    @ObfuscatedName("client.jk")
    public static int field662 = 0;

    @ObfuscatedName("client.ja")
    public static int field571 = 12;

    @ObfuscatedName("client.jp")
    public static int field572 = 6;

    @ObfuscatedName("client.jl")
    public static int field573 = 0;

    @ObfuscatedName("client.jb")
    public static boolean field574 = false;

    @ObfuscatedName("client.jq")
    public static int field575 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field576 = false;

    @ObfuscatedName("client.ju")
    public static int field566 = 0;

    @ObfuscatedName("client.jv")
    public static int field519 = 0;

    @ObfuscatedName("client.jh")
    public static int field491 = 50;

    @ObfuscatedName("client.ji")
    public static int[] field580 = new int[field491];

    @ObfuscatedName("client.jz")
    public static int[] field628 = new int[field491];

    @ObfuscatedName("client.jw")
    public static int[] field582 = new int[field491];

    @ObfuscatedName("client.jj")
    public static int[] field583 = new int[field491];

    @ObfuscatedName("client.js")
    public static int[] field584 = new int[field491];

    @ObfuscatedName("client.jy")
    public static int[] field585 = new int[field491];

    @ObfuscatedName("client.jm")
    public static int[] field752 = new int[field491];

    @ObfuscatedName("client.jd")
    public static String[] field587 = new String[field491];

    @ObfuscatedName("client.jx")
    public static int[][] field588 = new int[104][104];

    @ObfuscatedName("client.ks")
    public static int field589 = 0;

    @ObfuscatedName("client.ky")
    public static int field739 = -1;

    @ObfuscatedName("client.kr")
    public static int field591 = -1;

    @ObfuscatedName("client.kl")
    public static int field592 = 0;

    @ObfuscatedName("client.kb")
    public static int field593 = 0;

    @ObfuscatedName("client.kg")
    public static int field538 = 0;

    @ObfuscatedName("client.kk")
    public static int field594 = 0;

    @ObfuscatedName("client.kq")
    public static boolean field590 = true;

    @ObfuscatedName("client.ki")
    public static int field621 = 0;

    @ObfuscatedName("client.kx")
    public static int field598 = 0;

    @ObfuscatedName("client.kc")
    public static int field599 = 0;

    @ObfuscatedName("client.kj")
    public static int field676 = 0;

    @ObfuscatedName("client.kh")
    public static int field601 = 0;

    @ObfuscatedName("client.ku")
    public static int field500 = 0;

    @ObfuscatedName("client.kv")
    public static boolean field603 = false;

    @ObfuscatedName("client.kn")
    public static int field604 = 0;

    @ObfuscatedName("client.kw")
    public static int field560 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field768 = true;

    @ObfuscatedName("client.ka")
    public static class83[] field642 = new class83[2048];

    @ObfuscatedName("client.km")
    public static int field608 = -1;

    @ObfuscatedName("client.le")
    public static int field631 = 0;

    @ObfuscatedName("client.lt")
    public static boolean field694 = true;

    @ObfuscatedName("client.ls")
    public static int field611 = 0;

    @ObfuscatedName("client.lx")
    public static int field612 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field613 = new int[1000];

    @ObfuscatedName("client.lr")
    public static final int[] field614 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.lw")
    public static String[] field586 = new String[8];

    @ObfuscatedName("client.lb")
    public static boolean[] field550 = new boolean[8];

    @ObfuscatedName("client.lo")
    public static int[] field617 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.li")
    public static int field618 = -1;

    @ObfuscatedName("client.lf")
    public static class309[][][] field619 = new class309[4][104][104];

    @ObfuscatedName("client.lk")
    public static class309 field708 = new class309();

    @ObfuscatedName("client.ln")
    public static class309 field655 = new class309();

    @ObfuscatedName("client.ld")
    public static class309 field622 = new class309();

    @ObfuscatedName("client.lp")
    public static int[] field623 = new int[25];

    @ObfuscatedName("client.lz")
    public static int[] field624 = new int[25];

    @ObfuscatedName("client.lg")
    public static int[] field625 = new int[25];

    @ObfuscatedName("client.lm")
    public static int field626 = 0;

    @ObfuscatedName("client.lj")
    public static boolean field627 = false;

    @ObfuscatedName("client.mc")
    public static int field695 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field629 = new int[500];

    @ObfuscatedName("client.mn")
    public static int[] field630 = new int[500];

    @ObfuscatedName("client.mf")
    public static int[] field701 = new int[500];

    @ObfuscatedName("client.mz")
    public static int[] field632 = new int[500];

    @ObfuscatedName("client.mm")
    public static String[] field633 = new String[500];

    @ObfuscatedName("client.ms")
    public static String[] field634 = new String[500];

    @ObfuscatedName("client.mr")
    public static boolean[] field635 = new boolean[500];

    @ObfuscatedName("client.me")
    public static boolean field746 = false;

    @ObfuscatedName("client.md")
    public static boolean field637 = false;

    @ObfuscatedName("client.mt")
    public static boolean field638 = false;

    @ObfuscatedName("client.mu")
    public static boolean field772 = true;

    @ObfuscatedName("client.mh")
    public static int field640 = -1;

    @ObfuscatedName("client.mp")
    public static int field641 = -1;

    @ObfuscatedName("client.ml")
    public static int field558 = 0;

    @ObfuscatedName("client.mb")
    public static int field643 = 50;

    @ObfuscatedName("client.mx")
    public static int field499 = 0;

    @ObfuscatedName("client.nu")
    public static boolean field646 = false;

    @ObfuscatedName("client.np")
    public static int field647 = -1;

    @ObfuscatedName("client.ng")
    public static int field648 = -1;

    @ObfuscatedName("client.nv")
    public static String field649 = null;

    @ObfuscatedName("client.nm")
    public static String field557 = null;

    @ObfuscatedName("client.nr")
    public static int field718 = -1;

    @ObfuscatedName("client.nk")
    public static class380 field652 = new class380(8);

    @ObfuscatedName("client.nf")
    public static int field510 = 0;

    @ObfuscatedName("client.nz")
    public static int field674 = -1;

    @ObfuscatedName("client.ni")
    public static int field653 = 0;

    @ObfuscatedName("client.nw")
    public static int field656 = 0;

    @ObfuscatedName("client.nt")
    public static class262 field657 = null;

    @ObfuscatedName("client.ny")
    public static int field658 = 0;

    @ObfuscatedName("client.ns")
    public static int field659 = 0;

    @ObfuscatedName("client.nj")
    public static int field660 = 0;

    @ObfuscatedName("client.nq")
    public static int field482 = -1;

    @ObfuscatedName("client.no")
    public static boolean field518 = false;

    @ObfuscatedName("client.nc")
    public static class262 field663 = null;

    @ObfuscatedName("client.nb")
    public static class262 field610 = null;

    @ObfuscatedName("client.ne")
    public static class262 field488 = null;

    @ObfuscatedName("client.ow")
    public static int field666 = 0;

    @ObfuscatedName("client.oi")
    public static int field667 = 0;

    @ObfuscatedName("client.od")
    public static class262 field570 = null;

    @ObfuscatedName("client.os")
    public static boolean field596 = false;

    @ObfuscatedName("client.of")
    public static int field670 = -1;

    @ObfuscatedName("client.op")
    public static int field671 = -1;

    @ObfuscatedName("client.oc")
    public static boolean field672 = false;

    @ObfuscatedName("client.oh")
    public static int field673 = -1;

    @ObfuscatedName("client.ou")
    public static int field609 = -1;

    @ObfuscatedName("client.oy")
    public static boolean field675 = false;

    @ObfuscatedName("client.om")
    public static int field689 = 1;

    @ObfuscatedName("client.oa")
    public static int[] field677 = new int[32];

    @ObfuscatedName("client.oj")
    public static int field678 = 0;

    @ObfuscatedName("client.oo")
    public static int[] field679 = new int[32];

    @ObfuscatedName("client.ov")
    public static int field680 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field762 = new int[32];

    @ObfuscatedName("client.oz")
    public static int field717 = 0;

    @ObfuscatedName("client.on")
    public static int[] field683 = new int[32];

    @ObfuscatedName("client.ol")
    public static int field684 = 0;

    @ObfuscatedName("client.og")
    public static int field597 = 0;

    @ObfuscatedName("client.pv")
    public static int field686 = 0;

    @ObfuscatedName("client.pa")
    public static int field687 = 0;

    @ObfuscatedName("client.pt")
    public static int field688 = 0;

    @ObfuscatedName("client.pz")
    public static int field595 = 0;

    @ObfuscatedName("client.pc")
    public static int field578 = 0;

    @ObfuscatedName("client.pm")
    public static int field490 = 0;

    @ObfuscatedName("client.pw")
    public static int field692 = 0;

    @ObfuscatedName("client.px")
    public static int field703 = 0;

    @ObfuscatedName("client.pj")
    public static class309 field770 = new class309();

    @ObfuscatedName("client.pp")
    public static class309 field732 = new class309();

    @ObfuscatedName("client.pb")
    public static class309 field696 = new class309();

    @ObfuscatedName("client.pk")
    public static class380 field487 = new class380(512);

    @ObfuscatedName("client.pn")
    public static int field699 = 0;

    @ObfuscatedName("client.py")
    public static int field700 = -2;

    @ObfuscatedName("client.pd")
    public static boolean[] field711 = new boolean[100];

    @ObfuscatedName("client.pi")
    public static boolean[] field702 = new boolean[100];

    @ObfuscatedName("client.pl")
    public static boolean[] field526 = new boolean[100];

    @ObfuscatedName("client.pf")
    public static int[] field704 = new int[100];

    @ObfuscatedName("client.pu")
    public static int[] field705 = new int[100];

    @ObfuscatedName("client.pg")
    public static int[] field706 = new int[100];

    @ObfuscatedName("client.qi")
    public static int[] field707 = new int[100];

    @ObfuscatedName("client.qs")
    public static int field615 = 0;

    @ObfuscatedName("client.qh")
    public static long field709 = 0L;

    @ObfuscatedName("client.qz")
    public static boolean field710 = true;

    @ObfuscatedName("client.qg")
    public static int[] field555 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.qa")
    public static int field661 = 0;

    @ObfuscatedName("client.qx")
    public static int field713 = 0;

    @ObfuscatedName("client.ql")
    public static String field551 = "";

    @ObfuscatedName("client.qk")
    public static long[] field715 = new long[100];

    @ObfuscatedName("client.qy")
    public static int field716 = 0;

    @ObfuscatedName("client.qr")
    public static int field727 = 0;

    @ObfuscatedName("client.qj")
    public static int[] field533 = new int[128];

    @ObfuscatedName("client.qd")
    public static int[] field719 = new int[128];

    @ObfuscatedName("client.qq")
    public static long field720 = -1L;

    @ObfuscatedName("client.rv")
    public static class128[] field721 = new class128[2];

    @ObfuscatedName("client.rk")
    public static class137[] field722 = new class137[2];

    @ObfuscatedName("client.ri")
    public static int field723 = -1;

    @ObfuscatedName("client.rc")
    public static int field724 = 0;

    @ObfuscatedName("client.rx")
    public static int[] field725 = new int[1000];

    @ObfuscatedName("client.ry")
    public static int[] field726 = new int[1000];

    @ObfuscatedName("client.rm")
    public static class414[] field542 = new class414[1000];

    @ObfuscatedName("client.rg")
    public static int field607 = 0;

    @ObfuscatedName("client.rj")
    public static int field729 = 0;

    @ObfuscatedName("client.rn")
    public static int field730 = 0;

    @ObfuscatedName("client.ru")
    public static int field731 = -1;

    @ObfuscatedName("client.ra")
    public static boolean field664 = false;

    @ObfuscatedName("client.rf")
    public static int field544 = 0;

    @ObfuscatedName("client.sy")
    public static int[] field734 = new int[50];

    @ObfuscatedName("client.sr")
    public static int[] field735 = new int[50];

    @ObfuscatedName("client.si")
    public static int[] field736 = new int[50];

    @ObfuscatedName("client.sl")
    public static int[] field737 = new int[50];

    @ObfuscatedName("client.sc")
    public static class35[] field738 = new class35[50];

    @ObfuscatedName("client.se")
    public static boolean field690 = false;

    @ObfuscatedName("client.sw")
    public static boolean[] field740 = new boolean[5];

    @ObfuscatedName("client.sa")
    public static int[] field741 = new int[5];

    @ObfuscatedName("client.sv")
    public static int[] field742 = new int[5];

    @ObfuscatedName("client.sp")
    public static int[] field743 = new int[5];

    @ObfuscatedName("client.sx")
    public static int[] field744 = new int[5];

    @ObfuscatedName("client.sq")
    public static short field745 = 256;

    @ObfuscatedName("client.sb")
    public static short field748 = 205;

    @ObfuscatedName("client.sk")
    public static short field747 = 256;

    @ObfuscatedName("client.tw")
    public static short field769 = 320;

    @ObfuscatedName("client.ta")
    public static short field749 = 1;

    @ObfuscatedName("client.tb")
    public static short field750 = 32767;

    @ObfuscatedName("client.tv")
    public static short field751 = 1;

    @ObfuscatedName("client.tk")
    public static short field502 = 32767;

    @ObfuscatedName("client.to")
    public static int field512 = 0;

    @ObfuscatedName("client.tj")
    public static int field754 = 0;

    @ObfuscatedName("client.td")
    public static int field755 = 0;

    @ObfuscatedName("client.tf")
    public static int field756 = 0;

    @ObfuscatedName("client.tn")
    public static int field757 = 0;

    @ObfuscatedName("client.tt")
    public static class260 field758 = new class260();

    @ObfuscatedName("client.ts")
    public static int field759 = -1;

    @ObfuscatedName("client.ty")
    public static int field760 = -1;

    @ObfuscatedName("client.tq")
    public static class373 field761 = new class371();

    @ObfuscatedName("client.th")
    public static class299[] field600 = new class299[8];

    @ObfuscatedName("client.tc")
    public static class60 field763 = new class60();

    @ObfuscatedName("client.ut")
    public static int field764 = -1;

    @ObfuscatedName("client.uf")
    public static ArrayList field602 = new ArrayList(10);

    @ObfuscatedName("client.uq")
    public static int field766 = 0;

    @ObfuscatedName("client.ud")
    public static int field522 = 0;

    @ObfuscatedName("client.up")
    public static final class59 field650 = new class59();

    @ObfuscatedName("client.uh")
    public static int[] field669 = new int[50];

    @ObfuscatedName("client.ui")
    public static int[] field492 = new int[50];

    @ObfuscatedName("kd.ez(I)Lna;")
    public static class375 method4927() {
        return Statics.field1243;
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method472() {
    }

    public final void init() {
        if (!this.method519()) {
            return;
        }
        for (int var1 = 0; var1 <= 27; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field543 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class92.field1227)) {
                            field486 = true;
                        } else {
                            field486 = false;
                        }
                        break;
                    case 4:
                        if (field489 == -1) {
                            field489 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field484 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var4 = Integer.parseInt(var2);
                        class305 var5;
                        if (var4 >= 0 && var4 < class305.field3798.length) {
                            var5 = class305.field3798[var4];
                        } else {
                            var5 = null;
                        }
                        Statics.field438 = var5;
                        break;
                    case 7:
                        Statics.field172 = class278.method2377(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class92.field1227)) {
                        }
                        break;
                    case 9:
                        Statics.field1010 = var2;
                        break;
                    case 10:
                        class279[] var3 = new class279[] { class279.field3307, class279.field3303, class279.field3304, class279.field3305, class279.field3311, class279.field3306 };
                        Statics.field4268 = (class279) class304.method2484(var3, Integer.parseInt(var2));
                        if (Statics.field4268 == class279.field3307) {
                            Statics.field2137 = class383.field4220;
                        } else {
                            Statics.field2137 = class383.field4228;
                        }
                        break;
                    case 11:
                        Statics.field1265 = var2;
                        break;
                    case 12:
                        field483 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field143 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field485 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1274 = var2;
                        break;
                    case 21:
                        field525 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field541 = Integer.parseInt(var2) != 0;
                }
            }
        }
        method6182();
        Statics.field1691 = this.getCodeBase().getHost();
        String var6 = Statics.field172.field3297;
        byte var7 = 0;
        try {
            class144.method2374("oldschool", var6, var7, 21);
        } catch (Exception var9) {
            class425.method5430((String) null, var9);
        }
        Statics.field107 = this;
        Statics.field4430 = field489;
        if (field682 == -1) {
            field682 = 0;
        }
        Statics.field2141 = System.getenv("JX_ACCESS_TOKEN");
        System.getenv("JX_REFRESH_TOKEN");
        this.method449(765, 503, 200);
    }

    @ObfuscatedName("oi.ea(B)V")
    public static final void method6182() {
        class213.field2392 = false;
        field569 = false;
    }

    public void setOAuthTokens(String arg0, String arg1) {
        if (arg0 != null && !arg0.trim().isEmpty() && arg1 != null && !arg1.trim().isEmpty()) {
            Statics.field2141 = arg0;
            class69.method2363(10);
        }
    }

    @ObfuscatedName("client.ej(B)Z")
    public boolean method1254() {
        return Statics.field2141 != null && !Statics.field2141.trim().isEmpty();
    }

    @ObfuscatedName("client.ek(Ljava/lang/String;I)V")
    public void method1049(String arg0) throws MalformedURLException, IOException {
        class11 var2 = new class11(new URL(Statics.field1265 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class10.field44);
        var2.method84("Authorization", "Bearer " + arg0);
        this.field524 = this.field523.method171(var2);
    }

    @ObfuscatedName("client.d(I)V")
    public final void method525() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field3769 = null;
            Statics.field470 = null;
            Statics.field1388 = (byte[][][]) null;
            class324.field3894.clear();
            class324.field3894.add(100);
            class324.field3894.add(5000);
            class324.field3894.add(10000);
            class324.field3894.add(30000);
        } else {
            Statics.field3769 = var1;
            Statics.field470 = new int[var1.length];
            Statics.field1388 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field3769.length; var3++) {
                Statics.field1388[var3] = new byte[var2[var3]][];
                class324.field3894.add(var1[var3]);
            }
            Collections.sort(class324.field3894);
        }
        Statics.field2016 = field485 == 0 ? 43594 : field483 + 40000;
        Statics.field3963 = field485 == 0 ? 443 : field483 + 50000;
        Statics.field1983 = Statics.field2016;
        Statics.field3024 = class261.field3035;
        Statics.field2102 = class261.field3031;
        Statics.field2601 = class261.field3034;
        Statics.field2181 = class261.field3032;
        Statics.field2127 = new class100();
        this.method444();
        this.method445();
        Statics.field4238 = this.method441();
        Statics.field1174 = new class348(255, class144.field1557, class144.field1566, 500000);
        Statics.field3227 = class89.method1800();
        this.method497();
        class30.method6807(this, Statics.field1304);
        if (field485 != 0) {
            field620 = true;
        }
        method6196(Statics.field3227.field1203);
        Statics.field464 = new class62(Statics.field2137);
        this.field523 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method530() {
        field494++;
        this.method1052();
        while (true) {
            class309 var1 = class287.field3674;
            class286 var2;
            synchronized (class287.field3674) {
                var2 = (class286) class287.field3673.method5032();
            }
            if (var2 == null) {
                try {
                    if (class248.field2915 == 1) {
                        int var4 = Statics.field2921.method4296();
                        if (var4 > 0 && Statics.field2921.method4302()) {
                            int var5 = var4 - Statics.field2917;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2921.method4334(var5);
                        } else {
                            Statics.field2921.method4301();
                            Statics.field2921.method4299();
                            if (Statics.field1370 == null) {
                                class248.field2915 = 0;
                            } else {
                                class248.field2915 = 2;
                            }
                            Statics.field1349 = null;
                            Statics.field2912 = null;
                        }
                    }
                } catch (Exception var16) {
                    var16.printStackTrace();
                    Statics.field2921.method4301();
                    class248.field2915 = 0;
                    Statics.field1349 = null;
                    Statics.field2912 = null;
                    Statics.field1370 = null;
                }
                method5739();
                class24 var7 = class24.field132;
                synchronized (class24.field132) {
                    class24.field115++;
                    class24.field140 = class24.field127;
                    class24.field137 = 0;
                    class24.field141 = 0;
                    Arrays.fill(class24.field129, false);
                    Arrays.fill(class24.field130, false);
                    if (class24.field124 < 0) {
                        Arrays.fill(class24.field118, false);
                        class24.field124 = class24.field145;
                    } else {
                        while (class24.field145 != class24.field124) {
                            int var8 = class24.field131[class24.field145];
                            class24.field145 = class24.field145 + 1 & 0x7F;
                            if (var8 < 0) {
                                int var9 = ~var8;
                                if (class24.field118[var9]) {
                                    class24.field118[var9] = false;
                                    class24.field130[var9] = true;
                                    class24.field138[class24.field141] = var9;
                                    class24.field141++;
                                }
                            } else {
                                if (!class24.field118[var8] && class24.field137 < class24.field136.length - 1) {
                                    class24.field129[var8] = true;
                                    class24.field136[++class24.field137 - 1] = var8;
                                }
                                class24.field118[var8] = true;
                            }
                        }
                    }
                    if (class24.field137 > 0) {
                        class24.field115 = 0;
                    }
                    class24.field127 = class24.field128;
                }
                class33.method357();
                if (Statics.field4238 != null) {
                    int var11 = Statics.field4238.method316();
                    field703 = var11;
                }
                if (field567 == 0) {
                    method102();
                    Statics.field2893.method2542();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field210[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field193[var13] = 0L;
                    }
                    Statics.field182 = 0;
                } else if (field567 == 5) {
                    class69.method2100(this, Statics.field3196);
                    method102();
                    class32.method1632();
                } else if (field567 == 10 || field567 == 11) {
                    class69.method2100(this, Statics.field3196);
                } else if (field567 == 20) {
                    class69.method2100(this, Statics.field3196);
                    this.method1055();
                } else if (field567 == 25) {
                    method3191();
                }
                if (field567 == 30) {
                    this.method1057();
                } else if (field567 == 40 || field567 == 45) {
                    this.method1055();
                }
                return;
            }
            var2.field3670.method4713(var2.field3668, (int) var2.field4075, var2.field3667, false);
        }
    }

    @ObfuscatedName("client.ad(ZI)V")
    public final void method529(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class248.field2915 == 2) {
                    if (Statics.field1349 == null) {
                        Statics.field1349 = class253.method4472(Statics.field1370, Statics.field3256, Statics.field1526);
                        if (Statics.field1349 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2912 == null) {
                        Statics.field2912 = new class41(Statics.field2913, Statics.field3754);
                    }
                    if (Statics.field2921.method4297(Statics.field1349, Statics.field2919, Statics.field2912, 22050)) {
                        Statics.field2921.method4298();
                        Statics.field2921.method4334(Statics.field2914);
                        Statics.field2921.method4359(Statics.field1349, Statics.field2918);
                        class248.field2915 = 0;
                        Statics.field1349 = null;
                        Statics.field2912 = null;
                        Statics.field1370 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2921.method4301();
                class248.field2915 = 0;
                Statics.field1349 = null;
                Statics.field2912 = null;
                Statics.field1370 = null;
            }
            var2 = false;
        }
        if (var2 && field664 && Statics.field1443 != null) {
            Statics.field1443.method696();
        }
        if ((field567 == 10 || field567 == 20 || field567 == 30) && field709 != 0L && class398.method2299() > field709) {
            method6196(method151());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field711[var5] = true;
            }
        }
        if (field567 == 0) {
            this.method457(class69.field882, class69.field880, arg0);
        } else if (field567 == 5) {
            class69.method2041(Statics.field834, Statics.field1325, Statics.field3196);
        } else if (field567 == 10 || field567 == 11) {
            class69.method2041(Statics.field834, Statics.field1325, Statics.field3196);
        } else if (field567 == 20) {
            class69.method2041(Statics.field834, Statics.field1325, Statics.field3196);
        } else if (field567 == 25) {
            if (field535 == 1) {
                if (field765 > field545) {
                    field545 = field765;
                }
                int var6 = (field545 * 50 - field765 * 50) / field545;
                method1007(class283.field3594 + class92.field1226 + class92.field1224 + var6 + "%" + class92.field1223, false);
            } else if (field535 == 2) {
                if (field546 > field547) {
                    field547 = field546;
                }
                int var7 = (field547 * 50 - field546 * 50) / field547 + 50;
                method1007(class283.field3594 + class92.field1226 + class92.field1224 + var7 + "%" + class92.field1223, false);
            } else {
                method1007(class283.field3594, false);
            }
        } else if (field567 == 30) {
            this.method1180();
        } else if (field567 == 40) {
            method1007(class283.field3338 + class92.field1226 + class283.field3468, false);
        } else if (field567 == 45) {
            method1007(class283.field3497, false);
        }
        if (field567 == 30 && field615 == 0 && !arg0 && !field710) {
            for (int var8 = 0; var8 < field699; var8++) {
                if (field702[var8]) {
                    Statics.field2895.method426(field704[var8], field705[var8], field706[var8], field707[var8]);
                    field702[var8] = false;
                }
            }
        } else if (field567 > 0) {
            Statics.field2895.method424(0, 0);
            for (int var9 = 0; var9 < field699; var9++) {
                field702[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.as(B)V")
    public final void method528() {
        if (Statics.field2344.method2195()) {
            Statics.field2344.method2186();
        }
        if (Statics.field1212 != null) {
            Statics.field1212.field1056 = false;
        }
        Statics.field1212 = null;
        field639.method2249();
        class24.method2065();
        class33.method4989();
        Statics.field4238 = null;
        if (Statics.field1443 != null) {
            Statics.field1443.method691();
        }
        if (Statics.field1380 != null) {
            Statics.field1380.method691();
        }
        if (Statics.field3726 != null) {
            Statics.field3726.method2615();
        }
        Object var1 = class287.field3675;
        synchronized (class287.field3675) {
            if (class287.field3672 != 0) {
                class287.field3672 = 1;
                try {
                    class287.field3675.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field2127 != null) {
            Statics.field2127.method2271();
            Statics.field2127 = null;
        }
        try {
            class144.field1557.method6114();
            for (int var4 = 0; var4 < Statics.field4026; var4++) {
                Statics.field1565[var4].method6114();
            }
            class144.field1566.method6114();
            class144.field1564.method6114();
        } catch (Exception var7) {
        }
        this.field523.method165();
    }

    @ObfuscatedName("mj.ew(II)V")
    public static void method5605(int arg0) {
        if (field567 == arg0) {
            return;
        }
        if (field567 == 0) {
            Statics.field107.method467();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            method3163(0);
            field517 = 0;
            field681 = 0;
            field549.method5411(arg0);
            if (arg0 != 20) {
                method58(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1102 != null) {
            Statics.field1102.method2615();
            Statics.field1102 = null;
        }
        if (field567 == 25) {
            field535 = 0;
            field765 = 0;
            field545 = 1;
            field546 = 0;
            field547 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method152() ? 0 : 12;
            class69.method4058(Statics.field1323, Statics.field2005, true, var2);
        } else if (arg0 == 20) {
            int var1 = field567 == 11 ? 4 : 0;
            class69.method4058(Statics.field1323, Statics.field2005, true, var1);
        } else if (arg0 == 11) {
            class69.method4058(Statics.field1323, Statics.field2005, false, 4);
        } else {
            class69.method60();
        }
        field567 = arg0;
    }

    @ObfuscatedName("client.eg(B)V")
    public void method1052() {
        if (field567 == 1000) {
            return;
        }
        long var1 = class398.method2299();
        int var3 = (int) (var1 - Statics.field3716);
        Statics.field3716 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class291.field3730 += var3;
        boolean var4;
        if (class291.field3722 == 0 && class291.field3720 == 0 && class291.field3714 == 0 && class291.field3718 == 0) {
            var4 = true;
        } else if (Statics.field3726 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class291.field3730 > 30000) {
                        throw new IOException();
                    }
                    while (class291.field3720 < 200 && class291.field3718 > 0) {
                        class289 var5 = (class289) class291.field3717.method6062();
                        class401 var6 = new class401(4);
                        var6.method6269(1);
                        var6.method6262((int) var5.field4075);
                        Statics.field3726.method2596(var6.field4294, 0, 4);
                        class291.field3723.method6065(var5, var5.field4075);
                        class291.field3718--;
                        class291.field3720++;
                    }
                    while (class291.field3722 < 200 && class291.field3714 > 0) {
                        class289 var7 = (class289) class291.field3721.method5006();
                        class401 var8 = new class401(4);
                        var8.method6269(0);
                        var8.method6262((int) var7.field4075);
                        Statics.field3726.method2596(var8.field4294, 0, 4);
                        var7.method5771();
                        class291.field3724.method6065(var7, var7.field4075);
                        class291.field3714--;
                        class291.field3722++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3726.method2603();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class291.field3730 = 0;
                        byte var11 = 0;
                        if (Statics.field1520 == null) {
                            var11 = 8;
                        } else if (class291.field3727 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class291.field3719.field4292;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3726.method2588(class291.field3719.field4294, class291.field3719.field4292, var12);
                            if (class291.field3725 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class291.field3719.field4294[class291.field3719.field4292 + var13] ^= class291.field3725;
                                }
                            }
                            class291.field3719.field4292 += var12;
                            if (class291.field3719.field4292 < var11) {
                                break;
                            }
                            if (Statics.field1520 == null) {
                                class291.field3719.field4292 = 0;
                                int var14 = class291.field3719.method6272();
                                int var15 = class291.field3719.method6284();
                                int var16 = class291.field3719.method6272();
                                int var17 = class291.field3719.method6277();
                                long var18 = (long) ((var14 << 16) + var15);
                                class289 var20 = (class289) class291.field3723.method6061(var18);
                                Statics.field1302 = true;
                                if (var20 == null) {
                                    var20 = (class289) class291.field3724.method6061(var18);
                                    Statics.field1302 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1520 = var20;
                                Statics.field3308 = new class401(var17 + var21 + Statics.field1520.field3691);
                                Statics.field3308.method6269(var16);
                                Statics.field3308.method6258(var17);
                                class291.field3727 = 8;
                                class291.field3719.field4292 = 0;
                            } else if (class291.field3727 == 0) {
                                if (class291.field3719.field4294[0] == -1) {
                                    class291.field3727 = 1;
                                    class291.field3719.field4292 = 0;
                                } else {
                                    Statics.field1520 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3308.field4294.length - Statics.field1520.field3691;
                            int var23 = 512 - class291.field3727;
                            if (var23 > var22 - Statics.field3308.field4292) {
                                var23 = var22 - Statics.field3308.field4292;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3726.method2588(Statics.field3308.field4294, Statics.field3308.field4292, var23);
                            if (class291.field3725 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3308.field4294[Statics.field3308.field4292 + var24] ^= class291.field3725;
                                }
                            }
                            Statics.field3308.field4292 += var23;
                            class291.field3727 += var23;
                            if (Statics.field3308.field4292 == var22) {
                                if (Statics.field1520.field4075 == 16711935L) {
                                    Statics.field3981 = Statics.field3308;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class288 var26 = class291.field3729[var25];
                                        if (var26 != null) {
                                            Statics.field3981.field4292 = var25 * 8 + 5;
                                            int var27 = Statics.field3981.method6277();
                                            int var28 = Statics.field3981.method6277();
                                            var26.method4751(var27, var28);
                                        }
                                    }
                                } else {
                                    class291.field3728.reset();
                                    class291.field3728.update(Statics.field3308.field4294, 0, var22);
                                    int var29 = (int) class291.field3728.getValue();
                                    if (Statics.field1520.field3690 != var29) {
                                        try {
                                            Statics.field3726.method2615();
                                        } catch (Exception var35) {
                                        }
                                        class291.field3731++;
                                        Statics.field3726 = null;
                                        class291.field3725 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class291.field3731 = 0;
                                    class291.field3732 = 0;
                                    Statics.field1520.field3693.method4712((int) (Statics.field1520.field4075 & 0xFFFFL), Statics.field3308.field4294, (Statics.field1520.field4075 & 0xFF0000L) == 16711680L, Statics.field1302);
                                }
                                Statics.field1520.method5775();
                                if (Statics.field1302) {
                                    class291.field3720--;
                                } else {
                                    class291.field3722--;
                                }
                                class291.field3727 = 0;
                                Statics.field1520 = null;
                                Statics.field3308 = null;
                            } else {
                                if (class291.field3727 != 512) {
                                    break;
                                }
                                class291.field3727 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3726.method2615();
                } catch (Exception var34) {
                }
                class291.field3732++;
                Statics.field3726 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1064();
        }
    }

    @ObfuscatedName("client.ec(I)V")
    public void method1064() {
        if (class291.field3731 >= 4) {
            this.method561("js5crc");
            method5605(1000);
            return;
        }
        if (class291.field3732 >= 4) {
            if (field567 <= 5) {
                this.method561("js5io");
                method5605(1000);
                return;
            }
            field514 = 3000;
            class291.field3732 = 3;
        }
        if (--field514 + 1 > 0) {
            return;
        }
        try {
            if (field616 == 0) {
                Statics.field98 = Statics.field183.method2552(Statics.field1691, Statics.field1983);
                field616++;
            }
            if (field616 == 1) {
                if (Statics.field98.field1595 == 2) {
                    this.method1054(-1);
                    return;
                }
                if (Statics.field98.field1595 == 1) {
                    field616++;
                }
            }
            if (field616 == 2) {
                if (field543) {
                    Socket var1 = (Socket) Statics.field98.field1603;
                    class345 var2 = new class345(var1, 40000, 5000);
                    Statics.field1029 = var2;
                } else {
                    Statics.field1029 = new class147((Socket) Statics.field98.field1603, Statics.field183, 5000);
                }
                class401 var3 = new class401(5);
                var3.method6269(15);
                var3.method6258(200);
                Statics.field1029.method2596(var3.field4294, 0, 5);
                field616++;
                Statics.field2644 = class398.method2299();
            }
            if (field616 == 3) {
                if (Statics.field1029.method2603() > 0 || !field543 && field567 <= 5) {
                    int var4 = Statics.field1029.method2590();
                    if (var4 != 0) {
                        this.method1054(var4);
                        return;
                    }
                    field616++;
                } else if (class398.method2299() - Statics.field2644 > 30000L) {
                    this.method1054(-2);
                    return;
                }
            }
            if (field616 == 4) {
                class291.method2497(Statics.field1029, field567 > 20);
                Statics.field98 = null;
                Statics.field1029 = null;
                field616 = 0;
                field636 = 0;
            }
        } catch (IOException var6) {
            this.method1054(-3);
        }
    }

    @ObfuscatedName("client.ei(II)V")
    public void method1054(int arg0) {
        Statics.field98 = null;
        Statics.field1029 = null;
        field616 = 0;
        if (Statics.field2016 == Statics.field1983) {
            Statics.field1983 = Statics.field3963;
        } else {
            Statics.field1983 = Statics.field2016;
        }
        field636++;
        if (field636 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field567 <= 5) {
                this.method561("js5connect_full");
                method5605(1000);
            } else {
                field514 = 3000;
            }
        } else if (field636 >= 2 && arg0 == 6) {
            this.method561("js5connect_outofdate");
            method5605(1000);
        } else if (field636 >= 4) {
            if (field567 <= 5) {
                this.method561("js5connect");
                method5605(1000);
            } else {
                field514 = 3000;
            }
        }
    }

    @ObfuscatedName("v.eq(Lky;Ljava/lang/String;I)V")
    public static void method160(class288 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field602.add(var2);
        field522 += var2.field999;
    }

    @ObfuscatedName("a.eh(I)I")
    public static int method53() {
        if (field602 == null || field766 >= field602.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field766; var1++) {
            var0 += ((class77) field602.get(var1)).field1001;
        }
        return var0 * 10000 / field522;
    }

    @ObfuscatedName("kb.ep(IS)I")
    public static int method4861(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("w.en(I)V")
    public static void method102() {
        if (field645 == 0) {
            Statics.field3027 = new class213(4, 104, 104, class75.field994);
            for (int var0 = 0; var0 < 4; var0++) {
                field712[var0] = new class173(104, 104);
            }
            Statics.field62 = new class414(512, 512);
            class69.field880 = class283.field3340;
            class69.field882 = 5;
            field645 = 20;
        } else if (field645 == 20) {
            class69.field880 = class283.field3433;
            class69.field882 = 10;
            field645 = 30;
        } else if (field645 == 30) {
            Statics.field1524 = method3648(0, false, true, true);
            Statics.field1059 = method3648(1, false, true, true);
            Statics.field1989 = method3648(2, true, false, true);
            Statics.field1605 = method3648(3, false, true, true);
            Statics.field3030 = method3648(4, false, true, true);
            Statics.field478 = method3648(5, true, true, true);
            Statics.field992 = method3648(6, true, true, true);
            Statics.field2380 = method3648(7, false, true, true);
            Statics.field2005 = method3648(8, false, true, true);
            Statics.field836 = method3648(9, false, true, true);
            Statics.field1323 = method3648(10, false, true, true);
            Statics.field6 = method3648(11, false, true, true);
            Statics.field1352 = method3648(12, false, true, true);
            Statics.field434 = method3648(13, true, false, true);
            Statics.field163 = method3648(14, false, true, true);
            Statics.field67 = method3648(15, false, true, true);
            Statics.field1007 = method3648(17, true, true, true);
            Statics.field2482 = method3648(18, false, true, true);
            Statics.field2585 = method3648(19, false, true, true);
            Statics.field435 = method3648(20, false, true, true);
            class69.field880 = class283.field3450;
            class69.field882 = 20;
            field645 = 40;
        } else if (field645 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1524.method4708() * 4 / 100;
            int var3 = var2 + Statics.field1059.method4708() * 4 / 100;
            int var4 = var3 + Statics.field1989.method4708() * 2 / 100;
            int var5 = var4 + Statics.field1605.method4708() * 2 / 100;
            int var6 = var5 + Statics.field3030.method4708() * 6 / 100;
            int var7 = var6 + Statics.field478.method4708() * 4 / 100;
            int var8 = var7 + Statics.field992.method4708() * 2 / 100;
            int var9 = var8 + Statics.field2380.method4708() * 56 / 100;
            int var10 = var9 + Statics.field2005.method4708() * 2 / 100;
            int var11 = var10 + Statics.field836.method4708() * 2 / 100;
            int var12 = var11 + Statics.field1323.method4708() * 2 / 100;
            int var13 = var12 + Statics.field6.method4708() * 2 / 100;
            int var14 = var13 + Statics.field1352.method4708() * 2 / 100;
            int var15 = var14 + Statics.field434.method4708() * 2 / 100;
            int var16 = var15 + Statics.field163.method4708() * 2 / 100;
            int var17 = var16 + Statics.field67.method4708() * 2 / 100;
            int var18 = var17 + Statics.field2585.method4708() / 100;
            int var19 = var18 + Statics.field2482.method4708() / 100;
            int var20 = var19 + Statics.field435.method4708() / 100;
            int var21 = var20 + (Statics.field1007.method4738() && Statics.field1007.method4761() ? 1 : 0);
            if (var21 == 100) {
                method160(Statics.field1524, "Animations");
                method160(Statics.field1059, "Skeletons");
                method160(Statics.field3030, "Sound FX");
                method160(Statics.field478, "Maps");
                method160(Statics.field992, "Music Tracks");
                method160(Statics.field2380, "Models");
                method160(Statics.field2005, "Sprites");
                method160(Statics.field6, "Music Jingles");
                method160(Statics.field163, "Music Samples");
                method160(Statics.field67, "Music Patches");
                method160(Statics.field2585, "World Map");
                method160(Statics.field2482, "World Map Geography");
                method160(Statics.field435, "World Map Ground");
                Statics.field1486 = new class350();
                Statics.field1486.method5672(Statics.field1007);
                class69.field880 = class283.field3344;
                class69.field882 = 30;
                field645 = 45;
            } else {
                if (var21 != 0) {
                    class69.field880 = class283.field3343 + var21 + "%";
                }
                class69.field882 = 30;
            }
        } else if (field645 == 45) {
            boolean var22 = !field569;
            Statics.field280 = 22050;
            Statics.field274 = var22;
            Statics.field284 = 2;
            class249 var23 = new class249();
            var23.method4321(9, 128);
            Statics.field1443 = class38.method2939(Statics.field183, 0, 22050);
            Statics.field1443.method687(var23);
            class248.method4642(Statics.field67, Statics.field163, Statics.field3030, var23);
            Statics.field1380 = class38.method2939(Statics.field183, 1, 2048);
            Statics.field474 = new class34();
            Statics.field1380.method687(Statics.field474);
            Statics.field1990 = new class51(22050, Statics.field280);
            class69.field880 = class283.field3611;
            class69.field882 = 35;
            field645 = 50;
            Statics.field2201 = new class376(Statics.field2005, Statics.field434);
        } else if (field645 == 50) {
            class377[] var24 = new class377[] { class377.field4200, class377.field4192, class377.field4196, class377.field4193, class377.field4195, class377.field4198 };
            int var25 = var24.length;
            class376 var26 = Statics.field2201;
            class377[] var27 = new class377[] { class377.field4200, class377.field4192, class377.field4196, class377.field4193, class377.field4195, class377.field4198 };
            field654 = var26.method6026(var27);
            if (field654.size() < var25) {
                class69.field880 = class283.field3346 + field654.size() * 100 / var25 + "%";
                class69.field882 = 40;
            } else {
                Statics.field1325 = (class315) field654.get(class377.field4193);
                Statics.field3196 = (class315) field654.get(class377.field4192);
                Statics.field834 = (class315) field654.get(class377.field4200);
                Statics.field858 = field761.method5782();
                class69.field880 = class283.field3347;
                class69.field882 = 40;
                field645 = 60;
            }
        } else if (field645 == 60) {
            int var28 = class69.method607(Statics.field1323, Statics.field2005);
            int var29 = class69.field908.length + class69.field891.length;
            if (var28 < var29) {
                class69.field880 = class283.field3348 + var28 * 100 / var29 + "%";
                class69.field882 = 50;
            } else {
                class69.field880 = class283.field3349;
                class69.field882 = 50;
                method5605(5);
                field645 = 70;
            }
        } else if (field645 == 70) {
            if (Statics.field1989.method4761()) {
                class288 var31 = Statics.field1989;
                Statics.field1943 = var31;
                class164.method4887(Statics.field1989);
                class288 var32 = Statics.field1989;
                class288 var33 = Statics.field2380;
                Statics.field1664 = var32;
                Statics.field1657 = var33;
                Statics.field1659 = Statics.field1664.method4774(3);
                class169.method2375(Statics.field1989, Statics.field2380, field569);
                class161.method2485(Statics.field1989, Statics.field2380);
                class167.method2735(Statics.field1989);
                class288 var34 = Statics.field1989;
                class288 var35 = Statics.field2380;
                boolean var36 = field486;
                class315 var37 = Statics.field1325;
                Statics.field1317 = var34;
                Statics.field1905 = var35;
                Statics.field1880 = var36;
                Statics.field96 = Statics.field1317.method4774(10);
                Statics.field1884 = var37;
                class288 var38 = Statics.field1989;
                class288 var39 = Statics.field1524;
                class288 var40 = Statics.field1059;
                Statics.field4278 = var38;
                Statics.field78 = var39;
                Statics.field1947 = var40;
                class163.method2731(Statics.field1989, Statics.field2380);
                class288 var41 = Statics.field1989;
                Statics.field1787 = var41;
                class288 var42 = Statics.field1989;
                Statics.field4032 = var42;
                Statics.field1622 = Statics.field4032.method4774(16);
                class288 var43 = Statics.field1605;
                class288 var44 = Statics.field2380;
                class288 var45 = Statics.field2005;
                class288 var46 = Statics.field434;
                Statics.field3171 = var43;
                Statics.field3094 = var44;
                Statics.field4417 = var45;
                Statics.field941 = var46;
                Statics.field3153 = new class262[Statics.field3171.method4794()][];
                Statics.field1690 = new boolean[Statics.field3171.method4794()];
                class152.method4999(Statics.field1989);
                class159.method5454(Statics.field1989);
                class288 var47 = Statics.field1989;
                Statics.field1649 = var47;
                class288 var48 = Statics.field1989;
                Statics.field149 = var48;
                Statics.field3980 = new class388(Statics.field4268, 54, Statics.field438, Statics.field1989);
                Statics.field2030 = new class388(Statics.field4268, 47, Statics.field438, Statics.field1989);
                Statics.field2344 = new class97();
                class288 var49 = Statics.field1989;
                class288 var50 = Statics.field2005;
                class288 var51 = Statics.field434;
                Statics.field1810 = var49;
                Statics.field1800 = var50;
                Statics.field94 = var51;
                class157.method2157(Statics.field1989, Statics.field2005);
                class288 var52 = Statics.field1989;
                class288 var53 = Statics.field2005;
                Statics.field1640 = var53;
                if (var52.method4761()) {
                    Statics.field1625 = var52.method4774(35);
                    Statics.field1624 = new class154[Statics.field1625];
                    for (int var54 = 0; var54 < Statics.field1625; var54++) {
                        byte[] var55 = var52.method4756(35, var54);
                        Statics.field1624[var54] = new class154(var54);
                        if (var55 != null) {
                            Statics.field1624[var54].method2651(new class401(var55));
                            Statics.field1624[var54].method2653();
                        }
                    }
                }
                class69.field880 = class283.field3351;
                class69.field882 = 60;
                field645 = 80;
            } else {
                class69.field880 = class283.field3350 + Statics.field1989.method4715() + "%";
                class69.field882 = 60;
            }
        } else if (field645 == 80) {
            int var56 = 0;
            if (Statics.field8 == null) {
                Statics.field8 = class415.method6113(Statics.field2005, Statics.field1486.field4024, 0);
            } else {
                var56++;
            }
            if (Statics.field110 == null) {
                Statics.field110 = class415.method6113(Statics.field2005, Statics.field1486.field4015, 0);
            } else {
                var56++;
            }
            if (Statics.field3740 == null) {
                Statics.field3740 = class415.method2687(Statics.field2005, Statics.field1486.field4022, 0);
            } else {
                var56++;
            }
            if (Statics.field111 == null) {
                class288 var57 = Statics.field2005;
                int var58 = Statics.field1486.field4017;
                class414[] var59;
                if (class415.method2847(var57, var58, 0)) {
                    class414[] var60 = new class414[Statics.field4393];
                    int var61 = 0;
                    while (true) {
                        if (var61 >= Statics.field4393) {
                            class415.method4677();
                            var59 = var60;
                            break;
                        }
                        class414 var62 = var60[var61] = new class414();
                        var62.field4386 = Statics.field4394;
                        var62.field4391 = Statics.field4356;
                        var62.field4384 = Statics.field1510[var61];
                        var62.field4387 = Statics.field1490[var61];
                        var62.field4390 = Statics.field4395[var61];
                        var62.field4383 = Statics.field92[var61];
                        int var63 = var62.field4390 * var62.field4383;
                        byte[] var64 = Statics.field4397[var61];
                        var62.field4385 = new int[var63];
                        for (int var65 = 0; var65 < var63; var65++) {
                            var62.field4385[var65] = Statics.field4034[var64[var65] & 0xFF];
                        }
                        var61++;
                    }
                } else {
                    var59 = null;
                }
                Statics.field111 = var59;
            } else {
                var56++;
            }
            if (Statics.field1175 == null) {
                class288 var67 = Statics.field2005;
                int var68 = Statics.field1486.field4018;
                class414[] var69;
                if (class415.method2847(var67, var68, 0)) {
                    class414[] var70 = new class414[Statics.field4393];
                    int var71 = 0;
                    while (true) {
                        if (var71 >= Statics.field4393) {
                            class415.method4677();
                            var69 = var70;
                            break;
                        }
                        class414 var72 = var70[var71] = new class414();
                        var72.field4386 = Statics.field4394;
                        var72.field4391 = Statics.field4356;
                        var72.field4384 = Statics.field1510[var71];
                        var72.field4387 = Statics.field1490[var71];
                        var72.field4390 = Statics.field4395[var71];
                        var72.field4383 = Statics.field92[var71];
                        int var73 = var72.field4390 * var72.field4383;
                        byte[] var74 = Statics.field4397[var71];
                        var72.field4385 = new int[var73];
                        for (int var75 = 0; var75 < var73; var75++) {
                            var72.field4385[var75] = Statics.field4034[var74[var75] & 0xFF];
                        }
                        var71++;
                    }
                } else {
                    var69 = null;
                }
                Statics.field1175 = var69;
            } else {
                var56++;
            }
            if (Statics.field1319 == null) {
                class288 var77 = Statics.field2005;
                int var78 = Statics.field1486.field4016;
                class414[] var79;
                if (class415.method2847(var77, var78, 0)) {
                    class414[] var80 = new class414[Statics.field4393];
                    int var81 = 0;
                    while (true) {
                        if (var81 >= Statics.field4393) {
                            class415.method4677();
                            var79 = var80;
                            break;
                        }
                        class414 var82 = var80[var81] = new class414();
                        var82.field4386 = Statics.field4394;
                        var82.field4391 = Statics.field4356;
                        var82.field4384 = Statics.field1510[var81];
                        var82.field4387 = Statics.field1490[var81];
                        var82.field4390 = Statics.field4395[var81];
                        var82.field4383 = Statics.field92[var81];
                        int var83 = var82.field4390 * var82.field4383;
                        byte[] var84 = Statics.field4397[var81];
                        var82.field4385 = new int[var83];
                        for (int var85 = 0; var85 < var83; var85++) {
                            var82.field4385[var85] = Statics.field4034[var84[var85] & 0xFF];
                        }
                        var81++;
                    }
                } else {
                    var79 = null;
                }
                Statics.field1319 = var79;
            } else {
                var56++;
            }
            if (Statics.field774 == null) {
                class288 var87 = Statics.field2005;
                int var88 = Statics.field1486.field4019;
                class414[] var89;
                if (class415.method2847(var87, var88, 0)) {
                    class414[] var90 = new class414[Statics.field4393];
                    int var91 = 0;
                    while (true) {
                        if (var91 >= Statics.field4393) {
                            class415.method4677();
                            var89 = var90;
                            break;
                        }
                        class414 var92 = var90[var91] = new class414();
                        var92.field4386 = Statics.field4394;
                        var92.field4391 = Statics.field4356;
                        var92.field4384 = Statics.field1510[var91];
                        var92.field4387 = Statics.field1490[var91];
                        var92.field4390 = Statics.field4395[var91];
                        var92.field4383 = Statics.field92[var91];
                        int var93 = var92.field4390 * var92.field4383;
                        byte[] var94 = Statics.field4397[var91];
                        var92.field4385 = new int[var93];
                        for (int var95 = 0; var95 < var93; var95++) {
                            var92.field4385[var95] = Statics.field4034[var94[var95] & 0xFF];
                        }
                        var91++;
                    }
                } else {
                    var89 = null;
                }
                Statics.field774 = var89;
            } else {
                var56++;
            }
            if (Statics.field944 == null) {
                class288 var97 = Statics.field2005;
                int var98 = Statics.field1486.field4021;
                class414[] var99;
                if (class415.method2847(var97, var98, 0)) {
                    class414[] var100 = new class414[Statics.field4393];
                    int var101 = 0;
                    while (true) {
                        if (var101 >= Statics.field4393) {
                            class415.method4677();
                            var99 = var100;
                            break;
                        }
                        class414 var102 = var100[var101] = new class414();
                        var102.field4386 = Statics.field4394;
                        var102.field4391 = Statics.field4356;
                        var102.field4384 = Statics.field1510[var101];
                        var102.field4387 = Statics.field1490[var101];
                        var102.field4390 = Statics.field4395[var101];
                        var102.field4383 = Statics.field92[var101];
                        int var103 = var102.field4390 * var102.field4383;
                        byte[] var104 = Statics.field4397[var101];
                        var102.field4385 = new int[var103];
                        for (int var105 = 0; var105 < var103; var105++) {
                            var102.field4385[var105] = Statics.field4034[var104[var105] & 0xFF];
                        }
                        var101++;
                    }
                } else {
                    var99 = null;
                }
                Statics.field944 = var99;
            } else {
                var56++;
            }
            if (Statics.field1407 == null) {
                class288 var107 = Statics.field2005;
                int var108 = Statics.field1486.field4020;
                class414[] var109;
                if (class415.method2847(var107, var108, 0)) {
                    class414[] var110 = new class414[Statics.field4393];
                    int var111 = 0;
                    while (true) {
                        if (var111 >= Statics.field4393) {
                            class415.method4677();
                            var109 = var110;
                            break;
                        }
                        class414 var112 = var110[var111] = new class414();
                        var112.field4386 = Statics.field4394;
                        var112.field4391 = Statics.field4356;
                        var112.field4384 = Statics.field1510[var111];
                        var112.field4387 = Statics.field1490[var111];
                        var112.field4390 = Statics.field4395[var111];
                        var112.field4383 = Statics.field92[var111];
                        int var113 = var112.field4390 * var112.field4383;
                        byte[] var114 = Statics.field4397[var111];
                        var112.field4385 = new int[var113];
                        for (int var115 = 0; var115 < var113; var115++) {
                            var112.field4385[var115] = Statics.field4034[var114[var115] & 0xFF];
                        }
                        var111++;
                    }
                } else {
                    var109 = null;
                }
                Statics.field1407 = var109;
            } else {
                var56++;
            }
            if (Statics.field2169 == null) {
                Statics.field2169 = class415.method2687(Statics.field2005, Statics.field1486.field4023, 0);
            } else {
                var56++;
            }
            if (Statics.field473 == null) {
                Statics.field473 = class415.method2687(Statics.field2005, Statics.field1486.field4014, 0);
            } else {
                var56++;
            }
            if (var56 < 11) {
                class69.field880 = class283.field3514 + var56 * 100 / 12 + "%";
                class69.field882 = 70;
            } else {
                Statics.field3859 = Statics.field473;
                Statics.field110.method6651();
                int var117 = (int) (Math.random() * 21.0D) - 10;
                int var118 = (int) (Math.random() * 21.0D) - 10;
                int var119 = (int) (Math.random() * 21.0D) - 10;
                int var120 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3740[0].method6628(var117 + var120, var118 + var120, var119 + var120);
                class69.field880 = class283.field3537;
                class69.field882 = 70;
                field645 = 90;
            }
        } else if (field645 == 90) {
            if (Statics.field836.method4761()) {
                Statics.field3799 = new class218(Statics.field836, Statics.field2005, 20, Statics.field3227.field1213, field569 ? 64 : 128);
                class211.method3750(Statics.field3799);
                class211.method3751(Statics.field3227.field1213);
                field645 = 100;
            } else {
                class69.field880 = class283.field3354 + "0%";
                class69.field882 = 90;
            }
        } else if (field645 == 100) {
            int var121 = Statics.field3799.method4030();
            if (var121 < 100) {
                class69.field880 = class283.field3354 + var121 + "%";
                class69.field882 = 90;
            } else {
                class69.field880 = class283.field3355;
                class69.field882 = 90;
                field645 = 110;
            }
        } else if (field645 == 110) {
            Statics.field1212 = new class82();
            Statics.field183.method2553(Statics.field1212, 10);
            class69.field880 = class283.field3636;
            class69.field882 = 92;
            field645 = 120;
        } else if (field645 == 120) {
            if (Statics.field1323.method4775("huffman", "")) {
                class264 var122 = new class264(Statics.field1323.method4807("huffman", ""));
                Statics.field3206 = var122;
                class69.field880 = class283.field3358;
                class69.field882 = 94;
                field645 = 130;
            } else {
                class69.field880 = class283.field3402 + "%";
                class69.field882 = 94;
            }
        } else if (field645 == 130) {
            if (!Statics.field1605.method4761()) {
                class69.field880 = class283.field3452 + Statics.field1605.method4715() * 4 / 5 + "%";
                class69.field882 = 96;
            } else if (!Statics.field1352.method4761()) {
                class69.field880 = class283.field3452 + (80 + Statics.field1352.method4715() / 6) + "%";
                class69.field882 = 96;
            } else if (Statics.field434.method4761()) {
                class69.field880 = class283.field3626;
                class69.field882 = 98;
                field645 = 140;
            } else {
                class69.field880 = class283.field3452 + (96 + Statics.field434.method4715() / 50) + "%";
                class69.field882 = 96;
            }
        } else if (field645 == 140) {
            class69.field882 = 100;
            if (Statics.field2585.method4776(class200.field2221.field2220)) {
                if (Statics.field1243 == null) {
                    Statics.field1243 = new class375();
                    Statics.field1243.method5824(Statics.field2585, Statics.field2482, Statics.field435, Statics.field834, field654, Statics.field3740);
                }
                class69.field880 = class283.field3362;
                field645 = 150;
            } else {
                class69.field880 = class283.field3491 + Statics.field2585.method4842(class200.field2221.field2220) / 10 + "%";
            }
        } else if (field645 == 150) {
            method5605(10);
        }
    }

    @ObfuscatedName("gn.ed(IZZZI)Lky;")
    public static class288 method3648(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class348 var4 = null;
        if (class144.field1557 != null) {
            var4 = new class348(arg0, class144.field1557, Statics.field1565[arg0], 1000000);
        }
        return new class288(var4, Statics.field1174, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ey(B)V")
    public final void method1055() {
        class344 var1 = field639.method2251();
        class400 var2 = field639.field1295;
        try {
            if (field516 == 0) {
                if (Statics.field2341 == null && (field527.method1854() || field517 > 250)) {
                    Statics.field2341 = field527.method1855();
                    field527.method1859();
                    field527 = null;
                }
                if (Statics.field2341 != null) {
                    if (var1 != null) {
                        var1.method2615();
                        var1 = null;
                    }
                    Statics.field1298 = null;
                    field539 = false;
                    field517 = 0;
                    if (field521.method6522()) {
                        try {
                            this.method1049(Statics.field2141);
                            method3163(20);
                        } catch (Throwable var73) {
                            class425.method5430((String) null, var73);
                            method1561(65);
                            return;
                        }
                    } else {
                        method3163(1);
                    }
                }
            }
            if (field516 == 20) {
                if (!this.field524.method279()) {
                    return;
                }
                if (this.field524.method278()) {
                    class425.method5430(this.field524.method288(), (Throwable) null);
                    method1561(65);
                    return;
                }
                class22 var4 = this.field524.method280();
                if (var4.method310() != 200) {
                    class425.method5430("Response code: " + var4.method310() + "Response body: " + var4.method305(), (Throwable) null);
                    method1561(65);
                    return;
                }
                field517 = 0;
                this.field548 = var4.method305();
                method3163(1);
            }
            if (field516 == 1) {
                if (Statics.field1298 == null) {
                    Statics.field1298 = Statics.field183.method2552(Statics.field1691, Statics.field1983);
                }
                if (Statics.field1298.field1595 == 2) {
                    throw new IOException();
                }
                if (Statics.field1298.field1595 == 1) {
                    if (field543) {
                        Socket var5 = (Socket) Statics.field1298.field1603;
                        class345 var6 = new class345(var5, 40000, 5000);
                        var1 = var6;
                    } else {
                        var1 = new class147((Socket) Statics.field1298.field1603, Statics.field183, 5000);
                    }
                    field639.method2248(var1);
                    Statics.field1298 = null;
                    method3163(2);
                }
            }
            if (field516 == 2) {
                field639.method2262();
                class242 var7 = class242.method3744();
                var7.field2785 = null;
                var7.field2786 = 0;
                var7.field2780 = new class400(5000);
                var7.field2780.method6269(class244.field2886.field2891);
                field639.method2246(var7);
                field639.method2253();
                var2.field4292 = 0;
                method3163(3);
            }
            if (field516 == 3) {
                if (Statics.field1443 != null) {
                    Statics.field1443.method689();
                }
                if (Statics.field1380 != null) {
                    Statics.field1380.method689();
                }
                boolean var10 = true;
                if (field543 && !var1.method2592(1)) {
                    var10 = false;
                }
                if (var10) {
                    int var11 = var1.method2590();
                    if (Statics.field1443 != null) {
                        Statics.field1443.method689();
                    }
                    if (Statics.field1380 != null) {
                        Statics.field1380.method689();
                    }
                    if (var11 != 0) {
                        method1561(var11);
                        return;
                    }
                    var2.field4292 = 0;
                    method3163(4);
                }
            }
            if (field516 == 4) {
                if (var2.field4292 < 8) {
                    int var12 = var1.method2603();
                    if (var12 > 8 - var2.field4292) {
                        var12 = 8 - var2.field4292;
                    }
                    if (var12 > 0) {
                        var1.method2588(var2.field4294, var2.field4292, var12);
                        var2.field4292 += var12;
                    }
                }
                if (var2.field4292 == 8) {
                    var2.field4292 = 0;
                    Statics.field3801 = var2.method6275();
                    method3163(5);
                }
            }
            if (field516 == 5) {
                field639.field1295.field4292 = 0;
                field639.method2262();
                class400 var13 = new class400(500);
                int[] var14 = new int[] { Statics.field2341.nextInt(), Statics.field2341.nextInt(), Statics.field2341.nextInt(), Statics.field2341.nextInt() };
                var13.field4292 = 0;
                var13.method6269(1);
                var13.method6258(var14[0]);
                var13.method6258(var14[1]);
                var13.method6258(var14[2]);
                var13.method6258(var14[3]);
                var13.method6322(Statics.field3801);
                if (field567 == 40) {
                    var13.method6258(Statics.field1017[0]);
                    var13.method6258(Statics.field1017[1]);
                    var13.method6258(Statics.field1017[2]);
                    var13.method6258(Statics.field1017[3]);
                } else {
                    var13.method6269(field520.method36());
                    switch(field520.field1362) {
                        case 0:
                            var13.method6258((Integer) Statics.field3227.field1211.get(class319.method744(class69.field893)));
                            break;
                        case 1:
                        case 2:
                            var13.method6262(Statics.field237);
                            var13.field4292++;
                            break;
                        case 3:
                            var13.field4292 += 4;
                    }
                    if (field521.method6522()) {
                        var13.method6269(class405.field4349.method36());
                        var13.method6489(this.field548);
                    } else {
                        var13.method6269(class405.field4345.method36());
                        var13.method6489(class69.field875);
                    }
                }
                var13.method6295(class68.field865, class68.field867);
                Statics.field1017 = var14;
                class242 var15 = class242.method3744();
                var15.field2785 = null;
                var15.field2786 = 0;
                var15.field2780 = new class400(5000);
                var15.field2780.field4292 = 0;
                if (field567 == 40) {
                    var15.field2780.method6269(class244.field2887.field2891);
                } else {
                    var15.field2780.method6269(class244.field2892.field2891);
                }
                var15.field2780.method6256(0);
                int var18 = var15.field2780.field4292;
                var15.field2780.method6258(200);
                var15.field2780.method6258(1);
                var15.field2780.method6269(field489);
                var15.field2780.method6269(field682);
                var15.field2780.method6265(var13.field4294, 0, var13.field4292);
                int var19 = var15.field2780.field4292;
                var15.field2780.method6489(class69.field893);
                var15.field2780.method6269((field710 ? 1 : 0) << 1 | (field569 ? 1 : 0));
                var15.field2780.method6256(Statics.field3203);
                var15.field2780.method6256(Statics.field1050);
                class400 var20 = var15.field2780;
                if (field530 == null) {
                    byte[] var21 = new byte[24];
                    try {
                        class144.field1564.method6115(0L);
                        class144.field1564.method6117(var21);
                        int var22;
                        for (var22 = 0; var22 < 24 && var21[var22] == 0; var22++) {
                        }
                        if (var22 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var74) {
                        for (int var24 = 0; var24 < 24; var24++) {
                            var21[var24] = -1;
                        }
                    }
                    var20.method6265(var21, 0, var21.length);
                } else {
                    var20.method6265(field530, 0, field530.length);
                }
                var15.field2780.method6489(Statics.field1010);
                var15.field2780.method6258(Statics.field143);
                class401 var27 = new class401(Statics.field858.method5802());
                Statics.field858.method5798(var27);
                var15.field2780.method6265(var27.field4294, 0, var27.field4294.length);
                var15.field2780.method6269(field489);
                var15.field2780.method6258(0);
                var15.field2780.method6317(Statics.field1323.field3709);
                var15.field2780.method6258(Statics.field992.field3709);
                var15.field2780.method6258(0);
                var15.field2780.method6317(Statics.field435.field3709);
                var15.field2780.method6316(Statics.field1989.field3709);
                var15.field2780.method6318(Statics.field1524.field3709);
                var15.field2780.method6318(Statics.field1605.field3709);
                var15.field2780.method6317(Statics.field67.field3709);
                var15.field2780.method6317(Statics.field1007.field3709);
                var15.field2780.method6317(Statics.field836.field3709);
                var15.field2780.method6258(Statics.field2380.field3709);
                var15.field2780.method6316(Statics.field3030.field3709);
                var15.field2780.method6317(Statics.field478.field3709);
                var15.field2780.method6318(Statics.field2005.field3709);
                var15.field2780.method6316(Statics.field1352.field3709);
                var15.field2780.method6316(Statics.field2482.field3709);
                var15.field2780.method6316(Statics.field434.field3709);
                var15.field2780.method6258(Statics.field1059.field3709);
                var15.field2780.method6317(Statics.field2585.field3709);
                var15.field2780.method6317(Statics.field6.field3709);
                var15.field2780.method6316(Statics.field163.field3709);
                var15.field2780.method6304(var14, var19, var15.field2780.field4292);
                var15.field2780.method6268(var15.field2780.field4292 - var18);
                field639.method2246(var15);
                field639.method2253();
                field639.field1287 = new class417(var14);
                int[] var28 = new int[4];
                for (int var29 = 0; var29 < 4; var29++) {
                    var28[var29] = var14[var29] + 50;
                }
                var2.method6218(var28);
                method3163(6);
            }
            if (field516 == 6 && var1.method2603() > 0) {
                int var30 = var1.method2590();
                if (var30 == 21 && field567 == 20) {
                    method3163(12);
                } else if (var30 == 2) {
                    method3163(14);
                } else if (var30 == 15 && field567 == 40) {
                    field639.field1293 = -1;
                    method3163(19);
                } else if (var30 == 64) {
                    method3163(10);
                } else if (var30 == 23 && field681 < 1) {
                    field681++;
                    method3163(0);
                } else if (var30 == 29) {
                    method3163(17);
                } else if (var30 == 69) {
                    method3163(7);
                } else {
                    method1561(var30);
                    return;
                }
            }
            if (field516 == 7 && var1.method2603() >= 2) {
                var1.method2588(var2.field4294, 0, 2);
                var2.field4292 = 0;
                Statics.field4218 = var2.method6284();
                method3163(8);
            }
            if (field516 == 8 && var1.method2603() >= Statics.field4218) {
                var2.field4292 = 0;
                var1.method2588(var2.field4294, var2.field4292, Statics.field4218);
                class7[] var31 = new class7[] { class7.field18 };
                class7 var32 = var31[var2.method6272()];
                try {
                    class4 var33 = class5.method2763(var32);
                    this.field529 = new class8(var2, var33);
                    method3163(9);
                } catch (Exception var72) {
                    method1561(22);
                    return;
                }
            }
            if (field516 == 9 && this.field529.method44()) {
                this.field528 = this.field529.method46();
                this.field529.method45();
                this.field529 = null;
                if (this.field528 == null) {
                    method1561(22);
                    return;
                }
                field639.method2262();
                class242 var35 = class242.method3744();
                var35.field2785 = null;
                var35.field2786 = 0;
                var35.field2780 = new class400(5000);
                var35.field2780.method6269(class244.field2889.field2891);
                var35.field2780.method6256(this.field528.field4292);
                var35.field2780.method6266(this.field528);
                field639.method2246(var35);
                field639.method2253();
                this.field528 = null;
                method3163(6);
            }
            if (field516 == 10 && var1.method2603() > 0) {
                Statics.field3819 = var1.method2590();
                method3163(11);
            }
            if (field516 == 11 && var1.method2603() >= Statics.field3819) {
                var1.method2588(var2.field4294, 0, Statics.field3819);
                var2.field4292 = 0;
                method3163(6);
            }
            if (field516 == 12 && var1.method2603() > 0) {
                field540 = (var1.method2590() + 3) * 60;
                method3163(13);
            }
            if (field516 == 13) {
                field517 = 0;
                class69.method260(class283.field3368, class283.field3369, field540 / 60 + class283.field3370);
                if (--field540 <= 0) {
                    method3163(0);
                }
            } else {
                if (field516 == 14 && var1.method2603() >= 1) {
                    Statics.field2177 = var1.method2590();
                    method3163(15);
                }
                if (field516 == 15 && var1.method2603() >= Statics.field2177) {
                    boolean var38 = var1.method2590() == 1;
                    var1.method2588(var2.field4294, 0, 4);
                    var2.field4292 = 0;
                    boolean var39 = false;
                    if (var38) {
                        int var40 = var2.method6223() << 24;
                        int var41 = var40 | var2.method6223() << 16;
                        int var42 = var41 | var2.method6223() << 8;
                        int var43 = var42 | var2.method6223();
                        int var44 = class319.method744(class69.field893);
                        if (Statics.field3227.field1211.size() >= 10 && !Statics.field3227.field1211.containsKey(var44)) {
                            Iterator var45 = Statics.field3227.field1211.entrySet().iterator();
                            var45.next();
                            var45.remove();
                        }
                        Statics.field3227.field1211.put(var44, var43);
                    }
                    if (field581) {
                        Statics.field3227.field1199 = class69.field893;
                    } else {
                        Statics.field3227.field1199 = null;
                    }
                    class89.method1005();
                    field660 = var1.method2590();
                    field518 = var1.method2590() == 1;
                    field608 = var1.method2590();
                    field608 <<= 0x8;
                    field608 += var1.method2590();
                    field631 = var1.method2590();
                    var1.method2588(var2.field4294, 0, 1);
                    var2.field4292 = 0;
                    class243[] var46 = Statics.method4184();
                    int var47 = var2.method6217();
                    if (var47 < 0 || var47 >= var46.length) {
                        throw new IOException(var47 + " " + var2.field4292);
                    }
                    field639.field1288 = var46[var47];
                    field639.field1293 = field639.field1288.field2884;
                    var1.method2588(var2.field4294, 0, 2);
                    var2.field4292 = 0;
                    field639.field1293 = var2.method6284();
                    try {
                        client var48 = Statics.field107;
                        JSObject.getWindow(var48).call("zap", (Object[]) null);
                    } catch (Throwable var71) {
                    }
                    method3163(16);
                }
                if (field516 != 16) {
                    if (field516 == 17 && var1.method2603() >= 2) {
                        var2.field4292 = 0;
                        var1.method2588(var2.field4294, 0, 2);
                        var2.field4292 = 0;
                        Statics.field1365 = var2.method6284();
                        method3163(18);
                    }
                    if (field516 == 18 && var1.method2603() >= Statics.field1365) {
                        var2.field4292 = 0;
                        var1.method2588(var2.field4294, 0, Statics.field1365);
                        var2.field4292 = 0;
                        String var66 = var2.method6474();
                        String var67 = var2.method6474();
                        String var68 = var2.method6474();
                        class69.method260(var66, var67, var68);
                        method5605(10);
                    }
                    if (field516 == 19) {
                        if (field639.field1293 == -1) {
                            if (var1.method2603() < 2) {
                                return;
                            }
                            var1.method2588(var2.field4294, 0, 2);
                            var2.field4292 = 0;
                            field639.field1293 = var2.method6284();
                        }
                        if (var1.method2603() >= field639.field1293) {
                            var1.method2588(var2.field4294, 0, field639.field1293);
                            var2.field4292 = 0;
                            int var69 = field639.field1293;
                            field549.method5414();
                            method2134();
                            class96.method4694(var2);
                            if (var2.field4292 != var69) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field517++;
                        if (field517 > 2000) {
                            if (field681 < 1) {
                                if (Statics.field2016 == Statics.field1983) {
                                    Statics.field1983 = Statics.field3963;
                                } else {
                                    Statics.field1983 = Statics.field2016;
                                }
                                field681++;
                                method3163(0);
                            } else {
                                method1561(-3);
                            }
                        }
                    }
                } else if (var1.method2603() >= field639.field1293) {
                    var2.field4292 = 0;
                    var1.method2588(var2.field4294, 0, field639.field1293);
                    field549.method5412();
                    field495 = 1L;
                    Statics.field1212.field1058 = 0;
                    Statics.field1670 = true;
                    field579 = true;
                    field720 = -1L;
                    class55.method42();
                    field639.method2262();
                    field639.field1295.field4292 = 0;
                    field639.field1288 = null;
                    field639.field1282 = null;
                    field639.field1294 = null;
                    field639.field1289 = null;
                    field639.field1293 = 0;
                    field639.field1291 = 0;
                    field501 = 0;
                    field644 = 0;
                    field577 = 0;
                    Statics.method43();
                    class33.method2491(0);
                    class98.method14();
                    field499 = 0;
                    field646 = false;
                    field544 = 0;
                    field561 = 0;
                    field753 = 0;
                    Statics.field3166 = null;
                    field730 = 0;
                    field723 = -1;
                    field607 = 0;
                    field729 = 0;
                    field605 = class94.field1237;
                    field511 = class94.field1237;
                    field513 = 0;
                    class96.field1251 = 0;
                    for (int var50 = 0; var50 < 2048; var50++) {
                        class96.field1249[var50] = null;
                        class96.field1246[var50] = 1;
                    }
                    for (int var51 = 0; var51 < 2048; var51++) {
                        field642[var51] = null;
                    }
                    for (int var52 = 0; var52 < 32768; var52++) {
                        field532[var52] = null;
                    }
                    field618 = -1;
                    field655.method5014();
                    field622.method5014();
                    for (int var53 = 0; var53 < 4; var53++) {
                        for (int var54 = 0; var54 < 104; var54++) {
                            for (int var55 = 0; var55 < 104; var55++) {
                                field619[var53][var54][var55] = null;
                            }
                        }
                    }
                    field708 = new class309();
                    Statics.field464.method1600();
                    for (int var56 = 0; var56 < Statics.field1622; var56++) {
                        class153 var57 = class153.method1031(var56);
                        if (var57 != null) {
                            class257.field3007[var56] = 0;
                            class257.field3009[var56] = 0;
                        }
                    }
                    Statics.field2344.method2190();
                    field482 = -1;
                    if (field718 != -1) {
                        int var58 = field718;
                        if (var58 != -1 && Statics.field1690[var58]) {
                            Statics.field3171.method4768(var58);
                            if (Statics.field3153[var58] != null) {
                                boolean var59 = true;
                                for (int var60 = 0; var60 < Statics.field3153[var58].length; var60++) {
                                    if (Statics.field3153[var58][var60] != null) {
                                        if (Statics.field3153[var58][var60].field3146 == 2) {
                                            var59 = false;
                                        } else {
                                            Statics.field3153[var58][var60] = null;
                                        }
                                    }
                                }
                                if (var59) {
                                    Statics.field3153[var58] = null;
                                }
                                Statics.field1690[var58] = false;
                            }
                        }
                    }
                    for (class80 var61 = (class80) field652.method6062(); var61 != null; var61 = (class80) field652.method6060()) {
                        method3192(var61, true);
                    }
                    field718 = -1;
                    field652 = new class380(8);
                    field657 = null;
                    field695 = 0;
                    field627 = false;
                    field758.method4516((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var62 = 0; var62 < 8; var62++) {
                        field586[var62] = null;
                        field550[var62] = false;
                    }
                    class78.field1008 = new class380(32);
                    field493 = true;
                    for (int var63 = 0; var63 < 100; var63++) {
                        field711[var63] = true;
                    }
                    class242 var64 = class242.method2075(class240.field2719, field639.field1287);
                    var64.field2780.method6269(method151());
                    var64.field2780.method6256(Statics.field3203);
                    var64.field2780.method6256(Statics.field1050);
                    field639.method2246(var64);
                    Statics.field3205 = null;
                    Statics.field1373 = null;
                    Arrays.fill(field721, (Object) null);
                    Statics.field3746 = null;
                    Arrays.fill(field722, (Object) null);
                    for (int var65 = 0; var65 < 8; var65++) {
                        field600[var65] = new class299();
                    }
                    Statics.field21 = null;
                    class96.method4694(var2);
                    Statics.field1672 = -1;
                    method3310(false, var2);
                    field639.field1288 = null;
                }
            }
        } catch (IOException var75) {
            if (field681 < 1) {
                if (Statics.field2016 == Statics.field1983) {
                    Statics.field1983 = Statics.field3963;
                } else {
                    Statics.field1983 = Statics.field2016;
                }
                field681++;
                method3163(0);
            } else {
                method1561(-2);
            }
        }
    }

    @ObfuscatedName("cw.ex(S)V")
    public static void method2134() {
        field639.method2262();
        field639.field1295.field4292 = 0;
        field639.field1288 = null;
        field639.field1282 = null;
        field639.field1294 = null;
        field639.field1289 = null;
        field639.field1293 = 0;
        field639.field1291 = 0;
        field501 = 0;
        Statics.method43();
        field730 = 0;
        field607 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field642[var0] = null;
        }
        Statics.field868 = null;
        for (int var1 = 0; var1 < field532.length; var1++) {
            class91 var2 = field532[var1];
            if (var2 != null) {
                var2.field1160 = -1;
                var2.field1134 = false;
            }
        }
        class78.field1008 = new class380(32);
        method5605(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field711[var3] = true;
        }
        class242 var4 = class242.method2075(class240.field2719, field639.field1287);
        var4.field2780.method6269(method151());
        var4.field2780.method6256(Statics.field3203);
        var4.field2780.method6256(Statics.field1050);
        field639.method2246(var4);
    }

    @ObfuscatedName("bc.eo(II)V")
    public static void method1561(int arg0) {
        if (arg0 == -3) {
            class69.method260(class283.field3420, class283.field3372, class283.field3631);
        } else if (arg0 == -2) {
            class69.method260(class283.field3448, class283.field3333, class283.field3376);
        } else if (arg0 == -1) {
            class69.method260(class283.field3528, class283.field3334, class283.field3379);
        } else if (arg0 == 3) {
            class69.method2363(3);
            class69.field870 = 1;
        } else if (arg0 == 4) {
            class69.method2363(14);
            class69.field885 = 0;
        } else if (arg0 == 5) {
            class69.field870 = 2;
            class69.method260(class283.field3638, class283.field3384, class283.field3385);
        } else if (arg0 == 68 || !(field693 || arg0 != 6)) {
            class69.method260(class283.field3386, class283.field3387, class283.field3388);
        } else if (arg0 == 7) {
            class69.method260(class283.field3411, class283.field3390, class283.field3609);
        } else if (arg0 == 8) {
            class69.method260(class283.field3392, class283.field3584, class283.field3394);
        } else if (arg0 == 9) {
            class69.method260(class283.field3437, class283.field3553, class283.field3397);
        } else if (arg0 == 10) {
            class69.method260(class283.field3398, class283.field3399, class283.field3400);
        } else if (arg0 == 11) {
            class69.method260(class283.field3409, class283.field3601, class283.field3403);
        } else if (arg0 == 12) {
            class69.method260(class283.field3404, class283.field3331, class283.field3406);
        } else if (arg0 == 13) {
            class69.method260(class283.field3407, class283.field3408, class283.field3366);
        } else if (arg0 == 14) {
            class69.method260(class283.field3640, class283.field3606, class283.field3412);
        } else if (arg0 == 16) {
            class69.method260(class283.field3357, class283.field3414, class283.field3415);
        } else if (arg0 == 17) {
            class69.method260(class283.field3416, class283.field3417, class283.field3377);
        } else if (arg0 == 18) {
            class69.method2363(14);
            class69.field885 = 1;
        } else if (arg0 == 19) {
            class69.method260(class283.field3422, class283.field3423, class283.field3393);
        } else if (arg0 == 20) {
            class69.method260(class283.field3401, class283.field3426, class283.field3427);
        } else if (arg0 == 22) {
            class69.method260(class283.field3341, class283.field3429, class283.field3560);
        } else if (arg0 == 23) {
            class69.method260(class283.field3511, class283.field3432, class283.field3374);
        } else if (arg0 == 24) {
            class69.method260(class283.field3395, class283.field3435, class283.field3488);
        } else if (arg0 == 25) {
            class69.method260(class283.field3586, class283.field3549, class283.field3439);
        } else if (arg0 == 26) {
            class69.method260(class283.field3440, class283.field3441, class283.field3442);
        } else if (arg0 == 27) {
            class69.method260(class283.field3443, class283.field3444, class283.field3445);
        } else if (arg0 == 31) {
            class69.method260(class283.field3548, class283.field3453, class283.field3454);
        } else if (arg0 == 32) {
            class69.method260(class283.field3455, class283.field3456, class283.field3477);
        } else if (arg0 == 37) {
            class69.method260(class283.field3458, class283.field3459, class283.field3460);
        } else if (arg0 == 38) {
            class69.method260(class283.field3461, class283.field3356, class283.field3463);
        } else if (arg0 == 55) {
            class69.method2363(8);
        } else if (arg0 == 56) {
            class69.method260(class283.field3542, class283.field3469, class283.field3381);
            method5605(11);
            return;
        } else if (arg0 == 57) {
            class69.method260(class283.field3471, class283.field3472, class283.field3473);
            method5605(11);
            return;
        } else if (arg0 == 61) {
            class69.method2363(7);
        } else if (arg0 == 62) {
            method5605(10);
            class69.method2363(9);
            class69.method260(class283.field3474, class283.field3475, class283.field3476);
            return;
        } else if (arg0 == 63) {
            method5605(10);
            class69.method2363(9);
            class69.method260(class283.field3484, class283.field3342, class283.field3465);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method5605(10);
            class69.method2363(9);
            class69.method260(class283.field3480, class283.field3481, class283.field3482);
            return;
        } else {
            class69.method260(class283.field3483, class283.field3572, class283.field3485);
        }
        method5605(10);
    }

    @ObfuscatedName("cu.el(S)V")
    public static final void method2159() {
        field639.method2249();
        method2730();
        Statics.field3027.method4003();
        for (int var0 = 0; var0 < 4; var0++) {
            field712[var0].method3159();
        }
        System.gc();
        class248.method3162(2);
        field731 = -1;
        field664 = false;
        for (class63 var1 = (class63) class63.field806.method5035(); var1 != null; var1 = (class63) class63.field806.method5022()) {
            if (var1.field813 != null) {
                Statics.field474.method611(var1.field813);
                var1.field813 = null;
            }
            if (var1.field803 != null) {
                Statics.field474.method611(var1.field803);
                var1.field803 = null;
            }
        }
        class63.field806.method5014();
        method5605(10);
    }

    @ObfuscatedName("be.em(II)V")
    public static final void method1864(int arg0) {
        method2159();
        switch(arg0) {
            case 1:
                class69.method2363(24);
                class69.method260(class283.field3574, class283.field3410, class283.field3576);
                break;
            case 2:
                class69.method2132();
        }
    }

    @ObfuscatedName("fs.fs(I)V")
    public static final void method2730() {
        class171.field1933.method4226();
        class164.field1772.method4226();
        class156.method2537();
        class169.method2079();
        class161.field1713.method4226();
        class161.field1712.method4226();
        class170.method3189();
        class172.field1965.method4226();
        class172.field1948.method4226();
        class163.method4671();
        class165.field1781.method4226();
        class153.method2288();
        Statics.field3980.method6152();
        Statics.field2030.method6152();
        class168.method2622();
        class157.field1675.method4226();
        class157.field1687.method4226();
        Statics.method98();
        class166.field1790.method4226();
        class154.method2619();
        class260.field3026.method4226();
        class262.method342();
        ((class218) Statics.field2346).method4036();
        class72.field954.method4226();
        Statics.field1524.method4841();
        Statics.field1059.method4841();
        Statics.field1605.method4841();
        Statics.field3030.method4841();
        Statics.field478.method4841();
        Statics.field992.method4841();
        Statics.field2380.method4841();
        Statics.field2005.method4841();
        Statics.field836.method4841();
        Statics.field1323.method4841();
        Statics.field6.method4841();
        Statics.field1352.method4841();
    }

    @ObfuscatedName("h.fi(I)V")
    public static final void method295() {
        if (field644 > 0) {
            method2159();
        } else {
            field549.method5410();
            method5605(40);
            Statics.field1102 = field639.method2251();
            field639.method2254();
        }
    }

    @ObfuscatedName("a.fb(ZI)V")
    public static final void method58(boolean arg0) {
        if (arg0) {
            field520 = class69.field901 ? class113.field1359 : class113.field1363;
        } else {
            field520 = Statics.field3227.field1211.containsKey(class319.method744(class69.field893)) ? class113.field1364 : class113.field1360;
        }
    }

    @ObfuscatedName("client.fp(I)V")
    public final void method1057() {
        if (field501 > 1) {
            field501--;
        }
        if (field644 > 0) {
            field644--;
        }
        if (field539) {
            field539 = false;
            method295();
            return;
        }
        if (!field627) {
            method3167();
        }
        for (int var1 = 0; var1 < 100 && this.method1223(field639); var1++) {
        }
        if (field567 != 30) {
            return;
        }
        while (true) {
            class56 var2 = (class56) class55.field432.method5074();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field549.field3906) {
                    class242 var6 = class242.method2075(class240.field2725, field639.field1287);
                    var6.field2780.method6269(0);
                    int var7 = var6.field2780.field4292;
                    field549.method5431(var6.field2780);
                    var6.field2780.method6294(var6.field2780.field4292 - var7);
                    field639.method2246(var6);
                    field549.method5413();
                }
                Object var8 = Statics.field1212.field1051;
                synchronized (Statics.field1212.field1051) {
                    if (!field685) {
                        Statics.field1212.field1058 = 0;
                    } else if (class33.field231 != 0 || Statics.field1212.field1058 >= 40) {
                        class242 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1212.field1058 && (var9 == null || var9.field2780.field4292 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1212.field1054[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1212.field1053[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field496 != var16 || field497 != var15) {
                                if (var9 == null) {
                                    var9 = class242.method2075(class240.field2687, field639.field1287);
                                    var9.field2780.method6269(0);
                                    var10 = var9.field2780.field4292;
                                    var9.field2780.field4292 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field651 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field496;
                                    var18 = var15 - field497;
                                    var19 = (int) ((Statics.field1212.field1055[var14] - field651) / 20L);
                                    var12 = (int) ((Statics.field1212.field1055[var14] - field651) % 20L + (long) var12);
                                }
                                field496 = var16;
                                field497 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2780.method6256((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2780.method6269(var19 + 128);
                                    var9.field2780.method6256((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2780.method6269(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2780.method6258(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2780.method6258(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2780.method6256((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2780.method6258(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2780.method6258(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field651 = Statics.field1212.field1055[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2780.method6294(var9.field2780.field4292 - var10);
                            int var20 = var9.field2780.field4292;
                            var9.field2780.field4292 = var10;
                            var9.field2780.method6269(var12 / var13);
                            var9.field2780.method6269(var12 % var13);
                            var9.field2780.field4292 = var20;
                            field639.method2246(var9);
                        }
                        if (var11 >= Statics.field1212.field1058) {
                            Statics.field1212.field1058 = 0;
                        } else {
                            Statics.field1212.field1058 -= var11;
                            System.arraycopy(Statics.field1212.field1053, var11, Statics.field1212.field1053, 0, Statics.field1212.field1058);
                            System.arraycopy(Statics.field1212.field1054, var11, Statics.field1212.field1054, 0, Statics.field1212.field1058);
                            System.arraycopy(Statics.field1212.field1055, var11, Statics.field1212.field1055, 0, Statics.field1212.field1058);
                        }
                    }
                }
                if (class33.field231 == 1 || !Statics.field1784 && class33.field231 == 4 || class33.field231 == 2) {
                    long var22 = class33.field234 - field495 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field495 = class33.field234 * -1L;
                    int var24 = class33.field214;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field1050) {
                        var24 = Statics.field1050;
                    }
                    int var25 = class33.field232;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field3203) {
                        var25 = Statics.field3203;
                    }
                    int var26 = (int) var22;
                    class242 var27 = class242.method2075(class240.field2711, field639.field1287);
                    var27.field2780.method6256((class33.field231 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2780.method6256(var25);
                    var27.field2780.method6256(var24);
                    field639.method2246(var27);
                }
                if (class24.field137 > 0) {
                    class242 var28 = class242.method2075(class240.field2668, field639.field1287);
                    var28.field2780.method6256(0);
                    int var29 = var28.field2780.field4292;
                    long var30 = class398.method2299();
                    for (int var32 = 0; var32 < class24.field137; var32++) {
                        long var33 = var30 - field720;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field720 = var30;
                        var28.field2780.method6493(class24.field136[var32]);
                        var28.field2780.method6314((int) var33);
                    }
                    var28.field2780.method6268(var28.field2780.field4292 - var29);
                    field639.method2246(var28);
                }
                if (field575 > 0) {
                    field575--;
                }
                if (class24.field118[96] || class24.field118[97] || class24.field118[98] || class24.field118[99]) {
                    field576 = true;
                }
                if (field576 && field575 <= 0) {
                    field575 = 20;
                    field576 = false;
                    class242 var35 = class242.method2075(class240.field2721, field639.field1287);
                    var35.field2780.method6307(field561);
                    var35.field2780.method6256(field553);
                    field639.method2246(var35);
                }
                if (Statics.field1670 && !field579) {
                    field579 = true;
                    class242 var36 = class242.method2075(class240.field2691, field639.field1287);
                    var36.field2780.method6269(1);
                    field639.method2246(var36);
                }
                if (!Statics.field1670 && field579) {
                    field579 = false;
                    class242 var37 = class242.method2075(class240.field2691, field639.field1287);
                    var37.field2780.method6269(0);
                    field639.method2246(var37);
                }
                if (Statics.field1243 != null) {
                    Statics.field1243.method5829();
                }
                method2247();
                Statics.method741();
                method5002();
                if (field567 != 30) {
                    return;
                }
                method2761();
                method3184();
                field639.field1291++;
                if (field639.field1291 > 750) {
                    method295();
                    return;
                }
                method604();
                method1894();
                int[] var38 = class96.field1252;
                for (int var39 = 0; var39 < class96.field1251; var39++) {
                    class83 var40 = field642[var38[var39]];
                    if (var40 != null && var40.field1123 > 0) {
                        var40.field1123--;
                        if (var40.field1123 == 0) {
                            var40.field1120 = null;
                        }
                    }
                }
                for (int var41 = 0; var41 < field513; var41++) {
                    int var42 = field534[var41];
                    class91 var43 = field532[var42];
                    if (var43 != null && var43.field1123 > 0) {
                        var43.field1123--;
                        if (var43.field1123 == 0) {
                            var43.field1120 = null;
                        }
                    }
                }
                field537++;
                if (field594 != 0) {
                    field538 += 20;
                    if (field538 >= 400) {
                        field594 = 0;
                    }
                }
                if (Statics.field32 != null) {
                    field621++;
                    if (field621 >= 15) {
                        method204(Statics.field32);
                        Statics.field32 = null;
                    }
                }
                class262 var44 = Statics.field1619;
                class262 var45 = Statics.field3662;
                Statics.field1619 = null;
                Statics.field3662 = null;
                field570 = null;
                field672 = false;
                field596 = false;
                field727 = 0;
                while (class24.method3164() && field727 < 128) {
                    if (field660 >= 2 && class24.field118[82] && Statics.field14 == 66) {
                        String var46 = class98.method1971();
                        Statics.field107.method443(var46);
                    } else if (field753 != 1 || Statics.field2377 <= 0) {
                        field719[field727] = Statics.field14;
                        field533[field727] = Statics.field2377;
                        field727++;
                    }
                }
                boolean var47 = field660 >= 2;
                if (var47 && class24.field118[82] && class24.field118[81] && field703 != 0) {
                    int var48 = Statics.field868.field1083 - field703;
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 3) {
                        var48 = 3;
                    }
                    if (Statics.field868.field1083 != var48) {
                        method2279(Statics.field2131 + Statics.field868.field1162[0], Statics.field3028 + Statics.field868.field1163[0], var48, false);
                    }
                    field703 = 0;
                }
                if (field718 != -1) {
                    method2098(field718, 0, 0, Statics.field3203, Statics.field1050, 0, 0);
                }
                field689++;
                while (true) {
                    class81 var49;
                    class262 var50;
                    class262 var51;
                    do {
                        var49 = (class81) field732.method5032();
                        if (var49 == null) {
                            while (true) {
                                class81 var52;
                                class262 var53;
                                class262 var54;
                                do {
                                    var52 = (class81) field696.method5032();
                                    if (var52 == null) {
                                        while (true) {
                                            class81 var55;
                                            class262 var56;
                                            class262 var57;
                                            do {
                                                var55 = (class81) field770.method5032();
                                                if (var55 == null) {
                                                    this.method1201();
                                                    method3126();
                                                    if (field610 != null) {
                                                        this.method1265();
                                                    }
                                                    if (Statics.field211 != null) {
                                                        method204(Statics.field211);
                                                        field604++;
                                                        if (class33.field229 == 0) {
                                                            if (field603) {
                                                                if (Statics.field937 == Statics.field211 && field599 != field500) {
                                                                    class262 var58 = Statics.field211;
                                                                    byte var59 = 0;
                                                                    if (field656 == 1 && var58.field3113 == 206) {
                                                                        var59 = 1;
                                                                    }
                                                                    if (var58.field3176[field500] <= 0) {
                                                                        var59 = 0;
                                                                    }
                                                                    if (class263.method2376(method3375(var58))) {
                                                                        int var60 = field599;
                                                                        int var61 = field500;
                                                                        var58.field3176[var61] = var58.field3176[var60];
                                                                        var58.field3177[var61] = var58.field3177[var60];
                                                                        var58.field3176[var60] = -1;
                                                                        var58.field3177[var60] = 0;
                                                                    } else if (var59 == 1) {
                                                                        int var62 = field599;
                                                                        int var63 = field500;
                                                                        while (var62 != var63) {
                                                                            if (var62 > var63) {
                                                                                var58.method4552(var62 - 1, var62);
                                                                                var62--;
                                                                            } else if (var62 < var63) {
                                                                                var58.method4552(var62 + 1, var62);
                                                                                var62++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var58.method4552(field500, field599);
                                                                    }
                                                                    class242 var64 = class242.method2075(class240.field2756, field639.field1287);
                                                                    var64.field2780.method6493(var59);
                                                                    var64.field2780.method6405(field599);
                                                                    var64.field2780.method6405(field500);
                                                                    var64.field2780.method6258(Statics.field211.field3048);
                                                                    field639.method2246(var64);
                                                                }
                                                            } else if (this.method1061()) {
                                                                this.method1062(field676, field601);
                                                            } else if (field695 > 0) {
                                                                method4020(field676, field601);
                                                            }
                                                            field621 = 10;
                                                            class33.field231 = 0;
                                                            Statics.field211 = null;
                                                        } else if (field604 >= 5 && (class33.field224 > field676 + 5 || class33.field224 < field676 - 5 || class33.field225 > field601 + 5 || class33.field225 < field601 - 5)) {
                                                            field603 = true;
                                                        }
                                                    }
                                                    if (class213.method3910()) {
                                                        int var65 = class213.field2417;
                                                        int var66 = class213.field2418;
                                                        class242 var67 = class242.method2075(class240.field2704, field639.field1287);
                                                        var67.field2780.method6269(5);
                                                        var67.field2780.method6405(Statics.field2131 + var65);
                                                        var67.field2780.method6307(Statics.field3028 + var66);
                                                        var67.field2780.method6493(class24.field118[82] ? (class24.field118[81] ? 2 : 1) : 0);
                                                        field639.method2246(var67);
                                                        class213.method3870();
                                                        field592 = class33.field232;
                                                        field593 = class33.field214;
                                                        field594 = 1;
                                                        field538 = 0;
                                                        field607 = var65;
                                                        field729 = var66;
                                                    }
                                                    if (Statics.field1619 != var44) {
                                                        if (var44 != null) {
                                                            method204(var44);
                                                        }
                                                        if (Statics.field1619 != null) {
                                                            method204(Statics.field1619);
                                                        }
                                                    }
                                                    if (Statics.field3662 != var45 && field643 == field558) {
                                                        if (var45 != null) {
                                                            method204(var45);
                                                        }
                                                        if (Statics.field3662 != null) {
                                                            method204(Statics.field3662);
                                                        }
                                                    }
                                                    if (Statics.field3662 == null) {
                                                        if (field558 > 0) {
                                                            field558--;
                                                        }
                                                    } else if (field558 < field643) {
                                                        field558++;
                                                        if (field643 == field558) {
                                                            method204(Statics.field3662);
                                                        }
                                                    }
                                                    if (field753 == 0) {
                                                        int var68 = Statics.field868.field1140;
                                                        int var69 = Statics.field868.field1124;
                                                        if (Statics.field1491 - var68 < -500 || Statics.field1491 - var68 > 500 || Statics.field1195 - var69 < -500 || Statics.field1195 - var69 > 500) {
                                                            Statics.field1491 = var68;
                                                            Statics.field1195 = var69;
                                                        }
                                                        if (Statics.field1491 != var68) {
                                                            Statics.field1491 += (var68 - Statics.field1491) / 16;
                                                        }
                                                        if (Statics.field1195 != var69) {
                                                            Statics.field1195 += (var69 - Statics.field1195) / 16;
                                                        }
                                                        int var70 = Statics.field1491 >> 7;
                                                        int var71 = Statics.field1195 >> 7;
                                                        int var72 = method4391(Statics.field1491, Statics.field1195, Statics.field2592);
                                                        int var73 = 0;
                                                        if (var70 > 3 && var71 > 3 && var70 < 100 && var71 < 100) {
                                                            for (int var74 = var70 - 4; var74 <= var70 + 4; var74++) {
                                                                for (int var75 = var71 - 4; var75 <= var71 + 4; var75++) {
                                                                    int var76 = Statics.field2592;
                                                                    if (var76 < 3 && (class75.field978[1][var74][var75] & 0x2) == 2) {
                                                                        var76++;
                                                                    }
                                                                    int var77 = var72 - class75.field994[var76][var74][var75];
                                                                    if (var77 > var73) {
                                                                        var73 = var77;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var78 = var73 * 192;
                                                        if (var78 > 98048) {
                                                            var78 = 98048;
                                                        }
                                                        if (var78 < 32768) {
                                                            var78 = 32768;
                                                        }
                                                        if (var78 > field566) {
                                                            field566 += (var78 - field566) / 24;
                                                        } else if (var78 < field566) {
                                                            field566 += (var78 - field566) / 80;
                                                        }
                                                        Statics.field2187 = method4391(Statics.field868.field1140, Statics.field868.field1124, Statics.field2592) - field697;
                                                    } else if (field753 == 1) {
                                                        method4948();
                                                        short var79 = -1;
                                                        if (class24.field118[33]) {
                                                            var79 = 0;
                                                        } else if (class24.field118[49]) {
                                                            var79 = 1024;
                                                        }
                                                        if (class24.field118[48]) {
                                                            if (var79 == 0) {
                                                                var79 = 1792;
                                                            } else if (var79 == 1024) {
                                                                var79 = 1280;
                                                            } else {
                                                                var79 = 1536;
                                                            }
                                                        } else if (class24.field118[50]) {
                                                            if (var79 == 0) {
                                                                var79 = 256;
                                                            } else if (var79 == 1024) {
                                                                var79 = 768;
                                                            } else {
                                                                var79 = 512;
                                                            }
                                                        }
                                                        byte var80 = 0;
                                                        if (class24.field118[35]) {
                                                            var80 = -1;
                                                        } else if (class24.field118[51]) {
                                                            var80 = 1;
                                                        }
                                                        int var81 = 0;
                                                        if (var79 >= 0 || var80 != 0) {
                                                            int var82 = class24.field118[81] ? field572 : field571;
                                                            var81 = var82 * 16;
                                                            field728 = var79;
                                                            field662 = var80;
                                                        }
                                                        if (field568 < var81) {
                                                            field568 += var81 / 8;
                                                            if (field568 > var81) {
                                                                field568 = var81;
                                                            }
                                                        } else if (field568 > var81) {
                                                            field568 = field568 * 9 / 10;
                                                        }
                                                        if (field568 > 0) {
                                                            int var83 = field568 / 16;
                                                            if (field728 >= 0) {
                                                                int var84 = field728 - Statics.field1173 & 0x7FF;
                                                                int var85 = class211.field2371[var84];
                                                                int var86 = class211.field2359[var84];
                                                                Statics.field1491 += var83 * var85 / 65536;
                                                                Statics.field1195 += var83 * var86 / 65536;
                                                            }
                                                            if (field662 != 0) {
                                                                Statics.field2187 += field662 * var83;
                                                                if (Statics.field2187 > 0) {
                                                                    Statics.field2187 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field728 = -1;
                                                            field662 = -1;
                                                        }
                                                        if (class24.field118[13]) {
                                                            method2709();
                                                        }
                                                    }
                                                    if (class33.field229 == 4 && Statics.field1784) {
                                                        int var87 = class33.field225 - field565;
                                                        field563 = var87 * 2;
                                                        field565 = var87 == -1 || var87 == 1 ? class33.field225 : (field565 + class33.field225) / 2;
                                                        int var88 = field503 - class33.field224;
                                                        field562 = var88 * 2;
                                                        field503 = var88 == -1 || var88 == 1 ? class33.field224 : (field503 + class33.field224) / 2;
                                                    } else {
                                                        if (class24.field118[96]) {
                                                            field562 += (-24 - field562) / 2;
                                                        } else if (class24.field118[97]) {
                                                            field562 += (24 - field562) / 2;
                                                        } else {
                                                            field562 /= 2;
                                                        }
                                                        if (class24.field118[98]) {
                                                            field563 += (12 - field563) / 2;
                                                        } else if (class24.field118[99]) {
                                                            field563 += (-12 - field563) / 2;
                                                        } else {
                                                            field563 /= 2;
                                                        }
                                                        field565 = class33.field225;
                                                        field503 = class33.field224;
                                                    }
                                                    field561 = field562 / 2 + field561 & 0x7FF;
                                                    field553 += field563 / 2;
                                                    if (field553 < 128) {
                                                        field553 = 128;
                                                    }
                                                    if (field553 > 383) {
                                                        field553 = 383;
                                                    }
                                                    if (field690) {
                                                        int var89 = Statics.field285 * 128 + 64;
                                                        int var90 = Statics.field1409 * 128 + 64;
                                                        int var91 = method4391(var89, var90, Statics.field2592) - Statics.field2787;
                                                        if (Statics.field154 < var89) {
                                                            Statics.field154 += Statics.field3325 * (var89 - Statics.field154) / 1000 + Statics.field907;
                                                            if (Statics.field154 > var89) {
                                                                Statics.field154 = var89;
                                                            }
                                                        }
                                                        if (Statics.field154 > var89) {
                                                            Statics.field154 -= Statics.field3325 * (Statics.field154 - var89) / 1000 + Statics.field907;
                                                            if (Statics.field154 < var89) {
                                                                Statics.field154 = var89;
                                                            }
                                                        }
                                                        if (Statics.field81 < var91) {
                                                            Statics.field81 += Statics.field3325 * (var91 - Statics.field81) / 1000 + Statics.field907;
                                                            if (Statics.field81 > var91) {
                                                                Statics.field81 = var91;
                                                            }
                                                        }
                                                        if (Statics.field81 > var91) {
                                                            Statics.field81 -= Statics.field3325 * (Statics.field81 - var91) / 1000 + Statics.field907;
                                                            if (Statics.field81 < var91) {
                                                                Statics.field81 = var91;
                                                            }
                                                        }
                                                        if (Statics.field1620 < var90) {
                                                            Statics.field1620 += Statics.field3325 * (var90 - Statics.field1620) / 1000 + Statics.field907;
                                                            if (Statics.field1620 > var90) {
                                                                Statics.field1620 = var90;
                                                            }
                                                        }
                                                        if (Statics.field1620 > var90) {
                                                            Statics.field1620 -= Statics.field3325 * (Statics.field1620 - var90) / 1000 + Statics.field907;
                                                            if (Statics.field1620 < var90) {
                                                                Statics.field1620 = var90;
                                                            }
                                                        }
                                                        int var92 = Statics.field1273 * 128 + 64;
                                                        int var93 = Statics.field775 * 128 + 64;
                                                        int var94 = method4391(var92, var93, Statics.field2592) - Statics.field45;
                                                        int var95 = var92 - Statics.field154;
                                                        int var96 = var94 - Statics.field81;
                                                        int var97 = var93 - Statics.field1620;
                                                        int var98 = (int) Math.sqrt((double) (var95 * var95 + var97 * var97));
                                                        int var99 = (int) (Math.atan2((double) var96, (double) var98) * 325.949D) & 0x7FF;
                                                        int var100 = (int) (Math.atan2((double) var95, (double) var97) * -325.949D) & 0x7FF;
                                                        if (var99 < 128) {
                                                            var99 = 128;
                                                        }
                                                        if (var99 > 383) {
                                                            var99 = 383;
                                                        }
                                                        if (Statics.field2026 < var99) {
                                                            Statics.field2026 += Statics.field3713 * (var99 - Statics.field2026) / 1000 + Statics.field1955;
                                                            if (Statics.field2026 > var99) {
                                                                Statics.field2026 = var99;
                                                            }
                                                        }
                                                        if (Statics.field2026 > var99) {
                                                            Statics.field2026 -= Statics.field3713 * (Statics.field2026 - var99) / 1000 + Statics.field1955;
                                                            if (Statics.field2026 < var99) {
                                                                Statics.field2026 = var99;
                                                            }
                                                        }
                                                        int var101 = var100 - Statics.field1173;
                                                        if (var101 > 1024) {
                                                            var101 -= 2048;
                                                        }
                                                        if (var101 < -1024) {
                                                            var101 += 2048;
                                                        }
                                                        if (var101 > 0) {
                                                            Statics.field1173 += Statics.field3713 * var101 / 1000 + Statics.field1955;
                                                            Statics.field1173 &= 0x7FF;
                                                        }
                                                        if (var101 < 0) {
                                                            Statics.field1173 -= Statics.field3713 * -var101 / 1000 + Statics.field1955;
                                                            Statics.field1173 &= 0x7FF;
                                                        }
                                                        int var102 = var100 - Statics.field1173;
                                                        if (var102 > 1024) {
                                                            var102 -= 2048;
                                                        }
                                                        if (var102 < -1024) {
                                                            var102 += 2048;
                                                        }
                                                        if (var102 < 0 && var101 > 0 || var102 > 0 && var101 < 0) {
                                                            Statics.field1173 = var100;
                                                        }
                                                    }
                                                    for (int var103 = 0; var103 < 5; var103++) {
                                                        int var10002 = field744[var103]++;
                                                    }
                                                    Statics.field2344.method2213();
                                                    int var104 = ++class33.field218 - 1;
                                                    int var106 = class24.method2584();
                                                    if (var104 > 15000 && var106 > 15000) {
                                                        field644 = 250;
                                                        class33.method2491(14500);
                                                        class242 var107 = class242.method2075(class240.field2728, field639.field1287);
                                                        field639.method2246(var107);
                                                    }
                                                    Statics.field464.method1566();
                                                    field639.field1292++;
                                                    if (field639.field1292 > 50) {
                                                        class242 var108 = class242.method2075(class240.field2707, field639.field1287);
                                                        field639.method2246(var108);
                                                    }
                                                    try {
                                                        field639.method2253();
                                                    } catch (IOException var110) {
                                                        method295();
                                                    }
                                                    return;
                                                }
                                                var56 = var55.field1040;
                                                if (var56.field3185 < 0) {
                                                    break;
                                                }
                                                var57 = class262.method2058(var56.field3134);
                                            } while (var57 == null || var57.field3182 == null || var56.field3185 >= var57.field3182.length || var57.field3182[var56.field3185] != var56);
                                            class64.method4138(var55);
                                        }
                                    }
                                    var53 = var52.field1040;
                                    if (var53.field3185 < 0) {
                                        break;
                                    }
                                    var54 = class262.method2058(var53.field3134);
                                } while (var54 == null || var54.field3182 == null || var53.field3185 >= var54.field3182.length || var54.field3182[var53.field3185] != var53);
                                class64.method4138(var52);
                            }
                        }
                        var50 = var49.field1040;
                        if (var50.field3185 < 0) {
                            break;
                        }
                        var51 = class262.method2058(var50.field3134);
                    } while (var51 == null || var51.field3182 == null || var50.field3185 >= var51.field3182.length || var51.field3182[var50.field3185] != var50);
                    class64.method4138(var49);
                }
            }
            class242 var4 = class242.method2075(class240.field2705, field639.field1287);
            var4.field2780.method6269(0);
            int var5 = var4.field2780.field4292;
            class55.method2698(var4.field2780);
            var4.field2780.method6294(var4.field2780.field4292 - var5);
            field639.method2246(var4);
        }
    }

    @ObfuscatedName("mp.fg(I)V")
    public static final void method5739() {
        if (Statics.field1380 != null) {
            Statics.field1380.method704();
        }
        if (Statics.field1443 != null) {
            Statics.field1443.method704();
        }
    }

    @ObfuscatedName("fj.fz(I)V")
    public static final void method3184() {
        for (int var0 = 0; var0 < field544; var0++) {
            int var10002 = field736[var0]--;
            if (field736[var0] >= -10) {
                class35 var2 = field738[var0];
                if (var2 == null) {
                    class35 var10000 = (class35) null;
                    var2 = class35.method653(Statics.field3030, field734[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field736[var0] += var2.method646();
                    field738[var0] = var2;
                }
                if (field736[var0] < 0) {
                    int var9;
                    if (field737[var0] == 0) {
                        var9 = Statics.field3227.field1205;
                    } else {
                        int var3 = (field737[var0] & 0xFF) * 128;
                        int var4 = field737[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field868.field1140;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field737[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field868.field1124;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field736[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = Statics.field3227.field1201 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class36 var10 = var2.method651().method657(Statics.field1990);
                        class43 var11 = class43.method766(var10, 100, var9);
                        var11.method769(field735[var0] - 1);
                        Statics.field474.method636(var11);
                    }
                    field736[var0] = -100;
                }
            } else {
                field544--;
                for (int var1 = var0; var1 < field544; var1++) {
                    field734[var1] = field734[var1 + 1];
                    field738[var1] = field738[var1 + 1];
                    field735[var1] = field735[var1 + 1];
                    field736[var1] = field736[var1 + 1];
                    field737[var1] = field737[var1 + 1];
                }
                var0--;
            }
        }
        if (!field664) {
            return;
        }
        boolean var12;
        if (class248.field2915 == 0) {
            var12 = Statics.field2921.method4302();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (Statics.field3227.field1207 != 0 && field731 != -1) {
                class248.method1799(Statics.field992, field731, 0, Statics.field3227.field1207, false);
            }
            field664 = false;
        }
    }

    @ObfuscatedName("ef.fh(Lfe;IIII)V")
    public static void method2510(class172 arg0, int arg1, int arg2, int arg3) {
        if (field544 >= 50 || Statics.field3227.field1201 == 0 || arg0.field1952 == null || arg1 >= arg0.field1952.length) {
            return;
        }
        int var4 = arg0.field1952[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field734[field544] = var5;
        field735[field544] = var6;
        field736[field544] = 0;
        field738[field544] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field737[field544] = (var8 << 16) + (var9 << 8) + var7;
        field544++;
    }

    @ObfuscatedName("gu.fk(IIIS)V")
    public static void method3501(int arg0, int arg1, int arg2) {
        if (Statics.field3227.field1205 == 0 || arg1 == 0 || field544 >= 50) {
            return;
        }
        field734[field544] = arg0;
        field735[field544] = arg1;
        field736[field544] = arg2;
        field738[field544] = null;
        field737[field544] = 0;
        field544++;
    }

    @ObfuscatedName("gw.fm(II)V")
    public static void method3550(int arg0) {
        if (arg0 == -1 && !field664) {
            Statics.field2921.method4301();
            class248.field2915 = 1;
            Statics.field1370 = null;
        } else if (arg0 != -1 && field731 != arg0 && Statics.field3227.field1207 != 0 && !field664) {
            class248.method4181(2, Statics.field992, arg0, 0, Statics.field3227.field1207, false);
        }
        field731 = arg0;
    }

    @ObfuscatedName("aq.ff(III)V")
    public static void method714(int arg0, int arg1) {
        if (Statics.field3227.field1207 != 0 && arg0 != -1) {
            class248.method1799(Statics.field6, arg0, 0, Statics.field3227.field1207, false);
            field664 = true;
        }
    }

    @ObfuscatedName("cc.fd(I)V")
    public static final void method2247() {
        if (!Statics.field2143) {
            return;
        }
        if (Statics.field3205 != null) {
            Statics.field3205.method5552();
        }
        for (int var0 = 0; var0 < class96.field1251; var0++) {
            class83 var1 = field642[class96.field1252[var0]];
            var1.method1994();
        }
        Statics.field2143 = false;
    }

    @ObfuscatedName("kw.fo(I)V")
    public static final void method5002() {
        if (Statics.field2592 != field723) {
            field723 = Statics.field2592;
            method3515(Statics.field2592);
        }
    }

    @ObfuscatedName("cz.fa(Ljt;III)V")
    public static final void method2143(class262 arg0, int arg1, int arg2) {
        if (field730 != 0 && field730 != 3 || field627 || !(class33.field231 == 1 || !Statics.field1784 && class33.field231 == 4)) {
            return;
        }
        class256 var3 = arg0.method4557(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field232 - arg1;
        int var5 = class33.field214 - arg2;
        if (!var3.method4484(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3000 / 2;
        int var7 = var5 - var3.field3001 / 2;
        int var8 = field561 & 0x7FF;
        int var9 = class211.field2371[var8];
        int var10 = class211.field2359[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field868.field1140 + var11 >> 7;
        int var14 = Statics.field868.field1124 - var12 >> 7;
        class242 var15 = class242.method2075(class240.field2746, field639.field1287);
        var15.field2780.method6269(18);
        var15.field2780.method6405(Statics.field2131 + var13);
        var15.field2780.method6307(Statics.field3028 + var14);
        var15.field2780.method6493(class24.field118[82] ? (class24.field118[81] ? 2 : 1) : 0);
        var15.field2780.method6269(var6);
        var15.field2780.method6269(var7);
        var15.field2780.method6256(field561);
        var15.field2780.method6269(57);
        var15.field2780.method6269(0);
        var15.field2780.method6269(0);
        var15.field2780.method6269(89);
        var15.field2780.method6256(Statics.field868.field1140);
        var15.field2780.method6256(Statics.field868.field1124);
        var15.field2780.method6269(63);
        field639.method2246(var15);
        field607 = var13;
        field729 = var14;
    }

    @ObfuscatedName("du.fq(Ljava/lang/String;I)V")
    public static final void method2358(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field3227.field1202 = !Statics.field3227.field1202;
            class89.method1005();
            if (Statics.field3227.field1202) {
                class98.method5671(99, "", "Roofs are now all hidden");
            } else {
                class98.method5671(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field620 = !field620;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field694 = !field694;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field772 = !field772;
        }
        if (field660 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1243.field4181 = !Statics.field1243.field4181;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field620 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field620 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method295();
            }
        }
        class242 var1 = class242.method2075(class240.field2757, field639.field1287);
        var1.field2780.method6269(arg0.length() + 1);
        var1.field2780.method6489(arg0);
        field639.method2246(var1);
    }

    @ObfuscatedName("al.fe(I)V")
    public static final void method604() {
        int var0 = class96.field1251;
        int[] var1 = class96.field1252;
        for (int var2 = 0; var2 < var0; var2++) {
            class83 var3 = field642[var1[var2]];
            if (var3 != null) {
                method2380(var3, 1);
            }
        }
    }

    @ObfuscatedName("bn.fy(I)V")
    public static final void method1894() {
        for (int var0 = 0; var0 < field513; var0++) {
            int var1 = field534[var0];
            class91 var2 = field532[var1];
            if (var2 != null) {
                method2380(var2, var2.field1219.field1717);
            }
        }
    }

    @ObfuscatedName("dt.fw(Lcd;II)V")
    public static final void method2380(class85 arg0, int arg1) {
        if (arg0.field1146 >= field494) {
            int var2 = Math.max(1, arg0.field1146 - field494);
            int var3 = arg0.field1149 * 128 + arg0.field1110 * 64;
            int var4 = arg0.field1127 * 128 + arg0.field1110 * 64;
            arg0.field1140 += (var3 - arg0.field1140) / var2;
            arg0.field1124 += (var4 - arg0.field1124) / var2;
            arg0.field1165 = 0;
            arg0.field1158 = arg0.field1152;
        } else if (arg0.field1166 >= field494) {
            method1502(arg0);
        } else {
            arg0.field1136 = arg0.field1112;
            if (arg0.field1161 == 0) {
                arg0.field1165 = 0;
            } else {
                label322: {
                    if (arg0.field1139 != -1 && arg0.field1142 == 0) {
                        class172 var5 = class172.method2708(arg0.field1139);
                        if (arg0.field1130 > 0 && var5.field1960 == 0) {
                            arg0.field1165++;
                            break label322;
                        }
                        if (arg0.field1130 <= 0 && var5.field1961 == 0) {
                            arg0.field1165++;
                            break label322;
                        }
                    }
                    int var6 = arg0.field1140;
                    int var7 = arg0.field1124;
                    int var8 = arg0.field1162[arg0.field1161 - 1] * 128 + arg0.field1110 * 64;
                    int var9 = arg0.field1163[arg0.field1161 - 1] * 128 + arg0.field1110 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1158 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1158 = 1792;
                        } else {
                            arg0.field1158 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1158 = 768;
                        } else if (var7 > var9) {
                            arg0.field1158 = 256;
                        } else {
                            arg0.field1158 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1158 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1158 = 0;
                    }
                    byte var10 = arg0.field1114[arg0.field1161 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1158 - arg0.field1133 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1116;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1115;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1118;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1117;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1115;
                        }
                        arg0.field1136 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class91) {
                            var14 = ((class91) arg0).field1219.field1745;
                        }
                        if (var14) {
                            if (arg0.field1158 != arg0.field1133 && arg0.field1160 == -1 && arg0.field1147 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1161 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1161 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1165 > 0 && arg0.field1161 > 1) {
                                var13 = 8;
                                arg0.field1165--;
                            }
                        } else {
                            if (arg0.field1161 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1161 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1165 > 0 && arg0.field1161 > 1) {
                                var13 = 8;
                                arg0.field1165--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1136 == arg0.field1115 && arg0.field1119 != -1) {
                            arg0.field1136 = arg0.field1119;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1140 += var13;
                                if (arg0.field1140 > var8) {
                                    arg0.field1140 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1140 -= var13;
                                if (arg0.field1140 < var8) {
                                    arg0.field1140 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1124 += var13;
                                if (arg0.field1124 > var9) {
                                    arg0.field1124 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1124 -= var13;
                                if (arg0.field1124 < var9) {
                                    arg0.field1124 = var9;
                                }
                            }
                        }
                        if (arg0.field1140 == var8 && arg0.field1124 == var9) {
                            arg0.field1161--;
                            if (arg0.field1130 > 0) {
                                arg0.field1130--;
                            }
                        }
                    } else {
                        arg0.field1140 = var8;
                        arg0.field1124 = var9;
                        arg0.field1161--;
                        if (arg0.field1130 > 0) {
                            arg0.field1130--;
                        }
                    }
                }
            }
        }
        if (arg0.field1140 < 128 || arg0.field1124 < 128 || arg0.field1140 >= 13184 || arg0.field1124 >= 13184) {
            arg0.field1139 = -1;
            arg0.field1125 = -1;
            arg0.field1146 = 0;
            arg0.field1166 = 0;
            arg0.field1140 = arg0.field1162[0] * 128 + arg0.field1110 * 64;
            arg0.field1124 = arg0.field1163[0] * 128 + arg0.field1110 * 64;
            arg0.method2044();
        }
        if (Statics.field868 == arg0 && (arg0.field1140 < 1536 || arg0.field1124 < 1536 || arg0.field1140 >= 11776 || arg0.field1124 >= 11776)) {
            arg0.field1139 = -1;
            arg0.field1125 = -1;
            arg0.field1146 = 0;
            arg0.field1166 = 0;
            arg0.field1140 = arg0.field1162[0] * 128 + arg0.field1110 * 64;
            arg0.field1124 = arg0.field1163[0] * 128 + arg0.field1110 * 64;
            arg0.method2044();
        }
        method5436(arg0);
        arg0.field1144 = false;
        if (arg0.field1136 != -1) {
            class172 var15 = class172.method2708(arg0.field1136);
            if (var15 == null || var15.field1959 == null) {
                arg0.field1136 = -1;
            } else {
                arg0.field1138++;
                if (arg0.field1132 < var15.field1959.length && arg0.field1138 > var15.field1951[arg0.field1132]) {
                    arg0.field1138 = 1;
                    arg0.field1132++;
                    method2510(var15, arg0.field1132, arg0.field1140, arg0.field1124);
                }
                if (arg0.field1132 >= var15.field1959.length) {
                    arg0.field1138 = 0;
                    arg0.field1132 = 0;
                    method2510(var15, arg0.field1132, arg0.field1140, arg0.field1124);
                }
            }
        }
        if (arg0.field1125 != -1 && field494 >= arg0.field1106) {
            if (arg0.field1145 < 0) {
                arg0.field1145 = 0;
            }
            int var16 = Statics.method304(arg0.field1125).field1761;
            if (var16 == -1) {
                arg0.field1125 = -1;
            } else {
                class172 var17 = class172.method2708(var16);
                if (var17 == null || var17.field1959 == null) {
                    arg0.field1125 = -1;
                } else {
                    arg0.field1109++;
                    if (arg0.field1145 < var17.field1959.length && arg0.field1109 > var17.field1951[arg0.field1145]) {
                        arg0.field1109 = 1;
                        arg0.field1145++;
                        method2510(var17, arg0.field1145, arg0.field1140, arg0.field1124);
                    }
                    if (arg0.field1145 >= var17.field1959.length && (arg0.field1145 < 0 || arg0.field1145 >= var17.field1959.length)) {
                        arg0.field1125 = -1;
                    }
                }
            }
        }
        if (arg0.field1139 != -1 && arg0.field1142 <= 1) {
            class172 var18 = class172.method2708(arg0.field1139);
            if (var18.field1960 == 1 && arg0.field1130 > 0 && arg0.field1146 <= field494 && arg0.field1166 < field494) {
                arg0.field1142 = 1;
                return;
            }
        }
        if (arg0.field1139 != -1 && arg0.field1142 == 0) {
            class172 var19 = class172.method2708(arg0.field1139);
            if (var19 == null || var19.field1959 == null) {
                arg0.field1139 = -1;
            } else {
                arg0.field1151++;
                if (arg0.field1164 < var19.field1959.length && arg0.field1151 > var19.field1951[arg0.field1164]) {
                    arg0.field1151 = 1;
                    arg0.field1164++;
                    method2510(var19, arg0.field1164, arg0.field1140, arg0.field1124);
                }
                if (arg0.field1164 >= var19.field1959.length) {
                    arg0.field1164 -= var19.field1949;
                    arg0.field1143++;
                    if (arg0.field1143 >= var19.field1953) {
                        arg0.field1139 = -1;
                    } else if (arg0.field1164 >= 0 && arg0.field1164 < var19.field1959.length) {
                        method2510(var19, arg0.field1164, arg0.field1140, arg0.field1124);
                    } else {
                        arg0.field1139 = -1;
                    }
                }
                arg0.field1144 = var19.field1946;
            }
        }
        if (arg0.field1142 > 0) {
            arg0.field1142--;
        }
    }

    @ObfuscatedName("client.ft(Lcd;I)V")
    public static final void method1502(class85 arg0) {
        if (field494 == arg0.field1166 || arg0.field1139 == -1 || arg0.field1142 != 0 || arg0.field1151 + 1 > class172.method2708(arg0.field1139).field1951[arg0.field1164]) {
            int var1 = arg0.field1166 - arg0.field1146;
            int var2 = field494 - arg0.field1146;
            int var3 = arg0.field1149 * 128 + arg0.field1110 * 64;
            int var4 = arg0.field1127 * 128 + arg0.field1110 * 64;
            int var5 = arg0.field1150 * 128 + arg0.field1110 * 64;
            int var6 = arg0.field1126 * 128 + arg0.field1110 * 64;
            arg0.field1140 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1124 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1165 = 0;
        arg0.field1158 = arg0.field1152;
        arg0.field1133 = arg0.field1158;
    }

    @ObfuscatedName("lf.fj(Lcd;I)V")
    public static final void method5436(class85 arg0) {
        if (arg0.field1147 == 0) {
            return;
        }
        if (arg0.field1160 != -1) {
            class85 var1 = null;
            if (arg0.field1160 < 32768) {
                var1 = field532[arg0.field1160];
            } else if (arg0.field1160 >= 32768) {
                var1 = field642[arg0.field1160 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1140 - var1.field1140;
                int var3 = arg0.field1124 - var1.field1124;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1158 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1134) {
                arg0.field1160 = -1;
                arg0.field1134 = false;
            }
        }
        if (arg0.field1135 != -1 && (arg0.field1161 == 0 || arg0.field1165 > 0)) {
            arg0.field1158 = arg0.field1135;
            arg0.field1135 = -1;
        }
        int var4 = arg0.field1158 - arg0.field1133 & 0x7FF;
        if (var4 == 0 && arg0.field1134) {
            arg0.field1160 = -1;
            arg0.field1134 = false;
        }
        if (var4 == 0) {
            arg0.field1159 = 0;
            return;
        }
        arg0.field1159++;
        if (var4 > 1024) {
            arg0.field1133 -= arg0.field1147;
            boolean var5 = true;
            if (var4 < arg0.field1147 || var4 > 2048 - arg0.field1147) {
                arg0.field1133 = arg0.field1158;
                var5 = false;
            }
            if (arg0.field1136 == arg0.field1112 && (arg0.field1159 > 25 || var5)) {
                if (arg0.field1113 == -1) {
                    arg0.field1136 = arg0.field1115;
                } else {
                    arg0.field1136 = arg0.field1113;
                }
            }
        } else {
            arg0.field1133 += arg0.field1147;
            boolean var6 = true;
            if (var4 < arg0.field1147 || var4 > 2048 - arg0.field1147) {
                arg0.field1133 = arg0.field1158;
                var6 = false;
            }
            if (arg0.field1136 == arg0.field1112 && (arg0.field1159 > 25 || var6)) {
                if (arg0.field1153 == -1) {
                    arg0.field1136 = arg0.field1115;
                } else {
                    arg0.field1136 = arg0.field1153;
                }
            }
        }
        arg0.field1133 &= 0x7FF;
    }

    @ObfuscatedName("fe.fu(I)V")
    public static void method3126() {
        if (Statics.field1243 != null) {
            Statics.field1243.method5916(Statics.field2592, (Statics.field868.field1140 >> 7) + Statics.field2131, (Statics.field868.field1124 >> 7) + Statics.field3028, false);
            Statics.field1243.method5851();
        }
    }

    @ObfuscatedName("fh.fc(Lci;III)V")
    public static void method2819(class83 arg0, int arg1, int arg2) {
        if (arg0.field1139 == arg1 && arg1 != -1) {
            int var3 = class172.method2708(arg1).field1962;
            if (var3 == 1) {
                arg0.field1164 = 0;
                arg0.field1151 = 0;
                arg0.field1142 = arg2;
                arg0.field1143 = 0;
            }
            if (var3 == 2) {
                arg0.field1143 = 0;
            }
        } else if (arg1 == -1 || arg0.field1139 == -1 || class172.method2708(arg1).field1956 >= class172.method2708(arg0.field1139).field1956) {
            arg0.field1139 = arg1;
            arg0.field1164 = 0;
            arg0.field1151 = 0;
            arg0.field1142 = arg2;
            arg0.field1143 = 0;
            arg0.field1130 = arg0.field1161;
        }
    }

    @ObfuscatedName("g.fv(I)I")
    public static int method151() {
        return field710 ? 2 : 1;
    }

    @ObfuscatedName("od.fl(IS)V")
    public static void method6196(int arg0) {
        field709 = 0L;
        if (arg0 >= 2) {
            field710 = true;
        } else {
            field710 = false;
        }
        if (method151() == 1) {
            Statics.field107.method439(765, 503);
        } else {
            Statics.field107.method439(7680, 2160);
        }
        if (field567 < 25) {
            return;
        }
        class242 var1 = class242.method2075(class240.field2719, field639.field1287);
        var1.field2780.method6269(method151());
        var1.field2780.method6256(Statics.field3203);
        var1.field2780.method6256(Statics.field1050);
        field639.method2246(var1);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method534() {
        field709 = class398.method2299() + 500L;
        this.method1159();
        if (field718 != -1) {
            this.method1063(true);
        }
    }

    @ObfuscatedName("client.fr(I)V")
    public void method1159() {
        int var1 = Statics.field3203;
        int var2 = Statics.field1050;
        if (this.field189 < var1) {
            int var3 = this.field189;
        }
        if (this.field191 < var2) {
            int var4 = this.field191;
        }
        if (Statics.field3227 != null) {
            try {
                class28.method399(Statics.field107, "resize", new Object[] { method151() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fx(I)V")
    public final void method1180() {
        if (field718 != -1) {
            int var1 = field718;
            if (class262.method4885(var1)) {
                method83(Statics.field3153[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field699; var2++) {
            if (field711[var2]) {
                field702[var2] = true;
            }
            field526[var2] = field711[var2];
            field711[var2] = false;
        }
        field700 = field494;
        field640 = -1;
        field641 = -1;
        Statics.field937 = null;
        if (field718 != -1) {
            field699 = 0;
            method376(field718, 0, 0, Statics.field3203, Statics.field1050, 0, 0, -1);
        }
        class410.method6553();
        if (field590) {
            if (field594 == 1) {
                Statics.field944[field538 / 100].method6659(field592 - 8, field593 - 8);
            }
            if (field594 == 2) {
                Statics.field944[field538 / 100 + 4].method6659(field592 - 8, field593 - 8);
            }
        }
        if (field627) {
            method1944();
        } else if (field640 != -1) {
            int var3 = field640;
            int var4 = field641;
            if ((field695 >= 2 || field499 != 0 || field646) && field772) {
                int var5 = field695 - 1;
                String var7;
                if (field499 == 1 && field695 < 2) {
                    var7 = class283.field3489 + class283.field3328 + field498 + " " + class92.field1220;
                } else if (field646 && field695 < 2) {
                    var7 = field649 + class283.field3328 + field557 + " " + class92.field1220;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field634[var5].length() > 0) {
                        var8 = field633[var5] + class283.field3328 + field634[var5];
                    } else {
                        var8 = field633[var5];
                    }
                    var7 = var8;
                }
                if (field695 > 2) {
                    var7 = var7 + class92.method2841(16777215) + " " + '/' + " " + (field695 - 2) + class283.field3418;
                }
                Statics.field834.method5215(var7, var3 + 4, var4 + 15, 16777215, 0, field494 / 1000);
            }
        }
        if (field615 == 3) {
            for (int var9 = 0; var9 < field699; var9++) {
                if (field526[var9]) {
                    class410.method6616(field704[var9], field705[var9], field706[var9], field707[var9], 16711935, 128);
                } else if (field702[var9]) {
                    class410.method6616(field704[var9], field705[var9], field706[var9], field707[var9], 16711680, 128);
                }
            }
        }
        class63.method3553(Statics.field2592, Statics.field868.field1140, Statics.field868.field1124, field537);
        field537 = 0;
    }

    @ObfuscatedName("bj.gd(Ljava/lang/String;ZB)V")
    public static final void method1007(String arg0, boolean arg1) {
        if (!field768) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3196.method5203(arg0, 250);
        int var6 = Statics.field3196.method5204(arg0, 250) * 13;
        class410.method6595(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class410.method6566(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3196.method5263(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field699; var11++) {
            if (field706[var11] + field704[var11] > var7 && field704[var11] < var7 + var9 && field707[var11] + field705[var11] > var8 && field705[var11] < var8 + var10) {
                field711[var11] = true;
            }
        }
        if (arg1) {
            Statics.field2895.method424(0, 0);
        } else {
            method2361(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("cx.gf(IIIIB)V")
    public static final void method2042(int arg0, int arg1, int arg2, int arg3) {
        field589++;
        if (Statics.field868.field1140 >> 7 == field607 && Statics.field868.field1124 >> 7 == field729) {
            field607 = 0;
        }
        method5435();
        method273();
        method2322(true);
        method5732();
        method2322(false);
        method5479();
        method994();
        method2492(arg0, arg1, arg2, arg3, true);
        int var4 = field512;
        int var5 = field754;
        int var6 = field755;
        int var7 = field756;
        class410.method6573(var4, var5, var4 + var6, var5 + var7);
        class211.method3746();
        if (!field690) {
            int var8 = field553;
            if (field566 / 256 > var8) {
                var8 = field566 / 256;
            }
            if (field740[4] && field742[4] + 128 > var8) {
                var8 = field742[4] + 128;
            }
            int var9 = field561 & 0x7FF;
            int var10 = Statics.field1491;
            int var11 = Statics.field2187;
            int var12 = Statics.field1195;
            int var13 = method4861(var8);
            int var14 = var7 - 334;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 100) {
                var14 = 100;
            }
            int var15 = (field769 - field747) * var14 / 100 + field747;
            int var16 = var13 * var15 / 256;
            int var18 = 2048 - var8 & 0x7FF;
            int var19 = 2048 - var9 & 0x7FF;
            int var20 = 0;
            int var21 = 0;
            int var22 = var16;
            if (var18 != 0) {
                int var23 = class211.field2371[var18];
                int var24 = class211.field2359[var18];
                int var25 = var21 * var24 - var16 * var23 >> 16;
                var22 = var21 * var23 + var16 * var24 >> 16;
                var21 = var25;
            }
            if (var19 != 0) {
                int var26 = class211.field2371[var19];
                int var27 = class211.field2359[var19];
                int var28 = var20 * var27 + var22 * var26 >> 16;
                var22 = var22 * var27 - var20 * var26 >> 16;
                var20 = var28;
            }
            Statics.field154 = var10 - var20;
            Statics.field81 = var11 - var21;
            Statics.field1620 = var12 - var22;
            Statics.field2026 = var8;
            Statics.field1173 = var9;
            if (field753 == 1 && field660 >= 2 && field494 % 50 == 0 && (Statics.field1491 >> 7 != Statics.field868.field1140 >> 7 || Statics.field1195 >> 7 != Statics.field868.field1124 >> 7)) {
                int var29 = Statics.field868.field1083;
                int var30 = (Statics.field1491 >> 7) + Statics.field2131;
                int var31 = (Statics.field1195 >> 7) + Statics.field3028;
                method2279(var30, var31, var29, true);
            }
        }
        int var32;
        if (field690) {
            int var33;
            if (Statics.field3227.field1202) {
                var33 = Statics.field2592;
            } else {
                int var34 = method4391(Statics.field154, Statics.field1620, Statics.field2592);
                if (var34 - Statics.field81 >= 800 || (class75.field978[Statics.field2592][Statics.field154 >> 7][Statics.field1620 >> 7] & 0x4) == 0) {
                    var33 = 3;
                } else {
                    var33 = Statics.field2592;
                }
            }
            var32 = var33;
        } else {
            var32 = Statics.method2384();
        }
        int var35 = Statics.field154;
        int var36 = Statics.field81;
        int var37 = Statics.field1620;
        int var38 = Statics.field2026;
        int var39 = Statics.field1173;
        for (int var40 = 0; var40 < 5; var40++) {
            if (field740[var40]) {
                int var41 = (int) (Math.random() * (double) (field741[var40] * 2 + 1) - (double) field741[var40] + Math.sin((double) field743[var40] / 100.0D * (double) field744[var40]) * (double) field742[var40]);
                if (var40 == 0) {
                    Statics.field154 += var41;
                }
                if (var40 == 1) {
                    Statics.field81 += var41;
                }
                if (var40 == 2) {
                    Statics.field1620 += var41;
                }
                if (var40 == 3) {
                    Statics.field1173 = Statics.field1173 + var41 & 0x7FF;
                }
                if (var40 == 4) {
                    Statics.field2026 += var41;
                    if (Statics.field2026 < 128) {
                        Statics.field2026 = 128;
                    }
                    if (Statics.field2026 > 383) {
                        Statics.field2026 = 383;
                    }
                }
            }
        }
        int var42 = class33.field224;
        int var43 = class33.field225;
        if (class33.field231 != 0) {
            var42 = class33.field232;
            var43 = class33.field214;
        }
        if (var42 >= var4 && var42 < var4 + var6 && var43 >= var5 && var43 < var5 + var7) {
            class221.method1801(var42 - var4, var43 - var5);
        } else {
            class221.field2578 = false;
            class221.field2582 = 0;
        }
        method5739();
        class410.method6595(var4, var5, var6, var7, 0);
        method5739();
        int var44 = class211.field2357;
        class211.field2357 = field757;
        Statics.field3027.method3956(Statics.field154, Statics.field81, Statics.field1620, Statics.field2026, Statics.field1173, var32);
        class211.field2357 = var44;
        method5739();
        Statics.field3027.method3839();
        field519 = 0;
        boolean var45 = false;
        int var46 = -1;
        int var47 = -1;
        int var48 = class96.field1251;
        int[] var49 = class96.field1252;
        for (int var50 = 0; var50 < field513 + var48; var50++) {
            class85 var51;
            if (var50 < var48) {
                var51 = field642[var49[var50]];
                if (field618 == var49[var50]) {
                    var45 = true;
                    var46 = var50;
                    continue;
                }
                if (Statics.field868 == var51) {
                    var47 = var50;
                    continue;
                }
            } else {
                var51 = field532[field534[var50 - var48]];
            }
            method6120(var51, var50, var4, var5, var6, var7);
        }
        if (field694 && var47 != -1) {
            method6120(Statics.field868, var47, var4, var5, var6, var7);
        }
        if (var45) {
            method6120(field642[field618], var46, var4, var5, var6, var7);
        }
        for (int var52 = 0; var52 < field519; var52++) {
            int var53 = field580[var52];
            int var54 = field628[var52];
            int var55 = field583[var52];
            int var56 = field582[var52];
            boolean var57 = true;
            while (var57) {
                var57 = false;
                for (int var58 = 0; var58 < var52; var58++) {
                    if (var54 + 2 > field628[var58] - field582[var58] && var54 - var56 < field628[var58] + 2 && var53 - var55 < field583[var58] + field580[var58] && var53 + var55 > field580[var58] - field583[var58] && field628[var58] - field582[var58] < var54) {
                        var54 = field628[var58] - field582[var58];
                        var57 = true;
                    }
                }
            }
            field739 = field580[var52];
            field591 = field628[var52] = var54;
            String var59 = field587[var52];
            if (field653 == 0) {
                int var60 = 16776960;
                if (field584[var52] < 6) {
                    var60 = field555[field584[var52]];
                }
                if (field584[var52] == 6) {
                    var60 = field589 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field584[var52] == 7) {
                    var60 = field589 % 20 < 10 ? 255 : 65535;
                }
                if (field584[var52] == 8) {
                    var60 = field589 % 20 < 10 ? 45056 : 8454016;
                }
                if (field584[var52] == 9) {
                    int var61 = 150 - field752[var52];
                    if (var61 < 50) {
                        var60 = var61 * 1280 + 16711680;
                    } else if (var61 < 100) {
                        var60 = 16776960 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var60 = (var61 - 100) * 5 + 65280;
                    }
                }
                if (field584[var52] == 10) {
                    int var62 = 150 - field752[var52];
                    if (var62 < 50) {
                        var60 = var62 * 5 + 16711680;
                    } else if (var62 < 100) {
                        var60 = 16711935 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var60 = (var62 - 100) * 327680 + 255 - (var62 - 100) * 5;
                    }
                }
                if (field584[var52] == 11) {
                    int var63 = 150 - field752[var52];
                    if (var63 < 50) {
                        var60 = 16777215 - var63 * 327685;
                    } else if (var63 < 100) {
                        var60 = (var63 - 50) * 327685 + 65280;
                    } else if (var63 < 150) {
                        var60 = 16777215 - (var63 - 100) * 327680;
                    }
                }
                if (field585[var52] == 0) {
                    Statics.field834.method5210(var59, field739 + var4, field591 + var5, var60, 0);
                }
                if (field585[var52] == 1) {
                    Statics.field834.method5268(var59, field739 + var4, field591 + var5, var60, 0, field589);
                }
                if (field585[var52] == 2) {
                    Statics.field834.method5213(var59, field739 + var4, field591 + var5, var60, 0, field589);
                }
                if (field585[var52] == 3) {
                    Statics.field834.method5214(var59, field739 + var4, field591 + var5, var60, 0, field589, 150 - field752[var52]);
                }
                if (field585[var52] == 4) {
                    int var64 = (150 - field752[var52]) * (Statics.field834.method5201(var59) + 100) / 150;
                    class410.method6562(field739 + var4 - 50, var5, field739 + var4 + 50, var5 + var7);
                    Statics.field834.method5207(var59, field739 + var4 + 50 - var64, field591 + var5, var60, 0);
                    class410.method6573(var4, var5, var4 + var6, var5 + var7);
                }
                if (field585[var52] == 5) {
                    int var65 = 150 - field752[var52];
                    int var66 = 0;
                    if (var65 < 25) {
                        var66 = var65 - 25;
                    } else if (var65 > 125) {
                        var66 = var65 - 125;
                    }
                    class410.method6562(var4, field591 + var5 - Statics.field834.field3847 - 1, var4 + var6, field591 + var5 + 5);
                    Statics.field834.method5210(var59, field739 + var4, field591 + var5 + var66, var60, 0);
                    class410.method6573(var4, var5, var4 + var6, var5 + var7);
                }
            } else {
                Statics.field834.method5210(var59, field739 + var4, field591 + var5, 16776960, 0);
            }
        }
        method3632(var4, var5);
        ((class218) Statics.field2346).method4037(field537);
        method103(var4, var5, var6, var7);
        Statics.field154 = var35;
        Statics.field81 = var36;
        Statics.field1620 = var37;
        Statics.field2026 = var38;
        Statics.field1173 = var39;
        if (field493) {
            byte var67 = 0;
            int var68 = class291.field3720 + class291.field3718 + var67;
            if (var68 == 0) {
                field493 = false;
            }
        }
        if (field493) {
            class410.method6595(var4, var5, var6, var7, 0);
            method1007(class283.field3594, false);
        }
    }

    @ObfuscatedName("et.gu(IIIIZI)V")
    public static final void method2492(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field745;
        } else if (var5 >= 100) {
            var6 = field748;
        } else {
            var6 = (field748 - field745) * var5 / 100 + field745;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field751) {
            short var8 = field751;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field750) {
                var6 = field750;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class410.method6553();
                    class410.method6595(arg0, arg1, var10, arg3, -16777216);
                    class410.method6595(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field502) {
            short var11 = field502;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field749) {
                var6 = field749;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class410.method6553();
                    class410.method6595(arg0, arg1, arg2, var13, -16777216);
                    class410.method6595(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field757 = arg3 * var6 / 334;
        if (field755 != arg2 || field756 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method4861(var16);
                int var18 = class211.field2371[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field769 - field747) * var19 / 100 + field747;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class213.method3886(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field512 = arg0;
        field754 = arg1;
        field755 = arg2;
        field756 = arg3;
    }

    @ObfuscatedName("lo.gh(I)V")
    public static void method5435() {
        if (field694) {
            method313(Statics.field868, false);
        }
    }

    @ObfuscatedName("p.gb(I)V")
    public static void method273() {
        if (field618 >= 0 && field642[field618] != null) {
            method313(field642[field618], false);
        }
    }

    @ObfuscatedName("mh.gs(B)V")
    public static void method5732() {
        int var0 = class96.field1251;
        int[] var1 = class96.field1252;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field618 != var1[var2] && field608 != var1[var2]) {
                method313(field642[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("o.gj(Lci;ZB)V")
    public static void method313(class83 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1999() || arg0.field1082) {
            return;
        }
        arg0.field1080 = false;
        if ((field569 && class96.field1251 > 50 || class96.field1251 > 200) && arg1 && arg0.field1136 == arg0.field1112) {
            arg0.field1080 = true;
        }
        int var2 = arg0.field1140 >> 7;
        int var3 = arg0.field1124 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class221.method4293(0, 0, 0, false, arg0.field1084);
        if (arg0.field1075 != null && field494 >= arg0.field1070 && field494 < arg0.field1079) {
            arg0.field1080 = false;
            arg0.field1069 = method4391(arg0.field1140, arg0.field1124, Statics.field2592);
            arg0.field1111 = field494;
            Statics.field3027.method3837(Statics.field2592, arg0.field1140, arg0.field1124, arg0.field1069, 60, arg0, arg0.field1133, var4, arg0.field1076, arg0.field1065, arg0.field1068, arg0.field1066);
            return;
        }
        if ((arg0.field1140 & 0x7F) == 64 && (arg0.field1124 & 0x7F) == 64) {
            if (field589 == field588[var2][var3]) {
                return;
            }
            field588[var2][var3] = field589;
        }
        arg0.field1069 = method4391(arg0.field1140, arg0.field1124, Statics.field2592);
        arg0.field1111 = field494;
        Statics.field3027.method3992(Statics.field2592, arg0.field1140, arg0.field1124, arg0.field1069, 60, arg0, arg0.field1133, var4, arg0.field1144);
    }

    @ObfuscatedName("db.ge(ZI)V")
    public static final void method2322(boolean arg0) {
        for (int var1 = 0; var1 < field513; var1++) {
            class91 var2 = field532[field534[var1]];
            if (var2 != null && var2.method1999() && var2.field1219.field1728 == arg0 && var2.field1219.method2797()) {
                int var3 = var2.field1140 >> 7;
                int var4 = var2.field1124 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1110 == 1 && (var2.field1140 & 0x7F) == 64 && (var2.field1124 & 0x7F) == 64) {
                        if (field589 == field588[var3][var4]) {
                            continue;
                        }
                        field588[var3][var4] = field589;
                    }
                    long var5 = class221.method4293(0, 0, 1, !var2.field1219.field1744, field534[var1]);
                    var2.field1111 = field494;
                    Statics.field3027.method3992(Statics.field2592, var2.field1140, var2.field1124, method4391(var2.field1140 + (var2.field1110 * 64 - 64), var2.field1124 + (var2.field1110 * 64 - 64), Statics.field2592), var2.field1110 * 64 - 64 + 60, var2, var2.field1133, var5, var2.field1144);
                }
            }
        }
    }

    @ObfuscatedName("lz.go(B)V")
    public static final void method5479() {
        for (class70 var0 = (class70) field655.method5035(); var0 != null; var0 = (class70) field655.method5022()) {
            if (Statics.field2592 != var0.field914 || field494 > var0.field920) {
                var0.method5775();
            } else if (field494 >= var0.field919) {
                if (var0.field923 > 0) {
                    class91 var1 = field532[var0.field923 - 1];
                    if (var1 != null && var1.field1140 >= 0 && var1.field1140 < 13312 && var1.field1124 >= 0 && var1.field1124 < 13312) {
                        var0.method1844(var1.field1140, var1.field1124, method4391(var1.field1140, var1.field1124, var0.field914) - var0.field918, field494);
                    }
                }
                if (var0.field923 < 0) {
                    int var2 = -var0.field923 - 1;
                    class83 var3;
                    if (field608 == var2) {
                        var3 = Statics.field868;
                    } else {
                        var3 = field642[var2];
                    }
                    if (var3 != null && var3.field1140 >= 0 && var3.field1140 < 13312 && var3.field1124 >= 0 && var3.field1124 < 13312) {
                        var0.method1844(var3.field1140, var3.field1124, method4391(var3.field1140, var3.field1124, var0.field914) - var0.field918, field494);
                    }
                }
                var0.method1849(field537);
                Statics.field3027.method3992(Statics.field2592, (int) var0.field913, (int) var0.field926, (int) var0.field927, 60, var0, var0.field933, -1L, false);
            }
        }
    }

    @ObfuscatedName("bg.gk(S)V")
    public static final void method994() {
        for (class65 var0 = (class65) field622.method5035(); var0 != null; var0 = (class65) field622.method5022()) {
            if (Statics.field2592 != var0.field840 || var0.field846) {
                var0.method5775();
            } else if (field494 >= var0.field837) {
                var0.method1783(field537);
                if (var0.field846) {
                    var0.method5775();
                } else {
                    Statics.field3027.method3992(var0.field840, var0.field844, var0.field841, var0.field842, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("gg.ga(IIB)V")
    public static final void method3632(int arg0, int arg1) {
        if (field577 == 2) {
            method2406((field505 - Statics.field2131 << 7) + field508, (field506 - Statics.field3028 << 7) + field509, field507 * 2);
            if (field739 > -1 && field494 % 20 < 10) {
                Statics.field1319[0].method6659(field739 + arg0 - 12, field591 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("em.gr(B)Z")
    public static boolean method2707() {
        return (field611 & 0x4) != 0;
    }

    @ObfuscatedName("dr.gq(Lci;I)Z")
    public static boolean method2382(class83 arg0) {
        if (field611 == 0) {
            return false;
        } else if (Statics.field868 == arg0) {
            return Statics.method5306();
        } else {
            boolean var1 = method2707();
            if (!var1) {
                boolean var2 = (field611 & 0x1) != 0;
                var1 = var2 && arg0.method1990();
            }
            boolean var3 = var1;
            if (!var1) {
                boolean var4 = (field611 & 0x2) != 0;
                var3 = var4 && arg0.method1993();
            }
            return var3;
        }
    }

    @ObfuscatedName("nq.gy(Lcd;IIIIIB)V")
    public static final void method6120(class85 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1999()) {
            return;
        }
        if (arg0 instanceof class91) {
            class161 var6 = ((class91) arg0).field1219;
            if (var6.field1738 != null) {
                var6 = var6.method2771();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class96.field1251;
        int[] var8 = class96.field1252;
        byte var9 = 0;
        if (arg1 < var7 && field494 == arg0.field1111 && method2382((class83) arg0)) {
            class83 var10 = (class83) arg0;
            if (arg1 < var7) {
                int var11 = arg0.field1157 + 15;
                method2406(arg0.field1140, arg0.field1124, var11);
                class316 var12 = (class316) field654.get(class377.field4192);
                byte var13 = 9;
                var12.method5210(var10.field1067.method6815(), field739 + arg2, field591 + arg3 - var13, 16777215, 0);
                var9 = 18;
            }
        }
        int var14 = -2;
        if (!arg0.field1155.method5077()) {
            int var15 = arg0.field1157 + 15;
            method2406(arg0.field1140, arg0.field1124, var15);
            for (class90 var16 = (class90) arg0.field1155.method5074(); var16 != null; var16 = (class90) arg0.field1155.method5094()) {
                class86 var17 = var16.method2117(field494);
                if (var17 != null) {
                    class157 var18 = var16.field1216;
                    class414 var19 = var18.method2727();
                    class414 var20 = var18.method2716();
                    int var21 = 0;
                    int var22;
                    if (var19 == null || var20 == null) {
                        var22 = var18.field1684;
                    } else {
                        if (var18.field1677 * 2 < var20.field4390) {
                            var21 = var18.field1677;
                        }
                        var22 = var20.field4390 - var21 * 2;
                    }
                    int var23 = 255;
                    boolean var24 = true;
                    int var25 = field494 - var17.field1167;
                    int var26 = var17.field1170 * var22 / var18.field1684;
                    int var29;
                    if (var17.field1169 > var25) {
                        int var27 = var18.field1680 == 0 ? 0 : var25 / var18.field1680 * var18.field1680;
                        int var28 = var17.field1168 * var22 / var18.field1684;
                        var29 = (var26 - var28) * var27 / var17.field1169 + var28;
                    } else {
                        var29 = var26;
                        int var30 = var17.field1169 + var18.field1681 - var25;
                        if (var18.field1679 >= 0) {
                            var23 = (var30 << 8) / (var18.field1681 - var18.field1679);
                        }
                    }
                    if (var17.field1170 > 0 && var29 < 1) {
                        var29 = 1;
                    }
                    if (var19 == null || var20 == null) {
                        var14 += 5;
                        if (field739 > -1) {
                            int var36 = field739 + arg2 - (var22 >> 1);
                            int var37 = field591 + arg3 - var14;
                            class410.method6595(var36, var37, var29, 5, 65280);
                            class410.method6595(var29 + var36, var37, var22 - var29, 5, 16711680);
                        }
                        var14 += 2;
                    } else {
                        int var31;
                        if (var22 == var29) {
                            var31 = var21 * 2 + var29;
                        } else {
                            var31 = var21 + var29;
                        }
                        int var32 = var19.field4383;
                        var14 += var32;
                        int var33 = field739 + arg2 - (var22 >> 1);
                        int var34 = field591 + arg3 - var14;
                        int var35 = var33 - var21;
                        if (var23 >= 0 && var23 < 255) {
                            var19.method6665(var35, var34, var23);
                            class410.method6562(var35, var34, var31 + var35, var32 + var34);
                            var20.method6665(var35, var34, var23);
                        } else {
                            var19.method6659(var35, var34);
                            class410.method6562(var35, var34, var31 + var35, var32 + var34);
                            var20.method6659(var35, var34);
                        }
                        class410.method6573(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var14 += 2;
                    }
                } else if (var16.method2119()) {
                    var16.method5775();
                }
            }
        }
        if (var14 == -2) {
            var14 += 7;
        }
        int var38 = var9 + var14;
        if (arg1 < var7) {
            class83 var39 = (class83) arg0;
            if (var39.field1082) {
                return;
            }
            if (var39.field1063 != -1 || var39.field1064 != -1) {
                int var40 = arg0.field1157 + 15;
                method2406(arg0.field1140, arg0.field1124, var40);
                if (field739 > -1) {
                    if (var39.field1063 != -1) {
                        var38 += 25;
                        Statics.field111[var39.field1063].method6659(field739 + arg2 - 12, field591 + arg3 - var38);
                    }
                    if (var39.field1064 != -1) {
                        var38 += 25;
                        Statics.field1175[var39.field1064].method6659(field739 + arg2 - 12, field591 + arg3 - var38);
                    }
                }
            }
            if (arg1 >= 0 && field577 == 10 && field504 == var8[arg1]) {
                int var41 = arg0.field1157 + 15;
                method2406(arg0.field1140, arg0.field1124, var41);
                if (field739 > -1) {
                    int var42 = Statics.field1319[1].field4383 + var38;
                    Statics.field1319[1].method6659(field739 + arg2 - 12, field591 + arg3 - var42);
                }
            }
        } else {
            class161 var43 = ((class91) arg0).field1219;
            if (var43.field1738 != null) {
                var43 = var43.method2771();
            }
            if (var43.field1739 >= 0 && var43.field1739 < Statics.field1175.length) {
                int var44 = arg0.field1157 + 15;
                method2406(arg0.field1140, arg0.field1124, var44);
                if (field739 > -1) {
                    Statics.field1175[var43.field1739].method6659(field739 + arg2 - 12, field591 + arg3 - 30);
                }
            }
            if (field577 == 1 && field733 == field534[arg1 - var7] && field494 % 20 < 10) {
                int var45 = arg0.field1157 + 15;
                method2406(arg0.field1140, arg0.field1124, var45);
                if (field739 > -1) {
                    Statics.field1319[0].method6659(field739 + arg2 - 12, field591 + arg3 - 28);
                }
            }
        }
        if (arg0.field1120 != null && (arg1 >= var7 || !arg0.field1122 && (field661 == 4 || !arg0.field1121 && (field661 == 0 || field661 == 3 || field661 == 1 && ((class83) arg0).method1990())))) {
            int var46 = arg0.field1157;
            method2406(arg0.field1140, arg0.field1124, var46);
            if (field739 > -1 && field519 < field491) {
                field583[field519] = Statics.field834.method5201(arg0.field1120) / 2;
                field582[field519] = Statics.field834.field3847;
                field580[field519] = field739;
                field628[field519] = field591;
                field584[field519] = arg0.field1137;
                field585[field519] = arg0.field1108;
                field752[field519] = arg0.field1123;
                field587[field519] = arg0.field1120;
                field519++;
            }
        }
        for (int var47 = 0; var47 < 4; var47++) {
            int var48 = arg0.field1129[var47];
            int var49 = arg0.field1107[var47];
            class168 var50 = null;
            int var51 = 0;
            if (var49 >= 0) {
                if (var48 <= field494) {
                    continue;
                }
                var50 = class168.method1966(arg0.field1107[var47]);
                var51 = var50.field1807;
                if (var50 != null && var50.field1818 != null) {
                    var50 = var50.method2902();
                    if (var50 == null) {
                        arg0.field1129[var47] = -1;
                        continue;
                    }
                }
            } else if (var48 < 0) {
                continue;
            }
            int var52 = arg0.field1154[var47];
            class168 var53 = null;
            if (var52 >= 0) {
                var53 = class168.method1966(var52);
                if (var53 != null && var53.field1818 != null) {
                    var53 = var53.method2902();
                }
            }
            if (var48 - var51 <= field494) {
                if (var50 == null) {
                    arg0.field1129[var47] = -1;
                } else {
                    int var54 = arg0.field1157 / 2;
                    method2406(arg0.field1140, arg0.field1124, var54);
                    if (field739 > -1) {
                        if (var47 == 1) {
                            field591 -= 20;
                        }
                        if (var47 == 2) {
                            field739 -= 15;
                            field591 -= 10;
                        }
                        if (var47 == 3) {
                            field739 += 15;
                            field591 -= 10;
                        }
                        Object var55 = null;
                        Object var56 = null;
                        Object var57 = null;
                        Object var58 = null;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        class414 var67 = null;
                        class414 var68 = null;
                        class414 var69 = null;
                        class414 var70 = null;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        class414 var80 = var50.method2904();
                        if (var80 != null) {
                            var59 = var80.field4390;
                            int var81 = var80.field4383;
                            if (var81 > var79) {
                                var79 = var81;
                            }
                            var63 = var80.field4384;
                        }
                        class414 var82 = var50.method2905();
                        if (var82 != null) {
                            var60 = var82.field4390;
                            int var83 = var82.field4383;
                            if (var83 > var79) {
                                var79 = var83;
                            }
                            var64 = var82.field4384;
                        }
                        class414 var84 = var50.method2906();
                        if (var84 != null) {
                            var61 = var84.field4390;
                            int var85 = var84.field4383;
                            if (var85 > var79) {
                                var79 = var85;
                            }
                            var65 = var84.field4384;
                        }
                        class414 var86 = var50.method2922();
                        if (var86 != null) {
                            var62 = var86.field4390;
                            int var87 = var86.field4383;
                            if (var87 > var79) {
                                var79 = var87;
                            }
                            var66 = var86.field4384;
                        }
                        if (var53 != null) {
                            var67 = var53.method2904();
                            if (var67 != null) {
                                var71 = var67.field4390;
                                int var88 = var67.field4383;
                                if (var88 > var79) {
                                    var79 = var88;
                                }
                                var75 = var67.field4384;
                            }
                            var68 = var53.method2905();
                            if (var68 != null) {
                                var72 = var68.field4390;
                                int var89 = var68.field4383;
                                if (var89 > var79) {
                                    var79 = var89;
                                }
                                var76 = var68.field4384;
                            }
                            var69 = var53.method2906();
                            if (var69 != null) {
                                var73 = var69.field4390;
                                int var90 = var69.field4383;
                                if (var90 > var79) {
                                    var79 = var90;
                                }
                                var77 = var69.field4384;
                            }
                            var70 = var53.method2922();
                            if (var70 != null) {
                                var74 = var70.field4390;
                                int var91 = var70.field4383;
                                if (var91 > var79) {
                                    var79 = var91;
                                }
                                var78 = var70.field4384;
                            }
                        }
                        class315 var92 = var50.method2919();
                        if (var92 == null) {
                            var92 = Statics.field1325;
                        }
                        class315 var93;
                        if (var53 == null) {
                            var93 = Statics.field1325;
                        } else {
                            var93 = var53.method2919();
                            if (var93 == null) {
                                var93 = Statics.field1325;
                            }
                        }
                        Object var94 = null;
                        String var95 = null;
                        boolean var96 = false;
                        int var97 = 0;
                        String var98 = var50.method2903(arg0.field1128[var47]);
                        int var99 = var92.method5201(var98);
                        if (var53 != null) {
                            var95 = var53.method2903(arg0.field1131[var47]);
                            var97 = var93.method5201(var95);
                        }
                        int var100 = 0;
                        int var101 = 0;
                        if (var60 > 0) {
                            if (var84 == null && var86 == null) {
                                var100 = 1;
                            } else {
                                var100 = var99 / var60 + 1;
                            }
                        }
                        if (var53 != null && var72 > 0) {
                            if (var69 == null && var70 == null) {
                                var101 = 1;
                            } else {
                                var101 = var97 / var72 + 1;
                            }
                        }
                        int var102 = 0;
                        int var103 = var102;
                        if (var59 > 0) {
                            var102 += var59;
                        }
                        var102 += 2;
                        int var104 = var102;
                        if (var61 > 0) {
                            var102 += var61;
                        }
                        int var105 = var102;
                        int var106 = var102;
                        int var108;
                        if (var60 > 0) {
                            int var107 = var60 * var100;
                            var108 = var102 + var107;
                            var106 = (var107 - var99) / 2 + var102;
                        } else {
                            var108 = var99 + var102;
                        }
                        int var109 = var108;
                        if (var62 > 0) {
                            var108 += var62;
                        }
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        int var113 = 0;
                        int var114 = 0;
                        if (var53 != null) {
                            var108 += 2;
                            var110 = var108;
                            if (var71 > 0) {
                                var108 += var71;
                            }
                            var108 += 2;
                            var111 = var108;
                            if (var73 > 0) {
                                var108 += var73;
                            }
                            var112 = var108;
                            var114 = var108;
                            if (var72 > 0) {
                                int var115 = var72 * var101;
                                var108 += var115;
                                var114 += (var115 - var97) / 2;
                            } else {
                                var108 += var97;
                            }
                            var113 = var108;
                            if (var74 > 0) {
                                var108 += var74;
                            }
                        }
                        int var116 = arg0.field1129[var47] - field494;
                        int var117 = var50.field1812 - var50.field1812 * var116 / var50.field1807;
                        int var118 = var50.field1811 * var116 / var50.field1807 + -var50.field1811;
                        int var119 = field739 + arg2 - (var108 >> 1) + var117;
                        int var120 = field591 + arg3 - 12 + var118;
                        int var121 = var120;
                        int var122 = var79 + var120;
                        int var123 = var50.field1799 + var120 + 15;
                        int var124 = var123 - var92.field3845;
                        int var125 = var92.field3854 + var123;
                        if (var124 < var120) {
                            var121 = var124;
                        }
                        if (var125 > var122) {
                            var122 = var125;
                        }
                        int var126 = 0;
                        if (var53 != null) {
                            var126 = var53.field1799 + var120 + 15;
                            int var127 = var126 - var93.field3845;
                            int var128 = var93.field3854 + var126;
                            if (var127 < var121) {
                                ;
                            }
                            if (var128 > var122) {
                                ;
                            }
                        }
                        int var131 = 255;
                        if (var50.field1814 >= 0) {
                            var131 = (var116 << 8) / (var50.field1807 - var50.field1814);
                        }
                        if (var131 >= 0 && var131 < 255) {
                            if (var80 != null) {
                                var80.method6665(var103 + var119 - var63, var120, var131);
                            }
                            if (var84 != null) {
                                var84.method6665(var104 + var119 - var65, var120, var131);
                            }
                            if (var82 != null) {
                                for (int var132 = 0; var132 < var100; var132++) {
                                    var82.method6665(var60 * var132 + (var105 + var119 - var64), var120, var131);
                                }
                            }
                            if (var86 != null) {
                                var86.method6665(var109 + var119 - var66, var120, var131);
                            }
                            var92.method5235(var98, var106 + var119, var123, var50.field1808, 0, var131);
                            if (var53 != null) {
                                if (var67 != null) {
                                    var67.method6665(var110 + var119 - var75, var120, var131);
                                }
                                if (var69 != null) {
                                    var69.method6665(var111 + var119 - var77, var120, var131);
                                }
                                if (var68 != null) {
                                    for (int var133 = 0; var133 < var101; var133++) {
                                        var68.method6665(var72 * var133 + (var112 + var119 - var76), var120, var131);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method6665(var113 + var119 - var78, var120, var131);
                                }
                                var93.method5235(var95, var114 + var119, var126, var53.field1808, 0, var131);
                            }
                        } else {
                            if (var80 != null) {
                                var80.method6659(var103 + var119 - var63, var120);
                            }
                            if (var84 != null) {
                                var84.method6659(var104 + var119 - var65, var120);
                            }
                            if (var82 != null) {
                                for (int var134 = 0; var134 < var100; var134++) {
                                    var82.method6659(var60 * var134 + (var105 + var119 - var64), var120);
                                }
                            }
                            if (var86 != null) {
                                var86.method6659(var109 + var119 - var66, var120);
                            }
                            var92.method5207(var98, var106 + var119, var123, var50.field1808 | 0xFF000000, 0);
                            if (var53 != null) {
                                if (var67 != null) {
                                    var67.method6659(var110 + var119 - var75, var120);
                                }
                                if (var69 != null) {
                                    var69.method6659(var111 + var119 - var77, var120);
                                }
                                if (var68 != null) {
                                    for (int var135 = 0; var135 < var101; var135++) {
                                        var68.method6659(var72 * var135 + (var112 + var119 - var76), var120);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method6659(var113 + var119 - var78, var120);
                                }
                                var93.method5207(var95, var114 + var119, var126, var53.field1808 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.gz(B)V")
    public static final void method2379() {
        field560 = 0;
        int var0 = (Statics.field868.field1140 >> 7) + Statics.field2131;
        int var1 = (Statics.field868.field1124 >> 7) + Statics.field3028;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field560 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field560 = 1;
        }
        if (field560 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field560 = 0;
        }
    }

    @ObfuscatedName("w.gp(IIIII)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3) {
        method2379();
    }

    @ObfuscatedName("dh.gl(IIII)V")
    public static final void method2406(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field739 = -1;
            field591 = -1;
            return;
        }
        int var3 = method4391(arg0, arg1, Statics.field2592) - arg2;
        int var4 = arg0 - Statics.field154;
        int var5 = var3 - Statics.field81;
        int var6 = arg1 - Statics.field1620;
        int var7 = class211.field2371[Statics.field2026];
        int var8 = class211.field2359[Statics.field2026];
        int var9 = class211.field2371[Statics.field1173];
        int var10 = class211.field2359[Statics.field1173];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field739 = field757 * var11 / var15 + field755 / 2;
            field591 = field757 * var14 / var15 + field756 / 2;
        } else {
            field739 = -1;
            field591 = -1;
        }
    }

    @ObfuscatedName("ig.gx(IIII)I")
    public static final int method4391(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field978[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field994[var5][var3][var4] + class75.field994[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field994[var5][var3][var4 + 1] + class75.field994[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fr.gg(ZLoy;I)V")
    public static final void method3310(boolean arg0, class400 arg1) {
        field767 = arg0;
        if (!field767) {
            int var2 = arg1.method6309();
            int var3 = arg1.method6284();
            int var4 = arg1.method6284();
            Statics.field3821 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field3821[var5][var6] = arg1.method6277();
                }
            }
            Statics.field1480 = new int[var4];
            Statics.field155 = new int[var4];
            Statics.field3741 = new int[var4];
            Statics.field164 = new byte[var4][];
            Statics.field773 = new byte[var4][];
            boolean var7 = false;
            if (field541) {
                if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
                    var7 = true;
                }
                if (var2 / 8 == 48 && var3 / 8 == 148) {
                    var7 = true;
                }
            }
            int var8 = 0;
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field1480[var8] = var11;
                        Statics.field155[var8] = Statics.field478.method4771("m" + var9 + "_" + var10);
                        Statics.field3741[var8] = Statics.field478.method4771("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method5796(var2, var3, true);
            return;
        }
        boolean var12 = arg1.method6302() == 1;
        int var13 = arg1.method6309();
        int var14 = arg1.method6284();
        int var15 = arg1.method6284();
        arg1.method6225();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6226(1);
                    if (var19 == 1) {
                        field606[var16][var17][var18] = arg1.method6226(26);
                    } else {
                        field606[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6239();
        Statics.field3821 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field3821[var20][var21] = arg1.method6277();
            }
        }
        Statics.field1480 = new int[var15];
        Statics.field155 = new int[var15];
        Statics.field3741 = new int[var15];
        Statics.field164 = new byte[var15][];
        Statics.field773 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field606[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1480[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1480[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field155[var22] = Statics.field478.method4771("m" + var31 + "_" + var32);
                            Statics.field3741[var22] = Statics.field478.method4771("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method5796(var14, var13, !var12);
    }

    @ObfuscatedName("nm.gt(IIZI)V")
    public static final void method5796(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1672 == arg0 && Statics.field2054 == arg1) {
            return;
        }
        Statics.field1672 = arg0;
        Statics.field2054 = arg1;
        method5605(25);
        method1007(class283.field3594, true);
        int var3 = Statics.field2131;
        int var4 = Statics.field3028;
        Statics.field2131 = (arg0 - 6) * 8;
        Statics.field3028 = (arg1 - 6) * 8;
        int var5 = Statics.field2131 - var3;
        int var6 = Statics.field3028 - var4;
        int var7 = Statics.field2131;
        int var8 = Statics.field3028;
        for (int var9 = 0; var9 < 32768; var9++) {
            class91 var10 = field532[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1162[var11] -= var5;
                    var10.field1163[var11] -= var6;
                }
                var10.field1140 -= var5 * 128;
                var10.field1124 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class83 var13 = field642[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1162[var14] -= var5;
                    var13.field1163[var14] -= var6;
                }
                var13.field1140 -= var5 * 128;
                var13.field1124 -= var6 * 128;
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
                        field619[var25][var21][var22] = field619[var25][var23][var24];
                    } else {
                        field619[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class84 var26 = (class84) field708.method5035(); var26 != null; var26 = (class84) field708.method5022()) {
            var26.field1093 -= var5;
            var26.field1103 -= var6;
            if (var26.field1093 < 0 || var26.field1103 < 0 || var26.field1093 >= 104 || var26.field1103 >= 104) {
                var26.method5775();
            }
        }
        if (field607 != 0) {
            field607 -= var5;
            field729 -= var6;
        }
        field544 = 0;
        field690 = false;
        Statics.field154 -= var5 << 7;
        Statics.field1620 -= var6 << 7;
        Statics.field1491 -= var5 << 7;
        Statics.field1195 -= var6 << 7;
        field723 = -1;
        field622.method5014();
        field655.method5014();
        for (int var27 = 0; var27 < 4; var27++) {
            field712[var27].method3159();
        }
    }

    @ObfuscatedName("cg.gn(ZB)V")
    public static final void method1984(boolean arg0) {
        method5739();
        field639.field1292++;
        if (field639.field1292 < 50 && !arg0) {
            return;
        }
        field639.field1292 = 0;
        if (field539 || field639.method2251() == null) {
            return;
        }
        class242 var1 = class242.method2075(class240.field2707, field639.field1287);
        field639.method2246(var1);
        try {
            field639.method2253();
        } catch (IOException var3) {
            field539 = true;
        }
    }

    @ObfuscatedName("fc.gi(I)V")
    public static final void method3191() {
        method1984(false);
        field765 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field164.length; var1++) {
            if (Statics.field155[var1] != -1 && Statics.field164[var1] == null) {
                Statics.field164[var1] = Statics.field478.method4756(Statics.field155[var1], 0);
                if (Statics.field164[var1] == null) {
                    var0 = false;
                    field765++;
                }
            }
            if (Statics.field3741[var1] != -1 && Statics.field773[var1] == null) {
                Statics.field773[var1] = Statics.field478.method4757(Statics.field3741[var1], 0, Statics.field3821[var1]);
                if (Statics.field773[var1] == null) {
                    var0 = false;
                    field765++;
                }
            }
        }
        if (!var0) {
            field535 = 1;
            return;
        }
        field546 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field164.length; var3++) {
            byte[] var4 = Statics.field773[var3];
            if (var4 != null) {
                int var5 = (Statics.field1480[var3] >> 8) * 64 - Statics.field2131;
                int var6 = (Statics.field1480[var3] & 0xFF) * 64 - Statics.field3028;
                if (field767) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class75.method2493(var4, var5, var6);
            }
        }
        if (!var2) {
            field535 = 2;
            return;
        }
        if (field535 != 0) {
            method1007(class283.field3594 + class92.field1226 + class92.field1224 + 100 + "%" + class92.field1223, true);
        }
        method5739();
        Statics.field3027.method4003();
        for (int var7 = 0; var7 < 4; var7++) {
            field712[var7].method3159();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class75.field978[var8][var9][var10] = 0;
                }
            }
        }
        method5739();
        class75.field979 = 99;
        Statics.field977 = new byte[4][104][104];
        Statics.field983 = new byte[4][104][104];
        Statics.field84 = new byte[4][104][104];
        Statics.field3761 = new byte[4][104][104];
        Statics.field3204 = new int[4][105][105];
        Statics.field3324 = new byte[4][105][105];
        Statics.field982 = new int[105][105];
        Statics.field63 = new int[104];
        Statics.field990 = new int[104];
        Statics.field984 = new int[104];
        Statics.field771 = new int[104];
        Statics.field985 = new int[104];
        int var11 = Statics.field164.length;
        for (class63 var12 = (class63) class63.field806.method5035(); var12 != null; var12 = (class63) class63.field806.method5022()) {
            if (var12.field813 != null) {
                Statics.field474.method611(var12.field813);
                var12.field813 = null;
            }
            if (var12.field803 != null) {
                Statics.field474.method611(var12.field803);
                var12.field803 = null;
            }
        }
        class63.field806.method5014();
        method1984(true);
        if (!field767) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field1480[var13] >> 8) * 64 - Statics.field2131;
                int var15 = (Statics.field1480[var13] & 0xFF) * 64 - Statics.field3028;
                byte[] var16 = Statics.field164[var13];
                if (var16 != null) {
                    method5739();
                    class75.method3645(var16, var14, var15, Statics.field1672 * 8 - 48, Statics.field2054 * 8 - 48, field712);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field1480[var17] >> 8) * 64 - Statics.field2131;
                int var19 = (Statics.field1480[var17] & 0xFF) * 64 - Statics.field3028;
                byte[] var20 = Statics.field164[var17];
                if (var20 == null && Statics.field2054 < 800) {
                    method5739();
                    class75.method579(var18, var19, 64, 64);
                }
            }
            method1984(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field773[var21];
                if (var22 != null) {
                    int var23 = (Statics.field1480[var21] >> 8) * 64 - Statics.field2131;
                    int var24 = (Statics.field1480[var21] & 0xFF) * 64 - Statics.field3028;
                    method5739();
                    class213 var25 = Statics.field3027;
                    class173[] var26 = field712;
                    class401 var27 = new class401(var22);
                    int var28 = -1;
                    while (true) {
                        int var29 = var27.method6413();
                        if (var29 == 0) {
                            break;
                        }
                        var28 += var29;
                        int var30 = 0;
                        while (true) {
                            int var31 = var27.method6286();
                            if (var31 == 0) {
                                break;
                            }
                            var30 += var31 - 1;
                            int var32 = var30 & 0x3F;
                            int var33 = var30 >> 6 & 0x3F;
                            int var34 = var30 >> 12;
                            int var35 = var27.method6272();
                            int var36 = var35 >> 2;
                            int var37 = var35 & 0x3;
                            int var38 = var23 + var33;
                            int var39 = var24 + var32;
                            if (var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                int var40 = var34;
                                if ((class75.field978[1][var38][var39] & 0x2) == 2) {
                                    var40 = var34 - 1;
                                }
                                class173 var41 = null;
                                if (var40 >= 0) {
                                    var41 = var26[var40];
                                }
                                class75.method61(var34, var38, var39, var28, var37, var36, var25, var41);
                            }
                        }
                    }
                }
            }
        }
        if (field767) {
            for (int var42 = 0; var42 < 4; var42++) {
                method5739();
                for (int var43 = 0; var43 < 13; var43++) {
                    for (int var44 = 0; var44 < 13; var44++) {
                        boolean var45 = false;
                        int var46 = field606[var42][var43][var44];
                        if (var46 != -1) {
                            int var47 = var46 >> 24 & 0x3;
                            int var48 = var46 >> 1 & 0x3;
                            int var49 = var46 >> 14 & 0x3FF;
                            int var50 = var46 >> 3 & 0x7FF;
                            int var51 = (var49 / 8 << 8) + var50 / 8;
                            for (int var52 = 0; var52 < Statics.field1480.length; var52++) {
                                if (Statics.field1480[var52] == var51 && Statics.field164[var52] != null) {
                                    byte[] var53 = Statics.field164[var52];
                                    int var54 = var43 * 8;
                                    int var55 = var44 * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    int var57 = (var50 & 0x7) * 8;
                                    class173[] var58 = field712;
                                    for (int var59 = 0; var59 < 8; var59++) {
                                        for (int var60 = 0; var60 < 8; var60++) {
                                            if (var54 + var59 > 0 && var54 + var59 < 103 && var55 + var60 > 0 && var55 + var60 < 103) {
                                                var58[var42].field1979[var54 + var59][var55 + var60] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class401 var61 = new class401(var53);
                                    for (int var62 = 0; var62 < 4; var62++) {
                                        for (int var63 = 0; var63 < 64; var63++) {
                                            for (int var64 = 0; var64 < 64; var64++) {
                                                if (var47 == var62 && var63 >= var56 && var63 < var56 + 8 && var64 >= var57 && var64 < var57 + 8) {
                                                    class75.method2639(var61, var42, var54 + class259.method2751(var63 & 0x7, var64 & 0x7, var48), var55 + class259.method367(var63 & 0x7, var64 & 0x7, var48), 0, 0, var48);
                                                } else {
                                                    class75.method2639(var61, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var45 = true;
                                    break;
                                }
                            }
                        }
                        if (!var45) {
                            int var65 = var42;
                            int var66 = var43 * 8;
                            int var67 = var44 * 8;
                            for (int var68 = 0; var68 < 8; var68++) {
                                for (int var69 = 0; var69 < 8; var69++) {
                                    class75.field994[var65][var66 + var68][var67 + var69] = 0;
                                }
                            }
                            if (var66 > 0) {
                                for (int var70 = 1; var70 < 8; var70++) {
                                    class75.field994[var65][var66][var67 + var70] = class75.field994[var65][var66 - 1][var67 + var70];
                                }
                            }
                            if (var67 > 0) {
                                for (int var71 = 1; var71 < 8; var71++) {
                                    class75.field994[var65][var66 + var71][var67] = class75.field994[var65][var66 + var71][var67 - 1];
                                }
                            }
                            if (var66 > 0 && class75.field994[var65][var66 - 1][var67] != 0) {
                                class75.field994[var65][var66][var67] = class75.field994[var65][var66 - 1][var67];
                            } else if (var67 > 0 && class75.field994[var65][var66][var67 - 1] != 0) {
                                class75.field994[var65][var66][var67] = class75.field994[var65][var66][var67 - 1];
                            } else if (var66 > 0 && var67 > 0 && class75.field994[var65][var66 - 1][var67 - 1] != 0) {
                                class75.field994[var65][var66][var67] = class75.field994[var65][var66 - 1][var67 - 1];
                            }
                        }
                    }
                }
            }
            for (int var72 = 0; var72 < 13; var72++) {
                for (int var73 = 0; var73 < 13; var73++) {
                    int var74 = field606[0][var72][var73];
                    if (var74 == -1) {
                        class75.method579(var72 * 8, var73 * 8, 8, 8);
                    }
                }
            }
            method1984(true);
            for (int var75 = 0; var75 < 4; var75++) {
                method5739();
                for (int var76 = 0; var76 < 13; var76++) {
                    label1007: for (int var77 = 0; var77 < 13; var77++) {
                        int var78 = field606[var75][var76][var77];
                        if (var78 != -1) {
                            int var79 = var78 >> 24 & 0x3;
                            int var80 = var78 >> 1 & 0x3;
                            int var81 = var78 >> 14 & 0x3FF;
                            int var82 = var78 >> 3 & 0x7FF;
                            int var83 = (var81 / 8 << 8) + var82 / 8;
                            for (int var84 = 0; var84 < Statics.field1480.length; var84++) {
                                if (Statics.field1480[var84] == var83 && Statics.field773[var84] != null) {
                                    byte[] var85 = Statics.field773[var84];
                                    int var86 = var76 * 8;
                                    int var87 = var77 * 8;
                                    int var88 = (var81 & 0x7) * 8;
                                    int var89 = (var82 & 0x7) * 8;
                                    class213 var90 = Statics.field3027;
                                    class173[] var91 = field712;
                                    class401 var92 = new class401(var85);
                                    int var93 = -1;
                                    while (true) {
                                        int var94 = var92.method6413();
                                        if (var94 == 0) {
                                            continue label1007;
                                        }
                                        var93 += var94;
                                        int var95 = 0;
                                        while (true) {
                                            int var96 = var92.method6286();
                                            if (var96 == 0) {
                                                break;
                                            }
                                            var95 += var96 - 1;
                                            int var97 = var95 & 0x3F;
                                            int var98 = var95 >> 6 & 0x3F;
                                            int var99 = var95 >> 12;
                                            int var100 = var92.method6272();
                                            int var101 = var100 >> 2;
                                            int var102 = var100 & 0x3;
                                            if (var79 == var99 && var98 >= var88 && var98 < var88 + 8 && var97 >= var89 && var97 < var89 + 8) {
                                                class169 var103 = class169.method4277(var93);
                                                int var105 = var98 & 0x7;
                                                int var106 = var97 & 0x7;
                                                int var108 = var103.field1845;
                                                int var109 = var103.field1829;
                                                if ((var102 & 0x1) == 1) {
                                                    int var110 = var108;
                                                    var108 = var109;
                                                    var109 = var110;
                                                }
                                                int var111 = var80 & 0x3;
                                                int var112;
                                                if (var111 == 0) {
                                                    var112 = var105;
                                                } else if (var111 == 1) {
                                                    var112 = var106;
                                                } else if (var111 == 2) {
                                                    var112 = 7 - var105 - (var108 - 1);
                                                } else {
                                                    var112 = 7 - var106 - (var109 - 1);
                                                }
                                                int var113 = var86 + var112;
                                                int var115 = var98 & 0x7;
                                                int var116 = var97 & 0x7;
                                                int var118 = var103.field1845;
                                                int var119 = var103.field1829;
                                                if ((var102 & 0x1) == 1) {
                                                    int var120 = var118;
                                                    var118 = var119;
                                                    var119 = var120;
                                                }
                                                int var121 = var80 & 0x3;
                                                int var122;
                                                if (var121 == 0) {
                                                    var122 = var116;
                                                } else if (var121 == 1) {
                                                    var122 = 7 - var115 - (var118 - 1);
                                                } else if (var121 == 2) {
                                                    var122 = 7 - var116 - (var119 - 1);
                                                } else {
                                                    var122 = var115;
                                                }
                                                int var123 = var87 + var122;
                                                if (var113 > 0 && var123 > 0 && var113 < 103 && var123 < 103) {
                                                    int var124 = var75;
                                                    if ((class75.field978[1][var113][var123] & 0x2) == 2) {
                                                        var124 = var75 - 1;
                                                    }
                                                    class173 var125 = null;
                                                    if (var124 >= 0) {
                                                        var125 = var91[var124];
                                                    }
                                                    class75.method61(var75, var113, var123, var93, var80 + var102 & 0x3, var101, var90, var125);
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
        method1984(true);
        method5739();
        class213 var126 = Statics.field3027;
        class173[] var127 = field712;
        for (int var128 = 0; var128 < 4; var128++) {
            for (int var129 = 0; var129 < 104; var129++) {
                for (int var130 = 0; var130 < 104; var130++) {
                    if ((class75.field978[var128][var129][var130] & 0x1) == 1) {
                        int var131 = var128;
                        if ((class75.field978[1][var129][var130] & 0x2) == 2) {
                            var131 = var128 - 1;
                        }
                        if (var131 >= 0) {
                            var127[var131].method3130(var129, var130);
                        }
                    }
                }
            }
        }
        class75.field991 += (int) (Math.random() * 5.0D) - 2;
        if (class75.field991 < -8) {
            class75.field991 = -8;
        }
        if (class75.field991 > 8) {
            class75.field991 = 8;
        }
        class75.field993 += (int) (Math.random() * 5.0D) - 2;
        if (class75.field993 < -16) {
            class75.field993 = -16;
        }
        if (class75.field993 > 16) {
            class75.field993 = 16;
        }
        for (int var132 = 0; var132 < 4; var132++) {
            byte[][] var133 = Statics.field3324[var132];
            int var134 = (int) Math.sqrt(5100.0D);
            int var135 = var134 * 768 >> 8;
            for (int var136 = 1; var136 < 103; var136++) {
                for (int var137 = 1; var137 < 103; var137++) {
                    int var138 = class75.field994[var132][var137 + 1][var136] - class75.field994[var132][var137 - 1][var136];
                    int var139 = class75.field994[var132][var137][var136 + 1] - class75.field994[var132][var137][var136 - 1];
                    int var140 = (int) Math.sqrt((double) (var139 * var139 + var138 * var138 + 65536));
                    int var141 = (var138 << 8) / var140;
                    int var142 = 65536 / var140;
                    int var143 = (var139 << 8) / var140;
                    int var144 = (var143 * -50 + var141 * -50 + var142 * -10) / var135 + 96;
                    int var145 = (var133[var137][var136] >> 1) + (var133[var137][var136 + 1] >> 3) + (var133[var137][var136 - 1] >> 2) + (var133[var137 - 1][var136] >> 2) + (var133[var137 + 1][var136] >> 3);
                    Statics.field982[var137][var136] = var144 - var145;
                }
            }
            for (int var146 = 0; var146 < 104; var146++) {
                Statics.field63[var146] = 0;
                Statics.field990[var146] = 0;
                Statics.field984[var146] = 0;
                Statics.field771[var146] = 0;
                Statics.field985[var146] = 0;
            }
            for (int var147 = -5; var147 < 109; var147++) {
                for (int var148 = 0; var148 < 104; var148++) {
                    int var149 = var147 + 5;
                    int var10002;
                    if (var149 >= 0 && var149 < 104) {
                        int var150 = Statics.field977[var132][var149][var148] & 0xFF;
                        if (var150 > 0) {
                            class164 var151 = class164.method2118(var150 - 1);
                            Statics.field63[var148] += var151.field1771;
                            Statics.field990[var148] += var151.field1775;
                            Statics.field984[var148] += var151.field1774;
                            Statics.field771[var148] += var151.field1777;
                            var10002 = Statics.field985[var148]++;
                        }
                    }
                    int var152 = var147 - 5;
                    if (var152 >= 0 && var152 < 104) {
                        int var153 = Statics.field977[var132][var152][var148] & 0xFF;
                        if (var153 > 0) {
                            class164 var154 = class164.method2118(var153 - 1);
                            Statics.field63[var148] -= var154.field1771;
                            Statics.field990[var148] -= var154.field1775;
                            Statics.field984[var148] -= var154.field1774;
                            Statics.field771[var148] -= var154.field1777;
                            var10002 = Statics.field985[var148]--;
                        }
                    }
                }
                if (var147 >= 1 && var147 < 103) {
                    int var155 = 0;
                    int var156 = 0;
                    int var157 = 0;
                    int var158 = 0;
                    int var159 = 0;
                    for (int var160 = -5; var160 < 109; var160++) {
                        int var161 = var160 + 5;
                        if (var161 >= 0 && var161 < 104) {
                            var155 += Statics.field63[var161];
                            var156 += Statics.field990[var161];
                            var157 += Statics.field984[var161];
                            var158 += Statics.field771[var161];
                            var159 += Statics.field985[var161];
                        }
                        int var162 = var160 - 5;
                        if (var162 >= 0 && var162 < 104) {
                            var155 -= Statics.field63[var162];
                            var156 -= Statics.field990[var162];
                            var157 -= Statics.field984[var162];
                            var158 -= Statics.field771[var162];
                            var159 -= Statics.field985[var162];
                        }
                        if (var160 >= 1 && var160 < 103 && (!field569 || (class75.field978[0][var147][var160] & 0x2) != 0 || (class75.field978[var132][var147][var160] & 0x10) == 0)) {
                            if (var132 < class75.field979) {
                                class75.field979 = var132;
                            }
                            int var163 = Statics.field977[var132][var147][var160] & 0xFF;
                            int var164 = Statics.field983[var132][var147][var160] & 0xFF;
                            if (var163 > 0 || var164 > 0) {
                                int var165 = class75.field994[var132][var147][var160];
                                int var166 = class75.field994[var132][var147 + 1][var160];
                                int var167 = class75.field994[var132][var147 + 1][var160 + 1];
                                int var168 = class75.field994[var132][var147][var160 + 1];
                                int var169 = Statics.field982[var147][var160];
                                int var170 = Statics.field982[var147 + 1][var160];
                                int var171 = Statics.field982[var147 + 1][var160 + 1];
                                int var172 = Statics.field982[var147][var160 + 1];
                                int var173 = -1;
                                int var174 = -1;
                                if (var163 > 0) {
                                    int var175 = var155 * 256 / var158;
                                    int var176 = var156 / var159;
                                    int var177 = var157 / var159;
                                    var173 = class75.method2801(var175, var176, var177);
                                    int var178 = class75.field991 + var175 & 0xFF;
                                    int var179 = class75.field993 + var177;
                                    if (var179 < 0) {
                                        var179 = 0;
                                    } else if (var179 > 255) {
                                        var179 = 255;
                                    }
                                    var174 = class75.method2801(var178, var176, var179);
                                }
                                if (var132 > 0) {
                                    boolean var180 = true;
                                    if (var163 == 0 && Statics.field84[var132][var147][var160] != 0) {
                                        var180 = false;
                                    }
                                    if (var164 > 0) {
                                        int var181 = var164 - 1;
                                        class171 var182 = (class171) class171.field1933.method4223((long) var181);
                                        class171 var183;
                                        if (var182 == null) {
                                            byte[] var184 = Statics.field1943.method4756(4, var181);
                                            class171 var185 = new class171();
                                            if (var184 != null) {
                                                var185.method3089(new class401(var184), var181);
                                            }
                                            var185.method3074();
                                            class171.field1933.method4225(var185, (long) var181);
                                            var183 = var185;
                                        } else {
                                            var183 = var182;
                                        }
                                        if (!var183.field1941) {
                                            var180 = false;
                                        }
                                    }
                                    if (var180 && var165 == var166 && var165 == var167 && var165 == var168) {
                                        Statics.field3204[var132][var147][var160] |= 0x924;
                                    }
                                }
                                int var186 = 0;
                                if (var174 != -1) {
                                    var186 = class211.field2350[class75.method2486(var174, 96)];
                                }
                                if (var164 == 0) {
                                    var126.method3966(var132, var147, var160, 0, 0, -1, var165, var166, var167, var168, class75.method2486(var173, var169), class75.method2486(var173, var170), class75.method2486(var173, var171), class75.method2486(var173, var172), 0, 0, 0, 0, var186, 0);
                                } else {
                                    int var187 = Statics.field84[var132][var147][var160] + 1;
                                    byte var188 = Statics.field3761[var132][var147][var160];
                                    int var189 = var164 - 1;
                                    class171 var190 = (class171) class171.field1933.method4223((long) var189);
                                    class171 var191;
                                    if (var190 == null) {
                                        byte[] var192 = Statics.field1943.method4756(4, var189);
                                        class171 var193 = new class171();
                                        if (var192 != null) {
                                            var193.method3089(new class401(var192), var189);
                                        }
                                        var193.method3074();
                                        class171.field1933.method4225(var193, (long) var189);
                                        var191 = var193;
                                    } else {
                                        var191 = var190;
                                    }
                                    int var195 = var191.field1935;
                                    int var196;
                                    int var197;
                                    if (var195 >= 0) {
                                        var196 = Statics.field2346.method4043(var195);
                                        var197 = -1;
                                    } else if (var191.field1934 == 16711935) {
                                        var197 = -2;
                                        var195 = -1;
                                        var196 = -2;
                                    } else {
                                        var197 = class75.method2801(var191.field1938, var191.field1944, var191.field1939);
                                        int var198 = class75.field991 + var191.field1938 & 0xFF;
                                        int var199 = class75.field993 + var191.field1939;
                                        if (var199 < 0) {
                                            var199 = 0;
                                        } else if (var199 > 255) {
                                            var199 = 255;
                                        }
                                        var196 = class75.method2801(var198, var191.field1944, var199);
                                    }
                                    int var200 = 0;
                                    if (var196 != -2) {
                                        var200 = class211.field2350[class75.method605(var196, 96)];
                                    }
                                    if (var191.field1942 != -1) {
                                        int var201 = class75.field991 + var191.field1937 & 0xFF;
                                        int var202 = class75.field993 + var191.field1936;
                                        if (var202 < 0) {
                                            var202 = 0;
                                        } else if (var202 > 255) {
                                            var202 = 255;
                                        }
                                        int var203 = class75.method2801(var201, var191.field1940, var202);
                                        var200 = class211.field2350[class75.method605(var203, 96)];
                                    }
                                    var126.method3966(var132, var147, var160, var187, var188, var195, var165, var166, var167, var168, class75.method2486(var173, var169), class75.method2486(var173, var170), class75.method2486(var173, var171), class75.method2486(var173, var172), class75.method605(var197, var169), class75.method605(var197, var170), class75.method605(var197, var171), class75.method605(var197, var172), var186, var200);
                                }
                            }
                        }
                    }
                }
            }
            for (int var204 = 1; var204 < 103; var204++) {
                for (int var205 = 1; var205 < 103; var205++) {
                    int var210;
                    if ((class75.field978[var132][var205][var204] & 0x8) != 0) {
                        var210 = 0;
                    } else if (var132 <= 0 || (class75.field978[1][var205][var204] & 0x2) == 0) {
                        var210 = var132;
                    } else {
                        var210 = var132 - 1;
                    }
                    var126.method3829(var132, var205, var204, var210);
                }
            }
            Statics.field977[var132] = (byte[][]) null;
            Statics.field983[var132] = (byte[][]) null;
            Statics.field84[var132] = (byte[][]) null;
            Statics.field3761[var132] = (byte[][]) null;
            Statics.field3324[var132] = (byte[][]) null;
        }
        var126.method3855(-50, -10, -50);
        for (int var211 = 0; var211 < 104; var211++) {
            for (int var212 = 0; var212 < 104; var212++) {
                if ((class75.field978[1][var211][var212] & 0x2) == 2) {
                    var126.method3981(var211, var212);
                }
            }
        }
        int var213 = 1;
        int var214 = 2;
        int var215 = 4;
        for (int var216 = 0; var216 < 4; var216++) {
            if (var216 > 0) {
                var213 <<= 0x3;
                var214 <<= 0x3;
                var215 <<= 0x3;
            }
            for (int var217 = 0; var217 <= var216; var217++) {
                for (int var218 = 0; var218 <= 104; var218++) {
                    for (int var219 = 0; var219 <= 104; var219++) {
                        if ((Statics.field3204[var217][var219][var218] & var213) != 0) {
                            int var220 = var218;
                            int var221 = var218;
                            int var222 = var217;
                            int var223 = var217;
                            while (var220 > 0 && (Statics.field3204[var217][var219][var220 - 1] & var213) != 0) {
                                var220--;
                            }
                            while (var221 < 104 && (Statics.field3204[var217][var219][var221 + 1] & var213) != 0) {
                                var221++;
                            }
                            label735: while (var222 > 0) {
                                for (int var224 = var220; var224 <= var221; var224++) {
                                    if ((Statics.field3204[var222 - 1][var219][var224] & var213) == 0) {
                                        break label735;
                                    }
                                }
                                var222--;
                            }
                            label724: while (var223 < var216) {
                                for (int var225 = var220; var225 <= var221; var225++) {
                                    if ((Statics.field3204[var223 + 1][var219][var225] & var213) == 0) {
                                        break label724;
                                    }
                                }
                                var223++;
                            }
                            int var226 = (var223 + 1 - var222) * (var221 - var220 + 1);
                            if (var226 >= 8) {
                                short var227 = 240;
                                int var228 = class75.field994[var223][var219][var220] - var227;
                                int var229 = class75.field994[var222][var219][var220];
                                class213.method3828(var216, 1, var219 * 128, var219 * 128, var220 * 128, var221 * 128 + 128, var228, var229);
                                for (int var230 = var222; var230 <= var223; var230++) {
                                    for (int var231 = var220; var231 <= var221; var231++) {
                                        Statics.field3204[var230][var219][var231] &= ~var213;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3204[var217][var219][var218] & var214) != 0) {
                            int var232 = var219;
                            int var233 = var219;
                            int var234 = var217;
                            int var235 = var217;
                            while (var232 > 0 && (Statics.field3204[var217][var232 - 1][var218] & var214) != 0) {
                                var232--;
                            }
                            while (var233 < 104 && (Statics.field3204[var217][var233 + 1][var218] & var214) != 0) {
                                var233++;
                            }
                            label788: while (var234 > 0) {
                                for (int var236 = var232; var236 <= var233; var236++) {
                                    if ((Statics.field3204[var234 - 1][var236][var218] & var214) == 0) {
                                        break label788;
                                    }
                                }
                                var234--;
                            }
                            label777: while (var235 < var216) {
                                for (int var237 = var232; var237 <= var233; var237++) {
                                    if ((Statics.field3204[var235 + 1][var237][var218] & var214) == 0) {
                                        break label777;
                                    }
                                }
                                var235++;
                            }
                            int var238 = (var235 + 1 - var234) * (var233 - var232 + 1);
                            if (var238 >= 8) {
                                short var239 = 240;
                                int var240 = class75.field994[var235][var232][var218] - var239;
                                int var241 = class75.field994[var234][var232][var218];
                                class213.method3828(var216, 2, var232 * 128, var233 * 128 + 128, var218 * 128, var218 * 128, var240, var241);
                                for (int var242 = var234; var242 <= var235; var242++) {
                                    for (int var243 = var232; var243 <= var233; var243++) {
                                        Statics.field3204[var242][var243][var218] &= ~var214;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3204[var217][var219][var218] & var215) != 0) {
                            int var244 = var219;
                            int var245 = var219;
                            int var246 = var218;
                            int var247 = var218;
                            while (var246 > 0 && (Statics.field3204[var217][var219][var246 - 1] & var215) != 0) {
                                var246--;
                            }
                            while (var247 < 104 && (Statics.field3204[var217][var219][var247 + 1] & var215) != 0) {
                                var247++;
                            }
                            label841: while (var244 > 0) {
                                for (int var248 = var246; var248 <= var247; var248++) {
                                    if ((Statics.field3204[var217][var244 - 1][var248] & var215) == 0) {
                                        break label841;
                                    }
                                }
                                var244--;
                            }
                            label830: while (var245 < 104) {
                                for (int var249 = var246; var249 <= var247; var249++) {
                                    if ((Statics.field3204[var217][var245 + 1][var249] & var215) == 0) {
                                        break label830;
                                    }
                                }
                                var245++;
                            }
                            if ((var245 - var244 + 1) * (var247 - var246 + 1) >= 4) {
                                int var250 = class75.field994[var217][var244][var246];
                                class213.method3828(var216, 4, var244 * 128, var245 * 128 + 128, var246 * 128, var247 * 128 + 128, var250, var250);
                                for (int var251 = var244; var251 <= var245; var251++) {
                                    for (int var252 = var246; var252 <= var247; var252++) {
                                        Statics.field3204[var217][var251][var252] &= ~var215;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method1984(true);
        int var253 = class75.field979;
        if (var253 > Statics.field2592) {
            var253 = Statics.field2592;
        }
        if (var253 < Statics.field2592 - 1) {
            int var254 = Statics.field2592 - 1;
        }
        if (field569) {
            Statics.field3027.method3826(class75.field979);
        } else {
            Statics.field3027.method3826(0);
        }
        for (int var255 = 0; var255 < 104; var255++) {
            for (int var256 = 0; var256 < 104; var256++) {
                Statics.method2063(var255, var256);
            }
        }
        method5739();
        for (class84 var257 = (class84) field708.method5035(); var257 != null; var257 = (class84) field708.method5022()) {
            if (var257.field1094 == -1) {
                var257.field1101 = 0;
                method1880(var257);
            } else {
                var257.method5775();
            }
        }
        class169.field1825.method4226();
        if (Statics.field107.method471()) {
            class242 var258 = class242.method2075(class240.field2724, field639.field1287);
            var258.field2780.method6258(1057001181);
            field639.method2246(var258);
        }
        if (!field767) {
            int var259 = (Statics.field1672 - 6) / 8;
            int var260 = (Statics.field1672 + 6) / 8;
            int var261 = (Statics.field2054 - 6) / 8;
            int var262 = (Statics.field2054 + 6) / 8;
            for (int var263 = var259 - 1; var263 <= var260 + 1; var263++) {
                for (int var264 = var261 - 1; var264 <= var262 + 1; var264++) {
                    if (var263 < var259 || var263 > var260 || var264 < var261 || var264 > var262) {
                        Statics.field478.method4839("m" + var263 + "_" + var264);
                        Statics.field478.method4839("l" + var263 + "_" + var264);
                    }
                }
            }
        }
        method5605(30);
        method5739();
        class75.method1945();
        class242 var265 = class242.method2075(class240.field2681, field639.field1287);
        field639.method2246(var265);
        Statics.field2893.method2542();
        for (int var266 = 0; var266 < 32; var266++) {
            field210[var266] = 0L;
        }
        for (int var267 = 0; var267 < 32; var267++) {
            field193[var267] = 0L;
        }
        Statics.field182 = 0;
    }

    @ObfuscatedName("gj.gv(II)V")
    public static final void method3515(int arg0) {
        int[] var1 = Statics.field62.field4385;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class75.field978[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3027.method3940(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class75.field978[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3027.method3940(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field62.method6650();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class75.field978[arg0][var10][var9] & 0x18) == 0) {
                    method2536(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class75.field978[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2536(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field724 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field3027.method3958(Statics.field2592, var11, var12);
                if (var13 != 0L) {
                    int var15 = class221.method1972(var13);
                    int var16 = class169.method4277(var15).field1850;
                    if (var16 >= 0 && class154.method156(var16).field1635) {
                        field542[field724] = class154.method156(var16).method2654(false);
                        field725[field724] = var11;
                        field726[field724] = var12;
                        field724++;
                    }
                }
            }
        }
        Statics.field2895.method6622();
    }

    @ObfuscatedName("er.gc(IIIIII)V")
    public static final void method2536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3027.method3850(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3027.method3854(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class221.method57(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field62.field4385;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class221.method1972(var5);
            class169 var14 = class169.method4277(var13);
            if (var14.field1851 == -1) {
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
                class413 var15 = Statics.field3740[var14.field1851];
                if (var15 != null) {
                    int var16 = (var14.field1845 * 4 - var15.field4373) / 2;
                    int var17 = (var14.field1829 * 4 - var15.field4375) / 2;
                    var15.method6629(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field1829) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3027.method3925(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3027.method3854(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class221.method1972(var18);
            class169 var24 = class169.method4277(var23);
            if (var24.field1851 != -1) {
                class413 var25 = Statics.field3740[var24.field1851];
                if (var25 != null) {
                    int var26 = (var24.field1845 * 4 - var25.field4373) / 2;
                    int var27 = (var24.field1829 * 4 - var25.field4375) / 2;
                    var25.method6629(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field1829) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class221.method57(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field62.field4385;
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
        long var31 = Statics.field3027.method3958(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class221.method1972(var31);
        class169 var34 = class169.method4277(var33);
        if (var34.field1851 == -1) {
            return;
        }
        class413 var35 = Statics.field3740[var34.field1851];
        if (var35 != null) {
            int var36 = (var34.field1845 * 4 - var35.field4373) / 2;
            int var37 = (var34.field1829 * 4 - var35.field4375) / 2;
            var35.method6629(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field1829) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hj(Lcc;I)Z")
    public final boolean method1223(class99 arg0) {
        class344 var2 = arg0.method2251();
        class400 var3 = arg0.field1295;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1288 == null) {
                if (arg0.field1290) {
                    if (!var2.method2592(1)) {
                        return false;
                    }
                    var2.method2588(arg0.field1295.field4294, 0, 1);
                    arg0.field1291 = 0;
                    arg0.field1290 = false;
                }
                var3.field4292 = 0;
                if (var3.method6224()) {
                    if (!var2.method2592(1)) {
                        return false;
                    }
                    var2.method2588(arg0.field1295.field4294, 1, 1);
                    arg0.field1291 = 0;
                }
                arg0.field1290 = true;
                class243[] var4 = Statics.method4184();
                int var5 = var3.method6217();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4292);
                }
                arg0.field1288 = var4[var5];
                arg0.field1293 = arg0.field1288.field2884;
            }
            if (arg0.field1293 == -1) {
                if (!var2.method2592(1)) {
                    return false;
                }
                arg0.method2251().method2588(var3.field4294, 0, 1);
                arg0.field1293 = var3.field4294[0] & 0xFF;
            }
            if (arg0.field1293 == -2) {
                if (!var2.method2592(2)) {
                    return false;
                }
                arg0.method2251().method2588(var3.field4294, 0, 2);
                var3.field4292 = 0;
                arg0.field1293 = var3.method6284();
            }
            if (!var2.method2592(arg0.field1293)) {
                return false;
            }
            var3.field4292 = 0;
            var2.method2588(var3.field4294, 0, arg0.field1293);
            arg0.field1291 = 0;
            field549.method5409();
            arg0.field1289 = arg0.field1294;
            arg0.field1294 = arg0.field1282;
            arg0.field1282 = arg0.field1288;
            if (class243.field2863 == arg0.field1288) {
                int var6 = var3.method6320();
                class262 var7 = class262.method2058(var6);
                for (int var8 = 0; var8 < var7.field3176.length; var8++) {
                    var7.field3176[var8] = -1;
                    var7.field3176[var8] = 0;
                }
                method204(var7);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2810 == arg0.field1288) {
                method4851();
                byte var9 = var3.method6273();
                if (arg0.field1293 == 1) {
                    if (var9 >= 0) {
                        field721[var9] = null;
                    } else {
                        Statics.field1373 = null;
                    }
                    arg0.field1288 = null;
                    return true;
                }
                if (var9 >= 0) {
                    field721[var9] = new class128(var3);
                } else {
                    Statics.field1373 = new class128(var3);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2882 == arg0.field1288) {
                field595 = field689;
                byte var10 = var3.method6273();
                class134 var11 = new class134(var3);
                class137 var12;
                if (var10 >= 0) {
                    var12 = field722[var10];
                } else {
                    var12 = Statics.field3746;
                }
                var11.method2500(var12);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2848 == arg0.field1288) {
                boolean var13 = var3.method6272() == 1;
                if (var13) {
                    Statics.field1396 = class398.method2299() - var3.method6275();
                    Statics.field21 = new class292(var3, true);
                } else {
                    Statics.field21 = null;
                }
                field490 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2845 == arg0.field1288) {
                int var14 = var3.method6309();
                int var15 = var3.method6321();
                int var16 = var14 >> 10 & 0x1F;
                int var17 = var14 >> 5 & 0x1F;
                int var18 = var14 & 0x1F;
                int var19 = (var18 << 3) + (var16 << 19) + (var17 << 11);
                class262 var20 = class262.method2058(var15);
                if (var20.field3073 != var19) {
                    var20.field3073 = var19;
                    method204(var20);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2862 == arg0.field1288) {
                byte[] var21 = new byte[arg0.field1293];
                var3.method6229(var21, 0, var21.length);
                class401 var22 = new class401(var21);
                String var23 = var22.method6474();
                class30.method2095(var23, true, false);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2821 == arg0.field1288) {
                int var24 = var3.method6435();
                int var25 = var3.method6303();
                int var26 = var3.method6252();
                class80 var27 = (class80) field652.method6061((long) var26);
                if (var27 != null) {
                    method3192(var27, var27.field1034 != var24);
                }
                method20(var26, var24, var25);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2803 == arg0.field1288) {
                method4908(var3.method6474());
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2795 == arg0.field1288) {
                int var28 = var3.method6321();
                int var29 = var3.method6309();
                int var30 = var3.method6284();
                int var31 = var3.method6435();
                class262 var32 = class262.method2058(var28);
                if (var32.field3099 != var31 || var32.field3069 != var30 || var32.field3102 != var29) {
                    var32.field3099 = var31;
                    var32.field3069 = var30;
                    var32.field3102 = var29;
                    method204(var32);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2866 == arg0.field1288) {
                int var33 = var3.method6321();
                int var34 = var3.method6313();
                int var35 = var3.method6312();
                class262 var36 = class262.method2058(var33);
                if (var36.field3057 != var35 || var36.field3058 != var34 || var36.field3053 != 0 || var36.field3054 != 0) {
                    var36.field3057 = var35;
                    var36.field3058 = var34;
                    var36.field3053 = 0;
                    var36.field3054 = 0;
                    method204(var36);
                    this.method1483(var36);
                    if (var36.field3146 == 0) {
                        method2566(Statics.field3153[var33 >> 16], var36, false);
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2854 == arg0.field1288) {
                method2392();
                int var37 = var3.method6303();
                int var38 = var3.method6302();
                int var39 = var3.method6252();
                field625[var37] = var39;
                field623[var37] = var38;
                field624[var37] = 1;
                for (int var40 = 0; var40 < 98; var40++) {
                    if (var39 >= class272.field3254[var40]) {
                        field624[var37] = var40 + 2;
                    }
                }
                field762[++field717 - 1 & 0x1F] = var37;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2816 == arg0.field1288) {
                method3310(true, arg0.field1295);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2829 == arg0.field1288) {
                if (arg0.field1293 == 0) {
                    Statics.field3205 = null;
                } else {
                    if (Statics.field3205 == null) {
                        Statics.field3205 = new class334(Statics.field2137, Statics.field107);
                    }
                    Statics.field3205.method5467(var3);
                }
                method4724();
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2865 == arg0.field1288) {
                String var41 = var3.method6474();
                long var42 = var3.method6275();
                long var44 = (long) var3.method6284();
                long var46 = (long) var3.method6276();
                class285 var48 = (class285) class304.method2484(class285.method277(), var3.method6272());
                long var49 = (var44 << 32) + var46;
                boolean var51 = false;
                for (int var52 = 0; var52 < 100; var52++) {
                    if (field715[var52] == var49) {
                        var51 = true;
                        break;
                    }
                }
                if (var48.field3664 && Statics.field464.method1569(new class422(var41, Statics.field2137))) {
                    var51 = true;
                }
                if (!var51 && field560 == 0) {
                    field715[field716] = var49;
                    field716 = (field716 + 1) % 100;
                    String var53 = class316.method5205(class319.method1934(class265.method1862(var3)));
                    if (var48.field3665 == -1) {
                        class98.method2182(9, var41, var53, class321.method3732(var42));
                    } else {
                        class98.method2182(9, class92.method1003(var48.field3665) + var41, var53, class321.method3732(var42));
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2846 == arg0.field1288) {
                method2734(class241.field2774);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2825 == arg0.field1288) {
                boolean var54 = var3.method6483();
                if (!var54) {
                    Statics.field3166 = null;
                } else if (Statics.field3166 == null) {
                    Statics.field3166 = new class301();
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2800 == arg0.field1288) {
                String var55 = var3.method6474();
                int var56 = var3.method6277();
                class262 var57 = class262.method2058(var56);
                if (!var55.equals(var57.field3109)) {
                    var57.field3109 = var55;
                    method204(var57);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2811 == arg0.field1288) {
                Statics.field3014 = null;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2840 == arg0.field1288) {
                String var58 = var3.method6474();
                String var59 = class316.method5205(class319.method1934(class265.method1862(var3)));
                class98.method5671(6, var58, var59);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2842 == arg0.field1288) {
                Statics.field1314 = var3.method6303();
                Statics.field1623 = var3.method6302();
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2860 == arg0.field1288) {
                for (int var60 = 0; var60 < class257.field3009.length; var60++) {
                    if (class257.field3009[var60] != class257.field3007[var60]) {
                        class257.field3009[var60] = class257.field3007[var60];
                        method2617(var60);
                        field677[++field678 - 1 & 0x1F] = var60;
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2853 == arg0.field1288) {
                method2734(class241.field2773);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2830 == arg0.field1288) {
                if (Statics.field3205 != null) {
                    Statics.field3205.method5465(var3);
                }
                method4724();
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2788 == arg0.field1288) {
                Statics.field1314 = var3.method6302();
                Statics.field1623 = var3.method6272();
                for (int var61 = Statics.field1314; var61 < Statics.field1314 + 8; var61++) {
                    for (int var62 = Statics.field1623; var62 < Statics.field1623 + 8; var62++) {
                        if (field619[Statics.field2592][var61][var62] != null) {
                            field619[Statics.field2592][var61][var62] = null;
                            Statics.method2063(var61, var62);
                        }
                    }
                }
                for (class84 var63 = (class84) field708.method5035(); var63 != null; var63 = (class84) field708.method5022()) {
                    if (var63.field1093 >= Statics.field1314 && var63.field1093 < Statics.field1314 + 8 && var63.field1103 >= Statics.field1623 && var63.field1103 < Statics.field1623 + 8 && Statics.field2592 == var63.field1091) {
                        var63.field1094 = 0;
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2867 == arg0.field1288) {
                var3.field4292 += 28;
                if (var3.method6348()) {
                    method2393(var3, var3.field4292 - 28);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2798 == arg0.field1288) {
                int var64 = var3.method6310();
                field718 = var64;
                this.method1063(false);
                method261(var64);
                class64.method3643(field718);
                for (int var65 = 0; var65 < 100; var65++) {
                    field711[var65] = true;
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2814 == arg0.field1288) {
                field690 = false;
                for (int var66 = 0; var66 < 5; var66++) {
                    field740[var66] = false;
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2880 == arg0.field1288) {
                int var67 = var3.method6286();
                boolean var68 = var3.method6272() == 1;
                String var69 = "";
                boolean var70 = false;
                if (var68) {
                    var69 = var3.method6474();
                    if (Statics.field464.method1569(new class422(var69, Statics.field2137))) {
                        var70 = true;
                    }
                }
                String var71 = var3.method6474();
                if (!var70) {
                    class98.method5671(var67, var69, var71);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2870 == arg0.field1288) {
                Statics.field464.field794.method5447(var3, arg0.field1293);
                method4182();
                field686 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2874 == arg0.field1288) {
                class61 var72 = new class61();
                var72.field785 = var3.method6474();
                var72.field790 = var3.method6284();
                int var73 = var3.method6277();
                var72.field781 = var73;
                method5605(45);
                var2.method2615();
                Object var74 = null;
                Statics.method1560(var72);
                arg0.field1288 = null;
                return false;
            }
            if (class243.field2802 == arg0.field1288) {
                Statics.field464.method1564();
                field686 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2836 == arg0.field1288) {
                byte var75 = var3.method6273();
                int var76 = var3.method6309();
                class257.field3007[var76] = var75;
                if (class257.field3009[var76] != var75) {
                    class257.field3009[var76] = var75;
                }
                method2617(var76);
                field677[++field678 - 1 & 0x1F] = var76;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2878 == arg0.field1288) {
                class55.method4654(var3, arg0.field1293);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2875 == arg0.field1288) {
                method2159();
                arg0.field1288 = null;
                return false;
            }
            if (class243.field2883 == arg0.field1288) {
                method2734(class241.field2768);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2831 == arg0.field1288) {
                method2734(class241.field2769);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2877 == arg0.field1288) {
                field501 = var3.method6309() * 30;
                field692 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2815 == arg0.field1288) {
                field690 = true;
                Statics.field1273 = var3.method6272();
                Statics.field775 = var3.method6272();
                Statics.field45 = var3.method6284();
                Statics.field1955 = var3.method6272();
                Statics.field3713 = var3.method6272();
                if (Statics.field3713 >= 100) {
                    int var77 = Statics.field1273 * 128 + 64;
                    int var78 = Statics.field775 * 128 + 64;
                    int var79 = method4391(var77, var78, Statics.field2592) - Statics.field45;
                    int var80 = var77 - Statics.field154;
                    int var81 = var79 - Statics.field81;
                    int var82 = var78 - Statics.field1620;
                    int var83 = (int) Math.sqrt((double) (var80 * var80 + var82 * var82));
                    Statics.field2026 = (int) (Math.atan2((double) var81, (double) var83) * 325.949D) & 0x7FF;
                    Statics.field1173 = (int) (Math.atan2((double) var80, (double) var82) * -325.949D) & 0x7FF;
                    if (Statics.field2026 < 128) {
                        Statics.field2026 = 128;
                    }
                    if (Statics.field2026 > 383) {
                        Statics.field2026 = 383;
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2868 == arg0.field1288) {
                int var84 = var3.method6435();
                int var85 = var3.method6277();
                class262 var86 = class262.method2058(var85);
                if (var86.field3091 != 1 || var86.field3178 != var84) {
                    var86.field3091 = 1;
                    var86.field3178 = var84;
                    method204(var86);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2850 == arg0.field1288) {
                method3310(false, arg0.field1295);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2792 == arg0.field1288) {
                Statics.field3014 = new class354(Statics.field2030);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2876 == arg0.field1288) {
                method2392();
                field658 = var3.method6272();
                field692 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2805 == arg0.field1288) {
                int var87 = var3.method6321();
                int var88 = var3.method6320();
                int var89 = var3.method6284();
                if (var89 == 65535) {
                    var89 = -1;
                }
                class262 var90 = class262.method2058(var88);
                if (var90.field3125) {
                    var90.field3096 = var89;
                    var90.field3066 = var87;
                    class170 var92 = class170.method2099(var89);
                    var90.field3099 = var92.field1921;
                    var90.field3069 = var92.field1894;
                    var90.field3101 = var92.field1895;
                    var90.field3097 = var92.field1896;
                    var90.field3098 = var92.field1897;
                    var90.field3102 = var92.field1924;
                    if (var92.field1898 == 1) {
                        var90.field3070 = 1;
                    } else {
                        var90.field3070 = 2;
                    }
                    if (var90.field3103 > 0) {
                        var90.field3102 = var90.field3102 * 32 / var90.field3103;
                    } else if (var90.field3059 > 0) {
                        var90.field3102 = var90.field3102 * 32 / var90.field3059;
                    }
                    method204(var90);
                } else if (var89 == -1) {
                    var90.field3091 = 0;
                    arg0.field1288 = null;
                    return true;
                } else {
                    class170 var91 = class170.method2099(var89);
                    var90.field3091 = 4;
                    var90.field3178 = var89;
                    var90.field3099 = var91.field1921;
                    var90.field3069 = var91.field1894;
                    var90.field3102 = var91.field1924 * 100 / var87;
                    method204(var90);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2835 == arg0.field1288) {
                int var93 = var3.method6277();
                class80 var94 = (class80) field652.method6061((long) var93);
                if (var94 != null) {
                    method3192(var94, true);
                }
                if (field657 != null) {
                    method204(field657);
                    field657 = null;
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2873 == arg0.field1288) {
                method2734(class241.field2776);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2807 == arg0.field1288) {
                int var95 = var3.method6277();
                int var96 = var3.method6284();
                if (var95 < -70000) {
                    var96 += 32768;
                }
                class262 var97;
                if (var95 >= 0) {
                    var97 = class262.method2058(var95);
                } else {
                    var97 = null;
                }
                while (var3.field4292 < arg0.field1293) {
                    int var98 = var3.method6286();
                    int var99 = var3.method6284();
                    int var100 = 0;
                    if (var99 != 0) {
                        var100 = var3.method6272();
                        if (var100 == 255) {
                            var100 = var3.method6277();
                        }
                    }
                    if (var97 != null && var98 >= 0 && var98 < var97.field3176.length) {
                        var97.field3176[var98] = var99;
                        var97.field3177[var98] = var100;
                    }
                    class78.method1794(var96, var98, var99 - 1, var100);
                }
                if (var97 != null) {
                    method204(var97);
                }
                method2392();
                field679[++field680 - 1 & 0x1F] = var96 & 0x7FFF;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2799 == arg0.field1288) {
                method2734(class241.field2772);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2847 == arg0.field1288) {
                String var101 = var3.method6474();
                long var102 = (long) var3.method6284();
                long var104 = (long) var3.method6276();
                class285 var106 = (class285) class304.method2484(class285.method277(), var3.method6272());
                long var107 = (var102 << 32) + var104;
                boolean var109 = false;
                for (int var110 = 0; var110 < 100; var110++) {
                    if (field715[var110] == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (Statics.field464.method1569(new class422(var101, Statics.field2137))) {
                    var109 = true;
                }
                if (!var109 && field560 == 0) {
                    field715[field716] = var107;
                    field716 = (field716 + 1) % 100;
                    String var111 = class316.method5205(class319.method1934(class265.method1862(var3)));
                    byte var112;
                    if (var106.field3663) {
                        var112 = 7;
                    } else {
                        var112 = 3;
                    }
                    if (var106.field3665 == -1) {
                        class98.method5671(var112, var101, var111);
                    } else {
                        class98.method5671(var112, class92.method1003(var106.field3665) + var101, var111);
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2834 == arg0.field1288) {
                byte var113 = var3.method6273();
                long var114 = (long) var3.method6284();
                long var116 = (long) var3.method6276();
                long var118 = (var114 << 32) + var116;
                boolean var120 = false;
                class137 var121 = var113 >= 0 ? field722[var113] : Statics.field3746;
                if (var121 == null) {
                    var120 = true;
                } else {
                    for (int var122 = 0; var122 < 100; var122++) {
                        if (field715[var122] == var118) {
                            var120 = true;
                            break;
                        }
                    }
                }
                if (!var120) {
                    field715[field716] = var118;
                    field716 = (field716 + 1) % 100;
                    String var123 = class265.method1862(var3);
                    int var124 = var113 >= 0 ? 43 : 46;
                    class98.method2182(var124, "", var123, var121.field1517);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2793 == arg0.field1288) {
                int var125 = var3.method6277();
                int var126 = var3.method6277();
                int var127 = class32.method4023();
                class242 var128 = class242.method2075(class240.field2733, field639.field1287);
                var128.field2780.method6493(var127);
                var128.field2780.method6442(field185);
                var128.field2780.method6317(var125);
                var128.field2780.method6316(var126);
                field639.method2246(var128);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2838 == arg0.field1288) {
                if (Statics.field3014 == null) {
                    Statics.field3014 = new class354(Statics.field2030);
                }
                class409 var129 = Statics.field2030.method5730(var3);
                Statics.field3014.field4043.method6078(var129.field4355, var129.field4354);
                field683[++field684 - 1 & 0x1F] = var129.field4355;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2819 == arg0.field1288) {
                method2392();
                field659 = var3.method6308();
                field692 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2861 == arg0.field1288) {
                method178(true, var3);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2824 == arg0.field1288) {
                if (field718 != -1) {
                    method1967(field718, 0);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2844 == arg0.field1288) {
                int var130 = var3.method6321();
                int var131 = var3.method6310();
                class262 var132 = class262.method2058(var130);
                if (var132 != null && var132.field3146 == 0) {
                    if (var131 > var132.field3072 - var132.field3145) {
                        var131 = var132.field3072 - var132.field3145;
                    }
                    if (var131 < 0) {
                        var131 = 0;
                    }
                    if (var132.field3081 != var131) {
                        var132.field3081 = var131;
                        method204(var132);
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2806 == arg0.field1288) {
                Statics.field464.method1615(var3, arg0.field1293);
                field686 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2820 == arg0.field1288) {
                byte var133 = var3.method6273();
                String var134 = var3.method6474();
                long var135 = (long) var3.method6284();
                long var137 = (long) var3.method6276();
                class285 var139 = (class285) class304.method2484(class285.method277(), var3.method6272());
                long var140 = (var135 << 32) + var137;
                boolean var142 = false;
                Object var143 = null;
                class137 var144 = var133 >= 0 ? field722[var133] : Statics.field3746;
                if (var144 == null) {
                    var142 = true;
                } else {
                    int var145 = 0;
                    while (true) {
                        if (var145 >= 100) {
                            if (var139.field3664 && Statics.field464.method1569(new class422(var134, Statics.field2137))) {
                                var142 = true;
                            }
                            break;
                        }
                        if (field715[var145] == var140) {
                            var142 = true;
                            break;
                        }
                        var145++;
                    }
                }
                if (!var142) {
                    field715[field716] = var140;
                    field716 = (field716 + 1) % 100;
                    String var146 = class316.method5205(class265.method1862(var3));
                    int var147 = var133 >= 0 ? 41 : 44;
                    if (var139.field3665 == -1) {
                        class98.method2182(var147, var134, var146, var144.field1517);
                    } else {
                        class98.method2182(var147, class92.method1003(var139.field3665) + var134, var146, var144.field1517);
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2791 == arg0.field1288) {
                int var148 = var3.method6272();
                if (var3.method6272() == 0) {
                    field600[var148] = new class299();
                    var3.field4292 += 18;
                } else {
                    var3.field4292--;
                    field600[var148] = new class299(var3, false);
                }
                field578 = field689;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2817 == arg0.field1288) {
                field730 = var3.method6272();
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2827 == arg0.field1288) {
                int var149 = var3.method6310();
                if (var149 == 65535) {
                    var149 = -1;
                }
                method3550(var149);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2812 == arg0.field1288) {
                int var150 = var3.method6310();
                if (var150 == 65535) {
                    var150 = -1;
                }
                int var151 = var3.method6315();
                method714(var150, var151);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2841 == arg0.field1288) {
                int var152 = var3.method6272();
                int var153 = var3.method6272();
                String var154 = var3.method6474();
                if (var152 >= 1 && var152 <= 8) {
                    if (var154.equalsIgnoreCase(class283.field3360)) {
                        var154 = null;
                    }
                    field586[var152 - 1] = var154;
                    field550[var152 - 1] = var153 == 0;
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2828 == arg0.field1288) {
                method2734(class241.field2771);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2832 == arg0.field1288) {
                int var155 = var3.method6309();
                class78.method4244(var155);
                field679[++field680 - 1 & 0x1F] = var155 & 0x7FFF;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2881 == arg0.field1288) {
                field595 = field689;
                byte var156 = var3.method6273();
                if (arg0.field1293 == 1) {
                    if (var156 >= 0) {
                        field722[var156] = null;
                    } else {
                        Statics.field3746 = null;
                    }
                    arg0.field1288 = null;
                    return true;
                }
                if (var156 >= 0) {
                    field722[var156] = new class137(var3);
                } else {
                    Statics.field3746 = new class137(var3);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2790 == arg0.field1288) {
                int var157 = var3.method6320();
                class262 var158 = class262.method2058(var157);
                var158.field3091 = 3;
                var158.field3178 = Statics.field868.field1062.method4544();
                method204(var158);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2859 == arg0.field1288) {
                int var159 = var3.method6277();
                if (field573 != var159) {
                    field573 = var159;
                    method2125();
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2796 == arg0.field1288) {
                class96.method2103(var3, arg0.field1293);
                method259();
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2855 == arg0.field1288) {
                for (int var160 = 0; var160 < Statics.field1622; var160++) {
                    class153 var161 = class153.method1031(var160);
                    if (var161 != null) {
                        class257.field3007[var160] = 0;
                        class257.field3009[var160] = 0;
                    }
                }
                method2392();
                field678 += 32;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2851 == arg0.field1288) {
                int var162 = var3.method6313();
                int var163 = var3.method6320();
                class262 var164 = class262.method2058(var163);
                if (var164.field3095 != var162 || var162 == -1) {
                    var164.field3095 = var162;
                    var164.field3180 = 0;
                    var164.field3047 = 0;
                    method204(var164);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2809 == arg0.field1288) {
                method178(false, var3);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2833 == arg0.field1288) {
                int var165 = var3.method6309();
                int var166 = var3.method6320();
                class262 var167 = class262.method2058(var166);
                if (var167.field3091 != 2 || var167.field3178 != var165) {
                    var167.field3091 = 2;
                    var167.field3178 = var165;
                    method204(var167);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2856 == arg0.field1288) {
                method2734(class241.field2770);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2869 == arg0.field1288) {
                int var168 = var3.method6284();
                int var169 = var3.method6272();
                int var170 = var3.method6284();
                method3501(var168, var169, var170);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2794 == arg0.field1288) {
                method2734(class241.field2777);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2864 == arg0.field1288) {
                int var171 = var3.method6284();
                int var172 = var3.method6309();
                int var173 = var3.method6252();
                class262 var174 = class262.method2058(var173);
                var174.field3039 = (var172 << 16) + var171;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2839 == arg0.field1288) {
                field661 = var3.method6303();
                field713 = var3.method6272();
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2818 == arg0.field1288) {
                int var175 = var3.method6272();
                method5400(var175);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2849 == arg0.field1288) {
                int var176 = arg0.field1293 + var3.field4292;
                int var177 = var3.method6284();
                int var178 = var3.method6284();
                if (field718 != var177) {
                    field718 = var177;
                    this.method1063(false);
                    method261(field718);
                    class64.method3643(field718);
                    for (int var179 = 0; var179 < 100; var179++) {
                        field711[var179] = true;
                    }
                }
                while (var178-- > 0) {
                    int var180 = var3.method6277();
                    int var181 = var3.method6284();
                    int var182 = var3.method6272();
                    class80 var183 = (class80) field652.method6061((long) var180);
                    if (var183 != null && var183.field1034 != var181) {
                        method3192(var183, true);
                        var183 = null;
                    }
                    if (var183 == null) {
                        var183 = method20(var180, var181, var182);
                    }
                    var183.field1032 = true;
                }
                for (class80 var184 = (class80) field652.method6062(); var184 != null; var184 = (class80) field652.method6060()) {
                    if (var184.field1032) {
                        var184.field1032 = false;
                    } else {
                        method3192(var184, true);
                    }
                }
                field487 = new class380(512);
                while (var3.field4292 < var176) {
                    int var185 = var3.method6277();
                    int var186 = var3.method6284();
                    int var187 = var3.method6284();
                    int var188 = var3.method6277();
                    for (int var189 = var186; var189 <= var187; var189++) {
                        long var190 = ((long) var185 << 32) + (long) var189;
                        field487.method6065(new class369(var188), var190);
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2857 == arg0.field1288) {
                int var192 = var3.method6252();
                int var193 = var3.method6310();
                if (var193 == 65535) {
                    var193 = -1;
                }
                int var194 = var3.method6277();
                int var195 = var3.method6309();
                if (var195 == 65535) {
                    var195 = -1;
                }
                for (int var196 = var193; var196 <= var195; var196++) {
                    long var197 = ((long) var194 << 32) + (long) var196;
                    class370 var199 = field487.method6061(var197);
                    if (var199 != null) {
                        var199.method5775();
                    }
                    field487.method6065(new class369(var192), var197);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2801 == arg0.field1288) {
                field577 = var3.method6272();
                if (field577 == 1) {
                    field733 = var3.method6284();
                }
                if (field577 >= 2 && field577 <= 6) {
                    if (field577 == 2) {
                        field508 = 64;
                        field509 = 64;
                    }
                    if (field577 == 3) {
                        field508 = 0;
                        field509 = 64;
                    }
                    if (field577 == 4) {
                        field508 = 128;
                        field509 = 64;
                    }
                    if (field577 == 5) {
                        field508 = 64;
                        field509 = 0;
                    }
                    if (field577 == 6) {
                        field508 = 64;
                        field509 = 128;
                    }
                    field577 = 2;
                    field505 = var3.method6284();
                    field506 = var3.method6284();
                    field507 = var3.method6272();
                }
                if (field577 == 10) {
                    field504 = var3.method6284();
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2858 == arg0.field1288) {
                method4851();
                byte var200 = var3.method6273();
                class120 var201 = new class120(var3);
                class128 var202;
                if (var200 >= 0) {
                    var202 = field721[var200];
                } else {
                    var202 = Statics.field1373;
                }
                var201.method2387(var202);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2813 == arg0.field1288) {
                Statics.field1623 = var3.method6302();
                Statics.field1314 = var3.method6303();
                while (var3.field4292 < arg0.field1293) {
                    int var203 = var3.method6272();
                    class241 var204 = class241.method2113()[var203];
                    method2734(var204);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2797 == arg0.field1288) {
                boolean var205 = var3.method6302() == 1;
                int var206 = var3.method6320();
                class262 var207 = class262.method2058(var206);
                if (var207.field3192 != var205) {
                    var207.field3192 = var205;
                    method204(var207);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2804 == arg0.field1288) {
                String var208 = var3.method6474();
                Object[] var209 = new Object[var208.length() + 1];
                for (int var210 = var208.length() - 1; var210 >= 0; var210--) {
                    if (var208.charAt(var210) == 's') {
                        var209[var210 + 1] = var3.method6474();
                    } else {
                        var209[var210 + 1] = Integer.valueOf(var3.method6277());
                    }
                }
                var209[0] = Integer.valueOf(var3.method6277());
                class81 var211 = new class81();
                var211.field1042 = var209;
                class64.method4138(var211);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2879 == arg0.field1288) {
                int var212 = var3.method6272();
                int var213 = var3.method6272();
                int var214 = var3.method6272();
                int var215 = var3.method6272();
                field740[var212] = true;
                field741[var212] = var213;
                field742[var212] = var214;
                field743[var212] = var215;
                field744[var212] = 0;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2823 == arg0.field1288) {
                for (int var216 = 0; var216 < field642.length; var216++) {
                    if (field642[var216] != null) {
                        field642[var216].field1139 = -1;
                    }
                }
                for (int var217 = 0; var217 < field532.length; var217++) {
                    if (field532[var217] != null) {
                        field532[var217].field1139 = -1;
                    }
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2789 == arg0.field1288) {
                method2734(class241.field2775);
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2872 == arg0.field1288) {
                int var218 = var3.method6277();
                int var219 = var3.method6252();
                class80 var220 = (class80) field652.method6061((long) var218);
                class80 var221 = (class80) field652.method6061((long) var219);
                if (var221 != null) {
                    method3192(var221, var220 == null || var220.field1034 != var221.field1034);
                }
                if (var220 != null) {
                    var220.method5775();
                    field652.method6065(var220, (long) var219);
                }
                class262 var222 = class262.method2058(var218);
                if (var222 != null) {
                    method204(var222);
                }
                class262 var223 = class262.method2058(var219);
                if (var223 != null) {
                    method204(var223);
                    method2566(Statics.field3153[var223.field3048 >>> 16], var223, true);
                }
                if (field718 != -1) {
                    method1967(field718, 1);
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2843 == arg0.field1288) {
                int var224 = var3.method6277();
                int var225 = var3.method6284();
                if (var224 < -70000) {
                    var225 += 32768;
                }
                class262 var226;
                if (var224 >= 0) {
                    var226 = class262.method2058(var224);
                } else {
                    var226 = null;
                }
                if (var226 != null) {
                    for (int var227 = 0; var227 < var226.field3176.length; var227++) {
                        var226.field3176[var227] = 0;
                        var226.field3177[var227] = 0;
                    }
                }
                class78.method4997(var225);
                int var228 = var3.method6284();
                for (int var229 = 0; var229 < var228; var229++) {
                    int var230 = var3.method6301();
                    if (var230 == 255) {
                        var230 = var3.method6321();
                    }
                    int var231 = var3.method6435();
                    if (var226 != null && var229 < var226.field3176.length) {
                        var226.field3176[var229] = var231;
                        var226.field3177[var229] = var230;
                    }
                    class78.method1794(var225, var229, var231 - 1, var230);
                }
                if (var226 != null) {
                    method204(var226);
                }
                method2392();
                field679[++field680 - 1 & 0x1F] = var225 & 0x7FFF;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2871 == arg0.field1288) {
                Statics.field2911 = class418.method2488(var3.method6272());
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2837 == arg0.field1288) {
                field690 = true;
                Statics.field285 = var3.method6272();
                Statics.field1409 = var3.method6272();
                Statics.field2787 = var3.method6284();
                Statics.field907 = var3.method6272();
                Statics.field3325 = var3.method6272();
                if (Statics.field3325 >= 100) {
                    Statics.field154 = Statics.field285 * 128 + 64;
                    Statics.field1620 = Statics.field1409 * 128 + 64;
                    Statics.field81 = method4391(Statics.field154, Statics.field1620, Statics.field2592) - Statics.field2787;
                }
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2852 == arg0.field1288) {
                int var232 = var3.method6321();
                int var233 = var3.method6309();
                class257.field3007[var233] = var232;
                if (class257.field3009[var233] != var232) {
                    class257.field3009[var233] = var232;
                }
                method2617(var233);
                field677[++field678 - 1 & 0x1F] = var233;
                arg0.field1288 = null;
                return true;
            }
            if (class243.field2808 == arg0.field1288) {
                int var234 = var3.method6272();
                method1864(var234);
                arg0.field1288 = null;
                return false;
            }
            if (class243.field2822 == arg0.field1288) {
                field607 = var3.method6272();
                if (field607 == 255) {
                    field607 = 0;
                }
                field729 = var3.method6272();
                if (field729 == 255) {
                    field729 = 0;
                }
                arg0.field1288 = null;
                return true;
            }
            class425.method5430("" + (arg0.field1288 == null ? -1 : arg0.field1288.field2826) + class92.field1221 + (arg0.field1294 == null ? -1 : arg0.field1294.field2826) + class92.field1221 + (arg0.field1289 == null ? -1 : arg0.field1289.field2826) + class92.field1221 + arg0.field1293, (Throwable) null);
            method2159();
        } catch (IOException var239) {
            method295();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1288 == null ? -1 : arg0.field1288.field2826) + class92.field1221 + (arg0.field1294 == null ? -1 : arg0.field1294.field2826) + class92.field1221 + (arg0.field1289 == null ? -1 : arg0.field1289.field2826) + class92.field1221 + arg0.field1293 + class92.field1221 + (Statics.field2131 + Statics.field868.field1162[0]) + class92.field1221 + (Statics.field3028 + Statics.field868.field1163[0]) + class92.field1221;
            for (int var238 = 0; var238 < arg0.field1293 && var238 < 50; var238++) {
                var237 = var237 + var3.field4294[var238] + class92.field1221;
            }
            class425.method5430(var237, var240);
            method2159();
        }
        return true;
    }

    @ObfuscatedName("fs.hz(Lid;I)V")
    public static final void method2734(class241 arg0) {
        class400 var1 = field639.field1295;
        if (class241.field2773 == arg0) {
            int var2 = var1.method6309();
            int var3 = var1.method6272();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1314;
            int var5 = (var3 & 0x7) + Statics.field1623;
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                class309 var6 = field619[Statics.field2592][var4][var5];
                if (var6 != null) {
                    for (class95 var7 = (class95) var6.method5035(); var7 != null; var7 = (class95) var6.method5022()) {
                        if ((var2 & 0x7FFF) == var7.field1245) {
                            var7.method5775();
                            break;
                        }
                    }
                    if (var6.method5035() == null) {
                        field619[Statics.field2592][var4][var5] = null;
                    }
                    Statics.method2063(var4, var5);
                }
            }
        } else if (class241.field2772 == arg0) {
            int var8 = var1.method6435();
            int var9 = var1.method6303();
            int var10 = (var9 >> 4 & 0x7) + Statics.field1314;
            int var11 = (var9 & 0x7) + Statics.field1623;
            int var12 = var1.method6301();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field691[var13];
            if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                if (var15 == 0) {
                    class225 var16 = Statics.field3027.method3846(Statics.field2592, var10, var11);
                    if (var16 != null) {
                        int var17 = class221.method1972(var16.field2612);
                        if (var13 == 2) {
                            var16.field2610 = new class73(var17, 2, var14 + 4, Statics.field2592, var10, var11, var8, false, var16.field2610);
                            var16.field2615 = new class73(var17, 2, var14 + 1 & 0x3, Statics.field2592, var10, var11, var8, false, var16.field2615);
                        } else {
                            var16.field2610 = new class73(var17, var13, var14, Statics.field2592, var10, var11, var8, false, var16.field2610);
                        }
                    }
                }
                if (var15 == 1) {
                    class227 var18 = Statics.field3027.method3943(Statics.field2592, var10, var11);
                    if (var18 != null) {
                        int var19 = class221.method1972(var18.field2625);
                        if (var13 == 4 || var13 == 5) {
                            var18.field2627 = new class73(var19, 4, var14, Statics.field2592, var10, var11, var8, false, var18.field2627);
                        } else if (var13 == 6) {
                            var18.field2627 = new class73(var19, 4, var14 + 4, Statics.field2592, var10, var11, var8, false, var18.field2627);
                        } else if (var13 == 7) {
                            var18.field2627 = new class73(var19, 4, (var14 + 2 & 0x3) + 4, Statics.field2592, var10, var11, var8, false, var18.field2627);
                        } else if (var13 == 8) {
                            var18.field2627 = new class73(var19, 4, var14 + 4, Statics.field2592, var10, var11, var8, false, var18.field2627);
                            var18.field2619 = new class73(var19, 4, (var14 + 2 & 0x3) + 4, Statics.field2592, var10, var11, var8, false, var18.field2619);
                        }
                    }
                }
                if (var15 == 2) {
                    class228 var20 = Statics.field3027.method4002(Statics.field2592, var10, var11);
                    if (var13 == 11) {
                        var13 = 10;
                    }
                    if (var20 != null) {
                        var20.field2637 = new class73(class221.method1972(var20.field2640), var13, var14, Statics.field2592, var10, var11, var8, false, var20.field2637);
                    }
                }
                if (var15 == 3) {
                    class207 var21 = Statics.field3027.method3849(Statics.field2592, var10, var11);
                    if (var21 != null) {
                        var21.field2289 = new class73(class221.method1972(var21.field2285), 22, var14, Statics.field2592, var10, var11, var8, false, var21.field2289);
                    }
                }
            }
        } else if (class241.field2771 == arg0) {
            int var22 = var1.method6301();
            int var23 = var1.method6284();
            int var24 = var1.method6301();
            int var25 = (var24 >> 4 & 0x7) + Statics.field1314;
            int var26 = (var24 & 0x7) + Statics.field1623;
            int var27 = var1.method6309();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                int var28 = var25 * 128 + 64;
                int var29 = var26 * 128 + 64;
                class65 var30 = new class65(var27, Statics.field2592, var28, var29, method4391(var28, var29, Statics.field2592) - var22, var23, field494);
                field622.method5015(var30);
            }
        } else {
            if (class241.field2768 == arg0) {
                int var31 = var1.method6284();
                int var32 = var1.method6303();
                int var33 = var32 >> 4 & 0xF;
                int var34 = var32 & 0x7;
                int var35 = var1.method6301();
                int var36 = (var35 >> 4 & 0x7) + Statics.field1314;
                int var37 = (var35 & 0x7) + Statics.field1623;
                int var38 = var1.method6303();
                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    int var39 = var33 + 1;
                    if (Statics.field868.field1162[0] >= var36 - var39 && Statics.field868.field1162[0] <= var36 + var39 && Statics.field868.field1163[0] >= var37 - var39 && Statics.field868.field1163[0] <= var37 + var39 && Statics.field3227.field1201 != 0 && var34 > 0 && field544 < 50) {
                        field734[field544] = var31;
                        field735[field544] = var34;
                        field736[field544] = var38;
                        field738[field544] = null;
                        field737[field544] = (var36 << 16) + (var37 << 8) + var33;
                        field544++;
                    }
                }
            }
            if (class241.field2769 == arg0) {
                int var40 = var1.method6303();
                int var41 = var40 >> 2;
                int var42 = var40 & 0x3;
                int var43 = field691[var41];
                int var44 = var1.method6284();
                int var45 = var1.method6301();
                int var46 = (var45 >> 4 & 0x7) + Statics.field1314;
                int var47 = (var45 & 0x7) + Statics.field1623;
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    method2372(Statics.field2592, var46, var47, var43, var44, var41, var42, 0, -1);
                }
            } else if (class241.field2775 == arg0) {
                int var48 = var1.method6435();
                int var49 = var1.method6302();
                int var50 = (var49 >> 4 & 0x7) + Statics.field1314;
                int var51 = (var49 & 0x7) + Statics.field1623;
                int var52 = var1.method6310();
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    class95 var53 = new class95();
                    var53.field1245 = var48;
                    var53.field1241 = var52;
                    if (field619[Statics.field2592][var50][var51] == null) {
                        field619[Statics.field2592][var50][var51] = new class309();
                    }
                    field619[Statics.field2592][var50][var51].method5015(var53);
                    Statics.method2063(var50, var51);
                }
            } else if (class241.field2777 == arg0) {
                int var54 = var1.method6284();
                int var55 = var1.method6309();
                int var56 = var1.method6310();
                int var57 = var1.method6272();
                int var58 = (var57 >> 4 & 0x7) + Statics.field1314;
                int var59 = (var57 & 0x7) + Statics.field1623;
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    class309 var60 = field619[Statics.field2592][var58][var59];
                    if (var60 != null) {
                        for (class95 var61 = (class95) var60.method5035(); var61 != null; var61 = (class95) var60.method5022()) {
                            if ((var55 & 0x7FFF) == var61.field1245 && var61.field1241 == var54) {
                                var61.field1241 = var56;
                                break;
                            }
                        }
                        Statics.method2063(var58, var59);
                    }
                }
            } else if (class241.field2776 == arg0) {
                int var62 = var1.method6312();
                byte var63 = var1.method6273();
                int var64 = var1.method6310();
                int var65 = var1.method6303();
                int var66 = var1.method6435();
                int var67 = var1.method6301() * 4;
                int var68 = var1.method6303();
                int var69 = (var68 >> 4 & 0x7) + Statics.field1314;
                int var70 = (var68 & 0x7) + Statics.field1623;
                int var71 = var1.method6302();
                byte var72 = var1.method6305();
                int var73 = var1.method6309();
                int var74 = var1.method6272() * 4;
                int var75 = var69 + var72;
                int var76 = var63 + var70;
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var66 != 65535) {
                    int var77 = var69 * 128 + 64;
                    int var78 = var70 * 128 + 64;
                    int var79 = var75 * 128 + 64;
                    int var80 = var76 * 128 + 64;
                    class70 var81 = new class70(var66, Statics.field2592, var77, var78, method4391(var77, var78, Statics.field2592) - var67, field494 + var64, field494 + var73, var71, var65, var62, var74);
                    var81.method1844(var79, var80, method4391(var79, var80, Statics.field2592) - var74, field494 + var64);
                    field655.method5015(var81);
                }
            } else if (class241.field2770 == arg0) {
                int var82 = var1.method6302();
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = field691[var83];
                int var86 = var1.method6301();
                int var87 = (var86 >> 4 & 0x7) + Statics.field1314;
                int var88 = (var86 & 0x7) + Statics.field1623;
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    method2372(Statics.field2592, var87, var88, var85, -1, var83, var84, 0, -1);
                }
            } else if (class241.field2774 == arg0) {
                byte var89 = var1.method6291();
                byte var90 = var1.method6305();
                int var91 = var1.method6302();
                int var92 = (var91 >> 4 & 0x7) + Statics.field1314;
                int var93 = (var91 & 0x7) + Statics.field1623;
                int var94 = var1.method6284();
                int var95 = var1.method6310();
                byte var96 = var1.method6291();
                int var97 = var1.method6284();
                int var98 = var1.method6435();
                int var99 = var1.method6303();
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = field691[var100];
                byte var103 = var1.method6291();
                class83 var104;
                if (field608 == var97) {
                    var104 = Statics.field868;
                } else {
                    var104 = field642[var97];
                }
                if (var104 != null) {
                    class169 var105 = class169.method4277(var95);
                    int var106;
                    int var107;
                    if (var101 == 1 || var101 == 3) {
                        var106 = var105.field1829;
                        var107 = var105.field1845;
                    } else {
                        var106 = var105.field1845;
                        var107 = var105.field1829;
                    }
                    int var108 = (var106 >> 1) + var92;
                    int var109 = (var106 + 1 >> 1) + var92;
                    int var110 = (var107 >> 1) + var93;
                    int var111 = (var107 + 1 >> 1) + var93;
                    int[][] var112 = class75.field994[Statics.field2592];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var92 << 7) + (var106 << 6);
                    int var115 = (var93 << 7) + (var107 << 6);
                    class220 var116 = var105.method2943(var100, var101, var112, var114, var113, var115);
                    if (var116 != null) {
                        method2372(Statics.field2592, var92, var93, var102, -1, 0, 0, var98 + 1, var94 + 1);
                        var104.field1070 = field494 + var98;
                        var104.field1079 = field494 + var94;
                        var104.field1075 = var116;
                        var104.field1088 = var92 * 128 + var106 * 64;
                        var104.field1071 = var93 * 128 + var107 * 64;
                        var104.field1073 = var113;
                        if (var96 > var89) {
                            byte var117 = var96;
                            var96 = var89;
                            var89 = var117;
                        }
                        if (var90 > var103) {
                            byte var118 = var90;
                            var90 = var103;
                            var103 = var118;
                        }
                        var104.field1076 = var92 + var96;
                        var104.field1068 = var89 + var92;
                        var104.field1065 = var90 + var93;
                        var104.field1066 = var93 + var103;
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.hd(IIIIIIIIII)V")
    public static final void method2372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class84 var9 = null;
        for (class84 var10 = (class84) field708.method5035(); var10 != null; var10 = (class84) field708.method5022()) {
            if (var10.field1091 == arg0 && var10.field1093 == arg1 && var10.field1103 == arg2 && var10.field1092 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class84();
            var9.field1091 = arg0;
            var9.field1092 = arg3;
            var9.field1093 = arg1;
            var9.field1103 = arg2;
            method1880(var9);
            field708.method5015(var9);
        }
        var9.field1098 = arg4;
        var9.field1105 = arg5;
        var9.field1099 = arg6;
        var9.field1101 = arg7;
        var9.field1094 = arg8;
    }

    @ObfuscatedName("be.hg(Lcx;I)V")
    public static final void method1880(class84 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1092 == 0) {
            var1 = Statics.field3027.method3850(arg0.field1091, arg0.field1093, arg0.field1103);
        }
        if (arg0.field1092 == 1) {
            var1 = Statics.field3027.method3851(arg0.field1091, arg0.field1093, arg0.field1103);
        }
        if (arg0.field1092 == 2) {
            var1 = Statics.field3027.method3925(arg0.field1091, arg0.field1093, arg0.field1103);
        }
        if (arg0.field1092 == 3) {
            var1 = Statics.field3027.method3958(arg0.field1091, arg0.field1093, arg0.field1103);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3027.method3854(arg0.field1091, arg0.field1093, arg0.field1103, var1);
            var3 = class221.method1972(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1095 = var3;
        arg0.field1097 = var4;
        arg0.field1096 = var5;
    }

    @ObfuscatedName("fp.hy(I)V")
    public static final void method2761() {
        for (class84 var0 = (class84) field708.method5035(); var0 != null; var0 = (class84) field708.method5022()) {
            if (var0.field1094 > 0) {
                var0.field1094--;
            }
            if (var0.field1094 == 0) {
                if (var0.field1095 >= 0) {
                    int var1 = var0.field1095;
                    int var2 = var0.field1097;
                    class169 var3 = class169.method4277(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method2958(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method4246(var0.field1091, var0.field1092, var0.field1093, var0.field1103, var0.field1095, var0.field1096, var0.field1097);
                var0.method5775();
            } else {
                if (var0.field1101 > 0) {
                    var0.field1101--;
                }
                if (var0.field1101 == 0 && var0.field1093 >= 1 && var0.field1103 >= 1 && var0.field1093 <= 102 && var0.field1103 <= 102) {
                    if (var0.field1098 >= 0) {
                        int var5 = var0.field1098;
                        int var6 = var0.field1105;
                        class169 var7 = class169.method4277(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method2958(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method4246(var0.field1091, var0.field1092, var0.field1093, var0.field1103, var0.field1098, var0.field1099, var0.field1105);
                    var0.field1101 = -1;
                    if (var0.field1098 == var0.field1095 && var0.field1095 == -1) {
                        var0.method5775();
                    } else if (var0.field1098 == var0.field1095 && var0.field1099 == var0.field1096 && var0.field1105 == var0.field1097) {
                        var0.method5775();
                    }
                }
            }
        }
    }

    @ObfuscatedName("in.hi(IIIIIIII)V")
    public static final void method4246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field569 && Statics.field2592 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3027.method3850(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3027.method3851(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3027.method3925(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3027.method3958(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3027.method3854(arg0, arg2, arg3, var7);
            int var13 = class221.method1972(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3027.method3934(arg0, arg2, arg3);
                class169 var16 = class169.method4277(var13);
                if (var16.field1839 != 0) {
                    field712[arg0].method3133(arg2, arg3, var14, var15, var16.field1866);
                }
            }
            if (arg1 == 1) {
                Statics.field3027.method3842(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3027.method3843(arg0, arg2, arg3);
                class169 var17 = class169.method4277(var13);
                if (var17.field1845 + arg2 > 103 || var17.field1845 + arg3 > 103 || var17.field1829 + arg2 > 103 || var17.field1829 + arg3 > 103) {
                    return;
                }
                if (var17.field1839 != 0) {
                    field712[arg0].method3134(arg2, arg3, var17.field1845, var17.field1829, var15, var17.field1866);
                }
            }
            if (arg1 == 3) {
                Statics.field3027.method3844(arg0, arg2, arg3);
                class169 var18 = class169.method4277(var13);
                if (var18.field1839 == 1) {
                    field712[arg0].method3136(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field978[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class75.method2378(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3027, field712[arg0]);
    }

    @ObfuscatedName("s.ht(ZLoy;I)V")
    public static final void method178(boolean arg0, class400 arg1) {
        field612 = 0;
        field714 = 0;
        class400 var2 = field639.field1295;
        var2.method6225();
        int var3 = var2.method6226(8);
        if (var3 < field513) {
            for (int var4 = var3; var4 < field513; var4++) {
                field613[++field612 - 1] = field534[var4];
            }
        }
        if (var3 > field513) {
            throw new RuntimeException("");
        }
        field513 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field534[var5];
            class91 var7 = field532[var6];
            int var8 = var2.method6226(1);
            if (var8 == 0) {
                field534[++field513 - 1] = var6;
                var7.field1156 = field494;
            } else {
                int var9 = var2.method6226(2);
                if (var9 == 0) {
                    field534[++field513 - 1] = var6;
                    var7.field1156 = field494;
                    field536[++field714 - 1] = var6;
                } else if (var9 == 1) {
                    field534[++field513 - 1] = var6;
                    var7.field1156 = field494;
                    int var10 = var2.method6226(3);
                    var7.method2126(var10, (byte) 1);
                    int var11 = var2.method6226(1);
                    if (var11 == 1) {
                        field536[++field714 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field534[++field513 - 1] = var6;
                    var7.field1156 = field494;
                    int var12 = var2.method6226(3);
                    var7.method2126(var12, (byte) 2);
                    int var13 = var2.method6226(3);
                    var7.method2126(var13, (byte) 2);
                    int var14 = var2.method6226(1);
                    if (var14 == 1) {
                        field536[++field714 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field613[++field612 - 1] = var6;
                }
            }
        }
        method4384(arg0, arg1);
        method5345(arg1);
        for (int var15 = 0; var15 < field612; var15++) {
            int var16 = field613[var15];
            if (field494 != field532[var16].field1156) {
                field532[var16].field1219 = null;
                field532[var16] = null;
            }
        }
        if (field639.field1293 != arg1.field4292) {
            throw new RuntimeException(arg1.field4292 + class92.field1221 + field639.field1293);
        }
        for (int var17 = 0; var17 < field513; var17++) {
            if (field532[field534[var17]] == null) {
                throw new RuntimeException(var17 + class92.field1221 + field513);
            }
        }
    }

    @ObfuscatedName("ig.hp(ZLoy;S)V")
    public static final void method4384(boolean arg0, class400 arg1) {
        while (true) {
            if (arg1.method6227(field639.field1293) >= 27) {
                int var2 = arg1.method6226(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field532[var2] == null) {
                        field532[var2] = new class91();
                        var3 = true;
                    }
                    class91 var4 = field532[var2];
                    field534[++field513 - 1] = var2;
                    var4.field1156 = field494;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method6226(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method6226(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method6226(1);
                    if (var6 == 1) {
                        field536[++field714 - 1] = var2;
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method6226(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method6226(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field617[arg1.method6226(3)];
                    if (var3) {
                        var4.field1158 = var4.field1133 = var8;
                    }
                    var4.field1219 = class161.method2362(arg1.method6226(14));
                    boolean var9 = arg1.method6226(1) == 1;
                    if (var9) {
                        arg1.method6226(32);
                    }
                    int var10 = arg1.method6226(1);
                    var4.field1110 = var4.field1219.field1717;
                    var4.field1147 = var4.field1219.field1740;
                    if (var4.field1147 == 0) {
                        var4.field1133 = 0;
                    }
                    var4.field1115 = var4.field1219.field1723;
                    var4.field1116 = var4.field1219.field1724;
                    var4.field1117 = var4.field1219.field1721;
                    var4.field1118 = var4.field1219.field1726;
                    var4.field1112 = var4.field1219.field1720;
                    var4.field1113 = var4.field1219.field1743;
                    var4.field1153 = var4.field1219.field1722;
                    var4.method2133(Statics.field868.field1162[0] + var7, Statics.field868.field1163[0] + var5, var10 == 1);
                    continue;
                }
            }
            arg1.method6239();
            return;
        }
    }

    @ObfuscatedName("ll.hb(Loy;I)V")
    public static final void method5345(class400 arg0) {
        for (int var1 = 0; var1 < field714; var1++) {
            int var2 = field536[var1];
            class91 var3 = field532[var2];
            int var4 = arg0.method6272();
            if ((var4 & 0x10) != 0) {
                var3.field1120 = arg0.method6474();
                var3.field1123 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1125 = arg0.method6435();
                int var5 = arg0.method6320();
                var3.field1148 = var5 >> 16;
                var3.field1106 = (var5 & 0xFFFF) + field494;
                var3.field1145 = 0;
                var3.field1109 = 0;
                if (var3.field1106 > field494) {
                    var3.field1145 = -1;
                }
                if (var3.field1125 == 65535) {
                    var3.field1125 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var6 = arg0.method6310();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = arg0.method6301();
                if (var3.field1139 == var6 && var6 != -1) {
                    int var8 = class172.method2708(var6).field1962;
                    if (var8 == 1) {
                        var3.field1164 = 0;
                        var3.field1151 = 0;
                        var3.field1142 = var7;
                        var3.field1143 = 0;
                    }
                    if (var8 == 2) {
                        var3.field1143 = 0;
                    }
                } else if (var6 == -1 || var3.field1139 == -1 || class172.method2708(var6).field1956 >= class172.method2708(var3.field1139).field1956) {
                    var3.field1139 = var6;
                    var3.field1164 = 0;
                    var3.field1151 = 0;
                    var3.field1142 = var7;
                    var3.field1143 = 0;
                    var3.field1130 = var3.field1161;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var9 = arg0.method6272();
                if (var9 > 0) {
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = arg0.method6286();
                        if (var14 == 32767) {
                            var14 = arg0.method6286();
                            var12 = arg0.method6286();
                            var11 = arg0.method6286();
                            var13 = arg0.method6286();
                        } else if (var14 == 32766) {
                            var14 = -1;
                        } else {
                            var12 = arg0.method6286();
                        }
                        int var15 = arg0.method6286();
                        var3.method2046(var14, var12, var11, var13, field494, var15);
                    }
                }
                int var16 = arg0.method6272();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = arg0.method6286();
                        int var19 = arg0.method6286();
                        if (var19 == 32767) {
                            var3.method2048(var18);
                        } else {
                            int var20 = arg0.method6286();
                            int var21 = arg0.method6272();
                            int var22 = var19 > 0 ? arg0.method6302() : var21;
                            var3.method2047(var18, field494, var19, var20, var21, var22);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1219 = class161.method2362(arg0.method6435());
                var3.field1110 = var3.field1219.field1717;
                var3.field1147 = var3.field1219.field1740;
                var3.field1115 = var3.field1219.field1723;
                var3.field1116 = var3.field1219.field1724;
                var3.field1117 = var3.field1219.field1721;
                var3.field1118 = var3.field1219.field1726;
                var3.field1112 = var3.field1219.field1720;
                var3.field1113 = var3.field1219.field1743;
                var3.field1153 = var3.field1219.field1722;
            }
            if ((var4 & 0x1) != 0) {
                int var23 = arg0.method6435();
                int var24 = arg0.method6309();
                int var25 = var3.field1140 - (var23 - Statics.field2131 - Statics.field2131) * 64;
                int var26 = var3.field1124 - (var24 - Statics.field3028 - Statics.field3028) * 64;
                if (var25 != 0 || var26 != 0) {
                    var3.field1135 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1149 = arg0.method6291();
                var3.field1127 = arg0.method6291();
                var3.field1150 = arg0.method6334();
                var3.field1126 = arg0.method6334();
                var3.field1146 = arg0.method6310() + field494;
                var3.field1166 = arg0.method6309() + field494;
                var3.field1152 = arg0.method6435();
                var3.field1161 = 1;
                var3.field1130 = 0;
                var3.field1149 += var3.field1162[0];
                var3.field1127 += var3.field1163[0];
                var3.field1150 += var3.field1162[0];
                var3.field1126 += var3.field1163[0];
            }
            if ((var4 & 0x40) != 0) {
                var3.field1160 = arg0.method6310();
                if (var3.field1160 == 65535) {
                    var3.field1160 = -1;
                }
            }
        }
    }

    @ObfuscatedName("ft.hl(I)V")
    public static void method3167() {
        field695 = 0;
        field627 = false;
        field633[0] = class283.field3428;
        field634[0] = "";
        field701[0] = 1006;
        field635[0] = false;
        field695 = 1;
    }

    @ObfuscatedName("bk.hq(I)V")
    public static final void method1944() {
        int var0 = Statics.field1193;
        int var1 = Statics.field4263;
        int var2 = Statics.field1330;
        int var3 = Statics.field475;
        int var4 = 6116423;
        class410.method6595(var0, var1, var2, var3, var4);
        class410.method6595(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class410.method6566(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field834.method5207(class283.field3492, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field224;
        int var6 = class33.field225;
        for (int var7 = 0; var7 < field695; var7++) {
            int var8 = (field695 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class315 var10 = Statics.field834;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field634[var7].length() > 0) {
                var11 = field633[var7] + class283.field3328 + field634[var7];
            } else {
                var11 = field633[var7];
            }
            var10.method5207(var11, var0 + 3, var8, var9, 0);
        }
        method2361(Statics.field1193, Statics.field4263, Statics.field1330, Statics.field475);
    }

    @ObfuscatedName("ja.ha(B)Z")
    public static final boolean method4660() {
        return field627;
    }

    @ObfuscatedName("dl.hm(IIIII)V")
    public static final void method2361(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field699; var4++) {
            if (field706[var4] + field704[var4] > arg0 && field704[var4] < arg0 + arg2 && field707[var4] + field705[var4] > arg1 && field705[var4] < arg1 + arg3) {
                field702[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ho(B)V")
    public final void method1201() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field695 - 1; var2++) {
                if (field701[var2] < 1000 && field701[var2 + 1] > 1000) {
                    String var3 = field634[var2];
                    field634[var2] = field634[var2 + 1];
                    field634[var2 + 1] = var3;
                    String var4 = field633[var2];
                    field633[var2] = field633[var2 + 1];
                    field633[var2 + 1] = var4;
                    int var5 = field701[var2];
                    field701[var2] = field701[var2 + 1];
                    field701[var2 + 1] = var5;
                    int var6 = field629[var2];
                    field629[var2] = field629[var2 + 1];
                    field629[var2 + 1] = var6;
                    int var7 = field630[var2];
                    field630[var2] = field630[var2 + 1];
                    field630[var2 + 1] = var7;
                    int var8 = field632[var2];
                    field632[var2] = field632[var2 + 1];
                    field632[var2 + 1] = var8;
                    boolean var9 = field635[var2];
                    field635[var2] = field635[var2 + 1];
                    field635[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field211 != null || field610 != null) {
            return;
        }
        int var37;
        int var40;
        int var41;
        label248: {
            int var10 = class33.field231;
            if (field627) {
                if (var10 != 1 && (Statics.field1784 || var10 != 4)) {
                    int var11 = class33.field224;
                    int var12 = class33.field225;
                    if (var11 < Statics.field1193 - 10 || var11 > Statics.field1330 + Statics.field1193 + 10 || var12 < Statics.field4263 - 10 || var12 > Statics.field475 + Statics.field4263 + 10) {
                        field627 = false;
                        int var13 = Statics.field1193;
                        int var14 = Statics.field4263;
                        int var15 = Statics.field1330;
                        int var16 = Statics.field475;
                        for (int var17 = 0; var17 < field699; var17++) {
                            if (field706[var17] + field704[var17] > var13 && field704[var17] < var13 + var15 && field707[var17] + field705[var17] > var14 && field705[var17] < var14 + var16) {
                                field711[var17] = true;
                            }
                        }
                    }
                }
                if (var10 == 1 || !Statics.field1784 && var10 == 4) {
                    int var18 = Statics.field1193;
                    int var19 = Statics.field4263;
                    int var20 = Statics.field1330;
                    int var21 = class33.field232;
                    int var22 = class33.field214;
                    int var23 = -1;
                    for (int var24 = 0; var24 < field695; var24++) {
                        int var25 = (field695 - 1 - var24) * 15 + var19 + 31;
                        if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                            var23 = var24;
                        }
                    }
                    if (var23 != -1 && var23 >= 0) {
                        int var26 = field629[var23];
                        int var27 = field630[var23];
                        int var28 = field701[var23];
                        int var29 = field632[var23];
                        String var30 = field633[var23];
                        String var31 = field634[var23];
                        method5803(var26, var27, var28, var29, var30, var31, class33.field232, class33.field214);
                    }
                    field627 = false;
                    int var32 = Statics.field1193;
                    int var33 = Statics.field4263;
                    int var34 = Statics.field1330;
                    int var35 = Statics.field475;
                    for (int var36 = 0; var36 < field699; var36++) {
                        if (field706[var36] + field704[var36] > var32 && field704[var36] < var32 + var34 && field707[var36] + field705[var36] > var33 && field705[var36] < var33 + var35) {
                            field711[var36] = true;
                        }
                    }
                }
            } else {
                var37 = field695 - 1;
                if ((var10 == 1 || !Statics.field1784 && var10 == 4) && var37 >= 0) {
                    int var39 = field701[var37];
                    if (var39 == 39 || var39 == 40 || var39 == 41 || var39 == 42 || var39 == 43 || var39 == 33 || var39 == 34 || var39 == 35 || var39 == 36 || var39 == 37 || var39 == 38 || var39 == 1005) {
                        var40 = field629[var37];
                        var41 = field630[var37];
                        class262 var42 = class262.method2058(var41);
                        int var43 = method3375(var42);
                        boolean var44 = (var43 >> 28 & 0x1) != 0;
                        if (var44) {
                            break label248;
                        }
                        class263 var10000 = (class263) null;
                        if (class263.method2376(method3375(var42))) {
                            break label248;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field1784 && var10 == 4) && this.method1061()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field1784 && var10 == 4) && field695 > 0 && var37 >= 0) {
                    int var45 = field629[var37];
                    int var46 = field630[var37];
                    int var47 = field701[var37];
                    int var48 = field632[var37];
                    String var49 = field633[var37];
                    String var50 = field634[var37];
                    method5803(var45, var46, var47, var48, var49, var50, class33.field232, class33.field214);
                }
                if (var10 == 2 && field695 > 0) {
                    this.method1062(class33.field232, class33.field214);
                }
            }
            return;
        }
        if (Statics.field211 != null && !field603 && field695 > 0 && !this.method1061()) {
            method4020(field676, field601);
        }
        field603 = false;
        field604 = 0;
        if (Statics.field211 != null) {
            method204(Statics.field211);
        }
        Statics.field211 = class262.method2058(var41);
        field599 = var40;
        field676 = class33.field232;
        field601 = class33.field214;
        if (var37 >= 0) {
            method4753(var37);
        }
        method204(Statics.field211);
    }

    @ObfuscatedName("client.hn(I)Z")
    public final boolean method1061() {
        int var1 = field695 - 1;
        boolean var3 = field626 == 1 && field695 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field701[var1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 1007) {
                    var4 = true;
                } else {
                    var4 = false;
                }
            }
            var3 = var4;
        }
        return var3 && !field635[var1];
    }

    @ObfuscatedName("client.hu(III)V")
    public final void method1062(int arg0, int arg1) {
        method4562(arg0, arg1);
        Statics.field3027.method3917(Statics.field2592, arg0, arg1, false);
        field627 = true;
    }

    @ObfuscatedName("jt.hk(III)V")
    public static void method4562(int arg0, int arg1) {
        int var2 = Statics.field834.method5201(class283.field3492);
        for (int var3 = 0; var3 < field695; var3++) {
            class315 var4 = Statics.field834;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field634[var3].length() > 0) {
                var5 = field633[var3] + class283.field3328 + field634[var3];
            } else {
                var5 = field633[var3];
            }
            int var6 = var4.method5201(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field695 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field3203) {
            var8 = Statics.field3203 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1050) {
            var9 = Statics.field1050 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1193 = var8;
        Statics.field4263 = var9;
        Statics.field1330 = var2;
        Statics.field475 = field695 * 15 + 22;
    }

    @ObfuscatedName("nr.hw(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method5803(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 28) {
            class242 var8 = class242.method2075(class240.field2740, field639.field1287);
            var8.field2780.method6258(arg1);
            field639.method2246(var8);
            class262 var9 = class262.method2058(arg1);
            if (var9.field3170 != null && var9.field3170[0][0] == 5) {
                int var10 = var9.field3170[0][1];
                class257.field3009[var10] = 1 - class257.field3009[var10];
                method2617(var10);
            }
        }
        if (arg2 == 1003) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            class91 var11 = field532[arg3];
            if (var11 != null) {
                class161 var12 = var11.field1219;
                if (var12.field1738 != null) {
                    var12 = var12.method2771();
                }
                if (var12 != null) {
                    class242 var13 = class242.method2075(class240.field2760, field639.field1287);
                    var13.field2780.method6307(var12.field1715);
                    field639.method2246(var13);
                }
            }
        }
        if (arg2 == 16) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var14 = class242.method2075(class240.field2682, field639.field1287);
            var14.field2780.method6269(class24.field118[82] ? 1 : 0);
            var14.field2780.method6307(arg3);
            var14.field2780.method6256(Statics.field2778);
            var14.field2780.method6258(Statics.field1355);
            var14.field2780.method6405(Statics.field3028 + arg1);
            var14.field2780.method6306(Statics.field3669);
            var14.field2780.method6307(Statics.field2131 + arg0);
            field639.method2246(var14);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1243.method5984(arg2, arg3, new class258(arg0), new class258(arg1));
        }
        if (arg2 == 34) {
            class242 var15 = class242.method2075(class240.field2732, field639.field1287);
            var15.field2780.method6405(arg0);
            var15.field2780.method6306(arg3);
            var15.field2780.method6317(arg1);
            field639.method2246(var15);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 12) {
            class91 var16 = field532[arg3];
            if (var16 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var17 = class242.method2075(class240.field2692, field639.field1287);
                var17.field2780.method6493(class24.field118[82] ? 1 : 0);
                var17.field2780.method6256(arg3);
                field639.method2246(var17);
            }
        }
        if (arg2 == 40) {
            class242 var18 = class242.method2075(class240.field2678, field639.field1287);
            var18.field2780.method6307(arg3);
            var18.field2780.method6317(arg1);
            var18.field2780.method6256(arg0);
            field639.method2246(var18);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 44) {
            class83 var19 = field642[arg3];
            if (var19 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var20 = class242.method2075(class240.field2741, field639.field1287);
                var20.field2780.method6269(class24.field118[82] ? 1 : 0);
                var20.field2780.method6306(arg3);
                field639.method2246(var20);
            }
        }
        if (arg2 == 7) {
            class91 var21 = field532[arg3];
            if (var21 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var22 = class242.method2075(class240.field2718, field639.field1287);
                var22.field2780.method6318(Statics.field1355);
                var22.field2780.method6307(arg3);
                var22.field2780.method6269(class24.field118[82] ? 1 : 0);
                var22.field2780.method6306(Statics.field2778);
                var22.field2780.method6306(Statics.field3669);
                field639.method2246(var22);
            }
        }
        if (arg2 == 47) {
            class83 var23 = field642[arg3];
            if (var23 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var24 = class242.method2075(class240.field2683, field639.field1287);
                var24.field2780.method6307(arg3);
                var24.field2780.method6442(class24.field118[82] ? 1 : 0);
                field639.method2246(var24);
            }
        }
        if (arg2 == 6) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var25 = class242.method2075(class240.field2701, field639.field1287);
            var25.field2780.method6307(Statics.field3028 + arg1);
            var25.field2780.method6307(Statics.field2131 + arg0);
            var25.field2780.method6402(class24.field118[82] ? 1 : 0);
            var25.field2780.method6405(arg3);
            field639.method2246(var25);
        }
        if (arg2 == 35) {
            class242 var26 = class242.method2075(class240.field2715, field639.field1287);
            var26.field2780.method6307(arg3);
            var26.field2780.method6316(arg1);
            var26.field2780.method6307(arg0);
            field639.method2246(var26);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 41) {
            class242 var27 = class242.method2075(class240.field2700, field639.field1287);
            var27.field2780.method6317(arg1);
            var27.field2780.method6306(arg0);
            var27.field2780.method6256(arg3);
            field639.method2246(var27);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 23) {
            if (field627) {
                Statics.field3027.method3862();
            } else {
                Statics.field3027.method3917(Statics.field2592, arg0, arg1, true);
            }
        }
        if (arg2 == 24) {
            class262 var28 = class262.method2058(arg1);
            boolean var29 = true;
            if (var28.field3113 > 0) {
                var29 = method4252(var28);
            }
            if (var29) {
                class242 var30 = class242.method2075(class240.field2740, field639.field1287);
                var30.field2780.method6258(arg1);
                field639.method2246(var30);
            }
        }
        if (arg2 == 14) {
            class83 var31 = field642[arg3];
            if (var31 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var32 = class242.method2075(class240.field2754, field639.field1287);
                var32.field2780.method6307(Statics.field3669);
                var32.field2780.method6493(class24.field118[82] ? 1 : 0);
                var32.field2780.method6316(Statics.field1355);
                var32.field2780.method6405(Statics.field2778);
                var32.field2780.method6307(arg3);
                field639.method2246(var32);
            }
        }
        if (arg2 == 2) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var33 = class242.method2075(class240.field2729, field639.field1287);
            var33.field2780.method6307(field648);
            var33.field2780.method6318(Statics.field2604);
            var33.field2780.method6307(Statics.field2131 + arg0);
            var33.field2780.method6306(Statics.field3028 + arg1);
            var33.field2780.method6493(class24.field118[82] ? 1 : 0);
            var33.field2780.method6256(arg3);
            var33.field2780.method6405(field647);
            field639.method2246(var33);
        }
        if (arg2 == 37) {
            class242 var34 = class242.method2075(class240.field2660, field639.field1287);
            var34.field2780.method6306(arg3);
            var34.field2780.method6318(arg1);
            var34.field2780.method6256(arg0);
            field639.method2246(var34);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 3) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var35 = class242.method2075(class240.field2763, field639.field1287);
            var35.field2780.method6405(arg3);
            var35.field2780.method6402(class24.field118[82] ? 1 : 0);
            var35.field2780.method6405(Statics.field3028 + arg1);
            var35.field2780.method6405(Statics.field2131 + arg0);
            field639.method2246(var35);
        }
        if (arg2 == 5) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var36 = class242.method2075(class240.field2713, field639.field1287);
            var36.field2780.method6306(Statics.field3028 + arg1);
            var36.field2780.method6269(class24.field118[82] ? 1 : 0);
            var36.field2780.method6405(Statics.field2131 + arg0);
            var36.field2780.method6307(arg3);
            field639.method2246(var36);
        }
        if (arg2 == 1002) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            class242 var37 = class242.method2075(class240.field2694, field639.field1287);
            var37.field2780.method6405(arg3);
            field639.method2246(var37);
        }
        if (arg2 == 11) {
            class91 var38 = field532[arg3];
            if (var38 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var39 = class242.method2075(class240.field2712, field639.field1287);
                var39.field2780.method6269(class24.field118[82] ? 1 : 0);
                var39.field2780.method6306(arg3);
                field639.method2246(var39);
            }
        }
        if (arg2 == 25) {
            class262 var40 = class262.method4179(arg1, arg0);
            if (var40 != null) {
                method4513();
                method4691(arg1, arg0, class263.method1729(method3375(var40)), var40.field3096);
                field499 = 0;
                field649 = method571(var40);
                if (field649 == null) {
                    field649 = class283.field3360;
                }
                if (var40.field3125) {
                    field557 = var40.field3152 + class92.method2841(16777215);
                } else {
                    field557 = class92.method2841(65280) + var40.field3174 + class92.method2841(16777215);
                }
            }
            return;
        }
        if (arg2 == 49) {
            class83 var41 = field642[arg3];
            if (var41 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var42 = class242.method2075(class240.field2696, field639.field1287);
                var42.field2780.method6442(class24.field118[82] ? 1 : 0);
                var42.field2780.method6306(arg3);
                field639.method2246(var42);
            }
        }
        if (arg2 == 21) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var43 = class242.method2075(class240.field2664, field639.field1287);
            var43.field2780.method6405(arg3);
            var43.field2780.method6402(class24.field118[82] ? 1 : 0);
            var43.field2780.method6307(Statics.field2131 + arg0);
            var43.field2780.method6405(Statics.field3028 + arg1);
            field639.method2246(var43);
        }
        if (arg2 == 1) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var44 = class242.method2075(class240.field2764, field639.field1287);
            var44.field2780.method6405(arg3);
            var44.field2780.method6405(Statics.field2778);
            var44.field2780.method6442(class24.field118[82] ? 1 : 0);
            var44.field2780.method6306(Statics.field3028 + arg1);
            var44.field2780.method6256(Statics.field2131 + arg0);
            var44.field2780.method6317(Statics.field1355);
            var44.field2780.method6256(Statics.field3669);
            field639.method2246(var44);
        }
        if (arg2 == 39) {
            class242 var45 = class242.method2075(class240.field2727, field639.field1287);
            var45.field2780.method6318(arg1);
            var45.field2780.method6307(arg3);
            var45.field2780.method6306(arg0);
            field639.method2246(var45);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 50) {
            class83 var46 = field642[arg3];
            if (var46 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var47 = class242.method2075(class240.field2710, field639.field1287);
                var47.field2780.method6493(class24.field118[82] ? 1 : 0);
                var47.field2780.method6405(arg3);
                field639.method2246(var47);
            }
        }
        if (arg2 == 13) {
            class91 var48 = field532[arg3];
            if (var48 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var49 = class242.method2075(class240.field2734, field639.field1287);
                var49.field2780.method6307(arg3);
                var49.field2780.method6402(class24.field118[82] ? 1 : 0);
                field639.method2246(var49);
            }
        }
        if (arg2 == 31) {
            class242 var50 = class242.method2075(class240.field2717, field639.field1287);
            var50.field2780.method6256(Statics.field2778);
            var50.field2780.method6316(arg1);
            var50.field2780.method6256(Statics.field3669);
            var50.field2780.method6405(arg0);
            var50.field2780.method6405(arg3);
            var50.field2780.method6317(Statics.field1355);
            field639.method2246(var50);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 22) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var51 = class242.method2075(class240.field2737, field639.field1287);
            var51.field2780.method6402(class24.field118[82] ? 1 : 0);
            var51.field2780.method6256(Statics.field2131 + arg0);
            var51.field2780.method6256(arg3);
            var51.field2780.method6405(Statics.field3028 + arg1);
            field639.method2246(var51);
        }
        if (arg2 == 42) {
            class242 var52 = class242.method2075(class240.field2723, field639.field1287);
            var52.field2780.method6316(arg1);
            var52.field2780.method6405(arg3);
            var52.field2780.method6307(arg0);
            field639.method2246(var52);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 15) {
            class83 var53 = field642[arg3];
            if (var53 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var54 = class242.method2075(class240.field2765, field639.field1287);
                var54.field2780.method6493(class24.field118[82] ? 1 : 0);
                var54.field2780.method6318(Statics.field2604);
                var54.field2780.method6307(arg3);
                var54.field2780.method6307(field648);
                var54.field2780.method6307(field647);
                field639.method2246(var54);
            }
        }
        if (arg2 == 1005) {
            class262 var55 = class262.method2058(arg1);
            if (var55 == null || var55.field3177[arg0] < 100000) {
                class242 var56 = class242.method2075(class240.field2752, field639.field1287);
                var56.field2780.method6306(arg3);
                field639.method2246(var56);
            } else {
                class98.method5671(27, "", var55.field3177[arg0] + " x " + class170.method2099(arg3).field1876);
            }
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 46) {
            class83 var57 = field642[arg3];
            if (var57 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var58 = class242.method2075(class240.field2665, field639.field1287);
                var58.field2780.method6307(arg3);
                var58.field2780.method6269(class24.field118[82] ? 1 : 0);
                field639.method2246(var58);
            }
        }
        if (arg2 == 17) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var59 = class242.method2075(class240.field2673, field639.field1287);
            var59.field2780.method6306(Statics.field3028 + arg1);
            var59.field2780.method6306(arg3);
            var59.field2780.method6493(class24.field118[82] ? 1 : 0);
            var59.field2780.method6256(field647);
            var59.field2780.method6405(field648);
            var59.field2780.method6307(Statics.field2131 + arg0);
            var59.field2780.method6318(Statics.field2604);
            field639.method2246(var59);
        }
        if (arg2 == 26) {
            method3188();
        }
        if (arg2 == 33) {
            class242 var60 = class242.method2075(class240.field2669, field639.field1287);
            var60.field2780.method6316(arg1);
            var60.field2780.method6306(arg0);
            var60.field2780.method6256(arg3);
            field639.method2246(var60);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 36) {
            class242 var61 = class242.method2075(class240.field2686, field639.field1287);
            var61.field2780.method6307(arg0);
            var61.field2780.method6405(arg3);
            var61.field2780.method6318(arg1);
            field639.method2246(var61);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class262 var62 = class262.method4179(arg1, arg0);
            if (var62 != null) {
                method1004(arg3, arg1, arg0, var62.field3096, arg5);
            }
        }
        if (arg2 == 9) {
            class91 var63 = field532[arg3];
            if (var63 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var64 = class242.method2075(class240.field2730, field639.field1287);
                var64.field2780.method6493(class24.field118[82] ? 1 : 0);
                var64.field2780.method6256(arg3);
                field639.method2246(var64);
            }
        }
        if (arg2 == 30 && field657 == null) {
            method959(arg1, arg0);
            field657 = class262.method4179(arg1, arg0);
            method204(field657);
        }
        if (arg2 == 32) {
            class242 var65 = class242.method2075(class240.field2720, field639.field1287);
            var65.field2780.method6256(field647);
            var65.field2780.method6405(arg0);
            var65.field2780.method6405(arg3);
            var65.field2780.method6258(arg1);
            var65.field2780.method6317(Statics.field2604);
            field639.method2246(var65);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 29) {
            class242 var66 = class242.method2075(class240.field2740, field639.field1287);
            var66.field2780.method6258(arg1);
            field639.method2246(var66);
            class262 var67 = class262.method2058(arg1);
            if (var67.field3170 != null && var67.field3170[0][0] == 5) {
                int var68 = var67.field3170[0][1];
                if (class257.field3009[var68] != var67.field3110[0]) {
                    class257.field3009[var68] = var67.field3110[0];
                    method2617(var68);
                }
            }
        }
        if (arg2 == 4) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var69 = class242.method2075(class240.field2709, field639.field1287);
            var69.field2780.method6405(Statics.field3028 + arg1);
            var69.field2780.method6307(Statics.field2131 + arg0);
            var69.field2780.method6269(class24.field118[82] ? 1 : 0);
            var69.field2780.method6307(arg3);
            field639.method2246(var69);
        }
        if (arg2 == 18) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var70 = class242.method2075(class240.field2684, field639.field1287);
            var70.field2780.method6269(class24.field118[82] ? 1 : 0);
            var70.field2780.method6306(Statics.field3028 + arg1);
            var70.field2780.method6256(Statics.field2131 + arg0);
            var70.field2780.method6307(arg3);
            field639.method2246(var70);
        }
        if (arg2 == 19) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var71 = class242.method2075(class240.field2693, field639.field1287);
            var71.field2780.method6256(arg3);
            var71.field2780.method6405(Statics.field2131 + arg0);
            var71.field2780.method6269(class24.field118[82] ? 1 : 0);
            var71.field2780.method6307(Statics.field3028 + arg1);
            field639.method2246(var71);
        }
        if (arg2 == 45) {
            class83 var72 = field642[arg3];
            if (var72 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var73 = class242.method2075(class240.field2762, field639.field1287);
                var73.field2780.method6493(class24.field118[82] ? 1 : 0);
                var73.field2780.method6307(arg3);
                field639.method2246(var73);
            }
        }
        if (arg2 == 8) {
            class91 var74 = field532[arg3];
            if (var74 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var75 = class242.method2075(class240.field2748, field639.field1287);
                var75.field2780.method6306(field647);
                var75.field2780.method6405(arg3);
                var75.field2780.method6316(Statics.field2604);
                var75.field2780.method6442(class24.field118[82] ? 1 : 0);
                var75.field2780.method6256(field648);
                field639.method2246(var75);
            }
        }
        if (arg2 == 20) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var76 = class242.method2075(class240.field2708, field639.field1287);
            var76.field2780.method6306(Statics.field3028 + arg1);
            var76.field2780.method6256(Statics.field2131 + arg0);
            var76.field2780.method6269(class24.field118[82] ? 1 : 0);
            var76.field2780.method6405(arg3);
            field639.method2246(var76);
        }
        if (arg2 == 10) {
            class91 var77 = field532[arg3];
            if (var77 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var78 = class242.method2075(class240.field2722, field639.field1287);
                var78.field2780.method6442(class24.field118[82] ? 1 : 0);
                var78.field2780.method6307(arg3);
                field639.method2246(var78);
            }
        }
        if (arg2 == 43) {
            class242 var79 = class242.method2075(class240.field2690, field639.field1287);
            var79.field2780.method6405(arg3);
            var79.field2780.method6256(arg0);
            var79.field2780.method6258(arg1);
            field639.method2246(var79);
            field621 = 0;
            Statics.field32 = class262.method2058(arg1);
            field598 = arg0;
        }
        if (arg2 == 1004) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            class242 var80 = class242.method2075(class240.field2752, field639.field1287);
            var80.field2780.method6306(arg3);
            field639.method2246(var80);
        }
        if (arg2 == 51) {
            class83 var81 = field642[arg3];
            if (var81 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var82 = class242.method2075(class240.field2663, field639.field1287);
                var82.field2780.method6405(arg3);
                var82.field2780.method6269(class24.field118[82] ? 1 : 0);
                field639.method2246(var82);
            }
        }
        if (arg2 == 1001) {
            field592 = arg6;
            field593 = arg7;
            field594 = 2;
            field538 = 0;
            field607 = arg0;
            field729 = arg1;
            class242 var83 = class242.method2075(class240.field2702, field639.field1287);
            var83.field2780.method6306(arg3);
            var83.field2780.method6306(Statics.field3028 + arg1);
            var83.field2780.method6306(Statics.field2131 + arg0);
            var83.field2780.method6442(class24.field118[82] ? 1 : 0);
            field639.method2246(var83);
        }
        if (arg2 == 48) {
            class83 var84 = field642[arg3];
            if (var84 != null) {
                field592 = arg6;
                field593 = arg7;
                field594 = 2;
                field538 = 0;
                field607 = arg0;
                field729 = arg1;
                class242 var85 = class242.method2075(class240.field2679, field639.field1287);
                var85.field2780.method6306(arg3);
                var85.field2780.method6269(class24.field118[82] ? 1 : 0);
                field639.method2246(var85);
            }
        }
        if (arg2 == 58) {
            class262 var86 = class262.method4179(arg1, arg0);
            if (var86 != null) {
                class242 var87 = class242.method2075(class240.field2672, field639.field1287);
                var87.field2780.method6318(Statics.field2604);
                var87.field2780.method6318(arg1);
                var87.field2780.method6307(var86.field3096);
                var87.field2780.method6306(field648);
                var87.field2780.method6306(arg0);
                var87.field2780.method6405(field647);
                field639.method2246(var87);
            }
        }
        if (arg2 != 38) {
            if (field499 != 0) {
                field499 = 0;
                method204(class262.method2058(Statics.field1355));
            }
            if (field646) {
                method4513();
            }
            if (Statics.field32 != null && field621 == 0) {
                method204(Statics.field32);
            }
            return;
        }
        method4513();
        class262 var88 = class262.method2058(arg1);
        field499 = 1;
        Statics.field3669 = arg0;
        Statics.field1355 = arg1;
        Statics.field2778 = arg3;
        method204(var88);
        field498 = class92.method2841(16748608) + class170.method2099(arg3).field1876 + class92.method2841(16777215);
        if (field498 == null) {
            field498 = class283.field3360;
        }
    }

    @ObfuscatedName("y.hc(ILjava/lang/String;I)V")
    public static void method97(int arg0, String arg1) {
        int var2 = class96.field1251;
        int[] var3 = class96.field1252;
        boolean var4 = false;
        class422 var5 = new class422(arg1, Statics.field2137);
        for (int var6 = 0; var6 < var2; var6++) {
            class83 var7 = field642[var3[var6]];
            if (var7 != null && Statics.field868 != var7 && var7.field1067 != null && var7.field1067.equals(var5)) {
                if (arg0 == 1) {
                    class242 var8 = class242.method2075(class240.field2741, field639.field1287);
                    var8.field2780.method6269(0);
                    var8.field2780.method6306(var3[var6]);
                    field639.method2246(var8);
                } else if (arg0 == 4) {
                    class242 var9 = class242.method2075(class240.field2683, field639.field1287);
                    var9.field2780.method6307(var3[var6]);
                    var9.field2780.method6442(0);
                    field639.method2246(var9);
                } else if (arg0 == 6) {
                    class242 var10 = class242.method2075(class240.field2696, field639.field1287);
                    var10.field2780.method6442(0);
                    var10.field2780.method6306(var3[var6]);
                    field639.method2246(var10);
                } else if (arg0 == 7) {
                    class242 var11 = class242.method2075(class240.field2710, field639.field1287);
                    var11.field2780.method6493(0);
                    var11.field2780.method6405(var3[var6]);
                    field639.method2246(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class98.method5671(4, "", class283.field3579 + arg1);
        }
    }

    @ObfuscatedName("jx.hf(IIIII)V")
    public static void method4691(int arg0, int arg1, int arg2, int arg3) {
        class262 var4 = class262.method4179(arg0, arg1);
        if (var4 != null && var4.field3041 != null) {
            class81 var5 = new class81();
            var5.field1040 = var4;
            var5.field1042 = var4.field3041;
            class64.method4138(var5);
        }
        field648 = arg3;
        field646 = true;
        Statics.field2604 = arg0;
        field647 = arg1;
        Statics.field1837 = arg2;
        method204(var4);
    }

    @ObfuscatedName("ia.he(I)V")
    public static void method4513() {
        if (!field646) {
            return;
        }
        class262 var0 = class262.method4179(Statics.field2604, field647);
        if (var0 != null && var0.field3036 != null) {
            class81 var1 = new class81();
            var1.field1040 = var0;
            var1.field1042 = var0.field3036;
            class64.method4138(var1);
        }
        field648 = -1;
        field646 = false;
        method204(var0);
    }

    @ObfuscatedName("ai.hh(III)V")
    public static void method959(int arg0, int arg1) {
        class242 var2 = class242.method2075(class240.field2735, field639.field1287);
        var2.field2780.method6306(arg1);
        var2.field2780.method6258(arg0);
        field639.method2246(var2);
    }

    @ObfuscatedName("bf.hv(IIIILjava/lang/String;I)V")
    public static void method1004(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class262 var5 = class262.method4179(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3154 != null) {
            class81 var6 = new class81();
            var6.field1040 = var5;
            var6.field1037 = arg0;
            var6.field1046 = arg4;
            var6.field1042 = var5.field3154;
            class64.method4138(var6);
        }
        boolean var7 = true;
        if (var5.field3113 > 0) {
            var7 = method4252(var5);
        }
        if (!var7 || !class263.method2538(method3375(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class242 var8 = class242.method2075(class240.field2689, field639.field1287);
            var8.field2780.method6258(arg1);
            var8.field2780.method6256(arg2);
            var8.field2780.method6256(arg3);
            field639.method2246(var8);
        }
        if (arg0 == 2) {
            class242 var9 = class242.method2075(class240.field2761, field639.field1287);
            var9.field2780.method6258(arg1);
            var9.field2780.method6256(arg2);
            var9.field2780.method6256(arg3);
            field639.method2246(var9);
        }
        if (arg0 == 3) {
            class242 var10 = class242.method2075(class240.field2753, field639.field1287);
            var10.field2780.method6258(arg1);
            var10.field2780.method6256(arg2);
            var10.field2780.method6256(arg3);
            field639.method2246(var10);
        }
        if (arg0 == 4) {
            class242 var11 = class242.method2075(class240.field2699, field639.field1287);
            var11.field2780.method6258(arg1);
            var11.field2780.method6256(arg2);
            var11.field2780.method6256(arg3);
            field639.method2246(var11);
        }
        if (arg0 == 5) {
            class242 var12 = class242.method2075(class240.field2744, field639.field1287);
            var12.field2780.method6258(arg1);
            var12.field2780.method6256(arg2);
            var12.field2780.method6256(arg3);
            field639.method2246(var12);
        }
        if (arg0 == 6) {
            class242 var13 = class242.method2075(class240.field2767, field639.field1287);
            var13.field2780.method6258(arg1);
            var13.field2780.method6256(arg2);
            var13.field2780.method6256(arg3);
            field639.method2246(var13);
        }
        if (arg0 == 7) {
            class242 var14 = class242.method2075(class240.field2731, field639.field1287);
            var14.field2780.method6258(arg1);
            var14.field2780.method6256(arg2);
            var14.field2780.method6256(arg3);
            field639.method2246(var14);
        }
        if (arg0 == 8) {
            class242 var15 = class242.method2075(class240.field2671, field639.field1287);
            var15.field2780.method6258(arg1);
            var15.field2780.method6256(arg2);
            var15.field2780.method6256(arg3);
            field639.method2246(var15);
        }
        if (arg0 == 9) {
            class242 var16 = class242.method2075(class240.field2706, field639.field1287);
            var16.field2780.method6258(arg1);
            var16.field2780.method6256(arg2);
            var16.field2780.method6256(arg3);
            field639.method2246(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class242 var17 = class242.method2075(class240.field2739, field639.field1287);
        var17.field2780.method6258(arg1);
        var17.field2780.method6256(arg2);
        var17.field2780.method6256(arg3);
        field639.method2246(var17);
    }

    @ObfuscatedName("ji.hs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4676(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2881(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("fd.if(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method2881(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field627 || field695 >= 500) {
            return;
        }
        field633[field695] = arg0;
        field634[field695] = arg1;
        field701[field695] = arg2;
        field632[field695] = arg3;
        field629[field695] = arg4;
        field630[field695] = arg5;
        field635[field695] = arg6;
        field695++;
    }

    @ObfuscatedName("es.ii(B)V")
    public static void method2498() {
        for (int var0 = 0; var0 < field695; var0++) {
            int var1 = field701[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field695 - 1) {
                    for (int var3 = var0; var3 < field695 - 1; var3++) {
                        field633[var3] = field633[var3 + 1];
                        field634[var3] = field634[var3 + 1];
                        field701[var3] = field701[var3 + 1];
                        field632[var3] = field632[var3 + 1];
                        field629[var3] = field629[var3 + 1];
                        field630[var3] = field630[var3 + 1];
                        field635[var3] = field635[var3 + 1];
                    }
                }
                var0--;
                field695--;
            }
        }
        method4562(Statics.field1330 / 2 + Statics.field1193, Statics.field4263);
    }

    @ObfuscatedName("ew.it(IIIIB)V")
    public static final void method2558(int arg0, int arg1, int arg2, int arg3) {
        if (field499 == 0 && !field646) {
            method4676(class283.field3526, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class221.method2351(); var8++) {
            long var9 = class221.method3572(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class221.method6534(var8);
                int var12 = class221.method3072(class221.field2583[var8]);
                int var13 = var12;
                long var14 = class221.field2583[var8];
                int var16 = (int) (var14 >>> 14 & 0x3L);
                int var19 = class221.method1972(class221.field2583[var8]);
                int var20 = var19;
                if (var16 == 2 && Statics.field3027.method3854(Statics.field2592, var11, var12, var9) >= 0) {
                    class169 var21 = class169.method4277(var19);
                    if (var21.field1863 != null) {
                        var21 = var21.method2967();
                    }
                    if (var21 == null) {
                        continue;
                    }
                    if (field499 == 1) {
                        method4676(class283.field3489, field498 + " " + class92.field1220 + " " + class92.method2841(65535) + var21.field1832, 1, var19, var11, var12);
                    } else if (!field646) {
                        String[] var22 = var21.field1849;
                        if (var22 != null) {
                            for (int var23 = 4; var23 >= 0; var23--) {
                                if (var22[var23] != null) {
                                    short var24 = 0;
                                    if (var23 == 0) {
                                        var24 = 3;
                                    }
                                    if (var23 == 1) {
                                        var24 = 4;
                                    }
                                    if (var23 == 2) {
                                        var24 = 5;
                                    }
                                    if (var23 == 3) {
                                        var24 = 6;
                                    }
                                    if (var23 == 4) {
                                        var24 = 1001;
                                    }
                                    method4676(var22[var23], class92.method2841(65535) + var21.field1832, var24, var20, var11, var13);
                                }
                            }
                        }
                        method4676(class283.field3545, class92.method2841(65535) + var21.field1832, 1002, var21.field1833, var11, var13);
                    } else if ((Statics.field1837 & 0x4) == 4) {
                        method4676(field649, field557 + " " + class92.field1220 + " " + class92.method2841(65535) + var21.field1832, 2, var19, var11, var12);
                    }
                }
                if (var16 == 1) {
                    class91 var25 = field532[var20];
                    if (var25 == null) {
                        continue;
                    }
                    if (var25.field1219.field1717 == 1 && (var25.field1140 & 0x7F) == 64 && (var25.field1124 & 0x7F) == 64) {
                        for (int var26 = 0; var26 < field513; var26++) {
                            class91 var27 = field532[field534[var26]];
                            if (var27 != null && var25 != var27 && var27.field1219.field1717 == 1 && var25.field1140 == var27.field1140 && var25.field1124 == var27.field1124) {
                                method4668(var27.field1219, field534[var26], var11, var13);
                            }
                        }
                        int var28 = class96.field1251;
                        int[] var29 = class96.field1252;
                        for (int var30 = 0; var30 < var28; var30++) {
                            class83 var31 = field642[var29[var30]];
                            if (var31 != null && var25.field1140 == var31.field1140 && var25.field1124 == var31.field1124) {
                                method1006(var31, var29[var30], var11, var13);
                            }
                        }
                    }
                    method4668(var25.field1219, var20, var11, var13);
                }
                if (var16 == 0) {
                    class83 var32 = field642[var20];
                    if (var32 == null) {
                        continue;
                    }
                    if ((var32.field1140 & 0x7F) == 64 && (var32.field1124 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < field513; var33++) {
                            class91 var34 = field532[field534[var33]];
                            if (var34 != null && var34.field1219.field1717 == 1 && var32.field1140 == var34.field1140 && var32.field1124 == var34.field1124) {
                                method4668(var34.field1219, field534[var33], var11, var13);
                            }
                        }
                        int var35 = class96.field1251;
                        int[] var36 = class96.field1252;
                        for (int var37 = 0; var37 < var35; var37++) {
                            class83 var38 = field642[var36[var37]];
                            if (var38 != null && var32 != var38 && var32.field1140 == var38.field1140 && var32.field1124 == var38.field1124) {
                                method1006(var38, var36[var37], var11, var13);
                            }
                        }
                    }
                    if (field618 == var20) {
                        var4 = var9;
                    } else {
                        method1006(var32, var20, var11, var13);
                    }
                }
                if (var16 == 3) {
                    class309 var39 = field619[Statics.field2592][var11][var13];
                    if (var39 != null) {
                        for (class95 var40 = (class95) var39.method5021(); var40 != null; var40 = (class95) var39.method5023()) {
                            class170 var41 = class170.method2099(var40.field1245);
                            if (field499 == 1) {
                                method4676(class283.field3489, field498 + " " + class92.field1220 + " " + class92.method2841(16748608) + var41.field1876, 16, var40.field1245, var11, var13);
                            } else if (!field646) {
                                String[] var42 = var41.field1928;
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        byte var44 = 0;
                                        if (var43 == 0) {
                                            var44 = 18;
                                        }
                                        if (var43 == 1) {
                                            var44 = 19;
                                        }
                                        if (var43 == 2) {
                                            var44 = 20;
                                        }
                                        if (var43 == 3) {
                                            var44 = 21;
                                        }
                                        if (var43 == 4) {
                                            var44 = 22;
                                        }
                                        method4676(var42[var43], class92.method2841(16748608) + var41.field1876, var44, var40.field1245, var11, var13);
                                    } else if (var43 == 2) {
                                        method4676(class283.field3327, class92.method2841(16748608) + var41.field1876, 20, var40.field1245, var11, var13);
                                    }
                                }
                                method4676(class283.field3545, class92.method2841(16748608) + var41.field1876, 1004, var40.field1245, var11, var13);
                            } else if ((Statics.field1837 & 0x1) == 1) {
                                method4676(field649, field557 + " " + class92.field1220 + " " + class92.method2841(16748608) + var41.field1876, 17, var40.field1245, var11, var13);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var45 = class221.method4595(var4);
            int var46 = class221.method3072(var4);
            class83 var47 = field642[field618];
            method1006(var47, field618, var45, var46);
        }
    }

    @ObfuscatedName("jv.ik(Lfg;IIII)V")
    public static final void method4668(class161 arg0, int arg1, int arg2, int arg3) {
        if (field695 >= 400) {
            return;
        }
        if (arg0.field1738 != null) {
            arg0 = arg0.method2771();
        }
        if (arg0 == null || !arg0.field1744 || arg0.field1746 && field482 != arg1) {
            return;
        }
        String var4 = arg0.field1716;
        if (arg0.field1733 != 0) {
            int var6 = arg0.field1733;
            int var7 = Statics.field868.field1074;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class92.method2841(16711680);
            } else if (var8 < -6) {
                var9 = class92.method2841(16723968);
            } else if (var8 < -3) {
                var9 = class92.method2841(16740352);
            } else if (var8 < 0) {
                var9 = class92.method2841(16756736);
            } else if (var8 > 9) {
                var9 = class92.method2841(65280);
            } else if (var8 > 6) {
                var9 = class92.method2841(4259584);
            } else if (var8 > 3) {
                var9 = class92.method2841(8453888);
            } else if (var8 > 0) {
                var9 = class92.method2841(12648192);
            } else {
                var9 = class92.method2841(16776960);
            }
            var4 = var4 + var9 + " " + class92.field1224 + class283.field3495 + arg0.field1733 + class92.field1223;
        }
        if (arg0.field1746 && field746) {
            method4676(class283.field3545, class92.method2841(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field499 == 1) {
            method4676(class283.field3489, field498 + " " + class92.field1220 + " " + class92.method2841(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field646) {
            int var10 = arg0.field1746 && field746 ? 2000 : 0;
            String[] var11 = arg0.field1741;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class283.field3561)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        method4676(var11[var12], class92.method2841(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class283.field3561)) {
                        short var15 = 0;
                        if (field511 != class94.field1237) {
                            if (field511 == class94.field1234 || field511 == class94.field1239 && arg0.field1733 > Statics.field868.field1074) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            method4676(var11[var14], class92.method2841(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field1746 || !field746) {
                method4676(class283.field3545, class92.method2841(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1837 & 0x2) == 2) {
            method4676(field649, field557 + " " + class92.field1220 + " " + class92.method2841(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bj.iy(Lci;IIIB)V")
    public static final void method1006(class83 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field868 == arg0 || field695 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1072 == 0) {
            String var4 = arg0.field1078[0] + arg0.field1067 + arg0.field1078[1];
            int var5 = arg0.field1074;
            int var6 = Statics.field868.field1074;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class92.method2841(16711680);
            } else if (var7 < -6) {
                var8 = class92.method2841(16723968);
            } else if (var7 < -3) {
                var8 = class92.method2841(16740352);
            } else if (var7 < 0) {
                var8 = class92.method2841(16756736);
            } else if (var7 > 9) {
                var8 = class92.method2841(65280);
            } else if (var7 > 6) {
                var8 = class92.method2841(4259584);
            } else if (var7 > 3) {
                var8 = class92.method2841(8453888);
            } else if (var7 > 0) {
                var8 = class92.method2841(12648192);
            } else {
                var8 = class92.method2841(16776960);
            }
            var9 = var4 + var8 + " " + class92.field1224 + class283.field3495 + arg0.field1074 + class92.field1223 + arg0.field1078[2];
        } else {
            var9 = arg0.field1078[0] + arg0.field1067 + arg0.field1078[1] + " " + class92.field1224 + class283.field3496 + arg0.field1072 + class92.field1223 + arg0.field1078[2];
        }
        if (field499 == 1) {
            method4676(class283.field3489, field498 + " " + class92.field1220 + " " + class92.method2841(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field646) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field586[var10] != null) {
                    short var11 = 0;
                    if (field586[var10].equalsIgnoreCase(class283.field3561)) {
                        if (field605 == class94.field1237) {
                            continue;
                        }
                        if (field605 == class94.field1234 || field605 == class94.field1239 && arg0.field1074 > Statics.field868.field1074) {
                            var11 = 2000;
                        }
                        if (Statics.field868.field1081 == 0 || arg0.field1081 == 0) {
                            if (field605 == class94.field1238 && arg0.method2007()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field868.field1081 == arg0.field1081) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field550[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field614[var10] + var11;
                    method4676(field586[var10], class92.method2841(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1837 & 0x8) == 8) {
            method4676(field649, field557 + " " + class92.field1220 + " " + class92.method2841(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field695; var14++) {
            if (field701[var14] == 23) {
                field634[var14] = class92.method2841(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("d.iz(IIIIIIIII)V")
    public static final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class262.method4885(arg0)) {
            Statics.field453 = null;
            method1949(Statics.field3153[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field453 != null) {
                method1949(Statics.field453, -1412584499, arg1, arg2, arg3, arg4, Statics.field955, Statics.field1339, arg7);
                Statics.field453 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field711[var8] = true;
            }
        } else {
            field711[arg7] = true;
        }
    }

    @ObfuscatedName("bp.id([Ljt;IIIIIIIIB)V")
    public static final void method1949(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class410.method6573(arg2, arg3, arg4, arg5);
        class211.method3746();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class262 var10 = arg0[var9];
            if (var10 != null && (var10.field3134 == arg1 || arg1 == -1412584499 && field610 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field704[field699] = var10.field3061 + arg6;
                    field705[field699] = var10.field3172 + arg7;
                    field706[field699] = var10.field3063;
                    field707[field699] = var10.field3145;
                    var11 = ++field699 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3189 = var11;
                var10.field3179 = field494;
                if (!var10.field3125 || !method1641(var10)) {
                    if (var10.field3113 > 0) {
                        method81(var10);
                    }
                    int var12 = var10.field3061 + arg6;
                    int var13 = var10.field3172 + arg7;
                    int var14 = var10.field3190;
                    if (field610 == var10) {
                        if (arg1 != -1412584499 && !var10.field3132) {
                            Statics.field453 = arg0;
                            Statics.field955 = arg6;
                            Statics.field1339 = arg7;
                            continue;
                        }
                        if (field675 && field596) {
                            int var15 = class33.field224;
                            int var16 = class33.field225;
                            int var17 = var15 - field666;
                            int var18 = var16 - field667;
                            if (var17 < field670) {
                                var17 = field670;
                            }
                            if (var10.field3063 + var17 > field670 + field488.field3063) {
                                var17 = field670 + field488.field3063 - var10.field3063;
                            }
                            if (var18 < field671) {
                                var18 = field671;
                            }
                            if (var10.field3145 + var18 > field671 + field488.field3145) {
                                var18 = field671 + field488.field3145 - var10.field3145;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3132) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3146 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3146 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3063 + var12;
                        int var26 = var10.field3145 + var13;
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
                        int var29 = var10.field3063 + var12;
                        int var30 = var10.field3145 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3125 || var19 < var21 && var20 < var22) {
                        if (var10.field3113 != 0) {
                            if (var10.field3113 == 1336) {
                                if (field620) {
                                    var13 += 15;
                                    Statics.field3196.method5209("Fps:" + field185, var10.field3063 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field569) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3196.method5209("Mem:" + var32 + "k", var10.field3063 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3113 == 1337) {
                                field640 = var12;
                                field641 = var13;
                                method2042(var12, var13, var10.field3063, var10.field3145);
                                field711[var10.field3189] = true;
                                class410.method6573(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3113 == 1338) {
                                method2373(var10, var12, var13, var11);
                                class410.method6573(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3113 == 1339) {
                                method4666(var10, var12, var13, var11);
                                class410.method6573(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3113 == 1400) {
                                Statics.field1243.method5843(var12, var13, var10.field3063, var10.field3145, field494);
                            }
                            if (var10.field3113 == 1401) {
                                Statics.field1243.method5846(var12, var13, var10.field3063, var10.field3145);
                            }
                            if (var10.field3113 == 1402) {
                                Statics.field879.method2070(var12, field494);
                            }
                        }
                        if (var10.field3146 == 0) {
                            if (!var10.field3125 && method1641(var10) && Statics.field1619 != var10) {
                                continue;
                            }
                            if (!var10.field3125) {
                                if (var10.field3081 > var10.field3072 - var10.field3145) {
                                    var10.field3081 = var10.field3072 - var10.field3145;
                                }
                                if (var10.field3081 < 0) {
                                    var10.field3081 = 0;
                                }
                            }
                            method1949(arg0, var10.field3048, var19, var20, var21, var22, var12 - var10.field3100, var13 - var10.field3081, var11);
                            if (var10.field3182 != null) {
                                method1949(var10.field3182, var10.field3048, var19, var20, var21, var22, var12 - var10.field3100, var13 - var10.field3081, var11);
                            }
                            class80 var34 = (class80) field652.method6061((long) var10.field3048);
                            if (var34 != null) {
                                method376(var34.field1034, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class410.method6573(arg2, arg3, arg4, arg5);
                            class211.method3746();
                        }
                        if (field710 || field526[var11] || field615 > 1) {
                            if (var10.field3146 == 0 && !var10.field3125 && var10.field3072 > var10.field3145) {
                                Statics.method2242(var10.field3063 + var12, var13, var10.field3081, var10.field3145, var10.field3072);
                            }
                            if (var10.field3146 != 1) {
                                if (var10.field3146 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3195; var36++) {
                                        for (int var37 = 0; var37 < var10.field3059; var37++) {
                                            int var38 = (var10.field3115 + 32) * var37 + var12;
                                            int var39 = (var10.field3092 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3117[var35];
                                                var39 += var10.field3118[var35];
                                            }
                                            if (var10.field3176[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3176[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field211 == var10 && field599 == var35) {
                                                    class414 var43;
                                                    if (field499 == 1 && Statics.field3669 == var35 && Statics.field1355 == var10.field3048) {
                                                        var43 = class170.method2052(var42, var10.field3177[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class170.method2052(var42, var10.field3177[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method204(var10);
                                                    } else if (Statics.field211 == var10 && field599 == var35) {
                                                        int var44 = class33.field224 - field676;
                                                        int var45 = class33.field225 - field601;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field604 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6665(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class262 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class410.field4360 && var46.field3081 > 0) {
                                                                int var47 = field537 * (class410.field4360 - var39 - var45) / 3;
                                                                if (var47 > field537 * 10) {
                                                                    var47 = field537 * 10;
                                                                }
                                                                if (var47 > var46.field3081) {
                                                                    var47 = var46.field3081;
                                                                }
                                                                var46.field3081 -= var47;
                                                                field601 += var47;
                                                                method204(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class410.field4361 && var46.field3081 < var46.field3072 - var46.field3145) {
                                                                int var48 = field537 * (var39 + var45 + 32 - class410.field4361) / 3;
                                                                if (var48 > field537 * 10) {
                                                                    var48 = field537 * 10;
                                                                }
                                                                if (var48 > var46.field3072 - var46.field3145 - var46.field3081) {
                                                                    var48 = var46.field3072 - var46.field3145 - var46.field3081;
                                                                }
                                                                var46.field3081 += var48;
                                                                field601 -= var48;
                                                                method204(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field32 == var10 && field598 == var35) {
                                                        var43.method6665(var38, var39, 128);
                                                    } else {
                                                        var43.method6659(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3119 != null && var35 < 20) {
                                                class414 var49 = var10.method4564(var35);
                                                if (var49 != null) {
                                                    var49.method6659(var38, var39);
                                                } else if (class262.field3046) {
                                                    method204(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3146 == 3) {
                                    int var50;
                                    if (method5621(var10)) {
                                        var50 = var10.field3052;
                                        if (Statics.field1619 == var10 && var10.field3076 != 0) {
                                            var50 = var10.field3076;
                                        }
                                    } else {
                                        var50 = var10.field3073;
                                        if (Statics.field1619 == var10 && var10.field3075 != 0) {
                                            var50 = var10.field3075;
                                        }
                                    }
                                    if (var10.field3077) {
                                        switch(var10.field3078.field4370) {
                                            case 1:
                                                class410.method6602(var12, var13, var10.field3063, var10.field3145, var10.field3073, var10.field3052);
                                                break;
                                            case 2:
                                                class410.method6613(var12, var13, var10.field3063, var10.field3145, var10.field3073, var10.field3052, 255 - (var10.field3190 & 0xFF), 255 - (var10.field3080 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class410.method6595(var12, var13, var10.field3063, var10.field3145, var50);
                                                } else {
                                                    class410.method6616(var12, var13, var10.field3063, var10.field3145, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class410.method6566(var12, var13, var10.field3063, var10.field3145, var50);
                                    } else {
                                        class410.method6567(var12, var13, var10.field3063, var10.field3145, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3146 == 4) {
                                    class315 var51 = var10.method4554();
                                    if (var51 != null) {
                                        String var52 = var10.field3109;
                                        int var53;
                                        if (method5621(var10)) {
                                            var53 = var10.field3052;
                                            if (Statics.field1619 == var10 && var10.field3076 != 0) {
                                                var53 = var10.field3076;
                                            }
                                            if (var10.field3107.length() > 0) {
                                                var52 = var10.field3107;
                                            }
                                        } else {
                                            var53 = var10.field3073;
                                            if (Statics.field1619 == var10 && var10.field3075 != 0) {
                                                var53 = var10.field3075;
                                            }
                                        }
                                        if (var10.field3125 && var10.field3096 != -1) {
                                            class170 var54 = class170.method2099(var10.field3096);
                                            var52 = var54.field1876;
                                            if (var52 == null) {
                                                var52 = class283.field3360;
                                            }
                                            if ((var54.field1898 == 1 || var10.field3066 != 1) && var10.field3066 != -1) {
                                                var52 = class92.method2841(16748608) + var52 + class92.field1225 + " " + 'x' + method2385(var10.field3066);
                                            }
                                        }
                                        if (field657 == var10) {
                                            var52 = class283.field3497;
                                            var53 = var10.field3073;
                                        }
                                        if (!var10.field3125) {
                                            var52 = method1863(var52, var10);
                                        }
                                        var51.method5263(var52, var12, var13, var10.field3063, var10.field3145, var53, var10.field3151 ? 0 : -1, var10.field3112, var10.field3127, var10.field3111);
                                    } else if (class262.field3046) {
                                        method204(var10);
                                    }
                                } else if (var10.field3146 == 5) {
                                    if (var10.field3125) {
                                        class414 var56;
                                        if (var10.field3096 == -1) {
                                            var56 = var10.method4553(false);
                                        } else {
                                            var56 = class170.method2052(var10.field3096, var10.field3066, var10.field3087, var10.field3088, var10.field3070, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4386;
                                            int var58 = var56.field4391;
                                            if (var10.field3086) {
                                                class410.method6562(var12, var13, var10.field3063 + var12, var10.field3145 + var13);
                                                int var59 = (var10.field3063 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3145 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3085 != 0) {
                                                            var56.method6707(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3085, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6659(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6665(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class410.method6573(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3063 * 4096 / var57;
                                                if (var10.field3085 != 0) {
                                                    var56.method6707(var10.field3063 / 2 + var12, var10.field3145 / 2 + var13, var10.field3085, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6754(var12, var13, var10.field3063, var10.field3145, 256 - (var14 & 0xFF));
                                                } else if (var10.field3063 == var57 && var10.field3145 == var58) {
                                                    var56.method6659(var12, var13);
                                                } else {
                                                    var56.method6661(var12, var13, var10.field3063, var10.field3145);
                                                }
                                            }
                                        } else if (class262.field3046) {
                                            method204(var10);
                                        }
                                    } else {
                                        class414 var55 = var10.method4553(method5621(var10));
                                        if (var55 != null) {
                                            var55.method6659(var12, var13);
                                        } else if (class262.field3046) {
                                            method204(var10);
                                        }
                                    }
                                } else if (var10.field3146 == 6) {
                                    boolean var64 = method5621(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3114;
                                    } else {
                                        var65 = var10.field3095;
                                    }
                                    class220 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3096 != -1) {
                                        class170 var68 = class170.method2099(var10.field3096);
                                        if (var68 != null) {
                                            class170 var69 = var68.method3008(var10.field3066);
                                            var66 = var69.method3065(1);
                                            if (var66 == null) {
                                                method204(var10);
                                            } else {
                                                var66.method4076();
                                                var67 = var66.field2449 / 2;
                                            }
                                        }
                                    } else if (var10.field3091 == 5) {
                                        if (var10.field3178 == 0) {
                                            var66 = field758.method4522((class172) null, -1, (class172) null, -1);
                                        } else {
                                            var66 = Statics.field868.method1785();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4594((class172) null, -1, var64, Statics.field868.field1062);
                                        if (var66 == null && class262.field3046) {
                                            method204(var10);
                                        }
                                    } else {
                                        class172 var70 = class172.method2708(var65);
                                        var66 = var10.method4594(var70, var10.field3180, var64, Statics.field868.field1062);
                                        if (var66 == null && class262.field3046) {
                                            method204(var10);
                                        }
                                    }
                                    class211.method3749(var10.field3063 / 2 + var12, var10.field3145 / 2 + var13);
                                    int var71 = var10.field3102 * class211.field2371[var10.field3099] >> 16;
                                    int var72 = var10.field3102 * class211.field2359[var10.field3099] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3125) {
                                            var66.method4076();
                                            if (var10.field3105) {
                                                var66.method4107(0, var10.field3069, var10.field3101, var10.field3099, var10.field3097, var10.field3098 + var67 + var71, var10.field3098 + var72, var10.field3102);
                                            } else {
                                                var66.method4078(0, var10.field3069, var10.field3101, var10.field3099, var10.field3097, var10.field3098 + var67 + var71, var10.field3098 + var72);
                                            }
                                        } else {
                                            var66.method4078(0, var10.field3069, 0, var10.field3099, 0, var71, var72);
                                        }
                                    }
                                    class211.method3748();
                                } else {
                                    if (var10.field3146 == 7) {
                                        class315 var73 = var10.method4554();
                                        if (var73 == null) {
                                            if (class262.field3046) {
                                                method204(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3195; var75++) {
                                            for (int var76 = 0; var76 < var10.field3059; var76++) {
                                                if (var10.field3176[var74] > 0) {
                                                    class170 var77 = class170.method2099(var10.field3176[var74] - 1);
                                                    String var78;
                                                    if (var77.field1898 != 1 && var10.field3177[var74] == 1) {
                                                        var78 = class92.method2841(16748608) + var77.field1876 + class92.field1225;
                                                    } else {
                                                        var78 = class92.method2841(16748608) + var77.field1876 + class92.field1225 + " " + 'x' + method2385(var10.field3177[var74]);
                                                    }
                                                    int var79 = (var10.field3115 + 115) * var76 + var12;
                                                    int var80 = (var10.field3092 + 12) * var75 + var13;
                                                    if (var10.field3112 == 0) {
                                                        var73.method5207(var78, var79, var80, var10.field3073, var10.field3151 ? 0 : -1);
                                                    } else if (var10.field3112 == 1) {
                                                        var73.method5210(var78, var10.field3063 / 2 + var79, var80, var10.field3073, var10.field3151 ? 0 : -1);
                                                    } else {
                                                        var73.method5209(var78, var10.field3063 + var79 - 1, var80, var10.field3073, var10.field3151 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3146 == 8 && Statics.field3662 == var10 && field643 == field558) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class315 var83 = Statics.field3196;
                                        String var84 = var10.field3109;
                                        String var85 = method1863(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class92.field1226);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5201(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3847 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3063 + var12 - 5 - var81;
                                        int var90 = var10.field3145 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class410.method6595(var89, var90, var81, var82, 16777120);
                                        class410.method6566(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3109;
                                        int var92 = var83.field3847 + var90 + 2;
                                        String var93 = method1863(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class92.field1226);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5207(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3847 + 1;
                                        }
                                    }
                                    if (var10.field3146 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3082) {
                                            var96 = var12;
                                            var97 = var10.field3145 + var13;
                                            var98 = var10.field3063 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3063 + var12;
                                            var99 = var10.field3145 + var13;
                                        }
                                        if (var10.field3104 == 1) {
                                            class410.method6572(var96, var97, var98, var99, var10.field3073);
                                        } else {
                                            method2907(var96, var97, var98, var99, var10.field3073, var10.field3104);
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

    @ObfuscatedName("fn.is(IIIIIIB)V")
    public static final void method2907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class410.field4362;
        int var18 = arg1 - class410.field4360;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class211.method3754(var19, var20, var21);
        class211.method3757(var23, var24, var25, var19, var20, var21, arg4);
        class211.method3754(var19, var21, var22);
        class211.method3757(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("by.in(Ljava/lang/String;Ljt;I)Ljava/lang/String;")
    public static String method1863(String arg0, class262 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method996(method5478(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("dg.ip(IB)Ljava/lang/String;")
    public static final String method2385(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class92.field1221 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class92.method2841(65408) + var1.substring(0, var1.length() - 8) + class283.field3500 + " " + class92.field1224 + var1 + class92.field1223 + class92.field1225;
        } else if (var1.length() > 6) {
            return " " + class92.method2841(16777215) + var1.substring(0, var1.length() - 4) + class283.field3502 + " " + class92.field1224 + var1 + class92.field1223 + class92.field1225;
        } else {
            return " " + class92.method2841(16776960) + var1 + class92.field1225;
        }
    }

    @ObfuscatedName("client.iu(ZI)V")
    public final void method1063(boolean arg0) {
        method373(field718, Statics.field3203, Statics.field1050, arg0);
    }

    @ObfuscatedName("client.ir(Ljt;I)V")
    public void method1483(class262 arg0) {
        class262 var2 = arg0.field3134 == -1 ? null : class262.method2058(arg0.field3134);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3203;
            var4 = Statics.field1050;
        } else {
            var3 = var2.field3063;
            var4 = var2.field3145;
        }
        method3646(arg0, var3, var4, false);
        method2762(arg0, var3, var4);
    }

    @ObfuscatedName("ew.il([Ljt;Ljt;ZB)V")
    public static void method2566(class262[] arg0, class262 arg1, boolean arg2) {
        int var3 = arg1.field3071 == 0 ? arg1.field3063 : arg1.field3071;
        int var4 = arg1.field3072 == 0 ? arg1.field3145 : arg1.field3072;
        method3568(arg0, arg1.field3048, var3, var4, arg2);
        if (arg1.field3182 != null) {
            method3568(arg1.field3182, arg1.field3048, var3, var4, arg2);
        }
        class80 var5 = (class80) field652.method6061((long) arg1.field3048);
        if (var5 != null) {
            method373(var5.field1034, var3, var4, arg2);
        }
        if (arg1.field3113 == 1337) {
        }
    }

    @ObfuscatedName("d.io(IIIZB)V")
    public static final void method373(int arg0, int arg1, int arg2, boolean arg3) {
        if (class262.method4885(arg0)) {
            method3568(Statics.field3153[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gy.ig([Ljt;IIIZB)V")
    public static void method3568(class262[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class262 var6 = arg0[var5];
            if (var6 != null && var6.field3134 == arg1) {
                method3646(var6, arg2, arg3, arg4);
                method2762(var6, arg2, arg3);
                if (var6.field3100 > var6.field3071 - var6.field3063) {
                    var6.field3100 = var6.field3071 - var6.field3063;
                }
                if (var6.field3100 < 0) {
                    var6.field3100 = 0;
                }
                if (var6.field3081 > var6.field3072 - var6.field3145) {
                    var6.field3081 = var6.field3072 - var6.field3145;
                }
                if (var6.field3081 < 0) {
                    var6.field3081 = 0;
                }
                if (var6.field3146 == 0) {
                    method2566(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gt.ij(Ljt;IIZB)V")
    public static void method3646(class262 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3063;
        int var5 = arg0.field3145;
        if (arg0.field3055 == 0) {
            arg0.field3063 = arg0.field3059;
        } else if (arg0.field3055 == 1) {
            arg0.field3063 = arg1 - arg0.field3059;
        } else if (arg0.field3055 == 2) {
            arg0.field3063 = arg0.field3059 * arg1 >> 14;
        }
        if (arg0.field3056 == 0) {
            arg0.field3145 = arg0.field3195;
        } else if (arg0.field3056 == 1) {
            arg0.field3145 = arg2 - arg0.field3195;
        } else if (arg0.field3056 == 2) {
            arg0.field3145 = arg0.field3195 * arg2 >> 14;
        }
        if (arg0.field3055 == 4) {
            arg0.field3063 = arg0.field3145 * arg0.field3068 / arg0.field3137;
        }
        if (arg0.field3056 == 4) {
            arg0.field3145 = arg0.field3137 * arg0.field3063 / arg0.field3068;
        }
        if (arg0.field3113 == 1337) {
            field663 = arg0;
        }
        if (arg3 && arg0.field3167 != null && (arg0.field3063 != var4 || arg0.field3145 != var5)) {
            class81 var6 = new class81();
            var6.field1040 = arg0;
            var6.field1042 = arg0.field3167;
            field770.method5015(var6);
        }
    }

    @ObfuscatedName("fp.iq(Ljt;III)V")
    public static void method2762(class262 arg0, int arg1, int arg2) {
        if (arg0.field3053 == 0) {
            arg0.field3061 = arg0.field3057;
        } else if (arg0.field3053 == 1) {
            arg0.field3061 = (arg1 - arg0.field3063) / 2 + arg0.field3057;
        } else if (arg0.field3053 == 2) {
            arg0.field3061 = arg1 - arg0.field3063 - arg0.field3057;
        } else if (arg0.field3053 == 3) {
            arg0.field3061 = arg0.field3057 * arg1 >> 14;
        } else if (arg0.field3053 == 4) {
            arg0.field3061 = (arg0.field3057 * arg1 >> 14) + (arg1 - arg0.field3063) / 2;
        } else {
            arg0.field3061 = arg1 - arg0.field3063 - (arg0.field3057 * arg1 >> 14);
        }
        if (arg0.field3054 == 0) {
            arg0.field3172 = arg0.field3058;
        } else if (arg0.field3054 == 1) {
            arg0.field3172 = (arg2 - arg0.field3145) / 2 + arg0.field3058;
        } else if (arg0.field3054 == 2) {
            arg0.field3172 = arg2 - arg0.field3145 - arg0.field3058;
        } else if (arg0.field3054 == 3) {
            arg0.field3172 = arg0.field3058 * arg2 >> 14;
        } else if (arg0.field3054 == 4) {
            arg0.field3172 = (arg0.field3058 * arg2 >> 14) + (arg2 - arg0.field3145) / 2;
        } else {
            arg0.field3172 = arg2 - arg0.field3145 - (arg0.field3058 * arg2 >> 14);
        }
    }

    @ObfuscatedName("hq.ih(Ljt;IIIIIII)V")
    public static final void method4180(class262 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field552) {
            field559 = 32;
        } else {
            field559 = 0;
        }
        field552 = false;
        if (class33.field229 == 1 || !Statics.field1784 && class33.field229 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3081 -= 4;
                method204(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3081 += 4;
                method204(arg0);
            } else if (arg5 >= arg1 - field559 && arg5 < field559 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3081 = (arg4 - arg3) * var8 / var9;
                method204(arg0);
                field552 = true;
            }
        }
        if (field703 == 0) {
            return;
        }
        int var10 = arg0.field3063;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3081 += field703 * 45;
            method204(arg0);
        }
    }

    @ObfuscatedName("bg.ib(II)Ljava/lang/String;")
    public static final String method996(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("mn.ix(Ljt;I)Z")
    public static final boolean method5621(class262 arg0) {
        if (arg0.field3050 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3050.length; var1++) {
            int var2 = method5478(arg0, var1);
            int var3 = arg0.field3110[var1];
            if (arg0.field3050[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3050[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3050[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lz.iw(Ljt;II)I")
    public static final int method5478(class262 arg0, int arg1) {
        if (arg0.field3170 == null || arg1 >= arg0.field3170.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3170[arg1];
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
                    var7 = field623[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field624[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field625[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class262 var11 = class262.method2058(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class170.method2099(var12).field1900 || field486)) {
                        for (int var13 = 0; var13 < var11.field3176.length; var13++) {
                            if (var12 + 1 == var11.field3176[var13]) {
                                var7 += var11.field3177[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class257.field3009[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class272.field3254[field624[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class257.field3009[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field868.field1074;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class272.field3253[var14]) {
                            var7 += field624[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class262 var17 = class262.method2058(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class170.method2099(var18).field1900 || field486)) {
                        for (int var19 = 0; var19 < var17.field3176.length; var19++) {
                            if (var18 + 1 == var17.field3176[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field658;
                }
                if (var6 == 12) {
                    var7 = field659;
                }
                if (var6 == 13) {
                    int var20 = class257.field3009[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class257.method2185(var22);
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
                    var7 = (Statics.field868.field1140 >> 7) + Statics.field2131;
                }
                if (var6 == 19) {
                    var7 = (Statics.field868.field1124 >> 7) + Statics.field3028;
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

    @ObfuscatedName("cu.iv(Ljt;Lfa;IIZI)V")
    public static final void method2156(class262 arg0, class170 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field1902;
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
            var7 = class283.field3509;
        }
        if (var6 != -1 && var7 != null) {
            method2881(var7, class92.method2841(16748608) + arg1.field1876, var6, arg1.field1908, arg2, arg0.field3048, arg4);
        }
    }

    @ObfuscatedName("ac.ic(Ljt;IIB)V")
    public static final void method739(class262 arg0, int arg1, int arg2) {
        if (arg0.field3051 == 1) {
            method4676(arg0.field3175, "", 24, 0, 0, arg0.field3048);
        }
        if (arg0.field3051 == 2 && !field646) {
            String var3 = method571(arg0);
            if (var3 != null) {
                method4676(var3, class92.method2841(65280) + arg0.field3174, 25, 0, -1, arg0.field3048);
            }
        }
        if (arg0.field3051 == 3) {
            method4676(class283.field3501, "", 26, 0, 0, arg0.field3048);
        }
        if (arg0.field3051 == 4) {
            method4676(arg0.field3175, "", 28, 0, 0, arg0.field3048);
        }
        if (arg0.field3051 == 5) {
            method4676(arg0.field3175, "", 29, 0, 0, arg0.field3048);
        }
        if (arg0.field3051 == 6 && field657 == null) {
            method4676(arg0.field3175, "", 30, 0, -1, arg0.field3048);
        }
        if (arg0.field3146 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3145; var5++) {
                for (int var6 = 0; var6 < arg0.field3063; var6++) {
                    int var7 = (arg0.field3115 + 32) * var6;
                    int var8 = (arg0.field3092 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3117[var4];
                        var8 += arg0.field3118[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field500 = var4;
                        Statics.field937 = arg0;
                        if (arg0.field3176[var4] > 0) {
                            class170 var9 = class170.method2099(arg0.field3176[var4] - 1);
                            if (field499 == 1 && class263.method1933(method3375(arg0))) {
                                if (Statics.field1355 != arg0.field3048 || Statics.field3669 != var4) {
                                    method4676(class283.field3489, field498 + " " + class92.field1220 + " " + class92.method2841(16748608) + var9.field1876, 31, var9.field1908, var4, arg0.field3048);
                                }
                            } else if (!field646 || !class263.method1933(method3375(arg0))) {
                                String[] var10 = var9.field1902;
                                int var11 = -1;
                                if (field637) {
                                    boolean var12 = field638 || class24.field118[81];
                                    if (var12) {
                                        var11 = var9.method3015();
                                    }
                                }
                                if (class263.method1933(method3375(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method2156(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class263.method329(method3375(arg0))) {
                                    method4676(class283.field3489, class92.method2841(16748608) + var9.field1876, 38, var9.field1908, var4, arg0.field3048);
                                }
                                if (class263.method1933(method3375(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11 != var14) {
                                            method2156(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method2156(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var15 = arg0.field3181;
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method4676(var15[var16], class92.method2841(16748608) + var9.field1876, var17, var9.field1908, var4, arg0.field3048);
                                        }
                                    }
                                }
                                method4676(class283.field3545, class92.method2841(16748608) + var9.field1876, 1005, var9.field1908, var4, arg0.field3048);
                            } else if ((Statics.field1837 & 0x10) == 16) {
                                method4676(field649, field557 + " " + class92.field1220 + " " + class92.method2841(16748608) + var9.field1876, 32, var9.field1908, var4, arg0.field3048);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3125) {
            return;
        }
        if (!field646) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19 = method4911(arg0, var18);
                if (var19 != null) {
                    method4676(var19, arg0.field3152, 1007, var18 + 1, arg0.field3185, arg0.field3048);
                }
            }
            String var20 = method571(arg0);
            if (var20 != null) {
                method4676(var20, arg0.field3152, 25, 0, arg0.field3185, arg0.field3048);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                String var22 = method4911(arg0, var21);
                if (var22 != null) {
                    method2881(var22, arg0.field3152, 57, var21 + 1, arg0.field3185, arg0.field3048, arg0.field3194);
                }
            }
            if (class263.method264(method3375(arg0))) {
                method4676(class283.field3527, "", 30, 0, arg0.field3185, arg0.field3048);
            }
        } else if (class263.method2535(method3375(arg0)) && (Statics.field1837 & 0x20) == 32) {
            method4676(field649, field557 + " " + class92.field1220 + " " + arg0.field3152, 58, 0, arg0.field3185, arg0.field3048);
        }
    }

    @ObfuscatedName("hg.ia(ZI)V")
    public static void method3824(boolean arg0) {
        field638 = arg0;
    }

    @ObfuscatedName("gs.ie(I)Z")
    public static boolean method3512() {
        return field638;
    }

    @ObfuscatedName("cr.je(IIIIIIIB)V")
    public static final void method2098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class262.method4885(arg0)) {
            method2616(Statics.field3153[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("eq.jt([Ljt;IIIIIIII)V")
    public static final void method2616(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class262 var9 = arg0[var8];
            if (var9 != null && var9.field3134 == arg1 && (!var9.field3125 || var9.field3146 == 0 || var9.field3165 || method3375(var9) != 0 || field488 == var9 || var9.field3113 == 1338)) {
                if (var9.field3125) {
                    if (method1641(var9)) {
                        continue;
                    }
                } else if (var9.field3146 == 0 && Statics.field1619 != var9 && method1641(var9)) {
                    continue;
                }
                int var10 = var9.field3061 + arg6;
                int var11 = var9.field3172 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3146 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field3146 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field3063 + var10;
                    int var19 = var9.field3145 + var11;
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
                    int var22 = var9.field3063 + var10;
                    int var23 = var9.field3145 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field610 == var9) {
                    field672 = true;
                    field673 = var10;
                    field609 = var11;
                }
                boolean var24 = false;
                if (var9.field3122) {
                    switch(field510) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3048 >>> 16 == field674) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field674 == var9.field3048) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field3125 || var12 < var14 && var13 < var15) {
                    if (var9.field3125) {
                        if (var9.field3120) {
                            if (class33.field224 >= var12 && class33.field225 >= var13 && class33.field224 < var14 && class33.field225 < var15) {
                                for (class81 var25 = (class81) field770.method5035(); var25 != null; var25 = (class81) field770.method5022()) {
                                    if (var25.field1039) {
                                        var25.method5775();
                                        var25.field1040.field3183 = false;
                                    }
                                }
                                if (Statics.field223 == 0) {
                                    field610 = null;
                                    field488 = null;
                                }
                                if (!field627) {
                                    method3167();
                                }
                            }
                        } else if (var9.field3193 && class33.field224 >= var12 && class33.field225 >= var13 && class33.field224 < var14 && class33.field225 < var15) {
                            for (class81 var26 = (class81) field770.method5035(); var26 != null; var26 = (class81) field770.method5022()) {
                                if (var26.field1039 && var26.field1040.field3155 == var26.field1042) {
                                    var26.method5775();
                                }
                            }
                        }
                    }
                    int var27 = class33.field224;
                    int var28 = class33.field225;
                    if (class33.field231 != 0) {
                        var27 = class33.field232;
                        var28 = class33.field214;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field3113 == 1337) {
                        if (!field493 && !field627 && var29) {
                            method2558(var27, var28, var12, var13);
                        }
                    } else if (var9.field3113 == 1338) {
                        method2143(var9, var10, var11);
                    } else {
                        if (var9.field3113 == 1400) {
                            Statics.field1243.method5826(class33.field224, class33.field225, var29, var10, var11, var9.field3063, var9.field3145);
                        }
                        if (!field627 && var29) {
                            if (var9.field3113 == 1400) {
                                Statics.field1243.method5878(var10, var11, var9.field3063, var9.field3145, var27, var28);
                            } else {
                                method739(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3116.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3116[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3116[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3191 != null) {
                                            var34 = class24.field118[var9.field3116[var30][var33]];
                                        }
                                        if (method5001(var9.field3116[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3191 != null && var9.field3191[var30] > field494) {
                                                break;
                                            }
                                            byte var35 = var9.field3124[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class24.field118[86] && !class24.field118[82] && !class24.field118[81]) && ((var35 & 0x2) == 0 || class24.field118[86]) && ((var35 & 0x1) == 0 || class24.field118[82]) && ((var35 & 0x4) == 0 || class24.field118[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method1004(var30 + 1, var9.field3048, var9.field3185, var9.field3096, "");
                                    } else if (var30 == 10) {
                                        method4513();
                                        method4691(var9.field3048, var9.field3185, class263.method1729(method3375(var9)), var9.field3096);
                                        field649 = method571(var9);
                                        if (field649 == null) {
                                            field649 = class283.field3360;
                                        }
                                        field557 = var9.field3152 + class92.method2841(16777215);
                                    }
                                    int var36 = var9.field3148[var30];
                                    if (var9.field3191 == null) {
                                        var9.field3191 = new int[var9.field3116.length];
                                    }
                                    if (var9.field3067 == null) {
                                        var9.field3067 = new int[var9.field3116.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3191[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3191[var30] == 0) {
                                        var9.field3191[var30] = field494 + var36 + var9.field3067[var30];
                                    } else {
                                        var9.field3191[var30] = field494 + var36;
                                    }
                                }
                                if (!var31 && var9.field3191 != null) {
                                    var9.field3191[var30] = 0;
                                }
                            }
                        }
                        if (var9.field3125) {
                            boolean var37;
                            if (class33.field224 >= var12 && class33.field225 >= var13 && class33.field224 < var14 && class33.field225 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class33.field229 == 1 || !Statics.field1784 && class33.field229 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class33.field231 == 1 || !Statics.field1784 && class33.field231 == 4) && class33.field232 >= var12 && class33.field214 >= var13 && class33.field232 < var14 && class33.field214 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method4873(var9, class33.field232 - var10, class33.field214 - var11);
                            }
                            if (var9.field3113 == 1400) {
                                Statics.field1243.method6015(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field610 != null && field610 != var9 && var37 && class263.method4886(method3375(var9))) {
                                field570 = var9;
                            }
                            if (field488 == var9) {
                                field596 = true;
                                field670 = var10;
                                field671 = var11;
                            }
                            if (var9.field3165) {
                                if (var37 && field703 != 0 && var9.field3155 != null) {
                                    class81 var40 = new class81();
                                    var40.field1039 = true;
                                    var40.field1040 = var9;
                                    var40.field1041 = field703;
                                    var40.field1042 = var9.field3155;
                                    field770.method5015(var40);
                                }
                                if (field610 != null || Statics.field211 != null || field627) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3184 && var39) {
                                    var9.field3184 = true;
                                    if (var9.field3136 != null) {
                                        class81 var41 = new class81();
                                        var41.field1039 = true;
                                        var41.field1040 = var9;
                                        var41.field1047 = class33.field232 - var10;
                                        var41.field1041 = class33.field214 - var11;
                                        var41.field1042 = var9.field3136;
                                        field770.method5015(var41);
                                    }
                                }
                                if (var9.field3184 && var38 && var9.field3126 != null) {
                                    class81 var42 = new class81();
                                    var42.field1039 = true;
                                    var42.field1040 = var9;
                                    var42.field1047 = class33.field224 - var10;
                                    var42.field1041 = class33.field225 - var11;
                                    var42.field1042 = var9.field3126;
                                    field770.method5015(var42);
                                }
                                if (var9.field3184 && !var38) {
                                    var9.field3184 = false;
                                    if (var9.field3149 != null) {
                                        class81 var43 = new class81();
                                        var43.field1039 = true;
                                        var43.field1040 = var9;
                                        var43.field1047 = class33.field224 - var10;
                                        var43.field1041 = class33.field225 - var11;
                                        var43.field1042 = var9.field3149;
                                        field696.method5015(var43);
                                    }
                                }
                                if (var38 && var9.field3074 != null) {
                                    class81 var44 = new class81();
                                    var44.field1039 = true;
                                    var44.field1040 = var9;
                                    var44.field1047 = class33.field224 - var10;
                                    var44.field1041 = class33.field225 - var11;
                                    var44.field1042 = var9.field3074;
                                    field770.method5015(var44);
                                }
                                if (!var9.field3183 && var37) {
                                    var9.field3183 = true;
                                    if (var9.field3161 != null) {
                                        class81 var45 = new class81();
                                        var45.field1039 = true;
                                        var45.field1040 = var9;
                                        var45.field1047 = class33.field224 - var10;
                                        var45.field1041 = class33.field225 - var11;
                                        var45.field1042 = var9.field3161;
                                        field770.method5015(var45);
                                    }
                                }
                                if (var9.field3183 && var37 && var9.field3141 != null) {
                                    class81 var46 = new class81();
                                    var46.field1039 = true;
                                    var46.field1040 = var9;
                                    var46.field1047 = class33.field224 - var10;
                                    var46.field1041 = class33.field225 - var11;
                                    var46.field1042 = var9.field3141;
                                    field770.method5015(var46);
                                }
                                if (var9.field3183 && !var37) {
                                    var9.field3183 = false;
                                    if (var9.field3142 != null) {
                                        class81 var47 = new class81();
                                        var47.field1039 = true;
                                        var47.field1040 = var9;
                                        var47.field1047 = class33.field224 - var10;
                                        var47.field1041 = class33.field225 - var11;
                                        var47.field1042 = var9.field3142;
                                        field696.method5015(var47);
                                    }
                                }
                                if (var9.field3144 != null) {
                                    class81 var48 = new class81();
                                    var48.field1040 = var9;
                                    var48.field1042 = var9.field3144;
                                    field732.method5015(var48);
                                }
                                if (var9.field3147 != null && field678 > var9.field3186) {
                                    if (var9.field3083 == null || field678 - var9.field3186 > 32) {
                                        class81 var53 = new class81();
                                        var53.field1040 = var9;
                                        var53.field1042 = var9.field3147;
                                        field770.method5015(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3186; var49 < field678; var49++) {
                                            int var50 = field677[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3083.length; var51++) {
                                                if (var9.field3083[var51] == var50) {
                                                    class81 var52 = new class81();
                                                    var52.field1040 = var9;
                                                    var52.field1042 = var9.field3147;
                                                    field770.method5015(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3186 = field678;
                                }
                                if (var9.field3140 != null && field680 > var9.field3187) {
                                    if (var9.field3131 == null || field680 - var9.field3187 > 32) {
                                        class81 var58 = new class81();
                                        var58.field1040 = var9;
                                        var58.field1042 = var9.field3140;
                                        field770.method5015(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3187; var54 < field680; var54++) {
                                            int var55 = field679[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3131.length; var56++) {
                                                if (var9.field3131[var56] == var55) {
                                                    class81 var57 = new class81();
                                                    var57.field1040 = var9;
                                                    var57.field1042 = var9.field3140;
                                                    field770.method5015(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3187 = field680;
                                }
                                if (var9.field3123 != null && field717 > var9.field3188) {
                                    if (var9.field3062 == null || field717 - var9.field3188 > 32) {
                                        class81 var63 = new class81();
                                        var63.field1040 = var9;
                                        var63.field1042 = var9.field3123;
                                        field770.method5015(var63);
                                    } else {
                                        label586: for (int var59 = var9.field3188; var59 < field717; var59++) {
                                            int var60 = field762[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3062.length; var61++) {
                                                if (var9.field3062[var61] == var60) {
                                                    class81 var62 = new class81();
                                                    var62.field1040 = var9;
                                                    var62.field1042 = var9.field3123;
                                                    field770.method5015(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3188 = field717;
                                }
                                if (field597 > var9.field3065 && var9.field3139 != null) {
                                    class81 var64 = new class81();
                                    var64.field1040 = var9;
                                    var64.field1042 = var9.field3139;
                                    field770.method5015(var64);
                                }
                                if (field686 > var9.field3065 && var9.field3160 != null) {
                                    class81 var65 = new class81();
                                    var65.field1040 = var9;
                                    var65.field1042 = var9.field3160;
                                    field770.method5015(var65);
                                }
                                if (field687 > var9.field3065 && var9.field3079 != null) {
                                    class81 var66 = new class81();
                                    var66.field1040 = var9;
                                    var66.field1042 = var9.field3079;
                                    field770.method5015(var66);
                                }
                                if (field688 > var9.field3065 && var9.field3162 != null) {
                                    class81 var67 = new class81();
                                    var67.field1040 = var9;
                                    var67.field1042 = var9.field3162;
                                    field770.method5015(var67);
                                }
                                if (field595 > var9.field3065 && var9.field3164 != null) {
                                    class81 var68 = new class81();
                                    var68.field1040 = var9;
                                    var68.field1042 = var9.field3164;
                                    field770.method5015(var68);
                                }
                                if (field578 > var9.field3065 && var9.field3168 != null) {
                                    class81 var69 = new class81();
                                    var69.field1040 = var9;
                                    var69.field1042 = var9.field3168;
                                    field770.method5015(var69);
                                }
                                if (field490 > var9.field3065 && var9.field3169 != null) {
                                    class81 var70 = new class81();
                                    var70.field1040 = var9;
                                    var70.field1042 = var9.field3169;
                                    field770.method5015(var70);
                                }
                                if (field692 > var9.field3065 && var9.field3156 != null) {
                                    class81 var71 = new class81();
                                    var71.field1040 = var9;
                                    var71.field1042 = var9.field3156;
                                    field770.method5015(var71);
                                }
                                var9.field3065 = field689;
                                if (var9.field3157 != null) {
                                    for (int var72 = 0; var72 < field727; var72++) {
                                        class81 var73 = new class81();
                                        var73.field1040 = var9;
                                        var73.field1044 = field719[var72];
                                        var73.field1045 = field533[var72];
                                        var73.field1042 = var9.field3157;
                                        field770.method5015(var73);
                                    }
                                }
                                if (var9.field3158 != null) {
                                    int[] var74 = class24.method5403();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1040 = var9;
                                        var76.field1044 = var74[var75];
                                        var76.field1042 = var9.field3158;
                                        field770.method5015(var76);
                                    }
                                }
                                if (var9.field3159 != null) {
                                    int[] var77 = class24.method3743();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1040 = var9;
                                        var79.field1044 = var77[var78];
                                        var79.field1042 = var9.field3159;
                                        field770.method5015(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field3125) {
                            if (field610 != null || Statics.field211 != null || field627) {
                                continue;
                            }
                            if ((var9.field3163 >= 0 || var9.field3075 != 0) && class33.field224 >= var12 && class33.field225 >= var13 && class33.field224 < var14 && class33.field225 < var15) {
                                if (var9.field3163 >= 0) {
                                    Statics.field1619 = arg0[var9.field3163];
                                } else {
                                    Statics.field1619 = var9;
                                }
                            }
                            if (var9.field3146 == 8 && class33.field224 >= var12 && class33.field225 >= var13 && class33.field224 < var14 && class33.field225 < var15) {
                                Statics.field3662 = var9;
                            }
                            if (var9.field3072 > var9.field3145) {
                                method4180(var9, var9.field3063 + var10, var11, var9.field3145, var9.field3072, class33.field224, class33.field225);
                            }
                        }
                        if (var9.field3146 == 0) {
                            method2616(arg0, var9.field3048, var12, var13, var14, var15, var10 - var9.field3100, var11 - var9.field3081);
                            if (var9.field3182 != null) {
                                method2616(var9.field3182, var9.field3048, var12, var13, var14, var15, var10 - var9.field3100, var11 - var9.field3081);
                            }
                            class80 var80 = (class80) field652.method6061((long) var9.field3048);
                            if (var80 != null) {
                                if (var80.field1035 == 0 && class33.field224 >= var12 && class33.field225 >= var13 && class33.field224 < var14 && class33.field225 < var15 && !field627) {
                                    for (class81 var81 = (class81) field770.method5035(); var81 != null; var81 = (class81) field770.method5022()) {
                                        if (var81.field1039) {
                                            var81.method5775();
                                            var81.field1040.field3183 = false;
                                        }
                                    }
                                    if (Statics.field223 == 0) {
                                        field610 = null;
                                        field488 = null;
                                    }
                                    if (!field627) {
                                        method3167();
                                    }
                                }
                                method2098(var80.field1034, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kw.jf(II)Z")
    public static boolean method5001(int arg0) {
        for (int var1 = 0; var1 < field727; var1++) {
            if (field719[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("br.jn(III)V")
    public static final void method1967(int arg0, int arg1) {
        if (class262.method4885(arg0)) {
            method574(Statics.field3153[arg0], arg1);
        }
    }

    @ObfuscatedName("al.jo([Ljt;II)V")
    public static final void method574(class262[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class262 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3146 == 0) {
                    if (var3.field3182 != null) {
                        method574(var3.field3182, arg1);
                    }
                    class80 var4 = (class80) field652.method6061((long) var3.field3048);
                    if (var4 != null) {
                        method1967(var4.field1034, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3093 != null) {
                    class81 var5 = new class81();
                    var5.field1040 = var3;
                    var5.field1042 = var3.field3093;
                    class64.method4138(var5);
                }
                if (arg1 == 1 && var3.field3150 != null) {
                    if (var3.field3185 >= 0) {
                        class262 var6 = class262.method2058(var3.field3048);
                        if (var6 == null || var6.field3182 == null || var3.field3185 >= var6.field3182.length || var6.field3182[var3.field3185] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1040 = var3;
                    var7.field1042 = var3.field3150;
                    class64.method4138(var7);
                }
            }
        }
    }

    @ObfuscatedName("kg.jr(Ljt;III)V")
    public static final void method4873(class262 arg0, int arg1, int arg2) {
        if (field610 != null || field627 || arg0 == null) {
            return;
        }
        class262 var3 = arg0;
        int var4 = class263.method5489(method3375(arg0));
        class262 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class262.method2058(var3.field3134);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class262 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3129;
        }
        if (var7 == null) {
            return;
        }
        field610 = arg0;
        class262 var9 = arg0;
        int var10 = class263.method5489(method3375(arg0));
        class262 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class262.method2058(var9.field3134);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class262 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field3129;
        }
        field488 = var13;
        field666 = arg1;
        field667 = arg2;
        Statics.field223 = 0;
        field675 = false;
        int var15 = field695 - 1;
        if (var15 != -1) {
            method4753(var15);
        }
        return;
    }

    @ObfuscatedName("client.jk(S)V")
    public final void method1265() {
        method204(field610);
        Statics.field223++;
        if (field672 && field596) {
            int var1 = class33.field224;
            int var2 = class33.field225;
            int var3 = var1 - field666;
            int var4 = var2 - field667;
            if (var3 < field670) {
                var3 = field670;
            }
            if (field610.field3063 + var3 > field670 + field488.field3063) {
                var3 = field670 + field488.field3063 - field610.field3063;
            }
            if (var4 < field671) {
                var4 = field671;
            }
            if (field610.field3145 + var4 > field671 + field488.field3145) {
                var4 = field671 + field488.field3145 - field610.field3145;
            }
            int var5 = var3 - field673;
            int var6 = var4 - field609;
            int var7 = field610.field3130;
            if (Statics.field223 > field610.field3060 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field675 = true;
            }
            int var8 = field488.field3100 + (var3 - field670);
            int var9 = field488.field3081 + (var4 - field671);
            if (field610.field3143 != null && field675) {
                class81 var10 = new class81();
                var10.field1040 = field610;
                var10.field1047 = var8;
                var10.field1041 = var9;
                var10.field1042 = field610.field3143;
                class64.method4138(var10);
            }
            if (class33.field229 == 0) {
                if (field675) {
                    if (field610.field3064 != null) {
                        class81 var11 = new class81();
                        var11.field1040 = field610;
                        var11.field1047 = var8;
                        var11.field1041 = var9;
                        var11.field1043 = field570;
                        var11.field1042 = field610.field3064;
                        class64.method4138(var11);
                    }
                    if (field570 != null) {
                        class262 var12 = field610;
                        int var13 = class263.method5489(method3375(var12));
                        class262 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class262.method2058(var12.field3134);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class242 var16 = class242.method2075(class240.field2685, field639.field1287);
                            var16.field2780.method6318(field610.field3048);
                            var16.field2780.method6405(field610.field3185);
                            var16.field2780.method6306(field570.field3185);
                            var16.field2780.method6256(field570.field3096);
                            var16.field2780.method6307(field610.field3096);
                            var16.field2780.method6316(field570.field3048);
                            field639.method2246(var16);
                        }
                    }
                } else if (this.method1061()) {
                    this.method1062(field673 + field666, field667 + field609);
                } else if (field695 > 0) {
                    method4020(field673 + field666, field667 + field609);
                }
                field610 = null;
            }
        } else if (Statics.field223 > 1) {
            field610 = null;
        }
    }

    @ObfuscatedName("kr.jc(II)V")
    public static void method4753(int arg0) {
        Statics.field1529 = new class67();
        Statics.field1529.field864 = field629[arg0];
        Statics.field1529.field859 = field630[arg0];
        Statics.field1529.field860 = field701[arg0];
        Statics.field1529.field861 = field632[arg0];
        Statics.field1529.field862 = field633[arg0];
    }

    @ObfuscatedName("hi.ja(IIB)V")
    public static void method4020(int arg0, int arg1) {
        class67 var2 = Statics.field1529;
        method5803(var2.field864, var2.field859, var2.field860, var2.field861, var2.field862, var2.field862, arg0, arg1);
        Statics.field1529 = null;
    }

    @ObfuscatedName("b.jp(Ljt;I)V")
    public static void method204(class262 arg0) {
        if (field700 == arg0.field3179) {
            field711[arg0.field3189] = true;
        }
    }

    @ObfuscatedName("dv.jl(I)V")
    public static void method2392() {
        for (class80 var0 = (class80) field652.method6062(); var0 != null; var0 = (class80) field652.method6060()) {
            int var1 = var0.field1034;
            if (class262.method4885(var1)) {
                boolean var2 = true;
                class262[] var3 = Statics.field3153[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3125;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4075;
                    class262 var6 = class262.method2058(var5);
                    if (var6 != null) {
                        method204(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.jb(IB)V")
    public static final void method261(int arg0) {
        if (!class262.method4885(arg0)) {
            return;
        }
        class262[] var1 = Statics.field3153[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class262 var3 = var1[var2];
            if (var3 != null) {
                var3.field3180 = 0;
                var3.field3047 = 0;
            }
        }
    }

    @ObfuscatedName("i.jq([Ljt;IB)V")
    public static final void method83(class262[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class262 var3 = arg0[var2];
            if (var3 != null && var3.field3134 == arg1 && (!var3.field3125 || !method1641(var3))) {
                if (var3.field3146 == 0) {
                    if (!var3.field3125 && method1641(var3) && Statics.field1619 != var3) {
                        continue;
                    }
                    method83(arg0, var3.field3048);
                    if (var3.field3182 != null) {
                        method83(var3.field3182, var3.field3048);
                    }
                    class80 var4 = (class80) field652.method6061((long) var3.field3048);
                    if (var4 != null) {
                        int var5 = var4.field1034;
                        if (class262.method4885(var5)) {
                            method83(Statics.field3153[var5], -1);
                        }
                    }
                }
                if (var3.field3146 == 6) {
                    if (var3.field3095 != -1 || var3.field3114 != -1) {
                        boolean var6 = method5621(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3114;
                        } else {
                            var7 = var3.field3095;
                        }
                        if (var7 != -1) {
                            class172 var8 = class172.method2708(var7);
                            var3.field3047 += field537;
                            while (var3.field3047 > var8.field1951[var3.field3180]) {
                                var3.field3047 -= var8.field1951[var3.field3180];
                                var3.field3180++;
                                if (var3.field3180 >= var8.field1959.length) {
                                    var3.field3180 -= var8.field1949;
                                    if (var3.field3180 < 0 || var3.field3180 >= var8.field1959.length) {
                                        var3.field3180 = 0;
                                    }
                                }
                                method204(var3);
                            }
                        }
                    }
                    if (var3.field3039 != 0 && !var3.field3125) {
                        int var9 = var3.field3039 >> 16;
                        int var10 = var3.field3039 << 16 >> 16;
                        int var11 = field537 * var9;
                        int var12 = field537 * var10;
                        var3.field3099 = var3.field3099 + var11 & 0x7FF;
                        var3.field3069 = var3.field3069 + var12 & 0x7FF;
                        method204(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ju(II)V")
    public static final void method423(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field3227.field1207 == var1) {
            return;
        }
        if (Statics.field3227.field1207 == 0 && field731 != -1) {
            class248.method1799(Statics.field992, field731, 0, var1, false);
            field664 = false;
        } else if (var1 == 0) {
            Statics.field2921.method4301();
            class248.field2915 = 1;
            Statics.field1370 = null;
            field664 = false;
        } else {
            class248.method16(var1);
        }
        Statics.field3227.field1207 = var1;
        class89.method1005();
    }

    @ObfuscatedName("de.jv(II)V")
    public static final void method2489(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field3227.field1205 = var1;
        class89.method1005();
    }

    @ObfuscatedName("bu.jh(IB)V")
    public static final void method1043(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field3227.field1201 = var1;
        class89.method1005();
    }

    @ObfuscatedName("eq.ji(IB)V")
    public static final void method2617(int arg0) {
        method2392();
        class63.method4177();
        int var1 = class153.method1031(arg0).field1618;
        if (var1 == 0) {
            return;
        }
        int var2 = class257.field3009[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                Statics.method4662(0.9D);
            }
            if (var2 == 2) {
                Statics.method4662(0.8D);
            }
            if (var2 == 3) {
                Statics.method4662(0.7D);
            }
            if (var2 == 4) {
                Statics.method4662(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method423(255);
            }
            if (var2 == 1) {
                method423(192);
            }
            if (var2 == 2) {
                method423(128);
            }
            if (var2 == 3) {
                method423(64);
            }
            if (var2 == 4) {
                method423(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2489(127);
            }
            if (var2 == 1) {
                method2489(96);
            }
            if (var2 == 2) {
                method2489(64);
            }
            if (var2 == 3) {
                method2489(32);
            }
            if (var2 == 4) {
                method2489(0);
            }
        }
        if (var1 == 5) {
            field626 = var2;
        }
        if (var1 == 6) {
            field653 = var2;
        }
        if (var1 == 9) {
            field656 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method1043(127);
            }
            if (var2 == 1) {
                method1043(96);
            }
            if (var2 == 2) {
                method1043(64);
            }
            if (var2 == 3) {
                method1043(32);
            }
            if (var2 == 4) {
                method1043(0);
            }
        }
        if (var1 == 17) {
            field482 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class94[] var3 = new class94[] { class94.field1235, class94.field1239, class94.field1234, class94.field1237, class94.field1238 };
            field605 = (class94) class304.method2484(var3, var2);
            if (field605 == null) {
                field605 = class94.field1239;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field618 = -1;
            } else {
                field618 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class94[] var4 = new class94[] { class94.field1235, class94.field1239, class94.field1234, class94.field1237, class94.field1238 };
        field511 = (class94) class304.method2484(var4, var2);
        if (field511 == null) {
            field511 = class94.field1239;
        }
    }

    @ObfuscatedName("i.jz(Ljt;B)V")
    public static final void method81(class262 arg0) {
        int var1 = arg0.field3113;
        if (var1 == 324) {
            if (field759 == -1) {
                field759 = arg0.field3040;
                field760 = arg0.field3084;
            }
            if (field758.field3018) {
                arg0.field3040 = field759;
            } else {
                arg0.field3040 = field760;
            }
        } else if (var1 == 325) {
            if (field759 == -1) {
                field759 = arg0.field3040;
                field760 = arg0.field3084;
            }
            if (field758.field3018) {
                arg0.field3040 = field760;
            } else {
                arg0.field3040 = field759;
            }
        } else if (var1 == 327) {
            arg0.field3099 = 150;
            arg0.field3069 = (int) (Math.sin((double) field494 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3091 = 5;
            arg0.field3178 = 0;
        } else if (var1 == 328) {
            arg0.field3099 = 150;
            arg0.field3069 = (int) (Math.sin((double) field494 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3091 = 5;
            arg0.field3178 = 1;
        }
    }

    @ObfuscatedName("fc.jw(I)V")
    public static final void method3188() {
        class242 var0 = class242.method2075(class240.field2670, field639.field1287);
        field639.method2246(var0);
        for (class80 var1 = (class80) field652.method6062(); var1 != null; var1 = (class80) field652.method6060()) {
            if (var1.field1035 == 0 || var1.field1035 == 3) {
                method3192(var1, true);
            }
        }
        if (field657 != null) {
            method204(field657);
            field657 = null;
        }
    }

    @ObfuscatedName("m.jj(IIII)Lct;")
    public static final class80 method20(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1034 = arg1;
        var3.field1035 = arg2;
        field652.method6065(var3, (long) arg0);
        method261(arg1);
        class262 var4 = class262.method2058(arg0);
        method204(var4);
        if (field657 != null) {
            method204(field657);
            field657 = null;
        }
        method2498();
        method2566(Statics.field3153[arg0 >> 16], var4, false);
        class64.method3643(arg1);
        if (field718 != -1) {
            method1967(field718, 1);
        }
        return var3;
    }

    @ObfuscatedName("fc.js(Lct;ZS)V")
    public static final void method3192(class80 arg0, boolean arg1) {
        int var2 = arg0.field1034;
        int var3 = (int) arg0.field4075;
        arg0.method5775();
        if (arg1 && var2 != -1 && Statics.field1690[var2]) {
            Statics.field3171.method4768(var2);
            if (Statics.field3153[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field3153[var2].length; var5++) {
                    if (Statics.field3153[var2][var5] != null) {
                        if (Statics.field3153[var2][var5].field3146 == 2) {
                            var4 = false;
                        } else {
                            Statics.field3153[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field3153[var2] = null;
                }
                Statics.field1690[var2] = false;
            }
        }
        for (class369 var6 = (class369) field487.method6062(); var6 != null; var6 = (class369) field487.method6060()) {
            if ((long) var2 == (var6.field4075 >> 48 & 0xFFFFL)) {
                var6.method5775();
            }
        }
        class262 var7 = class262.method2058(var3);
        if (var7 != null) {
            method204(var7);
        }
        method2498();
        if (field718 != -1) {
            method1967(field718, 1);
        }
    }

    @ObfuscatedName("iu.jy(Ljt;B)Z")
    public static final boolean method4252(class262 arg0) {
        int var1 = arg0.field3113;
        if (var1 == 205) {
            field644 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field758.method4527(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field758.method4518(var4, var5 == 1);
        }
        if (var1 == 324) {
            field758.method4515(false);
        }
        if (var1 == 325) {
            field758.method4515(true);
        }
        if (var1 == 326) {
            class242 var6 = class242.method2075(class240.field2676, field639.field1287);
            field758.method4520(var6.field2780);
            field639.method2246(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("df.jm(Ljt;IIIB)V")
    public static final void method2373(class262 arg0, int arg1, int arg2, int arg3) {
        method5739();
        class256 var4 = arg0.method4557(false);
        if (var4 == null) {
            return;
        }
        class410.method6573(arg1, arg2, var4.field3000 + arg1, var4.field3001 + arg2);
        if (field730 == 2 || field730 == 5) {
            class410.method6574(arg1, arg2, 0, var4.field3003, var4.field3002);
        } else {
            int var5 = field561 & 0x7FF;
            int var6 = Statics.field868.field1140 / 32 + 48;
            int var7 = 464 - Statics.field868.field1124 / 32;
            Statics.field62.method6676(arg1, arg2, var4.field3000, var4.field3001, var6, var7, var5, 256, var4.field3003, var4.field3002);
            for (int var8 = 0; var8 < field724; var8++) {
                int var9 = field725[var8] * 4 + 2 - Statics.field868.field1140 / 32;
                int var10 = field726[var8] * 4 + 2 - Statics.field868.field1124 / 32;
                method4678(arg1, arg2, var9, var10, field542[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class309 var13 = field619[Statics.field2592][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field868.field1140 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field868.field1124 / 32;
                        method4678(arg1, arg2, var14, var15, Statics.field1407[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field513; var16++) {
                class91 var17 = field532[field534[var16]];
                if (var17 != null && var17.method1999()) {
                    class161 var18 = var17.field1219;
                    if (var18 != null && var18.field1738 != null) {
                        var18 = var18.method2771();
                    }
                    if (var18 != null && var18.field1732 && var18.field1744) {
                        int var19 = var17.field1140 / 32 - Statics.field868.field1140 / 32;
                        int var20 = var17.field1124 / 32 - Statics.field868.field1124 / 32;
                        method4678(arg1, arg2, var19, var20, Statics.field1407[1], var4);
                    }
                }
            }
            int var21 = class96.field1251;
            int[] var22 = class96.field1252;
            for (int var23 = 0; var23 < var21; var23++) {
                class83 var24 = field642[var22[var23]];
                if (var24 != null && var24.method1999() && !var24.field1082 && Statics.field868 != var24) {
                    int var25 = var24.field1140 / 32 - Statics.field868.field1140 / 32;
                    int var26 = var24.field1124 / 32 - Statics.field868.field1124 / 32;
                    if (var24.method1990()) {
                        method4678(arg1, arg2, var25, var26, Statics.field1407[3], var4);
                    } else if (Statics.field868.field1081 != 0 && var24.field1081 != 0 && Statics.field868.field1081 == var24.field1081) {
                        method4678(arg1, arg2, var25, var26, Statics.field1407[4], var4);
                    } else if (var24.method1993()) {
                        method4678(arg1, arg2, var25, var26, Statics.field1407[5], var4);
                    } else if (var24.method2007()) {
                        method4678(arg1, arg2, var25, var26, Statics.field1407[6], var4);
                    } else {
                        method4678(arg1, arg2, var25, var26, Statics.field1407[2], var4);
                    }
                }
            }
            if (field577 != 0 && field494 % 20 < 10) {
                if (field577 == 1 && field733 >= 0 && field733 < field532.length) {
                    class91 var27 = field532[field733];
                    if (var27 != null) {
                        int var28 = var27.field1140 / 32 - Statics.field868.field1140 / 32;
                        int var29 = var27.field1124 / 32 - Statics.field868.field1124 / 32;
                        Statics.method4658(arg1, arg2, var28, var29, Statics.field774[1], var4);
                    }
                }
                if (field577 == 2) {
                    int var30 = field505 * 4 - Statics.field2131 * 4 + 2 - Statics.field868.field1140 / 32;
                    int var31 = field506 * 4 - Statics.field3028 * 4 + 2 - Statics.field868.field1124 / 32;
                    Statics.method4658(arg1, arg2, var30, var31, Statics.field774[1], var4);
                }
                if (field577 == 10 && field504 >= 0 && field504 < field642.length) {
                    class83 var32 = field642[field504];
                    if (var32 != null) {
                        int var33 = var32.field1140 / 32 - Statics.field868.field1140 / 32;
                        int var34 = var32.field1124 / 32 - Statics.field868.field1124 / 32;
                        Statics.method4658(arg1, arg2, var33, var34, Statics.field774[1], var4);
                    }
                }
            }
            if (field607 != 0) {
                int var35 = field607 * 4 + 2 - Statics.field868.field1140 / 32;
                int var36 = field729 * 4 + 2 - Statics.field868.field1124 / 32;
                method4678(arg1, arg2, var35, var36, Statics.field774[0], var4);
            }
            if (!Statics.field868.field1082) {
                class410.method6595(var4.field3000 / 2 + arg1 - 1, var4.field3001 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field702[arg3] = true;
    }

    @ObfuscatedName("jb.jd(Ljt;IIII)V")
    public static final void method4666(class262 arg0, int arg1, int arg2, int arg3) {
        class256 var4 = arg0.method4557(false);
        if (var4 == null) {
            return;
        }
        if (field730 < 3) {
            Statics.field8.method6676(arg1, arg2, var4.field3000, var4.field3001, 25, 25, field561, 256, var4.field3003, var4.field3002);
        } else {
            class410.method6574(arg1, arg2, 0, var4.field3003, var4.field3002);
        }
    }

    @ObfuscatedName("jz.ks(IIIILon;Liw;B)V")
    public static final void method4678(int arg0, int arg1, int arg2, int arg3, class414 arg4, class256 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field561 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class211.field2371[var6];
        int var9 = class211.field2359[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6675(arg5.field3000 / 2 + var10 - arg4.field4386 / 2, arg5.field3001 / 2 - var11 - arg4.field4391 / 2, arg0, arg1, arg5.field3000, arg5.field3001, arg5.field3003, arg5.field3002);
        } else {
            arg4.method6659(arg5.field3000 / 2 + arg0 + var10 - arg4.field4386 / 2, arg5.field3001 / 2 + arg1 - var11 - arg4.field4391 / 2);
        }
    }

    @ObfuscatedName("gn.ky(I)V")
    public static final void method3647() {
        for (int var0 = 0; var0 < class96.field1251; var0++) {
            class83 var1 = field642[class96.field1252[var0]];
            var1.method1991();
        }
        Iterator var2 = class98.field1281.iterator();
        while (var2.hasNext()) {
            class58 var3 = (class58) var2.next();
            var3.method1010();
        }
        if (Statics.field3205 != null) {
            Statics.field3205.method5474();
        }
    }

    @ObfuscatedName("hm.kr(B)V")
    public static final void method4182() {
        Iterator var0 = class98.field1281.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1013();
        }
        if (Statics.field3205 != null) {
            Statics.field3205.method5461();
        }
    }

    @ObfuscatedName("ir.kl(I)V")
    public static final void method4272() {
        for (int var0 = 0; var0 < class96.field1251; var0++) {
            class83 var1 = field642[class96.field1252[var0]];
            var1.method2034();
        }
    }

    @ObfuscatedName("fs.kb(B)V")
    public static final void method2733() {
        field686 = field689;
    }

    @ObfuscatedName("ky.kg(S)V")
    public static final void method4724() {
        field687 = field689;
        Statics.field2143 = true;
    }

    @ObfuscatedName("kl.kk(B)V")
    public static final void method4851() {
        field688 = field689;
        Statics.field1666 = true;
    }

    @ObfuscatedName("ac.kq(Ljava/lang/String;I)V")
    public static final void method736(String arg0) {
        if (Statics.field3205 != null) {
            class242 var1 = class242.method2075(class240.field2714, field639.field1287);
            var1.field2780.method6269(class401.method2370(arg0));
            var1.field2780.method6489(arg0);
            field639.method2246(var1);
        }
    }

    @ObfuscatedName("kk.ki(B)V")
    public static final void method4888() {
        class242 var0 = class242.method2075(class240.field2661, field639.field1287);
        var0.field2780.method6269(0);
        field639.method2246(var0);
    }

    @ObfuscatedName("jv.kx(III)V")
    public static final void method4670(int arg0, int arg1) {
        class137 var2 = arg0 >= 0 ? field722[arg0] : Statics.field3746;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2516()) {
            return;
        }
        class119 var3 = (class119) var2.field1514.get(arg1);
        if (var3.field1394 != -1) {
            return;
        }
        String var4 = var3.field1392.method6815();
        class99 var5 = field639;
        class242 var6 = class242.method2075(class240.field2695, var5.field1287);
        var6.field2780.method6269(3 + class401.method2370(var4));
        var6.field2780.method6269(arg0);
        var6.field2780.method6256(arg1);
        var6.field2780.method6489(var4);
        var5.method2246(var6);
    }

    @ObfuscatedName("cc.kd(III)V")
    public static final void method2268(int arg0, int arg1) {
        if (field722[arg0] == null || arg1 < 0 || arg1 >= field722[arg0].method2516()) {
            return;
        }
        class119 var2 = (class119) field722[arg0].field1514.get(arg1);
        if (var2.field1394 != -1) {
            return;
        }
        class99 var3 = field639;
        class242 var4 = class242.method2075(class240.field2716, var3.field1287);
        var4.field2780.method6269(3 + class401.method2370(var2.field1392.method6815()));
        var4.field2780.method6269(arg0);
        var4.field2780.method6256(arg1);
        var4.field2780.method6489(var2.field1392.method6815());
        var3.method2246(var4);
    }

    @ObfuscatedName("dy.kp(IIZB)V")
    public static final void method2360(int arg0, int arg1, boolean arg2) {
        if (field722[arg0] == null || arg1 < 0 || arg1 >= field722[arg0].method2516()) {
            return;
        }
        class119 var3 = (class119) field722[arg0].field1514.get(arg1);
        class99 var4 = field639;
        class242 var5 = class242.method2075(class240.field2697, var4.field1287);
        var5.field2780.method6269(4 + class401.method2370(var3.field1392.method6815()));
        var5.field2780.method6269(arg0);
        var5.field2780.method6256(arg1);
        var5.field2780.method6343(arg2);
        var5.field2780.method6489(var3.field1392.method6815());
        var4.method2246(var5);
    }

    @ObfuscatedName("fx.kc(Ljt;I)I")
    public static int method3375(class262 arg0) {
        class369 var1 = (class369) field487.method6061(((long) arg0.field3048 << 32) + (long) arg0.field3185);
        return var1 == null ? arg0.field3121 : var1.field4074;
    }

    @ObfuscatedName("bm.kj(Ljt;B)Z")
    public static boolean method1641(class262 arg0) {
        return arg0.field3192;
    }

    @ObfuscatedName("kx.kh(Ljt;II)Ljava/lang/String;")
    public static String method4911(class262 arg0, int arg1) {
        if (!class263.method2538(method3375(arg0), arg1) && arg0.field3154 == null) {
            return null;
        } else if (arg0.field3128 == null || arg0.field3128.length <= arg1 || arg0.field3128[arg1] == null || arg0.field3128[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3128[arg1];
        }
    }

    @ObfuscatedName("ay.ku(Ljt;I)Ljava/lang/String;")
    public static String method571(class262 arg0) {
        if (class263.method1729(method3375(arg0)) == 0) {
            return null;
        } else if (arg0.field3133 == null || arg0.field3133.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3133;
        }
    }

    @ObfuscatedName("fn.kv(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2913(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field485 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field485 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field485 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field485 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field485 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1010 != null) {
            var3 = "/p=" + Statics.field1010;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field438 + "/a=" + Statics.field143 + var3 + "/";
    }

    @ObfuscatedName("ki.kn(Ljava/lang/String;I)V")
    public static void method4908(String arg0) {
        Statics.field1010 = arg0;
        try {
            String var1 = Statics.field107.getParameter(Integer.toString(18));
            String var2 = Statics.field107.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class267.method2331(class398.method2299() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class28.method398(Statics.field107, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("gg.kw(Ljava/lang/String;ZI)V")
    public static void method3642(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field96; var5++) {
            class170 var6 = class170.method2099(var5);
            if ((!arg1 || var6.field1927) && var6.field1919 == -1 && var6.field1876.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2227 = -1;
                    Statics.field1874 = null;
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
        Statics.field1874 = var3;
        Statics.field839 = 0;
        Statics.field2227 = var4;
        String[] var9 = new String[Statics.field2227];
        for (int var10 = 0; var10 < Statics.field2227; var10++) {
            var9[var10] = class170.method2099(var3[var10]).field1876;
        }
        short[] var11 = Statics.field1874;
        class396.method4685(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("dv.ke(Lot;II)V")
    public static void method2393(class401 arg0, int arg1) {
        byte[] var2 = arg0.field4294;
        if (field530 == null) {
            field530 = new byte[24];
        }
        class322.method5377(var2, arg1, field530, 0, 24);
        class144.method5710(arg0, arg1);
    }

    @ObfuscatedName("client.kz(B)Lpm;")
    public class422 method1216() {
        return Statics.field868 == null ? null : Statics.field868.field1067;
    }

    @ObfuscatedName("co.kf(IIIZB)V")
    public static void method2279(int arg0, int arg1, int arg2, boolean arg3) {
        class242 var4 = class242.method2075(class240.field2751, field639.field1287);
        var4.field2780.method6402(arg2);
        var4.field2780.method6258(arg3 ? field573 : 0);
        var4.field2780.method6307(arg1);
        var4.field2780.method6307(arg0);
        field639.method2246(var4);
    }

    @ObfuscatedName("la.ka(IB)V")
    public static void method5400(int arg0) {
        field753 = arg0;
    }

    @ObfuscatedName("em.kt(I)V")
    public static void method2709() {
        field639.method2246(class242.method2075(class240.field2698, field639.field1287));
        field753 = 0;
    }

    @ObfuscatedName("cs.km(I)V")
    public static void method2125() {
        if (field753 == 1) {
            field574 = true;
        }
    }

    @ObfuscatedName("kp.le(I)V")
    public static void method4948() {
        if (!field574 || Statics.field868 == null) {
            return;
        }
        int var0 = Statics.field868.field1162[0];
        int var1 = Statics.field868.field1163[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1491 = Statics.field868.field1140;
        int var2 = method4391(Statics.field868.field1140, Statics.field868.field1124, Statics.field2592) - field697;
        if (var2 < Statics.field2187) {
            Statics.field2187 = var2;
        }
        Statics.field1195 = Statics.field868.field1124;
        field574 = false;
    }

    @ObfuscatedName("ma.lh(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method5711(String arg0) {
        class285[] var1 = class285.method277();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class285 var3 = var1[var2];
            if (var3.field3665 != -1 && arg0.startsWith(class92.method1003(var3.field3665))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3665).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("x.lt(B)V")
    public static void method259() {
        if (Statics.field3166 == null) {
            return;
        }
        field764 = field494;
        Statics.field3166.method4960();
        for (int var0 = 0; var0 < field642.length; var0++) {
            if (field642[var0] != null) {
                Statics.field3166.method4959((field642[var0].field1140 >> 7) + Statics.field2131, (field642[var0].field1124 >> 7) + Statics.field3028);
            }
        }
    }

    @ObfuscatedName("g.lq(S)Z")
    public static boolean method152() {
        return Statics.field3227.field1210 >= field525;
    }

    @ObfuscatedName("em.ly(B)V")
    public static void method2706() {
        Statics.field3227.field1210 = field525;
        class89.method1005();
    }

    @ObfuscatedName("fy.lc(IB)V")
    public static void method3163(int arg0) {
        if (field516 != arg0) {
            field516 = arg0;
        }
    }
}
